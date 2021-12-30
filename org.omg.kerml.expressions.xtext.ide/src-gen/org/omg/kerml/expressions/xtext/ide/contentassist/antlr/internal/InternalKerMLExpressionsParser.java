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

@SuppressWarnings("all")
public class InternalKerMLExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXP_VALUE", "RULE_DECIMAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STRING_VALUE", "RULE_REGULAR_COMMENT", "RULE_DOCUMENTATION_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'?'", "'??'", "'=>'", "'implies'", "'|'", "'||'", "'or'", "'^^'", "'xor'", "'&'", "'&&'", "'and'", "'=='", "'!='", "'hastype'", "'istype'", "'@'", "'as'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'^'", "'!'", "'~'", "'not'", "','", "'null'", "'true'", "'false'", "':'", "'if'", "'else'", "'.'", "']'", "'->'", "'('", "')'", "'{'", "'}'", "';'", "'in'", "'='", "'::'", "'..'", "'all'", "'['"
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
    public static final int RULE_ID=6;
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
    // InternalKerMLExpressions.g:53:1: entryRuleOwnedExpressionMember : ruleOwnedExpressionMember EOF ;
    public final void entryRuleOwnedExpressionMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:54:1: ( ruleOwnedExpressionMember EOF )
            // InternalKerMLExpressions.g:55:1: ruleOwnedExpressionMember EOF
            {
             before(grammarAccess.getOwnedExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnedExpressionMember();

            state._fsp--;

             after(grammarAccess.getOwnedExpressionMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:62:1: ruleOwnedExpressionMember : ( ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleOwnedExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:66:2: ( ( ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:67:2: ( ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:67:2: ( ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:68:3: ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment )
            {
             before(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementAssignment()); 
            // InternalKerMLExpressions.g:69:3: ( rule__OwnedExpressionMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:69:4: rule__OwnedExpressionMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OwnedExpressionMember__OwnedRelatedElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:78:1: entryRuleOwnedExpression : ruleOwnedExpression EOF ;
    public final void entryRuleOwnedExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:79:1: ( ruleOwnedExpression EOF )
            // InternalKerMLExpressions.g:80:1: ruleOwnedExpression EOF
            {
             before(grammarAccess.getOwnedExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnedExpression();

            state._fsp--;

             after(grammarAccess.getOwnedExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:87:1: ruleOwnedExpression : ( ruleConditionalExpression ) ;
    public final void ruleOwnedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:91:2: ( ( ruleConditionalExpression ) )
            // InternalKerMLExpressions.g:92:2: ( ruleConditionalExpression )
            {
            // InternalKerMLExpressions.g:92:2: ( ruleConditionalExpression )
            // InternalKerMLExpressions.g:93:3: ruleConditionalExpression
            {
             before(grammarAccess.getOwnedExpressionAccess().getConditionalExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getOwnedExpressionAccess().getConditionalExpressionParserRuleCall()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:103:1: entryRuleConditionalExpression : ruleConditionalExpression EOF ;
    public final void entryRuleConditionalExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:104:1: ( ruleConditionalExpression EOF )
            // InternalKerMLExpressions.g:105:1: ruleConditionalExpression EOF
            {
             before(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:112:1: ruleConditionalExpression : ( ( rule__ConditionalExpression__Alternatives ) ) ;
    public final void ruleConditionalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:116:2: ( ( ( rule__ConditionalExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:117:2: ( ( rule__ConditionalExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:117:2: ( ( rule__ConditionalExpression__Alternatives ) )
            // InternalKerMLExpressions.g:118:3: ( rule__ConditionalExpression__Alternatives )
            {
             before(grammarAccess.getConditionalExpressionAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:119:3: ( rule__ConditionalExpression__Alternatives )
            // InternalKerMLExpressions.g:119:4: rule__ConditionalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleConditionalOperator"
    // InternalKerMLExpressions.g:128:1: entryRuleConditionalOperator : ruleConditionalOperator EOF ;
    public final void entryRuleConditionalOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:129:1: ( ruleConditionalOperator EOF )
            // InternalKerMLExpressions.g:130:1: ruleConditionalOperator EOF
            {
             before(grammarAccess.getConditionalOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalOperator();

            state._fsp--;

             after(grammarAccess.getConditionalOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalOperator"


    // $ANTLR start "ruleConditionalOperator"
    // InternalKerMLExpressions.g:137:1: ruleConditionalOperator : ( '?' ) ;
    public final void ruleConditionalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:141:2: ( ( '?' ) )
            // InternalKerMLExpressions.g:142:2: ( '?' )
            {
            // InternalKerMLExpressions.g:142:2: ( '?' )
            // InternalKerMLExpressions.g:143:3: '?'
            {
             before(grammarAccess.getConditionalOperatorAccess().getQuestionMarkKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConditionalOperatorAccess().getQuestionMarkKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalOperator"


    // $ANTLR start "entryRuleNullCoalescingExpression"
    // InternalKerMLExpressions.g:153:1: entryRuleNullCoalescingExpression : ruleNullCoalescingExpression EOF ;
    public final void entryRuleNullCoalescingExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:154:1: ( ruleNullCoalescingExpression EOF )
            // InternalKerMLExpressions.g:155:1: ruleNullCoalescingExpression EOF
            {
             before(grammarAccess.getNullCoalescingExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNullCoalescingExpression();

            state._fsp--;

             after(grammarAccess.getNullCoalescingExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:162:1: ruleNullCoalescingExpression : ( ( rule__NullCoalescingExpression__Group__0 ) ) ;
    public final void ruleNullCoalescingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:166:2: ( ( ( rule__NullCoalescingExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:167:2: ( ( rule__NullCoalescingExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:167:2: ( ( rule__NullCoalescingExpression__Group__0 ) )
            // InternalKerMLExpressions.g:168:3: ( rule__NullCoalescingExpression__Group__0 )
            {
             before(grammarAccess.getNullCoalescingExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:169:3: ( rule__NullCoalescingExpression__Group__0 )
            // InternalKerMLExpressions.g:169:4: rule__NullCoalescingExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullCoalescingExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:178:1: entryRuleNullCoalescingOperator : ruleNullCoalescingOperator EOF ;
    public final void entryRuleNullCoalescingOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:179:1: ( ruleNullCoalescingOperator EOF )
            // InternalKerMLExpressions.g:180:1: ruleNullCoalescingOperator EOF
            {
             before(grammarAccess.getNullCoalescingOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleNullCoalescingOperator();

            state._fsp--;

             after(grammarAccess.getNullCoalescingOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:187:1: ruleNullCoalescingOperator : ( '??' ) ;
    public final void ruleNullCoalescingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:191:2: ( ( '??' ) )
            // InternalKerMLExpressions.g:192:2: ( '??' )
            {
            // InternalKerMLExpressions.g:192:2: ( '??' )
            // InternalKerMLExpressions.g:193:3: '??'
            {
             before(grammarAccess.getNullCoalescingOperatorAccess().getQuestionMarkQuestionMarkKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNullCoalescingOperatorAccess().getQuestionMarkQuestionMarkKeyword()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalKerMLExpressions.g:203:1: entryRuleImpliesExpression : ruleImpliesExpression EOF ;
    public final void entryRuleImpliesExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:204:1: ( ruleImpliesExpression EOF )
            // InternalKerMLExpressions.g:205:1: ruleImpliesExpression EOF
            {
             before(grammarAccess.getImpliesExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleImpliesExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalKerMLExpressions.g:212:1: ruleImpliesExpression : ( ( rule__ImpliesExpression__Group__0 ) ) ;
    public final void ruleImpliesExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:216:2: ( ( ( rule__ImpliesExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:217:2: ( ( rule__ImpliesExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:217:2: ( ( rule__ImpliesExpression__Group__0 ) )
            // InternalKerMLExpressions.g:218:3: ( rule__ImpliesExpression__Group__0 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:219:3: ( rule__ImpliesExpression__Group__0 )
            // InternalKerMLExpressions.g:219:4: rule__ImpliesExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleImpliesOperator"
    // InternalKerMLExpressions.g:228:1: entryRuleImpliesOperator : ruleImpliesOperator EOF ;
    public final void entryRuleImpliesOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:229:1: ( ruleImpliesOperator EOF )
            // InternalKerMLExpressions.g:230:1: ruleImpliesOperator EOF
            {
             before(grammarAccess.getImpliesOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleImpliesOperator();

            state._fsp--;

             after(grammarAccess.getImpliesOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImpliesOperator"


    // $ANTLR start "ruleImpliesOperator"
    // InternalKerMLExpressions.g:237:1: ruleImpliesOperator : ( ( rule__ImpliesOperator__Alternatives ) ) ;
    public final void ruleImpliesOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:241:2: ( ( ( rule__ImpliesOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:242:2: ( ( rule__ImpliesOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:242:2: ( ( rule__ImpliesOperator__Alternatives ) )
            // InternalKerMLExpressions.g:243:3: ( rule__ImpliesOperator__Alternatives )
            {
             before(grammarAccess.getImpliesOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:244:3: ( rule__ImpliesOperator__Alternatives )
            // InternalKerMLExpressions.g:244:4: rule__ImpliesOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImpliesOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpliesOperator"


    // $ANTLR start "entryRuleOrExpression"
    // InternalKerMLExpressions.g:253:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:254:1: ( ruleOrExpression EOF )
            // InternalKerMLExpressions.g:255:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:262:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:266:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:267:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:267:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalKerMLExpressions.g:268:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:269:3: ( rule__OrExpression__Group__0 )
            // InternalKerMLExpressions.g:269:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:278:1: entryRuleOrOperator : ruleOrOperator EOF ;
    public final void entryRuleOrOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:279:1: ( ruleOrOperator EOF )
            // InternalKerMLExpressions.g:280:1: ruleOrOperator EOF
            {
             before(grammarAccess.getOrOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOrOperator();

            state._fsp--;

             after(grammarAccess.getOrOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:287:1: ruleOrOperator : ( ( rule__OrOperator__Alternatives ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:291:2: ( ( ( rule__OrOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:292:2: ( ( rule__OrOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:292:2: ( ( rule__OrOperator__Alternatives ) )
            // InternalKerMLExpressions.g:293:3: ( rule__OrOperator__Alternatives )
            {
             before(grammarAccess.getOrOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:294:3: ( rule__OrOperator__Alternatives )
            // InternalKerMLExpressions.g:294:4: rule__OrOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:303:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:304:1: ( ruleXorExpression EOF )
            // InternalKerMLExpressions.g:305:1: ruleXorExpression EOF
            {
             before(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:312:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:316:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:317:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:317:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalKerMLExpressions.g:318:3: ( rule__XorExpression__Group__0 )
            {
             before(grammarAccess.getXorExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:319:3: ( rule__XorExpression__Group__0 )
            // InternalKerMLExpressions.g:319:4: rule__XorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:328:1: entryRuleXorOperator : ruleXorOperator EOF ;
    public final void entryRuleXorOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:329:1: ( ruleXorOperator EOF )
            // InternalKerMLExpressions.g:330:1: ruleXorOperator EOF
            {
             before(grammarAccess.getXorOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleXorOperator();

            state._fsp--;

             after(grammarAccess.getXorOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:337:1: ruleXorOperator : ( ( rule__XorOperator__Alternatives ) ) ;
    public final void ruleXorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:341:2: ( ( ( rule__XorOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:342:2: ( ( rule__XorOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:342:2: ( ( rule__XorOperator__Alternatives ) )
            // InternalKerMLExpressions.g:343:3: ( rule__XorOperator__Alternatives )
            {
             before(grammarAccess.getXorOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:344:3: ( rule__XorOperator__Alternatives )
            // InternalKerMLExpressions.g:344:4: rule__XorOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XorOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXorOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:353:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:354:1: ( ruleAndExpression EOF )
            // InternalKerMLExpressions.g:355:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:362:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:366:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:367:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:367:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalKerMLExpressions.g:368:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:369:3: ( rule__AndExpression__Group__0 )
            // InternalKerMLExpressions.g:369:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:378:1: entryRuleAndOperator : ruleAndOperator EOF ;
    public final void entryRuleAndOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:379:1: ( ruleAndOperator EOF )
            // InternalKerMLExpressions.g:380:1: ruleAndOperator EOF
            {
             before(grammarAccess.getAndOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAndOperator();

            state._fsp--;

             after(grammarAccess.getAndOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:387:1: ruleAndOperator : ( ( rule__AndOperator__Alternatives ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:391:2: ( ( ( rule__AndOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:392:2: ( ( rule__AndOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:392:2: ( ( rule__AndOperator__Alternatives ) )
            // InternalKerMLExpressions.g:393:3: ( rule__AndOperator__Alternatives )
            {
             before(grammarAccess.getAndOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:394:3: ( rule__AndOperator__Alternatives )
            // InternalKerMLExpressions.g:394:4: rule__AndOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AndOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAndOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:403:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:404:1: ( ruleEqualityExpression EOF )
            // InternalKerMLExpressions.g:405:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:412:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:416:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:417:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:417:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalKerMLExpressions.g:418:3: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:419:3: ( rule__EqualityExpression__Group__0 )
            // InternalKerMLExpressions.g:419:4: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:428:1: entryRuleEqualityOperator : ruleEqualityOperator EOF ;
    public final void entryRuleEqualityOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:429:1: ( ruleEqualityOperator EOF )
            // InternalKerMLExpressions.g:430:1: ruleEqualityOperator EOF
            {
             before(grammarAccess.getEqualityOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualityOperator();

            state._fsp--;

             after(grammarAccess.getEqualityOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:437:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:441:2: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:442:2: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:442:2: ( ( rule__EqualityOperator__Alternatives ) )
            // InternalKerMLExpressions.g:443:3: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:444:3: ( rule__EqualityOperator__Alternatives )
            // InternalKerMLExpressions.g:444:4: rule__EqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:453:1: entryRuleClassificationExpression : ruleClassificationExpression EOF ;
    public final void entryRuleClassificationExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:454:1: ( ruleClassificationExpression EOF )
            // InternalKerMLExpressions.g:455:1: ruleClassificationExpression EOF
            {
             before(grammarAccess.getClassificationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleClassificationExpression();

            state._fsp--;

             after(grammarAccess.getClassificationExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:462:1: ruleClassificationExpression : ( ( rule__ClassificationExpression__Alternatives ) ) ;
    public final void ruleClassificationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:466:2: ( ( ( rule__ClassificationExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:467:2: ( ( rule__ClassificationExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:467:2: ( ( rule__ClassificationExpression__Alternatives ) )
            // InternalKerMLExpressions.g:468:3: ( rule__ClassificationExpression__Alternatives )
            {
             before(grammarAccess.getClassificationExpressionAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:469:3: ( rule__ClassificationExpression__Alternatives )
            // InternalKerMLExpressions.g:469:4: rule__ClassificationExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassificationExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:478:1: entryRuleClassificationOperator : ruleClassificationOperator EOF ;
    public final void entryRuleClassificationOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:479:1: ( ruleClassificationOperator EOF )
            // InternalKerMLExpressions.g:480:1: ruleClassificationOperator EOF
            {
             before(grammarAccess.getClassificationOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleClassificationOperator();

            state._fsp--;

             after(grammarAccess.getClassificationOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:487:1: ruleClassificationOperator : ( ( rule__ClassificationOperator__Alternatives ) ) ;
    public final void ruleClassificationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:491:2: ( ( ( rule__ClassificationOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:492:2: ( ( rule__ClassificationOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:492:2: ( ( rule__ClassificationOperator__Alternatives ) )
            // InternalKerMLExpressions.g:493:3: ( rule__ClassificationOperator__Alternatives )
            {
             before(grammarAccess.getClassificationOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:494:3: ( rule__ClassificationOperator__Alternatives )
            // InternalKerMLExpressions.g:494:4: rule__ClassificationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassificationOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:503:1: entryRuleTypeReferenceMember : ruleTypeReferenceMember EOF ;
    public final void entryRuleTypeReferenceMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:504:1: ( ruleTypeReferenceMember EOF )
            // InternalKerMLExpressions.g:505:1: ruleTypeReferenceMember EOF
            {
             before(grammarAccess.getTypeReferenceMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeReferenceMember();

            state._fsp--;

             after(grammarAccess.getTypeReferenceMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:512:1: ruleTypeReferenceMember : ( ( rule__TypeReferenceMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleTypeReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:516:2: ( ( ( rule__TypeReferenceMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:517:2: ( ( rule__TypeReferenceMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:517:2: ( ( rule__TypeReferenceMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:518:3: ( rule__TypeReferenceMember__OwnedRelatedElementAssignment )
            {
             before(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementAssignment()); 
            // InternalKerMLExpressions.g:519:3: ( rule__TypeReferenceMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:519:4: rule__TypeReferenceMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReferenceMember__OwnedRelatedElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:528:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:529:1: ( ruleTypeReference EOF )
            // InternalKerMLExpressions.g:530:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:537:1: ruleTypeReference : ( ( rule__TypeReference__OwnedRelationshipAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:541:2: ( ( ( rule__TypeReference__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:542:2: ( ( rule__TypeReference__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:542:2: ( ( rule__TypeReference__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:543:3: ( rule__TypeReference__OwnedRelationshipAssignment )
            {
             before(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipAssignment()); 
            // InternalKerMLExpressions.g:544:3: ( rule__TypeReference__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:544:4: rule__TypeReference__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__OwnedRelationshipAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleReferenceTyping"
    // InternalKerMLExpressions.g:553:1: entryRuleReferenceTyping : ruleReferenceTyping EOF ;
    public final void entryRuleReferenceTyping() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:554:1: ( ruleReferenceTyping EOF )
            // InternalKerMLExpressions.g:555:1: ruleReferenceTyping EOF
            {
             before(grammarAccess.getReferenceTypingRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceTyping();

            state._fsp--;

             after(grammarAccess.getReferenceTypingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferenceTyping"


    // $ANTLR start "ruleReferenceTyping"
    // InternalKerMLExpressions.g:562:1: ruleReferenceTyping : ( ( rule__ReferenceTyping__TypeAssignment ) ) ;
    public final void ruleReferenceTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:566:2: ( ( ( rule__ReferenceTyping__TypeAssignment ) ) )
            // InternalKerMLExpressions.g:567:2: ( ( rule__ReferenceTyping__TypeAssignment ) )
            {
            // InternalKerMLExpressions.g:567:2: ( ( rule__ReferenceTyping__TypeAssignment ) )
            // InternalKerMLExpressions.g:568:3: ( rule__ReferenceTyping__TypeAssignment )
            {
             before(grammarAccess.getReferenceTypingAccess().getTypeAssignment()); 
            // InternalKerMLExpressions.g:569:3: ( rule__ReferenceTyping__TypeAssignment )
            // InternalKerMLExpressions.g:569:4: rule__ReferenceTyping__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceTyping__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypingAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceTyping"


    // $ANTLR start "entryRuleSelfReferenceExpression"
    // InternalKerMLExpressions.g:578:1: entryRuleSelfReferenceExpression : ruleSelfReferenceExpression EOF ;
    public final void entryRuleSelfReferenceExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:579:1: ( ruleSelfReferenceExpression EOF )
            // InternalKerMLExpressions.g:580:1: ruleSelfReferenceExpression EOF
            {
             before(grammarAccess.getSelfReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfReferenceExpression();

            state._fsp--;

             after(grammarAccess.getSelfReferenceExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:587:1: ruleSelfReferenceExpression : ( ( rule__SelfReferenceExpression__OwnedRelationshipAssignment ) ) ;
    public final void ruleSelfReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:591:2: ( ( ( rule__SelfReferenceExpression__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:592:2: ( ( rule__SelfReferenceExpression__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:592:2: ( ( rule__SelfReferenceExpression__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:593:3: ( rule__SelfReferenceExpression__OwnedRelationshipAssignment )
            {
             before(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipAssignment()); 
            // InternalKerMLExpressions.g:594:3: ( rule__SelfReferenceExpression__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:594:4: rule__SelfReferenceExpression__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SelfReferenceExpression__OwnedRelationshipAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:603:1: entryRuleSelfReferenceMember : ruleSelfReferenceMember EOF ;
    public final void entryRuleSelfReferenceMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:604:1: ( ruleSelfReferenceMember EOF )
            // InternalKerMLExpressions.g:605:1: ruleSelfReferenceMember EOF
            {
             before(grammarAccess.getSelfReferenceMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfReferenceMember();

            state._fsp--;

             after(grammarAccess.getSelfReferenceMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:612:1: ruleSelfReferenceMember : ( ( rule__SelfReferenceMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleSelfReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:616:2: ( ( ( rule__SelfReferenceMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:617:2: ( ( rule__SelfReferenceMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:617:2: ( ( rule__SelfReferenceMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:618:3: ( rule__SelfReferenceMember__OwnedRelatedElementAssignment )
            {
             before(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementAssignment()); 
            // InternalKerMLExpressions.g:619:3: ( rule__SelfReferenceMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:619:4: rule__SelfReferenceMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SelfReferenceMember__OwnedRelatedElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:628:1: entryRuleEmptyFeature : ruleEmptyFeature EOF ;
    public final void entryRuleEmptyFeature() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:629:1: ( ruleEmptyFeature EOF )
            // InternalKerMLExpressions.g:630:1: ruleEmptyFeature EOF
            {
             before(grammarAccess.getEmptyFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyFeature();

            state._fsp--;

             after(grammarAccess.getEmptyFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:637:1: ruleEmptyFeature : ( () ) ;
    public final void ruleEmptyFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:641:2: ( ( () ) )
            // InternalKerMLExpressions.g:642:2: ( () )
            {
            // InternalKerMLExpressions.g:642:2: ( () )
            // InternalKerMLExpressions.g:643:3: ()
            {
             before(grammarAccess.getEmptyFeatureAccess().getFeatureAction()); 
            // InternalKerMLExpressions.g:644:3: ()
            // InternalKerMLExpressions.g:644:4: 
            {
            }

             after(grammarAccess.getEmptyFeatureAccess().getFeatureAction()); 

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
    // InternalKerMLExpressions.g:653:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:654:1: ( ruleRelationalExpression EOF )
            // InternalKerMLExpressions.g:655:1: ruleRelationalExpression EOF
            {
             before(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:662:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:666:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:667:2: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:667:2: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalKerMLExpressions.g:668:3: ( rule__RelationalExpression__Group__0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:669:3: ( rule__RelationalExpression__Group__0 )
            // InternalKerMLExpressions.g:669:4: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:678:1: entryRuleRelationalOperator : ruleRelationalOperator EOF ;
    public final void entryRuleRelationalOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:679:1: ( ruleRelationalOperator EOF )
            // InternalKerMLExpressions.g:680:1: ruleRelationalOperator EOF
            {
             before(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getRelationalOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:687:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:691:2: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:692:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:692:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalKerMLExpressions.g:693:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:694:3: ( rule__RelationalOperator__Alternatives )
            // InternalKerMLExpressions.g:694:4: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleRangeExpression"
    // InternalKerMLExpressions.g:703:1: entryRuleRangeExpression : ruleRangeExpression EOF ;
    public final void entryRuleRangeExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:704:1: ( ruleRangeExpression EOF )
            // InternalKerMLExpressions.g:705:1: ruleRangeExpression EOF
            {
             before(grammarAccess.getRangeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRangeExpression();

            state._fsp--;

             after(grammarAccess.getRangeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRangeExpression"


    // $ANTLR start "ruleRangeExpression"
    // InternalKerMLExpressions.g:712:1: ruleRangeExpression : ( ( rule__RangeExpression__Group__0 ) ) ;
    public final void ruleRangeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:716:2: ( ( ( rule__RangeExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:717:2: ( ( rule__RangeExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:717:2: ( ( rule__RangeExpression__Group__0 ) )
            // InternalKerMLExpressions.g:718:3: ( rule__RangeExpression__Group__0 )
            {
             before(grammarAccess.getRangeExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:719:3: ( rule__RangeExpression__Group__0 )
            // InternalKerMLExpressions.g:719:4: rule__RangeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRangeExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalKerMLExpressions.g:728:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:729:1: ( ruleAdditiveExpression EOF )
            // InternalKerMLExpressions.g:730:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:737:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:741:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:742:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:742:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalKerMLExpressions.g:743:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:744:3: ( rule__AdditiveExpression__Group__0 )
            // InternalKerMLExpressions.g:744:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:753:1: entryRuleAdditiveOperator : ruleAdditiveOperator EOF ;
    public final void entryRuleAdditiveOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:754:1: ( ruleAdditiveOperator EOF )
            // InternalKerMLExpressions.g:755:1: ruleAdditiveOperator EOF
            {
             before(grammarAccess.getAdditiveOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:762:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:766:2: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:767:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:767:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalKerMLExpressions.g:768:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:769:3: ( rule__AdditiveOperator__Alternatives )
            // InternalKerMLExpressions.g:769:4: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:778:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:779:1: ( ruleMultiplicativeExpression EOF )
            // InternalKerMLExpressions.g:780:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:787:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:791:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:792:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:792:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalKerMLExpressions.g:793:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:794:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalKerMLExpressions.g:794:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:803:1: entryRuleMultiplicativeOperator : ruleMultiplicativeOperator EOF ;
    public final void entryRuleMultiplicativeOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:804:1: ( ruleMultiplicativeOperator EOF )
            // InternalKerMLExpressions.g:805:1: ruleMultiplicativeOperator EOF
            {
             before(grammarAccess.getMultiplicativeOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:812:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:816:2: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:817:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:817:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalKerMLExpressions.g:818:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:819:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalKerMLExpressions.g:819:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:828:1: entryRuleExponentiationExpression : ruleExponentiationExpression EOF ;
    public final void entryRuleExponentiationExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:829:1: ( ruleExponentiationExpression EOF )
            // InternalKerMLExpressions.g:830:1: ruleExponentiationExpression EOF
            {
             before(grammarAccess.getExponentiationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExponentiationExpression();

            state._fsp--;

             after(grammarAccess.getExponentiationExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:837:1: ruleExponentiationExpression : ( ( rule__ExponentiationExpression__Group__0 ) ) ;
    public final void ruleExponentiationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:841:2: ( ( ( rule__ExponentiationExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:842:2: ( ( rule__ExponentiationExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:842:2: ( ( rule__ExponentiationExpression__Group__0 ) )
            // InternalKerMLExpressions.g:843:3: ( rule__ExponentiationExpression__Group__0 )
            {
             before(grammarAccess.getExponentiationExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:844:3: ( rule__ExponentiationExpression__Group__0 )
            // InternalKerMLExpressions.g:844:4: rule__ExponentiationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExponentiationExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:853:1: entryRuleExponentiationOperator : ruleExponentiationOperator EOF ;
    public final void entryRuleExponentiationOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:854:1: ( ruleExponentiationOperator EOF )
            // InternalKerMLExpressions.g:855:1: ruleExponentiationOperator EOF
            {
             before(grammarAccess.getExponentiationOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleExponentiationOperator();

            state._fsp--;

             after(grammarAccess.getExponentiationOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:862:1: ruleExponentiationOperator : ( ( rule__ExponentiationOperator__Alternatives ) ) ;
    public final void ruleExponentiationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:866:2: ( ( ( rule__ExponentiationOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:867:2: ( ( rule__ExponentiationOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:867:2: ( ( rule__ExponentiationOperator__Alternatives ) )
            // InternalKerMLExpressions.g:868:3: ( rule__ExponentiationOperator__Alternatives )
            {
             before(grammarAccess.getExponentiationOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:869:3: ( rule__ExponentiationOperator__Alternatives )
            // InternalKerMLExpressions.g:869:4: rule__ExponentiationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExponentiationOperatorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalKerMLExpressions.g:878:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:879:1: ( ruleUnaryExpression EOF )
            // InternalKerMLExpressions.g:880:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:887:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:891:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:892:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:892:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalKerMLExpressions.g:893:3: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:894:3: ( rule__UnaryExpression__Alternatives )
            // InternalKerMLExpressions.g:894:4: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:903:1: entryRuleUnaryOperator : ruleUnaryOperator EOF ;
    public final void entryRuleUnaryOperator() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:904:1: ( ruleUnaryOperator EOF )
            // InternalKerMLExpressions.g:905:1: ruleUnaryOperator EOF
            {
             before(grammarAccess.getUnaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:912:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:916:2: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalKerMLExpressions.g:917:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalKerMLExpressions.g:917:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalKerMLExpressions.g:918:3: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:919:3: ( rule__UnaryOperator__Alternatives )
            // InternalKerMLExpressions.g:919:4: rule__UnaryOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:928:1: entryRuleExtentExpression : ruleExtentExpression EOF ;
    public final void entryRuleExtentExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:929:1: ( ruleExtentExpression EOF )
            // InternalKerMLExpressions.g:930:1: ruleExtentExpression EOF
            {
             before(grammarAccess.getExtentExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExtentExpression();

            state._fsp--;

             after(grammarAccess.getExtentExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:937:1: ruleExtentExpression : ( ( rule__ExtentExpression__Alternatives ) ) ;
    public final void ruleExtentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:941:2: ( ( ( rule__ExtentExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:942:2: ( ( rule__ExtentExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:942:2: ( ( rule__ExtentExpression__Alternatives ) )
            // InternalKerMLExpressions.g:943:3: ( rule__ExtentExpression__Alternatives )
            {
             before(grammarAccess.getExtentExpressionAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:944:3: ( rule__ExtentExpression__Alternatives )
            // InternalKerMLExpressions.g:944:4: rule__ExtentExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExtentExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalKerMLExpressions.g:953:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:954:1: ( rulePrimaryExpression EOF )
            // InternalKerMLExpressions.g:955:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalKerMLExpressions.g:962:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Group__0 ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:966:2: ( ( ( rule__PrimaryExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:967:2: ( ( rule__PrimaryExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:967:2: ( ( rule__PrimaryExpression__Group__0 ) )
            // InternalKerMLExpressions.g:968:3: ( rule__PrimaryExpression__Group__0 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:969:3: ( rule__PrimaryExpression__Group__0 )
            // InternalKerMLExpressions.g:969:4: rule__PrimaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleExpressionBodyMember"
    // InternalKerMLExpressions.g:978:1: entryRuleExpressionBodyMember : ruleExpressionBodyMember EOF ;
    public final void entryRuleExpressionBodyMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:979:1: ( ruleExpressionBodyMember EOF )
            // InternalKerMLExpressions.g:980:1: ruleExpressionBodyMember EOF
            {
             before(grammarAccess.getExpressionBodyMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBodyMember();

            state._fsp--;

             after(grammarAccess.getExpressionBodyMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionBodyMember"


    // $ANTLR start "ruleExpressionBodyMember"
    // InternalKerMLExpressions.g:987:1: ruleExpressionBodyMember : ( ( rule__ExpressionBodyMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleExpressionBodyMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:991:2: ( ( ( rule__ExpressionBodyMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:992:2: ( ( rule__ExpressionBodyMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:992:2: ( ( rule__ExpressionBodyMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:993:3: ( rule__ExpressionBodyMember__OwnedRelatedElementAssignment )
            {
             before(grammarAccess.getExpressionBodyMemberAccess().getOwnedRelatedElementAssignment()); 
            // InternalKerMLExpressions.g:994:3: ( rule__ExpressionBodyMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:994:4: rule__ExpressionBodyMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBodyMember__OwnedRelatedElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBodyMemberAccess().getOwnedRelatedElementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBodyMember"


    // $ANTLR start "entryRuleFunctionReferenceMember"
    // InternalKerMLExpressions.g:1003:1: entryRuleFunctionReferenceMember : ruleFunctionReferenceMember EOF ;
    public final void entryRuleFunctionReferenceMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1004:1: ( ruleFunctionReferenceMember EOF )
            // InternalKerMLExpressions.g:1005:1: ruleFunctionReferenceMember EOF
            {
             before(grammarAccess.getFunctionReferenceMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionReferenceMember();

            state._fsp--;

             after(grammarAccess.getFunctionReferenceMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionReferenceMember"


    // $ANTLR start "ruleFunctionReferenceMember"
    // InternalKerMLExpressions.g:1012:1: ruleFunctionReferenceMember : ( ( rule__FunctionReferenceMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleFunctionReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1016:2: ( ( ( rule__FunctionReferenceMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:1017:2: ( ( rule__FunctionReferenceMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:1017:2: ( ( rule__FunctionReferenceMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:1018:3: ( rule__FunctionReferenceMember__OwnedRelatedElementAssignment )
            {
             before(grammarAccess.getFunctionReferenceMemberAccess().getOwnedRelatedElementAssignment()); 
            // InternalKerMLExpressions.g:1019:3: ( rule__FunctionReferenceMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:1019:4: rule__FunctionReferenceMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReferenceMember__OwnedRelatedElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReferenceMemberAccess().getOwnedRelatedElementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionReferenceMember"


    // $ANTLR start "entryRuleFunctionReference"
    // InternalKerMLExpressions.g:1028:1: entryRuleFunctionReference : ruleFunctionReference EOF ;
    public final void entryRuleFunctionReference() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1029:1: ( ruleFunctionReference EOF )
            // InternalKerMLExpressions.g:1030:1: ruleFunctionReference EOF
            {
             before(grammarAccess.getFunctionReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionReference();

            state._fsp--;

             after(grammarAccess.getFunctionReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionReference"


    // $ANTLR start "ruleFunctionReference"
    // InternalKerMLExpressions.g:1037:1: ruleFunctionReference : ( ( rule__FunctionReference__OwnedRelationshipAssignment ) ) ;
    public final void ruleFunctionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1041:2: ( ( ( rule__FunctionReference__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:1042:2: ( ( rule__FunctionReference__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:1042:2: ( ( rule__FunctionReference__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:1043:3: ( rule__FunctionReference__OwnedRelationshipAssignment )
            {
             before(grammarAccess.getFunctionReferenceAccess().getOwnedRelationshipAssignment()); 
            // InternalKerMLExpressions.g:1044:3: ( rule__FunctionReference__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:1044:4: rule__FunctionReference__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReference__OwnedRelationshipAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReferenceAccess().getOwnedRelationshipAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionReference"


    // $ANTLR start "entryRuleFeatureChainExpression"
    // InternalKerMLExpressions.g:1053:1: entryRuleFeatureChainExpression : ruleFeatureChainExpression EOF ;
    public final void entryRuleFeatureChainExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1054:1: ( ruleFeatureChainExpression EOF )
            // InternalKerMLExpressions.g:1055:1: ruleFeatureChainExpression EOF
            {
             before(grammarAccess.getFeatureChainExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureChainExpression();

            state._fsp--;

             after(grammarAccess.getFeatureChainExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeatureChainExpression"


    // $ANTLR start "ruleFeatureChainExpression"
    // InternalKerMLExpressions.g:1062:1: ruleFeatureChainExpression : ( ( rule__FeatureChainExpression__OwnedRelationshipAssignment ) ) ;
    public final void ruleFeatureChainExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1066:2: ( ( ( rule__FeatureChainExpression__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:1067:2: ( ( rule__FeatureChainExpression__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:1067:2: ( ( rule__FeatureChainExpression__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:1068:3: ( rule__FeatureChainExpression__OwnedRelationshipAssignment )
            {
             before(grammarAccess.getFeatureChainExpressionAccess().getOwnedRelationshipAssignment()); 
            // InternalKerMLExpressions.g:1069:3: ( rule__FeatureChainExpression__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:1069:4: rule__FeatureChainExpression__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChainExpression__OwnedRelationshipAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFeatureChainExpressionAccess().getOwnedRelationshipAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureChainExpression"


    // $ANTLR start "entryRuleFeatureChainMember"
    // InternalKerMLExpressions.g:1078:1: entryRuleFeatureChainMember : ruleFeatureChainMember EOF ;
    public final void entryRuleFeatureChainMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1079:1: ( ruleFeatureChainMember EOF )
            // InternalKerMLExpressions.g:1080:1: ruleFeatureChainMember EOF
            {
             before(grammarAccess.getFeatureChainMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureChainMember();

            state._fsp--;

             after(grammarAccess.getFeatureChainMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeatureChainMember"


    // $ANTLR start "ruleFeatureChainMember"
    // InternalKerMLExpressions.g:1087:1: ruleFeatureChainMember : ( ( rule__FeatureChainMember__Alternatives ) ) ;
    public final void ruleFeatureChainMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1091:2: ( ( ( rule__FeatureChainMember__Alternatives ) ) )
            // InternalKerMLExpressions.g:1092:2: ( ( rule__FeatureChainMember__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1092:2: ( ( rule__FeatureChainMember__Alternatives ) )
            // InternalKerMLExpressions.g:1093:3: ( rule__FeatureChainMember__Alternatives )
            {
             before(grammarAccess.getFeatureChainMemberAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:1094:3: ( rule__FeatureChainMember__Alternatives )
            // InternalKerMLExpressions.g:1094:4: rule__FeatureChainMember__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChainMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureChainMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureChainMember"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalKerMLExpressions.g:1103:1: entryRuleBaseExpression : ruleBaseExpression EOF ;
    public final void entryRuleBaseExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1104:1: ( ruleBaseExpression EOF )
            // InternalKerMLExpressions.g:1105:1: ruleBaseExpression EOF
            {
             before(grammarAccess.getBaseExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseExpression();

            state._fsp--;

             after(grammarAccess.getBaseExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1112:1: ruleBaseExpression : ( ( rule__BaseExpression__Alternatives ) ) ;
    public final void ruleBaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1116:2: ( ( ( rule__BaseExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:1117:2: ( ( rule__BaseExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1117:2: ( ( rule__BaseExpression__Alternatives ) )
            // InternalKerMLExpressions.g:1118:3: ( rule__BaseExpression__Alternatives )
            {
             before(grammarAccess.getBaseExpressionAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:1119:3: ( rule__BaseExpression__Alternatives )
            // InternalKerMLExpressions.g:1119:4: rule__BaseExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleExpressionBody"
    // InternalKerMLExpressions.g:1128:1: entryRuleExpressionBody : ruleExpressionBody EOF ;
    public final void entryRuleExpressionBody() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1129:1: ( ruleExpressionBody EOF )
            // InternalKerMLExpressions.g:1130:1: ruleExpressionBody EOF
            {
             before(grammarAccess.getExpressionBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBody();

            state._fsp--;

             after(grammarAccess.getExpressionBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionBody"


    // $ANTLR start "ruleExpressionBody"
    // InternalKerMLExpressions.g:1137:1: ruleExpressionBody : ( ( rule__ExpressionBody__Group__0 ) ) ;
    public final void ruleExpressionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1141:2: ( ( ( rule__ExpressionBody__Group__0 ) ) )
            // InternalKerMLExpressions.g:1142:2: ( ( rule__ExpressionBody__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1142:2: ( ( rule__ExpressionBody__Group__0 ) )
            // InternalKerMLExpressions.g:1143:3: ( rule__ExpressionBody__Group__0 )
            {
             before(grammarAccess.getExpressionBodyAccess().getGroup()); 
            // InternalKerMLExpressions.g:1144:3: ( rule__ExpressionBody__Group__0 )
            // InternalKerMLExpressions.g:1144:4: rule__ExpressionBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBody"


    // $ANTLR start "entryRuleResultExpressionMember"
    // InternalKerMLExpressions.g:1153:1: entryRuleResultExpressionMember : ruleResultExpressionMember EOF ;
    public final void entryRuleResultExpressionMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1154:1: ( ruleResultExpressionMember EOF )
            // InternalKerMLExpressions.g:1155:1: ruleResultExpressionMember EOF
            {
             before(grammarAccess.getResultExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleResultExpressionMember();

            state._fsp--;

             after(grammarAccess.getResultExpressionMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1162:1: ruleResultExpressionMember : ( ( rule__ResultExpressionMember__OwnedRelatedElementAssignment ) ) ;
    public final void ruleResultExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1166:2: ( ( ( rule__ResultExpressionMember__OwnedRelatedElementAssignment ) ) )
            // InternalKerMLExpressions.g:1167:2: ( ( rule__ResultExpressionMember__OwnedRelatedElementAssignment ) )
            {
            // InternalKerMLExpressions.g:1167:2: ( ( rule__ResultExpressionMember__OwnedRelatedElementAssignment ) )
            // InternalKerMLExpressions.g:1168:3: ( rule__ResultExpressionMember__OwnedRelatedElementAssignment )
            {
             before(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementAssignment()); 
            // InternalKerMLExpressions.g:1169:3: ( rule__ResultExpressionMember__OwnedRelatedElementAssignment )
            // InternalKerMLExpressions.g:1169:4: rule__ResultExpressionMember__OwnedRelatedElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ResultExpressionMember__OwnedRelatedElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1178:1: entryRuleBodyParameterMember : ruleBodyParameterMember EOF ;
    public final void entryRuleBodyParameterMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1179:1: ( ruleBodyParameterMember EOF )
            // InternalKerMLExpressions.g:1180:1: ruleBodyParameterMember EOF
            {
             before(grammarAccess.getBodyParameterMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleBodyParameterMember();

            state._fsp--;

             after(grammarAccess.getBodyParameterMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1187:1: ruleBodyParameterMember : ( ( rule__BodyParameterMember__Group__0 ) ) ;
    public final void ruleBodyParameterMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1191:2: ( ( ( rule__BodyParameterMember__Group__0 ) ) )
            // InternalKerMLExpressions.g:1192:2: ( ( rule__BodyParameterMember__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1192:2: ( ( rule__BodyParameterMember__Group__0 ) )
            // InternalKerMLExpressions.g:1193:3: ( rule__BodyParameterMember__Group__0 )
            {
             before(grammarAccess.getBodyParameterMemberAccess().getGroup()); 
            // InternalKerMLExpressions.g:1194:3: ( rule__BodyParameterMember__Group__0 )
            // InternalKerMLExpressions.g:1194:4: rule__BodyParameterMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyParameterMemberAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1203:1: entryRuleBodyParameter : ruleBodyParameter EOF ;
    public final void entryRuleBodyParameter() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1204:1: ( ruleBodyParameter EOF )
            // InternalKerMLExpressions.g:1205:1: ruleBodyParameter EOF
            {
             before(grammarAccess.getBodyParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleBodyParameter();

            state._fsp--;

             after(grammarAccess.getBodyParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1212:1: ruleBodyParameter : ( () ) ;
    public final void ruleBodyParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1216:2: ( ( () ) )
            // InternalKerMLExpressions.g:1217:2: ( () )
            {
            // InternalKerMLExpressions.g:1217:2: ( () )
            // InternalKerMLExpressions.g:1218:3: ()
            {
             before(grammarAccess.getBodyParameterAccess().getFeatureAction()); 
            // InternalKerMLExpressions.g:1219:3: ()
            // InternalKerMLExpressions.g:1219:4: 
            {
            }

             after(grammarAccess.getBodyParameterAccess().getFeatureAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyParameter"


    // $ANTLR start "entryRuleSequenceExpression"
    // InternalKerMLExpressions.g:1228:1: entryRuleSequenceExpression : ruleSequenceExpression EOF ;
    public final void entryRuleSequenceExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1229:1: ( ruleSequenceExpression EOF )
            // InternalKerMLExpressions.g:1230:1: ruleSequenceExpression EOF
            {
             before(grammarAccess.getSequenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceExpression();

            state._fsp--;

             after(grammarAccess.getSequenceExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1237:1: ruleSequenceExpression : ( ( rule__SequenceExpression__Group__0 ) ) ;
    public final void ruleSequenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1241:2: ( ( ( rule__SequenceExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1242:2: ( ( rule__SequenceExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1242:2: ( ( rule__SequenceExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1243:3: ( rule__SequenceExpression__Group__0 )
            {
             before(grammarAccess.getSequenceExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:1244:3: ( rule__SequenceExpression__Group__0 )
            // InternalKerMLExpressions.g:1244:4: rule__SequenceExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceExpressionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFeatureReferenceExpression"
    // InternalKerMLExpressions.g:1253:1: entryRuleFeatureReferenceExpression : ruleFeatureReferenceExpression EOF ;
    public final void entryRuleFeatureReferenceExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1254:1: ( ruleFeatureReferenceExpression EOF )
            // InternalKerMLExpressions.g:1255:1: ruleFeatureReferenceExpression EOF
            {
             before(grammarAccess.getFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureReferenceExpression();

            state._fsp--;

             after(grammarAccess.getFeatureReferenceExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1262:1: ruleFeatureReferenceExpression : ( ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment ) ) ;
    public final void ruleFeatureReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1266:2: ( ( ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment ) ) )
            // InternalKerMLExpressions.g:1267:2: ( ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment ) )
            {
            // InternalKerMLExpressions.g:1267:2: ( ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment ) )
            // InternalKerMLExpressions.g:1268:3: ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment )
            {
             before(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipAssignment()); 
            // InternalKerMLExpressions.g:1269:3: ( rule__FeatureReferenceExpression__OwnedRelationshipAssignment )
            // InternalKerMLExpressions.g:1269:4: rule__FeatureReferenceExpression__OwnedRelationshipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureReferenceExpression__OwnedRelationshipAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1278:1: entryRuleFeatureReferenceMember : ruleFeatureReferenceMember EOF ;
    public final void entryRuleFeatureReferenceMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1279:1: ( ruleFeatureReferenceMember EOF )
            // InternalKerMLExpressions.g:1280:1: ruleFeatureReferenceMember EOF
            {
             before(grammarAccess.getFeatureReferenceMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureReferenceMember();

            state._fsp--;

             after(grammarAccess.getFeatureReferenceMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1287:1: ruleFeatureReferenceMember : ( ( rule__FeatureReferenceMember__MemberElementAssignment ) ) ;
    public final void ruleFeatureReferenceMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1291:2: ( ( ( rule__FeatureReferenceMember__MemberElementAssignment ) ) )
            // InternalKerMLExpressions.g:1292:2: ( ( rule__FeatureReferenceMember__MemberElementAssignment ) )
            {
            // InternalKerMLExpressions.g:1292:2: ( ( rule__FeatureReferenceMember__MemberElementAssignment ) )
            // InternalKerMLExpressions.g:1293:3: ( rule__FeatureReferenceMember__MemberElementAssignment )
            {
             before(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementAssignment()); 
            // InternalKerMLExpressions.g:1294:3: ( rule__FeatureReferenceMember__MemberElementAssignment )
            // InternalKerMLExpressions.g:1294:4: rule__FeatureReferenceMember__MemberElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureReferenceMember__MemberElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1303:1: entryRuleInvocationExpression : ruleInvocationExpression EOF ;
    public final void entryRuleInvocationExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1304:1: ( ruleInvocationExpression EOF )
            // InternalKerMLExpressions.g:1305:1: ruleInvocationExpression EOF
            {
             before(grammarAccess.getInvocationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleInvocationExpression();

            state._fsp--;

             after(grammarAccess.getInvocationExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1312:1: ruleInvocationExpression : ( ( rule__InvocationExpression__Group__0 ) ) ;
    public final void ruleInvocationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1316:2: ( ( ( rule__InvocationExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1317:2: ( ( rule__InvocationExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1317:2: ( ( rule__InvocationExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1318:3: ( rule__InvocationExpression__Group__0 )
            {
             before(grammarAccess.getInvocationExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:1319:3: ( rule__InvocationExpression__Group__0 )
            // InternalKerMLExpressions.g:1319:4: rule__InvocationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvocationExpressionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleOwnedFeatureTyping"
    // InternalKerMLExpressions.g:1328:1: entryRuleOwnedFeatureTyping : ruleOwnedFeatureTyping EOF ;
    public final void entryRuleOwnedFeatureTyping() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1329:1: ( ruleOwnedFeatureTyping EOF )
            // InternalKerMLExpressions.g:1330:1: ruleOwnedFeatureTyping EOF
            {
             before(grammarAccess.getOwnedFeatureTypingRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnedFeatureTyping();

            state._fsp--;

             after(grammarAccess.getOwnedFeatureTypingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1337:1: ruleOwnedFeatureTyping : ( ( rule__OwnedFeatureTyping__Alternatives ) ) ;
    public final void ruleOwnedFeatureTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1341:2: ( ( ( rule__OwnedFeatureTyping__Alternatives ) ) )
            // InternalKerMLExpressions.g:1342:2: ( ( rule__OwnedFeatureTyping__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1342:2: ( ( rule__OwnedFeatureTyping__Alternatives ) )
            // InternalKerMLExpressions.g:1343:3: ( rule__OwnedFeatureTyping__Alternatives )
            {
             before(grammarAccess.getOwnedFeatureTypingAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:1344:3: ( rule__OwnedFeatureTyping__Alternatives )
            // InternalKerMLExpressions.g:1344:4: rule__OwnedFeatureTyping__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OwnedFeatureTyping__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOwnedFeatureTypingAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFeatureChain"
    // InternalKerMLExpressions.g:1353:1: entryRuleFeatureChain : ruleFeatureChain EOF ;
    public final void entryRuleFeatureChain() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1354:1: ( ruleFeatureChain EOF )
            // InternalKerMLExpressions.g:1355:1: ruleFeatureChain EOF
            {
             before(grammarAccess.getFeatureChainRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureChain();

            state._fsp--;

             after(grammarAccess.getFeatureChainRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeatureChain"


    // $ANTLR start "ruleFeatureChain"
    // InternalKerMLExpressions.g:1362:1: ruleFeatureChain : ( ( rule__FeatureChain__Group__0 ) ) ;
    public final void ruleFeatureChain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1366:2: ( ( ( rule__FeatureChain__Group__0 ) ) )
            // InternalKerMLExpressions.g:1367:2: ( ( rule__FeatureChain__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1367:2: ( ( rule__FeatureChain__Group__0 ) )
            // InternalKerMLExpressions.g:1368:3: ( rule__FeatureChain__Group__0 )
            {
             before(grammarAccess.getFeatureChainAccess().getGroup()); 
            // InternalKerMLExpressions.g:1369:3: ( rule__FeatureChain__Group__0 )
            // InternalKerMLExpressions.g:1369:4: rule__FeatureChain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureChainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureChain"


    // $ANTLR start "entryRuleOwnedFeatureChaining"
    // InternalKerMLExpressions.g:1378:1: entryRuleOwnedFeatureChaining : ruleOwnedFeatureChaining EOF ;
    public final void entryRuleOwnedFeatureChaining() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1379:1: ( ruleOwnedFeatureChaining EOF )
            // InternalKerMLExpressions.g:1380:1: ruleOwnedFeatureChaining EOF
            {
             before(grammarAccess.getOwnedFeatureChainingRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnedFeatureChaining();

            state._fsp--;

             after(grammarAccess.getOwnedFeatureChainingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOwnedFeatureChaining"


    // $ANTLR start "ruleOwnedFeatureChaining"
    // InternalKerMLExpressions.g:1387:1: ruleOwnedFeatureChaining : ( ( rule__OwnedFeatureChaining__ChainingFeatureAssignment ) ) ;
    public final void ruleOwnedFeatureChaining() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1391:2: ( ( ( rule__OwnedFeatureChaining__ChainingFeatureAssignment ) ) )
            // InternalKerMLExpressions.g:1392:2: ( ( rule__OwnedFeatureChaining__ChainingFeatureAssignment ) )
            {
            // InternalKerMLExpressions.g:1392:2: ( ( rule__OwnedFeatureChaining__ChainingFeatureAssignment ) )
            // InternalKerMLExpressions.g:1393:3: ( rule__OwnedFeatureChaining__ChainingFeatureAssignment )
            {
             before(grammarAccess.getOwnedFeatureChainingAccess().getChainingFeatureAssignment()); 
            // InternalKerMLExpressions.g:1394:3: ( rule__OwnedFeatureChaining__ChainingFeatureAssignment )
            // InternalKerMLExpressions.g:1394:4: rule__OwnedFeatureChaining__ChainingFeatureAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OwnedFeatureChaining__ChainingFeatureAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOwnedFeatureChainingAccess().getChainingFeatureAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedFeatureChaining"


    // $ANTLR start "ruleArgumentList"
    // InternalKerMLExpressions.g:1404:1: ruleArgumentList : ( ( rule__ArgumentList__Group__0 ) ) ;
    public final void ruleArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1408:2: ( ( ( rule__ArgumentList__Group__0 ) ) )
            // InternalKerMLExpressions.g:1409:2: ( ( rule__ArgumentList__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1409:2: ( ( rule__ArgumentList__Group__0 ) )
            // InternalKerMLExpressions.g:1410:3: ( rule__ArgumentList__Group__0 )
            {
             before(grammarAccess.getArgumentListAccess().getGroup()); 
            // InternalKerMLExpressions.g:1411:3: ( rule__ArgumentList__Group__0 )
            // InternalKerMLExpressions.g:1411:4: rule__ArgumentList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentListAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1421:1: rulePositionalArgumentList : ( ( rule__PositionalArgumentList__Group__0 ) ) ;
    public final void rulePositionalArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1425:2: ( ( ( rule__PositionalArgumentList__Group__0 ) ) )
            // InternalKerMLExpressions.g:1426:2: ( ( rule__PositionalArgumentList__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1426:2: ( ( rule__PositionalArgumentList__Group__0 ) )
            // InternalKerMLExpressions.g:1427:3: ( rule__PositionalArgumentList__Group__0 )
            {
             before(grammarAccess.getPositionalArgumentListAccess().getGroup()); 
            // InternalKerMLExpressions.g:1428:3: ( rule__PositionalArgumentList__Group__0 )
            // InternalKerMLExpressions.g:1428:4: rule__PositionalArgumentList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionalArgumentListAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1438:1: ruleNamedArgumentList : ( ( rule__NamedArgumentList__Group__0 ) ) ;
    public final void ruleNamedArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1442:2: ( ( ( rule__NamedArgumentList__Group__0 ) ) )
            // InternalKerMLExpressions.g:1443:2: ( ( rule__NamedArgumentList__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1443:2: ( ( rule__NamedArgumentList__Group__0 ) )
            // InternalKerMLExpressions.g:1444:3: ( rule__NamedArgumentList__Group__0 )
            {
             before(grammarAccess.getNamedArgumentListAccess().getGroup()); 
            // InternalKerMLExpressions.g:1445:3: ( rule__NamedArgumentList__Group__0 )
            // InternalKerMLExpressions.g:1445:4: rule__NamedArgumentList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentListAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1454:1: entryRuleNamedExpressionMember : ruleNamedExpressionMember EOF ;
    public final void entryRuleNamedExpressionMember() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1455:1: ( ruleNamedExpressionMember EOF )
            // InternalKerMLExpressions.g:1456:1: ruleNamedExpressionMember EOF
            {
             before(grammarAccess.getNamedExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedExpressionMember();

            state._fsp--;

             after(grammarAccess.getNamedExpressionMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1463:1: ruleNamedExpressionMember : ( ( rule__NamedExpressionMember__Group__0 ) ) ;
    public final void ruleNamedExpressionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1467:2: ( ( ( rule__NamedExpressionMember__Group__0 ) ) )
            // InternalKerMLExpressions.g:1468:2: ( ( rule__NamedExpressionMember__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1468:2: ( ( rule__NamedExpressionMember__Group__0 ) )
            // InternalKerMLExpressions.g:1469:3: ( rule__NamedExpressionMember__Group__0 )
            {
             before(grammarAccess.getNamedExpressionMemberAccess().getGroup()); 
            // InternalKerMLExpressions.g:1470:3: ( rule__NamedExpressionMember__Group__0 )
            // InternalKerMLExpressions.g:1470:4: rule__NamedExpressionMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedExpressionMemberAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1479:1: entryRuleNullExpression : ruleNullExpression EOF ;
    public final void entryRuleNullExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1480:1: ( ruleNullExpression EOF )
            // InternalKerMLExpressions.g:1481:1: ruleNullExpression EOF
            {
             before(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNullExpression();

            state._fsp--;

             after(grammarAccess.getNullExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1488:1: ruleNullExpression : ( ( rule__NullExpression__Group__0 ) ) ;
    public final void ruleNullExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1492:2: ( ( ( rule__NullExpression__Group__0 ) ) )
            // InternalKerMLExpressions.g:1493:2: ( ( rule__NullExpression__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1493:2: ( ( rule__NullExpression__Group__0 ) )
            // InternalKerMLExpressions.g:1494:3: ( rule__NullExpression__Group__0 )
            {
             before(grammarAccess.getNullExpressionAccess().getGroup()); 
            // InternalKerMLExpressions.g:1495:3: ( rule__NullExpression__Group__0 )
            // InternalKerMLExpressions.g:1495:4: rule__NullExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1504:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1505:1: ( ruleLiteralExpression EOF )
            // InternalKerMLExpressions.g:1506:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1513:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1517:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalKerMLExpressions.g:1518:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1518:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalKerMLExpressions.g:1519:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:1520:3: ( rule__LiteralExpression__Alternatives )
            // InternalKerMLExpressions.g:1520:4: rule__LiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1529:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1530:1: ( ruleLiteralBoolean EOF )
            // InternalKerMLExpressions.g:1531:1: ruleLiteralBoolean EOF
            {
             before(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralBoolean();

            state._fsp--;

             after(grammarAccess.getLiteralBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1538:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__ValueAssignment ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1542:2: ( ( ( rule__LiteralBoolean__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1543:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1543:2: ( ( rule__LiteralBoolean__ValueAssignment ) )
            // InternalKerMLExpressions.g:1544:3: ( rule__LiteralBoolean__ValueAssignment )
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 
            // InternalKerMLExpressions.g:1545:3: ( rule__LiteralBoolean__ValueAssignment )
            // InternalKerMLExpressions.g:1545:4: rule__LiteralBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1554:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1555:1: ( ruleBooleanValue EOF )
            // InternalKerMLExpressions.g:1556:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1563:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1567:2: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // InternalKerMLExpressions.g:1568:2: ( ( rule__BooleanValue__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1568:2: ( ( rule__BooleanValue__Alternatives ) )
            // InternalKerMLExpressions.g:1569:3: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:1570:3: ( rule__BooleanValue__Alternatives )
            // InternalKerMLExpressions.g:1570:4: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1579:1: entryRuleLiteralString : ruleLiteralString EOF ;
    public final void entryRuleLiteralString() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1580:1: ( ruleLiteralString EOF )
            // InternalKerMLExpressions.g:1581:1: ruleLiteralString EOF
            {
             before(grammarAccess.getLiteralStringRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralString();

            state._fsp--;

             after(grammarAccess.getLiteralStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1588:1: ruleLiteralString : ( ( rule__LiteralString__ValueAssignment ) ) ;
    public final void ruleLiteralString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1592:2: ( ( ( rule__LiteralString__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1593:2: ( ( rule__LiteralString__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1593:2: ( ( rule__LiteralString__ValueAssignment ) )
            // InternalKerMLExpressions.g:1594:3: ( rule__LiteralString__ValueAssignment )
            {
             before(grammarAccess.getLiteralStringAccess().getValueAssignment()); 
            // InternalKerMLExpressions.g:1595:3: ( rule__LiteralString__ValueAssignment )
            // InternalKerMLExpressions.g:1595:4: rule__LiteralString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralStringAccess().getValueAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1604:1: entryRuleLiteralInteger : ruleLiteralInteger EOF ;
    public final void entryRuleLiteralInteger() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1605:1: ( ruleLiteralInteger EOF )
            // InternalKerMLExpressions.g:1606:1: ruleLiteralInteger EOF
            {
             before(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralInteger();

            state._fsp--;

             after(grammarAccess.getLiteralIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1613:1: ruleLiteralInteger : ( ( rule__LiteralInteger__ValueAssignment ) ) ;
    public final void ruleLiteralInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1617:2: ( ( ( rule__LiteralInteger__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1618:2: ( ( rule__LiteralInteger__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1618:2: ( ( rule__LiteralInteger__ValueAssignment ) )
            // InternalKerMLExpressions.g:1619:3: ( rule__LiteralInteger__ValueAssignment )
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueAssignment()); 
            // InternalKerMLExpressions.g:1620:3: ( rule__LiteralInteger__ValueAssignment )
            // InternalKerMLExpressions.g:1620:4: rule__LiteralInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralIntegerAccess().getValueAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1629:1: entryRuleLiteralReal : ruleLiteralReal EOF ;
    public final void entryRuleLiteralReal() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1630:1: ( ruleLiteralReal EOF )
            // InternalKerMLExpressions.g:1631:1: ruleLiteralReal EOF
            {
             before(grammarAccess.getLiteralRealRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralReal();

            state._fsp--;

             after(grammarAccess.getLiteralRealRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1638:1: ruleLiteralReal : ( ( rule__LiteralReal__ValueAssignment ) ) ;
    public final void ruleLiteralReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1642:2: ( ( ( rule__LiteralReal__ValueAssignment ) ) )
            // InternalKerMLExpressions.g:1643:2: ( ( rule__LiteralReal__ValueAssignment ) )
            {
            // InternalKerMLExpressions.g:1643:2: ( ( rule__LiteralReal__ValueAssignment ) )
            // InternalKerMLExpressions.g:1644:3: ( rule__LiteralReal__ValueAssignment )
            {
             before(grammarAccess.getLiteralRealAccess().getValueAssignment()); 
            // InternalKerMLExpressions.g:1645:3: ( rule__LiteralReal__ValueAssignment )
            // InternalKerMLExpressions.g:1645:4: rule__LiteralReal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralReal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralRealAccess().getValueAssignment()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:1654:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1655:1: ( ruleRealValue EOF )
            // InternalKerMLExpressions.g:1656:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            ruleRealValue();

            state._fsp--;

             after(grammarAccess.getRealValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1663:1: ruleRealValue : ( ( rule__RealValue__Alternatives ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1667:2: ( ( ( rule__RealValue__Alternatives ) ) )
            // InternalKerMLExpressions.g:1668:2: ( ( rule__RealValue__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1668:2: ( ( rule__RealValue__Alternatives ) )
            // InternalKerMLExpressions.g:1669:3: ( rule__RealValue__Alternatives )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:1670:3: ( rule__RealValue__Alternatives )
            // InternalKerMLExpressions.g:1670:4: rule__RealValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLiteralInfinity"
    // InternalKerMLExpressions.g:1679:1: entryRuleLiteralInfinity : ruleLiteralInfinity EOF ;
    public final void entryRuleLiteralInfinity() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1680:1: ( ruleLiteralInfinity EOF )
            // InternalKerMLExpressions.g:1681:1: ruleLiteralInfinity EOF
            {
             before(grammarAccess.getLiteralInfinityRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralInfinity();

            state._fsp--;

             after(grammarAccess.getLiteralInfinityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteralInfinity"


    // $ANTLR start "ruleLiteralInfinity"
    // InternalKerMLExpressions.g:1688:1: ruleLiteralInfinity : ( ( rule__LiteralInfinity__Group__0 ) ) ;
    public final void ruleLiteralInfinity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1692:2: ( ( ( rule__LiteralInfinity__Group__0 ) ) )
            // InternalKerMLExpressions.g:1693:2: ( ( rule__LiteralInfinity__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1693:2: ( ( rule__LiteralInfinity__Group__0 ) )
            // InternalKerMLExpressions.g:1694:3: ( rule__LiteralInfinity__Group__0 )
            {
             before(grammarAccess.getLiteralInfinityAccess().getGroup()); 
            // InternalKerMLExpressions.g:1695:3: ( rule__LiteralInfinity__Group__0 )
            // InternalKerMLExpressions.g:1695:4: rule__LiteralInfinity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LiteralInfinity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralInfinityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralInfinity"


    // $ANTLR start "entryRuleName"
    // InternalKerMLExpressions.g:1704:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1705:1: ( ruleName EOF )
            // InternalKerMLExpressions.g:1706:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1713:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1717:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalKerMLExpressions.g:1718:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalKerMLExpressions.g:1718:2: ( ( rule__Name__Alternatives ) )
            // InternalKerMLExpressions.g:1719:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalKerMLExpressions.g:1720:3: ( rule__Name__Alternatives )
            // InternalKerMLExpressions.g:1720:4: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleQualification"
    // InternalKerMLExpressions.g:1729:1: entryRuleQualification : ruleQualification EOF ;
    public final void entryRuleQualification() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1730:1: ( ruleQualification EOF )
            // InternalKerMLExpressions.g:1731:1: ruleQualification EOF
            {
             before(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getQualificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalKerMLExpressions.g:1738:1: ruleQualification : ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) ) ;
    public final void ruleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1742:2: ( ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) ) )
            // InternalKerMLExpressions.g:1743:2: ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) )
            {
            // InternalKerMLExpressions.g:1743:2: ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) )
            // InternalKerMLExpressions.g:1744:3: ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* )
            {
            // InternalKerMLExpressions.g:1744:3: ( ( rule__Qualification__Group__0 ) )
            // InternalKerMLExpressions.g:1745:4: ( rule__Qualification__Group__0 )
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalKerMLExpressions.g:1746:4: ( rule__Qualification__Group__0 )
            // InternalKerMLExpressions.g:1746:5: rule__Qualification__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__Qualification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualificationAccess().getGroup()); 

            }

            // InternalKerMLExpressions.g:1749:3: ( ( rule__Qualification__Group__0 )* )
            // InternalKerMLExpressions.g:1750:4: ( rule__Qualification__Group__0 )*
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalKerMLExpressions.g:1751:4: ( rule__Qualification__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==63) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==63) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalKerMLExpressions.g:1751:5: rule__Qualification__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Qualification__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getQualificationAccess().getGroup()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalKerMLExpressions.g:1761:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalKerMLExpressions.g:1762:1: ( ruleQualifiedName EOF )
            // InternalKerMLExpressions.g:1763:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKerMLExpressions.g:1770:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1774:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalKerMLExpressions.g:1775:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalKerMLExpressions.g:1775:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalKerMLExpressions.g:1776:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalKerMLExpressions.g:1777:3: ( rule__QualifiedName__Group__0 )
            // InternalKerMLExpressions.g:1777:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConditionalExpression__Alternatives"
    // InternalKerMLExpressions.g:1785:1: rule__ConditionalExpression__Alternatives : ( ( ( rule__ConditionalExpression__Group_0__0 ) ) | ( ( rule__ConditionalExpression__Group_1__0 ) ) );
    public final void rule__ConditionalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1789:1: ( ( ( rule__ConditionalExpression__Group_0__0 ) ) | ( ( rule__ConditionalExpression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||(LA2_0>=RULE_EXP_VALUE && LA2_0<=RULE_STRING_VALUE)||(LA2_0>=28 && LA2_0<=31)||(LA2_0>=36 && LA2_0<=38)||(LA2_0>=43 && LA2_0<=45)||(LA2_0>=47 && LA2_0<=49)||LA2_0==53||LA2_0==56||LA2_0==58||LA2_0==65) ) {
                alt2=1;
            }
            else if ( (LA2_0==51) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKerMLExpressions.g:1790:2: ( ( rule__ConditionalExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1790:2: ( ( rule__ConditionalExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1791:3: ( rule__ConditionalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getConditionalExpressionAccess().getGroup_0()); 
                    // InternalKerMLExpressions.g:1792:3: ( rule__ConditionalExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1792:4: rule__ConditionalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1796:2: ( ( rule__ConditionalExpression__Group_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:1796:2: ( ( rule__ConditionalExpression__Group_1__0 ) )
                    // InternalKerMLExpressions.g:1797:3: ( rule__ConditionalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getConditionalExpressionAccess().getGroup_1()); 
                    // InternalKerMLExpressions.g:1798:3: ( rule__ConditionalExpression__Group_1__0 )
                    // InternalKerMLExpressions.g:1798:4: rule__ConditionalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConditionalExpression__Alternatives"


    // $ANTLR start "rule__ImpliesOperator__Alternatives"
    // InternalKerMLExpressions.g:1806:1: rule__ImpliesOperator__Alternatives : ( ( '=>' ) | ( 'implies' ) );
    public final void rule__ImpliesOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1810:1: ( ( '=>' ) | ( 'implies' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKerMLExpressions.g:1811:2: ( '=>' )
                    {
                    // InternalKerMLExpressions.g:1811:2: ( '=>' )
                    // InternalKerMLExpressions.g:1812:3: '=>'
                    {
                     before(grammarAccess.getImpliesOperatorAccess().getEqualsSignGreaterThanSignKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getImpliesOperatorAccess().getEqualsSignGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1817:2: ( 'implies' )
                    {
                    // InternalKerMLExpressions.g:1817:2: ( 'implies' )
                    // InternalKerMLExpressions.g:1818:3: 'implies'
                    {
                     before(grammarAccess.getImpliesOperatorAccess().getImpliesKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getImpliesOperatorAccess().getImpliesKeyword_1()); 

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
    // $ANTLR end "rule__ImpliesOperator__Alternatives"


    // $ANTLR start "rule__OrOperator__Alternatives"
    // InternalKerMLExpressions.g:1827:1: rule__OrOperator__Alternatives : ( ( '|' ) | ( '||' ) | ( 'or' ) );
    public final void rule__OrOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1831:1: ( ( '|' ) | ( '||' ) | ( 'or' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKerMLExpressions.g:1832:2: ( '|' )
                    {
                    // InternalKerMLExpressions.g:1832:2: ( '|' )
                    // InternalKerMLExpressions.g:1833:3: '|'
                    {
                     before(grammarAccess.getOrOperatorAccess().getVerticalLineKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOrOperatorAccess().getVerticalLineKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1838:2: ( '||' )
                    {
                    // InternalKerMLExpressions.g:1838:2: ( '||' )
                    // InternalKerMLExpressions.g:1839:3: '||'
                    {
                     before(grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1844:2: ( 'or' )
                    {
                    // InternalKerMLExpressions.g:1844:2: ( 'or' )
                    // InternalKerMLExpressions.g:1845:3: 'or'
                    {
                     before(grammarAccess.getOrOperatorAccess().getOrKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOrOperatorAccess().getOrKeyword_2()); 

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
    // $ANTLR end "rule__OrOperator__Alternatives"


    // $ANTLR start "rule__XorOperator__Alternatives"
    // InternalKerMLExpressions.g:1854:1: rule__XorOperator__Alternatives : ( ( '^^' ) | ( 'xor' ) );
    public final void rule__XorOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1858:1: ( ( '^^' ) | ( 'xor' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKerMLExpressions.g:1859:2: ( '^^' )
                    {
                    // InternalKerMLExpressions.g:1859:2: ( '^^' )
                    // InternalKerMLExpressions.g:1860:3: '^^'
                    {
                     before(grammarAccess.getXorOperatorAccess().getCircumflexAccentCircumflexAccentKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getXorOperatorAccess().getCircumflexAccentCircumflexAccentKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1865:2: ( 'xor' )
                    {
                    // InternalKerMLExpressions.g:1865:2: ( 'xor' )
                    // InternalKerMLExpressions.g:1866:3: 'xor'
                    {
                     before(grammarAccess.getXorOperatorAccess().getXorKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getXorOperatorAccess().getXorKeyword_1()); 

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
    // $ANTLR end "rule__XorOperator__Alternatives"


    // $ANTLR start "rule__AndOperator__Alternatives"
    // InternalKerMLExpressions.g:1875:1: rule__AndOperator__Alternatives : ( ( '&' ) | ( '&&' ) | ( 'and' ) );
    public final void rule__AndOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1879:1: ( ( '&' ) | ( '&&' ) | ( 'and' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
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
                    // InternalKerMLExpressions.g:1880:2: ( '&' )
                    {
                    // InternalKerMLExpressions.g:1880:2: ( '&' )
                    // InternalKerMLExpressions.g:1881:3: '&'
                    {
                     before(grammarAccess.getAndOperatorAccess().getAmpersandKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAndOperatorAccess().getAmpersandKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1886:2: ( '&&' )
                    {
                    // InternalKerMLExpressions.g:1886:2: ( '&&' )
                    // InternalKerMLExpressions.g:1887:3: '&&'
                    {
                     before(grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1892:2: ( 'and' )
                    {
                    // InternalKerMLExpressions.g:1892:2: ( 'and' )
                    // InternalKerMLExpressions.g:1893:3: 'and'
                    {
                     before(grammarAccess.getAndOperatorAccess().getAndKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAndOperatorAccess().getAndKeyword_2()); 

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
    // $ANTLR end "rule__AndOperator__Alternatives"


    // $ANTLR start "rule__EqualityOperator__Alternatives"
    // InternalKerMLExpressions.g:1902:1: rule__EqualityOperator__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1906:1: ( ( '==' ) | ( '!=' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKerMLExpressions.g:1907:2: ( '==' )
                    {
                    // InternalKerMLExpressions.g:1907:2: ( '==' )
                    // InternalKerMLExpressions.g:1908:3: '=='
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1913:2: ( '!=' )
                    {
                    // InternalKerMLExpressions.g:1913:2: ( '!=' )
                    // InternalKerMLExpressions.g:1914:3: '!='
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 

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
    // InternalKerMLExpressions.g:1923:1: rule__ClassificationExpression__Alternatives : ( ( ( rule__ClassificationExpression__Group_0__0 ) ) | ( ( rule__ClassificationExpression__Group_1__0 ) ) );
    public final void rule__ClassificationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1927:1: ( ( ( rule__ClassificationExpression__Group_0__0 ) ) | ( ( rule__ClassificationExpression__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_EXP_VALUE && LA8_0<=RULE_STRING_VALUE)||(LA8_0>=36 && LA8_0<=38)||(LA8_0>=43 && LA8_0<=45)||(LA8_0>=47 && LA8_0<=49)||LA8_0==53||LA8_0==56||LA8_0==58||LA8_0==65) ) {
                alt8=1;
            }
            else if ( (LA8_0==EOF||(LA8_0>=28 && LA8_0<=31)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKerMLExpressions.g:1928:2: ( ( rule__ClassificationExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:1928:2: ( ( rule__ClassificationExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:1929:3: ( rule__ClassificationExpression__Group_0__0 )
                    {
                     before(grammarAccess.getClassificationExpressionAccess().getGroup_0()); 
                    // InternalKerMLExpressions.g:1930:3: ( rule__ClassificationExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:1930:4: rule__ClassificationExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassificationExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassificationExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1934:2: ( ( rule__ClassificationExpression__Group_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:1934:2: ( ( rule__ClassificationExpression__Group_1__0 ) )
                    // InternalKerMLExpressions.g:1935:3: ( rule__ClassificationExpression__Group_1__0 )
                    {
                     before(grammarAccess.getClassificationExpressionAccess().getGroup_1()); 
                    // InternalKerMLExpressions.g:1936:3: ( rule__ClassificationExpression__Group_1__0 )
                    // InternalKerMLExpressions.g:1936:4: rule__ClassificationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassificationExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassificationExpressionAccess().getGroup_1()); 

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
    // InternalKerMLExpressions.g:1944:1: rule__ClassificationOperator__Alternatives : ( ( 'hastype' ) | ( 'istype' ) | ( '@' ) | ( 'as' ) );
    public final void rule__ClassificationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1948:1: ( ( 'hastype' ) | ( 'istype' ) | ( '@' ) | ( 'as' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            case 31:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKerMLExpressions.g:1949:2: ( 'hastype' )
                    {
                    // InternalKerMLExpressions.g:1949:2: ( 'hastype' )
                    // InternalKerMLExpressions.g:1950:3: 'hastype'
                    {
                     before(grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getClassificationOperatorAccess().getHastypeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1955:2: ( 'istype' )
                    {
                    // InternalKerMLExpressions.g:1955:2: ( 'istype' )
                    // InternalKerMLExpressions.g:1956:3: 'istype'
                    {
                     before(grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getClassificationOperatorAccess().getIstypeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1961:2: ( '@' )
                    {
                    // InternalKerMLExpressions.g:1961:2: ( '@' )
                    // InternalKerMLExpressions.g:1962:3: '@'
                    {
                     before(grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_2()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getClassificationOperatorAccess().getCommercialAtKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:1967:2: ( 'as' )
                    {
                    // InternalKerMLExpressions.g:1967:2: ( 'as' )
                    // InternalKerMLExpressions.g:1968:3: 'as'
                    {
                     before(grammarAccess.getClassificationOperatorAccess().getAsKeyword_3()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getClassificationOperatorAccess().getAsKeyword_3()); 

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
    // InternalKerMLExpressions.g:1977:1: rule__RelationalOperator__Alternatives : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:1981:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            case 35:
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
                    // InternalKerMLExpressions.g:1982:2: ( '<' )
                    {
                    // InternalKerMLExpressions.g:1982:2: ( '<' )
                    // InternalKerMLExpressions.g:1983:3: '<'
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:1988:2: ( '>' )
                    {
                    // InternalKerMLExpressions.g:1988:2: ( '>' )
                    // InternalKerMLExpressions.g:1989:3: '>'
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:1994:2: ( '<=' )
                    {
                    // InternalKerMLExpressions.g:1994:2: ( '<=' )
                    // InternalKerMLExpressions.g:1995:3: '<='
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2000:2: ( '>=' )
                    {
                    // InternalKerMLExpressions.g:2000:2: ( '>=' )
                    // InternalKerMLExpressions.g:2001:3: '>='
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3()); 

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
    // InternalKerMLExpressions.g:2010:1: rule__AdditiveOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2014:1: ( ( '+' ) | ( '-' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            else if ( (LA11_0==37) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKerMLExpressions.g:2015:2: ( '+' )
                    {
                    // InternalKerMLExpressions.g:2015:2: ( '+' )
                    // InternalKerMLExpressions.g:2016:3: '+'
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2021:2: ( '-' )
                    {
                    // InternalKerMLExpressions.g:2021:2: ( '-' )
                    // InternalKerMLExpressions.g:2022:3: '-'
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1()); 

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
    // InternalKerMLExpressions.g:2031:1: rule__MultiplicativeOperator__Alternatives : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2035:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalKerMLExpressions.g:2036:2: ( '*' )
                    {
                    // InternalKerMLExpressions.g:2036:2: ( '*' )
                    // InternalKerMLExpressions.g:2037:3: '*'
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2042:2: ( '/' )
                    {
                    // InternalKerMLExpressions.g:2042:2: ( '/' )
                    // InternalKerMLExpressions.g:2043:3: '/'
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2048:2: ( '%' )
                    {
                    // InternalKerMLExpressions.g:2048:2: ( '%' )
                    // InternalKerMLExpressions.g:2049:3: '%'
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getPercentSignKeyword_2()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getMultiplicativeOperatorAccess().getPercentSignKeyword_2()); 

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


    // $ANTLR start "rule__ExponentiationOperator__Alternatives"
    // InternalKerMLExpressions.g:2058:1: rule__ExponentiationOperator__Alternatives : ( ( '**' ) | ( '^' ) );
    public final void rule__ExponentiationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2062:1: ( ( '**' ) | ( '^' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            else if ( (LA13_0==42) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalKerMLExpressions.g:2063:2: ( '**' )
                    {
                    // InternalKerMLExpressions.g:2063:2: ( '**' )
                    // InternalKerMLExpressions.g:2064:3: '**'
                    {
                     before(grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword_0()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2069:2: ( '^' )
                    {
                    // InternalKerMLExpressions.g:2069:2: ( '^' )
                    // InternalKerMLExpressions.g:2070:3: '^'
                    {
                     before(grammarAccess.getExponentiationOperatorAccess().getCircumflexAccentKeyword_1()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getExponentiationOperatorAccess().getCircumflexAccentKeyword_1()); 

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
    // $ANTLR end "rule__ExponentiationOperator__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalKerMLExpressions.g:2079:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleExtentExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2083:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleExtentExpression ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=36 && LA14_0<=37)||(LA14_0>=43 && LA14_0<=45)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_EXP_VALUE && LA14_0<=RULE_STRING_VALUE)||LA14_0==38||(LA14_0>=47 && LA14_0<=49)||LA14_0==53||LA14_0==56||LA14_0==58||LA14_0==65) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKerMLExpressions.g:2084:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2084:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:2085:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    // InternalKerMLExpressions.g:2086:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:2086:4: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2090:2: ( ruleExtentExpression )
                    {
                    // InternalKerMLExpressions.g:2090:2: ( ruleExtentExpression )
                    // InternalKerMLExpressions.g:2091:3: ruleExtentExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getExtentExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExtentExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getExtentExpressionParserRuleCall_1()); 

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
    // InternalKerMLExpressions.g:2100:1: rule__UnaryOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '!' ) | ( '~' ) | ( 'not' ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2104:1: ( ( '+' ) | ( '-' ) | ( '!' ) | ( '~' ) | ( 'not' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 43:
                {
                alt15=3;
                }
                break;
            case 44:
                {
                alt15=4;
                }
                break;
            case 45:
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
                    // InternalKerMLExpressions.g:2105:2: ( '+' )
                    {
                    // InternalKerMLExpressions.g:2105:2: ( '+' )
                    // InternalKerMLExpressions.g:2106:3: '+'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2111:2: ( '-' )
                    {
                    // InternalKerMLExpressions.g:2111:2: ( '-' )
                    // InternalKerMLExpressions.g:2112:3: '-'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2117:2: ( '!' )
                    {
                    // InternalKerMLExpressions.g:2117:2: ( '!' )
                    // InternalKerMLExpressions.g:2118:3: '!'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2123:2: ( '~' )
                    {
                    // InternalKerMLExpressions.g:2123:2: ( '~' )
                    // InternalKerMLExpressions.g:2124:3: '~'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:2129:2: ( 'not' )
                    {
                    // InternalKerMLExpressions.g:2129:2: ( 'not' )
                    // InternalKerMLExpressions.g:2130:3: 'not'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNotKeyword_4()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getNotKeyword_4()); 

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
    // InternalKerMLExpressions.g:2139:1: rule__ExtentExpression__Alternatives : ( ( ( rule__ExtentExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__ExtentExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2143:1: ( ( ( rule__ExtentExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==65) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_EXP_VALUE && LA16_0<=RULE_STRING_VALUE)||LA16_0==38||(LA16_0>=47 && LA16_0<=49)||LA16_0==53||LA16_0==56||LA16_0==58) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalKerMLExpressions.g:2144:2: ( ( rule__ExtentExpression__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2144:2: ( ( rule__ExtentExpression__Group_0__0 ) )
                    // InternalKerMLExpressions.g:2145:3: ( rule__ExtentExpression__Group_0__0 )
                    {
                     before(grammarAccess.getExtentExpressionAccess().getGroup_0()); 
                    // InternalKerMLExpressions.g:2146:3: ( rule__ExtentExpression__Group_0__0 )
                    // InternalKerMLExpressions.g:2146:4: rule__ExtentExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtentExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtentExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2150:2: ( rulePrimaryExpression )
                    {
                    // InternalKerMLExpressions.g:2150:2: ( rulePrimaryExpression )
                    // InternalKerMLExpressions.g:2151:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getExtentExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExtentExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 

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


    // $ANTLR start "rule__PrimaryExpression__Alternatives_2_0"
    // InternalKerMLExpressions.g:2160:1: rule__PrimaryExpression__Alternatives_2_0 : ( ( ( rule__PrimaryExpression__Group_2_0_0__0 ) ) | ( ( rule__PrimaryExpression__Group_2_0_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2_0_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2164:1: ( ( ( rule__PrimaryExpression__Group_2_0_0__0 ) ) | ( ( rule__PrimaryExpression__Group_2_0_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2_0_2__0 ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt17=1;
                }
                break;
            case 55:
                {
                alt17=2;
                }
                break;
            case 53:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalKerMLExpressions.g:2165:2: ( ( rule__PrimaryExpression__Group_2_0_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2165:2: ( ( rule__PrimaryExpression__Group_2_0_0__0 ) )
                    // InternalKerMLExpressions.g:2166:3: ( rule__PrimaryExpression__Group_2_0_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_0_0()); 
                    // InternalKerMLExpressions.g:2167:3: ( rule__PrimaryExpression__Group_2_0_0__0 )
                    // InternalKerMLExpressions.g:2167:4: rule__PrimaryExpression__Group_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2171:2: ( ( rule__PrimaryExpression__Group_2_0_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:2171:2: ( ( rule__PrimaryExpression__Group_2_0_1__0 ) )
                    // InternalKerMLExpressions.g:2172:3: ( rule__PrimaryExpression__Group_2_0_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_0_1()); 
                    // InternalKerMLExpressions.g:2173:3: ( rule__PrimaryExpression__Group_2_0_1__0 )
                    // InternalKerMLExpressions.g:2173:4: rule__PrimaryExpression__Group_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2177:2: ( ( rule__PrimaryExpression__Group_2_0_2__0 ) )
                    {
                    // InternalKerMLExpressions.g:2177:2: ( ( rule__PrimaryExpression__Group_2_0_2__0 ) )
                    // InternalKerMLExpressions.g:2178:3: ( rule__PrimaryExpression__Group_2_0_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_0_2()); 
                    // InternalKerMLExpressions.g:2179:3: ( rule__PrimaryExpression__Group_2_0_2__0 )
                    // InternalKerMLExpressions.g:2179:4: rule__PrimaryExpression__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_0_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives_2_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives_2_0_1_3"
    // InternalKerMLExpressions.g:2187:1: rule__PrimaryExpression__Alternatives_2_0_1_3 : ( ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0 ) ) | ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1 ) ) | ( ruleArgumentList ) );
    public final void rule__PrimaryExpression__Alternatives_2_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2191:1: ( ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0 ) ) | ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1 ) ) | ( ruleArgumentList ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
                {
                alt18=2;
                }
                break;
            case 56:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalKerMLExpressions.g:2192:2: ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0 ) )
                    {
                    // InternalKerMLExpressions.g:2192:2: ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0 ) )
                    // InternalKerMLExpressions.g:2193:3: ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipAssignment_2_0_1_3_0()); 
                    // InternalKerMLExpressions.g:2194:3: ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0 )
                    // InternalKerMLExpressions.g:2194:4: rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipAssignment_2_0_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2198:2: ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1 ) )
                    {
                    // InternalKerMLExpressions.g:2198:2: ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1 ) )
                    // InternalKerMLExpressions.g:2199:3: ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipAssignment_2_0_1_3_1()); 
                    // InternalKerMLExpressions.g:2200:3: ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1 )
                    // InternalKerMLExpressions.g:2200:4: rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipAssignment_2_0_1_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2204:2: ( ruleArgumentList )
                    {
                    // InternalKerMLExpressions.g:2204:2: ( ruleArgumentList )
                    // InternalKerMLExpressions.g:2205:3: ruleArgumentList
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_2_0_1_3_2()); 
                    pushFollow(FOLLOW_2);
                    ruleArgumentList();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_2_0_1_3_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives_2_0_1_3"


    // $ANTLR start "rule__FeatureChainMember__Alternatives"
    // InternalKerMLExpressions.g:2214:1: rule__FeatureChainMember__Alternatives : ( ( ( rule__FeatureChainMember__MemberElementAssignment_0 ) ) | ( ( rule__FeatureChainMember__OwnedRelatedElementAssignment_1 ) ) );
    public final void rule__FeatureChainMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2218:1: ( ( ( rule__FeatureChainMember__MemberElementAssignment_0 ) ) | ( ( rule__FeatureChainMember__OwnedRelatedElementAssignment_1 ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalKerMLExpressions.g:2219:2: ( ( rule__FeatureChainMember__MemberElementAssignment_0 ) )
                    {
                    // InternalKerMLExpressions.g:2219:2: ( ( rule__FeatureChainMember__MemberElementAssignment_0 ) )
                    // InternalKerMLExpressions.g:2220:3: ( rule__FeatureChainMember__MemberElementAssignment_0 )
                    {
                     before(grammarAccess.getFeatureChainMemberAccess().getMemberElementAssignment_0()); 
                    // InternalKerMLExpressions.g:2221:3: ( rule__FeatureChainMember__MemberElementAssignment_0 )
                    // InternalKerMLExpressions.g:2221:4: rule__FeatureChainMember__MemberElementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureChainMember__MemberElementAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureChainMemberAccess().getMemberElementAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2225:2: ( ( rule__FeatureChainMember__OwnedRelatedElementAssignment_1 ) )
                    {
                    // InternalKerMLExpressions.g:2225:2: ( ( rule__FeatureChainMember__OwnedRelatedElementAssignment_1 ) )
                    // InternalKerMLExpressions.g:2226:3: ( rule__FeatureChainMember__OwnedRelatedElementAssignment_1 )
                    {
                     before(grammarAccess.getFeatureChainMemberAccess().getOwnedRelatedElementAssignment_1()); 
                    // InternalKerMLExpressions.g:2227:3: ( rule__FeatureChainMember__OwnedRelatedElementAssignment_1 )
                    // InternalKerMLExpressions.g:2227:4: rule__FeatureChainMember__OwnedRelatedElementAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureChainMember__OwnedRelatedElementAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureChainMemberAccess().getOwnedRelatedElementAssignment_1()); 

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
    // $ANTLR end "rule__FeatureChainMember__Alternatives"


    // $ANTLR start "rule__BaseExpression__Alternatives"
    // InternalKerMLExpressions.g:2235:1: rule__BaseExpression__Alternatives : ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ruleExpressionBody ) | ( ( rule__BaseExpression__Group_5__0 ) ) );
    public final void rule__BaseExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2239:1: ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ruleExpressionBody ) | ( ( rule__BaseExpression__Group_5__0 ) ) )
            int alt20=6;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalKerMLExpressions.g:2240:2: ( ruleNullExpression )
                    {
                    // InternalKerMLExpressions.g:2240:2: ( ruleNullExpression )
                    // InternalKerMLExpressions.g:2241:3: ruleNullExpression
                    {
                     before(grammarAccess.getBaseExpressionAccess().getNullExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNullExpression();

                    state._fsp--;

                     after(grammarAccess.getBaseExpressionAccess().getNullExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2246:2: ( ruleLiteralExpression )
                    {
                    // InternalKerMLExpressions.g:2246:2: ( ruleLiteralExpression )
                    // InternalKerMLExpressions.g:2247:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getBaseExpressionAccess().getLiteralExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getBaseExpressionAccess().getLiteralExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2252:2: ( ruleFeatureReferenceExpression )
                    {
                    // InternalKerMLExpressions.g:2252:2: ( ruleFeatureReferenceExpression )
                    // InternalKerMLExpressions.g:2253:3: ruleFeatureReferenceExpression
                    {
                     before(grammarAccess.getBaseExpressionAccess().getFeatureReferenceExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureReferenceExpression();

                    state._fsp--;

                     after(grammarAccess.getBaseExpressionAccess().getFeatureReferenceExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2258:2: ( ruleInvocationExpression )
                    {
                    // InternalKerMLExpressions.g:2258:2: ( ruleInvocationExpression )
                    // InternalKerMLExpressions.g:2259:3: ruleInvocationExpression
                    {
                     before(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInvocationExpression();

                    state._fsp--;

                     after(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:2264:2: ( ruleExpressionBody )
                    {
                    // InternalKerMLExpressions.g:2264:2: ( ruleExpressionBody )
                    // InternalKerMLExpressions.g:2265:3: ruleExpressionBody
                    {
                     before(grammarAccess.getBaseExpressionAccess().getExpressionBodyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionBody();

                    state._fsp--;

                     after(grammarAccess.getBaseExpressionAccess().getExpressionBodyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKerMLExpressions.g:2270:2: ( ( rule__BaseExpression__Group_5__0 ) )
                    {
                    // InternalKerMLExpressions.g:2270:2: ( ( rule__BaseExpression__Group_5__0 ) )
                    // InternalKerMLExpressions.g:2271:3: ( rule__BaseExpression__Group_5__0 )
                    {
                     before(grammarAccess.getBaseExpressionAccess().getGroup_5()); 
                    // InternalKerMLExpressions.g:2272:3: ( rule__BaseExpression__Group_5__0 )
                    // InternalKerMLExpressions.g:2272:4: rule__BaseExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpression__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseExpressionAccess().getGroup_5()); 

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


    // $ANTLR start "rule__SequenceExpression__Alternatives_1"
    // InternalKerMLExpressions.g:2280:1: rule__SequenceExpression__Alternatives_1 : ( ( ',' ) | ( ( rule__SequenceExpression__Group_1_1__0 ) ) );
    public final void rule__SequenceExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2284:1: ( ( ',' ) | ( ( rule__SequenceExpression__Group_1_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||LA21_1==54||LA21_1==57) ) {
                    alt21=1;
                }
                else if ( ((LA21_1>=RULE_EXP_VALUE && LA21_1<=RULE_STRING_VALUE)||(LA21_1>=28 && LA21_1<=31)||(LA21_1>=36 && LA21_1<=38)||(LA21_1>=43 && LA21_1<=45)||(LA21_1>=47 && LA21_1<=49)||LA21_1==51||LA21_1==53||LA21_1==56||LA21_1==58||LA21_1==65) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalKerMLExpressions.g:2285:2: ( ',' )
                    {
                    // InternalKerMLExpressions.g:2285:2: ( ',' )
                    // InternalKerMLExpressions.g:2286:3: ','
                    {
                     before(grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2291:2: ( ( rule__SequenceExpression__Group_1_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:2291:2: ( ( rule__SequenceExpression__Group_1_1__0 ) )
                    // InternalKerMLExpressions.g:2292:3: ( rule__SequenceExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getSequenceExpressionAccess().getGroup_1_1()); 
                    // InternalKerMLExpressions.g:2293:3: ( rule__SequenceExpression__Group_1_1__0 )
                    // InternalKerMLExpressions.g:2293:4: rule__SequenceExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceExpressionAccess().getGroup_1_1()); 

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


    // $ANTLR start "rule__OwnedFeatureTyping__Alternatives"
    // InternalKerMLExpressions.g:2301:1: rule__OwnedFeatureTyping__Alternatives : ( ( ( rule__OwnedFeatureTyping__TypeAssignment_0 ) ) | ( ( rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1 ) ) );
    public final void rule__OwnedFeatureTyping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2305:1: ( ( ( rule__OwnedFeatureTyping__TypeAssignment_0 ) ) | ( ( rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1 ) ) )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalKerMLExpressions.g:2306:2: ( ( rule__OwnedFeatureTyping__TypeAssignment_0 ) )
                    {
                    // InternalKerMLExpressions.g:2306:2: ( ( rule__OwnedFeatureTyping__TypeAssignment_0 ) )
                    // InternalKerMLExpressions.g:2307:3: ( rule__OwnedFeatureTyping__TypeAssignment_0 )
                    {
                     before(grammarAccess.getOwnedFeatureTypingAccess().getTypeAssignment_0()); 
                    // InternalKerMLExpressions.g:2308:3: ( rule__OwnedFeatureTyping__TypeAssignment_0 )
                    // InternalKerMLExpressions.g:2308:4: rule__OwnedFeatureTyping__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OwnedFeatureTyping__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOwnedFeatureTypingAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2312:2: ( ( rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1 ) )
                    {
                    // InternalKerMLExpressions.g:2312:2: ( ( rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1 ) )
                    // InternalKerMLExpressions.g:2313:3: ( rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1 )
                    {
                     before(grammarAccess.getOwnedFeatureTypingAccess().getOwnedRelatedElementAssignment_1()); 
                    // InternalKerMLExpressions.g:2314:3: ( rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1 )
                    // InternalKerMLExpressions.g:2314:4: rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOwnedFeatureTypingAccess().getOwnedRelatedElementAssignment_1()); 

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
    // $ANTLR end "rule__OwnedFeatureTyping__Alternatives"


    // $ANTLR start "rule__ArgumentList__Alternatives_1"
    // InternalKerMLExpressions.g:2322:1: rule__ArgumentList__Alternatives_1 : ( ( rulePositionalArgumentList ) | ( ruleNamedArgumentList ) );
    public final void rule__ArgumentList__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2326:1: ( ( rulePositionalArgumentList ) | ( ruleNamedArgumentList ) )
            int alt23=2;
            switch ( input.LA(1) ) {
            case RULE_EXP_VALUE:
            case RULE_DECIMAL_VALUE:
            case RULE_STRING_VALUE:
            case 28:
            case 29:
            case 30:
            case 31:
            case 36:
            case 37:
            case 38:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 51:
            case 53:
            case 56:
            case 58:
            case 65:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
                {
                int LA23_2 = input.LA(2);

                if ( ((LA23_2>=14 && LA23_2<=42)||LA23_2==46||LA23_2==53||(LA23_2>=55 && LA23_2<=57)||(LA23_2>=63 && LA23_2<=64)||LA23_2==66) ) {
                    alt23=1;
                }
                else if ( (LA23_2==62) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA23_3 = input.LA(2);

                if ( ((LA23_3>=14 && LA23_3<=42)||LA23_3==46||LA23_3==53||(LA23_3>=55 && LA23_3<=57)||(LA23_3>=63 && LA23_3<=64)||LA23_3==66) ) {
                    alt23=1;
                }
                else if ( (LA23_3==62) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalKerMLExpressions.g:2327:2: ( rulePositionalArgumentList )
                    {
                    // InternalKerMLExpressions.g:2327:2: ( rulePositionalArgumentList )
                    // InternalKerMLExpressions.g:2328:3: rulePositionalArgumentList
                    {
                     before(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    rulePositionalArgumentList();

                    state._fsp--;

                     after(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2333:2: ( ruleNamedArgumentList )
                    {
                    // InternalKerMLExpressions.g:2333:2: ( ruleNamedArgumentList )
                    // InternalKerMLExpressions.g:2334:3: ruleNamedArgumentList
                    {
                     before(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedArgumentList();

                    state._fsp--;

                     after(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__ArgumentList__Alternatives_1"


    // $ANTLR start "rule__NullExpression__Alternatives_1"
    // InternalKerMLExpressions.g:2343:1: rule__NullExpression__Alternatives_1 : ( ( 'null' ) | ( ( rule__NullExpression__Group_1_1__0 ) ) );
    public final void rule__NullExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2347:1: ( ( 'null' ) | ( ( rule__NullExpression__Group_1_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            else if ( (LA24_0==56) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalKerMLExpressions.g:2348:2: ( 'null' )
                    {
                    // InternalKerMLExpressions.g:2348:2: ( 'null' )
                    // InternalKerMLExpressions.g:2349:3: 'null'
                    {
                     before(grammarAccess.getNullExpressionAccess().getNullKeyword_1_0()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getNullExpressionAccess().getNullKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2354:2: ( ( rule__NullExpression__Group_1_1__0 ) )
                    {
                    // InternalKerMLExpressions.g:2354:2: ( ( rule__NullExpression__Group_1_1__0 ) )
                    // InternalKerMLExpressions.g:2355:3: ( rule__NullExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getNullExpressionAccess().getGroup_1_1()); 
                    // InternalKerMLExpressions.g:2356:3: ( rule__NullExpression__Group_1_1__0 )
                    // InternalKerMLExpressions.g:2356:4: rule__NullExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NullExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNullExpressionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__NullExpression__Alternatives_1"


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // InternalKerMLExpressions.g:2364:1: rule__LiteralExpression__Alternatives : ( ( ruleLiteralBoolean ) | ( ruleLiteralString ) | ( ruleLiteralInteger ) | ( ruleLiteralReal ) | ( ruleLiteralInfinity ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2368:1: ( ( ruleLiteralBoolean ) | ( ruleLiteralString ) | ( ruleLiteralInteger ) | ( ruleLiteralReal ) | ( ruleLiteralInfinity ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 48:
            case 49:
                {
                alt25=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt25=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==EOF||(LA25_3>=14 && LA25_3<=42)||LA25_3==46||LA25_3==50||LA25_3==52||(LA25_3>=54 && LA25_3<=55)||LA25_3==57||LA25_3==59||LA25_3==64||LA25_3==66) ) {
                    alt25=3;
                }
                else if ( (LA25_3==53) ) {
                    int LA25_7 = input.LA(3);

                    if ( ((LA25_7>=RULE_ID && LA25_7<=RULE_UNRESTRICTED_NAME)||LA25_7==58) ) {
                        alt25=3;
                    }
                    else if ( ((LA25_7>=RULE_EXP_VALUE && LA25_7<=RULE_DECIMAL_VALUE)) ) {
                        alt25=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 53:
                {
                alt25=4;
                }
                break;
            case 38:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalKerMLExpressions.g:2369:2: ( ruleLiteralBoolean )
                    {
                    // InternalKerMLExpressions.g:2369:2: ( ruleLiteralBoolean )
                    // InternalKerMLExpressions.g:2370:3: ruleLiteralBoolean
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralBoolean();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2375:2: ( ruleLiteralString )
                    {
                    // InternalKerMLExpressions.g:2375:2: ( ruleLiteralString )
                    // InternalKerMLExpressions.g:2376:3: ruleLiteralString
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralString();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLExpressions.g:2381:2: ( ruleLiteralInteger )
                    {
                    // InternalKerMLExpressions.g:2381:2: ( ruleLiteralInteger )
                    // InternalKerMLExpressions.g:2382:3: ruleLiteralInteger
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralIntegerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralInteger();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLExpressions.g:2387:2: ( ruleLiteralReal )
                    {
                    // InternalKerMLExpressions.g:2387:2: ( ruleLiteralReal )
                    // InternalKerMLExpressions.g:2388:3: ruleLiteralReal
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralRealParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralReal();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralRealParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLExpressions.g:2393:2: ( ruleLiteralInfinity )
                    {
                    // InternalKerMLExpressions.g:2393:2: ( ruleLiteralInfinity )
                    // InternalKerMLExpressions.g:2394:3: ruleLiteralInfinity
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralInfinityParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralInfinity();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralInfinityParserRuleCall_4()); 

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
    // InternalKerMLExpressions.g:2403:1: rule__BooleanValue__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2407:1: ( ( 'true' ) | ( 'false' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            else if ( (LA26_0==49) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalKerMLExpressions.g:2408:2: ( 'true' )
                    {
                    // InternalKerMLExpressions.g:2408:2: ( 'true' )
                    // InternalKerMLExpressions.g:2409:3: 'true'
                    {
                     before(grammarAccess.getBooleanValueAccess().getTrueKeyword_0()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2414:2: ( 'false' )
                    {
                    // InternalKerMLExpressions.g:2414:2: ( 'false' )
                    // InternalKerMLExpressions.g:2415:3: 'false'
                    {
                     before(grammarAccess.getBooleanValueAccess().getFalseKeyword_1()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getFalseKeyword_1()); 

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
    // InternalKerMLExpressions.g:2424:1: rule__RealValue__Alternatives : ( ( ( rule__RealValue__Group_0__0 ) ) | ( RULE_EXP_VALUE ) );
    public final void rule__RealValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2428:1: ( ( ( rule__RealValue__Group_0__0 ) ) | ( RULE_EXP_VALUE ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DECIMAL_VALUE||LA27_0==53) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_EXP_VALUE) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalKerMLExpressions.g:2429:2: ( ( rule__RealValue__Group_0__0 ) )
                    {
                    // InternalKerMLExpressions.g:2429:2: ( ( rule__RealValue__Group_0__0 ) )
                    // InternalKerMLExpressions.g:2430:3: ( rule__RealValue__Group_0__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0()); 
                    // InternalKerMLExpressions.g:2431:3: ( rule__RealValue__Group_0__0 )
                    // InternalKerMLExpressions.g:2431:4: rule__RealValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RealValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2435:2: ( RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:2435:2: ( RULE_EXP_VALUE )
                    // InternalKerMLExpressions.g:2436:3: RULE_EXP_VALUE
                    {
                     before(grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1()); 
                    match(input,RULE_EXP_VALUE,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1()); 

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
    // InternalKerMLExpressions.g:2445:1: rule__RealValue__Alternatives_0_2 : ( ( RULE_DECIMAL_VALUE ) | ( RULE_EXP_VALUE ) );
    public final void rule__RealValue__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2449:1: ( ( RULE_DECIMAL_VALUE ) | ( RULE_EXP_VALUE ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DECIMAL_VALUE) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_EXP_VALUE) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalKerMLExpressions.g:2450:2: ( RULE_DECIMAL_VALUE )
                    {
                    // InternalKerMLExpressions.g:2450:2: ( RULE_DECIMAL_VALUE )
                    // InternalKerMLExpressions.g:2451:3: RULE_DECIMAL_VALUE
                    {
                     before(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0()); 
                    match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2456:2: ( RULE_EXP_VALUE )
                    {
                    // InternalKerMLExpressions.g:2456:2: ( RULE_EXP_VALUE )
                    // InternalKerMLExpressions.g:2457:3: RULE_EXP_VALUE
                    {
                     before(grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1()); 
                    match(input,RULE_EXP_VALUE,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1()); 

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
    // InternalKerMLExpressions.g:2466:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2470:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_UNRESTRICTED_NAME) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalKerMLExpressions.g:2471:2: ( RULE_ID )
                    {
                    // InternalKerMLExpressions.g:2471:2: ( RULE_ID )
                    // InternalKerMLExpressions.g:2472:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLExpressions.g:2477:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalKerMLExpressions.g:2477:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalKerMLExpressions.g:2478:3: RULE_UNRESTRICTED_NAME
                    {
                     before(grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1()); 
                    match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1()); 

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


    // $ANTLR start "rule__ConditionalExpression__Group_0__0"
    // InternalKerMLExpressions.g:2487:1: rule__ConditionalExpression__Group_0__0 : rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1 ;
    public final void rule__ConditionalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2491:1: ( rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1 )
            // InternalKerMLExpressions.g:2492:2: rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__0"


    // $ANTLR start "rule__ConditionalExpression__Group_0__0__Impl"
    // InternalKerMLExpressions.g:2499:1: rule__ConditionalExpression__Group_0__0__Impl : ( ruleNullCoalescingExpression ) ;
    public final void rule__ConditionalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2503:1: ( ( ruleNullCoalescingExpression ) )
            // InternalKerMLExpressions.g:2504:1: ( ruleNullCoalescingExpression )
            {
            // InternalKerMLExpressions.g:2504:1: ( ruleNullCoalescingExpression )
            // InternalKerMLExpressions.g:2505:2: ruleNullCoalescingExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNullCoalescingExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0__1"
    // InternalKerMLExpressions.g:2514:1: rule__ConditionalExpression__Group_0__1 : rule__ConditionalExpression__Group_0__1__Impl ;
    public final void rule__ConditionalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2518:1: ( rule__ConditionalExpression__Group_0__1__Impl )
            // InternalKerMLExpressions.g:2519:2: rule__ConditionalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__1"


    // $ANTLR start "rule__ConditionalExpression__Group_0__1__Impl"
    // InternalKerMLExpressions.g:2525:1: rule__ConditionalExpression__Group_0__1__Impl : ( ( rule__ConditionalExpression__Group_0_1__0 )? ) ;
    public final void rule__ConditionalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2529:1: ( ( ( rule__ConditionalExpression__Group_0_1__0 )? ) )
            // InternalKerMLExpressions.g:2530:1: ( ( rule__ConditionalExpression__Group_0_1__0 )? )
            {
            // InternalKerMLExpressions.g:2530:1: ( ( rule__ConditionalExpression__Group_0_1__0 )? )
            // InternalKerMLExpressions.g:2531:2: ( rule__ConditionalExpression__Group_0_1__0 )?
            {
             before(grammarAccess.getConditionalExpressionAccess().getGroup_0_1()); 
            // InternalKerMLExpressions.g:2532:2: ( rule__ConditionalExpression__Group_0_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKerMLExpressions.g:2532:3: rule__ConditionalExpression__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalExpression__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalExpressionAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__0"
    // InternalKerMLExpressions.g:2541:1: rule__ConditionalExpression__Group_0_1__0 : rule__ConditionalExpression__Group_0_1__0__Impl rule__ConditionalExpression__Group_0_1__1 ;
    public final void rule__ConditionalExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2545:1: ( rule__ConditionalExpression__Group_0_1__0__Impl rule__ConditionalExpression__Group_0_1__1 )
            // InternalKerMLExpressions.g:2546:2: rule__ConditionalExpression__Group_0_1__0__Impl rule__ConditionalExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalExpression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__0"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__0__Impl"
    // InternalKerMLExpressions.g:2553:1: rule__ConditionalExpression__Group_0_1__0__Impl : ( () ) ;
    public final void rule__ConditionalExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2557:1: ( ( () ) )
            // InternalKerMLExpressions.g:2558:1: ( () )
            {
            // InternalKerMLExpressions.g:2558:1: ( () )
            // InternalKerMLExpressions.g:2559:2: ()
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperandAction_0_1_0()); 
            // InternalKerMLExpressions.g:2560:2: ()
            // InternalKerMLExpressions.g:2560:3: 
            {
            }

             after(grammarAccess.getConditionalExpressionAccess().getOperatorExpressionOperandAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__1"
    // InternalKerMLExpressions.g:2568:1: rule__ConditionalExpression__Group_0_1__1 : rule__ConditionalExpression__Group_0_1__1__Impl rule__ConditionalExpression__Group_0_1__2 ;
    public final void rule__ConditionalExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2572:1: ( rule__ConditionalExpression__Group_0_1__1__Impl rule__ConditionalExpression__Group_0_1__2 )
            // InternalKerMLExpressions.g:2573:2: rule__ConditionalExpression__Group_0_1__1__Impl rule__ConditionalExpression__Group_0_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ConditionalExpression__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__1"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__1__Impl"
    // InternalKerMLExpressions.g:2580:1: rule__ConditionalExpression__Group_0_1__1__Impl : ( ( rule__ConditionalExpression__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__ConditionalExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2584:1: ( ( ( rule__ConditionalExpression__OperatorAssignment_0_1_1 ) ) )
            // InternalKerMLExpressions.g:2585:1: ( ( rule__ConditionalExpression__OperatorAssignment_0_1_1 ) )
            {
            // InternalKerMLExpressions.g:2585:1: ( ( rule__ConditionalExpression__OperatorAssignment_0_1_1 ) )
            // InternalKerMLExpressions.g:2586:2: ( rule__ConditionalExpression__OperatorAssignment_0_1_1 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperatorAssignment_0_1_1()); 
            // InternalKerMLExpressions.g:2587:2: ( rule__ConditionalExpression__OperatorAssignment_0_1_1 )
            // InternalKerMLExpressions.g:2587:3: rule__ConditionalExpression__OperatorAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperatorAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getOperatorAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__2"
    // InternalKerMLExpressions.g:2595:1: rule__ConditionalExpression__Group_0_1__2 : rule__ConditionalExpression__Group_0_1__2__Impl rule__ConditionalExpression__Group_0_1__3 ;
    public final void rule__ConditionalExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2599:1: ( rule__ConditionalExpression__Group_0_1__2__Impl rule__ConditionalExpression__Group_0_1__3 )
            // InternalKerMLExpressions.g:2600:2: rule__ConditionalExpression__Group_0_1__2__Impl rule__ConditionalExpression__Group_0_1__3
            {
            pushFollow(FOLLOW_6);
            rule__ConditionalExpression__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__2"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__2__Impl"
    // InternalKerMLExpressions.g:2607:1: rule__ConditionalExpression__Group_0_1__2__Impl : ( ( rule__ConditionalExpression__OperandAssignment_0_1_2 ) ) ;
    public final void rule__ConditionalExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2611:1: ( ( ( rule__ConditionalExpression__OperandAssignment_0_1_2 ) ) )
            // InternalKerMLExpressions.g:2612:1: ( ( rule__ConditionalExpression__OperandAssignment_0_1_2 ) )
            {
            // InternalKerMLExpressions.g:2612:1: ( ( rule__ConditionalExpression__OperandAssignment_0_1_2 ) )
            // InternalKerMLExpressions.g:2613:2: ( rule__ConditionalExpression__OperandAssignment_0_1_2 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_0_1_2()); 
            // InternalKerMLExpressions.g:2614:2: ( rule__ConditionalExpression__OperandAssignment_0_1_2 )
            // InternalKerMLExpressions.g:2614:3: rule__ConditionalExpression__OperandAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperandAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__2__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__3"
    // InternalKerMLExpressions.g:2622:1: rule__ConditionalExpression__Group_0_1__3 : rule__ConditionalExpression__Group_0_1__3__Impl rule__ConditionalExpression__Group_0_1__4 ;
    public final void rule__ConditionalExpression__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2626:1: ( rule__ConditionalExpression__Group_0_1__3__Impl rule__ConditionalExpression__Group_0_1__4 )
            // InternalKerMLExpressions.g:2627:2: rule__ConditionalExpression__Group_0_1__3__Impl rule__ConditionalExpression__Group_0_1__4
            {
            pushFollow(FOLLOW_5);
            rule__ConditionalExpression__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__3"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__3__Impl"
    // InternalKerMLExpressions.g:2634:1: rule__ConditionalExpression__Group_0_1__3__Impl : ( ':' ) ;
    public final void rule__ConditionalExpression__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2638:1: ( ( ':' ) )
            // InternalKerMLExpressions.g:2639:1: ( ':' )
            {
            // InternalKerMLExpressions.g:2639:1: ( ':' )
            // InternalKerMLExpressions.g:2640:2: ':'
            {
             before(grammarAccess.getConditionalExpressionAccess().getColonKeyword_0_1_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getConditionalExpressionAccess().getColonKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__3__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__4"
    // InternalKerMLExpressions.g:2649:1: rule__ConditionalExpression__Group_0_1__4 : rule__ConditionalExpression__Group_0_1__4__Impl ;
    public final void rule__ConditionalExpression__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2653:1: ( rule__ConditionalExpression__Group_0_1__4__Impl )
            // InternalKerMLExpressions.g:2654:2: rule__ConditionalExpression__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__4"


    // $ANTLR start "rule__ConditionalExpression__Group_0_1__4__Impl"
    // InternalKerMLExpressions.g:2660:1: rule__ConditionalExpression__Group_0_1__4__Impl : ( ( rule__ConditionalExpression__OperandAssignment_0_1_4 ) ) ;
    public final void rule__ConditionalExpression__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2664:1: ( ( ( rule__ConditionalExpression__OperandAssignment_0_1_4 ) ) )
            // InternalKerMLExpressions.g:2665:1: ( ( rule__ConditionalExpression__OperandAssignment_0_1_4 ) )
            {
            // InternalKerMLExpressions.g:2665:1: ( ( rule__ConditionalExpression__OperandAssignment_0_1_4 ) )
            // InternalKerMLExpressions.g:2666:2: ( rule__ConditionalExpression__OperandAssignment_0_1_4 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_0_1_4()); 
            // InternalKerMLExpressions.g:2667:2: ( rule__ConditionalExpression__OperandAssignment_0_1_4 )
            // InternalKerMLExpressions.g:2667:3: rule__ConditionalExpression__OperandAssignment_0_1_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperandAssignment_0_1_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0_1__4__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__0"
    // InternalKerMLExpressions.g:2676:1: rule__ConditionalExpression__Group_1__0 : rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 ;
    public final void rule__ConditionalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2680:1: ( rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2681:2: rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ConditionalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2688:1: rule__ConditionalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2692:1: ( ( () ) )
            // InternalKerMLExpressions.g:2693:1: ( () )
            {
            // InternalKerMLExpressions.g:2693:1: ( () )
            // InternalKerMLExpressions.g:2694:2: ()
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperatorExpressionAction_1_0()); 
            // InternalKerMLExpressions.g:2695:2: ()
            // InternalKerMLExpressions.g:2695:3: 
            {
            }

             after(grammarAccess.getConditionalExpressionAccess().getOperatorExpressionAction_1_0()); 

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
    // InternalKerMLExpressions.g:2703:1: rule__ConditionalExpression__Group_1__1 : rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 ;
    public final void rule__ConditionalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2707:1: ( rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2708:2: rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ConditionalExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2715:1: rule__ConditionalExpression__Group_1__1__Impl : ( 'if' ) ;
    public final void rule__ConditionalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2719:1: ( ( 'if' ) )
            // InternalKerMLExpressions.g:2720:1: ( 'if' )
            {
            // InternalKerMLExpressions.g:2720:1: ( 'if' )
            // InternalKerMLExpressions.g:2721:2: 'if'
            {
             before(grammarAccess.getConditionalExpressionAccess().getIfKeyword_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getConditionalExpressionAccess().getIfKeyword_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:2730:1: rule__ConditionalExpression__Group_1__2 : rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 ;
    public final void rule__ConditionalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2734:1: ( rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 )
            // InternalKerMLExpressions.g:2735:2: rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2742:1: rule__ConditionalExpression__Group_1__2__Impl : ( ( rule__ConditionalExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__ConditionalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2746:1: ( ( ( rule__ConditionalExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2747:1: ( ( rule__ConditionalExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2747:1: ( ( rule__ConditionalExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2748:2: ( rule__ConditionalExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:2749:2: ( rule__ConditionalExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:2749:3: rule__ConditionalExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:2757:1: rule__ConditionalExpression__Group_1__3 : rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4 ;
    public final void rule__ConditionalExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2761:1: ( rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4 )
            // InternalKerMLExpressions.g:2762:2: rule__ConditionalExpression__Group_1__3__Impl rule__ConditionalExpression__Group_1__4
            {
            pushFollow(FOLLOW_5);
            rule__ConditionalExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__4();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2769:1: rule__ConditionalExpression__Group_1__3__Impl : ( ( rule__ConditionalExpression__OperatorAssignment_1_3 ) ) ;
    public final void rule__ConditionalExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2773:1: ( ( ( rule__ConditionalExpression__OperatorAssignment_1_3 ) ) )
            // InternalKerMLExpressions.g:2774:1: ( ( rule__ConditionalExpression__OperatorAssignment_1_3 ) )
            {
            // InternalKerMLExpressions.g:2774:1: ( ( rule__ConditionalExpression__OperatorAssignment_1_3 ) )
            // InternalKerMLExpressions.g:2775:2: ( rule__ConditionalExpression__OperatorAssignment_1_3 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperatorAssignment_1_3()); 
            // InternalKerMLExpressions.g:2776:2: ( rule__ConditionalExpression__OperatorAssignment_1_3 )
            // InternalKerMLExpressions.g:2776:3: rule__ConditionalExpression__OperatorAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperatorAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getOperatorAssignment_1_3()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:2784:1: rule__ConditionalExpression__Group_1__4 : rule__ConditionalExpression__Group_1__4__Impl rule__ConditionalExpression__Group_1__5 ;
    public final void rule__ConditionalExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2788:1: ( rule__ConditionalExpression__Group_1__4__Impl rule__ConditionalExpression__Group_1__5 )
            // InternalKerMLExpressions.g:2789:2: rule__ConditionalExpression__Group_1__4__Impl rule__ConditionalExpression__Group_1__5
            {
            pushFollow(FOLLOW_8);
            rule__ConditionalExpression__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__5();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2796:1: rule__ConditionalExpression__Group_1__4__Impl : ( ( rule__ConditionalExpression__OperandAssignment_1_4 ) ) ;
    public final void rule__ConditionalExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2800:1: ( ( ( rule__ConditionalExpression__OperandAssignment_1_4 ) ) )
            // InternalKerMLExpressions.g:2801:1: ( ( rule__ConditionalExpression__OperandAssignment_1_4 ) )
            {
            // InternalKerMLExpressions.g:2801:1: ( ( rule__ConditionalExpression__OperandAssignment_1_4 ) )
            // InternalKerMLExpressions.g:2802:2: ( rule__ConditionalExpression__OperandAssignment_1_4 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_4()); 
            // InternalKerMLExpressions.g:2803:2: ( rule__ConditionalExpression__OperandAssignment_1_4 )
            // InternalKerMLExpressions.g:2803:3: rule__ConditionalExpression__OperandAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperandAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConditionalExpression__Group_1__5"
    // InternalKerMLExpressions.g:2811:1: rule__ConditionalExpression__Group_1__5 : rule__ConditionalExpression__Group_1__5__Impl rule__ConditionalExpression__Group_1__6 ;
    public final void rule__ConditionalExpression__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2815:1: ( rule__ConditionalExpression__Group_1__5__Impl rule__ConditionalExpression__Group_1__6 )
            // InternalKerMLExpressions.g:2816:2: rule__ConditionalExpression__Group_1__5__Impl rule__ConditionalExpression__Group_1__6
            {
            pushFollow(FOLLOW_5);
            rule__ConditionalExpression__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__5"


    // $ANTLR start "rule__ConditionalExpression__Group_1__5__Impl"
    // InternalKerMLExpressions.g:2823:1: rule__ConditionalExpression__Group_1__5__Impl : ( 'else' ) ;
    public final void rule__ConditionalExpression__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2827:1: ( ( 'else' ) )
            // InternalKerMLExpressions.g:2828:1: ( 'else' )
            {
            // InternalKerMLExpressions.g:2828:1: ( 'else' )
            // InternalKerMLExpressions.g:2829:2: 'else'
            {
             before(grammarAccess.getConditionalExpressionAccess().getElseKeyword_1_5()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getConditionalExpressionAccess().getElseKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__5__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__6"
    // InternalKerMLExpressions.g:2838:1: rule__ConditionalExpression__Group_1__6 : rule__ConditionalExpression__Group_1__6__Impl ;
    public final void rule__ConditionalExpression__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2842:1: ( rule__ConditionalExpression__Group_1__6__Impl )
            // InternalKerMLExpressions.g:2843:2: rule__ConditionalExpression__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__6"


    // $ANTLR start "rule__ConditionalExpression__Group_1__6__Impl"
    // InternalKerMLExpressions.g:2849:1: rule__ConditionalExpression__Group_1__6__Impl : ( ( rule__ConditionalExpression__OperandAssignment_1_6 ) ) ;
    public final void rule__ConditionalExpression__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2853:1: ( ( ( rule__ConditionalExpression__OperandAssignment_1_6 ) ) )
            // InternalKerMLExpressions.g:2854:1: ( ( rule__ConditionalExpression__OperandAssignment_1_6 ) )
            {
            // InternalKerMLExpressions.g:2854:1: ( ( rule__ConditionalExpression__OperandAssignment_1_6 ) )
            // InternalKerMLExpressions.g:2855:2: ( rule__ConditionalExpression__OperandAssignment_1_6 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_6()); 
            // InternalKerMLExpressions.g:2856:2: ( rule__ConditionalExpression__OperandAssignment_1_6 )
            // InternalKerMLExpressions.g:2856:3: rule__ConditionalExpression__OperandAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__OperandAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getOperandAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__6__Impl"


    // $ANTLR start "rule__NullCoalescingExpression__Group__0"
    // InternalKerMLExpressions.g:2865:1: rule__NullCoalescingExpression__Group__0 : rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1 ;
    public final void rule__NullCoalescingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2869:1: ( rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1 )
            // InternalKerMLExpressions.g:2870:2: rule__NullCoalescingExpression__Group__0__Impl rule__NullCoalescingExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NullCoalescingExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2877:1: rule__NullCoalescingExpression__Group__0__Impl : ( ruleImpliesExpression ) ;
    public final void rule__NullCoalescingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2881:1: ( ( ruleImpliesExpression ) )
            // InternalKerMLExpressions.g:2882:1: ( ruleImpliesExpression )
            {
            // InternalKerMLExpressions.g:2882:1: ( ruleImpliesExpression )
            // InternalKerMLExpressions.g:2883:2: ruleImpliesExpression
            {
             before(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImpliesExpression();

            state._fsp--;

             after(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:2892:1: rule__NullCoalescingExpression__Group__1 : rule__NullCoalescingExpression__Group__1__Impl ;
    public final void rule__NullCoalescingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2896:1: ( rule__NullCoalescingExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:2897:2: rule__NullCoalescingExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2903:1: rule__NullCoalescingExpression__Group__1__Impl : ( ( rule__NullCoalescingExpression__Group_1__0 )* ) ;
    public final void rule__NullCoalescingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2907:1: ( ( ( rule__NullCoalescingExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:2908:1: ( ( rule__NullCoalescingExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:2908:1: ( ( rule__NullCoalescingExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:2909:2: ( rule__NullCoalescingExpression__Group_1__0 )*
            {
             before(grammarAccess.getNullCoalescingExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:2910:2: ( rule__NullCoalescingExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKerMLExpressions.g:2910:3: rule__NullCoalescingExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__NullCoalescingExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getNullCoalescingExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:2919:1: rule__NullCoalescingExpression__Group_1__0 : rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1 ;
    public final void rule__NullCoalescingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2923:1: ( rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1 )
            // InternalKerMLExpressions.g:2924:2: rule__NullCoalescingExpression__Group_1__0__Impl rule__NullCoalescingExpression__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__NullCoalescingExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2931:1: rule__NullCoalescingExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NullCoalescingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2935:1: ( ( () ) )
            // InternalKerMLExpressions.g:2936:1: ( () )
            {
            // InternalKerMLExpressions.g:2936:1: ( () )
            // InternalKerMLExpressions.g:2937:2: ()
            {
             before(grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:2938:2: ()
            // InternalKerMLExpressions.g:2938:3: 
            {
            }

             after(grammarAccess.getNullCoalescingExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:2946:1: rule__NullCoalescingExpression__Group_1__1 : rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2 ;
    public final void rule__NullCoalescingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2950:1: ( rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2 )
            // InternalKerMLExpressions.g:2951:2: rule__NullCoalescingExpression__Group_1__1__Impl rule__NullCoalescingExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__NullCoalescingExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2958:1: rule__NullCoalescingExpression__Group_1__1__Impl : ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NullCoalescingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2962:1: ( ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:2963:1: ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:2963:1: ( ( rule__NullCoalescingExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:2964:2: ( rule__NullCoalescingExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getNullCoalescingExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:2965:2: ( rule__NullCoalescingExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:2965:3: rule__NullCoalescingExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNullCoalescingExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:2973:1: rule__NullCoalescingExpression__Group_1__2 : rule__NullCoalescingExpression__Group_1__2__Impl ;
    public final void rule__NullCoalescingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2977:1: ( rule__NullCoalescingExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:2978:2: rule__NullCoalescingExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:2984:1: rule__NullCoalescingExpression__Group_1__2__Impl : ( ( rule__NullCoalescingExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__NullCoalescingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:2988:1: ( ( ( rule__NullCoalescingExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:2989:1: ( ( rule__NullCoalescingExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:2989:1: ( ( rule__NullCoalescingExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:2990:2: ( rule__NullCoalescingExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getNullCoalescingExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:2991:2: ( rule__NullCoalescingExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:2991:3: rule__NullCoalescingExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NullCoalescingExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNullCoalescingExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ImpliesExpression__Group__0"
    // InternalKerMLExpressions.g:3000:1: rule__ImpliesExpression__Group__0 : rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 ;
    public final void rule__ImpliesExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3004:1: ( rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 )
            // InternalKerMLExpressions.g:3005:2: rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ImpliesExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__0"


    // $ANTLR start "rule__ImpliesExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:3012:1: rule__ImpliesExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__ImpliesExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3016:1: ( ( ruleOrExpression ) )
            // InternalKerMLExpressions.g:3017:1: ( ruleOrExpression )
            {
            // InternalKerMLExpressions.g:3017:1: ( ruleOrExpression )
            // InternalKerMLExpressions.g:3018:2: ruleOrExpression
            {
             before(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group__1"
    // InternalKerMLExpressions.g:3027:1: rule__ImpliesExpression__Group__1 : rule__ImpliesExpression__Group__1__Impl ;
    public final void rule__ImpliesExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3031:1: ( rule__ImpliesExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3032:2: rule__ImpliesExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__1"


    // $ANTLR start "rule__ImpliesExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:3038:1: rule__ImpliesExpression__Group__1__Impl : ( ( rule__ImpliesExpression__Group_1__0 )* ) ;
    public final void rule__ImpliesExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3042:1: ( ( ( rule__ImpliesExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3043:1: ( ( rule__ImpliesExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3043:1: ( ( rule__ImpliesExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3044:2: ( rule__ImpliesExpression__Group_1__0 )*
            {
             before(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:3045:2: ( rule__ImpliesExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=16 && LA32_0<=17)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3045:3: rule__ImpliesExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ImpliesExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__0"
    // InternalKerMLExpressions.g:3054:1: rule__ImpliesExpression__Group_1__0 : rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 ;
    public final void rule__ImpliesExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3058:1: ( rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3059:2: rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ImpliesExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0"


    // $ANTLR start "rule__ImpliesExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:3066:1: rule__ImpliesExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ImpliesExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3070:1: ( ( () ) )
            // InternalKerMLExpressions.g:3071:1: ( () )
            {
            // InternalKerMLExpressions.g:3071:1: ( () )
            // InternalKerMLExpressions.g:3072:2: ()
            {
             before(grammarAccess.getImpliesExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:3073:2: ()
            // InternalKerMLExpressions.g:3073:3: 
            {
            }

             after(grammarAccess.getImpliesExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1"
    // InternalKerMLExpressions.g:3081:1: rule__ImpliesExpression__Group_1__1 : rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2 ;
    public final void rule__ImpliesExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3085:1: ( rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3086:2: rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ImpliesExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__1"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:3093:1: rule__ImpliesExpression__Group_1__1__Impl : ( ( rule__ImpliesExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ImpliesExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3097:1: ( ( ( rule__ImpliesExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3098:1: ( ( rule__ImpliesExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3098:1: ( ( rule__ImpliesExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3099:2: ( rule__ImpliesExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:3100:2: ( rule__ImpliesExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3100:3: rule__ImpliesExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__2"
    // InternalKerMLExpressions.g:3108:1: rule__ImpliesExpression__Group_1__2 : rule__ImpliesExpression__Group_1__2__Impl ;
    public final void rule__ImpliesExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3112:1: ( rule__ImpliesExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3113:2: rule__ImpliesExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__2"


    // $ANTLR start "rule__ImpliesExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:3119:1: rule__ImpliesExpression__Group_1__2__Impl : ( ( rule__ImpliesExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__ImpliesExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3123:1: ( ( ( rule__ImpliesExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3124:1: ( ( rule__ImpliesExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3124:1: ( ( rule__ImpliesExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3125:2: ( rule__ImpliesExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:3126:2: ( rule__ImpliesExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3126:3: rule__ImpliesExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__2__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalKerMLExpressions.g:3135:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3139:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalKerMLExpressions.g:3140:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3147:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3151:1: ( ( ruleXorExpression ) )
            // InternalKerMLExpressions.g:3152:1: ( ruleXorExpression )
            {
            // InternalKerMLExpressions.g:3152:1: ( ruleXorExpression )
            // InternalKerMLExpressions.g:3153:2: ruleXorExpression
            {
             before(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3162:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3166:1: ( rule__OrExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3167:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3173:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3177:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3178:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3178:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3179:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:3180:2: ( rule__OrExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=18 && LA33_0<=20)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3180:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3189:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3193:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3194:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3201:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3205:1: ( ( () ) )
            // InternalKerMLExpressions.g:3206:1: ( () )
            {
            // InternalKerMLExpressions.g:3206:1: ( () )
            // InternalKerMLExpressions.g:3207:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:3208:2: ()
            // InternalKerMLExpressions.g:3208:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:3216:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3220:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3221:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3228:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3232:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3233:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3233:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3234:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:3235:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3235:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3243:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3247:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3248:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3254:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3258:1: ( ( ( rule__OrExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3259:1: ( ( rule__OrExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3259:1: ( ( rule__OrExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3260:2: ( rule__OrExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:3261:2: ( rule__OrExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3261:3: rule__OrExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3270:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3274:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalKerMLExpressions.g:3275:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__XorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3282:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3286:1: ( ( ruleAndExpression ) )
            // InternalKerMLExpressions.g:3287:1: ( ruleAndExpression )
            {
            // InternalKerMLExpressions.g:3287:1: ( ruleAndExpression )
            // InternalKerMLExpressions.g:3288:2: ruleAndExpression
            {
             before(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3297:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3301:1: ( rule__XorExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3302:2: rule__XorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3308:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3312:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3313:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3313:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3314:2: ( rule__XorExpression__Group_1__0 )*
            {
             before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:3315:2: ( rule__XorExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=21 && LA34_0<=22)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3315:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getXorExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3324:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3328:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3329:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__XorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3336:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3340:1: ( ( () ) )
            // InternalKerMLExpressions.g:3341:1: ( () )
            {
            // InternalKerMLExpressions.g:3341:1: ( () )
            // InternalKerMLExpressions.g:3342:2: ()
            {
             before(grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:3343:2: ()
            // InternalKerMLExpressions.g:3343:3: 
            {
            }

             after(grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:3351:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3355:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3356:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__XorExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3363:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3367:1: ( ( ( rule__XorExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3368:1: ( ( rule__XorExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3368:1: ( ( rule__XorExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3369:2: ( rule__XorExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:3370:2: ( rule__XorExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3370:3: rule__XorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3378:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3382:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3383:2: rule__XorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3389:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3393:1: ( ( ( rule__XorExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3394:1: ( ( rule__XorExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3394:1: ( ( rule__XorExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3395:2: ( rule__XorExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getXorExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:3396:2: ( rule__XorExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3396:3: rule__XorExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3405:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3409:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalKerMLExpressions.g:3410:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3417:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3421:1: ( ( ruleEqualityExpression ) )
            // InternalKerMLExpressions.g:3422:1: ( ruleEqualityExpression )
            {
            // InternalKerMLExpressions.g:3422:1: ( ruleEqualityExpression )
            // InternalKerMLExpressions.g:3423:2: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3432:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3436:1: ( rule__AndExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3437:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3443:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3447:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3448:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3448:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3449:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:3450:2: ( rule__AndExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=23 && LA35_0<=25)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3450:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3459:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3463:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3464:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3471:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3475:1: ( ( () ) )
            // InternalKerMLExpressions.g:3476:1: ( () )
            {
            // InternalKerMLExpressions.g:3476:1: ( () )
            // InternalKerMLExpressions.g:3477:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:3478:2: ()
            // InternalKerMLExpressions.g:3478:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:3486:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3490:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3491:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3498:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3502:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3503:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3503:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3504:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:3505:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3505:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3513:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3517:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3518:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3524:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3528:1: ( ( ( rule__AndExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3529:1: ( ( rule__AndExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3529:1: ( ( rule__AndExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3530:2: ( rule__AndExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:3531:2: ( rule__AndExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3531:3: rule__AndExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3540:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3544:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalKerMLExpressions.g:3545:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3552:1: rule__EqualityExpression__Group__0__Impl : ( ruleClassificationExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3556:1: ( ( ruleClassificationExpression ) )
            // InternalKerMLExpressions.g:3557:1: ( ruleClassificationExpression )
            {
            // InternalKerMLExpressions.g:3557:1: ( ruleClassificationExpression )
            // InternalKerMLExpressions.g:3558:2: ruleClassificationExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleClassificationExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3567:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3571:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3572:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3578:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3582:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3583:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3583:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3584:2: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:3585:2: ( rule__EqualityExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=26 && LA36_0<=27)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3585:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3594:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3598:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3599:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3606:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3610:1: ( ( () ) )
            // InternalKerMLExpressions.g:3611:1: ( () )
            {
            // InternalKerMLExpressions.g:3611:1: ( () )
            // InternalKerMLExpressions.g:3612:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:3613:2: ()
            // InternalKerMLExpressions.g:3613:3: 
            {
            }

             after(grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:3621:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3625:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3626:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3633:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3637:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3638:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3638:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3639:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:3640:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:3640:3: rule__EqualityExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3648:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3652:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:3653:2: rule__EqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3659:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3663:1: ( ( ( rule__EqualityExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3664:1: ( ( rule__EqualityExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3664:1: ( ( rule__EqualityExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3665:2: ( rule__EqualityExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:3666:2: ( rule__EqualityExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:3666:3: rule__EqualityExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3675:1: rule__ClassificationExpression__Group_0__0 : rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1 ;
    public final void rule__ClassificationExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3679:1: ( rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1 )
            // InternalKerMLExpressions.g:3680:2: rule__ClassificationExpression__Group_0__0__Impl rule__ClassificationExpression__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__ClassificationExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3687:1: rule__ClassificationExpression__Group_0__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__ClassificationExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3691:1: ( ( ruleRelationalExpression ) )
            // InternalKerMLExpressions.g:3692:1: ( ruleRelationalExpression )
            {
            // InternalKerMLExpressions.g:3692:1: ( ruleRelationalExpression )
            // InternalKerMLExpressions.g:3693:2: ruleRelationalExpression
            {
             before(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3702:1: rule__ClassificationExpression__Group_0__1 : rule__ClassificationExpression__Group_0__1__Impl ;
    public final void rule__ClassificationExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3706:1: ( rule__ClassificationExpression__Group_0__1__Impl )
            // InternalKerMLExpressions.g:3707:2: rule__ClassificationExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3713:1: rule__ClassificationExpression__Group_0__1__Impl : ( ( rule__ClassificationExpression__Group_0_1__0 )? ) ;
    public final void rule__ClassificationExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3717:1: ( ( ( rule__ClassificationExpression__Group_0_1__0 )? ) )
            // InternalKerMLExpressions.g:3718:1: ( ( rule__ClassificationExpression__Group_0_1__0 )? )
            {
            // InternalKerMLExpressions.g:3718:1: ( ( rule__ClassificationExpression__Group_0_1__0 )? )
            // InternalKerMLExpressions.g:3719:2: ( rule__ClassificationExpression__Group_0_1__0 )?
            {
             before(grammarAccess.getClassificationExpressionAccess().getGroup_0_1()); 
            // InternalKerMLExpressions.g:3720:2: ( rule__ClassificationExpression__Group_0_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=28 && LA37_0<=31)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKerMLExpressions.g:3720:3: rule__ClassificationExpression__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassificationExpression__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassificationExpressionAccess().getGroup_0_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3729:1: rule__ClassificationExpression__Group_0_1__0 : rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1 ;
    public final void rule__ClassificationExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3733:1: ( rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1 )
            // InternalKerMLExpressions.g:3734:2: rule__ClassificationExpression__Group_0_1__0__Impl rule__ClassificationExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ClassificationExpression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3741:1: rule__ClassificationExpression__Group_0_1__0__Impl : ( () ) ;
    public final void rule__ClassificationExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3745:1: ( ( () ) )
            // InternalKerMLExpressions.g:3746:1: ( () )
            {
            // InternalKerMLExpressions.g:3746:1: ( () )
            // InternalKerMLExpressions.g:3747:2: ()
            {
             before(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0()); 
            // InternalKerMLExpressions.g:3748:2: ()
            // InternalKerMLExpressions.g:3748:3: 
            {
            }

             after(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionOperandAction_0_1_0()); 

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
    // InternalKerMLExpressions.g:3756:1: rule__ClassificationExpression__Group_0_1__1 : rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2 ;
    public final void rule__ClassificationExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3760:1: ( rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2 )
            // InternalKerMLExpressions.g:3761:2: rule__ClassificationExpression__Group_0_1__1__Impl rule__ClassificationExpression__Group_0_1__2
            {
            pushFollow(FOLLOW_22);
            rule__ClassificationExpression__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3768:1: rule__ClassificationExpression__Group_0_1__1__Impl : ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__ClassificationExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3772:1: ( ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) ) )
            // InternalKerMLExpressions.g:3773:1: ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) )
            {
            // InternalKerMLExpressions.g:3773:1: ( ( rule__ClassificationExpression__OperatorAssignment_0_1_1 ) )
            // InternalKerMLExpressions.g:3774:2: ( rule__ClassificationExpression__OperatorAssignment_0_1_1 )
            {
             before(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_0_1_1()); 
            // InternalKerMLExpressions.g:3775:2: ( rule__ClassificationExpression__OperatorAssignment_0_1_1 )
            // InternalKerMLExpressions.g:3775:3: rule__ClassificationExpression__OperatorAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OperatorAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_0_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3783:1: rule__ClassificationExpression__Group_0_1__2 : rule__ClassificationExpression__Group_0_1__2__Impl ;
    public final void rule__ClassificationExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3787:1: ( rule__ClassificationExpression__Group_0_1__2__Impl )
            // InternalKerMLExpressions.g:3788:2: rule__ClassificationExpression__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3794:1: rule__ClassificationExpression__Group_0_1__2__Impl : ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 ) ) ;
    public final void rule__ClassificationExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3798:1: ( ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 ) ) )
            // InternalKerMLExpressions.g:3799:1: ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 ) )
            {
            // InternalKerMLExpressions.g:3799:1: ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 ) )
            // InternalKerMLExpressions.g:3800:2: ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 )
            {
             before(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipAssignment_0_1_2()); 
            // InternalKerMLExpressions.g:3801:2: ( rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 )
            // InternalKerMLExpressions.g:3801:3: rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipAssignment_0_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3810:1: rule__ClassificationExpression__Group_1__0 : rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1 ;
    public final void rule__ClassificationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3814:1: ( rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3815:2: rule__ClassificationExpression__Group_1__0__Impl rule__ClassificationExpression__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassificationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3822:1: rule__ClassificationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ClassificationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3826:1: ( ( () ) )
            // InternalKerMLExpressions.g:3827:1: ( () )
            {
            // InternalKerMLExpressions.g:3827:1: ( () )
            // InternalKerMLExpressions.g:3828:2: ()
            {
             before(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0()); 
            // InternalKerMLExpressions.g:3829:2: ()
            // InternalKerMLExpressions.g:3829:3: 
            {
            }

             after(grammarAccess.getClassificationExpressionAccess().getOperatorExpressionAction_1_0()); 

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
    // InternalKerMLExpressions.g:3837:1: rule__ClassificationExpression__Group_1__1 : rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2 ;
    public final void rule__ClassificationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3841:1: ( rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2 )
            // InternalKerMLExpressions.g:3842:2: rule__ClassificationExpression__Group_1__1__Impl rule__ClassificationExpression__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__ClassificationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3849:1: rule__ClassificationExpression__Group_1__1__Impl : ( ( rule__ClassificationExpression__OperandAssignment_1_1 ) ) ;
    public final void rule__ClassificationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3853:1: ( ( ( rule__ClassificationExpression__OperandAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:3854:1: ( ( rule__ClassificationExpression__OperandAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:3854:1: ( ( rule__ClassificationExpression__OperandAssignment_1_1 ) )
            // InternalKerMLExpressions.g:3855:2: ( rule__ClassificationExpression__OperandAssignment_1_1 )
            {
             before(grammarAccess.getClassificationExpressionAccess().getOperandAssignment_1_1()); 
            // InternalKerMLExpressions.g:3856:2: ( rule__ClassificationExpression__OperandAssignment_1_1 )
            // InternalKerMLExpressions.g:3856:3: rule__ClassificationExpression__OperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OperandAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassificationExpressionAccess().getOperandAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3864:1: rule__ClassificationExpression__Group_1__2 : rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3 ;
    public final void rule__ClassificationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3868:1: ( rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3 )
            // InternalKerMLExpressions.g:3869:2: rule__ClassificationExpression__Group_1__2__Impl rule__ClassificationExpression__Group_1__3
            {
            pushFollow(FOLLOW_22);
            rule__ClassificationExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3876:1: rule__ClassificationExpression__Group_1__2__Impl : ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) ) ;
    public final void rule__ClassificationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3880:1: ( ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:3881:1: ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:3881:1: ( ( rule__ClassificationExpression__OperatorAssignment_1_2 ) )
            // InternalKerMLExpressions.g:3882:2: ( rule__ClassificationExpression__OperatorAssignment_1_2 )
            {
             before(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_1_2()); 
            // InternalKerMLExpressions.g:3883:2: ( rule__ClassificationExpression__OperatorAssignment_1_2 )
            // InternalKerMLExpressions.g:3883:3: rule__ClassificationExpression__OperatorAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OperatorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClassificationExpressionAccess().getOperatorAssignment_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3891:1: rule__ClassificationExpression__Group_1__3 : rule__ClassificationExpression__Group_1__3__Impl ;
    public final void rule__ClassificationExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3895:1: ( rule__ClassificationExpression__Group_1__3__Impl )
            // InternalKerMLExpressions.g:3896:2: rule__ClassificationExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__Group_1__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3902:1: rule__ClassificationExpression__Group_1__3__Impl : ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 ) ) ;
    public final void rule__ClassificationExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3906:1: ( ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 ) ) )
            // InternalKerMLExpressions.g:3907:1: ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 ) )
            {
            // InternalKerMLExpressions.g:3907:1: ( ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 ) )
            // InternalKerMLExpressions.g:3908:2: ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 )
            {
             before(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipAssignment_1_3()); 
            // InternalKerMLExpressions.g:3909:2: ( rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 )
            // InternalKerMLExpressions.g:3909:3: rule__ClassificationExpression__OwnedRelationshipAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassificationExpression__OwnedRelationshipAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipAssignment_1_3()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3918:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3922:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalKerMLExpressions.g:3923:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3930:1: rule__RelationalExpression__Group__0__Impl : ( ruleRangeExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3934:1: ( ( ruleRangeExpression ) )
            // InternalKerMLExpressions.g:3935:1: ( ruleRangeExpression )
            {
            // InternalKerMLExpressions.g:3935:1: ( ruleRangeExpression )
            // InternalKerMLExpressions.g:3936:2: ruleRangeExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRangeExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3945:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3949:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:3950:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3956:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3960:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:3961:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:3961:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:3962:2: ( rule__RelationalExpression__Group_1__0 )*
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:3963:2: ( rule__RelationalExpression__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=32 && LA38_0<=35)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3963:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:3972:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3976:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalKerMLExpressions.g:3977:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:3984:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:3988:1: ( ( () ) )
            // InternalKerMLExpressions.g:3989:1: ( () )
            {
            // InternalKerMLExpressions.g:3989:1: ( () )
            // InternalKerMLExpressions.g:3990:2: ()
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:3991:2: ()
            // InternalKerMLExpressions.g:3991:3: 
            {
            }

             after(grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:3999:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4003:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4004:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__RelationalExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4011:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4015:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4016:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4016:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4017:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:4018:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4018:3: rule__RelationalExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4026:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4030:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4031:2: rule__RelationalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4037:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4041:1: ( ( ( rule__RelationalExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4042:1: ( ( rule__RelationalExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4042:1: ( ( rule__RelationalExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4043:2: ( rule__RelationalExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:4044:2: ( rule__RelationalExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:4044:3: rule__RelationalExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__RangeExpression__Group__0"
    // InternalKerMLExpressions.g:4053:1: rule__RangeExpression__Group__0 : rule__RangeExpression__Group__0__Impl rule__RangeExpression__Group__1 ;
    public final void rule__RangeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4057:1: ( rule__RangeExpression__Group__0__Impl rule__RangeExpression__Group__1 )
            // InternalKerMLExpressions.g:4058:2: rule__RangeExpression__Group__0__Impl rule__RangeExpression__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__RangeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group__0"


    // $ANTLR start "rule__RangeExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:4065:1: rule__RangeExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RangeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4069:1: ( ( ruleAdditiveExpression ) )
            // InternalKerMLExpressions.g:4070:1: ( ruleAdditiveExpression )
            {
            // InternalKerMLExpressions.g:4070:1: ( ruleAdditiveExpression )
            // InternalKerMLExpressions.g:4071:2: ruleAdditiveExpression
            {
             before(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group__0__Impl"


    // $ANTLR start "rule__RangeExpression__Group__1"
    // InternalKerMLExpressions.g:4080:1: rule__RangeExpression__Group__1 : rule__RangeExpression__Group__1__Impl ;
    public final void rule__RangeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4084:1: ( rule__RangeExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4085:2: rule__RangeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group__1"


    // $ANTLR start "rule__RangeExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:4091:1: rule__RangeExpression__Group__1__Impl : ( ( rule__RangeExpression__Group_1__0 )? ) ;
    public final void rule__RangeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4095:1: ( ( ( rule__RangeExpression__Group_1__0 )? ) )
            // InternalKerMLExpressions.g:4096:1: ( ( rule__RangeExpression__Group_1__0 )? )
            {
            // InternalKerMLExpressions.g:4096:1: ( ( rule__RangeExpression__Group_1__0 )? )
            // InternalKerMLExpressions.g:4097:2: ( rule__RangeExpression__Group_1__0 )?
            {
             before(grammarAccess.getRangeExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:4098:2: ( rule__RangeExpression__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKerMLExpressions.g:4098:3: rule__RangeExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RangeExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRangeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group__1__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1__0"
    // InternalKerMLExpressions.g:4107:1: rule__RangeExpression__Group_1__0 : rule__RangeExpression__Group_1__0__Impl rule__RangeExpression__Group_1__1 ;
    public final void rule__RangeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4111:1: ( rule__RangeExpression__Group_1__0__Impl rule__RangeExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4112:2: rule__RangeExpression__Group_1__0__Impl rule__RangeExpression__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__RangeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__0"


    // $ANTLR start "rule__RangeExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:4119:1: rule__RangeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RangeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4123:1: ( ( () ) )
            // InternalKerMLExpressions.g:4124:1: ( () )
            {
            // InternalKerMLExpressions.g:4124:1: ( () )
            // InternalKerMLExpressions.g:4125:2: ()
            {
             before(grammarAccess.getRangeExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:4126:2: ()
            // InternalKerMLExpressions.g:4126:3: 
            {
            }

             after(grammarAccess.getRangeExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1__1"
    // InternalKerMLExpressions.g:4134:1: rule__RangeExpression__Group_1__1 : rule__RangeExpression__Group_1__1__Impl rule__RangeExpression__Group_1__2 ;
    public final void rule__RangeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4138:1: ( rule__RangeExpression__Group_1__1__Impl rule__RangeExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4139:2: rule__RangeExpression__Group_1__1__Impl rule__RangeExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__RangeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__1"


    // $ANTLR start "rule__RangeExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:4146:1: rule__RangeExpression__Group_1__1__Impl : ( ( rule__RangeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__RangeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4150:1: ( ( ( rule__RangeExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4151:1: ( ( rule__RangeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4151:1: ( ( rule__RangeExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4152:2: ( rule__RangeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getRangeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:4153:2: ( rule__RangeExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4153:3: rule__RangeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1__2"
    // InternalKerMLExpressions.g:4161:1: rule__RangeExpression__Group_1__2 : rule__RangeExpression__Group_1__2__Impl ;
    public final void rule__RangeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4165:1: ( rule__RangeExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4166:2: rule__RangeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__2"


    // $ANTLR start "rule__RangeExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:4172:1: rule__RangeExpression__Group_1__2__Impl : ( ( rule__RangeExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__RangeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4176:1: ( ( ( rule__RangeExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4177:1: ( ( rule__RangeExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4177:1: ( ( rule__RangeExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4178:2: ( rule__RangeExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getRangeExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:4179:2: ( rule__RangeExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:4179:3: rule__RangeExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalKerMLExpressions.g:4188:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4192:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalKerMLExpressions.g:4193:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4200:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4204:1: ( ( ruleMultiplicativeExpression ) )
            // InternalKerMLExpressions.g:4205:1: ( ruleMultiplicativeExpression )
            {
            // InternalKerMLExpressions.g:4205:1: ( ruleMultiplicativeExpression )
            // InternalKerMLExpressions.g:4206:2: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4215:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4219:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4220:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4226:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4230:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:4231:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:4231:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:4232:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:4233:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=36 && LA40_0<=37)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4233:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4242:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4246:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4247:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4254:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4258:1: ( ( () ) )
            // InternalKerMLExpressions.g:4259:1: ( () )
            {
            // InternalKerMLExpressions.g:4259:1: ( () )
            // InternalKerMLExpressions.g:4260:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:4261:2: ()
            // InternalKerMLExpressions.g:4261:3: 
            {
            }

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:4269:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4273:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4274:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4281:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4285:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4286:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4286:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4287:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:4288:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4288:3: rule__AdditiveExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4296:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4300:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4301:2: rule__AdditiveExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4307:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4311:1: ( ( ( rule__AdditiveExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4312:1: ( ( rule__AdditiveExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4312:1: ( ( rule__AdditiveExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4313:2: ( rule__AdditiveExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:4314:2: ( rule__AdditiveExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:4314:3: rule__AdditiveExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4323:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4327:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalKerMLExpressions.g:4328:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4335:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleExponentiationExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4339:1: ( ( ruleExponentiationExpression ) )
            // InternalKerMLExpressions.g:4340:1: ( ruleExponentiationExpression )
            {
            // InternalKerMLExpressions.g:4340:1: ( ruleExponentiationExpression )
            // InternalKerMLExpressions.g:4341:2: ruleExponentiationExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExponentiationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4350:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4354:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4355:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4361:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4365:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:4366:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:4366:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:4367:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:4368:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=38 && LA41_0<=40)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4368:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4377:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4381:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4382:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4389:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4393:1: ( ( () ) )
            // InternalKerMLExpressions.g:4394:1: ( () )
            {
            // InternalKerMLExpressions.g:4394:1: ( () )
            // InternalKerMLExpressions.g:4395:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:4396:2: ()
            // InternalKerMLExpressions.g:4396:3: 
            {
            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:4404:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4408:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4409:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4416:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4420:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4421:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4421:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4422:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:4423:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4423:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4431:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4435:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4436:2: rule__MultiplicativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4442:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4446:1: ( ( ( rule__MultiplicativeExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4447:1: ( ( rule__MultiplicativeExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4447:1: ( ( rule__MultiplicativeExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4448:2: ( rule__MultiplicativeExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:4449:2: ( rule__MultiplicativeExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:4449:3: rule__MultiplicativeExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4458:1: rule__ExponentiationExpression__Group__0 : rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1 ;
    public final void rule__ExponentiationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4462:1: ( rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1 )
            // InternalKerMLExpressions.g:4463:2: rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ExponentiationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4470:1: rule__ExponentiationExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__ExponentiationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4474:1: ( ( ruleUnaryExpression ) )
            // InternalKerMLExpressions.g:4475:1: ( ruleUnaryExpression )
            {
            // InternalKerMLExpressions.g:4475:1: ( ruleUnaryExpression )
            // InternalKerMLExpressions.g:4476:2: ruleUnaryExpression
            {
             before(grammarAccess.getExponentiationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getExponentiationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4485:1: rule__ExponentiationExpression__Group__1 : rule__ExponentiationExpression__Group__1__Impl ;
    public final void rule__ExponentiationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4489:1: ( rule__ExponentiationExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:4490:2: rule__ExponentiationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4496:1: rule__ExponentiationExpression__Group__1__Impl : ( ( rule__ExponentiationExpression__Group_1__0 )* ) ;
    public final void rule__ExponentiationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4500:1: ( ( ( rule__ExponentiationExpression__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:4501:1: ( ( rule__ExponentiationExpression__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:4501:1: ( ( rule__ExponentiationExpression__Group_1__0 )* )
            // InternalKerMLExpressions.g:4502:2: ( rule__ExponentiationExpression__Group_1__0 )*
            {
             before(grammarAccess.getExponentiationExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:4503:2: ( rule__ExponentiationExpression__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=41 && LA42_0<=42)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4503:3: rule__ExponentiationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ExponentiationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getExponentiationExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4512:1: rule__ExponentiationExpression__Group_1__0 : rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1 ;
    public final void rule__ExponentiationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4516:1: ( rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4517:2: rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__ExponentiationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4524:1: rule__ExponentiationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ExponentiationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4528:1: ( ( () ) )
            // InternalKerMLExpressions.g:4529:1: ( () )
            {
            // InternalKerMLExpressions.g:4529:1: ( () )
            // InternalKerMLExpressions.g:4530:2: ()
            {
             before(grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:4531:2: ()
            // InternalKerMLExpressions.g:4531:3: 
            {
            }

             after(grammarAccess.getExponentiationExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

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
    // InternalKerMLExpressions.g:4539:1: rule__ExponentiationExpression__Group_1__1 : rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2 ;
    public final void rule__ExponentiationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4543:1: ( rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4544:2: rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ExponentiationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4551:1: rule__ExponentiationExpression__Group_1__1__Impl : ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ExponentiationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4555:1: ( ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:4556:1: ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:4556:1: ( ( rule__ExponentiationExpression__OperatorAssignment_1_1 ) )
            // InternalKerMLExpressions.g:4557:2: ( rule__ExponentiationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExponentiationExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalKerMLExpressions.g:4558:2: ( rule__ExponentiationExpression__OperatorAssignment_1_1 )
            // InternalKerMLExpressions.g:4558:3: rule__ExponentiationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExponentiationExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4566:1: rule__ExponentiationExpression__Group_1__2 : rule__ExponentiationExpression__Group_1__2__Impl ;
    public final void rule__ExponentiationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4570:1: ( rule__ExponentiationExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4571:2: rule__ExponentiationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4577:1: rule__ExponentiationExpression__Group_1__2__Impl : ( ( rule__ExponentiationExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__ExponentiationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4581:1: ( ( ( rule__ExponentiationExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4582:1: ( ( rule__ExponentiationExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4582:1: ( ( rule__ExponentiationExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4583:2: ( rule__ExponentiationExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getExponentiationExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:4584:2: ( rule__ExponentiationExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:4584:3: rule__ExponentiationExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExponentiationExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // InternalKerMLExpressions.g:4593:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4597:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalKerMLExpressions.g:4598:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4605:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4609:1: ( ( () ) )
            // InternalKerMLExpressions.g:4610:1: ( () )
            {
            // InternalKerMLExpressions.g:4610:1: ( () )
            // InternalKerMLExpressions.g:4611:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0()); 
            // InternalKerMLExpressions.g:4612:2: ()
            // InternalKerMLExpressions.g:4612:3: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_0_0()); 

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
    // InternalKerMLExpressions.g:4620:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4624:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalKerMLExpressions.g:4625:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4632:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4636:1: ( ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) )
            // InternalKerMLExpressions.g:4637:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKerMLExpressions.g:4637:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            // InternalKerMLExpressions.g:4638:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            // InternalKerMLExpressions.g:4639:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            // InternalKerMLExpressions.g:4639:3: rule__UnaryExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperatorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4647:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4651:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalKerMLExpressions.g:4652:2: rule__UnaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4658:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4662:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalKerMLExpressions.g:4663:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalKerMLExpressions.g:4663:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalKerMLExpressions.g:4664:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            // InternalKerMLExpressions.g:4665:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalKerMLExpressions.g:4665:3: rule__UnaryExpression__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4674:1: rule__ExtentExpression__Group_0__0 : rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1 ;
    public final void rule__ExtentExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4678:1: ( rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1 )
            // InternalKerMLExpressions.g:4679:2: rule__ExtentExpression__Group_0__0__Impl rule__ExtentExpression__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__ExtentExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtentExpression__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4686:1: rule__ExtentExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ExtentExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4690:1: ( ( () ) )
            // InternalKerMLExpressions.g:4691:1: ( () )
            {
            // InternalKerMLExpressions.g:4691:1: ( () )
            // InternalKerMLExpressions.g:4692:2: ()
            {
             before(grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0()); 
            // InternalKerMLExpressions.g:4693:2: ()
            // InternalKerMLExpressions.g:4693:3: 
            {
            }

             after(grammarAccess.getExtentExpressionAccess().getOperatorExpressionAction_0_0()); 

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
    // InternalKerMLExpressions.g:4701:1: rule__ExtentExpression__Group_0__1 : rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2 ;
    public final void rule__ExtentExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4705:1: ( rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2 )
            // InternalKerMLExpressions.g:4706:2: rule__ExtentExpression__Group_0__1__Impl rule__ExtentExpression__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__ExtentExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtentExpression__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4713:1: rule__ExtentExpression__Group_0__1__Impl : ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ExtentExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4717:1: ( ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) ) )
            // InternalKerMLExpressions.g:4718:1: ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKerMLExpressions.g:4718:1: ( ( rule__ExtentExpression__OperatorAssignment_0_1 ) )
            // InternalKerMLExpressions.g:4719:2: ( rule__ExtentExpression__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getExtentExpressionAccess().getOperatorAssignment_0_1()); 
            // InternalKerMLExpressions.g:4720:2: ( rule__ExtentExpression__OperatorAssignment_0_1 )
            // InternalKerMLExpressions.g:4720:3: rule__ExtentExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__OperatorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExtentExpressionAccess().getOperatorAssignment_0_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:4728:1: rule__ExtentExpression__Group_0__2 : rule__ExtentExpression__Group_0__2__Impl ;
    public final void rule__ExtentExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4732:1: ( rule__ExtentExpression__Group_0__2__Impl )
            // InternalKerMLExpressions.g:4733:2: rule__ExtentExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:4739:1: rule__ExtentExpression__Group_0__2__Impl : ( ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 ) ) ;
    public final void rule__ExtentExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4743:1: ( ( ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 ) ) )
            // InternalKerMLExpressions.g:4744:1: ( ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 ) )
            {
            // InternalKerMLExpressions.g:4744:1: ( ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 ) )
            // InternalKerMLExpressions.g:4745:2: ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 )
            {
             before(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipAssignment_0_2()); 
            // InternalKerMLExpressions.g:4746:2: ( rule__ExtentExpression__OwnedRelationshipAssignment_0_2 )
            // InternalKerMLExpressions.g:4746:3: rule__ExtentExpression__OwnedRelationshipAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExtentExpression__OwnedRelationshipAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipAssignment_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimaryExpression__Group__0"
    // InternalKerMLExpressions.g:4755:1: rule__PrimaryExpression__Group__0 : rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1 ;
    public final void rule__PrimaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4759:1: ( rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1 )
            // InternalKerMLExpressions.g:4760:2: rule__PrimaryExpression__Group__0__Impl rule__PrimaryExpression__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__PrimaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__0"


    // $ANTLR start "rule__PrimaryExpression__Group__0__Impl"
    // InternalKerMLExpressions.g:4767:1: rule__PrimaryExpression__Group__0__Impl : ( ruleBaseExpression ) ;
    public final void rule__PrimaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4771:1: ( ( ruleBaseExpression ) )
            // InternalKerMLExpressions.g:4772:1: ( ruleBaseExpression )
            {
            // InternalKerMLExpressions.g:4772:1: ( ruleBaseExpression )
            // InternalKerMLExpressions.g:4773:2: ruleBaseExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group__1"
    // InternalKerMLExpressions.g:4782:1: rule__PrimaryExpression__Group__1 : rule__PrimaryExpression__Group__1__Impl rule__PrimaryExpression__Group__2 ;
    public final void rule__PrimaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4786:1: ( rule__PrimaryExpression__Group__1__Impl rule__PrimaryExpression__Group__2 )
            // InternalKerMLExpressions.g:4787:2: rule__PrimaryExpression__Group__1__Impl rule__PrimaryExpression__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__PrimaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__1"


    // $ANTLR start "rule__PrimaryExpression__Group__1__Impl"
    // InternalKerMLExpressions.g:4794:1: rule__PrimaryExpression__Group__1__Impl : ( ( rule__PrimaryExpression__Group_1__0 )? ) ;
    public final void rule__PrimaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4798:1: ( ( ( rule__PrimaryExpression__Group_1__0 )? ) )
            // InternalKerMLExpressions.g:4799:1: ( ( rule__PrimaryExpression__Group_1__0 )? )
            {
            // InternalKerMLExpressions.g:4799:1: ( ( rule__PrimaryExpression__Group_1__0 )? )
            // InternalKerMLExpressions.g:4800:2: ( rule__PrimaryExpression__Group_1__0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:4801:2: ( rule__PrimaryExpression__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                int LA43_1 = input.LA(2);

                if ( ((LA43_1>=RULE_ID && LA43_1<=RULE_UNRESTRICTED_NAME)) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalKerMLExpressions.g:4801:3: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group__2"
    // InternalKerMLExpressions.g:4809:1: rule__PrimaryExpression__Group__2 : rule__PrimaryExpression__Group__2__Impl ;
    public final void rule__PrimaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4813:1: ( rule__PrimaryExpression__Group__2__Impl )
            // InternalKerMLExpressions.g:4814:2: rule__PrimaryExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__2"


    // $ANTLR start "rule__PrimaryExpression__Group__2__Impl"
    // InternalKerMLExpressions.g:4820:1: rule__PrimaryExpression__Group__2__Impl : ( ( rule__PrimaryExpression__Group_2__0 )* ) ;
    public final void rule__PrimaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4824:1: ( ( ( rule__PrimaryExpression__Group_2__0 )* ) )
            // InternalKerMLExpressions.g:4825:1: ( ( rule__PrimaryExpression__Group_2__0 )* )
            {
            // InternalKerMLExpressions.g:4825:1: ( ( rule__PrimaryExpression__Group_2__0 )* )
            // InternalKerMLExpressions.g:4826:2: ( rule__PrimaryExpression__Group_2__0 )*
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
            // InternalKerMLExpressions.g:4827:2: ( rule__PrimaryExpression__Group_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==53||LA44_0==55||LA44_0==66) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4827:3: rule__PrimaryExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__PrimaryExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalKerMLExpressions.g:4836:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4840:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalKerMLExpressions.g:4841:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalKerMLExpressions.g:4848:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4852:1: ( ( () ) )
            // InternalKerMLExpressions.g:4853:1: ( () )
            {
            // InternalKerMLExpressions.g:4853:1: ( () )
            // InternalKerMLExpressions.g:4854:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getPathStepExpressionOperandAction_1_0()); 
            // InternalKerMLExpressions.g:4855:2: ()
            // InternalKerMLExpressions.g:4855:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getPathStepExpressionOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalKerMLExpressions.g:4863:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4867:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalKerMLExpressions.g:4868:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalKerMLExpressions.g:4875:1: rule__PrimaryExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4879:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:4880:1: ( '.' )
            {
            // InternalKerMLExpressions.g:4880:1: ( '.' )
            // InternalKerMLExpressions.g:4881:2: '.'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // InternalKerMLExpressions.g:4890:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4894:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalKerMLExpressions.g:4895:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // InternalKerMLExpressions.g:4901:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4905:1: ( ( ( rule__PrimaryExpression__OperandAssignment_1_2 ) ) )
            // InternalKerMLExpressions.g:4906:1: ( ( rule__PrimaryExpression__OperandAssignment_1_2 ) )
            {
            // InternalKerMLExpressions.g:4906:1: ( ( rule__PrimaryExpression__OperandAssignment_1_2 ) )
            // InternalKerMLExpressions.g:4907:2: ( rule__PrimaryExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperandAssignment_1_2()); 
            // InternalKerMLExpressions.g:4908:2: ( rule__PrimaryExpression__OperandAssignment_1_2 )
            // InternalKerMLExpressions.g:4908:3: rule__PrimaryExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalKerMLExpressions.g:4917:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4921:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalKerMLExpressions.g:4922:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalKerMLExpressions.g:4929:1: rule__PrimaryExpression__Group_2__0__Impl : ( ( rule__PrimaryExpression__Alternatives_2_0 ) ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4933:1: ( ( ( rule__PrimaryExpression__Alternatives_2_0 ) ) )
            // InternalKerMLExpressions.g:4934:1: ( ( rule__PrimaryExpression__Alternatives_2_0 ) )
            {
            // InternalKerMLExpressions.g:4934:1: ( ( rule__PrimaryExpression__Alternatives_2_0 ) )
            // InternalKerMLExpressions.g:4935:2: ( rule__PrimaryExpression__Alternatives_2_0 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_0()); 
            // InternalKerMLExpressions.g:4936:2: ( rule__PrimaryExpression__Alternatives_2_0 )
            // InternalKerMLExpressions.g:4936:3: rule__PrimaryExpression__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalKerMLExpressions.g:4944:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4948:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalKerMLExpressions.g:4949:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalKerMLExpressions.g:4955:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__Group_2_1__0 )? ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4959:1: ( ( ( rule__PrimaryExpression__Group_2_1__0 )? ) )
            // InternalKerMLExpressions.g:4960:1: ( ( rule__PrimaryExpression__Group_2_1__0 )? )
            {
            // InternalKerMLExpressions.g:4960:1: ( ( rule__PrimaryExpression__Group_2_1__0 )? )
            // InternalKerMLExpressions.g:4961:2: ( rule__PrimaryExpression__Group_2_1__0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_1()); 
            // InternalKerMLExpressions.g:4962:2: ( rule__PrimaryExpression__Group_2_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                int LA45_1 = input.LA(2);

                if ( ((LA45_1>=RULE_ID && LA45_1<=RULE_UNRESTRICTED_NAME)) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalKerMLExpressions.g:4962:3: rule__PrimaryExpression__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_0__0"
    // InternalKerMLExpressions.g:4971:1: rule__PrimaryExpression__Group_2_0_0__0 : rule__PrimaryExpression__Group_2_0_0__0__Impl rule__PrimaryExpression__Group_2_0_0__1 ;
    public final void rule__PrimaryExpression__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4975:1: ( rule__PrimaryExpression__Group_2_0_0__0__Impl rule__PrimaryExpression__Group_2_0_0__1 )
            // InternalKerMLExpressions.g:4976:2: rule__PrimaryExpression__Group_2_0_0__0__Impl rule__PrimaryExpression__Group_2_0_0__1
            {
            pushFollow(FOLLOW_37);
            rule__PrimaryExpression__Group_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_0__0__Impl"
    // InternalKerMLExpressions.g:4983:1: rule__PrimaryExpression__Group_2_0_0__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:4987:1: ( ( () ) )
            // InternalKerMLExpressions.g:4988:1: ( () )
            {
            // InternalKerMLExpressions.g:4988:1: ( () )
            // InternalKerMLExpressions.g:4989:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_0_0()); 
            // InternalKerMLExpressions.g:4990:2: ()
            // InternalKerMLExpressions.g:4990:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_0__1"
    // InternalKerMLExpressions.g:4998:1: rule__PrimaryExpression__Group_2_0_0__1 : rule__PrimaryExpression__Group_2_0_0__1__Impl rule__PrimaryExpression__Group_2_0_0__2 ;
    public final void rule__PrimaryExpression__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5002:1: ( rule__PrimaryExpression__Group_2_0_0__1__Impl rule__PrimaryExpression__Group_2_0_0__2 )
            // InternalKerMLExpressions.g:5003:2: rule__PrimaryExpression__Group_2_0_0__1__Impl rule__PrimaryExpression__Group_2_0_0__2
            {
            pushFollow(FOLLOW_5);
            rule__PrimaryExpression__Group_2_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_0__1__Impl"
    // InternalKerMLExpressions.g:5010:1: rule__PrimaryExpression__Group_2_0_0__1__Impl : ( ( rule__PrimaryExpression__OperatorAssignment_2_0_0_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5014:1: ( ( ( rule__PrimaryExpression__OperatorAssignment_2_0_0_1 ) ) )
            // InternalKerMLExpressions.g:5015:1: ( ( rule__PrimaryExpression__OperatorAssignment_2_0_0_1 ) )
            {
            // InternalKerMLExpressions.g:5015:1: ( ( rule__PrimaryExpression__OperatorAssignment_2_0_0_1 ) )
            // InternalKerMLExpressions.g:5016:2: ( rule__PrimaryExpression__OperatorAssignment_2_0_0_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperatorAssignment_2_0_0_1()); 
            // InternalKerMLExpressions.g:5017:2: ( rule__PrimaryExpression__OperatorAssignment_2_0_0_1 )
            // InternalKerMLExpressions.g:5017:3: rule__PrimaryExpression__OperatorAssignment_2_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__OperatorAssignment_2_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getOperatorAssignment_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_0__2"
    // InternalKerMLExpressions.g:5025:1: rule__PrimaryExpression__Group_2_0_0__2 : rule__PrimaryExpression__Group_2_0_0__2__Impl rule__PrimaryExpression__Group_2_0_0__3 ;
    public final void rule__PrimaryExpression__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5029:1: ( rule__PrimaryExpression__Group_2_0_0__2__Impl rule__PrimaryExpression__Group_2_0_0__3 )
            // InternalKerMLExpressions.g:5030:2: rule__PrimaryExpression__Group_2_0_0__2__Impl rule__PrimaryExpression__Group_2_0_0__3
            {
            pushFollow(FOLLOW_38);
            rule__PrimaryExpression__Group_2_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_0__2__Impl"
    // InternalKerMLExpressions.g:5037:1: rule__PrimaryExpression__Group_2_0_0__2__Impl : ( ( rule__PrimaryExpression__OperandAssignment_2_0_0_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5041:1: ( ( ( rule__PrimaryExpression__OperandAssignment_2_0_0_2 ) ) )
            // InternalKerMLExpressions.g:5042:1: ( ( rule__PrimaryExpression__OperandAssignment_2_0_0_2 ) )
            {
            // InternalKerMLExpressions.g:5042:1: ( ( rule__PrimaryExpression__OperandAssignment_2_0_0_2 ) )
            // InternalKerMLExpressions.g:5043:2: ( rule__PrimaryExpression__OperandAssignment_2_0_0_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperandAssignment_2_0_0_2()); 
            // InternalKerMLExpressions.g:5044:2: ( rule__PrimaryExpression__OperandAssignment_2_0_0_2 )
            // InternalKerMLExpressions.g:5044:3: rule__PrimaryExpression__OperandAssignment_2_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__OperandAssignment_2_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getOperandAssignment_2_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_0__3"
    // InternalKerMLExpressions.g:5052:1: rule__PrimaryExpression__Group_2_0_0__3 : rule__PrimaryExpression__Group_2_0_0__3__Impl ;
    public final void rule__PrimaryExpression__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5056:1: ( rule__PrimaryExpression__Group_2_0_0__3__Impl )
            // InternalKerMLExpressions.g:5057:2: rule__PrimaryExpression__Group_2_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_0__3"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_0__3__Impl"
    // InternalKerMLExpressions.g:5063:1: rule__PrimaryExpression__Group_2_0_0__3__Impl : ( ']' ) ;
    public final void rule__PrimaryExpression__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5067:1: ( ( ']' ) )
            // InternalKerMLExpressions.g:5068:1: ( ']' )
            {
            // InternalKerMLExpressions.g:5068:1: ( ']' )
            // InternalKerMLExpressions.g:5069:2: ']'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_2_0_0_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_2_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_0__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_1__0"
    // InternalKerMLExpressions.g:5079:1: rule__PrimaryExpression__Group_2_0_1__0 : rule__PrimaryExpression__Group_2_0_1__0__Impl rule__PrimaryExpression__Group_2_0_1__1 ;
    public final void rule__PrimaryExpression__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5083:1: ( rule__PrimaryExpression__Group_2_0_1__0__Impl rule__PrimaryExpression__Group_2_0_1__1 )
            // InternalKerMLExpressions.g:5084:2: rule__PrimaryExpression__Group_2_0_1__0__Impl rule__PrimaryExpression__Group_2_0_1__1
            {
            pushFollow(FOLLOW_39);
            rule__PrimaryExpression__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_1__0__Impl"
    // InternalKerMLExpressions.g:5091:1: rule__PrimaryExpression__Group_2_0_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5095:1: ( ( () ) )
            // InternalKerMLExpressions.g:5096:1: ( () )
            {
            // InternalKerMLExpressions.g:5096:1: ( () )
            // InternalKerMLExpressions.g:5097:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_1_0()); 
            // InternalKerMLExpressions.g:5098:2: ()
            // InternalKerMLExpressions.g:5098:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_2_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_1__1"
    // InternalKerMLExpressions.g:5106:1: rule__PrimaryExpression__Group_2_0_1__1 : rule__PrimaryExpression__Group_2_0_1__1__Impl rule__PrimaryExpression__Group_2_0_1__2 ;
    public final void rule__PrimaryExpression__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5110:1: ( rule__PrimaryExpression__Group_2_0_1__1__Impl rule__PrimaryExpression__Group_2_0_1__2 )
            // InternalKerMLExpressions.g:5111:2: rule__PrimaryExpression__Group_2_0_1__1__Impl rule__PrimaryExpression__Group_2_0_1__2
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_2_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_1__1__Impl"
    // InternalKerMLExpressions.g:5118:1: rule__PrimaryExpression__Group_2_0_1__1__Impl : ( '->' ) ;
    public final void rule__PrimaryExpression__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5122:1: ( ( '->' ) )
            // InternalKerMLExpressions.g:5123:1: ( '->' )
            {
            // InternalKerMLExpressions.g:5123:1: ( '->' )
            // InternalKerMLExpressions.g:5124:2: '->'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_0_1_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_1__2"
    // InternalKerMLExpressions.g:5133:1: rule__PrimaryExpression__Group_2_0_1__2 : rule__PrimaryExpression__Group_2_0_1__2__Impl rule__PrimaryExpression__Group_2_0_1__3 ;
    public final void rule__PrimaryExpression__Group_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5137:1: ( rule__PrimaryExpression__Group_2_0_1__2__Impl rule__PrimaryExpression__Group_2_0_1__3 )
            // InternalKerMLExpressions.g:5138:2: rule__PrimaryExpression__Group_2_0_1__2__Impl rule__PrimaryExpression__Group_2_0_1__3
            {
            pushFollow(FOLLOW_40);
            rule__PrimaryExpression__Group_2_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_1__2__Impl"
    // InternalKerMLExpressions.g:5145:1: rule__PrimaryExpression__Group_2_0_1__2__Impl : ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5149:1: ( ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2 ) ) )
            // InternalKerMLExpressions.g:5150:1: ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2 ) )
            {
            // InternalKerMLExpressions.g:5150:1: ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2 ) )
            // InternalKerMLExpressions.g:5151:2: ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipAssignment_2_0_1_2()); 
            // InternalKerMLExpressions.g:5152:2: ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2 )
            // InternalKerMLExpressions.g:5152:3: rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipAssignment_2_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_1__3"
    // InternalKerMLExpressions.g:5160:1: rule__PrimaryExpression__Group_2_0_1__3 : rule__PrimaryExpression__Group_2_0_1__3__Impl ;
    public final void rule__PrimaryExpression__Group_2_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5164:1: ( rule__PrimaryExpression__Group_2_0_1__3__Impl )
            // InternalKerMLExpressions.g:5165:2: rule__PrimaryExpression__Group_2_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_1__3"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_1__3__Impl"
    // InternalKerMLExpressions.g:5171:1: rule__PrimaryExpression__Group_2_0_1__3__Impl : ( ( rule__PrimaryExpression__Alternatives_2_0_1_3 ) ) ;
    public final void rule__PrimaryExpression__Group_2_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5175:1: ( ( ( rule__PrimaryExpression__Alternatives_2_0_1_3 ) ) )
            // InternalKerMLExpressions.g:5176:1: ( ( rule__PrimaryExpression__Alternatives_2_0_1_3 ) )
            {
            // InternalKerMLExpressions.g:5176:1: ( ( rule__PrimaryExpression__Alternatives_2_0_1_3 ) )
            // InternalKerMLExpressions.g:5177:2: ( rule__PrimaryExpression__Alternatives_2_0_1_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_0_1_3()); 
            // InternalKerMLExpressions.g:5178:2: ( rule__PrimaryExpression__Alternatives_2_0_1_3 )
            // InternalKerMLExpressions.g:5178:3: rule__PrimaryExpression__Alternatives_2_0_1_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives_2_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_1__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_2__0"
    // InternalKerMLExpressions.g:5187:1: rule__PrimaryExpression__Group_2_0_2__0 : rule__PrimaryExpression__Group_2_0_2__0__Impl rule__PrimaryExpression__Group_2_0_2__1 ;
    public final void rule__PrimaryExpression__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5191:1: ( rule__PrimaryExpression__Group_2_0_2__0__Impl rule__PrimaryExpression__Group_2_0_2__1 )
            // InternalKerMLExpressions.g:5192:2: rule__PrimaryExpression__Group_2_0_2__0__Impl rule__PrimaryExpression__Group_2_0_2__1
            {
            pushFollow(FOLLOW_34);
            rule__PrimaryExpression__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_2__0__Impl"
    // InternalKerMLExpressions.g:5199:1: rule__PrimaryExpression__Group_2_0_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5203:1: ( ( () ) )
            // InternalKerMLExpressions.g:5204:1: ( () )
            {
            // InternalKerMLExpressions.g:5204:1: ( () )
            // InternalKerMLExpressions.g:5205:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getPathSelectExpressionOperandAction_2_0_2_0()); 
            // InternalKerMLExpressions.g:5206:2: ()
            // InternalKerMLExpressions.g:5206:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getPathSelectExpressionOperandAction_2_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_2__1"
    // InternalKerMLExpressions.g:5214:1: rule__PrimaryExpression__Group_2_0_2__1 : rule__PrimaryExpression__Group_2_0_2__1__Impl rule__PrimaryExpression__Group_2_0_2__2 ;
    public final void rule__PrimaryExpression__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5218:1: ( rule__PrimaryExpression__Group_2_0_2__1__Impl rule__PrimaryExpression__Group_2_0_2__2 )
            // InternalKerMLExpressions.g:5219:2: rule__PrimaryExpression__Group_2_0_2__1__Impl rule__PrimaryExpression__Group_2_0_2__2
            {
            pushFollow(FOLLOW_41);
            rule__PrimaryExpression__Group_2_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_2__1__Impl"
    // InternalKerMLExpressions.g:5226:1: rule__PrimaryExpression__Group_2_0_2__1__Impl : ( '.' ) ;
    public final void rule__PrimaryExpression__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5230:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:5231:1: ( '.' )
            {
            // InternalKerMLExpressions.g:5231:1: ( '.' )
            // InternalKerMLExpressions.g:5232:2: '.'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_0_2_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_2__2"
    // InternalKerMLExpressions.g:5241:1: rule__PrimaryExpression__Group_2_0_2__2 : rule__PrimaryExpression__Group_2_0_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5245:1: ( rule__PrimaryExpression__Group_2_0_2__2__Impl )
            // InternalKerMLExpressions.g:5246:2: rule__PrimaryExpression__Group_2_0_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_0_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2_0_2__2__Impl"
    // InternalKerMLExpressions.g:5252:1: rule__PrimaryExpression__Group_2_0_2__2__Impl : ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5256:1: ( ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2 ) ) )
            // InternalKerMLExpressions.g:5257:1: ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2 ) )
            {
            // InternalKerMLExpressions.g:5257:1: ( ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2 ) )
            // InternalKerMLExpressions.g:5258:2: ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipAssignment_2_0_2_2()); 
            // InternalKerMLExpressions.g:5259:2: ( rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2 )
            // InternalKerMLExpressions.g:5259:3: rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipAssignment_2_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_0_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_1__0"
    // InternalKerMLExpressions.g:5268:1: rule__PrimaryExpression__Group_2_1__0 : rule__PrimaryExpression__Group_2_1__0__Impl rule__PrimaryExpression__Group_2_1__1 ;
    public final void rule__PrimaryExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5272:1: ( rule__PrimaryExpression__Group_2_1__0__Impl rule__PrimaryExpression__Group_2_1__1 )
            // InternalKerMLExpressions.g:5273:2: rule__PrimaryExpression__Group_2_1__0__Impl rule__PrimaryExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_36);
            rule__PrimaryExpression__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_1__0__Impl"
    // InternalKerMLExpressions.g:5280:1: rule__PrimaryExpression__Group_2_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5284:1: ( ( () ) )
            // InternalKerMLExpressions.g:5285:1: ( () )
            {
            // InternalKerMLExpressions.g:5285:1: ( () )
            // InternalKerMLExpressions.g:5286:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getPathStepExpressionOperandAction_2_1_0()); 
            // InternalKerMLExpressions.g:5287:2: ()
            // InternalKerMLExpressions.g:5287:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getPathStepExpressionOperandAction_2_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_1__1"
    // InternalKerMLExpressions.g:5295:1: rule__PrimaryExpression__Group_2_1__1 : rule__PrimaryExpression__Group_2_1__1__Impl rule__PrimaryExpression__Group_2_1__2 ;
    public final void rule__PrimaryExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5299:1: ( rule__PrimaryExpression__Group_2_1__1__Impl rule__PrimaryExpression__Group_2_1__2 )
            // InternalKerMLExpressions.g:5300:2: rule__PrimaryExpression__Group_2_1__1__Impl rule__PrimaryExpression__Group_2_1__2
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_1__1__Impl"
    // InternalKerMLExpressions.g:5307:1: rule__PrimaryExpression__Group_2_1__1__Impl : ( '.' ) ;
    public final void rule__PrimaryExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5311:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:5312:1: ( '.' )
            {
            // InternalKerMLExpressions.g:5312:1: ( '.' )
            // InternalKerMLExpressions.g:5313:2: '.'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_1__2"
    // InternalKerMLExpressions.g:5322:1: rule__PrimaryExpression__Group_2_1__2 : rule__PrimaryExpression__Group_2_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5326:1: ( rule__PrimaryExpression__Group_2_1__2__Impl )
            // InternalKerMLExpressions.g:5327:2: rule__PrimaryExpression__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2_1__2__Impl"
    // InternalKerMLExpressions.g:5333:1: rule__PrimaryExpression__Group_2_1__2__Impl : ( ( rule__PrimaryExpression__OperandAssignment_2_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5337:1: ( ( ( rule__PrimaryExpression__OperandAssignment_2_1_2 ) ) )
            // InternalKerMLExpressions.g:5338:1: ( ( rule__PrimaryExpression__OperandAssignment_2_1_2 ) )
            {
            // InternalKerMLExpressions.g:5338:1: ( ( rule__PrimaryExpression__OperandAssignment_2_1_2 ) )
            // InternalKerMLExpressions.g:5339:2: ( rule__PrimaryExpression__OperandAssignment_2_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperandAssignment_2_1_2()); 
            // InternalKerMLExpressions.g:5340:2: ( rule__PrimaryExpression__OperandAssignment_2_1_2 )
            // InternalKerMLExpressions.g:5340:3: rule__PrimaryExpression__OperandAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__OperandAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getOperandAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_1__2__Impl"


    // $ANTLR start "rule__BaseExpression__Group_5__0"
    // InternalKerMLExpressions.g:5349:1: rule__BaseExpression__Group_5__0 : rule__BaseExpression__Group_5__0__Impl rule__BaseExpression__Group_5__1 ;
    public final void rule__BaseExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5353:1: ( rule__BaseExpression__Group_5__0__Impl rule__BaseExpression__Group_5__1 )
            // InternalKerMLExpressions.g:5354:2: rule__BaseExpression__Group_5__0__Impl rule__BaseExpression__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__BaseExpression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_5__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5361:1: rule__BaseExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__BaseExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5365:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:5366:1: ( '(' )
            {
            // InternalKerMLExpressions.g:5366:1: ( '(' )
            // InternalKerMLExpressions.g:5367:2: '('
            {
             before(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:5376:1: rule__BaseExpression__Group_5__1 : rule__BaseExpression__Group_5__1__Impl rule__BaseExpression__Group_5__2 ;
    public final void rule__BaseExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5380:1: ( rule__BaseExpression__Group_5__1__Impl rule__BaseExpression__Group_5__2 )
            // InternalKerMLExpressions.g:5381:2: rule__BaseExpression__Group_5__1__Impl rule__BaseExpression__Group_5__2
            {
            pushFollow(FOLLOW_42);
            rule__BaseExpression__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_5__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5388:1: rule__BaseExpression__Group_5__1__Impl : ( ruleSequenceExpression ) ;
    public final void rule__BaseExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5392:1: ( ( ruleSequenceExpression ) )
            // InternalKerMLExpressions.g:5393:1: ( ruleSequenceExpression )
            {
            // InternalKerMLExpressions.g:5393:1: ( ruleSequenceExpression )
            // InternalKerMLExpressions.g:5394:2: ruleSequenceExpression
            {
             before(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleSequenceExpression();

            state._fsp--;

             after(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_5_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:5403:1: rule__BaseExpression__Group_5__2 : rule__BaseExpression__Group_5__2__Impl ;
    public final void rule__BaseExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5407:1: ( rule__BaseExpression__Group_5__2__Impl )
            // InternalKerMLExpressions.g:5408:2: rule__BaseExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpression__Group_5__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5414:1: rule__BaseExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__BaseExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5418:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:5419:1: ( ')' )
            {
            // InternalKerMLExpressions.g:5419:1: ( ')' )
            // InternalKerMLExpressions.g:5420:2: ')'
            {
             before(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_5_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_5_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExpressionBody__Group__0"
    // InternalKerMLExpressions.g:5430:1: rule__ExpressionBody__Group__0 : rule__ExpressionBody__Group__0__Impl rule__ExpressionBody__Group__1 ;
    public final void rule__ExpressionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5434:1: ( rule__ExpressionBody__Group__0__Impl rule__ExpressionBody__Group__1 )
            // InternalKerMLExpressions.g:5435:2: rule__ExpressionBody__Group__0__Impl rule__ExpressionBody__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ExpressionBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group__0"


    // $ANTLR start "rule__ExpressionBody__Group__0__Impl"
    // InternalKerMLExpressions.g:5442:1: rule__ExpressionBody__Group__0__Impl : ( '{' ) ;
    public final void rule__ExpressionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5446:1: ( ( '{' ) )
            // InternalKerMLExpressions.g:5447:1: ( '{' )
            {
            // InternalKerMLExpressions.g:5447:1: ( '{' )
            // InternalKerMLExpressions.g:5448:2: '{'
            {
             before(grammarAccess.getExpressionBodyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExpressionBodyAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBody__Group__1"
    // InternalKerMLExpressions.g:5457:1: rule__ExpressionBody__Group__1 : rule__ExpressionBody__Group__1__Impl rule__ExpressionBody__Group__2 ;
    public final void rule__ExpressionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5461:1: ( rule__ExpressionBody__Group__1__Impl rule__ExpressionBody__Group__2 )
            // InternalKerMLExpressions.g:5462:2: rule__ExpressionBody__Group__1__Impl rule__ExpressionBody__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ExpressionBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group__1"


    // $ANTLR start "rule__ExpressionBody__Group__1__Impl"
    // InternalKerMLExpressions.g:5469:1: rule__ExpressionBody__Group__1__Impl : ( ( rule__ExpressionBody__Group_1__0 )* ) ;
    public final void rule__ExpressionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5473:1: ( ( ( rule__ExpressionBody__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:5474:1: ( ( rule__ExpressionBody__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:5474:1: ( ( rule__ExpressionBody__Group_1__0 )* )
            // InternalKerMLExpressions.g:5475:2: ( rule__ExpressionBody__Group_1__0 )*
            {
             before(grammarAccess.getExpressionBodyAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:5476:2: ( rule__ExpressionBody__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==61) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKerMLExpressions.g:5476:3: rule__ExpressionBody__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__ExpressionBody__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getExpressionBodyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBody__Group__2"
    // InternalKerMLExpressions.g:5484:1: rule__ExpressionBody__Group__2 : rule__ExpressionBody__Group__2__Impl rule__ExpressionBody__Group__3 ;
    public final void rule__ExpressionBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5488:1: ( rule__ExpressionBody__Group__2__Impl rule__ExpressionBody__Group__3 )
            // InternalKerMLExpressions.g:5489:2: rule__ExpressionBody__Group__2__Impl rule__ExpressionBody__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__ExpressionBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group__2"


    // $ANTLR start "rule__ExpressionBody__Group__2__Impl"
    // InternalKerMLExpressions.g:5496:1: rule__ExpressionBody__Group__2__Impl : ( ( rule__ExpressionBody__OwnedRelationshipAssignment_2 ) ) ;
    public final void rule__ExpressionBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5500:1: ( ( ( rule__ExpressionBody__OwnedRelationshipAssignment_2 ) ) )
            // InternalKerMLExpressions.g:5501:1: ( ( rule__ExpressionBody__OwnedRelationshipAssignment_2 ) )
            {
            // InternalKerMLExpressions.g:5501:1: ( ( rule__ExpressionBody__OwnedRelationshipAssignment_2 ) )
            // InternalKerMLExpressions.g:5502:2: ( rule__ExpressionBody__OwnedRelationshipAssignment_2 )
            {
             before(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipAssignment_2()); 
            // InternalKerMLExpressions.g:5503:2: ( rule__ExpressionBody__OwnedRelationshipAssignment_2 )
            // InternalKerMLExpressions.g:5503:3: rule__ExpressionBody__OwnedRelationshipAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBody__OwnedRelationshipAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group__2__Impl"


    // $ANTLR start "rule__ExpressionBody__Group__3"
    // InternalKerMLExpressions.g:5511:1: rule__ExpressionBody__Group__3 : rule__ExpressionBody__Group__3__Impl ;
    public final void rule__ExpressionBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5515:1: ( rule__ExpressionBody__Group__3__Impl )
            // InternalKerMLExpressions.g:5516:2: rule__ExpressionBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBody__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group__3"


    // $ANTLR start "rule__ExpressionBody__Group__3__Impl"
    // InternalKerMLExpressions.g:5522:1: rule__ExpressionBody__Group__3__Impl : ( '}' ) ;
    public final void rule__ExpressionBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5526:1: ( ( '}' ) )
            // InternalKerMLExpressions.g:5527:1: ( '}' )
            {
            // InternalKerMLExpressions.g:5527:1: ( '}' )
            // InternalKerMLExpressions.g:5528:2: '}'
            {
             before(grammarAccess.getExpressionBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getExpressionBodyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group__3__Impl"


    // $ANTLR start "rule__ExpressionBody__Group_1__0"
    // InternalKerMLExpressions.g:5538:1: rule__ExpressionBody__Group_1__0 : rule__ExpressionBody__Group_1__0__Impl rule__ExpressionBody__Group_1__1 ;
    public final void rule__ExpressionBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5542:1: ( rule__ExpressionBody__Group_1__0__Impl rule__ExpressionBody__Group_1__1 )
            // InternalKerMLExpressions.g:5543:2: rule__ExpressionBody__Group_1__0__Impl rule__ExpressionBody__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__ExpressionBody__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBody__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group_1__0"


    // $ANTLR start "rule__ExpressionBody__Group_1__0__Impl"
    // InternalKerMLExpressions.g:5550:1: rule__ExpressionBody__Group_1__0__Impl : ( ( rule__ExpressionBody__OwnedRelationshipAssignment_1_0 ) ) ;
    public final void rule__ExpressionBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5554:1: ( ( ( rule__ExpressionBody__OwnedRelationshipAssignment_1_0 ) ) )
            // InternalKerMLExpressions.g:5555:1: ( ( rule__ExpressionBody__OwnedRelationshipAssignment_1_0 ) )
            {
            // InternalKerMLExpressions.g:5555:1: ( ( rule__ExpressionBody__OwnedRelationshipAssignment_1_0 ) )
            // InternalKerMLExpressions.g:5556:2: ( rule__ExpressionBody__OwnedRelationshipAssignment_1_0 )
            {
             before(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipAssignment_1_0()); 
            // InternalKerMLExpressions.g:5557:2: ( rule__ExpressionBody__OwnedRelationshipAssignment_1_0 )
            // InternalKerMLExpressions.g:5557:3: rule__ExpressionBody__OwnedRelationshipAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBody__OwnedRelationshipAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionBody__Group_1__1"
    // InternalKerMLExpressions.g:5565:1: rule__ExpressionBody__Group_1__1 : rule__ExpressionBody__Group_1__1__Impl ;
    public final void rule__ExpressionBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5569:1: ( rule__ExpressionBody__Group_1__1__Impl )
            // InternalKerMLExpressions.g:5570:2: rule__ExpressionBody__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBody__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group_1__1"


    // $ANTLR start "rule__ExpressionBody__Group_1__1__Impl"
    // InternalKerMLExpressions.g:5576:1: rule__ExpressionBody__Group_1__1__Impl : ( ';' ) ;
    public final void rule__ExpressionBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5580:1: ( ( ';' ) )
            // InternalKerMLExpressions.g:5581:1: ( ';' )
            {
            // InternalKerMLExpressions.g:5581:1: ( ';' )
            // InternalKerMLExpressions.g:5582:2: ';'
            {
             before(grammarAccess.getExpressionBodyAccess().getSemicolonKeyword_1_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExpressionBodyAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__Group_1__1__Impl"


    // $ANTLR start "rule__BodyParameterMember__Group__0"
    // InternalKerMLExpressions.g:5592:1: rule__BodyParameterMember__Group__0 : rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1 ;
    public final void rule__BodyParameterMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5596:1: ( rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1 )
            // InternalKerMLExpressions.g:5597:2: rule__BodyParameterMember__Group__0__Impl rule__BodyParameterMember__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__BodyParameterMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5604:1: rule__BodyParameterMember__Group__0__Impl : ( 'in' ) ;
    public final void rule__BodyParameterMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5608:1: ( ( 'in' ) )
            // InternalKerMLExpressions.g:5609:1: ( 'in' )
            {
            // InternalKerMLExpressions.g:5609:1: ( 'in' )
            // InternalKerMLExpressions.g:5610:2: 'in'
            {
             before(grammarAccess.getBodyParameterMemberAccess().getInKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBodyParameterMemberAccess().getInKeyword_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:5619:1: rule__BodyParameterMember__Group__1 : rule__BodyParameterMember__Group__1__Impl rule__BodyParameterMember__Group__2 ;
    public final void rule__BodyParameterMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5623:1: ( rule__BodyParameterMember__Group__1__Impl rule__BodyParameterMember__Group__2 )
            // InternalKerMLExpressions.g:5624:2: rule__BodyParameterMember__Group__1__Impl rule__BodyParameterMember__Group__2
            {
            pushFollow(FOLLOW_1);
            rule__BodyParameterMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__Group__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5631:1: rule__BodyParameterMember__Group__1__Impl : ( ( rule__BodyParameterMember__MemberNameAssignment_1 ) ) ;
    public final void rule__BodyParameterMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5635:1: ( ( ( rule__BodyParameterMember__MemberNameAssignment_1 ) ) )
            // InternalKerMLExpressions.g:5636:1: ( ( rule__BodyParameterMember__MemberNameAssignment_1 ) )
            {
            // InternalKerMLExpressions.g:5636:1: ( ( rule__BodyParameterMember__MemberNameAssignment_1 ) )
            // InternalKerMLExpressions.g:5637:2: ( rule__BodyParameterMember__MemberNameAssignment_1 )
            {
             before(grammarAccess.getBodyParameterMemberAccess().getMemberNameAssignment_1()); 
            // InternalKerMLExpressions.g:5638:2: ( rule__BodyParameterMember__MemberNameAssignment_1 )
            // InternalKerMLExpressions.g:5638:3: rule__BodyParameterMember__MemberNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__MemberNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyParameterMemberAccess().getMemberNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BodyParameterMember__Group__2"
    // InternalKerMLExpressions.g:5646:1: rule__BodyParameterMember__Group__2 : rule__BodyParameterMember__Group__2__Impl ;
    public final void rule__BodyParameterMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5650:1: ( rule__BodyParameterMember__Group__2__Impl )
            // InternalKerMLExpressions.g:5651:2: rule__BodyParameterMember__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__Group__2"


    // $ANTLR start "rule__BodyParameterMember__Group__2__Impl"
    // InternalKerMLExpressions.g:5657:1: rule__BodyParameterMember__Group__2__Impl : ( ( rule__BodyParameterMember__OwnedRelatedElementAssignment_2 ) ) ;
    public final void rule__BodyParameterMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5661:1: ( ( ( rule__BodyParameterMember__OwnedRelatedElementAssignment_2 ) ) )
            // InternalKerMLExpressions.g:5662:1: ( ( rule__BodyParameterMember__OwnedRelatedElementAssignment_2 ) )
            {
            // InternalKerMLExpressions.g:5662:1: ( ( rule__BodyParameterMember__OwnedRelatedElementAssignment_2 ) )
            // InternalKerMLExpressions.g:5663:2: ( rule__BodyParameterMember__OwnedRelatedElementAssignment_2 )
            {
             before(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementAssignment_2()); 
            // InternalKerMLExpressions.g:5664:2: ( rule__BodyParameterMember__OwnedRelatedElementAssignment_2 )
            // InternalKerMLExpressions.g:5664:3: rule__BodyParameterMember__OwnedRelatedElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BodyParameterMember__OwnedRelatedElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__Group__2__Impl"


    // $ANTLR start "rule__SequenceExpression__Group__0"
    // InternalKerMLExpressions.g:5673:1: rule__SequenceExpression__Group__0 : rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1 ;
    public final void rule__SequenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5677:1: ( rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1 )
            // InternalKerMLExpressions.g:5678:2: rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__SequenceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5685:1: rule__SequenceExpression__Group__0__Impl : ( ruleOwnedExpression ) ;
    public final void rule__SequenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5689:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:5690:1: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:5690:1: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:5691:2: ruleOwnedExpression
            {
             before(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;

             after(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:5700:1: rule__SequenceExpression__Group__1 : rule__SequenceExpression__Group__1__Impl ;
    public final void rule__SequenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5704:1: ( rule__SequenceExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:5705:2: rule__SequenceExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5711:1: rule__SequenceExpression__Group__1__Impl : ( ( rule__SequenceExpression__Alternatives_1 )? ) ;
    public final void rule__SequenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5715:1: ( ( ( rule__SequenceExpression__Alternatives_1 )? ) )
            // InternalKerMLExpressions.g:5716:1: ( ( rule__SequenceExpression__Alternatives_1 )? )
            {
            // InternalKerMLExpressions.g:5716:1: ( ( rule__SequenceExpression__Alternatives_1 )? )
            // InternalKerMLExpressions.g:5717:2: ( rule__SequenceExpression__Alternatives_1 )?
            {
             before(grammarAccess.getSequenceExpressionAccess().getAlternatives_1()); 
            // InternalKerMLExpressions.g:5718:2: ( rule__SequenceExpression__Alternatives_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKerMLExpressions.g:5718:3: rule__SequenceExpression__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceExpression__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceExpressionAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SequenceExpression__Group_1_1__0"
    // InternalKerMLExpressions.g:5727:1: rule__SequenceExpression__Group_1_1__0 : rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1 ;
    public final void rule__SequenceExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5731:1: ( rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1 )
            // InternalKerMLExpressions.g:5732:2: rule__SequenceExpression__Group_1_1__0__Impl rule__SequenceExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_47);
            rule__SequenceExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5739:1: rule__SequenceExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__SequenceExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5743:1: ( ( () ) )
            // InternalKerMLExpressions.g:5744:1: ( () )
            {
            // InternalKerMLExpressions.g:5744:1: ( () )
            // InternalKerMLExpressions.g:5745:2: ()
            {
             before(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0()); 
            // InternalKerMLExpressions.g:5746:2: ()
            // InternalKerMLExpressions.g:5746:3: 
            {
            }

             after(grammarAccess.getSequenceExpressionAccess().getOperatorExpressionOperandAction_1_1_0()); 

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
    // InternalKerMLExpressions.g:5754:1: rule__SequenceExpression__Group_1_1__1 : rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2 ;
    public final void rule__SequenceExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5758:1: ( rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2 )
            // InternalKerMLExpressions.g:5759:2: rule__SequenceExpression__Group_1_1__1__Impl rule__SequenceExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__SequenceExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_1__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5766:1: rule__SequenceExpression__Group_1_1__1__Impl : ( ( rule__SequenceExpression__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__SequenceExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5770:1: ( ( ( rule__SequenceExpression__OperatorAssignment_1_1_1 ) ) )
            // InternalKerMLExpressions.g:5771:1: ( ( rule__SequenceExpression__OperatorAssignment_1_1_1 ) )
            {
            // InternalKerMLExpressions.g:5771:1: ( ( rule__SequenceExpression__OperatorAssignment_1_1_1 ) )
            // InternalKerMLExpressions.g:5772:2: ( rule__SequenceExpression__OperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_1_1()); 
            // InternalKerMLExpressions.g:5773:2: ( rule__SequenceExpression__OperatorAssignment_1_1_1 )
            // InternalKerMLExpressions.g:5773:3: rule__SequenceExpression__OperatorAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__OperatorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceExpressionAccess().getOperatorAssignment_1_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:5781:1: rule__SequenceExpression__Group_1_1__2 : rule__SequenceExpression__Group_1_1__2__Impl ;
    public final void rule__SequenceExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5785:1: ( rule__SequenceExpression__Group_1_1__2__Impl )
            // InternalKerMLExpressions.g:5786:2: rule__SequenceExpression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5792:1: rule__SequenceExpression__Group_1_1__2__Impl : ( ( rule__SequenceExpression__OperandAssignment_1_1_2 ) ) ;
    public final void rule__SequenceExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5796:1: ( ( ( rule__SequenceExpression__OperandAssignment_1_1_2 ) ) )
            // InternalKerMLExpressions.g:5797:1: ( ( rule__SequenceExpression__OperandAssignment_1_1_2 ) )
            {
            // InternalKerMLExpressions.g:5797:1: ( ( rule__SequenceExpression__OperandAssignment_1_1_2 ) )
            // InternalKerMLExpressions.g:5798:2: ( rule__SequenceExpression__OperandAssignment_1_1_2 )
            {
             before(grammarAccess.getSequenceExpressionAccess().getOperandAssignment_1_1_2()); 
            // InternalKerMLExpressions.g:5799:2: ( rule__SequenceExpression__OperandAssignment_1_1_2 )
            // InternalKerMLExpressions.g:5799:3: rule__SequenceExpression__OperandAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExpression__OperandAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceExpressionAccess().getOperandAssignment_1_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InvocationExpression__Group__0"
    // InternalKerMLExpressions.g:5808:1: rule__InvocationExpression__Group__0 : rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1 ;
    public final void rule__InvocationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5812:1: ( rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1 )
            // InternalKerMLExpressions.g:5813:2: rule__InvocationExpression__Group__0__Impl rule__InvocationExpression__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__InvocationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvocationExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5820:1: rule__InvocationExpression__Group__0__Impl : ( ( rule__InvocationExpression__OwnedRelationshipAssignment_0 ) ) ;
    public final void rule__InvocationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5824:1: ( ( ( rule__InvocationExpression__OwnedRelationshipAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5825:1: ( ( rule__InvocationExpression__OwnedRelationshipAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5825:1: ( ( rule__InvocationExpression__OwnedRelationshipAssignment_0 ) )
            // InternalKerMLExpressions.g:5826:2: ( rule__InvocationExpression__OwnedRelationshipAssignment_0 )
            {
             before(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipAssignment_0()); 
            // InternalKerMLExpressions.g:5827:2: ( rule__InvocationExpression__OwnedRelationshipAssignment_0 )
            // InternalKerMLExpressions.g:5827:3: rule__InvocationExpression__OwnedRelationshipAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__OwnedRelationshipAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipAssignment_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:5835:1: rule__InvocationExpression__Group__1 : rule__InvocationExpression__Group__1__Impl ;
    public final void rule__InvocationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5839:1: ( rule__InvocationExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:5840:2: rule__InvocationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InvocationExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:5846:1: rule__InvocationExpression__Group__1__Impl : ( ruleArgumentList ) ;
    public final void rule__InvocationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5850:1: ( ( ruleArgumentList ) )
            // InternalKerMLExpressions.g:5851:1: ( ruleArgumentList )
            {
            // InternalKerMLExpressions.g:5851:1: ( ruleArgumentList )
            // InternalKerMLExpressions.g:5852:2: ruleArgumentList
            {
             before(grammarAccess.getInvocationExpressionAccess().getArgumentListParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleArgumentList();

            state._fsp--;

             after(grammarAccess.getInvocationExpressionAccess().getArgumentListParserRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__FeatureChain__Group__0"
    // InternalKerMLExpressions.g:5862:1: rule__FeatureChain__Group__0 : rule__FeatureChain__Group__0__Impl rule__FeatureChain__Group__1 ;
    public final void rule__FeatureChain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5866:1: ( rule__FeatureChain__Group__0__Impl rule__FeatureChain__Group__1 )
            // InternalKerMLExpressions.g:5867:2: rule__FeatureChain__Group__0__Impl rule__FeatureChain__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__FeatureChain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureChain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__Group__0"


    // $ANTLR start "rule__FeatureChain__Group__0__Impl"
    // InternalKerMLExpressions.g:5874:1: rule__FeatureChain__Group__0__Impl : ( ( rule__FeatureChain__OwnedRelationshipAssignment_0 ) ) ;
    public final void rule__FeatureChain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5878:1: ( ( ( rule__FeatureChain__OwnedRelationshipAssignment_0 ) ) )
            // InternalKerMLExpressions.g:5879:1: ( ( rule__FeatureChain__OwnedRelationshipAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:5879:1: ( ( rule__FeatureChain__OwnedRelationshipAssignment_0 ) )
            // InternalKerMLExpressions.g:5880:2: ( rule__FeatureChain__OwnedRelationshipAssignment_0 )
            {
             before(grammarAccess.getFeatureChainAccess().getOwnedRelationshipAssignment_0()); 
            // InternalKerMLExpressions.g:5881:2: ( rule__FeatureChain__OwnedRelationshipAssignment_0 )
            // InternalKerMLExpressions.g:5881:3: rule__FeatureChain__OwnedRelationshipAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChain__OwnedRelationshipAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureChainAccess().getOwnedRelationshipAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__Group__0__Impl"


    // $ANTLR start "rule__FeatureChain__Group__1"
    // InternalKerMLExpressions.g:5889:1: rule__FeatureChain__Group__1 : rule__FeatureChain__Group__1__Impl ;
    public final void rule__FeatureChain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5893:1: ( rule__FeatureChain__Group__1__Impl )
            // InternalKerMLExpressions.g:5894:2: rule__FeatureChain__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChain__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__Group__1"


    // $ANTLR start "rule__FeatureChain__Group__1__Impl"
    // InternalKerMLExpressions.g:5900:1: rule__FeatureChain__Group__1__Impl : ( ( ( rule__FeatureChain__Group_1__0 ) ) ( ( rule__FeatureChain__Group_1__0 )* ) ) ;
    public final void rule__FeatureChain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5904:1: ( ( ( ( rule__FeatureChain__Group_1__0 ) ) ( ( rule__FeatureChain__Group_1__0 )* ) ) )
            // InternalKerMLExpressions.g:5905:1: ( ( ( rule__FeatureChain__Group_1__0 ) ) ( ( rule__FeatureChain__Group_1__0 )* ) )
            {
            // InternalKerMLExpressions.g:5905:1: ( ( ( rule__FeatureChain__Group_1__0 ) ) ( ( rule__FeatureChain__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:5906:2: ( ( rule__FeatureChain__Group_1__0 ) ) ( ( rule__FeatureChain__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:5906:2: ( ( rule__FeatureChain__Group_1__0 ) )
            // InternalKerMLExpressions.g:5907:3: ( rule__FeatureChain__Group_1__0 )
            {
             before(grammarAccess.getFeatureChainAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:5908:3: ( rule__FeatureChain__Group_1__0 )
            // InternalKerMLExpressions.g:5908:4: rule__FeatureChain__Group_1__0
            {
            pushFollow(FOLLOW_48);
            rule__FeatureChain__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureChainAccess().getGroup_1()); 

            }

            // InternalKerMLExpressions.g:5911:2: ( ( rule__FeatureChain__Group_1__0 )* )
            // InternalKerMLExpressions.g:5912:3: ( rule__FeatureChain__Group_1__0 )*
            {
             before(grammarAccess.getFeatureChainAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:5913:3: ( rule__FeatureChain__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==53) ) {
                    int LA48_2 = input.LA(2);

                    if ( ((LA48_2>=RULE_ID && LA48_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalKerMLExpressions.g:5913:4: rule__FeatureChain__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__FeatureChain__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getFeatureChainAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__Group__1__Impl"


    // $ANTLR start "rule__FeatureChain__Group_1__0"
    // InternalKerMLExpressions.g:5923:1: rule__FeatureChain__Group_1__0 : rule__FeatureChain__Group_1__0__Impl rule__FeatureChain__Group_1__1 ;
    public final void rule__FeatureChain__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5927:1: ( rule__FeatureChain__Group_1__0__Impl rule__FeatureChain__Group_1__1 )
            // InternalKerMLExpressions.g:5928:2: rule__FeatureChain__Group_1__0__Impl rule__FeatureChain__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__FeatureChain__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureChain__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__Group_1__0"


    // $ANTLR start "rule__FeatureChain__Group_1__0__Impl"
    // InternalKerMLExpressions.g:5935:1: rule__FeatureChain__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FeatureChain__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5939:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:5940:1: ( '.' )
            {
            // InternalKerMLExpressions.g:5940:1: ( '.' )
            // InternalKerMLExpressions.g:5941:2: '.'
            {
             before(grammarAccess.getFeatureChainAccess().getFullStopKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getFeatureChainAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureChain__Group_1__1"
    // InternalKerMLExpressions.g:5950:1: rule__FeatureChain__Group_1__1 : rule__FeatureChain__Group_1__1__Impl ;
    public final void rule__FeatureChain__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5954:1: ( rule__FeatureChain__Group_1__1__Impl )
            // InternalKerMLExpressions.g:5955:2: rule__FeatureChain__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChain__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__Group_1__1"


    // $ANTLR start "rule__FeatureChain__Group_1__1__Impl"
    // InternalKerMLExpressions.g:5961:1: rule__FeatureChain__Group_1__1__Impl : ( ( rule__FeatureChain__OwnedRelationshipAssignment_1_1 ) ) ;
    public final void rule__FeatureChain__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5965:1: ( ( ( rule__FeatureChain__OwnedRelationshipAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:5966:1: ( ( rule__FeatureChain__OwnedRelationshipAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:5966:1: ( ( rule__FeatureChain__OwnedRelationshipAssignment_1_1 ) )
            // InternalKerMLExpressions.g:5967:2: ( rule__FeatureChain__OwnedRelationshipAssignment_1_1 )
            {
             before(grammarAccess.getFeatureChainAccess().getOwnedRelationshipAssignment_1_1()); 
            // InternalKerMLExpressions.g:5968:2: ( rule__FeatureChain__OwnedRelationshipAssignment_1_1 )
            // InternalKerMLExpressions.g:5968:3: rule__FeatureChain__OwnedRelationshipAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChain__OwnedRelationshipAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureChainAccess().getOwnedRelationshipAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__Group_1__1__Impl"


    // $ANTLR start "rule__ArgumentList__Group__0"
    // InternalKerMLExpressions.g:5977:1: rule__ArgumentList__Group__0 : rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1 ;
    public final void rule__ArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5981:1: ( rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1 )
            // InternalKerMLExpressions.g:5982:2: rule__ArgumentList__Group__0__Impl rule__ArgumentList__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__ArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__0"


    // $ANTLR start "rule__ArgumentList__Group__0__Impl"
    // InternalKerMLExpressions.g:5989:1: rule__ArgumentList__Group__0__Impl : ( '(' ) ;
    public final void rule__ArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:5993:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:5994:1: ( '(' )
            {
            // InternalKerMLExpressions.g:5994:1: ( '(' )
            // InternalKerMLExpressions.g:5995:2: '('
            {
             before(grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__0__Impl"


    // $ANTLR start "rule__ArgumentList__Group__1"
    // InternalKerMLExpressions.g:6004:1: rule__ArgumentList__Group__1 : rule__ArgumentList__Group__1__Impl rule__ArgumentList__Group__2 ;
    public final void rule__ArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6008:1: ( rule__ArgumentList__Group__1__Impl rule__ArgumentList__Group__2 )
            // InternalKerMLExpressions.g:6009:2: rule__ArgumentList__Group__1__Impl rule__ArgumentList__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__ArgumentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__1"


    // $ANTLR start "rule__ArgumentList__Group__1__Impl"
    // InternalKerMLExpressions.g:6016:1: rule__ArgumentList__Group__1__Impl : ( ( rule__ArgumentList__Alternatives_1 )? ) ;
    public final void rule__ArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6020:1: ( ( ( rule__ArgumentList__Alternatives_1 )? ) )
            // InternalKerMLExpressions.g:6021:1: ( ( rule__ArgumentList__Alternatives_1 )? )
            {
            // InternalKerMLExpressions.g:6021:1: ( ( rule__ArgumentList__Alternatives_1 )? )
            // InternalKerMLExpressions.g:6022:2: ( rule__ArgumentList__Alternatives_1 )?
            {
             before(grammarAccess.getArgumentListAccess().getAlternatives_1()); 
            // InternalKerMLExpressions.g:6023:2: ( rule__ArgumentList__Alternatives_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==EOF||(LA49_0>=RULE_EXP_VALUE && LA49_0<=RULE_STRING_VALUE)||(LA49_0>=28 && LA49_0<=31)||(LA49_0>=36 && LA49_0<=38)||(LA49_0>=43 && LA49_0<=45)||(LA49_0>=47 && LA49_0<=49)||LA49_0==51||LA49_0==53||LA49_0==56||LA49_0==58||LA49_0==65) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKerMLExpressions.g:6023:3: rule__ArgumentList__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArgumentList__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentListAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__1__Impl"


    // $ANTLR start "rule__ArgumentList__Group__2"
    // InternalKerMLExpressions.g:6031:1: rule__ArgumentList__Group__2 : rule__ArgumentList__Group__2__Impl ;
    public final void rule__ArgumentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6035:1: ( rule__ArgumentList__Group__2__Impl )
            // InternalKerMLExpressions.g:6036:2: rule__ArgumentList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__2"


    // $ANTLR start "rule__ArgumentList__Group__2__Impl"
    // InternalKerMLExpressions.g:6042:1: rule__ArgumentList__Group__2__Impl : ( ')' ) ;
    public final void rule__ArgumentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6046:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:6047:1: ( ')' )
            {
            // InternalKerMLExpressions.g:6047:1: ( ')' )
            // InternalKerMLExpressions.g:6048:2: ')'
            {
             before(grammarAccess.getArgumentListAccess().getRightParenthesisKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getArgumentListAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group__2__Impl"


    // $ANTLR start "rule__PositionalArgumentList__Group__0"
    // InternalKerMLExpressions.g:6058:1: rule__PositionalArgumentList__Group__0 : rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1 ;
    public final void rule__PositionalArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6062:1: ( rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1 )
            // InternalKerMLExpressions.g:6063:2: rule__PositionalArgumentList__Group__0__Impl rule__PositionalArgumentList__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__PositionalArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6070:1: rule__PositionalArgumentList__Group__0__Impl : ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 ) ) ;
    public final void rule__PositionalArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6074:1: ( ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 ) ) )
            // InternalKerMLExpressions.g:6075:1: ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:6075:1: ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 ) )
            // InternalKerMLExpressions.g:6076:2: ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 )
            {
             before(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipAssignment_0()); 
            // InternalKerMLExpressions.g:6077:2: ( rule__PositionalArgumentList__OwnedRelationshipAssignment_0 )
            // InternalKerMLExpressions.g:6077:3: rule__PositionalArgumentList__OwnedRelationshipAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__OwnedRelationshipAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipAssignment_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6085:1: rule__PositionalArgumentList__Group__1 : rule__PositionalArgumentList__Group__1__Impl ;
    public final void rule__PositionalArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6089:1: ( rule__PositionalArgumentList__Group__1__Impl )
            // InternalKerMLExpressions.g:6090:2: rule__PositionalArgumentList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6096:1: rule__PositionalArgumentList__Group__1__Impl : ( ( rule__PositionalArgumentList__Group_1__0 )* ) ;
    public final void rule__PositionalArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6100:1: ( ( ( rule__PositionalArgumentList__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:6101:1: ( ( rule__PositionalArgumentList__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:6101:1: ( ( rule__PositionalArgumentList__Group_1__0 )* )
            // InternalKerMLExpressions.g:6102:2: ( rule__PositionalArgumentList__Group_1__0 )*
            {
             before(grammarAccess.getPositionalArgumentListAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:6103:2: ( rule__PositionalArgumentList__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==46) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalKerMLExpressions.g:6103:3: rule__PositionalArgumentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__PositionalArgumentList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getPositionalArgumentListAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6112:1: rule__PositionalArgumentList__Group_1__0 : rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1 ;
    public final void rule__PositionalArgumentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6116:1: ( rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1 )
            // InternalKerMLExpressions.g:6117:2: rule__PositionalArgumentList__Group_1__0__Impl rule__PositionalArgumentList__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__PositionalArgumentList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6124:1: rule__PositionalArgumentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__PositionalArgumentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6128:1: ( ( ',' ) )
            // InternalKerMLExpressions.g:6129:1: ( ',' )
            {
            // InternalKerMLExpressions.g:6129:1: ( ',' )
            // InternalKerMLExpressions.g:6130:2: ','
            {
             before(grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6139:1: rule__PositionalArgumentList__Group_1__1 : rule__PositionalArgumentList__Group_1__1__Impl ;
    public final void rule__PositionalArgumentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6143:1: ( rule__PositionalArgumentList__Group_1__1__Impl )
            // InternalKerMLExpressions.g:6144:2: rule__PositionalArgumentList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6150:1: rule__PositionalArgumentList__Group_1__1__Impl : ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 ) ) ;
    public final void rule__PositionalArgumentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6154:1: ( ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:6155:1: ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:6155:1: ( ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 ) )
            // InternalKerMLExpressions.g:6156:2: ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 )
            {
             before(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipAssignment_1_1()); 
            // InternalKerMLExpressions.g:6157:2: ( rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 )
            // InternalKerMLExpressions.g:6157:3: rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6166:1: rule__NamedArgumentList__Group__0 : rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1 ;
    public final void rule__NamedArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6170:1: ( rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1 )
            // InternalKerMLExpressions.g:6171:2: rule__NamedArgumentList__Group__0__Impl rule__NamedArgumentList__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__NamedArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6178:1: rule__NamedArgumentList__Group__0__Impl : ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 ) ) ;
    public final void rule__NamedArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6182:1: ( ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 ) ) )
            // InternalKerMLExpressions.g:6183:1: ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:6183:1: ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 ) )
            // InternalKerMLExpressions.g:6184:2: ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 )
            {
             before(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipAssignment_0()); 
            // InternalKerMLExpressions.g:6185:2: ( rule__NamedArgumentList__OwnedRelationshipAssignment_0 )
            // InternalKerMLExpressions.g:6185:3: rule__NamedArgumentList__OwnedRelationshipAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__OwnedRelationshipAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipAssignment_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6193:1: rule__NamedArgumentList__Group__1 : rule__NamedArgumentList__Group__1__Impl ;
    public final void rule__NamedArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6197:1: ( rule__NamedArgumentList__Group__1__Impl )
            // InternalKerMLExpressions.g:6198:2: rule__NamedArgumentList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6204:1: rule__NamedArgumentList__Group__1__Impl : ( ( rule__NamedArgumentList__Group_1__0 )* ) ;
    public final void rule__NamedArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6208:1: ( ( ( rule__NamedArgumentList__Group_1__0 )* ) )
            // InternalKerMLExpressions.g:6209:1: ( ( rule__NamedArgumentList__Group_1__0 )* )
            {
            // InternalKerMLExpressions.g:6209:1: ( ( rule__NamedArgumentList__Group_1__0 )* )
            // InternalKerMLExpressions.g:6210:2: ( rule__NamedArgumentList__Group_1__0 )*
            {
             before(grammarAccess.getNamedArgumentListAccess().getGroup_1()); 
            // InternalKerMLExpressions.g:6211:2: ( rule__NamedArgumentList__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==46) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalKerMLExpressions.g:6211:3: rule__NamedArgumentList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__NamedArgumentList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getNamedArgumentListAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6220:1: rule__NamedArgumentList__Group_1__0 : rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1 ;
    public final void rule__NamedArgumentList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6224:1: ( rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1 )
            // InternalKerMLExpressions.g:6225:2: rule__NamedArgumentList__Group_1__0__Impl rule__NamedArgumentList__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__NamedArgumentList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6232:1: rule__NamedArgumentList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__NamedArgumentList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6236:1: ( ( ',' ) )
            // InternalKerMLExpressions.g:6237:1: ( ',' )
            {
            // InternalKerMLExpressions.g:6237:1: ( ',' )
            // InternalKerMLExpressions.g:6238:2: ','
            {
             before(grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6247:1: rule__NamedArgumentList__Group_1__1 : rule__NamedArgumentList__Group_1__1__Impl ;
    public final void rule__NamedArgumentList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6251:1: ( rule__NamedArgumentList__Group_1__1__Impl )
            // InternalKerMLExpressions.g:6252:2: rule__NamedArgumentList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6258:1: rule__NamedArgumentList__Group_1__1__Impl : ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 ) ) ;
    public final void rule__NamedArgumentList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6262:1: ( ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 ) ) )
            // InternalKerMLExpressions.g:6263:1: ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 ) )
            {
            // InternalKerMLExpressions.g:6263:1: ( ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 ) )
            // InternalKerMLExpressions.g:6264:2: ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 )
            {
             before(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipAssignment_1_1()); 
            // InternalKerMLExpressions.g:6265:2: ( rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 )
            // InternalKerMLExpressions.g:6265:3: rule__NamedArgumentList__OwnedRelationshipAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedArgumentList__OwnedRelationshipAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipAssignment_1_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6274:1: rule__NamedExpressionMember__Group__0 : rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1 ;
    public final void rule__NamedExpressionMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6278:1: ( rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1 )
            // InternalKerMLExpressions.g:6279:2: rule__NamedExpressionMember__Group__0__Impl rule__NamedExpressionMember__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__NamedExpressionMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6286:1: rule__NamedExpressionMember__Group__0__Impl : ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) ) ;
    public final void rule__NamedExpressionMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6290:1: ( ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) ) )
            // InternalKerMLExpressions.g:6291:1: ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) )
            {
            // InternalKerMLExpressions.g:6291:1: ( ( rule__NamedExpressionMember__MemberNameAssignment_0 ) )
            // InternalKerMLExpressions.g:6292:2: ( rule__NamedExpressionMember__MemberNameAssignment_0 )
            {
             before(grammarAccess.getNamedExpressionMemberAccess().getMemberNameAssignment_0()); 
            // InternalKerMLExpressions.g:6293:2: ( rule__NamedExpressionMember__MemberNameAssignment_0 )
            // InternalKerMLExpressions.g:6293:3: rule__NamedExpressionMember__MemberNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__MemberNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedExpressionMemberAccess().getMemberNameAssignment_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6301:1: rule__NamedExpressionMember__Group__1 : rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2 ;
    public final void rule__NamedExpressionMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6305:1: ( rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2 )
            // InternalKerMLExpressions.g:6306:2: rule__NamedExpressionMember__Group__1__Impl rule__NamedExpressionMember__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NamedExpressionMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__Group__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6313:1: rule__NamedExpressionMember__Group__1__Impl : ( '=' ) ;
    public final void rule__NamedExpressionMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6317:1: ( ( '=' ) )
            // InternalKerMLExpressions.g:6318:1: ( '=' )
            {
            // InternalKerMLExpressions.g:6318:1: ( '=' )
            // InternalKerMLExpressions.g:6319:2: '='
            {
             before(grammarAccess.getNamedExpressionMemberAccess().getEqualsSignKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getNamedExpressionMemberAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6328:1: rule__NamedExpressionMember__Group__2 : rule__NamedExpressionMember__Group__2__Impl ;
    public final void rule__NamedExpressionMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6332:1: ( rule__NamedExpressionMember__Group__2__Impl )
            // InternalKerMLExpressions.g:6333:2: rule__NamedExpressionMember__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6339:1: rule__NamedExpressionMember__Group__2__Impl : ( ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 ) ) ;
    public final void rule__NamedExpressionMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6343:1: ( ( ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 ) ) )
            // InternalKerMLExpressions.g:6344:1: ( ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 ) )
            {
            // InternalKerMLExpressions.g:6344:1: ( ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 ) )
            // InternalKerMLExpressions.g:6345:2: ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 )
            {
             before(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementAssignment_2()); 
            // InternalKerMLExpressions.g:6346:2: ( rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 )
            // InternalKerMLExpressions.g:6346:3: rule__NamedExpressionMember__OwnedRelatedElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpressionMember__OwnedRelatedElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementAssignment_2()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6355:1: rule__NullExpression__Group__0 : rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1 ;
    public final void rule__NullExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6359:1: ( rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1 )
            // InternalKerMLExpressions.g:6360:2: rule__NullExpression__Group__0__Impl rule__NullExpression__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__NullExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6367:1: rule__NullExpression__Group__0__Impl : ( () ) ;
    public final void rule__NullExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6371:1: ( ( () ) )
            // InternalKerMLExpressions.g:6372:1: ( () )
            {
            // InternalKerMLExpressions.g:6372:1: ( () )
            // InternalKerMLExpressions.g:6373:2: ()
            {
             before(grammarAccess.getNullExpressionAccess().getNullExpressionAction_0()); 
            // InternalKerMLExpressions.g:6374:2: ()
            // InternalKerMLExpressions.g:6374:3: 
            {
            }

             after(grammarAccess.getNullExpressionAccess().getNullExpressionAction_0()); 

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
    // InternalKerMLExpressions.g:6382:1: rule__NullExpression__Group__1 : rule__NullExpression__Group__1__Impl ;
    public final void rule__NullExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6386:1: ( rule__NullExpression__Group__1__Impl )
            // InternalKerMLExpressions.g:6387:2: rule__NullExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6393:1: rule__NullExpression__Group__1__Impl : ( ( rule__NullExpression__Alternatives_1 ) ) ;
    public final void rule__NullExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6397:1: ( ( ( rule__NullExpression__Alternatives_1 ) ) )
            // InternalKerMLExpressions.g:6398:1: ( ( rule__NullExpression__Alternatives_1 ) )
            {
            // InternalKerMLExpressions.g:6398:1: ( ( rule__NullExpression__Alternatives_1 ) )
            // InternalKerMLExpressions.g:6399:2: ( rule__NullExpression__Alternatives_1 )
            {
             before(grammarAccess.getNullExpressionAccess().getAlternatives_1()); 
            // InternalKerMLExpressions.g:6400:2: ( rule__NullExpression__Alternatives_1 )
            // InternalKerMLExpressions.g:6400:3: rule__NullExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__NullExpression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNullExpressionAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__NullExpression__Group_1_1__0"
    // InternalKerMLExpressions.g:6409:1: rule__NullExpression__Group_1_1__0 : rule__NullExpression__Group_1_1__0__Impl rule__NullExpression__Group_1_1__1 ;
    public final void rule__NullExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6413:1: ( rule__NullExpression__Group_1_1__0__Impl rule__NullExpression__Group_1_1__1 )
            // InternalKerMLExpressions.g:6414:2: rule__NullExpression__Group_1_1__0__Impl rule__NullExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_42);
            rule__NullExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullExpression__Group_1_1__0"


    // $ANTLR start "rule__NullExpression__Group_1_1__0__Impl"
    // InternalKerMLExpressions.g:6421:1: rule__NullExpression__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__NullExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6425:1: ( ( '(' ) )
            // InternalKerMLExpressions.g:6426:1: ( '(' )
            {
            // InternalKerMLExpressions.g:6426:1: ( '(' )
            // InternalKerMLExpressions.g:6427:2: '('
            {
             before(grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__NullExpression__Group_1_1__1"
    // InternalKerMLExpressions.g:6436:1: rule__NullExpression__Group_1_1__1 : rule__NullExpression__Group_1_1__1__Impl ;
    public final void rule__NullExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6440:1: ( rule__NullExpression__Group_1_1__1__Impl )
            // InternalKerMLExpressions.g:6441:2: rule__NullExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullExpression__Group_1_1__1"


    // $ANTLR start "rule__NullExpression__Group_1_1__1__Impl"
    // InternalKerMLExpressions.g:6447:1: rule__NullExpression__Group_1_1__1__Impl : ( ')' ) ;
    public final void rule__NullExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6451:1: ( ( ')' ) )
            // InternalKerMLExpressions.g:6452:1: ( ')' )
            {
            // InternalKerMLExpressions.g:6452:1: ( ')' )
            // InternalKerMLExpressions.g:6453:2: ')'
            {
             before(grammarAccess.getNullExpressionAccess().getRightParenthesisKeyword_1_1_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getNullExpressionAccess().getRightParenthesisKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__RealValue__Group_0__0"
    // InternalKerMLExpressions.g:6463:1: rule__RealValue__Group_0__0 : rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 ;
    public final void rule__RealValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6467:1: ( rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 )
            // InternalKerMLExpressions.g:6468:2: rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1
            {
            pushFollow(FOLLOW_53);
            rule__RealValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6475:1: rule__RealValue__Group_0__0__Impl : ( ( RULE_DECIMAL_VALUE )? ) ;
    public final void rule__RealValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6479:1: ( ( ( RULE_DECIMAL_VALUE )? ) )
            // InternalKerMLExpressions.g:6480:1: ( ( RULE_DECIMAL_VALUE )? )
            {
            // InternalKerMLExpressions.g:6480:1: ( ( RULE_DECIMAL_VALUE )? )
            // InternalKerMLExpressions.g:6481:2: ( RULE_DECIMAL_VALUE )?
            {
             before(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0()); 
            // InternalKerMLExpressions.g:6482:2: ( RULE_DECIMAL_VALUE )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DECIMAL_VALUE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKerMLExpressions.g:6482:3: RULE_DECIMAL_VALUE
                    {
                    match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6490:1: rule__RealValue__Group_0__1 : rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2 ;
    public final void rule__RealValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6494:1: ( rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2 )
            // InternalKerMLExpressions.g:6495:2: rule__RealValue__Group_0__1__Impl rule__RealValue__Group_0__2
            {
            pushFollow(FOLLOW_54);
            rule__RealValue__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6502:1: rule__RealValue__Group_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6506:1: ( ( '.' ) )
            // InternalKerMLExpressions.g:6507:1: ( '.' )
            {
            // InternalKerMLExpressions.g:6507:1: ( '.' )
            // InternalKerMLExpressions.g:6508:2: '.'
            {
             before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6517:1: rule__RealValue__Group_0__2 : rule__RealValue__Group_0__2__Impl ;
    public final void rule__RealValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6521:1: ( rule__RealValue__Group_0__2__Impl )
            // InternalKerMLExpressions.g:6522:2: rule__RealValue__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6528:1: rule__RealValue__Group_0__2__Impl : ( ( rule__RealValue__Alternatives_0_2 ) ) ;
    public final void rule__RealValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6532:1: ( ( ( rule__RealValue__Alternatives_0_2 ) ) )
            // InternalKerMLExpressions.g:6533:1: ( ( rule__RealValue__Alternatives_0_2 ) )
            {
            // InternalKerMLExpressions.g:6533:1: ( ( rule__RealValue__Alternatives_0_2 ) )
            // InternalKerMLExpressions.g:6534:2: ( rule__RealValue__Alternatives_0_2 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_0_2()); 
            // InternalKerMLExpressions.g:6535:2: ( rule__RealValue__Alternatives_0_2 )
            // InternalKerMLExpressions.g:6535:3: rule__RealValue__Alternatives_0_2
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getAlternatives_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__LiteralInfinity__Group__0"
    // InternalKerMLExpressions.g:6544:1: rule__LiteralInfinity__Group__0 : rule__LiteralInfinity__Group__0__Impl rule__LiteralInfinity__Group__1 ;
    public final void rule__LiteralInfinity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6548:1: ( rule__LiteralInfinity__Group__0__Impl rule__LiteralInfinity__Group__1 )
            // InternalKerMLExpressions.g:6549:2: rule__LiteralInfinity__Group__0__Impl rule__LiteralInfinity__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__LiteralInfinity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralInfinity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInfinity__Group__0"


    // $ANTLR start "rule__LiteralInfinity__Group__0__Impl"
    // InternalKerMLExpressions.g:6556:1: rule__LiteralInfinity__Group__0__Impl : ( () ) ;
    public final void rule__LiteralInfinity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6560:1: ( ( () ) )
            // InternalKerMLExpressions.g:6561:1: ( () )
            {
            // InternalKerMLExpressions.g:6561:1: ( () )
            // InternalKerMLExpressions.g:6562:2: ()
            {
             before(grammarAccess.getLiteralInfinityAccess().getLiteralInfinityAction_0()); 
            // InternalKerMLExpressions.g:6563:2: ()
            // InternalKerMLExpressions.g:6563:3: 
            {
            }

             after(grammarAccess.getLiteralInfinityAccess().getLiteralInfinityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInfinity__Group__0__Impl"


    // $ANTLR start "rule__LiteralInfinity__Group__1"
    // InternalKerMLExpressions.g:6571:1: rule__LiteralInfinity__Group__1 : rule__LiteralInfinity__Group__1__Impl ;
    public final void rule__LiteralInfinity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6575:1: ( rule__LiteralInfinity__Group__1__Impl )
            // InternalKerMLExpressions.g:6576:2: rule__LiteralInfinity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralInfinity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInfinity__Group__1"


    // $ANTLR start "rule__LiteralInfinity__Group__1__Impl"
    // InternalKerMLExpressions.g:6582:1: rule__LiteralInfinity__Group__1__Impl : ( '*' ) ;
    public final void rule__LiteralInfinity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6586:1: ( ( '*' ) )
            // InternalKerMLExpressions.g:6587:1: ( '*' )
            {
            // InternalKerMLExpressions.g:6587:1: ( '*' )
            // InternalKerMLExpressions.g:6588:2: '*'
            {
             before(grammarAccess.getLiteralInfinityAccess().getAsteriskKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLiteralInfinityAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInfinity__Group__1__Impl"


    // $ANTLR start "rule__Qualification__Group__0"
    // InternalKerMLExpressions.g:6598:1: rule__Qualification__Group__0 : rule__Qualification__Group__0__Impl rule__Qualification__Group__1 ;
    public final void rule__Qualification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6602:1: ( rule__Qualification__Group__0__Impl rule__Qualification__Group__1 )
            // InternalKerMLExpressions.g:6603:2: rule__Qualification__Group__0__Impl rule__Qualification__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__Qualification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualification__Group__0"


    // $ANTLR start "rule__Qualification__Group__0__Impl"
    // InternalKerMLExpressions.g:6610:1: rule__Qualification__Group__0__Impl : ( ruleName ) ;
    public final void rule__Qualification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6614:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6615:1: ( ruleName )
            {
            // InternalKerMLExpressions.g:6615:1: ( ruleName )
            // InternalKerMLExpressions.g:6616:2: ruleName
            {
             before(grammarAccess.getQualificationAccess().getNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualificationAccess().getNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualification__Group__0__Impl"


    // $ANTLR start "rule__Qualification__Group__1"
    // InternalKerMLExpressions.g:6625:1: rule__Qualification__Group__1 : rule__Qualification__Group__1__Impl ;
    public final void rule__Qualification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6629:1: ( rule__Qualification__Group__1__Impl )
            // InternalKerMLExpressions.g:6630:2: rule__Qualification__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualification__Group__1"


    // $ANTLR start "rule__Qualification__Group__1__Impl"
    // InternalKerMLExpressions.g:6636:1: rule__Qualification__Group__1__Impl : ( '::' ) ;
    public final void rule__Qualification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6640:1: ( ( '::' ) )
            // InternalKerMLExpressions.g:6641:1: ( '::' )
            {
            // InternalKerMLExpressions.g:6641:1: ( '::' )
            // InternalKerMLExpressions.g:6642:2: '::'
            {
             before(grammarAccess.getQualificationAccess().getColonColonKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getQualificationAccess().getColonColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualification__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalKerMLExpressions.g:6652:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6656:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalKerMLExpressions.g:6657:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6664:1: rule__QualifiedName__Group__0__Impl : ( ( ruleQualification )? ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6668:1: ( ( ( ruleQualification )? ) )
            // InternalKerMLExpressions.g:6669:1: ( ( ruleQualification )? )
            {
            // InternalKerMLExpressions.g:6669:1: ( ( ruleQualification )? )
            // InternalKerMLExpressions.g:6670:2: ( ruleQualification )?
            {
             before(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0()); 
            // InternalKerMLExpressions.g:6671:2: ( ruleQualification )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==63) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==RULE_UNRESTRICTED_NAME) ) {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==63) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // InternalKerMLExpressions.g:6671:3: ruleQualification
                    {
                    pushFollow(FOLLOW_2);
                    ruleQualification();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6679:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6683:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalKerMLExpressions.g:6684:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKerMLExpressions.g:6690:1: rule__QualifiedName__Group__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6694:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:6695:1: ( ruleName )
            {
            // InternalKerMLExpressions.g:6695:1: ( ruleName )
            // InternalKerMLExpressions.g:6696:2: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__OwnedExpressionMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:6706:1: rule__OwnedExpressionMember__OwnedRelatedElementAssignment : ( ruleOwnedExpression ) ;
    public final void rule__OwnedExpressionMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6710:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6711:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6711:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6712:3: ruleOwnedExpression
            {
             before(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;

             after(grammarAccess.getOwnedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConditionalExpression__OperatorAssignment_0_1_1"
    // InternalKerMLExpressions.g:6721:1: rule__ConditionalExpression__OperatorAssignment_0_1_1 : ( ruleConditionalOperator ) ;
    public final void rule__ConditionalExpression__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6725:1: ( ( ruleConditionalOperator ) )
            // InternalKerMLExpressions.g:6726:2: ( ruleConditionalOperator )
            {
            // InternalKerMLExpressions.g:6726:2: ( ruleConditionalOperator )
            // InternalKerMLExpressions.g:6727:3: ruleConditionalOperator
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalOperatorParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalOperator();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalOperatorParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OperatorAssignment_0_1_1"


    // $ANTLR start "rule__ConditionalExpression__OperandAssignment_0_1_2"
    // InternalKerMLExpressions.g:6736:1: rule__ConditionalExpression__OperandAssignment_0_1_2 : ( ruleOwnedExpression ) ;
    public final void rule__ConditionalExpression__OperandAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6740:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6741:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6741:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6742:3: ruleOwnedExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OperandAssignment_0_1_2"


    // $ANTLR start "rule__ConditionalExpression__OperandAssignment_0_1_4"
    // InternalKerMLExpressions.g:6751:1: rule__ConditionalExpression__OperandAssignment_0_1_4 : ( ruleConditionalExpression ) ;
    public final void rule__ConditionalExpression__OperandAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6755:1: ( ( ruleConditionalExpression ) )
            // InternalKerMLExpressions.g:6756:2: ( ruleConditionalExpression )
            {
            // InternalKerMLExpressions.g:6756:2: ( ruleConditionalExpression )
            // InternalKerMLExpressions.g:6757:3: ruleConditionalExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_0_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_0_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OperandAssignment_0_1_4"


    // $ANTLR start "rule__ConditionalExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6766:1: rule__ConditionalExpression__OperandAssignment_1_2 : ( ruleNullCoalescingExpression ) ;
    public final void rule__ConditionalExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6770:1: ( ( ruleNullCoalescingExpression ) )
            // InternalKerMLExpressions.g:6771:2: ( ruleNullCoalescingExpression )
            {
            // InternalKerMLExpressions.g:6771:2: ( ruleNullCoalescingExpression )
            // InternalKerMLExpressions.g:6772:3: ruleNullCoalescingExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandNullCoalescingExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNullCoalescingExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOperandNullCoalescingExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConditionalExpression__OperatorAssignment_1_3"
    // InternalKerMLExpressions.g:6781:1: rule__ConditionalExpression__OperatorAssignment_1_3 : ( ruleConditionalOperator ) ;
    public final void rule__ConditionalExpression__OperatorAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6785:1: ( ( ruleConditionalOperator ) )
            // InternalKerMLExpressions.g:6786:2: ( ruleConditionalOperator )
            {
            // InternalKerMLExpressions.g:6786:2: ( ruleConditionalOperator )
            // InternalKerMLExpressions.g:6787:3: ruleConditionalOperator
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalOperatorParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalOperator();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOperatorConditionalOperatorParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OperatorAssignment_1_3"


    // $ANTLR start "rule__ConditionalExpression__OperandAssignment_1_4"
    // InternalKerMLExpressions.g:6796:1: rule__ConditionalExpression__OperandAssignment_1_4 : ( ruleOwnedExpression ) ;
    public final void rule__ConditionalExpression__OperandAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6800:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:6801:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:6801:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:6802:3: ruleOwnedExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOperandOwnedExpressionParserRuleCall_1_4_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConditionalExpression__OperandAssignment_1_6"
    // InternalKerMLExpressions.g:6811:1: rule__ConditionalExpression__OperandAssignment_1_6 : ( ruleConditionalExpression ) ;
    public final void rule__ConditionalExpression__OperandAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6815:1: ( ( ruleConditionalExpression ) )
            // InternalKerMLExpressions.g:6816:2: ( ruleConditionalExpression )
            {
            // InternalKerMLExpressions.g:6816:2: ( ruleConditionalExpression )
            // InternalKerMLExpressions.g:6817:3: ruleConditionalExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOperandConditionalExpressionParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OperandAssignment_1_6"


    // $ANTLR start "rule__NullCoalescingExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6826:1: rule__NullCoalescingExpression__OperatorAssignment_1_1 : ( ruleNullCoalescingOperator ) ;
    public final void rule__NullCoalescingExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6830:1: ( ( ruleNullCoalescingOperator ) )
            // InternalKerMLExpressions.g:6831:2: ( ruleNullCoalescingOperator )
            {
            // InternalKerMLExpressions.g:6831:2: ( ruleNullCoalescingOperator )
            // InternalKerMLExpressions.g:6832:3: ruleNullCoalescingOperator
            {
             before(grammarAccess.getNullCoalescingExpressionAccess().getOperatorNullCoalescingOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNullCoalescingOperator();

            state._fsp--;

             after(grammarAccess.getNullCoalescingExpressionAccess().getOperatorNullCoalescingOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6841:1: rule__NullCoalescingExpression__OperandAssignment_1_2 : ( ruleImpliesExpression ) ;
    public final void rule__NullCoalescingExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6845:1: ( ( ruleImpliesExpression ) )
            // InternalKerMLExpressions.g:6846:2: ( ruleImpliesExpression )
            {
            // InternalKerMLExpressions.g:6846:2: ( ruleImpliesExpression )
            // InternalKerMLExpressions.g:6847:3: ruleImpliesExpression
            {
             before(grammarAccess.getNullCoalescingExpressionAccess().getOperandImpliesExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImpliesExpression();

            state._fsp--;

             after(grammarAccess.getNullCoalescingExpressionAccess().getOperandImpliesExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ImpliesExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6856:1: rule__ImpliesExpression__OperatorAssignment_1_1 : ( ruleImpliesOperator ) ;
    public final void rule__ImpliesExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6860:1: ( ( ruleImpliesOperator ) )
            // InternalKerMLExpressions.g:6861:2: ( ruleImpliesOperator )
            {
            // InternalKerMLExpressions.g:6861:2: ( ruleImpliesOperator )
            // InternalKerMLExpressions.g:6862:3: ruleImpliesOperator
            {
             before(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImpliesOperator();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ImpliesExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:6871:1: rule__ImpliesExpression__OperandAssignment_1_2 : ( ruleOrExpression ) ;
    public final void rule__ImpliesExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6875:1: ( ( ruleOrExpression ) )
            // InternalKerMLExpressions.g:6876:2: ( ruleOrExpression )
            {
            // InternalKerMLExpressions.g:6876:2: ( ruleOrExpression )
            // InternalKerMLExpressions.g:6877:3: ruleOrExpression
            {
             before(grammarAccess.getImpliesExpressionAccess().getOperandOrExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionAccess().getOperandOrExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:6886:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6890:1: ( ( ruleOrOperator ) )
            // InternalKerMLExpressions.g:6891:2: ( ruleOrOperator )
            {
            // InternalKerMLExpressions.g:6891:2: ( ruleOrOperator )
            // InternalKerMLExpressions.g:6892:3: ruleOrOperator
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrOperator();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6901:1: rule__OrExpression__OperandAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6905:1: ( ( ruleXorExpression ) )
            // InternalKerMLExpressions.g:6906:2: ( ruleXorExpression )
            {
            // InternalKerMLExpressions.g:6906:2: ( ruleXorExpression )
            // InternalKerMLExpressions.g:6907:3: ruleXorExpression
            {
             before(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6916:1: rule__XorExpression__OperatorAssignment_1_1 : ( ruleXorOperator ) ;
    public final void rule__XorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6920:1: ( ( ruleXorOperator ) )
            // InternalKerMLExpressions.g:6921:2: ( ruleXorOperator )
            {
            // InternalKerMLExpressions.g:6921:2: ( ruleXorOperator )
            // InternalKerMLExpressions.g:6922:3: ruleXorOperator
            {
             before(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXorOperator();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6931:1: rule__XorExpression__OperandAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6935:1: ( ( ruleAndExpression ) )
            // InternalKerMLExpressions.g:6936:2: ( ruleAndExpression )
            {
            // InternalKerMLExpressions.g:6936:2: ( ruleAndExpression )
            // InternalKerMLExpressions.g:6937:3: ruleAndExpression
            {
             before(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6946:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6950:1: ( ( ruleAndOperator ) )
            // InternalKerMLExpressions.g:6951:2: ( ruleAndOperator )
            {
            // InternalKerMLExpressions.g:6951:2: ( ruleAndOperator )
            // InternalKerMLExpressions.g:6952:3: ruleAndOperator
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperator();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6961:1: rule__AndExpression__OperandAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6965:1: ( ( ruleEqualityExpression ) )
            // InternalKerMLExpressions.g:6966:2: ( ruleEqualityExpression )
            {
            // InternalKerMLExpressions.g:6966:2: ( ruleEqualityExpression )
            // InternalKerMLExpressions.g:6967:3: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6976:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6980:1: ( ( ruleEqualityOperator ) )
            // InternalKerMLExpressions.g:6981:2: ( ruleEqualityOperator )
            {
            // InternalKerMLExpressions.g:6981:2: ( ruleEqualityOperator )
            // InternalKerMLExpressions.g:6982:3: ruleEqualityOperator
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityOperator();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:6991:1: rule__EqualityExpression__OperandAssignment_1_2 : ( ruleClassificationExpression ) ;
    public final void rule__EqualityExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:6995:1: ( ( ruleClassificationExpression ) )
            // InternalKerMLExpressions.g:6996:2: ( ruleClassificationExpression )
            {
            // InternalKerMLExpressions.g:6996:2: ( ruleClassificationExpression )
            // InternalKerMLExpressions.g:6997:3: ruleClassificationExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperandClassificationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassificationExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getOperandClassificationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7006:1: rule__ClassificationExpression__OperatorAssignment_0_1_1 : ( ruleClassificationOperator ) ;
    public final void rule__ClassificationExpression__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7010:1: ( ( ruleClassificationOperator ) )
            // InternalKerMLExpressions.g:7011:2: ( ruleClassificationOperator )
            {
            // InternalKerMLExpressions.g:7011:2: ( ruleClassificationOperator )
            // InternalKerMLExpressions.g:7012:3: ruleClassificationOperator
            {
             before(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassificationOperator();

            state._fsp--;

             after(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_0_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7021:1: rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2 : ( ruleTypeReferenceMember ) ;
    public final void rule__ClassificationExpression__OwnedRelationshipAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7025:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:7026:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:7026:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:7027:3: ruleTypeReferenceMember
            {
             before(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;

             after(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_1_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7036:1: rule__ClassificationExpression__OperandAssignment_1_1 : ( ruleSelfReferenceExpression ) ;
    public final void rule__ClassificationExpression__OperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7040:1: ( ( ruleSelfReferenceExpression ) )
            // InternalKerMLExpressions.g:7041:2: ( ruleSelfReferenceExpression )
            {
            // InternalKerMLExpressions.g:7041:2: ( ruleSelfReferenceExpression )
            // InternalKerMLExpressions.g:7042:3: ruleSelfReferenceExpression
            {
             before(grammarAccess.getClassificationExpressionAccess().getOperandSelfReferenceExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelfReferenceExpression();

            state._fsp--;

             after(grammarAccess.getClassificationExpressionAccess().getOperandSelfReferenceExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7051:1: rule__ClassificationExpression__OperatorAssignment_1_2 : ( ruleClassificationOperator ) ;
    public final void rule__ClassificationExpression__OperatorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7055:1: ( ( ruleClassificationOperator ) )
            // InternalKerMLExpressions.g:7056:2: ( ruleClassificationOperator )
            {
            // InternalKerMLExpressions.g:7056:2: ( ruleClassificationOperator )
            // InternalKerMLExpressions.g:7057:3: ruleClassificationOperator
            {
             before(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassificationOperator();

            state._fsp--;

             after(grammarAccess.getClassificationExpressionAccess().getOperatorClassificationOperatorParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7066:1: rule__ClassificationExpression__OwnedRelationshipAssignment_1_3 : ( ruleTypeReferenceMember ) ;
    public final void rule__ClassificationExpression__OwnedRelationshipAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7070:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:7071:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:7071:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:7072:3: ruleTypeReferenceMember
            {
             before(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;

             after(grammarAccess.getClassificationExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_1_3_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7081:1: rule__TypeReferenceMember__OwnedRelatedElementAssignment : ( ruleTypeReference ) ;
    public final void rule__TypeReferenceMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7085:1: ( ( ruleTypeReference ) )
            // InternalKerMLExpressions.g:7086:2: ( ruleTypeReference )
            {
            // InternalKerMLExpressions.g:7086:2: ( ruleTypeReference )
            // InternalKerMLExpressions.g:7087:3: ruleTypeReference
            {
             before(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementTypeReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceMemberAccess().getOwnedRelatedElementTypeReferenceParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7096:1: rule__TypeReference__OwnedRelationshipAssignment : ( ruleReferenceTyping ) ;
    public final void rule__TypeReference__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7100:1: ( ( ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:7101:2: ( ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:7101:2: ( ruleReferenceTyping )
            // InternalKerMLExpressions.g:7102:3: ruleReferenceTyping
            {
             before(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipReferenceTypingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceTyping();

            state._fsp--;

             after(grammarAccess.getTypeReferenceAccess().getOwnedRelationshipReferenceTypingParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReferenceTyping__TypeAssignment"
    // InternalKerMLExpressions.g:7111:1: rule__ReferenceTyping__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceTyping__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7115:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:7116:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:7116:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:7117:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceTypingAccess().getTypeTypeCrossReference_0()); 
            // InternalKerMLExpressions.g:7118:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:7119:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceTypingAccess().getTypeTypeQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceTypingAccess().getTypeTypeQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getReferenceTypingAccess().getTypeTypeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceTyping__TypeAssignment"


    // $ANTLR start "rule__SelfReferenceExpression__OwnedRelationshipAssignment"
    // InternalKerMLExpressions.g:7130:1: rule__SelfReferenceExpression__OwnedRelationshipAssignment : ( ruleSelfReferenceMember ) ;
    public final void rule__SelfReferenceExpression__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7134:1: ( ( ruleSelfReferenceMember ) )
            // InternalKerMLExpressions.g:7135:2: ( ruleSelfReferenceMember )
            {
            // InternalKerMLExpressions.g:7135:2: ( ruleSelfReferenceMember )
            // InternalKerMLExpressions.g:7136:3: ruleSelfReferenceMember
            {
             before(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipSelfReferenceMemberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSelfReferenceMember();

            state._fsp--;

             after(grammarAccess.getSelfReferenceExpressionAccess().getOwnedRelationshipSelfReferenceMemberParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7145:1: rule__SelfReferenceMember__OwnedRelatedElementAssignment : ( ruleEmptyFeature ) ;
    public final void rule__SelfReferenceMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7149:1: ( ( ruleEmptyFeature ) )
            // InternalKerMLExpressions.g:7150:2: ( ruleEmptyFeature )
            {
            // InternalKerMLExpressions.g:7150:2: ( ruleEmptyFeature )
            // InternalKerMLExpressions.g:7151:3: ruleEmptyFeature
            {
             before(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementEmptyFeatureParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEmptyFeature();

            state._fsp--;

             after(grammarAccess.getSelfReferenceMemberAccess().getOwnedRelatedElementEmptyFeatureParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7160:1: rule__RelationalExpression__OperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7164:1: ( ( ruleRelationalOperator ) )
            // InternalKerMLExpressions.g:7165:2: ( ruleRelationalOperator )
            {
            // InternalKerMLExpressions.g:7165:2: ( ruleRelationalOperator )
            // InternalKerMLExpressions.g:7166:3: ruleRelationalOperator
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7175:1: rule__RelationalExpression__OperandAssignment_1_2 : ( ruleRangeExpression ) ;
    public final void rule__RelationalExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7179:1: ( ( ruleRangeExpression ) )
            // InternalKerMLExpressions.g:7180:2: ( ruleRangeExpression )
            {
            // InternalKerMLExpressions.g:7180:2: ( ruleRangeExpression )
            // InternalKerMLExpressions.g:7181:3: ruleRangeExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperandRangeExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRangeExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getOperandRangeExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RangeExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7190:1: rule__RangeExpression__OperatorAssignment_1_1 : ( ( '..' ) ) ;
    public final void rule__RangeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7194:1: ( ( ( '..' ) ) )
            // InternalKerMLExpressions.g:7195:2: ( ( '..' ) )
            {
            // InternalKerMLExpressions.g:7195:2: ( ( '..' ) )
            // InternalKerMLExpressions.g:7196:3: ( '..' )
            {
             before(grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0()); 
            // InternalKerMLExpressions.g:7197:3: ( '..' )
            // InternalKerMLExpressions.g:7198:4: '..'
            {
             before(grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0()); 

            }

             after(grammarAccess.getRangeExpressionAccess().getOperatorFullStopFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__RangeExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:7209:1: rule__RangeExpression__OperandAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RangeExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7213:1: ( ( ruleAdditiveExpression ) )
            // InternalKerMLExpressions.g:7214:2: ( ruleAdditiveExpression )
            {
            // InternalKerMLExpressions.g:7214:2: ( ruleAdditiveExpression )
            // InternalKerMLExpressions.g:7215:3: ruleAdditiveExpression
            {
             before(grammarAccess.getRangeExpressionAccess().getOperandAdditiveExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRangeExpressionAccess().getOperandAdditiveExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalKerMLExpressions.g:7224:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7228:1: ( ( ruleAdditiveOperator ) )
            // InternalKerMLExpressions.g:7229:2: ( ruleAdditiveOperator )
            {
            // InternalKerMLExpressions.g:7229:2: ( ruleAdditiveOperator )
            // InternalKerMLExpressions.g:7230:3: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7239:1: rule__AdditiveExpression__OperandAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7243:1: ( ( ruleMultiplicativeExpression ) )
            // InternalKerMLExpressions.g:7244:2: ( ruleMultiplicativeExpression )
            {
            // InternalKerMLExpressions.g:7244:2: ( ruleMultiplicativeExpression )
            // InternalKerMLExpressions.g:7245:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7254:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7258:1: ( ( ruleMultiplicativeOperator ) )
            // InternalKerMLExpressions.g:7259:2: ( ruleMultiplicativeOperator )
            {
            // InternalKerMLExpressions.g:7259:2: ( ruleMultiplicativeOperator )
            // InternalKerMLExpressions.g:7260:3: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7269:1: rule__MultiplicativeExpression__OperandAssignment_1_2 : ( ruleExponentiationExpression ) ;
    public final void rule__MultiplicativeExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7273:1: ( ( ruleExponentiationExpression ) )
            // InternalKerMLExpressions.g:7274:2: ( ruleExponentiationExpression )
            {
            // InternalKerMLExpressions.g:7274:2: ( ruleExponentiationExpression )
            // InternalKerMLExpressions.g:7275:3: ruleExponentiationExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperandExponentiationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExponentiationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperandExponentiationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7284:1: rule__ExponentiationExpression__OperatorAssignment_1_1 : ( ruleExponentiationOperator ) ;
    public final void rule__ExponentiationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7288:1: ( ( ruleExponentiationOperator ) )
            // InternalKerMLExpressions.g:7289:2: ( ruleExponentiationOperator )
            {
            // InternalKerMLExpressions.g:7289:2: ( ruleExponentiationOperator )
            // InternalKerMLExpressions.g:7290:3: ruleExponentiationOperator
            {
             before(grammarAccess.getExponentiationExpressionAccess().getOperatorExponentiationOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExponentiationOperator();

            state._fsp--;

             after(grammarAccess.getExponentiationExpressionAccess().getOperatorExponentiationOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7299:1: rule__ExponentiationExpression__OperandAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__ExponentiationExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7303:1: ( ( ruleUnaryExpression ) )
            // InternalKerMLExpressions.g:7304:2: ( ruleUnaryExpression )
            {
            // InternalKerMLExpressions.g:7304:2: ( ruleUnaryExpression )
            // InternalKerMLExpressions.g:7305:3: ruleUnaryExpression
            {
             before(grammarAccess.getExponentiationExpressionAccess().getOperandUnaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getExponentiationExpressionAccess().getOperandUnaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_0_1"
    // InternalKerMLExpressions.g:7314:1: rule__UnaryExpression__OperatorAssignment_0_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7318:1: ( ( ruleUnaryOperator ) )
            // InternalKerMLExpressions.g:7319:2: ( ruleUnaryOperator )
            {
            // InternalKerMLExpressions.g:7319:2: ( ruleUnaryOperator )
            // InternalKerMLExpressions.g:7320:3: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_0_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7329:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleExtentExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7333:1: ( ( ruleExtentExpression ) )
            // InternalKerMLExpressions.g:7334:2: ( ruleExtentExpression )
            {
            // InternalKerMLExpressions.g:7334:2: ( ruleExtentExpression )
            // InternalKerMLExpressions.g:7335:3: ruleExtentExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandExtentExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExtentExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperandExtentExpressionParserRuleCall_0_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7344:1: rule__ExtentExpression__OperatorAssignment_0_1 : ( ( 'all' ) ) ;
    public final void rule__ExtentExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7348:1: ( ( ( 'all' ) ) )
            // InternalKerMLExpressions.g:7349:2: ( ( 'all' ) )
            {
            // InternalKerMLExpressions.g:7349:2: ( ( 'all' ) )
            // InternalKerMLExpressions.g:7350:3: ( 'all' )
            {
             before(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 
            // InternalKerMLExpressions.g:7351:3: ( 'all' )
            // InternalKerMLExpressions.g:7352:4: 'all'
            {
             before(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 

            }

             after(grammarAccess.getExtentExpressionAccess().getOperatorAllKeyword_0_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7363:1: rule__ExtentExpression__OwnedRelationshipAssignment_0_2 : ( ruleTypeReferenceMember ) ;
    public final void rule__ExtentExpression__OwnedRelationshipAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7367:1: ( ( ruleTypeReferenceMember ) )
            // InternalKerMLExpressions.g:7368:2: ( ruleTypeReferenceMember )
            {
            // InternalKerMLExpressions.g:7368:2: ( ruleTypeReferenceMember )
            // InternalKerMLExpressions.g:7369:3: ruleTypeReferenceMember
            {
             before(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReferenceMember();

            state._fsp--;

             after(grammarAccess.getExtentExpressionAccess().getOwnedRelationshipTypeReferenceMemberParserRuleCall_0_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimaryExpression__OperandAssignment_1_2"
    // InternalKerMLExpressions.g:7378:1: rule__PrimaryExpression__OperandAssignment_1_2 : ( ruleFeatureChainExpression ) ;
    public final void rule__PrimaryExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7382:1: ( ( ruleFeatureChainExpression ) )
            // InternalKerMLExpressions.g:7383:2: ( ruleFeatureChainExpression )
            {
            // InternalKerMLExpressions.g:7383:2: ( ruleFeatureChainExpression )
            // InternalKerMLExpressions.g:7384:3: ruleFeatureChainExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperandFeatureChainExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureChainExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getOperandFeatureChainExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__PrimaryExpression__OperatorAssignment_2_0_0_1"
    // InternalKerMLExpressions.g:7393:1: rule__PrimaryExpression__OperatorAssignment_2_0_0_1 : ( ( '[' ) ) ;
    public final void rule__PrimaryExpression__OperatorAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7397:1: ( ( ( '[' ) ) )
            // InternalKerMLExpressions.g:7398:2: ( ( '[' ) )
            {
            // InternalKerMLExpressions.g:7398:2: ( ( '[' ) )
            // InternalKerMLExpressions.g:7399:3: ( '[' )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_2_0_0_1_0()); 
            // InternalKerMLExpressions.g:7400:3: ( '[' )
            // InternalKerMLExpressions.g:7401:4: '['
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_2_0_0_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_2_0_0_1_0()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getOperatorLeftSquareBracketKeyword_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__OperatorAssignment_2_0_0_1"


    // $ANTLR start "rule__PrimaryExpression__OperandAssignment_2_0_0_2"
    // InternalKerMLExpressions.g:7412:1: rule__PrimaryExpression__OperandAssignment_2_0_0_2 : ( ruleSequenceExpression ) ;
    public final void rule__PrimaryExpression__OperandAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7416:1: ( ( ruleSequenceExpression ) )
            // InternalKerMLExpressions.g:7417:2: ( ruleSequenceExpression )
            {
            // InternalKerMLExpressions.g:7417:2: ( ruleSequenceExpression )
            // InternalKerMLExpressions.g:7418:3: ruleSequenceExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperandSequenceExpressionParserRuleCall_2_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSequenceExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getOperandSequenceExpressionParserRuleCall_2_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__OperandAssignment_2_0_0_2"


    // $ANTLR start "rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2"
    // InternalKerMLExpressions.g:7427:1: rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2 : ( ruleReferenceTyping ) ;
    public final void rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7431:1: ( ( ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:7432:2: ( ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:7432:2: ( ruleReferenceTyping )
            // InternalKerMLExpressions.g:7433:3: ruleReferenceTyping
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipReferenceTypingParserRuleCall_2_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceTyping();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipReferenceTypingParserRuleCall_2_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_2"


    // $ANTLR start "rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0"
    // InternalKerMLExpressions.g:7442:1: rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0 : ( ruleExpressionBodyMember ) ;
    public final void rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7446:1: ( ( ruleExpressionBodyMember ) )
            // InternalKerMLExpressions.g:7447:2: ( ruleExpressionBodyMember )
            {
            // InternalKerMLExpressions.g:7447:2: ( ruleExpressionBodyMember )
            // InternalKerMLExpressions.g:7448:3: ruleExpressionBodyMember
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_2_0_1_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionBodyMember();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_2_0_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_0"


    // $ANTLR start "rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1"
    // InternalKerMLExpressions.g:7457:1: rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1 : ( ruleFunctionReferenceMember ) ;
    public final void rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7461:1: ( ( ruleFunctionReferenceMember ) )
            // InternalKerMLExpressions.g:7462:2: ( ruleFunctionReferenceMember )
            {
            // InternalKerMLExpressions.g:7462:2: ( ruleFunctionReferenceMember )
            // InternalKerMLExpressions.g:7463:3: ruleFunctionReferenceMember
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFunctionReferenceMemberParserRuleCall_2_0_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionReferenceMember();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipFunctionReferenceMemberParserRuleCall_2_0_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_1_3_1"


    // $ANTLR start "rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2"
    // InternalKerMLExpressions.g:7472:1: rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2 : ( ruleExpressionBodyMember ) ;
    public final void rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7476:1: ( ( ruleExpressionBodyMember ) )
            // InternalKerMLExpressions.g:7477:2: ( ruleExpressionBodyMember )
            {
            // InternalKerMLExpressions.g:7477:2: ( ruleExpressionBodyMember )
            // InternalKerMLExpressions.g:7478:3: ruleExpressionBodyMember
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_2_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionBodyMember();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getOwnedRelationshipExpressionBodyMemberParserRuleCall_2_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__OwnedRelationshipAssignment_2_0_2_2"


    // $ANTLR start "rule__PrimaryExpression__OperandAssignment_2_1_2"
    // InternalKerMLExpressions.g:7487:1: rule__PrimaryExpression__OperandAssignment_2_1_2 : ( ruleFeatureChainExpression ) ;
    public final void rule__PrimaryExpression__OperandAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7491:1: ( ( ruleFeatureChainExpression ) )
            // InternalKerMLExpressions.g:7492:2: ( ruleFeatureChainExpression )
            {
            // InternalKerMLExpressions.g:7492:2: ( ruleFeatureChainExpression )
            // InternalKerMLExpressions.g:7493:3: ruleFeatureChainExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOperandFeatureChainExpressionParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureChainExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getOperandFeatureChainExpressionParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__OperandAssignment_2_1_2"


    // $ANTLR start "rule__ExpressionBodyMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:7502:1: rule__ExpressionBodyMember__OwnedRelatedElementAssignment : ( ruleExpressionBody ) ;
    public final void rule__ExpressionBodyMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7506:1: ( ( ruleExpressionBody ) )
            // InternalKerMLExpressions.g:7507:2: ( ruleExpressionBody )
            {
            // InternalKerMLExpressions.g:7507:2: ( ruleExpressionBody )
            // InternalKerMLExpressions.g:7508:3: ruleExpressionBody
            {
             before(grammarAccess.getExpressionBodyMemberAccess().getOwnedRelatedElementExpressionBodyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionBody();

            state._fsp--;

             after(grammarAccess.getExpressionBodyMemberAccess().getOwnedRelatedElementExpressionBodyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBodyMember__OwnedRelatedElementAssignment"


    // $ANTLR start "rule__FunctionReferenceMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:7517:1: rule__FunctionReferenceMember__OwnedRelatedElementAssignment : ( ruleFunctionReference ) ;
    public final void rule__FunctionReferenceMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7521:1: ( ( ruleFunctionReference ) )
            // InternalKerMLExpressions.g:7522:2: ( ruleFunctionReference )
            {
            // InternalKerMLExpressions.g:7522:2: ( ruleFunctionReference )
            // InternalKerMLExpressions.g:7523:3: ruleFunctionReference
            {
             before(grammarAccess.getFunctionReferenceMemberAccess().getOwnedRelatedElementFunctionReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionReference();

            state._fsp--;

             after(grammarAccess.getFunctionReferenceMemberAccess().getOwnedRelatedElementFunctionReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionReferenceMember__OwnedRelatedElementAssignment"


    // $ANTLR start "rule__FunctionReference__OwnedRelationshipAssignment"
    // InternalKerMLExpressions.g:7532:1: rule__FunctionReference__OwnedRelationshipAssignment : ( ruleReferenceTyping ) ;
    public final void rule__FunctionReference__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7536:1: ( ( ruleReferenceTyping ) )
            // InternalKerMLExpressions.g:7537:2: ( ruleReferenceTyping )
            {
            // InternalKerMLExpressions.g:7537:2: ( ruleReferenceTyping )
            // InternalKerMLExpressions.g:7538:3: ruleReferenceTyping
            {
             before(grammarAccess.getFunctionReferenceAccess().getOwnedRelationshipReferenceTypingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceTyping();

            state._fsp--;

             after(grammarAccess.getFunctionReferenceAccess().getOwnedRelationshipReferenceTypingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionReference__OwnedRelationshipAssignment"


    // $ANTLR start "rule__FeatureChainExpression__OwnedRelationshipAssignment"
    // InternalKerMLExpressions.g:7547:1: rule__FeatureChainExpression__OwnedRelationshipAssignment : ( ruleFeatureChainMember ) ;
    public final void rule__FeatureChainExpression__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7551:1: ( ( ruleFeatureChainMember ) )
            // InternalKerMLExpressions.g:7552:2: ( ruleFeatureChainMember )
            {
            // InternalKerMLExpressions.g:7552:2: ( ruleFeatureChainMember )
            // InternalKerMLExpressions.g:7553:3: ruleFeatureChainMember
            {
             before(grammarAccess.getFeatureChainExpressionAccess().getOwnedRelationshipFeatureChainMemberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureChainMember();

            state._fsp--;

             after(grammarAccess.getFeatureChainExpressionAccess().getOwnedRelationshipFeatureChainMemberParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainExpression__OwnedRelationshipAssignment"


    // $ANTLR start "rule__FeatureChainMember__MemberElementAssignment_0"
    // InternalKerMLExpressions.g:7562:1: rule__FeatureChainMember__MemberElementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureChainMember__MemberElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7566:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:7567:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:7567:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:7568:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureChainMemberAccess().getMemberElementFeatureCrossReference_0_0()); 
            // InternalKerMLExpressions.g:7569:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:7570:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureChainMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureChainMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFeatureChainMemberAccess().getMemberElementFeatureCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainMember__MemberElementAssignment_0"


    // $ANTLR start "rule__FeatureChainMember__OwnedRelatedElementAssignment_1"
    // InternalKerMLExpressions.g:7581:1: rule__FeatureChainMember__OwnedRelatedElementAssignment_1 : ( ruleFeatureChain ) ;
    public final void rule__FeatureChainMember__OwnedRelatedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7585:1: ( ( ruleFeatureChain ) )
            // InternalKerMLExpressions.g:7586:2: ( ruleFeatureChain )
            {
            // InternalKerMLExpressions.g:7586:2: ( ruleFeatureChain )
            // InternalKerMLExpressions.g:7587:3: ruleFeatureChain
            {
             before(grammarAccess.getFeatureChainMemberAccess().getOwnedRelatedElementFeatureChainParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureChain();

            state._fsp--;

             after(grammarAccess.getFeatureChainMemberAccess().getOwnedRelatedElementFeatureChainParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainMember__OwnedRelatedElementAssignment_1"


    // $ANTLR start "rule__ExpressionBody__OwnedRelationshipAssignment_1_0"
    // InternalKerMLExpressions.g:7596:1: rule__ExpressionBody__OwnedRelationshipAssignment_1_0 : ( ruleBodyParameterMember ) ;
    public final void rule__ExpressionBody__OwnedRelationshipAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7600:1: ( ( ruleBodyParameterMember ) )
            // InternalKerMLExpressions.g:7601:2: ( ruleBodyParameterMember )
            {
            // InternalKerMLExpressions.g:7601:2: ( ruleBodyParameterMember )
            // InternalKerMLExpressions.g:7602:3: ruleBodyParameterMember
            {
             before(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBodyParameterMember();

            state._fsp--;

             after(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__OwnedRelationshipAssignment_1_0"


    // $ANTLR start "rule__ExpressionBody__OwnedRelationshipAssignment_2"
    // InternalKerMLExpressions.g:7611:1: rule__ExpressionBody__OwnedRelationshipAssignment_2 : ( ruleResultExpressionMember ) ;
    public final void rule__ExpressionBody__OwnedRelationshipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7615:1: ( ( ruleResultExpressionMember ) )
            // InternalKerMLExpressions.g:7616:2: ( ruleResultExpressionMember )
            {
            // InternalKerMLExpressions.g:7616:2: ( ruleResultExpressionMember )
            // InternalKerMLExpressions.g:7617:3: ruleResultExpressionMember
            {
             before(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipResultExpressionMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResultExpressionMember();

            state._fsp--;

             after(grammarAccess.getExpressionBodyAccess().getOwnedRelationshipResultExpressionMemberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBody__OwnedRelationshipAssignment_2"


    // $ANTLR start "rule__ResultExpressionMember__OwnedRelatedElementAssignment"
    // InternalKerMLExpressions.g:7626:1: rule__ResultExpressionMember__OwnedRelatedElementAssignment : ( ruleOwnedExpression ) ;
    public final void rule__ResultExpressionMember__OwnedRelatedElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7630:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7631:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7631:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7632:3: ruleOwnedExpression
            {
             before(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;

             after(grammarAccess.getResultExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BodyParameterMember__MemberNameAssignment_1"
    // InternalKerMLExpressions.g:7641:1: rule__BodyParameterMember__MemberNameAssignment_1 : ( ruleName ) ;
    public final void rule__BodyParameterMember__MemberNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7645:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:7646:2: ( ruleName )
            {
            // InternalKerMLExpressions.g:7646:2: ( ruleName )
            // InternalKerMLExpressions.g:7647:3: ruleName
            {
             before(grammarAccess.getBodyParameterMemberAccess().getMemberNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getBodyParameterMemberAccess().getMemberNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__MemberNameAssignment_1"


    // $ANTLR start "rule__BodyParameterMember__OwnedRelatedElementAssignment_2"
    // InternalKerMLExpressions.g:7656:1: rule__BodyParameterMember__OwnedRelatedElementAssignment_2 : ( ruleBodyParameter ) ;
    public final void rule__BodyParameterMember__OwnedRelatedElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7660:1: ( ( ruleBodyParameter ) )
            // InternalKerMLExpressions.g:7661:2: ( ruleBodyParameter )
            {
            // InternalKerMLExpressions.g:7661:2: ( ruleBodyParameter )
            // InternalKerMLExpressions.g:7662:3: ruleBodyParameter
            {
             before(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementBodyParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBodyParameter();

            state._fsp--;

             after(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementBodyParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyParameterMember__OwnedRelatedElementAssignment_2"


    // $ANTLR start "rule__SequenceExpression__OperatorAssignment_1_1_1"
    // InternalKerMLExpressions.g:7671:1: rule__SequenceExpression__OperatorAssignment_1_1_1 : ( ( ',' ) ) ;
    public final void rule__SequenceExpression__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7675:1: ( ( ( ',' ) ) )
            // InternalKerMLExpressions.g:7676:2: ( ( ',' ) )
            {
            // InternalKerMLExpressions.g:7676:2: ( ( ',' ) )
            // InternalKerMLExpressions.g:7677:3: ( ',' )
            {
             before(grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0()); 
            // InternalKerMLExpressions.g:7678:3: ( ',' )
            // InternalKerMLExpressions.g:7679:4: ','
            {
             before(grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0()); 

            }

             after(grammarAccess.getSequenceExpressionAccess().getOperatorCommaKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__OperatorAssignment_1_1_1"


    // $ANTLR start "rule__SequenceExpression__OperandAssignment_1_1_2"
    // InternalKerMLExpressions.g:7690:1: rule__SequenceExpression__OperandAssignment_1_1_2 : ( ruleSequenceExpression ) ;
    public final void rule__SequenceExpression__OperandAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7694:1: ( ( ruleSequenceExpression ) )
            // InternalKerMLExpressions.g:7695:2: ( ruleSequenceExpression )
            {
            // InternalKerMLExpressions.g:7695:2: ( ruleSequenceExpression )
            // InternalKerMLExpressions.g:7696:3: ruleSequenceExpression
            {
             before(grammarAccess.getSequenceExpressionAccess().getOperandSequenceExpressionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSequenceExpression();

            state._fsp--;

             after(grammarAccess.getSequenceExpressionAccess().getOperandSequenceExpressionParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__OperandAssignment_1_1_2"


    // $ANTLR start "rule__FeatureReferenceExpression__OwnedRelationshipAssignment"
    // InternalKerMLExpressions.g:7705:1: rule__FeatureReferenceExpression__OwnedRelationshipAssignment : ( ruleFeatureReferenceMember ) ;
    public final void rule__FeatureReferenceExpression__OwnedRelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7709:1: ( ( ruleFeatureReferenceMember ) )
            // InternalKerMLExpressions.g:7710:2: ( ruleFeatureReferenceMember )
            {
            // InternalKerMLExpressions.g:7710:2: ( ruleFeatureReferenceMember )
            // InternalKerMLExpressions.g:7711:3: ruleFeatureReferenceMember
            {
             before(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipFeatureReferenceMemberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureReferenceMember();

            state._fsp--;

             after(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedRelationshipFeatureReferenceMemberParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7720:1: rule__FeatureReferenceMember__MemberElementAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureReferenceMember__MemberElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7724:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:7725:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:7725:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:7726:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureCrossReference_0()); 
            // InternalKerMLExpressions.g:7727:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:7728:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getFeatureReferenceMemberAccess().getMemberElementFeatureCrossReference_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7739:1: rule__InvocationExpression__OwnedRelationshipAssignment_0 : ( ruleOwnedFeatureTyping ) ;
    public final void rule__InvocationExpression__OwnedRelationshipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7743:1: ( ( ruleOwnedFeatureTyping ) )
            // InternalKerMLExpressions.g:7744:2: ( ruleOwnedFeatureTyping )
            {
            // InternalKerMLExpressions.g:7744:2: ( ruleOwnedFeatureTyping )
            // InternalKerMLExpressions.g:7745:3: ruleOwnedFeatureTyping
            {
             before(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureTyping();

            state._fsp--;

             after(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipOwnedFeatureTypingParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__OwnedFeatureTyping__TypeAssignment_0"
    // InternalKerMLExpressions.g:7754:1: rule__OwnedFeatureTyping__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OwnedFeatureTyping__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7758:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:7759:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:7759:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:7760:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeCrossReference_0_0()); 
            // InternalKerMLExpressions.g:7761:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:7762:4: ruleQualifiedName
            {
             before(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOwnedFeatureTypingAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedFeatureTyping__TypeAssignment_0"


    // $ANTLR start "rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1"
    // InternalKerMLExpressions.g:7773:1: rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1 : ( ruleFeatureChain ) ;
    public final void rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7777:1: ( ( ruleFeatureChain ) )
            // InternalKerMLExpressions.g:7778:2: ( ruleFeatureChain )
            {
            // InternalKerMLExpressions.g:7778:2: ( ruleFeatureChain )
            // InternalKerMLExpressions.g:7779:3: ruleFeatureChain
            {
             before(grammarAccess.getOwnedFeatureTypingAccess().getOwnedRelatedElementFeatureChainParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureChain();

            state._fsp--;

             after(grammarAccess.getOwnedFeatureTypingAccess().getOwnedRelatedElementFeatureChainParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1"


    // $ANTLR start "rule__FeatureChain__OwnedRelationshipAssignment_0"
    // InternalKerMLExpressions.g:7788:1: rule__FeatureChain__OwnedRelationshipAssignment_0 : ( ruleOwnedFeatureChaining ) ;
    public final void rule__FeatureChain__OwnedRelationshipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7792:1: ( ( ruleOwnedFeatureChaining ) )
            // InternalKerMLExpressions.g:7793:2: ( ruleOwnedFeatureChaining )
            {
            // InternalKerMLExpressions.g:7793:2: ( ruleOwnedFeatureChaining )
            // InternalKerMLExpressions.g:7794:3: ruleOwnedFeatureChaining
            {
             before(grammarAccess.getFeatureChainAccess().getOwnedRelationshipOwnedFeatureChainingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureChaining();

            state._fsp--;

             after(grammarAccess.getFeatureChainAccess().getOwnedRelationshipOwnedFeatureChainingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__OwnedRelationshipAssignment_0"


    // $ANTLR start "rule__FeatureChain__OwnedRelationshipAssignment_1_1"
    // InternalKerMLExpressions.g:7803:1: rule__FeatureChain__OwnedRelationshipAssignment_1_1 : ( ruleOwnedFeatureChaining ) ;
    public final void rule__FeatureChain__OwnedRelationshipAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7807:1: ( ( ruleOwnedFeatureChaining ) )
            // InternalKerMLExpressions.g:7808:2: ( ruleOwnedFeatureChaining )
            {
            // InternalKerMLExpressions.g:7808:2: ( ruleOwnedFeatureChaining )
            // InternalKerMLExpressions.g:7809:3: ruleOwnedFeatureChaining
            {
             before(grammarAccess.getFeatureChainAccess().getOwnedRelationshipOwnedFeatureChainingParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedFeatureChaining();

            state._fsp--;

             after(grammarAccess.getFeatureChainAccess().getOwnedRelationshipOwnedFeatureChainingParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChain__OwnedRelationshipAssignment_1_1"


    // $ANTLR start "rule__OwnedFeatureChaining__ChainingFeatureAssignment"
    // InternalKerMLExpressions.g:7818:1: rule__OwnedFeatureChaining__ChainingFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__OwnedFeatureChaining__ChainingFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7822:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKerMLExpressions.g:7823:2: ( ( ruleQualifiedName ) )
            {
            // InternalKerMLExpressions.g:7823:2: ( ( ruleQualifiedName ) )
            // InternalKerMLExpressions.g:7824:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOwnedFeatureChainingAccess().getChainingFeatureFeatureCrossReference_0()); 
            // InternalKerMLExpressions.g:7825:3: ( ruleQualifiedName )
            // InternalKerMLExpressions.g:7826:4: ruleQualifiedName
            {
             before(grammarAccess.getOwnedFeatureChainingAccess().getChainingFeatureFeatureQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOwnedFeatureChainingAccess().getChainingFeatureFeatureQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getOwnedFeatureChainingAccess().getChainingFeatureFeatureCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedFeatureChaining__ChainingFeatureAssignment"


    // $ANTLR start "rule__PositionalArgumentList__OwnedRelationshipAssignment_0"
    // InternalKerMLExpressions.g:7837:1: rule__PositionalArgumentList__OwnedRelationshipAssignment_0 : ( ruleOwnedExpressionMember ) ;
    public final void rule__PositionalArgumentList__OwnedRelationshipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7841:1: ( ( ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:7842:2: ( ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:7842:2: ( ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:7843:3: ruleOwnedExpressionMember
            {
             before(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedExpressionMember();

            state._fsp--;

             after(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7852:1: rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1 : ( ruleOwnedExpressionMember ) ;
    public final void rule__PositionalArgumentList__OwnedRelationshipAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7856:1: ( ( ruleOwnedExpressionMember ) )
            // InternalKerMLExpressions.g:7857:2: ( ruleOwnedExpressionMember )
            {
            // InternalKerMLExpressions.g:7857:2: ( ruleOwnedExpressionMember )
            // InternalKerMLExpressions.g:7858:3: ruleOwnedExpressionMember
            {
             before(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedExpressionMember();

            state._fsp--;

             after(grammarAccess.getPositionalArgumentListAccess().getOwnedRelationshipOwnedExpressionMemberParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7867:1: rule__NamedArgumentList__OwnedRelationshipAssignment_0 : ( ruleNamedExpressionMember ) ;
    public final void rule__NamedArgumentList__OwnedRelationshipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7871:1: ( ( ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:7872:2: ( ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:7872:2: ( ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:7873:3: ruleNamedExpressionMember
            {
             before(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedExpressionMember();

            state._fsp--;

             after(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7882:1: rule__NamedArgumentList__OwnedRelationshipAssignment_1_1 : ( ruleNamedExpressionMember ) ;
    public final void rule__NamedArgumentList__OwnedRelationshipAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7886:1: ( ( ruleNamedExpressionMember ) )
            // InternalKerMLExpressions.g:7887:2: ( ruleNamedExpressionMember )
            {
            // InternalKerMLExpressions.g:7887:2: ( ruleNamedExpressionMember )
            // InternalKerMLExpressions.g:7888:3: ruleNamedExpressionMember
            {
             before(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedExpressionMember();

            state._fsp--;

             after(grammarAccess.getNamedArgumentListAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7897:1: rule__NamedExpressionMember__MemberNameAssignment_0 : ( ruleName ) ;
    public final void rule__NamedExpressionMember__MemberNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7901:1: ( ( ruleName ) )
            // InternalKerMLExpressions.g:7902:2: ( ruleName )
            {
            // InternalKerMLExpressions.g:7902:2: ( ruleName )
            // InternalKerMLExpressions.g:7903:3: ruleName
            {
             before(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7912:1: rule__NamedExpressionMember__OwnedRelatedElementAssignment_2 : ( ruleOwnedExpression ) ;
    public final void rule__NamedExpressionMember__OwnedRelatedElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7916:1: ( ( ruleOwnedExpression ) )
            // InternalKerMLExpressions.g:7917:2: ( ruleOwnedExpression )
            {
            // InternalKerMLExpressions.g:7917:2: ( ruleOwnedExpression )
            // InternalKerMLExpressions.g:7918:3: ruleOwnedExpression
            {
             before(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedExpression();

            state._fsp--;

             after(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementOwnedExpressionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7927:1: rule__LiteralBoolean__ValueAssignment : ( ruleBooleanValue ) ;
    public final void rule__LiteralBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7931:1: ( ( ruleBooleanValue ) )
            // InternalKerMLExpressions.g:7932:2: ( ruleBooleanValue )
            {
            // InternalKerMLExpressions.g:7932:2: ( ruleBooleanValue )
            // InternalKerMLExpressions.g:7933:3: ruleBooleanValue
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueParserRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7942:1: rule__LiteralString__ValueAssignment : ( RULE_STRING_VALUE ) ;
    public final void rule__LiteralString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7946:1: ( ( RULE_STRING_VALUE ) )
            // InternalKerMLExpressions.g:7947:2: ( RULE_STRING_VALUE )
            {
            // InternalKerMLExpressions.g:7947:2: ( RULE_STRING_VALUE )
            // InternalKerMLExpressions.g:7948:3: RULE_STRING_VALUE
            {
             before(grammarAccess.getLiteralStringAccess().getValueSTRING_VALUETerminalRuleCall_0()); 
            match(input,RULE_STRING_VALUE,FOLLOW_2); 
             after(grammarAccess.getLiteralStringAccess().getValueSTRING_VALUETerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7957:1: rule__LiteralInteger__ValueAssignment : ( RULE_DECIMAL_VALUE ) ;
    public final void rule__LiteralInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7961:1: ( ( RULE_DECIMAL_VALUE ) )
            // InternalKerMLExpressions.g:7962:2: ( RULE_DECIMAL_VALUE )
            {
            // InternalKerMLExpressions.g:7962:2: ( RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:7963:3: RULE_DECIMAL_VALUE
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueDECIMAL_VALUETerminalRuleCall_0()); 
            match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 
             after(grammarAccess.getLiteralIntegerAccess().getValueDECIMAL_VALUETerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalKerMLExpressions.g:7972:1: rule__LiteralReal__ValueAssignment : ( ruleRealValue ) ;
    public final void rule__LiteralReal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKerMLExpressions.g:7976:1: ( ( ruleRealValue ) )
            // InternalKerMLExpressions.g:7977:2: ( ruleRealValue )
            {
            // InternalKerMLExpressions.g:7977:2: ( ruleRealValue )
            // InternalKerMLExpressions.g:7978:3: ruleRealValue
            {
             before(grammarAccess.getLiteralRealAccess().getValueRealValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRealValue();

            state._fsp--;

             after(grammarAccess.getLiteralRealAccess().getValueRealValueParserRuleCall_0()); 

            }


            }

        }
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

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\uffff\2\4\3\uffff\2\4\2\uffff";
    static final String dfa_3s = "\1\6\2\16\1\6\1\uffff\1\6\2\16\1\uffff\1\6";
    static final String dfa_4s = "\1\7\2\102\1\7\1\uffff\1\72\2\102\1\uffff\1\7";
    static final String dfa_5s = "\4\uffff\1\1\3\uffff\1\2\1\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2",
            "\35\4\3\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\5\2\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\3\1\4\1\uffff\1\4",
            "\35\4\3\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\5\2\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\3\1\4\1\uffff\1\4",
            "\1\6\1\7",
            "",
            "\2\10\62\uffff\1\4",
            "\35\4\3\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\5\2\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\11\1\4\1\uffff\1\4",
            "\35\4\3\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\5\2\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\11\1\4\1\uffff\1\4",
            "",
            "\1\6\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2214:1: rule__FeatureChainMember__Alternatives : ( ( ( rule__FeatureChainMember__MemberElementAssignment_0 ) ) | ( ( rule__FeatureChainMember__OwnedRelatedElementAssignment_1 ) ) );";
        }
    }
    static final String dfa_8s = "\43\uffff";
    static final String dfa_9s = "\4\uffff\2\11\6\uffff\4\11\3\uffff\4\11\3\uffff\4\11\2\uffff\2\11\1\uffff";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\uffff\2\16\2\uffff\1\6\1\uffff\1\6\1\uffff\4\16\3\6\4\16\3\6\4\16\2\6\2\16\1\6";
    static final String dfa_11s = "\1\72\1\uffff\1\101\1\uffff\2\102\2\uffff\1\7\1\uffff\1\72\1\uffff\4\102\2\7\1\72\4\102\2\7\1\72\4\102\2\7\2\102\1\7";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\5\1\6\1\uffff\1\3\1\uffff\1\4\27\uffff";
    static final String dfa_13s = "\43\uffff}>";
    static final String[] dfa_14s = {
            "\2\3\1\4\1\5\1\3\35\uffff\1\3\10\uffff\1\1\2\3\3\uffff\1\3\2\uffff\1\2\1\uffff\1\6",
            "",
            "\5\7\23\uffff\4\7\4\uffff\3\7\4\uffff\3\7\1\uffff\3\7\1\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\1\1\7\6\uffff\1\7",
            "",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\12\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\10\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\12\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\10\1\11\1\uffff\1\11",
            "",
            "",
            "\1\14\1\15",
            "",
            "\1\16\1\17\62\uffff\1\11",
            "",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\12\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\20\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\12\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\20\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\22\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\21\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\22\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\21\1\11\1\uffff\1\11",
            "\1\14\1\15",
            "\1\23\1\24",
            "\1\25\1\26\62\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\22\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\27\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\22\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\27\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\31\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\30\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\31\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\30\1\11\1\uffff\1\11",
            "\1\23\1\24",
            "\1\32\1\33",
            "\1\34\1\35\62\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\31\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\36\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\31\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\36\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\31\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\37\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\31\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\37\1\11\1\uffff\1\11",
            "\1\32\1\33",
            "\1\40\1\41",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\31\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\42\1\11\1\uffff\1\11",
            "\35\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\31\2\11\1\13\1\11\1\uffff\1\11\3\uffff\1\42\1\11\1\uffff\1\11",
            "\1\40\1\41"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2235:1: rule__BaseExpression__Alternatives : ( ( ruleNullExpression ) | ( ruleLiteralExpression ) | ( ruleFeatureReferenceExpression ) | ( ruleInvocationExpression ) | ( ruleExpressionBody ) | ( ( rule__BaseExpression__Group_5__0 ) ) );";
        }
    }
    static final String dfa_15s = "\11\uffff";
    static final String dfa_16s = "\1\uffff\2\5\3\uffff\2\5\1\uffff";
    static final String dfa_17s = "\1\6\2\65\1\6\2\uffff\2\65\1\6";
    static final String dfa_18s = "\1\7\2\77\1\7\2\uffff\2\77\1\7";
    static final String dfa_19s = "\4\uffff\1\2\1\1\3\uffff";
    static final String dfa_20s = "\11\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\1\2",
            "\1\4\2\uffff\1\5\6\uffff\1\3",
            "\1\4\2\uffff\1\5\6\uffff\1\3",
            "\1\6\1\7",
            "",
            "",
            "\1\4\2\uffff\1\5\6\uffff\1\10",
            "\1\4\2\uffff\1\5\6\uffff\1\10",
            "\1\6\1\7"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "2301:1: rule__OwnedFeatureTyping__Alternatives : ( ( ( rule__OwnedFeatureTyping__TypeAssignment_0 ) ) | ( ( rule__OwnedFeatureTyping__OwnedRelatedElementAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x052BB870000001F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0523B870000001F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000383000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00A0000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00A0000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x05000000000000C0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x252BB870000001F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x072BB870000001F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0023004000000130L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});

}