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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_VALUE", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_PREFIX_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "':'", "'if'", "'else'", "'?'", "'??'", "'implies'", "'|'", "'or'", "'xor'", "'&'", "'and'", "'=='", "'!='", "'hastype'", "'istype'", "'@'", "'as'", "'<'", "'>'", "'<='", "'>='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'^'", "'~'", "'not'", "'all'", "'.'", "'['", "']'", "'->'", "'.?'", "'('", "')'", "'{'", "';'", "'}'", "'in'", "','", "'='", "'null'", "'true'", "'false'", "'::'"
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
    public static final int RULE_PREFIX_COMMENT=10;
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
    // InternalKerMLExpressions.g:168:1: ruleConditionalExpression returns [EObject current=null] : ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) )? ) | ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpressionReference ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleOwnedExpressionReference ) ) ) ) ;
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
            // InternalKerMLExpressions.g:174:2: ( ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) )? ) | ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpressionReference ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleOwnedExpressionReference ) ) ) ) )
            // InternalKerMLExpressions.g:175:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) )? ) | ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpressionReference ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleOwnedExpressionReference ) ) ) )
            {
            // InternalKerMLExpressions.g:175:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) )? ) | ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpressionReference ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleOwnedExpressionReference ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||(LA2_0>=RULE_STRING_VALUE && LA2_0<=RULE_UNRESTRICTED_NAME)||(LA2_0>=27 && LA2_0<=30)||(LA2_0>=36 && LA2_0<=38)||(LA2_0>=43 && LA2_0<=46)||LA2_0==51||LA2_0==53||(LA2_0>=59 && LA2_0<=61)) ) {
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
                    // InternalKerMLExpressions.g:176:3: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) )? )
                    {
                    // InternalKerMLExpressions.g:176:3: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) )? )
                    // InternalKerMLExpressions.g:177:4: this_NullCoalescingExpression_0= ruleNullCoalescingExpression ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_NullCoalescingExpression_0=ruleNullCoalescingExpression();

                    state._fsp--;


                    				current = this_NullCoalescingExpression_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLExpressions.g:185:4: ( () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==17) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalKerMLExpressions.g:186:5: () ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_operand_3_0= ruleOwnedExpressionReference ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleOwnedExpressionReference ) )
                            {
                            // InternalKerMLExpressions.g:186:5: ()
                            // InternalKerMLExpressions.g:187:6: 
                            {

                            						current = forceCreateModelElementAndAdd(
                            							grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperandAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalKerMLExpressions.g:193:5: ( (lv_operator_2_0= ruleConditionalOperator ) )
                            // InternalKerMLExpressions.g:194:6: (lv_operator_2_0= ruleConditionalOperator )
                            {
                            // InternalKerMLExpressions.g:194:6: (lv_operator_2_0= ruleConditionalOperator )
                            // InternalKerMLExpressions.g:195:7: lv_operator_2_0= ruleConditionalOperator
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

                            // InternalKerMLExpressions.g:212:5: ( (lv_operand_3_0= ruleOwnedExpressionReference ) )
                            // InternalKerMLExpressions.g:213:6: (lv_operand_3_0= ruleOwnedExpressionReference )
                            {
                            // InternalKerMLExpressions.g:213:6: (lv_operand_3_0= ruleOwnedExpressionReference )
                            // InternalKerMLExpressions.g:214:7: lv_operand_3_0= ruleOwnedExpressionReference
                            {

                            							newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionReferenceParserRuleCall_0_1_2_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_operand_3_0=ruleOwnedExpressionReference();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                            							}
                            							add(
                            								current,
                            								"operand",
                            								lv_operand_3_0,
                            								"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionReference");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_4=(Token)match(input,14,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_0_1_3());
                            				
                            // InternalKerMLExpressions.g:235:5: ( (lv_operand_5_0= ruleOwnedExpressionReference ) )
                            // InternalKerMLExpressions.g:236:6: (lv_operand_5_0= ruleOwnedExpressionReference )
                            {
                            // InternalKerMLExpressions.g:236:6: (lv_operand_5_0= ruleOwnedExpressionReference )
                            // InternalKerMLExpressions.g:237:7: lv_operand_5_0= ruleOwnedExpressionReference
                            {

                            							newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionReferenceParserRuleCall_0_1_4_0());
                            						
                            pushFollow(FOLLOW_2);
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


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:257:3: ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpressionReference ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleOwnedExpressionReference ) ) )
                    {
                    // InternalKerMLExpressions.g:257:3: ( () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpressionReference ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleOwnedExpressionReference ) ) )
                    // InternalKerMLExpressions.g:258:4: () otherlv_7= 'if' ( (lv_operand_8_0= ruleNullCoalescingExpression ) ) ( (lv_operator_9_0= ruleConditionalOperator ) ) ( (lv_operand_10_0= ruleOwnedExpressionReference ) ) otherlv_11= 'else' ( (lv_operand_12_0= ruleOwnedExpressionReference ) )
                    {
                    // InternalKerMLExpressions.g:258:4: ()
                    // InternalKerMLExpressions.g:259:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionalExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionalExpressionAccess().getIfKeyword_1_1());
                    			
                    // InternalKerMLExpressions.g:269:4: ( (lv_operand_8_0= ruleNullCoalescingExpression ) )
                    // InternalKerMLExpressions.g:270:5: (lv_operand_8_0= ruleNullCoalescingExpression )
                    {
                    // InternalKerMLExpressions.g:270:5: (lv_operand_8_0= ruleNullCoalescingExpression )
                    // InternalKerMLExpressions.g:271:6: lv_operand_8_0= ruleNullCoalescingExpression
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

                    // InternalKerMLExpressions.g:288:4: ( (lv_operator_9_0= ruleConditionalOperator ) )
                    // InternalKerMLExpressions.g:289:5: (lv_operator_9_0= ruleConditionalOperator )
                    {
                    // InternalKerMLExpressions.g:289:5: (lv_operator_9_0= ruleConditionalOperator )
                    // InternalKerMLExpressions.g:290:6: lv_operator_9_0= ruleConditionalOperator
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

                    // InternalKerMLExpressions.g:307:4: ( (lv_operand_10_0= ruleOwnedExpressionReference ) )
                    // InternalKerMLExpressions.g:308:5: (lv_operand_10_0= ruleOwnedExpressionReference )
                    {
                    // InternalKerMLExpressions.g:308:5: (lv_operand_10_0= ruleOwnedExpressionReference )
                    // InternalKerMLExpressions.g:309:6: lv_operand_10_0= ruleOwnedExpressionReference
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionReferenceParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_operand_10_0=ruleOwnedExpressionReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_10_0,
                    							"org.omg.kerml.expressions.xtext.KerMLExpressions.OwnedExpressionReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getConditionalExpressionAccess().getElseKeyword_1_5());
                    			
                    // InternalKerMLExpressions.g:330:4: ( (lv_operand_12_0= ruleOwnedExpressionReference ) )
                    // InternalKerMLExpressions.g:331:5: (lv_operand_12_0= ruleOwnedExpressionReference )
                    {
                    // InternalKerMLExpressions.g:331:5: (lv_operand_12_0= ruleOwnedExpressionReference )
                    // InternalKerMLExpressions.g:332:6: lv_operand_12_0= ruleOwnedExpressionReference
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionReferenceParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_12_0=ruleOwnedExpressionReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_12_0,
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
    // InternalKerMLExpressions.g:354:1: entryRuleConditionalOperator returns [String current=null] : iv_ruleConditionalOperator= ruleConditionalOperator EOF ;
    public final String entryRuleConditionalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOperator = null;


        try {
            // InternalKerMLExpressions.g:354:59: (iv_ruleConditionalOperator= ruleConditionalOperator EOF )
            // InternalKerMLExpressions.g:355:2: iv_ruleConditionalOperator= ruleConditionalOperator EOF
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
    // InternalKerMLExpressions.g:361:1: ruleConditionalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken ruleConditionalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:367:2: (kw= '?' )
            // InternalKerMLExpressions.g:368:2: kw= '?'
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
    // InternalKerMLExpressions.g:376:1: entryRuleNullCoalescingExpression returns [EObject current=null] : iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF ;
    public final EObject entryRuleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCoalescingExpression = null;


        try {
            // InternalKerMLExpressions.g:376:65: (iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF )
            // InternalKerMLExpressions.g:377:2: iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF
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
    // InternalKerMLExpressions.g:383:1: ruleNullCoalescingExpression returns [EObject current=null] : (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )* ) ;
    public final EObject ruleNullCoalescingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:389:2: ( (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )* ) )
            // InternalKerMLExpressions.g:390:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )* )
            {
            // InternalKerMLExpressions.g:390:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )* )
            // InternalKerMLExpressions.g:391:3: this_ImpliesExpression_0= ruleImpliesExpression ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )*
            {

            			newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;


            			current = this_ImpliesExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:399:3: ( () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKerMLExpressions.g:400:4: () ( (lv_operator_2_0= ruleNullCoalescingOperator ) ) ( (lv_operand_3_0= ruleImpliesExpressionReference ) )
            	    {
            	    // InternalKerMLExpressions.g:400:4: ()
            	    // InternalKerMLExpressions.g:401:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:407:4: ( (lv_operator_2_0= ruleNullCoalescingOperator ) )
            	    // InternalKerMLExpressions.g:408:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    {
            	    // InternalKerMLExpressions.g:408:5: (lv_operator_2_0= ruleNullCoalescingOperator )
            	    // InternalKerMLExpressions.g:409:6: lv_operator_2_0= ruleNullCoalescingOperator
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

            	    // InternalKerMLExpressions.g:426:4: ( (lv_operand_3_0= ruleImpliesExpressionReference ) )
            	    // InternalKerMLExpressions.g:427:5: (lv_operand_3_0= ruleImpliesExpressionReference )
            	    {
            	    // InternalKerMLExpressions.g:427:5: (lv_operand_3_0= ruleImpliesExpressionReference )
            	    // InternalKerMLExpressions.g:428:6: lv_operand_3_0= ruleImpliesExpressionReference
            	    {

            	    						newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getOperandImpliesExpressionReferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
    // InternalKerMLExpressions.g:450:1: entryRuleNullCoalescingOperator returns [String current=null] : iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF ;
    public final String entryRuleNullCoalescingOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullCoalescingOperator = null;


        try {
            // InternalKerMLExpressions.g:450:62: (iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF )
            // InternalKerMLExpressions.g:451:2: iv_ruleNullCoalescingOperator= ruleNullCoalescingOperator EOF
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
    // InternalKerMLExpressions.g:457:1: ruleNullCoalescingOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '??' ;
    public final AntlrDatatypeRuleToken ruleNullCoalescingOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:463:2: (kw= '??' )
            // InternalKerMLExpressions.g:464:2: kw= '??'
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


    // $ANTLR start "entryRuleImpliesExpressionReference"
    // InternalKerMLExpressions.g:472:1: entryRuleImpliesExpressionReference returns [EObject current=null] : iv_ruleImpliesExpressionReference= ruleImpliesExpressionReference EOF ;
    public final EObject entryRuleImpliesExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:472:67: (iv_ruleImpliesExpressionReference= ruleImpliesExpressionReference EOF )
            // InternalKerMLExpressions.g:473:2: iv_ruleImpliesExpressionReference= ruleImpliesExpressionReference EOF
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
    // InternalKerMLExpressions.g:479:1: ruleImpliesExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleImpliesExpressionMember ) ) ;
    public final EObject ruleImpliesExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:485:2: ( ( (lv_ownedRelationship_0_0= ruleImpliesExpressionMember ) ) )
            // InternalKerMLExpressions.g:486:2: ( (lv_ownedRelationship_0_0= ruleImpliesExpressionMember ) )
            {
            // InternalKerMLExpressions.g:486:2: ( (lv_ownedRelationship_0_0= ruleImpliesExpressionMember ) )
            // InternalKerMLExpressions.g:487:3: (lv_ownedRelationship_0_0= ruleImpliesExpressionMember )
            {
            // InternalKerMLExpressions.g:487:3: (lv_ownedRelationship_0_0= ruleImpliesExpressionMember )
            // InternalKerMLExpressions.g:488:4: lv_ownedRelationship_0_0= ruleImpliesExpressionMember
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
    // InternalKerMLExpressions.g:508:1: entryRuleImpliesExpressionMember returns [EObject current=null] : iv_ruleImpliesExpressionMember= ruleImpliesExpressionMember EOF ;
    public final EObject entryRuleImpliesExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:508:64: (iv_ruleImpliesExpressionMember= ruleImpliesExpressionMember EOF )
            // InternalKerMLExpressions.g:509:2: iv_ruleImpliesExpressionMember= ruleImpliesExpressionMember EOF
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
    // InternalKerMLExpressions.g:515:1: ruleImpliesExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleImpliesExpression ) ) ;
    public final EObject ruleImpliesExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:521:2: ( ( (lv_ownedRelatedElement_0_0= ruleImpliesExpression ) ) )
            // InternalKerMLExpressions.g:522:2: ( (lv_ownedRelatedElement_0_0= ruleImpliesExpression ) )
            {
            // InternalKerMLExpressions.g:522:2: ( (lv_ownedRelatedElement_0_0= ruleImpliesExpression ) )
            // InternalKerMLExpressions.g:523:3: (lv_ownedRelatedElement_0_0= ruleImpliesExpression )
            {
            // InternalKerMLExpressions.g:523:3: (lv_ownedRelatedElement_0_0= ruleImpliesExpression )
            // InternalKerMLExpressions.g:524:4: lv_ownedRelatedElement_0_0= ruleImpliesExpression
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
    // InternalKerMLExpressions.g:544:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalKerMLExpressions.g:544:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalKerMLExpressions.g:545:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
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
    // InternalKerMLExpressions.g:551:1: ruleImpliesExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:557:2: ( (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )* ) )
            // InternalKerMLExpressions.g:558:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )* )
            {
            // InternalKerMLExpressions.g:558:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )* )
            // InternalKerMLExpressions.g:559:3: this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            			current = this_OrExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:567:3: ( () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKerMLExpressions.g:568:4: () ( (lv_operator_2_0= ruleImpliesOperator ) ) ( (lv_operand_3_0= ruleOrExpressionReference ) )
            	    {
            	    // InternalKerMLExpressions.g:568:4: ()
            	    // InternalKerMLExpressions.g:569:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getImpliesExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:575:4: ( (lv_operator_2_0= ruleImpliesOperator ) )
            	    // InternalKerMLExpressions.g:576:5: (lv_operator_2_0= ruleImpliesOperator )
            	    {
            	    // InternalKerMLExpressions.g:576:5: (lv_operator_2_0= ruleImpliesOperator )
            	    // InternalKerMLExpressions.g:577:6: lv_operator_2_0= ruleImpliesOperator
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

            	    // InternalKerMLExpressions.g:594:4: ( (lv_operand_3_0= ruleOrExpressionReference ) )
            	    // InternalKerMLExpressions.g:595:5: (lv_operand_3_0= ruleOrExpressionReference )
            	    {
            	    // InternalKerMLExpressions.g:595:5: (lv_operand_3_0= ruleOrExpressionReference )
            	    // InternalKerMLExpressions.g:596:6: lv_operand_3_0= ruleOrExpressionReference
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperandOrExpressionReferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // InternalKerMLExpressions.g:618:1: entryRuleImpliesOperator returns [String current=null] : iv_ruleImpliesOperator= ruleImpliesOperator EOF ;
    public final String entryRuleImpliesOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpliesOperator = null;


        try {
            // InternalKerMLExpressions.g:618:55: (iv_ruleImpliesOperator= ruleImpliesOperator EOF )
            // InternalKerMLExpressions.g:619:2: iv_ruleImpliesOperator= ruleImpliesOperator EOF
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
    // InternalKerMLExpressions.g:625:1: ruleImpliesOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'implies' ;
    public final AntlrDatatypeRuleToken ruleImpliesOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:631:2: (kw= 'implies' )
            // InternalKerMLExpressions.g:632:2: kw= 'implies'
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


    // $ANTLR start "entryRuleOrExpressionReference"
    // InternalKerMLExpressions.g:640:1: entryRuleOrExpressionReference returns [EObject current=null] : iv_ruleOrExpressionReference= ruleOrExpressionReference EOF ;
    public final EObject entryRuleOrExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:640:62: (iv_ruleOrExpressionReference= ruleOrExpressionReference EOF )
            // InternalKerMLExpressions.g:641:2: iv_ruleOrExpressionReference= ruleOrExpressionReference EOF
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
    // InternalKerMLExpressions.g:647:1: ruleOrExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleOrExpressionMember ) ) ;
    public final EObject ruleOrExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:653:2: ( ( (lv_ownedRelationship_0_0= ruleOrExpressionMember ) ) )
            // InternalKerMLExpressions.g:654:2: ( (lv_ownedRelationship_0_0= ruleOrExpressionMember ) )
            {
            // InternalKerMLExpressions.g:654:2: ( (lv_ownedRelationship_0_0= ruleOrExpressionMember ) )
            // InternalKerMLExpressions.g:655:3: (lv_ownedRelationship_0_0= ruleOrExpressionMember )
            {
            // InternalKerMLExpressions.g:655:3: (lv_ownedRelationship_0_0= ruleOrExpressionMember )
            // InternalKerMLExpressions.g:656:4: lv_ownedRelationship_0_0= ruleOrExpressionMember
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
    // InternalKerMLExpressions.g:676:1: entryRuleOrExpressionMember returns [EObject current=null] : iv_ruleOrExpressionMember= ruleOrExpressionMember EOF ;
    public final EObject entryRuleOrExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:676:59: (iv_ruleOrExpressionMember= ruleOrExpressionMember EOF )
            // InternalKerMLExpressions.g:677:2: iv_ruleOrExpressionMember= ruleOrExpressionMember EOF
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
    // InternalKerMLExpressions.g:683:1: ruleOrExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOrExpression ) ) ;
    public final EObject ruleOrExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:689:2: ( ( (lv_ownedRelatedElement_0_0= ruleOrExpression ) ) )
            // InternalKerMLExpressions.g:690:2: ( (lv_ownedRelatedElement_0_0= ruleOrExpression ) )
            {
            // InternalKerMLExpressions.g:690:2: ( (lv_ownedRelatedElement_0_0= ruleOrExpression ) )
            // InternalKerMLExpressions.g:691:3: (lv_ownedRelatedElement_0_0= ruleOrExpression )
            {
            // InternalKerMLExpressions.g:691:3: (lv_ownedRelatedElement_0_0= ruleOrExpression )
            // InternalKerMLExpressions.g:692:4: lv_ownedRelatedElement_0_0= ruleOrExpression
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
    // InternalKerMLExpressions.g:712:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalKerMLExpressions.g:712:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLExpressions.g:713:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalKerMLExpressions.g:719:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_operand_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:725:2: ( (this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )* ) )
            // InternalKerMLExpressions.g:726:2: (this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )* )
            {
            // InternalKerMLExpressions.g:726:2: (this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )* )
            // InternalKerMLExpressions.g:727:3: this_XorExpression_0= ruleXorExpression ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:735:3: ( () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKerMLExpressions.g:736:4: () ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) )
            	    {
            	    // InternalKerMLExpressions.g:736:4: ()
            	    // InternalKerMLExpressions.g:737:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:743:4: ( ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==20) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==21) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalKerMLExpressions.g:744:5: ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )
            	            {
            	            // InternalKerMLExpressions.g:744:5: ( ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )
            	            // InternalKerMLExpressions.g:745:6: ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) )
            	            {
            	            // InternalKerMLExpressions.g:745:6: ( (lv_operator_2_0= ruleOrOperator ) )
            	            // InternalKerMLExpressions.g:746:7: (lv_operator_2_0= ruleOrOperator )
            	            {
            	            // InternalKerMLExpressions.g:746:7: (lv_operator_2_0= ruleOrOperator )
            	            // InternalKerMLExpressions.g:747:8: lv_operator_2_0= ruleOrOperator
            	            {

            	            								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0_0());
            	            							
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

            	            // InternalKerMLExpressions.g:764:6: ( (lv_operand_3_0= ruleXorExpression ) )
            	            // InternalKerMLExpressions.g:765:7: (lv_operand_3_0= ruleXorExpression )
            	            {
            	            // InternalKerMLExpressions.g:765:7: (lv_operand_3_0= ruleXorExpression )
            	            // InternalKerMLExpressions.g:766:8: lv_operand_3_0= ruleXorExpression
            	            {

            	            								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_1_0_1_0());
            	            							
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


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLExpressions.g:785:5: ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) )
            	            {
            	            // InternalKerMLExpressions.g:785:5: ( ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) ) )
            	            // InternalKerMLExpressions.g:786:6: ( (lv_operator_4_0= ruleConditionalOrOperator ) ) ( (lv_operand_5_0= ruleXorExpressionReference ) )
            	            {
            	            // InternalKerMLExpressions.g:786:6: ( (lv_operator_4_0= ruleConditionalOrOperator ) )
            	            // InternalKerMLExpressions.g:787:7: (lv_operator_4_0= ruleConditionalOrOperator )
            	            {
            	            // InternalKerMLExpressions.g:787:7: (lv_operator_4_0= ruleConditionalOrOperator )
            	            // InternalKerMLExpressions.g:788:8: lv_operator_4_0= ruleConditionalOrOperator
            	            {

            	            								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorConditionalOrOperatorParserRuleCall_1_1_1_0_0());
            	            							
            	            pushFollow(FOLLOW_6);
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

            	            // InternalKerMLExpressions.g:805:6: ( (lv_operand_5_0= ruleXorExpressionReference ) )
            	            // InternalKerMLExpressions.g:806:7: (lv_operand_5_0= ruleXorExpressionReference )
            	            {
            	            // InternalKerMLExpressions.g:806:7: (lv_operand_5_0= ruleXorExpressionReference )
            	            // InternalKerMLExpressions.g:807:8: lv_operand_5_0= ruleXorExpressionReference
            	            {

            	            								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandXorExpressionReferenceParserRuleCall_1_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_11);
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
    // InternalKerMLExpressions.g:831:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalKerMLExpressions.g:831:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalKerMLExpressions.g:832:2: iv_ruleOrOperator= ruleOrOperator EOF
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
    // InternalKerMLExpressions.g:838:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:844:2: (kw= '|' )
            // InternalKerMLExpressions.g:845:2: kw= '|'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:853:1: entryRuleConditionalOrOperator returns [String current=null] : iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF ;
    public final String entryRuleConditionalOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOrOperator = null;


        try {
            // InternalKerMLExpressions.g:853:61: (iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF )
            // InternalKerMLExpressions.g:854:2: iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF
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
    // InternalKerMLExpressions.g:860:1: ruleConditionalOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleConditionalOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:866:2: (kw= 'or' )
            // InternalKerMLExpressions.g:867:2: kw= 'or'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:875:1: entryRuleXorExpressionReference returns [EObject current=null] : iv_ruleXorExpressionReference= ruleXorExpressionReference EOF ;
    public final EObject entryRuleXorExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:875:63: (iv_ruleXorExpressionReference= ruleXorExpressionReference EOF )
            // InternalKerMLExpressions.g:876:2: iv_ruleXorExpressionReference= ruleXorExpressionReference EOF
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
    // InternalKerMLExpressions.g:882:1: ruleXorExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleXorExpressionMember ) ) ;
    public final EObject ruleXorExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:888:2: ( ( (lv_ownedRelationship_0_0= ruleXorExpressionMember ) ) )
            // InternalKerMLExpressions.g:889:2: ( (lv_ownedRelationship_0_0= ruleXorExpressionMember ) )
            {
            // InternalKerMLExpressions.g:889:2: ( (lv_ownedRelationship_0_0= ruleXorExpressionMember ) )
            // InternalKerMLExpressions.g:890:3: (lv_ownedRelationship_0_0= ruleXorExpressionMember )
            {
            // InternalKerMLExpressions.g:890:3: (lv_ownedRelationship_0_0= ruleXorExpressionMember )
            // InternalKerMLExpressions.g:891:4: lv_ownedRelationship_0_0= ruleXorExpressionMember
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
    // InternalKerMLExpressions.g:911:1: entryRuleXorExpressionMember returns [EObject current=null] : iv_ruleXorExpressionMember= ruleXorExpressionMember EOF ;
    public final EObject entryRuleXorExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:911:60: (iv_ruleXorExpressionMember= ruleXorExpressionMember EOF )
            // InternalKerMLExpressions.g:912:2: iv_ruleXorExpressionMember= ruleXorExpressionMember EOF
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
    // InternalKerMLExpressions.g:918:1: ruleXorExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleXorExpression ) ) ;
    public final EObject ruleXorExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:924:2: ( ( (lv_ownedRelatedElement_0_0= ruleXorExpression ) ) )
            // InternalKerMLExpressions.g:925:2: ( (lv_ownedRelatedElement_0_0= ruleXorExpression ) )
            {
            // InternalKerMLExpressions.g:925:2: ( (lv_ownedRelatedElement_0_0= ruleXorExpression ) )
            // InternalKerMLExpressions.g:926:3: (lv_ownedRelatedElement_0_0= ruleXorExpression )
            {
            // InternalKerMLExpressions.g:926:3: (lv_ownedRelatedElement_0_0= ruleXorExpression )
            // InternalKerMLExpressions.g:927:4: lv_ownedRelatedElement_0_0= ruleXorExpression
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
    // InternalKerMLExpressions.g:947:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalKerMLExpressions.g:947:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLExpressions.g:948:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalKerMLExpressions.g:954:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:960:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) )
            // InternalKerMLExpressions.g:961:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:961:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            // InternalKerMLExpressions.g:962:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:970:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKerMLExpressions.g:971:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:971:4: ()
            	    // InternalKerMLExpressions.g:972:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:978:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalKerMLExpressions.g:979:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalKerMLExpressions.g:979:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalKerMLExpressions.g:980:6: lv_operator_2_0= ruleXorOperator
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

            	    // InternalKerMLExpressions.g:997:4: ( (lv_operand_3_0= ruleAndExpression ) )
            	    // InternalKerMLExpressions.g:998:5: (lv_operand_3_0= ruleAndExpression )
            	    {
            	    // InternalKerMLExpressions.g:998:5: (lv_operand_3_0= ruleAndExpression )
            	    // InternalKerMLExpressions.g:999:6: lv_operand_3_0= ruleAndExpression
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
    // InternalKerMLExpressions.g:1021:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalKerMLExpressions.g:1021:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalKerMLExpressions.g:1022:2: iv_ruleXorOperator= ruleXorOperator EOF
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
    // InternalKerMLExpressions.g:1028:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'xor' ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1034:2: (kw= 'xor' )
            // InternalKerMLExpressions.g:1035:2: kw= 'xor'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1043:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalKerMLExpressions.g:1043:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLExpressions.g:1044:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalKerMLExpressions.g:1050:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_operand_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1056:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )* ) )
            // InternalKerMLExpressions.g:1057:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )* )
            {
            // InternalKerMLExpressions.g:1057:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )* )
            // InternalKerMLExpressions.g:1058:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1066:3: ( () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=23 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1067:4: () ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) )
            	    {
            	    // InternalKerMLExpressions.g:1067:4: ()
            	    // InternalKerMLExpressions.g:1068:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1074:4: ( ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) ) | ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) ) )
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
            	            // InternalKerMLExpressions.g:1075:5: ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )
            	            {
            	            // InternalKerMLExpressions.g:1075:5: ( ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )
            	            // InternalKerMLExpressions.g:1076:6: ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) )
            	            {
            	            // InternalKerMLExpressions.g:1076:6: ( (lv_operator_2_0= ruleAndOperator ) )
            	            // InternalKerMLExpressions.g:1077:7: (lv_operator_2_0= ruleAndOperator )
            	            {
            	            // InternalKerMLExpressions.g:1077:7: (lv_operator_2_0= ruleAndOperator )
            	            // InternalKerMLExpressions.g:1078:8: lv_operator_2_0= ruleAndOperator
            	            {

            	            								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0_0_0());
            	            							
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

            	            // InternalKerMLExpressions.g:1095:6: ( (lv_operand_3_0= ruleEqualityExpression ) )
            	            // InternalKerMLExpressions.g:1096:7: (lv_operand_3_0= ruleEqualityExpression )
            	            {
            	            // InternalKerMLExpressions.g:1096:7: (lv_operand_3_0= ruleEqualityExpression )
            	            // InternalKerMLExpressions.g:1097:8: lv_operand_3_0= ruleEqualityExpression
            	            {

            	            								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_1_0_1_0());
            	            							
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


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLExpressions.g:1116:5: ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) )
            	            {
            	            // InternalKerMLExpressions.g:1116:5: ( ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) ) )
            	            // InternalKerMLExpressions.g:1117:6: ( (lv_operator_4_0= ruleConditionalAndOperator ) ) ( (lv_operand_5_0= ruleEqualityExpressionReference ) )
            	            {
            	            // InternalKerMLExpressions.g:1117:6: ( (lv_operator_4_0= ruleConditionalAndOperator ) )
            	            // InternalKerMLExpressions.g:1118:7: (lv_operator_4_0= ruleConditionalAndOperator )
            	            {
            	            // InternalKerMLExpressions.g:1118:7: (lv_operator_4_0= ruleConditionalAndOperator )
            	            // InternalKerMLExpressions.g:1119:8: lv_operator_4_0= ruleConditionalAndOperator
            	            {

            	            								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorConditionalAndOperatorParserRuleCall_1_1_1_0_0());
            	            							
            	            pushFollow(FOLLOW_6);
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

            	            // InternalKerMLExpressions.g:1136:6: ( (lv_operand_5_0= ruleEqualityExpressionReference ) )
            	            // InternalKerMLExpressions.g:1137:7: (lv_operand_5_0= ruleEqualityExpressionReference )
            	            {
            	            // InternalKerMLExpressions.g:1137:7: (lv_operand_5_0= ruleEqualityExpressionReference )
            	            // InternalKerMLExpressions.g:1138:8: lv_operand_5_0= ruleEqualityExpressionReference
            	            {

            	            								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionReferenceParserRuleCall_1_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_13);
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
    // InternalKerMLExpressions.g:1162:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalKerMLExpressions.g:1162:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalKerMLExpressions.g:1163:2: iv_ruleAndOperator= ruleAndOperator EOF
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
    // InternalKerMLExpressions.g:1169:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&' ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1175:2: (kw= '&' )
            // InternalKerMLExpressions.g:1176:2: kw= '&'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1184:1: entryRuleConditionalAndOperator returns [String current=null] : iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF ;
    public final String entryRuleConditionalAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalAndOperator = null;


        try {
            // InternalKerMLExpressions.g:1184:62: (iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF )
            // InternalKerMLExpressions.g:1185:2: iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF
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
    // InternalKerMLExpressions.g:1191:1: ruleConditionalAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleConditionalAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1197:2: (kw= 'and' )
            // InternalKerMLExpressions.g:1198:2: kw= 'and'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1206:1: entryRuleEqualityExpressionReference returns [EObject current=null] : iv_ruleEqualityExpressionReference= ruleEqualityExpressionReference EOF ;
    public final EObject entryRuleEqualityExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpressionReference = null;


        try {
            // InternalKerMLExpressions.g:1206:68: (iv_ruleEqualityExpressionReference= ruleEqualityExpressionReference EOF )
            // InternalKerMLExpressions.g:1207:2: iv_ruleEqualityExpressionReference= ruleEqualityExpressionReference EOF
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
    // InternalKerMLExpressions.g:1213:1: ruleEqualityExpressionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleEqualityExpressionMember ) ) ;
    public final EObject ruleEqualityExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1219:2: ( ( (lv_ownedRelationship_0_0= ruleEqualityExpressionMember ) ) )
            // InternalKerMLExpressions.g:1220:2: ( (lv_ownedRelationship_0_0= ruleEqualityExpressionMember ) )
            {
            // InternalKerMLExpressions.g:1220:2: ( (lv_ownedRelationship_0_0= ruleEqualityExpressionMember ) )
            // InternalKerMLExpressions.g:1221:3: (lv_ownedRelationship_0_0= ruleEqualityExpressionMember )
            {
            // InternalKerMLExpressions.g:1221:3: (lv_ownedRelationship_0_0= ruleEqualityExpressionMember )
            // InternalKerMLExpressions.g:1222:4: lv_ownedRelationship_0_0= ruleEqualityExpressionMember
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
    // InternalKerMLExpressions.g:1242:1: entryRuleEqualityExpressionMember returns [EObject current=null] : iv_ruleEqualityExpressionMember= ruleEqualityExpressionMember EOF ;
    public final EObject entryRuleEqualityExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:1242:65: (iv_ruleEqualityExpressionMember= ruleEqualityExpressionMember EOF )
            // InternalKerMLExpressions.g:1243:2: iv_ruleEqualityExpressionMember= ruleEqualityExpressionMember EOF
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
    // InternalKerMLExpressions.g:1249:1: ruleEqualityExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleEqualityExpression ) ) ;
    public final EObject ruleEqualityExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1255:2: ( ( (lv_ownedRelatedElement_0_0= ruleEqualityExpression ) ) )
            // InternalKerMLExpressions.g:1256:2: ( (lv_ownedRelatedElement_0_0= ruleEqualityExpression ) )
            {
            // InternalKerMLExpressions.g:1256:2: ( (lv_ownedRelatedElement_0_0= ruleEqualityExpression ) )
            // InternalKerMLExpressions.g:1257:3: (lv_ownedRelatedElement_0_0= ruleEqualityExpression )
            {
            // InternalKerMLExpressions.g:1257:3: (lv_ownedRelatedElement_0_0= ruleEqualityExpression )
            // InternalKerMLExpressions.g:1258:4: lv_ownedRelatedElement_0_0= ruleEqualityExpression
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
    // InternalKerMLExpressions.g:1278:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLExpressions.g:1278:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:1279:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalKerMLExpressions.g:1285:1: ruleEqualityExpression returns [EObject current=null] : (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1291:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1292:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1292:2: (this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )* )
            // InternalKerMLExpressions.g:1293:3: this_ClassificationExpression_0= ruleClassificationExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_ClassificationExpression_0=ruleClassificationExpression();

            state._fsp--;


            			current = this_ClassificationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1301:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1302:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1302:4: ()
            	    // InternalKerMLExpressions.g:1303:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1309:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalKerMLExpressions.g:1310:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalKerMLExpressions.g:1310:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalKerMLExpressions.g:1311:6: lv_operator_2_0= ruleEqualityOperator
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

            	    // InternalKerMLExpressions.g:1328:4: ( (lv_operand_3_0= ruleClassificationExpression ) )
            	    // InternalKerMLExpressions.g:1329:5: (lv_operand_3_0= ruleClassificationExpression )
            	    {
            	    // InternalKerMLExpressions.g:1329:5: (lv_operand_3_0= ruleClassificationExpression )
            	    // InternalKerMLExpressions.g:1330:6: lv_operand_3_0= ruleClassificationExpression
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
    // InternalKerMLExpressions.g:1352:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalKerMLExpressions.g:1352:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:1353:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalKerMLExpressions.g:1359:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1365:2: ( (kw= '==' | kw= '!=' ) )
            // InternalKerMLExpressions.g:1366:2: (kw= '==' | kw= '!=' )
            {
            // InternalKerMLExpressions.g:1366:2: (kw= '==' | kw= '!=' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKerMLExpressions.g:1367:3: kw= '=='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1373:3: kw= '!='
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1382:1: entryRuleClassificationExpression returns [EObject current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final EObject entryRuleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLExpressions.g:1382:65: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:1383:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
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
    // InternalKerMLExpressions.g:1389:1: ruleClassificationExpression returns [EObject current=null] : ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) ) ;
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
            // InternalKerMLExpressions.g:1395:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) ) )
            // InternalKerMLExpressions.g:1396:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) )
            {
            // InternalKerMLExpressions.g:1396:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? ) | ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING_VALUE && LA13_0<=RULE_UNRESTRICTED_NAME)||(LA13_0>=36 && LA13_0<=38)||(LA13_0>=43 && LA13_0<=46)||LA13_0==51||LA13_0==53||(LA13_0>=59 && LA13_0<=61)) ) {
                alt13=1;
            }
            else if ( (LA13_0==EOF||(LA13_0>=27 && LA13_0<=30)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalKerMLExpressions.g:1397:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? )
                    {
                    // InternalKerMLExpressions.g:1397:3: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )? )
                    // InternalKerMLExpressions.g:1398:4: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_15);
                    this_RelationalExpression_0=ruleRelationalExpression();

                    state._fsp--;


                    				current = this_RelationalExpression_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLExpressions.g:1406:4: ( () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=27 && LA12_0<=30)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalKerMLExpressions.g:1407:5: () ( (lv_operator_2_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            {
                            // InternalKerMLExpressions.g:1407:5: ()
                            // InternalKerMLExpressions.g:1408:6: 
                            {

                            						current = forceCreateModelElementAndAdd(
                            							grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalKerMLExpressions.g:1414:5: ( (lv_operator_2_0= ruleClassificationOperator ) )
                            // InternalKerMLExpressions.g:1415:6: (lv_operator_2_0= ruleClassificationOperator )
                            {
                            // InternalKerMLExpressions.g:1415:6: (lv_operator_2_0= ruleClassificationOperator )
                            // InternalKerMLExpressions.g:1416:7: lv_operator_2_0= ruleClassificationOperator
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

                            // InternalKerMLExpressions.g:1433:5: ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) )
                            // InternalKerMLExpressions.g:1434:6: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            {
                            // InternalKerMLExpressions.g:1434:6: (lv_ownedRelationship_3_0= ruleTypeReferenceMember )
                            // InternalKerMLExpressions.g:1435:7: lv_ownedRelationship_3_0= ruleTypeReferenceMember
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
                    // InternalKerMLExpressions.g:1455:3: ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:1455:3: ( () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:1456:4: () ( (lv_operand_5_0= ruleSelfReferenceExpression ) ) ( (lv_operator_6_0= ruleClassificationOperator ) ) ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:1456:4: ()
                    // InternalKerMLExpressions.g:1457:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1463:4: ( (lv_operand_5_0= ruleSelfReferenceExpression ) )
                    // InternalKerMLExpressions.g:1464:5: (lv_operand_5_0= ruleSelfReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:1464:5: (lv_operand_5_0= ruleSelfReferenceExpression )
                    // InternalKerMLExpressions.g:1465:6: lv_operand_5_0= ruleSelfReferenceExpression
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

                    // InternalKerMLExpressions.g:1482:4: ( (lv_operator_6_0= ruleClassificationOperator ) )
                    // InternalKerMLExpressions.g:1483:5: (lv_operator_6_0= ruleClassificationOperator )
                    {
                    // InternalKerMLExpressions.g:1483:5: (lv_operator_6_0= ruleClassificationOperator )
                    // InternalKerMLExpressions.g:1484:6: lv_operator_6_0= ruleClassificationOperator
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

                    // InternalKerMLExpressions.g:1501:4: ( (lv_ownedRelationship_7_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:1502:5: (lv_ownedRelationship_7_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:1502:5: (lv_ownedRelationship_7_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:1503:6: lv_ownedRelationship_7_0= ruleTypeReferenceMember
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
    // InternalKerMLExpressions.g:1525:1: entryRuleClassificationOperator returns [String current=null] : iv_ruleClassificationOperator= ruleClassificationOperator EOF ;
    public final String entryRuleClassificationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationOperator = null;


        try {
            // InternalKerMLExpressions.g:1525:62: (iv_ruleClassificationOperator= ruleClassificationOperator EOF )
            // InternalKerMLExpressions.g:1526:2: iv_ruleClassificationOperator= ruleClassificationOperator EOF
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
    // InternalKerMLExpressions.g:1532:1: ruleClassificationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleClassificationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1538:2: ( (kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' ) )
            // InternalKerMLExpressions.g:1539:2: (kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' )
            {
            // InternalKerMLExpressions.g:1539:2: (kw= 'hastype' | kw= 'istype' | kw= '@' | kw= 'as' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKerMLExpressions.g:1540:3: kw= 'hastype'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1546:3: kw= 'istype'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1552:3: kw= '@'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1558:3: kw= 'as'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1567:1: entryRuleTypeReferenceMember returns [EObject current=null] : iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF ;
    public final EObject entryRuleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1567:60: (iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:1568:2: iv_ruleTypeReferenceMember= ruleTypeReferenceMember EOF
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
    // InternalKerMLExpressions.g:1574:1: ruleTypeReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) ;
    public final EObject ruleTypeReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1580:2: ( ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) ) )
            // InternalKerMLExpressions.g:1581:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            {
            // InternalKerMLExpressions.g:1581:2: ( (lv_ownedRelatedElement_0_0= ruleTypeReference ) )
            // InternalKerMLExpressions.g:1582:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            {
            // InternalKerMLExpressions.g:1582:3: (lv_ownedRelatedElement_0_0= ruleTypeReference )
            // InternalKerMLExpressions.g:1583:4: lv_ownedRelatedElement_0_0= ruleTypeReference
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
    // InternalKerMLExpressions.g:1603:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalKerMLExpressions.g:1603:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalKerMLExpressions.g:1604:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalKerMLExpressions.g:1610:1: ruleTypeReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1616:2: ( ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) )
            // InternalKerMLExpressions.g:1617:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            {
            // InternalKerMLExpressions.g:1617:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:1618:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:1618:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            // InternalKerMLExpressions.g:1619:4: lv_ownedRelationship_0_0= ruleReferenceTyping
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
    // InternalKerMLExpressions.g:1639:1: entryRuleReferenceTyping returns [EObject current=null] : iv_ruleReferenceTyping= ruleReferenceTyping EOF ;
    public final EObject entryRuleReferenceTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTyping = null;


        try {
            // InternalKerMLExpressions.g:1639:56: (iv_ruleReferenceTyping= ruleReferenceTyping EOF )
            // InternalKerMLExpressions.g:1640:2: iv_ruleReferenceTyping= ruleReferenceTyping EOF
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
    // InternalKerMLExpressions.g:1646:1: ruleReferenceTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReferenceTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1652:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:1653:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:1653:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:1654:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:1654:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:1655:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:1672:1: entryRuleSelfReferenceExpression returns [EObject current=null] : iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF ;
    public final EObject entryRuleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:1672:64: (iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:1673:2: iv_ruleSelfReferenceExpression= ruleSelfReferenceExpression EOF
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
    // InternalKerMLExpressions.g:1679:1: ruleSelfReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) ;
    public final EObject ruleSelfReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1685:2: ( ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) ) )
            // InternalKerMLExpressions.g:1686:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            {
            // InternalKerMLExpressions.g:1686:2: ( (lv_ownedRelationship_0_0= ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:1687:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:1687:3: (lv_ownedRelationship_0_0= ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:1688:4: lv_ownedRelationship_0_0= ruleSelfReferenceMember
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
    // InternalKerMLExpressions.g:1708:1: entryRuleSelfReferenceMember returns [EObject current=null] : iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF ;
    public final EObject entryRuleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:1708:60: (iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:1709:2: iv_ruleSelfReferenceMember= ruleSelfReferenceMember EOF
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
    // InternalKerMLExpressions.g:1715:1: ruleSelfReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) ;
    public final EObject ruleSelfReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1721:2: ( ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) ) )
            // InternalKerMLExpressions.g:1722:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            {
            // InternalKerMLExpressions.g:1722:2: ( (lv_ownedRelatedElement_0_0= ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:1723:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:1723:3: (lv_ownedRelatedElement_0_0= ruleEmptyFeature )
            // InternalKerMLExpressions.g:1724:4: lv_ownedRelatedElement_0_0= ruleEmptyFeature
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
    // InternalKerMLExpressions.g:1744:1: entryRuleEmptyFeature returns [EObject current=null] : iv_ruleEmptyFeature= ruleEmptyFeature EOF ;
    public final EObject entryRuleEmptyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFeature = null;


        try {
            // InternalKerMLExpressions.g:1744:53: (iv_ruleEmptyFeature= ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:1745:2: iv_ruleEmptyFeature= ruleEmptyFeature EOF
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
    // InternalKerMLExpressions.g:1751:1: ruleEmptyFeature returns [EObject current=null] : () ;
    public final EObject ruleEmptyFeature() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1757:2: ( () )
            // InternalKerMLExpressions.g:1758:2: ()
            {
            // InternalKerMLExpressions.g:1758:2: ()
            // InternalKerMLExpressions.g:1759:3: 
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
    // InternalKerMLExpressions.g:1768:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLExpressions.g:1768:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:1769:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalKerMLExpressions.g:1775:1: ruleRelationalExpression returns [EObject current=null] : (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RangeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1781:2: ( (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1782:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1782:2: (this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )* )
            // InternalKerMLExpressions.g:1783:3: this_RangeExpression_0= ruleRangeExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_RangeExpression_0=ruleRangeExpression();

            state._fsp--;


            			current = this_RangeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1791:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=34)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1792:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleRangeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1792:4: ()
            	    // InternalKerMLExpressions.g:1793:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1799:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalKerMLExpressions.g:1800:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalKerMLExpressions.g:1800:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalKerMLExpressions.g:1801:6: lv_operator_2_0= ruleRelationalOperator
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

            	    // InternalKerMLExpressions.g:1818:4: ( (lv_operand_3_0= ruleRangeExpression ) )
            	    // InternalKerMLExpressions.g:1819:5: (lv_operand_3_0= ruleRangeExpression )
            	    {
            	    // InternalKerMLExpressions.g:1819:5: (lv_operand_3_0= ruleRangeExpression )
            	    // InternalKerMLExpressions.g:1820:6: lv_operand_3_0= ruleRangeExpression
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
    // InternalKerMLExpressions.g:1842:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalKerMLExpressions.g:1842:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:1843:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
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
    // InternalKerMLExpressions.g:1849:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:1855:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalKerMLExpressions.g:1856:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalKerMLExpressions.g:1856:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
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
                    // InternalKerMLExpressions.g:1857:3: kw= '<'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1863:3: kw= '>'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1869:3: kw= '<='
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1875:3: kw= '>='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1884:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalKerMLExpressions.g:1884:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalKerMLExpressions.g:1885:2: iv_ruleRangeExpression= ruleRangeExpression EOF
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
    // InternalKerMLExpressions.g:1891:1: ruleRangeExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1897:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalKerMLExpressions.g:1898:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalKerMLExpressions.g:1898:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )? )
            // InternalKerMLExpressions.g:1899:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1907:3: ( () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKerMLExpressions.g:1908:4: () ( (lv_operator_2_0= '..' ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalKerMLExpressions.g:1908:4: ()
                    // InternalKerMLExpressions.g:1909:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRangeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:1915:4: ( (lv_operator_2_0= '..' ) )
                    // InternalKerMLExpressions.g:1916:5: (lv_operator_2_0= '..' )
                    {
                    // InternalKerMLExpressions.g:1916:5: (lv_operator_2_0= '..' )
                    // InternalKerMLExpressions.g:1917:6: lv_operator_2_0= '..'
                    {
                    lv_operator_2_0=(Token)match(input,35,FOLLOW_6); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangeExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "..");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:1929:4: ( (lv_operand_3_0= ruleAdditiveExpression ) )
                    // InternalKerMLExpressions.g:1930:5: (lv_operand_3_0= ruleAdditiveExpression )
                    {
                    // InternalKerMLExpressions.g:1930:5: (lv_operand_3_0= ruleAdditiveExpression )
                    // InternalKerMLExpressions.g:1931:6: lv_operand_3_0= ruleAdditiveExpression
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
    // InternalKerMLExpressions.g:1953:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLExpressions.g:1953:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:1954:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalKerMLExpressions.g:1960:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:1966:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalKerMLExpressions.g:1967:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:1967:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalKerMLExpressions.g:1968:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:1976:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=36 && LA18_0<=37)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1977:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:1977:4: ()
            	    // InternalKerMLExpressions.g:1978:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:1984:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalKerMLExpressions.g:1985:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalKerMLExpressions.g:1985:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalKerMLExpressions.g:1986:6: lv_operator_2_0= ruleAdditiveOperator
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

            	    // InternalKerMLExpressions.g:2003:4: ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    // InternalKerMLExpressions.g:2004:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalKerMLExpressions.g:2004:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    // InternalKerMLExpressions.g:2005:6: lv_operand_3_0= ruleMultiplicativeExpression
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
    // InternalKerMLExpressions.g:2027:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalKerMLExpressions.g:2027:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:2028:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
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
    // InternalKerMLExpressions.g:2034:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2040:2: ( (kw= '+' | kw= '-' ) )
            // InternalKerMLExpressions.g:2041:2: (kw= '+' | kw= '-' )
            {
            // InternalKerMLExpressions.g:2041:2: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalKerMLExpressions.g:2042:3: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2048:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2057:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLExpressions.g:2057:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:2058:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalKerMLExpressions.g:2064:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2070:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* ) )
            // InternalKerMLExpressions.g:2071:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:2071:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )* )
            // InternalKerMLExpressions.g:2072:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;


            			current = this_ExponentiationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2080:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=38 && LA20_0<=40)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2081:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2081:4: ()
            	    // InternalKerMLExpressions.g:2082:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:2088:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalKerMLExpressions.g:2089:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalKerMLExpressions.g:2089:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalKerMLExpressions.g:2090:6: lv_operator_2_0= ruleMultiplicativeOperator
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

            	    // InternalKerMLExpressions.g:2107:4: ( (lv_operand_3_0= ruleExponentiationExpression ) )
            	    // InternalKerMLExpressions.g:2108:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    {
            	    // InternalKerMLExpressions.g:2108:5: (lv_operand_3_0= ruleExponentiationExpression )
            	    // InternalKerMLExpressions.g:2109:6: lv_operand_3_0= ruleExponentiationExpression
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
    // InternalKerMLExpressions.g:2131:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalKerMLExpressions.g:2131:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:2132:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
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
    // InternalKerMLExpressions.g:2138:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2144:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalKerMLExpressions.g:2145:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalKerMLExpressions.g:2145:2: (kw= '*' | kw= '/' | kw= '%' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 39:
                {
                alt21=2;
                }
                break;
            case 40:
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
                    // InternalKerMLExpressions.g:2146:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2152:3: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2158:3: kw= '%'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2167:1: entryRuleExponentiationExpression returns [EObject current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final EObject entryRuleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLExpressions.g:2167:65: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:2168:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
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
    // InternalKerMLExpressions.g:2174:1: ruleExponentiationExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2180:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalKerMLExpressions.g:2181:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalKerMLExpressions.g:2181:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )* )
            // InternalKerMLExpressions.g:2182:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2190:3: ( () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=41 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2191:4: () ( (lv_operator_2_0= ruleExponentiationOperator ) ) ( (lv_operand_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalKerMLExpressions.g:2191:4: ()
            	    // InternalKerMLExpressions.g:2192:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalKerMLExpressions.g:2198:4: ( (lv_operator_2_0= ruleExponentiationOperator ) )
            	    // InternalKerMLExpressions.g:2199:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    {
            	    // InternalKerMLExpressions.g:2199:5: (lv_operator_2_0= ruleExponentiationOperator )
            	    // InternalKerMLExpressions.g:2200:6: lv_operator_2_0= ruleExponentiationOperator
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

            	    // InternalKerMLExpressions.g:2217:4: ( (lv_operand_3_0= ruleUnaryExpression ) )
            	    // InternalKerMLExpressions.g:2218:5: (lv_operand_3_0= ruleUnaryExpression )
            	    {
            	    // InternalKerMLExpressions.g:2218:5: (lv_operand_3_0= ruleUnaryExpression )
            	    // InternalKerMLExpressions.g:2219:6: lv_operand_3_0= ruleUnaryExpression
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
    // InternalKerMLExpressions.g:2241:1: entryRuleExponentiationOperator returns [String current=null] : iv_ruleExponentiationOperator= ruleExponentiationOperator EOF ;
    public final String entryRuleExponentiationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationOperator = null;


        try {
            // InternalKerMLExpressions.g:2241:62: (iv_ruleExponentiationOperator= ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:2242:2: iv_ruleExponentiationOperator= ruleExponentiationOperator EOF
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
    // InternalKerMLExpressions.g:2248:1: ruleExponentiationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '**' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleExponentiationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2254:2: ( (kw= '**' | kw= '^' ) )
            // InternalKerMLExpressions.g:2255:2: (kw= '**' | kw= '^' )
            {
            // InternalKerMLExpressions.g:2255:2: (kw= '**' | kw= '^' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            else if ( (LA23_0==42) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalKerMLExpressions.g:2256:3: kw= '**'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2262:3: kw= '^'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2271:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLExpressions.g:2271:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:2272:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalKerMLExpressions.g:2278:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_ExtentExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2284:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression ) )
            // InternalKerMLExpressions.g:2285:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:2285:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) ) | this_ExtentExpression_3= ruleExtentExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=36 && LA24_0<=37)||(LA24_0>=43 && LA24_0<=44)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_STRING_VALUE && LA24_0<=RULE_UNRESTRICTED_NAME)||LA24_0==38||(LA24_0>=45 && LA24_0<=46)||LA24_0==51||LA24_0==53||(LA24_0>=59 && LA24_0<=61)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalKerMLExpressions.g:2286:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:2286:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) ) )
                    // InternalKerMLExpressions.g:2287:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_operand_2_0= ruleExtentExpression ) )
                    {
                    // InternalKerMLExpressions.g:2287:4: ()
                    // InternalKerMLExpressions.g:2288:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:2294:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalKerMLExpressions.g:2295:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalKerMLExpressions.g:2295:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalKerMLExpressions.g:2296:6: lv_operator_1_0= ruleUnaryOperator
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

                    // InternalKerMLExpressions.g:2313:4: ( (lv_operand_2_0= ruleExtentExpression ) )
                    // InternalKerMLExpressions.g:2314:5: (lv_operand_2_0= ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:2314:5: (lv_operand_2_0= ruleExtentExpression )
                    // InternalKerMLExpressions.g:2315:6: lv_operand_2_0= ruleExtentExpression
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
                    // InternalKerMLExpressions.g:2334:3: this_ExtentExpression_3= ruleExtentExpression
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
    // InternalKerMLExpressions.g:2346:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalKerMLExpressions.g:2346:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:2347:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalKerMLExpressions.g:2353:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:2359:2: ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) )
            // InternalKerMLExpressions.g:2360:2: (kw= '+' | kw= '-' | kw= '~' | kw= 'not' )
            {
            // InternalKerMLExpressions.g:2360:2: (kw= '+' | kw= '-' | kw= '~' | kw= 'not' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 43:
                {
                alt25=3;
                }
                break;
            case 44:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalKerMLExpressions.g:2361:3: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2367:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2373:3: kw= '~'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2379:3: kw= 'not'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:2388:1: entryRuleExtentExpression returns [EObject current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final EObject entryRuleExtentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtentExpression = null;


        try {
            // InternalKerMLExpressions.g:2388:57: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:2389:2: iv_ruleExtentExpression= ruleExtentExpression EOF
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
    // InternalKerMLExpressions.g:2395:1: ruleExtentExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleExtentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2401:2: ( ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalKerMLExpressions.g:2402:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalKerMLExpressions.g:2402:2: ( ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING_VALUE && LA26_0<=RULE_UNRESTRICTED_NAME)||LA26_0==38||LA26_0==46||LA26_0==51||LA26_0==53||(LA26_0>=59 && LA26_0<=61)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalKerMLExpressions.g:2403:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) )
                    {
                    // InternalKerMLExpressions.g:2403:3: ( () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) ) )
                    // InternalKerMLExpressions.g:2404:4: () ( (lv_operator_1_0= 'all' ) ) ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) )
                    {
                    // InternalKerMLExpressions.g:2404:4: ()
                    // InternalKerMLExpressions.g:2405:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:2411:4: ( (lv_operator_1_0= 'all' ) )
                    // InternalKerMLExpressions.g:2412:5: (lv_operator_1_0= 'all' )
                    {
                    // InternalKerMLExpressions.g:2412:5: (lv_operator_1_0= 'all' )
                    // InternalKerMLExpressions.g:2413:6: lv_operator_1_0= 'all'
                    {
                    lv_operator_1_0=(Token)match(input,45,FOLLOW_16); 

                    						newLeafNode(lv_operator_1_0, grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtentExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_0, "all");
                    					

                    }


                    }

                    // InternalKerMLExpressions.g:2425:4: ( (lv_ownedRelationship_2_0= ruleTypeReferenceMember ) )
                    // InternalKerMLExpressions.g:2426:5: (lv_ownedRelationship_2_0= ruleTypeReferenceMember )
                    {
                    // InternalKerMLExpressions.g:2426:5: (lv_ownedRelationship_2_0= ruleTypeReferenceMember )
                    // InternalKerMLExpressions.g:2427:6: lv_ownedRelationship_2_0= ruleTypeReferenceMember
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
                    // InternalKerMLExpressions.g:2446:3: this_PrimaryExpression_3= rulePrimaryExpression
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
    // InternalKerMLExpressions.g:2458:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKerMLExpressions.g:2458:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKerMLExpressions.g:2459:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKerMLExpressions.g:2465:1: rulePrimaryExpression returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) ) | ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) ) | ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) ) ) ( () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) ) )? )* ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_operator_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        EObject this_BaseExpression_0 = null;

        EObject lv_ownedRelationship_3_0 = null;

        EObject lv_operand_6_0 = null;

        EObject lv_ownedRelationship_10_0 = null;

        EObject lv_operand_11_0 = null;

        EObject lv_operand_12_0 = null;

        EObject this_ArgumentList_13 = null;

        EObject lv_operand_16_0 = null;

        EObject lv_operand_19_0 = null;

        EObject lv_ownedRelationship_22_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2471:2: ( (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) ) | ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) ) | ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) ) ) ( () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) ) )? )* ) )
            // InternalKerMLExpressions.g:2472:2: (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) ) | ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) ) | ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) ) ) ( () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) ) )? )* )
            {
            // InternalKerMLExpressions.g:2472:2: (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) ) | ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) ) | ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) ) ) ( () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) ) )? )* )
            // InternalKerMLExpressions.g:2473:3: this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )? ( ( ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) ) | ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) ) | ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) ) ) ( () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) ) )? )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;


            			current = this_BaseExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:2481:3: ( () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>=RULE_ID && LA27_1<=RULE_UNRESTRICTED_NAME)) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalKerMLExpressions.g:2482:4: () otherlv_2= '.' ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) )
                    {
                    // InternalKerMLExpressions.g:2482:4: ()
                    // InternalKerMLExpressions.g:2483:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getPrimaryExpressionAccess().getFeatureChainExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_1());
                    			
                    // InternalKerMLExpressions.g:2493:4: ( (lv_ownedRelationship_3_0= ruleFeatureChainMember ) )
                    // InternalKerMLExpressions.g:2494:5: (lv_ownedRelationship_3_0= ruleFeatureChainMember )
                    {
                    // InternalKerMLExpressions.g:2494:5: (lv_ownedRelationship_3_0= ruleFeatureChainMember )
                    // InternalKerMLExpressions.g:2495:6: lv_ownedRelationship_3_0= ruleFeatureChainMember
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFeatureChainMemberParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalKerMLExpressions.g:2513:3: ( ( ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) ) | ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) ) | ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) ) ) ( () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) ) )? )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=46 && LA31_0<=47)||(LA31_0>=49 && LA31_0<=50)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2514:4: ( ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) ) | ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) ) | ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) ) ) ( () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) ) )?
            	    {
            	    // InternalKerMLExpressions.g:2514:4: ( ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) ) | ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) ) | ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) ) )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case 50:
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
            	            // InternalKerMLExpressions.g:2515:5: ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' )
            	            {
            	            // InternalKerMLExpressions.g:2515:5: ( () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']' )
            	            // InternalKerMLExpressions.g:2516:6: () ( (lv_operator_5_0= '[' ) ) ( (lv_operand_6_0= ruleSequenceExpression ) ) otherlv_7= ']'
            	            {
            	            // InternalKerMLExpressions.g:2516:6: ()
            	            // InternalKerMLExpressions.g:2517:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_0_0(),
            	            								current);
            	            						

            	            }

            	            // InternalKerMLExpressions.g:2523:6: ( (lv_operator_5_0= '[' ) )
            	            // InternalKerMLExpressions.g:2524:7: (lv_operator_5_0= '[' )
            	            {
            	            // InternalKerMLExpressions.g:2524:7: (lv_operator_5_0= '[' )
            	            // InternalKerMLExpressions.g:2525:8: lv_operator_5_0= '['
            	            {
            	            lv_operator_5_0=(Token)match(input,47,FOLLOW_4); 

            	            								newLeafNode(lv_operator_5_0, grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_2_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								setWithLastConsumed(current, "operator", lv_operator_5_0, "[");
            	            							

            	            }


            	            }

            	            // InternalKerMLExpressions.g:2537:6: ( (lv_operand_6_0= ruleSequenceExpression ) )
            	            // InternalKerMLExpressions.g:2538:7: (lv_operand_6_0= ruleSequenceExpression )
            	            {
            	            // InternalKerMLExpressions.g:2538:7: (lv_operand_6_0= ruleSequenceExpression )
            	            // InternalKerMLExpressions.g:2539:8: lv_operand_6_0= ruleSequenceExpression
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandSequenceExpressionParserRuleCall_2_0_0_2_0());
            	            							
            	            pushFollow(FOLLOW_24);
            	            lv_operand_6_0=ruleSequenceExpression();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_6_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.SequenceExpression");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            otherlv_7=(Token)match(input,48,FOLLOW_23); 

            	            						newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_2_0_0_3());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLExpressions.g:2562:5: ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) )
            	            {
            	            // InternalKerMLExpressions.g:2562:5: ( () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] ) )
            	            // InternalKerMLExpressions.g:2563:6: () otherlv_9= '->' ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) ) ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] )
            	            {
            	            // InternalKerMLExpressions.g:2563:6: ()
            	            // InternalKerMLExpressions.g:2564:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_9=(Token)match(input,49,FOLLOW_16); 

            	            						newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_0_1_1());
            	            					
            	            // InternalKerMLExpressions.g:2574:6: ( (lv_ownedRelationship_10_0= ruleReferenceTyping ) )
            	            // InternalKerMLExpressions.g:2575:7: (lv_ownedRelationship_10_0= ruleReferenceTyping )
            	            {
            	            // InternalKerMLExpressions.g:2575:7: (lv_ownedRelationship_10_0= ruleReferenceTyping )
            	            // InternalKerMLExpressions.g:2576:8: lv_ownedRelationship_10_0= ruleReferenceTyping
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipReferenceTypingParserRuleCall_2_0_1_2_0());
            	            							
            	            pushFollow(FOLLOW_25);
            	            lv_ownedRelationship_10_0=ruleReferenceTyping();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"ownedRelationship",
            	            									lv_ownedRelationship_10_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.ReferenceTyping");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalKerMLExpressions.g:2593:6: ( ( (lv_operand_11_0= ruleBodyExpression ) ) | ( (lv_operand_12_0= ruleFunctionReferenceExpression ) ) | this_ArgumentList_13= ruleArgumentList[$current] )
            	            int alt28=3;
            	            switch ( input.LA(1) ) {
            	            case 53:
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
            	            case 51:
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
            	                    // InternalKerMLExpressions.g:2594:7: ( (lv_operand_11_0= ruleBodyExpression ) )
            	                    {
            	                    // InternalKerMLExpressions.g:2594:7: ( (lv_operand_11_0= ruleBodyExpression ) )
            	                    // InternalKerMLExpressions.g:2595:8: (lv_operand_11_0= ruleBodyExpression )
            	                    {
            	                    // InternalKerMLExpressions.g:2595:8: (lv_operand_11_0= ruleBodyExpression )
            	                    // InternalKerMLExpressions.g:2596:9: lv_operand_11_0= ruleBodyExpression
            	                    {

            	                    									newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandBodyExpressionParserRuleCall_2_0_1_3_0_0());
            	                    								
            	                    pushFollow(FOLLOW_23);
            	                    lv_operand_11_0=ruleBodyExpression();

            	                    state._fsp--;


            	                    									if (current==null) {
            	                    										current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	                    									}
            	                    									add(
            	                    										current,
            	                    										"operand",
            	                    										lv_operand_11_0,
            	                    										"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyExpression");
            	                    									afterParserOrEnumRuleCall();
            	                    								

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalKerMLExpressions.g:2614:7: ( (lv_operand_12_0= ruleFunctionReferenceExpression ) )
            	                    {
            	                    // InternalKerMLExpressions.g:2614:7: ( (lv_operand_12_0= ruleFunctionReferenceExpression ) )
            	                    // InternalKerMLExpressions.g:2615:8: (lv_operand_12_0= ruleFunctionReferenceExpression )
            	                    {
            	                    // InternalKerMLExpressions.g:2615:8: (lv_operand_12_0= ruleFunctionReferenceExpression )
            	                    // InternalKerMLExpressions.g:2616:9: lv_operand_12_0= ruleFunctionReferenceExpression
            	                    {

            	                    									newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandFunctionReferenceExpressionParserRuleCall_2_0_1_3_1_0());
            	                    								
            	                    pushFollow(FOLLOW_23);
            	                    lv_operand_12_0=ruleFunctionReferenceExpression();

            	                    state._fsp--;


            	                    									if (current==null) {
            	                    										current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	                    									}
            	                    									add(
            	                    										current,
            	                    										"operand",
            	                    										lv_operand_12_0,
            	                    										"org.omg.kerml.expressions.xtext.KerMLExpressions.FunctionReferenceExpression");
            	                    									afterParserOrEnumRuleCall();
            	                    								

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalKerMLExpressions.g:2634:7: this_ArgumentList_13= ruleArgumentList[$current]
            	                    {

            	                    							if (current==null) {
            	                    								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
            	                    							}
            	                    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_2_0_1_3_2());
            	                    						
            	                    pushFollow(FOLLOW_23);
            	                    this_ArgumentList_13=ruleArgumentList(current);

            	                    state._fsp--;


            	                    							current = this_ArgumentList_13;
            	                    							afterParserOrEnumRuleCall();
            	                    						

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLExpressions.g:2648:5: ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) )
            	            {
            	            // InternalKerMLExpressions.g:2648:5: ( () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) ) )
            	            // InternalKerMLExpressions.g:2649:6: () otherlv_15= '.' ( (lv_operand_16_0= ruleBodyExpression ) )
            	            {
            	            // InternalKerMLExpressions.g:2649:6: ()
            	            // InternalKerMLExpressions.g:2650:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getCollectExpressionOperandAction_2_0_2_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_15=(Token)match(input,46,FOLLOW_26); 

            	            						newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_0_2_1());
            	            					
            	            // InternalKerMLExpressions.g:2660:6: ( (lv_operand_16_0= ruleBodyExpression ) )
            	            // InternalKerMLExpressions.g:2661:7: (lv_operand_16_0= ruleBodyExpression )
            	            {
            	            // InternalKerMLExpressions.g:2661:7: (lv_operand_16_0= ruleBodyExpression )
            	            // InternalKerMLExpressions.g:2662:8: lv_operand_16_0= ruleBodyExpression
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandBodyExpressionParserRuleCall_2_0_2_2_0());
            	            							
            	            pushFollow(FOLLOW_23);
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


            	            }
            	            break;
            	        case 4 :
            	            // InternalKerMLExpressions.g:2681:5: ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) )
            	            {
            	            // InternalKerMLExpressions.g:2681:5: ( () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) ) )
            	            // InternalKerMLExpressions.g:2682:6: () otherlv_18= '.?' ( (lv_operand_19_0= ruleBodyExpression ) )
            	            {
            	            // InternalKerMLExpressions.g:2682:6: ()
            	            // InternalKerMLExpressions.g:2683:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPrimaryExpressionAccess().getSelectExpressionOperandAction_2_0_3_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_18=(Token)match(input,50,FOLLOW_26); 

            	            						newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getFullStopQuestionMarkKeyword_2_0_3_1());
            	            					
            	            // InternalKerMLExpressions.g:2693:6: ( (lv_operand_19_0= ruleBodyExpression ) )
            	            // InternalKerMLExpressions.g:2694:7: (lv_operand_19_0= ruleBodyExpression )
            	            {
            	            // InternalKerMLExpressions.g:2694:7: (lv_operand_19_0= ruleBodyExpression )
            	            // InternalKerMLExpressions.g:2695:8: lv_operand_19_0= ruleBodyExpression
            	            {

            	            								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandBodyExpressionParserRuleCall_2_0_3_2_0());
            	            							
            	            pushFollow(FOLLOW_23);
            	            lv_operand_19_0=ruleBodyExpression();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"operand",
            	            									lv_operand_19_0,
            	            									"org.omg.kerml.expressions.xtext.KerMLExpressions.BodyExpression");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalKerMLExpressions.g:2714:4: ( () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) ) )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==46) ) {
            	        int LA30_1 = input.LA(2);

            	        if ( ((LA30_1>=RULE_ID && LA30_1<=RULE_UNRESTRICTED_NAME)) ) {
            	            alt30=1;
            	        }
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalKerMLExpressions.g:2715:5: () otherlv_21= '.' ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) )
            	            {
            	            // InternalKerMLExpressions.g:2715:5: ()
            	            // InternalKerMLExpressions.g:2716:6: 
            	            {

            	            						current = forceCreateModelElementAndAdd(
            	            							grammarAccess.getPrimaryExpressionAccess().getFeatureChainExpressionOperandAction_2_1_0(),
            	            							current);
            	            					

            	            }

            	            otherlv_21=(Token)match(input,46,FOLLOW_16); 

            	            					newLeafNode(otherlv_21, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1());
            	            				
            	            // InternalKerMLExpressions.g:2726:5: ( (lv_ownedRelationship_22_0= ruleFeatureChainMember ) )
            	            // InternalKerMLExpressions.g:2727:6: (lv_ownedRelationship_22_0= ruleFeatureChainMember )
            	            {
            	            // InternalKerMLExpressions.g:2727:6: (lv_ownedRelationship_22_0= ruleFeatureChainMember )
            	            // InternalKerMLExpressions.g:2728:7: lv_ownedRelationship_22_0= ruleFeatureChainMember
            	            {

            	            							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFeatureChainMemberParserRuleCall_2_1_2_0());
            	            						
            	            pushFollow(FOLLOW_23);
            	            lv_ownedRelationship_22_0=ruleFeatureChainMember();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"ownedRelationship",
            	            								lv_ownedRelationship_22_0,
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
            	    break loop31;
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
    // InternalKerMLExpressions.g:2751:1: entryRuleFunctionReferenceExpression returns [EObject current=null] : iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF ;
    public final EObject entryRuleFunctionReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:2751:68: (iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF )
            // InternalKerMLExpressions.g:2752:2: iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF
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
    // InternalKerMLExpressions.g:2758:1: ruleFunctionReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleFunctionReferenceMember ) ) ;
    public final EObject ruleFunctionReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2764:2: ( ( (lv_ownedRelationship_0_0= ruleFunctionReferenceMember ) ) )
            // InternalKerMLExpressions.g:2765:2: ( (lv_ownedRelationship_0_0= ruleFunctionReferenceMember ) )
            {
            // InternalKerMLExpressions.g:2765:2: ( (lv_ownedRelationship_0_0= ruleFunctionReferenceMember ) )
            // InternalKerMLExpressions.g:2766:3: (lv_ownedRelationship_0_0= ruleFunctionReferenceMember )
            {
            // InternalKerMLExpressions.g:2766:3: (lv_ownedRelationship_0_0= ruleFunctionReferenceMember )
            // InternalKerMLExpressions.g:2767:4: lv_ownedRelationship_0_0= ruleFunctionReferenceMember
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
    // InternalKerMLExpressions.g:2787:1: entryRuleFunctionReferenceMember returns [EObject current=null] : iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF ;
    public final EObject entryRuleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:2787:64: (iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF )
            // InternalKerMLExpressions.g:2788:2: iv_ruleFunctionReferenceMember= ruleFunctionReferenceMember EOF
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
    // InternalKerMLExpressions.g:2794:1: ruleFunctionReferenceMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) ;
    public final EObject ruleFunctionReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2800:2: ( ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) ) )
            // InternalKerMLExpressions.g:2801:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            {
            // InternalKerMLExpressions.g:2801:2: ( (lv_ownedRelatedElement_0_0= ruleFunctionReference ) )
            // InternalKerMLExpressions.g:2802:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            {
            // InternalKerMLExpressions.g:2802:3: (lv_ownedRelatedElement_0_0= ruleFunctionReference )
            // InternalKerMLExpressions.g:2803:4: lv_ownedRelatedElement_0_0= ruleFunctionReference
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
    // InternalKerMLExpressions.g:2823:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // InternalKerMLExpressions.g:2823:58: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // InternalKerMLExpressions.g:2824:2: iv_ruleFunctionReference= ruleFunctionReference EOF
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
    // InternalKerMLExpressions.g:2830:1: ruleFunctionReference returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2836:2: ( ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) ) )
            // InternalKerMLExpressions.g:2837:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            {
            // InternalKerMLExpressions.g:2837:2: ( (lv_ownedRelationship_0_0= ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:2838:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:2838:3: (lv_ownedRelationship_0_0= ruleReferenceTyping )
            // InternalKerMLExpressions.g:2839:4: lv_ownedRelationship_0_0= ruleReferenceTyping
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
    // InternalKerMLExpressions.g:2859:1: entryRuleFeatureChainMember returns [EObject current=null] : iv_ruleFeatureChainMember= ruleFeatureChainMember EOF ;
    public final EObject entryRuleFeatureChainMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureChainMember = null;


        try {
            // InternalKerMLExpressions.g:2859:59: (iv_ruleFeatureChainMember= ruleFeatureChainMember EOF )
            // InternalKerMLExpressions.g:2860:2: iv_ruleFeatureChainMember= ruleFeatureChainMember EOF
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
    // InternalKerMLExpressions.g:2866:1: ruleFeatureChainMember returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) ) ;
    public final EObject ruleFeatureChainMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2872:2: ( ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) ) )
            // InternalKerMLExpressions.g:2873:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )
            {
            // InternalKerMLExpressions.g:2873:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalKerMLExpressions.g:2874:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalKerMLExpressions.g:2874:3: ( ( ruleQualifiedName ) )
                    // InternalKerMLExpressions.g:2875:4: ( ruleQualifiedName )
                    {
                    // InternalKerMLExpressions.g:2875:4: ( ruleQualifiedName )
                    // InternalKerMLExpressions.g:2876:5: ruleQualifiedName
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
                    // InternalKerMLExpressions.g:2891:3: ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) )
                    {
                    // InternalKerMLExpressions.g:2891:3: ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) )
                    // InternalKerMLExpressions.g:2892:4: () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) )
                    {
                    // InternalKerMLExpressions.g:2892:4: ()
                    // InternalKerMLExpressions.g:2893:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFeatureChainMemberAccess().getOwningMembershipAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKerMLExpressions.g:2899:4: ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) )
                    // InternalKerMLExpressions.g:2900:5: (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain )
                    {
                    // InternalKerMLExpressions.g:2900:5: (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain )
                    // InternalKerMLExpressions.g:2901:6: lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain
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
    // InternalKerMLExpressions.g:2923:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalKerMLExpressions.g:2923:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:2924:2: iv_ruleBaseExpression= ruleBaseExpression EOF
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
    // InternalKerMLExpressions.g:2930:1: ruleBaseExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_BodyExpression_4= ruleBodyExpression | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_NullExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_FeatureReferenceExpression_2 = null;

        EObject this_InvocationExpression_3 = null;

        EObject this_BodyExpression_4 = null;

        EObject this_SequenceExpression_6 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:2936:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_BodyExpression_4= ruleBodyExpression | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) ) )
            // InternalKerMLExpressions.g:2937:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_BodyExpression_4= ruleBodyExpression | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )
            {
            // InternalKerMLExpressions.g:2937:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_BodyExpression_4= ruleBodyExpression | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )
            int alt33=6;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalKerMLExpressions.g:2938:3: this_NullExpression_0= ruleNullExpression
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
                    // InternalKerMLExpressions.g:2947:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalKerMLExpressions.g:2956:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
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
                    // InternalKerMLExpressions.g:2965:3: this_InvocationExpression_3= ruleInvocationExpression
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
                    // InternalKerMLExpressions.g:2974:3: this_BodyExpression_4= ruleBodyExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getBodyExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BodyExpression_4=ruleBodyExpression();

                    state._fsp--;


                    			current = this_BodyExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKerMLExpressions.g:2983:3: (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' )
                    {
                    // InternalKerMLExpressions.g:2983:3: (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' )
                    // InternalKerMLExpressions.g:2984:4: otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_SequenceExpression_6=ruleSequenceExpression();

                    state._fsp--;


                    				current = this_SequenceExpression_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,52,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBodyExpression"
    // InternalKerMLExpressions.g:3005:1: entryRuleBodyExpression returns [EObject current=null] : iv_ruleBodyExpression= ruleBodyExpression EOF ;
    public final EObject entryRuleBodyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyExpression = null;


        try {
            // InternalKerMLExpressions.g:3005:55: (iv_ruleBodyExpression= ruleBodyExpression EOF )
            // InternalKerMLExpressions.g:3006:2: iv_ruleBodyExpression= ruleBodyExpression EOF
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
    // InternalKerMLExpressions.g:3012:1: ruleBodyExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleExpressionBodyMember ) ) ;
    public final EObject ruleBodyExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3018:2: ( ( (lv_ownedRelationship_0_0= ruleExpressionBodyMember ) ) )
            // InternalKerMLExpressions.g:3019:2: ( (lv_ownedRelationship_0_0= ruleExpressionBodyMember ) )
            {
            // InternalKerMLExpressions.g:3019:2: ( (lv_ownedRelationship_0_0= ruleExpressionBodyMember ) )
            // InternalKerMLExpressions.g:3020:3: (lv_ownedRelationship_0_0= ruleExpressionBodyMember )
            {
            // InternalKerMLExpressions.g:3020:3: (lv_ownedRelationship_0_0= ruleExpressionBodyMember )
            // InternalKerMLExpressions.g:3021:4: lv_ownedRelationship_0_0= ruleExpressionBodyMember
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
    // InternalKerMLExpressions.g:3041:1: entryRuleExpressionBodyMember returns [EObject current=null] : iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF ;
    public final EObject entryRuleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBodyMember = null;


        try {
            // InternalKerMLExpressions.g:3041:61: (iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF )
            // InternalKerMLExpressions.g:3042:2: iv_ruleExpressionBodyMember= ruleExpressionBodyMember EOF
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
    // InternalKerMLExpressions.g:3048:1: ruleExpressionBodyMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) ;
    public final EObject ruleExpressionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3054:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) ) )
            // InternalKerMLExpressions.g:3055:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            {
            // InternalKerMLExpressions.g:3055:2: ( (lv_ownedRelatedElement_0_0= ruleExpressionBody ) )
            // InternalKerMLExpressions.g:3056:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            {
            // InternalKerMLExpressions.g:3056:3: (lv_ownedRelatedElement_0_0= ruleExpressionBody )
            // InternalKerMLExpressions.g:3057:4: lv_ownedRelatedElement_0_0= ruleExpressionBody
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
    // InternalKerMLExpressions.g:3077:1: entryRuleExpressionBody returns [EObject current=null] : iv_ruleExpressionBody= ruleExpressionBody EOF ;
    public final EObject entryRuleExpressionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBody = null;


        try {
            // InternalKerMLExpressions.g:3077:55: (iv_ruleExpressionBody= ruleExpressionBody EOF )
            // InternalKerMLExpressions.g:3078:2: iv_ruleExpressionBody= ruleExpressionBody EOF
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
    // InternalKerMLExpressions.g:3084:1: ruleExpressionBody returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) ;
    public final EObject ruleExpressionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3090:2: ( (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' ) )
            // InternalKerMLExpressions.g:3091:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            {
            // InternalKerMLExpressions.g:3091:2: (otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}' )
            // InternalKerMLExpressions.g:3092:3: otherlv_0= '{' ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )* ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalKerMLExpressions.g:3096:3: ( ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==56) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3097:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) ) otherlv_2= ';'
            	    {
            	    // InternalKerMLExpressions.g:3097:4: ( (lv_ownedRelationship_1_0= ruleBodyParameterMember ) )
            	    // InternalKerMLExpressions.g:3098:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    {
            	    // InternalKerMLExpressions.g:3098:5: (lv_ownedRelationship_1_0= ruleBodyParameterMember )
            	    // InternalKerMLExpressions.g:3099:6: lv_ownedRelationship_1_0= ruleBodyParameterMember
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

            	    otherlv_2=(Token)match(input,54,FOLLOW_28); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionBodyAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalKerMLExpressions.g:3121:3: ( (lv_ownedRelationship_3_0= ruleResultExpressionMember ) )
            // InternalKerMLExpressions.g:3122:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            {
            // InternalKerMLExpressions.g:3122:4: (lv_ownedRelationship_3_0= ruleResultExpressionMember )
            // InternalKerMLExpressions.g:3123:5: lv_ownedRelationship_3_0= ruleResultExpressionMember
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

            otherlv_4=(Token)match(input,55,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3148:1: entryRuleResultExpressionMember returns [EObject current=null] : iv_ruleResultExpressionMember= ruleResultExpressionMember EOF ;
    public final EObject entryRuleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpressionMember = null;


        try {
            // InternalKerMLExpressions.g:3148:63: (iv_ruleResultExpressionMember= ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:3149:2: iv_ruleResultExpressionMember= ruleResultExpressionMember EOF
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
    // InternalKerMLExpressions.g:3155:1: ruleResultExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleResultExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3161:2: ( ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:3162:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:3162:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:3163:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:3163:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:3164:4: lv_ownedRelatedElement_0_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:3184:1: entryRuleBodyParameterMember returns [EObject current=null] : iv_ruleBodyParameterMember= ruleBodyParameterMember EOF ;
    public final EObject entryRuleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameterMember = null;


        try {
            // InternalKerMLExpressions.g:3184:60: (iv_ruleBodyParameterMember= ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:3185:2: iv_ruleBodyParameterMember= ruleBodyParameterMember EOF
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
    // InternalKerMLExpressions.g:3191:1: ruleBodyParameterMember returns [EObject current=null] : (otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) ) ) ;
    public final EObject ruleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedRelatedElement_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3197:2: ( (otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) ) ) )
            // InternalKerMLExpressions.g:3198:2: (otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) ) )
            {
            // InternalKerMLExpressions.g:3198:2: (otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) ) )
            // InternalKerMLExpressions.g:3199:3: otherlv_0= 'in' ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBodyParameterMemberAccess().getInKeyword_0());
            		
            // InternalKerMLExpressions.g:3203:3: ( (lv_ownedRelatedElement_1_0= ruleBodyParameter ) )
            // InternalKerMLExpressions.g:3204:4: (lv_ownedRelatedElement_1_0= ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:3204:4: (lv_ownedRelatedElement_1_0= ruleBodyParameter )
            // InternalKerMLExpressions.g:3205:5: lv_ownedRelatedElement_1_0= ruleBodyParameter
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
    // InternalKerMLExpressions.g:3226:1: entryRuleBodyParameter returns [EObject current=null] : iv_ruleBodyParameter= ruleBodyParameter EOF ;
    public final EObject entryRuleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameter = null;


        try {
            // InternalKerMLExpressions.g:3226:54: (iv_ruleBodyParameter= ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:3227:2: iv_ruleBodyParameter= ruleBodyParameter EOF
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
    // InternalKerMLExpressions.g:3233:1: ruleBodyParameter returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleBodyParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3239:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalKerMLExpressions.g:3240:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalKerMLExpressions.g:3240:2: ( (lv_name_0_0= ruleName ) )
            // InternalKerMLExpressions.g:3241:3: (lv_name_0_0= ruleName )
            {
            // InternalKerMLExpressions.g:3241:3: (lv_name_0_0= ruleName )
            // InternalKerMLExpressions.g:3242:4: lv_name_0_0= ruleName
            {

            				newCompositeNode(grammarAccess.getBodyParameterAccess().getNameNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBodyParameterRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
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
    // InternalKerMLExpressions.g:3262:1: entryRuleSequenceExpression returns [EObject current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final EObject entryRuleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLExpressions.g:3262:59: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:3263:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
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
    // InternalKerMLExpressions.g:3269:1: ruleSequenceExpression returns [EObject current=null] : (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) ;
    public final EObject ruleSequenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operator_3_0=null;
        EObject this_OwnedExpression_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3275:2: ( (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? ) )
            // InternalKerMLExpressions.g:3276:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            {
            // InternalKerMLExpressions.g:3276:2: (this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )? )
            // InternalKerMLExpressions.g:3277:3: this_OwnedExpression_0= ruleOwnedExpression (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            			current = this_OwnedExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLExpressions.g:3285:3: (otherlv_1= ',' | ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==57) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==EOF||LA35_1==48||LA35_1==52) ) {
                    alt35=1;
                }
                else if ( ((LA35_1>=RULE_STRING_VALUE && LA35_1<=RULE_UNRESTRICTED_NAME)||LA35_1==15||(LA35_1>=27 && LA35_1<=30)||(LA35_1>=36 && LA35_1<=38)||(LA35_1>=43 && LA35_1<=46)||LA35_1==51||LA35_1==53||(LA35_1>=59 && LA35_1<=61)) ) {
                    alt35=2;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalKerMLExpressions.g:3286:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:3291:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    {
                    // InternalKerMLExpressions.g:3291:4: ( () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) ) )
                    // InternalKerMLExpressions.g:3292:5: () ( (lv_operator_3_0= ',' ) ) ( (lv_operand_4_0= ruleSequenceExpression ) )
                    {
                    // InternalKerMLExpressions.g:3292:5: ()
                    // InternalKerMLExpressions.g:3293:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalKerMLExpressions.g:3299:5: ( (lv_operator_3_0= ',' ) )
                    // InternalKerMLExpressions.g:3300:6: (lv_operator_3_0= ',' )
                    {
                    // InternalKerMLExpressions.g:3300:6: (lv_operator_3_0= ',' )
                    // InternalKerMLExpressions.g:3301:7: lv_operator_3_0= ','
                    {
                    lv_operator_3_0=(Token)match(input,57,FOLLOW_4); 

                    							newLeafNode(lv_operator_3_0, grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSequenceExpressionRule());
                    							}
                    							setWithLastConsumed(current, "operator", lv_operator_3_0, ",");
                    						

                    }


                    }

                    // InternalKerMLExpressions.g:3313:5: ( (lv_operand_4_0= ruleSequenceExpression ) )
                    // InternalKerMLExpressions.g:3314:6: (lv_operand_4_0= ruleSequenceExpression )
                    {
                    // InternalKerMLExpressions.g:3314:6: (lv_operand_4_0= ruleSequenceExpression )
                    // InternalKerMLExpressions.g:3315:7: lv_operand_4_0= ruleSequenceExpression
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
    // InternalKerMLExpressions.g:3338:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLExpressions.g:3338:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:3339:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
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
    // InternalKerMLExpressions.g:3345:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3351:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) ) )
            // InternalKerMLExpressions.g:3352:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            {
            // InternalKerMLExpressions.g:3352:2: ( (lv_ownedRelationship_0_0= ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:3353:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:3353:3: (lv_ownedRelationship_0_0= ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:3354:4: lv_ownedRelationship_0_0= ruleFeatureReferenceMember
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
    // InternalKerMLExpressions.g:3374:1: entryRuleFeatureReferenceMember returns [EObject current=null] : iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF ;
    public final EObject entryRuleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceMember = null;


        try {
            // InternalKerMLExpressions.g:3374:63: (iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:3375:2: iv_ruleFeatureReferenceMember= ruleFeatureReferenceMember EOF
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
    // InternalKerMLExpressions.g:3381:1: ruleFeatureReferenceMember returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureReferenceMember() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3387:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:3388:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:3388:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:3389:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:3389:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:3390:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:3407:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLExpressions.g:3407:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:3408:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
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
    // InternalKerMLExpressions.g:3414:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;

        EObject this_ArgumentList_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3420:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] ) )
            // InternalKerMLExpressions.g:3421:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            {
            // InternalKerMLExpressions.g:3421:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current] )
            // InternalKerMLExpressions.g:3422:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) ) this_ArgumentList_1= ruleArgumentList[$current]
            {
            // InternalKerMLExpressions.g:3422:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:3423:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:3423:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:3424:5: lv_ownedRelationship_0_0= ruleOwnedFeatureTyping
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
    // InternalKerMLExpressions.g:3456:1: entryRuleOwnedFeatureTyping returns [EObject current=null] : iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF ;
    public final EObject entryRuleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureTyping = null;


        try {
            // InternalKerMLExpressions.g:3456:59: (iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:3457:2: iv_ruleOwnedFeatureTyping= ruleOwnedFeatureTyping EOF
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
    // InternalKerMLExpressions.g:3463:1: ruleOwnedFeatureTyping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) ) ;
    public final EObject ruleOwnedFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3469:2: ( ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) ) )
            // InternalKerMLExpressions.g:3470:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )
            {
            // InternalKerMLExpressions.g:3470:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalKerMLExpressions.g:3471:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalKerMLExpressions.g:3471:3: ( ( ruleQualifiedName ) )
                    // InternalKerMLExpressions.g:3472:4: ( ruleQualifiedName )
                    {
                    // InternalKerMLExpressions.g:3472:4: ( ruleQualifiedName )
                    // InternalKerMLExpressions.g:3473:5: ruleQualifiedName
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
                    // InternalKerMLExpressions.g:3488:3: ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) )
                    {
                    // InternalKerMLExpressions.g:3488:3: ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) )
                    // InternalKerMLExpressions.g:3489:4: (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain )
                    {
                    // InternalKerMLExpressions.g:3489:4: (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain )
                    // InternalKerMLExpressions.g:3490:5: lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain
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
    // InternalKerMLExpressions.g:3511:1: entryRuleOwnedFeatureChain returns [EObject current=null] : iv_ruleOwnedFeatureChain= ruleOwnedFeatureChain EOF ;
    public final EObject entryRuleOwnedFeatureChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureChain = null;


        try {
            // InternalKerMLExpressions.g:3511:58: (iv_ruleOwnedFeatureChain= ruleOwnedFeatureChain EOF )
            // InternalKerMLExpressions.g:3512:2: iv_ruleOwnedFeatureChain= ruleOwnedFeatureChain EOF
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
    // InternalKerMLExpressions.g:3518:1: ruleOwnedFeatureChain returns [EObject current=null] : this_FeatureChain_0= ruleFeatureChain[$current] ;
    public final EObject ruleOwnedFeatureChain() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureChain_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3524:2: (this_FeatureChain_0= ruleFeatureChain[$current] )
            // InternalKerMLExpressions.g:3525:2: this_FeatureChain_0= ruleFeatureChain[$current]
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
    // InternalKerMLExpressions.g:3540:1: ruleFeatureChain[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ ) ;
    public final EObject ruleFeatureChain(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3546:2: ( ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ ) )
            // InternalKerMLExpressions.g:3547:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ )
            {
            // InternalKerMLExpressions.g:3547:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+ )
            // InternalKerMLExpressions.g:3548:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+
            {
            // InternalKerMLExpressions.g:3548:3: ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) )
            // InternalKerMLExpressions.g:3549:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining )
            {
            // InternalKerMLExpressions.g:3549:4: (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining )
            // InternalKerMLExpressions.g:3550:5: lv_ownedRelationship_0_0= ruleOwnedFeatureChaining
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

            // InternalKerMLExpressions.g:3567:3: (otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46) ) {
                    int LA37_2 = input.LA(2);

                    if ( ((LA37_2>=RULE_ID && LA37_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3568:4: otherlv_1= '.' ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFeatureChainAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:3572:4: ( (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining ) )
            	    // InternalKerMLExpressions.g:3573:5: (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining )
            	    {
            	    // InternalKerMLExpressions.g:3573:5: (lv_ownedRelationship_2_0= ruleOwnedFeatureChaining )
            	    // InternalKerMLExpressions.g:3574:6: lv_ownedRelationship_2_0= ruleOwnedFeatureChaining
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // InternalKerMLExpressions.g:3596:1: entryRuleOwnedFeatureChaining returns [EObject current=null] : iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF ;
    public final EObject entryRuleOwnedFeatureChaining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedFeatureChaining = null;


        try {
            // InternalKerMLExpressions.g:3596:61: (iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF )
            // InternalKerMLExpressions.g:3597:2: iv_ruleOwnedFeatureChaining= ruleOwnedFeatureChaining EOF
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
    // InternalKerMLExpressions.g:3603:1: ruleOwnedFeatureChaining returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleOwnedFeatureChaining() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3609:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:3610:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:3610:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:3611:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:3611:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:3612:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:3630:1: ruleArgumentList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_PositionalArgumentList_1 = null;

        EObject this_NamedArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3636:2: ( (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' ) )
            // InternalKerMLExpressions.g:3637:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            {
            // InternalKerMLExpressions.g:3637:2: (otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')' )
            // InternalKerMLExpressions.g:3638:3: otherlv_0= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )? otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalKerMLExpressions.g:3642:3: (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )?
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalKerMLExpressions.g:3643:4: this_PositionalArgumentList_1= rulePositionalArgumentList[$current]
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
                    // InternalKerMLExpressions.g:3655:4: this_NamedArgumentList_2= ruleNamedArgumentList[$current]
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

            otherlv_3=(Token)match(input,52,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:3676:1: rulePositionalArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )* ) ;
    public final EObject rulePositionalArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3682:2: ( ( ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )* ) )
            // InternalKerMLExpressions.g:3683:2: ( ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )* )
            {
            // InternalKerMLExpressions.g:3683:2: ( ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )* )
            // InternalKerMLExpressions.g:3684:3: ( (lv_ownedRelationship_0_0= ruleArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )*
            {
            // InternalKerMLExpressions.g:3684:3: ( (lv_ownedRelationship_0_0= ruleArgumentMember ) )
            // InternalKerMLExpressions.g:3685:4: (lv_ownedRelationship_0_0= ruleArgumentMember )
            {
            // InternalKerMLExpressions.g:3685:4: (lv_ownedRelationship_0_0= ruleArgumentMember )
            // InternalKerMLExpressions.g:3686:5: lv_ownedRelationship_0_0= ruleArgumentMember
            {

            					newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipArgumentMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalKerMLExpressions.g:3703:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==57) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3704:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleArgumentMember ) )
            	    {
            	    otherlv_1=(Token)match(input,57,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:3708:4: ( (lv_ownedRelationship_2_0= ruleArgumentMember ) )
            	    // InternalKerMLExpressions.g:3709:5: (lv_ownedRelationship_2_0= ruleArgumentMember )
            	    {
            	    // InternalKerMLExpressions.g:3709:5: (lv_ownedRelationship_2_0= ruleArgumentMember )
            	    // InternalKerMLExpressions.g:3710:6: lv_ownedRelationship_2_0= ruleArgumentMember
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipArgumentMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "rulePositionalArgumentList"


    // $ANTLR start "entryRuleArgumentMember"
    // InternalKerMLExpressions.g:3732:1: entryRuleArgumentMember returns [EObject current=null] : iv_ruleArgumentMember= ruleArgumentMember EOF ;
    public final EObject entryRuleArgumentMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentMember = null;


        try {
            // InternalKerMLExpressions.g:3732:55: (iv_ruleArgumentMember= ruleArgumentMember EOF )
            // InternalKerMLExpressions.g:3733:2: iv_ruleArgumentMember= ruleArgumentMember EOF
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
    // InternalKerMLExpressions.g:3739:1: ruleArgumentMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleArgument ) ) ;
    public final EObject ruleArgumentMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3745:2: ( ( (lv_ownedRelatedElement_0_0= ruleArgument ) ) )
            // InternalKerMLExpressions.g:3746:2: ( (lv_ownedRelatedElement_0_0= ruleArgument ) )
            {
            // InternalKerMLExpressions.g:3746:2: ( (lv_ownedRelatedElement_0_0= ruleArgument ) )
            // InternalKerMLExpressions.g:3747:3: (lv_ownedRelatedElement_0_0= ruleArgument )
            {
            // InternalKerMLExpressions.g:3747:3: (lv_ownedRelatedElement_0_0= ruleArgument )
            // InternalKerMLExpressions.g:3748:4: lv_ownedRelatedElement_0_0= ruleArgument
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
    // InternalKerMLExpressions.g:3768:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalKerMLExpressions.g:3768:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalKerMLExpressions.g:3769:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalKerMLExpressions.g:3775:1: ruleArgument returns [EObject current=null] : ( (lv_ownedRelationship_0_0= ruleArgumentValue ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3781:2: ( ( (lv_ownedRelationship_0_0= ruleArgumentValue ) ) )
            // InternalKerMLExpressions.g:3782:2: ( (lv_ownedRelationship_0_0= ruleArgumentValue ) )
            {
            // InternalKerMLExpressions.g:3782:2: ( (lv_ownedRelationship_0_0= ruleArgumentValue ) )
            // InternalKerMLExpressions.g:3783:3: (lv_ownedRelationship_0_0= ruleArgumentValue )
            {
            // InternalKerMLExpressions.g:3783:3: (lv_ownedRelationship_0_0= ruleArgumentValue )
            // InternalKerMLExpressions.g:3784:4: lv_ownedRelationship_0_0= ruleArgumentValue
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
    // InternalKerMLExpressions.g:3805:1: ruleNamedArgumentList[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )* ) ;
    public final EObject ruleNamedArgumentList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3811:2: ( ( ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )* ) )
            // InternalKerMLExpressions.g:3812:2: ( ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )* )
            {
            // InternalKerMLExpressions.g:3812:2: ( ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )* )
            // InternalKerMLExpressions.g:3813:3: ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )*
            {
            // InternalKerMLExpressions.g:3813:3: ( (lv_ownedRelationship_0_0= ruleNamedArgumentMember ) )
            // InternalKerMLExpressions.g:3814:4: (lv_ownedRelationship_0_0= ruleNamedArgumentMember )
            {
            // InternalKerMLExpressions.g:3814:4: (lv_ownedRelationship_0_0= ruleNamedArgumentMember )
            // InternalKerMLExpressions.g:3815:5: lv_ownedRelationship_0_0= ruleNamedArgumentMember
            {

            					newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedArgumentMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalKerMLExpressions.g:3832:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==57) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3833:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) )
            	    {
            	    otherlv_1=(Token)match(input,57,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLExpressions.g:3837:4: ( (lv_ownedRelationship_2_0= ruleNamedArgumentMember ) )
            	    // InternalKerMLExpressions.g:3838:5: (lv_ownedRelationship_2_0= ruleNamedArgumentMember )
            	    {
            	    // InternalKerMLExpressions.g:3838:5: (lv_ownedRelationship_2_0= ruleNamedArgumentMember )
            	    // InternalKerMLExpressions.g:3839:6: lv_ownedRelationship_2_0= ruleNamedArgumentMember
            	    {

            	    						newCompositeNode(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedArgumentMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop40;
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
    // InternalKerMLExpressions.g:3861:1: entryRuleNamedArgumentMember returns [EObject current=null] : iv_ruleNamedArgumentMember= ruleNamedArgumentMember EOF ;
    public final EObject entryRuleNamedArgumentMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgumentMember = null;


        try {
            // InternalKerMLExpressions.g:3861:60: (iv_ruleNamedArgumentMember= ruleNamedArgumentMember EOF )
            // InternalKerMLExpressions.g:3862:2: iv_ruleNamedArgumentMember= ruleNamedArgumentMember EOF
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
    // InternalKerMLExpressions.g:3868:1: ruleNamedArgumentMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleNamedArgument ) ) ;
    public final EObject ruleNamedArgumentMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3874:2: ( ( (lv_ownedRelatedElement_0_0= ruleNamedArgument ) ) )
            // InternalKerMLExpressions.g:3875:2: ( (lv_ownedRelatedElement_0_0= ruleNamedArgument ) )
            {
            // InternalKerMLExpressions.g:3875:2: ( (lv_ownedRelatedElement_0_0= ruleNamedArgument ) )
            // InternalKerMLExpressions.g:3876:3: (lv_ownedRelatedElement_0_0= ruleNamedArgument )
            {
            // InternalKerMLExpressions.g:3876:3: (lv_ownedRelatedElement_0_0= ruleNamedArgument )
            // InternalKerMLExpressions.g:3877:4: lv_ownedRelatedElement_0_0= ruleNamedArgument
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
    // InternalKerMLExpressions.g:3897:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalKerMLExpressions.g:3897:54: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalKerMLExpressions.g:3898:2: iv_ruleNamedArgument= ruleNamedArgument EOF
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
    // InternalKerMLExpressions.g:3904:1: ruleNamedArgument returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:3910:2: ( ( ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) ) ) )
            // InternalKerMLExpressions.g:3911:2: ( ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) ) )
            {
            // InternalKerMLExpressions.g:3911:2: ( ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) ) )
            // InternalKerMLExpressions.g:3912:3: ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) ) otherlv_1= '=' ( (lv_ownedRelationship_2_0= ruleArgumentValue ) )
            {
            // InternalKerMLExpressions.g:3912:3: ( (lv_ownedRelationship_0_0= ruleParameterRedefinition ) )
            // InternalKerMLExpressions.g:3913:4: (lv_ownedRelationship_0_0= ruleParameterRedefinition )
            {
            // InternalKerMLExpressions.g:3913:4: (lv_ownedRelationship_0_0= ruleParameterRedefinition )
            // InternalKerMLExpressions.g:3914:5: lv_ownedRelationship_0_0= ruleParameterRedefinition
            {

            					newCompositeNode(grammarAccess.getNamedArgumentAccess().getOwnedRelationshipParameterRedefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_1=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalKerMLExpressions.g:3935:3: ( (lv_ownedRelationship_2_0= ruleArgumentValue ) )
            // InternalKerMLExpressions.g:3936:4: (lv_ownedRelationship_2_0= ruleArgumentValue )
            {
            // InternalKerMLExpressions.g:3936:4: (lv_ownedRelationship_2_0= ruleArgumentValue )
            // InternalKerMLExpressions.g:3937:5: lv_ownedRelationship_2_0= ruleArgumentValue
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
    // InternalKerMLExpressions.g:3958:1: entryRuleParameterRedefinition returns [EObject current=null] : iv_ruleParameterRedefinition= ruleParameterRedefinition EOF ;
    public final EObject entryRuleParameterRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRedefinition = null;


        try {
            // InternalKerMLExpressions.g:3958:62: (iv_ruleParameterRedefinition= ruleParameterRedefinition EOF )
            // InternalKerMLExpressions.g:3959:2: iv_ruleParameterRedefinition= ruleParameterRedefinition EOF
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
    // InternalKerMLExpressions.g:3965:1: ruleParameterRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleParameterRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:3971:2: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:3972:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:3972:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:3973:3: ( ruleQualifiedName )
            {
            // InternalKerMLExpressions.g:3973:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:3974:4: ruleQualifiedName
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
    // InternalKerMLExpressions.g:3991:1: entryRuleArgumentValue returns [EObject current=null] : iv_ruleArgumentValue= ruleArgumentValue EOF ;
    public final EObject entryRuleArgumentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentValue = null;


        try {
            // InternalKerMLExpressions.g:3991:54: (iv_ruleArgumentValue= ruleArgumentValue EOF )
            // InternalKerMLExpressions.g:3992:2: iv_ruleArgumentValue= ruleArgumentValue EOF
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
    // InternalKerMLExpressions.g:3998:1: ruleArgumentValue returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) ;
    public final EObject ruleArgumentValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4004:2: ( ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) ) )
            // InternalKerMLExpressions.g:4005:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            {
            // InternalKerMLExpressions.g:4005:2: ( (lv_ownedRelatedElement_0_0= ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:4006:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:4006:3: (lv_ownedRelatedElement_0_0= ruleOwnedExpression )
            // InternalKerMLExpressions.g:4007:4: lv_ownedRelatedElement_0_0= ruleOwnedExpression
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
    // InternalKerMLExpressions.g:4027:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalKerMLExpressions.g:4027:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLExpressions.g:4028:2: iv_ruleNullExpression= ruleNullExpression EOF
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
    // InternalKerMLExpressions.g:4034:1: ruleNullExpression returns [EObject current=null] : ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4040:2: ( ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) ) )
            // InternalKerMLExpressions.g:4041:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            {
            // InternalKerMLExpressions.g:4041:2: ( () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) ) )
            // InternalKerMLExpressions.g:4042:3: () (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            {
            // InternalKerMLExpressions.g:4042:3: ()
            // InternalKerMLExpressions.g:4043:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
            					current);
            			

            }

            // InternalKerMLExpressions.g:4049:3: (otherlv_1= 'null' | (otherlv_2= '(' otherlv_3= ')' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==59) ) {
                alt41=1;
            }
            else if ( (LA41_0==51) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalKerMLExpressions.g:4050:4: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4055:4: (otherlv_2= '(' otherlv_3= ')' )
                    {
                    // InternalKerMLExpressions.g:4055:4: (otherlv_2= '(' otherlv_3= ')' )
                    // InternalKerMLExpressions.g:4056:5: otherlv_2= '(' otherlv_3= ')'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_27); 

                    					newLeafNode(otherlv_2, grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,52,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:4070:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLExpressions.g:4070:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:4071:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalKerMLExpressions.g:4077:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralInteger_2 = null;

        EObject this_LiteralReal_3 = null;

        EObject this_LiteralInfinity_4 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4083:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) )
            // InternalKerMLExpressions.g:4084:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            {
            // InternalKerMLExpressions.g:4084:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 60:
            case 61:
                {
                alt42=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt42=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA42_3 = input.LA(2);

                if ( (LA42_3==46) ) {
                    int LA42_6 = input.LA(3);

                    if ( ((LA42_6>=RULE_ID && LA42_6<=RULE_UNRESTRICTED_NAME)||LA42_6==53) ) {
                        alt42=3;
                    }
                    else if ( ((LA42_6>=RULE_DECIMAL_VALUE && LA42_6<=RULE_EXP_VALUE)) ) {
                        alt42=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA42_3==EOF||LA42_3==14||(LA42_3>=16 && LA42_3<=42)||(LA42_3>=47 && LA42_3<=50)||LA42_3==52||LA42_3==55||LA42_3==57) ) {
                    alt42=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 46:
                {
                alt42=4;
                }
                break;
            case 38:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalKerMLExpressions.g:4085:3: this_LiteralBoolean_0= ruleLiteralBoolean
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
                    // InternalKerMLExpressions.g:4094:3: this_LiteralString_1= ruleLiteralString
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
                    // InternalKerMLExpressions.g:4103:3: this_LiteralInteger_2= ruleLiteralInteger
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
                    // InternalKerMLExpressions.g:4112:3: this_LiteralReal_3= ruleLiteralReal
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
                    // InternalKerMLExpressions.g:4121:3: this_LiteralInfinity_4= ruleLiteralInfinity
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
    // InternalKerMLExpressions.g:4133:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLExpressions.g:4133:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:4134:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
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
    // InternalKerMLExpressions.g:4140:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4146:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalKerMLExpressions.g:4147:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalKerMLExpressions.g:4147:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalKerMLExpressions.g:4148:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:4148:3: (lv_value_0_0= ruleBooleanValue )
            // InternalKerMLExpressions.g:4149:4: lv_value_0_0= ruleBooleanValue
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
    // InternalKerMLExpressions.g:4169:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLExpressions.g:4169:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:4170:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalKerMLExpressions.g:4176:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4182:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLExpressions.g:4183:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLExpressions.g:4183:2: (kw= 'true' | kw= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            else if ( (LA43_0==61) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalKerMLExpressions.g:4184:3: kw= 'true'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4190:3: kw= 'false'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:4199:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // InternalKerMLExpressions.g:4199:54: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLExpressions.g:4200:2: iv_ruleLiteralString= ruleLiteralString EOF
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
    // InternalKerMLExpressions.g:4206:1: ruleLiteralString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4212:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalKerMLExpressions.g:4213:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalKerMLExpressions.g:4213:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:4214:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:4214:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:4215:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalKerMLExpressions.g:4234:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLExpressions.g:4234:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:4235:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
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
    // InternalKerMLExpressions.g:4241:1: ruleLiteralInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4247:2: ( ( (lv_value_0_0= RULE_DECIMAL_VALUE ) ) )
            // InternalKerMLExpressions.g:4248:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            {
            // InternalKerMLExpressions.g:4248:2: ( (lv_value_0_0= RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:4249:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:4249:3: (lv_value_0_0= RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:4250:4: lv_value_0_0= RULE_DECIMAL_VALUE
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
    // InternalKerMLExpressions.g:4269:1: entryRuleLiteralReal returns [EObject current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final EObject entryRuleLiteralReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralReal = null;


        try {
            // InternalKerMLExpressions.g:4269:52: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:4270:2: iv_ruleLiteralReal= ruleLiteralReal EOF
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
    // InternalKerMLExpressions.g:4276:1: ruleLiteralReal returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleLiteralReal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4282:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalKerMLExpressions.g:4283:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalKerMLExpressions.g:4283:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalKerMLExpressions.g:4284:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalKerMLExpressions.g:4284:3: (lv_value_0_0= ruleRealValue )
            // InternalKerMLExpressions.g:4285:4: lv_value_0_0= ruleRealValue
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
    // InternalKerMLExpressions.g:4305:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLExpressions.g:4305:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLExpressions.g:4306:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalKerMLExpressions.g:4312:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4318:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLExpressions.g:4319:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLExpressions.g:4319:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DECIMAL_VALUE||LA46_0==46) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_EXP_VALUE) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalKerMLExpressions.g:4320:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLExpressions.g:4320:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLExpressions.g:4321:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:4321:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_DECIMAL_VALUE) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalKerMLExpressions.g:4322:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_32); 

                            					current.merge(this_DECIMAL_VALUE_0);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,46,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalKerMLExpressions.g:4335:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_DECIMAL_VALUE) ) {
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
                            // InternalKerMLExpressions.g:4336:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

                            					current.merge(this_DECIMAL_VALUE_2);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLExpressions.g:4344:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalKerMLExpressions.g:4354:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalKerMLExpressions.g:4365:1: entryRuleLiteralInfinity returns [EObject current=null] : iv_ruleLiteralInfinity= ruleLiteralInfinity EOF ;
    public final EObject entryRuleLiteralInfinity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInfinity = null;


        try {
            // InternalKerMLExpressions.g:4365:56: (iv_ruleLiteralInfinity= ruleLiteralInfinity EOF )
            // InternalKerMLExpressions.g:4366:2: iv_ruleLiteralInfinity= ruleLiteralInfinity EOF
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
    // InternalKerMLExpressions.g:4372:1: ruleLiteralInfinity returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleLiteralInfinity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4378:2: ( ( () otherlv_1= '*' ) )
            // InternalKerMLExpressions.g:4379:2: ( () otherlv_1= '*' )
            {
            // InternalKerMLExpressions.g:4379:2: ( () otherlv_1= '*' )
            // InternalKerMLExpressions.g:4380:3: () otherlv_1= '*'
            {
            // InternalKerMLExpressions.g:4380:3: ()
            // InternalKerMLExpressions.g:4381:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralInfinityAccess().getLiteralInfinityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:4395:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLExpressions.g:4395:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLExpressions.g:4396:2: iv_ruleName= ruleName EOF
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
    // InternalKerMLExpressions.g:4402:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLExpressions.g:4408:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLExpressions.g:4409:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLExpressions.g:4409:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_UNRESTRICTED_NAME) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalKerMLExpressions.g:4410:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:4418:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalKerMLExpressions.g:4429:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalKerMLExpressions.g:4429:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalKerMLExpressions.g:4430:2: iv_ruleQualification= ruleQualification EOF
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
    // InternalKerMLExpressions.g:4436:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4442:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalKerMLExpressions.g:4443:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalKerMLExpressions.g:4443:2: (this_Name_0= ruleName kw= '::' )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    int LA48_2 = input.LA(2);

                    if ( (LA48_2==62) ) {
                        alt48=1;
                    }


                }
                else if ( (LA48_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA48_3 = input.LA(2);

                    if ( (LA48_3==62) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4444:3: this_Name_0= ruleName kw= '::'
            	    {

            	    			newCompositeNode(grammarAccess.getQualificationAccess().getNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_37);
            	    this_Name_0=ruleName();

            	    state._fsp--;


            	    			current.merge(this_Name_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,62,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualificationAccess().getColonColonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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
    // InternalKerMLExpressions.g:4463:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLExpressions.g:4463:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:4464:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalKerMLExpressions.g:4470:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalKerMLExpressions.g:4476:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalKerMLExpressions.g:4477:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalKerMLExpressions.g:4477:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalKerMLExpressions.g:4478:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalKerMLExpressions.g:4478:3: (this_Qualification_0= ruleQualification )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==62) ) {
                    alt49=1;
                }
            }
            else if ( (LA49_0==RULE_UNRESTRICTED_NAME) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==62) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalKerMLExpressions.g:4479:4: this_Qualification_0= ruleQualification
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


    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\uffff\2\4\4\uffff";
    static final String dfa_3s = "\1\7\2\16\1\7\1\uffff\1\7\1\uffff";
    static final String dfa_4s = "\1\10\2\76\1\65\1\uffff\1\10\1\uffff";
    static final String dfa_5s = "\4\uffff\1\1\1\uffff\1\2";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2",
            "\1\4\1\uffff\33\4\3\uffff\1\3\4\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\4\uffff\1\5",
            "\1\4\1\uffff\33\4\3\uffff\1\3\4\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\4\uffff\1\5",
            "\2\6\54\uffff\1\4",
            "",
            "\1\1\1\2",
            ""
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
            return "2873:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )";
        }
    }
    static final String dfa_8s = "\23\uffff";
    static final String dfa_9s = "\4\uffff\2\12\6\uffff\2\12\2\uffff\2\12\1\uffff";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\uffff\2\16\2\uffff\2\7\2\uffff\2\16\2\7\2\16\1\7";
    static final String dfa_11s = "\1\75\1\uffff\1\75\1\uffff\2\76\2\uffff\1\10\1\65\2\uffff\2\76\1\65\1\10\2\76\1\10";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\5\1\6\2\uffff\1\3\1\4\7\uffff";
    static final String dfa_13s = "\23\uffff}>";
    static final String[] dfa_14s = {
            "\3\3\1\4\1\5\35\uffff\1\3\7\uffff\1\3\4\uffff\1\2\1\uffff\1\6\5\uffff\1\1\2\3",
            "",
            "\5\7\6\uffff\1\7\13\uffff\4\7\5\uffff\3\7\4\uffff\4\7\4\uffff\1\7\1\1\1\7\5\uffff\3\7",
            "",
            "\1\12\1\uffff\33\12\3\uffff\1\11\4\12\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\10",
            "\1\12\1\uffff\33\12\3\uffff\1\11\4\12\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\10",
            "",
            "",
            "\1\4\1\5",
            "\1\14\1\15\54\uffff\1\12",
            "",
            "",
            "\1\12\1\uffff\33\12\3\uffff\1\16\4\12\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\17",
            "\1\12\1\uffff\33\12\3\uffff\1\16\4\12\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\17",
            "\1\20\1\21\54\uffff\1\12",
            "\1\14\1\15",
            "\1\12\1\uffff\33\12\3\uffff\1\16\4\12\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\22",
            "\1\12\1\uffff\33\12\3\uffff\1\16\4\12\1\13\1\12\2\uffff\1\12\1\uffff\1\12\4\uffff\1\22",
            "\1\20\1\21"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2937:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InvocationExpression_3= ruleInvocationExpression | this_BodyExpression_4= ruleBodyExpression | (otherlv_5= '(' this_SequenceExpression_6= ruleSequenceExpression otherlv_7= ')' ) )";
        }
    }
    static final String dfa_15s = "\6\uffff";
    static final String dfa_16s = "\1\uffff\2\3\3\uffff";
    static final String dfa_17s = "\1\7\2\56\1\uffff\1\7\1\uffff";
    static final String dfa_18s = "\1\10\2\76\1\uffff\1\10\1\uffff";
    static final String dfa_19s = "\3\uffff\1\1\1\uffff\1\2";
    static final String dfa_20s = "\6\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\1\2",
            "\1\5\4\uffff\1\3\12\uffff\1\4",
            "\1\5\4\uffff\1\3\12\uffff\1\4",
            "",
            "\1\1\1\2",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "3470:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )";
        }
    }
    static final String dfa_22s = "\1\4\1\uffff\2\21\1\uffff\1\7\1\uffff";
    static final String dfa_23s = "\1\75\1\uffff\2\76\1\uffff\1\10\1\uffff";
    static final String dfa_24s = "\1\uffff\1\1\2\uffff\1\3\1\uffff\1\2";
    static final String[] dfa_25s = {
            "\3\1\1\2\1\3\6\uffff\1\1\13\uffff\4\1\5\uffff\3\1\4\uffff\4\1\4\uffff\1\1\1\4\1\1\5\uffff\3\1",
            "",
            "\32\1\3\uffff\2\1\1\uffff\4\1\4\uffff\1\1\1\6\3\uffff\1\5",
            "\32\1\3\uffff\2\1\1\uffff\4\1\4\uffff\1\1\1\6\3\uffff\1\5",
            "",
            "\1\2\1\3",
            ""
    };
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_6;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "3642:3: (this_PositionalArgumentList_1= rulePositionalArgumentList[$current] | this_NamedArgumentList_2= ruleNamedArgumentList[$current] )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x38287870000081F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x38287870000001F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0006C00000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0028000000000180L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x39287870000081F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x38387870000081F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000182L});

}