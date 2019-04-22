/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityImpl extends RelationshipImpl implements Multiplicity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLower() {
		Expression lower = basicGetLower();
		return lower != null && lower.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)lower) : lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetLower() {
		EList<Expression> expressions = getOwnedRelatedElement(Expression.class);
		int n = expressions.size();
		return n < 2? null: expressions.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setLower(Expression newLower) {
		// TODO: implement this method to set the 'Lower' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUpper() {
		Expression upper = basicGetUpper();
		return upper != null && upper.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)upper) : upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetUpper() {
		EList<Expression> expressions = getOwnedRelatedElement(Expression.class);
		int n = expressions.size();
		return n == 0? null: n == 1? expressions.get(0): expressions.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setUpper(Expression newUpper) {
		// TODO: implement this method to set the 'Upper' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureWithMultiplicity() {
		Feature featureWithMultiplicity = basicGetFeatureWithMultiplicity();
		return featureWithMultiplicity != null && featureWithMultiplicity.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)featureWithMultiplicity) : featureWithMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetFeatureWithMultiplicity() {
		return getOwningRelatedElement(Feature.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFeatureWithMultiplicity(Feature newFeatureWithMultiplicity) {
		// TODO: implement this method to set the 'Feature With Multiplicity' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureWithMultiplicity() {
		return basicGetFeatureWithMultiplicity() != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Feature featureWithMultiplicity = getFeatureWithMultiplicity();
		if (featureWithMultiplicity != null) {
			source.add(featureWithMultiplicity);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__SOURCE, source.size(), source.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

	@Override
	public EList<Element> getTarget() {
		EList<Element> target = super.getTarget();
		Expression upper = getUpper();
		if (upper != null) {
			target.add(upper);
		}
		Expression lower = getLower();
		if (lower != null) {
			target.add(lower);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__LOWER:
				if (resolve) return getLower();
				return basicGetLower();
			case SysMLPackage.MULTIPLICITY__UPPER:
				if (resolve) return getUpper();
				return basicGetUpper();
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				if (resolve) return getFeatureWithMultiplicity();
				return basicGetFeatureWithMultiplicity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__LOWER:
				setLower((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER:
				setUpper((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				setFeatureWithMultiplicity((Feature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__LOWER:
				setLower((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER:
				setUpper((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				setFeatureWithMultiplicity((Feature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.MULTIPLICITY__SOURCE:
				return isSetSource();
			case SysMLPackage.MULTIPLICITY__LOWER:
				return basicGetLower() != null;
			case SysMLPackage.MULTIPLICITY__UPPER:
				return basicGetUpper() != null;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return isSetFeatureWithMultiplicity();
		}
		return super.eIsSet(featureID);
	}

} //MultiplicityImpl
