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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_NATURAL_VALUE", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'class'", "'assoc'", "'is'", "'specializes'", "'feature'", "'any'", "';'", "'redefines'", "'+'", "'-'", "'*'", "'/'", "'^'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'", "'{'", "'}'", "','", "'connector'", "':'", "'['", "']'", "'..'", "'='", "'subsets'", "'=>'", "'('", "')'", "'null'", "'.'", "'abstract'", "'part'", "'port'", "'composes'", "'@'"
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
    public static final int T__57=57;
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


    // $ANTLR start "entryRuleNamedFeatureDefinition"
    // InternalAlf.g:528:1: entryRuleNamedFeatureDefinition : ruleNamedFeatureDefinition EOF ;
    public final void entryRuleNamedFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:529:1: ( ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:530:1: ruleNamedFeatureDefinition EOF
            {
             before(grammarAccess.getNamedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionRule()); 
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
    // $ANTLR end "entryRuleNamedFeatureDefinition"


    // $ANTLR start "ruleNamedFeatureDefinition"
    // InternalAlf.g:537:1: ruleNamedFeatureDefinition : ( ( rule__NamedFeatureDefinition__Group__0 ) ) ;
    public final void ruleNamedFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:541:2: ( ( ( rule__NamedFeatureDefinition__Group__0 ) ) )
            // InternalAlf.g:542:2: ( ( rule__NamedFeatureDefinition__Group__0 ) )
            {
            // InternalAlf.g:542:2: ( ( rule__NamedFeatureDefinition__Group__0 ) )
            // InternalAlf.g:543:3: ( rule__NamedFeatureDefinition__Group__0 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup()); 
            // InternalAlf.g:544:3: ( rule__NamedFeatureDefinition__Group__0 )
            // InternalAlf.g:544:4: rule__NamedFeatureDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedFeatureDefinition"


    // $ANTLR start "entryRuleUnnamedFeatureDefinition"
    // InternalAlf.g:553:1: entryRuleUnnamedFeatureDefinition : ruleUnnamedFeatureDefinition EOF ;
    public final void entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:554:1: ( ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:555:1: ruleUnnamedFeatureDefinition EOF
            {
             before(grammarAccess.getUnnamedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnnamedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionRule()); 
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
    // $ANTLR end "entryRuleUnnamedFeatureDefinition"


    // $ANTLR start "ruleUnnamedFeatureDefinition"
    // InternalAlf.g:562:1: ruleUnnamedFeatureDefinition : ( ( rule__UnnamedFeatureDefinition__Group__0 ) ) ;
    public final void ruleUnnamedFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:566:2: ( ( ( rule__UnnamedFeatureDefinition__Group__0 ) ) )
            // InternalAlf.g:567:2: ( ( rule__UnnamedFeatureDefinition__Group__0 ) )
            {
            // InternalAlf.g:567:2: ( ( rule__UnnamedFeatureDefinition__Group__0 ) )
            // InternalAlf.g:568:3: ( rule__UnnamedFeatureDefinition__Group__0 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup()); 
            // InternalAlf.g:569:3: ( rule__UnnamedFeatureDefinition__Group__0 )
            // InternalAlf.g:569:4: rule__UnnamedFeatureDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnnamedFeatureDefinition"


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


    // $ANTLR start "entryRuleSequenceAccessExpression"
    // InternalAlf.g:803:1: entryRuleSequenceAccessExpression : ruleSequenceAccessExpression EOF ;
    public final void entryRuleSequenceAccessExpression() throws RecognitionException {
        try {
            // InternalAlf.g:804:1: ( ruleSequenceAccessExpression EOF )
            // InternalAlf.g:805:1: ruleSequenceAccessExpression EOF
            {
             before(grammarAccess.getSequenceAccessExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceAccessExpression();

            state._fsp--;

             after(grammarAccess.getSequenceAccessExpressionRule()); 
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
    // $ANTLR end "entryRuleSequenceAccessExpression"


    // $ANTLR start "ruleSequenceAccessExpression"
    // InternalAlf.g:812:1: ruleSequenceAccessExpression : ( ( rule__SequenceAccessExpression__Group__0 ) ) ;
    public final void ruleSequenceAccessExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:816:2: ( ( ( rule__SequenceAccessExpression__Group__0 ) ) )
            // InternalAlf.g:817:2: ( ( rule__SequenceAccessExpression__Group__0 ) )
            {
            // InternalAlf.g:817:2: ( ( rule__SequenceAccessExpression__Group__0 ) )
            // InternalAlf.g:818:3: ( rule__SequenceAccessExpression__Group__0 )
            {
             before(grammarAccess.getSequenceAccessExpressionAccess().getGroup()); 
            // InternalAlf.g:819:3: ( rule__SequenceAccessExpression__Group__0 )
            // InternalAlf.g:819:4: rule__SequenceAccessExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceAccessExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccessExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceAccessExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalAlf.g:828:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:829:1: ( rulePrimaryExpression EOF )
            // InternalAlf.g:830:1: rulePrimaryExpression EOF
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
    // InternalAlf.g:837:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:841:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalAlf.g:842:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalAlf.g:842:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalAlf.g:843:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalAlf.g:844:3: ( rule__PrimaryExpression__Alternatives )
            // InternalAlf.g:844:4: rule__PrimaryExpression__Alternatives
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
    // InternalAlf.g:853:1: entryRuleElementReferenceExpression : ruleElementReferenceExpression EOF ;
    public final void entryRuleElementReferenceExpression() throws RecognitionException {
        try {
            // InternalAlf.g:854:1: ( ruleElementReferenceExpression EOF )
            // InternalAlf.g:855:1: ruleElementReferenceExpression EOF
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
    // InternalAlf.g:862:1: ruleElementReferenceExpression : ( ( rule__ElementReferenceExpression__ReferentAssignment ) ) ;
    public final void ruleElementReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:866:2: ( ( ( rule__ElementReferenceExpression__ReferentAssignment ) ) )
            // InternalAlf.g:867:2: ( ( rule__ElementReferenceExpression__ReferentAssignment ) )
            {
            // InternalAlf.g:867:2: ( ( rule__ElementReferenceExpression__ReferentAssignment ) )
            // InternalAlf.g:868:3: ( rule__ElementReferenceExpression__ReferentAssignment )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentAssignment()); 
            // InternalAlf.g:869:3: ( rule__ElementReferenceExpression__ReferentAssignment )
            // InternalAlf.g:869:4: rule__ElementReferenceExpression__ReferentAssignment
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
    // InternalAlf.g:878:1: entryRuleInstanceCreationExpression : ruleInstanceCreationExpression EOF ;
    public final void entryRuleInstanceCreationExpression() throws RecognitionException {
        try {
            // InternalAlf.g:879:1: ( ruleInstanceCreationExpression EOF )
            // InternalAlf.g:880:1: ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:887:1: ruleInstanceCreationExpression : ( ( rule__InstanceCreationExpression__Group__0 ) ) ;
    public final void ruleInstanceCreationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:891:2: ( ( ( rule__InstanceCreationExpression__Group__0 ) ) )
            // InternalAlf.g:892:2: ( ( rule__InstanceCreationExpression__Group__0 ) )
            {
            // InternalAlf.g:892:2: ( ( rule__InstanceCreationExpression__Group__0 ) )
            // InternalAlf.g:893:3: ( rule__InstanceCreationExpression__Group__0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup()); 
            // InternalAlf.g:894:3: ( rule__InstanceCreationExpression__Group__0 )
            // InternalAlf.g:894:4: rule__InstanceCreationExpression__Group__0
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
    // InternalAlf.g:903:1: entryRuleSequenceConstructionExpression : ruleSequenceConstructionExpression EOF ;
    public final void entryRuleSequenceConstructionExpression() throws RecognitionException {
        try {
            // InternalAlf.g:904:1: ( ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:905:1: ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:912:1: ruleSequenceConstructionExpression : ( ( rule__SequenceConstructionExpression__Group__0 ) ) ;
    public final void ruleSequenceConstructionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:916:2: ( ( ( rule__SequenceConstructionExpression__Group__0 ) ) )
            // InternalAlf.g:917:2: ( ( rule__SequenceConstructionExpression__Group__0 ) )
            {
            // InternalAlf.g:917:2: ( ( rule__SequenceConstructionExpression__Group__0 ) )
            // InternalAlf.g:918:3: ( rule__SequenceConstructionExpression__Group__0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup()); 
            // InternalAlf.g:919:3: ( rule__SequenceConstructionExpression__Group__0 )
            // InternalAlf.g:919:4: rule__SequenceConstructionExpression__Group__0
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
    // InternalAlf.g:928:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:929:1: ( ruleLiteralExpression EOF )
            // InternalAlf.g:930:1: ruleLiteralExpression EOF
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
    // InternalAlf.g:937:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:941:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalAlf.g:942:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:942:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalAlf.g:943:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:944:3: ( rule__LiteralExpression__Alternatives )
            // InternalAlf.g:944:4: rule__LiteralExpression__Alternatives
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
    // InternalAlf.g:953:1: entryRuleNullLiteralExpression : ruleNullLiteralExpression EOF ;
    public final void entryRuleNullLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:954:1: ( ruleNullLiteralExpression EOF )
            // InternalAlf.g:955:1: ruleNullLiteralExpression EOF
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
    // InternalAlf.g:962:1: ruleNullLiteralExpression : ( ( rule__NullLiteralExpression__Group__0 ) ) ;
    public final void ruleNullLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:966:2: ( ( ( rule__NullLiteralExpression__Group__0 ) ) )
            // InternalAlf.g:967:2: ( ( rule__NullLiteralExpression__Group__0 ) )
            {
            // InternalAlf.g:967:2: ( ( rule__NullLiteralExpression__Group__0 ) )
            // InternalAlf.g:968:3: ( rule__NullLiteralExpression__Group__0 )
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getGroup()); 
            // InternalAlf.g:969:3: ( rule__NullLiteralExpression__Group__0 )
            // InternalAlf.g:969:4: rule__NullLiteralExpression__Group__0
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
    // InternalAlf.g:978:1: entryRuleBooleanLiteralExpression : ruleBooleanLiteralExpression EOF ;
    public final void entryRuleBooleanLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:979:1: ( ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:980:1: ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:987:1: ruleBooleanLiteralExpression : ( ( rule__BooleanLiteralExpression__ValueAssignment ) ) ;
    public final void ruleBooleanLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:991:2: ( ( ( rule__BooleanLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:992:2: ( ( rule__BooleanLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:992:2: ( ( rule__BooleanLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:993:3: ( rule__BooleanLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:994:3: ( rule__BooleanLiteralExpression__ValueAssignment )
            // InternalAlf.g:994:4: rule__BooleanLiteralExpression__ValueAssignment
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
    // InternalAlf.g:1003:1: entryRuleStringLiteralExpression : ruleStringLiteralExpression EOF ;
    public final void entryRuleStringLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:1004:1: ( ruleStringLiteralExpression EOF )
            // InternalAlf.g:1005:1: ruleStringLiteralExpression EOF
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
    // InternalAlf.g:1012:1: ruleStringLiteralExpression : ( ( rule__StringLiteralExpression__ValueAssignment ) ) ;
    public final void ruleStringLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1016:2: ( ( ( rule__StringLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:1017:2: ( ( rule__StringLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:1017:2: ( ( rule__StringLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:1018:3: ( rule__StringLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:1019:3: ( rule__StringLiteralExpression__ValueAssignment )
            // InternalAlf.g:1019:4: rule__StringLiteralExpression__ValueAssignment
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
    // InternalAlf.g:1028:1: entryRuleRealLiteralExpression : ruleRealLiteralExpression EOF ;
    public final void entryRuleRealLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:1029:1: ( ruleRealLiteralExpression EOF )
            // InternalAlf.g:1030:1: ruleRealLiteralExpression EOF
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
    // InternalAlf.g:1037:1: ruleRealLiteralExpression : ( ( rule__RealLiteralExpression__ValueAssignment ) ) ;
    public final void ruleRealLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1041:2: ( ( ( rule__RealLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:1042:2: ( ( rule__RealLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:1042:2: ( ( rule__RealLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:1043:3: ( rule__RealLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getRealLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:1044:3: ( rule__RealLiteralExpression__ValueAssignment )
            // InternalAlf.g:1044:4: rule__RealLiteralExpression__ValueAssignment
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
    // InternalAlf.g:1053:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalAlf.g:1054:1: ( ruleRealValue EOF )
            // InternalAlf.g:1055:1: ruleRealValue EOF
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
    // InternalAlf.g:1062:1: ruleRealValue : ( ( rule__RealValue__Group__0 ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1066:2: ( ( ( rule__RealValue__Group__0 ) ) )
            // InternalAlf.g:1067:2: ( ( rule__RealValue__Group__0 ) )
            {
            // InternalAlf.g:1067:2: ( ( rule__RealValue__Group__0 ) )
            // InternalAlf.g:1068:3: ( rule__RealValue__Group__0 )
            {
             before(grammarAccess.getRealValueAccess().getGroup()); 
            // InternalAlf.g:1069:3: ( rule__RealValue__Group__0 )
            // InternalAlf.g:1069:4: rule__RealValue__Group__0
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
    // InternalAlf.g:1078:1: entryRuleNaturalLiteralExpression : ruleNaturalLiteralExpression EOF ;
    public final void entryRuleNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:1079:1: ( ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:1080:1: ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:1087:1: ruleNaturalLiteralExpression : ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) ;
    public final void ruleNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1091:2: ( ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:1092:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:1092:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:1093:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getNaturalLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:1094:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            // InternalAlf.g:1094:4: rule__NaturalLiteralExpression__ValueAssignment
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
    // InternalAlf.g:1103:1: entryRuleUnlimitedNaturalLiteralExpression : ruleUnlimitedNaturalLiteralExpression EOF ;
    public final void entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:1104:1: ( ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:1105:1: ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:1112:1: ruleUnlimitedNaturalLiteralExpression : ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) ;
    public final void ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1116:2: ( ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) )
            // InternalAlf.g:1117:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:1117:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            // InternalAlf.g:1118:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:1119:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            // InternalAlf.g:1119:4: rule__UnlimitedNaturalLiteralExpression__Alternatives
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
    // InternalAlf.g:1128:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalAlf.g:1129:1: ( ruleName EOF )
            // InternalAlf.g:1130:1: ruleName EOF
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
    // InternalAlf.g:1137:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1141:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalAlf.g:1142:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalAlf.g:1142:2: ( ( rule__Name__Alternatives ) )
            // InternalAlf.g:1143:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalAlf.g:1144:3: ( rule__Name__Alternatives )
            // InternalAlf.g:1144:4: rule__Name__Alternatives
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
    // InternalAlf.g:1153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAlf.g:1154:1: ( ruleQualifiedName EOF )
            // InternalAlf.g:1155:1: ruleQualifiedName EOF
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
    // InternalAlf.g:1162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAlf.g:1167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAlf.g:1167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAlf.g:1168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAlf.g:1169:3: ( rule__QualifiedName__Group__0 )
            // InternalAlf.g:1169:4: rule__QualifiedName__Group__0
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
    // InternalAlf.g:1178:1: ruleVisibilityIndicator : ( ( rule__VisibilityIndicator__Alternatives ) ) ;
    public final void ruleVisibilityIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1182:1: ( ( ( rule__VisibilityIndicator__Alternatives ) ) )
            // InternalAlf.g:1183:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            {
            // InternalAlf.g:1183:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            // InternalAlf.g:1184:3: ( rule__VisibilityIndicator__Alternatives )
            {
             before(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            // InternalAlf.g:1185:3: ( rule__VisibilityIndicator__Alternatives )
            // InternalAlf.g:1185:4: rule__VisibilityIndicator__Alternatives
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
    // InternalAlf.g:1194:1: ruleFeatureDirection : ( ( rule__FeatureDirection__Alternatives ) ) ;
    public final void ruleFeatureDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1198:1: ( ( ( rule__FeatureDirection__Alternatives ) ) )
            // InternalAlf.g:1199:2: ( ( rule__FeatureDirection__Alternatives ) )
            {
            // InternalAlf.g:1199:2: ( ( rule__FeatureDirection__Alternatives ) )
            // InternalAlf.g:1200:3: ( rule__FeatureDirection__Alternatives )
            {
             before(grammarAccess.getFeatureDirectionAccess().getAlternatives()); 
            // InternalAlf.g:1201:3: ( rule__FeatureDirection__Alternatives )
            // InternalAlf.g:1201:4: rule__FeatureDirection__Alternatives
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
    // InternalAlf.g:1209:1: rule__UnitDefinition__Alternatives : ( ( rulePackageDefinition ) | ( ruleClassDefinition ) );
    public final void rule__UnitDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1213:1: ( ( rulePackageDefinition ) | ( ruleClassDefinition ) )
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
                    // InternalAlf.g:1214:2: ( rulePackageDefinition )
                    {
                    // InternalAlf.g:1214:2: ( rulePackageDefinition )
                    // InternalAlf.g:1215:3: rulePackageDefinition
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
                    // InternalAlf.g:1220:2: ( ruleClassDefinition )
                    {
                    // InternalAlf.g:1220:2: ( ruleClassDefinition )
                    // InternalAlf.g:1221:3: ruleClassDefinition
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
    // InternalAlf.g:1230:1: rule__PackageMember__Alternatives : ( ( ruleNonFeatureMember ) | ( rulePackagedFeatureMember ) );
    public final void rule__PackageMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1234:1: ( ( ruleNonFeatureMember ) | ( rulePackagedFeatureMember ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=RULE_ID && LA2_1<=RULE_UNRESTRICTED_NAME)||LA2_1==20) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=15 && LA2_1<=17)||LA2_1==53) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 32:
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
            case 33:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=RULE_ID && LA2_3<=RULE_UNRESTRICTED_NAME)||LA2_3==20) ) {
                    alt2=2;
                }
                else if ( ((LA2_3>=15 && LA2_3<=17)||LA2_3==53) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
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
                    // InternalAlf.g:1235:2: ( ruleNonFeatureMember )
                    {
                    // InternalAlf.g:1235:2: ( ruleNonFeatureMember )
                    // InternalAlf.g:1236:3: ruleNonFeatureMember
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
                    // InternalAlf.g:1241:2: ( rulePackagedFeatureMember )
                    {
                    // InternalAlf.g:1241:2: ( rulePackagedFeatureMember )
                    // InternalAlf.g:1242:3: rulePackagedFeatureMember
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
    // InternalAlf.g:1251:1: rule__NonFeatureMember__Alternatives_1 : ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) );
    public final void rule__NonFeatureMember__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1255:1: ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAlf.g:1256:2: ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) )
                    {
                    // InternalAlf.g:1256:2: ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) )
                    // InternalAlf.g:1257:3: ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 )
                    {
                     before(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementAssignment_1_0()); 
                    // InternalAlf.g:1258:3: ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 )
                    // InternalAlf.g:1258:4: rule__NonFeatureMember__OwnedMemberElementAssignment_1_0
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
                    // InternalAlf.g:1262:2: ( ( rule__NonFeatureMember__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1262:2: ( ( rule__NonFeatureMember__Group_1_1__0 ) )
                    // InternalAlf.g:1263:3: ( rule__NonFeatureMember__Group_1_1__0 )
                    {
                     before(grammarAccess.getNonFeatureMemberAccess().getGroup_1_1()); 
                    // InternalAlf.g:1264:3: ( rule__NonFeatureMember__Group_1_1__0 )
                    // InternalAlf.g:1264:4: rule__NonFeatureMember__Group_1_1__0
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
    // InternalAlf.g:1272:1: rule__NonFeatureMemberKind__Alternatives : ( ( 'package' ) | ( 'class' ) | ( 'assoc' ) );
    public final void rule__NonFeatureMemberKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1276:1: ( ( 'package' ) | ( 'class' ) | ( 'assoc' ) )
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
                    // InternalAlf.g:1277:2: ( 'package' )
                    {
                    // InternalAlf.g:1277:2: ( 'package' )
                    // InternalAlf.g:1278:3: 'package'
                    {
                     before(grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1283:2: ( 'class' )
                    {
                    // InternalAlf.g:1283:2: ( 'class' )
                    // InternalAlf.g:1284:3: 'class'
                    {
                     before(grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1289:2: ( 'assoc' )
                    {
                    // InternalAlf.g:1289:2: ( 'assoc' )
                    // InternalAlf.g:1290:3: 'assoc'
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
    // InternalAlf.g:1299:1: rule__PackagedFeatureMember__Alternatives_1 : ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_2__0 ) ) );
    public final void rule__PackagedFeatureMember__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1303:1: ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_2__0 ) ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:1304:2: ( ( rule__PackagedFeatureMember__Group_1_0__0 ) )
                    {
                    // InternalAlf.g:1304:2: ( ( rule__PackagedFeatureMember__Group_1_0__0 ) )
                    // InternalAlf.g:1305:3: ( rule__PackagedFeatureMember__Group_1_0__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_0()); 
                    // InternalAlf.g:1306:3: ( rule__PackagedFeatureMember__Group_1_0__0 )
                    // InternalAlf.g:1306:4: rule__PackagedFeatureMember__Group_1_0__0
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
                    // InternalAlf.g:1310:2: ( ( rule__PackagedFeatureMember__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1310:2: ( ( rule__PackagedFeatureMember__Group_1_1__0 ) )
                    // InternalAlf.g:1311:3: ( rule__PackagedFeatureMember__Group_1_1__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_1()); 
                    // InternalAlf.g:1312:3: ( rule__PackagedFeatureMember__Group_1_1__0 )
                    // InternalAlf.g:1312:4: rule__PackagedFeatureMember__Group_1_1__0
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
                    // InternalAlf.g:1316:2: ( ( rule__PackagedFeatureMember__Group_1_2__0 ) )
                    {
                    // InternalAlf.g:1316:2: ( ( rule__PackagedFeatureMember__Group_1_2__0 ) )
                    // InternalAlf.g:1317:3: ( rule__PackagedFeatureMember__Group_1_2__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_2()); 
                    // InternalAlf.g:1318:3: ( rule__PackagedFeatureMember__Group_1_2__0 )
                    // InternalAlf.g:1318:4: rule__PackagedFeatureMember__Group_1_2__0
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
    // InternalAlf.g:1326:1: rule__PackagedFeatureMember__Alternatives_1_2_0 : ( ( ( rule__PackagedFeatureMember__Group_1_2_0_0__0 ) ) | ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 ) ) );
    public final void rule__PackagedFeatureMember__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1330:1: ( ( ( rule__PackagedFeatureMember__Group_1_2_0_0__0 ) ) | ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 ) ) )
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
                    // InternalAlf.g:1331:2: ( ( rule__PackagedFeatureMember__Group_1_2_0_0__0 ) )
                    {
                    // InternalAlf.g:1331:2: ( ( rule__PackagedFeatureMember__Group_1_2_0_0__0 ) )
                    // InternalAlf.g:1332:3: ( rule__PackagedFeatureMember__Group_1_2_0_0__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_2_0_0()); 
                    // InternalAlf.g:1333:3: ( rule__PackagedFeatureMember__Group_1_2_0_0__0 )
                    // InternalAlf.g:1333:4: rule__PackagedFeatureMember__Group_1_2_0_0__0
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
                    // InternalAlf.g:1337:2: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 ) )
                    {
                    // InternalAlf.g:1337:2: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 ) )
                    // InternalAlf.g:1338:3: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_2_0_1()); 
                    // InternalAlf.g:1339:3: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 )
                    // InternalAlf.g:1339:4: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1
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
    // InternalAlf.g:1347:1: rule__NonFeatureDefinition__Alternatives : ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) );
    public final void rule__NonFeatureDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1351:1: ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) )
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
                    // InternalAlf.g:1352:2: ( rulePackageDefinitionOrStub )
                    {
                    // InternalAlf.g:1352:2: ( rulePackageDefinitionOrStub )
                    // InternalAlf.g:1353:3: rulePackageDefinitionOrStub
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
                    // InternalAlf.g:1358:2: ( ruleClassifierDefinitionOrStub )
                    {
                    // InternalAlf.g:1358:2: ( ruleClassifierDefinitionOrStub )
                    // InternalAlf.g:1359:3: ruleClassifierDefinitionOrStub
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
    // InternalAlf.g:1368:1: rule__ClassifierDefinitionOrStub__Alternatives : ( ( ruleClassDefinitionOrStub ) | ( ruleAssociationDefinitionOrStub ) );
    public final void rule__ClassifierDefinitionOrStub__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1372:1: ( ( ruleClassDefinitionOrStub ) | ( ruleAssociationDefinitionOrStub ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==17) ) {
                    alt8=2;
                }
                else if ( (LA8_1==16) ) {
                    alt8=1;
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
                    // InternalAlf.g:1373:2: ( ruleClassDefinitionOrStub )
                    {
                    // InternalAlf.g:1373:2: ( ruleClassDefinitionOrStub )
                    // InternalAlf.g:1374:3: ruleClassDefinitionOrStub
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
                    // InternalAlf.g:1379:2: ( ruleAssociationDefinitionOrStub )
                    {
                    // InternalAlf.g:1379:2: ( ruleAssociationDefinitionOrStub )
                    // InternalAlf.g:1380:3: ruleAssociationDefinitionOrStub
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
    // InternalAlf.g:1389:1: rule__ClassDeclaration__Alternatives_3_0 : ( ( 'is' ) | ( 'specializes' ) );
    public final void rule__ClassDeclaration__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1393:1: ( ( 'is' ) | ( 'specializes' ) )
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
                    // InternalAlf.g:1394:2: ( 'is' )
                    {
                    // InternalAlf.g:1394:2: ( 'is' )
                    // InternalAlf.g:1395:3: 'is'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1400:2: ( 'specializes' )
                    {
                    // InternalAlf.g:1400:2: ( 'specializes' )
                    // InternalAlf.g:1401:3: 'specializes'
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
    // InternalAlf.g:1410:1: rule__ClassMember__Alternatives : ( ( ruleNonFeatureMember ) | ( ruleClassFeatureMember ) );
    public final void rule__ClassMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1414:1: ( ( ruleNonFeatureMember ) | ( ruleClassFeatureMember ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=15 && LA10_1<=17)||LA10_1==53) ) {
                    alt10=1;
                }
                else if ( ((LA10_1>=RULE_ID && LA10_1<=RULE_UNRESTRICTED_NAME)||LA10_1==20||(LA10_1>=35 && LA10_1<=37)||LA10_1==41||(LA10_1>=54 && LA10_1<=55)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=15 && LA10_2<=17)||LA10_2==53) ) {
                    alt10=1;
                }
                else if ( ((LA10_2>=RULE_ID && LA10_2<=RULE_UNRESTRICTED_NAME)||LA10_2==20||(LA10_2>=35 && LA10_2<=37)||LA10_2==41||(LA10_2>=54 && LA10_2<=55)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA10_3 = input.LA(2);

                if ( ((LA10_3>=15 && LA10_3<=17)||LA10_3==53) ) {
                    alt10=1;
                }
                else if ( ((LA10_3>=RULE_ID && LA10_3<=RULE_UNRESTRICTED_NAME)||LA10_3==20||(LA10_3>=35 && LA10_3<=37)||LA10_3==41||(LA10_3>=54 && LA10_3<=55)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA10_4 = input.LA(2);

                if ( ((LA10_4>=15 && LA10_4<=17)||LA10_4==53) ) {
                    alt10=1;
                }
                else if ( ((LA10_4>=RULE_ID && LA10_4<=RULE_UNRESTRICTED_NAME)||LA10_4==20||(LA10_4>=35 && LA10_4<=37)||LA10_4==41||(LA10_4>=54 && LA10_4<=55)) ) {
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
            case 35:
            case 36:
            case 37:
            case 41:
            case 54:
            case 55:
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
                    // InternalAlf.g:1415:2: ( ruleNonFeatureMember )
                    {
                    // InternalAlf.g:1415:2: ( ruleNonFeatureMember )
                    // InternalAlf.g:1416:3: ruleNonFeatureMember
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
                    // InternalAlf.g:1421:2: ( ruleClassFeatureMember )
                    {
                    // InternalAlf.g:1421:2: ( ruleClassFeatureMember )
                    // InternalAlf.g:1422:3: ruleClassFeatureMember
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
    // InternalAlf.g:1431:1: rule__ClassFeatureMember__Alternatives_1 : ( ( ( rule__ClassFeatureMember__Group_1_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_2__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_3__0 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1435:1: ( ( ( rule__ClassFeatureMember__Group_1_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_2__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_3__0 ) ) )
            int alt11=4;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:1436:2: ( ( rule__ClassFeatureMember__Group_1_0__0 ) )
                    {
                    // InternalAlf.g:1436:2: ( ( rule__ClassFeatureMember__Group_1_0__0 ) )
                    // InternalAlf.g:1437:3: ( rule__ClassFeatureMember__Group_1_0__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_0()); 
                    // InternalAlf.g:1438:3: ( rule__ClassFeatureMember__Group_1_0__0 )
                    // InternalAlf.g:1438:4: rule__ClassFeatureMember__Group_1_0__0
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
                    // InternalAlf.g:1442:2: ( ( rule__ClassFeatureMember__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1442:2: ( ( rule__ClassFeatureMember__Group_1_1__0 ) )
                    // InternalAlf.g:1443:3: ( rule__ClassFeatureMember__Group_1_1__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_1()); 
                    // InternalAlf.g:1444:3: ( rule__ClassFeatureMember__Group_1_1__0 )
                    // InternalAlf.g:1444:4: rule__ClassFeatureMember__Group_1_1__0
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
                    // InternalAlf.g:1448:2: ( ( rule__ClassFeatureMember__Group_1_2__0 ) )
                    {
                    // InternalAlf.g:1448:2: ( ( rule__ClassFeatureMember__Group_1_2__0 ) )
                    // InternalAlf.g:1449:3: ( rule__ClassFeatureMember__Group_1_2__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_2()); 
                    // InternalAlf.g:1450:3: ( rule__ClassFeatureMember__Group_1_2__0 )
                    // InternalAlf.g:1450:4: rule__ClassFeatureMember__Group_1_2__0
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
                    // InternalAlf.g:1454:2: ( ( rule__ClassFeatureMember__Group_1_3__0 ) )
                    {
                    // InternalAlf.g:1454:2: ( ( rule__ClassFeatureMember__Group_1_3__0 ) )
                    // InternalAlf.g:1455:3: ( rule__ClassFeatureMember__Group_1_3__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_3()); 
                    // InternalAlf.g:1456:3: ( rule__ClassFeatureMember__Group_1_3__0 )
                    // InternalAlf.g:1456:4: rule__ClassFeatureMember__Group_1_3__0
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
    // InternalAlf.g:1464:1: rule__ClassFeatureMember__Alternatives_1_0_0 : ( ( 'feature' ) | ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1 ) ) | ( ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_2 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1468:1: ( ( 'feature' ) | ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1 ) ) | ( ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 54:
                {
                alt12=2;
                }
                break;
            case 55:
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
                    // InternalAlf.g:1469:2: ( 'feature' )
                    {
                    // InternalAlf.g:1469:2: ( 'feature' )
                    // InternalAlf.g:1470:3: 'feature'
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_0_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1475:2: ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1 ) )
                    {
                    // InternalAlf.g:1475:2: ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1 ) )
                    // InternalAlf.g:1476:3: ( rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getIsCompositeAssignment_1_0_0_1()); 
                    // InternalAlf.g:1477:3: ( rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1 )
                    // InternalAlf.g:1477:4: rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getIsCompositeAssignment_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1481:2: ( ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_2 ) )
                    {
                    // InternalAlf.g:1481:2: ( ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_2 ) )
                    // InternalAlf.g:1482:3: ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_2 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_1_0_0_2()); 
                    // InternalAlf.g:1483:3: ( rule__ClassFeatureMember__IsPortAssignment_1_0_0_2 )
                    // InternalAlf.g:1483:4: rule__ClassFeatureMember__IsPortAssignment_1_0_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__IsPortAssignment_1_0_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_1_0_0_2()); 

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
    // InternalAlf.g:1491:1: rule__ClassFeatureMember__Alternatives_1_1_0 : ( ( 'feature' ) | ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1 ) ) | ( ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_2 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1495:1: ( ( 'feature' ) | ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1 ) ) | ( ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_2 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 54:
                {
                alt13=2;
                }
                break;
            case 55:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAlf.g:1496:2: ( 'feature' )
                    {
                    // InternalAlf.g:1496:2: ( 'feature' )
                    // InternalAlf.g:1497:3: 'feature'
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1502:2: ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1 ) )
                    {
                    // InternalAlf.g:1502:2: ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1 ) )
                    // InternalAlf.g:1503:3: ( rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getIsCompositeAssignment_1_1_0_1()); 
                    // InternalAlf.g:1504:3: ( rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1 )
                    // InternalAlf.g:1504:4: rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getIsCompositeAssignment_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1508:2: ( ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_2 ) )
                    {
                    // InternalAlf.g:1508:2: ( ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_2 ) )
                    // InternalAlf.g:1509:3: ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_2 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_1_1_0_2()); 
                    // InternalAlf.g:1510:3: ( rule__ClassFeatureMember__IsPortAssignment_1_1_0_2 )
                    // InternalAlf.g:1510:4: rule__ClassFeatureMember__IsPortAssignment_1_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__IsPortAssignment_1_1_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_1_1_0_2()); 

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
    // InternalAlf.g:1518:1: rule__ClassFeatureMember__Alternatives_1_3_0 : ( ( ( rule__ClassFeatureMember__Group_1_3_0_0__0 ) ) | ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1522:1: ( ( ( rule__ClassFeatureMember__Group_1_3_0_0__0 ) ) | ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20||LA14_0==54) ) {
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
                    // InternalAlf.g:1523:2: ( ( rule__ClassFeatureMember__Group_1_3_0_0__0 ) )
                    {
                    // InternalAlf.g:1523:2: ( ( rule__ClassFeatureMember__Group_1_3_0_0__0 ) )
                    // InternalAlf.g:1524:3: ( rule__ClassFeatureMember__Group_1_3_0_0__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1_3_0_0()); 
                    // InternalAlf.g:1525:3: ( rule__ClassFeatureMember__Group_1_3_0_0__0 )
                    // InternalAlf.g:1525:4: rule__ClassFeatureMember__Group_1_3_0_0__0
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
                    // InternalAlf.g:1529:2: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 ) )
                    {
                    // InternalAlf.g:1529:2: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 ) )
                    // InternalAlf.g:1530:3: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_1_3_0_1()); 
                    // InternalAlf.g:1531:3: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 )
                    // InternalAlf.g:1531:4: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1
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


    // $ANTLR start "rule__ClassFeatureMember__Alternatives_1_3_0_0_0"
    // InternalAlf.g:1539:1: rule__ClassFeatureMember__Alternatives_1_3_0_0_0 : ( ( 'feature' ) | ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_1_3_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1543:1: ( ( 'feature' ) | ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==54) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:1544:2: ( 'feature' )
                    {
                    // InternalAlf.g:1544:2: ( 'feature' )
                    // InternalAlf.g:1545:3: 'feature'
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_3_0_0_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_3_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1550:2: ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1 ) )
                    {
                    // InternalAlf.g:1550:2: ( ( rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1 ) )
                    // InternalAlf.g:1551:3: ( rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getIsCompositeAssignment_1_3_0_0_0_1()); 
                    // InternalAlf.g:1552:3: ( rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1 )
                    // InternalAlf.g:1552:4: rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getIsCompositeAssignment_1_3_0_0_0_1()); 

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
    // $ANTLR end "rule__ClassFeatureMember__Alternatives_1_3_0_0_0"


    // $ANTLR start "rule__AssociationDeclaration__Alternatives_3_0"
    // InternalAlf.g:1560:1: rule__AssociationDeclaration__Alternatives_3_0 : ( ( 'is' ) | ( 'specializes' ) );
    public final void rule__AssociationDeclaration__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1564:1: ( ( 'is' ) | ( 'specializes' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            else if ( (LA16_0==19) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlf.g:1565:2: ( 'is' )
                    {
                    // InternalAlf.g:1565:2: ( 'is' )
                    // InternalAlf.g:1566:3: 'is'
                    {
                     before(grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1571:2: ( 'specializes' )
                    {
                    // InternalAlf.g:1571:2: ( 'specializes' )
                    // InternalAlf.g:1572:3: 'specializes'
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


    // $ANTLR start "rule__NamedFeatureDefinition__Alternatives_1"
    // InternalAlf.g:1581:1: rule__NamedFeatureDefinition__Alternatives_1 : ( ( ( rule__NamedFeatureDefinition__Group_1_0__0 ) ) | ( ( rule__NamedFeatureDefinition__Group_1_1__0 ) ) );
    public final void rule__NamedFeatureDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1585:1: ( ( ( rule__NamedFeatureDefinition__Group_1_0__0 ) ) | ( ( rule__NamedFeatureDefinition__Group_1_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22||LA17_0==38||(LA17_0>=42 && LA17_0<=43)||LA17_0==46) ) {
                alt17=1;
            }
            else if ( (LA17_0==18||LA17_0==23||LA17_0==47) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlf.g:1586:2: ( ( rule__NamedFeatureDefinition__Group_1_0__0 ) )
                    {
                    // InternalAlf.g:1586:2: ( ( rule__NamedFeatureDefinition__Group_1_0__0 ) )
                    // InternalAlf.g:1587:3: ( rule__NamedFeatureDefinition__Group_1_0__0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0()); 
                    // InternalAlf.g:1588:3: ( rule__NamedFeatureDefinition__Group_1_0__0 )
                    // InternalAlf.g:1588:4: rule__NamedFeatureDefinition__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1592:2: ( ( rule__NamedFeatureDefinition__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1592:2: ( ( rule__NamedFeatureDefinition__Group_1_1__0 ) )
                    // InternalAlf.g:1593:3: ( rule__NamedFeatureDefinition__Group_1_1__0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1()); 
                    // InternalAlf.g:1594:3: ( rule__NamedFeatureDefinition__Group_1_1__0 )
                    // InternalAlf.g:1594:4: rule__NamedFeatureDefinition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__NamedFeatureDefinition__Alternatives_1"


    // $ANTLR start "rule__NamedFeatureDefinition__Alternatives_1_0_0_2"
    // InternalAlf.g:1602:1: rule__NamedFeatureDefinition__Alternatives_1_0_0_2 : ( ( ( rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0 ) ) | ( 'any' ) );
    public final void rule__NamedFeatureDefinition__Alternatives_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1606:1: ( ( ( rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0 ) ) | ( 'any' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt18=1;
            }
            else if ( (LA18_0==21) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:1607:2: ( ( rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0 ) )
                    {
                    // InternalAlf.g:1607:2: ( ( rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0 ) )
                    // InternalAlf.g:1608:3: ( rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeAssignment_1_0_0_2_0()); 
                    // InternalAlf.g:1609:3: ( rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0 )
                    // InternalAlf.g:1609:4: rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeAssignment_1_0_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1613:2: ( 'any' )
                    {
                    // InternalAlf.g:1613:2: ( 'any' )
                    // InternalAlf.g:1614:3: 'any'
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getAnyKeyword_1_0_0_2_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getNamedFeatureDefinitionAccess().getAnyKeyword_1_0_0_2_1()); 

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
    // $ANTLR end "rule__NamedFeatureDefinition__Alternatives_1_0_0_2"


    // $ANTLR start "rule__NamedFeatureDefinition__Alternatives_1_0_3"
    // InternalAlf.g:1623:1: rule__NamedFeatureDefinition__Alternatives_1_0_3 : ( ( ';' ) | ( ( rule__NamedFeatureDefinition__Group_1_0_3_1__0 ) ) );
    public final void rule__NamedFeatureDefinition__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1627:1: ( ( ';' ) | ( ( rule__NamedFeatureDefinition__Group_1_0_3_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAlf.g:1628:2: ( ';' )
                    {
                    // InternalAlf.g:1628:2: ( ';' )
                    // InternalAlf.g:1629:3: ';'
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1634:2: ( ( rule__NamedFeatureDefinition__Group_1_0_3_1__0 ) )
                    {
                    // InternalAlf.g:1634:2: ( ( rule__NamedFeatureDefinition__Group_1_0_3_1__0 ) )
                    // InternalAlf.g:1635:3: ( rule__NamedFeatureDefinition__Group_1_0_3_1__0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_3_1()); 
                    // InternalAlf.g:1636:3: ( rule__NamedFeatureDefinition__Group_1_0_3_1__0 )
                    // InternalAlf.g:1636:4: rule__NamedFeatureDefinition__Group_1_0_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_0_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_3_1()); 

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
    // $ANTLR end "rule__NamedFeatureDefinition__Alternatives_1_0_3"


    // $ANTLR start "rule__NamedFeatureDefinition__Alternatives_1_1_1"
    // InternalAlf.g:1644:1: rule__NamedFeatureDefinition__Alternatives_1_1_1 : ( ( ( rule__NamedFeatureDefinition__Group_1_1_1_0__0 ) ) | ( ( rule__NamedFeatureDefinition__Group_1_1_1_1__0 ) ) );
    public final void rule__NamedFeatureDefinition__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1648:1: ( ( ( rule__NamedFeatureDefinition__Group_1_1_1_0__0 ) ) | ( ( rule__NamedFeatureDefinition__Group_1_1_1_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_NATURAL_VALUE) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==45) ) {
                        int LA20_5 = input.LA(4);

                        if ( (LA20_5==RULE_NATURAL_VALUE) ) {
                            int LA20_7 = input.LA(5);

                            if ( (LA20_7==44) ) {
                                int LA20_6 = input.LA(6);

                                if ( (LA20_6==38||LA20_6==46) ) {
                                    alt20=1;
                                }
                                else if ( (LA20_6==22) ) {
                                    alt20=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 20, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA20_5==26) ) {
                            int LA20_4 = input.LA(5);

                            if ( (LA20_4==44) ) {
                                int LA20_6 = input.LA(6);

                                if ( (LA20_6==38||LA20_6==46) ) {
                                    alt20=1;
                                }
                                else if ( (LA20_6==22) ) {
                                    alt20=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 20, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA20_3==44) ) {
                        int LA20_6 = input.LA(4);

                        if ( (LA20_6==38||LA20_6==46) ) {
                            alt20=1;
                        }
                        else if ( (LA20_6==22) ) {
                            alt20=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_1==26) ) {
                    int LA20_4 = input.LA(3);

                    if ( (LA20_4==44) ) {
                        int LA20_6 = input.LA(4);

                        if ( (LA20_6==38||LA20_6==46) ) {
                            alt20=1;
                        }
                        else if ( (LA20_6==22) ) {
                            alt20=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==38||LA20_0==46) ) {
                alt20=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlf.g:1649:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0__0 ) )
                    {
                    // InternalAlf.g:1649:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0__0 ) )
                    // InternalAlf.g:1650:3: ( rule__NamedFeatureDefinition__Group_1_1_1_0__0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0()); 
                    // InternalAlf.g:1651:3: ( rule__NamedFeatureDefinition__Group_1_1_1_0__0 )
                    // InternalAlf.g:1651:4: rule__NamedFeatureDefinition__Group_1_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1655:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_1__0 ) )
                    {
                    // InternalAlf.g:1655:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_1__0 ) )
                    // InternalAlf.g:1656:3: ( rule__NamedFeatureDefinition__Group_1_1_1_1__0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_1()); 
                    // InternalAlf.g:1657:3: ( rule__NamedFeatureDefinition__Group_1_1_1_1__0 )
                    // InternalAlf.g:1657:4: rule__NamedFeatureDefinition__Group_1_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_1()); 

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
    // $ANTLR end "rule__NamedFeatureDefinition__Alternatives_1_1_1"


    // $ANTLR start "rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1"
    // InternalAlf.g:1665:1: rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1 : ( ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0 ) ) | ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0 ) ) );
    public final void rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1669:1: ( ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0 ) ) | ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:1670:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0 ) )
                    {
                    // InternalAlf.g:1670:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0 ) )
                    // InternalAlf.g:1671:3: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_1_0()); 
                    // InternalAlf.g:1672:3: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0 )
                    // InternalAlf.g:1672:4: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1676:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0 ) )
                    {
                    // InternalAlf.g:1676:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0 ) )
                    // InternalAlf.g:1677:3: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_1_1()); 
                    // InternalAlf.g:1678:3: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0 )
                    // InternalAlf.g:1678:4: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_1_1()); 

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
    // $ANTLR end "rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1"


    // $ANTLR start "rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2"
    // InternalAlf.g:1686:1: rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2 : ( ( ';' ) | ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0 ) ) );
    public final void rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1690:1: ( ( ';' ) | ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            else if ( (LA22_0==38) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1691:2: ( ';' )
                    {
                    // InternalAlf.g:1691:2: ( ';' )
                    // InternalAlf.g:1692:3: ';'
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_0_1_0_2_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_0_1_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1697:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0 ) )
                    {
                    // InternalAlf.g:1697:2: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0 ) )
                    // InternalAlf.g:1698:3: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0 )
                    {
                     before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_1_0_2_1()); 
                    // InternalAlf.g:1699:3: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0 )
                    // InternalAlf.g:1699:4: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_1_0_2_1()); 

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
    // $ANTLR end "rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Alternatives_1"
    // InternalAlf.g:1707:1: rule__UnnamedFeatureDefinition__Alternatives_1 : ( ( ( rule__UnnamedFeatureDefinition__Group_1_0__0 ) ) | ( ( rule__UnnamedFeatureDefinition__Group_1_1__0 ) ) );
    public final void rule__UnnamedFeatureDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1711:1: ( ( ( rule__UnnamedFeatureDefinition__Group_1_0__0 ) ) | ( ( rule__UnnamedFeatureDefinition__Group_1_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_NATURAL_VALUE) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==44) ) {
                        int LA23_5 = input.LA(4);

                        if ( (LA23_5==22) ) {
                            alt23=2;
                        }
                        else if ( (LA23_5==38||LA23_5==46) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA23_3==45) ) {
                        int LA23_6 = input.LA(4);

                        if ( (LA23_6==RULE_NATURAL_VALUE) ) {
                            int LA23_8 = input.LA(5);

                            if ( (LA23_8==44) ) {
                                int LA23_5 = input.LA(6);

                                if ( (LA23_5==22) ) {
                                    alt23=2;
                                }
                                else if ( (LA23_5==38||LA23_5==46) ) {
                                    alt23=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 23, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA23_6==26) ) {
                            int LA23_4 = input.LA(5);

                            if ( (LA23_4==44) ) {
                                int LA23_5 = input.LA(6);

                                if ( (LA23_5==22) ) {
                                    alt23=2;
                                }
                                else if ( (LA23_5==38||LA23_5==46) ) {
                                    alt23=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 23, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA23_1==26) ) {
                    int LA23_4 = input.LA(3);

                    if ( (LA23_4==44) ) {
                        int LA23_5 = input.LA(4);

                        if ( (LA23_5==22) ) {
                            alt23=2;
                        }
                        else if ( (LA23_5==38||LA23_5==46) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==38||LA23_0==46) ) {
                alt23=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAlf.g:1712:2: ( ( rule__UnnamedFeatureDefinition__Group_1_0__0 ) )
                    {
                    // InternalAlf.g:1712:2: ( ( rule__UnnamedFeatureDefinition__Group_1_0__0 ) )
                    // InternalAlf.g:1713:3: ( rule__UnnamedFeatureDefinition__Group_1_0__0 )
                    {
                     before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0()); 
                    // InternalAlf.g:1714:3: ( rule__UnnamedFeatureDefinition__Group_1_0__0 )
                    // InternalAlf.g:1714:4: rule__UnnamedFeatureDefinition__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnnamedFeatureDefinition__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1718:2: ( ( rule__UnnamedFeatureDefinition__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1718:2: ( ( rule__UnnamedFeatureDefinition__Group_1_1__0 ) )
                    // InternalAlf.g:1719:3: ( rule__UnnamedFeatureDefinition__Group_1_1__0 )
                    {
                     before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_1()); 
                    // InternalAlf.g:1720:3: ( rule__UnnamedFeatureDefinition__Group_1_1__0 )
                    // InternalAlf.g:1720:4: rule__UnnamedFeatureDefinition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnnamedFeatureDefinition__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__UnnamedFeatureDefinition__Alternatives_1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Alternatives_1_0_1"
    // InternalAlf.g:1728:1: rule__UnnamedFeatureDefinition__Alternatives_1_0_1 : ( ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__0 ) ) | ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__0 ) ) );
    public final void rule__UnnamedFeatureDefinition__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1732:1: ( ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__0 ) ) | ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            else if ( (LA24_0==38) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1733:2: ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__0 ) )
                    {
                    // InternalAlf.g:1733:2: ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__0 ) )
                    // InternalAlf.g:1734:3: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__0 )
                    {
                     before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_1_0()); 
                    // InternalAlf.g:1735:3: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__0 )
                    // InternalAlf.g:1735:4: rule__UnnamedFeatureDefinition__Group_1_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnnamedFeatureDefinition__Group_1_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1739:2: ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__0 ) )
                    {
                    // InternalAlf.g:1739:2: ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__0 ) )
                    // InternalAlf.g:1740:3: ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__0 )
                    {
                     before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_1_1()); 
                    // InternalAlf.g:1741:3: ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__0 )
                    // InternalAlf.g:1741:4: rule__UnnamedFeatureDefinition__Group_1_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnnamedFeatureDefinition__Group_1_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_1_1()); 

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
    // $ANTLR end "rule__UnnamedFeatureDefinition__Alternatives_1_0_1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2"
    // InternalAlf.g:1749:1: rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2 : ( ( ';' ) | ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0 ) ) );
    public final void rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1753:1: ( ( ';' ) | ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            else if ( (LA25_0==38) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:1754:2: ( ';' )
                    {
                    // InternalAlf.g:1754:2: ( ';' )
                    // InternalAlf.g:1755:3: ';'
                    {
                     before(grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_1_0_2_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_1_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1760:2: ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0 ) )
                    {
                    // InternalAlf.g:1760:2: ( ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0 ) )
                    // InternalAlf.g:1761:3: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0 )
                    {
                     before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_1_0_2_1()); 
                    // InternalAlf.g:1762:3: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0 )
                    // InternalAlf.g:1762:4: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_1_0_2_1()); 

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
    // $ANTLR end "rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Alternatives"
    // InternalAlf.g:1770:1: rule__OwnedRedefinitionOrSubset__Alternatives : ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1774:1: ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18||LA26_0==23) ) {
                alt26=1;
            }
            else if ( (LA26_0==47) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1775:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    {
                    // InternalAlf.g:1775:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    // InternalAlf.g:1776:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_0()); 
                    // InternalAlf.g:1777:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    // InternalAlf.g:1777:4: rule__OwnedRedefinitionOrSubset__Group_0__0
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
                    // InternalAlf.g:1781:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    {
                    // InternalAlf.g:1781:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    // InternalAlf.g:1782:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_1()); 
                    // InternalAlf.g:1783:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    // InternalAlf.g:1783:4: rule__OwnedRedefinitionOrSubset__Group_1__0
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
    // InternalAlf.g:1791:1: rule__OwnedRedefinitionOrSubset__Alternatives_0_0 : ( ( 'is' ) | ( 'redefines' ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1795:1: ( ( 'is' ) | ( 'redefines' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            else if ( (LA27_0==23) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1796:2: ( 'is' )
                    {
                    // InternalAlf.g:1796:2: ( 'is' )
                    // InternalAlf.g:1797:3: 'is'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1802:2: ( 'redefines' )
                    {
                    // InternalAlf.g:1802:2: ( 'redefines' )
                    // InternalAlf.g:1803:3: 'redefines'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalAlf.g:1812:1: rule__BinaryExpression__Alternatives_1_1 : ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) );
    public final void rule__BinaryExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1816:1: ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=24 && LA28_0<=28)) ) {
                alt28=1;
            }
            else if ( (LA28_0==57) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1817:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    {
                    // InternalAlf.g:1817:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    // InternalAlf.g:1818:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_0()); 
                    // InternalAlf.g:1819:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    // InternalAlf.g:1819:4: rule__BinaryExpression__Group_1_1_0__0
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
                    // InternalAlf.g:1823:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    {
                    // InternalAlf.g:1823:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    // InternalAlf.g:1824:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_1()); 
                    // InternalAlf.g:1825:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    // InternalAlf.g:1825:4: rule__BinaryExpression__Group_1_1_1__0
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
    // InternalAlf.g:1833:1: rule__BinaryOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1837:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt29=1;
                }
                break;
            case 25:
                {
                alt29=2;
                }
                break;
            case 26:
                {
                alt29=3;
                }
                break;
            case 27:
                {
                alt29=4;
                }
                break;
            case 28:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1838:2: ( '+' )
                    {
                    // InternalAlf.g:1838:2: ( '+' )
                    // InternalAlf.g:1839:3: '+'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1844:2: ( '-' )
                    {
                    // InternalAlf.g:1844:2: ( '-' )
                    // InternalAlf.g:1845:3: '-'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1850:2: ( '*' )
                    {
                    // InternalAlf.g:1850:2: ( '*' )
                    // InternalAlf.g:1851:3: '*'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1856:2: ( '/' )
                    {
                    // InternalAlf.g:1856:2: ( '/' )
                    // InternalAlf.g:1857:3: '/'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1862:2: ( '^' )
                    {
                    // InternalAlf.g:1862:2: ( '^' )
                    // InternalAlf.g:1863:3: '^'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_4()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalAlf.g:1872:1: rule__UnaryExpression__Alternatives : ( ( ruleSequenceAccessExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1876:1: ( ( ruleSequenceAccessExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING_VALUE)||LA30_0==26||LA30_0==38||LA30_0==49||(LA30_0>=51 && LA30_0<=52)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=24 && LA30_0<=25)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1877:2: ( ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:1877:2: ( ruleSequenceAccessExpression )
                    // InternalAlf.g:1878:3: ruleSequenceAccessExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getSequenceAccessExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceAccessExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getSequenceAccessExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1883:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1883:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // InternalAlf.g:1884:3: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1885:3: ( rule__UnaryExpression__Group_1__0 )
                    // InternalAlf.g:1885:4: rule__UnaryExpression__Group_1__0
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
    // InternalAlf.g:1893:1: rule__UnaryOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1897:1: ( ( '+' ) | ( '-' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
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
                    // InternalAlf.g:1898:2: ( '+' )
                    {
                    // InternalAlf.g:1898:2: ( '+' )
                    // InternalAlf.g:1899:3: '+'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1904:2: ( '-' )
                    {
                    // InternalAlf.g:1904:2: ( '-' )
                    // InternalAlf.g:1905:3: '-'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalAlf.g:1914:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1918:1: ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) )
            int alt32=5;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1919:2: ( ruleLiteralExpression )
                    {
                    // InternalAlf.g:1919:2: ( ruleLiteralExpression )
                    // InternalAlf.g:1920:3: ruleLiteralExpression
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
                    // InternalAlf.g:1925:2: ( ruleElementReferenceExpression )
                    {
                    // InternalAlf.g:1925:2: ( ruleElementReferenceExpression )
                    // InternalAlf.g:1926:3: ruleElementReferenceExpression
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
                    // InternalAlf.g:1931:2: ( ruleInstanceCreationExpression )
                    {
                    // InternalAlf.g:1931:2: ( ruleInstanceCreationExpression )
                    // InternalAlf.g:1932:3: ruleInstanceCreationExpression
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
                    // InternalAlf.g:1937:2: ( ruleSequenceConstructionExpression )
                    {
                    // InternalAlf.g:1937:2: ( ruleSequenceConstructionExpression )
                    // InternalAlf.g:1938:3: ruleSequenceConstructionExpression
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
                    // InternalAlf.g:1943:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalAlf.g:1943:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalAlf.g:1944:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalAlf.g:1945:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalAlf.g:1945:4: rule__PrimaryExpression__Group_4__0
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
    // InternalAlf.g:1953:1: rule__LiteralExpression__Alternatives : ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1957:1: ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt33=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt33=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt33=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA33_4 = input.LA(2);

                if ( (LA33_4==52) ) {
                    alt33=4;
                }
                else if ( (LA33_4==EOF||LA33_4==22||(LA33_4>=24 && LA33_4<=28)||(LA33_4>=38 && LA33_4<=40)||(LA33_4>=43 && LA33_4<=44)||LA33_4==50||LA33_4==57) ) {
                    alt33=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt33=4;
                }
                break;
            case 26:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1958:2: ( ruleNullLiteralExpression )
                    {
                    // InternalAlf.g:1958:2: ( ruleNullLiteralExpression )
                    // InternalAlf.g:1959:3: ruleNullLiteralExpression
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
                    // InternalAlf.g:1964:2: ( ruleBooleanLiteralExpression )
                    {
                    // InternalAlf.g:1964:2: ( ruleBooleanLiteralExpression )
                    // InternalAlf.g:1965:3: ruleBooleanLiteralExpression
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
                    // InternalAlf.g:1970:2: ( ruleStringLiteralExpression )
                    {
                    // InternalAlf.g:1970:2: ( ruleStringLiteralExpression )
                    // InternalAlf.g:1971:3: ruleStringLiteralExpression
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
                    // InternalAlf.g:1976:2: ( ruleRealLiteralExpression )
                    {
                    // InternalAlf.g:1976:2: ( ruleRealLiteralExpression )
                    // InternalAlf.g:1977:3: ruleRealLiteralExpression
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
                    // InternalAlf.g:1982:2: ( ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1982:2: ( ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1983:3: ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:1992:1: rule__RealValue__Alternatives_0 : ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) );
    public final void rule__RealValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1996:1: ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_NATURAL_VALUE) ) {
                alt34=1;
            }
            else if ( (LA34_0==52) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlf.g:1997:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    {
                    // InternalAlf.g:1997:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    // InternalAlf.g:1998:3: ( rule__RealValue__Group_0_0__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_0()); 
                    // InternalAlf.g:1999:3: ( rule__RealValue__Group_0_0__0 )
                    // InternalAlf.g:1999:4: rule__RealValue__Group_0_0__0
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
                    // InternalAlf.g:2003:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    {
                    // InternalAlf.g:2003:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    // InternalAlf.g:2004:3: ( rule__RealValue__Group_0_1__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_1()); 
                    // InternalAlf.g:2005:3: ( rule__RealValue__Group_0_1__0 )
                    // InternalAlf.g:2005:4: rule__RealValue__Group_0_1__0
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
    // InternalAlf.g:2013:1: rule__RealValue__Alternatives_1_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__RealValue__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2017:1: ( ( 'e' ) | ( 'E' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            else if ( (LA35_0==30) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlf.g:2018:2: ( 'e' )
                    {
                    // InternalAlf.g:2018:2: ( 'e' )
                    // InternalAlf.g:2019:3: 'e'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2024:2: ( 'E' )
                    {
                    // InternalAlf.g:2024:2: ( 'E' )
                    // InternalAlf.g:2025:3: 'E'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_1()); 
                    match(input,30,FOLLOW_2); 
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
    // InternalAlf.g:2034:1: rule__RealValue__Alternatives_1_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__RealValue__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2038:1: ( ( '+' ) | ( '-' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            else if ( (LA36_0==25) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:2039:2: ( '+' )
                    {
                    // InternalAlf.g:2039:2: ( '+' )
                    // InternalAlf.g:2040:3: '+'
                    {
                     before(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2045:2: ( '-' )
                    {
                    // InternalAlf.g:2045:2: ( '-' )
                    // InternalAlf.g:2046:3: '-'
                    {
                     before(grammarAccess.getRealValueAccess().getHyphenMinusKeyword_1_1_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalAlf.g:2055:1: rule__UnlimitedNaturalLiteralExpression__Alternatives : ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) );
    public final void rule__UnlimitedNaturalLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2059:1: ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_NATURAL_VALUE) ) {
                alt37=1;
            }
            else if ( (LA37_0==26) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlf.g:2060:2: ( ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:2060:2: ( ruleNaturalLiteralExpression )
                    // InternalAlf.g:2061:3: ruleNaturalLiteralExpression
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
                    // InternalAlf.g:2066:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:2066:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    // InternalAlf.g:2067:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:2068:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    // InternalAlf.g:2068:4: rule__UnlimitedNaturalLiteralExpression__Group_1__0
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
    // InternalAlf.g:2076:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2080:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_UNRESTRICTED_NAME) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:2081:2: ( RULE_ID )
                    {
                    // InternalAlf.g:2081:2: ( RULE_ID )
                    // InternalAlf.g:2082:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2087:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:2087:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:2088:3: RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:2097:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2101:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt39=1;
                }
                break;
            case 32:
                {
                alt39=2;
                }
                break;
            case 33:
                {
                alt39=3;
                }
                break;
            case 34:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAlf.g:2102:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:2102:2: ( ( 'public' ) )
                    // InternalAlf.g:2103:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:2104:3: ( 'public' )
                    // InternalAlf.g:2104:4: 'public'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2108:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:2108:2: ( ( 'private' ) )
                    // InternalAlf.g:2109:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:2110:3: ( 'private' )
                    // InternalAlf.g:2110:4: 'private'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2114:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:2114:2: ( ( 'protected' ) )
                    // InternalAlf.g:2115:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:2116:3: ( 'protected' )
                    // InternalAlf.g:2116:4: 'protected'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2120:2: ( ( 'packaged' ) )
                    {
                    // InternalAlf.g:2120:2: ( ( 'packaged' ) )
                    // InternalAlf.g:2121:3: ( 'packaged' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3()); 
                    // InternalAlf.g:2122:3: ( 'packaged' )
                    // InternalAlf.g:2122:4: 'packaged'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalAlf.g:2130:1: rule__FeatureDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) );
    public final void rule__FeatureDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2134:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt40=1;
                }
                break;
            case 36:
                {
                alt40=2;
                }
                break;
            case 37:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalAlf.g:2135:2: ( ( 'in' ) )
                    {
                    // InternalAlf.g:2135:2: ( ( 'in' ) )
                    // InternalAlf.g:2136:3: ( 'in' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:2137:3: ( 'in' )
                    // InternalAlf.g:2137:4: 'in'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2141:2: ( ( 'out' ) )
                    {
                    // InternalAlf.g:2141:2: ( ( 'out' ) )
                    // InternalAlf.g:2142:3: ( 'out' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:2143:3: ( 'out' )
                    // InternalAlf.g:2143:4: 'out'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2147:2: ( ( 'inout' ) )
                    {
                    // InternalAlf.g:2147:2: ( ( 'inout' ) )
                    // InternalAlf.g:2148:3: ( 'inout' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:2149:3: ( 'inout' )
                    // InternalAlf.g:2149:4: 'inout'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalAlf.g:2157:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2161:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:2162:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
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
    // InternalAlf.g:2169:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2173:1: ( ( 'package' ) )
            // InternalAlf.g:2174:1: ( 'package' )
            {
            // InternalAlf.g:2174:1: ( 'package' )
            // InternalAlf.g:2175:2: 'package'
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
    // InternalAlf.g:2184:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2188:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:2189:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
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
    // InternalAlf.g:2196:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2200:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:2201:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:2201:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:2202:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:2203:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:2203:3: rule__PackageDefinition__NameAssignment_1
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
    // InternalAlf.g:2211:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2215:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:2216:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
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
    // InternalAlf.g:2223:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2227:1: ( ( '{' ) )
            // InternalAlf.g:2228:1: ( '{' )
            {
            // InternalAlf.g:2228:1: ( '{' )
            // InternalAlf.g:2229:2: '{'
            {
             before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAlf.g:2238:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2242:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:2243:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
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
    // InternalAlf.g:2250:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2254:1: ( ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* ) )
            // InternalAlf.g:2255:1: ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* )
            {
            // InternalAlf.g:2255:1: ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* )
            // InternalAlf.g:2256:2: ( rule__PackageDefinition__OwnedMembershipAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipAssignment_3()); 
            // InternalAlf.g:2257:2: ( rule__PackageDefinition__OwnedMembershipAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_UNRESTRICTED_NAME)||(LA41_0>=15 && LA41_0<=17)||LA41_0==20||(LA41_0>=31 && LA41_0<=34)||LA41_0==53) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAlf.g:2257:3: rule__PackageDefinition__OwnedMembershipAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__OwnedMembershipAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalAlf.g:2265:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2269:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:2270:2: rule__PackageDefinition__Group__4__Impl
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
    // InternalAlf.g:2276:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2280:1: ( ( '}' ) )
            // InternalAlf.g:2281:1: ( '}' )
            {
            // InternalAlf.g:2281:1: ( '}' )
            // InternalAlf.g:2282:2: '}'
            {
             before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAlf.g:2292:1: rule__NonFeatureMember__Group__0 : rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1 ;
    public final void rule__NonFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2296:1: ( rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1 )
            // InternalAlf.g:2297:2: rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1
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
    // InternalAlf.g:2304:1: rule__NonFeatureMember__Group__0__Impl : ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__NonFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2308:1: ( ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:2309:1: ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:2309:1: ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:2310:2: ( rule__NonFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:2311:2: ( rule__NonFeatureMember__VisibilityAssignment_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=31 && LA42_0<=34)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:2311:3: rule__NonFeatureMember__VisibilityAssignment_0
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
    // InternalAlf.g:2319:1: rule__NonFeatureMember__Group__1 : rule__NonFeatureMember__Group__1__Impl ;
    public final void rule__NonFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2323:1: ( rule__NonFeatureMember__Group__1__Impl )
            // InternalAlf.g:2324:2: rule__NonFeatureMember__Group__1__Impl
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
    // InternalAlf.g:2330:1: rule__NonFeatureMember__Group__1__Impl : ( ( rule__NonFeatureMember__Alternatives_1 ) ) ;
    public final void rule__NonFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2334:1: ( ( ( rule__NonFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:2335:1: ( ( rule__NonFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:2335:1: ( ( rule__NonFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:2336:2: ( rule__NonFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:2337:2: ( rule__NonFeatureMember__Alternatives_1 )
            // InternalAlf.g:2337:3: rule__NonFeatureMember__Alternatives_1
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
    // InternalAlf.g:2346:1: rule__NonFeatureMember__Group_1_1__0 : rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1 ;
    public final void rule__NonFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2350:1: ( rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1 )
            // InternalAlf.g:2351:2: rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1
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
    // InternalAlf.g:2358:1: rule__NonFeatureMember__Group_1_1__0__Impl : ( ruleNonFeatureMemberKind ) ;
    public final void rule__NonFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2362:1: ( ( ruleNonFeatureMemberKind ) )
            // InternalAlf.g:2363:1: ( ruleNonFeatureMemberKind )
            {
            // InternalAlf.g:2363:1: ( ruleNonFeatureMemberKind )
            // InternalAlf.g:2364:2: ruleNonFeatureMemberKind
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
    // InternalAlf.g:2373:1: rule__NonFeatureMember__Group_1_1__1 : rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2 ;
    public final void rule__NonFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2377:1: ( rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2 )
            // InternalAlf.g:2378:2: rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2
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
    // InternalAlf.g:2385:1: rule__NonFeatureMember__Group_1_1__1__Impl : ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? ) ;
    public final void rule__NonFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2389:1: ( ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? ) )
            // InternalAlf.g:2390:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? )
            {
            // InternalAlf.g:2390:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? )
            // InternalAlf.g:2391:2: ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberNameAssignment_1_1_1()); 
            // InternalAlf.g:2392:2: ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlf.g:2392:3: rule__NonFeatureMember__MemberNameAssignment_1_1_1
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
    // InternalAlf.g:2400:1: rule__NonFeatureMember__Group_1_1__2 : rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3 ;
    public final void rule__NonFeatureMember__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2404:1: ( rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3 )
            // InternalAlf.g:2405:2: rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3
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
    // InternalAlf.g:2412:1: rule__NonFeatureMember__Group_1_1__2__Impl : ( 'is' ) ;
    public final void rule__NonFeatureMember__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2416:1: ( ( 'is' ) )
            // InternalAlf.g:2417:1: ( 'is' )
            {
            // InternalAlf.g:2417:1: ( 'is' )
            // InternalAlf.g:2418:2: 'is'
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
    // InternalAlf.g:2427:1: rule__NonFeatureMember__Group_1_1__3 : rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4 ;
    public final void rule__NonFeatureMember__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2431:1: ( rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4 )
            // InternalAlf.g:2432:2: rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4
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
    // InternalAlf.g:2439:1: rule__NonFeatureMember__Group_1_1__3__Impl : ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) ) ;
    public final void rule__NonFeatureMember__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2443:1: ( ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) ) )
            // InternalAlf.g:2444:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) )
            {
            // InternalAlf.g:2444:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) )
            // InternalAlf.g:2445:2: ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementAssignment_1_1_3()); 
            // InternalAlf.g:2446:2: ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 )
            // InternalAlf.g:2446:3: rule__NonFeatureMember__MemberElementAssignment_1_1_3
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
    // InternalAlf.g:2454:1: rule__NonFeatureMember__Group_1_1__4 : rule__NonFeatureMember__Group_1_1__4__Impl ;
    public final void rule__NonFeatureMember__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2458:1: ( rule__NonFeatureMember__Group_1_1__4__Impl )
            // InternalAlf.g:2459:2: rule__NonFeatureMember__Group_1_1__4__Impl
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
    // InternalAlf.g:2465:1: rule__NonFeatureMember__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__NonFeatureMember__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2469:1: ( ( ';' ) )
            // InternalAlf.g:2470:1: ( ';' )
            {
            // InternalAlf.g:2470:1: ( ';' )
            // InternalAlf.g:2471:2: ';'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_1_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAlf.g:2481:1: rule__PackagedFeatureMember__Group__0 : rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1 ;
    public final void rule__PackagedFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2485:1: ( rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1 )
            // InternalAlf.g:2486:2: rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1
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
    // InternalAlf.g:2493:1: rule__PackagedFeatureMember__Group__0__Impl : ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__PackagedFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2497:1: ( ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:2498:1: ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:2498:1: ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:2499:2: ( rule__PackagedFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:2500:2: ( rule__PackagedFeatureMember__VisibilityAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=31 && LA44_0<=34)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:2500:3: rule__PackagedFeatureMember__VisibilityAssignment_0
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
    // InternalAlf.g:2508:1: rule__PackagedFeatureMember__Group__1 : rule__PackagedFeatureMember__Group__1__Impl ;
    public final void rule__PackagedFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2512:1: ( rule__PackagedFeatureMember__Group__1__Impl )
            // InternalAlf.g:2513:2: rule__PackagedFeatureMember__Group__1__Impl
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
    // InternalAlf.g:2519:1: rule__PackagedFeatureMember__Group__1__Impl : ( ( rule__PackagedFeatureMember__Alternatives_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2523:1: ( ( ( rule__PackagedFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:2524:1: ( ( rule__PackagedFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:2524:1: ( ( rule__PackagedFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:2525:2: ( rule__PackagedFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:2526:2: ( rule__PackagedFeatureMember__Alternatives_1 )
            // InternalAlf.g:2526:3: rule__PackagedFeatureMember__Alternatives_1
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
    // InternalAlf.g:2535:1: rule__PackagedFeatureMember__Group_1_0__0 : rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1 ;
    public final void rule__PackagedFeatureMember__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2539:1: ( rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1 )
            // InternalAlf.g:2540:2: rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1
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
    // InternalAlf.g:2547:1: rule__PackagedFeatureMember__Group_1_0__0__Impl : ( ( 'feature' )? ) ;
    public final void rule__PackagedFeatureMember__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2551:1: ( ( ( 'feature' )? ) )
            // InternalAlf.g:2552:1: ( ( 'feature' )? )
            {
            // InternalAlf.g:2552:1: ( ( 'feature' )? )
            // InternalAlf.g:2553:2: ( 'feature' )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0()); 
            // InternalAlf.g:2554:2: ( 'feature' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlf.g:2554:3: 'feature'
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
    // InternalAlf.g:2562:1: rule__PackagedFeatureMember__Group_1_0__1 : rule__PackagedFeatureMember__Group_1_0__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2566:1: ( rule__PackagedFeatureMember__Group_1_0__1__Impl )
            // InternalAlf.g:2567:2: rule__PackagedFeatureMember__Group_1_0__1__Impl
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
    // InternalAlf.g:2573:1: rule__PackagedFeatureMember__Group_1_0__1__Impl : ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2577:1: ( ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) )
            // InternalAlf.g:2578:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            {
            // InternalAlf.g:2578:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            // InternalAlf.g:2579:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_1()); 
            // InternalAlf.g:2580:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            // InternalAlf.g:2580:3: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1
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
    // InternalAlf.g:2589:1: rule__PackagedFeatureMember__Group_1_1__0 : rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1 ;
    public final void rule__PackagedFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2593:1: ( rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1 )
            // InternalAlf.g:2594:2: rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1
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
    // InternalAlf.g:2601:1: rule__PackagedFeatureMember__Group_1_1__0__Impl : ( 'feature' ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2605:1: ( ( 'feature' ) )
            // InternalAlf.g:2606:1: ( 'feature' )
            {
            // InternalAlf.g:2606:1: ( 'feature' )
            // InternalAlf.g:2607:2: 'feature'
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
    // InternalAlf.g:2616:1: rule__PackagedFeatureMember__Group_1_1__1 : rule__PackagedFeatureMember__Group_1_1__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2620:1: ( rule__PackagedFeatureMember__Group_1_1__1__Impl )
            // InternalAlf.g:2621:2: rule__PackagedFeatureMember__Group_1_1__1__Impl
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
    // InternalAlf.g:2627:1: rule__PackagedFeatureMember__Group_1_1__1__Impl : ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2631:1: ( ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) ) )
            // InternalAlf.g:2632:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) )
            {
            // InternalAlf.g:2632:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) )
            // InternalAlf.g:2633:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_1()); 
            // InternalAlf.g:2634:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 )
            // InternalAlf.g:2634:3: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1
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
    // InternalAlf.g:2643:1: rule__PackagedFeatureMember__Group_1_2__0 : rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1 ;
    public final void rule__PackagedFeatureMember__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2647:1: ( rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1 )
            // InternalAlf.g:2648:2: rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1
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
    // InternalAlf.g:2655:1: rule__PackagedFeatureMember__Group_1_2__0__Impl : ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2659:1: ( ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) ) )
            // InternalAlf.g:2660:1: ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) )
            {
            // InternalAlf.g:2660:1: ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) )
            // InternalAlf.g:2661:2: ( rule__PackagedFeatureMember__Alternatives_1_2_0 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1_2_0()); 
            // InternalAlf.g:2662:2: ( rule__PackagedFeatureMember__Alternatives_1_2_0 )
            // InternalAlf.g:2662:3: rule__PackagedFeatureMember__Alternatives_1_2_0
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
    // InternalAlf.g:2670:1: rule__PackagedFeatureMember__Group_1_2__1 : rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2 ;
    public final void rule__PackagedFeatureMember__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2674:1: ( rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2 )
            // InternalAlf.g:2675:2: rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2
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
    // InternalAlf.g:2682:1: rule__PackagedFeatureMember__Group_1_2__1__Impl : ( 'is' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2686:1: ( ( 'is' ) )
            // InternalAlf.g:2687:1: ( 'is' )
            {
            // InternalAlf.g:2687:1: ( 'is' )
            // InternalAlf.g:2688:2: 'is'
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
    // InternalAlf.g:2697:1: rule__PackagedFeatureMember__Group_1_2__2 : rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3 ;
    public final void rule__PackagedFeatureMember__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2701:1: ( rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3 )
            // InternalAlf.g:2702:2: rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3
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
    // InternalAlf.g:2709:1: rule__PackagedFeatureMember__Group_1_2__2__Impl : ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2713:1: ( ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) ) )
            // InternalAlf.g:2714:1: ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) )
            {
            // InternalAlf.g:2714:1: ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) )
            // InternalAlf.g:2715:2: ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementAssignment_1_2_2()); 
            // InternalAlf.g:2716:2: ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 )
            // InternalAlf.g:2716:3: rule__PackagedFeatureMember__MemberElementAssignment_1_2_2
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
    // InternalAlf.g:2724:1: rule__PackagedFeatureMember__Group_1_2__3 : rule__PackagedFeatureMember__Group_1_2__3__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2728:1: ( rule__PackagedFeatureMember__Group_1_2__3__Impl )
            // InternalAlf.g:2729:2: rule__PackagedFeatureMember__Group_1_2__3__Impl
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
    // InternalAlf.g:2735:1: rule__PackagedFeatureMember__Group_1_2__3__Impl : ( ';' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2739:1: ( ( ';' ) )
            // InternalAlf.g:2740:1: ( ';' )
            {
            // InternalAlf.g:2740:1: ( ';' )
            // InternalAlf.g:2741:2: ';'
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_2_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAlf.g:2751:1: rule__PackagedFeatureMember__Group_1_2_0_0__0 : rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1 ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2755:1: ( rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1 )
            // InternalAlf.g:2756:2: rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1
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
    // InternalAlf.g:2763:1: rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl : ( 'feature' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2767:1: ( ( 'feature' ) )
            // InternalAlf.g:2768:1: ( 'feature' )
            {
            // InternalAlf.g:2768:1: ( 'feature' )
            // InternalAlf.g:2769:2: 'feature'
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
    // InternalAlf.g:2778:1: rule__PackagedFeatureMember__Group_1_2_0_0__1 : rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2782:1: ( rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl )
            // InternalAlf.g:2783:2: rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl
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
    // InternalAlf.g:2789:1: rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl : ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? ) ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2793:1: ( ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? ) )
            // InternalAlf.g:2794:1: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? )
            {
            // InternalAlf.g:2794:1: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? )
            // InternalAlf.g:2795:2: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_2_0_0_1()); 
            // InternalAlf.g:2796:2: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlf.g:2796:3: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1
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
    // InternalAlf.g:2805:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2809:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:2810:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
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
    // InternalAlf.g:2817:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2821:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:2822:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:2822:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:2823:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:2824:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:2824:3: rule__ClassDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:2832:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2836:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:2837:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalAlf.g:2844:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2848:1: ( ( 'class' ) )
            // InternalAlf.g:2849:1: ( 'class' )
            {
            // InternalAlf.g:2849:1: ( 'class' )
            // InternalAlf.g:2850:2: 'class'
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
    // InternalAlf.g:2859:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2863:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:2864:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
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
    // InternalAlf.g:2871:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2875:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:2876:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:2876:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:2877:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:2878:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:2878:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalAlf.g:2886:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2890:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:2891:2: rule__ClassDeclaration__Group__3__Impl
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
    // InternalAlf.g:2897:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2901:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:2902:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:2902:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:2903:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:2904:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=18 && LA48_0<=19)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:2904:3: rule__ClassDeclaration__Group_3__0
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
    // InternalAlf.g:2913:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2917:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:2918:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalAlf.g:2925:1: rule__ClassDeclaration__Group_3__0__Impl : ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2929:1: ( ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:2930:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:2930:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:2931:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:2932:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            // InternalAlf.g:2932:3: rule__ClassDeclaration__Alternatives_3_0
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
    // InternalAlf.g:2940:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2944:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalAlf.g:2945:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
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
    // InternalAlf.g:2952:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2956:1: ( ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) ) )
            // InternalAlf.g:2957:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) )
            {
            // InternalAlf.g:2957:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) )
            // InternalAlf.g:2958:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_1()); 
            // InternalAlf.g:2959:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 )
            // InternalAlf.g:2959:3: rule__ClassDeclaration__OwnedMembershipAssignment_3_1
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
    // InternalAlf.g:2967:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2971:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalAlf.g:2972:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:2978:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2982:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:2983:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:2983:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:2984:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:2985:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==40) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAlf.g:2985:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalAlf.g:2994:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2998:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalAlf.g:2999:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalAlf.g:3006:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3010:1: ( ( ',' ) )
            // InternalAlf.g:3011:1: ( ',' )
            {
            // InternalAlf.g:3011:1: ( ',' )
            // InternalAlf.g:3012:2: ','
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
    // InternalAlf.g:3021:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3025:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:3026:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:3032:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3036:1: ( ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) ) )
            // InternalAlf.g:3037:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            {
            // InternalAlf.g:3037:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            // InternalAlf.g:3038:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 
            // InternalAlf.g:3039:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 )
            // InternalAlf.g:3039:3: rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1
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
    // InternalAlf.g:3048:1: rule__ClassDefinition__Group__0 : rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 ;
    public final void rule__ClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3052:1: ( rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 )
            // InternalAlf.g:3053:2: rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1
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
    // InternalAlf.g:3060:1: rule__ClassDefinition__Group__0__Impl : ( ruleClassDeclaration ) ;
    public final void rule__ClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3064:1: ( ( ruleClassDeclaration ) )
            // InternalAlf.g:3065:1: ( ruleClassDeclaration )
            {
            // InternalAlf.g:3065:1: ( ruleClassDeclaration )
            // InternalAlf.g:3066:2: ruleClassDeclaration
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
    // InternalAlf.g:3075:1: rule__ClassDefinition__Group__1 : rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 ;
    public final void rule__ClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3079:1: ( rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 )
            // InternalAlf.g:3080:2: rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2
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
    // InternalAlf.g:3087:1: rule__ClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3091:1: ( ( '{' ) )
            // InternalAlf.g:3092:1: ( '{' )
            {
            // InternalAlf.g:3092:1: ( '{' )
            // InternalAlf.g:3093:2: '{'
            {
             before(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAlf.g:3102:1: rule__ClassDefinition__Group__2 : rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 ;
    public final void rule__ClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3106:1: ( rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 )
            // InternalAlf.g:3107:2: rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3
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
    // InternalAlf.g:3114:1: rule__ClassDefinition__Group__2__Impl : ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* ) ;
    public final void rule__ClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3118:1: ( ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* ) )
            // InternalAlf.g:3119:1: ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* )
            {
            // InternalAlf.g:3119:1: ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* )
            // InternalAlf.g:3120:2: ( rule__ClassDefinition__OwnedMembershipAssignment_2 )*
            {
             before(grammarAccess.getClassDefinitionAccess().getOwnedMembershipAssignment_2()); 
            // InternalAlf.g:3121:2: ( rule__ClassDefinition__OwnedMembershipAssignment_2 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)||(LA50_0>=15 && LA50_0<=17)||LA50_0==20||(LA50_0>=31 && LA50_0<=37)||LA50_0==41||(LA50_0>=53 && LA50_0<=55)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAlf.g:3121:3: rule__ClassDefinition__OwnedMembershipAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ClassDefinition__OwnedMembershipAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalAlf.g:3129:1: rule__ClassDefinition__Group__3 : rule__ClassDefinition__Group__3__Impl ;
    public final void rule__ClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3133:1: ( rule__ClassDefinition__Group__3__Impl )
            // InternalAlf.g:3134:2: rule__ClassDefinition__Group__3__Impl
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
    // InternalAlf.g:3140:1: rule__ClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__ClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3144:1: ( ( '}' ) )
            // InternalAlf.g:3145:1: ( '}' )
            {
            // InternalAlf.g:3145:1: ( '}' )
            // InternalAlf.g:3146:2: '}'
            {
             before(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAlf.g:3156:1: rule__ClassFeatureMember__Group__0 : rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1 ;
    public final void rule__ClassFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3160:1: ( rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1 )
            // InternalAlf.g:3161:2: rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1
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
    // InternalAlf.g:3168:1: rule__ClassFeatureMember__Group__0__Impl : ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__ClassFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3172:1: ( ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:3173:1: ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:3173:1: ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:3174:2: ( rule__ClassFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:3175:2: ( rule__ClassFeatureMember__VisibilityAssignment_0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=31 && LA51_0<=34)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:3175:3: rule__ClassFeatureMember__VisibilityAssignment_0
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
    // InternalAlf.g:3183:1: rule__ClassFeatureMember__Group__1 : rule__ClassFeatureMember__Group__1__Impl ;
    public final void rule__ClassFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3187:1: ( rule__ClassFeatureMember__Group__1__Impl )
            // InternalAlf.g:3188:2: rule__ClassFeatureMember__Group__1__Impl
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
    // InternalAlf.g:3194:1: rule__ClassFeatureMember__Group__1__Impl : ( ( rule__ClassFeatureMember__Alternatives_1 ) ) ;
    public final void rule__ClassFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3198:1: ( ( ( rule__ClassFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:3199:1: ( ( rule__ClassFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:3199:1: ( ( rule__ClassFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:3200:2: ( rule__ClassFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:3201:2: ( rule__ClassFeatureMember__Alternatives_1 )
            // InternalAlf.g:3201:3: rule__ClassFeatureMember__Alternatives_1
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
    // InternalAlf.g:3210:1: rule__ClassFeatureMember__Group_1_0__0 : rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1 ;
    public final void rule__ClassFeatureMember__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3214:1: ( rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1 )
            // InternalAlf.g:3215:2: rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1
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
    // InternalAlf.g:3222:1: rule__ClassFeatureMember__Group_1_0__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3226:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? ) )
            // InternalAlf.g:3227:1: ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? )
            {
            // InternalAlf.g:3227:1: ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? )
            // InternalAlf.g:3228:2: ( rule__ClassFeatureMember__Alternatives_1_0_0 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_0_0()); 
            // InternalAlf.g:3229:2: ( rule__ClassFeatureMember__Alternatives_1_0_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==20||(LA52_0>=54 && LA52_0<=55)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:3229:3: rule__ClassFeatureMember__Alternatives_1_0_0
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
    // InternalAlf.g:3237:1: rule__ClassFeatureMember__Group_1_0__1 : rule__ClassFeatureMember__Group_1_0__1__Impl rule__ClassFeatureMember__Group_1_0__2 ;
    public final void rule__ClassFeatureMember__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3241:1: ( rule__ClassFeatureMember__Group_1_0__1__Impl rule__ClassFeatureMember__Group_1_0__2 )
            // InternalAlf.g:3242:2: rule__ClassFeatureMember__Group_1_0__1__Impl rule__ClassFeatureMember__Group_1_0__2
            {
            pushFollow(FOLLOW_21);
            rule__ClassFeatureMember__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_0__2();

            state._fsp--;


            }

        }
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
    // InternalAlf.g:3249:1: rule__ClassFeatureMember__Group_1_0__1__Impl : ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3253:1: ( ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )? ) )
            // InternalAlf.g:3254:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )? )
            {
            // InternalAlf.g:3254:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )? )
            // InternalAlf.g:3255:2: ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_0_1()); 
            // InternalAlf.g:3256:2: ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=35 && LA53_0<=37)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:3256:3: rule__ClassFeatureMember__DirectionAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__DirectionAssignment_1_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0__2"
    // InternalAlf.g:3264:1: rule__ClassFeatureMember__Group_1_0__2 : rule__ClassFeatureMember__Group_1_0__2__Impl ;
    public final void rule__ClassFeatureMember__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3268:1: ( rule__ClassFeatureMember__Group_1_0__2__Impl )
            // InternalAlf.g:3269:2: rule__ClassFeatureMember__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0__2"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_0__2__Impl"
    // InternalAlf.g:3275:1: rule__ClassFeatureMember__Group_1_0__2__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3279:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 ) ) )
            // InternalAlf.g:3280:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 ) )
            {
            // InternalAlf.g:3280:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 ) )
            // InternalAlf.g:3281:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_2()); 
            // InternalAlf.g:3282:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 )
            // InternalAlf.g:3282:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_0__2__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1__0"
    // InternalAlf.g:3291:1: rule__ClassFeatureMember__Group_1_1__0 : rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1 ;
    public final void rule__ClassFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3295:1: ( rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1 )
            // InternalAlf.g:3296:2: rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAlf.g:3303:1: rule__ClassFeatureMember__Group_1_1__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3307:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) ) )
            // InternalAlf.g:3308:1: ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) )
            {
            // InternalAlf.g:3308:1: ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) )
            // InternalAlf.g:3309:2: ( rule__ClassFeatureMember__Alternatives_1_1_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_1_0()); 
            // InternalAlf.g:3310:2: ( rule__ClassFeatureMember__Alternatives_1_1_0 )
            // InternalAlf.g:3310:3: rule__ClassFeatureMember__Alternatives_1_1_0
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
    // InternalAlf.g:3318:1: rule__ClassFeatureMember__Group_1_1__1 : rule__ClassFeatureMember__Group_1_1__1__Impl rule__ClassFeatureMember__Group_1_1__2 ;
    public final void rule__ClassFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3322:1: ( rule__ClassFeatureMember__Group_1_1__1__Impl rule__ClassFeatureMember__Group_1_1__2 )
            // InternalAlf.g:3323:2: rule__ClassFeatureMember__Group_1_1__1__Impl rule__ClassFeatureMember__Group_1_1__2
            {
            pushFollow(FOLLOW_22);
            rule__ClassFeatureMember__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_1__2();

            state._fsp--;


            }

        }
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
    // InternalAlf.g:3330:1: rule__ClassFeatureMember__Group_1_1__1__Impl : ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3334:1: ( ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )? ) )
            // InternalAlf.g:3335:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )? )
            {
            // InternalAlf.g:3335:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )? )
            // InternalAlf.g:3336:2: ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_1_1()); 
            // InternalAlf.g:3337:2: ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=35 && LA54_0<=37)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlf.g:3337:3: rule__ClassFeatureMember__DirectionAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__DirectionAssignment_1_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1__2"
    // InternalAlf.g:3345:1: rule__ClassFeatureMember__Group_1_1__2 : rule__ClassFeatureMember__Group_1_1__2__Impl ;
    public final void rule__ClassFeatureMember__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3349:1: ( rule__ClassFeatureMember__Group_1_1__2__Impl )
            // InternalAlf.g:3350:2: rule__ClassFeatureMember__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1__2"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_1__2__Impl"
    // InternalAlf.g:3356:1: rule__ClassFeatureMember__Group_1_1__2__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3360:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 ) ) )
            // InternalAlf.g:3361:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 ) )
            {
            // InternalAlf.g:3361:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 ) )
            // InternalAlf.g:3362:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_2()); 
            // InternalAlf.g:3363:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 )
            // InternalAlf.g:3363:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1_1__2__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1_2__0"
    // InternalAlf.g:3372:1: rule__ClassFeatureMember__Group_1_2__0 : rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1 ;
    public final void rule__ClassFeatureMember__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3376:1: ( rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1 )
            // InternalAlf.g:3377:2: rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1
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
    // InternalAlf.g:3384:1: rule__ClassFeatureMember__Group_1_2__0__Impl : ( 'connector' ) ;
    public final void rule__ClassFeatureMember__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3388:1: ( ( 'connector' ) )
            // InternalAlf.g:3389:1: ( 'connector' )
            {
            // InternalAlf.g:3389:1: ( 'connector' )
            // InternalAlf.g:3390:2: 'connector'
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
    // InternalAlf.g:3399:1: rule__ClassFeatureMember__Group_1_2__1 : rule__ClassFeatureMember__Group_1_2__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3403:1: ( rule__ClassFeatureMember__Group_1_2__1__Impl )
            // InternalAlf.g:3404:2: rule__ClassFeatureMember__Group_1_2__1__Impl
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
    // InternalAlf.g:3410:1: rule__ClassFeatureMember__Group_1_2__1__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3414:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) ) )
            // InternalAlf.g:3415:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) )
            {
            // InternalAlf.g:3415:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) )
            // InternalAlf.g:3416:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_2_1()); 
            // InternalAlf.g:3417:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 )
            // InternalAlf.g:3417:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1
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
    // InternalAlf.g:3426:1: rule__ClassFeatureMember__Group_1_3__0 : rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1 ;
    public final void rule__ClassFeatureMember__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3430:1: ( rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1 )
            // InternalAlf.g:3431:2: rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1
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
    // InternalAlf.g:3438:1: rule__ClassFeatureMember__Group_1_3__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3442:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) ) )
            // InternalAlf.g:3443:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) )
            {
            // InternalAlf.g:3443:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) )
            // InternalAlf.g:3444:2: ( rule__ClassFeatureMember__Alternatives_1_3_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_3_0()); 
            // InternalAlf.g:3445:2: ( rule__ClassFeatureMember__Alternatives_1_3_0 )
            // InternalAlf.g:3445:3: rule__ClassFeatureMember__Alternatives_1_3_0
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
    // InternalAlf.g:3453:1: rule__ClassFeatureMember__Group_1_3__1 : rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2 ;
    public final void rule__ClassFeatureMember__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3457:1: ( rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2 )
            // InternalAlf.g:3458:2: rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2
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
    // InternalAlf.g:3465:1: rule__ClassFeatureMember__Group_1_3__1__Impl : ( 'is' ) ;
    public final void rule__ClassFeatureMember__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3469:1: ( ( 'is' ) )
            // InternalAlf.g:3470:1: ( 'is' )
            {
            // InternalAlf.g:3470:1: ( 'is' )
            // InternalAlf.g:3471:2: 'is'
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
    // InternalAlf.g:3480:1: rule__ClassFeatureMember__Group_1_3__2 : rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3 ;
    public final void rule__ClassFeatureMember__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3484:1: ( rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3 )
            // InternalAlf.g:3485:2: rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3
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
    // InternalAlf.g:3492:1: rule__ClassFeatureMember__Group_1_3__2__Impl : ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3496:1: ( ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) ) )
            // InternalAlf.g:3497:1: ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) )
            {
            // InternalAlf.g:3497:1: ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) )
            // InternalAlf.g:3498:2: ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementAssignment_1_3_2()); 
            // InternalAlf.g:3499:2: ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 )
            // InternalAlf.g:3499:3: rule__ClassFeatureMember__MemberElementAssignment_1_3_2
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
    // InternalAlf.g:3507:1: rule__ClassFeatureMember__Group_1_3__3 : rule__ClassFeatureMember__Group_1_3__3__Impl ;
    public final void rule__ClassFeatureMember__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3511:1: ( rule__ClassFeatureMember__Group_1_3__3__Impl )
            // InternalAlf.g:3512:2: rule__ClassFeatureMember__Group_1_3__3__Impl
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
    // InternalAlf.g:3518:1: rule__ClassFeatureMember__Group_1_3__3__Impl : ( ';' ) ;
    public final void rule__ClassFeatureMember__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3522:1: ( ( ';' ) )
            // InternalAlf.g:3523:1: ( ';' )
            {
            // InternalAlf.g:3523:1: ( ';' )
            // InternalAlf.g:3524:2: ';'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_1_3_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAlf.g:3534:1: rule__ClassFeatureMember__Group_1_3_0_0__0 : rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1 ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3538:1: ( rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1 )
            // InternalAlf.g:3539:2: rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1
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
    // InternalAlf.g:3546:1: rule__ClassFeatureMember__Group_1_3_0_0__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3550:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 ) ) )
            // InternalAlf.g:3551:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 ) )
            {
            // InternalAlf.g:3551:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 ) )
            // InternalAlf.g:3552:2: ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_3_0_0_0()); 
            // InternalAlf.g:3553:2: ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 )
            // InternalAlf.g:3553:3: rule__ClassFeatureMember__Alternatives_1_3_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Alternatives_1_3_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_3_0_0_0()); 

            }


            }

        }
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
    // InternalAlf.g:3561:1: rule__ClassFeatureMember__Group_1_3_0_0__1 : rule__ClassFeatureMember__Group_1_3_0_0__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3565:1: ( rule__ClassFeatureMember__Group_1_3_0_0__1__Impl )
            // InternalAlf.g:3566:2: rule__ClassFeatureMember__Group_1_3_0_0__1__Impl
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
    // InternalAlf.g:3572:1: rule__ClassFeatureMember__Group_1_3_0_0__1__Impl : ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3576:1: ( ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? ) )
            // InternalAlf.g:3577:1: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? )
            {
            // InternalAlf.g:3577:1: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? )
            // InternalAlf.g:3578:2: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_1_3_0_0_1()); 
            // InternalAlf.g:3579:2: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:3579:3: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1
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
    // InternalAlf.g:3588:1: rule__AssociationDeclaration__Group__0 : rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1 ;
    public final void rule__AssociationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3592:1: ( rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1 )
            // InternalAlf.g:3593:2: rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1
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
    // InternalAlf.g:3600:1: rule__AssociationDeclaration__Group__0__Impl : ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__AssociationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3604:1: ( ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:3605:1: ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:3605:1: ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:3606:2: ( rule__AssociationDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:3607:2: ( rule__AssociationDeclaration__IsAbstractAssignment_0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==53) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:3607:3: rule__AssociationDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:3615:1: rule__AssociationDeclaration__Group__1 : rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2 ;
    public final void rule__AssociationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3619:1: ( rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2 )
            // InternalAlf.g:3620:2: rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2
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
    // InternalAlf.g:3627:1: rule__AssociationDeclaration__Group__1__Impl : ( 'assoc' ) ;
    public final void rule__AssociationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3631:1: ( ( 'assoc' ) )
            // InternalAlf.g:3632:1: ( 'assoc' )
            {
            // InternalAlf.g:3632:1: ( 'assoc' )
            // InternalAlf.g:3633:2: 'assoc'
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
    // InternalAlf.g:3642:1: rule__AssociationDeclaration__Group__2 : rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3 ;
    public final void rule__AssociationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3646:1: ( rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3 )
            // InternalAlf.g:3647:2: rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3
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
    // InternalAlf.g:3654:1: rule__AssociationDeclaration__Group__2__Impl : ( ( rule__AssociationDeclaration__NameAssignment_2 ) ) ;
    public final void rule__AssociationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3658:1: ( ( ( rule__AssociationDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:3659:1: ( ( rule__AssociationDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:3659:1: ( ( rule__AssociationDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:3660:2: ( rule__AssociationDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:3661:2: ( rule__AssociationDeclaration__NameAssignment_2 )
            // InternalAlf.g:3661:3: rule__AssociationDeclaration__NameAssignment_2
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
    // InternalAlf.g:3669:1: rule__AssociationDeclaration__Group__3 : rule__AssociationDeclaration__Group__3__Impl ;
    public final void rule__AssociationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3673:1: ( rule__AssociationDeclaration__Group__3__Impl )
            // InternalAlf.g:3674:2: rule__AssociationDeclaration__Group__3__Impl
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
    // InternalAlf.g:3680:1: rule__AssociationDeclaration__Group__3__Impl : ( ( rule__AssociationDeclaration__Group_3__0 )? ) ;
    public final void rule__AssociationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3684:1: ( ( ( rule__AssociationDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:3685:1: ( ( rule__AssociationDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:3685:1: ( ( rule__AssociationDeclaration__Group_3__0 )? )
            // InternalAlf.g:3686:2: ( rule__AssociationDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getAssociationDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:3687:2: ( rule__AssociationDeclaration__Group_3__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=18 && LA57_0<=19)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:3687:3: rule__AssociationDeclaration__Group_3__0
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
    // InternalAlf.g:3696:1: rule__AssociationDeclaration__Group_3__0 : rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1 ;
    public final void rule__AssociationDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3700:1: ( rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1 )
            // InternalAlf.g:3701:2: rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1
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
    // InternalAlf.g:3708:1: rule__AssociationDeclaration__Group_3__0__Impl : ( ( rule__AssociationDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__AssociationDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3712:1: ( ( ( rule__AssociationDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:3713:1: ( ( rule__AssociationDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:3713:1: ( ( rule__AssociationDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:3714:2: ( rule__AssociationDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:3715:2: ( rule__AssociationDeclaration__Alternatives_3_0 )
            // InternalAlf.g:3715:3: rule__AssociationDeclaration__Alternatives_3_0
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
    // InternalAlf.g:3723:1: rule__AssociationDeclaration__Group_3__1 : rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2 ;
    public final void rule__AssociationDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3727:1: ( rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2 )
            // InternalAlf.g:3728:2: rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2
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
    // InternalAlf.g:3735:1: rule__AssociationDeclaration__Group_3__1__Impl : ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) ) ;
    public final void rule__AssociationDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3739:1: ( ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) ) )
            // InternalAlf.g:3740:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) )
            {
            // InternalAlf.g:3740:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) )
            // InternalAlf.g:3741:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipAssignment_3_1()); 
            // InternalAlf.g:3742:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 )
            // InternalAlf.g:3742:3: rule__AssociationDeclaration__OwnedMembershipAssignment_3_1
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
    // InternalAlf.g:3750:1: rule__AssociationDeclaration__Group_3__2 : rule__AssociationDeclaration__Group_3__2__Impl ;
    public final void rule__AssociationDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3754:1: ( rule__AssociationDeclaration__Group_3__2__Impl )
            // InternalAlf.g:3755:2: rule__AssociationDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:3761:1: rule__AssociationDeclaration__Group_3__2__Impl : ( ( rule__AssociationDeclaration__Group_3_2__0 )* ) ;
    public final void rule__AssociationDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3765:1: ( ( ( rule__AssociationDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:3766:1: ( ( rule__AssociationDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:3766:1: ( ( rule__AssociationDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:3767:2: ( rule__AssociationDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getAssociationDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:3768:2: ( rule__AssociationDeclaration__Group_3_2__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==40) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalAlf.g:3768:3: rule__AssociationDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AssociationDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalAlf.g:3777:1: rule__AssociationDeclaration__Group_3_2__0 : rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1 ;
    public final void rule__AssociationDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3781:1: ( rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1 )
            // InternalAlf.g:3782:2: rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1
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
    // InternalAlf.g:3789:1: rule__AssociationDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3793:1: ( ( ',' ) )
            // InternalAlf.g:3794:1: ( ',' )
            {
            // InternalAlf.g:3794:1: ( ',' )
            // InternalAlf.g:3795:2: ','
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
    // InternalAlf.g:3804:1: rule__AssociationDeclaration__Group_3_2__1 : rule__AssociationDeclaration__Group_3_2__1__Impl ;
    public final void rule__AssociationDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3808:1: ( rule__AssociationDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:3809:2: rule__AssociationDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:3815:1: rule__AssociationDeclaration__Group_3_2__1__Impl : ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) ) ;
    public final void rule__AssociationDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3819:1: ( ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) ) )
            // InternalAlf.g:3820:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            {
            // InternalAlf.g:3820:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            // InternalAlf.g:3821:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 
            // InternalAlf.g:3822:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 )
            // InternalAlf.g:3822:3: rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1
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
    // InternalAlf.g:3831:1: rule__AssociationDefinition__Group__0 : rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1 ;
    public final void rule__AssociationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3835:1: ( rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1 )
            // InternalAlf.g:3836:2: rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1
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
    // InternalAlf.g:3843:1: rule__AssociationDefinition__Group__0__Impl : ( ruleAssociationDeclaration ) ;
    public final void rule__AssociationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3847:1: ( ( ruleAssociationDeclaration ) )
            // InternalAlf.g:3848:1: ( ruleAssociationDeclaration )
            {
            // InternalAlf.g:3848:1: ( ruleAssociationDeclaration )
            // InternalAlf.g:3849:2: ruleAssociationDeclaration
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
    // InternalAlf.g:3858:1: rule__AssociationDefinition__Group__1 : rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2 ;
    public final void rule__AssociationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3862:1: ( rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2 )
            // InternalAlf.g:3863:2: rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2
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
    // InternalAlf.g:3870:1: rule__AssociationDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__AssociationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3874:1: ( ( '{' ) )
            // InternalAlf.g:3875:1: ( '{' )
            {
            // InternalAlf.g:3875:1: ( '{' )
            // InternalAlf.g:3876:2: '{'
            {
             before(grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAlf.g:3885:1: rule__AssociationDefinition__Group__2 : rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3 ;
    public final void rule__AssociationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3889:1: ( rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3 )
            // InternalAlf.g:3890:2: rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3
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
    // InternalAlf.g:3897:1: rule__AssociationDefinition__Group__2__Impl : ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) ) ;
    public final void rule__AssociationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3901:1: ( ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) ) )
            // InternalAlf.g:3902:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) )
            {
            // InternalAlf.g:3902:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) )
            // InternalAlf.g:3903:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_2 )
            {
             before(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssignment_2()); 
            // InternalAlf.g:3904:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_2 )
            // InternalAlf.g:3904:3: rule__AssociationDefinition__OwnedMembershipAssignment_2
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
    // InternalAlf.g:3912:1: rule__AssociationDefinition__Group__3 : rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4 ;
    public final void rule__AssociationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3916:1: ( rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4 )
            // InternalAlf.g:3917:2: rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4
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
    // InternalAlf.g:3924:1: rule__AssociationDefinition__Group__3__Impl : ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) ) ;
    public final void rule__AssociationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3928:1: ( ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) ) )
            // InternalAlf.g:3929:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) )
            {
            // InternalAlf.g:3929:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) )
            // InternalAlf.g:3930:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_3 )
            {
             before(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssignment_3()); 
            // InternalAlf.g:3931:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_3 )
            // InternalAlf.g:3931:3: rule__AssociationDefinition__OwnedMembershipAssignment_3
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
    // InternalAlf.g:3939:1: rule__AssociationDefinition__Group__4 : rule__AssociationDefinition__Group__4__Impl ;
    public final void rule__AssociationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3943:1: ( rule__AssociationDefinition__Group__4__Impl )
            // InternalAlf.g:3944:2: rule__AssociationDefinition__Group__4__Impl
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
    // InternalAlf.g:3950:1: rule__AssociationDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__AssociationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3954:1: ( ( '}' ) )
            // InternalAlf.g:3955:1: ( '}' )
            {
            // InternalAlf.g:3955:1: ( '}' )
            // InternalAlf.g:3956:2: '}'
            {
             before(grammarAccess.getAssociationDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
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


    // $ANTLR start "rule__NamedFeatureDefinition__Group__0"
    // InternalAlf.g:3966:1: rule__NamedFeatureDefinition__Group__0 : rule__NamedFeatureDefinition__Group__0__Impl rule__NamedFeatureDefinition__Group__1 ;
    public final void rule__NamedFeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3970:1: ( rule__NamedFeatureDefinition__Group__0__Impl rule__NamedFeatureDefinition__Group__1 )
            // InternalAlf.g:3971:2: rule__NamedFeatureDefinition__Group__0__Impl rule__NamedFeatureDefinition__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__NamedFeatureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group__0__Impl"
    // InternalAlf.g:3978:1: rule__NamedFeatureDefinition__Group__0__Impl : ( ( rule__NamedFeatureDefinition__NameAssignment_0 ) ) ;
    public final void rule__NamedFeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3982:1: ( ( ( rule__NamedFeatureDefinition__NameAssignment_0 ) ) )
            // InternalAlf.g:3983:1: ( ( rule__NamedFeatureDefinition__NameAssignment_0 ) )
            {
            // InternalAlf.g:3983:1: ( ( rule__NamedFeatureDefinition__NameAssignment_0 ) )
            // InternalAlf.g:3984:2: ( rule__NamedFeatureDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getNameAssignment_0()); 
            // InternalAlf.g:3985:2: ( rule__NamedFeatureDefinition__NameAssignment_0 )
            // InternalAlf.g:3985:3: rule__NamedFeatureDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group__1"
    // InternalAlf.g:3993:1: rule__NamedFeatureDefinition__Group__1 : rule__NamedFeatureDefinition__Group__1__Impl ;
    public final void rule__NamedFeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3997:1: ( rule__NamedFeatureDefinition__Group__1__Impl )
            // InternalAlf.g:3998:2: rule__NamedFeatureDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group__1__Impl"
    // InternalAlf.g:4004:1: rule__NamedFeatureDefinition__Group__1__Impl : ( ( rule__NamedFeatureDefinition__Alternatives_1 ) ) ;
    public final void rule__NamedFeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4008:1: ( ( ( rule__NamedFeatureDefinition__Alternatives_1 ) ) )
            // InternalAlf.g:4009:1: ( ( rule__NamedFeatureDefinition__Alternatives_1 ) )
            {
            // InternalAlf.g:4009:1: ( ( rule__NamedFeatureDefinition__Alternatives_1 ) )
            // InternalAlf.g:4010:2: ( rule__NamedFeatureDefinition__Alternatives_1 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1()); 
            // InternalAlf.g:4011:2: ( rule__NamedFeatureDefinition__Alternatives_1 )
            // InternalAlf.g:4011:3: rule__NamedFeatureDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0__0"
    // InternalAlf.g:4020:1: rule__NamedFeatureDefinition__Group_1_0__0 : rule__NamedFeatureDefinition__Group_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_0__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4024:1: ( rule__NamedFeatureDefinition__Group_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_0__1 )
            // InternalAlf.g:4025:2: rule__NamedFeatureDefinition__Group_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__NamedFeatureDefinition__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0__0__Impl"
    // InternalAlf.g:4032:1: rule__NamedFeatureDefinition__Group_1_0__0__Impl : ( ( rule__NamedFeatureDefinition__Group_1_0_0__0 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4036:1: ( ( ( rule__NamedFeatureDefinition__Group_1_0_0__0 )? ) )
            // InternalAlf.g:4037:1: ( ( rule__NamedFeatureDefinition__Group_1_0_0__0 )? )
            {
            // InternalAlf.g:4037:1: ( ( rule__NamedFeatureDefinition__Group_1_0_0__0 )? )
            // InternalAlf.g:4038:2: ( rule__NamedFeatureDefinition__Group_1_0_0__0 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_0()); 
            // InternalAlf.g:4039:2: ( rule__NamedFeatureDefinition__Group_1_0_0__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==42) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:4039:3: rule__NamedFeatureDefinition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0__1"
    // InternalAlf.g:4047:1: rule__NamedFeatureDefinition__Group_1_0__1 : rule__NamedFeatureDefinition__Group_1_0__1__Impl rule__NamedFeatureDefinition__Group_1_0__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4051:1: ( rule__NamedFeatureDefinition__Group_1_0__1__Impl rule__NamedFeatureDefinition__Group_1_0__2 )
            // InternalAlf.g:4052:2: rule__NamedFeatureDefinition__Group_1_0__1__Impl rule__NamedFeatureDefinition__Group_1_0__2
            {
            pushFollow(FOLLOW_27);
            rule__NamedFeatureDefinition__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0__1__Impl"
    // InternalAlf.g:4059:1: rule__NamedFeatureDefinition__Group_1_0__1__Impl : ( ( rule__NamedFeatureDefinition__Group_1_0_1__0 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4063:1: ( ( ( rule__NamedFeatureDefinition__Group_1_0_1__0 )? ) )
            // InternalAlf.g:4064:1: ( ( rule__NamedFeatureDefinition__Group_1_0_1__0 )? )
            {
            // InternalAlf.g:4064:1: ( ( rule__NamedFeatureDefinition__Group_1_0_1__0 )? )
            // InternalAlf.g:4065:2: ( rule__NamedFeatureDefinition__Group_1_0_1__0 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_1()); 
            // InternalAlf.g:4066:2: ( rule__NamedFeatureDefinition__Group_1_0_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:4066:3: rule__NamedFeatureDefinition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0__2"
    // InternalAlf.g:4074:1: rule__NamedFeatureDefinition__Group_1_0__2 : rule__NamedFeatureDefinition__Group_1_0__2__Impl rule__NamedFeatureDefinition__Group_1_0__3 ;
    public final void rule__NamedFeatureDefinition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4078:1: ( rule__NamedFeatureDefinition__Group_1_0__2__Impl rule__NamedFeatureDefinition__Group_1_0__3 )
            // InternalAlf.g:4079:2: rule__NamedFeatureDefinition__Group_1_0__2__Impl rule__NamedFeatureDefinition__Group_1_0__3
            {
            pushFollow(FOLLOW_27);
            rule__NamedFeatureDefinition__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0__2__Impl"
    // InternalAlf.g:4086:1: rule__NamedFeatureDefinition__Group_1_0__2__Impl : ( ( rule__NamedFeatureDefinition__Group_1_0_2__0 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4090:1: ( ( ( rule__NamedFeatureDefinition__Group_1_0_2__0 )? ) )
            // InternalAlf.g:4091:1: ( ( rule__NamedFeatureDefinition__Group_1_0_2__0 )? )
            {
            // InternalAlf.g:4091:1: ( ( rule__NamedFeatureDefinition__Group_1_0_2__0 )? )
            // InternalAlf.g:4092:2: ( rule__NamedFeatureDefinition__Group_1_0_2__0 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_2()); 
            // InternalAlf.g:4093:2: ( rule__NamedFeatureDefinition__Group_1_0_2__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==46) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:4093:3: rule__NamedFeatureDefinition__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0__3"
    // InternalAlf.g:4101:1: rule__NamedFeatureDefinition__Group_1_0__3 : rule__NamedFeatureDefinition__Group_1_0__3__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4105:1: ( rule__NamedFeatureDefinition__Group_1_0__3__Impl )
            // InternalAlf.g:4106:2: rule__NamedFeatureDefinition__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0__3"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0__3__Impl"
    // InternalAlf.g:4112:1: rule__NamedFeatureDefinition__Group_1_0__3__Impl : ( ( rule__NamedFeatureDefinition__Alternatives_1_0_3 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4116:1: ( ( ( rule__NamedFeatureDefinition__Alternatives_1_0_3 ) ) )
            // InternalAlf.g:4117:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_0_3 ) )
            {
            // InternalAlf.g:4117:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_0_3 ) )
            // InternalAlf.g:4118:2: ( rule__NamedFeatureDefinition__Alternatives_1_0_3 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_0_3()); 
            // InternalAlf.g:4119:2: ( rule__NamedFeatureDefinition__Alternatives_1_0_3 )
            // InternalAlf.g:4119:3: rule__NamedFeatureDefinition__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Alternatives_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0__3__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_0__0"
    // InternalAlf.g:4128:1: rule__NamedFeatureDefinition__Group_1_0_0__0 : rule__NamedFeatureDefinition__Group_1_0_0__0__Impl rule__NamedFeatureDefinition__Group_1_0_0__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4132:1: ( rule__NamedFeatureDefinition__Group_1_0_0__0__Impl rule__NamedFeatureDefinition__Group_1_0_0__1 )
            // InternalAlf.g:4133:2: rule__NamedFeatureDefinition__Group_1_0_0__0__Impl rule__NamedFeatureDefinition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_28);
            rule__NamedFeatureDefinition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_0__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_0__0__Impl"
    // InternalAlf.g:4140:1: rule__NamedFeatureDefinition__Group_1_0_0__0__Impl : ( ':' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4144:1: ( ( ':' ) )
            // InternalAlf.g:4145:1: ( ':' )
            {
            // InternalAlf.g:4145:1: ( ':' )
            // InternalAlf.g:4146:2: ':'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getColonKeyword_1_0_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getColonKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_0__1"
    // InternalAlf.g:4155:1: rule__NamedFeatureDefinition__Group_1_0_0__1 : rule__NamedFeatureDefinition__Group_1_0_0__1__Impl rule__NamedFeatureDefinition__Group_1_0_0__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4159:1: ( rule__NamedFeatureDefinition__Group_1_0_0__1__Impl rule__NamedFeatureDefinition__Group_1_0_0__2 )
            // InternalAlf.g:4160:2: rule__NamedFeatureDefinition__Group_1_0_0__1__Impl rule__NamedFeatureDefinition__Group_1_0_0__2
            {
            pushFollow(FOLLOW_28);
            rule__NamedFeatureDefinition__Group_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_0__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_0__1__Impl"
    // InternalAlf.g:4167:1: rule__NamedFeatureDefinition__Group_1_0_0__1__Impl : ( ( rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4171:1: ( ( ( rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1 )? ) )
            // InternalAlf.g:4172:1: ( ( rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1 )? )
            {
            // InternalAlf.g:4172:1: ( ( rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1 )? )
            // InternalAlf.g:4173:2: ( rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeAssignment_1_0_0_1()); 
            // InternalAlf.g:4174:2: ( rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlf.g:4174:3: rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeAssignment_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_0__2"
    // InternalAlf.g:4182:1: rule__NamedFeatureDefinition__Group_1_0_0__2 : rule__NamedFeatureDefinition__Group_1_0_0__2__Impl rule__NamedFeatureDefinition__Group_1_0_0__3 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4186:1: ( rule__NamedFeatureDefinition__Group_1_0_0__2__Impl rule__NamedFeatureDefinition__Group_1_0_0__3 )
            // InternalAlf.g:4187:2: rule__NamedFeatureDefinition__Group_1_0_0__2__Impl rule__NamedFeatureDefinition__Group_1_0_0__3
            {
            pushFollow(FOLLOW_12);
            rule__NamedFeatureDefinition__Group_1_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_0__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_0__2__Impl"
    // InternalAlf.g:4194:1: rule__NamedFeatureDefinition__Group_1_0_0__2__Impl : ( ( rule__NamedFeatureDefinition__Alternatives_1_0_0_2 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4198:1: ( ( ( rule__NamedFeatureDefinition__Alternatives_1_0_0_2 ) ) )
            // InternalAlf.g:4199:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_0_0_2 ) )
            {
            // InternalAlf.g:4199:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_0_0_2 ) )
            // InternalAlf.g:4200:2: ( rule__NamedFeatureDefinition__Alternatives_1_0_0_2 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_0_0_2()); 
            // InternalAlf.g:4201:2: ( rule__NamedFeatureDefinition__Alternatives_1_0_0_2 )
            // InternalAlf.g:4201:3: rule__NamedFeatureDefinition__Alternatives_1_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Alternatives_1_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_0__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_0__3"
    // InternalAlf.g:4209:1: rule__NamedFeatureDefinition__Group_1_0_0__3 : rule__NamedFeatureDefinition__Group_1_0_0__3__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4213:1: ( rule__NamedFeatureDefinition__Group_1_0_0__3__Impl )
            // InternalAlf.g:4214:2: rule__NamedFeatureDefinition__Group_1_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_0__3"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_0__3__Impl"
    // InternalAlf.g:4220:1: rule__NamedFeatureDefinition__Group_1_0_0__3__Impl : ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4224:1: ( ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3 )? ) )
            // InternalAlf.g:4225:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3 )? )
            {
            // InternalAlf.g:4225:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3 )? )
            // InternalAlf.g:4226:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_0_0_3()); 
            // InternalAlf.g:4227:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==18||LA63_0==23||LA63_0==47) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:4227:3: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_0__3__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1__0"
    // InternalAlf.g:4236:1: rule__NamedFeatureDefinition__Group_1_0_1__0 : rule__NamedFeatureDefinition__Group_1_0_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4240:1: ( rule__NamedFeatureDefinition__Group_1_0_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_1__1 )
            // InternalAlf.g:4241:2: rule__NamedFeatureDefinition__Group_1_0_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_29);
            rule__NamedFeatureDefinition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1__0__Impl"
    // InternalAlf.g:4248:1: rule__NamedFeatureDefinition__Group_1_0_1__0__Impl : ( '[' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4252:1: ( ( '[' ) )
            // InternalAlf.g:4253:1: ( '[' )
            {
            // InternalAlf.g:4253:1: ( '[' )
            // InternalAlf.g:4254:2: '['
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1__1"
    // InternalAlf.g:4263:1: rule__NamedFeatureDefinition__Group_1_0_1__1 : rule__NamedFeatureDefinition__Group_1_0_1__1__Impl rule__NamedFeatureDefinition__Group_1_0_1__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4267:1: ( rule__NamedFeatureDefinition__Group_1_0_1__1__Impl rule__NamedFeatureDefinition__Group_1_0_1__2 )
            // InternalAlf.g:4268:2: rule__NamedFeatureDefinition__Group_1_0_1__1__Impl rule__NamedFeatureDefinition__Group_1_0_1__2
            {
            pushFollow(FOLLOW_29);
            rule__NamedFeatureDefinition__Group_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1__1__Impl"
    // InternalAlf.g:4275:1: rule__NamedFeatureDefinition__Group_1_0_1__1__Impl : ( ( rule__NamedFeatureDefinition__Group_1_0_1_1__0 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4279:1: ( ( ( rule__NamedFeatureDefinition__Group_1_0_1_1__0 )? ) )
            // InternalAlf.g:4280:1: ( ( rule__NamedFeatureDefinition__Group_1_0_1_1__0 )? )
            {
            // InternalAlf.g:4280:1: ( ( rule__NamedFeatureDefinition__Group_1_0_1_1__0 )? )
            // InternalAlf.g:4281:2: ( rule__NamedFeatureDefinition__Group_1_0_1_1__0 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_1_1()); 
            // InternalAlf.g:4282:2: ( rule__NamedFeatureDefinition__Group_1_0_1_1__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_NATURAL_VALUE) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==45) ) {
                    alt64=1;
                }
            }
            switch (alt64) {
                case 1 :
                    // InternalAlf.g:4282:3: rule__NamedFeatureDefinition__Group_1_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_0_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1__2"
    // InternalAlf.g:4290:1: rule__NamedFeatureDefinition__Group_1_0_1__2 : rule__NamedFeatureDefinition__Group_1_0_1__2__Impl rule__NamedFeatureDefinition__Group_1_0_1__3 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4294:1: ( rule__NamedFeatureDefinition__Group_1_0_1__2__Impl rule__NamedFeatureDefinition__Group_1_0_1__3 )
            // InternalAlf.g:4295:2: rule__NamedFeatureDefinition__Group_1_0_1__2__Impl rule__NamedFeatureDefinition__Group_1_0_1__3
            {
            pushFollow(FOLLOW_30);
            rule__NamedFeatureDefinition__Group_1_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1__2__Impl"
    // InternalAlf.g:4302:1: rule__NamedFeatureDefinition__Group_1_0_1__2__Impl : ( ( rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4306:1: ( ( ( rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2 ) ) )
            // InternalAlf.g:4307:1: ( ( rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2 ) )
            {
            // InternalAlf.g:4307:1: ( ( rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2 ) )
            // InternalAlf.g:4308:2: ( rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getUpperAssignment_1_0_1_2()); 
            // InternalAlf.g:4309:2: ( rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2 )
            // InternalAlf.g:4309:3: rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getUpperAssignment_1_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1__3"
    // InternalAlf.g:4317:1: rule__NamedFeatureDefinition__Group_1_0_1__3 : rule__NamedFeatureDefinition__Group_1_0_1__3__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4321:1: ( rule__NamedFeatureDefinition__Group_1_0_1__3__Impl )
            // InternalAlf.g:4322:2: rule__NamedFeatureDefinition__Group_1_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1__3"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1__3__Impl"
    // InternalAlf.g:4328:1: rule__NamedFeatureDefinition__Group_1_0_1__3__Impl : ( ']' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4332:1: ( ( ']' ) )
            // InternalAlf.g:4333:1: ( ']' )
            {
            // InternalAlf.g:4333:1: ( ']' )
            // InternalAlf.g:4334:2: ']'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_1_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1__3__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1_1__0"
    // InternalAlf.g:4344:1: rule__NamedFeatureDefinition__Group_1_0_1_1__0 : rule__NamedFeatureDefinition__Group_1_0_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_1_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4348:1: ( rule__NamedFeatureDefinition__Group_1_0_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_1_1__1 )
            // InternalAlf.g:4349:2: rule__NamedFeatureDefinition__Group_1_0_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_1_1__1
            {
            pushFollow(FOLLOW_31);
            rule__NamedFeatureDefinition__Group_1_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1_1__0__Impl"
    // InternalAlf.g:4356:1: rule__NamedFeatureDefinition__Group_1_0_1_1__0__Impl : ( ( rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4360:1: ( ( ( rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0 ) ) )
            // InternalAlf.g:4361:1: ( ( rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0 ) )
            {
            // InternalAlf.g:4361:1: ( ( rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0 ) )
            // InternalAlf.g:4362:2: ( rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLowerAssignment_1_0_1_1_0()); 
            // InternalAlf.g:4363:2: ( rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0 )
            // InternalAlf.g:4363:3: rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getLowerAssignment_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1_1__1"
    // InternalAlf.g:4371:1: rule__NamedFeatureDefinition__Group_1_0_1_1__1 : rule__NamedFeatureDefinition__Group_1_0_1_1__1__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4375:1: ( rule__NamedFeatureDefinition__Group_1_0_1_1__1__Impl )
            // InternalAlf.g:4376:2: rule__NamedFeatureDefinition__Group_1_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_1_1__1__Impl"
    // InternalAlf.g:4382:1: rule__NamedFeatureDefinition__Group_1_0_1_1__1__Impl : ( '..' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4386:1: ( ( '..' ) )
            // InternalAlf.g:4387:1: ( '..' )
            {
            // InternalAlf.g:4387:1: ( '..' )
            // InternalAlf.g:4388:2: '..'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_1_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_1_1__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_2__0"
    // InternalAlf.g:4398:1: rule__NamedFeatureDefinition__Group_1_0_2__0 : rule__NamedFeatureDefinition__Group_1_0_2__0__Impl rule__NamedFeatureDefinition__Group_1_0_2__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4402:1: ( rule__NamedFeatureDefinition__Group_1_0_2__0__Impl rule__NamedFeatureDefinition__Group_1_0_2__1 )
            // InternalAlf.g:4403:2: rule__NamedFeatureDefinition__Group_1_0_2__0__Impl rule__NamedFeatureDefinition__Group_1_0_2__1
            {
            pushFollow(FOLLOW_32);
            rule__NamedFeatureDefinition__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_2__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_2__0__Impl"
    // InternalAlf.g:4410:1: rule__NamedFeatureDefinition__Group_1_0_2__0__Impl : ( '=' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4414:1: ( ( '=' ) )
            // InternalAlf.g:4415:1: ( '=' )
            {
            // InternalAlf.g:4415:1: ( '=' )
            // InternalAlf.g:4416:2: '='
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_2__1"
    // InternalAlf.g:4425:1: rule__NamedFeatureDefinition__Group_1_0_2__1 : rule__NamedFeatureDefinition__Group_1_0_2__1__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4429:1: ( rule__NamedFeatureDefinition__Group_1_0_2__1__Impl )
            // InternalAlf.g:4430:2: rule__NamedFeatureDefinition__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_2__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_2__1__Impl"
    // InternalAlf.g:4436:1: rule__NamedFeatureDefinition__Group_1_0_2__1__Impl : ( ( rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4440:1: ( ( ( rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1 ) ) )
            // InternalAlf.g:4441:1: ( ( rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1 ) )
            {
            // InternalAlf.g:4441:1: ( ( rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1 ) )
            // InternalAlf.g:4442:2: ( rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getValueAssignment_1_0_2_1()); 
            // InternalAlf.g:4443:2: ( rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1 )
            // InternalAlf.g:4443:3: rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getValueAssignment_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_3_1__0"
    // InternalAlf.g:4452:1: rule__NamedFeatureDefinition__Group_1_0_3_1__0 : rule__NamedFeatureDefinition__Group_1_0_3_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_3_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4456:1: ( rule__NamedFeatureDefinition__Group_1_0_3_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_3_1__1 )
            // InternalAlf.g:4457:2: rule__NamedFeatureDefinition__Group_1_0_3_1__0__Impl rule__NamedFeatureDefinition__Group_1_0_3_1__1
            {
            pushFollow(FOLLOW_18);
            rule__NamedFeatureDefinition__Group_1_0_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_3_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_3_1__0__Impl"
    // InternalAlf.g:4464:1: rule__NamedFeatureDefinition__Group_1_0_3_1__0__Impl : ( '{' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4468:1: ( ( '{' ) )
            // InternalAlf.g:4469:1: ( '{' )
            {
            // InternalAlf.g:4469:1: ( '{' )
            // InternalAlf.g:4470:2: '{'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_3_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_3_1__1"
    // InternalAlf.g:4479:1: rule__NamedFeatureDefinition__Group_1_0_3_1__1 : rule__NamedFeatureDefinition__Group_1_0_3_1__1__Impl rule__NamedFeatureDefinition__Group_1_0_3_1__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4483:1: ( rule__NamedFeatureDefinition__Group_1_0_3_1__1__Impl rule__NamedFeatureDefinition__Group_1_0_3_1__2 )
            // InternalAlf.g:4484:2: rule__NamedFeatureDefinition__Group_1_0_3_1__1__Impl rule__NamedFeatureDefinition__Group_1_0_3_1__2
            {
            pushFollow(FOLLOW_18);
            rule__NamedFeatureDefinition__Group_1_0_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_3_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_3_1__1__Impl"
    // InternalAlf.g:4491:1: rule__NamedFeatureDefinition__Group_1_0_3_1__1__Impl : ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1 )* ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4495:1: ( ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1 )* ) )
            // InternalAlf.g:4496:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1 )* )
            {
            // InternalAlf.g:4496:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1 )* )
            // InternalAlf.g:4497:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1 )*
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_0_3_1_1()); 
            // InternalAlf.g:4498:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_UNRESTRICTED_NAME)||(LA65_0>=15 && LA65_0<=17)||LA65_0==20||(LA65_0>=31 && LA65_0<=37)||LA65_0==41||(LA65_0>=53 && LA65_0<=55)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalAlf.g:4498:3: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_3_1__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_3_1__2"
    // InternalAlf.g:4506:1: rule__NamedFeatureDefinition__Group_1_0_3_1__2 : rule__NamedFeatureDefinition__Group_1_0_3_1__2__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_0_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4510:1: ( rule__NamedFeatureDefinition__Group_1_0_3_1__2__Impl )
            // InternalAlf.g:4511:2: rule__NamedFeatureDefinition__Group_1_0_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_0_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_3_1__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_0_3_1__2__Impl"
    // InternalAlf.g:4517:1: rule__NamedFeatureDefinition__Group_1_0_3_1__2__Impl : ( '}' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_0_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4521:1: ( ( '}' ) )
            // InternalAlf.g:4522:1: ( '}' )
            {
            // InternalAlf.g:4522:1: ( '}' )
            // InternalAlf.g:4523:2: '}'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_3_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_0_3_1__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1__0"
    // InternalAlf.g:4533:1: rule__NamedFeatureDefinition__Group_1_1__0 : rule__NamedFeatureDefinition__Group_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4537:1: ( rule__NamedFeatureDefinition__Group_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1__1 )
            // InternalAlf.g:4538:2: rule__NamedFeatureDefinition__Group_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_33);
            rule__NamedFeatureDefinition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1__0__Impl"
    // InternalAlf.g:4545:1: rule__NamedFeatureDefinition__Group_1_1__0__Impl : ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4549:1: ( ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0 ) ) )
            // InternalAlf.g:4550:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0 ) )
            {
            // InternalAlf.g:4550:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0 ) )
            // InternalAlf.g:4551:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_1_0()); 
            // InternalAlf.g:4552:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0 )
            // InternalAlf.g:4552:3: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1__1"
    // InternalAlf.g:4560:1: rule__NamedFeatureDefinition__Group_1_1__1 : rule__NamedFeatureDefinition__Group_1_1__1__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4564:1: ( rule__NamedFeatureDefinition__Group_1_1__1__Impl )
            // InternalAlf.g:4565:2: rule__NamedFeatureDefinition__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1__1__Impl"
    // InternalAlf.g:4571:1: rule__NamedFeatureDefinition__Group_1_1__1__Impl : ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4575:1: ( ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1 ) ) )
            // InternalAlf.g:4576:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1 ) )
            {
            // InternalAlf.g:4576:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1 ) )
            // InternalAlf.g:4577:2: ( rule__NamedFeatureDefinition__Alternatives_1_1_1 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_1_1()); 
            // InternalAlf.g:4578:2: ( rule__NamedFeatureDefinition__Alternatives_1_1_1 )
            // InternalAlf.g:4578:3: rule__NamedFeatureDefinition__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Alternatives_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0__0"
    // InternalAlf.g:4587:1: rule__NamedFeatureDefinition__Group_1_1_1_0__0 : rule__NamedFeatureDefinition__Group_1_1_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4591:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0__1 )
            // InternalAlf.g:4592:2: rule__NamedFeatureDefinition__Group_1_1_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0__1
            {
            pushFollow(FOLLOW_33);
            rule__NamedFeatureDefinition__Group_1_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0__0__Impl"
    // InternalAlf.g:4599:1: rule__NamedFeatureDefinition__Group_1_1_1_0__0__Impl : ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__0 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4603:1: ( ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__0 )? ) )
            // InternalAlf.g:4604:1: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__0 )? )
            {
            // InternalAlf.g:4604:1: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__0 )? )
            // InternalAlf.g:4605:2: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__0 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_0()); 
            // InternalAlf.g:4606:2: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==43) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlf.g:4606:3: rule__NamedFeatureDefinition__Group_1_1_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1_1_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0__1"
    // InternalAlf.g:4614:1: rule__NamedFeatureDefinition__Group_1_1_1_0__1 : rule__NamedFeatureDefinition__Group_1_1_1_0__1__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4618:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0__1__Impl )
            // InternalAlf.g:4619:2: rule__NamedFeatureDefinition__Group_1_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0__1__Impl"
    // InternalAlf.g:4625:1: rule__NamedFeatureDefinition__Group_1_1_1_0__1__Impl : ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4629:1: ( ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1 ) ) )
            // InternalAlf.g:4630:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1 ) )
            {
            // InternalAlf.g:4630:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1 ) )
            // InternalAlf.g:4631:2: ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_1_1_0_1()); 
            // InternalAlf.g:4632:2: ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1 )
            // InternalAlf.g:4632:3: rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0__0"
    // InternalAlf.g:4641:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0__0 : rule__NamedFeatureDefinition__Group_1_1_1_0_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4645:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__1 )
            // InternalAlf.g:4646:2: rule__NamedFeatureDefinition__Group_1_1_1_0_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__1
            {
            pushFollow(FOLLOW_29);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0__0__Impl"
    // InternalAlf.g:4653:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0__0__Impl : ( '[' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4657:1: ( ( '[' ) )
            // InternalAlf.g:4658:1: ( '[' )
            {
            // InternalAlf.g:4658:1: ( '[' )
            // InternalAlf.g:4659:2: '['
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_0_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0__1"
    // InternalAlf.g:4668:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0__1 : rule__NamedFeatureDefinition__Group_1_1_1_0_0__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4672:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__2 )
            // InternalAlf.g:4673:2: rule__NamedFeatureDefinition__Group_1_1_1_0_0__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__2
            {
            pushFollow(FOLLOW_29);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0__1__Impl"
    // InternalAlf.g:4680:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0__1__Impl : ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4684:1: ( ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0 )? ) )
            // InternalAlf.g:4685:1: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0 )? )
            {
            // InternalAlf.g:4685:1: ( ( rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0 )? )
            // InternalAlf.g:4686:2: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_0_1()); 
            // InternalAlf.g:4687:2: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_NATURAL_VALUE) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==45) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalAlf.g:4687:3: rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0__2"
    // InternalAlf.g:4695:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0__2 : rule__NamedFeatureDefinition__Group_1_1_1_0_0__2__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__3 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4699:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__2__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__3 )
            // InternalAlf.g:4700:2: rule__NamedFeatureDefinition__Group_1_1_1_0_0__2__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0__3
            {
            pushFollow(FOLLOW_30);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0__2__Impl"
    // InternalAlf.g:4707:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0__2__Impl : ( ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4711:1: ( ( ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2 ) ) )
            // InternalAlf.g:4712:1: ( ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2 ) )
            {
            // InternalAlf.g:4712:1: ( ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2 ) )
            // InternalAlf.g:4713:2: ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getUpperAssignment_1_1_1_0_0_2()); 
            // InternalAlf.g:4714:2: ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2 )
            // InternalAlf.g:4714:3: rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getUpperAssignment_1_1_1_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0__3"
    // InternalAlf.g:4722:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0__3 : rule__NamedFeatureDefinition__Group_1_1_1_0_0__3__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4726:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0__3__Impl )
            // InternalAlf.g:4727:2: rule__NamedFeatureDefinition__Group_1_1_1_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0__3"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0__3__Impl"
    // InternalAlf.g:4733:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0__3__Impl : ( ']' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4737:1: ( ( ']' ) )
            // InternalAlf.g:4738:1: ( ']' )
            {
            // InternalAlf.g:4738:1: ( ']' )
            // InternalAlf.g:4739:2: ']'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_0_0_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0__3__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0"
    // InternalAlf.g:4749:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0 : rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4753:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1 )
            // InternalAlf.g:4754:2: rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1
            {
            pushFollow(FOLLOW_31);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0__Impl"
    // InternalAlf.g:4761:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0__Impl : ( ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4765:1: ( ( ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0 ) ) )
            // InternalAlf.g:4766:1: ( ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0 ) )
            {
            // InternalAlf.g:4766:1: ( ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0 ) )
            // InternalAlf.g:4767:2: ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLowerAssignment_1_1_1_0_0_1_0()); 
            // InternalAlf.g:4768:2: ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0 )
            // InternalAlf.g:4768:3: rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getLowerAssignment_1_1_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1"
    // InternalAlf.g:4776:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1 : rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4780:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1__Impl )
            // InternalAlf.g:4781:2: rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1__Impl"
    // InternalAlf.g:4787:1: rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1__Impl : ( '..' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4791:1: ( ( '..' ) )
            // InternalAlf.g:4792:1: ( '..' )
            {
            // InternalAlf.g:4792:1: ( '..' )
            // InternalAlf.g:4793:2: '..'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_0_0_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_0_1__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0"
    // InternalAlf.g:4803:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4807:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1 )
            // InternalAlf.g:4808:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1
            {
            pushFollow(FOLLOW_32);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0__Impl"
    // InternalAlf.g:4815:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0__Impl : ( '=' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4819:1: ( ( '=' ) )
            // InternalAlf.g:4820:1: ( '=' )
            {
            // InternalAlf.g:4820:1: ( '=' )
            // InternalAlf.g:4821:2: '='
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_1_1_0_1_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_1_1_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1"
    // InternalAlf.g:4830:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4834:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2 )
            // InternalAlf.g:4835:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2
            {
            pushFollow(FOLLOW_34);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1__Impl"
    // InternalAlf.g:4842:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1__Impl : ( ( rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4846:1: ( ( ( rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1 ) ) )
            // InternalAlf.g:4847:1: ( ( rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1 ) )
            {
            // InternalAlf.g:4847:1: ( ( rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1 ) )
            // InternalAlf.g:4848:2: ( rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getValueAssignment_1_1_1_0_1_0_1()); 
            // InternalAlf.g:4849:2: ( rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1 )
            // InternalAlf.g:4849:3: rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getValueAssignment_1_1_1_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2"
    // InternalAlf.g:4857:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4861:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2__Impl )
            // InternalAlf.g:4862:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2__Impl"
    // InternalAlf.g:4868:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2__Impl : ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4872:1: ( ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2 ) ) )
            // InternalAlf.g:4873:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2 ) )
            {
            // InternalAlf.g:4873:1: ( ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2 ) )
            // InternalAlf.g:4874:2: ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_1_1_0_1_0_2()); 
            // InternalAlf.g:4875:2: ( rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2 )
            // InternalAlf.g:4875:3: rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Alternatives_1_1_1_0_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getAlternatives_1_1_1_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0"
    // InternalAlf.g:4884:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4888:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1 )
            // InternalAlf.g:4889:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0__Impl"
    // InternalAlf.g:4896:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0__Impl : ( '{' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4900:1: ( ( '{' ) )
            // InternalAlf.g:4901:1: ( '{' )
            {
            // InternalAlf.g:4901:1: ( '{' )
            // InternalAlf.g:4902:2: '{'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_0_2_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1"
    // InternalAlf.g:4911:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4915:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2 )
            // InternalAlf.g:4916:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2
            {
            pushFollow(FOLLOW_18);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1__Impl"
    // InternalAlf.g:4923:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1__Impl : ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1 )* ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4927:1: ( ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1 )* ) )
            // InternalAlf.g:4928:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1 )* )
            {
            // InternalAlf.g:4928:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1 )* )
            // InternalAlf.g:4929:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1 )*
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_1_1_0_1_0_2_1_1()); 
            // InternalAlf.g:4930:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_UNRESTRICTED_NAME)||(LA68_0>=15 && LA68_0<=17)||LA68_0==20||(LA68_0>=31 && LA68_0<=37)||LA68_0==41||(LA68_0>=53 && LA68_0<=55)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalAlf.g:4930:3: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_1_1_0_1_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2"
    // InternalAlf.g:4938:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4942:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2__Impl )
            // InternalAlf.g:4943:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2__Impl"
    // InternalAlf.g:4949:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2__Impl : ( '}' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4953:1: ( ( '}' ) )
            // InternalAlf.g:4954:1: ( '}' )
            {
            // InternalAlf.g:4954:1: ( '}' )
            // InternalAlf.g:4955:2: '}'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_0_2_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_0_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_0_2_1__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0"
    // InternalAlf.g:4965:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4969:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1 )
            // InternalAlf.g:4970:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0__Impl"
    // InternalAlf.g:4977:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0__Impl : ( '{' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4981:1: ( ( '{' ) )
            // InternalAlf.g:4982:1: ( '{' )
            {
            // InternalAlf.g:4982:1: ( '{' )
            // InternalAlf.g:4983:2: '{'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1"
    // InternalAlf.g:4992:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4996:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2 )
            // InternalAlf.g:4997:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1__Impl"
    // InternalAlf.g:5004:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1__Impl : ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1 )* ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5008:1: ( ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1 )* ) )
            // InternalAlf.g:5009:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1 )* )
            {
            // InternalAlf.g:5009:1: ( ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1 )* )
            // InternalAlf.g:5010:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1 )*
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_1_1_0_1_1_1()); 
            // InternalAlf.g:5011:2: ( rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_UNRESTRICTED_NAME)||(LA69_0>=15 && LA69_0<=17)||LA69_0==20||(LA69_0>=31 && LA69_0<=37)||LA69_0==41||(LA69_0>=53 && LA69_0<=55)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAlf.g:5011:3: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_1_1_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2"
    // InternalAlf.g:5019:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2 : rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5023:1: ( rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2__Impl )
            // InternalAlf.g:5024:2: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2__Impl"
    // InternalAlf.g:5030:1: rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2__Impl : ( '}' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5034:1: ( ( '}' ) )
            // InternalAlf.g:5035:1: ( '}' )
            {
            // InternalAlf.g:5035:1: ( '}' )
            // InternalAlf.g:5036:2: '}'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_0_1_1__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__0"
    // InternalAlf.g:5046:1: rule__NamedFeatureDefinition__Group_1_1_1_1__0 : rule__NamedFeatureDefinition__Group_1_1_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5050:1: ( rule__NamedFeatureDefinition__Group_1_1_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__1 )
            // InternalAlf.g:5051:2: rule__NamedFeatureDefinition__Group_1_1_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__1
            {
            pushFollow(FOLLOW_29);
            rule__NamedFeatureDefinition__Group_1_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__0__Impl"
    // InternalAlf.g:5058:1: rule__NamedFeatureDefinition__Group_1_1_1_1__0__Impl : ( '[' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5062:1: ( ( '[' ) )
            // InternalAlf.g:5063:1: ( '[' )
            {
            // InternalAlf.g:5063:1: ( '[' )
            // InternalAlf.g:5064:2: '['
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__1"
    // InternalAlf.g:5073:1: rule__NamedFeatureDefinition__Group_1_1_1_1__1 : rule__NamedFeatureDefinition__Group_1_1_1_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__2 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5077:1: ( rule__NamedFeatureDefinition__Group_1_1_1_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__2 )
            // InternalAlf.g:5078:2: rule__NamedFeatureDefinition__Group_1_1_1_1__1__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__2
            {
            pushFollow(FOLLOW_29);
            rule__NamedFeatureDefinition__Group_1_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__1__Impl"
    // InternalAlf.g:5085:1: rule__NamedFeatureDefinition__Group_1_1_1_1__1__Impl : ( ( rule__NamedFeatureDefinition__Group_1_1_1_1_1__0 )? ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5089:1: ( ( ( rule__NamedFeatureDefinition__Group_1_1_1_1_1__0 )? ) )
            // InternalAlf.g:5090:1: ( ( rule__NamedFeatureDefinition__Group_1_1_1_1_1__0 )? )
            {
            // InternalAlf.g:5090:1: ( ( rule__NamedFeatureDefinition__Group_1_1_1_1_1__0 )? )
            // InternalAlf.g:5091:2: ( rule__NamedFeatureDefinition__Group_1_1_1_1_1__0 )?
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_1_1()); 
            // InternalAlf.g:5092:2: ( rule__NamedFeatureDefinition__Group_1_1_1_1_1__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_NATURAL_VALUE) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==45) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:5092:3: rule__NamedFeatureDefinition__Group_1_1_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedFeatureDefinition__Group_1_1_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getGroup_1_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__1__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__2"
    // InternalAlf.g:5100:1: rule__NamedFeatureDefinition__Group_1_1_1_1__2 : rule__NamedFeatureDefinition__Group_1_1_1_1__2__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__3 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5104:1: ( rule__NamedFeatureDefinition__Group_1_1_1_1__2__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__3 )
            // InternalAlf.g:5105:2: rule__NamedFeatureDefinition__Group_1_1_1_1__2__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__3
            {
            pushFollow(FOLLOW_30);
            rule__NamedFeatureDefinition__Group_1_1_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__2"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__2__Impl"
    // InternalAlf.g:5112:1: rule__NamedFeatureDefinition__Group_1_1_1_1__2__Impl : ( ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5116:1: ( ( ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2 ) ) )
            // InternalAlf.g:5117:1: ( ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2 ) )
            {
            // InternalAlf.g:5117:1: ( ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2 ) )
            // InternalAlf.g:5118:2: ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getUpperAssignment_1_1_1_1_2()); 
            // InternalAlf.g:5119:2: ( rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2 )
            // InternalAlf.g:5119:3: rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getUpperAssignment_1_1_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__2__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__3"
    // InternalAlf.g:5127:1: rule__NamedFeatureDefinition__Group_1_1_1_1__3 : rule__NamedFeatureDefinition__Group_1_1_1_1__3__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__4 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5131:1: ( rule__NamedFeatureDefinition__Group_1_1_1_1__3__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__4 )
            // InternalAlf.g:5132:2: rule__NamedFeatureDefinition__Group_1_1_1_1__3__Impl rule__NamedFeatureDefinition__Group_1_1_1_1__4
            {
            pushFollow(FOLLOW_9);
            rule__NamedFeatureDefinition__Group_1_1_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__3"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__3__Impl"
    // InternalAlf.g:5139:1: rule__NamedFeatureDefinition__Group_1_1_1_1__3__Impl : ( ']' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5143:1: ( ( ']' ) )
            // InternalAlf.g:5144:1: ( ']' )
            {
            // InternalAlf.g:5144:1: ( ']' )
            // InternalAlf.g:5145:2: ']'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_1_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__3__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__4"
    // InternalAlf.g:5154:1: rule__NamedFeatureDefinition__Group_1_1_1_1__4 : rule__NamedFeatureDefinition__Group_1_1_1_1__4__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5158:1: ( rule__NamedFeatureDefinition__Group_1_1_1_1__4__Impl )
            // InternalAlf.g:5159:2: rule__NamedFeatureDefinition__Group_1_1_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__4"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1__4__Impl"
    // InternalAlf.g:5165:1: rule__NamedFeatureDefinition__Group_1_1_1_1__4__Impl : ( ';' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5169:1: ( ( ';' ) )
            // InternalAlf.g:5170:1: ( ';' )
            {
            // InternalAlf.g:5170:1: ( ';' )
            // InternalAlf.g:5171:2: ';'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_1_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1__4__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1_1__0"
    // InternalAlf.g:5181:1: rule__NamedFeatureDefinition__Group_1_1_1_1_1__0 : rule__NamedFeatureDefinition__Group_1_1_1_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_1_1__1 ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5185:1: ( rule__NamedFeatureDefinition__Group_1_1_1_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_1_1__1 )
            // InternalAlf.g:5186:2: rule__NamedFeatureDefinition__Group_1_1_1_1_1__0__Impl rule__NamedFeatureDefinition__Group_1_1_1_1_1__1
            {
            pushFollow(FOLLOW_31);
            rule__NamedFeatureDefinition__Group_1_1_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1_1__0"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1_1__0__Impl"
    // InternalAlf.g:5193:1: rule__NamedFeatureDefinition__Group_1_1_1_1_1__0__Impl : ( ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0 ) ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5197:1: ( ( ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0 ) ) )
            // InternalAlf.g:5198:1: ( ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0 ) )
            {
            // InternalAlf.g:5198:1: ( ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0 ) )
            // InternalAlf.g:5199:2: ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0 )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLowerAssignment_1_1_1_1_1_0()); 
            // InternalAlf.g:5200:2: ( rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0 )
            // InternalAlf.g:5200:3: rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getLowerAssignment_1_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1_1__0__Impl"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1_1__1"
    // InternalAlf.g:5208:1: rule__NamedFeatureDefinition__Group_1_1_1_1_1__1 : rule__NamedFeatureDefinition__Group_1_1_1_1_1__1__Impl ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5212:1: ( rule__NamedFeatureDefinition__Group_1_1_1_1_1__1__Impl )
            // InternalAlf.g:5213:2: rule__NamedFeatureDefinition__Group_1_1_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedFeatureDefinition__Group_1_1_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1_1__1"


    // $ANTLR start "rule__NamedFeatureDefinition__Group_1_1_1_1_1__1__Impl"
    // InternalAlf.g:5219:1: rule__NamedFeatureDefinition__Group_1_1_1_1_1__1__Impl : ( '..' ) ;
    public final void rule__NamedFeatureDefinition__Group_1_1_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5223:1: ( ( '..' ) )
            // InternalAlf.g:5224:1: ( '..' )
            {
            // InternalAlf.g:5224:1: ( '..' )
            // InternalAlf.g:5225:2: '..'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__Group_1_1_1_1_1__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group__0"
    // InternalAlf.g:5235:1: rule__UnnamedFeatureDefinition__Group__0 : rule__UnnamedFeatureDefinition__Group__0__Impl rule__UnnamedFeatureDefinition__Group__1 ;
    public final void rule__UnnamedFeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5239:1: ( rule__UnnamedFeatureDefinition__Group__0__Impl rule__UnnamedFeatureDefinition__Group__1 )
            // InternalAlf.g:5240:2: rule__UnnamedFeatureDefinition__Group__0__Impl rule__UnnamedFeatureDefinition__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__UnnamedFeatureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group__0__Impl"
    // InternalAlf.g:5247:1: rule__UnnamedFeatureDefinition__Group__0__Impl : ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5251:1: ( ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0 ) ) )
            // InternalAlf.g:5252:1: ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0 ) )
            {
            // InternalAlf.g:5252:1: ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0 ) )
            // InternalAlf.g:5253:2: ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipAssignment_0()); 
            // InternalAlf.g:5254:2: ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0 )
            // InternalAlf.g:5254:3: rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group__1"
    // InternalAlf.g:5262:1: rule__UnnamedFeatureDefinition__Group__1 : rule__UnnamedFeatureDefinition__Group__1__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5266:1: ( rule__UnnamedFeatureDefinition__Group__1__Impl )
            // InternalAlf.g:5267:2: rule__UnnamedFeatureDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group__1__Impl"
    // InternalAlf.g:5273:1: rule__UnnamedFeatureDefinition__Group__1__Impl : ( ( rule__UnnamedFeatureDefinition__Alternatives_1 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5277:1: ( ( ( rule__UnnamedFeatureDefinition__Alternatives_1 ) ) )
            // InternalAlf.g:5278:1: ( ( rule__UnnamedFeatureDefinition__Alternatives_1 ) )
            {
            // InternalAlf.g:5278:1: ( ( rule__UnnamedFeatureDefinition__Alternatives_1 ) )
            // InternalAlf.g:5279:2: ( rule__UnnamedFeatureDefinition__Alternatives_1 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getAlternatives_1()); 
            // InternalAlf.g:5280:2: ( rule__UnnamedFeatureDefinition__Alternatives_1 )
            // InternalAlf.g:5280:3: rule__UnnamedFeatureDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0__0"
    // InternalAlf.g:5289:1: rule__UnnamedFeatureDefinition__Group_1_0__0 : rule__UnnamedFeatureDefinition__Group_1_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0__1 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5293:1: ( rule__UnnamedFeatureDefinition__Group_1_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0__1 )
            // InternalAlf.g:5294:2: rule__UnnamedFeatureDefinition__Group_1_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0__1
            {
            pushFollow(FOLLOW_33);
            rule__UnnamedFeatureDefinition__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0__0__Impl"
    // InternalAlf.g:5301:1: rule__UnnamedFeatureDefinition__Group_1_0__0__Impl : ( ( rule__UnnamedFeatureDefinition__Group_1_0_0__0 )? ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5305:1: ( ( ( rule__UnnamedFeatureDefinition__Group_1_0_0__0 )? ) )
            // InternalAlf.g:5306:1: ( ( rule__UnnamedFeatureDefinition__Group_1_0_0__0 )? )
            {
            // InternalAlf.g:5306:1: ( ( rule__UnnamedFeatureDefinition__Group_1_0_0__0 )? )
            // InternalAlf.g:5307:2: ( rule__UnnamedFeatureDefinition__Group_1_0_0__0 )?
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_0()); 
            // InternalAlf.g:5308:2: ( rule__UnnamedFeatureDefinition__Group_1_0_0__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==43) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:5308:3: rule__UnnamedFeatureDefinition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnnamedFeatureDefinition__Group_1_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0__1"
    // InternalAlf.g:5316:1: rule__UnnamedFeatureDefinition__Group_1_0__1 : rule__UnnamedFeatureDefinition__Group_1_0__1__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5320:1: ( rule__UnnamedFeatureDefinition__Group_1_0__1__Impl )
            // InternalAlf.g:5321:2: rule__UnnamedFeatureDefinition__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0__1__Impl"
    // InternalAlf.g:5327:1: rule__UnnamedFeatureDefinition__Group_1_0__1__Impl : ( ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5331:1: ( ( ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1 ) ) )
            // InternalAlf.g:5332:1: ( ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1 ) )
            {
            // InternalAlf.g:5332:1: ( ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1 ) )
            // InternalAlf.g:5333:2: ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getAlternatives_1_0_1()); 
            // InternalAlf.g:5334:2: ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1 )
            // InternalAlf.g:5334:3: rule__UnnamedFeatureDefinition__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getAlternatives_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0__0"
    // InternalAlf.g:5343:1: rule__UnnamedFeatureDefinition__Group_1_0_0__0 : rule__UnnamedFeatureDefinition__Group_1_0_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__1 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5347:1: ( rule__UnnamedFeatureDefinition__Group_1_0_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__1 )
            // InternalAlf.g:5348:2: rule__UnnamedFeatureDefinition__Group_1_0_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_29);
            rule__UnnamedFeatureDefinition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0__0__Impl"
    // InternalAlf.g:5355:1: rule__UnnamedFeatureDefinition__Group_1_0_0__0__Impl : ( '[' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5359:1: ( ( '[' ) )
            // InternalAlf.g:5360:1: ( '[' )
            {
            // InternalAlf.g:5360:1: ( '[' )
            // InternalAlf.g:5361:2: '['
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0__1"
    // InternalAlf.g:5370:1: rule__UnnamedFeatureDefinition__Group_1_0_0__1 : rule__UnnamedFeatureDefinition__Group_1_0_0__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__2 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5374:1: ( rule__UnnamedFeatureDefinition__Group_1_0_0__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__2 )
            // InternalAlf.g:5375:2: rule__UnnamedFeatureDefinition__Group_1_0_0__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__2
            {
            pushFollow(FOLLOW_29);
            rule__UnnamedFeatureDefinition__Group_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0__1__Impl"
    // InternalAlf.g:5382:1: rule__UnnamedFeatureDefinition__Group_1_0_0__1__Impl : ( ( rule__UnnamedFeatureDefinition__Group_1_0_0_1__0 )? ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5386:1: ( ( ( rule__UnnamedFeatureDefinition__Group_1_0_0_1__0 )? ) )
            // InternalAlf.g:5387:1: ( ( rule__UnnamedFeatureDefinition__Group_1_0_0_1__0 )? )
            {
            // InternalAlf.g:5387:1: ( ( rule__UnnamedFeatureDefinition__Group_1_0_0_1__0 )? )
            // InternalAlf.g:5388:2: ( rule__UnnamedFeatureDefinition__Group_1_0_0_1__0 )?
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_0_1()); 
            // InternalAlf.g:5389:2: ( rule__UnnamedFeatureDefinition__Group_1_0_0_1__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_NATURAL_VALUE) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==45) ) {
                    alt72=1;
                }
            }
            switch (alt72) {
                case 1 :
                    // InternalAlf.g:5389:3: rule__UnnamedFeatureDefinition__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnnamedFeatureDefinition__Group_1_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0__2"
    // InternalAlf.g:5397:1: rule__UnnamedFeatureDefinition__Group_1_0_0__2 : rule__UnnamedFeatureDefinition__Group_1_0_0__2__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__3 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5401:1: ( rule__UnnamedFeatureDefinition__Group_1_0_0__2__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__3 )
            // InternalAlf.g:5402:2: rule__UnnamedFeatureDefinition__Group_1_0_0__2__Impl rule__UnnamedFeatureDefinition__Group_1_0_0__3
            {
            pushFollow(FOLLOW_30);
            rule__UnnamedFeatureDefinition__Group_1_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0__2"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0__2__Impl"
    // InternalAlf.g:5409:1: rule__UnnamedFeatureDefinition__Group_1_0_0__2__Impl : ( ( rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5413:1: ( ( ( rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2 ) ) )
            // InternalAlf.g:5414:1: ( ( rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2 ) )
            {
            // InternalAlf.g:5414:1: ( ( rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2 ) )
            // InternalAlf.g:5415:2: ( rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperAssignment_1_0_0_2()); 
            // InternalAlf.g:5416:2: ( rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2 )
            // InternalAlf.g:5416:3: rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperAssignment_1_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0__2__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0__3"
    // InternalAlf.g:5424:1: rule__UnnamedFeatureDefinition__Group_1_0_0__3 : rule__UnnamedFeatureDefinition__Group_1_0_0__3__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5428:1: ( rule__UnnamedFeatureDefinition__Group_1_0_0__3__Impl )
            // InternalAlf.g:5429:2: rule__UnnamedFeatureDefinition__Group_1_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0__3"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0__3__Impl"
    // InternalAlf.g:5435:1: rule__UnnamedFeatureDefinition__Group_1_0_0__3__Impl : ( ']' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5439:1: ( ( ']' ) )
            // InternalAlf.g:5440:1: ( ']' )
            {
            // InternalAlf.g:5440:1: ( ']' )
            // InternalAlf.g:5441:2: ']'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_0_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0__3__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0_1__0"
    // InternalAlf.g:5451:1: rule__UnnamedFeatureDefinition__Group_1_0_0_1__0 : rule__UnnamedFeatureDefinition__Group_1_0_0_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_0_1__1 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5455:1: ( rule__UnnamedFeatureDefinition__Group_1_0_0_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_0_1__1 )
            // InternalAlf.g:5456:2: rule__UnnamedFeatureDefinition__Group_1_0_0_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_31);
            rule__UnnamedFeatureDefinition__Group_1_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0_1__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0_1__0__Impl"
    // InternalAlf.g:5463:1: rule__UnnamedFeatureDefinition__Group_1_0_0_1__0__Impl : ( ( rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5467:1: ( ( ( rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0 ) ) )
            // InternalAlf.g:5468:1: ( ( rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0 ) )
            {
            // InternalAlf.g:5468:1: ( ( rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0 ) )
            // InternalAlf.g:5469:2: ( rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerAssignment_1_0_0_1_0()); 
            // InternalAlf.g:5470:2: ( rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0 )
            // InternalAlf.g:5470:3: rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerAssignment_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0_1__1"
    // InternalAlf.g:5478:1: rule__UnnamedFeatureDefinition__Group_1_0_0_1__1 : rule__UnnamedFeatureDefinition__Group_1_0_0_1__1__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5482:1: ( rule__UnnamedFeatureDefinition__Group_1_0_0_1__1__Impl )
            // InternalAlf.g:5483:2: rule__UnnamedFeatureDefinition__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0_1__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_0_1__1__Impl"
    // InternalAlf.g:5489:1: rule__UnnamedFeatureDefinition__Group_1_0_0_1__1__Impl : ( '..' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5493:1: ( ( '..' ) )
            // InternalAlf.g:5494:1: ( '..' )
            {
            // InternalAlf.g:5494:1: ( '..' )
            // InternalAlf.g:5495:2: '..'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_0_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0__0"
    // InternalAlf.g:5505:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0__0 : rule__UnnamedFeatureDefinition__Group_1_0_1_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0__1 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5509:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0__1 )
            // InternalAlf.g:5510:2: rule__UnnamedFeatureDefinition__Group_1_0_1_0__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0__1
            {
            pushFollow(FOLLOW_32);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0__0__Impl"
    // InternalAlf.g:5517:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0__0__Impl : ( '=' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5521:1: ( ( '=' ) )
            // InternalAlf.g:5522:1: ( '=' )
            {
            // InternalAlf.g:5522:1: ( '=' )
            // InternalAlf.g:5523:2: '='
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_1_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0__1"
    // InternalAlf.g:5532:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0__1 : rule__UnnamedFeatureDefinition__Group_1_0_1_0__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0__2 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5536:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0__2 )
            // InternalAlf.g:5537:2: rule__UnnamedFeatureDefinition__Group_1_0_1_0__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0__2
            {
            pushFollow(FOLLOW_34);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0__1__Impl"
    // InternalAlf.g:5544:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0__1__Impl : ( ( rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5548:1: ( ( ( rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1 ) ) )
            // InternalAlf.g:5549:1: ( ( rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1 ) )
            {
            // InternalAlf.g:5549:1: ( ( rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1 ) )
            // InternalAlf.g:5550:2: ( rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getValueAssignment_1_0_1_0_1()); 
            // InternalAlf.g:5551:2: ( rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1 )
            // InternalAlf.g:5551:3: rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getValueAssignment_1_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0__2"
    // InternalAlf.g:5559:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0__2 : rule__UnnamedFeatureDefinition__Group_1_0_1_0__2__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5563:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0__2__Impl )
            // InternalAlf.g:5564:2: rule__UnnamedFeatureDefinition__Group_1_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0__2"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0__2__Impl"
    // InternalAlf.g:5570:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0__2__Impl : ( ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5574:1: ( ( ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2 ) ) )
            // InternalAlf.g:5575:1: ( ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2 ) )
            {
            // InternalAlf.g:5575:1: ( ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2 ) )
            // InternalAlf.g:5576:2: ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getAlternatives_1_0_1_0_2()); 
            // InternalAlf.g:5577:2: ( rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2 )
            // InternalAlf.g:5577:3: rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Alternatives_1_0_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getAlternatives_1_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0__2__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0"
    // InternalAlf.g:5586:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0 : rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5590:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1 )
            // InternalAlf.g:5591:2: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0__Impl"
    // InternalAlf.g:5598:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0__Impl : ( '{' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5602:1: ( ( '{' ) )
            // InternalAlf.g:5603:1: ( '{' )
            {
            // InternalAlf.g:5603:1: ( '{' )
            // InternalAlf.g:5604:2: '{'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_0_2_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1"
    // InternalAlf.g:5613:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1 : rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5617:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2 )
            // InternalAlf.g:5618:2: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2
            {
            pushFollow(FOLLOW_18);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1__Impl"
    // InternalAlf.g:5625:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1__Impl : ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1 )* ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5629:1: ( ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1 )* ) )
            // InternalAlf.g:5630:1: ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1 )* )
            {
            // InternalAlf.g:5630:1: ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1 )* )
            // InternalAlf.g:5631:2: ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1 )*
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_0_1_0_2_1_1()); 
            // InternalAlf.g:5632:2: ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_UNRESTRICTED_NAME)||(LA73_0>=15 && LA73_0<=17)||LA73_0==20||(LA73_0>=31 && LA73_0<=37)||LA73_0==41||(LA73_0>=53 && LA73_0<=55)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAlf.g:5632:3: rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_0_1_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2"
    // InternalAlf.g:5640:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2 : rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5644:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2__Impl )
            // InternalAlf.g:5645:2: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2__Impl"
    // InternalAlf.g:5651:1: rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2__Impl : ( '}' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5655:1: ( ( '}' ) )
            // InternalAlf.g:5656:1: ( '}' )
            {
            // InternalAlf.g:5656:1: ( '}' )
            // InternalAlf.g:5657:2: '}'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_0_2_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_0_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_0_2_1__2__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_1__0"
    // InternalAlf.g:5667:1: rule__UnnamedFeatureDefinition__Group_1_0_1_1__0 : rule__UnnamedFeatureDefinition__Group_1_0_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_1__1 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5671:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_1__1 )
            // InternalAlf.g:5672:2: rule__UnnamedFeatureDefinition__Group_1_0_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__UnnamedFeatureDefinition__Group_1_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_1__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_1__0__Impl"
    // InternalAlf.g:5679:1: rule__UnnamedFeatureDefinition__Group_1_0_1_1__0__Impl : ( '{' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5683:1: ( ( '{' ) )
            // InternalAlf.g:5684:1: ( '{' )
            {
            // InternalAlf.g:5684:1: ( '{' )
            // InternalAlf.g:5685:2: '{'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_1__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_1__1"
    // InternalAlf.g:5694:1: rule__UnnamedFeatureDefinition__Group_1_0_1_1__1 : rule__UnnamedFeatureDefinition__Group_1_0_1_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_1__2 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5698:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_1__2 )
            // InternalAlf.g:5699:2: rule__UnnamedFeatureDefinition__Group_1_0_1_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_0_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__UnnamedFeatureDefinition__Group_1_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_1__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_1__1__Impl"
    // InternalAlf.g:5706:1: rule__UnnamedFeatureDefinition__Group_1_0_1_1__1__Impl : ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1 )* ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5710:1: ( ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1 )* ) )
            // InternalAlf.g:5711:1: ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1 )* )
            {
            // InternalAlf.g:5711:1: ( ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1 )* )
            // InternalAlf.g:5712:2: ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1 )*
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_0_1_1_1()); 
            // InternalAlf.g:5713:2: ( rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_UNRESTRICTED_NAME)||(LA74_0>=15 && LA74_0<=17)||LA74_0==20||(LA74_0>=31 && LA74_0<=37)||LA74_0==41||(LA74_0>=53 && LA74_0<=55)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAlf.g:5713:3: rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_1__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_1__2"
    // InternalAlf.g:5721:1: rule__UnnamedFeatureDefinition__Group_1_0_1_1__2 : rule__UnnamedFeatureDefinition__Group_1_0_1_1__2__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5725:1: ( rule__UnnamedFeatureDefinition__Group_1_0_1_1__2__Impl )
            // InternalAlf.g:5726:2: rule__UnnamedFeatureDefinition__Group_1_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_1__2"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_0_1_1__2__Impl"
    // InternalAlf.g:5732:1: rule__UnnamedFeatureDefinition__Group_1_0_1_1__2__Impl : ( '}' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5736:1: ( ( '}' ) )
            // InternalAlf.g:5737:1: ( '}' )
            {
            // InternalAlf.g:5737:1: ( '}' )
            // InternalAlf.g:5738:2: '}'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_0_1_1__2__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__0"
    // InternalAlf.g:5748:1: rule__UnnamedFeatureDefinition__Group_1_1__0 : rule__UnnamedFeatureDefinition__Group_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_1__1 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5752:1: ( rule__UnnamedFeatureDefinition__Group_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_1__1 )
            // InternalAlf.g:5753:2: rule__UnnamedFeatureDefinition__Group_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_29);
            rule__UnnamedFeatureDefinition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__0__Impl"
    // InternalAlf.g:5760:1: rule__UnnamedFeatureDefinition__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5764:1: ( ( '[' ) )
            // InternalAlf.g:5765:1: ( '[' )
            {
            // InternalAlf.g:5765:1: ( '[' )
            // InternalAlf.g:5766:2: '['
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__1"
    // InternalAlf.g:5775:1: rule__UnnamedFeatureDefinition__Group_1_1__1 : rule__UnnamedFeatureDefinition__Group_1_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_1__2 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5779:1: ( rule__UnnamedFeatureDefinition__Group_1_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_1__2 )
            // InternalAlf.g:5780:2: rule__UnnamedFeatureDefinition__Group_1_1__1__Impl rule__UnnamedFeatureDefinition__Group_1_1__2
            {
            pushFollow(FOLLOW_29);
            rule__UnnamedFeatureDefinition__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__1__Impl"
    // InternalAlf.g:5787:1: rule__UnnamedFeatureDefinition__Group_1_1__1__Impl : ( ( rule__UnnamedFeatureDefinition__Group_1_1_1__0 )? ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5791:1: ( ( ( rule__UnnamedFeatureDefinition__Group_1_1_1__0 )? ) )
            // InternalAlf.g:5792:1: ( ( rule__UnnamedFeatureDefinition__Group_1_1_1__0 )? )
            {
            // InternalAlf.g:5792:1: ( ( rule__UnnamedFeatureDefinition__Group_1_1_1__0 )? )
            // InternalAlf.g:5793:2: ( rule__UnnamedFeatureDefinition__Group_1_1_1__0 )?
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_1_1()); 
            // InternalAlf.g:5794:2: ( rule__UnnamedFeatureDefinition__Group_1_1_1__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_NATURAL_VALUE) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==45) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // InternalAlf.g:5794:3: rule__UnnamedFeatureDefinition__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnnamedFeatureDefinition__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__1__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__2"
    // InternalAlf.g:5802:1: rule__UnnamedFeatureDefinition__Group_1_1__2 : rule__UnnamedFeatureDefinition__Group_1_1__2__Impl rule__UnnamedFeatureDefinition__Group_1_1__3 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5806:1: ( rule__UnnamedFeatureDefinition__Group_1_1__2__Impl rule__UnnamedFeatureDefinition__Group_1_1__3 )
            // InternalAlf.g:5807:2: rule__UnnamedFeatureDefinition__Group_1_1__2__Impl rule__UnnamedFeatureDefinition__Group_1_1__3
            {
            pushFollow(FOLLOW_30);
            rule__UnnamedFeatureDefinition__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__2"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__2__Impl"
    // InternalAlf.g:5814:1: rule__UnnamedFeatureDefinition__Group_1_1__2__Impl : ( ( rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5818:1: ( ( ( rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2 ) ) )
            // InternalAlf.g:5819:1: ( ( rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2 ) )
            {
            // InternalAlf.g:5819:1: ( ( rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2 ) )
            // InternalAlf.g:5820:2: ( rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperAssignment_1_1_2()); 
            // InternalAlf.g:5821:2: ( rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2 )
            // InternalAlf.g:5821:3: rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__2__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__3"
    // InternalAlf.g:5829:1: rule__UnnamedFeatureDefinition__Group_1_1__3 : rule__UnnamedFeatureDefinition__Group_1_1__3__Impl rule__UnnamedFeatureDefinition__Group_1_1__4 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5833:1: ( rule__UnnamedFeatureDefinition__Group_1_1__3__Impl rule__UnnamedFeatureDefinition__Group_1_1__4 )
            // InternalAlf.g:5834:2: rule__UnnamedFeatureDefinition__Group_1_1__3__Impl rule__UnnamedFeatureDefinition__Group_1_1__4
            {
            pushFollow(FOLLOW_9);
            rule__UnnamedFeatureDefinition__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__3"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__3__Impl"
    // InternalAlf.g:5841:1: rule__UnnamedFeatureDefinition__Group_1_1__3__Impl : ( ']' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5845:1: ( ( ']' ) )
            // InternalAlf.g:5846:1: ( ']' )
            {
            // InternalAlf.g:5846:1: ( ']' )
            // InternalAlf.g:5847:2: ']'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__3__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__4"
    // InternalAlf.g:5856:1: rule__UnnamedFeatureDefinition__Group_1_1__4 : rule__UnnamedFeatureDefinition__Group_1_1__4__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5860:1: ( rule__UnnamedFeatureDefinition__Group_1_1__4__Impl )
            // InternalAlf.g:5861:2: rule__UnnamedFeatureDefinition__Group_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__4"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1__4__Impl"
    // InternalAlf.g:5867:1: rule__UnnamedFeatureDefinition__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5871:1: ( ( ';' ) )
            // InternalAlf.g:5872:1: ( ';' )
            {
            // InternalAlf.g:5872:1: ( ';' )
            // InternalAlf.g:5873:2: ';'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1__4__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1_1__0"
    // InternalAlf.g:5883:1: rule__UnnamedFeatureDefinition__Group_1_1_1__0 : rule__UnnamedFeatureDefinition__Group_1_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_1_1__1 ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5887:1: ( rule__UnnamedFeatureDefinition__Group_1_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_1_1__1 )
            // InternalAlf.g:5888:2: rule__UnnamedFeatureDefinition__Group_1_1_1__0__Impl rule__UnnamedFeatureDefinition__Group_1_1_1__1
            {
            pushFollow(FOLLOW_31);
            rule__UnnamedFeatureDefinition__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1_1__0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1_1__0__Impl"
    // InternalAlf.g:5895:1: rule__UnnamedFeatureDefinition__Group_1_1_1__0__Impl : ( ( rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0 ) ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5899:1: ( ( ( rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0 ) ) )
            // InternalAlf.g:5900:1: ( ( rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0 ) )
            {
            // InternalAlf.g:5900:1: ( ( rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0 ) )
            // InternalAlf.g:5901:2: ( rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0 )
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerAssignment_1_1_1_0()); 
            // InternalAlf.g:5902:2: ( rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0 )
            // InternalAlf.g:5902:3: rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerAssignment_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1_1__1"
    // InternalAlf.g:5910:1: rule__UnnamedFeatureDefinition__Group_1_1_1__1 : rule__UnnamedFeatureDefinition__Group_1_1_1__1__Impl ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5914:1: ( rule__UnnamedFeatureDefinition__Group_1_1_1__1__Impl )
            // InternalAlf.g:5915:2: rule__UnnamedFeatureDefinition__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedFeatureDefinition__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1_1__1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__Group_1_1_1__1__Impl"
    // InternalAlf.g:5921:1: rule__UnnamedFeatureDefinition__Group_1_1_1__1__Impl : ( '..' ) ;
    public final void rule__UnnamedFeatureDefinition__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5925:1: ( ( '..' ) )
            // InternalAlf.g:5926:1: ( '..' )
            {
            // InternalAlf.g:5926:1: ( '..' )
            // InternalAlf.g:5927:2: '..'
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_0__0"
    // InternalAlf.g:5937:1: rule__OwnedRedefinitionOrSubset__Group_0__0 : rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5941:1: ( rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 )
            // InternalAlf.g:5942:2: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1
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
    // InternalAlf.g:5949:1: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl : ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5953:1: ( ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) )
            // InternalAlf.g:5954:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            {
            // InternalAlf.g:5954:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            // InternalAlf.g:5955:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives_0_0()); 
            // InternalAlf.g:5956:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            // InternalAlf.g:5956:3: rule__OwnedRedefinitionOrSubset__Alternatives_0_0
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
    // InternalAlf.g:5964:1: rule__OwnedRedefinitionOrSubset__Group_0__1 : rule__OwnedRedefinitionOrSubset__Group_0__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5968:1: ( rule__OwnedRedefinitionOrSubset__Group_0__1__Impl )
            // InternalAlf.g:5969:2: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl
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
    // InternalAlf.g:5975:1: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5979:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) )
            // InternalAlf.g:5980:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            {
            // InternalAlf.g:5980:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            // InternalAlf.g:5981:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_0_1()); 
            // InternalAlf.g:5982:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            // InternalAlf.g:5982:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1
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
    // InternalAlf.g:5991:1: rule__OwnedRedefinitionOrSubset__Group_1__0 : rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5995:1: ( rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 )
            // InternalAlf.g:5996:2: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1
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
    // InternalAlf.g:6003:1: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl : ( 'subsets' ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6007:1: ( ( 'subsets' ) )
            // InternalAlf.g:6008:1: ( 'subsets' )
            {
            // InternalAlf.g:6008:1: ( 'subsets' )
            // InternalAlf.g:6009:2: 'subsets'
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
    // InternalAlf.g:6018:1: rule__OwnedRedefinitionOrSubset__Group_1__1 : rule__OwnedRedefinitionOrSubset__Group_1__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6022:1: ( rule__OwnedRedefinitionOrSubset__Group_1__1__Impl )
            // InternalAlf.g:6023:2: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl
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
    // InternalAlf.g:6029:1: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6033:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) )
            // InternalAlf.g:6034:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            {
            // InternalAlf.g:6034:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            // InternalAlf.g:6035:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_1_1()); 
            // InternalAlf.g:6036:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            // InternalAlf.g:6036:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1
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
    // InternalAlf.g:6045:1: rule__ConnectorDefinition__Group__0 : rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 ;
    public final void rule__ConnectorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6049:1: ( rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 )
            // InternalAlf.g:6050:2: rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1
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
    // InternalAlf.g:6057:1: rule__ConnectorDefinition__Group__0__Impl : ( ( rule__ConnectorDefinition__Group_0__0 )? ) ;
    public final void rule__ConnectorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6061:1: ( ( ( rule__ConnectorDefinition__Group_0__0 )? ) )
            // InternalAlf.g:6062:1: ( ( rule__ConnectorDefinition__Group_0__0 )? )
            {
            // InternalAlf.g:6062:1: ( ( rule__ConnectorDefinition__Group_0__0 )? )
            // InternalAlf.g:6063:2: ( rule__ConnectorDefinition__Group_0__0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup_0()); 
            // InternalAlf.g:6064:2: ( rule__ConnectorDefinition__Group_0__0 )?
            int alt76=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==18||LA76_1==42) ) {
                        alt76=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==18||LA76_2==42) ) {
                        alt76=1;
                    }
                    }
                    break;
                case 18:
                case 42:
                    {
                    alt76=1;
                    }
                    break;
            }

            switch (alt76) {
                case 1 :
                    // InternalAlf.g:6064:3: rule__ConnectorDefinition__Group_0__0
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
    // InternalAlf.g:6072:1: rule__ConnectorDefinition__Group__1 : rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 ;
    public final void rule__ConnectorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6076:1: ( rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 )
            // InternalAlf.g:6077:2: rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAlf.g:6084:1: rule__ConnectorDefinition__Group__1__Impl : ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) ) ;
    public final void rule__ConnectorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6088:1: ( ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) ) )
            // InternalAlf.g:6089:1: ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) )
            {
            // InternalAlf.g:6089:1: ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) )
            // InternalAlf.g:6090:2: ( rule__ConnectorDefinition__SourceFeatureAssignment_1 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureAssignment_1()); 
            // InternalAlf.g:6091:2: ( rule__ConnectorDefinition__SourceFeatureAssignment_1 )
            // InternalAlf.g:6091:3: rule__ConnectorDefinition__SourceFeatureAssignment_1
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
    // InternalAlf.g:6099:1: rule__ConnectorDefinition__Group__2 : rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 ;
    public final void rule__ConnectorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6103:1: ( rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 )
            // InternalAlf.g:6104:2: rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3
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
    // InternalAlf.g:6111:1: rule__ConnectorDefinition__Group__2__Impl : ( '=>' ) ;
    public final void rule__ConnectorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6115:1: ( ( '=>' ) )
            // InternalAlf.g:6116:1: ( '=>' )
            {
            // InternalAlf.g:6116:1: ( '=>' )
            // InternalAlf.g:6117:2: '=>'
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
    // InternalAlf.g:6126:1: rule__ConnectorDefinition__Group__3 : rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 ;
    public final void rule__ConnectorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6130:1: ( rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 )
            // InternalAlf.g:6131:2: rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4
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
    // InternalAlf.g:6138:1: rule__ConnectorDefinition__Group__3__Impl : ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) ) ;
    public final void rule__ConnectorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6142:1: ( ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) ) )
            // InternalAlf.g:6143:1: ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) )
            {
            // InternalAlf.g:6143:1: ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) )
            // InternalAlf.g:6144:2: ( rule__ConnectorDefinition__TargetFeatureAssignment_3 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureAssignment_3()); 
            // InternalAlf.g:6145:2: ( rule__ConnectorDefinition__TargetFeatureAssignment_3 )
            // InternalAlf.g:6145:3: rule__ConnectorDefinition__TargetFeatureAssignment_3
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
    // InternalAlf.g:6153:1: rule__ConnectorDefinition__Group__4 : rule__ConnectorDefinition__Group__4__Impl ;
    public final void rule__ConnectorDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6157:1: ( rule__ConnectorDefinition__Group__4__Impl )
            // InternalAlf.g:6158:2: rule__ConnectorDefinition__Group__4__Impl
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
    // InternalAlf.g:6164:1: rule__ConnectorDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__ConnectorDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6168:1: ( ( ';' ) )
            // InternalAlf.g:6169:1: ( ';' )
            {
            // InternalAlf.g:6169:1: ( ';' )
            // InternalAlf.g:6170:2: ';'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAlf.g:6180:1: rule__ConnectorDefinition__Group_0__0 : rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1 ;
    public final void rule__ConnectorDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6184:1: ( rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1 )
            // InternalAlf.g:6185:2: rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1
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
    // InternalAlf.g:6192:1: rule__ConnectorDefinition__Group_0__0__Impl : ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? ) ;
    public final void rule__ConnectorDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6196:1: ( ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? ) )
            // InternalAlf.g:6197:1: ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? )
            {
            // InternalAlf.g:6197:1: ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? )
            // InternalAlf.g:6198:2: ( rule__ConnectorDefinition__NameAssignment_0_0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getNameAssignment_0_0()); 
            // InternalAlf.g:6199:2: ( rule__ConnectorDefinition__NameAssignment_0_0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_ID && LA77_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:6199:3: rule__ConnectorDefinition__NameAssignment_0_0
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
    // InternalAlf.g:6207:1: rule__ConnectorDefinition__Group_0__1 : rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2 ;
    public final void rule__ConnectorDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6211:1: ( rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2 )
            // InternalAlf.g:6212:2: rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2
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
    // InternalAlf.g:6219:1: rule__ConnectorDefinition__Group_0__1__Impl : ( ( rule__ConnectorDefinition__Group_0_1__0 )? ) ;
    public final void rule__ConnectorDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6223:1: ( ( ( rule__ConnectorDefinition__Group_0_1__0 )? ) )
            // InternalAlf.g:6224:1: ( ( rule__ConnectorDefinition__Group_0_1__0 )? )
            {
            // InternalAlf.g:6224:1: ( ( rule__ConnectorDefinition__Group_0_1__0 )? )
            // InternalAlf.g:6225:2: ( rule__ConnectorDefinition__Group_0_1__0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup_0_1()); 
            // InternalAlf.g:6226:2: ( rule__ConnectorDefinition__Group_0_1__0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==42) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlf.g:6226:3: rule__ConnectorDefinition__Group_0_1__0
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
    // InternalAlf.g:6234:1: rule__ConnectorDefinition__Group_0__2 : rule__ConnectorDefinition__Group_0__2__Impl ;
    public final void rule__ConnectorDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6238:1: ( rule__ConnectorDefinition__Group_0__2__Impl )
            // InternalAlf.g:6239:2: rule__ConnectorDefinition__Group_0__2__Impl
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
    // InternalAlf.g:6245:1: rule__ConnectorDefinition__Group_0__2__Impl : ( 'is' ) ;
    public final void rule__ConnectorDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6249:1: ( ( 'is' ) )
            // InternalAlf.g:6250:1: ( 'is' )
            {
            // InternalAlf.g:6250:1: ( 'is' )
            // InternalAlf.g:6251:2: 'is'
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
    // InternalAlf.g:6261:1: rule__ConnectorDefinition__Group_0_1__0 : rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1 ;
    public final void rule__ConnectorDefinition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6265:1: ( rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1 )
            // InternalAlf.g:6266:2: rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1
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
    // InternalAlf.g:6273:1: rule__ConnectorDefinition__Group_0_1__0__Impl : ( ':' ) ;
    public final void rule__ConnectorDefinition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6277:1: ( ( ':' ) )
            // InternalAlf.g:6278:1: ( ':' )
            {
            // InternalAlf.g:6278:1: ( ':' )
            // InternalAlf.g:6279:2: ':'
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
    // InternalAlf.g:6288:1: rule__ConnectorDefinition__Group_0_1__1 : rule__ConnectorDefinition__Group_0_1__1__Impl ;
    public final void rule__ConnectorDefinition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6292:1: ( rule__ConnectorDefinition__Group_0_1__1__Impl )
            // InternalAlf.g:6293:2: rule__ConnectorDefinition__Group_0_1__1__Impl
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
    // InternalAlf.g:6299:1: rule__ConnectorDefinition__Group_0_1__1__Impl : ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) ) ;
    public final void rule__ConnectorDefinition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6303:1: ( ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) ) )
            // InternalAlf.g:6304:1: ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) )
            {
            // InternalAlf.g:6304:1: ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) )
            // InternalAlf.g:6305:2: ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getAssociationAssignment_0_1_1()); 
            // InternalAlf.g:6306:2: ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 )
            // InternalAlf.g:6306:3: rule__ConnectorDefinition__AssociationAssignment_0_1_1
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
    // InternalAlf.g:6315:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6319:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalAlf.g:6320:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAlf.g:6327:1: rule__BinaryExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6331:1: ( ( ruleUnaryExpression ) )
            // InternalAlf.g:6332:1: ( ruleUnaryExpression )
            {
            // InternalAlf.g:6332:1: ( ruleUnaryExpression )
            // InternalAlf.g:6333:2: ruleUnaryExpression
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
    // InternalAlf.g:6342:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6346:1: ( rule__BinaryExpression__Group__1__Impl )
            // InternalAlf.g:6347:2: rule__BinaryExpression__Group__1__Impl
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
    // InternalAlf.g:6353:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__Group_1__0 )? ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6357:1: ( ( ( rule__BinaryExpression__Group_1__0 )? ) )
            // InternalAlf.g:6358:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            {
            // InternalAlf.g:6358:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            // InternalAlf.g:6359:2: ( rule__BinaryExpression__Group_1__0 )?
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup_1()); 
            // InternalAlf.g:6360:2: ( rule__BinaryExpression__Group_1__0 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=24 && LA79_0<=28)||LA79_0==57) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalAlf.g:6360:3: rule__BinaryExpression__Group_1__0
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
    // InternalAlf.g:6369:1: rule__BinaryExpression__Group_1__0 : rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 ;
    public final void rule__BinaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6373:1: ( rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 )
            // InternalAlf.g:6374:2: rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAlf.g:6381:1: rule__BinaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6385:1: ( ( () ) )
            // InternalAlf.g:6386:1: ( () )
            {
            // InternalAlf.g:6386:1: ( () )
            // InternalAlf.g:6387:2: ()
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalAlf.g:6388:2: ()
            // InternalAlf.g:6388:3: 
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
    // InternalAlf.g:6396:1: rule__BinaryExpression__Group_1__1 : rule__BinaryExpression__Group_1__1__Impl ;
    public final void rule__BinaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6400:1: ( rule__BinaryExpression__Group_1__1__Impl )
            // InternalAlf.g:6401:2: rule__BinaryExpression__Group_1__1__Impl
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
    // InternalAlf.g:6407:1: rule__BinaryExpression__Group_1__1__Impl : ( ( rule__BinaryExpression__Alternatives_1_1 ) ) ;
    public final void rule__BinaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6411:1: ( ( ( rule__BinaryExpression__Alternatives_1_1 ) ) )
            // InternalAlf.g:6412:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            {
            // InternalAlf.g:6412:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            // InternalAlf.g:6413:2: ( rule__BinaryExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getAlternatives_1_1()); 
            // InternalAlf.g:6414:2: ( rule__BinaryExpression__Alternatives_1_1 )
            // InternalAlf.g:6414:3: rule__BinaryExpression__Alternatives_1_1
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
    // InternalAlf.g:6423:1: rule__BinaryExpression__Group_1_1_0__0 : rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 ;
    public final void rule__BinaryExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6427:1: ( rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 )
            // InternalAlf.g:6428:2: rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1
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
    // InternalAlf.g:6435:1: rule__BinaryExpression__Group_1_1_0__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6439:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) )
            // InternalAlf.g:6440:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            {
            // InternalAlf.g:6440:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            // InternalAlf.g:6441:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_0_0()); 
            // InternalAlf.g:6442:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            // InternalAlf.g:6442:3: rule__BinaryExpression__OperatorAssignment_1_1_0_0
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
    // InternalAlf.g:6450:1: rule__BinaryExpression__Group_1_1_0__1 : rule__BinaryExpression__Group_1_1_0__1__Impl ;
    public final void rule__BinaryExpression__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6454:1: ( rule__BinaryExpression__Group_1_1_0__1__Impl )
            // InternalAlf.g:6455:2: rule__BinaryExpression__Group_1_1_0__1__Impl
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
    // InternalAlf.g:6461:1: rule__BinaryExpression__Group_1_1_0__1__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6465:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) )
            // InternalAlf.g:6466:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            {
            // InternalAlf.g:6466:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            // InternalAlf.g:6467:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_0_1()); 
            // InternalAlf.g:6468:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            // InternalAlf.g:6468:3: rule__BinaryExpression__OperandAssignment_1_1_0_1
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
    // InternalAlf.g:6477:1: rule__BinaryExpression__Group_1_1_1__0 : rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 ;
    public final void rule__BinaryExpression__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6481:1: ( rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 )
            // InternalAlf.g:6482:2: rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAlf.g:6489:1: rule__BinaryExpression__Group_1_1_1__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6493:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) )
            // InternalAlf.g:6494:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            {
            // InternalAlf.g:6494:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            // InternalAlf.g:6495:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_1_0()); 
            // InternalAlf.g:6496:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            // InternalAlf.g:6496:3: rule__BinaryExpression__OperatorAssignment_1_1_1_0
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
    // InternalAlf.g:6504:1: rule__BinaryExpression__Group_1_1_1__1 : rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 ;
    public final void rule__BinaryExpression__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6508:1: ( rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 )
            // InternalAlf.g:6509:2: rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2
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
    // InternalAlf.g:6516:1: rule__BinaryExpression__Group_1_1_1__1__Impl : ( '[' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6520:1: ( ( '[' ) )
            // InternalAlf.g:6521:1: ( '[' )
            {
            // InternalAlf.g:6521:1: ( '[' )
            // InternalAlf.g:6522:2: '['
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
    // InternalAlf.g:6531:1: rule__BinaryExpression__Group_1_1_1__2 : rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 ;
    public final void rule__BinaryExpression__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6535:1: ( rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 )
            // InternalAlf.g:6536:2: rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalAlf.g:6543:1: rule__BinaryExpression__Group_1_1_1__2__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6547:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) )
            // InternalAlf.g:6548:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            {
            // InternalAlf.g:6548:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            // InternalAlf.g:6549:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_1_2()); 
            // InternalAlf.g:6550:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            // InternalAlf.g:6550:3: rule__BinaryExpression__OperandAssignment_1_1_1_2
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
    // InternalAlf.g:6558:1: rule__BinaryExpression__Group_1_1_1__3 : rule__BinaryExpression__Group_1_1_1__3__Impl ;
    public final void rule__BinaryExpression__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6562:1: ( rule__BinaryExpression__Group_1_1_1__3__Impl )
            // InternalAlf.g:6563:2: rule__BinaryExpression__Group_1_1_1__3__Impl
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
    // InternalAlf.g:6569:1: rule__BinaryExpression__Group_1_1_1__3__Impl : ( ']' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6573:1: ( ( ']' ) )
            // InternalAlf.g:6574:1: ( ']' )
            {
            // InternalAlf.g:6574:1: ( ']' )
            // InternalAlf.g:6575:2: ']'
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
    // InternalAlf.g:6585:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6589:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // InternalAlf.g:6590:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
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
    // InternalAlf.g:6597:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6601:1: ( ( () ) )
            // InternalAlf.g:6602:1: ( () )
            {
            // InternalAlf.g:6602:1: ( () )
            // InternalAlf.g:6603:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0()); 
            // InternalAlf.g:6604:2: ()
            // InternalAlf.g:6604:3: 
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
    // InternalAlf.g:6612:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6616:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // InternalAlf.g:6617:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAlf.g:6624:1: rule__UnaryExpression__Group_1__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6628:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) )
            // InternalAlf.g:6629:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAlf.g:6629:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            // InternalAlf.g:6630:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAlf.g:6631:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            // InternalAlf.g:6631:3: rule__UnaryExpression__OperatorAssignment_1_1
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
    // InternalAlf.g:6639:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6643:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // InternalAlf.g:6644:2: rule__UnaryExpression__Group_1__2__Impl
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
    // InternalAlf.g:6650:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6654:1: ( ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) )
            // InternalAlf.g:6655:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            {
            // InternalAlf.g:6655:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            // InternalAlf.g:6656:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2()); 
            // InternalAlf.g:6657:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            // InternalAlf.g:6657:3: rule__UnaryExpression__OperandAssignment_1_2
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


    // $ANTLR start "rule__SequenceAccessExpression__Group__0"
    // InternalAlf.g:6666:1: rule__SequenceAccessExpression__Group__0 : rule__SequenceAccessExpression__Group__0__Impl rule__SequenceAccessExpression__Group__1 ;
    public final void rule__SequenceAccessExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6670:1: ( rule__SequenceAccessExpression__Group__0__Impl rule__SequenceAccessExpression__Group__1 )
            // InternalAlf.g:6671:2: rule__SequenceAccessExpression__Group__0__Impl rule__SequenceAccessExpression__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__SequenceAccessExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceAccessExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group__0"


    // $ANTLR start "rule__SequenceAccessExpression__Group__0__Impl"
    // InternalAlf.g:6678:1: rule__SequenceAccessExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__SequenceAccessExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6682:1: ( ( rulePrimaryExpression ) )
            // InternalAlf.g:6683:1: ( rulePrimaryExpression )
            {
            // InternalAlf.g:6683:1: ( rulePrimaryExpression )
            // InternalAlf.g:6684:2: rulePrimaryExpression
            {
             before(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group__0__Impl"


    // $ANTLR start "rule__SequenceAccessExpression__Group__1"
    // InternalAlf.g:6693:1: rule__SequenceAccessExpression__Group__1 : rule__SequenceAccessExpression__Group__1__Impl ;
    public final void rule__SequenceAccessExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6697:1: ( rule__SequenceAccessExpression__Group__1__Impl )
            // InternalAlf.g:6698:2: rule__SequenceAccessExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceAccessExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group__1"


    // $ANTLR start "rule__SequenceAccessExpression__Group__1__Impl"
    // InternalAlf.g:6704:1: rule__SequenceAccessExpression__Group__1__Impl : ( ( rule__SequenceAccessExpression__Group_1__0 )* ) ;
    public final void rule__SequenceAccessExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6708:1: ( ( ( rule__SequenceAccessExpression__Group_1__0 )* ) )
            // InternalAlf.g:6709:1: ( ( rule__SequenceAccessExpression__Group_1__0 )* )
            {
            // InternalAlf.g:6709:1: ( ( rule__SequenceAccessExpression__Group_1__0 )* )
            // InternalAlf.g:6710:2: ( rule__SequenceAccessExpression__Group_1__0 )*
            {
             before(grammarAccess.getSequenceAccessExpressionAccess().getGroup_1()); 
            // InternalAlf.g:6711:2: ( rule__SequenceAccessExpression__Group_1__0 )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==43) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalAlf.g:6711:3: rule__SequenceAccessExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__SequenceAccessExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

             after(grammarAccess.getSequenceAccessExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group__1__Impl"


    // $ANTLR start "rule__SequenceAccessExpression__Group_1__0"
    // InternalAlf.g:6720:1: rule__SequenceAccessExpression__Group_1__0 : rule__SequenceAccessExpression__Group_1__0__Impl rule__SequenceAccessExpression__Group_1__1 ;
    public final void rule__SequenceAccessExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6724:1: ( rule__SequenceAccessExpression__Group_1__0__Impl rule__SequenceAccessExpression__Group_1__1 )
            // InternalAlf.g:6725:2: rule__SequenceAccessExpression__Group_1__0__Impl rule__SequenceAccessExpression__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__SequenceAccessExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceAccessExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group_1__0"


    // $ANTLR start "rule__SequenceAccessExpression__Group_1__0__Impl"
    // InternalAlf.g:6732:1: rule__SequenceAccessExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SequenceAccessExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6736:1: ( ( () ) )
            // InternalAlf.g:6737:1: ( () )
            {
            // InternalAlf.g:6737:1: ( () )
            // InternalAlf.g:6738:2: ()
            {
             before(grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0()); 
            // InternalAlf.g:6739:2: ()
            // InternalAlf.g:6739:3: 
            {
            }

             after(grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SequenceAccessExpression__Group_1__1"
    // InternalAlf.g:6747:1: rule__SequenceAccessExpression__Group_1__1 : rule__SequenceAccessExpression__Group_1__1__Impl rule__SequenceAccessExpression__Group_1__2 ;
    public final void rule__SequenceAccessExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6751:1: ( rule__SequenceAccessExpression__Group_1__1__Impl rule__SequenceAccessExpression__Group_1__2 )
            // InternalAlf.g:6752:2: rule__SequenceAccessExpression__Group_1__1__Impl rule__SequenceAccessExpression__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__SequenceAccessExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceAccessExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group_1__1"


    // $ANTLR start "rule__SequenceAccessExpression__Group_1__1__Impl"
    // InternalAlf.g:6759:1: rule__SequenceAccessExpression__Group_1__1__Impl : ( '[' ) ;
    public final void rule__SequenceAccessExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6763:1: ( ( '[' ) )
            // InternalAlf.g:6764:1: ( '[' )
            {
            // InternalAlf.g:6764:1: ( '[' )
            // InternalAlf.g:6765:2: '['
            {
             before(grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SequenceAccessExpression__Group_1__2"
    // InternalAlf.g:6774:1: rule__SequenceAccessExpression__Group_1__2 : rule__SequenceAccessExpression__Group_1__2__Impl rule__SequenceAccessExpression__Group_1__3 ;
    public final void rule__SequenceAccessExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6778:1: ( rule__SequenceAccessExpression__Group_1__2__Impl rule__SequenceAccessExpression__Group_1__3 )
            // InternalAlf.g:6779:2: rule__SequenceAccessExpression__Group_1__2__Impl rule__SequenceAccessExpression__Group_1__3
            {
            pushFollow(FOLLOW_30);
            rule__SequenceAccessExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceAccessExpression__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group_1__2"


    // $ANTLR start "rule__SequenceAccessExpression__Group_1__2__Impl"
    // InternalAlf.g:6786:1: rule__SequenceAccessExpression__Group_1__2__Impl : ( ( rule__SequenceAccessExpression__IndexAssignment_1_2 ) ) ;
    public final void rule__SequenceAccessExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6790:1: ( ( ( rule__SequenceAccessExpression__IndexAssignment_1_2 ) ) )
            // InternalAlf.g:6791:1: ( ( rule__SequenceAccessExpression__IndexAssignment_1_2 ) )
            {
            // InternalAlf.g:6791:1: ( ( rule__SequenceAccessExpression__IndexAssignment_1_2 ) )
            // InternalAlf.g:6792:2: ( rule__SequenceAccessExpression__IndexAssignment_1_2 )
            {
             before(grammarAccess.getSequenceAccessExpressionAccess().getIndexAssignment_1_2()); 
            // InternalAlf.g:6793:2: ( rule__SequenceAccessExpression__IndexAssignment_1_2 )
            // InternalAlf.g:6793:3: rule__SequenceAccessExpression__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceAccessExpression__IndexAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccessExpressionAccess().getIndexAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SequenceAccessExpression__Group_1__3"
    // InternalAlf.g:6801:1: rule__SequenceAccessExpression__Group_1__3 : rule__SequenceAccessExpression__Group_1__3__Impl ;
    public final void rule__SequenceAccessExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6805:1: ( rule__SequenceAccessExpression__Group_1__3__Impl )
            // InternalAlf.g:6806:2: rule__SequenceAccessExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceAccessExpression__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group_1__3"


    // $ANTLR start "rule__SequenceAccessExpression__Group_1__3__Impl"
    // InternalAlf.g:6812:1: rule__SequenceAccessExpression__Group_1__3__Impl : ( ']' ) ;
    public final void rule__SequenceAccessExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6816:1: ( ( ']' ) )
            // InternalAlf.g:6817:1: ( ']' )
            {
            // InternalAlf.g:6817:1: ( ']' )
            // InternalAlf.g:6818:2: ']'
            {
             before(grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__Group_1__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0"
    // InternalAlf.g:6828:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6832:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalAlf.g:6833:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
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
    // InternalAlf.g:6840:1: rule__PrimaryExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6844:1: ( ( '(' ) )
            // InternalAlf.g:6845:1: ( '(' )
            {
            // InternalAlf.g:6845:1: ( '(' )
            // InternalAlf.g:6846:2: '('
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
    // InternalAlf.g:6855:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6859:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalAlf.g:6860:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:6867:1: rule__PrimaryExpression__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6871:1: ( ( ruleExpression ) )
            // InternalAlf.g:6872:1: ( ruleExpression )
            {
            // InternalAlf.g:6872:1: ( ruleExpression )
            // InternalAlf.g:6873:2: ruleExpression
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
    // InternalAlf.g:6882:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6886:1: ( rule__PrimaryExpression__Group_4__2__Impl )
            // InternalAlf.g:6887:2: rule__PrimaryExpression__Group_4__2__Impl
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
    // InternalAlf.g:6893:1: rule__PrimaryExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6897:1: ( ( ')' ) )
            // InternalAlf.g:6898:1: ( ')' )
            {
            // InternalAlf.g:6898:1: ( ')' )
            // InternalAlf.g:6899:2: ')'
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
    // InternalAlf.g:6909:1: rule__InstanceCreationExpression__Group__0 : rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 ;
    public final void rule__InstanceCreationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6913:1: ( rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 )
            // InternalAlf.g:6914:2: rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAlf.g:6921:1: rule__InstanceCreationExpression__Group__0__Impl : ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6925:1: ( ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) )
            // InternalAlf.g:6926:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            {
            // InternalAlf.g:6926:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            // InternalAlf.g:6927:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassAssignment_0()); 
            // InternalAlf.g:6928:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            // InternalAlf.g:6928:3: rule__InstanceCreationExpression__ClassAssignment_0
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
    // InternalAlf.g:6936:1: rule__InstanceCreationExpression__Group__1 : rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 ;
    public final void rule__InstanceCreationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6940:1: ( rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 )
            // InternalAlf.g:6941:2: rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalAlf.g:6948:1: rule__InstanceCreationExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__InstanceCreationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6952:1: ( ( '(' ) )
            // InternalAlf.g:6953:1: ( '(' )
            {
            // InternalAlf.g:6953:1: ( '(' )
            // InternalAlf.g:6954:2: '('
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
    // InternalAlf.g:6963:1: rule__InstanceCreationExpression__Group__2 : rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 ;
    public final void rule__InstanceCreationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6967:1: ( rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 )
            // InternalAlf.g:6968:2: rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalAlf.g:6975:1: rule__InstanceCreationExpression__Group__2__Impl : ( ( rule__InstanceCreationExpression__Group_2__0 )? ) ;
    public final void rule__InstanceCreationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6979:1: ( ( ( rule__InstanceCreationExpression__Group_2__0 )? ) )
            // InternalAlf.g:6980:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            {
            // InternalAlf.g:6980:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            // InternalAlf.g:6981:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2()); 
            // InternalAlf.g:6982:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_STRING_VALUE)||(LA81_0>=24 && LA81_0<=26)||LA81_0==38||LA81_0==49||(LA81_0>=51 && LA81_0<=52)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAlf.g:6982:3: rule__InstanceCreationExpression__Group_2__0
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
    // InternalAlf.g:6990:1: rule__InstanceCreationExpression__Group__3 : rule__InstanceCreationExpression__Group__3__Impl ;
    public final void rule__InstanceCreationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6994:1: ( rule__InstanceCreationExpression__Group__3__Impl )
            // InternalAlf.g:6995:2: rule__InstanceCreationExpression__Group__3__Impl
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
    // InternalAlf.g:7001:1: rule__InstanceCreationExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__InstanceCreationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7005:1: ( ( ')' ) )
            // InternalAlf.g:7006:1: ( ')' )
            {
            // InternalAlf.g:7006:1: ( ')' )
            // InternalAlf.g:7007:2: ')'
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
    // InternalAlf.g:7017:1: rule__InstanceCreationExpression__Group_2__0 : rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 ;
    public final void rule__InstanceCreationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7021:1: ( rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 )
            // InternalAlf.g:7022:2: rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1
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
    // InternalAlf.g:7029:1: rule__InstanceCreationExpression__Group_2__0__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7033:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) )
            // InternalAlf.g:7034:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            {
            // InternalAlf.g:7034:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            // InternalAlf.g:7035:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_0()); 
            // InternalAlf.g:7036:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            // InternalAlf.g:7036:3: rule__InstanceCreationExpression__ArgumentAssignment_2_0
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
    // InternalAlf.g:7044:1: rule__InstanceCreationExpression__Group_2__1 : rule__InstanceCreationExpression__Group_2__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7048:1: ( rule__InstanceCreationExpression__Group_2__1__Impl )
            // InternalAlf.g:7049:2: rule__InstanceCreationExpression__Group_2__1__Impl
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
    // InternalAlf.g:7055:1: rule__InstanceCreationExpression__Group_2__1__Impl : ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) ;
    public final void rule__InstanceCreationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7059:1: ( ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:7060:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:7060:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            // InternalAlf.g:7061:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:7062:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==40) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalAlf.g:7062:3: rule__InstanceCreationExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InstanceCreationExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop82;
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
    // InternalAlf.g:7071:1: rule__InstanceCreationExpression__Group_2_1__0 : rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 ;
    public final void rule__InstanceCreationExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7075:1: ( rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 )
            // InternalAlf.g:7076:2: rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1
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
    // InternalAlf.g:7083:1: rule__InstanceCreationExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7087:1: ( ( ',' ) )
            // InternalAlf.g:7088:1: ( ',' )
            {
            // InternalAlf.g:7088:1: ( ',' )
            // InternalAlf.g:7089:2: ','
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
    // InternalAlf.g:7098:1: rule__InstanceCreationExpression__Group_2_1__1 : rule__InstanceCreationExpression__Group_2_1__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7102:1: ( rule__InstanceCreationExpression__Group_2_1__1__Impl )
            // InternalAlf.g:7103:2: rule__InstanceCreationExpression__Group_2_1__1__Impl
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
    // InternalAlf.g:7109:1: rule__InstanceCreationExpression__Group_2_1__1__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7113:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) )
            // InternalAlf.g:7114:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            {
            // InternalAlf.g:7114:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            // InternalAlf.g:7115:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_1_1()); 
            // InternalAlf.g:7116:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            // InternalAlf.g:7116:3: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1
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
    // InternalAlf.g:7125:1: rule__SequenceConstructionExpression__Group__0 : rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 ;
    public final void rule__SequenceConstructionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7129:1: ( rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 )
            // InternalAlf.g:7130:2: rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1
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
    // InternalAlf.g:7137:1: rule__SequenceConstructionExpression__Group__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7141:1: ( ( () ) )
            // InternalAlf.g:7142:1: ( () )
            {
            // InternalAlf.g:7142:1: ( () )
            // InternalAlf.g:7143:2: ()
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0()); 
            // InternalAlf.g:7144:2: ()
            // InternalAlf.g:7144:3: 
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
    // InternalAlf.g:7152:1: rule__SequenceConstructionExpression__Group__1 : rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 ;
    public final void rule__SequenceConstructionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7156:1: ( rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 )
            // InternalAlf.g:7157:2: rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalAlf.g:7164:1: rule__SequenceConstructionExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7168:1: ( ( '{' ) )
            // InternalAlf.g:7169:1: ( '{' )
            {
            // InternalAlf.g:7169:1: ( '{' )
            // InternalAlf.g:7170:2: '{'
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAlf.g:7179:1: rule__SequenceConstructionExpression__Group__2 : rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 ;
    public final void rule__SequenceConstructionExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7183:1: ( rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 )
            // InternalAlf.g:7184:2: rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalAlf.g:7191:1: rule__SequenceConstructionExpression__Group__2__Impl : ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) ;
    public final void rule__SequenceConstructionExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7195:1: ( ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) )
            // InternalAlf.g:7196:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            {
            // InternalAlf.g:7196:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            // InternalAlf.g:7197:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2()); 
            // InternalAlf.g:7198:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_STRING_VALUE)||(LA83_0>=24 && LA83_0<=26)||LA83_0==38||LA83_0==49||(LA83_0>=51 && LA83_0<=52)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAlf.g:7198:3: rule__SequenceConstructionExpression__Group_2__0
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
    // InternalAlf.g:7206:1: rule__SequenceConstructionExpression__Group__3 : rule__SequenceConstructionExpression__Group__3__Impl ;
    public final void rule__SequenceConstructionExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7210:1: ( rule__SequenceConstructionExpression__Group__3__Impl )
            // InternalAlf.g:7211:2: rule__SequenceConstructionExpression__Group__3__Impl
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
    // InternalAlf.g:7217:1: rule__SequenceConstructionExpression__Group__3__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7221:1: ( ( '}' ) )
            // InternalAlf.g:7222:1: ( '}' )
            {
            // InternalAlf.g:7222:1: ( '}' )
            // InternalAlf.g:7223:2: '}'
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAlf.g:7233:1: rule__SequenceConstructionExpression__Group_2__0 : rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 ;
    public final void rule__SequenceConstructionExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7237:1: ( rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 )
            // InternalAlf.g:7238:2: rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1
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
    // InternalAlf.g:7245:1: rule__SequenceConstructionExpression__Group_2__0__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7249:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) )
            // InternalAlf.g:7250:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            {
            // InternalAlf.g:7250:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            // InternalAlf.g:7251:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_0()); 
            // InternalAlf.g:7252:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            // InternalAlf.g:7252:3: rule__SequenceConstructionExpression__ElementAssignment_2_0
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
    // InternalAlf.g:7260:1: rule__SequenceConstructionExpression__Group_2__1 : rule__SequenceConstructionExpression__Group_2__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7264:1: ( rule__SequenceConstructionExpression__Group_2__1__Impl )
            // InternalAlf.g:7265:2: rule__SequenceConstructionExpression__Group_2__1__Impl
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
    // InternalAlf.g:7271:1: rule__SequenceConstructionExpression__Group_2__1__Impl : ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) ;
    public final void rule__SequenceConstructionExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7275:1: ( ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:7276:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:7276:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            // InternalAlf.g:7277:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:7278:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==40) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalAlf.g:7278:3: rule__SequenceConstructionExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SequenceConstructionExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // InternalAlf.g:7287:1: rule__SequenceConstructionExpression__Group_2_1__0 : rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7291:1: ( rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 )
            // InternalAlf.g:7292:2: rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1
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
    // InternalAlf.g:7299:1: rule__SequenceConstructionExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7303:1: ( ( ',' ) )
            // InternalAlf.g:7304:1: ( ',' )
            {
            // InternalAlf.g:7304:1: ( ',' )
            // InternalAlf.g:7305:2: ','
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
    // InternalAlf.g:7314:1: rule__SequenceConstructionExpression__Group_2_1__1 : rule__SequenceConstructionExpression__Group_2_1__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7318:1: ( rule__SequenceConstructionExpression__Group_2_1__1__Impl )
            // InternalAlf.g:7319:2: rule__SequenceConstructionExpression__Group_2_1__1__Impl
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
    // InternalAlf.g:7325:1: rule__SequenceConstructionExpression__Group_2_1__1__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7329:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) )
            // InternalAlf.g:7330:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            {
            // InternalAlf.g:7330:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            // InternalAlf.g:7331:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_1_1()); 
            // InternalAlf.g:7332:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            // InternalAlf.g:7332:3: rule__SequenceConstructionExpression__ElementAssignment_2_1_1
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
    // InternalAlf.g:7341:1: rule__NullLiteralExpression__Group__0 : rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 ;
    public final void rule__NullLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7345:1: ( rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 )
            // InternalAlf.g:7346:2: rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAlf.g:7353:1: rule__NullLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7357:1: ( ( () ) )
            // InternalAlf.g:7358:1: ( () )
            {
            // InternalAlf.g:7358:1: ( () )
            // InternalAlf.g:7359:2: ()
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0()); 
            // InternalAlf.g:7360:2: ()
            // InternalAlf.g:7360:3: 
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
    // InternalAlf.g:7368:1: rule__NullLiteralExpression__Group__1 : rule__NullLiteralExpression__Group__1__Impl ;
    public final void rule__NullLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7372:1: ( rule__NullLiteralExpression__Group__1__Impl )
            // InternalAlf.g:7373:2: rule__NullLiteralExpression__Group__1__Impl
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
    // InternalAlf.g:7379:1: rule__NullLiteralExpression__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7383:1: ( ( 'null' ) )
            // InternalAlf.g:7384:1: ( 'null' )
            {
            // InternalAlf.g:7384:1: ( 'null' )
            // InternalAlf.g:7385:2: 'null'
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
    // InternalAlf.g:7395:1: rule__RealValue__Group__0 : rule__RealValue__Group__0__Impl rule__RealValue__Group__1 ;
    public final void rule__RealValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7399:1: ( rule__RealValue__Group__0__Impl rule__RealValue__Group__1 )
            // InternalAlf.g:7400:2: rule__RealValue__Group__0__Impl rule__RealValue__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAlf.g:7407:1: rule__RealValue__Group__0__Impl : ( ( rule__RealValue__Alternatives_0 ) ) ;
    public final void rule__RealValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7411:1: ( ( ( rule__RealValue__Alternatives_0 ) ) )
            // InternalAlf.g:7412:1: ( ( rule__RealValue__Alternatives_0 ) )
            {
            // InternalAlf.g:7412:1: ( ( rule__RealValue__Alternatives_0 ) )
            // InternalAlf.g:7413:2: ( rule__RealValue__Alternatives_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_0()); 
            // InternalAlf.g:7414:2: ( rule__RealValue__Alternatives_0 )
            // InternalAlf.g:7414:3: rule__RealValue__Alternatives_0
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
    // InternalAlf.g:7422:1: rule__RealValue__Group__1 : rule__RealValue__Group__1__Impl ;
    public final void rule__RealValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7426:1: ( rule__RealValue__Group__1__Impl )
            // InternalAlf.g:7427:2: rule__RealValue__Group__1__Impl
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
    // InternalAlf.g:7433:1: rule__RealValue__Group__1__Impl : ( ( rule__RealValue__Group_1__0 )? ) ;
    public final void rule__RealValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7437:1: ( ( ( rule__RealValue__Group_1__0 )? ) )
            // InternalAlf.g:7438:1: ( ( rule__RealValue__Group_1__0 )? )
            {
            // InternalAlf.g:7438:1: ( ( rule__RealValue__Group_1__0 )? )
            // InternalAlf.g:7439:2: ( rule__RealValue__Group_1__0 )?
            {
             before(grammarAccess.getRealValueAccess().getGroup_1()); 
            // InternalAlf.g:7440:2: ( rule__RealValue__Group_1__0 )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=29 && LA85_0<=30)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:7440:3: rule__RealValue__Group_1__0
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
    // InternalAlf.g:7449:1: rule__RealValue__Group_0_0__0 : rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 ;
    public final void rule__RealValue__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7453:1: ( rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 )
            // InternalAlf.g:7454:2: rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalAlf.g:7461:1: rule__RealValue__Group_0_0__0__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7465:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:7466:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:7466:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:7467:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:7476:1: rule__RealValue__Group_0_0__1 : rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 ;
    public final void rule__RealValue__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7480:1: ( rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 )
            // InternalAlf.g:7481:2: rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalAlf.g:7488:1: rule__RealValue__Group_0_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7492:1: ( ( '.' ) )
            // InternalAlf.g:7493:1: ( '.' )
            {
            // InternalAlf.g:7493:1: ( '.' )
            // InternalAlf.g:7494:2: '.'
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
    // InternalAlf.g:7503:1: rule__RealValue__Group_0_0__2 : rule__RealValue__Group_0_0__2__Impl ;
    public final void rule__RealValue__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7507:1: ( rule__RealValue__Group_0_0__2__Impl )
            // InternalAlf.g:7508:2: rule__RealValue__Group_0_0__2__Impl
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
    // InternalAlf.g:7514:1: rule__RealValue__Group_0_0__2__Impl : ( ( RULE_NATURAL_VALUE )? ) ;
    public final void rule__RealValue__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7518:1: ( ( ( RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:7519:1: ( ( RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:7519:1: ( ( RULE_NATURAL_VALUE )? )
            // InternalAlf.g:7520:2: ( RULE_NATURAL_VALUE )?
            {
             before(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2()); 
            // InternalAlf.g:7521:2: ( RULE_NATURAL_VALUE )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_NATURAL_VALUE) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAlf.g:7521:3: RULE_NATURAL_VALUE
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
    // InternalAlf.g:7530:1: rule__RealValue__Group_0_1__0 : rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 ;
    public final void rule__RealValue__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7534:1: ( rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 )
            // InternalAlf.g:7535:2: rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalAlf.g:7542:1: rule__RealValue__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7546:1: ( ( '.' ) )
            // InternalAlf.g:7547:1: ( '.' )
            {
            // InternalAlf.g:7547:1: ( '.' )
            // InternalAlf.g:7548:2: '.'
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
    // InternalAlf.g:7557:1: rule__RealValue__Group_0_1__1 : rule__RealValue__Group_0_1__1__Impl ;
    public final void rule__RealValue__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7561:1: ( rule__RealValue__Group_0_1__1__Impl )
            // InternalAlf.g:7562:2: rule__RealValue__Group_0_1__1__Impl
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
    // InternalAlf.g:7568:1: rule__RealValue__Group_0_1__1__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7572:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:7573:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:7573:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:7574:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:7584:1: rule__RealValue__Group_1__0 : rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 ;
    public final void rule__RealValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7588:1: ( rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 )
            // InternalAlf.g:7589:2: rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalAlf.g:7596:1: rule__RealValue__Group_1__0__Impl : ( ( rule__RealValue__Alternatives_1_0 ) ) ;
    public final void rule__RealValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7600:1: ( ( ( rule__RealValue__Alternatives_1_0 ) ) )
            // InternalAlf.g:7601:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            {
            // InternalAlf.g:7601:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            // InternalAlf.g:7602:2: ( rule__RealValue__Alternatives_1_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_0()); 
            // InternalAlf.g:7603:2: ( rule__RealValue__Alternatives_1_0 )
            // InternalAlf.g:7603:3: rule__RealValue__Alternatives_1_0
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
    // InternalAlf.g:7611:1: rule__RealValue__Group_1__1 : rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 ;
    public final void rule__RealValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7615:1: ( rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 )
            // InternalAlf.g:7616:2: rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalAlf.g:7623:1: rule__RealValue__Group_1__1__Impl : ( ( rule__RealValue__Alternatives_1_1 )? ) ;
    public final void rule__RealValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7627:1: ( ( ( rule__RealValue__Alternatives_1_1 )? ) )
            // InternalAlf.g:7628:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            {
            // InternalAlf.g:7628:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            // InternalAlf.g:7629:2: ( rule__RealValue__Alternatives_1_1 )?
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_1()); 
            // InternalAlf.g:7630:2: ( rule__RealValue__Alternatives_1_1 )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=24 && LA87_0<=25)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAlf.g:7630:3: rule__RealValue__Alternatives_1_1
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
    // InternalAlf.g:7638:1: rule__RealValue__Group_1__2 : rule__RealValue__Group_1__2__Impl ;
    public final void rule__RealValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7642:1: ( rule__RealValue__Group_1__2__Impl )
            // InternalAlf.g:7643:2: rule__RealValue__Group_1__2__Impl
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
    // InternalAlf.g:7649:1: rule__RealValue__Group_1__2__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7653:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:7654:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:7654:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:7655:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:7665:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0 : rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7669:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 )
            // InternalAlf.g:7670:2: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAlf.g:7677:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7681:1: ( ( () ) )
            // InternalAlf.g:7682:1: ( () )
            {
            // InternalAlf.g:7682:1: ( () )
            // InternalAlf.g:7683:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0()); 
            // InternalAlf.g:7684:2: ()
            // InternalAlf.g:7684:3: 
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
    // InternalAlf.g:7692:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1 : rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7696:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl )
            // InternalAlf.g:7697:2: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl
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
    // InternalAlf.g:7703:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl : ( '*' ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7707:1: ( ( '*' ) )
            // InternalAlf.g:7708:1: ( '*' )
            {
            // InternalAlf.g:7708:1: ( '*' )
            // InternalAlf.g:7709:2: '*'
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAlf.g:7719:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7723:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:7724:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalAlf.g:7731:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7735:1: ( ( ruleName ) )
            // InternalAlf.g:7736:1: ( ruleName )
            {
            // InternalAlf.g:7736:1: ( ruleName )
            // InternalAlf.g:7737:2: ruleName
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
    // InternalAlf.g:7746:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7750:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:7751:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:7757:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7761:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:7762:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:7762:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:7763:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:7764:2: ( rule__QualifiedName__Group_1__0 )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==52) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalAlf.g:7764:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop88;
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
    // InternalAlf.g:7773:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7777:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:7778:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAlf.g:7785:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7789:1: ( ( '.' ) )
            // InternalAlf.g:7790:1: ( '.' )
            {
            // InternalAlf.g:7790:1: ( '.' )
            // InternalAlf.g:7791:2: '.'
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
    // InternalAlf.g:7800:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7804:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:7805:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAlf.g:7811:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7815:1: ( ( ruleName ) )
            // InternalAlf.g:7816:1: ( ruleName )
            {
            // InternalAlf.g:7816:1: ( ruleName )
            // InternalAlf.g:7817:2: ruleName
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
    // InternalAlf.g:7827:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7831:1: ( ( ruleName ) )
            // InternalAlf.g:7832:2: ( ruleName )
            {
            // InternalAlf.g:7832:2: ( ruleName )
            // InternalAlf.g:7833:3: ruleName
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
    // InternalAlf.g:7842:1: rule__PackageDefinition__OwnedMembershipAssignment_3 : ( rulePackageMember ) ;
    public final void rule__PackageDefinition__OwnedMembershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7846:1: ( ( rulePackageMember ) )
            // InternalAlf.g:7847:2: ( rulePackageMember )
            {
            // InternalAlf.g:7847:2: ( rulePackageMember )
            // InternalAlf.g:7848:3: rulePackageMember
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
    // InternalAlf.g:7857:1: rule__NonFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__NonFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7861:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:7862:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:7862:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:7863:3: ruleVisibilityIndicator
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
    // InternalAlf.g:7872:1: rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 : ( ruleNonFeatureDefinition ) ;
    public final void rule__NonFeatureMember__OwnedMemberElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7876:1: ( ( ruleNonFeatureDefinition ) )
            // InternalAlf.g:7877:2: ( ruleNonFeatureDefinition )
            {
            // InternalAlf.g:7877:2: ( ruleNonFeatureDefinition )
            // InternalAlf.g:7878:3: ruleNonFeatureDefinition
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
    // InternalAlf.g:7887:1: rule__NonFeatureMember__MemberNameAssignment_1_1_1 : ( ruleName ) ;
    public final void rule__NonFeatureMember__MemberNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7891:1: ( ( ruleName ) )
            // InternalAlf.g:7892:2: ( ruleName )
            {
            // InternalAlf.g:7892:2: ( ruleName )
            // InternalAlf.g:7893:3: ruleName
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
    // InternalAlf.g:7902:1: rule__NonFeatureMember__MemberElementAssignment_1_1_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFeatureMember__MemberElementAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7906:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7907:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7907:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7908:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementCrossReference_1_1_3_0()); 
            // InternalAlf.g:7909:3: ( ruleQualifiedName )
            // InternalAlf.g:7910:4: ruleQualifiedName
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
    // InternalAlf.g:7921:1: rule__PackagedFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__PackagedFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7925:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:7926:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:7926:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:7927:3: ruleVisibilityIndicator
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
    // InternalAlf.g:7936:1: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 : ( ruleNamedFeatureDefinition ) ;
    public final void rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7940:1: ( ( ruleNamedFeatureDefinition ) )
            // InternalAlf.g:7941:2: ( ruleNamedFeatureDefinition )
            {
            // InternalAlf.g:7941:2: ( ruleNamedFeatureDefinition )
            // InternalAlf.g:7942:3: ruleNamedFeatureDefinition
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_1_0()); 

            }


            }

        }
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
    // InternalAlf.g:7951:1: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 : ( ruleUnnamedFeatureDefinition ) ;
    public final void rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7955:1: ( ( ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:7956:2: ( ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:7956:2: ( ruleUnnamedFeatureDefinition )
            // InternalAlf.g:7957:3: ruleUnnamedFeatureDefinition
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnnamedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_1_0()); 

            }


            }

        }
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
    // InternalAlf.g:7966:1: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 : ( ruleName ) ;
    public final void rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7970:1: ( ( ruleName ) )
            // InternalAlf.g:7971:2: ( ruleName )
            {
            // InternalAlf.g:7971:2: ( ruleName )
            // InternalAlf.g:7972:3: ruleName
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
    // InternalAlf.g:7981:1: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 : ( ruleName ) ;
    public final void rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7985:1: ( ( ruleName ) )
            // InternalAlf.g:7986:2: ( ruleName )
            {
            // InternalAlf.g:7986:2: ( ruleName )
            // InternalAlf.g:7987:3: ruleName
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
    // InternalAlf.g:7996:1: rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PackagedFeatureMember__MemberElementAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8000:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8001:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8001:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8002:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_2_2_0()); 
            // InternalAlf.g:8003:3: ( ruleQualifiedName )
            // InternalAlf.g:8004:4: ruleQualifiedName
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
    // InternalAlf.g:8015:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8019:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:8020:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:8020:2: ( ( 'abstract' ) )
            // InternalAlf.g:8021:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:8022:3: ( 'abstract' )
            // InternalAlf.g:8023:4: 'abstract'
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
    // InternalAlf.g:8034:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8038:1: ( ( ruleName ) )
            // InternalAlf.g:8039:2: ( ruleName )
            {
            // InternalAlf.g:8039:2: ( ruleName )
            // InternalAlf.g:8040:3: ruleName
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
    // InternalAlf.g:8049:1: rule__ClassDeclaration__OwnedMembershipAssignment_3_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedMembershipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8053:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:8054:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:8054:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:8055:3: ruleOwnedGeneralization
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
    // InternalAlf.g:8064:1: rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8068:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:8069:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:8069:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:8070:3: ruleOwnedGeneralization
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
    // InternalAlf.g:8079:1: rule__OwnedGeneralization__OwnedMemberElementAssignment : ( ruleGeneralization ) ;
    public final void rule__OwnedGeneralization__OwnedMemberElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8083:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:8084:2: ( ruleGeneralization )
            {
            // InternalAlf.g:8084:2: ( ruleGeneralization )
            // InternalAlf.g:8085:3: ruleGeneralization
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
    // InternalAlf.g:8094:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8098:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8099:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8099:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8100:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:8101:3: ( ruleQualifiedName )
            // InternalAlf.g:8102:4: ruleQualifiedName
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
    // InternalAlf.g:8113:1: rule__ClassDefinition__OwnedMembershipAssignment_2 : ( ruleClassMember ) ;
    public final void rule__ClassDefinition__OwnedMembershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8117:1: ( ( ruleClassMember ) )
            // InternalAlf.g:8118:2: ( ruleClassMember )
            {
            // InternalAlf.g:8118:2: ( ruleClassMember )
            // InternalAlf.g:8119:3: ruleClassMember
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
    // InternalAlf.g:8128:1: rule__ClassFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__ClassFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8132:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:8133:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:8133:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:8134:3: ruleVisibilityIndicator
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


    // $ANTLR start "rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1"
    // InternalAlf.g:8143:1: rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1 : ( ( 'part' ) ) ;
    public final void rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8147:1: ( ( ( 'part' ) ) )
            // InternalAlf.g:8148:2: ( ( 'part' ) )
            {
            // InternalAlf.g:8148:2: ( ( 'part' ) )
            // InternalAlf.g:8149:3: ( 'part' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0()); 
            // InternalAlf.g:8150:3: ( 'part' )
            // InternalAlf.g:8151:4: 'part'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1"


    // $ANTLR start "rule__ClassFeatureMember__IsPortAssignment_1_0_0_2"
    // InternalAlf.g:8162:1: rule__ClassFeatureMember__IsPortAssignment_1_0_0_2 : ( ( 'port' ) ) ;
    public final void rule__ClassFeatureMember__IsPortAssignment_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8166:1: ( ( ( 'port' ) ) )
            // InternalAlf.g:8167:2: ( ( 'port' ) )
            {
            // InternalAlf.g:8167:2: ( ( 'port' ) )
            // InternalAlf.g:8168:3: ( 'port' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0()); 
            // InternalAlf.g:8169:3: ( 'port' )
            // InternalAlf.g:8170:4: 'port'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__IsPortAssignment_1_0_0_2"


    // $ANTLR start "rule__ClassFeatureMember__DirectionAssignment_1_0_1"
    // InternalAlf.g:8181:1: rule__ClassFeatureMember__DirectionAssignment_1_0_1 : ( ruleFeatureDirection ) ;
    public final void rule__ClassFeatureMember__DirectionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8185:1: ( ( ruleFeatureDirection ) )
            // InternalAlf.g:8186:2: ( ruleFeatureDirection )
            {
            // InternalAlf.g:8186:2: ( ruleFeatureDirection )
            // InternalAlf.g:8187:3: ruleFeatureDirection
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDirection();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__DirectionAssignment_1_0_1"


    // $ANTLR start "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2"
    // InternalAlf.g:8196:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 : ( ruleNamedFeatureDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8200:1: ( ( ruleNamedFeatureDefinition ) )
            // InternalAlf.g:8201:2: ( ruleNamedFeatureDefinition )
            {
            // InternalAlf.g:8201:2: ( ruleNamedFeatureDefinition )
            // InternalAlf.g:8202:3: ruleNamedFeatureDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2"


    // $ANTLR start "rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1"
    // InternalAlf.g:8211:1: rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1 : ( ( 'part' ) ) ;
    public final void rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8215:1: ( ( ( 'part' ) ) )
            // InternalAlf.g:8216:2: ( ( 'part' ) )
            {
            // InternalAlf.g:8216:2: ( ( 'part' ) )
            // InternalAlf.g:8217:3: ( 'part' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_1_0_1_0()); 
            // InternalAlf.g:8218:3: ( 'part' )
            // InternalAlf.g:8219:4: 'part'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_1_0_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_1_0_1_0()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1"


    // $ANTLR start "rule__ClassFeatureMember__IsPortAssignment_1_1_0_2"
    // InternalAlf.g:8230:1: rule__ClassFeatureMember__IsPortAssignment_1_1_0_2 : ( ( 'port' ) ) ;
    public final void rule__ClassFeatureMember__IsPortAssignment_1_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8234:1: ( ( ( 'port' ) ) )
            // InternalAlf.g:8235:2: ( ( 'port' ) )
            {
            // InternalAlf.g:8235:2: ( ( 'port' ) )
            // InternalAlf.g:8236:3: ( 'port' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_2_0()); 
            // InternalAlf.g:8237:3: ( 'port' )
            // InternalAlf.g:8238:4: 'port'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_2_0()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__IsPortAssignment_1_1_0_2"


    // $ANTLR start "rule__ClassFeatureMember__DirectionAssignment_1_1_1"
    // InternalAlf.g:8249:1: rule__ClassFeatureMember__DirectionAssignment_1_1_1 : ( ruleFeatureDirection ) ;
    public final void rule__ClassFeatureMember__DirectionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8253:1: ( ( ruleFeatureDirection ) )
            // InternalAlf.g:8254:2: ( ruleFeatureDirection )
            {
            // InternalAlf.g:8254:2: ( ruleFeatureDirection )
            // InternalAlf.g:8255:3: ruleFeatureDirection
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDirection();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__DirectionAssignment_1_1_1"


    // $ANTLR start "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2"
    // InternalAlf.g:8264:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 : ( ruleUnnamedFeatureDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8268:1: ( ( ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:8269:2: ( ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:8269:2: ( ruleUnnamedFeatureDefinition )
            // InternalAlf.g:8270:3: ruleUnnamedFeatureDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnnamedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2"


    // $ANTLR start "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1"
    // InternalAlf.g:8279:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 : ( ruleConnectorDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8283:1: ( ( ruleConnectorDefinition ) )
            // InternalAlf.g:8284:2: ( ruleConnectorDefinition )
            {
            // InternalAlf.g:8284:2: ( ruleConnectorDefinition )
            // InternalAlf.g:8285:3: ruleConnectorDefinition
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


    // $ANTLR start "rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1"
    // InternalAlf.g:8294:1: rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1 : ( ( 'part' ) ) ;
    public final void rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8298:1: ( ( ( 'part' ) ) )
            // InternalAlf.g:8299:2: ( ( 'part' ) )
            {
            // InternalAlf.g:8299:2: ( ( 'part' ) )
            // InternalAlf.g:8300:3: ( 'part' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_3_0_0_0_1_0()); 
            // InternalAlf.g:8301:3: ( 'part' )
            // InternalAlf.g:8302:4: 'part'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_3_0_0_0_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_3_0_0_0_1_0()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_3_0_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1"


    // $ANTLR start "rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1"
    // InternalAlf.g:8313:1: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 : ( ruleName ) ;
    public final void rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8317:1: ( ( ruleName ) )
            // InternalAlf.g:8318:2: ( ruleName )
            {
            // InternalAlf.g:8318:2: ( ruleName )
            // InternalAlf.g:8319:3: ruleName
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
    // InternalAlf.g:8328:1: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 : ( ruleName ) ;
    public final void rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8332:1: ( ( ruleName ) )
            // InternalAlf.g:8333:2: ( ruleName )
            {
            // InternalAlf.g:8333:2: ( ruleName )
            // InternalAlf.g:8334:3: ruleName
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
    // InternalAlf.g:8343:1: rule__ClassFeatureMember__MemberElementAssignment_1_3_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassFeatureMember__MemberElementAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8347:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8348:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8348:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8349:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementCrossReference_1_3_2_0()); 
            // InternalAlf.g:8350:3: ( ruleQualifiedName )
            // InternalAlf.g:8351:4: ruleQualifiedName
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
    // InternalAlf.g:8362:1: rule__AssociationDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__AssociationDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8366:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:8367:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:8367:2: ( ( 'abstract' ) )
            // InternalAlf.g:8368:3: ( 'abstract' )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:8369:3: ( 'abstract' )
            // InternalAlf.g:8370:4: 'abstract'
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
    // InternalAlf.g:8381:1: rule__AssociationDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__AssociationDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8385:1: ( ( ruleName ) )
            // InternalAlf.g:8386:2: ( ruleName )
            {
            // InternalAlf.g:8386:2: ( ruleName )
            // InternalAlf.g:8387:3: ruleName
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
    // InternalAlf.g:8396:1: rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__AssociationDeclaration__OwnedMembershipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8400:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:8401:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:8401:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:8402:3: ruleOwnedGeneralization
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
    // InternalAlf.g:8411:1: rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8415:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:8416:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:8416:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:8417:3: ruleOwnedGeneralization
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
    // InternalAlf.g:8426:1: rule__AssociationDefinition__OwnedMembershipAssignment_2 : ( rulePackagedFeatureMember ) ;
    public final void rule__AssociationDefinition__OwnedMembershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8430:1: ( ( rulePackagedFeatureMember ) )
            // InternalAlf.g:8431:2: ( rulePackagedFeatureMember )
            {
            // InternalAlf.g:8431:2: ( rulePackagedFeatureMember )
            // InternalAlf.g:8432:3: rulePackagedFeatureMember
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
    // InternalAlf.g:8441:1: rule__AssociationDefinition__OwnedMembershipAssignment_3 : ( rulePackagedFeatureMember ) ;
    public final void rule__AssociationDefinition__OwnedMembershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8445:1: ( ( rulePackagedFeatureMember ) )
            // InternalAlf.g:8446:2: ( rulePackagedFeatureMember )
            {
            // InternalAlf.g:8446:2: ( rulePackagedFeatureMember )
            // InternalAlf.g:8447:3: rulePackagedFeatureMember
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


    // $ANTLR start "rule__NamedFeatureDefinition__NameAssignment_0"
    // InternalAlf.g:8456:1: rule__NamedFeatureDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__NamedFeatureDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8460:1: ( ( ruleName ) )
            // InternalAlf.g:8461:2: ( ruleName )
            {
            // InternalAlf.g:8461:2: ( ruleName )
            // InternalAlf.g:8462:3: ruleName
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__NameAssignment_0"


    // $ANTLR start "rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1"
    // InternalAlf.g:8471:1: rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1 : ( ( 'composes' ) ) ;
    public final void rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8475:1: ( ( ( 'composes' ) ) )
            // InternalAlf.g:8476:2: ( ( 'composes' ) )
            {
            // InternalAlf.g:8476:2: ( ( 'composes' ) )
            // InternalAlf.g:8477:3: ( 'composes' )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_0_0_1_0()); 
            // InternalAlf.g:8478:3: ( 'composes' )
            // InternalAlf.g:8479:4: 'composes'
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_0_0_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_0_0_1_0()); 

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__IsCompositeAssignment_1_0_0_1"


    // $ANTLR start "rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0"
    // InternalAlf.g:8490:1: rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8494:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8495:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8495:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8496:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_0_2_0_0()); 
            // InternalAlf.g:8497:3: ( ruleQualifiedName )
            // InternalAlf.g:8498:4: ruleQualifiedName
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_1_0_0_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_1_0_0_2_0_0_1()); 

            }

             after(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__ReferencedTypeAssignment_1_0_0_2_0"


    // $ANTLR start "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3"
    // InternalAlf.g:8509:1: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8513:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:8514:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:8514:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:8515:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_0_3"


    // $ANTLR start "rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0"
    // InternalAlf.g:8524:1: rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8528:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:8529:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:8529:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:8530:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__LowerAssignment_1_0_1_1_0"


    // $ANTLR start "rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2"
    // InternalAlf.g:8539:1: rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8543:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:8544:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:8544:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:8545:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__UpperAssignment_1_0_1_2"


    // $ANTLR start "rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1"
    // InternalAlf.g:8554:1: rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1 : ( ruleExpression ) ;
    public final void rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8558:1: ( ( ruleExpression ) )
            // InternalAlf.g:8559:2: ( ruleExpression )
            {
            // InternalAlf.g:8559:2: ( ruleExpression )
            // InternalAlf.g:8560:3: ruleExpression
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__ValueAssignment_1_0_2_1"


    // $ANTLR start "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1"
    // InternalAlf.g:8569:1: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1 : ( ruleClassMember ) ;
    public final void rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8573:1: ( ( ruleClassMember ) )
            // InternalAlf.g:8574:2: ( ruleClassMember )
            {
            // InternalAlf.g:8574:2: ( ruleClassMember )
            // InternalAlf.g:8575:3: ruleClassMember
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_0_3_1_1"


    // $ANTLR start "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0"
    // InternalAlf.g:8584:1: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8588:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:8589:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:8589:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:8590:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_0"


    // $ANTLR start "rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0"
    // InternalAlf.g:8599:1: rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8603:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:8604:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:8604:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:8605:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__LowerAssignment_1_1_1_0_0_1_0"


    // $ANTLR start "rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2"
    // InternalAlf.g:8614:1: rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8618:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:8619:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:8619:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:8620:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__UpperAssignment_1_1_1_0_0_2"


    // $ANTLR start "rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1"
    // InternalAlf.g:8629:1: rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1 : ( ruleExpression ) ;
    public final void rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8633:1: ( ( ruleExpression ) )
            // InternalAlf.g:8634:2: ( ruleExpression )
            {
            // InternalAlf.g:8634:2: ( ruleExpression )
            // InternalAlf.g:8635:3: ruleExpression
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_1_1_0_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_1_1_0_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__ValueAssignment_1_1_1_0_1_0_1"


    // $ANTLR start "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1"
    // InternalAlf.g:8644:1: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1 : ( ruleClassMember ) ;
    public final void rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8648:1: ( ( ruleClassMember ) )
            // InternalAlf.g:8649:2: ( ruleClassMember )
            {
            // InternalAlf.g:8649:2: ( ruleClassMember )
            // InternalAlf.g:8650:3: ruleClassMember
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_0_2_1_1"


    // $ANTLR start "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1"
    // InternalAlf.g:8659:1: rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1 : ( ruleClassMember ) ;
    public final void rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8663:1: ( ( ruleClassMember ) )
            // InternalAlf.g:8664:2: ( ruleClassMember )
            {
            // InternalAlf.g:8664:2: ( ruleClassMember )
            // InternalAlf.g:8665:3: ruleClassMember
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__OwnedMembershipAssignment_1_1_1_0_1_1_1"


    // $ANTLR start "rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0"
    // InternalAlf.g:8674:1: rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8678:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:8679:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:8679:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:8680:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__LowerAssignment_1_1_1_1_1_0"


    // $ANTLR start "rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2"
    // InternalAlf.g:8689:1: rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8693:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:8694:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:8694:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:8695:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedFeatureDefinition__UpperAssignment_1_1_1_1_2"


    // $ANTLR start "rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0"
    // InternalAlf.g:8704:1: rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8708:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:8709:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:8709:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:8710:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0"
    // InternalAlf.g:8719:1: rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8723:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:8724:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:8724:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:8725:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__LowerAssignment_1_0_0_1_0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2"
    // InternalAlf.g:8734:1: rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8738:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:8739:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:8739:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:8740:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__UpperAssignment_1_0_0_2"


    // $ANTLR start "rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1"
    // InternalAlf.g:8749:1: rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1 : ( ruleExpression ) ;
    public final void rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8753:1: ( ( ruleExpression ) )
            // InternalAlf.g:8754:2: ( ruleExpression )
            {
            // InternalAlf.g:8754:2: ( ruleExpression )
            // InternalAlf.g:8755:3: ruleExpression
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__ValueAssignment_1_0_1_0_1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1"
    // InternalAlf.g:8764:1: rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1 : ( ruleClassMember ) ;
    public final void rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8768:1: ( ( ruleClassMember ) )
            // InternalAlf.g:8769:2: ( ruleClassMember )
            {
            // InternalAlf.g:8769:2: ( ruleClassMember )
            // InternalAlf.g:8770:3: ruleClassMember
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_0_2_1_1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1"
    // InternalAlf.g:8779:1: rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1 : ( ruleClassMember ) ;
    public final void rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8783:1: ( ( ruleClassMember ) )
            // InternalAlf.g:8784:2: ( ruleClassMember )
            {
            // InternalAlf.g:8784:2: ( ruleClassMember )
            // InternalAlf.g:8785:3: ruleClassMember
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__OwnedMembershipAssignment_1_0_1_1_1"


    // $ANTLR start "rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0"
    // InternalAlf.g:8794:1: rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8798:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:8799:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:8799:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:8800:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__LowerAssignment_1_1_1_0"


    // $ANTLR start "rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2"
    // InternalAlf.g:8809:1: rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8813:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:8814:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:8814:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:8815:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedFeatureDefinition__UpperAssignment_1_1_2"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1"
    // InternalAlf.g:8824:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 : ( ruleRedefinition ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8828:1: ( ( ruleRedefinition ) )
            // InternalAlf.g:8829:2: ( ruleRedefinition )
            {
            // InternalAlf.g:8829:2: ( ruleRedefinition )
            // InternalAlf.g:8830:3: ruleRedefinition
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
    // InternalAlf.g:8839:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 : ( ruleSubset ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8843:1: ( ( ruleSubset ) )
            // InternalAlf.g:8844:2: ( ruleSubset )
            {
            // InternalAlf.g:8844:2: ( ruleSubset )
            // InternalAlf.g:8845:3: ruleSubset
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
    // InternalAlf.g:8854:1: rule__Redefinition__RedefinedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Redefinition__RedefinedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8858:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8859:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8859:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8860:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:8861:3: ( ruleQualifiedName )
            // InternalAlf.g:8862:4: ruleQualifiedName
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
    // InternalAlf.g:8873:1: rule__Subset__SubsettedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Subset__SubsettedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8877:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8878:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8878:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8879:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:8880:3: ( ruleQualifiedName )
            // InternalAlf.g:8881:4: ruleQualifiedName
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
    // InternalAlf.g:8892:1: rule__ConnectorDefinition__NameAssignment_0_0 : ( ruleName ) ;
    public final void rule__ConnectorDefinition__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8896:1: ( ( ruleName ) )
            // InternalAlf.g:8897:2: ( ruleName )
            {
            // InternalAlf.g:8897:2: ( ruleName )
            // InternalAlf.g:8898:3: ruleName
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
    // InternalAlf.g:8907:1: rule__ConnectorDefinition__AssociationAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__AssociationAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8911:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8912:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8912:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8913:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0()); 
            // InternalAlf.g:8914:3: ( ruleQualifiedName )
            // InternalAlf.g:8915:4: ruleQualifiedName
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
    // InternalAlf.g:8926:1: rule__ConnectorDefinition__SourceFeatureAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__SourceFeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8930:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8931:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8931:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8932:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0()); 
            // InternalAlf.g:8933:3: ( ruleQualifiedName )
            // InternalAlf.g:8934:4: ruleQualifiedName
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
    // InternalAlf.g:8945:1: rule__ConnectorDefinition__TargetFeatureAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__TargetFeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8949:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8950:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8950:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8951:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0()); 
            // InternalAlf.g:8952:3: ( ruleQualifiedName )
            // InternalAlf.g:8953:4: ruleQualifiedName
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
    // InternalAlf.g:8964:1: rule__BinaryExpression__OperatorAssignment_1_1_0_0 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8968:1: ( ( ruleBinaryOperator ) )
            // InternalAlf.g:8969:2: ( ruleBinaryOperator )
            {
            // InternalAlf.g:8969:2: ( ruleBinaryOperator )
            // InternalAlf.g:8970:3: ruleBinaryOperator
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
    // InternalAlf.g:8979:1: rule__BinaryExpression__OperandAssignment_1_1_0_1 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8983:1: ( ( ruleExpression ) )
            // InternalAlf.g:8984:2: ( ruleExpression )
            {
            // InternalAlf.g:8984:2: ( ruleExpression )
            // InternalAlf.g:8985:3: ruleExpression
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
    // InternalAlf.g:8994:1: rule__BinaryExpression__OperatorAssignment_1_1_1_0 : ( ( '@' ) ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8998:1: ( ( ( '@' ) ) )
            // InternalAlf.g:8999:2: ( ( '@' ) )
            {
            // InternalAlf.g:8999:2: ( ( '@' ) )
            // InternalAlf.g:9000:3: ( '@' )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 
            // InternalAlf.g:9001:3: ( '@' )
            // InternalAlf.g:9002:4: '@'
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalAlf.g:9013:1: rule__BinaryExpression__OperandAssignment_1_1_1_2 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9017:1: ( ( ruleExpression ) )
            // InternalAlf.g:9018:2: ( ruleExpression )
            {
            // InternalAlf.g:9018:2: ( ruleExpression )
            // InternalAlf.g:9019:3: ruleExpression
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
    // InternalAlf.g:9028:1: rule__UnaryExpression__OperatorAssignment_1_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9032:1: ( ( ruleUnaryOperator ) )
            // InternalAlf.g:9033:2: ( ruleUnaryOperator )
            {
            // InternalAlf.g:9033:2: ( ruleUnaryOperator )
            // InternalAlf.g:9034:3: ruleUnaryOperator
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
    // InternalAlf.g:9043:1: rule__UnaryExpression__OperandAssignment_1_2 : ( ruleSequenceAccessExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9047:1: ( ( ruleSequenceAccessExpression ) )
            // InternalAlf.g:9048:2: ( ruleSequenceAccessExpression )
            {
            // InternalAlf.g:9048:2: ( ruleSequenceAccessExpression )
            // InternalAlf.g:9049:3: ruleSequenceAccessExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandSequenceAccessExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSequenceAccessExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperandSequenceAccessExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SequenceAccessExpression__IndexAssignment_1_2"
    // InternalAlf.g:9058:1: rule__SequenceAccessExpression__IndexAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__SequenceAccessExpression__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9062:1: ( ( ruleExpression ) )
            // InternalAlf.g:9063:2: ( ruleExpression )
            {
            // InternalAlf.g:9063:2: ( ruleExpression )
            // InternalAlf.g:9064:3: ruleExpression
            {
             before(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceAccessExpression__IndexAssignment_1_2"


    // $ANTLR start "rule__ElementReferenceExpression__ReferentAssignment"
    // InternalAlf.g:9073:1: rule__ElementReferenceExpression__ReferentAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementReferenceExpression__ReferentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9077:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:9078:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:9078:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:9079:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0()); 
            // InternalAlf.g:9080:3: ( ruleQualifiedName )
            // InternalAlf.g:9081:4: ruleQualifiedName
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
    // InternalAlf.g:9092:1: rule__InstanceCreationExpression__ClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InstanceCreationExpression__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9096:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:9097:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:9097:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:9098:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0()); 
            // InternalAlf.g:9099:3: ( ruleQualifiedName )
            // InternalAlf.g:9100:4: ruleQualifiedName
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
    // InternalAlf.g:9111:1: rule__InstanceCreationExpression__ArgumentAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9115:1: ( ( ruleExpression ) )
            // InternalAlf.g:9116:2: ( ruleExpression )
            {
            // InternalAlf.g:9116:2: ( ruleExpression )
            // InternalAlf.g:9117:3: ruleExpression
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
    // InternalAlf.g:9126:1: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9130:1: ( ( ruleExpression ) )
            // InternalAlf.g:9131:2: ( ruleExpression )
            {
            // InternalAlf.g:9131:2: ( ruleExpression )
            // InternalAlf.g:9132:3: ruleExpression
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
    // InternalAlf.g:9141:1: rule__SequenceConstructionExpression__ElementAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9145:1: ( ( ruleExpression ) )
            // InternalAlf.g:9146:2: ( ruleExpression )
            {
            // InternalAlf.g:9146:2: ( ruleExpression )
            // InternalAlf.g:9147:3: ruleExpression
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
    // InternalAlf.g:9156:1: rule__SequenceConstructionExpression__ElementAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9160:1: ( ( ruleExpression ) )
            // InternalAlf.g:9161:2: ( ruleExpression )
            {
            // InternalAlf.g:9161:2: ( ruleExpression )
            // InternalAlf.g:9162:3: ruleExpression
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
    // InternalAlf.g:9171:1: rule__BooleanLiteralExpression__ValueAssignment : ( RULE_BOOLEAN_VALUE ) ;
    public final void rule__BooleanLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9175:1: ( ( RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:9176:2: ( RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:9176:2: ( RULE_BOOLEAN_VALUE )
            // InternalAlf.g:9177:3: RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:9186:1: rule__StringLiteralExpression__ValueAssignment : ( RULE_STRING_VALUE ) ;
    public final void rule__StringLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9190:1: ( ( RULE_STRING_VALUE ) )
            // InternalAlf.g:9191:2: ( RULE_STRING_VALUE )
            {
            // InternalAlf.g:9191:2: ( RULE_STRING_VALUE )
            // InternalAlf.g:9192:3: RULE_STRING_VALUE
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
    // InternalAlf.g:9201:1: rule__RealLiteralExpression__ValueAssignment : ( ruleRealValue ) ;
    public final void rule__RealLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9205:1: ( ( ruleRealValue ) )
            // InternalAlf.g:9206:2: ( ruleRealValue )
            {
            // InternalAlf.g:9206:2: ( ruleRealValue )
            // InternalAlf.g:9207:3: ruleRealValue
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
    // InternalAlf.g:9216:1: rule__NaturalLiteralExpression__ValueAssignment : ( RULE_NATURAL_VALUE ) ;
    public final void rule__NaturalLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:9220:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:9221:2: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:9221:2: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:9222:3: RULE_NATURAL_VALUE
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
    protected DFA32 dfa32 = new DFA32(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\17\1\4\1\uffff\2\4\2\22\1\uffff\4\22\2\4\4\26\2\4\4\26";
    static final String dfa_3s = "\1\65\1\22\1\uffff\2\22\2\46\1\uffff\4\46\2\5\4\64\2\5\4\64";
    static final String dfa_4s = "\2\uffff\1\1\4\uffff\1\2\20\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\43\uffff\1\2",
            "\1\5\1\6\14\uffff\1\7",
            "",
            "\1\10\1\11\14\uffff\1\7",
            "\1\12\1\13\14\uffff\1\7",
            "\1\7\23\uffff\1\2",
            "\1\7\23\uffff\1\2",
            "",
            "\1\14\1\2\22\uffff\1\2",
            "\1\14\1\2\22\uffff\1\2",
            "\1\15\1\2\22\uffff\1\2",
            "\1\15\1\2\22\uffff\1\2",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\7\17\uffff\1\2\1\uffff\1\2\13\uffff\1\22",
            "\1\7\17\uffff\1\2\1\uffff\1\2\13\uffff\1\22",
            "\1\7\17\uffff\1\2\1\uffff\1\2\13\uffff\1\23",
            "\1\7\17\uffff\1\2\1\uffff\1\2\13\uffff\1\23",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\7\17\uffff\1\2\1\uffff\1\2\13\uffff\1\22",
            "\1\7\17\uffff\1\2\1\uffff\1\2\13\uffff\1\22",
            "\1\7\17\uffff\1\2\1\uffff\1\2\13\uffff\1\23",
            "\1\7\17\uffff\1\2\1\uffff\1\2\13\uffff\1\23"
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
            return "1251:1: rule__NonFeatureMember__Alternatives_1 : ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\25\uffff";
    static final String dfa_8s = "\2\4\4\22\1\4\1\uffff\1\4\1\uffff\4\26\1\4\1\uffff\1\4\4\26";
    static final String dfa_9s = "\1\24\5\57\1\5\1\uffff\1\5\1\uffff\4\64\1\5\1\uffff\1\5\4\64";
    static final String dfa_10s = "\7\uffff\1\2\1\uffff\1\1\5\uffff\1\3\5\uffff";
    static final String dfa_11s = "\25\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\16\uffff\1\1",
            "\1\4\1\5\14\uffff\1\6\4\uffff\1\7\27\uffff\1\7",
            "\1\10\3\uffff\2\11\16\uffff\1\11\3\uffff\2\11\2\uffff\2\11",
            "\1\10\3\uffff\2\11\16\uffff\1\11\3\uffff\2\11\2\uffff\2\11",
            "\1\10\3\uffff\2\11\16\uffff\1\11\3\uffff\2\11\2\uffff\2\11",
            "\1\10\3\uffff\2\11\16\uffff\1\11\3\uffff\2\11\2\uffff\2\11",
            "\1\12\1\13",
            "",
            "\1\14\1\15",
            "",
            "\1\17\17\uffff\1\7\4\uffff\1\7\2\uffff\1\7\5\uffff\1\16",
            "\1\17\17\uffff\1\7\4\uffff\1\7\2\uffff\1\7\5\uffff\1\16",
            "\1\17\17\uffff\1\11\4\uffff\1\11\2\uffff\1\11\5\uffff\1\20",
            "\1\17\17\uffff\1\11\4\uffff\1\11\2\uffff\1\11\5\uffff\1\20",
            "\1\21\1\22",
            "",
            "\1\23\1\24",
            "\1\17\17\uffff\1\7\4\uffff\1\7\2\uffff\1\7\5\uffff\1\16",
            "\1\17\17\uffff\1\7\4\uffff\1\7\2\uffff\1\7\5\uffff\1\16",
            "\1\17\17\uffff\1\11\4\uffff\1\11\2\uffff\1\11\5\uffff\1\20",
            "\1\17\17\uffff\1\11\4\uffff\1\11\2\uffff\1\11\5\uffff\1\20"
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
            return "1299:1: rule__PackagedFeatureMember__Alternatives_1 : ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_2__0 ) ) );";
        }
    }
    static final String dfa_13s = "\33\uffff";
    static final String dfa_14s = "\4\4\1\uffff\2\22\1\uffff\2\22\4\4\1\uffff\1\4\4\26\1\4\1\uffff\1\4\4\26";
    static final String dfa_15s = "\1\67\3\57\1\uffff\2\57\1\uffff\2\57\1\5\3\57\1\uffff\1\5\4\64\1\5\1\uffff\1\5\4\64";
    static final String dfa_16s = "\4\uffff\1\1\2\uffff\1\3\6\uffff\1\2\6\uffff\1\4\5\uffff";
    static final String dfa_17s = "\33\uffff}>";
    static final String[] dfa_18s = {
            "\1\5\1\6\16\uffff\1\1\16\uffff\3\4\3\uffff\1\7\14\uffff\1\2\1\3",
            "\1\10\1\11\14\uffff\1\12\4\uffff\1\16\13\uffff\1\13\1\14\1\15\11\uffff\1\16",
            "\1\10\1\11\14\uffff\1\12\4\uffff\1\16\13\uffff\1\13\1\14\1\15\11\uffff\1\16",
            "\2\4\14\uffff\1\16\4\uffff\1\16\13\uffff\1\13\1\14\1\15\11\uffff\1\16",
            "",
            "\1\17\3\uffff\2\4\16\uffff\1\4\3\uffff\2\4\2\uffff\2\4",
            "\1\17\3\uffff\2\4\16\uffff\1\4\3\uffff\2\4\2\uffff\2\4",
            "",
            "\1\17\3\uffff\2\4\16\uffff\1\4\3\uffff\2\4\2\uffff\2\4",
            "\1\17\3\uffff\2\4\16\uffff\1\4\3\uffff\2\4\2\uffff\2\4",
            "\1\20\1\21",
            "\2\4\14\uffff\1\16\4\uffff\1\16\27\uffff\1\16",
            "\2\4\14\uffff\1\16\4\uffff\1\16\27\uffff\1\16",
            "\2\4\14\uffff\1\16\4\uffff\1\16\27\uffff\1\16",
            "",
            "\1\22\1\23",
            "\1\25\17\uffff\1\16\4\uffff\1\16\2\uffff\1\16\5\uffff\1\24",
            "\1\25\17\uffff\1\16\4\uffff\1\16\2\uffff\1\16\5\uffff\1\24",
            "\1\25\17\uffff\1\4\4\uffff\1\4\2\uffff\1\4\5\uffff\1\26",
            "\1\25\17\uffff\1\4\4\uffff\1\4\2\uffff\1\4\5\uffff\1\26",
            "\1\27\1\30",
            "",
            "\1\31\1\32",
            "\1\25\17\uffff\1\16\4\uffff\1\16\2\uffff\1\16\5\uffff\1\24",
            "\1\25\17\uffff\1\16\4\uffff\1\16\2\uffff\1\16\5\uffff\1\24",
            "\1\25\17\uffff\1\4\4\uffff\1\4\2\uffff\1\4\5\uffff\1\26",
            "\1\25\17\uffff\1\4\4\uffff\1\4\2\uffff\1\4\5\uffff\1\26"
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
            return "1431:1: rule__ClassFeatureMember__Alternatives_1 : ( ( ( rule__ClassFeatureMember__Group_1_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_2__0 ) ) | ( ( rule__ClassFeatureMember__Group_1_3__0 ) ) );";
        }
    }
    static final String dfa_19s = "\13\uffff";
    static final String dfa_20s = "\2\uffff\2\10\5\uffff\2\10";
    static final String dfa_21s = "\1\4\1\uffff\2\26\2\uffff\1\4\2\uffff\2\26";
    static final String dfa_22s = "\1\64\1\uffff\2\71\2\uffff\1\5\2\uffff\2\71";
    static final String dfa_23s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\3\1\2\2\uffff";
    static final String dfa_24s = "\13\uffff}>";
    static final String[] dfa_25s = {
            "\1\2\1\3\3\1\21\uffff\1\1\13\uffff\1\4\12\uffff\1\5\1\uffff\2\1",
            "",
            "\1\10\1\uffff\5\10\11\uffff\3\10\2\uffff\2\10\4\uffff\1\7\1\10\1\uffff\1\6\4\uffff\1\10",
            "\1\10\1\uffff\5\10\11\uffff\3\10\2\uffff\2\10\4\uffff\1\7\1\10\1\uffff\1\6\4\uffff\1\10",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\1\10\1\uffff\5\10\11\uffff\3\10\2\uffff\2\10\4\uffff\1\7\1\10\1\uffff\1\6\4\uffff\1\10",
            "\1\10\1\uffff\5\10\11\uffff\3\10\2\uffff\2\10\4\uffff\1\7\1\10\1\uffff\1\6\4\uffff\1\10"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1914:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0020008780138030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0020000780138032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0020000780038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0020000780138030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000840000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00E002BF80138030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00E0023F80138032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00E0023F80138030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00C0003800100030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000803800840000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000040030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000038000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000CC4000C40000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00004C4000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0100000000200030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x001A0040070001F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000484000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x020000001F000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x001A0040040001F0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x001E0040070001F0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x001A00C0070001F0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000002L});

}