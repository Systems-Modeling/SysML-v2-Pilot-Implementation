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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXP_VALUE", "RULE_DECIMAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STRING_VALUE", "RULE_REGULAR_COMMENT", "RULE_DOCUMENTATION_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'?'", "'??'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'**'", "'=='", "'!='", "'instanceof'", "'hastype'", "'istype'", "'@'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'true'", "'false'", "':'", "']'", "'.'", "'('", "')'", "'->'", "'{'", "'}'", "','", "'=>'", "'null'", "'::'", "'@['", "'all'", "'allInstances'", "'['", "'..'"
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
    // InternalKerMLExpressions.g:63:1: ruleOwnedExpressionMember : ( ( rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment ) ) ;
    public final void ruleOwnedExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:67:2: ( ( ( rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment ) ) )
            // InternalKerMLExpressions.g:68:2: ( ( rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment ) )
            {
            // InternalKerMLExpressions.g:68:2: ( ( rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment ) )
            // InternalKerMLExpressions.g:69:3: ( rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedExpressionMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }
            // InternalKerMLExpressions.g:70:3: ( rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment )
            // InternalKerMLExpressions.g:70:4: rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedExpressionMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:563:1: ruleTypeReferenceMember : ( ( rule__TypeReferenceMember__OwnedMemberFeature_compAssignment ) ) ;
    public final void ruleTypeReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:567:2: ( ( ( rule__TypeReferenceMember__OwnedMemberFeature_compAssignment ) ) )
            // InternalKerMLExpressions.g:568:2: ( ( rule__TypeReferenceMember__OwnedMemberFeature_compAssignment ) )
            {
            // InternalKerMLExpressions.g:568:2: ( ( rule__TypeReferenceMember__OwnedMemberFeature_compAssignment ) )
            // InternalKerMLExpressions.g:569:3: ( rule__TypeReferenceMember__OwnedMemberFeature_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }
            // InternalKerMLExpressions.g:570:3: ( rule__TypeReferenceMember__OwnedMemberFeature_compAssignment )
            // InternalKerMLExpressions.g:570:4: rule__TypeReferenceMember__OwnedMemberFeature_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReferenceMember__OwnedMemberFeature_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:588:1: ruleTypeReference : ( ( rule__TypeReference__OwnedRelationship_compAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:592:2: ( ( ( rule__TypeReference__OwnedRelationship_compAssignment ) ) )
            // InternalKerMLExpressions.g:593:2: ( ( rule__TypeReference__OwnedRelationship_compAssignment ) )
            {
            // InternalKerMLExpressions.g:593:2: ( ( rule__TypeReference__OwnedRelationship_compAssignment ) )
            // InternalKerMLExpressions.g:594:3: ( rule__TypeReference__OwnedRelationship_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getOwnedRelationship_compAssignment()); 
            }
            // InternalKerMLExpressions.g:595:3: ( rule__TypeReference__OwnedRelationship_compAssignment )
            // InternalKerMLExpressions.g:595:4: rule__TypeReference__OwnedRelationship_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__OwnedRelationship_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getOwnedRelationship_compAssignment()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:638:1: ruleSelfReferenceExpression : ( ( rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment ) ) ;
    public final void ruleSelfReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:642:2: ( ( ( rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment ) ) )
            // InternalKerMLExpressions.g:643:2: ( ( rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment ) )
            {
            // InternalKerMLExpressions.g:643:2: ( ( rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment ) )
            // InternalKerMLExpressions.g:644:3: ( rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceExpressionAccess().getOwnedFeatureMembership_compAssignment()); 
            }
            // InternalKerMLExpressions.g:645:3: ( rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment )
            // InternalKerMLExpressions.g:645:4: rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceExpressionAccess().getOwnedFeatureMembership_compAssignment()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:663:1: ruleSelfReferenceMember : ( ( rule__SelfReferenceMember__OwnedMemberFeature_compAssignment ) ) ;
    public final void ruleSelfReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:667:2: ( ( ( rule__SelfReferenceMember__OwnedMemberFeature_compAssignment ) ) )
            // InternalKerMLExpressions.g:668:2: ( ( rule__SelfReferenceMember__OwnedMemberFeature_compAssignment ) )
            {
            // InternalKerMLExpressions.g:668:2: ( ( rule__SelfReferenceMember__OwnedMemberFeature_compAssignment ) )
            // InternalKerMLExpressions.g:669:3: ( rule__SelfReferenceMember__OwnedMemberFeature_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }
            // InternalKerMLExpressions.g:670:3: ( rule__SelfReferenceMember__OwnedMemberFeature_compAssignment )
            // InternalKerMLExpressions.g:670:4: rule__SelfReferenceMember__OwnedMemberFeature_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SelfReferenceMember__OwnedMemberFeature_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleExtentExpression_Deprecated"
    // InternalKerMLExpressions.g:1004:1: entryRuleExtentExpression_Deprecated : ruleExtentExpression_Deprecated EOF ;
    public final void entryRuleExtentExpression_Deprecated() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1005:1: ( ruleExtentExpression_Deprecated EOF )
            // InternalKerMLExpressions.g:1006:1: ruleExtentExpression_Deprecated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExtentExpression_Deprecated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedRule()); 
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
    // $ANTLR end "entryRuleExtentExpression_Deprecated"


    // $ANTLR start "ruleExtentExpression_Deprecated"
    // InternalKerMLExpressions.g:1013:1: ruleExtentExpression_Deprecated : ( ( rule__ExtentExpression_Deprecated__Group__0 ) ) ;
    public final void ruleExtentExpression_Deprecated() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1017:2: ( ( ( rule__ExtentExpression_Deprecated__Group__0 ) ) )
            // InternalKerMLExpressions.g:1018:2: ( ( rule__ExtentExpression_Deprecated__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1018:2: ( ( rule__ExtentExpression_Deprecated__Group__0 ) )
            // InternalKerMLExpressions.g:1019:3: ( rule__ExtentExpression_Deprecated__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1020:3: ( rule__ExtentExpression_Deprecated__Group__0 )
            // InternalKerMLExpressions.g:1020:4: rule__ExtentExpression_Deprecated__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression_Deprecated__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtentExpression_Deprecated"


    // $ANTLR start "entryRuleSequenceExpression"
    // InternalKerMLExpressions.g:1029:1: entryRuleSequenceExpression : ruleSequenceExpression EOF ;
    public final void entryRuleSequenceExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1030:1: ( ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:1031:1: ruleSequenceExpression EOF
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
    // InternalKerMLExpressions.g:1038:1: ruleSequenceExpression : ( ( rule__SequenceExpression__Group__0 ) ) ;
    public final void ruleSequenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1042:2: ( ( ( rule__SequenceExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1043:2: ( ( rule__SequenceExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1043:2: ( ( rule__SequenceExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1044:3: ( rule__SequenceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1045:3: ( rule__SequenceExpression__Group__0 )
            // InternalKerMLExpressions.g:1045:4: rule__SequenceExpression__Group__0
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
    // InternalKerMLExpressions.g:1063:1: ruleBodyExpressionMember : ( ( rule__BodyExpressionMember__OwnedMemberFeature_compAssignment ) ) ;
    public final void ruleBodyExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1067:2: ( ( ( rule__BodyExpressionMember__OwnedMemberFeature_compAssignment ) ) )
            // InternalKerMLExpressions.g:1068:2: ( ( rule__BodyExpressionMember__OwnedMemberFeature_compAssignment ) )
            {
            // InternalKerMLExpressions.g:1068:2: ( ( rule__BodyExpressionMember__OwnedMemberFeature_compAssignment ) )
            // InternalKerMLExpressions.g:1069:3: ( rule__BodyExpressionMember__OwnedMemberFeature_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }
            // InternalKerMLExpressions.g:1070:3: ( rule__BodyExpressionMember__OwnedMemberFeature_compAssignment )
            // InternalKerMLExpressions.g:1070:4: rule__BodyExpressionMember__OwnedMemberFeature_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpressionMember__OwnedMemberFeature_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:1113:1: ruleResultExpressionMember : ( ( rule__ResultExpressionMember__OwnedResultExpression_compAssignment ) ) ;
    public final void ruleResultExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1117:2: ( ( ( rule__ResultExpressionMember__OwnedResultExpression_compAssignment ) ) )
            // InternalKerMLExpressions.g:1118:2: ( ( rule__ResultExpressionMember__OwnedResultExpression_compAssignment ) )
            {
            // InternalKerMLExpressions.g:1118:2: ( ( rule__ResultExpressionMember__OwnedResultExpression_compAssignment ) )
            // InternalKerMLExpressions.g:1119:3: ( rule__ResultExpressionMember__OwnedResultExpression_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultExpressionMemberAccess().getOwnedResultExpression_compAssignment()); 
            }
            // InternalKerMLExpressions.g:1120:3: ( rule__ResultExpressionMember__OwnedResultExpression_compAssignment )
            // InternalKerMLExpressions.g:1120:4: rule__ResultExpressionMember__OwnedResultExpression_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ResultExpressionMember__OwnedResultExpression_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultExpressionMemberAccess().getOwnedResultExpression_compAssignment()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:1263:1: ruleFeatureReferenceExpression : ( ( rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment ) ) ;
    public final void ruleFeatureReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1267:2: ( ( ( rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment ) ) )
            // InternalKerMLExpressions.g:1268:2: ( ( rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment ) )
            {
            // InternalKerMLExpressions.g:1268:2: ( ( rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment ) )
            // InternalKerMLExpressions.g:1269:3: ( rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedFeatureMembership_compAssignment()); 
            }
            // InternalKerMLExpressions.g:1270:3: ( rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment )
            // InternalKerMLExpressions.g:1270:4: rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedFeatureMembership_compAssignment()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:1288:1: ruleFeatureReferenceMember : ( ( rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment ) ) ;
    public final void ruleFeatureReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1292:2: ( ( ( rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment ) ) )
            // InternalKerMLExpressions.g:1293:2: ( ( rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment ) )
            {
            // InternalKerMLExpressions.g:1293:2: ( ( rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment ) )
            // InternalKerMLExpressions.g:1294:3: ( rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }
            // InternalKerMLExpressions.g:1295:3: ( rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment )
            // InternalKerMLExpressions.g:1295:4: rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceMemberAccess().getOwnedMemberFeature_compAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleFeatureReference"
    // InternalKerMLExpressions.g:1304:1: entryRuleFeatureReference : ruleFeatureReference EOF ;
    public final void entryRuleFeatureReference() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1305:1: ( ruleFeatureReference EOF )
            // InternalKerMLExpressions.g:1306:1: ruleFeatureReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceRule()); 
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
    // $ANTLR end "entryRuleFeatureReference"


    // $ANTLR start "ruleFeatureReference"
    // InternalKerMLExpressions.g:1313:1: ruleFeatureReference : ( ( rule__FeatureReference__OwnedRelationship_compAssignment ) ) ;
    public final void ruleFeatureReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1317:2: ( ( ( rule__FeatureReference__OwnedRelationship_compAssignment ) ) )
            // InternalKerMLExpressions.g:1318:2: ( ( rule__FeatureReference__OwnedRelationship_compAssignment ) )
            {
            // InternalKerMLExpressions.g:1318:2: ( ( rule__FeatureReference__OwnedRelationship_compAssignment ) )
            // InternalKerMLExpressions.g:1319:3: ( rule__FeatureReference__OwnedRelationship_compAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceAccess().getOwnedRelationship_compAssignment()); 
            }
            // InternalKerMLExpressions.g:1320:3: ( rule__FeatureReference__OwnedRelationship_compAssignment )
            // InternalKerMLExpressions.g:1320:4: rule__FeatureReference__OwnedRelationship_compAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureReference__OwnedRelationship_compAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceAccess().getOwnedRelationship_compAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureReference"


    // $ANTLR start "entryRuleOwnedSubsetting"
    // InternalKerMLExpressions.g:1329:1: entryRuleOwnedSubsetting : ruleOwnedSubsetting EOF ;
    public final void entryRuleOwnedSubsetting() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1330:1: ( ruleOwnedSubsetting EOF )
            // InternalKerMLExpressions.g:1331:1: ruleOwnedSubsetting EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedSubsettingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOwnedSubsetting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedSubsettingRule()); 
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
    // $ANTLR end "entryRuleOwnedSubsetting"


    // $ANTLR start "ruleOwnedSubsetting"
    // InternalKerMLExpressions.g:1338:1: ruleOwnedSubsetting : ( ( rule__OwnedSubsetting__SubsettedFeatureAssignment ) ) ;
    public final void ruleOwnedSubsetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1342:2: ( ( ( rule__OwnedSubsetting__SubsettedFeatureAssignment ) ) )
            // InternalKerMLExpressions.g:1343:2: ( ( rule__OwnedSubsetting__SubsettedFeatureAssignment ) )
            {
            // InternalKerMLExpressions.g:1343:2: ( ( rule__OwnedSubsetting__SubsettedFeatureAssignment ) )
            // InternalKerMLExpressions.g:1344:3: ( rule__OwnedSubsetting__SubsettedFeatureAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedSubsettingAccess().getSubsettedFeatureAssignment()); 
            }
            // InternalKerMLExpressions.g:1345:3: ( rule__OwnedSubsetting__SubsettedFeatureAssignment )
            // InternalKerMLExpressions.g:1345:4: rule__OwnedSubsetting__SubsettedFeatureAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OwnedSubsetting__SubsettedFeatureAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedSubsettingAccess().getSubsettedFeatureAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedSubsetting"


    // $ANTLR start "entryRuleInvocationExpression"
    // InternalKerMLExpressions.g:1354:1: entryRuleInvocationExpression : ruleInvocationExpression EOF ;
    public final void entryRuleInvocationExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1355:1: ( ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:1356:1: ruleInvocationExpression EOF
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
    // InternalKerMLExpressions.g:1363:1: ruleInvocationExpression : ( ( rule__InvocationExpression__Group__0 ) ) ;
    public final void ruleInvocationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1367:2: ( ( ( rule__InvocationExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1368:2: ( ( rule__InvocationExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1368:2: ( ( rule__InvocationExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1369:3: ( rule__InvocationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1370:3: ( rule__InvocationExpression__Group__0 )
            // InternalKerMLExpressions.g:1370:4: rule__InvocationExpression__Group__0
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
    // InternalKerMLExpressions.g:1380:1: ruleArgumentList : ( ( rule__ArgumentList__Alternatives ) ) ;
    public final void ruleArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1384:2: ( ( ( rule__ArgumentList__Alternatives ) ) )
            // InternalKerMLExpressions.g:1385:2: ( ( rule__ArgumentList__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1385:2: ( ( rule__ArgumentList__Alternatives ) )
            // InternalKerMLExpressions.g:1386:3: ( rule__ArgumentList__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentListAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1387:3: ( rule__ArgumentList__Alternatives )
            // InternalKerMLExpressions.g:1387:4: rule__ArgumentList__Alternatives
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
    // InternalKerMLExpressions.g:1397:1: rulePositionalArgumentList : ( ( rule__PositionalArgumentList__Group__0 ) ) ;
    public final void rulePositionalArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1401:2: ( ( ( rule__PositionalArgumentList__Group__0 ) ) )
            // InternalKerMLExpressions.g:1402:2: ( ( rule__PositionalArgumentList__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1402:2: ( ( rule__PositionalArgumentList__Group__0 ) )
            // InternalKerMLExpressions.g:1403:3: ( rule__PositionalArgumentList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1404:3: ( rule__PositionalArgumentList__Group__0 )
            // InternalKerMLExpressions.g:1404:4: rule__PositionalArgumentList__Group__0
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
    // InternalKerMLExpressions.g:1414:1: ruleNamedArgumentList : ( ( rule__NamedArgumentList__Group__0 ) ) ;
    public final void ruleNamedArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1418:2: ( ( ( rule__NamedArgumentList__Group__0 ) ) )
            // InternalKerMLExpressions.g:1419:2: ( ( rule__NamedArgumentList__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1419:2: ( ( rule__NamedArgumentList__Group__0 ) )
            // InternalKerMLExpressions.g:1420:3: ( rule__NamedArgumentList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1421:3: ( rule__NamedArgumentList__Group__0 )
            // InternalKerMLExpressions.g:1421:4: rule__NamedArgumentList__Group__0
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
    // InternalKerMLExpressions.g:1430:1: entryRuleNamedExpressionMember : ruleNamedExpressionMember EOF ;
    public final void entryRuleNamedExpressionMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1431:1: ( ruleNamedExpressionMember EOF )
            // InternalKerMLExpressions.g:1432:1: ruleNamedExpressionMember EOF
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
    // InternalKerMLExpressions.g:1439:1: ruleNamedExpressionMember : ( ( rule__NamedExpressionMember__Group__0 ) ) ;
    public final void ruleNamedExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1443:2: ( ( ( rule__NamedExpressionMember__Group__0 ) ) )
            // InternalKerMLExpressions.g:1444:2: ( ( rule__NamedExpressionMember__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1444:2: ( ( rule__NamedExpressionMember__Group__0 ) )
            // InternalKerMLExpressions.g:1445:3: ( rule__NamedExpressionMember__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1446:3: ( rule__NamedExpressionMember__Group__0 )
            // InternalKerMLExpressions.g:1446:4: rule__NamedExpressionMember__Group__0
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
    // InternalKerMLExpressions.g:1455:1: entryRuleNullExpression : ruleNullExpression EOF ;
    public final void entryRuleNullExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1456:1: ( ruleNullExpression EOF )
            // InternalKerMLExpressions.g:1457:1: ruleNullExpression EOF
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
    // InternalKerMLExpressions.g:1464:1: ruleNullExpression : ( ( rule__NullExpression__Group__0 ) ) ;
    public final void ruleNullExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1468:2: ( ( ( rule__NullExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1469:2: ( ( rule__NullExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1469:2: ( ( rule__NullExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1470:3: ( rule__NullExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullExpressionAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1471:3: ( rule__NullExpression__Group__0 )
            // InternalKerMLExpressions.g:1471:4: rule__NullExpression__Group__0
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
    // InternalKerMLExpressions.g:1480:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1481:1: ( ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:1482:1: ruleLiteralExpression EOF
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
    // InternalKerMLExpressions.g:1489:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1493:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:1494:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1494:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalKerMLExpressions.g:1495:3: ( rule__LiteralExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1496:3: ( rule__LiteralExpression__Alternatives )
            // InternalKerMLExpressions.g:1496:4: rule__LiteralExpression__Alternatives
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
    // InternalKerMLExpressions.g:1505:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1506:1: ( ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:1507:1: ruleLiteralBoolean EOF
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
    // InternalKerMLExpressions.g:1514:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__ValueAssignment ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1518:2: ( ( ( rule__LiteralBoolean__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1519:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1519:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            // InternalKerMLExpressions.g:1520:3: ( rule__LiteralBoolean__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 
            }
            // InternalKerMLExpressions.g:1521:3: ( rule__LiteralBoolean__ValueAssignment )
            // InternalKerMLExpressions.g:1521:4: rule__LiteralBoolean__ValueAssignment
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
    // InternalKerMLExpressions.g:1530:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1531:1: ( ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:1532:1: ruleBooleanValue EOF
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
    // InternalKerMLExpressions.g:1539:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1543:2: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // InternalKerMLExpressions.g:1544:2: ( ( rule__BooleanValue__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1544:2: ( ( rule__BooleanValue__Alternatives ) )
            // InternalKerMLExpressions.g:1545:3: ( rule__BooleanValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1546:3: ( rule__BooleanValue__Alternatives )
            // InternalKerMLExpressions.g:1546:4: rule__BooleanValue__Alternatives
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
    // InternalKerMLExpressions.g:1555:1: entryRuleLiteralString : ruleLiteralString EOF ;
    public final void entryRuleLiteralString() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1556:1: ( ruleLiteralString EOF )
            // InternalKerMLExpressions.g:1557:1: ruleLiteralString EOF
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
    // InternalKerMLExpressions.g:1564:1: ruleLiteralString : ( ( rule__LiteralString__ValueAssignment ) ) ;
    public final void ruleLiteralString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1568:2: ( ( ( rule__LiteralString__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1569:2: ( ( rule__LiteralString__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1569:2: ( ( rule__LiteralString__ValueAssignment ) )
            // InternalKerMLExpressions.g:1570:3: ( rule__LiteralString__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralStringAccess().getValueAssignment()); 
            }
            // InternalKerMLExpressions.g:1571:3: ( rule__LiteralString__ValueAssignment )
            // InternalKerMLExpressions.g:1571:4: rule__LiteralString__ValueAssignment
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
    // InternalKerMLExpressions.g:1580:1: entryRuleLiteralInteger : ruleLiteralInteger EOF ;
    public final void entryRuleLiteralInteger() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1581:1: ( ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:1582:1: ruleLiteralInteger EOF
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
    // InternalKerMLExpressions.g:1589:1: ruleLiteralInteger : ( ( rule__LiteralInteger__ValueAssignment ) ) ;
    public final void ruleLiteralInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1593:2: ( ( ( rule__LiteralInteger__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1594:2: ( ( rule__LiteralInteger__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1594:2: ( ( rule__LiteralInteger__ValueAssignment ) )
            // InternalKerMLExpressions.g:1595:3: ( rule__LiteralInteger__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerAccess().getValueAssignment()); 
            }
            // InternalKerMLExpressions.g:1596:3: ( rule__LiteralInteger__ValueAssignment )
            // InternalKerMLExpressions.g:1596:4: rule__LiteralInteger__ValueAssignment
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
    // InternalKerMLExpressions.g:1605:1: entryRuleLiteralReal : ruleLiteralReal EOF ;
    public final void entryRuleLiteralReal() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1606:1: ( ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:1607:1: ruleLiteralReal EOF
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
    // InternalKerMLExpressions.g:1614:1: ruleLiteralReal : ( ( rule__LiteralReal__ValueAssignment ) ) ;
    public final void ruleLiteralReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1618:2: ( ( ( rule__LiteralReal__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1619:2: ( ( rule__LiteralReal__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1619:2: ( ( rule__LiteralReal__ValueAssignment ) )
            // InternalKerMLExpressions.g:1620:3: ( rule__LiteralReal__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRealAccess().getValueAssignment()); 
            }
            // InternalKerMLExpressions.g:1621:3: ( rule__LiteralReal__ValueAssignment )
            // InternalKerMLExpressions.g:1621:4: rule__LiteralReal__ValueAssignment
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
    // InternalKerMLExpressions.g:1630:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1631:1: ( ruleRealValue EOF )
            // InternalKerMLExpressions.g:1632:1: ruleRealValue EOF
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
    // InternalKerMLExpressions.g:1639:1: ruleRealValue : ( ( rule__RealValue__Alternatives ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1643:2: ( ( ( rule__RealValue__Alternatives ) ) )
            // InternalKerMLExpressions.g:1644:2: ( ( rule__RealValue__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1644:2: ( ( rule__RealValue__Alternatives ) )
            // InternalKerMLExpressions.g:1645:3: ( rule__RealValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1646:3: ( rule__RealValue__Alternatives )
            // InternalKerMLExpressions.g:1646:4: rule__RealValue__Alternatives
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
    // InternalKerMLExpressions.g:1655:1: entryRuleLiteralUnbounded : ruleLiteralUnbounded EOF ;
    public final void entryRuleLiteralUnbounded() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1656:1: ( ruleLiteralUnbounded EOF )
            // InternalKerMLExpressions.g:1657:1: ruleLiteralUnbounded EOF
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
    // InternalKerMLExpressions.g:1664:1: ruleLiteralUnbounded : ( ( rule__LiteralUnbounded__Group__0 ) ) ;
    public final void ruleLiteralUnbounded() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1668:2: ( ( ( rule__LiteralUnbounded__Group__0 ) ) )
            // InternalKerMLExpressions.g:1669:2: ( ( rule__LiteralUnbounded__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1669:2: ( ( rule__LiteralUnbounded__Group__0 ) )
            // InternalKerMLExpressions.g:1670:3: ( rule__LiteralUnbounded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralUnboundedAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1671:3: ( rule__LiteralUnbounded__Group__0 )
            // InternalKerMLExpressions.g:1671:4: rule__LiteralUnbounded__Group__0
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
    // InternalKerMLExpressions.g:1680:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1681:1: ( ruleName EOF )
            // InternalKerMLExpressions.g:1682:1: ruleName EOF
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
    // InternalKerMLExpressions.g:1689:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1693:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalKerMLExpressions.g:1694:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1694:2: ( ( rule__Name__Alternatives ) )
            // InternalKerMLExpressions.g:1695:3: ( rule__Name__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1696:3: ( rule__Name__Alternatives )
            // InternalKerMLExpressions.g:1696:4: rule__Name__Alternatives
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
    // InternalKerMLExpressions.g:1705:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1706:1: ( ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:1707:1: ruleQualifiedName EOF
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
    // InternalKerMLExpressions.g:1714:1: ruleQualifiedName : ( ( rule__QualifiedName__Alternatives ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1718:2: ( ( ( rule__QualifiedName__Alternatives ) ) )
            // InternalKerMLExpressions.g:1719:2: ( ( rule__QualifiedName__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1719:2: ( ( rule__QualifiedName__Alternatives ) )
            // InternalKerMLExpressions.g:1720:3: ( rule__QualifiedName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getAlternatives()); 
            }
            // InternalKerMLExpressions.g:1721:3: ( rule__QualifiedName__Alternatives )
            // InternalKerMLExpressions.g:1721:4: rule__QualifiedName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleColonQualifiedName"
    // InternalKerMLExpressions.g:1730:1: entryRuleColonQualifiedName : ruleColonQualifiedName EOF ;
    public final void entryRuleColonQualifiedName() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1731:1: ( ruleColonQualifiedName EOF )
            // InternalKerMLExpressions.g:1732:1: ruleColonQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColonQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleColonQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColonQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleColonQualifiedName"


    // $ANTLR start "ruleColonQualifiedName"
    // InternalKerMLExpressions.g:1739:1: ruleColonQualifiedName : ( ( rule__ColonQualifiedName__Group__0 ) ) ;
    public final void ruleColonQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1743:2: ( ( ( rule__ColonQualifiedName__Group__0 ) ) )
            // InternalKerMLExpressions.g:1744:2: ( ( rule__ColonQualifiedName__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1744:2: ( ( rule__ColonQualifiedName__Group__0 ) )
            // InternalKerMLExpressions.g:1745:3: ( rule__ColonQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColonQualifiedNameAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1746:3: ( rule__ColonQualifiedName__Group__0 )
            // InternalKerMLExpressions.g:1746:4: rule__ColonQualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColonQualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColonQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColonQualifiedName"


    // $ANTLR start "entryRuleDotQualifiedName"
    // InternalKerMLExpressions.g:1755:1: entryRuleDotQualifiedName : ruleDotQualifiedName EOF ;
    public final void entryRuleDotQualifiedName() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1756:1: ( ruleDotQualifiedName EOF )
            // InternalKerMLExpressions.g:1757:1: ruleDotQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDotQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleDotQualifiedName"


    // $ANTLR start "ruleDotQualifiedName"
    // InternalKerMLExpressions.g:1764:1: ruleDotQualifiedName : ( ( rule__DotQualifiedName__Group__0 ) ) ;
    public final void ruleDotQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1768:2: ( ( ( rule__DotQualifiedName__Group__0 ) ) )
            // InternalKerMLExpressions.g:1769:2: ( ( rule__DotQualifiedName__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1769:2: ( ( rule__DotQualifiedName__Group__0 ) )
            // InternalKerMLExpressions.g:1770:3: ( rule__DotQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotQualifiedNameAccess().getGroup()); 
            }
            // InternalKerMLExpressions.g:1771:3: ( rule__DotQualifiedName__Group__0 )
            // InternalKerMLExpressions.g:1771:4: rule__DotQualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DotQualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotQualifiedName"


    // $ANTLR start "rule__EqualityOperator__Alternatives"
    // InternalKerMLExpressions.g:1779:1: rule__EqualityOperator__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1783:1: ( ( '==' ) | ( '!=' ) )
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
                    // InternalKerMLExpressions.g:1784:2: ( '==' )
                    {
                    // InternalKerMLExpressions.g:1784:2: ( '==' )
                    // InternalKerMLExpressions.g:1785:3: '=='
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
                    // InternalKerMLExpressions.g:1790:2: ( '!=' )
                    {
                    // InternalKerMLExpressions.g:1790:2: ( '!=' )
                    // InternalKerMLExpressions.g:1791:3: '!='
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
    // InternalKerMLExpressions.g:1800:1: rule__ClassificationExpression__Alternatives : ( ( ( rule__ClassificationExpression__Group_0__0 ) ) | ( ( rule__ClassificationExpression__Group_1__0 ) ) );
    public final void rule__ClassificationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1804:1: ( ( ( rule__ClassificationExpression__Group_0__0 ) ) | ( ( rule__ClassificationExpression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_EXP_VALUE && LA2_0<=RULE_STRING_VALUE)||(LA2_0>=32 && LA2_0<=34)||(LA2_0>=37 && LA2_0<=40)||(LA2_0>=43 && LA2_0<=44)||LA2_0==47||LA2_0==51||LA2_0==54) ) {
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
                    // InternalKerMLExpressions.g:1805:2: ( ( rule__ClassificationExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1805:2: ( ( rule__ClassificationExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1806:3: ( rule__ClassificationExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassificationExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:1807:3: ( rule__ClassificationExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1807:4: rule__ClassificationExpression__Group_0__0
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
                    // InternalKerMLExpressions.g:1811:2: ( ( rule__ClassificationExpression__Group_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:1811:2: ( ( rule__ClassificationExpression__Group_1__0 ) )
                    // InternalKerMLExpressions.g:1812:3: ( rule__ClassificationExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassificationExpressionAccess().getGroup_1()); 
                    }
                    // InternalKerMLExpressions.g:1813:3: ( rule__ClassificationExpression__Group_1__0 )
                    // InternalKerMLExpressions.g:1813:4: rule__ClassificationExpression__Group_1__0
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
    // InternalKerMLExpressions.g:1821:1: rule__ClassificationOperator__Alternatives : ( ( 'instanceof' ) | ( 'hastype' ) | ( 'istype' ) | ( '@' ) );
    public final void rule__ClassificationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1825:1: ( ( 'instanceof' ) | ( 'hastype' ) | ( 'istype' ) | ( '@' ) )
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
                    // InternalKerMLExpressions.g:1826:2: ( 'instanceof' )
                    {
                    // InternalKerMLExpressions.g:1826:2: ( 'instanceof' )
                    // InternalKerMLExpressions.g:1827:3: 'instanceof'
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
                    // InternalKerMLExpressions.g:1832:2: ( 'hastype' )
                    {
                    // InternalKerMLExpressions.g:1832:2: ( 'hastype' )
                    // InternalKerMLExpressions.g:1833:3: 'hastype'
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
                    // InternalKerMLExpressions.g:1838:2: ( 'istype' )
                    {
                    // InternalKerMLExpressions.g:1838:2: ( 'istype' )
                    // InternalKerMLExpressions.g:1839:3: 'istype'
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
                    // InternalKerMLExpressions.g:1844:2: ( '@' )
                    {
                    // InternalKerMLExpressions.g:1844:2: ( '@' )
                    // InternalKerMLExpressions.g:1845:3: '@'
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
    // InternalKerMLExpressions.g:1854:1: rule__RelationalOperator__Alternatives : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1858:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
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
                    // InternalKerMLExpressions.g:1859:2: ( '<' )
                    {
                    // InternalKerMLExpressions.g:1859:2: ( '<' )
                    // InternalKerMLExpressions.g:1860:3: '<'
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
                    // InternalKerMLExpressions.g:1865:2: ( '>' )
                    {
                    // InternalKerMLExpressions.g:1865:2: ( '>' )
                    // InternalKerMLExpressions.g:1866:3: '>'
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
                    // InternalKerMLExpressions.g:1871:2: ( '<=' )
                    {
                    // InternalKerMLExpressions.g:1871:2: ( '<=' )
                    // InternalKerMLExpressions.g:1872:3: '<='
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
                    // InternalKerMLExpressions.g:1877:2: ( '>=' )
                    {
                    // InternalKerMLExpressions.g:1877:2: ( '>=' )
                    // InternalKerMLExpressions.g:1878:3: '>='
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
    // InternalKerMLExpressions.g:1887:1: rule__AdditiveOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1891:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalKerMLExpressions.g:1892:2: ( '+' )
                    {
                    // InternalKerMLExpressions.g:1892:2: ( '+' )
                    // InternalKerMLExpressions.g:1893:3: '+'
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
                    // InternalKerMLExpressions.g:1898:2: ( '-' )
                    {
                    // InternalKerMLExpressions.g:1898:2: ( '-' )
                    // InternalKerMLExpressions.g:1899:3: '-'
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
    // InternalKerMLExpressions.g:1908:1: rule__MultiplicativeOperator__Alternatives : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1912:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
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
                    // InternalKerMLExpressions.g:1913:2: ( '*' )
                    {
                    // InternalKerMLExpressions.g:1913:2: ( '*' )
                    // InternalKerMLExpressions.g:1914:3: '*'
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
                    // InternalKerMLExpressions.g:1919:2: ( '/' )
                    {
                    // InternalKerMLExpressions.g:1919:2: ( '/' )
                    // InternalKerMLExpressions.g:1920:3: '/'
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
                    // InternalKerMLExpressions.g:1925:2: ( '%' )
                    {
                    // InternalKerMLExpressions.g:1925:2: ( '%' )
                    // InternalKerMLExpressions.g:1926:3: '%'
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
    // InternalKerMLExpressions.g:1935:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleExtentExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1939:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleExtentExpression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=32 && LA7_0<=33)||(LA7_0>=37 && LA7_0<=38)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_EXP_VALUE && LA7_0<=RULE_STRING_VALUE)||LA7_0==34||(LA7_0>=39 && LA7_0<=40)||(LA7_0>=43 && LA7_0<=44)||LA7_0==47||LA7_0==51||LA7_0==54) ) {
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
                    // InternalKerMLExpressions.g:1940:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1940:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1941:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:1942:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1942:4: rule__UnaryExpression__Group_0__0
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
                    // InternalKerMLExpressions.g:1946:2: ( ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:1946:2: ( ruleExtentExpression )
                    // InternalKerMLExpressions.g:1947:3: ruleExtentExpression
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
    // InternalKerMLExpressions.g:1956:1: rule__UnaryOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '!' ) | ( '~' ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1960:1: ( ( '+' ) | ( '-' ) | ( '!' ) | ( '~' ) )
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
                    // InternalKerMLExpressions.g:1961:2: ( '+' )
                    {
                    // InternalKerMLExpressions.g:1961:2: ( '+' )
                    // InternalKerMLExpressions.g:1962:3: '+'
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
                    // InternalKerMLExpressions.g:1967:2: ( '-' )
                    {
                    // InternalKerMLExpressions.g:1967:2: ( '-' )
                    // InternalKerMLExpressions.g:1968:3: '-'
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
                    // InternalKerMLExpressions.g:1973:2: ( '!' )
                    {
                    // InternalKerMLExpressions.g:1973:2: ( '!' )
                    // InternalKerMLExpressions.g:1974:3: '!'
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
                    // InternalKerMLExpressions.g:1979:2: ( '~' )
                    {
                    // InternalKerMLExpressions.g:1979:2: ( '~' )
                    // InternalKerMLExpressions.g:1980:3: '~'
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
    // InternalKerMLExpressions.g:1989:1: rule__ExtentExpression__Alternatives : ( ( ( rule__ExtentExpression__Group_0__0 ) ) | ( ruleSequenceExpression ) );
    public final void rule__ExtentExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1993:1: ( ( ( rule__ExtentExpression__Group_0__0 ) ) | ( ruleSequenceExpression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==54) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_EXP_VALUE && LA9_0<=RULE_STRING_VALUE)||LA9_0==34||(LA9_0>=39 && LA9_0<=40)||(LA9_0>=43 && LA9_0<=44)||LA9_0==47||LA9_0==51) ) {
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
                    // InternalKerMLExpressions.g:1994:2: ( ( rule__ExtentExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1994:2: ( ( rule__ExtentExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1995:3: ( rule__ExtentExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtentExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:1996:3: ( rule__ExtentExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1996:4: rule__ExtentExpression__Group_0__0
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
                    // InternalKerMLExpressions.g:2000:2: ( ruleSequenceExpression )
                    {
                    // InternalKerMLExpressions.g:2000:2: ( ruleSequenceExpression )
                    // InternalKerMLExpressions.g:2001:3: ruleSequenceExpression
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
    // InternalKerMLExpressions.g:2010:1: rule__SequenceExpression__Alternatives_0 : ( ( ruleSequenceConstructionExpression ) | ( ruleBaseExpression ) );
    public final void rule__SequenceExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2014:1: ( ( ruleSequenceConstructionExpression ) | ( ruleBaseExpression ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_EXP_VALUE && LA10_0<=RULE_STRING_VALUE)||LA10_0==34||(LA10_0>=39 && LA10_0<=40)||(LA10_0>=43 && LA10_0<=44)||LA10_0==51) ) {
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
                    // InternalKerMLExpressions.g:2015:2: ( ruleSequenceConstructionExpression )
                    {
                    // InternalKerMLExpressions.g:2015:2: ( ruleSequenceConstructionExpression )
                    // InternalKerMLExpressions.g:2016:3: ruleSequenceConstructionExpression
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
                    // InternalKerMLExpressions.g:2021:2: ( ruleBaseExpression )
                    {
                    // InternalKerMLExpressions.g:2021:2: ( ruleBaseExpression )
                    // InternalKerMLExpressions.g:2022:3: ruleBaseExpression
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
    // InternalKerMLExpressions.g:2031:1: rule__SequenceExpression__Alternatives_1 : ( ( ( rule__SequenceExpression__Group_1_0__0 ) ) | ( ( rule__SequenceExpression__Group_1_1__0 ) ) );
    public final void rule__SequenceExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2035:1: ( ( ( rule__SequenceExpression__Group_1_0__0 ) ) | ( ( rule__SequenceExpression__Group_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==56) ) {
                alt11=1;
            }
            else if ( (LA11_0==46) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKerMLExpressions.g:2036:2: ( ( rule__SequenceExpression__Group_1_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2036:2: ( ( rule__SequenceExpression__Group_1_0__0 ) )
                    // InternalKerMLExpressions.g:2037:3: ( rule__SequenceExpression__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceExpressionAccess().getGroup_1_0()); 
                    }
                    // InternalKerMLExpressions.g:2038:3: ( rule__SequenceExpression__Group_1_0__0 )
                    // InternalKerMLExpressions.g:2038:4: rule__SequenceExpression__Group_1_0__0
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
                    // InternalKerMLExpressions.g:2042:2: ( ( rule__SequenceExpression__Group_1_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:2042:2: ( ( rule__SequenceExpression__Group_1_1__0 ) )
                    // InternalKerMLExpressions.g:2043:3: ( rule__SequenceExpression__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceExpressionAccess().getGroup_1_1()); 
                    }
                    // InternalKerMLExpressions.g:2044:3: ( rule__SequenceExpression__Group_1_1__0 )
                    // InternalKerMLExpressions.g:2044:4: rule__SequenceExpression__Group_1_1__0
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

            }
        }
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
    // InternalKerMLExpressions.g:2052:1: rule__BodyExpression__Alternatives : ( ( ( rule__BodyExpression__Group_0__0 ) ) | ( ( rule__BodyExpression__OwnedRelationship_compAssignment_1 ) ) );
    public final void rule__BodyExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2056:1: ( ( ( rule__BodyExpression__Group_0__0 ) ) | ( ( rule__BodyExpression__OwnedRelationship_compAssignment_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                case 45:
                case 46:
                case 48:
                case 49:
                case 52:
                case 53:
                case 56:
                case 57:
                    {
                    alt12=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA12_4 = input.LA(3);

                    if ( (synpred19_InternalKerMLExpressions()) ) {
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
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA12_5 = input.LA(3);

                    if ( (synpred19_InternalKerMLExpressions()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 44:
                    {
                    alt12=1;
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
                    int LA12_4 = input.LA(3);

                    if ( (synpred19_InternalKerMLExpressions()) ) {
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
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA12_5 = input.LA(3);

                    if ( (synpred19_InternalKerMLExpressions()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 44:
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
                case 45:
                case 46:
                case 48:
                case 49:
                case 52:
                case 53:
                case 56:
                case 57:
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
                    // InternalKerMLExpressions.g:2057:2: ( ( rule__BodyExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2057:2: ( ( rule__BodyExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:2058:3: ( rule__BodyExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:2059:3: ( rule__BodyExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:2059:4: rule__BodyExpression__Group_0__0
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
                    // InternalKerMLExpressions.g:2063:2: ( ( rule__BodyExpression__OwnedRelationship_compAssignment_1 ) )
                    {
                    // InternalKerMLExpressions.g:2063:2: ( ( rule__BodyExpression__OwnedRelationship_compAssignment_1 ) )
                    // InternalKerMLExpressions.g:2064:3: ( rule__BodyExpression__OwnedRelationship_compAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyExpressionAccess().getOwnedRelationship_compAssignment_1()); 
                    }
                    // InternalKerMLExpressions.g:2065:3: ( rule__BodyExpression__OwnedRelationship_compAssignment_1 )
                    // InternalKerMLExpressions.g:2065:4: rule__BodyExpression__OwnedRelationship_compAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BodyExpression__OwnedRelationship_compAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyExpressionAccess().getOwnedRelationship_compAssignment_1()); 
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
    // InternalKerMLExpressions.g:2073:1: rule__SequenceConstructionExpression__Alternatives : ( ( ( rule__SequenceConstructionExpression__Group_0__0 ) ) | ( ( rule__SequenceConstructionExpression__Group_1__0 ) ) );
    public final void rule__SequenceConstructionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2077:1: ( ( ( rule__SequenceConstructionExpression__Group_0__0 ) ) | ( ( rule__SequenceConstructionExpression__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==48) ) {
                    alt13=1;
                }
                else if ( ((LA13_1>=RULE_EXP_VALUE && LA13_1<=RULE_STRING_VALUE)||(LA13_1>=24 && LA13_1<=27)||(LA13_1>=32 && LA13_1<=34)||(LA13_1>=37 && LA13_1<=40)||(LA13_1>=43 && LA13_1<=44)||LA13_1==47||LA13_1==51||LA13_1==54) ) {
                    alt13=2;
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
                    // InternalKerMLExpressions.g:2078:2: ( ( rule__SequenceConstructionExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2078:2: ( ( rule__SequenceConstructionExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:2079:3: ( rule__SequenceConstructionExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:2080:3: ( rule__SequenceConstructionExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:2080:4: rule__SequenceConstructionExpression__Group_0__0
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
                    // InternalKerMLExpressions.g:2084:2: ( ( rule__SequenceConstructionExpression__Group_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:2084:2: ( ( rule__SequenceConstructionExpression__Group_1__0 ) )
                    // InternalKerMLExpressions.g:2085:3: ( rule__SequenceConstructionExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1()); 
                    }
                    // InternalKerMLExpressions.g:2086:3: ( rule__SequenceConstructionExpression__Group_1__0 )
                    // InternalKerMLExpressions.g:2086:4: rule__SequenceConstructionExpression__Group_1__0
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
    // InternalKerMLExpressions.g:2094:1: rule__SequenceConstructionExpression__Alternatives_1_2 : ( ( ( rule__SequenceConstructionExpression__Group_1_2_0__0 ) ) | ( ( rule__SequenceConstructionExpression__Group_1_2_1__0 ) ) );
    public final void rule__SequenceConstructionExpression__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2098:1: ( ( ( rule__SequenceConstructionExpression__Group_1_2_0__0 ) ) | ( ( rule__SequenceConstructionExpression__Group_1_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            else if ( (LA14_0==57) ) {
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
                    // InternalKerMLExpressions.g:2099:2: ( ( rule__SequenceConstructionExpression__Group_1_2_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2099:2: ( ( rule__SequenceConstructionExpression__Group_1_2_0__0 ) )
                    // InternalKerMLExpressions.g:2100:3: ( rule__SequenceConstructionExpression__Group_1_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1_2_0()); 
                    }
                    // InternalKerMLExpressions.g:2101:3: ( rule__SequenceConstructionExpression__Group_1_2_0__0 )
                    // InternalKerMLExpressions.g:2101:4: rule__SequenceConstructionExpression__Group_1_2_0__0
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
                    // InternalKerMLExpressions.g:2105:2: ( ( rule__SequenceConstructionExpression__Group_1_2_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:2105:2: ( ( rule__SequenceConstructionExpression__Group_1_2_1__0 ) )
                    // InternalKerMLExpressions.g:2106:3: ( rule__SequenceConstructionExpression__Group_1_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_1_2_1()); 
                    }
                    // InternalKerMLExpressions.g:2107:3: ( rule__SequenceConstructionExpression__Group_1_2_1__0 )
                    // InternalKerMLExpressions.g:2107:4: rule__SequenceConstructionExpression__Group_1_2_1__0
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
    // InternalKerMLExpressions.g:2115:1: rule__BaseExpression__Alternatives : ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ruleExtentExpression_Deprecated ) | ( ( rule__BaseExpression__Group_5__0 ) ) );
    public final void rule__BaseExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2119:1: ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ruleExtentExpression_Deprecated ) | ( ( rule__BaseExpression__Group_5__0 ) ) )
            int alt15=6;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalKerMLExpressions.g:2120:2: ( ruleNullExpression )
                    {
                    // InternalKerMLExpressions.g:2120:2: ( ruleNullExpression )
                    // InternalKerMLExpressions.g:2121:3: ruleNullExpression
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
                    // InternalKerMLExpressions.g:2126:2: ( ruleLiteralExpression )
                    {
                    // InternalKerMLExpressions.g:2126:2: ( ruleLiteralExpression )
                    // InternalKerMLExpressions.g:2127:3: ruleLiteralExpression
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
                    // InternalKerMLExpressions.g:2132:2: ( ruleFeatureReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:2132:2: ( ruleFeatureReferenceExpression )
                    // InternalKerMLExpressions.g:2133:3: ruleFeatureReferenceExpression
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
                    // InternalKerMLExpressions.g:2138:2: ( ruleInvocationExpression )
                    {
                    // InternalKerMLExpressions.g:2138:2: ( ruleInvocationExpression )
                    // InternalKerMLExpressions.g:2139:3: ruleInvocationExpression
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
                    // InternalKerMLExpressions.g:2144:2: ( ruleExtentExpression_Deprecated )
                    {
                    // InternalKerMLExpressions.g:2144:2: ( ruleExtentExpression_Deprecated )
                    // InternalKerMLExpressions.g:2145:3: ruleExtentExpression_Deprecated
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getExtentExpression_DeprecatedParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExtentExpression_Deprecated();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getExtentExpression_DeprecatedParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKerMLExpressions.g:2150:2: ( ( rule__BaseExpression__Group_5__0 ) )
                    {
                    // InternalKerMLExpressions.g:2150:2: ( ( rule__BaseExpression__Group_5__0 ) )
                    // InternalKerMLExpressions.g:2151:3: ( rule__BaseExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getGroup_5()); 
                    }
                    // InternalKerMLExpressions.g:2152:3: ( rule__BaseExpression__Group_5__0 )
                    // InternalKerMLExpressions.g:2152:4: rule__BaseExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getGroup_5()); 
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
    // InternalKerMLExpressions.g:2160:1: rule__ArgumentList__Alternatives : ( ( rulePositionalArgumentList ) | ( ruleNamedArgumentList ) );
    public final void rule__ArgumentList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2164:1: ( ( rulePositionalArgumentList ) | ( ruleNamedArgumentList ) )
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
            case 43:
            case 44:
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

                if ( (LA16_2==EOF||(LA16_2>=14 && LA16_2<=36)||(LA16_2>=43 && LA16_2<=46)||LA16_2==49||(LA16_2>=52 && LA16_2<=53)||LA16_2==56) ) {
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

                if ( (LA16_3==EOF||(LA16_3>=14 && LA16_3<=36)||(LA16_3>=43 && LA16_3<=46)||LA16_3==49||(LA16_3>=52 && LA16_3<=53)||LA16_3==56) ) {
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
                    // InternalKerMLExpressions.g:2165:2: ( rulePositionalArgumentList )
                    {
                    // InternalKerMLExpressions.g:2165:2: ( rulePositionalArgumentList )
                    // InternalKerMLExpressions.g:2166:3: rulePositionalArgumentList
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
                    // InternalKerMLExpressions.g:2171:2: ( ruleNamedArgumentList )
                    {
                    // InternalKerMLExpressions.g:2171:2: ( ruleNamedArgumentList )
                    // InternalKerMLExpressions.g:2172:3: ruleNamedArgumentList
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
    // InternalKerMLExpressions.g:2181:1: rule__LiteralExpression__Alternatives : ( ( ruleLiteralBoolean ) | ( ruleLiteralString ) | ( ruleLiteralInteger ) | ( ruleLiteralReal ) | ( ruleLiteralUnbounded ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2185:1: ( ( ruleLiteralBoolean ) | ( ruleLiteralString ) | ( ruleLiteralInteger ) | ( ruleLiteralReal ) | ( ruleLiteralUnbounded ) )
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

                if ( (LA17_3==43) ) {
                    alt17=4;
                }
                else if ( (LA17_3==EOF||(LA17_3>=14 && LA17_3<=36)||(LA17_3>=41 && LA17_3<=42)||(LA17_3>=45 && LA17_3<=46)||(LA17_3>=48 && LA17_3<=49)||LA17_3==53||(LA17_3>=56 && LA17_3<=57)) ) {
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
            case 43:
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
                    // InternalKerMLExpressions.g:2186:2: ( ruleLiteralBoolean )
                    {
                    // InternalKerMLExpressions.g:2186:2: ( ruleLiteralBoolean )
                    // InternalKerMLExpressions.g:2187:3: ruleLiteralBoolean
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
                    // InternalKerMLExpressions.g:2192:2: ( ruleLiteralString )
                    {
                    // InternalKerMLExpressions.g:2192:2: ( ruleLiteralString )
                    // InternalKerMLExpressions.g:2193:3: ruleLiteralString
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
                    // InternalKerMLExpressions.g:2198:2: ( ruleLiteralInteger )
                    {
                    // InternalKerMLExpressions.g:2198:2: ( ruleLiteralInteger )
                    // InternalKerMLExpressions.g:2199:3: ruleLiteralInteger
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
                    // InternalKerMLExpressions.g:2204:2: ( ruleLiteralReal )
                    {
                    // InternalKerMLExpressions.g:2204:2: ( ruleLiteralReal )
                    // InternalKerMLExpressions.g:2205:3: ruleLiteralReal
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
                    // InternalKerMLExpressions.g:2210:2: ( ruleLiteralUnbounded )
                    {
                    // InternalKerMLExpressions.g:2210:2: ( ruleLiteralUnbounded )
                    // InternalKerMLExpressions.g:2211:3: ruleLiteralUnbounded
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
    // InternalKerMLExpressions.g:2220:1: rule__BooleanValue__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2224:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalKerMLExpressions.g:2225:2: ( 'true' )
                    {
                    // InternalKerMLExpressions.g:2225:2: ( 'true' )
                    // InternalKerMLExpressions.g:2226:3: 'true'
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
                    // InternalKerMLExpressions.g:2231:2: ( 'false' )
                    {
                    // InternalKerMLExpressions.g:2231:2: ( 'false' )
                    // InternalKerMLExpressions.g:2232:3: 'false'
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
    // InternalKerMLExpressions.g:2241:1: rule__RealValue__Alternatives : ( ( ( rule__RealValue__Group_0__0 ) ) | ( RULE_EXP_VALUE ) );
    public final void rule__RealValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2245:1: ( ( ( rule__RealValue__Group_0__0 ) ) | ( RULE_EXP_VALUE ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DECIMAL_VALUE||LA19_0==43) ) {
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
                    // InternalKerMLExpressions.g:2246:2: ( ( rule__RealValue__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2246:2: ( ( rule__RealValue__Group_0__0 ) )
                    // InternalKerMLExpressions.g:2247:3: ( rule__RealValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealValueAccess().getGroup_0()); 
                    }
                    // InternalKerMLExpressions.g:2248:3: ( rule__RealValue__Group_0__0 )
                    // InternalKerMLExpressions.g:2248:4: rule__RealValue__Group_0__0
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
                    // InternalKerMLExpressions.g:2252:2: ( RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:2252:2: ( RULE_EXP_VALUE )
                    // InternalKerMLExpressions.g:2253:3: RULE_EXP_VALUE
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
    // InternalKerMLExpressions.g:2262:1: rule__RealValue__Alternatives_0_2 : ( ( RULE_DECIMAL_VALUE ) | ( RULE_EXP_VALUE ) );
    public final void rule__RealValue__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2266:1: ( ( RULE_DECIMAL_VALUE ) | ( RULE_EXP_VALUE ) )
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
                    // InternalKerMLExpressions.g:2267:2: ( RULE_DECIMAL_VALUE )
                    {
                    // InternalKerMLExpressions.g:2267:2: ( RULE_DECIMAL_VALUE )
                    // InternalKerMLExpressions.g:2268:3: RULE_DECIMAL_VALUE
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
                    // InternalKerMLExpressions.g:2273:2: ( RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:2273:2: ( RULE_EXP_VALUE )
                    // InternalKerMLExpressions.g:2274:3: RULE_EXP_VALUE
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
    // InternalKerMLExpressions.g:2283:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2287:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
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
                    // InternalKerMLExpressions.g:2288:2: ( RULE_ID )
                    {
                    // InternalKerMLExpressions.g:2288:2: ( RULE_ID )
                    // InternalKerMLExpressions.g:2289:3: RULE_ID
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
                    // InternalKerMLExpressions.g:2294:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalKerMLExpressions.g:2294:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalKerMLExpressions.g:2295:3: RULE_UNRESTRICTED_NAME
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


    // $ANTLR start "rule__QualifiedName__Alternatives"
    // InternalKerMLExpressions.g:2304:1: rule__QualifiedName__Alternatives : ( ( ruleName ) | ( ruleColonQualifiedName ) | ( ruleDotQualifiedName ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2308:1: ( ( ruleName ) | ( ruleColonQualifiedName ) | ( ruleDotQualifiedName ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    int LA22_3 = input.LA(3);

                    if ( ((LA22_3>=RULE_ID && LA22_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt22=3;
                    }
                    else if ( (LA22_3==55) ) {
                        alt22=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                    {
                    alt22=2;
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
                case 41:
                case 42:
                case 44:
                case 45:
                case 46:
                case 48:
                case 49:
                case 53:
                case 56:
                case 57:
                    {
                    alt22=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA22_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
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
                case 41:
                case 42:
                case 44:
                case 45:
                case 46:
                case 48:
                case 49:
                case 53:
                case 56:
                case 57:
                    {
                    alt22=1;
                    }
                    break;
                case 43:
                    {
                    int LA22_3 = input.LA(3);

                    if ( ((LA22_3>=RULE_ID && LA22_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt22=3;
                    }
                    else if ( (LA22_3==55) ) {
                        alt22=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                    {
                    alt22=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalKerMLExpressions.g:2309:2: ( ruleName )
                    {
                    // InternalKerMLExpressions.g:2309:2: ( ruleName )
                    // InternalKerMLExpressions.g:2310:3: ruleName
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
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2315:2: ( ruleColonQualifiedName )
                    {
                    // InternalKerMLExpressions.g:2315:2: ( ruleColonQualifiedName )
                    // InternalKerMLExpressions.g:2316:3: ruleColonQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifiedNameAccess().getColonQualifiedNameParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleColonQualifiedName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifiedNameAccess().getColonQualifiedNameParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2321:2: ( ruleDotQualifiedName )
                    {
                    // InternalKerMLExpressions.g:2321:2: ( ruleDotQualifiedName )
                    // InternalKerMLExpressions.g:2322:3: ruleDotQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQualifiedNameAccess().getDotQualifiedNameParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDotQualifiedName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQualifiedNameAccess().getDotQualifiedNameParserRuleCall_2()); 
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
    // $ANTLR end "rule__QualifiedName__Alternatives"


    // $ANTLR start "rule__ConditionalExpression__Group__0"
    // InternalKerMLExpressions.g:2331:1: rule__ConditionalExpression__Group__0 : rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 ;
    public final void rule__ConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2335:1: ( rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 )
            // InternalKerMLExpressions.g:2336:2: rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1
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
    // InternalKerMLExpressions.g:2343:1: rule__ConditionalExpression__Group__0__Impl : ( ruleNullCoalescingExpression ) ;
    public final void rule__ConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2347:1: ( ( ruleNullCoalescingExpression ) )
            // InternalKerMLExpressions.g:2348:1: ( ruleNullCoalescingExpression )
            {
            // InternalKerMLExpressions.g:2348:1: ( ruleNullCoalescingExpression )
            // InternalKerMLExpressions.g:2349:2: ruleNullCoalescingExpression
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
    // InternalKerMLExpressions.g:2358:1: rule__ConditionalExpression__Group__1 : rule__ConditionalExpression__Group__1__Impl ;
    public final void rule__ConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2362:1: ( rule__ConditionalExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2363:2: rule__ConditionalExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:2369:1: rule__ConditionalExpression__Group__1__Impl : ( ( rule__ConditionalExpression__Group_1__0 )? ) ;
    public final void rule__ConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2373:1: ( ( ( rule__ConditionalExpression__Group_1__0 )? ) )
            // InternalKerMLExpressions.g:2374:1: ( ( rule__ConditionalExpression__Group_1__0 )? )
            {
            // InternalKerMLExpressions.g:2374:1: ( ( rule__ConditionalExpression__Group_1__0 )? )
            // InternalKerMLExpressions.g:2375:2: ( rule__ConditionalExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2376:2: ( rule__ConditionalExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKerMLExpressions.g:2376:3: rule__ConditionalExpression__Group_1__0
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
    // InternalKerMLExpressions.g:2385:1: rule__ConditionalExpression__Group_1__0 : rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 ;
    public final void rule__ConditionalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2389:1: ( rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2390:2: rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1
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
    // InternalKerMLExpressions.g:2397:1: rule__ConditionalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2401:1: ( ( () ) )
            // InternalKerMLExpressions.g:2402:1: ( () )
            {
            // InternalKerMLExpressions.g:2402:1: ( () )
            // InternalKerMLExpressions.g:2403:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2404:2: ()
            // InternalKerMLExpressions.g:2404:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:2412:1: rule__ConditionalExpression__Group_1__1 : rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 ;
    public final void rule__ConditionalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2416:1: ( rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2417:2: rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2
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
    // InternalKerMLExpressions.g:2424:1: rule__ConditionalExpression__Group_1__1__Impl : ( ( rule__ConditionalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ConditionalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2428:1: ( ( ( rule__ConditionalExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2429:1: ( ( rule__ConditionalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2429:1: ( ( rule__ConditionalExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2430:2: ( rule__ConditionalExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2431:2: ( rule__ConditionalExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2431:3: rule__ConditionalExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:2439:1: rule__ConditionalExpression__Group_1__2 : rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 ;
    public final void rule__ConditionalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2443:1: ( rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 )
            // InternalKerMLExpressions.g:2444:2: rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3
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
    // InternalKerMLExpressions.g:2451:1: rule__ConditionalExpression__Group_1__2__Impl : ( ( rule__ConditionalExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__ConditionalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2455:1: ( ( ( rule__ConditionalExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2456:1: ( ( rule__ConditionalExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2456:1: ( ( rule__ConditionalExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2457:2: ( rule__ConditionalExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2458:2: ( rule__ConditionalExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:2458:3: rule__ConditionalExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:2466:1: rule__ConditionalExpression__Group_1__3 : rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4 ;
    public final void rule__ConditionalExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2470:1: ( rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4 )
            // InternalKerMLExpressions.g:2471:2: rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4
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
    // InternalKerMLExpressions.g:2478:1: rule__ConditionalExpression__Group_1__3__Impl : ( ':' ) ;
    public final void rule__ConditionalExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2482:1: ( ( ':' ) )
            // InternalKerMLExpressions.g:2483:1: ( ':' )
            {
            // InternalKerMLExpressions.g:2483:1: ( ':' )
            // InternalKerMLExpressions.g:2484:2: ':'
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
    // InternalKerMLExpressions.g:2493:1: rule__ConditionalExpression__Group_1__4 : rule__ConditionalExpression__Group_1__4__Impl ;
    public final void rule__ConditionalExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2497:1: ( rule__ConditionalExpression__Group_1__4__Impl )
            // InternalKerMLExpressions.g:2498:2: rule__ConditionalExpression__Group_1__4__Impl
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
    // InternalKerMLExpressions.g:2504:1: rule__ConditionalExpression__Group_1__4__Impl : ( ( rule__ConditionalExpression__Operand_compAssignment_1_4 ) ) ;
    public final void rule__ConditionalExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2508:1: ( ( ( rule__ConditionalExpression__Operand_compAssignment_1_4 ) ) )
            // InternalKerMLExpressions.g:2509:1: ( ( rule__ConditionalExpression__Operand_compAssignment_1_4 ) )
            {
            // InternalKerMLExpressions.g:2509:1: ( ( rule__ConditionalExpression__Operand_compAssignment_1_4 ) )
            // InternalKerMLExpressions.g:2510:2: ( rule__ConditionalExpression__Operand_compAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperand_compAssignment_1_4()); 
            }
            // InternalKerMLExpressions.g:2511:2: ( rule__ConditionalExpression__Operand_compAssignment_1_4 )
            // InternalKerMLExpressions.g:2511:3: rule__ConditionalExpression__Operand_compAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Operand_compAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperand_compAssignment_1_4()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:2520:1: rule__NullCoalescingExpression__Group__0 : rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1 ;
    public final void rule__NullCoalescingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2524:1: ( rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1 )
            // InternalKerMLExpressions.g:2525:2: rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1
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
    // InternalKerMLExpressions.g:2532:1: rule__NullCoalescingExpression__Group__0__Impl : ( ruleConditionalOrExpression ) ;
    public final void rule__NullCoalescingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2536:1: ( ( ruleConditionalOrExpression ) )
            // InternalKerMLExpressions.g:2537:1: ( ruleConditionalOrExpression )
            {
            // InternalKerMLExpressions.g:2537:1: ( ruleConditionalOrExpression )
            // InternalKerMLExpressions.g:2538:2: ruleConditionalOrExpression
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
    // InternalKerMLExpressions.g:2547:1: rule__NullCoalescingExpression__Group__1 : rule__NullCoalescingExpression__Group__1__Impl ;
    public final void rule__NullCoalescingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2551:1: ( rule__NullCoalescingExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2552:2: rule__NullCoalescingExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:2558:1: rule__NullCoalescingExpression__Group__1__Impl : ( ( rule__NullCoalescingExpression__Group_1__0 )* ) ;
    public final void rule__NullCoalescingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2562:1: ( ( ( rule__NullCoalescingExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2563:1: ( ( rule__NullCoalescingExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2563:1: ( ( rule__NullCoalescingExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2564:2: ( rule__NullCoalescingExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2565:2: ( rule__NullCoalescingExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2565:3: rule__NullCoalescingExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NullCoalescingExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKerMLExpressions.g:2574:1: rule__NullCoalescingExpression__Group_1__0 : rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1 ;
    public final void rule__NullCoalescingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2578:1: ( rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2579:2: rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1
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
    // InternalKerMLExpressions.g:2586:1: rule__NullCoalescingExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NullCoalescingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2590:1: ( ( () ) )
            // InternalKerMLExpressions.g:2591:1: ( () )
            {
            // InternalKerMLExpressions.g:2591:1: ( () )
            // InternalKerMLExpressions.g:2592:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2593:2: ()
            // InternalKerMLExpressions.g:2593:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:2601:1: rule__NullCoalescingExpression__Group_1__1 : rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2 ;
    public final void rule__NullCoalescingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2605:1: ( rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2606:2: rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2
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
    // InternalKerMLExpressions.g:2613:1: rule__NullCoalescingExpression__Group_1__1__Impl : ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NullCoalescingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2617:1: ( ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2618:1: ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2618:1: ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2619:2: ( rule__NullCoalescingExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2620:2: ( rule__NullCoalescingExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2620:3: rule__NullCoalescingExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:2628:1: rule__NullCoalescingExpression__Group_1__2 : rule__NullCoalescingExpression__Group_1__2__Impl ;
    public final void rule__NullCoalescingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2632:1: ( rule__NullCoalescingExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:2633:2: rule__NullCoalescingExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:2639:1: rule__NullCoalescingExpression__Group_1__2__Impl : ( ( rule__NullCoalescingExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__NullCoalescingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2643:1: ( ( ( rule__NullCoalescingExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2644:1: ( ( rule__NullCoalescingExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2644:1: ( ( rule__NullCoalescingExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2645:2: ( rule__NullCoalescingExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2646:2: ( rule__NullCoalescingExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:2646:3: rule__NullCoalescingExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:2655:1: rule__ConditionalOrExpression__Group__0 : rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1 ;
    public final void rule__ConditionalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2659:1: ( rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1 )
            // InternalKerMLExpressions.g:2660:2: rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1
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
    // InternalKerMLExpressions.g:2667:1: rule__ConditionalOrExpression__Group__0__Impl : ( ruleConditionalAndExpression ) ;
    public final void rule__ConditionalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2671:1: ( ( ruleConditionalAndExpression ) )
            // InternalKerMLExpressions.g:2672:1: ( ruleConditionalAndExpression )
            {
            // InternalKerMLExpressions.g:2672:1: ( ruleConditionalAndExpression )
            // InternalKerMLExpressions.g:2673:2: ruleConditionalAndExpression
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
    // InternalKerMLExpressions.g:2682:1: rule__ConditionalOrExpression__Group__1 : rule__ConditionalOrExpression__Group__1__Impl ;
    public final void rule__ConditionalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2686:1: ( rule__ConditionalOrExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2687:2: rule__ConditionalOrExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:2693:1: rule__ConditionalOrExpression__Group__1__Impl : ( ( rule__ConditionalOrExpression__Group_1__0 )* ) ;
    public final void rule__ConditionalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2697:1: ( ( ( rule__ConditionalOrExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2698:1: ( ( rule__ConditionalOrExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2698:1: ( ( rule__ConditionalOrExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2699:2: ( rule__ConditionalOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2700:2: ( rule__ConditionalOrExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2700:3: rule__ConditionalOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ConditionalOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalKerMLExpressions.g:2709:1: rule__ConditionalOrExpression__Group_1__0 : rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1 ;
    public final void rule__ConditionalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2713:1: ( rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2714:2: rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1
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
    // InternalKerMLExpressions.g:2721:1: rule__ConditionalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2725:1: ( ( () ) )
            // InternalKerMLExpressions.g:2726:1: ( () )
            {
            // InternalKerMLExpressions.g:2726:1: ( () )
            // InternalKerMLExpressions.g:2727:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2728:2: ()
            // InternalKerMLExpressions.g:2728:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:2736:1: rule__ConditionalOrExpression__Group_1__1 : rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2 ;
    public final void rule__ConditionalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2740:1: ( rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2741:2: rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2
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
    // InternalKerMLExpressions.g:2748:1: rule__ConditionalOrExpression__Group_1__1__Impl : ( ( rule__ConditionalOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ConditionalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2752:1: ( ( ( rule__ConditionalOrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2753:1: ( ( rule__ConditionalOrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2753:1: ( ( rule__ConditionalOrExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2754:2: ( rule__ConditionalOrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2755:2: ( rule__ConditionalOrExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2755:3: rule__ConditionalOrExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:2763:1: rule__ConditionalOrExpression__Group_1__2 : rule__ConditionalOrExpression__Group_1__2__Impl ;
    public final void rule__ConditionalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2767:1: ( rule__ConditionalOrExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:2768:2: rule__ConditionalOrExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:2774:1: rule__ConditionalOrExpression__Group_1__2__Impl : ( ( rule__ConditionalOrExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__ConditionalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2778:1: ( ( ( rule__ConditionalOrExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2779:1: ( ( rule__ConditionalOrExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2779:1: ( ( rule__ConditionalOrExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2780:2: ( rule__ConditionalOrExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2781:2: ( rule__ConditionalOrExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:2781:3: rule__ConditionalOrExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOrExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:2790:1: rule__ConditionalAndExpression__Group__0 : rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1 ;
    public final void rule__ConditionalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2794:1: ( rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1 )
            // InternalKerMLExpressions.g:2795:2: rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1
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
    // InternalKerMLExpressions.g:2802:1: rule__ConditionalAndExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__ConditionalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2806:1: ( ( ruleOrExpression ) )
            // InternalKerMLExpressions.g:2807:1: ( ruleOrExpression )
            {
            // InternalKerMLExpressions.g:2807:1: ( ruleOrExpression )
            // InternalKerMLExpressions.g:2808:2: ruleOrExpression
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
    // InternalKerMLExpressions.g:2817:1: rule__ConditionalAndExpression__Group__1 : rule__ConditionalAndExpression__Group__1__Impl ;
    public final void rule__ConditionalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2821:1: ( rule__ConditionalAndExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2822:2: rule__ConditionalAndExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:2828:1: rule__ConditionalAndExpression__Group__1__Impl : ( ( rule__ConditionalAndExpression__Group_1__0 )* ) ;
    public final void rule__ConditionalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2832:1: ( ( ( rule__ConditionalAndExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2833:1: ( ( rule__ConditionalAndExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2833:1: ( ( rule__ConditionalAndExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2834:2: ( rule__ConditionalAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2835:2: ( rule__ConditionalAndExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2835:3: rule__ConditionalAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConditionalAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalKerMLExpressions.g:2844:1: rule__ConditionalAndExpression__Group_1__0 : rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1 ;
    public final void rule__ConditionalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2848:1: ( rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2849:2: rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1
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
    // InternalKerMLExpressions.g:2856:1: rule__ConditionalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2860:1: ( ( () ) )
            // InternalKerMLExpressions.g:2861:1: ( () )
            {
            // InternalKerMLExpressions.g:2861:1: ( () )
            // InternalKerMLExpressions.g:2862:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2863:2: ()
            // InternalKerMLExpressions.g:2863:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:2871:1: rule__ConditionalAndExpression__Group_1__1 : rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2 ;
    public final void rule__ConditionalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2875:1: ( rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2876:2: rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2
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
    // InternalKerMLExpressions.g:2883:1: rule__ConditionalAndExpression__Group_1__1__Impl : ( ( rule__ConditionalAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ConditionalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2887:1: ( ( ( rule__ConditionalAndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2888:1: ( ( rule__ConditionalAndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2888:1: ( ( rule__ConditionalAndExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2889:2: ( rule__ConditionalAndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:2890:2: ( rule__ConditionalAndExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2890:3: rule__ConditionalAndExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:2898:1: rule__ConditionalAndExpression__Group_1__2 : rule__ConditionalAndExpression__Group_1__2__Impl ;
    public final void rule__ConditionalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2902:1: ( rule__ConditionalAndExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:2903:2: rule__ConditionalAndExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:2909:1: rule__ConditionalAndExpression__Group_1__2__Impl : ( ( rule__ConditionalAndExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__ConditionalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2913:1: ( ( ( rule__ConditionalAndExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2914:1: ( ( rule__ConditionalAndExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2914:1: ( ( rule__ConditionalAndExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2915:2: ( rule__ConditionalAndExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:2916:2: ( rule__ConditionalAndExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:2916:3: rule__ConditionalAndExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAndExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:2925:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2929:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalKerMLExpressions.g:2930:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalKerMLExpressions.g:2937:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2941:1: ( ( ruleXorExpression ) )
            // InternalKerMLExpressions.g:2942:1: ( ruleXorExpression )
            {
            // InternalKerMLExpressions.g:2942:1: ( ruleXorExpression )
            // InternalKerMLExpressions.g:2943:2: ruleXorExpression
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
    // InternalKerMLExpressions.g:2952:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2956:1: ( rule__OrExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2957:2: rule__OrExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:2963:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2967:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2968:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2968:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2969:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:2970:2: ( rule__OrExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2970:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalKerMLExpressions.g:2979:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2983:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2984:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalKerMLExpressions.g:2991:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2995:1: ( ( () ) )
            // InternalKerMLExpressions.g:2996:1: ( () )
            {
            // InternalKerMLExpressions.g:2996:1: ( () )
            // InternalKerMLExpressions.g:2997:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:2998:2: ()
            // InternalKerMLExpressions.g:2998:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:3006:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3010:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3011:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
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
    // InternalKerMLExpressions.g:3018:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3022:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3023:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3023:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3024:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3025:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3025:3: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:3033:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3037:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3038:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:3044:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3048:1: ( ( ( rule__OrExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3049:1: ( ( rule__OrExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3049:1: ( ( rule__OrExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3050:2: ( rule__OrExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3051:2: ( rule__OrExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:3051:3: rule__OrExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3060:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3064:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalKerMLExpressions.g:3065:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
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
    // InternalKerMLExpressions.g:3072:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3076:1: ( ( ruleAndExpression ) )
            // InternalKerMLExpressions.g:3077:1: ( ruleAndExpression )
            {
            // InternalKerMLExpressions.g:3077:1: ( ruleAndExpression )
            // InternalKerMLExpressions.g:3078:2: ruleAndExpression
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
    // InternalKerMLExpressions.g:3087:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3091:1: ( rule__XorExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3092:2: rule__XorExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:3098:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3102:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3103:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3103:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3104:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3105:2: ( rule__XorExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3105:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalKerMLExpressions.g:3114:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3118:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3119:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
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
    // InternalKerMLExpressions.g:3126:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3130:1: ( ( () ) )
            // InternalKerMLExpressions.g:3131:1: ( () )
            {
            // InternalKerMLExpressions.g:3131:1: ( () )
            // InternalKerMLExpressions.g:3132:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3133:2: ()
            // InternalKerMLExpressions.g:3133:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:3141:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3145:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3146:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
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
    // InternalKerMLExpressions.g:3153:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3157:1: ( ( ( rule__XorExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3158:1: ( ( rule__XorExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3158:1: ( ( rule__XorExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3159:2: ( rule__XorExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3160:2: ( rule__XorExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3160:3: rule__XorExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:3168:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3172:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3173:2: rule__XorExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:3179:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3183:1: ( ( ( rule__XorExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3184:1: ( ( rule__XorExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3184:1: ( ( rule__XorExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3185:2: ( rule__XorExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3186:2: ( rule__XorExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:3186:3: rule__XorExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3195:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3199:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalKerMLExpressions.g:3200:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalKerMLExpressions.g:3207:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3211:1: ( ( ruleEqualityExpression ) )
            // InternalKerMLExpressions.g:3212:1: ( ruleEqualityExpression )
            {
            // InternalKerMLExpressions.g:3212:1: ( ruleEqualityExpression )
            // InternalKerMLExpressions.g:3213:2: ruleEqualityExpression
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
    // InternalKerMLExpressions.g:3222:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3226:1: ( rule__AndExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3227:2: rule__AndExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:3233:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3237:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3238:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3238:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3239:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3240:2: ( rule__AndExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3240:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalKerMLExpressions.g:3249:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3253:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3254:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalKerMLExpressions.g:3261:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3265:1: ( ( () ) )
            // InternalKerMLExpressions.g:3266:1: ( () )
            {
            // InternalKerMLExpressions.g:3266:1: ( () )
            // InternalKerMLExpressions.g:3267:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3268:2: ()
            // InternalKerMLExpressions.g:3268:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:3276:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3280:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3281:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
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
    // InternalKerMLExpressions.g:3288:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3292:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3293:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3293:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3294:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3295:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3295:3: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:3303:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3307:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3308:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:3314:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3318:1: ( ( ( rule__AndExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3319:1: ( ( rule__AndExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3319:1: ( ( rule__AndExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3320:2: ( rule__AndExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3321:2: ( rule__AndExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:3321:3: rule__AndExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3330:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3334:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalKerMLExpressions.g:3335:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
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
    // InternalKerMLExpressions.g:3342:1: rule__EqualityExpression__Group__0__Impl : ( ruleClassificationExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3346:1: ( ( ruleClassificationExpression ) )
            // InternalKerMLExpressions.g:3347:1: ( ruleClassificationExpression )
            {
            // InternalKerMLExpressions.g:3347:1: ( ruleClassificationExpression )
            // InternalKerMLExpressions.g:3348:2: ruleClassificationExpression
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
    // InternalKerMLExpressions.g:3357:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3361:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3362:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:3368:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3372:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3373:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3373:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3374:2: ( rule__EqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3375:2: ( rule__EqualityExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=22 && LA30_0<=23)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3375:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalKerMLExpressions.g:3384:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3388:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3389:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
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
    // InternalKerMLExpressions.g:3396:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3400:1: ( ( () ) )
            // InternalKerMLExpressions.g:3401:1: ( () )
            {
            // InternalKerMLExpressions.g:3401:1: ( () )
            // InternalKerMLExpressions.g:3402:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3403:2: ()
            // InternalKerMLExpressions.g:3403:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:3411:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3415:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3416:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
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
    // InternalKerMLExpressions.g:3423:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3427:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3428:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3428:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3429:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3430:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3430:3: rule__EqualityExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:3438:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3442:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3443:2: rule__EqualityExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:3449:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3453:1: ( ( ( rule__EqualityExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3454:1: ( ( rule__EqualityExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3454:1: ( ( rule__EqualityExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3455:2: ( rule__EqualityExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3456:2: ( rule__EqualityExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:3456:3: rule__EqualityExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3465:1: rule__ClassificationExpression__Group_0__0 : rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1 ;
    public final void rule__ClassificationExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3469:1: ( rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1 )
            // InternalKerMLExpressions.g:3470:2: rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1
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
    // InternalKerMLExpressions.g:3477:1: rule__ClassificationExpression__Group_0__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__ClassificationExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3481:1: ( ( ruleRelationalExpression ) )
            // InternalKerMLExpressions.g:3482:1: ( ruleRelationalExpression )
            {
            // InternalKerMLExpressions.g:3482:1: ( ruleRelationalExpression )
            // InternalKerMLExpressions.g:3483:2: ruleRelationalExpression
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
    // InternalKerMLExpressions.g:3492:1: rule__ClassificationExpression__Group_0__1 : rule__ClassificationExpression__Group_0__1__Impl ;
    public final void rule__ClassificationExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3496:1: ( rule__ClassificationExpression__Group_0__1__Impl )
            // InternalKerMLExpressions.g:3497:2: rule__ClassificationExpression__Group_0__1__Impl
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
    // InternalKerMLExpressions.g:3503:1: rule__ClassificationExpression__Group_0__1__Impl : ( ( rule__ClassificationExpression__Group_0_1__0 )? ) ;
    public final void rule__ClassificationExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3507:1: ( ( ( rule__ClassificationExpression__Group_0_1__0 )? ) )
            // InternalKerMLExpressions.g:3508:1: ( ( rule__ClassificationExpression__Group_0_1__0 )? )
            {
            // InternalKerMLExpressions.g:3508:1: ( ( rule__ClassificationExpression__Group_0_1__0 )? )
            // InternalKerMLExpressions.g:3509:2: ( rule__ClassificationExpression__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getGroup_0_1()); 
            }
            // InternalKerMLExpressions.g:3510:2: ( rule__ClassificationExpression__Group_0_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=24 && LA31_0<=27)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKerMLExpressions.g:3510:3: rule__ClassificationExpression__Group_0_1__0
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
    // InternalKerMLExpressions.g:3519:1: rule__ClassificationExpression__Group_0_1__0 : rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1 ;
    public final void rule__ClassificationExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3523:1: ( rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1 )
            // InternalKerMLExpressions.g:3524:2: rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1
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
    // InternalKerMLExpressions.g:3531:1: rule__ClassificationExpression__Group_0_1__0__Impl : ( () ) ;
    public final void rule__ClassificationExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3535:1: ( ( () ) )
            // InternalKerMLExpressions.g:3536:1: ( () )
            {
            // InternalKerMLExpressions.g:3536:1: ( () )
            // InternalKerMLExpressions.g:3537:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperand_compAction_0_1_0()); 
            }
            // InternalKerMLExpressions.g:3538:2: ()
            // InternalKerMLExpressions.g:3538:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperand_compAction_0_1_0()); 
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
    // InternalKerMLExpressions.g:3546:1: rule__ClassificationExpression__Group_0_1__1 : rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2 ;
    public final void rule__ClassificationExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3550:1: ( rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2 )
            // InternalKerMLExpressions.g:3551:2: rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2
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
    // InternalKerMLExpressions.g:3558:1: rule__ClassificationExpression__Group_0_1__1__Impl : ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__ClassificationExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3562:1: ( ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) ) )
            // InternalKerMLExpressions.g:3563:1: ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) )
            {
            // InternalKerMLExpressions.g:3563:1: ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) )
            // InternalKerMLExpressions.g:3564:2: ( rule__ClassificationExpression__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_0_1_1()); 
            }
            // InternalKerMLExpressions.g:3565:2: ( rule__ClassificationExpression__OperatorAssignment_0_1_1 )
            // InternalKerMLExpressions.g:3565:3: rule__ClassificationExpression__OperatorAssignment_0_1_1
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
    // InternalKerMLExpressions.g:3573:1: rule__ClassificationExpression__Group_0_1__2 : rule__ClassificationExpression__Group_0_1__2__Impl ;
    public final void rule__ClassificationExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3577:1: ( rule__ClassificationExpression__Group_0_1__2__Impl )
            // InternalKerMLExpressions.g:3578:2: rule__ClassificationExpression__Group_0_1__2__Impl
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
    // InternalKerMLExpressions.g:3584:1: rule__ClassificationExpression__Group_0_1__2__Impl : ( ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2 ) ) ;
    public final void rule__ClassificationExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3588:1: ( ( ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2 ) ) )
            // InternalKerMLExpressions.g:3589:1: ( ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2 ) )
            {
            // InternalKerMLExpressions.g:3589:1: ( ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2 ) )
            // InternalKerMLExpressions.g:3590:2: ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compAssignment_0_1_2()); 
            }
            // InternalKerMLExpressions.g:3591:2: ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2 )
            // InternalKerMLExpressions.g:3591:3: rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compAssignment_0_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3600:1: rule__ClassificationExpression__Group_1__0 : rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1 ;
    public final void rule__ClassificationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3604:1: ( rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3605:2: rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1
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
    // InternalKerMLExpressions.g:3612:1: rule__ClassificationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ClassificationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3616:1: ( ( () ) )
            // InternalKerMLExpressions.g:3617:1: ( () )
            {
            // InternalKerMLExpressions.g:3617:1: ( () )
            // InternalKerMLExpressions.g:3618:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3619:2: ()
            // InternalKerMLExpressions.g:3619:3: 
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
    // InternalKerMLExpressions.g:3627:1: rule__ClassificationExpression__Group_1__1 : rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2 ;
    public final void rule__ClassificationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3631:1: ( rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3632:2: rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2
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
    // InternalKerMLExpressions.g:3639:1: rule__ClassificationExpression__Group_1__1__Impl : ( ( rule__ClassificationExpression__Operand_compAssignment_1_1 ) ) ;
    public final void rule__ClassificationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3643:1: ( ( ( rule__ClassificationExpression__Operand_compAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3644:1: ( ( rule__ClassificationExpression__Operand_compAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3644:1: ( ( rule__ClassificationExpression__Operand_compAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3645:2: ( rule__ClassificationExpression__Operand_compAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperand_compAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3646:2: ( rule__ClassificationExpression__Operand_compAssignment_1_1 )
            // InternalKerMLExpressions.g:3646:3: rule__ClassificationExpression__Operand_compAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Operand_compAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperand_compAssignment_1_1()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3654:1: rule__ClassificationExpression__Group_1__2 : rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3 ;
    public final void rule__ClassificationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3658:1: ( rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3 )
            // InternalKerMLExpressions.g:3659:2: rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3
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
    // InternalKerMLExpressions.g:3666:1: rule__ClassificationExpression__Group_1__2__Impl : ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) ) ;
    public final void rule__ClassificationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3670:1: ( ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3671:1: ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3671:1: ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3672:2: ( rule__ClassificationExpression__OperatorAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3673:2: ( rule__ClassificationExpression__OperatorAssignment_1_2 )
            // InternalKerMLExpressions.g:3673:3: rule__ClassificationExpression__OperatorAssignment_1_2
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
    // InternalKerMLExpressions.g:3681:1: rule__ClassificationExpression__Group_1__3 : rule__ClassificationExpression__Group_1__3__Impl ;
    public final void rule__ClassificationExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3685:1: ( rule__ClassificationExpression__Group_1__3__Impl )
            // InternalKerMLExpressions.g:3686:2: rule__ClassificationExpression__Group_1__3__Impl
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
    // InternalKerMLExpressions.g:3692:1: rule__ClassificationExpression__Group_1__3__Impl : ( ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3 ) ) ;
    public final void rule__ClassificationExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3696:1: ( ( ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3 ) ) )
            // InternalKerMLExpressions.g:3697:1: ( ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3 ) )
            {
            // InternalKerMLExpressions.g:3697:1: ( ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3 ) )
            // InternalKerMLExpressions.g:3698:2: ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compAssignment_1_3()); 
            }
            // InternalKerMLExpressions.g:3699:2: ( rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3 )
            // InternalKerMLExpressions.g:3699:3: rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compAssignment_1_3()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3708:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3712:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalKerMLExpressions.g:3713:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
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
    // InternalKerMLExpressions.g:3720:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3724:1: ( ( ruleAdditiveExpression ) )
            // InternalKerMLExpressions.g:3725:1: ( ruleAdditiveExpression )
            {
            // InternalKerMLExpressions.g:3725:1: ( ruleAdditiveExpression )
            // InternalKerMLExpressions.g:3726:2: ruleAdditiveExpression
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
    // InternalKerMLExpressions.g:3735:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3739:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3740:2: rule__RelationalExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:3746:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3750:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3751:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3751:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3752:2: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3753:2: ( rule__RelationalExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=28 && LA32_0<=31)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3753:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalKerMLExpressions.g:3762:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3766:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3767:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
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
    // InternalKerMLExpressions.g:3774:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3778:1: ( ( () ) )
            // InternalKerMLExpressions.g:3779:1: ( () )
            {
            // InternalKerMLExpressions.g:3779:1: ( () )
            // InternalKerMLExpressions.g:3780:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3781:2: ()
            // InternalKerMLExpressions.g:3781:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:3789:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3793:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3794:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
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
    // InternalKerMLExpressions.g:3801:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3805:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3806:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3806:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3807:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3808:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3808:3: rule__RelationalExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:3816:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3820:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3821:2: rule__RelationalExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:3827:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3831:1: ( ( ( rule__RelationalExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3832:1: ( ( rule__RelationalExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3832:1: ( ( rule__RelationalExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3833:2: ( rule__RelationalExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3834:2: ( rule__RelationalExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:3834:3: rule__RelationalExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3843:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3847:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalKerMLExpressions.g:3848:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
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
    // InternalKerMLExpressions.g:3855:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3859:1: ( ( ruleMultiplicativeExpression ) )
            // InternalKerMLExpressions.g:3860:1: ( ruleMultiplicativeExpression )
            {
            // InternalKerMLExpressions.g:3860:1: ( ruleMultiplicativeExpression )
            // InternalKerMLExpressions.g:3861:2: ruleMultiplicativeExpression
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
    // InternalKerMLExpressions.g:3870:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3874:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3875:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:3881:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3885:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3886:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3886:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3887:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:3888:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=32 && LA33_0<=33)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3888:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalKerMLExpressions.g:3897:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3901:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3902:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
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
    // InternalKerMLExpressions.g:3909:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3913:1: ( ( () ) )
            // InternalKerMLExpressions.g:3914:1: ( () )
            {
            // InternalKerMLExpressions.g:3914:1: ( () )
            // InternalKerMLExpressions.g:3915:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:3916:2: ()
            // InternalKerMLExpressions.g:3916:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:3924:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3928:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3929:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
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
    // InternalKerMLExpressions.g:3936:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3940:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3941:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3941:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3942:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:3943:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3943:3: rule__AdditiveExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:3951:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3955:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3956:2: rule__AdditiveExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:3962:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3966:1: ( ( ( rule__AdditiveExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3967:1: ( ( rule__AdditiveExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3967:1: ( ( rule__AdditiveExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3968:2: ( rule__AdditiveExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:3969:2: ( rule__AdditiveExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:3969:3: rule__AdditiveExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:3978:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3982:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalKerMLExpressions.g:3983:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
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
    // InternalKerMLExpressions.g:3990:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleExponentiationExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3994:1: ( ( ruleExponentiationExpression ) )
            // InternalKerMLExpressions.g:3995:1: ( ruleExponentiationExpression )
            {
            // InternalKerMLExpressions.g:3995:1: ( ruleExponentiationExpression )
            // InternalKerMLExpressions.g:3996:2: ruleExponentiationExpression
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
    // InternalKerMLExpressions.g:4005:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4009:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4010:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:4016:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4020:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:4021:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:4021:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:4022:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:4023:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=34 && LA34_0<=36)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4023:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalKerMLExpressions.g:4032:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4036:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4037:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
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
    // InternalKerMLExpressions.g:4044:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4048:1: ( ( () ) )
            // InternalKerMLExpressions.g:4049:1: ( () )
            {
            // InternalKerMLExpressions.g:4049:1: ( () )
            // InternalKerMLExpressions.g:4050:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:4051:2: ()
            // InternalKerMLExpressions.g:4051:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:4059:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4063:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4064:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
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
    // InternalKerMLExpressions.g:4071:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4075:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4076:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4076:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4077:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:4078:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4078:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:4086:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4090:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4091:2: rule__MultiplicativeExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:4097:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4101:1: ( ( ( rule__MultiplicativeExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4102:1: ( ( rule__MultiplicativeExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4102:1: ( ( rule__MultiplicativeExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4103:2: ( rule__MultiplicativeExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:4104:2: ( rule__MultiplicativeExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:4104:3: rule__MultiplicativeExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:4113:1: rule__ExponentiationExpression__Group__0 : rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1 ;
    public final void rule__ExponentiationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4117:1: ( rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1 )
            // InternalKerMLExpressions.g:4118:2: rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1
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
    // InternalKerMLExpressions.g:4125:1: rule__ExponentiationExpression__Group__0__Impl : ( ruleUnitsExpression ) ;
    public final void rule__ExponentiationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4129:1: ( ( ruleUnitsExpression ) )
            // InternalKerMLExpressions.g:4130:1: ( ruleUnitsExpression )
            {
            // InternalKerMLExpressions.g:4130:1: ( ruleUnitsExpression )
            // InternalKerMLExpressions.g:4131:2: ruleUnitsExpression
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
    // InternalKerMLExpressions.g:4140:1: rule__ExponentiationExpression__Group__1 : rule__ExponentiationExpression__Group__1__Impl ;
    public final void rule__ExponentiationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4144:1: ( rule__ExponentiationExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4145:2: rule__ExponentiationExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:4151:1: rule__ExponentiationExpression__Group__1__Impl : ( ( rule__ExponentiationExpression__Group_1__0 )* ) ;
    public final void rule__ExponentiationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4155:1: ( ( ( rule__ExponentiationExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:4156:1: ( ( rule__ExponentiationExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:4156:1: ( ( rule__ExponentiationExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:4157:2: ( rule__ExponentiationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:4158:2: ( rule__ExponentiationExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==21) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4158:3: rule__ExponentiationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ExponentiationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalKerMLExpressions.g:4167:1: rule__ExponentiationExpression__Group_1__0 : rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1 ;
    public final void rule__ExponentiationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4171:1: ( rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4172:2: rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1
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
    // InternalKerMLExpressions.g:4179:1: rule__ExponentiationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ExponentiationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4183:1: ( ( () ) )
            // InternalKerMLExpressions.g:4184:1: ( () )
            {
            // InternalKerMLExpressions.g:4184:1: ( () )
            // InternalKerMLExpressions.g:4185:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:4186:2: ()
            // InternalKerMLExpressions.g:4186:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:4194:1: rule__ExponentiationExpression__Group_1__1 : rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2 ;
    public final void rule__ExponentiationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4198:1: ( rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4199:2: rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2
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
    // InternalKerMLExpressions.g:4206:1: rule__ExponentiationExpression__Group_1__1__Impl : ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ExponentiationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4210:1: ( ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4211:1: ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4211:1: ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4212:2: ( rule__ExponentiationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:4213:2: ( rule__ExponentiationExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4213:3: rule__ExponentiationExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:4221:1: rule__ExponentiationExpression__Group_1__2 : rule__ExponentiationExpression__Group_1__2__Impl ;
    public final void rule__ExponentiationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4225:1: ( rule__ExponentiationExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4226:2: rule__ExponentiationExpression__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:4232:1: rule__ExponentiationExpression__Group_1__2__Impl : ( ( rule__ExponentiationExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__ExponentiationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4236:1: ( ( ( rule__ExponentiationExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4237:1: ( ( rule__ExponentiationExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4237:1: ( ( rule__ExponentiationExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4238:2: ( rule__ExponentiationExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:4239:2: ( rule__ExponentiationExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:4239:3: rule__ExponentiationExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:4248:1: rule__UnitsExpression__Group__0 : rule__UnitsExpression__Group__0__Impl rule__UnitsExpression__Group__1 ;
    public final void rule__UnitsExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4252:1: ( rule__UnitsExpression__Group__0__Impl rule__UnitsExpression__Group__1 )
            // InternalKerMLExpressions.g:4253:2: rule__UnitsExpression__Group__0__Impl rule__UnitsExpression__Group__1
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
    // InternalKerMLExpressions.g:4260:1: rule__UnitsExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__UnitsExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4264:1: ( ( ruleUnaryExpression ) )
            // InternalKerMLExpressions.g:4265:1: ( ruleUnaryExpression )
            {
            // InternalKerMLExpressions.g:4265:1: ( ruleUnaryExpression )
            // InternalKerMLExpressions.g:4266:2: ruleUnaryExpression
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
    // InternalKerMLExpressions.g:4275:1: rule__UnitsExpression__Group__1 : rule__UnitsExpression__Group__1__Impl ;
    public final void rule__UnitsExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4279:1: ( rule__UnitsExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4280:2: rule__UnitsExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:4286:1: rule__UnitsExpression__Group__1__Impl : ( ( rule__UnitsExpression__Group_1__0 )? ) ;
    public final void rule__UnitsExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4290:1: ( ( ( rule__UnitsExpression__Group_1__0 )? ) )
            // InternalKerMLExpressions.g:4291:1: ( ( rule__UnitsExpression__Group_1__0 )? )
            {
            // InternalKerMLExpressions.g:4291:1: ( ( rule__UnitsExpression__Group_1__0 )? )
            // InternalKerMLExpressions.g:4292:2: ( rule__UnitsExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:4293:2: ( rule__UnitsExpression__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==53) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKerMLExpressions.g:4293:3: rule__UnitsExpression__Group_1__0
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
    // InternalKerMLExpressions.g:4302:1: rule__UnitsExpression__Group_1__0 : rule__UnitsExpression__Group_1__0__Impl rule__UnitsExpression__Group_1__1 ;
    public final void rule__UnitsExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4306:1: ( rule__UnitsExpression__Group_1__0__Impl rule__UnitsExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4307:2: rule__UnitsExpression__Group_1__0__Impl rule__UnitsExpression__Group_1__1
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
    // InternalKerMLExpressions.g:4314:1: rule__UnitsExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnitsExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4318:1: ( ( () ) )
            // InternalKerMLExpressions.g:4319:1: ( () )
            {
            // InternalKerMLExpressions.g:4319:1: ( () )
            // InternalKerMLExpressions.g:4320:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:4321:2: ()
            // InternalKerMLExpressions.g:4321:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:4329:1: rule__UnitsExpression__Group_1__1 : rule__UnitsExpression__Group_1__1__Impl rule__UnitsExpression__Group_1__2 ;
    public final void rule__UnitsExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4333:1: ( rule__UnitsExpression__Group_1__1__Impl rule__UnitsExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4334:2: rule__UnitsExpression__Group_1__1__Impl rule__UnitsExpression__Group_1__2
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
    // InternalKerMLExpressions.g:4341:1: rule__UnitsExpression__Group_1__1__Impl : ( ( rule__UnitsExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__UnitsExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4345:1: ( ( ( rule__UnitsExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4346:1: ( ( rule__UnitsExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4346:1: ( ( rule__UnitsExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4347:2: ( rule__UnitsExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:4348:2: ( rule__UnitsExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4348:3: rule__UnitsExpression__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:4356:1: rule__UnitsExpression__Group_1__2 : rule__UnitsExpression__Group_1__2__Impl rule__UnitsExpression__Group_1__3 ;
    public final void rule__UnitsExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4360:1: ( rule__UnitsExpression__Group_1__2__Impl rule__UnitsExpression__Group_1__3 )
            // InternalKerMLExpressions.g:4361:2: rule__UnitsExpression__Group_1__2__Impl rule__UnitsExpression__Group_1__3
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
    // InternalKerMLExpressions.g:4368:1: rule__UnitsExpression__Group_1__2__Impl : ( ( rule__UnitsExpression__Operand_compAssignment_1_2 ) ) ;
    public final void rule__UnitsExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4372:1: ( ( ( rule__UnitsExpression__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4373:1: ( ( rule__UnitsExpression__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4373:1: ( ( rule__UnitsExpression__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4374:2: ( rule__UnitsExpression__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:4375:2: ( rule__UnitsExpression__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:4375:3: rule__UnitsExpression__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UnitsExpression__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:4383:1: rule__UnitsExpression__Group_1__3 : rule__UnitsExpression__Group_1__3__Impl ;
    public final void rule__UnitsExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4387:1: ( rule__UnitsExpression__Group_1__3__Impl )
            // InternalKerMLExpressions.g:4388:2: rule__UnitsExpression__Group_1__3__Impl
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
    // InternalKerMLExpressions.g:4394:1: rule__UnitsExpression__Group_1__3__Impl : ( ']' ) ;
    public final void rule__UnitsExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4398:1: ( ( ']' ) )
            // InternalKerMLExpressions.g:4399:1: ( ']' )
            {
            // InternalKerMLExpressions.g:4399:1: ( ']' )
            // InternalKerMLExpressions.g:4400:2: ']'
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
    // InternalKerMLExpressions.g:4410:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4414:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalKerMLExpressions.g:4415:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
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
    // InternalKerMLExpressions.g:4422:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4426:1: ( ( () ) )
            // InternalKerMLExpressions.g:4427:1: ( () )
            {
            // InternalKerMLExpressions.g:4427:1: ( () )
            // InternalKerMLExpressions.g:4428:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKerMLExpressions.g:4429:2: ()
            // InternalKerMLExpressions.g:4429:3: 
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
    // InternalKerMLExpressions.g:4437:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4441:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalKerMLExpressions.g:4442:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
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
    // InternalKerMLExpressions.g:4449:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4453:1: ( ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) )
            // InternalKerMLExpressions.g:4454:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKerMLExpressions.g:4454:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            // InternalKerMLExpressions.g:4455:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKerMLExpressions.g:4456:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            // InternalKerMLExpressions.g:4456:3: rule__UnaryExpression__OperatorAssignment_0_1
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
    // InternalKerMLExpressions.g:4464:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4468:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalKerMLExpressions.g:4469:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalKerMLExpressions.g:4475:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__Operand_compAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4479:1: ( ( ( rule__UnaryExpression__Operand_compAssignment_0_2 ) ) )
            // InternalKerMLExpressions.g:4480:1: ( ( rule__UnaryExpression__Operand_compAssignment_0_2 ) )
            {
            // InternalKerMLExpressions.g:4480:1: ( ( rule__UnaryExpression__Operand_compAssignment_0_2 ) )
            // InternalKerMLExpressions.g:4481:2: ( rule__UnaryExpression__Operand_compAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperand_compAssignment_0_2()); 
            }
            // InternalKerMLExpressions.g:4482:2: ( rule__UnaryExpression__Operand_compAssignment_0_2 )
            // InternalKerMLExpressions.g:4482:3: rule__UnaryExpression__Operand_compAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Operand_compAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperand_compAssignment_0_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:4491:1: rule__ExtentExpression__Group_0__0 : rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1 ;
    public final void rule__ExtentExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4495:1: ( rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1 )
            // InternalKerMLExpressions.g:4496:2: rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1
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
    // InternalKerMLExpressions.g:4503:1: rule__ExtentExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ExtentExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4507:1: ( ( () ) )
            // InternalKerMLExpressions.g:4508:1: ( () )
            {
            // InternalKerMLExpressions.g:4508:1: ( () )
            // InternalKerMLExpressions.g:4509:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKerMLExpressions.g:4510:2: ()
            // InternalKerMLExpressions.g:4510:3: 
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
    // InternalKerMLExpressions.g:4518:1: rule__ExtentExpression__Group_0__1 : rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2 ;
    public final void rule__ExtentExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4522:1: ( rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2 )
            // InternalKerMLExpressions.g:4523:2: rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2
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
    // InternalKerMLExpressions.g:4530:1: rule__ExtentExpression__Group_0__1__Impl : ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ExtentExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4534:1: ( ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) ) )
            // InternalKerMLExpressions.g:4535:1: ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKerMLExpressions.g:4535:1: ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) )
            // InternalKerMLExpressions.g:4536:2: ( rule__ExtentExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKerMLExpressions.g:4537:2: ( rule__ExtentExpression__OperatorAssignment_0_1 )
            // InternalKerMLExpressions.g:4537:3: rule__ExtentExpression__OperatorAssignment_0_1
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
    // InternalKerMLExpressions.g:4545:1: rule__ExtentExpression__Group_0__2 : rule__ExtentExpression__Group_0__2__Impl ;
    public final void rule__ExtentExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4549:1: ( rule__ExtentExpression__Group_0__2__Impl )
            // InternalKerMLExpressions.g:4550:2: rule__ExtentExpression__Group_0__2__Impl
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
    // InternalKerMLExpressions.g:4556:1: rule__ExtentExpression__Group_0__2__Impl : ( ( rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2 ) ) ;
    public final void rule__ExtentExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4560:1: ( ( ( rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2 ) ) )
            // InternalKerMLExpressions.g:4561:1: ( ( rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2 ) )
            {
            // InternalKerMLExpressions.g:4561:1: ( ( rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2 ) )
            // InternalKerMLExpressions.g:4562:2: ( rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOwnedFeatureMembership_compAssignment_0_2()); 
            }
            // InternalKerMLExpressions.g:4563:2: ( rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2 )
            // InternalKerMLExpressions.g:4563:3: rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getOwnedFeatureMembership_compAssignment_0_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__0"
    // InternalKerMLExpressions.g:4572:1: rule__ExtentExpression_Deprecated__Group__0 : rule__ExtentExpression_Deprecated__Group__0__Impl rule__ExtentExpression_Deprecated__Group__1 ;
    public final void rule__ExtentExpression_Deprecated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4576:1: ( rule__ExtentExpression_Deprecated__Group__0__Impl rule__ExtentExpression_Deprecated__Group__1 )
            // InternalKerMLExpressions.g:4577:2: rule__ExtentExpression_Deprecated__Group__0__Impl rule__ExtentExpression_Deprecated__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ExtentExpression_Deprecated__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtentExpression_Deprecated__Group__1();

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
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__0"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__0__Impl"
    // InternalKerMLExpressions.g:4584:1: rule__ExtentExpression_Deprecated__Group__0__Impl : ( ( rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0 ) ) ;
    public final void rule__ExtentExpression_Deprecated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4588:1: ( ( ( rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0 ) ) )
            // InternalKerMLExpressions.g:4589:1: ( ( rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:4589:1: ( ( rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0 ) )
            // InternalKerMLExpressions.g:4590:2: ( rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getOwnedFeatureMembership_compAssignment_0()); 
            }
            // InternalKerMLExpressions.g:4591:2: ( rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0 )
            // InternalKerMLExpressions.g:4591:3: rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getOwnedFeatureMembership_compAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__0__Impl"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__1"
    // InternalKerMLExpressions.g:4599:1: rule__ExtentExpression_Deprecated__Group__1 : rule__ExtentExpression_Deprecated__Group__1__Impl rule__ExtentExpression_Deprecated__Group__2 ;
    public final void rule__ExtentExpression_Deprecated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4603:1: ( rule__ExtentExpression_Deprecated__Group__1__Impl rule__ExtentExpression_Deprecated__Group__2 )
            // InternalKerMLExpressions.g:4604:2: rule__ExtentExpression_Deprecated__Group__1__Impl rule__ExtentExpression_Deprecated__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__ExtentExpression_Deprecated__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtentExpression_Deprecated__Group__2();

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
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__1"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__1__Impl"
    // InternalKerMLExpressions.g:4611:1: rule__ExtentExpression_Deprecated__Group__1__Impl : ( '.' ) ;
    public final void rule__ExtentExpression_Deprecated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4615:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:4616:1: ( '.' )
            {
            // InternalKerMLExpressions.g:4616:1: ( '.' )
            // InternalKerMLExpressions.g:4617:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getFullStopKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__1__Impl"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__2"
    // InternalKerMLExpressions.g:4626:1: rule__ExtentExpression_Deprecated__Group__2 : rule__ExtentExpression_Deprecated__Group__2__Impl rule__ExtentExpression_Deprecated__Group__3 ;
    public final void rule__ExtentExpression_Deprecated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4630:1: ( rule__ExtentExpression_Deprecated__Group__2__Impl rule__ExtentExpression_Deprecated__Group__3 )
            // InternalKerMLExpressions.g:4631:2: rule__ExtentExpression_Deprecated__Group__2__Impl rule__ExtentExpression_Deprecated__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ExtentExpression_Deprecated__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtentExpression_Deprecated__Group__3();

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
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__2"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__2__Impl"
    // InternalKerMLExpressions.g:4638:1: rule__ExtentExpression_Deprecated__Group__2__Impl : ( ( rule__ExtentExpression_Deprecated__OperatorAssignment_2 ) ) ;
    public final void rule__ExtentExpression_Deprecated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4642:1: ( ( ( rule__ExtentExpression_Deprecated__OperatorAssignment_2 ) ) )
            // InternalKerMLExpressions.g:4643:1: ( ( rule__ExtentExpression_Deprecated__OperatorAssignment_2 ) )
            {
            // InternalKerMLExpressions.g:4643:1: ( ( rule__ExtentExpression_Deprecated__OperatorAssignment_2 ) )
            // InternalKerMLExpressions.g:4644:2: ( rule__ExtentExpression_Deprecated__OperatorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getOperatorAssignment_2()); 
            }
            // InternalKerMLExpressions.g:4645:2: ( rule__ExtentExpression_Deprecated__OperatorAssignment_2 )
            // InternalKerMLExpressions.g:4645:3: rule__ExtentExpression_Deprecated__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression_Deprecated__OperatorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getOperatorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__2__Impl"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__3"
    // InternalKerMLExpressions.g:4653:1: rule__ExtentExpression_Deprecated__Group__3 : rule__ExtentExpression_Deprecated__Group__3__Impl rule__ExtentExpression_Deprecated__Group__4 ;
    public final void rule__ExtentExpression_Deprecated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4657:1: ( rule__ExtentExpression_Deprecated__Group__3__Impl rule__ExtentExpression_Deprecated__Group__4 )
            // InternalKerMLExpressions.g:4658:2: rule__ExtentExpression_Deprecated__Group__3__Impl rule__ExtentExpression_Deprecated__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__ExtentExpression_Deprecated__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtentExpression_Deprecated__Group__4();

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
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__3"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__3__Impl"
    // InternalKerMLExpressions.g:4665:1: rule__ExtentExpression_Deprecated__Group__3__Impl : ( '(' ) ;
    public final void rule__ExtentExpression_Deprecated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4669:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:4670:1: ( '(' )
            {
            // InternalKerMLExpressions.g:4670:1: ( '(' )
            // InternalKerMLExpressions.g:4671:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__3__Impl"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__4"
    // InternalKerMLExpressions.g:4680:1: rule__ExtentExpression_Deprecated__Group__4 : rule__ExtentExpression_Deprecated__Group__4__Impl ;
    public final void rule__ExtentExpression_Deprecated__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4684:1: ( rule__ExtentExpression_Deprecated__Group__4__Impl )
            // InternalKerMLExpressions.g:4685:2: rule__ExtentExpression_Deprecated__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression_Deprecated__Group__4__Impl();

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
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__4"


    // $ANTLR start "rule__ExtentExpression_Deprecated__Group__4__Impl"
    // InternalKerMLExpressions.g:4691:1: rule__ExtentExpression_Deprecated__Group__4__Impl : ( ')' ) ;
    public final void rule__ExtentExpression_Deprecated__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4695:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:4696:1: ( ')' )
            {
            // InternalKerMLExpressions.g:4696:1: ( ')' )
            // InternalKerMLExpressions.g:4697:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression_Deprecated__Group__4__Impl"


    // $ANTLR start "rule__SequenceExpression__Group__0"
    // InternalKerMLExpressions.g:4707:1: rule__SequenceExpression__Group__0 : rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1 ;
    public final void rule__SequenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4711:1: ( rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1 )
            // InternalKerMLExpressions.g:4712:2: rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalKerMLExpressions.g:4719:1: rule__SequenceExpression__Group__0__Impl : ( ( rule__SequenceExpression__Alternatives_0 ) ) ;
    public final void rule__SequenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4723:1: ( ( ( rule__SequenceExpression__Alternatives_0 ) ) )
            // InternalKerMLExpressions.g:4724:1: ( ( rule__SequenceExpression__Alternatives_0 ) )
            {
            // InternalKerMLExpressions.g:4724:1: ( ( rule__SequenceExpression__Alternatives_0 ) )
            // InternalKerMLExpressions.g:4725:2: ( rule__SequenceExpression__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getAlternatives_0()); 
            }
            // InternalKerMLExpressions.g:4726:2: ( rule__SequenceExpression__Alternatives_0 )
            // InternalKerMLExpressions.g:4726:3: rule__SequenceExpression__Alternatives_0
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
    // InternalKerMLExpressions.g:4734:1: rule__SequenceExpression__Group__1 : rule__SequenceExpression__Group__1__Impl ;
    public final void rule__SequenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4738:1: ( rule__SequenceExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4739:2: rule__SequenceExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:4745:1: rule__SequenceExpression__Group__1__Impl : ( ( rule__SequenceExpression__Alternatives_1 )* ) ;
    public final void rule__SequenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4749:1: ( ( ( rule__SequenceExpression__Alternatives_1 )* ) )
            // InternalKerMLExpressions.g:4750:1: ( ( rule__SequenceExpression__Alternatives_1 )* )
            {
            // InternalKerMLExpressions.g:4750:1: ( ( rule__SequenceExpression__Alternatives_1 )* )
            // InternalKerMLExpressions.g:4751:2: ( rule__SequenceExpression__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getAlternatives_1()); 
            }
            // InternalKerMLExpressions.g:4752:2: ( rule__SequenceExpression__Alternatives_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46||LA37_0==56) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4752:3: rule__SequenceExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__SequenceExpression__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalKerMLExpressions.g:4761:1: rule__SequenceExpression__Group_1_0__0 : rule__SequenceExpression__Group_1_0__0__Impl rule__SequenceExpression__Group_1_0__1 ;
    public final void rule__SequenceExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4765:1: ( rule__SequenceExpression__Group_1_0__0__Impl rule__SequenceExpression__Group_1_0__1 )
            // InternalKerMLExpressions.g:4766:2: rule__SequenceExpression__Group_1_0__0__Impl rule__SequenceExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalKerMLExpressions.g:4773:1: rule__SequenceExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__SequenceExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4777:1: ( ( () ) )
            // InternalKerMLExpressions.g:4778:1: ( () )
            {
            // InternalKerMLExpressions.g:4778:1: ( () )
            // InternalKerMLExpressions.g:4779:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperand_compAction_1_0_0()); 
            }
            // InternalKerMLExpressions.g:4780:2: ()
            // InternalKerMLExpressions.g:4780:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperand_compAction_1_0_0()); 
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
    // InternalKerMLExpressions.g:4788:1: rule__SequenceExpression__Group_1_0__1 : rule__SequenceExpression__Group_1_0__1__Impl rule__SequenceExpression__Group_1_0__2 ;
    public final void rule__SequenceExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4792:1: ( rule__SequenceExpression__Group_1_0__1__Impl rule__SequenceExpression__Group_1_0__2 )
            // InternalKerMLExpressions.g:4793:2: rule__SequenceExpression__Group_1_0__1__Impl rule__SequenceExpression__Group_1_0__2
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
    // InternalKerMLExpressions.g:4800:1: rule__SequenceExpression__Group_1_0__1__Impl : ( ( rule__SequenceExpression__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__SequenceExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4804:1: ( ( ( rule__SequenceExpression__OperatorAssignment_1_0_1 ) ) )
            // InternalKerMLExpressions.g:4805:1: ( ( rule__SequenceExpression__OperatorAssignment_1_0_1 ) )
            {
            // InternalKerMLExpressions.g:4805:1: ( ( rule__SequenceExpression__OperatorAssignment_1_0_1 ) )
            // InternalKerMLExpressions.g:4806:2: ( rule__SequenceExpression__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalKerMLExpressions.g:4807:2: ( rule__SequenceExpression__OperatorAssignment_1_0_1 )
            // InternalKerMLExpressions.g:4807:3: rule__SequenceExpression__OperatorAssignment_1_0_1
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
    // InternalKerMLExpressions.g:4815:1: rule__SequenceExpression__Group_1_0__2 : rule__SequenceExpression__Group_1_0__2__Impl rule__SequenceExpression__Group_1_0__3 ;
    public final void rule__SequenceExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4819:1: ( rule__SequenceExpression__Group_1_0__2__Impl rule__SequenceExpression__Group_1_0__3 )
            // InternalKerMLExpressions.g:4820:2: rule__SequenceExpression__Group_1_0__2__Impl rule__SequenceExpression__Group_1_0__3
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
    // InternalKerMLExpressions.g:4827:1: rule__SequenceExpression__Group_1_0__2__Impl : ( ( rule__SequenceExpression__Operand_compAssignment_1_0_2 ) ) ;
    public final void rule__SequenceExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4831:1: ( ( ( rule__SequenceExpression__Operand_compAssignment_1_0_2 ) ) )
            // InternalKerMLExpressions.g:4832:1: ( ( rule__SequenceExpression__Operand_compAssignment_1_0_2 ) )
            {
            // InternalKerMLExpressions.g:4832:1: ( ( rule__SequenceExpression__Operand_compAssignment_1_0_2 ) )
            // InternalKerMLExpressions.g:4833:2: ( rule__SequenceExpression__Operand_compAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperand_compAssignment_1_0_2()); 
            }
            // InternalKerMLExpressions.g:4834:2: ( rule__SequenceExpression__Operand_compAssignment_1_0_2 )
            // InternalKerMLExpressions.g:4834:3: rule__SequenceExpression__Operand_compAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Operand_compAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperand_compAssignment_1_0_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:4842:1: rule__SequenceExpression__Group_1_0__3 : rule__SequenceExpression__Group_1_0__3__Impl ;
    public final void rule__SequenceExpression__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4846:1: ( rule__SequenceExpression__Group_1_0__3__Impl )
            // InternalKerMLExpressions.g:4847:2: rule__SequenceExpression__Group_1_0__3__Impl
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
    // InternalKerMLExpressions.g:4853:1: rule__SequenceExpression__Group_1_0__3__Impl : ( ']' ) ;
    public final void rule__SequenceExpression__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4857:1: ( ( ']' ) )
            // InternalKerMLExpressions.g:4858:1: ( ']' )
            {
            // InternalKerMLExpressions.g:4858:1: ( ']' )
            // InternalKerMLExpressions.g:4859:2: ']'
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
    // InternalKerMLExpressions.g:4869:1: rule__SequenceExpression__Group_1_1__0 : rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1 ;
    public final void rule__SequenceExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4873:1: ( rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1 )
            // InternalKerMLExpressions.g:4874:2: rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalKerMLExpressions.g:4881:1: rule__SequenceExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__SequenceExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4885:1: ( ( () ) )
            // InternalKerMLExpressions.g:4886:1: ( () )
            {
            // InternalKerMLExpressions.g:4886:1: ( () )
            // InternalKerMLExpressions.g:4887:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperand_compAction_1_1_0()); 
            }
            // InternalKerMLExpressions.g:4888:2: ()
            // InternalKerMLExpressions.g:4888:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperand_compAction_1_1_0()); 
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
    // InternalKerMLExpressions.g:4896:1: rule__SequenceExpression__Group_1_1__1 : rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2 ;
    public final void rule__SequenceExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4900:1: ( rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2 )
            // InternalKerMLExpressions.g:4901:2: rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2
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
    // InternalKerMLExpressions.g:4908:1: rule__SequenceExpression__Group_1_1__1__Impl : ( '->' ) ;
    public final void rule__SequenceExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4912:1: ( ( '->' ) )
            // InternalKerMLExpressions.g:4913:1: ( '->' )
            {
            // InternalKerMLExpressions.g:4913:1: ( '->' )
            // InternalKerMLExpressions.g:4914:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalKerMLExpressions.g:4923:1: rule__SequenceExpression__Group_1_1__2 : rule__SequenceExpression__Group_1_1__2__Impl rule__SequenceExpression__Group_1_1__3 ;
    public final void rule__SequenceExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4927:1: ( rule__SequenceExpression__Group_1_1__2__Impl rule__SequenceExpression__Group_1_1__3 )
            // InternalKerMLExpressions.g:4928:2: rule__SequenceExpression__Group_1_1__2__Impl rule__SequenceExpression__Group_1_1__3
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
    // InternalKerMLExpressions.g:4935:1: rule__SequenceExpression__Group_1_1__2__Impl : ( ( rule__SequenceExpression__OperatorAssignment_1_1_2 ) ) ;
    public final void rule__SequenceExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4939:1: ( ( ( rule__SequenceExpression__OperatorAssignment_1_1_2 ) ) )
            // InternalKerMLExpressions.g:4940:1: ( ( rule__SequenceExpression__OperatorAssignment_1_1_2 ) )
            {
            // InternalKerMLExpressions.g:4940:1: ( ( rule__SequenceExpression__OperatorAssignment_1_1_2 ) )
            // InternalKerMLExpressions.g:4941:2: ( rule__SequenceExpression__OperatorAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_1_2()); 
            }
            // InternalKerMLExpressions.g:4942:2: ( rule__SequenceExpression__OperatorAssignment_1_1_2 )
            // InternalKerMLExpressions.g:4942:3: rule__SequenceExpression__OperatorAssignment_1_1_2
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
    // InternalKerMLExpressions.g:4950:1: rule__SequenceExpression__Group_1_1__3 : rule__SequenceExpression__Group_1_1__3__Impl ;
    public final void rule__SequenceExpression__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4954:1: ( rule__SequenceExpression__Group_1_1__3__Impl )
            // InternalKerMLExpressions.g:4955:2: rule__SequenceExpression__Group_1_1__3__Impl
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
    // InternalKerMLExpressions.g:4961:1: rule__SequenceExpression__Group_1_1__3__Impl : ( ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )* ) ) ;
    public final void rule__SequenceExpression__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4965:1: ( ( ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )* ) ) )
            // InternalKerMLExpressions.g:4966:1: ( ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )* ) )
            {
            // InternalKerMLExpressions.g:4966:1: ( ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )* ) )
            // InternalKerMLExpressions.g:4967:2: ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 ) ) ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )* )
            {
            // InternalKerMLExpressions.g:4967:2: ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 ) )
            // InternalKerMLExpressions.g:4968:3: ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOwnedFeatureMembership_compAssignment_1_1_3()); 
            }
            // InternalKerMLExpressions.g:4969:3: ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )
            // InternalKerMLExpressions.g:4969:4: rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3
            {
            pushFollow(FOLLOW_41);
            rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOwnedFeatureMembership_compAssignment_1_1_3()); 
            }

            }

            // InternalKerMLExpressions.g:4972:2: ( ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )* )
            // InternalKerMLExpressions.g:4973:3: ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOwnedFeatureMembership_compAssignment_1_1_3()); 
            }
            // InternalKerMLExpressions.g:4974:3: ( rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_UNRESTRICTED_NAME)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4974:4: rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOwnedFeatureMembership_compAssignment_1_1_3()); 
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


    // $ANTLR start "rule__BodyExpression__Group_0__0"
    // InternalKerMLExpressions.g:4984:1: rule__BodyExpression__Group_0__0 : rule__BodyExpression__Group_0__0__Impl ;
    public final void rule__BodyExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4988:1: ( rule__BodyExpression__Group_0__0__Impl )
            // InternalKerMLExpressions.g:4989:2: rule__BodyExpression__Group_0__0__Impl
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
    // InternalKerMLExpressions.g:4995:1: rule__BodyExpression__Group_0__0__Impl : ( ( rule__BodyExpression__Group_0_0__0 ) ) ;
    public final void rule__BodyExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4999:1: ( ( ( rule__BodyExpression__Group_0_0__0 ) ) )
            // InternalKerMLExpressions.g:5000:1: ( ( rule__BodyExpression__Group_0_0__0 ) )
            {
            // InternalKerMLExpressions.g:5000:1: ( ( rule__BodyExpression__Group_0_0__0 ) )
            // InternalKerMLExpressions.g:5001:2: ( rule__BodyExpression__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getGroup_0_0()); 
            }
            // InternalKerMLExpressions.g:5002:2: ( rule__BodyExpression__Group_0_0__0 )
            // InternalKerMLExpressions.g:5002:3: rule__BodyExpression__Group_0_0__0
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
    // InternalKerMLExpressions.g:5011:1: rule__BodyExpression__Group_0_0__0 : rule__BodyExpression__Group_0_0__0__Impl rule__BodyExpression__Group_0_0__1 ;
    public final void rule__BodyExpression__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5015:1: ( rule__BodyExpression__Group_0_0__0__Impl rule__BodyExpression__Group_0_0__1 )
            // InternalKerMLExpressions.g:5016:2: rule__BodyExpression__Group_0_0__0__Impl rule__BodyExpression__Group_0_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalKerMLExpressions.g:5023:1: rule__BodyExpression__Group_0_0__0__Impl : ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0 ) ) ;
    public final void rule__BodyExpression__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5027:1: ( ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0 ) ) )
            // InternalKerMLExpressions.g:5028:1: ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0 ) )
            {
            // InternalKerMLExpressions.g:5028:1: ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0 ) )
            // InternalKerMLExpressions.g:5029:2: ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_0()); 
            }
            // InternalKerMLExpressions.g:5030:2: ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0 )
            // InternalKerMLExpressions.g:5030:3: rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_0()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5038:1: rule__BodyExpression__Group_0_0__1 : rule__BodyExpression__Group_0_0__1__Impl rule__BodyExpression__Group_0_0__2 ;
    public final void rule__BodyExpression__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5042:1: ( rule__BodyExpression__Group_0_0__1__Impl rule__BodyExpression__Group_0_0__2 )
            // InternalKerMLExpressions.g:5043:2: rule__BodyExpression__Group_0_0__1__Impl rule__BodyExpression__Group_0_0__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalKerMLExpressions.g:5050:1: rule__BodyExpression__Group_0_0__1__Impl : ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1 )* ) ;
    public final void rule__BodyExpression__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5054:1: ( ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1 )* ) )
            // InternalKerMLExpressions.g:5055:1: ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1 )* )
            {
            // InternalKerMLExpressions.g:5055:1: ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1 )* )
            // InternalKerMLExpressions.g:5056:2: ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_1()); 
            }
            // InternalKerMLExpressions.g:5057:2: ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKerMLExpressions.g:5057:3: rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_1()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5065:1: rule__BodyExpression__Group_0_0__2 : rule__BodyExpression__Group_0_0__2__Impl rule__BodyExpression__Group_0_0__3 ;
    public final void rule__BodyExpression__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5069:1: ( rule__BodyExpression__Group_0_0__2__Impl rule__BodyExpression__Group_0_0__3 )
            // InternalKerMLExpressions.g:5070:2: rule__BodyExpression__Group_0_0__2__Impl rule__BodyExpression__Group_0_0__3
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
    // InternalKerMLExpressions.g:5077:1: rule__BodyExpression__Group_0_0__2__Impl : ( '(' ) ;
    public final void rule__BodyExpression__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5081:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:5082:1: ( '(' )
            {
            // InternalKerMLExpressions.g:5082:1: ( '(' )
            // InternalKerMLExpressions.g:5083:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getLeftParenthesisKeyword_0_0_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalKerMLExpressions.g:5092:1: rule__BodyExpression__Group_0_0__3 : rule__BodyExpression__Group_0_0__3__Impl rule__BodyExpression__Group_0_0__4 ;
    public final void rule__BodyExpression__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5096:1: ( rule__BodyExpression__Group_0_0__3__Impl rule__BodyExpression__Group_0_0__4 )
            // InternalKerMLExpressions.g:5097:2: rule__BodyExpression__Group_0_0__3__Impl rule__BodyExpression__Group_0_0__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalKerMLExpressions.g:5104:1: rule__BodyExpression__Group_0_0__3__Impl : ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3 ) ) ;
    public final void rule__BodyExpression__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5108:1: ( ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3 ) ) )
            // InternalKerMLExpressions.g:5109:1: ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3 ) )
            {
            // InternalKerMLExpressions.g:5109:1: ( ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3 ) )
            // InternalKerMLExpressions.g:5110:2: ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_3()); 
            }
            // InternalKerMLExpressions.g:5111:2: ( rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3 )
            // InternalKerMLExpressions.g:5111:3: rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3
            {
            pushFollow(FOLLOW_2);
            rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compAssignment_0_0_3()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5119:1: rule__BodyExpression__Group_0_0__4 : rule__BodyExpression__Group_0_0__4__Impl ;
    public final void rule__BodyExpression__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5123:1: ( rule__BodyExpression__Group_0_0__4__Impl )
            // InternalKerMLExpressions.g:5124:2: rule__BodyExpression__Group_0_0__4__Impl
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
    // InternalKerMLExpressions.g:5130:1: rule__BodyExpression__Group_0_0__4__Impl : ( ')' ) ;
    public final void rule__BodyExpression__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5134:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:5135:1: ( ')' )
            {
            // InternalKerMLExpressions.g:5135:1: ( ')' )
            // InternalKerMLExpressions.g:5136:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getRightParenthesisKeyword_0_0_4()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalKerMLExpressions.g:5146:1: rule__BodyParameterMember__Group__0 : rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1 ;
    public final void rule__BodyParameterMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5150:1: ( rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1 )
            // InternalKerMLExpressions.g:5151:2: rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1
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
    // InternalKerMLExpressions.g:5158:1: rule__BodyParameterMember__Group__0__Impl : ( ( rule__BodyParameterMember__MemberNameAssignment_0 ) ) ;
    public final void rule__BodyParameterMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5162:1: ( ( ( rule__BodyParameterMember__MemberNameAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5163:1: ( ( rule__BodyParameterMember__MemberNameAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5163:1: ( ( rule__BodyParameterMember__MemberNameAssignment_0 ) )
            // InternalKerMLExpressions.g:5164:2: ( rule__BodyParameterMember__MemberNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberAccess().getMemberNameAssignment_0()); 
            }
            // InternalKerMLExpressions.g:5165:2: ( rule__BodyParameterMember__MemberNameAssignment_0 )
            // InternalKerMLExpressions.g:5165:3: rule__BodyParameterMember__MemberNameAssignment_0
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
    // InternalKerMLExpressions.g:5173:1: rule__BodyParameterMember__Group__1 : rule__BodyParameterMember__Group__1__Impl ;
    public final void rule__BodyParameterMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5177:1: ( rule__BodyParameterMember__Group__1__Impl )
            // InternalKerMLExpressions.g:5178:2: rule__BodyParameterMember__Group__1__Impl
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
    // InternalKerMLExpressions.g:5184:1: rule__BodyParameterMember__Group__1__Impl : ( ( rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1 ) ) ;
    public final void rule__BodyParameterMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5188:1: ( ( ( rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1 ) ) )
            // InternalKerMLExpressions.g:5189:1: ( ( rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1 ) )
            {
            // InternalKerMLExpressions.g:5189:1: ( ( rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1 ) )
            // InternalKerMLExpressions.g:5190:2: ( rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberAccess().getOwnedMemberParameter_compAssignment_1()); 
            }
            // InternalKerMLExpressions.g:5191:2: ( rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1 )
            // InternalKerMLExpressions.g:5191:3: rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterMemberAccess().getOwnedMemberParameter_compAssignment_1()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5200:1: rule__SequenceConstructionExpression__Group_0__0 : rule__SequenceConstructionExpression__Group_0__0__Impl rule__SequenceConstructionExpression__Group_0__1 ;
    public final void rule__SequenceConstructionExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5204:1: ( rule__SequenceConstructionExpression__Group_0__0__Impl rule__SequenceConstructionExpression__Group_0__1 )
            // InternalKerMLExpressions.g:5205:2: rule__SequenceConstructionExpression__Group_0__0__Impl rule__SequenceConstructionExpression__Group_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalKerMLExpressions.g:5212:1: rule__SequenceConstructionExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5216:1: ( ( () ) )
            // InternalKerMLExpressions.g:5217:1: ( () )
            {
            // InternalKerMLExpressions.g:5217:1: ( () )
            // InternalKerMLExpressions.g:5218:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getNullExpressionAction_0_0()); 
            }
            // InternalKerMLExpressions.g:5219:2: ()
            // InternalKerMLExpressions.g:5219:3: 
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
    // InternalKerMLExpressions.g:5227:1: rule__SequenceConstructionExpression__Group_0__1 : rule__SequenceConstructionExpression__Group_0__1__Impl rule__SequenceConstructionExpression__Group_0__2 ;
    public final void rule__SequenceConstructionExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5231:1: ( rule__SequenceConstructionExpression__Group_0__1__Impl rule__SequenceConstructionExpression__Group_0__2 )
            // InternalKerMLExpressions.g:5232:2: rule__SequenceConstructionExpression__Group_0__1__Impl rule__SequenceConstructionExpression__Group_0__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalKerMLExpressions.g:5239:1: rule__SequenceConstructionExpression__Group_0__1__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5243:1: ( ( '{' ) )
            // InternalKerMLExpressions.g:5244:1: ( '{' )
            {
            // InternalKerMLExpressions.g:5244:1: ( '{' )
            // InternalKerMLExpressions.g:5245:2: '{'
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
    // InternalKerMLExpressions.g:5254:1: rule__SequenceConstructionExpression__Group_0__2 : rule__SequenceConstructionExpression__Group_0__2__Impl ;
    public final void rule__SequenceConstructionExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5258:1: ( rule__SequenceConstructionExpression__Group_0__2__Impl )
            // InternalKerMLExpressions.g:5259:2: rule__SequenceConstructionExpression__Group_0__2__Impl
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
    // InternalKerMLExpressions.g:5265:1: rule__SequenceConstructionExpression__Group_0__2__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5269:1: ( ( '}' ) )
            // InternalKerMLExpressions.g:5270:1: ( '}' )
            {
            // InternalKerMLExpressions.g:5270:1: ( '}' )
            // InternalKerMLExpressions.g:5271:2: '}'
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
    // InternalKerMLExpressions.g:5281:1: rule__SequenceConstructionExpression__Group_1__0 : rule__SequenceConstructionExpression__Group_1__0__Impl rule__SequenceConstructionExpression__Group_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5285:1: ( rule__SequenceConstructionExpression__Group_1__0__Impl rule__SequenceConstructionExpression__Group_1__1 )
            // InternalKerMLExpressions.g:5286:2: rule__SequenceConstructionExpression__Group_1__0__Impl rule__SequenceConstructionExpression__Group_1__1
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
    // InternalKerMLExpressions.g:5293:1: rule__SequenceConstructionExpression__Group_1__0__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5297:1: ( ( '{' ) )
            // InternalKerMLExpressions.g:5298:1: ( '{' )
            {
            // InternalKerMLExpressions.g:5298:1: ( '{' )
            // InternalKerMLExpressions.g:5299:2: '{'
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
    // InternalKerMLExpressions.g:5308:1: rule__SequenceConstructionExpression__Group_1__1 : rule__SequenceConstructionExpression__Group_1__1__Impl rule__SequenceConstructionExpression__Group_1__2 ;
    public final void rule__SequenceConstructionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5312:1: ( rule__SequenceConstructionExpression__Group_1__1__Impl rule__SequenceConstructionExpression__Group_1__2 )
            // InternalKerMLExpressions.g:5313:2: rule__SequenceConstructionExpression__Group_1__1__Impl rule__SequenceConstructionExpression__Group_1__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalKerMLExpressions.g:5320:1: rule__SequenceConstructionExpression__Group_1__1__Impl : ( ruleOwnedExpression ) ;
    public final void rule__SequenceConstructionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5324:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:5325:1: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:5325:1: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:5326:2: ruleOwnedExpression
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
    // InternalKerMLExpressions.g:5335:1: rule__SequenceConstructionExpression__Group_1__2 : rule__SequenceConstructionExpression__Group_1__2__Impl rule__SequenceConstructionExpression__Group_1__3 ;
    public final void rule__SequenceConstructionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5339:1: ( rule__SequenceConstructionExpression__Group_1__2__Impl rule__SequenceConstructionExpression__Group_1__3 )
            // InternalKerMLExpressions.g:5340:2: rule__SequenceConstructionExpression__Group_1__2__Impl rule__SequenceConstructionExpression__Group_1__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalKerMLExpressions.g:5347:1: rule__SequenceConstructionExpression__Group_1__2__Impl : ( ( rule__SequenceConstructionExpression__Alternatives_1_2 )? ) ;
    public final void rule__SequenceConstructionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5351:1: ( ( ( rule__SequenceConstructionExpression__Alternatives_1_2 )? ) )
            // InternalKerMLExpressions.g:5352:1: ( ( rule__SequenceConstructionExpression__Alternatives_1_2 )? )
            {
            // InternalKerMLExpressions.g:5352:1: ( ( rule__SequenceConstructionExpression__Alternatives_1_2 )? )
            // InternalKerMLExpressions.g:5353:2: ( rule__SequenceConstructionExpression__Alternatives_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getAlternatives_1_2()); 
            }
            // InternalKerMLExpressions.g:5354:2: ( rule__SequenceConstructionExpression__Alternatives_1_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49||LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKerMLExpressions.g:5354:3: rule__SequenceConstructionExpression__Alternatives_1_2
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
    // InternalKerMLExpressions.g:5362:1: rule__SequenceConstructionExpression__Group_1__3 : rule__SequenceConstructionExpression__Group_1__3__Impl ;
    public final void rule__SequenceConstructionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5366:1: ( rule__SequenceConstructionExpression__Group_1__3__Impl )
            // InternalKerMLExpressions.g:5367:2: rule__SequenceConstructionExpression__Group_1__3__Impl
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
    // InternalKerMLExpressions.g:5373:1: rule__SequenceConstructionExpression__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5377:1: ( ( '}' ) )
            // InternalKerMLExpressions.g:5378:1: ( '}' )
            {
            // InternalKerMLExpressions.g:5378:1: ( '}' )
            // InternalKerMLExpressions.g:5379:2: '}'
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
    // InternalKerMLExpressions.g:5389:1: rule__SequenceConstructionExpression__Group_1_2_0__0 : rule__SequenceConstructionExpression__Group_1_2_0__0__Impl rule__SequenceConstructionExpression__Group_1_2_0__1 ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5393:1: ( rule__SequenceConstructionExpression__Group_1_2_0__0__Impl rule__SequenceConstructionExpression__Group_1_2_0__1 )
            // InternalKerMLExpressions.g:5394:2: rule__SequenceConstructionExpression__Group_1_2_0__0__Impl rule__SequenceConstructionExpression__Group_1_2_0__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalKerMLExpressions.g:5401:1: rule__SequenceConstructionExpression__Group_1_2_0__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5405:1: ( ( () ) )
            // InternalKerMLExpressions.g:5406:1: ( () )
            {
            // InternalKerMLExpressions.g:5406:1: ( () )
            // InternalKerMLExpressions.g:5407:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperand_compAction_1_2_0_0()); 
            }
            // InternalKerMLExpressions.g:5408:2: ()
            // InternalKerMLExpressions.g:5408:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperand_compAction_1_2_0_0()); 
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
    // InternalKerMLExpressions.g:5416:1: rule__SequenceConstructionExpression__Group_1_2_0__1 : rule__SequenceConstructionExpression__Group_1_2_0__1__Impl rule__SequenceConstructionExpression__Group_1_2_0__2 ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5420:1: ( rule__SequenceConstructionExpression__Group_1_2_0__1__Impl rule__SequenceConstructionExpression__Group_1_2_0__2 )
            // InternalKerMLExpressions.g:5421:2: rule__SequenceConstructionExpression__Group_1_2_0__1__Impl rule__SequenceConstructionExpression__Group_1_2_0__2
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
    // InternalKerMLExpressions.g:5428:1: rule__SequenceConstructionExpression__Group_1_2_0__1__Impl : ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5432:1: ( ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 ) ) )
            // InternalKerMLExpressions.g:5433:1: ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 ) )
            {
            // InternalKerMLExpressions.g:5433:1: ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 ) )
            // InternalKerMLExpressions.g:5434:2: ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorAssignment_1_2_0_1()); 
            }
            // InternalKerMLExpressions.g:5435:2: ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 )
            // InternalKerMLExpressions.g:5435:3: rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1
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
    // InternalKerMLExpressions.g:5443:1: rule__SequenceConstructionExpression__Group_1_2_0__2 : rule__SequenceConstructionExpression__Group_1_2_0__2__Impl ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5447:1: ( rule__SequenceConstructionExpression__Group_1_2_0__2__Impl )
            // InternalKerMLExpressions.g:5448:2: rule__SequenceConstructionExpression__Group_1_2_0__2__Impl
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
    // InternalKerMLExpressions.g:5454:1: rule__SequenceConstructionExpression__Group_1_2_0__2__Impl : ( ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5458:1: ( ( ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2 ) ) )
            // InternalKerMLExpressions.g:5459:1: ( ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2 ) )
            {
            // InternalKerMLExpressions.g:5459:1: ( ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2 ) )
            // InternalKerMLExpressions.g:5460:2: ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compAssignment_1_2_0_2()); 
            }
            // InternalKerMLExpressions.g:5461:2: ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2 )
            // InternalKerMLExpressions.g:5461:3: rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compAssignment_1_2_0_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5470:1: rule__SequenceConstructionExpression__Group_1_2_1__0 : rule__SequenceConstructionExpression__Group_1_2_1__0__Impl rule__SequenceConstructionExpression__Group_1_2_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5474:1: ( rule__SequenceConstructionExpression__Group_1_2_1__0__Impl rule__SequenceConstructionExpression__Group_1_2_1__1 )
            // InternalKerMLExpressions.g:5475:2: rule__SequenceConstructionExpression__Group_1_2_1__0__Impl rule__SequenceConstructionExpression__Group_1_2_1__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalKerMLExpressions.g:5482:1: rule__SequenceConstructionExpression__Group_1_2_1__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5486:1: ( ( () ) )
            // InternalKerMLExpressions.g:5487:1: ( () )
            {
            // InternalKerMLExpressions.g:5487:1: ( () )
            // InternalKerMLExpressions.g:5488:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperand_compAction_1_2_1_0()); 
            }
            // InternalKerMLExpressions.g:5489:2: ()
            // InternalKerMLExpressions.g:5489:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorExpressionOperand_compAction_1_2_1_0()); 
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
    // InternalKerMLExpressions.g:5497:1: rule__SequenceConstructionExpression__Group_1_2_1__1 : rule__SequenceConstructionExpression__Group_1_2_1__1__Impl rule__SequenceConstructionExpression__Group_1_2_1__2 ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5501:1: ( rule__SequenceConstructionExpression__Group_1_2_1__1__Impl rule__SequenceConstructionExpression__Group_1_2_1__2 )
            // InternalKerMLExpressions.g:5502:2: rule__SequenceConstructionExpression__Group_1_2_1__1__Impl rule__SequenceConstructionExpression__Group_1_2_1__2
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
    // InternalKerMLExpressions.g:5509:1: rule__SequenceConstructionExpression__Group_1_2_1__1__Impl : ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5513:1: ( ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 ) ) )
            // InternalKerMLExpressions.g:5514:1: ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 ) )
            {
            // InternalKerMLExpressions.g:5514:1: ( ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 ) )
            // InternalKerMLExpressions.g:5515:2: ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorAssignment_1_2_1_1()); 
            }
            // InternalKerMLExpressions.g:5516:2: ( rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 )
            // InternalKerMLExpressions.g:5516:3: rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1
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
    // InternalKerMLExpressions.g:5524:1: rule__SequenceConstructionExpression__Group_1_2_1__2 : rule__SequenceConstructionExpression__Group_1_2_1__2__Impl ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5528:1: ( rule__SequenceConstructionExpression__Group_1_2_1__2__Impl )
            // InternalKerMLExpressions.g:5529:2: rule__SequenceConstructionExpression__Group_1_2_1__2__Impl
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
    // InternalKerMLExpressions.g:5535:1: rule__SequenceConstructionExpression__Group_1_2_1__2__Impl : ( ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_1_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5539:1: ( ( ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2 ) ) )
            // InternalKerMLExpressions.g:5540:1: ( ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2 ) )
            {
            // InternalKerMLExpressions.g:5540:1: ( ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2 ) )
            // InternalKerMLExpressions.g:5541:2: ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compAssignment_1_2_1_2()); 
            }
            // InternalKerMLExpressions.g:5542:2: ( rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2 )
            // InternalKerMLExpressions.g:5542:3: rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compAssignment_1_2_1_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5551:1: rule__SequenceElementList__Group__0 : rule__SequenceElementList__Group__0__Impl rule__SequenceElementList__Group__1 ;
    public final void rule__SequenceElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5555:1: ( rule__SequenceElementList__Group__0__Impl rule__SequenceElementList__Group__1 )
            // InternalKerMLExpressions.g:5556:2: rule__SequenceElementList__Group__0__Impl rule__SequenceElementList__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalKerMLExpressions.g:5563:1: rule__SequenceElementList__Group__0__Impl : ( ruleOwnedExpression ) ;
    public final void rule__SequenceElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5567:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:5568:1: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:5568:1: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:5569:2: ruleOwnedExpression
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
    // InternalKerMLExpressions.g:5578:1: rule__SequenceElementList__Group__1 : rule__SequenceElementList__Group__1__Impl ;
    public final void rule__SequenceElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5582:1: ( rule__SequenceElementList__Group__1__Impl )
            // InternalKerMLExpressions.g:5583:2: rule__SequenceElementList__Group__1__Impl
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
    // InternalKerMLExpressions.g:5589:1: rule__SequenceElementList__Group__1__Impl : ( ( rule__SequenceElementList__Group_1__0 )? ) ;
    public final void rule__SequenceElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5593:1: ( ( ( rule__SequenceElementList__Group_1__0 )? ) )
            // InternalKerMLExpressions.g:5594:1: ( ( rule__SequenceElementList__Group_1__0 )? )
            {
            // InternalKerMLExpressions.g:5594:1: ( ( rule__SequenceElementList__Group_1__0 )? )
            // InternalKerMLExpressions.g:5595:2: ( rule__SequenceElementList__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:5596:2: ( rule__SequenceElementList__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKerMLExpressions.g:5596:3: rule__SequenceElementList__Group_1__0
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
    // InternalKerMLExpressions.g:5605:1: rule__SequenceElementList__Group_1__0 : rule__SequenceElementList__Group_1__0__Impl rule__SequenceElementList__Group_1__1 ;
    public final void rule__SequenceElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5609:1: ( rule__SequenceElementList__Group_1__0__Impl rule__SequenceElementList__Group_1__1 )
            // InternalKerMLExpressions.g:5610:2: rule__SequenceElementList__Group_1__0__Impl rule__SequenceElementList__Group_1__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalKerMLExpressions.g:5617:1: rule__SequenceElementList__Group_1__0__Impl : ( () ) ;
    public final void rule__SequenceElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5621:1: ( ( () ) )
            // InternalKerMLExpressions.g:5622:1: ( () )
            {
            // InternalKerMLExpressions.g:5622:1: ( () )
            // InternalKerMLExpressions.g:5623:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperatorExpressionOperand_compAction_1_0()); 
            }
            // InternalKerMLExpressions.g:5624:2: ()
            // InternalKerMLExpressions.g:5624:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperatorExpressionOperand_compAction_1_0()); 
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
    // InternalKerMLExpressions.g:5632:1: rule__SequenceElementList__Group_1__1 : rule__SequenceElementList__Group_1__1__Impl rule__SequenceElementList__Group_1__2 ;
    public final void rule__SequenceElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5636:1: ( rule__SequenceElementList__Group_1__1__Impl rule__SequenceElementList__Group_1__2 )
            // InternalKerMLExpressions.g:5637:2: rule__SequenceElementList__Group_1__1__Impl rule__SequenceElementList__Group_1__2
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
    // InternalKerMLExpressions.g:5644:1: rule__SequenceElementList__Group_1__1__Impl : ( ( rule__SequenceElementList__OperatorAssignment_1_1 ) ) ;
    public final void rule__SequenceElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5648:1: ( ( ( rule__SequenceElementList__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:5649:1: ( ( rule__SequenceElementList__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:5649:1: ( ( rule__SequenceElementList__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:5650:2: ( rule__SequenceElementList__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:5651:2: ( rule__SequenceElementList__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:5651:3: rule__SequenceElementList__OperatorAssignment_1_1
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
    // InternalKerMLExpressions.g:5659:1: rule__SequenceElementList__Group_1__2 : rule__SequenceElementList__Group_1__2__Impl ;
    public final void rule__SequenceElementList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5663:1: ( rule__SequenceElementList__Group_1__2__Impl )
            // InternalKerMLExpressions.g:5664:2: rule__SequenceElementList__Group_1__2__Impl
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
    // InternalKerMLExpressions.g:5670:1: rule__SequenceElementList__Group_1__2__Impl : ( ( rule__SequenceElementList__Operand_compAssignment_1_2 ) ) ;
    public final void rule__SequenceElementList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5674:1: ( ( ( rule__SequenceElementList__Operand_compAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:5675:1: ( ( rule__SequenceElementList__Operand_compAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:5675:1: ( ( rule__SequenceElementList__Operand_compAssignment_1_2 ) )
            // InternalKerMLExpressions.g:5676:2: ( rule__SequenceElementList__Operand_compAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperand_compAssignment_1_2()); 
            }
            // InternalKerMLExpressions.g:5677:2: ( rule__SequenceElementList__Operand_compAssignment_1_2 )
            // InternalKerMLExpressions.g:5677:3: rule__SequenceElementList__Operand_compAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceElementList__Operand_compAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperand_compAssignment_1_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__BaseExpression__Group_5__0"
    // InternalKerMLExpressions.g:5686:1: rule__BaseExpression__Group_5__0 : rule__BaseExpression__Group_5__0__Impl rule__BaseExpression__Group_5__1 ;
    public final void rule__BaseExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5690:1: ( rule__BaseExpression__Group_5__0__Impl rule__BaseExpression__Group_5__1 )
            // InternalKerMLExpressions.g:5691:2: rule__BaseExpression__Group_5__0__Impl rule__BaseExpression__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__BaseExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_5__1();

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
    // $ANTLR end "rule__BaseExpression__Group_5__0"


    // $ANTLR start "rule__BaseExpression__Group_5__0__Impl"
    // InternalKerMLExpressions.g:5698:1: rule__BaseExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__BaseExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5702:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:5703:1: ( '(' )
            {
            // InternalKerMLExpressions.g:5703:1: ( '(' )
            // InternalKerMLExpressions.g:5704:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_5__0__Impl"


    // $ANTLR start "rule__BaseExpression__Group_5__1"
    // InternalKerMLExpressions.g:5713:1: rule__BaseExpression__Group_5__1 : rule__BaseExpression__Group_5__1__Impl rule__BaseExpression__Group_5__2 ;
    public final void rule__BaseExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5717:1: ( rule__BaseExpression__Group_5__1__Impl rule__BaseExpression__Group_5__2 )
            // InternalKerMLExpressions.g:5718:2: rule__BaseExpression__Group_5__1__Impl rule__BaseExpression__Group_5__2
            {
            pushFollow(FOLLOW_37);
            rule__BaseExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_5__2();

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
    // $ANTLR end "rule__BaseExpression__Group_5__1"


    // $ANTLR start "rule__BaseExpression__Group_5__1__Impl"
    // InternalKerMLExpressions.g:5725:1: rule__BaseExpression__Group_5__1__Impl : ( ruleOwnedExpression ) ;
    public final void rule__BaseExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5729:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:5730:1: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:5730:1: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:5731:2: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionAccess().getOwnedExpressionParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionAccess().getOwnedExpressionParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_5__1__Impl"


    // $ANTLR start "rule__BaseExpression__Group_5__2"
    // InternalKerMLExpressions.g:5740:1: rule__BaseExpression__Group_5__2 : rule__BaseExpression__Group_5__2__Impl ;
    public final void rule__BaseExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5744:1: ( rule__BaseExpression__Group_5__2__Impl )
            // InternalKerMLExpressions.g:5745:2: rule__BaseExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_5__2__Impl();

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
    // $ANTLR end "rule__BaseExpression__Group_5__2"


    // $ANTLR start "rule__BaseExpression__Group_5__2__Impl"
    // InternalKerMLExpressions.g:5751:1: rule__BaseExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__BaseExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5755:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:5756:1: ( ')' )
            {
            // InternalKerMLExpressions.g:5756:1: ( ')' )
            // InternalKerMLExpressions.g:5757:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_5__2__Impl"


    // $ANTLR start "rule__InvocationExpression__Group__0"
    // InternalKerMLExpressions.g:5767:1: rule__InvocationExpression__Group__0 : rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1 ;
    public final void rule__InvocationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5771:1: ( rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1 )
            // InternalKerMLExpressions.g:5772:2: rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalKerMLExpressions.g:5779:1: rule__InvocationExpression__Group__0__Impl : ( ( rule__InvocationExpression__OwnedRelationship_compAssignment_0 ) ) ;
    public final void rule__InvocationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5783:1: ( ( ( rule__InvocationExpression__OwnedRelationship_compAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5784:1: ( ( rule__InvocationExpression__OwnedRelationship_compAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5784:1: ( ( rule__InvocationExpression__OwnedRelationship_compAssignment_0 ) )
            // InternalKerMLExpressions.g:5785:2: ( rule__InvocationExpression__OwnedRelationship_compAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getOwnedRelationship_compAssignment_0()); 
            }
            // InternalKerMLExpressions.g:5786:2: ( rule__InvocationExpression__OwnedRelationship_compAssignment_0 )
            // InternalKerMLExpressions.g:5786:3: rule__InvocationExpression__OwnedRelationship_compAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__OwnedRelationship_compAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionAccess().getOwnedRelationship_compAssignment_0()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5794:1: rule__InvocationExpression__Group__1 : rule__InvocationExpression__Group__1__Impl rule__InvocationExpression__Group__2 ;
    public final void rule__InvocationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5798:1: ( rule__InvocationExpression__Group__1__Impl rule__InvocationExpression__Group__2 )
            // InternalKerMLExpressions.g:5799:2: rule__InvocationExpression__Group__1__Impl rule__InvocationExpression__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalKerMLExpressions.g:5806:1: rule__InvocationExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__InvocationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5810:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:5811:1: ( '(' )
            {
            // InternalKerMLExpressions.g:5811:1: ( '(' )
            // InternalKerMLExpressions.g:5812:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalKerMLExpressions.g:5821:1: rule__InvocationExpression__Group__2 : rule__InvocationExpression__Group__2__Impl rule__InvocationExpression__Group__3 ;
    public final void rule__InvocationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5825:1: ( rule__InvocationExpression__Group__2__Impl rule__InvocationExpression__Group__3 )
            // InternalKerMLExpressions.g:5826:2: rule__InvocationExpression__Group__2__Impl rule__InvocationExpression__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalKerMLExpressions.g:5833:1: rule__InvocationExpression__Group__2__Impl : ( ( ruleArgumentList )? ) ;
    public final void rule__InvocationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5837:1: ( ( ( ruleArgumentList )? ) )
            // InternalKerMLExpressions.g:5838:1: ( ( ruleArgumentList )? )
            {
            // InternalKerMLExpressions.g:5838:1: ( ( ruleArgumentList )? )
            // InternalKerMLExpressions.g:5839:2: ( ruleArgumentList )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getArgumentListParserRuleCall_2()); 
            }
            // InternalKerMLExpressions.g:5840:2: ( ruleArgumentList )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==EOF||(LA42_0>=RULE_EXP_VALUE && LA42_0<=RULE_STRING_VALUE)||(LA42_0>=24 && LA42_0<=27)||(LA42_0>=32 && LA42_0<=34)||(LA42_0>=37 && LA42_0<=40)||(LA42_0>=43 && LA42_0<=44)||LA42_0==47||LA42_0==51||LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKerMLExpressions.g:5840:3: ruleArgumentList
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
    // InternalKerMLExpressions.g:5848:1: rule__InvocationExpression__Group__3 : rule__InvocationExpression__Group__3__Impl ;
    public final void rule__InvocationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5852:1: ( rule__InvocationExpression__Group__3__Impl )
            // InternalKerMLExpressions.g:5853:2: rule__InvocationExpression__Group__3__Impl
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
    // InternalKerMLExpressions.g:5859:1: rule__InvocationExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__InvocationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5863:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:5864:1: ( ')' )
            {
            // InternalKerMLExpressions.g:5864:1: ( ')' )
            // InternalKerMLExpressions.g:5865:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalKerMLExpressions.g:5875:1: rule__PositionalArgumentList__Group__0 : rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1 ;
    public final void rule__PositionalArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5879:1: ( rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1 )
            // InternalKerMLExpressions.g:5880:2: rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalKerMLExpressions.g:5887:1: rule__PositionalArgumentList__Group__0__Impl : ( ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0 ) ) ;
    public final void rule__PositionalArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5891:1: ( ( ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5892:1: ( ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5892:1: ( ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0 ) )
            // InternalKerMLExpressions.g:5893:2: ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compAssignment_0()); 
            }
            // InternalKerMLExpressions.g:5894:2: ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0 )
            // InternalKerMLExpressions.g:5894:3: rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compAssignment_0()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5902:1: rule__PositionalArgumentList__Group__1 : rule__PositionalArgumentList__Group__1__Impl ;
    public final void rule__PositionalArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5906:1: ( rule__PositionalArgumentList__Group__1__Impl )
            // InternalKerMLExpressions.g:5907:2: rule__PositionalArgumentList__Group__1__Impl
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
    // InternalKerMLExpressions.g:5913:1: rule__PositionalArgumentList__Group__1__Impl : ( ( rule__PositionalArgumentList__Group_1__0 )* ) ;
    public final void rule__PositionalArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5917:1: ( ( ( rule__PositionalArgumentList__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:5918:1: ( ( rule__PositionalArgumentList__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:5918:1: ( ( rule__PositionalArgumentList__Group_1__0 )* )
            // InternalKerMLExpressions.g:5919:2: ( rule__PositionalArgumentList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:5920:2: ( rule__PositionalArgumentList__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==49) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKerMLExpressions.g:5920:3: rule__PositionalArgumentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__PositionalArgumentList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalKerMLExpressions.g:5929:1: rule__PositionalArgumentList__Group_1__0 : rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1 ;
    public final void rule__PositionalArgumentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5933:1: ( rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1 )
            // InternalKerMLExpressions.g:5934:2: rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1
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
    // InternalKerMLExpressions.g:5941:1: rule__PositionalArgumentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__PositionalArgumentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5945:1: ( ( ',' ) )
            // InternalKerMLExpressions.g:5946:1: ( ',' )
            {
            // InternalKerMLExpressions.g:5946:1: ( ',' )
            // InternalKerMLExpressions.g:5947:2: ','
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
    // InternalKerMLExpressions.g:5956:1: rule__PositionalArgumentList__Group_1__1 : rule__PositionalArgumentList__Group_1__1__Impl ;
    public final void rule__PositionalArgumentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5960:1: ( rule__PositionalArgumentList__Group_1__1__Impl )
            // InternalKerMLExpressions.g:5961:2: rule__PositionalArgumentList__Group_1__1__Impl
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
    // InternalKerMLExpressions.g:5967:1: rule__PositionalArgumentList__Group_1__1__Impl : ( ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1 ) ) ;
    public final void rule__PositionalArgumentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5971:1: ( ( ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:5972:1: ( ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:5972:1: ( ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1 ) )
            // InternalKerMLExpressions.g:5973:2: ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:5974:2: ( rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1 )
            // InternalKerMLExpressions.g:5974:3: rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compAssignment_1_1()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:5983:1: rule__NamedArgumentList__Group__0 : rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1 ;
    public final void rule__NamedArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5987:1: ( rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1 )
            // InternalKerMLExpressions.g:5988:2: rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalKerMLExpressions.g:5995:1: rule__NamedArgumentList__Group__0__Impl : ( ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0 ) ) ;
    public final void rule__NamedArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5999:1: ( ( ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0 ) ) )
            // InternalKerMLExpressions.g:6000:1: ( ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:6000:1: ( ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0 ) )
            // InternalKerMLExpressions.g:6001:2: ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compAssignment_0()); 
            }
            // InternalKerMLExpressions.g:6002:2: ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0 )
            // InternalKerMLExpressions.g:6002:3: rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compAssignment_0()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:6010:1: rule__NamedArgumentList__Group__1 : rule__NamedArgumentList__Group__1__Impl ;
    public final void rule__NamedArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6014:1: ( rule__NamedArgumentList__Group__1__Impl )
            // InternalKerMLExpressions.g:6015:2: rule__NamedArgumentList__Group__1__Impl
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
    // InternalKerMLExpressions.g:6021:1: rule__NamedArgumentList__Group__1__Impl : ( ( rule__NamedArgumentList__Group_1__0 )* ) ;
    public final void rule__NamedArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6025:1: ( ( ( rule__NamedArgumentList__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:6026:1: ( ( rule__NamedArgumentList__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:6026:1: ( ( rule__NamedArgumentList__Group_1__0 )* )
            // InternalKerMLExpressions.g:6027:2: ( rule__NamedArgumentList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:6028:2: ( rule__NamedArgumentList__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==49) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalKerMLExpressions.g:6028:3: rule__NamedArgumentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__NamedArgumentList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalKerMLExpressions.g:6037:1: rule__NamedArgumentList__Group_1__0 : rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1 ;
    public final void rule__NamedArgumentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6041:1: ( rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1 )
            // InternalKerMLExpressions.g:6042:2: rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1
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
    // InternalKerMLExpressions.g:6049:1: rule__NamedArgumentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__NamedArgumentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6053:1: ( ( ',' ) )
            // InternalKerMLExpressions.g:6054:1: ( ',' )
            {
            // InternalKerMLExpressions.g:6054:1: ( ',' )
            // InternalKerMLExpressions.g:6055:2: ','
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
    // InternalKerMLExpressions.g:6064:1: rule__NamedArgumentList__Group_1__1 : rule__NamedArgumentList__Group_1__1__Impl ;
    public final void rule__NamedArgumentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6068:1: ( rule__NamedArgumentList__Group_1__1__Impl )
            // InternalKerMLExpressions.g:6069:2: rule__NamedArgumentList__Group_1__1__Impl
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
    // InternalKerMLExpressions.g:6075:1: rule__NamedArgumentList__Group_1__1__Impl : ( ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1 ) ) ;
    public final void rule__NamedArgumentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6079:1: ( ( ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:6080:1: ( ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:6080:1: ( ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1 ) )
            // InternalKerMLExpressions.g:6081:2: ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compAssignment_1_1()); 
            }
            // InternalKerMLExpressions.g:6082:2: ( rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1 )
            // InternalKerMLExpressions.g:6082:3: rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compAssignment_1_1()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:6091:1: rule__NamedExpressionMember__Group__0 : rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1 ;
    public final void rule__NamedExpressionMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6095:1: ( rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1 )
            // InternalKerMLExpressions.g:6096:2: rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalKerMLExpressions.g:6103:1: rule__NamedExpressionMember__Group__0__Impl : ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) ) ;
    public final void rule__NamedExpressionMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6107:1: ( ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) ) )
            // InternalKerMLExpressions.g:6108:1: ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:6108:1: ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) )
            // InternalKerMLExpressions.g:6109:2: ( rule__NamedExpressionMember__MemberNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getMemberNameAssignment_0()); 
            }
            // InternalKerMLExpressions.g:6110:2: ( rule__NamedExpressionMember__MemberNameAssignment_0 )
            // InternalKerMLExpressions.g:6110:3: rule__NamedExpressionMember__MemberNameAssignment_0
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
    // InternalKerMLExpressions.g:6118:1: rule__NamedExpressionMember__Group__1 : rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2 ;
    public final void rule__NamedExpressionMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6122:1: ( rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2 )
            // InternalKerMLExpressions.g:6123:2: rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2
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
    // InternalKerMLExpressions.g:6130:1: rule__NamedExpressionMember__Group__1__Impl : ( '=>' ) ;
    public final void rule__NamedExpressionMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6134:1: ( ( '=>' ) )
            // InternalKerMLExpressions.g:6135:1: ( '=>' )
            {
            // InternalKerMLExpressions.g:6135:1: ( '=>' )
            // InternalKerMLExpressions.g:6136:2: '=>'
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
    // InternalKerMLExpressions.g:6145:1: rule__NamedExpressionMember__Group__2 : rule__NamedExpressionMember__Group__2__Impl ;
    public final void rule__NamedExpressionMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6149:1: ( rule__NamedExpressionMember__Group__2__Impl )
            // InternalKerMLExpressions.g:6150:2: rule__NamedExpressionMember__Group__2__Impl
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
    // InternalKerMLExpressions.g:6156:1: rule__NamedExpressionMember__Group__2__Impl : ( ( rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2 ) ) ;
    public final void rule__NamedExpressionMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6160:1: ( ( ( rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2 ) ) )
            // InternalKerMLExpressions.g:6161:1: ( ( rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2 ) )
            {
            // InternalKerMLExpressions.g:6161:1: ( ( rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2 ) )
            // InternalKerMLExpressions.g:6162:2: ( rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getOwnedMemberFeature_compAssignment_2()); 
            }
            // InternalKerMLExpressions.g:6163:2: ( rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2 )
            // InternalKerMLExpressions.g:6163:3: rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberAccess().getOwnedMemberFeature_compAssignment_2()); 
            }

            }


            }

        }
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
    // InternalKerMLExpressions.g:6172:1: rule__NullExpression__Group__0 : rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1 ;
    public final void rule__NullExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6176:1: ( rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1 )
            // InternalKerMLExpressions.g:6177:2: rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalKerMLExpressions.g:6184:1: rule__NullExpression__Group__0__Impl : ( () ) ;
    public final void rule__NullExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6188:1: ( ( () ) )
            // InternalKerMLExpressions.g:6189:1: ( () )
            {
            // InternalKerMLExpressions.g:6189:1: ( () )
            // InternalKerMLExpressions.g:6190:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullExpressionAccess().getNullExpressionAction_0()); 
            }
            // InternalKerMLExpressions.g:6191:2: ()
            // InternalKerMLExpressions.g:6191:3: 
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
    // InternalKerMLExpressions.g:6199:1: rule__NullExpression__Group__1 : rule__NullExpression__Group__1__Impl ;
    public final void rule__NullExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6203:1: ( rule__NullExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:6204:2: rule__NullExpression__Group__1__Impl
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
    // InternalKerMLExpressions.g:6210:1: rule__NullExpression__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6214:1: ( ( 'null' ) )
            // InternalKerMLExpressions.g:6215:1: ( 'null' )
            {
            // InternalKerMLExpressions.g:6215:1: ( 'null' )
            // InternalKerMLExpressions.g:6216:2: 'null'
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
    // InternalKerMLExpressions.g:6226:1: rule__RealValue__Group_0__0 : rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 ;
    public final void rule__RealValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6230:1: ( rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 )
            // InternalKerMLExpressions.g:6231:2: rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalKerMLExpressions.g:6238:1: rule__RealValue__Group_0__0__Impl : ( ( RULE_DECIMAL_VALUE )? ) ;
    public final void rule__RealValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6242:1: ( ( ( RULE_DECIMAL_VALUE )? ) )
            // InternalKerMLExpressions.g:6243:1: ( ( RULE_DECIMAL_VALUE )? )
            {
            // InternalKerMLExpressions.g:6243:1: ( ( RULE_DECIMAL_VALUE )? )
            // InternalKerMLExpressions.g:6244:2: ( RULE_DECIMAL_VALUE )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0()); 
            }
            // InternalKerMLExpressions.g:6245:2: ( RULE_DECIMAL_VALUE )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DECIMAL_VALUE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKerMLExpressions.g:6245:3: RULE_DECIMAL_VALUE
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
    // InternalKerMLExpressions.g:6253:1: rule__RealValue__Group_0__1 : rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2 ;
    public final void rule__RealValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6257:1: ( rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2 )
            // InternalKerMLExpressions.g:6258:2: rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalKerMLExpressions.g:6265:1: rule__RealValue__Group_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6269:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:6270:1: ( '.' )
            {
            // InternalKerMLExpressions.g:6270:1: ( '.' )
            // InternalKerMLExpressions.g:6271:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalKerMLExpressions.g:6280:1: rule__RealValue__Group_0__2 : rule__RealValue__Group_0__2__Impl ;
    public final void rule__RealValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6284:1: ( rule__RealValue__Group_0__2__Impl )
            // InternalKerMLExpressions.g:6285:2: rule__RealValue__Group_0__2__Impl
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
    // InternalKerMLExpressions.g:6291:1: rule__RealValue__Group_0__2__Impl : ( ( rule__RealValue__Alternatives_0_2 ) ) ;
    public final void rule__RealValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6295:1: ( ( ( rule__RealValue__Alternatives_0_2 ) ) )
            // InternalKerMLExpressions.g:6296:1: ( ( rule__RealValue__Alternatives_0_2 ) )
            {
            // InternalKerMLExpressions.g:6296:1: ( ( rule__RealValue__Alternatives_0_2 ) )
            // InternalKerMLExpressions.g:6297:2: ( rule__RealValue__Alternatives_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getAlternatives_0_2()); 
            }
            // InternalKerMLExpressions.g:6298:2: ( rule__RealValue__Alternatives_0_2 )
            // InternalKerMLExpressions.g:6298:3: rule__RealValue__Alternatives_0_2
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
    // InternalKerMLExpressions.g:6307:1: rule__LiteralUnbounded__Group__0 : rule__LiteralUnbounded__Group__0__Impl rule__LiteralUnbounded__Group__1 ;
    public final void rule__LiteralUnbounded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6311:1: ( rule__LiteralUnbounded__Group__0__Impl rule__LiteralUnbounded__Group__1 )
            // InternalKerMLExpressions.g:6312:2: rule__LiteralUnbounded__Group__0__Impl rule__LiteralUnbounded__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalKerMLExpressions.g:6319:1: rule__LiteralUnbounded__Group__0__Impl : ( () ) ;
    public final void rule__LiteralUnbounded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6323:1: ( ( () ) )
            // InternalKerMLExpressions.g:6324:1: ( () )
            {
            // InternalKerMLExpressions.g:6324:1: ( () )
            // InternalKerMLExpressions.g:6325:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralUnboundedAccess().getLiteralUnboundedAction_0()); 
            }
            // InternalKerMLExpressions.g:6326:2: ()
            // InternalKerMLExpressions.g:6326:3: 
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
    // InternalKerMLExpressions.g:6334:1: rule__LiteralUnbounded__Group__1 : rule__LiteralUnbounded__Group__1__Impl ;
    public final void rule__LiteralUnbounded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6338:1: ( rule__LiteralUnbounded__Group__1__Impl )
            // InternalKerMLExpressions.g:6339:2: rule__LiteralUnbounded__Group__1__Impl
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
    // InternalKerMLExpressions.g:6345:1: rule__LiteralUnbounded__Group__1__Impl : ( '*' ) ;
    public final void rule__LiteralUnbounded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6349:1: ( ( '*' ) )
            // InternalKerMLExpressions.g:6350:1: ( '*' )
            {
            // InternalKerMLExpressions.g:6350:1: ( '*' )
            // InternalKerMLExpressions.g:6351:2: '*'
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


    // $ANTLR start "rule__ColonQualifiedName__Group__0"
    // InternalKerMLExpressions.g:6361:1: rule__ColonQualifiedName__Group__0 : rule__ColonQualifiedName__Group__0__Impl rule__ColonQualifiedName__Group__1 ;
    public final void rule__ColonQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6365:1: ( rule__ColonQualifiedName__Group__0__Impl rule__ColonQualifiedName__Group__1 )
            // InternalKerMLExpressions.g:6366:2: rule__ColonQualifiedName__Group__0__Impl rule__ColonQualifiedName__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__ColonQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColonQualifiedName__Group__1();

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
    // $ANTLR end "rule__ColonQualifiedName__Group__0"


    // $ANTLR start "rule__ColonQualifiedName__Group__0__Impl"
    // InternalKerMLExpressions.g:6373:1: rule__ColonQualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__ColonQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6377:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6378:1: ( ruleName )
            {
            // InternalKerMLExpressions.g:6378:1: ( ruleName )
            // InternalKerMLExpressions.g:6379:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColonQualifiedName__Group__0__Impl"


    // $ANTLR start "rule__ColonQualifiedName__Group__1"
    // InternalKerMLExpressions.g:6388:1: rule__ColonQualifiedName__Group__1 : rule__ColonQualifiedName__Group__1__Impl ;
    public final void rule__ColonQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6392:1: ( rule__ColonQualifiedName__Group__1__Impl )
            // InternalKerMLExpressions.g:6393:2: rule__ColonQualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColonQualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__ColonQualifiedName__Group__1"


    // $ANTLR start "rule__ColonQualifiedName__Group__1__Impl"
    // InternalKerMLExpressions.g:6399:1: rule__ColonQualifiedName__Group__1__Impl : ( ( ( rule__ColonQualifiedName__Group_1__0 ) ) ( ( rule__ColonQualifiedName__Group_1__0 )* ) ) ;
    public final void rule__ColonQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6403:1: ( ( ( ( rule__ColonQualifiedName__Group_1__0 ) ) ( ( rule__ColonQualifiedName__Group_1__0 )* ) ) )
            // InternalKerMLExpressions.g:6404:1: ( ( ( rule__ColonQualifiedName__Group_1__0 ) ) ( ( rule__ColonQualifiedName__Group_1__0 )* ) )
            {
            // InternalKerMLExpressions.g:6404:1: ( ( ( rule__ColonQualifiedName__Group_1__0 ) ) ( ( rule__ColonQualifiedName__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:6405:2: ( ( rule__ColonQualifiedName__Group_1__0 ) ) ( ( rule__ColonQualifiedName__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:6405:2: ( ( rule__ColonQualifiedName__Group_1__0 ) )
            // InternalKerMLExpressions.g:6406:3: ( rule__ColonQualifiedName__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColonQualifiedNameAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:6407:3: ( rule__ColonQualifiedName__Group_1__0 )
            // InternalKerMLExpressions.g:6407:4: rule__ColonQualifiedName__Group_1__0
            {
            pushFollow(FOLLOW_56);
            rule__ColonQualifiedName__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColonQualifiedNameAccess().getGroup_1()); 
            }

            }

            // InternalKerMLExpressions.g:6410:2: ( ( rule__ColonQualifiedName__Group_1__0 )* )
            // InternalKerMLExpressions.g:6411:3: ( rule__ColonQualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColonQualifiedNameAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:6412:3: ( rule__ColonQualifiedName__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==52) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKerMLExpressions.g:6412:4: rule__ColonQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__ColonQualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColonQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ColonQualifiedName__Group__1__Impl"


    // $ANTLR start "rule__ColonQualifiedName__Group_1__0"
    // InternalKerMLExpressions.g:6422:1: rule__ColonQualifiedName__Group_1__0 : rule__ColonQualifiedName__Group_1__0__Impl rule__ColonQualifiedName__Group_1__1 ;
    public final void rule__ColonQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6426:1: ( rule__ColonQualifiedName__Group_1__0__Impl rule__ColonQualifiedName__Group_1__1 )
            // InternalKerMLExpressions.g:6427:2: rule__ColonQualifiedName__Group_1__0__Impl rule__ColonQualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ColonQualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColonQualifiedName__Group_1__1();

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
    // $ANTLR end "rule__ColonQualifiedName__Group_1__0"


    // $ANTLR start "rule__ColonQualifiedName__Group_1__0__Impl"
    // InternalKerMLExpressions.g:6434:1: rule__ColonQualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__ColonQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6438:1: ( ( '::' ) )
            // InternalKerMLExpressions.g:6439:1: ( '::' )
            {
            // InternalKerMLExpressions.g:6439:1: ( '::' )
            // InternalKerMLExpressions.g:6440:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColonQualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__ColonQualifiedName__Group_1__1"
    // InternalKerMLExpressions.g:6449:1: rule__ColonQualifiedName__Group_1__1 : rule__ColonQualifiedName__Group_1__1__Impl ;
    public final void rule__ColonQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6453:1: ( rule__ColonQualifiedName__Group_1__1__Impl )
            // InternalKerMLExpressions.g:6454:2: rule__ColonQualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColonQualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__ColonQualifiedName__Group_1__1"


    // $ANTLR start "rule__ColonQualifiedName__Group_1__1__Impl"
    // InternalKerMLExpressions.g:6460:1: rule__ColonQualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__ColonQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6464:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6465:1: ( ruleName )
            {
            // InternalKerMLExpressions.g:6465:1: ( ruleName )
            // InternalKerMLExpressions.g:6466:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColonQualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DotQualifiedName__Group__0"
    // InternalKerMLExpressions.g:6476:1: rule__DotQualifiedName__Group__0 : rule__DotQualifiedName__Group__0__Impl rule__DotQualifiedName__Group__1 ;
    public final void rule__DotQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6480:1: ( rule__DotQualifiedName__Group__0__Impl rule__DotQualifiedName__Group__1 )
            // InternalKerMLExpressions.g:6481:2: rule__DotQualifiedName__Group__0__Impl rule__DotQualifiedName__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__DotQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotQualifiedName__Group__1();

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
    // $ANTLR end "rule__DotQualifiedName__Group__0"


    // $ANTLR start "rule__DotQualifiedName__Group__0__Impl"
    // InternalKerMLExpressions.g:6488:1: rule__DotQualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__DotQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6492:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6493:1: ( ruleName )
            {
            // InternalKerMLExpressions.g:6493:1: ( ruleName )
            // InternalKerMLExpressions.g:6494:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotQualifiedName__Group__0__Impl"


    // $ANTLR start "rule__DotQualifiedName__Group__1"
    // InternalKerMLExpressions.g:6503:1: rule__DotQualifiedName__Group__1 : rule__DotQualifiedName__Group__1__Impl ;
    public final void rule__DotQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6507:1: ( rule__DotQualifiedName__Group__1__Impl )
            // InternalKerMLExpressions.g:6508:2: rule__DotQualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotQualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__DotQualifiedName__Group__1"


    // $ANTLR start "rule__DotQualifiedName__Group__1__Impl"
    // InternalKerMLExpressions.g:6514:1: rule__DotQualifiedName__Group__1__Impl : ( ( ( rule__DotQualifiedName__Group_1__0 ) ) ( ( rule__DotQualifiedName__Group_1__0 )* ) ) ;
    public final void rule__DotQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6518:1: ( ( ( ( rule__DotQualifiedName__Group_1__0 ) ) ( ( rule__DotQualifiedName__Group_1__0 )* ) ) )
            // InternalKerMLExpressions.g:6519:1: ( ( ( rule__DotQualifiedName__Group_1__0 ) ) ( ( rule__DotQualifiedName__Group_1__0 )* ) )
            {
            // InternalKerMLExpressions.g:6519:1: ( ( ( rule__DotQualifiedName__Group_1__0 ) ) ( ( rule__DotQualifiedName__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:6520:2: ( ( rule__DotQualifiedName__Group_1__0 ) ) ( ( rule__DotQualifiedName__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:6520:2: ( ( rule__DotQualifiedName__Group_1__0 ) )
            // InternalKerMLExpressions.g:6521:3: ( rule__DotQualifiedName__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotQualifiedNameAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:6522:3: ( rule__DotQualifiedName__Group_1__0 )
            // InternalKerMLExpressions.g:6522:4: rule__DotQualifiedName__Group_1__0
            {
            pushFollow(FOLLOW_57);
            rule__DotQualifiedName__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotQualifiedNameAccess().getGroup_1()); 
            }

            }

            // InternalKerMLExpressions.g:6525:2: ( ( rule__DotQualifiedName__Group_1__0 )* )
            // InternalKerMLExpressions.g:6526:3: ( rule__DotQualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotQualifiedNameAccess().getGroup_1()); 
            }
            // InternalKerMLExpressions.g:6527:3: ( rule__DotQualifiedName__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==43) ) {
                    int LA47_2 = input.LA(2);

                    if ( ((LA47_2>=RULE_ID && LA47_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalKerMLExpressions.g:6527:4: rule__DotQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__DotQualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DotQualifiedName__Group__1__Impl"


    // $ANTLR start "rule__DotQualifiedName__Group_1__0"
    // InternalKerMLExpressions.g:6537:1: rule__DotQualifiedName__Group_1__0 : rule__DotQualifiedName__Group_1__0__Impl rule__DotQualifiedName__Group_1__1 ;
    public final void rule__DotQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6541:1: ( rule__DotQualifiedName__Group_1__0__Impl rule__DotQualifiedName__Group_1__1 )
            // InternalKerMLExpressions.g:6542:2: rule__DotQualifiedName__Group_1__0__Impl rule__DotQualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__DotQualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotQualifiedName__Group_1__1();

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
    // $ANTLR end "rule__DotQualifiedName__Group_1__0"


    // $ANTLR start "rule__DotQualifiedName__Group_1__0__Impl"
    // InternalKerMLExpressions.g:6549:1: rule__DotQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DotQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6553:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:6554:1: ( '.' )
            {
            // InternalKerMLExpressions.g:6554:1: ( '.' )
            // InternalKerMLExpressions.g:6555:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotQualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__DotQualifiedName__Group_1__1"
    // InternalKerMLExpressions.g:6564:1: rule__DotQualifiedName__Group_1__1 : rule__DotQualifiedName__Group_1__1__Impl ;
    public final void rule__DotQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6568:1: ( rule__DotQualifiedName__Group_1__1__Impl )
            // InternalKerMLExpressions.g:6569:2: rule__DotQualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotQualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__DotQualifiedName__Group_1__1"


    // $ANTLR start "rule__DotQualifiedName__Group_1__1__Impl"
    // InternalKerMLExpressions.g:6575:1: rule__DotQualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__DotQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6579:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6580:1: ( ruleName )
            {
            // InternalKerMLExpressions.g:6580:1: ( ruleName )
            // InternalKerMLExpressions.g:6581:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotQualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment"
    // InternalKerMLExpressions.g:6591:1: rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment : ( ruleOwnedExpression ) ;
    public final void rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6595:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6596:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6596:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6597:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedExpressionMemberAccess().getOwnedMemberFeature_compOwnedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedExpressionMemberAccess().getOwnedMemberFeature_compOwnedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedExpressionMember__OwnedMemberFeature_compAssignment"


    // $ANTLR start "rule__ConditionalExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6606:1: rule__ConditionalExpression__OperatorAssignment_1_1 : ( ruleConditionalTestOperator ) ;
    public final void rule__ConditionalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6610:1: ( ( ruleConditionalTestOperator ) )
            // InternalKerMLExpressions.g:6611:2: ( ruleConditionalTestOperator )
            {
            // InternalKerMLExpressions.g:6611:2: ( ruleConditionalTestOperator )
            // InternalKerMLExpressions.g:6612:3: ruleConditionalTestOperator
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


    // $ANTLR start "rule__ConditionalExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:6621:1: rule__ConditionalExpression__Operand_compAssignment_1_2 : ( ruleOwnedExpression ) ;
    public final void rule__ConditionalExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6625:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6626:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6626:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6627:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__ConditionalExpression__Operand_compAssignment_1_4"
    // InternalKerMLExpressions.g:6636:1: rule__ConditionalExpression__Operand_compAssignment_1_4 : ( ruleConditionalExpression ) ;
    public final void rule__ConditionalExpression__Operand_compAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6640:1: ( ( ruleConditionalExpression ) )
            // InternalKerMLExpressions.g:6641:2: ( ruleConditionalExpression )
            {
            // InternalKerMLExpressions.g:6641:2: ( ruleConditionalExpression )
            // InternalKerMLExpressions.g:6642:3: ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalExpressionAccess().getOperand_compConditionalExpressionParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalExpressionAccess().getOperand_compConditionalExpressionParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Operand_compAssignment_1_4"


    // $ANTLR start "rule__NullCoalescingExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6651:1: rule__NullCoalescingExpression__OperatorAssignment_1_1 : ( ruleNullCoalescingOperator ) ;
    public final void rule__NullCoalescingExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6655:1: ( ( ruleNullCoalescingOperator ) )
            // InternalKerMLExpressions.g:6656:2: ( ruleNullCoalescingOperator )
            {
            // InternalKerMLExpressions.g:6656:2: ( ruleNullCoalescingOperator )
            // InternalKerMLExpressions.g:6657:3: ruleNullCoalescingOperator
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


    // $ANTLR start "rule__NullCoalescingExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:6666:1: rule__NullCoalescingExpression__Operand_compAssignment_1_2 : ( ruleConditionalOrExpression ) ;
    public final void rule__NullCoalescingExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6670:1: ( ( ruleConditionalOrExpression ) )
            // InternalKerMLExpressions.g:6671:2: ( ruleConditionalOrExpression )
            {
            // InternalKerMLExpressions.g:6671:2: ( ruleConditionalOrExpression )
            // InternalKerMLExpressions.g:6672:3: ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullCoalescingExpressionAccess().getOperand_compConditionalOrExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullCoalescingExpressionAccess().getOperand_compConditionalOrExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullCoalescingExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__ConditionalOrExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6681:1: rule__ConditionalOrExpression__OperatorAssignment_1_1 : ( ruleConditionalOrOperator ) ;
    public final void rule__ConditionalOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6685:1: ( ( ruleConditionalOrOperator ) )
            // InternalKerMLExpressions.g:6686:2: ( ruleConditionalOrOperator )
            {
            // InternalKerMLExpressions.g:6686:2: ( ruleConditionalOrOperator )
            // InternalKerMLExpressions.g:6687:3: ruleConditionalOrOperator
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


    // $ANTLR start "rule__ConditionalOrExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:6696:1: rule__ConditionalOrExpression__Operand_compAssignment_1_2 : ( ruleConditionalAndExpression ) ;
    public final void rule__ConditionalOrExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6700:1: ( ( ruleConditionalAndExpression ) )
            // InternalKerMLExpressions.g:6701:2: ( ruleConditionalAndExpression )
            {
            // InternalKerMLExpressions.g:6701:2: ( ruleConditionalAndExpression )
            // InternalKerMLExpressions.g:6702:3: ruleConditionalAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalOrExpressionAccess().getOperand_compConditionalAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalOrExpressionAccess().getOperand_compConditionalAndExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__ConditionalAndExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6711:1: rule__ConditionalAndExpression__OperatorAssignment_1_1 : ( ruleConditionalAndOperator ) ;
    public final void rule__ConditionalAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6715:1: ( ( ruleConditionalAndOperator ) )
            // InternalKerMLExpressions.g:6716:2: ( ruleConditionalAndOperator )
            {
            // InternalKerMLExpressions.g:6716:2: ( ruleConditionalAndOperator )
            // InternalKerMLExpressions.g:6717:3: ruleConditionalAndOperator
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


    // $ANTLR start "rule__ConditionalAndExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:6726:1: rule__ConditionalAndExpression__Operand_compAssignment_1_2 : ( ruleOrExpression ) ;
    public final void rule__ConditionalAndExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6730:1: ( ( ruleOrExpression ) )
            // InternalKerMLExpressions.g:6731:2: ( ruleOrExpression )
            {
            // InternalKerMLExpressions.g:6731:2: ( ruleOrExpression )
            // InternalKerMLExpressions.g:6732:3: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAndExpressionAccess().getOperand_compOrExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAndExpressionAccess().getOperand_compOrExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6741:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6745:1: ( ( ruleOrOperator ) )
            // InternalKerMLExpressions.g:6746:2: ( ruleOrOperator )
            {
            // InternalKerMLExpressions.g:6746:2: ( ruleOrOperator )
            // InternalKerMLExpressions.g:6747:3: ruleOrOperator
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


    // $ANTLR start "rule__OrExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:6756:1: rule__OrExpression__Operand_compAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6760:1: ( ( ruleXorExpression ) )
            // InternalKerMLExpressions.g:6761:2: ( ruleXorExpression )
            {
            // InternalKerMLExpressions.g:6761:2: ( ruleXorExpression )
            // InternalKerMLExpressions.g:6762:3: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperand_compXorExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperand_compXorExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__XorExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6771:1: rule__XorExpression__OperatorAssignment_1_1 : ( ruleXorOperator ) ;
    public final void rule__XorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6775:1: ( ( ruleXorOperator ) )
            // InternalKerMLExpressions.g:6776:2: ( ruleXorOperator )
            {
            // InternalKerMLExpressions.g:6776:2: ( ruleXorOperator )
            // InternalKerMLExpressions.g:6777:3: ruleXorOperator
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


    // $ANTLR start "rule__XorExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:6786:1: rule__XorExpression__Operand_compAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6790:1: ( ( ruleAndExpression ) )
            // InternalKerMLExpressions.g:6791:2: ( ruleAndExpression )
            {
            // InternalKerMLExpressions.g:6791:2: ( ruleAndExpression )
            // InternalKerMLExpressions.g:6792:3: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperand_compAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperand_compAndExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6801:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6805:1: ( ( ruleAndOperator ) )
            // InternalKerMLExpressions.g:6806:2: ( ruleAndOperator )
            {
            // InternalKerMLExpressions.g:6806:2: ( ruleAndOperator )
            // InternalKerMLExpressions.g:6807:3: ruleAndOperator
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


    // $ANTLR start "rule__AndExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:6816:1: rule__AndExpression__Operand_compAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6820:1: ( ( ruleEqualityExpression ) )
            // InternalKerMLExpressions.g:6821:2: ( ruleEqualityExpression )
            {
            // InternalKerMLExpressions.g:6821:2: ( ruleEqualityExpression )
            // InternalKerMLExpressions.g:6822:3: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperand_compEqualityExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperand_compEqualityExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__EqualityExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6831:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6835:1: ( ( ruleEqualityOperator ) )
            // InternalKerMLExpressions.g:6836:2: ( ruleEqualityOperator )
            {
            // InternalKerMLExpressions.g:6836:2: ( ruleEqualityOperator )
            // InternalKerMLExpressions.g:6837:3: ruleEqualityOperator
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


    // $ANTLR start "rule__EqualityExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:6846:1: rule__EqualityExpression__Operand_compAssignment_1_2 : ( ruleClassificationExpression ) ;
    public final void rule__EqualityExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6850:1: ( ( ruleClassificationExpression ) )
            // InternalKerMLExpressions.g:6851:2: ( ruleClassificationExpression )
            {
            // InternalKerMLExpressions.g:6851:2: ( ruleClassificationExpression )
            // InternalKerMLExpressions.g:6852:3: ruleClassificationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperand_compClassificationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassificationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperand_compClassificationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__ClassificationExpression__OperatorAssignment_0_1_1"
    // InternalKerMLExpressions.g:6861:1: rule__ClassificationExpression__OperatorAssignment_0_1_1 : ( ruleClassificationOperator ) ;
    public final void rule__ClassificationExpression__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6865:1: ( ( ruleClassificationOperator ) )
            // InternalKerMLExpressions.g:6866:2: ( ruleClassificationOperator )
            {
            // InternalKerMLExpressions.g:6866:2: ( ruleClassificationOperator )
            // InternalKerMLExpressions.g:6867:3: ruleClassificationOperator
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


    // $ANTLR start "rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2"
    // InternalKerMLExpressions.g:6876:1: rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2 : ( ruleTypeReferenceMember ) ;
    public final void rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6880:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:6881:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:6881:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:6882:3: ruleTypeReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_0_1_2"


    // $ANTLR start "rule__ClassificationExpression__Operand_compAssignment_1_1"
    // InternalKerMLExpressions.g:6891:1: rule__ClassificationExpression__Operand_compAssignment_1_1 : ( ruleSelfReferenceExpression ) ;
    public final void rule__ClassificationExpression__Operand_compAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6895:1: ( ( ruleSelfReferenceExpression ) )
            // InternalKerMLExpressions.g:6896:2: ( ruleSelfReferenceExpression )
            {
            // InternalKerMLExpressions.g:6896:2: ( ruleSelfReferenceExpression )
            // InternalKerMLExpressions.g:6897:3: ruleSelfReferenceExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOperand_compSelfReferenceExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelfReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOperand_compSelfReferenceExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__Operand_compAssignment_1_1"


    // $ANTLR start "rule__ClassificationExpression__OperatorAssignment_1_2"
    // InternalKerMLExpressions.g:6906:1: rule__ClassificationExpression__OperatorAssignment_1_2 : ( ruleClassificationOperator ) ;
    public final void rule__ClassificationExpression__OperatorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6910:1: ( ( ruleClassificationOperator ) )
            // InternalKerMLExpressions.g:6911:2: ( ruleClassificationOperator )
            {
            // InternalKerMLExpressions.g:6911:2: ( ruleClassificationOperator )
            // InternalKerMLExpressions.g:6912:3: ruleClassificationOperator
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


    // $ANTLR start "rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3"
    // InternalKerMLExpressions.g:6921:1: rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3 : ( ruleTypeReferenceMember ) ;
    public final void rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6925:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:6926:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:6926:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:6927:3: ruleTypeReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassificationExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassificationExpression__OwnedFeatureMembership_compAssignment_1_3"


    // $ANTLR start "rule__TypeReferenceMember__OwnedMemberFeature_compAssignment"
    // InternalKerMLExpressions.g:6936:1: rule__TypeReferenceMember__OwnedMemberFeature_compAssignment : ( ruleTypeReference ) ;
    public final void rule__TypeReferenceMember__OwnedMemberFeature_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6940:1: ( ( ruleTypeReference ) )
            // InternalKerMLExpressions.g:6941:2: ( ruleTypeReference )
            {
            // InternalKerMLExpressions.g:6941:2: ( ruleTypeReference )
            // InternalKerMLExpressions.g:6942:3: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceMemberAccess().getOwnedMemberFeature_compTypeReferenceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceMemberAccess().getOwnedMemberFeature_compTypeReferenceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReferenceMember__OwnedMemberFeature_compAssignment"


    // $ANTLR start "rule__TypeReference__OwnedRelationship_compAssignment"
    // InternalKerMLExpressions.g:6951:1: rule__TypeReference__OwnedRelationship_compAssignment : ( ruleOwnedFeatureTyping ) ;
    public final void rule__TypeReference__OwnedRelationship_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6955:1: ( ( ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:6956:2: ( ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:6956:2: ( ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:6957:3: ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__OwnedRelationship_compAssignment"


    // $ANTLR start "rule__OwnedFeatureTyping__TypeAssignment"
    // InternalKerMLExpressions.g:6966:1: rule__OwnedFeatureTyping__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__OwnedFeatureTyping__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6970:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:6971:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:6971:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:6972:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeCrossReference_0()); 
            }
            // InternalKerMLExpressions.g:6973:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:6974:4: ruleQualifiedName
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


    // $ANTLR start "rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment"
    // InternalKerMLExpressions.g:6985:1: rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment : ( ruleSelfReferenceMember ) ;
    public final void rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6989:1: ( ( ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:6990:2: ( ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:6990:2: ( ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:6991:3: ruleSelfReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceExpressionAccess().getOwnedFeatureMembership_compSelfReferenceMemberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelfReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceExpressionAccess().getOwnedFeatureMembership_compSelfReferenceMemberParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReferenceExpression__OwnedFeatureMembership_compAssignment"


    // $ANTLR start "rule__SelfReferenceMember__OwnedMemberFeature_compAssignment"
    // InternalKerMLExpressions.g:7000:1: rule__SelfReferenceMember__OwnedMemberFeature_compAssignment : ( ruleEmptyFeature ) ;
    public final void rule__SelfReferenceMember__OwnedMemberFeature_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7004:1: ( ( ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:7005:2: ( ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:7005:2: ( ruleEmptyFeature )
            // InternalKerMLExpressions.g:7006:3: ruleEmptyFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfReferenceMemberAccess().getOwnedMemberFeature_compEmptyFeatureParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmptyFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfReferenceMemberAccess().getOwnedMemberFeature_compEmptyFeatureParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReferenceMember__OwnedMemberFeature_compAssignment"


    // $ANTLR start "rule__RelationalExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7015:1: rule__RelationalExpression__OperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7019:1: ( ( ruleRelationalOperator ) )
            // InternalKerMLExpressions.g:7020:2: ( ruleRelationalOperator )
            {
            // InternalKerMLExpressions.g:7020:2: ( ruleRelationalOperator )
            // InternalKerMLExpressions.g:7021:3: ruleRelationalOperator
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


    // $ANTLR start "rule__RelationalExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:7030:1: rule__RelationalExpression__Operand_compAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7034:1: ( ( ruleAdditiveExpression ) )
            // InternalKerMLExpressions.g:7035:2: ( ruleAdditiveExpression )
            {
            // InternalKerMLExpressions.g:7035:2: ( ruleAdditiveExpression )
            // InternalKerMLExpressions.g:7036:3: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperand_compAdditiveExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperand_compAdditiveExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7045:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7049:1: ( ( ruleAdditiveOperator ) )
            // InternalKerMLExpressions.g:7050:2: ( ruleAdditiveOperator )
            {
            // InternalKerMLExpressions.g:7050:2: ( ruleAdditiveOperator )
            // InternalKerMLExpressions.g:7051:3: ruleAdditiveOperator
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


    // $ANTLR start "rule__AdditiveExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:7060:1: rule__AdditiveExpression__Operand_compAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7064:1: ( ( ruleMultiplicativeExpression ) )
            // InternalKerMLExpressions.g:7065:2: ( ruleMultiplicativeExpression )
            {
            // InternalKerMLExpressions.g:7065:2: ( ruleMultiplicativeExpression )
            // InternalKerMLExpressions.g:7066:3: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperand_compMultiplicativeExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperand_compMultiplicativeExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7075:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7079:1: ( ( ruleMultiplicativeOperator ) )
            // InternalKerMLExpressions.g:7080:2: ( ruleMultiplicativeOperator )
            {
            // InternalKerMLExpressions.g:7080:2: ( ruleMultiplicativeOperator )
            // InternalKerMLExpressions.g:7081:3: ruleMultiplicativeOperator
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


    // $ANTLR start "rule__MultiplicativeExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:7090:1: rule__MultiplicativeExpression__Operand_compAssignment_1_2 : ( ruleExponentiationExpression ) ;
    public final void rule__MultiplicativeExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7094:1: ( ( ruleExponentiationExpression ) )
            // InternalKerMLExpressions.g:7095:2: ( ruleExponentiationExpression )
            {
            // InternalKerMLExpressions.g:7095:2: ( ruleExponentiationExpression )
            // InternalKerMLExpressions.g:7096:3: ruleExponentiationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperand_compExponentiationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExponentiationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperand_compExponentiationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__ExponentiationExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7105:1: rule__ExponentiationExpression__OperatorAssignment_1_1 : ( ruleExponentiationOperator ) ;
    public final void rule__ExponentiationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7109:1: ( ( ruleExponentiationOperator ) )
            // InternalKerMLExpressions.g:7110:2: ( ruleExponentiationOperator )
            {
            // InternalKerMLExpressions.g:7110:2: ( ruleExponentiationOperator )
            // InternalKerMLExpressions.g:7111:3: ruleExponentiationOperator
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


    // $ANTLR start "rule__ExponentiationExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:7120:1: rule__ExponentiationExpression__Operand_compAssignment_1_2 : ( ruleUnitsExpression ) ;
    public final void rule__ExponentiationExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7124:1: ( ( ruleUnitsExpression ) )
            // InternalKerMLExpressions.g:7125:2: ( ruleUnitsExpression )
            {
            // InternalKerMLExpressions.g:7125:2: ( ruleUnitsExpression )
            // InternalKerMLExpressions.g:7126:3: ruleUnitsExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentiationExpressionAccess().getOperand_compUnitsExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnitsExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentiationExpressionAccess().getOperand_compUnitsExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__UnitsExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7135:1: rule__UnitsExpression__OperatorAssignment_1_1 : ( ( '@[' ) ) ;
    public final void rule__UnitsExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7139:1: ( ( ( '@[' ) ) )
            // InternalKerMLExpressions.g:7140:2: ( ( '@[' ) )
            {
            // InternalKerMLExpressions.g:7140:2: ( ( '@[' ) )
            // InternalKerMLExpressions.g:7141:3: ( '@[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtLeftSquareBracketKeyword_1_1_0()); 
            }
            // InternalKerMLExpressions.g:7142:3: ( '@[' )
            // InternalKerMLExpressions.g:7143:4: '@['
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


    // $ANTLR start "rule__UnitsExpression__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:7154:1: rule__UnitsExpression__Operand_compAssignment_1_2 : ( ruleOwnedExpression ) ;
    public final void rule__UnitsExpression__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7158:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7159:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7159:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7160:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitsExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitsExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitsExpression__Operand_compAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_0_1"
    // InternalKerMLExpressions.g:7169:1: rule__UnaryExpression__OperatorAssignment_0_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7173:1: ( ( ruleUnaryOperator ) )
            // InternalKerMLExpressions.g:7174:2: ( ruleUnaryOperator )
            {
            // InternalKerMLExpressions.g:7174:2: ( ruleUnaryOperator )
            // InternalKerMLExpressions.g:7175:3: ruleUnaryOperator
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


    // $ANTLR start "rule__UnaryExpression__Operand_compAssignment_0_2"
    // InternalKerMLExpressions.g:7184:1: rule__UnaryExpression__Operand_compAssignment_0_2 : ( ruleExtentExpression ) ;
    public final void rule__UnaryExpression__Operand_compAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7188:1: ( ( ruleExtentExpression ) )
            // InternalKerMLExpressions.g:7189:2: ( ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:7189:2: ( ruleExtentExpression )
            // InternalKerMLExpressions.g:7190:3: ruleExtentExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperand_compExtentExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExtentExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperand_compExtentExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Operand_compAssignment_0_2"


    // $ANTLR start "rule__ExtentExpression__OperatorAssignment_0_1"
    // InternalKerMLExpressions.g:7199:1: rule__ExtentExpression__OperatorAssignment_0_1 : ( ( 'all' ) ) ;
    public final void rule__ExtentExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7203:1: ( ( ( 'all' ) ) )
            // InternalKerMLExpressions.g:7204:2: ( ( 'all' ) )
            {
            // InternalKerMLExpressions.g:7204:2: ( ( 'all' ) )
            // InternalKerMLExpressions.g:7205:3: ( 'all' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 
            }
            // InternalKerMLExpressions.g:7206:3: ( 'all' )
            // InternalKerMLExpressions.g:7207:4: 'all'
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


    // $ANTLR start "rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2"
    // InternalKerMLExpressions.g:7218:1: rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2 : ( ruleTypeReferenceMember ) ;
    public final void rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7222:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:7223:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:7223:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:7224:3: ruleTypeReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpressionAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression__OwnedFeatureMembership_compAssignment_0_2"


    // $ANTLR start "rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0"
    // InternalKerMLExpressions.g:7233:1: rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0 : ( ruleTypeReferenceMember ) ;
    public final void rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7237:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:7238:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:7238:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:7239:3: ruleTypeReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getOwnedFeatureMembership_compTypeReferenceMemberParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression_Deprecated__OwnedFeatureMembership_compAssignment_0"


    // $ANTLR start "rule__ExtentExpression_Deprecated__OperatorAssignment_2"
    // InternalKerMLExpressions.g:7248:1: rule__ExtentExpression_Deprecated__OperatorAssignment_2 : ( ( 'allInstances' ) ) ;
    public final void rule__ExtentExpression_Deprecated__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7252:1: ( ( ( 'allInstances' ) ) )
            // InternalKerMLExpressions.g:7253:2: ( ( 'allInstances' ) )
            {
            // InternalKerMLExpressions.g:7253:2: ( ( 'allInstances' ) )
            // InternalKerMLExpressions.g:7254:3: ( 'allInstances' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getOperatorAllInstancesKeyword_2_0()); 
            }
            // InternalKerMLExpressions.g:7255:3: ( 'allInstances' )
            // InternalKerMLExpressions.g:7256:4: 'allInstances'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtentExpression_DeprecatedAccess().getOperatorAllInstancesKeyword_2_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getOperatorAllInstancesKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtentExpression_DeprecatedAccess().getOperatorAllInstancesKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtentExpression_Deprecated__OperatorAssignment_2"


    // $ANTLR start "rule__SequenceExpression__OperatorAssignment_1_0_1"
    // InternalKerMLExpressions.g:7267:1: rule__SequenceExpression__OperatorAssignment_1_0_1 : ( ( '[' ) ) ;
    public final void rule__SequenceExpression__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7271:1: ( ( ( '[' ) ) )
            // InternalKerMLExpressions.g:7272:2: ( ( '[' ) )
            {
            // InternalKerMLExpressions.g:7272:2: ( ( '[' ) )
            // InternalKerMLExpressions.g:7273:3: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0()); 
            }
            // InternalKerMLExpressions.g:7274:3: ( '[' )
            // InternalKerMLExpressions.g:7275:4: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperatorLeftSquareBracketKeyword_1_0_1_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__SequenceExpression__Operand_compAssignment_1_0_2"
    // InternalKerMLExpressions.g:7286:1: rule__SequenceExpression__Operand_compAssignment_1_0_2 : ( ruleOwnedExpression ) ;
    public final void rule__SequenceExpression__Operand_compAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7290:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7291:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7291:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7292:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Operand_compAssignment_1_0_2"


    // $ANTLR start "rule__SequenceExpression__OperatorAssignment_1_1_2"
    // InternalKerMLExpressions.g:7301:1: rule__SequenceExpression__OperatorAssignment_1_1_2 : ( ruleName ) ;
    public final void rule__SequenceExpression__OperatorAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7305:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:7306:2: ( ruleName )
            {
            // InternalKerMLExpressions.g:7306:2: ( ruleName )
            // InternalKerMLExpressions.g:7307:3: ruleName
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


    // $ANTLR start "rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3"
    // InternalKerMLExpressions.g:7316:1: rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3 : ( ruleBodyExpressionMember ) ;
    public final void rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7320:1: ( ( ruleBodyExpressionMember ) )
            // InternalKerMLExpressions.g:7321:2: ( ruleBodyExpressionMember )
            {
            // InternalKerMLExpressions.g:7321:2: ( ruleBodyExpressionMember )
            // InternalKerMLExpressions.g:7322:3: ruleBodyExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpressionAccess().getOwnedFeatureMembership_compBodyExpressionMemberParserRuleCall_1_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpressionAccess().getOwnedFeatureMembership_compBodyExpressionMemberParserRuleCall_1_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__OwnedFeatureMembership_compAssignment_1_1_3"


    // $ANTLR start "rule__BodyExpressionMember__OwnedMemberFeature_compAssignment"
    // InternalKerMLExpressions.g:7331:1: rule__BodyExpressionMember__OwnedMemberFeature_compAssignment : ( ruleBodyExpression ) ;
    public final void rule__BodyExpressionMember__OwnedMemberFeature_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7335:1: ( ( ruleBodyExpression ) )
            // InternalKerMLExpressions.g:7336:2: ( ruleBodyExpression )
            {
            // InternalKerMLExpressions.g:7336:2: ( ruleBodyExpression )
            // InternalKerMLExpressions.g:7337:3: ruleBodyExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionMemberAccess().getOwnedMemberFeature_compBodyExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionMemberAccess().getOwnedMemberFeature_compBodyExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpressionMember__OwnedMemberFeature_compAssignment"


    // $ANTLR start "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0"
    // InternalKerMLExpressions.g:7346:1: rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0 : ( ruleBodyParameterMember ) ;
    public final void rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7350:1: ( ( ruleBodyParameterMember ) )
            // InternalKerMLExpressions.g:7351:2: ( ruleBodyParameterMember )
            {
            // InternalKerMLExpressions.g:7351:2: ( ruleBodyParameterMember )
            // InternalKerMLExpressions.g:7352:3: ruleBodyParameterMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compBodyParameterMemberParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyParameterMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compBodyParameterMemberParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_0"


    // $ANTLR start "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1"
    // InternalKerMLExpressions.g:7361:1: rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1 : ( ruleBodyParameterMember ) ;
    public final void rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7365:1: ( ( ruleBodyParameterMember ) )
            // InternalKerMLExpressions.g:7366:2: ( ruleBodyParameterMember )
            {
            // InternalKerMLExpressions.g:7366:2: ( ruleBodyParameterMember )
            // InternalKerMLExpressions.g:7367:3: ruleBodyParameterMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compBodyParameterMemberParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyParameterMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compBodyParameterMemberParserRuleCall_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_1"


    // $ANTLR start "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3"
    // InternalKerMLExpressions.g:7376:1: rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3 : ( ruleResultExpressionMember ) ;
    public final void rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7380:1: ( ( ruleResultExpressionMember ) )
            // InternalKerMLExpressions.g:7381:2: ( ruleResultExpressionMember )
            {
            // InternalKerMLExpressions.g:7381:2: ( ruleResultExpressionMember )
            // InternalKerMLExpressions.g:7382:3: ruleResultExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compResultExpressionMemberParserRuleCall_0_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleResultExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedFeatureMembership_compResultExpressionMemberParserRuleCall_0_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__OwnedFeatureMembership_compAssignment_0_0_3"


    // $ANTLR start "rule__BodyExpression__OwnedRelationship_compAssignment_1"
    // InternalKerMLExpressions.g:7391:1: rule__BodyExpression__OwnedRelationship_compAssignment_1 : ( ruleOwnedFeatureTyping ) ;
    public final void rule__BodyExpression__OwnedRelationship_compAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7395:1: ( ( ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:7396:2: ( ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:7396:2: ( ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:7397:3: ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyExpressionAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyExpressionAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyExpression__OwnedRelationship_compAssignment_1"


    // $ANTLR start "rule__ResultExpressionMember__OwnedResultExpression_compAssignment"
    // InternalKerMLExpressions.g:7406:1: rule__ResultExpressionMember__OwnedResultExpression_compAssignment : ( ruleOwnedExpression ) ;
    public final void rule__ResultExpressionMember__OwnedResultExpression_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7410:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7411:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7411:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7412:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultExpressionMemberAccess().getOwnedResultExpression_compOwnedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultExpressionMemberAccess().getOwnedResultExpression_compOwnedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultExpressionMember__OwnedResultExpression_compAssignment"


    // $ANTLR start "rule__BodyParameterMember__MemberNameAssignment_0"
    // InternalKerMLExpressions.g:7421:1: rule__BodyParameterMember__MemberNameAssignment_0 : ( ruleName ) ;
    public final void rule__BodyParameterMember__MemberNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7425:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:7426:2: ( ruleName )
            {
            // InternalKerMLExpressions.g:7426:2: ( ruleName )
            // InternalKerMLExpressions.g:7427:3: ruleName
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


    // $ANTLR start "rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1"
    // InternalKerMLExpressions.g:7436:1: rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1 : ( ruleBodyParameter ) ;
    public final void rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7440:1: ( ( ruleBodyParameter ) )
            // InternalKerMLExpressions.g:7441:2: ( ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:7441:2: ( ruleBodyParameter )
            // InternalKerMLExpressions.g:7442:3: ruleBodyParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyParameterMemberAccess().getOwnedMemberParameter_compBodyParameterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyParameterMemberAccess().getOwnedMemberParameter_compBodyParameterParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__OwnedMemberParameter_compAssignment_1"


    // $ANTLR start "rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1"
    // InternalKerMLExpressions.g:7451:1: rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1 : ( ( ',' ) ) ;
    public final void rule__SequenceConstructionExpression__OperatorAssignment_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7455:1: ( ( ( ',' ) ) )
            // InternalKerMLExpressions.g:7456:2: ( ( ',' ) )
            {
            // InternalKerMLExpressions.g:7456:2: ( ( ',' ) )
            // InternalKerMLExpressions.g:7457:3: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorCommaKeyword_1_2_0_1_0()); 
            }
            // InternalKerMLExpressions.g:7458:3: ( ',' )
            // InternalKerMLExpressions.g:7459:4: ','
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


    // $ANTLR start "rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2"
    // InternalKerMLExpressions.g:7470:1: rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2 : ( ruleSequenceElementList ) ;
    public final void rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7474:1: ( ( ruleSequenceElementList ) )
            // InternalKerMLExpressions.g:7475:2: ( ruleSequenceElementList )
            {
            // InternalKerMLExpressions.g:7475:2: ( ruleSequenceElementList )
            // InternalKerMLExpressions.g:7476:3: ruleSequenceElementList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compSequenceElementListParserRuleCall_1_2_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceElementList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compSequenceElementListParserRuleCall_1_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Operand_compAssignment_1_2_0_2"


    // $ANTLR start "rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1"
    // InternalKerMLExpressions.g:7485:1: rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1 : ( ( '..' ) ) ;
    public final void rule__SequenceConstructionExpression__OperatorAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7489:1: ( ( ( '..' ) ) )
            // InternalKerMLExpressions.g:7490:2: ( ( '..' ) )
            {
            // InternalKerMLExpressions.g:7490:2: ( ( '..' ) )
            // InternalKerMLExpressions.g:7491:3: ( '..' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorFullStopFullStopKeyword_1_2_1_1_0()); 
            }
            // InternalKerMLExpressions.g:7492:3: ( '..' )
            // InternalKerMLExpressions.g:7493:4: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperatorFullStopFullStopKeyword_1_2_1_1_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2"
    // InternalKerMLExpressions.g:7504:1: rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2 : ( ruleOwnedExpression ) ;
    public final void rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7508:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7509:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7509:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7510:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceConstructionExpressionAccess().getOperand_compOwnedExpressionParserRuleCall_1_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Operand_compAssignment_1_2_1_2"


    // $ANTLR start "rule__SequenceElementList__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7519:1: rule__SequenceElementList__OperatorAssignment_1_1 : ( ( ',' ) ) ;
    public final void rule__SequenceElementList__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7523:1: ( ( ( ',' ) ) )
            // InternalKerMLExpressions.g:7524:2: ( ( ',' ) )
            {
            // InternalKerMLExpressions.g:7524:2: ( ( ',' ) )
            // InternalKerMLExpressions.g:7525:3: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperatorCommaKeyword_1_1_0()); 
            }
            // InternalKerMLExpressions.g:7526:3: ( ',' )
            // InternalKerMLExpressions.g:7527:4: ','
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


    // $ANTLR start "rule__SequenceElementList__Operand_compAssignment_1_2"
    // InternalKerMLExpressions.g:7538:1: rule__SequenceElementList__Operand_compAssignment_1_2 : ( ruleSequenceElementList ) ;
    public final void rule__SequenceElementList__Operand_compAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7542:1: ( ( ruleSequenceElementList ) )
            // InternalKerMLExpressions.g:7543:2: ( ruleSequenceElementList )
            {
            // InternalKerMLExpressions.g:7543:2: ( ruleSequenceElementList )
            // InternalKerMLExpressions.g:7544:3: ruleSequenceElementList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceElementListAccess().getOperand_compSequenceElementListParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceElementList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceElementListAccess().getOperand_compSequenceElementListParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceElementList__Operand_compAssignment_1_2"


    // $ANTLR start "rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment"
    // InternalKerMLExpressions.g:7553:1: rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment : ( ruleFeatureReferenceMember ) ;
    public final void rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7557:1: ( ( ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:7558:2: ( ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:7558:2: ( ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:7559:3: ruleFeatureReferenceMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedFeatureMembership_compFeatureReferenceMemberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureReferenceMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedFeatureMembership_compFeatureReferenceMemberParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureReferenceExpression__OwnedFeatureMembership_compAssignment"


    // $ANTLR start "rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment"
    // InternalKerMLExpressions.g:7568:1: rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment : ( ruleFeatureReference ) ;
    public final void rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7572:1: ( ( ruleFeatureReference ) )
            // InternalKerMLExpressions.g:7573:2: ( ruleFeatureReference )
            {
            // InternalKerMLExpressions.g:7573:2: ( ruleFeatureReference )
            // InternalKerMLExpressions.g:7574:3: ruleFeatureReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceMemberAccess().getOwnedMemberFeature_compFeatureReferenceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceMemberAccess().getOwnedMemberFeature_compFeatureReferenceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureReferenceMember__OwnedMemberFeature_compAssignment"


    // $ANTLR start "rule__FeatureReference__OwnedRelationship_compAssignment"
    // InternalKerMLExpressions.g:7583:1: rule__FeatureReference__OwnedRelationship_compAssignment : ( ruleOwnedSubsetting ) ;
    public final void rule__FeatureReference__OwnedRelationship_compAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7587:1: ( ( ruleOwnedSubsetting ) )
            // InternalKerMLExpressions.g:7588:2: ( ruleOwnedSubsetting )
            {
            // InternalKerMLExpressions.g:7588:2: ( ruleOwnedSubsetting )
            // InternalKerMLExpressions.g:7589:3: ruleOwnedSubsetting
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureReferenceAccess().getOwnedRelationship_compOwnedSubsettingParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedSubsetting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureReferenceAccess().getOwnedRelationship_compOwnedSubsettingParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureReference__OwnedRelationship_compAssignment"


    // $ANTLR start "rule__OwnedSubsetting__SubsettedFeatureAssignment"
    // InternalKerMLExpressions.g:7598:1: rule__OwnedSubsetting__SubsettedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__OwnedSubsetting__SubsettedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7602:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:7603:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:7603:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:7604:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedSubsettingAccess().getSubsettedFeatureFeatureCrossReference_0()); 
            }
            // InternalKerMLExpressions.g:7605:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:7606:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOwnedSubsettingAccess().getSubsettedFeatureFeatureQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedSubsettingAccess().getSubsettedFeatureFeatureQualifiedNameParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOwnedSubsettingAccess().getSubsettedFeatureFeatureCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedSubsetting__SubsettedFeatureAssignment"


    // $ANTLR start "rule__InvocationExpression__OwnedRelationship_compAssignment_0"
    // InternalKerMLExpressions.g:7617:1: rule__InvocationExpression__OwnedRelationship_compAssignment_0 : ( ruleOwnedFeatureTyping ) ;
    public final void rule__InvocationExpression__OwnedRelationship_compAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7621:1: ( ( ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:7622:2: ( ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:7622:2: ( ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:7623:3: ruleOwnedFeatureTyping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvocationExpressionAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvocationExpressionAccess().getOwnedRelationship_compOwnedFeatureTypingParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvocationExpression__OwnedRelationship_compAssignment_0"


    // $ANTLR start "rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0"
    // InternalKerMLExpressions.g:7632:1: rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0 : ( ruleOwnedExpressionMember ) ;
    public final void rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7636:1: ( ( ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:7637:2: ( ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:7637:2: ( ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:7638:3: ruleOwnedExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compOwnedExpressionMemberParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compOwnedExpressionMemberParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_0"


    // $ANTLR start "rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1"
    // InternalKerMLExpressions.g:7647:1: rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1 : ( ruleOwnedExpressionMember ) ;
    public final void rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7651:1: ( ( ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:7652:2: ( ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:7652:2: ( ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:7653:3: ruleOwnedExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compOwnedExpressionMemberParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositionalArgumentListAccess().getOwnedFeatureMembership_compOwnedExpressionMemberParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalArgumentList__OwnedFeatureMembership_compAssignment_1_1"


    // $ANTLR start "rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0"
    // InternalKerMLExpressions.g:7662:1: rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0 : ( ruleNamedExpressionMember ) ;
    public final void rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7666:1: ( ( ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:7667:2: ( ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:7667:2: ( ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:7668:3: ruleNamedExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compNamedExpressionMemberParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compNamedExpressionMemberParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_0"


    // $ANTLR start "rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1"
    // InternalKerMLExpressions.g:7677:1: rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1 : ( ruleNamedExpressionMember ) ;
    public final void rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7681:1: ( ( ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:7682:2: ( ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:7682:2: ( ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:7683:3: ruleNamedExpressionMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compNamedExpressionMemberParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedExpressionMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedArgumentListAccess().getOwnedFeatureMembership_compNamedExpressionMemberParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgumentList__OwnedFeatureMembership_compAssignment_1_1"


    // $ANTLR start "rule__NamedExpressionMember__MemberNameAssignment_0"
    // InternalKerMLExpressions.g:7692:1: rule__NamedExpressionMember__MemberNameAssignment_0 : ( ruleName ) ;
    public final void rule__NamedExpressionMember__MemberNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7696:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:7697:2: ( ruleName )
            {
            // InternalKerMLExpressions.g:7697:2: ( ruleName )
            // InternalKerMLExpressions.g:7698:3: ruleName
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


    // $ANTLR start "rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2"
    // InternalKerMLExpressions.g:7707:1: rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2 : ( ruleOwnedExpression ) ;
    public final void rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7711:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7712:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7712:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7713:3: ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedExpressionMemberAccess().getOwnedMemberFeature_compOwnedExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedExpressionMemberAccess().getOwnedMemberFeature_compOwnedExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedExpressionMember__OwnedMemberFeature_compAssignment_2"


    // $ANTLR start "rule__LiteralBoolean__ValueAssignment"
    // InternalKerMLExpressions.g:7722:1: rule__LiteralBoolean__ValueAssignment : ( ruleBooleanValue ) ;
    public final void rule__LiteralBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7726:1: ( ( ruleBooleanValue ) )
            // InternalKerMLExpressions.g:7727:2: ( ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:7727:2: ( ruleBooleanValue )
            // InternalKerMLExpressions.g:7728:3: ruleBooleanValue
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
    // InternalKerMLExpressions.g:7737:1: rule__LiteralString__ValueAssignment : ( RULE_STRING_VALUE ) ;
    public final void rule__LiteralString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7741:1: ( ( RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:7742:2: ( RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:7742:2: ( RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:7743:3: RULE_STRING_VALUE
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
    // InternalKerMLExpressions.g:7752:1: rule__LiteralInteger__ValueAssignment : ( RULE_DECIMAL_VALUE ) ;
    public final void rule__LiteralInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7756:1: ( ( RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:7757:2: ( RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:7757:2: ( RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:7758:3: RULE_DECIMAL_VALUE
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
    // InternalKerMLExpressions.g:7767:1: rule__LiteralReal__ValueAssignment : ( ruleRealValue ) ;
    public final void rule__LiteralReal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7771:1: ( ( ruleRealValue ) )
            // InternalKerMLExpressions.g:7772:2: ( ruleRealValue )
            {
            // InternalKerMLExpressions.g:7772:2: ( ruleRealValue )
            // InternalKerMLExpressions.g:7773:3: ruleRealValue
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

    // $ANTLR start synpred19_InternalKerMLExpressions
    public final void synpred19_InternalKerMLExpressions_fragment() throws RecognitionException {   
        // InternalKerMLExpressions.g:2057:2: ( ( ( rule__BodyExpression__Group_0__0 ) ) )
        // InternalKerMLExpressions.g:2057:2: ( ( rule__BodyExpression__Group_0__0 ) )
        {
        // InternalKerMLExpressions.g:2057:2: ( ( rule__BodyExpression__Group_0__0 ) )
        // InternalKerMLExpressions.g:2058:3: ( rule__BodyExpression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBodyExpressionAccess().getGroup_0()); 
        }
        // InternalKerMLExpressions.g:2059:3: ( rule__BodyExpression__Group_0__0 )
        // InternalKerMLExpressions.g:2059:4: rule__BodyExpression__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__BodyExpression__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalKerMLExpressions

    // Delegated rules

    public final boolean synpred19_InternalKerMLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalKerMLExpressions_fragment(); // can never throw exception
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
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\3\uffff\2\11\5\uffff\4\11\3\uffff\4\11";
    static final String dfa_3s = "\1\4\2\uffff\2\16\1\uffff\1\6\1\uffff\1\6\1\uffff\4\16\1\uffff\2\6\4\16";
    static final String dfa_4s = "\1\63\2\uffff\2\71\1\uffff\1\7\1\uffff\1\67\1\uffff\4\71\1\uffff\1\7\1\67\4\71";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\6\1\uffff\1\4\1\uffff\1\3\4\uffff\1\5\6\uffff";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\1\3\1\4\1\2\31\uffff\1\2\4\uffff\2\2\2\uffff\1\2\1\5\6\uffff\1\1",
            "",
            "",
            "\27\11\4\uffff\2\11\1\10\1\7\2\11\1\uffff\2\11\2\uffff\1\6\1\11\2\uffff\2\11",
            "\27\11\4\uffff\2\11\1\10\1\7\2\11\1\uffff\2\11\2\uffff\1\6\1\11\2\uffff\2\11",
            "",
            "\1\12\1\13",
            "",
            "\1\14\1\15\57\uffff\1\16",
            "",
            "\27\11\4\uffff\2\11\1\16\1\7\2\11\1\uffff\2\11\2\uffff\1\17\1\11\2\uffff\2\11",
            "\27\11\4\uffff\2\11\1\16\1\7\2\11\1\uffff\2\11\2\uffff\1\17\1\11\2\uffff\2\11",
            "\27\11\4\uffff\2\11\1\20\1\7\2\11\1\uffff\2\11\3\uffff\1\11\2\uffff\2\11",
            "\27\11\4\uffff\2\11\1\20\1\7\2\11\1\uffff\2\11\3\uffff\1\11\2\uffff\2\11",
            "",
            "\1\21\1\22",
            "\1\23\1\24\57\uffff\1\16",
            "\27\11\4\uffff\2\11\1\16\1\7\2\11\1\uffff\2\11\2\uffff\1\17\1\11\2\uffff\2\11",
            "\27\11\4\uffff\2\11\1\16\1\7\2\11\1\uffff\2\11\2\uffff\1\17\1\11\2\uffff\2\11",
            "\27\11\4\uffff\2\11\1\20\1\7\2\11\1\uffff\2\11\3\uffff\1\11\2\uffff\2\11",
            "\27\11\4\uffff\2\11\1\20\1\7\2\11\1\uffff\2\11\3\uffff\1\11\2\uffff\2\11"
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
            return "2115:1: rule__BaseExpression__Alternatives : ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ruleExtentExpression_Deprecated ) | ( ( rule__BaseExpression__Group_5__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x004899E7000001F0L});
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
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100400000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00001000000000C0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0203000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0202000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0048B9E7000001F0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000098400000130L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000080000000002L});

}