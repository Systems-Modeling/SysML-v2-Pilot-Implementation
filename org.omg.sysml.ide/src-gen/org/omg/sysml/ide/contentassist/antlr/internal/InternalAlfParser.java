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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_NATURAL_VALUE", "RULE_BOOLEAN_VALUE", "RULE_STRING", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'class'", "'feature'", "'is'", "'specializes'", "';'", "'public'", "'private'", "'protected'", "'packaged'", "'{'", "'}'", "','", "':'", "'['", "']'", "'..'", "'*'", "'.'", "'abstract'"
    };
    public static final int RULE_BOOLEAN_VALUE=7;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_NATURAL_VALUE=6;
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


    // $ANTLR start "entryRuleAnonymousClassDefinition"
    // InternalAlf.g:353:1: entryRuleAnonymousClassDefinition : ruleAnonymousClassDefinition EOF ;
    public final void entryRuleAnonymousClassDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:354:1: ( ruleAnonymousClassDefinition EOF )
            // InternalAlf.g:355:1: ruleAnonymousClassDefinition EOF
            {
             before(grammarAccess.getAnonymousClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAnonymousClassDefinition();

            state._fsp--;

             after(grammarAccess.getAnonymousClassDefinitionRule()); 
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
    // $ANTLR end "entryRuleAnonymousClassDefinition"


    // $ANTLR start "ruleAnonymousClassDefinition"
    // InternalAlf.g:362:1: ruleAnonymousClassDefinition : ( ( rule__AnonymousClassDefinition__Group__0 ) ) ;
    public final void ruleAnonymousClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:366:2: ( ( ( rule__AnonymousClassDefinition__Group__0 ) ) )
            // InternalAlf.g:367:2: ( ( rule__AnonymousClassDefinition__Group__0 ) )
            {
            // InternalAlf.g:367:2: ( ( rule__AnonymousClassDefinition__Group__0 ) )
            // InternalAlf.g:368:3: ( rule__AnonymousClassDefinition__Group__0 )
            {
             before(grammarAccess.getAnonymousClassDefinitionAccess().getGroup()); 
            // InternalAlf.g:369:3: ( rule__AnonymousClassDefinition__Group__0 )
            // InternalAlf.g:369:4: rule__AnonymousClassDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousClassDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousClassDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnonymousClassDefinition"


    // $ANTLR start "entryRuleNaturalLiteralExpression"
    // InternalAlf.g:378:1: entryRuleNaturalLiteralExpression : ruleNaturalLiteralExpression EOF ;
    public final void entryRuleNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:379:1: ( ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:380:1: ruleNaturalLiteralExpression EOF
            {
             before(grammarAccess.getNaturalLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNaturalLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleNaturalLiteralExpression"


    // $ANTLR start "ruleNaturalLiteralExpression"
    // InternalAlf.g:387:1: ruleNaturalLiteralExpression : ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) ;
    public final void ruleNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:391:2: ( ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:392:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:392:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:393:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getNaturalLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:394:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            // InternalAlf.g:394:4: rule__NaturalLiteralExpression__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NaturalLiteralExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNaturalLiteralExpressionAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNaturalLiteralExpression"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpression"
    // InternalAlf.g:403:1: entryRuleUnlimitedNaturalLiteralExpression : ruleUnlimitedNaturalLiteralExpression EOF ;
    public final void entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:404:1: ( ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:405:1: ruleUnlimitedNaturalLiteralExpression EOF
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUnlimitedNaturalLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpression"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpression"
    // InternalAlf.g:412:1: ruleUnlimitedNaturalLiteralExpression : ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) ;
    public final void ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:416:2: ( ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) )
            // InternalAlf.g:417:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:417:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            // InternalAlf.g:418:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:419:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            // InternalAlf.g:419:4: rule__UnlimitedNaturalLiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNaturalLiteralExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpression"


    // $ANTLR start "entryRuleName"
    // InternalAlf.g:428:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalAlf.g:429:1: ( ruleName EOF )
            // InternalAlf.g:430:1: ruleName EOF
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
    // InternalAlf.g:437:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:441:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalAlf.g:442:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalAlf.g:442:2: ( ( rule__Name__Alternatives ) )
            // InternalAlf.g:443:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalAlf.g:444:3: ( rule__Name__Alternatives )
            // InternalAlf.g:444:4: rule__Name__Alternatives
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
    // InternalAlf.g:453:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAlf.g:454:1: ( ruleQualifiedName EOF )
            // InternalAlf.g:455:1: ruleQualifiedName EOF
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
    // InternalAlf.g:462:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:466:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAlf.g:467:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAlf.g:467:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAlf.g:468:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAlf.g:469:3: ( rule__QualifiedName__Group__0 )
            // InternalAlf.g:469:4: rule__QualifiedName__Group__0
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
    // InternalAlf.g:478:1: ruleVisibilityIndicator : ( ( rule__VisibilityIndicator__Alternatives ) ) ;
    public final void ruleVisibilityIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:482:1: ( ( ( rule__VisibilityIndicator__Alternatives ) ) )
            // InternalAlf.g:483:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            {
            // InternalAlf.g:483:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            // InternalAlf.g:484:3: ( rule__VisibilityIndicator__Alternatives )
            {
             before(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            // InternalAlf.g:485:3: ( rule__VisibilityIndicator__Alternatives )
            // InternalAlf.g:485:4: rule__VisibilityIndicator__Alternatives
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
    // InternalAlf.g:493:1: rule__UnitDefinition__Alternatives : ( ( rulePackageDefinition ) | ( ruleClassDefinition ) );
    public final void rule__UnitDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:497:1: ( ( rulePackageDefinition ) | ( ruleClassDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16||LA1_0==34) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:498:2: ( rulePackageDefinition )
                    {
                    // InternalAlf.g:498:2: ( rulePackageDefinition )
                    // InternalAlf.g:499:3: rulePackageDefinition
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
                    // InternalAlf.g:504:2: ( ruleClassDefinition )
                    {
                    // InternalAlf.g:504:2: ( ruleClassDefinition )
                    // InternalAlf.g:505:3: ruleClassDefinition
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
    // InternalAlf.g:514:1: rule__MemberDefinition__Alternatives_1 : ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) );
    public final void rule__MemberDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:518:1: ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAlf.g:519:2: ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) )
                    {
                    // InternalAlf.g:519:2: ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) )
                    // InternalAlf.g:520:3: ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 )
                    {
                     before(grammarAccess.getMemberDefinitionAccess().getOwnedMemberElementAssignment_1_0()); 
                    // InternalAlf.g:521:3: ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 )
                    // InternalAlf.g:521:4: rule__MemberDefinition__OwnedMemberElementAssignment_1_0
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
                    // InternalAlf.g:525:2: ( ( rule__MemberDefinition__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:525:2: ( ( rule__MemberDefinition__Group_1_1__0 ) )
                    // InternalAlf.g:526:3: ( rule__MemberDefinition__Group_1_1__0 )
                    {
                     before(grammarAccess.getMemberDefinitionAccess().getGroup_1_1()); 
                    // InternalAlf.g:527:3: ( rule__MemberDefinition__Group_1_1__0 )
                    // InternalAlf.g:527:4: rule__MemberDefinition__Group_1_1__0
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
    // InternalAlf.g:535:1: rule__MemberKind__Alternatives : ( ( 'package' ) | ( 'class' ) | ( 'feature' ) );
    public final void rule__MemberKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:539:1: ( ( 'package' ) | ( 'class' ) | ( 'feature' ) )
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
                    // InternalAlf.g:540:2: ( 'package' )
                    {
                    // InternalAlf.g:540:2: ( 'package' )
                    // InternalAlf.g:541:3: 'package'
                    {
                     before(grammarAccess.getMemberKindAccess().getPackageKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMemberKindAccess().getPackageKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:546:2: ( 'class' )
                    {
                    // InternalAlf.g:546:2: ( 'class' )
                    // InternalAlf.g:547:3: 'class'
                    {
                     before(grammarAccess.getMemberKindAccess().getClassKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMemberKindAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:552:2: ( 'feature' )
                    {
                    // InternalAlf.g:552:2: ( 'feature' )
                    // InternalAlf.g:553:3: 'feature'
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
    // InternalAlf.g:562:1: rule__PackagedElementDefinition__Alternatives : ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) | ( ruleFeatureDefinition ) );
    public final void rule__PackagedElementDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:566:1: ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) | ( ruleFeatureDefinition ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
            case 34:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 17:
            case 18:
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
                    // InternalAlf.g:567:2: ( rulePackageDefinitionOrStub )
                    {
                    // InternalAlf.g:567:2: ( rulePackageDefinitionOrStub )
                    // InternalAlf.g:568:3: rulePackageDefinitionOrStub
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
                    // InternalAlf.g:573:2: ( ruleClassifierDefinitionOrStub )
                    {
                    // InternalAlf.g:573:2: ( ruleClassifierDefinitionOrStub )
                    // InternalAlf.g:574:3: ruleClassifierDefinitionOrStub
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
                    // InternalAlf.g:579:2: ( ruleFeatureDefinition )
                    {
                    // InternalAlf.g:579:2: ( ruleFeatureDefinition )
                    // InternalAlf.g:580:3: ruleFeatureDefinition
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


    // $ANTLR start "rule__ClassDeclaration__Alternatives_3_0"
    // InternalAlf.g:589:1: rule__ClassDeclaration__Alternatives_3_0 : ( ( 'is' ) | ( 'specializes' ) );
    public final void rule__ClassDeclaration__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:593:1: ( ( 'is' ) | ( 'specializes' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:594:2: ( 'is' )
                    {
                    // InternalAlf.g:594:2: ( 'is' )
                    // InternalAlf.g:595:3: 'is'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:600:2: ( 'specializes' )
                    {
                    // InternalAlf.g:600:2: ( 'specializes' )
                    // InternalAlf.g:601:3: 'specializes'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1()); 

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
    // $ANTLR end "rule__ClassDeclaration__Alternatives_3_0"


    // $ANTLR start "rule__FeatureDefinition__Alternatives_1"
    // InternalAlf.g:610:1: rule__FeatureDefinition__Alternatives_1 : ( ( ( rule__FeatureDefinition__Group_1_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1_1__0 ) ) );
    public final void rule__FeatureDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:614:1: ( ( ( rule__FeatureDefinition__Group_1_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1_1__0 ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20||LA6_1==25||(LA6_1>=28 && LA6_1<=29)) ) {
                    alt6=1;
                }
                else if ( (LA6_1==18) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==20||LA6_2==25||(LA6_2>=28 && LA6_2<=29)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==18) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAlf.g:615:2: ( ( rule__FeatureDefinition__Group_1_0__0 ) )
                    {
                    // InternalAlf.g:615:2: ( ( rule__FeatureDefinition__Group_1_0__0 ) )
                    // InternalAlf.g:616:3: ( rule__FeatureDefinition__Group_1_0__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0()); 
                    // InternalAlf.g:617:3: ( rule__FeatureDefinition__Group_1_0__0 )
                    // InternalAlf.g:617:4: rule__FeatureDefinition__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:621:2: ( ( rule__FeatureDefinition__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:621:2: ( ( rule__FeatureDefinition__Group_1_1__0 ) )
                    // InternalAlf.g:622:3: ( rule__FeatureDefinition__Group_1_1__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1()); 
                    // InternalAlf.g:623:3: ( rule__FeatureDefinition__Group_1_1__0 )
                    // InternalAlf.g:623:4: rule__FeatureDefinition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__FeatureDefinition__Alternatives_1"


    // $ANTLR start "rule__FeatureDefinition__Alternatives_1_0_3"
    // InternalAlf.g:631:1: rule__FeatureDefinition__Alternatives_1_0_3 : ( ( ';' ) | ( ( rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1 ) ) );
    public final void rule__FeatureDefinition__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:635:1: ( ( ';' ) | ( ( rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:636:2: ( ';' )
                    {
                    // InternalAlf.g:636:2: ( ';' )
                    // InternalAlf.g:637:3: ';'
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:642:2: ( ( rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1 ) )
                    {
                    // InternalAlf.g:642:2: ( ( rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1 ) )
                    // InternalAlf.g:643:3: ( rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAssignment_1_0_3_1()); 
                    // InternalAlf.g:644:3: ( rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1 )
                    // InternalAlf.g:644:4: rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAssignment_1_0_3_1()); 

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
    // $ANTLR end "rule__FeatureDefinition__Alternatives_1_0_3"


    // $ANTLR start "rule__FeatureDefinition__Alternatives_1_1_3"
    // InternalAlf.g:652:1: rule__FeatureDefinition__Alternatives_1_1_3 : ( ( ( rule__FeatureDefinition__Group_1_1_3_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1_1_3_1__0 ) ) );
    public final void rule__FeatureDefinition__Alternatives_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:656:1: ( ( ( rule__FeatureDefinition__Group_1_1_3_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1_1_3_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_NATURAL_VALUE) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==30) ) {
                        int LA8_5 = input.LA(4);

                        if ( (LA8_5==20) ) {
                            alt8=2;
                        }
                        else if ( (LA8_5==25) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA8_3==31) ) {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==RULE_NATURAL_VALUE) ) {
                            int LA8_8 = input.LA(5);

                            if ( (LA8_8==30) ) {
                                int LA8_5 = input.LA(6);

                                if ( (LA8_5==20) ) {
                                    alt8=2;
                                }
                                else if ( (LA8_5==25) ) {
                                    alt8=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA8_6==32) ) {
                            int LA8_4 = input.LA(5);

                            if ( (LA8_4==30) ) {
                                int LA8_5 = input.LA(6);

                                if ( (LA8_5==20) ) {
                                    alt8=2;
                                }
                                else if ( (LA8_5==25) ) {
                                    alt8=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==32) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==30) ) {
                        int LA8_5 = input.LA(4);

                        if ( (LA8_5==20) ) {
                            alt8=2;
                        }
                        else if ( (LA8_5==25) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==25) ) {
                alt8=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:657:2: ( ( rule__FeatureDefinition__Group_1_1_3_0__0 ) )
                    {
                    // InternalAlf.g:657:2: ( ( rule__FeatureDefinition__Group_1_1_3_0__0 ) )
                    // InternalAlf.g:658:3: ( rule__FeatureDefinition__Group_1_1_3_0__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_0()); 
                    // InternalAlf.g:659:3: ( rule__FeatureDefinition__Group_1_1_3_0__0 )
                    // InternalAlf.g:659:4: rule__FeatureDefinition__Group_1_1_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_1_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:663:2: ( ( rule__FeatureDefinition__Group_1_1_3_1__0 ) )
                    {
                    // InternalAlf.g:663:2: ( ( rule__FeatureDefinition__Group_1_1_3_1__0 ) )
                    // InternalAlf.g:664:3: ( rule__FeatureDefinition__Group_1_1_3_1__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_1()); 
                    // InternalAlf.g:665:3: ( rule__FeatureDefinition__Group_1_1_3_1__0 )
                    // InternalAlf.g:665:4: rule__FeatureDefinition__Group_1_1_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_1_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_1()); 

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
    // $ANTLR end "rule__FeatureDefinition__Alternatives_1_1_3"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpression__Alternatives"
    // InternalAlf.g:673:1: rule__UnlimitedNaturalLiteralExpression__Alternatives : ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) );
    public final void rule__UnlimitedNaturalLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:677:1: ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NATURAL_VALUE) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:678:2: ( ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:678:2: ( ruleNaturalLiteralExpression )
                    // InternalAlf.g:679:3: ruleNaturalLiteralExpression
                    {
                     before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getNaturalLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNaturalLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getNaturalLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:684:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:684:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    // InternalAlf.g:685:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:686:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    // InternalAlf.g:686:4: rule__UnlimitedNaturalLiteralExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnlimitedNaturalLiteralExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpression__Alternatives"


    // $ANTLR start "rule__Name__Alternatives"
    // InternalAlf.g:694:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:698:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_UNRESTRICTED_NAME) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlf.g:699:2: ( RULE_ID )
                    {
                    // InternalAlf.g:699:2: ( RULE_ID )
                    // InternalAlf.g:700:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:705:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:705:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:706:3: RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:715:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:719:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAlf.g:720:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:720:2: ( ( 'public' ) )
                    // InternalAlf.g:721:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:722:3: ( 'public' )
                    // InternalAlf.g:722:4: 'public'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:726:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:726:2: ( ( 'private' ) )
                    // InternalAlf.g:727:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:728:3: ( 'private' )
                    // InternalAlf.g:728:4: 'private'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:732:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:732:2: ( ( 'protected' ) )
                    // InternalAlf.g:733:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:734:3: ( 'protected' )
                    // InternalAlf.g:734:4: 'protected'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:738:2: ( ( 'packaged' ) )
                    {
                    // InternalAlf.g:738:2: ( ( 'packaged' ) )
                    // InternalAlf.g:739:3: ( 'packaged' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3()); 
                    // InternalAlf.g:740:3: ( 'packaged' )
                    // InternalAlf.g:740:4: 'packaged'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalAlf.g:748:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:752:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:753:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
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
    // InternalAlf.g:760:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:764:1: ( ( 'package' ) )
            // InternalAlf.g:765:1: ( 'package' )
            {
            // InternalAlf.g:765:1: ( 'package' )
            // InternalAlf.g:766:2: 'package'
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
    // InternalAlf.g:775:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:779:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:780:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
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
    // InternalAlf.g:787:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:791:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:792:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:792:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:793:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:794:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:794:3: rule__PackageDefinition__NameAssignment_1
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
    // InternalAlf.g:802:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:806:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:807:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
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
    // InternalAlf.g:814:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:818:1: ( ( '{' ) )
            // InternalAlf.g:819:1: ( '{' )
            {
            // InternalAlf.g:819:1: ( '{' )
            // InternalAlf.g:820:2: '{'
            {
             before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAlf.g:829:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:833:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:834:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
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
    // InternalAlf.g:841:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__GroupMemberAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:845:1: ( ( ( rule__PackageDefinition__GroupMemberAssignment_3 )* ) )
            // InternalAlf.g:846:1: ( ( rule__PackageDefinition__GroupMemberAssignment_3 )* )
            {
            // InternalAlf.g:846:1: ( ( rule__PackageDefinition__GroupMemberAssignment_3 )* )
            // InternalAlf.g:847:2: ( rule__PackageDefinition__GroupMemberAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getGroupMemberAssignment_3()); 
            // InternalAlf.g:848:2: ( rule__PackageDefinition__GroupMemberAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_UNRESTRICTED_NAME)||(LA12_0>=15 && LA12_0<=18)||(LA12_0>=21 && LA12_0<=24)||LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:848:3: rule__PackageDefinition__GroupMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__GroupMemberAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalAlf.g:856:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:860:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:861:2: rule__PackageDefinition__Group__4__Impl
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
    // InternalAlf.g:867:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:871:1: ( ( '}' ) )
            // InternalAlf.g:872:1: ( '}' )
            {
            // InternalAlf.g:872:1: ( '}' )
            // InternalAlf.g:873:2: '}'
            {
             before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAlf.g:883:1: rule__MemberDefinition__Group__0 : rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1 ;
    public final void rule__MemberDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:887:1: ( rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1 )
            // InternalAlf.g:888:2: rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1
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
    // InternalAlf.g:895:1: rule__MemberDefinition__Group__0__Impl : ( ( rule__MemberDefinition__VisibilityAssignment_0 )? ) ;
    public final void rule__MemberDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:899:1: ( ( ( rule__MemberDefinition__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:900:1: ( ( rule__MemberDefinition__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:900:1: ( ( rule__MemberDefinition__VisibilityAssignment_0 )? )
            // InternalAlf.g:901:2: ( rule__MemberDefinition__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMemberDefinitionAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:902:2: ( rule__MemberDefinition__VisibilityAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=21 && LA13_0<=24)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:902:3: rule__MemberDefinition__VisibilityAssignment_0
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
    // InternalAlf.g:910:1: rule__MemberDefinition__Group__1 : rule__MemberDefinition__Group__1__Impl ;
    public final void rule__MemberDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:914:1: ( rule__MemberDefinition__Group__1__Impl )
            // InternalAlf.g:915:2: rule__MemberDefinition__Group__1__Impl
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
    // InternalAlf.g:921:1: rule__MemberDefinition__Group__1__Impl : ( ( rule__MemberDefinition__Alternatives_1 ) ) ;
    public final void rule__MemberDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:925:1: ( ( ( rule__MemberDefinition__Alternatives_1 ) ) )
            // InternalAlf.g:926:1: ( ( rule__MemberDefinition__Alternatives_1 ) )
            {
            // InternalAlf.g:926:1: ( ( rule__MemberDefinition__Alternatives_1 ) )
            // InternalAlf.g:927:2: ( rule__MemberDefinition__Alternatives_1 )
            {
             before(grammarAccess.getMemberDefinitionAccess().getAlternatives_1()); 
            // InternalAlf.g:928:2: ( rule__MemberDefinition__Alternatives_1 )
            // InternalAlf.g:928:3: rule__MemberDefinition__Alternatives_1
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
    // InternalAlf.g:937:1: rule__MemberDefinition__Group_1_1__0 : rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1 ;
    public final void rule__MemberDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:941:1: ( rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1 )
            // InternalAlf.g:942:2: rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1
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
    // InternalAlf.g:949:1: rule__MemberDefinition__Group_1_1__0__Impl : ( ruleMemberKind ) ;
    public final void rule__MemberDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:953:1: ( ( ruleMemberKind ) )
            // InternalAlf.g:954:1: ( ruleMemberKind )
            {
            // InternalAlf.g:954:1: ( ruleMemberKind )
            // InternalAlf.g:955:2: ruleMemberKind
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
    // InternalAlf.g:964:1: rule__MemberDefinition__Group_1_1__1 : rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2 ;
    public final void rule__MemberDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:968:1: ( rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2 )
            // InternalAlf.g:969:2: rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2
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
    // InternalAlf.g:976:1: rule__MemberDefinition__Group_1_1__1__Impl : ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? ) ;
    public final void rule__MemberDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:980:1: ( ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? ) )
            // InternalAlf.g:981:1: ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? )
            {
            // InternalAlf.g:981:1: ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? )
            // InternalAlf.g:982:2: ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )?
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberNameAssignment_1_1_1()); 
            // InternalAlf.g:983:2: ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:983:3: rule__MemberDefinition__MemberNameAssignment_1_1_1
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
    // InternalAlf.g:991:1: rule__MemberDefinition__Group_1_1__2 : rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3 ;
    public final void rule__MemberDefinition__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:995:1: ( rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3 )
            // InternalAlf.g:996:2: rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3
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
    // InternalAlf.g:1003:1: rule__MemberDefinition__Group_1_1__2__Impl : ( 'is' ) ;
    public final void rule__MemberDefinition__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1007:1: ( ( 'is' ) )
            // InternalAlf.g:1008:1: ( 'is' )
            {
            // InternalAlf.g:1008:1: ( 'is' )
            // InternalAlf.g:1009:2: 'is'
            {
             before(grammarAccess.getMemberDefinitionAccess().getIsKeyword_1_1_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAlf.g:1018:1: rule__MemberDefinition__Group_1_1__3 : rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4 ;
    public final void rule__MemberDefinition__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1022:1: ( rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4 )
            // InternalAlf.g:1023:2: rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4
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
    // InternalAlf.g:1030:1: rule__MemberDefinition__Group_1_1__3__Impl : ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) ) ;
    public final void rule__MemberDefinition__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1034:1: ( ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) ) )
            // InternalAlf.g:1035:1: ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) )
            {
            // InternalAlf.g:1035:1: ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) )
            // InternalAlf.g:1036:2: ( rule__MemberDefinition__MemberElementAssignment_1_1_3 )
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberElementAssignment_1_1_3()); 
            // InternalAlf.g:1037:2: ( rule__MemberDefinition__MemberElementAssignment_1_1_3 )
            // InternalAlf.g:1037:3: rule__MemberDefinition__MemberElementAssignment_1_1_3
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
    // InternalAlf.g:1045:1: rule__MemberDefinition__Group_1_1__4 : rule__MemberDefinition__Group_1_1__4__Impl ;
    public final void rule__MemberDefinition__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1049:1: ( rule__MemberDefinition__Group_1_1__4__Impl )
            // InternalAlf.g:1050:2: rule__MemberDefinition__Group_1_1__4__Impl
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
    // InternalAlf.g:1056:1: rule__MemberDefinition__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__MemberDefinition__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1060:1: ( ( ';' ) )
            // InternalAlf.g:1061:1: ( ';' )
            {
            // InternalAlf.g:1061:1: ( ';' )
            // InternalAlf.g:1062:2: ';'
            {
             before(grammarAccess.getMemberDefinitionAccess().getSemicolonKeyword_1_1_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAlf.g:1072:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1076:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:1077:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
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
    // InternalAlf.g:1084:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1088:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:1089:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:1089:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:1090:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:1091:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:1091:3: rule__ClassDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:1099:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1103:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:1104:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalAlf.g:1111:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1115:1: ( ( 'class' ) )
            // InternalAlf.g:1116:1: ( 'class' )
            {
            // InternalAlf.g:1116:1: ( 'class' )
            // InternalAlf.g:1117:2: 'class'
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
    // InternalAlf.g:1126:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1130:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:1131:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
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
    // InternalAlf.g:1138:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1142:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:1143:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:1143:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:1144:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:1145:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:1145:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalAlf.g:1153:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1157:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:1158:2: rule__ClassDeclaration__Group__3__Impl
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
    // InternalAlf.g:1164:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1168:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:1169:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:1169:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:1170:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:1171:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=18 && LA16_0<=19)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlf.g:1171:3: rule__ClassDeclaration__Group_3__0
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
    // InternalAlf.g:1180:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1184:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:1185:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalAlf.g:1192:1: rule__ClassDeclaration__Group_3__0__Impl : ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1196:1: ( ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:1197:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:1197:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:1198:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:1199:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            // InternalAlf.g:1199:3: rule__ClassDeclaration__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0()); 

            }


            }

        }
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
    // InternalAlf.g:1207:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1211:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalAlf.g:1212:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
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
    // InternalAlf.g:1219:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1223:1: ( ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 ) ) )
            // InternalAlf.g:1224:1: ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 ) )
            {
            // InternalAlf.g:1224:1: ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 ) )
            // InternalAlf.g:1225:2: ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationAssignment_3_1()); 
            // InternalAlf.g:1226:2: ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 )
            // InternalAlf.g:1226:3: rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1
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
    // InternalAlf.g:1234:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1238:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalAlf.g:1239:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:1245:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1249:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:1250:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:1250:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:1251:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:1252:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAlf.g:1252:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAlf.g:1261:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1265:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalAlf.g:1266:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalAlf.g:1273:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1277:1: ( ( ',' ) )
            // InternalAlf.g:1278:1: ( ',' )
            {
            // InternalAlf.g:1278:1: ( ',' )
            // InternalAlf.g:1279:2: ','
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
    // InternalAlf.g:1288:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1292:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:1293:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:1299:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1303:1: ( ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 ) ) )
            // InternalAlf.g:1304:1: ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 ) )
            {
            // InternalAlf.g:1304:1: ( ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 ) )
            // InternalAlf.g:1305:2: ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedGeneralizationAssignment_3_2_1()); 
            // InternalAlf.g:1306:2: ( rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 )
            // InternalAlf.g:1306:3: rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1
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
    // InternalAlf.g:1315:1: rule__ClassDefinition__Group__0 : rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 ;
    public final void rule__ClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1319:1: ( rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 )
            // InternalAlf.g:1320:2: rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1
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
    // InternalAlf.g:1327:1: rule__ClassDefinition__Group__0__Impl : ( ruleClassDeclaration ) ;
    public final void rule__ClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1331:1: ( ( ruleClassDeclaration ) )
            // InternalAlf.g:1332:1: ( ruleClassDeclaration )
            {
            // InternalAlf.g:1332:1: ( ruleClassDeclaration )
            // InternalAlf.g:1333:2: ruleClassDeclaration
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
    // InternalAlf.g:1342:1: rule__ClassDefinition__Group__1 : rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 ;
    public final void rule__ClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1346:1: ( rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 )
            // InternalAlf.g:1347:2: rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2
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
    // InternalAlf.g:1354:1: rule__ClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1358:1: ( ( '{' ) )
            // InternalAlf.g:1359:1: ( '{' )
            {
            // InternalAlf.g:1359:1: ( '{' )
            // InternalAlf.g:1360:2: '{'
            {
             before(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAlf.g:1369:1: rule__ClassDefinition__Group__2 : rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 ;
    public final void rule__ClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1373:1: ( rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 )
            // InternalAlf.g:1374:2: rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3
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
    // InternalAlf.g:1381:1: rule__ClassDefinition__Group__2__Impl : ( ( rule__ClassDefinition__GroupMemberAssignment_2 )* ) ;
    public final void rule__ClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1385:1: ( ( ( rule__ClassDefinition__GroupMemberAssignment_2 )* ) )
            // InternalAlf.g:1386:1: ( ( rule__ClassDefinition__GroupMemberAssignment_2 )* )
            {
            // InternalAlf.g:1386:1: ( ( rule__ClassDefinition__GroupMemberAssignment_2 )* )
            // InternalAlf.g:1387:2: ( rule__ClassDefinition__GroupMemberAssignment_2 )*
            {
             before(grammarAccess.getClassDefinitionAccess().getGroupMemberAssignment_2()); 
            // InternalAlf.g:1388:2: ( rule__ClassDefinition__GroupMemberAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_UNRESTRICTED_NAME)||(LA18_0>=15 && LA18_0<=18)||(LA18_0>=21 && LA18_0<=24)||LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAlf.g:1388:3: rule__ClassDefinition__GroupMemberAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ClassDefinition__GroupMemberAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAlf.g:1396:1: rule__ClassDefinition__Group__3 : rule__ClassDefinition__Group__3__Impl ;
    public final void rule__ClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1400:1: ( rule__ClassDefinition__Group__3__Impl )
            // InternalAlf.g:1401:2: rule__ClassDefinition__Group__3__Impl
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
    // InternalAlf.g:1407:1: rule__ClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__ClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1411:1: ( ( '}' ) )
            // InternalAlf.g:1412:1: ( '}' )
            {
            // InternalAlf.g:1412:1: ( '}' )
            // InternalAlf.g:1413:2: '}'
            {
             before(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAlf.g:1423:1: rule__FeatureDefinition__Group__0 : rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1 ;
    public final void rule__FeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1427:1: ( rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1 )
            // InternalAlf.g:1428:2: rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1
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
    // InternalAlf.g:1435:1: rule__FeatureDefinition__Group__0__Impl : ( ( 'feature' )? ) ;
    public final void rule__FeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1439:1: ( ( ( 'feature' )? ) )
            // InternalAlf.g:1440:1: ( ( 'feature' )? )
            {
            // InternalAlf.g:1440:1: ( ( 'feature' )? )
            // InternalAlf.g:1441:2: ( 'feature' )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getFeatureKeyword_0()); 
            // InternalAlf.g:1442:2: ( 'feature' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAlf.g:1442:3: 'feature'
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
    // InternalAlf.g:1450:1: rule__FeatureDefinition__Group__1 : rule__FeatureDefinition__Group__1__Impl ;
    public final void rule__FeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1454:1: ( rule__FeatureDefinition__Group__1__Impl )
            // InternalAlf.g:1455:2: rule__FeatureDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group__1__Impl();

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
    // InternalAlf.g:1461:1: rule__FeatureDefinition__Group__1__Impl : ( ( rule__FeatureDefinition__Alternatives_1 ) ) ;
    public final void rule__FeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1465:1: ( ( ( rule__FeatureDefinition__Alternatives_1 ) ) )
            // InternalAlf.g:1466:1: ( ( rule__FeatureDefinition__Alternatives_1 ) )
            {
            // InternalAlf.g:1466:1: ( ( rule__FeatureDefinition__Alternatives_1 ) )
            // InternalAlf.g:1467:2: ( rule__FeatureDefinition__Alternatives_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1()); 
            // InternalAlf.g:1468:2: ( rule__FeatureDefinition__Alternatives_1 )
            // InternalAlf.g:1468:3: rule__FeatureDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__FeatureDefinition__Group_1_0__0"
    // InternalAlf.g:1477:1: rule__FeatureDefinition__Group_1_0__0 : rule__FeatureDefinition__Group_1_0__0__Impl rule__FeatureDefinition__Group_1_0__1 ;
    public final void rule__FeatureDefinition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1481:1: ( rule__FeatureDefinition__Group_1_0__0__Impl rule__FeatureDefinition__Group_1_0__1 )
            // InternalAlf.g:1482:2: rule__FeatureDefinition__Group_1_0__0__Impl rule__FeatureDefinition__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
            rule__FeatureDefinition__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0__0__Impl"
    // InternalAlf.g:1489:1: rule__FeatureDefinition__Group_1_0__0__Impl : ( ( rule__FeatureDefinition__NameAssignment_1_0_0 ) ) ;
    public final void rule__FeatureDefinition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1493:1: ( ( ( rule__FeatureDefinition__NameAssignment_1_0_0 ) ) )
            // InternalAlf.g:1494:1: ( ( rule__FeatureDefinition__NameAssignment_1_0_0 ) )
            {
            // InternalAlf.g:1494:1: ( ( rule__FeatureDefinition__NameAssignment_1_0_0 ) )
            // InternalAlf.g:1495:2: ( rule__FeatureDefinition__NameAssignment_1_0_0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1_0_0()); 
            // InternalAlf.g:1496:2: ( rule__FeatureDefinition__NameAssignment_1_0_0 )
            // InternalAlf.g:1496:3: rule__FeatureDefinition__NameAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__NameAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0__1"
    // InternalAlf.g:1504:1: rule__FeatureDefinition__Group_1_0__1 : rule__FeatureDefinition__Group_1_0__1__Impl rule__FeatureDefinition__Group_1_0__2 ;
    public final void rule__FeatureDefinition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1508:1: ( rule__FeatureDefinition__Group_1_0__1__Impl rule__FeatureDefinition__Group_1_0__2 )
            // InternalAlf.g:1509:2: rule__FeatureDefinition__Group_1_0__1__Impl rule__FeatureDefinition__Group_1_0__2
            {
            pushFollow(FOLLOW_15);
            rule__FeatureDefinition__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0__2();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0__1__Impl"
    // InternalAlf.g:1516:1: rule__FeatureDefinition__Group_1_0__1__Impl : ( ( rule__FeatureDefinition__Group_1_0_1__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1520:1: ( ( ( rule__FeatureDefinition__Group_1_0_1__0 )? ) )
            // InternalAlf.g:1521:1: ( ( rule__FeatureDefinition__Group_1_0_1__0 )? )
            {
            // InternalAlf.g:1521:1: ( ( rule__FeatureDefinition__Group_1_0_1__0 )? )
            // InternalAlf.g:1522:2: ( rule__FeatureDefinition__Group_1_0_1__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0_1()); 
            // InternalAlf.g:1523:2: ( rule__FeatureDefinition__Group_1_0_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlf.g:1523:3: rule__FeatureDefinition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0__2"
    // InternalAlf.g:1531:1: rule__FeatureDefinition__Group_1_0__2 : rule__FeatureDefinition__Group_1_0__2__Impl rule__FeatureDefinition__Group_1_0__3 ;
    public final void rule__FeatureDefinition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1535:1: ( rule__FeatureDefinition__Group_1_0__2__Impl rule__FeatureDefinition__Group_1_0__3 )
            // InternalAlf.g:1536:2: rule__FeatureDefinition__Group_1_0__2__Impl rule__FeatureDefinition__Group_1_0__3
            {
            pushFollow(FOLLOW_15);
            rule__FeatureDefinition__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0__3();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0__2__Impl"
    // InternalAlf.g:1543:1: rule__FeatureDefinition__Group_1_0__2__Impl : ( ( rule__FeatureDefinition__Group_1_0_2__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1547:1: ( ( ( rule__FeatureDefinition__Group_1_0_2__0 )? ) )
            // InternalAlf.g:1548:1: ( ( rule__FeatureDefinition__Group_1_0_2__0 )? )
            {
            // InternalAlf.g:1548:1: ( ( rule__FeatureDefinition__Group_1_0_2__0 )? )
            // InternalAlf.g:1549:2: ( rule__FeatureDefinition__Group_1_0_2__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0_2()); 
            // InternalAlf.g:1550:2: ( rule__FeatureDefinition__Group_1_0_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:1550:3: rule__FeatureDefinition__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0__3"
    // InternalAlf.g:1558:1: rule__FeatureDefinition__Group_1_0__3 : rule__FeatureDefinition__Group_1_0__3__Impl ;
    public final void rule__FeatureDefinition__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1562:1: ( rule__FeatureDefinition__Group_1_0__3__Impl )
            // InternalAlf.g:1563:2: rule__FeatureDefinition__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0__3__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0__3"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0__3__Impl"
    // InternalAlf.g:1569:1: rule__FeatureDefinition__Group_1_0__3__Impl : ( ( rule__FeatureDefinition__Alternatives_1_0_3 ) ) ;
    public final void rule__FeatureDefinition__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1573:1: ( ( ( rule__FeatureDefinition__Alternatives_1_0_3 ) ) )
            // InternalAlf.g:1574:1: ( ( rule__FeatureDefinition__Alternatives_1_0_3 ) )
            {
            // InternalAlf.g:1574:1: ( ( rule__FeatureDefinition__Alternatives_1_0_3 ) )
            // InternalAlf.g:1575:2: ( rule__FeatureDefinition__Alternatives_1_0_3 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1_0_3()); 
            // InternalAlf.g:1576:2: ( rule__FeatureDefinition__Alternatives_1_0_3 )
            // InternalAlf.g:1576:3: rule__FeatureDefinition__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Alternatives_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1__0"
    // InternalAlf.g:1585:1: rule__FeatureDefinition__Group_1_0_1__0 : rule__FeatureDefinition__Group_1_0_1__0__Impl rule__FeatureDefinition__Group_1_0_1__1 ;
    public final void rule__FeatureDefinition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1589:1: ( rule__FeatureDefinition__Group_1_0_1__0__Impl rule__FeatureDefinition__Group_1_0_1__1 )
            // InternalAlf.g:1590:2: rule__FeatureDefinition__Group_1_0_1__0__Impl rule__FeatureDefinition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FeatureDefinition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_1__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1__0__Impl"
    // InternalAlf.g:1597:1: rule__FeatureDefinition__Group_1_0_1__0__Impl : ( ':' ) ;
    public final void rule__FeatureDefinition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1601:1: ( ( ':' ) )
            // InternalAlf.g:1602:1: ( ':' )
            {
            // InternalAlf.g:1602:1: ( ':' )
            // InternalAlf.g:1603:2: ':'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getColonKeyword_1_0_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getColonKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1__1"
    // InternalAlf.g:1612:1: rule__FeatureDefinition__Group_1_0_1__1 : rule__FeatureDefinition__Group_1_0_1__1__Impl rule__FeatureDefinition__Group_1_0_1__2 ;
    public final void rule__FeatureDefinition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1616:1: ( rule__FeatureDefinition__Group_1_0_1__1__Impl rule__FeatureDefinition__Group_1_0_1__2 )
            // InternalAlf.g:1617:2: rule__FeatureDefinition__Group_1_0_1__1__Impl rule__FeatureDefinition__Group_1_0_1__2
            {
            pushFollow(FOLLOW_16);
            rule__FeatureDefinition__Group_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_1__2();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1__1__Impl"
    // InternalAlf.g:1624:1: rule__FeatureDefinition__Group_1_0_1__1__Impl : ( ( rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1 ) ) ;
    public final void rule__FeatureDefinition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1628:1: ( ( ( rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1 ) ) )
            // InternalAlf.g:1629:1: ( ( rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1 ) )
            {
            // InternalAlf.g:1629:1: ( ( rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1 ) )
            // InternalAlf.g:1630:2: ( rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeAssignment_1_0_1_1()); 
            // InternalAlf.g:1631:2: ( rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1 )
            // InternalAlf.g:1631:3: rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1__2"
    // InternalAlf.g:1639:1: rule__FeatureDefinition__Group_1_0_1__2 : rule__FeatureDefinition__Group_1_0_1__2__Impl ;
    public final void rule__FeatureDefinition__Group_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1643:1: ( rule__FeatureDefinition__Group_1_0_1__2__Impl )
            // InternalAlf.g:1644:2: rule__FeatureDefinition__Group_1_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_1__2__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1__2__Impl"
    // InternalAlf.g:1650:1: rule__FeatureDefinition__Group_1_0_1__2__Impl : ( ( rule__FeatureDefinition__Group_1_0_1_2__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1654:1: ( ( ( rule__FeatureDefinition__Group_1_0_1_2__0 )? ) )
            // InternalAlf.g:1655:1: ( ( rule__FeatureDefinition__Group_1_0_1_2__0 )? )
            {
            // InternalAlf.g:1655:1: ( ( rule__FeatureDefinition__Group_1_0_1_2__0 )? )
            // InternalAlf.g:1656:2: ( rule__FeatureDefinition__Group_1_0_1_2__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0_1_2()); 
            // InternalAlf.g:1657:2: ( rule__FeatureDefinition__Group_1_0_1_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1657:3: rule__FeatureDefinition__Group_1_0_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_0_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1_2__0"
    // InternalAlf.g:1666:1: rule__FeatureDefinition__Group_1_0_1_2__0 : rule__FeatureDefinition__Group_1_0_1_2__0__Impl rule__FeatureDefinition__Group_1_0_1_2__1 ;
    public final void rule__FeatureDefinition__Group_1_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1670:1: ( rule__FeatureDefinition__Group_1_0_1_2__0__Impl rule__FeatureDefinition__Group_1_0_1_2__1 )
            // InternalAlf.g:1671:2: rule__FeatureDefinition__Group_1_0_1_2__0__Impl rule__FeatureDefinition__Group_1_0_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__FeatureDefinition__Group_1_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_1_2__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1_2__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1_2__0__Impl"
    // InternalAlf.g:1678:1: rule__FeatureDefinition__Group_1_0_1_2__0__Impl : ( 'is' ) ;
    public final void rule__FeatureDefinition__Group_1_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1682:1: ( ( 'is' ) )
            // InternalAlf.g:1683:1: ( 'is' )
            {
            // InternalAlf.g:1683:1: ( 'is' )
            // InternalAlf.g:1684:2: 'is'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getIsKeyword_1_0_1_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getIsKeyword_1_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1_2__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1_2__1"
    // InternalAlf.g:1693:1: rule__FeatureDefinition__Group_1_0_1_2__1 : rule__FeatureDefinition__Group_1_0_1_2__1__Impl ;
    public final void rule__FeatureDefinition__Group_1_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1697:1: ( rule__FeatureDefinition__Group_1_0_1_2__1__Impl )
            // InternalAlf.g:1698:2: rule__FeatureDefinition__Group_1_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_1_2__1__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1_2__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_1_2__1__Impl"
    // InternalAlf.g:1704:1: rule__FeatureDefinition__Group_1_0_1_2__1__Impl : ( ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1 ) ) ;
    public final void rule__FeatureDefinition__Group_1_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1708:1: ( ( ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1 ) ) )
            // InternalAlf.g:1709:1: ( ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1 ) )
            {
            // InternalAlf.g:1709:1: ( ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1 ) )
            // InternalAlf.g:1710:2: ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureAssignment_1_0_1_2_1()); 
            // InternalAlf.g:1711:2: ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1 )
            // InternalAlf.g:1711:3: rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureAssignment_1_0_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_1_2__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2__0"
    // InternalAlf.g:1720:1: rule__FeatureDefinition__Group_1_0_2__0 : rule__FeatureDefinition__Group_1_0_2__0__Impl rule__FeatureDefinition__Group_1_0_2__1 ;
    public final void rule__FeatureDefinition__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1724:1: ( rule__FeatureDefinition__Group_1_0_2__0__Impl rule__FeatureDefinition__Group_1_0_2__1 )
            // InternalAlf.g:1725:2: rule__FeatureDefinition__Group_1_0_2__0__Impl rule__FeatureDefinition__Group_1_0_2__1
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_2__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2__0__Impl"
    // InternalAlf.g:1732:1: rule__FeatureDefinition__Group_1_0_2__0__Impl : ( '[' ) ;
    public final void rule__FeatureDefinition__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1736:1: ( ( '[' ) )
            // InternalAlf.g:1737:1: ( '[' )
            {
            // InternalAlf.g:1737:1: ( '[' )
            // InternalAlf.g:1738:2: '['
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2__1"
    // InternalAlf.g:1747:1: rule__FeatureDefinition__Group_1_0_2__1 : rule__FeatureDefinition__Group_1_0_2__1__Impl rule__FeatureDefinition__Group_1_0_2__2 ;
    public final void rule__FeatureDefinition__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1751:1: ( rule__FeatureDefinition__Group_1_0_2__1__Impl rule__FeatureDefinition__Group_1_0_2__2 )
            // InternalAlf.g:1752:2: rule__FeatureDefinition__Group_1_0_2__1__Impl rule__FeatureDefinition__Group_1_0_2__2
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_1_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_2__2();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2__1__Impl"
    // InternalAlf.g:1759:1: rule__FeatureDefinition__Group_1_0_2__1__Impl : ( ( rule__FeatureDefinition__Group_1_0_2_1__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1763:1: ( ( ( rule__FeatureDefinition__Group_1_0_2_1__0 )? ) )
            // InternalAlf.g:1764:1: ( ( rule__FeatureDefinition__Group_1_0_2_1__0 )? )
            {
            // InternalAlf.g:1764:1: ( ( rule__FeatureDefinition__Group_1_0_2_1__0 )? )
            // InternalAlf.g:1765:2: ( rule__FeatureDefinition__Group_1_0_2_1__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0_2_1()); 
            // InternalAlf.g:1766:2: ( rule__FeatureDefinition__Group_1_0_2_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NATURAL_VALUE) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==31) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalAlf.g:1766:3: rule__FeatureDefinition__Group_1_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_0_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2__2"
    // InternalAlf.g:1774:1: rule__FeatureDefinition__Group_1_0_2__2 : rule__FeatureDefinition__Group_1_0_2__2__Impl rule__FeatureDefinition__Group_1_0_2__3 ;
    public final void rule__FeatureDefinition__Group_1_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1778:1: ( rule__FeatureDefinition__Group_1_0_2__2__Impl rule__FeatureDefinition__Group_1_0_2__3 )
            // InternalAlf.g:1779:2: rule__FeatureDefinition__Group_1_0_2__2__Impl rule__FeatureDefinition__Group_1_0_2__3
            {
            pushFollow(FOLLOW_18);
            rule__FeatureDefinition__Group_1_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_2__3();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2__2__Impl"
    // InternalAlf.g:1786:1: rule__FeatureDefinition__Group_1_0_2__2__Impl : ( ( rule__FeatureDefinition__UpperAssignment_1_0_2_2 ) ) ;
    public final void rule__FeatureDefinition__Group_1_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1790:1: ( ( ( rule__FeatureDefinition__UpperAssignment_1_0_2_2 ) ) )
            // InternalAlf.g:1791:1: ( ( rule__FeatureDefinition__UpperAssignment_1_0_2_2 ) )
            {
            // InternalAlf.g:1791:1: ( ( rule__FeatureDefinition__UpperAssignment_1_0_2_2 ) )
            // InternalAlf.g:1792:2: ( rule__FeatureDefinition__UpperAssignment_1_0_2_2 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_0_2_2()); 
            // InternalAlf.g:1793:2: ( rule__FeatureDefinition__UpperAssignment_1_0_2_2 )
            // InternalAlf.g:1793:3: rule__FeatureDefinition__UpperAssignment_1_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__UpperAssignment_1_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2__3"
    // InternalAlf.g:1801:1: rule__FeatureDefinition__Group_1_0_2__3 : rule__FeatureDefinition__Group_1_0_2__3__Impl ;
    public final void rule__FeatureDefinition__Group_1_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1805:1: ( rule__FeatureDefinition__Group_1_0_2__3__Impl )
            // InternalAlf.g:1806:2: rule__FeatureDefinition__Group_1_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_2__3__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2__3"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2__3__Impl"
    // InternalAlf.g:1812:1: rule__FeatureDefinition__Group_1_0_2__3__Impl : ( ']' ) ;
    public final void rule__FeatureDefinition__Group_1_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1816:1: ( ( ']' ) )
            // InternalAlf.g:1817:1: ( ']' )
            {
            // InternalAlf.g:1817:1: ( ']' )
            // InternalAlf.g:1818:2: ']'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_2_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2_1__0"
    // InternalAlf.g:1828:1: rule__FeatureDefinition__Group_1_0_2_1__0 : rule__FeatureDefinition__Group_1_0_2_1__0__Impl rule__FeatureDefinition__Group_1_0_2_1__1 ;
    public final void rule__FeatureDefinition__Group_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1832:1: ( rule__FeatureDefinition__Group_1_0_2_1__0__Impl rule__FeatureDefinition__Group_1_0_2_1__1 )
            // InternalAlf.g:1833:2: rule__FeatureDefinition__Group_1_0_2_1__0__Impl rule__FeatureDefinition__Group_1_0_2_1__1
            {
            pushFollow(FOLLOW_19);
            rule__FeatureDefinition__Group_1_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_2_1__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2_1__0__Impl"
    // InternalAlf.g:1840:1: rule__FeatureDefinition__Group_1_0_2_1__0__Impl : ( ( rule__FeatureDefinition__LowerAssignment_1_0_2_1_0 ) ) ;
    public final void rule__FeatureDefinition__Group_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1844:1: ( ( ( rule__FeatureDefinition__LowerAssignment_1_0_2_1_0 ) ) )
            // InternalAlf.g:1845:1: ( ( rule__FeatureDefinition__LowerAssignment_1_0_2_1_0 ) )
            {
            // InternalAlf.g:1845:1: ( ( rule__FeatureDefinition__LowerAssignment_1_0_2_1_0 ) )
            // InternalAlf.g:1846:2: ( rule__FeatureDefinition__LowerAssignment_1_0_2_1_0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_0_2_1_0()); 
            // InternalAlf.g:1847:2: ( rule__FeatureDefinition__LowerAssignment_1_0_2_1_0 )
            // InternalAlf.g:1847:3: rule__FeatureDefinition__LowerAssignment_1_0_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__LowerAssignment_1_0_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2_1__1"
    // InternalAlf.g:1855:1: rule__FeatureDefinition__Group_1_0_2_1__1 : rule__FeatureDefinition__Group_1_0_2_1__1__Impl ;
    public final void rule__FeatureDefinition__Group_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1859:1: ( rule__FeatureDefinition__Group_1_0_2_1__1__Impl )
            // InternalAlf.g:1860:2: rule__FeatureDefinition__Group_1_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_0_2_1__1__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_0_2_1__1__Impl"
    // InternalAlf.g:1866:1: rule__FeatureDefinition__Group_1_0_2_1__1__Impl : ( '..' ) ;
    public final void rule__FeatureDefinition__Group_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1870:1: ( ( '..' ) )
            // InternalAlf.g:1871:1: ( '..' )
            {
            // InternalAlf.g:1871:1: ( '..' )
            // InternalAlf.g:1872:2: '..'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_2_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_0_2_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1__0"
    // InternalAlf.g:1882:1: rule__FeatureDefinition__Group_1_1__0 : rule__FeatureDefinition__Group_1_1__0__Impl rule__FeatureDefinition__Group_1_1__1 ;
    public final void rule__FeatureDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1886:1: ( rule__FeatureDefinition__Group_1_1__0__Impl rule__FeatureDefinition__Group_1_1__1 )
            // InternalAlf.g:1887:2: rule__FeatureDefinition__Group_1_1__0__Impl rule__FeatureDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__FeatureDefinition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1__0__Impl"
    // InternalAlf.g:1894:1: rule__FeatureDefinition__Group_1_1__0__Impl : ( ( rule__FeatureDefinition__NameAssignment_1_1_0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1898:1: ( ( ( rule__FeatureDefinition__NameAssignment_1_1_0 )? ) )
            // InternalAlf.g:1899:1: ( ( rule__FeatureDefinition__NameAssignment_1_1_0 )? )
            {
            // InternalAlf.g:1899:1: ( ( rule__FeatureDefinition__NameAssignment_1_1_0 )? )
            // InternalAlf.g:1900:2: ( rule__FeatureDefinition__NameAssignment_1_1_0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1_1_0()); 
            // InternalAlf.g:1901:2: ( rule__FeatureDefinition__NameAssignment_1_1_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1901:3: rule__FeatureDefinition__NameAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__NameAssignment_1_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1__1"
    // InternalAlf.g:1909:1: rule__FeatureDefinition__Group_1_1__1 : rule__FeatureDefinition__Group_1_1__1__Impl rule__FeatureDefinition__Group_1_1__2 ;
    public final void rule__FeatureDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1913:1: ( rule__FeatureDefinition__Group_1_1__1__Impl rule__FeatureDefinition__Group_1_1__2 )
            // InternalAlf.g:1914:2: rule__FeatureDefinition__Group_1_1__1__Impl rule__FeatureDefinition__Group_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__FeatureDefinition__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1__2();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1__1__Impl"
    // InternalAlf.g:1921:1: rule__FeatureDefinition__Group_1_1__1__Impl : ( 'is' ) ;
    public final void rule__FeatureDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1925:1: ( ( 'is' ) )
            // InternalAlf.g:1926:1: ( 'is' )
            {
            // InternalAlf.g:1926:1: ( 'is' )
            // InternalAlf.g:1927:2: 'is'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getIsKeyword_1_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getIsKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1__2"
    // InternalAlf.g:1936:1: rule__FeatureDefinition__Group_1_1__2 : rule__FeatureDefinition__Group_1_1__2__Impl rule__FeatureDefinition__Group_1_1__3 ;
    public final void rule__FeatureDefinition__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1940:1: ( rule__FeatureDefinition__Group_1_1__2__Impl rule__FeatureDefinition__Group_1_1__3 )
            // InternalAlf.g:1941:2: rule__FeatureDefinition__Group_1_1__2__Impl rule__FeatureDefinition__Group_1_1__3
            {
            pushFollow(FOLLOW_15);
            rule__FeatureDefinition__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1__3();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1__2__Impl"
    // InternalAlf.g:1948:1: rule__FeatureDefinition__Group_1_1__2__Impl : ( ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2 ) ) ;
    public final void rule__FeatureDefinition__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1952:1: ( ( ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2 ) ) )
            // InternalAlf.g:1953:1: ( ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2 ) )
            {
            // InternalAlf.g:1953:1: ( ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2 ) )
            // InternalAlf.g:1954:2: ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureAssignment_1_1_2()); 
            // InternalAlf.g:1955:2: ( rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2 )
            // InternalAlf.g:1955:3: rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1__3"
    // InternalAlf.g:1963:1: rule__FeatureDefinition__Group_1_1__3 : rule__FeatureDefinition__Group_1_1__3__Impl ;
    public final void rule__FeatureDefinition__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1967:1: ( rule__FeatureDefinition__Group_1_1__3__Impl )
            // InternalAlf.g:1968:2: rule__FeatureDefinition__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1__3__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1__3"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1__3__Impl"
    // InternalAlf.g:1974:1: rule__FeatureDefinition__Group_1_1__3__Impl : ( ( rule__FeatureDefinition__Alternatives_1_1_3 ) ) ;
    public final void rule__FeatureDefinition__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1978:1: ( ( ( rule__FeatureDefinition__Alternatives_1_1_3 ) ) )
            // InternalAlf.g:1979:1: ( ( rule__FeatureDefinition__Alternatives_1_1_3 ) )
            {
            // InternalAlf.g:1979:1: ( ( rule__FeatureDefinition__Alternatives_1_1_3 ) )
            // InternalAlf.g:1980:2: ( rule__FeatureDefinition__Alternatives_1_1_3 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1_1_3()); 
            // InternalAlf.g:1981:2: ( rule__FeatureDefinition__Alternatives_1_1_3 )
            // InternalAlf.g:1981:3: rule__FeatureDefinition__Alternatives_1_1_3
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Alternatives_1_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0__0"
    // InternalAlf.g:1990:1: rule__FeatureDefinition__Group_1_1_3_0__0 : rule__FeatureDefinition__Group_1_1_3_0__0__Impl rule__FeatureDefinition__Group_1_1_3_0__1 ;
    public final void rule__FeatureDefinition__Group_1_1_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1994:1: ( rule__FeatureDefinition__Group_1_1_3_0__0__Impl rule__FeatureDefinition__Group_1_1_3_0__1 )
            // InternalAlf.g:1995:2: rule__FeatureDefinition__Group_1_1_3_0__0__Impl rule__FeatureDefinition__Group_1_1_3_0__1
            {
            pushFollow(FOLLOW_15);
            rule__FeatureDefinition__Group_1_1_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_0__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0__0__Impl"
    // InternalAlf.g:2002:1: rule__FeatureDefinition__Group_1_1_3_0__0__Impl : ( ( rule__FeatureDefinition__Group_1_1_3_0_0__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2006:1: ( ( ( rule__FeatureDefinition__Group_1_1_3_0_0__0 )? ) )
            // InternalAlf.g:2007:1: ( ( rule__FeatureDefinition__Group_1_1_3_0_0__0 )? )
            {
            // InternalAlf.g:2007:1: ( ( rule__FeatureDefinition__Group_1_1_3_0_0__0 )? )
            // InternalAlf.g:2008:2: ( rule__FeatureDefinition__Group_1_1_3_0_0__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_0_0()); 
            // InternalAlf.g:2009:2: ( rule__FeatureDefinition__Group_1_1_3_0_0__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:2009:3: rule__FeatureDefinition__Group_1_1_3_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_1_3_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0__1"
    // InternalAlf.g:2017:1: rule__FeatureDefinition__Group_1_1_3_0__1 : rule__FeatureDefinition__Group_1_1_3_0__1__Impl ;
    public final void rule__FeatureDefinition__Group_1_1_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2021:1: ( rule__FeatureDefinition__Group_1_1_3_0__1__Impl )
            // InternalAlf.g:2022:2: rule__FeatureDefinition__Group_1_1_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_0__1__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0__1__Impl"
    // InternalAlf.g:2028:1: rule__FeatureDefinition__Group_1_1_3_0__1__Impl : ( ( rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1 ) ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2032:1: ( ( ( rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1 ) ) )
            // InternalAlf.g:2033:1: ( ( rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1 ) )
            {
            // InternalAlf.g:2033:1: ( ( rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1 ) )
            // InternalAlf.g:2034:2: ( rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAssignment_1_1_3_0_1()); 
            // InternalAlf.g:2035:2: ( rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1 )
            // InternalAlf.g:2035:3: rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAssignment_1_1_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0__0"
    // InternalAlf.g:2044:1: rule__FeatureDefinition__Group_1_1_3_0_0__0 : rule__FeatureDefinition__Group_1_1_3_0_0__0__Impl rule__FeatureDefinition__Group_1_1_3_0_0__1 ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2048:1: ( rule__FeatureDefinition__Group_1_1_3_0_0__0__Impl rule__FeatureDefinition__Group_1_1_3_0_0__1 )
            // InternalAlf.g:2049:2: rule__FeatureDefinition__Group_1_1_3_0_0__0__Impl rule__FeatureDefinition__Group_1_1_3_0_0__1
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_1_1_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_0_0__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0__0__Impl"
    // InternalAlf.g:2056:1: rule__FeatureDefinition__Group_1_1_3_0_0__0__Impl : ( '[' ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2060:1: ( ( '[' ) )
            // InternalAlf.g:2061:1: ( '[' )
            {
            // InternalAlf.g:2061:1: ( '[' )
            // InternalAlf.g:2062:2: '['
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_3_0_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0__1"
    // InternalAlf.g:2071:1: rule__FeatureDefinition__Group_1_1_3_0_0__1 : rule__FeatureDefinition__Group_1_1_3_0_0__1__Impl rule__FeatureDefinition__Group_1_1_3_0_0__2 ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2075:1: ( rule__FeatureDefinition__Group_1_1_3_0_0__1__Impl rule__FeatureDefinition__Group_1_1_3_0_0__2 )
            // InternalAlf.g:2076:2: rule__FeatureDefinition__Group_1_1_3_0_0__1__Impl rule__FeatureDefinition__Group_1_1_3_0_0__2
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_1_1_3_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_0_0__2();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0__1__Impl"
    // InternalAlf.g:2083:1: rule__FeatureDefinition__Group_1_1_3_0_0__1__Impl : ( ( rule__FeatureDefinition__Group_1_1_3_0_0_1__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2087:1: ( ( ( rule__FeatureDefinition__Group_1_1_3_0_0_1__0 )? ) )
            // InternalAlf.g:2088:1: ( ( rule__FeatureDefinition__Group_1_1_3_0_0_1__0 )? )
            {
            // InternalAlf.g:2088:1: ( ( rule__FeatureDefinition__Group_1_1_3_0_0_1__0 )? )
            // InternalAlf.g:2089:2: ( rule__FeatureDefinition__Group_1_1_3_0_0_1__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_0_0_1()); 
            // InternalAlf.g:2090:2: ( rule__FeatureDefinition__Group_1_1_3_0_0_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NATURAL_VALUE) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==31) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:2090:3: rule__FeatureDefinition__Group_1_1_3_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_1_3_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0__2"
    // InternalAlf.g:2098:1: rule__FeatureDefinition__Group_1_1_3_0_0__2 : rule__FeatureDefinition__Group_1_1_3_0_0__2__Impl rule__FeatureDefinition__Group_1_1_3_0_0__3 ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2102:1: ( rule__FeatureDefinition__Group_1_1_3_0_0__2__Impl rule__FeatureDefinition__Group_1_1_3_0_0__3 )
            // InternalAlf.g:2103:2: rule__FeatureDefinition__Group_1_1_3_0_0__2__Impl rule__FeatureDefinition__Group_1_1_3_0_0__3
            {
            pushFollow(FOLLOW_18);
            rule__FeatureDefinition__Group_1_1_3_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_0_0__3();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0__2__Impl"
    // InternalAlf.g:2110:1: rule__FeatureDefinition__Group_1_1_3_0_0__2__Impl : ( ( rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2 ) ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2114:1: ( ( ( rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2 ) ) )
            // InternalAlf.g:2115:1: ( ( rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2 ) )
            {
            // InternalAlf.g:2115:1: ( ( rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2 ) )
            // InternalAlf.g:2116:2: ( rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_1_3_0_0_2()); 
            // InternalAlf.g:2117:2: ( rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2 )
            // InternalAlf.g:2117:3: rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_1_3_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0__3"
    // InternalAlf.g:2125:1: rule__FeatureDefinition__Group_1_1_3_0_0__3 : rule__FeatureDefinition__Group_1_1_3_0_0__3__Impl ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2129:1: ( rule__FeatureDefinition__Group_1_1_3_0_0__3__Impl )
            // InternalAlf.g:2130:2: rule__FeatureDefinition__Group_1_1_3_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_0_0__3__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0__3"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0__3__Impl"
    // InternalAlf.g:2136:1: rule__FeatureDefinition__Group_1_1_3_0_0__3__Impl : ( ']' ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2140:1: ( ( ']' ) )
            // InternalAlf.g:2141:1: ( ']' )
            {
            // InternalAlf.g:2141:1: ( ']' )
            // InternalAlf.g:2142:2: ']'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3_0_0_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0_1__0"
    // InternalAlf.g:2152:1: rule__FeatureDefinition__Group_1_1_3_0_0_1__0 : rule__FeatureDefinition__Group_1_1_3_0_0_1__0__Impl rule__FeatureDefinition__Group_1_1_3_0_0_1__1 ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2156:1: ( rule__FeatureDefinition__Group_1_1_3_0_0_1__0__Impl rule__FeatureDefinition__Group_1_1_3_0_0_1__1 )
            // InternalAlf.g:2157:2: rule__FeatureDefinition__Group_1_1_3_0_0_1__0__Impl rule__FeatureDefinition__Group_1_1_3_0_0_1__1
            {
            pushFollow(FOLLOW_19);
            rule__FeatureDefinition__Group_1_1_3_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_0_0_1__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0_1__0__Impl"
    // InternalAlf.g:2164:1: rule__FeatureDefinition__Group_1_1_3_0_0_1__0__Impl : ( ( rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0 ) ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2168:1: ( ( ( rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0 ) ) )
            // InternalAlf.g:2169:1: ( ( rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0 ) )
            {
            // InternalAlf.g:2169:1: ( ( rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0 ) )
            // InternalAlf.g:2170:2: ( rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_1_3_0_0_1_0()); 
            // InternalAlf.g:2171:2: ( rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0 )
            // InternalAlf.g:2171:3: rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_1_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0_1__1"
    // InternalAlf.g:2179:1: rule__FeatureDefinition__Group_1_1_3_0_0_1__1 : rule__FeatureDefinition__Group_1_1_3_0_0_1__1__Impl ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2183:1: ( rule__FeatureDefinition__Group_1_1_3_0_0_1__1__Impl )
            // InternalAlf.g:2184:2: rule__FeatureDefinition__Group_1_1_3_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_0_0_1__1__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_0_0_1__1__Impl"
    // InternalAlf.g:2190:1: rule__FeatureDefinition__Group_1_1_3_0_0_1__1__Impl : ( '..' ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2194:1: ( ( '..' ) )
            // InternalAlf.g:2195:1: ( '..' )
            {
            // InternalAlf.g:2195:1: ( '..' )
            // InternalAlf.g:2196:2: '..'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_3_0_0_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_3_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_0_0_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__0"
    // InternalAlf.g:2206:1: rule__FeatureDefinition__Group_1_1_3_1__0 : rule__FeatureDefinition__Group_1_1_3_1__0__Impl rule__FeatureDefinition__Group_1_1_3_1__1 ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2210:1: ( rule__FeatureDefinition__Group_1_1_3_1__0__Impl rule__FeatureDefinition__Group_1_1_3_1__1 )
            // InternalAlf.g:2211:2: rule__FeatureDefinition__Group_1_1_3_1__0__Impl rule__FeatureDefinition__Group_1_1_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_1_1_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_1__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__0__Impl"
    // InternalAlf.g:2218:1: rule__FeatureDefinition__Group_1_1_3_1__0__Impl : ( '[' ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2222:1: ( ( '[' ) )
            // InternalAlf.g:2223:1: ( '[' )
            {
            // InternalAlf.g:2223:1: ( '[' )
            // InternalAlf.g:2224:2: '['
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_3_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__1"
    // InternalAlf.g:2233:1: rule__FeatureDefinition__Group_1_1_3_1__1 : rule__FeatureDefinition__Group_1_1_3_1__1__Impl rule__FeatureDefinition__Group_1_1_3_1__2 ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2237:1: ( rule__FeatureDefinition__Group_1_1_3_1__1__Impl rule__FeatureDefinition__Group_1_1_3_1__2 )
            // InternalAlf.g:2238:2: rule__FeatureDefinition__Group_1_1_3_1__1__Impl rule__FeatureDefinition__Group_1_1_3_1__2
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_1_1_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_1__2();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__1__Impl"
    // InternalAlf.g:2245:1: rule__FeatureDefinition__Group_1_1_3_1__1__Impl : ( ( rule__FeatureDefinition__Group_1_1_3_1_1__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2249:1: ( ( ( rule__FeatureDefinition__Group_1_1_3_1_1__0 )? ) )
            // InternalAlf.g:2250:1: ( ( rule__FeatureDefinition__Group_1_1_3_1_1__0 )? )
            {
            // InternalAlf.g:2250:1: ( ( rule__FeatureDefinition__Group_1_1_3_1_1__0 )? )
            // InternalAlf.g:2251:2: ( rule__FeatureDefinition__Group_1_1_3_1_1__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_1_1()); 
            // InternalAlf.g:2252:2: ( rule__FeatureDefinition__Group_1_1_3_1_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NATURAL_VALUE) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==31) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:2252:3: rule__FeatureDefinition__Group_1_1_3_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_1_3_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_1_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__2"
    // InternalAlf.g:2260:1: rule__FeatureDefinition__Group_1_1_3_1__2 : rule__FeatureDefinition__Group_1_1_3_1__2__Impl rule__FeatureDefinition__Group_1_1_3_1__3 ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2264:1: ( rule__FeatureDefinition__Group_1_1_3_1__2__Impl rule__FeatureDefinition__Group_1_1_3_1__3 )
            // InternalAlf.g:2265:2: rule__FeatureDefinition__Group_1_1_3_1__2__Impl rule__FeatureDefinition__Group_1_1_3_1__3
            {
            pushFollow(FOLLOW_18);
            rule__FeatureDefinition__Group_1_1_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_1__3();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__2__Impl"
    // InternalAlf.g:2272:1: rule__FeatureDefinition__Group_1_1_3_1__2__Impl : ( ( rule__FeatureDefinition__UpperAssignment_1_1_3_1_2 ) ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2276:1: ( ( ( rule__FeatureDefinition__UpperAssignment_1_1_3_1_2 ) ) )
            // InternalAlf.g:2277:1: ( ( rule__FeatureDefinition__UpperAssignment_1_1_3_1_2 ) )
            {
            // InternalAlf.g:2277:1: ( ( rule__FeatureDefinition__UpperAssignment_1_1_3_1_2 ) )
            // InternalAlf.g:2278:2: ( rule__FeatureDefinition__UpperAssignment_1_1_3_1_2 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_1_3_1_2()); 
            // InternalAlf.g:2279:2: ( rule__FeatureDefinition__UpperAssignment_1_1_3_1_2 )
            // InternalAlf.g:2279:3: rule__FeatureDefinition__UpperAssignment_1_1_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__UpperAssignment_1_1_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_1_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__3"
    // InternalAlf.g:2287:1: rule__FeatureDefinition__Group_1_1_3_1__3 : rule__FeatureDefinition__Group_1_1_3_1__3__Impl rule__FeatureDefinition__Group_1_1_3_1__4 ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2291:1: ( rule__FeatureDefinition__Group_1_1_3_1__3__Impl rule__FeatureDefinition__Group_1_1_3_1__4 )
            // InternalAlf.g:2292:2: rule__FeatureDefinition__Group_1_1_3_1__3__Impl rule__FeatureDefinition__Group_1_1_3_1__4
            {
            pushFollow(FOLLOW_9);
            rule__FeatureDefinition__Group_1_1_3_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_1__4();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__3"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__3__Impl"
    // InternalAlf.g:2299:1: rule__FeatureDefinition__Group_1_1_3_1__3__Impl : ( ']' ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2303:1: ( ( ']' ) )
            // InternalAlf.g:2304:1: ( ']' )
            {
            // InternalAlf.g:2304:1: ( ']' )
            // InternalAlf.g:2305:2: ']'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3_1_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__4"
    // InternalAlf.g:2314:1: rule__FeatureDefinition__Group_1_1_3_1__4 : rule__FeatureDefinition__Group_1_1_3_1__4__Impl ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2318:1: ( rule__FeatureDefinition__Group_1_1_3_1__4__Impl )
            // InternalAlf.g:2319:2: rule__FeatureDefinition__Group_1_1_3_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_1__4__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__4"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1__4__Impl"
    // InternalAlf.g:2325:1: rule__FeatureDefinition__Group_1_1_3_1__4__Impl : ( ';' ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2329:1: ( ( ';' ) )
            // InternalAlf.g:2330:1: ( ';' )
            {
            // InternalAlf.g:2330:1: ( ';' )
            // InternalAlf.g:2331:2: ';'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_1_3_1_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_1_3_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1__4__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1_1__0"
    // InternalAlf.g:2341:1: rule__FeatureDefinition__Group_1_1_3_1_1__0 : rule__FeatureDefinition__Group_1_1_3_1_1__0__Impl rule__FeatureDefinition__Group_1_1_3_1_1__1 ;
    public final void rule__FeatureDefinition__Group_1_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2345:1: ( rule__FeatureDefinition__Group_1_1_3_1_1__0__Impl rule__FeatureDefinition__Group_1_1_3_1_1__1 )
            // InternalAlf.g:2346:2: rule__FeatureDefinition__Group_1_1_3_1_1__0__Impl rule__FeatureDefinition__Group_1_1_3_1_1__1
            {
            pushFollow(FOLLOW_19);
            rule__FeatureDefinition__Group_1_1_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_1_1__1();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1_1__0__Impl"
    // InternalAlf.g:2353:1: rule__FeatureDefinition__Group_1_1_3_1_1__0__Impl : ( ( rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0 ) ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2357:1: ( ( ( rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0 ) ) )
            // InternalAlf.g:2358:1: ( ( rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0 ) )
            {
            // InternalAlf.g:2358:1: ( ( rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0 ) )
            // InternalAlf.g:2359:2: ( rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_1_3_1_1_0()); 
            // InternalAlf.g:2360:2: ( rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0 )
            // InternalAlf.g:2360:3: rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_1_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1_1__1"
    // InternalAlf.g:2368:1: rule__FeatureDefinition__Group_1_1_3_1_1__1 : rule__FeatureDefinition__Group_1_1_3_1_1__1__Impl ;
    public final void rule__FeatureDefinition__Group_1_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2372:1: ( rule__FeatureDefinition__Group_1_1_3_1_1__1__Impl )
            // InternalAlf.g:2373:2: rule__FeatureDefinition__Group_1_1_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_1_3_1_1__1__Impl();

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
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_1_3_1_1__1__Impl"
    // InternalAlf.g:2379:1: rule__FeatureDefinition__Group_1_1_3_1_1__1__Impl : ( '..' ) ;
    public final void rule__FeatureDefinition__Group_1_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2383:1: ( ( '..' ) )
            // InternalAlf.g:2384:1: ( '..' )
            {
            // InternalAlf.g:2384:1: ( '..' )
            // InternalAlf.g:2385:2: '..'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_3_1_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_1_3_1_1__1__Impl"


    // $ANTLR start "rule__AnonymousClassDefinition__Group__0"
    // InternalAlf.g:2395:1: rule__AnonymousClassDefinition__Group__0 : rule__AnonymousClassDefinition__Group__0__Impl rule__AnonymousClassDefinition__Group__1 ;
    public final void rule__AnonymousClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2399:1: ( rule__AnonymousClassDefinition__Group__0__Impl rule__AnonymousClassDefinition__Group__1 )
            // InternalAlf.g:2400:2: rule__AnonymousClassDefinition__Group__0__Impl rule__AnonymousClassDefinition__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AnonymousClassDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousClassDefinition__Group__1();

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
    // $ANTLR end "rule__AnonymousClassDefinition__Group__0"


    // $ANTLR start "rule__AnonymousClassDefinition__Group__0__Impl"
    // InternalAlf.g:2407:1: rule__AnonymousClassDefinition__Group__0__Impl : ( () ) ;
    public final void rule__AnonymousClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2411:1: ( ( () ) )
            // InternalAlf.g:2412:1: ( () )
            {
            // InternalAlf.g:2412:1: ( () )
            // InternalAlf.g:2413:2: ()
            {
             before(grammarAccess.getAnonymousClassDefinitionAccess().getClassAction_0()); 
            // InternalAlf.g:2414:2: ()
            // InternalAlf.g:2414:3: 
            {
            }

             after(grammarAccess.getAnonymousClassDefinitionAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousClassDefinition__Group__0__Impl"


    // $ANTLR start "rule__AnonymousClassDefinition__Group__1"
    // InternalAlf.g:2422:1: rule__AnonymousClassDefinition__Group__1 : rule__AnonymousClassDefinition__Group__1__Impl rule__AnonymousClassDefinition__Group__2 ;
    public final void rule__AnonymousClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2426:1: ( rule__AnonymousClassDefinition__Group__1__Impl rule__AnonymousClassDefinition__Group__2 )
            // InternalAlf.g:2427:2: rule__AnonymousClassDefinition__Group__1__Impl rule__AnonymousClassDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AnonymousClassDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousClassDefinition__Group__2();

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
    // $ANTLR end "rule__AnonymousClassDefinition__Group__1"


    // $ANTLR start "rule__AnonymousClassDefinition__Group__1__Impl"
    // InternalAlf.g:2434:1: rule__AnonymousClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__AnonymousClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2438:1: ( ( '{' ) )
            // InternalAlf.g:2439:1: ( '{' )
            {
            // InternalAlf.g:2439:1: ( '{' )
            // InternalAlf.g:2440:2: '{'
            {
             before(grammarAccess.getAnonymousClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAnonymousClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousClassDefinition__Group__1__Impl"


    // $ANTLR start "rule__AnonymousClassDefinition__Group__2"
    // InternalAlf.g:2449:1: rule__AnonymousClassDefinition__Group__2 : rule__AnonymousClassDefinition__Group__2__Impl rule__AnonymousClassDefinition__Group__3 ;
    public final void rule__AnonymousClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2453:1: ( rule__AnonymousClassDefinition__Group__2__Impl rule__AnonymousClassDefinition__Group__3 )
            // InternalAlf.g:2454:2: rule__AnonymousClassDefinition__Group__2__Impl rule__AnonymousClassDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AnonymousClassDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousClassDefinition__Group__3();

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
    // $ANTLR end "rule__AnonymousClassDefinition__Group__2"


    // $ANTLR start "rule__AnonymousClassDefinition__Group__2__Impl"
    // InternalAlf.g:2461:1: rule__AnonymousClassDefinition__Group__2__Impl : ( ( rule__AnonymousClassDefinition__GroupMemberAssignment_2 )* ) ;
    public final void rule__AnonymousClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2465:1: ( ( ( rule__AnonymousClassDefinition__GroupMemberAssignment_2 )* ) )
            // InternalAlf.g:2466:1: ( ( rule__AnonymousClassDefinition__GroupMemberAssignment_2 )* )
            {
            // InternalAlf.g:2466:1: ( ( rule__AnonymousClassDefinition__GroupMemberAssignment_2 )* )
            // InternalAlf.g:2467:2: ( rule__AnonymousClassDefinition__GroupMemberAssignment_2 )*
            {
             before(grammarAccess.getAnonymousClassDefinitionAccess().getGroupMemberAssignment_2()); 
            // InternalAlf.g:2468:2: ( rule__AnonymousClassDefinition__GroupMemberAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_UNRESTRICTED_NAME)||(LA28_0>=15 && LA28_0<=18)||(LA28_0>=21 && LA28_0<=24)||LA28_0==34) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAlf.g:2468:3: rule__AnonymousClassDefinition__GroupMemberAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AnonymousClassDefinition__GroupMemberAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAnonymousClassDefinitionAccess().getGroupMemberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousClassDefinition__Group__2__Impl"


    // $ANTLR start "rule__AnonymousClassDefinition__Group__3"
    // InternalAlf.g:2476:1: rule__AnonymousClassDefinition__Group__3 : rule__AnonymousClassDefinition__Group__3__Impl ;
    public final void rule__AnonymousClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2480:1: ( rule__AnonymousClassDefinition__Group__3__Impl )
            // InternalAlf.g:2481:2: rule__AnonymousClassDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousClassDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__AnonymousClassDefinition__Group__3"


    // $ANTLR start "rule__AnonymousClassDefinition__Group__3__Impl"
    // InternalAlf.g:2487:1: rule__AnonymousClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__AnonymousClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2491:1: ( ( '}' ) )
            // InternalAlf.g:2492:1: ( '}' )
            {
            // InternalAlf.g:2492:1: ( '}' )
            // InternalAlf.g:2493:2: '}'
            {
             before(grammarAccess.getAnonymousClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAnonymousClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousClassDefinition__Group__3__Impl"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpression__Group_1__0"
    // InternalAlf.g:2503:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0 : rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2507:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 )
            // InternalAlf.g:2508:2: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnlimitedNaturalLiteralExpression__Group_1__1();

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
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpression__Group_1__0"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl"
    // InternalAlf.g:2515:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2519:1: ( ( () ) )
            // InternalAlf.g:2520:1: ( () )
            {
            // InternalAlf.g:2520:1: ( () )
            // InternalAlf.g:2521:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0()); 
            // InternalAlf.g:2522:2: ()
            // InternalAlf.g:2522:3: 
            {
            }

             after(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpression__Group_1__1"
    // InternalAlf.g:2530:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1 : rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2534:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl )
            // InternalAlf.g:2535:2: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpression__Group_1__1"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl"
    // InternalAlf.g:2541:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl : ( '*' ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2545:1: ( ( '*' ) )
            // InternalAlf.g:2546:1: ( '*' )
            {
            // InternalAlf.g:2546:1: ( '*' )
            // InternalAlf.g:2547:2: '*'
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAlf.g:2557:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2561:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:2562:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAlf.g:2569:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2573:1: ( ( ruleName ) )
            // InternalAlf.g:2574:1: ( ruleName )
            {
            // InternalAlf.g:2574:1: ( ruleName )
            // InternalAlf.g:2575:2: ruleName
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
    // InternalAlf.g:2584:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2588:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:2589:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:2595:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2599:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:2600:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:2600:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:2601:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:2602:2: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAlf.g:2602:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalAlf.g:2611:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2615:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:2616:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAlf.g:2623:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2627:1: ( ( '.' ) )
            // InternalAlf.g:2628:1: ( '.' )
            {
            // InternalAlf.g:2628:1: ( '.' )
            // InternalAlf.g:2629:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAlf.g:2638:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2642:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:2643:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAlf.g:2649:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2653:1: ( ( ruleName ) )
            // InternalAlf.g:2654:1: ( ruleName )
            {
            // InternalAlf.g:2654:1: ( ruleName )
            // InternalAlf.g:2655:2: ruleName
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
    // InternalAlf.g:2665:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2669:1: ( ( ruleName ) )
            // InternalAlf.g:2670:2: ( ruleName )
            {
            // InternalAlf.g:2670:2: ( ruleName )
            // InternalAlf.g:2671:3: ruleName
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
    // InternalAlf.g:2680:1: rule__PackageDefinition__GroupMemberAssignment_3 : ( ruleMemberDefinition ) ;
    public final void rule__PackageDefinition__GroupMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2684:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:2685:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:2685:2: ( ruleMemberDefinition )
            // InternalAlf.g:2686:3: ruleMemberDefinition
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
    // InternalAlf.g:2695:1: rule__MemberDefinition__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__MemberDefinition__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2699:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:2700:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:2700:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:2701:3: ruleVisibilityIndicator
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
    // InternalAlf.g:2710:1: rule__MemberDefinition__OwnedMemberElementAssignment_1_0 : ( rulePackagedElementDefinition ) ;
    public final void rule__MemberDefinition__OwnedMemberElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2714:1: ( ( rulePackagedElementDefinition ) )
            // InternalAlf.g:2715:2: ( rulePackagedElementDefinition )
            {
            // InternalAlf.g:2715:2: ( rulePackagedElementDefinition )
            // InternalAlf.g:2716:3: rulePackagedElementDefinition
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
    // InternalAlf.g:2725:1: rule__MemberDefinition__MemberNameAssignment_1_1_1 : ( ruleName ) ;
    public final void rule__MemberDefinition__MemberNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2729:1: ( ( ruleName ) )
            // InternalAlf.g:2730:2: ( ruleName )
            {
            // InternalAlf.g:2730:2: ( ruleName )
            // InternalAlf.g:2731:3: ruleName
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
    // InternalAlf.g:2740:1: rule__MemberDefinition__MemberElementAssignment_1_1_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MemberDefinition__MemberElementAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2744:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2745:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2745:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2746:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberElementElementCrossReference_1_1_3_0()); 
            // InternalAlf.g:2747:3: ( ruleQualifiedName )
            // InternalAlf.g:2748:4: ruleQualifiedName
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
    // InternalAlf.g:2759:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2763:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:2764:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:2764:2: ( ( 'abstract' ) )
            // InternalAlf.g:2765:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:2766:3: ( 'abstract' )
            // InternalAlf.g:2767:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAlf.g:2778:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2782:1: ( ( ruleName ) )
            // InternalAlf.g:2783:2: ( ruleName )
            {
            // InternalAlf.g:2783:2: ( ruleName )
            // InternalAlf.g:2784:3: ruleName
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
    // InternalAlf.g:2793:1: rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedGeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2797:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:2798:2: ( ruleGeneralization )
            {
            // InternalAlf.g:2798:2: ( ruleGeneralization )
            // InternalAlf.g:2799:3: ruleGeneralization
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
    // InternalAlf.g:2808:1: rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedGeneralizationAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2812:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:2813:2: ( ruleGeneralization )
            {
            // InternalAlf.g:2813:2: ( ruleGeneralization )
            // InternalAlf.g:2814:3: ruleGeneralization
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
    // InternalAlf.g:2823:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2827:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2828:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2828:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2829:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:2830:3: ( ruleQualifiedName )
            // InternalAlf.g:2831:4: ruleQualifiedName
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
    // InternalAlf.g:2842:1: rule__ClassDefinition__GroupMemberAssignment_2 : ( ruleMemberDefinition ) ;
    public final void rule__ClassDefinition__GroupMemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2846:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:2847:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:2847:2: ( ruleMemberDefinition )
            // InternalAlf.g:2848:3: ruleMemberDefinition
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


    // $ANTLR start "rule__FeatureDefinition__NameAssignment_1_0_0"
    // InternalAlf.g:2857:1: rule__FeatureDefinition__NameAssignment_1_0_0 : ( ruleName ) ;
    public final void rule__FeatureDefinition__NameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2861:1: ( ( ruleName ) )
            // InternalAlf.g:2862:2: ( ruleName )
            {
            // InternalAlf.g:2862:2: ( ruleName )
            // InternalAlf.g:2863:3: ruleName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__NameAssignment_1_0_0"


    // $ANTLR start "rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1"
    // InternalAlf.g:2872:1: rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2876:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2877:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2877:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2878:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_1_1_0()); 
            // InternalAlf.g:2879:3: ( ruleQualifiedName )
            // InternalAlf.g:2880:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_1_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_1_0_1_1_0_1()); 

            }

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__ReferencedTypeAssignment_1_0_1_1"


    // $ANTLR start "rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1"
    // InternalAlf.g:2891:1: rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2895:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2896:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2896:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2897:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureCrossReference_1_0_1_2_1_0()); 
            // InternalAlf.g:2898:3: ( ruleQualifiedName )
            // InternalAlf.g:2899:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureQualifiedNameParserRuleCall_1_0_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureQualifiedNameParserRuleCall_1_0_1_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureCrossReference_1_0_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__RedefinedFeatureAssignment_1_0_1_2_1"


    // $ANTLR start "rule__FeatureDefinition__LowerAssignment_1_0_2_1_0"
    // InternalAlf.g:2910:1: rule__FeatureDefinition__LowerAssignment_1_0_2_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__LowerAssignment_1_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2914:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:2915:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:2915:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:2916:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__LowerAssignment_1_0_2_1_0"


    // $ANTLR start "rule__FeatureDefinition__UpperAssignment_1_0_2_2"
    // InternalAlf.g:2925:1: rule__FeatureDefinition__UpperAssignment_1_0_2_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__UpperAssignment_1_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2929:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:2930:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:2930:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:2931:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__UpperAssignment_1_0_2_2"


    // $ANTLR start "rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1"
    // InternalAlf.g:2940:1: rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1 : ( ruleAnonymousClassDefinition ) ;
    public final void rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2944:1: ( ( ruleAnonymousClassDefinition ) )
            // InternalAlf.g:2945:2: ( ruleAnonymousClassDefinition )
            {
            // InternalAlf.g:2945:2: ( ruleAnonymousClassDefinition )
            // InternalAlf.g:2946:3: ruleAnonymousClassDefinition
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAnonymousClassDefinitionParserRuleCall_1_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnonymousClassDefinition();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAnonymousClassDefinitionParserRuleCall_1_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__OwnedTypeAssignment_1_0_3_1"


    // $ANTLR start "rule__FeatureDefinition__NameAssignment_1_1_0"
    // InternalAlf.g:2955:1: rule__FeatureDefinition__NameAssignment_1_1_0 : ( ruleName ) ;
    public final void rule__FeatureDefinition__NameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2959:1: ( ( ruleName ) )
            // InternalAlf.g:2960:2: ( ruleName )
            {
            // InternalAlf.g:2960:2: ( ruleName )
            // InternalAlf.g:2961:3: ruleName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__NameAssignment_1_1_0"


    // $ANTLR start "rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2"
    // InternalAlf.g:2970:1: rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2974:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2975:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2975:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2976:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureCrossReference_1_1_2_0()); 
            // InternalAlf.g:2977:3: ( ruleQualifiedName )
            // InternalAlf.g:2978:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureQualifiedNameParserRuleCall_1_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureQualifiedNameParserRuleCall_1_1_2_0_1()); 

            }

             after(grammarAccess.getFeatureDefinitionAccess().getRedefinedFeatureFeatureCrossReference_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__RedefinedFeatureAssignment_1_1_2"


    // $ANTLR start "rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0"
    // InternalAlf.g:2989:1: rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2993:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:2994:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:2994:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:2995:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_3_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_3_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__LowerAssignment_1_1_3_0_0_1_0"


    // $ANTLR start "rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2"
    // InternalAlf.g:3004:1: rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3008:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3009:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3009:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:3010:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_3_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_3_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__UpperAssignment_1_1_3_0_0_2"


    // $ANTLR start "rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1"
    // InternalAlf.g:3019:1: rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1 : ( ruleAnonymousClassDefinition ) ;
    public final void rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3023:1: ( ( ruleAnonymousClassDefinition ) )
            // InternalAlf.g:3024:2: ( ruleAnonymousClassDefinition )
            {
            // InternalAlf.g:3024:2: ( ruleAnonymousClassDefinition )
            // InternalAlf.g:3025:3: ruleAnonymousClassDefinition
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAnonymousClassDefinitionParserRuleCall_1_1_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnonymousClassDefinition();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedTypeAnonymousClassDefinitionParserRuleCall_1_1_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__OwnedTypeAssignment_1_1_3_0_1"


    // $ANTLR start "rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0"
    // InternalAlf.g:3034:1: rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3038:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:3039:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:3039:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:3040:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_3_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__LowerAssignment_1_1_3_1_1_0"


    // $ANTLR start "rule__FeatureDefinition__UpperAssignment_1_1_3_1_2"
    // InternalAlf.g:3049:1: rule__FeatureDefinition__UpperAssignment_1_1_3_1_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__UpperAssignment_1_1_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3053:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3054:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3054:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:3055:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__UpperAssignment_1_1_3_1_2"


    // $ANTLR start "rule__AnonymousClassDefinition__GroupMemberAssignment_2"
    // InternalAlf.g:3064:1: rule__AnonymousClassDefinition__GroupMemberAssignment_2 : ( ruleMemberDefinition ) ;
    public final void rule__AnonymousClassDefinition__GroupMemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3068:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:3069:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:3069:2: ( ruleMemberDefinition )
            // InternalAlf.g:3070:3: ruleMemberDefinition
            {
             before(grammarAccess.getAnonymousClassDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberDefinition();

            state._fsp--;

             after(grammarAccess.getAnonymousClassDefinitionAccess().getGroupMemberMemberDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousClassDefinition__GroupMemberAssignment_2"


    // $ANTLR start "rule__NaturalLiteralExpression__ValueAssignment"
    // InternalAlf.g:3079:1: rule__NaturalLiteralExpression__ValueAssignment : ( RULE_NATURAL_VALUE ) ;
    public final void rule__NaturalLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3083:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:3084:2: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:3084:2: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:3085:3: RULE_NATURAL_VALUE
            {
             before(grammarAccess.getNaturalLiteralExpressionAccess().getValueNATURAL_VALUETerminalRuleCall_0()); 
            match(input,RULE_NATURAL_VALUE,FOLLOW_2); 
             after(grammarAccess.getNaturalLiteralExpressionAccess().getValueNATURAL_VALUETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaturalLiteralExpression__ValueAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\2\4\1\uffff\2\4\2\22\1\uffff\4\22\2\4\4\24\2\4\4\24";
    static final String dfa_3s = "\1\42\1\22\1\uffff\2\22\2\31\1\uffff\2\31\2\35\2\5\4\41\2\5\4\41";
    static final String dfa_4s = "\2\uffff\1\1\4\uffff\1\2\20\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\11\uffff\1\1\1\3\1\4\1\2\17\uffff\1\2",
            "\1\5\1\6\14\uffff\1\7",
            "",
            "\1\10\1\11\14\uffff\1\7",
            "\1\12\1\13\14\uffff\1\14",
            "\1\7\6\uffff\1\2",
            "\1\7\6\uffff\1\2",
            "",
            "\1\15\1\2\5\uffff\1\2",
            "\1\15\1\2\5\uffff\1\2",
            "\1\14\1\uffff\1\2\4\uffff\1\2\2\uffff\2\2",
            "\1\14\1\uffff\1\2\4\uffff\1\2\2\uffff\2\2",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\7\4\uffff\1\2\3\uffff\1\2\3\uffff\1\22",
            "\1\7\4\uffff\1\2\3\uffff\1\2\3\uffff\1\22",
            "\1\7\4\uffff\1\2\1\uffff\1\2\5\uffff\1\23",
            "\1\7\4\uffff\1\2\1\uffff\1\2\5\uffff\1\23",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\7\4\uffff\1\2\3\uffff\1\2\3\uffff\1\22",
            "\1\7\4\uffff\1\2\3\uffff\1\2\3\uffff\1\22",
            "\1\7\4\uffff\1\2\1\uffff\1\2\5\uffff\1\23",
            "\1\7\4\uffff\1\2\1\uffff\1\2\5\uffff\1\23"
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
            return "514:1: rule__MemberDefinition__Alternatives_1 : ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000405E78030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000401E78032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000401E78030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400078030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000032100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});

}