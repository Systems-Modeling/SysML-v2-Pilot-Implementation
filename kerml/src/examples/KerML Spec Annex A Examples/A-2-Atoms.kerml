package Atoms {
	doc
	/* This package defines a keyword (atom) for classifiers with
	 * exactly one instance and are disjoint from any others
	 * marked with this keyword.
	 */

	private import Metaobjects::Metaobject;
	
        //CB: This should be metadata only, no library class, see comment in goog doc.
	classifier Atom;
	metaclass <atom> AtomMetadata specializes Metaobject {
		baseType = Atom meta KerML::Classifier;
	}
}
