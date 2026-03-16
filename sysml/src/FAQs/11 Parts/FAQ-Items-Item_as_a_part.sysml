package 'FAQ-Items-Item_as_a_part' {
	doc /*
	 * How do you treat an item as a part?
	 * (Based on "item and part usage" by Mirna Ojeda, 15 Jan 2024)
	 */
	 
	item def Assembly;
	
	part def Product {
		// subassembly is a part, 
		// even though Assembly is an item def
	    part subassembly : Assembly; // and implicitly Parts::Part
	}
	
	part def Warehouse {
		// productsInInventory is an item, 
		// even though Product is a Part def
	    item productsInInventory : Product [*];
	}

}