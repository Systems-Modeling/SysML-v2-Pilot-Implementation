package org.omg.kerml.expressions.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.omg.kerml.expressions.xtext.services.KerMLExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKerMLExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_VALUE", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'?'", "'else'", "'if'", "'??'", "'implies'", "'|'", "'or'", "'xor'", "'&'", "'and'", "'=='", "'!='", "'==='", "'!=='", "'hastype'", "'istype'", "'@'", "'@@'", "'as'", "'meta'", "'<'", "'>'", "'<='", "'>='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'^'", "'~'", "'not'", "'all'", "'.'", "'#'", "'('", "')'", "'['", "']'", "'->'", "'.?'", "'{'", "';'", "'}'", "'in'", "','", "'metadata'", "'='", "'null'", "'true'", "'false'", "'::'"
    };
    public static final int T__50=50;
    public static final int RULE_SL_NOTE=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int RULE_DECIMAL_VALUE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=10;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_REGULAR_COMMENT=9;
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
    public static final int RULE_WS=12;
    public static final int RULE_UNRESTRICTED_NAME=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=4;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_EXP_VALUE=6;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKerMLExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKerMLExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKerMLExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKerMLExpressions.g"; }



     	private KerMLExpressionsGrammarAccess grammarAccess;

        public InternalKerMLExpressionsParser(TokenStream input, KerMLExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OwnedExpressionMember";
       	}

       	@Override
       	protected KerMLExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOwnedExpressionMember"
    // InternalKerMLExpressions.g:64:1: entryRuleOwnedExpressionMember returns [EObject current=null] : iv_ruleOwnedExpressionMember= ruleOwnedExpressionMember EOF ;
    public final EObject entryRuleOwnedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:64:62: (iv_ruleOwnedExpressionMember= ruleOwnedExpressionMember EOF )
            // InternalKerMLExpressions.g:65:2: iv_ruleOwnedExpressionMember= ruleOwnedExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getOwnedExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedExpressionMember=ruleOwnedExpressionMember();

            state._fsp--;

             current =iv_ruleOwnedExpressionMember; 
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
    // $ANTLR end "entryRuleOwnedExpressionMember"


    // $ANTLR start "ruleOwnedExpressionMember"
    // InternalKerMLExpressions.g:71:1: ruleOwnedExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleOwnedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:77:2: ( ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:78:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:78:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:79:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:79:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:80:4: lv_ownedRelatedElement_0_0= ruleOwnedExpression
            {

            				newCompositeNode(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleOwnedExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOwnedExpressionMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
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
    // $ANTLR end "ruleOwnedExpressionMember"


    // $ANTLR start "entryRuleOwnedExpression"
    // InternalKerMLExpressions.g:100:1: entryRuleOwnedExpression returns [EObject current=null] : iv_ruleOwnedExpression= ruleOwnedExpression EOF ;
    public final EObject entryRuleOwnedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedExpression = null;


        try {
            // InternalKerMLExpressions.g:100:56: (iv_ruleOwnedExpression= ruleOwnedExpression EOF )
            // InternalKerMLExpressions.g:101:2: iv_ruleOwnedExpression= ruleOwnedExpression EOF
            {
             newCompositeNode(grammarAccess.getOwnedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedExpression=ruleOwnedExpression();

            state._fsp--;

             current =iv_ruleOwnedExpression; 
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
    // $ANTLR end "entryRuleOwnedExpression"


    // $ANTLR start "ruleOwnedExpression"
    // InternalKerMLExpressions.g:107:1: ruleOwnedExpression returns [EObject current=null] : this_ConditionalExpression_0= ruleConditionalExpression ;
    public final EObject ruleOwnedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:113:2: (this_ConditionalExpression_0= ruleConditionalExpression )
            // InternalKerMLExpressions.g:114:2: this_ConditionalExpression_0= ruleConditionalExpression
            {

            		newCompositeNode(grammarAccess.getOwnedExpressionAccess().getConditionalExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;


            		current = this_ConditionalExpression_0;
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
    // $ANTLR end "ruleOwnedExpression"


    // $ANTLR start "entryRuleOwnedExpressionReference"
    // InternalKerMLExpressions.g:125:1: entryRuleOwnedExpressionReference returns [EObject current=null] : iv_ruleOwnedExpressionReference= ruleOwnedExpressionReference EOF ;
    public final EObject entryRuleOwnedExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:125:65: (iv_ruleOwnedExpressionReference= ruleOwnedExpressionReference EOF )
            // InternalKerMLExpressions.g:126:2: iv_ruleOwnedExpressionReference= ruleOwnedExpressionReference EOF
            {
             newCompositeNode(grammarAccess.getOwnedExpressionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedExpressionReference=ruleOwnedExpressionReference();

            state._fsp--;

             current =iv_ruleOwnedExpressionReference; 
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
    // $ANTLR end "entryRuleOwnedExpressionReference"


    // $ANTLR start "ruleOwnedExpressionReference"
    // InternalKerMLExpressions.g:132:1: ruleOwnedExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) ;
    public final EObject ruleOwnedExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:138:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) )
            // InternalKerMLExpressions.g:139:2: ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) )
            {
            // InternalKerMLExpressions.g:139:2: ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:140:3: (lv_ownedRelationship_0_0= ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:140:3: (lv_ownedRelationship_0_0= ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:141:4: lv_ownedRelationship_0_0= ruleOwnedExpressionMember
            {

            				newCompositeNode(grammarAccess.getOwnedExpressionReferenceAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleOwnedExpressionMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOwnedExpressionReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionMember");
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
    // $ANTLR end "ruleOwnedExpressionReference"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalKerMLExpressions.g:161:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalKerMLExpressions.g:161:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalKerMLExpressions.g:162:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;

             current =iv_ruleConditionalExpression; 
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
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalKerMLExpressions.g:168:1: ruleConditionalExpression returns [EObject current=null] : (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleNullCoalescingExpression ) ) otherlv_4= '?' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) otherlv_6= 'else' ( (lv_operand_7_0= ruleOwnedExpressionReference ) ) ) ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_NullCoalescingExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_operand_5_0 = null;

        EObject lv_operand_7_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:174:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleNullCoalescingExpression ) ) otherlv_4= '?' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) otherlv_6= 'else' ( (lv_operand_7_0= ruleOwnedExpressionReference ) ) ) ) )
            // InternalKerMLExpressions.g:175:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleNullCoalescingExpression ) ) otherlv_4= '?' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) otherlv_6= 'else' ( (lv_operand_7_0= ruleOwnedExpressionReference ) ) ) )
            {
            // InternalKerMLExpressions.g:175:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleNullCoalescingExpression ) ) otherlv_4= '?' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) otherlv_6= 'else' ( (lv_operand_7_0= ruleOwnedExpressionReference ) ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EOF||(LA1_0>=RULE_STRING_VALUE && LA1_0<=RULE_UNRESTRICTED_NAME)||(LA1_0>=27 && LA1_0<=29)||LA1_0==31||(LA1_0>=38 && LA1_0<=40)||(LA1_0>=45 && LA1_0<=48)||LA1_0==50||LA1_0==56||(LA1_0>=63 && LA1_0<=65)) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKerMLExpressions.g:176:3: this_NullCoalescingExpression_0= ruleNullCoalescingExpression
                    {

                    			newCompositeNode(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullCoalescingExpression_0=ruleNullCoalescingExpression();

                    state._fsp--;


                    			current = this_NullCoalescingExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:185:3: ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleNullCoalescingExpression ) ) otherlv_4= '?' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) otherlv_6= 'else' ( (lv_operand_7_0= ruleOwnedExpressionReference ) ) )
                    {
                    // InternalKerMLExpressions.g:185:3: ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleNullCoalescingExpression ) ) otherlv_4= '?' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) otherlv_6= 'else' ( (lv_operand_7_0= ruleOwnedExpressionReference ) ) )
                    // InternalKerMLExpressions.g:186:4: () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleNullCoalescingExpression ) ) otherlv_4= '?' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) otherlv_6= 'else' ( (lv_operand_7_0= ruleOwnedExpressionReference ) )
                    {
                    // InternalKerMLExpressions.g:186:4: ()
                    // InternalKerMLExpressions.g:187:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionalExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:193:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKerMLExpressions.g:194:5: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKerMLExpressions.g:194:5: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKerMLExpressions.g:195:6: lv_operator_2_0= ruleConditionalOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_operator_2_0=ruleConditionalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:212:4: ( (lv_operand_3_0= ruleNullCoalescingExpression ) )
                    // InternalKerMLExpressions.g:213:5: (lv_operand_3_0= ruleNullCoalescingExpression )
                    {
                    // InternalKerMLExpressions.g:213:5: (lv_operand_3_0= ruleNullCoalescingExpression )
                    // InternalKerMLExpressions.g:214:6: lv_operand_3_0= ruleNullCoalescingExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandNullCoalescingExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_operand_3_0=ruleNullCoalescingExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.NullCoalescingExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_3());
                    			
                    // InternalKerMLExpressions.g:235:4: ( (lv_operand_5_0= ruleOwnedExpressionReference ) )
                    // InternalKerMLExpressions.g:236:5: (lv_operand_5_0= ruleOwnedExpressionReference )
                    {
                    // InternalKerMLExpressions.g:236:5: (lv_operand_5_0= ruleOwnedExpressionReference )
                    // InternalKerMLExpressions.g:237:6: lv_operand_5_0= ruleOwnedExpressionReference
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionReferenceParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operand_5_0=ruleOwnedExpressionReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_5_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionalExpressionAccess().getElseKeyword_1_5());
                    			
                    // InternalKerMLExpressions.g:258:4: ( (lv_operand_7_0= ruleOwnedExpressionReference ) )
                    // InternalKerMLExpressions.g:259:5: (lv_operand_7_0= ruleOwnedExpressionReference )
                    {
                    // InternalKerMLExpressions.g:259:5: (lv_operand_7_0= ruleOwnedExpressionReference )
                    // InternalKerMLExpressions.g:260:6: lv_operand_7_0= ruleOwnedExpressionReference
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionReferenceParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_7_0=ruleOwnedExpressionReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_7_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionReference");
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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleConditionalOperator"
    // InternalKerMLExpressions.g:282:1: entryRuleConditionalOperator returns [String current=null] : iv_ruleConditionalOperator= ruleConditionalOperator EOF ;
    public final String entryRuleConditionalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOperator = null;


        try {
            // InternalKerMLExpressions.g:282:59: (iv_ruleConditionalOperator= ruleConditionalOperator EOF )
            // InternalKerMLExpressions.g:283:2: iv_ruleConditionalOperator= ruleConditionalOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOperator=ruleConditionalOperator();

            state._fsp--;

             current =iv_ruleConditionalOperator.getText(); 
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
    // $ANTLR end "entryRuleConditionalOperator"


    // $ANTLR start "ruleConditionalOperator"
    // InternalKerMLExpressions.g:289:1: ruleConditionalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleConditionalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:295:2: (kw= 'if' )
            // InternalKerMLExpressions.g:296:2: kw= 'if'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalOperatorAccess().getIfKeyword());
            	

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
    // $ANTLR end "ruleConditionalOperator"


    // $ANTLR start "entryRuleNullCoalescingExpression"
    // InternalKerMLExpressions.g:304:1: entryRuleNullCoalescingExpression returns [EObject current=null] : iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF ;
    public final EObject entryRuleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCoalescingExpression = null;


        try {
            // InternalKerMLExpressions.g:304:65: (iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF )
            // InternalKerMLExpressions.g:305:2: iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF
            {
             newCompositeNode(grammarAccess.getNullCoalescingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullCoalescingExpression=ruleNullCoalescingExpression();

            state._fsp--;

             current =iv_ruleNullCoalescingExpression; 
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
    // $ANTLR end "entryRuleNullCoalescingExpression"


    // $ANTLR start "ruleNullCoalescingExpression"
    // InternalKerMLExpressions.g:311:1: ruleNullCoalescingExpression returns [EObject current=null] : (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )* ) ;
    public final EObject ruleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:317:2: ( (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )* ) )
            // InternalKerMLExpressions.g:318:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )* )
            {
            // InternalKerMLExpressions.g:318:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )* )
            // InternalKerMLExpressions.g:319:3: this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )*
            {

            			newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;


            			current = this_ImpliesExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:327:3: ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKerMLExpressions.g:328:4: () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) )
            	    {
            	    // InternalKerMLExpressions.g:328:4: ()
            	    // InternalKerMLExpressions.g:329:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:335:4: ( (lv_operator_2_0= ruleNullCoalescingOperator ) )
            	    // InternalKerMLExpressions.g:336:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    {
            	    // InternalKerMLExpressions.g:336:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    // InternalKerMLExpressions.g:337:6: lv_operator_2_0= ruleNullCoalescingOperator
            	    {

            	    						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperatorNullCoalescingOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operator_2_0=ruleNullCoalescingOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNullCoalescingExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.NullCoalescingOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalKerMLExpressions.g:354:4: ( (lv_operand_3_0= ruleImpliesExpressionReference ) )
            	    // InternalKerMLExpressions.g:355:5: (lv_operand_3_0= ruleImpliesExpressionReference )
            	    {
            	    // InternalKerMLExpressions.g:355:5: (lv_operand_3_0= ruleImpliesExpressionReference )
            	    // InternalKerMLExpressions.g:356:6: lv_operand_3_0= ruleImpliesExpressionReference
            	    {

            	    						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperandImpliesExpressionReferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_operand_3_0=ruleImpliesExpressionReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNullCoalescingExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ImpliesExpressionReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleNullCoalescingExpression"


    // $ANTLR start "entryRuleNullCoalescingOperator"
    // InternalKerMLExpressions.g:378:1: entryRuleNullCoalescingOperator returns [String current=null] : iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF ;
    public final String entryRuleNullCoalescingOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullCoalescingOperator = null;


        try {
            // InternalKerMLExpressions.g:378:62: (iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF )
            // InternalKerMLExpressions.g:379:2: iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF
            {
             newCompositeNode(grammarAccess.getNullCoalescingOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullCoalescingOperator=ruleNullCoalescingOperator();

            state._fsp--;

             current =iv_ruleNullCoalescingOperator.getText(); 
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
    // $ANTLR end "entryRuleNullCoalescingOperator"


    // $ANTLR start "ruleNullCoalescingOperator"
    // InternalKerMLExpressions.g:385:1: ruleNullCoalescingOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '??' ;
    public final AntlrDatatypeRuleToken ruleNullCoalescingOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:391:2: (kw= '??' )
            // InternalKerMLExpressions.g:392:2: kw= '??'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNullCoalescingOperatorAccess().getQuestionMarkQuestionMarkKeyword());
            	

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
    // $ANTLR end "ruleNullCoalescingOperator"


    // $ANTLR start "entryRuleImpliesExpressionReference"
    // InternalKerMLExpressions.g:400:1: entryRuleImpliesExpressionReference returns [EObject current=null] : iv_ruleImpliesExpressionReference= ruleImpliesExpressionReference EOF ;
    public final EObject entryRuleImpliesExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:400:67: (iv_ruleImpliesExpressionReference= ruleImpliesExpressionReference EOF )
            // InternalKerMLExpressions.g:401:2: iv_ruleImpliesExpressionReference= ruleImpliesExpressionReference EOF
            {
             newCompositeNode(grammarAccess.getImpliesExpressionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpressionReference=ruleImpliesExpressionReference();

            state._fsp--;

             current =iv_ruleImpliesExpressionReference; 
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
    // $ANTLR end "entryRuleImpliesExpressionReference"


    // $ANTLR start "ruleImpliesExpressionReference"
    // InternalKerMLExpressions.g:407:1: ruleImpliesExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleImpliesExpressionMember ) ) ;
    public final EObject ruleImpliesExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:413:2: ( ( (lv_ownedRelationship_0_0= ruleImpliesExpressionMember ) ) )
            // InternalKerMLExpressions.g:414:2: ( (lv_ownedRelationship_0_0= ruleImpliesExpressionMember ) )
            {
            // InternalKerMLExpressions.g:414:2: ( (lv_ownedRelationship_0_0= ruleImpliesExpressionMember ) )
            // InternalKerMLExpressions.g:415:3: (lv_ownedRelationship_0_0= ruleImpliesExpressionMember )
            {
            // InternalKerMLExpressions.g:415:3: (lv_ownedRelationship_0_0= ruleImpliesExpressionMember )
            // InternalKerMLExpressions.g:416:4: lv_ownedRelationship_0_0= ruleImpliesExpressionMember
            {

            				newCompositeNode(grammarAccess.getImpliesExpressionReferenceAccess().getOwnedRelationshipImpliesExpressionMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleImpliesExpressionMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImpliesExpressionReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.ImpliesExpressionMember");
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
    // $ANTLR end "ruleImpliesExpressionReference"


    // $ANTLR start "entryRuleImpliesExpressionMember"
    // InternalKerMLExpressions.g:436:1: entryRuleImpliesExpressionMember returns [EObject current=null] : iv_ruleImpliesExpressionMember= ruleImpliesExpressionMember EOF ;
    public final EObject entryRuleImpliesExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:436:64: (iv_ruleImpliesExpressionMember= ruleImpliesExpressionMember EOF )
            // InternalKerMLExpressions.g:437:2: iv_ruleImpliesExpressionMember= ruleImpliesExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getImpliesExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpressionMember=ruleImpliesExpressionMember();

            state._fsp--;

             current =iv_ruleImpliesExpressionMember; 
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
    // $ANTLR end "entryRuleImpliesExpressionMember"


    // $ANTLR start "ruleImpliesExpressionMember"
    // InternalKerMLExpressions.g:443:1: ruleImpliesExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleImpliesExpression ) ) ;
    public final EObject ruleImpliesExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:449:2: ( ( (lv_ownedRelatedElement_0_0= ruleImpliesExpression ) ) )
            // InternalKerMLExpressions.g:450:2: ( (lv_ownedRelatedElement_0_0= ruleImpliesExpression ) )
            {
            // InternalKerMLExpressions.g:450:2: ( (lv_ownedRelatedElement_0_0= ruleImpliesExpression ) )
            // InternalKerMLExpressions.g:451:3: (lv_ownedRelatedElement_0_0= ruleImpliesExpression )
            {
            // InternalKerMLExpressions.g:451:3: (lv_ownedRelatedElement_0_0= ruleImpliesExpression )
            // InternalKerMLExpressions.g:452:4: lv_ownedRelatedElement_0_0= ruleImpliesExpression
            {

            				newCompositeNode(grammarAccess.getImpliesExpressionMemberAccess().getOwnedRelatedElementImpliesExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleImpliesExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImpliesExpressionMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.ImpliesExpression");
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
    // $ANTLR end "ruleImpliesExpressionMember"


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalKerMLExpressions.g:472:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalKerMLExpressions.g:472:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalKerMLExpressions.g:473:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
             newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;

             current =iv_ruleImpliesExpression; 
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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalKerMLExpressions.g:479:1: ruleImpliesExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:485:2: ( (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )* ) )
            // InternalKerMLExpressions.g:486:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )* )
            {
            // InternalKerMLExpressions.g:486:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )* )
            // InternalKerMLExpressions.g:487:3: this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            			current = this_OrExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:495:3: ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKerMLExpressions.g:496:4: () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) )
            	    {
            	    // InternalKerMLExpressions.g:496:4: ()
            	    // InternalKerMLExpressions.g:497:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getImpliesExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:503:4: ( (lv_operator_2_0= ruleImpliesOperator ) )
            	    // InternalKerMLExpressions.g:504:5: (lv_operator_2_0= ruleImpliesOperator )
            	    {
            	    // InternalKerMLExpressions.g:504:5: (lv_operator_2_0= ruleImpliesOperator )
            	    // InternalKerMLExpressions.g:505:6: lv_operator_2_0= ruleImpliesOperator
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operator_2_0=ruleImpliesOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ImpliesOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalKerMLExpressions.g:522:4: ( (lv_operand_3_0= ruleOrExpressionReference ) )
            	    // InternalKerMLExpressions.g:523:5: (lv_operand_3_0= ruleOrExpressionReference )
            	    {
            	    // InternalKerMLExpressions.g:523:5: (lv_operand_3_0= ruleOrExpressionReference )
            	    // InternalKerMLExpressions.g:524:6: lv_operand_3_0= ruleOrExpressionReference
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperandOrExpressionReferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_operand_3_0=ruleOrExpressionReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OrExpressionReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleImpliesOperator"
    // InternalKerMLExpressions.g:546:1: entryRuleImpliesOperator returns [String current=null] : iv_ruleImpliesOperator= ruleImpliesOperator EOF ;
    public final String entryRuleImpliesOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpliesOperator = null;


        try {
            // InternalKerMLExpressions.g:546:55: (iv_ruleImpliesOperator= ruleImpliesOperator EOF )
            // InternalKerMLExpressions.g:547:2: iv_ruleImpliesOperator= ruleImpliesOperator EOF
            {
             newCompositeNode(grammarAccess.getImpliesOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpliesOperator=ruleImpliesOperator();

            state._fsp--;

             current =iv_ruleImpliesOperator.getText(); 
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
    // $ANTLR end "entryRuleImpliesOperator"


    // $ANTLR start "ruleImpliesOperator"
    // InternalKerMLExpressions.g:553:1: ruleImpliesOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'implies' ;
    public final AntlrDatatypeRuleToken ruleImpliesOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:559:2: (kw= 'implies' )
            // InternalKerMLExpressions.g:560:2: kw= 'implies'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getImpliesOperatorAccess().getImpliesKeyword());
            	

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
    // $ANTLR end "ruleImpliesOperator"


    // $ANTLR start "entryRuleOrExpressionReference"
    // InternalKerMLExpressions.g:568:1: entryRuleOrExpressionReference returns [EObject current=null] : iv_ruleOrExpressionReference= ruleOrExpressionReference EOF ;
    public final EObject entryRuleOrExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:568:62: (iv_ruleOrExpressionReference= ruleOrExpressionReference EOF )
            // InternalKerMLExpressions.g:569:2: iv_ruleOrExpressionReference= ruleOrExpressionReference EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpressionReference=ruleOrExpressionReference();

            state._fsp--;

             current =iv_ruleOrExpressionReference; 
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
    // $ANTLR end "entryRuleOrExpressionReference"


    // $ANTLR start "ruleOrExpressionReference"
    // InternalKerMLExpressions.g:575:1: ruleOrExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleOrExpressionMember ) ) ;
    public final EObject ruleOrExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:581:2: ( ( (lv_ownedRelationship_0_0= ruleOrExpressionMember ) ) )
            // InternalKerMLExpressions.g:582:2: ( (lv_ownedRelationship_0_0= ruleOrExpressionMember ) )
            {
            // InternalKerMLExpressions.g:582:2: ( (lv_ownedRelationship_0_0= ruleOrExpressionMember ) )
            // InternalKerMLExpressions.g:583:3: (lv_ownedRelationship_0_0= ruleOrExpressionMember )
            {
            // InternalKerMLExpressions.g:583:3: (lv_ownedRelationship_0_0= ruleOrExpressionMember )
            // InternalKerMLExpressions.g:584:4: lv_ownedRelationship_0_0= ruleOrExpressionMember
            {

            				newCompositeNode(grammarAccess.getOrExpressionReferenceAccess().getOwnedRelationshipOrExpressionMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleOrExpressionMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOrExpressionReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.OrExpressionMember");
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
    // $ANTLR end "ruleOrExpressionReference"


    // $ANTLR start "entryRuleOrExpressionMember"
    // InternalKerMLExpressions.g:604:1: entryRuleOrExpressionMember returns [EObject current=null] : iv_ruleOrExpressionMember= ruleOrExpressionMember EOF ;
    public final EObject entryRuleOrExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:604:59: (iv_ruleOrExpressionMember= ruleOrExpressionMember EOF )
            // InternalKerMLExpressions.g:605:2: iv_ruleOrExpressionMember= ruleOrExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpressionMember=ruleOrExpressionMember();

            state._fsp--;

             current =iv_ruleOrExpressionMember; 
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
    // $ANTLR end "entryRuleOrExpressionMember"


    // $ANTLR start "ruleOrExpressionMember"
    // InternalKerMLExpressions.g:611:1: ruleOrExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOrExpression ) ) ;
    public final EObject ruleOrExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:617:2: ( ( (lv_ownedRelatedElement_0_0= ruleOrExpression ) ) )
            // InternalKerMLExpressions.g:618:2: ( (lv_ownedRelatedElement_0_0= ruleOrExpression ) )
            {
            // InternalKerMLExpressions.g:618:2: ( (lv_ownedRelatedElement_0_0= ruleOrExpression ) )
            // InternalKerMLExpressions.g:619:3: (lv_ownedRelatedElement_0_0= ruleOrExpression )
            {
            // InternalKerMLExpressions.g:619:3: (lv_ownedRelatedElement_0_0= ruleOrExpression )
            // InternalKerMLExpressions.g:620:4: lv_ownedRelatedElement_0_0= ruleOrExpression
            {

            				newCompositeNode(grammarAccess.getOrExpressionMemberAccess().getOwnedRelatedElementOrExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleOrExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOrExpressionMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.OrExpression");
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
    // $ANTLR end "ruleOrExpressionMember"


    // $ANTLR start "entryRuleOrExpression"
    // InternalKerMLExpressions.g:640:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalKerMLExpressions.g:640:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLExpressions.g:641:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalKerMLExpressions.g:647:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_operand_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:653:2: ( (this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )* ) )
            // InternalKerMLExpressions.g:654:2: (this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )* )
            {
            // InternalKerMLExpressions.g:654:2: (this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )* )
            // InternalKerMLExpressions.g:655:3: this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:663:3: ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKerMLExpressions.g:664:4: () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) )
            	    {
            	    // InternalKerMLExpressions.g:664:4: ()
            	    // InternalKerMLExpressions.g:665:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:671:4: ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==18) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==19) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalKerMLExpressions.g:672:5: ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )
            	            {
            	            // InternalKerMLExpressions.g:672:5: ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )
            	            // InternalKerMLExpressions.g:673:6: ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) )
            	            {
            	            // InternalKerMLExpressions.g:673:6: ( (lv_operator_2_0= ruleOrOperator ) )
            	            // InternalKerMLExpressions.g:674:7: (lv_operator_2_0= ruleOrOperator )
            	            {
            	            // InternalKerMLExpressions.g:674:7: (lv_operator_2_0= ruleOrOperator )
            	            // InternalKerMLExpressions.g:675:8: lv_operator_2_0= ruleOrOperator
            	            {

            	            								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0_0());
            	            							
            	            pushFollow(FOLLOW_3);
            	            lv_operator_2_0=ruleOrOperator();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	            								}
            	            								set(
            	            									current,
            	            									"operator",
            	            									lv_operator_2_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.OrOperator");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalKerMLExpressions.g:692:6: ( (lv_operand_3_0= ruleXorExpression ) )
            	            // InternalKerMLExpressions.g:693:7: (lv_operand_3_0= ruleXorExpression )
            	            {
            	            // InternalKerMLExpressions.g:693:7: (lv_operand_3_0= ruleXorExpression )
            	            // InternalKerMLExpressions.g:694:8: lv_operand_3_0= ruleXorExpression
            	            {

            	            								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_1_0_1_0());
            	            							
            	            pushFollow(FOLLOW_9);
            	            lv_operand_3_0=ruleXorExpression();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_3_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.XorExpression");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLExpressions.g:713:5: ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) )
            	            {
            	            // InternalKerMLExpressions.g:713:5: ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) )
            	            // InternalKerMLExpressions.g:714:6: ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) )
            	            {
            	            // InternalKerMLExpressions.g:714:6: ( (lv_operator_4_0= ruleConditionalOrOperator ) )
            	            // InternalKerMLExpressions.g:715:7: (lv_operator_4_0= ruleConditionalOrOperator )
            	            {
            	            // InternalKerMLExpressions.g:715:7: (lv_operator_4_0= ruleConditionalOrOperator )
            	            // InternalKerMLExpressions.g:716:8: lv_operator_4_0= ruleConditionalOrOperator
            	            {

            	            								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorConditionalOrOperatorParserRuleCall_1_1_1_0_0());
            	            							
            	            pushFollow(FOLLOW_3);
            	            lv_operator_4_0=ruleConditionalOrOperator();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	            								}
            	            								set(
            	            									current,
            	            									"operator",
            	            									lv_operator_4_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalOrOperator");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalKerMLExpressions.g:733:6: ( (lv_operand_5_0= ruleXorExpressionReference ) )
            	            // InternalKerMLExpressions.g:734:7: (lv_operand_5_0= ruleXorExpressionReference )
            	            {
            	            // InternalKerMLExpressions.g:734:7: (lv_operand_5_0= ruleXorExpressionReference )
            	            // InternalKerMLExpressions.g:735:8: lv_operand_5_0= ruleXorExpressionReference
            	            {

            	            								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandXorExpressionReferenceParserRuleCall_1_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_9);
            	            lv_operand_5_0=ruleXorExpressionReference();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_5_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.XorExpressionReference");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrOperator"
    // InternalKerMLExpressions.g:759:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalKerMLExpressions.g:759:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalKerMLExpressions.g:760:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
             newCompositeNode(grammarAccess.getOrOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;

             current =iv_ruleOrOperator.getText(); 
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
    // $ANTLR end "entryRuleOrOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalKerMLExpressions.g:766:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:772:2: (kw= '|' )
            // InternalKerMLExpressions.g:773:2: kw= '|'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineKeyword());
            	

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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleConditionalOrOperator"
    // InternalKerMLExpressions.g:781:1: entryRuleConditionalOrOperator returns [String current=null] : iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF ;
    public final String entryRuleConditionalOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOrOperator = null;


        try {
            // InternalKerMLExpressions.g:781:61: (iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF )
            // InternalKerMLExpressions.g:782:2: iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionalOrOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOrOperator=ruleConditionalOrOperator();

            state._fsp--;

             current =iv_ruleConditionalOrOperator.getText(); 
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
    // $ANTLR end "entryRuleConditionalOrOperator"


    // $ANTLR start "ruleConditionalOrOperator"
    // InternalKerMLExpressions.g:788:1: ruleConditionalOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleConditionalOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:794:2: (kw= 'or' )
            // InternalKerMLExpressions.g:795:2: kw= 'or'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalOrOperatorAccess().getOrKeyword());
            	

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
    // $ANTLR end "ruleConditionalOrOperator"


    // $ANTLR start "entryRuleXorExpressionReference"
    // InternalKerMLExpressions.g:803:1: entryRuleXorExpressionReference returns [EObject current=null] : iv_ruleXorExpressionReference= ruleXorExpressionReference EOF ;
    public final EObject entryRuleXorExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:803:63: (iv_ruleXorExpressionReference= ruleXorExpressionReference EOF )
            // InternalKerMLExpressions.g:804:2: iv_ruleXorExpressionReference= ruleXorExpressionReference EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpressionReference=ruleXorExpressionReference();

            state._fsp--;

             current =iv_ruleXorExpressionReference; 
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
    // $ANTLR end "entryRuleXorExpressionReference"


    // $ANTLR start "ruleXorExpressionReference"
    // InternalKerMLExpressions.g:810:1: ruleXorExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleXorExpressionMember ) ) ;
    public final EObject ruleXorExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:816:2: ( ( (lv_ownedRelationship_0_0= ruleXorExpressionMember ) ) )
            // InternalKerMLExpressions.g:817:2: ( (lv_ownedRelationship_0_0= ruleXorExpressionMember ) )
            {
            // InternalKerMLExpressions.g:817:2: ( (lv_ownedRelationship_0_0= ruleXorExpressionMember ) )
            // InternalKerMLExpressions.g:818:3: (lv_ownedRelationship_0_0= ruleXorExpressionMember )
            {
            // InternalKerMLExpressions.g:818:3: (lv_ownedRelationship_0_0= ruleXorExpressionMember )
            // InternalKerMLExpressions.g:819:4: lv_ownedRelationship_0_0= ruleXorExpressionMember
            {

            				newCompositeNode(grammarAccess.getXorExpressionReferenceAccess().getOwnedRelationshipXorExpressionMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleXorExpressionMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getXorExpressionReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.XorExpressionMember");
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
    // $ANTLR end "ruleXorExpressionReference"


    // $ANTLR start "entryRuleXorExpressionMember"
    // InternalKerMLExpressions.g:839:1: entryRuleXorExpressionMember returns [EObject current=null] : iv_ruleXorExpressionMember= ruleXorExpressionMember EOF ;
    public final EObject entryRuleXorExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:839:60: (iv_ruleXorExpressionMember= ruleXorExpressionMember EOF )
            // InternalKerMLExpressions.g:840:2: iv_ruleXorExpressionMember= ruleXorExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpressionMember=ruleXorExpressionMember();

            state._fsp--;

             current =iv_ruleXorExpressionMember; 
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
    // $ANTLR end "entryRuleXorExpressionMember"


    // $ANTLR start "ruleXorExpressionMember"
    // InternalKerMLExpressions.g:846:1: ruleXorExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleXorExpression ) ) ;
    public final EObject ruleXorExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:852:2: ( ( (lv_ownedRelatedElement_0_0= ruleXorExpression ) ) )
            // InternalKerMLExpressions.g:853:2: ( (lv_ownedRelatedElement_0_0= ruleXorExpression ) )
            {
            // InternalKerMLExpressions.g:853:2: ( (lv_ownedRelatedElement_0_0= ruleXorExpression ) )
            // InternalKerMLExpressions.g:854:3: (lv_ownedRelatedElement_0_0= ruleXorExpression )
            {
            // InternalKerMLExpressions.g:854:3: (lv_ownedRelatedElement_0_0= ruleXorExpression )
            // InternalKerMLExpressions.g:855:4: lv_ownedRelatedElement_0_0= ruleXorExpression
            {

            				newCompositeNode(grammarAccess.getXorExpressionMemberAccess().getOwnedRelatedElementXorExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleXorExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getXorExpressionMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.XorExpression");
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
    // $ANTLR end "ruleXorExpressionMember"


    // $ANTLR start "entryRuleXorExpression"
    // InternalKerMLExpressions.g:875:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalKerMLExpressions.g:875:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLExpressions.g:876:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalKerMLExpressions.g:882:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:888:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:889:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:889:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            // InternalKerMLExpressions.g:890:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:898:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKerMLExpressions.g:899:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:899:4: ()
            	    // InternalKerMLExpressions.g:900:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:906:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalKerMLExpressions.g:907:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalKerMLExpressions.g:907:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalKerMLExpressions.g:908:6: lv_operator_2_0= ruleXorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operator_2_0=ruleXorOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.XorOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalKerMLExpressions.g:925:4: ( (lv_operand_3_0= ruleAndExpression ) )
            	    // InternalKerMLExpressions.g:926:5: (lv_operand_3_0= ruleAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:926:5: (lv_operand_3_0= ruleAndExpression )
            	    // InternalKerMLExpressions.g:927:6: lv_operand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operand_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXorOperator"
    // InternalKerMLExpressions.g:949:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalKerMLExpressions.g:949:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalKerMLExpressions.g:950:2: iv_ruleXorOperator= ruleXorOperator EOF
            {
             newCompositeNode(grammarAccess.getXorOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorOperator=ruleXorOperator();

            state._fsp--;

             current =iv_ruleXorOperator.getText(); 
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
    // $ANTLR end "entryRuleXorOperator"


    // $ANTLR start "ruleXorOperator"
    // InternalKerMLExpressions.g:956:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'xor' ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:962:2: (kw= 'xor' )
            // InternalKerMLExpressions.g:963:2: kw= 'xor'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getXorOperatorAccess().getXorKeyword());
            	

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
    // $ANTLR end "ruleXorOperator"


    // $ANTLR start "entryRuleAndExpression"
    // InternalKerMLExpressions.g:971:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalKerMLExpressions.g:971:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLExpressions.g:972:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalKerMLExpressions.g:978:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_operand_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:984:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )* ) )
            // InternalKerMLExpressions.g:985:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )* )
            {
            // InternalKerMLExpressions.g:985:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )* )
            // InternalKerMLExpressions.g:986:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:994:3: ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKerMLExpressions.g:995:4: () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) )
            	    {
            	    // InternalKerMLExpressions.g:995:4: ()
            	    // InternalKerMLExpressions.g:996:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1002:4: ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==21) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==22) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalKerMLExpressions.g:1003:5: ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )
            	            {
            	            // InternalKerMLExpressions.g:1003:5: ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )
            	            // InternalKerMLExpressions.g:1004:6: ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) )
            	            {
            	            // InternalKerMLExpressions.g:1004:6: ( (lv_operator_2_0= ruleAndOperator ) )
            	            // InternalKerMLExpressions.g:1005:7: (lv_operator_2_0= ruleAndOperator )
            	            {
            	            // InternalKerMLExpressions.g:1005:7: (lv_operator_2_0= ruleAndOperator )
            	            // InternalKerMLExpressions.g:1006:8: lv_operator_2_0= ruleAndOperator
            	            {

            	            								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0_0_0());
            	            							
            	            pushFollow(FOLLOW_3);
            	            lv_operator_2_0=ruleAndOperator();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	            								}
            	            								set(
            	            									current,
            	            									"operator",
            	            									lv_operator_2_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.AndOperator");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalKerMLExpressions.g:1023:6: ( (lv_operand_3_0= ruleEqualityExpression ) )
            	            // InternalKerMLExpressions.g:1024:7: (lv_operand_3_0= ruleEqualityExpression )
            	            {
            	            // InternalKerMLExpressions.g:1024:7: (lv_operand_3_0= ruleEqualityExpression )
            	            // InternalKerMLExpressions.g:1025:8: lv_operand_3_0= ruleEqualityExpression
            	            {

            	            								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_1_0_1_0());
            	            							
            	            pushFollow(FOLLOW_11);
            	            lv_operand_3_0=ruleEqualityExpression();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_3_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.EqualityExpression");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLExpressions.g:1044:5: ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) )
            	            {
            	            // InternalKerMLExpressions.g:1044:5: ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) )
            	            // InternalKerMLExpressions.g:1045:6: ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) )
            	            {
            	            // InternalKerMLExpressions.g:1045:6: ( (lv_operator_4_0= ruleConditionalAndOperator ) )
            	            // InternalKerMLExpressions.g:1046:7: (lv_operator_4_0= ruleConditionalAndOperator )
            	            {
            	            // InternalKerMLExpressions.g:1046:7: (lv_operator_4_0= ruleConditionalAndOperator )
            	            // InternalKerMLExpressions.g:1047:8: lv_operator_4_0= ruleConditionalAndOperator
            	            {

            	            								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorConditionalAndOperatorParserRuleCall_1_1_1_0_0());
            	            							
            	            pushFollow(FOLLOW_3);
            	            lv_operator_4_0=ruleConditionalAndOperator();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	            								}
            	            								set(
            	            									current,
            	            									"operator",
            	            									lv_operator_4_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalAndOperator");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalKerMLExpressions.g:1064:6: ( (lv_operand_5_0= ruleEqualityExpressionReference ) )
            	            // InternalKerMLExpressions.g:1065:7: (lv_operand_5_0= ruleEqualityExpressionReference )
            	            {
            	            // InternalKerMLExpressions.g:1065:7: (lv_operand_5_0= ruleEqualityExpressionReference )
            	            // InternalKerMLExpressions.g:1066:8: lv_operand_5_0= ruleEqualityExpressionReference
            	            {

            	            								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionReferenceParserRuleCall_1_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_11);
            	            lv_operand_5_0=ruleEqualityExpressionReference();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_5_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.EqualityExpressionReference");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperator"
    // InternalKerMLExpressions.g:1090:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalKerMLExpressions.g:1090:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalKerMLExpressions.g:1091:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
             newCompositeNode(grammarAccess.getAndOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;

             current =iv_ruleAndOperator.getText(); 
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
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalKerMLExpressions.g:1097:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&' ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1103:2: (kw= '&' )
            // InternalKerMLExpressions.g:1104:2: kw= '&'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandKeyword());
            	

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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleConditionalAndOperator"
    // InternalKerMLExpressions.g:1112:1: entryRuleConditionalAndOperator returns [String current=null] : iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF ;
    public final String entryRuleConditionalAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalAndOperator = null;


        try {
            // InternalKerMLExpressions.g:1112:62: (iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF )
            // InternalKerMLExpressions.g:1113:2: iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionalAndOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAndOperator=ruleConditionalAndOperator();

            state._fsp--;

             current =iv_ruleConditionalAndOperator.getText(); 
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
    // $ANTLR end "entryRuleConditionalAndOperator"


    // $ANTLR start "ruleConditionalAndOperator"
    // InternalKerMLExpressions.g:1119:1: ruleConditionalAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleConditionalAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1125:2: (kw= 'and' )
            // InternalKerMLExpressions.g:1126:2: kw= 'and'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalAndOperatorAccess().getAndKeyword());
            	

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
    // $ANTLR end "ruleConditionalAndOperator"


    // $ANTLR start "entryRuleEqualityExpressionReference"
    // InternalKerMLExpressions.g:1134:1: entryRuleEqualityExpressionReference returns [EObject current=null] : iv_ruleEqualityExpressionReference= ruleEqualityExpressionReference EOF ;
    public final EObject entryRuleEqualityExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:1134:68: (iv_ruleEqualityExpressionReference= ruleEqualityExpressionReference EOF )
            // InternalKerMLExpressions.g:1135:2: iv_ruleEqualityExpressionReference= ruleEqualityExpressionReference EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpressionReference=ruleEqualityExpressionReference();

            state._fsp--;

             current =iv_ruleEqualityExpressionReference; 
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
    // $ANTLR end "entryRuleEqualityExpressionReference"


    // $ANTLR start "ruleEqualityExpressionReference"
    // InternalKerMLExpressions.g:1141:1: ruleEqualityExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleEqualityExpressionMember ) ) ;
    public final EObject ruleEqualityExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1147:2: ( ( (lv_ownedRelationship_0_0= ruleEqualityExpressionMember ) ) )
            // InternalKerMLExpressions.g:1148:2: ( (lv_ownedRelationship_0_0= ruleEqualityExpressionMember ) )
            {
            // InternalKerMLExpressions.g:1148:2: ( (lv_ownedRelationship_0_0= ruleEqualityExpressionMember ) )
            // InternalKerMLExpressions.g:1149:3: (lv_ownedRelationship_0_0= ruleEqualityExpressionMember )
            {
            // InternalKerMLExpressions.g:1149:3: (lv_ownedRelationship_0_0= ruleEqualityExpressionMember )
            // InternalKerMLExpressions.g:1150:4: lv_ownedRelationship_0_0= ruleEqualityExpressionMember
            {

            				newCompositeNode(grammarAccess.getEqualityExpressionReferenceAccess().getOwnedRelationshipEqualityExpressionMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleEqualityExpressionMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEqualityExpressionReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.EqualityExpressionMember");
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
    // $ANTLR end "ruleEqualityExpressionReference"


    // $ANTLR start "entryRuleEqualityExpressionMember"
    // InternalKerMLExpressions.g:1170:1: entryRuleEqualityExpressionMember returns [EObject current=null] : iv_ruleEqualityExpressionMember= ruleEqualityExpressionMember EOF ;
    public final EObject entryRuleEqualityExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:1170:65: (iv_ruleEqualityExpressionMember= ruleEqualityExpressionMember EOF )
            // InternalKerMLExpressions.g:1171:2: iv_ruleEqualityExpressionMember= ruleEqualityExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpressionMember=ruleEqualityExpressionMember();

            state._fsp--;

             current =iv_ruleEqualityExpressionMember; 
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
    // $ANTLR end "entryRuleEqualityExpressionMember"


    // $ANTLR start "ruleEqualityExpressionMember"
    // InternalKerMLExpressions.g:1177:1: ruleEqualityExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleEqualityExpression ) ) ;
    public final EObject ruleEqualityExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1183:2: ( ( (lv_ownedRelatedElement_0_0= ruleEqualityExpression ) ) )
            // InternalKerMLExpressions.g:1184:2: ( (lv_ownedRelatedElement_0_0= ruleEqualityExpression ) )
            {
            // InternalKerMLExpressions.g:1184:2: ( (lv_ownedRelatedElement_0_0= ruleEqualityExpression ) )
            // InternalKerMLExpressions.g:1185:3: (lv_ownedRelatedElement_0_0= ruleEqualityExpression )
            {
            // InternalKerMLExpressions.g:1185:3: (lv_ownedRelatedElement_0_0= ruleEqualityExpression )
            // InternalKerMLExpressions.g:1186:4: lv_ownedRelatedElement_0_0= ruleEqualityExpression
            {

            				newCompositeNode(grammarAccess.getEqualityExpressionMemberAccess().getOwnedRelatedElementEqualityExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleEqualityExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEqualityExpressionMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.EqualityExpression");
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
    // $ANTLR end "ruleEqualityExpressionMember"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalKerMLExpressions.g:1206:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLExpressions.g:1206:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:1207:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalKerMLExpressions.g:1213:1: ruleEqualityExpression returns [EObject current=null] : (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1219:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1220:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1220:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            // InternalKerMLExpressions.g:1221:3: this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_ClassificationExpression_0=ruleClassificationExpression();

            state._fsp--;


            			current = this_ClassificationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1229:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=23 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1230:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1230:4: ()
            	    // InternalKerMLExpressions.g:1231:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1237:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalKerMLExpressions.g:1238:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalKerMLExpressions.g:1238:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalKerMLExpressions.g:1239:6: lv_operator_2_0= ruleEqualityOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operator_2_0=ruleEqualityOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.EqualityOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalKerMLExpressions.g:1256:4: ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    // InternalKerMLExpressions.g:1257:5: (lv_operand_3_0= ruleClassificationExpression )
            	    {
            	    // InternalKerMLExpressions.g:1257:5: (lv_operand_3_0= ruleClassificationExpression )
            	    // InternalKerMLExpressions.g:1258:6: lv_operand_3_0= ruleClassificationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperandClassificationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_operand_3_0=ruleClassificationExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ClassificationExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleEqualityOperator"
    // InternalKerMLExpressions.g:1280:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalKerMLExpressions.g:1280:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:1281:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
             newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;

             current =iv_ruleEqualityOperator.getText(); 
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
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalKerMLExpressions.g:1287:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1293:2: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) )
            // InternalKerMLExpressions.g:1294:2: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            {
            // InternalKerMLExpressions.g:1294:2: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalKerMLExpressions.g:1295:3: kw= '=='
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1301:3: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1307:3: kw= '==='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1313:3: kw= '!=='
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignEqualsSignKeyword_3());
                    		

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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleClassificationExpression"
    // InternalKerMLExpressions.g:1322:1: entryRuleClassificationExpression returns [EObject current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final EObject entryRuleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLExpressions.g:1322:65: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:1323:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
            {
             newCompositeNode(grammarAccess.getClassificationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassificationExpression=ruleClassificationExpression();

            state._fsp--;

             current =iv_ruleClassificationExpression; 
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
    // $ANTLR end "entryRuleClassificationExpression"


    // $ANTLR start "ruleClassificationExpression"
    // InternalKerMLExpressions.g:1329:1: ruleClassificationExpression returns [EObject current=null] : ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) ) ;
    public final EObject ruleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;

        AntlrDatatypeRuleToken lv_operator_5_0 = null;

        EObject lv_ownedRelationship_6_0 = null;

        EObject lv_operand_8_0 = null;

        AntlrDatatypeRuleToken lv_operator_9_0 = null;

        EObject lv_ownedRelationship_10_0 = null;

        EObject lv_operand_12_0 = null;

        AntlrDatatypeRuleToken lv_operator_13_0 = null;

        EObject lv_ownedRelationship_14_0 = null;

        EObject lv_operand_16_0 = null;

        AntlrDatatypeRuleToken lv_operator_17_0 = null;

        EObject lv_ownedRelationship_18_0 = null;

        EObject lv_operand_20_0 = null;

        AntlrDatatypeRuleToken lv_operator_21_0 = null;

        EObject lv_ownedRelationship_22_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1335:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) ) )
            // InternalKerMLExpressions.g:1336:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) )
            {
            // InternalKerMLExpressions.g:1336:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) )
            int alt12=5;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalKerMLExpressions.g:1337:3: (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? )
                    {
                    // InternalKerMLExpressions.g:1337:3: (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? )
                    // InternalKerMLExpressions.g:1338:4: this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_RelationalExpression_0=ruleRelationalExpression();

                    state._fsp--;


                    				current = this_RelationalExpression_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLExpressions.g:1346:4: ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )?
                    int alt11=3;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=27 && LA11_0<=29)) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==31) ) {
                        alt11=2;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalKerMLExpressions.g:1347:5: ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )
                            {
                            // InternalKerMLExpressions.g:1347:5: ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )
                            // InternalKerMLExpressions.g:1348:6: () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            {
                            // InternalKerMLExpressions.g:1348:6: ()
                            // InternalKerMLExpressions.g:1349:7: 
                            {

                            							current = forceCreateModelElementAndAdd(
                            								grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0_0(),
                            								current);
                            						

                            }

                            // InternalKerMLExpressions.g:1355:6: ( (lv_operator_2_0= ruleClassificationTestOperator ) )
                            // InternalKerMLExpressions.g:1356:7: (lv_operator_2_0= ruleClassificationTestOperator )
                            {
                            // InternalKerMLExpressions.g:1356:7: (lv_operator_2_0= ruleClassificationTestOperator )
                            // InternalKerMLExpressions.g:1357:8: lv_operator_2_0= ruleClassificationTestOperator
                            {

                            								newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationTestOperatorParserRuleCall_0_1_0_1_0());
                            							
                            pushFollow(FOLLOW_14);
                            lv_operator_2_0=ruleClassificationTestOperator();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                            								}
                            								set(
                            									current,
                            									"operator",
                            									lv_operator_2_0,
                            									"org.omg.kerml.expressions.xtext.KerMLExpressions.ClassificationTestOperator");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalKerMLExpressions.g:1374:6: ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            // InternalKerMLExpressions.g:1375:7: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            {
                            // InternalKerMLExpressions.g:1375:7: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            // InternalKerMLExpressions.g:1376:8: lv_ownedRelationship_3_0= ruleTypeReferenceMember
                            {

                            								newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_1_0_2_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_ownedRelationship_3_0=ruleTypeReferenceMember();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                            								}
                            								add(
                            									current,
                            									"ownedRelationship",
                            									lv_ownedRelationship_3_0,
                            									"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalKerMLExpressions.g:1395:5: ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) )
                            {
                            // InternalKerMLExpressions.g:1395:5: ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) )
                            // InternalKerMLExpressions.g:1396:6: () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) )
                            {
                            // InternalKerMLExpressions.g:1396:6: ()
                            // InternalKerMLExpressions.g:1397:7: 
                            {

                            							current = forceCreateModelElementAndAdd(
                            								grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_1_0(),
                            								current);
                            						

                            }

                            // InternalKerMLExpressions.g:1403:6: ( (lv_operator_5_0= ruleCastOperator ) )
                            // InternalKerMLExpressions.g:1404:7: (lv_operator_5_0= ruleCastOperator )
                            {
                            // InternalKerMLExpressions.g:1404:7: (lv_operator_5_0= ruleCastOperator )
                            // InternalKerMLExpressions.g:1405:8: lv_operator_5_0= ruleCastOperator
                            {

                            								newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorCastOperatorParserRuleCall_0_1_1_1_0());
                            							
                            pushFollow(FOLLOW_14);
                            lv_operator_5_0=ruleCastOperator();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                            								}
                            								set(
                            									current,
                            									"operator",
                            									lv_operator_5_0,
                            									"org.omg.kerml.expressions.xtext.KerMLExpressions.CastOperator");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalKerMLExpressions.g:1422:6: ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) )
                            // InternalKerMLExpressions.g:1423:7: (lv_ownedRelationship_6_0= ruleTypeResultMember )
                            {
                            // InternalKerMLExpressions.g:1423:7: (lv_ownedRelationship_6_0= ruleTypeResultMember )
                            // InternalKerMLExpressions.g:1424:8: lv_ownedRelationship_6_0= ruleTypeResultMember
                            {

                            								newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeResultMemberParserRuleCall_0_1_1_2_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_ownedRelationship_6_0=ruleTypeResultMember();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                            								}
                            								add(
                            									current,
                            									"ownedRelationship",
                            									lv_ownedRelationship_6_0,
                            									"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeResultMember");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1445:3: ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1445:3: ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1446:4: () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1446:4: ()
                    // InternalKerMLExpressions.g:1447:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1453:4: ( (lv_operand_8_0= ruleSelfReferenceExpression ) )
                    // InternalKerMLExpressions.g:1454:5: (lv_operand_8_0= ruleSelfReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:1454:5: (lv_operand_8_0= ruleSelfReferenceExpression )
                    // InternalKerMLExpressions.g:1455:6: lv_operand_8_0= ruleSelfReferenceExpression
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperandSelfReferenceExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_operand_8_0=ruleSelfReferenceExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_8_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.SelfReferenceExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1472:4: ( (lv_operator_9_0= ruleClassificationTestOperator ) )
                    // InternalKerMLExpressions.g:1473:5: (lv_operator_9_0= ruleClassificationTestOperator )
                    {
                    // InternalKerMLExpressions.g:1473:5: (lv_operator_9_0= ruleClassificationTestOperator )
                    // InternalKerMLExpressions.g:1474:6: lv_operator_9_0= ruleClassificationTestOperator
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationTestOperatorParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_operator_9_0=ruleClassificationTestOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_9_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ClassificationTestOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1491:4: ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1492:5: (lv_ownedRelationship_10_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1492:5: (lv_ownedRelationship_10_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1493:6: lv_ownedRelationship_10_0= ruleTypeReferenceMember
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_10_0=ruleTypeReferenceMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_10_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1512:3: ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1512:3: ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1513:4: () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1513:4: ()
                    // InternalKerMLExpressions.g:1514:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1520:4: ( (lv_operand_12_0= ruleMetadataReference ) )
                    // InternalKerMLExpressions.g:1521:5: (lv_operand_12_0= ruleMetadataReference )
                    {
                    // InternalKerMLExpressions.g:1521:5: (lv_operand_12_0= ruleMetadataReference )
                    // InternalKerMLExpressions.g:1522:6: lv_operand_12_0= ruleMetadataReference
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperandMetadataReferenceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_operand_12_0=ruleMetadataReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_12_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.MetadataReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1539:4: ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) )
                    // InternalKerMLExpressions.g:1540:5: (lv_operator_13_0= ruleMetaClassificationTestOperator )
                    {
                    // InternalKerMLExpressions.g:1540:5: (lv_operator_13_0= ruleMetaClassificationTestOperator )
                    // InternalKerMLExpressions.g:1541:6: lv_operator_13_0= ruleMetaClassificationTestOperator
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorMetaClassificationTestOperatorParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_operator_13_0=ruleMetaClassificationTestOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_13_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.MetaClassificationTestOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1558:4: ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1559:5: (lv_ownedRelationship_14_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1559:5: (lv_ownedRelationship_14_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1560:6: lv_ownedRelationship_14_0= ruleTypeReferenceMember
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_14_0=ruleTypeReferenceMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_14_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1579:3: ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1579:3: ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) )
                    // InternalKerMLExpressions.g:1580:4: () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) )
                    {
                    // InternalKerMLExpressions.g:1580:4: ()
                    // InternalKerMLExpressions.g:1581:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_3_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1587:4: ( (lv_operand_16_0= ruleSelfReferenceExpression ) )
                    // InternalKerMLExpressions.g:1588:5: (lv_operand_16_0= ruleSelfReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:1588:5: (lv_operand_16_0= ruleSelfReferenceExpression )
                    // InternalKerMLExpressions.g:1589:6: lv_operand_16_0= ruleSelfReferenceExpression
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperandSelfReferenceExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_operand_16_0=ruleSelfReferenceExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_16_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.SelfReferenceExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1606:4: ( (lv_operator_17_0= ruleCastOperator ) )
                    // InternalKerMLExpressions.g:1607:5: (lv_operator_17_0= ruleCastOperator )
                    {
                    // InternalKerMLExpressions.g:1607:5: (lv_operator_17_0= ruleCastOperator )
                    // InternalKerMLExpressions.g:1608:6: lv_operator_17_0= ruleCastOperator
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorCastOperatorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_operator_17_0=ruleCastOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_17_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.CastOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1625:4: ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) )
                    // InternalKerMLExpressions.g:1626:5: (lv_ownedRelationship_18_0= ruleTypeResultMember )
                    {
                    // InternalKerMLExpressions.g:1626:5: (lv_ownedRelationship_18_0= ruleTypeResultMember )
                    // InternalKerMLExpressions.g:1627:6: lv_ownedRelationship_18_0= ruleTypeResultMember
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeResultMemberParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_18_0=ruleTypeResultMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_18_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeResultMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:1646:3: ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1646:3: ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) )
                    // InternalKerMLExpressions.g:1647:4: () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) )
                    {
                    // InternalKerMLExpressions.g:1647:4: ()
                    // InternalKerMLExpressions.g:1648:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_4_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1654:4: ( (lv_operand_20_0= ruleMetadataReference ) )
                    // InternalKerMLExpressions.g:1655:5: (lv_operand_20_0= ruleMetadataReference )
                    {
                    // InternalKerMLExpressions.g:1655:5: (lv_operand_20_0= ruleMetadataReference )
                    // InternalKerMLExpressions.g:1656:6: lv_operand_20_0= ruleMetadataReference
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperandMetadataReferenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_operand_20_0=ruleMetadataReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_20_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.MetadataReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1673:4: ( (lv_operator_21_0= ruleMetaCastOperator ) )
                    // InternalKerMLExpressions.g:1674:5: (lv_operator_21_0= ruleMetaCastOperator )
                    {
                    // InternalKerMLExpressions.g:1674:5: (lv_operator_21_0= ruleMetaCastOperator )
                    // InternalKerMLExpressions.g:1675:6: lv_operator_21_0= ruleMetaCastOperator
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorMetaCastOperatorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_operator_21_0=ruleMetaCastOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_21_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.MetaCastOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1692:4: ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) )
                    // InternalKerMLExpressions.g:1693:5: (lv_ownedRelationship_22_0= ruleTypeResultMember )
                    {
                    // InternalKerMLExpressions.g:1693:5: (lv_ownedRelationship_22_0= ruleTypeResultMember )
                    // InternalKerMLExpressions.g:1694:6: lv_ownedRelationship_22_0= ruleTypeResultMember
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeResultMemberParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_22_0=ruleTypeResultMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_22_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeResultMember");
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
    // $ANTLR end "ruleClassificationExpression"


    // $ANTLR start "entryRuleClassificationTestOperator"
    // InternalKerMLExpressions.g:1716:1: entryRuleClassificationTestOperator returns [String current=null] : iv_ruleClassificationTestOperator= ruleClassificationTestOperator EOF ;
    public final String entryRuleClassificationTestOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationTestOperator = null;


        try {
            // InternalKerMLExpressions.g:1716:66: (iv_ruleClassificationTestOperator= ruleClassificationTestOperator EOF )
            // InternalKerMLExpressions.g:1717:2: iv_ruleClassificationTestOperator= ruleClassificationTestOperator EOF
            {
             newCompositeNode(grammarAccess.getClassificationTestOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassificationTestOperator=ruleClassificationTestOperator();

            state._fsp--;

             current =iv_ruleClassificationTestOperator.getText(); 
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
    // $ANTLR end "entryRuleClassificationTestOperator"


    // $ANTLR start "ruleClassificationTestOperator"
    // InternalKerMLExpressions.g:1723:1: ruleClassificationTestOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'hastype' | kw= 'istype' | kw= '@' ) ;
    public final AntlrDatatypeRuleToken ruleClassificationTestOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1729:2: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) )
            // InternalKerMLExpressions.g:1730:2: (kw= 'hastype' | kw= 'istype' | kw= '@' )
            {
            // InternalKerMLExpressions.g:1730:2: (kw= 'hastype' | kw= 'istype' | kw= '@' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalKerMLExpressions.g:1731:3: kw= 'hastype'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationTestOperatorAccess().getHastypeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1737:3: kw= 'istype'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationTestOperatorAccess().getIstypeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1743:3: kw= '@'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationTestOperatorAccess().getCommercialAtKeyword_2());
                    		

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
    // $ANTLR end "ruleClassificationTestOperator"


    // $ANTLR start "entryRuleMetaClassificationTestOperator"
    // InternalKerMLExpressions.g:1752:1: entryRuleMetaClassificationTestOperator returns [String current=null] : iv_ruleMetaClassificationTestOperator= ruleMetaClassificationTestOperator EOF ;
    public final String entryRuleMetaClassificationTestOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetaClassificationTestOperator = null;


        try {
            // InternalKerMLExpressions.g:1752:70: (iv_ruleMetaClassificationTestOperator= ruleMetaClassificationTestOperator EOF )
            // InternalKerMLExpressions.g:1753:2: iv_ruleMetaClassificationTestOperator= ruleMetaClassificationTestOperator EOF
            {
             newCompositeNode(grammarAccess.getMetaClassificationTestOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaClassificationTestOperator=ruleMetaClassificationTestOperator();

            state._fsp--;

             current =iv_ruleMetaClassificationTestOperator.getText(); 
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
    // $ANTLR end "entryRuleMetaClassificationTestOperator"


    // $ANTLR start "ruleMetaClassificationTestOperator"
    // InternalKerMLExpressions.g:1759:1: ruleMetaClassificationTestOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '@@' ;
    public final AntlrDatatypeRuleToken ruleMetaClassificationTestOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1765:2: (kw= '@@' )
            // InternalKerMLExpressions.g:1766:2: kw= '@@'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMetaClassificationTestOperatorAccess().getCommercialAtCommercialAtKeyword());
            	

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
    // $ANTLR end "ruleMetaClassificationTestOperator"


    // $ANTLR start "entryRuleCastOperator"
    // InternalKerMLExpressions.g:1774:1: entryRuleCastOperator returns [String current=null] : iv_ruleCastOperator= ruleCastOperator EOF ;
    public final String entryRuleCastOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCastOperator = null;


        try {
            // InternalKerMLExpressions.g:1774:52: (iv_ruleCastOperator= ruleCastOperator EOF )
            // InternalKerMLExpressions.g:1775:2: iv_ruleCastOperator= ruleCastOperator EOF
            {
             newCompositeNode(grammarAccess.getCastOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCastOperator=ruleCastOperator();

            state._fsp--;

             current =iv_ruleCastOperator.getText(); 
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
    // $ANTLR end "entryRuleCastOperator"


    // $ANTLR start "ruleCastOperator"
    // InternalKerMLExpressions.g:1781:1: ruleCastOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'as' ;
    public final AntlrDatatypeRuleToken ruleCastOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1787:2: (kw= 'as' )
            // InternalKerMLExpressions.g:1788:2: kw= 'as'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCastOperatorAccess().getAsKeyword());
            	

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
    // $ANTLR end "ruleCastOperator"


    // $ANTLR start "entryRuleMetaCastOperator"
    // InternalKerMLExpressions.g:1796:1: entryRuleMetaCastOperator returns [String current=null] : iv_ruleMetaCastOperator= ruleMetaCastOperator EOF ;
    public final String entryRuleMetaCastOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetaCastOperator = null;


        try {
            // InternalKerMLExpressions.g:1796:56: (iv_ruleMetaCastOperator= ruleMetaCastOperator EOF )
            // InternalKerMLExpressions.g:1797:2: iv_ruleMetaCastOperator= ruleMetaCastOperator EOF
            {
             newCompositeNode(grammarAccess.getMetaCastOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaCastOperator=ruleMetaCastOperator();

            state._fsp--;

             current =iv_ruleMetaCastOperator.getText(); 
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
    // $ANTLR end "entryRuleMetaCastOperator"


    // $ANTLR start "ruleMetaCastOperator"
    // InternalKerMLExpressions.g:1803:1: ruleMetaCastOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'meta' ;
    public final AntlrDatatypeRuleToken ruleMetaCastOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1809:2: (kw= 'meta' )
            // InternalKerMLExpressions.g:1810:2: kw= 'meta'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMetaCastOperatorAccess().getMetaKeyword());
            	

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
    // $ANTLR end "ruleMetaCastOperator"


    // $ANTLR start "entryRuleMetadataReference"
    // InternalKerMLExpressions.g:1818:1: entryRuleMetadataReference returns [EObject current=null] : iv_ruleMetadataReference= ruleMetadataReference EOF ;
    public final EObject entryRuleMetadataReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataReference = null;


        try {
            // InternalKerMLExpressions.g:1818:58: (iv_ruleMetadataReference= ruleMetadataReference EOF )
            // InternalKerMLExpressions.g:1819:2: iv_ruleMetadataReference= ruleMetadataReference EOF
            {
             newCompositeNode(grammarAccess.getMetadataReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataReference=ruleMetadataReference();

            state._fsp--;

             current =iv_ruleMetadataReference; 
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
    // $ANTLR end "entryRuleMetadataReference"


    // $ANTLR start "ruleMetadataReference"
    // InternalKerMLExpressions.g:1825:1: ruleMetadataReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleMetadataReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1831:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:1832:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:1832:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:1833:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:1833:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:1834:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMetadataReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getMetadataReferenceAccess().getReferencedElementElementCrossReference_0());
            			
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
    // $ANTLR end "ruleMetadataReference"


    // $ANTLR start "entryRuleTypeReferenceMember"
    // InternalKerMLExpressions.g:1851:1: entryRuleTypeReferenceMember returns [EObject current=null] : iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF ;
    public final EObject entryRuleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1851:60: (iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:1852:2: iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReferenceMember=ruleTypeReferenceMember();

            state._fsp--;

             current =iv_ruleTypeReferenceMember; 
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
    // $ANTLR end "entryRuleTypeReferenceMember"


    // $ANTLR start "ruleTypeReferenceMember"
    // InternalKerMLExpressions.g:1858:1: ruleTypeReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) ;
    public final EObject ruleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1864:2: ( ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) )
            // InternalKerMLExpressions.g:1865:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            {
            // InternalKerMLExpressions.g:1865:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            // InternalKerMLExpressions.g:1866:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            {
            // InternalKerMLExpressions.g:1866:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            // InternalKerMLExpressions.g:1867:4: lv_ownedRelatedElement_0_0= ruleTypeReference
            {

            				newCompositeNode(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementTypeReferenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleTypeReference();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTypeReferenceMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReference");
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
    // $ANTLR end "ruleTypeReferenceMember"


    // $ANTLR start "entryRuleTypeResultMember"
    // InternalKerMLExpressions.g:1887:1: entryRuleTypeResultMember returns [EObject current=null] : iv_ruleTypeResultMember= ruleTypeResultMember EOF ;
    public final EObject entryRuleTypeResultMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeResultMember = null;


        try {
            // InternalKerMLExpressions.g:1887:57: (iv_ruleTypeResultMember= ruleTypeResultMember EOF )
            // InternalKerMLExpressions.g:1888:2: iv_ruleTypeResultMember= ruleTypeResultMember EOF
            {
             newCompositeNode(grammarAccess.getTypeResultMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeResultMember=ruleTypeResultMember();

            state._fsp--;

             current =iv_ruleTypeResultMember; 
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
    // $ANTLR end "entryRuleTypeResultMember"


    // $ANTLR start "ruleTypeResultMember"
    // InternalKerMLExpressions.g:1894:1: ruleTypeResultMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) ;
    public final EObject ruleTypeResultMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1900:2: ( ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) )
            // InternalKerMLExpressions.g:1901:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            {
            // InternalKerMLExpressions.g:1901:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            // InternalKerMLExpressions.g:1902:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            {
            // InternalKerMLExpressions.g:1902:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            // InternalKerMLExpressions.g:1903:4: lv_ownedRelatedElement_0_0= ruleTypeReference
            {

            				newCompositeNode(grammarAccess.getTypeResultMemberAccess().getOwnedRelatedElementTypeReferenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleTypeReference();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTypeResultMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReference");
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
    // $ANTLR end "ruleTypeResultMember"


    // $ANTLR start "entryRuleTypeReference"
    // InternalKerMLExpressions.g:1923:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalKerMLExpressions.g:1923:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalKerMLExpressions.g:1924:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalKerMLExpressions.g:1930:1: ruleTypeReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1936:2: ( ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) )
            // InternalKerMLExpressions.g:1937:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            {
            // InternalKerMLExpressions.g:1937:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:1938:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:1938:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            // InternalKerMLExpressions.g:1939:4: lv_ownedRelationship_0_0= ruleReferenceTyping
            {

            				newCompositeNode(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipReferenceTypingParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleReferenceTyping();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.ReferenceTyping");
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleReferenceTyping"
    // InternalKerMLExpressions.g:1959:1: entryRuleReferenceTyping returns [EObject current=null] : iv_ruleReferenceTyping= ruleReferenceTyping EOF ;
    public final EObject entryRuleReferenceTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTyping = null;


        try {
            // InternalKerMLExpressions.g:1959:56: (iv_ruleReferenceTyping= ruleReferenceTyping EOF )
            // InternalKerMLExpressions.g:1960:2: iv_ruleReferenceTyping= ruleReferenceTyping EOF
            {
             newCompositeNode(grammarAccess.getReferenceTypingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceTyping=ruleReferenceTyping();

            state._fsp--;

             current =iv_ruleReferenceTyping; 
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
    // $ANTLR end "entryRuleReferenceTyping"


    // $ANTLR start "ruleReferenceTyping"
    // InternalKerMLExpressions.g:1966:1: ruleReferenceTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReferenceTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1972:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:1973:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:1973:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:1974:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:1974:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:1975:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReferenceTypingRule());
            				}
            			

            				newCompositeNode(grammarAccess.getReferenceTypingAccess().getTypeTypeCrossReference_0());
            			
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
    // $ANTLR end "ruleReferenceTyping"


    // $ANTLR start "entryRuleSelfReferenceExpression"
    // InternalKerMLExpressions.g:1992:1: entryRuleSelfReferenceExpression returns [EObject current=null] : iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF ;
    public final EObject entryRuleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:1992:64: (iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:1993:2: iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getSelfReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfReferenceExpression=ruleSelfReferenceExpression();

            state._fsp--;

             current =iv_ruleSelfReferenceExpression; 
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
    // $ANTLR end "entryRuleSelfReferenceExpression"


    // $ANTLR start "ruleSelfReferenceExpression"
    // InternalKerMLExpressions.g:1999:1: ruleSelfReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) ;
    public final EObject ruleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2005:2: ( ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) )
            // InternalKerMLExpressions.g:2006:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            {
            // InternalKerMLExpressions.g:2006:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:2007:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:2007:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:2008:4: lv_ownedRelationship_0_0= ruleSelfReferenceMember
            {

            				newCompositeNode(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipSelfReferenceMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleSelfReferenceMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSelfReferenceExpressionRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.SelfReferenceMember");
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
    // $ANTLR end "ruleSelfReferenceExpression"


    // $ANTLR start "entryRuleSelfReferenceMember"
    // InternalKerMLExpressions.g:2028:1: entryRuleSelfReferenceMember returns [EObject current=null] : iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF ;
    public final EObject entryRuleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2028:60: (iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:2029:2: iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF
            {
             newCompositeNode(grammarAccess.getSelfReferenceMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfReferenceMember=ruleSelfReferenceMember();

            state._fsp--;

             current =iv_ruleSelfReferenceMember; 
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
    // $ANTLR end "entryRuleSelfReferenceMember"


    // $ANTLR start "ruleSelfReferenceMember"
    // InternalKerMLExpressions.g:2035:1: ruleSelfReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) ;
    public final EObject ruleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2041:2: ( ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) )
            // InternalKerMLExpressions.g:2042:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            {
            // InternalKerMLExpressions.g:2042:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:2043:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:2043:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            // InternalKerMLExpressions.g:2044:4: lv_ownedRelatedElement_0_0= ruleEmptyFeature
            {

            				newCompositeNode(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementEmptyFeatureParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleEmptyFeature();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSelfReferenceMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.EmptyFeature");
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
    // $ANTLR end "ruleSelfReferenceMember"


    // $ANTLR start "entryRuleEmptyFeature"
    // InternalKerMLExpressions.g:2064:1: entryRuleEmptyFeature returns [EObject current=null] : iv_ruleEmptyFeature= ruleEmptyFeature EOF ;
    public final EObject entryRuleEmptyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFeature = null;


        try {
            // InternalKerMLExpressions.g:2064:53: (iv_ruleEmptyFeature= ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:2065:2: iv_ruleEmptyFeature= ruleEmptyFeature EOF
            {
             newCompositeNode(grammarAccess.getEmptyFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyFeature=ruleEmptyFeature();

            state._fsp--;

             current =iv_ruleEmptyFeature; 
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
    // $ANTLR end "entryRuleEmptyFeature"


    // $ANTLR start "ruleEmptyFeature"
    // InternalKerMLExpressions.g:2071:1: ruleEmptyFeature returns [EObject current=null] : () ;
    public final EObject ruleEmptyFeature() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2077:2: ( () )
            // InternalKerMLExpressions.g:2078:2: ()
            {
            // InternalKerMLExpressions.g:2078:2: ()
            // InternalKerMLExpressions.g:2079:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getEmptyFeatureAccess().getFeatureAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyFeature"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalKerMLExpressions.g:2088:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLExpressions.g:2088:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:2089:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalKerMLExpressions.g:2095:1: ruleRelationalExpression returns [EObject current=null] : (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RangeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2101:2: ( (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:2102:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:2102:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            // InternalKerMLExpressions.g:2103:3: this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_RangeExpression_0=ruleRangeExpression();

            state._fsp--;


            			current = this_RangeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2111:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=33 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2112:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2112:4: ()
            	    // InternalKerMLExpressions.g:2113:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:2119:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalKerMLExpressions.g:2120:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalKerMLExpressions.g:2120:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalKerMLExpressions.g:2121:6: lv_operator_2_0= ruleRelationalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operator_2_0=ruleRelationalOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.RelationalOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2138:4: ( (lv_operand_3_0= ruleRangeExpression ) )
            	    // InternalKerMLExpressions.g:2139:5: (lv_operand_3_0= ruleRangeExpression )
            	    {
            	    // InternalKerMLExpressions.g:2139:5: (lv_operand_3_0= ruleRangeExpression )
            	    // InternalKerMLExpressions.g:2140:6: lv_operand_3_0= ruleRangeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperandRangeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_operand_3_0=ruleRangeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.RangeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalKerMLExpressions.g:2162:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalKerMLExpressions.g:2162:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:2163:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator.getText(); 
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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalKerMLExpressions.g:2169:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2175:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalKerMLExpressions.g:2176:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalKerMLExpressions.g:2176:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalKerMLExpressions.g:2177:3: kw= '<'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2183:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2189:3: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2195:3: kw= '>='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleRangeExpression"
    // InternalKerMLExpressions.g:2204:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalKerMLExpressions.g:2204:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalKerMLExpressions.g:2205:2: iv_ruleRangeExpression= ruleRangeExpression EOF
            {
             newCompositeNode(grammarAccess.getRangeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeExpression=ruleRangeExpression();

            state._fsp--;

             current =iv_ruleRangeExpression; 
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
    // $ANTLR end "entryRuleRangeExpression"


    // $ANTLR start "ruleRangeExpression"
    // InternalKerMLExpressions.g:2211:1: ruleRangeExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2217:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalKerMLExpressions.g:2218:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalKerMLExpressions.g:2218:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            // InternalKerMLExpressions.g:2219:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2227:3: ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKerMLExpressions.g:2228:4: () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalKerMLExpressions.g:2228:4: ()
                    // InternalKerMLExpressions.g:2229:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRangeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:2235:4: ( (lv_operator_2_0= '..' ) )
                    // InternalKerMLExpressions.g:2236:5: (lv_operator_2_0= '..' )
                    {
                    // InternalKerMLExpressions.g:2236:5: (lv_operator_2_0= '..' )
                    // InternalKerMLExpressions.g:2237:6: lv_operator_2_0= '..'
                    {
                    lv_operator_2_0=(Token)match(input,37,FOLLOW_3); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangeExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "..");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:2249:4: ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    // InternalKerMLExpressions.g:2250:5: (lv_operand_3_0= ruleAdditiveExpression )
                    {
                    // InternalKerMLExpressions.g:2250:5: (lv_operand_3_0= ruleAdditiveExpression )
                    // InternalKerMLExpressions.g:2251:6: lv_operand_3_0= ruleAdditiveExpression
                    {

                    						newCompositeNode(grammarAccess.getRangeExpressionAccess().getOperandAdditiveExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=ruleAdditiveExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.AdditiveExpression");
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
    // $ANTLR end "ruleRangeExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalKerMLExpressions.g:2273:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLExpressions.g:2273:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:2274:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalKerMLExpressions.g:2280:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2286:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:2287:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:2287:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalKerMLExpressions.g:2288:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2296:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=38 && LA17_0<=39)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2297:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2297:4: ()
            	    // InternalKerMLExpressions.g:2298:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:2304:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalKerMLExpressions.g:2305:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalKerMLExpressions.g:2305:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalKerMLExpressions.g:2306:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.AdditiveOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2323:4: ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    // InternalKerMLExpressions.g:2324:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalKerMLExpressions.g:2324:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    // InternalKerMLExpressions.g:2325:6: lv_operand_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_operand_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.MultiplicativeExpression");
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveOperator"
    // InternalKerMLExpressions.g:2347:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalKerMLExpressions.g:2347:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:2348:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
            {
             newCompositeNode(grammarAccess.getAdditiveOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveOperator=ruleAdditiveOperator();

            state._fsp--;

             current =iv_ruleAdditiveOperator.getText(); 
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
    // $ANTLR end "entryRuleAdditiveOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalKerMLExpressions.g:2354:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2360:2: ( (kw= '+' | kw= '-' ) )
            // InternalKerMLExpressions.g:2361:2: (kw= '+' | kw= '-' )
            {
            // InternalKerMLExpressions.g:2361:2: (kw= '+' | kw= '-' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            else if ( (LA18_0==39) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalKerMLExpressions.g:2362:3: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2368:3: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1());
                    		

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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalKerMLExpressions.g:2377:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLExpressions.g:2377:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:2378:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalKerMLExpressions.g:2384:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2390:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:2391:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:2391:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            // InternalKerMLExpressions.g:2392:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;


            			current = this_ExponentiationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2400:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=40 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2401:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2401:4: ()
            	    // InternalKerMLExpressions.g:2402:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:2408:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalKerMLExpressions.g:2409:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalKerMLExpressions.g:2409:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalKerMLExpressions.g:2410:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.MultiplicativeOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2427:4: ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    // InternalKerMLExpressions.g:2428:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    {
            	    // InternalKerMLExpressions.g:2428:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    // InternalKerMLExpressions.g:2429:6: lv_operand_3_0= ruleExponentiationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperandExponentiationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_operand_3_0=ruleExponentiationExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ExponentiationExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalKerMLExpressions.g:2451:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalKerMLExpressions.g:2451:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:2452:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;

             current =iv_ruleMultiplicativeOperator.getText(); 
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
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalKerMLExpressions.g:2458:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2464:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalKerMLExpressions.g:2465:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalKerMLExpressions.g:2465:2: (kw= '*' | kw= '/' | kw= '%' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt20=1;
                }
                break;
            case 41:
                {
                alt20=2;
                }
                break;
            case 42:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalKerMLExpressions.g:2466:3: kw= '*'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2472:3: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2478:3: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getPercentSignKeyword_2());
                    		

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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleExponentiationExpression"
    // InternalKerMLExpressions.g:2487:1: entryRuleExponentiationExpression returns [EObject current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final EObject entryRuleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLExpressions.g:2487:65: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:2488:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
            {
             newCompositeNode(grammarAccess.getExponentiationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentiationExpression=ruleExponentiationExpression();

            state._fsp--;

             current =iv_ruleExponentiationExpression; 
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
    // $ANTLR end "entryRuleExponentiationExpression"


    // $ANTLR start "ruleExponentiationExpression"
    // InternalKerMLExpressions.g:2494:1: ruleExponentiationExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2500:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalKerMLExpressions.g:2501:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:2501:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* )
            // InternalKerMLExpressions.g:2502:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2510:3: ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=43 && LA21_0<=44)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2511:4: () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2511:4: ()
            	    // InternalKerMLExpressions.g:2512:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:2518:4: ( (lv_operator_2_0= ruleExponentiationOperator ) )
            	    // InternalKerMLExpressions.g:2519:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    {
            	    // InternalKerMLExpressions.g:2519:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    // InternalKerMLExpressions.g:2520:6: lv_operator_2_0= ruleExponentiationOperator
            	    {

            	    						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperatorExponentiationOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operator_2_0=ruleExponentiationOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExponentiationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ExponentiationOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2537:4: ( (lv_operand_3_0= ruleUnaryExpression ) )
            	    // InternalKerMLExpressions.g:2538:5: (lv_operand_3_0= ruleUnaryExpression )
            	    {
            	    // InternalKerMLExpressions.g:2538:5: (lv_operand_3_0= ruleUnaryExpression )
            	    // InternalKerMLExpressions.g:2539:6: lv_operand_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperandUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_operand_3_0=ruleUnaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExponentiationExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.UnaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleExponentiationExpression"


    // $ANTLR start "entryRuleExponentiationOperator"
    // InternalKerMLExpressions.g:2561:1: entryRuleExponentiationOperator returns [String current=null] : iv_ruleExponentiationOperator= ruleExponentiationOperator EOF ;
    public final String entryRuleExponentiationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationOperator = null;


        try {
            // InternalKerMLExpressions.g:2561:62: (iv_ruleExponentiationOperator= ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:2562:2: iv_ruleExponentiationOperator= ruleExponentiationOperator EOF
            {
             newCompositeNode(grammarAccess.getExponentiationOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentiationOperator=ruleExponentiationOperator();

            state._fsp--;

             current =iv_ruleExponentiationOperator.getText(); 
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
    // $ANTLR end "entryRuleExponentiationOperator"


    // $ANTLR start "ruleExponentiationOperator"
    // InternalKerMLExpressions.g:2568:1: ruleExponentiationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '**' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleExponentiationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2574:2: ( (kw= '**' | kw= '^' ) )
            // InternalKerMLExpressions.g:2575:2: (kw= '**' | kw= '^' )
            {
            // InternalKerMLExpressions.g:2575:2: (kw= '**' | kw= '^' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            else if ( (LA22_0==44) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalKerMLExpressions.g:2576:3: kw= '**'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2582:3: kw= '^'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExponentiationOperatorAccess().getCircumflexAccentKeyword_1());
                    		

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
    // $ANTLR end "ruleExponentiationOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalKerMLExpressions.g:2591:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLExpressions.g:2591:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:2592:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalKerMLExpressions.g:2598:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_ExtentExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2604:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) )
            // InternalKerMLExpressions.g:2605:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:2605:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=38 && LA23_0<=39)||(LA23_0>=45 && LA23_0<=46)) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING_VALUE && LA23_0<=RULE_UNRESTRICTED_NAME)||LA23_0==40||(LA23_0>=47 && LA23_0<=48)||LA23_0==50||LA23_0==56||(LA23_0>=63 && LA23_0<=65)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalKerMLExpressions.g:2606:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:2606:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    // InternalKerMLExpressions.g:2607:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) )
                    {
                    // InternalKerMLExpressions.g:2607:4: ()
                    // InternalKerMLExpressions.g:2608:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:2614:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalKerMLExpressions.g:2615:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalKerMLExpressions.g:2615:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalKerMLExpressions.g:2616:6: lv_operator_1_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_operator_1_0=ruleUnaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.UnaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:2633:4: ( (lv_operand_2_0= ruleExtentExpression ) )
                    // InternalKerMLExpressions.g:2634:5: (lv_operand_2_0= ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:2634:5: (lv_operand_2_0= ruleExtentExpression )
                    // InternalKerMLExpressions.g:2635:6: lv_operand_2_0= ruleExtentExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandExtentExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleExtentExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_2_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ExtentExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2654:3: this_ExtentExpression_3= ruleExtentExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExtentExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtentExpression_3=ruleExtentExpression();

                    state._fsp--;


                    			current = this_ExtentExpression_3;
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryOperator"
    // InternalKerMLExpressions.g:2666:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalKerMLExpressions.g:2666:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:2667:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalKerMLExpressions.g:2673:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2679:2: ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) )
            // InternalKerMLExpressions.g:2680:2: (kw= '+' | kw= '-' | kw= '~' | kw= 'not' )
            {
            // InternalKerMLExpressions.g:2680:2: (kw= '+' | kw= '-' | kw= '~' | kw= 'not' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt24=1;
                }
                break;
            case 39:
                {
                alt24=2;
                }
                break;
            case 45:
                {
                alt24=3;
                }
                break;
            case 46:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalKerMLExpressions.g:2681:3: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2687:3: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2693:3: kw= '~'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2699:3: kw= 'not'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getNotKeyword_3());
                    		

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


    // $ANTLR start "entryRuleExtentExpression"
    // InternalKerMLExpressions.g:2708:1: entryRuleExtentExpression returns [EObject current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final EObject entryRuleExtentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression = null;


        try {
            // InternalKerMLExpressions.g:2708:57: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:2709:2: iv_ruleExtentExpression= ruleExtentExpression EOF
            {
             newCompositeNode(grammarAccess.getExtentExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtentExpression=ruleExtentExpression();

            state._fsp--;

             current =iv_ruleExtentExpression; 
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
    // $ANTLR end "entryRuleExtentExpression"


    // $ANTLR start "ruleExtentExpression"
    // InternalKerMLExpressions.g:2715:1: ruleExtentExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeResultMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleExtentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2721:2: ( ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeResultMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalKerMLExpressions.g:2722:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeResultMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalKerMLExpressions.g:2722:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeResultMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_STRING_VALUE && LA25_0<=RULE_UNRESTRICTED_NAME)||LA25_0==40||LA25_0==48||LA25_0==50||LA25_0==56||(LA25_0>=63 && LA25_0<=65)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalKerMLExpressions.g:2723:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeResultMember ) ) )
                    {
                    // InternalKerMLExpressions.g:2723:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeResultMember ) ) )
                    // InternalKerMLExpressions.g:2724:4: () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeResultMember ) )
                    {
                    // InternalKerMLExpressions.g:2724:4: ()
                    // InternalKerMLExpressions.g:2725:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:2731:4: ( (lv_operator_1_0= 'all' ) )
                    // InternalKerMLExpressions.g:2732:5: (lv_operator_1_0= 'all' )
                    {
                    // InternalKerMLExpressions.g:2732:5: (lv_operator_1_0= 'all' )
                    // InternalKerMLExpressions.g:2733:6: lv_operator_1_0= 'all'
                    {
                    lv_operator_1_0=(Token)match(input,47,FOLLOW_14); 

                    						newLeafNode(lv_operator_1_0, grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtentExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_0, "all");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:2745:4: ( (lv_ownedRelationship_2_0= ruleTypeResultMember ) )
                    // InternalKerMLExpressions.g:2746:5: (lv_ownedRelationship_2_0= ruleTypeResultMember )
                    {
                    // InternalKerMLExpressions.g:2746:5: (lv_ownedRelationship_2_0= ruleTypeResultMember )
                    // InternalKerMLExpressions.g:2747:6: lv_ownedRelationship_2_0= ruleTypeResultMember
                    {

                    						newCompositeNode(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipTypeResultMemberParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_2_0=ruleTypeResultMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtentExpressionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_2_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeResultMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2766:3: this_PrimaryExpression_3= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExtentExpressionAccess().getPrimaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_3=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_3;
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
    // $ANTLR end "ruleExtentExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalKerMLExpressions.g:2778:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKerMLExpressions.g:2778:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKerMLExpressions.g:2779:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKerMLExpressions.g:2785:1: rulePrimaryExpression returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' ) | ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' ) | ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) ) | ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) ) | ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) ) ) ( () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) ) )? )* ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_operator_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_operator_10_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        EObject this_BaseExpression_0 = null;

        EObject lv_ownedRelationship_3_0 = null;

        EObject lv_operand_7_0 = null;

        EObject lv_operand_11_0 = null;

        EObject lv_ownedRelationship_15_0 = null;

        EObject lv_operand_16_0 = null;

        EObject lv_operand_17_0 = null;

        EObject this_ArgumentList_18 = null;

        EObject lv_operand_21_0 = null;

        EObject lv_operand_24_0 = null;

        EObject lv_ownedRelationship_27_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2791:2: ( (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' ) | ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' ) | ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) ) | ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) ) | ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) ) ) ( () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) ) )? )* ) )
            // InternalKerMLExpressions.g:2792:2: (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' ) | ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' ) | ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) ) | ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) ) | ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) ) ) ( () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) ) )? )* )
            {
            // InternalKerMLExpressions.g:2792:2: (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' ) | ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' ) | ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) ) | ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) ) | ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) ) ) ( () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) ) )? )* )
            // InternalKerMLExpressions.g:2793:3: this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' ) | ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' ) | ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) ) | ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) ) | ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) ) ) ( () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) ) )? )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;


            			current = this_BaseExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2801:3: ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                int LA26_1 = input.LA(2);

                if ( ((LA26_1>=RULE_ID && LA26_1<=RULE_UNRESTRICTED_NAME)) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalKerMLExpressions.g:2802:4: () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) )
                    {
                    // InternalKerMLExpressions.g:2802:4: ()
                    // InternalKerMLExpressions.g:2803:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getPrimaryExpressionAccess().getFeatureChainExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,48,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_1());
                    			
                    // InternalKerMLExpressions.g:2813:4: ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) )
                    // InternalKerMLExpressions.g:2814:5: (lv_ownedRelationship_3_0= ruleFeatureChainMember )
                    {
                    // InternalKerMLExpressions.g:2814:5: (lv_ownedRelationship_3_0= ruleFeatureChainMember )
                    // InternalKerMLExpressions.g:2815:6: lv_ownedRelationship_3_0= ruleFeatureChainMember
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFeatureChainMemberParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_ownedRelationship_3_0=ruleFeatureChainMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_3_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.FeatureChainMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKerMLExpressions.g:2833:3: ( ( ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' ) | ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' ) | ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) ) | ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) ) | ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) ) ) ( () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) ) )? )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=48 && LA30_0<=49)||LA30_0==52||(LA30_0>=54 && LA30_0<=55)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2834:4: ( ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' ) | ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' ) | ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) ) | ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) ) | ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) ) ) ( () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) ) )?
            	    {
            	    // InternalKerMLExpressions.g:2834:4: ( ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' ) | ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' ) | ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) ) | ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) ) | ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) ) )
            	    int alt28=5;
            	    switch ( input.LA(1) ) {
            	    case 49:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt28=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalKerMLExpressions.g:2835:5: ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' )
            	            {
            	            // InternalKerMLExpressions.g:2835:5: ( () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')' )
            	            // InternalKerMLExpressions.g:2836:6: () ( (lv_operator_5_0= '#' ) ) otherlv_6= '(' ( (lv_operand_7_0= ruleSequenceExpression ) ) otherlv_8= ')'
            	            {
            	            // InternalKerMLExpressions.g:2836:6: ()
            	            // InternalKerMLExpressions.g:2837:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_0_0(),
            	            								current);
            	            						

            	            }

            	            // InternalKerMLExpressions.g:2843:6: ( (lv_operator_5_0= '#' ) )
            	            // InternalKerMLExpressions.g:2844:7: (lv_operator_5_0= '#' )
            	            {
            	            // InternalKerMLExpressions.g:2844:7: (lv_operator_5_0= '#' )
            	            // InternalKerMLExpressions.g:2845:8: lv_operator_5_0= '#'
            	            {
            	            lv_operator_5_0=(Token)match(input,49,FOLLOW_25); 

            	            								newLeafNode(lv_operator_5_0, grammarAccess.getPrimaryExpressionAccess().getOperatorNumberSignKeyword_2_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								setWithLastConsumed(current, "operator", lv_operator_5_0, "#");
            	            							

            	            }


            	            }

            	            otherlv_6=(Token)match(input,50,FOLLOW_5); 

            	            						newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0_0_2());
            	            					
            	            // InternalKerMLExpressions.g:2861:6: ( (lv_operand_7_0= ruleSequenceExpression ) )
            	            // InternalKerMLExpressions.g:2862:7: (lv_operand_7_0= ruleSequenceExpression )
            	            {
            	            // InternalKerMLExpressions.g:2862:7: (lv_operand_7_0= ruleSequenceExpression )
            	            // InternalKerMLExpressions.g:2863:8: lv_operand_7_0= ruleSequenceExpression
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandSequenceExpressionParserRuleCall_2_0_0_3_0());
            	            							
            	            pushFollow(FOLLOW_26);
            	            lv_operand_7_0=ruleSequenceExpression();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_7_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.SequenceExpression");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            otherlv_8=(Token)match(input,51,FOLLOW_24); 

            	            						newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_0_0_4());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLExpressions.g:2886:5: ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' )
            	            {
            	            // InternalKerMLExpressions.g:2886:5: ( () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']' )
            	            // InternalKerMLExpressions.g:2887:6: () ( (lv_operator_10_0= '[' ) ) ( (lv_operand_11_0= ruleSequenceExpression ) ) otherlv_12= ']'
            	            {
            	            // InternalKerMLExpressions.g:2887:6: ()
            	            // InternalKerMLExpressions.g:2888:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_1_0(),
            	            								current);
            	            						

            	            }

            	            // InternalKerMLExpressions.g:2894:6: ( (lv_operator_10_0= '[' ) )
            	            // InternalKerMLExpressions.g:2895:7: (lv_operator_10_0= '[' )
            	            {
            	            // InternalKerMLExpressions.g:2895:7: (lv_operator_10_0= '[' )
            	            // InternalKerMLExpressions.g:2896:8: lv_operator_10_0= '['
            	            {
            	            lv_operator_10_0=(Token)match(input,52,FOLLOW_5); 

            	            								newLeafNode(lv_operator_10_0, grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_2_0_1_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								setWithLastConsumed(current, "operator", lv_operator_10_0, "[");
            	            							

            	            }


            	            }

            	            // InternalKerMLExpressions.g:2908:6: ( (lv_operand_11_0= ruleSequenceExpression ) )
            	            // InternalKerMLExpressions.g:2909:7: (lv_operand_11_0= ruleSequenceExpression )
            	            {
            	            // InternalKerMLExpressions.g:2909:7: (lv_operand_11_0= ruleSequenceExpression )
            	            // InternalKerMLExpressions.g:2910:8: lv_operand_11_0= ruleSequenceExpression
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandSequenceExpressionParserRuleCall_2_0_1_2_0());
            	            							
            	            pushFollow(FOLLOW_27);
            	            lv_operand_11_0=ruleSequenceExpression();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_11_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.SequenceExpression");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            otherlv_12=(Token)match(input,53,FOLLOW_24); 

            	            						newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_2_0_1_3());
            	            					

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLExpressions.g:2933:5: ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) )
            	            {
            	            // InternalKerMLExpressions.g:2933:5: ( () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] ) )
            	            // InternalKerMLExpressions.g:2934:6: () otherlv_14= '->' ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) ) ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] )
            	            {
            	            // InternalKerMLExpressions.g:2934:6: ()
            	            // InternalKerMLExpressions.g:2935:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_2_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_14=(Token)match(input,54,FOLLOW_14); 

            	            						newLeafNode(otherlv_14, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2_1());
            	            					
            	            // InternalKerMLExpressions.g:2945:6: ( (lv_ownedRelationship_15_0= ruleReferenceTyping ) )
            	            // InternalKerMLExpressions.g:2946:7: (lv_ownedRelationship_15_0= ruleReferenceTyping )
            	            {
            	            // InternalKerMLExpressions.g:2946:7: (lv_ownedRelationship_15_0= ruleReferenceTyping )
            	            // InternalKerMLExpressions.g:2947:8: lv_ownedRelationship_15_0= ruleReferenceTyping
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipReferenceTypingParserRuleCall_2_0_2_2_0());
            	            							
            	            pushFollow(FOLLOW_28);
            	            lv_ownedRelationship_15_0=ruleReferenceTyping();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"ownedRelationship",
            	            									lv_ownedRelationship_15_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.ReferenceTyping");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalKerMLExpressions.g:2964:6: ( ( (lv_operand_16_0= ruleBodyExpression ) ) | ( (lv_operand_17_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_18= ruleArgumentList[$current] )
            	            int alt27=3;
            	            switch ( input.LA(1) ) {
            	            case 56:
            	                {
            	                alt27=1;
            	                }
            	                break;
            	            case RULE_ID:
            	            case RULE_UNRESTRICTED_NAME:
            	                {
            	                alt27=2;
            	                }
            	                break;
            	            case 50:
            	                {
            	                alt27=3;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 27, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt27) {
            	                case 1 :
            	                    // InternalKerMLExpressions.g:2965:7: ( (lv_operand_16_0= ruleBodyExpression ) )
            	                    {
            	                    // InternalKerMLExpressions.g:2965:7: ( (lv_operand_16_0= ruleBodyExpression ) )
            	                    // InternalKerMLExpressions.g:2966:8: (lv_operand_16_0= ruleBodyExpression )
            	                    {
            	                    // InternalKerMLExpressions.g:2966:8: (lv_operand_16_0= ruleBodyExpression )
            	                    // InternalKerMLExpressions.g:2967:9: lv_operand_16_0= ruleBodyExpression
            	                    {

            	                    									newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandBodyExpressionParserRuleCall_2_0_2_3_0_0());
            	                    								
            	                    pushFollow(FOLLOW_24);
            	                    lv_operand_16_0=ruleBodyExpression();

            	                    state._fsp--;


            	                    									if (current==null) {
            	                    										current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	                    									}
            	                    									add(
            	                    										current,
            	                    										"operand",
            	                    										lv_operand_16_0,
            	                    										"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyExpression");
            	                    									afterParserOrEnumRuleCall();
            	                    								

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalKerMLExpressions.g:2985:7: ( (lv_operand_17_0= ruleFunctionReferenceExpression ) )
            	                    {
            	                    // InternalKerMLExpressions.g:2985:7: ( (lv_operand_17_0= ruleFunctionReferenceExpression ) )
            	                    // InternalKerMLExpressions.g:2986:8: (lv_operand_17_0= ruleFunctionReferenceExpression )
            	                    {
            	                    // InternalKerMLExpressions.g:2986:8: (lv_operand_17_0= ruleFunctionReferenceExpression )
            	                    // InternalKerMLExpressions.g:2987:9: lv_operand_17_0= ruleFunctionReferenceExpression
            	                    {

            	                    									newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandFunctionReferenceExpressionParserRuleCall_2_0_2_3_1_0());
            	                    								
            	                    pushFollow(FOLLOW_24);
            	                    lv_operand_17_0=ruleFunctionReferenceExpression();

            	                    state._fsp--;


            	                    									if (current==null) {
            	                    										current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	                    									}
            	                    									add(
            	                    										current,
            	                    										"operand",
            	                    										lv_operand_17_0,
            	                    										"org.omg.kerml.expressions.xtext.KerMLExpressions.FunctionReferenceExpression");
            	                    									afterParserOrEnumRuleCall();
            	                    								

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalKerMLExpressions.g:3005:7: this_ArgumentList_18= ruleArgumentList[$current]
            	                    {

            	                    							if (current==null) {
            	                    								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	                    							}
            	                    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_2_0_2_3_2());
            	                    						
            	                    pushFollow(FOLLOW_24);
            	                    this_ArgumentList_18=ruleArgumentList(current);

            	                    state._fsp--;


            	                    							current = this_ArgumentList_18;
            	                    							afterParserOrEnumRuleCall();
            	                    						

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalKerMLExpressions.g:3019:5: ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) )
            	            {
            	            // InternalKerMLExpressions.g:3019:5: ( () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) ) )
            	            // InternalKerMLExpressions.g:3020:6: () otherlv_20= '.' ( (lv_operand_21_0= ruleBodyExpression ) )
            	            {
            	            // InternalKerMLExpressions.g:3020:6: ()
            	            // InternalKerMLExpressions.g:3021:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getCollectExpressionOperandAction_2_0_3_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_20=(Token)match(input,48,FOLLOW_29); 

            	            						newLeafNode(otherlv_20, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_0_3_1());
            	            					
            	            // InternalKerMLExpressions.g:3031:6: ( (lv_operand_21_0= ruleBodyExpression ) )
            	            // InternalKerMLExpressions.g:3032:7: (lv_operand_21_0= ruleBodyExpression )
            	            {
            	            // InternalKerMLExpressions.g:3032:7: (lv_operand_21_0= ruleBodyExpression )
            	            // InternalKerMLExpressions.g:3033:8: lv_operand_21_0= ruleBodyExpression
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandBodyExpressionParserRuleCall_2_0_3_2_0());
            	            							
            	            pushFollow(FOLLOW_24);
            	            lv_operand_21_0=ruleBodyExpression();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_21_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyExpression");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalKerMLExpressions.g:3052:5: ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) )
            	            {
            	            // InternalKerMLExpressions.g:3052:5: ( () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) ) )
            	            // InternalKerMLExpressions.g:3053:6: () otherlv_23= '.?' ( (lv_operand_24_0= ruleBodyExpression ) )
            	            {
            	            // InternalKerMLExpressions.g:3053:6: ()
            	            // InternalKerMLExpressions.g:3054:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getSelectExpressionOperandAction_2_0_4_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_23=(Token)match(input,55,FOLLOW_29); 

            	            						newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getFullStopQuestionMarkKeyword_2_0_4_1());
            	            					
            	            // InternalKerMLExpressions.g:3064:6: ( (lv_operand_24_0= ruleBodyExpression ) )
            	            // InternalKerMLExpressions.g:3065:7: (lv_operand_24_0= ruleBodyExpression )
            	            {
            	            // InternalKerMLExpressions.g:3065:7: (lv_operand_24_0= ruleBodyExpression )
            	            // InternalKerMLExpressions.g:3066:8: lv_operand_24_0= ruleBodyExpression
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandBodyExpressionParserRuleCall_2_0_4_2_0());
            	            							
            	            pushFollow(FOLLOW_24);
            	            lv_operand_24_0=ruleBodyExpression();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_24_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyExpression");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalKerMLExpressions.g:3085:4: ( () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==48) ) {
            	        int LA29_1 = input.LA(2);

            	        if ( ((LA29_1>=RULE_ID && LA29_1<=RULE_UNRESTRICTED_NAME)) ) {
            	            alt29=1;
            	        }
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalKerMLExpressions.g:3086:5: () otherlv_26= '.' ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) )
            	            {
            	            // InternalKerMLExpressions.g:3086:5: ()
            	            // InternalKerMLExpressions.g:3087:6: 
            	            {

            	            						current = forceCreateModelElementAndAdd(
            	            							grammarAccess.getPrimaryExpressionAccess().getFeatureChainExpressionOperandAction_2_1_0(),
            	            							current);
            	            					

            	            }

            	            otherlv_26=(Token)match(input,48,FOLLOW_14); 

            	            					newLeafNode(otherlv_26, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1());
            	            				
            	            // InternalKerMLExpressions.g:3097:5: ( (lv_ownedRelationship_27_0= ruleFeatureChainMember ) )
            	            // InternalKerMLExpressions.g:3098:6: (lv_ownedRelationship_27_0= ruleFeatureChainMember )
            	            {
            	            // InternalKerMLExpressions.g:3098:6: (lv_ownedRelationship_27_0= ruleFeatureChainMember )
            	            // InternalKerMLExpressions.g:3099:7: lv_ownedRelationship_27_0= ruleFeatureChainMember
            	            {

            	            							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFeatureChainMemberParserRuleCall_2_1_2_0());
            	            						
            	            pushFollow(FOLLOW_24);
            	            lv_ownedRelationship_27_0=ruleFeatureChainMember();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"ownedRelationship",
            	            								lv_ownedRelationship_27_0,
            	            								"org.omg.kerml.expressions.xtext.KerMLExpressions.FeatureChainMember");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionReferenceExpression"
    // InternalKerMLExpressions.g:3122:1: entryRuleFunctionReferenceExpression returns [EObject current=null] : iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF ;
    public final EObject entryRuleFunctionReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:3122:68: (iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF )
            // InternalKerMLExpressions.g:3123:2: iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getFunctionReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionReferenceExpression=ruleFunctionReferenceExpression();

            state._fsp--;

             current =iv_ruleFunctionReferenceExpression; 
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
    // $ANTLR end "entryRuleFunctionReferenceExpression"


    // $ANTLR start "ruleFunctionReferenceExpression"
    // InternalKerMLExpressions.g:3129:1: ruleFunctionReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleFunctionReferenceMember ) ) ;
    public final EObject ruleFunctionReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3135:2: ( ( (lv_ownedRelationship_0_0= ruleFunctionReferenceMember ) ) )
            // InternalKerMLExpressions.g:3136:2: ( (lv_ownedRelationship_0_0= ruleFunctionReferenceMember ) )
            {
            // InternalKerMLExpressions.g:3136:2: ( (lv_ownedRelationship_0_0= ruleFunctionReferenceMember ) )
            // InternalKerMLExpressions.g:3137:3: (lv_ownedRelationship_0_0= ruleFunctionReferenceMember )
            {
            // InternalKerMLExpressions.g:3137:3: (lv_ownedRelationship_0_0= ruleFunctionReferenceMember )
            // InternalKerMLExpressions.g:3138:4: lv_ownedRelationship_0_0= ruleFunctionReferenceMember
            {

            				newCompositeNode(grammarAccess.getFunctionReferenceExpressionAccess().getOwnedRelationshipFunctionReferenceMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleFunctionReferenceMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctionReferenceExpressionRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.FunctionReferenceMember");
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
    // $ANTLR end "ruleFunctionReferenceExpression"


    // $ANTLR start "entryRuleFunctionReferenceMember"
    // InternalKerMLExpressions.g:3158:1: entryRuleFunctionReferenceMember returns [EObject current=null] : iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF ;
    public final EObject entryRuleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:3158:64: (iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF )
            // InternalKerMLExpressions.g:3159:2: iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionReferenceMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionReferenceMember=ruleFunctionReferenceMember();

            state._fsp--;

             current =iv_ruleFunctionReferenceMember; 
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
    // $ANTLR end "entryRuleFunctionReferenceMember"


    // $ANTLR start "ruleFunctionReferenceMember"
    // InternalKerMLExpressions.g:3165:1: ruleFunctionReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) ;
    public final EObject ruleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3171:2: ( ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) )
            // InternalKerMLExpressions.g:3172:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            {
            // InternalKerMLExpressions.g:3172:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            // InternalKerMLExpressions.g:3173:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            {
            // InternalKerMLExpressions.g:3173:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            // InternalKerMLExpressions.g:3174:4: lv_ownedRelatedElement_0_0= ruleFunctionReference
            {

            				newCompositeNode(grammarAccess.getFunctionReferenceMemberAccess().getOwnedRelatedElementFunctionReferenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleFunctionReference();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctionReferenceMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.FunctionReference");
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
    // $ANTLR end "ruleFunctionReferenceMember"


    // $ANTLR start "entryRuleFunctionReference"
    // InternalKerMLExpressions.g:3194:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // InternalKerMLExpressions.g:3194:58: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // InternalKerMLExpressions.g:3195:2: iv_ruleFunctionReference= ruleFunctionReference EOF
            {
             newCompositeNode(grammarAccess.getFunctionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionReference=ruleFunctionReference();

            state._fsp--;

             current =iv_ruleFunctionReference; 
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
    // $ANTLR end "entryRuleFunctionReference"


    // $ANTLR start "ruleFunctionReference"
    // InternalKerMLExpressions.g:3201:1: ruleFunctionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3207:2: ( ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) )
            // InternalKerMLExpressions.g:3208:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            {
            // InternalKerMLExpressions.g:3208:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:3209:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:3209:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            // InternalKerMLExpressions.g:3210:4: lv_ownedRelationship_0_0= ruleReferenceTyping
            {

            				newCompositeNode(grammarAccess.getFunctionReferenceAccess().getOwnedRelationshipReferenceTypingParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleReferenceTyping();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctionReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.ReferenceTyping");
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
    // $ANTLR end "ruleFunctionReference"


    // $ANTLR start "entryRuleFeatureChainMember"
    // InternalKerMLExpressions.g:3230:1: entryRuleFeatureChainMember returns [EObject current=null] : iv_ruleFeatureChainMember= ruleFeatureChainMember EOF ;
    public final EObject entryRuleFeatureChainMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureChainMember = null;


        try {
            // InternalKerMLExpressions.g:3230:59: (iv_ruleFeatureChainMember= ruleFeatureChainMember EOF )
            // InternalKerMLExpressions.g:3231:2: iv_ruleFeatureChainMember= ruleFeatureChainMember EOF
            {
             newCompositeNode(grammarAccess.getFeatureChainMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureChainMember=ruleFeatureChainMember();

            state._fsp--;

             current =iv_ruleFeatureChainMember; 
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
    // $ANTLR end "entryRuleFeatureChainMember"


    // $ANTLR start "ruleFeatureChainMember"
    // InternalKerMLExpressions.g:3237:1: ruleFeatureChainMember returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) ) ;
    public final EObject ruleFeatureChainMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3243:2: ( ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) ) )
            // InternalKerMLExpressions.g:3244:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )
            {
            // InternalKerMLExpressions.g:3244:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalKerMLExpressions.g:3245:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalKerMLExpressions.g:3245:3: ( ( ruleQualifiedName ) )
                    // InternalKerMLExpressions.g:3246:4: ( ruleQualifiedName )
                    {
                    // InternalKerMLExpressions.g:3246:4: ( ruleQualifiedName )
                    // InternalKerMLExpressions.g:3247:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureChainMemberRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getFeatureChainMemberAccess().getMemberElementFeatureCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3262:3: ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) )
                    {
                    // InternalKerMLExpressions.g:3262:3: ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) )
                    // InternalKerMLExpressions.g:3263:4: () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) )
                    {
                    // InternalKerMLExpressions.g:3263:4: ()
                    // InternalKerMLExpressions.g:3264:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFeatureChainMemberAccess().getOwningMembershipAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:3270:4: ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) )
                    // InternalKerMLExpressions.g:3271:5: (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain )
                    {
                    // InternalKerMLExpressions.g:3271:5: (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain )
                    // InternalKerMLExpressions.g:3272:6: lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain
                    {

                    						newCompositeNode(grammarAccess.getFeatureChainMemberAccess().getOwnedRelatedElementOwnedFeatureChainParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_2_0=ruleOwnedFeatureChain();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureChainMemberRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelatedElement",
                    							lv_ownedRelatedElement_2_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureChain");
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
    // $ANTLR end "ruleFeatureChainMember"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalKerMLExpressions.g:3294:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalKerMLExpressions.g:3294:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:3295:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
             newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;

             current =iv_ruleBaseExpression; 
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
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // InternalKerMLExpressions.g:3301:1: ruleBaseExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (otherlv_6= '(' this_SequenceExpression_7= ruleSequenceExpression otherlv_8= ')' ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_NullExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_FeatureReferenceExpression_2 = null;

        EObject this_MetadataAccessExpression_3 = null;

        EObject this_InvocationExpression_4 = null;

        EObject this_BodyExpression_5 = null;

        EObject this_SequenceExpression_7 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3307:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (otherlv_6= '(' this_SequenceExpression_7= ruleSequenceExpression otherlv_8= ')' ) ) )
            // InternalKerMLExpressions.g:3308:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (otherlv_6= '(' this_SequenceExpression_7= ruleSequenceExpression otherlv_8= ')' ) )
            {
            // InternalKerMLExpressions.g:3308:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (otherlv_6= '(' this_SequenceExpression_7= ruleSequenceExpression otherlv_8= ')' ) )
            int alt32=7;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalKerMLExpressions.g:3309:3: this_NullExpression_0= ruleNullExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getNullExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullExpression_0=ruleNullExpression();

                    state._fsp--;


                    			current = this_NullExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3318:3: this_LiteralExpression_1= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:3327:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getFeatureReferenceExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureReferenceExpression_2=ruleFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_FeatureReferenceExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:3336:3: this_MetadataAccessExpression_3= ruleMetadataAccessExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getMetadataAccessExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetadataAccessExpression_3=ruleMetadataAccessExpression();

                    state._fsp--;


                    			current = this_MetadataAccessExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:3345:3: this_InvocationExpression_4= ruleInvocationExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvocationExpression_4=ruleInvocationExpression();

                    state._fsp--;


                    			current = this_InvocationExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKerMLExpressions.g:3354:3: this_BodyExpression_5= ruleBodyExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getBodyExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BodyExpression_5=ruleBodyExpression();

                    state._fsp--;


                    			current = this_BodyExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalKerMLExpressions.g:3363:3: (otherlv_6= '(' this_SequenceExpression_7= ruleSequenceExpression otherlv_8= ')' )
                    {
                    // InternalKerMLExpressions.g:3363:3: (otherlv_6= '(' this_SequenceExpression_7= ruleSequenceExpression otherlv_8= ')' )
                    // InternalKerMLExpressions.g:3364:4: otherlv_6= '(' this_SequenceExpression_7= ruleSequenceExpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_26);
                    this_SequenceExpression_7=ruleSequenceExpression();

                    state._fsp--;


                    				current = this_SequenceExpression_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_6_2());
                    			

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
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleBodyExpression"
    // InternalKerMLExpressions.g:3385:1: entryRuleBodyExpression returns [EObject current=null] : iv_ruleBodyExpression= ruleBodyExpression EOF ;
    public final EObject entryRuleBodyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyExpression = null;


        try {
            // InternalKerMLExpressions.g:3385:55: (iv_ruleBodyExpression= ruleBodyExpression EOF )
            // InternalKerMLExpressions.g:3386:2: iv_ruleBodyExpression= ruleBodyExpression EOF
            {
             newCompositeNode(grammarAccess.getBodyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyExpression=ruleBodyExpression();

            state._fsp--;

             current =iv_ruleBodyExpression; 
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
    // $ANTLR end "entryRuleBodyExpression"


    // $ANTLR start "ruleBodyExpression"
    // InternalKerMLExpressions.g:3392:1: ruleBodyExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleExpressionBodyMember ) ) ;
    public final EObject ruleBodyExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3398:2: ( ( (lv_ownedRelationship_0_0= ruleExpressionBodyMember ) ) )
            // InternalKerMLExpressions.g:3399:2: ( (lv_ownedRelationship_0_0= ruleExpressionBodyMember ) )
            {
            // InternalKerMLExpressions.g:3399:2: ( (lv_ownedRelationship_0_0= ruleExpressionBodyMember ) )
            // InternalKerMLExpressions.g:3400:3: (lv_ownedRelationship_0_0= ruleExpressionBodyMember )
            {
            // InternalKerMLExpressions.g:3400:3: (lv_ownedRelationship_0_0= ruleExpressionBodyMember )
            // InternalKerMLExpressions.g:3401:4: lv_ownedRelationship_0_0= ruleExpressionBodyMember
            {

            				newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleExpressionBodyMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBodyExpressionRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.ExpressionBodyMember");
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
    // $ANTLR end "ruleBodyExpression"


    // $ANTLR start "entryRuleExpressionBodyMember"
    // InternalKerMLExpressions.g:3421:1: entryRuleExpressionBodyMember returns [EObject current=null] : iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF ;
    public final EObject entryRuleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBodyMember = null;


        try {
            // InternalKerMLExpressions.g:3421:61: (iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF )
            // InternalKerMLExpressions.g:3422:2: iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF
            {
             newCompositeNode(grammarAccess.getExpressionBodyMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBodyMember=ruleExpressionBodyMember();

            state._fsp--;

             current =iv_ruleExpressionBodyMember; 
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
    // $ANTLR end "entryRuleExpressionBodyMember"


    // $ANTLR start "ruleExpressionBodyMember"
    // InternalKerMLExpressions.g:3428:1: ruleExpressionBodyMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) ;
    public final EObject ruleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3434:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) )
            // InternalKerMLExpressions.g:3435:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            {
            // InternalKerMLExpressions.g:3435:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            // InternalKerMLExpressions.g:3436:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            {
            // InternalKerMLExpressions.g:3436:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            // InternalKerMLExpressions.g:3437:4: lv_ownedRelatedElement_0_0= ruleExpressionBody
            {

            				newCompositeNode(grammarAccess.getExpressionBodyMemberAccess().getOwnedRelatedElementExpressionBodyParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleExpressionBody();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionBodyMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.ExpressionBody");
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
    // $ANTLR end "ruleExpressionBodyMember"


    // $ANTLR start "entryRuleExpressionBody"
    // InternalKerMLExpressions.g:3457:1: entryRuleExpressionBody returns [EObject current=null] : iv_ruleExpressionBody= ruleExpressionBody EOF ;
    public final EObject entryRuleExpressionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBody = null;


        try {
            // InternalKerMLExpressions.g:3457:55: (iv_ruleExpressionBody= ruleExpressionBody EOF )
            // InternalKerMLExpressions.g:3458:2: iv_ruleExpressionBody= ruleExpressionBody EOF
            {
             newCompositeNode(grammarAccess.getExpressionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBody=ruleExpressionBody();

            state._fsp--;

             current =iv_ruleExpressionBody; 
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
    // $ANTLR end "entryRuleExpressionBody"


    // $ANTLR start "ruleExpressionBody"
    // InternalKerMLExpressions.g:3464:1: ruleExpressionBody returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) ;
    public final EObject ruleExpressionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3470:2: ( (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) )
            // InternalKerMLExpressions.g:3471:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            {
            // InternalKerMLExpressions.g:3471:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            // InternalKerMLExpressions.g:3472:3: otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalKerMLExpressions.g:3476:3: ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==59) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3477:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';'
            	    {
            	    // InternalKerMLExpressions.g:3477:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) )
            	    // InternalKerMLExpressions.g:3478:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    {
            	    // InternalKerMLExpressions.g:3478:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    // InternalKerMLExpressions.g:3479:6: lv_ownedRelationship_1_0= ruleBodyParameterMember
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_ownedRelationship_1_0=ruleBodyParameterMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_1_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyParameterMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionBodyAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalKerMLExpressions.g:3501:3: ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) )
            // InternalKerMLExpressions.g:3502:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            {
            // InternalKerMLExpressions.g:3502:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            // InternalKerMLExpressions.g:3503:5: lv_ownedRelationship_3_0= ruleResultExpressionMember
            {

            					newCompositeNode(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipResultExpressionMemberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_ownedRelationship_3_0=ruleResultExpressionMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionBodyRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_3_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.ResultExpressionMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExpressionBodyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleExpressionBody"


    // $ANTLR start "entryRuleResultExpressionMember"
    // InternalKerMLExpressions.g:3528:1: entryRuleResultExpressionMember returns [EObject current=null] : iv_ruleResultExpressionMember= ruleResultExpressionMember EOF ;
    public final EObject entryRuleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:3528:63: (iv_ruleResultExpressionMember= ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:3529:2: iv_ruleResultExpressionMember= ruleResultExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getResultExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResultExpressionMember=ruleResultExpressionMember();

            state._fsp--;

             current =iv_ruleResultExpressionMember; 
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
    // $ANTLR end "entryRuleResultExpressionMember"


    // $ANTLR start "ruleResultExpressionMember"
    // InternalKerMLExpressions.g:3535:1: ruleResultExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3541:2: ( ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:3542:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:3542:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:3543:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:3543:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:3544:4: lv_ownedRelatedElement_0_0= ruleOwnedExpression
            {

            				newCompositeNode(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleOwnedExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getResultExpressionMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
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
    // $ANTLR end "ruleResultExpressionMember"


    // $ANTLR start "entryRuleBodyParameterMember"
    // InternalKerMLExpressions.g:3564:1: entryRuleBodyParameterMember returns [EObject current=null] : iv_ruleBodyParameterMember= ruleBodyParameterMember EOF ;
    public final EObject entryRuleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameterMember = null;


        try {
            // InternalKerMLExpressions.g:3564:60: (iv_ruleBodyParameterMember= ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:3565:2: iv_ruleBodyParameterMember= ruleBodyParameterMember EOF
            {
             newCompositeNode(grammarAccess.getBodyParameterMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyParameterMember=ruleBodyParameterMember();

            state._fsp--;

             current =iv_ruleBodyParameterMember; 
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
    // $ANTLR end "entryRuleBodyParameterMember"


    // $ANTLR start "ruleBodyParameterMember"
    // InternalKerMLExpressions.g:3571:1: ruleBodyParameterMember returns [EObject current=null] : (otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) ) ) ;
    public final EObject ruleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedRelatedElement_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3577:2: ( (otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) ) ) )
            // InternalKerMLExpressions.g:3578:2: (otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) ) )
            {
            // InternalKerMLExpressions.g:3578:2: (otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) ) )
            // InternalKerMLExpressions.g:3579:3: otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getBodyParameterMemberAccess().getInKeyword_0());
            		
            // InternalKerMLExpressions.g:3583:3: ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) )
            // InternalKerMLExpressions.g:3584:4: (lv_ownedRelatedElement_1_0= ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:3584:4: (lv_ownedRelatedElement_1_0= ruleBodyParameter )
            // InternalKerMLExpressions.g:3585:5: lv_ownedRelatedElement_1_0= ruleBodyParameter
            {

            					newCompositeNode(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementBodyParameterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_1_0=ruleBodyParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBodyParameterMemberRule());
            					}
            					add(
            						current,
            						"ownedRelatedElement",
            						lv_ownedRelatedElement_1_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyParameter");
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
    // $ANTLR end "ruleBodyParameterMember"


    // $ANTLR start "entryRuleBodyParameter"
    // InternalKerMLExpressions.g:3606:1: entryRuleBodyParameter returns [EObject current=null] : iv_ruleBodyParameter= ruleBodyParameter EOF ;
    public final EObject entryRuleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameter = null;


        try {
            // InternalKerMLExpressions.g:3606:54: (iv_ruleBodyParameter= ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:3607:2: iv_ruleBodyParameter= ruleBodyParameter EOF
            {
             newCompositeNode(grammarAccess.getBodyParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyParameter=ruleBodyParameter();

            state._fsp--;

             current =iv_ruleBodyParameter; 
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
    // $ANTLR end "entryRuleBodyParameter"


    // $ANTLR start "ruleBodyParameter"
    // InternalKerMLExpressions.g:3613:1: ruleBodyParameter returns [EObject current=null] : ( (lv_declaredName_0_0= ruleName ) ) ;
    public final EObject ruleBodyParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_declaredName_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3619:2: ( ( (lv_declaredName_0_0= ruleName ) ) )
            // InternalKerMLExpressions.g:3620:2: ( (lv_declaredName_0_0= ruleName ) )
            {
            // InternalKerMLExpressions.g:3620:2: ( (lv_declaredName_0_0= ruleName ) )
            // InternalKerMLExpressions.g:3621:3: (lv_declaredName_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:3621:3: (lv_declaredName_0_0= ruleName )
            // InternalKerMLExpressions.g:3622:4: lv_declaredName_0_0= ruleName
            {

            				newCompositeNode(grammarAccess.getBodyParameterAccess().getDeclaredNameNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_declaredName_0_0=ruleName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBodyParameterRule());
            				}
            				set(
            					current,
            					"declaredName",
            					lv_declaredName_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.Name");
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
    // $ANTLR end "ruleBodyParameter"


    // $ANTLR start "entryRuleSequenceExpression"
    // InternalKerMLExpressions.g:3642:1: entryRuleSequenceExpression returns [EObject current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final EObject entryRuleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLExpressions.g:3642:59: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:3643:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceExpression=ruleSequenceExpression();

            state._fsp--;

             current =iv_ruleSequenceExpression; 
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
    // $ANTLR end "entryRuleSequenceExpression"


    // $ANTLR start "ruleSequenceExpression"
    // InternalKerMLExpressions.g:3649:1: ruleSequenceExpression returns [EObject current=null] : (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) ;
    public final EObject ruleSequenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operator_3_0=null;
        EObject this_OwnedExpression_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3655:2: ( (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) )
            // InternalKerMLExpressions.g:3656:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            {
            // InternalKerMLExpressions.g:3656:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            // InternalKerMLExpressions.g:3657:3: this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            			current = this_OwnedExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:3665:3: (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==EOF||LA34_1==51||LA34_1==53) ) {
                    alt34=1;
                }
                else if ( ((LA34_1>=RULE_STRING_VALUE && LA34_1<=RULE_UNRESTRICTED_NAME)||LA34_1==15||(LA34_1>=27 && LA34_1<=29)||LA34_1==31||(LA34_1>=38 && LA34_1<=40)||(LA34_1>=45 && LA34_1<=48)||LA34_1==50||LA34_1==56||(LA34_1>=63 && LA34_1<=65)) ) {
                    alt34=2;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalKerMLExpressions.g:3666:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3671:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:3671:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    // InternalKerMLExpressions.g:3672:5: () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) )
                    {
                    // InternalKerMLExpressions.g:3672:5: ()
                    // InternalKerMLExpressions.g:3673:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalKerMLExpressions.g:3679:5: ( (lv_operator_3_0= ',' ) )
                    // InternalKerMLExpressions.g:3680:6: (lv_operator_3_0= ',' )
                    {
                    // InternalKerMLExpressions.g:3680:6: (lv_operator_3_0= ',' )
                    // InternalKerMLExpressions.g:3681:7: lv_operator_3_0= ','
                    {
                    lv_operator_3_0=(Token)match(input,60,FOLLOW_5); 

                    							newLeafNode(lv_operator_3_0, grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSequenceExpressionRule());
                    							}
                    							setWithLastConsumed(current, "operator", lv_operator_3_0, ",");
                    						

                    }


                    }

                    // InternalKerMLExpressions.g:3693:5: ( (lv_operand_4_0= ruleSequenceExpression ) )
                    // InternalKerMLExpressions.g:3694:6: (lv_operand_4_0= ruleSequenceExpression )
                    {
                    // InternalKerMLExpressions.g:3694:6: (lv_operand_4_0= ruleSequenceExpression )
                    // InternalKerMLExpressions.g:3695:7: lv_operand_4_0= ruleSequenceExpression
                    {

                    							newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOperandSequenceExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_operand_4_0=ruleSequenceExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSequenceExpressionRule());
                    							}
                    							add(
                    								current,
                    								"operand",
                    								lv_operand_4_0,
                    								"org.omg.kerml.expressions.xtext.KerMLExpressions.SequenceExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleSequenceExpression"


    // $ANTLR start "entryRuleFeatureReferenceExpression"
    // InternalKerMLExpressions.g:3718:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:3718:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:3719:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
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
    // InternalKerMLExpressions.g:3725:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3731:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) )
            // InternalKerMLExpressions.g:3732:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            {
            // InternalKerMLExpressions.g:3732:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:3733:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:3733:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:3734:4: lv_ownedRelationship_0_0= ruleFeatureReferenceMember
            {

            				newCompositeNode(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipFeatureReferenceMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleFeatureReferenceMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFeatureReferenceExpressionRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.FeatureReferenceMember");
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


    // $ANTLR start "entryRuleFeatureReferenceMember"
    // InternalKerMLExpressions.g:3754:1: entryRuleFeatureReferenceMember returns [EObject current=null] : iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF ;
    public final EObject entryRuleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:3754:63: (iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:3755:2: iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF
            {
             newCompositeNode(grammarAccess.getFeatureReferenceMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReferenceMember=ruleFeatureReferenceMember();

            state._fsp--;

             current =iv_ruleFeatureReferenceMember; 
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
    // $ANTLR end "entryRuleFeatureReferenceMember"


    // $ANTLR start "ruleFeatureReferenceMember"
    // InternalKerMLExpressions.g:3761:1: ruleFeatureReferenceMember returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3767:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:3768:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:3768:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:3769:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:3769:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:3770:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFeatureReferenceMemberRule());
            				}
            			

            				newCompositeNode(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureCrossReference_0());
            			
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
    // $ANTLR end "ruleFeatureReferenceMember"


    // $ANTLR start "entryRuleMetadataAccessExpression"
    // InternalKerMLExpressions.g:3787:1: entryRuleMetadataAccessExpression returns [EObject current=null] : iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF ;
    public final EObject entryRuleMetadataAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataAccessExpression = null;


        try {
            // InternalKerMLExpressions.g:3787:65: (iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF )
            // InternalKerMLExpressions.g:3788:2: iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF
            {
             newCompositeNode(grammarAccess.getMetadataAccessExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataAccessExpression=ruleMetadataAccessExpression();

            state._fsp--;

             current =iv_ruleMetadataAccessExpression; 
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
    // $ANTLR end "entryRuleMetadataAccessExpression"


    // $ANTLR start "ruleMetadataAccessExpression"
    // InternalKerMLExpressions.g:3794:1: ruleMetadataAccessExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'metadata' ) ;
    public final EObject ruleMetadataAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3800:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'metadata' ) )
            // InternalKerMLExpressions.g:3801:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'metadata' )
            {
            // InternalKerMLExpressions.g:3801:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'metadata' )
            // InternalKerMLExpressions.g:3802:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'metadata'
            {
            // InternalKerMLExpressions.g:3802:3: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:3803:4: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:3803:4: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:3804:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataAccessExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMetadataAccessExpressionAccess().getReferencedElementElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_34);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getMetadataAccessExpressionAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMetadataAccessExpressionAccess().getMetadataKeyword_2());
            		

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
    // $ANTLR end "ruleMetadataAccessExpression"


    // $ANTLR start "entryRuleInvocationExpression"
    // InternalKerMLExpressions.g:3830:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLExpressions.g:3830:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:3831:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
            {
             newCompositeNode(grammarAccess.getInvocationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvocationExpression=ruleInvocationExpression();

            state._fsp--;

             current =iv_ruleInvocationExpression; 
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
    // $ANTLR end "entryRuleInvocationExpression"


    // $ANTLR start "ruleInvocationExpression"
    // InternalKerMLExpressions.g:3837:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;

        EObject this_ArgumentList_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3843:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) )
            // InternalKerMLExpressions.g:3844:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            {
            // InternalKerMLExpressions.g:3844:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            // InternalKerMLExpressions.g:3845:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current]
            {
            // InternalKerMLExpressions.g:3845:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:3846:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:3846:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:3847:5: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
            {

            					newCompositeNode(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_ownedRelationship_0_0=ruleOwnedFeatureTyping();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvocationExpressionRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureTyping");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getInvocationExpressionRule());
            			}
            			newCompositeNode(grammarAccess.getInvocationExpressionAccess().getArgumentListParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ArgumentList_1=ruleArgumentList(current);

            state._fsp--;


            			current = this_ArgumentList_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleInvocationExpression"


    // $ANTLR start "entryRuleOwnedFeatureTyping"
    // InternalKerMLExpressions.g:3879:1: entryRuleOwnedFeatureTyping returns [EObject current=null] : iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF ;
    public final EObject entryRuleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureTyping = null;


        try {
            // InternalKerMLExpressions.g:3879:59: (iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:3880:2: iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF
            {
             newCompositeNode(grammarAccess.getOwnedFeatureTypingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedFeatureTyping=ruleOwnedFeatureTyping();

            state._fsp--;

             current =iv_ruleOwnedFeatureTyping; 
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
    // $ANTLR end "entryRuleOwnedFeatureTyping"


    // $ANTLR start "ruleOwnedFeatureTyping"
    // InternalKerMLExpressions.g:3886:1: ruleOwnedFeatureTyping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) ) ;
    public final EObject ruleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3892:2: ( ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) ) )
            // InternalKerMLExpressions.g:3893:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )
            {
            // InternalKerMLExpressions.g:3893:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalKerMLExpressions.g:3894:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalKerMLExpressions.g:3894:3: ( ( ruleQualifiedName ) )
                    // InternalKerMLExpressions.g:3895:4: ( ruleQualifiedName )
                    {
                    // InternalKerMLExpressions.g:3895:4: ( ruleQualifiedName )
                    // InternalKerMLExpressions.g:3896:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOwnedFeatureTypingRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3911:3: ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) )
                    {
                    // InternalKerMLExpressions.g:3911:3: ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) )
                    // InternalKerMLExpressions.g:3912:4: (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain )
                    {
                    // InternalKerMLExpressions.g:3912:4: (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain )
                    // InternalKerMLExpressions.g:3913:5: lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain
                    {

                    					newCompositeNode(grammarAccess.getOwnedFeatureTypingAccess().getOwnedRelatedElementOwnedFeatureChainParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_1_0=ruleOwnedFeatureChain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOwnedFeatureTypingRule());
                    					}
                    					add(
                    						current,
                    						"ownedRelatedElement",
                    						lv_ownedRelatedElement_1_0,
                    						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureChain");
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
    // $ANTLR end "ruleOwnedFeatureTyping"


    // $ANTLR start "entryRuleOwnedFeatureChain"
    // InternalKerMLExpressions.g:3934:1: entryRuleOwnedFeatureChain returns [EObject current=null] : iv_ruleOwnedFeatureChain= ruleOwnedFeatureChain EOF ;
    public final EObject entryRuleOwnedFeatureChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureChain = null;


        try {
            // InternalKerMLExpressions.g:3934:58: (iv_ruleOwnedFeatureChain= ruleOwnedFeatureChain EOF )
            // InternalKerMLExpressions.g:3935:2: iv_ruleOwnedFeatureChain= ruleOwnedFeatureChain EOF
            {
             newCompositeNode(grammarAccess.getOwnedFeatureChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedFeatureChain=ruleOwnedFeatureChain();

            state._fsp--;

             current =iv_ruleOwnedFeatureChain; 
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
    // $ANTLR end "entryRuleOwnedFeatureChain"


    // $ANTLR start "ruleOwnedFeatureChain"
    // InternalKerMLExpressions.g:3941:1: ruleOwnedFeatureChain returns [EObject current=null] : this_FeatureChain_0= ruleFeatureChain[$current] ;
    public final EObject ruleOwnedFeatureChain() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureChain_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3947:2: (this_FeatureChain_0= ruleFeatureChain[$current] )
            // InternalKerMLExpressions.g:3948:2: this_FeatureChain_0= ruleFeatureChain[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getOwnedFeatureChainRule());
            		}
            		newCompositeNode(grammarAccess.getOwnedFeatureChainAccess().getFeatureChainParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FeatureChain_0=ruleFeatureChain(current);

            state._fsp--;


            		current = this_FeatureChain_0;
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
    // $ANTLR end "ruleOwnedFeatureChain"


    // $ANTLR start "ruleFeatureChain"
    // InternalKerMLExpressions.g:3963:1: ruleFeatureChain[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ ) ;
    public final EObject ruleFeatureChain(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3969:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ ) )
            // InternalKerMLExpressions.g:3970:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ )
            {
            // InternalKerMLExpressions.g:3970:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ )
            // InternalKerMLExpressions.g:3971:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+
            {
            // InternalKerMLExpressions.g:3971:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) )
            // InternalKerMLExpressions.g:3972:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining )
            {
            // InternalKerMLExpressions.g:3972:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining )
            // InternalKerMLExpressions.g:3973:5: lv_ownedRelationship_0_0= ruleOwnedFeatureChaining
            {

            					newCompositeNode(grammarAccess.getFeatureChainAccess().getOwnedRelationshipOwnedFeatureChainingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_ownedRelationship_0_0=ruleOwnedFeatureChaining();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureChainRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureChaining");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLExpressions.g:3990:3: (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==48) ) {
                    int LA36_2 = input.LA(2);

                    if ( ((LA36_2>=RULE_ID && LA36_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3991:4: otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFeatureChainAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:3995:4: ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) )
            	    // InternalKerMLExpressions.g:3996:5: (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining )
            	    {
            	    // InternalKerMLExpressions.g:3996:5: (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining )
            	    // InternalKerMLExpressions.g:3997:6: lv_ownedRelationship_2_0= ruleOwnedFeatureChaining
            	    {

            	    						newCompositeNode(grammarAccess.getFeatureChainAccess().getOwnedRelationshipOwnedFeatureChainingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_ownedRelationship_2_0=ruleOwnedFeatureChaining();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFeatureChainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureChaining");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // $ANTLR end "ruleFeatureChain"


    // $ANTLR start "entryRuleOwnedFeatureChaining"
    // InternalKerMLExpressions.g:4019:1: entryRuleOwnedFeatureChaining returns [EObject current=null] : iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF ;
    public final EObject entryRuleOwnedFeatureChaining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureChaining = null;


        try {
            // InternalKerMLExpressions.g:4019:61: (iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF )
            // InternalKerMLExpressions.g:4020:2: iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF
            {
             newCompositeNode(grammarAccess.getOwnedFeatureChainingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedFeatureChaining=ruleOwnedFeatureChaining();

            state._fsp--;

             current =iv_ruleOwnedFeatureChaining; 
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
    // $ANTLR end "entryRuleOwnedFeatureChaining"


    // $ANTLR start "ruleOwnedFeatureChaining"
    // InternalKerMLExpressions.g:4026:1: ruleOwnedFeatureChaining returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleOwnedFeatureChaining() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4032:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:4033:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:4033:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:4034:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:4034:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:4035:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOwnedFeatureChainingRule());
            				}
            			

            				newCompositeNode(grammarAccess.getOwnedFeatureChainingAccess().getChainingFeatureFeatureCrossReference_0());
            			
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
    // $ANTLR end "ruleOwnedFeatureChaining"


    // $ANTLR start "ruleArgumentList"
    // InternalKerMLExpressions.g:4053:1: ruleArgumentList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_PositionalArgumentList_1 = null;

        EObject this_NamedArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4059:2: ( (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) )
            // InternalKerMLExpressions.g:4060:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            {
            // InternalKerMLExpressions.g:4060:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            // InternalKerMLExpressions.g:4061:3: otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalKerMLExpressions.g:4065:3: (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )?
            int alt37=3;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalKerMLExpressions.g:4066:4: this_PositionalArgumentList_1= rulePositionalArgumentList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getArgumentListRule());
                    				}
                    				newCompositeNode(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_26);
                    this_PositionalArgumentList_1=rulePositionalArgumentList(current);

                    state._fsp--;


                    				current = this_PositionalArgumentList_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4078:4: this_NamedArgumentList_2= ruleNamedArgumentList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getArgumentListRule());
                    				}
                    				newCompositeNode(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_26);
                    this_NamedArgumentList_2=ruleNamedArgumentList(current);

                    state._fsp--;


                    				current = this_NamedArgumentList_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArgumentListAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "rulePositionalArgumentList"
    // InternalKerMLExpressions.g:4099:1: rulePositionalArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )* ) ;
    public final EObject rulePositionalArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4105:2: ( ( ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )* ) )
            // InternalKerMLExpressions.g:4106:2: ( ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )* )
            {
            // InternalKerMLExpressions.g:4106:2: ( ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )* )
            // InternalKerMLExpressions.g:4107:3: ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )*
            {
            // InternalKerMLExpressions.g:4107:3: ( (lv_ownedRelationship_0_0= ruleArgumentMember ) )
            // InternalKerMLExpressions.g:4108:4: (lv_ownedRelationship_0_0= ruleArgumentMember )
            {
            // InternalKerMLExpressions.g:4108:4: (lv_ownedRelationship_0_0= ruleArgumentMember )
            // InternalKerMLExpressions.g:4109:5: lv_ownedRelationship_0_0= ruleArgumentMember
            {

            					newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipArgumentMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_ownedRelationship_0_0=ruleArgumentMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionalArgumentListRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.ArgumentMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLExpressions.g:4126:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==60) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4127:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) )
            	    {
            	    otherlv_1=(Token)match(input,60,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:4131:4: ( (lv_ownedRelationship_2_0= ruleArgumentMember ) )
            	    // InternalKerMLExpressions.g:4132:5: (lv_ownedRelationship_2_0= ruleArgumentMember )
            	    {
            	    // InternalKerMLExpressions.g:4132:5: (lv_ownedRelationship_2_0= ruleArgumentMember )
            	    // InternalKerMLExpressions.g:4133:6: lv_ownedRelationship_2_0= ruleArgumentMember
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipArgumentMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_ownedRelationship_2_0=ruleArgumentMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPositionalArgumentListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ArgumentMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "rulePositionalArgumentList"


    // $ANTLR start "entryRuleArgumentMember"
    // InternalKerMLExpressions.g:4155:1: entryRuleArgumentMember returns [EObject current=null] : iv_ruleArgumentMember= ruleArgumentMember EOF ;
    public final EObject entryRuleArgumentMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentMember = null;


        try {
            // InternalKerMLExpressions.g:4155:55: (iv_ruleArgumentMember= ruleArgumentMember EOF )
            // InternalKerMLExpressions.g:4156:2: iv_ruleArgumentMember= ruleArgumentMember EOF
            {
             newCompositeNode(grammarAccess.getArgumentMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentMember=ruleArgumentMember();

            state._fsp--;

             current =iv_ruleArgumentMember; 
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
    // $ANTLR end "entryRuleArgumentMember"


    // $ANTLR start "ruleArgumentMember"
    // InternalKerMLExpressions.g:4162:1: ruleArgumentMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleArgument ) ) ;
    public final EObject ruleArgumentMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4168:2: ( ( (lv_ownedRelatedElement_0_0= ruleArgument ) ) )
            // InternalKerMLExpressions.g:4169:2: ( (lv_ownedRelatedElement_0_0= ruleArgument ) )
            {
            // InternalKerMLExpressions.g:4169:2: ( (lv_ownedRelatedElement_0_0= ruleArgument ) )
            // InternalKerMLExpressions.g:4170:3: (lv_ownedRelatedElement_0_0= ruleArgument )
            {
            // InternalKerMLExpressions.g:4170:3: (lv_ownedRelatedElement_0_0= ruleArgument )
            // InternalKerMLExpressions.g:4171:4: lv_ownedRelatedElement_0_0= ruleArgument
            {

            				newCompositeNode(grammarAccess.getArgumentMemberAccess().getOwnedRelatedElementArgumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleArgument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getArgumentMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.Argument");
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
    // $ANTLR end "ruleArgumentMember"


    // $ANTLR start "entryRuleArgument"
    // InternalKerMLExpressions.g:4191:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalKerMLExpressions.g:4191:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalKerMLExpressions.g:4192:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalKerMLExpressions.g:4198:1: ruleArgument returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleArgumentValue ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4204:2: ( ( (lv_ownedRelationship_0_0= ruleArgumentValue ) ) )
            // InternalKerMLExpressions.g:4205:2: ( (lv_ownedRelationship_0_0= ruleArgumentValue ) )
            {
            // InternalKerMLExpressions.g:4205:2: ( (lv_ownedRelationship_0_0= ruleArgumentValue ) )
            // InternalKerMLExpressions.g:4206:3: (lv_ownedRelationship_0_0= ruleArgumentValue )
            {
            // InternalKerMLExpressions.g:4206:3: (lv_ownedRelationship_0_0= ruleArgumentValue )
            // InternalKerMLExpressions.g:4207:4: lv_ownedRelationship_0_0= ruleArgumentValue
            {

            				newCompositeNode(grammarAccess.getArgumentAccess().getOwnedRelationshipArgumentValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleArgumentValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getArgumentRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.ArgumentValue");
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "ruleNamedArgumentList"
    // InternalKerMLExpressions.g:4228:1: ruleNamedArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )* ) ;
    public final EObject ruleNamedArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4234:2: ( ( ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )* ) )
            // InternalKerMLExpressions.g:4235:2: ( ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )* )
            {
            // InternalKerMLExpressions.g:4235:2: ( ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )* )
            // InternalKerMLExpressions.g:4236:3: ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )*
            {
            // InternalKerMLExpressions.g:4236:3: ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) )
            // InternalKerMLExpressions.g:4237:4: (lv_ownedRelationship_0_0= ruleNamedArgumentMember )
            {
            // InternalKerMLExpressions.g:4237:4: (lv_ownedRelationship_0_0= ruleNamedArgumentMember )
            // InternalKerMLExpressions.g:4238:5: lv_ownedRelationship_0_0= ruleNamedArgumentMember
            {

            					newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedArgumentMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_ownedRelationship_0_0=ruleNamedArgumentMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedArgumentListRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.NamedArgumentMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLExpressions.g:4255:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==60) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4256:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) )
            	    {
            	    otherlv_1=(Token)match(input,60,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:4260:4: ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) )
            	    // InternalKerMLExpressions.g:4261:5: (lv_ownedRelationship_2_0= ruleNamedArgumentMember )
            	    {
            	    // InternalKerMLExpressions.g:4261:5: (lv_ownedRelationship_2_0= ruleNamedArgumentMember )
            	    // InternalKerMLExpressions.g:4262:6: lv_ownedRelationship_2_0= ruleNamedArgumentMember
            	    {

            	    						newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedArgumentMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_ownedRelationship_2_0=ruleNamedArgumentMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNamedArgumentListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.NamedArgumentMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleNamedArgumentList"


    // $ANTLR start "entryRuleNamedArgumentMember"
    // InternalKerMLExpressions.g:4284:1: entryRuleNamedArgumentMember returns [EObject current=null] : iv_ruleNamedArgumentMember= ruleNamedArgumentMember EOF ;
    public final EObject entryRuleNamedArgumentMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgumentMember = null;


        try {
            // InternalKerMLExpressions.g:4284:60: (iv_ruleNamedArgumentMember= ruleNamedArgumentMember EOF )
            // InternalKerMLExpressions.g:4285:2: iv_ruleNamedArgumentMember= ruleNamedArgumentMember EOF
            {
             newCompositeNode(grammarAccess.getNamedArgumentMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedArgumentMember=ruleNamedArgumentMember();

            state._fsp--;

             current =iv_ruleNamedArgumentMember; 
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
    // $ANTLR end "entryRuleNamedArgumentMember"


    // $ANTLR start "ruleNamedArgumentMember"
    // InternalKerMLExpressions.g:4291:1: ruleNamedArgumentMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleNamedArgument ) ) ;
    public final EObject ruleNamedArgumentMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4297:2: ( ( (lv_ownedRelatedElement_0_0= ruleNamedArgument ) ) )
            // InternalKerMLExpressions.g:4298:2: ( (lv_ownedRelatedElement_0_0= ruleNamedArgument ) )
            {
            // InternalKerMLExpressions.g:4298:2: ( (lv_ownedRelatedElement_0_0= ruleNamedArgument ) )
            // InternalKerMLExpressions.g:4299:3: (lv_ownedRelatedElement_0_0= ruleNamedArgument )
            {
            // InternalKerMLExpressions.g:4299:3: (lv_ownedRelatedElement_0_0= ruleNamedArgument )
            // InternalKerMLExpressions.g:4300:4: lv_ownedRelatedElement_0_0= ruleNamedArgument
            {

            				newCompositeNode(grammarAccess.getNamedArgumentMemberAccess().getOwnedRelatedElementNamedArgumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleNamedArgument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNamedArgumentMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.NamedArgument");
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
    // $ANTLR end "ruleNamedArgumentMember"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalKerMLExpressions.g:4320:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalKerMLExpressions.g:4320:54: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalKerMLExpressions.g:4321:2: iv_ruleNamedArgument= ruleNamedArgument EOF
            {
             newCompositeNode(grammarAccess.getNamedArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedArgument=ruleNamedArgument();

            state._fsp--;

             current =iv_ruleNamedArgument; 
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
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalKerMLExpressions.g:4327:1: ruleNamedArgument returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4333:2: ( ( ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) ) ) )
            // InternalKerMLExpressions.g:4334:2: ( ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) ) )
            {
            // InternalKerMLExpressions.g:4334:2: ( ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) ) )
            // InternalKerMLExpressions.g:4335:3: ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) )
            {
            // InternalKerMLExpressions.g:4335:3: ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) )
            // InternalKerMLExpressions.g:4336:4: (lv_ownedRelationship_0_0= ruleParameterRedefinition )
            {
            // InternalKerMLExpressions.g:4336:4: (lv_ownedRelationship_0_0= ruleParameterRedefinition )
            // InternalKerMLExpressions.g:4337:5: lv_ownedRelationship_0_0= ruleParameterRedefinition
            {

            					newCompositeNode(grammarAccess.getNamedArgumentAccess().getOwnedRelationshipParameterRedefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_ownedRelationship_0_0=ruleParameterRedefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedArgumentRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.ParameterRedefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalKerMLExpressions.g:4358:3: ( (lv_ownedRelationship_2_0= ruleArgumentValue ) )
            // InternalKerMLExpressions.g:4359:4: (lv_ownedRelationship_2_0= ruleArgumentValue )
            {
            // InternalKerMLExpressions.g:4359:4: (lv_ownedRelationship_2_0= ruleArgumentValue )
            // InternalKerMLExpressions.g:4360:5: lv_ownedRelationship_2_0= ruleArgumentValue
            {

            					newCompositeNode(grammarAccess.getNamedArgumentAccess().getOwnedRelationshipArgumentValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_2_0=ruleArgumentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedArgumentRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_2_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.ArgumentValue");
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
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleParameterRedefinition"
    // InternalKerMLExpressions.g:4381:1: entryRuleParameterRedefinition returns [EObject current=null] : iv_ruleParameterRedefinition= ruleParameterRedefinition EOF ;
    public final EObject entryRuleParameterRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRedefinition = null;


        try {
            // InternalKerMLExpressions.g:4381:62: (iv_ruleParameterRedefinition= ruleParameterRedefinition EOF )
            // InternalKerMLExpressions.g:4382:2: iv_ruleParameterRedefinition= ruleParameterRedefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterRedefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterRedefinition=ruleParameterRedefinition();

            state._fsp--;

             current =iv_ruleParameterRedefinition; 
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
    // $ANTLR end "entryRuleParameterRedefinition"


    // $ANTLR start "ruleParameterRedefinition"
    // InternalKerMLExpressions.g:4388:1: ruleParameterRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleParameterRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4394:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:4395:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:4395:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:4396:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:4396:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:4397:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterRedefinitionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getParameterRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0());
            			
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
    // $ANTLR end "ruleParameterRedefinition"


    // $ANTLR start "entryRuleArgumentValue"
    // InternalKerMLExpressions.g:4414:1: entryRuleArgumentValue returns [EObject current=null] : iv_ruleArgumentValue= ruleArgumentValue EOF ;
    public final EObject entryRuleArgumentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentValue = null;


        try {
            // InternalKerMLExpressions.g:4414:54: (iv_ruleArgumentValue= ruleArgumentValue EOF )
            // InternalKerMLExpressions.g:4415:2: iv_ruleArgumentValue= ruleArgumentValue EOF
            {
             newCompositeNode(grammarAccess.getArgumentValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentValue=ruleArgumentValue();

            state._fsp--;

             current =iv_ruleArgumentValue; 
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
    // $ANTLR end "entryRuleArgumentValue"


    // $ANTLR start "ruleArgumentValue"
    // InternalKerMLExpressions.g:4421:1: ruleArgumentValue returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleArgumentValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4427:2: ( ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:4428:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:4428:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:4429:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:4429:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:4430:4: lv_ownedRelatedElement_0_0= ruleOwnedExpression
            {

            				newCompositeNode(grammarAccess.getArgumentValueAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleOwnedExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getArgumentValueRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
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
    // $ANTLR end "ruleArgumentValue"


    // $ANTLR start "entryRuleNullExpression"
    // InternalKerMLExpressions.g:4450:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalKerMLExpressions.g:4450:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLExpressions.g:4451:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
             newCompositeNode(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;

             current =iv_ruleNullExpression; 
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
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // InternalKerMLExpressions.g:4457:1: ruleNullExpression returns [EObject current=null] : ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4463:2: ( ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) )
            // InternalKerMLExpressions.g:4464:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            {
            // InternalKerMLExpressions.g:4464:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            // InternalKerMLExpressions.g:4465:3: () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            {
            // InternalKerMLExpressions.g:4465:3: ()
            // InternalKerMLExpressions.g:4466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
            					current);
            			

            }

            // InternalKerMLExpressions.g:4472:3: (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==63) ) {
                alt40=1;
            }
            else if ( (LA40_0==50) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalKerMLExpressions.g:4473:4: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4478:4: (otherlv_2= '(' otherlv_3= ')' )
                    {
                    // InternalKerMLExpressions.g:4478:4: (otherlv_2= '(' otherlv_3= ')' )
                    // InternalKerMLExpressions.g:4479:5: otherlv_2= '(' otherlv_3= ')'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_26); 

                    					newLeafNode(otherlv_2, grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getRightParenthesisKeyword_1_1_1());
                    				

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
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalKerMLExpressions.g:4493:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLExpressions.g:4493:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:4494:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalKerMLExpressions.g:4500:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralInteger_2 = null;

        EObject this_LiteralReal_3 = null;

        EObject this_LiteralInfinity_4 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4506:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) )
            // InternalKerMLExpressions.g:4507:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            {
            // InternalKerMLExpressions.g:4507:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 64:
            case 65:
                {
                alt41=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt41=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA41_3 = input.LA(2);

                if ( (LA41_3==48) ) {
                    int LA41_6 = input.LA(3);

                    if ( ((LA41_6>=RULE_ID && LA41_6<=RULE_UNRESTRICTED_NAME)||LA41_6==56) ) {
                        alt41=3;
                    }
                    else if ( ((LA41_6>=RULE_DECIMAL_VALUE && LA41_6<=RULE_EXP_VALUE)) ) {
                        alt41=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA41_3==EOF||(LA41_3>=13 && LA41_3<=14)||(LA41_3>=16 && LA41_3<=29)||LA41_3==31||(LA41_3>=33 && LA41_3<=44)||LA41_3==49||(LA41_3>=51 && LA41_3<=55)||LA41_3==58||LA41_3==60) ) {
                    alt41=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 48:
                {
                alt41=4;
                }
                break;
            case 40:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalKerMLExpressions.g:4508:3: this_LiteralBoolean_0= ruleLiteralBoolean
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralBoolean_0=ruleLiteralBoolean();

                    state._fsp--;


                    			current = this_LiteralBoolean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4517:3: this_LiteralString_1= ruleLiteralString
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralString_1=ruleLiteralString();

                    state._fsp--;


                    			current = this_LiteralString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:4526:3: this_LiteralInteger_2= ruleLiteralInteger
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralInteger_2=ruleLiteralInteger();

                    state._fsp--;


                    			current = this_LiteralInteger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:4535:3: this_LiteralReal_3= ruleLiteralReal
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralRealParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralReal_3=ruleLiteralReal();

                    state._fsp--;


                    			current = this_LiteralReal_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:4544:3: this_LiteralInfinity_4= ruleLiteralInfinity
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralInfinityParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralInfinity_4=ruleLiteralInfinity();

                    state._fsp--;


                    			current = this_LiteralInfinity_4;
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


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalKerMLExpressions.g:4556:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLExpressions.g:4556:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:4557:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;

             current =iv_ruleLiteralBoolean; 
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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalKerMLExpressions.g:4563:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4569:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalKerMLExpressions.g:4570:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalKerMLExpressions.g:4570:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalKerMLExpressions.g:4571:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:4571:3: (lv_value_0_0= ruleBooleanValue )
            // InternalKerMLExpressions.g:4572:4: lv_value_0_0= ruleBooleanValue
            {

            				newCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralBooleanRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.BooleanValue");
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
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalKerMLExpressions.g:4592:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLExpressions.g:4592:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:4593:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue.getText(); 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalKerMLExpressions.g:4599:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4605:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLExpressions.g:4606:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLExpressions.g:4606:2: (kw= 'true' | kw= 'false' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            else if ( (LA42_0==65) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalKerMLExpressions.g:4607:3: kw= 'true'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4613:3: kw= 'false'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleLiteralString"
    // InternalKerMLExpressions.g:4622:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // InternalKerMLExpressions.g:4622:54: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLExpressions.g:4623:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             newCompositeNode(grammarAccess.getLiteralStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralString=ruleLiteralString();

            state._fsp--;

             current =iv_ruleLiteralString; 
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
    // $ANTLR end "entryRuleLiteralString"


    // $ANTLR start "ruleLiteralString"
    // InternalKerMLExpressions.g:4629:1: ruleLiteralString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4635:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalKerMLExpressions.g:4636:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalKerMLExpressions.g:4636:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:4637:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:4637:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:4638:4: lv_value_0_0= RULE_STRING_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLiteralStringAccess().getValueSTRING_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.STRING_VALUE");
            			

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
    // $ANTLR end "ruleLiteralString"


    // $ANTLR start "entryRuleLiteralInteger"
    // InternalKerMLExpressions.g:4657:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLExpressions.g:4657:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:4658:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             newCompositeNode(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInteger=ruleLiteralInteger();

            state._fsp--;

             current =iv_ruleLiteralInteger; 
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
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // InternalKerMLExpressions.g:4664:1: ruleLiteralInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4670:2: ( ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) )
            // InternalKerMLExpressions.g:4671:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            {
            // InternalKerMLExpressions.g:4671:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:4672:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:4672:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:4673:4: lv_value_0_0= RULE_DECIMAL_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLiteralIntegerAccess().getValueDECIMAL_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralIntegerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.DECIMAL_VALUE");
            			

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
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleLiteralReal"
    // InternalKerMLExpressions.g:4692:1: entryRuleLiteralReal returns [EObject current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final EObject entryRuleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralReal = null;


        try {
            // InternalKerMLExpressions.g:4692:52: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:4693:2: iv_ruleLiteralReal= ruleLiteralReal EOF
            {
             newCompositeNode(grammarAccess.getLiteralRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralReal=ruleLiteralReal();

            state._fsp--;

             current =iv_ruleLiteralReal; 
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
    // $ANTLR end "entryRuleLiteralReal"


    // $ANTLR start "ruleLiteralReal"
    // InternalKerMLExpressions.g:4699:1: ruleLiteralReal returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleLiteralReal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4705:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalKerMLExpressions.g:4706:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalKerMLExpressions.g:4706:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalKerMLExpressions.g:4707:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalKerMLExpressions.g:4707:3: (lv_value_0_0= ruleRealValue )
            // InternalKerMLExpressions.g:4708:4: lv_value_0_0= ruleRealValue
            {

            				newCompositeNode(grammarAccess.getLiteralRealAccess().getValueRealValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleRealValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralRealRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.RealValue");
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
    // $ANTLR end "ruleLiteralReal"


    // $ANTLR start "entryRuleRealValue"
    // InternalKerMLExpressions.g:4728:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLExpressions.g:4728:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLExpressions.g:4729:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalKerMLExpressions.g:4735:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4741:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLExpressions.g:4742:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLExpressions.g:4742:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DECIMAL_VALUE||LA45_0==48) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_EXP_VALUE) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalKerMLExpressions.g:4743:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLExpressions.g:4743:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLExpressions.g:4744:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:4744:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_DECIMAL_VALUE) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalKerMLExpressions.g:4745:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_34); 

                            					current.merge(this_DECIMAL_VALUE_0);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,48,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalKerMLExpressions.g:4758:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_DECIMAL_VALUE) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==RULE_EXP_VALUE) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalKerMLExpressions.g:4759:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

                            					current.merge(this_DECIMAL_VALUE_2);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLExpressions.g:4767:5: this_EXP_VALUE_3= RULE_EXP_VALUE
                            {
                            this_EXP_VALUE_3=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); 

                            					current.merge(this_EXP_VALUE_3);
                            				

                            					newLeafNode(this_EXP_VALUE_3, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4777:3: this_EXP_VALUE_4= RULE_EXP_VALUE
                    {
                    this_EXP_VALUE_4=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); 

                    			current.merge(this_EXP_VALUE_4);
                    		

                    			newLeafNode(this_EXP_VALUE_4, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleLiteralInfinity"
    // InternalKerMLExpressions.g:4788:1: entryRuleLiteralInfinity returns [EObject current=null] : iv_ruleLiteralInfinity= ruleLiteralInfinity EOF ;
    public final EObject entryRuleLiteralInfinity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInfinity = null;


        try {
            // InternalKerMLExpressions.g:4788:56: (iv_ruleLiteralInfinity= ruleLiteralInfinity EOF )
            // InternalKerMLExpressions.g:4789:2: iv_ruleLiteralInfinity= ruleLiteralInfinity EOF
            {
             newCompositeNode(grammarAccess.getLiteralInfinityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInfinity=ruleLiteralInfinity();

            state._fsp--;

             current =iv_ruleLiteralInfinity; 
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
    // $ANTLR end "entryRuleLiteralInfinity"


    // $ANTLR start "ruleLiteralInfinity"
    // InternalKerMLExpressions.g:4795:1: ruleLiteralInfinity returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleLiteralInfinity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4801:2: ( ( () otherlv_1= '*' ) )
            // InternalKerMLExpressions.g:4802:2: ( () otherlv_1= '*' )
            {
            // InternalKerMLExpressions.g:4802:2: ( () otherlv_1= '*' )
            // InternalKerMLExpressions.g:4803:3: () otherlv_1= '*'
            {
            // InternalKerMLExpressions.g:4803:3: ()
            // InternalKerMLExpressions.g:4804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralInfinityAccess().getLiteralInfinityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralInfinityAccess().getAsteriskKeyword_1());
            		

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
    // $ANTLR end "ruleLiteralInfinity"


    // $ANTLR start "entryRuleName"
    // InternalKerMLExpressions.g:4818:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLExpressions.g:4818:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLExpressions.g:4819:2: iv_ruleName= ruleName EOF
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
    // InternalKerMLExpressions.g:4825:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4831:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLExpressions.g:4832:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLExpressions.g:4832:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_UNRESTRICTED_NAME) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalKerMLExpressions.g:4833:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4841:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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


    // $ANTLR start "entryRuleQualification"
    // InternalKerMLExpressions.g:4852:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalKerMLExpressions.g:4852:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalKerMLExpressions.g:4853:2: iv_ruleQualification= ruleQualification EOF
            {
             newCompositeNode(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualification=ruleQualification();

            state._fsp--;

             current =iv_ruleQualification.getText(); 
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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalKerMLExpressions.g:4859:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4865:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalKerMLExpressions.g:4866:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalKerMLExpressions.g:4866:2: (this_Name_0= ruleName kw= '::' )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==66) ) {
                        alt47=1;
                    }


                }
                else if ( (LA47_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA47_3 = input.LA(2);

                    if ( (LA47_3==66) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4867:3: this_Name_0= ruleName kw= '::'
            	    {

            	    			newCompositeNode(grammarAccess.getQualificationAccess().getNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_40);
            	    this_Name_0=ruleName();

            	    state._fsp--;


            	    			current.merge(this_Name_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,66,FOLLOW_41); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualificationAccess().getColonColonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);


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
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalKerMLExpressions.g:4886:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:4886:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:4887:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalKerMLExpressions.g:4893:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4899:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalKerMLExpressions.g:4900:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalKerMLExpressions.g:4900:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalKerMLExpressions.g:4901:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalKerMLExpressions.g:4901:3: (this_Qualification_0= ruleQualification )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==66) ) {
                    alt48=1;
                }
            }
            else if ( (LA48_0==RULE_UNRESTRICTED_NAME) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==66) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalKerMLExpressions.g:4902:4: this_Qualification_0= ruleQualification
                    {

                    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_14);
                    this_Qualification_0=ruleQualification();

                    state._fsp--;


                    				current.merge(this_Qualification_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Name_1=ruleName();

            state._fsp--;


            			current.merge(this_Name_1);
            		

            			afterParserOrEnumRuleCall();
            		

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

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\uffff\2\1\5\uffff";
    static final String dfa_3s = "\1\4\1\uffff\2\15\2\uffff\1\7\2\uffff";
    static final String dfa_4s = "\1\101\1\uffff\2\102\2\uffff\1\10\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\4\1\uffff\1\5\1\3";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
            "\3\1\1\2\1\3\22\uffff\3\4\1\uffff\1\5\6\uffff\3\1\4\uffff\4\1\1\uffff\1\1\5\uffff\1\1\6\uffff\3\1",
            "",
            "\2\1\1\uffff\16\1\1\10\1\1\1\7\14\1\3\uffff\10\1\2\uffff\1\1\1\uffff\1\1\5\uffff\1\6",
            "\2\1\1\uffff\16\1\1\10\1\1\1\7\14\1\3\uffff\10\1\2\uffff\1\1\1\uffff\1\1\5\uffff\1\6",
            "",
            "",
            "\1\2\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1336:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) )";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\1\uffff\2\5\4\uffff";
    static final String dfa_10s = "\1\7\2\15\2\7\2\uffff";
    static final String dfa_11s = "\1\10\2\102\1\10\1\70\2\uffff";
    static final String dfa_12s = "\5\uffff\1\1\1\2";
    static final String dfa_13s = "\7\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\2",
            "\2\5\1\uffff\16\5\1\uffff\1\5\1\uffff\14\5\3\uffff\1\4\1\5\1\uffff\5\5\2\uffff\1\5\1\uffff\1\5\5\uffff\1\3",
            "\2\5\1\uffff\16\5\1\uffff\1\5\1\uffff\14\5\3\uffff\1\4\1\5\1\uffff\5\5\2\uffff\1\5\1\uffff\1\5\5\uffff\1\3",
            "\1\1\1\2",
            "\2\6\57\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3244:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )";
        }
    }
    static final String dfa_15s = "\24\uffff";
    static final String dfa_16s = "\4\uffff\2\11\6\uffff\2\11\3\uffff\2\11\1\uffff";
    static final String dfa_17s = "\1\4\1\uffff\1\4\1\uffff\2\15\2\uffff\1\7\1\uffff\1\7\1\uffff\2\15\1\uffff\2\7\2\15\1\7";
    static final String dfa_18s = "\1\101\1\uffff\1\101\1\uffff\2\102\2\uffff\1\75\1\uffff\1\10\1\uffff\2\102\1\uffff\1\70\1\10\2\102\1\10";
    static final String dfa_19s = "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\6\1\7\1\uffff\1\3\1\uffff\1\5\2\uffff\1\4\5\uffff";
    static final String dfa_20s = "\24\uffff}>";
    static final String[] dfa_21s = {
            "\3\3\1\4\1\5\37\uffff\1\3\7\uffff\1\3\1\uffff\1\2\5\uffff\1\6\6\uffff\1\1\2\3",
            "",
            "\5\7\6\uffff\1\7\13\uffff\3\7\1\uffff\1\7\6\uffff\3\7\4\uffff\4\7\1\uffff\1\7\1\1\4\uffff\1\7\6\uffff\3\7",
            "",
            "\2\11\1\uffff\16\11\1\uffff\1\11\1\uffff\14\11\3\uffff\1\10\1\11\1\13\5\11\2\uffff\1\11\1\uffff\1\11\5\uffff\1\12",
            "\2\11\1\uffff\16\11\1\uffff\1\11\1\uffff\14\11\3\uffff\1\10\1\11\1\13\5\11\2\uffff\1\11\1\uffff\1\11\5\uffff\1\12",
            "",
            "",
            "\1\14\1\15\57\uffff\1\11\4\uffff\1\16",
            "",
            "\1\4\1\5",
            "",
            "\2\11\1\uffff\16\11\1\uffff\1\11\1\uffff\14\11\3\uffff\1\17\1\11\1\13\5\11\2\uffff\1\11\1\uffff\1\11\5\uffff\1\20",
            "\2\11\1\uffff\16\11\1\uffff\1\11\1\uffff\14\11\3\uffff\1\17\1\11\1\13\5\11\2\uffff\1\11\1\uffff\1\11\5\uffff\1\20",
            "",
            "\1\21\1\22\57\uffff\1\11",
            "\1\14\1\15",
            "\2\11\1\uffff\16\11\1\uffff\1\11\1\uffff\14\11\3\uffff\1\17\1\11\1\13\5\11\2\uffff\1\11\1\uffff\1\11\5\uffff\1\23",
            "\2\11\1\uffff\16\11\1\uffff\1\11\1\uffff\14\11\3\uffff\1\17\1\11\1\13\5\11\2\uffff\1\11\1\uffff\1\11\5\uffff\1\23",
            "\1\21\1\22"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "3308:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (otherlv_6= '(' this_SequenceExpression_7= ruleSequenceExpression otherlv_8= ')' ) )";
        }
    }
    static final String dfa_22s = "\6\uffff";
    static final String dfa_23s = "\1\uffff\2\5\3\uffff";
    static final String dfa_24s = "\1\7\2\60\1\7\2\uffff";
    static final String dfa_25s = "\1\10\2\102\1\10\2\uffff";
    static final String dfa_26s = "\4\uffff\1\2\1\1";
    static final String dfa_27s = "\6\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\1\2",
            "\1\4\1\uffff\1\5\17\uffff\1\3",
            "\1\4\1\uffff\1\5\17\uffff\1\3",
            "\1\1\1\2",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "3893:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )";
        }
    }
    static final String dfa_29s = "\1\4\1\uffff\2\20\1\uffff\1\7\1\uffff";
    static final String dfa_30s = "\1\101\1\uffff\2\102\1\uffff\1\10\1\uffff";
    static final String dfa_31s = "\1\uffff\1\1\2\uffff\1\3\1\uffff\1\2";
    static final String[] dfa_32s = {
            "\3\1\1\2\1\3\6\uffff\1\1\13\uffff\3\1\1\uffff\1\1\6\uffff\3\1\4\uffff\4\1\1\uffff\1\1\1\4\4\uffff\1\1\6\uffff\3\1",
            "",
            "\35\1\3\uffff\5\1\1\uffff\2\1\4\uffff\1\1\1\uffff\1\6\3\uffff\1\5",
            "\35\1\3\uffff\5\1\1\uffff\2\1\4\uffff\1\1\1\uffff\1\6\3\uffff\1\5",
            "",
            "\1\2\1\3",
            ""
    };
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_13;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "4065:3: (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8105E1C0000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8105E1C0000081F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000B8000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00D3000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0104000000000180L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8905E1C0000081F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x810DE1C0000081F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000182L});

}