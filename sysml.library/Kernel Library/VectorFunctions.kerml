/**
 * This package defines abstract functions on VectorValues corresponding to the algebraic operations
 * provided by a vector space with inner product. It also includes concrete implementations of these
 * functions specifically for CartesianVectorValues.
 */
package VectorFunctions {
	private import ScalarValues::NumericalValue;
	private import ScalarValues::Positive;
	private import ScalarValues::Real;
	private import ScalarValues::Boolean;
	private import NumericalFunctions::*;
	private import RealFunctions::sqrt;
	private import TrigFunctions::arccos;
	private import SequenceFunctions::size;
	private import ControlFunctions::*;
	
	import VectorValues::*;
	
	/* Generic arithmetic functions for all VectorValues. */
	
	/**
	 * Return whether a VectorValue is a zero vector.
	 */
	abstract function isZeroVector { in v: VectorValue[1]; return : Boolean[1]; }
	
	/**
	 * With two arguments, returns the sum of two VectorValues. With one argument, returns that VectorValue.
	 */
	abstract function '+' specializes DataFunctions::'+' { in v: VectorValue[1]; in w: VectorValue[0..1]; 
		return u: VectorValue[1];
		inv zeroAddition { w == null or isZeroVector(w) implies u == w }
		inv commutivity { w != null implies u == w + v }
	}
	
	/**
	 * With two arguments, returns the difference of two VectorValues. With one arguments, returns the inverse
	 * of the given VectorValue, that is, the VectorValue that, when added to the original VectorValue, results in
	 * the zeroVector.
	 */
	abstract function '-' specializes DataFunctions::'-' { in v: VectorValue[1]; in w: VectorValue[0..1]; 
		return u: VectorValue[1];
		inv negation { w == null implies isZeroVector(v + u) }
		inv difference { w != null implies v + u == w }
	}
	
	/**
	 * Return the sum of a collection of VectorValues. If the collection is empty, return a given zero vector.
	 */
	abstract function sum0 { in coll: VectorValue[*] nonunique; in zero: VectorValue[1]; 
		inv precondition { isZeroVector(zero) }
		return s: VectorValue[1] = coll->reduce '+' ?? zero;
	}

	/* Functions specific to NumericalVectorValues. */
	
	/**
	 * Construct a NumericalVectorValue whose elements are a non-empty list of component NumericalValues.
	 * The dimension of the NumericalVectorValue is equal to the number of components.
	 */
	function VectorOf { in components: NumericalValue[1..*] ordered nonunique; 
		return : NumericalVectorValue[1] {
			:>> dimension = size(components);
			:>> elements = components;
		}
	}
	
	/**
	 * Scalar product of a NumericalValue and a NumericalVectorValue.
	 */
	abstract function scalarVectorMult specializes DataFunctions::'*' { in x: NumericalValue[1]; in v: NumericalVectorValue[1];
		return w: NumericalVectorValue[1];
		inv scaling { norm(w) == x * norm(v) }
		inv zeroLength { isZeroVector(w) implies isZero(norm(w))}
	}
	alias '*' for scalarVectorMult;
	
	/**
	 * Scalar product of a NumericalVectorValue and a NumericalValue, which has the same value as the scalar product of the
	 * NumericalValue and the NumericalVectorValue.
	 */
	abstract function vectorScalarMult specializes DataFunctions::'*' { in v: NumericalVectorValue[1]; in x: NumericalValue[1];
		return w: NumericalVectorValue[1];
		scalarVectorMult(x, v)
	}
	
	/**
	 * Scalar quotient of a NumericalVectorValue and a NumericalValue, defined as the scalar product of the inverse of the 
	 * NumericalValue and the NumericalVectorValue.
	 */
	abstract function vectorScalarDiv specializes DataFunctions::'/' { in v: NumericalVectorValue[1]; in x: NumericalValue[1];
		return w: NumericalVectorValue[1] = scalarVectorMult(1.0 / x, v);
	}

	/**
	 * Inner product of two NumericalVectorValues.
	 */
	abstract function inner specializes DataFunctions::'*' { in v: NumericalVectorValue[1]; in w: NumericalVectorValue[1];
		return x: NumericalValue[1];
		inv commmutivity { x == inner(w, v) }
		inv zeroInner { isZeroVector(v) or isZeroVector(w) implies isZero(x)}
	}
	
	/**
	 * The norm (magnitude) of a NumericalVectorValue, as a NumericalValue.
	 */
	abstract function norm { in v: NumericalVectorValue[1]; 
		return l : NumericalValue[1];
		inv squareNorm { l * l == inner(v,v) }
		inv lengthZero { isZero(l) == isZeroVector(v) }
	}
	
	/**
	 * The angle between two NumericalVectorValues, as a NumericalValue.
	 */
	abstract function angle { in v: NumericalVectorValue[1]; in w: NumericalVectorValue[1]; 
		return theta: NumericalValue[1];
		inv commutivity { theta == angle(w, v) }
		inv lengthInsensitive { theta == angle(w / norm(w), v / norm(v)) }
	}
	
	/* Specialized functions with concrete definitions for CartesianVectorValues. */
	
	/**
	 * Construct a CartesianVectorValue whose elements are a non-empty list of Real components.
	 * The dimension of the NumericalVectorValue is equal to the number of components.
	 */
	function CartesianVectorOf { in components: Real[*]; 
		return : CartesianVectorValue[1] {
			:>> dimension = size(components);
			:>> elements = components;
		}
	}
	function CartesianThreeVectorOf specializes CartesianVectorOf { in components: Real[3];
		return : CartesianThreeVectorValue[1];
	}
	
	/**
	 * Cartesian zero vectors of 1, 2 and 3 dimensions.
	 */
	feature cartesianZeroVector: CartesianVectorValue[3] =
		(
			CartesianVectorOf(0.0),
			CartesianVectorOf((0.0, 0.0)),
			CartesianThreeVectorOf((0.0, 0.0, 0.0))
		);
	feature cartesian3DZeroVector: CartesianThreeVectorValue[1] =
		cartesianZeroVector[3];
	
	/**
	 * A CartesianVectorValue is a zero vector if all its elements are zero.
	 */
	function isCartesianZeroVector specializes isZeroVector { in v: CartesianVectorValue[1]; 
		return : Boolean[1] = v.elements->forAll{in x; x == 0.0};
	}
	
	function 'cartesian+' specializes '+'{ in v: CartesianVectorValue[1]; in w: CartesianVectorValue[0..1];
		inv precondition { w != null implies v.dimension == w.dimension }
		return u: CartesianVectorValue[1] =
			if w == null? v
			else CartesianVectorOf(
				(1..w.dimension)->collect{in i : Positive; v[i] + w[i]}
			);
	}
	
	function 'cartesian-' specializes '-' { in v: CartesianVectorValue[1]; in w: CartesianVectorValue[0..1];
		inv precondition { w != null implies v.dimension == w.dimension }
		return u: CartesianVectorValue[1] =
			CartesianVectorOf(
				if w == null? CartesianVectorOf(v.elements->collect{in x : Real; -x})
				else CartesianVectorOf(
					(1..v.dimension)->collect{in i : Positive; v[i] - w[i]}
				)
			);
	}
	
	function cartesianScalarVectorMult specializes scalarVectorMult { in x: Real[1]; in v: CartesianVectorValue[1];
		return w: CartesianVectorValue[1] =
			CartesianVectorOf(
				v.elements->collect{in y : Real; x * y}
			);
	}
	function cartesianVectorScalarMult specializes vectorScalarMult { in v: CartesianVectorValue[1]; in x: Real[1]; 
		return w: CartesianVectorValue[1] = cartesianScalarVectorMult(x, v);
	}
	
	function cartesianInner specializes inner { in v: CartesianVectorValue[1]; in w : CartesianVectorValue[1];
		inv precondition { v.dimension == w.dimension }
		return x: Real[1] =
			(1..v.dimension)->collect{in i : Positive; v[i] * w[i]}->reduce RealFunctions::'+';
	}
	
	function cartesianNorm specializes norm { in v: CartesianVectorValue[1];
		return l : NumericalValue[1] = sqrt(cartesianInner(v, v));
	}
	
	function cartesianAngle specializes angle { in v: CartesianVectorValue[1]; in w: CartesianVectorValue[1];
		inv precondition { v.dimension == w.dimension }
		return theta: Real[1] = arccos(cartesianInner(v, w) / (norm(v) * norm(w)));
	}
	
	function sum { in coll: CartesianThreeVectorValue[*];
		return : CartesianThreeVectorValue[1] = sum0(coll, cartesian3DZeroVector);
	}
	
}