package org.omg.sysml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.omg.sysml.services.AlfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'is'", "';'", "'class'", "'feature'", "'abstract'", "'specializes'", "','", "'port'", "'connector'", "':'", "'['", "'..'", "']'", "'='", "'redefines'", "'subsets'", "'=>'", "'@'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'null'", "'.'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int RULE_ID=7;
    public static final int RULE_NATURAL_VALUE=6;
    public static final int RULE_INLINE_STATEMENT=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_BOOLEAN_VALUE=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_UNRESTRICTED_NAME=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=5;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAlfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlf.g"; }



     	private AlfGrammarAccess grammarAccess;

        public InternalAlfParser(TokenStream input, AlfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UnitDefinition";
       	}

       	@Override
       	protected AlfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUnitDefinition"
    // InternalAlf.g:65:1: entryRuleUnitDefinition returns [EObject current=null] : iv_ruleUnitDefinition= ruleUnitDefinition EOF ;
    public final EObject entryRuleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitDefinition = null;


        try {
            // InternalAlf.g:65:55: (iv_ruleUnitDefinition= ruleUnitDefinition EOF )
            // InternalAlf.g:66:2: iv_ruleUnitDefinition= ruleUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitDefinition=ruleUnitDefinition();

            state._fsp--;

             current =iv_ruleUnitDefinition; 
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
    // $ANTLR end "entryRuleUnitDefinition"


    // $ANTLR start "ruleUnitDefinition"
    // InternalAlf.g:72:1: ruleUnitDefinition returns [EObject current=null] : (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition ) ;
    public final EObject ruleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;

        EObject this_ClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:78:2: ( (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition ) )
            // InternalAlf.g:79:2: (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition )
            {
            // InternalAlf.g:79:2: (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==20||LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:80:3: this_PackageDefinition_0= rulePackageDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getPackageDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDefinition_0=rulePackageDefinition();

                    state._fsp--;


                    			current = this_PackageDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:89:3: this_ClassDefinition_1= ruleClassDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getClassDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDefinition_1=ruleClassDefinition();

                    state._fsp--;


                    			current = this_ClassDefinition_1;
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
    // $ANTLR end "ruleUnitDefinition"


    // $ANTLR start "entryRulePackageDefinition"
    // InternalAlf.g:101:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // InternalAlf.g:101:58: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // InternalAlf.g:102:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
             newCompositeNode(grammarAccess.getPackageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDefinition=rulePackageDefinition();

            state._fsp--;

             current =iv_rulePackageDefinition; 
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
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalAlf.g:108:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedMembership_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:114:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' ) )
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' )
            {
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' )
            // InternalAlf.g:116:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:120:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:121:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:121:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:122:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlf.g:143:3: ( (lv_ownedMembership_3_0= rulePackageMember ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_UNRESTRICTED_NAME)||LA2_0==15||LA2_0==18||(LA2_0>=20 && LA2_0<=22)||(LA2_0>=32 && LA2_0<=33)||(LA2_0>=47 && LA2_0<=50)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:144:4: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:144:4: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:145:5: lv_ownedMembership_3_0= rulePackageMember
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedMembership_3_0=rulePackageMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMembership",
            	    						lv_ownedMembership_3_0,
            	    						"org.omg.sysml.Alf.PackageMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRulePackageDefinitionOrStub"
    // InternalAlf.g:170:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:170:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:171:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getPackageDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDefinitionOrStub=rulePackageDefinitionOrStub();

            state._fsp--;

             current =iv_rulePackageDefinitionOrStub; 
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
    // $ANTLR end "entryRulePackageDefinitionOrStub"


    // $ANTLR start "rulePackageDefinitionOrStub"
    // InternalAlf.g:177:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:183:2: (this_PackageDefinition_0= rulePackageDefinition )
            // InternalAlf.g:184:2: this_PackageDefinition_0= rulePackageDefinition
            {

            		newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getPackageDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PackageDefinition_0=rulePackageDefinition();

            state._fsp--;


            		current = this_PackageDefinition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "rulePackageDefinitionOrStub"


    // $ANTLR start "entryRulePackageMember"
    // InternalAlf.g:195:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:195:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:196:2: iv_rulePackageMember= rulePackageMember EOF
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
    // InternalAlf.g:202:1: rulePackageMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_PackagedFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:208:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember ) )
            // InternalAlf.g:209:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember )
            {
            // InternalAlf.g:209:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 47:
                {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=RULE_ID && LA3_1<=RULE_UNRESTRICTED_NAME)||LA3_1==18||LA3_1==21||(LA3_1>=32 && LA3_1<=33)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==15||LA3_1==20||LA3_1==22) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==15||LA3_2==20||LA3_2==22) ) {
                    alt3=1;
                }
                else if ( ((LA3_2>=RULE_ID && LA3_2<=RULE_UNRESTRICTED_NAME)||LA3_2==18||LA3_2==21||(LA3_2>=32 && LA3_2<=33)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=RULE_ID && LA3_3<=RULE_UNRESTRICTED_NAME)||LA3_3==18||LA3_3==21||(LA3_3>=32 && LA3_3<=33)) ) {
                    alt3=2;
                }
                else if ( (LA3_3==15||LA3_3==20||LA3_3==22) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=RULE_ID && LA3_4<=RULE_UNRESTRICTED_NAME)||LA3_4==18||LA3_4==21||(LA3_4>=32 && LA3_4<=33)) ) {
                    alt3=2;
                }
                else if ( (LA3_4==15||LA3_4==20||LA3_4==22) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 20:
            case 22:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 18:
            case 21:
            case 32:
            case 33:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAlf.g:210:3: this_NonFeatureMember_0= ruleNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getNonFeatureMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMember_0=ruleNonFeatureMember();

                    state._fsp--;


                    			current = this_NonFeatureMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:219:3: this_PackagedFeatureMember_1= rulePackagedFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getPackagedFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackagedFeatureMember_1=rulePackagedFeatureMember();

                    state._fsp--;


                    			current = this_PackagedFeatureMember_1;
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


    // $ANTLR start "entryRuleNonFeatureMember"
    // InternalAlf.g:231:1: entryRuleNonFeatureMember returns [EObject current=null] : iv_ruleNonFeatureMember= ruleNonFeatureMember EOF ;
    public final EObject entryRuleNonFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureMember = null;


        try {
            // InternalAlf.g:231:57: (iv_ruleNonFeatureMember= ruleNonFeatureMember EOF )
            // InternalAlf.g:232:2: iv_ruleNonFeatureMember= ruleNonFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureMember=ruleNonFeatureMember();

            state._fsp--;

             current =iv_ruleNonFeatureMember; 
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
    // $ANTLR end "entryRuleNonFeatureMember"


    // $ANTLR start "ruleNonFeatureMember"
    // InternalAlf.g:238:1: ruleNonFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) ;
    public final EObject ruleNonFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_1_0 = null;

        AntlrDatatypeRuleToken lv_memberName_3_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:244:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) )
            // InternalAlf.g:245:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            {
            // InternalAlf.g:245:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            // InternalAlf.g:246:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            {
            // InternalAlf.g:246:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=47 && LA4_0<=50)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlf.g:247:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:247:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:248:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:265:3: ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:266:4: ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:266:4: ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:267:5: (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:267:5: (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:268:6: lv_ownedMemberElement_1_0= ruleNonFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_1_0=ruleNonFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_1_0,
                    							"org.omg.sysml.Alf.NonFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:286:4: (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    {
                    // InternalAlf.g:286:4: (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    // InternalAlf.g:287:5: otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    					newLeafNode(otherlv_2, grammarAccess.getNonFeatureMemberAccess().getPackageKeyword_1_1_0());
                    				
                    // InternalAlf.g:291:5: ( (lv_memberName_3_0= ruleName ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAlf.g:292:6: (lv_memberName_3_0= ruleName )
                            {
                            // InternalAlf.g:292:6: (lv_memberName_3_0= ruleName )
                            // InternalAlf.g:293:7: lv_memberName_3_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_memberName_3_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_3_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getNonFeatureMemberAccess().getIsKeyword_1_1_2());
                    				
                    // InternalAlf.g:314:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:315:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:315:6: ( ruleQualifiedName )
                    // InternalAlf.g:316:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberElementPackageCrossReference_1_1_3_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_1_4());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:336:4: (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:336:4: (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:337:5: otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_7); 

                    					newLeafNode(otherlv_7, grammarAccess.getNonFeatureMemberAccess().getClassKeyword_1_2_0());
                    				
                    // InternalAlf.g:341:5: ( (lv_memberName_8_0= ruleName ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAlf.g:342:6: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:342:6: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:343:7: lv_memberName_8_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_memberName_8_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_8_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_9, grammarAccess.getNonFeatureMemberAccess().getIsKeyword_1_2_2());
                    				
                    // InternalAlf.g:364:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:365:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:365:6: ( ruleQualifiedName )
                    // InternalAlf.g:366:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberElementClassCrossReference_1_2_3_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_2_4());
                    				

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
    // $ANTLR end "ruleNonFeatureMember"


    // $ANTLR start "entryRulePackagedFeatureMember"
    // InternalAlf.g:390:1: entryRulePackagedFeatureMember returns [EObject current=null] : iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF ;
    public final EObject entryRulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedFeatureMember = null;


        try {
            // InternalAlf.g:390:62: (iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF )
            // InternalAlf.g:391:2: iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getPackagedFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagedFeatureMember=rulePackagedFeatureMember();

            state._fsp--;

             current =iv_rulePackagedFeatureMember; 
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
    // $ANTLR end "entryRulePackagedFeatureMember"


    // $ANTLR start "rulePackagedFeatureMember"
    // InternalAlf.g:397:1: rulePackagedFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) ) | ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) ;
    public final EObject rulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:403:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) ) | ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) )
            // InternalAlf.g:404:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) ) | ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
            {
            // InternalAlf.g:404:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) ) | ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
            // InternalAlf.g:405:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) ) | ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
            {
            // InternalAlf.g:405:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=47 && LA8_0<=50)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:406:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:406:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:407:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:424:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) ) | ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:425:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:425:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:426:5: (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:426:5: (otherlv_1= 'feature' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAlf.g:427:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_10); 

                            						newLeafNode(otherlv_1, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:432:5: ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:433:6: (lv_ownedMemberElement_2_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:433:6: (lv_ownedMemberElement_2_0= ruleFeatureDefinition )
                    // InternalAlf.g:434:7: lv_ownedMemberElement_2_0= ruleFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_2_0,
                    								"org.omg.sysml.Alf.FeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:453:4: ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                    {
                    // InternalAlf.g:453:4: ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                    // InternalAlf.g:454:5: ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';'
                    {
                    // InternalAlf.g:454:5: ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAlf.g:455:6: (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? )
                            {
                            // InternalAlf.g:455:6: (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? )
                            // InternalAlf.g:456:7: otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )?
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_7); 

                            							newLeafNode(otherlv_3, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0_0_0());
                            						
                            // InternalAlf.g:460:7: ( (lv_memberName_4_0= ruleName ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalAlf.g:461:8: (lv_memberName_4_0= ruleName )
                                    {
                                    // InternalAlf.g:461:8: (lv_memberName_4_0= ruleName )
                                    // InternalAlf.g:462:9: lv_memberName_4_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_8);
                                    lv_memberName_4_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_4_0,
                                    										"org.omg.sysml.Alf.Name");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:481:6: ( (lv_memberName_5_0= ruleName ) )
                            {
                            // InternalAlf.g:481:6: ( (lv_memberName_5_0= ruleName ) )
                            // InternalAlf.g:482:7: (lv_memberName_5_0= ruleName )
                            {
                            // InternalAlf.g:482:7: (lv_memberName_5_0= ruleName )
                            // InternalAlf.g:483:8: lv_memberName_5_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_0_1_0());
                            							
                            pushFollow(FOLLOW_8);
                            lv_memberName_5_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_5_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_1_1_1());
                    				
                    // InternalAlf.g:505:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:506:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:506:6: ( ruleQualifiedName )
                    // InternalAlf.g:507:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_1_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_1_3());
                    				

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
    // $ANTLR end "rulePackagedFeatureMember"


    // $ANTLR start "entryRuleNonFeatureDefinition"
    // InternalAlf.g:531:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:531:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:532:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureDefinition=ruleNonFeatureDefinition();

            state._fsp--;

             current =iv_ruleNonFeatureDefinition; 
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
    // $ANTLR end "entryRuleNonFeatureDefinition"


    // $ANTLR start "ruleNonFeatureDefinition"
    // InternalAlf.g:538:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:544:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) )
            // InternalAlf.g:545:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            {
            // InternalAlf.g:545:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==20||LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:546:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDefinitionOrStub_0=rulePackageDefinitionOrStub();

                    state._fsp--;


                    			current = this_PackageDefinitionOrStub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:555:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassifierDefinitionOrStub_1=ruleClassifierDefinitionOrStub();

                    state._fsp--;


                    			current = this_ClassifierDefinitionOrStub_1;
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
    // $ANTLR end "ruleNonFeatureDefinition"


    // $ANTLR start "entryRuleClassifierDefinitionOrStub"
    // InternalAlf.g:567:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:567:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:568:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getClassifierDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierDefinitionOrStub=ruleClassifierDefinitionOrStub();

            state._fsp--;

             current =iv_ruleClassifierDefinitionOrStub; 
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
    // $ANTLR end "entryRuleClassifierDefinitionOrStub"


    // $ANTLR start "ruleClassifierDefinitionOrStub"
    // InternalAlf.g:574:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:580:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub )
            // InternalAlf.g:581:2: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
            {

            		newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassDefinitionOrStub_0=ruleClassDefinitionOrStub();

            state._fsp--;


            		current = this_ClassDefinitionOrStub_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleClassifierDefinitionOrStub"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalAlf.g:592:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:592:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:593:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
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
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalAlf.g:599:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_ownedMembership_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:605:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:606:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:606:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:607:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:607:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:608:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:608:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:609:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,22,FOLLOW_11); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalAlf.g:625:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:626:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:626:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:627:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:644:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18||LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlf.g:645:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:645:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==18) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==23) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:646:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:651:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:656:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:657:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:657:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:658:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ownedMembership_5_0=ruleOwnedGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedMembership",
                    							lv_ownedMembership_5_0,
                    							"org.omg.sysml.Alf.OwnedGeneralization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:675:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==24) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAlf.g:676:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:680:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:681:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:681:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:682:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_ownedMembership_7_0=ruleOwnedGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_7_0,
                    	    								"org.omg.sysml.Alf.OwnedGeneralization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


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
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleOwnedGeneralization"
    // InternalAlf.g:705:1: entryRuleOwnedGeneralization returns [EObject current=null] : iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF ;
    public final EObject entryRuleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedGeneralization = null;


        try {
            // InternalAlf.g:705:60: (iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF )
            // InternalAlf.g:706:2: iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF
            {
             newCompositeNode(grammarAccess.getOwnedGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedGeneralization=ruleOwnedGeneralization();

            state._fsp--;

             current =iv_ruleOwnedGeneralization; 
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
    // $ANTLR end "entryRuleOwnedGeneralization"


    // $ANTLR start "ruleOwnedGeneralization"
    // InternalAlf.g:712:1: ruleOwnedGeneralization returns [EObject current=null] : ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) ;
    public final EObject ruleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:718:2: ( ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) )
            // InternalAlf.g:719:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            {
            // InternalAlf.g:719:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            // InternalAlf.g:720:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            {
            // InternalAlf.g:720:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            // InternalAlf.g:721:4: lv_ownedMemberElement_0_0= ruleGeneralization
            {

            				newCompositeNode(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementGeneralizationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedMemberElement_0_0=ruleGeneralization();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOwnedGeneralizationRule());
            				}
            				set(
            					current,
            					"ownedMemberElement",
            					lv_ownedMemberElement_0_0,
            					"org.omg.sysml.Alf.Generalization");
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
    // $ANTLR end "ruleOwnedGeneralization"


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:741:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:741:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:742:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
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
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalAlf.g:748:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:754:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:755:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:755:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:756:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:756:3: ( ruleQualifiedName )
            // InternalAlf.g:757:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGeneralizationRule());
            				}
            			

            				newCompositeNode(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0());
            			
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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleClassDefinition"
    // InternalAlf.g:774:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:774:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:775:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;

             current =iv_ruleClassDefinition; 
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
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // InternalAlf.g:781:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:787:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:788:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:788:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            // InternalAlf.g:789:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:801:3: ( (lv_ownedMembership_2_0= ruleClassMember ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_UNRESTRICTED_NAME)||LA18_0==15||LA18_0==18||(LA18_0>=20 && LA18_0<=22)||(LA18_0>=25 && LA18_0<=26)||(LA18_0>=32 && LA18_0<=33)||(LA18_0>=47 && LA18_0<=50)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAlf.g:802:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:802:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    // InternalAlf.g:803:5: lv_ownedMembership_2_0= ruleClassMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_ownedMembership_2_0=ruleClassMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMembership",
            	    						lv_ownedMembership_2_0,
            	    						"org.omg.sysml.Alf.ClassMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:828:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:828:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:829:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinitionOrStub=ruleClassDefinitionOrStub();

            state._fsp--;

             current =iv_ruleClassDefinitionOrStub; 
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
    // $ANTLR end "entryRuleClassDefinitionOrStub"


    // $ANTLR start "ruleClassDefinitionOrStub"
    // InternalAlf.g:835:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:841:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:842:2: this_ClassDefinition_0= ruleClassDefinition
            {

            		newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getClassDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassDefinition_0=ruleClassDefinition();

            state._fsp--;


            		current = this_ClassDefinition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleClassDefinitionOrStub"


    // $ANTLR start "entryRuleClassMember"
    // InternalAlf.g:853:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:853:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:854:2: iv_ruleClassMember= ruleClassMember EOF
            {
             newCompositeNode(grammarAccess.getClassMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassMember=ruleClassMember();

            state._fsp--;

             current =iv_ruleClassMember; 
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
    // $ANTLR end "entryRuleClassMember"


    // $ANTLR start "ruleClassMember"
    // InternalAlf.g:860:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_ClassFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:866:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) )
            // InternalAlf.g:867:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            {
            // InternalAlf.g:867:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            int alt19=2;
            switch ( input.LA(1) ) {
            case 47:
                {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>=RULE_ID && LA19_1<=RULE_UNRESTRICTED_NAME)||LA19_1==18||LA19_1==21||LA19_1==25||(LA19_1>=32 && LA19_1<=33)) ) {
                    alt19=2;
                }
                else if ( (LA19_1==15||LA19_1==20||LA19_1==22) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==15||LA19_2==20||LA19_2==22) ) {
                    alt19=1;
                }
                else if ( ((LA19_2>=RULE_ID && LA19_2<=RULE_UNRESTRICTED_NAME)||LA19_2==18||LA19_2==21||LA19_2==25||(LA19_2>=32 && LA19_2<=33)) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA19_3 = input.LA(2);

                if ( ((LA19_3>=RULE_ID && LA19_3<=RULE_UNRESTRICTED_NAME)||LA19_3==18||LA19_3==21||LA19_3==25||(LA19_3>=32 && LA19_3<=33)) ) {
                    alt19=2;
                }
                else if ( (LA19_3==15||LA19_3==20||LA19_3==22) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                int LA19_4 = input.LA(2);

                if ( ((LA19_4>=RULE_ID && LA19_4<=RULE_UNRESTRICTED_NAME)||LA19_4==18||LA19_4==21||LA19_4==25||(LA19_4>=32 && LA19_4<=33)) ) {
                    alt19=2;
                }
                else if ( (LA19_4==15||LA19_4==20||LA19_4==22) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 20:
            case 22:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 18:
            case 21:
            case 25:
            case 26:
            case 32:
            case 33:
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAlf.g:868:3: this_NonFeatureMember_0= ruleNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getClassMemberAccess().getNonFeatureMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMember_0=ruleNonFeatureMember();

                    state._fsp--;


                    			current = this_NonFeatureMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:877:3: this_ClassFeatureMember_1= ruleClassFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getClassMemberAccess().getClassFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassFeatureMember_1=ruleClassFeatureMember();

                    state._fsp--;


                    			current = this_ClassFeatureMember_1;
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
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleClassFeatureMember"
    // InternalAlf.g:889:1: entryRuleClassFeatureMember returns [EObject current=null] : iv_ruleClassFeatureMember= ruleClassFeatureMember EOF ;
    public final EObject entryRuleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassFeatureMember = null;


        try {
            // InternalAlf.g:889:59: (iv_ruleClassFeatureMember= ruleClassFeatureMember EOF )
            // InternalAlf.g:890:2: iv_ruleClassFeatureMember= ruleClassFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getClassFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassFeatureMember=ruleClassFeatureMember();

            state._fsp--;

             current =iv_ruleClassFeatureMember; 
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
    // $ANTLR end "entryRuleClassFeatureMember"


    // $ANTLR start "ruleClassFeatureMember"
    // InternalAlf.g:896:1: ruleClassFeatureMember returns [EObject current=null] : ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'connector' ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) ;
    public final EObject ruleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isPort_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        EObject lv_ownedMemberElement_6_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;

        AntlrDatatypeRuleToken lv_memberName_9_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:902:2: ( ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'connector' ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) )
            // InternalAlf.g:903:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'connector' ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )
            {
            // InternalAlf.g:903:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'connector' ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:904:3: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:904:3: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:905:4: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:905:4: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=47 && LA20_0<=50)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAlf.g:906:5: (lv_visibility_0_0= ruleVisibilityIndicator )
                            {
                            // InternalAlf.g:906:5: (lv_visibility_0_0= ruleVisibilityIndicator )
                            // InternalAlf.g:907:6: lv_visibility_0_0= ruleVisibilityIndicator
                            {

                            						newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_15);
                            lv_visibility_0_0=ruleVisibilityIndicator();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            						}
                            						set(
                            							current,
                            							"visibility",
                            							lv_visibility_0_0,
                            							"org.omg.sysml.Alf.VisibilityIndicator");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:924:4: (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )?
                    int alt21=3;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==21) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==25) ) {
                        alt21=2;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAlf.g:925:5: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_10); 

                            					newLeafNode(otherlv_1, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:930:5: ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) )
                            {
                            // InternalAlf.g:930:5: ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) )
                            // InternalAlf.g:931:6: ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )
                            {
                            // InternalAlf.g:931:6: ( (lv_isPort_2_0= 'port' ) )
                            // InternalAlf.g:932:7: (lv_isPort_2_0= 'port' )
                            {
                            // InternalAlf.g:932:7: (lv_isPort_2_0= 'port' )
                            // InternalAlf.g:933:8: lv_isPort_2_0= 'port'
                            {
                            lv_isPort_2_0=(Token)match(input,25,FOLLOW_16); 

                            								newLeafNode(lv_isPort_2_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_0_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }

                            // InternalAlf.g:945:6: ( (lv_direction_3_0= ruleFeatureDirection ) )
                            // InternalAlf.g:946:7: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:946:7: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:947:8: lv_direction_3_0= ruleFeatureDirection
                            {

                            								newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_0_1_1_1_0());
                            							
                            pushFollow(FOLLOW_10);
                            lv_direction_3_0=ruleFeatureDirection();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"direction",
                            									lv_direction_3_0,
                            									"org.omg.sysml.Alf.FeatureDirection");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:966:4: ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:967:5: (lv_ownedMemberElement_4_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:967:5: (lv_ownedMemberElement_4_0= ruleFeatureDefinition )
                    // InternalAlf.g:968:6: lv_ownedMemberElement_4_0= ruleFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_4_0,
                    							"org.omg.sysml.Alf.FeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:987:3: (otherlv_5= 'connector' ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:987:3: (otherlv_5= 'connector' ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:988:4: otherlv_5= 'connector' ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_0());
                    			
                    // InternalAlf.g:992:4: ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:993:5: (lv_ownedMemberElement_6_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:993:5: (lv_ownedMemberElement_6_0= ruleConnectorDefinition )
                    // InternalAlf.g:994:6: lv_ownedMemberElement_6_0= ruleConnectorDefinition
                    {

                    						newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_6_0=ruleConnectorDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_6_0,
                    							"org.omg.sysml.Alf.ConnectorDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1013:3: ( ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    {
                    // InternalAlf.g:1013:3: ( ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    // InternalAlf.g:1014:4: ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';'
                    {
                    // InternalAlf.g:1014:4: ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==21) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:1015:5: (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1015:5: (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? )
                            // InternalAlf.g:1016:6: otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )?
                            {
                            otherlv_7=(Token)match(input,21,FOLLOW_7); 

                            						newLeafNode(otherlv_7, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_2_0_0_0());
                            					
                            // InternalAlf.g:1020:6: ( (lv_memberName_8_0= ruleName ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalAlf.g:1021:7: (lv_memberName_8_0= ruleName )
                                    {
                                    // InternalAlf.g:1021:7: (lv_memberName_8_0= ruleName )
                                    // InternalAlf.g:1022:8: lv_memberName_8_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_2_0_0_1_0());
                                    							
                                    pushFollow(FOLLOW_8);
                                    lv_memberName_8_0=ruleName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                                    								}
                                    								set(
                                    									current,
                                    									"memberName",
                                    									lv_memberName_8_0,
                                    									"org.omg.sysml.Alf.Name");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1041:5: ( (lv_memberName_9_0= ruleName ) )
                            {
                            // InternalAlf.g:1041:5: ( (lv_memberName_9_0= ruleName ) )
                            // InternalAlf.g:1042:6: (lv_memberName_9_0= ruleName )
                            {
                            // InternalAlf.g:1042:6: (lv_memberName_9_0= ruleName )
                            // InternalAlf.g:1043:7: lv_memberName_9_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_memberName_9_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_9_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassFeatureMemberAccess().getIsKeyword_2_1());
                    			
                    // InternalAlf.g:1065:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1066:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1066:5: ( ruleQualifiedName )
                    // InternalAlf.g:1067:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberElementFeatureCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_2_3());
                    			

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
    // $ANTLR end "ruleClassFeatureMember"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:1090:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:1090:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:1091:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureDefinition=ruleFeatureDefinition();

            state._fsp--;

             current =iv_ruleFeatureDefinition; 
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
    // $ANTLR end "entryRuleFeatureDefinition"


    // $ANTLR start "ruleFeatureDefinition"
    // InternalAlf.g:1097:1: ruleFeatureDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']' )? ( ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | ( ( (lv_name_15_0= ruleName ) )? ( (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) ) | (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' ) ) ) ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMembership_3_0 = null;

        EObject lv_lower_5_0 = null;

        EObject lv_upper_7_0 = null;

        EObject lv_value_10_0 = null;

        EObject lv_ownedMembership_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_ownedMembership_16_0 = null;

        EObject lv_lower_18_0 = null;

        EObject lv_upper_20_0 = null;

        EObject lv_value_23_0 = null;

        EObject lv_ownedMembership_26_0 = null;

        EObject lv_lower_29_0 = null;

        EObject lv_upper_31_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1103:2: ( ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']' )? ( ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | ( ( (lv_name_15_0= ruleName ) )? ( (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) ) | (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' ) ) ) ) )
            // InternalAlf.g:1104:2: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']' )? ( ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | ( ( (lv_name_15_0= ruleName ) )? ( (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) ) | (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' ) ) ) )
            {
            // InternalAlf.g:1104:2: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']' )? ( ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | ( ( (lv_name_15_0= ruleName ) )? ( (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) ) | (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' ) ) ) )
            int alt39=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==16||LA39_1==19||(LA39_1>=27 && LA39_1<=28)||LA39_1==31) ) {
                    alt39=1;
                }
                else if ( (LA39_1==18||(LA39_1>=32 && LA39_1<=33)) ) {
                    alt39=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==16||LA39_2==19||(LA39_2>=27 && LA39_2<=28)||LA39_2==31) ) {
                    alt39=1;
                }
                else if ( (LA39_2==18||(LA39_2>=32 && LA39_2<=33)) ) {
                    alt39=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
            case 32:
            case 33:
                {
                alt39=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAlf.g:1105:3: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']' )? ( ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) )
                    {
                    // InternalAlf.g:1105:3: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']' )? ( ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) )
                    // InternalAlf.g:1106:4: ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']' )? ( ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) )
                    {
                    // InternalAlf.g:1106:4: ( (lv_name_0_0= ruleName ) )
                    // InternalAlf.g:1107:5: (lv_name_0_0= ruleName )
                    {
                    // InternalAlf.g:1107:5: (lv_name_0_0= ruleName )
                    // InternalAlf.g:1108:6: lv_name_0_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_name_0_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.omg.sysml.Alf.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1125:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==27) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAlf.g:1126:5: otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )?
                            {
                            otherlv_1=(Token)match(input,27,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getFeatureDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:1130:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:1131:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:1131:6: ( ruleQualifiedName )
                            // InternalAlf.g:1132:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_0_1_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalAlf.g:1146:5: ( (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset ) )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==18||(LA25_0>=32 && LA25_0<=33)) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalAlf.g:1147:6: (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset )
                                    {
                                    // InternalAlf.g:1147:6: (lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset )
                                    // InternalAlf.g:1148:7: lv_ownedMembership_3_0= ruleOwnedRedefinitionOrSubset
                                    {

                                    							newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_0_1_2_0());
                                    						
                                    pushFollow(FOLLOW_19);
                                    lv_ownedMembership_3_0=ruleOwnedRedefinitionOrSubset();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    							}
                                    							add(
                                    								current,
                                    								"ownedMembership",
                                    								lv_ownedMembership_3_0,
                                    								"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1166:4: (otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==28) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAlf.g:1167:5: otherlv_4= '[' ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )? ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_20); 

                            					newLeafNode(otherlv_4, grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_0_2_0());
                            				
                            // InternalAlf.g:1171:5: ( ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..' )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==RULE_NATURAL_VALUE) ) {
                                int LA27_1 = input.LA(2);

                                if ( (LA27_1==29) ) {
                                    alt27=1;
                                }
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalAlf.g:1172:6: ( (lv_lower_5_0= ruleNaturalLiteralExpression ) ) otherlv_6= '..'
                                    {
                                    // InternalAlf.g:1172:6: ( (lv_lower_5_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:1173:7: (lv_lower_5_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:1173:7: (lv_lower_5_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:1174:8: lv_lower_5_0= ruleNaturalLiteralExpression
                                    {

                                    								newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_0_2_1_0_0());
                                    							
                                    pushFollow(FOLLOW_21);
                                    lv_lower_5_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    								}
                                    								set(
                                    									current,
                                    									"lower",
                                    									lv_lower_5_0,
                                    									"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    otherlv_6=(Token)match(input,29,FOLLOW_20); 

                                    						newLeafNode(otherlv_6, grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_0_2_1_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalAlf.g:1196:5: ( (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:1197:6: (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1197:6: (lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:1198:7: lv_upper_7_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            							newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_0_2_2_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_upper_7_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"upper",
                            								lv_upper_7_0,
                            								"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_8=(Token)match(input,30,FOLLOW_23); 

                            					newLeafNode(otherlv_8, grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_0_2_3());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1220:4: ( ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==19||LA31_0==31) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==16) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAlf.g:1221:5: ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' )
                            {
                            // InternalAlf.g:1221:5: ( (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';' )
                            // InternalAlf.g:1222:6: (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )? otherlv_11= ';'
                            {
                            // InternalAlf.g:1222:6: (otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) ) )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==31) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // InternalAlf.g:1223:7: otherlv_9= '=' ( (lv_value_10_0= ruleExpression ) )
                                    {
                                    otherlv_9=(Token)match(input,31,FOLLOW_24); 

                                    							newLeafNode(otherlv_9, grammarAccess.getFeatureDefinitionAccess().getEqualsSignKeyword_0_3_0_0_0());
                                    						
                                    // InternalAlf.g:1227:7: ( (lv_value_10_0= ruleExpression ) )
                                    // InternalAlf.g:1228:8: (lv_value_10_0= ruleExpression )
                                    {
                                    // InternalAlf.g:1228:8: (lv_value_10_0= ruleExpression )
                                    // InternalAlf.g:1229:9: lv_value_10_0= ruleExpression
                                    {

                                    									newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getValueExpressionParserRuleCall_0_3_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_9);
                                    lv_value_10_0=ruleExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"value",
                                    										lv_value_10_0,
                                    										"org.omg.sysml.Alf.Expression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_11=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(otherlv_11, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_0_3_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1253:5: (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' )
                            {
                            // InternalAlf.g:1253:5: (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' )
                            // InternalAlf.g:1254:6: otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}'
                            {
                            otherlv_12=(Token)match(input,16,FOLLOW_14); 

                            						newLeafNode(otherlv_12, grammarAccess.getFeatureDefinitionAccess().getLeftCurlyBracketKeyword_0_3_1_0());
                            					
                            // InternalAlf.g:1258:6: ( (lv_ownedMembership_13_0= ruleClassMember ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_UNRESTRICTED_NAME)||LA30_0==15||LA30_0==18||(LA30_0>=20 && LA30_0<=22)||(LA30_0>=25 && LA30_0<=26)||(LA30_0>=32 && LA30_0<=33)||(LA30_0>=47 && LA30_0<=50)) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalAlf.g:1259:7: (lv_ownedMembership_13_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:1259:7: (lv_ownedMembership_13_0= ruleClassMember )
                            	    // InternalAlf.g:1260:8: lv_ownedMembership_13_0= ruleClassMember
                            	    {

                            	    								newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_0_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_14);
                            	    lv_ownedMembership_13_0=ruleClassMember();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"ownedMembership",
                            	    									lv_ownedMembership_13_0,
                            	    									"org.omg.sysml.Alf.ClassMember");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,17,FOLLOW_2); 

                            						newLeafNode(otherlv_14, grammarAccess.getFeatureDefinitionAccess().getRightCurlyBracketKeyword_0_3_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1285:3: ( ( (lv_name_15_0= ruleName ) )? ( (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) ) | (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' ) ) )
                    {
                    // InternalAlf.g:1285:3: ( ( (lv_name_15_0= ruleName ) )? ( (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) ) | (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' ) ) )
                    // InternalAlf.g:1286:4: ( (lv_name_15_0= ruleName ) )? ( (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) ) | (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' ) )
                    {
                    // InternalAlf.g:1286:4: ( (lv_name_15_0= ruleName ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalAlf.g:1287:5: (lv_name_15_0= ruleName )
                            {
                            // InternalAlf.g:1287:5: (lv_name_15_0= ruleName )
                            // InternalAlf.g:1288:6: lv_name_15_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_name_15_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            						}
                            						set(
                            							current,
                            							"name",
                            							lv_name_15_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1305:4: ( (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset ) )
                    // InternalAlf.g:1306:5: (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset )
                    {
                    // InternalAlf.g:1306:5: (lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset )
                    // InternalAlf.g:1307:6: lv_ownedMembership_16_0= ruleOwnedRedefinitionOrSubset
                    {

                    						newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_ownedMembership_16_0=ruleOwnedRedefinitionOrSubset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"ownedMembership",
                    							lv_ownedMembership_16_0,
                    							"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1324:4: ( ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) ) | (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==28) ) {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==RULE_NATURAL_VALUE) ) {
                            int LA38_3 = input.LA(3);

                            if ( (LA38_3==30) ) {
                                int LA38_5 = input.LA(4);

                                if ( (LA38_5==16||LA38_5==31) ) {
                                    alt38=1;
                                }
                                else if ( (LA38_5==19) ) {
                                    alt38=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 38, 5, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA38_3==29) ) {
                                int LA38_6 = input.LA(4);

                                if ( (LA38_6==RULE_NATURAL_VALUE) ) {
                                    int LA38_8 = input.LA(5);

                                    if ( (LA38_8==30) ) {
                                        int LA38_5 = input.LA(6);

                                        if ( (LA38_5==16||LA38_5==31) ) {
                                            alt38=1;
                                        }
                                        else if ( (LA38_5==19) ) {
                                            alt38=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 38, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 38, 8, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA38_6==38) ) {
                                    int LA38_4 = input.LA(5);

                                    if ( (LA38_4==30) ) {
                                        int LA38_5 = input.LA(6);

                                        if ( (LA38_5==16||LA38_5==31) ) {
                                            alt38=1;
                                        }
                                        else if ( (LA38_5==19) ) {
                                            alt38=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 38, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 38, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 38, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 38, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA38_1==38) ) {
                            int LA38_4 = input.LA(3);

                            if ( (LA38_4==30) ) {
                                int LA38_5 = input.LA(4);

                                if ( (LA38_5==16||LA38_5==31) ) {
                                    alt38=1;
                                }
                                else if ( (LA38_5==19) ) {
                                    alt38=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 38, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 38, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 38, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA38_0==16||LA38_0==31) ) {
                        alt38=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAlf.g:1325:5: ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) )
                            {
                            // InternalAlf.g:1325:5: ( (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) ) )
                            // InternalAlf.g:1326:6: (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )? ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) )
                            {
                            // InternalAlf.g:1326:6: (otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']' )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==28) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // InternalAlf.g:1327:7: otherlv_17= '[' ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )? ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_21= ']'
                                    {
                                    otherlv_17=(Token)match(input,28,FOLLOW_20); 

                                    							newLeafNode(otherlv_17, grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_2_0_0_0());
                                    						
                                    // InternalAlf.g:1331:7: ( ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..' )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==RULE_NATURAL_VALUE) ) {
                                        int LA33_1 = input.LA(2);

                                        if ( (LA33_1==29) ) {
                                            alt33=1;
                                        }
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // InternalAlf.g:1332:8: ( (lv_lower_18_0= ruleNaturalLiteralExpression ) ) otherlv_19= '..'
                                            {
                                            // InternalAlf.g:1332:8: ( (lv_lower_18_0= ruleNaturalLiteralExpression ) )
                                            // InternalAlf.g:1333:9: (lv_lower_18_0= ruleNaturalLiteralExpression )
                                            {
                                            // InternalAlf.g:1333:9: (lv_lower_18_0= ruleNaturalLiteralExpression )
                                            // InternalAlf.g:1334:10: lv_lower_18_0= ruleNaturalLiteralExpression
                                            {

                                            										newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_2_0_0_1_0_0());
                                            									
                                            pushFollow(FOLLOW_21);
                                            lv_lower_18_0=ruleNaturalLiteralExpression();

                                            state._fsp--;


                                            										if (current==null) {
                                            											current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                            										}
                                            										set(
                                            											current,
                                            											"lower",
                                            											lv_lower_18_0,
                                            											"org.omg.sysml.Alf.NaturalLiteralExpression");
                                            										afterParserOrEnumRuleCall();
                                            									

                                            }


                                            }

                                            otherlv_19=(Token)match(input,29,FOLLOW_20); 

                                            								newLeafNode(otherlv_19, grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_2_0_0_1_1());
                                            							

                                            }
                                            break;

                                    }

                                    // InternalAlf.g:1356:7: ( (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression ) )
                                    // InternalAlf.g:1357:8: (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:1357:8: (lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression )
                                    // InternalAlf.g:1358:9: lv_upper_20_0= ruleUnlimitedNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_2_0_0_2_0());
                                    								
                                    pushFollow(FOLLOW_22);
                                    lv_upper_20_0=ruleUnlimitedNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"upper",
                                    										lv_upper_20_0,
                                    										"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_21=(Token)match(input,30,FOLLOW_26); 

                                    							newLeafNode(otherlv_21, grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_2_0_0_3());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:1380:6: ( (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' ) | (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' ) )
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==31) ) {
                                alt36=1;
                            }
                            else if ( (LA36_0==16) ) {
                                alt36=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 0, input);

                                throw nvae;
                            }
                            switch (alt36) {
                                case 1 :
                                    // InternalAlf.g:1381:7: (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' )
                                    {
                                    // InternalAlf.g:1381:7: (otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';' )
                                    // InternalAlf.g:1382:8: otherlv_22= '=' ( (lv_value_23_0= ruleExpression ) ) otherlv_24= ';'
                                    {
                                    otherlv_22=(Token)match(input,31,FOLLOW_24); 

                                    								newLeafNode(otherlv_22, grammarAccess.getFeatureDefinitionAccess().getEqualsSignKeyword_1_2_0_1_0_0());
                                    							
                                    // InternalAlf.g:1386:8: ( (lv_value_23_0= ruleExpression ) )
                                    // InternalAlf.g:1387:9: (lv_value_23_0= ruleExpression )
                                    {
                                    // InternalAlf.g:1387:9: (lv_value_23_0= ruleExpression )
                                    // InternalAlf.g:1388:10: lv_value_23_0= ruleExpression
                                    {

                                    										newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_2_0_1_0_1_0());
                                    									
                                    pushFollow(FOLLOW_9);
                                    lv_value_23_0=ruleExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"value",
                                    											lv_value_23_0,
                                    											"org.omg.sysml.Alf.Expression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_24=(Token)match(input,19,FOLLOW_2); 

                                    								newLeafNode(otherlv_24, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_2_0_1_0_2());
                                    							

                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1411:7: (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' )
                                    {
                                    // InternalAlf.g:1411:7: (otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}' )
                                    // InternalAlf.g:1412:8: otherlv_25= '{' ( (lv_ownedMembership_26_0= ruleClassMember ) )* otherlv_27= '}'
                                    {
                                    otherlv_25=(Token)match(input,16,FOLLOW_14); 

                                    								newLeafNode(otherlv_25, grammarAccess.getFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_2_0_1_1_0());
                                    							
                                    // InternalAlf.g:1416:8: ( (lv_ownedMembership_26_0= ruleClassMember ) )*
                                    loop35:
                                    do {
                                        int alt35=2;
                                        int LA35_0 = input.LA(1);

                                        if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_UNRESTRICTED_NAME)||LA35_0==15||LA35_0==18||(LA35_0>=20 && LA35_0<=22)||(LA35_0>=25 && LA35_0<=26)||(LA35_0>=32 && LA35_0<=33)||(LA35_0>=47 && LA35_0<=50)) ) {
                                            alt35=1;
                                        }


                                        switch (alt35) {
                                    	case 1 :
                                    	    // InternalAlf.g:1417:9: (lv_ownedMembership_26_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:1417:9: (lv_ownedMembership_26_0= ruleClassMember )
                                    	    // InternalAlf.g:1418:10: lv_ownedMembership_26_0= ruleClassMember
                                    	    {

                                    	    										newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_2_0_1_1_1_0());
                                    	    									
                                    	    pushFollow(FOLLOW_14);
                                    	    lv_ownedMembership_26_0=ruleClassMember();

                                    	    state._fsp--;


                                    	    										if (current==null) {
                                    	    											current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    	    										}
                                    	    										add(
                                    	    											current,
                                    	    											"ownedMembership",
                                    	    											lv_ownedMembership_26_0,
                                    	    											"org.omg.sysml.Alf.ClassMember");
                                    	    										afterParserOrEnumRuleCall();
                                    	    									

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop35;
                                        }
                                    } while (true);

                                    otherlv_27=(Token)match(input,17,FOLLOW_2); 

                                    								newLeafNode(otherlv_27, grammarAccess.getFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_2_0_1_1_2());
                                    							

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1443:5: (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' )
                            {
                            // InternalAlf.g:1443:5: (otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';' )
                            // InternalAlf.g:1444:6: otherlv_28= '[' ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )? ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_32= ']' otherlv_33= ';'
                            {
                            otherlv_28=(Token)match(input,28,FOLLOW_20); 

                            						newLeafNode(otherlv_28, grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_2_1_0());
                            					
                            // InternalAlf.g:1448:6: ( ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..' )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==RULE_NATURAL_VALUE) ) {
                                int LA37_1 = input.LA(2);

                                if ( (LA37_1==29) ) {
                                    alt37=1;
                                }
                            }
                            switch (alt37) {
                                case 1 :
                                    // InternalAlf.g:1449:7: ( (lv_lower_29_0= ruleNaturalLiteralExpression ) ) otherlv_30= '..'
                                    {
                                    // InternalAlf.g:1449:7: ( (lv_lower_29_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:1450:8: (lv_lower_29_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:1450:8: (lv_lower_29_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:1451:9: lv_lower_29_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_2_1_1_0_0());
                                    								
                                    pushFollow(FOLLOW_21);
                                    lv_lower_29_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_29_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_30=(Token)match(input,29,FOLLOW_20); 

                                    							newLeafNode(otherlv_30, grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_2_1_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:1473:6: ( (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:1474:7: (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1474:7: (lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:1475:8: lv_upper_31_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_2_1_2_0());
                            							
                            pushFollow(FOLLOW_22);
                            lv_upper_31_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_31_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_32=(Token)match(input,30,FOLLOW_9); 

                            						newLeafNode(otherlv_32, grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_2_1_3());
                            					
                            otherlv_33=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(otherlv_33, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_2_1_4());
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleFeatureDefinition"


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:1507:1: entryRuleOwnedRedefinitionOrSubset returns [EObject current=null] : iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF ;
    public final EObject entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedRedefinitionOrSubset = null;


        try {
            // InternalAlf.g:1507:66: (iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:1508:2: iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF
            {
             newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedRedefinitionOrSubset=ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             current =iv_ruleOwnedRedefinitionOrSubset; 
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
    // $ANTLR end "entryRuleOwnedRedefinitionOrSubset"


    // $ANTLR start "ruleOwnedRedefinitionOrSubset"
    // InternalAlf.g:1514:1: ruleOwnedRedefinitionOrSubset returns [EObject current=null] : ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) ;
    public final EObject ruleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1520:2: ( ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) )
            // InternalAlf.g:1521:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            {
            // InternalAlf.g:1521:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==18||LA41_0==32) ) {
                alt41=1;
            }
            else if ( (LA41_0==33) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:1522:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    {
                    // InternalAlf.g:1522:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    // InternalAlf.g:1523:4: (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    {
                    // InternalAlf.g:1523:4: (otherlv_0= 'is' | otherlv_1= 'redefines' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==18) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==32) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalAlf.g:1524:5: otherlv_0= 'is'
                            {
                            otherlv_0=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_0, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1529:5: otherlv_1= 'redefines'
                            {
                            otherlv_1=(Token)match(input,32,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1534:4: ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    // InternalAlf.g:1535:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    {
                    // InternalAlf.g:1535:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    // InternalAlf.g:1536:6: lv_ownedMemberElement_2_0= ruleRedefinition
                    {

                    						newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementRedefinitionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleRedefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOwnedRedefinitionOrSubsetRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_2_0,
                    							"org.omg.sysml.Alf.Redefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1555:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    {
                    // InternalAlf.g:1555:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    // InternalAlf.g:1556:4: otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0());
                    			
                    // InternalAlf.g:1560:4: ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    // InternalAlf.g:1561:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    {
                    // InternalAlf.g:1561:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    // InternalAlf.g:1562:6: lv_ownedMemberElement_4_0= ruleSubset
                    {

                    						newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementSubsetParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleSubset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOwnedRedefinitionOrSubsetRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_4_0,
                    							"org.omg.sysml.Alf.Subset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleOwnedRedefinitionOrSubset"


    // $ANTLR start "entryRuleRedefinition"
    // InternalAlf.g:1584:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:1584:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:1585:2: iv_ruleRedefinition= ruleRedefinition EOF
            {
             newCompositeNode(grammarAccess.getRedefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedefinition=ruleRedefinition();

            state._fsp--;

             current =iv_ruleRedefinition; 
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
    // $ANTLR end "entryRuleRedefinition"


    // $ANTLR start "ruleRedefinition"
    // InternalAlf.g:1591:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1597:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1598:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1598:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1599:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1599:3: ( ruleQualifiedName )
            // InternalAlf.g:1600:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRedefinitionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0());
            			
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
    // $ANTLR end "ruleRedefinition"


    // $ANTLR start "entryRuleSubset"
    // InternalAlf.g:1617:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:1617:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:1618:2: iv_ruleSubset= ruleSubset EOF
            {
             newCompositeNode(grammarAccess.getSubsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubset=ruleSubset();

            state._fsp--;

             current =iv_ruleSubset; 
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
    // $ANTLR end "entryRuleSubset"


    // $ANTLR start "ruleSubset"
    // InternalAlf.g:1624:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1630:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1631:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1631:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1632:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1632:3: ( ruleQualifiedName )
            // InternalAlf.g:1633:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSubsetRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0());
            			
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
    // $ANTLR end "ruleSubset"


    // $ANTLR start "entryRuleConnectorDefinition"
    // InternalAlf.g:1650:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:1650:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:1651:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
            {
             newCompositeNode(grammarAccess.getConnectorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorDefinition=ruleConnectorDefinition();

            state._fsp--;

             current =iv_ruleConnectorDefinition; 
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
    // $ANTLR end "entryRuleConnectorDefinition"


    // $ANTLR start "ruleConnectorDefinition"
    // InternalAlf.g:1657:1: ruleConnectorDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_2= '=>' ( ( ruleQualifiedName ) ) otherlv_4= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1663:2: ( ( ( (lv_name_0_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_2= '=>' ( ( ruleQualifiedName ) ) otherlv_4= ';' ) )
            // InternalAlf.g:1664:2: ( ( (lv_name_0_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_2= '=>' ( ( ruleQualifiedName ) ) otherlv_4= ';' )
            {
            // InternalAlf.g:1664:2: ( ( (lv_name_0_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_2= '=>' ( ( ruleQualifiedName ) ) otherlv_4= ';' )
            // InternalAlf.g:1665:3: ( (lv_name_0_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_2= '=>' ( ( ruleQualifiedName ) ) otherlv_4= ';'
            {
            // InternalAlf.g:1665:3: ( (lv_name_0_0= ruleName ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( ((LA42_1>=RULE_ID && LA42_1<=RULE_UNRESTRICTED_NAME)) ) {
                    alt42=1;
                }
            }
            else if ( (LA42_0==RULE_UNRESTRICTED_NAME) ) {
                int LA42_2 = input.LA(2);

                if ( ((LA42_2>=RULE_ID && LA42_2<=RULE_UNRESTRICTED_NAME)) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:1666:4: (lv_name_0_0= ruleName )
                    {
                    // InternalAlf.g:1666:4: (lv_name_0_0= ruleName )
                    // InternalAlf.g:1667:5: lv_name_0_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_0_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.omg.sysml.Alf.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:1684:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1685:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:1685:4: ( ruleQualifiedName )
            // InternalAlf.g:1686:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAlf.g:1704:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1705:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:1705:4: ( ruleQualifiedName )
            // InternalAlf.g:1706:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleConnectorDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalAlf.g:1728:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:1728:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:1729:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:1735:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1741:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:1742:2: this_BinaryExpression_0= ruleBinaryExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;


            		current = this_BinaryExpression_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalAlf.g:1753:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:1753:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:1754:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalAlf.g:1760:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_UnaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_operand_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1766:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:1767:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:1767:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:1768:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:1776:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=35 && LA44_0<=40)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:1777:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:1777:4: ()
                    // InternalAlf.g:1778:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:1784:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=36 && LA43_0<=40)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==35) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAlf.g:1785:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:1785:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:1786:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:1786:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:1787:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:1787:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:1788:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_24);
                            lv_operator_2_0=ruleBinaryOperator();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								set(
                            									current,
                            									"operator",
                            									lv_operator_2_0,
                            									"org.omg.sysml.Alf.BinaryOperator");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalAlf.g:1805:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:1806:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:1806:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:1807:8: lv_operand_3_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_0_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_operand_3_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								add(
                            									current,
                            									"operand",
                            									lv_operand_3_0,
                            									"org.omg.sysml.Alf.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1826:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:1826:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:1827:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:1827:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:1828:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:1828:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:1829:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,35,FOLLOW_29); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,28,FOLLOW_24); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:1845:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:1846:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:1846:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:1847:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_22);
                            lv_operand_6_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								add(
                            									current,
                            									"operand",
                            									lv_operand_6_0,
                            									"org.omg.sysml.Alf.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_7=(Token)match(input,30,FOLLOW_2); 

                            						newLeafNode(otherlv_7, grammarAccess.getBinaryExpressionAccess().getRightSquareBracketKeyword_1_1_1_3());
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleBinaryOperator"
    // InternalAlf.g:1875:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:1875:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:1876:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperator=ruleBinaryOperator();

            state._fsp--;

             current =iv_ruleBinaryOperator.getText(); 
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
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // InternalAlf.g:1882:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:1888:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:1889:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:1889:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt45=1;
                }
                break;
            case 37:
                {
                alt45=2;
                }
                break;
            case 38:
                {
                alt45=3;
                }
                break;
            case 39:
                {
                alt45=4;
                }
                break;
            case 40:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAlf.g:1890:3: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1896:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:1902:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:1908:3: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:1914:3: kw= '^'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_4());
                    		

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
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalAlf.g:1923:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:1923:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:1924:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalAlf.g:1930:1: ruleUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1936:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // InternalAlf.g:1937:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // InternalAlf.g:1937:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_BOOLEAN_VALUE && LA46_0<=RULE_UNRESTRICTED_NAME)||LA46_0==16||LA46_0==38||LA46_0==41||(LA46_0>=43 && LA46_0<=44)) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=36 && LA46_0<=37)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlf.g:1938:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1947:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // InternalAlf.g:1947:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // InternalAlf.g:1948:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // InternalAlf.g:1948:4: ()
                    // InternalAlf.g:1949:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:1955:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:1956:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:1956:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:1957:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_operator_2_0=ruleUnaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"org.omg.sysml.Alf.UnaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1974:4: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // InternalAlf.g:1975:5: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // InternalAlf.g:1975:5: (lv_operand_3_0= rulePrimaryExpression )
                    // InternalAlf.g:1976:6: lv_operand_3_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.sysml.Alf.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryOperator"
    // InternalAlf.g:1998:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:1998:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:1999:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperator=ruleUnaryOperator();

            state._fsp--;

             current =iv_ruleUnaryOperator.getText(); 
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
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalAlf.g:2005:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:2011:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:2012:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:2012:2: (kw= '+' | kw= '-' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            else if ( (LA47_0==37) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:2013:3: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2019:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalAlf.g:2028:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:2028:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:2029:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalAlf.g:2035:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_LiteralExpression_0 = null;

        EObject this_ElementReferenceExpression_1 = null;

        EObject this_InstanceCreationExpression_2 = null;

        EObject this_SequenceConstructionExpression_3 = null;

        EObject this_Expression_5 = null;



        	enterRule();

        try {
            // InternalAlf.g:2041:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:2042:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:2042:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt48=5;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:2043:3: this_LiteralExpression_0= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2052:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElementReferenceExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementReferenceExpression_1=ruleElementReferenceExpression();

                    state._fsp--;


                    			current = this_ElementReferenceExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:2061:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstanceCreationExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceCreationExpression_2=ruleInstanceCreationExpression();

                    state._fsp--;


                    			current = this_InstanceCreationExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:2070:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSequenceConstructionExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceConstructionExpression_3=ruleSequenceConstructionExpression();

                    state._fsp--;


                    			current = this_SequenceConstructionExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:2079:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:2079:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:2080:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_31);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                    			

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // InternalAlf.g:2101:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:2101:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:2102:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;

             current =iv_ruleElementReferenceExpression; 
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
    // $ANTLR end "entryRuleElementReferenceExpression"


    // $ANTLR start "ruleElementReferenceExpression"
    // InternalAlf.g:2108:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2114:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2115:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2115:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2116:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2116:3: ( ruleQualifiedName )
            // InternalAlf.g:2117:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0());
            			
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
    // $ANTLR end "ruleElementReferenceExpression"


    // $ANTLR start "entryRuleInstanceCreationExpression"
    // InternalAlf.g:2134:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:2134:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:2135:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
            {
             newCompositeNode(grammarAccess.getInstanceCreationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceCreationExpression=ruleInstanceCreationExpression();

            state._fsp--;

             current =iv_ruleInstanceCreationExpression; 
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
    // $ANTLR end "entryRuleInstanceCreationExpression"


    // $ANTLR start "ruleInstanceCreationExpression"
    // InternalAlf.g:2141:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2147:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:2148:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:2148:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:2149:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:2149:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2150:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2150:4: ( ruleQualifiedName )
            // InternalAlf.g:2151:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_32);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:2169:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_BOOLEAN_VALUE && LA50_0<=RULE_UNRESTRICTED_NAME)||LA50_0==16||(LA50_0>=36 && LA50_0<=38)||LA50_0==41||(LA50_0>=43 && LA50_0<=44)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:2170:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:2170:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:2171:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:2171:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:2172:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_argument_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"argument",
                    							lv_argument_2_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2189:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==24) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalAlf.g:2190:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:2194:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:2195:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:2195:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:2196:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_argument_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"argument",
                    	    								lv_argument_4_0,
                    	    								"org.omg.sysml.Alf.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceCreationExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleInstanceCreationExpression"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalAlf.g:2223:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:2223:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:2224:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceConstructionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceConstructionExpression=ruleSequenceConstructionExpression();

            state._fsp--;

             current =iv_ruleSequenceConstructionExpression; 
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
    // $ANTLR end "entryRuleSequenceConstructionExpression"


    // $ANTLR start "ruleSequenceConstructionExpression"
    // InternalAlf.g:2230:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2236:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:2237:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:2237:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:2238:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:2238:3: ()
            // InternalAlf.g:2239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:2249:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_BOOLEAN_VALUE && LA52_0<=RULE_UNRESTRICTED_NAME)||LA52_0==16||(LA52_0>=36 && LA52_0<=38)||LA52_0==41||(LA52_0>=43 && LA52_0<=44)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:2250:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:2250:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:2251:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:2251:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:2252:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_element_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                    						}
                    						add(
                    							current,
                    							"element",
                    							lv_element_2_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2269:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==24) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalAlf.g:2270:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:2274:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:2275:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:2275:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:2276:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_element_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"element",
                    	    								lv_element_4_0,
                    	    								"org.omg.sysml.Alf.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSequenceConstructionExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalAlf.g:2303:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:2303:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:2304:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalAlf.g:2310:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:2316:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:2317:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:2317:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt53=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt53=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt53=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA53_4 = input.LA(2);

                if ( (LA53_4==EOF||LA53_4==17||LA53_4==19||LA53_4==24||LA53_4==30||(LA53_4>=35 && LA53_4<=40)||LA53_4==42) ) {
                    alt53=5;
                }
                else if ( (LA53_4==44) ) {
                    alt53=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 4, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt53=4;
                }
                break;
            case 38:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalAlf.g:2318:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNullLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpression_0=ruleNullLiteralExpression();

                    state._fsp--;


                    			current = this_NullLiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2327:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpression_1=ruleBooleanLiteralExpression();

                    state._fsp--;


                    			current = this_BooleanLiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:2336:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getStringLiteralExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpression_2=ruleStringLiteralExpression();

                    state._fsp--;


                    			current = this_StringLiteralExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:2345:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRealLiteralExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteralExpression_3=ruleRealLiteralExpression();

                    state._fsp--;


                    			current = this_RealLiteralExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:2354:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getUnlimitedNaturalLiteralExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpression_4=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    			current = this_UnlimitedNaturalLiteralExpression_4;
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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleNullLiteralExpression"
    // InternalAlf.g:2366:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:2366:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:2367:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExpression=ruleNullLiteralExpression();

            state._fsp--;

             current =iv_ruleNullLiteralExpression; 
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
    // $ANTLR end "entryRuleNullLiteralExpression"


    // $ANTLR start "ruleNullLiteralExpression"
    // InternalAlf.g:2373:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:2379:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:2380:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:2380:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:2381:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:2381:3: ()
            // InternalAlf.g:2382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpressionAccess().getNullKeyword_1());
            		

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
    // $ANTLR end "ruleNullLiteralExpression"


    // $ANTLR start "entryRuleBooleanLiteralExpression"
    // InternalAlf.g:2396:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:2396:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:2397:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpression=ruleBooleanLiteralExpression();

            state._fsp--;

             current =iv_ruleBooleanLiteralExpression; 
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
    // $ANTLR end "entryRuleBooleanLiteralExpression"


    // $ANTLR start "ruleBooleanLiteralExpression"
    // InternalAlf.g:2403:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2409:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:2410:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:2410:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:2411:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:2411:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:2412:4: lv_value_0_0= RULE_BOOLEAN_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralExpressionAccess().getValueBOOLEAN_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.BOOLEAN_VALUE");
            			

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
    // $ANTLR end "ruleBooleanLiteralExpression"


    // $ANTLR start "entryRuleStringLiteralExpression"
    // InternalAlf.g:2431:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:2431:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:2432:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpression=ruleStringLiteralExpression();

            state._fsp--;

             current =iv_ruleStringLiteralExpression; 
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
    // $ANTLR end "entryRuleStringLiteralExpression"


    // $ANTLR start "ruleStringLiteralExpression"
    // InternalAlf.g:2438:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2444:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:2445:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:2445:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:2446:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:2446:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:2447:4: lv_value_0_0= RULE_STRING_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralExpressionAccess().getValueSTRING_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.STRING_VALUE");
            			

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
    // $ANTLR end "ruleStringLiteralExpression"


    // $ANTLR start "entryRuleRealLiteralExpression"
    // InternalAlf.g:2466:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:2466:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:2467:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteralExpression=ruleRealLiteralExpression();

            state._fsp--;

             current =iv_ruleRealLiteralExpression; 
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
    // $ANTLR end "entryRuleRealLiteralExpression"


    // $ANTLR start "ruleRealLiteralExpression"
    // InternalAlf.g:2473:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2479:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:2480:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:2480:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:2481:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:2481:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:2482:4: lv_value_0_0= ruleRealValue
            {

            				newCompositeNode(grammarAccess.getRealLiteralExpressionAccess().getValueRealValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleRealValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralExpressionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.RealValue");
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
    // $ANTLR end "ruleRealLiteralExpression"


    // $ANTLR start "entryRuleRealValue"
    // InternalAlf.g:2502:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:2502:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:2503:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue.getText(); 
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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalAlf.g:2509:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:2515:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:2516:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:2516:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:2517:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:2517:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_NATURAL_VALUE) ) {
                alt55=1;
            }
            else if ( (LA55_0==44) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2518:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:2518:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:2519:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_37); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,44,FOLLOW_38); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:2531:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_NATURAL_VALUE) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalAlf.g:2532:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_39); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2542:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:2542:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:2543:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,44,FOLLOW_40); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_39); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:2557:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=45 && LA58_0<=46)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:2558:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:2558:4: (kw= 'e' | kw= 'E' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==45) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==46) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalAlf.g:2559:5: kw= 'e'
                            {
                            kw=(Token)match(input,45,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2565:5: kw= 'E'
                            {
                            kw=(Token)match(input,46,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2571:4: (kw= '+' | kw= '-' )?
                    int alt57=3;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==36) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==37) ) {
                        alt57=2;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalAlf.g:2572:5: kw= '+'
                            {
                            kw=(Token)match(input,36,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2578:5: kw= '-'
                            {
                            kw=(Token)match(input,37,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getHyphenMinusKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    this_NATURAL_VALUE_9=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

                    				current.merge(this_NATURAL_VALUE_9);
                    			

                    				newLeafNode(this_NATURAL_VALUE_9, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_1_2());
                    			

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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleNaturalLiteralExpression"
    // InternalAlf.g:2596:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:2596:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:2597:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNaturalLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNaturalLiteralExpression=ruleNaturalLiteralExpression();

            state._fsp--;

             current =iv_ruleNaturalLiteralExpression; 
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
    // $ANTLR end "entryRuleNaturalLiteralExpression"


    // $ANTLR start "ruleNaturalLiteralExpression"
    // InternalAlf.g:2603:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2609:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:2610:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:2610:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:2611:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:2611:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:2612:4: lv_value_0_0= RULE_NATURAL_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNaturalLiteralExpressionAccess().getValueNATURAL_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNaturalLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.NATURAL_VALUE");
            			

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
    // $ANTLR end "ruleNaturalLiteralExpression"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpression"
    // InternalAlf.g:2631:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:2631:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:2632:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpression=ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             current =iv_ruleUnlimitedNaturalLiteralExpression; 
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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpression"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpression"
    // InternalAlf.g:2638:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2644:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:2645:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:2645:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_NATURAL_VALUE) ) {
                alt59=1;
            }
            else if ( (LA59_0==38) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:2646:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getNaturalLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NaturalLiteralExpression_0=ruleNaturalLiteralExpression();

                    state._fsp--;


                    			current = this_NaturalLiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2655:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:2655:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:2656:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:2656:4: ()
                    // InternalAlf.g:2657:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1());
                    			

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
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpression"


    // $ANTLR start "entryRuleName"
    // InternalAlf.g:2672:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:2672:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:2673:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:2679:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:2685:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:2686:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:2686:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_UNRESTRICTED_NAME) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:2687:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2695:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
                    {
                    this_UNRESTRICTED_NAME_1=(Token)match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); 

                    			current.merge(this_UNRESTRICTED_NAME_1);
                    		

                    			newLeafNode(this_UNRESTRICTED_NAME_1, grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAlf.g:2706:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:2706:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:2707:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:2713:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2719:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalAlf.g:2720:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:2720:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalAlf.g:2721:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2731:3: (kw= '.' this_Name_2= ruleName )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==44) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalAlf.g:2732:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,44,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_42);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop61;
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


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalAlf.g:2752:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:2758:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:2759:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:2759:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt62=1;
                }
                break;
            case 48:
                {
                alt62=2;
                }
                break;
            case 49:
                {
                alt62=3;
                }
                break;
            case 50:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalAlf.g:2760:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:2760:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:2761:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2768:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:2768:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:2769:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2776:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:2776:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:2777:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2784:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:2784:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:2785:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleVisibilityIndicator"


    // $ANTLR start "ruleFeatureDirection"
    // InternalAlf.g:2795:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:2801:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:2802:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:2802:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt63=1;
                }
                break;
            case 52:
                {
                alt63=2;
                }
                break;
            case 53:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalAlf.g:2803:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:2803:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:2804:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2811:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:2811:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:2812:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2819:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:2819:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:2820:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleFeatureDirection"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\17\1\7\1\uffff\1\7\2\20\1\uffff\2\20\1\uffff\1\7\2\20\1\7\2\20";
    static final String dfa_3s = "\1\26\1\22\1\uffff\3\22\1\uffff\2\27\1\uffff\1\10\2\54\1\10\2\54";
    static final String dfa_4s = "\2\uffff\1\1\3\uffff\1\2\2\uffff\1\3\6\uffff";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\3\1\uffff\1\2",
            "\1\4\1\5\11\uffff\1\6",
            "",
            "\1\7\1\10\11\uffff\1\11",
            "\1\2\1\uffff\1\6",
            "\1\2\1\uffff\1\6",
            "",
            "\1\2\1\uffff\1\12\4\uffff\1\2",
            "\1\2\1\uffff\1\12\4\uffff\1\2",
            "",
            "\1\13\1\14",
            "\1\2\2\uffff\1\11\4\uffff\1\2\23\uffff\1\15",
            "\1\2\2\uffff\1\11\4\uffff\1\2\23\uffff\1\15",
            "\1\16\1\17",
            "\1\2\2\uffff\1\11\4\uffff\1\2\23\uffff\1\15",
            "\1\2\2\uffff\1\11\4\uffff\1\2\23\uffff\1\15"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "265:3: ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | (otherlv_2= 'package' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'class' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\2\7\2\20\1\uffff\2\20\1\7\2\20\1\7\1\uffff\2\20";
    static final String dfa_9s = "\4\41\1\uffff\2\41\1\10\2\54\1\10\1\uffff\2\54";
    static final String dfa_10s = "\4\uffff\1\1\6\uffff\1\2\2\uffff";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\11\uffff\1\4\2\uffff\1\1\12\uffff\2\4",
            "\1\5\1\6\11\uffff\1\7\15\uffff\2\4",
            "\1\4\1\uffff\1\7\1\4\7\uffff\2\4\2\uffff\3\4",
            "\1\4\1\uffff\1\7\1\4\7\uffff\2\4\2\uffff\3\4",
            "",
            "\1\4\1\uffff\1\7\1\4\7\uffff\2\4\2\uffff\3\4",
            "\1\4\1\uffff\1\7\1\4\7\uffff\2\4\2\uffff\3\4",
            "\1\10\1\11",
            "\1\4\2\uffff\1\13\10\uffff\1\4\2\uffff\1\4\14\uffff\1\12",
            "\1\4\2\uffff\1\13\10\uffff\1\4\2\uffff\1\4\14\uffff\1\12",
            "\1\14\1\15",
            "",
            "\1\4\2\uffff\1\13\10\uffff\1\4\2\uffff\1\4\14\uffff\1\12",
            "\1\4\2\uffff\1\13\10\uffff\1\4\2\uffff\1\4\14\uffff\1\12"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "424:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleFeatureDefinition ) ) ) | ( ( (otherlv_3= 'feature' ( (lv_memberName_4_0= ruleName ) )? ) | ( (lv_memberName_5_0= ruleName ) ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )";
        }
    }
    static final String dfa_13s = "\17\uffff";
    static final String dfa_14s = "\1\7\1\uffff\1\7\2\20\1\uffff\2\20\1\7\2\20\1\7\1\uffff\2\20";
    static final String dfa_15s = "\1\62\1\uffff\3\41\1\uffff\2\41\1\10\2\54\1\10\1\uffff\2\54";
    static final String dfa_16s = "\1\uffff\1\1\3\uffff\1\2\6\uffff\1\3\2\uffff";
    static final String dfa_17s = "\17\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\1\4\11\uffff\1\1\2\uffff\1\2\3\uffff\1\1\1\5\5\uffff\2\1\15\uffff\4\1",
            "",
            "\1\6\1\7\11\uffff\1\10\15\uffff\2\1",
            "\1\1\1\uffff\1\10\1\1\7\uffff\2\1\2\uffff\3\1",
            "\1\1\1\uffff\1\10\1\1\7\uffff\2\1\2\uffff\3\1",
            "",
            "\1\1\1\uffff\1\10\1\1\7\uffff\2\1\2\uffff\3\1",
            "\1\1\1\uffff\1\10\1\1\7\uffff\2\1\2\uffff\3\1",
            "\1\11\1\12",
            "\1\1\2\uffff\1\14\10\uffff\1\1\2\uffff\1\1\14\uffff\1\13",
            "\1\1\2\uffff\1\14\10\uffff\1\1\2\uffff\1\1\14\uffff\1\13",
            "\1\15\1\16",
            "",
            "\1\1\2\uffff\1\14\10\uffff\1\1\2\uffff\1\1\14\uffff\1\13",
            "\1\1\2\uffff\1\14\10\uffff\1\1\2\uffff\1\1\14\uffff\1\13"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "903:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? (otherlv_1= 'feature' | ( ( (lv_isPort_2_0= 'port' ) ) ( (lv_direction_3_0= ruleFeatureDirection ) ) ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'connector' ( (lv_ownedMemberElement_6_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_7= 'feature' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )";
        }
    }
    static final String dfa_19s = "\13\uffff";
    static final String dfa_20s = "\2\uffff\2\10\5\uffff\2\10";
    static final String dfa_21s = "\1\4\1\uffff\2\21\2\uffff\1\7\2\uffff\2\21";
    static final String dfa_22s = "\1\54\1\uffff\2\54\2\uffff\1\10\2\uffff\2\54";
    static final String dfa_23s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\3\1\2\2\uffff";
    static final String dfa_24s = "\13\uffff}>";
    static final String[] dfa_25s = {
            "\3\1\1\2\1\3\7\uffff\1\4\25\uffff\1\1\2\uffff\1\5\1\uffff\2\1",
            "",
            "\1\10\1\uffff\1\10\4\uffff\1\10\5\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\1\10\1\uffff\1\10\4\uffff\1\10\5\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\1\10\1\uffff\1\10\4\uffff\1\10\5\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\1\10\1\uffff\1\10\4\uffff\1\10\5\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2042:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0007800300768180L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000508000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040180L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000300240180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0007800306768180L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000302240180L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000098090000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000003902D0180L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000090090000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080090000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00001A70000101F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000090010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001F800000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001A40000101F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00001E70000101F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00001A70000301F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000600000000042L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000002L});

}