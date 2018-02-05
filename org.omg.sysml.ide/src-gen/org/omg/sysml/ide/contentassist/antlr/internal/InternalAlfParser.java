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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_BOOLEAN_VALUE", "RULE_NATURAL_VALUE", "RULE_STRING", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'public'", "'private'", "'protected'", "'package'", "'{'", "'}'", "'class'", "'specializes'", "','", "':'", "';'", "'.'", "'abstract'"
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
    public static final int T__27=27;
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
    // InternalAlf.g:112:1: rulePackageDefinitionOrStub : ( ( rule__PackageDefinitionOrStub__Group__0 ) ) ;
    public final void rulePackageDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:116:2: ( ( ( rule__PackageDefinitionOrStub__Group__0 ) ) )
            // InternalAlf.g:117:2: ( ( rule__PackageDefinitionOrStub__Group__0 ) )
            {
            // InternalAlf.g:117:2: ( ( rule__PackageDefinitionOrStub__Group__0 ) )
            // InternalAlf.g:118:3: ( rule__PackageDefinitionOrStub__Group__0 )
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getGroup()); 
            // InternalAlf.g:119:3: ( rule__PackageDefinitionOrStub__Group__0 )
            // InternalAlf.g:119:4: rule__PackageDefinitionOrStub__Group__0
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
    // InternalAlf.g:128:1: entryRulePackagedElement : rulePackagedElement EOF ;
    public final void entryRulePackagedElement() throws RecognitionException {
        try {
            // InternalAlf.g:129:1: ( rulePackagedElement EOF )
            // InternalAlf.g:130:1: rulePackagedElement EOF
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
    // InternalAlf.g:137:1: rulePackagedElement : ( rulePackagedElementDefinition ) ;
    public final void rulePackagedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:141:2: ( ( rulePackagedElementDefinition ) )
            // InternalAlf.g:142:2: ( rulePackagedElementDefinition )
            {
            // InternalAlf.g:142:2: ( rulePackagedElementDefinition )
            // InternalAlf.g:143:3: rulePackagedElementDefinition
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
    // InternalAlf.g:153:1: entryRulePackagedElementDefinition : rulePackagedElementDefinition EOF ;
    public final void entryRulePackagedElementDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:154:1: ( rulePackagedElementDefinition EOF )
            // InternalAlf.g:155:1: rulePackagedElementDefinition EOF
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
    // InternalAlf.g:162:1: rulePackagedElementDefinition : ( ( rule__PackagedElementDefinition__Alternatives ) ) ;
    public final void rulePackagedElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:166:2: ( ( ( rule__PackagedElementDefinition__Alternatives ) ) )
            // InternalAlf.g:167:2: ( ( rule__PackagedElementDefinition__Alternatives ) )
            {
            // InternalAlf.g:167:2: ( ( rule__PackagedElementDefinition__Alternatives ) )
            // InternalAlf.g:168:3: ( rule__PackagedElementDefinition__Alternatives )
            {
             before(grammarAccess.getPackagedElementDefinitionAccess().getAlternatives()); 
            // InternalAlf.g:169:3: ( rule__PackagedElementDefinition__Alternatives )
            // InternalAlf.g:169:4: rule__PackagedElementDefinition__Alternatives
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
    // InternalAlf.g:178:1: entryRuleClassifierDefinitionOrStub : ruleClassifierDefinitionOrStub EOF ;
    public final void entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:179:1: ( ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:180:1: ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:187:1: ruleClassifierDefinitionOrStub : ( ruleClassDefinitionOrStub ) ;
    public final void ruleClassifierDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:191:2: ( ( ruleClassDefinitionOrStub ) )
            // InternalAlf.g:192:2: ( ruleClassDefinitionOrStub )
            {
            // InternalAlf.g:192:2: ( ruleClassDefinitionOrStub )
            // InternalAlf.g:193:3: ruleClassDefinitionOrStub
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
    // InternalAlf.g:203:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalAlf.g:204:1: ( ruleClassDeclaration EOF )
            // InternalAlf.g:205:1: ruleClassDeclaration EOF
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
    // InternalAlf.g:212:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:216:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalAlf.g:217:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalAlf.g:217:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalAlf.g:218:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalAlf.g:219:3: ( rule__ClassDeclaration__Group__0 )
            // InternalAlf.g:219:4: rule__ClassDeclaration__Group__0
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
    // InternalAlf.g:228:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:229:1: ( ruleGeneralization EOF )
            // InternalAlf.g:230:1: ruleGeneralization EOF
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
    // InternalAlf.g:237:1: ruleGeneralization : ( ( rule__Generalization__GeneralAssignment ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:241:2: ( ( ( rule__Generalization__GeneralAssignment ) ) )
            // InternalAlf.g:242:2: ( ( rule__Generalization__GeneralAssignment ) )
            {
            // InternalAlf.g:242:2: ( ( rule__Generalization__GeneralAssignment ) )
            // InternalAlf.g:243:3: ( rule__Generalization__GeneralAssignment )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment()); 
            // InternalAlf.g:244:3: ( rule__Generalization__GeneralAssignment )
            // InternalAlf.g:244:4: rule__Generalization__GeneralAssignment
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
    // InternalAlf.g:253:1: entryRuleClassDefinition : ruleClassDefinition EOF ;
    public final void entryRuleClassDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:254:1: ( ruleClassDefinition EOF )
            // InternalAlf.g:255:1: ruleClassDefinition EOF
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
    // InternalAlf.g:262:1: ruleClassDefinition : ( ( rule__ClassDefinition__Group__0 ) ) ;
    public final void ruleClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:266:2: ( ( ( rule__ClassDefinition__Group__0 ) ) )
            // InternalAlf.g:267:2: ( ( rule__ClassDefinition__Group__0 ) )
            {
            // InternalAlf.g:267:2: ( ( rule__ClassDefinition__Group__0 ) )
            // InternalAlf.g:268:3: ( rule__ClassDefinition__Group__0 )
            {
             before(grammarAccess.getClassDefinitionAccess().getGroup()); 
            // InternalAlf.g:269:3: ( rule__ClassDefinition__Group__0 )
            // InternalAlf.g:269:4: rule__ClassDefinition__Group__0
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
    // InternalAlf.g:278:1: entryRuleClassDefinitionOrStub : ruleClassDefinitionOrStub EOF ;
    public final void entryRuleClassDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:279:1: ( ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:280:1: ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:287:1: ruleClassDefinitionOrStub : ( ( rule__ClassDefinitionOrStub__Group__0 ) ) ;
    public final void ruleClassDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:291:2: ( ( ( rule__ClassDefinitionOrStub__Group__0 ) ) )
            // InternalAlf.g:292:2: ( ( rule__ClassDefinitionOrStub__Group__0 ) )
            {
            // InternalAlf.g:292:2: ( ( rule__ClassDefinitionOrStub__Group__0 ) )
            // InternalAlf.g:293:3: ( rule__ClassDefinitionOrStub__Group__0 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGroup()); 
            // InternalAlf.g:294:3: ( rule__ClassDefinitionOrStub__Group__0 )
            // InternalAlf.g:294:4: rule__ClassDefinitionOrStub__Group__0
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
    // InternalAlf.g:303:1: entryRuleClassMember : ruleClassMember EOF ;
    public final void entryRuleClassMember() throws RecognitionException {
        try {
            // InternalAlf.g:304:1: ( ruleClassMember EOF )
            // InternalAlf.g:305:1: ruleClassMember EOF
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
    // InternalAlf.g:312:1: ruleClassMember : ( ruleFeatureDefinition ) ;
    public final void ruleClassMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:316:2: ( ( ruleFeatureDefinition ) )
            // InternalAlf.g:317:2: ( ruleFeatureDefinition )
            {
            // InternalAlf.g:317:2: ( ruleFeatureDefinition )
            // InternalAlf.g:318:3: ruleFeatureDefinition
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


    // $ANTLR start "ruleVisibilityKind"
    // InternalAlf.g:403:1: ruleVisibilityKind : ( ( rule__VisibilityKind__Alternatives ) ) ;
    public final void ruleVisibilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:407:1: ( ( ( rule__VisibilityKind__Alternatives ) ) )
            // InternalAlf.g:408:2: ( ( rule__VisibilityKind__Alternatives ) )
            {
            // InternalAlf.g:408:2: ( ( rule__VisibilityKind__Alternatives ) )
            // InternalAlf.g:409:3: ( rule__VisibilityKind__Alternatives )
            {
             before(grammarAccess.getVisibilityKindAccess().getAlternatives()); 
            // InternalAlf.g:410:3: ( rule__VisibilityKind__Alternatives )
            // InternalAlf.g:410:4: rule__VisibilityKind__Alternatives
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


    // $ANTLR start "rule__UnitDefinition__Alternatives"
    // InternalAlf.g:418:1: rule__UnitDefinition__Alternatives : ( ( rulePackageDefinition ) | ( ruleClassDefinition ) );
    public final void rule__UnitDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:422:1: ( ( rulePackageDefinition ) | ( ruleClassDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==21||LA1_0==27) ) {
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


    // $ANTLR start "rule__PackagedElementDefinition__Alternatives"
    // InternalAlf.g:439:1: rule__PackagedElementDefinition__Alternatives : ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) );
    public final void rule__PackagedElementDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:443:1: ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==18) ) {
                    alt2=1;
                }
                else if ( (LA2_1==21||LA2_1==27) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==18) ) {
                    alt2=1;
                }
                else if ( (LA2_2==21||LA2_2==27) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==18) ) {
                    alt2=1;
                }
                else if ( (LA2_3==21||LA2_3==27) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAlf.g:444:2: ( rulePackageDefinitionOrStub )
                    {
                    // InternalAlf.g:444:2: ( rulePackageDefinitionOrStub )
                    // InternalAlf.g:445:3: rulePackageDefinitionOrStub
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
                    // InternalAlf.g:450:2: ( ruleClassifierDefinitionOrStub )
                    {
                    // InternalAlf.g:450:2: ( ruleClassifierDefinitionOrStub )
                    // InternalAlf.g:451:3: ruleClassifierDefinitionOrStub
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
    // InternalAlf.g:460:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:464:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_UNRESTRICTED_NAME) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlf.g:465:2: ( RULE_ID )
                    {
                    // InternalAlf.g:465:2: ( RULE_ID )
                    // InternalAlf.g:466:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:471:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:471:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:472:3: RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:481:1: rule__VisibilityKind__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__VisibilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:485:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
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
                    // InternalAlf.g:486:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:486:2: ( ( 'public' ) )
                    // InternalAlf.g:487:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:488:3: ( 'public' )
                    // InternalAlf.g:488:4: 'public'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:492:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:492:2: ( ( 'private' ) )
                    // InternalAlf.g:493:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:494:3: ( 'private' )
                    // InternalAlf.g:494:4: 'private'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:498:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:498:2: ( ( 'protected' ) )
                    // InternalAlf.g:499:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:500:3: ( 'protected' )
                    // InternalAlf.g:500:4: 'protected'
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
    // InternalAlf.g:508:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:512:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:513:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
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
    // InternalAlf.g:520:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:524:1: ( ( 'package' ) )
            // InternalAlf.g:525:1: ( 'package' )
            {
            // InternalAlf.g:525:1: ( 'package' )
            // InternalAlf.g:526:2: 'package'
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
    // InternalAlf.g:535:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:539:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:540:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
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
    // InternalAlf.g:547:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:551:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:552:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:552:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:553:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:554:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:554:3: rule__PackageDefinition__NameAssignment_1
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
    // InternalAlf.g:562:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:566:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:567:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
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
    // InternalAlf.g:574:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:578:1: ( ( '{' ) )
            // InternalAlf.g:579:1: ( '{' )
            {
            // InternalAlf.g:579:1: ( '{' )
            // InternalAlf.g:580:2: '{'
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
    // InternalAlf.g:589:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:593:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:594:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
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
    // InternalAlf.g:601:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__OwnedMemberAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:605:1: ( ( ( rule__PackageDefinition__OwnedMemberAssignment_3 )* ) )
            // InternalAlf.g:606:1: ( ( rule__PackageDefinition__OwnedMemberAssignment_3 )* )
            {
            // InternalAlf.g:606:1: ( ( rule__PackageDefinition__OwnedMemberAssignment_3 )* )
            // InternalAlf.g:607:2: ( rule__PackageDefinition__OwnedMemberAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getOwnedMemberAssignment_3()); 
            // InternalAlf.g:608:2: ( rule__PackageDefinition__OwnedMemberAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlf.g:608:3: rule__PackageDefinition__OwnedMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__OwnedMemberAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalAlf.g:616:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:620:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:621:2: rule__PackageDefinition__Group__4__Impl
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
    // InternalAlf.g:627:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:631:1: ( ( '}' ) )
            // InternalAlf.g:632:1: ( '}' )
            {
            // InternalAlf.g:632:1: ( '}' )
            // InternalAlf.g:633:2: '}'
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
    // InternalAlf.g:643:1: rule__PackageDefinitionOrStub__Group__0 : rule__PackageDefinitionOrStub__Group__0__Impl rule__PackageDefinitionOrStub__Group__1 ;
    public final void rule__PackageDefinitionOrStub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:647:1: ( rule__PackageDefinitionOrStub__Group__0__Impl rule__PackageDefinitionOrStub__Group__1 )
            // InternalAlf.g:648:2: rule__PackageDefinitionOrStub__Group__0__Impl rule__PackageDefinitionOrStub__Group__1
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
    // InternalAlf.g:655:1: rule__PackageDefinitionOrStub__Group__0__Impl : ( ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 ) ) ;
    public final void rule__PackageDefinitionOrStub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:659:1: ( ( ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 ) ) )
            // InternalAlf.g:660:1: ( ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 ) )
            {
            // InternalAlf.g:660:1: ( ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 ) )
            // InternalAlf.g:661:2: ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 )
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getPackageVisibilityAssignment_0()); 
            // InternalAlf.g:662:2: ( rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 )
            // InternalAlf.g:662:3: rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0
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
    // InternalAlf.g:670:1: rule__PackageDefinitionOrStub__Group__1 : rule__PackageDefinitionOrStub__Group__1__Impl rule__PackageDefinitionOrStub__Group__2 ;
    public final void rule__PackageDefinitionOrStub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:674:1: ( rule__PackageDefinitionOrStub__Group__1__Impl rule__PackageDefinitionOrStub__Group__2 )
            // InternalAlf.g:675:2: rule__PackageDefinitionOrStub__Group__1__Impl rule__PackageDefinitionOrStub__Group__2
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
    // InternalAlf.g:682:1: rule__PackageDefinitionOrStub__Group__1__Impl : ( 'package' ) ;
    public final void rule__PackageDefinitionOrStub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:686:1: ( ( 'package' ) )
            // InternalAlf.g:687:1: ( 'package' )
            {
            // InternalAlf.g:687:1: ( 'package' )
            // InternalAlf.g:688:2: 'package'
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
    // InternalAlf.g:697:1: rule__PackageDefinitionOrStub__Group__2 : rule__PackageDefinitionOrStub__Group__2__Impl rule__PackageDefinitionOrStub__Group__3 ;
    public final void rule__PackageDefinitionOrStub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:701:1: ( rule__PackageDefinitionOrStub__Group__2__Impl rule__PackageDefinitionOrStub__Group__3 )
            // InternalAlf.g:702:2: rule__PackageDefinitionOrStub__Group__2__Impl rule__PackageDefinitionOrStub__Group__3
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
    // InternalAlf.g:709:1: rule__PackageDefinitionOrStub__Group__2__Impl : ( ( rule__PackageDefinitionOrStub__NameAssignment_2 ) ) ;
    public final void rule__PackageDefinitionOrStub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:713:1: ( ( ( rule__PackageDefinitionOrStub__NameAssignment_2 ) ) )
            // InternalAlf.g:714:1: ( ( rule__PackageDefinitionOrStub__NameAssignment_2 ) )
            {
            // InternalAlf.g:714:1: ( ( rule__PackageDefinitionOrStub__NameAssignment_2 ) )
            // InternalAlf.g:715:2: ( rule__PackageDefinitionOrStub__NameAssignment_2 )
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getNameAssignment_2()); 
            // InternalAlf.g:716:2: ( rule__PackageDefinitionOrStub__NameAssignment_2 )
            // InternalAlf.g:716:3: rule__PackageDefinitionOrStub__NameAssignment_2
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
    // InternalAlf.g:724:1: rule__PackageDefinitionOrStub__Group__3 : rule__PackageDefinitionOrStub__Group__3__Impl rule__PackageDefinitionOrStub__Group__4 ;
    public final void rule__PackageDefinitionOrStub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:728:1: ( rule__PackageDefinitionOrStub__Group__3__Impl rule__PackageDefinitionOrStub__Group__4 )
            // InternalAlf.g:729:2: rule__PackageDefinitionOrStub__Group__3__Impl rule__PackageDefinitionOrStub__Group__4
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
    // InternalAlf.g:736:1: rule__PackageDefinitionOrStub__Group__3__Impl : ( '{' ) ;
    public final void rule__PackageDefinitionOrStub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:740:1: ( ( '{' ) )
            // InternalAlf.g:741:1: ( '{' )
            {
            // InternalAlf.g:741:1: ( '{' )
            // InternalAlf.g:742:2: '{'
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
    // InternalAlf.g:751:1: rule__PackageDefinitionOrStub__Group__4 : rule__PackageDefinitionOrStub__Group__4__Impl rule__PackageDefinitionOrStub__Group__5 ;
    public final void rule__PackageDefinitionOrStub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:755:1: ( rule__PackageDefinitionOrStub__Group__4__Impl rule__PackageDefinitionOrStub__Group__5 )
            // InternalAlf.g:756:2: rule__PackageDefinitionOrStub__Group__4__Impl rule__PackageDefinitionOrStub__Group__5
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
    // InternalAlf.g:763:1: rule__PackageDefinitionOrStub__Group__4__Impl : ( ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )* ) ;
    public final void rule__PackageDefinitionOrStub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:767:1: ( ( ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )* ) )
            // InternalAlf.g:768:1: ( ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )* )
            {
            // InternalAlf.g:768:1: ( ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )* )
            // InternalAlf.g:769:2: ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )*
            {
             before(grammarAccess.getPackageDefinitionOrStubAccess().getOwnedMemberAssignment_4()); 
            // InternalAlf.g:770:2: ( rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAlf.g:770:3: rule__PackageDefinitionOrStub__OwnedMemberAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinitionOrStub__OwnedMemberAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalAlf.g:778:1: rule__PackageDefinitionOrStub__Group__5 : rule__PackageDefinitionOrStub__Group__5__Impl ;
    public final void rule__PackageDefinitionOrStub__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:782:1: ( rule__PackageDefinitionOrStub__Group__5__Impl )
            // InternalAlf.g:783:2: rule__PackageDefinitionOrStub__Group__5__Impl
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
    // InternalAlf.g:789:1: rule__PackageDefinitionOrStub__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDefinitionOrStub__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:793:1: ( ( '}' ) )
            // InternalAlf.g:794:1: ( '}' )
            {
            // InternalAlf.g:794:1: ( '}' )
            // InternalAlf.g:795:2: '}'
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
    // InternalAlf.g:805:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:809:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:810:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
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
    // InternalAlf.g:817:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:821:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:822:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:822:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:823:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:824:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:824:3: rule__ClassDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:832:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:836:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:837:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalAlf.g:844:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:848:1: ( ( 'class' ) )
            // InternalAlf.g:849:1: ( 'class' )
            {
            // InternalAlf.g:849:1: ( 'class' )
            // InternalAlf.g:850:2: 'class'
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
    // InternalAlf.g:859:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:863:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:864:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
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
    // InternalAlf.g:871:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:875:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:876:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:876:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:877:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:878:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:878:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalAlf.g:886:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:890:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:891:2: rule__ClassDeclaration__Group__3__Impl
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
    // InternalAlf.g:897:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:901:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:902:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:902:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:903:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:904:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:904:3: rule__ClassDeclaration__Group_3__0
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
    // InternalAlf.g:913:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:917:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:918:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalAlf.g:925:1: rule__ClassDeclaration__Group_3__0__Impl : ( 'specializes' ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:929:1: ( ( 'specializes' ) )
            // InternalAlf.g:930:1: ( 'specializes' )
            {
            // InternalAlf.g:930:1: ( 'specializes' )
            // InternalAlf.g:931:2: 'specializes'
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
    // InternalAlf.g:940:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:944:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalAlf.g:945:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalAlf.g:952:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:956:1: ( ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) ) )
            // InternalAlf.g:957:1: ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) )
            {
            // InternalAlf.g:957:1: ( ( rule__ClassDeclaration__GeneralizationAssignment_3_1 ) )
            // InternalAlf.g:958:2: ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGeneralizationAssignment_3_1()); 
            // InternalAlf.g:959:2: ( rule__ClassDeclaration__GeneralizationAssignment_3_1 )
            // InternalAlf.g:959:3: rule__ClassDeclaration__GeneralizationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__GeneralizationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGeneralizationAssignment_3_1()); 

            }


            }

        }
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
    // InternalAlf.g:967:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:971:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalAlf.g:972:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:978:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:982:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:983:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:983:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:984:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:985:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAlf.g:985:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalAlf.g:994:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:998:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalAlf.g:999:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalAlf.g:1006:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1010:1: ( ( ',' ) )
            // InternalAlf.g:1011:1: ( ',' )
            {
            // InternalAlf.g:1011:1: ( ',' )
            // InternalAlf.g:1012:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAlf.g:1021:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1025:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:1026:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:1032:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__GeneralizationAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1036:1: ( ( ( rule__ClassDeclaration__GeneralizationAssignment_3_2_1 ) ) )
            // InternalAlf.g:1037:1: ( ( rule__ClassDeclaration__GeneralizationAssignment_3_2_1 ) )
            {
            // InternalAlf.g:1037:1: ( ( rule__ClassDeclaration__GeneralizationAssignment_3_2_1 ) )
            // InternalAlf.g:1038:2: ( rule__ClassDeclaration__GeneralizationAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGeneralizationAssignment_3_2_1()); 
            // InternalAlf.g:1039:2: ( rule__ClassDeclaration__GeneralizationAssignment_3_2_1 )
            // InternalAlf.g:1039:3: rule__ClassDeclaration__GeneralizationAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__GeneralizationAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGeneralizationAssignment_3_2_1()); 

            }


            }

        }
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
    // InternalAlf.g:1048:1: rule__ClassDefinition__Group__0 : rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 ;
    public final void rule__ClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1052:1: ( rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 )
            // InternalAlf.g:1053:2: rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1
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
    // InternalAlf.g:1060:1: rule__ClassDefinition__Group__0__Impl : ( ruleClassDeclaration ) ;
    public final void rule__ClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1064:1: ( ( ruleClassDeclaration ) )
            // InternalAlf.g:1065:1: ( ruleClassDeclaration )
            {
            // InternalAlf.g:1065:1: ( ruleClassDeclaration )
            // InternalAlf.g:1066:2: ruleClassDeclaration
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
    // InternalAlf.g:1075:1: rule__ClassDefinition__Group__1 : rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 ;
    public final void rule__ClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1079:1: ( rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 )
            // InternalAlf.g:1080:2: rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalAlf.g:1087:1: rule__ClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1091:1: ( ( '{' ) )
            // InternalAlf.g:1092:1: ( '{' )
            {
            // InternalAlf.g:1092:1: ( '{' )
            // InternalAlf.g:1093:2: '{'
            {
             before(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAlf.g:1102:1: rule__ClassDefinition__Group__2 : rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 ;
    public final void rule__ClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1106:1: ( rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 )
            // InternalAlf.g:1107:2: rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalAlf.g:1114:1: rule__ClassDefinition__Group__2__Impl : ( ( rule__ClassDefinition__OwnedFeatureAssignment_2 )* ) ;
    public final void rule__ClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1118:1: ( ( ( rule__ClassDefinition__OwnedFeatureAssignment_2 )* ) )
            // InternalAlf.g:1119:1: ( ( rule__ClassDefinition__OwnedFeatureAssignment_2 )* )
            {
            // InternalAlf.g:1119:1: ( ( rule__ClassDefinition__OwnedFeatureAssignment_2 )* )
            // InternalAlf.g:1120:2: ( rule__ClassDefinition__OwnedFeatureAssignment_2 )*
            {
             before(grammarAccess.getClassDefinitionAccess().getOwnedFeatureAssignment_2()); 
            // InternalAlf.g:1121:2: ( rule__ClassDefinition__OwnedFeatureAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_UNRESTRICTED_NAME)||(LA10_0>=15 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:1121:3: rule__ClassDefinition__OwnedFeatureAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ClassDefinition__OwnedFeatureAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassDefinitionAccess().getOwnedFeatureAssignment_2()); 

            }


            }

        }
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
    // InternalAlf.g:1129:1: rule__ClassDefinition__Group__3 : rule__ClassDefinition__Group__3__Impl ;
    public final void rule__ClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1133:1: ( rule__ClassDefinition__Group__3__Impl )
            // InternalAlf.g:1134:2: rule__ClassDefinition__Group__3__Impl
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
    // InternalAlf.g:1140:1: rule__ClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__ClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1144:1: ( ( '}' ) )
            // InternalAlf.g:1145:1: ( '}' )
            {
            // InternalAlf.g:1145:1: ( '}' )
            // InternalAlf.g:1146:2: '}'
            {
             before(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__ClassDefinitionOrStub__Group__0"
    // InternalAlf.g:1156:1: rule__ClassDefinitionOrStub__Group__0 : rule__ClassDefinitionOrStub__Group__0__Impl rule__ClassDefinitionOrStub__Group__1 ;
    public final void rule__ClassDefinitionOrStub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1160:1: ( rule__ClassDefinitionOrStub__Group__0__Impl rule__ClassDefinitionOrStub__Group__1 )
            // InternalAlf.g:1161:2: rule__ClassDefinitionOrStub__Group__0__Impl rule__ClassDefinitionOrStub__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAlf.g:1168:1: rule__ClassDefinitionOrStub__Group__0__Impl : ( ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 ) ) ;
    public final void rule__ClassDefinitionOrStub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1172:1: ( ( ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 ) ) )
            // InternalAlf.g:1173:1: ( ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 ) )
            {
            // InternalAlf.g:1173:1: ( ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 ) )
            // InternalAlf.g:1174:2: ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getPackageVisibilityAssignment_0()); 
            // InternalAlf.g:1175:2: ( rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 )
            // InternalAlf.g:1175:3: rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0
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
    // InternalAlf.g:1183:1: rule__ClassDefinitionOrStub__Group__1 : rule__ClassDefinitionOrStub__Group__1__Impl rule__ClassDefinitionOrStub__Group__2 ;
    public final void rule__ClassDefinitionOrStub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1187:1: ( rule__ClassDefinitionOrStub__Group__1__Impl rule__ClassDefinitionOrStub__Group__2 )
            // InternalAlf.g:1188:2: rule__ClassDefinitionOrStub__Group__1__Impl rule__ClassDefinitionOrStub__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAlf.g:1195:1: rule__ClassDefinitionOrStub__Group__1__Impl : ( ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )? ) ;
    public final void rule__ClassDefinitionOrStub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1199:1: ( ( ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )? ) )
            // InternalAlf.g:1200:1: ( ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )? )
            {
            // InternalAlf.g:1200:1: ( ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )? )
            // InternalAlf.g:1201:2: ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )?
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAssignment_1()); 
            // InternalAlf.g:1202:2: ( rule__ClassDefinitionOrStub__IsAbstractAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:1202:3: rule__ClassDefinitionOrStub__IsAbstractAssignment_1
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
    // InternalAlf.g:1210:1: rule__ClassDefinitionOrStub__Group__2 : rule__ClassDefinitionOrStub__Group__2__Impl rule__ClassDefinitionOrStub__Group__3 ;
    public final void rule__ClassDefinitionOrStub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1214:1: ( rule__ClassDefinitionOrStub__Group__2__Impl rule__ClassDefinitionOrStub__Group__3 )
            // InternalAlf.g:1215:2: rule__ClassDefinitionOrStub__Group__2__Impl rule__ClassDefinitionOrStub__Group__3
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
    // InternalAlf.g:1222:1: rule__ClassDefinitionOrStub__Group__2__Impl : ( 'class' ) ;
    public final void rule__ClassDefinitionOrStub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1226:1: ( ( 'class' ) )
            // InternalAlf.g:1227:1: ( 'class' )
            {
            // InternalAlf.g:1227:1: ( 'class' )
            // InternalAlf.g:1228:2: 'class'
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
    // InternalAlf.g:1237:1: rule__ClassDefinitionOrStub__Group__3 : rule__ClassDefinitionOrStub__Group__3__Impl rule__ClassDefinitionOrStub__Group__4 ;
    public final void rule__ClassDefinitionOrStub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1241:1: ( rule__ClassDefinitionOrStub__Group__3__Impl rule__ClassDefinitionOrStub__Group__4 )
            // InternalAlf.g:1242:2: rule__ClassDefinitionOrStub__Group__3__Impl rule__ClassDefinitionOrStub__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalAlf.g:1249:1: rule__ClassDefinitionOrStub__Group__3__Impl : ( ( rule__ClassDefinitionOrStub__NameAssignment_3 ) ) ;
    public final void rule__ClassDefinitionOrStub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1253:1: ( ( ( rule__ClassDefinitionOrStub__NameAssignment_3 ) ) )
            // InternalAlf.g:1254:1: ( ( rule__ClassDefinitionOrStub__NameAssignment_3 ) )
            {
            // InternalAlf.g:1254:1: ( ( rule__ClassDefinitionOrStub__NameAssignment_3 ) )
            // InternalAlf.g:1255:2: ( rule__ClassDefinitionOrStub__NameAssignment_3 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getNameAssignment_3()); 
            // InternalAlf.g:1256:2: ( rule__ClassDefinitionOrStub__NameAssignment_3 )
            // InternalAlf.g:1256:3: rule__ClassDefinitionOrStub__NameAssignment_3
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
    // InternalAlf.g:1264:1: rule__ClassDefinitionOrStub__Group__4 : rule__ClassDefinitionOrStub__Group__4__Impl rule__ClassDefinitionOrStub__Group__5 ;
    public final void rule__ClassDefinitionOrStub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1268:1: ( rule__ClassDefinitionOrStub__Group__4__Impl rule__ClassDefinitionOrStub__Group__5 )
            // InternalAlf.g:1269:2: rule__ClassDefinitionOrStub__Group__4__Impl rule__ClassDefinitionOrStub__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalAlf.g:1276:1: rule__ClassDefinitionOrStub__Group__4__Impl : ( ( rule__ClassDefinitionOrStub__Group_4__0 )? ) ;
    public final void rule__ClassDefinitionOrStub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1280:1: ( ( ( rule__ClassDefinitionOrStub__Group_4__0 )? ) )
            // InternalAlf.g:1281:1: ( ( rule__ClassDefinitionOrStub__Group_4__0 )? )
            {
            // InternalAlf.g:1281:1: ( ( rule__ClassDefinitionOrStub__Group_4__0 )? )
            // InternalAlf.g:1282:2: ( rule__ClassDefinitionOrStub__Group_4__0 )?
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGroup_4()); 
            // InternalAlf.g:1283:2: ( rule__ClassDefinitionOrStub__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:1283:3: rule__ClassDefinitionOrStub__Group_4__0
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
    // InternalAlf.g:1291:1: rule__ClassDefinitionOrStub__Group__5 : rule__ClassDefinitionOrStub__Group__5__Impl rule__ClassDefinitionOrStub__Group__6 ;
    public final void rule__ClassDefinitionOrStub__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1295:1: ( rule__ClassDefinitionOrStub__Group__5__Impl rule__ClassDefinitionOrStub__Group__6 )
            // InternalAlf.g:1296:2: rule__ClassDefinitionOrStub__Group__5__Impl rule__ClassDefinitionOrStub__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalAlf.g:1303:1: rule__ClassDefinitionOrStub__Group__5__Impl : ( '{' ) ;
    public final void rule__ClassDefinitionOrStub__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1307:1: ( ( '{' ) )
            // InternalAlf.g:1308:1: ( '{' )
            {
            // InternalAlf.g:1308:1: ( '{' )
            // InternalAlf.g:1309:2: '{'
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
    // InternalAlf.g:1318:1: rule__ClassDefinitionOrStub__Group__6 : rule__ClassDefinitionOrStub__Group__6__Impl rule__ClassDefinitionOrStub__Group__7 ;
    public final void rule__ClassDefinitionOrStub__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1322:1: ( rule__ClassDefinitionOrStub__Group__6__Impl rule__ClassDefinitionOrStub__Group__7 )
            // InternalAlf.g:1323:2: rule__ClassDefinitionOrStub__Group__6__Impl rule__ClassDefinitionOrStub__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalAlf.g:1330:1: rule__ClassDefinitionOrStub__Group__6__Impl : ( ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )* ) ;
    public final void rule__ClassDefinitionOrStub__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1334:1: ( ( ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )* ) )
            // InternalAlf.g:1335:1: ( ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )* )
            {
            // InternalAlf.g:1335:1: ( ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )* )
            // InternalAlf.g:1336:2: ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )*
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getOwnedFeatureAssignment_6()); 
            // InternalAlf.g:1337:2: ( rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_UNRESTRICTED_NAME)||(LA13_0>=15 && LA13_0<=17)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAlf.g:1337:3: rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalAlf.g:1345:1: rule__ClassDefinitionOrStub__Group__7 : rule__ClassDefinitionOrStub__Group__7__Impl ;
    public final void rule__ClassDefinitionOrStub__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1349:1: ( rule__ClassDefinitionOrStub__Group__7__Impl )
            // InternalAlf.g:1350:2: rule__ClassDefinitionOrStub__Group__7__Impl
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
    // InternalAlf.g:1356:1: rule__ClassDefinitionOrStub__Group__7__Impl : ( '}' ) ;
    public final void rule__ClassDefinitionOrStub__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1360:1: ( ( '}' ) )
            // InternalAlf.g:1361:1: ( '}' )
            {
            // InternalAlf.g:1361:1: ( '}' )
            // InternalAlf.g:1362:2: '}'
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
    // InternalAlf.g:1372:1: rule__ClassDefinitionOrStub__Group_4__0 : rule__ClassDefinitionOrStub__Group_4__0__Impl rule__ClassDefinitionOrStub__Group_4__1 ;
    public final void rule__ClassDefinitionOrStub__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1376:1: ( rule__ClassDefinitionOrStub__Group_4__0__Impl rule__ClassDefinitionOrStub__Group_4__1 )
            // InternalAlf.g:1377:2: rule__ClassDefinitionOrStub__Group_4__0__Impl rule__ClassDefinitionOrStub__Group_4__1
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
    // InternalAlf.g:1384:1: rule__ClassDefinitionOrStub__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__ClassDefinitionOrStub__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1388:1: ( ( 'specializes' ) )
            // InternalAlf.g:1389:1: ( 'specializes' )
            {
            // InternalAlf.g:1389:1: ( 'specializes' )
            // InternalAlf.g:1390:2: 'specializes'
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
    // InternalAlf.g:1399:1: rule__ClassDefinitionOrStub__Group_4__1 : rule__ClassDefinitionOrStub__Group_4__1__Impl rule__ClassDefinitionOrStub__Group_4__2 ;
    public final void rule__ClassDefinitionOrStub__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1403:1: ( rule__ClassDefinitionOrStub__Group_4__1__Impl rule__ClassDefinitionOrStub__Group_4__2 )
            // InternalAlf.g:1404:2: rule__ClassDefinitionOrStub__Group_4__1__Impl rule__ClassDefinitionOrStub__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__ClassDefinitionOrStub__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalAlf.g:1411:1: rule__ClassDefinitionOrStub__Group_4__1__Impl : ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) ) ;
    public final void rule__ClassDefinitionOrStub__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1415:1: ( ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) ) )
            // InternalAlf.g:1416:1: ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) )
            {
            // InternalAlf.g:1416:1: ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 ) )
            // InternalAlf.g:1417:2: ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationAssignment_4_1()); 
            // InternalAlf.g:1418:2: ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 )
            // InternalAlf.g:1418:3: rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4__2"
    // InternalAlf.g:1426:1: rule__ClassDefinitionOrStub__Group_4__2 : rule__ClassDefinitionOrStub__Group_4__2__Impl ;
    public final void rule__ClassDefinitionOrStub__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1430:1: ( rule__ClassDefinitionOrStub__Group_4__2__Impl )
            // InternalAlf.g:1431:2: rule__ClassDefinitionOrStub__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4__2"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4__2__Impl"
    // InternalAlf.g:1437:1: rule__ClassDefinitionOrStub__Group_4__2__Impl : ( ( rule__ClassDefinitionOrStub__Group_4_2__0 )* ) ;
    public final void rule__ClassDefinitionOrStub__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1441:1: ( ( ( rule__ClassDefinitionOrStub__Group_4_2__0 )* ) )
            // InternalAlf.g:1442:1: ( ( rule__ClassDefinitionOrStub__Group_4_2__0 )* )
            {
            // InternalAlf.g:1442:1: ( ( rule__ClassDefinitionOrStub__Group_4_2__0 )* )
            // InternalAlf.g:1443:2: ( rule__ClassDefinitionOrStub__Group_4_2__0 )*
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGroup_4_2()); 
            // InternalAlf.g:1444:2: ( rule__ClassDefinitionOrStub__Group_4_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAlf.g:1444:3: rule__ClassDefinitionOrStub__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ClassDefinitionOrStub__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getClassDefinitionOrStubAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4__2__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4_2__0"
    // InternalAlf.g:1453:1: rule__ClassDefinitionOrStub__Group_4_2__0 : rule__ClassDefinitionOrStub__Group_4_2__0__Impl rule__ClassDefinitionOrStub__Group_4_2__1 ;
    public final void rule__ClassDefinitionOrStub__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1457:1: ( rule__ClassDefinitionOrStub__Group_4_2__0__Impl rule__ClassDefinitionOrStub__Group_4_2__1 )
            // InternalAlf.g:1458:2: rule__ClassDefinitionOrStub__Group_4_2__0__Impl rule__ClassDefinitionOrStub__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDefinitionOrStub__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4_2__0"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4_2__0__Impl"
    // InternalAlf.g:1465:1: rule__ClassDefinitionOrStub__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDefinitionOrStub__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1469:1: ( ( ',' ) )
            // InternalAlf.g:1470:1: ( ',' )
            {
            // InternalAlf.g:1470:1: ( ',' )
            // InternalAlf.g:1471:2: ','
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getCommaKeyword_4_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassDefinitionOrStubAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4_2__0__Impl"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4_2__1"
    // InternalAlf.g:1480:1: rule__ClassDefinitionOrStub__Group_4_2__1 : rule__ClassDefinitionOrStub__Group_4_2__1__Impl ;
    public final void rule__ClassDefinitionOrStub__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1484:1: ( rule__ClassDefinitionOrStub__Group_4_2__1__Impl )
            // InternalAlf.g:1485:2: rule__ClassDefinitionOrStub__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4_2__1"


    // $ANTLR start "rule__ClassDefinitionOrStub__Group_4_2__1__Impl"
    // InternalAlf.g:1491:1: rule__ClassDefinitionOrStub__Group_4_2__1__Impl : ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1 ) ) ;
    public final void rule__ClassDefinitionOrStub__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1495:1: ( ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1 ) ) )
            // InternalAlf.g:1496:1: ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1 ) )
            {
            // InternalAlf.g:1496:1: ( ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1 ) )
            // InternalAlf.g:1497:2: ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1 )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationAssignment_4_2_1()); 
            // InternalAlf.g:1498:2: ( rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1 )
            // InternalAlf.g:1498:3: rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__Group_4_2__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group__0"
    // InternalAlf.g:1507:1: rule__FeatureDefinition__Group__0 : rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1 ;
    public final void rule__FeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1511:1: ( rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1 )
            // InternalAlf.g:1512:2: rule__FeatureDefinition__Group__0__Impl rule__FeatureDefinition__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAlf.g:1519:1: rule__FeatureDefinition__Group__0__Impl : ( ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )? ) ;
    public final void rule__FeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1523:1: ( ( ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )? ) )
            // InternalAlf.g:1524:1: ( ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )? )
            {
            // InternalAlf.g:1524:1: ( ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )? )
            // InternalAlf.g:1525:2: ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getMethodVisibilityAssignment_0()); 
            // InternalAlf.g:1526:2: ( rule__FeatureDefinition__MethodVisibilityAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=15 && LA15_0<=17)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:1526:3: rule__FeatureDefinition__MethodVisibilityAssignment_0
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
    // InternalAlf.g:1534:1: rule__FeatureDefinition__Group__1 : rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2 ;
    public final void rule__FeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1538:1: ( rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2 )
            // InternalAlf.g:1539:2: rule__FeatureDefinition__Group__1__Impl rule__FeatureDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalAlf.g:1546:1: rule__FeatureDefinition__Group__1__Impl : ( ( rule__FeatureDefinition__NameAssignment_1 ) ) ;
    public final void rule__FeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1550:1: ( ( ( rule__FeatureDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:1551:1: ( ( rule__FeatureDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:1551:1: ( ( rule__FeatureDefinition__NameAssignment_1 ) )
            // InternalAlf.g:1552:2: ( rule__FeatureDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:1553:2: ( rule__FeatureDefinition__NameAssignment_1 )
            // InternalAlf.g:1553:3: rule__FeatureDefinition__NameAssignment_1
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
    // InternalAlf.g:1561:1: rule__FeatureDefinition__Group__2 : rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3 ;
    public final void rule__FeatureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1565:1: ( rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3 )
            // InternalAlf.g:1566:2: rule__FeatureDefinition__Group__2__Impl rule__FeatureDefinition__Group__3
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
    // InternalAlf.g:1573:1: rule__FeatureDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__FeatureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1577:1: ( ( ':' ) )
            // InternalAlf.g:1578:1: ( ':' )
            {
            // InternalAlf.g:1578:1: ( ':' )
            // InternalAlf.g:1579:2: ':'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAlf.g:1588:1: rule__FeatureDefinition__Group__3 : rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4 ;
    public final void rule__FeatureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1592:1: ( rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4 )
            // InternalAlf.g:1593:2: rule__FeatureDefinition__Group__3__Impl rule__FeatureDefinition__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalAlf.g:1600:1: rule__FeatureDefinition__Group__3__Impl : ( ( rule__FeatureDefinition__DefiningTypeAssignment_3 ) ) ;
    public final void rule__FeatureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1604:1: ( ( ( rule__FeatureDefinition__DefiningTypeAssignment_3 ) ) )
            // InternalAlf.g:1605:1: ( ( rule__FeatureDefinition__DefiningTypeAssignment_3 ) )
            {
            // InternalAlf.g:1605:1: ( ( rule__FeatureDefinition__DefiningTypeAssignment_3 ) )
            // InternalAlf.g:1606:2: ( rule__FeatureDefinition__DefiningTypeAssignment_3 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getDefiningTypeAssignment_3()); 
            // InternalAlf.g:1607:2: ( rule__FeatureDefinition__DefiningTypeAssignment_3 )
            // InternalAlf.g:1607:3: rule__FeatureDefinition__DefiningTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__DefiningTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getDefiningTypeAssignment_3()); 

            }


            }

        }
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
    // InternalAlf.g:1615:1: rule__FeatureDefinition__Group__4 : rule__FeatureDefinition__Group__4__Impl ;
    public final void rule__FeatureDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1619:1: ( rule__FeatureDefinition__Group__4__Impl )
            // InternalAlf.g:1620:2: rule__FeatureDefinition__Group__4__Impl
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
    // InternalAlf.g:1626:1: rule__FeatureDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__FeatureDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1630:1: ( ( ';' ) )
            // InternalAlf.g:1631:1: ( ';' )
            {
            // InternalAlf.g:1631:1: ( ';' )
            // InternalAlf.g:1632:2: ';'
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
    // InternalAlf.g:1642:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1646:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:1647:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAlf.g:1654:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1658:1: ( ( ruleName ) )
            // InternalAlf.g:1659:1: ( ruleName )
            {
            // InternalAlf.g:1659:1: ( ruleName )
            // InternalAlf.g:1660:2: ruleName
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
    // InternalAlf.g:1669:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1673:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:1674:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:1680:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1684:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:1685:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:1685:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:1686:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:1687:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAlf.g:1687:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAlf.g:1696:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1700:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:1701:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAlf.g:1708:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1712:1: ( ( '.' ) )
            // InternalAlf.g:1713:1: ( '.' )
            {
            // InternalAlf.g:1713:1: ( '.' )
            // InternalAlf.g:1714:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAlf.g:1723:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1727:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:1728:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAlf.g:1734:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1738:1: ( ( ruleName ) )
            // InternalAlf.g:1739:1: ( ruleName )
            {
            // InternalAlf.g:1739:1: ( ruleName )
            // InternalAlf.g:1740:2: ruleName
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
    // InternalAlf.g:1750:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1754:1: ( ( ruleName ) )
            // InternalAlf.g:1755:2: ( ruleName )
            {
            // InternalAlf.g:1755:2: ( ruleName )
            // InternalAlf.g:1756:3: ruleName
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
    // InternalAlf.g:1765:1: rule__PackageDefinition__OwnedMemberAssignment_3 : ( rulePackagedElement ) ;
    public final void rule__PackageDefinition__OwnedMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1769:1: ( ( rulePackagedElement ) )
            // InternalAlf.g:1770:2: ( rulePackagedElement )
            {
            // InternalAlf.g:1770:2: ( rulePackagedElement )
            // InternalAlf.g:1771:3: rulePackagedElement
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
    // InternalAlf.g:1780:1: rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0 : ( ruleVisibilityKind ) ;
    public final void rule__PackageDefinitionOrStub__PackageVisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1784:1: ( ( ruleVisibilityKind ) )
            // InternalAlf.g:1785:2: ( ruleVisibilityKind )
            {
            // InternalAlf.g:1785:2: ( ruleVisibilityKind )
            // InternalAlf.g:1786:3: ruleVisibilityKind
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
    // InternalAlf.g:1795:1: rule__PackageDefinitionOrStub__NameAssignment_2 : ( ruleName ) ;
    public final void rule__PackageDefinitionOrStub__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1799:1: ( ( ruleName ) )
            // InternalAlf.g:1800:2: ( ruleName )
            {
            // InternalAlf.g:1800:2: ( ruleName )
            // InternalAlf.g:1801:3: ruleName
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
    // InternalAlf.g:1810:1: rule__PackageDefinitionOrStub__OwnedMemberAssignment_4 : ( rulePackagedElement ) ;
    public final void rule__PackageDefinitionOrStub__OwnedMemberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1814:1: ( ( rulePackagedElement ) )
            // InternalAlf.g:1815:2: ( rulePackagedElement )
            {
            // InternalAlf.g:1815:2: ( rulePackagedElement )
            // InternalAlf.g:1816:3: rulePackagedElement
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
    // InternalAlf.g:1825:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1829:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:1830:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:1830:2: ( ( 'abstract' ) )
            // InternalAlf.g:1831:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:1832:3: ( 'abstract' )
            // InternalAlf.g:1833:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAlf.g:1844:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1848:1: ( ( ruleName ) )
            // InternalAlf.g:1849:2: ( ruleName )
            {
            // InternalAlf.g:1849:2: ( ruleName )
            // InternalAlf.g:1850:3: ruleName
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
    // InternalAlf.g:1859:1: rule__ClassDeclaration__GeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDeclaration__GeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1863:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:1864:2: ( ruleGeneralization )
            {
            // InternalAlf.g:1864:2: ( ruleGeneralization )
            // InternalAlf.g:1865:3: ruleGeneralization
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


    // $ANTLR start "rule__ClassDeclaration__GeneralizationAssignment_3_2_1"
    // InternalAlf.g:1874:1: rule__ClassDeclaration__GeneralizationAssignment_3_2_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDeclaration__GeneralizationAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1878:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:1879:2: ( ruleGeneralization )
            {
            // InternalAlf.g:1879:2: ( ruleGeneralization )
            // InternalAlf.g:1880:3: ruleGeneralization
            {
             before(grammarAccess.getClassDeclarationAccess().getGeneralizationGeneralizationParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getGeneralizationGeneralizationParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__GeneralizationAssignment_3_2_1"


    // $ANTLR start "rule__Generalization__GeneralAssignment"
    // InternalAlf.g:1889:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1893:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1894:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1894:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1895:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:1896:3: ( ruleQualifiedName )
            // InternalAlf.g:1897:4: ruleQualifiedName
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


    // $ANTLR start "rule__ClassDefinition__OwnedFeatureAssignment_2"
    // InternalAlf.g:1908:1: rule__ClassDefinition__OwnedFeatureAssignment_2 : ( ruleClassMember ) ;
    public final void rule__ClassDefinition__OwnedFeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1912:1: ( ( ruleClassMember ) )
            // InternalAlf.g:1913:2: ( ruleClassMember )
            {
            // InternalAlf.g:1913:2: ( ruleClassMember )
            // InternalAlf.g:1914:3: ruleClassMember
            {
             before(grammarAccess.getClassDefinitionAccess().getOwnedFeatureClassMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getClassDefinitionAccess().getOwnedFeatureClassMemberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinition__OwnedFeatureAssignment_2"


    // $ANTLR start "rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0"
    // InternalAlf.g:1923:1: rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0 : ( ruleVisibilityKind ) ;
    public final void rule__ClassDefinitionOrStub__PackageVisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1927:1: ( ( ruleVisibilityKind ) )
            // InternalAlf.g:1928:2: ( ruleVisibilityKind )
            {
            // InternalAlf.g:1928:2: ( ruleVisibilityKind )
            // InternalAlf.g:1929:3: ruleVisibilityKind
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
    // InternalAlf.g:1938:1: rule__ClassDefinitionOrStub__IsAbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDefinitionOrStub__IsAbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1942:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:1943:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:1943:2: ( ( 'abstract' ) )
            // InternalAlf.g:1944:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAbstractKeyword_1_0()); 
            // InternalAlf.g:1945:3: ( 'abstract' )
            // InternalAlf.g:1946:4: 'abstract'
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAbstractKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAlf.g:1957:1: rule__ClassDefinitionOrStub__NameAssignment_3 : ( ruleName ) ;
    public final void rule__ClassDefinitionOrStub__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1961:1: ( ( ruleName ) )
            // InternalAlf.g:1962:2: ( ruleName )
            {
            // InternalAlf.g:1962:2: ( ruleName )
            // InternalAlf.g:1963:3: ruleName
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
    // InternalAlf.g:1972:1: rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDefinitionOrStub__GeneralizationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1976:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:1977:2: ( ruleGeneralization )
            {
            // InternalAlf.g:1977:2: ( ruleGeneralization )
            // InternalAlf.g:1978:3: ruleGeneralization
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


    // $ANTLR start "rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1"
    // InternalAlf.g:1987:1: rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1 : ( ruleGeneralization ) ;
    public final void rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1991:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:1992:2: ( ruleGeneralization )
            {
            // InternalAlf.g:1992:2: ( ruleGeneralization )
            // InternalAlf.g:1993:3: ruleGeneralization
            {
             before(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationGeneralizationParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationGeneralizationParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinitionOrStub__GeneralizationAssignment_4_2_1"


    // $ANTLR start "rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6"
    // InternalAlf.g:2002:1: rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6 : ( ruleClassMember ) ;
    public final void rule__ClassDefinitionOrStub__OwnedFeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2006:1: ( ( ruleClassMember ) )
            // InternalAlf.g:2007:2: ( ruleClassMember )
            {
            // InternalAlf.g:2007:2: ( ruleClassMember )
            // InternalAlf.g:2008:3: ruleClassMember
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
    // InternalAlf.g:2017:1: rule__FeatureDefinition__MethodVisibilityAssignment_0 : ( ruleVisibilityKind ) ;
    public final void rule__FeatureDefinition__MethodVisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2021:1: ( ( ruleVisibilityKind ) )
            // InternalAlf.g:2022:2: ( ruleVisibilityKind )
            {
            // InternalAlf.g:2022:2: ( ruleVisibilityKind )
            // InternalAlf.g:2023:3: ruleVisibilityKind
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
    // InternalAlf.g:2032:1: rule__FeatureDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__FeatureDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2036:1: ( ( ruleName ) )
            // InternalAlf.g:2037:2: ( ruleName )
            {
            // InternalAlf.g:2037:2: ( ruleName )
            // InternalAlf.g:2038:3: ruleName
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


    // $ANTLR start "rule__FeatureDefinition__DefiningTypeAssignment_3"
    // InternalAlf.g:2047:1: rule__FeatureDefinition__DefiningTypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureDefinition__DefiningTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2051:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2052:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2052:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2053:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getDefiningTypeClassCrossReference_3_0()); 
            // InternalAlf.g:2054:3: ( ruleQualifiedName )
            // InternalAlf.g:2055:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getDefiningTypeClassQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getDefiningTypeClassQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureDefinitionAccess().getDefiningTypeClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__DefiningTypeAssignment_3"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000138030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000038032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000038030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});

}