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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_BOOLEAN_VALUE", "RULE_STRING", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'is'", "';'", "'class'", "'feature'", "'abstract'", "'specializes'", "','", "':'", "'['", "'..'", "']'", "'*'", "'.'", "'public'", "'private'", "'protected'", "'packaged'"
    };
    public static final int RULE_BOOLEAN_VALUE=7;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_NATURAL_VALUE=4;
    public static final int RULE_WS=14;
    public static final int RULE_INLINE_STATEMENT=11;
    public static final int RULE_UNRESTRICTED_NAME=6;
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
    // InternalAlf.g:108:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_groupMember_3_0= ruleMemberDefinition ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_groupMember_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:114:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_groupMember_3_0= ruleMemberDefinition ) )* otherlv_4= '}' ) )
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_groupMember_3_0= ruleMemberDefinition ) )* otherlv_4= '}' )
            {
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_groupMember_3_0= ruleMemberDefinition ) )* otherlv_4= '}' )
            // InternalAlf.g:116:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_groupMember_3_0= ruleMemberDefinition ) )* otherlv_4= '}'
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
            		
            // InternalAlf.g:143:3: ( (lv_groupMember_3_0= ruleMemberDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_UNRESTRICTED_NAME)||LA2_0==15||LA2_0==18||(LA2_0>=20 && LA2_0<=22)||(LA2_0>=31 && LA2_0<=34)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:144:4: (lv_groupMember_3_0= ruleMemberDefinition )
            	    {
            	    // InternalAlf.g:144:4: (lv_groupMember_3_0= ruleMemberDefinition )
            	    // InternalAlf.g:145:5: lv_groupMember_3_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_groupMember_3_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groupMember",
            	    						lv_groupMember_3_0,
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
    // InternalAlf.g:202:1: ruleMemberDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) ;
    public final EObject ruleMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_1_0 = null;

        AntlrDatatypeRuleToken lv_memberName_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:208:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) )
            // InternalAlf.g:209:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            {
            // InternalAlf.g:209:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            // InternalAlf.g:210:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            {
            // InternalAlf.g:210:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=31 && LA3_0<=34)) ) {
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

            // InternalAlf.g:229:3: ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
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
                    // InternalAlf.g:250:4: ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    {
                    // InternalAlf.g:250:4: ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    // InternalAlf.g:251:5: ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';'
                    {

                    					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMemberKindParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    ruleMemberKind();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalAlf.g:258:5: ( (lv_memberName_3_0= ruleName ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalAlf.g:259:6: (lv_memberName_3_0= ruleName )
                            {
                            // InternalAlf.g:259:6: (lv_memberName_3_0= ruleName )
                            // InternalAlf.g:260:7: lv_memberName_3_0= ruleName
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
                    				
                    // InternalAlf.g:281:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:282:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:282:6: ( ruleQualifiedName )
                    // InternalAlf.g:283:7: ruleQualifiedName
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
    // InternalAlf.g:307:1: entryRuleMemberKind returns [String current=null] : iv_ruleMemberKind= ruleMemberKind EOF ;
    public final String entryRuleMemberKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberKind = null;


        try {
            // InternalAlf.g:307:50: (iv_ruleMemberKind= ruleMemberKind EOF )
            // InternalAlf.g:308:2: iv_ruleMemberKind= ruleMemberKind EOF
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
    // InternalAlf.g:314:1: ruleMemberKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' | kw= 'class' | kw= 'feature' ) ;
    public final AntlrDatatypeRuleToken ruleMemberKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:320:2: ( (kw= 'package' | kw= 'class' | kw= 'feature' ) )
            // InternalAlf.g:321:2: (kw= 'package' | kw= 'class' | kw= 'feature' )
            {
            // InternalAlf.g:321:2: (kw= 'package' | kw= 'class' | kw= 'feature' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAlf.g:322:3: kw= 'package'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberKindAccess().getPackageKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:328:3: kw= 'class'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberKindAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:334:3: kw= 'feature'
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
    // InternalAlf.g:343:1: entryRulePackagedElementDefinition returns [EObject current=null] : iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF ;
    public final EObject entryRulePackagedElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedElementDefinition = null;


        try {
            // InternalAlf.g:343:66: (iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF )
            // InternalAlf.g:344:2: iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF
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
    // InternalAlf.g:350:1: rulePackagedElementDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub | this_FeatureDefinition_2= ruleFeatureDefinition ) ;
    public final EObject rulePackagedElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;

        EObject this_FeatureDefinition_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:356:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub | this_FeatureDefinition_2= ruleFeatureDefinition ) )
            // InternalAlf.g:357:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub | this_FeatureDefinition_2= ruleFeatureDefinition )
            {
            // InternalAlf.g:357:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub | this_FeatureDefinition_2= ruleFeatureDefinition )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 20:
            case 22:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 18:
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
                    // InternalAlf.g:358:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:367:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
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
                    // InternalAlf.g:376:3: this_FeatureDefinition_2= ruleFeatureDefinition
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
    // InternalAlf.g:388:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:388:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:389:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:395:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:401:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub )
            // InternalAlf.g:402:2: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
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
    // InternalAlf.g:413:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:413:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:414:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalAlf.g:420:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedGeneralization_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) ) )* )? ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedGeneralization_5_0 = null;

        EObject lv_ownedGeneralization_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:426:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedGeneralization_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) ) )* )? ) )
            // InternalAlf.g:427:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedGeneralization_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) ) )* )? )
            {
            // InternalAlf.g:427:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedGeneralization_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) ) )* )? )
            // InternalAlf.g:428:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedGeneralization_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) ) )* )?
            {
            // InternalAlf.g:428:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:429:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:429:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:430:5: lv_isAbstract_0_0= 'abstract'
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
            		
            // InternalAlf.g:446:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:447:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:447:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:448:5: lv_name_2_0= ruleName
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

            // InternalAlf.g:465:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedGeneralization_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18||LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:466:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedGeneralization_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:466:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==23) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAlf.g:467:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:472:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:477:4: ( (lv_ownedGeneralization_5_0= ruleGeneralization ) )
                    // InternalAlf.g:478:5: (lv_ownedGeneralization_5_0= ruleGeneralization )
                    {
                    // InternalAlf.g:478:5: (lv_ownedGeneralization_5_0= ruleGeneralization )
                    // InternalAlf.g:479:6: lv_ownedGeneralization_5_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_ownedGeneralization_5_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedGeneralization",
                    							lv_ownedGeneralization_5_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:496:4: (otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlf.g:497:5: otherlv_6= ',' ( (lv_ownedGeneralization_7_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:501:5: ( (lv_ownedGeneralization_7_0= ruleGeneralization ) )
                    	    // InternalAlf.g:502:6: (lv_ownedGeneralization_7_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:502:6: (lv_ownedGeneralization_7_0= ruleGeneralization )
                    	    // InternalAlf.g:503:7: lv_ownedGeneralization_7_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_ownedGeneralization_7_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedGeneralization",
                    	    								lv_ownedGeneralization_7_0,
                    	    								"org.omg.sysml.Alf.Generalization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:526:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:526:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:527:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:533:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:539:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:540:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:540:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:541:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:541:3: ( ruleQualifiedName )
            // InternalAlf.g:542:4: ruleQualifiedName
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
    // InternalAlf.g:559:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:559:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:560:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalAlf.g:566:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_groupMember_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:572:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}' ) )
            // InternalAlf.g:573:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:573:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}' )
            // InternalAlf.g:574:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:586:3: ( (lv_groupMember_2_0= ruleMemberDefinition ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_UNRESTRICTED_NAME)||LA12_0==15||LA12_0==18||(LA12_0>=20 && LA12_0<=22)||(LA12_0>=31 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:587:4: (lv_groupMember_2_0= ruleMemberDefinition )
            	    {
            	    // InternalAlf.g:587:4: (lv_groupMember_2_0= ruleMemberDefinition )
            	    // InternalAlf.g:588:5: lv_groupMember_2_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_groupMember_2_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groupMember",
            	    						lv_groupMember_2_0,
            	    						"org.omg.sysml.Alf.MemberDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalAlf.g:613:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:613:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:614:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:620:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:626:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:627:2: this_ClassDefinition_0= ruleClassDefinition
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
    // InternalAlf.g:638:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:638:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:639:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:645:1: ruleFeatureDefinition returns [EObject current=null] : ( (otherlv_0= 'feature' )? ( ( ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) ) ) | ( ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) ) ) ) ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_upper_9_0 = null;

        EObject lv_ownedType_12_0 = null;

        AntlrDatatypeRuleToken lv_name_13_0 = null;

        EObject lv_lower_17_0 = null;

        EObject lv_upper_19_0 = null;

        EObject lv_ownedType_21_0 = null;

        EObject lv_lower_23_0 = null;

        EObject lv_upper_25_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:651:2: ( ( (otherlv_0= 'feature' )? ( ( ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) ) ) | ( ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) ) ) ) ) )
            // InternalAlf.g:652:2: ( (otherlv_0= 'feature' )? ( ( ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) ) ) | ( ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) ) ) ) )
            {
            // InternalAlf.g:652:2: ( (otherlv_0= 'feature' )? ( ( ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) ) ) | ( ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) ) ) ) )
            // InternalAlf.g:653:3: (otherlv_0= 'feature' )? ( ( ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) ) ) | ( ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) ) ) )
            {
            // InternalAlf.g:653:3: (otherlv_0= 'feature' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:654:4: otherlv_0= 'feature'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureDefinitionAccess().getFeatureKeyword_0());
                    			

                    }
                    break;

            }

            // InternalAlf.g:659:3: ( ( ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) ) ) | ( ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) ) ) )
            int alt24=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==16||LA24_1==19||(LA24_1>=25 && LA24_1<=26)) ) {
                    alt24=1;
                }
                else if ( (LA24_1==18) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==16||LA24_2==19||(LA24_2>=25 && LA24_2<=26)) ) {
                    alt24=1;
                }
                else if ( (LA24_2==18) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt24=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAlf.g:660:4: ( ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) ) )
                    {
                    // InternalAlf.g:660:4: ( ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) ) )
                    // InternalAlf.g:661:5: ( (lv_name_1_0= ruleName ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) )
                    {
                    // InternalAlf.g:661:5: ( (lv_name_1_0= ruleName ) )
                    // InternalAlf.g:662:6: (lv_name_1_0= ruleName )
                    {
                    // InternalAlf.g:662:6: (lv_name_1_0= ruleName )
                    // InternalAlf.g:663:7: lv_name_1_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_1_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:680:5: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==25) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:681:6: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )?
                            {
                            otherlv_2=(Token)match(input,25,FOLLOW_3); 

                            						newLeafNode(otherlv_2, grammarAccess.getFeatureDefinitionAccess().getColonKeyword_1_0_1_0());
                            					
                            // InternalAlf.g:685:6: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:686:7: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:686:7: ( ruleQualifiedName )
                            // InternalAlf.g:687:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureDefinitionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_1_1_0());
                            							
                            pushFollow(FOLLOW_14);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalAlf.g:701:6: (otherlv_4= 'is' ( ( ruleQualifiedName ) ) )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==18) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalAlf.g:702:7: otherlv_4= 'is' ( ( ruleQualifiedName ) )
                                    {
                                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                                    							newLeafNode(otherlv_4, grammarAccess.getFeatureDefinitionAccess().getIsKeyword_1_0_1_2_0());
                                    						
                                    // InternalAlf.g:706:7: ( ( ruleQualifiedName ) )
                                    // InternalAlf.g:707:8: ( ruleQualifiedName )
                                    {
                                    // InternalAlf.g:707:8: ( ruleQualifiedName )
                                    // InternalAlf.g:708:9: ruleQualifiedName
                                    {

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getFeatureDefinitionRule());
                                    									}
                                    								

                                    									newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureCrossReference_1_0_1_2_1_0());
                                    								
                                    pushFollow(FOLLOW_13);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:724:5: (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==26) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlf.g:725:6: otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_15); 

                            						newLeafNode(otherlv_6, grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_2_0());
                            					
                            // InternalAlf.g:729:6: ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==RULE_NATURAL_VALUE) ) {
                                int LA16_1 = input.LA(2);

                                if ( (LA16_1==27) ) {
                                    alt16=1;
                                }
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalAlf.g:730:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..'
                                    {
                                    // InternalAlf.g:730:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:731:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:731:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:732:9: lv_lower_7_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_2_1_0_0());
                                    								
                                    pushFollow(FOLLOW_16);
                                    lv_lower_7_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_7_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_8=(Token)match(input,27,FOLLOW_15); 

                                    							newLeafNode(otherlv_8, grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_2_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:754:6: ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:755:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:755:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:756:8: lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_2_2_0());
                            							
                            pushFollow(FOLLOW_17);
                            lv_upper_9_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_9_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_10=(Token)match(input,28,FOLLOW_13); 

                            						newLeafNode(otherlv_10, grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_2_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:778:5: (otherlv_11= ';' | ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==19) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==16) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAlf.g:779:6: otherlv_11= ';'
                            {
                            otherlv_11=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(otherlv_11, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:784:6: ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) )
                            {
                            // InternalAlf.g:784:6: ( (lv_ownedType_12_0= ruleAnonymousClassDefinition ) )
                            // InternalAlf.g:785:7: (lv_ownedType_12_0= ruleAnonymousClassDefinition )
                            {
                            // InternalAlf.g:785:7: (lv_ownedType_12_0= ruleAnonymousClassDefinition )
                            // InternalAlf.g:786:8: lv_ownedType_12_0= ruleAnonymousClassDefinition
                            {

                            								newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAnonymousClassDefinitionParserRuleCall_1_0_3_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_ownedType_12_0=ruleAnonymousClassDefinition();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            								}
                            								add(
                            									current,
                            									"ownedType",
                            									lv_ownedType_12_0,
                            									"org.omg.sysml.Alf.AnonymousClassDefinition");
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
                    // InternalAlf.g:806:4: ( ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) ) )
                    {
                    // InternalAlf.g:806:4: ( ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) ) )
                    // InternalAlf.g:807:5: ( (lv_name_13_0= ruleName ) )? otherlv_14= 'is' ( ( ruleQualifiedName ) ) ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) )
                    {
                    // InternalAlf.g:807:5: ( (lv_name_13_0= ruleName ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAlf.g:808:6: (lv_name_13_0= ruleName )
                            {
                            // InternalAlf.g:808:6: (lv_name_13_0= ruleName )
                            // InternalAlf.g:809:7: lv_name_13_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_name_13_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_13_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_14, grammarAccess.getFeatureDefinitionAccess().getIsKeyword_1_1_1());
                    				
                    // InternalAlf.g:830:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:831:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:831:6: ( ruleQualifiedName )
                    // InternalAlf.g:832:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureCrossReference_1_1_2_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:846:5: ( ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) ) | (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==26) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==RULE_NATURAL_VALUE) ) {
                            int LA23_3 = input.LA(3);

                            if ( (LA23_3==27) ) {
                                int LA23_5 = input.LA(4);

                                if ( (LA23_5==RULE_NATURAL_VALUE) ) {
                                    int LA23_7 = input.LA(5);

                                    if ( (LA23_7==28) ) {
                                        int LA23_6 = input.LA(6);

                                        if ( (LA23_6==19) ) {
                                            alt23=2;
                                        }
                                        else if ( (LA23_6==16) ) {
                                            alt23=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 23, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 23, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA23_5==29) ) {
                                    int LA23_4 = input.LA(5);

                                    if ( (LA23_4==28) ) {
                                        int LA23_6 = input.LA(6);

                                        if ( (LA23_6==19) ) {
                                            alt23=2;
                                        }
                                        else if ( (LA23_6==16) ) {
                                            alt23=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 23, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 23, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 23, 5, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA23_3==28) ) {
                                int LA23_6 = input.LA(4);

                                if ( (LA23_6==19) ) {
                                    alt23=2;
                                }
                                else if ( (LA23_6==16) ) {
                                    alt23=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 23, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA23_1==29) ) {
                            int LA23_4 = input.LA(3);

                            if ( (LA23_4==28) ) {
                                int LA23_6 = input.LA(4);

                                if ( (LA23_6==19) ) {
                                    alt23=2;
                                }
                                else if ( (LA23_6==16) ) {
                                    alt23=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 23, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA23_0==16) ) {
                        alt23=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:847:6: ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) )
                            {
                            // InternalAlf.g:847:6: ( (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) ) )
                            // InternalAlf.g:848:7: (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )? ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) )
                            {
                            // InternalAlf.g:848:7: (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==26) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // InternalAlf.g:849:8: otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']'
                                    {
                                    otherlv_16=(Token)match(input,26,FOLLOW_15); 

                                    								newLeafNode(otherlv_16, grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_3_0_0_0());
                                    							
                                    // InternalAlf.g:853:8: ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )?
                                    int alt20=2;
                                    int LA20_0 = input.LA(1);

                                    if ( (LA20_0==RULE_NATURAL_VALUE) ) {
                                        int LA20_1 = input.LA(2);

                                        if ( (LA20_1==27) ) {
                                            alt20=1;
                                        }
                                    }
                                    switch (alt20) {
                                        case 1 :
                                            // InternalAlf.g:854:9: ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..'
                                            {
                                            // InternalAlf.g:854:9: ( (lv_lower_17_0= ruleNaturalLiteralExpression ) )
                                            // InternalAlf.g:855:10: (lv_lower_17_0= ruleNaturalLiteralExpression )
                                            {
                                            // InternalAlf.g:855:10: (lv_lower_17_0= ruleNaturalLiteralExpression )
                                            // InternalAlf.g:856:11: lv_lower_17_0= ruleNaturalLiteralExpression
                                            {

                                            											newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_3_0_0_1_0_0());
                                            										
                                            pushFollow(FOLLOW_16);
                                            lv_lower_17_0=ruleNaturalLiteralExpression();

                                            state._fsp--;


                                            											if (current==null) {
                                            												current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                            											}
                                            											set(
                                            												current,
                                            												"lower",
                                            												lv_lower_17_0,
                                            												"org.omg.sysml.Alf.NaturalLiteralExpression");
                                            											afterParserOrEnumRuleCall();
                                            										

                                            }


                                            }

                                            otherlv_18=(Token)match(input,27,FOLLOW_15); 

                                            									newLeafNode(otherlv_18, grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_3_0_0_1_1());
                                            								

                                            }
                                            break;

                                    }

                                    // InternalAlf.g:878:8: ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) )
                                    // InternalAlf.g:879:9: (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:879:9: (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression )
                                    // InternalAlf.g:880:10: lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_3_0_0_2_0());
                                    									
                                    pushFollow(FOLLOW_17);
                                    lv_upper_19_0=ruleUnlimitedNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"upper",
                                    											lv_upper_19_0,
                                    											"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_20=(Token)match(input,28,FOLLOW_13); 

                                    								newLeafNode(otherlv_20, grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3_0_0_3());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:902:7: ( (lv_ownedType_21_0= ruleAnonymousClassDefinition ) )
                            // InternalAlf.g:903:8: (lv_ownedType_21_0= ruleAnonymousClassDefinition )
                            {
                            // InternalAlf.g:903:8: (lv_ownedType_21_0= ruleAnonymousClassDefinition )
                            // InternalAlf.g:904:9: lv_ownedType_21_0= ruleAnonymousClassDefinition
                            {

                            									newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAnonymousClassDefinitionParserRuleCall_1_1_3_0_1_0());
                            								
                            pushFollow(FOLLOW_2);
                            lv_ownedType_21_0=ruleAnonymousClassDefinition();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            									}
                            									add(
                            										current,
                            										"ownedType",
                            										lv_ownedType_21_0,
                            										"org.omg.sysml.Alf.AnonymousClassDefinition");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:923:6: (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' )
                            {
                            // InternalAlf.g:923:6: (otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';' )
                            // InternalAlf.g:924:7: otherlv_22= '[' ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )? ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_26= ']' otherlv_27= ';'
                            {
                            otherlv_22=(Token)match(input,26,FOLLOW_15); 

                            							newLeafNode(otherlv_22, grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_3_1_0());
                            						
                            // InternalAlf.g:928:7: ( ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==RULE_NATURAL_VALUE) ) {
                                int LA22_1 = input.LA(2);

                                if ( (LA22_1==27) ) {
                                    alt22=1;
                                }
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalAlf.g:929:8: ( (lv_lower_23_0= ruleNaturalLiteralExpression ) ) otherlv_24= '..'
                                    {
                                    // InternalAlf.g:929:8: ( (lv_lower_23_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:930:9: (lv_lower_23_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:930:9: (lv_lower_23_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:931:10: lv_lower_23_0= ruleNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_3_1_1_0_0());
                                    									
                                    pushFollow(FOLLOW_16);
                                    lv_lower_23_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"lower",
                                    											lv_lower_23_0,
                                    											"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_24=(Token)match(input,27,FOLLOW_15); 

                                    								newLeafNode(otherlv_24, grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_3_1_1_1());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:953:7: ( (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:954:8: (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:954:8: (lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:955:9: lv_upper_25_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            									newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_3_1_2_0());
                            								
                            pushFollow(FOLLOW_17);
                            lv_upper_25_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"upper",
                            										lv_upper_25_0,
                            										"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_26=(Token)match(input,28,FOLLOW_9); 

                            							newLeafNode(otherlv_26, grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3_1_3());
                            						
                            otherlv_27=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(otherlv_27, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_1_3_1_4());
                            						

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
    // $ANTLR end "ruleFeatureDefinition"


    // $ANTLR start "entryRuleAnonymousClassDefinition"
    // InternalAlf.g:988:1: entryRuleAnonymousClassDefinition returns [EObject current=null] : iv_ruleAnonymousClassDefinition= ruleAnonymousClassDefinition EOF ;
    public final EObject entryRuleAnonymousClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousClassDefinition = null;


        try {
            // InternalAlf.g:988:65: (iv_ruleAnonymousClassDefinition= ruleAnonymousClassDefinition EOF )
            // InternalAlf.g:989:2: iv_ruleAnonymousClassDefinition= ruleAnonymousClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getAnonymousClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousClassDefinition=ruleAnonymousClassDefinition();

            state._fsp--;

             current =iv_ruleAnonymousClassDefinition; 
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
    // $ANTLR end "entryRuleAnonymousClassDefinition"


    // $ANTLR start "ruleAnonymousClassDefinition"
    // InternalAlf.g:995:1: ruleAnonymousClassDefinition returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}' ) ;
    public final EObject ruleAnonymousClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_groupMember_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1001:2: ( ( () otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1002:2: ( () otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1002:2: ( () otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}' )
            // InternalAlf.g:1003:3: () otherlv_1= '{' ( (lv_groupMember_2_0= ruleMemberDefinition ) )* otherlv_3= '}'
            {
            // InternalAlf.g:1003:3: ()
            // InternalAlf.g:1004:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnonymousClassDefinitionAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAnonymousClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1014:3: ( (lv_groupMember_2_0= ruleMemberDefinition ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_UNRESTRICTED_NAME)||LA25_0==15||LA25_0==18||(LA25_0>=20 && LA25_0<=22)||(LA25_0>=31 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAlf.g:1015:4: (lv_groupMember_2_0= ruleMemberDefinition )
            	    {
            	    // InternalAlf.g:1015:4: (lv_groupMember_2_0= ruleMemberDefinition )
            	    // InternalAlf.g:1016:5: lv_groupMember_2_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getAnonymousClassDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_groupMember_2_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnonymousClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groupMember",
            	    						lv_groupMember_2_0,
            	    						"org.omg.sysml.Alf.MemberDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAnonymousClassDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAnonymousClassDefinition"


    // $ANTLR start "entryRuleNaturalLiteralExpression"
    // InternalAlf.g:1041:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:1041:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:1042:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:1048:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:1054:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:1055:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:1055:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:1056:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:1056:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:1057:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:1076:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:1076:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:1077:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:1083:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1089:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:1090:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:1090:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NATURAL_VALUE) ) {
                alt26=1;
            }
            else if ( (LA26_0==29) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1091:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:1100:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:1100:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:1101:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:1101:4: ()
                    // InternalAlf.g:1102:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalAlf.g:1117:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:1117:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:1118:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:1124:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:1130:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:1131:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:1131:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_UNRESTRICTED_NAME) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1132:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1140:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:1151:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:1151:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:1152:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:1158:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:1164:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalAlf.g:1165:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:1165:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalAlf.g:1166:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:1176:3: (kw= '.' this_Name_2= ruleName )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAlf.g:1177:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,30,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_18);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAlf.g:1197:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:1203:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:1204:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:1204:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt29=1;
                }
                break;
            case 32:
                {
                alt29=2;
                }
                break;
            case 33:
                {
                alt29=3;
                }
                break;
            case 34:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1205:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:1205:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:1206:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1213:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:1213:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:1214:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1221:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:1221:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:1222:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1229:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:1229:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:1230:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\2\5\1\uffff\2\5\2\20\1\uffff\4\20\2\5\4\20\2\5\4\20";
    static final String dfa_3s = "\1\26\1\22\1\uffff\4\22\1\uffff\2\27\2\32\2\6\4\36\2\6\4\36";
    static final String dfa_4s = "\2\uffff\1\1\4\uffff\1\2\20\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\10\uffff\1\1\2\uffff\1\2\1\uffff\1\3\1\4\1\2",
            "\1\5\1\6\13\uffff\1\7",
            "",
            "\1\10\1\11\13\uffff\1\7",
            "\1\12\1\13\13\uffff\1\14",
            "\1\2\1\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "",
            "\1\2\1\uffff\1\15\4\uffff\1\2",
            "\1\2\1\uffff\1\15\4\uffff\1\2",
            "\1\2\1\uffff\1\14\1\2\5\uffff\2\2",
            "\1\2\1\uffff\1\14\1\2\5\uffff\2\2",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\2\2\uffff\1\7\6\uffff\1\2\3\uffff\1\22",
            "\1\2\2\uffff\1\7\6\uffff\1\2\3\uffff\1\22",
            "\1\2\2\uffff\1\7\4\uffff\1\2\5\uffff\1\23",
            "\1\2\2\uffff\1\7\4\uffff\1\2\5\uffff\1\23",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\2\2\uffff\1\7\6\uffff\1\2\3\uffff\1\22",
            "\1\2\2\uffff\1\7\6\uffff\1\2\3\uffff\1\22",
            "\1\2\2\uffff\1\7\4\uffff\1\2\5\uffff\1\23",
            "\1\2\2\uffff\1\7\4\uffff\1\2\5\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "229:3: ( ( (lv_ownedMemberElement_1_0= rulePackagedElementDefinition ) ) | ( ruleMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000780768060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000780748060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000060D0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000002L});

}