package BasicShapes {
	private import Occurrences::WithinBoth;
	private import Objects::*;
	private import SequenceFunctions::isEmpty;
	
	/**
	 * Most general shape.	Solids are objects with these as space boundary.	
	 */
	abstract struct Shell :> StructuredSpaceObject, Surface	 {
	}

	/**
	* Straight line.
	*/
	struct Line :> Curve {
		feature :>> outerSpaceDimension = 1;
	}

	/**
	 * Flat surface.
	 */
	struct PlanarSurface :> Surface {
		feature :>> outerSpaceDimension = 2;
	}

	struct Circle :> Shell {
		feature :>> faces [0];
		feature :>> edges [1] {
			feature :>> spaceBoundary [0];
			feature :>> vertices [0];
		}
		feature :>> vertices [0];
	}

	/**
	 * Surface bounded by a circle.
	 */
	struct Disc :> Shell {
		feature :>> spaceBoundary : Circle [1];

		feature :>> faces : PlanarSurface [1] {
			feature :>> edges [1]; }
		feature :>> edges : Circle [1] = spaceBoundary;
		feature :>> vertices [0];

		connector :WithinBoth from faces.edges [1] to edges [0..*];
	}

	struct Sphere :> Shell {
		feature faces : Surface [1] :>> faces;
		feature :>> edges [0];
		feature :>> vertices [0];
	}

	/**
	 * Right circular cylinder, possibly truncated.
	 */
	struct Cone :> Shell {
		feature faces : Surface [2..3] :>> faces;
		feature bf : Disc [1] subsets faces;
		feature af : Disc [0..1] subsets faces;
		feature cf : Surface [1] subsets faces;

		feature edges : Circle [1..2] :>> edges;
		feature be [1] subsets edges;
		feature ae [0..1] subsets edges;
		inv { isEmpty(af) == isEmpty(ae) }

		feature vertices : Point [0..1] :>> vertices;
		inv { isEmpty(ae) == isEmpty(vertices) }

		  /* Faces to edges */
		connector :WithinBoth from bf.edges [1] to be [0..*];
		connector :WithinBoth from af.edges [1] to ae [0..*];
		connector :WithinBoth from cf.edges [1] to be [0..*];
		connector :WithinBoth from cf.edges [1] to ae [0..*];

		  /* Faces to vertices */
		connector :WithinBoth from cf.vertices [1] to vertices [0..*];

		  /* Coincident edges */
		connector :WithinBoth from be [2] to be [2];
		connector :WithinBoth from ae [2] to ae [2];

	}

	/**
	 * Six-sided polyhedron with rectangular sides.
	 */
	struct Cuboid :> Shell {
		feature faces : PlanarSurface [6] :>> faces {
			feature :>> edges [4]; }
		feature tf subsets faces [1];
		feature bf subsets faces [1];
		feature ff subsets faces [1];
		feature rf subsets faces [1];
		feature slf subsets faces [1];
		feature srf subsets faces [1];

		feature edges : Line [12] :>> edges {
			feature :>> vertices [2]; }
		feature tfe [2]  subsets edges;
		feature tre [2]  subsets edges;
		feature tsle [2] subsets edges;
		feature tsre [2] subsets edges;
		feature bfe [2]  subsets edges;
		feature bre [2]  subsets edges;
		feature bsle [2] subsets edges;
		feature bsre [2] subsets edges;
		feature ufle [2] subsets edges;
		feature ufre [2] subsets edges;
		feature urle [2] subsets edges;
		feature urre [2] subsets edges;

		feature vertices : Point [8] :>> vertices;
		feature tflv [3] subsets vertices;
		feature tfrv [3] subsets vertices;
		feature trlv [3] subsets vertices;
		feature trrv [3] subsets vertices;
		feature bflv [3] subsets vertices;
		feature bfrv [3] subsets vertices;
		feature brlv [3] subsets vertices;
		feature brrv [3] subsets vertices;
		
		  /* Faces to edges */
		connector :WithinBoth from tf.edges [1] to tfe [0..*];
		connector :WithinBoth from tf.edges [1] to tre [0..*];
		connector :WithinBoth from tf.edges [1] to tsle [0..*];
		connector :WithinBoth from tf.edges [1] to tsre [0..*];

		connector :WithinBoth from bf.edges [1] to bfe [0..*];
		connector :WithinBoth from bf.edges [1] to bre [0..*];
		connector :WithinBoth from bf.edges [1] to bsle [0..*];
		connector :WithinBoth from bf.edges [1] to bsre [0..*];

		connector :WithinBoth from ff.edges [1] to tfe [0..*];
		connector :WithinBoth from ff.edges [1] to bfe [0..*];
		connector :WithinBoth from ff.edges [1] to ufle [0..*];
		connector :WithinBoth from ff.edges [1] to ufre [0..*];

		connector :WithinBoth from rf.edges [1] to tre [0..*];
		connector :WithinBoth from rf.edges [1] to bre [0..*];
		connector :WithinBoth from rf.edges [1] to urle [0..*];
		connector :WithinBoth from rf.edges [1] to urre [0..*];

		connector :WithinBoth from slf.edges [1] to tsle [0..*];
		connector :WithinBoth from slf.edges [1] to bsle [0..*];
		connector :WithinBoth from slf.edges [1] to ufle [0..*];
		connector :WithinBoth from slf.edges [1] to urle [0..*];

		connector :WithinBoth from srf.edges [1] to tsre [0..*];
		connector :WithinBoth from srf.edges [1] to bsre [0..*];
		connector :WithinBoth from srf.edges [1] to ufre [0..*];
		connector :WithinBoth from srf.edges [1] to urre [0..*];
		
		  /* Edges to vertices */
		connector :WithinBoth from tfe.vertices [1] to tflv [0..*];
		connector :WithinBoth from tfe.vertices [1] to tfrv [0..*];
		connector :WithinBoth from tre.vertices [1] to trlv [0..*];
		connector :WithinBoth from tre.vertices [1] to trrv [0..*];
		connector :WithinBoth from tsle.vertices [1] to tflv [0..*];
		connector :WithinBoth from tsle.vertices [1] to trlv [0..*];
		connector :WithinBoth from tsre.vertices [1] to tfrv [0..*];
		connector :WithinBoth from tsre.vertices [1] to trrv [0..*];

		connector :WithinBoth from bfe.vertices [1] to bflv [0..*];
		connector :WithinBoth from bfe.vertices [1] to bfrv [0..*];
		connector :WithinBoth from bre.vertices [1] to brlv [0..*];
		connector :WithinBoth from bre.vertices [1] to brrv [0..*];
		connector :WithinBoth from bsle.vertices [1] to bflv [0..*];
		connector :WithinBoth from bsle.vertices [1] to brlv [0..*];
		connector :WithinBoth from bsre.vertices [1] to bfrv [0..*];
		connector :WithinBoth from bsre.vertices [1] to brrv [0..*];

		connector :WithinBoth from ufle.vertices [1] to tflv [0..*];
		connector :WithinBoth from ufle.vertices [1] to bflv [0..*];
		connector :WithinBoth from ufre.vertices [1] to tfrv [0..*];
		connector :WithinBoth from ufre.vertices [1] to bfrv [0..*];
		connector :WithinBoth from urle.vertices [1] to trlv [0..*];
		connector :WithinBoth from urle.vertices [1] to brlv [0..*];
		connector :WithinBoth from urre.vertices [1] to trrv [0..*];
		connector :WithinBoth from urre.vertices [1] to brrv [0..*];

		  /* Coincident edges */
		connector :WithinBoth from tfe [2] to tfe [2];
		connector :WithinBoth from tre [2] to tre [2];
		connector :WithinBoth from tsle [2] to tsle [2];
		connector :WithinBoth from tsre [2] to tsre [2];
		connector :WithinBoth from bfe [2] to bfe [2];
		connector :WithinBoth from bre [2] to bre [2];
		connector :WithinBoth from bsle [2] to bsle [2];
		connector :WithinBoth from bsre [2] to bsre [2];
		connector :WithinBoth from ufle [2] to ufle [2];
		connector :WithinBoth from ufre [2] to ufre [2];
		connector :WithinBoth from urle [2] to urle [2];
		connector :WithinBoth from urre [2] to urre [2];

		  /* Coincident vertices */
		connector :WithinBoth from tflv [3] to tflv [3];
		connector :WithinBoth from tfrv [3] to tfrv [3];
		connector :WithinBoth from trlv [3] to trlv [3];
		connector :WithinBoth from trrv [3] to trrv [3];
		connector :WithinBoth from bflv [3] to bflv [3];
		connector :WithinBoth from bfrv [3] to bfrv [3];
		connector :WithinBoth from brlv [3] to brlv [3];
		connector :WithinBoth from brrv [3] to brrv [3];
	}
	alias Box for Cuboid;
}