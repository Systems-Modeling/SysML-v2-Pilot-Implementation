package ProductSelection_OwnedEnds {
	
	class SelectionInfo;
	class ShoppingCart;
	class Product;
	
	// User-specified association definition
	assoc ProductSelection {
		feature info: SelectionInfo;
		
		end [0..1] feature cart: ShoppingCart[1];
		end [0..*] feature selectedProduct: Product[1];
	}
	
	// Equivalent association definition with named end features.
	assoc ProductSelection_ {
		feature info: SelectionInfo;
		
		end inCart[0..1] feature cart: ShoppingCart[1];
		end selectedProducts[0..*] feature selectedProduct: Product[1];
	}
	
	// Equivalent association definition showing library model specialization 
	// and implied cross subsetting.
	assoc ProductSelection__ specializes Links::BinaryLink {
		feature info: SelectionInfo;
		
		end cart: ShoppingCart[1] redefines source crossing selectedProduct.inCart {
			member feature selectedProducts: Product[0..*] featured by ShoppingCart;
		}
		end selectedProduct: Product[1] redefines target crossing cart.selectedProducts {
			member feature inCart: ShoppingCart[0..1] featured by Product;
		}
	}
	
	feature myCart: ShoppingCart;
	
	feature product1: Product;
	feature info1: SelectionInfo;	
	feature selection1: ProductSelection { 
		feature :>> info = info1; 
		feature :>> cart = myCart; 
		feature :>> selectedProduct = product1;
	}
	
	feature product2: Product;
	feature info2: SelectionInfo;	
	feature selection2: ProductSelection { 
		feature :>> info = info2; 
		feature :>> cart = myCart; 
		feature :>> selectedProduct = product2;
	}
}