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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'is'", "';'", "'class'", "'feature'", "'abstract'", "'specializes'", "','", "'port'", "':'", "'['", "'..'", "']'", "'='", "'redefines'", "'subsets'", "'connector'", "'=>'", "'@'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'null'", "'.'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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
    // InternalAlf.g:108:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_membership_3_0= ruleMemberDefinition ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_membership_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:114:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_membership_3_0= ruleMemberDefinition ) )* otherlv_4= '}' ) )
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_membership_3_0= ruleMemberDefinition ) )* otherlv_4= '}' )
            {
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_membership_3_0= ruleMemberDefinition ) )* otherlv_4= '}' )
            // InternalAlf.g:116:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_membership_3_0= ruleMemberDefinition ) )* otherlv_4= '}'
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
            		
            // InternalAlf.g:143:3: ( (lv_membership_3_0= ruleMemberDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_UNRESTRICTED_NAME)||LA2_0==15||LA2_0==18||(LA2_0>=20 && LA2_0<=22)||LA2_0==25||(LA2_0>=31 && LA2_0<=33)||(LA2_0>=47 && LA2_0<=53)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:144:4: (lv_membership_3_0= ruleMemberDefinition )
            	    {
            	    // InternalAlf.g:144:4: (lv_membership_3_0= ruleMemberDefinition )
            	    // InternalAlf.g:145:5: lv_membership_3_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_membership_3_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"membership",
            	    						lv_membership_3_0,
            	    						"org.omg.sysml.Alf.MemberDefinition");
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


    // $ANTLR start "entryRuleMemberDefinition"
    // InternalAlf.g:195:1: entryRuleMemberDefinition returns [EObject current=null] : iv_ruleMemberDefinition= ruleMemberDefinition EOF ;
    public final EObject entryRuleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDefinition = null;


        try {
            // InternalAlf.g:195:57: (iv_ruleMemberDefinition= ruleMemberDefinition EOF )
            // InternalAlf.g:196:2: iv_ruleMemberDefinition= ruleMemberDefinition EOF
            {
             newCompositeNode(grammarAccess.getMemberDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberDefinition=ruleMemberDefinition();

            state._fsp--;

             current =iv_ruleMemberDefinition; 
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
    // $ANTLR end "entryRuleMemberDefinition"


    // $ANTLR start "ruleMemberDefinition"
    // InternalAlf.g:202:1: ruleMemberDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) ;
    public final EObject ruleMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_1_0 = null;

        AntlrDatatypeRuleToken lv_memberName_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:208:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) )
            // InternalAlf.g:209:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            {
            // InternalAlf.g:209:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            // InternalAlf.g:210:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            {
            // InternalAlf.g:210:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=47 && LA3_0<=50)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlf.g:211:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:211:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:212:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
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

            // InternalAlf.g:229:3: ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:230:4: ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) )
                    {
                    // InternalAlf.g:230:4: ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) )
                    // InternalAlf.g:231:5: (lv_ownedMemberElement_1_0= rulePackagedElementDefinition )
                    {
                    // InternalAlf.g:231:5: (lv_ownedMemberElement_1_0= rulePackagedElementDefinition )
                    // InternalAlf.g:232:6: lv_ownedMemberElement_1_0= rulePackagedElementDefinition
                    {

                    						newCompositeNode(grammarAccess.getMemberDefinitionAccess().getOwnedMemberElementPackagedElementDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_1_0=rulePackagedElementDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_1_0,
                    							"org.omg.sysml.Alf.PackagedElementDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:250:4: ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    {
                    // InternalAlf.g:250:4: ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    // InternalAlf.g:251:5: ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';'
                    {
                    // InternalAlf.g:251:5: ( ruleMemberKind )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15||(LA4_0>=20 && LA4_0<=21)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalAlf.g:252:6: ruleMemberKind
                            {

                            						newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMemberKindParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_7);
                            ruleMemberKind();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:260:5: ( (lv_memberName_3_0= ruleName ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAlf.g:261:6: (lv_memberName_3_0= ruleName )
                            {
                            // InternalAlf.g:261:6: (lv_memberName_3_0= ruleName )
                            // InternalAlf.g:262:7: lv_memberName_3_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMemberNameNameParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_memberName_3_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
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

                    					newLeafNode(otherlv_4, grammarAccess.getMemberDefinitionAccess().getIsKeyword_1_1_2());
                    				
                    // InternalAlf.g:283:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:284:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:284:6: ( ruleQualifiedName )
                    // InternalAlf.g:285:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMemberDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMemberElementElementCrossReference_1_1_3_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getMemberDefinitionAccess().getSemicolonKeyword_1_1_4());
                    				

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
    // $ANTLR end "ruleMemberDefinition"


    // $ANTLR start "entryRuleMemberKind"
    // InternalAlf.g:309:1: entryRuleMemberKind returns [String current=null] : iv_ruleMemberKind= ruleMemberKind EOF ;
    public final String entryRuleMemberKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberKind = null;


        try {
            // InternalAlf.g:309:50: (iv_ruleMemberKind= ruleMemberKind EOF )
            // InternalAlf.g:310:2: iv_ruleMemberKind= ruleMemberKind EOF
            {
             newCompositeNode(grammarAccess.getMemberKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberKind=ruleMemberKind();

            state._fsp--;

             current =iv_ruleMemberKind.getText(); 
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
    // $ANTLR end "entryRuleMemberKind"


    // $ANTLR start "ruleMemberKind"
    // InternalAlf.g:316:1: ruleMemberKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' | kw= 'class' | kw= 'feature' ) ;
    public final AntlrDatatypeRuleToken ruleMemberKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:322:2: ( (kw= 'package' | kw= 'class' | kw= 'feature' ) )
            // InternalAlf.g:323:2: (kw= 'package' | kw= 'class' | kw= 'feature' )
            {
            // InternalAlf.g:323:2: (kw= 'package' | kw= 'class' | kw= 'feature' )
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
                    // InternalAlf.g:324:3: kw= 'package'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberKindAccess().getPackageKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:330:3: kw= 'class'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberKindAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:336:3: kw= 'feature'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberKindAccess().getFeatureKeyword_2());
                    		

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
    // $ANTLR end "ruleMemberKind"


    // $ANTLR start "entryRulePackagedElementDefinition"
    // InternalAlf.g:345:1: entryRulePackagedElementDefinition returns [EObject current=null] : iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF ;
    public final EObject entryRulePackagedElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedElementDefinition = null;


        try {
            // InternalAlf.g:345:66: (iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF )
            // InternalAlf.g:346:2: iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF
            {
             newCompositeNode(grammarAccess.getPackagedElementDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagedElementDefinition=rulePackagedElementDefinition();

            state._fsp--;

             current =iv_rulePackagedElementDefinition; 
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
    // $ANTLR end "entryRulePackagedElementDefinition"


    // $ANTLR start "rulePackagedElementDefinition"
    // InternalAlf.g:352:1: rulePackagedElementDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub | this_FeatureDefinition_2= ruleFeatureDefinition ) ;
    public final EObject rulePackagedElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;

        EObject this_FeatureDefinition_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:358:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub | this_FeatureDefinition_2= ruleFeatureDefinition ) )
            // InternalAlf.g:359:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub | this_FeatureDefinition_2= ruleFeatureDefinition )
            {
            // InternalAlf.g:359:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub | this_FeatureDefinition_2= ruleFeatureDefinition )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 20:
            case 22:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 18:
            case 21:
            case 25:
            case 31:
            case 32:
            case 33:
            case 51:
            case 52:
            case 53:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAlf.g:360:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getPackagedElementDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDefinitionOrStub_0=rulePackageDefinitionOrStub();

                    state._fsp--;


                    			current = this_PackageDefinitionOrStub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:369:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getPackagedElementDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassifierDefinitionOrStub_1=ruleClassifierDefinitionOrStub();

                    state._fsp--;


                    			current = this_ClassifierDefinitionOrStub_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:378:3: this_FeatureDefinition_2= ruleFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getPackagedElementDefinitionAccess().getFeatureDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureDefinition_2=ruleFeatureDefinition();

                    state._fsp--;


                    			current = this_FeatureDefinition_2;
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
    // $ANTLR end "rulePackagedElementDefinition"


    // $ANTLR start "entryRuleClassifierDefinitionOrStub"
    // InternalAlf.g:390:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:390:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:391:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:397:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:403:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub )
            // InternalAlf.g:404:2: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
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
    // InternalAlf.g:415:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:415:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:416:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalAlf.g:422:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_membership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_membership_5_0 = null;

        EObject lv_membership_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:428:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_membership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:429:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_membership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:429:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_membership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:430:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_membership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:430:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:431:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:431:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:432:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,22,FOLLOW_10); 

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
            		
            // InternalAlf.g:448:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:449:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:449:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:450:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalAlf.g:467:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_membership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18||LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:468:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_membership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:468:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==23) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAlf.g:469:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:474:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:479:4: ( (lv_membership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:480:5: (lv_membership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:480:5: (lv_membership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:481:6: lv_membership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_membership_5_0=ruleOwnedGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"membership",
                    							lv_membership_5_0,
                    							"org.omg.sysml.Alf.OwnedGeneralization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:498:4: (otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAlf.g:499:5: otherlv_6= ',' ( (lv_membership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:503:5: ( (lv_membership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:504:6: (lv_membership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:504:6: (lv_membership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:505:7: lv_membership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_membership_7_0=ruleOwnedGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"membership",
                    	    								lv_membership_7_0,
                    	    								"org.omg.sysml.Alf.OwnedGeneralization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
    // InternalAlf.g:528:1: entryRuleOwnedGeneralization returns [EObject current=null] : iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF ;
    public final EObject entryRuleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedGeneralization = null;


        try {
            // InternalAlf.g:528:60: (iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF )
            // InternalAlf.g:529:2: iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF
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
    // InternalAlf.g:535:1: ruleOwnedGeneralization returns [EObject current=null] : ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) ;
    public final EObject ruleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:541:2: ( ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) )
            // InternalAlf.g:542:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            {
            // InternalAlf.g:542:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            // InternalAlf.g:543:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            {
            // InternalAlf.g:543:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            // InternalAlf.g:544:4: lv_ownedMemberElement_0_0= ruleGeneralization
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
    // InternalAlf.g:564:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:564:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:565:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:571:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:577:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:578:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:578:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:579:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:579:3: ( ruleQualifiedName )
            // InternalAlf.g:580:4: ruleQualifiedName
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
    // InternalAlf.g:597:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:597:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:598:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalAlf.g:604:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_membership_2_0= ruleMemberDefinition ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_membership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:610:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_membership_2_0= ruleMemberDefinition ) )* otherlv_3= '}' ) )
            // InternalAlf.g:611:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_membership_2_0= ruleMemberDefinition ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:611:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_membership_2_0= ruleMemberDefinition ) )* otherlv_3= '}' )
            // InternalAlf.g:612:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_membership_2_0= ruleMemberDefinition ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:624:3: ( (lv_membership_2_0= ruleMemberDefinition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_UNRESTRICTED_NAME)||LA13_0==15||LA13_0==18||(LA13_0>=20 && LA13_0<=22)||LA13_0==25||(LA13_0>=31 && LA13_0<=33)||(LA13_0>=47 && LA13_0<=53)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAlf.g:625:4: (lv_membership_2_0= ruleMemberDefinition )
            	    {
            	    // InternalAlf.g:625:4: (lv_membership_2_0= ruleMemberDefinition )
            	    // InternalAlf.g:626:5: lv_membership_2_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_membership_2_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"membership",
            	    						lv_membership_2_0,
            	    						"org.omg.sysml.Alf.MemberDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalAlf.g:651:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:651:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:652:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:658:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:664:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:665:2: this_ClassDefinition_0= ruleClassDefinition
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


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:676:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:676:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:677:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:683:1: ruleFeatureDefinition returns [EObject current=null] : (this_BasicFeatureDefinition_0= ruleBasicFeatureDefinition | this_ConnectorDefinition_1= ruleConnectorDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_BasicFeatureDefinition_0 = null;

        EObject this_ConnectorDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:689:2: ( (this_BasicFeatureDefinition_0= ruleBasicFeatureDefinition | this_ConnectorDefinition_1= ruleConnectorDefinition ) )
            // InternalAlf.g:690:2: (this_BasicFeatureDefinition_0= ruleBasicFeatureDefinition | this_ConnectorDefinition_1= ruleConnectorDefinition )
            {
            // InternalAlf.g:690:2: (this_BasicFeatureDefinition_0= ruleBasicFeatureDefinition | this_ConnectorDefinition_1= ruleConnectorDefinition )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)||LA14_0==18||LA14_0==21||LA14_0==25||(LA14_0>=31 && LA14_0<=32)||(LA14_0>=51 && LA14_0<=53)) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:691:3: this_BasicFeatureDefinition_0= ruleBasicFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getBasicFeatureDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicFeatureDefinition_0=ruleBasicFeatureDefinition();

                    state._fsp--;


                    			current = this_BasicFeatureDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:700:3: this_ConnectorDefinition_1= ruleConnectorDefinition
                    {

                    			newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getConnectorDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectorDefinition_1=ruleConnectorDefinition();

                    state._fsp--;


                    			current = this_ConnectorDefinition_1;
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


    // $ANTLR start "entryRuleBasicFeatureDefinition"
    // InternalAlf.g:712:1: entryRuleBasicFeatureDefinition returns [EObject current=null] : iv_ruleBasicFeatureDefinition= ruleBasicFeatureDefinition EOF ;
    public final EObject entryRuleBasicFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicFeatureDefinition = null;


        try {
            // InternalAlf.g:712:63: (iv_ruleBasicFeatureDefinition= ruleBasicFeatureDefinition EOF )
            // InternalAlf.g:713:2: iv_ruleBasicFeatureDefinition= ruleBasicFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getBasicFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicFeatureDefinition=ruleBasicFeatureDefinition();

            state._fsp--;

             current =iv_ruleBasicFeatureDefinition; 
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
    // $ANTLR end "entryRuleBasicFeatureDefinition"


    // $ANTLR start "ruleBasicFeatureDefinition"
    // InternalAlf.g:719:1: ruleBasicFeatureDefinition returns [EObject current=null] : ( (otherlv_0= 'feature' | ( (lv_isPort_1_0= 'port' ) ) )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( ( ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) ) ) | ( ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) ) ) ) ) ;
    public final EObject ruleBasicFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isPort_1_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Enumerator lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_membership_6_0 = null;

        EObject lv_lower_8_0 = null;

        EObject lv_upper_10_0 = null;

        EObject lv_value_13_0 = null;

        EObject lv_membership_16_0 = null;

        AntlrDatatypeRuleToken lv_name_18_0 = null;

        EObject lv_membership_19_0 = null;

        EObject lv_lower_21_0 = null;

        EObject lv_upper_23_0 = null;

        EObject lv_value_26_0 = null;

        EObject lv_membership_29_0 = null;

        EObject lv_lower_32_0 = null;

        EObject lv_upper_34_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:725:2: ( ( (otherlv_0= 'feature' | ( (lv_isPort_1_0= 'port' ) ) )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( ( ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) ) ) | ( ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) ) ) ) ) )
            // InternalAlf.g:726:2: ( (otherlv_0= 'feature' | ( (lv_isPort_1_0= 'port' ) ) )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( ( ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) ) ) | ( ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) ) ) ) )
            {
            // InternalAlf.g:726:2: ( (otherlv_0= 'feature' | ( (lv_isPort_1_0= 'port' ) ) )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( ( ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) ) ) | ( ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) ) ) ) )
            // InternalAlf.g:727:3: (otherlv_0= 'feature' | ( (lv_isPort_1_0= 'port' ) ) )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( ( ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) ) ) | ( ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) ) ) )
            {
            // InternalAlf.g:727:3: (otherlv_0= 'feature' | ( (lv_isPort_1_0= 'port' ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:728:4: otherlv_0= 'feature'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getBasicFeatureDefinitionAccess().getFeatureKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:733:4: ( (lv_isPort_1_0= 'port' ) )
                    {
                    // InternalAlf.g:733:4: ( (lv_isPort_1_0= 'port' ) )
                    // InternalAlf.g:734:5: (lv_isPort_1_0= 'port' )
                    {
                    // InternalAlf.g:734:5: (lv_isPort_1_0= 'port' )
                    // InternalAlf.g:735:6: lv_isPort_1_0= 'port'
                    {
                    lv_isPort_1_0=(Token)match(input,25,FOLLOW_13); 

                    						newLeafNode(lv_isPort_1_0, grammarAccess.getBasicFeatureDefinitionAccess().getIsPortPortKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicFeatureDefinitionRule());
                    						}
                    						setWithLastConsumed(current, "isPort", true, "port");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlf.g:748:3: ( (lv_direction_2_0= ruleFeatureDirection ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=51 && LA16_0<=53)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlf.g:749:4: (lv_direction_2_0= ruleFeatureDirection )
                    {
                    // InternalAlf.g:749:4: (lv_direction_2_0= ruleFeatureDirection )
                    // InternalAlf.g:750:5: lv_direction_2_0= ruleFeatureDirection
                    {

                    					newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getDirectionFeatureDirectionEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_direction_2_0=ruleFeatureDirection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
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

            // InternalAlf.g:767:3: ( ( ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) ) ) | ( ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) ) ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==16||LA31_1==19||(LA31_1>=26 && LA31_1<=27)||LA31_1==30) ) {
                    alt31=1;
                }
                else if ( (LA31_1==18||(LA31_1>=31 && LA31_1<=32)) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==16||LA31_2==19||(LA31_2>=26 && LA31_2<=27)||LA31_2==30) ) {
                    alt31=1;
                }
                else if ( (LA31_2==18||(LA31_2>=31 && LA31_2<=32)) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
            case 31:
            case 32:
                {
                alt31=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAlf.g:768:4: ( ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) ) )
                    {
                    // InternalAlf.g:768:4: ( ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) ) )
                    // InternalAlf.g:769:5: ( (lv_name_3_0= ruleName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )? ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) )
                    {
                    // InternalAlf.g:769:5: ( (lv_name_3_0= ruleName ) )
                    // InternalAlf.g:770:6: (lv_name_3_0= ruleName )
                    {
                    // InternalAlf.g:770:6: (lv_name_3_0= ruleName )
                    // InternalAlf.g:771:7: lv_name_3_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getNameNameParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_name_3_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:788:5: (otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )? )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==26) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAlf.g:789:6: otherlv_4= ':' ( ( ruleQualifiedName ) ) ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )?
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_3); 

                            						newLeafNode(otherlv_4, grammarAccess.getBasicFeatureDefinitionAccess().getColonKeyword_2_0_1_0());
                            					
                            // InternalAlf.g:793:6: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:794:7: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:794:7: ( ruleQualifiedName )
                            // InternalAlf.g:795:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBasicFeatureDefinitionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getReferencedTypeClassCrossReference_2_0_1_1_0());
                            							
                            pushFollow(FOLLOW_15);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalAlf.g:809:6: ( (lv_membership_6_0= ruleOwnedRedefinitionOrSubset ) )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==18||(LA17_0>=31 && LA17_0<=32)) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // InternalAlf.g:810:7: (lv_membership_6_0= ruleOwnedRedefinitionOrSubset )
                                    {
                                    // InternalAlf.g:810:7: (lv_membership_6_0= ruleOwnedRedefinitionOrSubset )
                                    // InternalAlf.g:811:8: lv_membership_6_0= ruleOwnedRedefinitionOrSubset
                                    {

                                    								newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipOwnedRedefinitionOrSubsetParserRuleCall_2_0_1_2_0());
                                    							
                                    pushFollow(FOLLOW_16);
                                    lv_membership_6_0=ruleOwnedRedefinitionOrSubset();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                                    								}
                                    								add(
                                    									current,
                                    									"membership",
                                    									lv_membership_6_0,
                                    									"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:829:5: (otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==27) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAlf.g:830:6: otherlv_7= '[' ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )? ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,27,FOLLOW_17); 

                            						newLeafNode(otherlv_7, grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0_2_0());
                            					
                            // InternalAlf.g:834:6: ( ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..' )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==RULE_NATURAL_VALUE) ) {
                                int LA19_1 = input.LA(2);

                                if ( (LA19_1==28) ) {
                                    alt19=1;
                                }
                            }
                            switch (alt19) {
                                case 1 :
                                    // InternalAlf.g:835:7: ( (lv_lower_8_0= ruleNaturalLiteralExpression ) ) otherlv_9= '..'
                                    {
                                    // InternalAlf.g:835:7: ( (lv_lower_8_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:836:8: (lv_lower_8_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:836:8: (lv_lower_8_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:837:9: lv_lower_8_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_0_2_1_0_0());
                                    								
                                    pushFollow(FOLLOW_18);
                                    lv_lower_8_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_8_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_9=(Token)match(input,28,FOLLOW_17); 

                                    							newLeafNode(otherlv_9, grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_0_2_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:859:6: ( (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:860:7: (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:860:7: (lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:861:8: lv_upper_10_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0_2_2_0());
                            							
                            pushFollow(FOLLOW_19);
                            lv_upper_10_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_10_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_11=(Token)match(input,29,FOLLOW_20); 

                            						newLeafNode(otherlv_11, grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_0_2_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:883:5: ( ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' ) | (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==19||LA23_0==30) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==16) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:884:6: ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' )
                            {
                            // InternalAlf.g:884:6: ( (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';' )
                            // InternalAlf.g:885:7: (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )? otherlv_14= ';'
                            {
                            // InternalAlf.g:885:7: (otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) ) )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==30) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // InternalAlf.g:886:8: otherlv_12= '=' ( (lv_value_13_0= ruleExpression ) )
                                    {
                                    otherlv_12=(Token)match(input,30,FOLLOW_21); 

                                    								newLeafNode(otherlv_12, grammarAccess.getBasicFeatureDefinitionAccess().getEqualsSignKeyword_2_0_3_0_0_0());
                                    							
                                    // InternalAlf.g:890:8: ( (lv_value_13_0= ruleExpression ) )
                                    // InternalAlf.g:891:9: (lv_value_13_0= ruleExpression )
                                    {
                                    // InternalAlf.g:891:9: (lv_value_13_0= ruleExpression )
                                    // InternalAlf.g:892:10: lv_value_13_0= ruleExpression
                                    {

                                    										newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_0_3_0_0_1_0());
                                    									
                                    pushFollow(FOLLOW_9);
                                    lv_value_13_0=ruleExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"value",
                                    											lv_value_13_0,
                                    											"org.omg.sysml.Alf.Expression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_14=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(otherlv_14, grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_0_3_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:916:6: (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' )
                            {
                            // InternalAlf.g:916:6: (otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}' )
                            // InternalAlf.g:917:7: otherlv_15= '{' ( (lv_membership_16_0= ruleMemberDefinition ) )* otherlv_17= '}'
                            {
                            otherlv_15=(Token)match(input,16,FOLLOW_5); 

                            							newLeafNode(otherlv_15, grammarAccess.getBasicFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_3_1_0());
                            						
                            // InternalAlf.g:921:7: ( (lv_membership_16_0= ruleMemberDefinition ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_UNRESTRICTED_NAME)||LA22_0==15||LA22_0==18||(LA22_0>=20 && LA22_0<=22)||LA22_0==25||(LA22_0>=31 && LA22_0<=33)||(LA22_0>=47 && LA22_0<=53)) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalAlf.g:922:8: (lv_membership_16_0= ruleMemberDefinition )
                            	    {
                            	    // InternalAlf.g:922:8: (lv_membership_16_0= ruleMemberDefinition )
                            	    // InternalAlf.g:923:9: lv_membership_16_0= ruleMemberDefinition
                            	    {

                            	    									newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_0_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_5);
                            	    lv_membership_16_0=ruleMemberDefinition();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"membership",
                            	    										lv_membership_16_0,
                            	    										"org.omg.sysml.Alf.MemberDefinition");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            otherlv_17=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(otherlv_17, grammarAccess.getBasicFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_3_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:948:4: ( ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) ) )
                    {
                    // InternalAlf.g:948:4: ( ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) ) )
                    // InternalAlf.g:949:5: ( (lv_name_18_0= ruleName ) )? ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) )
                    {
                    // InternalAlf.g:949:5: ( (lv_name_18_0= ruleName ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:950:6: (lv_name_18_0= ruleName )
                            {
                            // InternalAlf.g:950:6: (lv_name_18_0= ruleName )
                            // InternalAlf.g:951:7: lv_name_18_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getNameNameParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_name_18_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_18_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:968:5: ( (lv_membership_19_0= ruleOwnedRedefinitionOrSubset ) )
                    // InternalAlf.g:969:6: (lv_membership_19_0= ruleOwnedRedefinitionOrSubset )
                    {
                    // InternalAlf.g:969:6: (lv_membership_19_0= ruleOwnedRedefinitionOrSubset )
                    // InternalAlf.g:970:7: lv_membership_19_0= ruleOwnedRedefinitionOrSubset
                    {

                    							newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipOwnedRedefinitionOrSubsetParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_membership_19_0=ruleOwnedRedefinitionOrSubset();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"membership",
                    								lv_membership_19_0,
                    								"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:987:5: ( ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) ) | (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' ) )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==27) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==RULE_NATURAL_VALUE) ) {
                            int LA30_3 = input.LA(3);

                            if ( (LA30_3==28) ) {
                                int LA30_5 = input.LA(4);

                                if ( (LA30_5==RULE_NATURAL_VALUE) ) {
                                    int LA30_7 = input.LA(5);

                                    if ( (LA30_7==29) ) {
                                        int LA30_6 = input.LA(6);

                                        if ( (LA30_6==16||LA30_6==30) ) {
                                            alt30=1;
                                        }
                                        else if ( (LA30_6==19) ) {
                                            alt30=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 30, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 30, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA30_5==38) ) {
                                    int LA30_4 = input.LA(5);

                                    if ( (LA30_4==29) ) {
                                        int LA30_6 = input.LA(6);

                                        if ( (LA30_6==16||LA30_6==30) ) {
                                            alt30=1;
                                        }
                                        else if ( (LA30_6==19) ) {
                                            alt30=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 30, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 30, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 30, 5, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA30_3==29) ) {
                                int LA30_6 = input.LA(4);

                                if ( (LA30_6==16||LA30_6==30) ) {
                                    alt30=1;
                                }
                                else if ( (LA30_6==19) ) {
                                    alt30=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 30, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA30_1==38) ) {
                            int LA30_4 = input.LA(3);

                            if ( (LA30_4==29) ) {
                                int LA30_6 = input.LA(4);

                                if ( (LA30_6==16||LA30_6==30) ) {
                                    alt30=1;
                                }
                                else if ( (LA30_6==19) ) {
                                    alt30=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 30, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA30_0==16||LA30_0==30) ) {
                        alt30=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAlf.g:988:6: ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) )
                            {
                            // InternalAlf.g:988:6: ( (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) ) )
                            // InternalAlf.g:989:7: (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )? ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) )
                            {
                            // InternalAlf.g:989:7: (otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']' )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==27) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalAlf.g:990:8: otherlv_20= '[' ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )? ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_24= ']'
                                    {
                                    otherlv_20=(Token)match(input,27,FOLLOW_17); 

                                    								newLeafNode(otherlv_20, grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_2_0_0_0());
                                    							
                                    // InternalAlf.g:994:8: ( ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..' )?
                                    int alt25=2;
                                    int LA25_0 = input.LA(1);

                                    if ( (LA25_0==RULE_NATURAL_VALUE) ) {
                                        int LA25_1 = input.LA(2);

                                        if ( (LA25_1==28) ) {
                                            alt25=1;
                                        }
                                    }
                                    switch (alt25) {
                                        case 1 :
                                            // InternalAlf.g:995:9: ( (lv_lower_21_0= ruleNaturalLiteralExpression ) ) otherlv_22= '..'
                                            {
                                            // InternalAlf.g:995:9: ( (lv_lower_21_0= ruleNaturalLiteralExpression ) )
                                            // InternalAlf.g:996:10: (lv_lower_21_0= ruleNaturalLiteralExpression )
                                            {
                                            // InternalAlf.g:996:10: (lv_lower_21_0= ruleNaturalLiteralExpression )
                                            // InternalAlf.g:997:11: lv_lower_21_0= ruleNaturalLiteralExpression
                                            {

                                            											newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_2_0_0_1_0_0());
                                            										
                                            pushFollow(FOLLOW_18);
                                            lv_lower_21_0=ruleNaturalLiteralExpression();

                                            state._fsp--;


                                            											if (current==null) {
                                            												current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                                            											}
                                            											set(
                                            												current,
                                            												"lower",
                                            												lv_lower_21_0,
                                            												"org.omg.sysml.Alf.NaturalLiteralExpression");
                                            											afterParserOrEnumRuleCall();
                                            										

                                            }


                                            }

                                            otherlv_22=(Token)match(input,28,FOLLOW_17); 

                                            									newLeafNode(otherlv_22, grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_2_0_0_1_1());
                                            								

                                            }
                                            break;

                                    }

                                    // InternalAlf.g:1019:8: ( (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression ) )
                                    // InternalAlf.g:1020:9: (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:1020:9: (lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression )
                                    // InternalAlf.g:1021:10: lv_upper_23_0= ruleUnlimitedNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_0_0_2_0());
                                    									
                                    pushFollow(FOLLOW_19);
                                    lv_upper_23_0=ruleUnlimitedNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"upper",
                                    											lv_upper_23_0,
                                    											"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_24=(Token)match(input,29,FOLLOW_23); 

                                    								newLeafNode(otherlv_24, grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_2_0_0_3());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:1043:7: ( (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' ) | (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' ) )
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==30) ) {
                                alt28=1;
                            }
                            else if ( (LA28_0==16) ) {
                                alt28=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 28, 0, input);

                                throw nvae;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalAlf.g:1044:8: (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' )
                                    {
                                    // InternalAlf.g:1044:8: (otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';' )
                                    // InternalAlf.g:1045:9: otherlv_25= '=' ( (lv_value_26_0= ruleExpression ) ) otherlv_27= ';'
                                    {
                                    otherlv_25=(Token)match(input,30,FOLLOW_21); 

                                    									newLeafNode(otherlv_25, grammarAccess.getBasicFeatureDefinitionAccess().getEqualsSignKeyword_2_1_2_0_1_0_0());
                                    								
                                    // InternalAlf.g:1049:9: ( (lv_value_26_0= ruleExpression ) )
                                    // InternalAlf.g:1050:10: (lv_value_26_0= ruleExpression )
                                    {
                                    // InternalAlf.g:1050:10: (lv_value_26_0= ruleExpression )
                                    // InternalAlf.g:1051:11: lv_value_26_0= ruleExpression
                                    {

                                    											newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_1_2_0_1_0_1_0());
                                    										
                                    pushFollow(FOLLOW_9);
                                    lv_value_26_0=ruleExpression();

                                    state._fsp--;


                                    											if (current==null) {
                                    												current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                                    											}
                                    											set(
                                    												current,
                                    												"value",
                                    												lv_value_26_0,
                                    												"org.omg.sysml.Alf.Expression");
                                    											afterParserOrEnumRuleCall();
                                    										

                                    }


                                    }

                                    otherlv_27=(Token)match(input,19,FOLLOW_2); 

                                    									newLeafNode(otherlv_27, grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_1_2_0_1_0_2());
                                    								

                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1074:8: (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' )
                                    {
                                    // InternalAlf.g:1074:8: (otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}' )
                                    // InternalAlf.g:1075:9: otherlv_28= '{' ( (lv_membership_29_0= ruleMemberDefinition ) )* otherlv_30= '}'
                                    {
                                    otherlv_28=(Token)match(input,16,FOLLOW_5); 

                                    									newLeafNode(otherlv_28, grammarAccess.getBasicFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_1_2_0_1_1_0());
                                    								
                                    // InternalAlf.g:1079:9: ( (lv_membership_29_0= ruleMemberDefinition ) )*
                                    loop27:
                                    do {
                                        int alt27=2;
                                        int LA27_0 = input.LA(1);

                                        if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)||LA27_0==15||LA27_0==18||(LA27_0>=20 && LA27_0<=22)||LA27_0==25||(LA27_0>=31 && LA27_0<=33)||(LA27_0>=47 && LA27_0<=53)) ) {
                                            alt27=1;
                                        }


                                        switch (alt27) {
                                    	case 1 :
                                    	    // InternalAlf.g:1080:10: (lv_membership_29_0= ruleMemberDefinition )
                                    	    {
                                    	    // InternalAlf.g:1080:10: (lv_membership_29_0= ruleMemberDefinition )
                                    	    // InternalAlf.g:1081:11: lv_membership_29_0= ruleMemberDefinition
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_1_2_0_1_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_5);
                                    	    lv_membership_29_0=ruleMemberDefinition();

                                    	    state._fsp--;


                                    	    											if (current==null) {
                                    	    												current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                                    	    											}
                                    	    											add(
                                    	    												current,
                                    	    												"membership",
                                    	    												lv_membership_29_0,
                                    	    												"org.omg.sysml.Alf.MemberDefinition");
                                    	    											afterParserOrEnumRuleCall();
                                    	    										

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop27;
                                        }
                                    } while (true);

                                    otherlv_30=(Token)match(input,17,FOLLOW_2); 

                                    									newLeafNode(otherlv_30, grammarAccess.getBasicFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_1_2_0_1_1_2());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1106:6: (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' )
                            {
                            // InternalAlf.g:1106:6: (otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';' )
                            // InternalAlf.g:1107:7: otherlv_31= '[' ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )? ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_35= ']' otherlv_36= ';'
                            {
                            otherlv_31=(Token)match(input,27,FOLLOW_17); 

                            							newLeafNode(otherlv_31, grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
                            						
                            // InternalAlf.g:1111:7: ( ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..' )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==RULE_NATURAL_VALUE) ) {
                                int LA29_1 = input.LA(2);

                                if ( (LA29_1==28) ) {
                                    alt29=1;
                                }
                            }
                            switch (alt29) {
                                case 1 :
                                    // InternalAlf.g:1112:8: ( (lv_lower_32_0= ruleNaturalLiteralExpression ) ) otherlv_33= '..'
                                    {
                                    // InternalAlf.g:1112:8: ( (lv_lower_32_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:1113:9: (lv_lower_32_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:1113:9: (lv_lower_32_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:1114:10: lv_lower_32_0= ruleNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_2_1_1_0_0());
                                    									
                                    pushFollow(FOLLOW_18);
                                    lv_lower_32_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"lower",
                                    											lv_lower_32_0,
                                    											"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_33=(Token)match(input,28,FOLLOW_17); 

                                    								newLeafNode(otherlv_33, grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_2_1_1_1());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:1136:7: ( (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:1137:8: (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:1137:8: (lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:1138:9: lv_upper_34_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            									newCompositeNode(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_1_2_0());
                            								
                            pushFollow(FOLLOW_19);
                            lv_upper_34_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getBasicFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"upper",
                            										lv_upper_34_0,
                            										"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_35=(Token)match(input,29,FOLLOW_9); 

                            							newLeafNode(otherlv_35, grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_2_1_3());
                            						
                            otherlv_36=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(otherlv_36, grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_1_2_1_4());
                            						

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
    // $ANTLR end "ruleBasicFeatureDefinition"


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:1171:1: entryRuleOwnedRedefinitionOrSubset returns [EObject current=null] : iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF ;
    public final EObject entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedRedefinitionOrSubset = null;


        try {
            // InternalAlf.g:1171:66: (iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:1172:2: iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF
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
    // InternalAlf.g:1178:1: ruleOwnedRedefinitionOrSubset returns [EObject current=null] : ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) ;
    public final EObject ruleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1184:2: ( ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) )
            // InternalAlf.g:1185:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            {
            // InternalAlf.g:1185:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18||LA33_0==31) ) {
                alt33=1;
            }
            else if ( (LA33_0==32) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1186:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    {
                    // InternalAlf.g:1186:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    // InternalAlf.g:1187:4: (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    {
                    // InternalAlf.g:1187:4: (otherlv_0= 'is' | otherlv_1= 'redefines' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==18) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==31) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalAlf.g:1188:5: otherlv_0= 'is'
                            {
                            otherlv_0=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_0, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1193:5: otherlv_1= 'redefines'
                            {
                            otherlv_1=(Token)match(input,31,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1198:4: ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    // InternalAlf.g:1199:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    {
                    // InternalAlf.g:1199:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    // InternalAlf.g:1200:6: lv_ownedMemberElement_2_0= ruleRedefinition
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
                    // InternalAlf.g:1219:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    {
                    // InternalAlf.g:1219:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    // InternalAlf.g:1220:4: otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0());
                    			
                    // InternalAlf.g:1224:4: ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    // InternalAlf.g:1225:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    {
                    // InternalAlf.g:1225:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    // InternalAlf.g:1226:6: lv_ownedMemberElement_4_0= ruleSubset
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
    // InternalAlf.g:1248:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:1248:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:1249:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:1255:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1261:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1262:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1262:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1263:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1263:3: ( ruleQualifiedName )
            // InternalAlf.g:1264:4: ruleQualifiedName
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
    // InternalAlf.g:1281:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:1281:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:1282:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:1288:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1294:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1295:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1295:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1296:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1296:3: ( ruleQualifiedName )
            // InternalAlf.g:1297:4: ruleQualifiedName
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
    // InternalAlf.g:1314:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:1314:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:1315:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:1321:1: ruleConnectorDefinition returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1327:2: ( (otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) )
            // InternalAlf.g:1328:2: (otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            {
            // InternalAlf.g:1328:2: (otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            // InternalAlf.g:1329:3: otherlv_0= 'connector' ( (lv_name_1_0= ruleName ) )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorDefinitionAccess().getConnectorKeyword_0());
            		
            // InternalAlf.g:1333:3: ( (lv_name_1_0= ruleName ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1>=RULE_ID && LA34_1<=RULE_UNRESTRICTED_NAME)) ) {
                    alt34=1;
                }
            }
            else if ( (LA34_0==RULE_UNRESTRICTED_NAME) ) {
                int LA34_2 = input.LA(2);

                if ( ((LA34_2>=RULE_ID && LA34_2<=RULE_UNRESTRICTED_NAME)) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalAlf.g:1334:4: (lv_name_1_0= ruleName )
                    {
                    // InternalAlf.g:1334:4: (lv_name_1_0= ruleName )
                    // InternalAlf.g:1335:5: lv_name_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.omg.sysml.Alf.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:1352:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1353:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:1353:4: ( ruleQualifiedName )
            // InternalAlf.g:1354:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourcePathFeatureCrossReference_2_0());
            				
            pushFollow(FOLLOW_24);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalAlf.g:1372:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1373:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:1373:4: ( ruleQualifiedName )
            // InternalAlf.g:1374:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getTargetPathFeatureCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_5());
            		

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
    // InternalAlf.g:1396:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:1396:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:1397:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:1403:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1409:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:1410:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:1421:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:1421:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:1422:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:1428:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:1434:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:1435:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:1435:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:1436:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:1444:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=35 && LA36_0<=40)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:1445:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:1445:4: ()
                    // InternalAlf.g:1446:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:1452:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=36 && LA35_0<=40)) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==35) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAlf.g:1453:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:1453:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:1454:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:1454:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:1455:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:1455:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:1456:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_21);
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

                            // InternalAlf.g:1473:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:1474:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:1474:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:1475:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:1494:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:1494:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:1495:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:1495:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:1496:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:1496:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:1497:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,35,FOLLOW_26); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,27,FOLLOW_21); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:1513:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:1514:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:1514:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:1515:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_19);
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

                            otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalAlf.g:1543:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:1543:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:1544:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:1550:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:1556:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:1557:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:1557:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt37=1;
                }
                break;
            case 37:
                {
                alt37=2;
                }
                break;
            case 38:
                {
                alt37=3;
                }
                break;
            case 39:
                {
                alt37=4;
                }
                break;
            case 40:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalAlf.g:1558:3: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1564:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:1570:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:1576:3: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:1582:3: kw= '^'
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
    // InternalAlf.g:1591:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:1591:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:1592:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:1598:1: ruleUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1604:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // InternalAlf.g:1605:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // InternalAlf.g:1605:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_BOOLEAN_VALUE && LA38_0<=RULE_UNRESTRICTED_NAME)||LA38_0==16||LA38_0==38||LA38_0==41||(LA38_0>=43 && LA38_0<=44)) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=36 && LA38_0<=37)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:1606:3: this_PrimaryExpression_0= rulePrimaryExpression
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
                    // InternalAlf.g:1615:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // InternalAlf.g:1615:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // InternalAlf.g:1616:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // InternalAlf.g:1616:4: ()
                    // InternalAlf.g:1617:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:1623:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:1624:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:1624:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:1625:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalAlf.g:1642:4: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // InternalAlf.g:1643:5: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // InternalAlf.g:1643:5: (lv_operand_3_0= rulePrimaryExpression )
                    // InternalAlf.g:1644:6: lv_operand_3_0= rulePrimaryExpression
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
    // InternalAlf.g:1666:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:1666:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:1667:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:1673:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:1679:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:1680:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:1680:2: (kw= '+' | kw= '-' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            else if ( (LA39_0==37) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:1681:3: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1687:3: kw= '-'
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
    // InternalAlf.g:1696:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:1696:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:1697:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:1703:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:1709:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:1710:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:1710:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt40=5;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:1711:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:1720:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:1729:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:1738:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:1747:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:1747:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:1748:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_28);
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
    // InternalAlf.g:1769:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:1769:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:1770:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:1776:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1782:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1783:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1783:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1784:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1784:3: ( ruleQualifiedName )
            // InternalAlf.g:1785:4: ruleQualifiedName
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
    // InternalAlf.g:1802:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:1802:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:1803:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:1809:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1815:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:1816:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:1816:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:1817:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:1817:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1818:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:1818:4: ( ruleQualifiedName )
            // InternalAlf.g:1819:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_29);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:1837:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_BOOLEAN_VALUE && LA42_0<=RULE_UNRESTRICTED_NAME)||LA42_0==16||(LA42_0>=36 && LA42_0<=38)||LA42_0==41||(LA42_0>=43 && LA42_0<=44)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:1838:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:1838:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:1839:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:1839:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:1840:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    // InternalAlf.g:1857:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==24) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalAlf.g:1858:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:1862:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:1863:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:1863:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:1864:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop41;
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
    // InternalAlf.g:1891:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:1891:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:1892:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:1898:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1904:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:1905:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:1905:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:1906:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:1906:3: ()
            // InternalAlf.g:1907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1917:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_BOOLEAN_VALUE && LA44_0<=RULE_UNRESTRICTED_NAME)||LA44_0==16||(LA44_0>=36 && LA44_0<=38)||LA44_0==41||(LA44_0>=43 && LA44_0<=44)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:1918:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:1918:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:1919:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:1919:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:1920:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalAlf.g:1937:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==24) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalAlf.g:1938:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:1942:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:1943:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:1943:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:1944:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop43;
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
    // InternalAlf.g:1971:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:1971:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:1972:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:1978:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:1984:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:1985:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:1985:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt45=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt45=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt45=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA45_4 = input.LA(2);

                if ( (LA45_4==EOF||LA45_4==17||LA45_4==19||LA45_4==24||LA45_4==29||(LA45_4>=35 && LA45_4<=40)||LA45_4==42) ) {
                    alt45=5;
                }
                else if ( (LA45_4==44) ) {
                    alt45=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 4, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt45=4;
                }
                break;
            case 38:
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
                    // InternalAlf.g:1986:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:1995:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:2004:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:2013:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:2022:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:2034:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:2034:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:2035:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:2041:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:2047:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:2048:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:2048:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:2049:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:2049:3: ()
            // InternalAlf.g:2050:4: 
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
    // InternalAlf.g:2064:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:2064:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:2065:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:2071:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2077:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:2078:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:2078:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:2079:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:2079:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:2080:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:2099:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:2099:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:2100:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:2106:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2112:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:2113:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:2113:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:2114:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:2114:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:2115:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:2134:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:2134:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:2135:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:2141:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2147:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:2148:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:2148:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:2149:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:2149:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:2150:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:2170:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:2170:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:2171:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:2177:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:2183:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:2184:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:2184:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:2185:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:2185:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_NATURAL_VALUE) ) {
                alt47=1;
            }
            else if ( (LA47_0==44) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:2186:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:2186:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:2187:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_34); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,44,FOLLOW_35); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:2199:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_NATURAL_VALUE) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalAlf.g:2200:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_36); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2210:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:2210:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:2211:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,44,FOLLOW_37); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_36); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:2225:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=45 && LA50_0<=46)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:2226:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:2226:4: (kw= 'e' | kw= 'E' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==45) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==46) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalAlf.g:2227:5: kw= 'e'
                            {
                            kw=(Token)match(input,45,FOLLOW_38); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2233:5: kw= 'E'
                            {
                            kw=(Token)match(input,46,FOLLOW_38); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2239:4: (kw= '+' | kw= '-' )?
                    int alt49=3;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==36) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==37) ) {
                        alt49=2;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalAlf.g:2240:5: kw= '+'
                            {
                            kw=(Token)match(input,36,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2246:5: kw= '-'
                            {
                            kw=(Token)match(input,37,FOLLOW_37); 

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
    // InternalAlf.g:2264:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:2264:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:2265:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:2271:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:2277:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:2278:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:2278:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:2279:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:2279:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:2280:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:2299:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:2299:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:2300:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:2306:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2312:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:2313:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:2313:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_NATURAL_VALUE) ) {
                alt51=1;
            }
            else if ( (LA51_0==38) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:2314:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:2323:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:2323:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:2324:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:2324:4: ()
                    // InternalAlf.g:2325:5: 
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
    // InternalAlf.g:2340:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:2340:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:2341:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:2347:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:2353:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:2354:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:2354:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_UNRESTRICTED_NAME) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:2355:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2363:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:2374:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:2374:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:2375:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:2381:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2387:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalAlf.g:2388:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:2388:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalAlf.g:2389:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2399:3: (kw= '.' this_Name_2= ruleName )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==44) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAlf.g:2400:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,44,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_39);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalAlf.g:2420:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:2426:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:2427:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:2427:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt54=1;
                }
                break;
            case 48:
                {
                alt54=2;
                }
                break;
            case 49:
                {
                alt54=3;
                }
                break;
            case 50:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalAlf.g:2428:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:2428:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:2429:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2436:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:2436:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:2437:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2444:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:2444:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:2445:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2452:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:2452:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:2453:4: enumLiteral_3= 'packaged'
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
    // InternalAlf.g:2463:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:2469:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:2470:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:2470:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt55=1;
                }
                break;
            case 52:
                {
                alt55=2;
                }
                break;
            case 53:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2471:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:2471:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:2472:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2479:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:2479:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:2480:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2487:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:2487:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:2488:4: enumLiteral_2= 'inout'
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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\2\7\1\uffff\2\7\2\20\1\7\2\20\1\uffff\4\20\2\7\4\20\1\7\2\20";
    static final String dfa_3s = "\1\65\1\22\1\uffff\1\22\1\65\2\40\1\10\2\22\1\uffff\2\27\2\54\2\10\4\54\1\10\2\54";
    static final String dfa_4s = "\2\uffff\1\1\7\uffff\1\2\15\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\6\6\uffff\1\1\2\uffff\1\7\1\uffff\1\3\1\4\1\2\2\uffff\1\2\5\uffff\3\2\21\uffff\3\2",
            "\1\10\1\11\11\uffff\1\12",
            "",
            "\1\13\1\14\11\uffff\1\12",
            "\1\5\1\6\11\uffff\1\7\14\uffff\2\2\22\uffff\3\2",
            "\1\2\1\uffff\1\7\1\2\6\uffff\2\2\2\uffff\3\2",
            "\1\2\1\uffff\1\7\1\2\6\uffff\2\2\2\uffff\3\2",
            "\1\15\1\16",
            "\1\2\1\uffff\1\12",
            "\1\2\1\uffff\1\12",
            "",
            "\1\2\1\uffff\1\17\4\uffff\1\2",
            "\1\2\1\uffff\1\17\4\uffff\1\2",
            "\1\2\2\uffff\1\12\7\uffff\1\2\2\uffff\1\2\15\uffff\1\20",
            "\1\2\2\uffff\1\12\7\uffff\1\2\2\uffff\1\2\15\uffff\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\2\2\uffff\1\12\4\uffff\1\2\23\uffff\1\25",
            "\1\2\2\uffff\1\12\4\uffff\1\2\23\uffff\1\25",
            "\1\2\2\uffff\1\12\7\uffff\1\2\2\uffff\1\2\15\uffff\1\20",
            "\1\2\2\uffff\1\12\7\uffff\1\2\2\uffff\1\2\15\uffff\1\20",
            "\1\26\1\27",
            "\1\2\2\uffff\1\12\4\uffff\1\2\23\uffff\1\25",
            "\1\2\2\uffff\1\12\4\uffff\1\2\23\uffff\1\25"
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
            return "229:3: ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ( ruleMemberKind )? ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\2\uffff\2\10\5\uffff\2\10";
    static final String dfa_9s = "\1\4\1\uffff\2\21\2\uffff\1\7\2\uffff\2\21";
    static final String dfa_10s = "\1\54\1\uffff\2\54\2\uffff\1\10\2\uffff\2\54";
    static final String dfa_11s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\3\1\2\2\uffff";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\1\2\1\3\7\uffff\1\4\25\uffff\1\1\2\uffff\1\5\1\uffff\2\1",
            "",
            "\1\10\1\uffff\1\10\4\uffff\1\10\4\uffff\1\10\5\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\1\10\1\uffff\1\10\4\uffff\1\10\4\uffff\1\10\5\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\1\10\1\uffff\1\10\4\uffff\1\10\4\uffff\1\10\5\uffff\6\10\1\7\1\10\1\uffff\1\6",
            "\1\10\1\uffff\1\10\4\uffff\1\10\4\uffff\1\10\5\uffff\6\10\1\7\1\10\1\uffff\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1710:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x003F800382768180L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0038000382748180L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040180L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0038000182240180L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000004C090000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00380001CA2D0180L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000048090000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040090000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001A70000101F0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000048010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000001F800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00001A40000101F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001E70000101F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00001A70000301F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000600000000042L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000002L});

}