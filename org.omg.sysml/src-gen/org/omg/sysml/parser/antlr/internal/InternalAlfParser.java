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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'is'", "';'", "'class'", "'assoc'", "'feature'", "'abstract'", "'specializes'", "','", "'part'", "'port'", "'connector'", "'end'", "':'", "'composes'", "'any'", "'['", "'..'", "']'", "'='", "'redefines'", "'subsets'", "'=>'", "'@'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'null'", "'.'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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
    public static final int T__57=57;
    public static final int T__58=58;
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

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_UNRESTRICTED_NAME)||LA2_0==15||(LA2_0>=20 && LA2_0<=23)||(LA2_0>=52 && LA2_0<=55)) ) {
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
            case 52:
                {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=RULE_ID && LA3_1<=RULE_UNRESTRICTED_NAME)||LA3_1==22) ) {
                    alt3=2;
                }
                else if ( (LA3_1==15||(LA3_1>=20 && LA3_1<=21)||LA3_1==23) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==15||(LA3_2>=20 && LA3_2<=21)||LA3_2==23) ) {
                    alt3=1;
                }
                else if ( ((LA3_2>=RULE_ID && LA3_2<=RULE_UNRESTRICTED_NAME)||LA3_2==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=RULE_ID && LA3_3<=RULE_UNRESTRICTED_NAME)||LA3_3==22) ) {
                    alt3=2;
                }
                else if ( (LA3_3==15||(LA3_3>=20 && LA3_3<=21)||LA3_3==23) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 55:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=RULE_ID && LA3_4<=RULE_UNRESTRICTED_NAME)||LA3_4==22) ) {
                    alt3=2;
                }
                else if ( (LA3_4==15||(LA3_4>=20 && LA3_4<=21)||LA3_4==23) ) {
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

            if ( ((LA4_0>=52 && LA4_0<=55)) ) {
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
    // InternalAlf.g:386:1: rulePackagedFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) ;
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
            // InternalAlf.g:392:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) )
            // InternalAlf.g:393:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            {
            // InternalAlf.g:393:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            // InternalAlf.g:394:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            {
            // InternalAlf.g:394:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=52 && LA8_0<=55)) ) {
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

            // InternalAlf.g:413:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:414:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:414:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:415:5: (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) )
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

                    // InternalAlf.g:421:5: ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:422:6: (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:422:6: (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:423:7: lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_2_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:442:4: (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:442:4: (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:443:5: otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0());
                    				
                    // InternalAlf.g:447:5: ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:448:6: (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:448:6: (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:449:7: lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_4_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
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

                if ( (LA14_1==20) ) {
                    alt14=1;
                }
                else if ( (LA14_1==21) ) {
                    alt14=2;
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

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_UNRESTRICTED_NAME)||LA19_0==15||(LA19_0>=20 && LA19_0<=23)||(LA19_0>=26 && LA19_0<=28)||(LA19_0>=52 && LA19_0<=58)) ) {
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
            case 52:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==15||(LA20_1>=20 && LA20_1<=21)||LA20_1==23) ) {
                    alt20=1;
                }
                else if ( ((LA20_1>=RULE_ID && LA20_1<=RULE_UNRESTRICTED_NAME)||LA20_1==22||(LA20_1>=26 && LA20_1<=28)||(LA20_1>=56 && LA20_1<=58)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==15||(LA20_2>=20 && LA20_2<=21)||LA20_2==23) ) {
                    alt20=1;
                }
                else if ( ((LA20_2>=RULE_ID && LA20_2<=RULE_UNRESTRICTED_NAME)||LA20_2==22||(LA20_2>=26 && LA20_2<=28)||(LA20_2>=56 && LA20_2<=58)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA20_3 = input.LA(2);

                if ( ((LA20_3>=RULE_ID && LA20_3<=RULE_UNRESTRICTED_NAME)||LA20_3==22||(LA20_3>=26 && LA20_3<=28)||(LA20_3>=56 && LA20_3<=58)) ) {
                    alt20=2;
                }
                else if ( (LA20_3==15||(LA20_3>=20 && LA20_3<=21)||LA20_3==23) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case 55:
                {
                int LA20_4 = input.LA(2);

                if ( ((LA20_4>=RULE_ID && LA20_4<=RULE_UNRESTRICTED_NAME)||LA20_4==22||(LA20_4>=26 && LA20_4<=28)||(LA20_4>=56 && LA20_4<=58)) ) {
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
            case 28:
            case 56:
            case 57:
            case 58:
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
    // InternalAlf.g:922:1: ruleClassFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) ) ;
    public final EObject ruleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isComposite_2_0=null;
        Token lv_isPort_3_0=null;
        Token otherlv_6=null;
        Token lv_isComposite_7_0=null;
        Token lv_isPort_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_isComposite_14_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedMemberElement_5_0 = null;

        Enumerator lv_direction_9_0 = null;

        EObject lv_ownedMemberElement_10_0 = null;

        EObject lv_ownedMemberElement_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_15_0 = null;

        AntlrDatatypeRuleToken lv_memberName_16_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:928:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) ) )
            // InternalAlf.g:929:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) )
            {
            // InternalAlf.g:929:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) )
            // InternalAlf.g:930:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )
            {
            // InternalAlf.g:930:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=52 && LA21_0<=55)) ) {
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

            // InternalAlf.g:949:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )
            int alt29=4;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:950:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:950:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:951:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:951:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
                    int alt22=4;
                    switch ( input.LA(1) ) {
                        case 22:
                            {
                            alt22=1;
                            }
                            break;
                        case 26:
                            {
                            alt22=2;
                            }
                            break;
                        case 27:
                            {
                            alt22=3;
                            }
                            break;
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
                            // InternalAlf.g:957:6: ( (lv_isComposite_2_0= 'part' ) )
                            {
                            // InternalAlf.g:957:6: ( (lv_isComposite_2_0= 'part' ) )
                            // InternalAlf.g:958:7: (lv_isComposite_2_0= 'part' )
                            {
                            // InternalAlf.g:958:7: (lv_isComposite_2_0= 'part' )
                            // InternalAlf.g:959:8: lv_isComposite_2_0= 'part'
                            {
                            lv_isComposite_2_0=(Token)match(input,26,FOLLOW_17); 

                            								newLeafNode(lv_isComposite_2_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:972:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:972:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:973:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:973:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:974:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,27,FOLLOW_17); 

                            								newLeafNode(lv_isPort_3_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:987:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=56 && LA23_0<=58)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:988:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:988:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:989:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_direction_4_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_4_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1006:5: ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1007:6: (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1007:6: (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1008:7: lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_5_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_5_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1027:4: ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1027:4: ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1028:5: (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1028:5: (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) )
                    int alt24=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt24=1;
                        }
                        break;
                    case 26:
                        {
                        alt24=2;
                        }
                        break;
                    case 27:
                        {
                        alt24=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:1029:6: otherlv_6= 'feature'
                            {
                            otherlv_6=(Token)match(input,22,FOLLOW_18); 

                            						newLeafNode(otherlv_6, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1034:6: ( (lv_isComposite_7_0= 'part' ) )
                            {
                            // InternalAlf.g:1034:6: ( (lv_isComposite_7_0= 'part' ) )
                            // InternalAlf.g:1035:7: (lv_isComposite_7_0= 'part' )
                            {
                            // InternalAlf.g:1035:7: (lv_isComposite_7_0= 'part' )
                            // InternalAlf.g:1036:8: lv_isComposite_7_0= 'part'
                            {
                            lv_isComposite_7_0=(Token)match(input,26,FOLLOW_18); 

                            								newLeafNode(lv_isComposite_7_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1049:6: ( (lv_isPort_8_0= 'port' ) )
                            {
                            // InternalAlf.g:1049:6: ( (lv_isPort_8_0= 'port' ) )
                            // InternalAlf.g:1050:7: (lv_isPort_8_0= 'port' )
                            {
                            // InternalAlf.g:1050:7: (lv_isPort_8_0= 'port' )
                            // InternalAlf.g:1051:8: lv_isPort_8_0= 'port'
                            {
                            lv_isPort_8_0=(Token)match(input,27,FOLLOW_18); 

                            								newLeafNode(lv_isPort_8_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1064:5: ( (lv_direction_9_0= ruleFeatureDirection ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=56 && LA25_0<=58)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAlf.g:1065:6: (lv_direction_9_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1065:6: (lv_direction_9_0= ruleFeatureDirection )
                            // InternalAlf.g:1066:7: lv_direction_9_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_direction_9_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_9_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1083:5: ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1084:6: (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1084:6: (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1085:7: lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_10_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_10_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1104:4: (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1104:4: (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1105:5: otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) )
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_19); 

                    					newLeafNode(otherlv_11, grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_2_0());
                    				
                    // InternalAlf.g:1109:5: ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1110:6: (lv_ownedMemberElement_12_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1110:6: (lv_ownedMemberElement_12_0= ruleConnectorDefinition )
                    // InternalAlf.g:1111:7: lv_ownedMemberElement_12_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_12_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_12_0,
                    								"org.omg.sysml.Alf.ConnectorDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1130:4: ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' )
                    {
                    // InternalAlf.g:1130:4: ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' )
                    // InternalAlf.g:1131:5: ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';'
                    {
                    // InternalAlf.g:1131:5: ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==22||LA28_0==26) ) {
                        alt28=1;
                    }
                    else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAlf.g:1132:6: ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1132:6: ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? )
                            // InternalAlf.g:1133:7: (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )?
                            {
                            // InternalAlf.g:1133:7: (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==22) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==26) ) {
                                alt26=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalAlf.g:1134:8: otherlv_13= 'feature'
                                    {
                                    otherlv_13=(Token)match(input,22,FOLLOW_7); 

                                    								newLeafNode(otherlv_13, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_3_0_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1139:8: ( (lv_isComposite_14_0= 'part' ) )
                                    {
                                    // InternalAlf.g:1139:8: ( (lv_isComposite_14_0= 'part' ) )
                                    // InternalAlf.g:1140:9: (lv_isComposite_14_0= 'part' )
                                    {
                                    // InternalAlf.g:1140:9: (lv_isComposite_14_0= 'part' )
                                    // InternalAlf.g:1141:10: lv_isComposite_14_0= 'part'
                                    {
                                    lv_isComposite_14_0=(Token)match(input,26,FOLLOW_7); 

                                    										newLeafNode(lv_isComposite_14_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_3_0_0_0_1_0());
                                    									

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                                    										}
                                    										setWithLastConsumed(current, "isComposite", true, "part");
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:1154:7: ( (lv_memberName_15_0= ruleName ) )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalAlf.g:1155:8: (lv_memberName_15_0= ruleName )
                                    {
                                    // InternalAlf.g:1155:8: (lv_memberName_15_0= ruleName )
                                    // InternalAlf.g:1156:9: lv_memberName_15_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_8);
                                    lv_memberName_15_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_15_0,
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
                            // InternalAlf.g:1175:6: ( (lv_memberName_16_0= ruleName ) )
                            {
                            // InternalAlf.g:1175:6: ( (lv_memberName_16_0= ruleName ) )
                            // InternalAlf.g:1176:7: (lv_memberName_16_0= ruleName )
                            {
                            // InternalAlf.g:1176:7: (lv_memberName_16_0= ruleName )
                            // InternalAlf.g:1177:8: lv_memberName_16_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_1_0());
                            							
                            pushFollow(FOLLOW_8);
                            lv_memberName_16_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_16_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_17, grammarAccess.getClassFeatureMemberAccess().getIsKeyword_1_3_1());
                    				
                    // InternalAlf.g:1199:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1200:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1200:6: ( ruleQualifiedName )
                    // InternalAlf.g:1201:7: ruleQualifiedName
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

                    otherlv_19=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_19, grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_1_3_3());
                    				

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
    // InternalAlf.g:1225:1: entryRuleAssociationDeclaration returns [EObject current=null] : iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF ;
    public final EObject entryRuleAssociationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDeclaration = null;


        try {
            // InternalAlf.g:1225:63: (iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF )
            // InternalAlf.g:1226:2: iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF
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
    // InternalAlf.g:1232:1: ruleAssociationDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
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
            // InternalAlf.g:1238:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:1239:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1239:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:1240:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:1240:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1241:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1241:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1242:5: lv_isAbstract_0_0= 'abstract'
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
            		
            // InternalAlf.g:1258:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1259:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1259:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1260:5: lv_name_2_0= ruleName
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

            // InternalAlf.g:1277:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18||LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1278:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:1278:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==18) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==24) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAlf.g:1279:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1284:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1289:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:1290:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:1290:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:1291:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
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

                    // InternalAlf.g:1308:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==25) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalAlf.g:1309:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1313:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:1314:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:1314:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:1315:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
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
                    	    break loop32;
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
    // InternalAlf.g:1338:1: entryRuleAssociationDefinition returns [EObject current=null] : iv_ruleAssociationDefinition= ruleAssociationDefinition EOF ;
    public final EObject entryRuleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinition = null;


        try {
            // InternalAlf.g:1338:62: (iv_ruleAssociationDefinition= ruleAssociationDefinition EOF )
            // InternalAlf.g:1339:2: iv_ruleAssociationDefinition= ruleAssociationDefinition EOF
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
    // InternalAlf.g:1345:1: ruleAssociationDefinition returns [EObject current=null] : (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AssociationDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1351:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1352:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1352:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' )
            // InternalAlf.g:1353:3: this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_AssociationDeclaration_0=ruleAssociationDeclaration();

            state._fsp--;


            			current = this_AssociationDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1365:3: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_UNRESTRICTED_NAME)||LA34_0==15||(LA34_0>=20 && LA34_0<=23)||(LA34_0>=26 && LA34_0<=29)||(LA34_0>=52 && LA34_0<=58)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAlf.g:1366:4: (lv_ownedMembership_2_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:1366:4: (lv_ownedMembership_2_0= ruleAssociationMember )
            	    // InternalAlf.g:1367:5: lv_ownedMembership_2_0= ruleAssociationMember
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssociationMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_ownedMembership_2_0=ruleAssociationMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMembership",
            	    						lv_ownedMembership_2_0,
            	    						"org.omg.sysml.Alf.AssociationMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleAssociationMember"
    // InternalAlf.g:1392:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:1392:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:1393:2: iv_ruleAssociationMember= ruleAssociationMember EOF
            {
             newCompositeNode(grammarAccess.getAssociationMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationMember=ruleAssociationMember();

            state._fsp--;

             current =iv_ruleAssociationMember; 
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
    // $ANTLR end "entryRuleAssociationMember"


    // $ANTLR start "ruleAssociationMember"
    // InternalAlf.g:1399:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_EndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:1405:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember ) )
            // InternalAlf.g:1406:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember )
            {
            // InternalAlf.g:1406:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                switch ( input.LA(2) ) {
                case 22:
                case 26:
                case 27:
                case 28:
                    {
                    alt35=2;
                    }
                    break;
                case 15:
                case 20:
                case 21:
                case 23:
                    {
                    alt35=1;
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 29:
                case 56:
                case 57:
                case 58:
                    {
                    alt35=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }

                }
                break;
            case 53:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 29:
                case 56:
                case 57:
                case 58:
                    {
                    alt35=3;
                    }
                    break;
                case 22:
                case 26:
                case 27:
                case 28:
                    {
                    alt35=2;
                    }
                    break;
                case 15:
                case 20:
                case 21:
                case 23:
                    {
                    alt35=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }

                }
                break;
            case 54:
                {
                switch ( input.LA(2) ) {
                case 15:
                case 20:
                case 21:
                case 23:
                    {
                    alt35=1;
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 29:
                case 56:
                case 57:
                case 58:
                    {
                    alt35=3;
                    }
                    break;
                case 22:
                case 26:
                case 27:
                case 28:
                    {
                    alt35=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }

                }
                break;
            case 55:
                {
                switch ( input.LA(2) ) {
                case 22:
                case 26:
                case 27:
                case 28:
                    {
                    alt35=2;
                    }
                    break;
                case 15:
                case 20:
                case 21:
                case 23:
                    {
                    alt35=1;
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 29:
                case 56:
                case 57:
                case 58:
                    {
                    alt35=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 4, input);

                    throw nvae;
                }

                }
                break;
            case 15:
            case 20:
            case 21:
            case 23:
                {
                alt35=1;
                }
                break;
            case 22:
            case 26:
            case 27:
            case 28:
                {
                alt35=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 29:
            case 56:
            case 57:
            case 58:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalAlf.g:1407:3: this_NonFeatureMember_0= ruleNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getNonFeatureMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMember_0=ruleNonFeatureMember();

                    state._fsp--;


                    			current = this_NonFeatureMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1416:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getAssociationFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationFeatureMember_1=ruleAssociationFeatureMember();

                    state._fsp--;


                    			current = this_AssociationFeatureMember_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:1425:3: this_EndFeatureMember_2= ruleEndFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getEndFeatureMemberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndFeatureMember_2=ruleEndFeatureMember();

                    state._fsp--;


                    			current = this_EndFeatureMember_2;
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
    // $ANTLR end "ruleAssociationMember"


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:1437:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:1437:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:1438:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:1444:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1450:2: (this_AssociationDefinition_0= ruleAssociationDefinition )
            // InternalAlf.g:1451:2: this_AssociationDefinition_0= ruleAssociationDefinition
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


    // $ANTLR start "entryRuleAssociationFeatureMember"
    // InternalAlf.g:1462:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:1462:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:1463:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getAssociationFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationFeatureMember=ruleAssociationFeatureMember();

            state._fsp--;

             current =iv_ruleAssociationFeatureMember; 
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
    // $ANTLR end "entryRuleAssociationFeatureMember"


    // $ANTLR start "ruleAssociationFeatureMember"
    // InternalAlf.g:1469:1: ruleAssociationFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isComposite_2_0=null;
        Token lv_isPort_3_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_isComposite_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedMemberElement_5_0 = null;

        EObject lv_ownedMemberElement_7_0 = null;

        AntlrDatatypeRuleToken lv_memberName_10_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1475:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) )
            // InternalAlf.g:1476:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            {
            // InternalAlf.g:1476:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            // InternalAlf.g:1477:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            {
            // InternalAlf.g:1477:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=52 && LA36_0<=55)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:1478:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1478:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1479:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
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

            // InternalAlf.g:1496:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            int alt41=3;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:1497:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1497:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:1498:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:1498:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt37=1;
                        }
                        break;
                    case 26:
                        {
                        alt37=2;
                        }
                        break;
                    case 27:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // InternalAlf.g:1499:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_23); 

                            						newLeafNode(otherlv_1, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1504:6: ( (lv_isComposite_2_0= 'part' ) )
                            {
                            // InternalAlf.g:1504:6: ( (lv_isComposite_2_0= 'part' ) )
                            // InternalAlf.g:1505:7: (lv_isComposite_2_0= 'part' )
                            {
                            // InternalAlf.g:1505:7: (lv_isComposite_2_0= 'part' )
                            // InternalAlf.g:1506:8: lv_isComposite_2_0= 'part'
                            {
                            lv_isComposite_2_0=(Token)match(input,26,FOLLOW_23); 

                            								newLeafNode(lv_isComposite_2_0, grammarAccess.getAssociationFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1519:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:1519:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:1520:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:1520:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:1521:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,27,FOLLOW_23); 

                            								newLeafNode(lv_isPort_3_0, grammarAccess.getAssociationFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1534:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=56 && LA38_0<=58)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAlf.g:1535:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1535:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:1536:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_direction_4_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_4_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1553:5: ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:1554:6: (lv_ownedMemberElement_5_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:1554:6: (lv_ownedMemberElement_5_0= ruleFeatureDefinition )
                    // InternalAlf.g:1555:7: lv_ownedMemberElement_5_0= ruleFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_5_0=ruleFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_5_0,
                    								"org.omg.sysml.Alf.FeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1574:4: (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1574:4: (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1575:5: otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_19); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationFeatureMemberAccess().getConnectorKeyword_1_1_0());
                    				
                    // InternalAlf.g:1579:5: ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1580:6: (lv_ownedMemberElement_7_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1580:6: (lv_ownedMemberElement_7_0= ruleConnectorDefinition )
                    // InternalAlf.g:1581:7: lv_ownedMemberElement_7_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_7_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_7_0,
                    								"org.omg.sysml.Alf.ConnectorDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1600:4: ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    {
                    // InternalAlf.g:1600:4: ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    // InternalAlf.g:1601:5: (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';'
                    {
                    // InternalAlf.g:1601:5: (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==22) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==26) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAlf.g:1602:6: otherlv_8= 'feature'
                            {
                            otherlv_8=(Token)match(input,22,FOLLOW_7); 

                            						newLeafNode(otherlv_8, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_1_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1607:6: ( (lv_isComposite_9_0= 'part' ) )
                            {
                            // InternalAlf.g:1607:6: ( (lv_isComposite_9_0= 'part' ) )
                            // InternalAlf.g:1608:7: (lv_isComposite_9_0= 'part' )
                            {
                            // InternalAlf.g:1608:7: (lv_isComposite_9_0= 'part' )
                            // InternalAlf.g:1609:8: lv_isComposite_9_0= 'part'
                            {
                            lv_isComposite_9_0=(Token)match(input,26,FOLLOW_7); 

                            								newLeafNode(lv_isComposite_9_0, grammarAccess.getAssociationFeatureMemberAccess().getIsCompositePartKeyword_1_2_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1622:5: ( (lv_memberName_10_0= ruleName ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalAlf.g:1623:6: (lv_memberName_10_0= ruleName )
                            {
                            // InternalAlf.g:1623:6: (lv_memberName_10_0= ruleName )
                            // InternalAlf.g:1624:7: lv_memberName_10_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_memberName_10_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_10_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getAssociationFeatureMemberAccess().getIsKeyword_1_2_2());
                    				
                    // InternalAlf.g:1645:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1646:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1646:6: ( ruleQualifiedName )
                    // InternalAlf.g:1647:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberElementElementCrossReference_1_2_3_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getAssociationFeatureMemberAccess().getSemicolonKeyword_1_2_4());
                    				

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
    // $ANTLR end "ruleAssociationFeatureMember"


    // $ANTLR start "entryRuleEndFeatureMember"
    // InternalAlf.g:1671:1: entryRuleEndFeatureMember returns [EObject current=null] : iv_ruleEndFeatureMember= ruleEndFeatureMember EOF ;
    public final EObject entryRuleEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndFeatureMember = null;


        try {
            // InternalAlf.g:1671:57: (iv_ruleEndFeatureMember= ruleEndFeatureMember EOF )
            // InternalAlf.g:1672:2: iv_ruleEndFeatureMember= ruleEndFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getEndFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndFeatureMember=ruleEndFeatureMember();

            state._fsp--;

             current =iv_ruleEndFeatureMember; 
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
    // $ANTLR end "entryRuleEndFeatureMember"


    // $ANTLR start "ruleEndFeatureMember"
    // InternalAlf.g:1678:1: ruleEndFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) ) ;
    public final EObject ruleEndFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_2_0 = null;

        EObject lv_ownedMemberElement_3_0 = null;

        Enumerator lv_direction_5_0 = null;

        EObject lv_ownedMemberElement_6_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;

        AntlrDatatypeRuleToken lv_memberName_9_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1684:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) ) )
            // InternalAlf.g:1685:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) )
            {
            // InternalAlf.g:1685:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) )
            // InternalAlf.g:1686:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )
            {
            // InternalAlf.g:1686:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=52 && LA42_0<=55)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:1687:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1687:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1688:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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

            // InternalAlf.g:1705:3: ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )
            int alt48=3;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:1706:4: ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1706:4: ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1707:5: (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1707:5: (otherlv_1= 'end' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==29) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAlf.g:1708:6: otherlv_1= 'end'
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_17); 

                            						newLeafNode(otherlv_1, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_1_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1713:5: ( (lv_direction_2_0= ruleFeatureDirection ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=56 && LA44_0<=58)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAlf.g:1714:6: (lv_direction_2_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1714:6: (lv_direction_2_0= ruleFeatureDirection )
                            // InternalAlf.g:1715:7: lv_direction_2_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_direction_2_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_2_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1732:5: ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1733:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1733:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1734:7: lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_3_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_3_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1753:4: (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1753:4: (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1754:5: otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_18); 

                    					newLeafNode(otherlv_4, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_1_1_0());
                    				
                    // InternalAlf.g:1758:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=56 && LA45_0<=58)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalAlf.g:1759:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1759:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:1760:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_direction_5_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_5_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1777:5: ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1778:6: (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1778:6: (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1779:7: lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_6_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_6_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1798:4: ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    {
                    // InternalAlf.g:1798:4: ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    // InternalAlf.g:1799:5: ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';'
                    {
                    // InternalAlf.g:1799:5: ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==29) ) {
                        alt47=1;
                    }
                    else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAlf.g:1800:6: (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1800:6: (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? )
                            // InternalAlf.g:1801:7: otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )?
                            {
                            otherlv_7=(Token)match(input,29,FOLLOW_7); 

                            							newLeafNode(otherlv_7, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_1_2_0_0_0());
                            						
                            // InternalAlf.g:1805:7: ( (lv_memberName_8_0= ruleName ) )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // InternalAlf.g:1806:8: (lv_memberName_8_0= ruleName )
                                    {
                                    // InternalAlf.g:1806:8: (lv_memberName_8_0= ruleName )
                                    // InternalAlf.g:1807:9: lv_memberName_8_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_8);
                                    lv_memberName_8_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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
                            // InternalAlf.g:1826:6: ( (lv_memberName_9_0= ruleName ) )
                            {
                            // InternalAlf.g:1826:6: ( (lv_memberName_9_0= ruleName ) )
                            // InternalAlf.g:1827:7: (lv_memberName_9_0= ruleName )
                            {
                            // InternalAlf.g:1827:7: (lv_memberName_9_0= ruleName )
                            // InternalAlf.g:1828:8: lv_memberName_9_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_1_0());
                            							
                            pushFollow(FOLLOW_8);
                            lv_memberName_9_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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

                    					newLeafNode(otherlv_10, grammarAccess.getEndFeatureMemberAccess().getIsKeyword_1_2_1());
                    				
                    // InternalAlf.g:1850:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1851:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1851:6: ( ruleQualifiedName )
                    // InternalAlf.g:1852:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberElementElementCrossReference_1_2_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getEndFeatureMemberAccess().getSemicolonKeyword_1_2_3());
                    				

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
    // $ANTLR end "ruleEndFeatureMember"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:1876:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:1876:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:1877:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:1883:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1889:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:1890:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:1890:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt49=1;
            }
            else if ( (LA49_0==18||(LA49_0>=37 && LA49_0<=38)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:1891:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNamedFeatureDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedFeatureDefinition_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    			current = this_NamedFeatureDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1900:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getUnnamedFeatureDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnnamedFeatureDefinition_1=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    			current = this_UnnamedFeatureDefinition_1;
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
    // $ANTLR end "ruleFeatureDefinition"


    // $ANTLR start "entryRuleNamedFeatureDefinition"
    // InternalAlf.g:1912:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:1912:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:1913:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedFeatureDefinition=ruleNamedFeatureDefinition();

            state._fsp--;

             current =iv_ruleNamedFeatureDefinition; 
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
    // $ANTLR end "entryRuleNamedFeatureDefinition"


    // $ANTLR start "ruleNamedFeatureDefinition"
    // InternalAlf.g:1919:1: ruleNamedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_upper_9_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_ownedMembership_15_0 = null;

        EObject lv_ownedMembership_17_0 = null;

        EObject lv_lower_19_0 = null;

        EObject lv_upper_21_0 = null;

        EObject lv_value_24_0 = null;

        EObject lv_ownedMembership_27_0 = null;

        EObject lv_ownedMembership_30_0 = null;

        EObject lv_lower_33_0 = null;

        EObject lv_upper_35_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1925:2: ( ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) ) )
            // InternalAlf.g:1926:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) )
            {
            // InternalAlf.g:1926:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) )
            // InternalAlf.g:1927:3: ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) )
            {
            // InternalAlf.g:1927:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:1928:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:1928:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:1929:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1946:3: ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==16||LA67_0==19||LA67_0==30||LA67_0==33||LA67_0==36) ) {
                alt67=1;
            }
            else if ( (LA67_0==18||(LA67_0>=37 && LA67_0<=38)) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlf.g:1947:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
                    {
                    // InternalAlf.g:1947:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
                    // InternalAlf.g:1948:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
                    {
                    // InternalAlf.g:1948:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==30) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalAlf.g:1949:6: otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                            {
                            otherlv_1=(Token)match(input,30,FOLLOW_26); 

                            						newLeafNode(otherlv_1, grammarAccess.getNamedFeatureDefinitionAccess().getColonKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:1953:6: ( (lv_isComposite_2_0= 'composes' ) )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==31) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // InternalAlf.g:1954:7: (lv_isComposite_2_0= 'composes' )
                                    {
                                    // InternalAlf.g:1954:7: (lv_isComposite_2_0= 'composes' )
                                    // InternalAlf.g:1955:8: lv_isComposite_2_0= 'composes'
                                    {
                                    lv_isComposite_2_0=(Token)match(input,31,FOLLOW_27); 

                                    								newLeafNode(lv_isComposite_2_0, grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_0_0_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
                                    								}
                                    								setWithLastConsumed(current, "isComposite", true, "composes");
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:1967:6: ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' )
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt51=1;
                            }
                            else if ( (LA51_0==32) ) {
                                alt51=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 0, input);

                                throw nvae;
                            }
                            switch (alt51) {
                                case 1 :
                                    // InternalAlf.g:1968:7: ( ( ruleQualifiedName ) )
                                    {
                                    // InternalAlf.g:1968:7: ( ( ruleQualifiedName ) )
                                    // InternalAlf.g:1969:8: ( ruleQualifiedName )
                                    {
                                    // InternalAlf.g:1969:8: ( ruleQualifiedName )
                                    // InternalAlf.g:1970:9: ruleQualifiedName
                                    {

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
                                    									}
                                    								

                                    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_0_2_0_0());
                                    								
                                    pushFollow(FOLLOW_28);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1985:7: otherlv_4= 'any'
                                    {
                                    otherlv_4=(Token)match(input,32,FOLLOW_28); 

                                    							newLeafNode(otherlv_4, grammarAccess.getNamedFeatureDefinitionAccess().getAnyKeyword_1_0_0_2_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:1990:6: ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==18||(LA52_0>=37 && LA52_0<=38)) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // InternalAlf.g:1991:7: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                                    {
                                    // InternalAlf.g:1991:7: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                                    // InternalAlf.g:1992:8: lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset
                                    {

                                    								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0_0_3_0());
                                    							
                                    pushFollow(FOLLOW_29);
                                    lv_ownedMembership_5_0=ruleOwnedRedefinitionOrSubset();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
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

                    // InternalAlf.g:2010:5: (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==33) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalAlf.g:2011:6: otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,33,FOLLOW_30); 

                            						newLeafNode(otherlv_6, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_1_0());
                            					
                            // InternalAlf.g:2015:6: ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )?
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==RULE_NATURAL_VALUE) ) {
                                int LA54_1 = input.LA(2);

                                if ( (LA54_1==34) ) {
                                    alt54=1;
                                }
                            }
                            switch (alt54) {
                                case 1 :
                                    // InternalAlf.g:2016:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..'
                                    {
                                    // InternalAlf.g:2016:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2017:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2017:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2018:9: lv_lower_7_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_1_1_0_0());
                                    								
                                    pushFollow(FOLLOW_31);
                                    lv_lower_7_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_7_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_8=(Token)match(input,34,FOLLOW_30); 

                                    							newLeafNode(otherlv_8, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_1_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:2040:6: ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2041:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2041:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2042:8: lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_1_2_0());
                            							
                            pushFollow(FOLLOW_32);
                            lv_upper_9_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_9_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_10=(Token)match(input,35,FOLLOW_33); 

                            						newLeafNode(otherlv_10, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_1_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2064:5: (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==36) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalAlf.g:2065:6: otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) )
                            {
                            otherlv_11=(Token)match(input,36,FOLLOW_34); 

                            						newLeafNode(otherlv_11, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_2_0());
                            					
                            // InternalAlf.g:2069:6: ( (lv_value_12_0= ruleExpression ) )
                            // InternalAlf.g:2070:7: (lv_value_12_0= ruleExpression )
                            {
                            // InternalAlf.g:2070:7: (lv_value_12_0= ruleExpression )
                            // InternalAlf.g:2071:8: lv_value_12_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_2_1_0());
                            							
                            pushFollow(FOLLOW_35);
                            lv_value_12_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
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

                    // InternalAlf.g:2089:5: (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==19) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==16) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalAlf.g:2090:6: otherlv_13= ';'
                            {
                            otherlv_13=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(otherlv_13, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2095:6: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                            {
                            // InternalAlf.g:2095:6: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                            // InternalAlf.g:2096:7: otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}'
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_15); 

                            							newLeafNode(otherlv_14, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_3_1_0());
                            						
                            // InternalAlf.g:2100:7: ( (lv_ownedMembership_15_0= ruleClassMember ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_UNRESTRICTED_NAME)||LA57_0==15||(LA57_0>=20 && LA57_0<=23)||(LA57_0>=26 && LA57_0<=28)||(LA57_0>=52 && LA57_0<=58)) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // InternalAlf.g:2101:8: (lv_ownedMembership_15_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:2101:8: (lv_ownedMembership_15_0= ruleClassMember )
                            	    // InternalAlf.g:2102:9: lv_ownedMembership_15_0= ruleClassMember
                            	    {

                            	    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_15);
                            	    lv_ownedMembership_15_0=ruleClassMember();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
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
                            	    break loop57;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(otherlv_16, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_3_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2127:4: ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) )
                    {
                    // InternalAlf.g:2127:4: ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) )
                    // InternalAlf.g:2128:5: ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) )
                    {
                    // InternalAlf.g:2128:5: ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) )
                    // InternalAlf.g:2129:6: (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset )
                    {
                    // InternalAlf.g:2129:6: (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset )
                    // InternalAlf.g:2130:7: lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset
                    {

                    							newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_36);
                    lv_ownedMembership_17_0=ruleOwnedRedefinitionOrSubset();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"ownedMembership",
                    								lv_ownedMembership_17_0,
                    								"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:2147:5: ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==33) ) {
                        int LA66_1 = input.LA(2);

                        if ( (LA66_1==RULE_NATURAL_VALUE) ) {
                            int LA66_3 = input.LA(3);

                            if ( (LA66_3==34) ) {
                                int LA66_5 = input.LA(4);

                                if ( (LA66_5==RULE_NATURAL_VALUE) ) {
                                    int LA66_7 = input.LA(5);

                                    if ( (LA66_7==35) ) {
                                        int LA66_6 = input.LA(6);

                                        if ( (LA66_6==19) ) {
                                            alt66=2;
                                        }
                                        else if ( (LA66_6==16||LA66_6==36) ) {
                                            alt66=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 66, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 66, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA66_5==43) ) {
                                    int LA66_4 = input.LA(5);

                                    if ( (LA66_4==35) ) {
                                        int LA66_6 = input.LA(6);

                                        if ( (LA66_6==19) ) {
                                            alt66=2;
                                        }
                                        else if ( (LA66_6==16||LA66_6==36) ) {
                                            alt66=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 66, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 66, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 66, 5, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA66_3==35) ) {
                                int LA66_6 = input.LA(4);

                                if ( (LA66_6==19) ) {
                                    alt66=2;
                                }
                                else if ( (LA66_6==16||LA66_6==36) ) {
                                    alt66=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 66, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 66, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA66_1==43) ) {
                            int LA66_4 = input.LA(3);

                            if ( (LA66_4==35) ) {
                                int LA66_6 = input.LA(4);

                                if ( (LA66_6==19) ) {
                                    alt66=2;
                                }
                                else if ( (LA66_6==16||LA66_6==36) ) {
                                    alt66=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 66, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 66, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 66, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA66_0==16||LA66_0==36) ) {
                        alt66=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalAlf.g:2148:6: ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) )
                            {
                            // InternalAlf.g:2148:6: ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) )
                            // InternalAlf.g:2149:7: (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) )
                            {
                            // InternalAlf.g:2149:7: (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==33) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // InternalAlf.g:2150:8: otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']'
                                    {
                                    otherlv_18=(Token)match(input,33,FOLLOW_30); 

                                    								newLeafNode(otherlv_18, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_0_0_0());
                                    							
                                    // InternalAlf.g:2154:8: ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )?
                                    int alt59=2;
                                    int LA59_0 = input.LA(1);

                                    if ( (LA59_0==RULE_NATURAL_VALUE) ) {
                                        int LA59_1 = input.LA(2);

                                        if ( (LA59_1==34) ) {
                                            alt59=1;
                                        }
                                    }
                                    switch (alt59) {
                                        case 1 :
                                            // InternalAlf.g:2155:9: ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..'
                                            {
                                            // InternalAlf.g:2155:9: ( (lv_lower_19_0= ruleNaturalLiteralExpression ) )
                                            // InternalAlf.g:2156:10: (lv_lower_19_0= ruleNaturalLiteralExpression )
                                            {
                                            // InternalAlf.g:2156:10: (lv_lower_19_0= ruleNaturalLiteralExpression )
                                            // InternalAlf.g:2157:11: lv_lower_19_0= ruleNaturalLiteralExpression
                                            {

                                            											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_1_0_0());
                                            										
                                            pushFollow(FOLLOW_31);
                                            lv_lower_19_0=ruleNaturalLiteralExpression();

                                            state._fsp--;


                                            											if (current==null) {
                                            												current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                            											}
                                            											set(
                                            												current,
                                            												"lower",
                                            												lv_lower_19_0,
                                            												"org.omg.sysml.Alf.NaturalLiteralExpression");
                                            											afterParserOrEnumRuleCall();
                                            										

                                            }


                                            }

                                            otherlv_20=(Token)match(input,34,FOLLOW_30); 

                                            									newLeafNode(otherlv_20, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_0_0_1_1());
                                            								

                                            }
                                            break;

                                    }

                                    // InternalAlf.g:2179:8: ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) )
                                    // InternalAlf.g:2180:9: (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2180:9: (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression )
                                    // InternalAlf.g:2181:10: lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_2_0());
                                    									
                                    pushFollow(FOLLOW_32);
                                    lv_upper_21_0=ruleUnlimitedNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"upper",
                                    											lv_upper_21_0,
                                    											"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_22=(Token)match(input,35,FOLLOW_37); 

                                    								newLeafNode(otherlv_22, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_0_0_3());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:2203:7: ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) )
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==36) ) {
                                alt64=1;
                            }
                            else if ( (LA64_0==16) ) {
                                alt64=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 0, input);

                                throw nvae;
                            }
                            switch (alt64) {
                                case 1 :
                                    // InternalAlf.g:2204:8: (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) )
                                    {
                                    // InternalAlf.g:2204:8: (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) )
                                    // InternalAlf.g:2205:9: otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) )
                                    {
                                    otherlv_23=(Token)match(input,36,FOLLOW_34); 

                                    									newLeafNode(otherlv_23, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_1_1_0_1_0_0());
                                    								
                                    // InternalAlf.g:2209:9: ( (lv_value_24_0= ruleExpression ) )
                                    // InternalAlf.g:2210:10: (lv_value_24_0= ruleExpression )
                                    {
                                    // InternalAlf.g:2210:10: (lv_value_24_0= ruleExpression )
                                    // InternalAlf.g:2211:11: lv_value_24_0= ruleExpression
                                    {

                                    											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_1_1_0_1_0_1_0());
                                    										
                                    pushFollow(FOLLOW_35);
                                    lv_value_24_0=ruleExpression();

                                    state._fsp--;


                                    											if (current==null) {
                                    												current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    											}
                                    											set(
                                    												current,
                                    												"value",
                                    												lv_value_24_0,
                                    												"org.omg.sysml.Alf.Expression");
                                    											afterParserOrEnumRuleCall();
                                    										

                                    }


                                    }

                                    // InternalAlf.g:2228:9: (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) )
                                    int alt62=2;
                                    int LA62_0 = input.LA(1);

                                    if ( (LA62_0==19) ) {
                                        alt62=1;
                                    }
                                    else if ( (LA62_0==16) ) {
                                        alt62=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 62, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt62) {
                                        case 1 :
                                            // InternalAlf.g:2229:10: otherlv_25= ';'
                                            {
                                            otherlv_25=(Token)match(input,19,FOLLOW_2); 

                                            										newLeafNode(otherlv_25, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_0_1_0_2_0());
                                            									

                                            }
                                            break;
                                        case 2 :
                                            // InternalAlf.g:2234:10: (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' )
                                            {
                                            // InternalAlf.g:2234:10: (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' )
                                            // InternalAlf.g:2235:11: otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}'
                                            {
                                            otherlv_26=(Token)match(input,16,FOLLOW_15); 

                                            											newLeafNode(otherlv_26, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_0_2_1_0());
                                            										
                                            // InternalAlf.g:2239:11: ( (lv_ownedMembership_27_0= ruleClassMember ) )*
                                            loop61:
                                            do {
                                                int alt61=2;
                                                int LA61_0 = input.LA(1);

                                                if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_UNRESTRICTED_NAME)||LA61_0==15||(LA61_0>=20 && LA61_0<=23)||(LA61_0>=26 && LA61_0<=28)||(LA61_0>=52 && LA61_0<=58)) ) {
                                                    alt61=1;
                                                }


                                                switch (alt61) {
                                            	case 1 :
                                            	    // InternalAlf.g:2240:12: (lv_ownedMembership_27_0= ruleClassMember )
                                            	    {
                                            	    // InternalAlf.g:2240:12: (lv_ownedMembership_27_0= ruleClassMember )
                                            	    // InternalAlf.g:2241:13: lv_ownedMembership_27_0= ruleClassMember
                                            	    {

                                            	    													newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_0_2_1_1_0());
                                            	    												
                                            	    pushFollow(FOLLOW_15);
                                            	    lv_ownedMembership_27_0=ruleClassMember();

                                            	    state._fsp--;


                                            	    													if (current==null) {
                                            	    														current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                            	    													}
                                            	    													add(
                                            	    														current,
                                            	    														"ownedMembership",
                                            	    														lv_ownedMembership_27_0,
                                            	    														"org.omg.sysml.Alf.ClassMember");
                                            	    													afterParserOrEnumRuleCall();
                                            	    												

                                            	    }


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop61;
                                                }
                                            } while (true);

                                            otherlv_28=(Token)match(input,17,FOLLOW_2); 

                                            											newLeafNode(otherlv_28, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_0_2_1_2());
                                            										

                                            }


                                            }
                                            break;

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2266:8: (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' )
                                    {
                                    // InternalAlf.g:2266:8: (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' )
                                    // InternalAlf.g:2267:9: otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}'
                                    {
                                    otherlv_29=(Token)match(input,16,FOLLOW_15); 

                                    									newLeafNode(otherlv_29, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_1_0());
                                    								
                                    // InternalAlf.g:2271:9: ( (lv_ownedMembership_30_0= ruleClassMember ) )*
                                    loop63:
                                    do {
                                        int alt63=2;
                                        int LA63_0 = input.LA(1);

                                        if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_UNRESTRICTED_NAME)||LA63_0==15||(LA63_0>=20 && LA63_0<=23)||(LA63_0>=26 && LA63_0<=28)||(LA63_0>=52 && LA63_0<=58)) ) {
                                            alt63=1;
                                        }


                                        switch (alt63) {
                                    	case 1 :
                                    	    // InternalAlf.g:2272:10: (lv_ownedMembership_30_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:2272:10: (lv_ownedMembership_30_0= ruleClassMember )
                                    	    // InternalAlf.g:2273:11: lv_ownedMembership_30_0= ruleClassMember
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_15);
                                    	    lv_ownedMembership_30_0=ruleClassMember();

                                    	    state._fsp--;


                                    	    											if (current==null) {
                                    	    												current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    	    											}
                                    	    											add(
                                    	    												current,
                                    	    												"ownedMembership",
                                    	    												lv_ownedMembership_30_0,
                                    	    												"org.omg.sysml.Alf.ClassMember");
                                    	    											afterParserOrEnumRuleCall();
                                    	    										

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop63;
                                        }
                                    } while (true);

                                    otherlv_31=(Token)match(input,17,FOLLOW_2); 

                                    									newLeafNode(otherlv_31, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_1_2());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2298:6: (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' )
                            {
                            // InternalAlf.g:2298:6: (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' )
                            // InternalAlf.g:2299:7: otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';'
                            {
                            otherlv_32=(Token)match(input,33,FOLLOW_30); 

                            							newLeafNode(otherlv_32, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
                            						
                            // InternalAlf.g:2303:7: ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )?
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==RULE_NATURAL_VALUE) ) {
                                int LA65_1 = input.LA(2);

                                if ( (LA65_1==34) ) {
                                    alt65=1;
                                }
                            }
                            switch (alt65) {
                                case 1 :
                                    // InternalAlf.g:2304:8: ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..'
                                    {
                                    // InternalAlf.g:2304:8: ( (lv_lower_33_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2305:9: (lv_lower_33_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2305:9: (lv_lower_33_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2306:10: lv_lower_33_0= ruleNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_1_1_0_0());
                                    									
                                    pushFollow(FOLLOW_31);
                                    lv_lower_33_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"lower",
                                    											lv_lower_33_0,
                                    											"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_34=(Token)match(input,34,FOLLOW_30); 

                                    								newLeafNode(otherlv_34, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1_1_1());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:2328:7: ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2329:8: (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2329:8: (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2330:9: lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_1_2_0());
                            								
                            pushFollow(FOLLOW_32);
                            lv_upper_35_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"upper",
                            										lv_upper_35_0,
                            										"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_36=(Token)match(input,35,FOLLOW_9); 

                            							newLeafNode(otherlv_36, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_1_3());
                            						
                            otherlv_37=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(otherlv_37, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_1_4());
                            						

                            }


                            }
                            break;

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
    // $ANTLR end "ruleNamedFeatureDefinition"


    // $ANTLR start "entryRuleUnnamedFeatureDefinition"
    // InternalAlf.g:2363:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2363:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:2364:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnnamedFeatureDefinition=ruleUnnamedFeatureDefinition();

            state._fsp--;

             current =iv_ruleUnnamedFeatureDefinition; 
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
    // $ANTLR end "entryRuleUnnamedFeatureDefinition"


    // $ANTLR start "ruleUnnamedFeatureDefinition"
    // InternalAlf.g:2370:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_ownedMembership_0_0 = null;

        EObject lv_lower_2_0 = null;

        EObject lv_upper_4_0 = null;

        EObject lv_value_7_0 = null;

        EObject lv_ownedMembership_10_0 = null;

        EObject lv_ownedMembership_13_0 = null;

        EObject lv_lower_16_0 = null;

        EObject lv_upper_18_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2376:2: ( ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) ) )
            // InternalAlf.g:2377:2: ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) )
            {
            // InternalAlf.g:2377:2: ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) )
            // InternalAlf.g:2378:3: ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) )
            {
            // InternalAlf.g:2378:3: ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:2379:4: (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:2379:4: (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:2380:5: lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_ownedMembership_0_0=ruleOwnedRedefinitionOrSubset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_0_0,
            						"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2397:3: ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==33) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==RULE_NATURAL_VALUE) ) {
                    int LA75_3 = input.LA(3);

                    if ( (LA75_3==34) ) {
                        int LA75_5 = input.LA(4);

                        if ( (LA75_5==RULE_NATURAL_VALUE) ) {
                            int LA75_7 = input.LA(5);

                            if ( (LA75_7==35) ) {
                                int LA75_6 = input.LA(6);

                                if ( (LA75_6==19) ) {
                                    alt75=2;
                                }
                                else if ( (LA75_6==16||LA75_6==36) ) {
                                    alt75=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 75, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 75, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA75_5==43) ) {
                            int LA75_4 = input.LA(5);

                            if ( (LA75_4==35) ) {
                                int LA75_6 = input.LA(6);

                                if ( (LA75_6==19) ) {
                                    alt75=2;
                                }
                                else if ( (LA75_6==16||LA75_6==36) ) {
                                    alt75=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 75, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 75, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA75_3==35) ) {
                        int LA75_6 = input.LA(4);

                        if ( (LA75_6==19) ) {
                            alt75=2;
                        }
                        else if ( (LA75_6==16||LA75_6==36) ) {
                            alt75=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA75_1==43) ) {
                    int LA75_4 = input.LA(3);

                    if ( (LA75_4==35) ) {
                        int LA75_6 = input.LA(4);

                        if ( (LA75_6==19) ) {
                            alt75=2;
                        }
                        else if ( (LA75_6==16||LA75_6==36) ) {
                            alt75=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA75_0==16||LA75_0==36) ) {
                alt75=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalAlf.g:2398:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) )
                    {
                    // InternalAlf.g:2398:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) )
                    // InternalAlf.g:2399:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) )
                    {
                    // InternalAlf.g:2399:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==33) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalAlf.g:2400:6: otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']'
                            {
                            otherlv_1=(Token)match(input,33,FOLLOW_30); 

                            						newLeafNode(otherlv_1, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:2404:6: ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==RULE_NATURAL_VALUE) ) {
                                int LA68_1 = input.LA(2);

                                if ( (LA68_1==34) ) {
                                    alt68=1;
                                }
                            }
                            switch (alt68) {
                                case 1 :
                                    // InternalAlf.g:2405:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..'
                                    {
                                    // InternalAlf.g:2405:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2406:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2406:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2407:9: lv_lower_2_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0_1_0_0());
                                    								
                                    pushFollow(FOLLOW_31);
                                    lv_lower_2_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_2_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_3=(Token)match(input,34,FOLLOW_30); 

                                    							newLeafNode(otherlv_3, grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_0_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:2429:6: ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2430:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2430:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2431:8: lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_0_2_0());
                            							
                            pushFollow(FOLLOW_32);
                            lv_upper_4_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_4_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,35,FOLLOW_37); 

                            						newLeafNode(otherlv_5, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_0_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2453:5: ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==36) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==16) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalAlf.g:2454:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            {
                            // InternalAlf.g:2454:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            // InternalAlf.g:2455:7: otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_34); 

                            							newLeafNode(otherlv_6, grammarAccess.getUnnamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_1_0_0());
                            						
                            // InternalAlf.g:2459:7: ( (lv_value_7_0= ruleExpression ) )
                            // InternalAlf.g:2460:8: (lv_value_7_0= ruleExpression )
                            {
                            // InternalAlf.g:2460:8: (lv_value_7_0= ruleExpression )
                            // InternalAlf.g:2461:9: lv_value_7_0= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_1_0_1_0());
                            								
                            pushFollow(FOLLOW_35);
                            lv_value_7_0=ruleExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"value",
                            										lv_value_7_0,
                            										"org.omg.sysml.Alf.Expression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalAlf.g:2478:7: (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==19) ) {
                                alt71=1;
                            }
                            else if ( (LA71_0==16) ) {
                                alt71=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 71, 0, input);

                                throw nvae;
                            }
                            switch (alt71) {
                                case 1 :
                                    // InternalAlf.g:2479:8: otherlv_8= ';'
                                    {
                                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                                    								newLeafNode(otherlv_8, grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_1_0_2_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2484:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    {
                                    // InternalAlf.g:2484:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    // InternalAlf.g:2485:9: otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}'
                                    {
                                    otherlv_9=(Token)match(input,16,FOLLOW_15); 

                                    									newLeafNode(otherlv_9, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_0_2_1_0());
                                    								
                                    // InternalAlf.g:2489:9: ( (lv_ownedMembership_10_0= ruleClassMember ) )*
                                    loop70:
                                    do {
                                        int alt70=2;
                                        int LA70_0 = input.LA(1);

                                        if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_UNRESTRICTED_NAME)||LA70_0==15||(LA70_0>=20 && LA70_0<=23)||(LA70_0>=26 && LA70_0<=28)||(LA70_0>=52 && LA70_0<=58)) ) {
                                            alt70=1;
                                        }


                                        switch (alt70) {
                                    	case 1 :
                                    	    // InternalAlf.g:2490:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:2490:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    // InternalAlf.g:2491:11: lv_ownedMembership_10_0= ruleClassMember
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_0_2_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_15);
                                    	    lv_ownedMembership_10_0=ruleClassMember();

                                    	    state._fsp--;


                                    	    											if (current==null) {
                                    	    												current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                                    	    											}
                                    	    											add(
                                    	    												current,
                                    	    												"ownedMembership",
                                    	    												lv_ownedMembership_10_0,
                                    	    												"org.omg.sysml.Alf.ClassMember");
                                    	    											afterParserOrEnumRuleCall();
                                    	    										

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop70;
                                        }
                                    } while (true);

                                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                                    									newLeafNode(otherlv_11, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_0_2_1_2());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2516:6: (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' )
                            {
                            // InternalAlf.g:2516:6: (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' )
                            // InternalAlf.g:2517:7: otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}'
                            {
                            otherlv_12=(Token)match(input,16,FOLLOW_15); 

                            							newLeafNode(otherlv_12, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_1_0());
                            						
                            // InternalAlf.g:2521:7: ( (lv_ownedMembership_13_0= ruleClassMember ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( ((LA72_0>=RULE_ID && LA72_0<=RULE_UNRESTRICTED_NAME)||LA72_0==15||(LA72_0>=20 && LA72_0<=23)||(LA72_0>=26 && LA72_0<=28)||(LA72_0>=52 && LA72_0<=58)) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // InternalAlf.g:2522:8: (lv_ownedMembership_13_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:2522:8: (lv_ownedMembership_13_0= ruleClassMember )
                            	    // InternalAlf.g:2523:9: lv_ownedMembership_13_0= ruleClassMember
                            	    {

                            	    									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_15);
                            	    lv_ownedMembership_13_0=ruleClassMember();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
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
                            	    break loop72;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(otherlv_14, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2548:4: (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' )
                    {
                    // InternalAlf.g:2548:4: (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' )
                    // InternalAlf.g:2549:5: otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';'
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_30); 

                    					newLeafNode(otherlv_15, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalAlf.g:2553:5: ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_NATURAL_VALUE) ) {
                        int LA74_1 = input.LA(2);

                        if ( (LA74_1==34) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalAlf.g:2554:6: ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..'
                            {
                            // InternalAlf.g:2554:6: ( (lv_lower_16_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:2555:7: (lv_lower_16_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2555:7: (lv_lower_16_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:2556:8: lv_lower_16_0= ruleNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0());
                            							
                            pushFollow(FOLLOW_31);
                            lv_lower_16_0=ruleNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"lower",
                            									lv_lower_16_0,
                            									"org.omg.sysml.Alf.NaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_17=(Token)match(input,34,FOLLOW_30); 

                            						newLeafNode(otherlv_17, grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2578:5: ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:2579:6: (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:2579:6: (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:2580:7: lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    							newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_32);
                    lv_upper_18_0=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"upper",
                    								lv_upper_18_0,
                    								"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_19=(Token)match(input,35,FOLLOW_9); 

                    					newLeafNode(otherlv_19, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3());
                    				
                    otherlv_20=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_20, grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_4());
                    				

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
    // $ANTLR end "ruleUnnamedFeatureDefinition"


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:2611:1: entryRuleOwnedRedefinitionOrSubset returns [EObject current=null] : iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF ;
    public final EObject entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedRedefinitionOrSubset = null;


        try {
            // InternalAlf.g:2611:66: (iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:2612:2: iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF
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
    // InternalAlf.g:2618:1: ruleOwnedRedefinitionOrSubset returns [EObject current=null] : ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) ;
    public final EObject ruleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2624:2: ( ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) )
            // InternalAlf.g:2625:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            {
            // InternalAlf.g:2625:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==18||LA77_0==37) ) {
                alt77=1;
            }
            else if ( (LA77_0==38) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:2626:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    {
                    // InternalAlf.g:2626:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    // InternalAlf.g:2627:4: (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    {
                    // InternalAlf.g:2627:4: (otherlv_0= 'is' | otherlv_1= 'redefines' )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==18) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==37) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalAlf.g:2628:5: otherlv_0= 'is'
                            {
                            otherlv_0=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_0, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2633:5: otherlv_1= 'redefines'
                            {
                            otherlv_1=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2638:4: ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    // InternalAlf.g:2639:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    {
                    // InternalAlf.g:2639:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    // InternalAlf.g:2640:6: lv_ownedMemberElement_2_0= ruleRedefinition
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
                    // InternalAlf.g:2659:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    {
                    // InternalAlf.g:2659:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    // InternalAlf.g:2660:4: otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0());
                    			
                    // InternalAlf.g:2664:4: ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    // InternalAlf.g:2665:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    {
                    // InternalAlf.g:2665:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    // InternalAlf.g:2666:6: lv_ownedMemberElement_4_0= ruleSubset
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
    // InternalAlf.g:2688:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:2688:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:2689:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:2695:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2701:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2702:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2702:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2703:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2703:3: ( ruleQualifiedName )
            // InternalAlf.g:2704:4: ruleQualifiedName
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
    // InternalAlf.g:2721:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:2721:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:2722:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:2728:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2734:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2735:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2735:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2736:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2736:3: ( ruleQualifiedName )
            // InternalAlf.g:2737:4: ruleQualifiedName
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
    // InternalAlf.g:2754:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:2754:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:2755:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:2761:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2767:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            // InternalAlf.g:2768:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            {
            // InternalAlf.g:2768:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            // InternalAlf.g:2769:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';'
            {
            // InternalAlf.g:2769:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
            int alt80=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA80_1 = input.LA(2);

                    if ( (LA80_1==18||LA80_1==30) ) {
                        alt80=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==18||LA80_2==30) ) {
                        alt80=1;
                    }
                    }
                    break;
                case 18:
                case 30:
                    {
                    alt80=1;
                    }
                    break;
            }

            switch (alt80) {
                case 1 :
                    // InternalAlf.g:2770:4: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                    {
                    // InternalAlf.g:2770:4: ( (lv_name_0_0= ruleName ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( ((LA78_0>=RULE_ID && LA78_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalAlf.g:2771:5: (lv_name_0_0= ruleName )
                            {
                            // InternalAlf.g:2771:5: (lv_name_0_0= ruleName )
                            // InternalAlf.g:2772:6: lv_name_0_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_38);
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

                    // InternalAlf.g:2789:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==30) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAlf.g:2790:5: otherlv_1= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_1=(Token)match(input,30,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:2794:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2795:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2795:6: ( ruleQualifiedName )
                            // InternalAlf.g:2796:7: ruleQualifiedName
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

            // InternalAlf.g:2816:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2817:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2817:4: ( ruleQualifiedName )
            // InternalAlf.g:2818:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_39);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAlf.g:2836:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2837:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:2837:4: ( ruleQualifiedName )
            // InternalAlf.g:2838:5: ruleQualifiedName
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
    // InternalAlf.g:2860:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:2860:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:2861:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:2867:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2873:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:2874:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:2885:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:2885:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:2886:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:2892:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:2898:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:2899:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:2899:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:2900:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2908:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=40 && LA82_0<=45)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAlf.g:2909:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:2909:4: ()
                    // InternalAlf.g:2910:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:2916:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( ((LA81_0>=41 && LA81_0<=45)) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==40) ) {
                        alt81=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalAlf.g:2917:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:2917:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:2918:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:2918:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:2919:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:2919:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:2920:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_34);
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

                            // InternalAlf.g:2937:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:2938:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:2938:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:2939:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:2958:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:2958:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:2959:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:2959:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:2960:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:2960:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:2961:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,40,FOLLOW_41); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,33,FOLLOW_34); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:2977:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:2978:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:2978:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:2979:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_32);
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

                            otherlv_7=(Token)match(input,35,FOLLOW_2); 

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
    // InternalAlf.g:3007:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:3007:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:3008:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:3014:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3020:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:3021:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:3021:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt83=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt83=1;
                }
                break;
            case 42:
                {
                alt83=2;
                }
                break;
            case 43:
                {
                alt83=3;
                }
                break;
            case 44:
                {
                alt83=4;
                }
                break;
            case 45:
                {
                alt83=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalAlf.g:3022:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3028:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:3034:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:3040:3: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:3046:3: kw= '^'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalAlf.g:3055:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:3055:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:3056:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:3062:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3068:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:3069:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:3069:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=RULE_BOOLEAN_VALUE && LA84_0<=RULE_UNRESTRICTED_NAME)||LA84_0==16||LA84_0==43||LA84_0==46||(LA84_0>=48 && LA84_0<=49)) ) {
                alt84=1;
            }
            else if ( ((LA84_0>=41 && LA84_0<=42)) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalAlf.g:3070:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getSequenceAccessExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceAccessExpression_0=ruleSequenceAccessExpression();

                    state._fsp--;


                    			current = this_SequenceAccessExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3079:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:3079:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:3080:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:3080:4: ()
                    // InternalAlf.g:3081:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3087:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:3088:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:3088:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:3089:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

                    // InternalAlf.g:3106:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:3107:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:3107:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:3108:6: lv_operand_3_0= ruleSequenceAccessExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandSequenceAccessExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=ruleSequenceAccessExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.sysml.Alf.SequenceAccessExpression");
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
    // InternalAlf.g:3130:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:3130:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:3131:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:3137:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3143:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:3144:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:3144:2: (kw= '+' | kw= '-' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==41) ) {
                alt85=1;
            }
            else if ( (LA85_0==42) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:3145:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3151:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSequenceAccessExpression"
    // InternalAlf.g:3160:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:3160:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:3161:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceAccessExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceAccessExpression=ruleSequenceAccessExpression();

            state._fsp--;

             current =iv_ruleSequenceAccessExpression; 
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
    // $ANTLR end "entryRuleSequenceAccessExpression"


    // $ANTLR start "ruleSequenceAccessExpression"
    // InternalAlf.g:3167:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3173:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:3174:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:3174:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:3175:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3183:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==33) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalAlf.g:3184:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:3184:4: ()
            	    // InternalAlf.g:3185:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_34); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:3195:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:3196:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:3196:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:3197:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_index_3_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceAccessExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"index",
            	    							lv_index_3_0,
            	    							"org.omg.sysml.Alf.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,35,FOLLOW_43); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // $ANTLR end "ruleSequenceAccessExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalAlf.g:3223:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:3223:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:3224:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:3230:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:3236:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:3237:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:3237:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt87=5;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // InternalAlf.g:3238:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:3247:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:3256:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:3265:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:3274:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:3274:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:3275:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_44);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,47,FOLLOW_2); 

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
    // InternalAlf.g:3296:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:3296:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:3297:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:3303:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3309:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3310:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3310:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3311:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3311:3: ( ruleQualifiedName )
            // InternalAlf.g:3312:4: ruleQualifiedName
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
    // InternalAlf.g:3329:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:3329:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:3330:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:3336:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3342:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:3343:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:3343:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:3344:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:3344:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3345:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3345:4: ( ruleQualifiedName )
            // InternalAlf.g:3346:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_45);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:3364:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=RULE_BOOLEAN_VALUE && LA89_0<=RULE_UNRESTRICTED_NAME)||LA89_0==16||(LA89_0>=41 && LA89_0<=43)||LA89_0==46||(LA89_0>=48 && LA89_0<=49)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAlf.g:3365:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:3365:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:3366:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:3366:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:3367:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalAlf.g:3384:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==25) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalAlf.g:3385:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_34); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:3389:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:3390:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:3390:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:3391:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FOLLOW_2); 

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
    // InternalAlf.g:3418:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:3418:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:3419:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:3425:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3431:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:3432:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:3432:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:3433:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:3433:3: ()
            // InternalAlf.g:3434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:3444:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=RULE_BOOLEAN_VALUE && LA91_0<=RULE_UNRESTRICTED_NAME)||LA91_0==16||(LA91_0>=41 && LA91_0<=43)||LA91_0==46||(LA91_0>=48 && LA91_0<=49)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAlf.g:3445:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:3445:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:3446:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:3446:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:3447:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_49);
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

                    // InternalAlf.g:3464:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==25) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalAlf.g:3465:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_34); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:3469:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:3470:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:3470:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:3471:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
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
                    	    break loop90;
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
    // InternalAlf.g:3498:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:3498:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:3499:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:3505:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:3511:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3512:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3512:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt92=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt92=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt92=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt92=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA92_4 = input.LA(2);

                if ( (LA92_4==EOF||(LA92_4>=16 && LA92_4<=17)||LA92_4==19||LA92_4==25||LA92_4==33||LA92_4==35||(LA92_4>=40 && LA92_4<=45)||LA92_4==47) ) {
                    alt92=5;
                }
                else if ( (LA92_4==49) ) {
                    alt92=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 4, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt92=4;
                }
                break;
            case 43:
                {
                alt92=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalAlf.g:3513:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:3522:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:3531:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:3540:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:3549:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:3561:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:3561:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:3562:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:3568:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:3574:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:3575:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:3575:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:3576:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:3576:3: ()
            // InternalAlf.g:3577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalAlf.g:3591:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:3591:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:3592:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:3598:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:3604:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:3605:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:3605:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:3606:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:3606:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:3607:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:3626:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:3626:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:3627:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:3633:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:3639:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:3640:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:3640:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:3641:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:3641:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:3642:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:3661:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:3661:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:3662:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:3668:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3674:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:3675:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:3675:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:3676:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:3676:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:3677:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:3697:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:3697:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:3698:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:3704:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:3710:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:3711:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:3711:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:3712:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:3712:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_NATURAL_VALUE) ) {
                alt94=1;
            }
            else if ( (LA94_0==49) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalAlf.g:3713:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:3713:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:3714:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_50); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,49,FOLLOW_51); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:3726:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==RULE_NATURAL_VALUE) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalAlf.g:3727:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_52); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3737:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:3737:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:3738:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,49,FOLLOW_53); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_52); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:3752:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=50 && LA97_0<=51)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalAlf.g:3753:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:3753:4: (kw= 'e' | kw= 'E' )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==50) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==51) ) {
                        alt95=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalAlf.g:3754:5: kw= 'e'
                            {
                            kw=(Token)match(input,50,FOLLOW_54); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3760:5: kw= 'E'
                            {
                            kw=(Token)match(input,51,FOLLOW_54); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:3766:4: (kw= '+' | kw= '-' )?
                    int alt96=3;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==41) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==42) ) {
                        alt96=2;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalAlf.g:3767:5: kw= '+'
                            {
                            kw=(Token)match(input,41,FOLLOW_53); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3773:5: kw= '-'
                            {
                            kw=(Token)match(input,42,FOLLOW_53); 

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
    // InternalAlf.g:3791:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:3791:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:3792:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:3798:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:3804:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:3805:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:3805:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:3806:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:3806:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:3807:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:3826:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:3826:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:3827:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:3833:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3839:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:3840:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:3840:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_NATURAL_VALUE) ) {
                alt98=1;
            }
            else if ( (LA98_0==43) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalAlf.g:3841:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:3850:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:3850:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:3851:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:3851:4: ()
                    // InternalAlf.g:3852:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAlf.g:3867:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:3867:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:3868:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:3874:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:3880:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:3881:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:3881:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
                alt99=1;
            }
            else if ( (LA99_0==RULE_UNRESTRICTED_NAME) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalAlf.g:3882:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3890:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:3901:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:3901:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:3902:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:3908:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3914:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalAlf.g:3915:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:3915:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalAlf.g:3916:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3926:3: (kw= '.' this_Name_2= ruleName )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==49) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalAlf.g:3927:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,49,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_55);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop100;
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
    // InternalAlf.g:3947:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:3953:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:3954:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:3954:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt101=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt101=1;
                }
                break;
            case 53:
                {
                alt101=2;
                }
                break;
            case 54:
                {
                alt101=3;
                }
                break;
            case 55:
                {
                alt101=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalAlf.g:3955:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:3955:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:3956:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3963:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:3963:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:3964:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:3971:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:3971:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:3972:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:3979:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:3979:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:3980:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

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
    // InternalAlf.g:3990:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:3996:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:3997:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:3997:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt102=1;
                }
                break;
            case 57:
                {
                alt102=2;
                }
                break;
            case 58:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalAlf.g:3998:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:3998:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:3999:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4006:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:4006:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:4007:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4014:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:4014:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:4015:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

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
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA87 dfa87 = new DFA87(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\17\1\7\1\uffff\2\7\2\20\1\uffff\4\20\2\7\4\20\2\7\4\20";
    static final String dfa_3s = "\1\27\1\22\1\uffff\4\22\1\uffff\4\30\2\10\4\61\2\10\4\61";
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
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\23",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\23"
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
    static final String dfa_7s = "\25\uffff";
    static final String dfa_8s = "\2\7\4\20\1\7\2\uffff\1\7\4\20\1\7\1\uffff\1\7\4\20";
    static final String dfa_9s = "\1\26\5\46\1\10\2\uffff\1\10\4\61\1\10\1\uffff\1\10\4\61";
    static final String dfa_10s = "\7\uffff\1\2\1\1\6\uffff\1\3\5\uffff";
    static final String dfa_11s = "\25\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\15\uffff\1\1",
            "\1\4\1\5\11\uffff\1\6\22\uffff\2\7",
            "\1\10\1\uffff\1\11\1\10\12\uffff\1\10\2\uffff\1\10\2\uffff\3\10",
            "\1\10\1\uffff\1\11\1\10\12\uffff\1\10\2\uffff\1\10\2\uffff\3\10",
            "\1\10\1\uffff\1\11\1\10\12\uffff\1\10\2\uffff\1\10\2\uffff\3\10",
            "\1\10\1\uffff\1\11\1\10\12\uffff\1\10\2\uffff\1\10\2\uffff\3\10",
            "\1\12\1\13",
            "",
            "",
            "\1\14\1\15",
            "\1\7\2\uffff\1\17\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16",
            "\1\7\2\uffff\1\17\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16",
            "\1\10\2\uffff\1\17\15\uffff\1\10\2\uffff\1\10\14\uffff\1\20",
            "\1\10\2\uffff\1\17\15\uffff\1\10\2\uffff\1\10\14\uffff\1\20",
            "\1\21\1\22",
            "",
            "\1\23\1\24",
            "\1\7\2\uffff\1\17\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16",
            "\1\7\2\uffff\1\17\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16",
            "\1\10\2\uffff\1\17\15\uffff\1\10\2\uffff\1\10\14\uffff\1\20",
            "\1\10\2\uffff\1\17\15\uffff\1\10\2\uffff\1\10\14\uffff\1\20"
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
            return "413:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )";
        }
    }
    static final String dfa_13s = "\33\uffff";
    static final String dfa_14s = "\4\7\1\uffff\2\20\1\uffff\3\7\2\20\1\7\1\uffff\1\7\4\20\1\7\1\uffff\1\7\4\20";
    static final String dfa_15s = "\4\72\1\uffff\2\46\1\uffff\5\46\1\10\1\uffff\1\10\4\61\1\10\1\uffff\1\10\4\61";
    static final String dfa_16s = "\4\uffff\1\1\2\uffff\1\3\6\uffff\1\2\6\uffff\1\4\5\uffff";
    static final String dfa_17s = "\33\uffff}>";
    static final String[] dfa_18s = {
            "\1\5\1\6\15\uffff\1\1\3\uffff\1\2\1\3\1\7\33\uffff\3\4",
            "\1\13\1\14\11\uffff\1\15\22\uffff\2\16\21\uffff\1\10\1\11\1\12",
            "\1\13\1\14\11\uffff\1\15\22\uffff\2\16\21\uffff\1\10\1\11\1\12",
            "\2\4\11\uffff\1\16\22\uffff\2\16\21\uffff\1\10\1\11\1\12",
            "",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "",
            "\2\4\11\uffff\1\16\22\uffff\2\16",
            "\2\4\11\uffff\1\16\22\uffff\2\16",
            "\2\4\11\uffff\1\16\22\uffff\2\16",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\20\1\21",
            "",
            "\1\22\1\23",
            "\1\16\2\uffff\1\25\15\uffff\1\16\2\uffff\1\16\14\uffff\1\24",
            "\1\16\2\uffff\1\25\15\uffff\1\16\2\uffff\1\16\14\uffff\1\24",
            "\1\4\2\uffff\1\25\15\uffff\1\4\2\uffff\1\4\14\uffff\1\26",
            "\1\4\2\uffff\1\25\15\uffff\1\4\2\uffff\1\4\14\uffff\1\26",
            "\1\27\1\30",
            "",
            "\1\31\1\32",
            "\1\16\2\uffff\1\25\15\uffff\1\16\2\uffff\1\16\14\uffff\1\24",
            "\1\16\2\uffff\1\25\15\uffff\1\16\2\uffff\1\16\14\uffff\1\24",
            "\1\4\2\uffff\1\25\15\uffff\1\4\2\uffff\1\4\14\uffff\1\26",
            "\1\4\2\uffff\1\25\15\uffff\1\4\2\uffff\1\4\14\uffff\1\26"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "949:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )";
        }
    }
    static final String dfa_19s = "\24\uffff";
    static final String dfa_20s = "\1\26\2\7\2\uffff\2\20\2\7\4\20\1\7\1\uffff\1\7\4\20";
    static final String dfa_21s = "\1\34\2\72\2\uffff\2\46\2\10\4\61\1\10\1\uffff\1\10\4\61";
    static final String dfa_22s = "\3\uffff\1\1\1\2\11\uffff\1\3\5\uffff";
    static final String dfa_23s = "\24\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\3\uffff\1\2\1\3\1\4",
            "\1\5\1\6\11\uffff\1\7\22\uffff\2\3\21\uffff\3\3",
            "\1\5\1\6\11\uffff\1\7\22\uffff\2\3\21\uffff\3\3",
            "",
            "",
            "\1\3\1\uffff\1\10\1\3\12\uffff\1\3\2\uffff\1\3\2\uffff\3\3",
            "\1\3\1\uffff\1\10\1\3\12\uffff\1\3\2\uffff\1\3\2\uffff\3\3",
            "\1\11\1\12",
            "\1\13\1\14",
            "\1\3\2\uffff\1\16\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15",
            "\1\3\2\uffff\1\16\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15",
            "\1\3\2\uffff\1\16\15\uffff\1\3\2\uffff\1\3\14\uffff\1\17",
            "\1\3\2\uffff\1\16\15\uffff\1\3\2\uffff\1\3\14\uffff\1\17",
            "\1\20\1\21",
            "",
            "\1\22\1\23",
            "\1\3\2\uffff\1\16\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15",
            "\1\3\2\uffff\1\16\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15",
            "\1\3\2\uffff\1\16\15\uffff\1\3\2\uffff\1\3\14\uffff\1\17",
            "\1\3\2\uffff\1\16\15\uffff\1\3\2\uffff\1\3\14\uffff\1\17"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1496:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )";
        }
    }
    static final String dfa_25s = "\2\7\1\uffff\2\20\4\7\1\uffff\2\20\1\7\4\20\1\7\1\uffff\1\7\4\20";
    static final String dfa_26s = "\2\72\1\uffff\5\46\1\10\1\uffff\2\46\1\10\4\61\1\10\1\uffff\1\10\4\61";
    static final String dfa_27s = "\2\uffff\1\1\6\uffff\1\2\10\uffff\1\3\5\uffff";
    static final String[] dfa_28s = {
            "\1\3\1\4\24\uffff\1\1\32\uffff\3\2",
            "\1\12\1\13\11\uffff\1\10\22\uffff\2\11\21\uffff\1\5\1\6\1\7",
            "",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\2\2\11\uffff\1\11\22\uffff\2\11",
            "\2\2\11\uffff\1\11\22\uffff\2\11",
            "\2\2\11\uffff\1\11\22\uffff\2\11",
            "\1\15\1\16",
            "",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\17\1\20",
            "\1\11\2\uffff\1\22\15\uffff\1\11\2\uffff\1\11\14\uffff\1\21",
            "\1\11\2\uffff\1\22\15\uffff\1\11\2\uffff\1\11\14\uffff\1\21",
            "\1\2\2\uffff\1\22\15\uffff\1\2\2\uffff\1\2\14\uffff\1\23",
            "\1\2\2\uffff\1\22\15\uffff\1\2\2\uffff\1\2\14\uffff\1\23",
            "\1\24\1\25",
            "",
            "\1\26\1\27",
            "\1\11\2\uffff\1\22\15\uffff\1\11\2\uffff\1\11\14\uffff\1\21",
            "\1\11\2\uffff\1\22\15\uffff\1\11\2\uffff\1\11\14\uffff\1\21",
            "\1\2\2\uffff\1\22\15\uffff\1\2\2\uffff\1\2\14\uffff\1\23",
            "\1\2\2\uffff\1\22\15\uffff\1\2\2\uffff\1\2\14\uffff\1\23"
    };
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_5;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "1705:3: ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )";
        }
    }
    static final String dfa_29s = "\13\uffff";
    static final String dfa_30s = "\2\uffff\2\10\5\uffff\2\10";
    static final String dfa_31s = "\1\4\1\uffff\2\20\2\uffff\1\7\2\uffff\2\20";
    static final String dfa_32s = "\1\61\1\uffff\2\61\2\uffff\1\10\2\uffff\2\61";
    static final String dfa_33s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\3\1\2\2\uffff";
    static final String dfa_34s = "\13\uffff}>";
    static final String[] dfa_35s = {
            "\3\1\1\2\1\3\7\uffff\1\4\32\uffff\1\1\2\uffff\1\5\1\uffff\2\1",
            "",
            "\2\10\1\uffff\1\10\5\uffff\1\10\7\uffff\1\10\1\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\2\10\1\uffff\1\10\5\uffff\1\10\7\uffff\1\10\1\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\2\10\1\uffff\1\10\5\uffff\1\10\7\uffff\1\10\1\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\2\10\1\uffff\1\10\5\uffff\1\10\7\uffff\1\10\1\uffff\1\10\4\uffff\6\10\1\7\1\10\1\uffff\1\6"
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "3237:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00F0000000F28180L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00F0000000B08000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040180L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000006000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x07F000001CF28180L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x070000001C400180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0700000000400180L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0700006000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040040180L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x07F000003CF28180L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001C400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0700006000440180L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0700000020400180L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000072400D0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180000180L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000180L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000072000D0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001200090000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000090000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00034E00000101F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001200010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00003F0000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00034800000101F0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0003CE00000101F0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00034E00000301F0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000C000000000042L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000060000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002000000000002L});

}