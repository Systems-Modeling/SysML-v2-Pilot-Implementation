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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_BOOLEAN_VALUE", "RULE_NATURAL_VALUE", "RULE_STRING", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'abstract'", "'class'", "'specializes'", "','", "':'", "';'", "'.'", "'public'", "'private'", "'protected'"
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
    public static final int T__27=27;
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
    // InternalAlf.g:108:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_memberNaming_3_0= rulePackagedElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_memberNaming_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:114:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_memberNaming_3_0= rulePackagedElement ) )* otherlv_4= '}' ) )
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_memberNaming_3_0= rulePackagedElement ) )* otherlv_4= '}' )
            {
            // InternalAlf.g:115:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_memberNaming_3_0= rulePackagedElement ) )* otherlv_4= '}' )
            // InternalAlf.g:116:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_memberNaming_3_0= rulePackagedElement ) )* otherlv_4= '}'
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
            		
            // InternalAlf.g:143:3: ( (lv_memberNaming_3_0= rulePackagedElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=25 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:144:4: (lv_memberNaming_3_0= rulePackagedElement )
            	    {
            	    // InternalAlf.g:144:4: (lv_memberNaming_3_0= rulePackagedElement )
            	    // InternalAlf.g:145:5: lv_memberNaming_3_0= rulePackagedElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getMemberNamingPackagedElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_memberNaming_3_0=rulePackagedElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"memberNaming",
            	    						lv_memberNaming_3_0,
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


    // $ANTLR start "entryRulePackagedElement"
    // InternalAlf.g:195:1: entryRulePackagedElement returns [EObject current=null] : iv_rulePackagedElement= rulePackagedElement EOF ;
    public final EObject entryRulePackagedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedElement = null;


        try {
            // InternalAlf.g:195:56: (iv_rulePackagedElement= rulePackagedElement EOF )
            // InternalAlf.g:196:2: iv_rulePackagedElement= rulePackagedElement EOF
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
    // InternalAlf.g:202:1: rulePackagedElement returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) ) ( (lv_ownedElement_1_0= rulePackagedElementDefinition ) ) ) ;
    public final EObject rulePackagedElement() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedElement_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:208:2: ( ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) ) ( (lv_ownedElement_1_0= rulePackagedElementDefinition ) ) ) )
            // InternalAlf.g:209:2: ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) ) ( (lv_ownedElement_1_0= rulePackagedElementDefinition ) ) )
            {
            // InternalAlf.g:209:2: ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) ) ( (lv_ownedElement_1_0= rulePackagedElementDefinition ) ) )
            // InternalAlf.g:210:3: ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) ) ( (lv_ownedElement_1_0= rulePackagedElementDefinition ) )
            {
            // InternalAlf.g:210:3: ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )
            // InternalAlf.g:211:4: (lv_visibility_0_0= ruleImportVisibilityIndicator )
            {
            // InternalAlf.g:211:4: (lv_visibility_0_0= ruleImportVisibilityIndicator )
            // InternalAlf.g:212:5: lv_visibility_0_0= ruleImportVisibilityIndicator
            {

            					newCompositeNode(grammarAccess.getPackagedElementAccess().getVisibilityImportVisibilityIndicatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_visibility_0_0=ruleImportVisibilityIndicator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackagedElementRule());
            					}
            					set(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"org.omg.sysml.Alf.ImportVisibilityIndicator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:229:3: ( (lv_ownedElement_1_0= rulePackagedElementDefinition ) )
            // InternalAlf.g:230:4: (lv_ownedElement_1_0= rulePackagedElementDefinition )
            {
            // InternalAlf.g:230:4: (lv_ownedElement_1_0= rulePackagedElementDefinition )
            // InternalAlf.g:231:5: lv_ownedElement_1_0= rulePackagedElementDefinition
            {

            					newCompositeNode(grammarAccess.getPackagedElementAccess().getOwnedElementPackagedElementDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedElement_1_0=rulePackagedElementDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackagedElementRule());
            					}
            					add(
            						current,
            						"ownedElement",
            						lv_ownedElement_1_0,
            						"org.omg.sysml.Alf.PackagedElementDefinition");
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
    // $ANTLR end "rulePackagedElement"


    // $ANTLR start "entryRulePackagedElementDefinition"
    // InternalAlf.g:252:1: entryRulePackagedElementDefinition returns [EObject current=null] : iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF ;
    public final EObject entryRulePackagedElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedElementDefinition = null;


        try {
            // InternalAlf.g:252:66: (iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF )
            // InternalAlf.g:253:2: iv_rulePackagedElementDefinition= rulePackagedElementDefinition EOF
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
    // InternalAlf.g:259:1: rulePackagedElementDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) ;
    public final EObject rulePackagedElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:265:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) )
            // InternalAlf.g:266:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            {
            // InternalAlf.g:266:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlf.g:267:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:276:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
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
    // InternalAlf.g:288:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:288:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:289:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:295:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:301:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub )
            // InternalAlf.g:302:2: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
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
    // InternalAlf.g:313:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:313:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:314:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalAlf.g:320:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedGeneralization_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) ) )* )? ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedGeneralization_4_0 = null;

        EObject lv_ownedGeneralization_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:326:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedGeneralization_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) ) )* )? ) )
            // InternalAlf.g:327:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedGeneralization_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) ) )* )? )
            {
            // InternalAlf.g:327:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedGeneralization_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) ) )* )? )
            // InternalAlf.g:328:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedGeneralization_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) ) )* )?
            {
            // InternalAlf.g:328:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlf.g:329:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:329:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:330:5: lv_isAbstract_0_0= 'abstract'
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
            		
            // InternalAlf.g:346:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:347:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:347:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:348:5: lv_name_2_0= ruleName
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

            // InternalAlf.g:365:3: (otherlv_3= 'specializes' ( (lv_ownedGeneralization_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:366:4: otherlv_3= 'specializes' ( (lv_ownedGeneralization_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:370:4: ( (lv_ownedGeneralization_4_0= ruleGeneralization ) )
                    // InternalAlf.g:371:5: (lv_ownedGeneralization_4_0= ruleGeneralization )
                    {
                    // InternalAlf.g:371:5: (lv_ownedGeneralization_4_0= ruleGeneralization )
                    // InternalAlf.g:372:6: lv_ownedGeneralization_4_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_ownedGeneralization_4_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedGeneralization",
                    							lv_ownedGeneralization_4_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:389:4: (otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAlf.g:390:5: otherlv_5= ',' ( (lv_ownedGeneralization_6_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:394:5: ( (lv_ownedGeneralization_6_0= ruleGeneralization ) )
                    	    // InternalAlf.g:395:6: (lv_ownedGeneralization_6_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:395:6: (lv_ownedGeneralization_6_0= ruleGeneralization )
                    	    // InternalAlf.g:396:7: lv_ownedGeneralization_6_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_ownedGeneralization_6_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedGeneralization",
                    	    								lv_ownedGeneralization_6_0,
                    	    								"org.omg.sysml.Alf.Generalization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
    // InternalAlf.g:419:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:419:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:420:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:426:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:432:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:433:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:433:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:434:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:434:3: ( ruleQualifiedName )
            // InternalAlf.g:435:4: ruleQualifiedName
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
    // InternalAlf.g:452:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:452:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:453:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalAlf.g:459:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_memberNaming_2_0= ruleClassMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_memberNaming_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:465:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_memberNaming_2_0= ruleClassMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:466:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_memberNaming_2_0= ruleClassMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:466:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_memberNaming_2_0= ruleClassMember ) )* otherlv_3= '}' )
            // InternalAlf.g:467:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_memberNaming_2_0= ruleClassMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:479:3: ( (lv_memberNaming_2_0= ruleClassMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=25 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAlf.g:480:4: (lv_memberNaming_2_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:480:4: (lv_memberNaming_2_0= ruleClassMember )
            	    // InternalAlf.g:481:5: lv_memberNaming_2_0= ruleClassMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMemberNamingClassMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_memberNaming_2_0=ruleClassMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"memberNaming",
            	    						lv_memberNaming_2_0,
            	    						"org.omg.sysml.Alf.ClassMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalAlf.g:506:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:506:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:507:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:513:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:519:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:520:2: this_ClassDefinition_0= ruleClassDefinition
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
    // InternalAlf.g:531:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:531:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:532:2: iv_ruleClassMember= ruleClassMember EOF
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
    // InternalAlf.g:538:1: ruleClassMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) ( (lv_ownedElement_1_0= ruleFeatureDefinition ) ) ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedElement_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:544:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) ( (lv_ownedElement_1_0= ruleFeatureDefinition ) ) ) )
            // InternalAlf.g:545:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) ( (lv_ownedElement_1_0= ruleFeatureDefinition ) ) )
            {
            // InternalAlf.g:545:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) ( (lv_ownedElement_1_0= ruleFeatureDefinition ) ) )
            // InternalAlf.g:546:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) ( (lv_ownedElement_1_0= ruleFeatureDefinition ) )
            {
            // InternalAlf.g:546:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalAlf.g:547:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalAlf.g:547:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalAlf.g:548:5: lv_visibility_0_0= ruleVisibilityIndicator
            {

            					newCompositeNode(grammarAccess.getClassMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_visibility_0_0=ruleVisibilityIndicator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassMemberRule());
            					}
            					set(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"org.omg.sysml.Alf.VisibilityIndicator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:565:3: ( (lv_ownedElement_1_0= ruleFeatureDefinition ) )
            // InternalAlf.g:566:4: (lv_ownedElement_1_0= ruleFeatureDefinition )
            {
            // InternalAlf.g:566:4: (lv_ownedElement_1_0= ruleFeatureDefinition )
            // InternalAlf.g:567:5: lv_ownedElement_1_0= ruleFeatureDefinition
            {

            					newCompositeNode(grammarAccess.getClassMemberAccess().getOwnedElementFeatureDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedElement_1_0=ruleFeatureDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassMemberRule());
            					}
            					add(
            						current,
            						"ownedElement",
            						lv_ownedElement_1_0,
            						"org.omg.sysml.Alf.FeatureDefinition");
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
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:588:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:588:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:589:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:595:1: ruleFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:601:2: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalAlf.g:602:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalAlf.g:602:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalAlf.g:603:3: ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalAlf.g:603:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:604:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:604:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:605:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureDefinitionAccess().getColonKeyword_1());
            		
            // InternalAlf.g:626:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:627:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:627:4: ( ruleQualifiedName )
            // InternalAlf.g:628:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_2_0());
            				
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_3());
            		

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
    // InternalAlf.g:650:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:650:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:651:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:657:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:663:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:664:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:664:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_UNRESTRICTED_NAME) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:665:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:673:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:684:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:684:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:685:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:691:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:697:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalAlf.g:698:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:698:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalAlf.g:699:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:709:3: (kw= '.' this_Name_2= ruleName )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAlf.g:710:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,24,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_13);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "ruleImportVisibilityIndicator"
    // InternalAlf.g:730:1: ruleImportVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleImportVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:736:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:737:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:737:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlf.g:738:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:738:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:739:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getImportVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImportVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:746:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:746:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:747:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getImportVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImportVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleImportVisibilityIndicator"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalAlf.g:757:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:763:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalAlf.g:764:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalAlf.g:764:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAlf.g:765:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:765:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:766:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:773:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:773:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:774:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:781:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:781:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:782:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000E020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});

}