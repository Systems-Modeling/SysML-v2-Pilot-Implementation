package ProductSelection_N_ary {
	
	class SelectionInfo;
	class ShoppingCart;
	class Product;
	class Account;
	
	// User-specified association definition
	assoc ProductSelection {
		end [0..1] feature cart: ShoppingCart[1];
		end [0..*] feature selectedProduct: Product[1];
		end [1..1] feature account : Account[1];
	}
	
	// Equivalent association definition with named end features.
	assoc ProductSelection1 {
		end inCart[0..1] feature cart: ShoppingCart[1];
		end selectedProducts[0..*] feature selectedProduct: Product[1];
		end withAccount[1..1 ] feature account : Account[1];
	}
	
	// Equivalent association definition with nested crossing features.
	assoc ProductSelection2 {
		end feature cart: ShoppingCart[1] {
			member feature inCart[0..1]; // owned crossing feature
		}
		end feature selectedProduct: Product[1] {
			member feature selectedProducts[0..*]; // owned crossing feature
		}
		end feature account : Account[1] {
			member feature withAccount[1..1]; // owned crossing feature
		}
	}
	
	// Equivalent association definition showing library model specialization 
	// and implied cross subsetting.
	assoc ProductSelection3 specializes Links::Link {
		end cart: ShoppingCart[1] crosses cart::inCart::product_account.inCart {
			member feature inCart: ShoppingCart[0..1] featured by product_account {
				member feature product_account multiplies selectedProduct, account featured by ProductSelection3 {
					import inCart;
				}
			}
		}
		end selectedProduct: Product[1] crosses selectedProduct::selectedProducts::cart_account.selectedProducts {
			member feature selectedProducts: Product[0..*] featured by cart_account {
				member feature cart_account multiplies cart, account featured by ProductSelection3 {
					import selectedProducts;
				}				
			}
		}
		end feature account : Account[1] crosses account::withAccount::cart_product.withAccount {
			member feature withAccount[1..1] : Account featured by cart_product {
				member feature cart_product multiplies cart, selectedProduct featured by ProductSelection3 {
					import withAccount;
				}
			}
		}
	}
	
	assoc SingleProductSelection specializes ProductSelection {
		end [0..1] feature cart: ShoppingCart[1];
		end [0..1] feature selectedProduct: Product[1];
	}

	assoc SingleProductSelection1 specializes ProductSelection1 {
		end inCart1 [0..1] feature cart: ShoppingCart[1];
		end selectedProduct1 [0..1] feature selectedProduct: Product[1];
	}
	
	assoc SingleProductSelection2 specializes ProductSelection2 {
		end feature cart: ShoppingCart[1] {
			member feature inCart1[0..1]; // owned crossing feature
		}
		end feature selectedProduct: Product[1] {
			member feature selectedProducts1[0..*]; // owned crossing feature
		}
	}
	
	assoc SingleProductSelection3 specializes ProductSelection3 {
		end cart: ShoppingCart[1] redefines cart crosses cart::product_account1.inCart1 {
			member feature product_account1 subsets product_account multiplies selectedProduct, account featured by SingleProductSelection3 {
				import inCart1;
			}
			member feature inCart1: ShoppingCart[0..1] subsets inCart featured by product_account1;
		}
		end selectedProduct: Product[1] redefines selectedProduct crosses selectedProduct::cart_account1.selectedProduct1 {
			member feature cart_account1 subsets cart_account multiplies cart, account featured by SingleProductSelection3 {
				import selectedProduct1;
			}
			member feature selectedProduct1: Product[0..1] subsets selectedProducts featured by cart_account1;
		}
	}
	
	class OnlineCustomer {
		feature myCart: ShoppingCart[1];	
		feature products: Product[0..*];
		feature myAccount : Account[1];
		
		connector ps1 : ProductSelection (myCart, products, myAccount);
		
		connector ps2 : ProductSelection ([1] myCart, [0..1] products, [1] myAccount);
	}
	
}