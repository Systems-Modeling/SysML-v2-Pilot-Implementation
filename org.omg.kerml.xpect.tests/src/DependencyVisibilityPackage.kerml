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
				private alias alias_private for c_public; 
				protected alias alias_protected for c_public;
				public alias alias_public for c_public;
				protected class c_protected{}
				protected alias alias_protected_is_c_protected for c_protected;
			}
			
			private class c_Private_alias{
				public class c_public{}
				private alias alias_private for c_public; 
				protected alias alias_protected for c_public;
				public alias alias_public for c_public;
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