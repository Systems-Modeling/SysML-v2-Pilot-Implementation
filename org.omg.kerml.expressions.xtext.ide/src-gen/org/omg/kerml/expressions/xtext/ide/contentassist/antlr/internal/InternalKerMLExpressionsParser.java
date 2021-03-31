package org.omg.kerml.expressions.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.omg.kerml.expressions.xtext.services.KerMLExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKerMLExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXP_VALUE", "RULE_DECIMAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STRING_VALUE", "RULE_REGULAR_COMMENT", "RULE_DOCUMENTATION_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'?'", "'??'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'**'", "'=='", "'!='", "'instanceof'", "'hastype'", "'istype'", "'@'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'true'", "'false'", "':'", "']'", "'->'", "'.'", "'('", "')'", "'{'", "'}'", "','", "'=>'", "'null'", "'::'", "'@['", "'all'", "'['", "'..'"
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
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=10;
    public static final int T__54=54;
    public static final int RULE_ID=6;
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
    public static final int RULE_UNRESTRICTED_NAME=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=8;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_EXP_VALUE=4;
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

    	public void setGrammarAccess(KerMLExpressionsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleOwnedExpressionMember"
    // InternalKerMLExpressions.g:54:1: entryRuleOwnedExpressionMember : ruleOwnedExpressionMember EOF ;
    public final void entryRuleOwnedExpressionMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:55:1: ( ruleOwnedExpressionMember EOF )
            // InternalKerMLExpressions.g:56:1: ruleOwnedExpressionMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedExpressionMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOwnedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedExpressionMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOwnedExpressionMember"


    // $ANTLR start "ruleOwnedExpressionMember"
    // InternalKerMLExpressions.g:63:1: ruleOwnedExpressionMember : ( ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleOwnedExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:67:2: ( ( ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:68:2: ( ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:68:2: ( ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:69:3: ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementAssignment()); 
            }
            // InternalKerMLExpressions.g:70:3: ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:70:4: rule__OwnedExpressionMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OwnedExpressionMember__OwnedRelatedElementAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedExpressionMember"


    // $ANTLR start "entryRuleOwnedExpression"
    // InternalKerMLExpressions.g:79:1: entryRuleOwnedExpression : ruleOwnedExpression EOF ;
    public final void entryRuleOwnedExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:80:1: ( ruleOwnedExpression EOF )
            // InternalKerMLExpressions.g:81:1: ruleOwnedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOwnedExpression"


    // $ANTLR start "ruleOwnedExpression"
    // InternalKerMLExpressions.g:88:1: ruleOwnedExpression : ( ruleConditionalExpression ) ;
    public final void ruleOwnedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:92:2: ( ( ruleConditionalExpression ) )
            // InternalKerMLExpressions.g:93:2: ( ruleConditionalExpression )
            {
            // InternalKerMLExpressions.g:93:2: ( ruleConditionalExpression )
            // InternalKerMLExpressions.g:94:3: ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedExpressionAccess().getConditionalExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedExpressionAccess().getConditionalExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalKerMLExpressions.g:104:1: entryRuleConditionalExpression : ruleConditionalExpression EOF ;
    public final void entryRuleConditionalExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:105:1: ( ruleConditionalExpression EOF )
            // InternalKerMLExpressions.g:106:1: ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalKerMLExpressions.g:113:1: ruleConditionalExpression : ( ( rule__ConditionalExpression__Group__0 ) ) ;
    public final void ruleConditionalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:117:2: ( ( ( rule__ConditionalExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:118:2: ( ( rule__ConditionalExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:118:2: ( ( rule__ConditionalExpression__Group__0 ) )
            // InternalKerMLExpressions.g:119:3: ( rule__ConditionalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:120:3: ( rule__ConditionalExpression__Group__0 )
            // InternalKerMLExpressions.g:120:4: rule__ConditionalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleConditionalTestOperator"
    // InternalKerMLExpressions.g:129:1: entryRuleConditionalTestOperator : ruleConditionalTestOperator EOF ;
    public final void entryRuleConditionalTestOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:130:1: ( ruleConditionalTestOperator EOF )
            // InternalKerMLExpressions.g:131:1: ruleConditionalTestOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalTestOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionalTestOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalTestOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalTestOperator"


    // $ANTLR start "ruleConditionalTestOperator"
    // InternalKerMLExpressions.g:138:1: ruleConditionalTestOperator : ( '?' ) ;
    public final void ruleConditionalTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:142:2: ( ( '?' ) )
            // InternalKerMLExpressions.g:143:2: ( '?' )
            {
            // InternalKerMLExpressions.g:143:2: ( '?' )
            // InternalKerMLExpressions.g:144:3: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalTestOperatorAccess().getQuestionMarkKeyword()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalTestOperatorAccess().getQuestionMarkKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalTestOperator"


    // $ANTLR start "entryRuleNullCoalescingExpression"
    // InternalKerMLExpressions.g:154:1: entryRuleNullCoalescingExpression : ruleNullCoalescingExpression EOF ;
    public final void entryRuleNullCoalescingExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:155:1: ( ruleNullCoalescingExpression EOF )
            // InternalKerMLExpressions.g:156:1: ruleNullCoalescingExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNullCoalescingExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullCoalescingExpression"


    // $ANTLR start "ruleNullCoalescingExpression"
    // InternalKerMLExpressions.g:163:1: ruleNullCoalescingExpression : ( ( rule__NullCoalescingExpression__Group__0 ) ) ;
    public final void ruleNullCoalescingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:167:2: ( ( ( rule__NullCoalescingExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:168:2: ( ( rule__NullCoalescingExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:168:2: ( ( rule__NullCoalescingExpression__Group__0 ) )
            // InternalKerMLExpressions.g:169:3: ( rule__NullCoalescingExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:170:3: ( rule__NullCoalescingExpression__Group__0 )
            // InternalKerMLExpressions.g:170:4: rule__NullCoalescingExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullCoalescingExpression"


    // $ANTLR start "entryRuleNullCoalescingOperator"
    // InternalKerMLExpressions.g:179:1: entryRuleNullCoalescingOperator : ruleNullCoalescingOperator EOF ;
    public final void entryRuleNullCoalescingOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:180:1: ( ruleNullCoalescingOperator EOF )
            // InternalKerMLExpressions.g:181:1: ruleNullCoalescingOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNullCoalescingOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullCoalescingOperator"


    // $ANTLR start "ruleNullCoalescingOperator"
    // InternalKerMLExpressions.g:188:1: ruleNullCoalescingOperator : ( '??' ) ;
    public final void ruleNullCoalescingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:192:2: ( ( '??' ) )
            // InternalKerMLExpressions.g:193:2: ( '??' )
            {
            // InternalKerMLExpressions.g:193:2: ( '??' )
            // InternalKerMLExpressions.g:194:3: '??'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingOperatorAccess().getQuestionMarkQuestionMarkKeyword()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingOperatorAccess().getQuestionMarkQuestionMarkKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullCoalescingOperator"


    // $ANTLR start "entryRuleConditionalOrExpression"
    // InternalKerMLExpressions.g:204:1: entryRuleConditionalOrExpression : ruleConditionalOrExpression EOF ;
    public final void entryRuleConditionalOrExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:205:1: ( ruleConditionalOrExpression EOF )
            // InternalKerMLExpressions.g:206:1: ruleConditionalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalOrExpression"


    // $ANTLR start "ruleConditionalOrExpression"
    // InternalKerMLExpressions.g:213:1: ruleConditionalOrExpression : ( ( rule__ConditionalOrExpression__Group__0 ) ) ;
    public final void ruleConditionalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:217:2: ( ( ( rule__ConditionalOrExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:218:2: ( ( rule__ConditionalOrExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:218:2: ( ( rule__ConditionalOrExpression__Group__0 ) )
            // InternalKerMLExpressions.g:219:3: ( rule__ConditionalOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:220:3: ( rule__ConditionalOrExpression__Group__0 )
            // InternalKerMLExpressions.g:220:4: rule__ConditionalOrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalOrExpression"


    // $ANTLR start "entryRuleConditionalOrOperator"
    // InternalKerMLExpressions.g:229:1: entryRuleConditionalOrOperator : ruleConditionalOrOperator EOF ;
    public final void entryRuleConditionalOrOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:230:1: ( ruleConditionalOrOperator EOF )
            // InternalKerMLExpressions.g:231:1: ruleConditionalOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionalOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalOrOperator"


    // $ANTLR start "ruleConditionalOrOperator"
    // InternalKerMLExpressions.g:238:1: ruleConditionalOrOperator : ( '||' ) ;
    public final void ruleConditionalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:242:2: ( ( '||' ) )
            // InternalKerMLExpressions.g:243:2: ( '||' )
            {
            // InternalKerMLExpressions.g:243:2: ( '||' )
            // InternalKerMLExpressions.g:244:3: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrOperatorAccess().getVerticalLineVerticalLineKeyword()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrOperatorAccess().getVerticalLineVerticalLineKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalOrOperator"


    // $ANTLR start "entryRuleConditionalAndExpression"
    // InternalKerMLExpressions.g:254:1: entryRuleConditionalAndExpression : ruleConditionalAndExpression EOF ;
    public final void entryRuleConditionalAndExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:255:1: ( ruleConditionalAndExpression EOF )
            // InternalKerMLExpressions.g:256:1: ruleConditionalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalAndExpression"


    // $ANTLR start "ruleConditionalAndExpression"
    // InternalKerMLExpressions.g:263:1: ruleConditionalAndExpression : ( ( rule__ConditionalAndExpression__Group__0 ) ) ;
    public final void ruleConditionalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:267:2: ( ( ( rule__ConditionalAndExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:268:2: ( ( rule__ConditionalAndExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:268:2: ( ( rule__ConditionalAndExpression__Group__0 ) )
            // InternalKerMLExpressions.g:269:3: ( rule__ConditionalAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:270:3: ( rule__ConditionalAndExpression__Group__0 )
            // InternalKerMLExpressions.g:270:4: rule__ConditionalAndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalAndExpression"


    // $ANTLR start "entryRuleConditionalAndOperator"
    // InternalKerMLExpressions.g:279:1: entryRuleConditionalAndOperator : ruleConditionalAndOperator EOF ;
    public final void entryRuleConditionalAndOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:280:1: ( ruleConditionalAndOperator EOF )
            // InternalKerMLExpressions.g:281:1: ruleConditionalAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionalAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalAndOperator"


    // $ANTLR start "ruleConditionalAndOperator"
    // InternalKerMLExpressions.g:288:1: ruleConditionalAndOperator : ( '&&' ) ;
    public final void ruleConditionalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:292:2: ( ( '&&' ) )
            // InternalKerMLExpressions.g:293:2: ( '&&' )
            {
            // InternalKerMLExpressions.g:293:2: ( '&&' )
            // InternalKerMLExpressions.g:294:3: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndOperatorAccess().getAmpersandAmpersandKeyword()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndOperatorAccess().getAmpersandAmpersandKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalAndOperator"


    // $ANTLR start "entryRuleOrExpression"
    // InternalKerMLExpressions.g:304:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:305:1: ( ruleOrExpression EOF )
            // InternalKerMLExpressions.g:306:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalKerMLExpressions.g:313:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:317:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:318:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:318:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalKerMLExpressions.g:319:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:320:3: ( rule__OrExpression__Group__0 )
            // InternalKerMLExpressions.g:320:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrOperator"
    // InternalKerMLExpressions.g:329:1: entryRuleOrOperator : ruleOrOperator EOF ;
    public final void entryRuleOrOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:330:1: ( ruleOrOperator EOF )
            // InternalKerMLExpressions.g:331:1: ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalKerMLExpressions.g:338:1: ruleOrOperator : ( '|' ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:342:2: ( ( '|' ) )
            // InternalKerMLExpressions.g:343:2: ( '|' )
            {
            // InternalKerMLExpressions.g:343:2: ( '|' )
            // InternalKerMLExpressions.g:344:3: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getVerticalLineKeyword()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrOperatorAccess().getVerticalLineKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleXorExpression"
    // InternalKerMLExpressions.g:354:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:355:1: ( ruleXorExpression EOF )
            // InternalKerMLExpressions.g:356:1: ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalKerMLExpressions.g:363:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:367:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:368:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:368:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalKerMLExpressions.g:369:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:370:3: ( rule__XorExpression__Group__0 )
            // InternalKerMLExpressions.g:370:4: rule__XorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXorOperator"
    // InternalKerMLExpressions.g:379:1: entryRuleXorOperator : ruleXorOperator EOF ;
    public final void entryRuleXorOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:380:1: ( ruleXorOperator EOF )
            // InternalKerMLExpressions.g:381:1: ruleXorOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXorOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXorOperator"


    // $ANTLR start "ruleXorOperator"
    // InternalKerMLExpressions.g:388:1: ruleXorOperator : ( '^' ) ;
    public final void ruleXorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:392:2: ( ( '^' ) )
            // InternalKerMLExpressions.g:393:2: ( '^' )
            {
            // InternalKerMLExpressions.g:393:2: ( '^' )
            // InternalKerMLExpressions.g:394:3: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorOperatorAccess().getCircumflexAccentKeyword()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorOperatorAccess().getCircumflexAccentKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXorOperator"


    // $ANTLR start "entryRuleAndExpression"
    // InternalKerMLExpressions.g:404:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:405:1: ( ruleAndExpression EOF )
            // InternalKerMLExpressions.g:406:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalKerMLExpressions.g:413:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:417:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:418:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:418:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalKerMLExpressions.g:419:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:420:3: ( rule__AndExpression__Group__0 )
            // InternalKerMLExpressions.g:420:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperator"
    // InternalKerMLExpressions.g:429:1: entryRuleAndOperator : ruleAndOperator EOF ;
    public final void entryRuleAndOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:430:1: ( ruleAndOperator EOF )
            // InternalKerMLExpressions.g:431:1: ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalKerMLExpressions.g:438:1: ruleAndOperator : ( '&' ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:442:2: ( ( '&' ) )
            // InternalKerMLExpressions.g:443:2: ( '&' )
            {
            // InternalKerMLExpressions.g:443:2: ( '&' )
            // InternalKerMLExpressions.g:444:3: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getAmpersandKeyword()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndOperatorAccess().getAmpersandKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalKerMLExpressions.g:454:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:455:1: ( ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:456:1: ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalKerMLExpressions.g:463:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:467:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:468:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:468:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalKerMLExpressions.g:469:3: ( rule__EqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:470:3: ( rule__EqualityExpression__Group__0 )
            // InternalKerMLExpressions.g:470:4: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleEqualityOperator"
    // InternalKerMLExpressions.g:479:1: entryRuleEqualityOperator : ruleEqualityOperator EOF ;
    public final void entryRuleEqualityOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:480:1: ( ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:481:1: ruleEqualityOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqualityOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalKerMLExpressions.g:488:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:492:2: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:493:2: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:493:2: ( ( rule__EqualityOperator__Alternatives ) )
            // InternalKerMLExpressions.g:494:3: ( rule__EqualityOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:495:3: ( rule__EqualityOperator__Alternatives )
            // InternalKerMLExpressions.g:495:4: rule__EqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleClassificationExpression"
    // InternalKerMLExpressions.g:504:1: entryRuleClassificationExpression : ruleClassificationExpression EOF ;
    public final void entryRuleClassificationExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:505:1: ( ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:506:1: ruleClassificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassificationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassificationExpression"


    // $ANTLR start "ruleClassificationExpression"
    // InternalKerMLExpressions.g:513:1: ruleClassificationExpression : ( ( rule__ClassificationExpression__Alternatives ) ) ;
    public final void ruleClassificationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:517:2: ( ( ( rule__ClassificationExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:518:2: ( ( rule__ClassificationExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:518:2: ( ( rule__ClassificationExpression__Alternatives ) )
            // InternalKerMLExpressions.g:519:3: ( rule__ClassificationExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:520:3: ( rule__ClassificationExpression__Alternatives )
            // InternalKerMLExpressions.g:520:4: rule__ClassificationExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassificationExpression"


    // $ANTLR start "entryRuleClassificationOperator"
    // InternalKerMLExpressions.g:529:1: entryRuleClassificationOperator : ruleClassificationOperator EOF ;
    public final void entryRuleClassificationOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:530:1: ( ruleClassificationOperator EOF )
            // InternalKerMLExpressions.g:531:1: ruleClassificationOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassificationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassificationOperator"


    // $ANTLR start "ruleClassificationOperator"
    // InternalKerMLExpressions.g:538:1: ruleClassificationOperator : ( ( rule__ClassificationOperator__Alternatives ) ) ;
    public final void ruleClassificationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:542:2: ( ( ( rule__ClassificationOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:543:2: ( ( rule__ClassificationOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:543:2: ( ( rule__ClassificationOperator__Alternatives ) )
            // InternalKerMLExpressions.g:544:3: ( rule__ClassificationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationOperatorAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:545:3: ( rule__ClassificationOperator__Alternatives )
            // InternalKerMLExpressions.g:545:4: rule__ClassificationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassificationOperator"


    // $ANTLR start "entryRuleTypeReferenceMember"
    // InternalKerMLExpressions.g:554:1: entryRuleTypeReferenceMember : ruleTypeReferenceMember EOF ;
    public final void entryRuleTypeReferenceMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:555:1: ( ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:556:1: ruleTypeReferenceMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReferenceMember"


    // $ANTLR start "ruleTypeReferenceMember"
    // InternalKerMLExpressions.g:563:1: ruleTypeReferenceMember : ( ( rule__TypeReferenceMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleTypeReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:567:2: ( ( ( rule__TypeReferenceMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:568:2: ( ( rule__TypeReferenceMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:568:2: ( ( rule__TypeReferenceMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:569:3: ( rule__TypeReferenceMember__OwnedRelatedElementAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementAssignment()); 
            }
            // InternalKerMLExpressions.g:570:3: ( rule__TypeReferenceMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:570:4: rule__TypeReferenceMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReferenceMember__OwnedRelatedElementAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReferenceMember"


    // $ANTLR start "entryRuleTypeReference"
    // InternalKerMLExpressions.g:579:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:580:1: ( ruleTypeReference EOF )
            // InternalKerMLExpressions.g:581:1: ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalKerMLExpressions.g:588:1: ruleTypeReference : ( ( rule__TypeReference__OwnedRelationshipAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:592:2: ( ( ( rule__TypeReference__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:593:2: ( ( rule__TypeReference__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:593:2: ( ( rule__TypeReference__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:594:3: ( rule__TypeReference__OwnedRelationshipAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipAssignment()); 
            }
            // InternalKerMLExpressions.g:595:3: ( rule__TypeReference__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:595:4: rule__TypeReference__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__OwnedRelationshipAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleOwnedFeatureTyping"
    // InternalKerMLExpressions.g:604:1: entryRuleOwnedFeatureTyping : ruleOwnedFeatureTyping EOF ;
    public final void entryRuleOwnedFeatureTyping() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:605:1: ( ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:606:1: ruleOwnedFeatureTyping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedFeatureTypingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedFeatureTypingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOwnedFeatureTyping"


    // $ANTLR start "ruleOwnedFeatureTyping"
    // InternalKerMLExpressions.g:613:1: ruleOwnedFeatureTyping : ( ( rule__OwnedFeatureTyping__TypeAssignment ) ) ;
    public final void ruleOwnedFeatureTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:617:2: ( ( ( rule__OwnedFeatureTyping__TypeAssignment ) ) )
            // InternalKerMLExpressions.g:618:2: ( ( rule__OwnedFeatureTyping__TypeAssignment ) )
            {
            // InternalKerMLExpressions.g:618:2: ( ( rule__OwnedFeatureTyping__TypeAssignment ) )
            // InternalKerMLExpressions.g:619:3: ( rule__OwnedFeatureTyping__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedFeatureTypingAccess().getTypeAssignment()); 
            }
            // InternalKerMLExpressions.g:620:3: ( rule__OwnedFeatureTyping__TypeAssignment )
            // InternalKerMLExpressions.g:620:4: rule__OwnedFeatureTyping__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OwnedFeatureTyping__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedFeatureTypingAccess().getTypeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedFeatureTyping"


    // $ANTLR start "entryRuleSelfReferenceExpression"
    // InternalKerMLExpressions.g:629:1: entryRuleSelfReferenceExpression : ruleSelfReferenceExpression EOF ;
    public final void entryRuleSelfReferenceExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:630:1: ( ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:631:1: ruleSelfReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelfReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelfReferenceExpression"


    // $ANTLR start "ruleSelfReferenceExpression"
    // InternalKerMLExpressions.g:638:1: ruleSelfReferenceExpression : ( ( rule__SelfReferenceExpression__OwnedRelationshipAssignment ) ) ;
    public final void ruleSelfReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:642:2: ( ( ( rule__SelfReferenceExpression__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:643:2: ( ( rule__SelfReferenceExpression__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:643:2: ( ( rule__SelfReferenceExpression__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:644:3: ( rule__SelfReferenceExpression__OwnedRelationshipAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipAssignment()); 
            }
            // InternalKerMLExpressions.g:645:3: ( rule__SelfReferenceExpression__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:645:4: rule__SelfReferenceExpression__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SelfReferenceExpression__OwnedRelationshipAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfReferenceExpression"


    // $ANTLR start "entryRuleSelfReferenceMember"
    // InternalKerMLExpressions.g:654:1: entryRuleSelfReferenceMember : ruleSelfReferenceMember EOF ;
    public final void entryRuleSelfReferenceMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:655:1: ( ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:656:1: ruleSelfReferenceMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelfReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelfReferenceMember"


    // $ANTLR start "ruleSelfReferenceMember"
    // InternalKerMLExpressions.g:663:1: ruleSelfReferenceMember : ( ( rule__SelfReferenceMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleSelfReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:667:2: ( ( ( rule__SelfReferenceMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:668:2: ( ( rule__SelfReferenceMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:668:2: ( ( rule__SelfReferenceMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:669:3: ( rule__SelfReferenceMember__OwnedRelatedElementAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementAssignment()); 
            }
            // InternalKerMLExpressions.g:670:3: ( rule__SelfReferenceMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:670:4: rule__SelfReferenceMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SelfReferenceMember__OwnedRelatedElementAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfReferenceMember"


    // $ANTLR start "entryRuleEmptyFeature"
    // InternalKerMLExpressions.g:679:1: entryRuleEmptyFeature : ruleEmptyFeature EOF ;
    public final void entryRuleEmptyFeature() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:680:1: ( ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:681:1: ruleEmptyFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEmptyFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyFeatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmptyFeature"


    // $ANTLR start "ruleEmptyFeature"
    // InternalKerMLExpressions.g:688:1: ruleEmptyFeature : ( () ) ;
    public final void ruleEmptyFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:692:2: ( ( () ) )
            // InternalKerMLExpressions.g:693:2: ( () )
            {
            // InternalKerMLExpressions.g:693:2: ( () )
            // InternalKerMLExpressions.g:694:3: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyFeatureAccess().getFeatureAction()); 
            }
            // InternalKerMLExpressions.g:695:3: ()
            // InternalKerMLExpressions.g:695:4: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyFeatureAccess().getFeatureAction()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyFeature"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalKerMLExpressions.g:704:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:705:1: ( ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:706:1: ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalKerMLExpressions.g:713:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:717:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:718:2: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:718:2: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalKerMLExpressions.g:719:3: ( rule__RelationalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:720:3: ( rule__RelationalExpression__Group__0 )
            // InternalKerMLExpressions.g:720:4: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalKerMLExpressions.g:729:1: entryRuleRelationalOperator : ruleRelationalOperator EOF ;
    public final void entryRuleRelationalOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:730:1: ( ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:731:1: ruleRelationalOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalKerMLExpressions.g:738:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:742:2: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:743:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:743:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalKerMLExpressions.g:744:3: ( rule__RelationalOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:745:3: ( rule__RelationalOperator__Alternatives )
            // InternalKerMLExpressions.g:745:4: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalKerMLExpressions.g:754:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:755:1: ( ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:756:1: ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalKerMLExpressions.g:763:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:767:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:768:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:768:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalKerMLExpressions.g:769:3: ( rule__AdditiveExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:770:3: ( rule__AdditiveExpression__Group__0 )
            // InternalKerMLExpressions.g:770:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveOperator"
    // InternalKerMLExpressions.g:779:1: entryRuleAdditiveOperator : ruleAdditiveOperator EOF ;
    public final void entryRuleAdditiveOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:780:1: ( ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:781:1: ruleAdditiveOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdditiveOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditiveOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalKerMLExpressions.g:788:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:792:2: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:793:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:793:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalKerMLExpressions.g:794:3: ( rule__AdditiveOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:795:3: ( rule__AdditiveOperator__Alternatives )
            // InternalKerMLExpressions.g:795:4: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalKerMLExpressions.g:804:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:805:1: ( ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:806:1: ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalKerMLExpressions.g:813:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:817:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:818:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:818:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalKerMLExpressions.g:819:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:820:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalKerMLExpressions.g:820:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalKerMLExpressions.g:829:1: entryRuleMultiplicativeOperator : ruleMultiplicativeOperator EOF ;
    public final void entryRuleMultiplicativeOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:830:1: ( ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:831:1: ruleMultiplicativeOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalKerMLExpressions.g:838:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:842:2: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:843:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:843:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalKerMLExpressions.g:844:3: ( rule__MultiplicativeOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:845:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalKerMLExpressions.g:845:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleExponentiationExpression"
    // InternalKerMLExpressions.g:854:1: entryRuleExponentiationExpression : ruleExponentiationExpression EOF ;
    public final void entryRuleExponentiationExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:855:1: ( ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:856:1: ruleExponentiationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExponentiationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponentiationExpression"


    // $ANTLR start "ruleExponentiationExpression"
    // InternalKerMLExpressions.g:863:1: ruleExponentiationExpression : ( ( rule__ExponentiationExpression__Group__0 ) ) ;
    public final void ruleExponentiationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:867:2: ( ( ( rule__ExponentiationExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:868:2: ( ( rule__ExponentiationExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:868:2: ( ( rule__ExponentiationExpression__Group__0 ) )
            // InternalKerMLExpressions.g:869:3: ( rule__ExponentiationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:870:3: ( rule__ExponentiationExpression__Group__0 )
            // InternalKerMLExpressions.g:870:4: rule__ExponentiationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponentiationExpression"


    // $ANTLR start "entryRuleExponentiationOperator"
    // InternalKerMLExpressions.g:879:1: entryRuleExponentiationOperator : ruleExponentiationOperator EOF ;
    public final void entryRuleExponentiationOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:880:1: ( ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:881:1: ruleExponentiationOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExponentiationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponentiationOperator"


    // $ANTLR start "ruleExponentiationOperator"
    // InternalKerMLExpressions.g:888:1: ruleExponentiationOperator : ( '**' ) ;
    public final void ruleExponentiationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:892:2: ( ( '**' ) )
            // InternalKerMLExpressions.g:893:2: ( '**' )
            {
            // InternalKerMLExpressions.g:893:2: ( '**' )
            // InternalKerMLExpressions.g:894:3: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponentiationOperator"


    // $ANTLR start "entryRuleUnitsExpression"
    // InternalKerMLExpressions.g:904:1: entryRuleUnitsExpression : ruleUnitsExpression EOF ;
    public final void entryRuleUnitsExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:905:1: ( ruleUnitsExpression EOF )
            // InternalKerMLExpressions.g:906:1: ruleUnitsExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnitsExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnitsExpression"


    // $ANTLR start "ruleUnitsExpression"
    // InternalKerMLExpressions.g:913:1: ruleUnitsExpression : ( ( rule__UnitsExpression__Group__0 ) ) ;
    public final void ruleUnitsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:917:2: ( ( ( rule__UnitsExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:918:2: ( ( rule__UnitsExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:918:2: ( ( rule__UnitsExpression__Group__0 ) )
            // InternalKerMLExpressions.g:919:3: ( rule__UnitsExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:920:3: ( rule__UnitsExpression__Group__0 )
            // InternalKerMLExpressions.g:920:4: rule__UnitsExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitsExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalKerMLExpressions.g:929:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:930:1: ( ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:931:1: ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalKerMLExpressions.g:938:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:942:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:943:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:943:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalKerMLExpressions.g:944:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:945:3: ( rule__UnaryExpression__Alternatives )
            // InternalKerMLExpressions.g:945:4: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryOperator"
    // InternalKerMLExpressions.g:954:1: entryRuleUnaryOperator : ruleUnaryOperator EOF ;
    public final void entryRuleUnaryOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:955:1: ( ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:956:1: ruleUnaryOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalKerMLExpressions.g:963:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:967:2: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:968:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:968:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalKerMLExpressions.g:969:3: ( rule__UnaryOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:970:3: ( rule__UnaryOperator__Alternatives )
            // InternalKerMLExpressions.g:970:4: rule__UnaryOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRuleExtentExpression"
    // InternalKerMLExpressions.g:979:1: entryRuleExtentExpression : ruleExtentExpression EOF ;
    public final void entryRuleExtentExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:980:1: ( ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:981:1: ruleExtentExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExtentExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtentExpression"


    // $ANTLR start "ruleExtentExpression"
    // InternalKerMLExpressions.g:988:1: ruleExtentExpression : ( ( rule__ExtentExpression__Alternatives ) ) ;
    public final void ruleExtentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:992:2: ( ( ( rule__ExtentExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:993:2: ( ( rule__ExtentExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:993:2: ( ( rule__ExtentExpression__Alternatives ) )
            // InternalKerMLExpressions.g:994:3: ( rule__ExtentExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:995:3: ( rule__ExtentExpression__Alternatives )
            // InternalKerMLExpressions.g:995:4: rule__ExtentExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtentExpression"


    // $ANTLR start "entryRuleSequenceExpression"
    // InternalKerMLExpressions.g:1004:1: entryRuleSequenceExpression : ruleSequenceExpression EOF ;
    public final void entryRuleSequenceExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1005:1: ( ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:1006:1: ruleSequenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSequenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceExpression"


    // $ANTLR start "ruleSequenceExpression"
    // InternalKerMLExpressions.g:1013:1: ruleSequenceExpression : ( ( rule__SequenceExpression__Group__0 ) ) ;
    public final void ruleSequenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1017:2: ( ( ( rule__SequenceExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1018:2: ( ( rule__SequenceExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1018:2: ( ( rule__SequenceExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1019:3: ( rule__SequenceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1020:3: ( rule__SequenceExpression__Group__0 )
            // InternalKerMLExpressions.g:1020:4: rule__SequenceExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceExpression"


    // $ANTLR start "entryRuleFeatureNameExpression"
    // InternalKerMLExpressions.g:1029:1: entryRuleFeatureNameExpression : ruleFeatureNameExpression EOF ;
    public final void entryRuleFeatureNameExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1030:1: ( ruleFeatureNameExpression EOF )
            // InternalKerMLExpressions.g:1031:1: ruleFeatureNameExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureNameExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureNameExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureNameExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureNameExpression"


    // $ANTLR start "ruleFeatureNameExpression"
    // InternalKerMLExpressions.g:1038:1: ruleFeatureNameExpression : ( ( rule__FeatureNameExpression__OwnedRelationshipAssignment ) ) ;
    public final void ruleFeatureNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1042:2: ( ( ( rule__FeatureNameExpression__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:1043:2: ( ( rule__FeatureNameExpression__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:1043:2: ( ( rule__FeatureNameExpression__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:1044:3: ( rule__FeatureNameExpression__OwnedRelationshipAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureNameExpressionAccess().getOwnedRelationshipAssignment()); 
            }
            // InternalKerMLExpressions.g:1045:3: ( rule__FeatureNameExpression__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:1045:4: rule__FeatureNameExpression__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureNameExpression__OwnedRelationshipAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureNameExpressionAccess().getOwnedRelationshipAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureNameExpression"


    // $ANTLR start "entryRuleBodyExpressionMember"
    // InternalKerMLExpressions.g:1054:1: entryRuleBodyExpressionMember : ruleBodyExpressionMember EOF ;
    public final void entryRuleBodyExpressionMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1055:1: ( ruleBodyExpressionMember EOF )
            // InternalKerMLExpressions.g:1056:1: ruleBodyExpressionMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBodyExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBodyExpressionMember"


    // $ANTLR start "ruleBodyExpressionMember"
    // InternalKerMLExpressions.g:1063:1: ruleBodyExpressionMember : ( ( rule__BodyExpressionMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleBodyExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1067:2: ( ( ( rule__BodyExpressionMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:1068:2: ( ( rule__BodyExpressionMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:1068:2: ( ( rule__BodyExpressionMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:1069:3: ( rule__BodyExpressionMember__OwnedRelatedElementAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionMemberAccess().getOwnedRelatedElementAssignment()); 
            }
            // InternalKerMLExpressions.g:1070:3: ( rule__BodyExpressionMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:1070:4: rule__BodyExpressionMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpressionMember__OwnedRelatedElementAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionMemberAccess().getOwnedRelatedElementAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyExpressionMember"


    // $ANTLR start "entryRuleBodyExpression"
    // InternalKerMLExpressions.g:1079:1: entryRuleBodyExpression : ruleBodyExpression EOF ;
    public final void entryRuleBodyExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1080:1: ( ruleBodyExpression EOF )
            // InternalKerMLExpressions.g:1081:1: ruleBodyExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBodyExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBodyExpression"


    // $ANTLR start "ruleBodyExpression"
    // InternalKerMLExpressions.g:1088:1: ruleBodyExpression : ( ( rule__BodyExpression__Alternatives ) ) ;
    public final void ruleBodyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1092:2: ( ( ( rule__BodyExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:1093:2: ( ( rule__BodyExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1093:2: ( ( rule__BodyExpression__Alternatives ) )
            // InternalKerMLExpressions.g:1094:3: ( rule__BodyExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1095:3: ( rule__BodyExpression__Alternatives )
            // InternalKerMLExpressions.g:1095:4: rule__BodyExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyExpression"


    // $ANTLR start "entryRuleResultExpressionMember"
    // InternalKerMLExpressions.g:1104:1: entryRuleResultExpressionMember : ruleResultExpressionMember EOF ;
    public final void entryRuleResultExpressionMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1105:1: ( ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:1106:1: ruleResultExpressionMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultExpressionMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleResultExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultExpressionMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResultExpressionMember"


    // $ANTLR start "ruleResultExpressionMember"
    // InternalKerMLExpressions.g:1113:1: ruleResultExpressionMember : ( ( rule__ResultExpressionMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleResultExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1117:2: ( ( ( rule__ResultExpressionMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:1118:2: ( ( rule__ResultExpressionMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:1118:2: ( ( rule__ResultExpressionMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:1119:3: ( rule__ResultExpressionMember__OwnedRelatedElementAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementAssignment()); 
            }
            // InternalKerMLExpressions.g:1120:3: ( rule__ResultExpressionMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:1120:4: rule__ResultExpressionMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ResultExpressionMember__OwnedRelatedElementAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultExpressionMember"


    // $ANTLR start "entryRuleBodyParameterMember"
    // InternalKerMLExpressions.g:1129:1: entryRuleBodyParameterMember : ruleBodyParameterMember EOF ;
    public final void entryRuleBodyParameterMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1130:1: ( ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:1131:1: ruleBodyParameterMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBodyParameterMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBodyParameterMember"


    // $ANTLR start "ruleBodyParameterMember"
    // InternalKerMLExpressions.g:1138:1: ruleBodyParameterMember : ( ( rule__BodyParameterMember__Group__0 ) ) ;
    public final void ruleBodyParameterMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1142:2: ( ( ( rule__BodyParameterMember__Group__0 ) ) )
            // InternalKerMLExpressions.g:1143:2: ( ( rule__BodyParameterMember__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1143:2: ( ( rule__BodyParameterMember__Group__0 ) )
            // InternalKerMLExpressions.g:1144:3: ( rule__BodyParameterMember__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1145:3: ( rule__BodyParameterMember__Group__0 )
            // InternalKerMLExpressions.g:1145:4: rule__BodyParameterMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterMemberAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyParameterMember"


    // $ANTLR start "entryRuleBodyParameter"
    // InternalKerMLExpressions.g:1154:1: entryRuleBodyParameter : ruleBodyParameter EOF ;
    public final void entryRuleBodyParameter() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1155:1: ( ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:1156:1: ruleBodyParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBodyParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBodyParameter"


    // $ANTLR start "ruleBodyParameter"
    // InternalKerMLExpressions.g:1163:1: ruleBodyParameter : ( () ) ;
    public final void ruleBodyParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1167:2: ( ( () ) )
            // InternalKerMLExpressions.g:1168:2: ( () )
            {
            // InternalKerMLExpressions.g:1168:2: ( () )
            // InternalKerMLExpressions.g:1169:3: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterAccess().getFeatureAction()); 
            }
            // InternalKerMLExpressions.g:1170:3: ()
            // InternalKerMLExpressions.g:1170:4: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterAccess().getFeatureAction()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyParameter"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalKerMLExpressions.g:1179:1: entryRuleSequenceConstructionExpression : ruleSequenceConstructionExpression EOF ;
    public final void entryRuleSequenceConstructionExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1180:1: ( ruleSequenceConstructionExpression EOF )
            // InternalKerMLExpressions.g:1181:1: ruleSequenceConstructionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSequenceConstructionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceConstructionExpression"


    // $ANTLR start "ruleSequenceConstructionExpression"
    // InternalKerMLExpressions.g:1188:1: ruleSequenceConstructionExpression : ( ( rule__SequenceConstructionExpression__Alternatives ) ) ;
    public final void ruleSequenceConstructionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1192:2: ( ( ( rule__SequenceConstructionExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:1193:2: ( ( rule__SequenceConstructionExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1193:2: ( ( rule__SequenceConstructionExpression__Alternatives ) )
            // InternalKerMLExpressions.g:1194:3: ( rule__SequenceConstructionExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1195:3: ( rule__SequenceConstructionExpression__Alternatives )
            // InternalKerMLExpressions.g:1195:4: rule__SequenceConstructionExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceConstructionExpression"


    // $ANTLR start "entryRuleSequenceElementList"
    // InternalKerMLExpressions.g:1204:1: entryRuleSequenceElementList : ruleSequenceElementList EOF ;
    public final void entryRuleSequenceElementList() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1205:1: ( ruleSequenceElementList EOF )
            // InternalKerMLExpressions.g:1206:1: ruleSequenceElementList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSequenceElementList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceElementList"


    // $ANTLR start "ruleSequenceElementList"
    // InternalKerMLExpressions.g:1213:1: ruleSequenceElementList : ( ( rule__SequenceElementList__Group__0 ) ) ;
    public final void ruleSequenceElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1217:2: ( ( ( rule__SequenceElementList__Group__0 ) ) )
            // InternalKerMLExpressions.g:1218:2: ( ( rule__SequenceElementList__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1218:2: ( ( rule__SequenceElementList__Group__0 ) )
            // InternalKerMLExpressions.g:1219:3: ( rule__SequenceElementList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1220:3: ( rule__SequenceElementList__Group__0 )
            // InternalKerMLExpressions.g:1220:4: rule__SequenceElementList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceElementList"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalKerMLExpressions.g:1229:1: entryRuleBaseExpression : ruleBaseExpression EOF ;
    public final void entryRuleBaseExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1230:1: ( ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:1231:1: ruleBaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // InternalKerMLExpressions.g:1238:1: ruleBaseExpression : ( ( rule__BaseExpression__Alternatives ) ) ;
    public final void ruleBaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1242:2: ( ( ( rule__BaseExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:1243:2: ( ( rule__BaseExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1243:2: ( ( rule__BaseExpression__Alternatives ) )
            // InternalKerMLExpressions.g:1244:3: ( rule__BaseExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1245:3: ( rule__BaseExpression__Alternatives )
            // InternalKerMLExpressions.g:1245:4: rule__BaseExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleFeatureReferenceExpression"
    // InternalKerMLExpressions.g:1254:1: entryRuleFeatureReferenceExpression : ruleFeatureReferenceExpression EOF ;
    public final void entryRuleFeatureReferenceExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1255:1: ( ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:1256:1: ruleFeatureReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureReferenceExpression"


    // $ANTLR start "ruleFeatureReferenceExpression"
    // InternalKerMLExpressions.g:1263:1: ruleFeatureReferenceExpression : ( ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment ) ) ;
    public final void ruleFeatureReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1267:2: ( ( ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:1268:2: ( ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:1268:2: ( ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:1269:3: ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipAssignment()); 
            }
            // InternalKerMLExpressions.g:1270:3: ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:1270:4: rule__FeatureReferenceExpression__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureReferenceExpression__OwnedRelationshipAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureReferenceExpression"


    // $ANTLR start "entryRuleFeatureReferenceMember"
    // InternalKerMLExpressions.g:1279:1: entryRuleFeatureReferenceMember : ruleFeatureReferenceMember EOF ;
    public final void entryRuleFeatureReferenceMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1280:1: ( ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:1281:1: ruleFeatureReferenceMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureReferenceMember"


    // $ANTLR start "ruleFeatureReferenceMember"
    // InternalKerMLExpressions.g:1288:1: ruleFeatureReferenceMember : ( ( rule__FeatureReferenceMember__MemberElementAssignment ) ) ;
    public final void ruleFeatureReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1292:2: ( ( ( rule__FeatureReferenceMember__MemberElementAssignment ) ) )
            // InternalKerMLExpressions.g:1293:2: ( ( rule__FeatureReferenceMember__MemberElementAssignment ) )
            {
            // InternalKerMLExpressions.g:1293:2: ( ( rule__FeatureReferenceMember__MemberElementAssignment ) )
            // InternalKerMLExpressions.g:1294:3: ( rule__FeatureReferenceMember__MemberElementAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementAssignment()); 
            }
            // InternalKerMLExpressions.g:1295:3: ( rule__FeatureReferenceMember__MemberElementAssignment )
            // InternalKerMLExpressions.g:1295:4: rule__FeatureReferenceMember__MemberElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureReferenceMember__MemberElementAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureReferenceMember"


    // $ANTLR start "entryRuleInvocationExpression"
    // InternalKerMLExpressions.g:1304:1: entryRuleInvocationExpression : ruleInvocationExpression EOF ;
    public final void entryRuleInvocationExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1305:1: ( ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:1306:1: ruleInvocationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInvocationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInvocationExpression"


    // $ANTLR start "ruleInvocationExpression"
    // InternalKerMLExpressions.g:1313:1: ruleInvocationExpression : ( ( rule__InvocationExpression__Group__0 ) ) ;
    public final void ruleInvocationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1317:2: ( ( ( rule__InvocationExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1318:2: ( ( rule__InvocationExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1318:2: ( ( rule__InvocationExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1319:3: ( rule__InvocationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1320:3: ( rule__InvocationExpression__Group__0 )
            // InternalKerMLExpressions.g:1320:4: rule__InvocationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvocationExpression"


    // $ANTLR start "ruleArgumentList"
    // InternalKerMLExpressions.g:1330:1: ruleArgumentList : ( ( rule__ArgumentList__Alternatives ) ) ;
    public final void ruleArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1334:2: ( ( ( rule__ArgumentList__Alternatives ) ) )
            // InternalKerMLExpressions.g:1335:2: ( ( rule__ArgumentList__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1335:2: ( ( rule__ArgumentList__Alternatives ) )
            // InternalKerMLExpressions.g:1336:3: ( rule__ArgumentList__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentListAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1337:3: ( rule__ArgumentList__Alternatives )
            // InternalKerMLExpressions.g:1337:4: rule__ArgumentList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentList__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentListAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "rulePositionalArgumentList"
    // InternalKerMLExpressions.g:1347:1: rulePositionalArgumentList : ( ( rule__PositionalArgumentList__Group__0 ) ) ;
    public final void rulePositionalArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1351:2: ( ( ( rule__PositionalArgumentList__Group__0 ) ) )
            // InternalKerMLExpressions.g:1352:2: ( ( rule__PositionalArgumentList__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1352:2: ( ( rule__PositionalArgumentList__Group__0 ) )
            // InternalKerMLExpressions.g:1353:3: ( rule__PositionalArgumentList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1354:3: ( rule__PositionalArgumentList__Group__0 )
            // InternalKerMLExpressions.g:1354:4: rule__PositionalArgumentList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionalArgumentList"


    // $ANTLR start "ruleNamedArgumentList"
    // InternalKerMLExpressions.g:1364:1: ruleNamedArgumentList : ( ( rule__NamedArgumentList__Group__0 ) ) ;
    public final void ruleNamedArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1368:2: ( ( ( rule__NamedArgumentList__Group__0 ) ) )
            // InternalKerMLExpressions.g:1369:2: ( ( rule__NamedArgumentList__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1369:2: ( ( rule__NamedArgumentList__Group__0 ) )
            // InternalKerMLExpressions.g:1370:3: ( rule__NamedArgumentList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1371:3: ( rule__NamedArgumentList__Group__0 )
            // InternalKerMLExpressions.g:1371:4: rule__NamedArgumentList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedArgumentList"


    // $ANTLR start "entryRuleNamedExpressionMember"
    // InternalKerMLExpressions.g:1380:1: entryRuleNamedExpressionMember : ruleNamedExpressionMember EOF ;
    public final void entryRuleNamedExpressionMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1381:1: ( ruleNamedExpressionMember EOF )
            // InternalKerMLExpressions.g:1382:1: ruleNamedExpressionMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedExpressionMember"


    // $ANTLR start "ruleNamedExpressionMember"
    // InternalKerMLExpressions.g:1389:1: ruleNamedExpressionMember : ( ( rule__NamedExpressionMember__Group__0 ) ) ;
    public final void ruleNamedExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1393:2: ( ( ( rule__NamedExpressionMember__Group__0 ) ) )
            // InternalKerMLExpressions.g:1394:2: ( ( rule__NamedExpressionMember__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1394:2: ( ( rule__NamedExpressionMember__Group__0 ) )
            // InternalKerMLExpressions.g:1395:3: ( rule__NamedExpressionMember__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1396:3: ( rule__NamedExpressionMember__Group__0 )
            // InternalKerMLExpressions.g:1396:4: rule__NamedExpressionMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedExpressionMember"


    // $ANTLR start "entryRuleNullExpression"
    // InternalKerMLExpressions.g:1405:1: entryRuleNullExpression : ruleNullExpression EOF ;
    public final void entryRuleNullExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1406:1: ( ruleNullExpression EOF )
            // InternalKerMLExpressions.g:1407:1: ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNullExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // InternalKerMLExpressions.g:1414:1: ruleNullExpression : ( ( rule__NullExpression__Group__0 ) ) ;
    public final void ruleNullExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1418:2: ( ( ( rule__NullExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1419:2: ( ( rule__NullExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1419:2: ( ( rule__NullExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1420:3: ( rule__NullExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1421:3: ( rule__NullExpression__Group__0 )
            // InternalKerMLExpressions.g:1421:4: rule__NullExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalKerMLExpressions.g:1430:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1431:1: ( ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:1432:1: ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalKerMLExpressions.g:1439:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1443:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:1444:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1444:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalKerMLExpressions.g:1445:3: ( rule__LiteralExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1446:3: ( rule__LiteralExpression__Alternatives )
            // InternalKerMLExpressions.g:1446:4: rule__LiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalKerMLExpressions.g:1455:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1456:1: ( ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:1457:1: ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalKerMLExpressions.g:1464:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__ValueAssignment ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1468:2: ( ( ( rule__LiteralBoolean__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1469:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1469:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            // InternalKerMLExpressions.g:1470:3: ( rule__LiteralBoolean__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 
            }
            // InternalKerMLExpressions.g:1471:3: ( rule__LiteralBoolean__ValueAssignment )
            // InternalKerMLExpressions.g:1471:4: rule__LiteralBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalKerMLExpressions.g:1480:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1481:1: ( ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:1482:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalKerMLExpressions.g:1489:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1493:2: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // InternalKerMLExpressions.g:1494:2: ( ( rule__BooleanValue__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1494:2: ( ( rule__BooleanValue__Alternatives ) )
            // InternalKerMLExpressions.g:1495:3: ( rule__BooleanValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1496:3: ( rule__BooleanValue__Alternatives )
            // InternalKerMLExpressions.g:1496:4: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleLiteralString"
    // InternalKerMLExpressions.g:1505:1: entryRuleLiteralString : ruleLiteralString EOF ;
    public final void entryRuleLiteralString() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1506:1: ( ruleLiteralString EOF )
            // InternalKerMLExpressions.g:1507:1: ruleLiteralString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralString"


    // $ANTLR start "ruleLiteralString"
    // InternalKerMLExpressions.g:1514:1: ruleLiteralString : ( ( rule__LiteralString__ValueAssignment ) ) ;
    public final void ruleLiteralString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1518:2: ( ( ( rule__LiteralString__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1519:2: ( ( rule__LiteralString__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1519:2: ( ( rule__LiteralString__ValueAssignment ) )
            // InternalKerMLExpressions.g:1520:3: ( rule__LiteralString__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralStringAccess().getValueAssignment()); 
            }
            // InternalKerMLExpressions.g:1521:3: ( rule__LiteralString__ValueAssignment )
            // InternalKerMLExpressions.g:1521:4: rule__LiteralString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralString__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralStringAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralString"


    // $ANTLR start "entryRuleLiteralInteger"
    // InternalKerMLExpressions.g:1530:1: entryRuleLiteralInteger : ruleLiteralInteger EOF ;
    public final void entryRuleLiteralInteger() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1531:1: ( ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:1532:1: ruleLiteralInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralIntegerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // InternalKerMLExpressions.g:1539:1: ruleLiteralInteger : ( ( rule__LiteralInteger__ValueAssignment ) ) ;
    public final void ruleLiteralInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1543:2: ( ( ( rule__LiteralInteger__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1544:2: ( ( rule__LiteralInteger__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1544:2: ( ( rule__LiteralInteger__ValueAssignment ) )
            // InternalKerMLExpressions.g:1545:3: ( rule__LiteralInteger__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerAccess().getValueAssignment()); 
            }
            // InternalKerMLExpressions.g:1546:3: ( rule__LiteralInteger__ValueAssignment )
            // InternalKerMLExpressions.g:1546:4: rule__LiteralInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralInteger__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralIntegerAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleLiteralReal"
    // InternalKerMLExpressions.g:1555:1: entryRuleLiteralReal : ruleLiteralReal EOF ;
    public final void entryRuleLiteralReal() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1556:1: ( ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:1557:1: ruleLiteralReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRealRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRealRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralReal"


    // $ANTLR start "ruleLiteralReal"
    // InternalKerMLExpressions.g:1564:1: ruleLiteralReal : ( ( rule__LiteralReal__ValueAssignment ) ) ;
    public final void ruleLiteralReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1568:2: ( ( ( rule__LiteralReal__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1569:2: ( ( rule__LiteralReal__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1569:2: ( ( rule__LiteralReal__ValueAssignment ) )
            // InternalKerMLExpressions.g:1570:3: ( rule__LiteralReal__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRealAccess().getValueAssignment()); 
            }
            // InternalKerMLExpressions.g:1571:3: ( rule__LiteralReal__ValueAssignment )
            // InternalKerMLExpressions.g:1571:4: rule__LiteralReal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralReal__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRealAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralReal"


    // $ANTLR start "entryRuleRealValue"
    // InternalKerMLExpressions.g:1580:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1581:1: ( ruleRealValue EOF )
            // InternalKerMLExpressions.g:1582:1: ruleRealValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRealValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalKerMLExpressions.g:1589:1: ruleRealValue : ( ( rule__RealValue__Alternatives ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1593:2: ( ( ( rule__RealValue__Alternatives ) ) )
            // InternalKerMLExpressions.g:1594:2: ( ( rule__RealValue__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1594:2: ( ( rule__RealValue__Alternatives ) )
            // InternalKerMLExpressions.g:1595:3: ( rule__RealValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1596:3: ( rule__RealValue__Alternatives )
            // InternalKerMLExpressions.g:1596:4: rule__RealValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleLiteralUnbounded"
    // InternalKerMLExpressions.g:1605:1: entryRuleLiteralUnbounded : ruleLiteralUnbounded EOF ;
    public final void entryRuleLiteralUnbounded() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1606:1: ( ruleLiteralUnbounded EOF )
            // InternalKerMLExpressions.g:1607:1: ruleLiteralUnbounded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralUnboundedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralUnbounded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralUnboundedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralUnbounded"


    // $ANTLR start "ruleLiteralUnbounded"
    // InternalKerMLExpressions.g:1614:1: ruleLiteralUnbounded : ( ( rule__LiteralUnbounded__Group__0 ) ) ;
    public final void ruleLiteralUnbounded() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1618:2: ( ( ( rule__LiteralUnbounded__Group__0 ) ) )
            // InternalKerMLExpressions.g:1619:2: ( ( rule__LiteralUnbounded__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1619:2: ( ( rule__LiteralUnbounded__Group__0 ) )
            // InternalKerMLExpressions.g:1620:3: ( rule__LiteralUnbounded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralUnboundedAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1621:3: ( rule__LiteralUnbounded__Group__0 )
            // InternalKerMLExpressions.g:1621:4: rule__LiteralUnbounded__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LiteralUnbounded__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralUnboundedAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralUnbounded"


    // $ANTLR start "entryRuleName"
    // InternalKerMLExpressions.g:1630:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1631:1: ( ruleName EOF )
            // InternalKerMLExpressions.g:1632:1: ruleName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalKerMLExpressions.g:1639:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1643:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalKerMLExpressions.g:1644:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1644:2: ( ( rule__Name__Alternatives ) )
            // InternalKerMLExpressions.g:1645:3: ( rule__Name__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1646:3: ( rule__Name__Alternatives )
            // InternalKerMLExpressions.g:1646:4: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Name__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalKerMLExpressions.g:1655:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1656:1: ( ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:1657:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalKerMLExpressions.g:1664:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1668:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalKerMLExpressions.g:1669:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1669:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalKerMLExpressions.g:1670:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1671:3: ( rule__QualifiedName__Group__0 )
            // InternalKerMLExpressions.g:1671:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__EqualityOperator__Alternatives"
    // InternalKerMLExpressions.g:1679:1: rule__EqualityOperator__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1683:1: ( ( '==' ) | ( '!=' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKerMLExpressions.g:1684:2: ( '==' )
                    {
                    // InternalKerMLExpressions.g:1684:2: ( '==' )
                    // InternalKerMLExpressions.g:1685:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1690:2: ( '!=' )
                    {
                    // InternalKerMLExpressions.g:1690:2: ( '!=' )
                    // InternalKerMLExpressions.g:1691:3: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperator__Alternatives"


    // $ANTLR start "rule__ClassificationExpression__Alternatives"
    // InternalKerMLExpressions.g:1700:1: rule__ClassificationExpression__Alternatives : ( ( ( rule__ClassificationExpression__Group_0__0 ) ) | ( ( rule__ClassificationExpression__Group_1__0 ) ) );
    public final void rule__ClassificationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1704:1: ( ( ( rule__ClassificationExpression__Group_0__0 ) ) | ( ( rule__ClassificationExpression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_EXP_VALUE && LA2_0<=RULE_STRING_VALUE)||(LA2_0>=32 && LA2_0<=34)||(LA2_0>=37 && LA2_0<=40)||(LA2_0>=44 && LA2_0<=45)||LA2_0==47||LA2_0==51||LA2_0==54) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||(LA2_0>=24 && LA2_0<=27)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKerMLExpressions.g:1705:2: ( ( rule__ClassificationExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1705:2: ( ( rule__ClassificationExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1706:3: ( rule__ClassificationExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassificationExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:1707:3: ( rule__ClassificationExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1707:4: rule__ClassificationExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassificationExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassificationExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1711:2: ( ( rule__ClassificationExpression__Group_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:1711:2: ( ( rule__ClassificationExpression__Group_1__0 ) )
                    // InternalKerMLExpressions.g:1712:3: ( rule__ClassificationExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassificationExpressionAccess().getGroup_1()); 
                    }
                    // InternalKerMLExpressions.g:1713:3: ( rule__ClassificationExpression__Group_1__0 )
                    // InternalKerMLExpressions.g:1713:4: rule__ClassificationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassificationExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassificationExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Alternatives"


    // $ANTLR start "rule__ClassificationOperator__Alternatives"
    // InternalKerMLExpressions.g:1721:1: rule__ClassificationOperator__Alternatives : ( ( 'instanceof' ) | ( 'hastype' ) | ( 'istype' ) | ( '@' ) );
    public final void rule__ClassificationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1725:1: ( ( 'instanceof' ) | ( 'hastype' ) | ( 'istype' ) | ( '@' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKerMLExpressions.g:1726:2: ( 'instanceof' )
                    {
                    // InternalKerMLExpressions.g:1726:2: ( 'instanceof' )
                    // InternalKerMLExpressions.g:1727:3: 'instanceof'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassificationOperatorAccess().getInstanceofKeyword_0()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassificationOperatorAccess().getInstanceofKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1732:2: ( 'hastype' )
                    {
                    // InternalKerMLExpressions.g:1732:2: ( 'hastype' )
                    // InternalKerMLExpressions.g:1733:3: 'hastype'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1738:2: ( 'istype' )
                    {
                    // InternalKerMLExpressions.g:1738:2: ( 'istype' )
                    // InternalKerMLExpressions.g:1739:3: 'istype'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_2()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1744:2: ( '@' )
                    {
                    // InternalKerMLExpressions.g:1744:2: ( '@' )
                    // InternalKerMLExpressions.g:1745:3: '@'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_3()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationOperator__Alternatives"


    // $ANTLR start "rule__RelationalOperator__Alternatives"
    // InternalKerMLExpressions.g:1754:1: rule__RelationalOperator__Alternatives : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1758:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKerMLExpressions.g:1759:2: ( '<' )
                    {
                    // InternalKerMLExpressions.g:1759:2: ( '<' )
                    // InternalKerMLExpressions.g:1760:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1765:2: ( '>' )
                    {
                    // InternalKerMLExpressions.g:1765:2: ( '>' )
                    // InternalKerMLExpressions.g:1766:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1771:2: ( '<=' )
                    {
                    // InternalKerMLExpressions.g:1771:2: ( '<=' )
                    // InternalKerMLExpressions.g:1772:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1777:2: ( '>=' )
                    {
                    // InternalKerMLExpressions.g:1777:2: ( '>=' )
                    // InternalKerMLExpressions.g:1778:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalOperator__Alternatives"


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // InternalKerMLExpressions.g:1787:1: rule__AdditiveOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1791:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKerMLExpressions.g:1792:2: ( '+' )
                    {
                    // InternalKerMLExpressions.g:1792:2: ( '+' )
                    // InternalKerMLExpressions.g:1793:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1798:2: ( '-' )
                    {
                    // InternalKerMLExpressions.g:1798:2: ( '-' )
                    // InternalKerMLExpressions.g:1799:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Alternatives"


    // $ANTLR start "rule__MultiplicativeOperator__Alternatives"
    // InternalKerMLExpressions.g:1808:1: rule__MultiplicativeOperator__Alternatives : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1812:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalKerMLExpressions.g:1813:2: ( '*' )
                    {
                    // InternalKerMLExpressions.g:1813:2: ( '*' )
                    // InternalKerMLExpressions.g:1814:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1819:2: ( '/' )
                    {
                    // InternalKerMLExpressions.g:1819:2: ( '/' )
                    // InternalKerMLExpressions.g:1820:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1825:2: ( '%' )
                    {
                    // InternalKerMLExpressions.g:1825:2: ( '%' )
                    // InternalKerMLExpressions.g:1826:3: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeOperatorAccess().getPercentSignKeyword_2()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeOperatorAccess().getPercentSignKeyword_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalKerMLExpressions.g:1835:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleExtentExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1839:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleExtentExpression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=32 && LA7_0<=33)||(LA7_0>=37 && LA7_0<=38)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_EXP_VALUE && LA7_0<=RULE_STRING_VALUE)||LA7_0==34||(LA7_0>=39 && LA7_0<=40)||(LA7_0>=44 && LA7_0<=45)||LA7_0==47||LA7_0==51||LA7_0==54) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKerMLExpressions.g:1840:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1840:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1841:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:1842:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1842:4: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1846:2: ( ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:1846:2: ( ruleExtentExpression )
                    // InternalKerMLExpressions.g:1847:3: ruleExtentExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getExtentExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExtentExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getExtentExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // InternalKerMLExpressions.g:1856:1: rule__UnaryOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '!' ) | ( '~' ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1860:1: ( ( '+' ) | ( '-' ) | ( '!' ) | ( '~' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 38:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalKerMLExpressions.g:1861:2: ( '+' )
                    {
                    // InternalKerMLExpressions.g:1861:2: ( '+' )
                    // InternalKerMLExpressions.g:1862:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1867:2: ( '-' )
                    {
                    // InternalKerMLExpressions.g:1867:2: ( '-' )
                    // InternalKerMLExpressions.g:1868:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1873:2: ( '!' )
                    {
                    // InternalKerMLExpressions.g:1873:2: ( '!' )
                    // InternalKerMLExpressions.g:1874:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1879:2: ( '~' )
                    {
                    // InternalKerMLExpressions.g:1879:2: ( '~' )
                    // InternalKerMLExpressions.g:1880:3: '~'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperator__Alternatives"


    // $ANTLR start "rule__ExtentExpression__Alternatives"
    // InternalKerMLExpressions.g:1889:1: rule__ExtentExpression__Alternatives : ( ( ( rule__ExtentExpression__Group_0__0 ) ) | ( ruleSequenceExpression ) );
    public final void rule__ExtentExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1893:1: ( ( ( rule__ExtentExpression__Group_0__0 ) ) | ( ruleSequenceExpression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==54) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_EXP_VALUE && LA9_0<=RULE_STRING_VALUE)||LA9_0==34||(LA9_0>=39 && LA9_0<=40)||(LA9_0>=44 && LA9_0<=45)||LA9_0==47||LA9_0==51) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKerMLExpressions.g:1894:2: ( ( rule__ExtentExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1894:2: ( ( rule__ExtentExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1895:3: ( rule__ExtentExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtentExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:1896:3: ( rule__ExtentExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1896:4: rule__ExtentExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtentExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtentExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1900:2: ( ruleSequenceExpression )
                    {
                    // InternalKerMLExpressions.g:1900:2: ( ruleSequenceExpression )
                    // InternalKerMLExpressions.g:1901:3: ruleSequenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtentExpressionAccess().getSequenceExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSequenceExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtentExpressionAccess().getSequenceExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__Alternatives"


    // $ANTLR start "rule__SequenceExpression__Alternatives_0"
    // InternalKerMLExpressions.g:1910:1: rule__SequenceExpression__Alternatives_0 : ( ( ruleSequenceConstructionExpression ) | ( ruleBaseExpression ) );
    public final void rule__SequenceExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1914:1: ( ( ruleSequenceConstructionExpression ) | ( ruleBaseExpression ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_EXP_VALUE && LA10_0<=RULE_STRING_VALUE)||LA10_0==34||(LA10_0>=39 && LA10_0<=40)||(LA10_0>=44 && LA10_0<=45)||LA10_0==51) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKerMLExpressions.g:1915:2: ( ruleSequenceConstructionExpression )
                    {
                    // InternalKerMLExpressions.g:1915:2: ( ruleSequenceConstructionExpression )
                    // InternalKerMLExpressions.g:1916:3: ruleSequenceConstructionExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceExpressionAccess().getSequenceConstructionExpressionParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSequenceConstructionExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceExpressionAccess().getSequenceConstructionExpressionParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1921:2: ( ruleBaseExpression )
                    {
                    // InternalKerMLExpressions.g:1921:2: ( ruleBaseExpression )
                    // InternalKerMLExpressions.g:1922:3: ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceExpressionAccess().getBaseExpressionParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceExpressionAccess().getBaseExpressionParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Alternatives_0"


    // $ANTLR start "rule__SequenceExpression__Alternatives_1"
    // InternalKerMLExpressions.g:1931:1: rule__SequenceExpression__Alternatives_1 : ( ( ( rule__SequenceExpression__Group_1_0__0 ) ) | ( ( rule__SequenceExpression__Group_1_1__0 ) ) | ( ( rule__SequenceExpression__Group_1_2__0 ) ) );
    public final void rule__SequenceExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1935:1: ( ( ( rule__SequenceExpression__Group_1_0__0 ) ) | ( ( rule__SequenceExpression__Group_1_1__0 ) ) | ( ( rule__SequenceExpression__Group_1_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt11=1;
                }
                break;
            case 43:
                {
                alt11=2;
                }
                break;
            case 44:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalKerMLExpressions.g:1936:2: ( ( rule__SequenceExpression__Group_1_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1936:2: ( ( rule__SequenceExpression__Group_1_0__0 ) )
                    // InternalKerMLExpressions.g:1937:3: ( rule__SequenceExpression__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceExpressionAccess().getGroup_1_0()); 
                    }
                    // InternalKerMLExpressions.g:1938:3: ( rule__SequenceExpression__Group_1_0__0 )
                    // InternalKerMLExpressions.g:1938:4: rule__SequenceExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceExpression__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceExpressionAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1942:2: ( ( rule__SequenceExpression__Group_1_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:1942:2: ( ( rule__SequenceExpression__Group_1_1__0 ) )
                    // InternalKerMLExpressions.g:1943:3: ( rule__SequenceExpression__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceExpressionAccess().getGroup_1_1()); 
                    }
                    // InternalKerMLExpressions.g:1944:3: ( rule__SequenceExpression__Group_1_1__0 )
                    // InternalKerMLExpressions.g:1944:4: rule__SequenceExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceExpression__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceExpressionAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1948:2: ( ( rule__SequenceExpression__Group_1_2__0 ) )
                    {
                    // InternalKerMLExpressions.g:1948:2: ( ( rule__SequenceExpression__Group_1_2__0 ) )
                    // InternalKerMLExpressions.g:1949:3: ( rule__SequenceExpression__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceExpressionAccess().getGroup_1_2()); 
                    }
                    // InternalKerMLExpressions.g:1950:3: ( rule__SequenceExpression__Group_1_2__0 )
                    // InternalKerMLExpressions.g:1950:4: rule__SequenceExpression__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceExpression__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceExpressionAccess().getGroup_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Alternatives_1"


    // $ANTLR start "rule__BodyExpression__Alternatives"
    // InternalKerMLExpressions.g:1958:1: rule__BodyExpression__Alternatives : ( ( ( rule__BodyExpression__Group_0__0 ) ) | ( ( rule__BodyExpression__OwnedRelationshipAssignment_1 ) ) );
    public final void rule__BodyExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1962:1: ( ( ( rule__BodyExpression__Group_0__0 ) ) | ( ( rule__BodyExpression__OwnedRelationshipAssignment_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA12_3 = input.LA(3);

                    if ( (synpred20_InternalKerMLExpressions()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA12_4 = input.LA(3);

                    if ( (synpred20_InternalKerMLExpressions()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 45:
                    {
                    alt12=1;
                    }
                    break;
                case EOF:
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
                case 41:
                case 42:
                case 43:
                case 44:
                case 46:
                case 48:
                case 49:
                case 52:
                case 53:
                case 55:
                case 56:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA12_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA12_3 = input.LA(3);

                    if ( (synpred20_InternalKerMLExpressions()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA12_4 = input.LA(3);

                    if ( (synpred20_InternalKerMLExpressions()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 45:
                    {
                    alt12=1;
                    }
                    break;
                case EOF:
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
                case 41:
                case 42:
                case 43:
                case 44:
                case 46:
                case 48:
                case 49:
                case 52:
                case 53:
                case 55:
                case 56:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalKerMLExpressions.g:1963:2: ( ( rule__BodyExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1963:2: ( ( rule__BodyExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1964:3: ( rule__BodyExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:1965:3: ( rule__BodyExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1965:4: rule__BodyExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BodyExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1969:2: ( ( rule__BodyExpression__OwnedRelationshipAssignment_1 ) )
                    {
                    // InternalKerMLExpressions.g:1969:2: ( ( rule__BodyExpression__OwnedRelationshipAssignment_1 ) )
                    // InternalKerMLExpressions.g:1970:3: ( rule__BodyExpression__OwnedRelationshipAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipAssignment_1()); 
                    }
                    // InternalKerMLExpressions.g:1971:3: ( rule__BodyExpression__OwnedRelationshipAssignment_1 )
                    // InternalKerMLExpressions.g:1971:4: rule__BodyExpression__OwnedRelationshipAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BodyExpression__OwnedRelationshipAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Alternatives"


    // $ANTLR start "rule__SequenceConstructionExpression__Alternatives"
    // InternalKerMLExpressions.g:1979:1: rule__SequenceConstructionExpression__Alternatives : ( ( ( rule__SequenceConstructionExpression__Group_0__0 ) ) | ( ( rule__SequenceConstructionExpression__Group_1__0 ) ) );
    public final void rule__SequenceConstructionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1983:1: ( ( ( rule__SequenceConstructionExpression__Group_0__0 ) ) | ( ( rule__SequenceConstructionExpression__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=RULE_EXP_VALUE && LA13_1<=RULE_STRING_VALUE)||(LA13_1>=24 && LA13_1<=27)||(LA13_1>=32 && LA13_1<=34)||(LA13_1>=37 && LA13_1<=40)||(LA13_1>=44 && LA13_1<=45)||LA13_1==47||LA13_1==51||LA13_1==54) ) {
                    alt13=2;
                }
                else if ( (LA13_1==48) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalKerMLExpressions.g:1984:2: ( ( rule__SequenceConstructionExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1984:2: ( ( rule__SequenceConstructionExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1985:3: ( rule__SequenceConstructionExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:1986:3: ( rule__SequenceConstructionExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1986:4: rule__SequenceConstructionExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceConstructionExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1990:2: ( ( rule__SequenceConstructionExpression__Group_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:1990:2: ( ( rule__SequenceConstructionExpression__Group_1__0 ) )
                    // InternalKerMLExpressions.g:1991:3: ( rule__SequenceConstructionExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1()); 
                    }
                    // InternalKerMLExpressions.g:1992:3: ( rule__SequenceConstructionExpression__Group_1__0 )
                    // InternalKerMLExpressions.g:1992:4: rule__SequenceConstructionExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceConstructionExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Alternatives"


    // $ANTLR start "rule__SequenceConstructionExpression__Alternatives_1_2"
    // InternalKerMLExpressions.g:2000:1: rule__SequenceConstructionExpression__Alternatives_1_2 : ( ( ( rule__SequenceConstructionExpression__Group_1_2_0__0 ) ) | ( ( rule__SequenceConstructionExpression__Group_1_2_1__0 ) ) );
    public final void rule__SequenceConstructionExpression__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2004:1: ( ( ( rule__SequenceConstructionExpression__Group_1_2_0__0 ) ) | ( ( rule__SequenceConstructionExpression__Group_1_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            else if ( (LA14_0==56) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKerMLExpressions.g:2005:2: ( ( rule__SequenceConstructionExpression__Group_1_2_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2005:2: ( ( rule__SequenceConstructionExpression__Group_1_2_0__0 ) )
                    // InternalKerMLExpressions.g:2006:3: ( rule__SequenceConstructionExpression__Group_1_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1_2_0()); 
                    }
                    // InternalKerMLExpressions.g:2007:3: ( rule__SequenceConstructionExpression__Group_1_2_0__0 )
                    // InternalKerMLExpressions.g:2007:4: rule__SequenceConstructionExpression__Group_1_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceConstructionExpression__Group_1_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2011:2: ( ( rule__SequenceConstructionExpression__Group_1_2_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:2011:2: ( ( rule__SequenceConstructionExpression__Group_1_2_1__0 ) )
                    // InternalKerMLExpressions.g:2012:3: ( rule__SequenceConstructionExpression__Group_1_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1_2_1()); 
                    }
                    // InternalKerMLExpressions.g:2013:3: ( rule__SequenceConstructionExpression__Group_1_2_1__0 )
                    // InternalKerMLExpressions.g:2013:4: rule__SequenceConstructionExpression__Group_1_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceConstructionExpression__Group_1_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Alternatives_1_2"


    // $ANTLR start "rule__BaseExpression__Alternatives"
    // InternalKerMLExpressions.g:2021:1: rule__BaseExpression__Alternatives : ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ( rule__BaseExpression__Group_4__0 ) ) );
    public final void rule__BaseExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2025:1: ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ( rule__BaseExpression__Group_4__0 ) ) )
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalKerMLExpressions.g:2026:2: ( ruleNullExpression )
                    {
                    // InternalKerMLExpressions.g:2026:2: ( ruleNullExpression )
                    // InternalKerMLExpressions.g:2027:3: ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getNullExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNullExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getNullExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2032:2: ( ruleLiteralExpression )
                    {
                    // InternalKerMLExpressions.g:2032:2: ( ruleLiteralExpression )
                    // InternalKerMLExpressions.g:2033:3: ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getLiteralExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getLiteralExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2038:2: ( ruleFeatureReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:2038:2: ( ruleFeatureReferenceExpression )
                    // InternalKerMLExpressions.g:2039:3: ruleFeatureReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getFeatureReferenceExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFeatureReferenceExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getFeatureReferenceExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2044:2: ( ruleInvocationExpression )
                    {
                    // InternalKerMLExpressions.g:2044:2: ( ruleInvocationExpression )
                    // InternalKerMLExpressions.g:2045:3: ruleInvocationExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInvocationExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:2050:2: ( ( rule__BaseExpression__Group_4__0 ) )
                    {
                    // InternalKerMLExpressions.g:2050:2: ( ( rule__BaseExpression__Group_4__0 ) )
                    // InternalKerMLExpressions.g:2051:3: ( rule__BaseExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getGroup_4()); 
                    }
                    // InternalKerMLExpressions.g:2052:3: ( rule__BaseExpression__Group_4__0 )
                    // InternalKerMLExpressions.g:2052:4: rule__BaseExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Alternatives"


    // $ANTLR start "rule__ArgumentList__Alternatives"
    // InternalKerMLExpressions.g:2060:1: rule__ArgumentList__Alternatives : ( ( rulePositionalArgumentList ) | ( ruleNamedArgumentList ) );
    public final void rule__ArgumentList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2064:1: ( ( rulePositionalArgumentList ) | ( ruleNamedArgumentList ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case RULE_EXP_VALUE:
            case RULE_DECIMAL_VALUE:
            case RULE_STRING_VALUE:
            case 24:
            case 25:
            case 26:
            case 27:
            case 32:
            case 33:
            case 34:
            case 37:
            case 38:
            case 39:
            case 40:
            case 44:
            case 45:
            case 47:
            case 51:
            case 54:
                {
                alt16=1;
                }
                break;
            case RULE_ID:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EOF||(LA16_2>=14 && LA16_2<=36)||(LA16_2>=43 && LA16_2<=46)||LA16_2==49||(LA16_2>=52 && LA16_2<=53)||LA16_2==55) ) {
                    alt16=1;
                }
                else if ( (LA16_2==50) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA16_3 = input.LA(2);

                if ( (LA16_3==EOF||(LA16_3>=14 && LA16_3<=36)||(LA16_3>=43 && LA16_3<=46)||LA16_3==49||(LA16_3>=52 && LA16_3<=53)||LA16_3==55) ) {
                    alt16=1;
                }
                else if ( (LA16_3==50) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalKerMLExpressions.g:2065:2: ( rulePositionalArgumentList )
                    {
                    // InternalKerMLExpressions.g:2065:2: ( rulePositionalArgumentList )
                    // InternalKerMLExpressions.g:2066:3: rulePositionalArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePositionalArgumentList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2071:2: ( ruleNamedArgumentList )
                    {
                    // InternalKerMLExpressions.g:2071:2: ( ruleNamedArgumentList )
                    // InternalKerMLExpressions.g:2072:3: ruleNamedArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNamedArgumentList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Alternatives"


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // InternalKerMLExpressions.g:2081:1: rule__LiteralExpression__Alternatives : ( ( ruleLiteralBoolean ) | ( ruleLiteralString ) | ( ruleLiteralInteger ) | ( ruleLiteralReal ) | ( ruleLiteralUnbounded ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2085:1: ( ( ruleLiteralBoolean ) | ( ruleLiteralString ) | ( ruleLiteralInteger ) | ( ruleLiteralReal ) | ( ruleLiteralUnbounded ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt17=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt17=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA17_3 = input.LA(2);

                if ( (LA17_3==44) ) {
                    int LA17_6 = input.LA(3);

                    if ( ((LA17_6>=RULE_EXP_VALUE && LA17_6<=RULE_DECIMAL_VALUE)) ) {
                        alt17=4;
                    }
                    else if ( ((LA17_6>=RULE_ID && LA17_6<=RULE_UNRESTRICTED_NAME)) ) {
                        alt17=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_3==EOF||(LA17_3>=14 && LA17_3<=36)||(LA17_3>=41 && LA17_3<=43)||LA17_3==46||(LA17_3>=48 && LA17_3<=49)||LA17_3==53||(LA17_3>=55 && LA17_3<=56)) ) {
                    alt17=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 44:
                {
                alt17=4;
                }
                break;
            case 34:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalKerMLExpressions.g:2086:2: ( ruleLiteralBoolean )
                    {
                    // InternalKerMLExpressions.g:2086:2: ( ruleLiteralBoolean )
                    // InternalKerMLExpressions.g:2087:3: ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2092:2: ( ruleLiteralString )
                    {
                    // InternalKerMLExpressions.g:2092:2: ( ruleLiteralString )
                    // InternalKerMLExpressions.g:2093:3: ruleLiteralString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getLiteralStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getLiteralStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2098:2: ( ruleLiteralInteger )
                    {
                    // InternalKerMLExpressions.g:2098:2: ( ruleLiteralInteger )
                    // InternalKerMLExpressions.g:2099:3: ruleLiteralInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getLiteralIntegerParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getLiteralIntegerParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2104:2: ( ruleLiteralReal )
                    {
                    // InternalKerMLExpressions.g:2104:2: ( ruleLiteralReal )
                    // InternalKerMLExpressions.g:2105:3: ruleLiteralReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getLiteralRealParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralReal();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getLiteralRealParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:2110:2: ( ruleLiteralUnbounded )
                    {
                    // InternalKerMLExpressions.g:2110:2: ( ruleLiteralUnbounded )
                    // InternalKerMLExpressions.g:2111:3: ruleLiteralUnbounded
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getLiteralUnboundedParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralUnbounded();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getLiteralUnboundedParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // InternalKerMLExpressions.g:2120:1: rule__BooleanValue__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2124:1: ( ( 'true' ) | ( 'false' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            else if ( (LA18_0==40) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalKerMLExpressions.g:2125:2: ( 'true' )
                    {
                    // InternalKerMLExpressions.g:2125:2: ( 'true' )
                    // InternalKerMLExpressions.g:2126:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getTrueKeyword_0()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2131:2: ( 'false' )
                    {
                    // InternalKerMLExpressions.g:2131:2: ( 'false' )
                    // InternalKerMLExpressions.g:2132:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getFalseKeyword_1()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__RealValue__Alternatives"
    // InternalKerMLExpressions.g:2141:1: rule__RealValue__Alternatives : ( ( ( rule__RealValue__Group_0__0 ) ) | ( RULE_EXP_VALUE ) );
    public final void rule__RealValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2145:1: ( ( ( rule__RealValue__Group_0__0 ) ) | ( RULE_EXP_VALUE ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DECIMAL_VALUE||LA19_0==44) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_EXP_VALUE) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalKerMLExpressions.g:2146:2: ( ( rule__RealValue__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2146:2: ( ( rule__RealValue__Group_0__0 ) )
                    // InternalKerMLExpressions.g:2147:3: ( rule__RealValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealValueAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:2148:3: ( rule__RealValue__Group_0__0 )
                    // InternalKerMLExpressions.g:2148:4: rule__RealValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RealValue__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2152:2: ( RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:2152:2: ( RULE_EXP_VALUE )
                    // InternalKerMLExpressions.g:2153:3: RULE_EXP_VALUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1()); 
                    }
                    match(input,RULE_EXP_VALUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Alternatives"


    // $ANTLR start "rule__RealValue__Alternatives_0_2"
    // InternalKerMLExpressions.g:2162:1: rule__RealValue__Alternatives_0_2 : ( ( RULE_DECIMAL_VALUE ) | ( RULE_EXP_VALUE ) );
    public final void rule__RealValue__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2166:1: ( ( RULE_DECIMAL_VALUE ) | ( RULE_EXP_VALUE ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DECIMAL_VALUE) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_EXP_VALUE) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalKerMLExpressions.g:2167:2: ( RULE_DECIMAL_VALUE )
                    {
                    // InternalKerMLExpressions.g:2167:2: ( RULE_DECIMAL_VALUE )
                    // InternalKerMLExpressions.g:2168:3: RULE_DECIMAL_VALUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0()); 
                    }
                    match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2173:2: ( RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:2173:2: ( RULE_EXP_VALUE )
                    // InternalKerMLExpressions.g:2174:3: RULE_EXP_VALUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1()); 
                    }
                    match(input,RULE_EXP_VALUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Alternatives_0_2"


    // $ANTLR start "rule__Name__Alternatives"
    // InternalKerMLExpressions.g:2183:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2187:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_UNRESTRICTED_NAME) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalKerMLExpressions.g:2188:2: ( RULE_ID )
                    {
                    // InternalKerMLExpressions.g:2188:2: ( RULE_ID )
                    // InternalKerMLExpressions.g:2189:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2194:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalKerMLExpressions.g:2194:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalKerMLExpressions.g:2195:3: RULE_UNRESTRICTED_NAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1()); 
                    }
                    match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Alternatives"


    // $ANTLR start "rule__ConditionalExpression__Group__0"
    // InternalKerMLExpressions.g:2204:1: rule__ConditionalExpression__Group__0 : rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 ;
    public final void rule__ConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2208:1: ( rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 )
            // InternalKerMLExpressions.g:2209:2: rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConditionalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__0"


    // $ANTLR start "rule__ConditionalExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:2216:1: rule__ConditionalExpression__Group__0__Impl : ( ruleNullCoalescingExpression ) ;
    public final void rule__ConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2220:1: ( ( ruleNullCoalescingExpression ) )
            // InternalKerMLExpressions.g:2221:1: ( ruleNullCoalescingExpression )
            {
            // InternalKerMLExpressions.g:2221:1: ( ruleNullCoalescingExpression )
            // InternalKerMLExpressions.g:2222:2: ruleNullCoalescingExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullCoalescingExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__1"
    // InternalKerMLExpressions.g:2231:1: rule__ConditionalExpression__Group__1 : rule__ConditionalExpression__Group__1__Impl ;
    public final void rule__ConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2235:1: ( rule__ConditionalExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2236:2: rule__ConditionalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__1"


    // $ANTLR start "rule__ConditionalExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:2242:1: rule__ConditionalExpression__Group__1__Impl : ( ( rule__ConditionalExpression__Group_1__0 )? ) ;
    public final void rule__ConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2246:1: ( ( ( rule__ConditionalExpression__Group_1__0 )? ) )
            // InternalKerMLExpressions.g:2247:1: ( ( rule__ConditionalExpression__Group_1__0 )? )
            {
            // InternalKerMLExpressions.g:2247:1: ( ( rule__ConditionalExpression__Group_1__0 )? )
            // InternalKerMLExpressions.g:2248:2: ( rule__ConditionalExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2249:2: ( rule__ConditionalExpression__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKerMLExpressions.g:2249:3: rule__ConditionalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__0"
    // InternalKerMLExpressions.g:2258:1: rule__ConditionalExpression__Group_1__0 : rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 ;
    public final void rule__ConditionalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2262:1: ( rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2263:2: rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ConditionalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__0"


    // $ANTLR start "rule__ConditionalExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:2270:1: rule__ConditionalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2274:1: ( ( () ) )
            // InternalKerMLExpressions.g:2275:1: ( () )
            {
            // InternalKerMLExpressions.g:2275:1: ( () )
            // InternalKerMLExpressions.g:2276:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2277:2: ()
            // InternalKerMLExpressions.g:2277:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__1"
    // InternalKerMLExpressions.g:2285:1: rule__ConditionalExpression__Group_1__1 : rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 ;
    public final void rule__ConditionalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2289:1: ( rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2290:2: rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__1"


    // $ANTLR start "rule__ConditionalExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:2297:1: rule__ConditionalExpression__Group_1__1__Impl : ( ( rule__ConditionalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ConditionalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2301:1: ( ( ( rule__ConditionalExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2302:1: ( ( rule__ConditionalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2302:1: ( ( rule__ConditionalExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2303:2: ( rule__ConditionalExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2304:2: ( rule__ConditionalExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2304:3: rule__ConditionalExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__2"
    // InternalKerMLExpressions.g:2312:1: rule__ConditionalExpression__Group_1__2 : rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 ;
    public final void rule__ConditionalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2316:1: ( rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 )
            // InternalKerMLExpressions.g:2317:2: rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__ConditionalExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__2"


    // $ANTLR start "rule__ConditionalExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:2324:1: rule__ConditionalExpression__Group_1__2__Impl : ( ( rule__ConditionalExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__ConditionalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2328:1: ( ( ( rule__ConditionalExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2329:1: ( ( rule__ConditionalExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2329:1: ( ( rule__ConditionalExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2330:2: ( rule__ConditionalExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2331:2: ( rule__ConditionalExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:2331:3: rule__ConditionalExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__3"
    // InternalKerMLExpressions.g:2339:1: rule__ConditionalExpression__Group_1__3 : rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4 ;
    public final void rule__ConditionalExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2343:1: ( rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4 )
            // InternalKerMLExpressions.g:2344:2: rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__3"


    // $ANTLR start "rule__ConditionalExpression__Group_1__3__Impl"
    // InternalKerMLExpressions.g:2351:1: rule__ConditionalExpression__Group_1__3__Impl : ( ':' ) ;
    public final void rule__ConditionalExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2355:1: ( ( ':' ) )
            // InternalKerMLExpressions.g:2356:1: ( ':' )
            {
            // InternalKerMLExpressions.g:2356:1: ( ':' )
            // InternalKerMLExpressions.g:2357:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__3__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__4"
    // InternalKerMLExpressions.g:2366:1: rule__ConditionalExpression__Group_1__4 : rule__ConditionalExpression__Group_1__4__Impl ;
    public final void rule__ConditionalExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2370:1: ( rule__ConditionalExpression__Group_1__4__Impl )
            // InternalKerMLExpressions.g:2371:2: rule__ConditionalExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__4"


    // $ANTLR start "rule__ConditionalExpression__Group_1__4__Impl"
    // InternalKerMLExpressions.g:2377:1: rule__ConditionalExpression__Group_1__4__Impl : ( ( rule__ConditionalExpression__OperandAssignment_1_4 ) ) ;
    public final void rule__ConditionalExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2381:1: ( ( ( rule__ConditionalExpression__OperandAssignment_1_4 ) ) )
            // InternalKerMLExpressions.g:2382:1: ( ( rule__ConditionalExpression__OperandAssignment_1_4 ) )
            {
            // InternalKerMLExpressions.g:2382:1: ( ( rule__ConditionalExpression__OperandAssignment_1_4 ) )
            // InternalKerMLExpressions.g:2383:2: ( rule__ConditionalExpression__OperandAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_4()); 
            }
            // InternalKerMLExpressions.g:2384:2: ( rule__ConditionalExpression__OperandAssignment_1_4 )
            // InternalKerMLExpressions.g:2384:3: rule__ConditionalExpression__OperandAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperandAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__4__Impl"


    // $ANTLR start "rule__NullCoalescingExpression__Group__0"
    // InternalKerMLExpressions.g:2393:1: rule__NullCoalescingExpression__Group__0 : rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1 ;
    public final void rule__NullCoalescingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2397:1: ( rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1 )
            // InternalKerMLExpressions.g:2398:2: rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NullCoalescingExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group__0"


    // $ANTLR start "rule__NullCoalescingExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:2405:1: rule__NullCoalescingExpression__Group__0__Impl : ( ruleConditionalOrExpression ) ;
    public final void rule__NullCoalescingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2409:1: ( ( ruleConditionalOrExpression ) )
            // InternalKerMLExpressions.g:2410:1: ( ruleConditionalOrExpression )
            {
            // InternalKerMLExpressions.g:2410:1: ( ruleConditionalOrExpression )
            // InternalKerMLExpressions.g:2411:2: ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getConditionalOrExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getConditionalOrExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group__0__Impl"


    // $ANTLR start "rule__NullCoalescingExpression__Group__1"
    // InternalKerMLExpressions.g:2420:1: rule__NullCoalescingExpression__Group__1 : rule__NullCoalescingExpression__Group__1__Impl ;
    public final void rule__NullCoalescingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2424:1: ( rule__NullCoalescingExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2425:2: rule__NullCoalescingExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group__1"


    // $ANTLR start "rule__NullCoalescingExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:2431:1: rule__NullCoalescingExpression__Group__1__Impl : ( ( rule__NullCoalescingExpression__Group_1__0 )* ) ;
    public final void rule__NullCoalescingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2435:1: ( ( ( rule__NullCoalescingExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2436:1: ( ( rule__NullCoalescingExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2436:1: ( ( rule__NullCoalescingExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2437:2: ( rule__NullCoalescingExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2438:2: ( rule__NullCoalescingExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2438:3: rule__NullCoalescingExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NullCoalescingExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group__1__Impl"


    // $ANTLR start "rule__NullCoalescingExpression__Group_1__0"
    // InternalKerMLExpressions.g:2447:1: rule__NullCoalescingExpression__Group_1__0 : rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1 ;
    public final void rule__NullCoalescingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2451:1: ( rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2452:2: rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__NullCoalescingExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group_1__0"


    // $ANTLR start "rule__NullCoalescingExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:2459:1: rule__NullCoalescingExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NullCoalescingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2463:1: ( ( () ) )
            // InternalKerMLExpressions.g:2464:1: ( () )
            {
            // InternalKerMLExpressions.g:2464:1: ( () )
            // InternalKerMLExpressions.g:2465:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2466:2: ()
            // InternalKerMLExpressions.g:2466:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NullCoalescingExpression__Group_1__1"
    // InternalKerMLExpressions.g:2474:1: rule__NullCoalescingExpression__Group_1__1 : rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2 ;
    public final void rule__NullCoalescingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2478:1: ( rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2479:2: rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__NullCoalescingExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group_1__1"


    // $ANTLR start "rule__NullCoalescingExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:2486:1: rule__NullCoalescingExpression__Group_1__1__Impl : ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NullCoalescingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2490:1: ( ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2491:1: ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2491:1: ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2492:2: ( rule__NullCoalescingExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2493:2: ( rule__NullCoalescingExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2493:3: rule__NullCoalescingExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NullCoalescingExpression__Group_1__2"
    // InternalKerMLExpressions.g:2501:1: rule__NullCoalescingExpression__Group_1__2 : rule__NullCoalescingExpression__Group_1__2__Impl ;
    public final void rule__NullCoalescingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2505:1: ( rule__NullCoalescingExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:2506:2: rule__NullCoalescingExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group_1__2"


    // $ANTLR start "rule__NullCoalescingExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:2512:1: rule__NullCoalescingExpression__Group_1__2__Impl : ( ( rule__NullCoalescingExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__NullCoalescingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2516:1: ( ( ( rule__NullCoalescingExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2517:1: ( ( rule__NullCoalescingExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2517:1: ( ( rule__NullCoalescingExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2518:2: ( rule__NullCoalescingExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2519:2: ( rule__NullCoalescingExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:2519:3: rule__NullCoalescingExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group__0"
    // InternalKerMLExpressions.g:2528:1: rule__ConditionalOrExpression__Group__0 : rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1 ;
    public final void rule__ConditionalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2532:1: ( rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1 )
            // InternalKerMLExpressions.g:2533:2: rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConditionalOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group__0"


    // $ANTLR start "rule__ConditionalOrExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:2540:1: rule__ConditionalOrExpression__Group__0__Impl : ( ruleConditionalAndExpression ) ;
    public final void rule__ConditionalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2544:1: ( ( ruleConditionalAndExpression ) )
            // InternalKerMLExpressions.g:2545:1: ( ruleConditionalAndExpression )
            {
            // InternalKerMLExpressions.g:2545:1: ( ruleConditionalAndExpression )
            // InternalKerMLExpressions.g:2546:2: ruleConditionalAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group__0__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group__1"
    // InternalKerMLExpressions.g:2555:1: rule__ConditionalOrExpression__Group__1 : rule__ConditionalOrExpression__Group__1__Impl ;
    public final void rule__ConditionalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2559:1: ( rule__ConditionalOrExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2560:2: rule__ConditionalOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group__1"


    // $ANTLR start "rule__ConditionalOrExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:2566:1: rule__ConditionalOrExpression__Group__1__Impl : ( ( rule__ConditionalOrExpression__Group_1__0 )* ) ;
    public final void rule__ConditionalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2570:1: ( ( ( rule__ConditionalOrExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2571:1: ( ( rule__ConditionalOrExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2571:1: ( ( rule__ConditionalOrExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2572:2: ( rule__ConditionalOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2573:2: ( rule__ConditionalOrExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2573:3: rule__ConditionalOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ConditionalOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group__1__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__0"
    // InternalKerMLExpressions.g:2582:1: rule__ConditionalOrExpression__Group_1__0 : rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1 ;
    public final void rule__ConditionalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2586:1: ( rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2587:2: rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ConditionalOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__0"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:2594:1: rule__ConditionalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2598:1: ( ( () ) )
            // InternalKerMLExpressions.g:2599:1: ( () )
            {
            // InternalKerMLExpressions.g:2599:1: ( () )
            // InternalKerMLExpressions.g:2600:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2601:2: ()
            // InternalKerMLExpressions.g:2601:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__1"
    // InternalKerMLExpressions.g:2609:1: rule__ConditionalOrExpression__Group_1__1 : rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2 ;
    public final void rule__ConditionalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2613:1: ( rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2614:2: rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__1"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:2621:1: rule__ConditionalOrExpression__Group_1__1__Impl : ( ( rule__ConditionalOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ConditionalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2625:1: ( ( ( rule__ConditionalOrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2626:1: ( ( rule__ConditionalOrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2626:1: ( ( rule__ConditionalOrExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2627:2: ( rule__ConditionalOrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2628:2: ( rule__ConditionalOrExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2628:3: rule__ConditionalOrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__2"
    // InternalKerMLExpressions.g:2636:1: rule__ConditionalOrExpression__Group_1__2 : rule__ConditionalOrExpression__Group_1__2__Impl ;
    public final void rule__ConditionalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2640:1: ( rule__ConditionalOrExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:2641:2: rule__ConditionalOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__2"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:2647:1: rule__ConditionalOrExpression__Group_1__2__Impl : ( ( rule__ConditionalOrExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__ConditionalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2651:1: ( ( ( rule__ConditionalOrExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2652:1: ( ( rule__ConditionalOrExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2652:1: ( ( rule__ConditionalOrExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2653:2: ( rule__ConditionalOrExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2654:2: ( rule__ConditionalOrExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:2654:3: rule__ConditionalOrExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group__0"
    // InternalKerMLExpressions.g:2663:1: rule__ConditionalAndExpression__Group__0 : rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1 ;
    public final void rule__ConditionalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2667:1: ( rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1 )
            // InternalKerMLExpressions.g:2668:2: rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ConditionalAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group__0"


    // $ANTLR start "rule__ConditionalAndExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:2675:1: rule__ConditionalAndExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__ConditionalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2679:1: ( ( ruleOrExpression ) )
            // InternalKerMLExpressions.g:2680:1: ( ruleOrExpression )
            {
            // InternalKerMLExpressions.g:2680:1: ( ruleOrExpression )
            // InternalKerMLExpressions.g:2681:2: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOrExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOrExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group__0__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group__1"
    // InternalKerMLExpressions.g:2690:1: rule__ConditionalAndExpression__Group__1 : rule__ConditionalAndExpression__Group__1__Impl ;
    public final void rule__ConditionalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2694:1: ( rule__ConditionalAndExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2695:2: rule__ConditionalAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group__1"


    // $ANTLR start "rule__ConditionalAndExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:2701:1: rule__ConditionalAndExpression__Group__1__Impl : ( ( rule__ConditionalAndExpression__Group_1__0 )* ) ;
    public final void rule__ConditionalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2705:1: ( ( ( rule__ConditionalAndExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2706:1: ( ( rule__ConditionalAndExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2706:1: ( ( rule__ConditionalAndExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2707:2: ( rule__ConditionalAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2708:2: ( rule__ConditionalAndExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2708:3: rule__ConditionalAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConditionalAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group__1__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__0"
    // InternalKerMLExpressions.g:2717:1: rule__ConditionalAndExpression__Group_1__0 : rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1 ;
    public final void rule__ConditionalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2721:1: ( rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2722:2: rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ConditionalAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__0"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:2729:1: rule__ConditionalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2733:1: ( ( () ) )
            // InternalKerMLExpressions.g:2734:1: ( () )
            {
            // InternalKerMLExpressions.g:2734:1: ( () )
            // InternalKerMLExpressions.g:2735:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2736:2: ()
            // InternalKerMLExpressions.g:2736:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__1"
    // InternalKerMLExpressions.g:2744:1: rule__ConditionalAndExpression__Group_1__1 : rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2 ;
    public final void rule__ConditionalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2748:1: ( rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2749:2: rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__1"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:2756:1: rule__ConditionalAndExpression__Group_1__1__Impl : ( ( rule__ConditionalAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ConditionalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2760:1: ( ( ( rule__ConditionalAndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2761:1: ( ( rule__ConditionalAndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2761:1: ( ( rule__ConditionalAndExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2762:2: ( rule__ConditionalAndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2763:2: ( rule__ConditionalAndExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2763:3: rule__ConditionalAndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__2"
    // InternalKerMLExpressions.g:2771:1: rule__ConditionalAndExpression__Group_1__2 : rule__ConditionalAndExpression__Group_1__2__Impl ;
    public final void rule__ConditionalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2775:1: ( rule__ConditionalAndExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:2776:2: rule__ConditionalAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__2"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:2782:1: rule__ConditionalAndExpression__Group_1__2__Impl : ( ( rule__ConditionalAndExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__ConditionalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2786:1: ( ( ( rule__ConditionalAndExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2787:1: ( ( rule__ConditionalAndExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2787:1: ( ( rule__ConditionalAndExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2788:2: ( rule__ConditionalAndExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2789:2: ( rule__ConditionalAndExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:2789:3: rule__ConditionalAndExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalKerMLExpressions.g:2798:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2802:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalKerMLExpressions.g:2803:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:2810:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2814:1: ( ( ruleXorExpression ) )
            // InternalKerMLExpressions.g:2815:1: ( ruleXorExpression )
            {
            // InternalKerMLExpressions.g:2815:1: ( ruleXorExpression )
            // InternalKerMLExpressions.g:2816:2: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalKerMLExpressions.g:2825:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2829:1: ( rule__OrExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2830:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:2836:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2840:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2841:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2841:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2842:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2843:2: ( rule__OrExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2843:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalKerMLExpressions.g:2852:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2856:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2857:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:2864:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2868:1: ( ( () ) )
            // InternalKerMLExpressions.g:2869:1: ( () )
            {
            // InternalKerMLExpressions.g:2869:1: ( () )
            // InternalKerMLExpressions.g:2870:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2871:2: ()
            // InternalKerMLExpressions.g:2871:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalKerMLExpressions.g:2879:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2883:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2884:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:2891:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2895:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2896:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2896:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2897:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2898:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2898:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalKerMLExpressions.g:2906:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2910:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:2911:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:2917:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2921:1: ( ( ( rule__OrExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2922:1: ( ( rule__OrExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2922:1: ( ( rule__OrExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2923:2: ( rule__OrExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2924:2: ( rule__OrExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:2924:3: rule__OrExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__XorExpression__Group__0"
    // InternalKerMLExpressions.g:2933:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2937:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalKerMLExpressions.g:2938:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__XorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__0"


    // $ANTLR start "rule__XorExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:2945:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2949:1: ( ( ruleAndExpression ) )
            // InternalKerMLExpressions.g:2950:1: ( ruleAndExpression )
            {
            // InternalKerMLExpressions.g:2950:1: ( ruleAndExpression )
            // InternalKerMLExpressions.g:2951:2: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__0__Impl"


    // $ANTLR start "rule__XorExpression__Group__1"
    // InternalKerMLExpressions.g:2960:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2964:1: ( rule__XorExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2965:2: rule__XorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__1"


    // $ANTLR start "rule__XorExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:2971:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2975:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2976:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2976:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2977:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2978:2: ( rule__XorExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==19) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2978:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__0"
    // InternalKerMLExpressions.g:2987:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2991:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2992:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__XorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0"


    // $ANTLR start "rule__XorExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:2999:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3003:1: ( ( () ) )
            // InternalKerMLExpressions.g:3004:1: ( () )
            {
            // InternalKerMLExpressions.g:3004:1: ( () )
            // InternalKerMLExpressions.g:3005:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3006:2: ()
            // InternalKerMLExpressions.g:3006:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__1"
    // InternalKerMLExpressions.g:3014:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3018:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3019:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__XorExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__1"


    // $ANTLR start "rule__XorExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:3026:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3030:1: ( ( ( rule__XorExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3031:1: ( ( rule__XorExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3031:1: ( ( rule__XorExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3032:2: ( rule__XorExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3033:2: ( rule__XorExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3033:3: rule__XorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__2"
    // InternalKerMLExpressions.g:3041:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3045:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3046:2: rule__XorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__2"


    // $ANTLR start "rule__XorExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:3052:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3056:1: ( ( ( rule__XorExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3057:1: ( ( rule__XorExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3057:1: ( ( rule__XorExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3058:2: ( rule__XorExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3059:2: ( rule__XorExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3059:3: rule__XorExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalKerMLExpressions.g:3068:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3072:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalKerMLExpressions.g:3073:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:3080:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3084:1: ( ( ruleEqualityExpression ) )
            // InternalKerMLExpressions.g:3085:1: ( ruleEqualityExpression )
            {
            // InternalKerMLExpressions.g:3085:1: ( ruleEqualityExpression )
            // InternalKerMLExpressions.g:3086:2: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalKerMLExpressions.g:3095:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3099:1: ( rule__AndExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3100:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:3106:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3110:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3111:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3111:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3112:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3113:2: ( rule__AndExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3113:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalKerMLExpressions.g:3122:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3126:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3127:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:3134:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3138:1: ( ( () ) )
            // InternalKerMLExpressions.g:3139:1: ( () )
            {
            // InternalKerMLExpressions.g:3139:1: ( () )
            // InternalKerMLExpressions.g:3140:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3141:2: ()
            // InternalKerMLExpressions.g:3141:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalKerMLExpressions.g:3149:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3153:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3154:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:3161:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3165:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3166:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3166:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3167:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3168:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3168:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalKerMLExpressions.g:3176:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3180:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3181:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:3187:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3191:1: ( ( ( rule__AndExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3192:1: ( ( rule__AndExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3192:1: ( ( rule__AndExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3193:2: ( rule__AndExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3194:2: ( rule__AndExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3194:3: rule__AndExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // InternalKerMLExpressions.g:3203:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3207:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalKerMLExpressions.g:3208:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:3215:1: rule__EqualityExpression__Group__0__Impl : ( ruleClassificationExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3219:1: ( ( ruleClassificationExpression ) )
            // InternalKerMLExpressions.g:3220:1: ( ruleClassificationExpression )
            {
            // InternalKerMLExpressions.g:3220:1: ( ruleClassificationExpression )
            // InternalKerMLExpressions.g:3221:2: ruleClassificationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassificationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // InternalKerMLExpressions.g:3230:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3234:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3235:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:3241:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3245:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3246:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3246:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3247:2: ( rule__EqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3248:2: ( rule__EqualityExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=22 && LA29_0<=23)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3248:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // InternalKerMLExpressions.g:3257:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3261:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3262:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:3269:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3273:1: ( ( () ) )
            // InternalKerMLExpressions.g:3274:1: ( () )
            {
            // InternalKerMLExpressions.g:3274:1: ( () )
            // InternalKerMLExpressions.g:3275:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3276:2: ()
            // InternalKerMLExpressions.g:3276:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // InternalKerMLExpressions.g:3284:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3288:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3289:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:3296:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3300:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3301:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3301:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3302:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3303:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3303:3: rule__EqualityExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__2"
    // InternalKerMLExpressions.g:3311:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3315:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3316:2: rule__EqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__2"


    // $ANTLR start "rule__EqualityExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:3322:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3326:1: ( ( ( rule__EqualityExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3327:1: ( ( rule__EqualityExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3327:1: ( ( rule__EqualityExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3328:2: ( rule__EqualityExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3329:2: ( rule__EqualityExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3329:3: rule__EqualityExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_0__0"
    // InternalKerMLExpressions.g:3338:1: rule__ClassificationExpression__Group_0__0 : rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1 ;
    public final void rule__ClassificationExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3342:1: ( rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1 )
            // InternalKerMLExpressions.g:3343:2: rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__ClassificationExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0__0"


    // $ANTLR start "rule__ClassificationExpression__Group_0__0__Impl"
    // InternalKerMLExpressions.g:3350:1: rule__ClassificationExpression__Group_0__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__ClassificationExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3354:1: ( ( ruleRelationalExpression ) )
            // InternalKerMLExpressions.g:3355:1: ( ruleRelationalExpression )
            {
            // InternalKerMLExpressions.g:3355:1: ( ruleRelationalExpression )
            // InternalKerMLExpressions.g:3356:2: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_0__1"
    // InternalKerMLExpressions.g:3365:1: rule__ClassificationExpression__Group_0__1 : rule__ClassificationExpression__Group_0__1__Impl ;
    public final void rule__ClassificationExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3369:1: ( rule__ClassificationExpression__Group_0__1__Impl )
            // InternalKerMLExpressions.g:3370:2: rule__ClassificationExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0__1"


    // $ANTLR start "rule__ClassificationExpression__Group_0__1__Impl"
    // InternalKerMLExpressions.g:3376:1: rule__ClassificationExpression__Group_0__1__Impl : ( ( rule__ClassificationExpression__Group_0_1__0 )? ) ;
    public final void rule__ClassificationExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3380:1: ( ( ( rule__ClassificationExpression__Group_0_1__0 )? ) )
            // InternalKerMLExpressions.g:3381:1: ( ( rule__ClassificationExpression__Group_0_1__0 )? )
            {
            // InternalKerMLExpressions.g:3381:1: ( ( rule__ClassificationExpression__Group_0_1__0 )? )
            // InternalKerMLExpressions.g:3382:2: ( rule__ClassificationExpression__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getGroup_0_1()); 
            }
            // InternalKerMLExpressions.g:3383:2: ( rule__ClassificationExpression__Group_0_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=24 && LA30_0<=27)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKerMLExpressions.g:3383:3: rule__ClassificationExpression__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassificationExpression__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_0_1__0"
    // InternalKerMLExpressions.g:3392:1: rule__ClassificationExpression__Group_0_1__0 : rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1 ;
    public final void rule__ClassificationExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3396:1: ( rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1 )
            // InternalKerMLExpressions.g:3397:2: rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ClassificationExpression__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0_1__0"


    // $ANTLR start "rule__ClassificationExpression__Group_0_1__0__Impl"
    // InternalKerMLExpressions.g:3404:1: rule__ClassificationExpression__Group_0_1__0__Impl : ( () ) ;
    public final void rule__ClassificationExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3408:1: ( ( () ) )
            // InternalKerMLExpressions.g:3409:1: ( () )
            {
            // InternalKerMLExpressions.g:3409:1: ( () )
            // InternalKerMLExpressions.g:3410:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0()); 
            }
            // InternalKerMLExpressions.g:3411:2: ()
            // InternalKerMLExpressions.g:3411:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_0_1__1"
    // InternalKerMLExpressions.g:3419:1: rule__ClassificationExpression__Group_0_1__1 : rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2 ;
    public final void rule__ClassificationExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3423:1: ( rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2 )
            // InternalKerMLExpressions.g:3424:2: rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2
            {
            pushFollow(FOLLOW_21);
            rule__ClassificationExpression__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0_1__1"


    // $ANTLR start "rule__ClassificationExpression__Group_0_1__1__Impl"
    // InternalKerMLExpressions.g:3431:1: rule__ClassificationExpression__Group_0_1__1__Impl : ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__ClassificationExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3435:1: ( ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) ) )
            // InternalKerMLExpressions.g:3436:1: ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) )
            {
            // InternalKerMLExpressions.g:3436:1: ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) )
            // InternalKerMLExpressions.g:3437:2: ( rule__ClassificationExpression__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_0_1_1()); 
            }
            // InternalKerMLExpressions.g:3438:2: ( rule__ClassificationExpression__OperatorAssignment_0_1_1 )
            // InternalKerMLExpressions.g:3438:3: rule__ClassificationExpression__OperatorAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OperatorAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_0_1__2"
    // InternalKerMLExpressions.g:3446:1: rule__ClassificationExpression__Group_0_1__2 : rule__ClassificationExpression__Group_0_1__2__Impl ;
    public final void rule__ClassificationExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3450:1: ( rule__ClassificationExpression__Group_0_1__2__Impl )
            // InternalKerMLExpressions.g:3451:2: rule__ClassificationExpression__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0_1__2"


    // $ANTLR start "rule__ClassificationExpression__Group_0_1__2__Impl"
    // InternalKerMLExpressions.g:3457:1: rule__ClassificationExpression__Group_0_1__2__Impl : ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 ) ) ;
    public final void rule__ClassificationExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3461:1: ( ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 ) ) )
            // InternalKerMLExpressions.g:3462:1: ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 ) )
            {
            // InternalKerMLExpressions.g:3462:1: ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 ) )
            // InternalKerMLExpressions.g:3463:2: ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipAssignment_0_1_2()); 
            }
            // InternalKerMLExpressions.g:3464:2: ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 )
            // InternalKerMLExpressions.g:3464:3: rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipAssignment_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_0_1__2__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_1__0"
    // InternalKerMLExpressions.g:3473:1: rule__ClassificationExpression__Group_1__0 : rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1 ;
    public final void rule__ClassificationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3477:1: ( rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3478:2: rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ClassificationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_1__0"


    // $ANTLR start "rule__ClassificationExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:3485:1: rule__ClassificationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ClassificationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3489:1: ( ( () ) )
            // InternalKerMLExpressions.g:3490:1: ( () )
            {
            // InternalKerMLExpressions.g:3490:1: ( () )
            // InternalKerMLExpressions.g:3491:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3492:2: ()
            // InternalKerMLExpressions.g:3492:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_1__1"
    // InternalKerMLExpressions.g:3500:1: rule__ClassificationExpression__Group_1__1 : rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2 ;
    public final void rule__ClassificationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3504:1: ( rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3505:2: rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__ClassificationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_1__1"


    // $ANTLR start "rule__ClassificationExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:3512:1: rule__ClassificationExpression__Group_1__1__Impl : ( ( rule__ClassificationExpression__OperandAssignment_1_1 ) ) ;
    public final void rule__ClassificationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3516:1: ( ( ( rule__ClassificationExpression__OperandAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3517:1: ( ( rule__ClassificationExpression__OperandAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3517:1: ( ( rule__ClassificationExpression__OperandAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3518:2: ( rule__ClassificationExpression__OperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperandAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3519:2: ( rule__ClassificationExpression__OperandAssignment_1_1 )
            // InternalKerMLExpressions.g:3519:3: rule__ClassificationExpression__OperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperandAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_1__2"
    // InternalKerMLExpressions.g:3527:1: rule__ClassificationExpression__Group_1__2 : rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3 ;
    public final void rule__ClassificationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3531:1: ( rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3 )
            // InternalKerMLExpressions.g:3532:2: rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3
            {
            pushFollow(FOLLOW_21);
            rule__ClassificationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_1__2"


    // $ANTLR start "rule__ClassificationExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:3539:1: rule__ClassificationExpression__Group_1__2__Impl : ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) ) ;
    public final void rule__ClassificationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3543:1: ( ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3544:1: ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3544:1: ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3545:2: ( rule__ClassificationExpression__OperatorAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3546:2: ( rule__ClassificationExpression__OperatorAssignment_1_2 )
            // InternalKerMLExpressions.g:3546:3: rule__ClassificationExpression__OperatorAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OperatorAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ClassificationExpression__Group_1__3"
    // InternalKerMLExpressions.g:3554:1: rule__ClassificationExpression__Group_1__3 : rule__ClassificationExpression__Group_1__3__Impl ;
    public final void rule__ClassificationExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3558:1: ( rule__ClassificationExpression__Group_1__3__Impl )
            // InternalKerMLExpressions.g:3559:2: rule__ClassificationExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_1__3"


    // $ANTLR start "rule__ClassificationExpression__Group_1__3__Impl"
    // InternalKerMLExpressions.g:3565:1: rule__ClassificationExpression__Group_1__3__Impl : ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 ) ) ;
    public final void rule__ClassificationExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3569:1: ( ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 ) ) )
            // InternalKerMLExpressions.g:3570:1: ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 ) )
            {
            // InternalKerMLExpressions.g:3570:1: ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 ) )
            // InternalKerMLExpressions.g:3571:2: ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipAssignment_1_3()); 
            }
            // InternalKerMLExpressions.g:3572:2: ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 )
            // InternalKerMLExpressions.g:3572:3: rule__ClassificationExpression__OwnedRelationshipAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OwnedRelationshipAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Group_1__3__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__0"
    // InternalKerMLExpressions.g:3581:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3585:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalKerMLExpressions.g:3586:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__0"


    // $ANTLR start "rule__RelationalExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:3593:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3597:1: ( ( ruleAdditiveExpression ) )
            // InternalKerMLExpressions.g:3598:1: ( ruleAdditiveExpression )
            {
            // InternalKerMLExpressions.g:3598:1: ( ruleAdditiveExpression )
            // InternalKerMLExpressions.g:3599:2: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__1"
    // InternalKerMLExpressions.g:3608:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3612:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3613:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__1"


    // $ANTLR start "rule__RelationalExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:3619:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3623:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3624:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3624:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3625:2: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3626:2: ( rule__RelationalExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=28 && LA31_0<=31)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3626:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__0"
    // InternalKerMLExpressions.g:3635:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3639:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3640:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0"


    // $ANTLR start "rule__RelationalExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:3647:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3651:1: ( ( () ) )
            // InternalKerMLExpressions.g:3652:1: ( () )
            {
            // InternalKerMLExpressions.g:3652:1: ( () )
            // InternalKerMLExpressions.g:3653:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3654:2: ()
            // InternalKerMLExpressions.g:3654:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__1"
    // InternalKerMLExpressions.g:3662:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3666:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3667:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__RelationalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__1"


    // $ANTLR start "rule__RelationalExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:3674:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3678:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3679:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3679:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3680:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3681:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3681:3: rule__RelationalExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__2"
    // InternalKerMLExpressions.g:3689:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3693:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3694:2: rule__RelationalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__2"


    // $ANTLR start "rule__RelationalExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:3700:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3704:1: ( ( ( rule__RelationalExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3705:1: ( ( rule__RelationalExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3705:1: ( ( rule__RelationalExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3706:2: ( rule__RelationalExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3707:2: ( rule__RelationalExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3707:3: rule__RelationalExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalKerMLExpressions.g:3716:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3720:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalKerMLExpressions.g:3721:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:3728:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3732:1: ( ( ruleMultiplicativeExpression ) )
            // InternalKerMLExpressions.g:3733:1: ( ruleMultiplicativeExpression )
            {
            // InternalKerMLExpressions.g:3733:1: ( ruleMultiplicativeExpression )
            // InternalKerMLExpressions.g:3734:2: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalKerMLExpressions.g:3743:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3747:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3748:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:3754:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3758:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3759:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3759:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3760:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3761:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=32 && LA32_0<=33)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3761:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalKerMLExpressions.g:3770:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3774:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3775:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:3782:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3786:1: ( ( () ) )
            // InternalKerMLExpressions.g:3787:1: ( () )
            {
            // InternalKerMLExpressions.g:3787:1: ( () )
            // InternalKerMLExpressions.g:3788:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3789:2: ()
            // InternalKerMLExpressions.g:3789:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalKerMLExpressions.g:3797:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3801:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3802:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:3809:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3813:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3814:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3814:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3815:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3816:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3816:3: rule__AdditiveExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2"
    // InternalKerMLExpressions.g:3824:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3828:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3829:2: rule__AdditiveExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__2"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:3835:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3839:1: ( ( ( rule__AdditiveExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3840:1: ( ( rule__AdditiveExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3840:1: ( ( rule__AdditiveExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3841:2: ( rule__AdditiveExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3842:2: ( rule__AdditiveExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3842:3: rule__AdditiveExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalKerMLExpressions.g:3851:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3855:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalKerMLExpressions.g:3856:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:3863:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleExponentiationExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3867:1: ( ( ruleExponentiationExpression ) )
            // InternalKerMLExpressions.g:3868:1: ( ruleExponentiationExpression )
            {
            // InternalKerMLExpressions.g:3868:1: ( ruleExponentiationExpression )
            // InternalKerMLExpressions.g:3869:2: ruleExponentiationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExponentiationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalKerMLExpressions.g:3878:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3882:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3883:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:3889:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3893:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3894:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3894:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3895:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3896:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=34 && LA33_0<=36)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3896:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalKerMLExpressions.g:3905:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3909:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3910:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:3917:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3921:1: ( ( () ) )
            // InternalKerMLExpressions.g:3922:1: ( () )
            {
            // InternalKerMLExpressions.g:3922:1: ( () )
            // InternalKerMLExpressions.g:3923:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3924:2: ()
            // InternalKerMLExpressions.g:3924:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalKerMLExpressions.g:3932:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3936:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3937:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:3944:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3948:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3949:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3949:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3950:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3951:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3951:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2"
    // InternalKerMLExpressions.g:3959:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3963:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3964:2: rule__MultiplicativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:3970:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3974:1: ( ( ( rule__MultiplicativeExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3975:1: ( ( rule__MultiplicativeExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3975:1: ( ( rule__MultiplicativeExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3976:2: ( rule__MultiplicativeExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3977:2: ( rule__MultiplicativeExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3977:3: rule__MultiplicativeExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group__0"
    // InternalKerMLExpressions.g:3986:1: rule__ExponentiationExpression__Group__0 : rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1 ;
    public final void rule__ExponentiationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3990:1: ( rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1 )
            // InternalKerMLExpressions.g:3991:2: rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ExponentiationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group__0"


    // $ANTLR start "rule__ExponentiationExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:3998:1: rule__ExponentiationExpression__Group__0__Impl : ( ruleUnitsExpression ) ;
    public final void rule__ExponentiationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4002:1: ( ( ruleUnitsExpression ) )
            // InternalKerMLExpressions.g:4003:1: ( ruleUnitsExpression )
            {
            // InternalKerMLExpressions.g:4003:1: ( ruleUnitsExpression )
            // InternalKerMLExpressions.g:4004:2: ruleUnitsExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getUnitsExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnitsExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getUnitsExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group__0__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group__1"
    // InternalKerMLExpressions.g:4013:1: rule__ExponentiationExpression__Group__1 : rule__ExponentiationExpression__Group__1__Impl ;
    public final void rule__ExponentiationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4017:1: ( rule__ExponentiationExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4018:2: rule__ExponentiationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group__1"


    // $ANTLR start "rule__ExponentiationExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:4024:1: rule__ExponentiationExpression__Group__1__Impl : ( ( rule__ExponentiationExpression__Group_1__0 )* ) ;
    public final void rule__ExponentiationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4028:1: ( ( ( rule__ExponentiationExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:4029:1: ( ( rule__ExponentiationExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:4029:1: ( ( rule__ExponentiationExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:4030:2: ( rule__ExponentiationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:4031:2: ( rule__ExponentiationExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4031:3: rule__ExponentiationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ExponentiationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group__1__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__0"
    // InternalKerMLExpressions.g:4040:1: rule__ExponentiationExpression__Group_1__0 : rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1 ;
    public final void rule__ExponentiationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4044:1: ( rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4045:2: rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ExponentiationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__0"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:4052:1: rule__ExponentiationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ExponentiationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4056:1: ( ( () ) )
            // InternalKerMLExpressions.g:4057:1: ( () )
            {
            // InternalKerMLExpressions.g:4057:1: ( () )
            // InternalKerMLExpressions.g:4058:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:4059:2: ()
            // InternalKerMLExpressions.g:4059:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__1"
    // InternalKerMLExpressions.g:4067:1: rule__ExponentiationExpression__Group_1__1 : rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2 ;
    public final void rule__ExponentiationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4071:1: ( rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4072:2: rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__ExponentiationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__1"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:4079:1: rule__ExponentiationExpression__Group_1__1__Impl : ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ExponentiationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4083:1: ( ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4084:1: ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4084:1: ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4085:2: ( rule__ExponentiationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:4086:2: ( rule__ExponentiationExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4086:3: rule__ExponentiationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__2"
    // InternalKerMLExpressions.g:4094:1: rule__ExponentiationExpression__Group_1__2 : rule__ExponentiationExpression__Group_1__2__Impl ;
    public final void rule__ExponentiationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4098:1: ( rule__ExponentiationExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4099:2: rule__ExponentiationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__2"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:4105:1: rule__ExponentiationExpression__Group_1__2__Impl : ( ( rule__ExponentiationExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__ExponentiationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4109:1: ( ( ( rule__ExponentiationExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4110:1: ( ( rule__ExponentiationExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4110:1: ( ( rule__ExponentiationExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4111:2: ( rule__ExponentiationExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:4112:2: ( rule__ExponentiationExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:4112:3: rule__ExponentiationExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnitsExpression__Group__0"
    // InternalKerMLExpressions.g:4121:1: rule__UnitsExpression__Group__0 : rule__UnitsExpression__Group__0__Impl rule__UnitsExpression__Group__1 ;
    public final void rule__UnitsExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4125:1: ( rule__UnitsExpression__Group__0__Impl rule__UnitsExpression__Group__1 )
            // InternalKerMLExpressions.g:4126:2: rule__UnitsExpression__Group__0__Impl rule__UnitsExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__UnitsExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group__0"


    // $ANTLR start "rule__UnitsExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:4133:1: rule__UnitsExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__UnitsExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4137:1: ( ( ruleUnaryExpression ) )
            // InternalKerMLExpressions.g:4138:1: ( ruleUnaryExpression )
            {
            // InternalKerMLExpressions.g:4138:1: ( ruleUnaryExpression )
            // InternalKerMLExpressions.g:4139:2: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group__0__Impl"


    // $ANTLR start "rule__UnitsExpression__Group__1"
    // InternalKerMLExpressions.g:4148:1: rule__UnitsExpression__Group__1 : rule__UnitsExpression__Group__1__Impl ;
    public final void rule__UnitsExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4152:1: ( rule__UnitsExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4153:2: rule__UnitsExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group__1"


    // $ANTLR start "rule__UnitsExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:4159:1: rule__UnitsExpression__Group__1__Impl : ( ( rule__UnitsExpression__Group_1__0 )? ) ;
    public final void rule__UnitsExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4163:1: ( ( ( rule__UnitsExpression__Group_1__0 )? ) )
            // InternalKerMLExpressions.g:4164:1: ( ( rule__UnitsExpression__Group_1__0 )? )
            {
            // InternalKerMLExpressions.g:4164:1: ( ( rule__UnitsExpression__Group_1__0 )? )
            // InternalKerMLExpressions.g:4165:2: ( rule__UnitsExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:4166:2: ( rule__UnitsExpression__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKerMLExpressions.g:4166:3: rule__UnitsExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnitsExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group__1__Impl"


    // $ANTLR start "rule__UnitsExpression__Group_1__0"
    // InternalKerMLExpressions.g:4175:1: rule__UnitsExpression__Group_1__0 : rule__UnitsExpression__Group_1__0__Impl rule__UnitsExpression__Group_1__1 ;
    public final void rule__UnitsExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4179:1: ( rule__UnitsExpression__Group_1__0__Impl rule__UnitsExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4180:2: rule__UnitsExpression__Group_1__0__Impl rule__UnitsExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__UnitsExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group_1__0"


    // $ANTLR start "rule__UnitsExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:4187:1: rule__UnitsExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnitsExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4191:1: ( ( () ) )
            // InternalKerMLExpressions.g:4192:1: ( () )
            {
            // InternalKerMLExpressions.g:4192:1: ( () )
            // InternalKerMLExpressions.g:4193:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:4194:2: ()
            // InternalKerMLExpressions.g:4194:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnitsExpression__Group_1__1"
    // InternalKerMLExpressions.g:4202:1: rule__UnitsExpression__Group_1__1 : rule__UnitsExpression__Group_1__1__Impl rule__UnitsExpression__Group_1__2 ;
    public final void rule__UnitsExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4206:1: ( rule__UnitsExpression__Group_1__1__Impl rule__UnitsExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4207:2: rule__UnitsExpression__Group_1__1__Impl rule__UnitsExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__UnitsExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group_1__1"


    // $ANTLR start "rule__UnitsExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:4214:1: rule__UnitsExpression__Group_1__1__Impl : ( ( rule__UnitsExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__UnitsExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4218:1: ( ( ( rule__UnitsExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4219:1: ( ( rule__UnitsExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4219:1: ( ( rule__UnitsExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4220:2: ( rule__UnitsExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:4221:2: ( rule__UnitsExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4221:3: rule__UnitsExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnitsExpression__Group_1__2"
    // InternalKerMLExpressions.g:4229:1: rule__UnitsExpression__Group_1__2 : rule__UnitsExpression__Group_1__2__Impl rule__UnitsExpression__Group_1__3 ;
    public final void rule__UnitsExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4233:1: ( rule__UnitsExpression__Group_1__2__Impl rule__UnitsExpression__Group_1__3 )
            // InternalKerMLExpressions.g:4234:2: rule__UnitsExpression__Group_1__2__Impl rule__UnitsExpression__Group_1__3
            {
            pushFollow(FOLLOW_31);
            rule__UnitsExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group_1__2"


    // $ANTLR start "rule__UnitsExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:4241:1: rule__UnitsExpression__Group_1__2__Impl : ( ( rule__UnitsExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__UnitsExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4245:1: ( ( ( rule__UnitsExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4246:1: ( ( rule__UnitsExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4246:1: ( ( rule__UnitsExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4247:2: ( rule__UnitsExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:4248:2: ( rule__UnitsExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:4248:3: rule__UnitsExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnitsExpression__Group_1__3"
    // InternalKerMLExpressions.g:4256:1: rule__UnitsExpression__Group_1__3 : rule__UnitsExpression__Group_1__3__Impl ;
    public final void rule__UnitsExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4260:1: ( rule__UnitsExpression__Group_1__3__Impl )
            // InternalKerMLExpressions.g:4261:2: rule__UnitsExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group_1__3"


    // $ANTLR start "rule__UnitsExpression__Group_1__3__Impl"
    // InternalKerMLExpressions.g:4267:1: rule__UnitsExpression__Group_1__3__Impl : ( ']' ) ;
    public final void rule__UnitsExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4271:1: ( ( ']' ) )
            // InternalKerMLExpressions.g:4272:1: ( ']' )
            {
            // InternalKerMLExpressions.g:4272:1: ( ']' )
            // InternalKerMLExpressions.g:4273:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getRightSquareBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Group_1__3__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // InternalKerMLExpressions.g:4283:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4287:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalKerMLExpressions.g:4288:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0__0__Impl"
    // InternalKerMLExpressions.g:4295:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4299:1: ( ( () ) )
            // InternalKerMLExpressions.g:4300:1: ( () )
            {
            // InternalKerMLExpressions.g:4300:1: ( () )
            // InternalKerMLExpressions.g:4301:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKerMLExpressions.g:4302:2: ()
            // InternalKerMLExpressions.g:4302:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__1"
    // InternalKerMLExpressions.g:4310:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4314:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalKerMLExpressions.g:4315:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0__1__Impl"
    // InternalKerMLExpressions.g:4322:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4326:1: ( ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) )
            // InternalKerMLExpressions.g:4327:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKerMLExpressions.g:4327:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            // InternalKerMLExpressions.g:4328:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKerMLExpressions.g:4329:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            // InternalKerMLExpressions.g:4329:3: rule__UnaryExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__2"
    // InternalKerMLExpressions.g:4337:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4341:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalKerMLExpressions.g:4342:2: rule__UnaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__2"


    // $ANTLR start "rule__UnaryExpression__Group_0__2__Impl"
    // InternalKerMLExpressions.g:4348:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4352:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalKerMLExpressions.g:4353:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalKerMLExpressions.g:4353:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalKerMLExpressions.g:4354:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }
            // InternalKerMLExpressions.g:4355:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalKerMLExpressions.g:4355:3: rule__UnaryExpression__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__ExtentExpression__Group_0__0"
    // InternalKerMLExpressions.g:4364:1: rule__ExtentExpression__Group_0__0 : rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1 ;
    public final void rule__ExtentExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4368:1: ( rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1 )
            // InternalKerMLExpressions.g:4369:2: rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__ExtentExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__Group_0__0"


    // $ANTLR start "rule__ExtentExpression__Group_0__0__Impl"
    // InternalKerMLExpressions.g:4376:1: rule__ExtentExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ExtentExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4380:1: ( ( () ) )
            // InternalKerMLExpressions.g:4381:1: ( () )
            {
            // InternalKerMLExpressions.g:4381:1: ( () )
            // InternalKerMLExpressions.g:4382:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKerMLExpressions.g:4383:2: ()
            // InternalKerMLExpressions.g:4383:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ExtentExpression__Group_0__1"
    // InternalKerMLExpressions.g:4391:1: rule__ExtentExpression__Group_0__1 : rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2 ;
    public final void rule__ExtentExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4395:1: ( rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2 )
            // InternalKerMLExpressions.g:4396:2: rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__ExtentExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__Group_0__1"


    // $ANTLR start "rule__ExtentExpression__Group_0__1__Impl"
    // InternalKerMLExpressions.g:4403:1: rule__ExtentExpression__Group_0__1__Impl : ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ExtentExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4407:1: ( ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) ) )
            // InternalKerMLExpressions.g:4408:1: ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKerMLExpressions.g:4408:1: ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) )
            // InternalKerMLExpressions.g:4409:2: ( rule__ExtentExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKerMLExpressions.g:4410:2: ( rule__ExtentExpression__OperatorAssignment_0_1 )
            // InternalKerMLExpressions.g:4410:3: rule__ExtentExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getOperatorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ExtentExpression__Group_0__2"
    // InternalKerMLExpressions.g:4418:1: rule__ExtentExpression__Group_0__2 : rule__ExtentExpression__Group_0__2__Impl ;
    public final void rule__ExtentExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4422:1: ( rule__ExtentExpression__Group_0__2__Impl )
            // InternalKerMLExpressions.g:4423:2: rule__ExtentExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__Group_0__2"


    // $ANTLR start "rule__ExtentExpression__Group_0__2__Impl"
    // InternalKerMLExpressions.g:4429:1: rule__ExtentExpression__Group_0__2__Impl : ( ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 ) ) ;
    public final void rule__ExtentExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4433:1: ( ( ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 ) ) )
            // InternalKerMLExpressions.g:4434:1: ( ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 ) )
            {
            // InternalKerMLExpressions.g:4434:1: ( ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 ) )
            // InternalKerMLExpressions.g:4435:2: ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipAssignment_0_2()); 
            }
            // InternalKerMLExpressions.g:4436:2: ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 )
            // InternalKerMLExpressions.g:4436:3: rule__ExtentExpression__OwnedRelationshipAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__OwnedRelationshipAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__Group_0__2__Impl"


    // $ANTLR start "rule__SequenceExpression__Group__0"
    // InternalKerMLExpressions.g:4445:1: rule__SequenceExpression__Group__0 : rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1 ;
    public final void rule__SequenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4449:1: ( rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1 )
            // InternalKerMLExpressions.g:4450:2: rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__SequenceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group__0"


    // $ANTLR start "rule__SequenceExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:4457:1: rule__SequenceExpression__Group__0__Impl : ( ( rule__SequenceExpression__Alternatives_0 ) ) ;
    public final void rule__SequenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4461:1: ( ( ( rule__SequenceExpression__Alternatives_0 ) ) )
            // InternalKerMLExpressions.g:4462:1: ( ( rule__SequenceExpression__Alternatives_0 ) )
            {
            // InternalKerMLExpressions.g:4462:1: ( ( rule__SequenceExpression__Alternatives_0 ) )
            // InternalKerMLExpressions.g:4463:2: ( rule__SequenceExpression__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getAlternatives_0()); 
            }
            // InternalKerMLExpressions.g:4464:2: ( rule__SequenceExpression__Alternatives_0 )
            // InternalKerMLExpressions.g:4464:3: rule__SequenceExpression__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group__0__Impl"


    // $ANTLR start "rule__SequenceExpression__Group__1"
    // InternalKerMLExpressions.g:4472:1: rule__SequenceExpression__Group__1 : rule__SequenceExpression__Group__1__Impl ;
    public final void rule__SequenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4476:1: ( rule__SequenceExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4477:2: rule__SequenceExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group__1"


    // $ANTLR start "rule__SequenceExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:4483:1: rule__SequenceExpression__Group__1__Impl : ( ( rule__SequenceExpression__Alternatives_1 )* ) ;
    public final void rule__SequenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4487:1: ( ( ( rule__SequenceExpression__Alternatives_1 )* ) )
            // InternalKerMLExpressions.g:4488:1: ( ( rule__SequenceExpression__Alternatives_1 )* )
            {
            // InternalKerMLExpressions.g:4488:1: ( ( rule__SequenceExpression__Alternatives_1 )* )
            // InternalKerMLExpressions.g:4489:2: ( rule__SequenceExpression__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getAlternatives_1()); 
            }
            // InternalKerMLExpressions.g:4490:2: ( rule__SequenceExpression__Alternatives_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=43 && LA36_0<=44)||LA36_0==55) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4490:3: rule__SequenceExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__SequenceExpression__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group__1__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_0__0"
    // InternalKerMLExpressions.g:4499:1: rule__SequenceExpression__Group_1_0__0 : rule__SequenceExpression__Group_1_0__0__Impl rule__SequenceExpression__Group_1_0__1 ;
    public final void rule__SequenceExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4503:1: ( rule__SequenceExpression__Group_1_0__0__Impl rule__SequenceExpression__Group_1_0__1 )
            // InternalKerMLExpressions.g:4504:2: rule__SequenceExpression__Group_1_0__0__Impl rule__SequenceExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_36);
            rule__SequenceExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_0__0"


    // $ANTLR start "rule__SequenceExpression__Group_1_0__0__Impl"
    // InternalKerMLExpressions.g:4511:1: rule__SequenceExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__SequenceExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4515:1: ( ( () ) )
            // InternalKerMLExpressions.g:4516:1: ( () )
            {
            // InternalKerMLExpressions.g:4516:1: ( () )
            // InternalKerMLExpressions.g:4517:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_0_0()); 
            }
            // InternalKerMLExpressions.g:4518:2: ()
            // InternalKerMLExpressions.g:4518:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_0__1"
    // InternalKerMLExpressions.g:4526:1: rule__SequenceExpression__Group_1_0__1 : rule__SequenceExpression__Group_1_0__1__Impl rule__SequenceExpression__Group_1_0__2 ;
    public final void rule__SequenceExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4530:1: ( rule__SequenceExpression__Group_1_0__1__Impl rule__SequenceExpression__Group_1_0__2 )
            // InternalKerMLExpressions.g:4531:2: rule__SequenceExpression__Group_1_0__1__Impl rule__SequenceExpression__Group_1_0__2
            {
            pushFollow(FOLLOW_4);
            rule__SequenceExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_0__1"


    // $ANTLR start "rule__SequenceExpression__Group_1_0__1__Impl"
    // InternalKerMLExpressions.g:4538:1: rule__SequenceExpression__Group_1_0__1__Impl : ( ( rule__SequenceExpression__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__SequenceExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4542:1: ( ( ( rule__SequenceExpression__OperatorAssignment_1_0_1 ) ) )
            // InternalKerMLExpressions.g:4543:1: ( ( rule__SequenceExpression__OperatorAssignment_1_0_1 ) )
            {
            // InternalKerMLExpressions.g:4543:1: ( ( rule__SequenceExpression__OperatorAssignment_1_0_1 ) )
            // InternalKerMLExpressions.g:4544:2: ( rule__SequenceExpression__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalKerMLExpressions.g:4545:2: ( rule__SequenceExpression__OperatorAssignment_1_0_1 )
            // InternalKerMLExpressions.g:4545:3: rule__SequenceExpression__OperatorAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__OperatorAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_0__2"
    // InternalKerMLExpressions.g:4553:1: rule__SequenceExpression__Group_1_0__2 : rule__SequenceExpression__Group_1_0__2__Impl rule__SequenceExpression__Group_1_0__3 ;
    public final void rule__SequenceExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4557:1: ( rule__SequenceExpression__Group_1_0__2__Impl rule__SequenceExpression__Group_1_0__3 )
            // InternalKerMLExpressions.g:4558:2: rule__SequenceExpression__Group_1_0__2__Impl rule__SequenceExpression__Group_1_0__3
            {
            pushFollow(FOLLOW_31);
            rule__SequenceExpression__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_0__2"


    // $ANTLR start "rule__SequenceExpression__Group_1_0__2__Impl"
    // InternalKerMLExpressions.g:4565:1: rule__SequenceExpression__Group_1_0__2__Impl : ( ( rule__SequenceExpression__OperandAssignment_1_0_2 ) ) ;
    public final void rule__SequenceExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4569:1: ( ( ( rule__SequenceExpression__OperandAssignment_1_0_2 ) ) )
            // InternalKerMLExpressions.g:4570:1: ( ( rule__SequenceExpression__OperandAssignment_1_0_2 ) )
            {
            // InternalKerMLExpressions.g:4570:1: ( ( rule__SequenceExpression__OperandAssignment_1_0_2 ) )
            // InternalKerMLExpressions.g:4571:2: ( rule__SequenceExpression__OperandAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperandAssignment_1_0_2()); 
            }
            // InternalKerMLExpressions.g:4572:2: ( rule__SequenceExpression__OperandAssignment_1_0_2 )
            // InternalKerMLExpressions.g:4572:3: rule__SequenceExpression__OperandAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__OperandAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperandAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_0__3"
    // InternalKerMLExpressions.g:4580:1: rule__SequenceExpression__Group_1_0__3 : rule__SequenceExpression__Group_1_0__3__Impl ;
    public final void rule__SequenceExpression__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4584:1: ( rule__SequenceExpression__Group_1_0__3__Impl )
            // InternalKerMLExpressions.g:4585:2: rule__SequenceExpression__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_0__3"


    // $ANTLR start "rule__SequenceExpression__Group_1_0__3__Impl"
    // InternalKerMLExpressions.g:4591:1: rule__SequenceExpression__Group_1_0__3__Impl : ( ']' ) ;
    public final void rule__SequenceExpression__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4595:1: ( ( ']' ) )
            // InternalKerMLExpressions.g:4596:1: ( ']' )
            {
            // InternalKerMLExpressions.g:4596:1: ( ']' )
            // InternalKerMLExpressions.g:4597:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getRightSquareBracketKeyword_1_0_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getRightSquareBracketKeyword_1_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_0__3__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_1__0"
    // InternalKerMLExpressions.g:4607:1: rule__SequenceExpression__Group_1_1__0 : rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1 ;
    public final void rule__SequenceExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4611:1: ( rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1 )
            // InternalKerMLExpressions.g:4612:2: rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_37);
            rule__SequenceExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_1__0"


    // $ANTLR start "rule__SequenceExpression__Group_1_1__0__Impl"
    // InternalKerMLExpressions.g:4619:1: rule__SequenceExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__SequenceExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4623:1: ( ( () ) )
            // InternalKerMLExpressions.g:4624:1: ( () )
            {
            // InternalKerMLExpressions.g:4624:1: ( () )
            // InternalKerMLExpressions.g:4625:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0()); 
            }
            // InternalKerMLExpressions.g:4626:2: ()
            // InternalKerMLExpressions.g:4626:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_1__1"
    // InternalKerMLExpressions.g:4634:1: rule__SequenceExpression__Group_1_1__1 : rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2 ;
    public final void rule__SequenceExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4638:1: ( rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2 )
            // InternalKerMLExpressions.g:4639:2: rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_21);
            rule__SequenceExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_1__1"


    // $ANTLR start "rule__SequenceExpression__Group_1_1__1__Impl"
    // InternalKerMLExpressions.g:4646:1: rule__SequenceExpression__Group_1_1__1__Impl : ( '->' ) ;
    public final void rule__SequenceExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4650:1: ( ( '->' ) )
            // InternalKerMLExpressions.g:4651:1: ( '->' )
            {
            // InternalKerMLExpressions.g:4651:1: ( '->' )
            // InternalKerMLExpressions.g:4652:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_1__2"
    // InternalKerMLExpressions.g:4661:1: rule__SequenceExpression__Group_1_1__2 : rule__SequenceExpression__Group_1_1__2__Impl rule__SequenceExpression__Group_1_1__3 ;
    public final void rule__SequenceExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4665:1: ( rule__SequenceExpression__Group_1_1__2__Impl rule__SequenceExpression__Group_1_1__3 )
            // InternalKerMLExpressions.g:4666:2: rule__SequenceExpression__Group_1_1__2__Impl rule__SequenceExpression__Group_1_1__3
            {
            pushFollow(FOLLOW_21);
            rule__SequenceExpression__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_1__2"


    // $ANTLR start "rule__SequenceExpression__Group_1_1__2__Impl"
    // InternalKerMLExpressions.g:4673:1: rule__SequenceExpression__Group_1_1__2__Impl : ( ( rule__SequenceExpression__OperatorAssignment_1_1_2 ) ) ;
    public final void rule__SequenceExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4677:1: ( ( ( rule__SequenceExpression__OperatorAssignment_1_1_2 ) ) )
            // InternalKerMLExpressions.g:4678:1: ( ( rule__SequenceExpression__OperatorAssignment_1_1_2 ) )
            {
            // InternalKerMLExpressions.g:4678:1: ( ( rule__SequenceExpression__OperatorAssignment_1_1_2 ) )
            // InternalKerMLExpressions.g:4679:2: ( rule__SequenceExpression__OperatorAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_1_2()); 
            }
            // InternalKerMLExpressions.g:4680:2: ( rule__SequenceExpression__OperatorAssignment_1_1_2 )
            // InternalKerMLExpressions.g:4680:3: rule__SequenceExpression__OperatorAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__OperatorAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_1__3"
    // InternalKerMLExpressions.g:4688:1: rule__SequenceExpression__Group_1_1__3 : rule__SequenceExpression__Group_1_1__3__Impl ;
    public final void rule__SequenceExpression__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4692:1: ( rule__SequenceExpression__Group_1_1__3__Impl )
            // InternalKerMLExpressions.g:4693:2: rule__SequenceExpression__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_1__3"


    // $ANTLR start "rule__SequenceExpression__Group_1_1__3__Impl"
    // InternalKerMLExpressions.g:4699:1: rule__SequenceExpression__Group_1_1__3__Impl : ( ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )* ) ) ;
    public final void rule__SequenceExpression__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4703:1: ( ( ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )* ) ) )
            // InternalKerMLExpressions.g:4704:1: ( ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )* ) )
            {
            // InternalKerMLExpressions.g:4704:1: ( ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )* ) )
            // InternalKerMLExpressions.g:4705:2: ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )* )
            {
            // InternalKerMLExpressions.g:4705:2: ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 ) )
            // InternalKerMLExpressions.g:4706:3: ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOwnedRelationshipAssignment_1_1_3()); 
            }
            // InternalKerMLExpressions.g:4707:3: ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )
            // InternalKerMLExpressions.g:4707:4: rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3
            {
            pushFollow(FOLLOW_38);
            rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOwnedRelationshipAssignment_1_1_3()); 
            }

            }

            // InternalKerMLExpressions.g:4710:2: ( ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )* )
            // InternalKerMLExpressions.g:4711:3: ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOwnedRelationshipAssignment_1_1_3()); 
            }
            // InternalKerMLExpressions.g:4712:3: ( rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4712:4: rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOwnedRelationshipAssignment_1_1_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_1__3__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_2__0"
    // InternalKerMLExpressions.g:4722:1: rule__SequenceExpression__Group_1_2__0 : rule__SequenceExpression__Group_1_2__0__Impl rule__SequenceExpression__Group_1_2__1 ;
    public final void rule__SequenceExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4726:1: ( rule__SequenceExpression__Group_1_2__0__Impl rule__SequenceExpression__Group_1_2__1 )
            // InternalKerMLExpressions.g:4727:2: rule__SequenceExpression__Group_1_2__0__Impl rule__SequenceExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_34);
            rule__SequenceExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_2__0"


    // $ANTLR start "rule__SequenceExpression__Group_1_2__0__Impl"
    // InternalKerMLExpressions.g:4734:1: rule__SequenceExpression__Group_1_2__0__Impl : ( () ) ;
    public final void rule__SequenceExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4738:1: ( ( () ) )
            // InternalKerMLExpressions.g:4739:1: ( () )
            {
            // InternalKerMLExpressions.g:4739:1: ( () )
            // InternalKerMLExpressions.g:4740:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getQueryPathStepExpressionOperandAction_1_2_0()); 
            }
            // InternalKerMLExpressions.g:4741:2: ()
            // InternalKerMLExpressions.g:4741:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getQueryPathStepExpressionOperandAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_2__1"
    // InternalKerMLExpressions.g:4749:1: rule__SequenceExpression__Group_1_2__1 : rule__SequenceExpression__Group_1_2__1__Impl rule__SequenceExpression__Group_1_2__2 ;
    public final void rule__SequenceExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4753:1: ( rule__SequenceExpression__Group_1_2__1__Impl rule__SequenceExpression__Group_1_2__2 )
            // InternalKerMLExpressions.g:4754:2: rule__SequenceExpression__Group_1_2__1__Impl rule__SequenceExpression__Group_1_2__2
            {
            pushFollow(FOLLOW_21);
            rule__SequenceExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_2__1"


    // $ANTLR start "rule__SequenceExpression__Group_1_2__1__Impl"
    // InternalKerMLExpressions.g:4761:1: rule__SequenceExpression__Group_1_2__1__Impl : ( '.' ) ;
    public final void rule__SequenceExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4765:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:4766:1: ( '.' )
            {
            // InternalKerMLExpressions.g:4766:1: ( '.' )
            // InternalKerMLExpressions.g:4767:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getFullStopKeyword_1_2_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getFullStopKeyword_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1_2__2"
    // InternalKerMLExpressions.g:4776:1: rule__SequenceExpression__Group_1_2__2 : rule__SequenceExpression__Group_1_2__2__Impl ;
    public final void rule__SequenceExpression__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4780:1: ( rule__SequenceExpression__Group_1_2__2__Impl )
            // InternalKerMLExpressions.g:4781:2: rule__SequenceExpression__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_2__2"


    // $ANTLR start "rule__SequenceExpression__Group_1_2__2__Impl"
    // InternalKerMLExpressions.g:4787:1: rule__SequenceExpression__Group_1_2__2__Impl : ( ( rule__SequenceExpression__OperandAssignment_1_2_2 ) ) ;
    public final void rule__SequenceExpression__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4791:1: ( ( ( rule__SequenceExpression__OperandAssignment_1_2_2 ) ) )
            // InternalKerMLExpressions.g:4792:1: ( ( rule__SequenceExpression__OperandAssignment_1_2_2 ) )
            {
            // InternalKerMLExpressions.g:4792:1: ( ( rule__SequenceExpression__OperandAssignment_1_2_2 ) )
            // InternalKerMLExpressions.g:4793:2: ( rule__SequenceExpression__OperandAssignment_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperandAssignment_1_2_2()); 
            }
            // InternalKerMLExpressions.g:4794:2: ( rule__SequenceExpression__OperandAssignment_1_2_2 )
            // InternalKerMLExpressions.g:4794:3: rule__SequenceExpression__OperandAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__OperandAssignment_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperandAssignment_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1_2__2__Impl"


    // $ANTLR start "rule__BodyExpression__Group_0__0"
    // InternalKerMLExpressions.g:4803:1: rule__BodyExpression__Group_0__0 : rule__BodyExpression__Group_0__0__Impl ;
    public final void rule__BodyExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4807:1: ( rule__BodyExpression__Group_0__0__Impl )
            // InternalKerMLExpressions.g:4808:2: rule__BodyExpression__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0__0"


    // $ANTLR start "rule__BodyExpression__Group_0__0__Impl"
    // InternalKerMLExpressions.g:4814:1: rule__BodyExpression__Group_0__0__Impl : ( ( rule__BodyExpression__Group_0_0__0 ) ) ;
    public final void rule__BodyExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4818:1: ( ( ( rule__BodyExpression__Group_0_0__0 ) ) )
            // InternalKerMLExpressions.g:4819:1: ( ( rule__BodyExpression__Group_0_0__0 ) )
            {
            // InternalKerMLExpressions.g:4819:1: ( ( rule__BodyExpression__Group_0_0__0 ) )
            // InternalKerMLExpressions.g:4820:2: ( rule__BodyExpression__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getGroup_0_0()); 
            }
            // InternalKerMLExpressions.g:4821:2: ( rule__BodyExpression__Group_0_0__0 )
            // InternalKerMLExpressions.g:4821:3: rule__BodyExpression__Group_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpression__Group_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getGroup_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0__0__Impl"


    // $ANTLR start "rule__BodyExpression__Group_0_0__0"
    // InternalKerMLExpressions.g:4830:1: rule__BodyExpression__Group_0_0__0 : rule__BodyExpression__Group_0_0__0__Impl rule__BodyExpression__Group_0_0__1 ;
    public final void rule__BodyExpression__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4834:1: ( rule__BodyExpression__Group_0_0__0__Impl rule__BodyExpression__Group_0_0__1 )
            // InternalKerMLExpressions.g:4835:2: rule__BodyExpression__Group_0_0__0__Impl rule__BodyExpression__Group_0_0__1
            {
            pushFollow(FOLLOW_39);
            rule__BodyExpression__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BodyExpression__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__0"


    // $ANTLR start "rule__BodyExpression__Group_0_0__0__Impl"
    // InternalKerMLExpressions.g:4842:1: rule__BodyExpression__Group_0_0__0__Impl : ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_0 ) ) ;
    public final void rule__BodyExpression__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4846:1: ( ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_0 ) ) )
            // InternalKerMLExpressions.g:4847:1: ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_0 ) )
            {
            // InternalKerMLExpressions.g:4847:1: ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_0 ) )
            // InternalKerMLExpressions.g:4848:2: ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipAssignment_0_0_0()); 
            }
            // InternalKerMLExpressions.g:4849:2: ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_0 )
            // InternalKerMLExpressions.g:4849:3: rule__BodyExpression__OwnedRelationshipAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpression__OwnedRelationshipAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__0__Impl"


    // $ANTLR start "rule__BodyExpression__Group_0_0__1"
    // InternalKerMLExpressions.g:4857:1: rule__BodyExpression__Group_0_0__1 : rule__BodyExpression__Group_0_0__1__Impl rule__BodyExpression__Group_0_0__2 ;
    public final void rule__BodyExpression__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4861:1: ( rule__BodyExpression__Group_0_0__1__Impl rule__BodyExpression__Group_0_0__2 )
            // InternalKerMLExpressions.g:4862:2: rule__BodyExpression__Group_0_0__1__Impl rule__BodyExpression__Group_0_0__2
            {
            pushFollow(FOLLOW_39);
            rule__BodyExpression__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BodyExpression__Group_0_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__1"


    // $ANTLR start "rule__BodyExpression__Group_0_0__1__Impl"
    // InternalKerMLExpressions.g:4869:1: rule__BodyExpression__Group_0_0__1__Impl : ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_1 )* ) ;
    public final void rule__BodyExpression__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4873:1: ( ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_1 )* ) )
            // InternalKerMLExpressions.g:4874:1: ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_1 )* )
            {
            // InternalKerMLExpressions.g:4874:1: ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_1 )* )
            // InternalKerMLExpressions.g:4875:2: ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipAssignment_0_0_1()); 
            }
            // InternalKerMLExpressions.g:4876:2: ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_UNRESTRICTED_NAME)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4876:3: rule__BodyExpression__OwnedRelationshipAssignment_0_0_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__BodyExpression__OwnedRelationshipAssignment_0_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipAssignment_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__1__Impl"


    // $ANTLR start "rule__BodyExpression__Group_0_0__2"
    // InternalKerMLExpressions.g:4884:1: rule__BodyExpression__Group_0_0__2 : rule__BodyExpression__Group_0_0__2__Impl rule__BodyExpression__Group_0_0__3 ;
    public final void rule__BodyExpression__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4888:1: ( rule__BodyExpression__Group_0_0__2__Impl rule__BodyExpression__Group_0_0__3 )
            // InternalKerMLExpressions.g:4889:2: rule__BodyExpression__Group_0_0__2__Impl rule__BodyExpression__Group_0_0__3
            {
            pushFollow(FOLLOW_4);
            rule__BodyExpression__Group_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BodyExpression__Group_0_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__2"


    // $ANTLR start "rule__BodyExpression__Group_0_0__2__Impl"
    // InternalKerMLExpressions.g:4896:1: rule__BodyExpression__Group_0_0__2__Impl : ( '(' ) ;
    public final void rule__BodyExpression__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4900:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:4901:1: ( '(' )
            {
            // InternalKerMLExpressions.g:4901:1: ( '(' )
            // InternalKerMLExpressions.g:4902:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getLeftParenthesisKeyword_0_0_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getLeftParenthesisKeyword_0_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__2__Impl"


    // $ANTLR start "rule__BodyExpression__Group_0_0__3"
    // InternalKerMLExpressions.g:4911:1: rule__BodyExpression__Group_0_0__3 : rule__BodyExpression__Group_0_0__3__Impl rule__BodyExpression__Group_0_0__4 ;
    public final void rule__BodyExpression__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4915:1: ( rule__BodyExpression__Group_0_0__3__Impl rule__BodyExpression__Group_0_0__4 )
            // InternalKerMLExpressions.g:4916:2: rule__BodyExpression__Group_0_0__3__Impl rule__BodyExpression__Group_0_0__4
            {
            pushFollow(FOLLOW_40);
            rule__BodyExpression__Group_0_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BodyExpression__Group_0_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__3"


    // $ANTLR start "rule__BodyExpression__Group_0_0__3__Impl"
    // InternalKerMLExpressions.g:4923:1: rule__BodyExpression__Group_0_0__3__Impl : ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_3 ) ) ;
    public final void rule__BodyExpression__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4927:1: ( ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_3 ) ) )
            // InternalKerMLExpressions.g:4928:1: ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_3 ) )
            {
            // InternalKerMLExpressions.g:4928:1: ( ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_3 ) )
            // InternalKerMLExpressions.g:4929:2: ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipAssignment_0_0_3()); 
            }
            // InternalKerMLExpressions.g:4930:2: ( rule__BodyExpression__OwnedRelationshipAssignment_0_0_3 )
            // InternalKerMLExpressions.g:4930:3: rule__BodyExpression__OwnedRelationshipAssignment_0_0_3
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpression__OwnedRelationshipAssignment_0_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipAssignment_0_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__3__Impl"


    // $ANTLR start "rule__BodyExpression__Group_0_0__4"
    // InternalKerMLExpressions.g:4938:1: rule__BodyExpression__Group_0_0__4 : rule__BodyExpression__Group_0_0__4__Impl ;
    public final void rule__BodyExpression__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4942:1: ( rule__BodyExpression__Group_0_0__4__Impl )
            // InternalKerMLExpressions.g:4943:2: rule__BodyExpression__Group_0_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpression__Group_0_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__4"


    // $ANTLR start "rule__BodyExpression__Group_0_0__4__Impl"
    // InternalKerMLExpressions.g:4949:1: rule__BodyExpression__Group_0_0__4__Impl : ( ')' ) ;
    public final void rule__BodyExpression__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4953:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:4954:1: ( ')' )
            {
            // InternalKerMLExpressions.g:4954:1: ( ')' )
            // InternalKerMLExpressions.g:4955:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getRightParenthesisKeyword_0_0_4()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getRightParenthesisKeyword_0_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__Group_0_0__4__Impl"


    // $ANTLR start "rule__BodyParameterMember__Group__0"
    // InternalKerMLExpressions.g:4965:1: rule__BodyParameterMember__Group__0 : rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1 ;
    public final void rule__BodyParameterMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4969:1: ( rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1 )
            // InternalKerMLExpressions.g:4970:2: rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__BodyParameterMember__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__Group__0"


    // $ANTLR start "rule__BodyParameterMember__Group__0__Impl"
    // InternalKerMLExpressions.g:4977:1: rule__BodyParameterMember__Group__0__Impl : ( ( rule__BodyParameterMember__MemberNameAssignment_0 ) ) ;
    public final void rule__BodyParameterMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4981:1: ( ( ( rule__BodyParameterMember__MemberNameAssignment_0 ) ) )
            // InternalKerMLExpressions.g:4982:1: ( ( rule__BodyParameterMember__MemberNameAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:4982:1: ( ( rule__BodyParameterMember__MemberNameAssignment_0 ) )
            // InternalKerMLExpressions.g:4983:2: ( rule__BodyParameterMember__MemberNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberAccess().getMemberNameAssignment_0()); 
            }
            // InternalKerMLExpressions.g:4984:2: ( rule__BodyParameterMember__MemberNameAssignment_0 )
            // InternalKerMLExpressions.g:4984:3: rule__BodyParameterMember__MemberNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__MemberNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterMemberAccess().getMemberNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__Group__0__Impl"


    // $ANTLR start "rule__BodyParameterMember__Group__1"
    // InternalKerMLExpressions.g:4992:1: rule__BodyParameterMember__Group__1 : rule__BodyParameterMember__Group__1__Impl ;
    public final void rule__BodyParameterMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4996:1: ( rule__BodyParameterMember__Group__1__Impl )
            // InternalKerMLExpressions.g:4997:2: rule__BodyParameterMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__Group__1"


    // $ANTLR start "rule__BodyParameterMember__Group__1__Impl"
    // InternalKerMLExpressions.g:5003:1: rule__BodyParameterMember__Group__1__Impl : ( ( rule__BodyParameterMember__OwnedRelatedElementAssignment_1 ) ) ;
    public final void rule__BodyParameterMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5007:1: ( ( ( rule__BodyParameterMember__OwnedRelatedElementAssignment_1 ) ) )
            // InternalKerMLExpressions.g:5008:1: ( ( rule__BodyParameterMember__OwnedRelatedElementAssignment_1 ) )
            {
            // InternalKerMLExpressions.g:5008:1: ( ( rule__BodyParameterMember__OwnedRelatedElementAssignment_1 ) )
            // InternalKerMLExpressions.g:5009:2: ( rule__BodyParameterMember__OwnedRelatedElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementAssignment_1()); 
            }
            // InternalKerMLExpressions.g:5010:2: ( rule__BodyParameterMember__OwnedRelatedElementAssignment_1 )
            // InternalKerMLExpressions.g:5010:3: rule__BodyParameterMember__OwnedRelatedElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__OwnedRelatedElementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__Group__1__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_0__0"
    // InternalKerMLExpressions.g:5019:1: rule__SequenceConstructionExpression__Group_0__0 : rule__SequenceConstructionExpression__Group_0__0__Impl rule__SequenceConstructionExpression__Group_0__1 ;
    public final void rule__SequenceConstructionExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5023:1: ( rule__SequenceConstructionExpression__Group_0__0__Impl rule__SequenceConstructionExpression__Group_0__1 )
            // InternalKerMLExpressions.g:5024:2: rule__SequenceConstructionExpression__Group_0__0__Impl rule__SequenceConstructionExpression__Group_0__1
            {
            pushFollow(FOLLOW_41);
            rule__SequenceConstructionExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_0__0"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_0__0__Impl"
    // InternalKerMLExpressions.g:5031:1: rule__SequenceConstructionExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5035:1: ( ( () ) )
            // InternalKerMLExpressions.g:5036:1: ( () )
            {
            // InternalKerMLExpressions.g:5036:1: ( () )
            // InternalKerMLExpressions.g:5037:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getNullExpressionAction_0_0()); 
            }
            // InternalKerMLExpressions.g:5038:2: ()
            // InternalKerMLExpressions.g:5038:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getNullExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_0__0__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_0__1"
    // InternalKerMLExpressions.g:5046:1: rule__SequenceConstructionExpression__Group_0__1 : rule__SequenceConstructionExpression__Group_0__1__Impl rule__SequenceConstructionExpression__Group_0__2 ;
    public final void rule__SequenceConstructionExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5050:1: ( rule__SequenceConstructionExpression__Group_0__1__Impl rule__SequenceConstructionExpression__Group_0__2 )
            // InternalKerMLExpressions.g:5051:2: rule__SequenceConstructionExpression__Group_0__1__Impl rule__SequenceConstructionExpression__Group_0__2
            {
            pushFollow(FOLLOW_42);
            rule__SequenceConstructionExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_0__1"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_0__1__Impl"
    // InternalKerMLExpressions.g:5058:1: rule__SequenceConstructionExpression__Group_0__1__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5062:1: ( ( '{' ) )
            // InternalKerMLExpressions.g:5063:1: ( '{' )
            {
            // InternalKerMLExpressions.g:5063:1: ( '{' )
            // InternalKerMLExpressions.g:5064:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_0_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_0__1__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_0__2"
    // InternalKerMLExpressions.g:5073:1: rule__SequenceConstructionExpression__Group_0__2 : rule__SequenceConstructionExpression__Group_0__2__Impl ;
    public final void rule__SequenceConstructionExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5077:1: ( rule__SequenceConstructionExpression__Group_0__2__Impl )
            // InternalKerMLExpressions.g:5078:2: rule__SequenceConstructionExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_0__2"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_0__2__Impl"
    // InternalKerMLExpressions.g:5084:1: rule__SequenceConstructionExpression__Group_0__2__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5088:1: ( ( '}' ) )
            // InternalKerMLExpressions.g:5089:1: ( '}' )
            {
            // InternalKerMLExpressions.g:5089:1: ( '}' )
            // InternalKerMLExpressions.g:5090:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_0_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_0__2__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1__0"
    // InternalKerMLExpressions.g:5100:1: rule__SequenceConstructionExpression__Group_1__0 : rule__SequenceConstructionExpression__Group_1__0__Impl rule__SequenceConstructionExpression__Group_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5104:1: ( rule__SequenceConstructionExpression__Group_1__0__Impl rule__SequenceConstructionExpression__Group_1__1 )
            // InternalKerMLExpressions.g:5105:2: rule__SequenceConstructionExpression__Group_1__0__Impl rule__SequenceConstructionExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SequenceConstructionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1__0"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:5112:1: rule__SequenceConstructionExpression__Group_1__0__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5116:1: ( ( '{' ) )
            // InternalKerMLExpressions.g:5117:1: ( '{' )
            {
            // InternalKerMLExpressions.g:5117:1: ( '{' )
            // InternalKerMLExpressions.g:5118:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1__1"
    // InternalKerMLExpressions.g:5127:1: rule__SequenceConstructionExpression__Group_1__1 : rule__SequenceConstructionExpression__Group_1__1__Impl rule__SequenceConstructionExpression__Group_1__2 ;
    public final void rule__SequenceConstructionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5131:1: ( rule__SequenceConstructionExpression__Group_1__1__Impl rule__SequenceConstructionExpression__Group_1__2 )
            // InternalKerMLExpressions.g:5132:2: rule__SequenceConstructionExpression__Group_1__1__Impl rule__SequenceConstructionExpression__Group_1__2
            {
            pushFollow(FOLLOW_43);
            rule__SequenceConstructionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1__1"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:5139:1: rule__SequenceConstructionExpression__Group_1__1__Impl : ( ruleOwnedExpression ) ;
    public final void rule__SequenceConstructionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5143:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:5144:1: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:5144:1: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:5145:2: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOwnedExpressionParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOwnedExpressionParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1__2"
    // InternalKerMLExpressions.g:5154:1: rule__SequenceConstructionExpression__Group_1__2 : rule__SequenceConstructionExpression__Group_1__2__Impl rule__SequenceConstructionExpression__Group_1__3 ;
    public final void rule__SequenceConstructionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5158:1: ( rule__SequenceConstructionExpression__Group_1__2__Impl rule__SequenceConstructionExpression__Group_1__3 )
            // InternalKerMLExpressions.g:5159:2: rule__SequenceConstructionExpression__Group_1__2__Impl rule__SequenceConstructionExpression__Group_1__3
            {
            pushFollow(FOLLOW_43);
            rule__SequenceConstructionExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1__2"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:5166:1: rule__SequenceConstructionExpression__Group_1__2__Impl : ( ( rule__SequenceConstructionExpression__Alternatives_1_2 )? ) ;
    public final void rule__SequenceConstructionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5170:1: ( ( ( rule__SequenceConstructionExpression__Alternatives_1_2 )? ) )
            // InternalKerMLExpressions.g:5171:1: ( ( rule__SequenceConstructionExpression__Alternatives_1_2 )? )
            {
            // InternalKerMLExpressions.g:5171:1: ( ( rule__SequenceConstructionExpression__Alternatives_1_2 )? )
            // InternalKerMLExpressions.g:5172:2: ( rule__SequenceConstructionExpression__Alternatives_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getAlternatives_1_2()); 
            }
            // InternalKerMLExpressions.g:5173:2: ( rule__SequenceConstructionExpression__Alternatives_1_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49||LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKerMLExpressions.g:5173:3: rule__SequenceConstructionExpression__Alternatives_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceConstructionExpression__Alternatives_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getAlternatives_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1__3"
    // InternalKerMLExpressions.g:5181:1: rule__SequenceConstructionExpression__Group_1__3 : rule__SequenceConstructionExpression__Group_1__3__Impl ;
    public final void rule__SequenceConstructionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5185:1: ( rule__SequenceConstructionExpression__Group_1__3__Impl )
            // InternalKerMLExpressions.g:5186:2: rule__SequenceConstructionExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1__3"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1__3__Impl"
    // InternalKerMLExpressions.g:5192:1: rule__SequenceConstructionExpression__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5196:1: ( ( '}' ) )
            // InternalKerMLExpressions.g:5197:1: ( '}' )
            {
            // InternalKerMLExpressions.g:5197:1: ( '}' )
            // InternalKerMLExpressions.g:5198:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_1_3()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1__3__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_0__0"
    // InternalKerMLExpressions.g:5208:1: rule__SequenceConstructionExpression__Group_1_2_0__0 : rule__SequenceConstructionExpression__Group_1_2_0__0__Impl rule__SequenceConstructionExpression__Group_1_2_0__1 ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5212:1: ( rule__SequenceConstructionExpression__Group_1_2_0__0__Impl rule__SequenceConstructionExpression__Group_1_2_0__1 )
            // InternalKerMLExpressions.g:5213:2: rule__SequenceConstructionExpression__Group_1_2_0__0__Impl rule__SequenceConstructionExpression__Group_1_2_0__1
            {
            pushFollow(FOLLOW_44);
            rule__SequenceConstructionExpression__Group_1_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_0__0"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_0__0__Impl"
    // InternalKerMLExpressions.g:5220:1: rule__SequenceConstructionExpression__Group_1_2_0__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5224:1: ( ( () ) )
            // InternalKerMLExpressions.g:5225:1: ( () )
            {
            // InternalKerMLExpressions.g:5225:1: ( () )
            // InternalKerMLExpressions.g:5226:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperandAction_1_2_0_0()); 
            }
            // InternalKerMLExpressions.g:5227:2: ()
            // InternalKerMLExpressions.g:5227:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperandAction_1_2_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_0__0__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_0__1"
    // InternalKerMLExpressions.g:5235:1: rule__SequenceConstructionExpression__Group_1_2_0__1 : rule__SequenceConstructionExpression__Group_1_2_0__1__Impl rule__SequenceConstructionExpression__Group_1_2_0__2 ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5239:1: ( rule__SequenceConstructionExpression__Group_1_2_0__1__Impl rule__SequenceConstructionExpression__Group_1_2_0__2 )
            // InternalKerMLExpressions.g:5240:2: rule__SequenceConstructionExpression__Group_1_2_0__1__Impl rule__SequenceConstructionExpression__Group_1_2_0__2
            {
            pushFollow(FOLLOW_4);
            rule__SequenceConstructionExpression__Group_1_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_0__1"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_0__1__Impl"
    // InternalKerMLExpressions.g:5247:1: rule__SequenceConstructionExpression__Group_1_2_0__1__Impl : ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5251:1: ( ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 ) ) )
            // InternalKerMLExpressions.g:5252:1: ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 ) )
            {
            // InternalKerMLExpressions.g:5252:1: ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 ) )
            // InternalKerMLExpressions.g:5253:2: ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorAssignment_1_2_0_1()); 
            }
            // InternalKerMLExpressions.g:5254:2: ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 )
            // InternalKerMLExpressions.g:5254:3: rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorAssignment_1_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_0__1__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_0__2"
    // InternalKerMLExpressions.g:5262:1: rule__SequenceConstructionExpression__Group_1_2_0__2 : rule__SequenceConstructionExpression__Group_1_2_0__2__Impl ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5266:1: ( rule__SequenceConstructionExpression__Group_1_2_0__2__Impl )
            // InternalKerMLExpressions.g:5267:2: rule__SequenceConstructionExpression__Group_1_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_0__2"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_0__2__Impl"
    // InternalKerMLExpressions.g:5273:1: rule__SequenceConstructionExpression__Group_1_2_0__2__Impl : ( ( rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5277:1: ( ( ( rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2 ) ) )
            // InternalKerMLExpressions.g:5278:1: ( ( rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2 ) )
            {
            // InternalKerMLExpressions.g:5278:1: ( ( rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2 ) )
            // InternalKerMLExpressions.g:5279:2: ( rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperandAssignment_1_2_0_2()); 
            }
            // InternalKerMLExpressions.g:5280:2: ( rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2 )
            // InternalKerMLExpressions.g:5280:3: rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperandAssignment_1_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_0__2__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_1__0"
    // InternalKerMLExpressions.g:5289:1: rule__SequenceConstructionExpression__Group_1_2_1__0 : rule__SequenceConstructionExpression__Group_1_2_1__0__Impl rule__SequenceConstructionExpression__Group_1_2_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5293:1: ( rule__SequenceConstructionExpression__Group_1_2_1__0__Impl rule__SequenceConstructionExpression__Group_1_2_1__1 )
            // InternalKerMLExpressions.g:5294:2: rule__SequenceConstructionExpression__Group_1_2_1__0__Impl rule__SequenceConstructionExpression__Group_1_2_1__1
            {
            pushFollow(FOLLOW_45);
            rule__SequenceConstructionExpression__Group_1_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_1__0"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_1__0__Impl"
    // InternalKerMLExpressions.g:5301:1: rule__SequenceConstructionExpression__Group_1_2_1__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5305:1: ( ( () ) )
            // InternalKerMLExpressions.g:5306:1: ( () )
            {
            // InternalKerMLExpressions.g:5306:1: ( () )
            // InternalKerMLExpressions.g:5307:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperandAction_1_2_1_0()); 
            }
            // InternalKerMLExpressions.g:5308:2: ()
            // InternalKerMLExpressions.g:5308:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperandAction_1_2_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_1__1"
    // InternalKerMLExpressions.g:5316:1: rule__SequenceConstructionExpression__Group_1_2_1__1 : rule__SequenceConstructionExpression__Group_1_2_1__1__Impl rule__SequenceConstructionExpression__Group_1_2_1__2 ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5320:1: ( rule__SequenceConstructionExpression__Group_1_2_1__1__Impl rule__SequenceConstructionExpression__Group_1_2_1__2 )
            // InternalKerMLExpressions.g:5321:2: rule__SequenceConstructionExpression__Group_1_2_1__1__Impl rule__SequenceConstructionExpression__Group_1_2_1__2
            {
            pushFollow(FOLLOW_4);
            rule__SequenceConstructionExpression__Group_1_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_1__1"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_1__1__Impl"
    // InternalKerMLExpressions.g:5328:1: rule__SequenceConstructionExpression__Group_1_2_1__1__Impl : ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5332:1: ( ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 ) ) )
            // InternalKerMLExpressions.g:5333:1: ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 ) )
            {
            // InternalKerMLExpressions.g:5333:1: ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 ) )
            // InternalKerMLExpressions.g:5334:2: ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorAssignment_1_2_1_1()); 
            }
            // InternalKerMLExpressions.g:5335:2: ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 )
            // InternalKerMLExpressions.g:5335:3: rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorAssignment_1_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_1__2"
    // InternalKerMLExpressions.g:5343:1: rule__SequenceConstructionExpression__Group_1_2_1__2 : rule__SequenceConstructionExpression__Group_1_2_1__2__Impl ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5347:1: ( rule__SequenceConstructionExpression__Group_1_2_1__2__Impl )
            // InternalKerMLExpressions.g:5348:2: rule__SequenceConstructionExpression__Group_1_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_1_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_1__2"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_1_2_1__2__Impl"
    // InternalKerMLExpressions.g:5354:1: rule__SequenceConstructionExpression__Group_1_2_1__2__Impl : ( ( rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5358:1: ( ( ( rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2 ) ) )
            // InternalKerMLExpressions.g:5359:1: ( ( rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2 ) )
            {
            // InternalKerMLExpressions.g:5359:1: ( ( rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2 ) )
            // InternalKerMLExpressions.g:5360:2: ( rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperandAssignment_1_2_1_2()); 
            }
            // InternalKerMLExpressions.g:5361:2: ( rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2 )
            // InternalKerMLExpressions.g:5361:3: rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperandAssignment_1_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_1_2_1__2__Impl"


    // $ANTLR start "rule__SequenceElementList__Group__0"
    // InternalKerMLExpressions.g:5370:1: rule__SequenceElementList__Group__0 : rule__SequenceElementList__Group__0__Impl rule__SequenceElementList__Group__1 ;
    public final void rule__SequenceElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5374:1: ( rule__SequenceElementList__Group__0__Impl rule__SequenceElementList__Group__1 )
            // InternalKerMLExpressions.g:5375:2: rule__SequenceElementList__Group__0__Impl rule__SequenceElementList__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__SequenceElementList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group__0"


    // $ANTLR start "rule__SequenceElementList__Group__0__Impl"
    // InternalKerMLExpressions.g:5382:1: rule__SequenceElementList__Group__0__Impl : ( ruleOwnedExpression ) ;
    public final void rule__SequenceElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5386:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:5387:1: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:5387:1: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:5388:2: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOwnedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOwnedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group__0__Impl"


    // $ANTLR start "rule__SequenceElementList__Group__1"
    // InternalKerMLExpressions.g:5397:1: rule__SequenceElementList__Group__1 : rule__SequenceElementList__Group__1__Impl ;
    public final void rule__SequenceElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5401:1: ( rule__SequenceElementList__Group__1__Impl )
            // InternalKerMLExpressions.g:5402:2: rule__SequenceElementList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group__1"


    // $ANTLR start "rule__SequenceElementList__Group__1__Impl"
    // InternalKerMLExpressions.g:5408:1: rule__SequenceElementList__Group__1__Impl : ( ( rule__SequenceElementList__Group_1__0 )? ) ;
    public final void rule__SequenceElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5412:1: ( ( ( rule__SequenceElementList__Group_1__0 )? ) )
            // InternalKerMLExpressions.g:5413:1: ( ( rule__SequenceElementList__Group_1__0 )? )
            {
            // InternalKerMLExpressions.g:5413:1: ( ( rule__SequenceElementList__Group_1__0 )? )
            // InternalKerMLExpressions.g:5414:2: ( rule__SequenceElementList__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:5415:2: ( rule__SequenceElementList__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKerMLExpressions.g:5415:3: rule__SequenceElementList__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceElementList__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group__1__Impl"


    // $ANTLR start "rule__SequenceElementList__Group_1__0"
    // InternalKerMLExpressions.g:5424:1: rule__SequenceElementList__Group_1__0 : rule__SequenceElementList__Group_1__0__Impl rule__SequenceElementList__Group_1__1 ;
    public final void rule__SequenceElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5428:1: ( rule__SequenceElementList__Group_1__0__Impl rule__SequenceElementList__Group_1__1 )
            // InternalKerMLExpressions.g:5429:2: rule__SequenceElementList__Group_1__0__Impl rule__SequenceElementList__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__SequenceElementList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group_1__0"


    // $ANTLR start "rule__SequenceElementList__Group_1__0__Impl"
    // InternalKerMLExpressions.g:5436:1: rule__SequenceElementList__Group_1__0__Impl : ( () ) ;
    public final void rule__SequenceElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5440:1: ( ( () ) )
            // InternalKerMLExpressions.g:5441:1: ( () )
            {
            // InternalKerMLExpressions.g:5441:1: ( () )
            // InternalKerMLExpressions.g:5442:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperatorExpressionOperandAction_1_0()); 
            }
            // InternalKerMLExpressions.g:5443:2: ()
            // InternalKerMLExpressions.g:5443:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperatorExpressionOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group_1__0__Impl"


    // $ANTLR start "rule__SequenceElementList__Group_1__1"
    // InternalKerMLExpressions.g:5451:1: rule__SequenceElementList__Group_1__1 : rule__SequenceElementList__Group_1__1__Impl rule__SequenceElementList__Group_1__2 ;
    public final void rule__SequenceElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5455:1: ( rule__SequenceElementList__Group_1__1__Impl rule__SequenceElementList__Group_1__2 )
            // InternalKerMLExpressions.g:5456:2: rule__SequenceElementList__Group_1__1__Impl rule__SequenceElementList__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__SequenceElementList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group_1__1"


    // $ANTLR start "rule__SequenceElementList__Group_1__1__Impl"
    // InternalKerMLExpressions.g:5463:1: rule__SequenceElementList__Group_1__1__Impl : ( ( rule__SequenceElementList__OperatorAssignment_1_1 ) ) ;
    public final void rule__SequenceElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5467:1: ( ( ( rule__SequenceElementList__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:5468:1: ( ( rule__SequenceElementList__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:5468:1: ( ( rule__SequenceElementList__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:5469:2: ( rule__SequenceElementList__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:5470:2: ( rule__SequenceElementList__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:5470:3: rule__SequenceElementList__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group_1__1__Impl"


    // $ANTLR start "rule__SequenceElementList__Group_1__2"
    // InternalKerMLExpressions.g:5478:1: rule__SequenceElementList__Group_1__2 : rule__SequenceElementList__Group_1__2__Impl ;
    public final void rule__SequenceElementList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5482:1: ( rule__SequenceElementList__Group_1__2__Impl )
            // InternalKerMLExpressions.g:5483:2: rule__SequenceElementList__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group_1__2"


    // $ANTLR start "rule__SequenceElementList__Group_1__2__Impl"
    // InternalKerMLExpressions.g:5489:1: rule__SequenceElementList__Group_1__2__Impl : ( ( rule__SequenceElementList__OperandAssignment_1_2 ) ) ;
    public final void rule__SequenceElementList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5493:1: ( ( ( rule__SequenceElementList__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:5494:1: ( ( rule__SequenceElementList__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:5494:1: ( ( rule__SequenceElementList__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:5495:2: ( rule__SequenceElementList__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperandAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:5496:2: ( rule__SequenceElementList__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:5496:3: rule__SequenceElementList__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Group_1__2__Impl"


    // $ANTLR start "rule__BaseExpression__Group_4__0"
    // InternalKerMLExpressions.g:5505:1: rule__BaseExpression__Group_4__0 : rule__BaseExpression__Group_4__0__Impl rule__BaseExpression__Group_4__1 ;
    public final void rule__BaseExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5509:1: ( rule__BaseExpression__Group_4__0__Impl rule__BaseExpression__Group_4__1 )
            // InternalKerMLExpressions.g:5510:2: rule__BaseExpression__Group_4__0__Impl rule__BaseExpression__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__BaseExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_4__0"


    // $ANTLR start "rule__BaseExpression__Group_4__0__Impl"
    // InternalKerMLExpressions.g:5517:1: rule__BaseExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__BaseExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5521:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:5522:1: ( '(' )
            {
            // InternalKerMLExpressions.g:5522:1: ( '(' )
            // InternalKerMLExpressions.g:5523:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_4__0__Impl"


    // $ANTLR start "rule__BaseExpression__Group_4__1"
    // InternalKerMLExpressions.g:5532:1: rule__BaseExpression__Group_4__1 : rule__BaseExpression__Group_4__1__Impl rule__BaseExpression__Group_4__2 ;
    public final void rule__BaseExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5536:1: ( rule__BaseExpression__Group_4__1__Impl rule__BaseExpression__Group_4__2 )
            // InternalKerMLExpressions.g:5537:2: rule__BaseExpression__Group_4__1__Impl rule__BaseExpression__Group_4__2
            {
            pushFollow(FOLLOW_40);
            rule__BaseExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_4__1"


    // $ANTLR start "rule__BaseExpression__Group_4__1__Impl"
    // InternalKerMLExpressions.g:5544:1: rule__BaseExpression__Group_4__1__Impl : ( ruleOwnedExpression ) ;
    public final void rule__BaseExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5548:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:5549:1: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:5549:1: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:5550:2: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionAccess().getOwnedExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionAccess().getOwnedExpressionParserRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_4__1__Impl"


    // $ANTLR start "rule__BaseExpression__Group_4__2"
    // InternalKerMLExpressions.g:5559:1: rule__BaseExpression__Group_4__2 : rule__BaseExpression__Group_4__2__Impl ;
    public final void rule__BaseExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5563:1: ( rule__BaseExpression__Group_4__2__Impl )
            // InternalKerMLExpressions.g:5564:2: rule__BaseExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_4__2"


    // $ANTLR start "rule__BaseExpression__Group_4__2__Impl"
    // InternalKerMLExpressions.g:5570:1: rule__BaseExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__BaseExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5574:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:5575:1: ( ')' )
            {
            // InternalKerMLExpressions.g:5575:1: ( ')' )
            // InternalKerMLExpressions.g:5576:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_4__2__Impl"


    // $ANTLR start "rule__InvocationExpression__Group__0"
    // InternalKerMLExpressions.g:5586:1: rule__InvocationExpression__Group__0 : rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1 ;
    public final void rule__InvocationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5590:1: ( rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1 )
            // InternalKerMLExpressions.g:5591:2: rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__InvocationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__Group__0"


    // $ANTLR start "rule__InvocationExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:5598:1: rule__InvocationExpression__Group__0__Impl : ( ( rule__InvocationExpression__OwnedRelationshipAssignment_0 ) ) ;
    public final void rule__InvocationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5602:1: ( ( ( rule__InvocationExpression__OwnedRelationshipAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5603:1: ( ( rule__InvocationExpression__OwnedRelationshipAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5603:1: ( ( rule__InvocationExpression__OwnedRelationshipAssignment_0 ) )
            // InternalKerMLExpressions.g:5604:2: ( rule__InvocationExpression__OwnedRelationshipAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipAssignment_0()); 
            }
            // InternalKerMLExpressions.g:5605:2: ( rule__InvocationExpression__OwnedRelationshipAssignment_0 )
            // InternalKerMLExpressions.g:5605:3: rule__InvocationExpression__OwnedRelationshipAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__OwnedRelationshipAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__Group__0__Impl"


    // $ANTLR start "rule__InvocationExpression__Group__1"
    // InternalKerMLExpressions.g:5613:1: rule__InvocationExpression__Group__1 : rule__InvocationExpression__Group__1__Impl rule__InvocationExpression__Group__2 ;
    public final void rule__InvocationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5617:1: ( rule__InvocationExpression__Group__1__Impl rule__InvocationExpression__Group__2 )
            // InternalKerMLExpressions.g:5618:2: rule__InvocationExpression__Group__1__Impl rule__InvocationExpression__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__InvocationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__Group__1"


    // $ANTLR start "rule__InvocationExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:5625:1: rule__InvocationExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__InvocationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5629:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:5630:1: ( '(' )
            {
            // InternalKerMLExpressions.g:5630:1: ( '(' )
            // InternalKerMLExpressions.g:5631:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__Group__1__Impl"


    // $ANTLR start "rule__InvocationExpression__Group__2"
    // InternalKerMLExpressions.g:5640:1: rule__InvocationExpression__Group__2 : rule__InvocationExpression__Group__2__Impl rule__InvocationExpression__Group__3 ;
    public final void rule__InvocationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5644:1: ( rule__InvocationExpression__Group__2__Impl rule__InvocationExpression__Group__3 )
            // InternalKerMLExpressions.g:5645:2: rule__InvocationExpression__Group__2__Impl rule__InvocationExpression__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__InvocationExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__Group__2"


    // $ANTLR start "rule__InvocationExpression__Group__2__Impl"
    // InternalKerMLExpressions.g:5652:1: rule__InvocationExpression__Group__2__Impl : ( ( ruleArgumentList )? ) ;
    public final void rule__InvocationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5656:1: ( ( ( ruleArgumentList )? ) )
            // InternalKerMLExpressions.g:5657:1: ( ( ruleArgumentList )? )
            {
            // InternalKerMLExpressions.g:5657:1: ( ( ruleArgumentList )? )
            // InternalKerMLExpressions.g:5658:2: ( ruleArgumentList )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getArgumentListParserRuleCall_2()); 
            }
            // InternalKerMLExpressions.g:5659:2: ( ruleArgumentList )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==EOF||(LA41_0>=RULE_EXP_VALUE && LA41_0<=RULE_STRING_VALUE)||(LA41_0>=24 && LA41_0<=27)||(LA41_0>=32 && LA41_0<=34)||(LA41_0>=37 && LA41_0<=40)||(LA41_0>=44 && LA41_0<=45)||LA41_0==47||LA41_0==51||LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKerMLExpressions.g:5659:3: ruleArgumentList
                    {
                    pushFollow(FOLLOW_2);
                    ruleArgumentList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionAccess().getArgumentListParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__Group__2__Impl"


    // $ANTLR start "rule__InvocationExpression__Group__3"
    // InternalKerMLExpressions.g:5667:1: rule__InvocationExpression__Group__3 : rule__InvocationExpression__Group__3__Impl ;
    public final void rule__InvocationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5671:1: ( rule__InvocationExpression__Group__3__Impl )
            // InternalKerMLExpressions.g:5672:2: rule__InvocationExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__Group__3"


    // $ANTLR start "rule__InvocationExpression__Group__3__Impl"
    // InternalKerMLExpressions.g:5678:1: rule__InvocationExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__InvocationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5682:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:5683:1: ( ')' )
            {
            // InternalKerMLExpressions.g:5683:1: ( ')' )
            // InternalKerMLExpressions.g:5684:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__Group__3__Impl"


    // $ANTLR start "rule__PositionalArgumentList__Group__0"
    // InternalKerMLExpressions.g:5694:1: rule__PositionalArgumentList__Group__0 : rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1 ;
    public final void rule__PositionalArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5698:1: ( rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1 )
            // InternalKerMLExpressions.g:5699:2: rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__PositionalArgumentList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__Group__0"


    // $ANTLR start "rule__PositionalArgumentList__Group__0__Impl"
    // InternalKerMLExpressions.g:5706:1: rule__PositionalArgumentList__Group__0__Impl : ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 ) ) ;
    public final void rule__PositionalArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5710:1: ( ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5711:1: ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5711:1: ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 ) )
            // InternalKerMLExpressions.g:5712:2: ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipAssignment_0()); 
            }
            // InternalKerMLExpressions.g:5713:2: ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 )
            // InternalKerMLExpressions.g:5713:3: rule__PositionalArgumentList__OwnedRelationshipAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__OwnedRelationshipAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__Group__0__Impl"


    // $ANTLR start "rule__PositionalArgumentList__Group__1"
    // InternalKerMLExpressions.g:5721:1: rule__PositionalArgumentList__Group__1 : rule__PositionalArgumentList__Group__1__Impl ;
    public final void rule__PositionalArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5725:1: ( rule__PositionalArgumentList__Group__1__Impl )
            // InternalKerMLExpressions.g:5726:2: rule__PositionalArgumentList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__Group__1"


    // $ANTLR start "rule__PositionalArgumentList__Group__1__Impl"
    // InternalKerMLExpressions.g:5732:1: rule__PositionalArgumentList__Group__1__Impl : ( ( rule__PositionalArgumentList__Group_1__0 )* ) ;
    public final void rule__PositionalArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5736:1: ( ( ( rule__PositionalArgumentList__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:5737:1: ( ( rule__PositionalArgumentList__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:5737:1: ( ( rule__PositionalArgumentList__Group_1__0 )* )
            // InternalKerMLExpressions.g:5738:2: ( rule__PositionalArgumentList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:5739:2: ( rule__PositionalArgumentList__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==49) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalKerMLExpressions.g:5739:3: rule__PositionalArgumentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__PositionalArgumentList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__Group__1__Impl"


    // $ANTLR start "rule__PositionalArgumentList__Group_1__0"
    // InternalKerMLExpressions.g:5748:1: rule__PositionalArgumentList__Group_1__0 : rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1 ;
    public final void rule__PositionalArgumentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5752:1: ( rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1 )
            // InternalKerMLExpressions.g:5753:2: rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__PositionalArgumentList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__Group_1__0"


    // $ANTLR start "rule__PositionalArgumentList__Group_1__0__Impl"
    // InternalKerMLExpressions.g:5760:1: rule__PositionalArgumentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__PositionalArgumentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5764:1: ( ( ',' ) )
            // InternalKerMLExpressions.g:5765:1: ( ',' )
            {
            // InternalKerMLExpressions.g:5765:1: ( ',' )
            // InternalKerMLExpressions.g:5766:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__Group_1__0__Impl"


    // $ANTLR start "rule__PositionalArgumentList__Group_1__1"
    // InternalKerMLExpressions.g:5775:1: rule__PositionalArgumentList__Group_1__1 : rule__PositionalArgumentList__Group_1__1__Impl ;
    public final void rule__PositionalArgumentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5779:1: ( rule__PositionalArgumentList__Group_1__1__Impl )
            // InternalKerMLExpressions.g:5780:2: rule__PositionalArgumentList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__Group_1__1"


    // $ANTLR start "rule__PositionalArgumentList__Group_1__1__Impl"
    // InternalKerMLExpressions.g:5786:1: rule__PositionalArgumentList__Group_1__1__Impl : ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 ) ) ;
    public final void rule__PositionalArgumentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5790:1: ( ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:5791:1: ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:5791:1: ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 ) )
            // InternalKerMLExpressions.g:5792:2: ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:5793:2: ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 )
            // InternalKerMLExpressions.g:5793:3: rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__Group_1__1__Impl"


    // $ANTLR start "rule__NamedArgumentList__Group__0"
    // InternalKerMLExpressions.g:5802:1: rule__NamedArgumentList__Group__0 : rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1 ;
    public final void rule__NamedArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5806:1: ( rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1 )
            // InternalKerMLExpressions.g:5807:2: rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__NamedArgumentList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__Group__0"


    // $ANTLR start "rule__NamedArgumentList__Group__0__Impl"
    // InternalKerMLExpressions.g:5814:1: rule__NamedArgumentList__Group__0__Impl : ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 ) ) ;
    public final void rule__NamedArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5818:1: ( ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5819:1: ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5819:1: ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 ) )
            // InternalKerMLExpressions.g:5820:2: ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipAssignment_0()); 
            }
            // InternalKerMLExpressions.g:5821:2: ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 )
            // InternalKerMLExpressions.g:5821:3: rule__NamedArgumentList__OwnedRelationshipAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__OwnedRelationshipAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__Group__0__Impl"


    // $ANTLR start "rule__NamedArgumentList__Group__1"
    // InternalKerMLExpressions.g:5829:1: rule__NamedArgumentList__Group__1 : rule__NamedArgumentList__Group__1__Impl ;
    public final void rule__NamedArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5833:1: ( rule__NamedArgumentList__Group__1__Impl )
            // InternalKerMLExpressions.g:5834:2: rule__NamedArgumentList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__Group__1"


    // $ANTLR start "rule__NamedArgumentList__Group__1__Impl"
    // InternalKerMLExpressions.g:5840:1: rule__NamedArgumentList__Group__1__Impl : ( ( rule__NamedArgumentList__Group_1__0 )* ) ;
    public final void rule__NamedArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5844:1: ( ( ( rule__NamedArgumentList__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:5845:1: ( ( rule__NamedArgumentList__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:5845:1: ( ( rule__NamedArgumentList__Group_1__0 )* )
            // InternalKerMLExpressions.g:5846:2: ( rule__NamedArgumentList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:5847:2: ( rule__NamedArgumentList__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==49) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKerMLExpressions.g:5847:3: rule__NamedArgumentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__NamedArgumentList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__Group__1__Impl"


    // $ANTLR start "rule__NamedArgumentList__Group_1__0"
    // InternalKerMLExpressions.g:5856:1: rule__NamedArgumentList__Group_1__0 : rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1 ;
    public final void rule__NamedArgumentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5860:1: ( rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1 )
            // InternalKerMLExpressions.g:5861:2: rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__NamedArgumentList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__Group_1__0"


    // $ANTLR start "rule__NamedArgumentList__Group_1__0__Impl"
    // InternalKerMLExpressions.g:5868:1: rule__NamedArgumentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__NamedArgumentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5872:1: ( ( ',' ) )
            // InternalKerMLExpressions.g:5873:1: ( ',' )
            {
            // InternalKerMLExpressions.g:5873:1: ( ',' )
            // InternalKerMLExpressions.g:5874:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__Group_1__0__Impl"


    // $ANTLR start "rule__NamedArgumentList__Group_1__1"
    // InternalKerMLExpressions.g:5883:1: rule__NamedArgumentList__Group_1__1 : rule__NamedArgumentList__Group_1__1__Impl ;
    public final void rule__NamedArgumentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5887:1: ( rule__NamedArgumentList__Group_1__1__Impl )
            // InternalKerMLExpressions.g:5888:2: rule__NamedArgumentList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__Group_1__1"


    // $ANTLR start "rule__NamedArgumentList__Group_1__1__Impl"
    // InternalKerMLExpressions.g:5894:1: rule__NamedArgumentList__Group_1__1__Impl : ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 ) ) ;
    public final void rule__NamedArgumentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5898:1: ( ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:5899:1: ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:5899:1: ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 ) )
            // InternalKerMLExpressions.g:5900:2: ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:5901:2: ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 )
            // InternalKerMLExpressions.g:5901:3: rule__NamedArgumentList__OwnedRelationshipAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__OwnedRelationshipAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__Group_1__1__Impl"


    // $ANTLR start "rule__NamedExpressionMember__Group__0"
    // InternalKerMLExpressions.g:5910:1: rule__NamedExpressionMember__Group__0 : rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1 ;
    public final void rule__NamedExpressionMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5914:1: ( rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1 )
            // InternalKerMLExpressions.g:5915:2: rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__NamedExpressionMember__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__Group__0"


    // $ANTLR start "rule__NamedExpressionMember__Group__0__Impl"
    // InternalKerMLExpressions.g:5922:1: rule__NamedExpressionMember__Group__0__Impl : ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) ) ;
    public final void rule__NamedExpressionMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5926:1: ( ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5927:1: ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5927:1: ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) )
            // InternalKerMLExpressions.g:5928:2: ( rule__NamedExpressionMember__MemberNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getMemberNameAssignment_0()); 
            }
            // InternalKerMLExpressions.g:5929:2: ( rule__NamedExpressionMember__MemberNameAssignment_0 )
            // InternalKerMLExpressions.g:5929:3: rule__NamedExpressionMember__MemberNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__MemberNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberAccess().getMemberNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__Group__0__Impl"


    // $ANTLR start "rule__NamedExpressionMember__Group__1"
    // InternalKerMLExpressions.g:5937:1: rule__NamedExpressionMember__Group__1 : rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2 ;
    public final void rule__NamedExpressionMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5941:1: ( rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2 )
            // InternalKerMLExpressions.g:5942:2: rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NamedExpressionMember__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__Group__1"


    // $ANTLR start "rule__NamedExpressionMember__Group__1__Impl"
    // InternalKerMLExpressions.g:5949:1: rule__NamedExpressionMember__Group__1__Impl : ( '=>' ) ;
    public final void rule__NamedExpressionMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5953:1: ( ( '=>' ) )
            // InternalKerMLExpressions.g:5954:1: ( '=>' )
            {
            // InternalKerMLExpressions.g:5954:1: ( '=>' )
            // InternalKerMLExpressions.g:5955:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__Group__1__Impl"


    // $ANTLR start "rule__NamedExpressionMember__Group__2"
    // InternalKerMLExpressions.g:5964:1: rule__NamedExpressionMember__Group__2 : rule__NamedExpressionMember__Group__2__Impl ;
    public final void rule__NamedExpressionMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5968:1: ( rule__NamedExpressionMember__Group__2__Impl )
            // InternalKerMLExpressions.g:5969:2: rule__NamedExpressionMember__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__Group__2"


    // $ANTLR start "rule__NamedExpressionMember__Group__2__Impl"
    // InternalKerMLExpressions.g:5975:1: rule__NamedExpressionMember__Group__2__Impl : ( ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 ) ) ;
    public final void rule__NamedExpressionMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5979:1: ( ( ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 ) ) )
            // InternalKerMLExpressions.g:5980:1: ( ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 ) )
            {
            // InternalKerMLExpressions.g:5980:1: ( ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 ) )
            // InternalKerMLExpressions.g:5981:2: ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementAssignment_2()); 
            }
            // InternalKerMLExpressions.g:5982:2: ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 )
            // InternalKerMLExpressions.g:5982:3: rule__NamedExpressionMember__OwnedRelatedElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__OwnedRelatedElementAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__Group__2__Impl"


    // $ANTLR start "rule__NullExpression__Group__0"
    // InternalKerMLExpressions.g:5991:1: rule__NullExpression__Group__0 : rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1 ;
    public final void rule__NullExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5995:1: ( rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1 )
            // InternalKerMLExpressions.g:5996:2: rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__NullExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NullExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullExpression__Group__0"


    // $ANTLR start "rule__NullExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:6003:1: rule__NullExpression__Group__0__Impl : ( () ) ;
    public final void rule__NullExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6007:1: ( ( () ) )
            // InternalKerMLExpressions.g:6008:1: ( () )
            {
            // InternalKerMLExpressions.g:6008:1: ( () )
            // InternalKerMLExpressions.g:6009:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullExpressionAccess().getNullExpressionAction_0()); 
            }
            // InternalKerMLExpressions.g:6010:2: ()
            // InternalKerMLExpressions.g:6010:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullExpressionAccess().getNullExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullExpression__Group__0__Impl"


    // $ANTLR start "rule__NullExpression__Group__1"
    // InternalKerMLExpressions.g:6018:1: rule__NullExpression__Group__1 : rule__NullExpression__Group__1__Impl ;
    public final void rule__NullExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6022:1: ( rule__NullExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:6023:2: rule__NullExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullExpression__Group__1"


    // $ANTLR start "rule__NullExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:6029:1: rule__NullExpression__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6033:1: ( ( 'null' ) )
            // InternalKerMLExpressions.g:6034:1: ( 'null' )
            {
            // InternalKerMLExpressions.g:6034:1: ( 'null' )
            // InternalKerMLExpressions.g:6035:2: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullExpressionAccess().getNullKeyword_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullExpressionAccess().getNullKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullExpression__Group__1__Impl"


    // $ANTLR start "rule__RealValue__Group_0__0"
    // InternalKerMLExpressions.g:6045:1: rule__RealValue__Group_0__0 : rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 ;
    public final void rule__RealValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6049:1: ( rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 )
            // InternalKerMLExpressions.g:6050:2: rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1
            {
            pushFollow(FOLLOW_51);
            rule__RealValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__0"


    // $ANTLR start "rule__RealValue__Group_0__0__Impl"
    // InternalKerMLExpressions.g:6057:1: rule__RealValue__Group_0__0__Impl : ( ( RULE_DECIMAL_VALUE )? ) ;
    public final void rule__RealValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6061:1: ( ( ( RULE_DECIMAL_VALUE )? ) )
            // InternalKerMLExpressions.g:6062:1: ( ( RULE_DECIMAL_VALUE )? )
            {
            // InternalKerMLExpressions.g:6062:1: ( ( RULE_DECIMAL_VALUE )? )
            // InternalKerMLExpressions.g:6063:2: ( RULE_DECIMAL_VALUE )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0()); 
            }
            // InternalKerMLExpressions.g:6064:2: ( RULE_DECIMAL_VALUE )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DECIMAL_VALUE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKerMLExpressions.g:6064:3: RULE_DECIMAL_VALUE
                    {
                    match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__0__Impl"


    // $ANTLR start "rule__RealValue__Group_0__1"
    // InternalKerMLExpressions.g:6072:1: rule__RealValue__Group_0__1 : rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2 ;
    public final void rule__RealValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6076:1: ( rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2 )
            // InternalKerMLExpressions.g:6077:2: rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2
            {
            pushFollow(FOLLOW_52);
            rule__RealValue__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__1"


    // $ANTLR start "rule__RealValue__Group_0__1__Impl"
    // InternalKerMLExpressions.g:6084:1: rule__RealValue__Group_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6088:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:6089:1: ( '.' )
            {
            // InternalKerMLExpressions.g:6089:1: ( '.' )
            // InternalKerMLExpressions.g:6090:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__1__Impl"


    // $ANTLR start "rule__RealValue__Group_0__2"
    // InternalKerMLExpressions.g:6099:1: rule__RealValue__Group_0__2 : rule__RealValue__Group_0__2__Impl ;
    public final void rule__RealValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6103:1: ( rule__RealValue__Group_0__2__Impl )
            // InternalKerMLExpressions.g:6104:2: rule__RealValue__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__2"


    // $ANTLR start "rule__RealValue__Group_0__2__Impl"
    // InternalKerMLExpressions.g:6110:1: rule__RealValue__Group_0__2__Impl : ( ( rule__RealValue__Alternatives_0_2 ) ) ;
    public final void rule__RealValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6114:1: ( ( ( rule__RealValue__Alternatives_0_2 ) ) )
            // InternalKerMLExpressions.g:6115:1: ( ( rule__RealValue__Alternatives_0_2 ) )
            {
            // InternalKerMLExpressions.g:6115:1: ( ( rule__RealValue__Alternatives_0_2 ) )
            // InternalKerMLExpressions.g:6116:2: ( rule__RealValue__Alternatives_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getAlternatives_0_2()); 
            }
            // InternalKerMLExpressions.g:6117:2: ( rule__RealValue__Alternatives_0_2 )
            // InternalKerMLExpressions.g:6117:3: rule__RealValue__Alternatives_0_2
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Alternatives_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueAccess().getAlternatives_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__2__Impl"


    // $ANTLR start "rule__LiteralUnbounded__Group__0"
    // InternalKerMLExpressions.g:6126:1: rule__LiteralUnbounded__Group__0 : rule__LiteralUnbounded__Group__0__Impl rule__LiteralUnbounded__Group__1 ;
    public final void rule__LiteralUnbounded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6130:1: ( rule__LiteralUnbounded__Group__0__Impl rule__LiteralUnbounded__Group__1 )
            // InternalKerMLExpressions.g:6131:2: rule__LiteralUnbounded__Group__0__Impl rule__LiteralUnbounded__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__LiteralUnbounded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LiteralUnbounded__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralUnbounded__Group__0"


    // $ANTLR start "rule__LiteralUnbounded__Group__0__Impl"
    // InternalKerMLExpressions.g:6138:1: rule__LiteralUnbounded__Group__0__Impl : ( () ) ;
    public final void rule__LiteralUnbounded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6142:1: ( ( () ) )
            // InternalKerMLExpressions.g:6143:1: ( () )
            {
            // InternalKerMLExpressions.g:6143:1: ( () )
            // InternalKerMLExpressions.g:6144:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralUnboundedAccess().getLiteralUnboundedAction_0()); 
            }
            // InternalKerMLExpressions.g:6145:2: ()
            // InternalKerMLExpressions.g:6145:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralUnboundedAccess().getLiteralUnboundedAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralUnbounded__Group__0__Impl"


    // $ANTLR start "rule__LiteralUnbounded__Group__1"
    // InternalKerMLExpressions.g:6153:1: rule__LiteralUnbounded__Group__1 : rule__LiteralUnbounded__Group__1__Impl ;
    public final void rule__LiteralUnbounded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6157:1: ( rule__LiteralUnbounded__Group__1__Impl )
            // InternalKerMLExpressions.g:6158:2: rule__LiteralUnbounded__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralUnbounded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralUnbounded__Group__1"


    // $ANTLR start "rule__LiteralUnbounded__Group__1__Impl"
    // InternalKerMLExpressions.g:6164:1: rule__LiteralUnbounded__Group__1__Impl : ( '*' ) ;
    public final void rule__LiteralUnbounded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6168:1: ( ( '*' ) )
            // InternalKerMLExpressions.g:6169:1: ( '*' )
            {
            // InternalKerMLExpressions.g:6169:1: ( '*' )
            // InternalKerMLExpressions.g:6170:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralUnboundedAccess().getAsteriskKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralUnboundedAccess().getAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralUnbounded__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalKerMLExpressions.g:6180:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6184:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalKerMLExpressions.g:6185:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalKerMLExpressions.g:6192:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6196:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6197:1: ( ruleName )
            {
            // InternalKerMLExpressions.g:6197:1: ( ruleName )
            // InternalKerMLExpressions.g:6198:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalKerMLExpressions.g:6207:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6211:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalKerMLExpressions.g:6212:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalKerMLExpressions.g:6218:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6222:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:6223:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:6223:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalKerMLExpressions.g:6224:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:6225:2: ( rule__QualifiedName__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==52) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalKerMLExpressions.g:6225:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalKerMLExpressions.g:6234:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6238:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalKerMLExpressions.g:6239:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalKerMLExpressions.g:6246:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6250:1: ( ( '::' ) )
            // InternalKerMLExpressions.g:6251:1: ( '::' )
            {
            // InternalKerMLExpressions.g:6251:1: ( '::' )
            // InternalKerMLExpressions.g:6252:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalKerMLExpressions.g:6261:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6265:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalKerMLExpressions.g:6266:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalKerMLExpressions.g:6272:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6276:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6277:1: ( ruleName )
            {
            // InternalKerMLExpressions.g:6277:1: ( ruleName )
            // InternalKerMLExpressions.g:6278:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__OwnedExpressionMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:6288:1: rule__OwnedExpressionMember__OwnedRelatedElementAssignment : ( ruleOwnedExpression ) ;
    public final void rule__OwnedExpressionMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6292:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6293:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6293:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6294:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedExpressionMember__OwnedRelatedElementAssignment"


    // $ANTLR start "rule__ConditionalExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6303:1: rule__ConditionalExpression__OperatorAssignment_1_1 : ( ruleConditionalTestOperator ) ;
    public final void rule__ConditionalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6307:1: ( ( ruleConditionalTestOperator ) )
            // InternalKerMLExpressions.g:6308:2: ( ruleConditionalTestOperator )
            {
            // InternalKerMLExpressions.g:6308:2: ( ruleConditionalTestOperator )
            // InternalKerMLExpressions.g:6309:3: ruleConditionalTestOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalTestOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalTestOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalTestOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ConditionalExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6318:1: rule__ConditionalExpression__OperandAssignment_1_2 : ( ruleOwnedExpression ) ;
    public final void rule__ConditionalExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6322:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6323:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6323:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6324:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__ConditionalExpression__OperandAssignment_1_4"
    // InternalKerMLExpressions.g:6333:1: rule__ConditionalExpression__OperandAssignment_1_4 : ( ruleConditionalExpression ) ;
    public final void rule__ConditionalExpression__OperandAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6337:1: ( ( ruleConditionalExpression ) )
            // InternalKerMLExpressions.g:6338:2: ( ruleConditionalExpression )
            {
            // InternalKerMLExpressions.g:6338:2: ( ruleConditionalExpression )
            // InternalKerMLExpressions.g:6339:3: ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OperandAssignment_1_4"


    // $ANTLR start "rule__NullCoalescingExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6348:1: rule__NullCoalescingExpression__OperatorAssignment_1_1 : ( ruleNullCoalescingOperator ) ;
    public final void rule__NullCoalescingExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6352:1: ( ( ruleNullCoalescingOperator ) )
            // InternalKerMLExpressions.g:6353:2: ( ruleNullCoalescingOperator )
            {
            // InternalKerMLExpressions.g:6353:2: ( ruleNullCoalescingOperator )
            // InternalKerMLExpressions.g:6354:3: ruleNullCoalescingOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperatorNullCoalescingOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullCoalescingOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getOperatorNullCoalescingOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__NullCoalescingExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6363:1: rule__NullCoalescingExpression__OperandAssignment_1_2 : ( ruleConditionalOrExpression ) ;
    public final void rule__NullCoalescingExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6367:1: ( ( ruleConditionalOrExpression ) )
            // InternalKerMLExpressions.g:6368:2: ( ruleConditionalOrExpression )
            {
            // InternalKerMLExpressions.g:6368:2: ( ruleConditionalOrExpression )
            // InternalKerMLExpressions.g:6369:3: ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperandConditionalOrExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getOperandConditionalOrExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__ConditionalOrExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6378:1: rule__ConditionalOrExpression__OperatorAssignment_1_1 : ( ruleConditionalOrOperator ) ;
    public final void rule__ConditionalOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6382:1: ( ( ruleConditionalOrOperator ) )
            // InternalKerMLExpressions.g:6383:2: ( ruleConditionalOrOperator )
            {
            // InternalKerMLExpressions.g:6383:2: ( ruleConditionalOrOperator )
            // InternalKerMLExpressions.g:6384:3: ruleConditionalOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperatorConditionalOrOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getOperatorConditionalOrOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ConditionalOrExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6393:1: rule__ConditionalOrExpression__OperandAssignment_1_2 : ( ruleConditionalAndExpression ) ;
    public final void rule__ConditionalOrExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6397:1: ( ( ruleConditionalAndExpression ) )
            // InternalKerMLExpressions.g:6398:2: ( ruleConditionalAndExpression )
            {
            // InternalKerMLExpressions.g:6398:2: ( ruleConditionalAndExpression )
            // InternalKerMLExpressions.g:6399:3: ruleConditionalAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperandConditionalAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getOperandConditionalAndExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__ConditionalAndExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6408:1: rule__ConditionalAndExpression__OperatorAssignment_1_1 : ( ruleConditionalAndOperator ) ;
    public final void rule__ConditionalAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6412:1: ( ( ruleConditionalAndOperator ) )
            // InternalKerMLExpressions.g:6413:2: ( ruleConditionalAndOperator )
            {
            // InternalKerMLExpressions.g:6413:2: ( ruleConditionalAndOperator )
            // InternalKerMLExpressions.g:6414:3: ruleConditionalAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperatorConditionalAndOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOperatorConditionalAndOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ConditionalAndExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6423:1: rule__ConditionalAndExpression__OperandAssignment_1_2 : ( ruleOrExpression ) ;
    public final void rule__ConditionalAndExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6427:1: ( ( ruleOrExpression ) )
            // InternalKerMLExpressions.g:6428:2: ( ruleOrExpression )
            {
            // InternalKerMLExpressions.g:6428:2: ( ruleOrExpression )
            // InternalKerMLExpressions.g:6429:3: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperandOrExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOperandOrExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6438:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6442:1: ( ( ruleOrOperator ) )
            // InternalKerMLExpressions.g:6443:2: ( ruleOrOperator )
            {
            // InternalKerMLExpressions.g:6443:2: ( ruleOrOperator )
            // InternalKerMLExpressions.g:6444:3: ruleOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6453:1: rule__OrExpression__OperandAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6457:1: ( ( ruleXorExpression ) )
            // InternalKerMLExpressions.g:6458:2: ( ruleXorExpression )
            {
            // InternalKerMLExpressions.g:6458:2: ( ruleXorExpression )
            // InternalKerMLExpressions.g:6459:3: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__XorExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6468:1: rule__XorExpression__OperatorAssignment_1_1 : ( ruleXorOperator ) ;
    public final void rule__XorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6472:1: ( ( ruleXorOperator ) )
            // InternalKerMLExpressions.g:6473:2: ( ruleXorOperator )
            {
            // InternalKerMLExpressions.g:6473:2: ( ruleXorOperator )
            // InternalKerMLExpressions.g:6474:3: ruleXorOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__XorExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6483:1: rule__XorExpression__OperandAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6487:1: ( ( ruleAndExpression ) )
            // InternalKerMLExpressions.g:6488:2: ( ruleAndExpression )
            {
            // InternalKerMLExpressions.g:6488:2: ( ruleAndExpression )
            // InternalKerMLExpressions.g:6489:3: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6498:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6502:1: ( ( ruleAndOperator ) )
            // InternalKerMLExpressions.g:6503:2: ( ruleAndOperator )
            {
            // InternalKerMLExpressions.g:6503:2: ( ruleAndOperator )
            // InternalKerMLExpressions.g:6504:3: ruleAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6513:1: rule__AndExpression__OperandAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6517:1: ( ( ruleEqualityExpression ) )
            // InternalKerMLExpressions.g:6518:2: ( ruleEqualityExpression )
            {
            // InternalKerMLExpressions.g:6518:2: ( ruleEqualityExpression )
            // InternalKerMLExpressions.g:6519:3: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__EqualityExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6528:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6532:1: ( ( ruleEqualityOperator ) )
            // InternalKerMLExpressions.g:6533:2: ( ruleEqualityOperator )
            {
            // InternalKerMLExpressions.g:6533:2: ( ruleEqualityOperator )
            // InternalKerMLExpressions.g:6534:3: ruleEqualityOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6543:1: rule__EqualityExpression__OperandAssignment_1_2 : ( ruleClassificationExpression ) ;
    public final void rule__EqualityExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6547:1: ( ( ruleClassificationExpression ) )
            // InternalKerMLExpressions.g:6548:2: ( ruleClassificationExpression )
            {
            // InternalKerMLExpressions.g:6548:2: ( ruleClassificationExpression )
            // InternalKerMLExpressions.g:6549:3: ruleClassificationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperandClassificationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassificationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperandClassificationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__ClassificationExpression__OperatorAssignment_0_1_1"
    // InternalKerMLExpressions.g:6558:1: rule__ClassificationExpression__OperatorAssignment_0_1_1 : ( ruleClassificationOperator ) ;
    public final void rule__ClassificationExpression__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6562:1: ( ( ruleClassificationOperator ) )
            // InternalKerMLExpressions.g:6563:2: ( ruleClassificationOperator )
            {
            // InternalKerMLExpressions.g:6563:2: ( ruleClassificationOperator )
            // InternalKerMLExpressions.g:6564:3: ruleClassificationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassificationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__OperatorAssignment_0_1_1"


    // $ANTLR start "rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2"
    // InternalKerMLExpressions.g:6573:1: rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 : ( ruleTypeReferenceMember ) ;
    public final void rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6577:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:6578:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:6578:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:6579:3: ruleTypeReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2"


    // $ANTLR start "rule__ClassificationExpression__OperandAssignment_1_1"
    // InternalKerMLExpressions.g:6588:1: rule__ClassificationExpression__OperandAssignment_1_1 : ( ruleSelfReferenceExpression ) ;
    public final void rule__ClassificationExpression__OperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6592:1: ( ( ruleSelfReferenceExpression ) )
            // InternalKerMLExpressions.g:6593:2: ( ruleSelfReferenceExpression )
            {
            // InternalKerMLExpressions.g:6593:2: ( ruleSelfReferenceExpression )
            // InternalKerMLExpressions.g:6594:3: ruleSelfReferenceExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperandSelfReferenceExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelfReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperandSelfReferenceExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__OperandAssignment_1_1"


    // $ANTLR start "rule__ClassificationExpression__OperatorAssignment_1_2"
    // InternalKerMLExpressions.g:6603:1: rule__ClassificationExpression__OperatorAssignment_1_2 : ( ruleClassificationOperator ) ;
    public final void rule__ClassificationExpression__OperatorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6607:1: ( ( ruleClassificationOperator ) )
            // InternalKerMLExpressions.g:6608:2: ( ruleClassificationOperator )
            {
            // InternalKerMLExpressions.g:6608:2: ( ruleClassificationOperator )
            // InternalKerMLExpressions.g:6609:3: ruleClassificationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassificationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__OperatorAssignment_1_2"


    // $ANTLR start "rule__ClassificationExpression__OwnedRelationshipAssignment_1_3"
    // InternalKerMLExpressions.g:6618:1: rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 : ( ruleTypeReferenceMember ) ;
    public final void rule__ClassificationExpression__OwnedRelationshipAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6622:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:6623:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:6623:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:6624:3: ruleTypeReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__OwnedRelationshipAssignment_1_3"


    // $ANTLR start "rule__TypeReferenceMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:6633:1: rule__TypeReferenceMember__OwnedRelatedElementAssignment : ( ruleTypeReference ) ;
    public final void rule__TypeReferenceMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6637:1: ( ( ruleTypeReference ) )
            // InternalKerMLExpressions.g:6638:2: ( ruleTypeReference )
            {
            // InternalKerMLExpressions.g:6638:2: ( ruleTypeReference )
            // InternalKerMLExpressions.g:6639:3: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementTypeReferenceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementTypeReferenceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReferenceMember__OwnedRelatedElementAssignment"


    // $ANTLR start "rule__TypeReference__OwnedRelationshipAssignment"
    // InternalKerMLExpressions.g:6648:1: rule__TypeReference__OwnedRelationshipAssignment : ( ruleOwnedFeatureTyping ) ;
    public final void rule__TypeReference__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6652:1: ( ( ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:6653:2: ( ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:6653:2: ( ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:6654:3: ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__OwnedRelationshipAssignment"


    // $ANTLR start "rule__OwnedFeatureTyping__TypeAssignment"
    // InternalKerMLExpressions.g:6663:1: rule__OwnedFeatureTyping__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__OwnedFeatureTyping__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6667:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:6668:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:6668:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:6669:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeCrossReference_0()); 
            }
            // InternalKerMLExpressions.g:6670:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:6671:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeQualifiedNameParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedFeatureTyping__TypeAssignment"


    // $ANTLR start "rule__SelfReferenceExpression__OwnedRelationshipAssignment"
    // InternalKerMLExpressions.g:6682:1: rule__SelfReferenceExpression__OwnedRelationshipAssignment : ( ruleSelfReferenceMember ) ;
    public final void rule__SelfReferenceExpression__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6686:1: ( ( ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:6687:2: ( ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:6687:2: ( ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:6688:3: ruleSelfReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipSelfReferenceMemberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelfReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipSelfReferenceMemberParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReferenceExpression__OwnedRelationshipAssignment"


    // $ANTLR start "rule__SelfReferenceMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:6697:1: rule__SelfReferenceMember__OwnedRelatedElementAssignment : ( ruleEmptyFeature ) ;
    public final void rule__SelfReferenceMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6701:1: ( ( ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:6702:2: ( ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:6702:2: ( ruleEmptyFeature )
            // InternalKerMLExpressions.g:6703:3: ruleEmptyFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementEmptyFeatureParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmptyFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementEmptyFeatureParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReferenceMember__OwnedRelatedElementAssignment"


    // $ANTLR start "rule__RelationalExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6712:1: rule__RelationalExpression__OperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6716:1: ( ( ruleRelationalOperator ) )
            // InternalKerMLExpressions.g:6717:2: ( ruleRelationalOperator )
            {
            // InternalKerMLExpressions.g:6717:2: ( ruleRelationalOperator )
            // InternalKerMLExpressions.g:6718:3: ruleRelationalOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__RelationalExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6727:1: rule__RelationalExpression__OperandAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6731:1: ( ( ruleAdditiveExpression ) )
            // InternalKerMLExpressions.g:6732:2: ( ruleAdditiveExpression )
            {
            // InternalKerMLExpressions.g:6732:2: ( ruleAdditiveExpression )
            // InternalKerMLExpressions.g:6733:3: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperandAdditiveExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperandAdditiveExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6742:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6746:1: ( ( ruleAdditiveOperator ) )
            // InternalKerMLExpressions.g:6747:2: ( ruleAdditiveOperator )
            {
            // InternalKerMLExpressions.g:6747:2: ( ruleAdditiveOperator )
            // InternalKerMLExpressions.g:6748:3: ruleAdditiveOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6757:1: rule__AdditiveExpression__OperandAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6761:1: ( ( ruleMultiplicativeExpression ) )
            // InternalKerMLExpressions.g:6762:2: ( ruleMultiplicativeExpression )
            {
            // InternalKerMLExpressions.g:6762:2: ( ruleMultiplicativeExpression )
            // InternalKerMLExpressions.g:6763:3: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6772:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6776:1: ( ( ruleMultiplicativeOperator ) )
            // InternalKerMLExpressions.g:6777:2: ( ruleMultiplicativeOperator )
            {
            // InternalKerMLExpressions.g:6777:2: ( ruleMultiplicativeOperator )
            // InternalKerMLExpressions.g:6778:3: ruleMultiplicativeOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6787:1: rule__MultiplicativeExpression__OperandAssignment_1_2 : ( ruleExponentiationExpression ) ;
    public final void rule__MultiplicativeExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6791:1: ( ( ruleExponentiationExpression ) )
            // InternalKerMLExpressions.g:6792:2: ( ruleExponentiationExpression )
            {
            // InternalKerMLExpressions.g:6792:2: ( ruleExponentiationExpression )
            // InternalKerMLExpressions.g:6793:3: ruleExponentiationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperandExponentiationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExponentiationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperandExponentiationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__ExponentiationExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6802:1: rule__ExponentiationExpression__OperatorAssignment_1_1 : ( ruleExponentiationOperator ) ;
    public final void rule__ExponentiationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6806:1: ( ( ruleExponentiationOperator ) )
            // InternalKerMLExpressions.g:6807:2: ( ruleExponentiationOperator )
            {
            // InternalKerMLExpressions.g:6807:2: ( ruleExponentiationOperator )
            // InternalKerMLExpressions.g:6808:3: ruleExponentiationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperatorExponentiationOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExponentiationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getOperatorExponentiationOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ExponentiationExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6817:1: rule__ExponentiationExpression__OperandAssignment_1_2 : ( ruleUnitsExpression ) ;
    public final void rule__ExponentiationExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6821:1: ( ( ruleUnitsExpression ) )
            // InternalKerMLExpressions.g:6822:2: ( ruleUnitsExpression )
            {
            // InternalKerMLExpressions.g:6822:2: ( ruleUnitsExpression )
            // InternalKerMLExpressions.g:6823:3: ruleUnitsExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperandUnitsExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnitsExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getOperandUnitsExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__UnitsExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6832:1: rule__UnitsExpression__OperatorAssignment_1_1 : ( ( '@[' ) ) ;
    public final void rule__UnitsExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6836:1: ( ( ( '@[' ) ) )
            // InternalKerMLExpressions.g:6837:2: ( ( '@[' ) )
            {
            // InternalKerMLExpressions.g:6837:2: ( ( '@[' ) )
            // InternalKerMLExpressions.g:6838:3: ( '@[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtLeftSquareBracketKeyword_1_1_0()); 
            }
            // InternalKerMLExpressions.g:6839:3: ( '@[' )
            // InternalKerMLExpressions.g:6840:4: '@['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtLeftSquareBracketKeyword_1_1_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtLeftSquareBracketKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtLeftSquareBracketKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__UnitsExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6851:1: rule__UnitsExpression__OperandAssignment_1_2 : ( ruleOwnedExpression ) ;
    public final void rule__UnitsExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6855:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6856:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6856:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6857:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_0_1"
    // InternalKerMLExpressions.g:6866:1: rule__UnaryExpression__OperatorAssignment_0_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6870:1: ( ( ruleUnaryOperator ) )
            // InternalKerMLExpressions.g:6871:2: ( ruleUnaryOperator )
            {
            // InternalKerMLExpressions.g:6871:2: ( ruleUnaryOperator )
            // InternalKerMLExpressions.g:6872:3: ruleUnaryOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__UnaryExpression__OperandAssignment_0_2"
    // InternalKerMLExpressions.g:6881:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleExtentExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6885:1: ( ( ruleExtentExpression ) )
            // InternalKerMLExpressions.g:6886:2: ( ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:6886:2: ( ruleExtentExpression )
            // InternalKerMLExpressions.g:6887:3: ruleExtentExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandExtentExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExtentExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandExtentExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperandAssignment_0_2"


    // $ANTLR start "rule__ExtentExpression__OperatorAssignment_0_1"
    // InternalKerMLExpressions.g:6896:1: rule__ExtentExpression__OperatorAssignment_0_1 : ( ( 'all' ) ) ;
    public final void rule__ExtentExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6900:1: ( ( ( 'all' ) ) )
            // InternalKerMLExpressions.g:6901:2: ( ( 'all' ) )
            {
            // InternalKerMLExpressions.g:6901:2: ( ( 'all' ) )
            // InternalKerMLExpressions.g:6902:3: ( 'all' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 
            }
            // InternalKerMLExpressions.g:6903:3: ( 'all' )
            // InternalKerMLExpressions.g:6904:4: 'all'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__ExtentExpression__OwnedRelationshipAssignment_0_2"
    // InternalKerMLExpressions.g:6915:1: rule__ExtentExpression__OwnedRelationshipAssignment_0_2 : ( ruleTypeReferenceMember ) ;
    public final void rule__ExtentExpression__OwnedRelationshipAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6919:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:6920:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:6920:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:6921:3: ruleTypeReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__OwnedRelationshipAssignment_0_2"


    // $ANTLR start "rule__SequenceExpression__OperatorAssignment_1_0_1"
    // InternalKerMLExpressions.g:6930:1: rule__SequenceExpression__OperatorAssignment_1_0_1 : ( ( '[' ) ) ;
    public final void rule__SequenceExpression__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6934:1: ( ( ( '[' ) ) )
            // InternalKerMLExpressions.g:6935:2: ( ( '[' ) )
            {
            // InternalKerMLExpressions.g:6935:2: ( ( '[' ) )
            // InternalKerMLExpressions.g:6936:3: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0()); 
            }
            // InternalKerMLExpressions.g:6937:3: ( '[' )
            // InternalKerMLExpressions.g:6938:4: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__SequenceExpression__OperandAssignment_1_0_2"
    // InternalKerMLExpressions.g:6949:1: rule__SequenceExpression__OperandAssignment_1_0_2 : ( ruleOwnedExpression ) ;
    public final void rule__SequenceExpression__OperandAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6953:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6954:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6954:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6955:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__OperandAssignment_1_0_2"


    // $ANTLR start "rule__SequenceExpression__OperatorAssignment_1_1_2"
    // InternalKerMLExpressions.g:6964:1: rule__SequenceExpression__OperatorAssignment_1_1_2 : ( ruleName ) ;
    public final void rule__SequenceExpression__OperatorAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6968:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6969:2: ( ruleName )
            {
            // InternalKerMLExpressions.g:6969:2: ( ruleName )
            // InternalKerMLExpressions.g:6970:3: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorNameParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorNameParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__OperatorAssignment_1_1_2"


    // $ANTLR start "rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3"
    // InternalKerMLExpressions.g:6979:1: rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3 : ( ruleBodyExpressionMember ) ;
    public final void rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6983:1: ( ( ruleBodyExpressionMember ) )
            // InternalKerMLExpressions.g:6984:2: ( ruleBodyExpressionMember )
            {
            // InternalKerMLExpressions.g:6984:2: ( ruleBodyExpressionMember )
            // InternalKerMLExpressions.g:6985:3: ruleBodyExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOwnedRelationshipBodyExpressionMemberParserRuleCall_1_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOwnedRelationshipBodyExpressionMemberParserRuleCall_1_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__OwnedRelationshipAssignment_1_1_3"


    // $ANTLR start "rule__SequenceExpression__OperandAssignment_1_2_2"
    // InternalKerMLExpressions.g:6994:1: rule__SequenceExpression__OperandAssignment_1_2_2 : ( ruleFeatureNameExpression ) ;
    public final void rule__SequenceExpression__OperandAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6998:1: ( ( ruleFeatureNameExpression ) )
            // InternalKerMLExpressions.g:6999:2: ( ruleFeatureNameExpression )
            {
            // InternalKerMLExpressions.g:6999:2: ( ruleFeatureNameExpression )
            // InternalKerMLExpressions.g:7000:3: ruleFeatureNameExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperandFeatureNameExpressionParserRuleCall_1_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureNameExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperandFeatureNameExpressionParserRuleCall_1_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__OperandAssignment_1_2_2"


    // $ANTLR start "rule__FeatureNameExpression__OwnedRelationshipAssignment"
    // InternalKerMLExpressions.g:7009:1: rule__FeatureNameExpression__OwnedRelationshipAssignment : ( ruleFeatureReferenceMember ) ;
    public final void rule__FeatureNameExpression__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7013:1: ( ( ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:7014:2: ( ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:7014:2: ( ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:7015:3: ruleFeatureReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureNameExpressionAccess().getOwnedRelationshipFeatureReferenceMemberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureNameExpressionAccess().getOwnedRelationshipFeatureReferenceMemberParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureNameExpression__OwnedRelationshipAssignment"


    // $ANTLR start "rule__BodyExpressionMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:7024:1: rule__BodyExpressionMember__OwnedRelatedElementAssignment : ( ruleBodyExpression ) ;
    public final void rule__BodyExpressionMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7028:1: ( ( ruleBodyExpression ) )
            // InternalKerMLExpressions.g:7029:2: ( ruleBodyExpression )
            {
            // InternalKerMLExpressions.g:7029:2: ( ruleBodyExpression )
            // InternalKerMLExpressions.g:7030:3: ruleBodyExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionMemberAccess().getOwnedRelatedElementBodyExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionMemberAccess().getOwnedRelatedElementBodyExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpressionMember__OwnedRelatedElementAssignment"


    // $ANTLR start "rule__BodyExpression__OwnedRelationshipAssignment_0_0_0"
    // InternalKerMLExpressions.g:7039:1: rule__BodyExpression__OwnedRelationshipAssignment_0_0_0 : ( ruleBodyParameterMember ) ;
    public final void rule__BodyExpression__OwnedRelationshipAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7043:1: ( ( ruleBodyParameterMember ) )
            // InternalKerMLExpressions.g:7044:2: ( ruleBodyParameterMember )
            {
            // InternalKerMLExpressions.g:7044:2: ( ruleBodyParameterMember )
            // InternalKerMLExpressions.g:7045:3: ruleBodyParameterMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyParameterMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__OwnedRelationshipAssignment_0_0_0"


    // $ANTLR start "rule__BodyExpression__OwnedRelationshipAssignment_0_0_1"
    // InternalKerMLExpressions.g:7054:1: rule__BodyExpression__OwnedRelationshipAssignment_0_0_1 : ( ruleBodyParameterMember ) ;
    public final void rule__BodyExpression__OwnedRelationshipAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7058:1: ( ( ruleBodyParameterMember ) )
            // InternalKerMLExpressions.g:7059:2: ( ruleBodyParameterMember )
            {
            // InternalKerMLExpressions.g:7059:2: ( ruleBodyParameterMember )
            // InternalKerMLExpressions.g:7060:3: ruleBodyParameterMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyParameterMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__OwnedRelationshipAssignment_0_0_1"


    // $ANTLR start "rule__BodyExpression__OwnedRelationshipAssignment_0_0_3"
    // InternalKerMLExpressions.g:7069:1: rule__BodyExpression__OwnedRelationshipAssignment_0_0_3 : ( ruleResultExpressionMember ) ;
    public final void rule__BodyExpression__OwnedRelationshipAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7073:1: ( ( ruleResultExpressionMember ) )
            // InternalKerMLExpressions.g:7074:2: ( ruleResultExpressionMember )
            {
            // InternalKerMLExpressions.g:7074:2: ( ruleResultExpressionMember )
            // InternalKerMLExpressions.g:7075:3: ruleResultExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipResultExpressionMemberParserRuleCall_0_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleResultExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipResultExpressionMemberParserRuleCall_0_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__OwnedRelationshipAssignment_0_0_3"


    // $ANTLR start "rule__BodyExpression__OwnedRelationshipAssignment_1"
    // InternalKerMLExpressions.g:7084:1: rule__BodyExpression__OwnedRelationshipAssignment_1 : ( ruleOwnedFeatureTyping ) ;
    public final void rule__BodyExpression__OwnedRelationshipAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7088:1: ( ( ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:7089:2: ( ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:7089:2: ( ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:7090:3: ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__OwnedRelationshipAssignment_1"


    // $ANTLR start "rule__ResultExpressionMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:7099:1: rule__ResultExpressionMember__OwnedRelatedElementAssignment : ( ruleOwnedExpression ) ;
    public final void rule__ResultExpressionMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7103:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7104:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7104:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7105:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultExpressionMember__OwnedRelatedElementAssignment"


    // $ANTLR start "rule__BodyParameterMember__MemberNameAssignment_0"
    // InternalKerMLExpressions.g:7114:1: rule__BodyParameterMember__MemberNameAssignment_0 : ( ruleName ) ;
    public final void rule__BodyParameterMember__MemberNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7118:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:7119:2: ( ruleName )
            {
            // InternalKerMLExpressions.g:7119:2: ( ruleName )
            // InternalKerMLExpressions.g:7120:3: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberAccess().getMemberNameNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterMemberAccess().getMemberNameNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__MemberNameAssignment_0"


    // $ANTLR start "rule__BodyParameterMember__OwnedRelatedElementAssignment_1"
    // InternalKerMLExpressions.g:7129:1: rule__BodyParameterMember__OwnedRelatedElementAssignment_1 : ( ruleBodyParameter ) ;
    public final void rule__BodyParameterMember__OwnedRelatedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7133:1: ( ( ruleBodyParameter ) )
            // InternalKerMLExpressions.g:7134:2: ( ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:7134:2: ( ruleBodyParameter )
            // InternalKerMLExpressions.g:7135:3: ruleBodyParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementBodyParameterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementBodyParameterParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__OwnedRelatedElementAssignment_1"


    // $ANTLR start "rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1"
    // InternalKerMLExpressions.g:7144:1: rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 : ( ( ',' ) ) ;
    public final void rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7148:1: ( ( ( ',' ) ) )
            // InternalKerMLExpressions.g:7149:2: ( ( ',' ) )
            {
            // InternalKerMLExpressions.g:7149:2: ( ( ',' ) )
            // InternalKerMLExpressions.g:7150:3: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorCommaKeyword_1_2_0_1_0()); 
            }
            // InternalKerMLExpressions.g:7151:3: ( ',' )
            // InternalKerMLExpressions.g:7152:4: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorCommaKeyword_1_2_0_1_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorCommaKeyword_1_2_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorCommaKeyword_1_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1"


    // $ANTLR start "rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2"
    // InternalKerMLExpressions.g:7163:1: rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2 : ( ruleSequenceElementList ) ;
    public final void rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7167:1: ( ( ruleSequenceElementList ) )
            // InternalKerMLExpressions.g:7168:2: ( ruleSequenceElementList )
            {
            // InternalKerMLExpressions.g:7168:2: ( ruleSequenceElementList )
            // InternalKerMLExpressions.g:7169:3: ruleSequenceElementList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperandSequenceElementListParserRuleCall_1_2_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceElementList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperandSequenceElementListParserRuleCall_1_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__OperandAssignment_1_2_0_2"


    // $ANTLR start "rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1"
    // InternalKerMLExpressions.g:7178:1: rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 : ( ( '..' ) ) ;
    public final void rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7182:1: ( ( ( '..' ) ) )
            // InternalKerMLExpressions.g:7183:2: ( ( '..' ) )
            {
            // InternalKerMLExpressions.g:7183:2: ( ( '..' ) )
            // InternalKerMLExpressions.g:7184:3: ( '..' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorFullStopFullStopKeyword_1_2_1_1_0()); 
            }
            // InternalKerMLExpressions.g:7185:3: ( '..' )
            // InternalKerMLExpressions.g:7186:4: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorFullStopFullStopKeyword_1_2_1_1_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorFullStopFullStopKeyword_1_2_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorFullStopFullStopKeyword_1_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1"


    // $ANTLR start "rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2"
    // InternalKerMLExpressions.g:7197:1: rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2 : ( ruleOwnedExpression ) ;
    public final void rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7201:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7202:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7202:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7203:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__OperandAssignment_1_2_1_2"


    // $ANTLR start "rule__SequenceElementList__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7212:1: rule__SequenceElementList__OperatorAssignment_1_1 : ( ( ',' ) ) ;
    public final void rule__SequenceElementList__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7216:1: ( ( ( ',' ) ) )
            // InternalKerMLExpressions.g:7217:2: ( ( ',' ) )
            {
            // InternalKerMLExpressions.g:7217:2: ( ( ',' ) )
            // InternalKerMLExpressions.g:7218:3: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperatorCommaKeyword_1_1_0()); 
            }
            // InternalKerMLExpressions.g:7219:3: ( ',' )
            // InternalKerMLExpressions.g:7220:4: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperatorCommaKeyword_1_1_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperatorCommaKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperatorCommaKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__OperatorAssignment_1_1"


    // $ANTLR start "rule__SequenceElementList__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:7231:1: rule__SequenceElementList__OperandAssignment_1_2 : ( ruleSequenceElementList ) ;
    public final void rule__SequenceElementList__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7235:1: ( ( ruleSequenceElementList ) )
            // InternalKerMLExpressions.g:7236:2: ( ruleSequenceElementList )
            {
            // InternalKerMLExpressions.g:7236:2: ( ruleSequenceElementList )
            // InternalKerMLExpressions.g:7237:3: ruleSequenceElementList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperandSequenceElementListParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceElementList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperandSequenceElementListParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__OperandAssignment_1_2"


    // $ANTLR start "rule__FeatureReferenceExpression__OwnedRelationshipAssignment"
    // InternalKerMLExpressions.g:7246:1: rule__FeatureReferenceExpression__OwnedRelationshipAssignment : ( ruleFeatureReferenceMember ) ;
    public final void rule__FeatureReferenceExpression__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7250:1: ( ( ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:7251:2: ( ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:7251:2: ( ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:7252:3: ruleFeatureReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipFeatureReferenceMemberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipFeatureReferenceMemberParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureReferenceExpression__OwnedRelationshipAssignment"


    // $ANTLR start "rule__FeatureReferenceMember__MemberElementAssignment"
    // InternalKerMLExpressions.g:7261:1: rule__FeatureReferenceMember__MemberElementAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureReferenceMember__MemberElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7265:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:7266:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:7266:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:7267:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureCrossReference_0()); 
            }
            // InternalKerMLExpressions.g:7268:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:7269:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureReferenceMember__MemberElementAssignment"


    // $ANTLR start "rule__InvocationExpression__OwnedRelationshipAssignment_0"
    // InternalKerMLExpressions.g:7280:1: rule__InvocationExpression__OwnedRelationshipAssignment_0 : ( ruleOwnedFeatureTyping ) ;
    public final void rule__InvocationExpression__OwnedRelationshipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7284:1: ( ( ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:7285:2: ( ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:7285:2: ( ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:7286:3: ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__OwnedRelationshipAssignment_0"


    // $ANTLR start "rule__PositionalArgumentList__OwnedRelationshipAssignment_0"
    // InternalKerMLExpressions.g:7295:1: rule__PositionalArgumentList__OwnedRelationshipAssignment_0 : ( ruleOwnedExpressionMember ) ;
    public final void rule__PositionalArgumentList__OwnedRelationshipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7299:1: ( ( ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:7300:2: ( ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:7300:2: ( ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:7301:3: ruleOwnedExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__OwnedRelationshipAssignment_0"


    // $ANTLR start "rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1"
    // InternalKerMLExpressions.g:7310:1: rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 : ( ruleOwnedExpressionMember ) ;
    public final void rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7314:1: ( ( ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:7315:2: ( ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:7315:2: ( ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:7316:3: ruleOwnedExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1"


    // $ANTLR start "rule__NamedArgumentList__OwnedRelationshipAssignment_0"
    // InternalKerMLExpressions.g:7325:1: rule__NamedArgumentList__OwnedRelationshipAssignment_0 : ( ruleNamedExpressionMember ) ;
    public final void rule__NamedArgumentList__OwnedRelationshipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7329:1: ( ( ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:7330:2: ( ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:7330:2: ( ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:7331:3: ruleNamedExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__OwnedRelationshipAssignment_0"


    // $ANTLR start "rule__NamedArgumentList__OwnedRelationshipAssignment_1_1"
    // InternalKerMLExpressions.g:7340:1: rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 : ( ruleNamedExpressionMember ) ;
    public final void rule__NamedArgumentList__OwnedRelationshipAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7344:1: ( ( ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:7345:2: ( ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:7345:2: ( ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:7346:3: ruleNamedExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__OwnedRelationshipAssignment_1_1"


    // $ANTLR start "rule__NamedExpressionMember__MemberNameAssignment_0"
    // InternalKerMLExpressions.g:7355:1: rule__NamedExpressionMember__MemberNameAssignment_0 : ( ruleName ) ;
    public final void rule__NamedExpressionMember__MemberNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7359:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:7360:2: ( ruleName )
            {
            // InternalKerMLExpressions.g:7360:2: ( ruleName )
            // InternalKerMLExpressions.g:7361:3: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__MemberNameAssignment_0"


    // $ANTLR start "rule__NamedExpressionMember__OwnedRelatedElementAssignment_2"
    // InternalKerMLExpressions.g:7370:1: rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 : ( ruleOwnedExpression ) ;
    public final void rule__NamedExpressionMember__OwnedRelatedElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7374:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7375:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7375:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7376:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__OwnedRelatedElementAssignment_2"


    // $ANTLR start "rule__LiteralBoolean__ValueAssignment"
    // InternalKerMLExpressions.g:7385:1: rule__LiteralBoolean__ValueAssignment : ( ruleBooleanValue ) ;
    public final void rule__LiteralBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7389:1: ( ( ruleBooleanValue ) )
            // InternalKerMLExpressions.g:7390:2: ( ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:7390:2: ( ruleBooleanValue )
            // InternalKerMLExpressions.g:7391:3: ruleBooleanValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__ValueAssignment"


    // $ANTLR start "rule__LiteralString__ValueAssignment"
    // InternalKerMLExpressions.g:7400:1: rule__LiteralString__ValueAssignment : ( RULE_STRING_VALUE ) ;
    public final void rule__LiteralString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7404:1: ( ( RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:7405:2: ( RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:7405:2: ( RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:7406:3: RULE_STRING_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralStringAccess().getValueSTRING_VALUETerminalRuleCall_0()); 
            }
            match(input,RULE_STRING_VALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralStringAccess().getValueSTRING_VALUETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralString__ValueAssignment"


    // $ANTLR start "rule__LiteralInteger__ValueAssignment"
    // InternalKerMLExpressions.g:7415:1: rule__LiteralInteger__ValueAssignment : ( RULE_DECIMAL_VALUE ) ;
    public final void rule__LiteralInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7419:1: ( ( RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:7420:2: ( RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:7420:2: ( RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:7421:3: RULE_DECIMAL_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerAccess().getValueDECIMAL_VALUETerminalRuleCall_0()); 
            }
            match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralIntegerAccess().getValueDECIMAL_VALUETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInteger__ValueAssignment"


    // $ANTLR start "rule__LiteralReal__ValueAssignment"
    // InternalKerMLExpressions.g:7430:1: rule__LiteralReal__ValueAssignment : ( ruleRealValue ) ;
    public final void rule__LiteralReal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7434:1: ( ( ruleRealValue ) )
            // InternalKerMLExpressions.g:7435:2: ( ruleRealValue )
            {
            // InternalKerMLExpressions.g:7435:2: ( ruleRealValue )
            // InternalKerMLExpressions.g:7436:3: ruleRealValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRealAccess().getValueRealValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRealValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRealAccess().getValueRealValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralReal__ValueAssignment"

    // $ANTLR start synpred20_InternalKerMLExpressions
    public final void synpred20_InternalKerMLExpressions_fragment() throws RecognitionException {   
        // InternalKerMLExpressions.g:1963:2: ( ( ( rule__BodyExpression__Group_0__0 ) ) )
        // InternalKerMLExpressions.g:1963:2: ( ( rule__BodyExpression__Group_0__0 ) )
        {
        // InternalKerMLExpressions.g:1963:2: ( ( rule__BodyExpression__Group_0__0 ) )
        // InternalKerMLExpressions.g:1964:3: ( rule__BodyExpression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBodyExpressionAccess().getGroup_0()); 
        }
        // InternalKerMLExpressions.g:1965:3: ( rule__BodyExpression__Group_0__0 )
        // InternalKerMLExpressions.g:1965:4: rule__BodyExpression__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__BodyExpression__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalKerMLExpressions

    // Delegated rules

    public final boolean synpred20_InternalKerMLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalKerMLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\uffff\2\7\4\uffff\2\7";
    static final String dfa_3s = "\1\4\2\uffff\2\16\1\uffff\1\6\2\uffff\2\16";
    static final String dfa_4s = "\1\63\2\uffff\2\70\1\uffff\1\7\2\uffff\2\70";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\uffff\1\3\1\4\2\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\1\3\1\4\1\2\31\uffff\1\2\4\uffff\2\2\3\uffff\1\2\1\5\5\uffff\1\1",
            "",
            "",
            "\27\7\4\uffff\4\7\1\10\1\7\1\uffff\2\7\2\uffff\1\6\1\7\1\uffff\2\7",
            "\27\7\4\uffff\4\7\1\10\1\7\1\uffff\2\7\2\uffff\1\6\1\7\1\uffff\2\7",
            "",
            "\1\11\1\12",
            "",
            "",
            "\27\7\4\uffff\4\7\1\10\1\7\1\uffff\2\7\2\uffff\1\6\1\7\1\uffff\2\7",
            "\27\7\4\uffff\4\7\1\10\1\7\1\uffff\2\7\2\uffff\1\6\1\7\1\uffff\2\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2021:1: rule__BaseExpression__Alternatives : ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ( rule__BaseExpression__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0048B1E7000001F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006300000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080180000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080180000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00002000000000C0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0103000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0102000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0048F1E7000001F0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000118400000130L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000002L});

}