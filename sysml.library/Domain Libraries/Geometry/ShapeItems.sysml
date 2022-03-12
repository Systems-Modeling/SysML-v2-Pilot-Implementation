package ShapeItems {
	private import ScalarValues::String;
	private import ScalarValues::Boolean;
	private import UnitsAndScales::CoordinateTransformation;
	private import ISQ::*;
	private import SI::*;
	private import Collections::KeyValuePair;
	private import Collections::Map;
	private import Objects::*;
	private import Items::*;
	private import SequenceFunctions::union;
	private import CollectionFunctions::contains;
	private import SequenceFunctions::isEmpty;
	connection def WithinBoth :> Occurrences::WithinBoth { }
	
	/**
	 * Most general shape.	Solids are objects with these as space boundary.	
	 */
	abstract item def Shell :> Item, StructuredSpaceObject, Surface	 {
	}

	/**
	* Straight line.
	*/
	item def Line :> Curve {
		attribute :>> length;

		attribute :>> outerSpaceDimension = 1;
	}

	/**
	 * Flat surface.
	 */
	item def PlanarSurface :> Surface {
		attribute :>> area;
		attribute :>> outerSpaceDimension = 2;
	}

	item def Circle :> Shell {
		attribute radius :>> radius;

		item :>> faces [0];
		item :>> edges [1] {
			attribute circumference :>> length = Circle::radius * 3.1415926535898;
			item :>> shape : Item [0];
			item :>> vertices [0];
		}
		item :>> vertices [0];
	}

	/**
	 * Surface bounded by a circle.
	 */
	item def Disc :> Shell {
		attribute radius :>> radius;

		item :>> shape : Circle [1]
			{  attribute :>> radius = Disc::radius; }

		item :>> faces : PlanarSurface [1] {
			item :>> edges [1]; }
		item :>> edges : Circle [1] = shape;
		item :>> vertices [0];

		connection :WithinBoth connect faces.edges [1] to edges [0..*];
	}

	item def Sphere :> Shell {
		attribute :>> radius;

		item faces : Surface [1] :>> faces;
		item :>> edges [0];
		item :>> vertices [0];
	}

	/**
	 * Right circular cylinder.
	 */
	item def Cylinder :> Cone {
		attribute :>> radius = baseRadius;

		attribute :>> baseRadius = apexRadius;
	}

	/**
	 * Right circular cylinder, possibly truncated.
	 */
	item def Cone :> Shell {
		attribute baseRadius :> radius;
		attribute apexRadius :> radius default 0 [m];
		attribute :>> height;
		attribute isTruncated : Boolean [1] = (apexRadius > 0);

		item faces : Surface [2..3] :>> faces;
		item bf : Disc [1] subsets faces;
		item af : Disc [0..1] subsets faces;
		item cf : Surface [1] subsets faces;
		constraint { (apexRadius == 0) == isEmpty(af) }

		item edges : Circle [1..2] :>> edges;
		item be [1] subsets edges { attribute :>> radius = baseRadius; }
		item ae [0..1] subsets edges { attribute :>> radius = apexRadius; }
		constraint { isEmpty(af) == isEmpty(ae) }

		item vertices : Point [0..1] :>> vertices;
		constraint { isEmpty(ae) == isEmpty(vertices) }

		  /* Faces to edges */
		connection :WithinBoth connect bf.edges [1] to be [0..*];
		connection :WithinBoth connect af.edges [1] to ae [0..*];
		connection :WithinBoth connect cf.edges [1] to be [0..*];
		connection :WithinBoth connect cf.edges [1] to ae [0..*];

		  /* Faces to vertices */
		connection :WithinBoth connect cf.vertices [1] to vertices [0..*];

		  /* Coincident edges */
		connection :WithinBoth connect be [2] to be [2];
		connection :WithinBoth connect ae [2] to ae [2];

	}

	/**
	 * Six-sided polyhedron with rectangular sides.
	 */
	item def Cuboid :> Shell {
		attribute :>> length;
		attribute :>> width;
		attribute :>> height;

		item faces : PlanarSurface [6] :>> faces {
			item :>> edges [4]; }
		item tf subsets faces [1];
		item bf subsets faces [1];
		item ff subsets faces [1];
		item rf subsets faces [1];
		item slf subsets faces [1];
		item srf subsets faces [1];

		item edges : Line [12] :>> edges {
			item :>> vertices [2]; }
		item tfe [2]  subsets edges { attribute :>> length = Cuboid::length; }
		item tre [2]  subsets edges { attribute :>> length = Cuboid::length; }
		item tsle [2] subsets edges { attribute :>> length = Cuboid::width; }
		item tsre [2] subsets edges { attribute :>> length = Cuboid::width; }
		item bfe [2]  subsets edges { attribute :>> length = Cuboid::length; }
		item bre [2]  subsets edges { attribute :>> length = Cuboid::length; }
		item bsle [2] subsets edges { attribute :>> length = Cuboid::width; }
		item bsre [2] subsets edges { attribute :>> length = Cuboid::width; }
		item ufle [2] subsets edges { attribute :>> length = Cuboid::height; }
		item ufre [2] subsets edges { attribute :>> length = Cuboid::height; }
		item urle [2] subsets edges { attribute :>> length = Cuboid::height; }
		item urre [2] subsets edges { attribute :>> length = Cuboid::height; }

		item vertices : Point [8] :>> vertices;
		item tflv [3] subsets vertices;
		item tfrv [3] subsets vertices;
		item trlv [3] subsets vertices;
		item trrv [3] subsets vertices;
		item bflv [3] subsets vertices;
		item bfrv [3] subsets vertices;
		item brlv [3] subsets vertices;
		item brrv [3] subsets vertices;
		
		  /* Faces to edges */
		connection :WithinBoth connect tf.edges [1] to tfe [0..*];
		connection :WithinBoth connect tf.edges [1] to tre [0..*];
		connection :WithinBoth connect tf.edges [1] to tsle [0..*];
		connection :WithinBoth connect tf.edges [1] to tsre [0..*];

		connection :WithinBoth connect bf.edges [1] to bfe [0..*];
		connection :WithinBoth connect bf.edges [1] to bre [0..*];
		connection :WithinBoth connect bf.edges [1] to bsle [0..*];
		connection :WithinBoth connect bf.edges [1] to bsre [0..*];

		connection :WithinBoth connect ff.edges [1] to tfe [0..*];
		connection :WithinBoth connect ff.edges [1] to bfe [0..*];
		connection :WithinBoth connect ff.edges [1] to ufle [0..*];
		connection :WithinBoth connect ff.edges [1] to ufre [0..*];

		connection :WithinBoth connect rf.edges [1] to tre [0..*];
		connection :WithinBoth connect rf.edges [1] to bre [0..*];
		connection :WithinBoth connect rf.edges [1] to urle [0..*];
		connection :WithinBoth connect rf.edges [1] to urre [0..*];

		connection :WithinBoth connect slf.edges [1] to tsle [0..*];
		connection :WithinBoth connect slf.edges [1] to bsle [0..*];
		connection :WithinBoth connect slf.edges [1] to ufle [0..*];
		connection :WithinBoth connect slf.edges [1] to urle [0..*];

		connection :WithinBoth connect srf.edges [1] to tsre [0..*];
		connection :WithinBoth connect srf.edges [1] to bsre [0..*];
		connection :WithinBoth connect srf.edges [1] to ufre [0..*];
		connection :WithinBoth connect srf.edges [1] to urre [0..*];
		
		  /* Edges to vertices */
		connection :WithinBoth connect tfe.vertices [1] to tflv [0..*];
		connection :WithinBoth connect tfe.vertices [1] to tfrv [0..*];
		connection :WithinBoth connect tre.vertices [1] to trlv [0..*];
		connection :WithinBoth connect tre.vertices [1] to trrv [0..*];
		connection :WithinBoth connect tsle.vertices [1] to tflv [0..*];
		connection :WithinBoth connect tsle.vertices [1] to trlv [0..*];
		connection :WithinBoth connect tsre.vertices [1] to tfrv [0..*];
		connection :WithinBoth connect tsre.vertices [1] to trrv [0..*];

		connection :WithinBoth connect bfe.vertices [1] to bflv [0..*];
		connection :WithinBoth connect bfe.vertices [1] to bfrv [0..*];
		connection :WithinBoth connect bre.vertices [1] to brlv [0..*];
		connection :WithinBoth connect bre.vertices [1] to brrv [0..*];
		connection :WithinBoth connect bsle.vertices [1] to bflv [0..*];
		connection :WithinBoth connect bsle.vertices [1] to brlv [0..*];
		connection :WithinBoth connect bsre.vertices [1] to bfrv [0..*];
		connection :WithinBoth connect bsre.vertices [1] to brrv [0..*];

		connection :WithinBoth connect ufle.vertices [1] to tflv [0..*];
		connection :WithinBoth connect ufle.vertices [1] to bflv [0..*];
		connection :WithinBoth connect ufre.vertices [1] to tfrv [0..*];
		connection :WithinBoth connect ufre.vertices [1] to bfrv [0..*];
		connection :WithinBoth connect urle.vertices [1] to trlv [0..*];
		connection :WithinBoth connect urle.vertices [1] to brlv [0..*];
		connection :WithinBoth connect urre.vertices [1] to trrv [0..*];
		connection :WithinBoth connect urre.vertices [1] to brrv [0..*];

		  /* Coincident edges */
		connection :WithinBoth connect tfe [2] to tfe [2];
		connection :WithinBoth connect tre [2] to tre [2];
		connection :WithinBoth connect tsle [2] to tsle [2];
		connection :WithinBoth connect tsre [2] to tsre [2];
		connection :WithinBoth connect bfe [2] to bfe [2];
		connection :WithinBoth connect bre [2] to bre [2];
		connection :WithinBoth connect bsle [2] to bsle [2];
		connection :WithinBoth connect bsre [2] to bsre [2];
		connection :WithinBoth connect ufle [2] to ufle [2];
		connection :WithinBoth connect ufre [2] to ufre [2];
		connection :WithinBoth connect urle [2] to urle [2];
		connection :WithinBoth connect urre [2] to urre [2];

		  /* Coincident vertices */
		connection :WithinBoth connect tflv [3] to tflv [3];
		connection :WithinBoth connect tfrv [3] to tfrv [3];
		connection :WithinBoth connect trlv [3] to trlv [3];
		connection :WithinBoth connect trrv [3] to trrv [3];
		connection :WithinBoth connect bflv [3] to bflv [3];
		connection :WithinBoth connect bfrv [3] to bfrv [3];
		connection :WithinBoth connect brlv [3] to brlv [3];
		connection :WithinBoth connect brrv [3] to brrv [3];
	}
	alias Box for Cuboid;
}