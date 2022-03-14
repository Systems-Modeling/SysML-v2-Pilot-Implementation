package CarWithShapeAndCSG {
	import Items::Item;
    import ShapeItems::*;
	import CollectionFunctions::contains;
	import SequenceFunctions::union;

	item def Car specializes Item {
		item redefines shape : Cuboid [1]; /* Quantify faces, etc, by redefining nested features. */
		part powerSource : Engine [1] subsets spaceEnclosedOccurrences;
	}

	part def Engine specializes Item {
  		item redefines shape [1];
 		private item c1 : Cylinder [1]; /* Quantify faces, etc, by redefining nested features. */
		private item c2 : Cylinder [1]; /* Quantify faces, etc, by redefining nested features. */
		    /* Specify relative positions of c1 and c2 here.  */
		constraint {}
		   /* CSG "operation" below. */
		constraint { contains(self.intersectionsOf, union(c1, c2)) } 
	}
}