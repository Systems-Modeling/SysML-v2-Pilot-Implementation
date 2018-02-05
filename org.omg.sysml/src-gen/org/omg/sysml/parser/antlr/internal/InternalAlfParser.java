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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_BOOLEAN_VALUE", "RULE_NATURAL_VALUE", "RULE_STRING", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'abstract'", "'class'", "'specializes'", "':'", "';'", "'.'", "'public'", "'private'", "'protected'"
    };
    public static final int RULE_BOOLEAN_VALUE=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int RULE_ID=4;
    public static final int RULE_NATURAL_VALUE=7;
    public static final int RULE_WS=14;
    public static final int RULE_INLINE_STATEMENT=11;
    public static final int RULE_UNRESTRICTED_NAME=5;
    public static final int T__26=26;
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
            else if ( ((LA1_0>=18 && LA1_0<=19)) ) {
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
    // InternalAlf.g:108:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMember_3_0= rulePackagedElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedMember_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:114:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMember_3_0= rulePackagedElement ) )* otherlv_4= '}' ) )
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMember_3_0= rulePackagedElement ) )* otherlv_4= '}' )
            {
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMember_3_0= rulePackagedElement ) )* otherlv_4= '}' )
            // InternalAlf.g:116:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMember_3_0= rulePackagedElement ) )* otherlv_4= '}'
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
            		
            // InternalAlf.g:143:3: ( (lv_ownedMember_3_0= rulePackagedElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=24 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:144:4: (lv_ownedMember_3_0= rulePackagedElement )
            	    {
            	    // InternalAlf.g:144:4: (lv_ownedMember_3_0= rulePackagedElement )
            	    // InternalAlf.g:145:5: lv_ownedMember_3_0= rulePackagedElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMemberPackagedElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedMember_3_0=rulePackagedElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMember",
            	    						lv_ownedMember_3_0,
            	    						"org.omg.sysml.Alf.PackagedElement");
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
    // InternalAlf.g:177:1: rulePackageDefinitionOrStub returns [EObject current=null] : ( ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ownedMember_4_0= rulePackagedElement ) )* otherlv_5= '}' ) ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_packageVisibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedMember_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:183:2: ( ( ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ownedMember_4_0= rulePackagedElement ) )* otherlv_5= '}' ) )
            // InternalAlf.g:184:2: ( ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ownedMember_4_0= rulePackagedElement ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:184:2: ( ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ownedMember_4_0= rulePackagedElement ) )* otherlv_5= '}' )
            // InternalAlf.g:185:3: ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) otherlv_1= 'package' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ownedMember_4_0= rulePackagedElement ) )* otherlv_5= '}'
            {
            // InternalAlf.g:185:3: ( (lv_packageVisibility_0_0= ruleVisibilityKind ) )
            // InternalAlf.g:186:4: (lv_packageVisibility_0_0= ruleVisibilityKind )
            {
            // InternalAlf.g:186:4: (lv_packageVisibility_0_0= ruleVisibilityKind )
            // InternalAlf.g:187:5: lv_packageVisibility_0_0= ruleVisibilityKind
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getPackageVisibilityVisibilityKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_packageVisibility_0_0=ruleVisibilityKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDefinitionOrStubRule());
            					}
            					set(
            						current,
            						"packageVisibility",
            						lv_packageVisibility_0_0,
            						"org.omg.sysml.Alf.VisibilityKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageDefinitionOrStubAccess().getPackageKeyword_1());
            		
            // InternalAlf.g:208:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:209:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:209:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:210:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDefinitionOrStubRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageDefinitionOrStubAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlf.g:231:3: ( (lv_ownedMember_4_0= rulePackagedElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=24 && LA3_0<=26)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlf.g:232:4: (lv_ownedMember_4_0= rulePackagedElement )
            	    {
            	    // InternalAlf.g:232:4: (lv_ownedMember_4_0= rulePackagedElement )
            	    // InternalAlf.g:233:5: lv_ownedMember_4_0= rulePackagedElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getOwnedMemberPackagedElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedMember_4_0=rulePackagedElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionOrStubRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMember",
            	    						lv_ownedMember_4_0,
            	    						"org.omg.sysml.Alf.PackagedElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageDefinitionOrStubAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePackageDefinitionOrStub"


    // $ANTLR start "entryRulePackagedElement"
    // InternalAlf.g:258:1: entryRulePackagedElement returns [EObject current=null] : iv_rulePackagedElement= rulePackagedElement EOF ;
    public final EObject entryRulePackagedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedElement = null;


        try {
            // InternalAlf.g:258:56: (iv_rulePackagedElement= rulePackagedElement EOF )
            // InternalAlf.g:259:2: iv_rulePackagedElement= rulePackagedElement EOF
            {
             newCompositeNode(grammarAccess.getPackagedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagedElement=rulePackagedElement();

            state._fsp--;

             current =iv_rulePackagedElement; 
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
    // $ANTLR end "entryRulePackagedElement"


    // $ANTLR start "rulePackagedElement"
    // InternalAlf.g:265:1: rulePackagedElement returns [EObject current=null] : this_PackagedElementDefinition_0= rulePackagedElementDefinition ;
    public final EObject rulePackagedElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackagedElementDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:271:2: (this_PackagedElementDefinition_0= rulePackagedElementDefinition )
            // InternalAlf.g:272:2: this_PackagedElementDefinition_0= rulePackagedElementDefinition
            {

            		newCompositeNode(grammarAccess.getPackagedElementAccess().getPackagedElementDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PackagedElementDefinition_0=rulePackagedElementDefinition();

            state._fsp--;


            		current = this_PackagedElementDefinition_0;
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
    // $ANTLR end "rulePackagedElement"


    // $ANTLR start "entryRulePackagedElementDefinition"
    // InternalAlf.g:283:1: entryRulePackagedElementDefinition returns [EObject current=null] : iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF ;
    public final EObject entryRulePackagedElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedElementDefinition = null;


        try {
            // InternalAlf.g:283:66: (iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF )
            // InternalAlf.g:284:2: iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF
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
    // InternalAlf.g:290:1: rulePackagedElementDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) ;
    public final EObject rulePackagedElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:296:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) )
            // InternalAlf.g:297:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            {
            // InternalAlf.g:297:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    alt4=1;
                }
                else if ( ((LA4_1>=18 && LA4_1<=19)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==15) ) {
                    alt4=1;
                }
                else if ( ((LA4_2>=18 && LA4_2<=19)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==15) ) {
                    alt4=1;
                }
                else if ( ((LA4_3>=18 && LA4_3<=19)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAlf.g:298:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:307:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getPackagedElementDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1());
                    		
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
    // $ANTLR end "rulePackagedElementDefinition"


    // $ANTLR start "entryRuleClassifierDefinitionOrStub"
    // InternalAlf.g:319:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:319:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:320:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:326:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:332:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub )
            // InternalAlf.g:333:2: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
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
    // InternalAlf.g:344:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:344:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:345:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalAlf.g:351:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_generalization_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:357:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ) )
            // InternalAlf.g:358:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? )
            {
            // InternalAlf.g:358:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? )
            // InternalAlf.g:359:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            {
            // InternalAlf.g:359:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:360:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:360:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:361:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,18,FOLLOW_7); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalAlf.g:377:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:378:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:378:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:379:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalAlf.g:396:3: (otherlv_3= 'specializes' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:397:4: otherlv_3= 'specializes' ( (lv_generalization_4_0= ruleGeneralization ) )+
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:401:4: ( (lv_generalization_4_0= ruleGeneralization ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_UNRESTRICTED_NAME)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAlf.g:402:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:402:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalAlf.g:403:6: lv_generalization_4_0= ruleGeneralization
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_generalization_4_0=ruleGeneralization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"generalization",
                    	    							lv_generalization_4_0,
                    	    							"org.omg.sysml.Alf.Generalization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
    // InternalAlf.g:425:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:425:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:426:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:432:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:438:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:439:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:439:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:440:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:440:3: ( ruleQualifiedName )
            // InternalAlf.g:441:4: ruleQualifiedName
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
    // InternalAlf.g:458:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:458:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:459:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalAlf.g:465:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedFeature_2_0= ruleClassMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_ownedFeature_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:471:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedFeature_2_0= ruleClassMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:472:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedFeature_2_0= ruleClassMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:472:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedFeature_2_0= ruleClassMember ) )* otherlv_3= '}' )
            // InternalAlf.g:473:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedFeature_2_0= ruleClassMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:485:3: ( (lv_ownedFeature_2_0= ruleClassMember ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_UNRESTRICTED_NAME)||(LA8_0>=24 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAlf.g:486:4: (lv_ownedFeature_2_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:486:4: (lv_ownedFeature_2_0= ruleClassMember )
            	    // InternalAlf.g:487:5: lv_ownedFeature_2_0= ruleClassMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedFeatureClassMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_ownedFeature_2_0=ruleClassMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedFeature",
            	    						lv_ownedFeature_2_0,
            	    						"org.omg.sysml.Alf.ClassMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAlf.g:512:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:512:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:513:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:519:1: ruleClassDefinitionOrStub returns [EObject current=null] : ( ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'specializes' ( (lv_generalization_5_0= ruleGeneralization ) )+ )? otherlv_6= '{' ( (lv_ownedFeature_7_0= ruleClassMember ) )* otherlv_8= '}' ) ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_packageVisibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_ownedFeature_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:525:2: ( ( ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'specializes' ( (lv_generalization_5_0= ruleGeneralization ) )+ )? otherlv_6= '{' ( (lv_ownedFeature_7_0= ruleClassMember ) )* otherlv_8= '}' ) )
            // InternalAlf.g:526:2: ( ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'specializes' ( (lv_generalization_5_0= ruleGeneralization ) )+ )? otherlv_6= '{' ( (lv_ownedFeature_7_0= ruleClassMember ) )* otherlv_8= '}' )
            {
            // InternalAlf.g:526:2: ( ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'specializes' ( (lv_generalization_5_0= ruleGeneralization ) )+ )? otherlv_6= '{' ( (lv_ownedFeature_7_0= ruleClassMember ) )* otherlv_8= '}' )
            // InternalAlf.g:527:3: ( (lv_packageVisibility_0_0= ruleVisibilityKind ) ) ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'specializes' ( (lv_generalization_5_0= ruleGeneralization ) )+ )? otherlv_6= '{' ( (lv_ownedFeature_7_0= ruleClassMember ) )* otherlv_8= '}'
            {
            // InternalAlf.g:527:3: ( (lv_packageVisibility_0_0= ruleVisibilityKind ) )
            // InternalAlf.g:528:4: (lv_packageVisibility_0_0= ruleVisibilityKind )
            {
            // InternalAlf.g:528:4: (lv_packageVisibility_0_0= ruleVisibilityKind )
            // InternalAlf.g:529:5: lv_packageVisibility_0_0= ruleVisibilityKind
            {

            					newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getPackageVisibilityVisibilityKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_packageVisibility_0_0=ruleVisibilityKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDefinitionOrStubRule());
            					}
            					set(
            						current,
            						"packageVisibility",
            						lv_packageVisibility_0_0,
            						"org.omg.sysml.Alf.VisibilityKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:546:3: ( (lv_isAbstract_1_0= 'abstract' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:547:4: (lv_isAbstract_1_0= 'abstract' )
                    {
                    // InternalAlf.g:547:4: (lv_isAbstract_1_0= 'abstract' )
                    // InternalAlf.g:548:5: lv_isAbstract_1_0= 'abstract'
                    {
                    lv_isAbstract_1_0=(Token)match(input,18,FOLLOW_7); 

                    					newLeafNode(lv_isAbstract_1_0, grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDefinitionOrStubRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getClassDefinitionOrStubAccess().getClassKeyword_2());
            		
            // InternalAlf.g:564:3: ( (lv_name_3_0= ruleName ) )
            // InternalAlf.g:565:4: (lv_name_3_0= ruleName )
            {
            // InternalAlf.g:565:4: (lv_name_3_0= ruleName )
            // InternalAlf.g:566:5: lv_name_3_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getNameNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_3_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDefinitionOrStubRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:583:3: (otherlv_4= 'specializes' ( (lv_generalization_5_0= ruleGeneralization ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:584:4: otherlv_4= 'specializes' ( (lv_generalization_5_0= ruleGeneralization ) )+
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassDefinitionOrStubAccess().getSpecializesKeyword_4_0());
                    			
                    // InternalAlf.g:588:4: ( (lv_generalization_5_0= ruleGeneralization ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_UNRESTRICTED_NAME)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlf.g:589:5: (lv_generalization_5_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:589:5: (lv_generalization_5_0= ruleGeneralization )
                    	    // InternalAlf.g:590:6: lv_generalization_5_0= ruleGeneralization
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationGeneralizationParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_generalization_5_0=ruleGeneralization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassDefinitionOrStubRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"generalization",
                    	    							lv_generalization_5_0,
                    	    							"org.omg.sysml.Alf.Generalization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getClassDefinitionOrStubAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAlf.g:612:3: ( (lv_ownedFeature_7_0= ruleClassMember ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_UNRESTRICTED_NAME)||(LA12_0>=24 && LA12_0<=26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:613:4: (lv_ownedFeature_7_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:613:4: (lv_ownedFeature_7_0= ruleClassMember )
            	    // InternalAlf.g:614:5: lv_ownedFeature_7_0= ruleClassMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getOwnedFeatureClassMemberParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_ownedFeature_7_0=ruleClassMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionOrStubRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedFeature",
            	    						lv_ownedFeature_7_0,
            	    						"org.omg.sysml.Alf.ClassMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getClassDefinitionOrStubAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleClassDefinitionOrStub"


    // $ANTLR start "entryRuleClassMember"
    // InternalAlf.g:639:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:639:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:640:2: iv_ruleClassMember= ruleClassMember EOF
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
    // InternalAlf.g:646:1: ruleClassMember returns [EObject current=null] : this_FeatureDefinition_0= ruleFeatureDefinition ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:652:2: (this_FeatureDefinition_0= ruleFeatureDefinition )
            // InternalAlf.g:653:2: this_FeatureDefinition_0= ruleFeatureDefinition
            {

            		newCompositeNode(grammarAccess.getClassMemberAccess().getFeatureDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FeatureDefinition_0=ruleFeatureDefinition();

            state._fsp--;


            		current = this_FeatureDefinition_0;
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
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:664:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:664:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:665:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:671:1: ruleFeatureDefinition returns [EObject current=null] : ( ( (lv_methodVisibility_0_0= ruleVisibilityKind ) )? ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= ';' ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_methodVisibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:677:2: ( ( ( (lv_methodVisibility_0_0= ruleVisibilityKind ) )? ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= ';' ) )
            // InternalAlf.g:678:2: ( ( (lv_methodVisibility_0_0= ruleVisibilityKind ) )? ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= ';' )
            {
            // InternalAlf.g:678:2: ( ( (lv_methodVisibility_0_0= ruleVisibilityKind ) )? ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= ';' )
            // InternalAlf.g:679:3: ( (lv_methodVisibility_0_0= ruleVisibilityKind ) )? ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= ';'
            {
            // InternalAlf.g:679:3: ( (lv_methodVisibility_0_0= ruleVisibilityKind ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=24 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:680:4: (lv_methodVisibility_0_0= ruleVisibilityKind )
                    {
                    // InternalAlf.g:680:4: (lv_methodVisibility_0_0= ruleVisibilityKind )
                    // InternalAlf.g:681:5: lv_methodVisibility_0_0= ruleVisibilityKind
                    {

                    					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getMethodVisibilityVisibilityKindEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_methodVisibility_0_0=ruleVisibilityKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"methodVisibility",
                    						lv_methodVisibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:698:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:699:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:699:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:700:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureDefinitionAccess().getColonKeyword_2());
            		
            // InternalAlf.g:721:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:722:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:722:4: ( ruleQualifiedName )
            // InternalAlf.g:723:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getDefiningTypeClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_4());
            		

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


    // $ANTLR start "entryRuleName"
    // InternalAlf.g:745:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:745:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:746:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:752:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:758:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:759:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:759:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_UNRESTRICTED_NAME) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:760:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:768:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:779:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:779:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:780:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:786:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:792:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalAlf.g:793:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:793:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalAlf.g:794:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:804:3: (kw= '.' this_Name_2= ruleName )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAlf.g:805:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,23,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_16);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "ruleVisibilityKind"
    // InternalAlf.g:825:1: ruleVisibilityKind returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibilityKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:831:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalAlf.g:832:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalAlf.g:832:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt16=1;
                }
                break;
            case 25:
                {
                alt16=2;
                }
                break;
            case 26:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAlf.g:833:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:833:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:834:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:841:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:841:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:842:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:849:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:849:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:850:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleVisibilityKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007020030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});

}