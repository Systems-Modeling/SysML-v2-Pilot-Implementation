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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKerMLExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_VALUE", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_DOCUMENTATION_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "':'", "'?'", "'??'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'instanceof'", "'hastype'", "'istype'", "'@'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'@['", "']'", "'!'", "'~'", "'all'", "'.'", "'allInstances'", "'('", "')'", "'['", "'->'", "'{'", "'}'", "','", "'..'", "'=>'", "'null'", "'true'", "'false'", "'::'"
    };
    public static final int T__50=50;
    public static final int RULE_SL_NOTE=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=10;
    public static final int T__54=54;
    public static final int RULE_ID=7;
    public static final int RULE_DECIMAL_VALUE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=11;
    public static final int T__20=20;
    public static final int T__21=21;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOwnedExpressionMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOwnedExpressionMember=ruleOwnedExpressionMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOwnedExpressionMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:71:1: ruleOwnedExpressionMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleOwnedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:77:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:78:2: ( (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:78:2: ( (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:79:3: (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:79:3: (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:80:4: lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOwnedExpressionMemberAccess().getOwnedMemberFeature_compOwnedExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberFeature_comp_0_0=ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getOwnedExpressionMemberRule());
              				}
              				set(
              					current,
              					"ownedMemberFeature_comp",
              					lv_ownedMemberFeature_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOwnedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOwnedExpression=ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOwnedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getOwnedExpressionAccess().getConditionalExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ConditionalExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:132:1: ruleConditionalExpression returns [EObject current=null] : (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NullCoalescingExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;

        EObject lv_operand_comp_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:138:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )? ) )
            // InternalKerMLExpressions.g:139:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )? )
            {
            // InternalKerMLExpressions.g:139:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )? )
            // InternalKerMLExpressions.g:140:3: this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_3);
            this_NullCoalescingExpression_0=ruleNullCoalescingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NullCoalescingExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:148:3: ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKerMLExpressions.g:149:4: () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) )
                    {
                    // InternalKerMLExpressions.g:149:4: ()
                    // InternalKerMLExpressions.g:150:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:156:4: ( (lv_operator_2_0= ruleConditionalTestOperator ) )
                    // InternalKerMLExpressions.g:157:5: (lv_operator_2_0= ruleConditionalTestOperator )
                    {
                    // InternalKerMLExpressions.g:157:5: (lv_operator_2_0= ruleConditionalTestOperator )
                    // InternalKerMLExpressions.g:158:6: lv_operator_2_0= ruleConditionalTestOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalTestOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_operator_2_0=ruleConditionalTestOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalTestOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKerMLExpressions.g:175:4: ( (lv_operand_comp_3_0= ruleOwnedExpression ) )
                    // InternalKerMLExpressions.g:176:5: (lv_operand_comp_3_0= ruleOwnedExpression )
                    {
                    // InternalKerMLExpressions.g:176:5: (lv_operand_comp_3_0= ruleOwnedExpression )
                    // InternalKerMLExpressions.g:177:6: lv_operand_comp_3_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_operand_comp_3_0=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"operand_comp",
                      							lv_operand_comp_3_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                      			
                    }
                    // InternalKerMLExpressions.g:198:4: ( (lv_operand_comp_5_0= ruleConditionalExpression ) )
                    // InternalKerMLExpressions.g:199:5: (lv_operand_comp_5_0= ruleConditionalExpression )
                    {
                    // InternalKerMLExpressions.g:199:5: (lv_operand_comp_5_0= ruleConditionalExpression )
                    // InternalKerMLExpressions.g:200:6: lv_operand_comp_5_0= ruleConditionalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperand_compConditionalExpressionParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_comp_5_0=ruleConditionalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"operand_comp",
                      							lv_operand_comp_5_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleConditionalTestOperator"
    // InternalKerMLExpressions.g:222:1: entryRuleConditionalTestOperator returns [String current=null] : iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF ;
    public final String entryRuleConditionalTestOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalTestOperator = null;


        try {
            // InternalKerMLExpressions.g:222:63: (iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF )
            // InternalKerMLExpressions.g:223:2: iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalTestOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalTestOperator=ruleConditionalTestOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalTestOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalTestOperator"


    // $ANTLR start "ruleConditionalTestOperator"
    // InternalKerMLExpressions.g:229:1: ruleConditionalTestOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken ruleConditionalTestOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:235:2: (kw= '?' )
            // InternalKerMLExpressions.g:236:2: kw= '?'
            {
            kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getConditionalTestOperatorAccess().getQuestionMarkKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalTestOperator"


    // $ANTLR start "entryRuleNullCoalescingExpression"
    // InternalKerMLExpressions.g:244:1: entryRuleNullCoalescingExpression returns [EObject current=null] : iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF ;
    public final EObject entryRuleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCoalescingExpression = null;


        try {
            // InternalKerMLExpressions.g:244:65: (iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF )
            // InternalKerMLExpressions.g:245:2: iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCoalescingExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullCoalescingExpression=ruleNullCoalescingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCoalescingExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:251:1: ruleNullCoalescingExpression returns [EObject current=null] : (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )* ) ;
    public final EObject ruleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalOrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:257:2: ( (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )* ) )
            // InternalKerMLExpressions.g:258:2: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:258:2: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )* )
            // InternalKerMLExpressions.g:259:3: this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getConditionalOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_ConditionalOrExpression_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConditionalOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:267:3: ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKerMLExpressions.g:268:4: () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:268:4: ()
            	    // InternalKerMLExpressions.g:269:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:275:4: ( (lv_operator_2_0= ruleNullCoalescingOperator ) )
            	    // InternalKerMLExpressions.g:276:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    {
            	    // InternalKerMLExpressions.g:276:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    // InternalKerMLExpressions.g:277:6: lv_operator_2_0= ruleNullCoalescingOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperatorNullCoalescingOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleNullCoalescingOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:294:4: ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) )
            	    // InternalKerMLExpressions.g:295:5: (lv_operand_comp_3_0= ruleConditionalOrExpression )
            	    {
            	    // InternalKerMLExpressions.g:295:5: (lv_operand_comp_3_0= ruleConditionalOrExpression )
            	    // InternalKerMLExpressions.g:296:6: lv_operand_comp_3_0= ruleConditionalOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperand_compConditionalOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_operand_comp_3_0=ruleConditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNullCoalescingExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalOrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:318:1: entryRuleNullCoalescingOperator returns [String current=null] : iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF ;
    public final String entryRuleNullCoalescingOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullCoalescingOperator = null;


        try {
            // InternalKerMLExpressions.g:318:62: (iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF )
            // InternalKerMLExpressions.g:319:2: iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCoalescingOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullCoalescingOperator=ruleNullCoalescingOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCoalescingOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:325:1: ruleNullCoalescingOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '??' ;
    public final AntlrDatatypeRuleToken ruleNullCoalescingOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:331:2: (kw= '??' )
            // InternalKerMLExpressions.g:332:2: kw= '??'
            {
            kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getNullCoalescingOperatorAccess().getQuestionMarkQuestionMarkKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleConditionalOrExpression"
    // InternalKerMLExpressions.g:340:1: entryRuleConditionalOrExpression returns [EObject current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
    public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOrExpression = null;


        try {
            // InternalKerMLExpressions.g:340:64: (iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF )
            // InternalKerMLExpressions.g:341:2: iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOrExpression=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalOrExpression"


    // $ANTLR start "ruleConditionalOrExpression"
    // InternalKerMLExpressions.g:347:1: ruleConditionalOrExpression returns [EObject current=null] : (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )* ) ;
    public final EObject ruleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalAndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:353:2: ( (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:354:2: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:354:2: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )* )
            // InternalKerMLExpressions.g:355:3: this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_ConditionalAndExpression_0=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConditionalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:363:3: ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKerMLExpressions.g:364:4: () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:364:4: ()
            	    // InternalKerMLExpressions.g:365:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getConditionalOrExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:371:4: ( (lv_operator_2_0= ruleConditionalOrOperator ) )
            	    // InternalKerMLExpressions.g:372:5: (lv_operator_2_0= ruleConditionalOrOperator )
            	    {
            	    // InternalKerMLExpressions.g:372:5: (lv_operator_2_0= ruleConditionalOrOperator )
            	    // InternalKerMLExpressions.g:373:6: lv_operator_2_0= ruleConditionalOrOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getOperatorConditionalOrOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleConditionalOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalOrOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalKerMLExpressions.g:390:4: ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) )
            	    // InternalKerMLExpressions.g:391:5: (lv_operand_comp_3_0= ruleConditionalAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:391:5: (lv_operand_comp_3_0= ruleConditionalAndExpression )
            	    // InternalKerMLExpressions.g:392:6: lv_operand_comp_3_0= ruleConditionalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getOperand_compConditionalAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_operand_comp_3_0=ruleConditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalOrExpression"


    // $ANTLR start "entryRuleConditionalOrOperator"
    // InternalKerMLExpressions.g:414:1: entryRuleConditionalOrOperator returns [String current=null] : iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF ;
    public final String entryRuleConditionalOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOrOperator = null;


        try {
            // InternalKerMLExpressions.g:414:61: (iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF )
            // InternalKerMLExpressions.g:415:2: iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOrOperator=ruleConditionalOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalOrOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:421:1: ruleConditionalOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleConditionalOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:427:2: (kw= '||' )
            // InternalKerMLExpressions.g:428:2: kw= '||'
            {
            kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getConditionalOrOperatorAccess().getVerticalLineVerticalLineKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleConditionalAndExpression"
    // InternalKerMLExpressions.g:436:1: entryRuleConditionalAndExpression returns [EObject current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
    public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAndExpression = null;


        try {
            // InternalKerMLExpressions.g:436:65: (iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF )
            // InternalKerMLExpressions.g:437:2: iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAndExpression=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalAndExpression"


    // $ANTLR start "ruleConditionalAndExpression"
    // InternalKerMLExpressions.g:443:1: ruleConditionalAndExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:449:2: ( (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )* ) )
            // InternalKerMLExpressions.g:450:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:450:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )* )
            // InternalKerMLExpressions.g:451:3: this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:459:3: ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKerMLExpressions.g:460:4: () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:460:4: ()
            	    // InternalKerMLExpressions.g:461:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getConditionalAndExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:467:4: ( (lv_operator_2_0= ruleConditionalAndOperator ) )
            	    // InternalKerMLExpressions.g:468:5: (lv_operator_2_0= ruleConditionalAndOperator )
            	    {
            	    // InternalKerMLExpressions.g:468:5: (lv_operator_2_0= ruleConditionalAndOperator )
            	    // InternalKerMLExpressions.g:469:6: lv_operator_2_0= ruleConditionalAndOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getOperatorConditionalAndOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleConditionalAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ConditionalAndOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalKerMLExpressions.g:486:4: ( (lv_operand_comp_3_0= ruleOrExpression ) )
            	    // InternalKerMLExpressions.g:487:5: (lv_operand_comp_3_0= ruleOrExpression )
            	    {
            	    // InternalKerMLExpressions.g:487:5: (lv_operand_comp_3_0= ruleOrExpression )
            	    // InternalKerMLExpressions.g:488:6: lv_operand_comp_3_0= ruleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getOperand_compOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_operand_comp_3_0=ruleOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.OrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalAndExpression"


    // $ANTLR start "entryRuleConditionalAndOperator"
    // InternalKerMLExpressions.g:510:1: entryRuleConditionalAndOperator returns [String current=null] : iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF ;
    public final String entryRuleConditionalAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalAndOperator = null;


        try {
            // InternalKerMLExpressions.g:510:62: (iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF )
            // InternalKerMLExpressions.g:511:2: iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalAndOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAndOperator=ruleConditionalAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalAndOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:517:1: ruleConditionalAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleConditionalAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:523:2: (kw= '&&' )
            // InternalKerMLExpressions.g:524:2: kw= '&&'
            {
            kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getConditionalAndOperatorAccess().getAmpersandAmpersandKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleOrExpression"
    // InternalKerMLExpressions.g:532:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalKerMLExpressions.g:532:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLExpressions.g:533:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:539:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:545:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )* ) )
            // InternalKerMLExpressions.g:546:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:546:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )* )
            // InternalKerMLExpressions.g:547:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:555:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKerMLExpressions.g:556:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:556:4: ()
            	    // InternalKerMLExpressions.g:557:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:563:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalKerMLExpressions.g:564:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalKerMLExpressions.g:564:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalKerMLExpressions.g:565:6: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:582:4: ( (lv_operand_comp_3_0= ruleXorExpression ) )
            	    // InternalKerMLExpressions.g:583:5: (lv_operand_comp_3_0= ruleXorExpression )
            	    {
            	    // InternalKerMLExpressions.g:583:5: (lv_operand_comp_3_0= ruleXorExpression )
            	    // InternalKerMLExpressions.g:584:6: lv_operand_comp_3_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperand_compXorExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_operand_comp_3_0=ruleXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.XorExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:613:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:619:2: (kw= '|' )
            // InternalKerMLExpressions.g:620:2: kw= '|'
            {
            kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:628:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalKerMLExpressions.g:628:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLExpressions.g:629:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:635:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:641:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:642:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:642:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )* )
            // InternalKerMLExpressions.g:643:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:651:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKerMLExpressions.g:652:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:652:4: ()
            	    // InternalKerMLExpressions.g:653:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:659:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalKerMLExpressions.g:660:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalKerMLExpressions.g:660:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalKerMLExpressions.g:661:6: lv_operator_2_0= ruleXorOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleXorOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:678:4: ( (lv_operand_comp_3_0= ruleAndExpression ) )
            	    // InternalKerMLExpressions.g:679:5: (lv_operand_comp_3_0= ruleAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:679:5: (lv_operand_comp_3_0= ruleAndExpression )
            	    // InternalKerMLExpressions.g:680:6: lv_operand_comp_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperand_compAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_operand_comp_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:702:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalKerMLExpressions.g:702:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalKerMLExpressions.g:703:2: iv_ruleXorOperator= ruleXorOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXorOperator=ruleXorOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:709:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '^' ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:715:2: (kw= '^' )
            // InternalKerMLExpressions.g:716:2: kw= '^'
            {
            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getXorOperatorAccess().getCircumflexAccentKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:724:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalKerMLExpressions.g:724:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLExpressions.g:725:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:731:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:737:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalKerMLExpressions.g:738:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:738:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )* )
            // InternalKerMLExpressions.g:739:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:747:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKerMLExpressions.g:748:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:748:4: ()
            	    // InternalKerMLExpressions.g:749:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:755:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalKerMLExpressions.g:756:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalKerMLExpressions.g:756:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalKerMLExpressions.g:757:6: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:774:4: ( (lv_operand_comp_3_0= ruleEqualityExpression ) )
            	    // InternalKerMLExpressions.g:775:5: (lv_operand_comp_3_0= ruleEqualityExpression )
            	    {
            	    // InternalKerMLExpressions.g:775:5: (lv_operand_comp_3_0= ruleEqualityExpression )
            	    // InternalKerMLExpressions.g:776:6: lv_operand_comp_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperand_compEqualityExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_operand_comp_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.EqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:798:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalKerMLExpressions.g:798:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalKerMLExpressions.g:799:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:805:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&' ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:811:2: (kw= '&' )
            // InternalKerMLExpressions.g:812:2: kw= '&'
            {
            kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:820:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLExpressions.g:820:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:821:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:827:1: ruleEqualityExpression returns [EObject current=null] : (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:833:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:834:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:834:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )* )
            // InternalKerMLExpressions.g:835:3: this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_ClassificationExpression_0=ruleClassificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ClassificationExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:843:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKerMLExpressions.g:844:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:844:4: ()
            	    // InternalKerMLExpressions.g:845:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:851:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalKerMLExpressions.g:852:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalKerMLExpressions.g:852:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalKerMLExpressions.g:853:6: lv_operator_2_0= ruleEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleEqualityOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:870:4: ( (lv_operand_comp_3_0= ruleClassificationExpression ) )
            	    // InternalKerMLExpressions.g:871:5: (lv_operand_comp_3_0= ruleClassificationExpression )
            	    {
            	    // InternalKerMLExpressions.g:871:5: (lv_operand_comp_3_0= ruleClassificationExpression )
            	    // InternalKerMLExpressions.g:872:6: lv_operand_comp_3_0= ruleClassificationExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperand_compClassificationExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operand_comp_3_0=ruleClassificationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ClassificationExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:894:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalKerMLExpressions.g:894:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:895:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:901:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:907:2: ( (kw= '==' | kw= '!=' ) )
            // InternalKerMLExpressions.g:908:2: (kw= '==' | kw= '!=' )
            {
            // InternalKerMLExpressions.g:908:2: (kw= '==' | kw= '!=' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKerMLExpressions.g:909:3: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:915:3: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:924:1: entryRuleClassificationExpression returns [EObject current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final EObject entryRuleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLExpressions.g:924:65: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:925:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassificationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassificationExpression=ruleClassificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassificationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:931:1: ruleClassificationExpression returns [EObject current=null] : ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) ) ) ;
    public final EObject ruleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedFeatureMembership_comp_3_0 = null;

        EObject lv_operand_comp_5_0 = null;

        AntlrDatatypeRuleToken lv_operator_6_0 = null;

        EObject lv_ownedFeatureMembership_comp_7_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:937:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) ) ) )
            // InternalKerMLExpressions.g:938:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) ) )
            {
            // InternalKerMLExpressions.g:938:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING_VALUE && LA11_0<=RULE_UNRESTRICTED_NAME)||(LA11_0>=32 && LA11_0<=34)||(LA11_0>=40 && LA11_0<=43)||LA11_0==45||LA11_0==49||(LA11_0>=54 && LA11_0<=56)) ) {
                alt11=1;
            }
            else if ( (LA11_0==EOF||(LA11_0>=24 && LA11_0<=27)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKerMLExpressions.g:939:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? )
                    {
                    // InternalKerMLExpressions.g:939:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? )
                    // InternalKerMLExpressions.g:940:4: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    this_RelationalExpression_0=ruleRelationalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RelationalExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalKerMLExpressions.g:948:4: ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=24 && LA10_0<=27)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalKerMLExpressions.g:949:5: () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) )
                            {
                            // InternalKerMLExpressions.g:949:5: ()
                            // InternalKerMLExpressions.g:950:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndAdd(
                              							grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperand_compAction_0_1_0(),
                              							current);
                              					
                            }

                            }

                            // InternalKerMLExpressions.g:956:5: ( (lv_operator_2_0= ruleClassificationOperator ) )
                            // InternalKerMLExpressions.g:957:6: (lv_operator_2_0= ruleClassificationOperator )
                            {
                            // InternalKerMLExpressions.g:957:6: (lv_operator_2_0= ruleClassificationOperator )
                            // InternalKerMLExpressions.g:958:7: lv_operator_2_0= ruleClassificationOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_14);
                            lv_operator_2_0=ruleClassificationOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            // InternalKerMLExpressions.g:975:5: ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) )
                            // InternalKerMLExpressions.g:976:6: (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember )
                            {
                            // InternalKerMLExpressions.g:976:6: (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember )
                            // InternalKerMLExpressions.g:977:7: lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedFeatureMembership_comp_3_0=ruleTypeReferenceMember();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                              							}
                              							add(
                              								current,
                              								"ownedFeatureMembership_comp",
                              								lv_ownedFeatureMembership_comp_3_0,
                              								"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
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
                    // InternalKerMLExpressions.g:997:3: ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:997:3: ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:998:4: () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:998:4: ()
                    // InternalKerMLExpressions.g:999:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:1005:4: ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) )
                    // InternalKerMLExpressions.g:1006:5: (lv_operand_comp_5_0= ruleSelfReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:1006:5: (lv_operand_comp_5_0= ruleSelfReferenceExpression )
                    // InternalKerMLExpressions.g:1007:6: lv_operand_comp_5_0= ruleSelfReferenceExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperand_compSelfReferenceExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_operand_comp_5_0=ruleSelfReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                      						}
                      						add(
                      							current,
                      							"operand_comp",
                      							lv_operand_comp_5_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.SelfReferenceExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKerMLExpressions.g:1024:4: ( (lv_operator_6_0= ruleClassificationOperator ) )
                    // InternalKerMLExpressions.g:1025:5: (lv_operator_6_0= ruleClassificationOperator )
                    {
                    // InternalKerMLExpressions.g:1025:5: (lv_operator_6_0= ruleClassificationOperator )
                    // InternalKerMLExpressions.g:1026:6: lv_operator_6_0= ruleClassificationOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_operator_6_0=ruleClassificationOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalKerMLExpressions.g:1043:4: ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1044:5: (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1044:5: (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1045:6: lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedFeatureMembership_comp_7_0=ruleTypeReferenceMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                      						}
                      						add(
                      							current,
                      							"ownedFeatureMembership_comp",
                      							lv_ownedFeatureMembership_comp_7_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1067:1: entryRuleClassificationOperator returns [String current=null] : iv_ruleClassificationOperator= ruleClassificationOperator EOF ;
    public final String entryRuleClassificationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationOperator = null;


        try {
            // InternalKerMLExpressions.g:1067:62: (iv_ruleClassificationOperator= ruleClassificationOperator EOF )
            // InternalKerMLExpressions.g:1068:2: iv_ruleClassificationOperator= ruleClassificationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassificationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassificationOperator=ruleClassificationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassificationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1074:1: ruleClassificationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' ) ;
    public final AntlrDatatypeRuleToken ruleClassificationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1080:2: ( (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' ) )
            // InternalKerMLExpressions.g:1081:2: (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' )
            {
            // InternalKerMLExpressions.g:1081:2: (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            case 27:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalKerMLExpressions.g:1082:3: kw= 'instanceof'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getInstanceofKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1088:3: kw= 'hastype'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1094:3: kw= 'istype'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1100:3: kw= '@'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1109:1: entryRuleTypeReferenceMember returns [EObject current=null] : iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF ;
    public final EObject entryRuleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1109:60: (iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:1110:2: iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReferenceMember=ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReferenceMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1116:1: ruleTypeReferenceMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleTypeReference ) ) ;
    public final EObject ruleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1122:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleTypeReference ) ) )
            // InternalKerMLExpressions.g:1123:2: ( (lv_ownedMemberFeature_comp_0_0= ruleTypeReference ) )
            {
            // InternalKerMLExpressions.g:1123:2: ( (lv_ownedMemberFeature_comp_0_0= ruleTypeReference ) )
            // InternalKerMLExpressions.g:1124:3: (lv_ownedMemberFeature_comp_0_0= ruleTypeReference )
            {
            // InternalKerMLExpressions.g:1124:3: (lv_ownedMemberFeature_comp_0_0= ruleTypeReference )
            // InternalKerMLExpressions.g:1125:4: lv_ownedMemberFeature_comp_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeReferenceMemberAccess().getOwnedMemberFeature_compTypeReferenceParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberFeature_comp_0_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypeReferenceMemberRule());
              				}
              				set(
              					current,
              					"ownedMemberFeature_comp",
              					lv_ownedMemberFeature_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReference");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1145:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalKerMLExpressions.g:1145:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalKerMLExpressions.g:1146:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1152:1: ruleTypeReference returns [EObject current=null] : ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1158:2: ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) )
            // InternalKerMLExpressions.g:1159:2: ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) )
            {
            // InternalKerMLExpressions.g:1159:2: ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:1160:3: (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:1160:3: (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:1161:4: lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeReferenceAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_comp_0_0=ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
              				}
              				add(
              					current,
              					"ownedRelationship_comp",
              					lv_ownedRelationship_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureTyping");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1181:1: entryRuleOwnedFeatureTyping returns [EObject current=null] : iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF ;
    public final EObject entryRuleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureTyping = null;


        try {
            // InternalKerMLExpressions.g:1181:59: (iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:1182:2: iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOwnedFeatureTypingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOwnedFeatureTyping=ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOwnedFeatureTyping; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1188:1: ruleOwnedFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1194:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:1195:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:1195:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:1196:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:1196:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:1197:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getOwnedFeatureTypingRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1214:1: entryRuleSelfReferenceExpression returns [EObject current=null] : iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF ;
    public final EObject entryRuleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:1214:64: (iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:1215:2: iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelfReferenceExpression=ruleSelfReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfReferenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1221:1: ruleSelfReferenceExpression returns [EObject current=null] : ( (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember ) ) ;
    public final EObject ruleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedFeatureMembership_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1227:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember ) ) )
            // InternalKerMLExpressions.g:1228:2: ( (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember ) )
            {
            // InternalKerMLExpressions.g:1228:2: ( (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:1229:3: (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:1229:3: (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:1230:4: lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSelfReferenceExpressionAccess().getOwnedFeatureMembership_compSelfReferenceMemberParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedFeatureMembership_comp_0_0=ruleSelfReferenceMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSelfReferenceExpressionRule());
              				}
              				add(
              					current,
              					"ownedFeatureMembership_comp",
              					lv_ownedFeatureMembership_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.SelfReferenceMember");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1250:1: entryRuleSelfReferenceMember returns [EObject current=null] : iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF ;
    public final EObject entryRuleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1250:60: (iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:1251:2: iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfReferenceMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelfReferenceMember=ruleSelfReferenceMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfReferenceMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1257:1: ruleSelfReferenceMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature ) ) ;
    public final EObject ruleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1263:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature ) ) )
            // InternalKerMLExpressions.g:1264:2: ( (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature ) )
            {
            // InternalKerMLExpressions.g:1264:2: ( (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:1265:3: (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:1265:3: (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature )
            // InternalKerMLExpressions.g:1266:4: lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSelfReferenceMemberAccess().getOwnedMemberFeature_compEmptyFeatureParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberFeature_comp_0_0=ruleEmptyFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSelfReferenceMemberRule());
              				}
              				set(
              					current,
              					"ownedMemberFeature_comp",
              					lv_ownedMemberFeature_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.EmptyFeature");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1286:1: entryRuleEmptyFeature returns [EObject current=null] : iv_ruleEmptyFeature= ruleEmptyFeature EOF ;
    public final EObject entryRuleEmptyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFeature = null;


        try {
            // InternalKerMLExpressions.g:1286:53: (iv_ruleEmptyFeature= ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:1287:2: iv_ruleEmptyFeature= ruleEmptyFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmptyFeature=ruleEmptyFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1293:1: ruleEmptyFeature returns [EObject current=null] : () ;
    public final EObject ruleEmptyFeature() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1299:2: ( () )
            // InternalKerMLExpressions.g:1300:2: ()
            {
            // InternalKerMLExpressions.g:1300:2: ()
            // InternalKerMLExpressions.g:1301:3: 
            {
            if ( state.backtracking==0 ) {

              			current = forceCreateModelElement(
              				grammarAccess.getEmptyFeatureAccess().getFeatureAction(),
              				current);
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyFeature"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalKerMLExpressions.g:1310:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLExpressions.g:1310:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:1311:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1317:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1323:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1324:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1324:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )* )
            // InternalKerMLExpressions.g:1325:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:1333:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=28 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1334:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1334:4: ()
            	    // InternalKerMLExpressions.g:1335:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:1341:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalKerMLExpressions.g:1342:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalKerMLExpressions.g:1342:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalKerMLExpressions.g:1343:6: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleRelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:1360:4: ( (lv_operand_comp_3_0= ruleAdditiveExpression ) )
            	    // InternalKerMLExpressions.g:1361:5: (lv_operand_comp_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalKerMLExpressions.g:1361:5: (lv_operand_comp_3_0= ruleAdditiveExpression )
            	    // InternalKerMLExpressions.g:1362:6: lv_operand_comp_3_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperand_compAdditiveExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_operand_comp_3_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.AdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1384:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalKerMLExpressions.g:1384:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:1385:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1391:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1397:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalKerMLExpressions.g:1398:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalKerMLExpressions.g:1398:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 31:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKerMLExpressions.g:1399:3: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1405:3: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1411:3: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1417:3: kw= '>='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalKerMLExpressions.g:1426:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLExpressions.g:1426:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:1427:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1433:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1439:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1440:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1440:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalKerMLExpressions.g:1441:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:1449:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=32 && LA15_0<=33)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1450:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1450:4: ()
            	    // InternalKerMLExpressions.g:1451:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:1457:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalKerMLExpressions.g:1458:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalKerMLExpressions.g:1458:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalKerMLExpressions.g:1459:6: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:1476:4: ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) )
            	    // InternalKerMLExpressions.g:1477:5: (lv_operand_comp_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1477:5: (lv_operand_comp_3_0= ruleMultiplicativeExpression )
            	    // InternalKerMLExpressions.g:1478:6: lv_operand_comp_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperand_compMultiplicativeExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_operand_comp_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.MultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1500:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalKerMLExpressions.g:1500:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:1501:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveOperator=ruleAdditiveOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1507:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1513:2: ( (kw= '+' | kw= '-' ) )
            // InternalKerMLExpressions.g:1514:2: (kw= '+' | kw= '-' )
            {
            // InternalKerMLExpressions.g:1514:2: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalKerMLExpressions.g:1515:3: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1521:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1530:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLExpressions.g:1530:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:1531:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1537:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1543:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1544:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1544:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )* )
            // InternalKerMLExpressions.g:1545:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExponentiationExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:1553:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=34 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1554:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1554:4: ()
            	    // InternalKerMLExpressions.g:1555:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:1561:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalKerMLExpressions.g:1562:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalKerMLExpressions.g:1562:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalKerMLExpressions.g:1563:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:1580:4: ( (lv_operand_comp_3_0= ruleExponentiationExpression ) )
            	    // InternalKerMLExpressions.g:1581:5: (lv_operand_comp_3_0= ruleExponentiationExpression )
            	    {
            	    // InternalKerMLExpressions.g:1581:5: (lv_operand_comp_3_0= ruleExponentiationExpression )
            	    // InternalKerMLExpressions.g:1582:6: lv_operand_comp_3_0= ruleExponentiationExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperand_compExponentiationExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_operand_comp_3_0=ruleExponentiationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ExponentiationExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1604:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalKerMLExpressions.g:1604:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:1605:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1611:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1617:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalKerMLExpressions.g:1618:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalKerMLExpressions.g:1618:2: (kw= '*' | kw= '/' | kw= '%' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalKerMLExpressions.g:1619:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1625:3: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1631:3: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getPercentSignKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1640:1: entryRuleExponentiationExpression returns [EObject current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final EObject entryRuleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLExpressions.g:1640:65: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:1641:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentiationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExponentiationExpression=ruleExponentiationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentiationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1647:1: ruleExponentiationExpression returns [EObject current=null] : (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )* ) ;
    public final EObject ruleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnitsExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1653:2: ( (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1654:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1654:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )* )
            // InternalKerMLExpressions.g:1655:3: this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnitsExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_UnitsExpression_0=ruleUnitsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnitsExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:1663:3: ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1664:4: () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1664:4: ()
            	    // InternalKerMLExpressions.g:1665:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:1671:4: ( (lv_operator_2_0= ruleExponentiationOperator ) )
            	    // InternalKerMLExpressions.g:1672:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    {
            	    // InternalKerMLExpressions.g:1672:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    // InternalKerMLExpressions.g:1673:6: lv_operator_2_0= ruleExponentiationOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperatorExponentiationOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleExponentiationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalKerMLExpressions.g:1690:4: ( (lv_operand_comp_3_0= ruleUnitsExpression ) )
            	    // InternalKerMLExpressions.g:1691:5: (lv_operand_comp_3_0= ruleUnitsExpression )
            	    {
            	    // InternalKerMLExpressions.g:1691:5: (lv_operand_comp_3_0= ruleUnitsExpression )
            	    // InternalKerMLExpressions.g:1692:6: lv_operand_comp_3_0= ruleUnitsExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperand_compUnitsExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_operand_comp_3_0=ruleUnitsExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExponentiationExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operand_comp",
            	      							lv_operand_comp_3_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.UnitsExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1714:1: entryRuleExponentiationOperator returns [String current=null] : iv_ruleExponentiationOperator= ruleExponentiationOperator EOF ;
    public final String entryRuleExponentiationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationOperator = null;


        try {
            // InternalKerMLExpressions.g:1714:62: (iv_ruleExponentiationOperator= ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:1715:2: iv_ruleExponentiationOperator= ruleExponentiationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentiationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExponentiationOperator=ruleExponentiationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentiationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1721:1: ruleExponentiationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '**' ;
    public final AntlrDatatypeRuleToken ruleExponentiationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1727:2: (kw= '**' )
            // InternalKerMLExpressions.g:1728:2: kw= '**'
            {
            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1736:1: entryRuleUnitsExpression returns [EObject current=null] : iv_ruleUnitsExpression= ruleUnitsExpression EOF ;
    public final EObject entryRuleUnitsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsExpression = null;


        try {
            // InternalKerMLExpressions.g:1736:56: (iv_ruleUnitsExpression= ruleUnitsExpression EOF )
            // InternalKerMLExpressions.g:1737:2: iv_ruleUnitsExpression= ruleUnitsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitsExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnitsExpression=ruleUnitsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitsExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1743:1: ruleUnitsExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleUnitsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1749:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? ) )
            // InternalKerMLExpressions.g:1750:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? )
            {
            // InternalKerMLExpressions.g:1750:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? )
            // InternalKerMLExpressions.g:1751:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUnitsExpressionAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:1759:3: ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKerMLExpressions.g:1760:4: () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']'
                    {
                    // InternalKerMLExpressions.g:1760:4: ()
                    // InternalKerMLExpressions.g:1761:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:1767:4: ( (lv_operator_2_0= '@[' ) )
                    // InternalKerMLExpressions.g:1768:5: (lv_operator_2_0= '@[' )
                    {
                    // InternalKerMLExpressions.g:1768:5: (lv_operator_2_0= '@[' )
                    // InternalKerMLExpressions.g:1769:6: lv_operator_2_0= '@['
                    {
                    lv_operator_2_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_2_0, grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtLeftSquareBracketKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnitsExpressionRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_2_0, "@[");
                      					
                    }

                    }


                    }

                    // InternalKerMLExpressions.g:1781:4: ( (lv_operand_comp_3_0= ruleOwnedExpression ) )
                    // InternalKerMLExpressions.g:1782:5: (lv_operand_comp_3_0= ruleOwnedExpression )
                    {
                    // InternalKerMLExpressions.g:1782:5: (lv_operand_comp_3_0= ruleOwnedExpression )
                    // InternalKerMLExpressions.g:1783:6: lv_operand_comp_3_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnitsExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_operand_comp_3_0=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnitsExpressionRule());
                      						}
                      						add(
                      							current,
                      							"operand_comp",
                      							lv_operand_comp_3_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnitsExpressionAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1809:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLExpressions.g:1809:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:1810:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1816:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_operand_comp_2_0 = null;

        EObject this_ExtentExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1822:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) )
            // InternalKerMLExpressions.g:1823:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:1823:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=32 && LA21_0<=33)||(LA21_0>=40 && LA21_0<=41)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING_VALUE && LA21_0<=RULE_UNRESTRICTED_NAME)||LA21_0==34||(LA21_0>=42 && LA21_0<=43)||LA21_0==45||LA21_0==49||(LA21_0>=54 && LA21_0<=56)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalKerMLExpressions.g:1824:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:1824:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) )
                    // InternalKerMLExpressions.g:1825:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) )
                    {
                    // InternalKerMLExpressions.g:1825:4: ()
                    // InternalKerMLExpressions.g:1826:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:1832:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalKerMLExpressions.g:1833:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalKerMLExpressions.g:1833:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalKerMLExpressions.g:1834:6: lv_operator_1_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_operator_1_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalKerMLExpressions.g:1851:4: ( (lv_operand_comp_2_0= ruleExtentExpression ) )
                    // InternalKerMLExpressions.g:1852:5: (lv_operand_comp_2_0= ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:1852:5: (lv_operand_comp_2_0= ruleExtentExpression )
                    // InternalKerMLExpressions.g:1853:6: lv_operand_comp_2_0= ruleExtentExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperand_compExtentExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_comp_2_0=ruleExtentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						add(
                      							current,
                      							"operand_comp",
                      							lv_operand_comp_2_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.ExtentExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1872:3: this_ExtentExpression_3= ruleExtentExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExtentExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExtentExpression_3=ruleExtentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExtentExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1884:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalKerMLExpressions.g:1884:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:1885:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperator=ruleUnaryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1891:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1897:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) )
            // InternalKerMLExpressions.g:1898:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            {
            // InternalKerMLExpressions.g:1898:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt22=1;
                }
                break;
            case 33:
                {
                alt22=2;
                }
                break;
            case 40:
                {
                alt22=3;
                }
                break;
            case 41:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalKerMLExpressions.g:1899:3: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1905:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1911:3: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1917:3: kw= '~'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:1926:1: entryRuleExtentExpression returns [EObject current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final EObject entryRuleExtentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression = null;


        try {
            // InternalKerMLExpressions.g:1926:57: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:1927:2: iv_ruleExtentExpression= ruleExtentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtentExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtentExpression=ruleExtentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtentExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:1933:1: ruleExtentExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) ) | this_SequenceExpression_3= ruleSequenceExpression ) ;
    public final EObject ruleExtentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_ownedFeatureMembership_comp_2_0 = null;

        EObject this_SequenceExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1939:2: ( ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) ) | this_SequenceExpression_3= ruleSequenceExpression ) )
            // InternalKerMLExpressions.g:1940:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) ) | this_SequenceExpression_3= ruleSequenceExpression )
            {
            // InternalKerMLExpressions.g:1940:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) ) | this_SequenceExpression_3= ruleSequenceExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING_VALUE && LA23_0<=RULE_UNRESTRICTED_NAME)||LA23_0==34||LA23_0==43||LA23_0==45||LA23_0==49||(LA23_0>=54 && LA23_0<=56)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalKerMLExpressions.g:1941:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1941:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1942:4: () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1942:4: ()
                    // InternalKerMLExpressions.g:1943:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:1949:4: ( (lv_operator_1_0= 'all' ) )
                    // InternalKerMLExpressions.g:1950:5: (lv_operator_1_0= 'all' )
                    {
                    // InternalKerMLExpressions.g:1950:5: (lv_operator_1_0= 'all' )
                    // InternalKerMLExpressions.g:1951:6: lv_operator_1_0= 'all'
                    {
                    lv_operator_1_0=(Token)match(input,42,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_1_0, grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExtentExpressionRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_1_0, "all");
                      					
                    }

                    }


                    }

                    // InternalKerMLExpressions.g:1963:4: ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1964:5: (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1964:5: (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1965:6: lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExtentExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedFeatureMembership_comp_2_0=ruleTypeReferenceMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExtentExpressionRule());
                      						}
                      						add(
                      							current,
                      							"ownedFeatureMembership_comp",
                      							lv_ownedFeatureMembership_comp_2_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1984:3: this_SequenceExpression_3= ruleSequenceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExtentExpressionAccess().getSequenceExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SequenceExpression_3=ruleSequenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SequenceExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleExtentExpression_Deprecated"
    // InternalKerMLExpressions.g:1996:1: entryRuleExtentExpression_Deprecated returns [EObject current=null] : iv_ruleExtentExpression_Deprecated= ruleExtentExpression_Deprecated EOF ;
    public final EObject entryRuleExtentExpression_Deprecated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression_Deprecated = null;


        try {
            // InternalKerMLExpressions.g:1996:68: (iv_ruleExtentExpression_Deprecated= ruleExtentExpression_Deprecated EOF )
            // InternalKerMLExpressions.g:1997:2: iv_ruleExtentExpression_Deprecated= ruleExtentExpression_Deprecated EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtentExpression_DeprecatedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtentExpression_Deprecated=ruleExtentExpression_Deprecated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtentExpression_Deprecated; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtentExpression_Deprecated"


    // $ANTLR start "ruleExtentExpression_Deprecated"
    // InternalKerMLExpressions.g:2003:1: ruleExtentExpression_Deprecated returns [EObject current=null] : ( ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')' ) ;
    public final EObject ruleExtentExpression_Deprecated() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operator_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_ownedFeatureMembership_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2009:2: ( ( ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')' ) )
            // InternalKerMLExpressions.g:2010:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')' )
            {
            // InternalKerMLExpressions.g:2010:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')' )
            // InternalKerMLExpressions.g:2011:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')'
            {
            // InternalKerMLExpressions.g:2011:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:2012:4: (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:2012:4: (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:2013:5: lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExtentExpression_DeprecatedAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_ownedFeatureMembership_comp_0_0=ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExtentExpression_DeprecatedRule());
              					}
              					add(
              						current,
              						"ownedFeatureMembership_comp",
              						lv_ownedFeatureMembership_comp_0_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.TypeReferenceMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExtentExpression_DeprecatedAccess().getFullStopKeyword_1());
              		
            }
            // InternalKerMLExpressions.g:2034:3: ( (lv_operator_2_0= 'allInstances' ) )
            // InternalKerMLExpressions.g:2035:4: (lv_operator_2_0= 'allInstances' )
            {
            // InternalKerMLExpressions.g:2035:4: (lv_operator_2_0= 'allInstances' )
            // InternalKerMLExpressions.g:2036:5: lv_operator_2_0= 'allInstances'
            {
            lv_operator_2_0=(Token)match(input,44,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_operator_2_0, grammarAccess.getExtentExpression_DeprecatedAccess().getOperatorAllInstancesKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExtentExpression_DeprecatedRule());
              					}
              					setWithLastConsumed(current, "operator", lv_operator_2_0, "allInstances");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExtentExpression_DeprecatedAccess().getLeftParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getExtentExpression_DeprecatedAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtentExpression_Deprecated"


    // $ANTLR start "entryRuleSequenceExpression"
    // InternalKerMLExpressions.g:2060:1: entryRuleSequenceExpression returns [EObject current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final EObject entryRuleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2060:59: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:2061:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequenceExpression=ruleSequenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2067:1: ruleSequenceExpression returns [EObject current=null] : ( (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )* ) ;
    public final EObject ruleSequenceExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_SequenceConstructionExpression_0 = null;

        EObject this_BaseExpression_1 = null;

        EObject lv_operand_comp_4_0 = null;

        AntlrDatatypeRuleToken lv_operator_8_0 = null;

        EObject lv_ownedFeatureMembership_comp_9_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2073:2: ( ( (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )* ) )
            // InternalKerMLExpressions.g:2074:2: ( (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )* )
            {
            // InternalKerMLExpressions.g:2074:2: ( (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )* )
            // InternalKerMLExpressions.g:2075:3: (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )*
            {
            // InternalKerMLExpressions.g:2075:3: (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_STRING_VALUE && LA24_0<=RULE_UNRESTRICTED_NAME)||LA24_0==34||LA24_0==43||LA24_0==45||(LA24_0>=54 && LA24_0<=56)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalKerMLExpressions.g:2076:4: this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSequenceExpressionAccess().getSequenceConstructionExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_SequenceConstructionExpression_0=ruleSequenceConstructionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SequenceConstructionExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2085:4: this_BaseExpression_1= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSequenceExpressionAccess().getBaseExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_BaseExpression_1=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BaseExpression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalKerMLExpressions.g:2094:3: ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47) ) {
                    alt26=1;
                }
                else if ( (LA26_0==48) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2095:4: ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' )
            	    {
            	    // InternalKerMLExpressions.g:2095:4: ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' )
            	    // InternalKerMLExpressions.g:2096:5: () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']'
            	    {
            	    // InternalKerMLExpressions.g:2096:5: ()
            	    // InternalKerMLExpressions.g:2097:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperand_compAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKerMLExpressions.g:2103:5: ( (lv_operator_3_0= '[' ) )
            	    // InternalKerMLExpressions.g:2104:6: (lv_operator_3_0= '[' )
            	    {
            	    // InternalKerMLExpressions.g:2104:6: (lv_operator_3_0= '[' )
            	    // InternalKerMLExpressions.g:2105:7: lv_operator_3_0= '['
            	    {
            	    lv_operator_3_0=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_operator_3_0, grammarAccess.getSequenceExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getSequenceExpressionRule());
            	      							}
            	      							setWithLastConsumed(current, "operator", lv_operator_3_0, "[");
            	      						
            	    }

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2117:5: ( (lv_operand_comp_4_0= ruleOwnedExpression ) )
            	    // InternalKerMLExpressions.g:2118:6: (lv_operand_comp_4_0= ruleOwnedExpression )
            	    {
            	    // InternalKerMLExpressions.g:2118:6: (lv_operand_comp_4_0= ruleOwnedExpression )
            	    // InternalKerMLExpressions.g:2119:7: lv_operand_comp_4_0= ruleOwnedExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_operand_comp_4_0=ruleOwnedExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSequenceExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"operand_comp",
            	      								lv_operand_comp_4_0,
            	      								"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,39,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getSequenceExpressionAccess().getRightSquareBracketKeyword_1_0_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKerMLExpressions.g:2142:4: ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ )
            	    {
            	    // InternalKerMLExpressions.g:2142:4: ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ )
            	    // InternalKerMLExpressions.g:2143:5: () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+
            	    {
            	    // InternalKerMLExpressions.g:2143:5: ()
            	    // InternalKerMLExpressions.g:2144:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperand_compAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_7=(Token)match(input,48,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getSequenceExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
            	      				
            	    }
            	    // InternalKerMLExpressions.g:2154:5: ( (lv_operator_8_0= ruleName ) )
            	    // InternalKerMLExpressions.g:2155:6: (lv_operator_8_0= ruleName )
            	    {
            	    // InternalKerMLExpressions.g:2155:6: (lv_operator_8_0= ruleName )
            	    // InternalKerMLExpressions.g:2156:7: lv_operator_8_0= ruleName
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOperatorNameParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_8_0=ruleName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSequenceExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"operator",
            	      								lv_operator_8_0,
            	      								"org.omg.kerml.expressions.xtext.KerMLExpressions.Name");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2173:5: ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_UNRESTRICTED_NAME)) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalKerMLExpressions.g:2174:6: (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember )
            	    	    {
            	    	    // InternalKerMLExpressions.g:2174:6: (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember )
            	    	    // InternalKerMLExpressions.g:2175:7: lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOwnedFeatureMembership_compBodyExpressionMemberParserRuleCall_1_1_3_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_ownedFeatureMembership_comp_9_0=ruleBodyExpressionMember();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getSequenceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"ownedFeatureMembership_comp",
            	    	      								lv_ownedFeatureMembership_comp_9_0,
            	    	      								"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyExpressionMember");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt25 >= 1 ) break loop25;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(25, input);
            	                throw eee;
            	        }
            	        cnt25++;
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleBodyExpressionMember"
    // InternalKerMLExpressions.g:2198:1: entryRuleBodyExpressionMember returns [EObject current=null] : iv_ruleBodyExpressionMember= ruleBodyExpressionMember EOF ;
    public final EObject entryRuleBodyExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:2198:61: (iv_ruleBodyExpressionMember= ruleBodyExpressionMember EOF )
            // InternalKerMLExpressions.g:2199:2: iv_ruleBodyExpressionMember= ruleBodyExpressionMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyExpressionMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBodyExpressionMember=ruleBodyExpressionMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBodyExpressionMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyExpressionMember"


    // $ANTLR start "ruleBodyExpressionMember"
    // InternalKerMLExpressions.g:2205:1: ruleBodyExpressionMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression ) ) ;
    public final EObject ruleBodyExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2211:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression ) ) )
            // InternalKerMLExpressions.g:2212:2: ( (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression ) )
            {
            // InternalKerMLExpressions.g:2212:2: ( (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression ) )
            // InternalKerMLExpressions.g:2213:3: (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression )
            {
            // InternalKerMLExpressions.g:2213:3: (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression )
            // InternalKerMLExpressions.g:2214:4: lv_ownedMemberFeature_comp_0_0= ruleBodyExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBodyExpressionMemberAccess().getOwnedMemberFeature_compBodyExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberFeature_comp_0_0=ruleBodyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBodyExpressionMemberRule());
              				}
              				set(
              					current,
              					"ownedMemberFeature_comp",
              					lv_ownedMemberFeature_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyExpressionMember"


    // $ANTLR start "entryRuleBodyExpression"
    // InternalKerMLExpressions.g:2234:1: entryRuleBodyExpression returns [EObject current=null] : iv_ruleBodyExpression= ruleBodyExpression EOF ;
    public final EObject entryRuleBodyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyExpression = null;


        try {
            // InternalKerMLExpressions.g:2234:55: (iv_ruleBodyExpression= ruleBodyExpression EOF )
            // InternalKerMLExpressions.g:2235:2: iv_ruleBodyExpression= ruleBodyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBodyExpression=ruleBodyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBodyExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2241:1: ruleBodyExpression returns [EObject current=null] : ( ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) ) | ( (lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping ) ) ) ;
    public final EObject ruleBodyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedFeatureMembership_comp_0_0 = null;

        EObject lv_ownedFeatureMembership_comp_1_0 = null;

        EObject lv_ownedFeatureMembership_comp_3_0 = null;

        EObject lv_ownedRelationship_comp_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2247:2: ( ( ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) ) | ( (lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping ) ) ) )
            // InternalKerMLExpressions.g:2248:2: ( ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) ) | ( (lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping ) ) )
            {
            // InternalKerMLExpressions.g:2248:2: ( ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) ) | ( (lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==EOF||(LA28_1>=14 && LA28_1<=39)||LA28_1==43||(LA28_1>=46 && LA28_1<=48)||(LA28_1>=50 && LA28_1<=52)||LA28_1==57) ) {
                    alt28=2;
                }
                else if ( (LA28_1==RULE_ID) ) {
                    int LA28_4 = input.LA(3);

                    if ( (synpred1_InternalKerMLExpressions()) ) {
                        alt28=1;
                    }
                    else if ( (true) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_1==RULE_UNRESTRICTED_NAME) ) {
                    int LA28_5 = input.LA(3);

                    if ( (synpred1_InternalKerMLExpressions()) ) {
                        alt28=1;
                    }
                    else if ( (true) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_1==45) && (synpred1_InternalKerMLExpressions())) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==RULE_UNRESTRICTED_NAME) ) {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==EOF||(LA28_2>=14 && LA28_2<=39)||LA28_2==43||(LA28_2>=46 && LA28_2<=48)||(LA28_2>=50 && LA28_2<=52)||LA28_2==57) ) {
                    alt28=2;
                }
                else if ( (LA28_2==RULE_ID) ) {
                    int LA28_4 = input.LA(3);

                    if ( (synpred1_InternalKerMLExpressions()) ) {
                        alt28=1;
                    }
                    else if ( (true) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_2==RULE_UNRESTRICTED_NAME) ) {
                    int LA28_5 = input.LA(3);

                    if ( (synpred1_InternalKerMLExpressions()) ) {
                        alt28=1;
                    }
                    else if ( (true) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_2==45) && (synpred1_InternalKerMLExpressions())) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalKerMLExpressions.g:2249:3: ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) )
                    {
                    // InternalKerMLExpressions.g:2249:3: ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) )
                    // InternalKerMLExpressions.g:2250:4: ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' )
                    {
                    // InternalKerMLExpressions.g:2270:4: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' )
                    // InternalKerMLExpressions.g:2271:5: ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')'
                    {
                    // InternalKerMLExpressions.g:2271:5: ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) )
                    // InternalKerMLExpressions.g:2272:6: (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember )
                    {
                    // InternalKerMLExpressions.g:2272:6: (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember )
                    // InternalKerMLExpressions.g:2273:7: lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compBodyParameterMemberParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_28);
                    lv_ownedFeatureMembership_comp_0_0=ruleBodyParameterMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBodyExpressionRule());
                      							}
                      							add(
                      								current,
                      								"ownedFeatureMembership_comp",
                      								lv_ownedFeatureMembership_comp_0_0,
                      								"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyParameterMember");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKerMLExpressions.g:2290:5: ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalKerMLExpressions.g:2291:6: (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember )
                    	    {
                    	    // InternalKerMLExpressions.g:2291:6: (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember )
                    	    // InternalKerMLExpressions.g:2292:7: lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compBodyParameterMemberParserRuleCall_0_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_ownedFeatureMembership_comp_1_0=ruleBodyParameterMember();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBodyExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedFeatureMembership_comp",
                    	      								lv_ownedFeatureMembership_comp_1_0,
                    	      								"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyParameterMember");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getBodyExpressionAccess().getLeftParenthesisKeyword_0_0_2());
                      				
                    }
                    // InternalKerMLExpressions.g:2313:5: ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) )
                    // InternalKerMLExpressions.g:2314:6: (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember )
                    {
                    // InternalKerMLExpressions.g:2314:6: (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember )
                    // InternalKerMLExpressions.g:2315:7: lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compResultExpressionMemberParserRuleCall_0_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
                    lv_ownedFeatureMembership_comp_3_0=ruleResultExpressionMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBodyExpressionRule());
                      							}
                      							add(
                      								current,
                      								"ownedFeatureMembership_comp",
                      								lv_ownedFeatureMembership_comp_3_0,
                      								"org.omg.kerml.expressions.xtext.KerMLExpressions.ResultExpressionMember");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getBodyExpressionAccess().getRightParenthesisKeyword_0_0_4());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2339:3: ( (lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping ) )
                    {
                    // InternalKerMLExpressions.g:2339:3: ( (lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping ) )
                    // InternalKerMLExpressions.g:2340:4: (lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping )
                    {
                    // InternalKerMLExpressions.g:2340:4: (lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping )
                    // InternalKerMLExpressions.g:2341:5: lv_ownedRelationship_comp_5_0= ruleOwnedFeatureTyping
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_comp_5_0=ruleOwnedFeatureTyping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBodyExpressionRule());
                      					}
                      					add(
                      						current,
                      						"ownedRelationship_comp",
                      						lv_ownedRelationship_comp_5_0,
                      						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureTyping");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleResultExpressionMember"
    // InternalKerMLExpressions.g:2362:1: entryRuleResultExpressionMember returns [EObject current=null] : iv_ruleResultExpressionMember= ruleResultExpressionMember EOF ;
    public final EObject entryRuleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:2362:63: (iv_ruleResultExpressionMember= ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:2363:2: iv_ruleResultExpressionMember= ruleResultExpressionMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultExpressionMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResultExpressionMember=ruleResultExpressionMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultExpressionMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2369:1: ruleResultExpressionMember returns [EObject current=null] : ( (lv_ownedResultExpression_comp_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedResultExpression_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2375:2: ( ( (lv_ownedResultExpression_comp_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:2376:2: ( (lv_ownedResultExpression_comp_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:2376:2: ( (lv_ownedResultExpression_comp_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:2377:3: (lv_ownedResultExpression_comp_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:2377:3: (lv_ownedResultExpression_comp_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:2378:4: lv_ownedResultExpression_comp_0_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getResultExpressionMemberAccess().getOwnedResultExpression_compOwnedExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedResultExpression_comp_0_0=ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getResultExpressionMemberRule());
              				}
              				set(
              					current,
              					"ownedResultExpression_comp",
              					lv_ownedResultExpression_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:2398:1: entryRuleBodyParameterMember returns [EObject current=null] : iv_ruleBodyParameterMember= ruleBodyParameterMember EOF ;
    public final EObject entryRuleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameterMember = null;


        try {
            // InternalKerMLExpressions.g:2398:60: (iv_ruleBodyParameterMember= ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:2399:2: iv_ruleBodyParameterMember= ruleBodyParameterMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyParameterMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBodyParameterMember=ruleBodyParameterMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBodyParameterMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2405:1: ruleBodyParameterMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) ) ) ;
    public final EObject ruleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedMemberParameter_comp_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2411:2: ( ( ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) ) ) )
            // InternalKerMLExpressions.g:2412:2: ( ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) ) )
            {
            // InternalKerMLExpressions.g:2412:2: ( ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) ) )
            // InternalKerMLExpressions.g:2413:3: ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) )
            {
            // InternalKerMLExpressions.g:2413:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalKerMLExpressions.g:2414:4: (lv_memberName_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:2414:4: (lv_memberName_0_0= ruleName )
            // InternalKerMLExpressions.g:2415:5: lv_memberName_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBodyParameterMemberAccess().getMemberNameNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_1);
            lv_memberName_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBodyParameterMemberRule());
              					}
              					set(
              						current,
              						"memberName",
              						lv_memberName_0_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.Name");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKerMLExpressions.g:2432:3: ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) )
            // InternalKerMLExpressions.g:2433:4: (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:2433:4: (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter )
            // InternalKerMLExpressions.g:2434:5: lv_ownedMemberParameter_comp_1_0= ruleBodyParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBodyParameterMemberAccess().getOwnedMemberParameter_compBodyParameterParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberParameter_comp_1_0=ruleBodyParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBodyParameterMemberRule());
              					}
              					set(
              						current,
              						"ownedMemberParameter_comp",
              						lv_ownedMemberParameter_comp_1_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:2455:1: entryRuleBodyParameter returns [EObject current=null] : iv_ruleBodyParameter= ruleBodyParameter EOF ;
    public final EObject entryRuleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameter = null;


        try {
            // InternalKerMLExpressions.g:2455:54: (iv_ruleBodyParameter= ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:2456:2: iv_ruleBodyParameter= ruleBodyParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBodyParameter=ruleBodyParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBodyParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2462:1: ruleBodyParameter returns [EObject current=null] : () ;
    public final EObject ruleBodyParameter() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2468:2: ( () )
            // InternalKerMLExpressions.g:2469:2: ()
            {
            // InternalKerMLExpressions.g:2469:2: ()
            // InternalKerMLExpressions.g:2470:3: 
            {
            if ( state.backtracking==0 ) {

              			current = forceCreateModelElement(
              				grammarAccess.getBodyParameterAccess().getFeatureAction(),
              				current);
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyParameter"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalKerMLExpressions.g:2479:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalKerMLExpressions.g:2479:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalKerMLExpressions.g:2480:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceConstructionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequenceConstructionExpression=ruleSequenceConstructionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceConstructionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2486:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' ) ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_operator_6_0=null;
        Token lv_operator_9_0=null;
        Token otherlv_11=null;
        EObject this_OwnedExpression_4 = null;

        EObject lv_operand_comp_7_0 = null;

        EObject lv_operand_comp_10_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2492:2: ( ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' ) ) )
            // InternalKerMLExpressions.g:2493:2: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' ) )
            {
            // InternalKerMLExpressions.g:2493:2: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==50) ) {
                    alt30=1;
                }
                else if ( ((LA30_1>=RULE_STRING_VALUE && LA30_1<=RULE_UNRESTRICTED_NAME)||(LA30_1>=24 && LA30_1<=27)||(LA30_1>=32 && LA30_1<=34)||(LA30_1>=40 && LA30_1<=43)||LA30_1==45||LA30_1==49||(LA30_1>=54 && LA30_1<=56)) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalKerMLExpressions.g:2494:3: ( () otherlv_1= '{' otherlv_2= '}' )
                    {
                    // InternalKerMLExpressions.g:2494:3: ( () otherlv_1= '{' otherlv_2= '}' )
                    // InternalKerMLExpressions.g:2495:4: () otherlv_1= '{' otherlv_2= '}'
                    {
                    // InternalKerMLExpressions.g:2495:4: ()
                    // InternalKerMLExpressions.g:2496:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSequenceConstructionExpressionAccess().getNullExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,49,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2512:3: (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' )
                    {
                    // InternalKerMLExpressions.g:2512:3: (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' )
                    // InternalKerMLExpressions.g:2513:4: otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getOwnedExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_OwnedExpression_4=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_OwnedExpression_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalKerMLExpressions.g:2525:4: ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )?
                    int alt29=3;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==51) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==52) ) {
                        alt29=2;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalKerMLExpressions.g:2526:5: ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) )
                            {
                            // InternalKerMLExpressions.g:2526:5: ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) )
                            // InternalKerMLExpressions.g:2527:6: () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) )
                            {
                            // InternalKerMLExpressions.g:2527:6: ()
                            // InternalKerMLExpressions.g:2528:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndAdd(
                              								grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperand_compAction_1_2_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalKerMLExpressions.g:2534:6: ( (lv_operator_6_0= ',' ) )
                            // InternalKerMLExpressions.g:2535:7: (lv_operator_6_0= ',' )
                            {
                            // InternalKerMLExpressions.g:2535:7: (lv_operator_6_0= ',' )
                            // InternalKerMLExpressions.g:2536:8: lv_operator_6_0= ','
                            {
                            lv_operator_6_0=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_0, grammarAccess.getSequenceConstructionExpressionAccess().getOperatorCommaKeyword_1_2_0_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getSequenceConstructionExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_0, ",");
                              							
                            }

                            }


                            }

                            // InternalKerMLExpressions.g:2548:6: ( (lv_operand_comp_7_0= ruleSequenceElementList ) )
                            // InternalKerMLExpressions.g:2549:7: (lv_operand_comp_7_0= ruleSequenceElementList )
                            {
                            // InternalKerMLExpressions.g:2549:7: (lv_operand_comp_7_0= ruleSequenceElementList )
                            // InternalKerMLExpressions.g:2550:8: lv_operand_comp_7_0= ruleSequenceElementList
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compSequenceElementListParserRuleCall_1_2_0_2_0());
                              							
                            }
                            pushFollow(FOLLOW_29);
                            lv_operand_comp_7_0=ruleSequenceElementList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                              								}
                              								add(
                              									current,
                              									"operand_comp",
                              									lv_operand_comp_7_0,
                              									"org.omg.kerml.expressions.xtext.KerMLExpressions.SequenceElementList");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalKerMLExpressions.g:2569:5: ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) )
                            {
                            // InternalKerMLExpressions.g:2569:5: ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) )
                            // InternalKerMLExpressions.g:2570:6: () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) )
                            {
                            // InternalKerMLExpressions.g:2570:6: ()
                            // InternalKerMLExpressions.g:2571:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndAdd(
                              								grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperand_compAction_1_2_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalKerMLExpressions.g:2577:6: ( (lv_operator_9_0= '..' ) )
                            // InternalKerMLExpressions.g:2578:7: (lv_operator_9_0= '..' )
                            {
                            // InternalKerMLExpressions.g:2578:7: (lv_operator_9_0= '..' )
                            // InternalKerMLExpressions.g:2579:8: lv_operator_9_0= '..'
                            {
                            lv_operator_9_0=(Token)match(input,52,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_9_0, grammarAccess.getSequenceConstructionExpressionAccess().getOperatorFullStopFullStopKeyword_1_2_1_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getSequenceConstructionExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_9_0, "..");
                              							
                            }

                            }


                            }

                            // InternalKerMLExpressions.g:2591:6: ( (lv_operand_comp_10_0= ruleOwnedExpression ) )
                            // InternalKerMLExpressions.g:2592:7: (lv_operand_comp_10_0= ruleOwnedExpression )
                            {
                            // InternalKerMLExpressions.g:2592:7: (lv_operand_comp_10_0= ruleOwnedExpression )
                            // InternalKerMLExpressions.g:2593:8: lv_operand_comp_10_0= ruleOwnedExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_1_2_0());
                              							
                            }
                            pushFollow(FOLLOW_29);
                            lv_operand_comp_10_0=ruleOwnedExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                              								}
                              								add(
                              									current,
                              									"operand_comp",
                              									lv_operand_comp_10_0,
                              									"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleSequenceElementList"
    // InternalKerMLExpressions.g:2621:1: entryRuleSequenceElementList returns [EObject current=null] : iv_ruleSequenceElementList= ruleSequenceElementList EOF ;
    public final EObject entryRuleSequenceElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceElementList = null;


        try {
            // InternalKerMLExpressions.g:2621:60: (iv_ruleSequenceElementList= ruleSequenceElementList EOF )
            // InternalKerMLExpressions.g:2622:2: iv_ruleSequenceElementList= ruleSequenceElementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceElementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequenceElementList=ruleSequenceElementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceElementList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceElementList"


    // $ANTLR start "ruleSequenceElementList"
    // InternalKerMLExpressions.g:2628:1: ruleSequenceElementList returns [EObject current=null] : (this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )? ) ;
    public final EObject ruleSequenceElementList() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_OwnedExpression_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2634:2: ( (this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )? ) )
            // InternalKerMLExpressions.g:2635:2: (this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )? )
            {
            // InternalKerMLExpressions.g:2635:2: (this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )? )
            // InternalKerMLExpressions.g:2636:3: this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSequenceElementListAccess().getOwnedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OwnedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:2644:3: ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKerMLExpressions.g:2645:4: () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) )
                    {
                    // InternalKerMLExpressions.g:2645:4: ()
                    // InternalKerMLExpressions.g:2646:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getSequenceElementListAccess().getOperatorExpressionOperand_compAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:2652:4: ( (lv_operator_2_0= ',' ) )
                    // InternalKerMLExpressions.g:2653:5: (lv_operator_2_0= ',' )
                    {
                    // InternalKerMLExpressions.g:2653:5: (lv_operator_2_0= ',' )
                    // InternalKerMLExpressions.g:2654:6: lv_operator_2_0= ','
                    {
                    lv_operator_2_0=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_2_0, grammarAccess.getSequenceElementListAccess().getOperatorCommaKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSequenceElementListRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_2_0, ",");
                      					
                    }

                    }


                    }

                    // InternalKerMLExpressions.g:2666:4: ( (lv_operand_comp_3_0= ruleSequenceElementList ) )
                    // InternalKerMLExpressions.g:2667:5: (lv_operand_comp_3_0= ruleSequenceElementList )
                    {
                    // InternalKerMLExpressions.g:2667:5: (lv_operand_comp_3_0= ruleSequenceElementList )
                    // InternalKerMLExpressions.g:2668:6: lv_operand_comp_3_0= ruleSequenceElementList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSequenceElementListAccess().getOperand_compSequenceElementListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_comp_3_0=ruleSequenceElementList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSequenceElementListRule());
                      						}
                      						add(
                      							current,
                      							"operand_comp",
                      							lv_operand_comp_3_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.SequenceElementList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceElementList"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalKerMLExpressions.g:2690:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalKerMLExpressions.g:2690:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:2691:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2697:1: ruleBaseExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_NullExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_FeatureReferenceExpression_2 = null;

        EObject this_InvocationExpression_3 = null;

        EObject this_ExtentExpression_Deprecated_4 = null;

        EObject this_OwnedExpression_6 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2703:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) ) )
            // InternalKerMLExpressions.g:2704:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) )
            {
            // InternalKerMLExpressions.g:2704:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) )
            int alt32=6;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalKerMLExpressions.g:2705:3: this_NullExpression_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getNullExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NullExpression_0=ruleNullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2714:3: this_LiteralExpression_1= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getLiteralExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2723:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getFeatureReferenceExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureReferenceExpression_2=ruleFeatureReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FeatureReferenceExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2732:3: this_InvocationExpression_3= ruleInvocationExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvocationExpression_3=ruleInvocationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvocationExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:2741:3: this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getExtentExpression_DeprecatedParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExtentExpression_Deprecated_4=ruleExtentExpression_Deprecated();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExtentExpression_Deprecated_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalKerMLExpressions.g:2750:3: (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' )
                    {
                    // InternalKerMLExpressions.g:2750:3: (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' )
                    // InternalKerMLExpressions.g:2751:4: otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBaseExpressionAccess().getOwnedExpressionParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_OwnedExpression_6=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_OwnedExpression_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_7=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleFeatureReferenceExpression"
    // InternalKerMLExpressions.g:2772:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2772:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:2773:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReferenceExpression=ruleFeatureReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureReferenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2779:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( (lv_ownedMembership_comp_0_0= ruleFeatureReferenceMember ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMembership_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2785:2: ( ( (lv_ownedMembership_comp_0_0= ruleFeatureReferenceMember ) ) )
            // InternalKerMLExpressions.g:2786:2: ( (lv_ownedMembership_comp_0_0= ruleFeatureReferenceMember ) )
            {
            // InternalKerMLExpressions.g:2786:2: ( (lv_ownedMembership_comp_0_0= ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:2787:3: (lv_ownedMembership_comp_0_0= ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:2787:3: (lv_ownedMembership_comp_0_0= ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:2788:4: lv_ownedMembership_comp_0_0= ruleFeatureReferenceMember
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedMembership_compFeatureReferenceMemberParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMembership_comp_0_0=ruleFeatureReferenceMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFeatureReferenceExpressionRule());
              				}
              				add(
              					current,
              					"ownedMembership_comp",
              					lv_ownedMembership_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.FeatureReferenceMember");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:2808:1: entryRuleFeatureReferenceMember returns [EObject current=null] : iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF ;
    public final EObject entryRuleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2808:63: (iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:2809:2: iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureReferenceMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReferenceMember=ruleFeatureReferenceMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureReferenceMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2815:1: ruleFeatureReferenceMember returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2821:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:2822:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:2822:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:2823:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:2823:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:2824:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFeatureReferenceMemberRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:2841:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLExpressions.g:2841:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:2842:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvocationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvocationExpression=ruleInvocationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvocationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:2848:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedRelationship_comp_0_0 = null;

        EObject this_ArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2854:2: ( ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')' ) )
            // InternalKerMLExpressions.g:2855:2: ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')' )
            {
            // InternalKerMLExpressions.g:2855:2: ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')' )
            // InternalKerMLExpressions.g:2856:3: ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')'
            {
            // InternalKerMLExpressions.g:2856:3: ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:2857:4: (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:2857:4: (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:2858:5: lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvocationExpressionAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_ownedRelationship_comp_0_0=ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvocationExpressionRule());
              					}
              					add(
              						current,
              						"ownedRelationship_comp",
              						lv_ownedRelationship_comp_0_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureTyping");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvocationExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalKerMLExpressions.g:2879:3: (this_ArgumentList_2= ruleArgumentList[$current] )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EOF||(LA33_0>=RULE_STRING_VALUE && LA33_0<=RULE_UNRESTRICTED_NAME)||(LA33_0>=24 && LA33_0<=27)||(LA33_0>=32 && LA33_0<=34)||(LA33_0>=40 && LA33_0<=43)||LA33_0==45||LA33_0==49||(LA33_0>=54 && LA33_0<=56)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKerMLExpressions.g:2880:4: this_ArgumentList_2= ruleArgumentList[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getInvocationExpressionRule());
                      				}
                      				newCompositeNode(grammarAccess.getInvocationExpressionAccess().getArgumentListParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_ArgumentList_2=ruleArgumentList(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ArgumentList_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInvocationExpressionAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:2901:1: ruleArgumentList[EObject in_current] returns [EObject current=in_current] : (this_PositionalArgumentList_0= rulePositionalArgumentList[$current] | this_NamedArgumentList_1= ruleNamedArgumentList[$current] ) ;
    public final EObject ruleArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalArgumentList_0 = null;

        EObject this_NamedArgumentList_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2907:2: ( (this_PositionalArgumentList_0= rulePositionalArgumentList[$current] | this_NamedArgumentList_1= ruleNamedArgumentList[$current] ) )
            // InternalKerMLExpressions.g:2908:2: (this_PositionalArgumentList_0= rulePositionalArgumentList[$current] | this_NamedArgumentList_1= ruleNamedArgumentList[$current] )
            {
            // InternalKerMLExpressions.g:2908:2: (this_PositionalArgumentList_0= rulePositionalArgumentList[$current] | this_NamedArgumentList_1= ruleNamedArgumentList[$current] )
            int alt34=2;
            switch ( input.LA(1) ) {
            case RULE_STRING_VALUE:
            case RULE_DECIMAL_VALUE:
            case RULE_EXP_VALUE:
            case 24:
            case 25:
            case 26:
            case 27:
            case 32:
            case 33:
            case 34:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 49:
            case 54:
            case 55:
            case 56:
                {
                alt34=1;
                }
                break;
            case RULE_ID:
                {
                int LA34_2 = input.LA(2);

                if ( ((LA34_2>=15 && LA34_2<=38)||LA34_2==43||(LA34_2>=45 && LA34_2<=48)||LA34_2==51||LA34_2==57) ) {
                    alt34=1;
                }
                else if ( (LA34_2==53) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA34_3 = input.LA(2);

                if ( ((LA34_3>=15 && LA34_3<=38)||LA34_3==43||(LA34_3>=45 && LA34_3<=48)||LA34_3==51||LA34_3==57) ) {
                    alt34=1;
                }
                else if ( (LA34_3==53) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalKerMLExpressions.g:2909:3: this_PositionalArgumentList_0= rulePositionalArgumentList[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getArgumentListRule());
                      			}
                      			newCompositeNode(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PositionalArgumentList_0=rulePositionalArgumentList(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PositionalArgumentList_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2921:3: this_NamedArgumentList_1= ruleNamedArgumentList[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getArgumentListRule());
                      			}
                      			newCompositeNode(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NamedArgumentList_1=ruleNamedArgumentList(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NamedArgumentList_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:2937:1: rulePositionalArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )* ) ;
    public final EObject rulePositionalArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedFeatureMembership_comp_0_0 = null;

        EObject lv_ownedFeatureMembership_comp_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2943:2: ( ( ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:2944:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:2944:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:2945:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:2945:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:2946:4: (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:2946:4: (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:2947:5: lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compOwnedExpressionMemberParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_ownedFeatureMembership_comp_0_0=ruleOwnedExpressionMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPositionalArgumentListRule());
              					}
              					add(
              						current,
              						"ownedFeatureMembership_comp",
              						lv_ownedFeatureMembership_comp_0_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKerMLExpressions.g:2964:3: (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==51) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2965:4: otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalKerMLExpressions.g:2969:4: ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) )
            	    // InternalKerMLExpressions.g:2970:5: (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:2970:5: (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember )
            	    // InternalKerMLExpressions.g:2971:6: lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compOwnedExpressionMemberParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_ownedFeatureMembership_comp_2_0=ruleOwnedExpressionMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPositionalArgumentListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedFeatureMembership_comp",
            	      							lv_ownedFeatureMembership_comp_2_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionMember");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:2994:1: ruleNamedArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )* ) ;
    public final EObject ruleNamedArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedFeatureMembership_comp_0_0 = null;

        EObject lv_ownedFeatureMembership_comp_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3000:2: ( ( ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:3001:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:3001:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:3002:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:3002:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:3003:4: (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:3003:4: (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:3004:5: lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compNamedExpressionMemberParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_ownedFeatureMembership_comp_0_0=ruleNamedExpressionMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNamedArgumentListRule());
              					}
              					add(
              						current,
              						"ownedFeatureMembership_comp",
              						lv_ownedFeatureMembership_comp_0_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.NamedExpressionMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKerMLExpressions.g:3021:3: (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==51) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3022:4: otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalKerMLExpressions.g:3026:4: ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) )
            	    // InternalKerMLExpressions.g:3027:5: (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:3027:5: (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember )
            	    // InternalKerMLExpressions.g:3028:6: lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compNamedExpressionMemberParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_ownedFeatureMembership_comp_2_0=ruleNamedExpressionMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNamedArgumentListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedFeatureMembership_comp",
            	      							lv_ownedFeatureMembership_comp_2_0,
            	      							"org.omg.kerml.expressions.xtext.KerMLExpressions.NamedExpressionMember");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3050:1: entryRuleNamedExpressionMember returns [EObject current=null] : iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF ;
    public final EObject entryRuleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:3050:62: (iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF )
            // InternalKerMLExpressions.g:3051:2: iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedExpressionMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedExpressionMember=ruleNamedExpressionMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedExpressionMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3057:1: ruleNamedExpressionMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) ) ) ;
    public final EObject ruleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedMemberFeature_comp_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3063:2: ( ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) ) ) )
            // InternalKerMLExpressions.g:3064:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) ) )
            {
            // InternalKerMLExpressions.g:3064:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:3065:3: ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:3065:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalKerMLExpressions.g:3066:4: (lv_memberName_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:3066:4: (lv_memberName_0_0= ruleName )
            // InternalKerMLExpressions.g:3067:5: lv_memberName_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_memberName_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNamedExpressionMemberAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalKerMLExpressions.g:3088:3: ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:3089:4: (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:3089:4: (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:3090:5: lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getOwnedMemberFeature_compOwnedExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberFeature_comp_2_0=ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNamedExpressionMemberRule());
              					}
              					set(
              						current,
              						"ownedMemberFeature_comp",
              						lv_ownedMemberFeature_comp_2_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3111:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalKerMLExpressions.g:3111:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLExpressions.g:3112:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3118:1: ruleNullExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3124:2: ( ( () otherlv_1= 'null' ) )
            // InternalKerMLExpressions.g:3125:2: ( () otherlv_1= 'null' )
            {
            // InternalKerMLExpressions.g:3125:2: ( () otherlv_1= 'null' )
            // InternalKerMLExpressions.g:3126:3: () otherlv_1= 'null'
            {
            // InternalKerMLExpressions.g:3126:3: ()
            // InternalKerMLExpressions.g:3127:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3141:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLExpressions.g:3141:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:3142:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3148:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralInteger_2 = null;

        EObject this_LiteralReal_3 = null;

        EObject this_LiteralUnbounded_4 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3154:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded ) )
            // InternalKerMLExpressions.g:3155:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded )
            {
            // InternalKerMLExpressions.g:3155:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 55:
            case 56:
                {
                alt37=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt37=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA37_3 = input.LA(2);

                if ( (LA37_3==EOF||(LA37_3>=14 && LA37_3<=39)||(LA37_3>=46 && LA37_3<=48)||(LA37_3>=50 && LA37_3<=52)) ) {
                    alt37=3;
                }
                else if ( (LA37_3==43) ) {
                    alt37=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 43:
                {
                alt37=4;
                }
                break;
            case 34:
                {
                alt37=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalKerMLExpressions.g:3156:3: this_LiteralBoolean_0= ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralBoolean_0=ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralBoolean_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3165:3: this_LiteralString_1= ruleLiteralString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralString_1=ruleLiteralString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:3174:3: this_LiteralInteger_2= ruleLiteralInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralInteger_2=ruleLiteralInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:3183:3: this_LiteralReal_3= ruleLiteralReal
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralRealParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralReal_3=ruleLiteralReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralReal_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:3192:3: this_LiteralUnbounded_4= ruleLiteralUnbounded
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralUnboundedParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralUnbounded_4=ruleLiteralUnbounded();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralUnbounded_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3204:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLExpressions.g:3204:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:3205:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3211:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3217:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalKerMLExpressions.g:3218:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalKerMLExpressions.g:3218:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalKerMLExpressions.g:3219:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:3219:3: (lv_value_0_0= ruleBooleanValue )
            // InternalKerMLExpressions.g:3220:4: lv_value_0_0= ruleBooleanValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3240:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLExpressions.g:3240:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:3241:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3247:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3253:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLExpressions.g:3254:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLExpressions.g:3254:2: (kw= 'true' | kw= 'false' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            else if ( (LA38_0==56) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalKerMLExpressions.g:3255:3: kw= 'true'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3261:3: kw= 'false'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3270:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // InternalKerMLExpressions.g:3270:54: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLExpressions.g:3271:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralString=ruleLiteralString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3277:1: ruleLiteralString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3283:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalKerMLExpressions.g:3284:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalKerMLExpressions.g:3284:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:3285:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:3285:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:3286:4: lv_value_0_0= RULE_STRING_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getLiteralStringAccess().getValueSTRING_VALUETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3305:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLExpressions.g:3305:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:3306:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInteger=ruleLiteralInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3312:1: ruleLiteralInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3318:2: ( ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) )
            // InternalKerMLExpressions.g:3319:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            {
            // InternalKerMLExpressions.g:3319:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:3320:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:3320:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:3321:4: lv_value_0_0= RULE_DECIMAL_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getLiteralIntegerAccess().getValueDECIMAL_VALUETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3340:1: entryRuleLiteralReal returns [EObject current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final EObject entryRuleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralReal = null;


        try {
            // InternalKerMLExpressions.g:3340:52: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:3341:2: iv_ruleLiteralReal= ruleLiteralReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRealRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralReal=ruleLiteralReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralReal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3347:1: ruleLiteralReal returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleLiteralReal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3353:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalKerMLExpressions.g:3354:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalKerMLExpressions.g:3354:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalKerMLExpressions.g:3355:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalKerMLExpressions.g:3355:3: (lv_value_0_0= ruleRealValue )
            // InternalKerMLExpressions.g:3356:4: lv_value_0_0= ruleRealValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLiteralRealAccess().getValueRealValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleRealValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3376:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLExpressions.g:3376:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLExpressions.g:3377:2: iv_ruleRealValue= ruleRealValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3383:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3389:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLExpressions.g:3390:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLExpressions.g:3390:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_DECIMAL_VALUE||LA41_0==43) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_EXP_VALUE) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalKerMLExpressions.g:3391:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLExpressions.g:3391:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLExpressions.g:3392:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:3392:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_DECIMAL_VALUE) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalKerMLExpressions.g:3393:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_DECIMAL_VALUE_0);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,43,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalKerMLExpressions.g:3406:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_DECIMAL_VALUE) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==RULE_EXP_VALUE) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalKerMLExpressions.g:3407:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_DECIMAL_VALUE_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalKerMLExpressions.g:3415:5: this_EXP_VALUE_3= RULE_EXP_VALUE
                            {
                            this_EXP_VALUE_3=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_EXP_VALUE_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_EXP_VALUE_3, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3425:3: this_EXP_VALUE_4= RULE_EXP_VALUE
                    {
                    this_EXP_VALUE_4=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXP_VALUE_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXP_VALUE_4, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleLiteralUnbounded"
    // InternalKerMLExpressions.g:3436:1: entryRuleLiteralUnbounded returns [EObject current=null] : iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF ;
    public final EObject entryRuleLiteralUnbounded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnbounded = null;


        try {
            // InternalKerMLExpressions.g:3436:57: (iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF )
            // InternalKerMLExpressions.g:3437:2: iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralUnboundedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralUnbounded=ruleLiteralUnbounded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralUnbounded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralUnbounded"


    // $ANTLR start "ruleLiteralUnbounded"
    // InternalKerMLExpressions.g:3443:1: ruleLiteralUnbounded returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleLiteralUnbounded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3449:2: ( ( () otherlv_1= '*' ) )
            // InternalKerMLExpressions.g:3450:2: ( () otherlv_1= '*' )
            {
            // InternalKerMLExpressions.g:3450:2: ( () otherlv_1= '*' )
            // InternalKerMLExpressions.g:3451:3: () otherlv_1= '*'
            {
            // InternalKerMLExpressions.g:3451:3: ()
            // InternalKerMLExpressions.g:3452:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLiteralUnboundedAccess().getLiteralUnboundedAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLiteralUnboundedAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralUnbounded"


    // $ANTLR start "entryRuleName"
    // InternalKerMLExpressions.g:3466:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLExpressions.g:3466:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLExpressions.g:3467:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3473:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3479:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLExpressions.g:3480:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLExpressions.g:3480:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_UNRESTRICTED_NAME) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalKerMLExpressions.g:3481:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3489:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
                    {
                    this_UNRESTRICTED_NAME_1=(Token)match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UNRESTRICTED_NAME_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_UNRESTRICTED_NAME_1, grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKerMLExpressions.g:3500:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:3500:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:3501:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKerMLExpressions.g:3507:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3513:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalKerMLExpressions.g:3514:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalKerMLExpressions.g:3514:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 57:
                    {
                    alt43=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 45:
                case 46:
                case 47:
                case 48:
                case 50:
                case 51:
                case 52:
                    {
                    alt43=1;
                    }
                    break;
                case 43:
                    {
                    int LA43_5 = input.LA(3);

                    if ( ((LA43_5>=RULE_ID && LA43_5<=RULE_UNRESTRICTED_NAME)) ) {
                        alt43=3;
                    }
                    else if ( (LA43_5==44) ) {
                        alt43=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA43_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    int LA43_5 = input.LA(3);

                    if ( ((LA43_5>=RULE_ID && LA43_5<=RULE_UNRESTRICTED_NAME)) ) {
                        alt43=3;
                    }
                    else if ( (LA43_5==44) ) {
                        alt43=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 57:
                    {
                    alt43=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 45:
                case 46:
                case 47:
                case 48:
                case 50:
                case 51:
                case 52:
                    {
                    alt43=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalKerMLExpressions.g:3515:3: this_Name_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Name_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3526:3: this_ColonQualifiedName_1= ruleColonQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQualifiedNameAccess().getColonQualifiedNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ColonQualifiedName_1=ruleColonQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ColonQualifiedName_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:3537:3: this_DotQualifiedName_2= ruleDotQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQualifiedNameAccess().getDotQualifiedNameParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DotQualifiedName_2=ruleDotQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DotQualifiedName_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleColonQualifiedName"
    // InternalKerMLExpressions.g:3551:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:3551:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalKerMLExpressions.g:3552:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColonQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColonQualifiedName=ruleColonQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColonQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonQualifiedName"


    // $ANTLR start "ruleColonQualifiedName"
    // InternalKerMLExpressions.g:3558:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3564:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalKerMLExpressions.g:3565:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalKerMLExpressions.g:3565:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalKerMLExpressions.g:3566:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Name_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:3576:3: (kw= '::' this_Name_2= ruleName )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==57) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3577:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,57,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_36);
            	    this_Name_2=ruleName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Name_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonQualifiedName"


    // $ANTLR start "entryRuleDotQualifiedName"
    // InternalKerMLExpressions.g:3597:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:3597:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalKerMLExpressions.g:3598:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDotQualifiedName=ruleDotQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotQualifiedName"


    // $ANTLR start "ruleDotQualifiedName"
    // InternalKerMLExpressions.g:3604:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3610:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalKerMLExpressions.g:3611:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalKerMLExpressions.g:3611:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalKerMLExpressions.g:3612:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Name_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:3622:3: (kw= '.' this_Name_2= ruleName )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==43) ) {
                    int LA45_2 = input.LA(2);

                    if ( ((LA45_2>=RULE_ID && LA45_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3623:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,43,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_37);
            	    this_Name_2=ruleName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Name_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotQualifiedName"

    // $ANTLR start synpred1_InternalKerMLExpressions
    public final void synpred1_InternalKerMLExpressions_fragment() throws RecognitionException {   
        // InternalKerMLExpressions.g:2250:4: ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )
        // InternalKerMLExpressions.g:2250:5: ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' )
        {
        // InternalKerMLExpressions.g:2250:5: ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' )
        // InternalKerMLExpressions.g:2251:5: ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')'
        {
        // InternalKerMLExpressions.g:2251:5: ( ( ruleBodyParameterMember ) )
        // InternalKerMLExpressions.g:2252:6: ( ruleBodyParameterMember )
        {
        // InternalKerMLExpressions.g:2252:6: ( ruleBodyParameterMember )
        // InternalKerMLExpressions.g:2253:7: ruleBodyParameterMember
        {
        pushFollow(FOLLOW_28);
        ruleBodyParameterMember();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKerMLExpressions.g:2256:5: ( ( ruleBodyParameterMember ) )*
        loop46:
        do {
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt46=1;
            }


            switch (alt46) {
        	case 1 :
        	    // InternalKerMLExpressions.g:2257:6: ( ruleBodyParameterMember )
        	    {
        	    // InternalKerMLExpressions.g:2257:6: ( ruleBodyParameterMember )
        	    // InternalKerMLExpressions.g:2258:7: ruleBodyParameterMember
        	    {
        	    pushFollow(FOLLOW_28);
        	    ruleBodyParameterMember();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop46;
            }
        } while (true);

        match(input,45,FOLLOW_4); if (state.failed) return ;
        // InternalKerMLExpressions.g:2262:5: ( ( ruleResultExpressionMember ) )
        // InternalKerMLExpressions.g:2263:6: ( ruleResultExpressionMember )
        {
        // InternalKerMLExpressions.g:2263:6: ( ruleResultExpressionMember )
        // InternalKerMLExpressions.g:2264:7: ruleResultExpressionMember
        {
        pushFollow(FOLLOW_25);
        ruleResultExpressionMember();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,46,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalKerMLExpressions

    // Delegated rules

    public final boolean synpred1_InternalKerMLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKerMLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA32 dfa32 = new DFA32(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\3\uffff\2\11\5\uffff\2\11\1\uffff\2\11";
    static final String dfa_3s = "\1\4\2\uffff\2\16\1\uffff\2\7\2\uffff\2\16\1\uffff\2\16";
    static final String dfa_4s = "\1\70\2\uffff\2\71\1\uffff\1\54\1\10\2\uffff\2\64\1\uffff\2\71";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\6\2\uffff\1\4\1\3\2\uffff\1\5\2\uffff";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\3\2\1\3\1\4\31\uffff\1\2\10\uffff\1\2\1\uffff\1\5\10\uffff\1\1\2\2",
            "",
            "",
            "\32\11\3\uffff\1\6\1\uffff\1\10\3\11\1\uffff\3\11\4\uffff\1\7",
            "\32\11\3\uffff\1\6\1\uffff\1\10\3\11\1\uffff\3\11\4\uffff\1\7",
            "",
            "\1\12\1\13\43\uffff\1\14",
            "\1\15\1\16",
            "",
            "",
            "\32\11\3\uffff\1\6\1\uffff\1\10\3\11\1\uffff\3\11",
            "\32\11\3\uffff\1\6\1\uffff\1\10\3\11\1\uffff\3\11",
            "",
            "\32\11\3\uffff\1\14\1\uffff\1\10\3\11\1\uffff\3\11\4\uffff\1\7",
            "\32\11\3\uffff\1\14\1\uffff\1\10\3\11\1\uffff\3\11\4\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2704:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x01C22F07000001F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001800000000182L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000180L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x01C26F07000001F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000002L});

}