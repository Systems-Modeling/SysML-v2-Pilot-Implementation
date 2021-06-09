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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_VALUE", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_DOCUMENTATION_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "':'", "'?'", "'??'", "'implies'", "'|'", "'||'", "'or'", "'^^'", "'xor'", "'&'", "'&&'", "'and'", "'=='", "'!='", "'instanceof'", "'hastype'", "'istype'", "'@'", "'as'", "'<'", "'>'", "'<='", "'>='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'^'", "'@['", "']'", "'!'", "'~'", "'not'", "'all'", "'['", "'->'", "'.'", "'('", "')'", "'{'", "';'", "'}'", "'in'", "','", "'=>'", "'null'", "'true'", "'false'", "'::'"
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
    // InternalKerMLExpressions.g:132:1: ruleConditionalExpression returns [EObject current=null] : (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NullCoalescingExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_operand_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:138:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? ) )
            // InternalKerMLExpressions.g:139:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? )
            {
            // InternalKerMLExpressions.g:139:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )? )
            // InternalKerMLExpressions.g:140:3: this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_NullCoalescingExpression_0=ruleNullCoalescingExpression();

            state._fsp--;


            			current = this_NullCoalescingExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:148:3: ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKerMLExpressions.g:149:4: () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalExpression ) )
                    {
                    // InternalKerMLExpressions.g:149:4: ()
                    // InternalKerMLExpressions.g:150:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:156:4: ( (lv_operator_2_0= ruleConditionalTestOperator ) )
                    // InternalKerMLExpressions.g:157:5: (lv_operator_2_0= ruleConditionalTestOperator )
                    {
                    // InternalKerMLExpressions.g:157:5: (lv_operator_2_0= ruleConditionalTestOperator )
                    // InternalKerMLExpressions.g:158:6: lv_operator_2_0= ruleConditionalTestOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalTestOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_operator_2_0=ruleConditionalTestOperator();

                    state._fsp--;


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

                    // InternalKerMLExpressions.g:175:4: ( (lv_operand_3_0= ruleOwnedExpression ) )
                    // InternalKerMLExpressions.g:176:5: (lv_operand_3_0= ruleOwnedExpression )
                    {
                    // InternalKerMLExpressions.g:176:5: (lv_operand_3_0= ruleOwnedExpression )
                    // InternalKerMLExpressions.g:177:6: lv_operand_3_0= ruleOwnedExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_0());
                    					
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

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                    			
                    // InternalKerMLExpressions.g:198:4: ( (lv_operand_5_0= ruleConditionalExpression ) )
                    // InternalKerMLExpressions.g:199:5: (lv_operand_5_0= ruleConditionalExpression )
                    {
                    // InternalKerMLExpressions.g:199:5: (lv_operand_5_0= ruleConditionalExpression )
                    // InternalKerMLExpressions.g:200:6: lv_operand_5_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_1_4_0());
                    					
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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getConditionalTestOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalTestOperator=ruleConditionalTestOperator();

            state._fsp--;

             current =iv_ruleConditionalTestOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalTestOperatorAccess().getQuestionMarkKeyword());
            	

            }


            	leaveRule();

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
    // InternalKerMLExpressions.g:251:1: ruleNullCoalescingExpression returns [EObject current=null] : (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )* ) ;
    public final EObject ruleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:257:2: ( (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )* ) )
            // InternalKerMLExpressions.g:258:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:258:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )* )
            // InternalKerMLExpressions.g:259:3: this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;


            			current = this_ImpliesExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:267:3: ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKerMLExpressions.g:268:4: () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:268:4: ()
            	    // InternalKerMLExpressions.g:269:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:275:4: ( (lv_operator_2_0= ruleNullCoalescingOperator ) )
            	    // InternalKerMLExpressions.g:276:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    {
            	    // InternalKerMLExpressions.g:276:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    // InternalKerMLExpressions.g:277:6: lv_operator_2_0= ruleNullCoalescingOperator
            	    {

            	    						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperatorNullCoalescingOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:294:4: ( (lv_operand_3_0= ruleImpliesExpression ) )
            	    // InternalKerMLExpressions.g:295:5: (lv_operand_3_0= ruleImpliesExpression )
            	    {
            	    // InternalKerMLExpressions.g:295:5: (lv_operand_3_0= ruleImpliesExpression )
            	    // InternalKerMLExpressions.g:296:6: lv_operand_3_0= ruleImpliesExpression
            	    {

            	    						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperandImpliesExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
    // InternalKerMLExpressions.g:318:1: entryRuleNullCoalescingOperator returns [String current=null] : iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF ;
    public final String entryRuleNullCoalescingOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullCoalescingOperator = null;


        try {
            // InternalKerMLExpressions.g:318:62: (iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF )
            // InternalKerMLExpressions.g:319:2: iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF
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
    // InternalKerMLExpressions.g:325:1: ruleNullCoalescingOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '??' ;
    public final AntlrDatatypeRuleToken ruleNullCoalescingOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:331:2: (kw= '??' )
            // InternalKerMLExpressions.g:332:2: kw= '??'
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


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalKerMLExpressions.g:340:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalKerMLExpressions.g:340:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalKerMLExpressions.g:341:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
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
    // InternalKerMLExpressions.g:347:1: ruleImpliesExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:353:2: ( (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* ) )
            // InternalKerMLExpressions.g:354:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:354:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* )
            // InternalKerMLExpressions.g:355:3: this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            			current = this_OrExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:363:3: ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKerMLExpressions.g:364:4: () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:364:4: ()
            	    // InternalKerMLExpressions.g:365:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getImpliesExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:371:4: ( (lv_operator_2_0= ruleImpliesOperator ) )
            	    // InternalKerMLExpressions.g:372:5: (lv_operator_2_0= ruleImpliesOperator )
            	    {
            	    // InternalKerMLExpressions.g:372:5: (lv_operator_2_0= ruleImpliesOperator )
            	    // InternalKerMLExpressions.g:373:6: lv_operator_2_0= ruleImpliesOperator
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:390:4: ( (lv_operand_3_0= ruleOrExpression ) )
            	    // InternalKerMLExpressions.g:391:5: (lv_operand_3_0= ruleOrExpression )
            	    {
            	    // InternalKerMLExpressions.g:391:5: (lv_operand_3_0= ruleOrExpression )
            	    // InternalKerMLExpressions.g:392:6: lv_operand_3_0= ruleOrExpression
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperandOrExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
    // InternalKerMLExpressions.g:414:1: entryRuleImpliesOperator returns [String current=null] : iv_ruleImpliesOperator= ruleImpliesOperator EOF ;
    public final String entryRuleImpliesOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpliesOperator = null;


        try {
            // InternalKerMLExpressions.g:414:55: (iv_ruleImpliesOperator= ruleImpliesOperator EOF )
            // InternalKerMLExpressions.g:415:2: iv_ruleImpliesOperator= ruleImpliesOperator EOF
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
    // InternalKerMLExpressions.g:421:1: ruleImpliesOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'implies' ;
    public final AntlrDatatypeRuleToken ruleImpliesOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:427:2: (kw= 'implies' )
            // InternalKerMLExpressions.g:428:2: kw= 'implies'
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


    // $ANTLR start "entryRuleOrExpression"
    // InternalKerMLExpressions.g:436:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalKerMLExpressions.g:436:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLExpressions.g:437:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalKerMLExpressions.g:443:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:449:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) )
            // InternalKerMLExpressions.g:450:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:450:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            // InternalKerMLExpressions.g:451:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:459:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKerMLExpressions.g:460:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:460:4: ()
            	    // InternalKerMLExpressions.g:461:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:467:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalKerMLExpressions.g:468:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalKerMLExpressions.g:468:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalKerMLExpressions.g:469:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:486:4: ( (lv_operand_3_0= ruleXorExpression ) )
            	    // InternalKerMLExpressions.g:487:5: (lv_operand_3_0= ruleXorExpression )
            	    {
            	    // InternalKerMLExpressions.g:487:5: (lv_operand_3_0= ruleXorExpression )
            	    // InternalKerMLExpressions.g:488:6: lv_operand_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrOperator"
    // InternalKerMLExpressions.g:510:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalKerMLExpressions.g:510:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalKerMLExpressions.g:511:2: iv_ruleOrOperator= ruleOrOperator EOF
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
    // InternalKerMLExpressions.g:517:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' | kw= '||' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:523:2: ( (kw= '|' | kw= '||' | kw= 'or' ) )
            // InternalKerMLExpressions.g:524:2: (kw= '|' | kw= '||' | kw= 'or' )
            {
            // InternalKerMLExpressions.g:524:2: (kw= '|' | kw= '||' | kw= 'or' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKerMLExpressions.g:525:3: kw= '|'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:531:3: kw= '||'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:537:3: kw= 'or'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:546:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalKerMLExpressions.g:546:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLExpressions.g:547:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalKerMLExpressions.g:553:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:559:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:560:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:560:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            // InternalKerMLExpressions.g:561:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:569:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKerMLExpressions.g:570:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:570:4: ()
            	    // InternalKerMLExpressions.g:571:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:577:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalKerMLExpressions.g:578:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalKerMLExpressions.g:578:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalKerMLExpressions.g:579:6: lv_operator_2_0= ruleXorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:596:4: ( (lv_operand_3_0= ruleAndExpression ) )
            	    // InternalKerMLExpressions.g:597:5: (lv_operand_3_0= ruleAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:597:5: (lv_operand_3_0= ruleAndExpression )
            	    // InternalKerMLExpressions.g:598:6: lv_operand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
    // InternalKerMLExpressions.g:620:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalKerMLExpressions.g:620:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalKerMLExpressions.g:621:2: iv_ruleXorOperator= ruleXorOperator EOF
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
    // InternalKerMLExpressions.g:627:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '^^' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:633:2: ( (kw= '^^' | kw= 'xor' ) )
            // InternalKerMLExpressions.g:634:2: (kw= '^^' | kw= 'xor' )
            {
            // InternalKerMLExpressions.g:634:2: (kw= '^^' | kw= 'xor' )
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
                    // InternalKerMLExpressions.g:635:3: kw= '^^'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXorOperatorAccess().getCircumflexAccentCircumflexAccentKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:641:3: kw= 'xor'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:650:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalKerMLExpressions.g:650:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLExpressions.g:651:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalKerMLExpressions.g:657:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:663:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalKerMLExpressions.g:664:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:664:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            // InternalKerMLExpressions.g:665:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:673:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=23 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKerMLExpressions.g:674:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:674:4: ()
            	    // InternalKerMLExpressions.g:675:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:681:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalKerMLExpressions.g:682:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalKerMLExpressions.g:682:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalKerMLExpressions.g:683:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:700:4: ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    // InternalKerMLExpressions.g:701:5: (lv_operand_3_0= ruleEqualityExpression )
            	    {
            	    // InternalKerMLExpressions.g:701:5: (lv_operand_3_0= ruleEqualityExpression )
            	    // InternalKerMLExpressions.g:702:6: lv_operand_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // InternalKerMLExpressions.g:724:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalKerMLExpressions.g:724:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalKerMLExpressions.g:725:2: iv_ruleAndOperator= ruleAndOperator EOF
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
    // InternalKerMLExpressions.g:731:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '&&' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:737:2: ( (kw= '&' | kw= '&&' | kw= 'and' ) )
            // InternalKerMLExpressions.g:738:2: (kw= '&' | kw= '&&' | kw= 'and' )
            {
            // InternalKerMLExpressions.g:738:2: (kw= '&' | kw= '&&' | kw= 'and' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKerMLExpressions.g:739:3: kw= '&'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:745:3: kw= '&&'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:751:3: kw= 'and'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:760:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLExpressions.g:760:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:761:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalKerMLExpressions.g:767:1: ruleEqualityExpression returns [EObject current=null] : (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:773:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:774:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:774:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            // InternalKerMLExpressions.g:775:3: this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_ClassificationExpression_0=ruleClassificationExpression();

            state._fsp--;


            			current = this_ClassificationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:783:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKerMLExpressions.g:784:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:784:4: ()
            	    // InternalKerMLExpressions.g:785:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:791:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalKerMLExpressions.g:792:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalKerMLExpressions.g:792:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalKerMLExpressions.g:793:6: lv_operator_2_0= ruleEqualityOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:810:4: ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    // InternalKerMLExpressions.g:811:5: (lv_operand_3_0= ruleClassificationExpression )
            	    {
            	    // InternalKerMLExpressions.g:811:5: (lv_operand_3_0= ruleClassificationExpression )
            	    // InternalKerMLExpressions.g:812:6: lv_operand_3_0= ruleClassificationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperandClassificationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleEqualityOperator"
    // InternalKerMLExpressions.g:834:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalKerMLExpressions.g:834:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:835:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalKerMLExpressions.g:841:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:847:2: ( (kw= '==' | kw= '!=' ) )
            // InternalKerMLExpressions.g:848:2: (kw= '==' | kw= '!=' )
            {
            // InternalKerMLExpressions.g:848:2: (kw= '==' | kw= '!=' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKerMLExpressions.g:849:3: kw= '=='
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:855:3: kw= '!='
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:864:1: entryRuleClassificationExpression returns [EObject current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final EObject entryRuleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLExpressions.g:864:65: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:865:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
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
    // InternalKerMLExpressions.g:871:1: ruleClassificationExpression returns [EObject current=null] : ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) ) ;
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
            // InternalKerMLExpressions.g:877:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) ) )
            // InternalKerMLExpressions.g:878:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) )
            {
            // InternalKerMLExpressions.g:878:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING_VALUE && LA13_0<=RULE_UNRESTRICTED_NAME)||(LA13_0>=38 && LA13_0<=40)||(LA13_0>=47 && LA13_0<=50)||(LA13_0>=53 && LA13_0<=54)||LA13_0==56||(LA13_0>=62 && LA13_0<=64)) ) {
                alt13=1;
            }
            else if ( (LA13_0==EOF||(LA13_0>=28 && LA13_0<=32)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalKerMLExpressions.g:879:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? )
                    {
                    // InternalKerMLExpressions.g:879:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? )
                    // InternalKerMLExpressions.g:880:4: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_RelationalExpression_0=ruleRelationalExpression();

                    state._fsp--;


                    				current = this_RelationalExpression_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLExpressions.g:888:4: ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=28 && LA12_0<=32)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalKerMLExpressions.g:889:5: () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            {
                            // InternalKerMLExpressions.g:889:5: ()
                            // InternalKerMLExpressions.g:890:6: 
                            {

                            						current = forceCreateModelElementAndAdd(
                            							grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalKerMLExpressions.g:896:5: ( (lv_operator_2_0= ruleClassificationOperator ) )
                            // InternalKerMLExpressions.g:897:6: (lv_operator_2_0= ruleClassificationOperator )
                            {
                            // InternalKerMLExpressions.g:897:6: (lv_operator_2_0= ruleClassificationOperator )
                            // InternalKerMLExpressions.g:898:7: lv_operator_2_0= ruleClassificationOperator
                            {

                            							newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_13);
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

                            // InternalKerMLExpressions.g:915:5: ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            // InternalKerMLExpressions.g:916:6: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            {
                            // InternalKerMLExpressions.g:916:6: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            // InternalKerMLExpressions.g:917:7: lv_ownedRelationship_3_0= ruleTypeReferenceMember
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
                    // InternalKerMLExpressions.g:937:3: ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:937:3: ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:938:4: () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:938:4: ()
                    // InternalKerMLExpressions.g:939:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:945:4: ( (lv_operand_5_0= ruleSelfReferenceExpression ) )
                    // InternalKerMLExpressions.g:946:5: (lv_operand_5_0= ruleSelfReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:946:5: (lv_operand_5_0= ruleSelfReferenceExpression )
                    // InternalKerMLExpressions.g:947:6: lv_operand_5_0= ruleSelfReferenceExpression
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperandSelfReferenceExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalKerMLExpressions.g:964:4: ( (lv_operator_6_0= ruleClassificationOperator ) )
                    // InternalKerMLExpressions.g:965:5: (lv_operator_6_0= ruleClassificationOperator )
                    {
                    // InternalKerMLExpressions.g:965:5: (lv_operator_6_0= ruleClassificationOperator )
                    // InternalKerMLExpressions.g:966:6: lv_operator_6_0= ruleClassificationOperator
                    {

                    						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalKerMLExpressions.g:983:4: ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:984:5: (lv_ownedRelationship_7_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:984:5: (lv_ownedRelationship_7_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:985:6: lv_ownedRelationship_7_0= ruleTypeReferenceMember
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
    // InternalKerMLExpressions.g:1007:1: entryRuleClassificationOperator returns [String current=null] : iv_ruleClassificationOperator= ruleClassificationOperator EOF ;
    public final String entryRuleClassificationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationOperator = null;


        try {
            // InternalKerMLExpressions.g:1007:62: (iv_ruleClassificationOperator= ruleClassificationOperator EOF )
            // InternalKerMLExpressions.g:1008:2: iv_ruleClassificationOperator= ruleClassificationOperator EOF
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
    // InternalKerMLExpressions.g:1014:1: ruleClassificationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleClassificationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1020:2: ( (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' ) )
            // InternalKerMLExpressions.g:1021:2: (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' )
            {
            // InternalKerMLExpressions.g:1021:2: (kw= 'instanceof' | kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' )
            int alt14=5;
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
            case 32:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKerMLExpressions.g:1022:3: kw= 'instanceof'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getInstanceofKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1028:3: kw= 'hastype'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1034:3: kw= 'istype'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1040:3: kw= '@'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:1046:3: kw= 'as'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1055:1: entryRuleTypeReferenceMember returns [EObject current=null] : iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF ;
    public final EObject entryRuleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1055:60: (iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:1056:2: iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF
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
    // InternalKerMLExpressions.g:1062:1: ruleTypeReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) ;
    public final EObject ruleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1068:2: ( ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) )
            // InternalKerMLExpressions.g:1069:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            {
            // InternalKerMLExpressions.g:1069:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            // InternalKerMLExpressions.g:1070:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            {
            // InternalKerMLExpressions.g:1070:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            // InternalKerMLExpressions.g:1071:4: lv_ownedRelatedElement_0_0= ruleTypeReference
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
    // InternalKerMLExpressions.g:1091:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalKerMLExpressions.g:1091:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalKerMLExpressions.g:1092:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalKerMLExpressions.g:1098:1: ruleTypeReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1104:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) )
            // InternalKerMLExpressions.g:1105:2: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            {
            // InternalKerMLExpressions.g:1105:2: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:1106:3: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:1106:3: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:1107:4: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
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
    // InternalKerMLExpressions.g:1127:1: entryRuleOwnedFeatureTyping returns [EObject current=null] : iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF ;
    public final EObject entryRuleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureTyping = null;


        try {
            // InternalKerMLExpressions.g:1127:59: (iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:1128:2: iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF
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
    // InternalKerMLExpressions.g:1134:1: ruleOwnedFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1140:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:1141:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:1141:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:1142:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:1142:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:1143:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:1160:1: entryRuleSelfReferenceExpression returns [EObject current=null] : iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF ;
    public final EObject entryRuleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:1160:64: (iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:1161:2: iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF
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
    // InternalKerMLExpressions.g:1167:1: ruleSelfReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) ;
    public final EObject ruleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1173:2: ( ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) )
            // InternalKerMLExpressions.g:1174:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            {
            // InternalKerMLExpressions.g:1174:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:1175:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:1175:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:1176:4: lv_ownedRelationship_0_0= ruleSelfReferenceMember
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
    // InternalKerMLExpressions.g:1196:1: entryRuleSelfReferenceMember returns [EObject current=null] : iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF ;
    public final EObject entryRuleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1196:60: (iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:1197:2: iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF
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
    // InternalKerMLExpressions.g:1203:1: ruleSelfReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) ;
    public final EObject ruleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1209:2: ( ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) )
            // InternalKerMLExpressions.g:1210:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            {
            // InternalKerMLExpressions.g:1210:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:1211:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:1211:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            // InternalKerMLExpressions.g:1212:4: lv_ownedRelatedElement_0_0= ruleEmptyFeature
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
    // InternalKerMLExpressions.g:1232:1: entryRuleEmptyFeature returns [EObject current=null] : iv_ruleEmptyFeature= ruleEmptyFeature EOF ;
    public final EObject entryRuleEmptyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFeature = null;


        try {
            // InternalKerMLExpressions.g:1232:53: (iv_ruleEmptyFeature= ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:1233:2: iv_ruleEmptyFeature= ruleEmptyFeature EOF
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
    // InternalKerMLExpressions.g:1239:1: ruleEmptyFeature returns [EObject current=null] : () ;
    public final EObject ruleEmptyFeature() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1245:2: ( () )
            // InternalKerMLExpressions.g:1246:2: ()
            {
            // InternalKerMLExpressions.g:1246:2: ()
            // InternalKerMLExpressions.g:1247:3: 
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
    // InternalKerMLExpressions.g:1256:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLExpressions.g:1256:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:1257:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalKerMLExpressions.g:1263:1: ruleRelationalExpression returns [EObject current=null] : (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RangeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1269:2: ( (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1270:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1270:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            // InternalKerMLExpressions.g:1271:3: this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_RangeExpression_0=ruleRangeExpression();

            state._fsp--;


            			current = this_RangeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1279:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=33 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1280:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1280:4: ()
            	    // InternalKerMLExpressions.g:1281:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1287:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalKerMLExpressions.g:1288:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalKerMLExpressions.g:1288:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalKerMLExpressions.g:1289:6: lv_operator_2_0= ruleRelationalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:1306:4: ( (lv_operand_3_0= ruleRangeExpression ) )
            	    // InternalKerMLExpressions.g:1307:5: (lv_operand_3_0= ruleRangeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1307:5: (lv_operand_3_0= ruleRangeExpression )
            	    // InternalKerMLExpressions.g:1308:6: lv_operand_3_0= ruleRangeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperandRangeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalKerMLExpressions.g:1330:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalKerMLExpressions.g:1330:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:1331:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
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
    // InternalKerMLExpressions.g:1337:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1343:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalKerMLExpressions.g:1344:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalKerMLExpressions.g:1344:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 36:
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
                    // InternalKerMLExpressions.g:1345:3: kw= '<'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1351:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1357:3: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1363:3: kw= '>='
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
    // InternalKerMLExpressions.g:1372:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalKerMLExpressions.g:1372:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalKerMLExpressions.g:1373:2: iv_ruleRangeExpression= ruleRangeExpression EOF
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
    // InternalKerMLExpressions.g:1379:1: ruleRangeExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1385:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalKerMLExpressions.g:1386:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalKerMLExpressions.g:1386:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            // InternalKerMLExpressions.g:1387:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1395:3: ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKerMLExpressions.g:1396:4: () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalKerMLExpressions.g:1396:4: ()
                    // InternalKerMLExpressions.g:1397:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRangeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1403:4: ( (lv_operator_2_0= '..' ) )
                    // InternalKerMLExpressions.g:1404:5: (lv_operator_2_0= '..' )
                    {
                    // InternalKerMLExpressions.g:1404:5: (lv_operator_2_0= '..' )
                    // InternalKerMLExpressions.g:1405:6: lv_operator_2_0= '..'
                    {
                    lv_operator_2_0=(Token)match(input,37,FOLLOW_4); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangeExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "..");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1417:4: ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    // InternalKerMLExpressions.g:1418:5: (lv_operand_3_0= ruleAdditiveExpression )
                    {
                    // InternalKerMLExpressions.g:1418:5: (lv_operand_3_0= ruleAdditiveExpression )
                    // InternalKerMLExpressions.g:1419:6: lv_operand_3_0= ruleAdditiveExpression
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
    // InternalKerMLExpressions.g:1441:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLExpressions.g:1441:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:1442:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalKerMLExpressions.g:1448:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1454:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1455:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1455:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalKerMLExpressions.g:1456:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1464:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=38 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1465:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1465:4: ()
            	    // InternalKerMLExpressions.g:1466:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1472:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalKerMLExpressions.g:1473:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalKerMLExpressions.g:1473:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalKerMLExpressions.g:1474:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:1491:4: ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    // InternalKerMLExpressions.g:1492:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1492:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    // InternalKerMLExpressions.g:1493:6: lv_operand_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop18;
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
    // InternalKerMLExpressions.g:1515:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalKerMLExpressions.g:1515:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:1516:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
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
    // InternalKerMLExpressions.g:1522:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1528:2: ( (kw= '+' | kw= '-' ) )
            // InternalKerMLExpressions.g:1529:2: (kw= '+' | kw= '-' )
            {
            // InternalKerMLExpressions.g:1529:2: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalKerMLExpressions.g:1530:3: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1536:3: kw= '-'
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
    // InternalKerMLExpressions.g:1545:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLExpressions.g:1545:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:1546:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalKerMLExpressions.g:1552:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1558:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1559:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1559:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            // InternalKerMLExpressions.g:1560:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;


            			current = this_ExponentiationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1568:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=40 && LA20_0<=42)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1569:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1569:4: ()
            	    // InternalKerMLExpressions.g:1570:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1576:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalKerMLExpressions.g:1577:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalKerMLExpressions.g:1577:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalKerMLExpressions.g:1578:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:1595:4: ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    // InternalKerMLExpressions.g:1596:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    {
            	    // InternalKerMLExpressions.g:1596:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    // InternalKerMLExpressions.g:1597:6: lv_operand_3_0= ruleExponentiationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperandExponentiationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalKerMLExpressions.g:1619:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalKerMLExpressions.g:1619:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:1620:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
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
    // InternalKerMLExpressions.g:1626:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1632:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalKerMLExpressions.g:1633:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalKerMLExpressions.g:1633:2: (kw= '*' | kw= '/' | kw= '%' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalKerMLExpressions.g:1634:3: kw= '*'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1640:3: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1646:3: kw= '%'
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
    // InternalKerMLExpressions.g:1655:1: entryRuleExponentiationExpression returns [EObject current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final EObject entryRuleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLExpressions.g:1655:65: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:1656:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
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
    // InternalKerMLExpressions.g:1662:1: ruleExponentiationExpression returns [EObject current=null] : (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* ) ;
    public final EObject ruleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnitsExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1668:2: ( (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1669:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1669:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* )
            // InternalKerMLExpressions.g:1670:3: this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnitsExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_UnitsExpression_0=ruleUnitsExpression();

            state._fsp--;


            			current = this_UnitsExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1678:3: ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=43 && LA22_0<=44)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1679:4: () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1679:4: ()
            	    // InternalKerMLExpressions.g:1680:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1686:4: ( (lv_operator_2_0= ruleExponentiationOperator ) )
            	    // InternalKerMLExpressions.g:1687:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    {
            	    // InternalKerMLExpressions.g:1687:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    // InternalKerMLExpressions.g:1688:6: lv_operator_2_0= ruleExponentiationOperator
            	    {

            	    						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperatorExponentiationOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
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

            	    // InternalKerMLExpressions.g:1705:4: ( (lv_operand_3_0= ruleUnitsExpression ) )
            	    // InternalKerMLExpressions.g:1706:5: (lv_operand_3_0= ruleUnitsExpression )
            	    {
            	    // InternalKerMLExpressions.g:1706:5: (lv_operand_3_0= ruleUnitsExpression )
            	    // InternalKerMLExpressions.g:1707:6: lv_operand_3_0= ruleUnitsExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getOperandUnitsExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // $ANTLR end "ruleExponentiationExpression"


    // $ANTLR start "entryRuleExponentiationOperator"
    // InternalKerMLExpressions.g:1729:1: entryRuleExponentiationOperator returns [String current=null] : iv_ruleExponentiationOperator= ruleExponentiationOperator EOF ;
    public final String entryRuleExponentiationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationOperator = null;


        try {
            // InternalKerMLExpressions.g:1729:62: (iv_ruleExponentiationOperator= ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:1730:2: iv_ruleExponentiationOperator= ruleExponentiationOperator EOF
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
    // InternalKerMLExpressions.g:1736:1: ruleExponentiationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '**' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleExponentiationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1742:2: ( (kw= '**' | kw= '^' ) )
            // InternalKerMLExpressions.g:1743:2: (kw= '**' | kw= '^' )
            {
            // InternalKerMLExpressions.g:1743:2: (kw= '**' | kw= '^' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            else if ( (LA23_0==44) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalKerMLExpressions.g:1744:3: kw= '**'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1750:3: kw= '^'
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


    // $ANTLR start "entryRuleUnitsExpression"
    // InternalKerMLExpressions.g:1759:1: entryRuleUnitsExpression returns [EObject current=null] : iv_ruleUnitsExpression= ruleUnitsExpression EOF ;
    public final EObject entryRuleUnitsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsExpression = null;


        try {
            // InternalKerMLExpressions.g:1759:56: (iv_ruleUnitsExpression= ruleUnitsExpression EOF )
            // InternalKerMLExpressions.g:1760:2: iv_ruleUnitsExpression= ruleUnitsExpression EOF
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
    // InternalKerMLExpressions.g:1766:1: ruleUnitsExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleUnitsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1772:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? ) )
            // InternalKerMLExpressions.g:1773:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? )
            {
            // InternalKerMLExpressions.g:1773:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )? )
            // InternalKerMLExpressions.g:1774:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )?
            {

            			newCompositeNode(grammarAccess.getUnitsExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1782:3: ( () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKerMLExpressions.g:1783:4: () ( (lv_operator_2_0= '@[' ) ) ( (lv_operand_3_0= ruleOwnedExpression ) ) otherlv_4= ']'
                    {
                    // InternalKerMLExpressions.g:1783:4: ()
                    // InternalKerMLExpressions.g:1784:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1790:4: ( (lv_operator_2_0= '@[' ) )
                    // InternalKerMLExpressions.g:1791:5: (lv_operator_2_0= '@[' )
                    {
                    // InternalKerMLExpressions.g:1791:5: (lv_operator_2_0= '@[' )
                    // InternalKerMLExpressions.g:1792:6: lv_operator_2_0= '@['
                    {
                    lv_operator_2_0=(Token)match(input,45,FOLLOW_4); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtLeftSquareBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitsExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "@[");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1804:4: ( (lv_operand_3_0= ruleOwnedExpression ) )
                    // InternalKerMLExpressions.g:1805:5: (lv_operand_3_0= ruleOwnedExpression )
                    {
                    // InternalKerMLExpressions.g:1805:5: (lv_operand_3_0= ruleOwnedExpression )
                    // InternalKerMLExpressions.g:1806:6: lv_operand_3_0= ruleOwnedExpression
                    {

                    						newCompositeNode(grammarAccess.getUnitsExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    otherlv_4=(Token)match(input,46,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1832:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLExpressions.g:1832:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:1833:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalKerMLExpressions.g:1839:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_ExtentExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1845:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) )
            // InternalKerMLExpressions.g:1846:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:1846:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=38 && LA25_0<=39)||(LA25_0>=47 && LA25_0<=49)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_STRING_VALUE && LA25_0<=RULE_UNRESTRICTED_NAME)||LA25_0==40||LA25_0==50||(LA25_0>=53 && LA25_0<=54)||LA25_0==56||(LA25_0>=62 && LA25_0<=64)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalKerMLExpressions.g:1847:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:1847:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    // InternalKerMLExpressions.g:1848:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) )
                    {
                    // InternalKerMLExpressions.g:1848:4: ()
                    // InternalKerMLExpressions.g:1849:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1855:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalKerMLExpressions.g:1856:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalKerMLExpressions.g:1856:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalKerMLExpressions.g:1857:6: lv_operator_1_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
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

                    // InternalKerMLExpressions.g:1874:4: ( (lv_operand_2_0= ruleExtentExpression ) )
                    // InternalKerMLExpressions.g:1875:5: (lv_operand_2_0= ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:1875:5: (lv_operand_2_0= ruleExtentExpression )
                    // InternalKerMLExpressions.g:1876:6: lv_operand_2_0= ruleExtentExpression
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
                    // InternalKerMLExpressions.g:1895:3: this_ExtentExpression_3= ruleExtentExpression
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
    // InternalKerMLExpressions.g:1907:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalKerMLExpressions.g:1907:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:1908:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalKerMLExpressions.g:1914:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1920:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' ) )
            // InternalKerMLExpressions.g:1921:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' )
            {
            // InternalKerMLExpressions.g:1921:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' | kw= 'not' )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt26=1;
                }
                break;
            case 39:
                {
                alt26=2;
                }
                break;
            case 47:
                {
                alt26=3;
                }
                break;
            case 48:
                {
                alt26=4;
                }
                break;
            case 49:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalKerMLExpressions.g:1922:3: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1928:3: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1934:3: kw= '!'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1940:3: kw= '~'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:1946:3: kw= 'not'
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
    // InternalKerMLExpressions.g:1955:1: entryRuleExtentExpression returns [EObject current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final EObject entryRuleExtentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression = null;


        try {
            // InternalKerMLExpressions.g:1955:57: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:1956:2: iv_ruleExtentExpression= ruleExtentExpression EOF
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
    // InternalKerMLExpressions.g:1962:1: ruleExtentExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleExtentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1968:2: ( ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalKerMLExpressions.g:1969:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalKerMLExpressions.g:1969:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_STRING_VALUE && LA27_0<=RULE_UNRESTRICTED_NAME)||LA27_0==40||(LA27_0>=53 && LA27_0<=54)||LA27_0==56||(LA27_0>=62 && LA27_0<=64)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalKerMLExpressions.g:1970:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1970:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1971:4: () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1971:4: ()
                    // InternalKerMLExpressions.g:1972:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1978:4: ( (lv_operator_1_0= 'all' ) )
                    // InternalKerMLExpressions.g:1979:5: (lv_operator_1_0= 'all' )
                    {
                    // InternalKerMLExpressions.g:1979:5: (lv_operator_1_0= 'all' )
                    // InternalKerMLExpressions.g:1980:6: lv_operator_1_0= 'all'
                    {
                    lv_operator_1_0=(Token)match(input,50,FOLLOW_13); 

                    						newLeafNode(lv_operator_1_0, grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtentExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_0, "all");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1992:4: ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1993:5: (lv_ownedRelationship_2_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1993:5: (lv_ownedRelationship_2_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1994:6: lv_ownedRelationship_2_0= ruleTypeReferenceMember
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
                    // InternalKerMLExpressions.g:2013:3: this_PrimaryExpression_3= rulePrimaryExpression
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
    // InternalKerMLExpressions.g:2025:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKerMLExpressions.g:2025:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKerMLExpressions.g:2026:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKerMLExpressions.g:2032:1: rulePrimaryExpression returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* ) ;
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
            // InternalKerMLExpressions.g:2038:2: ( (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* ) )
            // InternalKerMLExpressions.g:2039:2: (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* )
            {
            // InternalKerMLExpressions.g:2039:2: (this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )* )
            // InternalKerMLExpressions.g:2040:3: this_BaseExpression_0= ruleBaseExpression ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;


            			current = this_BaseExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2048:3: ( ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) ) | ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) ) | ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) ) )*
            loop29:
            do {
                int alt29=5;
                switch ( input.LA(1) ) {
                case 51:
                    {
                    alt29=1;
                    }
                    break;
                case 52:
                    {
                    alt29=2;
                    }
                    break;
                case 53:
                    {
                    int LA29_4 = input.LA(2);

                    if ( ((LA29_4>=RULE_ID && LA29_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt29=3;
                    }
                    else if ( (LA29_4==56) ) {
                        alt29=4;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2049:4: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' )
            	    {
            	    // InternalKerMLExpressions.g:2049:4: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']' )
            	    // InternalKerMLExpressions.g:2050:5: () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleSequenceExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalKerMLExpressions.g:2050:5: ()
            	    // InternalKerMLExpressions.g:2051:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalKerMLExpressions.g:2057:5: ( (lv_operator_2_0= '[' ) )
            	    // InternalKerMLExpressions.g:2058:6: (lv_operator_2_0= '[' )
            	    {
            	    // InternalKerMLExpressions.g:2058:6: (lv_operator_2_0= '[' )
            	    // InternalKerMLExpressions.g:2059:7: lv_operator_2_0= '['
            	    {
            	    lv_operator_2_0=(Token)match(input,51,FOLLOW_4); 

            	    							newLeafNode(lv_operator_2_0, grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	    							}
            	    							setWithLastConsumed(current, "operator", lv_operator_2_0, "[");
            	    						

            	    }


            	    }

            	    // InternalKerMLExpressions.g:2071:5: ( (lv_operand_3_0= ruleSequenceExpression ) )
            	    // InternalKerMLExpressions.g:2072:6: (lv_operand_3_0= ruleSequenceExpression )
            	    {
            	    // InternalKerMLExpressions.g:2072:6: (lv_operand_3_0= ruleSequenceExpression )
            	    // InternalKerMLExpressions.g:2073:7: lv_operand_3_0= ruleSequenceExpression
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandSequenceExpressionParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_21);
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

            	    otherlv_4=(Token)match(input,46,FOLLOW_22); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKerMLExpressions.g:2096:4: ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) )
            	    {
            	    // InternalKerMLExpressions.g:2096:4: ( () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] ) )
            	    // InternalKerMLExpressions.g:2097:5: () otherlv_6= '->' ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) ) ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] )
            	    {
            	    // InternalKerMLExpressions.g:2097:5: ()
            	    // InternalKerMLExpressions.g:2098:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_6=(Token)match(input,52,FOLLOW_13); 

            	    					newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
            	    				
            	    // InternalKerMLExpressions.g:2108:5: ( (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping ) )
            	    // InternalKerMLExpressions.g:2109:6: (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping )
            	    {
            	    // InternalKerMLExpressions.g:2109:6: (lv_ownedRelationship_7_0= ruleOwnedFeatureTyping )
            	    // InternalKerMLExpressions.g:2110:7: lv_ownedRelationship_7_0= ruleOwnedFeatureTyping
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
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

            	    // InternalKerMLExpressions.g:2127:5: ( ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) ) | ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) ) | this_ArgumentList_10= ruleArgumentList[$current] )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case RULE_ID:
            	    case RULE_UNRESTRICTED_NAME:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalKerMLExpressions.g:2128:6: ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) )
            	            {
            	            // InternalKerMLExpressions.g:2128:6: ( (lv_ownedRelationship_8_0= ruleExpressionBodyMember ) )
            	            // InternalKerMLExpressions.g:2129:7: (lv_ownedRelationship_8_0= ruleExpressionBodyMember )
            	            {
            	            // InternalKerMLExpressions.g:2129:7: (lv_ownedRelationship_8_0= ruleExpressionBodyMember )
            	            // InternalKerMLExpressions.g:2130:8: lv_ownedRelationship_8_0= ruleExpressionBodyMember
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_1_1_3_0_0());
            	            							
            	            pushFollow(FOLLOW_22);
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
            	            // InternalKerMLExpressions.g:2148:6: ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) )
            	            {
            	            // InternalKerMLExpressions.g:2148:6: ( (lv_ownedRelationship_9_0= ruleFunctionReferenceMember ) )
            	            // InternalKerMLExpressions.g:2149:7: (lv_ownedRelationship_9_0= ruleFunctionReferenceMember )
            	            {
            	            // InternalKerMLExpressions.g:2149:7: (lv_ownedRelationship_9_0= ruleFunctionReferenceMember )
            	            // InternalKerMLExpressions.g:2150:8: lv_ownedRelationship_9_0= ruleFunctionReferenceMember
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFunctionReferenceMemberParserRuleCall_1_1_3_1_0());
            	            							
            	            pushFollow(FOLLOW_22);
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
            	            // InternalKerMLExpressions.g:2168:6: this_ArgumentList_10= ruleArgumentList[$current]
            	            {

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	            						}
            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_1_1_3_2());
            	            					
            	            pushFollow(FOLLOW_22);
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
            	    // InternalKerMLExpressions.g:2182:4: ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) )
            	    {
            	    // InternalKerMLExpressions.g:2182:4: ( () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) ) )
            	    // InternalKerMLExpressions.g:2183:5: () otherlv_12= '.' ( (lv_operand_13_0= ruleFeatureReferenceExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2183:5: ()
            	    // InternalKerMLExpressions.g:2184:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getPathStepExpressionOperandAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_12=(Token)match(input,53,FOLLOW_13); 

            	    					newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_2_1());
            	    				
            	    // InternalKerMLExpressions.g:2194:5: ( (lv_operand_13_0= ruleFeatureReferenceExpression ) )
            	    // InternalKerMLExpressions.g:2195:6: (lv_operand_13_0= ruleFeatureReferenceExpression )
            	    {
            	    // InternalKerMLExpressions.g:2195:6: (lv_operand_13_0= ruleFeatureReferenceExpression )
            	    // InternalKerMLExpressions.g:2196:7: lv_operand_13_0= ruleFeatureReferenceExpression
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandFeatureReferenceExpressionParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_22);
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
            	    // InternalKerMLExpressions.g:2215:4: ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) )
            	    {
            	    // InternalKerMLExpressions.g:2215:4: ( () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) ) )
            	    // InternalKerMLExpressions.g:2216:5: () otherlv_15= '.' ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) )
            	    {
            	    // InternalKerMLExpressions.g:2216:5: ()
            	    // InternalKerMLExpressions.g:2217:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getPrimaryExpressionAccess().getPathSelectExpressionOperandAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_15=(Token)match(input,53,FOLLOW_24); 

            	    					newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_3_1());
            	    				
            	    // InternalKerMLExpressions.g:2227:5: ( (lv_ownedRelationship_16_0= ruleExpressionBodyMember ) )
            	    // InternalKerMLExpressions.g:2228:6: (lv_ownedRelationship_16_0= ruleExpressionBodyMember )
            	    {
            	    // InternalKerMLExpressions.g:2228:6: (lv_ownedRelationship_16_0= ruleExpressionBodyMember )
            	    // InternalKerMLExpressions.g:2229:7: lv_ownedRelationship_16_0= ruleExpressionBodyMember
            	    {

            	    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_22);
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
            	    break loop29;
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
    // InternalKerMLExpressions.g:2252:1: entryRuleExpressionBodyMember returns [EObject current=null] : iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF ;
    public final EObject entryRuleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBodyMember = null;


        try {
            // InternalKerMLExpressions.g:2252:61: (iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF )
            // InternalKerMLExpressions.g:2253:2: iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF
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
    // InternalKerMLExpressions.g:2259:1: ruleExpressionBodyMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) ;
    public final EObject ruleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2265:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) )
            // InternalKerMLExpressions.g:2266:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            {
            // InternalKerMLExpressions.g:2266:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            // InternalKerMLExpressions.g:2267:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            {
            // InternalKerMLExpressions.g:2267:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            // InternalKerMLExpressions.g:2268:4: lv_ownedRelatedElement_0_0= ruleExpressionBody
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
    // InternalKerMLExpressions.g:2288:1: entryRuleFunctionReferenceMember returns [EObject current=null] : iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF ;
    public final EObject entryRuleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2288:64: (iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF )
            // InternalKerMLExpressions.g:2289:2: iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF
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
    // InternalKerMLExpressions.g:2295:1: ruleFunctionReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) ;
    public final EObject ruleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2301:2: ( ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) )
            // InternalKerMLExpressions.g:2302:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            {
            // InternalKerMLExpressions.g:2302:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            // InternalKerMLExpressions.g:2303:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            {
            // InternalKerMLExpressions.g:2303:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            // InternalKerMLExpressions.g:2304:4: lv_ownedRelatedElement_0_0= ruleFunctionReference
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
    // InternalKerMLExpressions.g:2324:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // InternalKerMLExpressions.g:2324:58: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // InternalKerMLExpressions.g:2325:2: iv_ruleFunctionReference= ruleFunctionReference EOF
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
    // InternalKerMLExpressions.g:2331:1: ruleFunctionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2337:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) )
            // InternalKerMLExpressions.g:2338:2: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            {
            // InternalKerMLExpressions.g:2338:2: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:2339:3: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:2339:3: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:2340:4: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
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
    // InternalKerMLExpressions.g:2360:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalKerMLExpressions.g:2360:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:2361:2: iv_ruleBaseExpression= ruleBaseExpression EOF
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
    // InternalKerMLExpressions.g:2367:1: ruleBaseExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) ) ;
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
            // InternalKerMLExpressions.g:2373:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) ) )
            // InternalKerMLExpressions.g:2374:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )
            {
            // InternalKerMLExpressions.g:2374:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )
            int alt30=6;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalKerMLExpressions.g:2375:3: this_NullExpression_0= ruleNullExpression
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
                    // InternalKerMLExpressions.g:2384:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalKerMLExpressions.g:2393:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
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
                    // InternalKerMLExpressions.g:2402:3: this_InvocationExpression_3= ruleInvocationExpression
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
                    // InternalKerMLExpressions.g:2411:3: this_ExpressionBody_4= ruleExpressionBody
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
                    // InternalKerMLExpressions.g:2420:3: (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' )
                    {
                    // InternalKerMLExpressions.g:2420:3: (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' )
                    // InternalKerMLExpressions.g:2421:4: otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_SequenceExpression_6=ruleSequenceExpression();

                    state._fsp--;


                    				current = this_SequenceExpression_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,55,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2442:1: entryRuleExpressionBody returns [EObject current=null] : iv_ruleExpressionBody= ruleExpressionBody EOF ;
    public final EObject entryRuleExpressionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBody = null;


        try {
            // InternalKerMLExpressions.g:2442:55: (iv_ruleExpressionBody= ruleExpressionBody EOF )
            // InternalKerMLExpressions.g:2443:2: iv_ruleExpressionBody= ruleExpressionBody EOF
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
    // InternalKerMLExpressions.g:2449:1: ruleExpressionBody returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) ;
    public final EObject ruleExpressionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2455:2: ( (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) )
            // InternalKerMLExpressions.g:2456:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            {
            // InternalKerMLExpressions.g:2456:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            // InternalKerMLExpressions.g:2457:3: otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalKerMLExpressions.g:2461:3: ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==59) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2462:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';'
            	    {
            	    // InternalKerMLExpressions.g:2462:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) )
            	    // InternalKerMLExpressions.g:2463:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    {
            	    // InternalKerMLExpressions.g:2463:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    // InternalKerMLExpressions.g:2464:6: lv_ownedRelationship_1_0= ruleBodyParameterMember
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_27);
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

            	    otherlv_2=(Token)match(input,57,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionBodyAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalKerMLExpressions.g:2486:3: ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) )
            // InternalKerMLExpressions.g:2487:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            {
            // InternalKerMLExpressions.g:2487:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            // InternalKerMLExpressions.g:2488:5: lv_ownedRelationship_3_0= ruleResultExpressionMember
            {

            					newCompositeNode(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipResultExpressionMemberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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
    // InternalKerMLExpressions.g:2513:1: entryRuleResultExpressionMember returns [EObject current=null] : iv_ruleResultExpressionMember= ruleResultExpressionMember EOF ;
    public final EObject entryRuleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:2513:63: (iv_ruleResultExpressionMember= ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:2514:2: iv_ruleResultExpressionMember= ruleResultExpressionMember EOF
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
    // InternalKerMLExpressions.g:2520:1: ruleResultExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2526:2: ( ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:2527:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:2527:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:2528:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:2528:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:2529:4: lv_ownedRelatedElement_0_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:2549:1: entryRuleBodyParameterMember returns [EObject current=null] : iv_ruleBodyParameterMember= ruleBodyParameterMember EOF ;
    public final EObject entryRuleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameterMember = null;


        try {
            // InternalKerMLExpressions.g:2549:60: (iv_ruleBodyParameterMember= ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:2550:2: iv_ruleBodyParameterMember= ruleBodyParameterMember EOF
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
    // InternalKerMLExpressions.g:2556:1: ruleBodyParameterMember returns [EObject current=null] : (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) ) ;
    public final EObject ruleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_memberName_1_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2562:2: ( (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) ) )
            // InternalKerMLExpressions.g:2563:2: (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) )
            {
            // InternalKerMLExpressions.g:2563:2: (otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) ) )
            // InternalKerMLExpressions.g:2564:3: otherlv_0= 'in' ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBodyParameterMemberAccess().getInKeyword_0());
            		
            // InternalKerMLExpressions.g:2568:3: ( (lv_memberName_1_0= ruleName ) )
            // InternalKerMLExpressions.g:2569:4: (lv_memberName_1_0= ruleName )
            {
            // InternalKerMLExpressions.g:2569:4: (lv_memberName_1_0= ruleName )
            // InternalKerMLExpressions.g:2570:5: lv_memberName_1_0= ruleName
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

            // InternalKerMLExpressions.g:2587:3: ( (lv_ownedRelatedElement_2_0= ruleBodyParameter ) )
            // InternalKerMLExpressions.g:2588:4: (lv_ownedRelatedElement_2_0= ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:2588:4: (lv_ownedRelatedElement_2_0= ruleBodyParameter )
            // InternalKerMLExpressions.g:2589:5: lv_ownedRelatedElement_2_0= ruleBodyParameter
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
    // InternalKerMLExpressions.g:2610:1: entryRuleBodyParameter returns [EObject current=null] : iv_ruleBodyParameter= ruleBodyParameter EOF ;
    public final EObject entryRuleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameter = null;


        try {
            // InternalKerMLExpressions.g:2610:54: (iv_ruleBodyParameter= ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:2611:2: iv_ruleBodyParameter= ruleBodyParameter EOF
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
    // InternalKerMLExpressions.g:2617:1: ruleBodyParameter returns [EObject current=null] : () ;
    public final EObject ruleBodyParameter() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2623:2: ( () )
            // InternalKerMLExpressions.g:2624:2: ()
            {
            // InternalKerMLExpressions.g:2624:2: ()
            // InternalKerMLExpressions.g:2625:3: 
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
    // InternalKerMLExpressions.g:2634:1: entryRuleSequenceExpression returns [EObject current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final EObject entryRuleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2634:59: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:2635:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
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
    // InternalKerMLExpressions.g:2641:1: ruleSequenceExpression returns [EObject current=null] : (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) ;
    public final EObject ruleSequenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operator_3_0=null;
        EObject this_OwnedExpression_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2647:2: ( (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) )
            // InternalKerMLExpressions.g:2648:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            {
            // InternalKerMLExpressions.g:2648:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            // InternalKerMLExpressions.g:2649:3: this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            			current = this_OwnedExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2657:3: (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==60) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==EOF||LA32_1==46||LA32_1==55) ) {
                    alt32=1;
                }
                else if ( ((LA32_1>=RULE_STRING_VALUE && LA32_1<=RULE_UNRESTRICTED_NAME)||(LA32_1>=28 && LA32_1<=32)||(LA32_1>=38 && LA32_1<=40)||(LA32_1>=47 && LA32_1<=50)||(LA32_1>=53 && LA32_1<=54)||LA32_1==56||(LA32_1>=62 && LA32_1<=64)) ) {
                    alt32=2;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalKerMLExpressions.g:2658:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2663:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:2663:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    // InternalKerMLExpressions.g:2664:5: () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) )
                    {
                    // InternalKerMLExpressions.g:2664:5: ()
                    // InternalKerMLExpressions.g:2665:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalKerMLExpressions.g:2671:5: ( (lv_operator_3_0= ',' ) )
                    // InternalKerMLExpressions.g:2672:6: (lv_operator_3_0= ',' )
                    {
                    // InternalKerMLExpressions.g:2672:6: (lv_operator_3_0= ',' )
                    // InternalKerMLExpressions.g:2673:7: lv_operator_3_0= ','
                    {
                    lv_operator_3_0=(Token)match(input,60,FOLLOW_4); 

                    							newLeafNode(lv_operator_3_0, grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSequenceExpressionRule());
                    							}
                    							setWithLastConsumed(current, "operator", lv_operator_3_0, ",");
                    						

                    }


                    }

                    // InternalKerMLExpressions.g:2685:5: ( (lv_operand_4_0= ruleSequenceExpression ) )
                    // InternalKerMLExpressions.g:2686:6: (lv_operand_4_0= ruleSequenceExpression )
                    {
                    // InternalKerMLExpressions.g:2686:6: (lv_operand_4_0= ruleSequenceExpression )
                    // InternalKerMLExpressions.g:2687:7: lv_operand_4_0= ruleSequenceExpression
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
    // InternalKerMLExpressions.g:2710:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2710:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:2711:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
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
    // InternalKerMLExpressions.g:2717:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2723:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) )
            // InternalKerMLExpressions.g:2724:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            {
            // InternalKerMLExpressions.g:2724:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:2725:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:2725:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:2726:4: lv_ownedRelationship_0_0= ruleFeatureReferenceMember
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
    // InternalKerMLExpressions.g:2746:1: entryRuleFeatureReferenceMember returns [EObject current=null] : iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF ;
    public final EObject entryRuleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2746:63: (iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:2747:2: iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF
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
    // InternalKerMLExpressions.g:2753:1: ruleFeatureReferenceMember returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2759:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:2760:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:2760:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:2761:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:2761:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:2762:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:2779:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLExpressions.g:2779:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:2780:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
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
    // InternalKerMLExpressions.g:2786:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;

        EObject this_ArgumentList_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2792:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) )
            // InternalKerMLExpressions.g:2793:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            {
            // InternalKerMLExpressions.g:2793:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            // InternalKerMLExpressions.g:2794:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current]
            {
            // InternalKerMLExpressions.g:2794:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:2795:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:2795:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:2796:5: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
            {

            					newCompositeNode(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalKerMLExpressions.g:2829:1: ruleArgumentList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_PositionalArgumentList_1 = null;

        EObject this_NamedArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2835:2: ( (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) )
            // InternalKerMLExpressions.g:2836:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            {
            // InternalKerMLExpressions.g:2836:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            // InternalKerMLExpressions.g:2837:3: otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalKerMLExpressions.g:2841:3: (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )?
            int alt33=3;
            switch ( input.LA(1) ) {
                case RULE_STRING_VALUE:
                case RULE_DECIMAL_VALUE:
                case RULE_EXP_VALUE:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 38:
                case 39:
                case 40:
                case 47:
                case 48:
                case 49:
                case 50:
                case 53:
                case 54:
                case 56:
                case 62:
                case 63:
                case 64:
                    {
                    alt33=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==61) ) {
                        alt33=2;
                    }
                    else if ( ((LA33_2>=15 && LA33_2<=45)||(LA33_2>=51 && LA33_2<=55)||LA33_2==60||LA33_2==65) ) {
                        alt33=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (LA33_3==61) ) {
                        alt33=2;
                    }
                    else if ( ((LA33_3>=15 && LA33_3<=45)||(LA33_3>=51 && LA33_3<=55)||LA33_3==60||LA33_3==65) ) {
                        alt33=1;
                    }
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // InternalKerMLExpressions.g:2842:4: this_PositionalArgumentList_1= rulePositionalArgumentList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getArgumentListRule());
                    				}
                    				newCompositeNode(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_25);
                    this_PositionalArgumentList_1=rulePositionalArgumentList(current);

                    state._fsp--;


                    				current = this_PositionalArgumentList_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2854:4: this_NamedArgumentList_2= ruleNamedArgumentList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getArgumentListRule());
                    				}
                    				newCompositeNode(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_NamedArgumentList_2=ruleNamedArgumentList(current);

                    state._fsp--;


                    				current = this_NamedArgumentList_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,55,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2875:1: rulePositionalArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* ) ;
    public final EObject rulePositionalArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2881:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:2882:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:2882:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:2883:3: ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:2883:3: ( (lv_ownedRelationship_0_0= ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:2884:4: (lv_ownedRelationship_0_0= ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:2884:4: (lv_ownedRelationship_0_0= ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:2885:5: lv_ownedRelationship_0_0= ruleOwnedExpressionMember
            {

            					newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalKerMLExpressions.g:2902:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==60) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2903:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,60,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:2907:4: ( (lv_ownedRelationship_2_0= ruleOwnedExpressionMember ) )
            	    // InternalKerMLExpressions.g:2908:5: (lv_ownedRelationship_2_0= ruleOwnedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:2908:5: (lv_ownedRelationship_2_0= ruleOwnedExpressionMember )
            	    // InternalKerMLExpressions.g:2909:6: lv_ownedRelationship_2_0= ruleOwnedExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
            	    break loop34;
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
    // InternalKerMLExpressions.g:2932:1: ruleNamedArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) ;
    public final EObject ruleNamedArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2938:2: ( ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) )
            // InternalKerMLExpressions.g:2939:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            {
            // InternalKerMLExpressions.g:2939:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            // InternalKerMLExpressions.g:2940:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            {
            // InternalKerMLExpressions.g:2940:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:2941:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:2941:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:2942:5: lv_ownedRelationship_0_0= ruleNamedExpressionMember
            {

            					newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalKerMLExpressions.g:2959:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==60) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2960:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,60,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:2964:4: ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    // InternalKerMLExpressions.g:2965:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    {
            	    // InternalKerMLExpressions.g:2965:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    // InternalKerMLExpressions.g:2966:6: lv_ownedRelationship_2_0= ruleNamedExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleNamedArgumentList"


    // $ANTLR start "entryRuleNamedExpressionMember"
    // InternalKerMLExpressions.g:2988:1: entryRuleNamedExpressionMember returns [EObject current=null] : iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF ;
    public final EObject entryRuleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:2988:62: (iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF )
            // InternalKerMLExpressions.g:2989:2: iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF
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
    // InternalKerMLExpressions.g:2995:1: ruleNamedExpressionMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) ) ;
    public final EObject ruleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3001:2: ( ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) ) )
            // InternalKerMLExpressions.g:3002:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) )
            {
            // InternalKerMLExpressions.g:3002:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:3003:3: ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:3003:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalKerMLExpressions.g:3004:4: (lv_memberName_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:3004:4: (lv_memberName_0_0= ruleName )
            // InternalKerMLExpressions.g:3005:5: lv_memberName_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_1=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedExpressionMemberAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalKerMLExpressions.g:3026:3: ( (lv_ownedRelatedElement_2_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:3027:4: (lv_ownedRelatedElement_2_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:3027:4: (lv_ownedRelatedElement_2_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:3028:5: lv_ownedRelatedElement_2_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:3049:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalKerMLExpressions.g:3049:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLExpressions.g:3050:2: iv_ruleNullExpression= ruleNullExpression EOF
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
    // InternalKerMLExpressions.g:3056:1: ruleNullExpression returns [EObject current=null] : ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3062:2: ( ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) )
            // InternalKerMLExpressions.g:3063:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            {
            // InternalKerMLExpressions.g:3063:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            // InternalKerMLExpressions.g:3064:3: () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            {
            // InternalKerMLExpressions.g:3064:3: ()
            // InternalKerMLExpressions.g:3065:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
            					current);
            			

            }

            // InternalKerMLExpressions.g:3071:3: (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==62) ) {
                alt36=1;
            }
            else if ( (LA36_0==54) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalKerMLExpressions.g:3072:4: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3077:4: (otherlv_2= '(' otherlv_3= ')' )
                    {
                    // InternalKerMLExpressions.g:3077:4: (otherlv_2= '(' otherlv_3= ')' )
                    // InternalKerMLExpressions.g:3078:5: otherlv_2= '(' otherlv_3= ')'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_25); 

                    					newLeafNode(otherlv_2, grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,55,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3092:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLExpressions.g:3092:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:3093:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalKerMLExpressions.g:3099:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralInteger_2 = null;

        EObject this_LiteralReal_3 = null;

        EObject this_LiteralUnbounded_4 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3105:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded ) )
            // InternalKerMLExpressions.g:3106:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded )
            {
            // InternalKerMLExpressions.g:3106:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralUnbounded_4= ruleLiteralUnbounded )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 63:
            case 64:
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

                if ( (LA37_3==EOF||(LA37_3>=14 && LA37_3<=46)||(LA37_3>=51 && LA37_3<=52)||LA37_3==55||LA37_3==58||LA37_3==60) ) {
                    alt37=3;
                }
                else if ( (LA37_3==53) ) {
                    int LA37_7 = input.LA(3);

                    if ( ((LA37_7>=RULE_ID && LA37_7<=RULE_UNRESTRICTED_NAME)||LA37_7==56) ) {
                        alt37=3;
                    }
                    else if ( ((LA37_7>=RULE_DECIMAL_VALUE && LA37_7<=RULE_EXP_VALUE)) ) {
                        alt37=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 53:
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
                    // InternalKerMLExpressions.g:3107:3: this_LiteralBoolean_0= ruleLiteralBoolean
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
                    // InternalKerMLExpressions.g:3116:3: this_LiteralString_1= ruleLiteralString
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
                    // InternalKerMLExpressions.g:3125:3: this_LiteralInteger_2= ruleLiteralInteger
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
                    // InternalKerMLExpressions.g:3134:3: this_LiteralReal_3= ruleLiteralReal
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
                    // InternalKerMLExpressions.g:3143:3: this_LiteralUnbounded_4= ruleLiteralUnbounded
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralUnboundedParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralUnbounded_4=ruleLiteralUnbounded();

                    state._fsp--;


                    			current = this_LiteralUnbounded_4;
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
    // InternalKerMLExpressions.g:3155:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLExpressions.g:3155:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:3156:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
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
    // InternalKerMLExpressions.g:3162:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3168:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalKerMLExpressions.g:3169:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalKerMLExpressions.g:3169:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalKerMLExpressions.g:3170:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:3170:3: (lv_value_0_0= ruleBooleanValue )
            // InternalKerMLExpressions.g:3171:4: lv_value_0_0= ruleBooleanValue
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
    // InternalKerMLExpressions.g:3191:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLExpressions.g:3191:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:3192:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalKerMLExpressions.g:3198:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3204:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLExpressions.g:3205:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLExpressions.g:3205:2: (kw= 'true' | kw= 'false' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==63) ) {
                alt38=1;
            }
            else if ( (LA38_0==64) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalKerMLExpressions.g:3206:3: kw= 'true'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3212:3: kw= 'false'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3221:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // InternalKerMLExpressions.g:3221:54: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLExpressions.g:3222:2: iv_ruleLiteralString= ruleLiteralString EOF
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
    // InternalKerMLExpressions.g:3228:1: ruleLiteralString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3234:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalKerMLExpressions.g:3235:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalKerMLExpressions.g:3235:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:3236:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:3236:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:3237:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalKerMLExpressions.g:3256:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLExpressions.g:3256:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:3257:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
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
    // InternalKerMLExpressions.g:3263:1: ruleLiteralInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3269:2: ( ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) )
            // InternalKerMLExpressions.g:3270:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            {
            // InternalKerMLExpressions.g:3270:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:3271:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:3271:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:3272:4: lv_value_0_0= RULE_DECIMAL_VALUE
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
    // InternalKerMLExpressions.g:3291:1: entryRuleLiteralReal returns [EObject current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final EObject entryRuleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralReal = null;


        try {
            // InternalKerMLExpressions.g:3291:52: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:3292:2: iv_ruleLiteralReal= ruleLiteralReal EOF
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
    // InternalKerMLExpressions.g:3298:1: ruleLiteralReal returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleLiteralReal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3304:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalKerMLExpressions.g:3305:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalKerMLExpressions.g:3305:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalKerMLExpressions.g:3306:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalKerMLExpressions.g:3306:3: (lv_value_0_0= ruleRealValue )
            // InternalKerMLExpressions.g:3307:4: lv_value_0_0= ruleRealValue
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
    // InternalKerMLExpressions.g:3327:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLExpressions.g:3327:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLExpressions.g:3328:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalKerMLExpressions.g:3334:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3340:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLExpressions.g:3341:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLExpressions.g:3341:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_DECIMAL_VALUE||LA41_0==53) ) {
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
                    // InternalKerMLExpressions.g:3342:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLExpressions.g:3342:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLExpressions.g:3343:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:3343:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_DECIMAL_VALUE) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalKerMLExpressions.g:3344:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_32); 

                            					current.merge(this_DECIMAL_VALUE_0);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,53,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalKerMLExpressions.g:3357:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_DECIMAL_VALUE) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==RULE_EXP_VALUE) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalKerMLExpressions.g:3358:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

                            					current.merge(this_DECIMAL_VALUE_2);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLExpressions.g:3366:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalKerMLExpressions.g:3376:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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


    // $ANTLR start "entryRuleLiteralUnbounded"
    // InternalKerMLExpressions.g:3387:1: entryRuleLiteralUnbounded returns [EObject current=null] : iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF ;
    public final EObject entryRuleLiteralUnbounded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnbounded = null;


        try {
            // InternalKerMLExpressions.g:3387:57: (iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF )
            // InternalKerMLExpressions.g:3388:2: iv_ruleLiteralUnbounded= ruleLiteralUnbounded EOF
            {
             newCompositeNode(grammarAccess.getLiteralUnboundedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralUnbounded=ruleLiteralUnbounded();

            state._fsp--;

             current =iv_ruleLiteralUnbounded; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalKerMLExpressions.g:3394:1: ruleLiteralUnbounded returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleLiteralUnbounded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3400:2: ( ( () otherlv_1= '*' ) )
            // InternalKerMLExpressions.g:3401:2: ( () otherlv_1= '*' )
            {
            // InternalKerMLExpressions.g:3401:2: ( () otherlv_1= '*' )
            // InternalKerMLExpressions.g:3402:3: () otherlv_1= '*'
            {
            // InternalKerMLExpressions.g:3402:3: ()
            // InternalKerMLExpressions.g:3403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralUnboundedAccess().getLiteralUnboundedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralUnboundedAccess().getAsteriskKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalKerMLExpressions.g:3417:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLExpressions.g:3417:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLExpressions.g:3418:2: iv_ruleName= ruleName EOF
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
    // InternalKerMLExpressions.g:3424:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3430:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLExpressions.g:3431:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLExpressions.g:3431:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_UNRESTRICTED_NAME) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalKerMLExpressions.g:3432:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3440:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalKerMLExpressions.g:3451:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:3451:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:3452:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalKerMLExpressions.g:3458:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3464:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) )
            // InternalKerMLExpressions.g:3465:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            {
            // InternalKerMLExpressions.g:3465:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            // InternalKerMLExpressions.g:3466:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:3476:3: (kw= '::' this_Name_2= ruleName )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==65) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3477:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,65,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_34);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop43;
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

    // Delegated rules


    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\4\uffff\2\11\5\uffff\2\11";
    static final String dfa_3s = "\1\4\1\uffff\1\4\1\uffff\2\16\2\uffff\1\7\2\uffff\2\16";
    static final String dfa_4s = "\1\100\1\uffff\1\100\1\uffff\2\101\2\uffff\1\10\2\uffff\2\101";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\5\1\6\1\uffff\1\3\1\4\2\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\3\3\1\4\1\5\37\uffff\1\3\14\uffff\1\3\1\2\1\uffff\1\6\5\uffff\1\1\2\3",
            "",
            "\5\7\23\uffff\5\7\5\uffff\3\7\6\uffff\4\7\2\uffff\2\7\1\1\1\7\5\uffff\3\7",
            "",
            "\41\11\4\uffff\3\11\1\12\1\11\2\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "\41\11\4\uffff\3\11\1\12\1\11\2\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "",
            "",
            "\1\13\1\14",
            "",
            "",
            "\41\11\4\uffff\3\11\1\12\1\11\2\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "\41\11\4\uffff\3\11\1\12\1\11\2\uffff\1\11\1\uffff\1\11\4\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2374:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_ExpressionBody_4= ruleExpressionBody | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xC16781C0000001F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0140000000000180L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xC96781C0000001F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xC1E781C0000001F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});

}