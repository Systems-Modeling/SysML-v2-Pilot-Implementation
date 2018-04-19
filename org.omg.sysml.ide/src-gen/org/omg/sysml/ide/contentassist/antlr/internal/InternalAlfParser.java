package org.omg.sysml.ide.contentassist.antlr.internal;

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
import org.omg.sysml.services.AlfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_BOOLEAN_VALUE", "RULE_NATURAL_VALUE", "RULE_STRING", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'class'", "'feature'", "'public'", "'private'", "'protected'", "'packaged'", "'{'", "'}'", "'is'", "';'", "'specializes'", "','", "':'", "'.'", "'abstract'"
    };
    public static final int RULE_BOOLEAN_VALUE=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int RULE_ID=4;
    public static final int RULE_NATURAL_VALUE=7;
    public static final int RULE_WS=14;
    public static final int RULE_INLINE_STATEMENT=11;
    public static final int RULE_UNRESTRICTED_NAME=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAlfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlf.g"; }


    	private AlfGrammarAccess grammarAccess;

    	public void setGrammarAccess(AlfGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUnitDefinition"
    // InternalAlf.g:53:1: entryRuleUnitDefinition : ruleUnitDefinition EOF ;
    public final void entryRuleUnitDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:54:1: ( ruleUnitDefinition EOF )
            // InternalAlf.g:55:1: ruleUnitDefinition EOF
            {
             before(grammarAccess.getUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitDefinition();

            state._fsp--;

             after(grammarAccess.getUnitDefinitionRule()); 
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
    // $ANTLR end "entryRuleUnitDefinition"


    // $ANTLR start "ruleUnitDefinition"
    // InternalAlf.g:62:1: ruleUnitDefinition : ( ( rule__UnitDefinition__Alternatives ) ) ;
    public final void ruleUnitDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:66:2: ( ( ( rule__UnitDefinition__Alternatives ) ) )
            // InternalAlf.g:67:2: ( ( rule__UnitDefinition__Alternatives ) )
            {
            // InternalAlf.g:67:2: ( ( rule__UnitDefinition__Alternatives ) )
            // InternalAlf.g:68:3: ( rule__UnitDefinition__Alternatives )
            {
             before(grammarAccess.getUnitDefinitionAccess().getAlternatives()); 
            // InternalAlf.g:69:3: ( rule__UnitDefinition__Alternatives )
            // InternalAlf.g:69:4: rule__UnitDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnitDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnitDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitDefinition"


    // $ANTLR start "entryRulePackageDefinition"
    // InternalAlf.g:78:1: entryRulePackageDefinition : rulePackageDefinition EOF ;
    public final void entryRulePackageDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:79:1: ( rulePackageDefinition EOF )
            // InternalAlf.g:80:1: rulePackageDefinition EOF
            {
             before(grammarAccess.getPackageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDefinition();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionRule()); 
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
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalAlf.g:87:1: rulePackageDefinition : ( ( rule__PackageDefinition__Group__0 ) ) ;
    public final void rulePackageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:91:2: ( ( ( rule__PackageDefinition__Group__0 ) ) )
            // InternalAlf.g:92:2: ( ( rule__PackageDefinition__Group__0 ) )
            {
            // InternalAlf.g:92:2: ( ( rule__PackageDefinition__Group__0 ) )
            // InternalAlf.g:93:3: ( rule__PackageDefinition__Group__0 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            // InternalAlf.g:94:3: ( rule__PackageDefinition__Group__0 )
            // InternalAlf.g:94:4: rule__PackageDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRulePackageDefinitionOrStub"
    // InternalAlf.g:103:1: entryRulePackageDefinitionOrStub : rulePackageDefinitionOrStub EOF ;
    public final void entryRulePackageDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:104:1: ( rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:105:1: rulePackageDefinitionOrStub EOF
            {
             before(grammarAccess.getPackageDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDefinitionOrStub();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionOrStubRule()); 
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
    // $ANTLR end "entryRulePackageDefinitionOrStub"


    // $ANTLR start "rulePackageDefinitionOrStub"
    // InternalAlf.g:112:1: rulePackageDefinitionOrStub : ( rulePackageDefinition ) ;
    public final void rulePackageDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:116:2: ( ( rulePackageDefinition ) )
            // InternalAlf.g:117:2: ( rulePackageDefinition )
            {
            // InternalAlf.g:117:2: ( rulePackageDefinition )
            // InternalAlf.g:118:3: rulePackageDefinition
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getPackageDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePackageDefinition();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionOrStubAccess().getPackageDefinitionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDefinitionOrStub"


    // $ANTLR start "entryRuleMemberDefinition"
    // InternalAlf.g:128:1: entryRuleMemberDefinition : ruleMemberDefinition EOF ;
    public final void entryRuleMemberDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:129:1: ( ruleMemberDefinition EOF )
            // InternalAlf.g:130:1: ruleMemberDefinition EOF
            {
             before(grammarAccess.getMemberDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberDefinition();

            state._fsp--;

             after(grammarAccess.getMemberDefinitionRule()); 
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
    // $ANTLR end "entryRuleMemberDefinition"


    // $ANTLR start "ruleMemberDefinition"
    // InternalAlf.g:137:1: ruleMemberDefinition : ( ( rule__MemberDefinition__Group__0 ) ) ;
    public final void ruleMemberDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:141:2: ( ( ( rule__MemberDefinition__Group__0 ) ) )
            // InternalAlf.g:142:2: ( ( rule__MemberDefinition__Group__0 ) )
            {
            // InternalAlf.g:142:2: ( ( rule__MemberDefinition__Group__0 ) )
            // InternalAlf.g:143:3: ( rule__MemberDefinition__Group__0 )
            {
             before(grammarAccess.getMemberDefinitionAccess().getGroup()); 
            // InternalAlf.g:144:3: ( rule__MemberDefinition__Group__0 )
            // InternalAlf.g:144:4: rule__MemberDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberDefinition"


    // $ANTLR start "entryRuleMemberKind"
    // InternalAlf.g:153:1: entryRuleMemberKind : ruleMemberKind EOF ;
    public final void entryRuleMemberKind() throws RecognitionException {
        try {
            // InternalAlf.g:154:1: ( ruleMemberKind EOF )
            // InternalAlf.g:155:1: ruleMemberKind EOF
            {
             before(grammarAccess.getMemberKindRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberKind();

            state._fsp--;

             after(grammarAccess.getMemberKindRule()); 
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
    // $ANTLR end "entryRuleMemberKind"


    // $ANTLR start "ruleMemberKind"
    // InternalAlf.g:162:1: ruleMemberKind : ( ( rule__MemberKind__Alternatives ) ) ;
    public final void ruleMemberKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:166:2: ( ( ( rule__MemberKind__Alternatives ) ) )
            // InternalAlf.g:167:2: ( ( rule__MemberKind__Alternatives ) )
            {
            // InternalAlf.g:167:2: ( ( rule__MemberKind__Alternatives ) )
            // InternalAlf.g:168:3: ( rule__MemberKind__Alternatives )
            {
             before(grammarAccess.getMemberKindAccess().getAlternatives()); 
            // InternalAlf.g:169:3: ( rule__MemberKind__Alternatives )
            // InternalAlf.g:169:4: rule__MemberKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MemberKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberKind"


    // $ANTLR start "entryRulePackagedElementDefinition"
    // InternalAlf.g:178:1: entryRulePackagedElementDefinition : rulePackagedElementDefinition EOF ;
    public final void entryRulePackagedElementDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:179:1: ( rulePackagedElementDefinition EOF )
            // InternalAlf.g:180:1: rulePackagedElementDefinition EOF
            {
             before(grammarAccess.getPackagedElementDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePackagedElementDefinition();

            state._fsp--;

             after(grammarAccess.getPackagedElementDefinitionRule()); 
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
    // $ANTLR end "entryRulePackagedElementDefinition"


    // $ANTLR start "rulePackagedElementDefinition"
    // InternalAlf.g:187:1: rulePackagedElementDefinition : ( ( rule__PackagedElementDefinition__Alternatives ) ) ;
    public final void rulePackagedElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:191:2: ( ( ( rule__PackagedElementDefinition__Alternatives ) ) )
            // InternalAlf.g:192:2: ( ( rule__PackagedElementDefinition__Alternatives ) )
            {
            // InternalAlf.g:192:2: ( ( rule__PackagedElementDefinition__Alternatives ) )
            // InternalAlf.g:193:3: ( rule__PackagedElementDefinition__Alternatives )
            {
             before(grammarAccess.getPackagedElementDefinitionAccess().getAlternatives()); 
            // InternalAlf.g:194:3: ( rule__PackagedElementDefinition__Alternatives )
            // InternalAlf.g:194:4: rule__PackagedElementDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PackagedElementDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPackagedElementDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackagedElementDefinition"


    // $ANTLR start "entryRuleClassifierDefinitionOrStub"
    // InternalAlf.g:203:1: entryRuleClassifierDefinitionOrStub : ruleClassifierDefinitionOrStub EOF ;
    public final void entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:204:1: ( ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:205:1: ruleClassifierDefinitionOrStub EOF
            {
             before(grammarAccess.getClassifierDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            ruleClassifierDefinitionOrStub();

            state._fsp--;

             after(grammarAccess.getClassifierDefinitionOrStubRule()); 
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
    // $ANTLR end "entryRuleClassifierDefinitionOrStub"


    // $ANTLR start "ruleClassifierDefinitionOrStub"
    // InternalAlf.g:212:1: ruleClassifierDefinitionOrStub : ( ruleClassDefinitionOrStub ) ;
    public final void ruleClassifierDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:216:2: ( ( ruleClassDefinitionOrStub ) )
            // InternalAlf.g:217:2: ( ruleClassDefinitionOrStub )
            {
            // InternalAlf.g:217:2: ( ruleClassDefinitionOrStub )
            // InternalAlf.g:218:3: ruleClassDefinitionOrStub
            {
             before(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleClassDefinitionOrStub();

            state._fsp--;

             after(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifierDefinitionOrStub"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalAlf.g:228:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalAlf.g:229:1: ( ruleClassDeclaration EOF )
            // InternalAlf.g:230:1: ruleClassDeclaration EOF
            {
             before(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationRule()); 
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
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalAlf.g:237:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:241:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalAlf.g:242:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalAlf.g:242:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalAlf.g:243:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalAlf.g:244:3: ( rule__ClassDeclaration__Group__0 )
            // InternalAlf.g:244:4: rule__ClassDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:253:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:254:1: ( ruleGeneralization EOF )
            // InternalAlf.g:255:1: ruleGeneralization EOF
            {
             before(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getGeneralizationRule()); 
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
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalAlf.g:262:1: ruleGeneralization : ( ( rule__Generalization__GeneralAssignment ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:266:2: ( ( ( rule__Generalization__GeneralAssignment ) ) )
            // InternalAlf.g:267:2: ( ( rule__Generalization__GeneralAssignment ) )
            {
            // InternalAlf.g:267:2: ( ( rule__Generalization__GeneralAssignment ) )
            // InternalAlf.g:268:3: ( rule__Generalization__GeneralAssignment )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment()); 
            // InternalAlf.g:269:3: ( rule__Generalization__GeneralAssignment )
            // InternalAlf.g:269:4: rule__Generalization__GeneralAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__GeneralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getGeneralAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleClassDefinition"
    // InternalAlf.g:278:1: entryRuleClassDefinition : ruleClassDefinition EOF ;
    public final void entryRuleClassDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:279:1: ( ruleClassDefinition EOF )
            // InternalAlf.g:280:1: ruleClassDefinition EOF
            {
             before(grammarAccess.getClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDefinition();

            state._fsp--;

             after(grammarAccess.getClassDefinitionRule()); 
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
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // InternalAlf.g:287:1: ruleClassDefinition : ( ( rule__ClassDefinition__Group__0 ) ) ;
    public final void ruleClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:291:2: ( ( ( rule__ClassDefinition__Group__0 ) ) )
            // InternalAlf.g:292:2: ( ( rule__ClassDefinition__Group__0 ) )
            {
            // InternalAlf.g:292:2: ( ( rule__ClassDefinition__Group__0 ) )
            // InternalAlf.g:293:3: ( rule__ClassDefinition__Group__0 )
            {
             before(grammarAccess.getClassDefinitionAccess().getGroup()); 
            // InternalAlf.g:294:3: ( rule__ClassDefinition__Group__0 )
            // InternalAlf.g:294:4: rule__ClassDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:303:1: entryRuleClassDefinitionOrStub : ruleClassDefinitionOrStub EOF ;
    public final void entryRuleClassDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:304:1: ( ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:305:1: ruleClassDefinitionOrStub EOF
            {
             before(grammarAccess.getClassDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDefinitionOrStub();

            state._fsp--;

             after(grammarAccess.getClassDefinitionOrStubRule()); 
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
    // $ANTLR end "entryRuleClassDefinitionOrStub"


    // $ANTLR start "ruleClassDefinitionOrStub"
    // InternalAlf.g:312:1: ruleClassDefinitionOrStub : ( ruleClassDefinition ) ;
    public final void ruleClassDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:316:2: ( ( ruleClassDefinition ) )
            // InternalAlf.g:317:2: ( ruleClassDefinition )
            {
            // InternalAlf.g:317:2: ( ruleClassDefinition )
            // InternalAlf.g:318:3: ruleClassDefinition
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getClassDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleClassDefinition();

            state._fsp--;

             after(grammarAccess.getClassDefinitionOrStubAccess().getClassDefinitionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDefinitionOrStub"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:328:1: entryRuleFeatureDefinition : ruleFeatureDefinition EOF ;
    public final void entryRuleFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:329:1: ( ruleFeatureDefinition EOF )
            // InternalAlf.g:330:1: ruleFeatureDefinition EOF
            {
             before(grammarAccess.getFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionRule()); 
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
    // $ANTLR end "entryRuleFeatureDefinition"


    // $ANTLR start "ruleFeatureDefinition"
    // InternalAlf.g:337:1: ruleFeatureDefinition : ( ( rule__FeatureDefinition__Group__0 ) ) ;
    public final void ruleFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:341:2: ( ( ( rule__FeatureDefinition__Group__0 ) ) )
            // InternalAlf.g:342:2: ( ( rule__FeatureDefinition__Group__0 ) )
            {
            // InternalAlf.g:342:2: ( ( rule__FeatureDefinition__Group__0 ) )
            // InternalAlf.g:343:3: ( rule__FeatureDefinition__Group__0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup()); 
            // InternalAlf.g:344:3: ( rule__FeatureDefinition__Group__0 )
            // InternalAlf.g:344:4: rule__FeatureDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureDefinition"


    // $ANTLR start "entryRuleName"
    // InternalAlf.g:353:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalAlf.g:354:1: ( ruleName EOF )
            // InternalAlf.g:355:1: ruleName EOF
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
    // InternalAlf.g:362:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:366:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalAlf.g:367:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalAlf.g:367:2: ( ( rule__Name__Alternatives ) )
            // InternalAlf.g:368:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalAlf.g:369:3: ( rule__Name__Alternatives )
            // InternalAlf.g:369:4: rule__Name__Alternatives
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAlf.g:378:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAlf.g:379:1: ( ruleQualifiedName EOF )
            // InternalAlf.g:380:1: ruleQualifiedName EOF
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
    // InternalAlf.g:387:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:391:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAlf.g:392:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAlf.g:392:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAlf.g:393:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAlf.g:394:3: ( rule__QualifiedName__Group__0 )
            // InternalAlf.g:394:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalAlf.g:403:1: ruleVisibilityIndicator : ( ( rule__VisibilityIndicator__Alternatives ) ) ;
    public final void ruleVisibilityIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:407:1: ( ( ( rule__VisibilityIndicator__Alternatives ) ) )
            // InternalAlf.g:408:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            {
            // InternalAlf.g:408:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            // InternalAlf.g:409:3: ( rule__VisibilityIndicator__Alternatives )
            {
             before(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            // InternalAlf.g:410:3: ( rule__VisibilityIndicator__Alternatives )
            // InternalAlf.g:410:4: rule__VisibilityIndicator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VisibilityIndicator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilityIndicator"


    // $ANTLR start "rule__UnitDefinition__Alternatives"
    // InternalAlf.g:418:1: rule__UnitDefinition__Alternatives : ( ( rulePackageDefinition ) | ( ruleClassDefinition ) );
    public final void rule__UnitDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:422:1: ( ( rulePackageDefinition ) | ( ruleClassDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16||LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:423:2: ( rulePackageDefinition )
                    {
                    // InternalAlf.g:423:2: ( rulePackageDefinition )
                    // InternalAlf.g:424:3: rulePackageDefinition
                    {
                     before(grammarAccess.getUnitDefinitionAccess().getPackageDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDefinition();

                    state._fsp--;

                     after(grammarAccess.getUnitDefinitionAccess().getPackageDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:429:2: ( ruleClassDefinition )
                    {
                    // InternalAlf.g:429:2: ( ruleClassDefinition )
                    // InternalAlf.g:430:3: ruleClassDefinition
                    {
                     before(grammarAccess.getUnitDefinitionAccess().getClassDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDefinition();

                    state._fsp--;

                     after(grammarAccess.getUnitDefinitionAccess().getClassDefinitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__UnitDefinition__Alternatives"


    // $ANTLR start "rule__MemberDefinition__Alternatives_1"
    // InternalAlf.g:439:1: rule__MemberDefinition__Alternatives_1 : ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) );
    public final void rule__MemberDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:443:1: ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAlf.g:444:2: ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) )
                    {
                    // InternalAlf.g:444:2: ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) )
                    // InternalAlf.g:445:3: ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 )
                    {
                     before(grammarAccess.getMemberDefinitionAccess().getOwnedMemberElementAssignment_1_0()); 
                    // InternalAlf.g:446:3: ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 )
                    // InternalAlf.g:446:4: rule__MemberDefinition__OwnedMemberElementAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberDefinition__OwnedMemberElementAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemberDefinitionAccess().getOwnedMemberElementAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:450:2: ( ( rule__MemberDefinition__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:450:2: ( ( rule__MemberDefinition__Group_1_1__0 ) )
                    // InternalAlf.g:451:3: ( rule__MemberDefinition__Group_1_1__0 )
                    {
                     before(grammarAccess.getMemberDefinitionAccess().getGroup_1_1()); 
                    // InternalAlf.g:452:3: ( rule__MemberDefinition__Group_1_1__0 )
                    // InternalAlf.g:452:4: rule__MemberDefinition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberDefinition__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemberDefinitionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__MemberDefinition__Alternatives_1"


    // $ANTLR start "rule__MemberKind__Alternatives"
    // InternalAlf.g:460:1: rule__MemberKind__Alternatives : ( ( 'package' ) | ( 'class' ) | ( 'feature' ) );
    public final void rule__MemberKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:464:1: ( ( 'package' ) | ( 'class' ) | ( 'feature' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAlf.g:465:2: ( 'package' )
                    {
                    // InternalAlf.g:465:2: ( 'package' )
                    // InternalAlf.g:466:3: 'package'
                    {
                     before(grammarAccess.getMemberKindAccess().getPackageKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMemberKindAccess().getPackageKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:471:2: ( 'class' )
                    {
                    // InternalAlf.g:471:2: ( 'class' )
                    // InternalAlf.g:472:3: 'class'
                    {
                     before(grammarAccess.getMemberKindAccess().getClassKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMemberKindAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:477:2: ( 'feature' )
                    {
                    // InternalAlf.g:477:2: ( 'feature' )
                    // InternalAlf.g:478:3: 'feature'
                    {
                     before(grammarAccess.getMemberKindAccess().getFeatureKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMemberKindAccess().getFeatureKeyword_2()); 

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
    // $ANTLR end "rule__MemberKind__Alternatives"


    // $ANTLR start "rule__PackagedElementDefinition__Alternatives"
    // InternalAlf.g:487:1: rule__PackagedElementDefinition__Alternatives : ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) | ( ruleFeatureDefinition ) );
    public final void rule__PackagedElementDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:491:1: ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) | ( ruleFeatureDefinition ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
            case 30:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 17:
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
                    // InternalAlf.g:492:2: ( rulePackageDefinitionOrStub )
                    {
                    // InternalAlf.g:492:2: ( rulePackageDefinitionOrStub )
                    // InternalAlf.g:493:3: rulePackageDefinitionOrStub
                    {
                     before(grammarAccess.getPackagedElementDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDefinitionOrStub();

                    state._fsp--;

                     after(grammarAccess.getPackagedElementDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:498:2: ( ruleClassifierDefinitionOrStub )
                    {
                    // InternalAlf.g:498:2: ( ruleClassifierDefinitionOrStub )
                    // InternalAlf.g:499:3: ruleClassifierDefinitionOrStub
                    {
                     before(grammarAccess.getPackagedElementDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassifierDefinitionOrStub();

                    state._fsp--;

                     after(grammarAccess.getPackagedElementDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:504:2: ( ruleFeatureDefinition )
                    {
                    // InternalAlf.g:504:2: ( ruleFeatureDefinition )
                    // InternalAlf.g:505:3: ruleFeatureDefinition
                    {
                     before(grammarAccess.getPackagedElementDefinitionAccess().getFeatureDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureDefinition();

                    state._fsp--;

                     after(grammarAccess.getPackagedElementDefinitionAccess().getFeatureDefinitionParserRuleCall_2()); 

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
    // $ANTLR end "rule__PackagedElementDefinition__Alternatives"


    // $ANTLR start "rule__Name__Alternatives"
    // InternalAlf.g:514:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:518:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_UNRESTRICTED_NAME) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:519:2: ( RULE_ID )
                    {
                    // InternalAlf.g:519:2: ( RULE_ID )
                    // InternalAlf.g:520:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:525:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:525:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:526:3: RULE_UNRESTRICTED_NAME
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


    // $ANTLR start "rule__VisibilityIndicator__Alternatives"
    // InternalAlf.g:535:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:539:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAlf.g:540:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:540:2: ( ( 'public' ) )
                    // InternalAlf.g:541:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:542:3: ( 'public' )
                    // InternalAlf.g:542:4: 'public'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:546:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:546:2: ( ( 'private' ) )
                    // InternalAlf.g:547:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:548:3: ( 'private' )
                    // InternalAlf.g:548:4: 'private'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:552:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:552:2: ( ( 'protected' ) )
                    // InternalAlf.g:553:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:554:3: ( 'protected' )
                    // InternalAlf.g:554:4: 'protected'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:558:2: ( ( 'packaged' ) )
                    {
                    // InternalAlf.g:558:2: ( ( 'packaged' ) )
                    // InternalAlf.g:559:3: ( 'packaged' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3()); 
                    // InternalAlf.g:560:3: ( 'packaged' )
                    // InternalAlf.g:560:4: 'packaged'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__VisibilityIndicator__Alternatives"


    // $ANTLR start "rule__PackageDefinition__Group__0"
    // InternalAlf.g:568:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:572:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:573:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PackageDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__1();

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
    // $ANTLR end "rule__PackageDefinition__Group__0"


    // $ANTLR start "rule__PackageDefinition__Group__0__Impl"
    // InternalAlf.g:580:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:584:1: ( ( 'package' ) )
            // InternalAlf.g:585:1: ( 'package' )
            {
            // InternalAlf.g:585:1: ( 'package' )
            // InternalAlf.g:586:2: 'package'
            {
             before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__0__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__1"
    // InternalAlf.g:595:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:599:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:600:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PackageDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__2();

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
    // $ANTLR end "rule__PackageDefinition__Group__1"


    // $ANTLR start "rule__PackageDefinition__Group__1__Impl"
    // InternalAlf.g:607:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:611:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:612:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:612:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:613:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:614:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:614:3: rule__PackageDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__2"
    // InternalAlf.g:622:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:626:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:627:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PackageDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__3();

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
    // $ANTLR end "rule__PackageDefinition__Group__2"


    // $ANTLR start "rule__PackageDefinition__Group__2__Impl"
    // InternalAlf.g:634:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:638:1: ( ( '{' ) )
            // InternalAlf.g:639:1: ( '{' )
            {
            // InternalAlf.g:639:1: ( '{' )
            // InternalAlf.g:640:2: '{'
            {
             before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__2__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__3"
    // InternalAlf.g:649:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:653:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:654:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PackageDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__4();

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
    // $ANTLR end "rule__PackageDefinition__Group__3"


    // $ANTLR start "rule__PackageDefinition__Group__3__Impl"
    // InternalAlf.g:661:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__GroupMemberAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:665:1: ( ( ( rule__PackageDefinition__GroupMemberAssignment_3 )* ) )
            // InternalAlf.g:666:1: ( ( rule__PackageDefinition__GroupMemberAssignment_3 )* )
            {
            // InternalAlf.g:666:1: ( ( rule__PackageDefinition__GroupMemberAssignment_3 )* )
            // InternalAlf.g:667:2: ( rule__PackageDefinition__GroupMemberAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getGroupMemberAssignment_3()); 
            // InternalAlf.g:668:2: ( rule__PackageDefinition__GroupMemberAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_UNRESTRICTED_NAME)||(LA7_0>=15 && LA7_0<=21)||LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAlf.g:668:3: rule__PackageDefinition__GroupMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__GroupMemberAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPackageDefinitionAccess().getGroupMemberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__3__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__4"
    // InternalAlf.g:676:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:680:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:681:2: rule__PackageDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__PackageDefinition__Group__4"


    // $ANTLR start "rule__PackageDefinition__Group__4__Impl"
    // InternalAlf.g:687:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:691:1: ( ( '}' ) )
            // InternalAlf.g:692:1: ( '}' )
            {
            // InternalAlf.g:692:1: ( '}' )
            // InternalAlf.g:693:2: '}'
            {
             before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__4__Impl"


    // $ANTLR start "rule__MemberDefinition__Group__0"
    // InternalAlf.g:703:1: rule__MemberDefinition__Group__0 : rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1 ;
    public final void rule__MemberDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:707:1: ( rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1 )
            // InternalAlf.g:708:2: rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MemberDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Group__1();

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
    // $ANTLR end "rule__MemberDefinition__Group__0"


    // $ANTLR start "rule__MemberDefinition__Group__0__Impl"
    // InternalAlf.g:715:1: rule__MemberDefinition__Group__0__Impl : ( ( rule__MemberDefinition__VisibilityAssignment_0 )? ) ;
    public final void rule__MemberDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:719:1: ( ( ( rule__MemberDefinition__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:720:1: ( ( rule__MemberDefinition__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:720:1: ( ( rule__MemberDefinition__VisibilityAssignment_0 )? )
            // InternalAlf.g:721:2: ( rule__MemberDefinition__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMemberDefinitionAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:722:2: ( rule__MemberDefinition__VisibilityAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=18 && LA8_0<=21)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:722:3: rule__MemberDefinition__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberDefinition__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberDefinitionAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__Group__0__Impl"


    // $ANTLR start "rule__MemberDefinition__Group__1"
    // InternalAlf.g:730:1: rule__MemberDefinition__Group__1 : rule__MemberDefinition__Group__1__Impl ;
    public final void rule__MemberDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:734:1: ( rule__MemberDefinition__Group__1__Impl )
            // InternalAlf.g:735:2: rule__MemberDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Group__1__Impl();

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
    // $ANTLR end "rule__MemberDefinition__Group__1"


    // $ANTLR start "rule__MemberDefinition__Group__1__Impl"
    // InternalAlf.g:741:1: rule__MemberDefinition__Group__1__Impl : ( ( rule__MemberDefinition__Alternatives_1 ) ) ;
    public final void rule__MemberDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:745:1: ( ( ( rule__MemberDefinition__Alternatives_1 ) ) )
            // InternalAlf.g:746:1: ( ( rule__MemberDefinition__Alternatives_1 ) )
            {
            // InternalAlf.g:746:1: ( ( rule__MemberDefinition__Alternatives_1 ) )
            // InternalAlf.g:747:2: ( rule__MemberDefinition__Alternatives_1 )
            {
             before(grammarAccess.getMemberDefinitionAccess().getAlternatives_1()); 
            // InternalAlf.g:748:2: ( rule__MemberDefinition__Alternatives_1 )
            // InternalAlf.g:748:3: rule__MemberDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__Group__1__Impl"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__0"
    // InternalAlf.g:757:1: rule__MemberDefinition__Group_1_1__0 : rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1 ;
    public final void rule__MemberDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:761:1: ( rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1 )
            // InternalAlf.g:762:2: rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__MemberDefinition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Group_1_1__1();

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
    // $ANTLR end "rule__MemberDefinition__Group_1_1__0"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__0__Impl"
    // InternalAlf.g:769:1: rule__MemberDefinition__Group_1_1__0__Impl : ( ruleMemberKind ) ;
    public final void rule__MemberDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:773:1: ( ( ruleMemberKind ) )
            // InternalAlf.g:774:1: ( ruleMemberKind )
            {
            // InternalAlf.g:774:1: ( ruleMemberKind )
            // InternalAlf.g:775:2: ruleMemberKind
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberKindParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberKind();

            state._fsp--;

             after(grammarAccess.getMemberDefinitionAccess().getMemberKindParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__Group_1_1__0__Impl"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__1"
    // InternalAlf.g:784:1: rule__MemberDefinition__Group_1_1__1 : rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2 ;
    public final void rule__MemberDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:788:1: ( rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2 )
            // InternalAlf.g:789:2: rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__MemberDefinition__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Group_1_1__2();

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
    // $ANTLR end "rule__MemberDefinition__Group_1_1__1"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__1__Impl"
    // InternalAlf.g:796:1: rule__MemberDefinition__Group_1_1__1__Impl : ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? ) ;
    public final void rule__MemberDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:800:1: ( ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? ) )
            // InternalAlf.g:801:1: ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? )
            {
            // InternalAlf.g:801:1: ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? )
            // InternalAlf.g:802:2: ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )?
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberNameAssignment_1_1_1()); 
            // InternalAlf.g:803:2: ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:803:3: rule__MemberDefinition__MemberNameAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberDefinition__MemberNameAssignment_1_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberDefinitionAccess().getMemberNameAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__Group_1_1__1__Impl"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__2"
    // InternalAlf.g:811:1: rule__MemberDefinition__Group_1_1__2 : rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3 ;
    public final void rule__MemberDefinition__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:815:1: ( rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3 )
            // InternalAlf.g:816:2: rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3
            {
            pushFollow(FOLLOW_3);
            rule__MemberDefinition__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Group_1_1__3();

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
    // $ANTLR end "rule__MemberDefinition__Group_1_1__2"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__2__Impl"
    // InternalAlf.g:823:1: rule__MemberDefinition__Group_1_1__2__Impl : ( 'is' ) ;
    public final void rule__MemberDefinition__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:827:1: ( ( 'is' ) )
            // InternalAlf.g:828:1: ( 'is' )
            {
            // InternalAlf.g:828:1: ( 'is' )
            // InternalAlf.g:829:2: 'is'
            {
             before(grammarAccess.getMemberDefinitionAccess().getIsKeyword_1_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMemberDefinitionAccess().getIsKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__Group_1_1__2__Impl"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__3"
    // InternalAlf.g:838:1: rule__MemberDefinition__Group_1_1__3 : rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4 ;
    public final void rule__MemberDefinition__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:842:1: ( rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4 )
            // InternalAlf.g:843:2: rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4
            {
            pushFollow(FOLLOW_9);
            rule__MemberDefinition__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Group_1_1__4();

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
    // $ANTLR end "rule__MemberDefinition__Group_1_1__3"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__3__Impl"
    // InternalAlf.g:850:1: rule__MemberDefinition__Group_1_1__3__Impl : ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) ) ;
    public final void rule__MemberDefinition__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:854:1: ( ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) ) )
            // InternalAlf.g:855:1: ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) )
            {
            // InternalAlf.g:855:1: ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) )
            // InternalAlf.g:856:2: ( rule__MemberDefinition__MemberElementAssignment_1_1_3 )
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberElementAssignment_1_1_3()); 
            // InternalAlf.g:857:2: ( rule__MemberDefinition__MemberElementAssignment_1_1_3 )
            // InternalAlf.g:857:3: rule__MemberDefinition__MemberElementAssignment_1_1_3
            {
            pushFollow(FOLLOW_2);
            rule__MemberDefinition__MemberElementAssignment_1_1_3();

            state._fsp--;


            }

             after(grammarAccess.getMemberDefinitionAccess().getMemberElementAssignment_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__Group_1_1__3__Impl"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__4"
    // InternalAlf.g:865:1: rule__MemberDefinition__Group_1_1__4 : rule__MemberDefinition__Group_1_1__4__Impl ;
    public final void rule__MemberDefinition__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:869:1: ( rule__MemberDefinition__Group_1_1__4__Impl )
            // InternalAlf.g:870:2: rule__MemberDefinition__Group_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberDefinition__Group_1_1__4__Impl();

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
    // $ANTLR end "rule__MemberDefinition__Group_1_1__4"


    // $ANTLR start "rule__MemberDefinition__Group_1_1__4__Impl"
    // InternalAlf.g:876:1: rule__MemberDefinition__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__MemberDefinition__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:880:1: ( ( ';' ) )
            // InternalAlf.g:881:1: ( ';' )
            {
            // InternalAlf.g:881:1: ( ';' )
            // InternalAlf.g:882:2: ';'
            {
             before(grammarAccess.getMemberDefinitionAccess().getSemicolonKeyword_1_1_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMemberDefinitionAccess().getSemicolonKeyword_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__Group_1_1__4__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalAlf.g:892:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:896:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:897:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ClassDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__1();

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
    // $ANTLR end "rule__ClassDeclaration__Group__0"


    // $ANTLR start "rule__ClassDeclaration__Group__0__Impl"
    // InternalAlf.g:904:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:908:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:909:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:909:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:910:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:911:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlf.g:911:3: rule__ClassDeclaration__IsAbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__IsAbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__1"
    // InternalAlf.g:919:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:923:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:924:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__2();

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
    // $ANTLR end "rule__ClassDeclaration__Group__1"


    // $ANTLR start "rule__ClassDeclaration__Group__1__Impl"
    // InternalAlf.g:931:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:935:1: ( ( 'class' ) )
            // InternalAlf.g:936:1: ( 'class' )
            {
            // InternalAlf.g:936:1: ( 'class' )
            // InternalAlf.g:937:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__2"
    // InternalAlf.g:946:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:950:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:951:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ClassDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__3();

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
    // $ANTLR end "rule__ClassDeclaration__Group__2"


    // $ANTLR start "rule__ClassDeclaration__Group__2__Impl"
    // InternalAlf.g:958:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:962:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:963:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:963:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:964:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:965:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:965:3: rule__ClassDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__3"
    // InternalAlf.g:973:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:977:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:978:2: rule__ClassDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ClassDeclaration__Group__3"


    // $ANTLR start "rule__ClassDeclaration__Group__3__Impl"
    // InternalAlf.g:984:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:988:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:989:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:989:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:990:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:991:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:991:3: rule__ClassDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3__0"
    // InternalAlf.g:1000:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1004:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:1005:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__1();

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
    // $ANTLR end "rule__ClassDeclaration__Group_3__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3__0__Impl"
    // InternalAlf.g:1012:1: rule__ClassDeclaration__Group_3__0__Impl : ( 'specializes' ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1016:1: ( ( 'specializes' ) )
            // InternalAlf.g:1017:1: ( 'specializes' )
            {
            // InternalAlf.g:1017:1: ( 'specializes' )
            // InternalAlf.g:1018:2: 'specializes'
            {
             before(grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3__1"
    // InternalAlf.g:1027:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1031:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalAlf.g:1032:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__ClassDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__2();

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
    // $ANTLR end "rule__ClassDeclaration__Group_3__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3__1__Impl"
    // InternalAlf.g:1039:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1043:1: ( ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 ) ) )
            // InternalAlf.g:1044:1: ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 ) )
            {
            // InternalAlf.g:1044:1: ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 ) )
            // InternalAlf.g:1045:2: ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationAssignment_3_1()); 
            // InternalAlf.g:1046:2: ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 )
            // InternalAlf.g:1046:3: rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3__2"
    // InternalAlf.g:1054:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1058:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalAlf.g:1059:2: rule__ClassDeclaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__2__Impl();

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
    // $ANTLR end "rule__ClassDeclaration__Group_3__2"


    // $ANTLR start "rule__ClassDeclaration__Group_3__2__Impl"
    // InternalAlf.g:1065:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1069:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:1070:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:1070:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:1071:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:1072:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:1072:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_2__0"
    // InternalAlf.g:1081:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1085:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalAlf.g:1086:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDeclaration__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_2__1();

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
    // $ANTLR end "rule__ClassDeclaration__Group_3_2__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3_2__0__Impl"
    // InternalAlf.g:1093:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1097:1: ( ( ',' ) )
            // InternalAlf.g:1098:1: ( ',' )
            {
            // InternalAlf.g:1098:1: ( ',' )
            // InternalAlf.g:1099:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_2__1"
    // InternalAlf.g:1108:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1112:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:1113:2: rule__ClassDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__ClassDeclaration__Group_3_2__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3_2__1__Impl"
    // InternalAlf.g:1119:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1123:1: ( ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 ) ) )
            // InternalAlf.g:1124:1: ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 ) )
            {
            // InternalAlf.g:1124:1: ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 ) )
            // InternalAlf.g:1125:2: ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationAssignment_3_2_1()); 
            // InternalAlf.g:1126:2: ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 )
            // InternalAlf.g:1126:3: rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__ClassDefinition__Group__0"
    // InternalAlf.g:1135:1: rule__ClassDefinition__Group__0 : rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 ;
    public final void rule__ClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1139:1: ( rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 )
            // InternalAlf.g:1140:2: rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ClassDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinition__Group__1();

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
    // $ANTLR end "rule__ClassDefinition__Group__0"


    // $ANTLR start "rule__ClassDefinition__Group__0__Impl"
    // InternalAlf.g:1147:1: rule__ClassDefinition__Group__0__Impl : ( ruleClassDeclaration ) ;
    public final void rule__ClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1151:1: ( ( ruleClassDeclaration ) )
            // InternalAlf.g:1152:1: ( ruleClassDeclaration )
            {
            // InternalAlf.g:1152:1: ( ruleClassDeclaration )
            // InternalAlf.g:1153:2: ruleClassDeclaration
            {
             before(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinition__Group__0__Impl"


    // $ANTLR start "rule__ClassDefinition__Group__1"
    // InternalAlf.g:1162:1: rule__ClassDefinition__Group__1 : rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 ;
    public final void rule__ClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1166:1: ( rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 )
            // InternalAlf.g:1167:2: rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ClassDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinition__Group__2();

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
    // $ANTLR end "rule__ClassDefinition__Group__1"


    // $ANTLR start "rule__ClassDefinition__Group__1__Impl"
    // InternalAlf.g:1174:1: rule__ClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1178:1: ( ( '{' ) )
            // InternalAlf.g:1179:1: ( '{' )
            {
            // InternalAlf.g:1179:1: ( '{' )
            // InternalAlf.g:1180:2: '{'
            {
             before(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinition__Group__1__Impl"


    // $ANTLR start "rule__ClassDefinition__Group__2"
    // InternalAlf.g:1189:1: rule__ClassDefinition__Group__2 : rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 ;
    public final void rule__ClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1193:1: ( rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 )
            // InternalAlf.g:1194:2: rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ClassDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinition__Group__3();

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
    // $ANTLR end "rule__ClassDefinition__Group__2"


    // $ANTLR start "rule__ClassDefinition__Group__2__Impl"
    // InternalAlf.g:1201:1: rule__ClassDefinition__Group__2__Impl : ( ( rule__ClassDefinition__GroupMemberAssignment_2 )* ) ;
    public final void rule__ClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1205:1: ( ( ( rule__ClassDefinition__GroupMemberAssignment_2 )* ) )
            // InternalAlf.g:1206:1: ( ( rule__ClassDefinition__GroupMemberAssignment_2 )* )
            {
            // InternalAlf.g:1206:1: ( ( rule__ClassDefinition__GroupMemberAssignment_2 )* )
            // InternalAlf.g:1207:2: ( rule__ClassDefinition__GroupMemberAssignment_2 )*
            {
             before(grammarAccess.getClassDefinitionAccess().getGroupMemberAssignment_2()); 
            // InternalAlf.g:1208:2: ( rule__ClassDefinition__GroupMemberAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_UNRESTRICTED_NAME)||(LA13_0>=15 && LA13_0<=21)||LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAlf.g:1208:3: rule__ClassDefinition__GroupMemberAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ClassDefinition__GroupMemberAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClassDefinitionAccess().getGroupMemberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinition__Group__2__Impl"


    // $ANTLR start "rule__ClassDefinition__Group__3"
    // InternalAlf.g:1216:1: rule__ClassDefinition__Group__3 : rule__ClassDefinition__Group__3__Impl ;
    public final void rule__ClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1220:1: ( rule__ClassDefinition__Group__3__Impl )
            // InternalAlf.g:1221:2: rule__ClassDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__ClassDefinition__Group__3"


    // $ANTLR start "rule__ClassDefinition__Group__3__Impl"
    // InternalAlf.g:1227:1: rule__ClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__ClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1231:1: ( ( '}' ) )
            // InternalAlf.g:1232:1: ( '}' )
            {
            // InternalAlf.g:1232:1: ( '}' )
            // InternalAlf.g:1233:2: '}'
            {
             before(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinition__Group__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group__0"
    // InternalAlf.g:1243:1: rule__FeatureDefinition__Group__0 : rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1 ;
    public final void rule__FeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1247:1: ( rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1 )
            // InternalAlf.g:1248:2: rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FeatureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group__0"


    // $ANTLR start "rule__FeatureDefinition__Group__0__Impl"
    // InternalAlf.g:1255:1: rule__FeatureDefinition__Group__0__Impl : ( ( 'feature' )? ) ;
    public final void rule__FeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1259:1: ( ( ( 'feature' )? ) )
            // InternalAlf.g:1260:1: ( ( 'feature' )? )
            {
            // InternalAlf.g:1260:1: ( ( 'feature' )? )
            // InternalAlf.g:1261:2: ( 'feature' )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getFeatureKeyword_0()); 
            // InternalAlf.g:1262:2: ( 'feature' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:1262:3: 'feature'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group__1"
    // InternalAlf.g:1270:1: rule__FeatureDefinition__Group__1 : rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2 ;
    public final void rule__FeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1274:1: ( rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2 )
            // InternalAlf.g:1275:2: rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__FeatureDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group__2();

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
    // $ANTLR end "rule__FeatureDefinition__Group__1"


    // $ANTLR start "rule__FeatureDefinition__Group__1__Impl"
    // InternalAlf.g:1282:1: rule__FeatureDefinition__Group__1__Impl : ( ( rule__FeatureDefinition__NameAssignment_1 ) ) ;
    public final void rule__FeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1286:1: ( ( ( rule__FeatureDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:1287:1: ( ( rule__FeatureDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:1287:1: ( ( rule__FeatureDefinition__NameAssignment_1 ) )
            // InternalAlf.g:1288:2: ( rule__FeatureDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:1289:2: ( rule__FeatureDefinition__NameAssignment_1 )
            // InternalAlf.g:1289:3: rule__FeatureDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group__2"
    // InternalAlf.g:1297:1: rule__FeatureDefinition__Group__2 : rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3 ;
    public final void rule__FeatureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1301:1: ( rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3 )
            // InternalAlf.g:1302:2: rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__FeatureDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group__3();

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
    // $ANTLR end "rule__FeatureDefinition__Group__2"


    // $ANTLR start "rule__FeatureDefinition__Group__2__Impl"
    // InternalAlf.g:1309:1: rule__FeatureDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__FeatureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1313:1: ( ( ':' ) )
            // InternalAlf.g:1314:1: ( ':' )
            {
            // InternalAlf.g:1314:1: ( ':' )
            // InternalAlf.g:1315:2: ':'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group__3"
    // InternalAlf.g:1324:1: rule__FeatureDefinition__Group__3 : rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4 ;
    public final void rule__FeatureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1328:1: ( rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4 )
            // InternalAlf.g:1329:2: rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FeatureDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group__4();

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
    // $ANTLR end "rule__FeatureDefinition__Group__3"


    // $ANTLR start "rule__FeatureDefinition__Group__3__Impl"
    // InternalAlf.g:1336:1: rule__FeatureDefinition__Group__3__Impl : ( ( rule__FeatureDefinition__ReferencedTypeAssignment_3 ) ) ;
    public final void rule__FeatureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1340:1: ( ( ( rule__FeatureDefinition__ReferencedTypeAssignment_3 ) ) )
            // InternalAlf.g:1341:1: ( ( rule__FeatureDefinition__ReferencedTypeAssignment_3 ) )
            {
            // InternalAlf.g:1341:1: ( ( rule__FeatureDefinition__ReferencedTypeAssignment_3 ) )
            // InternalAlf.g:1342:2: ( rule__FeatureDefinition__ReferencedTypeAssignment_3 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeAssignment_3()); 
            // InternalAlf.g:1343:2: ( rule__FeatureDefinition__ReferencedTypeAssignment_3 )
            // InternalAlf.g:1343:3: rule__FeatureDefinition__ReferencedTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__ReferencedTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group__4"
    // InternalAlf.g:1351:1: rule__FeatureDefinition__Group__4 : rule__FeatureDefinition__Group__4__Impl ;
    public final void rule__FeatureDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1355:1: ( rule__FeatureDefinition__Group__4__Impl )
            // InternalAlf.g:1356:2: rule__FeatureDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group__4"


    // $ANTLR start "rule__FeatureDefinition__Group__4__Impl"
    // InternalAlf.g:1362:1: rule__FeatureDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__FeatureDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1366:1: ( ( ';' ) )
            // InternalAlf.g:1367:1: ( ';' )
            {
            // InternalAlf.g:1367:1: ( ';' )
            // InternalAlf.g:1368:2: ';'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAlf.g:1378:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1382:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:1383:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAlf.g:1390:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1394:1: ( ( ruleName ) )
            // InternalAlf.g:1395:1: ( ruleName )
            {
            // InternalAlf.g:1395:1: ( ruleName )
            // InternalAlf.g:1396:2: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 

            }


            }

        }
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
    // InternalAlf.g:1405:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1409:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:1410:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:1416:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1420:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:1421:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:1421:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:1422:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:1423:2: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAlf.g:1423:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalAlf.g:1432:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1436:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:1437:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalAlf.g:1444:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1448:1: ( ( '.' ) )
            // InternalAlf.g:1449:1: ( '.' )
            {
            // InternalAlf.g:1449:1: ( '.' )
            // InternalAlf.g:1450:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // InternalAlf.g:1459:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1463:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:1464:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalAlf.g:1470:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1474:1: ( ( ruleName ) )
            // InternalAlf.g:1475:1: ( ruleName )
            {
            // InternalAlf.g:1475:1: ( ruleName )
            // InternalAlf.g:1476:2: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackageDefinition__NameAssignment_1"
    // InternalAlf.g:1486:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1490:1: ( ( ruleName ) )
            // InternalAlf.g:1491:2: ( ruleName )
            {
            // InternalAlf.g:1491:2: ( ruleName )
            // InternalAlf.g:1492:3: ruleName
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__NameAssignment_1"


    // $ANTLR start "rule__PackageDefinition__GroupMemberAssignment_3"
    // InternalAlf.g:1501:1: rule__PackageDefinition__GroupMemberAssignment_3 : ( ruleMemberDefinition ) ;
    public final void rule__PackageDefinition__GroupMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1505:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:1506:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:1506:2: ( ruleMemberDefinition )
            // InternalAlf.g:1507:3: ruleMemberDefinition
            {
             before(grammarAccess.getPackageDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberDefinition();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__GroupMemberAssignment_3"


    // $ANTLR start "rule__MemberDefinition__VisibilityAssignment_0"
    // InternalAlf.g:1516:1: rule__MemberDefinition__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__MemberDefinition__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1520:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:1521:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:1521:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:1522:3: ruleVisibilityIndicator
            {
             before(grammarAccess.getMemberDefinitionAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityIndicator();

            state._fsp--;

             after(grammarAccess.getMemberDefinitionAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__VisibilityAssignment_0"


    // $ANTLR start "rule__MemberDefinition__OwnedMemberElementAssignment_1_0"
    // InternalAlf.g:1531:1: rule__MemberDefinition__OwnedMemberElementAssignment_1_0 : ( rulePackagedElementDefinition ) ;
    public final void rule__MemberDefinition__OwnedMemberElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1535:1: ( ( rulePackagedElementDefinition ) )
            // InternalAlf.g:1536:2: ( rulePackagedElementDefinition )
            {
            // InternalAlf.g:1536:2: ( rulePackagedElementDefinition )
            // InternalAlf.g:1537:3: rulePackagedElementDefinition
            {
             before(grammarAccess.getMemberDefinitionAccess().getOwnedMemberElementPackagedElementDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackagedElementDefinition();

            state._fsp--;

             after(grammarAccess.getMemberDefinitionAccess().getOwnedMemberElementPackagedElementDefinitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__OwnedMemberElementAssignment_1_0"


    // $ANTLR start "rule__MemberDefinition__MemberNameAssignment_1_1_1"
    // InternalAlf.g:1546:1: rule__MemberDefinition__MemberNameAssignment_1_1_1 : ( ruleName ) ;
    public final void rule__MemberDefinition__MemberNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1550:1: ( ( ruleName ) )
            // InternalAlf.g:1551:2: ( ruleName )
            {
            // InternalAlf.g:1551:2: ( ruleName )
            // InternalAlf.g:1552:3: ruleName
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberNameNameParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getMemberDefinitionAccess().getMemberNameNameParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__MemberNameAssignment_1_1_1"


    // $ANTLR start "rule__MemberDefinition__MemberElementAssignment_1_1_3"
    // InternalAlf.g:1561:1: rule__MemberDefinition__MemberElementAssignment_1_1_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MemberDefinition__MemberElementAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1565:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1566:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1566:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1567:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberElementElementCrossReference_1_1_3_0()); 
            // InternalAlf.g:1568:3: ( ruleQualifiedName )
            // InternalAlf.g:1569:4: ruleQualifiedName
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberElementElementQualifiedNameParserRuleCall_1_1_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMemberDefinitionAccess().getMemberElementElementQualifiedNameParserRuleCall_1_1_3_0_1()); 

            }

             after(grammarAccess.getMemberDefinitionAccess().getMemberElementElementCrossReference_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDefinition__MemberElementAssignment_1_1_3"


    // $ANTLR start "rule__ClassDeclaration__IsAbstractAssignment_0"
    // InternalAlf.g:1580:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1584:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:1585:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:1585:2: ( ( 'abstract' ) )
            // InternalAlf.g:1586:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:1587:3: ( 'abstract' )
            // InternalAlf.g:1588:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__IsAbstractAssignment_0"


    // $ANTLR start "rule__ClassDeclaration__NameAssignment_2"
    // InternalAlf.g:1599:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1603:1: ( ( ruleName ) )
            // InternalAlf.g:1604:2: ( ruleName )
            {
            // InternalAlf.g:1604:2: ( ruleName )
            // InternalAlf.g:1605:3: ruleName
            {
             before(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1"
    // InternalAlf.g:1614:1: rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1618:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:1619:2: ( ruleGeneralization )
            {
            // InternalAlf.g:1619:2: ( ruleGeneralization )
            // InternalAlf.g:1620:3: ruleGeneralization
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1"


    // $ANTLR start "rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1"
    // InternalAlf.g:1629:1: rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1633:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:1634:2: ( ruleGeneralization )
            {
            // InternalAlf.g:1634:2: ( ruleGeneralization )
            // InternalAlf.g:1635:3: ruleGeneralization
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationGeneralizationParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1"


    // $ANTLR start "rule__Generalization__GeneralAssignment"
    // InternalAlf.g:1644:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1648:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1649:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1649:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1650:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:1651:3: ( ruleQualifiedName )
            // InternalAlf.g:1652:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getGeneralClassQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__GeneralAssignment"


    // $ANTLR start "rule__ClassDefinition__GroupMemberAssignment_2"
    // InternalAlf.g:1663:1: rule__ClassDefinition__GroupMemberAssignment_2 : ( ruleMemberDefinition ) ;
    public final void rule__ClassDefinition__GroupMemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1667:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:1668:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:1668:2: ( ruleMemberDefinition )
            // InternalAlf.g:1669:3: ruleMemberDefinition
            {
             before(grammarAccess.getClassDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberDefinition();

            state._fsp--;

             after(grammarAccess.getClassDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinition__GroupMemberAssignment_2"


    // $ANTLR start "rule__FeatureDefinition__NameAssignment_1"
    // InternalAlf.g:1678:1: rule__FeatureDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__FeatureDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1682:1: ( ( ruleName ) )
            // InternalAlf.g:1683:2: ( ruleName )
            {
            // InternalAlf.g:1683:2: ( ruleName )
            // InternalAlf.g:1684:3: ruleName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__NameAssignment_1"


    // $ANTLR start "rule__FeatureDefinition__ReferencedTypeAssignment_3"
    // InternalAlf.g:1693:1: rule__FeatureDefinition__ReferencedTypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureDefinition__ReferencedTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1697:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1698:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1698:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1699:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_3_0()); 
            // InternalAlf.g:1700:3: ( ruleQualifiedName )
            // InternalAlf.g:1701:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__ReferencedTypeAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\2\4\1\uffff\2\4\2\26\1\uffff\2\26\2\30";
    static final String dfa_3s = "\1\36\1\30\1\uffff\4\30\1\uffff\2\32\2\34";
    static final String dfa_4s = "\2\uffff\1\1\4\uffff\1\2\4\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\11\uffff\1\1\1\3\1\4\14\uffff\1\2",
            "\1\5\1\6\22\uffff\1\7",
            "",
            "\1\10\1\11\22\uffff\1\7",
            "\1\12\1\13\22\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "",
            "\1\2\1\uffff\1\7\1\uffff\1\2",
            "\1\2\1\uffff\1\7\1\uffff\1\2",
            "\1\7\3\uffff\1\2",
            "\1\7\3\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "439:1: rule__MemberDefinition__Alternatives_1 : ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040BF8030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000403F8032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000403F8030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040038030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});

}