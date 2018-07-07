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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_NATURAL_VALUE", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'class'", "'assoc'", "'is'", "'specializes'", "'feature'", "'any'", "'redefines'", "'+'", "'-'", "'*'", "'/'", "'^'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'", "'{'", "'}'", "';'", "','", "'connector'", "':'", "'['", "']'", "'..'", "'='", "'subsets'", "'=>'", "'('", "')'", "'null'", "'.'", "'abstract'", "'port'", "'composes'", "'@'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_NATURAL_VALUE=6;
    public static final int RULE_INLINE_STATEMENT=11;
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
    public static final int RULE_BOOLEAN_VALUE=7;
    public static final int RULE_SL_COMMENT=13;
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
    public static final int RULE_WS=14;
    public static final int RULE_UNRESTRICTED_NAME=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=8;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRulePackageMember"
    // InternalAlf.g:128:1: entryRulePackageMember : rulePackageMember EOF ;
    public final void entryRulePackageMember() throws RecognitionException {
        try {
            // InternalAlf.g:129:1: ( rulePackageMember EOF )
            // InternalAlf.g:130:1: rulePackageMember EOF
            {
             before(grammarAccess.getPackageMemberRule()); 
            pushFollow(FOLLOW_1);
            rulePackageMember();

            state._fsp--;

             after(grammarAccess.getPackageMemberRule()); 
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
    // $ANTLR end "entryRulePackageMember"


    // $ANTLR start "rulePackageMember"
    // InternalAlf.g:137:1: rulePackageMember : ( ( rule__PackageMember__Alternatives ) ) ;
    public final void rulePackageMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:141:2: ( ( ( rule__PackageMember__Alternatives ) ) )
            // InternalAlf.g:142:2: ( ( rule__PackageMember__Alternatives ) )
            {
            // InternalAlf.g:142:2: ( ( rule__PackageMember__Alternatives ) )
            // InternalAlf.g:143:3: ( rule__PackageMember__Alternatives )
            {
             before(grammarAccess.getPackageMemberAccess().getAlternatives()); 
            // InternalAlf.g:144:3: ( rule__PackageMember__Alternatives )
            // InternalAlf.g:144:4: rule__PackageMember__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PackageMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPackageMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageMember"


    // $ANTLR start "entryRuleNonFeatureMember"
    // InternalAlf.g:153:1: entryRuleNonFeatureMember : ruleNonFeatureMember EOF ;
    public final void entryRuleNonFeatureMember() throws RecognitionException {
        try {
            // InternalAlf.g:154:1: ( ruleNonFeatureMember EOF )
            // InternalAlf.g:155:1: ruleNonFeatureMember EOF
            {
             before(grammarAccess.getNonFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleNonFeatureMember();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberRule()); 
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
    // $ANTLR end "entryRuleNonFeatureMember"


    // $ANTLR start "ruleNonFeatureMember"
    // InternalAlf.g:162:1: ruleNonFeatureMember : ( ( rule__NonFeatureMember__Group__0 ) ) ;
    public final void ruleNonFeatureMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:166:2: ( ( ( rule__NonFeatureMember__Group__0 ) ) )
            // InternalAlf.g:167:2: ( ( rule__NonFeatureMember__Group__0 ) )
            {
            // InternalAlf.g:167:2: ( ( rule__NonFeatureMember__Group__0 ) )
            // InternalAlf.g:168:3: ( rule__NonFeatureMember__Group__0 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getGroup()); 
            // InternalAlf.g:169:3: ( rule__NonFeatureMember__Group__0 )
            // InternalAlf.g:169:4: rule__NonFeatureMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonFeatureMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonFeatureMember"


    // $ANTLR start "entryRuleNonFeatureMemberKind"
    // InternalAlf.g:178:1: entryRuleNonFeatureMemberKind : ruleNonFeatureMemberKind EOF ;
    public final void entryRuleNonFeatureMemberKind() throws RecognitionException {
        try {
            // InternalAlf.g:179:1: ( ruleNonFeatureMemberKind EOF )
            // InternalAlf.g:180:1: ruleNonFeatureMemberKind EOF
            {
             before(grammarAccess.getNonFeatureMemberKindRule()); 
            pushFollow(FOLLOW_1);
            ruleNonFeatureMemberKind();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberKindRule()); 
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
    // $ANTLR end "entryRuleNonFeatureMemberKind"


    // $ANTLR start "ruleNonFeatureMemberKind"
    // InternalAlf.g:187:1: ruleNonFeatureMemberKind : ( ( rule__NonFeatureMemberKind__Alternatives ) ) ;
    public final void ruleNonFeatureMemberKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:191:2: ( ( ( rule__NonFeatureMemberKind__Alternatives ) ) )
            // InternalAlf.g:192:2: ( ( rule__NonFeatureMemberKind__Alternatives ) )
            {
            // InternalAlf.g:192:2: ( ( rule__NonFeatureMemberKind__Alternatives ) )
            // InternalAlf.g:193:3: ( rule__NonFeatureMemberKind__Alternatives )
            {
             before(grammarAccess.getNonFeatureMemberKindAccess().getAlternatives()); 
            // InternalAlf.g:194:3: ( rule__NonFeatureMemberKind__Alternatives )
            // InternalAlf.g:194:4: rule__NonFeatureMemberKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureMemberKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNonFeatureMemberKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonFeatureMemberKind"


    // $ANTLR start "entryRulePackagedFeatureMember"
    // InternalAlf.g:203:1: entryRulePackagedFeatureMember : rulePackagedFeatureMember EOF ;
    public final void entryRulePackagedFeatureMember() throws RecognitionException {
        try {
            // InternalAlf.g:204:1: ( rulePackagedFeatureMember EOF )
            // InternalAlf.g:205:1: rulePackagedFeatureMember EOF
            {
             before(grammarAccess.getPackagedFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            rulePackagedFeatureMember();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberRule()); 
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
    // $ANTLR end "entryRulePackagedFeatureMember"


    // $ANTLR start "rulePackagedFeatureMember"
    // InternalAlf.g:212:1: rulePackagedFeatureMember : ( ( rule__PackagedFeatureMember__Group__0 ) ) ;
    public final void rulePackagedFeatureMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:216:2: ( ( ( rule__PackagedFeatureMember__Group__0 ) ) )
            // InternalAlf.g:217:2: ( ( rule__PackagedFeatureMember__Group__0 ) )
            {
            // InternalAlf.g:217:2: ( ( rule__PackagedFeatureMember__Group__0 ) )
            // InternalAlf.g:218:3: ( rule__PackagedFeatureMember__Group__0 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getGroup()); 
            // InternalAlf.g:219:3: ( rule__PackagedFeatureMember__Group__0 )
            // InternalAlf.g:219:4: rule__PackagedFeatureMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackagedFeatureMember"


    // $ANTLR start "entryRuleNonFeatureDefinition"
    // InternalAlf.g:228:1: entryRuleNonFeatureDefinition : ruleNonFeatureDefinition EOF ;
    public final void entryRuleNonFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:229:1: ( ruleNonFeatureDefinition EOF )
            // InternalAlf.g:230:1: ruleNonFeatureDefinition EOF
            {
             before(grammarAccess.getNonFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleNonFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getNonFeatureDefinitionRule()); 
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
    // $ANTLR end "entryRuleNonFeatureDefinition"


    // $ANTLR start "ruleNonFeatureDefinition"
    // InternalAlf.g:237:1: ruleNonFeatureDefinition : ( ( rule__NonFeatureDefinition__Alternatives ) ) ;
    public final void ruleNonFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:241:2: ( ( ( rule__NonFeatureDefinition__Alternatives ) ) )
            // InternalAlf.g:242:2: ( ( rule__NonFeatureDefinition__Alternatives ) )
            {
            // InternalAlf.g:242:2: ( ( rule__NonFeatureDefinition__Alternatives ) )
            // InternalAlf.g:243:3: ( rule__NonFeatureDefinition__Alternatives )
            {
             before(grammarAccess.getNonFeatureDefinitionAccess().getAlternatives()); 
            // InternalAlf.g:244:3: ( rule__NonFeatureDefinition__Alternatives )
            // InternalAlf.g:244:4: rule__NonFeatureDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNonFeatureDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonFeatureDefinition"


    // $ANTLR start "entryRuleClassifierDefinitionOrStub"
    // InternalAlf.g:253:1: entryRuleClassifierDefinitionOrStub : ruleClassifierDefinitionOrStub EOF ;
    public final void entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:254:1: ( ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:255:1: ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:262:1: ruleClassifierDefinitionOrStub : ( ( rule__ClassifierDefinitionOrStub__Alternatives ) ) ;
    public final void ruleClassifierDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:266:2: ( ( ( rule__ClassifierDefinitionOrStub__Alternatives ) ) )
            // InternalAlf.g:267:2: ( ( rule__ClassifierDefinitionOrStub__Alternatives ) )
            {
            // InternalAlf.g:267:2: ( ( rule__ClassifierDefinitionOrStub__Alternatives ) )
            // InternalAlf.g:268:3: ( rule__ClassifierDefinitionOrStub__Alternatives )
            {
             before(grammarAccess.getClassifierDefinitionOrStubAccess().getAlternatives()); 
            // InternalAlf.g:269:3: ( rule__ClassifierDefinitionOrStub__Alternatives )
            // InternalAlf.g:269:4: rule__ClassifierDefinitionOrStub__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierDefinitionOrStub__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassifierDefinitionOrStubAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAlf.g:278:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalAlf.g:279:1: ( ruleClassDeclaration EOF )
            // InternalAlf.g:280:1: ruleClassDeclaration EOF
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
    // InternalAlf.g:287:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:291:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalAlf.g:292:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalAlf.g:292:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalAlf.g:293:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalAlf.g:294:3: ( rule__ClassDeclaration__Group__0 )
            // InternalAlf.g:294:4: rule__ClassDeclaration__Group__0
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


    // $ANTLR start "entryRuleOwnedGeneralization"
    // InternalAlf.g:303:1: entryRuleOwnedGeneralization : ruleOwnedGeneralization EOF ;
    public final void entryRuleOwnedGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:304:1: ( ruleOwnedGeneralization EOF )
            // InternalAlf.g:305:1: ruleOwnedGeneralization EOF
            {
             before(grammarAccess.getOwnedGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnedGeneralization();

            state._fsp--;

             after(grammarAccess.getOwnedGeneralizationRule()); 
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
    // $ANTLR end "entryRuleOwnedGeneralization"


    // $ANTLR start "ruleOwnedGeneralization"
    // InternalAlf.g:312:1: ruleOwnedGeneralization : ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) ) ;
    public final void ruleOwnedGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:316:2: ( ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) ) )
            // InternalAlf.g:317:2: ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) )
            {
            // InternalAlf.g:317:2: ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) )
            // InternalAlf.g:318:3: ( rule__OwnedGeneralization__OwnedMemberElementAssignment )
            {
             before(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementAssignment()); 
            // InternalAlf.g:319:3: ( rule__OwnedGeneralization__OwnedMemberElementAssignment )
            // InternalAlf.g:319:4: rule__OwnedGeneralization__OwnedMemberElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OwnedGeneralization__OwnedMemberElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedGeneralization"


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:328:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:329:1: ( ruleGeneralization EOF )
            // InternalAlf.g:330:1: ruleGeneralization EOF
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
    // InternalAlf.g:337:1: ruleGeneralization : ( ( rule__Generalization__GeneralAssignment ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:341:2: ( ( ( rule__Generalization__GeneralAssignment ) ) )
            // InternalAlf.g:342:2: ( ( rule__Generalization__GeneralAssignment ) )
            {
            // InternalAlf.g:342:2: ( ( rule__Generalization__GeneralAssignment ) )
            // InternalAlf.g:343:3: ( rule__Generalization__GeneralAssignment )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment()); 
            // InternalAlf.g:344:3: ( rule__Generalization__GeneralAssignment )
            // InternalAlf.g:344:4: rule__Generalization__GeneralAssignment
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
    // InternalAlf.g:353:1: entryRuleClassDefinition : ruleClassDefinition EOF ;
    public final void entryRuleClassDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:354:1: ( ruleClassDefinition EOF )
            // InternalAlf.g:355:1: ruleClassDefinition EOF
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
    // InternalAlf.g:362:1: ruleClassDefinition : ( ( rule__ClassDefinition__Group__0 ) ) ;
    public final void ruleClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:366:2: ( ( ( rule__ClassDefinition__Group__0 ) ) )
            // InternalAlf.g:367:2: ( ( rule__ClassDefinition__Group__0 ) )
            {
            // InternalAlf.g:367:2: ( ( rule__ClassDefinition__Group__0 ) )
            // InternalAlf.g:368:3: ( rule__ClassDefinition__Group__0 )
            {
             before(grammarAccess.getClassDefinitionAccess().getGroup()); 
            // InternalAlf.g:369:3: ( rule__ClassDefinition__Group__0 )
            // InternalAlf.g:369:4: rule__ClassDefinition__Group__0
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
    // InternalAlf.g:378:1: entryRuleClassDefinitionOrStub : ruleClassDefinitionOrStub EOF ;
    public final void entryRuleClassDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:379:1: ( ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:380:1: ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:387:1: ruleClassDefinitionOrStub : ( ruleClassDefinition ) ;
    public final void ruleClassDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:391:2: ( ( ruleClassDefinition ) )
            // InternalAlf.g:392:2: ( ruleClassDefinition )
            {
            // InternalAlf.g:392:2: ( ruleClassDefinition )
            // InternalAlf.g:393:3: ruleClassDefinition
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


    // $ANTLR start "entryRuleClassMember"
    // InternalAlf.g:403:1: entryRuleClassMember : ruleClassMember EOF ;
    public final void entryRuleClassMember() throws RecognitionException {
        try {
            // InternalAlf.g:404:1: ( ruleClassMember EOF )
            // InternalAlf.g:405:1: ruleClassMember EOF
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
    // InternalAlf.g:412:1: ruleClassMember : ( ( rule__ClassMember__Alternatives ) ) ;
    public final void ruleClassMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:416:2: ( ( ( rule__ClassMember__Alternatives ) ) )
            // InternalAlf.g:417:2: ( ( rule__ClassMember__Alternatives ) )
            {
            // InternalAlf.g:417:2: ( ( rule__ClassMember__Alternatives ) )
            // InternalAlf.g:418:3: ( rule__ClassMember__Alternatives )
            {
             before(grammarAccess.getClassMemberAccess().getAlternatives()); 
            // InternalAlf.g:419:3: ( rule__ClassMember__Alternatives )
            // InternalAlf.g:419:4: rule__ClassMember__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassMemberAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleClassFeatureMember"
    // InternalAlf.g:428:1: entryRuleClassFeatureMember : ruleClassFeatureMember EOF ;
    public final void entryRuleClassFeatureMember() throws RecognitionException {
        try {
            // InternalAlf.g:429:1: ( ruleClassFeatureMember EOF )
            // InternalAlf.g:430:1: ruleClassFeatureMember EOF
            {
             before(grammarAccess.getClassFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleClassFeatureMember();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberRule()); 
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
    // $ANTLR end "entryRuleClassFeatureMember"


    // $ANTLR start "ruleClassFeatureMember"
    // InternalAlf.g:437:1: ruleClassFeatureMember : ( ( rule__ClassFeatureMember__Group__0 ) ) ;
    public final void ruleClassFeatureMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:441:2: ( ( ( rule__ClassFeatureMember__Group__0 ) ) )
            // InternalAlf.g:442:2: ( ( rule__ClassFeatureMember__Group__0 ) )
            {
            // InternalAlf.g:442:2: ( ( rule__ClassFeatureMember__Group__0 ) )
            // InternalAlf.g:443:3: ( rule__ClassFeatureMember__Group__0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getGroup()); 
            // InternalAlf.g:444:3: ( rule__ClassFeatureMember__Group__0 )
            // InternalAlf.g:444:4: rule__ClassFeatureMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassFeatureMember"


    // $ANTLR start "entryRuleAssociationDeclaration"
    // InternalAlf.g:453:1: entryRuleAssociationDeclaration : ruleAssociationDeclaration EOF ;
    public final void entryRuleAssociationDeclaration() throws RecognitionException {
        try {
            // InternalAlf.g:454:1: ( ruleAssociationDeclaration EOF )
            // InternalAlf.g:455:1: ruleAssociationDeclaration EOF
            {
             before(grammarAccess.getAssociationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationDeclaration();

            state._fsp--;

             after(grammarAccess.getAssociationDeclarationRule()); 
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
    // $ANTLR end "entryRuleAssociationDeclaration"


    // $ANTLR start "ruleAssociationDeclaration"
    // InternalAlf.g:462:1: ruleAssociationDeclaration : ( ( rule__AssociationDeclaration__Group__0 ) ) ;
    public final void ruleAssociationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:466:2: ( ( ( rule__AssociationDeclaration__Group__0 ) ) )
            // InternalAlf.g:467:2: ( ( rule__AssociationDeclaration__Group__0 ) )
            {
            // InternalAlf.g:467:2: ( ( rule__AssociationDeclaration__Group__0 ) )
            // InternalAlf.g:468:3: ( rule__AssociationDeclaration__Group__0 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getGroup()); 
            // InternalAlf.g:469:3: ( rule__AssociationDeclaration__Group__0 )
            // InternalAlf.g:469:4: rule__AssociationDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationDeclaration"


    // $ANTLR start "entryRuleAssociationDefinition"
    // InternalAlf.g:478:1: entryRuleAssociationDefinition : ruleAssociationDefinition EOF ;
    public final void entryRuleAssociationDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:479:1: ( ruleAssociationDefinition EOF )
            // InternalAlf.g:480:1: ruleAssociationDefinition EOF
            {
             before(grammarAccess.getAssociationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationDefinition();

            state._fsp--;

             after(grammarAccess.getAssociationDefinitionRule()); 
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
    // $ANTLR end "entryRuleAssociationDefinition"


    // $ANTLR start "ruleAssociationDefinition"
    // InternalAlf.g:487:1: ruleAssociationDefinition : ( ( rule__AssociationDefinition__Group__0 ) ) ;
    public final void ruleAssociationDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:491:2: ( ( ( rule__AssociationDefinition__Group__0 ) ) )
            // InternalAlf.g:492:2: ( ( rule__AssociationDefinition__Group__0 ) )
            {
            // InternalAlf.g:492:2: ( ( rule__AssociationDefinition__Group__0 ) )
            // InternalAlf.g:493:3: ( rule__AssociationDefinition__Group__0 )
            {
             before(grammarAccess.getAssociationDefinitionAccess().getGroup()); 
            // InternalAlf.g:494:3: ( rule__AssociationDefinition__Group__0 )
            // InternalAlf.g:494:4: rule__AssociationDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationDefinition"


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:503:1: entryRuleAssociationDefinitionOrStub : ruleAssociationDefinitionOrStub EOF ;
    public final void entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:504:1: ( ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:505:1: ruleAssociationDefinitionOrStub EOF
            {
             before(grammarAccess.getAssociationDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationDefinitionOrStub();

            state._fsp--;

             after(grammarAccess.getAssociationDefinitionOrStubRule()); 
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
    // $ANTLR end "entryRuleAssociationDefinitionOrStub"


    // $ANTLR start "ruleAssociationDefinitionOrStub"
    // InternalAlf.g:512:1: ruleAssociationDefinitionOrStub : ( ruleAssociationDefinition ) ;
    public final void ruleAssociationDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:516:2: ( ( ruleAssociationDefinition ) )
            // InternalAlf.g:517:2: ( ruleAssociationDefinition )
            {
            // InternalAlf.g:517:2: ( ruleAssociationDefinition )
            // InternalAlf.g:518:3: ruleAssociationDefinition
            {
             before(grammarAccess.getAssociationDefinitionOrStubAccess().getAssociationDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAssociationDefinition();

            state._fsp--;

             after(grammarAccess.getAssociationDefinitionOrStubAccess().getAssociationDefinitionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationDefinitionOrStub"


    // $ANTLR start "entryRuleTypedFeatureDefinition"
    // InternalAlf.g:528:1: entryRuleTypedFeatureDefinition : ruleTypedFeatureDefinition EOF ;
    public final void entryRuleTypedFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:529:1: ( ruleTypedFeatureDefinition EOF )
            // InternalAlf.g:530:1: ruleTypedFeatureDefinition EOF
            {
             before(grammarAccess.getTypedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionRule()); 
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
    // $ANTLR end "entryRuleTypedFeatureDefinition"


    // $ANTLR start "ruleTypedFeatureDefinition"
    // InternalAlf.g:537:1: ruleTypedFeatureDefinition : ( ( rule__TypedFeatureDefinition__Group__0 ) ) ;
    public final void ruleTypedFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:541:2: ( ( ( rule__TypedFeatureDefinition__Group__0 ) ) )
            // InternalAlf.g:542:2: ( ( rule__TypedFeatureDefinition__Group__0 ) )
            {
            // InternalAlf.g:542:2: ( ( rule__TypedFeatureDefinition__Group__0 ) )
            // InternalAlf.g:543:3: ( rule__TypedFeatureDefinition__Group__0 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup()); 
            // InternalAlf.g:544:3: ( rule__TypedFeatureDefinition__Group__0 )
            // InternalAlf.g:544:4: rule__TypedFeatureDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedFeatureDefinition"


    // $ANTLR start "entryRuleUntypedFeatureDefinition"
    // InternalAlf.g:553:1: entryRuleUntypedFeatureDefinition : ruleUntypedFeatureDefinition EOF ;
    public final void entryRuleUntypedFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:554:1: ( ruleUntypedFeatureDefinition EOF )
            // InternalAlf.g:555:1: ruleUntypedFeatureDefinition EOF
            {
             before(grammarAccess.getUntypedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleUntypedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionRule()); 
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
    // $ANTLR end "entryRuleUntypedFeatureDefinition"


    // $ANTLR start "ruleUntypedFeatureDefinition"
    // InternalAlf.g:562:1: ruleUntypedFeatureDefinition : ( ( rule__UntypedFeatureDefinition__Group__0 ) ) ;
    public final void ruleUntypedFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:566:2: ( ( ( rule__UntypedFeatureDefinition__Group__0 ) ) )
            // InternalAlf.g:567:2: ( ( rule__UntypedFeatureDefinition__Group__0 ) )
            {
            // InternalAlf.g:567:2: ( ( rule__UntypedFeatureDefinition__Group__0 ) )
            // InternalAlf.g:568:3: ( rule__UntypedFeatureDefinition__Group__0 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup()); 
            // InternalAlf.g:569:3: ( rule__UntypedFeatureDefinition__Group__0 )
            // InternalAlf.g:569:4: rule__UntypedFeatureDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUntypedFeatureDefinition"


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:578:1: entryRuleOwnedRedefinitionOrSubset : ruleOwnedRedefinitionOrSubset EOF ;
    public final void entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        try {
            // InternalAlf.g:579:1: ( ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:580:1: ruleOwnedRedefinitionOrSubset EOF
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getOwnedRedefinitionOrSubsetRule()); 
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
    // $ANTLR end "entryRuleOwnedRedefinitionOrSubset"


    // $ANTLR start "ruleOwnedRedefinitionOrSubset"
    // InternalAlf.g:587:1: ruleOwnedRedefinitionOrSubset : ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) ) ;
    public final void ruleOwnedRedefinitionOrSubset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:591:2: ( ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) ) )
            // InternalAlf.g:592:2: ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) )
            {
            // InternalAlf.g:592:2: ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) )
            // InternalAlf.g:593:3: ( rule__OwnedRedefinitionOrSubset__Alternatives )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives()); 
            // InternalAlf.g:594:3: ( rule__OwnedRedefinitionOrSubset__Alternatives )
            // InternalAlf.g:594:4: rule__OwnedRedefinitionOrSubset__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OwnedRedefinitionOrSubset__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedRedefinitionOrSubset"


    // $ANTLR start "entryRuleRedefinition"
    // InternalAlf.g:603:1: entryRuleRedefinition : ruleRedefinition EOF ;
    public final void entryRuleRedefinition() throws RecognitionException {
        try {
            // InternalAlf.g:604:1: ( ruleRedefinition EOF )
            // InternalAlf.g:605:1: ruleRedefinition EOF
            {
             before(grammarAccess.getRedefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRedefinition();

            state._fsp--;

             after(grammarAccess.getRedefinitionRule()); 
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
    // $ANTLR end "entryRuleRedefinition"


    // $ANTLR start "ruleRedefinition"
    // InternalAlf.g:612:1: ruleRedefinition : ( ( rule__Redefinition__RedefinedFeatureAssignment ) ) ;
    public final void ruleRedefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:616:2: ( ( ( rule__Redefinition__RedefinedFeatureAssignment ) ) )
            // InternalAlf.g:617:2: ( ( rule__Redefinition__RedefinedFeatureAssignment ) )
            {
            // InternalAlf.g:617:2: ( ( rule__Redefinition__RedefinedFeatureAssignment ) )
            // InternalAlf.g:618:3: ( rule__Redefinition__RedefinedFeatureAssignment )
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureAssignment()); 
            // InternalAlf.g:619:3: ( rule__Redefinition__RedefinedFeatureAssignment )
            // InternalAlf.g:619:4: rule__Redefinition__RedefinedFeatureAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Redefinition__RedefinedFeatureAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRedefinitionAccess().getRedefinedFeatureAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRedefinition"


    // $ANTLR start "entryRuleSubset"
    // InternalAlf.g:628:1: entryRuleSubset : ruleSubset EOF ;
    public final void entryRuleSubset() throws RecognitionException {
        try {
            // InternalAlf.g:629:1: ( ruleSubset EOF )
            // InternalAlf.g:630:1: ruleSubset EOF
            {
             before(grammarAccess.getSubsetRule()); 
            pushFollow(FOLLOW_1);
            ruleSubset();

            state._fsp--;

             after(grammarAccess.getSubsetRule()); 
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
    // $ANTLR end "entryRuleSubset"


    // $ANTLR start "ruleSubset"
    // InternalAlf.g:637:1: ruleSubset : ( ( rule__Subset__SubsettedFeatureAssignment ) ) ;
    public final void ruleSubset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:641:2: ( ( ( rule__Subset__SubsettedFeatureAssignment ) ) )
            // InternalAlf.g:642:2: ( ( rule__Subset__SubsettedFeatureAssignment ) )
            {
            // InternalAlf.g:642:2: ( ( rule__Subset__SubsettedFeatureAssignment ) )
            // InternalAlf.g:643:3: ( rule__Subset__SubsettedFeatureAssignment )
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureAssignment()); 
            // InternalAlf.g:644:3: ( rule__Subset__SubsettedFeatureAssignment )
            // InternalAlf.g:644:4: rule__Subset__SubsettedFeatureAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Subset__SubsettedFeatureAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSubsetAccess().getSubsettedFeatureAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubset"


    // $ANTLR start "entryRuleConnectorDefinition"
    // InternalAlf.g:653:1: entryRuleConnectorDefinition : ruleConnectorDefinition EOF ;
    public final void entryRuleConnectorDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:654:1: ( ruleConnectorDefinition EOF )
            // InternalAlf.g:655:1: ruleConnectorDefinition EOF
            {
             before(grammarAccess.getConnectorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectorDefinition();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionRule()); 
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
    // $ANTLR end "entryRuleConnectorDefinition"


    // $ANTLR start "ruleConnectorDefinition"
    // InternalAlf.g:662:1: ruleConnectorDefinition : ( ( rule__ConnectorDefinition__Group__0 ) ) ;
    public final void ruleConnectorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:666:2: ( ( ( rule__ConnectorDefinition__Group__0 ) ) )
            // InternalAlf.g:667:2: ( ( rule__ConnectorDefinition__Group__0 ) )
            {
            // InternalAlf.g:667:2: ( ( rule__ConnectorDefinition__Group__0 ) )
            // InternalAlf.g:668:3: ( rule__ConnectorDefinition__Group__0 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup()); 
            // InternalAlf.g:669:3: ( rule__ConnectorDefinition__Group__0 )
            // InternalAlf.g:669:4: rule__ConnectorDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectorDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalAlf.g:678:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAlf.g:679:1: ( ruleExpression EOF )
            // InternalAlf.g:680:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAlf.g:687:1: ruleExpression : ( ruleBinaryExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:691:2: ( ( ruleBinaryExpression ) )
            // InternalAlf.g:692:2: ( ruleBinaryExpression )
            {
            // InternalAlf.g:692:2: ( ruleBinaryExpression )
            // InternalAlf.g:693:3: ruleBinaryExpression
            {
             before(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalAlf.g:703:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:704:1: ( ruleBinaryExpression EOF )
            // InternalAlf.g:705:1: ruleBinaryExpression EOF
            {
             before(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionRule()); 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalAlf.g:712:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:716:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalAlf.g:717:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalAlf.g:717:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalAlf.g:718:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalAlf.g:719:3: ( rule__BinaryExpression__Group__0 )
            // InternalAlf.g:719:4: rule__BinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleBinaryOperator"
    // InternalAlf.g:728:1: entryRuleBinaryOperator : ruleBinaryOperator EOF ;
    public final void entryRuleBinaryOperator() throws RecognitionException {
        try {
            // InternalAlf.g:729:1: ( ruleBinaryOperator EOF )
            // InternalAlf.g:730:1: ruleBinaryOperator EOF
            {
             before(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryOperatorRule()); 
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
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // InternalAlf.g:737:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:741:2: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // InternalAlf.g:742:2: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // InternalAlf.g:742:2: ( ( rule__BinaryOperator__Alternatives ) )
            // InternalAlf.g:743:3: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // InternalAlf.g:744:3: ( rule__BinaryOperator__Alternatives )
            // InternalAlf.g:744:4: rule__BinaryOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalAlf.g:753:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:754:1: ( ruleUnaryExpression EOF )
            // InternalAlf.g:755:1: ruleUnaryExpression EOF
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
    // InternalAlf.g:762:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:766:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalAlf.g:767:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalAlf.g:767:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalAlf.g:768:3: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // InternalAlf.g:769:3: ( rule__UnaryExpression__Alternatives )
            // InternalAlf.g:769:4: rule__UnaryExpression__Alternatives
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
    // InternalAlf.g:778:1: entryRuleUnaryOperator : ruleUnaryOperator EOF ;
    public final void entryRuleUnaryOperator() throws RecognitionException {
        try {
            // InternalAlf.g:779:1: ( ruleUnaryOperator EOF )
            // InternalAlf.g:780:1: ruleUnaryOperator EOF
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
    // InternalAlf.g:787:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:791:2: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalAlf.g:792:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalAlf.g:792:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalAlf.g:793:3: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // InternalAlf.g:794:3: ( rule__UnaryOperator__Alternatives )
            // InternalAlf.g:794:4: rule__UnaryOperator__Alternatives
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


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalAlf.g:803:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:804:1: ( rulePrimaryExpression EOF )
            // InternalAlf.g:805:1: rulePrimaryExpression EOF
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
    // InternalAlf.g:812:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:816:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalAlf.g:817:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalAlf.g:817:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalAlf.g:818:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalAlf.g:819:3: ( rule__PrimaryExpression__Alternatives )
            // InternalAlf.g:819:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleElementReferenceExpression"
    // InternalAlf.g:828:1: entryRuleElementReferenceExpression : ruleElementReferenceExpression EOF ;
    public final void entryRuleElementReferenceExpression() throws RecognitionException {
        try {
            // InternalAlf.g:829:1: ( ruleElementReferenceExpression EOF )
            // InternalAlf.g:830:1: ruleElementReferenceExpression EOF
            {
             before(grammarAccess.getElementReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleElementReferenceExpression();

            state._fsp--;

             after(grammarAccess.getElementReferenceExpressionRule()); 
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
    // $ANTLR end "entryRuleElementReferenceExpression"


    // $ANTLR start "ruleElementReferenceExpression"
    // InternalAlf.g:837:1: ruleElementReferenceExpression : ( ( rule__ElementReferenceExpression__ReferentAssignment ) ) ;
    public final void ruleElementReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:841:2: ( ( ( rule__ElementReferenceExpression__ReferentAssignment ) ) )
            // InternalAlf.g:842:2: ( ( rule__ElementReferenceExpression__ReferentAssignment ) )
            {
            // InternalAlf.g:842:2: ( ( rule__ElementReferenceExpression__ReferentAssignment ) )
            // InternalAlf.g:843:3: ( rule__ElementReferenceExpression__ReferentAssignment )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentAssignment()); 
            // InternalAlf.g:844:3: ( rule__ElementReferenceExpression__ReferentAssignment )
            // InternalAlf.g:844:4: rule__ElementReferenceExpression__ReferentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementReferenceExpression__ReferentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementReferenceExpressionAccess().getReferentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementReferenceExpression"


    // $ANTLR start "entryRuleInstanceCreationExpression"
    // InternalAlf.g:853:1: entryRuleInstanceCreationExpression : ruleInstanceCreationExpression EOF ;
    public final void entryRuleInstanceCreationExpression() throws RecognitionException {
        try {
            // InternalAlf.g:854:1: ( ruleInstanceCreationExpression EOF )
            // InternalAlf.g:855:1: ruleInstanceCreationExpression EOF
            {
             before(grammarAccess.getInstanceCreationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceCreationExpression();

            state._fsp--;

             after(grammarAccess.getInstanceCreationExpressionRule()); 
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
    // $ANTLR end "entryRuleInstanceCreationExpression"


    // $ANTLR start "ruleInstanceCreationExpression"
    // InternalAlf.g:862:1: ruleInstanceCreationExpression : ( ( rule__InstanceCreationExpression__Group__0 ) ) ;
    public final void ruleInstanceCreationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:866:2: ( ( ( rule__InstanceCreationExpression__Group__0 ) ) )
            // InternalAlf.g:867:2: ( ( rule__InstanceCreationExpression__Group__0 ) )
            {
            // InternalAlf.g:867:2: ( ( rule__InstanceCreationExpression__Group__0 ) )
            // InternalAlf.g:868:3: ( rule__InstanceCreationExpression__Group__0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup()); 
            // InternalAlf.g:869:3: ( rule__InstanceCreationExpression__Group__0 )
            // InternalAlf.g:869:4: rule__InstanceCreationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceCreationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceCreationExpression"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalAlf.g:878:1: entryRuleSequenceConstructionExpression : ruleSequenceConstructionExpression EOF ;
    public final void entryRuleSequenceConstructionExpression() throws RecognitionException {
        try {
            // InternalAlf.g:879:1: ( ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:880:1: ruleSequenceConstructionExpression EOF
            {
             before(grammarAccess.getSequenceConstructionExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceConstructionExpression();

            state._fsp--;

             after(grammarAccess.getSequenceConstructionExpressionRule()); 
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
    // $ANTLR end "entryRuleSequenceConstructionExpression"


    // $ANTLR start "ruleSequenceConstructionExpression"
    // InternalAlf.g:887:1: ruleSequenceConstructionExpression : ( ( rule__SequenceConstructionExpression__Group__0 ) ) ;
    public final void ruleSequenceConstructionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:891:2: ( ( ( rule__SequenceConstructionExpression__Group__0 ) ) )
            // InternalAlf.g:892:2: ( ( rule__SequenceConstructionExpression__Group__0 ) )
            {
            // InternalAlf.g:892:2: ( ( rule__SequenceConstructionExpression__Group__0 ) )
            // InternalAlf.g:893:3: ( rule__SequenceConstructionExpression__Group__0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup()); 
            // InternalAlf.g:894:3: ( rule__SequenceConstructionExpression__Group__0 )
            // InternalAlf.g:894:4: rule__SequenceConstructionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceConstructionExpressionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalAlf.g:903:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:904:1: ( ruleLiteralExpression EOF )
            // InternalAlf.g:905:1: ruleLiteralExpression EOF
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
    // InternalAlf.g:912:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:916:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalAlf.g:917:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:917:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalAlf.g:918:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:919:3: ( rule__LiteralExpression__Alternatives )
            // InternalAlf.g:919:4: rule__LiteralExpression__Alternatives
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


    // $ANTLR start "entryRuleNullLiteralExpression"
    // InternalAlf.g:928:1: entryRuleNullLiteralExpression : ruleNullLiteralExpression EOF ;
    public final void entryRuleNullLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:929:1: ( ruleNullLiteralExpression EOF )
            // InternalAlf.g:930:1: ruleNullLiteralExpression EOF
            {
             before(grammarAccess.getNullLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNullLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNullLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleNullLiteralExpression"


    // $ANTLR start "ruleNullLiteralExpression"
    // InternalAlf.g:937:1: ruleNullLiteralExpression : ( ( rule__NullLiteralExpression__Group__0 ) ) ;
    public final void ruleNullLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:941:2: ( ( ( rule__NullLiteralExpression__Group__0 ) ) )
            // InternalAlf.g:942:2: ( ( rule__NullLiteralExpression__Group__0 ) )
            {
            // InternalAlf.g:942:2: ( ( rule__NullLiteralExpression__Group__0 ) )
            // InternalAlf.g:943:3: ( rule__NullLiteralExpression__Group__0 )
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getGroup()); 
            // InternalAlf.g:944:3: ( rule__NullLiteralExpression__Group__0 )
            // InternalAlf.g:944:4: rule__NullLiteralExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullLiteralExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullLiteralExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullLiteralExpression"


    // $ANTLR start "entryRuleBooleanLiteralExpression"
    // InternalAlf.g:953:1: entryRuleBooleanLiteralExpression : ruleBooleanLiteralExpression EOF ;
    public final void entryRuleBooleanLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:954:1: ( ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:955:1: ruleBooleanLiteralExpression EOF
            {
             before(grammarAccess.getBooleanLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteralExpression();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleBooleanLiteralExpression"


    // $ANTLR start "ruleBooleanLiteralExpression"
    // InternalAlf.g:962:1: ruleBooleanLiteralExpression : ( ( rule__BooleanLiteralExpression__ValueAssignment ) ) ;
    public final void ruleBooleanLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:966:2: ( ( ( rule__BooleanLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:967:2: ( ( rule__BooleanLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:967:2: ( ( rule__BooleanLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:968:3: ( rule__BooleanLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:969:3: ( rule__BooleanLiteralExpression__ValueAssignment )
            // InternalAlf.g:969:4: rule__BooleanLiteralExpression__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteralExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralExpressionAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteralExpression"


    // $ANTLR start "entryRuleStringLiteralExpression"
    // InternalAlf.g:978:1: entryRuleStringLiteralExpression : ruleStringLiteralExpression EOF ;
    public final void entryRuleStringLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:979:1: ( ruleStringLiteralExpression EOF )
            // InternalAlf.g:980:1: ruleStringLiteralExpression EOF
            {
             before(grammarAccess.getStringLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteralExpression();

            state._fsp--;

             after(grammarAccess.getStringLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleStringLiteralExpression"


    // $ANTLR start "ruleStringLiteralExpression"
    // InternalAlf.g:987:1: ruleStringLiteralExpression : ( ( rule__StringLiteralExpression__ValueAssignment ) ) ;
    public final void ruleStringLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:991:2: ( ( ( rule__StringLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:992:2: ( ( rule__StringLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:992:2: ( ( rule__StringLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:993:3: ( rule__StringLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:994:3: ( rule__StringLiteralExpression__ValueAssignment )
            // InternalAlf.g:994:4: rule__StringLiteralExpression__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteralExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralExpressionAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteralExpression"


    // $ANTLR start "entryRuleRealLiteralExpression"
    // InternalAlf.g:1003:1: entryRuleRealLiteralExpression : ruleRealLiteralExpression EOF ;
    public final void entryRuleRealLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:1004:1: ( ruleRealLiteralExpression EOF )
            // InternalAlf.g:1005:1: ruleRealLiteralExpression EOF
            {
             before(grammarAccess.getRealLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteralExpression();

            state._fsp--;

             after(grammarAccess.getRealLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleRealLiteralExpression"


    // $ANTLR start "ruleRealLiteralExpression"
    // InternalAlf.g:1012:1: ruleRealLiteralExpression : ( ( rule__RealLiteralExpression__ValueAssignment ) ) ;
    public final void ruleRealLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1016:2: ( ( ( rule__RealLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:1017:2: ( ( rule__RealLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:1017:2: ( ( rule__RealLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:1018:3: ( rule__RealLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getRealLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:1019:3: ( rule__RealLiteralExpression__ValueAssignment )
            // InternalAlf.g:1019:4: rule__RealLiteralExpression__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteralExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralExpressionAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealLiteralExpression"


    // $ANTLR start "entryRuleRealValue"
    // InternalAlf.g:1028:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalAlf.g:1029:1: ( ruleRealValue EOF )
            // InternalAlf.g:1030:1: ruleRealValue EOF
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
    // InternalAlf.g:1037:1: ruleRealValue : ( ( rule__RealValue__Group__0 ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1041:2: ( ( ( rule__RealValue__Group__0 ) ) )
            // InternalAlf.g:1042:2: ( ( rule__RealValue__Group__0 ) )
            {
            // InternalAlf.g:1042:2: ( ( rule__RealValue__Group__0 ) )
            // InternalAlf.g:1043:3: ( rule__RealValue__Group__0 )
            {
             before(grammarAccess.getRealValueAccess().getGroup()); 
            // InternalAlf.g:1044:3: ( rule__RealValue__Group__0 )
            // InternalAlf.g:1044:4: rule__RealValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNaturalLiteralExpression"
    // InternalAlf.g:1053:1: entryRuleNaturalLiteralExpression : ruleNaturalLiteralExpression EOF ;
    public final void entryRuleNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:1054:1: ( ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:1055:1: ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:1062:1: ruleNaturalLiteralExpression : ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) ;
    public final void ruleNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1066:2: ( ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:1067:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:1067:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:1068:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getNaturalLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:1069:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            // InternalAlf.g:1069:4: rule__NaturalLiteralExpression__ValueAssignment
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
    // InternalAlf.g:1078:1: entryRuleUnlimitedNaturalLiteralExpression : ruleUnlimitedNaturalLiteralExpression EOF ;
    public final void entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:1079:1: ( ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:1080:1: ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:1087:1: ruleUnlimitedNaturalLiteralExpression : ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) ;
    public final void ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1091:2: ( ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) )
            // InternalAlf.g:1092:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:1092:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            // InternalAlf.g:1093:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:1094:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            // InternalAlf.g:1094:4: rule__UnlimitedNaturalLiteralExpression__Alternatives
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
    // InternalAlf.g:1103:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalAlf.g:1104:1: ( ruleName EOF )
            // InternalAlf.g:1105:1: ruleName EOF
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
    // InternalAlf.g:1112:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1116:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalAlf.g:1117:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalAlf.g:1117:2: ( ( rule__Name__Alternatives ) )
            // InternalAlf.g:1118:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalAlf.g:1119:3: ( rule__Name__Alternatives )
            // InternalAlf.g:1119:4: rule__Name__Alternatives
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
    // InternalAlf.g:1128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAlf.g:1129:1: ( ruleQualifiedName EOF )
            // InternalAlf.g:1130:1: ruleQualifiedName EOF
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
    // InternalAlf.g:1137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAlf.g:1142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAlf.g:1142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAlf.g:1143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAlf.g:1144:3: ( rule__QualifiedName__Group__0 )
            // InternalAlf.g:1144:4: rule__QualifiedName__Group__0
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
    // InternalAlf.g:1153:1: ruleVisibilityIndicator : ( ( rule__VisibilityIndicator__Alternatives ) ) ;
    public final void ruleVisibilityIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1157:1: ( ( ( rule__VisibilityIndicator__Alternatives ) ) )
            // InternalAlf.g:1158:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            {
            // InternalAlf.g:1158:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            // InternalAlf.g:1159:3: ( rule__VisibilityIndicator__Alternatives )
            {
             before(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            // InternalAlf.g:1160:3: ( rule__VisibilityIndicator__Alternatives )
            // InternalAlf.g:1160:4: rule__VisibilityIndicator__Alternatives
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


    // $ANTLR start "ruleFeatureDirection"
    // InternalAlf.g:1169:1: ruleFeatureDirection : ( ( rule__FeatureDirection__Alternatives ) ) ;
    public final void ruleFeatureDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1173:1: ( ( ( rule__FeatureDirection__Alternatives ) ) )
            // InternalAlf.g:1174:2: ( ( rule__FeatureDirection__Alternatives ) )
            {
            // InternalAlf.g:1174:2: ( ( rule__FeatureDirection__Alternatives ) )
            // InternalAlf.g:1175:3: ( rule__FeatureDirection__Alternatives )
            {
             before(grammarAccess.getFeatureDirectionAccess().getAlternatives()); 
            // InternalAlf.g:1176:3: ( rule__FeatureDirection__Alternatives )
            // InternalAlf.g:1176:4: rule__FeatureDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureDirection"


    // $ANTLR start "rule__UnitDefinition__Alternatives"
    // InternalAlf.g:1184:1: rule__UnitDefinition__Alternatives : ( ( rulePackageDefinition ) | ( ruleClassDefinition ) );
    public final void rule__UnitDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1188:1: ( ( rulePackageDefinition ) | ( ruleClassDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16||LA1_0==53) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:1189:2: ( rulePackageDefinition )
                    {
                    // InternalAlf.g:1189:2: ( rulePackageDefinition )
                    // InternalAlf.g:1190:3: rulePackageDefinition
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
                    // InternalAlf.g:1195:2: ( ruleClassDefinition )
                    {
                    // InternalAlf.g:1195:2: ( ruleClassDefinition )
                    // InternalAlf.g:1196:3: ruleClassDefinition
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


    // $ANTLR start "rule__PackageMember__Alternatives"
    // InternalAlf.g:1205:1: rule__PackageMember__Alternatives : ( ( ruleNonFeatureMember ) | ( rulePackagedFeatureMember ) );
    public final void rule__PackageMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1209:1: ( ( ruleNonFeatureMember ) | ( rulePackagedFeatureMember ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=15 && LA2_1<=17)||LA2_1==53) ) {
                    alt2=1;
                }
                else if ( ((LA2_1>=RULE_ID && LA2_1<=RULE_UNRESTRICTED_NAME)||LA2_1==20) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=15 && LA2_2<=17)||LA2_2==53) ) {
                    alt2=1;
                }
                else if ( ((LA2_2>=RULE_ID && LA2_2<=RULE_UNRESTRICTED_NAME)||LA2_2==20) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=15 && LA2_3<=17)||LA2_3==53) ) {
                    alt2=1;
                }
                else if ( ((LA2_3>=RULE_ID && LA2_3<=RULE_UNRESTRICTED_NAME)||LA2_3==20) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA2_4 = input.LA(2);

                if ( ((LA2_4>=15 && LA2_4<=17)||LA2_4==53) ) {
                    alt2=1;
                }
                else if ( ((LA2_4>=RULE_ID && LA2_4<=RULE_UNRESTRICTED_NAME)||LA2_4==20) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
            case 17:
            case 53:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 20:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAlf.g:1210:2: ( ruleNonFeatureMember )
                    {
                    // InternalAlf.g:1210:2: ( ruleNonFeatureMember )
                    // InternalAlf.g:1211:3: ruleNonFeatureMember
                    {
                     before(grammarAccess.getPackageMemberAccess().getNonFeatureMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNonFeatureMember();

                    state._fsp--;

                     after(grammarAccess.getPackageMemberAccess().getNonFeatureMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1216:2: ( rulePackagedFeatureMember )
                    {
                    // InternalAlf.g:1216:2: ( rulePackagedFeatureMember )
                    // InternalAlf.g:1217:3: rulePackagedFeatureMember
                    {
                     before(grammarAccess.getPackageMemberAccess().getPackagedFeatureMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePackagedFeatureMember();

                    state._fsp--;

                     after(grammarAccess.getPackageMemberAccess().getPackagedFeatureMemberParserRuleCall_1()); 

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
    // $ANTLR end "rule__PackageMember__Alternatives"


    // $ANTLR start "rule__NonFeatureMember__Alternatives_1"
    // InternalAlf.g:1226:1: rule__NonFeatureMember__Alternatives_1 : ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) );
    public final void rule__NonFeatureMember__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1230:1: ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAlf.g:1231:2: ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) )
                    {
                    // InternalAlf.g:1231:2: ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) )
                    // InternalAlf.g:1232:3: ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 )
                    {
                     before(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementAssignment_1_0()); 
                    // InternalAlf.g:1233:3: ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 )
                    // InternalAlf.g:1233:4: rule__NonFeatureMember__OwnedMemberElementAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFeatureMember__OwnedMemberElementAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1237:2: ( ( rule__NonFeatureMember__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1237:2: ( ( rule__NonFeatureMember__Group_1_1__0 ) )
                    // InternalAlf.g:1238:3: ( rule__NonFeatureMember__Group_1_1__0 )
                    {
                     before(grammarAccess.getNonFeatureMemberAccess().getGroup_1_1()); 
                    // InternalAlf.g:1239:3: ( rule__NonFeatureMember__Group_1_1__0 )
                    // InternalAlf.g:1239:4: rule__NonFeatureMember__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFeatureMember__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonFeatureMemberAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__NonFeatureMember__Alternatives_1"


    // $ANTLR start "rule__NonFeatureMemberKind__Alternatives"
    // InternalAlf.g:1247:1: rule__NonFeatureMemberKind__Alternatives : ( ( 'package' ) | ( 'class' ) | ( 'assoc' ) );
    public final void rule__NonFeatureMemberKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1251:1: ( ( 'package' ) | ( 'class' ) | ( 'assoc' ) )
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
                    // InternalAlf.g:1252:2: ( 'package' )
                    {
                    // InternalAlf.g:1252:2: ( 'package' )
                    // InternalAlf.g:1253:3: 'package'
                    {
                     before(grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1258:2: ( 'class' )
                    {
                    // InternalAlf.g:1258:2: ( 'class' )
                    // InternalAlf.g:1259:3: 'class'
                    {
                     before(grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1264:2: ( 'assoc' )
                    {
                    // InternalAlf.g:1264:2: ( 'assoc' )
                    // InternalAlf.g:1265:3: 'assoc'
                    {
                     before(grammarAccess.getNonFeatureMemberKindAccess().getAssocKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNonFeatureMemberKindAccess().getAssocKeyword_2()); 

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
    // $ANTLR end "rule__NonFeatureMemberKind__Alternatives"


    // $ANTLR start "rule__PackagedFeatureMember__Alternatives_1"
    // InternalAlf.g:1274:1: rule__PackagedFeatureMember__Alternatives_1 : ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_2__0 ) ) );
    public final void rule__PackagedFeatureMember__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1278:1: ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_2__0 ) ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:1279:2: ( ( rule__PackagedFeatureMember__Group_1_0__0 ) )
                    {
                    // InternalAlf.g:1279:2: ( ( rule__PackagedFeatureMember__Group_1_0__0 ) )
                    // InternalAlf.g:1280:3: ( rule__PackagedFeatureMember__Group_1_0__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_0()); 
                    // InternalAlf.g:1281:3: ( rule__PackagedFeatureMember__Group_1_0__0 )
                    // InternalAlf.g:1281:4: rule__PackagedFeatureMember__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1285:2: ( ( rule__PackagedFeatureMember__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1285:2: ( ( rule__PackagedFeatureMember__Group_1_1__0 ) )
                    // InternalAlf.g:1286:3: ( rule__PackagedFeatureMember__Group_1_1__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_1()); 
                    // InternalAlf.g:1287:3: ( rule__PackagedFeatureMember__Group_1_1__0 )
                    // InternalAlf.g:1287:4: rule__PackagedFeatureMember__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1291:2: ( ( rule__PackagedFeatureMember__Group_1_2__0 ) )
                    {
                    // InternalAlf.g:1291:2: ( ( rule__PackagedFeatureMember__Group_1_2__0 ) )
                    // InternalAlf.g:1292:3: ( rule__PackagedFeatureMember__Group_1_2__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_2()); 
                    // InternalAlf.g:1293:3: ( rule__PackagedFeatureMember__Group_1_2__0 )
                    // InternalAlf.g:1293:4: rule__PackagedFeatureMember__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__PackagedFeatureMember__Alternatives_1"


    // $ANTLR start "rule__PackagedFeatureMember__Alternatives_1_2_0"
    // InternalAlf.g:1301:1: rule__PackagedFeatureMember__Alternatives_1_2_0 : ( ( ( rule__PackagedFeatureMember__Group_1_2_0_0__0 ) ) | ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 ) ) );
    public final void rule__PackagedFeatureMember__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1305:1: ( ( ( rule__PackagedFeatureMember__Group_1_2_0_0__0 ) ) | ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:1306:2: ( ( rule__PackagedFeatureMember__Group_1_2_0_0__0 ) )
                    {
                    // InternalAlf.g:1306:2: ( ( rule__PackagedFeatureMember__Group_1_2_0_0__0 ) )
                    // InternalAlf.g:1307:3: ( rule__PackagedFeatureMember__Group_1_2_0_0__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_2_0_0()); 
                    // InternalAlf.g:1308:3: ( rule__PackagedFeatureMember__Group_1_2_0_0__0 )
                    // InternalAlf.g:1308:4: rule__PackagedFeatureMember__Group_1_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__Group_1_2_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1312:2: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 ) )
                    {
                    // InternalAlf.g:1312:2: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 ) )
                    // InternalAlf.g:1313:3: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_2_0_1()); 
                    // InternalAlf.g:1314:3: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 )
                    // InternalAlf.g:1314:4: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_2_0_1()); 

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
    // $ANTLR end "rule__PackagedFeatureMember__Alternatives_1_2_0"


    // $ANTLR start "rule__NonFeatureDefinition__Alternatives"
    // InternalAlf.g:1322:1: rule__NonFeatureDefinition__Alternatives : ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) );
    public final void rule__NonFeatureDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1326:1: ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=16 && LA7_0<=17)||LA7_0==53) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:1327:2: ( rulePackageDefinitionOrStub )
                    {
                    // InternalAlf.g:1327:2: ( rulePackageDefinitionOrStub )
                    // InternalAlf.g:1328:3: rulePackageDefinitionOrStub
                    {
                     before(grammarAccess.getNonFeatureDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDefinitionOrStub();

                    state._fsp--;

                     after(grammarAccess.getNonFeatureDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1333:2: ( ruleClassifierDefinitionOrStub )
                    {
                    // InternalAlf.g:1333:2: ( ruleClassifierDefinitionOrStub )
                    // InternalAlf.g:1334:3: ruleClassifierDefinitionOrStub
                    {
                     before(grammarAccess.getNonFeatureDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassifierDefinitionOrStub();

                    state._fsp--;

                     after(grammarAccess.getNonFeatureDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1()); 

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
    // $ANTLR end "rule__NonFeatureDefinition__Alternatives"


    // $ANTLR start "rule__ClassifierDefinitionOrStub__Alternatives"
    // InternalAlf.g:1343:1: rule__ClassifierDefinitionOrStub__Alternatives : ( ( ruleClassDefinitionOrStub ) | ( ruleAssociationDefinitionOrStub ) );
    public final void rule__ClassifierDefinitionOrStub__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1347:1: ( ( ruleClassDefinitionOrStub ) | ( ruleAssociationDefinitionOrStub ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==16) ) {
                    alt8=1;
                }
                else if ( (LA8_1==17) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAlf.g:1348:2: ( ruleClassDefinitionOrStub )
                    {
                    // InternalAlf.g:1348:2: ( ruleClassDefinitionOrStub )
                    // InternalAlf.g:1349:3: ruleClassDefinitionOrStub
                    {
                     before(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDefinitionOrStub();

                    state._fsp--;

                     after(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1354:2: ( ruleAssociationDefinitionOrStub )
                    {
                    // InternalAlf.g:1354:2: ( ruleAssociationDefinitionOrStub )
                    // InternalAlf.g:1355:3: ruleAssociationDefinitionOrStub
                    {
                     before(grammarAccess.getClassifierDefinitionOrStubAccess().getAssociationDefinitionOrStubParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationDefinitionOrStub();

                    state._fsp--;

                     after(grammarAccess.getClassifierDefinitionOrStubAccess().getAssociationDefinitionOrStubParserRuleCall_1()); 

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
    // $ANTLR end "rule__ClassifierDefinitionOrStub__Alternatives"


    // $ANTLR start "rule__ClassDeclaration__Alternatives_3_0"
    // InternalAlf.g:1364:1: rule__ClassDeclaration__Alternatives_3_0 : ( ( 'is' ) | ( 'specializes' ) );
    public final void rule__ClassDeclaration__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1368:1: ( ( 'is' ) | ( 'specializes' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:1369:2: ( 'is' )
                    {
                    // InternalAlf.g:1369:2: ( 'is' )
                    // InternalAlf.g:1370:3: 'is'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1375:2: ( 'specializes' )
                    {
                    // InternalAlf.g:1375:2: ( 'specializes' )
                    // InternalAlf.g:1376:3: 'specializes'
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


    // $ANTLR start "rule__ClassMember__Alternatives"
    // InternalAlf.g:1385:1: rule__ClassMember__Alternatives : ( ( ruleNonFeatureMember ) | ( ruleClassFeatureMember ) );
    public final void rule__ClassMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1389:1: ( ( ruleNonFeatureMember ) | ( ruleClassFeatureMember ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=15 && LA10_1<=17)||LA10_1==53) ) {
                    alt10=1;
                }
                else if ( ((LA10_1>=RULE_ID && LA10_1<=RULE_UNRESTRICTED_NAME)||LA10_1==20||LA10_1==41||LA10_1==54) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=15 && LA10_2<=17)||LA10_2==53) ) {
                    alt10=1;
                }
                else if ( ((LA10_2>=RULE_ID && LA10_2<=RULE_UNRESTRICTED_NAME)||LA10_2==20||LA10_2==41||LA10_2==54) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA10_3 = input.LA(2);

                if ( ((LA10_3>=15 && LA10_3<=17)||LA10_3==53) ) {
                    alt10=1;
                }
                else if ( ((LA10_3>=RULE_ID && LA10_3<=RULE_UNRESTRICTED_NAME)||LA10_3==20||LA10_3==41||LA10_3==54) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA10_4 = input.LA(2);

                if ( ((LA10_4>=15 && LA10_4<=17)||LA10_4==53) ) {
                    alt10=1;
                }
                else if ( ((LA10_4>=RULE_ID && LA10_4<=RULE_UNRESTRICTED_NAME)||LA10_4==20||LA10_4==41||LA10_4==54) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
            case 17:
            case 53:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 20:
            case 41:
            case 54:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAlf.g:1390:2: ( ruleNonFeatureMember )
                    {
                    // InternalAlf.g:1390:2: ( ruleNonFeatureMember )
                    // InternalAlf.g:1391:3: ruleNonFeatureMember
                    {
                     before(grammarAccess.getClassMemberAccess().getNonFeatureMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNonFeatureMember();

                    state._fsp--;

                     after(grammarAccess.getClassMemberAccess().getNonFeatureMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1396:2: ( ruleClassFeatureMember )
                    {
                    // InternalAlf.g:1396:2: ( ruleClassFeatureMember )
                    // InternalAlf.g:1397:3: ruleClassFeatureMember
                    {
                     before(grammarAccess.getClassMemberAccess().getClassFeatureMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassFeatureMember();

                    state._fsp--;

                     after(grammarAccess.getClassMemberAccess().getClassFeatureMemberParserRuleCall_1()); 

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
    // $ANTLR end "rule__ClassMember__Alternatives"


    // $ANTLR start "rule__ClassFeatureMember__Alternatives_1"
    // InternalAlf.g:1406:1: rule__ClassFeatureMember__Alternatives_1 : ( ( ( rule__ClassFeatureMember__Group_1_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_2__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_3__0 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1410:1: ( ( ( rule__ClassFeatureMember__Group_1_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_2__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_3__0 ) ) )
            int alt11=4;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:1411:2: ( ( rule__ClassFeatureMember__Group_1_0__0 ) )
                    {
                    // InternalAlf.g:1411:2: ( ( rule__ClassFeatureMember__Group_1_0__0 ) )
                    // InternalAlf.g:1412:3: ( rule__ClassFeatureMember__Group_1_0__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_0()); 
                    // InternalAlf.g:1413:3: ( rule__ClassFeatureMember__Group_1_0__0 )
                    // InternalAlf.g:1413:4: rule__ClassFeatureMember__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1417:2: ( ( rule__ClassFeatureMember__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1417:2: ( ( rule__ClassFeatureMember__Group_1_1__0 ) )
                    // InternalAlf.g:1418:3: ( rule__ClassFeatureMember__Group_1_1__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_1()); 
                    // InternalAlf.g:1419:3: ( rule__ClassFeatureMember__Group_1_1__0 )
                    // InternalAlf.g:1419:4: rule__ClassFeatureMember__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1423:2: ( ( rule__ClassFeatureMember__Group_1_2__0 ) )
                    {
                    // InternalAlf.g:1423:2: ( ( rule__ClassFeatureMember__Group_1_2__0 ) )
                    // InternalAlf.g:1424:3: ( rule__ClassFeatureMember__Group_1_2__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_2()); 
                    // InternalAlf.g:1425:3: ( rule__ClassFeatureMember__Group_1_2__0 )
                    // InternalAlf.g:1425:4: rule__ClassFeatureMember__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1429:2: ( ( rule__ClassFeatureMember__Group_1_3__0 ) )
                    {
                    // InternalAlf.g:1429:2: ( ( rule__ClassFeatureMember__Group_1_3__0 ) )
                    // InternalAlf.g:1430:3: ( rule__ClassFeatureMember__Group_1_3__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_3()); 
                    // InternalAlf.g:1431:3: ( rule__ClassFeatureMember__Group_1_3__0 )
                    // InternalAlf.g:1431:4: rule__ClassFeatureMember__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__ClassFeatureMember__Alternatives_1"


    // $ANTLR start "rule__ClassFeatureMember__Alternatives_1_0_0"
    // InternalAlf.g:1439:1: rule__ClassFeatureMember__Alternatives_1_0_0 : ( ( 'feature' ) | ( ( rule__ClassFeatureMember__Group_1_0_0_1__0 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1443:1: ( ( 'feature' ) | ( ( rule__ClassFeatureMember__Group_1_0_0_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==54) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:1444:2: ( 'feature' )
                    {
                    // InternalAlf.g:1444:2: ( 'feature' )
                    // InternalAlf.g:1445:3: 'feature'
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_0_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1450:2: ( ( rule__ClassFeatureMember__Group_1_0_0_1__0 ) )
                    {
                    // InternalAlf.g:1450:2: ( ( rule__ClassFeatureMember__Group_1_0_0_1__0 ) )
                    // InternalAlf.g:1451:3: ( rule__ClassFeatureMember__Group_1_0_0_1__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_0_0_1()); 
                    // InternalAlf.g:1452:3: ( rule__ClassFeatureMember__Group_1_0_0_1__0 )
                    // InternalAlf.g:1452:4: rule__ClassFeatureMember__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_1_0_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_1_0_0_1()); 

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
    // $ANTLR end "rule__ClassFeatureMember__Alternatives_1_0_0"


    // $ANTLR start "rule__ClassFeatureMember__Alternatives_1_1_0"
    // InternalAlf.g:1460:1: rule__ClassFeatureMember__Alternatives_1_1_0 : ( ( 'feature' ) | ( ( rule__ClassFeatureMember__Group_1_1_0_1__0 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1464:1: ( ( 'feature' ) | ( ( rule__ClassFeatureMember__Group_1_1_0_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==54) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:1465:2: ( 'feature' )
                    {
                    // InternalAlf.g:1465:2: ( 'feature' )
                    // InternalAlf.g:1466:3: 'feature'
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1471:2: ( ( rule__ClassFeatureMember__Group_1_1_0_1__0 ) )
                    {
                    // InternalAlf.g:1471:2: ( ( rule__ClassFeatureMember__Group_1_1_0_1__0 ) )
                    // InternalAlf.g:1472:3: ( rule__ClassFeatureMember__Group_1_1_0_1__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_1_0_1()); 
                    // InternalAlf.g:1473:3: ( rule__ClassFeatureMember__Group_1_1_0_1__0 )
                    // InternalAlf.g:1473:4: rule__ClassFeatureMember__Group_1_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_1_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_1_1_0_1()); 

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
    // $ANTLR end "rule__ClassFeatureMember__Alternatives_1_1_0"


    // $ANTLR start "rule__ClassFeatureMember__Alternatives_1_3_0"
    // InternalAlf.g:1481:1: rule__ClassFeatureMember__Alternatives_1_3_0 : ( ( ( rule__ClassFeatureMember__Group_1_3_0_0__0 ) ) | ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1485:1: ( ( ( rule__ClassFeatureMember__Group_1_3_0_0__0 ) ) | ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:1486:2: ( ( rule__ClassFeatureMember__Group_1_3_0_0__0 ) )
                    {
                    // InternalAlf.g:1486:2: ( ( rule__ClassFeatureMember__Group_1_3_0_0__0 ) )
                    // InternalAlf.g:1487:3: ( rule__ClassFeatureMember__Group_1_3_0_0__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_3_0_0()); 
                    // InternalAlf.g:1488:3: ( rule__ClassFeatureMember__Group_1_3_0_0__0 )
                    // InternalAlf.g:1488:4: rule__ClassFeatureMember__Group_1_3_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_1_3_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_1_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1492:2: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 ) )
                    {
                    // InternalAlf.g:1492:2: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 ) )
                    // InternalAlf.g:1493:3: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_1_3_0_1()); 
                    // InternalAlf.g:1494:3: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 )
                    // InternalAlf.g:1494:4: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_1_3_0_1()); 

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
    // $ANTLR end "rule__ClassFeatureMember__Alternatives_1_3_0"


    // $ANTLR start "rule__AssociationDeclaration__Alternatives_3_0"
    // InternalAlf.g:1502:1: rule__AssociationDeclaration__Alternatives_3_0 : ( ( 'is' ) | ( 'specializes' ) );
    public final void rule__AssociationDeclaration__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1506:1: ( ( 'is' ) | ( 'specializes' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==19) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:1507:2: ( 'is' )
                    {
                    // InternalAlf.g:1507:2: ( 'is' )
                    // InternalAlf.g:1508:3: 'is'
                    {
                     before(grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1513:2: ( 'specializes' )
                    {
                    // InternalAlf.g:1513:2: ( 'specializes' )
                    // InternalAlf.g:1514:3: 'specializes'
                    {
                     before(grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0_1()); 

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
    // $ANTLR end "rule__AssociationDeclaration__Alternatives_3_0"


    // $ANTLR start "rule__TypedFeatureDefinition__Alternatives_1_2"
    // InternalAlf.g:1523:1: rule__TypedFeatureDefinition__Alternatives_1_2 : ( ( ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 ) ) | ( 'any' ) );
    public final void rule__TypedFeatureDefinition__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1527:1: ( ( ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 ) ) | ( 'any' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlf.g:1528:2: ( ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 ) )
                    {
                    // InternalAlf.g:1528:2: ( ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 ) )
                    // InternalAlf.g:1529:3: ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 )
                    {
                     before(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeAssignment_1_2_0()); 
                    // InternalAlf.g:1530:3: ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 )
                    // InternalAlf.g:1530:4: rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeAssignment_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1534:2: ( 'any' )
                    {
                    // InternalAlf.g:1534:2: ( 'any' )
                    // InternalAlf.g:1535:3: 'any'
                    {
                     before(grammarAccess.getTypedFeatureDefinitionAccess().getAnyKeyword_1_2_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTypedFeatureDefinitionAccess().getAnyKeyword_1_2_1()); 

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
    // $ANTLR end "rule__TypedFeatureDefinition__Alternatives_1_2"


    // $ANTLR start "rule__TypedFeatureDefinition__Alternatives_3"
    // InternalAlf.g:1544:1: rule__TypedFeatureDefinition__Alternatives_3 : ( ( ( rule__TypedFeatureDefinition__Group_3_0__0 ) ) | ( ( rule__TypedFeatureDefinition__Group_3_1__0 ) ) );
    public final void rule__TypedFeatureDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1548:1: ( ( ( rule__TypedFeatureDefinition__Group_3_0__0 ) ) | ( ( rule__TypedFeatureDefinition__Group_3_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39||LA17_0==46) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlf.g:1549:2: ( ( rule__TypedFeatureDefinition__Group_3_0__0 ) )
                    {
                    // InternalAlf.g:1549:2: ( ( rule__TypedFeatureDefinition__Group_3_0__0 ) )
                    // InternalAlf.g:1550:3: ( rule__TypedFeatureDefinition__Group_3_0__0 )
                    {
                     before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_3_0()); 
                    // InternalAlf.g:1551:3: ( rule__TypedFeatureDefinition__Group_3_0__0 )
                    // InternalAlf.g:1551:4: rule__TypedFeatureDefinition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1555:2: ( ( rule__TypedFeatureDefinition__Group_3_1__0 ) )
                    {
                    // InternalAlf.g:1555:2: ( ( rule__TypedFeatureDefinition__Group_3_1__0 ) )
                    // InternalAlf.g:1556:3: ( rule__TypedFeatureDefinition__Group_3_1__0 )
                    {
                     before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_3_1()); 
                    // InternalAlf.g:1557:3: ( rule__TypedFeatureDefinition__Group_3_1__0 )
                    // InternalAlf.g:1557:4: rule__TypedFeatureDefinition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__TypedFeatureDefinition__Alternatives_3"


    // $ANTLR start "rule__UntypedFeatureDefinition__Alternatives_2"
    // InternalAlf.g:1565:1: rule__UntypedFeatureDefinition__Alternatives_2 : ( ( ( rule__UntypedFeatureDefinition__Group_2_0__0 ) ) | ( ( rule__UntypedFeatureDefinition__Group_2_1__0 ) ) );
    public final void rule__UntypedFeatureDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1569:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_0__0 ) ) | ( ( rule__UntypedFeatureDefinition__Group_2_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_NATURAL_VALUE) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==44) ) {
                        int LA18_5 = input.LA(4);

                        if ( (LA18_5==37||LA18_5==46) ) {
                            alt18=1;
                        }
                        else if ( (LA18_5==39) ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA18_3==45) ) {
                        int LA18_6 = input.LA(4);

                        if ( (LA18_6==RULE_NATURAL_VALUE) ) {
                            int LA18_8 = input.LA(5);

                            if ( (LA18_8==44) ) {
                                int LA18_5 = input.LA(6);

                                if ( (LA18_5==37||LA18_5==46) ) {
                                    alt18=1;
                                }
                                else if ( (LA18_5==39) ) {
                                    alt18=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 18, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA18_6==25) ) {
                            int LA18_4 = input.LA(5);

                            if ( (LA18_4==44) ) {
                                int LA18_5 = input.LA(6);

                                if ( (LA18_5==37||LA18_5==46) ) {
                                    alt18=1;
                                }
                                else if ( (LA18_5==39) ) {
                                    alt18=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 18, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1==25) ) {
                    int LA18_4 = input.LA(3);

                    if ( (LA18_4==44) ) {
                        int LA18_5 = input.LA(4);

                        if ( (LA18_5==37||LA18_5==46) ) {
                            alt18=1;
                        }
                        else if ( (LA18_5==39) ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==37||LA18_0==46) ) {
                alt18=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:1570:2: ( ( rule__UntypedFeatureDefinition__Group_2_0__0 ) )
                    {
                    // InternalAlf.g:1570:2: ( ( rule__UntypedFeatureDefinition__Group_2_0__0 ) )
                    // InternalAlf.g:1571:3: ( rule__UntypedFeatureDefinition__Group_2_0__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0()); 
                    // InternalAlf.g:1572:3: ( rule__UntypedFeatureDefinition__Group_2_0__0 )
                    // InternalAlf.g:1572:4: rule__UntypedFeatureDefinition__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1576:2: ( ( rule__UntypedFeatureDefinition__Group_2_1__0 ) )
                    {
                    // InternalAlf.g:1576:2: ( ( rule__UntypedFeatureDefinition__Group_2_1__0 ) )
                    // InternalAlf.g:1577:3: ( rule__UntypedFeatureDefinition__Group_2_1__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_1()); 
                    // InternalAlf.g:1578:3: ( rule__UntypedFeatureDefinition__Group_2_1__0 )
                    // InternalAlf.g:1578:4: rule__UntypedFeatureDefinition__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__UntypedFeatureDefinition__Alternatives_2"


    // $ANTLR start "rule__UntypedFeatureDefinition__Alternatives_2_0_1"
    // InternalAlf.g:1586:1: rule__UntypedFeatureDefinition__Alternatives_2_0_1 : ( ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 ) ) | ( ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 ) ) );
    public final void rule__UntypedFeatureDefinition__Alternatives_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1590:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 ) ) | ( ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
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
                    // InternalAlf.g:1591:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 ) )
                    {
                    // InternalAlf.g:1591:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 ) )
                    // InternalAlf.g:1592:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_1_0()); 
                    // InternalAlf.g:1593:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 )
                    // InternalAlf.g:1593:4: rule__UntypedFeatureDefinition__Group_2_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__Group_2_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1597:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 ) )
                    {
                    // InternalAlf.g:1597:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 ) )
                    // InternalAlf.g:1598:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_1_1()); 
                    // InternalAlf.g:1599:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 )
                    // InternalAlf.g:1599:4: rule__UntypedFeatureDefinition__Group_2_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__Group_2_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_1_1()); 

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
    // $ANTLR end "rule__UntypedFeatureDefinition__Alternatives_2_0_1"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Alternatives"
    // InternalAlf.g:1607:1: rule__OwnedRedefinitionOrSubset__Alternatives : ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1611:1: ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18||LA20_0==22) ) {
                alt20=1;
            }
            else if ( (LA20_0==47) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlf.g:1612:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    {
                    // InternalAlf.g:1612:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    // InternalAlf.g:1613:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_0()); 
                    // InternalAlf.g:1614:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    // InternalAlf.g:1614:4: rule__OwnedRedefinitionOrSubset__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OwnedRedefinitionOrSubset__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1618:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    {
                    // InternalAlf.g:1618:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    // InternalAlf.g:1619:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_1()); 
                    // InternalAlf.g:1620:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    // InternalAlf.g:1620:4: rule__OwnedRedefinitionOrSubset__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OwnedRedefinitionOrSubset__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Alternatives"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Alternatives_0_0"
    // InternalAlf.g:1628:1: rule__OwnedRedefinitionOrSubset__Alternatives_0_0 : ( ( 'is' ) | ( 'redefines' ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1632:1: ( ( 'is' ) | ( 'redefines' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            else if ( (LA21_0==22) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:1633:2: ( 'is' )
                    {
                    // InternalAlf.g:1633:2: ( 'is' )
                    // InternalAlf.g:1634:3: 'is'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1639:2: ( 'redefines' )
                    {
                    // InternalAlf.g:1639:2: ( 'redefines' )
                    // InternalAlf.g:1640:3: 'redefines'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1()); 

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
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Alternatives_0_0"


    // $ANTLR start "rule__BinaryExpression__Alternatives_1_1"
    // InternalAlf.g:1649:1: rule__BinaryExpression__Alternatives_1_1 : ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) );
    public final void rule__BinaryExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1653:1: ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=23 && LA22_0<=27)) ) {
                alt22=1;
            }
            else if ( (LA22_0==56) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1654:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    {
                    // InternalAlf.g:1654:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    // InternalAlf.g:1655:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_0()); 
                    // InternalAlf.g:1656:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    // InternalAlf.g:1656:4: rule__BinaryExpression__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryExpression__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1660:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    {
                    // InternalAlf.g:1660:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    // InternalAlf.g:1661:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_1()); 
                    // InternalAlf.g:1662:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    // InternalAlf.g:1662:4: rule__BinaryExpression__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryExpression__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__BinaryExpression__Alternatives_1_1"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // InternalAlf.g:1670:1: rule__BinaryOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1674:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt23=1;
                }
                break;
            case 24:
                {
                alt23=2;
                }
                break;
            case 25:
                {
                alt23=3;
                }
                break;
            case 26:
                {
                alt23=4;
                }
                break;
            case 27:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAlf.g:1675:2: ( '+' )
                    {
                    // InternalAlf.g:1675:2: ( '+' )
                    // InternalAlf.g:1676:3: '+'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1681:2: ( '-' )
                    {
                    // InternalAlf.g:1681:2: ( '-' )
                    // InternalAlf.g:1682:3: '-'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1687:2: ( '*' )
                    {
                    // InternalAlf.g:1687:2: ( '*' )
                    // InternalAlf.g:1688:3: '*'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1693:2: ( '/' )
                    {
                    // InternalAlf.g:1693:2: ( '/' )
                    // InternalAlf.g:1694:3: '/'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1699:2: ( '^' )
                    {
                    // InternalAlf.g:1699:2: ( '^' )
                    // InternalAlf.g:1700:3: '^'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_4()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_4()); 

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
    // $ANTLR end "rule__BinaryOperator__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalAlf.g:1709:1: rule__UnaryExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1713:1: ( ( rulePrimaryExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING_VALUE)||LA24_0==25||LA24_0==37||LA24_0==49||(LA24_0>=51 && LA24_0<=52)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=23 && LA24_0<=24)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1714:2: ( rulePrimaryExpression )
                    {
                    // InternalAlf.g:1714:2: ( rulePrimaryExpression )
                    // InternalAlf.g:1715:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1720:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1720:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // InternalAlf.g:1721:3: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1722:3: ( rule__UnaryExpression__Group_1__0 )
                    // InternalAlf.g:1722:4: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 

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
    // InternalAlf.g:1730:1: rule__UnaryOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1734:1: ( ( '+' ) | ( '-' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            else if ( (LA25_0==24) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:1735:2: ( '+' )
                    {
                    // InternalAlf.g:1735:2: ( '+' )
                    // InternalAlf.g:1736:3: '+'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1741:2: ( '-' )
                    {
                    // InternalAlf.g:1741:2: ( '-' )
                    // InternalAlf.g:1742:3: '-'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 

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


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalAlf.g:1751:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1755:1: ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) )
            int alt26=5;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1756:2: ( ruleLiteralExpression )
                    {
                    // InternalAlf.g:1756:2: ( ruleLiteralExpression )
                    // InternalAlf.g:1757:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1762:2: ( ruleElementReferenceExpression )
                    {
                    // InternalAlf.g:1762:2: ( ruleElementReferenceExpression )
                    // InternalAlf.g:1763:3: ruleElementReferenceExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getElementReferenceExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleElementReferenceExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getElementReferenceExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1768:2: ( ruleInstanceCreationExpression )
                    {
                    // InternalAlf.g:1768:2: ( ruleInstanceCreationExpression )
                    // InternalAlf.g:1769:3: ruleInstanceCreationExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getInstanceCreationExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInstanceCreationExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getInstanceCreationExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1774:2: ( ruleSequenceConstructionExpression )
                    {
                    // InternalAlf.g:1774:2: ( ruleSequenceConstructionExpression )
                    // InternalAlf.g:1775:3: ruleSequenceConstructionExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getSequenceConstructionExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceConstructionExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getSequenceConstructionExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1780:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalAlf.g:1780:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalAlf.g:1781:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalAlf.g:1782:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalAlf.g:1782:4: rule__PrimaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // InternalAlf.g:1790:1: rule__LiteralExpression__Alternatives : ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1794:1: ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt27=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt27=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt27=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==52) ) {
                    alt27=4;
                }
                else if ( (LA27_4==EOF||(LA27_4>=23 && LA27_4<=27)||(LA27_4>=38 && LA27_4<=40)||LA27_4==44||LA27_4==50||LA27_4==56) ) {
                    alt27=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt27=4;
                }
                break;
            case 25:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1795:2: ( ruleNullLiteralExpression )
                    {
                    // InternalAlf.g:1795:2: ( ruleNullLiteralExpression )
                    // InternalAlf.g:1796:3: ruleNullLiteralExpression
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getNullLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNullLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getNullLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1801:2: ( ruleBooleanLiteralExpression )
                    {
                    // InternalAlf.g:1801:2: ( ruleBooleanLiteralExpression )
                    // InternalAlf.g:1802:3: ruleBooleanLiteralExpression
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1807:2: ( ruleStringLiteralExpression )
                    {
                    // InternalAlf.g:1807:2: ( ruleStringLiteralExpression )
                    // InternalAlf.g:1808:3: ruleStringLiteralExpression
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getStringLiteralExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getStringLiteralExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1813:2: ( ruleRealLiteralExpression )
                    {
                    // InternalAlf.g:1813:2: ( ruleRealLiteralExpression )
                    // InternalAlf.g:1814:3: ruleRealLiteralExpression
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getRealLiteralExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getRealLiteralExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1819:2: ( ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1819:2: ( ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1820:3: ruleUnlimitedNaturalLiteralExpression
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getUnlimitedNaturalLiteralExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getUnlimitedNaturalLiteralExpressionParserRuleCall_4()); 

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


    // $ANTLR start "rule__RealValue__Alternatives_0"
    // InternalAlf.g:1829:1: rule__RealValue__Alternatives_0 : ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) );
    public final void rule__RealValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1833:1: ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_NATURAL_VALUE) ) {
                alt28=1;
            }
            else if ( (LA28_0==52) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1834:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    {
                    // InternalAlf.g:1834:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    // InternalAlf.g:1835:3: ( rule__RealValue__Group_0_0__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_0()); 
                    // InternalAlf.g:1836:3: ( rule__RealValue__Group_0_0__0 )
                    // InternalAlf.g:1836:4: rule__RealValue__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RealValue__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealValueAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1840:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    {
                    // InternalAlf.g:1840:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    // InternalAlf.g:1841:3: ( rule__RealValue__Group_0_1__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_1()); 
                    // InternalAlf.g:1842:3: ( rule__RealValue__Group_0_1__0 )
                    // InternalAlf.g:1842:4: rule__RealValue__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RealValue__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealValueAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__RealValue__Alternatives_0"


    // $ANTLR start "rule__RealValue__Alternatives_1_0"
    // InternalAlf.g:1850:1: rule__RealValue__Alternatives_1_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__RealValue__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1854:1: ( ( 'e' ) | ( 'E' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            else if ( (LA29_0==29) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1855:2: ( 'e' )
                    {
                    // InternalAlf.g:1855:2: ( 'e' )
                    // InternalAlf.g:1856:3: 'e'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1861:2: ( 'E' )
                    {
                    // InternalAlf.g:1861:2: ( 'E' )
                    // InternalAlf.g:1862:3: 'E'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getEKeyword_1_0_1()); 

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
    // $ANTLR end "rule__RealValue__Alternatives_1_0"


    // $ANTLR start "rule__RealValue__Alternatives_1_1"
    // InternalAlf.g:1871:1: rule__RealValue__Alternatives_1_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__RealValue__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1875:1: ( ( '+' ) | ( '-' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            else if ( (LA30_0==24) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1876:2: ( '+' )
                    {
                    // InternalAlf.g:1876:2: ( '+' )
                    // InternalAlf.g:1877:3: '+'
                    {
                     before(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1882:2: ( '-' )
                    {
                    // InternalAlf.g:1882:2: ( '-' )
                    // InternalAlf.g:1883:3: '-'
                    {
                     before(grammarAccess.getRealValueAccess().getHyphenMinusKeyword_1_1_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getHyphenMinusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__RealValue__Alternatives_1_1"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpression__Alternatives"
    // InternalAlf.g:1892:1: rule__UnlimitedNaturalLiteralExpression__Alternatives : ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) );
    public final void rule__UnlimitedNaturalLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1896:1: ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_NATURAL_VALUE) ) {
                alt31=1;
            }
            else if ( (LA31_0==25) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlf.g:1897:2: ( ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1897:2: ( ruleNaturalLiteralExpression )
                    // InternalAlf.g:1898:3: ruleNaturalLiteralExpression
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
                    // InternalAlf.g:1903:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1903:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    // InternalAlf.g:1904:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1905:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    // InternalAlf.g:1905:4: rule__UnlimitedNaturalLiteralExpression__Group_1__0
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
    // InternalAlf.g:1913:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1917:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_UNRESTRICTED_NAME) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1918:2: ( RULE_ID )
                    {
                    // InternalAlf.g:1918:2: ( RULE_ID )
                    // InternalAlf.g:1919:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1924:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:1924:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:1925:3: RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:1934:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1938:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt33=1;
                }
                break;
            case 31:
                {
                alt33=2;
                }
                break;
            case 32:
                {
                alt33=3;
                }
                break;
            case 33:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1939:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:1939:2: ( ( 'public' ) )
                    // InternalAlf.g:1940:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:1941:3: ( 'public' )
                    // InternalAlf.g:1941:4: 'public'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1945:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:1945:2: ( ( 'private' ) )
                    // InternalAlf.g:1946:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:1947:3: ( 'private' )
                    // InternalAlf.g:1947:4: 'private'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1951:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:1951:2: ( ( 'protected' ) )
                    // InternalAlf.g:1952:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:1953:3: ( 'protected' )
                    // InternalAlf.g:1953:4: 'protected'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1957:2: ( ( 'packaged' ) )
                    {
                    // InternalAlf.g:1957:2: ( ( 'packaged' ) )
                    // InternalAlf.g:1958:3: ( 'packaged' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3()); 
                    // InternalAlf.g:1959:3: ( 'packaged' )
                    // InternalAlf.g:1959:4: 'packaged'
                    {
                    match(input,33,FOLLOW_2); 

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


    // $ANTLR start "rule__FeatureDirection__Alternatives"
    // InternalAlf.g:1967:1: rule__FeatureDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) );
    public final void rule__FeatureDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1971:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt34=1;
                }
                break;
            case 35:
                {
                alt34=2;
                }
                break;
            case 36:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalAlf.g:1972:2: ( ( 'in' ) )
                    {
                    // InternalAlf.g:1972:2: ( ( 'in' ) )
                    // InternalAlf.g:1973:3: ( 'in' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:1974:3: ( 'in' )
                    // InternalAlf.g:1974:4: 'in'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1978:2: ( ( 'out' ) )
                    {
                    // InternalAlf.g:1978:2: ( ( 'out' ) )
                    // InternalAlf.g:1979:3: ( 'out' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:1980:3: ( 'out' )
                    // InternalAlf.g:1980:4: 'out'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1984:2: ( ( 'inout' ) )
                    {
                    // InternalAlf.g:1984:2: ( ( 'inout' ) )
                    // InternalAlf.g:1985:3: ( 'inout' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:1986:3: ( 'inout' )
                    // InternalAlf.g:1986:4: 'inout'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__FeatureDirection__Alternatives"


    // $ANTLR start "rule__PackageDefinition__Group__0"
    // InternalAlf.g:1994:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1998:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:1999:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
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
    // InternalAlf.g:2006:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2010:1: ( ( 'package' ) )
            // InternalAlf.g:2011:1: ( 'package' )
            {
            // InternalAlf.g:2011:1: ( 'package' )
            // InternalAlf.g:2012:2: 'package'
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
    // InternalAlf.g:2021:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2025:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:2026:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
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
    // InternalAlf.g:2033:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2037:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:2038:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:2038:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:2039:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:2040:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:2040:3: rule__PackageDefinition__NameAssignment_1
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
    // InternalAlf.g:2048:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2052:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:2053:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
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
    // InternalAlf.g:2060:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2064:1: ( ( '{' ) )
            // InternalAlf.g:2065:1: ( '{' )
            {
            // InternalAlf.g:2065:1: ( '{' )
            // InternalAlf.g:2066:2: '{'
            {
             before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAlf.g:2075:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2079:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:2080:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
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
    // InternalAlf.g:2087:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2091:1: ( ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* ) )
            // InternalAlf.g:2092:1: ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* )
            {
            // InternalAlf.g:2092:1: ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* )
            // InternalAlf.g:2093:2: ( rule__PackageDefinition__OwnedMembershipAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipAssignment_3()); 
            // InternalAlf.g:2094:2: ( rule__PackageDefinition__OwnedMembershipAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_UNRESTRICTED_NAME)||(LA35_0>=15 && LA35_0<=17)||LA35_0==20||(LA35_0>=30 && LA35_0<=33)||LA35_0==53) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAlf.g:2094:3: rule__PackageDefinition__OwnedMembershipAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__OwnedMembershipAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipAssignment_3()); 

            }


            }

        }
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
    // InternalAlf.g:2102:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2106:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:2107:2: rule__PackageDefinition__Group__4__Impl
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
    // InternalAlf.g:2113:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2117:1: ( ( '}' ) )
            // InternalAlf.g:2118:1: ( '}' )
            {
            // InternalAlf.g:2118:1: ( '}' )
            // InternalAlf.g:2119:2: '}'
            {
             before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__NonFeatureMember__Group__0"
    // InternalAlf.g:2129:1: rule__NonFeatureMember__Group__0 : rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1 ;
    public final void rule__NonFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2133:1: ( rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1 )
            // InternalAlf.g:2134:2: rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NonFeatureMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group__0"


    // $ANTLR start "rule__NonFeatureMember__Group__0__Impl"
    // InternalAlf.g:2141:1: rule__NonFeatureMember__Group__0__Impl : ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__NonFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2145:1: ( ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:2146:1: ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:2146:1: ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:2147:2: ( rule__NonFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:2148:2: ( rule__NonFeatureMember__VisibilityAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=30 && LA36_0<=33)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:2148:3: rule__NonFeatureMember__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFeatureMember__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonFeatureMemberAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group__0__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group__1"
    // InternalAlf.g:2156:1: rule__NonFeatureMember__Group__1 : rule__NonFeatureMember__Group__1__Impl ;
    public final void rule__NonFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2160:1: ( rule__NonFeatureMember__Group__1__Impl )
            // InternalAlf.g:2161:2: rule__NonFeatureMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group__1"


    // $ANTLR start "rule__NonFeatureMember__Group__1__Impl"
    // InternalAlf.g:2167:1: rule__NonFeatureMember__Group__1__Impl : ( ( rule__NonFeatureMember__Alternatives_1 ) ) ;
    public final void rule__NonFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2171:1: ( ( ( rule__NonFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:2172:1: ( ( rule__NonFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:2172:1: ( ( rule__NonFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:2173:2: ( rule__NonFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:2174:2: ( rule__NonFeatureMember__Alternatives_1 )
            // InternalAlf.g:2174:3: rule__NonFeatureMember__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFeatureMemberAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group__1__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__0"
    // InternalAlf.g:2183:1: rule__NonFeatureMember__Group_1_1__0 : rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1 ;
    public final void rule__NonFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2187:1: ( rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1 )
            // InternalAlf.g:2188:2: rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__NonFeatureMember__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__0"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__0__Impl"
    // InternalAlf.g:2195:1: rule__NonFeatureMember__Group_1_1__0__Impl : ( ruleNonFeatureMemberKind ) ;
    public final void rule__NonFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2199:1: ( ( ruleNonFeatureMemberKind ) )
            // InternalAlf.g:2200:1: ( ruleNonFeatureMemberKind )
            {
            // InternalAlf.g:2200:1: ( ruleNonFeatureMemberKind )
            // InternalAlf.g:2201:2: ruleNonFeatureMemberKind
            {
             before(grammarAccess.getNonFeatureMemberAccess().getNonFeatureMemberKindParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNonFeatureMemberKind();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberAccess().getNonFeatureMemberKindParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__0__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__1"
    // InternalAlf.g:2210:1: rule__NonFeatureMember__Group_1_1__1 : rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2 ;
    public final void rule__NonFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2214:1: ( rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2 )
            // InternalAlf.g:2215:2: rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__NonFeatureMember__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__1"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__1__Impl"
    // InternalAlf.g:2222:1: rule__NonFeatureMember__Group_1_1__1__Impl : ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? ) ;
    public final void rule__NonFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2226:1: ( ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? ) )
            // InternalAlf.g:2227:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? )
            {
            // InternalAlf.g:2227:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? )
            // InternalAlf.g:2228:2: ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberNameAssignment_1_1_1()); 
            // InternalAlf.g:2229:2: ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlf.g:2229:3: rule__NonFeatureMember__MemberNameAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFeatureMember__MemberNameAssignment_1_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonFeatureMemberAccess().getMemberNameAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__1__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__2"
    // InternalAlf.g:2237:1: rule__NonFeatureMember__Group_1_1__2 : rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3 ;
    public final void rule__NonFeatureMember__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2241:1: ( rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3 )
            // InternalAlf.g:2242:2: rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3
            {
            pushFollow(FOLLOW_3);
            rule__NonFeatureMember__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__2"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__2__Impl"
    // InternalAlf.g:2249:1: rule__NonFeatureMember__Group_1_1__2__Impl : ( 'is' ) ;
    public final void rule__NonFeatureMember__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2253:1: ( ( 'is' ) )
            // InternalAlf.g:2254:1: ( 'is' )
            {
            // InternalAlf.g:2254:1: ( 'is' )
            // InternalAlf.g:2255:2: 'is'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getIsKeyword_1_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNonFeatureMemberAccess().getIsKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__2__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__3"
    // InternalAlf.g:2264:1: rule__NonFeatureMember__Group_1_1__3 : rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4 ;
    public final void rule__NonFeatureMember__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2268:1: ( rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4 )
            // InternalAlf.g:2269:2: rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4
            {
            pushFollow(FOLLOW_9);
            rule__NonFeatureMember__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__3"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__3__Impl"
    // InternalAlf.g:2276:1: rule__NonFeatureMember__Group_1_1__3__Impl : ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) ) ;
    public final void rule__NonFeatureMember__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2280:1: ( ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) ) )
            // InternalAlf.g:2281:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) )
            {
            // InternalAlf.g:2281:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) )
            // InternalAlf.g:2282:2: ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementAssignment_1_1_3()); 
            // InternalAlf.g:2283:2: ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 )
            // InternalAlf.g:2283:3: rule__NonFeatureMember__MemberElementAssignment_1_1_3
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__MemberElementAssignment_1_1_3();

            state._fsp--;


            }

             after(grammarAccess.getNonFeatureMemberAccess().getMemberElementAssignment_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__3__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__4"
    // InternalAlf.g:2291:1: rule__NonFeatureMember__Group_1_1__4 : rule__NonFeatureMember__Group_1_1__4__Impl ;
    public final void rule__NonFeatureMember__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2295:1: ( rule__NonFeatureMember__Group_1_1__4__Impl )
            // InternalAlf.g:2296:2: rule__NonFeatureMember__Group_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__4"


    // $ANTLR start "rule__NonFeatureMember__Group_1_1__4__Impl"
    // InternalAlf.g:2302:1: rule__NonFeatureMember__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__NonFeatureMember__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2306:1: ( ( ';' ) )
            // InternalAlf.g:2307:1: ( ';' )
            {
            // InternalAlf.g:2307:1: ( ';' )
            // InternalAlf.g:2308:2: ';'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_1_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_1__4__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group__0"
    // InternalAlf.g:2318:1: rule__PackagedFeatureMember__Group__0 : rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1 ;
    public final void rule__PackagedFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2322:1: ( rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1 )
            // InternalAlf.g:2323:2: rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PackagedFeatureMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group__0"


    // $ANTLR start "rule__PackagedFeatureMember__Group__0__Impl"
    // InternalAlf.g:2330:1: rule__PackagedFeatureMember__Group__0__Impl : ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__PackagedFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2334:1: ( ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:2335:1: ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:2335:1: ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:2336:2: ( rule__PackagedFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:2337:2: ( rule__PackagedFeatureMember__VisibilityAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=30 && LA38_0<=33)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:2337:3: rule__PackagedFeatureMember__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group__0__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group__1"
    // InternalAlf.g:2345:1: rule__PackagedFeatureMember__Group__1 : rule__PackagedFeatureMember__Group__1__Impl ;
    public final void rule__PackagedFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2349:1: ( rule__PackagedFeatureMember__Group__1__Impl )
            // InternalAlf.g:2350:2: rule__PackagedFeatureMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group__1"


    // $ANTLR start "rule__PackagedFeatureMember__Group__1__Impl"
    // InternalAlf.g:2356:1: rule__PackagedFeatureMember__Group__1__Impl : ( ( rule__PackagedFeatureMember__Alternatives_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2360:1: ( ( ( rule__PackagedFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:2361:1: ( ( rule__PackagedFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:2361:1: ( ( rule__PackagedFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:2362:2: ( rule__PackagedFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:2363:2: ( rule__PackagedFeatureMember__Alternatives_1 )
            // InternalAlf.g:2363:3: rule__PackagedFeatureMember__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group__1__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_0__0"
    // InternalAlf.g:2372:1: rule__PackagedFeatureMember__Group_1_0__0 : rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1 ;
    public final void rule__PackagedFeatureMember__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2376:1: ( rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1 )
            // InternalAlf.g:2377:2: rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__PackagedFeatureMember__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_0__0"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_0__0__Impl"
    // InternalAlf.g:2384:1: rule__PackagedFeatureMember__Group_1_0__0__Impl : ( ( 'feature' )? ) ;
    public final void rule__PackagedFeatureMember__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2388:1: ( ( ( 'feature' )? ) )
            // InternalAlf.g:2389:1: ( ( 'feature' )? )
            {
            // InternalAlf.g:2389:1: ( ( 'feature' )? )
            // InternalAlf.g:2390:2: ( 'feature' )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0()); 
            // InternalAlf.g:2391:2: ( 'feature' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:2391:3: 'feature'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_0__0__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_0__1"
    // InternalAlf.g:2399:1: rule__PackagedFeatureMember__Group_1_0__1 : rule__PackagedFeatureMember__Group_1_0__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2403:1: ( rule__PackagedFeatureMember__Group_1_0__1__Impl )
            // InternalAlf.g:2404:2: rule__PackagedFeatureMember__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_0__1"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_0__1__Impl"
    // InternalAlf.g:2410:1: rule__PackagedFeatureMember__Group_1_0__1__Impl : ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2414:1: ( ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) )
            // InternalAlf.g:2415:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            {
            // InternalAlf.g:2415:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            // InternalAlf.g:2416:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_1()); 
            // InternalAlf.g:2417:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            // InternalAlf.g:2417:3: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_0__1__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1__0"
    // InternalAlf.g:2426:1: rule__PackagedFeatureMember__Group_1_1__0 : rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1 ;
    public final void rule__PackagedFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2430:1: ( rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1 )
            // InternalAlf.g:2431:2: rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__PackagedFeatureMember__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1__0"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1__0__Impl"
    // InternalAlf.g:2438:1: rule__PackagedFeatureMember__Group_1_1__0__Impl : ( 'feature' ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2442:1: ( ( 'feature' ) )
            // InternalAlf.g:2443:1: ( 'feature' )
            {
            // InternalAlf.g:2443:1: ( 'feature' )
            // InternalAlf.g:2444:2: 'feature'
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1__0__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1__1"
    // InternalAlf.g:2453:1: rule__PackagedFeatureMember__Group_1_1__1 : rule__PackagedFeatureMember__Group_1_1__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2457:1: ( rule__PackagedFeatureMember__Group_1_1__1__Impl )
            // InternalAlf.g:2458:2: rule__PackagedFeatureMember__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1__1"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1__1__Impl"
    // InternalAlf.g:2464:1: rule__PackagedFeatureMember__Group_1_1__1__Impl : ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2468:1: ( ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) ) )
            // InternalAlf.g:2469:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) )
            {
            // InternalAlf.g:2469:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) )
            // InternalAlf.g:2470:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_1()); 
            // InternalAlf.g:2471:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 )
            // InternalAlf.g:2471:3: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1__1__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2__0"
    // InternalAlf.g:2480:1: rule__PackagedFeatureMember__Group_1_2__0 : rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1 ;
    public final void rule__PackagedFeatureMember__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2484:1: ( rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1 )
            // InternalAlf.g:2485:2: rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1
            {
            pushFollow(FOLLOW_13);
            rule__PackagedFeatureMember__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2__0"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2__0__Impl"
    // InternalAlf.g:2492:1: rule__PackagedFeatureMember__Group_1_2__0__Impl : ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2496:1: ( ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) ) )
            // InternalAlf.g:2497:1: ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) )
            {
            // InternalAlf.g:2497:1: ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) )
            // InternalAlf.g:2498:2: ( rule__PackagedFeatureMember__Alternatives_1_2_0 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1_2_0()); 
            // InternalAlf.g:2499:2: ( rule__PackagedFeatureMember__Alternatives_1_2_0 )
            // InternalAlf.g:2499:3: rule__PackagedFeatureMember__Alternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Alternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2__0__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2__1"
    // InternalAlf.g:2507:1: rule__PackagedFeatureMember__Group_1_2__1 : rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2 ;
    public final void rule__PackagedFeatureMember__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2511:1: ( rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2 )
            // InternalAlf.g:2512:2: rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2
            {
            pushFollow(FOLLOW_3);
            rule__PackagedFeatureMember__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2__1"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2__1__Impl"
    // InternalAlf.g:2519:1: rule__PackagedFeatureMember__Group_1_2__1__Impl : ( 'is' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2523:1: ( ( 'is' ) )
            // InternalAlf.g:2524:1: ( 'is' )
            {
            // InternalAlf.g:2524:1: ( 'is' )
            // InternalAlf.g:2525:2: 'is'
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_1_2_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2__1__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2__2"
    // InternalAlf.g:2534:1: rule__PackagedFeatureMember__Group_1_2__2 : rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3 ;
    public final void rule__PackagedFeatureMember__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2538:1: ( rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3 )
            // InternalAlf.g:2539:2: rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3
            {
            pushFollow(FOLLOW_9);
            rule__PackagedFeatureMember__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2__2"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2__2__Impl"
    // InternalAlf.g:2546:1: rule__PackagedFeatureMember__Group_1_2__2__Impl : ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2550:1: ( ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) ) )
            // InternalAlf.g:2551:1: ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) )
            {
            // InternalAlf.g:2551:1: ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) )
            // InternalAlf.g:2552:2: ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementAssignment_1_2_2()); 
            // InternalAlf.g:2553:2: ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 )
            // InternalAlf.g:2553:3: rule__PackagedFeatureMember__MemberElementAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__MemberElementAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2__2__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2__3"
    // InternalAlf.g:2561:1: rule__PackagedFeatureMember__Group_1_2__3 : rule__PackagedFeatureMember__Group_1_2__3__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2565:1: ( rule__PackagedFeatureMember__Group_1_2__3__Impl )
            // InternalAlf.g:2566:2: rule__PackagedFeatureMember__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2__3"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2__3__Impl"
    // InternalAlf.g:2572:1: rule__PackagedFeatureMember__Group_1_2__3__Impl : ( ';' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2576:1: ( ( ';' ) )
            // InternalAlf.g:2577:1: ( ';' )
            {
            // InternalAlf.g:2577:1: ( ';' )
            // InternalAlf.g:2578:2: ';'
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_2_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2__3__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2_0_0__0"
    // InternalAlf.g:2588:1: rule__PackagedFeatureMember__Group_1_2_0_0__0 : rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1 ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2592:1: ( rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1 )
            // InternalAlf.g:2593:2: rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2_0_0__0"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl"
    // InternalAlf.g:2600:1: rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl : ( 'feature' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2604:1: ( ( 'feature' ) )
            // InternalAlf.g:2605:1: ( 'feature' )
            {
            // InternalAlf.g:2605:1: ( 'feature' )
            // InternalAlf.g:2606:2: 'feature'
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_2_0_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2_0_0__1"
    // InternalAlf.g:2615:1: rule__PackagedFeatureMember__Group_1_2_0_0__1 : rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2619:1: ( rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl )
            // InternalAlf.g:2620:2: rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2_0_0__1"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl"
    // InternalAlf.g:2626:1: rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl : ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? ) ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2630:1: ( ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? ) )
            // InternalAlf.g:2631:1: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? )
            {
            // InternalAlf.g:2631:1: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? )
            // InternalAlf.g:2632:2: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_2_0_0_1()); 
            // InternalAlf.g:2633:2: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:2633:3: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalAlf.g:2642:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2646:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:2647:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAlf.g:2654:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2658:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:2659:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:2659:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:2660:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:2661:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:2661:3: rule__ClassDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:2669:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2673:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:2674:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalAlf.g:2681:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2685:1: ( ( 'class' ) )
            // InternalAlf.g:2686:1: ( 'class' )
            {
            // InternalAlf.g:2686:1: ( 'class' )
            // InternalAlf.g:2687:2: 'class'
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
    // InternalAlf.g:2696:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2700:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:2701:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalAlf.g:2708:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2712:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:2713:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:2713:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:2714:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:2715:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:2715:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalAlf.g:2723:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2727:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:2728:2: rule__ClassDeclaration__Group__3__Impl
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
    // InternalAlf.g:2734:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2738:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:2739:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:2739:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:2740:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:2741:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=18 && LA42_0<=19)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:2741:3: rule__ClassDeclaration__Group_3__0
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
    // InternalAlf.g:2750:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2754:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:2755:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalAlf.g:2762:1: rule__ClassDeclaration__Group_3__0__Impl : ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2766:1: ( ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:2767:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:2767:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:2768:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:2769:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            // InternalAlf.g:2769:3: rule__ClassDeclaration__Alternatives_3_0
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
    // InternalAlf.g:2777:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2781:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalAlf.g:2782:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalAlf.g:2789:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2793:1: ( ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) ) )
            // InternalAlf.g:2794:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) )
            {
            // InternalAlf.g:2794:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) )
            // InternalAlf.g:2795:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_1()); 
            // InternalAlf.g:2796:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 )
            // InternalAlf.g:2796:3: rule__ClassDeclaration__OwnedMembershipAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__OwnedMembershipAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_1()); 

            }


            }

        }
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
    // InternalAlf.g:2804:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2808:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalAlf.g:2809:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:2815:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2819:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:2820:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:2820:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:2821:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:2822:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==40) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAlf.g:2822:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalAlf.g:2831:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2835:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalAlf.g:2836:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalAlf.g:2843:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2847:1: ( ( ',' ) )
            // InternalAlf.g:2848:1: ( ',' )
            {
            // InternalAlf.g:2848:1: ( ',' )
            // InternalAlf.g:2849:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAlf.g:2858:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2862:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:2863:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:2869:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2873:1: ( ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) ) )
            // InternalAlf.g:2874:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            {
            // InternalAlf.g:2874:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            // InternalAlf.g:2875:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 
            // InternalAlf.g:2876:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 )
            // InternalAlf.g:2876:3: rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 

            }


            }

        }
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
    // InternalAlf.g:2885:1: rule__ClassDefinition__Group__0 : rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 ;
    public final void rule__ClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2889:1: ( rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 )
            // InternalAlf.g:2890:2: rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1
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
    // InternalAlf.g:2897:1: rule__ClassDefinition__Group__0__Impl : ( ruleClassDeclaration ) ;
    public final void rule__ClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2901:1: ( ( ruleClassDeclaration ) )
            // InternalAlf.g:2902:1: ( ruleClassDeclaration )
            {
            // InternalAlf.g:2902:1: ( ruleClassDeclaration )
            // InternalAlf.g:2903:2: ruleClassDeclaration
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
    // InternalAlf.g:2912:1: rule__ClassDefinition__Group__1 : rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 ;
    public final void rule__ClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2916:1: ( rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 )
            // InternalAlf.g:2917:2: rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAlf.g:2924:1: rule__ClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2928:1: ( ( '{' ) )
            // InternalAlf.g:2929:1: ( '{' )
            {
            // InternalAlf.g:2929:1: ( '{' )
            // InternalAlf.g:2930:2: '{'
            {
             before(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAlf.g:2939:1: rule__ClassDefinition__Group__2 : rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 ;
    public final void rule__ClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2943:1: ( rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 )
            // InternalAlf.g:2944:2: rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAlf.g:2951:1: rule__ClassDefinition__Group__2__Impl : ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* ) ;
    public final void rule__ClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2955:1: ( ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* ) )
            // InternalAlf.g:2956:1: ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* )
            {
            // InternalAlf.g:2956:1: ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* )
            // InternalAlf.g:2957:2: ( rule__ClassDefinition__OwnedMembershipAssignment_2 )*
            {
             before(grammarAccess.getClassDefinitionAccess().getOwnedMembershipAssignment_2()); 
            // InternalAlf.g:2958:2: ( rule__ClassDefinition__OwnedMembershipAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_UNRESTRICTED_NAME)||(LA44_0>=15 && LA44_0<=17)||LA44_0==20||(LA44_0>=30 && LA44_0<=33)||LA44_0==41||(LA44_0>=53 && LA44_0<=54)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAlf.g:2958:3: rule__ClassDefinition__OwnedMembershipAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ClassDefinition__OwnedMembershipAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getClassDefinitionAccess().getOwnedMembershipAssignment_2()); 

            }


            }

        }
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
    // InternalAlf.g:2966:1: rule__ClassDefinition__Group__3 : rule__ClassDefinition__Group__3__Impl ;
    public final void rule__ClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2970:1: ( rule__ClassDefinition__Group__3__Impl )
            // InternalAlf.g:2971:2: rule__ClassDefinition__Group__3__Impl
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
    // InternalAlf.g:2977:1: rule__ClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__ClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2981:1: ( ( '}' ) )
            // InternalAlf.g:2982:1: ( '}' )
            {
            // InternalAlf.g:2982:1: ( '}' )
            // InternalAlf.g:2983:2: '}'
            {
             before(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__ClassFeatureMember__Group__0"
    // InternalAlf.g:2993:1: rule__ClassFeatureMember__Group__0 : rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1 ;
    public final void rule__ClassFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2997:1: ( rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1 )
            // InternalAlf.g:2998:2: rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ClassFeatureMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group__0"


    // $ANTLR start "rule__ClassFeatureMember__Group__0__Impl"
    // InternalAlf.g:3005:1: rule__ClassFeatureMember__Group__0__Impl : ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__ClassFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3009:1: ( ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:3010:1: ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:3010:1: ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:3011:2: ( rule__ClassFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:3012:2: ( rule__ClassFeatureMember__VisibilityAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=30 && LA45_0<=33)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlf.g:3012:3: rule__ClassFeatureMember__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassFeatureMemberAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group__1"
    // InternalAlf.g:3020:1: rule__ClassFeatureMember__Group__1 : rule__ClassFeatureMember__Group__1__Impl ;
    public final void rule__ClassFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3024:1: ( rule__ClassFeatureMember__Group__1__Impl )
            // InternalAlf.g:3025:2: rule__ClassFeatureMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group__1"


    // $ANTLR start "rule__ClassFeatureMember__Group__1__Impl"
    // InternalAlf.g:3031:1: rule__ClassFeatureMember__Group__1__Impl : ( ( rule__ClassFeatureMember__Alternatives_1 ) ) ;
    public final void rule__ClassFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3035:1: ( ( ( rule__ClassFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:3036:1: ( ( rule__ClassFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:3036:1: ( ( rule__ClassFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:3037:2: ( rule__ClassFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:3038:2: ( rule__ClassFeatureMember__Alternatives_1 )
            // InternalAlf.g:3038:3: rule__ClassFeatureMember__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0__0"
    // InternalAlf.g:3047:1: rule__ClassFeatureMember__Group_1_0__0 : rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1 ;
    public final void rule__ClassFeatureMember__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3051:1: ( rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1 )
            // InternalAlf.g:3052:2: rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__ClassFeatureMember__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0__0__Impl"
    // InternalAlf.g:3059:1: rule__ClassFeatureMember__Group_1_0__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3063:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? ) )
            // InternalAlf.g:3064:1: ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? )
            {
            // InternalAlf.g:3064:1: ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? )
            // InternalAlf.g:3065:2: ( rule__ClassFeatureMember__Alternatives_1_0_0 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_0_0()); 
            // InternalAlf.g:3066:2: ( rule__ClassFeatureMember__Alternatives_1_0_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20||LA46_0==54) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlf.g:3066:3: rule__ClassFeatureMember__Alternatives_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Alternatives_1_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0__1"
    // InternalAlf.g:3074:1: rule__ClassFeatureMember__Group_1_0__1 : rule__ClassFeatureMember__Group_1_0__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3078:1: ( rule__ClassFeatureMember__Group_1_0__1__Impl )
            // InternalAlf.g:3079:2: rule__ClassFeatureMember__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0__1__Impl"
    // InternalAlf.g:3085:1: rule__ClassFeatureMember__Group_1_0__1__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3089:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) )
            // InternalAlf.g:3090:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            {
            // InternalAlf.g:3090:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            // InternalAlf.g:3091:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_1()); 
            // InternalAlf.g:3092:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            // InternalAlf.g:3092:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0_0_1__0"
    // InternalAlf.g:3101:1: rule__ClassFeatureMember__Group_1_0_0_1__0 : rule__ClassFeatureMember__Group_1_0_0_1__0__Impl rule__ClassFeatureMember__Group_1_0_0_1__1 ;
    public final void rule__ClassFeatureMember__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3105:1: ( rule__ClassFeatureMember__Group_1_0_0_1__0__Impl rule__ClassFeatureMember__Group_1_0_0_1__1 )
            // InternalAlf.g:3106:2: rule__ClassFeatureMember__Group_1_0_0_1__0__Impl rule__ClassFeatureMember__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ClassFeatureMember__Group_1_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0_0_1__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0_0_1__0__Impl"
    // InternalAlf.g:3113:1: rule__ClassFeatureMember__Group_1_0_0_1__0__Impl : ( ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3117:1: ( ( ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0 ) ) )
            // InternalAlf.g:3118:1: ( ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0 ) )
            {
            // InternalAlf.g:3118:1: ( ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0 ) )
            // InternalAlf.g:3119:2: ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_1_0_0_1_0()); 
            // InternalAlf.g:3120:2: ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0 )
            // InternalAlf.g:3120:3: rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0_0_1__1"
    // InternalAlf.g:3128:1: rule__ClassFeatureMember__Group_1_0_0_1__1 : rule__ClassFeatureMember__Group_1_0_0_1__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3132:1: ( rule__ClassFeatureMember__Group_1_0_0_1__1__Impl )
            // InternalAlf.g:3133:2: rule__ClassFeatureMember__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0_0_1__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0_0_1__1__Impl"
    // InternalAlf.g:3139:1: rule__ClassFeatureMember__Group_1_0_0_1__1__Impl : ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3143:1: ( ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1 ) ) )
            // InternalAlf.g:3144:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1 ) )
            {
            // InternalAlf.g:3144:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1 ) )
            // InternalAlf.g:3145:2: ( rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_0_0_1_1()); 
            // InternalAlf.g:3146:2: ( rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1 )
            // InternalAlf.g:3146:3: rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1__0"
    // InternalAlf.g:3155:1: rule__ClassFeatureMember__Group_1_1__0 : rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1 ;
    public final void rule__ClassFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3159:1: ( rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1 )
            // InternalAlf.g:3160:2: rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ClassFeatureMember__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1__0__Impl"
    // InternalAlf.g:3167:1: rule__ClassFeatureMember__Group_1_1__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3171:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) ) )
            // InternalAlf.g:3172:1: ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) )
            {
            // InternalAlf.g:3172:1: ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) )
            // InternalAlf.g:3173:2: ( rule__ClassFeatureMember__Alternatives_1_1_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_1_0()); 
            // InternalAlf.g:3174:2: ( rule__ClassFeatureMember__Alternatives_1_1_0 )
            // InternalAlf.g:3174:3: rule__ClassFeatureMember__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Alternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1__1"
    // InternalAlf.g:3182:1: rule__ClassFeatureMember__Group_1_1__1 : rule__ClassFeatureMember__Group_1_1__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3186:1: ( rule__ClassFeatureMember__Group_1_1__1__Impl )
            // InternalAlf.g:3187:2: rule__ClassFeatureMember__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1__1__Impl"
    // InternalAlf.g:3193:1: rule__ClassFeatureMember__Group_1_1__1__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3197:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1 ) ) )
            // InternalAlf.g:3198:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1 ) )
            {
            // InternalAlf.g:3198:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1 ) )
            // InternalAlf.g:3199:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_1()); 
            // InternalAlf.g:3200:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1 )
            // InternalAlf.g:3200:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1_0_1__0"
    // InternalAlf.g:3209:1: rule__ClassFeatureMember__Group_1_1_0_1__0 : rule__ClassFeatureMember__Group_1_1_0_1__0__Impl rule__ClassFeatureMember__Group_1_1_0_1__1 ;
    public final void rule__ClassFeatureMember__Group_1_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3213:1: ( rule__ClassFeatureMember__Group_1_1_0_1__0__Impl rule__ClassFeatureMember__Group_1_1_0_1__1 )
            // InternalAlf.g:3214:2: rule__ClassFeatureMember__Group_1_1_0_1__0__Impl rule__ClassFeatureMember__Group_1_1_0_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ClassFeatureMember__Group_1_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1_0_1__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1_0_1__0__Impl"
    // InternalAlf.g:3221:1: rule__ClassFeatureMember__Group_1_1_0_1__0__Impl : ( ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3225:1: ( ( ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0 ) ) )
            // InternalAlf.g:3226:1: ( ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0 ) )
            {
            // InternalAlf.g:3226:1: ( ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0 ) )
            // InternalAlf.g:3227:2: ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_1_1_0_1_0()); 
            // InternalAlf.g:3228:2: ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0 )
            // InternalAlf.g:3228:3: rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_1_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1_0_1__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1_0_1__1"
    // InternalAlf.g:3236:1: rule__ClassFeatureMember__Group_1_1_0_1__1 : rule__ClassFeatureMember__Group_1_1_0_1__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3240:1: ( rule__ClassFeatureMember__Group_1_1_0_1__1__Impl )
            // InternalAlf.g:3241:2: rule__ClassFeatureMember__Group_1_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1_0_1__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1_0_1__1__Impl"
    // InternalAlf.g:3247:1: rule__ClassFeatureMember__Group_1_1_0_1__1__Impl : ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3251:1: ( ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1 ) ) )
            // InternalAlf.g:3252:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1 ) )
            {
            // InternalAlf.g:3252:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1 ) )
            // InternalAlf.g:3253:2: ( rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_1_0_1_1()); 
            // InternalAlf.g:3254:2: ( rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1 )
            // InternalAlf.g:3254:3: rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1_0_1__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_2__0"
    // InternalAlf.g:3263:1: rule__ClassFeatureMember__Group_1_2__0 : rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1 ;
    public final void rule__ClassFeatureMember__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3267:1: ( rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1 )
            // InternalAlf.g:3268:2: rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1
            {
            pushFollow(FOLLOW_23);
            rule__ClassFeatureMember__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_2__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_2__0__Impl"
    // InternalAlf.g:3275:1: rule__ClassFeatureMember__Group_1_2__0__Impl : ( 'connector' ) ;
    public final void rule__ClassFeatureMember__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3279:1: ( ( 'connector' ) )
            // InternalAlf.g:3280:1: ( 'connector' )
            {
            // InternalAlf.g:3280:1: ( 'connector' )
            // InternalAlf.g:3281:2: 'connector'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_2__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_2__1"
    // InternalAlf.g:3290:1: rule__ClassFeatureMember__Group_1_2__1 : rule__ClassFeatureMember__Group_1_2__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3294:1: ( rule__ClassFeatureMember__Group_1_2__1__Impl )
            // InternalAlf.g:3295:2: rule__ClassFeatureMember__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_2__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_2__1__Impl"
    // InternalAlf.g:3301:1: rule__ClassFeatureMember__Group_1_2__1__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3305:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) ) )
            // InternalAlf.g:3306:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) )
            {
            // InternalAlf.g:3306:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) )
            // InternalAlf.g:3307:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_2_1()); 
            // InternalAlf.g:3308:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 )
            // InternalAlf.g:3308:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_2__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3__0"
    // InternalAlf.g:3317:1: rule__ClassFeatureMember__Group_1_3__0 : rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1 ;
    public final void rule__ClassFeatureMember__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3321:1: ( rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1 )
            // InternalAlf.g:3322:2: rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ClassFeatureMember__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3__0__Impl"
    // InternalAlf.g:3329:1: rule__ClassFeatureMember__Group_1_3__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3333:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) ) )
            // InternalAlf.g:3334:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) )
            {
            // InternalAlf.g:3334:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) )
            // InternalAlf.g:3335:2: ( rule__ClassFeatureMember__Alternatives_1_3_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_3_0()); 
            // InternalAlf.g:3336:2: ( rule__ClassFeatureMember__Alternatives_1_3_0 )
            // InternalAlf.g:3336:3: rule__ClassFeatureMember__Alternatives_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Alternatives_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3__1"
    // InternalAlf.g:3344:1: rule__ClassFeatureMember__Group_1_3__1 : rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2 ;
    public final void rule__ClassFeatureMember__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3348:1: ( rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2 )
            // InternalAlf.g:3349:2: rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassFeatureMember__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3__1__Impl"
    // InternalAlf.g:3356:1: rule__ClassFeatureMember__Group_1_3__1__Impl : ( 'is' ) ;
    public final void rule__ClassFeatureMember__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3360:1: ( ( 'is' ) )
            // InternalAlf.g:3361:1: ( 'is' )
            {
            // InternalAlf.g:3361:1: ( 'is' )
            // InternalAlf.g:3362:2: 'is'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsKeyword_1_3_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3__2"
    // InternalAlf.g:3371:1: rule__ClassFeatureMember__Group_1_3__2 : rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3 ;
    public final void rule__ClassFeatureMember__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3375:1: ( rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3 )
            // InternalAlf.g:3376:2: rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3
            {
            pushFollow(FOLLOW_9);
            rule__ClassFeatureMember__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3__2"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3__2__Impl"
    // InternalAlf.g:3383:1: rule__ClassFeatureMember__Group_1_3__2__Impl : ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3387:1: ( ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) ) )
            // InternalAlf.g:3388:1: ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) )
            {
            // InternalAlf.g:3388:1: ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) )
            // InternalAlf.g:3389:2: ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementAssignment_1_3_2()); 
            // InternalAlf.g:3390:2: ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 )
            // InternalAlf.g:3390:3: rule__ClassFeatureMember__MemberElementAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__MemberElementAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getMemberElementAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3__2__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3__3"
    // InternalAlf.g:3398:1: rule__ClassFeatureMember__Group_1_3__3 : rule__ClassFeatureMember__Group_1_3__3__Impl ;
    public final void rule__ClassFeatureMember__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3402:1: ( rule__ClassFeatureMember__Group_1_3__3__Impl )
            // InternalAlf.g:3403:2: rule__ClassFeatureMember__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3__3"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3__3__Impl"
    // InternalAlf.g:3409:1: rule__ClassFeatureMember__Group_1_3__3__Impl : ( ';' ) ;
    public final void rule__ClassFeatureMember__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3413:1: ( ( ';' ) )
            // InternalAlf.g:3414:1: ( ';' )
            {
            // InternalAlf.g:3414:1: ( ';' )
            // InternalAlf.g:3415:2: ';'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_1_3_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_1_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3__3__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3_0_0__0"
    // InternalAlf.g:3425:1: rule__ClassFeatureMember__Group_1_3_0_0__0 : rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1 ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3429:1: ( rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1 )
            // InternalAlf.g:3430:2: rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassFeatureMember__Group_1_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_3_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3_0_0__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3_0_0__0__Impl"
    // InternalAlf.g:3437:1: rule__ClassFeatureMember__Group_1_3_0_0__0__Impl : ( 'feature' ) ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3441:1: ( ( 'feature' ) )
            // InternalAlf.g:3442:1: ( 'feature' )
            {
            // InternalAlf.g:3442:1: ( 'feature' )
            // InternalAlf.g:3443:2: 'feature'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_3_0_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3_0_0__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3_0_0__1"
    // InternalAlf.g:3452:1: rule__ClassFeatureMember__Group_1_3_0_0__1 : rule__ClassFeatureMember__Group_1_3_0_0__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3456:1: ( rule__ClassFeatureMember__Group_1_3_0_0__1__Impl )
            // InternalAlf.g:3457:2: rule__ClassFeatureMember__Group_1_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_3_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3_0_0__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_3_0_0__1__Impl"
    // InternalAlf.g:3463:1: rule__ClassFeatureMember__Group_1_3_0_0__1__Impl : ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3467:1: ( ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? ) )
            // InternalAlf.g:3468:1: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? )
            {
            // InternalAlf.g:3468:1: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? )
            // InternalAlf.g:3469:2: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_1_3_0_0_1()); 
            // InternalAlf.g:3470:2: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:3470:3: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_1_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_3_0_0__1__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group__0"
    // InternalAlf.g:3479:1: rule__AssociationDeclaration__Group__0 : rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1 ;
    public final void rule__AssociationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3483:1: ( rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1 )
            // InternalAlf.g:3484:2: rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AssociationDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group__0"


    // $ANTLR start "rule__AssociationDeclaration__Group__0__Impl"
    // InternalAlf.g:3491:1: rule__AssociationDeclaration__Group__0__Impl : ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__AssociationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3495:1: ( ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:3496:1: ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:3496:1: ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:3497:2: ( rule__AssociationDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:3498:2: ( rule__AssociationDeclaration__IsAbstractAssignment_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==53) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:3498:3: rule__AssociationDeclaration__IsAbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationDeclaration__IsAbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group__1"
    // InternalAlf.g:3506:1: rule__AssociationDeclaration__Group__1 : rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2 ;
    public final void rule__AssociationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3510:1: ( rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2 )
            // InternalAlf.g:3511:2: rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AssociationDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group__1"


    // $ANTLR start "rule__AssociationDeclaration__Group__1__Impl"
    // InternalAlf.g:3518:1: rule__AssociationDeclaration__Group__1__Impl : ( 'assoc' ) ;
    public final void rule__AssociationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3522:1: ( ( 'assoc' ) )
            // InternalAlf.g:3523:1: ( 'assoc' )
            {
            // InternalAlf.g:3523:1: ( 'assoc' )
            // InternalAlf.g:3524:2: 'assoc'
            {
             before(grammarAccess.getAssociationDeclarationAccess().getAssocKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssociationDeclarationAccess().getAssocKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group__2"
    // InternalAlf.g:3533:1: rule__AssociationDeclaration__Group__2 : rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3 ;
    public final void rule__AssociationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3537:1: ( rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3 )
            // InternalAlf.g:3538:2: rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__AssociationDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group__2"


    // $ANTLR start "rule__AssociationDeclaration__Group__2__Impl"
    // InternalAlf.g:3545:1: rule__AssociationDeclaration__Group__2__Impl : ( ( rule__AssociationDeclaration__NameAssignment_2 ) ) ;
    public final void rule__AssociationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3549:1: ( ( ( rule__AssociationDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:3550:1: ( ( rule__AssociationDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:3550:1: ( ( rule__AssociationDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:3551:2: ( rule__AssociationDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:3552:2: ( rule__AssociationDeclaration__NameAssignment_2 )
            // InternalAlf.g:3552:3: rule__AssociationDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group__2__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group__3"
    // InternalAlf.g:3560:1: rule__AssociationDeclaration__Group__3 : rule__AssociationDeclaration__Group__3__Impl ;
    public final void rule__AssociationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3564:1: ( rule__AssociationDeclaration__Group__3__Impl )
            // InternalAlf.g:3565:2: rule__AssociationDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group__3"


    // $ANTLR start "rule__AssociationDeclaration__Group__3__Impl"
    // InternalAlf.g:3571:1: rule__AssociationDeclaration__Group__3__Impl : ( ( rule__AssociationDeclaration__Group_3__0 )? ) ;
    public final void rule__AssociationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3575:1: ( ( ( rule__AssociationDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:3576:1: ( ( rule__AssociationDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:3576:1: ( ( rule__AssociationDeclaration__Group_3__0 )? )
            // InternalAlf.g:3577:2: ( rule__AssociationDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getAssociationDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:3578:2: ( rule__AssociationDeclaration__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=18 && LA49_0<=19)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:3578:3: rule__AssociationDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group__3__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group_3__0"
    // InternalAlf.g:3587:1: rule__AssociationDeclaration__Group_3__0 : rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1 ;
    public final void rule__AssociationDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3591:1: ( rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1 )
            // InternalAlf.g:3592:2: rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AssociationDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3__0"


    // $ANTLR start "rule__AssociationDeclaration__Group_3__0__Impl"
    // InternalAlf.g:3599:1: rule__AssociationDeclaration__Group_3__0__Impl : ( ( rule__AssociationDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__AssociationDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3603:1: ( ( ( rule__AssociationDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:3604:1: ( ( rule__AssociationDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:3604:1: ( ( rule__AssociationDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:3605:2: ( rule__AssociationDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:3606:2: ( rule__AssociationDeclaration__Alternatives_3_0 )
            // InternalAlf.g:3606:3: rule__AssociationDeclaration__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDeclarationAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group_3__1"
    // InternalAlf.g:3614:1: rule__AssociationDeclaration__Group_3__1 : rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2 ;
    public final void rule__AssociationDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3618:1: ( rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2 )
            // InternalAlf.g:3619:2: rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__AssociationDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3__1"


    // $ANTLR start "rule__AssociationDeclaration__Group_3__1__Impl"
    // InternalAlf.g:3626:1: rule__AssociationDeclaration__Group_3__1__Impl : ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) ) ;
    public final void rule__AssociationDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3630:1: ( ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) ) )
            // InternalAlf.g:3631:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) )
            {
            // InternalAlf.g:3631:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) )
            // InternalAlf.g:3632:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipAssignment_3_1()); 
            // InternalAlf.g:3633:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 )
            // InternalAlf.g:3633:3: rule__AssociationDeclaration__OwnedMembershipAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__OwnedMembershipAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group_3__2"
    // InternalAlf.g:3641:1: rule__AssociationDeclaration__Group_3__2 : rule__AssociationDeclaration__Group_3__2__Impl ;
    public final void rule__AssociationDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3645:1: ( rule__AssociationDeclaration__Group_3__2__Impl )
            // InternalAlf.g:3646:2: rule__AssociationDeclaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3__2"


    // $ANTLR start "rule__AssociationDeclaration__Group_3__2__Impl"
    // InternalAlf.g:3652:1: rule__AssociationDeclaration__Group_3__2__Impl : ( ( rule__AssociationDeclaration__Group_3_2__0 )* ) ;
    public final void rule__AssociationDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3656:1: ( ( ( rule__AssociationDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:3657:1: ( ( rule__AssociationDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:3657:1: ( ( rule__AssociationDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:3658:2: ( rule__AssociationDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getAssociationDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:3659:2: ( rule__AssociationDeclaration__Group_3_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==40) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAlf.g:3659:3: rule__AssociationDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AssociationDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getAssociationDeclarationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group_3_2__0"
    // InternalAlf.g:3668:1: rule__AssociationDeclaration__Group_3_2__0 : rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1 ;
    public final void rule__AssociationDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3672:1: ( rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1 )
            // InternalAlf.g:3673:2: rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AssociationDeclaration__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3_2__0"


    // $ANTLR start "rule__AssociationDeclaration__Group_3_2__0__Impl"
    // InternalAlf.g:3680:1: rule__AssociationDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3684:1: ( ( ',' ) )
            // InternalAlf.g:3685:1: ( ',' )
            {
            // InternalAlf.g:3685:1: ( ',' )
            // InternalAlf.g:3686:2: ','
            {
             before(grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__AssociationDeclaration__Group_3_2__1"
    // InternalAlf.g:3695:1: rule__AssociationDeclaration__Group_3_2__1 : rule__AssociationDeclaration__Group_3_2__1__Impl ;
    public final void rule__AssociationDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3699:1: ( rule__AssociationDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:3700:2: rule__AssociationDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3_2__1"


    // $ANTLR start "rule__AssociationDeclaration__Group_3_2__1__Impl"
    // InternalAlf.g:3706:1: rule__AssociationDeclaration__Group_3_2__1__Impl : ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) ) ;
    public final void rule__AssociationDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3710:1: ( ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) ) )
            // InternalAlf.g:3711:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            {
            // InternalAlf.g:3711:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            // InternalAlf.g:3712:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 
            // InternalAlf.g:3713:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 )
            // InternalAlf.g:3713:3: rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__AssociationDefinition__Group__0"
    // InternalAlf.g:3722:1: rule__AssociationDefinition__Group__0 : rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1 ;
    public final void rule__AssociationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3726:1: ( rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1 )
            // InternalAlf.g:3727:2: rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AssociationDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__0"


    // $ANTLR start "rule__AssociationDefinition__Group__0__Impl"
    // InternalAlf.g:3734:1: rule__AssociationDefinition__Group__0__Impl : ( ruleAssociationDeclaration ) ;
    public final void rule__AssociationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3738:1: ( ( ruleAssociationDeclaration ) )
            // InternalAlf.g:3739:1: ( ruleAssociationDeclaration )
            {
            // InternalAlf.g:3739:1: ( ruleAssociationDeclaration )
            // InternalAlf.g:3740:2: ruleAssociationDeclaration
            {
             before(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationDeclaration();

            state._fsp--;

             after(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__0__Impl"


    // $ANTLR start "rule__AssociationDefinition__Group__1"
    // InternalAlf.g:3749:1: rule__AssociationDefinition__Group__1 : rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2 ;
    public final void rule__AssociationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3753:1: ( rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2 )
            // InternalAlf.g:3754:2: rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AssociationDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__1"


    // $ANTLR start "rule__AssociationDefinition__Group__1__Impl"
    // InternalAlf.g:3761:1: rule__AssociationDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__AssociationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3765:1: ( ( '{' ) )
            // InternalAlf.g:3766:1: ( '{' )
            {
            // InternalAlf.g:3766:1: ( '{' )
            // InternalAlf.g:3767:2: '{'
            {
             before(grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__1__Impl"


    // $ANTLR start "rule__AssociationDefinition__Group__2"
    // InternalAlf.g:3776:1: rule__AssociationDefinition__Group__2 : rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3 ;
    public final void rule__AssociationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3780:1: ( rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3 )
            // InternalAlf.g:3781:2: rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__AssociationDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__2"


    // $ANTLR start "rule__AssociationDefinition__Group__2__Impl"
    // InternalAlf.g:3788:1: rule__AssociationDefinition__Group__2__Impl : ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) ) ;
    public final void rule__AssociationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3792:1: ( ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) ) )
            // InternalAlf.g:3793:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) )
            {
            // InternalAlf.g:3793:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) )
            // InternalAlf.g:3794:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_2 )
            {
             before(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssignment_2()); 
            // InternalAlf.g:3795:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_2 )
            // InternalAlf.g:3795:3: rule__AssociationDefinition__OwnedMembershipAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDefinition__OwnedMembershipAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__2__Impl"


    // $ANTLR start "rule__AssociationDefinition__Group__3"
    // InternalAlf.g:3803:1: rule__AssociationDefinition__Group__3 : rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4 ;
    public final void rule__AssociationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3807:1: ( rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4 )
            // InternalAlf.g:3808:2: rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__AssociationDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__3"


    // $ANTLR start "rule__AssociationDefinition__Group__3__Impl"
    // InternalAlf.g:3815:1: rule__AssociationDefinition__Group__3__Impl : ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) ) ;
    public final void rule__AssociationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3819:1: ( ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) ) )
            // InternalAlf.g:3820:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) )
            {
            // InternalAlf.g:3820:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) )
            // InternalAlf.g:3821:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_3 )
            {
             before(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssignment_3()); 
            // InternalAlf.g:3822:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_3 )
            // InternalAlf.g:3822:3: rule__AssociationDefinition__OwnedMembershipAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDefinition__OwnedMembershipAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__3__Impl"


    // $ANTLR start "rule__AssociationDefinition__Group__4"
    // InternalAlf.g:3830:1: rule__AssociationDefinition__Group__4 : rule__AssociationDefinition__Group__4__Impl ;
    public final void rule__AssociationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3834:1: ( rule__AssociationDefinition__Group__4__Impl )
            // InternalAlf.g:3835:2: rule__AssociationDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__4"


    // $ANTLR start "rule__AssociationDefinition__Group__4__Impl"
    // InternalAlf.g:3841:1: rule__AssociationDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__AssociationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3845:1: ( ( '}' ) )
            // InternalAlf.g:3846:1: ( '}' )
            {
            // InternalAlf.g:3846:1: ( '}' )
            // InternalAlf.g:3847:2: '}'
            {
             before(grammarAccess.getAssociationDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAssociationDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__Group__4__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__0"
    // InternalAlf.g:3857:1: rule__TypedFeatureDefinition__Group__0 : rule__TypedFeatureDefinition__Group__0__Impl rule__TypedFeatureDefinition__Group__1 ;
    public final void rule__TypedFeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3861:1: ( rule__TypedFeatureDefinition__Group__0__Impl rule__TypedFeatureDefinition__Group__1 )
            // InternalAlf.g:3862:2: rule__TypedFeatureDefinition__Group__0__Impl rule__TypedFeatureDefinition__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TypedFeatureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__0__Impl"
    // InternalAlf.g:3869:1: rule__TypedFeatureDefinition__Group__0__Impl : ( ( rule__TypedFeatureDefinition__NameAssignment_0 ) ) ;
    public final void rule__TypedFeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3873:1: ( ( ( rule__TypedFeatureDefinition__NameAssignment_0 ) ) )
            // InternalAlf.g:3874:1: ( ( rule__TypedFeatureDefinition__NameAssignment_0 ) )
            {
            // InternalAlf.g:3874:1: ( ( rule__TypedFeatureDefinition__NameAssignment_0 ) )
            // InternalAlf.g:3875:2: ( rule__TypedFeatureDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getNameAssignment_0()); 
            // InternalAlf.g:3876:2: ( rule__TypedFeatureDefinition__NameAssignment_0 )
            // InternalAlf.g:3876:3: rule__TypedFeatureDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__1"
    // InternalAlf.g:3884:1: rule__TypedFeatureDefinition__Group__1 : rule__TypedFeatureDefinition__Group__1__Impl rule__TypedFeatureDefinition__Group__2 ;
    public final void rule__TypedFeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3888:1: ( rule__TypedFeatureDefinition__Group__1__Impl rule__TypedFeatureDefinition__Group__2 )
            // InternalAlf.g:3889:2: rule__TypedFeatureDefinition__Group__1__Impl rule__TypedFeatureDefinition__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__TypedFeatureDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__1__Impl"
    // InternalAlf.g:3896:1: rule__TypedFeatureDefinition__Group__1__Impl : ( ( rule__TypedFeatureDefinition__Group_1__0 )? ) ;
    public final void rule__TypedFeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3900:1: ( ( ( rule__TypedFeatureDefinition__Group_1__0 )? ) )
            // InternalAlf.g:3901:1: ( ( rule__TypedFeatureDefinition__Group_1__0 )? )
            {
            // InternalAlf.g:3901:1: ( ( rule__TypedFeatureDefinition__Group_1__0 )? )
            // InternalAlf.g:3902:2: ( rule__TypedFeatureDefinition__Group_1__0 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_1()); 
            // InternalAlf.g:3903:2: ( rule__TypedFeatureDefinition__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:3903:3: rule__TypedFeatureDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__2"
    // InternalAlf.g:3911:1: rule__TypedFeatureDefinition__Group__2 : rule__TypedFeatureDefinition__Group__2__Impl rule__TypedFeatureDefinition__Group__3 ;
    public final void rule__TypedFeatureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3915:1: ( rule__TypedFeatureDefinition__Group__2__Impl rule__TypedFeatureDefinition__Group__3 )
            // InternalAlf.g:3916:2: rule__TypedFeatureDefinition__Group__2__Impl rule__TypedFeatureDefinition__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__TypedFeatureDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__2"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__2__Impl"
    // InternalAlf.g:3923:1: rule__TypedFeatureDefinition__Group__2__Impl : ( ( rule__TypedFeatureDefinition__Group_2__0 )? ) ;
    public final void rule__TypedFeatureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3927:1: ( ( ( rule__TypedFeatureDefinition__Group_2__0 )? ) )
            // InternalAlf.g:3928:1: ( ( rule__TypedFeatureDefinition__Group_2__0 )? )
            {
            // InternalAlf.g:3928:1: ( ( rule__TypedFeatureDefinition__Group_2__0 )? )
            // InternalAlf.g:3929:2: ( rule__TypedFeatureDefinition__Group_2__0 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_2()); 
            // InternalAlf.g:3930:2: ( rule__TypedFeatureDefinition__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==43) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:3930:3: rule__TypedFeatureDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__2__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__3"
    // InternalAlf.g:3938:1: rule__TypedFeatureDefinition__Group__3 : rule__TypedFeatureDefinition__Group__3__Impl ;
    public final void rule__TypedFeatureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3942:1: ( rule__TypedFeatureDefinition__Group__3__Impl )
            // InternalAlf.g:3943:2: rule__TypedFeatureDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__3"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__3__Impl"
    // InternalAlf.g:3949:1: rule__TypedFeatureDefinition__Group__3__Impl : ( ( rule__TypedFeatureDefinition__Alternatives_3 ) ) ;
    public final void rule__TypedFeatureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3953:1: ( ( ( rule__TypedFeatureDefinition__Alternatives_3 ) ) )
            // InternalAlf.g:3954:1: ( ( rule__TypedFeatureDefinition__Alternatives_3 ) )
            {
            // InternalAlf.g:3954:1: ( ( rule__TypedFeatureDefinition__Alternatives_3 ) )
            // InternalAlf.g:3955:2: ( rule__TypedFeatureDefinition__Alternatives_3 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getAlternatives_3()); 
            // InternalAlf.g:3956:2: ( rule__TypedFeatureDefinition__Alternatives_3 )
            // InternalAlf.g:3956:3: rule__TypedFeatureDefinition__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__3__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__0"
    // InternalAlf.g:3965:1: rule__TypedFeatureDefinition__Group_1__0 : rule__TypedFeatureDefinition__Group_1__0__Impl rule__TypedFeatureDefinition__Group_1__1 ;
    public final void rule__TypedFeatureDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3969:1: ( rule__TypedFeatureDefinition__Group_1__0__Impl rule__TypedFeatureDefinition__Group_1__1 )
            // InternalAlf.g:3970:2: rule__TypedFeatureDefinition__Group_1__0__Impl rule__TypedFeatureDefinition__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__TypedFeatureDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_1__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__0__Impl"
    // InternalAlf.g:3977:1: rule__TypedFeatureDefinition__Group_1__0__Impl : ( ':' ) ;
    public final void rule__TypedFeatureDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3981:1: ( ( ':' ) )
            // InternalAlf.g:3982:1: ( ':' )
            {
            // InternalAlf.g:3982:1: ( ':' )
            // InternalAlf.g:3983:2: ':'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getColonKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__1"
    // InternalAlf.g:3992:1: rule__TypedFeatureDefinition__Group_1__1 : rule__TypedFeatureDefinition__Group_1__1__Impl rule__TypedFeatureDefinition__Group_1__2 ;
    public final void rule__TypedFeatureDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3996:1: ( rule__TypedFeatureDefinition__Group_1__1__Impl rule__TypedFeatureDefinition__Group_1__2 )
            // InternalAlf.g:3997:2: rule__TypedFeatureDefinition__Group_1__1__Impl rule__TypedFeatureDefinition__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__TypedFeatureDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_1__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__1__Impl"
    // InternalAlf.g:4004:1: rule__TypedFeatureDefinition__Group_1__1__Impl : ( ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )? ) ;
    public final void rule__TypedFeatureDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4008:1: ( ( ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )? ) )
            // InternalAlf.g:4009:1: ( ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )? )
            {
            // InternalAlf.g:4009:1: ( ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )? )
            // InternalAlf.g:4010:2: ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeAssignment_1_1()); 
            // InternalAlf.g:4011:2: ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:4011:3: rule__TypedFeatureDefinition__IsCompositeAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__IsCompositeAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__2"
    // InternalAlf.g:4019:1: rule__TypedFeatureDefinition__Group_1__2 : rule__TypedFeatureDefinition__Group_1__2__Impl rule__TypedFeatureDefinition__Group_1__3 ;
    public final void rule__TypedFeatureDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4023:1: ( rule__TypedFeatureDefinition__Group_1__2__Impl rule__TypedFeatureDefinition__Group_1__3 )
            // InternalAlf.g:4024:2: rule__TypedFeatureDefinition__Group_1__2__Impl rule__TypedFeatureDefinition__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__TypedFeatureDefinition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_1__2"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__2__Impl"
    // InternalAlf.g:4031:1: rule__TypedFeatureDefinition__Group_1__2__Impl : ( ( rule__TypedFeatureDefinition__Alternatives_1_2 ) ) ;
    public final void rule__TypedFeatureDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4035:1: ( ( ( rule__TypedFeatureDefinition__Alternatives_1_2 ) ) )
            // InternalAlf.g:4036:1: ( ( rule__TypedFeatureDefinition__Alternatives_1_2 ) )
            {
            // InternalAlf.g:4036:1: ( ( rule__TypedFeatureDefinition__Alternatives_1_2 ) )
            // InternalAlf.g:4037:2: ( rule__TypedFeatureDefinition__Alternatives_1_2 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getAlternatives_1_2()); 
            // InternalAlf.g:4038:2: ( rule__TypedFeatureDefinition__Alternatives_1_2 )
            // InternalAlf.g:4038:3: rule__TypedFeatureDefinition__Alternatives_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Alternatives_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getAlternatives_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__3"
    // InternalAlf.g:4046:1: rule__TypedFeatureDefinition__Group_1__3 : rule__TypedFeatureDefinition__Group_1__3__Impl ;
    public final void rule__TypedFeatureDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4050:1: ( rule__TypedFeatureDefinition__Group_1__3__Impl )
            // InternalAlf.g:4051:2: rule__TypedFeatureDefinition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_1__3"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__3__Impl"
    // InternalAlf.g:4057:1: rule__TypedFeatureDefinition__Group_1__3__Impl : ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )? ) ;
    public final void rule__TypedFeatureDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4061:1: ( ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )? ) )
            // InternalAlf.g:4062:1: ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )? )
            {
            // InternalAlf.g:4062:1: ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )? )
            // InternalAlf.g:4063:2: ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_3()); 
            // InternalAlf.g:4064:2: ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==18||LA54_0==22||LA54_0==47) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlf.g:4064:3: rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_1__3__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2__0"
    // InternalAlf.g:4073:1: rule__TypedFeatureDefinition__Group_2__0 : rule__TypedFeatureDefinition__Group_2__0__Impl rule__TypedFeatureDefinition__Group_2__1 ;
    public final void rule__TypedFeatureDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4077:1: ( rule__TypedFeatureDefinition__Group_2__0__Impl rule__TypedFeatureDefinition__Group_2__1 )
            // InternalAlf.g:4078:2: rule__TypedFeatureDefinition__Group_2__0__Impl rule__TypedFeatureDefinition__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__TypedFeatureDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2__0__Impl"
    // InternalAlf.g:4085:1: rule__TypedFeatureDefinition__Group_2__0__Impl : ( '[' ) ;
    public final void rule__TypedFeatureDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4089:1: ( ( '[' ) )
            // InternalAlf.g:4090:1: ( '[' )
            {
            // InternalAlf.g:4090:1: ( '[' )
            // InternalAlf.g:4091:2: '['
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2__1"
    // InternalAlf.g:4100:1: rule__TypedFeatureDefinition__Group_2__1 : rule__TypedFeatureDefinition__Group_2__1__Impl rule__TypedFeatureDefinition__Group_2__2 ;
    public final void rule__TypedFeatureDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4104:1: ( rule__TypedFeatureDefinition__Group_2__1__Impl rule__TypedFeatureDefinition__Group_2__2 )
            // InternalAlf.g:4105:2: rule__TypedFeatureDefinition__Group_2__1__Impl rule__TypedFeatureDefinition__Group_2__2
            {
            pushFollow(FOLLOW_28);
            rule__TypedFeatureDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2__1__Impl"
    // InternalAlf.g:4112:1: rule__TypedFeatureDefinition__Group_2__1__Impl : ( ( rule__TypedFeatureDefinition__Group_2_1__0 )? ) ;
    public final void rule__TypedFeatureDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4116:1: ( ( ( rule__TypedFeatureDefinition__Group_2_1__0 )? ) )
            // InternalAlf.g:4117:1: ( ( rule__TypedFeatureDefinition__Group_2_1__0 )? )
            {
            // InternalAlf.g:4117:1: ( ( rule__TypedFeatureDefinition__Group_2_1__0 )? )
            // InternalAlf.g:4118:2: ( rule__TypedFeatureDefinition__Group_2_1__0 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_2_1()); 
            // InternalAlf.g:4119:2: ( rule__TypedFeatureDefinition__Group_2_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_NATURAL_VALUE) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==45) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:4119:3: rule__TypedFeatureDefinition__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2__2"
    // InternalAlf.g:4127:1: rule__TypedFeatureDefinition__Group_2__2 : rule__TypedFeatureDefinition__Group_2__2__Impl rule__TypedFeatureDefinition__Group_2__3 ;
    public final void rule__TypedFeatureDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4131:1: ( rule__TypedFeatureDefinition__Group_2__2__Impl rule__TypedFeatureDefinition__Group_2__3 )
            // InternalAlf.g:4132:2: rule__TypedFeatureDefinition__Group_2__2__Impl rule__TypedFeatureDefinition__Group_2__3
            {
            pushFollow(FOLLOW_29);
            rule__TypedFeatureDefinition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2__2"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2__2__Impl"
    // InternalAlf.g:4139:1: rule__TypedFeatureDefinition__Group_2__2__Impl : ( ( rule__TypedFeatureDefinition__UpperAssignment_2_2 ) ) ;
    public final void rule__TypedFeatureDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4143:1: ( ( ( rule__TypedFeatureDefinition__UpperAssignment_2_2 ) ) )
            // InternalAlf.g:4144:1: ( ( rule__TypedFeatureDefinition__UpperAssignment_2_2 ) )
            {
            // InternalAlf.g:4144:1: ( ( rule__TypedFeatureDefinition__UpperAssignment_2_2 ) )
            // InternalAlf.g:4145:2: ( rule__TypedFeatureDefinition__UpperAssignment_2_2 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getUpperAssignment_2_2()); 
            // InternalAlf.g:4146:2: ( rule__TypedFeatureDefinition__UpperAssignment_2_2 )
            // InternalAlf.g:4146:3: rule__TypedFeatureDefinition__UpperAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__UpperAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getUpperAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2__3"
    // InternalAlf.g:4154:1: rule__TypedFeatureDefinition__Group_2__3 : rule__TypedFeatureDefinition__Group_2__3__Impl ;
    public final void rule__TypedFeatureDefinition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4158:1: ( rule__TypedFeatureDefinition__Group_2__3__Impl )
            // InternalAlf.g:4159:2: rule__TypedFeatureDefinition__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2__3"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2__3__Impl"
    // InternalAlf.g:4165:1: rule__TypedFeatureDefinition__Group_2__3__Impl : ( ']' ) ;
    public final void rule__TypedFeatureDefinition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4169:1: ( ( ']' ) )
            // InternalAlf.g:4170:1: ( ']' )
            {
            // InternalAlf.g:4170:1: ( ']' )
            // InternalAlf.g:4171:2: ']'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2__3__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2_1__0"
    // InternalAlf.g:4181:1: rule__TypedFeatureDefinition__Group_2_1__0 : rule__TypedFeatureDefinition__Group_2_1__0__Impl rule__TypedFeatureDefinition__Group_2_1__1 ;
    public final void rule__TypedFeatureDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4185:1: ( rule__TypedFeatureDefinition__Group_2_1__0__Impl rule__TypedFeatureDefinition__Group_2_1__1 )
            // InternalAlf.g:4186:2: rule__TypedFeatureDefinition__Group_2_1__0__Impl rule__TypedFeatureDefinition__Group_2_1__1
            {
            pushFollow(FOLLOW_30);
            rule__TypedFeatureDefinition__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2_1__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2_1__0__Impl"
    // InternalAlf.g:4193:1: rule__TypedFeatureDefinition__Group_2_1__0__Impl : ( ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 ) ) ;
    public final void rule__TypedFeatureDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4197:1: ( ( ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 ) ) )
            // InternalAlf.g:4198:1: ( ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 ) )
            {
            // InternalAlf.g:4198:1: ( ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 ) )
            // InternalAlf.g:4199:2: ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getLowerAssignment_2_1_0()); 
            // InternalAlf.g:4200:2: ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 )
            // InternalAlf.g:4200:3: rule__TypedFeatureDefinition__LowerAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__LowerAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getLowerAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2_1__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2_1__1"
    // InternalAlf.g:4208:1: rule__TypedFeatureDefinition__Group_2_1__1 : rule__TypedFeatureDefinition__Group_2_1__1__Impl ;
    public final void rule__TypedFeatureDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4212:1: ( rule__TypedFeatureDefinition__Group_2_1__1__Impl )
            // InternalAlf.g:4213:2: rule__TypedFeatureDefinition__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2_1__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_2_1__1__Impl"
    // InternalAlf.g:4219:1: rule__TypedFeatureDefinition__Group_2_1__1__Impl : ( '..' ) ;
    public final void rule__TypedFeatureDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4223:1: ( ( '..' ) )
            // InternalAlf.g:4224:1: ( '..' )
            {
            // InternalAlf.g:4224:1: ( '..' )
            // InternalAlf.g:4225:2: '..'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_2_1__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_0__0"
    // InternalAlf.g:4235:1: rule__TypedFeatureDefinition__Group_3_0__0 : rule__TypedFeatureDefinition__Group_3_0__0__Impl rule__TypedFeatureDefinition__Group_3_0__1 ;
    public final void rule__TypedFeatureDefinition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4239:1: ( rule__TypedFeatureDefinition__Group_3_0__0__Impl rule__TypedFeatureDefinition__Group_3_0__1 )
            // InternalAlf.g:4240:2: rule__TypedFeatureDefinition__Group_3_0__0__Impl rule__TypedFeatureDefinition__Group_3_0__1
            {
            pushFollow(FOLLOW_31);
            rule__TypedFeatureDefinition__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_0__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_0__0__Impl"
    // InternalAlf.g:4247:1: rule__TypedFeatureDefinition__Group_3_0__0__Impl : ( ( rule__TypedFeatureDefinition__Group_3_0_0__0 )? ) ;
    public final void rule__TypedFeatureDefinition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4251:1: ( ( ( rule__TypedFeatureDefinition__Group_3_0_0__0 )? ) )
            // InternalAlf.g:4252:1: ( ( rule__TypedFeatureDefinition__Group_3_0_0__0 )? )
            {
            // InternalAlf.g:4252:1: ( ( rule__TypedFeatureDefinition__Group_3_0_0__0 )? )
            // InternalAlf.g:4253:2: ( rule__TypedFeatureDefinition__Group_3_0_0__0 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_3_0_0()); 
            // InternalAlf.g:4254:2: ( rule__TypedFeatureDefinition__Group_3_0_0__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==46) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:4254:3: rule__TypedFeatureDefinition__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__Group_3_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_0__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_0__1"
    // InternalAlf.g:4262:1: rule__TypedFeatureDefinition__Group_3_0__1 : rule__TypedFeatureDefinition__Group_3_0__1__Impl ;
    public final void rule__TypedFeatureDefinition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4266:1: ( rule__TypedFeatureDefinition__Group_3_0__1__Impl )
            // InternalAlf.g:4267:2: rule__TypedFeatureDefinition__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_0__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_0__1__Impl"
    // InternalAlf.g:4273:1: rule__TypedFeatureDefinition__Group_3_0__1__Impl : ( ';' ) ;
    public final void rule__TypedFeatureDefinition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4277:1: ( ( ';' ) )
            // InternalAlf.g:4278:1: ( ';' )
            {
            // InternalAlf.g:4278:1: ( ';' )
            // InternalAlf.g:4279:2: ';'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getSemicolonKeyword_3_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getSemicolonKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_0__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_0_0__0"
    // InternalAlf.g:4289:1: rule__TypedFeatureDefinition__Group_3_0_0__0 : rule__TypedFeatureDefinition__Group_3_0_0__0__Impl rule__TypedFeatureDefinition__Group_3_0_0__1 ;
    public final void rule__TypedFeatureDefinition__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4293:1: ( rule__TypedFeatureDefinition__Group_3_0_0__0__Impl rule__TypedFeatureDefinition__Group_3_0_0__1 )
            // InternalAlf.g:4294:2: rule__TypedFeatureDefinition__Group_3_0_0__0__Impl rule__TypedFeatureDefinition__Group_3_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__TypedFeatureDefinition__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_0_0__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_0_0__0__Impl"
    // InternalAlf.g:4301:1: rule__TypedFeatureDefinition__Group_3_0_0__0__Impl : ( '=' ) ;
    public final void rule__TypedFeatureDefinition__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4305:1: ( ( '=' ) )
            // InternalAlf.g:4306:1: ( '=' )
            {
            // InternalAlf.g:4306:1: ( '=' )
            // InternalAlf.g:4307:2: '='
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getEqualsSignKeyword_3_0_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getEqualsSignKeyword_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_0_0__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_0_0__1"
    // InternalAlf.g:4316:1: rule__TypedFeatureDefinition__Group_3_0_0__1 : rule__TypedFeatureDefinition__Group_3_0_0__1__Impl ;
    public final void rule__TypedFeatureDefinition__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4320:1: ( rule__TypedFeatureDefinition__Group_3_0_0__1__Impl )
            // InternalAlf.g:4321:2: rule__TypedFeatureDefinition__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_0_0__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_0_0__1__Impl"
    // InternalAlf.g:4327:1: rule__TypedFeatureDefinition__Group_3_0_0__1__Impl : ( ( rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1 ) ) ;
    public final void rule__TypedFeatureDefinition__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4331:1: ( ( ( rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1 ) ) )
            // InternalAlf.g:4332:1: ( ( rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1 ) )
            {
            // InternalAlf.g:4332:1: ( ( rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1 ) )
            // InternalAlf.g:4333:2: ( rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getValueAssignment_3_0_0_1()); 
            // InternalAlf.g:4334:2: ( rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1 )
            // InternalAlf.g:4334:3: rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getValueAssignment_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_0_0__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_1__0"
    // InternalAlf.g:4343:1: rule__TypedFeatureDefinition__Group_3_1__0 : rule__TypedFeatureDefinition__Group_3_1__0__Impl rule__TypedFeatureDefinition__Group_3_1__1 ;
    public final void rule__TypedFeatureDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4347:1: ( rule__TypedFeatureDefinition__Group_3_1__0__Impl rule__TypedFeatureDefinition__Group_3_1__1 )
            // InternalAlf.g:4348:2: rule__TypedFeatureDefinition__Group_3_1__0__Impl rule__TypedFeatureDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_18);
            rule__TypedFeatureDefinition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_1__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_1__0__Impl"
    // InternalAlf.g:4355:1: rule__TypedFeatureDefinition__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__TypedFeatureDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4359:1: ( ( '{' ) )
            // InternalAlf.g:4360:1: ( '{' )
            {
            // InternalAlf.g:4360:1: ( '{' )
            // InternalAlf.g:4361:2: '{'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_1__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_1__1"
    // InternalAlf.g:4370:1: rule__TypedFeatureDefinition__Group_3_1__1 : rule__TypedFeatureDefinition__Group_3_1__1__Impl rule__TypedFeatureDefinition__Group_3_1__2 ;
    public final void rule__TypedFeatureDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4374:1: ( rule__TypedFeatureDefinition__Group_3_1__1__Impl rule__TypedFeatureDefinition__Group_3_1__2 )
            // InternalAlf.g:4375:2: rule__TypedFeatureDefinition__Group_3_1__1__Impl rule__TypedFeatureDefinition__Group_3_1__2
            {
            pushFollow(FOLLOW_18);
            rule__TypedFeatureDefinition__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_1__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_1__1__Impl"
    // InternalAlf.g:4382:1: rule__TypedFeatureDefinition__Group_3_1__1__Impl : ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1 )* ) ;
    public final void rule__TypedFeatureDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4386:1: ( ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1 )* ) )
            // InternalAlf.g:4387:1: ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1 )* )
            {
            // InternalAlf.g:4387:1: ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1 )* )
            // InternalAlf.g:4388:2: ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1 )*
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipAssignment_3_1_1()); 
            // InternalAlf.g:4389:2: ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_UNRESTRICTED_NAME)||(LA57_0>=15 && LA57_0<=17)||LA57_0==20||(LA57_0>=30 && LA57_0<=33)||LA57_0==41||(LA57_0>=53 && LA57_0<=54)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAlf.g:4389:3: rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_1__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_1__2"
    // InternalAlf.g:4397:1: rule__TypedFeatureDefinition__Group_3_1__2 : rule__TypedFeatureDefinition__Group_3_1__2__Impl ;
    public final void rule__TypedFeatureDefinition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4401:1: ( rule__TypedFeatureDefinition__Group_3_1__2__Impl )
            // InternalAlf.g:4402:2: rule__TypedFeatureDefinition__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_1__2"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3_1__2__Impl"
    // InternalAlf.g:4408:1: rule__TypedFeatureDefinition__Group_3_1__2__Impl : ( '}' ) ;
    public final void rule__TypedFeatureDefinition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4412:1: ( ( '}' ) )
            // InternalAlf.g:4413:1: ( '}' )
            {
            // InternalAlf.g:4413:1: ( '}' )
            // InternalAlf.g:4414:2: '}'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_3_1_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3_1__2__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group__0"
    // InternalAlf.g:4424:1: rule__UntypedFeatureDefinition__Group__0 : rule__UntypedFeatureDefinition__Group__0__Impl rule__UntypedFeatureDefinition__Group__1 ;
    public final void rule__UntypedFeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4428:1: ( rule__UntypedFeatureDefinition__Group__0__Impl rule__UntypedFeatureDefinition__Group__1 )
            // InternalAlf.g:4429:2: rule__UntypedFeatureDefinition__Group__0__Impl rule__UntypedFeatureDefinition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__UntypedFeatureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group__0__Impl"
    // InternalAlf.g:4436:1: rule__UntypedFeatureDefinition__Group__0__Impl : ( ( rule__UntypedFeatureDefinition__NameAssignment_0 )? ) ;
    public final void rule__UntypedFeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4440:1: ( ( ( rule__UntypedFeatureDefinition__NameAssignment_0 )? ) )
            // InternalAlf.g:4441:1: ( ( rule__UntypedFeatureDefinition__NameAssignment_0 )? )
            {
            // InternalAlf.g:4441:1: ( ( rule__UntypedFeatureDefinition__NameAssignment_0 )? )
            // InternalAlf.g:4442:2: ( rule__UntypedFeatureDefinition__NameAssignment_0 )?
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getNameAssignment_0()); 
            // InternalAlf.g:4443:2: ( rule__UntypedFeatureDefinition__NameAssignment_0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:4443:3: rule__UntypedFeatureDefinition__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group__1"
    // InternalAlf.g:4451:1: rule__UntypedFeatureDefinition__Group__1 : rule__UntypedFeatureDefinition__Group__1__Impl rule__UntypedFeatureDefinition__Group__2 ;
    public final void rule__UntypedFeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4455:1: ( rule__UntypedFeatureDefinition__Group__1__Impl rule__UntypedFeatureDefinition__Group__2 )
            // InternalAlf.g:4456:2: rule__UntypedFeatureDefinition__Group__1__Impl rule__UntypedFeatureDefinition__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__UntypedFeatureDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group__1__Impl"
    // InternalAlf.g:4463:1: rule__UntypedFeatureDefinition__Group__1__Impl : ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4467:1: ( ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 ) ) )
            // InternalAlf.g:4468:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 ) )
            {
            // InternalAlf.g:4468:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 ) )
            // InternalAlf.g:4469:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipAssignment_1()); 
            // InternalAlf.g:4470:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 )
            // InternalAlf.g:4470:3: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group__1__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group__2"
    // InternalAlf.g:4478:1: rule__UntypedFeatureDefinition__Group__2 : rule__UntypedFeatureDefinition__Group__2__Impl ;
    public final void rule__UntypedFeatureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4482:1: ( rule__UntypedFeatureDefinition__Group__2__Impl )
            // InternalAlf.g:4483:2: rule__UntypedFeatureDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group__2"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group__2__Impl"
    // InternalAlf.g:4489:1: rule__UntypedFeatureDefinition__Group__2__Impl : ( ( rule__UntypedFeatureDefinition__Alternatives_2 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4493:1: ( ( ( rule__UntypedFeatureDefinition__Alternatives_2 ) ) )
            // InternalAlf.g:4494:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2 ) )
            {
            // InternalAlf.g:4494:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2 ) )
            // InternalAlf.g:4495:2: ( rule__UntypedFeatureDefinition__Alternatives_2 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getAlternatives_2()); 
            // InternalAlf.g:4496:2: ( rule__UntypedFeatureDefinition__Alternatives_2 )
            // InternalAlf.g:4496:3: rule__UntypedFeatureDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group__2__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0__0"
    // InternalAlf.g:4505:1: rule__UntypedFeatureDefinition__Group_2_0__0 : rule__UntypedFeatureDefinition__Group_2_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4509:1: ( rule__UntypedFeatureDefinition__Group_2_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0__1 )
            // InternalAlf.g:4510:2: rule__UntypedFeatureDefinition__Group_2_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0__1
            {
            pushFollow(FOLLOW_33);
            rule__UntypedFeatureDefinition__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0__0__Impl"
    // InternalAlf.g:4517:1: rule__UntypedFeatureDefinition__Group_2_0__0__Impl : ( ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )? ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4521:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )? ) )
            // InternalAlf.g:4522:1: ( ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )? )
            {
            // InternalAlf.g:4522:1: ( ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )? )
            // InternalAlf.g:4523:2: ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )?
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_0()); 
            // InternalAlf.g:4524:2: ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==43) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:4524:3: rule__UntypedFeatureDefinition__Group_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__Group_2_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0__1"
    // InternalAlf.g:4532:1: rule__UntypedFeatureDefinition__Group_2_0__1 : rule__UntypedFeatureDefinition__Group_2_0__1__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4536:1: ( rule__UntypedFeatureDefinition__Group_2_0__1__Impl )
            // InternalAlf.g:4537:2: rule__UntypedFeatureDefinition__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0__1__Impl"
    // InternalAlf.g:4543:1: rule__UntypedFeatureDefinition__Group_2_0__1__Impl : ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4547:1: ( ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 ) ) )
            // InternalAlf.g:4548:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 ) )
            {
            // InternalAlf.g:4548:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 ) )
            // InternalAlf.g:4549:2: ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getAlternatives_2_0_1()); 
            // InternalAlf.g:4550:2: ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 )
            // InternalAlf.g:4550:3: rule__UntypedFeatureDefinition__Alternatives_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Alternatives_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getAlternatives_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0__1__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0__0"
    // InternalAlf.g:4559:1: rule__UntypedFeatureDefinition__Group_2_0_0__0 : rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4563:1: ( rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0__1 )
            // InternalAlf.g:4564:2: rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0__1
            {
            pushFollow(FOLLOW_28);
            rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl"
    // InternalAlf.g:4571:1: rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl : ( '[' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4575:1: ( ( '[' ) )
            // InternalAlf.g:4576:1: ( '[' )
            {
            // InternalAlf.g:4576:1: ( '[' )
            // InternalAlf.g:4577:2: '['
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0__1"
    // InternalAlf.g:4586:1: rule__UntypedFeatureDefinition__Group_2_0_0__1 : rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_0__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4590:1: ( rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_0__2 )
            // InternalAlf.g:4591:2: rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_0__2
            {
            pushFollow(FOLLOW_28);
            rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl"
    // InternalAlf.g:4598:1: rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl : ( ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )? ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4602:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )? ) )
            // InternalAlf.g:4603:1: ( ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )? )
            {
            // InternalAlf.g:4603:1: ( ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )? )
            // InternalAlf.g:4604:2: ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )?
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_0_1()); 
            // InternalAlf.g:4605:2: ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_NATURAL_VALUE) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==45) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:4605:3: rule__UntypedFeatureDefinition__Group_2_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__Group_2_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0__2"
    // InternalAlf.g:4613:1: rule__UntypedFeatureDefinition__Group_2_0_0__2 : rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl rule__UntypedFeatureDefinition__Group_2_0_0__3 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4617:1: ( rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl rule__UntypedFeatureDefinition__Group_2_0_0__3 )
            // InternalAlf.g:4618:2: rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl rule__UntypedFeatureDefinition__Group_2_0_0__3
            {
            pushFollow(FOLLOW_29);
            rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0__2"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl"
    // InternalAlf.g:4625:1: rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl : ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4629:1: ( ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 ) ) )
            // InternalAlf.g:4630:1: ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 ) )
            {
            // InternalAlf.g:4630:1: ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 ) )
            // InternalAlf.g:4631:2: ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperAssignment_2_0_0_2()); 
            // InternalAlf.g:4632:2: ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 )
            // InternalAlf.g:4632:3: rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperAssignment_2_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0__3"
    // InternalAlf.g:4640:1: rule__UntypedFeatureDefinition__Group_2_0_0__3 : rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4644:1: ( rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl )
            // InternalAlf.g:4645:2: rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0__3"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl"
    // InternalAlf.g:4651:1: rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl : ( ']' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4655:1: ( ( ']' ) )
            // InternalAlf.g:4656:1: ( ']' )
            {
            // InternalAlf.g:4656:1: ( ']' )
            // InternalAlf.g:4657:2: ']'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_0_0_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0_1__0"
    // InternalAlf.g:4667:1: rule__UntypedFeatureDefinition__Group_2_0_0_1__0 : rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4671:1: ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0_1__1 )
            // InternalAlf.g:4672:2: rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0_1__1
            {
            pushFollow(FOLLOW_30);
            rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0_1__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl"
    // InternalAlf.g:4679:1: rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl : ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4683:1: ( ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 ) ) )
            // InternalAlf.g:4684:1: ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 ) )
            {
            // InternalAlf.g:4684:1: ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 ) )
            // InternalAlf.g:4685:2: ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerAssignment_2_0_0_1_0()); 
            // InternalAlf.g:4686:2: ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 )
            // InternalAlf.g:4686:3: rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerAssignment_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0_1__1"
    // InternalAlf.g:4694:1: rule__UntypedFeatureDefinition__Group_2_0_0_1__1 : rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4698:1: ( rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl )
            // InternalAlf.g:4699:2: rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0_1__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl"
    // InternalAlf.g:4705:1: rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl : ( '..' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4709:1: ( ( '..' ) )
            // InternalAlf.g:4710:1: ( '..' )
            {
            // InternalAlf.g:4710:1: ( '..' )
            // InternalAlf.g:4711:2: '..'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_0_0_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0__0"
    // InternalAlf.g:4721:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__0 : rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4725:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__1 )
            // InternalAlf.g:4726:2: rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__1
            {
            pushFollow(FOLLOW_32);
            rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl"
    // InternalAlf.g:4733:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl : ( '=' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4737:1: ( ( '=' ) )
            // InternalAlf.g:4738:1: ( '=' )
            {
            // InternalAlf.g:4738:1: ( '=' )
            // InternalAlf.g:4739:2: '='
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getEqualsSignKeyword_2_0_1_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getEqualsSignKeyword_2_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0__1"
    // InternalAlf.g:4748:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__1 : rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4752:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__2 )
            // InternalAlf.g:4753:2: rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__2
            {
            pushFollow(FOLLOW_9);
            rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl"
    // InternalAlf.g:4760:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl : ( ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4764:1: ( ( ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 ) ) )
            // InternalAlf.g:4765:1: ( ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 ) )
            {
            // InternalAlf.g:4765:1: ( ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 ) )
            // InternalAlf.g:4766:2: ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getValueAssignment_2_0_1_0_1()); 
            // InternalAlf.g:4767:2: ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 )
            // InternalAlf.g:4767:3: rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getValueAssignment_2_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0__2"
    // InternalAlf.g:4775:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__2 : rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4779:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl )
            // InternalAlf.g:4780:2: rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0__2"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl"
    // InternalAlf.g:4786:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl : ( ';' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4790:1: ( ( ';' ) )
            // InternalAlf.g:4791:1: ( ';' )
            {
            // InternalAlf.g:4791:1: ( ';' )
            // InternalAlf.g:4792:2: ';'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_0_1_0_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_1__0"
    // InternalAlf.g:4802:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__0 : rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4806:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__1 )
            // InternalAlf.g:4807:2: rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_1__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl"
    // InternalAlf.g:4814:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl : ( '{' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4818:1: ( ( '{' ) )
            // InternalAlf.g:4819:1: ( '{' )
            {
            // InternalAlf.g:4819:1: ( '{' )
            // InternalAlf.g:4820:2: '{'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_1__1"
    // InternalAlf.g:4829:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__1 : rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4833:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__2 )
            // InternalAlf.g:4834:2: rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_1__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl"
    // InternalAlf.g:4841:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl : ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )* ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4845:1: ( ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )* ) )
            // InternalAlf.g:4846:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )* )
            {
            // InternalAlf.g:4846:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )* )
            // InternalAlf.g:4847:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )*
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipAssignment_2_0_1_1_1()); 
            // InternalAlf.g:4848:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_UNRESTRICTED_NAME)||(LA61_0>=15 && LA61_0<=17)||LA61_0==20||(LA61_0>=30 && LA61_0<=33)||LA61_0==41||(LA61_0>=53 && LA61_0<=54)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalAlf.g:4848:3: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipAssignment_2_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_1__2"
    // InternalAlf.g:4856:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__2 : rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4860:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl )
            // InternalAlf.g:4861:2: rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_1__2"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl"
    // InternalAlf.g:4867:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl : ( '}' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4871:1: ( ( '}' ) )
            // InternalAlf.g:4872:1: ( '}' )
            {
            // InternalAlf.g:4872:1: ( '}' )
            // InternalAlf.g:4873:2: '}'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_1_1_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__0"
    // InternalAlf.g:4883:1: rule__UntypedFeatureDefinition__Group_2_1__0 : rule__UntypedFeatureDefinition__Group_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4887:1: ( rule__UntypedFeatureDefinition__Group_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1__1 )
            // InternalAlf.g:4888:2: rule__UntypedFeatureDefinition__Group_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
            rule__UntypedFeatureDefinition__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__0__Impl"
    // InternalAlf.g:4895:1: rule__UntypedFeatureDefinition__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4899:1: ( ( '[' ) )
            // InternalAlf.g:4900:1: ( '[' )
            {
            // InternalAlf.g:4900:1: ( '[' )
            // InternalAlf.g:4901:2: '['
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__1"
    // InternalAlf.g:4910:1: rule__UntypedFeatureDefinition__Group_2_1__1 : rule__UntypedFeatureDefinition__Group_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_1__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4914:1: ( rule__UntypedFeatureDefinition__Group_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_1__2 )
            // InternalAlf.g:4915:2: rule__UntypedFeatureDefinition__Group_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_1__2
            {
            pushFollow(FOLLOW_28);
            rule__UntypedFeatureDefinition__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__1__Impl"
    // InternalAlf.g:4922:1: rule__UntypedFeatureDefinition__Group_2_1__1__Impl : ( ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )? ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4926:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )? ) )
            // InternalAlf.g:4927:1: ( ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )? )
            {
            // InternalAlf.g:4927:1: ( ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )? )
            // InternalAlf.g:4928:2: ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )?
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_1_1()); 
            // InternalAlf.g:4929:2: ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_NATURAL_VALUE) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==45) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // InternalAlf.g:4929:3: rule__UntypedFeatureDefinition__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__Group_2_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__1__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__2"
    // InternalAlf.g:4937:1: rule__UntypedFeatureDefinition__Group_2_1__2 : rule__UntypedFeatureDefinition__Group_2_1__2__Impl rule__UntypedFeatureDefinition__Group_2_1__3 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4941:1: ( rule__UntypedFeatureDefinition__Group_2_1__2__Impl rule__UntypedFeatureDefinition__Group_2_1__3 )
            // InternalAlf.g:4942:2: rule__UntypedFeatureDefinition__Group_2_1__2__Impl rule__UntypedFeatureDefinition__Group_2_1__3
            {
            pushFollow(FOLLOW_29);
            rule__UntypedFeatureDefinition__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__2"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__2__Impl"
    // InternalAlf.g:4949:1: rule__UntypedFeatureDefinition__Group_2_1__2__Impl : ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4953:1: ( ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 ) ) )
            // InternalAlf.g:4954:1: ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 ) )
            {
            // InternalAlf.g:4954:1: ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 ) )
            // InternalAlf.g:4955:2: ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperAssignment_2_1_2()); 
            // InternalAlf.g:4956:2: ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 )
            // InternalAlf.g:4956:3: rule__UntypedFeatureDefinition__UpperAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__UpperAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__2__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__3"
    // InternalAlf.g:4964:1: rule__UntypedFeatureDefinition__Group_2_1__3 : rule__UntypedFeatureDefinition__Group_2_1__3__Impl rule__UntypedFeatureDefinition__Group_2_1__4 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4968:1: ( rule__UntypedFeatureDefinition__Group_2_1__3__Impl rule__UntypedFeatureDefinition__Group_2_1__4 )
            // InternalAlf.g:4969:2: rule__UntypedFeatureDefinition__Group_2_1__3__Impl rule__UntypedFeatureDefinition__Group_2_1__4
            {
            pushFollow(FOLLOW_9);
            rule__UntypedFeatureDefinition__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__3"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__3__Impl"
    // InternalAlf.g:4976:1: rule__UntypedFeatureDefinition__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4980:1: ( ( ']' ) )
            // InternalAlf.g:4981:1: ( ']' )
            {
            // InternalAlf.g:4981:1: ( ']' )
            // InternalAlf.g:4982:2: ']'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__3__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__4"
    // InternalAlf.g:4991:1: rule__UntypedFeatureDefinition__Group_2_1__4 : rule__UntypedFeatureDefinition__Group_2_1__4__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4995:1: ( rule__UntypedFeatureDefinition__Group_2_1__4__Impl )
            // InternalAlf.g:4996:2: rule__UntypedFeatureDefinition__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__4"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1__4__Impl"
    // InternalAlf.g:5002:1: rule__UntypedFeatureDefinition__Group_2_1__4__Impl : ( ';' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5006:1: ( ( ';' ) )
            // InternalAlf.g:5007:1: ( ';' )
            {
            // InternalAlf.g:5007:1: ( ';' )
            // InternalAlf.g:5008:2: ';'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_1_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1__4__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1_1__0"
    // InternalAlf.g:5018:1: rule__UntypedFeatureDefinition__Group_2_1_1__0 : rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5022:1: ( rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1_1__1 )
            // InternalAlf.g:5023:2: rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1_1__1
            {
            pushFollow(FOLLOW_30);
            rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1_1__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl"
    // InternalAlf.g:5030:1: rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl : ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5034:1: ( ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 ) ) )
            // InternalAlf.g:5035:1: ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 ) )
            {
            // InternalAlf.g:5035:1: ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 ) )
            // InternalAlf.g:5036:2: ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerAssignment_2_1_1_0()); 
            // InternalAlf.g:5037:2: ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 )
            // InternalAlf.g:5037:3: rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerAssignment_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1_1__1"
    // InternalAlf.g:5045:1: rule__UntypedFeatureDefinition__Group_2_1_1__1 : rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5049:1: ( rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl )
            // InternalAlf.g:5050:2: rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1_1__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl"
    // InternalAlf.g:5056:1: rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl : ( '..' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5060:1: ( ( '..' ) )
            // InternalAlf.g:5061:1: ( '..' )
            {
            // InternalAlf.g:5061:1: ( '..' )
            // InternalAlf.g:5062:2: '..'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_0__0"
    // InternalAlf.g:5072:1: rule__OwnedRedefinitionOrSubset__Group_0__0 : rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5076:1: ( rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 )
            // InternalAlf.g:5077:2: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__OwnedRedefinitionOrSubset__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OwnedRedefinitionOrSubset__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Group_0__0"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_0__0__Impl"
    // InternalAlf.g:5084:1: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl : ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5088:1: ( ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) )
            // InternalAlf.g:5089:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            {
            // InternalAlf.g:5089:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            // InternalAlf.g:5090:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives_0_0()); 
            // InternalAlf.g:5091:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            // InternalAlf.g:5091:3: rule__OwnedRedefinitionOrSubset__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__OwnedRedefinitionOrSubset__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Group_0__0__Impl"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_0__1"
    // InternalAlf.g:5099:1: rule__OwnedRedefinitionOrSubset__Group_0__1 : rule__OwnedRedefinitionOrSubset__Group_0__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5103:1: ( rule__OwnedRedefinitionOrSubset__Group_0__1__Impl )
            // InternalAlf.g:5104:2: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OwnedRedefinitionOrSubset__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Group_0__1"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_0__1__Impl"
    // InternalAlf.g:5110:1: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5114:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) )
            // InternalAlf.g:5115:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            {
            // InternalAlf.g:5115:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            // InternalAlf.g:5116:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_0_1()); 
            // InternalAlf.g:5117:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            // InternalAlf.g:5117:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Group_0__1__Impl"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_1__0"
    // InternalAlf.g:5126:1: rule__OwnedRedefinitionOrSubset__Group_1__0 : rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5130:1: ( rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 )
            // InternalAlf.g:5131:2: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__OwnedRedefinitionOrSubset__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OwnedRedefinitionOrSubset__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Group_1__0"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_1__0__Impl"
    // InternalAlf.g:5138:1: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl : ( 'subsets' ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5142:1: ( ( 'subsets' ) )
            // InternalAlf.g:5143:1: ( 'subsets' )
            {
            // InternalAlf.g:5143:1: ( 'subsets' )
            // InternalAlf.g:5144:2: 'subsets'
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Group_1__0__Impl"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_1__1"
    // InternalAlf.g:5153:1: rule__OwnedRedefinitionOrSubset__Group_1__1 : rule__OwnedRedefinitionOrSubset__Group_1__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5157:1: ( rule__OwnedRedefinitionOrSubset__Group_1__1__Impl )
            // InternalAlf.g:5158:2: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OwnedRedefinitionOrSubset__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Group_1__1"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_1__1__Impl"
    // InternalAlf.g:5164:1: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5168:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) )
            // InternalAlf.g:5169:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            {
            // InternalAlf.g:5169:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            // InternalAlf.g:5170:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_1_1()); 
            // InternalAlf.g:5171:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            // InternalAlf.g:5171:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__Group_1__1__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group__0"
    // InternalAlf.g:5180:1: rule__ConnectorDefinition__Group__0 : rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 ;
    public final void rule__ConnectorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5184:1: ( rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 )
            // InternalAlf.g:5185:2: rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ConnectorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__0"


    // $ANTLR start "rule__ConnectorDefinition__Group__0__Impl"
    // InternalAlf.g:5192:1: rule__ConnectorDefinition__Group__0__Impl : ( ( rule__ConnectorDefinition__Group_0__0 )? ) ;
    public final void rule__ConnectorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5196:1: ( ( ( rule__ConnectorDefinition__Group_0__0 )? ) )
            // InternalAlf.g:5197:1: ( ( rule__ConnectorDefinition__Group_0__0 )? )
            {
            // InternalAlf.g:5197:1: ( ( rule__ConnectorDefinition__Group_0__0 )? )
            // InternalAlf.g:5198:2: ( rule__ConnectorDefinition__Group_0__0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup_0()); 
            // InternalAlf.g:5199:2: ( rule__ConnectorDefinition__Group_0__0 )?
            int alt63=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA63_1 = input.LA(2);

                    if ( (LA63_1==18||LA63_1==42) ) {
                        alt63=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==18||LA63_2==42) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 18:
                case 42:
                    {
                    alt63=1;
                    }
                    break;
            }

            switch (alt63) {
                case 1 :
                    // InternalAlf.g:5199:3: rule__ConnectorDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorDefinition__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorDefinitionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__0__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group__1"
    // InternalAlf.g:5207:1: rule__ConnectorDefinition__Group__1 : rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 ;
    public final void rule__ConnectorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5211:1: ( rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 )
            // InternalAlf.g:5212:2: rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ConnectorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__1"


    // $ANTLR start "rule__ConnectorDefinition__Group__1__Impl"
    // InternalAlf.g:5219:1: rule__ConnectorDefinition__Group__1__Impl : ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) ) ;
    public final void rule__ConnectorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5223:1: ( ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) ) )
            // InternalAlf.g:5224:1: ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) )
            {
            // InternalAlf.g:5224:1: ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) )
            // InternalAlf.g:5225:2: ( rule__ConnectorDefinition__SourceFeatureAssignment_1 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureAssignment_1()); 
            // InternalAlf.g:5226:2: ( rule__ConnectorDefinition__SourceFeatureAssignment_1 )
            // InternalAlf.g:5226:3: rule__ConnectorDefinition__SourceFeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__SourceFeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__1__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group__2"
    // InternalAlf.g:5234:1: rule__ConnectorDefinition__Group__2 : rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 ;
    public final void rule__ConnectorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5238:1: ( rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 )
            // InternalAlf.g:5239:2: rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConnectorDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__2"


    // $ANTLR start "rule__ConnectorDefinition__Group__2__Impl"
    // InternalAlf.g:5246:1: rule__ConnectorDefinition__Group__2__Impl : ( '=>' ) ;
    public final void rule__ConnectorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5250:1: ( ( '=>' ) )
            // InternalAlf.g:5251:1: ( '=>' )
            {
            // InternalAlf.g:5251:1: ( '=>' )
            // InternalAlf.g:5252:2: '=>'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__2__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group__3"
    // InternalAlf.g:5261:1: rule__ConnectorDefinition__Group__3 : rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 ;
    public final void rule__ConnectorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5265:1: ( rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 )
            // InternalAlf.g:5266:2: rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ConnectorDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__3"


    // $ANTLR start "rule__ConnectorDefinition__Group__3__Impl"
    // InternalAlf.g:5273:1: rule__ConnectorDefinition__Group__3__Impl : ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) ) ;
    public final void rule__ConnectorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5277:1: ( ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) ) )
            // InternalAlf.g:5278:1: ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) )
            {
            // InternalAlf.g:5278:1: ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) )
            // InternalAlf.g:5279:2: ( rule__ConnectorDefinition__TargetFeatureAssignment_3 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureAssignment_3()); 
            // InternalAlf.g:5280:2: ( rule__ConnectorDefinition__TargetFeatureAssignment_3 )
            // InternalAlf.g:5280:3: rule__ConnectorDefinition__TargetFeatureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__TargetFeatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__3__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group__4"
    // InternalAlf.g:5288:1: rule__ConnectorDefinition__Group__4 : rule__ConnectorDefinition__Group__4__Impl ;
    public final void rule__ConnectorDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5292:1: ( rule__ConnectorDefinition__Group__4__Impl )
            // InternalAlf.g:5293:2: rule__ConnectorDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__4"


    // $ANTLR start "rule__ConnectorDefinition__Group__4__Impl"
    // InternalAlf.g:5299:1: rule__ConnectorDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__ConnectorDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5303:1: ( ( ';' ) )
            // InternalAlf.g:5304:1: ( ';' )
            {
            // InternalAlf.g:5304:1: ( ';' )
            // InternalAlf.g:5305:2: ';'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__4__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group_0__0"
    // InternalAlf.g:5315:1: rule__ConnectorDefinition__Group_0__0 : rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1 ;
    public final void rule__ConnectorDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5319:1: ( rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1 )
            // InternalAlf.g:5320:2: rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__ConnectorDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0__0"


    // $ANTLR start "rule__ConnectorDefinition__Group_0__0__Impl"
    // InternalAlf.g:5327:1: rule__ConnectorDefinition__Group_0__0__Impl : ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? ) ;
    public final void rule__ConnectorDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5331:1: ( ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? ) )
            // InternalAlf.g:5332:1: ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? )
            {
            // InternalAlf.g:5332:1: ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? )
            // InternalAlf.g:5333:2: ( rule__ConnectorDefinition__NameAssignment_0_0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getNameAssignment_0_0()); 
            // InternalAlf.g:5334:2: ( rule__ConnectorDefinition__NameAssignment_0_0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAlf.g:5334:3: rule__ConnectorDefinition__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorDefinition__NameAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorDefinitionAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group_0__1"
    // InternalAlf.g:5342:1: rule__ConnectorDefinition__Group_0__1 : rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2 ;
    public final void rule__ConnectorDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5346:1: ( rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2 )
            // InternalAlf.g:5347:2: rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__ConnectorDefinition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0__1"


    // $ANTLR start "rule__ConnectorDefinition__Group_0__1__Impl"
    // InternalAlf.g:5354:1: rule__ConnectorDefinition__Group_0__1__Impl : ( ( rule__ConnectorDefinition__Group_0_1__0 )? ) ;
    public final void rule__ConnectorDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5358:1: ( ( ( rule__ConnectorDefinition__Group_0_1__0 )? ) )
            // InternalAlf.g:5359:1: ( ( rule__ConnectorDefinition__Group_0_1__0 )? )
            {
            // InternalAlf.g:5359:1: ( ( rule__ConnectorDefinition__Group_0_1__0 )? )
            // InternalAlf.g:5360:2: ( rule__ConnectorDefinition__Group_0_1__0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup_0_1()); 
            // InternalAlf.g:5361:2: ( rule__ConnectorDefinition__Group_0_1__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==42) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:5361:3: rule__ConnectorDefinition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorDefinition__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorDefinitionAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group_0__2"
    // InternalAlf.g:5369:1: rule__ConnectorDefinition__Group_0__2 : rule__ConnectorDefinition__Group_0__2__Impl ;
    public final void rule__ConnectorDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5373:1: ( rule__ConnectorDefinition__Group_0__2__Impl )
            // InternalAlf.g:5374:2: rule__ConnectorDefinition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0__2"


    // $ANTLR start "rule__ConnectorDefinition__Group_0__2__Impl"
    // InternalAlf.g:5380:1: rule__ConnectorDefinition__Group_0__2__Impl : ( 'is' ) ;
    public final void rule__ConnectorDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5384:1: ( ( 'is' ) )
            // InternalAlf.g:5385:1: ( 'is' )
            {
            // InternalAlf.g:5385:1: ( 'is' )
            // InternalAlf.g:5386:2: 'is'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group_0_1__0"
    // InternalAlf.g:5396:1: rule__ConnectorDefinition__Group_0_1__0 : rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1 ;
    public final void rule__ConnectorDefinition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5400:1: ( rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1 )
            // InternalAlf.g:5401:2: rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ConnectorDefinition__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0_1__0"


    // $ANTLR start "rule__ConnectorDefinition__Group_0_1__0__Impl"
    // InternalAlf.g:5408:1: rule__ConnectorDefinition__Group_0_1__0__Impl : ( ':' ) ;
    public final void rule__ConnectorDefinition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5412:1: ( ( ':' ) )
            // InternalAlf.g:5413:1: ( ':' )
            {
            // InternalAlf.g:5413:1: ( ':' )
            // InternalAlf.g:5414:2: ':'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0_1__0__Impl"


    // $ANTLR start "rule__ConnectorDefinition__Group_0_1__1"
    // InternalAlf.g:5423:1: rule__ConnectorDefinition__Group_0_1__1 : rule__ConnectorDefinition__Group_0_1__1__Impl ;
    public final void rule__ConnectorDefinition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5427:1: ( rule__ConnectorDefinition__Group_0_1__1__Impl )
            // InternalAlf.g:5428:2: rule__ConnectorDefinition__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0_1__1"


    // $ANTLR start "rule__ConnectorDefinition__Group_0_1__1__Impl"
    // InternalAlf.g:5434:1: rule__ConnectorDefinition__Group_0_1__1__Impl : ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) ) ;
    public final void rule__ConnectorDefinition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5438:1: ( ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) ) )
            // InternalAlf.g:5439:1: ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) )
            {
            // InternalAlf.g:5439:1: ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) )
            // InternalAlf.g:5440:2: ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getAssociationAssignment_0_1_1()); 
            // InternalAlf.g:5441:2: ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 )
            // InternalAlf.g:5441:3: rule__ConnectorDefinition__AssociationAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__AssociationAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorDefinitionAccess().getAssociationAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group_0_1__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalAlf.g:5450:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5454:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalAlf.g:5455:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // InternalAlf.g:5462:1: rule__BinaryExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5466:1: ( ( ruleUnaryExpression ) )
            // InternalAlf.g:5467:1: ( ruleUnaryExpression )
            {
            // InternalAlf.g:5467:1: ( ruleUnaryExpression )
            // InternalAlf.g:5468:2: ruleUnaryExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // InternalAlf.g:5477:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5481:1: ( rule__BinaryExpression__Group__1__Impl )
            // InternalAlf.g:5482:2: rule__BinaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // InternalAlf.g:5488:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__Group_1__0 )? ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5492:1: ( ( ( rule__BinaryExpression__Group_1__0 )? ) )
            // InternalAlf.g:5493:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            {
            // InternalAlf.g:5493:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            // InternalAlf.g:5494:2: ( rule__BinaryExpression__Group_1__0 )?
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup_1()); 
            // InternalAlf.g:5495:2: ( rule__BinaryExpression__Group_1__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=23 && LA66_0<=27)||LA66_0==56) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlf.g:5495:3: rule__BinaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1__0"
    // InternalAlf.g:5504:1: rule__BinaryExpression__Group_1__0 : rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 ;
    public final void rule__BinaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5508:1: ( rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 )
            // InternalAlf.g:5509:2: rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__BinaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1__0"


    // $ANTLR start "rule__BinaryExpression__Group_1__0__Impl"
    // InternalAlf.g:5516:1: rule__BinaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5520:1: ( ( () ) )
            // InternalAlf.g:5521:1: ( () )
            {
            // InternalAlf.g:5521:1: ( () )
            // InternalAlf.g:5522:2: ()
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalAlf.g:5523:2: ()
            // InternalAlf.g:5523:3: 
            {
            }

             after(grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1__1"
    // InternalAlf.g:5531:1: rule__BinaryExpression__Group_1__1 : rule__BinaryExpression__Group_1__1__Impl ;
    public final void rule__BinaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5535:1: ( rule__BinaryExpression__Group_1__1__Impl )
            // InternalAlf.g:5536:2: rule__BinaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1__1"


    // $ANTLR start "rule__BinaryExpression__Group_1__1__Impl"
    // InternalAlf.g:5542:1: rule__BinaryExpression__Group_1__1__Impl : ( ( rule__BinaryExpression__Alternatives_1_1 ) ) ;
    public final void rule__BinaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5546:1: ( ( ( rule__BinaryExpression__Alternatives_1_1 ) ) )
            // InternalAlf.g:5547:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            {
            // InternalAlf.g:5547:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            // InternalAlf.g:5548:2: ( rule__BinaryExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getAlternatives_1_1()); 
            // InternalAlf.g:5549:2: ( rule__BinaryExpression__Alternatives_1_1 )
            // InternalAlf.g:5549:3: rule__BinaryExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_0__0"
    // InternalAlf.g:5558:1: rule__BinaryExpression__Group_1_1_0__0 : rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 ;
    public final void rule__BinaryExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5562:1: ( rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 )
            // InternalAlf.g:5563:2: rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1
            {
            pushFollow(FOLLOW_32);
            rule__BinaryExpression__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_1_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_0__0"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_0__0__Impl"
    // InternalAlf.g:5570:1: rule__BinaryExpression__Group_1_1_0__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5574:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) )
            // InternalAlf.g:5575:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            {
            // InternalAlf.g:5575:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            // InternalAlf.g:5576:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_0_0()); 
            // InternalAlf.g:5577:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            // InternalAlf.g:5577:3: rule__BinaryExpression__OperatorAssignment_1_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OperatorAssignment_1_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_0__1"
    // InternalAlf.g:5585:1: rule__BinaryExpression__Group_1_1_0__1 : rule__BinaryExpression__Group_1_1_0__1__Impl ;
    public final void rule__BinaryExpression__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5589:1: ( rule__BinaryExpression__Group_1_1_0__1__Impl )
            // InternalAlf.g:5590:2: rule__BinaryExpression__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_1_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_0__1"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_0__1__Impl"
    // InternalAlf.g:5596:1: rule__BinaryExpression__Group_1_1_0__1__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5600:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) )
            // InternalAlf.g:5601:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            {
            // InternalAlf.g:5601:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            // InternalAlf.g:5602:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_0_1()); 
            // InternalAlf.g:5603:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            // InternalAlf.g:5603:3: rule__BinaryExpression__OperandAssignment_1_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OperandAssignment_1_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_1__0"
    // InternalAlf.g:5612:1: rule__BinaryExpression__Group_1_1_1__0 : rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 ;
    public final void rule__BinaryExpression__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5616:1: ( rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 )
            // InternalAlf.g:5617:2: rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1
            {
            pushFollow(FOLLOW_36);
            rule__BinaryExpression__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_1__0"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_1__0__Impl"
    // InternalAlf.g:5624:1: rule__BinaryExpression__Group_1_1_1__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5628:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) )
            // InternalAlf.g:5629:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            {
            // InternalAlf.g:5629:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            // InternalAlf.g:5630:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_1_0()); 
            // InternalAlf.g:5631:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            // InternalAlf.g:5631:3: rule__BinaryExpression__OperatorAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OperatorAssignment_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_1__1"
    // InternalAlf.g:5639:1: rule__BinaryExpression__Group_1_1_1__1 : rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 ;
    public final void rule__BinaryExpression__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5643:1: ( rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 )
            // InternalAlf.g:5644:2: rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2
            {
            pushFollow(FOLLOW_32);
            rule__BinaryExpression__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_1_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_1__1"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_1__1__Impl"
    // InternalAlf.g:5651:1: rule__BinaryExpression__Group_1_1_1__1__Impl : ( '[' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5655:1: ( ( '[' ) )
            // InternalAlf.g:5656:1: ( '[' )
            {
            // InternalAlf.g:5656:1: ( '[' )
            // InternalAlf.g:5657:2: '['
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_1__2"
    // InternalAlf.g:5666:1: rule__BinaryExpression__Group_1_1_1__2 : rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 ;
    public final void rule__BinaryExpression__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5670:1: ( rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 )
            // InternalAlf.g:5671:2: rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3
            {
            pushFollow(FOLLOW_29);
            rule__BinaryExpression__Group_1_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_1_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_1__2"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_1__2__Impl"
    // InternalAlf.g:5678:1: rule__BinaryExpression__Group_1_1_1__2__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5682:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) )
            // InternalAlf.g:5683:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            {
            // InternalAlf.g:5683:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            // InternalAlf.g:5684:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_1_2()); 
            // InternalAlf.g:5685:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            // InternalAlf.g:5685:3: rule__BinaryExpression__OperandAssignment_1_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OperandAssignment_1_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_1__3"
    // InternalAlf.g:5693:1: rule__BinaryExpression__Group_1_1_1__3 : rule__BinaryExpression__Group_1_1_1__3__Impl ;
    public final void rule__BinaryExpression__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5697:1: ( rule__BinaryExpression__Group_1_1_1__3__Impl )
            // InternalAlf.g:5698:2: rule__BinaryExpression__Group_1_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_1_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_1__3"


    // $ANTLR start "rule__BinaryExpression__Group_1_1_1__3__Impl"
    // InternalAlf.g:5704:1: rule__BinaryExpression__Group_1_1_1__3__Impl : ( ']' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5708:1: ( ( ']' ) )
            // InternalAlf.g:5709:1: ( ']' )
            {
            // InternalAlf.g:5709:1: ( ']' )
            // InternalAlf.g:5710:2: ']'
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightSquareBracketKeyword_1_1_1_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getRightSquareBracketKeyword_1_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_1_1_1__3__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__0"
    // InternalAlf.g:5720:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5724:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // InternalAlf.g:5725:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0"


    // $ANTLR start "rule__UnaryExpression__Group_1__0__Impl"
    // InternalAlf.g:5732:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5736:1: ( ( () ) )
            // InternalAlf.g:5737:1: ( () )
            {
            // InternalAlf.g:5737:1: ( () )
            // InternalAlf.g:5738:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0()); 
            // InternalAlf.g:5739:2: ()
            // InternalAlf.g:5739:3: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__1"
    // InternalAlf.g:5747:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5751:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // InternalAlf.g:5752:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_37);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1"


    // $ANTLR start "rule__UnaryExpression__Group_1__1__Impl"
    // InternalAlf.g:5759:1: rule__UnaryExpression__Group_1__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5763:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) )
            // InternalAlf.g:5764:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAlf.g:5764:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            // InternalAlf.g:5765:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAlf.g:5766:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            // InternalAlf.g:5766:3: rule__UnaryExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__2"
    // InternalAlf.g:5774:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5778:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // InternalAlf.g:5779:2: rule__UnaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2"


    // $ANTLR start "rule__UnaryExpression__Group_1__2__Impl"
    // InternalAlf.g:5785:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5789:1: ( ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) )
            // InternalAlf.g:5790:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            {
            // InternalAlf.g:5790:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            // InternalAlf.g:5791:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2()); 
            // InternalAlf.g:5792:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            // InternalAlf.g:5792:3: rule__UnaryExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0"
    // InternalAlf.g:5801:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5805:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalAlf.g:5806:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__PrimaryExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0__Impl"
    // InternalAlf.g:5813:1: rule__PrimaryExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5817:1: ( ( '(' ) )
            // InternalAlf.g:5818:1: ( '(' )
            {
            // InternalAlf.g:5818:1: ( '(' )
            // InternalAlf.g:5819:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1"
    // InternalAlf.g:5828:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5832:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalAlf.g:5833:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_38);
            rule__PrimaryExpression__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__1"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1__Impl"
    // InternalAlf.g:5840:1: rule__PrimaryExpression__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5844:1: ( ( ruleExpression ) )
            // InternalAlf.g:5845:1: ( ruleExpression )
            {
            // InternalAlf.g:5845:1: ( ruleExpression )
            // InternalAlf.g:5846:2: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__2"
    // InternalAlf.g:5855:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5859:1: ( rule__PrimaryExpression__Group_4__2__Impl )
            // InternalAlf.g:5860:2: rule__PrimaryExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__2"


    // $ANTLR start "rule__PrimaryExpression__Group_4__2__Impl"
    // InternalAlf.g:5866:1: rule__PrimaryExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5870:1: ( ( ')' ) )
            // InternalAlf.g:5871:1: ( ')' )
            {
            // InternalAlf.g:5871:1: ( ')' )
            // InternalAlf.g:5872:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__2__Impl"


    // $ANTLR start "rule__InstanceCreationExpression__Group__0"
    // InternalAlf.g:5882:1: rule__InstanceCreationExpression__Group__0 : rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 ;
    public final void rule__InstanceCreationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5886:1: ( rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 )
            // InternalAlf.g:5887:2: rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__InstanceCreationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group__0"


    // $ANTLR start "rule__InstanceCreationExpression__Group__0__Impl"
    // InternalAlf.g:5894:1: rule__InstanceCreationExpression__Group__0__Impl : ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5898:1: ( ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) )
            // InternalAlf.g:5899:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            {
            // InternalAlf.g:5899:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            // InternalAlf.g:5900:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassAssignment_0()); 
            // InternalAlf.g:5901:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            // InternalAlf.g:5901:3: rule__InstanceCreationExpression__ClassAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__ClassAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceCreationExpressionAccess().getClassAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group__0__Impl"


    // $ANTLR start "rule__InstanceCreationExpression__Group__1"
    // InternalAlf.g:5909:1: rule__InstanceCreationExpression__Group__1 : rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 ;
    public final void rule__InstanceCreationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5913:1: ( rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 )
            // InternalAlf.g:5914:2: rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__InstanceCreationExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group__1"


    // $ANTLR start "rule__InstanceCreationExpression__Group__1__Impl"
    // InternalAlf.g:5921:1: rule__InstanceCreationExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__InstanceCreationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5925:1: ( ( '(' ) )
            // InternalAlf.g:5926:1: ( '(' )
            {
            // InternalAlf.g:5926:1: ( '(' )
            // InternalAlf.g:5927:2: '('
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group__1__Impl"


    // $ANTLR start "rule__InstanceCreationExpression__Group__2"
    // InternalAlf.g:5936:1: rule__InstanceCreationExpression__Group__2 : rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 ;
    public final void rule__InstanceCreationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5940:1: ( rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 )
            // InternalAlf.g:5941:2: rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__InstanceCreationExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group__2"


    // $ANTLR start "rule__InstanceCreationExpression__Group__2__Impl"
    // InternalAlf.g:5948:1: rule__InstanceCreationExpression__Group__2__Impl : ( ( rule__InstanceCreationExpression__Group_2__0 )? ) ;
    public final void rule__InstanceCreationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5952:1: ( ( ( rule__InstanceCreationExpression__Group_2__0 )? ) )
            // InternalAlf.g:5953:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            {
            // InternalAlf.g:5953:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            // InternalAlf.g:5954:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2()); 
            // InternalAlf.g:5955:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_STRING_VALUE)||(LA67_0>=23 && LA67_0<=25)||LA67_0==37||LA67_0==49||(LA67_0>=51 && LA67_0<=52)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlf.g:5955:3: rule__InstanceCreationExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanceCreationExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group__2__Impl"


    // $ANTLR start "rule__InstanceCreationExpression__Group__3"
    // InternalAlf.g:5963:1: rule__InstanceCreationExpression__Group__3 : rule__InstanceCreationExpression__Group__3__Impl ;
    public final void rule__InstanceCreationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5967:1: ( rule__InstanceCreationExpression__Group__3__Impl )
            // InternalAlf.g:5968:2: rule__InstanceCreationExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group__3"


    // $ANTLR start "rule__InstanceCreationExpression__Group__3__Impl"
    // InternalAlf.g:5974:1: rule__InstanceCreationExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__InstanceCreationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5978:1: ( ( ')' ) )
            // InternalAlf.g:5979:1: ( ')' )
            {
            // InternalAlf.g:5979:1: ( ')' )
            // InternalAlf.g:5980:2: ')'
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getInstanceCreationExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group__3__Impl"


    // $ANTLR start "rule__InstanceCreationExpression__Group_2__0"
    // InternalAlf.g:5990:1: rule__InstanceCreationExpression__Group_2__0 : rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 ;
    public final void rule__InstanceCreationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5994:1: ( rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 )
            // InternalAlf.g:5995:2: rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__InstanceCreationExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group_2__0"


    // $ANTLR start "rule__InstanceCreationExpression__Group_2__0__Impl"
    // InternalAlf.g:6002:1: rule__InstanceCreationExpression__Group_2__0__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6006:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) )
            // InternalAlf.g:6007:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            {
            // InternalAlf.g:6007:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            // InternalAlf.g:6008:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_0()); 
            // InternalAlf.g:6009:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            // InternalAlf.g:6009:3: rule__InstanceCreationExpression__ArgumentAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__ArgumentAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group_2__0__Impl"


    // $ANTLR start "rule__InstanceCreationExpression__Group_2__1"
    // InternalAlf.g:6017:1: rule__InstanceCreationExpression__Group_2__1 : rule__InstanceCreationExpression__Group_2__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6021:1: ( rule__InstanceCreationExpression__Group_2__1__Impl )
            // InternalAlf.g:6022:2: rule__InstanceCreationExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group_2__1"


    // $ANTLR start "rule__InstanceCreationExpression__Group_2__1__Impl"
    // InternalAlf.g:6028:1: rule__InstanceCreationExpression__Group_2__1__Impl : ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) ;
    public final void rule__InstanceCreationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6032:1: ( ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:6033:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:6033:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            // InternalAlf.g:6034:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:6035:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==40) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalAlf.g:6035:3: rule__InstanceCreationExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InstanceCreationExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

             after(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group_2__1__Impl"


    // $ANTLR start "rule__InstanceCreationExpression__Group_2_1__0"
    // InternalAlf.g:6044:1: rule__InstanceCreationExpression__Group_2_1__0 : rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 ;
    public final void rule__InstanceCreationExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6048:1: ( rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 )
            // InternalAlf.g:6049:2: rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_32);
            rule__InstanceCreationExpression__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group_2_1__0"


    // $ANTLR start "rule__InstanceCreationExpression__Group_2_1__0__Impl"
    // InternalAlf.g:6056:1: rule__InstanceCreationExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6060:1: ( ( ',' ) )
            // InternalAlf.g:6061:1: ( ',' )
            {
            // InternalAlf.g:6061:1: ( ',' )
            // InternalAlf.g:6062:2: ','
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group_2_1__0__Impl"


    // $ANTLR start "rule__InstanceCreationExpression__Group_2_1__1"
    // InternalAlf.g:6071:1: rule__InstanceCreationExpression__Group_2_1__1 : rule__InstanceCreationExpression__Group_2_1__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6075:1: ( rule__InstanceCreationExpression__Group_2_1__1__Impl )
            // InternalAlf.g:6076:2: rule__InstanceCreationExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group_2_1__1"


    // $ANTLR start "rule__InstanceCreationExpression__Group_2_1__1__Impl"
    // InternalAlf.g:6082:1: rule__InstanceCreationExpression__Group_2_1__1__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6086:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) )
            // InternalAlf.g:6087:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            {
            // InternalAlf.g:6087:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            // InternalAlf.g:6088:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_1_1()); 
            // InternalAlf.g:6089:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            // InternalAlf.g:6089:3: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceCreationExpression__ArgumentAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__Group_2_1__1__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group__0"
    // InternalAlf.g:6098:1: rule__SequenceConstructionExpression__Group__0 : rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 ;
    public final void rule__SequenceConstructionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6102:1: ( rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 )
            // InternalAlf.g:6103:2: rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SequenceConstructionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group__0"


    // $ANTLR start "rule__SequenceConstructionExpression__Group__0__Impl"
    // InternalAlf.g:6110:1: rule__SequenceConstructionExpression__Group__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6114:1: ( ( () ) )
            // InternalAlf.g:6115:1: ( () )
            {
            // InternalAlf.g:6115:1: ( () )
            // InternalAlf.g:6116:2: ()
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0()); 
            // InternalAlf.g:6117:2: ()
            // InternalAlf.g:6117:3: 
            {
            }

             after(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group__0__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group__1"
    // InternalAlf.g:6125:1: rule__SequenceConstructionExpression__Group__1 : rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 ;
    public final void rule__SequenceConstructionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6129:1: ( rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 )
            // InternalAlf.g:6130:2: rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__SequenceConstructionExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group__1"


    // $ANTLR start "rule__SequenceConstructionExpression__Group__1__Impl"
    // InternalAlf.g:6137:1: rule__SequenceConstructionExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6141:1: ( ( '{' ) )
            // InternalAlf.g:6142:1: ( '{' )
            {
            // InternalAlf.g:6142:1: ( '{' )
            // InternalAlf.g:6143:2: '{'
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group__1__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group__2"
    // InternalAlf.g:6152:1: rule__SequenceConstructionExpression__Group__2 : rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 ;
    public final void rule__SequenceConstructionExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6156:1: ( rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 )
            // InternalAlf.g:6157:2: rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__SequenceConstructionExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group__2"


    // $ANTLR start "rule__SequenceConstructionExpression__Group__2__Impl"
    // InternalAlf.g:6164:1: rule__SequenceConstructionExpression__Group__2__Impl : ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) ;
    public final void rule__SequenceConstructionExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6168:1: ( ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) )
            // InternalAlf.g:6169:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            {
            // InternalAlf.g:6169:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            // InternalAlf.g:6170:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2()); 
            // InternalAlf.g:6171:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_STRING_VALUE)||(LA69_0>=23 && LA69_0<=25)||LA69_0==37||LA69_0==49||(LA69_0>=51 && LA69_0<=52)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlf.g:6171:3: rule__SequenceConstructionExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceConstructionExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group__2__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group__3"
    // InternalAlf.g:6179:1: rule__SequenceConstructionExpression__Group__3 : rule__SequenceConstructionExpression__Group__3__Impl ;
    public final void rule__SequenceConstructionExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6183:1: ( rule__SequenceConstructionExpression__Group__3__Impl )
            // InternalAlf.g:6184:2: rule__SequenceConstructionExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group__3"


    // $ANTLR start "rule__SequenceConstructionExpression__Group__3__Impl"
    // InternalAlf.g:6190:1: rule__SequenceConstructionExpression__Group__3__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6194:1: ( ( '}' ) )
            // InternalAlf.g:6195:1: ( '}' )
            {
            // InternalAlf.g:6195:1: ( '}' )
            // InternalAlf.g:6196:2: '}'
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group__3__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_2__0"
    // InternalAlf.g:6206:1: rule__SequenceConstructionExpression__Group_2__0 : rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 ;
    public final void rule__SequenceConstructionExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6210:1: ( rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 )
            // InternalAlf.g:6211:2: rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__SequenceConstructionExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_2__0"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_2__0__Impl"
    // InternalAlf.g:6218:1: rule__SequenceConstructionExpression__Group_2__0__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6222:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) )
            // InternalAlf.g:6223:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            {
            // InternalAlf.g:6223:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            // InternalAlf.g:6224:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_0()); 
            // InternalAlf.g:6225:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            // InternalAlf.g:6225:3: rule__SequenceConstructionExpression__ElementAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__ElementAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_2__0__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_2__1"
    // InternalAlf.g:6233:1: rule__SequenceConstructionExpression__Group_2__1 : rule__SequenceConstructionExpression__Group_2__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6237:1: ( rule__SequenceConstructionExpression__Group_2__1__Impl )
            // InternalAlf.g:6238:2: rule__SequenceConstructionExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_2__1"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_2__1__Impl"
    // InternalAlf.g:6244:1: rule__SequenceConstructionExpression__Group_2__1__Impl : ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) ;
    public final void rule__SequenceConstructionExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6248:1: ( ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:6249:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:6249:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            // InternalAlf.g:6250:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:6251:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==40) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalAlf.g:6251:3: rule__SequenceConstructionExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SequenceConstructionExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

             after(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_2__1__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_2_1__0"
    // InternalAlf.g:6260:1: rule__SequenceConstructionExpression__Group_2_1__0 : rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6264:1: ( rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 )
            // InternalAlf.g:6265:2: rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_32);
            rule__SequenceConstructionExpression__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_2_1__0"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_2_1__0__Impl"
    // InternalAlf.g:6272:1: rule__SequenceConstructionExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6276:1: ( ( ',' ) )
            // InternalAlf.g:6277:1: ( ',' )
            {
            // InternalAlf.g:6277:1: ( ',' )
            // InternalAlf.g:6278:2: ','
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_2_1__0__Impl"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_2_1__1"
    // InternalAlf.g:6287:1: rule__SequenceConstructionExpression__Group_2_1__1 : rule__SequenceConstructionExpression__Group_2_1__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6291:1: ( rule__SequenceConstructionExpression__Group_2_1__1__Impl )
            // InternalAlf.g:6292:2: rule__SequenceConstructionExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_2_1__1"


    // $ANTLR start "rule__SequenceConstructionExpression__Group_2_1__1__Impl"
    // InternalAlf.g:6298:1: rule__SequenceConstructionExpression__Group_2_1__1__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6302:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) )
            // InternalAlf.g:6303:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            {
            // InternalAlf.g:6303:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            // InternalAlf.g:6304:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_1_1()); 
            // InternalAlf.g:6305:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            // InternalAlf.g:6305:3: rule__SequenceConstructionExpression__ElementAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceConstructionExpression__ElementAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__Group_2_1__1__Impl"


    // $ANTLR start "rule__NullLiteralExpression__Group__0"
    // InternalAlf.g:6314:1: rule__NullLiteralExpression__Group__0 : rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 ;
    public final void rule__NullLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6318:1: ( rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 )
            // InternalAlf.g:6319:2: rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__NullLiteralExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullLiteralExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteralExpression__Group__0"


    // $ANTLR start "rule__NullLiteralExpression__Group__0__Impl"
    // InternalAlf.g:6326:1: rule__NullLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6330:1: ( ( () ) )
            // InternalAlf.g:6331:1: ( () )
            {
            // InternalAlf.g:6331:1: ( () )
            // InternalAlf.g:6332:2: ()
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0()); 
            // InternalAlf.g:6333:2: ()
            // InternalAlf.g:6333:3: 
            {
            }

             after(grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteralExpression__Group__0__Impl"


    // $ANTLR start "rule__NullLiteralExpression__Group__1"
    // InternalAlf.g:6341:1: rule__NullLiteralExpression__Group__1 : rule__NullLiteralExpression__Group__1__Impl ;
    public final void rule__NullLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6345:1: ( rule__NullLiteralExpression__Group__1__Impl )
            // InternalAlf.g:6346:2: rule__NullLiteralExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullLiteralExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteralExpression__Group__1"


    // $ANTLR start "rule__NullLiteralExpression__Group__1__Impl"
    // InternalAlf.g:6352:1: rule__NullLiteralExpression__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6356:1: ( ( 'null' ) )
            // InternalAlf.g:6357:1: ( 'null' )
            {
            // InternalAlf.g:6357:1: ( 'null' )
            // InternalAlf.g:6358:2: 'null'
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getNullKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNullLiteralExpressionAccess().getNullKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteralExpression__Group__1__Impl"


    // $ANTLR start "rule__RealValue__Group__0"
    // InternalAlf.g:6368:1: rule__RealValue__Group__0 : rule__RealValue__Group__0__Impl rule__RealValue__Group__1 ;
    public final void rule__RealValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6372:1: ( rule__RealValue__Group__0__Impl rule__RealValue__Group__1 )
            // InternalAlf.g:6373:2: rule__RealValue__Group__0__Impl rule__RealValue__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__RealValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group__0"


    // $ANTLR start "rule__RealValue__Group__0__Impl"
    // InternalAlf.g:6380:1: rule__RealValue__Group__0__Impl : ( ( rule__RealValue__Alternatives_0 ) ) ;
    public final void rule__RealValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6384:1: ( ( ( rule__RealValue__Alternatives_0 ) ) )
            // InternalAlf.g:6385:1: ( ( rule__RealValue__Alternatives_0 ) )
            {
            // InternalAlf.g:6385:1: ( ( rule__RealValue__Alternatives_0 ) )
            // InternalAlf.g:6386:2: ( rule__RealValue__Alternatives_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_0()); 
            // InternalAlf.g:6387:2: ( rule__RealValue__Alternatives_0 )
            // InternalAlf.g:6387:3: rule__RealValue__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group__0__Impl"


    // $ANTLR start "rule__RealValue__Group__1"
    // InternalAlf.g:6395:1: rule__RealValue__Group__1 : rule__RealValue__Group__1__Impl ;
    public final void rule__RealValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6399:1: ( rule__RealValue__Group__1__Impl )
            // InternalAlf.g:6400:2: rule__RealValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group__1"


    // $ANTLR start "rule__RealValue__Group__1__Impl"
    // InternalAlf.g:6406:1: rule__RealValue__Group__1__Impl : ( ( rule__RealValue__Group_1__0 )? ) ;
    public final void rule__RealValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6410:1: ( ( ( rule__RealValue__Group_1__0 )? ) )
            // InternalAlf.g:6411:1: ( ( rule__RealValue__Group_1__0 )? )
            {
            // InternalAlf.g:6411:1: ( ( rule__RealValue__Group_1__0 )? )
            // InternalAlf.g:6412:2: ( rule__RealValue__Group_1__0 )?
            {
             before(grammarAccess.getRealValueAccess().getGroup_1()); 
            // InternalAlf.g:6413:2: ( rule__RealValue__Group_1__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=28 && LA71_0<=29)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:6413:3: rule__RealValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RealValue__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRealValueAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group__1__Impl"


    // $ANTLR start "rule__RealValue__Group_0_0__0"
    // InternalAlf.g:6422:1: rule__RealValue__Group_0_0__0 : rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 ;
    public final void rule__RealValue__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6426:1: ( rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 )
            // InternalAlf.g:6427:2: rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1
            {
            pushFollow(FOLLOW_44);
            rule__RealValue__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_0__0"


    // $ANTLR start "rule__RealValue__Group_0_0__0__Impl"
    // InternalAlf.g:6434:1: rule__RealValue__Group_0_0__0__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6438:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:6439:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:6439:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:6440:2: RULE_NATURAL_VALUE
            {
             before(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0()); 
            match(input,RULE_NATURAL_VALUE,FOLLOW_2); 
             after(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_0__0__Impl"


    // $ANTLR start "rule__RealValue__Group_0_0__1"
    // InternalAlf.g:6449:1: rule__RealValue__Group_0_0__1 : rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 ;
    public final void rule__RealValue__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6453:1: ( rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 )
            // InternalAlf.g:6454:2: rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2
            {
            pushFollow(FOLLOW_45);
            rule__RealValue__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_0__1"


    // $ANTLR start "rule__RealValue__Group_0_0__1__Impl"
    // InternalAlf.g:6461:1: rule__RealValue__Group_0_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6465:1: ( ( '.' ) )
            // InternalAlf.g:6466:1: ( '.' )
            {
            // InternalAlf.g:6466:1: ( '.' )
            // InternalAlf.g:6467:2: '.'
            {
             before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_0__1__Impl"


    // $ANTLR start "rule__RealValue__Group_0_0__2"
    // InternalAlf.g:6476:1: rule__RealValue__Group_0_0__2 : rule__RealValue__Group_0_0__2__Impl ;
    public final void rule__RealValue__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6480:1: ( rule__RealValue__Group_0_0__2__Impl )
            // InternalAlf.g:6481:2: rule__RealValue__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_0__2"


    // $ANTLR start "rule__RealValue__Group_0_0__2__Impl"
    // InternalAlf.g:6487:1: rule__RealValue__Group_0_0__2__Impl : ( ( RULE_NATURAL_VALUE )? ) ;
    public final void rule__RealValue__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6491:1: ( ( ( RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:6492:1: ( ( RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:6492:1: ( ( RULE_NATURAL_VALUE )? )
            // InternalAlf.g:6493:2: ( RULE_NATURAL_VALUE )?
            {
             before(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2()); 
            // InternalAlf.g:6494:2: ( RULE_NATURAL_VALUE )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_NATURAL_VALUE) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAlf.g:6494:3: RULE_NATURAL_VALUE
                    {
                    match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_0__2__Impl"


    // $ANTLR start "rule__RealValue__Group_0_1__0"
    // InternalAlf.g:6503:1: rule__RealValue__Group_0_1__0 : rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 ;
    public final void rule__RealValue__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6507:1: ( rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 )
            // InternalAlf.g:6508:2: rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1
            {
            pushFollow(FOLLOW_45);
            rule__RealValue__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_1__0"


    // $ANTLR start "rule__RealValue__Group_0_1__0__Impl"
    // InternalAlf.g:6515:1: rule__RealValue__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6519:1: ( ( '.' ) )
            // InternalAlf.g:6520:1: ( '.' )
            {
            // InternalAlf.g:6520:1: ( '.' )
            // InternalAlf.g:6521:2: '.'
            {
             before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_1__0__Impl"


    // $ANTLR start "rule__RealValue__Group_0_1__1"
    // InternalAlf.g:6530:1: rule__RealValue__Group_0_1__1 : rule__RealValue__Group_0_1__1__Impl ;
    public final void rule__RealValue__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6534:1: ( rule__RealValue__Group_0_1__1__Impl )
            // InternalAlf.g:6535:2: rule__RealValue__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_1__1"


    // $ANTLR start "rule__RealValue__Group_0_1__1__Impl"
    // InternalAlf.g:6541:1: rule__RealValue__Group_0_1__1__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6545:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:6546:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:6546:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:6547:2: RULE_NATURAL_VALUE
            {
             before(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1()); 
            match(input,RULE_NATURAL_VALUE,FOLLOW_2); 
             after(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0_1__1__Impl"


    // $ANTLR start "rule__RealValue__Group_1__0"
    // InternalAlf.g:6557:1: rule__RealValue__Group_1__0 : rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 ;
    public final void rule__RealValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6561:1: ( rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 )
            // InternalAlf.g:6562:2: rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__RealValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__0"


    // $ANTLR start "rule__RealValue__Group_1__0__Impl"
    // InternalAlf.g:6569:1: rule__RealValue__Group_1__0__Impl : ( ( rule__RealValue__Alternatives_1_0 ) ) ;
    public final void rule__RealValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6573:1: ( ( ( rule__RealValue__Alternatives_1_0 ) ) )
            // InternalAlf.g:6574:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            {
            // InternalAlf.g:6574:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            // InternalAlf.g:6575:2: ( rule__RealValue__Alternatives_1_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_0()); 
            // InternalAlf.g:6576:2: ( rule__RealValue__Alternatives_1_0 )
            // InternalAlf.g:6576:3: rule__RealValue__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__0__Impl"


    // $ANTLR start "rule__RealValue__Group_1__1"
    // InternalAlf.g:6584:1: rule__RealValue__Group_1__1 : rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 ;
    public final void rule__RealValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6588:1: ( rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 )
            // InternalAlf.g:6589:2: rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2
            {
            pushFollow(FOLLOW_46);
            rule__RealValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealValue__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__1"


    // $ANTLR start "rule__RealValue__Group_1__1__Impl"
    // InternalAlf.g:6596:1: rule__RealValue__Group_1__1__Impl : ( ( rule__RealValue__Alternatives_1_1 )? ) ;
    public final void rule__RealValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6600:1: ( ( ( rule__RealValue__Alternatives_1_1 )? ) )
            // InternalAlf.g:6601:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            {
            // InternalAlf.g:6601:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            // InternalAlf.g:6602:2: ( rule__RealValue__Alternatives_1_1 )?
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_1()); 
            // InternalAlf.g:6603:2: ( rule__RealValue__Alternatives_1_1 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=23 && LA73_0<=24)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAlf.g:6603:3: rule__RealValue__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RealValue__Alternatives_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRealValueAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__1__Impl"


    // $ANTLR start "rule__RealValue__Group_1__2"
    // InternalAlf.g:6611:1: rule__RealValue__Group_1__2 : rule__RealValue__Group_1__2__Impl ;
    public final void rule__RealValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6615:1: ( rule__RealValue__Group_1__2__Impl )
            // InternalAlf.g:6616:2: rule__RealValue__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__2"


    // $ANTLR start "rule__RealValue__Group_1__2__Impl"
    // InternalAlf.g:6622:1: rule__RealValue__Group_1__2__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6626:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:6627:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:6627:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:6628:2: RULE_NATURAL_VALUE
            {
             before(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_1_2()); 
            match(input,RULE_NATURAL_VALUE,FOLLOW_2); 
             after(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__2__Impl"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpression__Group_1__0"
    // InternalAlf.g:6638:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0 : rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6642:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 )
            // InternalAlf.g:6643:2: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAlf.g:6650:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6654:1: ( ( () ) )
            // InternalAlf.g:6655:1: ( () )
            {
            // InternalAlf.g:6655:1: ( () )
            // InternalAlf.g:6656:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0()); 
            // InternalAlf.g:6657:2: ()
            // InternalAlf.g:6657:3: 
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
    // InternalAlf.g:6665:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1 : rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6669:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl )
            // InternalAlf.g:6670:2: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl
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
    // InternalAlf.g:6676:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl : ( '*' ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6680:1: ( ( '*' ) )
            // InternalAlf.g:6681:1: ( '*' )
            {
            // InternalAlf.g:6681:1: ( '*' )
            // InternalAlf.g:6682:2: '*'
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAlf.g:6692:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6696:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:6697:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAlf.g:6704:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6708:1: ( ( ruleName ) )
            // InternalAlf.g:6709:1: ( ruleName )
            {
            // InternalAlf.g:6709:1: ( ruleName )
            // InternalAlf.g:6710:2: ruleName
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
    // InternalAlf.g:6719:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6723:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:6724:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:6730:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6734:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:6735:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:6735:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:6736:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:6737:2: ( rule__QualifiedName__Group_1__0 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==52) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAlf.g:6737:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // InternalAlf.g:6746:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6750:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:6751:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAlf.g:6758:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6762:1: ( ( '.' ) )
            // InternalAlf.g:6763:1: ( '.' )
            {
            // InternalAlf.g:6763:1: ( '.' )
            // InternalAlf.g:6764:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAlf.g:6773:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6777:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:6778:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAlf.g:6784:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6788:1: ( ( ruleName ) )
            // InternalAlf.g:6789:1: ( ruleName )
            {
            // InternalAlf.g:6789:1: ( ruleName )
            // InternalAlf.g:6790:2: ruleName
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
    // InternalAlf.g:6800:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6804:1: ( ( ruleName ) )
            // InternalAlf.g:6805:2: ( ruleName )
            {
            // InternalAlf.g:6805:2: ( ruleName )
            // InternalAlf.g:6806:3: ruleName
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


    // $ANTLR start "rule__PackageDefinition__OwnedMembershipAssignment_3"
    // InternalAlf.g:6815:1: rule__PackageDefinition__OwnedMembershipAssignment_3 : ( rulePackageMember ) ;
    public final void rule__PackageDefinition__OwnedMembershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6819:1: ( ( rulePackageMember ) )
            // InternalAlf.g:6820:2: ( rulePackageMember )
            {
            // InternalAlf.g:6820:2: ( rulePackageMember )
            // InternalAlf.g:6821:3: rulePackageMember
            {
             before(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePackageMember();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__OwnedMembershipAssignment_3"


    // $ANTLR start "rule__NonFeatureMember__VisibilityAssignment_0"
    // InternalAlf.g:6830:1: rule__NonFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__NonFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6834:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:6835:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:6835:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:6836:3: ruleVisibilityIndicator
            {
             before(grammarAccess.getNonFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityIndicator();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__VisibilityAssignment_0"


    // $ANTLR start "rule__NonFeatureMember__OwnedMemberElementAssignment_1_0"
    // InternalAlf.g:6845:1: rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 : ( ruleNonFeatureDefinition ) ;
    public final void rule__NonFeatureMember__OwnedMemberElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6849:1: ( ( ruleNonFeatureDefinition ) )
            // InternalAlf.g:6850:2: ( ruleNonFeatureDefinition )
            {
            // InternalAlf.g:6850:2: ( ruleNonFeatureDefinition )
            // InternalAlf.g:6851:3: ruleNonFeatureDefinition
            {
             before(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNonFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__OwnedMemberElementAssignment_1_0"


    // $ANTLR start "rule__NonFeatureMember__MemberNameAssignment_1_1_1"
    // InternalAlf.g:6860:1: rule__NonFeatureMember__MemberNameAssignment_1_1_1 : ( ruleName ) ;
    public final void rule__NonFeatureMember__MemberNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6864:1: ( ( ruleName ) )
            // InternalAlf.g:6865:2: ( ruleName )
            {
            // InternalAlf.g:6865:2: ( ruleName )
            // InternalAlf.g:6866:3: ruleName
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__MemberNameAssignment_1_1_1"


    // $ANTLR start "rule__NonFeatureMember__MemberElementAssignment_1_1_3"
    // InternalAlf.g:6875:1: rule__NonFeatureMember__MemberElementAssignment_1_1_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFeatureMember__MemberElementAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6879:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6880:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6880:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6881:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementCrossReference_1_1_3_0()); 
            // InternalAlf.g:6882:3: ( ruleQualifiedName )
            // InternalAlf.g:6883:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementQualifiedNameParserRuleCall_1_1_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementQualifiedNameParserRuleCall_1_1_3_0_1()); 

            }

             after(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementCrossReference_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__MemberElementAssignment_1_1_3"


    // $ANTLR start "rule__PackagedFeatureMember__VisibilityAssignment_0"
    // InternalAlf.g:6894:1: rule__PackagedFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__PackagedFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6898:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:6899:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:6899:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:6900:3: ruleVisibilityIndicator
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityIndicator();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__VisibilityAssignment_0"


    // $ANTLR start "rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1"
    // InternalAlf.g:6909:1: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 : ( ruleTypedFeatureDefinition ) ;
    public final void rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6913:1: ( ( ruleTypedFeatureDefinition ) )
            // InternalAlf.g:6914:2: ( ruleTypedFeatureDefinition )
            {
            // InternalAlf.g:6914:2: ( ruleTypedFeatureDefinition )
            // InternalAlf.g:6915:3: ruleTypedFeatureDefinition
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1"


    // $ANTLR start "rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1"
    // InternalAlf.g:6924:1: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 : ( ruleUntypedFeatureDefinition ) ;
    public final void rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6928:1: ( ( ruleUntypedFeatureDefinition ) )
            // InternalAlf.g:6929:2: ( ruleUntypedFeatureDefinition )
            {
            // InternalAlf.g:6929:2: ( ruleUntypedFeatureDefinition )
            // InternalAlf.g:6930:3: ruleUntypedFeatureDefinition
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUntypedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1"


    // $ANTLR start "rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1"
    // InternalAlf.g:6939:1: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 : ( ruleName ) ;
    public final void rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6943:1: ( ( ruleName ) )
            // InternalAlf.g:6944:2: ( ruleName )
            {
            // InternalAlf.g:6944:2: ( ruleName )
            // InternalAlf.g:6945:3: ruleName
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1"


    // $ANTLR start "rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1"
    // InternalAlf.g:6954:1: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 : ( ruleName ) ;
    public final void rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6958:1: ( ( ruleName ) )
            // InternalAlf.g:6959:2: ( ruleName )
            {
            // InternalAlf.g:6959:2: ( ruleName )
            // InternalAlf.g:6960:3: ruleName
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1"


    // $ANTLR start "rule__PackagedFeatureMember__MemberElementAssignment_1_2_2"
    // InternalAlf.g:6969:1: rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PackagedFeatureMember__MemberElementAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6973:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6974:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6974:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6975:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_2_2_0()); 
            // InternalAlf.g:6976:3: ( ruleQualifiedName )
            // InternalAlf.g:6977:4: ruleQualifiedName
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_1_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_1_2_2_0_1()); 

            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__MemberElementAssignment_1_2_2"


    // $ANTLR start "rule__ClassDeclaration__IsAbstractAssignment_0"
    // InternalAlf.g:6988:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6992:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:6993:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:6993:2: ( ( 'abstract' ) )
            // InternalAlf.g:6994:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:6995:3: ( 'abstract' )
            // InternalAlf.g:6996:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAlf.g:7007:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7011:1: ( ( ruleName ) )
            // InternalAlf.g:7012:2: ( ruleName )
            {
            // InternalAlf.g:7012:2: ( ruleName )
            // InternalAlf.g:7013:3: ruleName
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


    // $ANTLR start "rule__ClassDeclaration__OwnedMembershipAssignment_3_1"
    // InternalAlf.g:7022:1: rule__ClassDeclaration__OwnedMembershipAssignment_3_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedMembershipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7026:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:7027:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:7027:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:7028:3: ruleOwnedGeneralization
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__OwnedMembershipAssignment_3_1"


    // $ANTLR start "rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1"
    // InternalAlf.g:7037:1: rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7041:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:7042:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:7042:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:7043:3: ruleOwnedGeneralization
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1"


    // $ANTLR start "rule__OwnedGeneralization__OwnedMemberElementAssignment"
    // InternalAlf.g:7052:1: rule__OwnedGeneralization__OwnedMemberElementAssignment : ( ruleGeneralization ) ;
    public final void rule__OwnedGeneralization__OwnedMemberElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7056:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:7057:2: ( ruleGeneralization )
            {
            // InternalAlf.g:7057:2: ( ruleGeneralization )
            // InternalAlf.g:7058:3: ruleGeneralization
            {
             before(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementGeneralizationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementGeneralizationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedGeneralization__OwnedMemberElementAssignment"


    // $ANTLR start "rule__Generalization__GeneralAssignment"
    // InternalAlf.g:7067:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7071:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7072:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7072:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7073:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:7074:3: ( ruleQualifiedName )
            // InternalAlf.g:7075:4: ruleQualifiedName
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


    // $ANTLR start "rule__ClassDefinition__OwnedMembershipAssignment_2"
    // InternalAlf.g:7086:1: rule__ClassDefinition__OwnedMembershipAssignment_2 : ( ruleClassMember ) ;
    public final void rule__ClassDefinition__OwnedMembershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7090:1: ( ( ruleClassMember ) )
            // InternalAlf.g:7091:2: ( ruleClassMember )
            {
            // InternalAlf.g:7091:2: ( ruleClassMember )
            // InternalAlf.g:7092:3: ruleClassMember
            {
             before(grammarAccess.getClassDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getClassDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinition__OwnedMembershipAssignment_2"


    // $ANTLR start "rule__ClassFeatureMember__VisibilityAssignment_0"
    // InternalAlf.g:7101:1: rule__ClassFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__ClassFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7105:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:7106:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:7106:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:7107:3: ruleVisibilityIndicator
            {
             before(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityIndicator();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__VisibilityAssignment_0"


    // $ANTLR start "rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0"
    // InternalAlf.g:7116:1: rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0 : ( ( 'port' ) ) ;
    public final void rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7120:1: ( ( ( 'port' ) ) )
            // InternalAlf.g:7121:2: ( ( 'port' ) )
            {
            // InternalAlf.g:7121:2: ( ( 'port' ) )
            // InternalAlf.g:7122:3: ( 'port' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_1_0_0()); 
            // InternalAlf.g:7123:3: ( 'port' )
            // InternalAlf.g:7124:4: 'port'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_1_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_1_0_0()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__IsPortAssignment_1_0_0_1_0"


    // $ANTLR start "rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1"
    // InternalAlf.g:7135:1: rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1 : ( ruleFeatureDirection ) ;
    public final void rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7139:1: ( ( ruleFeatureDirection ) )
            // InternalAlf.g:7140:2: ( ruleFeatureDirection )
            {
            // InternalAlf.g:7140:2: ( ruleFeatureDirection )
            // InternalAlf.g:7141:3: ruleFeatureDirection
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDirection();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__DirectionAssignment_1_0_0_1_1"


    // $ANTLR start "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1"
    // InternalAlf.g:7150:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1 : ( ruleTypedFeatureDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7154:1: ( ( ruleTypedFeatureDefinition ) )
            // InternalAlf.g:7155:2: ( ruleTypedFeatureDefinition )
            {
            // InternalAlf.g:7155:2: ( ruleTypedFeatureDefinition )
            // InternalAlf.g:7156:3: ruleTypedFeatureDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_1"


    // $ANTLR start "rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0"
    // InternalAlf.g:7165:1: rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0 : ( ( 'port' ) ) ;
    public final void rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7169:1: ( ( ( 'port' ) ) )
            // InternalAlf.g:7170:2: ( ( 'port' ) )
            {
            // InternalAlf.g:7170:2: ( ( 'port' ) )
            // InternalAlf.g:7171:3: ( 'port' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_1_0_0()); 
            // InternalAlf.g:7172:3: ( 'port' )
            // InternalAlf.g:7173:4: 'port'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_1_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_1_0_0()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__IsPortAssignment_1_1_0_1_0"


    // $ANTLR start "rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1"
    // InternalAlf.g:7184:1: rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1 : ( ruleFeatureDirection ) ;
    public final void rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7188:1: ( ( ruleFeatureDirection ) )
            // InternalAlf.g:7189:2: ( ruleFeatureDirection )
            {
            // InternalAlf.g:7189:2: ( ruleFeatureDirection )
            // InternalAlf.g:7190:3: ruleFeatureDirection
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDirection();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__DirectionAssignment_1_1_0_1_1"


    // $ANTLR start "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1"
    // InternalAlf.g:7199:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1 : ( ruleUntypedFeatureDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7203:1: ( ( ruleUntypedFeatureDefinition ) )
            // InternalAlf.g:7204:2: ( ruleUntypedFeatureDefinition )
            {
            // InternalAlf.g:7204:2: ( ruleUntypedFeatureDefinition )
            // InternalAlf.g:7205:3: ruleUntypedFeatureDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUntypedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_1"


    // $ANTLR start "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1"
    // InternalAlf.g:7214:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 : ( ruleConnectorDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7218:1: ( ( ruleConnectorDefinition ) )
            // InternalAlf.g:7219:2: ( ruleConnectorDefinition )
            {
            // InternalAlf.g:7219:2: ( ruleConnectorDefinition )
            // InternalAlf.g:7220:3: ruleConnectorDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectorDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1"


    // $ANTLR start "rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1"
    // InternalAlf.g:7229:1: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 : ( ruleName ) ;
    public final void rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7233:1: ( ( ruleName ) )
            // InternalAlf.g:7234:2: ( ruleName )
            {
            // InternalAlf.g:7234:2: ( ruleName )
            // InternalAlf.g:7235:3: ruleName
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1"


    // $ANTLR start "rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1"
    // InternalAlf.g:7244:1: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 : ( ruleName ) ;
    public final void rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7248:1: ( ( ruleName ) )
            // InternalAlf.g:7249:2: ( ruleName )
            {
            // InternalAlf.g:7249:2: ( ruleName )
            // InternalAlf.g:7250:3: ruleName
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1"


    // $ANTLR start "rule__ClassFeatureMember__MemberElementAssignment_1_3_2"
    // InternalAlf.g:7259:1: rule__ClassFeatureMember__MemberElementAssignment_1_3_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassFeatureMember__MemberElementAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7263:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7264:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7264:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7265:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementCrossReference_1_3_2_0()); 
            // InternalAlf.g:7266:3: ( ruleQualifiedName )
            // InternalAlf.g:7267:4: ruleQualifiedName
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementQualifiedNameParserRuleCall_1_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementQualifiedNameParserRuleCall_1_3_2_0_1()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementCrossReference_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__MemberElementAssignment_1_3_2"


    // $ANTLR start "rule__AssociationDeclaration__IsAbstractAssignment_0"
    // InternalAlf.g:7278:1: rule__AssociationDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__AssociationDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7282:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:7283:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:7283:2: ( ( 'abstract' ) )
            // InternalAlf.g:7284:3: ( 'abstract' )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:7285:3: ( 'abstract' )
            // InternalAlf.g:7286:4: 'abstract'
            {
             before(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__IsAbstractAssignment_0"


    // $ANTLR start "rule__AssociationDeclaration__NameAssignment_2"
    // InternalAlf.g:7297:1: rule__AssociationDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__AssociationDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7301:1: ( ( ruleName ) )
            // InternalAlf.g:7302:2: ( ruleName )
            {
            // InternalAlf.g:7302:2: ( ruleName )
            // InternalAlf.g:7303:3: ruleName
            {
             before(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__NameAssignment_2"


    // $ANTLR start "rule__AssociationDeclaration__OwnedMembershipAssignment_3_1"
    // InternalAlf.g:7312:1: rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__AssociationDeclaration__OwnedMembershipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7316:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:7317:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:7317:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:7318:3: ruleOwnedGeneralization
            {
             before(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedGeneralization();

            state._fsp--;

             after(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__OwnedMembershipAssignment_3_1"


    // $ANTLR start "rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1"
    // InternalAlf.g:7327:1: rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7331:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:7332:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:7332:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:7333:3: ruleOwnedGeneralization
            {
             before(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedGeneralization();

            state._fsp--;

             after(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1"


    // $ANTLR start "rule__AssociationDefinition__OwnedMembershipAssignment_2"
    // InternalAlf.g:7342:1: rule__AssociationDefinition__OwnedMembershipAssignment_2 : ( rulePackagedFeatureMember ) ;
    public final void rule__AssociationDefinition__OwnedMembershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7346:1: ( ( rulePackagedFeatureMember ) )
            // InternalAlf.g:7347:2: ( rulePackagedFeatureMember )
            {
            // InternalAlf.g:7347:2: ( rulePackagedFeatureMember )
            // InternalAlf.g:7348:3: rulePackagedFeatureMember
            {
             before(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipPackagedFeatureMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePackagedFeatureMember();

            state._fsp--;

             after(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipPackagedFeatureMemberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__OwnedMembershipAssignment_2"


    // $ANTLR start "rule__AssociationDefinition__OwnedMembershipAssignment_3"
    // InternalAlf.g:7357:1: rule__AssociationDefinition__OwnedMembershipAssignment_3 : ( rulePackagedFeatureMember ) ;
    public final void rule__AssociationDefinition__OwnedMembershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7361:1: ( ( rulePackagedFeatureMember ) )
            // InternalAlf.g:7362:2: ( rulePackagedFeatureMember )
            {
            // InternalAlf.g:7362:2: ( rulePackagedFeatureMember )
            // InternalAlf.g:7363:3: rulePackagedFeatureMember
            {
             before(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipPackagedFeatureMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePackagedFeatureMember();

            state._fsp--;

             after(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipPackagedFeatureMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDefinition__OwnedMembershipAssignment_3"


    // $ANTLR start "rule__TypedFeatureDefinition__NameAssignment_0"
    // InternalAlf.g:7372:1: rule__TypedFeatureDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__TypedFeatureDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7376:1: ( ( ruleName ) )
            // InternalAlf.g:7377:2: ( ruleName )
            {
            // InternalAlf.g:7377:2: ( ruleName )
            // InternalAlf.g:7378:3: ruleName
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__NameAssignment_0"


    // $ANTLR start "rule__TypedFeatureDefinition__IsCompositeAssignment_1_1"
    // InternalAlf.g:7387:1: rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 : ( ( 'composes' ) ) ;
    public final void rule__TypedFeatureDefinition__IsCompositeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7391:1: ( ( ( 'composes' ) ) )
            // InternalAlf.g:7392:2: ( ( 'composes' ) )
            {
            // InternalAlf.g:7392:2: ( ( 'composes' ) )
            // InternalAlf.g:7393:3: ( 'composes' )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_1_0()); 
            // InternalAlf.g:7394:3: ( 'composes' )
            // InternalAlf.g:7395:4: 'composes'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_1_0()); 

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__IsCompositeAssignment_1_1"


    // $ANTLR start "rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0"
    // InternalAlf.g:7406:1: rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7410:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7411:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7411:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7412:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_2_0_0()); 
            // InternalAlf.g:7413:3: ( ruleQualifiedName )
            // InternalAlf.g:7414:4: ruleQualifiedName
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_1_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_1_2_0_0_1()); 

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0"


    // $ANTLR start "rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3"
    // InternalAlf.g:7425:1: rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7429:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:7430:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:7430:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:7431:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3"


    // $ANTLR start "rule__TypedFeatureDefinition__LowerAssignment_2_1_0"
    // InternalAlf.g:7440:1: rule__TypedFeatureDefinition__LowerAssignment_2_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__TypedFeatureDefinition__LowerAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7444:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:7445:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:7445:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:7446:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__LowerAssignment_2_1_0"


    // $ANTLR start "rule__TypedFeatureDefinition__UpperAssignment_2_2"
    // InternalAlf.g:7455:1: rule__TypedFeatureDefinition__UpperAssignment_2_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__TypedFeatureDefinition__UpperAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7459:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:7460:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:7460:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:7461:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__UpperAssignment_2_2"


    // $ANTLR start "rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1"
    // InternalAlf.g:7470:1: rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1 : ( ruleExpression ) ;
    public final void rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7474:1: ( ( ruleExpression ) )
            // InternalAlf.g:7475:2: ( ruleExpression )
            {
            // InternalAlf.g:7475:2: ( ruleExpression )
            // InternalAlf.g:7476:3: ruleExpression
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_3_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__ValueAssignment_3_0_0_1"


    // $ANTLR start "rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1"
    // InternalAlf.g:7485:1: rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1 : ( ruleClassMember ) ;
    public final void rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7489:1: ( ( ruleClassMember ) )
            // InternalAlf.g:7490:2: ( ruleClassMember )
            {
            // InternalAlf.g:7490:2: ( ruleClassMember )
            // InternalAlf.g:7491:3: ruleClassMember
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__OwnedMembershipAssignment_3_1_1"


    // $ANTLR start "rule__UntypedFeatureDefinition__NameAssignment_0"
    // InternalAlf.g:7500:1: rule__UntypedFeatureDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__UntypedFeatureDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7504:1: ( ( ruleName ) )
            // InternalAlf.g:7505:2: ( ruleName )
            {
            // InternalAlf.g:7505:2: ( ruleName )
            // InternalAlf.g:7506:3: ruleName
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__NameAssignment_0"


    // $ANTLR start "rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1"
    // InternalAlf.g:7515:1: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7519:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:7520:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:7520:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:7521:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1"


    // $ANTLR start "rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0"
    // InternalAlf.g:7530:1: rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7534:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:7535:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:7535:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:7536:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0"


    // $ANTLR start "rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2"
    // InternalAlf.g:7545:1: rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7549:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:7550:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:7550:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:7551:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2"


    // $ANTLR start "rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1"
    // InternalAlf.g:7560:1: rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 : ( ruleExpression ) ;
    public final void rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7564:1: ( ( ruleExpression ) )
            // InternalAlf.g:7565:2: ( ruleExpression )
            {
            // InternalAlf.g:7565:2: ( ruleExpression )
            // InternalAlf.g:7566:3: ruleExpression
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_0_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_0_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1"


    // $ANTLR start "rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1"
    // InternalAlf.g:7575:1: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 : ( ruleClassMember ) ;
    public final void rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7579:1: ( ( ruleClassMember ) )
            // InternalAlf.g:7580:2: ( ruleClassMember )
            {
            // InternalAlf.g:7580:2: ( ruleClassMember )
            // InternalAlf.g:7581:3: ruleClassMember
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1"


    // $ANTLR start "rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0"
    // InternalAlf.g:7590:1: rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7594:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:7595:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:7595:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:7596:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0"


    // $ANTLR start "rule__UntypedFeatureDefinition__UpperAssignment_2_1_2"
    // InternalAlf.g:7605:1: rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__UntypedFeatureDefinition__UpperAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7609:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:7610:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:7610:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:7611:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__UpperAssignment_2_1_2"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1"
    // InternalAlf.g:7620:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 : ( ruleRedefinition ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7624:1: ( ( ruleRedefinition ) )
            // InternalAlf.g:7625:2: ( ruleRedefinition )
            {
            // InternalAlf.g:7625:2: ( ruleRedefinition )
            // InternalAlf.g:7626:3: ruleRedefinition
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementRedefinitionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRedefinition();

            state._fsp--;

             after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementRedefinitionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1"
    // InternalAlf.g:7635:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 : ( ruleSubset ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7639:1: ( ( ruleSubset ) )
            // InternalAlf.g:7640:2: ( ruleSubset )
            {
            // InternalAlf.g:7640:2: ( ruleSubset )
            // InternalAlf.g:7641:3: ruleSubset
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementSubsetParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubset();

            state._fsp--;

             after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementSubsetParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1"


    // $ANTLR start "rule__Redefinition__RedefinedFeatureAssignment"
    // InternalAlf.g:7650:1: rule__Redefinition__RedefinedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Redefinition__RedefinedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7654:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7655:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7655:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7656:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:7657:3: ( ruleQualifiedName )
            // InternalAlf.g:7658:4: ruleQualifiedName
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redefinition__RedefinedFeatureAssignment"


    // $ANTLR start "rule__Subset__SubsettedFeatureAssignment"
    // InternalAlf.g:7669:1: rule__Subset__SubsettedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Subset__SubsettedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7673:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7674:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7674:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7675:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:7676:3: ( ruleQualifiedName )
            // InternalAlf.g:7677:4: ruleQualifiedName
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subset__SubsettedFeatureAssignment"


    // $ANTLR start "rule__ConnectorDefinition__NameAssignment_0_0"
    // InternalAlf.g:7688:1: rule__ConnectorDefinition__NameAssignment_0_0 : ( ruleName ) ;
    public final void rule__ConnectorDefinition__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7692:1: ( ( ruleName ) )
            // InternalAlf.g:7693:2: ( ruleName )
            {
            // InternalAlf.g:7693:2: ( ruleName )
            // InternalAlf.g:7694:3: ruleName
            {
             before(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__NameAssignment_0_0"


    // $ANTLR start "rule__ConnectorDefinition__AssociationAssignment_0_1_1"
    // InternalAlf.g:7703:1: rule__ConnectorDefinition__AssociationAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__AssociationAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7707:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7708:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7708:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7709:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0()); 
            // InternalAlf.g:7710:3: ( ruleQualifiedName )
            // InternalAlf.g:7711:4: ruleQualifiedName
            {
             before(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationQualifiedNameParserRuleCall_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationQualifiedNameParserRuleCall_0_1_1_0_1()); 

            }

             after(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__AssociationAssignment_0_1_1"


    // $ANTLR start "rule__ConnectorDefinition__SourceFeatureAssignment_1"
    // InternalAlf.g:7722:1: rule__ConnectorDefinition__SourceFeatureAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__SourceFeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7726:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7727:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7727:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7728:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0()); 
            // InternalAlf.g:7729:3: ( ruleQualifiedName )
            // InternalAlf.g:7730:4: ruleQualifiedName
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__SourceFeatureAssignment_1"


    // $ANTLR start "rule__ConnectorDefinition__TargetFeatureAssignment_3"
    // InternalAlf.g:7741:1: rule__ConnectorDefinition__TargetFeatureAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__TargetFeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7745:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7746:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7746:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7747:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0()); 
            // InternalAlf.g:7748:3: ( ruleQualifiedName )
            // InternalAlf.g:7749:4: ruleQualifiedName
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__TargetFeatureAssignment_3"


    // $ANTLR start "rule__BinaryExpression__OperatorAssignment_1_1_0_0"
    // InternalAlf.g:7760:1: rule__BinaryExpression__OperatorAssignment_1_1_0_0 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7764:1: ( ( ruleBinaryOperator ) )
            // InternalAlf.g:7765:2: ( ruleBinaryOperator )
            {
            // InternalAlf.g:7765:2: ( ruleBinaryOperator )
            // InternalAlf.g:7766:3: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OperatorAssignment_1_1_0_0"


    // $ANTLR start "rule__BinaryExpression__OperandAssignment_1_1_0_1"
    // InternalAlf.g:7775:1: rule__BinaryExpression__OperandAssignment_1_1_0_1 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7779:1: ( ( ruleExpression ) )
            // InternalAlf.g:7780:2: ( ruleExpression )
            {
            // InternalAlf.g:7780:2: ( ruleExpression )
            // InternalAlf.g:7781:3: ruleExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OperandAssignment_1_1_0_1"


    // $ANTLR start "rule__BinaryExpression__OperatorAssignment_1_1_1_0"
    // InternalAlf.g:7790:1: rule__BinaryExpression__OperatorAssignment_1_1_1_0 : ( ( '@' ) ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7794:1: ( ( ( '@' ) ) )
            // InternalAlf.g:7795:2: ( ( '@' ) )
            {
            // InternalAlf.g:7795:2: ( ( '@' ) )
            // InternalAlf.g:7796:3: ( '@' )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 
            // InternalAlf.g:7797:3: ( '@' )
            // InternalAlf.g:7798:4: '@'
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 

            }

             after(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OperatorAssignment_1_1_1_0"


    // $ANTLR start "rule__BinaryExpression__OperandAssignment_1_1_1_2"
    // InternalAlf.g:7809:1: rule__BinaryExpression__OperandAssignment_1_1_1_2 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7813:1: ( ( ruleExpression ) )
            // InternalAlf.g:7814:2: ( ruleExpression )
            {
            // InternalAlf.g:7814:2: ( ruleExpression )
            // InternalAlf.g:7815:3: ruleExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OperandAssignment_1_1_1_2"


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_1_1"
    // InternalAlf.g:7824:1: rule__UnaryExpression__OperatorAssignment_1_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7828:1: ( ( ruleUnaryOperator ) )
            // InternalAlf.g:7829:2: ( ruleUnaryOperator )
            {
            // InternalAlf.g:7829:2: ( ruleUnaryOperator )
            // InternalAlf.g:7830:3: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__UnaryExpression__OperandAssignment_1_2"
    // InternalAlf.g:7839:1: rule__UnaryExpression__OperandAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7843:1: ( ( rulePrimaryExpression ) )
            // InternalAlf.g:7844:2: ( rulePrimaryExpression )
            {
            // InternalAlf.g:7844:2: ( rulePrimaryExpression )
            // InternalAlf.g:7845:3: rulePrimaryExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__ElementReferenceExpression__ReferentAssignment"
    // InternalAlf.g:7854:1: rule__ElementReferenceExpression__ReferentAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementReferenceExpression__ReferentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7858:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7859:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7859:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7860:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0()); 
            // InternalAlf.g:7861:3: ( ruleQualifiedName )
            // InternalAlf.g:7862:4: ruleQualifiedName
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentElementQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getElementReferenceExpressionAccess().getReferentElementQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementReferenceExpression__ReferentAssignment"


    // $ANTLR start "rule__InstanceCreationExpression__ClassAssignment_0"
    // InternalAlf.g:7873:1: rule__InstanceCreationExpression__ClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InstanceCreationExpression__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7877:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7878:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7878:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7879:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0()); 
            // InternalAlf.g:7880:3: ( ruleQualifiedName )
            // InternalAlf.g:7881:4: ruleQualifiedName
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassClassQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInstanceCreationExpressionAccess().getClassClassQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__ClassAssignment_0"


    // $ANTLR start "rule__InstanceCreationExpression__ArgumentAssignment_2_0"
    // InternalAlf.g:7892:1: rule__InstanceCreationExpression__ArgumentAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7896:1: ( ( ruleExpression ) )
            // InternalAlf.g:7897:2: ( ruleExpression )
            {
            // InternalAlf.g:7897:2: ( ruleExpression )
            // InternalAlf.g:7898:3: ruleExpression
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__ArgumentAssignment_2_0"


    // $ANTLR start "rule__InstanceCreationExpression__ArgumentAssignment_2_1_1"
    // InternalAlf.g:7907:1: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7911:1: ( ( ruleExpression ) )
            // InternalAlf.g:7912:2: ( ruleExpression )
            {
            // InternalAlf.g:7912:2: ( ruleExpression )
            // InternalAlf.g:7913:3: ruleExpression
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceCreationExpression__ArgumentAssignment_2_1_1"


    // $ANTLR start "rule__SequenceConstructionExpression__ElementAssignment_2_0"
    // InternalAlf.g:7922:1: rule__SequenceConstructionExpression__ElementAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7926:1: ( ( ruleExpression ) )
            // InternalAlf.g:7927:2: ( ruleExpression )
            {
            // InternalAlf.g:7927:2: ( ruleExpression )
            // InternalAlf.g:7928:3: ruleExpression
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__ElementAssignment_2_0"


    // $ANTLR start "rule__SequenceConstructionExpression__ElementAssignment_2_1_1"
    // InternalAlf.g:7937:1: rule__SequenceConstructionExpression__ElementAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7941:1: ( ( ruleExpression ) )
            // InternalAlf.g:7942:2: ( ruleExpression )
            {
            // InternalAlf.g:7942:2: ( ruleExpression )
            // InternalAlf.g:7943:3: ruleExpression
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceConstructionExpression__ElementAssignment_2_1_1"


    // $ANTLR start "rule__BooleanLiteralExpression__ValueAssignment"
    // InternalAlf.g:7952:1: rule__BooleanLiteralExpression__ValueAssignment : ( RULE_BOOLEAN_VALUE ) ;
    public final void rule__BooleanLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7956:1: ( ( RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:7957:2: ( RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:7957:2: ( RULE_BOOLEAN_VALUE )
            // InternalAlf.g:7958:3: RULE_BOOLEAN_VALUE
            {
             before(grammarAccess.getBooleanLiteralExpressionAccess().getValueBOOLEAN_VALUETerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN_VALUE,FOLLOW_2); 
             after(grammarAccess.getBooleanLiteralExpressionAccess().getValueBOOLEAN_VALUETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteralExpression__ValueAssignment"


    // $ANTLR start "rule__StringLiteralExpression__ValueAssignment"
    // InternalAlf.g:7967:1: rule__StringLiteralExpression__ValueAssignment : ( RULE_STRING_VALUE ) ;
    public final void rule__StringLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7971:1: ( ( RULE_STRING_VALUE ) )
            // InternalAlf.g:7972:2: ( RULE_STRING_VALUE )
            {
            // InternalAlf.g:7972:2: ( RULE_STRING_VALUE )
            // InternalAlf.g:7973:3: RULE_STRING_VALUE
            {
             before(grammarAccess.getStringLiteralExpressionAccess().getValueSTRING_VALUETerminalRuleCall_0()); 
            match(input,RULE_STRING_VALUE,FOLLOW_2); 
             after(grammarAccess.getStringLiteralExpressionAccess().getValueSTRING_VALUETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteralExpression__ValueAssignment"


    // $ANTLR start "rule__RealLiteralExpression__ValueAssignment"
    // InternalAlf.g:7982:1: rule__RealLiteralExpression__ValueAssignment : ( ruleRealValue ) ;
    public final void rule__RealLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7986:1: ( ( ruleRealValue ) )
            // InternalAlf.g:7987:2: ( ruleRealValue )
            {
            // InternalAlf.g:7987:2: ( ruleRealValue )
            // InternalAlf.g:7988:3: ruleRealValue
            {
             before(grammarAccess.getRealLiteralExpressionAccess().getValueRealValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRealValue();

            state._fsp--;

             after(grammarAccess.getRealLiteralExpressionAccess().getValueRealValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteralExpression__ValueAssignment"


    // $ANTLR start "rule__NaturalLiteralExpression__ValueAssignment"
    // InternalAlf.g:7997:1: rule__NaturalLiteralExpression__ValueAssignment : ( RULE_NATURAL_VALUE ) ;
    public final void rule__NaturalLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8001:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:8002:2: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:8002:2: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:8003:3: RULE_NATURAL_VALUE
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\17\1\4\1\uffff\2\4\2\22\1\uffff\4\22\2\4\4\45\2\4\4\45";
    static final String dfa_3s = "\1\65\1\22\1\uffff\2\22\2\45\1\uffff\4\45\2\5\4\64\2\5\4\64";
    static final String dfa_4s = "\2\uffff\1\1\4\uffff\1\2\20\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\43\uffff\1\2",
            "\1\5\1\6\14\uffff\1\7",
            "",
            "\1\10\1\11\14\uffff\1\7",
            "\1\12\1\13\14\uffff\1\7",
            "\1\7\22\uffff\1\2",
            "\1\7\22\uffff\1\2",
            "",
            "\1\14\1\2\21\uffff\1\2",
            "\1\14\1\2\21\uffff\1\2",
            "\1\15\1\2\21\uffff\1\2",
            "\1\15\1\2\21\uffff\1\2",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\2\1\uffff\1\7\1\2\13\uffff\1\22",
            "\1\2\1\uffff\1\7\1\2\13\uffff\1\22",
            "\1\2\1\uffff\1\7\1\2\13\uffff\1\23",
            "\1\2\1\uffff\1\7\1\2\13\uffff\1\23",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\2\1\uffff\1\7\1\2\13\uffff\1\22",
            "\1\2\1\uffff\1\7\1\2\13\uffff\1\22",
            "\1\2\1\uffff\1\7\1\2\13\uffff\1\23",
            "\1\2\1\uffff\1\7\1\2\13\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1226:1: rule__NonFeatureMember__Alternatives_1 : ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\2\4\4\22\1\4\3\uffff\2\45\1\4\2\45";
    static final String dfa_9s = "\1\24\1\57\2\56\2\57\1\5\3\uffff\2\64\1\5\2\64";
    static final String dfa_10s = "\7\uffff\1\2\1\1\1\3\5\uffff";
    static final String dfa_11s = "\17\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\16\uffff\1\1",
            "\1\4\1\5\14\uffff\1\6\3\uffff\1\7\30\uffff\1\7",
            "\1\11\22\uffff\1\10\1\uffff\1\10\2\uffff\2\10\2\uffff\1\10",
            "\1\11\22\uffff\1\10\1\uffff\1\10\2\uffff\2\10\2\uffff\1\10",
            "\1\6\3\uffff\1\7\16\uffff\1\10\1\uffff\1\10\2\uffff\2\10\2\uffff\1\10\1\7",
            "\1\6\3\uffff\1\7\16\uffff\1\10\1\uffff\1\10\2\uffff\2\10\2\uffff\1\10\1\7",
            "\1\12\1\13",
            "",
            "",
            "",
            "\1\7\1\uffff\1\11\3\uffff\1\7\2\uffff\1\7\5\uffff\1\14",
            "\1\7\1\uffff\1\11\3\uffff\1\7\2\uffff\1\7\5\uffff\1\14",
            "\1\15\1\16",
            "\1\7\1\uffff\1\11\3\uffff\1\7\2\uffff\1\7\5\uffff\1\14",
            "\1\7\1\uffff\1\11\3\uffff\1\7\2\uffff\1\7\5\uffff\1\14"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1274:1: rule__PackagedFeatureMember__Alternatives_1 : ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_2__0 ) ) );";
        }
    }
    static final String dfa_13s = "\26\uffff";
    static final String dfa_14s = "\2\4\1\42\2\22\1\uffff\2\22\1\4\1\uffff\3\4\2\uffff\2\45\2\22\1\4\2\45";
    static final String dfa_15s = "\1\66\1\57\1\44\2\56\1\uffff\2\57\1\5\1\uffff\3\57\2\uffff\2\64\2\57\1\5\2\64";
    static final String dfa_16s = "\5\uffff\1\3\3\uffff\1\2\3\uffff\1\1\1\4\7\uffff";
    static final String dfa_17s = "\26\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\1\4\16\uffff\1\1\24\uffff\1\5\14\uffff\1\2",
            "\1\6\1\7\14\uffff\1\10\3\uffff\1\11\30\uffff\1\11",
            "\1\12\1\13\1\14",
            "\1\16\22\uffff\1\15\1\uffff\1\15\2\uffff\2\15\2\uffff\1\15",
            "\1\16\22\uffff\1\15\1\uffff\1\15\2\uffff\2\15\2\uffff\1\15",
            "",
            "\1\10\3\uffff\1\11\16\uffff\1\15\1\uffff\1\15\2\uffff\2\15\2\uffff\1\15\1\11",
            "\1\10\3\uffff\1\11\16\uffff\1\15\1\uffff\1\15\2\uffff\2\15\2\uffff\1\15\1\11",
            "\1\17\1\20",
            "",
            "\1\21\1\22\14\uffff\1\11\3\uffff\1\11\30\uffff\1\11",
            "\1\21\1\22\14\uffff\1\11\3\uffff\1\11\30\uffff\1\11",
            "\1\21\1\22\14\uffff\1\11\3\uffff\1\11\30\uffff\1\11",
            "",
            "",
            "\1\11\1\uffff\1\16\3\uffff\1\11\2\uffff\1\11\5\uffff\1\23",
            "\1\11\1\uffff\1\16\3\uffff\1\11\2\uffff\1\11\5\uffff\1\23",
            "\1\11\3\uffff\1\11\16\uffff\1\15\1\uffff\1\15\2\uffff\2\15\2\uffff\1\15\1\11",
            "\1\11\3\uffff\1\11\16\uffff\1\15\1\uffff\1\15\2\uffff\2\15\2\uffff\1\15\1\11",
            "\1\24\1\25",
            "\1\11\1\uffff\1\16\3\uffff\1\11\2\uffff\1\11\5\uffff\1\23",
            "\1\11\1\uffff\1\16\3\uffff\1\11\2\uffff\1\11\5\uffff\1\23"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1406:1: rule__ClassFeatureMember__Alternatives_1 : ( ( ( rule__ClassFeatureMember__Group_1_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_2__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_3__0 ) ) );";
        }
    }
    static final String dfa_19s = "\13\uffff";
    static final String dfa_20s = "\2\uffff\2\10\5\uffff\2\10";
    static final String dfa_21s = "\1\4\1\uffff\2\27\2\uffff\1\4\2\uffff\2\27";
    static final String dfa_22s = "\1\64\1\uffff\2\70\2\uffff\1\5\2\uffff\2\70";
    static final String dfa_23s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\3\1\2\2\uffff";
    static final String dfa_24s = "\13\uffff}>";
    static final String[] dfa_25s = {
            "\1\2\1\3\3\1\20\uffff\1\1\13\uffff\1\4\13\uffff\1\5\1\uffff\2\1",
            "",
            "\5\10\12\uffff\3\10\3\uffff\1\10\4\uffff\1\7\1\10\1\uffff\1\6\3\uffff\1\10",
            "\5\10\12\uffff\3\10\3\uffff\1\10\4\uffff\1\7\1\10\1\uffff\1\6\3\uffff\1\10",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\5\10\12\uffff\3\10\3\uffff\1\10\4\uffff\1\7\1\10\1\uffff\1\6\3\uffff\1\10",
            "\5\10\12\uffff\3\10\3\uffff\1\10\4\uffff\1\7\1\10\1\uffff\1\6\3\uffff\1\10"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1751:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00200043C0138030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00200003C0138032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00200003C0038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00200003C0138030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000440030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00600243C0138030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00600203C0138032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00600203C0138030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040000000100030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000040030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000038000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00004CA000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0080000000200030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x001A0020038001F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000482000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x010000000F800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x001A0020020001F0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x001E0020038001F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x001A0060038001F0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000002L});

}