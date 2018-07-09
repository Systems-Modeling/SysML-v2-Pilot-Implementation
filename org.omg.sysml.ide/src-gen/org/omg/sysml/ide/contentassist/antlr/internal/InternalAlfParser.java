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


    // $ANTLR start "entryRuleAccessExpression"
    // InternalAlf.g:803:1: entryRuleAccessExpression : ruleAccessExpression EOF ;
    public final void entryRuleAccessExpression() throws RecognitionException {
        try {
            // InternalAlf.g:804:1: ( ruleAccessExpression EOF )
            // InternalAlf.g:805:1: ruleAccessExpression EOF
            {
             before(grammarAccess.getAccessExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessExpression();

            state._fsp--;

             after(grammarAccess.getAccessExpressionRule()); 
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
    // $ANTLR end "entryRuleAccessExpression"


    // $ANTLR start "ruleAccessExpression"
    // InternalAlf.g:812:1: ruleAccessExpression : ( ( rule__AccessExpression__Group__0 ) ) ;
    public final void ruleAccessExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:816:2: ( ( ( rule__AccessExpression__Group__0 ) ) )
            // InternalAlf.g:817:2: ( ( rule__AccessExpression__Group__0 ) )
            {
            // InternalAlf.g:817:2: ( ( rule__AccessExpression__Group__0 ) )
            // InternalAlf.g:818:3: ( rule__AccessExpression__Group__0 )
            {
             before(grammarAccess.getAccessExpressionAccess().getGroup()); 
            // InternalAlf.g:819:3: ( rule__AccessExpression__Group__0 )
            // InternalAlf.g:819:4: rule__AccessExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessExpression"


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


    // $ANTLR start "rule__TypedFeatureDefinition__Alternatives_1_2"
    // InternalAlf.g:1581:1: rule__TypedFeatureDefinition__Alternatives_1_2 : ( ( ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 ) ) | ( 'any' ) );
    public final void rule__TypedFeatureDefinition__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1585:1: ( ( ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 ) ) | ( 'any' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt17=1;
            }
            else if ( (LA17_0==21) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlf.g:1586:2: ( ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 ) )
                    {
                    // InternalAlf.g:1586:2: ( ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 ) )
                    // InternalAlf.g:1587:3: ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 )
                    {
                     before(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeAssignment_1_2_0()); 
                    // InternalAlf.g:1588:3: ( rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 )
                    // InternalAlf.g:1588:4: rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0
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
                    // InternalAlf.g:1592:2: ( 'any' )
                    {
                    // InternalAlf.g:1592:2: ( 'any' )
                    // InternalAlf.g:1593:3: 'any'
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


    // $ANTLR start "rule__TypedFeatureDefinition__Alternatives_4"
    // InternalAlf.g:1602:1: rule__TypedFeatureDefinition__Alternatives_4 : ( ( ';' ) | ( ( rule__TypedFeatureDefinition__Group_4_1__0 ) ) );
    public final void rule__TypedFeatureDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1606:1: ( ( ';' ) | ( ( rule__TypedFeatureDefinition__Group_4_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:1607:2: ( ';' )
                    {
                    // InternalAlf.g:1607:2: ( ';' )
                    // InternalAlf.g:1608:3: ';'
                    {
                     before(grammarAccess.getTypedFeatureDefinitionAccess().getSemicolonKeyword_4_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTypedFeatureDefinitionAccess().getSemicolonKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1613:2: ( ( rule__TypedFeatureDefinition__Group_4_1__0 ) )
                    {
                    // InternalAlf.g:1613:2: ( ( rule__TypedFeatureDefinition__Group_4_1__0 ) )
                    // InternalAlf.g:1614:3: ( rule__TypedFeatureDefinition__Group_4_1__0 )
                    {
                     before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_4_1()); 
                    // InternalAlf.g:1615:3: ( rule__TypedFeatureDefinition__Group_4_1__0 )
                    // InternalAlf.g:1615:4: rule__TypedFeatureDefinition__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__TypedFeatureDefinition__Alternatives_4"


    // $ANTLR start "rule__UntypedFeatureDefinition__Alternatives_2"
    // InternalAlf.g:1623:1: rule__UntypedFeatureDefinition__Alternatives_2 : ( ( ( rule__UntypedFeatureDefinition__Group_2_0__0 ) ) | ( ( rule__UntypedFeatureDefinition__Group_2_1__0 ) ) );
    public final void rule__UntypedFeatureDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1627:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_0__0 ) ) | ( ( rule__UntypedFeatureDefinition__Group_2_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_NATURAL_VALUE) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==45) ) {
                        int LA19_5 = input.LA(4);

                        if ( (LA19_5==RULE_NATURAL_VALUE) ) {
                            int LA19_7 = input.LA(5);

                            if ( (LA19_7==44) ) {
                                int LA19_6 = input.LA(6);

                                if ( (LA19_6==22) ) {
                                    alt19=2;
                                }
                                else if ( (LA19_6==38||LA19_6==46) ) {
                                    alt19=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 19, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA19_5==26) ) {
                            int LA19_4 = input.LA(5);

                            if ( (LA19_4==44) ) {
                                int LA19_6 = input.LA(6);

                                if ( (LA19_6==22) ) {
                                    alt19=2;
                                }
                                else if ( (LA19_6==38||LA19_6==46) ) {
                                    alt19=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 19, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA19_3==44) ) {
                        int LA19_6 = input.LA(4);

                        if ( (LA19_6==22) ) {
                            alt19=2;
                        }
                        else if ( (LA19_6==38||LA19_6==46) ) {
                            alt19=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA19_1==26) ) {
                    int LA19_4 = input.LA(3);

                    if ( (LA19_4==44) ) {
                        int LA19_6 = input.LA(4);

                        if ( (LA19_6==22) ) {
                            alt19=2;
                        }
                        else if ( (LA19_6==38||LA19_6==46) ) {
                            alt19=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==38||LA19_0==46) ) {
                alt19=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAlf.g:1628:2: ( ( rule__UntypedFeatureDefinition__Group_2_0__0 ) )
                    {
                    // InternalAlf.g:1628:2: ( ( rule__UntypedFeatureDefinition__Group_2_0__0 ) )
                    // InternalAlf.g:1629:3: ( rule__UntypedFeatureDefinition__Group_2_0__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0()); 
                    // InternalAlf.g:1630:3: ( rule__UntypedFeatureDefinition__Group_2_0__0 )
                    // InternalAlf.g:1630:4: rule__UntypedFeatureDefinition__Group_2_0__0
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
                    // InternalAlf.g:1634:2: ( ( rule__UntypedFeatureDefinition__Group_2_1__0 ) )
                    {
                    // InternalAlf.g:1634:2: ( ( rule__UntypedFeatureDefinition__Group_2_1__0 ) )
                    // InternalAlf.g:1635:3: ( rule__UntypedFeatureDefinition__Group_2_1__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_1()); 
                    // InternalAlf.g:1636:3: ( rule__UntypedFeatureDefinition__Group_2_1__0 )
                    // InternalAlf.g:1636:4: rule__UntypedFeatureDefinition__Group_2_1__0
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
    // InternalAlf.g:1644:1: rule__UntypedFeatureDefinition__Alternatives_2_0_1 : ( ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 ) ) | ( ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 ) ) );
    public final void rule__UntypedFeatureDefinition__Alternatives_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1648:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 ) ) | ( ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlf.g:1649:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 ) )
                    {
                    // InternalAlf.g:1649:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 ) )
                    // InternalAlf.g:1650:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_1_0()); 
                    // InternalAlf.g:1651:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0 )
                    // InternalAlf.g:1651:4: rule__UntypedFeatureDefinition__Group_2_0_1_0__0
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
                    // InternalAlf.g:1655:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 ) )
                    {
                    // InternalAlf.g:1655:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 ) )
                    // InternalAlf.g:1656:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_1_1()); 
                    // InternalAlf.g:1657:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0 )
                    // InternalAlf.g:1657:4: rule__UntypedFeatureDefinition__Group_2_0_1_1__0
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


    // $ANTLR start "rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2"
    // InternalAlf.g:1665:1: rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2 : ( ( ';' ) | ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0 ) ) );
    public final void rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1669:1: ( ( ';' ) | ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
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
                    // InternalAlf.g:1670:2: ( ';' )
                    {
                    // InternalAlf.g:1670:2: ( ';' )
                    // InternalAlf.g:1671:3: ';'
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_0_1_0_2_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_0_1_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1676:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0 ) )
                    {
                    // InternalAlf.g:1676:2: ( ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0 ) )
                    // InternalAlf.g:1677:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0 )
                    {
                     before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_1_0_2_1()); 
                    // InternalAlf.g:1678:3: ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0 )
                    // InternalAlf.g:1678:4: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_1_0_2_1()); 

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
    // $ANTLR end "rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Alternatives"
    // InternalAlf.g:1686:1: rule__OwnedRedefinitionOrSubset__Alternatives : ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1690:1: ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18||LA22_0==23) ) {
                alt22=1;
            }
            else if ( (LA22_0==47) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1691:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    {
                    // InternalAlf.g:1691:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    // InternalAlf.g:1692:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_0()); 
                    // InternalAlf.g:1693:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    // InternalAlf.g:1693:4: rule__OwnedRedefinitionOrSubset__Group_0__0
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
                    // InternalAlf.g:1697:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    {
                    // InternalAlf.g:1697:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    // InternalAlf.g:1698:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_1()); 
                    // InternalAlf.g:1699:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    // InternalAlf.g:1699:4: rule__OwnedRedefinitionOrSubset__Group_1__0
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
    // InternalAlf.g:1707:1: rule__OwnedRedefinitionOrSubset__Alternatives_0_0 : ( ( 'is' ) | ( 'redefines' ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1711:1: ( ( 'is' ) | ( 'redefines' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAlf.g:1712:2: ( 'is' )
                    {
                    // InternalAlf.g:1712:2: ( 'is' )
                    // InternalAlf.g:1713:3: 'is'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1718:2: ( 'redefines' )
                    {
                    // InternalAlf.g:1718:2: ( 'redefines' )
                    // InternalAlf.g:1719:3: 'redefines'
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
    // InternalAlf.g:1728:1: rule__BinaryExpression__Alternatives_1_1 : ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) );
    public final void rule__BinaryExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1732:1: ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=24 && LA24_0<=28)) ) {
                alt24=1;
            }
            else if ( (LA24_0==57) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1733:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    {
                    // InternalAlf.g:1733:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    // InternalAlf.g:1734:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_0()); 
                    // InternalAlf.g:1735:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    // InternalAlf.g:1735:4: rule__BinaryExpression__Group_1_1_0__0
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
                    // InternalAlf.g:1739:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    {
                    // InternalAlf.g:1739:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    // InternalAlf.g:1740:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_1()); 
                    // InternalAlf.g:1741:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    // InternalAlf.g:1741:4: rule__BinaryExpression__Group_1_1_1__0
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
    // InternalAlf.g:1749:1: rule__BinaryOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1753:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt25=1;
                }
                break;
            case 25:
                {
                alt25=2;
                }
                break;
            case 26:
                {
                alt25=3;
                }
                break;
            case 27:
                {
                alt25=4;
                }
                break;
            case 28:
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
                    // InternalAlf.g:1754:2: ( '+' )
                    {
                    // InternalAlf.g:1754:2: ( '+' )
                    // InternalAlf.g:1755:3: '+'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1760:2: ( '-' )
                    {
                    // InternalAlf.g:1760:2: ( '-' )
                    // InternalAlf.g:1761:3: '-'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1766:2: ( '*' )
                    {
                    // InternalAlf.g:1766:2: ( '*' )
                    // InternalAlf.g:1767:3: '*'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1772:2: ( '/' )
                    {
                    // InternalAlf.g:1772:2: ( '/' )
                    // InternalAlf.g:1773:3: '/'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1778:2: ( '^' )
                    {
                    // InternalAlf.g:1778:2: ( '^' )
                    // InternalAlf.g:1779:3: '^'
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
    // InternalAlf.g:1788:1: rule__UnaryExpression__Alternatives : ( ( ruleAccessExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1792:1: ( ( ruleAccessExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING_VALUE)||LA26_0==26||LA26_0==38||LA26_0==49||(LA26_0>=51 && LA26_0<=52)) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=24 && LA26_0<=25)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1793:2: ( ruleAccessExpression )
                    {
                    // InternalAlf.g:1793:2: ( ruleAccessExpression )
                    // InternalAlf.g:1794:3: ruleAccessExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getAccessExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getAccessExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1799:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1799:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // InternalAlf.g:1800:3: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1801:3: ( rule__UnaryExpression__Group_1__0 )
                    // InternalAlf.g:1801:4: rule__UnaryExpression__Group_1__0
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
    // InternalAlf.g:1809:1: rule__UnaryOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1813:1: ( ( '+' ) | ( '-' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            else if ( (LA27_0==25) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1814:2: ( '+' )
                    {
                    // InternalAlf.g:1814:2: ( '+' )
                    // InternalAlf.g:1815:3: '+'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1820:2: ( '-' )
                    {
                    // InternalAlf.g:1820:2: ( '-' )
                    // InternalAlf.g:1821:3: '-'
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
    // InternalAlf.g:1830:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1834:1: ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) )
            int alt28=5;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1835:2: ( ruleLiteralExpression )
                    {
                    // InternalAlf.g:1835:2: ( ruleLiteralExpression )
                    // InternalAlf.g:1836:3: ruleLiteralExpression
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
                    // InternalAlf.g:1841:2: ( ruleElementReferenceExpression )
                    {
                    // InternalAlf.g:1841:2: ( ruleElementReferenceExpression )
                    // InternalAlf.g:1842:3: ruleElementReferenceExpression
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
                    // InternalAlf.g:1847:2: ( ruleInstanceCreationExpression )
                    {
                    // InternalAlf.g:1847:2: ( ruleInstanceCreationExpression )
                    // InternalAlf.g:1848:3: ruleInstanceCreationExpression
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
                    // InternalAlf.g:1853:2: ( ruleSequenceConstructionExpression )
                    {
                    // InternalAlf.g:1853:2: ( ruleSequenceConstructionExpression )
                    // InternalAlf.g:1854:3: ruleSequenceConstructionExpression
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
                    // InternalAlf.g:1859:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalAlf.g:1859:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalAlf.g:1860:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalAlf.g:1861:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalAlf.g:1861:4: rule__PrimaryExpression__Group_4__0
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
    // InternalAlf.g:1869:1: rule__LiteralExpression__Alternatives : ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1873:1: ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt29=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt29=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt29=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA29_4 = input.LA(2);

                if ( (LA29_4==EOF||LA29_4==22||(LA29_4>=24 && LA29_4<=28)||(LA29_4>=38 && LA29_4<=40)||(LA29_4>=43 && LA29_4<=44)||LA29_4==50||LA29_4==57) ) {
                    alt29=5;
                }
                else if ( (LA29_4==52) ) {
                    alt29=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 4, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt29=4;
                }
                break;
            case 26:
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
                    // InternalAlf.g:1874:2: ( ruleNullLiteralExpression )
                    {
                    // InternalAlf.g:1874:2: ( ruleNullLiteralExpression )
                    // InternalAlf.g:1875:3: ruleNullLiteralExpression
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
                    // InternalAlf.g:1880:2: ( ruleBooleanLiteralExpression )
                    {
                    // InternalAlf.g:1880:2: ( ruleBooleanLiteralExpression )
                    // InternalAlf.g:1881:3: ruleBooleanLiteralExpression
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
                    // InternalAlf.g:1886:2: ( ruleStringLiteralExpression )
                    {
                    // InternalAlf.g:1886:2: ( ruleStringLiteralExpression )
                    // InternalAlf.g:1887:3: ruleStringLiteralExpression
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
                    // InternalAlf.g:1892:2: ( ruleRealLiteralExpression )
                    {
                    // InternalAlf.g:1892:2: ( ruleRealLiteralExpression )
                    // InternalAlf.g:1893:3: ruleRealLiteralExpression
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
                    // InternalAlf.g:1898:2: ( ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1898:2: ( ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1899:3: ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:1908:1: rule__RealValue__Alternatives_0 : ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) );
    public final void rule__RealValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1912:1: ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_NATURAL_VALUE) ) {
                alt30=1;
            }
            else if ( (LA30_0==52) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1913:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    {
                    // InternalAlf.g:1913:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    // InternalAlf.g:1914:3: ( rule__RealValue__Group_0_0__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_0()); 
                    // InternalAlf.g:1915:3: ( rule__RealValue__Group_0_0__0 )
                    // InternalAlf.g:1915:4: rule__RealValue__Group_0_0__0
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
                    // InternalAlf.g:1919:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    {
                    // InternalAlf.g:1919:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    // InternalAlf.g:1920:3: ( rule__RealValue__Group_0_1__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_1()); 
                    // InternalAlf.g:1921:3: ( rule__RealValue__Group_0_1__0 )
                    // InternalAlf.g:1921:4: rule__RealValue__Group_0_1__0
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
    // InternalAlf.g:1929:1: rule__RealValue__Alternatives_1_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__RealValue__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1933:1: ( ( 'e' ) | ( 'E' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            else if ( (LA31_0==30) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlf.g:1934:2: ( 'e' )
                    {
                    // InternalAlf.g:1934:2: ( 'e' )
                    // InternalAlf.g:1935:3: 'e'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1940:2: ( 'E' )
                    {
                    // InternalAlf.g:1940:2: ( 'E' )
                    // InternalAlf.g:1941:3: 'E'
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
    // InternalAlf.g:1950:1: rule__RealValue__Alternatives_1_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__RealValue__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1954:1: ( ( '+' ) | ( '-' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            else if ( (LA32_0==25) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1955:2: ( '+' )
                    {
                    // InternalAlf.g:1955:2: ( '+' )
                    // InternalAlf.g:1956:3: '+'
                    {
                     before(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1961:2: ( '-' )
                    {
                    // InternalAlf.g:1961:2: ( '-' )
                    // InternalAlf.g:1962:3: '-'
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
    // InternalAlf.g:1971:1: rule__UnlimitedNaturalLiteralExpression__Alternatives : ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) );
    public final void rule__UnlimitedNaturalLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1975:1: ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_NATURAL_VALUE) ) {
                alt33=1;
            }
            else if ( (LA33_0==26) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1976:2: ( ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1976:2: ( ruleNaturalLiteralExpression )
                    // InternalAlf.g:1977:3: ruleNaturalLiteralExpression
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
                    // InternalAlf.g:1982:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1982:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    // InternalAlf.g:1983:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1984:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    // InternalAlf.g:1984:4: rule__UnlimitedNaturalLiteralExpression__Group_1__0
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
    // InternalAlf.g:1992:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1996:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_UNRESTRICTED_NAME) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlf.g:1997:2: ( RULE_ID )
                    {
                    // InternalAlf.g:1997:2: ( RULE_ID )
                    // InternalAlf.g:1998:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2003:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:2003:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:2004:3: RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:2013:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2017:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt35=1;
                }
                break;
            case 32:
                {
                alt35=2;
                }
                break;
            case 33:
                {
                alt35=3;
                }
                break;
            case 34:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalAlf.g:2018:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:2018:2: ( ( 'public' ) )
                    // InternalAlf.g:2019:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:2020:3: ( 'public' )
                    // InternalAlf.g:2020:4: 'public'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2024:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:2024:2: ( ( 'private' ) )
                    // InternalAlf.g:2025:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:2026:3: ( 'private' )
                    // InternalAlf.g:2026:4: 'private'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2030:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:2030:2: ( ( 'protected' ) )
                    // InternalAlf.g:2031:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:2032:3: ( 'protected' )
                    // InternalAlf.g:2032:4: 'protected'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2036:2: ( ( 'packaged' ) )
                    {
                    // InternalAlf.g:2036:2: ( ( 'packaged' ) )
                    // InternalAlf.g:2037:3: ( 'packaged' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3()); 
                    // InternalAlf.g:2038:3: ( 'packaged' )
                    // InternalAlf.g:2038:4: 'packaged'
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
    // InternalAlf.g:2046:1: rule__FeatureDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) );
    public final void rule__FeatureDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2050:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt36=1;
                }
                break;
            case 36:
                {
                alt36=2;
                }
                break;
            case 37:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalAlf.g:2051:2: ( ( 'in' ) )
                    {
                    // InternalAlf.g:2051:2: ( ( 'in' ) )
                    // InternalAlf.g:2052:3: ( 'in' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:2053:3: ( 'in' )
                    // InternalAlf.g:2053:4: 'in'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2057:2: ( ( 'out' ) )
                    {
                    // InternalAlf.g:2057:2: ( ( 'out' ) )
                    // InternalAlf.g:2058:3: ( 'out' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:2059:3: ( 'out' )
                    // InternalAlf.g:2059:4: 'out'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2063:2: ( ( 'inout' ) )
                    {
                    // InternalAlf.g:2063:2: ( ( 'inout' ) )
                    // InternalAlf.g:2064:3: ( 'inout' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:2065:3: ( 'inout' )
                    // InternalAlf.g:2065:4: 'inout'
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
    // InternalAlf.g:2073:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2077:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:2078:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
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
    // InternalAlf.g:2085:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2089:1: ( ( 'package' ) )
            // InternalAlf.g:2090:1: ( 'package' )
            {
            // InternalAlf.g:2090:1: ( 'package' )
            // InternalAlf.g:2091:2: 'package'
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
    // InternalAlf.g:2100:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2104:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:2105:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
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
    // InternalAlf.g:2112:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2116:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:2117:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:2117:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:2118:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:2119:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:2119:3: rule__PackageDefinition__NameAssignment_1
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
    // InternalAlf.g:2127:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2131:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:2132:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
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
    // InternalAlf.g:2139:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2143:1: ( ( '{' ) )
            // InternalAlf.g:2144:1: ( '{' )
            {
            // InternalAlf.g:2144:1: ( '{' )
            // InternalAlf.g:2145:2: '{'
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
    // InternalAlf.g:2154:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2158:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:2159:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
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
    // InternalAlf.g:2166:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2170:1: ( ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* ) )
            // InternalAlf.g:2171:1: ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* )
            {
            // InternalAlf.g:2171:1: ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* )
            // InternalAlf.g:2172:2: ( rule__PackageDefinition__OwnedMembershipAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipAssignment_3()); 
            // InternalAlf.g:2173:2: ( rule__PackageDefinition__OwnedMembershipAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)||(LA37_0>=15 && LA37_0<=17)||LA37_0==20||(LA37_0>=31 && LA37_0<=34)||LA37_0==53) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAlf.g:2173:3: rule__PackageDefinition__OwnedMembershipAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__OwnedMembershipAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalAlf.g:2181:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2185:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:2186:2: rule__PackageDefinition__Group__4__Impl
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
    // InternalAlf.g:2192:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2196:1: ( ( '}' ) )
            // InternalAlf.g:2197:1: ( '}' )
            {
            // InternalAlf.g:2197:1: ( '}' )
            // InternalAlf.g:2198:2: '}'
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
    // InternalAlf.g:2208:1: rule__NonFeatureMember__Group__0 : rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1 ;
    public final void rule__NonFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2212:1: ( rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1 )
            // InternalAlf.g:2213:2: rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1
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
    // InternalAlf.g:2220:1: rule__NonFeatureMember__Group__0__Impl : ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__NonFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2224:1: ( ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:2225:1: ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:2225:1: ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:2226:2: ( rule__NonFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:2227:2: ( rule__NonFeatureMember__VisibilityAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=31 && LA38_0<=34)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:2227:3: rule__NonFeatureMember__VisibilityAssignment_0
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
    // InternalAlf.g:2235:1: rule__NonFeatureMember__Group__1 : rule__NonFeatureMember__Group__1__Impl ;
    public final void rule__NonFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2239:1: ( rule__NonFeatureMember__Group__1__Impl )
            // InternalAlf.g:2240:2: rule__NonFeatureMember__Group__1__Impl
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
    // InternalAlf.g:2246:1: rule__NonFeatureMember__Group__1__Impl : ( ( rule__NonFeatureMember__Alternatives_1 ) ) ;
    public final void rule__NonFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2250:1: ( ( ( rule__NonFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:2251:1: ( ( rule__NonFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:2251:1: ( ( rule__NonFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:2252:2: ( rule__NonFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:2253:2: ( rule__NonFeatureMember__Alternatives_1 )
            // InternalAlf.g:2253:3: rule__NonFeatureMember__Alternatives_1
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
    // InternalAlf.g:2262:1: rule__NonFeatureMember__Group_1_1__0 : rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1 ;
    public final void rule__NonFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2266:1: ( rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1 )
            // InternalAlf.g:2267:2: rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1
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
    // InternalAlf.g:2274:1: rule__NonFeatureMember__Group_1_1__0__Impl : ( ruleNonFeatureMemberKind ) ;
    public final void rule__NonFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2278:1: ( ( ruleNonFeatureMemberKind ) )
            // InternalAlf.g:2279:1: ( ruleNonFeatureMemberKind )
            {
            // InternalAlf.g:2279:1: ( ruleNonFeatureMemberKind )
            // InternalAlf.g:2280:2: ruleNonFeatureMemberKind
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
    // InternalAlf.g:2289:1: rule__NonFeatureMember__Group_1_1__1 : rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2 ;
    public final void rule__NonFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2293:1: ( rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2 )
            // InternalAlf.g:2294:2: rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2
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
    // InternalAlf.g:2301:1: rule__NonFeatureMember__Group_1_1__1__Impl : ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? ) ;
    public final void rule__NonFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2305:1: ( ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? ) )
            // InternalAlf.g:2306:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? )
            {
            // InternalAlf.g:2306:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? )
            // InternalAlf.g:2307:2: ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberNameAssignment_1_1_1()); 
            // InternalAlf.g:2308:2: ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:2308:3: rule__NonFeatureMember__MemberNameAssignment_1_1_1
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
    // InternalAlf.g:2316:1: rule__NonFeatureMember__Group_1_1__2 : rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3 ;
    public final void rule__NonFeatureMember__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2320:1: ( rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3 )
            // InternalAlf.g:2321:2: rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3
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
    // InternalAlf.g:2328:1: rule__NonFeatureMember__Group_1_1__2__Impl : ( 'is' ) ;
    public final void rule__NonFeatureMember__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2332:1: ( ( 'is' ) )
            // InternalAlf.g:2333:1: ( 'is' )
            {
            // InternalAlf.g:2333:1: ( 'is' )
            // InternalAlf.g:2334:2: 'is'
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
    // InternalAlf.g:2343:1: rule__NonFeatureMember__Group_1_1__3 : rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4 ;
    public final void rule__NonFeatureMember__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2347:1: ( rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4 )
            // InternalAlf.g:2348:2: rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4
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
    // InternalAlf.g:2355:1: rule__NonFeatureMember__Group_1_1__3__Impl : ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) ) ;
    public final void rule__NonFeatureMember__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2359:1: ( ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) ) )
            // InternalAlf.g:2360:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) )
            {
            // InternalAlf.g:2360:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) )
            // InternalAlf.g:2361:2: ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementAssignment_1_1_3()); 
            // InternalAlf.g:2362:2: ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 )
            // InternalAlf.g:2362:3: rule__NonFeatureMember__MemberElementAssignment_1_1_3
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
    // InternalAlf.g:2370:1: rule__NonFeatureMember__Group_1_1__4 : rule__NonFeatureMember__Group_1_1__4__Impl ;
    public final void rule__NonFeatureMember__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2374:1: ( rule__NonFeatureMember__Group_1_1__4__Impl )
            // InternalAlf.g:2375:2: rule__NonFeatureMember__Group_1_1__4__Impl
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
    // InternalAlf.g:2381:1: rule__NonFeatureMember__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__NonFeatureMember__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2385:1: ( ( ';' ) )
            // InternalAlf.g:2386:1: ( ';' )
            {
            // InternalAlf.g:2386:1: ( ';' )
            // InternalAlf.g:2387:2: ';'
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
    // InternalAlf.g:2397:1: rule__PackagedFeatureMember__Group__0 : rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1 ;
    public final void rule__PackagedFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2401:1: ( rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1 )
            // InternalAlf.g:2402:2: rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1
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
    // InternalAlf.g:2409:1: rule__PackagedFeatureMember__Group__0__Impl : ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__PackagedFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2413:1: ( ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:2414:1: ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:2414:1: ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:2415:2: ( rule__PackagedFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:2416:2: ( rule__PackagedFeatureMember__VisibilityAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=31 && LA40_0<=34)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:2416:3: rule__PackagedFeatureMember__VisibilityAssignment_0
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
    // InternalAlf.g:2424:1: rule__PackagedFeatureMember__Group__1 : rule__PackagedFeatureMember__Group__1__Impl ;
    public final void rule__PackagedFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2428:1: ( rule__PackagedFeatureMember__Group__1__Impl )
            // InternalAlf.g:2429:2: rule__PackagedFeatureMember__Group__1__Impl
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
    // InternalAlf.g:2435:1: rule__PackagedFeatureMember__Group__1__Impl : ( ( rule__PackagedFeatureMember__Alternatives_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2439:1: ( ( ( rule__PackagedFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:2440:1: ( ( rule__PackagedFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:2440:1: ( ( rule__PackagedFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:2441:2: ( rule__PackagedFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:2442:2: ( rule__PackagedFeatureMember__Alternatives_1 )
            // InternalAlf.g:2442:3: rule__PackagedFeatureMember__Alternatives_1
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
    // InternalAlf.g:2451:1: rule__PackagedFeatureMember__Group_1_0__0 : rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1 ;
    public final void rule__PackagedFeatureMember__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2455:1: ( rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1 )
            // InternalAlf.g:2456:2: rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1
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
    // InternalAlf.g:2463:1: rule__PackagedFeatureMember__Group_1_0__0__Impl : ( ( 'feature' )? ) ;
    public final void rule__PackagedFeatureMember__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2467:1: ( ( ( 'feature' )? ) )
            // InternalAlf.g:2468:1: ( ( 'feature' )? )
            {
            // InternalAlf.g:2468:1: ( ( 'feature' )? )
            // InternalAlf.g:2469:2: ( 'feature' )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0()); 
            // InternalAlf.g:2470:2: ( 'feature' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:2470:3: 'feature'
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
    // InternalAlf.g:2478:1: rule__PackagedFeatureMember__Group_1_0__1 : rule__PackagedFeatureMember__Group_1_0__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2482:1: ( rule__PackagedFeatureMember__Group_1_0__1__Impl )
            // InternalAlf.g:2483:2: rule__PackagedFeatureMember__Group_1_0__1__Impl
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
    // InternalAlf.g:2489:1: rule__PackagedFeatureMember__Group_1_0__1__Impl : ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2493:1: ( ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) )
            // InternalAlf.g:2494:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            {
            // InternalAlf.g:2494:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            // InternalAlf.g:2495:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_1()); 
            // InternalAlf.g:2496:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            // InternalAlf.g:2496:3: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1
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
    // InternalAlf.g:2505:1: rule__PackagedFeatureMember__Group_1_1__0 : rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1 ;
    public final void rule__PackagedFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2509:1: ( rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1 )
            // InternalAlf.g:2510:2: rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1
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
    // InternalAlf.g:2517:1: rule__PackagedFeatureMember__Group_1_1__0__Impl : ( 'feature' ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2521:1: ( ( 'feature' ) )
            // InternalAlf.g:2522:1: ( 'feature' )
            {
            // InternalAlf.g:2522:1: ( 'feature' )
            // InternalAlf.g:2523:2: 'feature'
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
    // InternalAlf.g:2532:1: rule__PackagedFeatureMember__Group_1_1__1 : rule__PackagedFeatureMember__Group_1_1__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2536:1: ( rule__PackagedFeatureMember__Group_1_1__1__Impl )
            // InternalAlf.g:2537:2: rule__PackagedFeatureMember__Group_1_1__1__Impl
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
    // InternalAlf.g:2543:1: rule__PackagedFeatureMember__Group_1_1__1__Impl : ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2547:1: ( ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) ) )
            // InternalAlf.g:2548:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) )
            {
            // InternalAlf.g:2548:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 ) )
            // InternalAlf.g:2549:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_1()); 
            // InternalAlf.g:2550:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 )
            // InternalAlf.g:2550:3: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1
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
    // InternalAlf.g:2559:1: rule__PackagedFeatureMember__Group_1_2__0 : rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1 ;
    public final void rule__PackagedFeatureMember__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2563:1: ( rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1 )
            // InternalAlf.g:2564:2: rule__PackagedFeatureMember__Group_1_2__0__Impl rule__PackagedFeatureMember__Group_1_2__1
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
    // InternalAlf.g:2571:1: rule__PackagedFeatureMember__Group_1_2__0__Impl : ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2575:1: ( ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) ) )
            // InternalAlf.g:2576:1: ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) )
            {
            // InternalAlf.g:2576:1: ( ( rule__PackagedFeatureMember__Alternatives_1_2_0 ) )
            // InternalAlf.g:2577:2: ( rule__PackagedFeatureMember__Alternatives_1_2_0 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1_2_0()); 
            // InternalAlf.g:2578:2: ( rule__PackagedFeatureMember__Alternatives_1_2_0 )
            // InternalAlf.g:2578:3: rule__PackagedFeatureMember__Alternatives_1_2_0
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
    // InternalAlf.g:2586:1: rule__PackagedFeatureMember__Group_1_2__1 : rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2 ;
    public final void rule__PackagedFeatureMember__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2590:1: ( rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2 )
            // InternalAlf.g:2591:2: rule__PackagedFeatureMember__Group_1_2__1__Impl rule__PackagedFeatureMember__Group_1_2__2
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
    // InternalAlf.g:2598:1: rule__PackagedFeatureMember__Group_1_2__1__Impl : ( 'is' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2602:1: ( ( 'is' ) )
            // InternalAlf.g:2603:1: ( 'is' )
            {
            // InternalAlf.g:2603:1: ( 'is' )
            // InternalAlf.g:2604:2: 'is'
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
    // InternalAlf.g:2613:1: rule__PackagedFeatureMember__Group_1_2__2 : rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3 ;
    public final void rule__PackagedFeatureMember__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2617:1: ( rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3 )
            // InternalAlf.g:2618:2: rule__PackagedFeatureMember__Group_1_2__2__Impl rule__PackagedFeatureMember__Group_1_2__3
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
    // InternalAlf.g:2625:1: rule__PackagedFeatureMember__Group_1_2__2__Impl : ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2629:1: ( ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) ) )
            // InternalAlf.g:2630:1: ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) )
            {
            // InternalAlf.g:2630:1: ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 ) )
            // InternalAlf.g:2631:2: ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementAssignment_1_2_2()); 
            // InternalAlf.g:2632:2: ( rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 )
            // InternalAlf.g:2632:3: rule__PackagedFeatureMember__MemberElementAssignment_1_2_2
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
    // InternalAlf.g:2640:1: rule__PackagedFeatureMember__Group_1_2__3 : rule__PackagedFeatureMember__Group_1_2__3__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2644:1: ( rule__PackagedFeatureMember__Group_1_2__3__Impl )
            // InternalAlf.g:2645:2: rule__PackagedFeatureMember__Group_1_2__3__Impl
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
    // InternalAlf.g:2651:1: rule__PackagedFeatureMember__Group_1_2__3__Impl : ( ';' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2655:1: ( ( ';' ) )
            // InternalAlf.g:2656:1: ( ';' )
            {
            // InternalAlf.g:2656:1: ( ';' )
            // InternalAlf.g:2657:2: ';'
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
    // InternalAlf.g:2667:1: rule__PackagedFeatureMember__Group_1_2_0_0__0 : rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1 ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2671:1: ( rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1 )
            // InternalAlf.g:2672:2: rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl rule__PackagedFeatureMember__Group_1_2_0_0__1
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
    // InternalAlf.g:2679:1: rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl : ( 'feature' ) ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2683:1: ( ( 'feature' ) )
            // InternalAlf.g:2684:1: ( 'feature' )
            {
            // InternalAlf.g:2684:1: ( 'feature' )
            // InternalAlf.g:2685:2: 'feature'
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
    // InternalAlf.g:2694:1: rule__PackagedFeatureMember__Group_1_2_0_0__1 : rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2698:1: ( rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl )
            // InternalAlf.g:2699:2: rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl
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
    // InternalAlf.g:2705:1: rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl : ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? ) ;
    public final void rule__PackagedFeatureMember__Group_1_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2709:1: ( ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? ) )
            // InternalAlf.g:2710:1: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? )
            {
            // InternalAlf.g:2710:1: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )? )
            // InternalAlf.g:2711:2: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_2_0_0_1()); 
            // InternalAlf.g:2712:2: ( rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:2712:3: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1
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
    // InternalAlf.g:2721:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2725:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:2726:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
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
    // InternalAlf.g:2733:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2737:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:2738:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:2738:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:2739:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:2740:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlf.g:2740:3: rule__ClassDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:2748:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2752:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:2753:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalAlf.g:2760:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2764:1: ( ( 'class' ) )
            // InternalAlf.g:2765:1: ( 'class' )
            {
            // InternalAlf.g:2765:1: ( 'class' )
            // InternalAlf.g:2766:2: 'class'
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
    // InternalAlf.g:2775:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2779:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:2780:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
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
    // InternalAlf.g:2787:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2791:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:2792:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:2792:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:2793:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:2794:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:2794:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalAlf.g:2802:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2806:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:2807:2: rule__ClassDeclaration__Group__3__Impl
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
    // InternalAlf.g:2813:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2817:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:2818:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:2818:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:2819:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:2820:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=18 && LA44_0<=19)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:2820:3: rule__ClassDeclaration__Group_3__0
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
    // InternalAlf.g:2829:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2833:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:2834:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalAlf.g:2841:1: rule__ClassDeclaration__Group_3__0__Impl : ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2845:1: ( ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:2846:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:2846:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:2847:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:2848:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            // InternalAlf.g:2848:3: rule__ClassDeclaration__Alternatives_3_0
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
    // InternalAlf.g:2856:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2860:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalAlf.g:2861:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
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
    // InternalAlf.g:2868:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2872:1: ( ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) ) )
            // InternalAlf.g:2873:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) )
            {
            // InternalAlf.g:2873:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) )
            // InternalAlf.g:2874:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_1()); 
            // InternalAlf.g:2875:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 )
            // InternalAlf.g:2875:3: rule__ClassDeclaration__OwnedMembershipAssignment_3_1
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
    // InternalAlf.g:2883:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2887:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalAlf.g:2888:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:2894:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2898:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:2899:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:2899:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:2900:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:2901:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==40) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAlf.g:2901:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalAlf.g:2910:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2914:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalAlf.g:2915:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalAlf.g:2922:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2926:1: ( ( ',' ) )
            // InternalAlf.g:2927:1: ( ',' )
            {
            // InternalAlf.g:2927:1: ( ',' )
            // InternalAlf.g:2928:2: ','
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
    // InternalAlf.g:2937:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2941:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:2942:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:2948:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2952:1: ( ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) ) )
            // InternalAlf.g:2953:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            {
            // InternalAlf.g:2953:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            // InternalAlf.g:2954:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 
            // InternalAlf.g:2955:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 )
            // InternalAlf.g:2955:3: rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1
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
    // InternalAlf.g:2964:1: rule__ClassDefinition__Group__0 : rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 ;
    public final void rule__ClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2968:1: ( rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 )
            // InternalAlf.g:2969:2: rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1
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
    // InternalAlf.g:2976:1: rule__ClassDefinition__Group__0__Impl : ( ruleClassDeclaration ) ;
    public final void rule__ClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2980:1: ( ( ruleClassDeclaration ) )
            // InternalAlf.g:2981:1: ( ruleClassDeclaration )
            {
            // InternalAlf.g:2981:1: ( ruleClassDeclaration )
            // InternalAlf.g:2982:2: ruleClassDeclaration
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
    // InternalAlf.g:2991:1: rule__ClassDefinition__Group__1 : rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 ;
    public final void rule__ClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2995:1: ( rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 )
            // InternalAlf.g:2996:2: rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2
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
    // InternalAlf.g:3003:1: rule__ClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3007:1: ( ( '{' ) )
            // InternalAlf.g:3008:1: ( '{' )
            {
            // InternalAlf.g:3008:1: ( '{' )
            // InternalAlf.g:3009:2: '{'
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
    // InternalAlf.g:3018:1: rule__ClassDefinition__Group__2 : rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 ;
    public final void rule__ClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3022:1: ( rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 )
            // InternalAlf.g:3023:2: rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3
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
    // InternalAlf.g:3030:1: rule__ClassDefinition__Group__2__Impl : ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* ) ;
    public final void rule__ClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3034:1: ( ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* ) )
            // InternalAlf.g:3035:1: ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* )
            {
            // InternalAlf.g:3035:1: ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* )
            // InternalAlf.g:3036:2: ( rule__ClassDefinition__OwnedMembershipAssignment_2 )*
            {
             before(grammarAccess.getClassDefinitionAccess().getOwnedMembershipAssignment_2()); 
            // InternalAlf.g:3037:2: ( rule__ClassDefinition__OwnedMembershipAssignment_2 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_UNRESTRICTED_NAME)||(LA46_0>=15 && LA46_0<=17)||LA46_0==20||(LA46_0>=31 && LA46_0<=37)||LA46_0==41||(LA46_0>=53 && LA46_0<=55)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAlf.g:3037:3: rule__ClassDefinition__OwnedMembershipAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ClassDefinition__OwnedMembershipAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalAlf.g:3045:1: rule__ClassDefinition__Group__3 : rule__ClassDefinition__Group__3__Impl ;
    public final void rule__ClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3049:1: ( rule__ClassDefinition__Group__3__Impl )
            // InternalAlf.g:3050:2: rule__ClassDefinition__Group__3__Impl
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
    // InternalAlf.g:3056:1: rule__ClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__ClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3060:1: ( ( '}' ) )
            // InternalAlf.g:3061:1: ( '}' )
            {
            // InternalAlf.g:3061:1: ( '}' )
            // InternalAlf.g:3062:2: '}'
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
    // InternalAlf.g:3072:1: rule__ClassFeatureMember__Group__0 : rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1 ;
    public final void rule__ClassFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3076:1: ( rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1 )
            // InternalAlf.g:3077:2: rule__ClassFeatureMember__Group__0__Impl rule__ClassFeatureMember__Group__1
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
    // InternalAlf.g:3084:1: rule__ClassFeatureMember__Group__0__Impl : ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__ClassFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3088:1: ( ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:3089:1: ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:3089:1: ( ( rule__ClassFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:3090:2: ( rule__ClassFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:3091:2: ( rule__ClassFeatureMember__VisibilityAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=31 && LA47_0<=34)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:3091:3: rule__ClassFeatureMember__VisibilityAssignment_0
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
    // InternalAlf.g:3099:1: rule__ClassFeatureMember__Group__1 : rule__ClassFeatureMember__Group__1__Impl ;
    public final void rule__ClassFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3103:1: ( rule__ClassFeatureMember__Group__1__Impl )
            // InternalAlf.g:3104:2: rule__ClassFeatureMember__Group__1__Impl
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
    // InternalAlf.g:3110:1: rule__ClassFeatureMember__Group__1__Impl : ( ( rule__ClassFeatureMember__Alternatives_1 ) ) ;
    public final void rule__ClassFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3114:1: ( ( ( rule__ClassFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:3115:1: ( ( rule__ClassFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:3115:1: ( ( rule__ClassFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:3116:2: ( rule__ClassFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:3117:2: ( rule__ClassFeatureMember__Alternatives_1 )
            // InternalAlf.g:3117:3: rule__ClassFeatureMember__Alternatives_1
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
    // InternalAlf.g:3126:1: rule__ClassFeatureMember__Group_1_0__0 : rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1 ;
    public final void rule__ClassFeatureMember__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3130:1: ( rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1 )
            // InternalAlf.g:3131:2: rule__ClassFeatureMember__Group_1_0__0__Impl rule__ClassFeatureMember__Group_1_0__1
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
    // InternalAlf.g:3138:1: rule__ClassFeatureMember__Group_1_0__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3142:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? ) )
            // InternalAlf.g:3143:1: ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? )
            {
            // InternalAlf.g:3143:1: ( ( rule__ClassFeatureMember__Alternatives_1_0_0 )? )
            // InternalAlf.g:3144:2: ( rule__ClassFeatureMember__Alternatives_1_0_0 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_0_0()); 
            // InternalAlf.g:3145:2: ( rule__ClassFeatureMember__Alternatives_1_0_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==20||(LA48_0>=54 && LA48_0<=55)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:3145:3: rule__ClassFeatureMember__Alternatives_1_0_0
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
    // InternalAlf.g:3153:1: rule__ClassFeatureMember__Group_1_0__1 : rule__ClassFeatureMember__Group_1_0__1__Impl rule__ClassFeatureMember__Group_1_0__2 ;
    public final void rule__ClassFeatureMember__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3157:1: ( rule__ClassFeatureMember__Group_1_0__1__Impl rule__ClassFeatureMember__Group_1_0__2 )
            // InternalAlf.g:3158:2: rule__ClassFeatureMember__Group_1_0__1__Impl rule__ClassFeatureMember__Group_1_0__2
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
    // InternalAlf.g:3165:1: rule__ClassFeatureMember__Group_1_0__1__Impl : ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3169:1: ( ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )? ) )
            // InternalAlf.g:3170:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )? )
            {
            // InternalAlf.g:3170:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )? )
            // InternalAlf.g:3171:2: ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_0_1()); 
            // InternalAlf.g:3172:2: ( rule__ClassFeatureMember__DirectionAssignment_1_0_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=35 && LA49_0<=37)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:3172:3: rule__ClassFeatureMember__DirectionAssignment_1_0_1
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
    // InternalAlf.g:3180:1: rule__ClassFeatureMember__Group_1_0__2 : rule__ClassFeatureMember__Group_1_0__2__Impl ;
    public final void rule__ClassFeatureMember__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3184:1: ( rule__ClassFeatureMember__Group_1_0__2__Impl )
            // InternalAlf.g:3185:2: rule__ClassFeatureMember__Group_1_0__2__Impl
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
    // InternalAlf.g:3191:1: rule__ClassFeatureMember__Group_1_0__2__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3195:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 ) ) )
            // InternalAlf.g:3196:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 ) )
            {
            // InternalAlf.g:3196:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 ) )
            // InternalAlf.g:3197:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_2()); 
            // InternalAlf.g:3198:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 )
            // InternalAlf.g:3198:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2
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
    // InternalAlf.g:3207:1: rule__ClassFeatureMember__Group_1_1__0 : rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1 ;
    public final void rule__ClassFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3211:1: ( rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1 )
            // InternalAlf.g:3212:2: rule__ClassFeatureMember__Group_1_1__0__Impl rule__ClassFeatureMember__Group_1_1__1
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
    // InternalAlf.g:3219:1: rule__ClassFeatureMember__Group_1_1__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3223:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) ) )
            // InternalAlf.g:3224:1: ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) )
            {
            // InternalAlf.g:3224:1: ( ( rule__ClassFeatureMember__Alternatives_1_1_0 ) )
            // InternalAlf.g:3225:2: ( rule__ClassFeatureMember__Alternatives_1_1_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_1_0()); 
            // InternalAlf.g:3226:2: ( rule__ClassFeatureMember__Alternatives_1_1_0 )
            // InternalAlf.g:3226:3: rule__ClassFeatureMember__Alternatives_1_1_0
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
    // InternalAlf.g:3234:1: rule__ClassFeatureMember__Group_1_1__1 : rule__ClassFeatureMember__Group_1_1__1__Impl rule__ClassFeatureMember__Group_1_1__2 ;
    public final void rule__ClassFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3238:1: ( rule__ClassFeatureMember__Group_1_1__1__Impl rule__ClassFeatureMember__Group_1_1__2 )
            // InternalAlf.g:3239:2: rule__ClassFeatureMember__Group_1_1__1__Impl rule__ClassFeatureMember__Group_1_1__2
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
    // InternalAlf.g:3246:1: rule__ClassFeatureMember__Group_1_1__1__Impl : ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3250:1: ( ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )? ) )
            // InternalAlf.g:3251:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )? )
            {
            // InternalAlf.g:3251:1: ( ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )? )
            // InternalAlf.g:3252:2: ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_1_1_1()); 
            // InternalAlf.g:3253:2: ( rule__ClassFeatureMember__DirectionAssignment_1_1_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=35 && LA50_0<=37)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:3253:3: rule__ClassFeatureMember__DirectionAssignment_1_1_1
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
    // InternalAlf.g:3261:1: rule__ClassFeatureMember__Group_1_1__2 : rule__ClassFeatureMember__Group_1_1__2__Impl ;
    public final void rule__ClassFeatureMember__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3265:1: ( rule__ClassFeatureMember__Group_1_1__2__Impl )
            // InternalAlf.g:3266:2: rule__ClassFeatureMember__Group_1_1__2__Impl
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
    // InternalAlf.g:3272:1: rule__ClassFeatureMember__Group_1_1__2__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3276:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 ) ) )
            // InternalAlf.g:3277:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 ) )
            {
            // InternalAlf.g:3277:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 ) )
            // InternalAlf.g:3278:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_1_2()); 
            // InternalAlf.g:3279:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 )
            // InternalAlf.g:3279:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2
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
    // InternalAlf.g:3288:1: rule__ClassFeatureMember__Group_1_2__0 : rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1 ;
    public final void rule__ClassFeatureMember__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3292:1: ( rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1 )
            // InternalAlf.g:3293:2: rule__ClassFeatureMember__Group_1_2__0__Impl rule__ClassFeatureMember__Group_1_2__1
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
    // InternalAlf.g:3300:1: rule__ClassFeatureMember__Group_1_2__0__Impl : ( 'connector' ) ;
    public final void rule__ClassFeatureMember__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3304:1: ( ( 'connector' ) )
            // InternalAlf.g:3305:1: ( 'connector' )
            {
            // InternalAlf.g:3305:1: ( 'connector' )
            // InternalAlf.g:3306:2: 'connector'
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
    // InternalAlf.g:3315:1: rule__ClassFeatureMember__Group_1_2__1 : rule__ClassFeatureMember__Group_1_2__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3319:1: ( rule__ClassFeatureMember__Group_1_2__1__Impl )
            // InternalAlf.g:3320:2: rule__ClassFeatureMember__Group_1_2__1__Impl
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
    // InternalAlf.g:3326:1: rule__ClassFeatureMember__Group_1_2__1__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3330:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) ) )
            // InternalAlf.g:3331:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) )
            {
            // InternalAlf.g:3331:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 ) )
            // InternalAlf.g:3332:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_2_1()); 
            // InternalAlf.g:3333:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 )
            // InternalAlf.g:3333:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1
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
    // InternalAlf.g:3342:1: rule__ClassFeatureMember__Group_1_3__0 : rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1 ;
    public final void rule__ClassFeatureMember__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3346:1: ( rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1 )
            // InternalAlf.g:3347:2: rule__ClassFeatureMember__Group_1_3__0__Impl rule__ClassFeatureMember__Group_1_3__1
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
    // InternalAlf.g:3354:1: rule__ClassFeatureMember__Group_1_3__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3358:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) ) )
            // InternalAlf.g:3359:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) )
            {
            // InternalAlf.g:3359:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0 ) )
            // InternalAlf.g:3360:2: ( rule__ClassFeatureMember__Alternatives_1_3_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_3_0()); 
            // InternalAlf.g:3361:2: ( rule__ClassFeatureMember__Alternatives_1_3_0 )
            // InternalAlf.g:3361:3: rule__ClassFeatureMember__Alternatives_1_3_0
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
    // InternalAlf.g:3369:1: rule__ClassFeatureMember__Group_1_3__1 : rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2 ;
    public final void rule__ClassFeatureMember__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3373:1: ( rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2 )
            // InternalAlf.g:3374:2: rule__ClassFeatureMember__Group_1_3__1__Impl rule__ClassFeatureMember__Group_1_3__2
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
    // InternalAlf.g:3381:1: rule__ClassFeatureMember__Group_1_3__1__Impl : ( 'is' ) ;
    public final void rule__ClassFeatureMember__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3385:1: ( ( 'is' ) )
            // InternalAlf.g:3386:1: ( 'is' )
            {
            // InternalAlf.g:3386:1: ( 'is' )
            // InternalAlf.g:3387:2: 'is'
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
    // InternalAlf.g:3396:1: rule__ClassFeatureMember__Group_1_3__2 : rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3 ;
    public final void rule__ClassFeatureMember__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3400:1: ( rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3 )
            // InternalAlf.g:3401:2: rule__ClassFeatureMember__Group_1_3__2__Impl rule__ClassFeatureMember__Group_1_3__3
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
    // InternalAlf.g:3408:1: rule__ClassFeatureMember__Group_1_3__2__Impl : ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3412:1: ( ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) ) )
            // InternalAlf.g:3413:1: ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) )
            {
            // InternalAlf.g:3413:1: ( ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 ) )
            // InternalAlf.g:3414:2: ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementAssignment_1_3_2()); 
            // InternalAlf.g:3415:2: ( rule__ClassFeatureMember__MemberElementAssignment_1_3_2 )
            // InternalAlf.g:3415:3: rule__ClassFeatureMember__MemberElementAssignment_1_3_2
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
    // InternalAlf.g:3423:1: rule__ClassFeatureMember__Group_1_3__3 : rule__ClassFeatureMember__Group_1_3__3__Impl ;
    public final void rule__ClassFeatureMember__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3427:1: ( rule__ClassFeatureMember__Group_1_3__3__Impl )
            // InternalAlf.g:3428:2: rule__ClassFeatureMember__Group_1_3__3__Impl
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
    // InternalAlf.g:3434:1: rule__ClassFeatureMember__Group_1_3__3__Impl : ( ';' ) ;
    public final void rule__ClassFeatureMember__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3438:1: ( ( ';' ) )
            // InternalAlf.g:3439:1: ( ';' )
            {
            // InternalAlf.g:3439:1: ( ';' )
            // InternalAlf.g:3440:2: ';'
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
    // InternalAlf.g:3450:1: rule__ClassFeatureMember__Group_1_3_0_0__0 : rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1 ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3454:1: ( rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1 )
            // InternalAlf.g:3455:2: rule__ClassFeatureMember__Group_1_3_0_0__0__Impl rule__ClassFeatureMember__Group_1_3_0_0__1
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
    // InternalAlf.g:3462:1: rule__ClassFeatureMember__Group_1_3_0_0__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3466:1: ( ( ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 ) ) )
            // InternalAlf.g:3467:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 ) )
            {
            // InternalAlf.g:3467:1: ( ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 ) )
            // InternalAlf.g:3468:2: ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_1_3_0_0_0()); 
            // InternalAlf.g:3469:2: ( rule__ClassFeatureMember__Alternatives_1_3_0_0_0 )
            // InternalAlf.g:3469:3: rule__ClassFeatureMember__Alternatives_1_3_0_0_0
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
    // InternalAlf.g:3477:1: rule__ClassFeatureMember__Group_1_3_0_0__1 : rule__ClassFeatureMember__Group_1_3_0_0__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3481:1: ( rule__ClassFeatureMember__Group_1_3_0_0__1__Impl )
            // InternalAlf.g:3482:2: rule__ClassFeatureMember__Group_1_3_0_0__1__Impl
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
    // InternalAlf.g:3488:1: rule__ClassFeatureMember__Group_1_3_0_0__1__Impl : ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_1_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3492:1: ( ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? ) )
            // InternalAlf.g:3493:1: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? )
            {
            // InternalAlf.g:3493:1: ( ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )? )
            // InternalAlf.g:3494:2: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_1_3_0_0_1()); 
            // InternalAlf.g:3495:2: ( rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:3495:3: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1
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
    // InternalAlf.g:3504:1: rule__AssociationDeclaration__Group__0 : rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1 ;
    public final void rule__AssociationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3508:1: ( rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1 )
            // InternalAlf.g:3509:2: rule__AssociationDeclaration__Group__0__Impl rule__AssociationDeclaration__Group__1
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
    // InternalAlf.g:3516:1: rule__AssociationDeclaration__Group__0__Impl : ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__AssociationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3520:1: ( ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:3521:1: ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:3521:1: ( ( rule__AssociationDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:3522:2: ( rule__AssociationDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:3523:2: ( rule__AssociationDeclaration__IsAbstractAssignment_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==53) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:3523:3: rule__AssociationDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:3531:1: rule__AssociationDeclaration__Group__1 : rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2 ;
    public final void rule__AssociationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3535:1: ( rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2 )
            // InternalAlf.g:3536:2: rule__AssociationDeclaration__Group__1__Impl rule__AssociationDeclaration__Group__2
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
    // InternalAlf.g:3543:1: rule__AssociationDeclaration__Group__1__Impl : ( 'assoc' ) ;
    public final void rule__AssociationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3547:1: ( ( 'assoc' ) )
            // InternalAlf.g:3548:1: ( 'assoc' )
            {
            // InternalAlf.g:3548:1: ( 'assoc' )
            // InternalAlf.g:3549:2: 'assoc'
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
    // InternalAlf.g:3558:1: rule__AssociationDeclaration__Group__2 : rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3 ;
    public final void rule__AssociationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3562:1: ( rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3 )
            // InternalAlf.g:3563:2: rule__AssociationDeclaration__Group__2__Impl rule__AssociationDeclaration__Group__3
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
    // InternalAlf.g:3570:1: rule__AssociationDeclaration__Group__2__Impl : ( ( rule__AssociationDeclaration__NameAssignment_2 ) ) ;
    public final void rule__AssociationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3574:1: ( ( ( rule__AssociationDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:3575:1: ( ( rule__AssociationDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:3575:1: ( ( rule__AssociationDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:3576:2: ( rule__AssociationDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:3577:2: ( rule__AssociationDeclaration__NameAssignment_2 )
            // InternalAlf.g:3577:3: rule__AssociationDeclaration__NameAssignment_2
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
    // InternalAlf.g:3585:1: rule__AssociationDeclaration__Group__3 : rule__AssociationDeclaration__Group__3__Impl ;
    public final void rule__AssociationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3589:1: ( rule__AssociationDeclaration__Group__3__Impl )
            // InternalAlf.g:3590:2: rule__AssociationDeclaration__Group__3__Impl
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
    // InternalAlf.g:3596:1: rule__AssociationDeclaration__Group__3__Impl : ( ( rule__AssociationDeclaration__Group_3__0 )? ) ;
    public final void rule__AssociationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3600:1: ( ( ( rule__AssociationDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:3601:1: ( ( rule__AssociationDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:3601:1: ( ( rule__AssociationDeclaration__Group_3__0 )? )
            // InternalAlf.g:3602:2: ( rule__AssociationDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getAssociationDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:3603:2: ( rule__AssociationDeclaration__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=18 && LA53_0<=19)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:3603:3: rule__AssociationDeclaration__Group_3__0
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
    // InternalAlf.g:3612:1: rule__AssociationDeclaration__Group_3__0 : rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1 ;
    public final void rule__AssociationDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3616:1: ( rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1 )
            // InternalAlf.g:3617:2: rule__AssociationDeclaration__Group_3__0__Impl rule__AssociationDeclaration__Group_3__1
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
    // InternalAlf.g:3624:1: rule__AssociationDeclaration__Group_3__0__Impl : ( ( rule__AssociationDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__AssociationDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3628:1: ( ( ( rule__AssociationDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:3629:1: ( ( rule__AssociationDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:3629:1: ( ( rule__AssociationDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:3630:2: ( rule__AssociationDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:3631:2: ( rule__AssociationDeclaration__Alternatives_3_0 )
            // InternalAlf.g:3631:3: rule__AssociationDeclaration__Alternatives_3_0
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
    // InternalAlf.g:3639:1: rule__AssociationDeclaration__Group_3__1 : rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2 ;
    public final void rule__AssociationDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3643:1: ( rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2 )
            // InternalAlf.g:3644:2: rule__AssociationDeclaration__Group_3__1__Impl rule__AssociationDeclaration__Group_3__2
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
    // InternalAlf.g:3651:1: rule__AssociationDeclaration__Group_3__1__Impl : ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) ) ;
    public final void rule__AssociationDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3655:1: ( ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) ) )
            // InternalAlf.g:3656:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) )
            {
            // InternalAlf.g:3656:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 ) )
            // InternalAlf.g:3657:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipAssignment_3_1()); 
            // InternalAlf.g:3658:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 )
            // InternalAlf.g:3658:3: rule__AssociationDeclaration__OwnedMembershipAssignment_3_1
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
    // InternalAlf.g:3666:1: rule__AssociationDeclaration__Group_3__2 : rule__AssociationDeclaration__Group_3__2__Impl ;
    public final void rule__AssociationDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3670:1: ( rule__AssociationDeclaration__Group_3__2__Impl )
            // InternalAlf.g:3671:2: rule__AssociationDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:3677:1: rule__AssociationDeclaration__Group_3__2__Impl : ( ( rule__AssociationDeclaration__Group_3_2__0 )* ) ;
    public final void rule__AssociationDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3681:1: ( ( ( rule__AssociationDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:3682:1: ( ( rule__AssociationDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:3682:1: ( ( rule__AssociationDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:3683:2: ( rule__AssociationDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getAssociationDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:3684:2: ( rule__AssociationDeclaration__Group_3_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==40) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAlf.g:3684:3: rule__AssociationDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AssociationDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalAlf.g:3693:1: rule__AssociationDeclaration__Group_3_2__0 : rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1 ;
    public final void rule__AssociationDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3697:1: ( rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1 )
            // InternalAlf.g:3698:2: rule__AssociationDeclaration__Group_3_2__0__Impl rule__AssociationDeclaration__Group_3_2__1
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
    // InternalAlf.g:3705:1: rule__AssociationDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3709:1: ( ( ',' ) )
            // InternalAlf.g:3710:1: ( ',' )
            {
            // InternalAlf.g:3710:1: ( ',' )
            // InternalAlf.g:3711:2: ','
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
    // InternalAlf.g:3720:1: rule__AssociationDeclaration__Group_3_2__1 : rule__AssociationDeclaration__Group_3_2__1__Impl ;
    public final void rule__AssociationDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3724:1: ( rule__AssociationDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:3725:2: rule__AssociationDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:3731:1: rule__AssociationDeclaration__Group_3_2__1__Impl : ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) ) ;
    public final void rule__AssociationDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3735:1: ( ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) ) )
            // InternalAlf.g:3736:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            {
            // InternalAlf.g:3736:1: ( ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            // InternalAlf.g:3737:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 
            // InternalAlf.g:3738:2: ( rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 )
            // InternalAlf.g:3738:3: rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1
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
    // InternalAlf.g:3747:1: rule__AssociationDefinition__Group__0 : rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1 ;
    public final void rule__AssociationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3751:1: ( rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1 )
            // InternalAlf.g:3752:2: rule__AssociationDefinition__Group__0__Impl rule__AssociationDefinition__Group__1
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
    // InternalAlf.g:3759:1: rule__AssociationDefinition__Group__0__Impl : ( ruleAssociationDeclaration ) ;
    public final void rule__AssociationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3763:1: ( ( ruleAssociationDeclaration ) )
            // InternalAlf.g:3764:1: ( ruleAssociationDeclaration )
            {
            // InternalAlf.g:3764:1: ( ruleAssociationDeclaration )
            // InternalAlf.g:3765:2: ruleAssociationDeclaration
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
    // InternalAlf.g:3774:1: rule__AssociationDefinition__Group__1 : rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2 ;
    public final void rule__AssociationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3778:1: ( rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2 )
            // InternalAlf.g:3779:2: rule__AssociationDefinition__Group__1__Impl rule__AssociationDefinition__Group__2
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
    // InternalAlf.g:3786:1: rule__AssociationDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__AssociationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3790:1: ( ( '{' ) )
            // InternalAlf.g:3791:1: ( '{' )
            {
            // InternalAlf.g:3791:1: ( '{' )
            // InternalAlf.g:3792:2: '{'
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
    // InternalAlf.g:3801:1: rule__AssociationDefinition__Group__2 : rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3 ;
    public final void rule__AssociationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3805:1: ( rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3 )
            // InternalAlf.g:3806:2: rule__AssociationDefinition__Group__2__Impl rule__AssociationDefinition__Group__3
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
    // InternalAlf.g:3813:1: rule__AssociationDefinition__Group__2__Impl : ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) ) ;
    public final void rule__AssociationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3817:1: ( ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) ) )
            // InternalAlf.g:3818:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) )
            {
            // InternalAlf.g:3818:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_2 ) )
            // InternalAlf.g:3819:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_2 )
            {
             before(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssignment_2()); 
            // InternalAlf.g:3820:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_2 )
            // InternalAlf.g:3820:3: rule__AssociationDefinition__OwnedMembershipAssignment_2
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
    // InternalAlf.g:3828:1: rule__AssociationDefinition__Group__3 : rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4 ;
    public final void rule__AssociationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3832:1: ( rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4 )
            // InternalAlf.g:3833:2: rule__AssociationDefinition__Group__3__Impl rule__AssociationDefinition__Group__4
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
    // InternalAlf.g:3840:1: rule__AssociationDefinition__Group__3__Impl : ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) ) ;
    public final void rule__AssociationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3844:1: ( ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) ) )
            // InternalAlf.g:3845:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) )
            {
            // InternalAlf.g:3845:1: ( ( rule__AssociationDefinition__OwnedMembershipAssignment_3 ) )
            // InternalAlf.g:3846:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_3 )
            {
             before(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssignment_3()); 
            // InternalAlf.g:3847:2: ( rule__AssociationDefinition__OwnedMembershipAssignment_3 )
            // InternalAlf.g:3847:3: rule__AssociationDefinition__OwnedMembershipAssignment_3
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
    // InternalAlf.g:3855:1: rule__AssociationDefinition__Group__4 : rule__AssociationDefinition__Group__4__Impl ;
    public final void rule__AssociationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3859:1: ( rule__AssociationDefinition__Group__4__Impl )
            // InternalAlf.g:3860:2: rule__AssociationDefinition__Group__4__Impl
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
    // InternalAlf.g:3866:1: rule__AssociationDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__AssociationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3870:1: ( ( '}' ) )
            // InternalAlf.g:3871:1: ( '}' )
            {
            // InternalAlf.g:3871:1: ( '}' )
            // InternalAlf.g:3872:2: '}'
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


    // $ANTLR start "rule__TypedFeatureDefinition__Group__0"
    // InternalAlf.g:3882:1: rule__TypedFeatureDefinition__Group__0 : rule__TypedFeatureDefinition__Group__0__Impl rule__TypedFeatureDefinition__Group__1 ;
    public final void rule__TypedFeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3886:1: ( rule__TypedFeatureDefinition__Group__0__Impl rule__TypedFeatureDefinition__Group__1 )
            // InternalAlf.g:3887:2: rule__TypedFeatureDefinition__Group__0__Impl rule__TypedFeatureDefinition__Group__1
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
    // InternalAlf.g:3894:1: rule__TypedFeatureDefinition__Group__0__Impl : ( ( rule__TypedFeatureDefinition__NameAssignment_0 ) ) ;
    public final void rule__TypedFeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3898:1: ( ( ( rule__TypedFeatureDefinition__NameAssignment_0 ) ) )
            // InternalAlf.g:3899:1: ( ( rule__TypedFeatureDefinition__NameAssignment_0 ) )
            {
            // InternalAlf.g:3899:1: ( ( rule__TypedFeatureDefinition__NameAssignment_0 ) )
            // InternalAlf.g:3900:2: ( rule__TypedFeatureDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getNameAssignment_0()); 
            // InternalAlf.g:3901:2: ( rule__TypedFeatureDefinition__NameAssignment_0 )
            // InternalAlf.g:3901:3: rule__TypedFeatureDefinition__NameAssignment_0
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
    // InternalAlf.g:3909:1: rule__TypedFeatureDefinition__Group__1 : rule__TypedFeatureDefinition__Group__1__Impl rule__TypedFeatureDefinition__Group__2 ;
    public final void rule__TypedFeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3913:1: ( rule__TypedFeatureDefinition__Group__1__Impl rule__TypedFeatureDefinition__Group__2 )
            // InternalAlf.g:3914:2: rule__TypedFeatureDefinition__Group__1__Impl rule__TypedFeatureDefinition__Group__2
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
    // InternalAlf.g:3921:1: rule__TypedFeatureDefinition__Group__1__Impl : ( ( rule__TypedFeatureDefinition__Group_1__0 )? ) ;
    public final void rule__TypedFeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3925:1: ( ( ( rule__TypedFeatureDefinition__Group_1__0 )? ) )
            // InternalAlf.g:3926:1: ( ( rule__TypedFeatureDefinition__Group_1__0 )? )
            {
            // InternalAlf.g:3926:1: ( ( rule__TypedFeatureDefinition__Group_1__0 )? )
            // InternalAlf.g:3927:2: ( rule__TypedFeatureDefinition__Group_1__0 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_1()); 
            // InternalAlf.g:3928:2: ( rule__TypedFeatureDefinition__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==42) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:3928:3: rule__TypedFeatureDefinition__Group_1__0
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
    // InternalAlf.g:3936:1: rule__TypedFeatureDefinition__Group__2 : rule__TypedFeatureDefinition__Group__2__Impl rule__TypedFeatureDefinition__Group__3 ;
    public final void rule__TypedFeatureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3940:1: ( rule__TypedFeatureDefinition__Group__2__Impl rule__TypedFeatureDefinition__Group__3 )
            // InternalAlf.g:3941:2: rule__TypedFeatureDefinition__Group__2__Impl rule__TypedFeatureDefinition__Group__3
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
    // InternalAlf.g:3948:1: rule__TypedFeatureDefinition__Group__2__Impl : ( ( rule__TypedFeatureDefinition__Group_2__0 )? ) ;
    public final void rule__TypedFeatureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3952:1: ( ( ( rule__TypedFeatureDefinition__Group_2__0 )? ) )
            // InternalAlf.g:3953:1: ( ( rule__TypedFeatureDefinition__Group_2__0 )? )
            {
            // InternalAlf.g:3953:1: ( ( rule__TypedFeatureDefinition__Group_2__0 )? )
            // InternalAlf.g:3954:2: ( rule__TypedFeatureDefinition__Group_2__0 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_2()); 
            // InternalAlf.g:3955:2: ( rule__TypedFeatureDefinition__Group_2__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:3955:3: rule__TypedFeatureDefinition__Group_2__0
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
    // InternalAlf.g:3963:1: rule__TypedFeatureDefinition__Group__3 : rule__TypedFeatureDefinition__Group__3__Impl rule__TypedFeatureDefinition__Group__4 ;
    public final void rule__TypedFeatureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3967:1: ( rule__TypedFeatureDefinition__Group__3__Impl rule__TypedFeatureDefinition__Group__4 )
            // InternalAlf.g:3968:2: rule__TypedFeatureDefinition__Group__3__Impl rule__TypedFeatureDefinition__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__TypedFeatureDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAlf.g:3975:1: rule__TypedFeatureDefinition__Group__3__Impl : ( ( rule__TypedFeatureDefinition__Group_3__0 )? ) ;
    public final void rule__TypedFeatureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3979:1: ( ( ( rule__TypedFeatureDefinition__Group_3__0 )? ) )
            // InternalAlf.g:3980:1: ( ( rule__TypedFeatureDefinition__Group_3__0 )? )
            {
            // InternalAlf.g:3980:1: ( ( rule__TypedFeatureDefinition__Group_3__0 )? )
            // InternalAlf.g:3981:2: ( rule__TypedFeatureDefinition__Group_3__0 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_3()); 
            // InternalAlf.g:3982:2: ( rule__TypedFeatureDefinition__Group_3__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:3982:3: rule__TypedFeatureDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypedFeatureDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypedFeatureDefinition__Group__4"
    // InternalAlf.g:3990:1: rule__TypedFeatureDefinition__Group__4 : rule__TypedFeatureDefinition__Group__4__Impl ;
    public final void rule__TypedFeatureDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3994:1: ( rule__TypedFeatureDefinition__Group__4__Impl )
            // InternalAlf.g:3995:2: rule__TypedFeatureDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__4"


    // $ANTLR start "rule__TypedFeatureDefinition__Group__4__Impl"
    // InternalAlf.g:4001:1: rule__TypedFeatureDefinition__Group__4__Impl : ( ( rule__TypedFeatureDefinition__Alternatives_4 ) ) ;
    public final void rule__TypedFeatureDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4005:1: ( ( ( rule__TypedFeatureDefinition__Alternatives_4 ) ) )
            // InternalAlf.g:4006:1: ( ( rule__TypedFeatureDefinition__Alternatives_4 ) )
            {
            // InternalAlf.g:4006:1: ( ( rule__TypedFeatureDefinition__Alternatives_4 ) )
            // InternalAlf.g:4007:2: ( rule__TypedFeatureDefinition__Alternatives_4 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getAlternatives_4()); 
            // InternalAlf.g:4008:2: ( rule__TypedFeatureDefinition__Alternatives_4 )
            // InternalAlf.g:4008:3: rule__TypedFeatureDefinition__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group__4__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_1__0"
    // InternalAlf.g:4017:1: rule__TypedFeatureDefinition__Group_1__0 : rule__TypedFeatureDefinition__Group_1__0__Impl rule__TypedFeatureDefinition__Group_1__1 ;
    public final void rule__TypedFeatureDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4021:1: ( rule__TypedFeatureDefinition__Group_1__0__Impl rule__TypedFeatureDefinition__Group_1__1 )
            // InternalAlf.g:4022:2: rule__TypedFeatureDefinition__Group_1__0__Impl rule__TypedFeatureDefinition__Group_1__1
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
    // InternalAlf.g:4029:1: rule__TypedFeatureDefinition__Group_1__0__Impl : ( ':' ) ;
    public final void rule__TypedFeatureDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4033:1: ( ( ':' ) )
            // InternalAlf.g:4034:1: ( ':' )
            {
            // InternalAlf.g:4034:1: ( ':' )
            // InternalAlf.g:4035:2: ':'
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
    // InternalAlf.g:4044:1: rule__TypedFeatureDefinition__Group_1__1 : rule__TypedFeatureDefinition__Group_1__1__Impl rule__TypedFeatureDefinition__Group_1__2 ;
    public final void rule__TypedFeatureDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4048:1: ( rule__TypedFeatureDefinition__Group_1__1__Impl rule__TypedFeatureDefinition__Group_1__2 )
            // InternalAlf.g:4049:2: rule__TypedFeatureDefinition__Group_1__1__Impl rule__TypedFeatureDefinition__Group_1__2
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
    // InternalAlf.g:4056:1: rule__TypedFeatureDefinition__Group_1__1__Impl : ( ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )? ) ;
    public final void rule__TypedFeatureDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4060:1: ( ( ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )? ) )
            // InternalAlf.g:4061:1: ( ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )? )
            {
            // InternalAlf.g:4061:1: ( ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )? )
            // InternalAlf.g:4062:2: ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeAssignment_1_1()); 
            // InternalAlf.g:4063:2: ( rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:4063:3: rule__TypedFeatureDefinition__IsCompositeAssignment_1_1
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
    // InternalAlf.g:4071:1: rule__TypedFeatureDefinition__Group_1__2 : rule__TypedFeatureDefinition__Group_1__2__Impl rule__TypedFeatureDefinition__Group_1__3 ;
    public final void rule__TypedFeatureDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4075:1: ( rule__TypedFeatureDefinition__Group_1__2__Impl rule__TypedFeatureDefinition__Group_1__3 )
            // InternalAlf.g:4076:2: rule__TypedFeatureDefinition__Group_1__2__Impl rule__TypedFeatureDefinition__Group_1__3
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
    // InternalAlf.g:4083:1: rule__TypedFeatureDefinition__Group_1__2__Impl : ( ( rule__TypedFeatureDefinition__Alternatives_1_2 ) ) ;
    public final void rule__TypedFeatureDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4087:1: ( ( ( rule__TypedFeatureDefinition__Alternatives_1_2 ) ) )
            // InternalAlf.g:4088:1: ( ( rule__TypedFeatureDefinition__Alternatives_1_2 ) )
            {
            // InternalAlf.g:4088:1: ( ( rule__TypedFeatureDefinition__Alternatives_1_2 ) )
            // InternalAlf.g:4089:2: ( rule__TypedFeatureDefinition__Alternatives_1_2 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getAlternatives_1_2()); 
            // InternalAlf.g:4090:2: ( rule__TypedFeatureDefinition__Alternatives_1_2 )
            // InternalAlf.g:4090:3: rule__TypedFeatureDefinition__Alternatives_1_2
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
    // InternalAlf.g:4098:1: rule__TypedFeatureDefinition__Group_1__3 : rule__TypedFeatureDefinition__Group_1__3__Impl ;
    public final void rule__TypedFeatureDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4102:1: ( rule__TypedFeatureDefinition__Group_1__3__Impl )
            // InternalAlf.g:4103:2: rule__TypedFeatureDefinition__Group_1__3__Impl
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
    // InternalAlf.g:4109:1: rule__TypedFeatureDefinition__Group_1__3__Impl : ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )? ) ;
    public final void rule__TypedFeatureDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4113:1: ( ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )? ) )
            // InternalAlf.g:4114:1: ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )? )
            {
            // InternalAlf.g:4114:1: ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )? )
            // InternalAlf.g:4115:2: ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipAssignment_1_3()); 
            // InternalAlf.g:4116:2: ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==18||LA59_0==23||LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:4116:3: rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3
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
    // InternalAlf.g:4125:1: rule__TypedFeatureDefinition__Group_2__0 : rule__TypedFeatureDefinition__Group_2__0__Impl rule__TypedFeatureDefinition__Group_2__1 ;
    public final void rule__TypedFeatureDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4129:1: ( rule__TypedFeatureDefinition__Group_2__0__Impl rule__TypedFeatureDefinition__Group_2__1 )
            // InternalAlf.g:4130:2: rule__TypedFeatureDefinition__Group_2__0__Impl rule__TypedFeatureDefinition__Group_2__1
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
    // InternalAlf.g:4137:1: rule__TypedFeatureDefinition__Group_2__0__Impl : ( '[' ) ;
    public final void rule__TypedFeatureDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4141:1: ( ( '[' ) )
            // InternalAlf.g:4142:1: ( '[' )
            {
            // InternalAlf.g:4142:1: ( '[' )
            // InternalAlf.g:4143:2: '['
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
    // InternalAlf.g:4152:1: rule__TypedFeatureDefinition__Group_2__1 : rule__TypedFeatureDefinition__Group_2__1__Impl rule__TypedFeatureDefinition__Group_2__2 ;
    public final void rule__TypedFeatureDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4156:1: ( rule__TypedFeatureDefinition__Group_2__1__Impl rule__TypedFeatureDefinition__Group_2__2 )
            // InternalAlf.g:4157:2: rule__TypedFeatureDefinition__Group_2__1__Impl rule__TypedFeatureDefinition__Group_2__2
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
    // InternalAlf.g:4164:1: rule__TypedFeatureDefinition__Group_2__1__Impl : ( ( rule__TypedFeatureDefinition__Group_2_1__0 )? ) ;
    public final void rule__TypedFeatureDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4168:1: ( ( ( rule__TypedFeatureDefinition__Group_2_1__0 )? ) )
            // InternalAlf.g:4169:1: ( ( rule__TypedFeatureDefinition__Group_2_1__0 )? )
            {
            // InternalAlf.g:4169:1: ( ( rule__TypedFeatureDefinition__Group_2_1__0 )? )
            // InternalAlf.g:4170:2: ( rule__TypedFeatureDefinition__Group_2_1__0 )?
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getGroup_2_1()); 
            // InternalAlf.g:4171:2: ( rule__TypedFeatureDefinition__Group_2_1__0 )?
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
                    // InternalAlf.g:4171:3: rule__TypedFeatureDefinition__Group_2_1__0
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
    // InternalAlf.g:4179:1: rule__TypedFeatureDefinition__Group_2__2 : rule__TypedFeatureDefinition__Group_2__2__Impl rule__TypedFeatureDefinition__Group_2__3 ;
    public final void rule__TypedFeatureDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4183:1: ( rule__TypedFeatureDefinition__Group_2__2__Impl rule__TypedFeatureDefinition__Group_2__3 )
            // InternalAlf.g:4184:2: rule__TypedFeatureDefinition__Group_2__2__Impl rule__TypedFeatureDefinition__Group_2__3
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
    // InternalAlf.g:4191:1: rule__TypedFeatureDefinition__Group_2__2__Impl : ( ( rule__TypedFeatureDefinition__UpperAssignment_2_2 ) ) ;
    public final void rule__TypedFeatureDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4195:1: ( ( ( rule__TypedFeatureDefinition__UpperAssignment_2_2 ) ) )
            // InternalAlf.g:4196:1: ( ( rule__TypedFeatureDefinition__UpperAssignment_2_2 ) )
            {
            // InternalAlf.g:4196:1: ( ( rule__TypedFeatureDefinition__UpperAssignment_2_2 ) )
            // InternalAlf.g:4197:2: ( rule__TypedFeatureDefinition__UpperAssignment_2_2 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getUpperAssignment_2_2()); 
            // InternalAlf.g:4198:2: ( rule__TypedFeatureDefinition__UpperAssignment_2_2 )
            // InternalAlf.g:4198:3: rule__TypedFeatureDefinition__UpperAssignment_2_2
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
    // InternalAlf.g:4206:1: rule__TypedFeatureDefinition__Group_2__3 : rule__TypedFeatureDefinition__Group_2__3__Impl ;
    public final void rule__TypedFeatureDefinition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4210:1: ( rule__TypedFeatureDefinition__Group_2__3__Impl )
            // InternalAlf.g:4211:2: rule__TypedFeatureDefinition__Group_2__3__Impl
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
    // InternalAlf.g:4217:1: rule__TypedFeatureDefinition__Group_2__3__Impl : ( ']' ) ;
    public final void rule__TypedFeatureDefinition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4221:1: ( ( ']' ) )
            // InternalAlf.g:4222:1: ( ']' )
            {
            // InternalAlf.g:4222:1: ( ']' )
            // InternalAlf.g:4223:2: ']'
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
    // InternalAlf.g:4233:1: rule__TypedFeatureDefinition__Group_2_1__0 : rule__TypedFeatureDefinition__Group_2_1__0__Impl rule__TypedFeatureDefinition__Group_2_1__1 ;
    public final void rule__TypedFeatureDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4237:1: ( rule__TypedFeatureDefinition__Group_2_1__0__Impl rule__TypedFeatureDefinition__Group_2_1__1 )
            // InternalAlf.g:4238:2: rule__TypedFeatureDefinition__Group_2_1__0__Impl rule__TypedFeatureDefinition__Group_2_1__1
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
    // InternalAlf.g:4245:1: rule__TypedFeatureDefinition__Group_2_1__0__Impl : ( ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 ) ) ;
    public final void rule__TypedFeatureDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4249:1: ( ( ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 ) ) )
            // InternalAlf.g:4250:1: ( ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 ) )
            {
            // InternalAlf.g:4250:1: ( ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 ) )
            // InternalAlf.g:4251:2: ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getLowerAssignment_2_1_0()); 
            // InternalAlf.g:4252:2: ( rule__TypedFeatureDefinition__LowerAssignment_2_1_0 )
            // InternalAlf.g:4252:3: rule__TypedFeatureDefinition__LowerAssignment_2_1_0
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
    // InternalAlf.g:4260:1: rule__TypedFeatureDefinition__Group_2_1__1 : rule__TypedFeatureDefinition__Group_2_1__1__Impl ;
    public final void rule__TypedFeatureDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4264:1: ( rule__TypedFeatureDefinition__Group_2_1__1__Impl )
            // InternalAlf.g:4265:2: rule__TypedFeatureDefinition__Group_2_1__1__Impl
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
    // InternalAlf.g:4271:1: rule__TypedFeatureDefinition__Group_2_1__1__Impl : ( '..' ) ;
    public final void rule__TypedFeatureDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4275:1: ( ( '..' ) )
            // InternalAlf.g:4276:1: ( '..' )
            {
            // InternalAlf.g:4276:1: ( '..' )
            // InternalAlf.g:4277:2: '..'
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


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3__0"
    // InternalAlf.g:4287:1: rule__TypedFeatureDefinition__Group_3__0 : rule__TypedFeatureDefinition__Group_3__0__Impl rule__TypedFeatureDefinition__Group_3__1 ;
    public final void rule__TypedFeatureDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4291:1: ( rule__TypedFeatureDefinition__Group_3__0__Impl rule__TypedFeatureDefinition__Group_3__1 )
            // InternalAlf.g:4292:2: rule__TypedFeatureDefinition__Group_3__0__Impl rule__TypedFeatureDefinition__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__TypedFeatureDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3__0__Impl"
    // InternalAlf.g:4299:1: rule__TypedFeatureDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__TypedFeatureDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4303:1: ( ( '=' ) )
            // InternalAlf.g:4304:1: ( '=' )
            {
            // InternalAlf.g:4304:1: ( '=' )
            // InternalAlf.g:4305:2: '='
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3__1"
    // InternalAlf.g:4314:1: rule__TypedFeatureDefinition__Group_3__1 : rule__TypedFeatureDefinition__Group_3__1__Impl ;
    public final void rule__TypedFeatureDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4318:1: ( rule__TypedFeatureDefinition__Group_3__1__Impl )
            // InternalAlf.g:4319:2: rule__TypedFeatureDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_3__1__Impl"
    // InternalAlf.g:4325:1: rule__TypedFeatureDefinition__Group_3__1__Impl : ( ( rule__TypedFeatureDefinition__ValueAssignment_3_1 ) ) ;
    public final void rule__TypedFeatureDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4329:1: ( ( ( rule__TypedFeatureDefinition__ValueAssignment_3_1 ) ) )
            // InternalAlf.g:4330:1: ( ( rule__TypedFeatureDefinition__ValueAssignment_3_1 ) )
            {
            // InternalAlf.g:4330:1: ( ( rule__TypedFeatureDefinition__ValueAssignment_3_1 ) )
            // InternalAlf.g:4331:2: ( rule__TypedFeatureDefinition__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getValueAssignment_3_1()); 
            // InternalAlf.g:4332:2: ( rule__TypedFeatureDefinition__ValueAssignment_3_1 )
            // InternalAlf.g:4332:3: rule__TypedFeatureDefinition__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedFeatureDefinitionAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_4_1__0"
    // InternalAlf.g:4341:1: rule__TypedFeatureDefinition__Group_4_1__0 : rule__TypedFeatureDefinition__Group_4_1__0__Impl rule__TypedFeatureDefinition__Group_4_1__1 ;
    public final void rule__TypedFeatureDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4345:1: ( rule__TypedFeatureDefinition__Group_4_1__0__Impl rule__TypedFeatureDefinition__Group_4_1__1 )
            // InternalAlf.g:4346:2: rule__TypedFeatureDefinition__Group_4_1__0__Impl rule__TypedFeatureDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_18);
            rule__TypedFeatureDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_4_1__0"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_4_1__0__Impl"
    // InternalAlf.g:4353:1: rule__TypedFeatureDefinition__Group_4_1__0__Impl : ( '{' ) ;
    public final void rule__TypedFeatureDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4357:1: ( ( '{' ) )
            // InternalAlf.g:4358:1: ( '{' )
            {
            // InternalAlf.g:4358:1: ( '{' )
            // InternalAlf.g:4359:2: '{'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_4_1__1"
    // InternalAlf.g:4368:1: rule__TypedFeatureDefinition__Group_4_1__1 : rule__TypedFeatureDefinition__Group_4_1__1__Impl rule__TypedFeatureDefinition__Group_4_1__2 ;
    public final void rule__TypedFeatureDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4372:1: ( rule__TypedFeatureDefinition__Group_4_1__1__Impl rule__TypedFeatureDefinition__Group_4_1__2 )
            // InternalAlf.g:4373:2: rule__TypedFeatureDefinition__Group_4_1__1__Impl rule__TypedFeatureDefinition__Group_4_1__2
            {
            pushFollow(FOLLOW_18);
            rule__TypedFeatureDefinition__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_4_1__1"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_4_1__1__Impl"
    // InternalAlf.g:4380:1: rule__TypedFeatureDefinition__Group_4_1__1__Impl : ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1 )* ) ;
    public final void rule__TypedFeatureDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4384:1: ( ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1 )* ) )
            // InternalAlf.g:4385:1: ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1 )* )
            {
            // InternalAlf.g:4385:1: ( ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1 )* )
            // InternalAlf.g:4386:2: ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1 )*
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipAssignment_4_1_1()); 
            // InternalAlf.g:4387:2: ( rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_UNRESTRICTED_NAME)||(LA61_0>=15 && LA61_0<=17)||LA61_0==20||(LA61_0>=31 && LA61_0<=37)||LA61_0==41||(LA61_0>=53 && LA61_0<=55)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalAlf.g:4387:3: rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_4_1__2"
    // InternalAlf.g:4395:1: rule__TypedFeatureDefinition__Group_4_1__2 : rule__TypedFeatureDefinition__Group_4_1__2__Impl ;
    public final void rule__TypedFeatureDefinition__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4399:1: ( rule__TypedFeatureDefinition__Group_4_1__2__Impl )
            // InternalAlf.g:4400:2: rule__TypedFeatureDefinition__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedFeatureDefinition__Group_4_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_4_1__2"


    // $ANTLR start "rule__TypedFeatureDefinition__Group_4_1__2__Impl"
    // InternalAlf.g:4406:1: rule__TypedFeatureDefinition__Group_4_1__2__Impl : ( '}' ) ;
    public final void rule__TypedFeatureDefinition__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4410:1: ( ( '}' ) )
            // InternalAlf.g:4411:1: ( '}' )
            {
            // InternalAlf.g:4411:1: ( '}' )
            // InternalAlf.g:4412:2: '}'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_4_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__Group_4_1__2__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group__0"
    // InternalAlf.g:4422:1: rule__UntypedFeatureDefinition__Group__0 : rule__UntypedFeatureDefinition__Group__0__Impl rule__UntypedFeatureDefinition__Group__1 ;
    public final void rule__UntypedFeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4426:1: ( rule__UntypedFeatureDefinition__Group__0__Impl rule__UntypedFeatureDefinition__Group__1 )
            // InternalAlf.g:4427:2: rule__UntypedFeatureDefinition__Group__0__Impl rule__UntypedFeatureDefinition__Group__1
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
    // InternalAlf.g:4434:1: rule__UntypedFeatureDefinition__Group__0__Impl : ( ( rule__UntypedFeatureDefinition__NameAssignment_0 )? ) ;
    public final void rule__UntypedFeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4438:1: ( ( ( rule__UntypedFeatureDefinition__NameAssignment_0 )? ) )
            // InternalAlf.g:4439:1: ( ( rule__UntypedFeatureDefinition__NameAssignment_0 )? )
            {
            // InternalAlf.g:4439:1: ( ( rule__UntypedFeatureDefinition__NameAssignment_0 )? )
            // InternalAlf.g:4440:2: ( rule__UntypedFeatureDefinition__NameAssignment_0 )?
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getNameAssignment_0()); 
            // InternalAlf.g:4441:2: ( rule__UntypedFeatureDefinition__NameAssignment_0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlf.g:4441:3: rule__UntypedFeatureDefinition__NameAssignment_0
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
    // InternalAlf.g:4449:1: rule__UntypedFeatureDefinition__Group__1 : rule__UntypedFeatureDefinition__Group__1__Impl rule__UntypedFeatureDefinition__Group__2 ;
    public final void rule__UntypedFeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4453:1: ( rule__UntypedFeatureDefinition__Group__1__Impl rule__UntypedFeatureDefinition__Group__2 )
            // InternalAlf.g:4454:2: rule__UntypedFeatureDefinition__Group__1__Impl rule__UntypedFeatureDefinition__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAlf.g:4461:1: rule__UntypedFeatureDefinition__Group__1__Impl : ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4465:1: ( ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 ) ) )
            // InternalAlf.g:4466:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 ) )
            {
            // InternalAlf.g:4466:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 ) )
            // InternalAlf.g:4467:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipAssignment_1()); 
            // InternalAlf.g:4468:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 )
            // InternalAlf.g:4468:3: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1
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
    // InternalAlf.g:4476:1: rule__UntypedFeatureDefinition__Group__2 : rule__UntypedFeatureDefinition__Group__2__Impl ;
    public final void rule__UntypedFeatureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4480:1: ( rule__UntypedFeatureDefinition__Group__2__Impl )
            // InternalAlf.g:4481:2: rule__UntypedFeatureDefinition__Group__2__Impl
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
    // InternalAlf.g:4487:1: rule__UntypedFeatureDefinition__Group__2__Impl : ( ( rule__UntypedFeatureDefinition__Alternatives_2 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4491:1: ( ( ( rule__UntypedFeatureDefinition__Alternatives_2 ) ) )
            // InternalAlf.g:4492:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2 ) )
            {
            // InternalAlf.g:4492:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2 ) )
            // InternalAlf.g:4493:2: ( rule__UntypedFeatureDefinition__Alternatives_2 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getAlternatives_2()); 
            // InternalAlf.g:4494:2: ( rule__UntypedFeatureDefinition__Alternatives_2 )
            // InternalAlf.g:4494:3: rule__UntypedFeatureDefinition__Alternatives_2
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
    // InternalAlf.g:4503:1: rule__UntypedFeatureDefinition__Group_2_0__0 : rule__UntypedFeatureDefinition__Group_2_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4507:1: ( rule__UntypedFeatureDefinition__Group_2_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0__1 )
            // InternalAlf.g:4508:2: rule__UntypedFeatureDefinition__Group_2_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAlf.g:4515:1: rule__UntypedFeatureDefinition__Group_2_0__0__Impl : ( ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )? ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4519:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )? ) )
            // InternalAlf.g:4520:1: ( ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )? )
            {
            // InternalAlf.g:4520:1: ( ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )? )
            // InternalAlf.g:4521:2: ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )?
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_0()); 
            // InternalAlf.g:4522:2: ( rule__UntypedFeatureDefinition__Group_2_0_0__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==43) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:4522:3: rule__UntypedFeatureDefinition__Group_2_0_0__0
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
    // InternalAlf.g:4530:1: rule__UntypedFeatureDefinition__Group_2_0__1 : rule__UntypedFeatureDefinition__Group_2_0__1__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4534:1: ( rule__UntypedFeatureDefinition__Group_2_0__1__Impl )
            // InternalAlf.g:4535:2: rule__UntypedFeatureDefinition__Group_2_0__1__Impl
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
    // InternalAlf.g:4541:1: rule__UntypedFeatureDefinition__Group_2_0__1__Impl : ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4545:1: ( ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 ) ) )
            // InternalAlf.g:4546:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 ) )
            {
            // InternalAlf.g:4546:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 ) )
            // InternalAlf.g:4547:2: ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getAlternatives_2_0_1()); 
            // InternalAlf.g:4548:2: ( rule__UntypedFeatureDefinition__Alternatives_2_0_1 )
            // InternalAlf.g:4548:3: rule__UntypedFeatureDefinition__Alternatives_2_0_1
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
    // InternalAlf.g:4557:1: rule__UntypedFeatureDefinition__Group_2_0_0__0 : rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4561:1: ( rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0__1 )
            // InternalAlf.g:4562:2: rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0__1
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
    // InternalAlf.g:4569:1: rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl : ( '[' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4573:1: ( ( '[' ) )
            // InternalAlf.g:4574:1: ( '[' )
            {
            // InternalAlf.g:4574:1: ( '[' )
            // InternalAlf.g:4575:2: '['
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
    // InternalAlf.g:4584:1: rule__UntypedFeatureDefinition__Group_2_0_0__1 : rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_0__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4588:1: ( rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_0__2 )
            // InternalAlf.g:4589:2: rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_0__2
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
    // InternalAlf.g:4596:1: rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl : ( ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )? ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4600:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )? ) )
            // InternalAlf.g:4601:1: ( ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )? )
            {
            // InternalAlf.g:4601:1: ( ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )? )
            // InternalAlf.g:4602:2: ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )?
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_0_0_1()); 
            // InternalAlf.g:4603:2: ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0 )?
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
                    // InternalAlf.g:4603:3: rule__UntypedFeatureDefinition__Group_2_0_0_1__0
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
    // InternalAlf.g:4611:1: rule__UntypedFeatureDefinition__Group_2_0_0__2 : rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl rule__UntypedFeatureDefinition__Group_2_0_0__3 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4615:1: ( rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl rule__UntypedFeatureDefinition__Group_2_0_0__3 )
            // InternalAlf.g:4616:2: rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl rule__UntypedFeatureDefinition__Group_2_0_0__3
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
    // InternalAlf.g:4623:1: rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl : ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4627:1: ( ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 ) ) )
            // InternalAlf.g:4628:1: ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 ) )
            {
            // InternalAlf.g:4628:1: ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 ) )
            // InternalAlf.g:4629:2: ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperAssignment_2_0_0_2()); 
            // InternalAlf.g:4630:2: ( rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 )
            // InternalAlf.g:4630:3: rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2
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
    // InternalAlf.g:4638:1: rule__UntypedFeatureDefinition__Group_2_0_0__3 : rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4642:1: ( rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl )
            // InternalAlf.g:4643:2: rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl
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
    // InternalAlf.g:4649:1: rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl : ( ']' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4653:1: ( ( ']' ) )
            // InternalAlf.g:4654:1: ( ']' )
            {
            // InternalAlf.g:4654:1: ( ']' )
            // InternalAlf.g:4655:2: ']'
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
    // InternalAlf.g:4665:1: rule__UntypedFeatureDefinition__Group_2_0_0_1__0 : rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4669:1: ( rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0_1__1 )
            // InternalAlf.g:4670:2: rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_0_1__1
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
    // InternalAlf.g:4677:1: rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl : ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4681:1: ( ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 ) ) )
            // InternalAlf.g:4682:1: ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 ) )
            {
            // InternalAlf.g:4682:1: ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 ) )
            // InternalAlf.g:4683:2: ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerAssignment_2_0_0_1_0()); 
            // InternalAlf.g:4684:2: ( rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 )
            // InternalAlf.g:4684:3: rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0
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
    // InternalAlf.g:4692:1: rule__UntypedFeatureDefinition__Group_2_0_0_1__1 : rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4696:1: ( rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl )
            // InternalAlf.g:4697:2: rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl
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
    // InternalAlf.g:4703:1: rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl : ( '..' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4707:1: ( ( '..' ) )
            // InternalAlf.g:4708:1: ( '..' )
            {
            // InternalAlf.g:4708:1: ( '..' )
            // InternalAlf.g:4709:2: '..'
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
    // InternalAlf.g:4719:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__0 : rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4723:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__1 )
            // InternalAlf.g:4724:2: rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:4731:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl : ( '=' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4735:1: ( ( '=' ) )
            // InternalAlf.g:4736:1: ( '=' )
            {
            // InternalAlf.g:4736:1: ( '=' )
            // InternalAlf.g:4737:2: '='
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
    // InternalAlf.g:4746:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__1 : rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4750:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__2 )
            // InternalAlf.g:4751:2: rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalAlf.g:4758:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl : ( ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4762:1: ( ( ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 ) ) )
            // InternalAlf.g:4763:1: ( ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 ) )
            {
            // InternalAlf.g:4763:1: ( ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 ) )
            // InternalAlf.g:4764:2: ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getValueAssignment_2_0_1_0_1()); 
            // InternalAlf.g:4765:2: ( rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 )
            // InternalAlf.g:4765:3: rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1
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
    // InternalAlf.g:4773:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__2 : rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4777:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl )
            // InternalAlf.g:4778:2: rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl
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
    // InternalAlf.g:4784:1: rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl : ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4788:1: ( ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2 ) ) )
            // InternalAlf.g:4789:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2 ) )
            {
            // InternalAlf.g:4789:1: ( ( rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2 ) )
            // InternalAlf.g:4790:2: ( rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getAlternatives_2_0_1_0_2()); 
            // InternalAlf.g:4791:2: ( rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2 )
            // InternalAlf.g:4791:3: rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Alternatives_2_0_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getAlternatives_2_0_1_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0"
    // InternalAlf.g:4800:1: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0 : rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4804:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1 )
            // InternalAlf.g:4805:2: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0__Impl"
    // InternalAlf.g:4812:1: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0__Impl : ( '{' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4816:1: ( ( '{' ) )
            // InternalAlf.g:4817:1: ( '{' )
            {
            // InternalAlf.g:4817:1: ( '{' )
            // InternalAlf.g:4818:2: '{'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1_0_2_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__0__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1"
    // InternalAlf.g:4827:1: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1 : rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4831:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2 )
            // InternalAlf.g:4832:2: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2
            {
            pushFollow(FOLLOW_18);
            rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1__Impl"
    // InternalAlf.g:4839:1: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1__Impl : ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1 )* ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4843:1: ( ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1 )* ) )
            // InternalAlf.g:4844:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1 )* )
            {
            // InternalAlf.g:4844:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1 )* )
            // InternalAlf.g:4845:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1 )*
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipAssignment_2_0_1_0_2_1_1()); 
            // InternalAlf.g:4846:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_UNRESTRICTED_NAME)||(LA65_0>=15 && LA65_0<=17)||LA65_0==20||(LA65_0>=31 && LA65_0<=37)||LA65_0==41||(LA65_0>=53 && LA65_0<=55)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalAlf.g:4846:3: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipAssignment_2_0_1_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__1__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2"
    // InternalAlf.g:4854:1: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2 : rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4858:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2__Impl )
            // InternalAlf.g:4859:2: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2__Impl"
    // InternalAlf.g:4865:1: rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2__Impl : ( '}' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4869:1: ( ( '}' ) )
            // InternalAlf.g:4870:1: ( '}' )
            {
            // InternalAlf.g:4870:1: ( '}' )
            // InternalAlf.g:4871:2: '}'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_1_0_2_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUntypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_1_0_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__Group_2_0_1_0_2_1__2__Impl"


    // $ANTLR start "rule__UntypedFeatureDefinition__Group_2_0_1_1__0"
    // InternalAlf.g:4881:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__0 : rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4885:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__1 )
            // InternalAlf.g:4886:2: rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__1
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
    // InternalAlf.g:4893:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl : ( '{' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4897:1: ( ( '{' ) )
            // InternalAlf.g:4898:1: ( '{' )
            {
            // InternalAlf.g:4898:1: ( '{' )
            // InternalAlf.g:4899:2: '{'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAlf.g:4908:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__1 : rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4912:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__2 )
            // InternalAlf.g:4913:2: rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl rule__UntypedFeatureDefinition__Group_2_0_1_1__2
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
    // InternalAlf.g:4920:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl : ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )* ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4924:1: ( ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )* ) )
            // InternalAlf.g:4925:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )* )
            {
            // InternalAlf.g:4925:1: ( ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )* )
            // InternalAlf.g:4926:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )*
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipAssignment_2_0_1_1_1()); 
            // InternalAlf.g:4927:2: ( rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_UNRESTRICTED_NAME)||(LA66_0>=15 && LA66_0<=17)||LA66_0==20||(LA66_0>=31 && LA66_0<=37)||LA66_0==41||(LA66_0>=53 && LA66_0<=55)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalAlf.g:4927:3: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // InternalAlf.g:4935:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__2 : rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4939:1: ( rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl )
            // InternalAlf.g:4940:2: rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl
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
    // InternalAlf.g:4946:1: rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl : ( '}' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4950:1: ( ( '}' ) )
            // InternalAlf.g:4951:1: ( '}' )
            {
            // InternalAlf.g:4951:1: ( '}' )
            // InternalAlf.g:4952:2: '}'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_1_1_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAlf.g:4962:1: rule__UntypedFeatureDefinition__Group_2_1__0 : rule__UntypedFeatureDefinition__Group_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4966:1: ( rule__UntypedFeatureDefinition__Group_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1__1 )
            // InternalAlf.g:4967:2: rule__UntypedFeatureDefinition__Group_2_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1__1
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
    // InternalAlf.g:4974:1: rule__UntypedFeatureDefinition__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4978:1: ( ( '[' ) )
            // InternalAlf.g:4979:1: ( '[' )
            {
            // InternalAlf.g:4979:1: ( '[' )
            // InternalAlf.g:4980:2: '['
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
    // InternalAlf.g:4989:1: rule__UntypedFeatureDefinition__Group_2_1__1 : rule__UntypedFeatureDefinition__Group_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_1__2 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4993:1: ( rule__UntypedFeatureDefinition__Group_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_1__2 )
            // InternalAlf.g:4994:2: rule__UntypedFeatureDefinition__Group_2_1__1__Impl rule__UntypedFeatureDefinition__Group_2_1__2
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
    // InternalAlf.g:5001:1: rule__UntypedFeatureDefinition__Group_2_1__1__Impl : ( ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )? ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5005:1: ( ( ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )? ) )
            // InternalAlf.g:5006:1: ( ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )? )
            {
            // InternalAlf.g:5006:1: ( ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )? )
            // InternalAlf.g:5007:2: ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )?
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getGroup_2_1_1()); 
            // InternalAlf.g:5008:2: ( rule__UntypedFeatureDefinition__Group_2_1_1__0 )?
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
                    // InternalAlf.g:5008:3: rule__UntypedFeatureDefinition__Group_2_1_1__0
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
    // InternalAlf.g:5016:1: rule__UntypedFeatureDefinition__Group_2_1__2 : rule__UntypedFeatureDefinition__Group_2_1__2__Impl rule__UntypedFeatureDefinition__Group_2_1__3 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5020:1: ( rule__UntypedFeatureDefinition__Group_2_1__2__Impl rule__UntypedFeatureDefinition__Group_2_1__3 )
            // InternalAlf.g:5021:2: rule__UntypedFeatureDefinition__Group_2_1__2__Impl rule__UntypedFeatureDefinition__Group_2_1__3
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
    // InternalAlf.g:5028:1: rule__UntypedFeatureDefinition__Group_2_1__2__Impl : ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5032:1: ( ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 ) ) )
            // InternalAlf.g:5033:1: ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 ) )
            {
            // InternalAlf.g:5033:1: ( ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 ) )
            // InternalAlf.g:5034:2: ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getUpperAssignment_2_1_2()); 
            // InternalAlf.g:5035:2: ( rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 )
            // InternalAlf.g:5035:3: rule__UntypedFeatureDefinition__UpperAssignment_2_1_2
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
    // InternalAlf.g:5043:1: rule__UntypedFeatureDefinition__Group_2_1__3 : rule__UntypedFeatureDefinition__Group_2_1__3__Impl rule__UntypedFeatureDefinition__Group_2_1__4 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5047:1: ( rule__UntypedFeatureDefinition__Group_2_1__3__Impl rule__UntypedFeatureDefinition__Group_2_1__4 )
            // InternalAlf.g:5048:2: rule__UntypedFeatureDefinition__Group_2_1__3__Impl rule__UntypedFeatureDefinition__Group_2_1__4
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
    // InternalAlf.g:5055:1: rule__UntypedFeatureDefinition__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5059:1: ( ( ']' ) )
            // InternalAlf.g:5060:1: ( ']' )
            {
            // InternalAlf.g:5060:1: ( ']' )
            // InternalAlf.g:5061:2: ']'
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
    // InternalAlf.g:5070:1: rule__UntypedFeatureDefinition__Group_2_1__4 : rule__UntypedFeatureDefinition__Group_2_1__4__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5074:1: ( rule__UntypedFeatureDefinition__Group_2_1__4__Impl )
            // InternalAlf.g:5075:2: rule__UntypedFeatureDefinition__Group_2_1__4__Impl
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
    // InternalAlf.g:5081:1: rule__UntypedFeatureDefinition__Group_2_1__4__Impl : ( ';' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5085:1: ( ( ';' ) )
            // InternalAlf.g:5086:1: ( ';' )
            {
            // InternalAlf.g:5086:1: ( ';' )
            // InternalAlf.g:5087:2: ';'
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getSemicolonKeyword_2_1_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAlf.g:5097:1: rule__UntypedFeatureDefinition__Group_2_1_1__0 : rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1_1__1 ;
    public final void rule__UntypedFeatureDefinition__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5101:1: ( rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1_1__1 )
            // InternalAlf.g:5102:2: rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl rule__UntypedFeatureDefinition__Group_2_1_1__1
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
    // InternalAlf.g:5109:1: rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl : ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 ) ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5113:1: ( ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 ) ) )
            // InternalAlf.g:5114:1: ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 ) )
            {
            // InternalAlf.g:5114:1: ( ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 ) )
            // InternalAlf.g:5115:2: ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 )
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getLowerAssignment_2_1_1_0()); 
            // InternalAlf.g:5116:2: ( rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 )
            // InternalAlf.g:5116:3: rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0
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
    // InternalAlf.g:5124:1: rule__UntypedFeatureDefinition__Group_2_1_1__1 : rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl ;
    public final void rule__UntypedFeatureDefinition__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5128:1: ( rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl )
            // InternalAlf.g:5129:2: rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl
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
    // InternalAlf.g:5135:1: rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl : ( '..' ) ;
    public final void rule__UntypedFeatureDefinition__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5139:1: ( ( '..' ) )
            // InternalAlf.g:5140:1: ( '..' )
            {
            // InternalAlf.g:5140:1: ( '..' )
            // InternalAlf.g:5141:2: '..'
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
    // InternalAlf.g:5151:1: rule__OwnedRedefinitionOrSubset__Group_0__0 : rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5155:1: ( rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 )
            // InternalAlf.g:5156:2: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1
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
    // InternalAlf.g:5163:1: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl : ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5167:1: ( ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) )
            // InternalAlf.g:5168:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            {
            // InternalAlf.g:5168:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            // InternalAlf.g:5169:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives_0_0()); 
            // InternalAlf.g:5170:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            // InternalAlf.g:5170:3: rule__OwnedRedefinitionOrSubset__Alternatives_0_0
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
    // InternalAlf.g:5178:1: rule__OwnedRedefinitionOrSubset__Group_0__1 : rule__OwnedRedefinitionOrSubset__Group_0__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5182:1: ( rule__OwnedRedefinitionOrSubset__Group_0__1__Impl )
            // InternalAlf.g:5183:2: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl
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
    // InternalAlf.g:5189:1: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5193:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) )
            // InternalAlf.g:5194:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            {
            // InternalAlf.g:5194:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            // InternalAlf.g:5195:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_0_1()); 
            // InternalAlf.g:5196:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            // InternalAlf.g:5196:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1
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
    // InternalAlf.g:5205:1: rule__OwnedRedefinitionOrSubset__Group_1__0 : rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5209:1: ( rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 )
            // InternalAlf.g:5210:2: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1
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
    // InternalAlf.g:5217:1: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl : ( 'subsets' ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5221:1: ( ( 'subsets' ) )
            // InternalAlf.g:5222:1: ( 'subsets' )
            {
            // InternalAlf.g:5222:1: ( 'subsets' )
            // InternalAlf.g:5223:2: 'subsets'
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
    // InternalAlf.g:5232:1: rule__OwnedRedefinitionOrSubset__Group_1__1 : rule__OwnedRedefinitionOrSubset__Group_1__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5236:1: ( rule__OwnedRedefinitionOrSubset__Group_1__1__Impl )
            // InternalAlf.g:5237:2: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl
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
    // InternalAlf.g:5243:1: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5247:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) )
            // InternalAlf.g:5248:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            {
            // InternalAlf.g:5248:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            // InternalAlf.g:5249:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_1_1()); 
            // InternalAlf.g:5250:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            // InternalAlf.g:5250:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1
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
    // InternalAlf.g:5259:1: rule__ConnectorDefinition__Group__0 : rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 ;
    public final void rule__ConnectorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5263:1: ( rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 )
            // InternalAlf.g:5264:2: rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1
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
    // InternalAlf.g:5271:1: rule__ConnectorDefinition__Group__0__Impl : ( ( rule__ConnectorDefinition__Group_0__0 )? ) ;
    public final void rule__ConnectorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5275:1: ( ( ( rule__ConnectorDefinition__Group_0__0 )? ) )
            // InternalAlf.g:5276:1: ( ( rule__ConnectorDefinition__Group_0__0 )? )
            {
            // InternalAlf.g:5276:1: ( ( rule__ConnectorDefinition__Group_0__0 )? )
            // InternalAlf.g:5277:2: ( rule__ConnectorDefinition__Group_0__0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup_0()); 
            // InternalAlf.g:5278:2: ( rule__ConnectorDefinition__Group_0__0 )?
            int alt68=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA68_1 = input.LA(2);

                    if ( (LA68_1==18||LA68_1==42) ) {
                        alt68=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==18||LA68_2==42) ) {
                        alt68=1;
                    }
                    }
                    break;
                case 18:
                case 42:
                    {
                    alt68=1;
                    }
                    break;
            }

            switch (alt68) {
                case 1 :
                    // InternalAlf.g:5278:3: rule__ConnectorDefinition__Group_0__0
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
    // InternalAlf.g:5286:1: rule__ConnectorDefinition__Group__1 : rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 ;
    public final void rule__ConnectorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5290:1: ( rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 )
            // InternalAlf.g:5291:2: rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2
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
    // InternalAlf.g:5298:1: rule__ConnectorDefinition__Group__1__Impl : ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) ) ;
    public final void rule__ConnectorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5302:1: ( ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) ) )
            // InternalAlf.g:5303:1: ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) )
            {
            // InternalAlf.g:5303:1: ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) )
            // InternalAlf.g:5304:2: ( rule__ConnectorDefinition__SourceFeatureAssignment_1 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureAssignment_1()); 
            // InternalAlf.g:5305:2: ( rule__ConnectorDefinition__SourceFeatureAssignment_1 )
            // InternalAlf.g:5305:3: rule__ConnectorDefinition__SourceFeatureAssignment_1
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
    // InternalAlf.g:5313:1: rule__ConnectorDefinition__Group__2 : rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 ;
    public final void rule__ConnectorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5317:1: ( rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 )
            // InternalAlf.g:5318:2: rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3
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
    // InternalAlf.g:5325:1: rule__ConnectorDefinition__Group__2__Impl : ( '=>' ) ;
    public final void rule__ConnectorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5329:1: ( ( '=>' ) )
            // InternalAlf.g:5330:1: ( '=>' )
            {
            // InternalAlf.g:5330:1: ( '=>' )
            // InternalAlf.g:5331:2: '=>'
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
    // InternalAlf.g:5340:1: rule__ConnectorDefinition__Group__3 : rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 ;
    public final void rule__ConnectorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5344:1: ( rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 )
            // InternalAlf.g:5345:2: rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4
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
    // InternalAlf.g:5352:1: rule__ConnectorDefinition__Group__3__Impl : ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) ) ;
    public final void rule__ConnectorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5356:1: ( ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) ) )
            // InternalAlf.g:5357:1: ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) )
            {
            // InternalAlf.g:5357:1: ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) )
            // InternalAlf.g:5358:2: ( rule__ConnectorDefinition__TargetFeatureAssignment_3 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureAssignment_3()); 
            // InternalAlf.g:5359:2: ( rule__ConnectorDefinition__TargetFeatureAssignment_3 )
            // InternalAlf.g:5359:3: rule__ConnectorDefinition__TargetFeatureAssignment_3
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
    // InternalAlf.g:5367:1: rule__ConnectorDefinition__Group__4 : rule__ConnectorDefinition__Group__4__Impl ;
    public final void rule__ConnectorDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5371:1: ( rule__ConnectorDefinition__Group__4__Impl )
            // InternalAlf.g:5372:2: rule__ConnectorDefinition__Group__4__Impl
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
    // InternalAlf.g:5378:1: rule__ConnectorDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__ConnectorDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5382:1: ( ( ';' ) )
            // InternalAlf.g:5383:1: ( ';' )
            {
            // InternalAlf.g:5383:1: ( ';' )
            // InternalAlf.g:5384:2: ';'
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
    // InternalAlf.g:5394:1: rule__ConnectorDefinition__Group_0__0 : rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1 ;
    public final void rule__ConnectorDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5398:1: ( rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1 )
            // InternalAlf.g:5399:2: rule__ConnectorDefinition__Group_0__0__Impl rule__ConnectorDefinition__Group_0__1
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
    // InternalAlf.g:5406:1: rule__ConnectorDefinition__Group_0__0__Impl : ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? ) ;
    public final void rule__ConnectorDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5410:1: ( ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? ) )
            // InternalAlf.g:5411:1: ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? )
            {
            // InternalAlf.g:5411:1: ( ( rule__ConnectorDefinition__NameAssignment_0_0 )? )
            // InternalAlf.g:5412:2: ( rule__ConnectorDefinition__NameAssignment_0_0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getNameAssignment_0_0()); 
            // InternalAlf.g:5413:2: ( rule__ConnectorDefinition__NameAssignment_0_0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlf.g:5413:3: rule__ConnectorDefinition__NameAssignment_0_0
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
    // InternalAlf.g:5421:1: rule__ConnectorDefinition__Group_0__1 : rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2 ;
    public final void rule__ConnectorDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5425:1: ( rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2 )
            // InternalAlf.g:5426:2: rule__ConnectorDefinition__Group_0__1__Impl rule__ConnectorDefinition__Group_0__2
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
    // InternalAlf.g:5433:1: rule__ConnectorDefinition__Group_0__1__Impl : ( ( rule__ConnectorDefinition__Group_0_1__0 )? ) ;
    public final void rule__ConnectorDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5437:1: ( ( ( rule__ConnectorDefinition__Group_0_1__0 )? ) )
            // InternalAlf.g:5438:1: ( ( rule__ConnectorDefinition__Group_0_1__0 )? )
            {
            // InternalAlf.g:5438:1: ( ( rule__ConnectorDefinition__Group_0_1__0 )? )
            // InternalAlf.g:5439:2: ( rule__ConnectorDefinition__Group_0_1__0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup_0_1()); 
            // InternalAlf.g:5440:2: ( rule__ConnectorDefinition__Group_0_1__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==42) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:5440:3: rule__ConnectorDefinition__Group_0_1__0
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
    // InternalAlf.g:5448:1: rule__ConnectorDefinition__Group_0__2 : rule__ConnectorDefinition__Group_0__2__Impl ;
    public final void rule__ConnectorDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5452:1: ( rule__ConnectorDefinition__Group_0__2__Impl )
            // InternalAlf.g:5453:2: rule__ConnectorDefinition__Group_0__2__Impl
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
    // InternalAlf.g:5459:1: rule__ConnectorDefinition__Group_0__2__Impl : ( 'is' ) ;
    public final void rule__ConnectorDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5463:1: ( ( 'is' ) )
            // InternalAlf.g:5464:1: ( 'is' )
            {
            // InternalAlf.g:5464:1: ( 'is' )
            // InternalAlf.g:5465:2: 'is'
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
    // InternalAlf.g:5475:1: rule__ConnectorDefinition__Group_0_1__0 : rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1 ;
    public final void rule__ConnectorDefinition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5479:1: ( rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1 )
            // InternalAlf.g:5480:2: rule__ConnectorDefinition__Group_0_1__0__Impl rule__ConnectorDefinition__Group_0_1__1
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
    // InternalAlf.g:5487:1: rule__ConnectorDefinition__Group_0_1__0__Impl : ( ':' ) ;
    public final void rule__ConnectorDefinition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5491:1: ( ( ':' ) )
            // InternalAlf.g:5492:1: ( ':' )
            {
            // InternalAlf.g:5492:1: ( ':' )
            // InternalAlf.g:5493:2: ':'
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
    // InternalAlf.g:5502:1: rule__ConnectorDefinition__Group_0_1__1 : rule__ConnectorDefinition__Group_0_1__1__Impl ;
    public final void rule__ConnectorDefinition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5506:1: ( rule__ConnectorDefinition__Group_0_1__1__Impl )
            // InternalAlf.g:5507:2: rule__ConnectorDefinition__Group_0_1__1__Impl
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
    // InternalAlf.g:5513:1: rule__ConnectorDefinition__Group_0_1__1__Impl : ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) ) ;
    public final void rule__ConnectorDefinition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5517:1: ( ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) ) )
            // InternalAlf.g:5518:1: ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) )
            {
            // InternalAlf.g:5518:1: ( ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 ) )
            // InternalAlf.g:5519:2: ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getAssociationAssignment_0_1_1()); 
            // InternalAlf.g:5520:2: ( rule__ConnectorDefinition__AssociationAssignment_0_1_1 )
            // InternalAlf.g:5520:3: rule__ConnectorDefinition__AssociationAssignment_0_1_1
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
    // InternalAlf.g:5529:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5533:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalAlf.g:5534:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
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
    // InternalAlf.g:5541:1: rule__BinaryExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5545:1: ( ( ruleUnaryExpression ) )
            // InternalAlf.g:5546:1: ( ruleUnaryExpression )
            {
            // InternalAlf.g:5546:1: ( ruleUnaryExpression )
            // InternalAlf.g:5547:2: ruleUnaryExpression
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
    // InternalAlf.g:5556:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5560:1: ( rule__BinaryExpression__Group__1__Impl )
            // InternalAlf.g:5561:2: rule__BinaryExpression__Group__1__Impl
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
    // InternalAlf.g:5567:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__Group_1__0 )? ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5571:1: ( ( ( rule__BinaryExpression__Group_1__0 )? ) )
            // InternalAlf.g:5572:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            {
            // InternalAlf.g:5572:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            // InternalAlf.g:5573:2: ( rule__BinaryExpression__Group_1__0 )?
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup_1()); 
            // InternalAlf.g:5574:2: ( rule__BinaryExpression__Group_1__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=24 && LA71_0<=28)||LA71_0==57) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:5574:3: rule__BinaryExpression__Group_1__0
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
    // InternalAlf.g:5583:1: rule__BinaryExpression__Group_1__0 : rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 ;
    public final void rule__BinaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5587:1: ( rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 )
            // InternalAlf.g:5588:2: rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1
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
    // InternalAlf.g:5595:1: rule__BinaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5599:1: ( ( () ) )
            // InternalAlf.g:5600:1: ( () )
            {
            // InternalAlf.g:5600:1: ( () )
            // InternalAlf.g:5601:2: ()
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalAlf.g:5602:2: ()
            // InternalAlf.g:5602:3: 
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
    // InternalAlf.g:5610:1: rule__BinaryExpression__Group_1__1 : rule__BinaryExpression__Group_1__1__Impl ;
    public final void rule__BinaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5614:1: ( rule__BinaryExpression__Group_1__1__Impl )
            // InternalAlf.g:5615:2: rule__BinaryExpression__Group_1__1__Impl
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
    // InternalAlf.g:5621:1: rule__BinaryExpression__Group_1__1__Impl : ( ( rule__BinaryExpression__Alternatives_1_1 ) ) ;
    public final void rule__BinaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5625:1: ( ( ( rule__BinaryExpression__Alternatives_1_1 ) ) )
            // InternalAlf.g:5626:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            {
            // InternalAlf.g:5626:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            // InternalAlf.g:5627:2: ( rule__BinaryExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getAlternatives_1_1()); 
            // InternalAlf.g:5628:2: ( rule__BinaryExpression__Alternatives_1_1 )
            // InternalAlf.g:5628:3: rule__BinaryExpression__Alternatives_1_1
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
    // InternalAlf.g:5637:1: rule__BinaryExpression__Group_1_1_0__0 : rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 ;
    public final void rule__BinaryExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5641:1: ( rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 )
            // InternalAlf.g:5642:2: rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:5649:1: rule__BinaryExpression__Group_1_1_0__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5653:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) )
            // InternalAlf.g:5654:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            {
            // InternalAlf.g:5654:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            // InternalAlf.g:5655:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_0_0()); 
            // InternalAlf.g:5656:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            // InternalAlf.g:5656:3: rule__BinaryExpression__OperatorAssignment_1_1_0_0
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
    // InternalAlf.g:5664:1: rule__BinaryExpression__Group_1_1_0__1 : rule__BinaryExpression__Group_1_1_0__1__Impl ;
    public final void rule__BinaryExpression__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5668:1: ( rule__BinaryExpression__Group_1_1_0__1__Impl )
            // InternalAlf.g:5669:2: rule__BinaryExpression__Group_1_1_0__1__Impl
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
    // InternalAlf.g:5675:1: rule__BinaryExpression__Group_1_1_0__1__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5679:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) )
            // InternalAlf.g:5680:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            {
            // InternalAlf.g:5680:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            // InternalAlf.g:5681:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_0_1()); 
            // InternalAlf.g:5682:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            // InternalAlf.g:5682:3: rule__BinaryExpression__OperandAssignment_1_1_0_1
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
    // InternalAlf.g:5691:1: rule__BinaryExpression__Group_1_1_1__0 : rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 ;
    public final void rule__BinaryExpression__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5695:1: ( rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 )
            // InternalAlf.g:5696:2: rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1
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
    // InternalAlf.g:5703:1: rule__BinaryExpression__Group_1_1_1__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5707:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) )
            // InternalAlf.g:5708:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            {
            // InternalAlf.g:5708:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            // InternalAlf.g:5709:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_1_0()); 
            // InternalAlf.g:5710:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            // InternalAlf.g:5710:3: rule__BinaryExpression__OperatorAssignment_1_1_1_0
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
    // InternalAlf.g:5718:1: rule__BinaryExpression__Group_1_1_1__1 : rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 ;
    public final void rule__BinaryExpression__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5722:1: ( rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 )
            // InternalAlf.g:5723:2: rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:5730:1: rule__BinaryExpression__Group_1_1_1__1__Impl : ( '[' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5734:1: ( ( '[' ) )
            // InternalAlf.g:5735:1: ( '[' )
            {
            // InternalAlf.g:5735:1: ( '[' )
            // InternalAlf.g:5736:2: '['
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
    // InternalAlf.g:5745:1: rule__BinaryExpression__Group_1_1_1__2 : rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 ;
    public final void rule__BinaryExpression__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5749:1: ( rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 )
            // InternalAlf.g:5750:2: rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3
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
    // InternalAlf.g:5757:1: rule__BinaryExpression__Group_1_1_1__2__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5761:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) )
            // InternalAlf.g:5762:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            {
            // InternalAlf.g:5762:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            // InternalAlf.g:5763:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_1_2()); 
            // InternalAlf.g:5764:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            // InternalAlf.g:5764:3: rule__BinaryExpression__OperandAssignment_1_1_1_2
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
    // InternalAlf.g:5772:1: rule__BinaryExpression__Group_1_1_1__3 : rule__BinaryExpression__Group_1_1_1__3__Impl ;
    public final void rule__BinaryExpression__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5776:1: ( rule__BinaryExpression__Group_1_1_1__3__Impl )
            // InternalAlf.g:5777:2: rule__BinaryExpression__Group_1_1_1__3__Impl
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
    // InternalAlf.g:5783:1: rule__BinaryExpression__Group_1_1_1__3__Impl : ( ']' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5787:1: ( ( ']' ) )
            // InternalAlf.g:5788:1: ( ']' )
            {
            // InternalAlf.g:5788:1: ( ']' )
            // InternalAlf.g:5789:2: ']'
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
    // InternalAlf.g:5799:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5803:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // InternalAlf.g:5804:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:5811:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5815:1: ( ( () ) )
            // InternalAlf.g:5816:1: ( () )
            {
            // InternalAlf.g:5816:1: ( () )
            // InternalAlf.g:5817:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0()); 
            // InternalAlf.g:5818:2: ()
            // InternalAlf.g:5818:3: 
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
    // InternalAlf.g:5826:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5830:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // InternalAlf.g:5831:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
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
    // InternalAlf.g:5838:1: rule__UnaryExpression__Group_1__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5842:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) )
            // InternalAlf.g:5843:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAlf.g:5843:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            // InternalAlf.g:5844:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAlf.g:5845:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            // InternalAlf.g:5845:3: rule__UnaryExpression__OperatorAssignment_1_1
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
    // InternalAlf.g:5853:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5857:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // InternalAlf.g:5858:2: rule__UnaryExpression__Group_1__2__Impl
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
    // InternalAlf.g:5864:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5868:1: ( ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) )
            // InternalAlf.g:5869:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            {
            // InternalAlf.g:5869:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            // InternalAlf.g:5870:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2()); 
            // InternalAlf.g:5871:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            // InternalAlf.g:5871:3: rule__UnaryExpression__OperandAssignment_1_2
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


    // $ANTLR start "rule__AccessExpression__Group__0"
    // InternalAlf.g:5880:1: rule__AccessExpression__Group__0 : rule__AccessExpression__Group__0__Impl rule__AccessExpression__Group__1 ;
    public final void rule__AccessExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5884:1: ( rule__AccessExpression__Group__0__Impl rule__AccessExpression__Group__1 )
            // InternalAlf.g:5885:2: rule__AccessExpression__Group__0__Impl rule__AccessExpression__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__AccessExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group__0"


    // $ANTLR start "rule__AccessExpression__Group__0__Impl"
    // InternalAlf.g:5892:1: rule__AccessExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__AccessExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5896:1: ( ( rulePrimaryExpression ) )
            // InternalAlf.g:5897:1: ( rulePrimaryExpression )
            {
            // InternalAlf.g:5897:1: ( rulePrimaryExpression )
            // InternalAlf.g:5898:2: rulePrimaryExpression
            {
             before(grammarAccess.getAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group__0__Impl"


    // $ANTLR start "rule__AccessExpression__Group__1"
    // InternalAlf.g:5907:1: rule__AccessExpression__Group__1 : rule__AccessExpression__Group__1__Impl ;
    public final void rule__AccessExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5911:1: ( rule__AccessExpression__Group__1__Impl )
            // InternalAlf.g:5912:2: rule__AccessExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group__1"


    // $ANTLR start "rule__AccessExpression__Group__1__Impl"
    // InternalAlf.g:5918:1: rule__AccessExpression__Group__1__Impl : ( ( rule__AccessExpression__Group_1__0 )* ) ;
    public final void rule__AccessExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5922:1: ( ( ( rule__AccessExpression__Group_1__0 )* ) )
            // InternalAlf.g:5923:1: ( ( rule__AccessExpression__Group_1__0 )* )
            {
            // InternalAlf.g:5923:1: ( ( rule__AccessExpression__Group_1__0 )* )
            // InternalAlf.g:5924:2: ( rule__AccessExpression__Group_1__0 )*
            {
             before(grammarAccess.getAccessExpressionAccess().getGroup_1()); 
            // InternalAlf.g:5925:2: ( rule__AccessExpression__Group_1__0 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==43) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAlf.g:5925:3: rule__AccessExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__AccessExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

             after(grammarAccess.getAccessExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group__1__Impl"


    // $ANTLR start "rule__AccessExpression__Group_1__0"
    // InternalAlf.g:5934:1: rule__AccessExpression__Group_1__0 : rule__AccessExpression__Group_1__0__Impl rule__AccessExpression__Group_1__1 ;
    public final void rule__AccessExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5938:1: ( rule__AccessExpression__Group_1__0__Impl rule__AccessExpression__Group_1__1 )
            // InternalAlf.g:5939:2: rule__AccessExpression__Group_1__0__Impl rule__AccessExpression__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__AccessExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group_1__0"


    // $ANTLR start "rule__AccessExpression__Group_1__0__Impl"
    // InternalAlf.g:5946:1: rule__AccessExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AccessExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5950:1: ( ( () ) )
            // InternalAlf.g:5951:1: ( () )
            {
            // InternalAlf.g:5951:1: ( () )
            // InternalAlf.g:5952:2: ()
            {
             before(grammarAccess.getAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0()); 
            // InternalAlf.g:5953:2: ()
            // InternalAlf.g:5953:3: 
            {
            }

             after(grammarAccess.getAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AccessExpression__Group_1__1"
    // InternalAlf.g:5961:1: rule__AccessExpression__Group_1__1 : rule__AccessExpression__Group_1__1__Impl rule__AccessExpression__Group_1__2 ;
    public final void rule__AccessExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5965:1: ( rule__AccessExpression__Group_1__1__Impl rule__AccessExpression__Group_1__2 )
            // InternalAlf.g:5966:2: rule__AccessExpression__Group_1__1__Impl rule__AccessExpression__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__AccessExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group_1__1"


    // $ANTLR start "rule__AccessExpression__Group_1__1__Impl"
    // InternalAlf.g:5973:1: rule__AccessExpression__Group_1__1__Impl : ( '[' ) ;
    public final void rule__AccessExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5977:1: ( ( '[' ) )
            // InternalAlf.g:5978:1: ( '[' )
            {
            // InternalAlf.g:5978:1: ( '[' )
            // InternalAlf.g:5979:2: '['
            {
             before(grammarAccess.getAccessExpressionAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAccessExpressionAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AccessExpression__Group_1__2"
    // InternalAlf.g:5988:1: rule__AccessExpression__Group_1__2 : rule__AccessExpression__Group_1__2__Impl rule__AccessExpression__Group_1__3 ;
    public final void rule__AccessExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5992:1: ( rule__AccessExpression__Group_1__2__Impl rule__AccessExpression__Group_1__3 )
            // InternalAlf.g:5993:2: rule__AccessExpression__Group_1__2__Impl rule__AccessExpression__Group_1__3
            {
            pushFollow(FOLLOW_29);
            rule__AccessExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessExpression__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group_1__2"


    // $ANTLR start "rule__AccessExpression__Group_1__2__Impl"
    // InternalAlf.g:6000:1: rule__AccessExpression__Group_1__2__Impl : ( ( rule__AccessExpression__IndexAssignment_1_2 ) ) ;
    public final void rule__AccessExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6004:1: ( ( ( rule__AccessExpression__IndexAssignment_1_2 ) ) )
            // InternalAlf.g:6005:1: ( ( rule__AccessExpression__IndexAssignment_1_2 ) )
            {
            // InternalAlf.g:6005:1: ( ( rule__AccessExpression__IndexAssignment_1_2 ) )
            // InternalAlf.g:6006:2: ( rule__AccessExpression__IndexAssignment_1_2 )
            {
             before(grammarAccess.getAccessExpressionAccess().getIndexAssignment_1_2()); 
            // InternalAlf.g:6007:2: ( rule__AccessExpression__IndexAssignment_1_2 )
            // InternalAlf.g:6007:3: rule__AccessExpression__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessExpression__IndexAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessExpressionAccess().getIndexAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AccessExpression__Group_1__3"
    // InternalAlf.g:6015:1: rule__AccessExpression__Group_1__3 : rule__AccessExpression__Group_1__3__Impl ;
    public final void rule__AccessExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6019:1: ( rule__AccessExpression__Group_1__3__Impl )
            // InternalAlf.g:6020:2: rule__AccessExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessExpression__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group_1__3"


    // $ANTLR start "rule__AccessExpression__Group_1__3__Impl"
    // InternalAlf.g:6026:1: rule__AccessExpression__Group_1__3__Impl : ( ']' ) ;
    public final void rule__AccessExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6030:1: ( ( ']' ) )
            // InternalAlf.g:6031:1: ( ']' )
            {
            // InternalAlf.g:6031:1: ( ']' )
            // InternalAlf.g:6032:2: ']'
            {
             before(grammarAccess.getAccessExpressionAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAccessExpressionAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__Group_1__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0"
    // InternalAlf.g:6042:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6046:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalAlf.g:6047:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:6054:1: rule__PrimaryExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6058:1: ( ( '(' ) )
            // InternalAlf.g:6059:1: ( '(' )
            {
            // InternalAlf.g:6059:1: ( '(' )
            // InternalAlf.g:6060:2: '('
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
    // InternalAlf.g:6069:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6073:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalAlf.g:6074:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalAlf.g:6081:1: rule__PrimaryExpression__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6085:1: ( ( ruleExpression ) )
            // InternalAlf.g:6086:1: ( ruleExpression )
            {
            // InternalAlf.g:6086:1: ( ruleExpression )
            // InternalAlf.g:6087:2: ruleExpression
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
    // InternalAlf.g:6096:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6100:1: ( rule__PrimaryExpression__Group_4__2__Impl )
            // InternalAlf.g:6101:2: rule__PrimaryExpression__Group_4__2__Impl
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
    // InternalAlf.g:6107:1: rule__PrimaryExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6111:1: ( ( ')' ) )
            // InternalAlf.g:6112:1: ( ')' )
            {
            // InternalAlf.g:6112:1: ( ')' )
            // InternalAlf.g:6113:2: ')'
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
    // InternalAlf.g:6123:1: rule__InstanceCreationExpression__Group__0 : rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 ;
    public final void rule__InstanceCreationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6127:1: ( rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 )
            // InternalAlf.g:6128:2: rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:6135:1: rule__InstanceCreationExpression__Group__0__Impl : ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6139:1: ( ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) )
            // InternalAlf.g:6140:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            {
            // InternalAlf.g:6140:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            // InternalAlf.g:6141:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassAssignment_0()); 
            // InternalAlf.g:6142:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            // InternalAlf.g:6142:3: rule__InstanceCreationExpression__ClassAssignment_0
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
    // InternalAlf.g:6150:1: rule__InstanceCreationExpression__Group__1 : rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 ;
    public final void rule__InstanceCreationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6154:1: ( rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 )
            // InternalAlf.g:6155:2: rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalAlf.g:6162:1: rule__InstanceCreationExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__InstanceCreationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6166:1: ( ( '(' ) )
            // InternalAlf.g:6167:1: ( '(' )
            {
            // InternalAlf.g:6167:1: ( '(' )
            // InternalAlf.g:6168:2: '('
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
    // InternalAlf.g:6177:1: rule__InstanceCreationExpression__Group__2 : rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 ;
    public final void rule__InstanceCreationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6181:1: ( rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 )
            // InternalAlf.g:6182:2: rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAlf.g:6189:1: rule__InstanceCreationExpression__Group__2__Impl : ( ( rule__InstanceCreationExpression__Group_2__0 )? ) ;
    public final void rule__InstanceCreationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6193:1: ( ( ( rule__InstanceCreationExpression__Group_2__0 )? ) )
            // InternalAlf.g:6194:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            {
            // InternalAlf.g:6194:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            // InternalAlf.g:6195:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2()); 
            // InternalAlf.g:6196:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_STRING_VALUE)||(LA73_0>=24 && LA73_0<=26)||LA73_0==38||LA73_0==49||(LA73_0>=51 && LA73_0<=52)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAlf.g:6196:3: rule__InstanceCreationExpression__Group_2__0
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
    // InternalAlf.g:6204:1: rule__InstanceCreationExpression__Group__3 : rule__InstanceCreationExpression__Group__3__Impl ;
    public final void rule__InstanceCreationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6208:1: ( rule__InstanceCreationExpression__Group__3__Impl )
            // InternalAlf.g:6209:2: rule__InstanceCreationExpression__Group__3__Impl
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
    // InternalAlf.g:6215:1: rule__InstanceCreationExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__InstanceCreationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6219:1: ( ( ')' ) )
            // InternalAlf.g:6220:1: ( ')' )
            {
            // InternalAlf.g:6220:1: ( ')' )
            // InternalAlf.g:6221:2: ')'
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
    // InternalAlf.g:6231:1: rule__InstanceCreationExpression__Group_2__0 : rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 ;
    public final void rule__InstanceCreationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6235:1: ( rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 )
            // InternalAlf.g:6236:2: rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1
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
    // InternalAlf.g:6243:1: rule__InstanceCreationExpression__Group_2__0__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6247:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) )
            // InternalAlf.g:6248:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            {
            // InternalAlf.g:6248:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            // InternalAlf.g:6249:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_0()); 
            // InternalAlf.g:6250:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            // InternalAlf.g:6250:3: rule__InstanceCreationExpression__ArgumentAssignment_2_0
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
    // InternalAlf.g:6258:1: rule__InstanceCreationExpression__Group_2__1 : rule__InstanceCreationExpression__Group_2__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6262:1: ( rule__InstanceCreationExpression__Group_2__1__Impl )
            // InternalAlf.g:6263:2: rule__InstanceCreationExpression__Group_2__1__Impl
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
    // InternalAlf.g:6269:1: rule__InstanceCreationExpression__Group_2__1__Impl : ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) ;
    public final void rule__InstanceCreationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6273:1: ( ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:6274:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:6274:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            // InternalAlf.g:6275:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:6276:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==40) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAlf.g:6276:3: rule__InstanceCreationExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InstanceCreationExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // InternalAlf.g:6285:1: rule__InstanceCreationExpression__Group_2_1__0 : rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 ;
    public final void rule__InstanceCreationExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6289:1: ( rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 )
            // InternalAlf.g:6290:2: rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:6297:1: rule__InstanceCreationExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6301:1: ( ( ',' ) )
            // InternalAlf.g:6302:1: ( ',' )
            {
            // InternalAlf.g:6302:1: ( ',' )
            // InternalAlf.g:6303:2: ','
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
    // InternalAlf.g:6312:1: rule__InstanceCreationExpression__Group_2_1__1 : rule__InstanceCreationExpression__Group_2_1__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6316:1: ( rule__InstanceCreationExpression__Group_2_1__1__Impl )
            // InternalAlf.g:6317:2: rule__InstanceCreationExpression__Group_2_1__1__Impl
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
    // InternalAlf.g:6323:1: rule__InstanceCreationExpression__Group_2_1__1__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6327:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) )
            // InternalAlf.g:6328:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            {
            // InternalAlf.g:6328:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            // InternalAlf.g:6329:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_1_1()); 
            // InternalAlf.g:6330:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            // InternalAlf.g:6330:3: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1
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
    // InternalAlf.g:6339:1: rule__SequenceConstructionExpression__Group__0 : rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 ;
    public final void rule__SequenceConstructionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6343:1: ( rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 )
            // InternalAlf.g:6344:2: rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1
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
    // InternalAlf.g:6351:1: rule__SequenceConstructionExpression__Group__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6355:1: ( ( () ) )
            // InternalAlf.g:6356:1: ( () )
            {
            // InternalAlf.g:6356:1: ( () )
            // InternalAlf.g:6357:2: ()
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0()); 
            // InternalAlf.g:6358:2: ()
            // InternalAlf.g:6358:3: 
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
    // InternalAlf.g:6366:1: rule__SequenceConstructionExpression__Group__1 : rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 ;
    public final void rule__SequenceConstructionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6370:1: ( rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 )
            // InternalAlf.g:6371:2: rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalAlf.g:6378:1: rule__SequenceConstructionExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6382:1: ( ( '{' ) )
            // InternalAlf.g:6383:1: ( '{' )
            {
            // InternalAlf.g:6383:1: ( '{' )
            // InternalAlf.g:6384:2: '{'
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
    // InternalAlf.g:6393:1: rule__SequenceConstructionExpression__Group__2 : rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 ;
    public final void rule__SequenceConstructionExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6397:1: ( rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 )
            // InternalAlf.g:6398:2: rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalAlf.g:6405:1: rule__SequenceConstructionExpression__Group__2__Impl : ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) ;
    public final void rule__SequenceConstructionExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6409:1: ( ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) )
            // InternalAlf.g:6410:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            {
            // InternalAlf.g:6410:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            // InternalAlf.g:6411:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2()); 
            // InternalAlf.g:6412:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_STRING_VALUE)||(LA75_0>=24 && LA75_0<=26)||LA75_0==38||LA75_0==49||(LA75_0>=51 && LA75_0<=52)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAlf.g:6412:3: rule__SequenceConstructionExpression__Group_2__0
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
    // InternalAlf.g:6420:1: rule__SequenceConstructionExpression__Group__3 : rule__SequenceConstructionExpression__Group__3__Impl ;
    public final void rule__SequenceConstructionExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6424:1: ( rule__SequenceConstructionExpression__Group__3__Impl )
            // InternalAlf.g:6425:2: rule__SequenceConstructionExpression__Group__3__Impl
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
    // InternalAlf.g:6431:1: rule__SequenceConstructionExpression__Group__3__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6435:1: ( ( '}' ) )
            // InternalAlf.g:6436:1: ( '}' )
            {
            // InternalAlf.g:6436:1: ( '}' )
            // InternalAlf.g:6437:2: '}'
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
    // InternalAlf.g:6447:1: rule__SequenceConstructionExpression__Group_2__0 : rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 ;
    public final void rule__SequenceConstructionExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6451:1: ( rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 )
            // InternalAlf.g:6452:2: rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1
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
    // InternalAlf.g:6459:1: rule__SequenceConstructionExpression__Group_2__0__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6463:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) )
            // InternalAlf.g:6464:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            {
            // InternalAlf.g:6464:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            // InternalAlf.g:6465:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_0()); 
            // InternalAlf.g:6466:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            // InternalAlf.g:6466:3: rule__SequenceConstructionExpression__ElementAssignment_2_0
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
    // InternalAlf.g:6474:1: rule__SequenceConstructionExpression__Group_2__1 : rule__SequenceConstructionExpression__Group_2__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6478:1: ( rule__SequenceConstructionExpression__Group_2__1__Impl )
            // InternalAlf.g:6479:2: rule__SequenceConstructionExpression__Group_2__1__Impl
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
    // InternalAlf.g:6485:1: rule__SequenceConstructionExpression__Group_2__1__Impl : ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) ;
    public final void rule__SequenceConstructionExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6489:1: ( ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:6490:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:6490:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            // InternalAlf.g:6491:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:6492:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==40) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalAlf.g:6492:3: rule__SequenceConstructionExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SequenceConstructionExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // InternalAlf.g:6501:1: rule__SequenceConstructionExpression__Group_2_1__0 : rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6505:1: ( rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 )
            // InternalAlf.g:6506:2: rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:6513:1: rule__SequenceConstructionExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6517:1: ( ( ',' ) )
            // InternalAlf.g:6518:1: ( ',' )
            {
            // InternalAlf.g:6518:1: ( ',' )
            // InternalAlf.g:6519:2: ','
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
    // InternalAlf.g:6528:1: rule__SequenceConstructionExpression__Group_2_1__1 : rule__SequenceConstructionExpression__Group_2_1__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6532:1: ( rule__SequenceConstructionExpression__Group_2_1__1__Impl )
            // InternalAlf.g:6533:2: rule__SequenceConstructionExpression__Group_2_1__1__Impl
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
    // InternalAlf.g:6539:1: rule__SequenceConstructionExpression__Group_2_1__1__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6543:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) )
            // InternalAlf.g:6544:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            {
            // InternalAlf.g:6544:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            // InternalAlf.g:6545:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_1_1()); 
            // InternalAlf.g:6546:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            // InternalAlf.g:6546:3: rule__SequenceConstructionExpression__ElementAssignment_2_1_1
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
    // InternalAlf.g:6555:1: rule__NullLiteralExpression__Group__0 : rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 ;
    public final void rule__NullLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6559:1: ( rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 )
            // InternalAlf.g:6560:2: rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAlf.g:6567:1: rule__NullLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6571:1: ( ( () ) )
            // InternalAlf.g:6572:1: ( () )
            {
            // InternalAlf.g:6572:1: ( () )
            // InternalAlf.g:6573:2: ()
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0()); 
            // InternalAlf.g:6574:2: ()
            // InternalAlf.g:6574:3: 
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
    // InternalAlf.g:6582:1: rule__NullLiteralExpression__Group__1 : rule__NullLiteralExpression__Group__1__Impl ;
    public final void rule__NullLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6586:1: ( rule__NullLiteralExpression__Group__1__Impl )
            // InternalAlf.g:6587:2: rule__NullLiteralExpression__Group__1__Impl
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
    // InternalAlf.g:6593:1: rule__NullLiteralExpression__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6597:1: ( ( 'null' ) )
            // InternalAlf.g:6598:1: ( 'null' )
            {
            // InternalAlf.g:6598:1: ( 'null' )
            // InternalAlf.g:6599:2: 'null'
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
    // InternalAlf.g:6609:1: rule__RealValue__Group__0 : rule__RealValue__Group__0__Impl rule__RealValue__Group__1 ;
    public final void rule__RealValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6613:1: ( rule__RealValue__Group__0__Impl rule__RealValue__Group__1 )
            // InternalAlf.g:6614:2: rule__RealValue__Group__0__Impl rule__RealValue__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAlf.g:6621:1: rule__RealValue__Group__0__Impl : ( ( rule__RealValue__Alternatives_0 ) ) ;
    public final void rule__RealValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6625:1: ( ( ( rule__RealValue__Alternatives_0 ) ) )
            // InternalAlf.g:6626:1: ( ( rule__RealValue__Alternatives_0 ) )
            {
            // InternalAlf.g:6626:1: ( ( rule__RealValue__Alternatives_0 ) )
            // InternalAlf.g:6627:2: ( rule__RealValue__Alternatives_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_0()); 
            // InternalAlf.g:6628:2: ( rule__RealValue__Alternatives_0 )
            // InternalAlf.g:6628:3: rule__RealValue__Alternatives_0
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
    // InternalAlf.g:6636:1: rule__RealValue__Group__1 : rule__RealValue__Group__1__Impl ;
    public final void rule__RealValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6640:1: ( rule__RealValue__Group__1__Impl )
            // InternalAlf.g:6641:2: rule__RealValue__Group__1__Impl
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
    // InternalAlf.g:6647:1: rule__RealValue__Group__1__Impl : ( ( rule__RealValue__Group_1__0 )? ) ;
    public final void rule__RealValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6651:1: ( ( ( rule__RealValue__Group_1__0 )? ) )
            // InternalAlf.g:6652:1: ( ( rule__RealValue__Group_1__0 )? )
            {
            // InternalAlf.g:6652:1: ( ( rule__RealValue__Group_1__0 )? )
            // InternalAlf.g:6653:2: ( rule__RealValue__Group_1__0 )?
            {
             before(grammarAccess.getRealValueAccess().getGroup_1()); 
            // InternalAlf.g:6654:2: ( rule__RealValue__Group_1__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=29 && LA77_0<=30)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:6654:3: rule__RealValue__Group_1__0
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
    // InternalAlf.g:6663:1: rule__RealValue__Group_0_0__0 : rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 ;
    public final void rule__RealValue__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6667:1: ( rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 )
            // InternalAlf.g:6668:2: rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAlf.g:6675:1: rule__RealValue__Group_0_0__0__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6679:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:6680:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:6680:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:6681:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:6690:1: rule__RealValue__Group_0_0__1 : rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 ;
    public final void rule__RealValue__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6694:1: ( rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 )
            // InternalAlf.g:6695:2: rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalAlf.g:6702:1: rule__RealValue__Group_0_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6706:1: ( ( '.' ) )
            // InternalAlf.g:6707:1: ( '.' )
            {
            // InternalAlf.g:6707:1: ( '.' )
            // InternalAlf.g:6708:2: '.'
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
    // InternalAlf.g:6717:1: rule__RealValue__Group_0_0__2 : rule__RealValue__Group_0_0__2__Impl ;
    public final void rule__RealValue__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6721:1: ( rule__RealValue__Group_0_0__2__Impl )
            // InternalAlf.g:6722:2: rule__RealValue__Group_0_0__2__Impl
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
    // InternalAlf.g:6728:1: rule__RealValue__Group_0_0__2__Impl : ( ( RULE_NATURAL_VALUE )? ) ;
    public final void rule__RealValue__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6732:1: ( ( ( RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:6733:1: ( ( RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:6733:1: ( ( RULE_NATURAL_VALUE )? )
            // InternalAlf.g:6734:2: ( RULE_NATURAL_VALUE )?
            {
             before(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2()); 
            // InternalAlf.g:6735:2: ( RULE_NATURAL_VALUE )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_NATURAL_VALUE) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlf.g:6735:3: RULE_NATURAL_VALUE
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
    // InternalAlf.g:6744:1: rule__RealValue__Group_0_1__0 : rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 ;
    public final void rule__RealValue__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6748:1: ( rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 )
            // InternalAlf.g:6749:2: rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalAlf.g:6756:1: rule__RealValue__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6760:1: ( ( '.' ) )
            // InternalAlf.g:6761:1: ( '.' )
            {
            // InternalAlf.g:6761:1: ( '.' )
            // InternalAlf.g:6762:2: '.'
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
    // InternalAlf.g:6771:1: rule__RealValue__Group_0_1__1 : rule__RealValue__Group_0_1__1__Impl ;
    public final void rule__RealValue__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6775:1: ( rule__RealValue__Group_0_1__1__Impl )
            // InternalAlf.g:6776:2: rule__RealValue__Group_0_1__1__Impl
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
    // InternalAlf.g:6782:1: rule__RealValue__Group_0_1__1__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6786:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:6787:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:6787:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:6788:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:6798:1: rule__RealValue__Group_1__0 : rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 ;
    public final void rule__RealValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6802:1: ( rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 )
            // InternalAlf.g:6803:2: rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalAlf.g:6810:1: rule__RealValue__Group_1__0__Impl : ( ( rule__RealValue__Alternatives_1_0 ) ) ;
    public final void rule__RealValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6814:1: ( ( ( rule__RealValue__Alternatives_1_0 ) ) )
            // InternalAlf.g:6815:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            {
            // InternalAlf.g:6815:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            // InternalAlf.g:6816:2: ( rule__RealValue__Alternatives_1_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_0()); 
            // InternalAlf.g:6817:2: ( rule__RealValue__Alternatives_1_0 )
            // InternalAlf.g:6817:3: rule__RealValue__Alternatives_1_0
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
    // InternalAlf.g:6825:1: rule__RealValue__Group_1__1 : rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 ;
    public final void rule__RealValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6829:1: ( rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 )
            // InternalAlf.g:6830:2: rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalAlf.g:6837:1: rule__RealValue__Group_1__1__Impl : ( ( rule__RealValue__Alternatives_1_1 )? ) ;
    public final void rule__RealValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6841:1: ( ( ( rule__RealValue__Alternatives_1_1 )? ) )
            // InternalAlf.g:6842:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            {
            // InternalAlf.g:6842:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            // InternalAlf.g:6843:2: ( rule__RealValue__Alternatives_1_1 )?
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_1()); 
            // InternalAlf.g:6844:2: ( rule__RealValue__Alternatives_1_1 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=24 && LA79_0<=25)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalAlf.g:6844:3: rule__RealValue__Alternatives_1_1
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
    // InternalAlf.g:6852:1: rule__RealValue__Group_1__2 : rule__RealValue__Group_1__2__Impl ;
    public final void rule__RealValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6856:1: ( rule__RealValue__Group_1__2__Impl )
            // InternalAlf.g:6857:2: rule__RealValue__Group_1__2__Impl
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
    // InternalAlf.g:6863:1: rule__RealValue__Group_1__2__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6867:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:6868:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:6868:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:6869:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:6879:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0 : rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6883:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 )
            // InternalAlf.g:6884:2: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1
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
    // InternalAlf.g:6891:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6895:1: ( ( () ) )
            // InternalAlf.g:6896:1: ( () )
            {
            // InternalAlf.g:6896:1: ( () )
            // InternalAlf.g:6897:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0()); 
            // InternalAlf.g:6898:2: ()
            // InternalAlf.g:6898:3: 
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
    // InternalAlf.g:6906:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1 : rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6910:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl )
            // InternalAlf.g:6911:2: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl
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
    // InternalAlf.g:6917:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl : ( '*' ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6921:1: ( ( '*' ) )
            // InternalAlf.g:6922:1: ( '*' )
            {
            // InternalAlf.g:6922:1: ( '*' )
            // InternalAlf.g:6923:2: '*'
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
    // InternalAlf.g:6933:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6937:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:6938:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAlf.g:6945:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6949:1: ( ( ruleName ) )
            // InternalAlf.g:6950:1: ( ruleName )
            {
            // InternalAlf.g:6950:1: ( ruleName )
            // InternalAlf.g:6951:2: ruleName
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
    // InternalAlf.g:6960:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6964:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:6965:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:6971:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6975:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:6976:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:6976:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:6977:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:6978:2: ( rule__QualifiedName__Group_1__0 )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==52) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalAlf.g:6978:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop80;
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
    // InternalAlf.g:6987:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6991:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:6992:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAlf.g:6999:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7003:1: ( ( '.' ) )
            // InternalAlf.g:7004:1: ( '.' )
            {
            // InternalAlf.g:7004:1: ( '.' )
            // InternalAlf.g:7005:2: '.'
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
    // InternalAlf.g:7014:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7018:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:7019:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAlf.g:7025:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7029:1: ( ( ruleName ) )
            // InternalAlf.g:7030:1: ( ruleName )
            {
            // InternalAlf.g:7030:1: ( ruleName )
            // InternalAlf.g:7031:2: ruleName
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
    // InternalAlf.g:7041:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7045:1: ( ( ruleName ) )
            // InternalAlf.g:7046:2: ( ruleName )
            {
            // InternalAlf.g:7046:2: ( ruleName )
            // InternalAlf.g:7047:3: ruleName
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
    // InternalAlf.g:7056:1: rule__PackageDefinition__OwnedMembershipAssignment_3 : ( rulePackageMember ) ;
    public final void rule__PackageDefinition__OwnedMembershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7060:1: ( ( rulePackageMember ) )
            // InternalAlf.g:7061:2: ( rulePackageMember )
            {
            // InternalAlf.g:7061:2: ( rulePackageMember )
            // InternalAlf.g:7062:3: rulePackageMember
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
    // InternalAlf.g:7071:1: rule__NonFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__NonFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7075:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:7076:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:7076:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:7077:3: ruleVisibilityIndicator
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
    // InternalAlf.g:7086:1: rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 : ( ruleNonFeatureDefinition ) ;
    public final void rule__NonFeatureMember__OwnedMemberElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7090:1: ( ( ruleNonFeatureDefinition ) )
            // InternalAlf.g:7091:2: ( ruleNonFeatureDefinition )
            {
            // InternalAlf.g:7091:2: ( ruleNonFeatureDefinition )
            // InternalAlf.g:7092:3: ruleNonFeatureDefinition
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
    // InternalAlf.g:7101:1: rule__NonFeatureMember__MemberNameAssignment_1_1_1 : ( ruleName ) ;
    public final void rule__NonFeatureMember__MemberNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7105:1: ( ( ruleName ) )
            // InternalAlf.g:7106:2: ( ruleName )
            {
            // InternalAlf.g:7106:2: ( ruleName )
            // InternalAlf.g:7107:3: ruleName
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
    // InternalAlf.g:7116:1: rule__NonFeatureMember__MemberElementAssignment_1_1_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFeatureMember__MemberElementAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7120:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7121:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7121:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7122:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementCrossReference_1_1_3_0()); 
            // InternalAlf.g:7123:3: ( ruleQualifiedName )
            // InternalAlf.g:7124:4: ruleQualifiedName
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
    // InternalAlf.g:7135:1: rule__PackagedFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__PackagedFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7139:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:7140:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:7140:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:7141:3: ruleVisibilityIndicator
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
    // InternalAlf.g:7150:1: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 : ( ruleTypedFeatureDefinition ) ;
    public final void rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7154:1: ( ( ruleTypedFeatureDefinition ) )
            // InternalAlf.g:7155:2: ( ruleTypedFeatureDefinition )
            {
            // InternalAlf.g:7155:2: ( ruleTypedFeatureDefinition )
            // InternalAlf.g:7156:3: ruleTypedFeatureDefinition
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
    // InternalAlf.g:7165:1: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1 : ( ruleUntypedFeatureDefinition ) ;
    public final void rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7169:1: ( ( ruleUntypedFeatureDefinition ) )
            // InternalAlf.g:7170:2: ( ruleUntypedFeatureDefinition )
            {
            // InternalAlf.g:7170:2: ( ruleUntypedFeatureDefinition )
            // InternalAlf.g:7171:3: ruleUntypedFeatureDefinition
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
    // InternalAlf.g:7180:1: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1 : ( ruleName ) ;
    public final void rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7184:1: ( ( ruleName ) )
            // InternalAlf.g:7185:2: ( ruleName )
            {
            // InternalAlf.g:7185:2: ( ruleName )
            // InternalAlf.g:7186:3: ruleName
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
    // InternalAlf.g:7195:1: rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1 : ( ruleName ) ;
    public final void rule__PackagedFeatureMember__MemberNameAssignment_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7199:1: ( ( ruleName ) )
            // InternalAlf.g:7200:2: ( ruleName )
            {
            // InternalAlf.g:7200:2: ( ruleName )
            // InternalAlf.g:7201:3: ruleName
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
    // InternalAlf.g:7210:1: rule__PackagedFeatureMember__MemberElementAssignment_1_2_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PackagedFeatureMember__MemberElementAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7214:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7215:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7215:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7216:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_2_2_0()); 
            // InternalAlf.g:7217:3: ( ruleQualifiedName )
            // InternalAlf.g:7218:4: ruleQualifiedName
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
    // InternalAlf.g:7229:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7233:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:7234:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:7234:2: ( ( 'abstract' ) )
            // InternalAlf.g:7235:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:7236:3: ( 'abstract' )
            // InternalAlf.g:7237:4: 'abstract'
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
    // InternalAlf.g:7248:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7252:1: ( ( ruleName ) )
            // InternalAlf.g:7253:2: ( ruleName )
            {
            // InternalAlf.g:7253:2: ( ruleName )
            // InternalAlf.g:7254:3: ruleName
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
    // InternalAlf.g:7263:1: rule__ClassDeclaration__OwnedMembershipAssignment_3_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedMembershipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7267:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:7268:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:7268:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:7269:3: ruleOwnedGeneralization
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
    // InternalAlf.g:7278:1: rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7282:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:7283:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:7283:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:7284:3: ruleOwnedGeneralization
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
    // InternalAlf.g:7293:1: rule__OwnedGeneralization__OwnedMemberElementAssignment : ( ruleGeneralization ) ;
    public final void rule__OwnedGeneralization__OwnedMemberElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7297:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:7298:2: ( ruleGeneralization )
            {
            // InternalAlf.g:7298:2: ( ruleGeneralization )
            // InternalAlf.g:7299:3: ruleGeneralization
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
    // InternalAlf.g:7308:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7312:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7313:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7313:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7314:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:7315:3: ( ruleQualifiedName )
            // InternalAlf.g:7316:4: ruleQualifiedName
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
    // InternalAlf.g:7327:1: rule__ClassDefinition__OwnedMembershipAssignment_2 : ( ruleClassMember ) ;
    public final void rule__ClassDefinition__OwnedMembershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7331:1: ( ( ruleClassMember ) )
            // InternalAlf.g:7332:2: ( ruleClassMember )
            {
            // InternalAlf.g:7332:2: ( ruleClassMember )
            // InternalAlf.g:7333:3: ruleClassMember
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
    // InternalAlf.g:7342:1: rule__ClassFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__ClassFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7346:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:7347:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:7347:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:7348:3: ruleVisibilityIndicator
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
    // InternalAlf.g:7357:1: rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1 : ( ( 'part' ) ) ;
    public final void rule__ClassFeatureMember__IsCompositeAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7361:1: ( ( ( 'part' ) ) )
            // InternalAlf.g:7362:2: ( ( 'part' ) )
            {
            // InternalAlf.g:7362:2: ( ( 'part' ) )
            // InternalAlf.g:7363:3: ( 'part' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0()); 
            // InternalAlf.g:7364:3: ( 'part' )
            // InternalAlf.g:7365:4: 'part'
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
    // InternalAlf.g:7376:1: rule__ClassFeatureMember__IsPortAssignment_1_0_0_2 : ( ( 'port' ) ) ;
    public final void rule__ClassFeatureMember__IsPortAssignment_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7380:1: ( ( ( 'port' ) ) )
            // InternalAlf.g:7381:2: ( ( 'port' ) )
            {
            // InternalAlf.g:7381:2: ( ( 'port' ) )
            // InternalAlf.g:7382:3: ( 'port' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0()); 
            // InternalAlf.g:7383:3: ( 'port' )
            // InternalAlf.g:7384:4: 'port'
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
    // InternalAlf.g:7395:1: rule__ClassFeatureMember__DirectionAssignment_1_0_1 : ( ruleFeatureDirection ) ;
    public final void rule__ClassFeatureMember__DirectionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7399:1: ( ( ruleFeatureDirection ) )
            // InternalAlf.g:7400:2: ( ruleFeatureDirection )
            {
            // InternalAlf.g:7400:2: ( ruleFeatureDirection )
            // InternalAlf.g:7401:3: ruleFeatureDirection
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
    // InternalAlf.g:7410:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2 : ( ruleTypedFeatureDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7414:1: ( ( ruleTypedFeatureDefinition ) )
            // InternalAlf.g:7415:2: ( ruleTypedFeatureDefinition )
            {
            // InternalAlf.g:7415:2: ( ruleTypedFeatureDefinition )
            // InternalAlf.g:7416:3: ruleTypedFeatureDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementTypedFeatureDefinitionParserRuleCall_1_0_2_0()); 

            }


            }

        }
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
    // InternalAlf.g:7425:1: rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1 : ( ( 'part' ) ) ;
    public final void rule__ClassFeatureMember__IsCompositeAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7429:1: ( ( ( 'part' ) ) )
            // InternalAlf.g:7430:2: ( ( 'part' ) )
            {
            // InternalAlf.g:7430:2: ( ( 'part' ) )
            // InternalAlf.g:7431:3: ( 'part' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_1_0_1_0()); 
            // InternalAlf.g:7432:3: ( 'part' )
            // InternalAlf.g:7433:4: 'part'
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
    // InternalAlf.g:7444:1: rule__ClassFeatureMember__IsPortAssignment_1_1_0_2 : ( ( 'port' ) ) ;
    public final void rule__ClassFeatureMember__IsPortAssignment_1_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7448:1: ( ( ( 'port' ) ) )
            // InternalAlf.g:7449:2: ( ( 'port' ) )
            {
            // InternalAlf.g:7449:2: ( ( 'port' ) )
            // InternalAlf.g:7450:3: ( 'port' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_2_0()); 
            // InternalAlf.g:7451:3: ( 'port' )
            // InternalAlf.g:7452:4: 'port'
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
    // InternalAlf.g:7463:1: rule__ClassFeatureMember__DirectionAssignment_1_1_1 : ( ruleFeatureDirection ) ;
    public final void rule__ClassFeatureMember__DirectionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7467:1: ( ( ruleFeatureDirection ) )
            // InternalAlf.g:7468:2: ( ruleFeatureDirection )
            {
            // InternalAlf.g:7468:2: ( ruleFeatureDirection )
            // InternalAlf.g:7469:3: ruleFeatureDirection
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
    // InternalAlf.g:7478:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2 : ( ruleUntypedFeatureDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7482:1: ( ( ruleUntypedFeatureDefinition ) )
            // InternalAlf.g:7483:2: ( ruleUntypedFeatureDefinition )
            {
            // InternalAlf.g:7483:2: ( ruleUntypedFeatureDefinition )
            // InternalAlf.g:7484:3: ruleUntypedFeatureDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUntypedFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUntypedFeatureDefinitionParserRuleCall_1_1_2_0()); 

            }


            }

        }
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
    // InternalAlf.g:7493:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1 : ( ruleConnectorDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7497:1: ( ( ruleConnectorDefinition ) )
            // InternalAlf.g:7498:2: ( ruleConnectorDefinition )
            {
            // InternalAlf.g:7498:2: ( ruleConnectorDefinition )
            // InternalAlf.g:7499:3: ruleConnectorDefinition
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
    // InternalAlf.g:7508:1: rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1 : ( ( 'part' ) ) ;
    public final void rule__ClassFeatureMember__IsCompositeAssignment_1_3_0_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7512:1: ( ( ( 'part' ) ) )
            // InternalAlf.g:7513:2: ( ( 'part' ) )
            {
            // InternalAlf.g:7513:2: ( ( 'part' ) )
            // InternalAlf.g:7514:3: ( 'part' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_3_0_0_0_1_0()); 
            // InternalAlf.g:7515:3: ( 'part' )
            // InternalAlf.g:7516:4: 'part'
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
    // InternalAlf.g:7527:1: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1 : ( ruleName ) ;
    public final void rule__ClassFeatureMember__MemberNameAssignment_1_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7531:1: ( ( ruleName ) )
            // InternalAlf.g:7532:2: ( ruleName )
            {
            // InternalAlf.g:7532:2: ( ruleName )
            // InternalAlf.g:7533:3: ruleName
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
    // InternalAlf.g:7542:1: rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1 : ( ruleName ) ;
    public final void rule__ClassFeatureMember__MemberNameAssignment_1_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7546:1: ( ( ruleName ) )
            // InternalAlf.g:7547:2: ( ruleName )
            {
            // InternalAlf.g:7547:2: ( ruleName )
            // InternalAlf.g:7548:3: ruleName
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
    // InternalAlf.g:7557:1: rule__ClassFeatureMember__MemberElementAssignment_1_3_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassFeatureMember__MemberElementAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7561:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7562:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7562:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7563:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementCrossReference_1_3_2_0()); 
            // InternalAlf.g:7564:3: ( ruleQualifiedName )
            // InternalAlf.g:7565:4: ruleQualifiedName
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
    // InternalAlf.g:7576:1: rule__AssociationDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__AssociationDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7580:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:7581:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:7581:2: ( ( 'abstract' ) )
            // InternalAlf.g:7582:3: ( 'abstract' )
            {
             before(grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:7583:3: ( 'abstract' )
            // InternalAlf.g:7584:4: 'abstract'
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
    // InternalAlf.g:7595:1: rule__AssociationDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__AssociationDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7599:1: ( ( ruleName ) )
            // InternalAlf.g:7600:2: ( ruleName )
            {
            // InternalAlf.g:7600:2: ( ruleName )
            // InternalAlf.g:7601:3: ruleName
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
    // InternalAlf.g:7610:1: rule__AssociationDeclaration__OwnedMembershipAssignment_3_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__AssociationDeclaration__OwnedMembershipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7614:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:7615:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:7615:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:7616:3: ruleOwnedGeneralization
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
    // InternalAlf.g:7625:1: rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__AssociationDeclaration__OwnedMembershipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7629:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:7630:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:7630:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:7631:3: ruleOwnedGeneralization
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
    // InternalAlf.g:7640:1: rule__AssociationDefinition__OwnedMembershipAssignment_2 : ( rulePackagedFeatureMember ) ;
    public final void rule__AssociationDefinition__OwnedMembershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7644:1: ( ( rulePackagedFeatureMember ) )
            // InternalAlf.g:7645:2: ( rulePackagedFeatureMember )
            {
            // InternalAlf.g:7645:2: ( rulePackagedFeatureMember )
            // InternalAlf.g:7646:3: rulePackagedFeatureMember
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
    // InternalAlf.g:7655:1: rule__AssociationDefinition__OwnedMembershipAssignment_3 : ( rulePackagedFeatureMember ) ;
    public final void rule__AssociationDefinition__OwnedMembershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7659:1: ( ( rulePackagedFeatureMember ) )
            // InternalAlf.g:7660:2: ( rulePackagedFeatureMember )
            {
            // InternalAlf.g:7660:2: ( rulePackagedFeatureMember )
            // InternalAlf.g:7661:3: rulePackagedFeatureMember
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
    // InternalAlf.g:7670:1: rule__TypedFeatureDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__TypedFeatureDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7674:1: ( ( ruleName ) )
            // InternalAlf.g:7675:2: ( ruleName )
            {
            // InternalAlf.g:7675:2: ( ruleName )
            // InternalAlf.g:7676:3: ruleName
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
    // InternalAlf.g:7685:1: rule__TypedFeatureDefinition__IsCompositeAssignment_1_1 : ( ( 'composes' ) ) ;
    public final void rule__TypedFeatureDefinition__IsCompositeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7689:1: ( ( ( 'composes' ) ) )
            // InternalAlf.g:7690:2: ( ( 'composes' ) )
            {
            // InternalAlf.g:7690:2: ( ( 'composes' ) )
            // InternalAlf.g:7691:3: ( 'composes' )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_1_0()); 
            // InternalAlf.g:7692:3: ( 'composes' )
            // InternalAlf.g:7693:4: 'composes'
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_1_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAlf.g:7704:1: rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypedFeatureDefinition__ReferencedTypeAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7708:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7709:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7709:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7710:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_2_0_0()); 
            // InternalAlf.g:7711:3: ( ruleQualifiedName )
            // InternalAlf.g:7712:4: ruleQualifiedName
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
    // InternalAlf.g:7723:1: rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__TypedFeatureDefinition__OwnedMembershipAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7727:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:7728:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:7728:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:7729:3: ruleOwnedRedefinitionOrSubset
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
    // InternalAlf.g:7738:1: rule__TypedFeatureDefinition__LowerAssignment_2_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__TypedFeatureDefinition__LowerAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7742:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:7743:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:7743:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:7744:3: ruleNaturalLiteralExpression
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
    // InternalAlf.g:7753:1: rule__TypedFeatureDefinition__UpperAssignment_2_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__TypedFeatureDefinition__UpperAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7757:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:7758:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:7758:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:7759:3: ruleUnlimitedNaturalLiteralExpression
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


    // $ANTLR start "rule__TypedFeatureDefinition__ValueAssignment_3_1"
    // InternalAlf.g:7768:1: rule__TypedFeatureDefinition__ValueAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__TypedFeatureDefinition__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7772:1: ( ( ruleExpression ) )
            // InternalAlf.g:7773:2: ( ruleExpression )
            {
            // InternalAlf.g:7773:2: ( ruleExpression )
            // InternalAlf.g:7774:3: ruleExpression
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getValueExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__ValueAssignment_3_1"


    // $ANTLR start "rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1"
    // InternalAlf.g:7783:1: rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1 : ( ruleClassMember ) ;
    public final void rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7787:1: ( ( ruleClassMember ) )
            // InternalAlf.g:7788:2: ( ruleClassMember )
            {
            // InternalAlf.g:7788:2: ( ruleClassMember )
            // InternalAlf.g:7789:3: ruleClassMember
            {
             before(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getTypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedFeatureDefinition__OwnedMembershipAssignment_4_1_1"


    // $ANTLR start "rule__UntypedFeatureDefinition__NameAssignment_0"
    // InternalAlf.g:7798:1: rule__UntypedFeatureDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__UntypedFeatureDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7802:1: ( ( ruleName ) )
            // InternalAlf.g:7803:2: ( ruleName )
            {
            // InternalAlf.g:7803:2: ( ruleName )
            // InternalAlf.g:7804:3: ruleName
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
    // InternalAlf.g:7813:1: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__UntypedFeatureDefinition__OwnedMembershipAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7817:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:7818:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:7818:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:7819:3: ruleOwnedRedefinitionOrSubset
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
    // InternalAlf.g:7828:1: rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__UntypedFeatureDefinition__LowerAssignment_2_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7832:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:7833:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:7833:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:7834:3: ruleNaturalLiteralExpression
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
    // InternalAlf.g:7843:1: rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__UntypedFeatureDefinition__UpperAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7847:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:7848:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:7848:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:7849:3: ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:7858:1: rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1 : ( ruleExpression ) ;
    public final void rule__UntypedFeatureDefinition__ValueAssignment_2_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7862:1: ( ( ruleExpression ) )
            // InternalAlf.g:7863:2: ( ruleExpression )
            {
            // InternalAlf.g:7863:2: ( ruleExpression )
            // InternalAlf.g:7864:3: ruleExpression
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


    // $ANTLR start "rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1"
    // InternalAlf.g:7873:1: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1 : ( ruleClassMember ) ;
    public final void rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7877:1: ( ( ruleClassMember ) )
            // InternalAlf.g:7878:2: ( ruleClassMember )
            {
            // InternalAlf.g:7878:2: ( ruleClassMember )
            // InternalAlf.g:7879:3: ruleClassMember
            {
             before(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0_1_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getUntypedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0_1_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_0_2_1_1"


    // $ANTLR start "rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1"
    // InternalAlf.g:7888:1: rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1 : ( ruleClassMember ) ;
    public final void rule__UntypedFeatureDefinition__OwnedMembershipAssignment_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7892:1: ( ( ruleClassMember ) )
            // InternalAlf.g:7893:2: ( ruleClassMember )
            {
            // InternalAlf.g:7893:2: ( ruleClassMember )
            // InternalAlf.g:7894:3: ruleClassMember
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
    // InternalAlf.g:7903:1: rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__UntypedFeatureDefinition__LowerAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7907:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:7908:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:7908:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:7909:3: ruleNaturalLiteralExpression
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
    // InternalAlf.g:7918:1: rule__UntypedFeatureDefinition__UpperAssignment_2_1_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__UntypedFeatureDefinition__UpperAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7922:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:7923:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:7923:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:7924:3: ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:7933:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 : ( ruleRedefinition ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7937:1: ( ( ruleRedefinition ) )
            // InternalAlf.g:7938:2: ( ruleRedefinition )
            {
            // InternalAlf.g:7938:2: ( ruleRedefinition )
            // InternalAlf.g:7939:3: ruleRedefinition
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
    // InternalAlf.g:7948:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 : ( ruleSubset ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7952:1: ( ( ruleSubset ) )
            // InternalAlf.g:7953:2: ( ruleSubset )
            {
            // InternalAlf.g:7953:2: ( ruleSubset )
            // InternalAlf.g:7954:3: ruleSubset
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
    // InternalAlf.g:7963:1: rule__Redefinition__RedefinedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Redefinition__RedefinedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7967:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7968:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7968:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7969:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:7970:3: ( ruleQualifiedName )
            // InternalAlf.g:7971:4: ruleQualifiedName
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
    // InternalAlf.g:7982:1: rule__Subset__SubsettedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Subset__SubsettedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7986:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7987:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7987:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7988:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:7989:3: ( ruleQualifiedName )
            // InternalAlf.g:7990:4: ruleQualifiedName
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
    // InternalAlf.g:8001:1: rule__ConnectorDefinition__NameAssignment_0_0 : ( ruleName ) ;
    public final void rule__ConnectorDefinition__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8005:1: ( ( ruleName ) )
            // InternalAlf.g:8006:2: ( ruleName )
            {
            // InternalAlf.g:8006:2: ( ruleName )
            // InternalAlf.g:8007:3: ruleName
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
    // InternalAlf.g:8016:1: rule__ConnectorDefinition__AssociationAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__AssociationAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8020:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8021:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8021:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8022:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0()); 
            // InternalAlf.g:8023:3: ( ruleQualifiedName )
            // InternalAlf.g:8024:4: ruleQualifiedName
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
    // InternalAlf.g:8035:1: rule__ConnectorDefinition__SourceFeatureAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__SourceFeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8039:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8040:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8040:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8041:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0()); 
            // InternalAlf.g:8042:3: ( ruleQualifiedName )
            // InternalAlf.g:8043:4: ruleQualifiedName
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
    // InternalAlf.g:8054:1: rule__ConnectorDefinition__TargetFeatureAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__TargetFeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8058:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8059:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8059:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8060:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0()); 
            // InternalAlf.g:8061:3: ( ruleQualifiedName )
            // InternalAlf.g:8062:4: ruleQualifiedName
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
    // InternalAlf.g:8073:1: rule__BinaryExpression__OperatorAssignment_1_1_0_0 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8077:1: ( ( ruleBinaryOperator ) )
            // InternalAlf.g:8078:2: ( ruleBinaryOperator )
            {
            // InternalAlf.g:8078:2: ( ruleBinaryOperator )
            // InternalAlf.g:8079:3: ruleBinaryOperator
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
    // InternalAlf.g:8088:1: rule__BinaryExpression__OperandAssignment_1_1_0_1 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8092:1: ( ( ruleExpression ) )
            // InternalAlf.g:8093:2: ( ruleExpression )
            {
            // InternalAlf.g:8093:2: ( ruleExpression )
            // InternalAlf.g:8094:3: ruleExpression
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
    // InternalAlf.g:8103:1: rule__BinaryExpression__OperatorAssignment_1_1_1_0 : ( ( '@' ) ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8107:1: ( ( ( '@' ) ) )
            // InternalAlf.g:8108:2: ( ( '@' ) )
            {
            // InternalAlf.g:8108:2: ( ( '@' ) )
            // InternalAlf.g:8109:3: ( '@' )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 
            // InternalAlf.g:8110:3: ( '@' )
            // InternalAlf.g:8111:4: '@'
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
    // InternalAlf.g:8122:1: rule__BinaryExpression__OperandAssignment_1_1_1_2 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8126:1: ( ( ruleExpression ) )
            // InternalAlf.g:8127:2: ( ruleExpression )
            {
            // InternalAlf.g:8127:2: ( ruleExpression )
            // InternalAlf.g:8128:3: ruleExpression
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
    // InternalAlf.g:8137:1: rule__UnaryExpression__OperatorAssignment_1_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8141:1: ( ( ruleUnaryOperator ) )
            // InternalAlf.g:8142:2: ( ruleUnaryOperator )
            {
            // InternalAlf.g:8142:2: ( ruleUnaryOperator )
            // InternalAlf.g:8143:3: ruleUnaryOperator
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
    // InternalAlf.g:8152:1: rule__UnaryExpression__OperandAssignment_1_2 : ( ruleAccessExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8156:1: ( ( ruleAccessExpression ) )
            // InternalAlf.g:8157:2: ( ruleAccessExpression )
            {
            // InternalAlf.g:8157:2: ( ruleAccessExpression )
            // InternalAlf.g:8158:3: ruleAccessExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAccessExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperandAccessExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AccessExpression__IndexAssignment_1_2"
    // InternalAlf.g:8167:1: rule__AccessExpression__IndexAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__AccessExpression__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8171:1: ( ( ruleExpression ) )
            // InternalAlf.g:8172:2: ( ruleExpression )
            {
            // InternalAlf.g:8172:2: ( ruleExpression )
            // InternalAlf.g:8173:3: ruleExpression
            {
             before(grammarAccess.getAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessExpression__IndexAssignment_1_2"


    // $ANTLR start "rule__ElementReferenceExpression__ReferentAssignment"
    // InternalAlf.g:8182:1: rule__ElementReferenceExpression__ReferentAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementReferenceExpression__ReferentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8186:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8187:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8187:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8188:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0()); 
            // InternalAlf.g:8189:3: ( ruleQualifiedName )
            // InternalAlf.g:8190:4: ruleQualifiedName
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
    // InternalAlf.g:8201:1: rule__InstanceCreationExpression__ClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InstanceCreationExpression__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8205:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:8206:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:8206:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:8207:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0()); 
            // InternalAlf.g:8208:3: ( ruleQualifiedName )
            // InternalAlf.g:8209:4: ruleQualifiedName
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
    // InternalAlf.g:8220:1: rule__InstanceCreationExpression__ArgumentAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8224:1: ( ( ruleExpression ) )
            // InternalAlf.g:8225:2: ( ruleExpression )
            {
            // InternalAlf.g:8225:2: ( ruleExpression )
            // InternalAlf.g:8226:3: ruleExpression
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
    // InternalAlf.g:8235:1: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8239:1: ( ( ruleExpression ) )
            // InternalAlf.g:8240:2: ( ruleExpression )
            {
            // InternalAlf.g:8240:2: ( ruleExpression )
            // InternalAlf.g:8241:3: ruleExpression
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
    // InternalAlf.g:8250:1: rule__SequenceConstructionExpression__ElementAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8254:1: ( ( ruleExpression ) )
            // InternalAlf.g:8255:2: ( ruleExpression )
            {
            // InternalAlf.g:8255:2: ( ruleExpression )
            // InternalAlf.g:8256:3: ruleExpression
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
    // InternalAlf.g:8265:1: rule__SequenceConstructionExpression__ElementAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8269:1: ( ( ruleExpression ) )
            // InternalAlf.g:8270:2: ( ruleExpression )
            {
            // InternalAlf.g:8270:2: ( ruleExpression )
            // InternalAlf.g:8271:3: ruleExpression
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
    // InternalAlf.g:8280:1: rule__BooleanLiteralExpression__ValueAssignment : ( RULE_BOOLEAN_VALUE ) ;
    public final void rule__BooleanLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8284:1: ( ( RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:8285:2: ( RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:8285:2: ( RULE_BOOLEAN_VALUE )
            // InternalAlf.g:8286:3: RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:8295:1: rule__StringLiteralExpression__ValueAssignment : ( RULE_STRING_VALUE ) ;
    public final void rule__StringLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8299:1: ( ( RULE_STRING_VALUE ) )
            // InternalAlf.g:8300:2: ( RULE_STRING_VALUE )
            {
            // InternalAlf.g:8300:2: ( RULE_STRING_VALUE )
            // InternalAlf.g:8301:3: RULE_STRING_VALUE
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
    // InternalAlf.g:8310:1: rule__RealLiteralExpression__ValueAssignment : ( ruleRealValue ) ;
    public final void rule__RealLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8314:1: ( ( ruleRealValue ) )
            // InternalAlf.g:8315:2: ( ruleRealValue )
            {
            // InternalAlf.g:8315:2: ( ruleRealValue )
            // InternalAlf.g:8316:3: ruleRealValue
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
    // InternalAlf.g:8325:1: rule__NaturalLiteralExpression__ValueAssignment : ( RULE_NATURAL_VALUE ) ;
    public final void rule__NaturalLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:8329:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:8330:2: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:8330:2: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:8331:3: RULE_NATURAL_VALUE
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
    protected DFA28 dfa28 = new DFA28(this);
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
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\2\4\4\22\1\4\3\uffff\2\26\1\4\2\26";
    static final String dfa_9s = "\1\24\1\57\2\56\2\57\1\5\3\uffff\2\64\1\5\2\64";
    static final String dfa_10s = "\7\uffff\1\2\1\1\1\3\5\uffff";
    static final String dfa_11s = "\17\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\16\uffff\1\1",
            "\1\4\1\5\14\uffff\1\6\4\uffff\1\7\27\uffff\1\7",
            "\1\11\3\uffff\1\10\17\uffff\1\10\3\uffff\2\10\2\uffff\1\10",
            "\1\11\3\uffff\1\10\17\uffff\1\10\3\uffff\2\10\2\uffff\1\10",
            "\1\6\3\uffff\1\10\1\7\16\uffff\1\10\3\uffff\2\10\2\uffff\1\10\1\7",
            "\1\6\3\uffff\1\10\1\7\16\uffff\1\10\3\uffff\2\10\2\uffff\1\10\1\7",
            "\1\12\1\13",
            "",
            "",
            "",
            "\1\11\17\uffff\1\7\4\uffff\1\7\2\uffff\1\7\5\uffff\1\14",
            "\1\11\17\uffff\1\7\4\uffff\1\7\2\uffff\1\7\5\uffff\1\14",
            "\1\15\1\16",
            "\1\11\17\uffff\1\7\4\uffff\1\7\2\uffff\1\7\5\uffff\1\14",
            "\1\11\17\uffff\1\7\4\uffff\1\7\2\uffff\1\7\5\uffff\1\14"
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
    static final String dfa_13s = "\27\uffff";
    static final String dfa_14s = "\4\4\1\uffff\2\22\1\uffff\2\22\4\4\1\uffff\2\22\1\uffff\2\26\1\4\2\26";
    static final String dfa_15s = "\1\67\3\57\1\uffff\2\56\1\uffff\2\57\1\5\3\57\1\uffff\2\57\1\uffff\2\64\1\5\2\64";
    static final String dfa_16s = "\4\uffff\1\1\2\uffff\1\3\6\uffff\1\2\2\uffff\1\4\5\uffff";
    static final String dfa_17s = "\27\uffff}>";
    static final String[] dfa_18s = {
            "\1\5\1\6\16\uffff\1\1\16\uffff\3\4\3\uffff\1\7\14\uffff\1\2\1\3",
            "\1\10\1\11\14\uffff\1\12\4\uffff\1\16\13\uffff\1\13\1\14\1\15\11\uffff\1\16",
            "\1\10\1\11\14\uffff\1\12\4\uffff\1\16\13\uffff\1\13\1\14\1\15\11\uffff\1\16",
            "\1\17\1\20\14\uffff\1\16\4\uffff\1\16\13\uffff\1\13\1\14\1\15\11\uffff\1\16",
            "",
            "\1\21\3\uffff\1\4\17\uffff\1\4\3\uffff\2\4\2\uffff\1\4",
            "\1\21\3\uffff\1\4\17\uffff\1\4\3\uffff\2\4\2\uffff\1\4",
            "",
            "\1\12\3\uffff\1\4\1\16\16\uffff\1\4\3\uffff\2\4\2\uffff\1\4\1\16",
            "\1\12\3\uffff\1\4\1\16\16\uffff\1\4\3\uffff\2\4\2\uffff\1\4\1\16",
            "\1\22\1\23",
            "\1\17\1\20\14\uffff\1\16\4\uffff\1\16\27\uffff\1\16",
            "\1\17\1\20\14\uffff\1\16\4\uffff\1\16\27\uffff\1\16",
            "\1\17\1\20\14\uffff\1\16\4\uffff\1\16\27\uffff\1\16",
            "",
            "\1\16\3\uffff\1\4\1\16\16\uffff\1\4\3\uffff\2\4\2\uffff\1\4\1\16",
            "\1\16\3\uffff\1\4\1\16\16\uffff\1\4\3\uffff\2\4\2\uffff\1\4\1\16",
            "",
            "\1\21\17\uffff\1\16\4\uffff\1\16\2\uffff\1\16\5\uffff\1\24",
            "\1\21\17\uffff\1\16\4\uffff\1\16\2\uffff\1\16\5\uffff\1\24",
            "\1\25\1\26",
            "\1\21\17\uffff\1\16\4\uffff\1\16\2\uffff\1\16\5\uffff\1\24",
            "\1\21\17\uffff\1\16\4\uffff\1\16\2\uffff\1\16\5\uffff\1\24"
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
    static final String dfa_20s = "\2\uffff\2\7\5\uffff\2\7";
    static final String dfa_21s = "\1\4\1\uffff\2\26\2\uffff\1\4\2\uffff\2\26";
    static final String dfa_22s = "\1\64\1\uffff\2\71\2\uffff\1\5\2\uffff\2\71";
    static final String dfa_23s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\2\1\3\2\uffff";
    static final String dfa_24s = "\13\uffff}>";
    static final String[] dfa_25s = {
            "\1\2\1\3\3\1\21\uffff\1\1\13\uffff\1\4\12\uffff\1\5\1\uffff\2\1",
            "",
            "\1\7\1\uffff\5\7\11\uffff\3\7\2\uffff\2\7\4\uffff\1\10\1\7\1\uffff\1\6\4\uffff\1\7",
            "\1\7\1\uffff\5\7\11\uffff\3\7\2\uffff\2\7\4\uffff\1\10\1\7\1\uffff\1\6\4\uffff\1\7",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\1\7\1\uffff\5\7\11\uffff\3\7\2\uffff\2\7\4\uffff\1\10\1\7\1\uffff\1\6\4\uffff\1\7",
            "\1\7\1\uffff\5\7\11\uffff\3\7\2\uffff\2\7\4\uffff\1\10\1\7\1\uffff\1\6\4\uffff\1\7"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1830:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );";
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000840030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00E002BF80138030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00E0023F80138032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00E0023F80138030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00C0003800100030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000803800840030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000040030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000038000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00004C4000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000200030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x001A0040070001F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000484000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x020000001F000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x001A0040040001F0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x001E0040070001F0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x001A00C0070001F0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000002L});

}