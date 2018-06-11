package org.omg.sysml.usage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.omg.sysml.usage.services.SysMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSysMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.*'", "'package'", "'{'", "'}'", "'valuetype'", "'='", "'block'", "'part'", "':'", "'is'", "'['", "']'", "'..'", "'*'", "'in'", "'out'", "'inout'", "'connector'", "'=>'", "'/'", "'-'", "'^'", "'.'", "'+'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSysMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSysMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSysMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSysML.g"; }



     	private SysMLGrammarAccess grammarAccess;

        public InternalSysMLParser(TokenStream input, SysMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Container";
       	}

       	@Override
       	protected SysMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContainer"
    // InternalSysML.g:64:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSysML.g:64:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalSysML.g:65:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSysML.g:71:1: ruleContainer returns [EObject current=null] : (this_Package_0= rulePackage | this_Definition_1= ruleDefinition ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Definition_1 = null;



        	enterRule();

        try {
            // InternalSysML.g:77:2: ( (this_Package_0= rulePackage | this_Definition_1= ruleDefinition ) )
            // InternalSysML.g:78:2: (this_Package_0= rulePackage | this_Definition_1= ruleDefinition )
            {
            // InternalSysML.g:78:2: (this_Package_0= rulePackage | this_Definition_1= ruleDefinition )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11||LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==17||LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSysML.g:79:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getContainerAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysML.g:88:3: this_Definition_1= ruleDefinition
                    {

                    			newCompositeNode(grammarAccess.getContainerAccess().getDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Definition_1=ruleDefinition();

                    state._fsp--;


                    			current = this_Definition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleImport"
    // InternalSysML.g:100:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSysML.g:100:47: (iv_ruleImport= ruleImport EOF )
            // InternalSysML.g:101:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSysML.g:107:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleQualifiedNameWithWildCard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSysML.g:113:2: ( (otherlv_0= 'import' ( ( ruleQualifiedNameWithWildCard ) ) otherlv_2= ';' ) )
            // InternalSysML.g:114:2: (otherlv_0= 'import' ( ( ruleQualifiedNameWithWildCard ) ) otherlv_2= ';' )
            {
            // InternalSysML.g:114:2: (otherlv_0= 'import' ( ( ruleQualifiedNameWithWildCard ) ) otherlv_2= ';' )
            // InternalSysML.g:115:3: otherlv_0= 'import' ( ( ruleQualifiedNameWithWildCard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalSysML.g:119:3: ( ( ruleQualifiedNameWithWildCard ) )
            // InternalSysML.g:120:4: ( ruleQualifiedNameWithWildCard )
            {
            // InternalSysML.g:120:4: ( ruleQualifiedNameWithWildCard )
            // InternalSysML.g:121:5: ruleQualifiedNameWithWildCard
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespacePackageMemberCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedNameWithWildCard();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalSysML.g:143:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalSysML.g:143:65: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalSysML.g:144:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // InternalSysML.g:150:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:156:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSysML.g:157:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSysML.g:157:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSysML.g:158:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSysML.g:168:3: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSysML.g:169:4: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackage"
    // InternalSysML.g:179:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSysML.g:179:48: (iv_rulePackage= rulePackage EOF )
            // InternalSysML.g:180:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSysML.g:186:1: rulePackage returns [EObject current=null] : ( ( (lv_import_0_0= ruleImport ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_member_4_0= rulePackageMember ) )* otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_import_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_member_4_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:192:2: ( ( ( (lv_import_0_0= ruleImport ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_member_4_0= rulePackageMember ) )* otherlv_5= '}' ) )
            // InternalSysML.g:193:2: ( ( (lv_import_0_0= ruleImport ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_member_4_0= rulePackageMember ) )* otherlv_5= '}' )
            {
            // InternalSysML.g:193:2: ( ( (lv_import_0_0= ruleImport ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_member_4_0= rulePackageMember ) )* otherlv_5= '}' )
            // InternalSysML.g:194:3: ( (lv_import_0_0= ruleImport ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_member_4_0= rulePackageMember ) )* otherlv_5= '}'
            {
            // InternalSysML.g:194:3: ( (lv_import_0_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSysML.g:195:4: (lv_import_0_0= ruleImport )
            	    {
            	    // InternalSysML.g:195:4: (lv_import_0_0= ruleImport )
            	    // InternalSysML.g:196:5: lv_import_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getImportImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_import_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"import",
            	    						lv_import_0_0,
            	    						"org.omg.sysml.usage.SysML.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalSysML.g:217:3: ( (lv_name_2_0= ruleName ) )
            // InternalSysML.g:218:4: (lv_name_2_0= ruleName )
            {
            // InternalSysML.g:218:4: (lv_name_2_0= ruleName )
            // InternalSysML.g:219:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.usage.SysML.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSysML.g:240:3: ( (lv_member_4_0= rulePackageMember ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==11||LA4_0==14||LA4_0==17||(LA4_0>=19 && LA4_0<=20)||(LA4_0>=27 && LA4_0<=29)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSysML.g:241:4: (lv_member_4_0= rulePackageMember )
            	    {
            	    // InternalSysML.g:241:4: (lv_member_4_0= rulePackageMember )
            	    // InternalSysML.g:242:5: lv_member_4_0= rulePackageMember
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getMemberPackageMemberParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_member_4_0=rulePackageMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"member",
            	    						lv_member_4_0,
            	    						"org.omg.sysml.usage.SysML.PackageMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackageMember"
    // InternalSysML.g:267:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalSysML.g:267:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalSysML.g:268:2: iv_rulePackageMember= rulePackageMember EOF
            {
             newCompositeNode(grammarAccess.getPackageMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageMember=rulePackageMember();

            state._fsp--;

             current =iv_rulePackageMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageMember"


    // $ANTLR start "rulePackageMember"
    // InternalSysML.g:274:1: rulePackageMember returns [EObject current=null] : (this_Container_0= ruleContainer | this_Feature_1= ruleFeature | this_Part_2= rulePart ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;

        EObject this_Feature_1 = null;

        EObject this_Part_2 = null;



        	enterRule();

        try {
            // InternalSysML.g:280:2: ( (this_Container_0= ruleContainer | this_Feature_1= ruleFeature | this_Part_2= rulePart ) )
            // InternalSysML.g:281:2: (this_Container_0= ruleContainer | this_Feature_1= ruleFeature | this_Part_2= rulePart )
            {
            // InternalSysML.g:281:2: (this_Container_0= ruleContainer | this_Feature_1= ruleFeature | this_Part_2= rulePart )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
            case 14:
            case 17:
            case 19:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case 27:
            case 28:
            case 29:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSysML.g:282:3: this_Container_0= ruleContainer
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getContainerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Container_0=ruleContainer();

                    state._fsp--;


                    			current = this_Container_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysML.g:291:3: this_Feature_1= ruleFeature
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getFeatureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Feature_1=ruleFeature();

                    state._fsp--;


                    			current = this_Feature_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSysML.g:300:3: this_Part_2= rulePart
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getPartParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Part_2=rulePart();

                    state._fsp--;


                    			current = this_Part_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageMember"


    // $ANTLR start "entryRuleDefinition"
    // InternalSysML.g:312:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalSysML.g:312:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalSysML.g:313:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalSysML.g:319:1: ruleDefinition returns [EObject current=null] : (this_ValueTypeDefinition_0= ruleValueTypeDefinition | this_BlockDefinition_1= ruleBlockDefinition ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ValueTypeDefinition_0 = null;

        EObject this_BlockDefinition_1 = null;



        	enterRule();

        try {
            // InternalSysML.g:325:2: ( (this_ValueTypeDefinition_0= ruleValueTypeDefinition | this_BlockDefinition_1= ruleBlockDefinition ) )
            // InternalSysML.g:326:2: (this_ValueTypeDefinition_0= ruleValueTypeDefinition | this_BlockDefinition_1= ruleBlockDefinition )
            {
            // InternalSysML.g:326:2: (this_ValueTypeDefinition_0= ruleValueTypeDefinition | this_BlockDefinition_1= ruleBlockDefinition )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSysML.g:327:3: this_ValueTypeDefinition_0= ruleValueTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getValueTypeDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueTypeDefinition_0=ruleValueTypeDefinition();

                    state._fsp--;


                    			current = this_ValueTypeDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysML.g:336:3: this_BlockDefinition_1= ruleBlockDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getBlockDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlockDefinition_1=ruleBlockDefinition();

                    state._fsp--;


                    			current = this_BlockDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleValueTypeDefinition"
    // InternalSysML.g:348:1: entryRuleValueTypeDefinition returns [EObject current=null] : iv_ruleValueTypeDefinition= ruleValueTypeDefinition EOF ;
    public final EObject entryRuleValueTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTypeDefinition = null;


        try {
            // InternalSysML.g:348:60: (iv_ruleValueTypeDefinition= ruleValueTypeDefinition EOF )
            // InternalSysML.g:349:2: iv_ruleValueTypeDefinition= ruleValueTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getValueTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueTypeDefinition=ruleValueTypeDefinition();

            state._fsp--;

             current =iv_ruleValueTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueTypeDefinition"


    // $ANTLR start "ruleValueTypeDefinition"
    // InternalSysML.g:355:1: ruleValueTypeDefinition returns [EObject current=null] : (otherlv_0= 'valuetype' ( (lv_name_1_0= ruleName ) ) ( ( (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';' ) | (otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleValueTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_units_4_0 = null;

        EObject lv_feature_7_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:361:2: ( (otherlv_0= 'valuetype' ( (lv_name_1_0= ruleName ) ) ( ( (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';' ) | (otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}' ) ) ) )
            // InternalSysML.g:362:2: (otherlv_0= 'valuetype' ( (lv_name_1_0= ruleName ) ) ( ( (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';' ) | (otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysML.g:362:2: (otherlv_0= 'valuetype' ( (lv_name_1_0= ruleName ) ) ( ( (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';' ) | (otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}' ) ) )
            // InternalSysML.g:363:3: otherlv_0= 'valuetype' ( (lv_name_1_0= ruleName ) ) ( ( (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';' ) | (otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}' ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValueTypeDefinitionAccess().getValuetypeKeyword_0());
            		
            // InternalSysML.g:367:3: ( (lv_name_1_0= ruleName ) )
            // InternalSysML.g:368:4: (lv_name_1_0= ruleName )
            {
            // InternalSysML.g:368:4: (lv_name_1_0= ruleName )
            // InternalSysML.g:369:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getValueTypeDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueTypeDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.omg.sysml.usage.SysML.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysML.g:386:3: ( ( (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';' ) | (otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12||LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSysML.g:387:4: ( (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';' )
                    {
                    // InternalSysML.g:387:4: ( (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';' )
                    // InternalSysML.g:388:5: (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )? otherlv_5= ';'
                    {
                    // InternalSysML.g:388:5: (otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )? )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==18) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSysML.g:389:6: otherlv_2= '=' ( ( ruleQualifiedName ) ) ( (lv_units_4_0= ruleUnits ) )?
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_3); 

                            						newLeafNode(otherlv_2, grammarAccess.getValueTypeDefinitionAccess().getEqualsSignKeyword_2_0_0_0());
                            					
                            // InternalSysML.g:393:6: ( ( ruleQualifiedName ) )
                            // InternalSysML.g:394:7: ( ruleQualifiedName )
                            {
                            // InternalSysML.g:394:7: ( ruleQualifiedName )
                            // InternalSysML.g:395:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getValueTypeDefinitionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getValueTypeDefinitionAccess().getTypeValueTypeDefinitionCrossReference_2_0_0_1_0());
                            							
                            pushFollow(FOLLOW_10);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalSysML.g:409:6: ( (lv_units_4_0= ruleUnits ) )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==RULE_ID) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalSysML.g:410:7: (lv_units_4_0= ruleUnits )
                                    {
                                    // InternalSysML.g:410:7: (lv_units_4_0= ruleUnits )
                                    // InternalSysML.g:411:8: lv_units_4_0= ruleUnits
                                    {

                                    								newCompositeNode(grammarAccess.getValueTypeDefinitionAccess().getUnitsUnitsParserRuleCall_2_0_0_2_0());
                                    							
                                    pushFollow(FOLLOW_4);
                                    lv_units_4_0=ruleUnits();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getValueTypeDefinitionRule());
                                    								}
                                    								set(
                                    									current,
                                    									"units",
                                    									lv_units_4_0,
                                    									"org.omg.sysml.usage.SysML.Units");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getValueTypeDefinitionAccess().getSemicolonKeyword_2_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSysML.g:435:4: (otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}' )
                    {
                    // InternalSysML.g:435:4: (otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}' )
                    // InternalSysML.g:436:5: otherlv_6= '{' ( (lv_feature_7_0= ruleBasicFeature ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    					newLeafNode(otherlv_6, grammarAccess.getValueTypeDefinitionAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalSysML.g:440:5: ( (lv_feature_7_0= ruleBasicFeature ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSysML.g:441:6: (lv_feature_7_0= ruleBasicFeature )
                    	    {
                    	    // InternalSysML.g:441:6: (lv_feature_7_0= ruleBasicFeature )
                    	    // InternalSysML.g:442:7: lv_feature_7_0= ruleBasicFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getValueTypeDefinitionAccess().getFeatureBasicFeatureParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_feature_7_0=ruleBasicFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getValueTypeDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feature",
                    	    								lv_feature_7_0,
                    	    								"org.omg.sysml.usage.SysML.BasicFeature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getValueTypeDefinitionAccess().getRightCurlyBracketKeyword_2_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueTypeDefinition"


    // $ANTLR start "entryRuleBlockDefinition"
    // InternalSysML.g:469:1: entryRuleBlockDefinition returns [EObject current=null] : iv_ruleBlockDefinition= ruleBlockDefinition EOF ;
    public final EObject entryRuleBlockDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockDefinition = null;


        try {
            // InternalSysML.g:469:56: (iv_ruleBlockDefinition= ruleBlockDefinition EOF )
            // InternalSysML.g:470:2: iv_ruleBlockDefinition= ruleBlockDefinition EOF
            {
             newCompositeNode(grammarAccess.getBlockDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockDefinition=ruleBlockDefinition();

            state._fsp--;

             current =iv_ruleBlockDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockDefinition"


    // $ANTLR start "ruleBlockDefinition"
    // InternalSysML.g:476:1: ruleBlockDefinition returns [EObject current=null] : (otherlv_0= 'block' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}' ) ) ) ;
    public final EObject ruleBlockDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_feature_4_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:482:2: ( (otherlv_0= 'block' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}' ) ) ) )
            // InternalSysML.g:483:2: (otherlv_0= 'block' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysML.g:483:2: (otherlv_0= 'block' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}' ) ) )
            // InternalSysML.g:484:3: otherlv_0= 'block' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockDefinitionAccess().getBlockKeyword_0());
            		
            // InternalSysML.g:488:3: ( (lv_name_1_0= ruleName ) )
            // InternalSysML.g:489:4: (lv_name_1_0= ruleName )
            {
            // InternalSysML.g:489:4: (lv_name_1_0= ruleName )
            // InternalSysML.g:490:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getBlockDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.omg.sysml.usage.SysML.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysML.g:507:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSysML.g:508:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBlockDefinitionAccess().getSemicolonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysML.g:513:4: (otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}' )
                    {
                    // InternalSysML.g:513:4: (otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}' )
                    // InternalSysML.g:514:5: otherlv_3= '{' ( (lv_feature_4_0= ruleFeature ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_13); 

                    					newLeafNode(otherlv_3, grammarAccess.getBlockDefinitionAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalSysML.g:518:5: ( (lv_feature_4_0= ruleFeature ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||(LA11_0>=27 && LA11_0<=29)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSysML.g:519:6: (lv_feature_4_0= ruleFeature )
                    	    {
                    	    // InternalSysML.g:519:6: (lv_feature_4_0= ruleFeature )
                    	    // InternalSysML.g:520:7: lv_feature_4_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlockDefinitionAccess().getFeatureFeatureParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_feature_4_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlockDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feature",
                    	    								lv_feature_4_0,
                    	    								"org.omg.sysml.usage.SysML.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getBlockDefinitionAccess().getRightCurlyBracketKeyword_2_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockDefinition"


    // $ANTLR start "entryRulePart"
    // InternalSysML.g:547:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // InternalSysML.g:547:45: (iv_rulePart= rulePart EOF )
            // InternalSysML.g:548:2: iv_rulePart= rulePart EOF
            {
             newCompositeNode(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePart=rulePart();

            state._fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // InternalSysML.g:554:1: rulePart returns [EObject current=null] : (otherlv_0= 'part' ( ( ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )? ) | (otherlv_9= 'is' ( ( ruleQualifiedName ) ) ) ) (otherlv_11= '[' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) otherlv_13= ']' )? (otherlv_14= ';' | (otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}' ) ) ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_index_2_0 = null;

        EObject lv_multiplicity_12_0 = null;

        EObject lv_member_16_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:560:2: ( (otherlv_0= 'part' ( ( ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )? ) | (otherlv_9= 'is' ( ( ruleQualifiedName ) ) ) ) (otherlv_11= '[' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) otherlv_13= ']' )? (otherlv_14= ';' | (otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}' ) ) ) )
            // InternalSysML.g:561:2: (otherlv_0= 'part' ( ( ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )? ) | (otherlv_9= 'is' ( ( ruleQualifiedName ) ) ) ) (otherlv_11= '[' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) otherlv_13= ']' )? (otherlv_14= ';' | (otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}' ) ) )
            {
            // InternalSysML.g:561:2: (otherlv_0= 'part' ( ( ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )? ) | (otherlv_9= 'is' ( ( ruleQualifiedName ) ) ) ) (otherlv_11= '[' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) otherlv_13= ']' )? (otherlv_14= ';' | (otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}' ) ) )
            // InternalSysML.g:562:3: otherlv_0= 'part' ( ( ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )? ) | (otherlv_9= 'is' ( ( ruleQualifiedName ) ) ) ) (otherlv_11= '[' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) otherlv_13= ']' )? (otherlv_14= ';' | (otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}' ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPartAccess().getPartKeyword_0());
            		
            // InternalSysML.g:566:3: ( ( ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )? ) | (otherlv_9= 'is' ( ( ruleQualifiedName ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSysML.g:567:4: ( ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )? )
                    {
                    // InternalSysML.g:567:4: ( ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )? )
                    // InternalSysML.g:568:5: ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )?
                    {
                    // InternalSysML.g:568:5: ( (lv_name_1_0= ruleName ) )
                    // InternalSysML.g:569:6: (lv_name_1_0= ruleName )
                    {
                    // InternalSysML.g:569:6: (lv_name_1_0= ruleName )
                    // InternalSysML.g:570:7: lv_name_1_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getPartAccess().getNameNameParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPartRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_1_0,
                    								"org.omg.sysml.usage.SysML.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSysML.g:587:5: ( ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==23) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==RULE_ID) ) {
                            int LA16_4 = input.LA(3);

                            if ( (LA16_4==21) ) {
                                alt16=1;
                            }
                            else if ( (LA16_4==24) ) {
                                int LA16_5 = input.LA(4);

                                if ( ((LA16_5>=21 && LA16_5<=22)) ) {
                                    alt16=1;
                                }
                            }
                        }
                    }
                    else if ( ((LA16_0>=21 && LA16_0<=22)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSysML.g:588:6: ( (lv_index_2_0= ruleUsageIndex ) )? ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) )
                            {
                            // InternalSysML.g:588:6: ( (lv_index_2_0= ruleUsageIndex ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==23) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalSysML.g:589:7: (lv_index_2_0= ruleUsageIndex )
                                    {
                                    // InternalSysML.g:589:7: (lv_index_2_0= ruleUsageIndex )
                                    // InternalSysML.g:590:8: lv_index_2_0= ruleUsageIndex
                                    {

                                    								newCompositeNode(grammarAccess.getPartAccess().getIndexUsageIndexParserRuleCall_1_0_1_0_0());
                                    							
                                    pushFollow(FOLLOW_16);
                                    lv_index_2_0=ruleUsageIndex();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getPartRule());
                                    								}
                                    								set(
                                    									current,
                                    									"index",
                                    									lv_index_2_0,
                                    									"org.omg.sysml.usage.SysML.UsageIndex");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalSysML.g:607:6: ( (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? ) | (otherlv_7= 'is' ( ( ruleQualifiedName ) ) ) )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==21) ) {
                                alt15=1;
                            }
                            else if ( (LA15_0==22) ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 0, input);

                                throw nvae;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalSysML.g:608:7: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? )
                                    {
                                    // InternalSysML.g:608:7: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )? )
                                    // InternalSysML.g:609:8: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )?
                                    {
                                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                                    								newLeafNode(otherlv_3, grammarAccess.getPartAccess().getColonKeyword_1_0_1_1_0_0());
                                    							
                                    // InternalSysML.g:613:8: ( ( ruleQualifiedName ) )
                                    // InternalSysML.g:614:9: ( ruleQualifiedName )
                                    {
                                    // InternalSysML.g:614:9: ( ruleQualifiedName )
                                    // InternalSysML.g:615:10: ruleQualifiedName
                                    {

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getPartRule());
                                    										}
                                    									

                                    										newCompositeNode(grammarAccess.getPartAccess().getDefinitionDefinitionCrossReference_1_0_1_1_0_1_0());
                                    									
                                    pushFollow(FOLLOW_17);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    // InternalSysML.g:629:8: (otherlv_5= 'is' ( ( ruleQualifiedName ) ) )?
                                    int alt14=2;
                                    int LA14_0 = input.LA(1);

                                    if ( (LA14_0==22) ) {
                                        alt14=1;
                                    }
                                    switch (alt14) {
                                        case 1 :
                                            // InternalSysML.g:630:9: otherlv_5= 'is' ( ( ruleQualifiedName ) )
                                            {
                                            otherlv_5=(Token)match(input,22,FOLLOW_3); 

                                            									newLeafNode(otherlv_5, grammarAccess.getPartAccess().getIsKeyword_1_0_1_1_0_2_0());
                                            								
                                            // InternalSysML.g:634:9: ( ( ruleQualifiedName ) )
                                            // InternalSysML.g:635:10: ( ruleQualifiedName )
                                            {
                                            // InternalSysML.g:635:10: ( ruleQualifiedName )
                                            // InternalSysML.g:636:11: ruleQualifiedName
                                            {

                                            											if (current==null) {
                                            												current = createModelElement(grammarAccess.getPartRule());
                                            											}
                                            										

                                            											newCompositeNode(grammarAccess.getPartAccess().getBasePartCrossReference_1_0_1_1_0_2_1_0());
                                            										
                                            pushFollow(FOLLOW_18);
                                            ruleQualifiedName();

                                            state._fsp--;


                                            											afterParserOrEnumRuleCall();
                                            										

                                            }


                                            }


                                            }
                                            break;

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalSysML.g:653:7: (otherlv_7= 'is' ( ( ruleQualifiedName ) ) )
                                    {
                                    // InternalSysML.g:653:7: (otherlv_7= 'is' ( ( ruleQualifiedName ) ) )
                                    // InternalSysML.g:654:8: otherlv_7= 'is' ( ( ruleQualifiedName ) )
                                    {
                                    otherlv_7=(Token)match(input,22,FOLLOW_3); 

                                    								newLeafNode(otherlv_7, grammarAccess.getPartAccess().getIsKeyword_1_0_1_1_1_0());
                                    							
                                    // InternalSysML.g:658:8: ( ( ruleQualifiedName ) )
                                    // InternalSysML.g:659:9: ( ruleQualifiedName )
                                    {
                                    // InternalSysML.g:659:9: ( ruleQualifiedName )
                                    // InternalSysML.g:660:10: ruleQualifiedName
                                    {

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getPartRule());
                                    										}
                                    									

                                    										newCompositeNode(grammarAccess.getPartAccess().getBasePartCrossReference_1_0_1_1_1_1_0());
                                    									
                                    pushFollow(FOLLOW_18);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysML.g:679:4: (otherlv_9= 'is' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalSysML.g:679:4: (otherlv_9= 'is' ( ( ruleQualifiedName ) ) )
                    // InternalSysML.g:680:5: otherlv_9= 'is' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_3); 

                    					newLeafNode(otherlv_9, grammarAccess.getPartAccess().getIsKeyword_1_1_0());
                    				
                    // InternalSysML.g:684:5: ( ( ruleQualifiedName ) )
                    // InternalSysML.g:685:6: ( ruleQualifiedName )
                    {
                    // InternalSysML.g:685:6: ( ruleQualifiedName )
                    // InternalSysML.g:686:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPartRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPartAccess().getBasePartCrossReference_1_1_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSysML.g:702:3: (otherlv_11= '[' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) otherlv_13= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSysML.g:703:4: otherlv_11= '[' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) otherlv_13= ']'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getPartAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalSysML.g:707:4: ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    // InternalSysML.g:708:5: (lv_multiplicity_12_0= ruleMultiplicity )
                    {
                    // InternalSysML.g:708:5: (lv_multiplicity_12_0= ruleMultiplicity )
                    // InternalSysML.g:709:6: lv_multiplicity_12_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getPartAccess().getMultiplicityMultiplicityParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_12_0=ruleMultiplicity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_12_0,
                    							"org.omg.sysml.usage.SysML.Multiplicity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getPartAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalSysML.g:731:3: (otherlv_14= ';' | (otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            else if ( (LA20_0==15) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSysML.g:732:4: otherlv_14= ';'
                    {
                    otherlv_14=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getPartAccess().getSemicolonKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysML.g:737:4: (otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}' )
                    {
                    // InternalSysML.g:737:4: (otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}' )
                    // InternalSysML.g:738:5: otherlv_15= '{' ( (lv_member_16_0= ruleMember ) )* otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,15,FOLLOW_21); 

                    					newLeafNode(otherlv_15, grammarAccess.getPartAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalSysML.g:742:5: ( (lv_member_16_0= ruleMember ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||LA19_0==20||(LA19_0>=27 && LA19_0<=30)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSysML.g:743:6: (lv_member_16_0= ruleMember )
                    	    {
                    	    // InternalSysML.g:743:6: (lv_member_16_0= ruleMember )
                    	    // InternalSysML.g:744:7: lv_member_16_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getPartAccess().getMemberMemberParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_member_16_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPartRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"member",
                    	    								lv_member_16_0,
                    	    								"org.omg.sysml.usage.SysML.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_17, grammarAccess.getPartAccess().getRightCurlyBracketKeyword_3_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePart"


    // $ANTLR start "entryRuleMember"
    // InternalSysML.g:771:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalSysML.g:771:47: (iv_ruleMember= ruleMember EOF )
            // InternalSysML.g:772:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalSysML.g:778:1: ruleMember returns [EObject current=null] : (this_Feature_0= ruleFeature | this_Part_1= rulePart | this_Connector_2= ruleConnector ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Feature_0 = null;

        EObject this_Part_1 = null;

        EObject this_Connector_2 = null;



        	enterRule();

        try {
            // InternalSysML.g:784:2: ( (this_Feature_0= ruleFeature | this_Part_1= rulePart | this_Connector_2= ruleConnector ) )
            // InternalSysML.g:785:2: (this_Feature_0= ruleFeature | this_Part_1= rulePart | this_Connector_2= ruleConnector )
            {
            // InternalSysML.g:785:2: (this_Feature_0= ruleFeature | this_Part_1= rulePart | this_Connector_2= ruleConnector )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 27:
            case 28:
            case 29:
                {
                alt21=1;
                }
                break;
            case 20:
                {
                alt21=2;
                }
                break;
            case 30:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSysML.g:786:3: this_Feature_0= ruleFeature
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getFeatureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Feature_0=ruleFeature();

                    state._fsp--;


                    			current = this_Feature_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysML.g:795:3: this_Part_1= rulePart
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getPartParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Part_1=rulePart();

                    state._fsp--;


                    			current = this_Part_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSysML.g:804:3: this_Connector_2= ruleConnector
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getConnectorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connector_2=ruleConnector();

                    state._fsp--;


                    			current = this_Connector_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleUsageIndex"
    // InternalSysML.g:816:1: entryRuleUsageIndex returns [EObject current=null] : iv_ruleUsageIndex= ruleUsageIndex EOF ;
    public final EObject entryRuleUsageIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageIndex = null;


        try {
            // InternalSysML.g:816:51: (iv_ruleUsageIndex= ruleUsageIndex EOF )
            // InternalSysML.g:817:2: iv_ruleUsageIndex= ruleUsageIndex EOF
            {
             newCompositeNode(grammarAccess.getUsageIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsageIndex=ruleUsageIndex();

            state._fsp--;

             current =iv_ruleUsageIndex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsageIndex"


    // $ANTLR start "ruleUsageIndex"
    // InternalSysML.g:823:1: ruleUsageIndex returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicity ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleUsageIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:829:2: ( (otherlv_0= '[' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicity ) ) )? otherlv_4= ']' ) )
            // InternalSysML.g:830:2: (otherlv_0= '[' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicity ) ) )? otherlv_4= ']' )
            {
            // InternalSysML.g:830:2: (otherlv_0= '[' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicity ) ) )? otherlv_4= ']' )
            // InternalSysML.g:831:3: otherlv_0= '[' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicity ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUsageIndexAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSysML.g:835:3: ( (lv_name_1_0= ruleName ) )
            // InternalSysML.g:836:4: (lv_name_1_0= ruleName )
            {
            // InternalSysML.g:836:4: (lv_name_1_0= ruleName )
            // InternalSysML.g:837:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getUsageIndexAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsageIndexRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.omg.sysml.usage.SysML.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysML.g:854:3: (otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicity ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSysML.g:855:4: otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicity ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getUsageIndexAccess().getColonKeyword_2_0());
                    			
                    // InternalSysML.g:859:4: ( (lv_multiplicity_3_0= ruleMultiplicity ) )
                    // InternalSysML.g:860:5: (lv_multiplicity_3_0= ruleMultiplicity )
                    {
                    // InternalSysML.g:860:5: (lv_multiplicity_3_0= ruleMultiplicity )
                    // InternalSysML.g:861:6: lv_multiplicity_3_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getUsageIndexAccess().getMultiplicityMultiplicityParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_3_0=ruleMultiplicity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUsageIndexRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_3_0,
                    							"org.omg.sysml.usage.SysML.Multiplicity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUsageIndexAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsageIndex"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalSysML.g:887:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalSysML.g:887:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalSysML.g:888:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalSysML.g:894:1: ruleMultiplicity returns [EObject current=null] : ( ( ( (lv_lowerBound_0_0= ruleBound ) ) otherlv_1= '..' )? ( (lv_upperBound_2_0= ruleUpperBound ) ) ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lowerBound_0_0 = null;

        EObject lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:900:2: ( ( ( ( (lv_lowerBound_0_0= ruleBound ) ) otherlv_1= '..' )? ( (lv_upperBound_2_0= ruleUpperBound ) ) ) )
            // InternalSysML.g:901:2: ( ( ( (lv_lowerBound_0_0= ruleBound ) ) otherlv_1= '..' )? ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            {
            // InternalSysML.g:901:2: ( ( ( (lv_lowerBound_0_0= ruleBound ) ) otherlv_1= '..' )? ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            // InternalSysML.g:902:3: ( ( (lv_lowerBound_0_0= ruleBound ) ) otherlv_1= '..' )? ( (lv_upperBound_2_0= ruleUpperBound ) )
            {
            // InternalSysML.g:902:3: ( ( (lv_lowerBound_0_0= ruleBound ) ) otherlv_1= '..' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==25) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==RULE_ID) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==25) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalSysML.g:903:4: ( (lv_lowerBound_0_0= ruleBound ) ) otherlv_1= '..'
                    {
                    // InternalSysML.g:903:4: ( (lv_lowerBound_0_0= ruleBound ) )
                    // InternalSysML.g:904:5: (lv_lowerBound_0_0= ruleBound )
                    {
                    // InternalSysML.g:904:5: (lv_lowerBound_0_0= ruleBound )
                    // InternalSysML.g:905:6: lv_lowerBound_0_0= ruleBound
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerBoundBoundParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_lowerBound_0_0=ruleBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_0_0,
                    							"org.omg.sysml.usage.SysML.Bound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalSysML.g:927:3: ( (lv_upperBound_2_0= ruleUpperBound ) )
            // InternalSysML.g:928:4: (lv_upperBound_2_0= ruleUpperBound )
            {
            // InternalSysML.g:928:4: (lv_upperBound_2_0= ruleUpperBound )
            // InternalSysML.g:929:5: lv_upperBound_2_0= ruleUpperBound
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperBoundUpperBoundParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_upperBound_2_0=ruleUpperBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicityRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_2_0,
            						"org.omg.sysml.usage.SysML.UpperBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleBound"
    // InternalSysML.g:950:1: entryRuleBound returns [EObject current=null] : iv_ruleBound= ruleBound EOF ;
    public final EObject entryRuleBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound = null;


        try {
            // InternalSysML.g:950:46: (iv_ruleBound= ruleBound EOF )
            // InternalSysML.g:951:2: iv_ruleBound= ruleBound EOF
            {
             newCompositeNode(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBound=ruleBound();

            state._fsp--;

             current =iv_ruleBound; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // InternalSysML.g:957:1: ruleBound returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleName ) ) ) ;
    public final EObject ruleBound() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        AntlrDatatypeRuleToken lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:963:2: ( ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleName ) ) ) )
            // InternalSysML.g:964:2: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleName ) ) )
            {
            // InternalSysML.g:964:2: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleName ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSysML.g:965:3: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // InternalSysML.g:965:3: ( (lv_value_0_0= RULE_INT ) )
                    // InternalSysML.g:966:4: (lv_value_0_0= RULE_INT )
                    {
                    // InternalSysML.g:966:4: (lv_value_0_0= RULE_INT )
                    // InternalSysML.g:967:5: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getBoundAccess().getValueINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoundRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysML.g:984:3: ( (lv_var_1_0= ruleName ) )
                    {
                    // InternalSysML.g:984:3: ( (lv_var_1_0= ruleName ) )
                    // InternalSysML.g:985:4: (lv_var_1_0= ruleName )
                    {
                    // InternalSysML.g:985:4: (lv_var_1_0= ruleName )
                    // InternalSysML.g:986:5: lv_var_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getBoundAccess().getVarNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBoundRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_1_0,
                    						"org.omg.sysml.usage.SysML.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleUpperBound"
    // InternalSysML.g:1007:1: entryRuleUpperBound returns [EObject current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final EObject entryRuleUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperBound = null;


        try {
            // InternalSysML.g:1007:51: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalSysML.g:1008:2: iv_ruleUpperBound= ruleUpperBound EOF
            {
             newCompositeNode(grammarAccess.getUpperBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperBound=ruleUpperBound();

            state._fsp--;

             current =iv_ruleUpperBound; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpperBound"


    // $ANTLR start "ruleUpperBound"
    // InternalSysML.g:1014:1: ruleUpperBound returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleName ) ) | ( (lv_unbounded_2_0= '*' ) ) ) ;
    public final EObject ruleUpperBound() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unbounded_2_0=null;
        AntlrDatatypeRuleToken lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1020:2: ( ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleName ) ) | ( (lv_unbounded_2_0= '*' ) ) ) )
            // InternalSysML.g:1021:2: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleName ) ) | ( (lv_unbounded_2_0= '*' ) ) )
            {
            // InternalSysML.g:1021:2: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleName ) ) | ( (lv_unbounded_2_0= '*' ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                alt25=2;
                }
                break;
            case 26:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSysML.g:1022:3: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // InternalSysML.g:1022:3: ( (lv_value_0_0= RULE_INT ) )
                    // InternalSysML.g:1023:4: (lv_value_0_0= RULE_INT )
                    {
                    // InternalSysML.g:1023:4: (lv_value_0_0= RULE_INT )
                    // InternalSysML.g:1024:5: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getUpperBoundAccess().getValueINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUpperBoundRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysML.g:1041:3: ( (lv_var_1_0= ruleName ) )
                    {
                    // InternalSysML.g:1041:3: ( (lv_var_1_0= ruleName ) )
                    // InternalSysML.g:1042:4: (lv_var_1_0= ruleName )
                    {
                    // InternalSysML.g:1042:4: (lv_var_1_0= ruleName )
                    // InternalSysML.g:1043:5: lv_var_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getUpperBoundAccess().getVarNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUpperBoundRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_1_0,
                    						"org.omg.sysml.usage.SysML.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSysML.g:1061:3: ( (lv_unbounded_2_0= '*' ) )
                    {
                    // InternalSysML.g:1061:3: ( (lv_unbounded_2_0= '*' ) )
                    // InternalSysML.g:1062:4: (lv_unbounded_2_0= '*' )
                    {
                    // InternalSysML.g:1062:4: (lv_unbounded_2_0= '*' )
                    // InternalSysML.g:1063:5: lv_unbounded_2_0= '*'
                    {
                    lv_unbounded_2_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_unbounded_2_0, grammarAccess.getUpperBoundAccess().getUnboundedAsteriskKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUpperBoundRule());
                    					}
                    					setWithLastConsumed(current, "unbounded", true, "*");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpperBound"


    // $ANTLR start "entryRuleFeature"
    // InternalSysML.g:1079:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSysML.g:1079:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSysML.g:1080:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalSysML.g:1086:1: ruleFeature returns [EObject current=null] : (this_BasicFeature_0= ruleBasicFeature | this_ConnectableFeature_1= ruleConnectableFeature ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_BasicFeature_0 = null;

        EObject this_ConnectableFeature_1 = null;



        	enterRule();

        try {
            // InternalSysML.g:1092:2: ( (this_BasicFeature_0= ruleBasicFeature | this_ConnectableFeature_1= ruleConnectableFeature ) )
            // InternalSysML.g:1093:2: (this_BasicFeature_0= ruleBasicFeature | this_ConnectableFeature_1= ruleConnectableFeature )
            {
            // InternalSysML.g:1093:2: (this_BasicFeature_0= ruleBasicFeature | this_ConnectableFeature_1= ruleConnectableFeature )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=27 && LA26_0<=29)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSysML.g:1094:3: this_BasicFeature_0= ruleBasicFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getBasicFeatureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicFeature_0=ruleBasicFeature();

                    state._fsp--;


                    			current = this_BasicFeature_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysML.g:1103:3: this_ConnectableFeature_1= ruleConnectableFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getConnectableFeatureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectableFeature_1=ruleConnectableFeature();

                    state._fsp--;


                    			current = this_ConnectableFeature_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleBasicFeature"
    // InternalSysML.g:1115:1: entryRuleBasicFeature returns [EObject current=null] : iv_ruleBasicFeature= ruleBasicFeature EOF ;
    public final EObject entryRuleBasicFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicFeature = null;


        try {
            // InternalSysML.g:1115:53: (iv_ruleBasicFeature= ruleBasicFeature EOF )
            // InternalSysML.g:1116:2: iv_ruleBasicFeature= ruleBasicFeature EOF
            {
             newCompositeNode(grammarAccess.getBasicFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicFeature=ruleBasicFeature();

            state._fsp--;

             current =iv_ruleBasicFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicFeature"


    // $ANTLR start "ruleBasicFeature"
    // InternalSysML.g:1122:1: ruleBasicFeature returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( ( (lv_index_1_0= ruleUsageIndex ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) )? (otherlv_4= '[' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) otherlv_6= ']' )? (otherlv_7= '=' ( (lv_expression_8_0= ruleExpression ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleBasicFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_index_1_0 = null;

        EObject lv_multiplicity_5_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1128:2: ( ( ( (lv_name_0_0= ruleName ) ) ( ( (lv_index_1_0= ruleUsageIndex ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) )? (otherlv_4= '[' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) otherlv_6= ']' )? (otherlv_7= '=' ( (lv_expression_8_0= ruleExpression ) ) )? otherlv_9= ';' ) )
            // InternalSysML.g:1129:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (lv_index_1_0= ruleUsageIndex ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) )? (otherlv_4= '[' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) otherlv_6= ']' )? (otherlv_7= '=' ( (lv_expression_8_0= ruleExpression ) ) )? otherlv_9= ';' )
            {
            // InternalSysML.g:1129:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (lv_index_1_0= ruleUsageIndex ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) )? (otherlv_4= '[' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) otherlv_6= ']' )? (otherlv_7= '=' ( (lv_expression_8_0= ruleExpression ) ) )? otherlv_9= ';' )
            // InternalSysML.g:1130:3: ( (lv_name_0_0= ruleName ) ) ( ( (lv_index_1_0= ruleUsageIndex ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) )? (otherlv_4= '[' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) otherlv_6= ']' )? (otherlv_7= '=' ( (lv_expression_8_0= ruleExpression ) ) )? otherlv_9= ';'
            {
            // InternalSysML.g:1130:3: ( (lv_name_0_0= ruleName ) )
            // InternalSysML.g:1131:4: (lv_name_0_0= ruleName )
            {
            // InternalSysML.g:1131:4: (lv_name_0_0= ruleName )
            // InternalSysML.g:1132:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getBasicFeatureAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.omg.sysml.usage.SysML.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysML.g:1149:3: ( ( (lv_index_1_0= ruleUsageIndex ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_ID) ) {
                    int LA28_4 = input.LA(3);

                    if ( (LA28_4==24) ) {
                        int LA28_5 = input.LA(4);

                        if ( (LA28_5==21) ) {
                            alt28=1;
                        }
                    }
                    else if ( (LA28_4==21) ) {
                        alt28=1;
                    }
                }
            }
            else if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSysML.g:1150:4: ( (lv_index_1_0= ruleUsageIndex ) )? otherlv_2= ':' ( ( ruleQualifiedName ) )
                    {
                    // InternalSysML.g:1150:4: ( (lv_index_1_0= ruleUsageIndex ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==23) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSysML.g:1151:5: (lv_index_1_0= ruleUsageIndex )
                            {
                            // InternalSysML.g:1151:5: (lv_index_1_0= ruleUsageIndex )
                            // InternalSysML.g:1152:6: lv_index_1_0= ruleUsageIndex
                            {

                            						newCompositeNode(grammarAccess.getBasicFeatureAccess().getIndexUsageIndexParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_25);
                            lv_index_1_0=ruleUsageIndex();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getBasicFeatureRule());
                            						}
                            						set(
                            							current,
                            							"index",
                            							lv_index_1_0,
                            							"org.omg.sysml.usage.SysML.UsageIndex");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicFeatureAccess().getColonKeyword_1_1());
                    			
                    // InternalSysML.g:1173:4: ( ( ruleQualifiedName ) )
                    // InternalSysML.g:1174:5: ( ruleQualifiedName )
                    {
                    // InternalSysML.g:1174:5: ( ruleQualifiedName )
                    // InternalSysML.g:1175:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicFeatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBasicFeatureAccess().getDefinitionDefinitionCrossReference_1_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSysML.g:1190:3: (otherlv_4= '[' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) otherlv_6= ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSysML.g:1191:4: otherlv_4= '[' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicFeatureAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalSysML.g:1195:4: ( (lv_multiplicity_5_0= ruleMultiplicity ) )
                    // InternalSysML.g:1196:5: (lv_multiplicity_5_0= ruleMultiplicity )
                    {
                    // InternalSysML.g:1196:5: (lv_multiplicity_5_0= ruleMultiplicity )
                    // InternalSysML.g:1197:6: lv_multiplicity_5_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getBasicFeatureAccess().getMultiplicityMultiplicityParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_5_0=ruleMultiplicity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicFeatureRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_5_0,
                    							"org.omg.sysml.usage.SysML.Multiplicity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getBasicFeatureAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalSysML.g:1219:3: (otherlv_7= '=' ( (lv_expression_8_0= ruleExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSysML.g:1220:4: otherlv_7= '=' ( (lv_expression_8_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getBasicFeatureAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalSysML.g:1224:4: ( (lv_expression_8_0= ruleExpression ) )
                    // InternalSysML.g:1225:5: (lv_expression_8_0= ruleExpression )
                    {
                    // InternalSysML.g:1225:5: (lv_expression_8_0= ruleExpression )
                    // InternalSysML.g:1226:6: lv_expression_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getBasicFeatureAccess().getExpressionExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_expression_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicFeatureRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"org.omg.sysml.usage.SysML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBasicFeatureAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicFeature"


    // $ANTLR start "entryRuleConnectableFeature"
    // InternalSysML.g:1252:1: entryRuleConnectableFeature returns [EObject current=null] : iv_ruleConnectableFeature= ruleConnectableFeature EOF ;
    public final EObject entryRuleConnectableFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectableFeature = null;


        try {
            // InternalSysML.g:1252:59: (iv_ruleConnectableFeature= ruleConnectableFeature EOF )
            // InternalSysML.g:1253:2: iv_ruleConnectableFeature= ruleConnectableFeature EOF
            {
             newCompositeNode(grammarAccess.getConnectableFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectableFeature=ruleConnectableFeature();

            state._fsp--;

             current =iv_ruleConnectableFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectableFeature"


    // $ANTLR start "ruleConnectableFeature"
    // InternalSysML.g:1259:1: ruleConnectableFeature returns [EObject current=null] : ( ( (lv_direction_0_0= ruleConnectionDirection ) ) ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleConnectableFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_index_2_0 = null;

        EObject lv_multiplicity_6_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1265:2: ( ( ( (lv_direction_0_0= ruleConnectionDirection ) ) ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? otherlv_8= ';' ) )
            // InternalSysML.g:1266:2: ( ( (lv_direction_0_0= ruleConnectionDirection ) ) ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? otherlv_8= ';' )
            {
            // InternalSysML.g:1266:2: ( ( (lv_direction_0_0= ruleConnectionDirection ) ) ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? otherlv_8= ';' )
            // InternalSysML.g:1267:3: ( (lv_direction_0_0= ruleConnectionDirection ) ) ( (lv_name_1_0= ruleName ) ) ( ( (lv_index_2_0= ruleUsageIndex ) )? otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? otherlv_8= ';'
            {
            // InternalSysML.g:1267:3: ( (lv_direction_0_0= ruleConnectionDirection ) )
            // InternalSysML.g:1268:4: (lv_direction_0_0= ruleConnectionDirection )
            {
            // InternalSysML.g:1268:4: (lv_direction_0_0= ruleConnectionDirection )
            // InternalSysML.g:1269:5: lv_direction_0_0= ruleConnectionDirection
            {

            					newCompositeNode(grammarAccess.getConnectableFeatureAccess().getDirectionConnectionDirectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_direction_0_0=ruleConnectionDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectableFeatureRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_0_0,
            						"org.omg.sysml.usage.SysML.ConnectionDirection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysML.g:1286:3: ( (lv_name_1_0= ruleName ) )
            // InternalSysML.g:1287:4: (lv_name_1_0= ruleName )
            {
            // InternalSysML.g:1287:4: (lv_name_1_0= ruleName )
            // InternalSysML.g:1288:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getConnectableFeatureAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectableFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.omg.sysml.usage.SysML.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysML.g:1305:3: ( ( (lv_index_2_0= ruleUsageIndex ) )? otherlv_3= ':' ( ( ruleQualifiedName ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_ID) ) {
                    int LA32_4 = input.LA(3);

                    if ( (LA32_4==24) ) {
                        int LA32_5 = input.LA(4);

                        if ( (LA32_5==21) ) {
                            alt32=1;
                        }
                    }
                    else if ( (LA32_4==21) ) {
                        alt32=1;
                    }
                }
            }
            else if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSysML.g:1306:4: ( (lv_index_2_0= ruleUsageIndex ) )? otherlv_3= ':' ( ( ruleQualifiedName ) )
                    {
                    // InternalSysML.g:1306:4: ( (lv_index_2_0= ruleUsageIndex ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==23) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSysML.g:1307:5: (lv_index_2_0= ruleUsageIndex )
                            {
                            // InternalSysML.g:1307:5: (lv_index_2_0= ruleUsageIndex )
                            // InternalSysML.g:1308:6: lv_index_2_0= ruleUsageIndex
                            {

                            						newCompositeNode(grammarAccess.getConnectableFeatureAccess().getIndexUsageIndexParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_25);
                            lv_index_2_0=ruleUsageIndex();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnectableFeatureRule());
                            						}
                            						set(
                            							current,
                            							"index",
                            							lv_index_2_0,
                            							"org.omg.sysml.usage.SysML.UsageIndex");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectableFeatureAccess().getColonKeyword_2_1());
                    			
                    // InternalSysML.g:1329:4: ( ( ruleQualifiedName ) )
                    // InternalSysML.g:1330:5: ( ruleQualifiedName )
                    {
                    // InternalSysML.g:1330:5: ( ruleQualifiedName )
                    // InternalSysML.g:1331:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectableFeatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectableFeatureAccess().getDefinitionDefinitionCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSysML.g:1346:3: (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSysML.g:1347:4: otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectableFeatureAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalSysML.g:1351:4: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
                    // InternalSysML.g:1352:5: (lv_multiplicity_6_0= ruleMultiplicity )
                    {
                    // InternalSysML.g:1352:5: (lv_multiplicity_6_0= ruleMultiplicity )
                    // InternalSysML.g:1353:6: lv_multiplicity_6_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getConnectableFeatureAccess().getMultiplicityMultiplicityParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_6_0=ruleMultiplicity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectableFeatureRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_6_0,
                    							"org.omg.sysml.usage.SysML.Multiplicity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getConnectableFeatureAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectableFeatureAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectableFeature"


    // $ANTLR start "entryRuleConnectionDirection"
    // InternalSysML.g:1383:1: entryRuleConnectionDirection returns [EObject current=null] : iv_ruleConnectionDirection= ruleConnectionDirection EOF ;
    public final EObject entryRuleConnectionDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDirection = null;


        try {
            // InternalSysML.g:1383:60: (iv_ruleConnectionDirection= ruleConnectionDirection EOF )
            // InternalSysML.g:1384:2: iv_ruleConnectionDirection= ruleConnectionDirection EOF
            {
             newCompositeNode(grammarAccess.getConnectionDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionDirection=ruleConnectionDirection();

            state._fsp--;

             current =iv_ruleConnectionDirection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionDirection"


    // $ANTLR start "ruleConnectionDirection"
    // InternalSysML.g:1390:1: ruleConnectionDirection returns [EObject current=null] : ( ( (lv_IN_0_0= 'in' ) ) | ( (lv_OUT_1_0= 'out' ) ) | ( (lv_INOUT_2_0= 'inout' ) ) ) ;
    public final EObject ruleConnectionDirection() throws RecognitionException {
        EObject current = null;

        Token lv_IN_0_0=null;
        Token lv_OUT_1_0=null;
        Token lv_INOUT_2_0=null;


        	enterRule();

        try {
            // InternalSysML.g:1396:2: ( ( ( (lv_IN_0_0= 'in' ) ) | ( (lv_OUT_1_0= 'out' ) ) | ( (lv_INOUT_2_0= 'inout' ) ) ) )
            // InternalSysML.g:1397:2: ( ( (lv_IN_0_0= 'in' ) ) | ( (lv_OUT_1_0= 'out' ) ) | ( (lv_INOUT_2_0= 'inout' ) ) )
            {
            // InternalSysML.g:1397:2: ( ( (lv_IN_0_0= 'in' ) ) | ( (lv_OUT_1_0= 'out' ) ) | ( (lv_INOUT_2_0= 'inout' ) ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt34=1;
                }
                break;
            case 28:
                {
                alt34=2;
                }
                break;
            case 29:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalSysML.g:1398:3: ( (lv_IN_0_0= 'in' ) )
                    {
                    // InternalSysML.g:1398:3: ( (lv_IN_0_0= 'in' ) )
                    // InternalSysML.g:1399:4: (lv_IN_0_0= 'in' )
                    {
                    // InternalSysML.g:1399:4: (lv_IN_0_0= 'in' )
                    // InternalSysML.g:1400:5: lv_IN_0_0= 'in'
                    {
                    lv_IN_0_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_IN_0_0, grammarAccess.getConnectionDirectionAccess().getINInKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConnectionDirectionRule());
                    					}
                    					setWithLastConsumed(current, "IN", lv_IN_0_0, "in");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysML.g:1413:3: ( (lv_OUT_1_0= 'out' ) )
                    {
                    // InternalSysML.g:1413:3: ( (lv_OUT_1_0= 'out' ) )
                    // InternalSysML.g:1414:4: (lv_OUT_1_0= 'out' )
                    {
                    // InternalSysML.g:1414:4: (lv_OUT_1_0= 'out' )
                    // InternalSysML.g:1415:5: lv_OUT_1_0= 'out'
                    {
                    lv_OUT_1_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_OUT_1_0, grammarAccess.getConnectionDirectionAccess().getOUTOutKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConnectionDirectionRule());
                    					}
                    					setWithLastConsumed(current, "OUT", lv_OUT_1_0, "out");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSysML.g:1428:3: ( (lv_INOUT_2_0= 'inout' ) )
                    {
                    // InternalSysML.g:1428:3: ( (lv_INOUT_2_0= 'inout' ) )
                    // InternalSysML.g:1429:4: (lv_INOUT_2_0= 'inout' )
                    {
                    // InternalSysML.g:1429:4: (lv_INOUT_2_0= 'inout' )
                    // InternalSysML.g:1430:5: lv_INOUT_2_0= 'inout'
                    {
                    lv_INOUT_2_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_INOUT_2_0, grammarAccess.getConnectionDirectionAccess().getINOUTInoutKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConnectionDirectionRule());
                    					}
                    					setWithLastConsumed(current, "INOUT", lv_INOUT_2_0, "inout");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionDirection"


    // $ANTLR start "entryRuleConnector"
    // InternalSysML.g:1446:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalSysML.g:1446:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalSysML.g:1447:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalSysML.g:1453:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1459:2: ( (otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) )
            // InternalSysML.g:1460:2: (otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            {
            // InternalSysML.g:1460:2: (otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            // InternalSysML.g:1461:3: otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
            		
            // InternalSysML.g:1465:3: ( (lv_name_1_0= ruleName ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_ID) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalSysML.g:1466:4: (lv_name_1_0= ruleName )
                    {
                    // InternalSysML.g:1466:4: (lv_name_1_0= ruleName )
                    // InternalSysML.g:1467:5: lv_name_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getConnectorAccess().getNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.omg.sysml.usage.SysML.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSysML.g:1484:3: ( ( ruleQualifiedName ) )
            // InternalSysML.g:1485:4: ( ruleQualifiedName )
            {
            // InternalSysML.g:1485:4: ( ruleQualifiedName )
            // InternalSysML.g:1486:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorAccess().getSourceConnectableFeatureCrossReference_2_0());
            				
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalSysML.g:1504:3: ( ( ruleQualifiedName ) )
            // InternalSysML.g:1505:4: ( ruleQualifiedName )
            {
            // InternalSysML.g:1505:4: ( ruleQualifiedName )
            // InternalSysML.g:1506:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorAccess().getTargetConnectableFeatureCrossReference_4_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleUnits"
    // InternalSysML.g:1528:1: entryRuleUnits returns [EObject current=null] : iv_ruleUnits= ruleUnits EOF ;
    public final EObject entryRuleUnits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnits = null;


        try {
            // InternalSysML.g:1528:46: (iv_ruleUnits= ruleUnits EOF )
            // InternalSysML.g:1529:2: iv_ruleUnits= ruleUnits EOF
            {
             newCompositeNode(grammarAccess.getUnitsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnits=ruleUnits();

            state._fsp--;

             current =iv_ruleUnits; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnits"


    // $ANTLR start "ruleUnits"
    // InternalSysML.g:1535:1: ruleUnits returns [EObject current=null] : ( ( (lv_numerator_0_0= ruleUnitsProduct ) ) (otherlv_1= '/' ( (lv_denominator_2_0= ruleUnitsProduct ) ) )? ) ;
    public final EObject ruleUnits() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_numerator_0_0 = null;

        EObject lv_denominator_2_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1541:2: ( ( ( (lv_numerator_0_0= ruleUnitsProduct ) ) (otherlv_1= '/' ( (lv_denominator_2_0= ruleUnitsProduct ) ) )? ) )
            // InternalSysML.g:1542:2: ( ( (lv_numerator_0_0= ruleUnitsProduct ) ) (otherlv_1= '/' ( (lv_denominator_2_0= ruleUnitsProduct ) ) )? )
            {
            // InternalSysML.g:1542:2: ( ( (lv_numerator_0_0= ruleUnitsProduct ) ) (otherlv_1= '/' ( (lv_denominator_2_0= ruleUnitsProduct ) ) )? )
            // InternalSysML.g:1543:3: ( (lv_numerator_0_0= ruleUnitsProduct ) ) (otherlv_1= '/' ( (lv_denominator_2_0= ruleUnitsProduct ) ) )?
            {
            // InternalSysML.g:1543:3: ( (lv_numerator_0_0= ruleUnitsProduct ) )
            // InternalSysML.g:1544:4: (lv_numerator_0_0= ruleUnitsProduct )
            {
            // InternalSysML.g:1544:4: (lv_numerator_0_0= ruleUnitsProduct )
            // InternalSysML.g:1545:5: lv_numerator_0_0= ruleUnitsProduct
            {

            					newCompositeNode(grammarAccess.getUnitsAccess().getNumeratorUnitsProductParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_numerator_0_0=ruleUnitsProduct();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitsRule());
            					}
            					set(
            						current,
            						"numerator",
            						lv_numerator_0_0,
            						"org.omg.sysml.usage.SysML.UnitsProduct");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysML.g:1562:3: (otherlv_1= '/' ( (lv_denominator_2_0= ruleUnitsProduct ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSysML.g:1563:4: otherlv_1= '/' ( (lv_denominator_2_0= ruleUnitsProduct ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnitsAccess().getSolidusKeyword_1_0());
                    			
                    // InternalSysML.g:1567:4: ( (lv_denominator_2_0= ruleUnitsProduct ) )
                    // InternalSysML.g:1568:5: (lv_denominator_2_0= ruleUnitsProduct )
                    {
                    // InternalSysML.g:1568:5: (lv_denominator_2_0= ruleUnitsProduct )
                    // InternalSysML.g:1569:6: lv_denominator_2_0= ruleUnitsProduct
                    {

                    						newCompositeNode(grammarAccess.getUnitsAccess().getDenominatorUnitsProductParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_denominator_2_0=ruleUnitsProduct();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitsRule());
                    						}
                    						set(
                    							current,
                    							"denominator",
                    							lv_denominator_2_0,
                    							"org.omg.sysml.usage.SysML.UnitsProduct");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnits"


    // $ANTLR start "entryRuleUnitsProduct"
    // InternalSysML.g:1591:1: entryRuleUnitsProduct returns [EObject current=null] : iv_ruleUnitsProduct= ruleUnitsProduct EOF ;
    public final EObject entryRuleUnitsProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsProduct = null;


        try {
            // InternalSysML.g:1591:53: (iv_ruleUnitsProduct= ruleUnitsProduct EOF )
            // InternalSysML.g:1592:2: iv_ruleUnitsProduct= ruleUnitsProduct EOF
            {
             newCompositeNode(grammarAccess.getUnitsProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitsProduct=ruleUnitsProduct();

            state._fsp--;

             current =iv_ruleUnitsProduct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitsProduct"


    // $ANTLR start "ruleUnitsProduct"
    // InternalSysML.g:1598:1: ruleUnitsProduct returns [EObject current=null] : ( ( (lv_factor_0_0= ruleUnitsExponent ) ) (otherlv_1= '-' ( (lv_factor_2_0= ruleUnitsExponent ) ) )* ) ;
    public final EObject ruleUnitsProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_factor_0_0 = null;

        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1604:2: ( ( ( (lv_factor_0_0= ruleUnitsExponent ) ) (otherlv_1= '-' ( (lv_factor_2_0= ruleUnitsExponent ) ) )* ) )
            // InternalSysML.g:1605:2: ( ( (lv_factor_0_0= ruleUnitsExponent ) ) (otherlv_1= '-' ( (lv_factor_2_0= ruleUnitsExponent ) ) )* )
            {
            // InternalSysML.g:1605:2: ( ( (lv_factor_0_0= ruleUnitsExponent ) ) (otherlv_1= '-' ( (lv_factor_2_0= ruleUnitsExponent ) ) )* )
            // InternalSysML.g:1606:3: ( (lv_factor_0_0= ruleUnitsExponent ) ) (otherlv_1= '-' ( (lv_factor_2_0= ruleUnitsExponent ) ) )*
            {
            // InternalSysML.g:1606:3: ( (lv_factor_0_0= ruleUnitsExponent ) )
            // InternalSysML.g:1607:4: (lv_factor_0_0= ruleUnitsExponent )
            {
            // InternalSysML.g:1607:4: (lv_factor_0_0= ruleUnitsExponent )
            // InternalSysML.g:1608:5: lv_factor_0_0= ruleUnitsExponent
            {

            					newCompositeNode(grammarAccess.getUnitsProductAccess().getFactorUnitsExponentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_factor_0_0=ruleUnitsExponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitsProductRule());
            					}
            					add(
            						current,
            						"factor",
            						lv_factor_0_0,
            						"org.omg.sysml.usage.SysML.UnitsExponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysML.g:1625:3: (otherlv_1= '-' ( (lv_factor_2_0= ruleUnitsExponent ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==33) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSysML.g:1626:4: otherlv_1= '-' ( (lv_factor_2_0= ruleUnitsExponent ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getUnitsProductAccess().getHyphenMinusKeyword_1_0());
            	    			
            	    // InternalSysML.g:1630:4: ( (lv_factor_2_0= ruleUnitsExponent ) )
            	    // InternalSysML.g:1631:5: (lv_factor_2_0= ruleUnitsExponent )
            	    {
            	    // InternalSysML.g:1631:5: (lv_factor_2_0= ruleUnitsExponent )
            	    // InternalSysML.g:1632:6: lv_factor_2_0= ruleUnitsExponent
            	    {

            	    						newCompositeNode(grammarAccess.getUnitsProductAccess().getFactorUnitsExponentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_factor_2_0=ruleUnitsExponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnitsProductRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factor",
            	    							lv_factor_2_0,
            	    							"org.omg.sysml.usage.SysML.UnitsExponent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitsProduct"


    // $ANTLR start "entryRuleUnitsExponent"
    // InternalSysML.g:1654:1: entryRuleUnitsExponent returns [EObject current=null] : iv_ruleUnitsExponent= ruleUnitsExponent EOF ;
    public final EObject entryRuleUnitsExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsExponent = null;


        try {
            // InternalSysML.g:1654:54: (iv_ruleUnitsExponent= ruleUnitsExponent EOF )
            // InternalSysML.g:1655:2: iv_ruleUnitsExponent= ruleUnitsExponent EOF
            {
             newCompositeNode(grammarAccess.getUnitsExponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitsExponent=ruleUnitsExponent();

            state._fsp--;

             current =iv_ruleUnitsExponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitsExponent"


    // $ANTLR start "ruleUnitsExponent"
    // InternalSysML.g:1661:1: ruleUnitsExponent returns [EObject current=null] : ( ( (lv_unit_0_0= RULE_ID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleIntegerLiteral ) ) )? ) ;
    public final EObject ruleUnitsExponent() throws RecognitionException {
        EObject current = null;

        Token lv_unit_0_0=null;
        Token otherlv_1=null;
        EObject lv_exponent_2_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1667:2: ( ( ( (lv_unit_0_0= RULE_ID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleIntegerLiteral ) ) )? ) )
            // InternalSysML.g:1668:2: ( ( (lv_unit_0_0= RULE_ID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleIntegerLiteral ) ) )? )
            {
            // InternalSysML.g:1668:2: ( ( (lv_unit_0_0= RULE_ID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleIntegerLiteral ) ) )? )
            // InternalSysML.g:1669:3: ( (lv_unit_0_0= RULE_ID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleIntegerLiteral ) ) )?
            {
            // InternalSysML.g:1669:3: ( (lv_unit_0_0= RULE_ID ) )
            // InternalSysML.g:1670:4: (lv_unit_0_0= RULE_ID )
            {
            // InternalSysML.g:1670:4: (lv_unit_0_0= RULE_ID )
            // InternalSysML.g:1671:5: lv_unit_0_0= RULE_ID
            {
            lv_unit_0_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_unit_0_0, grammarAccess.getUnitsExponentAccess().getUnitIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitsExponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"unit",
            						lv_unit_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSysML.g:1687:3: (otherlv_1= '^' ( (lv_exponent_2_0= ruleIntegerLiteral ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSysML.g:1688:4: otherlv_1= '^' ( (lv_exponent_2_0= ruleIntegerLiteral ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnitsExponentAccess().getCircumflexAccentKeyword_1_0());
                    			
                    // InternalSysML.g:1692:4: ( (lv_exponent_2_0= ruleIntegerLiteral ) )
                    // InternalSysML.g:1693:5: (lv_exponent_2_0= ruleIntegerLiteral )
                    {
                    // InternalSysML.g:1693:5: (lv_exponent_2_0= ruleIntegerLiteral )
                    // InternalSysML.g:1694:6: lv_exponent_2_0= ruleIntegerLiteral
                    {

                    						newCompositeNode(grammarAccess.getUnitsExponentAccess().getExponentIntegerLiteralParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exponent_2_0=ruleIntegerLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitsExponentRule());
                    						}
                    						set(
                    							current,
                    							"exponent",
                    							lv_exponent_2_0,
                    							"org.omg.sysml.usage.SysML.IntegerLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitsExponent"


    // $ANTLR start "entryRuleExpression"
    // InternalSysML.g:1716:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSysML.g:1716:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSysML.g:1717:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSysML.g:1723:1: ruleExpression returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericLiteral_0 = null;

        EObject this_FeatureReferenceExpression_1 = null;



        	enterRule();

        try {
            // InternalSysML.g:1729:2: ( (this_NumericLiteral_0= ruleNumericLiteral | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression ) )
            // InternalSysML.g:1730:2: (this_NumericLiteral_0= ruleNumericLiteral | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression )
            {
            // InternalSysML.g:1730:2: (this_NumericLiteral_0= ruleNumericLiteral | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT||LA39_0==33||LA39_0==36) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSysML.g:1731:3: this_NumericLiteral_0= ruleNumericLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNumericLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericLiteral_0=ruleNumericLiteral();

                    state._fsp--;


                    			current = this_NumericLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysML.g:1740:3: this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFeatureReferenceExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureReferenceExpression_1=ruleFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_FeatureReferenceExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFeatureReferenceExpression"
    // InternalSysML.g:1752:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalSysML.g:1752:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalSysML.g:1753:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReferenceExpression=ruleFeatureReferenceExpression();

            state._fsp--;

             current =iv_ruleFeatureReferenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureReferenceExpression"


    // $ANTLR start "ruleFeatureReferenceExpression"
    // InternalSysML.g:1759:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSysML.g:1765:2: ( ( ( ruleQualifiedName ) ) )
            // InternalSysML.g:1766:2: ( ( ruleQualifiedName ) )
            {
            // InternalSysML.g:1766:2: ( ( ruleQualifiedName ) )
            // InternalSysML.g:1767:3: ( ruleQualifiedName )
            {
            // InternalSysML.g:1767:3: ( ruleQualifiedName )
            // InternalSysML.g:1768:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFeatureReferenceExpressionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getFeatureReferenceExpressionAccess().getFeatureFeatureCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureReferenceExpression"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalSysML.g:1785:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalSysML.g:1785:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalSysML.g:1786:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;

             current =iv_ruleNumericLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalSysML.g:1792:1: ruleNumericLiteral returns [EObject current=null] : ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ( (lv_units_2_0= ruleUnits ) )? ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;

        EObject lv_units_2_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1798:2: ( ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ( (lv_units_2_0= ruleUnits ) )? ) )
            // InternalSysML.g:1799:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ( (lv_units_2_0= ruleUnits ) )? )
            {
            // InternalSysML.g:1799:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ( (lv_units_2_0= ruleUnits ) )? )
            // InternalSysML.g:1800:3: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ( (lv_units_2_0= ruleUnits ) )?
            {
            // InternalSysML.g:1800:3: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt40=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_INT) ) {
                    int LA40_3 = input.LA(3);

                    if ( (LA40_3==35) ) {
                        alt40=2;
                    }
                    else if ( (LA40_3==EOF||LA40_3==RULE_ID||LA40_3==12) ) {
                        alt40=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==RULE_INT) ) {
                    int LA40_3 = input.LA(3);

                    if ( (LA40_3==35) ) {
                        alt40=2;
                    }
                    else if ( (LA40_3==EOF||LA40_3==RULE_ID||LA40_3==12) ) {
                        alt40=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA40_3 = input.LA(2);

                if ( (LA40_3==35) ) {
                    alt40=2;
                }
                else if ( (LA40_3==EOF||LA40_3==RULE_ID||LA40_3==12) ) {
                    alt40=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSysML.g:1801:4: this_IntegerLiteral_0= ruleIntegerLiteral
                    {

                    				newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntegerLiteralParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_36);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;


                    				current = this_IntegerLiteral_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSysML.g:1810:4: this_RealLiteral_1= ruleRealLiteral
                    {

                    				newCompositeNode(grammarAccess.getNumericLiteralAccess().getRealLiteralParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_36);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;


                    				current = this_RealLiteral_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSysML.g:1819:3: ( (lv_units_2_0= ruleUnits ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSysML.g:1820:4: (lv_units_2_0= ruleUnits )
                    {
                    // InternalSysML.g:1820:4: (lv_units_2_0= ruleUnits )
                    // InternalSysML.g:1821:5: lv_units_2_0= ruleUnits
                    {

                    					newCompositeNode(grammarAccess.getNumericLiteralAccess().getUnitsUnitsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_units_2_0=ruleUnits();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumericLiteralRule());
                    					}
                    					set(
                    						current,
                    						"units",
                    						lv_units_2_0,
                    						"org.omg.sysml.usage.SysML.Units");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalSysML.g:1842:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalSysML.g:1842:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalSysML.g:1843:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalSysML.g:1849:1: ruleIntegerLiteral returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_sign_0_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1855:2: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalSysML.g:1856:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalSysML.g:1856:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // InternalSysML.g:1857:3: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalSysML.g:1857:3: ( (lv_sign_0_0= ruleSign ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33||LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSysML.g:1858:4: (lv_sign_0_0= ruleSign )
                    {
                    // InternalSysML.g:1858:4: (lv_sign_0_0= ruleSign )
                    // InternalSysML.g:1859:5: lv_sign_0_0= ruleSign
                    {

                    					newCompositeNode(grammarAccess.getIntegerLiteralAccess().getSignSignParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_sign_0_0=ruleSign();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
                    					}
                    					set(
                    						current,
                    						"sign",
                    						lv_sign_0_0,
                    						"org.omg.sysml.usage.SysML.Sign");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSysML.g:1876:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalSysML.g:1877:4: (lv_value_1_0= RULE_INT )
            {
            // InternalSysML.g:1877:4: (lv_value_1_0= RULE_INT )
            // InternalSysML.g:1878:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalSysML.g:1898:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalSysML.g:1898:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalSysML.g:1899:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalSysML.g:1905:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_integerPart_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_fractionPart_3_0= RULE_INT ) )? ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_integerPart_1_0=null;
        Token otherlv_2=null;
        Token lv_fractionPart_3_0=null;
        EObject lv_sign_0_0 = null;



        	enterRule();

        try {
            // InternalSysML.g:1911:2: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_integerPart_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_fractionPart_3_0= RULE_INT ) )? ) )
            // InternalSysML.g:1912:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_integerPart_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_fractionPart_3_0= RULE_INT ) )? )
            {
            // InternalSysML.g:1912:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_integerPart_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_fractionPart_3_0= RULE_INT ) )? )
            // InternalSysML.g:1913:3: ( (lv_sign_0_0= ruleSign ) )? ( (lv_integerPart_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_fractionPart_3_0= RULE_INT ) )?
            {
            // InternalSysML.g:1913:3: ( (lv_sign_0_0= ruleSign ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33||LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSysML.g:1914:4: (lv_sign_0_0= ruleSign )
                    {
                    // InternalSysML.g:1914:4: (lv_sign_0_0= ruleSign )
                    // InternalSysML.g:1915:5: lv_sign_0_0= ruleSign
                    {

                    					newCompositeNode(grammarAccess.getRealLiteralAccess().getSignSignParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_sign_0_0=ruleSign();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRealLiteralRule());
                    					}
                    					set(
                    						current,
                    						"sign",
                    						lv_sign_0_0,
                    						"org.omg.sysml.usage.SysML.Sign");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSysML.g:1932:3: ( (lv_integerPart_1_0= RULE_INT ) )
            // InternalSysML.g:1933:4: (lv_integerPart_1_0= RULE_INT )
            {
            // InternalSysML.g:1933:4: (lv_integerPart_1_0= RULE_INT )
            // InternalSysML.g:1934:5: lv_integerPart_1_0= RULE_INT
            {
            lv_integerPart_1_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_integerPart_1_0, grammarAccess.getRealLiteralAccess().getIntegerPartINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRealLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integerPart",
            						lv_integerPart_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getRealLiteralAccess().getFullStopKeyword_2());
            		
            // InternalSysML.g:1954:3: ( (lv_fractionPart_3_0= RULE_INT ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSysML.g:1955:4: (lv_fractionPart_3_0= RULE_INT )
                    {
                    // InternalSysML.g:1955:4: (lv_fractionPart_3_0= RULE_INT )
                    // InternalSysML.g:1956:5: lv_fractionPart_3_0= RULE_INT
                    {
                    lv_fractionPart_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_fractionPart_3_0, grammarAccess.getRealLiteralAccess().getFractionPartINTTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"fractionPart",
                    						lv_fractionPart_3_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleSign"
    // InternalSysML.g:1976:1: entryRuleSign returns [EObject current=null] : iv_ruleSign= ruleSign EOF ;
    public final EObject entryRuleSign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSign = null;


        try {
            // InternalSysML.g:1976:45: (iv_ruleSign= ruleSign EOF )
            // InternalSysML.g:1977:2: iv_ruleSign= ruleSign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSign=ruleSign();

            state._fsp--;

             current =iv_ruleSign; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSign"


    // $ANTLR start "ruleSign"
    // InternalSysML.g:1983:1: ruleSign returns [EObject current=null] : ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) ) ;
    public final EObject ruleSign() throws RecognitionException {
        EObject current = null;

        Token lv_PLUS_0_0=null;
        Token lv_MINUS_1_0=null;


        	enterRule();

        try {
            // InternalSysML.g:1989:2: ( ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) ) )
            // InternalSysML.g:1990:2: ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) )
            {
            // InternalSysML.g:1990:2: ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==36) ) {
                alt45=1;
            }
            else if ( (LA45_0==33) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalSysML.g:1991:3: ( (lv_PLUS_0_0= '+' ) )
                    {
                    // InternalSysML.g:1991:3: ( (lv_PLUS_0_0= '+' ) )
                    // InternalSysML.g:1992:4: (lv_PLUS_0_0= '+' )
                    {
                    // InternalSysML.g:1992:4: (lv_PLUS_0_0= '+' )
                    // InternalSysML.g:1993:5: lv_PLUS_0_0= '+'
                    {
                    lv_PLUS_0_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_PLUS_0_0, grammarAccess.getSignAccess().getPLUSPlusSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSignRule());
                    					}
                    					setWithLastConsumed(current, "PLUS", lv_PLUS_0_0, "+");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysML.g:2006:3: ( (lv_MINUS_1_0= '-' ) )
                    {
                    // InternalSysML.g:2006:3: ( (lv_MINUS_1_0= '-' ) )
                    // InternalSysML.g:2007:4: (lv_MINUS_1_0= '-' )
                    {
                    // InternalSysML.g:2007:4: (lv_MINUS_1_0= '-' )
                    // InternalSysML.g:2008:5: lv_MINUS_1_0= '-'
                    {
                    lv_MINUS_1_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_MINUS_1_0, grammarAccess.getSignAccess().getMINUSHyphenMinusKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSignRule());
                    					}
                    					setWithLastConsumed(current, "MINUS", lv_MINUS_1_0, "-");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSign"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSysML.g:2024:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSysML.g:2024:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSysML.g:2025:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSysML.g:2031:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalSysML.g:2037:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalSysML.g:2038:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalSysML.g:2038:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalSysML.g:2039:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSysML.g:2049:3: (kw= '.' this_Name_2= ruleName )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==35) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSysML.g:2050:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,35,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_40);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleName"
    // InternalSysML.g:2070:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalSysML.g:2070:44: (iv_ruleName= ruleName EOF )
            // InternalSysML.g:2071:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalSysML.g:2077:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSysML.g:2083:2: (this_ID_0= RULE_ID )
            // InternalSysML.g:2084:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000381B4820L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000049000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000038010020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000E09000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C09000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000809000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000781B4820L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000A41000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000841000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001200000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000A01000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001200000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000002L});

}