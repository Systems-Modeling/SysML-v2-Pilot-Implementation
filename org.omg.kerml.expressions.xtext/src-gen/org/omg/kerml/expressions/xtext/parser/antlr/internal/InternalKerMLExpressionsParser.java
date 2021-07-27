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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_VALUE", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_DOCUMENTATION_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "':'", "'if'", "'else'", "'?'", "'??'", "'implies'", "'|'", "'||'", "'or'", "'^^'", "'xor'", "'&'", "'&&'", "'and'", "'=='", "'!='", "'instanceof'", "'hastype'", "'istype'", "'@'", "'as'", "'<'", "'>'", "'<='", "'>='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'^'", "'@['", "']'", "'!'", "'~'", "'not'", "'all'", "'['", "'->'", "'.'", "'('", "')'", "'{'", "';'", "'}'", "'in'", "','", "'='", "'null'", "'true'", "'false'", "'::'"
    };
    public static final int T__50=50;
    public static final int RULE_SL_NOTE=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=10;
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
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=11;
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
    public static final int RULE_WS=13;
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


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalKerMLExpressions.g:125:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalKerMLExpressions.g:125:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalKerMLExpressions.g:126:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
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
    // InternalKerMLExpressions.g:132:1: ruleConditionalExpression returns [EObject current=null] : ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? ) | ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpression ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleConditionalExpression ) ) ) ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject this_NullCoalescingExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_operand_5_0 = null;

        EObject lv_operand_8_0 = null;

        AntlrDatatypeRuleToken lv_operator_9_0 = null;

        EObject lv_operand_10_0 = null;

        EObject lv_operand_12_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:138:2: ( ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? ) | ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpression ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleConditionalExpression ) ) ) ) )
            // InternalKerMLExpressions.g:139:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? ) | ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpression ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleConditionalExpression ) ) ) )
            {
            // InternalKerMLExpressions.g:139:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? ) | ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpression ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleConditionalExpression ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||(LA2_0>=RULE_STRING_VALUE && LA2_0<=RULE_UNRESTRICTED_NAME)||(LA2_0>=30 && LA2_0<=34)||(LA2_0>=40 && LA2_0<=42)||(LA2_0>=49 && LA2_0<=52)||(LA2_0>=55 && LA2_0<=56)||LA2_0==58||(LA2_0>=64 && LA2_0<=66)) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKerMLExpressions.g:140:3: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? )
                    {
                    // InternalKerMLExpressions.g:140:3: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? )
                    // InternalKerMLExpressions.g:141:4: this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_NullCoalescingExpression_0=ruleNullCoalescingExpression();

                    state._fsp--;


                    				current = this_NullCoalescingExpression_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLExpressions.g:149:4: ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==17) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalKerMLExpressions.g:150:5: () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) )
                            {
                            // InternalKerMLExpressions.g:150:5: ()
                            // InternalKerMLExpressions.g:151:6: 
                            {

                            						current = forceCreateModelElementAndAdd(
                            							grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperandAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalKerMLExpressions.g:157:5: ( (lv_operator_2_0= ruleConditionalOperator ) )
                            // InternalKerMLExpressions.g:158:6: (lv_operator_2_0= ruleConditionalOperator )
                            {
                            // InternalKerMLExpressions.g:158:6: (lv_operator_2_0= ruleConditionalOperator )
                            // InternalKerMLExpressions.g:159:7: lv_operator_2_0= ruleConditionalOperator
                            {

                            							newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalOperatorParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_4);
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

                            // InternalKerMLExpressions.g:176:5: ( (lv_operand_3_0= ruleOwnedExpression ) )
                            // InternalKerMLExpressions.g:177:6: (lv_operand_3_0= ruleOwnedExpression )
                            {
                            // InternalKerMLExpressions.g:177:6: (lv_operand_3_0= ruleOwnedExpression )
                            // InternalKerMLExpressions.g:178:7: lv_operand_3_0= ruleOwnedExpression
                            {

                            							newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_0_1_2_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_operand_3_0=ruleOwnedExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                            							}
                            							add(
                            								current,
                            								"operand",
                            								lv_operand_3_0,
                            								"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_4=(Token)match(input,14,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_0_1_3());
                            				
                            // InternalKerMLExpressions.g:199:5: ( (lv_operand_5_0= ruleConditionalExpression ) )
                            // InternalKerMLExpressions.g:200:6: (lv_operand_5_0= ruleConditionalExpression )
                            {
                            // InternalKerMLExpressions.g:200:6: (lv_operand_5_0= ruleConditionalExpression )
                            // InternalKerMLExpressions.g:201:7: lv_operand_5_0= ruleConditionalExpression
                            {

                            							newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_0_1_4_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_operand_5_0=ruleConditionalExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                            							}
                            							add(
                            								current,
                            								"operand",
                            								lv_operand_5_0,
                            								"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalExpression");
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
                    // InternalKerMLExpressions.g:221:3: ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpression ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleConditionalExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:221:3: ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpression ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleConditionalExpression ) ) )
                    // InternalKerMLExpressions.g:222:4: () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpression ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleConditionalExpression ) )
                    {
                    // InternalKerMLExpressions.g:222:4: ()
                    // InternalKerMLExpressions.g:223:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionalExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionalExpressionAccess().getIfKeyword_1_1());
                    			
                    // InternalKerMLExpressions.g:233:4: ( (lv_operand_8_0= ruleNullCoalescingExpression ) )
                    // InternalKerMLExpressions.g:234:5: (lv_operand_8_0= ruleNullCoalescingExpression )
                    {
                    // InternalKerMLExpressions.g:234:5: (lv_operand_8_0= ruleNullCoalescingExpression )
                    // InternalKerMLExpressions.g:235:6: lv_operand_8_0= ruleNullCoalescingExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandNullCoalescingExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_operand_8_0=ruleNullCoalescingExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_8_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.NullCoalescingExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:252:4: ( (lv_operator_9_0= ruleConditionalOperator ) )
                    // InternalKerMLExpressions.g:253:5: (lv_operator_9_0= ruleConditionalOperator )
                    {
                    // InternalKerMLExpressions.g:253:5: (lv_operator_9_0= ruleConditionalOperator )
                    // InternalKerMLExpressions.g:254:6: lv_operator_9_0= ruleConditionalOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalOperatorParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_operator_9_0=ruleConditionalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_9_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:271:4: ( (lv_operand_10_0= ruleOwnedExpression ) )
                    // InternalKerMLExpressions.g:272:5: (lv_operand_10_0= ruleOwnedExpression )
                    {
                    // InternalKerMLExpressions.g:272:5: (lv_operand_10_0= ruleOwnedExpression )
                    // InternalKerMLExpressions.g:273:6: lv_operand_10_0= ruleOwnedExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_operand_10_0=ruleOwnedExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_10_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getConditionalExpressionAccess().getElseKeyword_1_5());
                    			
                    // InternalKerMLExpressions.g:294:4: ( (lv_operand_12_0= ruleConditionalExpression ) )
                    // InternalKerMLExpressions.g:295:5: (lv_operand_12_0= ruleConditionalExpression )
                    {
                    // InternalKerMLExpressions.g:295:5: (lv_operand_12_0= ruleConditionalExpression )
                    // InternalKerMLExpressions.g:296:6: lv_operand_12_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_12_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_12_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalExpression");
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
    // InternalKerMLExpressions.g:318:1: entryRuleConditionalOperator returns [String current=null] : iv_ruleConditionalOperator= ruleConditionalOperator EOF ;
    public final String entryRuleConditionalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOperator = null;


        try {
            // InternalKerMLExpressions.g:318:59: (iv_ruleConditionalOperator= ruleConditionalOperator EOF )
            // InternalKerMLExpressions.g:319:2: iv_ruleConditionalOperator= ruleConditionalOperator EOF
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
    // InternalKerMLExpressions.g:325:1: ruleConditionalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken ruleConditionalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:331:2: (kw= '?' )
            // InternalKerMLExpressions.g:332:2: kw= '?'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalOperatorAccess().getQuestionMarkKeyword());
            	

            }


            	leaveRule();

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
    // InternalKerMLExpressions.g:340:1: entryRuleNullCoalescingExpression returns [EObject current=null] : iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF ;
    public final EObject entryRuleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCoalescingExpression = null;


        try {
            // InternalKerMLExpressions.g:340:65: (iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF )
            // InternalKerMLExpressions.g:341:2: iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF
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
    // InternalKerMLExpressions.g:347:1: ruleNullCoalescingExpression returns [EObject current=null] : (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )* ) ;
    public final EObject ruleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:353:2: ( (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )* ) )
            // InternalKerMLExpressions.g:354:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:354:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )* )
            // InternalKerMLExpressions.g:355:3: this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;


            			current = this_ImpliesExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:363:3: ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKerMLExpressions.g:364:4: () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:364:4: ()
            	    // InternalKerMLExpressions.g:365:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:371:4: ( (lv_operator_2_0= ruleNullCoalescingOperator ) )
            	    // InternalKerMLExpressions.g:372:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    {
            	    // InternalKerMLExpressions.g:372:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    // InternalKerMLExpressions.g:373:6: lv_operator_2_0= ruleNullCoalescingOperator
            	    {

            	    						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperatorNullCoalescingOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:390:4: ( (lv_operand_3_0= ruleImpliesExpression ) )
            	    // InternalKerMLExpressions.g:391:5: (lv_operand_3_0= ruleImpliesExpression )
            	    {
            	    // InternalKerMLExpressions.g:391:5: (lv_operand_3_0= ruleImpliesExpression )
            	    // InternalKerMLExpressions.g:392:6: lv_operand_3_0= ruleImpliesExpression
            	    {

            	    						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperandImpliesExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_operand_3_0=ruleImpliesExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNullCoalescingExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ImpliesExpression");
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
    // $ANTLR end "ruleNullCoalescingExpression"


    // $ANTLR start "entryRuleNullCoalescingOperator"
    // InternalKerMLExpressions.g:414:1: entryRuleNullCoalescingOperator returns [String current=null] : iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF ;
    public final String entryRuleNullCoalescingOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullCoalescingOperator = null;


        try {
            // InternalKerMLExpressions.g:414:62: (iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF )
            // InternalKerMLExpressions.g:415:2: iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF
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
    // InternalKerMLExpressions.g:421:1: ruleNullCoalescingOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '??' ;
    public final AntlrDatatypeRuleToken ruleNullCoalescingOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:427:2: (kw= '??' )
            // InternalKerMLExpressions.g:428:2: kw= '??'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalKerMLExpressions.g:436:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalKerMLExpressions.g:436:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalKerMLExpressions.g:437:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
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
    // InternalKerMLExpressions.g:443:1: ruleImpliesExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:449:2: ( (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* ) )
            // InternalKerMLExpressions.g:450:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:450:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* )
            // InternalKerMLExpressions.g:451:3: this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            			current = this_OrExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:459:3: ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKerMLExpressions.g:460:4: () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:460:4: ()
            	    // InternalKerMLExpressions.g:461:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getImpliesExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:467:4: ( (lv_operator_2_0= ruleImpliesOperator ) )
            	    // InternalKerMLExpressions.g:468:5: (lv_operator_2_0= ruleImpliesOperator )
            	    {
            	    // InternalKerMLExpressions.g:468:5: (lv_operator_2_0= ruleImpliesOperator )
            	    // InternalKerMLExpressions.g:469:6: lv_operator_2_0= ruleImpliesOperator
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:486:4: ( (lv_operand_3_0= ruleOrExpression ) )
            	    // InternalKerMLExpressions.g:487:5: (lv_operand_3_0= ruleOrExpression )
            	    {
            	    // InternalKerMLExpressions.g:487:5: (lv_operand_3_0= ruleOrExpression )
            	    // InternalKerMLExpressions.g:488:6: lv_operand_3_0= ruleOrExpression
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperandOrExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operand_3_0=ruleOrExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OrExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalKerMLExpressions.g:510:1: entryRuleImpliesOperator returns [String current=null] : iv_ruleImpliesOperator= ruleImpliesOperator EOF ;
    public final String entryRuleImpliesOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpliesOperator = null;


        try {
            // InternalKerMLExpressions.g:510:55: (iv_ruleImpliesOperator= ruleImpliesOperator EOF )
            // InternalKerMLExpressions.g:511:2: iv_ruleImpliesOperator= ruleImpliesOperator EOF
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
    // InternalKerMLExpressions.g:517:1: ruleImpliesOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'implies' ;
    public final AntlrDatatypeRuleToken ruleImpliesOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:523:2: (kw= 'implies' )
            // InternalKerMLExpressions.g:524:2: kw= 'implies'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOrExpression"
    // InternalKerMLExpressions.g:532:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalKerMLExpressions.g:532:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLExpressions.g:533:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalKerMLExpressions.g:539:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:545:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) )
            // InternalKerMLExpressions.g:546:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:546:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            // InternalKerMLExpressions.g:547:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:555:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=20 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKerMLExpressions.g:556:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:556:4: ()
            	    // InternalKerMLExpressions.g:557:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:563:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalKerMLExpressions.g:564:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalKerMLExpressions.g:564:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalKerMLExpressions.g:565:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:582:4: ( (lv_operand_3_0= ruleXorExpression ) )
            	    // InternalKerMLExpressions.g:583:5: (lv_operand_3_0= ruleXorExpression )
            	    {
            	    // InternalKerMLExpressions.g:583:5: (lv_operand_3_0= ruleXorExpression )
            	    // InternalKerMLExpressions.g:584:6: lv_operand_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalKerMLExpressions.g:606:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalKerMLExpressions.g:606:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalKerMLExpressions.g:607:2: iv_ruleOrOperator= ruleOrOperator EOF
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
    // InternalKerMLExpressions.g:613:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' | kw= '||' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:619:2: ( (kw= '|' | kw= '||' | kw= 'or' ) )
            // InternalKerMLExpressions.g:620:2: (kw= '|' | kw= '||' | kw= 'or' )
            {
            // InternalKerMLExpressions.g:620:2: (kw= '|' | kw= '||' | kw= 'or' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
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
                    // InternalKerMLExpressions.g:621:3: kw= '|'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:627:3: kw= '||'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:633:3: kw= 'or'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getOrKeyword_2());
                    		

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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleXorExpression"
    // InternalKerMLExpressions.g:642:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalKerMLExpressions.g:642:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLExpressions.g:643:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalKerMLExpressions.g:649:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:655:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:656:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:656:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            // InternalKerMLExpressions.g:657:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:665:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=23 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKerMLExpressions.g:666:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:666:4: ()
            	    // InternalKerMLExpressions.g:667:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:673:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalKerMLExpressions.g:674:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalKerMLExpressions.g:674:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalKerMLExpressions.g:675:6: lv_operator_2_0= ruleXorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:692:4: ( (lv_operand_3_0= ruleAndExpression ) )
            	    // InternalKerMLExpressions.g:693:5: (lv_operand_3_0= ruleAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:693:5: (lv_operand_3_0= ruleAndExpression )
            	    // InternalKerMLExpressions.g:694:6: lv_operand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
            	    break loop7;
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
    // InternalKerMLExpressions.g:716:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalKerMLExpressions.g:716:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalKerMLExpressions.g:717:2: iv_ruleXorOperator= ruleXorOperator EOF
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
    // InternalKerMLExpressions.g:723:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '^^' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:729:2: ( (kw= '^^' | kw= 'xor' ) )
            // InternalKerMLExpressions.g:730:2: (kw= '^^' | kw= 'xor' )
            {
            // InternalKerMLExpressions.g:730:2: (kw= '^^' | kw= 'xor' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKerMLExpressions.g:731:3: kw= '^^'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXorOperatorAccess().getCircumflexAccentCircumflexAccentKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:737:3: kw= 'xor'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXorOperatorAccess().getXorKeyword_1());
                    		

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
    // $ANTLR end "ruleXorOperator"


    // $ANTLR start "entryRuleAndExpression"
    // InternalKerMLExpressions.g:746:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalKerMLExpressions.g:746:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLExpressions.g:747:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalKerMLExpressions.g:753:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:759:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalKerMLExpressions.g:760:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:760:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            // InternalKerMLExpressions.g:761:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:769:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=25 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKerMLExpressions.g:770:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:770:4: ()
            	    // InternalKerMLExpressions.g:771:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:777:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalKerMLExpressions.g:778:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalKerMLExpressions.g:778:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalKerMLExpressions.g:779:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:796:4: ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    // InternalKerMLExpressions.g:797:5: (lv_operand_3_0= ruleEqualityExpression )
            	    {
            	    // InternalKerMLExpressions.g:797:5: (lv_operand_3_0= ruleEqualityExpression )
            	    // InternalKerMLExpressions.g:798:6: lv_operand_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperator"
    // InternalKerMLExpressions.g:820:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalKerMLExpressions.g:820:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalKerMLExpressions.g:821:2: iv_ruleAndOperator= ruleAndOperator EOF
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
    // InternalKerMLExpressions.g:827:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '&&' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:833:2: ( (kw= '&' | kw= '&&' | kw= 'and' ) )
            // InternalKerMLExpressions.g:834:2: (kw= '&' | kw= '&&' | kw= 'and' )
            {
            // InternalKerMLExpressions.g:834:2: (kw= '&' | kw= '&&' | kw= 'and' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalKerMLExpressions.g:835:3: kw= '&'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:841:3: kw= '&&'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:847:3: kw= 'and'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAndKeyword_2());
                    		

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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalKerMLExpressions.g:856:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLExpressions.g:856:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:857:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalKerMLExpressions.g:863:1: ruleEqualityExpression returns [EObject current=null] : (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:869:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:870:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:870:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            // InternalKerMLExpressions.g:871:3: this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_ClassificationExpression_0=ruleClassificationExpression();

            state._fsp--;


            			current = this_ClassificationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:879:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKerMLExpressions.g:880:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:880:4: ()
            	    // InternalKerMLExpressions.g:881:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:887:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalKerMLExpressions.g:888:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalKerMLExpressions.g:888:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalKerMLExpressions.g:889:6: lv_operator_2_0= ruleEqualityOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:906:4: ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    // InternalKerMLExpressions.g:907:5: (lv_operand_3_0= ruleClassificationExpression )
            	    {
            	    // InternalKerMLExpressions.g:907:5: (lv_operand_3_0= ruleClassificationExpression )
            	    // InternalKerMLExpressions.g:908:6: lv_operand_3_0= ruleClassificationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperandClassificationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop11;
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
    // InternalKerMLExpressions.g:930:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalKerMLExpressions.g:930:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:931:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalKerMLExpressions.g:937:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:943:2: ( (kw= '==' | kw= '!=' ) )
            // InternalKerMLExpressions.g:944:2: (kw= '==' | kw= '!=' )
            {
            // InternalKerMLExpressions.g:944:2: (kw= '==' | kw= '!=' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalKerMLExpressions.g:945:3: kw= '=='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:951:3: kw= '!='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

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
    // InternalKerMLExpressions.g:960:1: entryRuleClassificationExpression returns [EObject current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final EObject entryRuleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLExpressions.g:960:65: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:961:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
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
    // InternalKerMLExpressions.g:967:1: ruleClassificationExpression returns [EObject current=null] : ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) ) ;
    public final EObject ruleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;

        EObject lv_operand_5_0 = null;

        AntlrDatatypeRuleToken lv_operator_6_0 = null;

        EObject lv_ownedRelationship_7_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:973:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) ) )
            // InternalKerMLExpressions.g:974:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) )
            {
            // InternalKerMLExpressions.g:974:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING_VALUE && LA14_0<=RULE_UNRESTRICTED_NAME)||(LA14_0>=40 && LA14_0<=42)||(LA14_0>=49 && LA14_0<=52)||(LA14_0>=55 && LA14_0<=56)||LA14_0==58||(LA14_0>=64 && LA14_0<=66)) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||(LA14_0>=30 && LA14_0<=34)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKerMLExpressions.g:975:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? )
                    {
                    // InternalKerMLExpressions.g:975:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? )
                    // InternalKerMLExpressions.g:976:4: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_15);
                    this_RelationalExpression_0=ruleRelationalExpression();

                    state._fsp--;


                    				current = this_RelationalExpression_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLExpressions.g:984:4: ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=30 && LA13_0<=34)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalKerMLExpressions.g:985:5: () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            {
                            // InternalKerMLExpressions.g:985:5: ()
                            // InternalKerMLExpressions.g:986:6: 
                            {

                            						current = forceCreateModelElementAndAdd(
                            							grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalKerMLExpressions.g:992:5: ( (lv_operator_2_0= ruleClassificationOperator ) )
                            // InternalKerMLExpressions.g:993:6: (lv_operator_2_0= ruleClassificationOperator )
                            {
                            // InternalKerMLExpressions.g:993:6: (lv_operator_2_0= ruleClassificationOperator )
                            // InternalKerMLExpressions.g:994:7: lv_operator_2_0= ruleClassificationOperator
                            {

                            							newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_operator_2_0=ruleClassificationOperator();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                            							}
                            							set(
                            								current,
                            								"operator",
                            								lv_operator_2_0,
                            								"org.omg.kerml.expressions.xtext.KerMLExpressions.ClassificationOperator");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalKerMLExpressions.g:1011:5: ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            // InternalKerMLExpressions.g:1012:6: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            {
                            // InternalKerMLExpressions.g:1012:6: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            // InternalKerMLExpressions.g:1013:7: lv_ownedRelationship_3_0= ruleTypeReferenceMember
                            {

                            							newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_1_2_0());
                            						
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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1033:3: ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1033:3: ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1034:4: () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1034:4: ()
                    // InternalKerMLExpressions.g:1035:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1041:4: ( (lv_operand_5_0= ruleSelfReferenceExpression ) )
                    // InternalKerMLExpressions.g:1042:5: (lv_operand_5_0= ruleSelfReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:1042:5: (lv_operand_5_0= ruleSelfReferenceExpression )
                    // InternalKerMLExpressions.g:1043:6: lv_operand_5_0= ruleSelfReferenceExpression
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperandSelfReferenceExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_operand_5_0=ruleSelfReferenceExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_5_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.SelfReferenceExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1060:4: ( (lv_operator_6_0= ruleClassificationOperator ) )
                    // InternalKerMLExpressions.g:1061:5: (lv_operator_6_0= ruleClassificationOperator )
                    {
                    // InternalKerMLExpressions.g:1061:5: (lv_operator_6_0= ruleClassificationOperator )
                    // InternalKerMLExpressions.g:1062:6: lv_operator_6_0= ruleClassificationOperator
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_operator_6_0=ruleClassificationOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_6_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.ClassificationOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1079:4: ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1080:5: (lv_ownedRelationship_7_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1080:5: (lv_ownedRelationship_7_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1081:6: lv_ownedRelationship_7_0= ruleTypeReferenceMember
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_7_0=ruleTypeReferenceMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_7_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
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


    // $ANTLR start "entryRuleClassificationOperator"
    // InternalKerMLExpressions.g:1103:1: entryRuleClassificationOperator returns [String current=null] : iv_ruleClassificationOperator= ruleClassificationOperator EOF ;
    public final String entryRuleClassificationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationOperator = null;


        try {
            // InternalKerMLExpressions.g:1103:62: (iv_ruleClassificationOperator= ruleClassificationOperator EOF )
            // InternalKerMLExpressions.g:1104:2: iv_ruleClassificationOperator= ruleClassificationOperator EOF
            {
             newCompositeNode(grammarAccess.getClassificationOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassificationOperator=ruleClassificationOperator();

            state._fsp--;

             current =iv_ruleClassificationOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassificationOperator"


    // $ANTLR start "ruleClassificationOperator"
    // InternalKerMLExpressions.g:1110:1: ruleClassificationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleClassificationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1116:2: ( (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' ) )
            // InternalKerMLExpressions.g:1117:2: (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' )
            {
            // InternalKerMLExpressions.g:1117:2: (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            case 33:
                {
                alt15=4;
                }
                break;
            case 34:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalKerMLExpressions.g:1118:3: kw= 'instanceof'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getInstanceofKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1124:3: kw= 'hastype'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1130:3: kw= 'istype'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1136:3: kw= '@'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:1142:3: kw= 'as'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getAsKeyword_4());
                    		

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
    // $ANTLR end "ruleClassificationOperator"


    // $ANTLR start "entryRuleTypeReferenceMember"
    // InternalKerMLExpressions.g:1151:1: entryRuleTypeReferenceMember returns [EObject current=null] : iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF ;
    public final EObject entryRuleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1151:60: (iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:1152:2: iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF
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
    // InternalKerMLExpressions.g:1158:1: ruleTypeReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) ;
    public final EObject ruleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1164:2: ( ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) )
            // InternalKerMLExpressions.g:1165:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            {
            // InternalKerMLExpressions.g:1165:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            // InternalKerMLExpressions.g:1166:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            {
            // InternalKerMLExpressions.g:1166:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            // InternalKerMLExpressions.g:1167:4: lv_ownedRelatedElement_0_0= ruleTypeReference
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


    // $ANTLR start "entryRuleTypeReference"
    // InternalKerMLExpressions.g:1187:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalKerMLExpressions.g:1187:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalKerMLExpressions.g:1188:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalKerMLExpressions.g:1194:1: ruleTypeReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1200:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) )
            // InternalKerMLExpressions.g:1201:2: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            {
            // InternalKerMLExpressions.g:1201:2: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:1202:3: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:1202:3: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:1203:4: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
            {

            				newCompositeNode(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleOwnedFeatureTyping();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureTyping");
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


    // $ANTLR start "entryRuleOwnedFeatureTyping"
    // InternalKerMLExpressions.g:1223:1: entryRuleOwnedFeatureTyping returns [EObject current=null] : iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF ;
    public final EObject entryRuleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureTyping = null;


        try {
            // InternalKerMLExpressions.g:1223:59: (iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:1224:2: iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF
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
    // InternalKerMLExpressions.g:1230:1: ruleOwnedFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1236:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:1237:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:1237:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:1238:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:1238:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:1239:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOwnedFeatureTypingRule());
            				}
            			

            				newCompositeNode(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeCrossReference_0());
            			
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
    // $ANTLR end "ruleOwnedFeatureTyping"


    // $ANTLR start "entryRuleSelfReferenceExpression"
    // InternalKerMLExpressions.g:1256:1: entryRuleSelfReferenceExpression returns [EObject current=null] : iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF ;
    public final EObject entryRuleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:1256:64: (iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:1257:2: iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF
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
    // InternalKerMLExpressions.g:1263:1: ruleSelfReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) ;
    public final EObject ruleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1269:2: ( ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) )
            // InternalKerMLExpressions.g:1270:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            {
            // InternalKerMLExpressions.g:1270:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:1271:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:1271:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:1272:4: lv_ownedRelationship_0_0= ruleSelfReferenceMember
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
    // InternalKerMLExpressions.g:1292:1: entryRuleSelfReferenceMember returns [EObject current=null] : iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF ;
    public final EObject entryRuleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1292:60: (iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:1293:2: iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF
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
    // InternalKerMLExpressions.g:1299:1: ruleSelfReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) ;
    public final EObject ruleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1305:2: ( ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) )
            // InternalKerMLExpressions.g:1306:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            {
            // InternalKerMLExpressions.g:1306:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:1307:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:1307:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            // InternalKerMLExpressions.g:1308:4: lv_ownedRelatedElement_0_0= ruleEmptyFeature
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
    // InternalKerMLExpressions.g:1328:1: entryRuleEmptyFeature returns [EObject current=null] : iv_ruleEmptyFeature= ruleEmptyFeature EOF ;
    public final EObject entryRuleEmptyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFeature = null;


        try {
            // InternalKerMLExpressions.g:1328:53: (iv_ruleEmptyFeature= ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:1329:2: iv_ruleEmptyFeature= ruleEmptyFeature EOF
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
    // InternalKerMLExpressions.g:1335:1: ruleEmptyFeature returns [EObject current=null] : () ;
    public final EObject ruleEmptyFeature() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1341:2: ( () )
            // InternalKerMLExpressions.g:1342:2: ()
            {
            // InternalKerMLExpressions.g:1342:2: ()
            // InternalKerMLExpressions.g:1343:3: 
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
    // InternalKerMLExpressions.g:1352:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLExpressions.g:1352:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:1353:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalKerMLExpressions.g:1359:1: ruleRelationalExpression returns [EObject current=null] : (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RangeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1365:2: ( (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1366:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1366:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            // InternalKerMLExpressions.g:1367:3: this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_RangeExpression_0=ruleRangeExpression();

            state._fsp--;


            			current = this_RangeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1375:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=35 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1376:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1376:4: ()
            	    // InternalKerMLExpressions.g:1377:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1383:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalKerMLExpressions.g:1384:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalKerMLExpressions.g:1384:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalKerMLExpressions.g:1385:6: lv_operator_2_0= ruleRelationalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:1402:4: ( (lv_operand_3_0= ruleRangeExpression ) )
            	    // InternalKerMLExpressions.g:1403:5: (lv_operand_3_0= ruleRangeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1403:5: (lv_operand_3_0= ruleRangeExpression )
            	    // InternalKerMLExpressions.g:1404:6: lv_operand_3_0= ruleRangeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperandRangeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop16;
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
    // InternalKerMLExpressions.g:1426:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalKerMLExpressions.g:1426:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:1427:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
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
    // InternalKerMLExpressions.g:1433:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1439:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalKerMLExpressions.g:1440:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalKerMLExpressions.g:1440:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 36:
                {
                alt17=2;
                }
                break;
            case 37:
                {
                alt17=3;
                }
                break;
            case 38:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalKerMLExpressions.g:1441:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1447:3: kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1453:3: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1459:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1468:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalKerMLExpressions.g:1468:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalKerMLExpressions.g:1469:2: iv_ruleRangeExpression= ruleRangeExpression EOF
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
    // InternalKerMLExpressions.g:1475:1: ruleRangeExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1481:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalKerMLExpressions.g:1482:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalKerMLExpressions.g:1482:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            // InternalKerMLExpressions.g:1483:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1491:3: ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKerMLExpressions.g:1492:4: () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalKerMLExpressions.g:1492:4: ()
                    // InternalKerMLExpressions.g:1493:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRangeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1499:4: ( (lv_operator_2_0= '..' ) )
                    // InternalKerMLExpressions.g:1500:5: (lv_operator_2_0= '..' )
                    {
                    // InternalKerMLExpressions.g:1500:5: (lv_operator_2_0= '..' )
                    // InternalKerMLExpressions.g:1501:6: lv_operator_2_0= '..'
                    {
                    lv_operator_2_0=(Token)match(input,39,FOLLOW_6); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangeExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "..");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1513:4: ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    // InternalKerMLExpressions.g:1514:5: (lv_operand_3_0= ruleAdditiveExpression )
                    {
                    // InternalKerMLExpressions.g:1514:5: (lv_operand_3_0= ruleAdditiveExpression )
                    // InternalKerMLExpressions.g:1515:6: lv_operand_3_0= ruleAdditiveExpression
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
    // InternalKerMLExpressions.g:1537:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLExpressions.g:1537:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:1538:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalKerMLExpressions.g:1544:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1550:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1551:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1551:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalKerMLExpressions.g:1552:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1560:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=40 && LA19_0<=41)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1561:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1561:4: ()
            	    // InternalKerMLExpressions.g:1562:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1568:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalKerMLExpressions.g:1569:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalKerMLExpressions.g:1569:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalKerMLExpressions.g:1570:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:1587:4: ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    // InternalKerMLExpressions.g:1588:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1588:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    // InternalKerMLExpressions.g:1589:6: lv_operand_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveOperator"
    // InternalKerMLExpressions.g:1611:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalKerMLExpressions.g:1611:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:1612:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
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
    // InternalKerMLExpressions.g:1618:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1624:2: ( (kw= '+' | kw= '-' ) )
            // InternalKerMLExpressions.g:1625:2: (kw= '+' | kw= '-' )
            {
            // InternalKerMLExpressions.g:1625:2: (kw= '+' | kw= '-' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalKerMLExpressions.g:1626:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1632:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1641:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLExpressions.g:1641:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:1642:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalKerMLExpressions.g:1648:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1654:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1655:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1655:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            // InternalKerMLExpressions.g:1656:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;


            			current = this_ExponentiationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1664:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=42 && LA21_0<=44)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1665:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1665:4: ()
            	    // InternalKerMLExpressions.g:1666:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1672:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalKerMLExpressions.g:1673:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalKerMLExpressions.g:1673:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalKerMLExpressions.g:1674:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:1691:4: ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    // InternalKerMLExpressions.g:1692:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    {
            	    // InternalKerMLExpressions.g:1692:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    // InternalKerMLExpressions.g:1693:6: lv_operand_3_0= ruleExponentiationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperandExponentiationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalKerMLExpressions.g:1715:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalKerMLExpressions.g:1715:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:1716:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
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
    // InternalKerMLExpressions.g:1722:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1728:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalKerMLExpressions.g:1729:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalKerMLExpressions.g:1729:2: (kw= '*' | kw= '/' | kw= '%' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalKerMLExpressions.g:1730:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1736:3: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1742:3: kw= '%'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1751:1: entryRuleExponentiationExpression returns [EObject current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final EObject entryRuleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLExpressions.g:1751:65: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:1752:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
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
    // InternalKerMLExpressions.g:1758:1: ruleExponentiationExpression returns [EObject current=null] : (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* ) ;
    public final EObject ruleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnitsExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1764:2: ( (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1765:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1765:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* )
            // InternalKerMLExpressions.g:1766:3: this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnitsExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_UnitsExpression_0=ruleUnitsExpression();

            state._fsp--;


            			current = this_UnitsExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1774:3: ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=45 && LA23_0<=46)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1775:4: () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1775:4: ()
            	    // InternalKerMLExpressions.g:1776:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1782:4: ( (lv_operator_2_0= ruleExponentiationOperator ) )
            	    // InternalKerMLExpressions.g:1783:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    {
            	    // InternalKerMLExpressions.g:1783:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    // InternalKerMLExpressions.g:1784:6: lv_operator_2_0= ruleExponentiationOperator
            	    {

            	    						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperatorExponentiationOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalKerMLExpressions.g:1801:4: ( (lv_operand_3_0= ruleUnitsExpression ) )
            	    // InternalKerMLExpressions.g:1802:5: (lv_operand_3_0= ruleUnitsExpression )
            	    {
            	    // InternalKerMLExpressions.g:1802:5: (lv_operand_3_0= ruleUnitsExpression )
            	    // InternalKerMLExpressions.g:1803:6: lv_operand_3_0= ruleUnitsExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperandUnitsExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_operand_3_0=ruleUnitsExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExponentiationExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.UnitsExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKerMLExpressions.g:1825:1: entryRuleExponentiationOperator returns [String current=null] : iv_ruleExponentiationOperator= ruleExponentiationOperator EOF ;
    public final String entryRuleExponentiationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationOperator = null;


        try {
            // InternalKerMLExpressions.g:1825:62: (iv_ruleExponentiationOperator= ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:1826:2: iv_ruleExponentiationOperator= ruleExponentiationOperator EOF
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
    // InternalKerMLExpressions.g:1832:1: ruleExponentiationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '**' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleExponentiationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1838:2: ( (kw= '**' | kw= '^' ) )
            // InternalKerMLExpressions.g:1839:2: (kw= '**' | kw= '^' )
            {
            // InternalKerMLExpressions.g:1839:2: (kw= '**' | kw= '^' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            else if ( (LA24_0==46) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalKerMLExpressions.g:1840:3: kw= '**'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1846:3: kw= '^'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUnitsExpression"
    // InternalKerMLExpressions.g:1855:1: entryRuleUnitsExpression returns [EObject current=null] : iv_ruleUnitsExpression= ruleUnitsExpression EOF ;
    public final EObject entryRuleUnitsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsExpression = null;


        try {
            // InternalKerMLExpressions.g:1855:56: (iv_ruleUnitsExpression= ruleUnitsExpression EOF )
            // InternalKerMLExpressions.g:1856:2: iv_ruleUnitsExpression= ruleUnitsExpression EOF
            {
             newCompositeNode(grammarAccess.getUnitsExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitsExpression=ruleUnitsExpression();

            state._fsp--;

             current =iv_ruleUnitsExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitsExpression"


    // $ANTLR start "ruleUnitsExpression"
    // InternalKerMLExpressions.g:1862:1: ruleUnitsExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleUnitsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1868:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? ) )
            // InternalKerMLExpressions.g:1869:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? )
            {
            // InternalKerMLExpressions.g:1869:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? )
            // InternalKerMLExpressions.g:1870:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )?
            {

            			newCompositeNode(grammarAccess.getUnitsExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1878:3: ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKerMLExpressions.g:1879:4: () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']'
                    {
                    // InternalKerMLExpressions.g:1879:4: ()
                    // InternalKerMLExpressions.g:1880:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1886:4: ( (lv_operator_2_0= '@[' ) )
                    // InternalKerMLExpressions.g:1887:5: (lv_operator_2_0= '@[' )
                    {
                    // InternalKerMLExpressions.g:1887:5: (lv_operator_2_0= '@[' )
                    // InternalKerMLExpressions.g:1888:6: lv_operator_2_0= '@['
                    {
                    lv_operator_2_0=(Token)match(input,47,FOLLOW_4); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtLeftSquareBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitsExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "@[");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1900:4: ( (lv_operand_3_0= ruleOwnedExpression ) )
                    // InternalKerMLExpressions.g:1901:5: (lv_operand_3_0= ruleOwnedExpression )
                    {
                    // InternalKerMLExpressions.g:1901:5: (lv_operand_3_0= ruleOwnedExpression )
                    // InternalKerMLExpressions.g:1902:6: lv_operand_3_0= ruleOwnedExpression
                    {

                    						newCompositeNode(grammarAccess.getUnitsExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_operand_3_0=ruleOwnedExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitsExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnitsExpressionAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleUnitsExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalKerMLExpressions.g:1928:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLExpressions.g:1928:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:1929:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalKerMLExpressions.g:1935:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_ExtentExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1941:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) )
            // InternalKerMLExpressions.g:1942:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:1942:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=40 && LA26_0<=41)||(LA26_0>=49 && LA26_0<=51)) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING_VALUE && LA26_0<=RULE_UNRESTRICTED_NAME)||LA26_0==42||LA26_0==52||(LA26_0>=55 && LA26_0<=56)||LA26_0==58||(LA26_0>=64 && LA26_0<=66)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalKerMLExpressions.g:1943:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:1943:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    // InternalKerMLExpressions.g:1944:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) )
                    {
                    // InternalKerMLExpressions.g:1944:4: ()
                    // InternalKerMLExpressions.g:1945:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1951:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalKerMLExpressions.g:1952:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalKerMLExpressions.g:1952:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalKerMLExpressions.g:1953:6: lv_operator_1_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalKerMLExpressions.g:1970:4: ( (lv_operand_2_0= ruleExtentExpression ) )
                    // InternalKerMLExpressions.g:1971:5: (lv_operand_2_0= ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:1971:5: (lv_operand_2_0= ruleExtentExpression )
                    // InternalKerMLExpressions.g:1972:6: lv_operand_2_0= ruleExtentExpression
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
                    // InternalKerMLExpressions.g:1991:3: this_ExtentExpression_3= ruleExtentExpression
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
    // InternalKerMLExpressions.g:2003:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalKerMLExpressions.g:2003:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:2004:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalKerMLExpressions.g:2010:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2016:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' ) )
            // InternalKerMLExpressions.g:2017:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' )
            {
            // InternalKerMLExpressions.g:2017:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt27=1;
                }
                break;
            case 41:
                {
                alt27=2;
                }
                break;
            case 49:
                {
                alt27=3;
                }
                break;
            case 50:
                {
                alt27=4;
                }
                break;
            case 51:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalKerMLExpressions.g:2018:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2024:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2030:3: kw= '!'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2036:3: kw= '~'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:2042:3: kw= 'not'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getNotKeyword_4());
                    		

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
    // InternalKerMLExpressions.g:2051:1: entryRuleExtentExpression returns [EObject current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final EObject entryRuleExtentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression = null;


        try {
            // InternalKerMLExpressions.g:2051:57: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:2052:2: iv_ruleExtentExpression= ruleExtentExpression EOF
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
    // InternalKerMLExpressions.g:2058:1: ruleExtentExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleExtentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2064:2: ( ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalKerMLExpressions.g:2065:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalKerMLExpressions.g:2065:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING_VALUE && LA28_0<=RULE_UNRESTRICTED_NAME)||LA28_0==42||(LA28_0>=55 && LA28_0<=56)||LA28_0==58||(LA28_0>=64 && LA28_0<=66)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalKerMLExpressions.g:2066:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:2066:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:2067:4: () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:2067:4: ()
                    // InternalKerMLExpressions.g:2068:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:2074:4: ( (lv_operator_1_0= 'all' ) )
                    // InternalKerMLExpressions.g:2075:5: (lv_operator_1_0= 'all' )
                    {
                    // InternalKerMLExpressions.g:2075:5: (lv_operator_1_0= 'all' )
                    // InternalKerMLExpressions.g:2076:6: lv_operator_1_0= 'all'
                    {
                    lv_operator_1_0=(Token)match(input,52,FOLLOW_16); 

                    						newLeafNode(lv_operator_1_0, grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtentExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_0, "all");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:2088:4: ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:2089:5: (lv_ownedRelationship_2_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:2089:5: (lv_ownedRelationship_2_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:2090:6: lv_ownedRelationship_2_0= ruleTypeReferenceMember
                    {

                    						newCompositeNode(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_2_0=ruleTypeReferenceMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtentExpressionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_2_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2109:3: this_PrimaryExpression_3= rulePrimaryExpression
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
    // InternalKerMLExpressions.g:2121:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKerMLExpressions.g:2121:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKerMLExpressions.g:2122:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKerMLExpressions.g:2128:1: rulePrimaryExpression returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        EObject this_BaseExpression_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_ownedRelationship_7_0 = null;

        EObject lv_ownedRelationship_8_0 = null;

        EObject lv_ownedRelationship_9_0 = null;

        EObject this_ArgumentList_10 = null;

        EObject lv_operand_13_0 = null;

        EObject lv_ownedRelationship_16_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2134:2: ( (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* ) )
            // InternalKerMLExpressions.g:2135:2: (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* )
            {
            // InternalKerMLExpressions.g:2135:2: (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* )
            // InternalKerMLExpressions.g:2136:3: this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;


            			current = this_BaseExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2144:3: ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )*
            loop30:
            do {
                int alt30=5;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    alt30=1;
                    }
                    break;
                case 54:
                    {
                    alt30=2;
                    }
                    break;
                case 55:
                    {
                    int LA30_4 = input.LA(2);

                    if ( ((LA30_4>=RULE_ID && LA30_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt30=3;
                    }
                    else if ( (LA30_4==58) ) {
                        alt30=4;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2145:4: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' )
            	    {
            	    // InternalKerMLExpressions.g:2145:4: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' )
            	    // InternalKerMLExpressions.g:2146:5: () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalKerMLExpressions.g:2146:5: ()
            	    // InternalKerMLExpressions.g:2147:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalKerMLExpressions.g:2153:5: ( (lv_operator_2_0= '[' ) )
            	    // InternalKerMLExpressions.g:2154:6: (lv_operator_2_0= '[' )
            	    {
            	    // InternalKerMLExpressions.g:2154:6: (lv_operator_2_0= '[' )
            	    // InternalKerMLExpressions.g:2155:7: lv_operator_2_0= '['
            	    {
            	    lv_operator_2_0=(Token)match(input,53,FOLLOW_4); 

            	    							newLeafNode(lv_operator_2_0, grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	    							}
            	    							setWithLastConsumed(current, "operator", lv_operator_2_0, "[");
            	    						

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2167:5: ( (lv_operand_3_0= ruleSequenceExpression ) )
            	    // InternalKerMLExpressions.g:2168:6: (lv_operand_3_0= ruleSequenceExpression )
            	    {
            	    // InternalKerMLExpressions.g:2168:6: (lv_operand_3_0= ruleSequenceExpression )
            	    // InternalKerMLExpressions.g:2169:7: lv_operand_3_0= ruleSequenceExpression
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandSequenceExpressionParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_operand_3_0=ruleSequenceExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"operand",
            	    								lv_operand_3_0,
            	    								"org.omg.kerml.expressions.xtext.KerMLExpressions.SequenceExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_4=(Token)match(input,48,FOLLOW_25); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKerMLExpressions.g:2192:4: ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) )
            	    {
            	    // InternalKerMLExpressions.g:2192:4: ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) )
            	    // InternalKerMLExpressions.g:2193:5: () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] )
            	    {
            	    // InternalKerMLExpressions.g:2193:5: ()
            	    // InternalKerMLExpressions.g:2194:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_6=(Token)match(input,54,FOLLOW_16); 

            	    					newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
            	    				
            	    // InternalKerMLExpressions.g:2204:5: ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) )
            	    // InternalKerMLExpressions.g:2205:6: (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping )
            	    {
            	    // InternalKerMLExpressions.g:2205:6: (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping )
            	    // InternalKerMLExpressions.g:2206:7: lv_ownedRelationship_7_0= ruleOwnedFeatureTyping
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_ownedRelationship_7_0=ruleOwnedFeatureTyping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedRelationship",
            	    								lv_ownedRelationship_7_0,
            	    								"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureTyping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2223:5: ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 58:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case RULE_ID:
            	    case RULE_UNRESTRICTED_NAME:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // InternalKerMLExpressions.g:2224:6: ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) )
            	            {
            	            // InternalKerMLExpressions.g:2224:6: ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) )
            	            // InternalKerMLExpressions.g:2225:7: (lv_ownedRelationship_8_0= ruleExpressionBodyMember )
            	            {
            	            // InternalKerMLExpressions.g:2225:7: (lv_ownedRelationship_8_0= ruleExpressionBodyMember )
            	            // InternalKerMLExpressions.g:2226:8: lv_ownedRelationship_8_0= ruleExpressionBodyMember
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_1_1_3_0_0());
            	            							
            	            pushFollow(FOLLOW_25);
            	            lv_ownedRelationship_8_0=ruleExpressionBodyMember();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"ownedRelationship",
            	            									lv_ownedRelationship_8_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.ExpressionBodyMember");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLExpressions.g:2244:6: ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) )
            	            {
            	            // InternalKerMLExpressions.g:2244:6: ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) )
            	            // InternalKerMLExpressions.g:2245:7: (lv_ownedRelationship_9_0= ruleFunctionReferenceMember )
            	            {
            	            // InternalKerMLExpressions.g:2245:7: (lv_ownedRelationship_9_0= ruleFunctionReferenceMember )
            	            // InternalKerMLExpressions.g:2246:8: lv_ownedRelationship_9_0= ruleFunctionReferenceMember
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFunctionReferenceMemberParserRuleCall_1_1_3_1_0());
            	            							
            	            pushFollow(FOLLOW_25);
            	            lv_ownedRelationship_9_0=ruleFunctionReferenceMember();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"ownedRelationship",
            	            									lv_ownedRelationship_9_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.FunctionReferenceMember");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLExpressions.g:2264:6: this_ArgumentList_10= ruleArgumentList[$current]
            	            {

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	            						}
            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_1_1_3_2());
            	            					
            	            pushFollow(FOLLOW_25);
            	            this_ArgumentList_10=ruleArgumentList(current);

            	            state._fsp--;


            	            						current = this_ArgumentList_10;
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKerMLExpressions.g:2278:4: ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) )
            	    {
            	    // InternalKerMLExpressions.g:2278:4: ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) )
            	    // InternalKerMLExpressions.g:2279:5: () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2279:5: ()
            	    // InternalKerMLExpressions.g:2280:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getPathStepExpressionOperandAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_12=(Token)match(input,55,FOLLOW_16); 

            	    					newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_2_1());
            	    				
            	    // InternalKerMLExpressions.g:2290:5: ( (lv_operand_13_0= ruleFeatureReferenceExpression ) )
            	    // InternalKerMLExpressions.g:2291:6: (lv_operand_13_0= ruleFeatureReferenceExpression )
            	    {
            	    // InternalKerMLExpressions.g:2291:6: (lv_operand_13_0= ruleFeatureReferenceExpression )
            	    // InternalKerMLExpressions.g:2292:7: lv_operand_13_0= ruleFeatureReferenceExpression
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandFeatureReferenceExpressionParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_operand_13_0=ruleFeatureReferenceExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"operand",
            	    								lv_operand_13_0,
            	    								"org.omg.kerml.expressions.xtext.KerMLExpressions.FeatureReferenceExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalKerMLExpressions.g:2311:4: ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) )
            	    {
            	    // InternalKerMLExpressions.g:2311:4: ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) )
            	    // InternalKerMLExpressions.g:2312:5: () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) )
            	    {
            	    // InternalKerMLExpressions.g:2312:5: ()
            	    // InternalKerMLExpressions.g:2313:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getPathSelectExpressionOperandAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_15=(Token)match(input,55,FOLLOW_27); 

            	    					newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_3_1());
            	    				
            	    // InternalKerMLExpressions.g:2323:5: ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) )
            	    // InternalKerMLExpressions.g:2324:6: (lv_ownedRelationship_16_0= ruleExpressionBodyMember )
            	    {
            	    // InternalKerMLExpressions.g:2324:6: (lv_ownedRelationship_16_0= ruleExpressionBodyMember )
            	    // InternalKerMLExpressions.g:2325:7: lv_ownedRelationship_16_0= ruleExpressionBodyMember
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_ownedRelationship_16_0=ruleExpressionBodyMember();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedRelationship",
            	    								lv_ownedRelationship_16_0,
            	    								"org.omg.kerml.expressions.xtext.KerMLExpressions.ExpressionBodyMember");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


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


    // $ANTLR start "entryRuleExpressionBodyMember"
    // InternalKerMLExpressions.g:2348:1: entryRuleExpressionBodyMember returns [EObject current=null] : iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF ;
    public final EObject entryRuleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBodyMember = null;


        try {
            // InternalKerMLExpressions.g:2348:61: (iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF )
            // InternalKerMLExpressions.g:2349:2: iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF
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
    // InternalKerMLExpressions.g:2355:1: ruleExpressionBodyMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) ;
    public final EObject ruleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2361:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) )
            // InternalKerMLExpressions.g:2362:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            {
            // InternalKerMLExpressions.g:2362:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            // InternalKerMLExpressions.g:2363:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            {
            // InternalKerMLExpressions.g:2363:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            // InternalKerMLExpressions.g:2364:4: lv_ownedRelatedElement_0_0= ruleExpressionBody
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


    // $ANTLR start "entryRuleFunctionReferenceMember"
    // InternalKerMLExpressions.g:2384:1: entryRuleFunctionReferenceMember returns [EObject current=null] : iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF ;
    public final EObject entryRuleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2384:64: (iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF )
            // InternalKerMLExpressions.g:2385:2: iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF
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
    // InternalKerMLExpressions.g:2391:1: ruleFunctionReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) ;
    public final EObject ruleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2397:2: ( ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) )
            // InternalKerMLExpressions.g:2398:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            {
            // InternalKerMLExpressions.g:2398:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            // InternalKerMLExpressions.g:2399:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            {
            // InternalKerMLExpressions.g:2399:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            // InternalKerMLExpressions.g:2400:4: lv_ownedRelatedElement_0_0= ruleFunctionReference
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
    // InternalKerMLExpressions.g:2420:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // InternalKerMLExpressions.g:2420:58: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // InternalKerMLExpressions.g:2421:2: iv_ruleFunctionReference= ruleFunctionReference EOF
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
    // InternalKerMLExpressions.g:2427:1: ruleFunctionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2433:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) )
            // InternalKerMLExpressions.g:2434:2: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            {
            // InternalKerMLExpressions.g:2434:2: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:2435:3: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:2435:3: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:2436:4: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
            {

            				newCompositeNode(grammarAccess.getFunctionReferenceAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleOwnedFeatureTyping();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctionReferenceRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureTyping");
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


    // $ANTLR start "entryRuleBaseExpression"
    // InternalKerMLExpressions.g:2456:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalKerMLExpressions.g:2456:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:2457:2: iv_ruleBaseExpression= ruleBaseExpression EOF
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
    // InternalKerMLExpressions.g:2463:1: ruleBaseExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_NullExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_FeatureReferenceExpression_2 = null;

        EObject this_InvocationExpression_3 = null;

        EObject this_ExpressionBody_4 = null;

        EObject this_SequenceExpression_6 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2469:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) ) )
            // InternalKerMLExpressions.g:2470:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )
            {
            // InternalKerMLExpressions.g:2470:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )
            int alt31=6;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalKerMLExpressions.g:2471:3: this_NullExpression_0= ruleNullExpression
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
                    // InternalKerMLExpressions.g:2480:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalKerMLExpressions.g:2489:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
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
                    // InternalKerMLExpressions.g:2498:3: this_InvocationExpression_3= ruleInvocationExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvocationExpression_3=ruleInvocationExpression();

                    state._fsp--;


                    			current = this_InvocationExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:2507:3: this_ExpressionBody_4= ruleExpressionBody
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getExpressionBodyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionBody_4=ruleExpressionBody();

                    state._fsp--;


                    			current = this_ExpressionBody_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKerMLExpressions.g:2516:3: (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' )
                    {
                    // InternalKerMLExpressions.g:2516:3: (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' )
                    // InternalKerMLExpressions.g:2517:4: otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_SequenceExpression_6=ruleSequenceExpression();

                    state._fsp--;


                    				current = this_SequenceExpression_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,57,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_5_2());
                    			

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


    // $ANTLR start "entryRuleExpressionBody"
    // InternalKerMLExpressions.g:2538:1: entryRuleExpressionBody returns [EObject current=null] : iv_ruleExpressionBody= ruleExpressionBody EOF ;
    public final EObject entryRuleExpressionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBody = null;


        try {
            // InternalKerMLExpressions.g:2538:55: (iv_ruleExpressionBody= ruleExpressionBody EOF )
            // InternalKerMLExpressions.g:2539:2: iv_ruleExpressionBody= ruleExpressionBody EOF
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
    // InternalKerMLExpressions.g:2545:1: ruleExpressionBody returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) ;
    public final EObject ruleExpressionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2551:2: ( (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) )
            // InternalKerMLExpressions.g:2552:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            {
            // InternalKerMLExpressions.g:2552:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            // InternalKerMLExpressions.g:2553:3: otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalKerMLExpressions.g:2557:3: ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==61) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2558:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';'
            	    {
            	    // InternalKerMLExpressions.g:2558:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) )
            	    // InternalKerMLExpressions.g:2559:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    {
            	    // InternalKerMLExpressions.g:2559:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    // InternalKerMLExpressions.g:2560:6: lv_ownedRelationship_1_0= ruleBodyParameterMember
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
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

            	    otherlv_2=(Token)match(input,59,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionBodyAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalKerMLExpressions.g:2582:3: ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) )
            // InternalKerMLExpressions.g:2583:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            {
            // InternalKerMLExpressions.g:2583:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            // InternalKerMLExpressions.g:2584:5: lv_ownedRelationship_3_0= ruleResultExpressionMember
            {

            					newCompositeNode(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipResultExpressionMemberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,60,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2609:1: entryRuleResultExpressionMember returns [EObject current=null] : iv_ruleResultExpressionMember= ruleResultExpressionMember EOF ;
    public final EObject entryRuleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:2609:63: (iv_ruleResultExpressionMember= ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:2610:2: iv_ruleResultExpressionMember= ruleResultExpressionMember EOF
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
    // InternalKerMLExpressions.g:2616:1: ruleResultExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2622:2: ( ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:2623:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:2623:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:2624:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:2624:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:2625:4: lv_ownedRelatedElement_0_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:2645:1: entryRuleBodyParameterMember returns [EObject current=null] : iv_ruleBodyParameterMember= ruleBodyParameterMember EOF ;
    public final EObject entryRuleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameterMember = null;


        try {
            // InternalKerMLExpressions.g:2645:60: (iv_ruleBodyParameterMember= ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:2646:2: iv_ruleBodyParameterMember= ruleBodyParameterMember EOF
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
    // InternalKerMLExpressions.g:2652:1: ruleBodyParameterMember returns [EObject current=null] : (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) ) ;
    public final EObject ruleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_memberName_1_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2658:2: ( (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) ) )
            // InternalKerMLExpressions.g:2659:2: (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) )
            {
            // InternalKerMLExpressions.g:2659:2: (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) )
            // InternalKerMLExpressions.g:2660:3: otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBodyParameterMemberAccess().getInKeyword_0());
            		
            // InternalKerMLExpressions.g:2664:3: ( (lv_memberName_1_0= ruleName ) )
            // InternalKerMLExpressions.g:2665:4: (lv_memberName_1_0= ruleName )
            {
            // InternalKerMLExpressions.g:2665:4: (lv_memberName_1_0= ruleName )
            // InternalKerMLExpressions.g:2666:5: lv_memberName_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getBodyParameterMemberAccess().getMemberNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_1);
            lv_memberName_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBodyParameterMemberRule());
            					}
            					set(
            						current,
            						"memberName",
            						lv_memberName_1_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLExpressions.g:2683:3: ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) )
            // InternalKerMLExpressions.g:2684:4: (lv_ownedRelatedElement_2_0= ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:2684:4: (lv_ownedRelatedElement_2_0= ruleBodyParameter )
            // InternalKerMLExpressions.g:2685:5: lv_ownedRelatedElement_2_0= ruleBodyParameter
            {

            					newCompositeNode(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementBodyParameterParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_2_0=ruleBodyParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBodyParameterMemberRule());
            					}
            					add(
            						current,
            						"ownedRelatedElement",
            						lv_ownedRelatedElement_2_0,
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
    // InternalKerMLExpressions.g:2706:1: entryRuleBodyParameter returns [EObject current=null] : iv_ruleBodyParameter= ruleBodyParameter EOF ;
    public final EObject entryRuleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameter = null;


        try {
            // InternalKerMLExpressions.g:2706:54: (iv_ruleBodyParameter= ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:2707:2: iv_ruleBodyParameter= ruleBodyParameter EOF
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
    // InternalKerMLExpressions.g:2713:1: ruleBodyParameter returns [EObject current=null] : () ;
    public final EObject ruleBodyParameter() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2719:2: ( () )
            // InternalKerMLExpressions.g:2720:2: ()
            {
            // InternalKerMLExpressions.g:2720:2: ()
            // InternalKerMLExpressions.g:2721:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getBodyParameterAccess().getFeatureAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyParameter"


    // $ANTLR start "entryRuleSequenceExpression"
    // InternalKerMLExpressions.g:2730:1: entryRuleSequenceExpression returns [EObject current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final EObject entryRuleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2730:59: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:2731:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
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
    // InternalKerMLExpressions.g:2737:1: ruleSequenceExpression returns [EObject current=null] : (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) ;
    public final EObject ruleSequenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operator_3_0=null;
        EObject this_OwnedExpression_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2743:2: ( (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) )
            // InternalKerMLExpressions.g:2744:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            {
            // InternalKerMLExpressions.g:2744:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            // InternalKerMLExpressions.g:2745:3: this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            			current = this_OwnedExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2753:3: (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==62) ) {
                int LA33_1 = input.LA(2);

                if ( ((LA33_1>=RULE_STRING_VALUE && LA33_1<=RULE_UNRESTRICTED_NAME)||LA33_1==15||(LA33_1>=30 && LA33_1<=34)||(LA33_1>=40 && LA33_1<=42)||(LA33_1>=49 && LA33_1<=52)||(LA33_1>=55 && LA33_1<=56)||LA33_1==58||(LA33_1>=64 && LA33_1<=66)) ) {
                    alt33=2;
                }
                else if ( (LA33_1==EOF||LA33_1==48||LA33_1==57) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalKerMLExpressions.g:2754:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2759:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:2759:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    // InternalKerMLExpressions.g:2760:5: () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) )
                    {
                    // InternalKerMLExpressions.g:2760:5: ()
                    // InternalKerMLExpressions.g:2761:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalKerMLExpressions.g:2767:5: ( (lv_operator_3_0= ',' ) )
                    // InternalKerMLExpressions.g:2768:6: (lv_operator_3_0= ',' )
                    {
                    // InternalKerMLExpressions.g:2768:6: (lv_operator_3_0= ',' )
                    // InternalKerMLExpressions.g:2769:7: lv_operator_3_0= ','
                    {
                    lv_operator_3_0=(Token)match(input,62,FOLLOW_4); 

                    							newLeafNode(lv_operator_3_0, grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSequenceExpressionRule());
                    							}
                    							setWithLastConsumed(current, "operator", lv_operator_3_0, ",");
                    						

                    }


                    }

                    // InternalKerMLExpressions.g:2781:5: ( (lv_operand_4_0= ruleSequenceExpression ) )
                    // InternalKerMLExpressions.g:2782:6: (lv_operand_4_0= ruleSequenceExpression )
                    {
                    // InternalKerMLExpressions.g:2782:6: (lv_operand_4_0= ruleSequenceExpression )
                    // InternalKerMLExpressions.g:2783:7: lv_operand_4_0= ruleSequenceExpression
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
    // InternalKerMLExpressions.g:2806:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2806:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:2807:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
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
    // InternalKerMLExpressions.g:2813:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2819:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) )
            // InternalKerMLExpressions.g:2820:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            {
            // InternalKerMLExpressions.g:2820:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:2821:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:2821:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:2822:4: lv_ownedRelationship_0_0= ruleFeatureReferenceMember
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
    // InternalKerMLExpressions.g:2842:1: entryRuleFeatureReferenceMember returns [EObject current=null] : iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF ;
    public final EObject entryRuleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2842:63: (iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:2843:2: iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF
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
    // InternalKerMLExpressions.g:2849:1: ruleFeatureReferenceMember returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2855:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:2856:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:2856:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:2857:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:2857:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:2858:4: ruleQualifiedName
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


    // $ANTLR start "entryRuleInvocationExpression"
    // InternalKerMLExpressions.g:2875:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLExpressions.g:2875:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:2876:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
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
    // InternalKerMLExpressions.g:2882:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;

        EObject this_ArgumentList_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2888:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) )
            // InternalKerMLExpressions.g:2889:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            {
            // InternalKerMLExpressions.g:2889:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            // InternalKerMLExpressions.g:2890:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current]
            {
            // InternalKerMLExpressions.g:2890:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:2891:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:2891:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:2892:5: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
            {

            					newCompositeNode(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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


    // $ANTLR start "ruleArgumentList"
    // InternalKerMLExpressions.g:2925:1: ruleArgumentList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_PositionalArgumentList_1 = null;

        EObject this_NamedArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2931:2: ( (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) )
            // InternalKerMLExpressions.g:2932:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            {
            // InternalKerMLExpressions.g:2932:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            // InternalKerMLExpressions.g:2933:3: otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalKerMLExpressions.g:2937:3: (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )?
            int alt34=3;
            switch ( input.LA(1) ) {
                case RULE_STRING_VALUE:
                case RULE_DECIMAL_VALUE:
                case RULE_EXP_VALUE:
                case 15:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 40:
                case 41:
                case 42:
                case 49:
                case 50:
                case 51:
                case 52:
                case 55:
                case 56:
                case 58:
                case 64:
                case 65:
                case 66:
                    {
                    alt34=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA34_2 = input.LA(2);

                    if ( ((LA34_2>=17 && LA34_2<=47)||(LA34_2>=53 && LA34_2<=57)||LA34_2==62||LA34_2==67) ) {
                        alt34=1;
                    }
                    else if ( (LA34_2==63) ) {
                        alt34=2;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA34_3 = input.LA(2);

                    if ( ((LA34_3>=17 && LA34_3<=47)||(LA34_3>=53 && LA34_3<=57)||LA34_3==62||LA34_3==67) ) {
                        alt34=1;
                    }
                    else if ( (LA34_3==63) ) {
                        alt34=2;
                    }
                    }
                    break;
            }

            switch (alt34) {
                case 1 :
                    // InternalKerMLExpressions.g:2938:4: this_PositionalArgumentList_1= rulePositionalArgumentList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getArgumentListRule());
                    				}
                    				newCompositeNode(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_28);
                    this_PositionalArgumentList_1=rulePositionalArgumentList(current);

                    state._fsp--;


                    				current = this_PositionalArgumentList_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2950:4: this_NamedArgumentList_2= ruleNamedArgumentList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getArgumentListRule());
                    				}
                    				newCompositeNode(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_NamedArgumentList_2=ruleNamedArgumentList(current);

                    state._fsp--;


                    				current = this_NamedArgumentList_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,57,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2971:1: rulePositionalArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* ) ;
    public final EObject rulePositionalArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2977:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:2978:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:2978:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:2979:3: ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:2979:3: ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:2980:4: (lv_ownedRelationship_0_0= ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:2980:4: (lv_ownedRelationship_0_0= ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:2981:5: lv_ownedRelationship_0_0= ruleOwnedExpressionMember
            {

            					newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_ownedRelationship_0_0=ruleOwnedExpressionMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionalArgumentListRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLExpressions.g:2998:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==62) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2999:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:3003:4: ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) )
            	    // InternalKerMLExpressions.g:3004:5: (lv_ownedRelationship_2_0= ruleOwnedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:3004:5: (lv_ownedRelationship_2_0= ruleOwnedExpressionMember )
            	    // InternalKerMLExpressions.g:3005:6: lv_ownedRelationship_2_0= ruleOwnedExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_ownedRelationship_2_0=ruleOwnedExpressionMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPositionalArgumentListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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


    // $ANTLR start "ruleNamedArgumentList"
    // InternalKerMLExpressions.g:3028:1: ruleNamedArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) ;
    public final EObject ruleNamedArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3034:2: ( ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:3035:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:3035:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:3036:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:3036:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:3037:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:3037:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:3038:5: lv_ownedRelationship_0_0= ruleNamedExpressionMember
            {

            					newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_ownedRelationship_0_0=ruleNamedExpressionMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedArgumentListRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.NamedExpressionMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLExpressions.g:3055:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==62) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3056:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:3060:4: ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    // InternalKerMLExpressions.g:3061:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:3061:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    // InternalKerMLExpressions.g:3062:6: lv_ownedRelationship_2_0= ruleNamedExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_ownedRelationship_2_0=ruleNamedExpressionMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNamedArgumentListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_2_0,
            	    							"org.omg.kerml.expressions.xtext.KerMLExpressions.NamedExpressionMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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


    // $ANTLR start "entryRuleNamedExpressionMember"
    // InternalKerMLExpressions.g:3084:1: entryRuleNamedExpressionMember returns [EObject current=null] : iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF ;
    public final EObject entryRuleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:3084:62: (iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF )
            // InternalKerMLExpressions.g:3085:2: iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getNamedExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedExpressionMember=ruleNamedExpressionMember();

            state._fsp--;

             current =iv_ruleNamedExpressionMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedExpressionMember"


    // $ANTLR start "ruleNamedExpressionMember"
    // InternalKerMLExpressions.g:3091:1: ruleNamedExpressionMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) ) ;
    public final EObject ruleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3097:2: ( ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) ) )
            // InternalKerMLExpressions.g:3098:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) )
            {
            // InternalKerMLExpressions.g:3098:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:3099:3: ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:3099:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalKerMLExpressions.g:3100:4: (lv_memberName_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:3100:4: (lv_memberName_0_0= ruleName )
            // InternalKerMLExpressions.g:3101:5: lv_memberName_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_memberName_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedExpressionMemberRule());
            					}
            					set(
            						current,
            						"memberName",
            						lv_memberName_0_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedExpressionMemberAccess().getEqualsSignKeyword_1());
            		
            // InternalKerMLExpressions.g:3122:3: ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:3123:4: (lv_ownedRelatedElement_2_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:3123:4: (lv_ownedRelatedElement_2_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:3124:5: lv_ownedRelatedElement_2_0= ruleOwnedExpression
            {

            					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_2_0=ruleOwnedExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedExpressionMemberRule());
            					}
            					add(
            						current,
            						"ownedRelatedElement",
            						lv_ownedRelatedElement_2_0,
            						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
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
    // $ANTLR end "ruleNamedExpressionMember"


    // $ANTLR start "entryRuleNullExpression"
    // InternalKerMLExpressions.g:3145:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalKerMLExpressions.g:3145:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLExpressions.g:3146:2: iv_ruleNullExpression= ruleNullExpression EOF
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
    // InternalKerMLExpressions.g:3152:1: ruleNullExpression returns [EObject current=null] : ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3158:2: ( ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) )
            // InternalKerMLExpressions.g:3159:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            {
            // InternalKerMLExpressions.g:3159:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            // InternalKerMLExpressions.g:3160:3: () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            {
            // InternalKerMLExpressions.g:3160:3: ()
            // InternalKerMLExpressions.g:3161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
            					current);
            			

            }

            // InternalKerMLExpressions.g:3167:3: (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==64) ) {
                alt37=1;
            }
            else if ( (LA37_0==56) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalKerMLExpressions.g:3168:4: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3173:4: (otherlv_2= '(' otherlv_3= ')' )
                    {
                    // InternalKerMLExpressions.g:3173:4: (otherlv_2= '(' otherlv_3= ')' )
                    // InternalKerMLExpressions.g:3174:5: otherlv_2= '(' otherlv_3= ')'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_28); 

                    					newLeafNode(otherlv_2, grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,57,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3188:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLExpressions.g:3188:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:3189:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalKerMLExpressions.g:3195:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralInteger_2 = null;

        EObject this_LiteralReal_3 = null;

        EObject this_LiteralInfinity_4 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3201:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) )
            // InternalKerMLExpressions.g:3202:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            {
            // InternalKerMLExpressions.g:3202:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 65:
            case 66:
                {
                alt38=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt38=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA38_3 = input.LA(2);

                if ( (LA38_3==EOF||LA38_3==14||(LA38_3>=16 && LA38_3<=48)||(LA38_3>=53 && LA38_3<=54)||LA38_3==57||LA38_3==60||LA38_3==62) ) {
                    alt38=3;
                }
                else if ( (LA38_3==55) ) {
                    int LA38_7 = input.LA(3);

                    if ( ((LA38_7>=RULE_DECIMAL_VALUE && LA38_7<=RULE_EXP_VALUE)) ) {
                        alt38=4;
                    }
                    else if ( ((LA38_7>=RULE_ID && LA38_7<=RULE_UNRESTRICTED_NAME)||LA38_7==58) ) {
                        alt38=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 55:
                {
                alt38=4;
                }
                break;
            case 42:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalKerMLExpressions.g:3203:3: this_LiteralBoolean_0= ruleLiteralBoolean
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
                    // InternalKerMLExpressions.g:3212:3: this_LiteralString_1= ruleLiteralString
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
                    // InternalKerMLExpressions.g:3221:3: this_LiteralInteger_2= ruleLiteralInteger
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
                    // InternalKerMLExpressions.g:3230:3: this_LiteralReal_3= ruleLiteralReal
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
                    // InternalKerMLExpressions.g:3239:3: this_LiteralInfinity_4= ruleLiteralInfinity
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
    // InternalKerMLExpressions.g:3251:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLExpressions.g:3251:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:3252:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
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
    // InternalKerMLExpressions.g:3258:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3264:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalKerMLExpressions.g:3265:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalKerMLExpressions.g:3265:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalKerMLExpressions.g:3266:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:3266:3: (lv_value_0_0= ruleBooleanValue )
            // InternalKerMLExpressions.g:3267:4: lv_value_0_0= ruleBooleanValue
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
    // InternalKerMLExpressions.g:3287:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLExpressions.g:3287:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:3288:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalKerMLExpressions.g:3294:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3300:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLExpressions.g:3301:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLExpressions.g:3301:2: (kw= 'true' | kw= 'false' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==65) ) {
                alt39=1;
            }
            else if ( (LA39_0==66) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalKerMLExpressions.g:3302:3: kw= 'true'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3308:3: kw= 'false'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3317:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // InternalKerMLExpressions.g:3317:54: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLExpressions.g:3318:2: iv_ruleLiteralString= ruleLiteralString EOF
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
    // InternalKerMLExpressions.g:3324:1: ruleLiteralString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3330:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalKerMLExpressions.g:3331:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalKerMLExpressions.g:3331:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:3332:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:3332:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:3333:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalKerMLExpressions.g:3352:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLExpressions.g:3352:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:3353:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
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
    // InternalKerMLExpressions.g:3359:1: ruleLiteralInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3365:2: ( ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) )
            // InternalKerMLExpressions.g:3366:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            {
            // InternalKerMLExpressions.g:3366:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:3367:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:3367:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:3368:4: lv_value_0_0= RULE_DECIMAL_VALUE
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
    // InternalKerMLExpressions.g:3387:1: entryRuleLiteralReal returns [EObject current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final EObject entryRuleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralReal = null;


        try {
            // InternalKerMLExpressions.g:3387:52: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:3388:2: iv_ruleLiteralReal= ruleLiteralReal EOF
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
    // InternalKerMLExpressions.g:3394:1: ruleLiteralReal returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleLiteralReal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3400:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalKerMLExpressions.g:3401:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalKerMLExpressions.g:3401:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalKerMLExpressions.g:3402:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalKerMLExpressions.g:3402:3: (lv_value_0_0= ruleRealValue )
            // InternalKerMLExpressions.g:3403:4: lv_value_0_0= ruleRealValue
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
    // InternalKerMLExpressions.g:3423:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLExpressions.g:3423:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLExpressions.g:3424:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalKerMLExpressions.g:3430:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3436:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLExpressions.g:3437:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLExpressions.g:3437:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DECIMAL_VALUE||LA42_0==55) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_EXP_VALUE) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalKerMLExpressions.g:3438:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLExpressions.g:3438:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLExpressions.g:3439:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:3439:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_DECIMAL_VALUE) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalKerMLExpressions.g:3440:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_35); 

                            					current.merge(this_DECIMAL_VALUE_0);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,55,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalKerMLExpressions.g:3453:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_DECIMAL_VALUE) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RULE_EXP_VALUE) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalKerMLExpressions.g:3454:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

                            					current.merge(this_DECIMAL_VALUE_2);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLExpressions.g:3462:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalKerMLExpressions.g:3472:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalKerMLExpressions.g:3483:1: entryRuleLiteralInfinity returns [EObject current=null] : iv_ruleLiteralInfinity= ruleLiteralInfinity EOF ;
    public final EObject entryRuleLiteralInfinity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInfinity = null;


        try {
            // InternalKerMLExpressions.g:3483:56: (iv_ruleLiteralInfinity= ruleLiteralInfinity EOF )
            // InternalKerMLExpressions.g:3484:2: iv_ruleLiteralInfinity= ruleLiteralInfinity EOF
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
    // InternalKerMLExpressions.g:3490:1: ruleLiteralInfinity returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleLiteralInfinity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3496:2: ( ( () otherlv_1= '*' ) )
            // InternalKerMLExpressions.g:3497:2: ( () otherlv_1= '*' )
            {
            // InternalKerMLExpressions.g:3497:2: ( () otherlv_1= '*' )
            // InternalKerMLExpressions.g:3498:3: () otherlv_1= '*'
            {
            // InternalKerMLExpressions.g:3498:3: ()
            // InternalKerMLExpressions.g:3499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralInfinityAccess().getLiteralInfinityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3513:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLExpressions.g:3513:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLExpressions.g:3514:2: iv_ruleName= ruleName EOF
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
    // InternalKerMLExpressions.g:3520:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3526:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLExpressions.g:3527:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLExpressions.g:3527:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_UNRESTRICTED_NAME) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalKerMLExpressions.g:3528:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3536:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalKerMLExpressions.g:3547:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalKerMLExpressions.g:3547:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalKerMLExpressions.g:3548:2: iv_ruleQualification= ruleQualification EOF
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
    // InternalKerMLExpressions.g:3554:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3560:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalKerMLExpressions.g:3561:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalKerMLExpressions.g:3561:2: (this_Name_0= ruleName kw= '::' )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==67) ) {
                        alt44=1;
                    }


                }
                else if ( (LA44_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA44_3 = input.LA(2);

                    if ( (LA44_3==67) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3562:3: this_Name_0= ruleName kw= '::'
            	    {

            	    			newCompositeNode(grammarAccess.getQualificationAccess().getNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_37);
            	    this_Name_0=ruleName();

            	    state._fsp--;


            	    			current.merge(this_Name_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,67,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualificationAccess().getColonColonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
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
    // InternalKerMLExpressions.g:3581:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:3581:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:3582:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalKerMLExpressions.g:3588:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3594:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalKerMLExpressions.g:3595:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalKerMLExpressions.g:3595:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalKerMLExpressions.g:3596:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalKerMLExpressions.g:3596:3: (this_Qualification_0= ruleQualification )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==67) ) {
                    alt45=1;
                }
            }
            else if ( (LA45_0==RULE_UNRESTRICTED_NAME) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==67) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalKerMLExpressions.g:3597:4: this_Qualification_0= ruleQualification
                    {

                    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_16);
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


    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\4\uffff\2\11\5\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\4\1\uffff\2\16\2\uffff\1\7\2\uffff";
    static final String dfa_4s = "\1\102\1\uffff\1\102\1\uffff\2\103\2\uffff\1\10\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\5\1\6\1\uffff\1\3\1\4";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\3\3\1\4\1\5\41\uffff\1\3\14\uffff\1\3\1\2\1\uffff\1\6\5\uffff\1\1\2\3",
            "",
            "\5\7\6\uffff\1\7\16\uffff\5\7\5\uffff\3\7\6\uffff\4\7\2\uffff\2\7\1\1\1\7\5\uffff\3\7",
            "",
            "\1\11\1\uffff\41\11\4\uffff\3\11\1\12\1\11\2\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "\1\11\1\uffff\41\11\4\uffff\3\11\1\12\1\11\2\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "",
            "",
            "\1\4\1\5",
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

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2470:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x059E0700000081F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x059E0700000001F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0500000000000180L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x259E0700000081F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x079E0700000081F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000182L});

}