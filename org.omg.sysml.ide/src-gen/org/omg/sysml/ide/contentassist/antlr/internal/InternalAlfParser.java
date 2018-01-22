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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_BOOLEAN_VALUE", "RULE_NATURAL_VALUE", "RULE_STRING", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'public'", "'private'", "'protected'", "'package'", "'{'", "'}'", "'class'", "'specializes'", "':'", "';'", "'::'", "'abstract'"
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
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int RULE_ID=4;
    public static final int RULE_NATURAL_VALUE=7;
    public static final int RULE_WS=14;
    public static final int RULE_INLINE_STATEMENT=11;
    public static final int RULE_UNRESTRICTED_NAME=5;
    public static final int T__26=26;
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



    // $ANTLR start "entryRulePackageDefinition"
    // InternalAlf.g:53:1: entryRulePackageDefinition : rulePackageDefinition EOF ;
    public final void entryRulePackageDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:54:1: ( rulePackageDefinition EOF )
            // InternalAlf.g:55:1: rulePackageDefinition EOF
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
    // InternalAlf.g:62:1: rulePackageDefinition : ( ( rule__PackageDefinition__Group__0 ) ) ;
    public final void rulePackageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:66:2: ( ( ( rule__PackageDefinition__Group__0 ) ) )
            // InternalAlf.g:67:2: ( ( rule__PackageDefinition__Group__0 ) )
            {
            // InternalAlf.g:67:2: ( ( rule__PackageDefinition__Group__0 ) )
            // InternalAlf.g:68:3: ( rule__PackageDefinition__Group__0 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            // InternalAlf.g:69:3: ( rule__PackageDefinition__Group__0 )
            // InternalAlf.g:69:4: rule__PackageDefinition__Group__0
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
    // InternalAlf.g:78:1: entryRulePackageDefinitionOrStub : rulePackageDefinitionOrStub EOF ;
    public final void entryRulePackageDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:79:1: ( rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:80:1: rulePackageDefinitionOrStub EOF
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
    // InternalAlf.g:87:1: rulePackageDefinitionOrStub : ( ( rule__PackageDefinitionOrStub__Group__0 ) ) ;
    public final void rulePackageDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:91:2: ( ( ( rule__PackageDefinitionOrStub__Group__0 ) ) )
            // InternalAlf.g:92:2: ( ( rule__PackageDefinitionOrStub__Group__0 ) )
            {
            // InternalAlf.g:92:2: ( ( rule__PackageDefinitionOrStub__Group__0 ) )
            // InternalAlf.g:93:3: ( rule__PackageDefinitionOrStub__Group__0 )
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getGroup()); 
            // InternalAlf.g:94:3: ( rule__PackageDefinitionOrStub__Group__0 )
            // InternalAlf.g:94:4: rule__PackageDefinitionOrStub__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDefinitionOrStubAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePackagedElement"
    // InternalAlf.g:103:1: entryRulePackagedElement : rulePackagedElement EOF ;
    public final void entryRulePackagedElement() throws RecognitionException {
        try {
            // InternalAlf.g:104:1: ( rulePackagedElement EOF )
            // InternalAlf.g:105:1: rulePackagedElement EOF
            {
             before(grammarAccess.getPackagedElementRule()); 
            pushFollow(FOLLOW_1);
            rulePackagedElement();

            state._fsp--;

             after(grammarAccess.getPackagedElementRule()); 
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
    // $ANTLR end "entryRulePackagedElement"


    // $ANTLR start "rulePackagedElement"
    // InternalAlf.g:112:1: rulePackagedElement : ( rulePackagedElementDefinition ) ;
    public final void rulePackagedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:116:2: ( ( rulePackagedElementDefinition ) )
            // InternalAlf.g:117:2: ( rulePackagedElementDefinition )
            {
            // InternalAlf.g:117:2: ( rulePackagedElementDefinition )
            // InternalAlf.g:118:3: rulePackagedElementDefinition
            {
             before(grammarAccess.getPackagedElementAccess().getPackagedElementDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePackagedElementDefinition();

            state._fsp--;

             after(grammarAccess.getPackagedElementAccess().getPackagedElementDefinitionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackagedElement"


    // $ANTLR start "entryRulePackagedElementDefinition"
    // InternalAlf.g:128:1: entryRulePackagedElementDefinition : rulePackagedElementDefinition EOF ;
    public final void entryRulePackagedElementDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:129:1: ( rulePackagedElementDefinition EOF )
            // InternalAlf.g:130:1: rulePackagedElementDefinition EOF
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
    // InternalAlf.g:137:1: rulePackagedElementDefinition : ( ( rule__PackagedElementDefinition__Alternatives ) ) ;
    public final void rulePackagedElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:141:2: ( ( ( rule__PackagedElementDefinition__Alternatives ) ) )
            // InternalAlf.g:142:2: ( ( rule__PackagedElementDefinition__Alternatives ) )
            {
            // InternalAlf.g:142:2: ( ( rule__PackagedElementDefinition__Alternatives ) )
            // InternalAlf.g:143:3: ( rule__PackagedElementDefinition__Alternatives )
            {
             before(grammarAccess.getPackagedElementDefinitionAccess().getAlternatives()); 
            // InternalAlf.g:144:3: ( rule__PackagedElementDefinition__Alternatives )
            // InternalAlf.g:144:4: rule__PackagedElementDefinition__Alternatives
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
    // InternalAlf.g:153:1: entryRuleClassifierDefinitionOrStub : ruleClassifierDefinitionOrStub EOF ;
    public final void entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:154:1: ( ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:155:1: ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:162:1: ruleClassifierDefinitionOrStub : ( ruleClassDefinitionOrStub ) ;
    public final void ruleClassifierDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:166:2: ( ( ruleClassDefinitionOrStub ) )
            // InternalAlf.g:167:2: ( ruleClassDefinitionOrStub )
            {
            // InternalAlf.g:167:2: ( ruleClassDefinitionOrStub )
            // InternalAlf.g:168:3: ruleClassDefinitionOrStub
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
    // InternalAlf.g:178:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalAlf.g:179:1: ( ruleClassDeclaration EOF )
            // InternalAlf.g:180:1: ruleClassDeclaration EOF
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
    // InternalAlf.g:187:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:191:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalAlf.g:192:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalAlf.g:192:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalAlf.g:193:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalAlf.g:194:3: ( rule__ClassDeclaration__Group__0 )
            // InternalAlf.g:194:4: rule__ClassDeclaration__Group__0
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
    // InternalAlf.g:203:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:204:1: ( ruleGeneralization EOF )
            // InternalAlf.g:205:1: ruleGeneralization EOF
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
    // InternalAlf.g:212:1: ruleGeneralization : ( ( rule__Generalization__GeneralAssignment ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:216:2: ( ( ( rule__Generalization__GeneralAssignment ) ) )
            // InternalAlf.g:217:2: ( ( rule__Generalization__GeneralAssignment ) )
            {
            // InternalAlf.g:217:2: ( ( rule__Generalization__GeneralAssignment ) )
            // InternalAlf.g:218:3: ( rule__Generalization__GeneralAssignment )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment()); 
            // InternalAlf.g:219:3: ( rule__Generalization__GeneralAssignment )
            // InternalAlf.g:219:4: rule__Generalization__GeneralAssignment
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


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:228:1: entryRuleClassDefinitionOrStub : ruleClassDefinitionOrStub EOF ;
    public final void entryRuleClassDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:229:1: ( ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:230:1: ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:237:1: ruleClassDefinitionOrStub : ( ( rule__ClassDefinitionOrStub__Group__0 ) ) ;
    public final void ruleClassDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:241:2: ( ( ( rule__ClassDefinitionOrStub__Group__0 ) ) )
            // InternalAlf.g:242:2: ( ( rule__ClassDefinitionOrStub__Group__0 ) )
            {
            // InternalAlf.g:242:2: ( ( rule__ClassDefinitionOrStub__Group__0 ) )
            // InternalAlf.g:243:3: ( rule__ClassDefinitionOrStub__Group__0 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGroup()); 
            // InternalAlf.g:244:3: ( rule__ClassDefinitionOrStub__Group__0 )
            // InternalAlf.g:244:4: rule__ClassDefinitionOrStub__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleClassMember"
    // InternalAlf.g:253:1: entryRuleClassMember : ruleClassMember EOF ;
    public final void entryRuleClassMember() throws RecognitionException {
        try {
            // InternalAlf.g:254:1: ( ruleClassMember EOF )
            // InternalAlf.g:255:1: ruleClassMember EOF
            {
             before(grammarAccess.getClassMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getClassMemberRule()); 
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
    // $ANTLR end "entryRuleClassMember"


    // $ANTLR start "ruleClassMember"
    // InternalAlf.g:262:1: ruleClassMember : ( ruleFeatureDefinition ) ;
    public final void ruleClassMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:266:2: ( ( ruleFeatureDefinition ) )
            // InternalAlf.g:267:2: ( ruleFeatureDefinition )
            {
            // InternalAlf.g:267:2: ( ruleFeatureDefinition )
            // InternalAlf.g:268:3: ruleFeatureDefinition
            {
             before(grammarAccess.getClassMemberAccess().getFeatureDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getClassMemberAccess().getFeatureDefinitionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:278:1: entryRuleFeatureDefinition : ruleFeatureDefinition EOF ;
    public final void entryRuleFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:279:1: ( ruleFeatureDefinition EOF )
            // InternalAlf.g:280:1: ruleFeatureDefinition EOF
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
    // InternalAlf.g:287:1: ruleFeatureDefinition : ( ( rule__FeatureDefinition__Group__0 ) ) ;
    public final void ruleFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:291:2: ( ( ( rule__FeatureDefinition__Group__0 ) ) )
            // InternalAlf.g:292:2: ( ( rule__FeatureDefinition__Group__0 ) )
            {
            // InternalAlf.g:292:2: ( ( rule__FeatureDefinition__Group__0 ) )
            // InternalAlf.g:293:3: ( rule__FeatureDefinition__Group__0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup()); 
            // InternalAlf.g:294:3: ( rule__FeatureDefinition__Group__0 )
            // InternalAlf.g:294:4: rule__FeatureDefinition__Group__0
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
    // InternalAlf.g:303:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalAlf.g:304:1: ( ruleName EOF )
            // InternalAlf.g:305:1: ruleName EOF
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
    // InternalAlf.g:312:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:316:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalAlf.g:317:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalAlf.g:317:2: ( ( rule__Name__Alternatives ) )
            // InternalAlf.g:318:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalAlf.g:319:3: ( rule__Name__Alternatives )
            // InternalAlf.g:319:4: rule__Name__Alternatives
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
    // InternalAlf.g:328:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAlf.g:329:1: ( ruleQualifiedName EOF )
            // InternalAlf.g:330:1: ruleQualifiedName EOF
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
    // InternalAlf.g:337:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:341:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAlf.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAlf.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAlf.g:343:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAlf.g:344:3: ( rule__QualifiedName__Group__0 )
            // InternalAlf.g:344:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "ruleVisibilityKind"
    // InternalAlf.g:353:1: ruleVisibilityKind : ( ( rule__VisibilityKind__Alternatives ) ) ;
    public final void ruleVisibilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:357:1: ( ( ( rule__VisibilityKind__Alternatives ) ) )
            // InternalAlf.g:358:2: ( ( rule__VisibilityKind__Alternatives ) )
            {
            // InternalAlf.g:358:2: ( ( rule__VisibilityKind__Alternatives ) )
            // InternalAlf.g:359:3: ( rule__VisibilityKind__Alternatives )
            {
             before(grammarAccess.getVisibilityKindAccess().getAlternatives()); 
            // InternalAlf.g:360:3: ( rule__VisibilityKind__Alternatives )
            // InternalAlf.g:360:4: rule__VisibilityKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VisibilityKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilityKind"


    // $ANTLR start "rule__PackagedElementDefinition__Alternatives"
    // InternalAlf.g:368:1: rule__PackagedElementDefinition__Alternatives : ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) );
    public final void rule__PackagedElementDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:372:1: ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==18) ) {
                    alt1=1;
                }
                else if ( (LA1_1==21||LA1_1==26) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==21||LA1_2==26) ) {
                    alt1=2;
                }
                else if ( (LA1_2==18) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==18) ) {
                    alt1=1;
                }
                else if ( (LA1_3==21||LA1_3==26) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAlf.g:373:2: ( rulePackageDefinitionOrStub )
                    {
                    // InternalAlf.g:373:2: ( rulePackageDefinitionOrStub )
                    // InternalAlf.g:374:3: rulePackageDefinitionOrStub
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
                    // InternalAlf.g:379:2: ( ruleClassifierDefinitionOrStub )
                    {
                    // InternalAlf.g:379:2: ( ruleClassifierDefinitionOrStub )
                    // InternalAlf.g:380:3: ruleClassifierDefinitionOrStub
                    {
                     before(grammarAccess.getPackagedElementDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassifierDefinitionOrStub();

                    state._fsp--;

                     after(grammarAccess.getPackagedElementDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1()); 

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
    // InternalAlf.g:389:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:393:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_UNRESTRICTED_NAME) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAlf.g:394:2: ( RULE_ID )
                    {
                    // InternalAlf.g:394:2: ( RULE_ID )
                    // InternalAlf.g:395:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:400:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:400:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:401:3: RULE_UNRESTRICTED_NAME
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


    // $ANTLR start "rule__VisibilityKind__Alternatives"
    // InternalAlf.g:410:1: rule__VisibilityKind__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__VisibilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:414:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
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
                    // InternalAlf.g:415:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:415:2: ( ( 'public' ) )
                    // InternalAlf.g:416:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:417:3: ( 'public' )
                    // InternalAlf.g:417:4: 'public'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:421:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:421:2: ( ( 'private' ) )
                    // InternalAlf.g:422:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:423:3: ( 'private' )
                    // InternalAlf.g:423:4: 'private'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:427:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:427:2: ( ( 'protected' ) )
                    // InternalAlf.g:428:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:429:3: ( 'protected' )
                    // InternalAlf.g:429:4: 'protected'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__VisibilityKind__Alternatives"


    // $ANTLR start "rule__PackageDefinition__Group__0"
    // InternalAlf.g:437:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:441:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:442:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
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
    // InternalAlf.g:449:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:453:1: ( ( 'package' ) )
            // InternalAlf.g:454:1: ( 'package' )
            {
            // InternalAlf.g:454:1: ( 'package' )
            // InternalAlf.g:455:2: 'package'
            {
             before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAlf.g:464:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:468:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:469:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
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
    // InternalAlf.g:476:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:480:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:481:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:481:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:482:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:483:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:483:3: rule__PackageDefinition__NameAssignment_1
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
    // InternalAlf.g:491:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:495:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:496:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
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
    // InternalAlf.g:503:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:507:1: ( ( '{' ) )
            // InternalAlf.g:508:1: ( '{' )
            {
            // InternalAlf.g:508:1: ( '{' )
            // InternalAlf.g:509:2: '{'
            {
             before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAlf.g:518:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:522:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:523:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
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
    // InternalAlf.g:530:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__OwnedMemberAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:534:1: ( ( ( rule__PackageDefinition__OwnedMemberAssignment_3 )* ) )
            // InternalAlf.g:535:1: ( ( rule__PackageDefinition__OwnedMemberAssignment_3 )* )
            {
            // InternalAlf.g:535:1: ( ( rule__PackageDefinition__OwnedMemberAssignment_3 )* )
            // InternalAlf.g:536:2: ( rule__PackageDefinition__OwnedMemberAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getOwnedMemberAssignment_3()); 
            // InternalAlf.g:537:2: ( rule__PackageDefinition__OwnedMemberAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlf.g:537:3: rule__PackageDefinition__OwnedMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__OwnedMemberAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageDefinitionAccess().getOwnedMemberAssignment_3()); 

            }


            }

        }
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
    // InternalAlf.g:545:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:549:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:550:2: rule__PackageDefinition__Group__4__Impl
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
    // InternalAlf.g:556:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:560:1: ( ( '}' ) )
            // InternalAlf.g:561:1: ( '}' )
            {
            // InternalAlf.g:561:1: ( '}' )
            // InternalAlf.g:562:2: '}'
            {
             before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__0"
    // InternalAlf.g:572:1: rule__PackageDefinitionOrStub__Group__0 : rule__PackageDefinitionOrStub__Group__0__Impl rule__PackageDefinitionOrStub__Group__1 ;
    public final void rule__PackageDefinitionOrStub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:576:1: ( rule__PackageDefinitionOrStub__Group__0__Impl rule__PackageDefinitionOrStub__Group__1 )
            // InternalAlf.g:577:2: rule__PackageDefinitionOrStub__Group__0__Impl rule__PackageDefinitionOrStub__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PackageDefinitionOrStub__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__0"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__0__Impl"
    // InternalAlf.g:584:1: rule__PackageDefinitionOrStub__Group__0__Impl : ( ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 ) ) ;
    public final void rule__PackageDefinitionOrStub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:588:1: ( ( ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 ) ) )
            // InternalAlf.g:589:1: ( ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 ) )
            {
            // InternalAlf.g:589:1: ( ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 ) )
            // InternalAlf.g:590:2: ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 )
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getPackageVisibilityAssignment_0()); 
            // InternalAlf.g:591:2: ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 )
            // InternalAlf.g:591:3: rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDefinitionOrStubAccess().getPackageVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__0__Impl"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__1"
    // InternalAlf.g:599:1: rule__PackageDefinitionOrStub__Group__1 : rule__PackageDefinitionOrStub__Group__1__Impl rule__PackageDefinitionOrStub__Group__2 ;
    public final void rule__PackageDefinitionOrStub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:603:1: ( rule__PackageDefinitionOrStub__Group__1__Impl rule__PackageDefinitionOrStub__Group__2 )
            // InternalAlf.g:604:2: rule__PackageDefinitionOrStub__Group__1__Impl rule__PackageDefinitionOrStub__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PackageDefinitionOrStub__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__1"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__1__Impl"
    // InternalAlf.g:611:1: rule__PackageDefinitionOrStub__Group__1__Impl : ( 'package' ) ;
    public final void rule__PackageDefinitionOrStub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:615:1: ( ( 'package' ) )
            // InternalAlf.g:616:1: ( 'package' )
            {
            // InternalAlf.g:616:1: ( 'package' )
            // InternalAlf.g:617:2: 'package'
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getPackageKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPackageDefinitionOrStubAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__1__Impl"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__2"
    // InternalAlf.g:626:1: rule__PackageDefinitionOrStub__Group__2 : rule__PackageDefinitionOrStub__Group__2__Impl rule__PackageDefinitionOrStub__Group__3 ;
    public final void rule__PackageDefinitionOrStub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:630:1: ( rule__PackageDefinitionOrStub__Group__2__Impl rule__PackageDefinitionOrStub__Group__3 )
            // InternalAlf.g:631:2: rule__PackageDefinitionOrStub__Group__2__Impl rule__PackageDefinitionOrStub__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PackageDefinitionOrStub__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__2"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__2__Impl"
    // InternalAlf.g:638:1: rule__PackageDefinitionOrStub__Group__2__Impl : ( ( rule__PackageDefinitionOrStub__NameAssignment_2 ) ) ;
    public final void rule__PackageDefinitionOrStub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:642:1: ( ( ( rule__PackageDefinitionOrStub__NameAssignment_2 ) ) )
            // InternalAlf.g:643:1: ( ( rule__PackageDefinitionOrStub__NameAssignment_2 ) )
            {
            // InternalAlf.g:643:1: ( ( rule__PackageDefinitionOrStub__NameAssignment_2 ) )
            // InternalAlf.g:644:2: ( rule__PackageDefinitionOrStub__NameAssignment_2 )
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getNameAssignment_2()); 
            // InternalAlf.g:645:2: ( rule__PackageDefinitionOrStub__NameAssignment_2 )
            // InternalAlf.g:645:3: rule__PackageDefinitionOrStub__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageDefinitionOrStubAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__2__Impl"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__3"
    // InternalAlf.g:653:1: rule__PackageDefinitionOrStub__Group__3 : rule__PackageDefinitionOrStub__Group__3__Impl rule__PackageDefinitionOrStub__Group__4 ;
    public final void rule__PackageDefinitionOrStub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:657:1: ( rule__PackageDefinitionOrStub__Group__3__Impl rule__PackageDefinitionOrStub__Group__4 )
            // InternalAlf.g:658:2: rule__PackageDefinitionOrStub__Group__3__Impl rule__PackageDefinitionOrStub__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PackageDefinitionOrStub__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__3"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__3__Impl"
    // InternalAlf.g:665:1: rule__PackageDefinitionOrStub__Group__3__Impl : ( '{' ) ;
    public final void rule__PackageDefinitionOrStub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:669:1: ( ( '{' ) )
            // InternalAlf.g:670:1: ( '{' )
            {
            // InternalAlf.g:670:1: ( '{' )
            // InternalAlf.g:671:2: '{'
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPackageDefinitionOrStubAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__3__Impl"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__4"
    // InternalAlf.g:680:1: rule__PackageDefinitionOrStub__Group__4 : rule__PackageDefinitionOrStub__Group__4__Impl rule__PackageDefinitionOrStub__Group__5 ;
    public final void rule__PackageDefinitionOrStub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:684:1: ( rule__PackageDefinitionOrStub__Group__4__Impl rule__PackageDefinitionOrStub__Group__5 )
            // InternalAlf.g:685:2: rule__PackageDefinitionOrStub__Group__4__Impl rule__PackageDefinitionOrStub__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__PackageDefinitionOrStub__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__4"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__4__Impl"
    // InternalAlf.g:692:1: rule__PackageDefinitionOrStub__Group__4__Impl : ( ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )* ) ;
    public final void rule__PackageDefinitionOrStub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:696:1: ( ( ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )* ) )
            // InternalAlf.g:697:1: ( ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )* )
            {
            // InternalAlf.g:697:1: ( ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )* )
            // InternalAlf.g:698:2: ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )*
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getOwnedMemberAssignment_4()); 
            // InternalAlf.g:699:2: ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlf.g:699:3: rule__PackageDefinitionOrStub__OwnedMemberAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinitionOrStub__OwnedMemberAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageDefinitionOrStubAccess().getOwnedMemberAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__4__Impl"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__5"
    // InternalAlf.g:707:1: rule__PackageDefinitionOrStub__Group__5 : rule__PackageDefinitionOrStub__Group__5__Impl ;
    public final void rule__PackageDefinitionOrStub__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:711:1: ( rule__PackageDefinitionOrStub__Group__5__Impl )
            // InternalAlf.g:712:2: rule__PackageDefinitionOrStub__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinitionOrStub__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__5"


    // $ANTLR start "rule__PackageDefinitionOrStub__Group__5__Impl"
    // InternalAlf.g:718:1: rule__PackageDefinitionOrStub__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDefinitionOrStub__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:722:1: ( ( '}' ) )
            // InternalAlf.g:723:1: ( '}' )
            {
            // InternalAlf.g:723:1: ( '}' )
            // InternalAlf.g:724:2: '}'
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPackageDefinitionOrStubAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__Group__5__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalAlf.g:734:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:738:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:739:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAlf.g:746:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:750:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:751:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:751:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:752:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:753:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:753:3: rule__ClassDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:761:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:765:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:766:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalAlf.g:773:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:777:1: ( ( 'class' ) )
            // InternalAlf.g:778:1: ( 'class' )
            {
            // InternalAlf.g:778:1: ( 'class' )
            // InternalAlf.g:779:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAlf.g:788:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:792:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:793:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAlf.g:800:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:804:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:805:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:805:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:806:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:807:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:807:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalAlf.g:815:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:819:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:820:2: rule__ClassDeclaration__Group__3__Impl
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
    // InternalAlf.g:826:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:830:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:831:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:831:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:832:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:833:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:833:3: rule__ClassDeclaration__Group_3__0
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
    // InternalAlf.g:842:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:846:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:847:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalAlf.g:854:1: rule__ClassDeclaration__Group_3__0__Impl : ( 'specializes' ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:858:1: ( ( 'specializes' ) )
            // InternalAlf.g:859:1: ( 'specializes' )
            {
            // InternalAlf.g:859:1: ( 'specializes' )
            // InternalAlf.g:860:2: 'specializes'
            {
             before(grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAlf.g:869:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:873:1: ( rule__ClassDeclaration__Group_3__1__Impl )
            // InternalAlf.g:874:2: rule__ClassDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAlf.g:880:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) ) ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )* ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:884:1: ( ( ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) ) ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )* ) ) )
            // InternalAlf.g:885:1: ( ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) ) ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )* ) )
            {
            // InternalAlf.g:885:1: ( ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) ) ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )* ) )
            // InternalAlf.g:886:2: ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) ) ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )* )
            {
            // InternalAlf.g:886:2: ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) )
            // InternalAlf.g:887:3: ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGeneralizationAssignment_3_1()); 
            // InternalAlf.g:888:3: ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )
            // InternalAlf.g:888:4: rule__ClassDeclaration__GeneralizationAssignment_3_1
            {
            pushFollow(FOLLOW_10);
            rule__ClassDeclaration__GeneralizationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGeneralizationAssignment_3_1()); 

            }

            // InternalAlf.g:891:2: ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )* )
            // InternalAlf.g:892:3: ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGeneralizationAssignment_3_1()); 
            // InternalAlf.g:893:3: ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_UNRESTRICTED_NAME)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAlf.g:893:4: rule__ClassDeclaration__GeneralizationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ClassDeclaration__GeneralizationAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getGeneralizationAssignment_3_1()); 

            }


            }


            }

        }
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


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__0"
    // InternalAlf.g:903:1: rule__ClassDefinitionOrStub__Group__0 : rule__ClassDefinitionOrStub__Group__0__Impl rule__ClassDefinitionOrStub__Group__1 ;
    public final void rule__ClassDefinitionOrStub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:907:1: ( rule__ClassDefinitionOrStub__Group__0__Impl rule__ClassDefinitionOrStub__Group__1 )
            // InternalAlf.g:908:2: rule__ClassDefinitionOrStub__Group__0__Impl rule__ClassDefinitionOrStub__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ClassDefinitionOrStub__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__0"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__0__Impl"
    // InternalAlf.g:915:1: rule__ClassDefinitionOrStub__Group__0__Impl : ( ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 ) ) ;
    public final void rule__ClassDefinitionOrStub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:919:1: ( ( ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 ) ) )
            // InternalAlf.g:920:1: ( ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 ) )
            {
            // InternalAlf.g:920:1: ( ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 ) )
            // InternalAlf.g:921:2: ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getPackageVisibilityAssignment_0()); 
            // InternalAlf.g:922:2: ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 )
            // InternalAlf.g:922:3: rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getPackageVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__0__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__1"
    // InternalAlf.g:930:1: rule__ClassDefinitionOrStub__Group__1 : rule__ClassDefinitionOrStub__Group__1__Impl rule__ClassDefinitionOrStub__Group__2 ;
    public final void rule__ClassDefinitionOrStub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:934:1: ( rule__ClassDefinitionOrStub__Group__1__Impl rule__ClassDefinitionOrStub__Group__2 )
            // InternalAlf.g:935:2: rule__ClassDefinitionOrStub__Group__1__Impl rule__ClassDefinitionOrStub__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ClassDefinitionOrStub__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__1"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__1__Impl"
    // InternalAlf.g:942:1: rule__ClassDefinitionOrStub__Group__1__Impl : ( ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )? ) ;
    public final void rule__ClassDefinitionOrStub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:946:1: ( ( ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )? ) )
            // InternalAlf.g:947:1: ( ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )? )
            {
            // InternalAlf.g:947:1: ( ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )? )
            // InternalAlf.g:948:2: ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )?
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAssignment_1()); 
            // InternalAlf.g:949:2: ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:949:3: rule__ClassDefinitionOrStub__IsAbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDefinitionOrStub__IsAbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__1__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__2"
    // InternalAlf.g:957:1: rule__ClassDefinitionOrStub__Group__2 : rule__ClassDefinitionOrStub__Group__2__Impl rule__ClassDefinitionOrStub__Group__3 ;
    public final void rule__ClassDefinitionOrStub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:961:1: ( rule__ClassDefinitionOrStub__Group__2__Impl rule__ClassDefinitionOrStub__Group__3 )
            // InternalAlf.g:962:2: rule__ClassDefinitionOrStub__Group__2__Impl rule__ClassDefinitionOrStub__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ClassDefinitionOrStub__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__2"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__2__Impl"
    // InternalAlf.g:969:1: rule__ClassDefinitionOrStub__Group__2__Impl : ( 'class' ) ;
    public final void rule__ClassDefinitionOrStub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:973:1: ( ( 'class' ) )
            // InternalAlf.g:974:1: ( 'class' )
            {
            // InternalAlf.g:974:1: ( 'class' )
            // InternalAlf.g:975:2: 'class'
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getClassKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassDefinitionOrStubAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__2__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__3"
    // InternalAlf.g:984:1: rule__ClassDefinitionOrStub__Group__3 : rule__ClassDefinitionOrStub__Group__3__Impl rule__ClassDefinitionOrStub__Group__4 ;
    public final void rule__ClassDefinitionOrStub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:988:1: ( rule__ClassDefinitionOrStub__Group__3__Impl rule__ClassDefinitionOrStub__Group__4 )
            // InternalAlf.g:989:2: rule__ClassDefinitionOrStub__Group__3__Impl rule__ClassDefinitionOrStub__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ClassDefinitionOrStub__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__3"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__3__Impl"
    // InternalAlf.g:996:1: rule__ClassDefinitionOrStub__Group__3__Impl : ( ( rule__ClassDefinitionOrStub__NameAssignment_3 ) ) ;
    public final void rule__ClassDefinitionOrStub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1000:1: ( ( ( rule__ClassDefinitionOrStub__NameAssignment_3 ) ) )
            // InternalAlf.g:1001:1: ( ( rule__ClassDefinitionOrStub__NameAssignment_3 ) )
            {
            // InternalAlf.g:1001:1: ( ( rule__ClassDefinitionOrStub__NameAssignment_3 ) )
            // InternalAlf.g:1002:2: ( rule__ClassDefinitionOrStub__NameAssignment_3 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getNameAssignment_3()); 
            // InternalAlf.g:1003:2: ( rule__ClassDefinitionOrStub__NameAssignment_3 )
            // InternalAlf.g:1003:3: rule__ClassDefinitionOrStub__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__3__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__4"
    // InternalAlf.g:1011:1: rule__ClassDefinitionOrStub__Group__4 : rule__ClassDefinitionOrStub__Group__4__Impl rule__ClassDefinitionOrStub__Group__5 ;
    public final void rule__ClassDefinitionOrStub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1015:1: ( rule__ClassDefinitionOrStub__Group__4__Impl rule__ClassDefinitionOrStub__Group__5 )
            // InternalAlf.g:1016:2: rule__ClassDefinitionOrStub__Group__4__Impl rule__ClassDefinitionOrStub__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ClassDefinitionOrStub__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__4"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__4__Impl"
    // InternalAlf.g:1023:1: rule__ClassDefinitionOrStub__Group__4__Impl : ( ( rule__ClassDefinitionOrStub__Group_4__0 )? ) ;
    public final void rule__ClassDefinitionOrStub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1027:1: ( ( ( rule__ClassDefinitionOrStub__Group_4__0 )? ) )
            // InternalAlf.g:1028:1: ( ( rule__ClassDefinitionOrStub__Group_4__0 )? )
            {
            // InternalAlf.g:1028:1: ( ( rule__ClassDefinitionOrStub__Group_4__0 )? )
            // InternalAlf.g:1029:2: ( rule__ClassDefinitionOrStub__Group_4__0 )?
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGroup_4()); 
            // InternalAlf.g:1030:2: ( rule__ClassDefinitionOrStub__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlf.g:1030:3: rule__ClassDefinitionOrStub__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDefinitionOrStub__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__4__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__5"
    // InternalAlf.g:1038:1: rule__ClassDefinitionOrStub__Group__5 : rule__ClassDefinitionOrStub__Group__5__Impl rule__ClassDefinitionOrStub__Group__6 ;
    public final void rule__ClassDefinitionOrStub__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1042:1: ( rule__ClassDefinitionOrStub__Group__5__Impl rule__ClassDefinitionOrStub__Group__6 )
            // InternalAlf.g:1043:2: rule__ClassDefinitionOrStub__Group__5__Impl rule__ClassDefinitionOrStub__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ClassDefinitionOrStub__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__5"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__5__Impl"
    // InternalAlf.g:1050:1: rule__ClassDefinitionOrStub__Group__5__Impl : ( '{' ) ;
    public final void rule__ClassDefinitionOrStub__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1054:1: ( ( '{' ) )
            // InternalAlf.g:1055:1: ( '{' )
            {
            // InternalAlf.g:1055:1: ( '{' )
            // InternalAlf.g:1056:2: '{'
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassDefinitionOrStubAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__5__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__6"
    // InternalAlf.g:1065:1: rule__ClassDefinitionOrStub__Group__6 : rule__ClassDefinitionOrStub__Group__6__Impl rule__ClassDefinitionOrStub__Group__7 ;
    public final void rule__ClassDefinitionOrStub__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1069:1: ( rule__ClassDefinitionOrStub__Group__6__Impl rule__ClassDefinitionOrStub__Group__7 )
            // InternalAlf.g:1070:2: rule__ClassDefinitionOrStub__Group__6__Impl rule__ClassDefinitionOrStub__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ClassDefinitionOrStub__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__6"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__6__Impl"
    // InternalAlf.g:1077:1: rule__ClassDefinitionOrStub__Group__6__Impl : ( ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )* ) ;
    public final void rule__ClassDefinitionOrStub__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1081:1: ( ( ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )* ) )
            // InternalAlf.g:1082:1: ( ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )* )
            {
            // InternalAlf.g:1082:1: ( ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )* )
            // InternalAlf.g:1083:2: ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )*
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getOwnedFeatureAssignment_6()); 
            // InternalAlf.g:1084:2: ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)||(LA11_0>=15 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAlf.g:1084:3: rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassDefinitionOrStubAccess().getOwnedFeatureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__6__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__7"
    // InternalAlf.g:1092:1: rule__ClassDefinitionOrStub__Group__7 : rule__ClassDefinitionOrStub__Group__7__Impl ;
    public final void rule__ClassDefinitionOrStub__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1096:1: ( rule__ClassDefinitionOrStub__Group__7__Impl )
            // InternalAlf.g:1097:2: rule__ClassDefinitionOrStub__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__7"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__7__Impl"
    // InternalAlf.g:1103:1: rule__ClassDefinitionOrStub__Group__7__Impl : ( '}' ) ;
    public final void rule__ClassDefinitionOrStub__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1107:1: ( ( '}' ) )
            // InternalAlf.g:1108:1: ( '}' )
            {
            // InternalAlf.g:1108:1: ( '}' )
            // InternalAlf.g:1109:2: '}'
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassDefinitionOrStubAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group__7__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4__0"
    // InternalAlf.g:1119:1: rule__ClassDefinitionOrStub__Group_4__0 : rule__ClassDefinitionOrStub__Group_4__0__Impl rule__ClassDefinitionOrStub__Group_4__1 ;
    public final void rule__ClassDefinitionOrStub__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1123:1: ( rule__ClassDefinitionOrStub__Group_4__0__Impl rule__ClassDefinitionOrStub__Group_4__1 )
            // InternalAlf.g:1124:2: rule__ClassDefinitionOrStub__Group_4__0__Impl rule__ClassDefinitionOrStub__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDefinitionOrStub__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4__0"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4__0__Impl"
    // InternalAlf.g:1131:1: rule__ClassDefinitionOrStub__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__ClassDefinitionOrStub__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1135:1: ( ( 'specializes' ) )
            // InternalAlf.g:1136:1: ( 'specializes' )
            {
            // InternalAlf.g:1136:1: ( 'specializes' )
            // InternalAlf.g:1137:2: 'specializes'
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getSpecializesKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassDefinitionOrStubAccess().getSpecializesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4__0__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4__1"
    // InternalAlf.g:1146:1: rule__ClassDefinitionOrStub__Group_4__1 : rule__ClassDefinitionOrStub__Group_4__1__Impl ;
    public final void rule__ClassDefinitionOrStub__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1150:1: ( rule__ClassDefinitionOrStub__Group_4__1__Impl )
            // InternalAlf.g:1151:2: rule__ClassDefinitionOrStub__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4__1"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4__1__Impl"
    // InternalAlf.g:1157:1: rule__ClassDefinitionOrStub__Group_4__1__Impl : ( ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) ) ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )* ) ) ;
    public final void rule__ClassDefinitionOrStub__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1161:1: ( ( ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) ) ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )* ) ) )
            // InternalAlf.g:1162:1: ( ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) ) ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )* ) )
            {
            // InternalAlf.g:1162:1: ( ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) ) ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )* ) )
            // InternalAlf.g:1163:2: ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) ) ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )* )
            {
            // InternalAlf.g:1163:2: ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) )
            // InternalAlf.g:1164:3: ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationAssignment_4_1()); 
            // InternalAlf.g:1165:3: ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )
            // InternalAlf.g:1165:4: rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1
            {
            pushFollow(FOLLOW_10);
            rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationAssignment_4_1()); 

            }

            // InternalAlf.g:1168:2: ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )* )
            // InternalAlf.g:1169:3: ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )*
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationAssignment_4_1()); 
            // InternalAlf.g:1170:3: ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_UNRESTRICTED_NAME)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:1170:4: rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group__0"
    // InternalAlf.g:1180:1: rule__FeatureDefinition__Group__0 : rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1 ;
    public final void rule__FeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1184:1: ( rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1 )
            // InternalAlf.g:1185:2: rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAlf.g:1192:1: rule__FeatureDefinition__Group__0__Impl : ( ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )? ) ;
    public final void rule__FeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1196:1: ( ( ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )? ) )
            // InternalAlf.g:1197:1: ( ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )? )
            {
            // InternalAlf.g:1197:1: ( ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )? )
            // InternalAlf.g:1198:2: ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getMethodVisibilityAssignment_0()); 
            // InternalAlf.g:1199:2: ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=15 && LA13_0<=17)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:1199:3: rule__FeatureDefinition__MethodVisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__MethodVisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getMethodVisibilityAssignment_0()); 

            }


            }

        }
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
    // InternalAlf.g:1207:1: rule__FeatureDefinition__Group__1 : rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2 ;
    public final void rule__FeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1211:1: ( rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2 )
            // InternalAlf.g:1212:2: rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalAlf.g:1219:1: rule__FeatureDefinition__Group__1__Impl : ( ( rule__FeatureDefinition__NameAssignment_1 ) ) ;
    public final void rule__FeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1223:1: ( ( ( rule__FeatureDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:1224:1: ( ( rule__FeatureDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:1224:1: ( ( rule__FeatureDefinition__NameAssignment_1 ) )
            // InternalAlf.g:1225:2: ( rule__FeatureDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:1226:2: ( rule__FeatureDefinition__NameAssignment_1 )
            // InternalAlf.g:1226:3: rule__FeatureDefinition__NameAssignment_1
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
    // InternalAlf.g:1234:1: rule__FeatureDefinition__Group__2 : rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3 ;
    public final void rule__FeatureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1238:1: ( rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3 )
            // InternalAlf.g:1239:2: rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3
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
    // InternalAlf.g:1246:1: rule__FeatureDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__FeatureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1250:1: ( ( ':' ) )
            // InternalAlf.g:1251:1: ( ':' )
            {
            // InternalAlf.g:1251:1: ( ':' )
            // InternalAlf.g:1252:2: ':'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAlf.g:1261:1: rule__FeatureDefinition__Group__3 : rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4 ;
    public final void rule__FeatureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1265:1: ( rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4 )
            // InternalAlf.g:1266:2: rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalAlf.g:1273:1: rule__FeatureDefinition__Group__3__Impl : ( ( rule__FeatureDefinition__TypeAssignment_3 ) ) ;
    public final void rule__FeatureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1277:1: ( ( ( rule__FeatureDefinition__TypeAssignment_3 ) ) )
            // InternalAlf.g:1278:1: ( ( rule__FeatureDefinition__TypeAssignment_3 ) )
            {
            // InternalAlf.g:1278:1: ( ( rule__FeatureDefinition__TypeAssignment_3 ) )
            // InternalAlf.g:1279:2: ( rule__FeatureDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getTypeAssignment_3()); 
            // InternalAlf.g:1280:2: ( rule__FeatureDefinition__TypeAssignment_3 )
            // InternalAlf.g:1280:3: rule__FeatureDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalAlf.g:1288:1: rule__FeatureDefinition__Group__4 : rule__FeatureDefinition__Group__4__Impl ;
    public final void rule__FeatureDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1292:1: ( rule__FeatureDefinition__Group__4__Impl )
            // InternalAlf.g:1293:2: rule__FeatureDefinition__Group__4__Impl
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
    // InternalAlf.g:1299:1: rule__FeatureDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__FeatureDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1303:1: ( ( ';' ) )
            // InternalAlf.g:1304:1: ( ';' )
            {
            // InternalAlf.g:1304:1: ( ';' )
            // InternalAlf.g:1305:2: ';'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAlf.g:1315:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1319:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:1320:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalAlf.g:1327:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1331:1: ( ( ruleName ) )
            // InternalAlf.g:1332:1: ( ruleName )
            {
            // InternalAlf.g:1332:1: ( ruleName )
            // InternalAlf.g:1333:2: ruleName
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
    // InternalAlf.g:1342:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1346:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:1347:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:1353:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1357:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:1358:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:1358:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:1359:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:1360:2: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAlf.g:1360:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalAlf.g:1369:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1373:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:1374:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAlf.g:1381:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1385:1: ( ( '::' ) )
            // InternalAlf.g:1386:1: ( '::' )
            {
            // InternalAlf.g:1386:1: ( '::' )
            // InternalAlf.g:1387:2: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
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
    // InternalAlf.g:1396:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1400:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:1401:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAlf.g:1407:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1411:1: ( ( ruleName ) )
            // InternalAlf.g:1412:1: ( ruleName )
            {
            // InternalAlf.g:1412:1: ( ruleName )
            // InternalAlf.g:1413:2: ruleName
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
    // InternalAlf.g:1423:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1427:1: ( ( ruleName ) )
            // InternalAlf.g:1428:2: ( ruleName )
            {
            // InternalAlf.g:1428:2: ( ruleName )
            // InternalAlf.g:1429:3: ruleName
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


    // $ANTLR start "rule__PackageDefinition__OwnedMemberAssignment_3"
    // InternalAlf.g:1438:1: rule__PackageDefinition__OwnedMemberAssignment_3 : ( rulePackagedElement ) ;
    public final void rule__PackageDefinition__OwnedMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1442:1: ( ( rulePackagedElement ) )
            // InternalAlf.g:1443:2: ( rulePackagedElement )
            {
            // InternalAlf.g:1443:2: ( rulePackagedElement )
            // InternalAlf.g:1444:3: rulePackagedElement
            {
             before(grammarAccess.getPackageDefinitionAccess().getOwnedMemberPackagedElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePackagedElement();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionAccess().getOwnedMemberPackagedElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__OwnedMemberAssignment_3"


    // $ANTLR start "rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0"
    // InternalAlf.g:1453:1: rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 : ( ruleVisibilityKind ) ;
    public final void rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1457:1: ( ( ruleVisibilityKind ) )
            // InternalAlf.g:1458:2: ( ruleVisibilityKind )
            {
            // InternalAlf.g:1458:2: ( ruleVisibilityKind )
            // InternalAlf.g:1459:3: ruleVisibilityKind
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getPackageVisibilityVisibilityKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityKind();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionOrStubAccess().getPackageVisibilityVisibilityKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0"


    // $ANTLR start "rule__PackageDefinitionOrStub__NameAssignment_2"
    // InternalAlf.g:1468:1: rule__PackageDefinitionOrStub__NameAssignment_2 : ( ruleName ) ;
    public final void rule__PackageDefinitionOrStub__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1472:1: ( ( ruleName ) )
            // InternalAlf.g:1473:2: ( ruleName )
            {
            // InternalAlf.g:1473:2: ( ruleName )
            // InternalAlf.g:1474:3: ruleName
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getNameNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionOrStubAccess().getNameNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__NameAssignment_2"


    // $ANTLR start "rule__PackageDefinitionOrStub__OwnedMemberAssignment_4"
    // InternalAlf.g:1483:1: rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 : ( rulePackagedElement ) ;
    public final void rule__PackageDefinitionOrStub__OwnedMemberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1487:1: ( ( rulePackagedElement ) )
            // InternalAlf.g:1488:2: ( rulePackagedElement )
            {
            // InternalAlf.g:1488:2: ( rulePackagedElement )
            // InternalAlf.g:1489:3: rulePackagedElement
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getOwnedMemberPackagedElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePackagedElement();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionOrStubAccess().getOwnedMemberPackagedElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinitionOrStub__OwnedMemberAssignment_4"


    // $ANTLR start "rule__ClassDeclaration__IsAbstractAssignment_0"
    // InternalAlf.g:1498:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1502:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:1503:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:1503:2: ( ( 'abstract' ) )
            // InternalAlf.g:1504:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:1505:3: ( 'abstract' )
            // InternalAlf.g:1506:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAlf.g:1517:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1521:1: ( ( ruleName ) )
            // InternalAlf.g:1522:2: ( ruleName )
            {
            // InternalAlf.g:1522:2: ( ruleName )
            // InternalAlf.g:1523:3: ruleName
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


    // $ANTLR start "rule__ClassDeclaration__GeneralizationAssignment_3_1"
    // InternalAlf.g:1532:1: rule__ClassDeclaration__GeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDeclaration__GeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1536:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:1537:2: ( ruleGeneralization )
            {
            // InternalAlf.g:1537:2: ( ruleGeneralization )
            // InternalAlf.g:1538:3: ruleGeneralization
            {
             before(grammarAccess.getClassDeclarationAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__GeneralizationAssignment_3_1"


    // $ANTLR start "rule__Generalization__GeneralAssignment"
    // InternalAlf.g:1547:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1551:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1552:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1552:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1553:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:1554:3: ( ruleQualifiedName )
            // InternalAlf.g:1555:4: ruleQualifiedName
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


    // $ANTLR start "rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0"
    // InternalAlf.g:1566:1: rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 : ( ruleVisibilityKind ) ;
    public final void rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1570:1: ( ( ruleVisibilityKind ) )
            // InternalAlf.g:1571:2: ( ruleVisibilityKind )
            {
            // InternalAlf.g:1571:2: ( ruleVisibilityKind )
            // InternalAlf.g:1572:3: ruleVisibilityKind
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getPackageVisibilityVisibilityKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityKind();

            state._fsp--;

             after(grammarAccess.getClassDefinitionOrStubAccess().getPackageVisibilityVisibilityKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0"


    // $ANTLR start "rule__ClassDefinitionOrStub__IsAbstractAssignment_1"
    // InternalAlf.g:1581:1: rule__ClassDefinitionOrStub__IsAbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDefinitionOrStub__IsAbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1585:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:1586:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:1586:2: ( ( 'abstract' ) )
            // InternalAlf.g:1587:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAbstractKeyword_1_0()); 
            // InternalAlf.g:1588:3: ( 'abstract' )
            // InternalAlf.g:1589:4: 'abstract'
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAbstractKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__IsAbstractAssignment_1"


    // $ANTLR start "rule__ClassDefinitionOrStub__NameAssignment_3"
    // InternalAlf.g:1600:1: rule__ClassDefinitionOrStub__NameAssignment_3 : ( ruleName ) ;
    public final void rule__ClassDefinitionOrStub__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1604:1: ( ( ruleName ) )
            // InternalAlf.g:1605:2: ( ruleName )
            {
            // InternalAlf.g:1605:2: ( ruleName )
            // InternalAlf.g:1606:3: ruleName
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getNameNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getClassDefinitionOrStubAccess().getNameNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__NameAssignment_3"


    // $ANTLR start "rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1"
    // InternalAlf.g:1615:1: rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1619:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:1620:2: ( ruleGeneralization )
            {
            // InternalAlf.g:1620:2: ( ruleGeneralization )
            // InternalAlf.g:1621:3: ruleGeneralization
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationGeneralizationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationGeneralizationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1"


    // $ANTLR start "rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6"
    // InternalAlf.g:1630:1: rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 : ( ruleClassMember ) ;
    public final void rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1634:1: ( ( ruleClassMember ) )
            // InternalAlf.g:1635:2: ( ruleClassMember )
            {
            // InternalAlf.g:1635:2: ( ruleClassMember )
            // InternalAlf.g:1636:3: ruleClassMember
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getOwnedFeatureClassMemberParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getClassDefinitionOrStubAccess().getOwnedFeatureClassMemberParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6"


    // $ANTLR start "rule__FeatureDefinition__MethodVisibilityAssignment_0"
    // InternalAlf.g:1645:1: rule__FeatureDefinition__MethodVisibilityAssignment_0 : ( ruleVisibilityKind ) ;
    public final void rule__FeatureDefinition__MethodVisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1649:1: ( ( ruleVisibilityKind ) )
            // InternalAlf.g:1650:2: ( ruleVisibilityKind )
            {
            // InternalAlf.g:1650:2: ( ruleVisibilityKind )
            // InternalAlf.g:1651:3: ruleVisibilityKind
            {
             before(grammarAccess.getFeatureDefinitionAccess().getMethodVisibilityVisibilityKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityKind();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getMethodVisibilityVisibilityKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__MethodVisibilityAssignment_0"


    // $ANTLR start "rule__FeatureDefinition__NameAssignment_1"
    // InternalAlf.g:1660:1: rule__FeatureDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__FeatureDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1664:1: ( ( ruleName ) )
            // InternalAlf.g:1665:2: ( ruleName )
            {
            // InternalAlf.g:1665:2: ( ruleName )
            // InternalAlf.g:1666:3: ruleName
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


    // $ANTLR start "rule__FeatureDefinition__TypeAssignment_3"
    // InternalAlf.g:1675:1: rule__FeatureDefinition__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1679:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1680:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1680:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1681:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getTypeClassCrossReference_3_0()); 
            // InternalAlf.g:1682:3: ( ruleQualifiedName )
            // InternalAlf.g:1683:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getTypeClassQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getTypeClassQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureDefinitionAccess().getTypeClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000138030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000038032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000038030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});

}