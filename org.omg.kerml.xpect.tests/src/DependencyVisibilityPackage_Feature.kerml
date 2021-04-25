package VisibilityPackage {
			private feature c_Private{
				private feature c_private{}
				public feature c_public{}
			}
			
			public feature c_Public{
				private feature c_private{}
				public feature c_public{}
			}
			
			public feature c_Public_alias{
				public feature c_public{}
				private feature alias_private is c_public; 
				public feature alias_public is c_public;
			}
			
			private feature c_Private_alias{
				public feature c_public{}
				private feature alias_private is c_public; 
				public feature alias_public is c_public;
			}
			
			public feature c_clazz{
				protected feature c_Protect{
					public feature c_publicc{}
				}
				public feature c_Public{
					protected feature c_protect{}
				}
			}
		}