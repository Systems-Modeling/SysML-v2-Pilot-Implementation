package VisibilityPackage {
			private class c_Private{
				private class c_private{}
				public class c_public{}
			}
			
			public class c_Public{
				private class c_private{}
				public class c_public{}
				protected class c_protected{}
			}
			
			public class c_Public_alias{
				public class c_public{}
				private alias c_public as alias_private; 
				protected alias c_public as alias_protected;
				public alias c_public as alias_public;
				protected class c_protected{}
				protected alias c_protected as alias_protected_is_c_protected;
			}
			
			private class c_Private_alias{
				public class c_public{}
				private alias c_public as alias_private; 
				protected alias c_public as alias_protected;
				public alias c_public as alias_public;
			}
			
			public class c_clazz{
				protected class c_Protect{
					public class c_publicc{}
					protected class c_protect{}
				}
				public class c_Public{
					protected class c_protect{}
					public class c_publicc{}
				}
			}
		}