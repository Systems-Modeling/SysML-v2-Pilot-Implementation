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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'is'", "';'", "'class'", "'assoc'", "'feature'", "'abstract'", "'specializes'", "','", "'port'", "'connector'", "':'", "'composes'", "'any'", "'['", "'..'", "']'", "'='", "'redefines'", "'subsets'", "'=>'", "'@'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'null'", "'.'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int T__54=54;
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
            else if ( (LA1_0==20||LA1_0==23) ) {
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

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_UNRESTRICTED_NAME)||LA2_0==15||(LA2_0>=20 && LA2_0<=23)||(LA2_0>=50 && LA2_0<=53)) ) {
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
            case 50:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==15||(LA3_1>=20 && LA3_1<=21)||LA3_1==23) ) {
                    alt3=1;
                }
                else if ( ((LA3_1>=RULE_ID && LA3_1<=RULE_UNRESTRICTED_NAME)||LA3_1==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=RULE_ID && LA3_2<=RULE_UNRESTRICTED_NAME)||LA3_2==22) ) {
                    alt3=2;
                }
                else if ( (LA3_2==15||(LA3_2>=20 && LA3_2<=21)||LA3_2==23) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==15||(LA3_3>=20 && LA3_3<=21)||LA3_3==23) ) {
                    alt3=1;
                }
                else if ( ((LA3_3>=RULE_ID && LA3_3<=RULE_UNRESTRICTED_NAME)||LA3_3==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==15||(LA3_4>=20 && LA3_4<=21)||LA3_4==23) ) {
                    alt3=1;
                }
                else if ( ((LA3_4>=RULE_ID && LA3_4<=RULE_UNRESTRICTED_NAME)||LA3_4==22) ) {
                    alt3=2;
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
            case 21:
            case 23:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 22:
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
    // InternalAlf.g:238:1: ruleNonFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) ;
    public final EObject ruleNonFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_1_0 = null;

        AntlrDatatypeRuleToken lv_memberName_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:244:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) )
            // InternalAlf.g:245:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            {
            // InternalAlf.g:245:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            // InternalAlf.g:246:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            {
            // InternalAlf.g:246:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=50 && LA4_0<=53)) ) {
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

            // InternalAlf.g:265:3: ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
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
                    // InternalAlf.g:286:4: ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    {
                    // InternalAlf.g:286:4: ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    // InternalAlf.g:287:5: ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';'
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getNonFeatureMemberKindParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    ruleNonFeatureMemberKind();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalAlf.g:294:5: ( (lv_memberName_3_0= ruleName ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAlf.g:295:6: (lv_memberName_3_0= ruleName )
                            {
                            // InternalAlf.g:295:6: (lv_memberName_3_0= ruleName )
                            // InternalAlf.g:296:7: lv_memberName_3_0= ruleName
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
                    				
                    // InternalAlf.g:317:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:318:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:318:6: ( ruleQualifiedName )
                    // InternalAlf.g:319:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementCrossReference_1_1_3_0());
                    						
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


    // $ANTLR start "entryRuleNonFeatureMemberKind"
    // InternalAlf.g:343:1: entryRuleNonFeatureMemberKind returns [String current=null] : iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF ;
    public final String entryRuleNonFeatureMemberKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonFeatureMemberKind = null;


        try {
            // InternalAlf.g:343:60: (iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF )
            // InternalAlf.g:344:2: iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureMemberKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureMemberKind=ruleNonFeatureMemberKind();

            state._fsp--;

             current =iv_ruleNonFeatureMemberKind.getText(); 
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
    // $ANTLR end "entryRuleNonFeatureMemberKind"


    // $ANTLR start "ruleNonFeatureMemberKind"
    // InternalAlf.g:350:1: ruleNonFeatureMemberKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' | kw= 'class' | kw= 'assoc' ) ;
    public final AntlrDatatypeRuleToken ruleNonFeatureMemberKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:356:2: ( (kw= 'package' | kw= 'class' | kw= 'assoc' ) )
            // InternalAlf.g:357:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            {
            // InternalAlf.g:357:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAlf.g:358:3: kw= 'package'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:364:3: kw= 'class'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:370:3: kw= 'assoc'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getAssocKeyword_2());
                    		

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
    // $ANTLR end "ruleNonFeatureMemberKind"


    // $ANTLR start "entryRulePackagedFeatureMember"
    // InternalAlf.g:379:1: entryRulePackagedFeatureMember returns [EObject current=null] : iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF ;
    public final EObject entryRulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedFeatureMember = null;


        try {
            // InternalAlf.g:379:62: (iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF )
            // InternalAlf.g:380:2: iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF
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
    // InternalAlf.g:386:1: rulePackagedFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) ;
    public final EObject rulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_6_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:392:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) )
            // InternalAlf.g:393:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            {
            // InternalAlf.g:393:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            // InternalAlf.g:394:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            {
            // InternalAlf.g:394:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=50 && LA8_0<=53)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:395:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:395:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:396:5: lv_visibility_0_0= ruleVisibilityIndicator
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

            // InternalAlf.g:413:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:414:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:414:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) )
                    // InternalAlf.g:415:5: (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) )
                    {
                    // InternalAlf.g:415:5: (otherlv_1= 'feature' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAlf.g:416:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_10); 

                            						newLeafNode(otherlv_1, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:421:5: ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) )
                    // InternalAlf.g:422:6: (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition )
                    {
                    // InternalAlf.g:422:6: (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition )
                    // InternalAlf.g:423:7: lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleTypedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_2_0,
                    								"org.omg.sysml.Alf.TypedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:442:4: (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:442:4: (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) )
                    // InternalAlf.g:443:5: otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0());
                    				
                    // InternalAlf.g:447:5: ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) )
                    // InternalAlf.g:448:6: (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition )
                    {
                    // InternalAlf.g:448:6: (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition )
                    // InternalAlf.g:449:7: lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleUntypedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_4_0,
                    								"org.omg.sysml.Alf.UntypedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:468:4: ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:468:4: ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:469:5: ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    // InternalAlf.g:469:5: ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
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
                            // InternalAlf.g:470:6: (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? )
                            {
                            // InternalAlf.g:470:6: (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? )
                            // InternalAlf.g:471:7: otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )?
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_7); 

                            							newLeafNode(otherlv_5, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_2_0_0_0());
                            						
                            // InternalAlf.g:475:7: ( (lv_memberName_6_0= ruleName ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalAlf.g:476:8: (lv_memberName_6_0= ruleName )
                                    {
                                    // InternalAlf.g:476:8: (lv_memberName_6_0= ruleName )
                                    // InternalAlf.g:477:9: lv_memberName_6_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_8);
                                    lv_memberName_6_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_6_0,
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
                            // InternalAlf.g:496:6: ( (lv_memberName_7_0= ruleName ) )
                            {
                            // InternalAlf.g:496:6: ( (lv_memberName_7_0= ruleName ) )
                            // InternalAlf.g:497:7: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:497:7: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:498:8: lv_memberName_7_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_1_0());
                            							
                            pushFollow(FOLLOW_8);
                            lv_memberName_7_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_7_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_1_2_1());
                    				
                    // InternalAlf.g:520:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:521:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:521:6: ( ruleQualifiedName )
                    // InternalAlf.g:522:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_2_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_2_3());
                    				

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
    // InternalAlf.g:546:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:546:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:547:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:553:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:559:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) )
            // InternalAlf.g:560:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            {
            // InternalAlf.g:560:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=20 && LA13_0<=21)||LA13_0==23) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:561:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:570:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
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
    // InternalAlf.g:582:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:582:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:583:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:589:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;

        EObject this_AssociationDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:595:2: ( (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:596:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:596:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub )
            int alt14=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==21) ) {
                    alt14=2;
                }
                else if ( (LA14_1==20) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt14=1;
                }
                break;
            case 21:
                {
                alt14=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAlf.g:597:3: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDefinitionOrStub_0=ruleClassDefinitionOrStub();

                    state._fsp--;


                    			current = this_ClassDefinitionOrStub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:606:3: this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getAssociationDefinitionOrStubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationDefinitionOrStub_1=ruleAssociationDefinitionOrStub();

                    state._fsp--;


                    			current = this_AssociationDefinitionOrStub_1;
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
    // $ANTLR end "ruleClassifierDefinitionOrStub"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalAlf.g:618:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:618:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:619:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalAlf.g:625:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
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
            // InternalAlf.g:631:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:632:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:632:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:633:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:633:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:634:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:634:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:635:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,23,FOLLOW_12); 

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
            		
            // InternalAlf.g:651:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:652:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:652:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:653:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalAlf.g:670:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18||LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:671:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:671:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==18) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==24) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:672:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:677:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:682:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:683:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:683:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:684:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalAlf.g:701:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAlf.g:702:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:706:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:707:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:707:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:708:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop17;
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
    // InternalAlf.g:731:1: entryRuleOwnedGeneralization returns [EObject current=null] : iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF ;
    public final EObject entryRuleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedGeneralization = null;


        try {
            // InternalAlf.g:731:60: (iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF )
            // InternalAlf.g:732:2: iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF
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
    // InternalAlf.g:738:1: ruleOwnedGeneralization returns [EObject current=null] : ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) ;
    public final EObject ruleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:744:2: ( ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) )
            // InternalAlf.g:745:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            {
            // InternalAlf.g:745:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            // InternalAlf.g:746:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            {
            // InternalAlf.g:746:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            // InternalAlf.g:747:4: lv_ownedMemberElement_0_0= ruleGeneralization
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
    // InternalAlf.g:767:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:767:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:768:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:774:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:780:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:781:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:781:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:782:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:782:3: ( ruleQualifiedName )
            // InternalAlf.g:783:4: ruleQualifiedName
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
    // InternalAlf.g:800:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:800:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:801:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalAlf.g:807:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:813:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:814:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:814:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            // InternalAlf.g:815:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:827:3: ( (lv_ownedMembership_2_0= ruleClassMember ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_UNRESTRICTED_NAME)||LA19_0==15||(LA19_0>=20 && LA19_0<=23)||(LA19_0>=26 && LA19_0<=27)||(LA19_0>=50 && LA19_0<=56)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlf.g:828:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:828:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    // InternalAlf.g:829:5: lv_ownedMembership_2_0= ruleClassMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop19;
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
    // InternalAlf.g:854:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:854:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:855:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:861:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:867:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:868:2: this_ClassDefinition_0= ruleClassDefinition
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
    // InternalAlf.g:879:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:879:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:880:2: iv_ruleClassMember= ruleClassMember EOF
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
    // InternalAlf.g:886:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_ClassFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:892:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) )
            // InternalAlf.g:893:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            {
            // InternalAlf.g:893:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 50:
                {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>=RULE_ID && LA20_1<=RULE_UNRESTRICTED_NAME)||LA20_1==22||(LA20_1>=26 && LA20_1<=27)||(LA20_1>=54 && LA20_1<=56)) ) {
                    alt20=2;
                }
                else if ( (LA20_1==15||(LA20_1>=20 && LA20_1<=21)||LA20_1==23) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                int LA20_2 = input.LA(2);

                if ( ((LA20_2>=RULE_ID && LA20_2<=RULE_UNRESTRICTED_NAME)||LA20_2==22||(LA20_2>=26 && LA20_2<=27)||(LA20_2>=54 && LA20_2<=56)) ) {
                    alt20=2;
                }
                else if ( (LA20_2==15||(LA20_2>=20 && LA20_2<=21)||LA20_2==23) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==15||(LA20_3>=20 && LA20_3<=21)||LA20_3==23) ) {
                    alt20=1;
                }
                else if ( ((LA20_3>=RULE_ID && LA20_3<=RULE_UNRESTRICTED_NAME)||LA20_3==22||(LA20_3>=26 && LA20_3<=27)||(LA20_3>=54 && LA20_3<=56)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA20_4 = input.LA(2);

                if ( ((LA20_4>=RULE_ID && LA20_4<=RULE_UNRESTRICTED_NAME)||LA20_4==22||(LA20_4>=26 && LA20_4<=27)||(LA20_4>=54 && LA20_4<=56)) ) {
                    alt20=2;
                }
                else if ( (LA20_4==15||(LA20_4>=20 && LA20_4<=21)||LA20_4==23) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 20:
            case 21:
            case 23:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 22:
            case 26:
            case 27:
            case 54:
            case 55:
            case 56:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAlf.g:894:3: this_NonFeatureMember_0= ruleNonFeatureMember
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
                    // InternalAlf.g:903:3: this_ClassFeatureMember_1= ruleClassFeatureMember
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
    // InternalAlf.g:915:1: entryRuleClassFeatureMember returns [EObject current=null] : iv_ruleClassFeatureMember= ruleClassFeatureMember EOF ;
    public final EObject entryRuleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassFeatureMember = null;


        try {
            // InternalAlf.g:915:59: (iv_ruleClassFeatureMember= ruleClassFeatureMember EOF )
            // InternalAlf.g:916:2: iv_ruleClassFeatureMember= ruleClassFeatureMember EOF
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
    // InternalAlf.g:922:1: ruleClassFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' ) ) ) ;
    public final EObject ruleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isPort_2_0=null;
        Token otherlv_5=null;
        Token lv_isPort_6_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        Enumerator lv_direction_7_0 = null;

        EObject lv_ownedMemberElement_8_0 = null;

        EObject lv_ownedMemberElement_10_0 = null;

        AntlrDatatypeRuleToken lv_memberName_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_13_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:928:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' ) ) ) )
            // InternalAlf.g:929:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' ) ) )
            {
            // InternalAlf.g:929:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' ) ) )
            // InternalAlf.g:930:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' ) )
            {
            // InternalAlf.g:930:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=50 && LA21_0<=53)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:931:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:931:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:932:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_16);
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

            // InternalAlf.g:949:3: ( ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' ) )
            int alt28=4;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:950:4: ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:950:4: ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) )
                    // InternalAlf.g:951:5: (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) )
                    {
                    // InternalAlf.g:951:5: (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )?
                    int alt22=3;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==22) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==26) ) {
                        alt22=2;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAlf.g:952:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_17); 

                            						newLeafNode(otherlv_1, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:957:6: ( (lv_isPort_2_0= 'port' ) )
                            {
                            // InternalAlf.g:957:6: ( (lv_isPort_2_0= 'port' ) )
                            // InternalAlf.g:958:7: (lv_isPort_2_0= 'port' )
                            {
                            // InternalAlf.g:958:7: (lv_isPort_2_0= 'port' )
                            // InternalAlf.g:959:8: lv_isPort_2_0= 'port'
                            {
                            lv_isPort_2_0=(Token)match(input,26,FOLLOW_17); 

                            								newLeafNode(lv_isPort_2_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:972:5: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=54 && LA23_0<=56)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:973:6: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:973:6: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:974:7: lv_direction_3_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
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
                            break;

                    }

                    // InternalAlf.g:991:5: ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) )
                    // InternalAlf.g:992:6: (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition )
                    {
                    // InternalAlf.g:992:6: (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition )
                    // InternalAlf.g:993:7: lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleTypedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_4_0,
                    								"org.omg.sysml.Alf.TypedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1012:4: ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1012:4: ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) )
                    // InternalAlf.g:1013:5: (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1013:5: (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==22) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==26) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:1014:6: otherlv_5= 'feature'
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_18); 

                            						newLeafNode(otherlv_5, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1019:6: ( (lv_isPort_6_0= 'port' ) )
                            {
                            // InternalAlf.g:1019:6: ( (lv_isPort_6_0= 'port' ) )
                            // InternalAlf.g:1020:7: (lv_isPort_6_0= 'port' )
                            {
                            // InternalAlf.g:1020:7: (lv_isPort_6_0= 'port' )
                            // InternalAlf.g:1021:8: lv_isPort_6_0= 'port'
                            {
                            lv_isPort_6_0=(Token)match(input,26,FOLLOW_18); 

                            								newLeafNode(lv_isPort_6_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1034:5: ( (lv_direction_7_0= ruleFeatureDirection ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=54 && LA25_0<=56)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAlf.g:1035:6: (lv_direction_7_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1035:6: (lv_direction_7_0= ruleFeatureDirection )
                            // InternalAlf.g:1036:7: lv_direction_7_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_direction_7_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_7_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1053:5: ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) )
                    // InternalAlf.g:1054:6: (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition )
                    {
                    // InternalAlf.g:1054:6: (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition )
                    // InternalAlf.g:1055:7: lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_8_0=ruleUntypedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_8_0,
                    								"org.omg.sysml.Alf.UntypedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1074:4: (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1074:4: (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1075:5: otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) )
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_19); 

                    					newLeafNode(otherlv_9, grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_2_0());
                    				
                    // InternalAlf.g:1079:5: ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1080:6: (lv_ownedMemberElement_10_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1080:6: (lv_ownedMemberElement_10_0= ruleConnectorDefinition )
                    // InternalAlf.g:1081:7: lv_ownedMemberElement_10_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_10_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_10_0,
                    								"org.omg.sysml.Alf.ConnectorDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1100:4: ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' )
                    {
                    // InternalAlf.g:1100:4: ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' )
                    // InternalAlf.g:1101:5: ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';'
                    {
                    // InternalAlf.g:1101:5: ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==22) ) {
                        alt27=1;
                    }
                    else if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalAlf.g:1102:6: (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1102:6: (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? )
                            // InternalAlf.g:1103:7: otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )?
                            {
                            otherlv_11=(Token)match(input,22,FOLLOW_7); 

                            							newLeafNode(otherlv_11, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_3_0_0_0());
                            						
                            // InternalAlf.g:1107:7: ( (lv_memberName_12_0= ruleName ) )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalAlf.g:1108:8: (lv_memberName_12_0= ruleName )
                                    {
                                    // InternalAlf.g:1108:8: (lv_memberName_12_0= ruleName )
                                    // InternalAlf.g:1109:9: lv_memberName_12_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_8);
                                    lv_memberName_12_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_12_0,
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
                            // InternalAlf.g:1128:6: ( (lv_memberName_13_0= ruleName ) )
                            {
                            // InternalAlf.g:1128:6: ( (lv_memberName_13_0= ruleName ) )
                            // InternalAlf.g:1129:7: (lv_memberName_13_0= ruleName )
                            {
                            // InternalAlf.g:1129:7: (lv_memberName_13_0= ruleName )
                            // InternalAlf.g:1130:8: lv_memberName_13_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_1_0());
                            							
                            pushFollow(FOLLOW_8);
                            lv_memberName_13_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_13_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_14, grammarAccess.getClassFeatureMemberAccess().getIsKeyword_1_3_1());
                    				
                    // InternalAlf.g:1152:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1153:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1153:6: ( ruleQualifiedName )
                    // InternalAlf.g:1154:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementCrossReference_1_3_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_16=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_16, grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_1_3_3());
                    				

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
    // $ANTLR end "ruleClassFeatureMember"


    // $ANTLR start "entryRuleAssociationDeclaration"
    // InternalAlf.g:1178:1: entryRuleAssociationDeclaration returns [EObject current=null] : iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF ;
    public final EObject entryRuleAssociationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDeclaration = null;


        try {
            // InternalAlf.g:1178:63: (iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF )
            // InternalAlf.g:1179:2: iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAssociationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDeclaration=ruleAssociationDeclaration();

            state._fsp--;

             current =iv_ruleAssociationDeclaration; 
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
    // $ANTLR end "entryRuleAssociationDeclaration"


    // $ANTLR start "ruleAssociationDeclaration"
    // InternalAlf.g:1185:1: ruleAssociationDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
    public final EObject ruleAssociationDeclaration() throws RecognitionException {
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
            // InternalAlf.g:1191:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:1192:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1192:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:1193:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:1193:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1194:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1194:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1195:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,23,FOLLOW_20); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDeclarationAccess().getAssocKeyword_1());
            		
            // InternalAlf.g:1211:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1212:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1212:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1213:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1230:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18||LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1231:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:1231:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==18) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==24) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAlf.g:1232:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1237:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1242:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:1243:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:1243:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:1244:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_ownedMembership_5_0=ruleOwnedGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedMembership",
                    							lv_ownedMembership_5_0,
                    							"org.omg.sysml.Alf.OwnedGeneralization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1261:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==25) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalAlf.g:1262:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1266:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:1267:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:1267:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:1268:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_ownedMembership_7_0=ruleOwnedGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
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
                    	    break loop31;
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
    // $ANTLR end "ruleAssociationDeclaration"


    // $ANTLR start "entryRuleAssociationDefinition"
    // InternalAlf.g:1291:1: entryRuleAssociationDefinition returns [EObject current=null] : iv_ruleAssociationDefinition= ruleAssociationDefinition EOF ;
    public final EObject entryRuleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinition = null;


        try {
            // InternalAlf.g:1291:62: (iv_ruleAssociationDefinition= ruleAssociationDefinition EOF )
            // InternalAlf.g:1292:2: iv_ruleAssociationDefinition= ruleAssociationDefinition EOF
            {
             newCompositeNode(grammarAccess.getAssociationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDefinition=ruleAssociationDefinition();

            state._fsp--;

             current =iv_ruleAssociationDefinition; 
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
    // $ANTLR end "entryRuleAssociationDefinition"


    // $ANTLR start "ruleAssociationDefinition"
    // InternalAlf.g:1298:1: ruleAssociationDefinition returns [EObject current=null] : (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}' ) ;
    public final EObject ruleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_AssociationDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;

        EObject lv_ownedMembership_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1304:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}' ) )
            // InternalAlf.g:1305:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}' )
            {
            // InternalAlf.g:1305:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}' )
            // InternalAlf.g:1306:3: this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) ) ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) ) otherlv_4= '}'
            {

            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_AssociationDeclaration_0=ruleAssociationDeclaration();

            state._fsp--;


            			current = this_AssociationDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1318:3: ( (lv_ownedMembership_2_0= rulePackagedFeatureMember ) )
            // InternalAlf.g:1319:4: (lv_ownedMembership_2_0= rulePackagedFeatureMember )
            {
            // InternalAlf.g:1319:4: (lv_ownedMembership_2_0= rulePackagedFeatureMember )
            // InternalAlf.g:1320:5: lv_ownedMembership_2_0= rulePackagedFeatureMember
            {

            					newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipPackagedFeatureMemberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_ownedMembership_2_0=rulePackagedFeatureMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_2_0,
            						"org.omg.sysml.Alf.PackagedFeatureMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1337:3: ( (lv_ownedMembership_3_0= rulePackagedFeatureMember ) )
            // InternalAlf.g:1338:4: (lv_ownedMembership_3_0= rulePackagedFeatureMember )
            {
            // InternalAlf.g:1338:4: (lv_ownedMembership_3_0= rulePackagedFeatureMember )
            // InternalAlf.g:1339:5: lv_ownedMembership_3_0= rulePackagedFeatureMember
            {

            					newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipPackagedFeatureMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_ownedMembership_3_0=rulePackagedFeatureMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_3_0,
            						"org.omg.sysml.Alf.PackagedFeatureMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAssociationDefinition"


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:1364:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:1364:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:1365:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getAssociationDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDefinitionOrStub=ruleAssociationDefinitionOrStub();

            state._fsp--;

             current =iv_ruleAssociationDefinitionOrStub; 
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
    // $ANTLR end "entryRuleAssociationDefinitionOrStub"


    // $ANTLR start "ruleAssociationDefinitionOrStub"
    // InternalAlf.g:1371:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1377:2: (this_AssociationDefinition_0= ruleAssociationDefinition )
            // InternalAlf.g:1378:2: this_AssociationDefinition_0= ruleAssociationDefinition
            {

            		newCompositeNode(grammarAccess.getAssociationDefinitionOrStubAccess().getAssociationDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssociationDefinition_0=ruleAssociationDefinition();

            state._fsp--;


            		current = this_AssociationDefinition_0;
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
    // $ANTLR end "ruleAssociationDefinitionOrStub"


    // $ANTLR start "entryRuleTypedFeatureDefinition"
    // InternalAlf.g:1389:1: entryRuleTypedFeatureDefinition returns [EObject current=null] : iv_ruleTypedFeatureDefinition= ruleTypedFeatureDefinition EOF ;
    public final EObject entryRuleTypedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedFeatureDefinition = null;


        try {
            // InternalAlf.g:1389:63: (iv_ruleTypedFeatureDefinition= ruleTypedFeatureDefinition EOF )
            // InternalAlf.g:1390:2: iv_ruleTypedFeatureDefinition= ruleTypedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedFeatureDefinition=ruleTypedFeatureDefinition();

            state._fsp--;

             current =iv_ruleTypedFeatureDefinition; 
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
    // $ANTLR end "entryRuleTypedFeatureDefinition"


    // $ANTLR start "ruleTypedFeatureDefinition"
    // InternalAlf.g:1396:1: ruleTypedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? ( ( (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';' ) | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) ;
    public final EObject ruleTypedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isComposite_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_upper_9_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_ownedMembership_15_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1402:2: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? ( ( (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';' ) | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) )
            // InternalAlf.g:1403:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? ( ( (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';' ) | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
            {
            // InternalAlf.g:1403:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? ( ( (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';' ) | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
            // InternalAlf.g:1404:3: ( (lv_name_0_0= ruleName ) ) (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? ( ( (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';' ) | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
            {
            // InternalAlf.g:1404:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:1405:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:1405:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:1406:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1423:3: (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:1424:4: otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypedFeatureDefinitionAccess().getColonKeyword_1_0());
                    			
                    // InternalAlf.g:1428:4: ( (lv_isComposite_2_0= 'composes' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==29) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:1429:5: (lv_isComposite_2_0= 'composes' )
                            {
                            // InternalAlf.g:1429:5: (lv_isComposite_2_0= 'composes' )
                            // InternalAlf.g:1430:6: lv_isComposite_2_0= 'composes'
                            {
                            lv_isComposite_2_0=(Token)match(input,29,FOLLOW_25); 

                            						newLeafNode(lv_isComposite_2_0, grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypedFeatureDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "isComposite", true, "composes");
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1442:4: ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==30) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:1443:5: ( ( ruleQualifiedName ) )
                            {
                            // InternalAlf.g:1443:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:1444:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:1444:6: ( ruleQualifiedName )
                            // InternalAlf.g:1445:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypedFeatureDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_2_0_0());
                            						
                            pushFollow(FOLLOW_26);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1460:5: otherlv_4= 'any'
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getTypedFeatureDefinitionAccess().getAnyKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1465:4: ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==18||(LA35_0>=35 && LA35_0<=36)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAlf.g:1466:5: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                            {
                            // InternalAlf.g:1466:5: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                            // InternalAlf.g:1467:6: lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset
                            {

                            						newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_ownedMembership_5_0=ruleOwnedRedefinitionOrSubset();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                            						}
                            						add(
                            							current,
                            							"ownedMembership",
                            							lv_ownedMembership_5_0,
                            							"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAlf.g:1485:3: (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:1486:4: otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalAlf.g:1490:4: ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_NATURAL_VALUE) ) {
                        int LA37_1 = input.LA(2);

                        if ( (LA37_1==32) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalAlf.g:1491:5: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..'
                            {
                            // InternalAlf.g:1491:5: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:1492:6: (lv_lower_7_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1492:6: (lv_lower_7_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:1493:7: lv_lower_7_0= ruleNaturalLiteralExpression
                            {

                            							newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_29);
                            lv_lower_7_0=ruleNaturalLiteralExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"lower",
                            								lv_lower_7_0,
                            								"org.omg.sysml.Alf.NaturalLiteralExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_8=(Token)match(input,32,FOLLOW_28); 

                            					newLeafNode(otherlv_8, grammarAccess.getTypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1515:4: ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:1516:5: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1516:5: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1517:6: lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_upper_9_0=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_9_0,
                    							"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getTypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalAlf.g:1539:3: ( ( (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';' ) | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==19||LA41_0==34) ) {
                alt41=1;
            }
            else if ( (LA41_0==16) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:1540:4: ( (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';' )
                    {
                    // InternalAlf.g:1540:4: ( (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';' )
                    // InternalAlf.g:1541:5: (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? otherlv_13= ';'
                    {
                    // InternalAlf.g:1541:5: (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==34) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAlf.g:1542:6: otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) )
                            {
                            otherlv_11=(Token)match(input,34,FOLLOW_32); 

                            						newLeafNode(otherlv_11, grammarAccess.getTypedFeatureDefinitionAccess().getEqualsSignKeyword_3_0_0_0());
                            					
                            // InternalAlf.g:1546:6: ( (lv_value_12_0= ruleExpression ) )
                            // InternalAlf.g:1547:7: (lv_value_12_0= ruleExpression )
                            {
                            // InternalAlf.g:1547:7: (lv_value_12_0= ruleExpression )
                            // InternalAlf.g:1548:8: lv_value_12_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_3_0_0_1_0());
                            							
                            pushFollow(FOLLOW_9);
                            lv_value_12_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_12_0,
                            									"org.omg.sysml.Alf.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getTypedFeatureDefinitionAccess().getSemicolonKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1572:4: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                    {
                    // InternalAlf.g:1572:4: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                    // InternalAlf.g:1573:5: otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}'
                    {
                    otherlv_14=(Token)match(input,16,FOLLOW_15); 

                    					newLeafNode(otherlv_14, grammarAccess.getTypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalAlf.g:1577:5: ( (lv_ownedMembership_15_0= ruleClassMember ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_UNRESTRICTED_NAME)||LA40_0==15||(LA40_0>=20 && LA40_0<=23)||(LA40_0>=26 && LA40_0<=27)||(LA40_0>=50 && LA40_0<=56)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalAlf.g:1578:6: (lv_ownedMembership_15_0= ruleClassMember )
                    	    {
                    	    // InternalAlf.g:1578:6: (lv_ownedMembership_15_0= ruleClassMember )
                    	    // InternalAlf.g:1579:7: lv_ownedMembership_15_0= ruleClassMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_ownedMembership_15_0=ruleClassMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypedFeatureDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_15_0,
                    	    								"org.omg.sysml.Alf.ClassMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_16, grammarAccess.getTypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                    				

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
    // $ANTLR end "ruleTypedFeatureDefinition"


    // $ANTLR start "entryRuleUntypedFeatureDefinition"
    // InternalAlf.g:1606:1: entryRuleUntypedFeatureDefinition returns [EObject current=null] : iv_ruleUntypedFeatureDefinition= ruleUntypedFeatureDefinition EOF ;
    public final EObject entryRuleUntypedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntypedFeatureDefinition = null;


        try {
            // InternalAlf.g:1606:65: (iv_ruleUntypedFeatureDefinition= ruleUntypedFeatureDefinition EOF )
            // InternalAlf.g:1607:2: iv_ruleUntypedFeatureDefinition= ruleUntypedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getUntypedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUntypedFeatureDefinition=ruleUntypedFeatureDefinition();

            state._fsp--;

             current =iv_ruleUntypedFeatureDefinition; 
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
    // $ANTLR end "entryRuleUntypedFeatureDefinition"


    // $ANTLR start "ruleUntypedFeatureDefinition"
    // InternalAlf.g:1613:1: ruleUntypedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';' ) ) ) ;
    public final EObject ruleUntypedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_lower_3_0 = null;

        EObject lv_upper_5_0 = null;

        EObject lv_value_8_0 = null;

        EObject lv_ownedMembership_11_0 = null;

        EObject lv_lower_14_0 = null;

        EObject lv_upper_16_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1619:2: ( ( ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';' ) ) ) )
            // InternalAlf.g:1620:2: ( ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';' ) ) )
            {
            // InternalAlf.g:1620:2: ( ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';' ) ) )
            // InternalAlf.g:1621:3: ( (lv_name_0_0= ruleName ) )? ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';' ) )
            {
            // InternalAlf.g:1621:3: ( (lv_name_0_0= ruleName ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:1622:4: (lv_name_0_0= ruleName )
                    {
                    // InternalAlf.g:1622:4: (lv_name_0_0= ruleName )
                    // InternalAlf.g:1623:5: lv_name_0_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_name_0_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
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

            // InternalAlf.g:1640:3: ( (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:1641:4: (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:1641:4: (lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:1642:5: lv_ownedMembership_1_0= ruleOwnedRedefinitionOrSubset
            {

            					newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_ownedMembership_1_0=ruleOwnedRedefinitionOrSubset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_1_0,
            						"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1659:3: ( ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) ) | (otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_NATURAL_VALUE) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==32) ) {
                        int LA48_5 = input.LA(4);

                        if ( (LA48_5==RULE_NATURAL_VALUE) ) {
                            int LA48_7 = input.LA(5);

                            if ( (LA48_7==33) ) {
                                int LA48_6 = input.LA(6);

                                if ( (LA48_6==16||LA48_6==34) ) {
                                    alt48=1;
                                }
                                else if ( (LA48_6==19) ) {
                                    alt48=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 48, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA48_5==41) ) {
                            int LA48_4 = input.LA(5);

                            if ( (LA48_4==33) ) {
                                int LA48_6 = input.LA(6);

                                if ( (LA48_6==16||LA48_6==34) ) {
                                    alt48=1;
                                }
                                else if ( (LA48_6==19) ) {
                                    alt48=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 48, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA48_3==33) ) {
                        int LA48_6 = input.LA(4);

                        if ( (LA48_6==16||LA48_6==34) ) {
                            alt48=1;
                        }
                        else if ( (LA48_6==19) ) {
                            alt48=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA48_1==41) ) {
                    int LA48_4 = input.LA(3);

                    if ( (LA48_4==33) ) {
                        int LA48_6 = input.LA(4);

                        if ( (LA48_6==16||LA48_6==34) ) {
                            alt48=1;
                        }
                        else if ( (LA48_6==19) ) {
                            alt48=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA48_0==16||LA48_0==34) ) {
                alt48=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:1660:4: ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) )
                    {
                    // InternalAlf.g:1660:4: ( (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) ) )
                    // InternalAlf.g:1661:5: (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )? ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) )
                    {
                    // InternalAlf.g:1661:5: (otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==31) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAlf.g:1662:6: otherlv_2= '[' ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )? ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_6= ']'
                            {
                            otherlv_2=(Token)match(input,31,FOLLOW_28); 

                            						newLeafNode(otherlv_2, grammarAccess.getUntypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0_0_0());
                            					
                            // InternalAlf.g:1666:6: ( ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..' )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==RULE_NATURAL_VALUE) ) {
                                int LA43_1 = input.LA(2);

                                if ( (LA43_1==32) ) {
                                    alt43=1;
                                }
                            }
                            switch (alt43) {
                                case 1 :
                                    // InternalAlf.g:1667:7: ( (lv_lower_3_0= ruleNaturalLiteralExpression ) ) otherlv_4= '..'
                                    {
                                    // InternalAlf.g:1667:7: ( (lv_lower_3_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:1668:8: (lv_lower_3_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:1668:8: (lv_lower_3_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:1669:9: lv_lower_3_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_0_0_1_0_0());
                                    								
                                    pushFollow(FOLLOW_29);
                                    lv_lower_3_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_3_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_4=(Token)match(input,32,FOLLOW_28); 

                                    							newLeafNode(otherlv_4, grammarAccess.getUntypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_0_0_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:1691:6: ( (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:1692:7: (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1692:7: (lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:1693:8: lv_upper_5_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0_0_2_0());
                            							
                            pushFollow(FOLLOW_30);
                            lv_upper_5_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_5_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_6=(Token)match(input,33,FOLLOW_34); 

                            						newLeafNode(otherlv_6, grammarAccess.getUntypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_0_0_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1715:5: ( (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' ) | (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==34) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==16) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalAlf.g:1716:6: (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' )
                            {
                            // InternalAlf.g:1716:6: (otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';' )
                            // InternalAlf.g:1717:7: otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) otherlv_9= ';'
                            {
                            otherlv_7=(Token)match(input,34,FOLLOW_32); 

                            							newLeafNode(otherlv_7, grammarAccess.getUntypedFeatureDefinitionAccess().getEqualsSignKeyword_2_0_1_0_0());
                            						
                            // InternalAlf.g:1721:7: ( (lv_value_8_0= ruleExpression ) )
                            // InternalAlf.g:1722:8: (lv_value_8_0= ruleExpression )
                            {
                            // InternalAlf.g:1722:8: (lv_value_8_0= ruleExpression )
                            // InternalAlf.g:1723:9: lv_value_8_0= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_0_1_0_1_0());
                            								
                            pushFollow(FOLLOW_9);
                            lv_value_8_0=ruleExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"value",
                            										lv_value_8_0,
                            										"org.omg.sysml.Alf.Expression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_9=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(otherlv_9, grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_0_1_0_2());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1746:6: (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' )
                            {
                            // InternalAlf.g:1746:6: (otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}' )
                            // InternalAlf.g:1747:7: otherlv_10= '{' ( (lv_ownedMembership_11_0= ruleClassMember ) )* otherlv_12= '}'
                            {
                            otherlv_10=(Token)match(input,16,FOLLOW_15); 

                            							newLeafNode(otherlv_10, grammarAccess.getUntypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1_1_0());
                            						
                            // InternalAlf.g:1751:7: ( (lv_ownedMembership_11_0= ruleClassMember ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_UNRESTRICTED_NAME)||LA45_0==15||(LA45_0>=20 && LA45_0<=23)||(LA45_0>=26 && LA45_0<=27)||(LA45_0>=50 && LA45_0<=56)) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalAlf.g:1752:8: (lv_ownedMembership_11_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:1752:8: (lv_ownedMembership_11_0= ruleClassMember )
                            	    // InternalAlf.g:1753:9: lv_ownedMembership_11_0= ruleClassMember
                            	    {

                            	    									newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_15);
                            	    lv_ownedMembership_11_0=ruleClassMember();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedMembership",
                            	    										lv_ownedMembership_11_0,
                            	    										"org.omg.sysml.Alf.ClassMember");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);

                            otherlv_12=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(otherlv_12, grammarAccess.getUntypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_1_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1778:4: (otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';' )
                    {
                    // InternalAlf.g:1778:4: (otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';' )
                    // InternalAlf.g:1779:5: otherlv_13= '[' ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )? ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_17= ']' otherlv_18= ';'
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_28); 

                    					newLeafNode(otherlv_13, grammarAccess.getUntypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalAlf.g:1783:5: ( ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_NATURAL_VALUE) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==32) ) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAlf.g:1784:6: ( (lv_lower_14_0= ruleNaturalLiteralExpression ) ) otherlv_15= '..'
                            {
                            // InternalAlf.g:1784:6: ( (lv_lower_14_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:1785:7: (lv_lower_14_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1785:7: (lv_lower_14_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:1786:8: lv_lower_14_0= ruleNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_1_0_0());
                            							
                            pushFollow(FOLLOW_29);
                            lv_lower_14_0=ruleNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"lower",
                            									lv_lower_14_0,
                            									"org.omg.sysml.Alf.NaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_15=(Token)match(input,32,FOLLOW_28); 

                            						newLeafNode(otherlv_15, grammarAccess.getUntypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_1_1());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1808:5: ( (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:1809:6: (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1809:6: (lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1810:7: lv_upper_16_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    							newCompositeNode(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_30);
                    lv_upper_16_0=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getUntypedFeatureDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"upper",
                    								lv_upper_16_0,
                    								"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,33,FOLLOW_9); 

                    					newLeafNode(otherlv_17, grammarAccess.getUntypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_3());
                    				
                    otherlv_18=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_18, grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_1_4());
                    				

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
    // $ANTLR end "ruleUntypedFeatureDefinition"


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:1841:1: entryRuleOwnedRedefinitionOrSubset returns [EObject current=null] : iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF ;
    public final EObject entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedRedefinitionOrSubset = null;


        try {
            // InternalAlf.g:1841:66: (iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:1842:2: iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF
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
    // InternalAlf.g:1848:1: ruleOwnedRedefinitionOrSubset returns [EObject current=null] : ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) ;
    public final EObject ruleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1854:2: ( ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) )
            // InternalAlf.g:1855:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            {
            // InternalAlf.g:1855:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==18||LA50_0==35) ) {
                alt50=1;
            }
            else if ( (LA50_0==36) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:1856:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    {
                    // InternalAlf.g:1856:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    // InternalAlf.g:1857:4: (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    {
                    // InternalAlf.g:1857:4: (otherlv_0= 'is' | otherlv_1= 'redefines' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==18) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==35) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalAlf.g:1858:5: otherlv_0= 'is'
                            {
                            otherlv_0=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_0, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1863:5: otherlv_1= 'redefines'
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1868:4: ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    // InternalAlf.g:1869:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    {
                    // InternalAlf.g:1869:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    // InternalAlf.g:1870:6: lv_ownedMemberElement_2_0= ruleRedefinition
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
                    // InternalAlf.g:1889:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    {
                    // InternalAlf.g:1889:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    // InternalAlf.g:1890:4: otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0());
                    			
                    // InternalAlf.g:1894:4: ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    // InternalAlf.g:1895:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    {
                    // InternalAlf.g:1895:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    // InternalAlf.g:1896:6: lv_ownedMemberElement_4_0= ruleSubset
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
    // InternalAlf.g:1918:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:1918:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:1919:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:1925:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1931:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1932:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1932:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1933:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1933:3: ( ruleQualifiedName )
            // InternalAlf.g:1934:4: ruleQualifiedName
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
    // InternalAlf.g:1951:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:1951:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:1952:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:1958:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1964:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1965:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1965:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1966:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1966:3: ( ruleQualifiedName )
            // InternalAlf.g:1967:4: ruleQualifiedName
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
    // InternalAlf.g:1984:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:1984:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:1985:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:1991:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1997:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            // InternalAlf.g:1998:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            {
            // InternalAlf.g:1998:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            // InternalAlf.g:1999:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';'
            {
            // InternalAlf.g:1999:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
            int alt53=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==18||LA53_1==28) ) {
                        alt53=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (LA53_2==18||LA53_2==28) ) {
                        alt53=1;
                    }
                    }
                    break;
                case 18:
                case 28:
                    {
                    alt53=1;
                    }
                    break;
            }

            switch (alt53) {
                case 1 :
                    // InternalAlf.g:2000:4: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                    {
                    // InternalAlf.g:2000:4: ( (lv_name_0_0= ruleName ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlf.g:2001:5: (lv_name_0_0= ruleName )
                            {
                            // InternalAlf.g:2001:5: (lv_name_0_0= ruleName )
                            // InternalAlf.g:2002:6: lv_name_0_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_35);
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

                    // InternalAlf.g:2019:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==28) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalAlf.g:2020:5: otherlv_1= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_1=(Token)match(input,28,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:2024:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2025:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2025:6: ( ruleQualifiedName )
                            // InternalAlf.g:2026:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalAlf.g:2046:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2047:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2047:4: ( ruleQualifiedName )
            // InternalAlf.g:2048:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_36);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAlf.g:2066:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2067:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2067:4: ( ruleQualifiedName )
            // InternalAlf.g:2068:5: ruleQualifiedName
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

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_4());
            		

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
    // InternalAlf.g:2090:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:2090:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:2091:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:2097:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2103:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:2104:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:2115:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:2115:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:2116:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:2122:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:2128:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:2129:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:2129:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:2130:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2138:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=38 && LA55_0<=43)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2139:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:2139:4: ()
                    // InternalAlf.g:2140:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:2146:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=39 && LA54_0<=43)) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==38) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalAlf.g:2147:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:2147:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:2148:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:2148:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:2149:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:2149:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:2150:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_32);
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

                            // InternalAlf.g:2167:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:2168:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:2168:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:2169:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:2188:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:2188:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:2189:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:2189:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:2190:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:2190:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:2191:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,38,FOLLOW_38); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,31,FOLLOW_32); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:2207:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:2208:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:2208:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:2209:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_30);
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

                            otherlv_7=(Token)match(input,33,FOLLOW_2); 

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
    // InternalAlf.g:2237:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:2237:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:2238:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:2244:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:2250:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:2251:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:2251:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt56=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt56=1;
                }
                break;
            case 40:
                {
                alt56=2;
                }
                break;
            case 41:
                {
                alt56=3;
                }
                break;
            case 42:
                {
                alt56=4;
                }
                break;
            case 43:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalAlf.g:2252:3: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2258:3: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:2264:3: kw= '*'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:2270:3: kw= '/'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:2276:3: kw= '^'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAlf.g:2285:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:2285:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:2286:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:2292:1: ruleUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2298:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // InternalAlf.g:2299:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // InternalAlf.g:2299:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_BOOLEAN_VALUE && LA57_0<=RULE_UNRESTRICTED_NAME)||LA57_0==16||LA57_0==41||LA57_0==44||(LA57_0>=46 && LA57_0<=47)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=39 && LA57_0<=40)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:2300:3: this_PrimaryExpression_0= rulePrimaryExpression
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
                    // InternalAlf.g:2309:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // InternalAlf.g:2309:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // InternalAlf.g:2310:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // InternalAlf.g:2310:4: ()
                    // InternalAlf.g:2311:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:2317:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:2318:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:2318:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:2319:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    // InternalAlf.g:2336:4: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // InternalAlf.g:2337:5: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // InternalAlf.g:2337:5: (lv_operand_3_0= rulePrimaryExpression )
                    // InternalAlf.g:2338:6: lv_operand_3_0= rulePrimaryExpression
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
    // InternalAlf.g:2360:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:2360:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:2361:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:2367:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:2373:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:2374:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:2374:2: (kw= '+' | kw= '-' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            else if ( (LA58_0==40) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:2375:3: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2381:3: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalAlf.g:2390:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:2390:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:2391:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:2397:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:2403:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:2404:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:2404:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt59=5;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:2405:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:2414:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:2423:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:2432:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:2441:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:2441:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:2442:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_40);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,45,FOLLOW_2); 

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
    // InternalAlf.g:2463:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:2463:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:2464:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:2470:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2476:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2477:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2477:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2478:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2478:3: ( ruleQualifiedName )
            // InternalAlf.g:2479:4: ruleQualifiedName
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
    // InternalAlf.g:2496:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:2496:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:2497:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:2503:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2509:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:2510:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:2510:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:2511:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:2511:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2512:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2512:4: ( ruleQualifiedName )
            // InternalAlf.g:2513:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_41);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:2531:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_BOOLEAN_VALUE && LA61_0<=RULE_UNRESTRICTED_NAME)||LA61_0==16||(LA61_0>=39 && LA61_0<=41)||LA61_0==44||(LA61_0>=46 && LA61_0<=47)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:2532:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:2532:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:2533:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:2533:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:2534:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    // InternalAlf.g:2551:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==25) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalAlf.g:2552:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_32); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:2556:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:2557:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:2557:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:2558:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,45,FOLLOW_2); 

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
    // InternalAlf.g:2585:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:2585:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:2586:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:2592:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2598:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:2599:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:2599:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:2600:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:2600:3: ()
            // InternalAlf.g:2601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:2611:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_BOOLEAN_VALUE && LA63_0<=RULE_UNRESTRICTED_NAME)||LA63_0==16||(LA63_0>=39 && LA63_0<=41)||LA63_0==44||(LA63_0>=46 && LA63_0<=47)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:2612:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:2612:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:2613:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:2613:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:2614:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_45);
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

                    // InternalAlf.g:2631:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==25) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalAlf.g:2632:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_32); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:2636:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:2637:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:2637:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:2638:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop62;
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
    // InternalAlf.g:2665:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:2665:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:2666:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:2672:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:2678:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:2679:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:2679:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt64=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt64=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt64=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt64=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA64_4 = input.LA(2);

                if ( (LA64_4==EOF||LA64_4==17||LA64_4==19||LA64_4==25||LA64_4==33||(LA64_4>=38 && LA64_4<=43)||LA64_4==45) ) {
                    alt64=5;
                }
                else if ( (LA64_4==47) ) {
                    alt64=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 4, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt64=4;
                }
                break;
            case 41:
                {
                alt64=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalAlf.g:2680:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:2689:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:2698:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:2707:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:2716:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:2728:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:2728:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:2729:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:2735:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:2741:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:2742:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:2742:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:2743:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:2743:3: ()
            // InternalAlf.g:2744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

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
    // InternalAlf.g:2758:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:2758:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:2759:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:2765:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2771:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:2772:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:2772:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:2773:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:2773:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:2774:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:2793:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:2793:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:2794:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:2800:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2806:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:2807:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:2807:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:2808:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:2808:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:2809:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:2828:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:2828:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:2829:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:2835:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2841:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:2842:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:2842:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:2843:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:2843:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:2844:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:2864:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:2864:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:2865:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:2871:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:2877:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:2878:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:2878:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:2879:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:2879:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_NATURAL_VALUE) ) {
                alt66=1;
            }
            else if ( (LA66_0==47) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlf.g:2880:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:2880:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:2881:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_46); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,47,FOLLOW_47); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:2893:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_NATURAL_VALUE) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalAlf.g:2894:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_48); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2904:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:2904:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:2905:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,47,FOLLOW_49); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_48); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:2919:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=48 && LA69_0<=49)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlf.g:2920:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:2920:4: (kw= 'e' | kw= 'E' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==48) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==49) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalAlf.g:2921:5: kw= 'e'
                            {
                            kw=(Token)match(input,48,FOLLOW_50); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2927:5: kw= 'E'
                            {
                            kw=(Token)match(input,49,FOLLOW_50); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2933:4: (kw= '+' | kw= '-' )?
                    int alt68=3;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==39) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==40) ) {
                        alt68=2;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalAlf.g:2934:5: kw= '+'
                            {
                            kw=(Token)match(input,39,FOLLOW_49); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2940:5: kw= '-'
                            {
                            kw=(Token)match(input,40,FOLLOW_49); 

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
    // InternalAlf.g:2958:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:2958:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:2959:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:2965:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2971:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:2972:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:2972:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:2973:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:2973:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:2974:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:2993:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:2993:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:2994:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:3000:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3006:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:3007:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:3007:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_NATURAL_VALUE) ) {
                alt70=1;
            }
            else if ( (LA70_0==41) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:3008:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:3017:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:3017:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:3018:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:3018:4: ()
                    // InternalAlf.g:3019:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAlf.g:3034:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:3034:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:3035:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:3041:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:3047:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:3048:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:3048:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_UNRESTRICTED_NAME) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:3049:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3057:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:3068:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:3068:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:3069:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:3075:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3081:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalAlf.g:3082:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:3082:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalAlf.g:3083:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3093:3: (kw= '.' this_Name_2= ruleName )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==47) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAlf.g:3094:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,47,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_51);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // InternalAlf.g:3114:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:3120:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:3121:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:3121:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt73=1;
                }
                break;
            case 51:
                {
                alt73=2;
                }
                break;
            case 52:
                {
                alt73=3;
                }
                break;
            case 53:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalAlf.g:3122:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:3122:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:3123:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3130:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:3130:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:3131:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:3138:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:3138:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:3139:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:3146:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:3146:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:3147:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

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
    // InternalAlf.g:3157:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:3163:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:3164:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:3164:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt74=1;
                }
                break;
            case 55:
                {
                alt74=2;
                }
                break;
            case 56:
                {
                alt74=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalAlf.g:3165:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:3165:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:3166:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3173:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:3173:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:3174:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:3181:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:3181:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:3182:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\17\1\7\1\uffff\2\7\2\20\1\uffff\4\20\2\7\4\20\2\7\4\20";
    static final String dfa_3s = "\1\27\1\22\1\uffff\4\22\1\uffff\4\30\2\10\4\57\2\10\4\57";
    static final String dfa_4s = "\2\uffff\1\1\4\uffff\1\2\20\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\3\1\4\1\uffff\1\2",
            "\1\5\1\6\11\uffff\1\7",
            "",
            "\1\10\1\11\11\uffff\1\7",
            "\1\12\1\13\11\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "",
            "\1\2\1\uffff\1\14\5\uffff\1\2",
            "\1\2\1\uffff\1\14\5\uffff\1\2",
            "\1\2\1\uffff\1\15\5\uffff\1\2",
            "\1\2\1\uffff\1\15\5\uffff\1\2",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\2\2\uffff\1\7\5\uffff\1\2\25\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\25\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\25\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\25\uffff\1\23",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\2\2\uffff\1\7\5\uffff\1\2\25\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\25\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\25\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\25\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "265:3: ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\2\7\4\20\1\7\3\uffff\2\20\1\7\2\20";
    static final String dfa_9s = "\1\26\1\44\2\42\2\44\1\10\3\uffff\2\57\1\10\2\57";
    static final String dfa_10s = "\7\uffff\1\2\1\3\1\1\5\uffff";
    static final String dfa_11s = "\17\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\15\uffff\1\1",
            "\1\4\1\5\11\uffff\1\6\20\uffff\2\7",
            "\1\11\1\uffff\1\10\1\11\10\uffff\1\11\2\uffff\1\11\2\uffff\1\11",
            "\1\11\1\uffff\1\10\1\11\10\uffff\1\11\2\uffff\1\11\2\uffff\1\11",
            "\1\11\1\uffff\1\6\1\11\10\uffff\1\11\2\uffff\1\11\2\uffff\1\11\2\7",
            "\1\11\1\uffff\1\6\1\11\10\uffff\1\11\2\uffff\1\11\2\uffff\1\11\2\7",
            "\1\12\1\13",
            "",
            "",
            "",
            "\1\7\2\uffff\1\10\13\uffff\1\7\2\uffff\1\7\14\uffff\1\14",
            "\1\7\2\uffff\1\10\13\uffff\1\7\2\uffff\1\7\14\uffff\1\14",
            "\1\15\1\16",
            "\1\7\2\uffff\1\10\13\uffff\1\7\2\uffff\1\7\14\uffff\1\14",
            "\1\7\2\uffff\1\10\13\uffff\1\7\2\uffff\1\7\14\uffff\1\14"
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
            return "413:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleTypedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUntypedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )";
        }
    }
    static final String dfa_13s = "\26\uffff";
    static final String dfa_14s = "\3\7\1\uffff\2\20\1\uffff\3\7\2\20\1\7\1\uffff\2\20\1\uffff\2\20\1\7\2\20";
    static final String dfa_15s = "\3\70\1\uffff\2\42\1\uffff\5\44\1\10\1\uffff\2\44\1\uffff\2\57\1\10\2\57";
    static final String dfa_16s = "\3\uffff\1\1\2\uffff\1\3\6\uffff\1\2\2\uffff\1\4\5\uffff";
    static final String dfa_17s = "\26\uffff}>";
    static final String[] dfa_18s = {
            "\1\4\1\5\15\uffff\1\1\3\uffff\1\2\1\6\32\uffff\3\3",
            "\1\12\1\13\11\uffff\1\14\20\uffff\2\15\21\uffff\1\7\1\10\1\11",
            "\1\16\1\17\11\uffff\1\15\20\uffff\2\15\21\uffff\1\7\1\10\1\11",
            "",
            "\1\3\1\uffff\1\20\1\3\10\uffff\1\3\2\uffff\1\3\2\uffff\1\3",
            "\1\3\1\uffff\1\20\1\3\10\uffff\1\3\2\uffff\1\3\2\uffff\1\3",
            "",
            "\1\16\1\17\11\uffff\1\15\20\uffff\2\15",
            "\1\16\1\17\11\uffff\1\15\20\uffff\2\15",
            "\1\16\1\17\11\uffff\1\15\20\uffff\2\15",
            "\1\3\1\uffff\1\14\1\3\10\uffff\1\3\2\uffff\1\3\2\uffff\1\3\2\15",
            "\1\3\1\uffff\1\14\1\3\10\uffff\1\3\2\uffff\1\3\2\uffff\1\3\2\15",
            "\1\21\1\22",
            "",
            "\1\3\1\uffff\1\15\1\3\10\uffff\1\3\2\uffff\1\3\2\uffff\1\3\2\15",
            "\1\3\1\uffff\1\15\1\3\10\uffff\1\3\2\uffff\1\3\2\uffff\1\3\2\15",
            "",
            "\1\15\2\uffff\1\20\13\uffff\1\15\2\uffff\1\15\14\uffff\1\23",
            "\1\15\2\uffff\1\20\13\uffff\1\15\2\uffff\1\15\14\uffff\1\23",
            "\1\24\1\25",
            "\1\15\2\uffff\1\20\13\uffff\1\15\2\uffff\1\15\14\uffff\1\23",
            "\1\15\2\uffff\1\20\13\uffff\1\15\2\uffff\1\15\14\uffff\1\23"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "949:3: ( ( (otherlv_1= 'feature' | ( (lv_isPort_2_0= 'port' ) ) )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleTypedFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPort_6_0= 'port' ) ) ) ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_8_0= ruleUntypedFeatureDefinition ) ) ) | (otherlv_9= 'connector' ( (lv_ownedMemberElement_10_0= ruleConnectorDefinition ) ) ) | ( ( (otherlv_11= 'feature' ( (lv_memberName_12_0= ruleName ) )? ) | ( (lv_memberName_13_0= ruleName ) ) ) otherlv_14= 'is' ( ( ruleQualifiedName ) ) otherlv_16= ';' ) )";
        }
    }
    static final String dfa_19s = "\13\uffff";
    static final String dfa_20s = "\2\uffff\2\10\5\uffff\2\10";
    static final String dfa_21s = "\1\4\1\uffff\2\21\2\uffff\1\7\2\uffff\2\21";
    static final String dfa_22s = "\1\57\1\uffff\2\57\2\uffff\1\10\2\uffff\2\57";
    static final String dfa_23s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\3\1\2\2\uffff";
    static final String dfa_24s = "\13\uffff}>";
    static final String[] dfa_25s = {
            "\3\1\1\2\1\3\7\uffff\1\4\30\uffff\1\1\2\uffff\1\5\1\uffff\2\1",
            "",
            "\1\10\1\uffff\1\10\5\uffff\1\10\7\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\1\10\1\uffff\1\10\5\uffff\1\10\7\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\1\10\1\uffff\1\10\5\uffff\1\10\7\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\1\10\1\uffff\1\10\5\uffff\1\10\7\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2404:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x003C000000F28180L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x003C000000B08000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040180L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001800040180L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x01FC00000CF28180L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x01C000000C400180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x01C0000000400180L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x01C0001800040180L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010040180L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x003C000000F08180L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000490090000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000180L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000180L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001C800D0180L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000480090000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400090000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000D380000101F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000480010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000D200000101F0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000F380000101F0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000D380000301F0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003000000000042L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000018000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800000000002L});

}