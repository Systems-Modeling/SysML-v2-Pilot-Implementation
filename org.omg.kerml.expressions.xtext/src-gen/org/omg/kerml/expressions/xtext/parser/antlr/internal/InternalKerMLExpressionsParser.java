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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_VALUE", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_DOCUMENTATION_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "':'", "'if'", "'else'", "'?'", "'??'", "'=>'", "'implies'", "'|'", "'||'", "'or'", "'^^'", "'xor'", "'&'", "'&&'", "'and'", "'=='", "'!='", "'hastype'", "'istype'", "'@'", "'as'", "'<'", "'>'", "'<='", "'>='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'^'", "'!'", "'~'", "'not'", "'all'", "'['", "']'", "'->'", "'.'", "'('", "')'", "'{'", "';'", "'}'", "'in'", "','", "'='", "'null'", "'true'", "'false'", "'::'"
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

            if ( (LA2_0==EOF||(LA2_0>=RULE_STRING_VALUE && LA2_0<=RULE_UNRESTRICTED_NAME)||(LA2_0>=31 && LA2_0<=34)||(LA2_0>=40 && LA2_0<=42)||(LA2_0>=47 && LA2_0<=50)||(LA2_0>=54 && LA2_0<=55)||LA2_0==57||(LA2_0>=63 && LA2_0<=65)) ) {
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

                if ( ((LA4_0>=19 && LA4_0<=20)) ) {
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
    // InternalKerMLExpressions.g:517:1: ruleImpliesOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=>' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleImpliesOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:523:2: ( (kw= '=>' | kw= 'implies' ) )
            // InternalKerMLExpressions.g:524:2: (kw= '=>' | kw= 'implies' )
            {
            // InternalKerMLExpressions.g:524:2: (kw= '=>' | kw= 'implies' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKerMLExpressions.g:525:3: kw= '=>'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getImpliesOperatorAccess().getEqualsSignGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:531:3: kw= 'implies'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getImpliesOperatorAccess().getImpliesKeyword_1());
                    		

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
    // $ANTLR end "ruleImpliesOperator"


    // $ANTLR start "entryRuleOrExpression"
    // InternalKerMLExpressions.g:540:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalKerMLExpressions.g:540:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLExpressions.g:541:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalKerMLExpressions.g:547:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:553:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) )
            // InternalKerMLExpressions.g:554:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:554:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            // InternalKerMLExpressions.g:555:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:563:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=21 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKerMLExpressions.g:564:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:564:4: ()
            	    // InternalKerMLExpressions.g:565:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:571:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalKerMLExpressions.g:572:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalKerMLExpressions.g:572:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalKerMLExpressions.g:573:6: lv_operator_2_0= ruleOrOperator
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

            	    // InternalKerMLExpressions.g:590:4: ( (lv_operand_3_0= ruleXorExpression ) )
            	    // InternalKerMLExpressions.g:591:5: (lv_operand_3_0= ruleXorExpression )
            	    {
            	    // InternalKerMLExpressions.g:591:5: (lv_operand_3_0= ruleXorExpression )
            	    // InternalKerMLExpressions.g:592:6: lv_operand_3_0= ruleXorExpression
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrOperator"
    // InternalKerMLExpressions.g:614:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalKerMLExpressions.g:614:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalKerMLExpressions.g:615:2: iv_ruleOrOperator= ruleOrOperator EOF
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
    // InternalKerMLExpressions.g:621:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' | kw= '||' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:627:2: ( (kw= '|' | kw= '||' | kw= 'or' ) )
            // InternalKerMLExpressions.g:628:2: (kw= '|' | kw= '||' | kw= 'or' )
            {
            // InternalKerMLExpressions.g:628:2: (kw= '|' | kw= '||' | kw= 'or' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
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
                    // InternalKerMLExpressions.g:629:3: kw= '|'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:635:3: kw= '||'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:641:3: kw= 'or'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:650:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalKerMLExpressions.g:650:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLExpressions.g:651:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalKerMLExpressions.g:657:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:663:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:664:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:664:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            // InternalKerMLExpressions.g:665:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:673:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKerMLExpressions.g:674:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:674:4: ()
            	    // InternalKerMLExpressions.g:675:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:681:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalKerMLExpressions.g:682:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalKerMLExpressions.g:682:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalKerMLExpressions.g:683:6: lv_operator_2_0= ruleXorOperator
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

            	    // InternalKerMLExpressions.g:700:4: ( (lv_operand_3_0= ruleAndExpression ) )
            	    // InternalKerMLExpressions.g:701:5: (lv_operand_3_0= ruleAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:701:5: (lv_operand_3_0= ruleAndExpression )
            	    // InternalKerMLExpressions.g:702:6: lv_operand_3_0= ruleAndExpression
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXorOperator"
    // InternalKerMLExpressions.g:724:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalKerMLExpressions.g:724:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalKerMLExpressions.g:725:2: iv_ruleXorOperator= ruleXorOperator EOF
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
    // InternalKerMLExpressions.g:731:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '^^' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:737:2: ( (kw= '^^' | kw= 'xor' ) )
            // InternalKerMLExpressions.g:738:2: (kw= '^^' | kw= 'xor' )
            {
            // InternalKerMLExpressions.g:738:2: (kw= '^^' | kw= 'xor' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKerMLExpressions.g:739:3: kw= '^^'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXorOperatorAccess().getCircumflexAccentCircumflexAccentKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:745:3: kw= 'xor'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:754:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalKerMLExpressions.g:754:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLExpressions.g:755:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalKerMLExpressions.g:761:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:767:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalKerMLExpressions.g:768:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:768:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            // InternalKerMLExpressions.g:769:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:777:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKerMLExpressions.g:778:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:778:4: ()
            	    // InternalKerMLExpressions.g:779:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:785:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalKerMLExpressions.g:786:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalKerMLExpressions.g:786:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalKerMLExpressions.g:787:6: lv_operator_2_0= ruleAndOperator
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

            	    // InternalKerMLExpressions.g:804:4: ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    // InternalKerMLExpressions.g:805:5: (lv_operand_3_0= ruleEqualityExpression )
            	    {
            	    // InternalKerMLExpressions.g:805:5: (lv_operand_3_0= ruleEqualityExpression )
            	    // InternalKerMLExpressions.g:806:6: lv_operand_3_0= ruleEqualityExpression
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
            	    break loop10;
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
    // InternalKerMLExpressions.g:828:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalKerMLExpressions.g:828:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalKerMLExpressions.g:829:2: iv_ruleAndOperator= ruleAndOperator EOF
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
    // InternalKerMLExpressions.g:835:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '&&' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:841:2: ( (kw= '&' | kw= '&&' | kw= 'and' ) )
            // InternalKerMLExpressions.g:842:2: (kw= '&' | kw= '&&' | kw= 'and' )
            {
            // InternalKerMLExpressions.g:842:2: (kw= '&' | kw= '&&' | kw= 'and' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
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
                    // InternalKerMLExpressions.g:843:3: kw= '&'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:849:3: kw= '&&'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:855:3: kw= 'and'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:864:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLExpressions.g:864:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:865:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalKerMLExpressions.g:871:1: ruleEqualityExpression returns [EObject current=null] : (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:877:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:878:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:878:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            // InternalKerMLExpressions.g:879:3: this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_ClassificationExpression_0=ruleClassificationExpression();

            state._fsp--;


            			current = this_ClassificationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:887:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=29 && LA12_0<=30)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKerMLExpressions.g:888:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:888:4: ()
            	    // InternalKerMLExpressions.g:889:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:895:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalKerMLExpressions.g:896:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalKerMLExpressions.g:896:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalKerMLExpressions.g:897:6: lv_operator_2_0= ruleEqualityOperator
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

            	    // InternalKerMLExpressions.g:914:4: ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    // InternalKerMLExpressions.g:915:5: (lv_operand_3_0= ruleClassificationExpression )
            	    {
            	    // InternalKerMLExpressions.g:915:5: (lv_operand_3_0= ruleClassificationExpression )
            	    // InternalKerMLExpressions.g:916:6: lv_operand_3_0= ruleClassificationExpression
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
            	    break loop12;
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
    // InternalKerMLExpressions.g:938:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalKerMLExpressions.g:938:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:939:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalKerMLExpressions.g:945:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:951:2: ( (kw= '==' | kw= '!=' ) )
            // InternalKerMLExpressions.g:952:2: (kw= '==' | kw= '!=' )
            {
            // InternalKerMLExpressions.g:952:2: (kw= '==' | kw= '!=' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalKerMLExpressions.g:953:3: kw= '=='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:959:3: kw= '!='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:968:1: entryRuleClassificationExpression returns [EObject current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final EObject entryRuleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLExpressions.g:968:65: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:969:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
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
    // InternalKerMLExpressions.g:975:1: ruleClassificationExpression returns [EObject current=null] : ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) ) ;
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
            // InternalKerMLExpressions.g:981:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) ) )
            // InternalKerMLExpressions.g:982:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) )
            {
            // InternalKerMLExpressions.g:982:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING_VALUE && LA15_0<=RULE_UNRESTRICTED_NAME)||(LA15_0>=40 && LA15_0<=42)||(LA15_0>=47 && LA15_0<=50)||(LA15_0>=54 && LA15_0<=55)||LA15_0==57||(LA15_0>=63 && LA15_0<=65)) ) {
                alt15=1;
            }
            else if ( (LA15_0==EOF||(LA15_0>=31 && LA15_0<=34)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalKerMLExpressions.g:983:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? )
                    {
                    // InternalKerMLExpressions.g:983:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? )
                    // InternalKerMLExpressions.g:984:4: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_15);
                    this_RelationalExpression_0=ruleRelationalExpression();

                    state._fsp--;


                    				current = this_RelationalExpression_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLExpressions.g:992:4: ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=31 && LA14_0<=34)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalKerMLExpressions.g:993:5: () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            {
                            // InternalKerMLExpressions.g:993:5: ()
                            // InternalKerMLExpressions.g:994:6: 
                            {

                            						current = forceCreateModelElementAndAdd(
                            							grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalKerMLExpressions.g:1000:5: ( (lv_operator_2_0= ruleClassificationOperator ) )
                            // InternalKerMLExpressions.g:1001:6: (lv_operator_2_0= ruleClassificationOperator )
                            {
                            // InternalKerMLExpressions.g:1001:6: (lv_operator_2_0= ruleClassificationOperator )
                            // InternalKerMLExpressions.g:1002:7: lv_operator_2_0= ruleClassificationOperator
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

                            // InternalKerMLExpressions.g:1019:5: ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            // InternalKerMLExpressions.g:1020:6: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            {
                            // InternalKerMLExpressions.g:1020:6: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            // InternalKerMLExpressions.g:1021:7: lv_ownedRelationship_3_0= ruleTypeReferenceMember
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
                    // InternalKerMLExpressions.g:1041:3: ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1041:3: ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1042:4: () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1042:4: ()
                    // InternalKerMLExpressions.g:1043:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1049:4: ( (lv_operand_5_0= ruleSelfReferenceExpression ) )
                    // InternalKerMLExpressions.g:1050:5: (lv_operand_5_0= ruleSelfReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:1050:5: (lv_operand_5_0= ruleSelfReferenceExpression )
                    // InternalKerMLExpressions.g:1051:6: lv_operand_5_0= ruleSelfReferenceExpression
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

                    // InternalKerMLExpressions.g:1068:4: ( (lv_operator_6_0= ruleClassificationOperator ) )
                    // InternalKerMLExpressions.g:1069:5: (lv_operator_6_0= ruleClassificationOperator )
                    {
                    // InternalKerMLExpressions.g:1069:5: (lv_operator_6_0= ruleClassificationOperator )
                    // InternalKerMLExpressions.g:1070:6: lv_operator_6_0= ruleClassificationOperator
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

                    // InternalKerMLExpressions.g:1087:4: ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1088:5: (lv_ownedRelationship_7_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1088:5: (lv_ownedRelationship_7_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1089:6: lv_ownedRelationship_7_0= ruleTypeReferenceMember
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
    // InternalKerMLExpressions.g:1111:1: entryRuleClassificationOperator returns [String current=null] : iv_ruleClassificationOperator= ruleClassificationOperator EOF ;
    public final String entryRuleClassificationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationOperator = null;


        try {
            // InternalKerMLExpressions.g:1111:62: (iv_ruleClassificationOperator= ruleClassificationOperator EOF )
            // InternalKerMLExpressions.g:1112:2: iv_ruleClassificationOperator= ruleClassificationOperator EOF
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
    // InternalKerMLExpressions.g:1118:1: ruleClassificationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleClassificationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1124:2: ( (kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' ) )
            // InternalKerMLExpressions.g:1125:2: (kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' )
            {
            // InternalKerMLExpressions.g:1125:2: (kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 34:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalKerMLExpressions.g:1126:3: kw= 'hastype'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1132:3: kw= 'istype'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1138:3: kw= '@'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1144:3: kw= 'as'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getAsKeyword_3());
                    		

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
    // InternalKerMLExpressions.g:1153:1: entryRuleTypeReferenceMember returns [EObject current=null] : iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF ;
    public final EObject entryRuleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1153:60: (iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:1154:2: iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF
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
    // InternalKerMLExpressions.g:1160:1: ruleTypeReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) ;
    public final EObject ruleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1166:2: ( ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) )
            // InternalKerMLExpressions.g:1167:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            {
            // InternalKerMLExpressions.g:1167:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            // InternalKerMLExpressions.g:1168:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            {
            // InternalKerMLExpressions.g:1168:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            // InternalKerMLExpressions.g:1169:4: lv_ownedRelatedElement_0_0= ruleTypeReference
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
    // InternalKerMLExpressions.g:1189:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalKerMLExpressions.g:1189:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalKerMLExpressions.g:1190:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalKerMLExpressions.g:1196:1: ruleTypeReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1202:2: ( ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) )
            // InternalKerMLExpressions.g:1203:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            {
            // InternalKerMLExpressions.g:1203:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:1204:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:1204:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            // InternalKerMLExpressions.g:1205:4: lv_ownedRelationship_0_0= ruleReferenceTyping
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
    // InternalKerMLExpressions.g:1225:1: entryRuleReferenceTyping returns [EObject current=null] : iv_ruleReferenceTyping= ruleReferenceTyping EOF ;
    public final EObject entryRuleReferenceTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTyping = null;


        try {
            // InternalKerMLExpressions.g:1225:56: (iv_ruleReferenceTyping= ruleReferenceTyping EOF )
            // InternalKerMLExpressions.g:1226:2: iv_ruleReferenceTyping= ruleReferenceTyping EOF
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
    // InternalKerMLExpressions.g:1232:1: ruleReferenceTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReferenceTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1238:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:1239:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:1239:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:1240:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:1240:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:1241:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:1258:1: entryRuleSelfReferenceExpression returns [EObject current=null] : iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF ;
    public final EObject entryRuleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:1258:64: (iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:1259:2: iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF
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
    // InternalKerMLExpressions.g:1265:1: ruleSelfReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) ;
    public final EObject ruleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1271:2: ( ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) )
            // InternalKerMLExpressions.g:1272:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            {
            // InternalKerMLExpressions.g:1272:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:1273:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:1273:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:1274:4: lv_ownedRelationship_0_0= ruleSelfReferenceMember
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
    // InternalKerMLExpressions.g:1294:1: entryRuleSelfReferenceMember returns [EObject current=null] : iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF ;
    public final EObject entryRuleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1294:60: (iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:1295:2: iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF
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
    // InternalKerMLExpressions.g:1301:1: ruleSelfReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) ;
    public final EObject ruleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1307:2: ( ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) )
            // InternalKerMLExpressions.g:1308:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            {
            // InternalKerMLExpressions.g:1308:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:1309:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:1309:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            // InternalKerMLExpressions.g:1310:4: lv_ownedRelatedElement_0_0= ruleEmptyFeature
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
    // InternalKerMLExpressions.g:1330:1: entryRuleEmptyFeature returns [EObject current=null] : iv_ruleEmptyFeature= ruleEmptyFeature EOF ;
    public final EObject entryRuleEmptyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFeature = null;


        try {
            // InternalKerMLExpressions.g:1330:53: (iv_ruleEmptyFeature= ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:1331:2: iv_ruleEmptyFeature= ruleEmptyFeature EOF
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
    // InternalKerMLExpressions.g:1337:1: ruleEmptyFeature returns [EObject current=null] : () ;
    public final EObject ruleEmptyFeature() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1343:2: ( () )
            // InternalKerMLExpressions.g:1344:2: ()
            {
            // InternalKerMLExpressions.g:1344:2: ()
            // InternalKerMLExpressions.g:1345:3: 
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
    // InternalKerMLExpressions.g:1354:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLExpressions.g:1354:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:1355:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalKerMLExpressions.g:1361:1: ruleRelationalExpression returns [EObject current=null] : (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RangeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1367:2: ( (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1368:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1368:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            // InternalKerMLExpressions.g:1369:3: this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_RangeExpression_0=ruleRangeExpression();

            state._fsp--;


            			current = this_RangeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1377:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=35 && LA17_0<=38)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1378:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1378:4: ()
            	    // InternalKerMLExpressions.g:1379:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1385:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalKerMLExpressions.g:1386:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalKerMLExpressions.g:1386:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalKerMLExpressions.g:1387:6: lv_operator_2_0= ruleRelationalOperator
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

            	    // InternalKerMLExpressions.g:1404:4: ( (lv_operand_3_0= ruleRangeExpression ) )
            	    // InternalKerMLExpressions.g:1405:5: (lv_operand_3_0= ruleRangeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1405:5: (lv_operand_3_0= ruleRangeExpression )
            	    // InternalKerMLExpressions.g:1406:6: lv_operand_3_0= ruleRangeExpression
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalKerMLExpressions.g:1428:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalKerMLExpressions.g:1428:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:1429:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
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
    // InternalKerMLExpressions.g:1435:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1441:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalKerMLExpressions.g:1442:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalKerMLExpressions.g:1442:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalKerMLExpressions.g:1443:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1449:3: kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1455:3: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1461:3: kw= '>='
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
    // InternalKerMLExpressions.g:1470:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalKerMLExpressions.g:1470:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalKerMLExpressions.g:1471:2: iv_ruleRangeExpression= ruleRangeExpression EOF
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
    // InternalKerMLExpressions.g:1477:1: ruleRangeExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1483:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalKerMLExpressions.g:1484:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalKerMLExpressions.g:1484:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            // InternalKerMLExpressions.g:1485:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1493:3: ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKerMLExpressions.g:1494:4: () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalKerMLExpressions.g:1494:4: ()
                    // InternalKerMLExpressions.g:1495:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRangeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1501:4: ( (lv_operator_2_0= '..' ) )
                    // InternalKerMLExpressions.g:1502:5: (lv_operator_2_0= '..' )
                    {
                    // InternalKerMLExpressions.g:1502:5: (lv_operator_2_0= '..' )
                    // InternalKerMLExpressions.g:1503:6: lv_operator_2_0= '..'
                    {
                    lv_operator_2_0=(Token)match(input,39,FOLLOW_6); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangeExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "..");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1515:4: ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    // InternalKerMLExpressions.g:1516:5: (lv_operand_3_0= ruleAdditiveExpression )
                    {
                    // InternalKerMLExpressions.g:1516:5: (lv_operand_3_0= ruleAdditiveExpression )
                    // InternalKerMLExpressions.g:1517:6: lv_operand_3_0= ruleAdditiveExpression
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
    // InternalKerMLExpressions.g:1539:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLExpressions.g:1539:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:1540:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalKerMLExpressions.g:1546:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1552:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1553:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1553:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalKerMLExpressions.g:1554:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1562:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=40 && LA20_0<=41)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1563:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1563:4: ()
            	    // InternalKerMLExpressions.g:1564:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1570:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalKerMLExpressions.g:1571:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalKerMLExpressions.g:1571:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalKerMLExpressions.g:1572:6: lv_operator_2_0= ruleAdditiveOperator
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

            	    // InternalKerMLExpressions.g:1589:4: ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    // InternalKerMLExpressions.g:1590:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1590:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    // InternalKerMLExpressions.g:1591:6: lv_operand_3_0= ruleMultiplicativeExpression
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
            	    break loop20;
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
    // InternalKerMLExpressions.g:1613:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalKerMLExpressions.g:1613:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:1614:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
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
    // InternalKerMLExpressions.g:1620:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1626:2: ( (kw= '+' | kw= '-' ) )
            // InternalKerMLExpressions.g:1627:2: (kw= '+' | kw= '-' )
            {
            // InternalKerMLExpressions.g:1627:2: (kw= '+' | kw= '-' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            else if ( (LA21_0==41) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalKerMLExpressions.g:1628:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1634:3: kw= '-'
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
    // InternalKerMLExpressions.g:1643:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLExpressions.g:1643:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:1644:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalKerMLExpressions.g:1650:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1656:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1657:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1657:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            // InternalKerMLExpressions.g:1658:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;


            			current = this_ExponentiationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1666:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=42 && LA22_0<=44)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1667:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1667:4: ()
            	    // InternalKerMLExpressions.g:1668:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1674:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalKerMLExpressions.g:1675:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalKerMLExpressions.g:1675:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalKerMLExpressions.g:1676:6: lv_operator_2_0= ruleMultiplicativeOperator
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

            	    // InternalKerMLExpressions.g:1693:4: ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    // InternalKerMLExpressions.g:1694:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    {
            	    // InternalKerMLExpressions.g:1694:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    // InternalKerMLExpressions.g:1695:6: lv_operand_3_0= ruleExponentiationExpression
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
            	    break loop22;
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
    // InternalKerMLExpressions.g:1717:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalKerMLExpressions.g:1717:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:1718:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
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
    // InternalKerMLExpressions.g:1724:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1730:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalKerMLExpressions.g:1731:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalKerMLExpressions.g:1731:2: (kw= '*' | kw= '/' | kw= '%' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalKerMLExpressions.g:1732:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1738:3: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1744:3: kw= '%'
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
    // InternalKerMLExpressions.g:1753:1: entryRuleExponentiationExpression returns [EObject current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final EObject entryRuleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLExpressions.g:1753:65: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:1754:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
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
    // InternalKerMLExpressions.g:1760:1: ruleExponentiationExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1766:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1767:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1767:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* )
            // InternalKerMLExpressions.g:1768:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1776:3: ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=45 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1777:4: () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1777:4: ()
            	    // InternalKerMLExpressions.g:1778:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1784:4: ( (lv_operator_2_0= ruleExponentiationOperator ) )
            	    // InternalKerMLExpressions.g:1785:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    {
            	    // InternalKerMLExpressions.g:1785:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    // InternalKerMLExpressions.g:1786:6: lv_operator_2_0= ruleExponentiationOperator
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

            	    // InternalKerMLExpressions.g:1803:4: ( (lv_operand_3_0= ruleUnaryExpression ) )
            	    // InternalKerMLExpressions.g:1804:5: (lv_operand_3_0= ruleUnaryExpression )
            	    {
            	    // InternalKerMLExpressions.g:1804:5: (lv_operand_3_0= ruleUnaryExpression )
            	    // InternalKerMLExpressions.g:1805:6: lv_operand_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperandUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop24;
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
    // InternalKerMLExpressions.g:1827:1: entryRuleExponentiationOperator returns [String current=null] : iv_ruleExponentiationOperator= ruleExponentiationOperator EOF ;
    public final String entryRuleExponentiationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationOperator = null;


        try {
            // InternalKerMLExpressions.g:1827:62: (iv_ruleExponentiationOperator= ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:1828:2: iv_ruleExponentiationOperator= ruleExponentiationOperator EOF
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
    // InternalKerMLExpressions.g:1834:1: ruleExponentiationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '**' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleExponentiationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1840:2: ( (kw= '**' | kw= '^' ) )
            // InternalKerMLExpressions.g:1841:2: (kw= '**' | kw= '^' )
            {
            // InternalKerMLExpressions.g:1841:2: (kw= '**' | kw= '^' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            else if ( (LA25_0==46) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalKerMLExpressions.g:1842:3: kw= '**'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1848:3: kw= '^'
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


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalKerMLExpressions.g:1857:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLExpressions.g:1857:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:1858:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalKerMLExpressions.g:1864:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_ExtentExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1870:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) )
            // InternalKerMLExpressions.g:1871:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:1871:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=40 && LA26_0<=41)||(LA26_0>=47 && LA26_0<=49)) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING_VALUE && LA26_0<=RULE_UNRESTRICTED_NAME)||LA26_0==42||LA26_0==50||(LA26_0>=54 && LA26_0<=55)||LA26_0==57||(LA26_0>=63 && LA26_0<=65)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalKerMLExpressions.g:1872:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:1872:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    // InternalKerMLExpressions.g:1873:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) )
                    {
                    // InternalKerMLExpressions.g:1873:4: ()
                    // InternalKerMLExpressions.g:1874:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1880:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalKerMLExpressions.g:1881:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalKerMLExpressions.g:1881:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalKerMLExpressions.g:1882:6: lv_operator_1_0= ruleUnaryOperator
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

                    // InternalKerMLExpressions.g:1899:4: ( (lv_operand_2_0= ruleExtentExpression ) )
                    // InternalKerMLExpressions.g:1900:5: (lv_operand_2_0= ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:1900:5: (lv_operand_2_0= ruleExtentExpression )
                    // InternalKerMLExpressions.g:1901:6: lv_operand_2_0= ruleExtentExpression
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
                    // InternalKerMLExpressions.g:1920:3: this_ExtentExpression_3= ruleExtentExpression
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
    // InternalKerMLExpressions.g:1932:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalKerMLExpressions.g:1932:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:1933:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalKerMLExpressions.g:1939:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1945:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' ) )
            // InternalKerMLExpressions.g:1946:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' )
            {
            // InternalKerMLExpressions.g:1946:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' )
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
            case 47:
                {
                alt27=3;
                }
                break;
            case 48:
                {
                alt27=4;
                }
                break;
            case 49:
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
                    // InternalKerMLExpressions.g:1947:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1953:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1959:3: kw= '!'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1965:3: kw= '~'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:1971:3: kw= 'not'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1980:1: entryRuleExtentExpression returns [EObject current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final EObject entryRuleExtentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression = null;


        try {
            // InternalKerMLExpressions.g:1980:57: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:1981:2: iv_ruleExtentExpression= ruleExtentExpression EOF
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
    // InternalKerMLExpressions.g:1987:1: ruleExtentExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleExtentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1993:2: ( ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalKerMLExpressions.g:1994:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalKerMLExpressions.g:1994:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING_VALUE && LA28_0<=RULE_UNRESTRICTED_NAME)||LA28_0==42||(LA28_0>=54 && LA28_0<=55)||LA28_0==57||(LA28_0>=63 && LA28_0<=65)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalKerMLExpressions.g:1995:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1995:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1996:4: () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1996:4: ()
                    // InternalKerMLExpressions.g:1997:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:2003:4: ( (lv_operator_1_0= 'all' ) )
                    // InternalKerMLExpressions.g:2004:5: (lv_operator_1_0= 'all' )
                    {
                    // InternalKerMLExpressions.g:2004:5: (lv_operator_1_0= 'all' )
                    // InternalKerMLExpressions.g:2005:6: lv_operator_1_0= 'all'
                    {
                    lv_operator_1_0=(Token)match(input,50,FOLLOW_16); 

                    						newLeafNode(lv_operator_1_0, grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtentExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_0, "all");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:2017:4: ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:2018:5: (lv_ownedRelationship_2_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:2018:5: (lv_ownedRelationship_2_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:2019:6: lv_ownedRelationship_2_0= ruleTypeReferenceMember
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
                    // InternalKerMLExpressions.g:2038:3: this_PrimaryExpression_3= rulePrimaryExpression
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
    // InternalKerMLExpressions.g:2050:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKerMLExpressions.g:2050:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKerMLExpressions.g:2051:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKerMLExpressions.g:2057:1: rulePrimaryExpression returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* ) ;
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
            // InternalKerMLExpressions.g:2063:2: ( (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* ) )
            // InternalKerMLExpressions.g:2064:2: (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* )
            {
            // InternalKerMLExpressions.g:2064:2: (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* )
            // InternalKerMLExpressions.g:2065:3: this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;


            			current = this_BaseExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2073:3: ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )*
            loop30:
            do {
                int alt30=5;
                switch ( input.LA(1) ) {
                case 51:
                    {
                    alt30=1;
                    }
                    break;
                case 53:
                    {
                    alt30=2;
                    }
                    break;
                case 54:
                    {
                    int LA30_4 = input.LA(2);

                    if ( ((LA30_4>=RULE_ID && LA30_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt30=3;
                    }
                    else if ( (LA30_4==57) ) {
                        alt30=4;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2074:4: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' )
            	    {
            	    // InternalKerMLExpressions.g:2074:4: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' )
            	    // InternalKerMLExpressions.g:2075:5: () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalKerMLExpressions.g:2075:5: ()
            	    // InternalKerMLExpressions.g:2076:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalKerMLExpressions.g:2082:5: ( (lv_operator_2_0= '[' ) )
            	    // InternalKerMLExpressions.g:2083:6: (lv_operator_2_0= '[' )
            	    {
            	    // InternalKerMLExpressions.g:2083:6: (lv_operator_2_0= '[' )
            	    // InternalKerMLExpressions.g:2084:7: lv_operator_2_0= '['
            	    {
            	    lv_operator_2_0=(Token)match(input,51,FOLLOW_4); 

            	    							newLeafNode(lv_operator_2_0, grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	    							}
            	    							setWithLastConsumed(current, "operator", lv_operator_2_0, "[");
            	    						

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2096:5: ( (lv_operand_3_0= ruleSequenceExpression ) )
            	    // InternalKerMLExpressions.g:2097:6: (lv_operand_3_0= ruleSequenceExpression )
            	    {
            	    // InternalKerMLExpressions.g:2097:6: (lv_operand_3_0= ruleSequenceExpression )
            	    // InternalKerMLExpressions.g:2098:7: lv_operand_3_0= ruleSequenceExpression
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

            	    otherlv_4=(Token)match(input,52,FOLLOW_23); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKerMLExpressions.g:2121:4: ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) )
            	    {
            	    // InternalKerMLExpressions.g:2121:4: ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) )
            	    // InternalKerMLExpressions.g:2122:5: () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] )
            	    {
            	    // InternalKerMLExpressions.g:2122:5: ()
            	    // InternalKerMLExpressions.g:2123:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_6=(Token)match(input,53,FOLLOW_16); 

            	    					newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
            	    				
            	    // InternalKerMLExpressions.g:2133:5: ( (lv_ownedRelationship_7_0= ruleReferenceTyping ) )
            	    // InternalKerMLExpressions.g:2134:6: (lv_ownedRelationship_7_0= ruleReferenceTyping )
            	    {
            	    // InternalKerMLExpressions.g:2134:6: (lv_ownedRelationship_7_0= ruleReferenceTyping )
            	    // InternalKerMLExpressions.g:2135:7: lv_ownedRelationship_7_0= ruleReferenceTyping
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipReferenceTypingParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_ownedRelationship_7_0=ruleReferenceTyping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedRelationship",
            	    								lv_ownedRelationship_7_0,
            	    								"org.omg.kerml.expressions.xtext.KerMLExpressions.ReferenceTyping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2152:5: ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 57:
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
            	    case 55:
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
            	            // InternalKerMLExpressions.g:2153:6: ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) )
            	            {
            	            // InternalKerMLExpressions.g:2153:6: ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) )
            	            // InternalKerMLExpressions.g:2154:7: (lv_ownedRelationship_8_0= ruleExpressionBodyMember )
            	            {
            	            // InternalKerMLExpressions.g:2154:7: (lv_ownedRelationship_8_0= ruleExpressionBodyMember )
            	            // InternalKerMLExpressions.g:2155:8: lv_ownedRelationship_8_0= ruleExpressionBodyMember
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_1_1_3_0_0());
            	            							
            	            pushFollow(FOLLOW_23);
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
            	            // InternalKerMLExpressions.g:2173:6: ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) )
            	            {
            	            // InternalKerMLExpressions.g:2173:6: ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) )
            	            // InternalKerMLExpressions.g:2174:7: (lv_ownedRelationship_9_0= ruleFunctionReferenceMember )
            	            {
            	            // InternalKerMLExpressions.g:2174:7: (lv_ownedRelationship_9_0= ruleFunctionReferenceMember )
            	            // InternalKerMLExpressions.g:2175:8: lv_ownedRelationship_9_0= ruleFunctionReferenceMember
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFunctionReferenceMemberParserRuleCall_1_1_3_1_0());
            	            							
            	            pushFollow(FOLLOW_23);
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
            	            // InternalKerMLExpressions.g:2193:6: this_ArgumentList_10= ruleArgumentList[$current]
            	            {

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	            						}
            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_1_1_3_2());
            	            					
            	            pushFollow(FOLLOW_23);
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
            	    // InternalKerMLExpressions.g:2207:4: ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) )
            	    {
            	    // InternalKerMLExpressions.g:2207:4: ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) )
            	    // InternalKerMLExpressions.g:2208:5: () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2208:5: ()
            	    // InternalKerMLExpressions.g:2209:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getPathStepExpressionOperandAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_12=(Token)match(input,54,FOLLOW_16); 

            	    					newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_2_1());
            	    				
            	    // InternalKerMLExpressions.g:2219:5: ( (lv_operand_13_0= ruleFeatureReferenceExpression ) )
            	    // InternalKerMLExpressions.g:2220:6: (lv_operand_13_0= ruleFeatureReferenceExpression )
            	    {
            	    // InternalKerMLExpressions.g:2220:6: (lv_operand_13_0= ruleFeatureReferenceExpression )
            	    // InternalKerMLExpressions.g:2221:7: lv_operand_13_0= ruleFeatureReferenceExpression
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandFeatureReferenceExpressionParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
            	    // InternalKerMLExpressions.g:2240:4: ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) )
            	    {
            	    // InternalKerMLExpressions.g:2240:4: ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) )
            	    // InternalKerMLExpressions.g:2241:5: () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) )
            	    {
            	    // InternalKerMLExpressions.g:2241:5: ()
            	    // InternalKerMLExpressions.g:2242:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getPathSelectExpressionOperandAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_15=(Token)match(input,54,FOLLOW_26); 

            	    					newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_3_1());
            	    				
            	    // InternalKerMLExpressions.g:2252:5: ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) )
            	    // InternalKerMLExpressions.g:2253:6: (lv_ownedRelationship_16_0= ruleExpressionBodyMember )
            	    {
            	    // InternalKerMLExpressions.g:2253:6: (lv_ownedRelationship_16_0= ruleExpressionBodyMember )
            	    // InternalKerMLExpressions.g:2254:7: lv_ownedRelationship_16_0= ruleExpressionBodyMember
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
    // InternalKerMLExpressions.g:2277:1: entryRuleExpressionBodyMember returns [EObject current=null] : iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF ;
    public final EObject entryRuleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBodyMember = null;


        try {
            // InternalKerMLExpressions.g:2277:61: (iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF )
            // InternalKerMLExpressions.g:2278:2: iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF
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
    // InternalKerMLExpressions.g:2284:1: ruleExpressionBodyMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) ;
    public final EObject ruleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2290:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) )
            // InternalKerMLExpressions.g:2291:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            {
            // InternalKerMLExpressions.g:2291:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            // InternalKerMLExpressions.g:2292:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            {
            // InternalKerMLExpressions.g:2292:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            // InternalKerMLExpressions.g:2293:4: lv_ownedRelatedElement_0_0= ruleExpressionBody
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
    // InternalKerMLExpressions.g:2313:1: entryRuleFunctionReferenceMember returns [EObject current=null] : iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF ;
    public final EObject entryRuleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2313:64: (iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF )
            // InternalKerMLExpressions.g:2314:2: iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF
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
    // InternalKerMLExpressions.g:2320:1: ruleFunctionReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) ;
    public final EObject ruleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2326:2: ( ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) )
            // InternalKerMLExpressions.g:2327:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            {
            // InternalKerMLExpressions.g:2327:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            // InternalKerMLExpressions.g:2328:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            {
            // InternalKerMLExpressions.g:2328:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            // InternalKerMLExpressions.g:2329:4: lv_ownedRelatedElement_0_0= ruleFunctionReference
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
    // InternalKerMLExpressions.g:2349:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // InternalKerMLExpressions.g:2349:58: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // InternalKerMLExpressions.g:2350:2: iv_ruleFunctionReference= ruleFunctionReference EOF
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
    // InternalKerMLExpressions.g:2356:1: ruleFunctionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2362:2: ( ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) )
            // InternalKerMLExpressions.g:2363:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            {
            // InternalKerMLExpressions.g:2363:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:2364:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:2364:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            // InternalKerMLExpressions.g:2365:4: lv_ownedRelationship_0_0= ruleReferenceTyping
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


    // $ANTLR start "entryRuleBaseExpression"
    // InternalKerMLExpressions.g:2385:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalKerMLExpressions.g:2385:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:2386:2: iv_ruleBaseExpression= ruleBaseExpression EOF
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
    // InternalKerMLExpressions.g:2392:1: ruleBaseExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) ) ;
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
            // InternalKerMLExpressions.g:2398:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) ) )
            // InternalKerMLExpressions.g:2399:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )
            {
            // InternalKerMLExpressions.g:2399:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )
            int alt31=6;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalKerMLExpressions.g:2400:3: this_NullExpression_0= ruleNullExpression
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
                    // InternalKerMLExpressions.g:2409:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalKerMLExpressions.g:2418:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
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
                    // InternalKerMLExpressions.g:2427:3: this_InvocationExpression_3= ruleInvocationExpression
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
                    // InternalKerMLExpressions.g:2436:3: this_ExpressionBody_4= ruleExpressionBody
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
                    // InternalKerMLExpressions.g:2445:3: (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' )
                    {
                    // InternalKerMLExpressions.g:2445:3: (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' )
                    // InternalKerMLExpressions.g:2446:4: otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_SequenceExpression_6=ruleSequenceExpression();

                    state._fsp--;


                    				current = this_SequenceExpression_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,56,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2467:1: entryRuleExpressionBody returns [EObject current=null] : iv_ruleExpressionBody= ruleExpressionBody EOF ;
    public final EObject entryRuleExpressionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBody = null;


        try {
            // InternalKerMLExpressions.g:2467:55: (iv_ruleExpressionBody= ruleExpressionBody EOF )
            // InternalKerMLExpressions.g:2468:2: iv_ruleExpressionBody= ruleExpressionBody EOF
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
    // InternalKerMLExpressions.g:2474:1: ruleExpressionBody returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) ;
    public final EObject ruleExpressionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2480:2: ( (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) )
            // InternalKerMLExpressions.g:2481:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            {
            // InternalKerMLExpressions.g:2481:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            // InternalKerMLExpressions.g:2482:3: otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalKerMLExpressions.g:2486:3: ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==60) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2487:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';'
            	    {
            	    // InternalKerMLExpressions.g:2487:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) )
            	    // InternalKerMLExpressions.g:2488:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    {
            	    // InternalKerMLExpressions.g:2488:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    // InternalKerMLExpressions.g:2489:6: lv_ownedRelationship_1_0= ruleBodyParameterMember
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_29);
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

            	    otherlv_2=(Token)match(input,58,FOLLOW_28); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionBodyAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalKerMLExpressions.g:2511:3: ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) )
            // InternalKerMLExpressions.g:2512:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            {
            // InternalKerMLExpressions.g:2512:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            // InternalKerMLExpressions.g:2513:5: lv_ownedRelationship_3_0= ruleResultExpressionMember
            {

            					newCompositeNode(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipResultExpressionMemberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_4=(Token)match(input,59,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2538:1: entryRuleResultExpressionMember returns [EObject current=null] : iv_ruleResultExpressionMember= ruleResultExpressionMember EOF ;
    public final EObject entryRuleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:2538:63: (iv_ruleResultExpressionMember= ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:2539:2: iv_ruleResultExpressionMember= ruleResultExpressionMember EOF
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
    // InternalKerMLExpressions.g:2545:1: ruleResultExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2551:2: ( ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:2552:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:2552:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:2553:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:2553:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:2554:4: lv_ownedRelatedElement_0_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:2574:1: entryRuleBodyParameterMember returns [EObject current=null] : iv_ruleBodyParameterMember= ruleBodyParameterMember EOF ;
    public final EObject entryRuleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameterMember = null;


        try {
            // InternalKerMLExpressions.g:2574:60: (iv_ruleBodyParameterMember= ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:2575:2: iv_ruleBodyParameterMember= ruleBodyParameterMember EOF
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
    // InternalKerMLExpressions.g:2581:1: ruleBodyParameterMember returns [EObject current=null] : (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) ) ;
    public final EObject ruleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_memberName_1_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2587:2: ( (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) ) )
            // InternalKerMLExpressions.g:2588:2: (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) )
            {
            // InternalKerMLExpressions.g:2588:2: (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) )
            // InternalKerMLExpressions.g:2589:3: otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBodyParameterMemberAccess().getInKeyword_0());
            		
            // InternalKerMLExpressions.g:2593:3: ( (lv_memberName_1_0= ruleName ) )
            // InternalKerMLExpressions.g:2594:4: (lv_memberName_1_0= ruleName )
            {
            // InternalKerMLExpressions.g:2594:4: (lv_memberName_1_0= ruleName )
            // InternalKerMLExpressions.g:2595:5: lv_memberName_1_0= ruleName
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

            // InternalKerMLExpressions.g:2612:3: ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) )
            // InternalKerMLExpressions.g:2613:4: (lv_ownedRelatedElement_2_0= ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:2613:4: (lv_ownedRelatedElement_2_0= ruleBodyParameter )
            // InternalKerMLExpressions.g:2614:5: lv_ownedRelatedElement_2_0= ruleBodyParameter
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
    // InternalKerMLExpressions.g:2635:1: entryRuleBodyParameter returns [EObject current=null] : iv_ruleBodyParameter= ruleBodyParameter EOF ;
    public final EObject entryRuleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameter = null;


        try {
            // InternalKerMLExpressions.g:2635:54: (iv_ruleBodyParameter= ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:2636:2: iv_ruleBodyParameter= ruleBodyParameter EOF
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
    // InternalKerMLExpressions.g:2642:1: ruleBodyParameter returns [EObject current=null] : () ;
    public final EObject ruleBodyParameter() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2648:2: ( () )
            // InternalKerMLExpressions.g:2649:2: ()
            {
            // InternalKerMLExpressions.g:2649:2: ()
            // InternalKerMLExpressions.g:2650:3: 
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
    // InternalKerMLExpressions.g:2659:1: entryRuleSequenceExpression returns [EObject current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final EObject entryRuleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2659:59: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:2660:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
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
    // InternalKerMLExpressions.g:2666:1: ruleSequenceExpression returns [EObject current=null] : (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) ;
    public final EObject ruleSequenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operator_3_0=null;
        EObject this_OwnedExpression_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2672:2: ( (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) )
            // InternalKerMLExpressions.g:2673:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            {
            // InternalKerMLExpressions.g:2673:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            // InternalKerMLExpressions.g:2674:3: this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            			current = this_OwnedExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2682:3: (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==61) ) {
                int LA33_1 = input.LA(2);

                if ( ((LA33_1>=RULE_STRING_VALUE && LA33_1<=RULE_UNRESTRICTED_NAME)||LA33_1==15||(LA33_1>=31 && LA33_1<=34)||(LA33_1>=40 && LA33_1<=42)||(LA33_1>=47 && LA33_1<=50)||(LA33_1>=54 && LA33_1<=55)||LA33_1==57||(LA33_1>=63 && LA33_1<=65)) ) {
                    alt33=2;
                }
                else if ( (LA33_1==EOF||LA33_1==52||LA33_1==56) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalKerMLExpressions.g:2683:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2688:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:2688:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    // InternalKerMLExpressions.g:2689:5: () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) )
                    {
                    // InternalKerMLExpressions.g:2689:5: ()
                    // InternalKerMLExpressions.g:2690:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalKerMLExpressions.g:2696:5: ( (lv_operator_3_0= ',' ) )
                    // InternalKerMLExpressions.g:2697:6: (lv_operator_3_0= ',' )
                    {
                    // InternalKerMLExpressions.g:2697:6: (lv_operator_3_0= ',' )
                    // InternalKerMLExpressions.g:2698:7: lv_operator_3_0= ','
                    {
                    lv_operator_3_0=(Token)match(input,61,FOLLOW_4); 

                    							newLeafNode(lv_operator_3_0, grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSequenceExpressionRule());
                    							}
                    							setWithLastConsumed(current, "operator", lv_operator_3_0, ",");
                    						

                    }


                    }

                    // InternalKerMLExpressions.g:2710:5: ( (lv_operand_4_0= ruleSequenceExpression ) )
                    // InternalKerMLExpressions.g:2711:6: (lv_operand_4_0= ruleSequenceExpression )
                    {
                    // InternalKerMLExpressions.g:2711:6: (lv_operand_4_0= ruleSequenceExpression )
                    // InternalKerMLExpressions.g:2712:7: lv_operand_4_0= ruleSequenceExpression
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
    // InternalKerMLExpressions.g:2735:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2735:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:2736:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
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
    // InternalKerMLExpressions.g:2742:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2748:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) )
            // InternalKerMLExpressions.g:2749:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            {
            // InternalKerMLExpressions.g:2749:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:2750:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:2750:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:2751:4: lv_ownedRelationship_0_0= ruleFeatureReferenceMember
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
    // InternalKerMLExpressions.g:2771:1: entryRuleFeatureReferenceMember returns [EObject current=null] : iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF ;
    public final EObject entryRuleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2771:63: (iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:2772:2: iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF
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
    // InternalKerMLExpressions.g:2778:1: ruleFeatureReferenceMember returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2784:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:2785:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:2785:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:2786:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:2786:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:2787:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:2804:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLExpressions.g:2804:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:2805:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
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
    // InternalKerMLExpressions.g:2811:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;

        EObject this_ArgumentList_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2817:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) )
            // InternalKerMLExpressions.g:2818:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            {
            // InternalKerMLExpressions.g:2818:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            // InternalKerMLExpressions.g:2819:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current]
            {
            // InternalKerMLExpressions.g:2819:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:2820:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:2820:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:2821:5: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
            {

            					newCompositeNode(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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
    // InternalKerMLExpressions.g:2853:1: entryRuleOwnedFeatureTyping returns [EObject current=null] : iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF ;
    public final EObject entryRuleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureTyping = null;


        try {
            // InternalKerMLExpressions.g:2853:59: (iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:2854:2: iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF
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
    // InternalKerMLExpressions.g:2860:1: ruleOwnedFeatureTyping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleFeatureChain ) ) ) ;
    public final EObject ruleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2866:2: ( ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleFeatureChain ) ) ) )
            // InternalKerMLExpressions.g:2867:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleFeatureChain ) ) )
            {
            // InternalKerMLExpressions.g:2867:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleFeatureChain ) ) )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalKerMLExpressions.g:2868:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalKerMLExpressions.g:2868:3: ( ( ruleQualifiedName ) )
                    // InternalKerMLExpressions.g:2869:4: ( ruleQualifiedName )
                    {
                    // InternalKerMLExpressions.g:2869:4: ( ruleQualifiedName )
                    // InternalKerMLExpressions.g:2870:5: ruleQualifiedName
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
                    // InternalKerMLExpressions.g:2885:3: ( (lv_ownedRelatedElement_1_0= ruleFeatureChain ) )
                    {
                    // InternalKerMLExpressions.g:2885:3: ( (lv_ownedRelatedElement_1_0= ruleFeatureChain ) )
                    // InternalKerMLExpressions.g:2886:4: (lv_ownedRelatedElement_1_0= ruleFeatureChain )
                    {
                    // InternalKerMLExpressions.g:2886:4: (lv_ownedRelatedElement_1_0= ruleFeatureChain )
                    // InternalKerMLExpressions.g:2887:5: lv_ownedRelatedElement_1_0= ruleFeatureChain
                    {

                    					newCompositeNode(grammarAccess.getOwnedFeatureTypingAccess().getOwnedRelatedElementFeatureChainParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_1_0=ruleFeatureChain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOwnedFeatureTypingRule());
                    					}
                    					add(
                    						current,
                    						"ownedRelatedElement",
                    						lv_ownedRelatedElement_1_0,
                    						"org.omg.kerml.expressions.xtext.KerMLExpressions.FeatureChain");
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


    // $ANTLR start "entryRuleFeatureChain"
    // InternalKerMLExpressions.g:2908:1: entryRuleFeatureChain returns [EObject current=null] : iv_ruleFeatureChain= ruleFeatureChain EOF ;
    public final EObject entryRuleFeatureChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureChain = null;


        try {
            // InternalKerMLExpressions.g:2908:53: (iv_ruleFeatureChain= ruleFeatureChain EOF )
            // InternalKerMLExpressions.g:2909:2: iv_ruleFeatureChain= ruleFeatureChain EOF
            {
             newCompositeNode(grammarAccess.getFeatureChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureChain=ruleFeatureChain();

            state._fsp--;

             current =iv_ruleFeatureChain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureChain"


    // $ANTLR start "ruleFeatureChain"
    // InternalKerMLExpressions.g:2915:1: ruleFeatureChain returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ ) ;
    public final EObject ruleFeatureChain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2921:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ ) )
            // InternalKerMLExpressions.g:2922:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ )
            {
            // InternalKerMLExpressions.g:2922:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ )
            // InternalKerMLExpressions.g:2923:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+
            {
            // InternalKerMLExpressions.g:2923:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) )
            // InternalKerMLExpressions.g:2924:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining )
            {
            // InternalKerMLExpressions.g:2924:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining )
            // InternalKerMLExpressions.g:2925:5: lv_ownedRelationship_0_0= ruleOwnedFeatureChaining
            {

            					newCompositeNode(grammarAccess.getFeatureChainAccess().getOwnedRelationshipOwnedFeatureChainingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalKerMLExpressions.g:2942:3: (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==54) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2943:4: otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) )
            	    {
            	    otherlv_1=(Token)match(input,54,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFeatureChainAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:2947:4: ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) )
            	    // InternalKerMLExpressions.g:2948:5: (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining )
            	    {
            	    // InternalKerMLExpressions.g:2948:5: (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining )
            	    // InternalKerMLExpressions.g:2949:6: lv_ownedRelationship_2_0= ruleOwnedFeatureChaining
            	    {

            	    						newCompositeNode(grammarAccess.getFeatureChainAccess().getOwnedRelationshipOwnedFeatureChainingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // InternalKerMLExpressions.g:2971:1: entryRuleOwnedFeatureChaining returns [EObject current=null] : iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF ;
    public final EObject entryRuleOwnedFeatureChaining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureChaining = null;


        try {
            // InternalKerMLExpressions.g:2971:61: (iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF )
            // InternalKerMLExpressions.g:2972:2: iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF
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
    // InternalKerMLExpressions.g:2978:1: ruleOwnedFeatureChaining returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleOwnedFeatureChaining() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2984:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:2985:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:2985:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:2986:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:2986:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:2987:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:3005:1: ruleArgumentList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_PositionalArgumentList_1 = null;

        EObject this_NamedArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3011:2: ( (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) )
            // InternalKerMLExpressions.g:3012:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            {
            // InternalKerMLExpressions.g:3012:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            // InternalKerMLExpressions.g:3013:3: otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalKerMLExpressions.g:3017:3: (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )?
            int alt36=3;
            switch ( input.LA(1) ) {
                case RULE_STRING_VALUE:
                case RULE_DECIMAL_VALUE:
                case RULE_EXP_VALUE:
                case 15:
                case 31:
                case 32:
                case 33:
                case 34:
                case 40:
                case 41:
                case 42:
                case 47:
                case 48:
                case 49:
                case 50:
                case 54:
                case 55:
                case 57:
                case 63:
                case 64:
                case 65:
                    {
                    alt36=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA36_2 = input.LA(2);

                    if ( ((LA36_2>=17 && LA36_2<=46)||LA36_2==51||(LA36_2>=53 && LA36_2<=56)||LA36_2==61||LA36_2==66) ) {
                        alt36=1;
                    }
                    else if ( (LA36_2==62) ) {
                        alt36=2;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (LA36_3==62) ) {
                        alt36=2;
                    }
                    else if ( ((LA36_3>=17 && LA36_3<=46)||LA36_3==51||(LA36_3>=53 && LA36_3<=56)||LA36_3==61||LA36_3==66) ) {
                        alt36=1;
                    }
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // InternalKerMLExpressions.g:3018:4: this_PositionalArgumentList_1= rulePositionalArgumentList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getArgumentListRule());
                    				}
                    				newCompositeNode(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_27);
                    this_PositionalArgumentList_1=rulePositionalArgumentList(current);

                    state._fsp--;


                    				current = this_PositionalArgumentList_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3030:4: this_NamedArgumentList_2= ruleNamedArgumentList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getArgumentListRule());
                    				}
                    				newCompositeNode(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_NamedArgumentList_2=ruleNamedArgumentList(current);

                    state._fsp--;


                    				current = this_NamedArgumentList_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3051:1: rulePositionalArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* ) ;
    public final EObject rulePositionalArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3057:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:3058:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:3058:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:3059:3: ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:3059:3: ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:3060:4: (lv_ownedRelationship_0_0= ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:3060:4: (lv_ownedRelationship_0_0= ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:3061:5: lv_ownedRelationship_0_0= ruleOwnedExpressionMember
            {

            					newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalKerMLExpressions.g:3078:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==61) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3079:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,61,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:3083:4: ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) )
            	    // InternalKerMLExpressions.g:3084:5: (lv_ownedRelationship_2_0= ruleOwnedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:3084:5: (lv_ownedRelationship_2_0= ruleOwnedExpressionMember )
            	    // InternalKerMLExpressions.g:3085:6: lv_ownedRelationship_2_0= ruleOwnedExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "rulePositionalArgumentList"


    // $ANTLR start "ruleNamedArgumentList"
    // InternalKerMLExpressions.g:3108:1: ruleNamedArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) ;
    public final EObject ruleNamedArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3114:2: ( ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:3115:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:3115:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:3116:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:3116:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:3117:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:3117:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:3118:5: lv_ownedRelationship_0_0= ruleNamedExpressionMember
            {

            					newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalKerMLExpressions.g:3135:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==61) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3136:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,61,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:3140:4: ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    // InternalKerMLExpressions.g:3141:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:3141:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    // InternalKerMLExpressions.g:3142:6: lv_ownedRelationship_2_0= ruleNamedExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "ruleNamedArgumentList"


    // $ANTLR start "entryRuleNamedExpressionMember"
    // InternalKerMLExpressions.g:3164:1: entryRuleNamedExpressionMember returns [EObject current=null] : iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF ;
    public final EObject entryRuleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:3164:62: (iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF )
            // InternalKerMLExpressions.g:3165:2: iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF
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
    // InternalKerMLExpressions.g:3171:1: ruleNamedExpressionMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) ) ;
    public final EObject ruleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3177:2: ( ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) ) )
            // InternalKerMLExpressions.g:3178:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) )
            {
            // InternalKerMLExpressions.g:3178:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:3179:3: ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:3179:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalKerMLExpressions.g:3180:4: (lv_memberName_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:3180:4: (lv_memberName_0_0= ruleName )
            // InternalKerMLExpressions.g:3181:5: lv_memberName_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_1=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedExpressionMemberAccess().getEqualsSignKeyword_1());
            		
            // InternalKerMLExpressions.g:3202:3: ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:3203:4: (lv_ownedRelatedElement_2_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:3203:4: (lv_ownedRelatedElement_2_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:3204:5: lv_ownedRelatedElement_2_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:3225:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalKerMLExpressions.g:3225:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLExpressions.g:3226:2: iv_ruleNullExpression= ruleNullExpression EOF
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
    // InternalKerMLExpressions.g:3232:1: ruleNullExpression returns [EObject current=null] : ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3238:2: ( ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) )
            // InternalKerMLExpressions.g:3239:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            {
            // InternalKerMLExpressions.g:3239:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            // InternalKerMLExpressions.g:3240:3: () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            {
            // InternalKerMLExpressions.g:3240:3: ()
            // InternalKerMLExpressions.g:3241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
            					current);
            			

            }

            // InternalKerMLExpressions.g:3247:3: (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==63) ) {
                alt39=1;
            }
            else if ( (LA39_0==55) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalKerMLExpressions.g:3248:4: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3253:4: (otherlv_2= '(' otherlv_3= ')' )
                    {
                    // InternalKerMLExpressions.g:3253:4: (otherlv_2= '(' otherlv_3= ')' )
                    // InternalKerMLExpressions.g:3254:5: otherlv_2= '(' otherlv_3= ')'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_27); 

                    					newLeafNode(otherlv_2, grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,56,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3268:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLExpressions.g:3268:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:3269:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalKerMLExpressions.g:3275:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralInteger_2 = null;

        EObject this_LiteralReal_3 = null;

        EObject this_LiteralInfinity_4 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3281:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) )
            // InternalKerMLExpressions.g:3282:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            {
            // InternalKerMLExpressions.g:3282:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 64:
            case 65:
                {
                alt40=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt40=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA40_3 = input.LA(2);

                if ( (LA40_3==EOF||LA40_3==14||(LA40_3>=16 && LA40_3<=46)||(LA40_3>=51 && LA40_3<=53)||LA40_3==56||LA40_3==59||LA40_3==61) ) {
                    alt40=3;
                }
                else if ( (LA40_3==54) ) {
                    int LA40_7 = input.LA(3);

                    if ( ((LA40_7>=RULE_DECIMAL_VALUE && LA40_7<=RULE_EXP_VALUE)) ) {
                        alt40=4;
                    }
                    else if ( ((LA40_7>=RULE_ID && LA40_7<=RULE_UNRESTRICTED_NAME)||LA40_7==57) ) {
                        alt40=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 54:
                {
                alt40=4;
                }
                break;
            case 42:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalKerMLExpressions.g:3283:3: this_LiteralBoolean_0= ruleLiteralBoolean
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
                    // InternalKerMLExpressions.g:3292:3: this_LiteralString_1= ruleLiteralString
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
                    // InternalKerMLExpressions.g:3301:3: this_LiteralInteger_2= ruleLiteralInteger
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
                    // InternalKerMLExpressions.g:3310:3: this_LiteralReal_3= ruleLiteralReal
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
                    // InternalKerMLExpressions.g:3319:3: this_LiteralInfinity_4= ruleLiteralInfinity
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
    // InternalKerMLExpressions.g:3331:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLExpressions.g:3331:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:3332:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
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
    // InternalKerMLExpressions.g:3338:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3344:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalKerMLExpressions.g:3345:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalKerMLExpressions.g:3345:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalKerMLExpressions.g:3346:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:3346:3: (lv_value_0_0= ruleBooleanValue )
            // InternalKerMLExpressions.g:3347:4: lv_value_0_0= ruleBooleanValue
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
    // InternalKerMLExpressions.g:3367:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLExpressions.g:3367:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:3368:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalKerMLExpressions.g:3374:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3380:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLExpressions.g:3381:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLExpressions.g:3381:2: (kw= 'true' | kw= 'false' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==64) ) {
                alt41=1;
            }
            else if ( (LA41_0==65) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalKerMLExpressions.g:3382:3: kw= 'true'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3388:3: kw= 'false'
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
    // InternalKerMLExpressions.g:3397:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // InternalKerMLExpressions.g:3397:54: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLExpressions.g:3398:2: iv_ruleLiteralString= ruleLiteralString EOF
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
    // InternalKerMLExpressions.g:3404:1: ruleLiteralString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3410:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalKerMLExpressions.g:3411:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalKerMLExpressions.g:3411:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:3412:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:3412:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:3413:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalKerMLExpressions.g:3432:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLExpressions.g:3432:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:3433:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
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
    // InternalKerMLExpressions.g:3439:1: ruleLiteralInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3445:2: ( ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) )
            // InternalKerMLExpressions.g:3446:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            {
            // InternalKerMLExpressions.g:3446:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:3447:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:3447:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:3448:4: lv_value_0_0= RULE_DECIMAL_VALUE
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
    // InternalKerMLExpressions.g:3467:1: entryRuleLiteralReal returns [EObject current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final EObject entryRuleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralReal = null;


        try {
            // InternalKerMLExpressions.g:3467:52: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:3468:2: iv_ruleLiteralReal= ruleLiteralReal EOF
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
    // InternalKerMLExpressions.g:3474:1: ruleLiteralReal returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleLiteralReal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3480:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalKerMLExpressions.g:3481:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalKerMLExpressions.g:3481:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalKerMLExpressions.g:3482:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalKerMLExpressions.g:3482:3: (lv_value_0_0= ruleRealValue )
            // InternalKerMLExpressions.g:3483:4: lv_value_0_0= ruleRealValue
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
    // InternalKerMLExpressions.g:3503:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLExpressions.g:3503:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLExpressions.g:3504:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalKerMLExpressions.g:3510:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3516:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLExpressions.g:3517:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLExpressions.g:3517:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DECIMAL_VALUE||LA44_0==54) ) {
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
                    // InternalKerMLExpressions.g:3518:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLExpressions.g:3518:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLExpressions.g:3519:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:3519:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_DECIMAL_VALUE) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalKerMLExpressions.g:3520:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_32); 

                            					current.merge(this_DECIMAL_VALUE_0);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,54,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalKerMLExpressions.g:3533:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_DECIMAL_VALUE) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_EXP_VALUE) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalKerMLExpressions.g:3534:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

                            					current.merge(this_DECIMAL_VALUE_2);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLExpressions.g:3542:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalKerMLExpressions.g:3552:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalKerMLExpressions.g:3563:1: entryRuleLiteralInfinity returns [EObject current=null] : iv_ruleLiteralInfinity= ruleLiteralInfinity EOF ;
    public final EObject entryRuleLiteralInfinity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInfinity = null;


        try {
            // InternalKerMLExpressions.g:3563:56: (iv_ruleLiteralInfinity= ruleLiteralInfinity EOF )
            // InternalKerMLExpressions.g:3564:2: iv_ruleLiteralInfinity= ruleLiteralInfinity EOF
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
    // InternalKerMLExpressions.g:3570:1: ruleLiteralInfinity returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleLiteralInfinity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3576:2: ( ( () otherlv_1= '*' ) )
            // InternalKerMLExpressions.g:3577:2: ( () otherlv_1= '*' )
            {
            // InternalKerMLExpressions.g:3577:2: ( () otherlv_1= '*' )
            // InternalKerMLExpressions.g:3578:3: () otherlv_1= '*'
            {
            // InternalKerMLExpressions.g:3578:3: ()
            // InternalKerMLExpressions.g:3579:4: 
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
    // InternalKerMLExpressions.g:3593:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLExpressions.g:3593:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLExpressions.g:3594:2: iv_ruleName= ruleName EOF
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
    // InternalKerMLExpressions.g:3600:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3606:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLExpressions.g:3607:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLExpressions.g:3607:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_UNRESTRICTED_NAME) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalKerMLExpressions.g:3608:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3616:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalKerMLExpressions.g:3627:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalKerMLExpressions.g:3627:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalKerMLExpressions.g:3628:2: iv_ruleQualification= ruleQualification EOF
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
    // InternalKerMLExpressions.g:3634:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3640:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalKerMLExpressions.g:3641:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalKerMLExpressions.g:3641:2: (this_Name_0= ruleName kw= '::' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==66) ) {
                        alt46=1;
                    }


                }
                else if ( (LA46_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA46_3 = input.LA(2);

                    if ( (LA46_3==66) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3642:3: this_Name_0= ruleName kw= '::'
            	    {

            	    			newCompositeNode(grammarAccess.getQualificationAccess().getNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_37);
            	    this_Name_0=ruleName();

            	    state._fsp--;


            	    			current.merge(this_Name_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,66,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualificationAccess().getColonColonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // InternalKerMLExpressions.g:3661:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:3661:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:3662:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalKerMLExpressions.g:3668:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3674:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalKerMLExpressions.g:3675:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalKerMLExpressions.g:3675:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalKerMLExpressions.g:3676:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalKerMLExpressions.g:3676:3: (this_Qualification_0= ruleQualification )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==66) ) {
                    alt47=1;
                }
            }
            else if ( (LA47_0==RULE_UNRESTRICTED_NAME) ) {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==66) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalKerMLExpressions.g:3677:4: this_Qualification_0= ruleQualification
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
    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\4\uffff\2\12\6\uffff\2\12\1\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\4\1\uffff\2\16\2\uffff\2\7\2\uffff\2\16\1\7";
    static final String dfa_4s = "\1\101\1\uffff\1\101\1\uffff\2\102\2\uffff\1\10\1\71\2\uffff\2\102\1\10";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\5\1\6\2\uffff\1\3\1\4\3\uffff";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\3\3\1\4\1\5\41\uffff\1\3\13\uffff\1\3\1\2\1\uffff\1\6\5\uffff\1\1\2\3",
            "",
            "\5\7\6\uffff\1\7\17\uffff\4\7\5\uffff\3\7\4\uffff\4\7\3\uffff\2\7\1\1\1\7\5\uffff\3\7",
            "",
            "\1\12\1\uffff\37\12\4\uffff\3\12\1\11\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\10",
            "\1\12\1\uffff\37\12\4\uffff\3\12\1\11\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\10",
            "",
            "",
            "\1\4\1\5",
            "\1\14\1\15\60\uffff\1\12",
            "",
            "",
            "\1\12\1\uffff\37\12\4\uffff\3\12\1\11\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\16",
            "\1\12\1\uffff\37\12\4\uffff\3\12\1\11\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\16",
            "\1\14\1\15"
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
            return "2399:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )";
        }
    }
    static final String dfa_8s = "\6\uffff";
    static final String dfa_9s = "\1\uffff\2\4\3\uffff";
    static final String dfa_10s = "\1\7\2\66\2\uffff\1\7";
    static final String dfa_11s = "\1\10\2\102\2\uffff\1\10";
    static final String dfa_12s = "\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_13s = "\6\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\2",
            "\1\3\1\4\12\uffff\1\5",
            "\1\3\1\4\12\uffff\1\5",
            "",
            "",
            "\1\1\1\2"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2867:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleFeatureChain ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x82C78700000081F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x82C78700000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0068000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0280000000000180L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x92C78700000081F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x83C78700000081F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000182L});

}