package org.omg.kerml.expressions.xtext.parser.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_VALUE", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_DOCUMENTATION_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "':'", "'?'", "'??'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'instanceof'", "'hastype'", "'istype'", "'@'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'@['", "']'", "'!'", "'~'", "'all'", "'.'", "'allInstances'", "'('", "')'", "'['", "'->'", "'ordered'", "'nonunique'", "'defined'", "'by'", "'{'", "'}'", "','", "'..'", "'=>'", "'null'", "'true'", "'false'", "'::'", "'doc'", "'id'", "'public'", "'private'", "'protected'", "'packaged'"
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
    // InternalKerMLExpressions.g:65:1: entryRuleOwnedExpressionMember returns [EObject current=null] : iv_ruleOwnedExpressionMember= ruleOwnedExpressionMember EOF ;
    public final EObject entryRuleOwnedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:65:62: (iv_ruleOwnedExpressionMember= ruleOwnedExpressionMember EOF )
            // InternalKerMLExpressions.g:66:2: iv_ruleOwnedExpressionMember= ruleOwnedExpressionMember EOF
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
    // InternalKerMLExpressions.g:72:1: ruleOwnedExpressionMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleOwnedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:78:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:79:2: ( (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:79:2: ( (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:80:3: (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:80:3: (lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:81:4: lv_ownedMemberFeature_comp_0_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:101:1: entryRuleOwnedExpression returns [EObject current=null] : iv_ruleOwnedExpression= ruleOwnedExpression EOF ;
    public final EObject entryRuleOwnedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedExpression = null;


        try {
            // InternalKerMLExpressions.g:101:56: (iv_ruleOwnedExpression= ruleOwnedExpression EOF )
            // InternalKerMLExpressions.g:102:2: iv_ruleOwnedExpression= ruleOwnedExpression EOF
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
    // InternalKerMLExpressions.g:108:1: ruleOwnedExpression returns [EObject current=null] : this_ConditionalExpression_0= ruleConditionalExpression ;
    public final EObject ruleOwnedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:114:2: (this_ConditionalExpression_0= ruleConditionalExpression )
            // InternalKerMLExpressions.g:115:2: this_ConditionalExpression_0= ruleConditionalExpression
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
    // InternalKerMLExpressions.g:126:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalKerMLExpressions.g:126:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalKerMLExpressions.g:127:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
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
    // InternalKerMLExpressions.g:133:1: ruleConditionalExpression returns [EObject current=null] : (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NullCoalescingExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;

        EObject lv_operand_comp_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:139:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )? ) )
            // InternalKerMLExpressions.g:140:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )? )
            {
            // InternalKerMLExpressions.g:140:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )? )
            // InternalKerMLExpressions.g:141:3: this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )?
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
            // InternalKerMLExpressions.g:149:3: ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKerMLExpressions.g:150:4: () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_comp_5_0= ruleConditionalExpression ) )
                    {
                    // InternalKerMLExpressions.g:150:4: ()
                    // InternalKerMLExpressions.g:151:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:157:4: ( (lv_operator_2_0= ruleConditionalTestOperator ) )
                    // InternalKerMLExpressions.g:158:5: (lv_operator_2_0= ruleConditionalTestOperator )
                    {
                    // InternalKerMLExpressions.g:158:5: (lv_operator_2_0= ruleConditionalTestOperator )
                    // InternalKerMLExpressions.g:159:6: lv_operator_2_0= ruleConditionalTestOperator
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

                    // InternalKerMLExpressions.g:176:4: ( (lv_operand_comp_3_0= ruleOwnedExpression ) )
                    // InternalKerMLExpressions.g:177:5: (lv_operand_comp_3_0= ruleOwnedExpression )
                    {
                    // InternalKerMLExpressions.g:177:5: (lv_operand_comp_3_0= ruleOwnedExpression )
                    // InternalKerMLExpressions.g:178:6: lv_operand_comp_3_0= ruleOwnedExpression
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
                    // InternalKerMLExpressions.g:199:4: ( (lv_operand_comp_5_0= ruleConditionalExpression ) )
                    // InternalKerMLExpressions.g:200:5: (lv_operand_comp_5_0= ruleConditionalExpression )
                    {
                    // InternalKerMLExpressions.g:200:5: (lv_operand_comp_5_0= ruleConditionalExpression )
                    // InternalKerMLExpressions.g:201:6: lv_operand_comp_5_0= ruleConditionalExpression
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
    // InternalKerMLExpressions.g:223:1: entryRuleConditionalTestOperator returns [String current=null] : iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF ;
    public final String entryRuleConditionalTestOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalTestOperator = null;


        try {
            // InternalKerMLExpressions.g:223:63: (iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF )
            // InternalKerMLExpressions.g:224:2: iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF
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
    // InternalKerMLExpressions.g:230:1: ruleConditionalTestOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken ruleConditionalTestOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:236:2: (kw= '?' )
            // InternalKerMLExpressions.g:237:2: kw= '?'
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
    // InternalKerMLExpressions.g:245:1: entryRuleNullCoalescingExpression returns [EObject current=null] : iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF ;
    public final EObject entryRuleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCoalescingExpression = null;


        try {
            // InternalKerMLExpressions.g:245:65: (iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF )
            // InternalKerMLExpressions.g:246:2: iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF
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
    // InternalKerMLExpressions.g:252:1: ruleNullCoalescingExpression returns [EObject current=null] : (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )* ) ;
    public final EObject ruleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalOrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:258:2: ( (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )* ) )
            // InternalKerMLExpressions.g:259:2: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:259:2: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )* )
            // InternalKerMLExpressions.g:260:3: this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )*
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
            // InternalKerMLExpressions.g:268:3: ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKerMLExpressions.g:269:4: () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:269:4: ()
            	    // InternalKerMLExpressions.g:270:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:276:4: ( (lv_operator_2_0= ruleNullCoalescingOperator ) )
            	    // InternalKerMLExpressions.g:277:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    {
            	    // InternalKerMLExpressions.g:277:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    // InternalKerMLExpressions.g:278:6: lv_operator_2_0= ruleNullCoalescingOperator
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

            	    // InternalKerMLExpressions.g:295:4: ( (lv_operand_comp_3_0= ruleConditionalOrExpression ) )
            	    // InternalKerMLExpressions.g:296:5: (lv_operand_comp_3_0= ruleConditionalOrExpression )
            	    {
            	    // InternalKerMLExpressions.g:296:5: (lv_operand_comp_3_0= ruleConditionalOrExpression )
            	    // InternalKerMLExpressions.g:297:6: lv_operand_comp_3_0= ruleConditionalOrExpression
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
    // InternalKerMLExpressions.g:319:1: entryRuleNullCoalescingOperator returns [String current=null] : iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF ;
    public final String entryRuleNullCoalescingOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullCoalescingOperator = null;


        try {
            // InternalKerMLExpressions.g:319:62: (iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF )
            // InternalKerMLExpressions.g:320:2: iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF
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
    // InternalKerMLExpressions.g:326:1: ruleNullCoalescingOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '??' ;
    public final AntlrDatatypeRuleToken ruleNullCoalescingOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:332:2: (kw= '??' )
            // InternalKerMLExpressions.g:333:2: kw= '??'
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
    // InternalKerMLExpressions.g:341:1: entryRuleConditionalOrExpression returns [EObject current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
    public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOrExpression = null;


        try {
            // InternalKerMLExpressions.g:341:64: (iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF )
            // InternalKerMLExpressions.g:342:2: iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF
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
    // InternalKerMLExpressions.g:348:1: ruleConditionalOrExpression returns [EObject current=null] : (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )* ) ;
    public final EObject ruleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalAndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:354:2: ( (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:355:2: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:355:2: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )* )
            // InternalKerMLExpressions.g:356:3: this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )*
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
            // InternalKerMLExpressions.g:364:3: ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKerMLExpressions.g:365:4: () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:365:4: ()
            	    // InternalKerMLExpressions.g:366:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getConditionalOrExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:372:4: ( (lv_operator_2_0= ruleConditionalOrOperator ) )
            	    // InternalKerMLExpressions.g:373:5: (lv_operator_2_0= ruleConditionalOrOperator )
            	    {
            	    // InternalKerMLExpressions.g:373:5: (lv_operator_2_0= ruleConditionalOrOperator )
            	    // InternalKerMLExpressions.g:374:6: lv_operator_2_0= ruleConditionalOrOperator
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

            	    // InternalKerMLExpressions.g:391:4: ( (lv_operand_comp_3_0= ruleConditionalAndExpression ) )
            	    // InternalKerMLExpressions.g:392:5: (lv_operand_comp_3_0= ruleConditionalAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:392:5: (lv_operand_comp_3_0= ruleConditionalAndExpression )
            	    // InternalKerMLExpressions.g:393:6: lv_operand_comp_3_0= ruleConditionalAndExpression
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
    // InternalKerMLExpressions.g:415:1: entryRuleConditionalOrOperator returns [String current=null] : iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF ;
    public final String entryRuleConditionalOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOrOperator = null;


        try {
            // InternalKerMLExpressions.g:415:61: (iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF )
            // InternalKerMLExpressions.g:416:2: iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF
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
    // InternalKerMLExpressions.g:422:1: ruleConditionalOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleConditionalOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:428:2: (kw= '||' )
            // InternalKerMLExpressions.g:429:2: kw= '||'
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
    // InternalKerMLExpressions.g:437:1: entryRuleConditionalAndExpression returns [EObject current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
    public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAndExpression = null;


        try {
            // InternalKerMLExpressions.g:437:65: (iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF )
            // InternalKerMLExpressions.g:438:2: iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF
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
    // InternalKerMLExpressions.g:444:1: ruleConditionalAndExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:450:2: ( (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )* ) )
            // InternalKerMLExpressions.g:451:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:451:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )* )
            // InternalKerMLExpressions.g:452:3: this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )*
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
            // InternalKerMLExpressions.g:460:3: ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKerMLExpressions.g:461:4: () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_comp_3_0= ruleOrExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:461:4: ()
            	    // InternalKerMLExpressions.g:462:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getConditionalAndExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:468:4: ( (lv_operator_2_0= ruleConditionalAndOperator ) )
            	    // InternalKerMLExpressions.g:469:5: (lv_operator_2_0= ruleConditionalAndOperator )
            	    {
            	    // InternalKerMLExpressions.g:469:5: (lv_operator_2_0= ruleConditionalAndOperator )
            	    // InternalKerMLExpressions.g:470:6: lv_operator_2_0= ruleConditionalAndOperator
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

            	    // InternalKerMLExpressions.g:487:4: ( (lv_operand_comp_3_0= ruleOrExpression ) )
            	    // InternalKerMLExpressions.g:488:5: (lv_operand_comp_3_0= ruleOrExpression )
            	    {
            	    // InternalKerMLExpressions.g:488:5: (lv_operand_comp_3_0= ruleOrExpression )
            	    // InternalKerMLExpressions.g:489:6: lv_operand_comp_3_0= ruleOrExpression
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
    // InternalKerMLExpressions.g:511:1: entryRuleConditionalAndOperator returns [String current=null] : iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF ;
    public final String entryRuleConditionalAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalAndOperator = null;


        try {
            // InternalKerMLExpressions.g:511:62: (iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF )
            // InternalKerMLExpressions.g:512:2: iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF
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
    // InternalKerMLExpressions.g:518:1: ruleConditionalAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleConditionalAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:524:2: (kw= '&&' )
            // InternalKerMLExpressions.g:525:2: kw= '&&'
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
    // InternalKerMLExpressions.g:533:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalKerMLExpressions.g:533:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLExpressions.g:534:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalKerMLExpressions.g:540:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:546:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )* ) )
            // InternalKerMLExpressions.g:547:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:547:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )* )
            // InternalKerMLExpressions.g:548:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )*
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
            // InternalKerMLExpressions.g:556:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKerMLExpressions.g:557:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_comp_3_0= ruleXorExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:557:4: ()
            	    // InternalKerMLExpressions.g:558:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:564:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalKerMLExpressions.g:565:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalKerMLExpressions.g:565:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalKerMLExpressions.g:566:6: lv_operator_2_0= ruleOrOperator
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

            	    // InternalKerMLExpressions.g:583:4: ( (lv_operand_comp_3_0= ruleXorExpression ) )
            	    // InternalKerMLExpressions.g:584:5: (lv_operand_comp_3_0= ruleXorExpression )
            	    {
            	    // InternalKerMLExpressions.g:584:5: (lv_operand_comp_3_0= ruleXorExpression )
            	    // InternalKerMLExpressions.g:585:6: lv_operand_comp_3_0= ruleXorExpression
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
    // InternalKerMLExpressions.g:607:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalKerMLExpressions.g:607:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalKerMLExpressions.g:608:2: iv_ruleOrOperator= ruleOrOperator EOF
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
    // InternalKerMLExpressions.g:614:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:620:2: (kw= '|' )
            // InternalKerMLExpressions.g:621:2: kw= '|'
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
    // InternalKerMLExpressions.g:629:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalKerMLExpressions.g:629:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLExpressions.g:630:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalKerMLExpressions.g:636:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:642:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:643:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:643:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )* )
            // InternalKerMLExpressions.g:644:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )*
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
            // InternalKerMLExpressions.g:652:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKerMLExpressions.g:653:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_comp_3_0= ruleAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:653:4: ()
            	    // InternalKerMLExpressions.g:654:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:660:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalKerMLExpressions.g:661:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalKerMLExpressions.g:661:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalKerMLExpressions.g:662:6: lv_operator_2_0= ruleXorOperator
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

            	    // InternalKerMLExpressions.g:679:4: ( (lv_operand_comp_3_0= ruleAndExpression ) )
            	    // InternalKerMLExpressions.g:680:5: (lv_operand_comp_3_0= ruleAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:680:5: (lv_operand_comp_3_0= ruleAndExpression )
            	    // InternalKerMLExpressions.g:681:6: lv_operand_comp_3_0= ruleAndExpression
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
    // InternalKerMLExpressions.g:703:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalKerMLExpressions.g:703:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalKerMLExpressions.g:704:2: iv_ruleXorOperator= ruleXorOperator EOF
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
    // InternalKerMLExpressions.g:710:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '^' ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:716:2: (kw= '^' )
            // InternalKerMLExpressions.g:717:2: kw= '^'
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
    // InternalKerMLExpressions.g:725:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalKerMLExpressions.g:725:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLExpressions.g:726:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalKerMLExpressions.g:732:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:738:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalKerMLExpressions.g:739:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:739:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )* )
            // InternalKerMLExpressions.g:740:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )*
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
            // InternalKerMLExpressions.g:748:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKerMLExpressions.g:749:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_comp_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:749:4: ()
            	    // InternalKerMLExpressions.g:750:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:756:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalKerMLExpressions.g:757:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalKerMLExpressions.g:757:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalKerMLExpressions.g:758:6: lv_operator_2_0= ruleAndOperator
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

            	    // InternalKerMLExpressions.g:775:4: ( (lv_operand_comp_3_0= ruleEqualityExpression ) )
            	    // InternalKerMLExpressions.g:776:5: (lv_operand_comp_3_0= ruleEqualityExpression )
            	    {
            	    // InternalKerMLExpressions.g:776:5: (lv_operand_comp_3_0= ruleEqualityExpression )
            	    // InternalKerMLExpressions.g:777:6: lv_operand_comp_3_0= ruleEqualityExpression
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
    // InternalKerMLExpressions.g:799:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalKerMLExpressions.g:799:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalKerMLExpressions.g:800:2: iv_ruleAndOperator= ruleAndOperator EOF
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
    // InternalKerMLExpressions.g:806:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&' ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:812:2: (kw= '&' )
            // InternalKerMLExpressions.g:813:2: kw= '&'
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
    // InternalKerMLExpressions.g:821:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLExpressions.g:821:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:822:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalKerMLExpressions.g:828:1: ruleEqualityExpression returns [EObject current=null] : (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:834:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:835:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:835:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )* )
            // InternalKerMLExpressions.g:836:3: this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )*
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
            // InternalKerMLExpressions.g:844:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKerMLExpressions.g:845:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_comp_3_0= ruleClassificationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:845:4: ()
            	    // InternalKerMLExpressions.g:846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:852:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalKerMLExpressions.g:853:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalKerMLExpressions.g:853:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalKerMLExpressions.g:854:6: lv_operator_2_0= ruleEqualityOperator
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

            	    // InternalKerMLExpressions.g:871:4: ( (lv_operand_comp_3_0= ruleClassificationExpression ) )
            	    // InternalKerMLExpressions.g:872:5: (lv_operand_comp_3_0= ruleClassificationExpression )
            	    {
            	    // InternalKerMLExpressions.g:872:5: (lv_operand_comp_3_0= ruleClassificationExpression )
            	    // InternalKerMLExpressions.g:873:6: lv_operand_comp_3_0= ruleClassificationExpression
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
    // InternalKerMLExpressions.g:895:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalKerMLExpressions.g:895:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:896:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalKerMLExpressions.g:902:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:908:2: ( (kw= '==' | kw= '!=' ) )
            // InternalKerMLExpressions.g:909:2: (kw= '==' | kw= '!=' )
            {
            // InternalKerMLExpressions.g:909:2: (kw= '==' | kw= '!=' )
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
                    // InternalKerMLExpressions.g:910:3: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:916:3: kw= '!='
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
    // InternalKerMLExpressions.g:925:1: entryRuleClassificationExpression returns [EObject current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final EObject entryRuleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLExpressions.g:925:65: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:926:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
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
    // InternalKerMLExpressions.g:932:1: ruleClassificationExpression returns [EObject current=null] : ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) ) ) ;
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
            // InternalKerMLExpressions.g:938:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) ) ) )
            // InternalKerMLExpressions.g:939:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) ) )
            {
            // InternalKerMLExpressions.g:939:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING_VALUE && LA11_0<=RULE_UNRESTRICTED_NAME)||(LA11_0>=32 && LA11_0<=34)||(LA11_0>=40 && LA11_0<=43)||LA11_0==45||LA11_0==53||(LA11_0>=58 && LA11_0<=60)) ) {
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
                    // InternalKerMLExpressions.g:940:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? )
                    {
                    // InternalKerMLExpressions.g:940:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )? )
                    // InternalKerMLExpressions.g:941:4: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )?
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
                    // InternalKerMLExpressions.g:949:4: ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=24 && LA10_0<=27)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalKerMLExpressions.g:950:5: () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) )
                            {
                            // InternalKerMLExpressions.g:950:5: ()
                            // InternalKerMLExpressions.g:951:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndAdd(
                              							grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperand_compAction_0_1_0(),
                              							current);
                              					
                            }

                            }

                            // InternalKerMLExpressions.g:957:5: ( (lv_operator_2_0= ruleClassificationOperator ) )
                            // InternalKerMLExpressions.g:958:6: (lv_operator_2_0= ruleClassificationOperator )
                            {
                            // InternalKerMLExpressions.g:958:6: (lv_operator_2_0= ruleClassificationOperator )
                            // InternalKerMLExpressions.g:959:7: lv_operator_2_0= ruleClassificationOperator
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

                            // InternalKerMLExpressions.g:976:5: ( (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember ) )
                            // InternalKerMLExpressions.g:977:6: (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember )
                            {
                            // InternalKerMLExpressions.g:977:6: (lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember )
                            // InternalKerMLExpressions.g:978:7: lv_ownedFeatureMembership_comp_3_0= ruleTypeReferenceMember
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
                    // InternalKerMLExpressions.g:998:3: ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:998:3: ( () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:999:4: () ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:999:4: ()
                    // InternalKerMLExpressions.g:1000:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:1006:4: ( (lv_operand_comp_5_0= ruleSelfReferenceExpression ) )
                    // InternalKerMLExpressions.g:1007:5: (lv_operand_comp_5_0= ruleSelfReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:1007:5: (lv_operand_comp_5_0= ruleSelfReferenceExpression )
                    // InternalKerMLExpressions.g:1008:6: lv_operand_comp_5_0= ruleSelfReferenceExpression
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

                    // InternalKerMLExpressions.g:1025:4: ( (lv_operator_6_0= ruleClassificationOperator ) )
                    // InternalKerMLExpressions.g:1026:5: (lv_operator_6_0= ruleClassificationOperator )
                    {
                    // InternalKerMLExpressions.g:1026:5: (lv_operator_6_0= ruleClassificationOperator )
                    // InternalKerMLExpressions.g:1027:6: lv_operator_6_0= ruleClassificationOperator
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

                    // InternalKerMLExpressions.g:1044:4: ( (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1045:5: (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1045:5: (lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1046:6: lv_ownedFeatureMembership_comp_7_0= ruleTypeReferenceMember
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
    // InternalKerMLExpressions.g:1068:1: entryRuleClassificationOperator returns [String current=null] : iv_ruleClassificationOperator= ruleClassificationOperator EOF ;
    public final String entryRuleClassificationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationOperator = null;


        try {
            // InternalKerMLExpressions.g:1068:62: (iv_ruleClassificationOperator= ruleClassificationOperator EOF )
            // InternalKerMLExpressions.g:1069:2: iv_ruleClassificationOperator= ruleClassificationOperator EOF
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
    // InternalKerMLExpressions.g:1075:1: ruleClassificationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' ) ;
    public final AntlrDatatypeRuleToken ruleClassificationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1081:2: ( (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' ) )
            // InternalKerMLExpressions.g:1082:2: (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' )
            {
            // InternalKerMLExpressions.g:1082:2: (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' )
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
                    // InternalKerMLExpressions.g:1083:3: kw= 'instanceof'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getInstanceofKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1089:3: kw= 'hastype'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1095:3: kw= 'istype'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1101:3: kw= '@'
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
    // InternalKerMLExpressions.g:1110:1: entryRuleTypeReferenceMember returns [EObject current=null] : iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF ;
    public final EObject entryRuleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1110:60: (iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:1111:2: iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF
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
    // InternalKerMLExpressions.g:1117:1: ruleTypeReferenceMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleTypeReference ) ) ;
    public final EObject ruleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1123:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleTypeReference ) ) )
            // InternalKerMLExpressions.g:1124:2: ( (lv_ownedMemberFeature_comp_0_0= ruleTypeReference ) )
            {
            // InternalKerMLExpressions.g:1124:2: ( (lv_ownedMemberFeature_comp_0_0= ruleTypeReference ) )
            // InternalKerMLExpressions.g:1125:3: (lv_ownedMemberFeature_comp_0_0= ruleTypeReference )
            {
            // InternalKerMLExpressions.g:1125:3: (lv_ownedMemberFeature_comp_0_0= ruleTypeReference )
            // InternalKerMLExpressions.g:1126:4: lv_ownedMemberFeature_comp_0_0= ruleTypeReference
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
    // InternalKerMLExpressions.g:1146:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalKerMLExpressions.g:1146:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalKerMLExpressions.g:1147:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalKerMLExpressions.g:1153:1: ruleTypeReference returns [EObject current=null] : ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1159:2: ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) )
            // InternalKerMLExpressions.g:1160:2: ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) )
            {
            // InternalKerMLExpressions.g:1160:2: ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:1161:3: (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:1161:3: (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:1162:4: lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping
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


    // $ANTLR start "entryRuleSelfReferenceExpression"
    // InternalKerMLExpressions.g:1182:1: entryRuleSelfReferenceExpression returns [EObject current=null] : iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF ;
    public final EObject entryRuleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:1182:64: (iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:1183:2: iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF
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
    // InternalKerMLExpressions.g:1189:1: ruleSelfReferenceExpression returns [EObject current=null] : ( (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember ) ) ;
    public final EObject ruleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedFeatureMembership_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1195:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember ) ) )
            // InternalKerMLExpressions.g:1196:2: ( (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember ) )
            {
            // InternalKerMLExpressions.g:1196:2: ( (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:1197:3: (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:1197:3: (lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:1198:4: lv_ownedFeatureMembership_comp_0_0= ruleSelfReferenceMember
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
    // InternalKerMLExpressions.g:1218:1: entryRuleSelfReferenceMember returns [EObject current=null] : iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF ;
    public final EObject entryRuleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1218:60: (iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:1219:2: iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF
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
    // InternalKerMLExpressions.g:1225:1: ruleSelfReferenceMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature ) ) ;
    public final EObject ruleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1231:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature ) ) )
            // InternalKerMLExpressions.g:1232:2: ( (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature ) )
            {
            // InternalKerMLExpressions.g:1232:2: ( (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:1233:3: (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:1233:3: (lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature )
            // InternalKerMLExpressions.g:1234:4: lv_ownedMemberFeature_comp_0_0= ruleEmptyFeature
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
    // InternalKerMLExpressions.g:1254:1: entryRuleEmptyFeature returns [EObject current=null] : iv_ruleEmptyFeature= ruleEmptyFeature EOF ;
    public final EObject entryRuleEmptyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFeature = null;


        try {
            // InternalKerMLExpressions.g:1254:53: (iv_ruleEmptyFeature= ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:1255:2: iv_ruleEmptyFeature= ruleEmptyFeature EOF
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
    // InternalKerMLExpressions.g:1261:1: ruleEmptyFeature returns [EObject current=null] : () ;
    public final EObject ruleEmptyFeature() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1267:2: ( () )
            // InternalKerMLExpressions.g:1268:2: ()
            {
            // InternalKerMLExpressions.g:1268:2: ()
            // InternalKerMLExpressions.g:1269:3: 
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
    // InternalKerMLExpressions.g:1278:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLExpressions.g:1278:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:1279:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalKerMLExpressions.g:1285:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1291:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1292:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1292:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )* )
            // InternalKerMLExpressions.g:1293:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )*
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
            // InternalKerMLExpressions.g:1301:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=28 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1302:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_comp_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1302:4: ()
            	    // InternalKerMLExpressions.g:1303:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:1309:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalKerMLExpressions.g:1310:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalKerMLExpressions.g:1310:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalKerMLExpressions.g:1311:6: lv_operator_2_0= ruleRelationalOperator
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

            	    // InternalKerMLExpressions.g:1328:4: ( (lv_operand_comp_3_0= ruleAdditiveExpression ) )
            	    // InternalKerMLExpressions.g:1329:5: (lv_operand_comp_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalKerMLExpressions.g:1329:5: (lv_operand_comp_3_0= ruleAdditiveExpression )
            	    // InternalKerMLExpressions.g:1330:6: lv_operand_comp_3_0= ruleAdditiveExpression
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
    // InternalKerMLExpressions.g:1352:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalKerMLExpressions.g:1352:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:1353:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
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
    // InternalKerMLExpressions.g:1359:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1365:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalKerMLExpressions.g:1366:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalKerMLExpressions.g:1366:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
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
                    // InternalKerMLExpressions.g:1367:3: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1373:3: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1379:3: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1385:3: kw= '>='
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
    // InternalKerMLExpressions.g:1394:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLExpressions.g:1394:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:1395:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalKerMLExpressions.g:1401:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1407:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1408:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1408:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalKerMLExpressions.g:1409:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )*
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
            // InternalKerMLExpressions.g:1417:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=32 && LA15_0<=33)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1418:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1418:4: ()
            	    // InternalKerMLExpressions.g:1419:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:1425:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalKerMLExpressions.g:1426:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalKerMLExpressions.g:1426:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalKerMLExpressions.g:1427:6: lv_operator_2_0= ruleAdditiveOperator
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

            	    // InternalKerMLExpressions.g:1444:4: ( (lv_operand_comp_3_0= ruleMultiplicativeExpression ) )
            	    // InternalKerMLExpressions.g:1445:5: (lv_operand_comp_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1445:5: (lv_operand_comp_3_0= ruleMultiplicativeExpression )
            	    // InternalKerMLExpressions.g:1446:6: lv_operand_comp_3_0= ruleMultiplicativeExpression
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
    // InternalKerMLExpressions.g:1468:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalKerMLExpressions.g:1468:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:1469:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
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
    // InternalKerMLExpressions.g:1475:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1481:2: ( (kw= '+' | kw= '-' ) )
            // InternalKerMLExpressions.g:1482:2: (kw= '+' | kw= '-' )
            {
            // InternalKerMLExpressions.g:1482:2: (kw= '+' | kw= '-' )
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
                    // InternalKerMLExpressions.g:1483:3: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1489:3: kw= '-'
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
    // InternalKerMLExpressions.g:1498:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLExpressions.g:1498:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:1499:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalKerMLExpressions.g:1505:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1511:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1512:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1512:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )* )
            // InternalKerMLExpressions.g:1513:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )*
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
            // InternalKerMLExpressions.g:1521:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=34 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1522:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_comp_3_0= ruleExponentiationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1522:4: ()
            	    // InternalKerMLExpressions.g:1523:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:1529:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalKerMLExpressions.g:1530:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalKerMLExpressions.g:1530:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalKerMLExpressions.g:1531:6: lv_operator_2_0= ruleMultiplicativeOperator
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

            	    // InternalKerMLExpressions.g:1548:4: ( (lv_operand_comp_3_0= ruleExponentiationExpression ) )
            	    // InternalKerMLExpressions.g:1549:5: (lv_operand_comp_3_0= ruleExponentiationExpression )
            	    {
            	    // InternalKerMLExpressions.g:1549:5: (lv_operand_comp_3_0= ruleExponentiationExpression )
            	    // InternalKerMLExpressions.g:1550:6: lv_operand_comp_3_0= ruleExponentiationExpression
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
    // InternalKerMLExpressions.g:1572:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalKerMLExpressions.g:1572:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:1573:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
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
    // InternalKerMLExpressions.g:1579:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1585:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalKerMLExpressions.g:1586:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalKerMLExpressions.g:1586:2: (kw= '*' | kw= '/' | kw= '%' )
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
                    // InternalKerMLExpressions.g:1587:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1593:3: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1599:3: kw= '%'
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
    // InternalKerMLExpressions.g:1608:1: entryRuleExponentiationExpression returns [EObject current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final EObject entryRuleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLExpressions.g:1608:65: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:1609:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
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
    // InternalKerMLExpressions.g:1615:1: ruleExponentiationExpression returns [EObject current=null] : (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )* ) ;
    public final EObject ruleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnitsExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1621:2: ( (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1622:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1622:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )* )
            // InternalKerMLExpressions.g:1623:3: this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )*
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
            // InternalKerMLExpressions.g:1631:3: ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1632:4: () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_comp_3_0= ruleUnitsExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1632:4: ()
            	    // InternalKerMLExpressions.g:1633:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalKerMLExpressions.g:1639:4: ( (lv_operator_2_0= ruleExponentiationOperator ) )
            	    // InternalKerMLExpressions.g:1640:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    {
            	    // InternalKerMLExpressions.g:1640:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    // InternalKerMLExpressions.g:1641:6: lv_operator_2_0= ruleExponentiationOperator
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

            	    // InternalKerMLExpressions.g:1658:4: ( (lv_operand_comp_3_0= ruleUnitsExpression ) )
            	    // InternalKerMLExpressions.g:1659:5: (lv_operand_comp_3_0= ruleUnitsExpression )
            	    {
            	    // InternalKerMLExpressions.g:1659:5: (lv_operand_comp_3_0= ruleUnitsExpression )
            	    // InternalKerMLExpressions.g:1660:6: lv_operand_comp_3_0= ruleUnitsExpression
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
    // InternalKerMLExpressions.g:1682:1: entryRuleExponentiationOperator returns [String current=null] : iv_ruleExponentiationOperator= ruleExponentiationOperator EOF ;
    public final String entryRuleExponentiationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationOperator = null;


        try {
            // InternalKerMLExpressions.g:1682:62: (iv_ruleExponentiationOperator= ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:1683:2: iv_ruleExponentiationOperator= ruleExponentiationOperator EOF
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
    // InternalKerMLExpressions.g:1689:1: ruleExponentiationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '**' ;
    public final AntlrDatatypeRuleToken ruleExponentiationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1695:2: (kw= '**' )
            // InternalKerMLExpressions.g:1696:2: kw= '**'
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
    // InternalKerMLExpressions.g:1704:1: entryRuleUnitsExpression returns [EObject current=null] : iv_ruleUnitsExpression= ruleUnitsExpression EOF ;
    public final EObject entryRuleUnitsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsExpression = null;


        try {
            // InternalKerMLExpressions.g:1704:56: (iv_ruleUnitsExpression= ruleUnitsExpression EOF )
            // InternalKerMLExpressions.g:1705:2: iv_ruleUnitsExpression= ruleUnitsExpression EOF
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
    // InternalKerMLExpressions.g:1711:1: ruleUnitsExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleUnitsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1717:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? ) )
            // InternalKerMLExpressions.g:1718:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? )
            {
            // InternalKerMLExpressions.g:1718:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? )
            // InternalKerMLExpressions.g:1719:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )?
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
            // InternalKerMLExpressions.g:1727:3: ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKerMLExpressions.g:1728:4: () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_comp_3_0= ruleOwnedExpression ) ) otherlv_4= ']'
                    {
                    // InternalKerMLExpressions.g:1728:4: ()
                    // InternalKerMLExpressions.g:1729:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperand_compAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:1735:4: ( (lv_operator_2_0= '@[' ) )
                    // InternalKerMLExpressions.g:1736:5: (lv_operator_2_0= '@[' )
                    {
                    // InternalKerMLExpressions.g:1736:5: (lv_operator_2_0= '@[' )
                    // InternalKerMLExpressions.g:1737:6: lv_operator_2_0= '@['
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

                    // InternalKerMLExpressions.g:1749:4: ( (lv_operand_comp_3_0= ruleOwnedExpression ) )
                    // InternalKerMLExpressions.g:1750:5: (lv_operand_comp_3_0= ruleOwnedExpression )
                    {
                    // InternalKerMLExpressions.g:1750:5: (lv_operand_comp_3_0= ruleOwnedExpression )
                    // InternalKerMLExpressions.g:1751:6: lv_operand_comp_3_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:1777:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLExpressions.g:1777:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:1778:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalKerMLExpressions.g:1784:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_operand_comp_2_0 = null;

        EObject this_ExtentExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1790:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) )
            // InternalKerMLExpressions.g:1791:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:1791:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=32 && LA21_0<=33)||(LA21_0>=40 && LA21_0<=41)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING_VALUE && LA21_0<=RULE_UNRESTRICTED_NAME)||LA21_0==34||(LA21_0>=42 && LA21_0<=43)||LA21_0==45||LA21_0==53||(LA21_0>=58 && LA21_0<=60)) ) {
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
                    // InternalKerMLExpressions.g:1792:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:1792:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) ) )
                    // InternalKerMLExpressions.g:1793:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_comp_2_0= ruleExtentExpression ) )
                    {
                    // InternalKerMLExpressions.g:1793:4: ()
                    // InternalKerMLExpressions.g:1794:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:1800:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalKerMLExpressions.g:1801:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalKerMLExpressions.g:1801:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalKerMLExpressions.g:1802:6: lv_operator_1_0= ruleUnaryOperator
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

                    // InternalKerMLExpressions.g:1819:4: ( (lv_operand_comp_2_0= ruleExtentExpression ) )
                    // InternalKerMLExpressions.g:1820:5: (lv_operand_comp_2_0= ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:1820:5: (lv_operand_comp_2_0= ruleExtentExpression )
                    // InternalKerMLExpressions.g:1821:6: lv_operand_comp_2_0= ruleExtentExpression
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
                    // InternalKerMLExpressions.g:1840:3: this_ExtentExpression_3= ruleExtentExpression
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
    // InternalKerMLExpressions.g:1852:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalKerMLExpressions.g:1852:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:1853:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalKerMLExpressions.g:1859:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1865:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) )
            // InternalKerMLExpressions.g:1866:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            {
            // InternalKerMLExpressions.g:1866:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
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
                    // InternalKerMLExpressions.g:1867:3: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1873:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1879:3: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1885:3: kw= '~'
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
    // InternalKerMLExpressions.g:1894:1: entryRuleExtentExpression returns [EObject current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final EObject entryRuleExtentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression = null;


        try {
            // InternalKerMLExpressions.g:1894:57: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:1895:2: iv_ruleExtentExpression= ruleExtentExpression EOF
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
    // InternalKerMLExpressions.g:1901:1: ruleExtentExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) ) | this_SequenceExpression_3= ruleSequenceExpression ) ;
    public final EObject ruleExtentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_ownedFeatureMembership_comp_2_0 = null;

        EObject this_SequenceExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1907:2: ( ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) ) | this_SequenceExpression_3= ruleSequenceExpression ) )
            // InternalKerMLExpressions.g:1908:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) ) | this_SequenceExpression_3= ruleSequenceExpression )
            {
            // InternalKerMLExpressions.g:1908:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) ) | this_SequenceExpression_3= ruleSequenceExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING_VALUE && LA23_0<=RULE_UNRESTRICTED_NAME)||LA23_0==34||LA23_0==43||LA23_0==45||LA23_0==53||(LA23_0>=58 && LA23_0<=60)) ) {
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
                    // InternalKerMLExpressions.g:1909:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1909:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1910:4: () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1910:4: ()
                    // InternalKerMLExpressions.g:1911:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:1917:4: ( (lv_operator_1_0= 'all' ) )
                    // InternalKerMLExpressions.g:1918:5: (lv_operator_1_0= 'all' )
                    {
                    // InternalKerMLExpressions.g:1918:5: (lv_operator_1_0= 'all' )
                    // InternalKerMLExpressions.g:1919:6: lv_operator_1_0= 'all'
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

                    // InternalKerMLExpressions.g:1931:4: ( (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1932:5: (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1932:5: (lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1933:6: lv_ownedFeatureMembership_comp_2_0= ruleTypeReferenceMember
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
                    // InternalKerMLExpressions.g:1952:3: this_SequenceExpression_3= ruleSequenceExpression
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
    // InternalKerMLExpressions.g:1964:1: entryRuleExtentExpression_Deprecated returns [EObject current=null] : iv_ruleExtentExpression_Deprecated= ruleExtentExpression_Deprecated EOF ;
    public final EObject entryRuleExtentExpression_Deprecated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression_Deprecated = null;


        try {
            // InternalKerMLExpressions.g:1964:68: (iv_ruleExtentExpression_Deprecated= ruleExtentExpression_Deprecated EOF )
            // InternalKerMLExpressions.g:1965:2: iv_ruleExtentExpression_Deprecated= ruleExtentExpression_Deprecated EOF
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
    // InternalKerMLExpressions.g:1971:1: ruleExtentExpression_Deprecated returns [EObject current=null] : ( ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')' ) ;
    public final EObject ruleExtentExpression_Deprecated() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operator_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_ownedFeatureMembership_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1977:2: ( ( ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')' ) )
            // InternalKerMLExpressions.g:1978:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')' )
            {
            // InternalKerMLExpressions.g:1978:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')' )
            // InternalKerMLExpressions.g:1979:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) ) otherlv_1= '.' ( (lv_operator_2_0= 'allInstances' ) ) otherlv_3= '(' otherlv_4= ')'
            {
            // InternalKerMLExpressions.g:1979:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:1980:4: (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:1980:4: (lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:1981:5: lv_ownedFeatureMembership_comp_0_0= ruleTypeReferenceMember
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
            // InternalKerMLExpressions.g:2002:3: ( (lv_operator_2_0= 'allInstances' ) )
            // InternalKerMLExpressions.g:2003:4: (lv_operator_2_0= 'allInstances' )
            {
            // InternalKerMLExpressions.g:2003:4: (lv_operator_2_0= 'allInstances' )
            // InternalKerMLExpressions.g:2004:5: lv_operator_2_0= 'allInstances'
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
    // InternalKerMLExpressions.g:2028:1: entryRuleSequenceExpression returns [EObject current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final EObject entryRuleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2028:59: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:2029:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
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
    // InternalKerMLExpressions.g:2035:1: ruleSequenceExpression returns [EObject current=null] : ( (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )* ) ;
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
            // InternalKerMLExpressions.g:2041:2: ( ( (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )* ) )
            // InternalKerMLExpressions.g:2042:2: ( (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )* )
            {
            // InternalKerMLExpressions.g:2042:2: ( (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )* )
            // InternalKerMLExpressions.g:2043:3: (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression ) ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )*
            {
            // InternalKerMLExpressions.g:2043:3: (this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression | this_BaseExpression_1= ruleBaseExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==53) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_STRING_VALUE && LA24_0<=RULE_UNRESTRICTED_NAME)||LA24_0==34||LA24_0==43||LA24_0==45||(LA24_0>=58 && LA24_0<=60)) ) {
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
                    // InternalKerMLExpressions.g:2044:4: this_SequenceConstructionExpression_0= ruleSequenceConstructionExpression
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
                    // InternalKerMLExpressions.g:2053:4: this_BaseExpression_1= ruleBaseExpression
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

            // InternalKerMLExpressions.g:2062:3: ( ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' ) | ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ ) )*
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
            	    // InternalKerMLExpressions.g:2063:4: ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' )
            	    {
            	    // InternalKerMLExpressions.g:2063:4: ( () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']' )
            	    // InternalKerMLExpressions.g:2064:5: () ( (lv_operator_3_0= '[' ) ) ( (lv_operand_comp_4_0= ruleOwnedExpression ) ) otherlv_5= ']'
            	    {
            	    // InternalKerMLExpressions.g:2064:5: ()
            	    // InternalKerMLExpressions.g:2065:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperand_compAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKerMLExpressions.g:2071:5: ( (lv_operator_3_0= '[' ) )
            	    // InternalKerMLExpressions.g:2072:6: (lv_operator_3_0= '[' )
            	    {
            	    // InternalKerMLExpressions.g:2072:6: (lv_operator_3_0= '[' )
            	    // InternalKerMLExpressions.g:2073:7: lv_operator_3_0= '['
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

            	    // InternalKerMLExpressions.g:2085:5: ( (lv_operand_comp_4_0= ruleOwnedExpression ) )
            	    // InternalKerMLExpressions.g:2086:6: (lv_operand_comp_4_0= ruleOwnedExpression )
            	    {
            	    // InternalKerMLExpressions.g:2086:6: (lv_operand_comp_4_0= ruleOwnedExpression )
            	    // InternalKerMLExpressions.g:2087:7: lv_operand_comp_4_0= ruleOwnedExpression
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
            	    // InternalKerMLExpressions.g:2110:4: ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ )
            	    {
            	    // InternalKerMLExpressions.g:2110:4: ( () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+ )
            	    // InternalKerMLExpressions.g:2111:5: () otherlv_7= '->' ( (lv_operator_8_0= ruleName ) ) ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+
            	    {
            	    // InternalKerMLExpressions.g:2111:5: ()
            	    // InternalKerMLExpressions.g:2112:6: 
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
            	    // InternalKerMLExpressions.g:2122:5: ( (lv_operator_8_0= ruleName ) )
            	    // InternalKerMLExpressions.g:2123:6: (lv_operator_8_0= ruleName )
            	    {
            	    // InternalKerMLExpressions.g:2123:6: (lv_operator_8_0= ruleName )
            	    // InternalKerMLExpressions.g:2124:7: lv_operator_8_0= ruleName
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

            	    // InternalKerMLExpressions.g:2141:5: ( (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember ) )+
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
            	    	    // InternalKerMLExpressions.g:2142:6: (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember )
            	    	    {
            	    	    // InternalKerMLExpressions.g:2142:6: (lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember )
            	    	    // InternalKerMLExpressions.g:2143:7: lv_ownedFeatureMembership_comp_9_0= ruleBodyExpressionMember
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
    // InternalKerMLExpressions.g:2166:1: entryRuleBodyExpressionMember returns [EObject current=null] : iv_ruleBodyExpressionMember= ruleBodyExpressionMember EOF ;
    public final EObject entryRuleBodyExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:2166:61: (iv_ruleBodyExpressionMember= ruleBodyExpressionMember EOF )
            // InternalKerMLExpressions.g:2167:2: iv_ruleBodyExpressionMember= ruleBodyExpressionMember EOF
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
    // InternalKerMLExpressions.g:2173:1: ruleBodyExpressionMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression ) ) ;
    public final EObject ruleBodyExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2179:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression ) ) )
            // InternalKerMLExpressions.g:2180:2: ( (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression ) )
            {
            // InternalKerMLExpressions.g:2180:2: ( (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression ) )
            // InternalKerMLExpressions.g:2181:3: (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression )
            {
            // InternalKerMLExpressions.g:2181:3: (lv_ownedMemberFeature_comp_0_0= ruleBodyExpression )
            // InternalKerMLExpressions.g:2182:4: lv_ownedMemberFeature_comp_0_0= ruleBodyExpression
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
    // InternalKerMLExpressions.g:2202:1: entryRuleBodyExpression returns [EObject current=null] : iv_ruleBodyExpression= ruleBodyExpression EOF ;
    public final EObject entryRuleBodyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyExpression = null;


        try {
            // InternalKerMLExpressions.g:2202:55: (iv_ruleBodyExpression= ruleBodyExpression EOF )
            // InternalKerMLExpressions.g:2203:2: iv_ruleBodyExpression= ruleBodyExpression EOF
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
    // InternalKerMLExpressions.g:2209:1: ruleBodyExpression returns [EObject current=null] : ( ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) ) | ( (lv_ownedRelationship_comp_5_0= ruleExpressionTyping ) ) ) ;
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
            // InternalKerMLExpressions.g:2215:2: ( ( ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) ) | ( (lv_ownedRelationship_comp_5_0= ruleExpressionTyping ) ) ) )
            // InternalKerMLExpressions.g:2216:2: ( ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) ) | ( (lv_ownedRelationship_comp_5_0= ruleExpressionTyping ) ) )
            {
            // InternalKerMLExpressions.g:2216:2: ( ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) ) | ( (lv_ownedRelationship_comp_5_0= ruleExpressionTyping ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred1_InternalKerMLExpressions()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
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

                if ( (synpred1_InternalKerMLExpressions()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
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
                    // InternalKerMLExpressions.g:2217:3: ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) )
                    {
                    // InternalKerMLExpressions.g:2217:3: ( ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' ) )
                    // InternalKerMLExpressions.g:2218:4: ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )=> ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' )
                    {
                    // InternalKerMLExpressions.g:2238:4: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')' )
                    // InternalKerMLExpressions.g:2239:5: ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) ) ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )* otherlv_2= '(' ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) ) otherlv_4= ')'
                    {
                    // InternalKerMLExpressions.g:2239:5: ( (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember ) )
                    // InternalKerMLExpressions.g:2240:6: (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember )
                    {
                    // InternalKerMLExpressions.g:2240:6: (lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember )
                    // InternalKerMLExpressions.g:2241:7: lv_ownedFeatureMembership_comp_0_0= ruleBodyParameterMember
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

                    // InternalKerMLExpressions.g:2258:5: ( (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalKerMLExpressions.g:2259:6: (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember )
                    	    {
                    	    // InternalKerMLExpressions.g:2259:6: (lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember )
                    	    // InternalKerMLExpressions.g:2260:7: lv_ownedFeatureMembership_comp_1_0= ruleBodyParameterMember
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

                    otherlv_2=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getBodyExpressionAccess().getLeftParenthesisKeyword_0_0_2());
                      				
                    }
                    // InternalKerMLExpressions.g:2281:5: ( (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember ) )
                    // InternalKerMLExpressions.g:2282:6: (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember )
                    {
                    // InternalKerMLExpressions.g:2282:6: (lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember )
                    // InternalKerMLExpressions.g:2283:7: lv_ownedFeatureMembership_comp_3_0= ruleResultExpressionMember
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
                    // InternalKerMLExpressions.g:2307:3: ( (lv_ownedRelationship_comp_5_0= ruleExpressionTyping ) )
                    {
                    // InternalKerMLExpressions.g:2307:3: ( (lv_ownedRelationship_comp_5_0= ruleExpressionTyping ) )
                    // InternalKerMLExpressions.g:2308:4: (lv_ownedRelationship_comp_5_0= ruleExpressionTyping )
                    {
                    // InternalKerMLExpressions.g:2308:4: (lv_ownedRelationship_comp_5_0= ruleExpressionTyping )
                    // InternalKerMLExpressions.g:2309:5: lv_ownedRelationship_comp_5_0= ruleExpressionTyping
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedRelationship_compExpressionTypingParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_comp_5_0=ruleExpressionTyping();

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
                      						"org.omg.kerml.expressions.xtext.KerMLExpressions.ExpressionTyping");
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


    // $ANTLR start "entryRuleBodyParameterMember"
    // InternalKerMLExpressions.g:2330:1: entryRuleBodyParameterMember returns [EObject current=null] : iv_ruleBodyParameterMember= ruleBodyParameterMember EOF ;
    public final EObject entryRuleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameterMember = null;


        try {
            // InternalKerMLExpressions.g:2330:60: (iv_ruleBodyParameterMember= ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:2331:2: iv_ruleBodyParameterMember= ruleBodyParameterMember EOF
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
    // InternalKerMLExpressions.g:2337:1: ruleBodyParameterMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) ) ) ;
    public final EObject ruleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedMemberParameter_comp_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2343:2: ( ( ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) ) ) )
            // InternalKerMLExpressions.g:2344:2: ( ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) ) )
            {
            // InternalKerMLExpressions.g:2344:2: ( ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) ) )
            // InternalKerMLExpressions.g:2345:3: ( (lv_memberName_0_0= ruleName ) ) ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) )
            {
            // InternalKerMLExpressions.g:2345:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalKerMLExpressions.g:2346:4: (lv_memberName_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:2346:4: (lv_memberName_0_0= ruleName )
            // InternalKerMLExpressions.g:2347:5: lv_memberName_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBodyParameterMemberAccess().getMemberNameNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            // InternalKerMLExpressions.g:2364:3: ( (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter ) )
            // InternalKerMLExpressions.g:2365:4: (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:2365:4: (lv_ownedMemberParameter_comp_1_0= ruleBodyParameter )
            // InternalKerMLExpressions.g:2366:5: lv_ownedMemberParameter_comp_1_0= ruleBodyParameter
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
    // InternalKerMLExpressions.g:2387:1: entryRuleBodyParameter returns [EObject current=null] : iv_ruleBodyParameter= ruleBodyParameter EOF ;
    public final EObject entryRuleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameter = null;


        try {
            // InternalKerMLExpressions.g:2387:54: (iv_ruleBodyParameter= ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:2388:2: iv_ruleBodyParameter= ruleBodyParameter EOF
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
    // InternalKerMLExpressions.g:2394:1: ruleBodyParameter returns [EObject current=null] : ( () ( (this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )? ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )? ) )? ) ;
    public final EObject ruleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject this_TypedBy_1 = null;

        EObject this_MultiplicityPart_2 = null;

        EObject this_MultiplicityPart_3 = null;

        EObject this_TypedBy_4 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2400:2: ( ( () ( (this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )? ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )? ) )? ) )
            // InternalKerMLExpressions.g:2401:2: ( () ( (this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )? ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )? ) )? )
            {
            // InternalKerMLExpressions.g:2401:2: ( () ( (this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )? ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )? ) )? )
            // InternalKerMLExpressions.g:2402:3: () ( (this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )? ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )? ) )?
            {
            // InternalKerMLExpressions.g:2402:3: ()
            // InternalKerMLExpressions.g:2403:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBodyParameterAccess().getReferenceUsageAction_0(),
              					current);
              			
            }

            }

            // InternalKerMLExpressions.g:2409:3: ( (this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )? ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )? ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14||LA31_0==51) ) {
                alt31=1;
            }
            else if ( (LA31_0==47) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalKerMLExpressions.g:2410:4: (this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )? )
                    {
                    // InternalKerMLExpressions.g:2410:4: (this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )? )
                    // InternalKerMLExpressions.g:2411:5: this_TypedBy_1= ruleTypedBy[$current] (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )?
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBodyParameterRule());
                      					}
                      					newCompositeNode(grammarAccess.getBodyParameterAccess().getTypedByParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_31);
                    this_TypedBy_1=ruleTypedBy(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_TypedBy_1;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalKerMLExpressions.g:2422:5: (this_MultiplicityPart_2= ruleMultiplicityPart[$current] )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==47) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalKerMLExpressions.g:2423:6: this_MultiplicityPart_2= ruleMultiplicityPart[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getBodyParameterRule());
                              						}
                              						newCompositeNode(grammarAccess.getBodyParameterAccess().getMultiplicityPartParserRuleCall_1_0_1());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            this_MultiplicityPart_2=ruleMultiplicityPart(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_MultiplicityPart_2;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2437:4: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )? )
                    {
                    // InternalKerMLExpressions.g:2437:4: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )? )
                    // InternalKerMLExpressions.g:2438:5: this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_TypedBy_4= ruleTypedBy[$current] )?
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBodyParameterRule());
                      					}
                      					newCompositeNode(grammarAccess.getBodyParameterAccess().getMultiplicityPartParserRuleCall_1_1_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    this_MultiplicityPart_3=ruleMultiplicityPart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_MultiplicityPart_3;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalKerMLExpressions.g:2449:5: (this_TypedBy_4= ruleTypedBy[$current] )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==14||LA30_0==51) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalKerMLExpressions.g:2450:6: this_TypedBy_4= ruleTypedBy[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getBodyParameterRule());
                              						}
                              						newCompositeNode(grammarAccess.getBodyParameterAccess().getTypedByParserRuleCall_1_1_1());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            this_TypedBy_4=ruleTypedBy(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_TypedBy_4;
                              						afterParserOrEnumRuleCall();
                              					
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
    // $ANTLR end "ruleBodyParameter"


    // $ANTLR start "ruleMultiplicityPart"
    // InternalKerMLExpressions.g:2469:1: ruleMultiplicityPart[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedMembership_comp_0_0= ruleMultiplicityMember ) ) ( ( ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )? ) )? ) ;
    public final EObject ruleMultiplicityPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isOrdered_1_0=null;
        Token lv_isNonunique_2_0=null;
        Token lv_isNonunique_3_0=null;
        Token lv_isOrdered_4_0=null;
        EObject lv_ownedMembership_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2475:2: ( ( ( (lv_ownedMembership_comp_0_0= ruleMultiplicityMember ) ) ( ( ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )? ) )? ) )
            // InternalKerMLExpressions.g:2476:2: ( ( (lv_ownedMembership_comp_0_0= ruleMultiplicityMember ) ) ( ( ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )? ) )? )
            {
            // InternalKerMLExpressions.g:2476:2: ( ( (lv_ownedMembership_comp_0_0= ruleMultiplicityMember ) ) ( ( ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )? ) )? )
            // InternalKerMLExpressions.g:2477:3: ( (lv_ownedMembership_comp_0_0= ruleMultiplicityMember ) ) ( ( ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )? ) )?
            {
            // InternalKerMLExpressions.g:2477:3: ( (lv_ownedMembership_comp_0_0= ruleMultiplicityMember ) )
            // InternalKerMLExpressions.g:2478:4: (lv_ownedMembership_comp_0_0= ruleMultiplicityMember )
            {
            // InternalKerMLExpressions.g:2478:4: (lv_ownedMembership_comp_0_0= ruleMultiplicityMember )
            // InternalKerMLExpressions.g:2479:5: lv_ownedMembership_comp_0_0= ruleMultiplicityMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityPartAccess().getOwnedMembership_compMultiplicityMemberParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_ownedMembership_comp_0_0=ruleMultiplicityMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicityPartRule());
              					}
              					add(
              						current,
              						"ownedMembership_comp",
              						lv_ownedMembership_comp_0_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.MultiplicityMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKerMLExpressions.g:2496:3: ( ( ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )? ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            else if ( (LA34_0==50) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // InternalKerMLExpressions.g:2497:4: ( ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )? )
                    {
                    // InternalKerMLExpressions.g:2497:4: ( ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )? )
                    // InternalKerMLExpressions.g:2498:5: ( (lv_isOrdered_1_0= 'ordered' ) ) ( (lv_isNonunique_2_0= 'nonunique' ) )?
                    {
                    // InternalKerMLExpressions.g:2498:5: ( (lv_isOrdered_1_0= 'ordered' ) )
                    // InternalKerMLExpressions.g:2499:6: (lv_isOrdered_1_0= 'ordered' )
                    {
                    // InternalKerMLExpressions.g:2499:6: (lv_isOrdered_1_0= 'ordered' )
                    // InternalKerMLExpressions.g:2500:7: lv_isOrdered_1_0= 'ordered'
                    {
                    lv_isOrdered_1_0=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isOrdered_1_0, grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultiplicityPartRule());
                      							}
                      							setWithLastConsumed(current, "isOrdered", lv_isOrdered_1_0 != null, "ordered");
                      						
                    }

                    }


                    }

                    // InternalKerMLExpressions.g:2512:5: ( (lv_isNonunique_2_0= 'nonunique' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==50) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalKerMLExpressions.g:2513:6: (lv_isNonunique_2_0= 'nonunique' )
                            {
                            // InternalKerMLExpressions.g:2513:6: (lv_isNonunique_2_0= 'nonunique' )
                            // InternalKerMLExpressions.g:2514:7: lv_isNonunique_2_0= 'nonunique'
                            {
                            lv_isNonunique_2_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_isNonunique_2_0, grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMultiplicityPartRule());
                              							}
                              							setWithLastConsumed(current, "isNonunique", lv_isNonunique_2_0 != null, "nonunique");
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2528:4: ( ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )? )
                    {
                    // InternalKerMLExpressions.g:2528:4: ( ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )? )
                    // InternalKerMLExpressions.g:2529:5: ( (lv_isNonunique_3_0= 'nonunique' ) ) ( (lv_isOrdered_4_0= 'ordered' ) )?
                    {
                    // InternalKerMLExpressions.g:2529:5: ( (lv_isNonunique_3_0= 'nonunique' ) )
                    // InternalKerMLExpressions.g:2530:6: (lv_isNonunique_3_0= 'nonunique' )
                    {
                    // InternalKerMLExpressions.g:2530:6: (lv_isNonunique_3_0= 'nonunique' )
                    // InternalKerMLExpressions.g:2531:7: lv_isNonunique_3_0= 'nonunique'
                    {
                    lv_isNonunique_3_0=(Token)match(input,50,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isNonunique_3_0, grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultiplicityPartRule());
                      							}
                      							setWithLastConsumed(current, "isNonunique", lv_isNonunique_3_0 != null, "nonunique");
                      						
                    }

                    }


                    }

                    // InternalKerMLExpressions.g:2543:5: ( (lv_isOrdered_4_0= 'ordered' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==49) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalKerMLExpressions.g:2544:6: (lv_isOrdered_4_0= 'ordered' )
                            {
                            // InternalKerMLExpressions.g:2544:6: (lv_isOrdered_4_0= 'ordered' )
                            // InternalKerMLExpressions.g:2545:7: lv_isOrdered_4_0= 'ordered'
                            {
                            lv_isOrdered_4_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_isOrdered_4_0, grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMultiplicityPartRule());
                              							}
                              							setWithLastConsumed(current, "isOrdered", lv_isOrdered_4_0 != null, "ordered");
                              						
                            }

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
    // $ANTLR end "ruleMultiplicityPart"


    // $ANTLR start "ruleTypedBy"
    // InternalKerMLExpressions.g:2564:1: ruleTypedBy[EObject in_current] returns [EObject current=in_current] : ( ruleDefinedByKeyword ( (lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping ) ) ) ;
    public final EObject ruleTypedBy(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_comp_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2570:2: ( ( ruleDefinedByKeyword ( (lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping ) ) ) )
            // InternalKerMLExpressions.g:2571:2: ( ruleDefinedByKeyword ( (lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping ) ) )
            {
            // InternalKerMLExpressions.g:2571:2: ( ruleDefinedByKeyword ( (lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping ) ) )
            // InternalKerMLExpressions.g:2572:3: ruleDefinedByKeyword ( (lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypedByAccess().getDefinedByKeywordParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            ruleDefinedByKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:2579:3: ( (lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:2580:4: (lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:2580:4: (lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:2581:5: lv_ownedRelationship_comp_1_0= ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedByAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_comp_1_0=ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedByRule());
              					}
              					add(
              						current,
              						"ownedRelationship_comp",
              						lv_ownedRelationship_comp_1_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedFeatureTyping");
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
    // $ANTLR end "ruleTypedBy"


    // $ANTLR start "entryRuleDefinedByKeyword"
    // InternalKerMLExpressions.g:2602:1: entryRuleDefinedByKeyword returns [String current=null] : iv_ruleDefinedByKeyword= ruleDefinedByKeyword EOF ;
    public final String entryRuleDefinedByKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefinedByKeyword = null;


        try {
            // InternalKerMLExpressions.g:2602:56: (iv_ruleDefinedByKeyword= ruleDefinedByKeyword EOF )
            // InternalKerMLExpressions.g:2603:2: iv_ruleDefinedByKeyword= ruleDefinedByKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinedByKeywordRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinedByKeyword=ruleDefinedByKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinedByKeyword.getText(); 
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
    // $ANTLR end "entryRuleDefinedByKeyword"


    // $ANTLR start "ruleDefinedByKeyword"
    // InternalKerMLExpressions.g:2609:1: ruleDefinedByKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' | (kw= 'defined' kw= 'by' ) ) ;
    public final AntlrDatatypeRuleToken ruleDefinedByKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2615:2: ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) )
            // InternalKerMLExpressions.g:2616:2: (kw= ':' | (kw= 'defined' kw= 'by' ) )
            {
            // InternalKerMLExpressions.g:2616:2: (kw= ':' | (kw= 'defined' kw= 'by' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            else if ( (LA35_0==51) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalKerMLExpressions.g:2617:3: kw= ':'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefinedByKeywordAccess().getColonKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2623:3: (kw= 'defined' kw= 'by' )
                    {
                    // InternalKerMLExpressions.g:2623:3: (kw= 'defined' kw= 'by' )
                    // InternalKerMLExpressions.g:2624:4: kw= 'defined' kw= 'by'
                    {
                    kw=(Token)match(input,51,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDefinedByKeywordAccess().getDefinedKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDefinedByKeywordAccess().getByKeyword_1_1());
                      			
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
    // $ANTLR end "ruleDefinedByKeyword"


    // $ANTLR start "entryRuleExpressionTyping"
    // InternalKerMLExpressions.g:2639:1: entryRuleExpressionTyping returns [EObject current=null] : iv_ruleExpressionTyping= ruleExpressionTyping EOF ;
    public final EObject entryRuleExpressionTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTyping = null;


        try {
            // InternalKerMLExpressions.g:2639:57: (iv_ruleExpressionTyping= ruleExpressionTyping EOF )
            // InternalKerMLExpressions.g:2640:2: iv_ruleExpressionTyping= ruleExpressionTyping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTypingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionTyping=ruleExpressionTyping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionTyping; 
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
    // $ANTLR end "entryRuleExpressionTyping"


    // $ANTLR start "ruleExpressionTyping"
    // InternalKerMLExpressions.g:2646:1: ruleExpressionTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleExpressionTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2652:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:2653:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:2653:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:2654:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:2654:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:2655:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getExpressionTypingRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExpressionTypingAccess().getTypeFunctionCrossReference_0());
              			
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
    // $ANTLR end "ruleExpressionTyping"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalKerMLExpressions.g:2672:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalKerMLExpressions.g:2672:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalKerMLExpressions.g:2673:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalKerMLExpressions.g:2679:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' ) ) ;
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
            // InternalKerMLExpressions.g:2685:2: ( ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' ) ) )
            // InternalKerMLExpressions.g:2686:2: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' ) )
            {
            // InternalKerMLExpressions.g:2686:2: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1>=RULE_STRING_VALUE && LA37_1<=RULE_UNRESTRICTED_NAME)||(LA37_1>=24 && LA37_1<=27)||(LA37_1>=32 && LA37_1<=34)||(LA37_1>=40 && LA37_1<=43)||LA37_1==45||LA37_1==53||(LA37_1>=58 && LA37_1<=60)) ) {
                    alt37=2;
                }
                else if ( (LA37_1==54) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalKerMLExpressions.g:2687:3: ( () otherlv_1= '{' otherlv_2= '}' )
                    {
                    // InternalKerMLExpressions.g:2687:3: ( () otherlv_1= '{' otherlv_2= '}' )
                    // InternalKerMLExpressions.g:2688:4: () otherlv_1= '{' otherlv_2= '}'
                    {
                    // InternalKerMLExpressions.g:2688:4: ()
                    // InternalKerMLExpressions.g:2689:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSequenceConstructionExpressionAccess().getNullExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,53,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2705:3: (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' )
                    {
                    // InternalKerMLExpressions.g:2705:3: (otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}' )
                    // InternalKerMLExpressions.g:2706:4: otherlv_3= '{' this_OwnedExpression_4= ruleOwnedExpression ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )? otherlv_11= '}'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getOwnedExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_38);
                    this_OwnedExpression_4=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_OwnedExpression_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalKerMLExpressions.g:2718:4: ( ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) ) | ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) ) )?
                    int alt36=3;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==55) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==56) ) {
                        alt36=2;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalKerMLExpressions.g:2719:5: ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) )
                            {
                            // InternalKerMLExpressions.g:2719:5: ( () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) ) )
                            // InternalKerMLExpressions.g:2720:6: () ( (lv_operator_6_0= ',' ) ) ( (lv_operand_comp_7_0= ruleSequenceElementList ) )
                            {
                            // InternalKerMLExpressions.g:2720:6: ()
                            // InternalKerMLExpressions.g:2721:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndAdd(
                              								grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperand_compAction_1_2_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalKerMLExpressions.g:2727:6: ( (lv_operator_6_0= ',' ) )
                            // InternalKerMLExpressions.g:2728:7: (lv_operator_6_0= ',' )
                            {
                            // InternalKerMLExpressions.g:2728:7: (lv_operator_6_0= ',' )
                            // InternalKerMLExpressions.g:2729:8: lv_operator_6_0= ','
                            {
                            lv_operator_6_0=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
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

                            // InternalKerMLExpressions.g:2741:6: ( (lv_operand_comp_7_0= ruleSequenceElementList ) )
                            // InternalKerMLExpressions.g:2742:7: (lv_operand_comp_7_0= ruleSequenceElementList )
                            {
                            // InternalKerMLExpressions.g:2742:7: (lv_operand_comp_7_0= ruleSequenceElementList )
                            // InternalKerMLExpressions.g:2743:8: lv_operand_comp_7_0= ruleSequenceElementList
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compSequenceElementListParserRuleCall_1_2_0_2_0());
                              							
                            }
                            pushFollow(FOLLOW_37);
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
                            // InternalKerMLExpressions.g:2762:5: ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) )
                            {
                            // InternalKerMLExpressions.g:2762:5: ( () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) ) )
                            // InternalKerMLExpressions.g:2763:6: () ( (lv_operator_9_0= '..' ) ) ( (lv_operand_comp_10_0= ruleOwnedExpression ) )
                            {
                            // InternalKerMLExpressions.g:2763:6: ()
                            // InternalKerMLExpressions.g:2764:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndAdd(
                              								grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperand_compAction_1_2_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalKerMLExpressions.g:2770:6: ( (lv_operator_9_0= '..' ) )
                            // InternalKerMLExpressions.g:2771:7: (lv_operator_9_0= '..' )
                            {
                            // InternalKerMLExpressions.g:2771:7: (lv_operator_9_0= '..' )
                            // InternalKerMLExpressions.g:2772:8: lv_operator_9_0= '..'
                            {
                            lv_operator_9_0=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
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

                            // InternalKerMLExpressions.g:2784:6: ( (lv_operand_comp_10_0= ruleOwnedExpression ) )
                            // InternalKerMLExpressions.g:2785:7: (lv_operand_comp_10_0= ruleOwnedExpression )
                            {
                            // InternalKerMLExpressions.g:2785:7: (lv_operand_comp_10_0= ruleOwnedExpression )
                            // InternalKerMLExpressions.g:2786:8: lv_operand_comp_10_0= ruleOwnedExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_1_2_0());
                              							
                            }
                            pushFollow(FOLLOW_37);
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

                    otherlv_11=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalKerMLExpressions.g:2814:1: entryRuleSequenceElementList returns [EObject current=null] : iv_ruleSequenceElementList= ruleSequenceElementList EOF ;
    public final EObject entryRuleSequenceElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceElementList = null;


        try {
            // InternalKerMLExpressions.g:2814:60: (iv_ruleSequenceElementList= ruleSequenceElementList EOF )
            // InternalKerMLExpressions.g:2815:2: iv_ruleSequenceElementList= ruleSequenceElementList EOF
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
    // InternalKerMLExpressions.g:2821:1: ruleSequenceElementList returns [EObject current=null] : (this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )? ) ;
    public final EObject ruleSequenceElementList() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_OwnedExpression_0 = null;

        EObject lv_operand_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2827:2: ( (this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )? ) )
            // InternalKerMLExpressions.g:2828:2: (this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )? )
            {
            // InternalKerMLExpressions.g:2828:2: (this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )? )
            // InternalKerMLExpressions.g:2829:3: this_OwnedExpression_0= ruleOwnedExpression ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSequenceElementListAccess().getOwnedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OwnedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:2837:3: ( () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKerMLExpressions.g:2838:4: () ( (lv_operator_2_0= ',' ) ) ( (lv_operand_comp_3_0= ruleSequenceElementList ) )
                    {
                    // InternalKerMLExpressions.g:2838:4: ()
                    // InternalKerMLExpressions.g:2839:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getSequenceElementListAccess().getOperatorExpressionOperand_compAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKerMLExpressions.g:2845:4: ( (lv_operator_2_0= ',' ) )
                    // InternalKerMLExpressions.g:2846:5: (lv_operator_2_0= ',' )
                    {
                    // InternalKerMLExpressions.g:2846:5: (lv_operator_2_0= ',' )
                    // InternalKerMLExpressions.g:2847:6: lv_operator_2_0= ','
                    {
                    lv_operator_2_0=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
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

                    // InternalKerMLExpressions.g:2859:4: ( (lv_operand_comp_3_0= ruleSequenceElementList ) )
                    // InternalKerMLExpressions.g:2860:5: (lv_operand_comp_3_0= ruleSequenceElementList )
                    {
                    // InternalKerMLExpressions.g:2860:5: (lv_operand_comp_3_0= ruleSequenceElementList )
                    // InternalKerMLExpressions.g:2861:6: lv_operand_comp_3_0= ruleSequenceElementList
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


    // $ANTLR start "entryRuleMultiplicityMember"
    // InternalKerMLExpressions.g:2883:1: entryRuleMultiplicityMember returns [EObject current=null] : iv_ruleMultiplicityMember= ruleMultiplicityMember EOF ;
    public final EObject entryRuleMultiplicityMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityMember = null;


        try {
            // InternalKerMLExpressions.g:2883:59: (iv_ruleMultiplicityMember= ruleMultiplicityMember EOF )
            // InternalKerMLExpressions.g:2884:2: iv_ruleMultiplicityMember= ruleMultiplicityMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityMember=ruleMultiplicityMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityMember; 
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
    // $ANTLR end "entryRuleMultiplicityMember"


    // $ANTLR start "ruleMultiplicityMember"
    // InternalKerMLExpressions.g:2890:1: ruleMultiplicityMember returns [EObject current=null] : ( (lv_ownedMemberElement_comp_0_0= ruleMultiplicity ) ) ;
    public final EObject ruleMultiplicityMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2896:2: ( ( (lv_ownedMemberElement_comp_0_0= ruleMultiplicity ) ) )
            // InternalKerMLExpressions.g:2897:2: ( (lv_ownedMemberElement_comp_0_0= ruleMultiplicity ) )
            {
            // InternalKerMLExpressions.g:2897:2: ( (lv_ownedMemberElement_comp_0_0= ruleMultiplicity ) )
            // InternalKerMLExpressions.g:2898:3: (lv_ownedMemberElement_comp_0_0= ruleMultiplicity )
            {
            // InternalKerMLExpressions.g:2898:3: (lv_ownedMemberElement_comp_0_0= ruleMultiplicity )
            // InternalKerMLExpressions.g:2899:4: lv_ownedMemberElement_comp_0_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMultiplicityMemberAccess().getOwnedMemberElement_compMultiplicityParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberElement_comp_0_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getMultiplicityMemberRule());
              				}
              				set(
              					current,
              					"ownedMemberElement_comp",
              					lv_ownedMemberElement_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.Multiplicity");
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
    // $ANTLR end "ruleMultiplicityMember"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalKerMLExpressions.g:2919:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalKerMLExpressions.g:2919:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalKerMLExpressions.g:2920:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicity; 
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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalKerMLExpressions.g:2926:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember ) ) otherlv_2= '..' )? ( (lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedMembership_comp_1_0 = null;

        EObject lv_ownedMembership_comp_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2932:2: ( (otherlv_0= '[' ( ( (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember ) ) otherlv_2= '..' )? ( (lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember ) ) otherlv_4= ']' ) )
            // InternalKerMLExpressions.g:2933:2: (otherlv_0= '[' ( ( (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember ) ) otherlv_2= '..' )? ( (lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember ) ) otherlv_4= ']' )
            {
            // InternalKerMLExpressions.g:2933:2: (otherlv_0= '[' ( ( (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember ) ) otherlv_2= '..' )? ( (lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember ) ) otherlv_4= ']' )
            // InternalKerMLExpressions.g:2934:3: otherlv_0= '[' ( ( (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember ) ) otherlv_2= '..' )? ( (lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalKerMLExpressions.g:2938:3: ( ( (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember ) ) otherlv_2= '..' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DECIMAL_VALUE) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==56) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalKerMLExpressions.g:2939:4: ( (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember ) ) otherlv_2= '..'
                    {
                    // InternalKerMLExpressions.g:2939:4: ( (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember ) )
                    // InternalKerMLExpressions.g:2940:5: (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember )
                    {
                    // InternalKerMLExpressions.g:2940:5: (lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember )
                    // InternalKerMLExpressions.g:2941:6: lv_ownedMembership_comp_1_0= ruleLiteralIntegerMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiplicityAccess().getOwnedMembership_compLiteralIntegerMemberParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_ownedMembership_comp_1_0=ruleLiteralIntegerMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                      						}
                      						add(
                      							current,
                      							"ownedMembership_comp",
                      							lv_ownedMembership_comp_1_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.LiteralIntegerMember");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,56,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalKerMLExpressions.g:2963:3: ( (lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember ) )
            // InternalKerMLExpressions.g:2964:4: (lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember )
            {
            // InternalKerMLExpressions.g:2964:4: (lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember )
            // InternalKerMLExpressions.g:2965:5: lv_ownedMembership_comp_3_0= ruleLiteralUnlimitedNaturalMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityAccess().getOwnedMembership_compLiteralUnlimitedNaturalMemberParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_ownedMembership_comp_3_0=ruleLiteralUnlimitedNaturalMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicityRule());
              					}
              					add(
              						current,
              						"ownedMembership_comp",
              						lv_ownedMembership_comp_3_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.LiteralUnlimitedNaturalMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleLiteralIntegerMember"
    // InternalKerMLExpressions.g:2990:1: entryRuleLiteralIntegerMember returns [EObject current=null] : iv_ruleLiteralIntegerMember= ruleLiteralIntegerMember EOF ;
    public final EObject entryRuleLiteralIntegerMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralIntegerMember = null;


        try {
            // InternalKerMLExpressions.g:2990:61: (iv_ruleLiteralIntegerMember= ruleLiteralIntegerMember EOF )
            // InternalKerMLExpressions.g:2991:2: iv_ruleLiteralIntegerMember= ruleLiteralIntegerMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralIntegerMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralIntegerMember=ruleLiteralIntegerMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralIntegerMember; 
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
    // $ANTLR end "entryRuleLiteralIntegerMember"


    // $ANTLR start "ruleLiteralIntegerMember"
    // InternalKerMLExpressions.g:2997:1: ruleLiteralIntegerMember returns [EObject current=null] : ( (lv_ownedMemberElement_comp_0_0= ruleLiteralInteger ) ) ;
    public final EObject ruleLiteralIntegerMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3003:2: ( ( (lv_ownedMemberElement_comp_0_0= ruleLiteralInteger ) ) )
            // InternalKerMLExpressions.g:3004:2: ( (lv_ownedMemberElement_comp_0_0= ruleLiteralInteger ) )
            {
            // InternalKerMLExpressions.g:3004:2: ( (lv_ownedMemberElement_comp_0_0= ruleLiteralInteger ) )
            // InternalKerMLExpressions.g:3005:3: (lv_ownedMemberElement_comp_0_0= ruleLiteralInteger )
            {
            // InternalKerMLExpressions.g:3005:3: (lv_ownedMemberElement_comp_0_0= ruleLiteralInteger )
            // InternalKerMLExpressions.g:3006:4: lv_ownedMemberElement_comp_0_0= ruleLiteralInteger
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLiteralIntegerMemberAccess().getOwnedMemberElement_compLiteralIntegerParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberElement_comp_0_0=ruleLiteralInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getLiteralIntegerMemberRule());
              				}
              				set(
              					current,
              					"ownedMemberElement_comp",
              					lv_ownedMemberElement_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.LiteralInteger");
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
    // $ANTLR end "ruleLiteralIntegerMember"


    // $ANTLR start "entryRuleLiteralUnlimitedNaturalMember"
    // InternalKerMLExpressions.g:3026:1: entryRuleLiteralUnlimitedNaturalMember returns [EObject current=null] : iv_ruleLiteralUnlimitedNaturalMember= ruleLiteralUnlimitedNaturalMember EOF ;
    public final EObject entryRuleLiteralUnlimitedNaturalMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnlimitedNaturalMember = null;


        try {
            // InternalKerMLExpressions.g:3026:70: (iv_ruleLiteralUnlimitedNaturalMember= ruleLiteralUnlimitedNaturalMember EOF )
            // InternalKerMLExpressions.g:3027:2: iv_ruleLiteralUnlimitedNaturalMember= ruleLiteralUnlimitedNaturalMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralUnlimitedNaturalMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralUnlimitedNaturalMember=ruleLiteralUnlimitedNaturalMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralUnlimitedNaturalMember; 
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
    // $ANTLR end "entryRuleLiteralUnlimitedNaturalMember"


    // $ANTLR start "ruleLiteralUnlimitedNaturalMember"
    // InternalKerMLExpressions.g:3033:1: ruleLiteralUnlimitedNaturalMember returns [EObject current=null] : ( (lv_ownedMemberElement_comp_0_0= ruleLiteralUnlimitedNatural ) ) ;
    public final EObject ruleLiteralUnlimitedNaturalMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3039:2: ( ( (lv_ownedMemberElement_comp_0_0= ruleLiteralUnlimitedNatural ) ) )
            // InternalKerMLExpressions.g:3040:2: ( (lv_ownedMemberElement_comp_0_0= ruleLiteralUnlimitedNatural ) )
            {
            // InternalKerMLExpressions.g:3040:2: ( (lv_ownedMemberElement_comp_0_0= ruleLiteralUnlimitedNatural ) )
            // InternalKerMLExpressions.g:3041:3: (lv_ownedMemberElement_comp_0_0= ruleLiteralUnlimitedNatural )
            {
            // InternalKerMLExpressions.g:3041:3: (lv_ownedMemberElement_comp_0_0= ruleLiteralUnlimitedNatural )
            // InternalKerMLExpressions.g:3042:4: lv_ownedMemberElement_comp_0_0= ruleLiteralUnlimitedNatural
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLiteralUnlimitedNaturalMemberAccess().getOwnedMemberElement_compLiteralUnlimitedNaturalParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberElement_comp_0_0=ruleLiteralUnlimitedNatural();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getLiteralUnlimitedNaturalMemberRule());
              				}
              				set(
              					current,
              					"ownedMemberElement_comp",
              					lv_ownedMemberElement_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.LiteralUnlimitedNatural");
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
    // $ANTLR end "ruleLiteralUnlimitedNaturalMember"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalKerMLExpressions.g:3062:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalKerMLExpressions.g:3062:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:3063:2: iv_ruleBaseExpression= ruleBaseExpression EOF
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
    // InternalKerMLExpressions.g:3069:1: ruleBaseExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) ) ;
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
            // InternalKerMLExpressions.g:3075:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) ) )
            // InternalKerMLExpressions.g:3076:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) )
            {
            // InternalKerMLExpressions.g:3076:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) )
            int alt40=6;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalKerMLExpressions.g:3077:3: this_NullExpression_0= ruleNullExpression
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
                    // InternalKerMLExpressions.g:3086:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalKerMLExpressions.g:3095:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
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
                    // InternalKerMLExpressions.g:3104:3: this_InvocationExpression_3= ruleInvocationExpression
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
                    // InternalKerMLExpressions.g:3113:3: this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated
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
                    // InternalKerMLExpressions.g:3122:3: (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' )
                    {
                    // InternalKerMLExpressions.g:3122:3: (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' )
                    // InternalKerMLExpressions.g:3123:4: otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')'
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
    // InternalKerMLExpressions.g:3144:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:3144:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:3145:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
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
    // InternalKerMLExpressions.g:3151:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( (lv_ownedFeatureMembership_comp_0_0= ruleFeatureReferenceMember ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedFeatureMembership_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3157:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleFeatureReferenceMember ) ) )
            // InternalKerMLExpressions.g:3158:2: ( (lv_ownedFeatureMembership_comp_0_0= ruleFeatureReferenceMember ) )
            {
            // InternalKerMLExpressions.g:3158:2: ( (lv_ownedFeatureMembership_comp_0_0= ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:3159:3: (lv_ownedFeatureMembership_comp_0_0= ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:3159:3: (lv_ownedFeatureMembership_comp_0_0= ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:3160:4: lv_ownedFeatureMembership_comp_0_0= ruleFeatureReferenceMember
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedFeatureMembership_compFeatureReferenceMemberParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedFeatureMembership_comp_0_0=ruleFeatureReferenceMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFeatureReferenceExpressionRule());
              				}
              				add(
              					current,
              					"ownedFeatureMembership_comp",
              					lv_ownedFeatureMembership_comp_0_0,
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
    // InternalKerMLExpressions.g:3180:1: entryRuleFeatureReferenceMember returns [EObject current=null] : iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF ;
    public final EObject entryRuleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:3180:63: (iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:3181:2: iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF
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
    // InternalKerMLExpressions.g:3187:1: ruleFeatureReferenceMember returns [EObject current=null] : ( (lv_ownedMemberFeature_comp_0_0= ruleFeatureReference ) ) ;
    public final EObject ruleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberFeature_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3193:2: ( ( (lv_ownedMemberFeature_comp_0_0= ruleFeatureReference ) ) )
            // InternalKerMLExpressions.g:3194:2: ( (lv_ownedMemberFeature_comp_0_0= ruleFeatureReference ) )
            {
            // InternalKerMLExpressions.g:3194:2: ( (lv_ownedMemberFeature_comp_0_0= ruleFeatureReference ) )
            // InternalKerMLExpressions.g:3195:3: (lv_ownedMemberFeature_comp_0_0= ruleFeatureReference )
            {
            // InternalKerMLExpressions.g:3195:3: (lv_ownedMemberFeature_comp_0_0= ruleFeatureReference )
            // InternalKerMLExpressions.g:3196:4: lv_ownedMemberFeature_comp_0_0= ruleFeatureReference
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFeatureReferenceMemberAccess().getOwnedMemberFeature_compFeatureReferenceParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedMemberFeature_comp_0_0=ruleFeatureReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFeatureReferenceMemberRule());
              				}
              				set(
              					current,
              					"ownedMemberFeature_comp",
              					lv_ownedMemberFeature_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.FeatureReference");
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


    // $ANTLR start "entryRuleFeatureReference"
    // InternalKerMLExpressions.g:3216:1: entryRuleFeatureReference returns [EObject current=null] : iv_ruleFeatureReference= ruleFeatureReference EOF ;
    public final EObject entryRuleFeatureReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReference = null;


        try {
            // InternalKerMLExpressions.g:3216:57: (iv_ruleFeatureReference= ruleFeatureReference EOF )
            // InternalKerMLExpressions.g:3217:2: iv_ruleFeatureReference= ruleFeatureReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReference=ruleFeatureReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureReference; 
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
    // $ANTLR end "entryRuleFeatureReference"


    // $ANTLR start "ruleFeatureReference"
    // InternalKerMLExpressions.g:3223:1: ruleFeatureReference returns [EObject current=null] : ( (lv_ownedRelationship_comp_0_0= ruleOwnedSubsetting ) ) ;
    public final EObject ruleFeatureReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3229:2: ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedSubsetting ) ) )
            // InternalKerMLExpressions.g:3230:2: ( (lv_ownedRelationship_comp_0_0= ruleOwnedSubsetting ) )
            {
            // InternalKerMLExpressions.g:3230:2: ( (lv_ownedRelationship_comp_0_0= ruleOwnedSubsetting ) )
            // InternalKerMLExpressions.g:3231:3: (lv_ownedRelationship_comp_0_0= ruleOwnedSubsetting )
            {
            // InternalKerMLExpressions.g:3231:3: (lv_ownedRelationship_comp_0_0= ruleOwnedSubsetting )
            // InternalKerMLExpressions.g:3232:4: lv_ownedRelationship_comp_0_0= ruleOwnedSubsetting
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFeatureReferenceAccess().getOwnedRelationship_compOwnedSubsettingParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_comp_0_0=ruleOwnedSubsetting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFeatureReferenceRule());
              				}
              				add(
              					current,
              					"ownedRelationship_comp",
              					lv_ownedRelationship_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedSubsetting");
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
    // $ANTLR end "ruleFeatureReference"


    // $ANTLR start "entryRuleInvocationExpression"
    // InternalKerMLExpressions.g:3252:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLExpressions.g:3252:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:3253:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
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
    // InternalKerMLExpressions.g:3259:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedRelationship_comp_0_0 = null;

        EObject this_ArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3265:2: ( ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')' ) )
            // InternalKerMLExpressions.g:3266:2: ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')' )
            {
            // InternalKerMLExpressions.g:3266:2: ( ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')' )
            // InternalKerMLExpressions.g:3267:3: ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) ) otherlv_1= '(' (this_ArgumentList_2= ruleArgumentList[$current] )? otherlv_3= ')'
            {
            // InternalKerMLExpressions.g:3267:3: ( (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:3268:4: (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:3268:4: (lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:3269:5: lv_ownedRelationship_comp_0_0= ruleOwnedFeatureTyping
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

            otherlv_1=(Token)match(input,45,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvocationExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalKerMLExpressions.g:3290:3: (this_ArgumentList_2= ruleArgumentList[$current] )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==EOF||(LA41_0>=RULE_STRING_VALUE && LA41_0<=RULE_UNRESTRICTED_NAME)||(LA41_0>=24 && LA41_0<=27)||(LA41_0>=32 && LA41_0<=34)||(LA41_0>=40 && LA41_0<=43)||LA41_0==45||LA41_0==53||(LA41_0>=58 && LA41_0<=60)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKerMLExpressions.g:3291:4: this_ArgumentList_2= ruleArgumentList[$current]
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
    // InternalKerMLExpressions.g:3312:1: ruleArgumentList[EObject in_current] returns [EObject current=in_current] : (this_PositionalArgumentList_0= rulePositionalArgumentList[$current] | this_NamedArgumentList_1= ruleNamedArgumentList[$current] ) ;
    public final EObject ruleArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalArgumentList_0 = null;

        EObject this_NamedArgumentList_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3318:2: ( (this_PositionalArgumentList_0= rulePositionalArgumentList[$current] | this_NamedArgumentList_1= ruleNamedArgumentList[$current] ) )
            // InternalKerMLExpressions.g:3319:2: (this_PositionalArgumentList_0= rulePositionalArgumentList[$current] | this_NamedArgumentList_1= ruleNamedArgumentList[$current] )
            {
            // InternalKerMLExpressions.g:3319:2: (this_PositionalArgumentList_0= rulePositionalArgumentList[$current] | this_NamedArgumentList_1= ruleNamedArgumentList[$current] )
            int alt42=2;
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
            case 53:
            case 58:
            case 59:
            case 60:
                {
                alt42=1;
                }
                break;
            case RULE_ID:
                {
                int LA42_2 = input.LA(2);

                if ( ((LA42_2>=15 && LA42_2<=38)||LA42_2==43||(LA42_2>=45 && LA42_2<=48)||LA42_2==55||LA42_2==61) ) {
                    alt42=1;
                }
                else if ( (LA42_2==57) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA42_3 = input.LA(2);

                if ( ((LA42_3>=15 && LA42_3<=38)||LA42_3==43||(LA42_3>=45 && LA42_3<=48)||LA42_3==55||LA42_3==61) ) {
                    alt42=1;
                }
                else if ( (LA42_3==57) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalKerMLExpressions.g:3320:3: this_PositionalArgumentList_0= rulePositionalArgumentList[$current]
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
                    // InternalKerMLExpressions.g:3332:3: this_NamedArgumentList_1= ruleNamedArgumentList[$current]
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
    // InternalKerMLExpressions.g:3348:1: rulePositionalArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )* ) ;
    public final EObject rulePositionalArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedFeatureMembership_comp_0_0 = null;

        EObject lv_ownedFeatureMembership_comp_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3354:2: ( ( ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:3355:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:3355:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:3356:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:3356:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:3357:4: (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:3357:4: (lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:3358:5: lv_ownedFeatureMembership_comp_0_0= ruleOwnedExpressionMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compOwnedExpressionMemberParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalKerMLExpressions.g:3375:3: (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==55) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3376:4: otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalKerMLExpressions.g:3380:4: ( (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember ) )
            	    // InternalKerMLExpressions.g:3381:5: (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:3381:5: (lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember )
            	    // InternalKerMLExpressions.g:3382:6: lv_ownedFeatureMembership_comp_2_0= ruleOwnedExpressionMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compOwnedExpressionMemberParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop43;
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
    // InternalKerMLExpressions.g:3405:1: ruleNamedArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )* ) ;
    public final EObject ruleNamedArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedFeatureMembership_comp_0_0 = null;

        EObject lv_ownedFeatureMembership_comp_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3411:2: ( ( ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:3412:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:3412:2: ( ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:3413:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:3413:3: ( (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:3414:4: (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:3414:4: (lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:3415:5: lv_ownedFeatureMembership_comp_0_0= ruleNamedExpressionMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compNamedExpressionMemberParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalKerMLExpressions.g:3432:3: (otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==55) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3433:4: otherlv_1= ',' ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalKerMLExpressions.g:3437:4: ( (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember ) )
            	    // InternalKerMLExpressions.g:3438:5: (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:3438:5: (lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember )
            	    // InternalKerMLExpressions.g:3439:6: lv_ownedFeatureMembership_comp_2_0= ruleNamedExpressionMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compNamedExpressionMemberParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop44;
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
    // InternalKerMLExpressions.g:3461:1: entryRuleNamedExpressionMember returns [EObject current=null] : iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF ;
    public final EObject entryRuleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:3461:62: (iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF )
            // InternalKerMLExpressions.g:3462:2: iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF
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
    // InternalKerMLExpressions.g:3468:1: ruleNamedExpressionMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) ) ) ;
    public final EObject ruleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedMemberFeature_comp_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3474:2: ( ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) ) ) )
            // InternalKerMLExpressions.g:3475:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) ) )
            {
            // InternalKerMLExpressions.g:3475:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:3476:3: ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:3476:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalKerMLExpressions.g:3477:4: (lv_memberName_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:3477:4: (lv_memberName_0_0= ruleName )
            // InternalKerMLExpressions.g:3478:5: lv_memberName_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_43);
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

            otherlv_1=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNamedExpressionMemberAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalKerMLExpressions.g:3499:3: ( (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:3500:4: (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:3500:4: (lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:3501:5: lv_ownedMemberFeature_comp_2_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:3522:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalKerMLExpressions.g:3522:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLExpressions.g:3523:2: iv_ruleNullExpression= ruleNullExpression EOF
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
    // InternalKerMLExpressions.g:3529:1: ruleNullExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3535:2: ( ( () otherlv_1= 'null' ) )
            // InternalKerMLExpressions.g:3536:2: ( () otherlv_1= 'null' )
            {
            // InternalKerMLExpressions.g:3536:2: ( () otherlv_1= 'null' )
            // InternalKerMLExpressions.g:3537:3: () otherlv_1= 'null'
            {
            // InternalKerMLExpressions.g:3537:3: ()
            // InternalKerMLExpressions.g:3538:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalKerMLExpressions.g:3552:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLExpressions.g:3552:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:3553:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalKerMLExpressions.g:3559:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralInteger_2 = null;

        EObject this_LiteralReal_3 = null;

        EObject this_LiteralUnbounded_4 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3565:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded ) )
            // InternalKerMLExpressions.g:3566:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded )
            {
            // InternalKerMLExpressions.g:3566:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 59:
            case 60:
                {
                alt45=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt45=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA45_3 = input.LA(2);

                if ( (LA45_3==EOF||(LA45_3>=14 && LA45_3<=39)||(LA45_3>=46 && LA45_3<=48)||(LA45_3>=54 && LA45_3<=56)) ) {
                    alt45=3;
                }
                else if ( (LA45_3==43) ) {
                    alt45=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 43:
                {
                alt45=4;
                }
                break;
            case 34:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalKerMLExpressions.g:3567:3: this_LiteralBoolean_0= ruleLiteralBoolean
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
                    // InternalKerMLExpressions.g:3576:3: this_LiteralString_1= ruleLiteralString
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
                    // InternalKerMLExpressions.g:3585:3: this_LiteralInteger_2= ruleLiteralInteger
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
                    // InternalKerMLExpressions.g:3594:3: this_LiteralReal_3= ruleLiteralReal
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
                    // InternalKerMLExpressions.g:3603:3: this_LiteralUnbounded_4= ruleLiteralUnbounded
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
    // InternalKerMLExpressions.g:3615:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLExpressions.g:3615:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:3616:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
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
    // InternalKerMLExpressions.g:3622:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3628:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalKerMLExpressions.g:3629:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalKerMLExpressions.g:3629:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalKerMLExpressions.g:3630:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:3630:3: (lv_value_0_0= ruleBooleanValue )
            // InternalKerMLExpressions.g:3631:4: lv_value_0_0= ruleBooleanValue
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
    // InternalKerMLExpressions.g:3651:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLExpressions.g:3651:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:3652:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalKerMLExpressions.g:3658:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3664:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLExpressions.g:3665:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLExpressions.g:3665:2: (kw= 'true' | kw= 'false' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            else if ( (LA46_0==60) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalKerMLExpressions.g:3666:3: kw= 'true'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3672:3: kw= 'false'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalKerMLExpressions.g:3681:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // InternalKerMLExpressions.g:3681:54: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLExpressions.g:3682:2: iv_ruleLiteralString= ruleLiteralString EOF
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
    // InternalKerMLExpressions.g:3688:1: ruleLiteralString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3694:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalKerMLExpressions.g:3695:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalKerMLExpressions.g:3695:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:3696:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:3696:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:3697:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalKerMLExpressions.g:3716:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLExpressions.g:3716:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:3717:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
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
    // InternalKerMLExpressions.g:3723:1: ruleLiteralInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3729:2: ( ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) )
            // InternalKerMLExpressions.g:3730:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            {
            // InternalKerMLExpressions.g:3730:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:3731:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:3731:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:3732:4: lv_value_0_0= RULE_DECIMAL_VALUE
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
    // InternalKerMLExpressions.g:3751:1: entryRuleLiteralReal returns [EObject current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final EObject entryRuleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralReal = null;


        try {
            // InternalKerMLExpressions.g:3751:52: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:3752:2: iv_ruleLiteralReal= ruleLiteralReal EOF
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
    // InternalKerMLExpressions.g:3758:1: ruleLiteralReal returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleLiteralReal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3764:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalKerMLExpressions.g:3765:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalKerMLExpressions.g:3765:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalKerMLExpressions.g:3766:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalKerMLExpressions.g:3766:3: (lv_value_0_0= ruleRealValue )
            // InternalKerMLExpressions.g:3767:4: lv_value_0_0= ruleRealValue
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
    // InternalKerMLExpressions.g:3787:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLExpressions.g:3787:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLExpressions.g:3788:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalKerMLExpressions.g:3794:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3800:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLExpressions.g:3801:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLExpressions.g:3801:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DECIMAL_VALUE||LA49_0==43) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_EXP_VALUE) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalKerMLExpressions.g:3802:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLExpressions.g:3802:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLExpressions.g:3803:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:3803:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_DECIMAL_VALUE) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalKerMLExpressions.g:3804:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
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

                    kw=(Token)match(input,43,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalKerMLExpressions.g:3817:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_DECIMAL_VALUE) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==RULE_EXP_VALUE) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalKerMLExpressions.g:3818:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
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
                            // InternalKerMLExpressions.g:3826:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalKerMLExpressions.g:3836:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalKerMLExpressions.g:3847:1: entryRuleLiteralUnbounded returns [EObject current=null] : iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF ;
    public final EObject entryRuleLiteralUnbounded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnbounded = null;


        try {
            // InternalKerMLExpressions.g:3847:57: (iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF )
            // InternalKerMLExpressions.g:3848:2: iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF
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
    // InternalKerMLExpressions.g:3854:1: ruleLiteralUnbounded returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleLiteralUnbounded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3860:2: ( ( () otherlv_1= '*' ) )
            // InternalKerMLExpressions.g:3861:2: ( () otherlv_1= '*' )
            {
            // InternalKerMLExpressions.g:3861:2: ( () otherlv_1= '*' )
            // InternalKerMLExpressions.g:3862:3: () otherlv_1= '*'
            {
            // InternalKerMLExpressions.g:3862:3: ()
            // InternalKerMLExpressions.g:3863:4: 
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


    // $ANTLR start "entryRuleLiteralUnlimitedNatural"
    // InternalKerMLExpressions.g:3877:1: entryRuleLiteralUnlimitedNatural returns [EObject current=null] : iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF ;
    public final EObject entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnlimitedNatural = null;


        try {
            // InternalKerMLExpressions.g:3877:64: (iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF )
            // InternalKerMLExpressions.g:3878:2: iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralUnlimitedNaturalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralUnlimitedNatural=ruleLiteralUnlimitedNatural();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralUnlimitedNatural; 
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
    // $ANTLR end "entryRuleLiteralUnlimitedNatural"


    // $ANTLR start "ruleLiteralUnlimitedNatural"
    // InternalKerMLExpressions.g:3884:1: ruleLiteralUnlimitedNatural returns [EObject current=null] : (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralUnbounded_1= ruleLiteralUnbounded ) ;
    public final EObject ruleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralInteger_0 = null;

        EObject this_LiteralUnbounded_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3890:2: ( (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralUnbounded_1= ruleLiteralUnbounded ) )
            // InternalKerMLExpressions.g:3891:2: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralUnbounded_1= ruleLiteralUnbounded )
            {
            // InternalKerMLExpressions.g:3891:2: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralUnbounded_1= ruleLiteralUnbounded )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_DECIMAL_VALUE) ) {
                alt50=1;
            }
            else if ( (LA50_0==34) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalKerMLExpressions.g:3892:3: this_LiteralInteger_0= ruleLiteralInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralInteger_0=ruleLiteralInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralInteger_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3901:3: this_LiteralUnbounded_1= ruleLiteralUnbounded
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnboundedParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralUnbounded_1=ruleLiteralUnbounded();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralUnbounded_1;
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
    // $ANTLR end "ruleLiteralUnlimitedNatural"


    // $ANTLR start "entryRuleName"
    // InternalKerMLExpressions.g:3913:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLExpressions.g:3913:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLExpressions.g:3914:2: iv_ruleName= ruleName EOF
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
    // InternalKerMLExpressions.g:3920:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3926:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLExpressions.g:3927:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLExpressions.g:3927:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_UNRESTRICTED_NAME) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalKerMLExpressions.g:3928:3: this_ID_0= RULE_ID
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
                    // InternalKerMLExpressions.g:3936:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalKerMLExpressions.g:3947:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:3947:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:3948:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalKerMLExpressions.g:3954:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3960:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalKerMLExpressions.g:3961:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalKerMLExpressions.g:3961:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt52=2;
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
                case 54:
                case 55:
                case 56:
                    {
                    alt52=1;
                    }
                    break;
                case 43:
                    {
                    int LA52_5 = input.LA(3);

                    if ( (LA52_5==44) ) {
                        alt52=1;
                    }
                    else if ( ((LA52_5>=RULE_ID && LA52_5<=RULE_UNRESTRICTED_NAME)) ) {
                        alt52=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA52_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    int LA52_5 = input.LA(3);

                    if ( (LA52_5==44) ) {
                        alt52=1;
                    }
                    else if ( ((LA52_5>=RULE_ID && LA52_5<=RULE_UNRESTRICTED_NAME)) ) {
                        alt52=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 61:
                    {
                    alt52=2;
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
                case 54:
                case 55:
                case 56:
                    {
                    alt52=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalKerMLExpressions.g:3962:3: this_Name_0= ruleName
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
                    // InternalKerMLExpressions.g:3973:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalKerMLExpressions.g:3984:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalKerMLExpressions.g:3998:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:3998:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalKerMLExpressions.g:3999:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalKerMLExpressions.g:4005:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4011:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalKerMLExpressions.g:4012:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalKerMLExpressions.g:4012:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalKerMLExpressions.g:4013:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Name_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:4023:3: (kw= '::' this_Name_2= ruleName )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==61) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4024:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,61,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // InternalKerMLExpressions.g:4044:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:4044:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalKerMLExpressions.g:4045:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalKerMLExpressions.g:4051:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4057:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalKerMLExpressions.g:4058:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalKerMLExpressions.g:4058:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalKerMLExpressions.g:4059:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
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
            // InternalKerMLExpressions.g:4069:3: (kw= '.' this_Name_2= ruleName )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==43) ) {
                    int LA54_2 = input.LA(2);

                    if ( ((LA54_2>=RULE_ID && LA54_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4070:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,43,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
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


    // $ANTLR start "entryRuleDocumentationComment"
    // InternalKerMLExpressions.g:4090:1: entryRuleDocumentationComment returns [EObject current=null] : iv_ruleDocumentationComment= ruleDocumentationComment EOF ;
    public final EObject entryRuleDocumentationComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentationComment = null;


        try {
            // InternalKerMLExpressions.g:4090:61: (iv_ruleDocumentationComment= ruleDocumentationComment EOF )
            // InternalKerMLExpressions.g:4091:2: iv_ruleDocumentationComment= ruleDocumentationComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentationCommentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDocumentationComment=ruleDocumentationComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocumentationComment; 
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
    // $ANTLR end "entryRuleDocumentationComment"


    // $ANTLR start "ruleDocumentationComment"
    // InternalKerMLExpressions.g:4097:1: ruleDocumentationComment returns [EObject current=null] : (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? ( (lv_body_3_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleDocumentationComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_body_3_0=null;
        AntlrDatatypeRuleToken lv_humanId_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4103:2: ( (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? ( (lv_body_3_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalKerMLExpressions.g:4104:2: (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? ( (lv_body_3_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalKerMLExpressions.g:4104:2: (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? ( (lv_body_3_0= RULE_REGULAR_COMMENT ) ) )
            // InternalKerMLExpressions.g:4105:3: otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? ( (lv_body_3_0= RULE_REGULAR_COMMENT ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDocumentationCommentAccess().getDocKeyword_0());
              		
            }
            // InternalKerMLExpressions.g:4109:3: (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==63) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalKerMLExpressions.g:4110:4: otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) )
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDocumentationCommentAccess().getIdKeyword_1_0());
                      			
                    }
                    // InternalKerMLExpressions.g:4114:4: ( (lv_humanId_2_0= ruleName ) )
                    // InternalKerMLExpressions.g:4115:5: (lv_humanId_2_0= ruleName )
                    {
                    // InternalKerMLExpressions.g:4115:5: (lv_humanId_2_0= ruleName )
                    // InternalKerMLExpressions.g:4116:6: lv_humanId_2_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDocumentationCommentAccess().getHumanIdNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_humanId_2_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDocumentationCommentRule());
                      						}
                      						set(
                      							current,
                      							"humanId",
                      							lv_humanId_2_0,
                      							"org.omg.kerml.expressions.xtext.KerMLExpressions.Name");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKerMLExpressions.g:4134:3: ( (lv_body_3_0= RULE_REGULAR_COMMENT ) )
            // InternalKerMLExpressions.g:4135:4: (lv_body_3_0= RULE_REGULAR_COMMENT )
            {
            // InternalKerMLExpressions.g:4135:4: (lv_body_3_0= RULE_REGULAR_COMMENT )
            // InternalKerMLExpressions.g:4136:5: lv_body_3_0= RULE_REGULAR_COMMENT
            {
            lv_body_3_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_body_3_0, grammarAccess.getDocumentationCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDocumentationCommentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"body",
              						lv_body_3_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.REGULAR_COMMENT");
              				
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
    // $ANTLR end "ruleDocumentationComment"


    // $ANTLR start "entryRulePrefixDocumentation"
    // InternalKerMLExpressions.g:4156:1: entryRulePrefixDocumentation returns [EObject current=null] : iv_rulePrefixDocumentation= rulePrefixDocumentation EOF ;
    public final EObject entryRulePrefixDocumentation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixDocumentation = null;


        try {
            // InternalKerMLExpressions.g:4156:60: (iv_rulePrefixDocumentation= rulePrefixDocumentation EOF )
            // InternalKerMLExpressions.g:4157:2: iv_rulePrefixDocumentation= rulePrefixDocumentation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixDocumentationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixDocumentation=rulePrefixDocumentation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixDocumentation; 
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
    // $ANTLR end "entryRulePrefixDocumentation"


    // $ANTLR start "rulePrefixDocumentation"
    // InternalKerMLExpressions.g:4163:1: rulePrefixDocumentation returns [EObject current=null] : ( (lv_ownedRelatedElement_comp_0_0= rulePrefixDocumentationComment ) ) ;
    public final EObject rulePrefixDocumentation() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_comp_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4169:2: ( ( (lv_ownedRelatedElement_comp_0_0= rulePrefixDocumentationComment ) ) )
            // InternalKerMLExpressions.g:4170:2: ( (lv_ownedRelatedElement_comp_0_0= rulePrefixDocumentationComment ) )
            {
            // InternalKerMLExpressions.g:4170:2: ( (lv_ownedRelatedElement_comp_0_0= rulePrefixDocumentationComment ) )
            // InternalKerMLExpressions.g:4171:3: (lv_ownedRelatedElement_comp_0_0= rulePrefixDocumentationComment )
            {
            // InternalKerMLExpressions.g:4171:3: (lv_ownedRelatedElement_comp_0_0= rulePrefixDocumentationComment )
            // InternalKerMLExpressions.g:4172:4: lv_ownedRelatedElement_comp_0_0= rulePrefixDocumentationComment
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrefixDocumentationAccess().getOwnedRelatedElement_compPrefixDocumentationCommentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_comp_0_0=rulePrefixDocumentationComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrefixDocumentationRule());
              				}
              				add(
              					current,
              					"ownedRelatedElement_comp",
              					lv_ownedRelatedElement_comp_0_0,
              					"org.omg.kerml.expressions.xtext.KerMLExpressions.PrefixDocumentationComment");
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
    // $ANTLR end "rulePrefixDocumentation"


    // $ANTLR start "entryRulePrefixDocumentationComment"
    // InternalKerMLExpressions.g:4192:1: entryRulePrefixDocumentationComment returns [EObject current=null] : iv_rulePrefixDocumentationComment= rulePrefixDocumentationComment EOF ;
    public final EObject entryRulePrefixDocumentationComment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixDocumentationComment = null;


        try {
            // InternalKerMLExpressions.g:4192:67: (iv_rulePrefixDocumentationComment= rulePrefixDocumentationComment EOF )
            // InternalKerMLExpressions.g:4193:2: iv_rulePrefixDocumentationComment= rulePrefixDocumentationComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixDocumentationCommentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixDocumentationComment=rulePrefixDocumentationComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixDocumentationComment; 
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
    // $ANTLR end "entryRulePrefixDocumentationComment"


    // $ANTLR start "rulePrefixDocumentationComment"
    // InternalKerMLExpressions.g:4199:1: rulePrefixDocumentationComment returns [EObject current=null] : ( (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? )? ( (lv_body_3_0= RULE_DOCUMENTATION_COMMENT ) ) ) ;
    public final EObject rulePrefixDocumentationComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_body_3_0=null;
        AntlrDatatypeRuleToken lv_humanId_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4205:2: ( ( (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? )? ( (lv_body_3_0= RULE_DOCUMENTATION_COMMENT ) ) ) )
            // InternalKerMLExpressions.g:4206:2: ( (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? )? ( (lv_body_3_0= RULE_DOCUMENTATION_COMMENT ) ) )
            {
            // InternalKerMLExpressions.g:4206:2: ( (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? )? ( (lv_body_3_0= RULE_DOCUMENTATION_COMMENT ) ) )
            // InternalKerMLExpressions.g:4207:3: (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? )? ( (lv_body_3_0= RULE_DOCUMENTATION_COMMENT ) )
            {
            // InternalKerMLExpressions.g:4207:3: (otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )? )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==62) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalKerMLExpressions.g:4208:4: otherlv_0= 'doc' (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )?
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrefixDocumentationCommentAccess().getDocKeyword_0_0());
                      			
                    }
                    // InternalKerMLExpressions.g:4212:4: (otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==63) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalKerMLExpressions.g:4213:5: otherlv_1= 'id' ( (lv_humanId_2_0= ruleName ) )
                            {
                            otherlv_1=(Token)match(input,63,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getPrefixDocumentationCommentAccess().getIdKeyword_0_1_0());
                              				
                            }
                            // InternalKerMLExpressions.g:4217:5: ( (lv_humanId_2_0= ruleName ) )
                            // InternalKerMLExpressions.g:4218:6: (lv_humanId_2_0= ruleName )
                            {
                            // InternalKerMLExpressions.g:4218:6: (lv_humanId_2_0= ruleName )
                            // InternalKerMLExpressions.g:4219:7: lv_humanId_2_0= ruleName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrefixDocumentationCommentAccess().getHumanIdNameParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_51);
                            lv_humanId_2_0=ruleName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPrefixDocumentationCommentRule());
                              							}
                              							set(
                              								current,
                              								"humanId",
                              								lv_humanId_2_0,
                              								"org.omg.kerml.expressions.xtext.KerMLExpressions.Name");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalKerMLExpressions.g:4238:3: ( (lv_body_3_0= RULE_DOCUMENTATION_COMMENT ) )
            // InternalKerMLExpressions.g:4239:4: (lv_body_3_0= RULE_DOCUMENTATION_COMMENT )
            {
            // InternalKerMLExpressions.g:4239:4: (lv_body_3_0= RULE_DOCUMENTATION_COMMENT )
            // InternalKerMLExpressions.g:4240:5: lv_body_3_0= RULE_DOCUMENTATION_COMMENT
            {
            lv_body_3_0=(Token)match(input,RULE_DOCUMENTATION_COMMENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_body_3_0, grammarAccess.getPrefixDocumentationCommentAccess().getBodyDOCUMENTATION_COMMENTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrefixDocumentationCommentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"body",
              						lv_body_3_0,
              						"org.omg.kerml.expressions.xtext.KerMLExpressions.DOCUMENTATION_COMMENT");
              				
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
    // $ANTLR end "rulePrefixDocumentationComment"


    // $ANTLR start "entryRuleOwnedFeatureTyping"
    // InternalKerMLExpressions.g:4260:1: entryRuleOwnedFeatureTyping returns [EObject current=null] : iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF ;
    public final EObject entryRuleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureTyping = null;


        try {
            // InternalKerMLExpressions.g:4260:59: (iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:4261:2: iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF
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
    // InternalKerMLExpressions.g:4267:1: ruleOwnedFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4273:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:4274:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:4274:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:4275:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:4275:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:4276:4: ruleQualifiedName
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


    // $ANTLR start "entryRuleOwnedSubsetting"
    // InternalKerMLExpressions.g:4293:1: entryRuleOwnedSubsetting returns [EObject current=null] : iv_ruleOwnedSubsetting= ruleOwnedSubsetting EOF ;
    public final EObject entryRuleOwnedSubsetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedSubsetting = null;


        try {
            // InternalKerMLExpressions.g:4293:56: (iv_ruleOwnedSubsetting= ruleOwnedSubsetting EOF )
            // InternalKerMLExpressions.g:4294:2: iv_ruleOwnedSubsetting= ruleOwnedSubsetting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOwnedSubsettingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOwnedSubsetting=ruleOwnedSubsetting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOwnedSubsetting; 
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
    // $ANTLR end "entryRuleOwnedSubsetting"


    // $ANTLR start "ruleOwnedSubsetting"
    // InternalKerMLExpressions.g:4300:1: ruleOwnedSubsetting returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleOwnedSubsetting() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4306:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:4307:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:4307:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:4308:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:4308:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:4309:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getOwnedSubsettingRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOwnedSubsettingAccess().getSubsettedFeatureFeatureCrossReference_0());
              			
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
    // $ANTLR end "ruleOwnedSubsetting"


    // $ANTLR start "entryRuleResultExpressionMember"
    // InternalKerMLExpressions.g:4326:1: entryRuleResultExpressionMember returns [EObject current=null] : iv_ruleResultExpressionMember= ruleResultExpressionMember EOF ;
    public final EObject entryRuleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:4326:63: (iv_ruleResultExpressionMember= ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:4327:2: iv_ruleResultExpressionMember= ruleResultExpressionMember EOF
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
    // InternalKerMLExpressions.g:4333:1: ruleResultExpressionMember returns [EObject current=null] : (this_DefinitionMemberPrefix_0= ruleDefinitionMemberPrefix[$current] ( (lv_ownedResultExpression_comp_1_0= ruleOwnedExpression ) ) ) ;
    public final EObject ruleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionMemberPrefix_0 = null;

        EObject lv_ownedResultExpression_comp_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4339:2: ( (this_DefinitionMemberPrefix_0= ruleDefinitionMemberPrefix[$current] ( (lv_ownedResultExpression_comp_1_0= ruleOwnedExpression ) ) ) )
            // InternalKerMLExpressions.g:4340:2: (this_DefinitionMemberPrefix_0= ruleDefinitionMemberPrefix[$current] ( (lv_ownedResultExpression_comp_1_0= ruleOwnedExpression ) ) )
            {
            // InternalKerMLExpressions.g:4340:2: (this_DefinitionMemberPrefix_0= ruleDefinitionMemberPrefix[$current] ( (lv_ownedResultExpression_comp_1_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:4341:3: this_DefinitionMemberPrefix_0= ruleDefinitionMemberPrefix[$current] ( (lv_ownedResultExpression_comp_1_0= ruleOwnedExpression ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getResultExpressionMemberRule());
              			}
              			newCompositeNode(grammarAccess.getResultExpressionMemberAccess().getDefinitionMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            this_DefinitionMemberPrefix_0=ruleDefinitionMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionMemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKerMLExpressions.g:4352:3: ( (lv_ownedResultExpression_comp_1_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:4353:4: (lv_ownedResultExpression_comp_1_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:4353:4: (lv_ownedResultExpression_comp_1_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:4354:5: lv_ownedResultExpression_comp_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getResultExpressionMemberAccess().getOwnedResultExpression_compOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedResultExpression_comp_1_0=ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getResultExpressionMemberRule());
              					}
              					set(
              						current,
              						"ownedResultExpression_comp",
              						lv_ownedResultExpression_comp_1_0,
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
    // $ANTLR end "ruleResultExpressionMember"


    // $ANTLR start "ruleDefinitionMemberPrefix"
    // InternalKerMLExpressions.g:4376:1: ruleDefinitionMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_comp_0_0= rulePrefixDocumentation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) ;
    public final EObject ruleDefinitionMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_comp_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4382:2: ( ( ( (lv_ownedRelationship_comp_0_0= rulePrefixDocumentation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) )
            // InternalKerMLExpressions.g:4383:2: ( ( (lv_ownedRelationship_comp_0_0= rulePrefixDocumentation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            {
            // InternalKerMLExpressions.g:4383:2: ( ( (lv_ownedRelationship_comp_0_0= rulePrefixDocumentation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            // InternalKerMLExpressions.g:4384:3: ( (lv_ownedRelationship_comp_0_0= rulePrefixDocumentation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            {
            // InternalKerMLExpressions.g:4384:3: ( (lv_ownedRelationship_comp_0_0= rulePrefixDocumentation ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_DOCUMENTATION_COMMENT||LA58_0==62) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4385:4: (lv_ownedRelationship_comp_0_0= rulePrefixDocumentation )
            	    {
            	    // InternalKerMLExpressions.g:4385:4: (lv_ownedRelationship_comp_0_0= rulePrefixDocumentation )
            	    // InternalKerMLExpressions.g:4386:5: lv_ownedRelationship_comp_0_0= rulePrefixDocumentation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefinitionMemberPrefixAccess().getOwnedRelationship_compPrefixDocumentationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_ownedRelationship_comp_0_0=rulePrefixDocumentation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDefinitionMemberPrefixRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedRelationship_comp",
            	      						lv_ownedRelationship_comp_0_0,
            	      						"org.omg.kerml.expressions.xtext.KerMLExpressions.PrefixDocumentation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // InternalKerMLExpressions.g:4403:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=64 && LA59_0<=67)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalKerMLExpressions.g:4404:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalKerMLExpressions.g:4404:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalKerMLExpressions.g:4405:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefinitionMemberPrefixAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefinitionMemberPrefixRule());
                      					}
                      					set(
                      						current,
                      						"visibility",
                      						lv_visibility_1_0,
                      						"org.omg.kerml.expressions.xtext.KerMLExpressions.VisibilityIndicator");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleDefinitionMemberPrefix"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalKerMLExpressions.g:4426:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4432:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalKerMLExpressions.g:4433:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalKerMLExpressions.g:4433:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt60=1;
                }
                break;
            case 65:
                {
                alt60=2;
                }
                break;
            case 66:
                {
                alt60=3;
                }
                break;
            case 67:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalKerMLExpressions.g:4434:3: (enumLiteral_0= 'public' )
                    {
                    // InternalKerMLExpressions.g:4434:3: (enumLiteral_0= 'public' )
                    // InternalKerMLExpressions.g:4435:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4442:3: (enumLiteral_1= 'private' )
                    {
                    // InternalKerMLExpressions.g:4442:3: (enumLiteral_1= 'private' )
                    // InternalKerMLExpressions.g:4443:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:4450:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalKerMLExpressions.g:4450:3: (enumLiteral_2= 'protected' )
                    // InternalKerMLExpressions.g:4451:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:4458:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalKerMLExpressions.g:4458:3: (enumLiteral_3= 'packaged' )
                    // InternalKerMLExpressions.g:4459:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleVisibilityIndicator"

    // $ANTLR start synpred1_InternalKerMLExpressions
    public final void synpred1_InternalKerMLExpressions_fragment() throws RecognitionException {   
        // InternalKerMLExpressions.g:2218:4: ( ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' ) )
        // InternalKerMLExpressions.g:2218:5: ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' )
        {
        // InternalKerMLExpressions.g:2218:5: ( ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')' )
        // InternalKerMLExpressions.g:2219:5: ( ( ruleBodyParameterMember ) ) ( ( ruleBodyParameterMember ) )* '(' ( ( ruleResultExpressionMember ) ) ')'
        {
        // InternalKerMLExpressions.g:2219:5: ( ( ruleBodyParameterMember ) )
        // InternalKerMLExpressions.g:2220:6: ( ruleBodyParameterMember )
        {
        // InternalKerMLExpressions.g:2220:6: ( ruleBodyParameterMember )
        // InternalKerMLExpressions.g:2221:7: ruleBodyParameterMember
        {
        pushFollow(FOLLOW_28);
        ruleBodyParameterMember();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKerMLExpressions.g:2224:5: ( ( ruleBodyParameterMember ) )*
        loop61:
        do {
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt61=1;
            }


            switch (alt61) {
        	case 1 :
        	    // InternalKerMLExpressions.g:2225:6: ( ruleBodyParameterMember )
        	    {
        	    // InternalKerMLExpressions.g:2225:6: ( ruleBodyParameterMember )
        	    // InternalKerMLExpressions.g:2226:7: ruleBodyParameterMember
        	    {
        	    pushFollow(FOLLOW_28);
        	    ruleBodyParameterMember();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop61;
            }
        } while (true);

        match(input,45,FOLLOW_29); if (state.failed) return ;
        // InternalKerMLExpressions.g:2230:5: ( ( ruleResultExpressionMember ) )
        // InternalKerMLExpressions.g:2231:6: ( ruleResultExpressionMember )
        {
        // InternalKerMLExpressions.g:2231:6: ( ruleResultExpressionMember )
        // InternalKerMLExpressions.g:2232:7: ruleResultExpressionMember
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


    protected DFA40 dfa40 = new DFA40(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\3\uffff\2\10\5\uffff\4\10\1\uffff";
    static final String dfa_3s = "\1\4\2\uffff\2\16\1\uffff\1\7\2\uffff\1\7\4\16\1\uffff";
    static final String dfa_4s = "\1\74\2\uffff\2\75\1\uffff\1\10\2\uffff\1\54\2\75\2\70\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\6\1\uffff\1\4\1\3\5\uffff\1\5";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\3\2\1\3\1\4\31\uffff\1\2\10\uffff\1\2\1\uffff\1\5\14\uffff\1\1\2\2",
            "",
            "",
            "\32\10\3\uffff\1\11\1\uffff\1\7\3\10\5\uffff\3\10\4\uffff\1\6",
            "\32\10\3\uffff\1\11\1\uffff\1\7\3\10\5\uffff\3\10\4\uffff\1\6",
            "",
            "\1\12\1\13",
            "",
            "",
            "\1\14\1\15\43\uffff\1\16",
            "\32\10\3\uffff\1\16\1\uffff\1\7\3\10\5\uffff\3\10\4\uffff\1\6",
            "\32\10\3\uffff\1\16\1\uffff\1\7\3\10\5\uffff\3\10\4\uffff\1\6",
            "\32\10\3\uffff\1\11\1\uffff\1\7\3\10\5\uffff\3\10",
            "\32\10\3\uffff\1\11\1\uffff\1\7\3\10\5\uffff\3\10",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3076:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExtentExpression_Deprecated_4= ruleExtentExpression_Deprecated | (otherlv_5= '(' this_OwnedExpression_6= ruleOwnedExpression otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1C202F07000001F0L});
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x5C202F07000005F0L,0x000000000000000FL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008800000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000004002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1800080400000070L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1C206F07000001F0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000400L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000402L,0x000000000000000FL});

}