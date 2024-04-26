package ProductSelection_UnownedEnds {
	
	class SelectionInfo;
	class ShoppingCart {
		feature selectedProducts : Product[0..*];
	}
	class Product {
		feature inCart: ShoppingCart[0..1];
	}
	
	assoc ProductSelection {
		feature info: SelectionInfo[1];
		
		end feature cart: ShoppingCart[1] crossing selectedProduct.inCart;
		end feature selectedProduct: Product[1] crossing cart.selectedProducts;
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