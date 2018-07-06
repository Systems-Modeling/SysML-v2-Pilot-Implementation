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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_NATURAL_VALUE", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'is'", "'specializes'", "'feature'", "'redefines'", "'+'", "'-'", "'*'", "'/'", "'^'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'", "'package'", "'{'", "'}'", "';'", "'class'", "','", "'connector'", "':'", "'['", "']'", "'..'", "'='", "'subsets'", "'=>'", "'('", "')'", "'null'", "'.'", "'abstract'", "'port'", "'@'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=9;
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


    // $ANTLR start "entryRulePackagedFeatureMember"
    // InternalAlf.g:178:1: entryRulePackagedFeatureMember : rulePackagedFeatureMember EOF ;
    public final void entryRulePackagedFeatureMember() throws RecognitionException {
        try {
            // InternalAlf.g:179:1: ( rulePackagedFeatureMember EOF )
            // InternalAlf.g:180:1: rulePackagedFeatureMember EOF
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
    // InternalAlf.g:187:1: rulePackagedFeatureMember : ( ( rule__PackagedFeatureMember__Group__0 ) ) ;
    public final void rulePackagedFeatureMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:191:2: ( ( ( rule__PackagedFeatureMember__Group__0 ) ) )
            // InternalAlf.g:192:2: ( ( rule__PackagedFeatureMember__Group__0 ) )
            {
            // InternalAlf.g:192:2: ( ( rule__PackagedFeatureMember__Group__0 ) )
            // InternalAlf.g:193:3: ( rule__PackagedFeatureMember__Group__0 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getGroup()); 
            // InternalAlf.g:194:3: ( rule__PackagedFeatureMember__Group__0 )
            // InternalAlf.g:194:4: rule__PackagedFeatureMember__Group__0
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
    // InternalAlf.g:203:1: entryRuleNonFeatureDefinition : ruleNonFeatureDefinition EOF ;
    public final void entryRuleNonFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:204:1: ( ruleNonFeatureDefinition EOF )
            // InternalAlf.g:205:1: ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:212:1: ruleNonFeatureDefinition : ( ( rule__NonFeatureDefinition__Alternatives ) ) ;
    public final void ruleNonFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:216:2: ( ( ( rule__NonFeatureDefinition__Alternatives ) ) )
            // InternalAlf.g:217:2: ( ( rule__NonFeatureDefinition__Alternatives ) )
            {
            // InternalAlf.g:217:2: ( ( rule__NonFeatureDefinition__Alternatives ) )
            // InternalAlf.g:218:3: ( rule__NonFeatureDefinition__Alternatives )
            {
             before(grammarAccess.getNonFeatureDefinitionAccess().getAlternatives()); 
            // InternalAlf.g:219:3: ( rule__NonFeatureDefinition__Alternatives )
            // InternalAlf.g:219:4: rule__NonFeatureDefinition__Alternatives
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
    // InternalAlf.g:228:1: entryRuleClassifierDefinitionOrStub : ruleClassifierDefinitionOrStub EOF ;
    public final void entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:229:1: ( ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:230:1: ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:237:1: ruleClassifierDefinitionOrStub : ( ruleClassDefinitionOrStub ) ;
    public final void ruleClassifierDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:241:2: ( ( ruleClassDefinitionOrStub ) )
            // InternalAlf.g:242:2: ( ruleClassDefinitionOrStub )
            {
            // InternalAlf.g:242:2: ( ruleClassDefinitionOrStub )
            // InternalAlf.g:243:3: ruleClassDefinitionOrStub
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
    // InternalAlf.g:253:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalAlf.g:254:1: ( ruleClassDeclaration EOF )
            // InternalAlf.g:255:1: ruleClassDeclaration EOF
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
    // InternalAlf.g:262:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:266:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalAlf.g:267:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalAlf.g:267:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalAlf.g:268:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalAlf.g:269:3: ( rule__ClassDeclaration__Group__0 )
            // InternalAlf.g:269:4: rule__ClassDeclaration__Group__0
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
    // InternalAlf.g:278:1: entryRuleOwnedGeneralization : ruleOwnedGeneralization EOF ;
    public final void entryRuleOwnedGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:279:1: ( ruleOwnedGeneralization EOF )
            // InternalAlf.g:280:1: ruleOwnedGeneralization EOF
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
    // InternalAlf.g:287:1: ruleOwnedGeneralization : ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) ) ;
    public final void ruleOwnedGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:291:2: ( ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) ) )
            // InternalAlf.g:292:2: ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) )
            {
            // InternalAlf.g:292:2: ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) )
            // InternalAlf.g:293:3: ( rule__OwnedGeneralization__OwnedMemberElementAssignment )
            {
             before(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementAssignment()); 
            // InternalAlf.g:294:3: ( rule__OwnedGeneralization__OwnedMemberElementAssignment )
            // InternalAlf.g:294:4: rule__OwnedGeneralization__OwnedMemberElementAssignment
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
    // InternalAlf.g:303:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:304:1: ( ruleGeneralization EOF )
            // InternalAlf.g:305:1: ruleGeneralization EOF
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
    // InternalAlf.g:312:1: ruleGeneralization : ( ( rule__Generalization__GeneralAssignment ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:316:2: ( ( ( rule__Generalization__GeneralAssignment ) ) )
            // InternalAlf.g:317:2: ( ( rule__Generalization__GeneralAssignment ) )
            {
            // InternalAlf.g:317:2: ( ( rule__Generalization__GeneralAssignment ) )
            // InternalAlf.g:318:3: ( rule__Generalization__GeneralAssignment )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment()); 
            // InternalAlf.g:319:3: ( rule__Generalization__GeneralAssignment )
            // InternalAlf.g:319:4: rule__Generalization__GeneralAssignment
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
    // InternalAlf.g:328:1: entryRuleClassDefinition : ruleClassDefinition EOF ;
    public final void entryRuleClassDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:329:1: ( ruleClassDefinition EOF )
            // InternalAlf.g:330:1: ruleClassDefinition EOF
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
    // InternalAlf.g:337:1: ruleClassDefinition : ( ( rule__ClassDefinition__Group__0 ) ) ;
    public final void ruleClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:341:2: ( ( ( rule__ClassDefinition__Group__0 ) ) )
            // InternalAlf.g:342:2: ( ( rule__ClassDefinition__Group__0 ) )
            {
            // InternalAlf.g:342:2: ( ( rule__ClassDefinition__Group__0 ) )
            // InternalAlf.g:343:3: ( rule__ClassDefinition__Group__0 )
            {
             before(grammarAccess.getClassDefinitionAccess().getGroup()); 
            // InternalAlf.g:344:3: ( rule__ClassDefinition__Group__0 )
            // InternalAlf.g:344:4: rule__ClassDefinition__Group__0
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
    // InternalAlf.g:353:1: entryRuleClassDefinitionOrStub : ruleClassDefinitionOrStub EOF ;
    public final void entryRuleClassDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:354:1: ( ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:355:1: ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:362:1: ruleClassDefinitionOrStub : ( ruleClassDefinition ) ;
    public final void ruleClassDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:366:2: ( ( ruleClassDefinition ) )
            // InternalAlf.g:367:2: ( ruleClassDefinition )
            {
            // InternalAlf.g:367:2: ( ruleClassDefinition )
            // InternalAlf.g:368:3: ruleClassDefinition
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
    // InternalAlf.g:378:1: entryRuleClassMember : ruleClassMember EOF ;
    public final void entryRuleClassMember() throws RecognitionException {
        try {
            // InternalAlf.g:379:1: ( ruleClassMember EOF )
            // InternalAlf.g:380:1: ruleClassMember EOF
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
    // InternalAlf.g:387:1: ruleClassMember : ( ( rule__ClassMember__Alternatives ) ) ;
    public final void ruleClassMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:391:2: ( ( ( rule__ClassMember__Alternatives ) ) )
            // InternalAlf.g:392:2: ( ( rule__ClassMember__Alternatives ) )
            {
            // InternalAlf.g:392:2: ( ( rule__ClassMember__Alternatives ) )
            // InternalAlf.g:393:3: ( rule__ClassMember__Alternatives )
            {
             before(grammarAccess.getClassMemberAccess().getAlternatives()); 
            // InternalAlf.g:394:3: ( rule__ClassMember__Alternatives )
            // InternalAlf.g:394:4: rule__ClassMember__Alternatives
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
    // InternalAlf.g:403:1: entryRuleClassFeatureMember : ruleClassFeatureMember EOF ;
    public final void entryRuleClassFeatureMember() throws RecognitionException {
        try {
            // InternalAlf.g:404:1: ( ruleClassFeatureMember EOF )
            // InternalAlf.g:405:1: ruleClassFeatureMember EOF
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
    // InternalAlf.g:412:1: ruleClassFeatureMember : ( ( rule__ClassFeatureMember__Alternatives ) ) ;
    public final void ruleClassFeatureMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:416:2: ( ( ( rule__ClassFeatureMember__Alternatives ) ) )
            // InternalAlf.g:417:2: ( ( rule__ClassFeatureMember__Alternatives ) )
            {
            // InternalAlf.g:417:2: ( ( rule__ClassFeatureMember__Alternatives ) )
            // InternalAlf.g:418:3: ( rule__ClassFeatureMember__Alternatives )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives()); 
            // InternalAlf.g:419:3: ( rule__ClassFeatureMember__Alternatives )
            // InternalAlf.g:419:4: rule__ClassFeatureMember__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:428:1: entryRuleFeatureDefinition : ruleFeatureDefinition EOF ;
    public final void entryRuleFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:429:1: ( ruleFeatureDefinition EOF )
            // InternalAlf.g:430:1: ruleFeatureDefinition EOF
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
    // InternalAlf.g:437:1: ruleFeatureDefinition : ( ( rule__FeatureDefinition__Alternatives ) ) ;
    public final void ruleFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:441:2: ( ( ( rule__FeatureDefinition__Alternatives ) ) )
            // InternalAlf.g:442:2: ( ( rule__FeatureDefinition__Alternatives ) )
            {
            // InternalAlf.g:442:2: ( ( rule__FeatureDefinition__Alternatives ) )
            // InternalAlf.g:443:3: ( rule__FeatureDefinition__Alternatives )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getAlternatives()); 
            // InternalAlf.g:444:3: ( rule__FeatureDefinition__Alternatives )
            // InternalAlf.g:444:4: rule__FeatureDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:453:1: entryRuleOwnedRedefinitionOrSubset : ruleOwnedRedefinitionOrSubset EOF ;
    public final void entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        try {
            // InternalAlf.g:454:1: ( ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:455:1: ruleOwnedRedefinitionOrSubset EOF
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
    // InternalAlf.g:462:1: ruleOwnedRedefinitionOrSubset : ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) ) ;
    public final void ruleOwnedRedefinitionOrSubset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:466:2: ( ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) ) )
            // InternalAlf.g:467:2: ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) )
            {
            // InternalAlf.g:467:2: ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) )
            // InternalAlf.g:468:3: ( rule__OwnedRedefinitionOrSubset__Alternatives )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives()); 
            // InternalAlf.g:469:3: ( rule__OwnedRedefinitionOrSubset__Alternatives )
            // InternalAlf.g:469:4: rule__OwnedRedefinitionOrSubset__Alternatives
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
    // InternalAlf.g:478:1: entryRuleRedefinition : ruleRedefinition EOF ;
    public final void entryRuleRedefinition() throws RecognitionException {
        try {
            // InternalAlf.g:479:1: ( ruleRedefinition EOF )
            // InternalAlf.g:480:1: ruleRedefinition EOF
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
    // InternalAlf.g:487:1: ruleRedefinition : ( ( rule__Redefinition__RedefinedFeatureAssignment ) ) ;
    public final void ruleRedefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:491:2: ( ( ( rule__Redefinition__RedefinedFeatureAssignment ) ) )
            // InternalAlf.g:492:2: ( ( rule__Redefinition__RedefinedFeatureAssignment ) )
            {
            // InternalAlf.g:492:2: ( ( rule__Redefinition__RedefinedFeatureAssignment ) )
            // InternalAlf.g:493:3: ( rule__Redefinition__RedefinedFeatureAssignment )
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureAssignment()); 
            // InternalAlf.g:494:3: ( rule__Redefinition__RedefinedFeatureAssignment )
            // InternalAlf.g:494:4: rule__Redefinition__RedefinedFeatureAssignment
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
    // InternalAlf.g:503:1: entryRuleSubset : ruleSubset EOF ;
    public final void entryRuleSubset() throws RecognitionException {
        try {
            // InternalAlf.g:504:1: ( ruleSubset EOF )
            // InternalAlf.g:505:1: ruleSubset EOF
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
    // InternalAlf.g:512:1: ruleSubset : ( ( rule__Subset__SubsettedFeatureAssignment ) ) ;
    public final void ruleSubset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:516:2: ( ( ( rule__Subset__SubsettedFeatureAssignment ) ) )
            // InternalAlf.g:517:2: ( ( rule__Subset__SubsettedFeatureAssignment ) )
            {
            // InternalAlf.g:517:2: ( ( rule__Subset__SubsettedFeatureAssignment ) )
            // InternalAlf.g:518:3: ( rule__Subset__SubsettedFeatureAssignment )
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureAssignment()); 
            // InternalAlf.g:519:3: ( rule__Subset__SubsettedFeatureAssignment )
            // InternalAlf.g:519:4: rule__Subset__SubsettedFeatureAssignment
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
    // InternalAlf.g:528:1: entryRuleConnectorDefinition : ruleConnectorDefinition EOF ;
    public final void entryRuleConnectorDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:529:1: ( ruleConnectorDefinition EOF )
            // InternalAlf.g:530:1: ruleConnectorDefinition EOF
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
    // InternalAlf.g:537:1: ruleConnectorDefinition : ( ( rule__ConnectorDefinition__Group__0 ) ) ;
    public final void ruleConnectorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:541:2: ( ( ( rule__ConnectorDefinition__Group__0 ) ) )
            // InternalAlf.g:542:2: ( ( rule__ConnectorDefinition__Group__0 ) )
            {
            // InternalAlf.g:542:2: ( ( rule__ConnectorDefinition__Group__0 ) )
            // InternalAlf.g:543:3: ( rule__ConnectorDefinition__Group__0 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup()); 
            // InternalAlf.g:544:3: ( rule__ConnectorDefinition__Group__0 )
            // InternalAlf.g:544:4: rule__ConnectorDefinition__Group__0
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
    // InternalAlf.g:553:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAlf.g:554:1: ( ruleExpression EOF )
            // InternalAlf.g:555:1: ruleExpression EOF
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
    // InternalAlf.g:562:1: ruleExpression : ( ruleBinaryExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:566:2: ( ( ruleBinaryExpression ) )
            // InternalAlf.g:567:2: ( ruleBinaryExpression )
            {
            // InternalAlf.g:567:2: ( ruleBinaryExpression )
            // InternalAlf.g:568:3: ruleBinaryExpression
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
    // InternalAlf.g:578:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:579:1: ( ruleBinaryExpression EOF )
            // InternalAlf.g:580:1: ruleBinaryExpression EOF
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
    // InternalAlf.g:587:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:591:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalAlf.g:592:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalAlf.g:592:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalAlf.g:593:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalAlf.g:594:3: ( rule__BinaryExpression__Group__0 )
            // InternalAlf.g:594:4: rule__BinaryExpression__Group__0
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
    // InternalAlf.g:603:1: entryRuleBinaryOperator : ruleBinaryOperator EOF ;
    public final void entryRuleBinaryOperator() throws RecognitionException {
        try {
            // InternalAlf.g:604:1: ( ruleBinaryOperator EOF )
            // InternalAlf.g:605:1: ruleBinaryOperator EOF
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
    // InternalAlf.g:612:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:616:2: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // InternalAlf.g:617:2: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // InternalAlf.g:617:2: ( ( rule__BinaryOperator__Alternatives ) )
            // InternalAlf.g:618:3: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // InternalAlf.g:619:3: ( rule__BinaryOperator__Alternatives )
            // InternalAlf.g:619:4: rule__BinaryOperator__Alternatives
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
    // InternalAlf.g:628:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:629:1: ( ruleUnaryExpression EOF )
            // InternalAlf.g:630:1: ruleUnaryExpression EOF
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
    // InternalAlf.g:637:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:641:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalAlf.g:642:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalAlf.g:642:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalAlf.g:643:3: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // InternalAlf.g:644:3: ( rule__UnaryExpression__Alternatives )
            // InternalAlf.g:644:4: rule__UnaryExpression__Alternatives
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
    // InternalAlf.g:653:1: entryRuleUnaryOperator : ruleUnaryOperator EOF ;
    public final void entryRuleUnaryOperator() throws RecognitionException {
        try {
            // InternalAlf.g:654:1: ( ruleUnaryOperator EOF )
            // InternalAlf.g:655:1: ruleUnaryOperator EOF
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
    // InternalAlf.g:662:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:666:2: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalAlf.g:667:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalAlf.g:667:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalAlf.g:668:3: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // InternalAlf.g:669:3: ( rule__UnaryOperator__Alternatives )
            // InternalAlf.g:669:4: rule__UnaryOperator__Alternatives
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
    // InternalAlf.g:678:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:679:1: ( rulePrimaryExpression EOF )
            // InternalAlf.g:680:1: rulePrimaryExpression EOF
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
    // InternalAlf.g:687:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:691:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalAlf.g:692:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalAlf.g:692:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalAlf.g:693:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalAlf.g:694:3: ( rule__PrimaryExpression__Alternatives )
            // InternalAlf.g:694:4: rule__PrimaryExpression__Alternatives
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
    // InternalAlf.g:703:1: entryRuleElementReferenceExpression : ruleElementReferenceExpression EOF ;
    public final void entryRuleElementReferenceExpression() throws RecognitionException {
        try {
            // InternalAlf.g:704:1: ( ruleElementReferenceExpression EOF )
            // InternalAlf.g:705:1: ruleElementReferenceExpression EOF
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
    // InternalAlf.g:712:1: ruleElementReferenceExpression : ( ( rule__ElementReferenceExpression__ReferentAssignment ) ) ;
    public final void ruleElementReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:716:2: ( ( ( rule__ElementReferenceExpression__ReferentAssignment ) ) )
            // InternalAlf.g:717:2: ( ( rule__ElementReferenceExpression__ReferentAssignment ) )
            {
            // InternalAlf.g:717:2: ( ( rule__ElementReferenceExpression__ReferentAssignment ) )
            // InternalAlf.g:718:3: ( rule__ElementReferenceExpression__ReferentAssignment )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentAssignment()); 
            // InternalAlf.g:719:3: ( rule__ElementReferenceExpression__ReferentAssignment )
            // InternalAlf.g:719:4: rule__ElementReferenceExpression__ReferentAssignment
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
    // InternalAlf.g:728:1: entryRuleInstanceCreationExpression : ruleInstanceCreationExpression EOF ;
    public final void entryRuleInstanceCreationExpression() throws RecognitionException {
        try {
            // InternalAlf.g:729:1: ( ruleInstanceCreationExpression EOF )
            // InternalAlf.g:730:1: ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:737:1: ruleInstanceCreationExpression : ( ( rule__InstanceCreationExpression__Group__0 ) ) ;
    public final void ruleInstanceCreationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:741:2: ( ( ( rule__InstanceCreationExpression__Group__0 ) ) )
            // InternalAlf.g:742:2: ( ( rule__InstanceCreationExpression__Group__0 ) )
            {
            // InternalAlf.g:742:2: ( ( rule__InstanceCreationExpression__Group__0 ) )
            // InternalAlf.g:743:3: ( rule__InstanceCreationExpression__Group__0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup()); 
            // InternalAlf.g:744:3: ( rule__InstanceCreationExpression__Group__0 )
            // InternalAlf.g:744:4: rule__InstanceCreationExpression__Group__0
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
    // InternalAlf.g:753:1: entryRuleSequenceConstructionExpression : ruleSequenceConstructionExpression EOF ;
    public final void entryRuleSequenceConstructionExpression() throws RecognitionException {
        try {
            // InternalAlf.g:754:1: ( ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:755:1: ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:762:1: ruleSequenceConstructionExpression : ( ( rule__SequenceConstructionExpression__Group__0 ) ) ;
    public final void ruleSequenceConstructionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:766:2: ( ( ( rule__SequenceConstructionExpression__Group__0 ) ) )
            // InternalAlf.g:767:2: ( ( rule__SequenceConstructionExpression__Group__0 ) )
            {
            // InternalAlf.g:767:2: ( ( rule__SequenceConstructionExpression__Group__0 ) )
            // InternalAlf.g:768:3: ( rule__SequenceConstructionExpression__Group__0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup()); 
            // InternalAlf.g:769:3: ( rule__SequenceConstructionExpression__Group__0 )
            // InternalAlf.g:769:4: rule__SequenceConstructionExpression__Group__0
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
    // InternalAlf.g:778:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:779:1: ( ruleLiteralExpression EOF )
            // InternalAlf.g:780:1: ruleLiteralExpression EOF
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
    // InternalAlf.g:787:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:791:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalAlf.g:792:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:792:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalAlf.g:793:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:794:3: ( rule__LiteralExpression__Alternatives )
            // InternalAlf.g:794:4: rule__LiteralExpression__Alternatives
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
    // InternalAlf.g:803:1: entryRuleNullLiteralExpression : ruleNullLiteralExpression EOF ;
    public final void entryRuleNullLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:804:1: ( ruleNullLiteralExpression EOF )
            // InternalAlf.g:805:1: ruleNullLiteralExpression EOF
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
    // InternalAlf.g:812:1: ruleNullLiteralExpression : ( ( rule__NullLiteralExpression__Group__0 ) ) ;
    public final void ruleNullLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:816:2: ( ( ( rule__NullLiteralExpression__Group__0 ) ) )
            // InternalAlf.g:817:2: ( ( rule__NullLiteralExpression__Group__0 ) )
            {
            // InternalAlf.g:817:2: ( ( rule__NullLiteralExpression__Group__0 ) )
            // InternalAlf.g:818:3: ( rule__NullLiteralExpression__Group__0 )
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getGroup()); 
            // InternalAlf.g:819:3: ( rule__NullLiteralExpression__Group__0 )
            // InternalAlf.g:819:4: rule__NullLiteralExpression__Group__0
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
    // InternalAlf.g:828:1: entryRuleBooleanLiteralExpression : ruleBooleanLiteralExpression EOF ;
    public final void entryRuleBooleanLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:829:1: ( ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:830:1: ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:837:1: ruleBooleanLiteralExpression : ( ( rule__BooleanLiteralExpression__ValueAssignment ) ) ;
    public final void ruleBooleanLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:841:2: ( ( ( rule__BooleanLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:842:2: ( ( rule__BooleanLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:842:2: ( ( rule__BooleanLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:843:3: ( rule__BooleanLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:844:3: ( rule__BooleanLiteralExpression__ValueAssignment )
            // InternalAlf.g:844:4: rule__BooleanLiteralExpression__ValueAssignment
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
    // InternalAlf.g:853:1: entryRuleStringLiteralExpression : ruleStringLiteralExpression EOF ;
    public final void entryRuleStringLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:854:1: ( ruleStringLiteralExpression EOF )
            // InternalAlf.g:855:1: ruleStringLiteralExpression EOF
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
    // InternalAlf.g:862:1: ruleStringLiteralExpression : ( ( rule__StringLiteralExpression__ValueAssignment ) ) ;
    public final void ruleStringLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:866:2: ( ( ( rule__StringLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:867:2: ( ( rule__StringLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:867:2: ( ( rule__StringLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:868:3: ( rule__StringLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:869:3: ( rule__StringLiteralExpression__ValueAssignment )
            // InternalAlf.g:869:4: rule__StringLiteralExpression__ValueAssignment
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
    // InternalAlf.g:878:1: entryRuleRealLiteralExpression : ruleRealLiteralExpression EOF ;
    public final void entryRuleRealLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:879:1: ( ruleRealLiteralExpression EOF )
            // InternalAlf.g:880:1: ruleRealLiteralExpression EOF
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
    // InternalAlf.g:887:1: ruleRealLiteralExpression : ( ( rule__RealLiteralExpression__ValueAssignment ) ) ;
    public final void ruleRealLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:891:2: ( ( ( rule__RealLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:892:2: ( ( rule__RealLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:892:2: ( ( rule__RealLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:893:3: ( rule__RealLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getRealLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:894:3: ( rule__RealLiteralExpression__ValueAssignment )
            // InternalAlf.g:894:4: rule__RealLiteralExpression__ValueAssignment
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
    // InternalAlf.g:903:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalAlf.g:904:1: ( ruleRealValue EOF )
            // InternalAlf.g:905:1: ruleRealValue EOF
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
    // InternalAlf.g:912:1: ruleRealValue : ( ( rule__RealValue__Group__0 ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:916:2: ( ( ( rule__RealValue__Group__0 ) ) )
            // InternalAlf.g:917:2: ( ( rule__RealValue__Group__0 ) )
            {
            // InternalAlf.g:917:2: ( ( rule__RealValue__Group__0 ) )
            // InternalAlf.g:918:3: ( rule__RealValue__Group__0 )
            {
             before(grammarAccess.getRealValueAccess().getGroup()); 
            // InternalAlf.g:919:3: ( rule__RealValue__Group__0 )
            // InternalAlf.g:919:4: rule__RealValue__Group__0
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
    // InternalAlf.g:928:1: entryRuleNaturalLiteralExpression : ruleNaturalLiteralExpression EOF ;
    public final void entryRuleNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:929:1: ( ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:930:1: ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:937:1: ruleNaturalLiteralExpression : ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) ;
    public final void ruleNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:941:2: ( ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:942:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:942:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:943:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getNaturalLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:944:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            // InternalAlf.g:944:4: rule__NaturalLiteralExpression__ValueAssignment
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
    // InternalAlf.g:953:1: entryRuleUnlimitedNaturalLiteralExpression : ruleUnlimitedNaturalLiteralExpression EOF ;
    public final void entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:954:1: ( ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:955:1: ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:962:1: ruleUnlimitedNaturalLiteralExpression : ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) ;
    public final void ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:966:2: ( ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) )
            // InternalAlf.g:967:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:967:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            // InternalAlf.g:968:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:969:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            // InternalAlf.g:969:4: rule__UnlimitedNaturalLiteralExpression__Alternatives
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
    // InternalAlf.g:978:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalAlf.g:979:1: ( ruleName EOF )
            // InternalAlf.g:980:1: ruleName EOF
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
    // InternalAlf.g:987:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:991:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalAlf.g:992:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalAlf.g:992:2: ( ( rule__Name__Alternatives ) )
            // InternalAlf.g:993:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalAlf.g:994:3: ( rule__Name__Alternatives )
            // InternalAlf.g:994:4: rule__Name__Alternatives
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
    // InternalAlf.g:1003:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAlf.g:1004:1: ( ruleQualifiedName EOF )
            // InternalAlf.g:1005:1: ruleQualifiedName EOF
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
    // InternalAlf.g:1012:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1016:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAlf.g:1017:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAlf.g:1017:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAlf.g:1018:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAlf.g:1019:3: ( rule__QualifiedName__Group__0 )
            // InternalAlf.g:1019:4: rule__QualifiedName__Group__0
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
    // InternalAlf.g:1028:1: ruleVisibilityIndicator : ( ( rule__VisibilityIndicator__Alternatives ) ) ;
    public final void ruleVisibilityIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1032:1: ( ( ( rule__VisibilityIndicator__Alternatives ) ) )
            // InternalAlf.g:1033:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            {
            // InternalAlf.g:1033:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            // InternalAlf.g:1034:3: ( rule__VisibilityIndicator__Alternatives )
            {
             before(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            // InternalAlf.g:1035:3: ( rule__VisibilityIndicator__Alternatives )
            // InternalAlf.g:1035:4: rule__VisibilityIndicator__Alternatives
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
    // InternalAlf.g:1044:1: ruleFeatureDirection : ( ( rule__FeatureDirection__Alternatives ) ) ;
    public final void ruleFeatureDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1048:1: ( ( ( rule__FeatureDirection__Alternatives ) ) )
            // InternalAlf.g:1049:2: ( ( rule__FeatureDirection__Alternatives ) )
            {
            // InternalAlf.g:1049:2: ( ( rule__FeatureDirection__Alternatives ) )
            // InternalAlf.g:1050:3: ( rule__FeatureDirection__Alternatives )
            {
             before(grammarAccess.getFeatureDirectionAccess().getAlternatives()); 
            // InternalAlf.g:1051:3: ( rule__FeatureDirection__Alternatives )
            // InternalAlf.g:1051:4: rule__FeatureDirection__Alternatives
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
    // InternalAlf.g:1059:1: rule__UnitDefinition__Alternatives : ( ( rulePackageDefinition ) | ( ruleClassDefinition ) );
    public final void rule__UnitDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1063:1: ( ( rulePackageDefinition ) | ( ruleClassDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33) ) {
                alt1=1;
            }
            else if ( (LA1_0==37||LA1_0==51) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:1064:2: ( rulePackageDefinition )
                    {
                    // InternalAlf.g:1064:2: ( rulePackageDefinition )
                    // InternalAlf.g:1065:3: rulePackageDefinition
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
                    // InternalAlf.g:1070:2: ( ruleClassDefinition )
                    {
                    // InternalAlf.g:1070:2: ( ruleClassDefinition )
                    // InternalAlf.g:1071:3: ruleClassDefinition
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
    // InternalAlf.g:1080:1: rule__PackageMember__Alternatives : ( ( ruleNonFeatureMember ) | ( rulePackagedFeatureMember ) );
    public final void rule__PackageMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1084:1: ( ( ruleNonFeatureMember ) | ( rulePackagedFeatureMember ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=RULE_ID && LA2_1<=RULE_UNRESTRICTED_NAME)||LA2_1==15||(LA2_1>=17 && LA2_1<=18)||LA2_1==45) ) {
                    alt2=2;
                }
                else if ( (LA2_1==33||LA2_1==37||LA2_1==51) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=RULE_ID && LA2_2<=RULE_UNRESTRICTED_NAME)||LA2_2==15||(LA2_2>=17 && LA2_2<=18)||LA2_2==45) ) {
                    alt2=2;
                }
                else if ( (LA2_2==33||LA2_2==37||LA2_2==51) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=RULE_ID && LA2_3<=RULE_UNRESTRICTED_NAME)||LA2_3==15||(LA2_3>=17 && LA2_3<=18)||LA2_3==45) ) {
                    alt2=2;
                }
                else if ( (LA2_3==33||LA2_3==37||LA2_3==51) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA2_4 = input.LA(2);

                if ( ((LA2_4>=RULE_ID && LA2_4<=RULE_UNRESTRICTED_NAME)||LA2_4==15||(LA2_4>=17 && LA2_4<=18)||LA2_4==45) ) {
                    alt2=2;
                }
                else if ( (LA2_4==33||LA2_4==37||LA2_4==51) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 33:
            case 37:
            case 51:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 15:
            case 17:
            case 18:
            case 45:
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
                    // InternalAlf.g:1085:2: ( ruleNonFeatureMember )
                    {
                    // InternalAlf.g:1085:2: ( ruleNonFeatureMember )
                    // InternalAlf.g:1086:3: ruleNonFeatureMember
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
                    // InternalAlf.g:1091:2: ( rulePackagedFeatureMember )
                    {
                    // InternalAlf.g:1091:2: ( rulePackagedFeatureMember )
                    // InternalAlf.g:1092:3: rulePackagedFeatureMember
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
    // InternalAlf.g:1101:1: rule__NonFeatureMember__Alternatives_1 : ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) | ( ( rule__NonFeatureMember__Group_1_2__0 ) ) );
    public final void rule__NonFeatureMember__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1105:1: ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) | ( ( rule__NonFeatureMember__Group_1_2__0 ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAlf.g:1106:2: ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) )
                    {
                    // InternalAlf.g:1106:2: ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) )
                    // InternalAlf.g:1107:3: ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 )
                    {
                     before(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementAssignment_1_0()); 
                    // InternalAlf.g:1108:3: ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 )
                    // InternalAlf.g:1108:4: rule__NonFeatureMember__OwnedMemberElementAssignment_1_0
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
                    // InternalAlf.g:1112:2: ( ( rule__NonFeatureMember__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1112:2: ( ( rule__NonFeatureMember__Group_1_1__0 ) )
                    // InternalAlf.g:1113:3: ( rule__NonFeatureMember__Group_1_1__0 )
                    {
                     before(grammarAccess.getNonFeatureMemberAccess().getGroup_1_1()); 
                    // InternalAlf.g:1114:3: ( rule__NonFeatureMember__Group_1_1__0 )
                    // InternalAlf.g:1114:4: rule__NonFeatureMember__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFeatureMember__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonFeatureMemberAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1118:2: ( ( rule__NonFeatureMember__Group_1_2__0 ) )
                    {
                    // InternalAlf.g:1118:2: ( ( rule__NonFeatureMember__Group_1_2__0 ) )
                    // InternalAlf.g:1119:3: ( rule__NonFeatureMember__Group_1_2__0 )
                    {
                     before(grammarAccess.getNonFeatureMemberAccess().getGroup_1_2()); 
                    // InternalAlf.g:1120:3: ( rule__NonFeatureMember__Group_1_2__0 )
                    // InternalAlf.g:1120:4: rule__NonFeatureMember__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFeatureMember__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonFeatureMemberAccess().getGroup_1_2()); 

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


    // $ANTLR start "rule__PackagedFeatureMember__Alternatives_1"
    // InternalAlf.g:1128:1: rule__PackagedFeatureMember__Alternatives_1 : ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) );
    public final void rule__PackagedFeatureMember__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1132:1: ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAlf.g:1133:2: ( ( rule__PackagedFeatureMember__Group_1_0__0 ) )
                    {
                    // InternalAlf.g:1133:2: ( ( rule__PackagedFeatureMember__Group_1_0__0 ) )
                    // InternalAlf.g:1134:3: ( rule__PackagedFeatureMember__Group_1_0__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_0()); 
                    // InternalAlf.g:1135:3: ( rule__PackagedFeatureMember__Group_1_0__0 )
                    // InternalAlf.g:1135:4: rule__PackagedFeatureMember__Group_1_0__0
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
                    // InternalAlf.g:1139:2: ( ( rule__PackagedFeatureMember__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1139:2: ( ( rule__PackagedFeatureMember__Group_1_1__0 ) )
                    // InternalAlf.g:1140:3: ( rule__PackagedFeatureMember__Group_1_1__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_1()); 
                    // InternalAlf.g:1141:3: ( rule__PackagedFeatureMember__Group_1_1__0 )
                    // InternalAlf.g:1141:4: rule__PackagedFeatureMember__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_1()); 

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


    // $ANTLR start "rule__PackagedFeatureMember__Alternatives_1_1_0"
    // InternalAlf.g:1149:1: rule__PackagedFeatureMember__Alternatives_1_1_0 : ( ( ( rule__PackagedFeatureMember__Group_1_1_0_0__0 ) ) | ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1 ) ) );
    public final void rule__PackagedFeatureMember__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1153:1: ( ( ( rule__PackagedFeatureMember__Group_1_1_0_0__0 ) ) | ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:1154:2: ( ( rule__PackagedFeatureMember__Group_1_1_0_0__0 ) )
                    {
                    // InternalAlf.g:1154:2: ( ( rule__PackagedFeatureMember__Group_1_1_0_0__0 ) )
                    // InternalAlf.g:1155:3: ( rule__PackagedFeatureMember__Group_1_1_0_0__0 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_1_0_0()); 
                    // InternalAlf.g:1156:3: ( rule__PackagedFeatureMember__Group_1_1_0_0__0 )
                    // InternalAlf.g:1156:4: rule__PackagedFeatureMember__Group_1_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__Group_1_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackagedFeatureMemberAccess().getGroup_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1160:2: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1 ) )
                    {
                    // InternalAlf.g:1160:2: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1 ) )
                    // InternalAlf.g:1161:3: ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1 )
                    {
                     before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_1_0_1()); 
                    // InternalAlf.g:1162:3: ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1 )
                    // InternalAlf.g:1162:4: rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_1_0_1()); 

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
    // $ANTLR end "rule__PackagedFeatureMember__Alternatives_1_1_0"


    // $ANTLR start "rule__NonFeatureDefinition__Alternatives"
    // InternalAlf.g:1170:1: rule__NonFeatureDefinition__Alternatives : ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) );
    public final void rule__NonFeatureDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1174:1: ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            else if ( (LA6_0==37||LA6_0==51) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:1175:2: ( rulePackageDefinitionOrStub )
                    {
                    // InternalAlf.g:1175:2: ( rulePackageDefinitionOrStub )
                    // InternalAlf.g:1176:3: rulePackageDefinitionOrStub
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
                    // InternalAlf.g:1181:2: ( ruleClassifierDefinitionOrStub )
                    {
                    // InternalAlf.g:1181:2: ( ruleClassifierDefinitionOrStub )
                    // InternalAlf.g:1182:3: ruleClassifierDefinitionOrStub
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


    // $ANTLR start "rule__ClassDeclaration__Alternatives_3_0"
    // InternalAlf.g:1191:1: rule__ClassDeclaration__Alternatives_3_0 : ( ( 'is' ) | ( 'specializes' ) );
    public final void rule__ClassDeclaration__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1195:1: ( ( 'is' ) | ( 'specializes' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:1196:2: ( 'is' )
                    {
                    // InternalAlf.g:1196:2: ( 'is' )
                    // InternalAlf.g:1197:3: 'is'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1202:2: ( 'specializes' )
                    {
                    // InternalAlf.g:1202:2: ( 'specializes' )
                    // InternalAlf.g:1203:3: 'specializes'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalAlf.g:1212:1: rule__ClassMember__Alternatives : ( ( ruleNonFeatureMember ) | ( ruleClassFeatureMember ) );
    public final void rule__ClassMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1216:1: ( ( ruleNonFeatureMember ) | ( ruleClassFeatureMember ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==33||LA8_1==37||LA8_1==51) ) {
                    alt8=1;
                }
                else if ( ((LA8_1>=RULE_ID && LA8_1<=RULE_UNRESTRICTED_NAME)||LA8_1==15||(LA8_1>=17 && LA8_1<=18)||LA8_1==45||LA8_1==52) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==33||LA8_2==37||LA8_2==51) ) {
                    alt8=1;
                }
                else if ( ((LA8_2>=RULE_ID && LA8_2<=RULE_UNRESTRICTED_NAME)||LA8_2==15||(LA8_2>=17 && LA8_2<=18)||LA8_2==45||LA8_2==52) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==33||LA8_3==37||LA8_3==51) ) {
                    alt8=1;
                }
                else if ( ((LA8_3>=RULE_ID && LA8_3<=RULE_UNRESTRICTED_NAME)||LA8_3==15||(LA8_3>=17 && LA8_3<=18)||LA8_3==45||LA8_3==52) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA8_4 = input.LA(2);

                if ( (LA8_4==33||LA8_4==37||LA8_4==51) ) {
                    alt8=1;
                }
                else if ( ((LA8_4>=RULE_ID && LA8_4<=RULE_UNRESTRICTED_NAME)||LA8_4==15||(LA8_4>=17 && LA8_4<=18)||LA8_4==45||LA8_4==52) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case 33:
            case 37:
            case 51:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 15:
            case 17:
            case 18:
            case 39:
            case 45:
            case 52:
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
                    // InternalAlf.g:1217:2: ( ruleNonFeatureMember )
                    {
                    // InternalAlf.g:1217:2: ( ruleNonFeatureMember )
                    // InternalAlf.g:1218:3: ruleNonFeatureMember
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
                    // InternalAlf.g:1223:2: ( ruleClassFeatureMember )
                    {
                    // InternalAlf.g:1223:2: ( ruleClassFeatureMember )
                    // InternalAlf.g:1224:3: ruleClassFeatureMember
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


    // $ANTLR start "rule__ClassFeatureMember__Alternatives"
    // InternalAlf.g:1233:1: rule__ClassFeatureMember__Alternatives : ( ( ( rule__ClassFeatureMember__Group_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_2__0 ) ) );
    public final void rule__ClassFeatureMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1237:1: ( ( ( rule__ClassFeatureMember__Group_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_2__0 ) ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:1238:2: ( ( rule__ClassFeatureMember__Group_0__0 ) )
                    {
                    // InternalAlf.g:1238:2: ( ( rule__ClassFeatureMember__Group_0__0 ) )
                    // InternalAlf.g:1239:3: ( rule__ClassFeatureMember__Group_0__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_0()); 
                    // InternalAlf.g:1240:3: ( rule__ClassFeatureMember__Group_0__0 )
                    // InternalAlf.g:1240:4: rule__ClassFeatureMember__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1244:2: ( ( rule__ClassFeatureMember__Group_1__0 ) )
                    {
                    // InternalAlf.g:1244:2: ( ( rule__ClassFeatureMember__Group_1__0 ) )
                    // InternalAlf.g:1245:3: ( rule__ClassFeatureMember__Group_1__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_1()); 
                    // InternalAlf.g:1246:3: ( rule__ClassFeatureMember__Group_1__0 )
                    // InternalAlf.g:1246:4: rule__ClassFeatureMember__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1250:2: ( ( rule__ClassFeatureMember__Group_2__0 ) )
                    {
                    // InternalAlf.g:1250:2: ( ( rule__ClassFeatureMember__Group_2__0 ) )
                    // InternalAlf.g:1251:3: ( rule__ClassFeatureMember__Group_2__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_2()); 
                    // InternalAlf.g:1252:3: ( rule__ClassFeatureMember__Group_2__0 )
                    // InternalAlf.g:1252:4: rule__ClassFeatureMember__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ClassFeatureMember__Alternatives"


    // $ANTLR start "rule__ClassFeatureMember__Alternatives_0_1"
    // InternalAlf.g:1260:1: rule__ClassFeatureMember__Alternatives_0_1 : ( ( 'feature' ) | ( ( rule__ClassFeatureMember__Group_0_1_1__0 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1264:1: ( ( 'feature' ) | ( ( rule__ClassFeatureMember__Group_0_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==52) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlf.g:1265:2: ( 'feature' )
                    {
                    // InternalAlf.g:1265:2: ( 'feature' )
                    // InternalAlf.g:1266:3: 'feature'
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_0_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1271:2: ( ( rule__ClassFeatureMember__Group_0_1_1__0 ) )
                    {
                    // InternalAlf.g:1271:2: ( ( rule__ClassFeatureMember__Group_0_1_1__0 ) )
                    // InternalAlf.g:1272:3: ( rule__ClassFeatureMember__Group_0_1_1__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_0_1_1()); 
                    // InternalAlf.g:1273:3: ( rule__ClassFeatureMember__Group_0_1_1__0 )
                    // InternalAlf.g:1273:4: rule__ClassFeatureMember__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_0_1_1()); 

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
    // $ANTLR end "rule__ClassFeatureMember__Alternatives_0_1"


    // $ANTLR start "rule__ClassFeatureMember__Alternatives_2_0"
    // InternalAlf.g:1281:1: rule__ClassFeatureMember__Alternatives_2_0 : ( ( ( rule__ClassFeatureMember__Group_2_0_0__0 ) ) | ( ( rule__ClassFeatureMember__MemberNameAssignment_2_0_1 ) ) );
    public final void rule__ClassFeatureMember__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1285:1: ( ( ( rule__ClassFeatureMember__Group_2_0_0__0 ) ) | ( ( rule__ClassFeatureMember__MemberNameAssignment_2_0_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:1286:2: ( ( rule__ClassFeatureMember__Group_2_0_0__0 ) )
                    {
                    // InternalAlf.g:1286:2: ( ( rule__ClassFeatureMember__Group_2_0_0__0 ) )
                    // InternalAlf.g:1287:3: ( rule__ClassFeatureMember__Group_2_0_0__0 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getGroup_2_0_0()); 
                    // InternalAlf.g:1288:3: ( rule__ClassFeatureMember__Group_2_0_0__0 )
                    // InternalAlf.g:1288:4: rule__ClassFeatureMember__Group_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Group_2_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getGroup_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1292:2: ( ( rule__ClassFeatureMember__MemberNameAssignment_2_0_1 ) )
                    {
                    // InternalAlf.g:1292:2: ( ( rule__ClassFeatureMember__MemberNameAssignment_2_0_1 ) )
                    // InternalAlf.g:1293:3: ( rule__ClassFeatureMember__MemberNameAssignment_2_0_1 )
                    {
                     before(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_2_0_1()); 
                    // InternalAlf.g:1294:3: ( rule__ClassFeatureMember__MemberNameAssignment_2_0_1 )
                    // InternalAlf.g:1294:4: rule__ClassFeatureMember__MemberNameAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__MemberNameAssignment_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_2_0_1()); 

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
    // $ANTLR end "rule__ClassFeatureMember__Alternatives_2_0"


    // $ANTLR start "rule__FeatureDefinition__Alternatives"
    // InternalAlf.g:1302:1: rule__FeatureDefinition__Alternatives : ( ( ( rule__FeatureDefinition__Group_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1__0 ) ) );
    public final void rule__FeatureDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1306:1: ( ( ( rule__FeatureDefinition__Group_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1__0 ) ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==15||LA12_1==18||LA12_1==45) ) {
                    alt12=2;
                }
                else if ( (LA12_1==34||LA12_1==36||(LA12_1>=40 && LA12_1<=41)||LA12_1==44) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==34||LA12_2==36||(LA12_2>=40 && LA12_2<=41)||LA12_2==44) ) {
                    alt12=1;
                }
                else if ( (LA12_2==15||LA12_2==18||LA12_2==45) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 18:
            case 45:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAlf.g:1307:2: ( ( rule__FeatureDefinition__Group_0__0 ) )
                    {
                    // InternalAlf.g:1307:2: ( ( rule__FeatureDefinition__Group_0__0 ) )
                    // InternalAlf.g:1308:3: ( rule__FeatureDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_0()); 
                    // InternalAlf.g:1309:3: ( rule__FeatureDefinition__Group_0__0 )
                    // InternalAlf.g:1309:4: rule__FeatureDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1313:2: ( ( rule__FeatureDefinition__Group_1__0 ) )
                    {
                    // InternalAlf.g:1313:2: ( ( rule__FeatureDefinition__Group_1__0 ) )
                    // InternalAlf.g:1314:3: ( rule__FeatureDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1()); 
                    // InternalAlf.g:1315:3: ( rule__FeatureDefinition__Group_1__0 )
                    // InternalAlf.g:1315:4: rule__FeatureDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FeatureDefinition__Alternatives"


    // $ANTLR start "rule__FeatureDefinition__Alternatives_0_3"
    // InternalAlf.g:1323:1: rule__FeatureDefinition__Alternatives_0_3 : ( ( ( rule__FeatureDefinition__Group_0_3_0__0 ) ) | ( ( rule__FeatureDefinition__Group_0_3_1__0 ) ) );
    public final void rule__FeatureDefinition__Alternatives_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1327:1: ( ( ( rule__FeatureDefinition__Group_0_3_0__0 ) ) | ( ( rule__FeatureDefinition__Group_0_3_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36||LA13_0==44) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:1328:2: ( ( rule__FeatureDefinition__Group_0_3_0__0 ) )
                    {
                    // InternalAlf.g:1328:2: ( ( rule__FeatureDefinition__Group_0_3_0__0 ) )
                    // InternalAlf.g:1329:3: ( rule__FeatureDefinition__Group_0_3_0__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_0_3_0()); 
                    // InternalAlf.g:1330:3: ( rule__FeatureDefinition__Group_0_3_0__0 )
                    // InternalAlf.g:1330:4: rule__FeatureDefinition__Group_0_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_0_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1334:2: ( ( rule__FeatureDefinition__Group_0_3_1__0 ) )
                    {
                    // InternalAlf.g:1334:2: ( ( rule__FeatureDefinition__Group_0_3_1__0 ) )
                    // InternalAlf.g:1335:3: ( rule__FeatureDefinition__Group_0_3_1__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_0_3_1()); 
                    // InternalAlf.g:1336:3: ( rule__FeatureDefinition__Group_0_3_1__0 )
                    // InternalAlf.g:1336:4: rule__FeatureDefinition__Group_0_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_0_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_0_3_1()); 

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
    // $ANTLR end "rule__FeatureDefinition__Alternatives_0_3"


    // $ANTLR start "rule__FeatureDefinition__Alternatives_1_2"
    // InternalAlf.g:1344:1: rule__FeatureDefinition__Alternatives_1_2 : ( ( ( rule__FeatureDefinition__Group_1_2_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1_2_1__0 ) ) );
    public final void rule__FeatureDefinition__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1348:1: ( ( ( rule__FeatureDefinition__Group_1_2_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_NATURAL_VALUE) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==43) ) {
                        int LA14_5 = input.LA(4);

                        if ( (LA14_5==RULE_NATURAL_VALUE) ) {
                            int LA14_7 = input.LA(5);

                            if ( (LA14_7==42) ) {
                                int LA14_6 = input.LA(6);

                                if ( (LA14_6==36) ) {
                                    alt14=2;
                                }
                                else if ( (LA14_6==34||LA14_6==44) ) {
                                    alt14=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 14, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA14_5==21) ) {
                            int LA14_4 = input.LA(5);

                            if ( (LA14_4==42) ) {
                                int LA14_6 = input.LA(6);

                                if ( (LA14_6==36) ) {
                                    alt14=2;
                                }
                                else if ( (LA14_6==34||LA14_6==44) ) {
                                    alt14=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 14, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA14_3==42) ) {
                        int LA14_6 = input.LA(4);

                        if ( (LA14_6==36) ) {
                            alt14=2;
                        }
                        else if ( (LA14_6==34||LA14_6==44) ) {
                            alt14=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA14_1==21) ) {
                    int LA14_4 = input.LA(3);

                    if ( (LA14_4==42) ) {
                        int LA14_6 = input.LA(4);

                        if ( (LA14_6==36) ) {
                            alt14=2;
                        }
                        else if ( (LA14_6==34||LA14_6==44) ) {
                            alt14=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==34||LA14_0==44) ) {
                alt14=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:1349:2: ( ( rule__FeatureDefinition__Group_1_2_0__0 ) )
                    {
                    // InternalAlf.g:1349:2: ( ( rule__FeatureDefinition__Group_1_2_0__0 ) )
                    // InternalAlf.g:1350:3: ( rule__FeatureDefinition__Group_1_2_0__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0()); 
                    // InternalAlf.g:1351:3: ( rule__FeatureDefinition__Group_1_2_0__0 )
                    // InternalAlf.g:1351:4: rule__FeatureDefinition__Group_1_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1355:2: ( ( rule__FeatureDefinition__Group_1_2_1__0 ) )
                    {
                    // InternalAlf.g:1355:2: ( ( rule__FeatureDefinition__Group_1_2_1__0 ) )
                    // InternalAlf.g:1356:3: ( rule__FeatureDefinition__Group_1_2_1__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_1()); 
                    // InternalAlf.g:1357:3: ( rule__FeatureDefinition__Group_1_2_1__0 )
                    // InternalAlf.g:1357:4: rule__FeatureDefinition__Group_1_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_1()); 

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
    // $ANTLR end "rule__FeatureDefinition__Alternatives_1_2"


    // $ANTLR start "rule__FeatureDefinition__Alternatives_1_2_0_1"
    // InternalAlf.g:1365:1: rule__FeatureDefinition__Alternatives_1_2_0_1 : ( ( ( rule__FeatureDefinition__Group_1_2_0_1_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1_2_0_1_1__0 ) ) );
    public final void rule__FeatureDefinition__Alternatives_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1369:1: ( ( ( rule__FeatureDefinition__Group_1_2_0_1_0__0 ) ) | ( ( rule__FeatureDefinition__Group_1_2_0_1_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:1370:2: ( ( rule__FeatureDefinition__Group_1_2_0_1_0__0 ) )
                    {
                    // InternalAlf.g:1370:2: ( ( rule__FeatureDefinition__Group_1_2_0_1_0__0 ) )
                    // InternalAlf.g:1371:3: ( rule__FeatureDefinition__Group_1_2_0_1_0__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0_1_0()); 
                    // InternalAlf.g:1372:3: ( rule__FeatureDefinition__Group_1_2_0_1_0__0 )
                    // InternalAlf.g:1372:4: rule__FeatureDefinition__Group_1_2_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_2_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1376:2: ( ( rule__FeatureDefinition__Group_1_2_0_1_1__0 ) )
                    {
                    // InternalAlf.g:1376:2: ( ( rule__FeatureDefinition__Group_1_2_0_1_1__0 ) )
                    // InternalAlf.g:1377:3: ( rule__FeatureDefinition__Group_1_2_0_1_1__0 )
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0_1_1()); 
                    // InternalAlf.g:1378:3: ( rule__FeatureDefinition__Group_1_2_0_1_1__0 )
                    // InternalAlf.g:1378:4: rule__FeatureDefinition__Group_1_2_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_2_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0_1_1()); 

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
    // $ANTLR end "rule__FeatureDefinition__Alternatives_1_2_0_1"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Alternatives"
    // InternalAlf.g:1386:1: rule__OwnedRedefinitionOrSubset__Alternatives : ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1390:1: ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15||LA16_0==18) ) {
                alt16=1;
            }
            else if ( (LA16_0==45) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlf.g:1391:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    {
                    // InternalAlf.g:1391:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    // InternalAlf.g:1392:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_0()); 
                    // InternalAlf.g:1393:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    // InternalAlf.g:1393:4: rule__OwnedRedefinitionOrSubset__Group_0__0
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
                    // InternalAlf.g:1397:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    {
                    // InternalAlf.g:1397:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    // InternalAlf.g:1398:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_1()); 
                    // InternalAlf.g:1399:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    // InternalAlf.g:1399:4: rule__OwnedRedefinitionOrSubset__Group_1__0
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
    // InternalAlf.g:1407:1: rule__OwnedRedefinitionOrSubset__Alternatives_0_0 : ( ( 'is' ) | ( 'redefines' ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1411:1: ( ( 'is' ) | ( 'redefines' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlf.g:1412:2: ( 'is' )
                    {
                    // InternalAlf.g:1412:2: ( 'is' )
                    // InternalAlf.g:1413:3: 'is'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1418:2: ( 'redefines' )
                    {
                    // InternalAlf.g:1418:2: ( 'redefines' )
                    // InternalAlf.g:1419:3: 'redefines'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalAlf.g:1428:1: rule__BinaryExpression__Alternatives_1_1 : ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) );
    public final void rule__BinaryExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1432:1: ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=19 && LA18_0<=23)) ) {
                alt18=1;
            }
            else if ( (LA18_0==53) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:1433:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    {
                    // InternalAlf.g:1433:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    // InternalAlf.g:1434:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_0()); 
                    // InternalAlf.g:1435:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    // InternalAlf.g:1435:4: rule__BinaryExpression__Group_1_1_0__0
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
                    // InternalAlf.g:1439:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    {
                    // InternalAlf.g:1439:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    // InternalAlf.g:1440:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_1()); 
                    // InternalAlf.g:1441:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    // InternalAlf.g:1441:4: rule__BinaryExpression__Group_1_1_1__0
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
    // InternalAlf.g:1449:1: rule__BinaryOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1453:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt19=1;
                }
                break;
            case 20:
                {
                alt19=2;
                }
                break;
            case 21:
                {
                alt19=3;
                }
                break;
            case 22:
                {
                alt19=4;
                }
                break;
            case 23:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAlf.g:1454:2: ( '+' )
                    {
                    // InternalAlf.g:1454:2: ( '+' )
                    // InternalAlf.g:1455:3: '+'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1460:2: ( '-' )
                    {
                    // InternalAlf.g:1460:2: ( '-' )
                    // InternalAlf.g:1461:3: '-'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1466:2: ( '*' )
                    {
                    // InternalAlf.g:1466:2: ( '*' )
                    // InternalAlf.g:1467:3: '*'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1472:2: ( '/' )
                    {
                    // InternalAlf.g:1472:2: ( '/' )
                    // InternalAlf.g:1473:3: '/'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1478:2: ( '^' )
                    {
                    // InternalAlf.g:1478:2: ( '^' )
                    // InternalAlf.g:1479:3: '^'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_4()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalAlf.g:1488:1: rule__UnaryExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1492:1: ( ( rulePrimaryExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING_VALUE)||LA20_0==21||LA20_0==34||LA20_0==47||(LA20_0>=49 && LA20_0<=50)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=19 && LA20_0<=20)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlf.g:1493:2: ( rulePrimaryExpression )
                    {
                    // InternalAlf.g:1493:2: ( rulePrimaryExpression )
                    // InternalAlf.g:1494:3: rulePrimaryExpression
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
                    // InternalAlf.g:1499:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1499:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // InternalAlf.g:1500:3: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1501:3: ( rule__UnaryExpression__Group_1__0 )
                    // InternalAlf.g:1501:4: rule__UnaryExpression__Group_1__0
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
    // InternalAlf.g:1509:1: rule__UnaryOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1513:1: ( ( '+' ) | ( '-' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            else if ( (LA21_0==20) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:1514:2: ( '+' )
                    {
                    // InternalAlf.g:1514:2: ( '+' )
                    // InternalAlf.g:1515:3: '+'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1520:2: ( '-' )
                    {
                    // InternalAlf.g:1520:2: ( '-' )
                    // InternalAlf.g:1521:3: '-'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalAlf.g:1530:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1534:1: ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) )
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1535:2: ( ruleLiteralExpression )
                    {
                    // InternalAlf.g:1535:2: ( ruleLiteralExpression )
                    // InternalAlf.g:1536:3: ruleLiteralExpression
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
                    // InternalAlf.g:1541:2: ( ruleElementReferenceExpression )
                    {
                    // InternalAlf.g:1541:2: ( ruleElementReferenceExpression )
                    // InternalAlf.g:1542:3: ruleElementReferenceExpression
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
                    // InternalAlf.g:1547:2: ( ruleInstanceCreationExpression )
                    {
                    // InternalAlf.g:1547:2: ( ruleInstanceCreationExpression )
                    // InternalAlf.g:1548:3: ruleInstanceCreationExpression
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
                    // InternalAlf.g:1553:2: ( ruleSequenceConstructionExpression )
                    {
                    // InternalAlf.g:1553:2: ( ruleSequenceConstructionExpression )
                    // InternalAlf.g:1554:3: ruleSequenceConstructionExpression
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
                    // InternalAlf.g:1559:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalAlf.g:1559:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalAlf.g:1560:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalAlf.g:1561:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalAlf.g:1561:4: rule__PrimaryExpression__Group_4__0
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
    // InternalAlf.g:1569:1: rule__LiteralExpression__Alternatives : ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1573:1: ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt23=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt23=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt23=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA23_4 = input.LA(2);

                if ( (LA23_4==50) ) {
                    alt23=4;
                }
                else if ( (LA23_4==EOF||(LA23_4>=19 && LA23_4<=23)||(LA23_4>=35 && LA23_4<=36)||LA23_4==38||LA23_4==42||LA23_4==48||LA23_4==53) ) {
                    alt23=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 4, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                alt23=4;
                }
                break;
            case 21:
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
                    // InternalAlf.g:1574:2: ( ruleNullLiteralExpression )
                    {
                    // InternalAlf.g:1574:2: ( ruleNullLiteralExpression )
                    // InternalAlf.g:1575:3: ruleNullLiteralExpression
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
                    // InternalAlf.g:1580:2: ( ruleBooleanLiteralExpression )
                    {
                    // InternalAlf.g:1580:2: ( ruleBooleanLiteralExpression )
                    // InternalAlf.g:1581:3: ruleBooleanLiteralExpression
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
                    // InternalAlf.g:1586:2: ( ruleStringLiteralExpression )
                    {
                    // InternalAlf.g:1586:2: ( ruleStringLiteralExpression )
                    // InternalAlf.g:1587:3: ruleStringLiteralExpression
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
                    // InternalAlf.g:1592:2: ( ruleRealLiteralExpression )
                    {
                    // InternalAlf.g:1592:2: ( ruleRealLiteralExpression )
                    // InternalAlf.g:1593:3: ruleRealLiteralExpression
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
                    // InternalAlf.g:1598:2: ( ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1598:2: ( ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1599:3: ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:1608:1: rule__RealValue__Alternatives_0 : ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) );
    public final void rule__RealValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1612:1: ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_NATURAL_VALUE) ) {
                alt24=1;
            }
            else if ( (LA24_0==50) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1613:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    {
                    // InternalAlf.g:1613:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    // InternalAlf.g:1614:3: ( rule__RealValue__Group_0_0__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_0()); 
                    // InternalAlf.g:1615:3: ( rule__RealValue__Group_0_0__0 )
                    // InternalAlf.g:1615:4: rule__RealValue__Group_0_0__0
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
                    // InternalAlf.g:1619:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    {
                    // InternalAlf.g:1619:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    // InternalAlf.g:1620:3: ( rule__RealValue__Group_0_1__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_1()); 
                    // InternalAlf.g:1621:3: ( rule__RealValue__Group_0_1__0 )
                    // InternalAlf.g:1621:4: rule__RealValue__Group_0_1__0
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
    // InternalAlf.g:1629:1: rule__RealValue__Alternatives_1_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__RealValue__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1633:1: ( ( 'e' ) | ( 'E' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            else if ( (LA25_0==25) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:1634:2: ( 'e' )
                    {
                    // InternalAlf.g:1634:2: ( 'e' )
                    // InternalAlf.g:1635:3: 'e'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1640:2: ( 'E' )
                    {
                    // InternalAlf.g:1640:2: ( 'E' )
                    // InternalAlf.g:1641:3: 'E'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalAlf.g:1650:1: rule__RealValue__Alternatives_1_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__RealValue__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1654:1: ( ( '+' ) | ( '-' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            else if ( (LA26_0==20) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1655:2: ( '+' )
                    {
                    // InternalAlf.g:1655:2: ( '+' )
                    // InternalAlf.g:1656:3: '+'
                    {
                     before(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1661:2: ( '-' )
                    {
                    // InternalAlf.g:1661:2: ( '-' )
                    // InternalAlf.g:1662:3: '-'
                    {
                     before(grammarAccess.getRealValueAccess().getHyphenMinusKeyword_1_1_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalAlf.g:1671:1: rule__UnlimitedNaturalLiteralExpression__Alternatives : ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) );
    public final void rule__UnlimitedNaturalLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1675:1: ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NATURAL_VALUE) ) {
                alt27=1;
            }
            else if ( (LA27_0==21) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1676:2: ( ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1676:2: ( ruleNaturalLiteralExpression )
                    // InternalAlf.g:1677:3: ruleNaturalLiteralExpression
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
                    // InternalAlf.g:1682:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1682:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    // InternalAlf.g:1683:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1684:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    // InternalAlf.g:1684:4: rule__UnlimitedNaturalLiteralExpression__Group_1__0
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
    // InternalAlf.g:1692:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1696:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_UNRESTRICTED_NAME) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1697:2: ( RULE_ID )
                    {
                    // InternalAlf.g:1697:2: ( RULE_ID )
                    // InternalAlf.g:1698:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1703:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:1703:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:1704:3: RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:1713:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1717:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt29=1;
                }
                break;
            case 27:
                {
                alt29=2;
                }
                break;
            case 28:
                {
                alt29=3;
                }
                break;
            case 29:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1718:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:1718:2: ( ( 'public' ) )
                    // InternalAlf.g:1719:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:1720:3: ( 'public' )
                    // InternalAlf.g:1720:4: 'public'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1724:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:1724:2: ( ( 'private' ) )
                    // InternalAlf.g:1725:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:1726:3: ( 'private' )
                    // InternalAlf.g:1726:4: 'private'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1730:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:1730:2: ( ( 'protected' ) )
                    // InternalAlf.g:1731:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:1732:3: ( 'protected' )
                    // InternalAlf.g:1732:4: 'protected'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1736:2: ( ( 'packaged' ) )
                    {
                    // InternalAlf.g:1736:2: ( ( 'packaged' ) )
                    // InternalAlf.g:1737:3: ( 'packaged' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3()); 
                    // InternalAlf.g:1738:3: ( 'packaged' )
                    // InternalAlf.g:1738:4: 'packaged'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalAlf.g:1746:1: rule__FeatureDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) );
    public final void rule__FeatureDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1750:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt30=1;
                }
                break;
            case 31:
                {
                alt30=2;
                }
                break;
            case 32:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1751:2: ( ( 'in' ) )
                    {
                    // InternalAlf.g:1751:2: ( ( 'in' ) )
                    // InternalAlf.g:1752:3: ( 'in' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:1753:3: ( 'in' )
                    // InternalAlf.g:1753:4: 'in'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1757:2: ( ( 'out' ) )
                    {
                    // InternalAlf.g:1757:2: ( ( 'out' ) )
                    // InternalAlf.g:1758:3: ( 'out' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:1759:3: ( 'out' )
                    // InternalAlf.g:1759:4: 'out'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1763:2: ( ( 'inout' ) )
                    {
                    // InternalAlf.g:1763:2: ( ( 'inout' ) )
                    // InternalAlf.g:1764:3: ( 'inout' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:1765:3: ( 'inout' )
                    // InternalAlf.g:1765:4: 'inout'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalAlf.g:1773:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1777:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:1778:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
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
    // InternalAlf.g:1785:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1789:1: ( ( 'package' ) )
            // InternalAlf.g:1790:1: ( 'package' )
            {
            // InternalAlf.g:1790:1: ( 'package' )
            // InternalAlf.g:1791:2: 'package'
            {
             before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAlf.g:1800:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1804:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:1805:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
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
    // InternalAlf.g:1812:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1816:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:1817:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:1817:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:1818:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:1819:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:1819:3: rule__PackageDefinition__NameAssignment_1
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
    // InternalAlf.g:1827:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1831:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:1832:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
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
    // InternalAlf.g:1839:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1843:1: ( ( '{' ) )
            // InternalAlf.g:1844:1: ( '{' )
            {
            // InternalAlf.g:1844:1: ( '{' )
            // InternalAlf.g:1845:2: '{'
            {
             before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAlf.g:1854:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1858:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:1859:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
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
    // InternalAlf.g:1866:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1870:1: ( ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* ) )
            // InternalAlf.g:1871:1: ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* )
            {
            // InternalAlf.g:1871:1: ( ( rule__PackageDefinition__OwnedMembershipAssignment_3 )* )
            // InternalAlf.g:1872:2: ( rule__PackageDefinition__OwnedMembershipAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipAssignment_3()); 
            // InternalAlf.g:1873:2: ( rule__PackageDefinition__OwnedMembershipAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_UNRESTRICTED_NAME)||LA31_0==15||(LA31_0>=17 && LA31_0<=18)||(LA31_0>=26 && LA31_0<=29)||LA31_0==33||LA31_0==37||LA31_0==45||LA31_0==51) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAlf.g:1873:3: rule__PackageDefinition__OwnedMembershipAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__OwnedMembershipAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalAlf.g:1881:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1885:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:1886:2: rule__PackageDefinition__Group__4__Impl
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
    // InternalAlf.g:1892:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1896:1: ( ( '}' ) )
            // InternalAlf.g:1897:1: ( '}' )
            {
            // InternalAlf.g:1897:1: ( '}' )
            // InternalAlf.g:1898:2: '}'
            {
             before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAlf.g:1908:1: rule__NonFeatureMember__Group__0 : rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1 ;
    public final void rule__NonFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1912:1: ( rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1 )
            // InternalAlf.g:1913:2: rule__NonFeatureMember__Group__0__Impl rule__NonFeatureMember__Group__1
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
    // InternalAlf.g:1920:1: rule__NonFeatureMember__Group__0__Impl : ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__NonFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1924:1: ( ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:1925:1: ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:1925:1: ( ( rule__NonFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:1926:2: ( rule__NonFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:1927:2: ( rule__NonFeatureMember__VisibilityAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=26 && LA32_0<=29)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1927:3: rule__NonFeatureMember__VisibilityAssignment_0
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
    // InternalAlf.g:1935:1: rule__NonFeatureMember__Group__1 : rule__NonFeatureMember__Group__1__Impl ;
    public final void rule__NonFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1939:1: ( rule__NonFeatureMember__Group__1__Impl )
            // InternalAlf.g:1940:2: rule__NonFeatureMember__Group__1__Impl
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
    // InternalAlf.g:1946:1: rule__NonFeatureMember__Group__1__Impl : ( ( rule__NonFeatureMember__Alternatives_1 ) ) ;
    public final void rule__NonFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1950:1: ( ( ( rule__NonFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:1951:1: ( ( rule__NonFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:1951:1: ( ( rule__NonFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:1952:2: ( rule__NonFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:1953:2: ( rule__NonFeatureMember__Alternatives_1 )
            // InternalAlf.g:1953:3: rule__NonFeatureMember__Alternatives_1
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
    // InternalAlf.g:1962:1: rule__NonFeatureMember__Group_1_1__0 : rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1 ;
    public final void rule__NonFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1966:1: ( rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1 )
            // InternalAlf.g:1967:2: rule__NonFeatureMember__Group_1_1__0__Impl rule__NonFeatureMember__Group_1_1__1
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
    // InternalAlf.g:1974:1: rule__NonFeatureMember__Group_1_1__0__Impl : ( 'package' ) ;
    public final void rule__NonFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1978:1: ( ( 'package' ) )
            // InternalAlf.g:1979:1: ( 'package' )
            {
            // InternalAlf.g:1979:1: ( 'package' )
            // InternalAlf.g:1980:2: 'package'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getPackageKeyword_1_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNonFeatureMemberAccess().getPackageKeyword_1_1_0()); 

            }


            }

        }
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
    // InternalAlf.g:1989:1: rule__NonFeatureMember__Group_1_1__1 : rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2 ;
    public final void rule__NonFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1993:1: ( rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2 )
            // InternalAlf.g:1994:2: rule__NonFeatureMember__Group_1_1__1__Impl rule__NonFeatureMember__Group_1_1__2
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
    // InternalAlf.g:2001:1: rule__NonFeatureMember__Group_1_1__1__Impl : ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? ) ;
    public final void rule__NonFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2005:1: ( ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? ) )
            // InternalAlf.g:2006:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? )
            {
            // InternalAlf.g:2006:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )? )
            // InternalAlf.g:2007:2: ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberNameAssignment_1_1_1()); 
            // InternalAlf.g:2008:2: ( rule__NonFeatureMember__MemberNameAssignment_1_1_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlf.g:2008:3: rule__NonFeatureMember__MemberNameAssignment_1_1_1
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
    // InternalAlf.g:2016:1: rule__NonFeatureMember__Group_1_1__2 : rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3 ;
    public final void rule__NonFeatureMember__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2020:1: ( rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3 )
            // InternalAlf.g:2021:2: rule__NonFeatureMember__Group_1_1__2__Impl rule__NonFeatureMember__Group_1_1__3
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
    // InternalAlf.g:2028:1: rule__NonFeatureMember__Group_1_1__2__Impl : ( 'is' ) ;
    public final void rule__NonFeatureMember__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2032:1: ( ( 'is' ) )
            // InternalAlf.g:2033:1: ( 'is' )
            {
            // InternalAlf.g:2033:1: ( 'is' )
            // InternalAlf.g:2034:2: 'is'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getIsKeyword_1_1_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAlf.g:2043:1: rule__NonFeatureMember__Group_1_1__3 : rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4 ;
    public final void rule__NonFeatureMember__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2047:1: ( rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4 )
            // InternalAlf.g:2048:2: rule__NonFeatureMember__Group_1_1__3__Impl rule__NonFeatureMember__Group_1_1__4
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
    // InternalAlf.g:2055:1: rule__NonFeatureMember__Group_1_1__3__Impl : ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) ) ;
    public final void rule__NonFeatureMember__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2059:1: ( ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) ) )
            // InternalAlf.g:2060:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) )
            {
            // InternalAlf.g:2060:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 ) )
            // InternalAlf.g:2061:2: ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementAssignment_1_1_3()); 
            // InternalAlf.g:2062:2: ( rule__NonFeatureMember__MemberElementAssignment_1_1_3 )
            // InternalAlf.g:2062:3: rule__NonFeatureMember__MemberElementAssignment_1_1_3
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
    // InternalAlf.g:2070:1: rule__NonFeatureMember__Group_1_1__4 : rule__NonFeatureMember__Group_1_1__4__Impl ;
    public final void rule__NonFeatureMember__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2074:1: ( rule__NonFeatureMember__Group_1_1__4__Impl )
            // InternalAlf.g:2075:2: rule__NonFeatureMember__Group_1_1__4__Impl
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
    // InternalAlf.g:2081:1: rule__NonFeatureMember__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__NonFeatureMember__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2085:1: ( ( ';' ) )
            // InternalAlf.g:2086:1: ( ';' )
            {
            // InternalAlf.g:2086:1: ( ';' )
            // InternalAlf.g:2087:2: ';'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_1_4()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__0"
    // InternalAlf.g:2097:1: rule__NonFeatureMember__Group_1_2__0 : rule__NonFeatureMember__Group_1_2__0__Impl rule__NonFeatureMember__Group_1_2__1 ;
    public final void rule__NonFeatureMember__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2101:1: ( rule__NonFeatureMember__Group_1_2__0__Impl rule__NonFeatureMember__Group_1_2__1 )
            // InternalAlf.g:2102:2: rule__NonFeatureMember__Group_1_2__0__Impl rule__NonFeatureMember__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__NonFeatureMember__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__0"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__0__Impl"
    // InternalAlf.g:2109:1: rule__NonFeatureMember__Group_1_2__0__Impl : ( 'class' ) ;
    public final void rule__NonFeatureMember__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2113:1: ( ( 'class' ) )
            // InternalAlf.g:2114:1: ( 'class' )
            {
            // InternalAlf.g:2114:1: ( 'class' )
            // InternalAlf.g:2115:2: 'class'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getClassKeyword_1_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNonFeatureMemberAccess().getClassKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__0__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__1"
    // InternalAlf.g:2124:1: rule__NonFeatureMember__Group_1_2__1 : rule__NonFeatureMember__Group_1_2__1__Impl rule__NonFeatureMember__Group_1_2__2 ;
    public final void rule__NonFeatureMember__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2128:1: ( rule__NonFeatureMember__Group_1_2__1__Impl rule__NonFeatureMember__Group_1_2__2 )
            // InternalAlf.g:2129:2: rule__NonFeatureMember__Group_1_2__1__Impl rule__NonFeatureMember__Group_1_2__2
            {
            pushFollow(FOLLOW_8);
            rule__NonFeatureMember__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__1"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__1__Impl"
    // InternalAlf.g:2136:1: rule__NonFeatureMember__Group_1_2__1__Impl : ( ( rule__NonFeatureMember__MemberNameAssignment_1_2_1 )? ) ;
    public final void rule__NonFeatureMember__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2140:1: ( ( ( rule__NonFeatureMember__MemberNameAssignment_1_2_1 )? ) )
            // InternalAlf.g:2141:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_2_1 )? )
            {
            // InternalAlf.g:2141:1: ( ( rule__NonFeatureMember__MemberNameAssignment_1_2_1 )? )
            // InternalAlf.g:2142:2: ( rule__NonFeatureMember__MemberNameAssignment_1_2_1 )?
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberNameAssignment_1_2_1()); 
            // InternalAlf.g:2143:2: ( rule__NonFeatureMember__MemberNameAssignment_1_2_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlf.g:2143:3: rule__NonFeatureMember__MemberNameAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFeatureMember__MemberNameAssignment_1_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonFeatureMemberAccess().getMemberNameAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__1__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__2"
    // InternalAlf.g:2151:1: rule__NonFeatureMember__Group_1_2__2 : rule__NonFeatureMember__Group_1_2__2__Impl rule__NonFeatureMember__Group_1_2__3 ;
    public final void rule__NonFeatureMember__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2155:1: ( rule__NonFeatureMember__Group_1_2__2__Impl rule__NonFeatureMember__Group_1_2__3 )
            // InternalAlf.g:2156:2: rule__NonFeatureMember__Group_1_2__2__Impl rule__NonFeatureMember__Group_1_2__3
            {
            pushFollow(FOLLOW_3);
            rule__NonFeatureMember__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__2"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__2__Impl"
    // InternalAlf.g:2163:1: rule__NonFeatureMember__Group_1_2__2__Impl : ( 'is' ) ;
    public final void rule__NonFeatureMember__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2167:1: ( ( 'is' ) )
            // InternalAlf.g:2168:1: ( 'is' )
            {
            // InternalAlf.g:2168:1: ( 'is' )
            // InternalAlf.g:2169:2: 'is'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getIsKeyword_1_2_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNonFeatureMemberAccess().getIsKeyword_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__2__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__3"
    // InternalAlf.g:2178:1: rule__NonFeatureMember__Group_1_2__3 : rule__NonFeatureMember__Group_1_2__3__Impl rule__NonFeatureMember__Group_1_2__4 ;
    public final void rule__NonFeatureMember__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2182:1: ( rule__NonFeatureMember__Group_1_2__3__Impl rule__NonFeatureMember__Group_1_2__4 )
            // InternalAlf.g:2183:2: rule__NonFeatureMember__Group_1_2__3__Impl rule__NonFeatureMember__Group_1_2__4
            {
            pushFollow(FOLLOW_9);
            rule__NonFeatureMember__Group_1_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__3"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__3__Impl"
    // InternalAlf.g:2190:1: rule__NonFeatureMember__Group_1_2__3__Impl : ( ( rule__NonFeatureMember__MemberElementAssignment_1_2_3 ) ) ;
    public final void rule__NonFeatureMember__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2194:1: ( ( ( rule__NonFeatureMember__MemberElementAssignment_1_2_3 ) ) )
            // InternalAlf.g:2195:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_2_3 ) )
            {
            // InternalAlf.g:2195:1: ( ( rule__NonFeatureMember__MemberElementAssignment_1_2_3 ) )
            // InternalAlf.g:2196:2: ( rule__NonFeatureMember__MemberElementAssignment_1_2_3 )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementAssignment_1_2_3()); 
            // InternalAlf.g:2197:2: ( rule__NonFeatureMember__MemberElementAssignment_1_2_3 )
            // InternalAlf.g:2197:3: rule__NonFeatureMember__MemberElementAssignment_1_2_3
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__MemberElementAssignment_1_2_3();

            state._fsp--;


            }

             after(grammarAccess.getNonFeatureMemberAccess().getMemberElementAssignment_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__3__Impl"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__4"
    // InternalAlf.g:2205:1: rule__NonFeatureMember__Group_1_2__4 : rule__NonFeatureMember__Group_1_2__4__Impl ;
    public final void rule__NonFeatureMember__Group_1_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2209:1: ( rule__NonFeatureMember__Group_1_2__4__Impl )
            // InternalAlf.g:2210:2: rule__NonFeatureMember__Group_1_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFeatureMember__Group_1_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__4"


    // $ANTLR start "rule__NonFeatureMember__Group_1_2__4__Impl"
    // InternalAlf.g:2216:1: rule__NonFeatureMember__Group_1_2__4__Impl : ( ';' ) ;
    public final void rule__NonFeatureMember__Group_1_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2220:1: ( ( ';' ) )
            // InternalAlf.g:2221:1: ( ';' )
            {
            // InternalAlf.g:2221:1: ( ';' )
            // InternalAlf.g:2222:2: ';'
            {
             before(grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_2_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_1_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__Group_1_2__4__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group__0"
    // InternalAlf.g:2232:1: rule__PackagedFeatureMember__Group__0 : rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1 ;
    public final void rule__PackagedFeatureMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2236:1: ( rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1 )
            // InternalAlf.g:2237:2: rule__PackagedFeatureMember__Group__0__Impl rule__PackagedFeatureMember__Group__1
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
    // InternalAlf.g:2244:1: rule__PackagedFeatureMember__Group__0__Impl : ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? ) ;
    public final void rule__PackagedFeatureMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2248:1: ( ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:2249:1: ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:2249:1: ( ( rule__PackagedFeatureMember__VisibilityAssignment_0 )? )
            // InternalAlf.g:2250:2: ( rule__PackagedFeatureMember__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:2251:2: ( rule__PackagedFeatureMember__VisibilityAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=26 && LA35_0<=29)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlf.g:2251:3: rule__PackagedFeatureMember__VisibilityAssignment_0
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
    // InternalAlf.g:2259:1: rule__PackagedFeatureMember__Group__1 : rule__PackagedFeatureMember__Group__1__Impl ;
    public final void rule__PackagedFeatureMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2263:1: ( rule__PackagedFeatureMember__Group__1__Impl )
            // InternalAlf.g:2264:2: rule__PackagedFeatureMember__Group__1__Impl
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
    // InternalAlf.g:2270:1: rule__PackagedFeatureMember__Group__1__Impl : ( ( rule__PackagedFeatureMember__Alternatives_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2274:1: ( ( ( rule__PackagedFeatureMember__Alternatives_1 ) ) )
            // InternalAlf.g:2275:1: ( ( rule__PackagedFeatureMember__Alternatives_1 ) )
            {
            // InternalAlf.g:2275:1: ( ( rule__PackagedFeatureMember__Alternatives_1 ) )
            // InternalAlf.g:2276:2: ( rule__PackagedFeatureMember__Alternatives_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1()); 
            // InternalAlf.g:2277:2: ( rule__PackagedFeatureMember__Alternatives_1 )
            // InternalAlf.g:2277:3: rule__PackagedFeatureMember__Alternatives_1
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
    // InternalAlf.g:2286:1: rule__PackagedFeatureMember__Group_1_0__0 : rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1 ;
    public final void rule__PackagedFeatureMember__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2290:1: ( rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1 )
            // InternalAlf.g:2291:2: rule__PackagedFeatureMember__Group_1_0__0__Impl rule__PackagedFeatureMember__Group_1_0__1
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
    // InternalAlf.g:2298:1: rule__PackagedFeatureMember__Group_1_0__0__Impl : ( ( 'feature' )? ) ;
    public final void rule__PackagedFeatureMember__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2302:1: ( ( ( 'feature' )? ) )
            // InternalAlf.g:2303:1: ( ( 'feature' )? )
            {
            // InternalAlf.g:2303:1: ( ( 'feature' )? )
            // InternalAlf.g:2304:2: ( 'feature' )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0()); 
            // InternalAlf.g:2305:2: ( 'feature' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:2305:3: 'feature'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalAlf.g:2313:1: rule__PackagedFeatureMember__Group_1_0__1 : rule__PackagedFeatureMember__Group_1_0__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2317:1: ( rule__PackagedFeatureMember__Group_1_0__1__Impl )
            // InternalAlf.g:2318:2: rule__PackagedFeatureMember__Group_1_0__1__Impl
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
    // InternalAlf.g:2324:1: rule__PackagedFeatureMember__Group_1_0__1__Impl : ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2328:1: ( ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) ) )
            // InternalAlf.g:2329:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            {
            // InternalAlf.g:2329:1: ( ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 ) )
            // InternalAlf.g:2330:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementAssignment_1_0_1()); 
            // InternalAlf.g:2331:2: ( rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 )
            // InternalAlf.g:2331:3: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1
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
    // InternalAlf.g:2340:1: rule__PackagedFeatureMember__Group_1_1__0 : rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1 ;
    public final void rule__PackagedFeatureMember__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2344:1: ( rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1 )
            // InternalAlf.g:2345:2: rule__PackagedFeatureMember__Group_1_1__0__Impl rule__PackagedFeatureMember__Group_1_1__1
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
    // InternalAlf.g:2352:1: rule__PackagedFeatureMember__Group_1_1__0__Impl : ( ( rule__PackagedFeatureMember__Alternatives_1_1_0 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2356:1: ( ( ( rule__PackagedFeatureMember__Alternatives_1_1_0 ) ) )
            // InternalAlf.g:2357:1: ( ( rule__PackagedFeatureMember__Alternatives_1_1_0 ) )
            {
            // InternalAlf.g:2357:1: ( ( rule__PackagedFeatureMember__Alternatives_1_1_0 ) )
            // InternalAlf.g:2358:2: ( rule__PackagedFeatureMember__Alternatives_1_1_0 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1_1_0()); 
            // InternalAlf.g:2359:2: ( rule__PackagedFeatureMember__Alternatives_1_1_0 )
            // InternalAlf.g:2359:3: rule__PackagedFeatureMember__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Alternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getAlternatives_1_1_0()); 

            }


            }

        }
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
    // InternalAlf.g:2367:1: rule__PackagedFeatureMember__Group_1_1__1 : rule__PackagedFeatureMember__Group_1_1__1__Impl rule__PackagedFeatureMember__Group_1_1__2 ;
    public final void rule__PackagedFeatureMember__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2371:1: ( rule__PackagedFeatureMember__Group_1_1__1__Impl rule__PackagedFeatureMember__Group_1_1__2 )
            // InternalAlf.g:2372:2: rule__PackagedFeatureMember__Group_1_1__1__Impl rule__PackagedFeatureMember__Group_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__PackagedFeatureMember__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_1__2();

            state._fsp--;


            }

        }
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
    // InternalAlf.g:2379:1: rule__PackagedFeatureMember__Group_1_1__1__Impl : ( 'is' ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2383:1: ( ( 'is' ) )
            // InternalAlf.g:2384:1: ( 'is' )
            {
            // InternalAlf.g:2384:1: ( 'is' )
            // InternalAlf.g:2385:2: 'is'
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_1_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_1_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1__2"
    // InternalAlf.g:2394:1: rule__PackagedFeatureMember__Group_1_1__2 : rule__PackagedFeatureMember__Group_1_1__2__Impl rule__PackagedFeatureMember__Group_1_1__3 ;
    public final void rule__PackagedFeatureMember__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2398:1: ( rule__PackagedFeatureMember__Group_1_1__2__Impl rule__PackagedFeatureMember__Group_1_1__3 )
            // InternalAlf.g:2399:2: rule__PackagedFeatureMember__Group_1_1__2__Impl rule__PackagedFeatureMember__Group_1_1__3
            {
            pushFollow(FOLLOW_9);
            rule__PackagedFeatureMember__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1__2"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1__2__Impl"
    // InternalAlf.g:2406:1: rule__PackagedFeatureMember__Group_1_1__2__Impl : ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_1_2 ) ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2410:1: ( ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_1_2 ) ) )
            // InternalAlf.g:2411:1: ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_1_2 ) )
            {
            // InternalAlf.g:2411:1: ( ( rule__PackagedFeatureMember__MemberElementAssignment_1_1_2 ) )
            // InternalAlf.g:2412:2: ( rule__PackagedFeatureMember__MemberElementAssignment_1_1_2 )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementAssignment_1_1_2()); 
            // InternalAlf.g:2413:2: ( rule__PackagedFeatureMember__MemberElementAssignment_1_1_2 )
            // InternalAlf.g:2413:3: rule__PackagedFeatureMember__MemberElementAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__MemberElementAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1__2__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1__3"
    // InternalAlf.g:2421:1: rule__PackagedFeatureMember__Group_1_1__3 : rule__PackagedFeatureMember__Group_1_1__3__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2425:1: ( rule__PackagedFeatureMember__Group_1_1__3__Impl )
            // InternalAlf.g:2426:2: rule__PackagedFeatureMember__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1__3"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1__3__Impl"
    // InternalAlf.g:2432:1: rule__PackagedFeatureMember__Group_1_1__3__Impl : ( ';' ) ;
    public final void rule__PackagedFeatureMember__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2436:1: ( ( ';' ) )
            // InternalAlf.g:2437:1: ( ';' )
            {
            // InternalAlf.g:2437:1: ( ';' )
            // InternalAlf.g:2438:2: ';'
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_1_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1__3__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1_0_0__0"
    // InternalAlf.g:2448:1: rule__PackagedFeatureMember__Group_1_1_0_0__0 : rule__PackagedFeatureMember__Group_1_1_0_0__0__Impl rule__PackagedFeatureMember__Group_1_1_0_0__1 ;
    public final void rule__PackagedFeatureMember__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2452:1: ( rule__PackagedFeatureMember__Group_1_1_0_0__0__Impl rule__PackagedFeatureMember__Group_1_1_0_0__1 )
            // InternalAlf.g:2453:2: rule__PackagedFeatureMember__Group_1_1_0_0__0__Impl rule__PackagedFeatureMember__Group_1_1_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__PackagedFeatureMember__Group_1_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1_0_0__0"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1_0_0__0__Impl"
    // InternalAlf.g:2460:1: rule__PackagedFeatureMember__Group_1_1_0_0__0__Impl : ( 'feature' ) ;
    public final void rule__PackagedFeatureMember__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2464:1: ( ( 'feature' ) )
            // InternalAlf.g:2465:1: ( 'feature' )
            {
            // InternalAlf.g:2465:1: ( 'feature' )
            // InternalAlf.g:2466:2: 'feature'
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1_0_0__0__Impl"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1_0_0__1"
    // InternalAlf.g:2475:1: rule__PackagedFeatureMember__Group_1_1_0_0__1 : rule__PackagedFeatureMember__Group_1_1_0_0__1__Impl ;
    public final void rule__PackagedFeatureMember__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2479:1: ( rule__PackagedFeatureMember__Group_1_1_0_0__1__Impl )
            // InternalAlf.g:2480:2: rule__PackagedFeatureMember__Group_1_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackagedFeatureMember__Group_1_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1_0_0__1"


    // $ANTLR start "rule__PackagedFeatureMember__Group_1_1_0_0__1__Impl"
    // InternalAlf.g:2486:1: rule__PackagedFeatureMember__Group_1_1_0_0__1__Impl : ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1 )? ) ;
    public final void rule__PackagedFeatureMember__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2490:1: ( ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1 )? ) )
            // InternalAlf.g:2491:1: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1 )? )
            {
            // InternalAlf.g:2491:1: ( ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1 )? )
            // InternalAlf.g:2492:2: ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1 )?
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_1_0_0_1()); 
            // InternalAlf.g:2493:2: ( rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlf.g:2493:3: rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameAssignment_1_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__Group_1_1_0_0__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalAlf.g:2502:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2506:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:2507:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalAlf.g:2514:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2518:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:2519:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:2519:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:2520:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:2521:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:2521:3: rule__ClassDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:2529:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2533:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:2534:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalAlf.g:2541:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2545:1: ( ( 'class' ) )
            // InternalAlf.g:2546:1: ( 'class' )
            {
            // InternalAlf.g:2546:1: ( 'class' )
            // InternalAlf.g:2547:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAlf.g:2556:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2560:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:2561:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalAlf.g:2568:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2572:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:2573:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:2573:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:2574:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:2575:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:2575:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalAlf.g:2583:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2587:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:2588:2: rule__ClassDeclaration__Group__3__Impl
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
    // InternalAlf.g:2594:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2598:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:2599:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:2599:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:2600:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:2601:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=15 && LA39_0<=16)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:2601:3: rule__ClassDeclaration__Group_3__0
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
    // InternalAlf.g:2610:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2614:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:2615:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalAlf.g:2622:1: rule__ClassDeclaration__Group_3__0__Impl : ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2626:1: ( ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:2627:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:2627:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:2628:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:2629:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            // InternalAlf.g:2629:3: rule__ClassDeclaration__Alternatives_3_0
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
    // InternalAlf.g:2637:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2641:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalAlf.g:2642:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalAlf.g:2649:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2653:1: ( ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) ) )
            // InternalAlf.g:2654:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) )
            {
            // InternalAlf.g:2654:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 ) )
            // InternalAlf.g:2655:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_1()); 
            // InternalAlf.g:2656:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_1 )
            // InternalAlf.g:2656:3: rule__ClassDeclaration__OwnedMembershipAssignment_3_1
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
    // InternalAlf.g:2664:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2668:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalAlf.g:2669:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:2675:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2679:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:2680:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:2680:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:2681:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:2682:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==38) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAlf.g:2682:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalAlf.g:2691:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2695:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalAlf.g:2696:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalAlf.g:2703:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2707:1: ( ( ',' ) )
            // InternalAlf.g:2708:1: ( ',' )
            {
            // InternalAlf.g:2708:1: ( ',' )
            // InternalAlf.g:2709:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAlf.g:2718:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2722:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:2723:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:2729:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2733:1: ( ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) ) )
            // InternalAlf.g:2734:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            {
            // InternalAlf.g:2734:1: ( ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 ) )
            // InternalAlf.g:2735:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getOwnedMembershipAssignment_3_2_1()); 
            // InternalAlf.g:2736:2: ( rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 )
            // InternalAlf.g:2736:3: rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1
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
    // InternalAlf.g:2745:1: rule__ClassDefinition__Group__0 : rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 ;
    public final void rule__ClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2749:1: ( rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 )
            // InternalAlf.g:2750:2: rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1
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
    // InternalAlf.g:2757:1: rule__ClassDefinition__Group__0__Impl : ( ruleClassDeclaration ) ;
    public final void rule__ClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2761:1: ( ( ruleClassDeclaration ) )
            // InternalAlf.g:2762:1: ( ruleClassDeclaration )
            {
            // InternalAlf.g:2762:1: ( ruleClassDeclaration )
            // InternalAlf.g:2763:2: ruleClassDeclaration
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
    // InternalAlf.g:2772:1: rule__ClassDefinition__Group__1 : rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 ;
    public final void rule__ClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2776:1: ( rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 )
            // InternalAlf.g:2777:2: rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalAlf.g:2784:1: rule__ClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2788:1: ( ( '{' ) )
            // InternalAlf.g:2789:1: ( '{' )
            {
            // InternalAlf.g:2789:1: ( '{' )
            // InternalAlf.g:2790:2: '{'
            {
             before(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAlf.g:2799:1: rule__ClassDefinition__Group__2 : rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 ;
    public final void rule__ClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2803:1: ( rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 )
            // InternalAlf.g:2804:2: rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalAlf.g:2811:1: rule__ClassDefinition__Group__2__Impl : ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* ) ;
    public final void rule__ClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2815:1: ( ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* ) )
            // InternalAlf.g:2816:1: ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* )
            {
            // InternalAlf.g:2816:1: ( ( rule__ClassDefinition__OwnedMembershipAssignment_2 )* )
            // InternalAlf.g:2817:2: ( rule__ClassDefinition__OwnedMembershipAssignment_2 )*
            {
             before(grammarAccess.getClassDefinitionAccess().getOwnedMembershipAssignment_2()); 
            // InternalAlf.g:2818:2: ( rule__ClassDefinition__OwnedMembershipAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_UNRESTRICTED_NAME)||LA41_0==15||(LA41_0>=17 && LA41_0<=18)||(LA41_0>=26 && LA41_0<=29)||LA41_0==33||LA41_0==37||LA41_0==39||LA41_0==45||(LA41_0>=51 && LA41_0<=52)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAlf.g:2818:3: rule__ClassDefinition__OwnedMembershipAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ClassDefinition__OwnedMembershipAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalAlf.g:2826:1: rule__ClassDefinition__Group__3 : rule__ClassDefinition__Group__3__Impl ;
    public final void rule__ClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2830:1: ( rule__ClassDefinition__Group__3__Impl )
            // InternalAlf.g:2831:2: rule__ClassDefinition__Group__3__Impl
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
    // InternalAlf.g:2837:1: rule__ClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__ClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2841:1: ( ( '}' ) )
            // InternalAlf.g:2842:1: ( '}' )
            {
            // InternalAlf.g:2842:1: ( '}' )
            // InternalAlf.g:2843:2: '}'
            {
             before(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__ClassFeatureMember__Group_0__0"
    // InternalAlf.g:2853:1: rule__ClassFeatureMember__Group_0__0 : rule__ClassFeatureMember__Group_0__0__Impl rule__ClassFeatureMember__Group_0__1 ;
    public final void rule__ClassFeatureMember__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2857:1: ( rule__ClassFeatureMember__Group_0__0__Impl rule__ClassFeatureMember__Group_0__1 )
            // InternalAlf.g:2858:2: rule__ClassFeatureMember__Group_0__0__Impl rule__ClassFeatureMember__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__ClassFeatureMember__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_0__0__Impl"
    // InternalAlf.g:2865:1: rule__ClassFeatureMember__Group_0__0__Impl : ( ( rule__ClassFeatureMember__VisibilityAssignment_0_0 )? ) ;
    public final void rule__ClassFeatureMember__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2869:1: ( ( ( rule__ClassFeatureMember__VisibilityAssignment_0_0 )? ) )
            // InternalAlf.g:2870:1: ( ( rule__ClassFeatureMember__VisibilityAssignment_0_0 )? )
            {
            // InternalAlf.g:2870:1: ( ( rule__ClassFeatureMember__VisibilityAssignment_0_0 )? )
            // InternalAlf.g:2871:2: ( rule__ClassFeatureMember__VisibilityAssignment_0_0 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getVisibilityAssignment_0_0()); 
            // InternalAlf.g:2872:2: ( rule__ClassFeatureMember__VisibilityAssignment_0_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=26 && LA42_0<=29)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:2872:3: rule__ClassFeatureMember__VisibilityAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__VisibilityAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassFeatureMemberAccess().getVisibilityAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_0__1"
    // InternalAlf.g:2880:1: rule__ClassFeatureMember__Group_0__1 : rule__ClassFeatureMember__Group_0__1__Impl rule__ClassFeatureMember__Group_0__2 ;
    public final void rule__ClassFeatureMember__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2884:1: ( rule__ClassFeatureMember__Group_0__1__Impl rule__ClassFeatureMember__Group_0__2 )
            // InternalAlf.g:2885:2: rule__ClassFeatureMember__Group_0__1__Impl rule__ClassFeatureMember__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__ClassFeatureMember__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_0__1__Impl"
    // InternalAlf.g:2892:1: rule__ClassFeatureMember__Group_0__1__Impl : ( ( rule__ClassFeatureMember__Alternatives_0_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2896:1: ( ( ( rule__ClassFeatureMember__Alternatives_0_1 )? ) )
            // InternalAlf.g:2897:1: ( ( rule__ClassFeatureMember__Alternatives_0_1 )? )
            {
            // InternalAlf.g:2897:1: ( ( rule__ClassFeatureMember__Alternatives_0_1 )? )
            // InternalAlf.g:2898:2: ( rule__ClassFeatureMember__Alternatives_0_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_0_1()); 
            // InternalAlf.g:2899:2: ( rule__ClassFeatureMember__Alternatives_0_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==17||LA43_0==52) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlf.g:2899:3: rule__ClassFeatureMember__Alternatives_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__Alternatives_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassFeatureMemberAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_0__2"
    // InternalAlf.g:2907:1: rule__ClassFeatureMember__Group_0__2 : rule__ClassFeatureMember__Group_0__2__Impl ;
    public final void rule__ClassFeatureMember__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2911:1: ( rule__ClassFeatureMember__Group_0__2__Impl )
            // InternalAlf.g:2912:2: rule__ClassFeatureMember__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0__2"


    // $ANTLR start "rule__ClassFeatureMember__Group_0__2__Impl"
    // InternalAlf.g:2918:1: rule__ClassFeatureMember__Group_0__2__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2922:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2 ) ) )
            // InternalAlf.g:2923:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2 ) )
            {
            // InternalAlf.g:2923:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2 ) )
            // InternalAlf.g:2924:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_0_2()); 
            // InternalAlf.g:2925:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2 )
            // InternalAlf.g:2925:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0__2__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_0_1_1__0"
    // InternalAlf.g:2934:1: rule__ClassFeatureMember__Group_0_1_1__0 : rule__ClassFeatureMember__Group_0_1_1__0__Impl rule__ClassFeatureMember__Group_0_1_1__1 ;
    public final void rule__ClassFeatureMember__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2938:1: ( rule__ClassFeatureMember__Group_0_1_1__0__Impl rule__ClassFeatureMember__Group_0_1_1__1 )
            // InternalAlf.g:2939:2: rule__ClassFeatureMember__Group_0_1_1__0__Impl rule__ClassFeatureMember__Group_0_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ClassFeatureMember__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0_1_1__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_0_1_1__0__Impl"
    // InternalAlf.g:2946:1: rule__ClassFeatureMember__Group_0_1_1__0__Impl : ( ( rule__ClassFeatureMember__IsPortAssignment_0_1_1_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2950:1: ( ( ( rule__ClassFeatureMember__IsPortAssignment_0_1_1_0 ) ) )
            // InternalAlf.g:2951:1: ( ( rule__ClassFeatureMember__IsPortAssignment_0_1_1_0 ) )
            {
            // InternalAlf.g:2951:1: ( ( rule__ClassFeatureMember__IsPortAssignment_0_1_1_0 ) )
            // InternalAlf.g:2952:2: ( rule__ClassFeatureMember__IsPortAssignment_0_1_1_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_0_1_1_0()); 
            // InternalAlf.g:2953:2: ( rule__ClassFeatureMember__IsPortAssignment_0_1_1_0 )
            // InternalAlf.g:2953:3: rule__ClassFeatureMember__IsPortAssignment_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__IsPortAssignment_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsPortAssignment_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_0_1_1__1"
    // InternalAlf.g:2961:1: rule__ClassFeatureMember__Group_0_1_1__1 : rule__ClassFeatureMember__Group_0_1_1__1__Impl ;
    public final void rule__ClassFeatureMember__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2965:1: ( rule__ClassFeatureMember__Group_0_1_1__1__Impl )
            // InternalAlf.g:2966:2: rule__ClassFeatureMember__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0_1_1__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_0_1_1__1__Impl"
    // InternalAlf.g:2972:1: rule__ClassFeatureMember__Group_0_1_1__1__Impl : ( ( rule__ClassFeatureMember__DirectionAssignment_0_1_1_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2976:1: ( ( ( rule__ClassFeatureMember__DirectionAssignment_0_1_1_1 ) ) )
            // InternalAlf.g:2977:1: ( ( rule__ClassFeatureMember__DirectionAssignment_0_1_1_1 ) )
            {
            // InternalAlf.g:2977:1: ( ( rule__ClassFeatureMember__DirectionAssignment_0_1_1_1 ) )
            // InternalAlf.g:2978:2: ( rule__ClassFeatureMember__DirectionAssignment_0_1_1_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_0_1_1_1()); 
            // InternalAlf.g:2979:2: ( rule__ClassFeatureMember__DirectionAssignment_0_1_1_1 )
            // InternalAlf.g:2979:3: rule__ClassFeatureMember__DirectionAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__DirectionAssignment_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionAssignment_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1__0"
    // InternalAlf.g:2988:1: rule__ClassFeatureMember__Group_1__0 : rule__ClassFeatureMember__Group_1__0__Impl rule__ClassFeatureMember__Group_1__1 ;
    public final void rule__ClassFeatureMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2992:1: ( rule__ClassFeatureMember__Group_1__0__Impl rule__ClassFeatureMember__Group_1__1 )
            // InternalAlf.g:2993:2: rule__ClassFeatureMember__Group_1__0__Impl rule__ClassFeatureMember__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassFeatureMember__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_1__0__Impl"
    // InternalAlf.g:3000:1: rule__ClassFeatureMember__Group_1__0__Impl : ( 'connector' ) ;
    public final void rule__ClassFeatureMember__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3004:1: ( ( 'connector' ) )
            // InternalAlf.g:3005:1: ( 'connector' )
            {
            // InternalAlf.g:3005:1: ( 'connector' )
            // InternalAlf.g:3006:2: 'connector'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_1__1"
    // InternalAlf.g:3015:1: rule__ClassFeatureMember__Group_1__1 : rule__ClassFeatureMember__Group_1__1__Impl ;
    public final void rule__ClassFeatureMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3019:1: ( rule__ClassFeatureMember__Group_1__1__Impl )
            // InternalAlf.g:3020:2: rule__ClassFeatureMember__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_1__1__Impl"
    // InternalAlf.g:3026:1: rule__ClassFeatureMember__Group_1__1__Impl : ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1 ) ) ;
    public final void rule__ClassFeatureMember__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3030:1: ( ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1 ) ) )
            // InternalAlf.g:3031:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1 ) )
            {
            // InternalAlf.g:3031:1: ( ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1 ) )
            // InternalAlf.g:3032:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_1()); 
            // InternalAlf.g:3033:2: ( rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1 )
            // InternalAlf.g:3033:3: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_1__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_2__0"
    // InternalAlf.g:3042:1: rule__ClassFeatureMember__Group_2__0 : rule__ClassFeatureMember__Group_2__0__Impl rule__ClassFeatureMember__Group_2__1 ;
    public final void rule__ClassFeatureMember__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3046:1: ( rule__ClassFeatureMember__Group_2__0__Impl rule__ClassFeatureMember__Group_2__1 )
            // InternalAlf.g:3047:2: rule__ClassFeatureMember__Group_2__0__Impl rule__ClassFeatureMember__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__ClassFeatureMember__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_2__0__Impl"
    // InternalAlf.g:3054:1: rule__ClassFeatureMember__Group_2__0__Impl : ( ( rule__ClassFeatureMember__Alternatives_2_0 ) ) ;
    public final void rule__ClassFeatureMember__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3058:1: ( ( ( rule__ClassFeatureMember__Alternatives_2_0 ) ) )
            // InternalAlf.g:3059:1: ( ( rule__ClassFeatureMember__Alternatives_2_0 ) )
            {
            // InternalAlf.g:3059:1: ( ( rule__ClassFeatureMember__Alternatives_2_0 ) )
            // InternalAlf.g:3060:2: ( rule__ClassFeatureMember__Alternatives_2_0 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getAlternatives_2_0()); 
            // InternalAlf.g:3061:2: ( rule__ClassFeatureMember__Alternatives_2_0 )
            // InternalAlf.g:3061:3: rule__ClassFeatureMember__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_2__1"
    // InternalAlf.g:3069:1: rule__ClassFeatureMember__Group_2__1 : rule__ClassFeatureMember__Group_2__1__Impl rule__ClassFeatureMember__Group_2__2 ;
    public final void rule__ClassFeatureMember__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3073:1: ( rule__ClassFeatureMember__Group_2__1__Impl rule__ClassFeatureMember__Group_2__2 )
            // InternalAlf.g:3074:2: rule__ClassFeatureMember__Group_2__1__Impl rule__ClassFeatureMember__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassFeatureMember__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_2__1__Impl"
    // InternalAlf.g:3081:1: rule__ClassFeatureMember__Group_2__1__Impl : ( 'is' ) ;
    public final void rule__ClassFeatureMember__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3085:1: ( ( 'is' ) )
            // InternalAlf.g:3086:1: ( 'is' )
            {
            // InternalAlf.g:3086:1: ( 'is' )
            // InternalAlf.g:3087:2: 'is'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2__1__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_2__2"
    // InternalAlf.g:3096:1: rule__ClassFeatureMember__Group_2__2 : rule__ClassFeatureMember__Group_2__2__Impl rule__ClassFeatureMember__Group_2__3 ;
    public final void rule__ClassFeatureMember__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3100:1: ( rule__ClassFeatureMember__Group_2__2__Impl rule__ClassFeatureMember__Group_2__3 )
            // InternalAlf.g:3101:2: rule__ClassFeatureMember__Group_2__2__Impl rule__ClassFeatureMember__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__ClassFeatureMember__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2__2"


    // $ANTLR start "rule__ClassFeatureMember__Group_2__2__Impl"
    // InternalAlf.g:3108:1: rule__ClassFeatureMember__Group_2__2__Impl : ( ( rule__ClassFeatureMember__MemberElementAssignment_2_2 ) ) ;
    public final void rule__ClassFeatureMember__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3112:1: ( ( ( rule__ClassFeatureMember__MemberElementAssignment_2_2 ) ) )
            // InternalAlf.g:3113:1: ( ( rule__ClassFeatureMember__MemberElementAssignment_2_2 ) )
            {
            // InternalAlf.g:3113:1: ( ( rule__ClassFeatureMember__MemberElementAssignment_2_2 ) )
            // InternalAlf.g:3114:2: ( rule__ClassFeatureMember__MemberElementAssignment_2_2 )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementAssignment_2_2()); 
            // InternalAlf.g:3115:2: ( rule__ClassFeatureMember__MemberElementAssignment_2_2 )
            // InternalAlf.g:3115:3: rule__ClassFeatureMember__MemberElementAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__MemberElementAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getClassFeatureMemberAccess().getMemberElementAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2__2__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_2__3"
    // InternalAlf.g:3123:1: rule__ClassFeatureMember__Group_2__3 : rule__ClassFeatureMember__Group_2__3__Impl ;
    public final void rule__ClassFeatureMember__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3127:1: ( rule__ClassFeatureMember__Group_2__3__Impl )
            // InternalAlf.g:3128:2: rule__ClassFeatureMember__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2__3"


    // $ANTLR start "rule__ClassFeatureMember__Group_2__3__Impl"
    // InternalAlf.g:3134:1: rule__ClassFeatureMember__Group_2__3__Impl : ( ';' ) ;
    public final void rule__ClassFeatureMember__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3138:1: ( ( ';' ) )
            // InternalAlf.g:3139:1: ( ';' )
            {
            // InternalAlf.g:3139:1: ( ';' )
            // InternalAlf.g:3140:2: ';'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_2_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2__3__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_2_0_0__0"
    // InternalAlf.g:3150:1: rule__ClassFeatureMember__Group_2_0_0__0 : rule__ClassFeatureMember__Group_2_0_0__0__Impl rule__ClassFeatureMember__Group_2_0_0__1 ;
    public final void rule__ClassFeatureMember__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3154:1: ( rule__ClassFeatureMember__Group_2_0_0__0__Impl rule__ClassFeatureMember__Group_2_0_0__1 )
            // InternalAlf.g:3155:2: rule__ClassFeatureMember__Group_2_0_0__0__Impl rule__ClassFeatureMember__Group_2_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassFeatureMember__Group_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2_0_0__0"


    // $ANTLR start "rule__ClassFeatureMember__Group_2_0_0__0__Impl"
    // InternalAlf.g:3162:1: rule__ClassFeatureMember__Group_2_0_0__0__Impl : ( 'feature' ) ;
    public final void rule__ClassFeatureMember__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3166:1: ( ( 'feature' ) )
            // InternalAlf.g:3167:1: ( 'feature' )
            {
            // InternalAlf.g:3167:1: ( 'feature' )
            // InternalAlf.g:3168:2: 'feature'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_2_0_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__ClassFeatureMember__Group_2_0_0__1"
    // InternalAlf.g:3177:1: rule__ClassFeatureMember__Group_2_0_0__1 : rule__ClassFeatureMember__Group_2_0_0__1__Impl ;
    public final void rule__ClassFeatureMember__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3181:1: ( rule__ClassFeatureMember__Group_2_0_0__1__Impl )
            // InternalAlf.g:3182:2: rule__ClassFeatureMember__Group_2_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFeatureMember__Group_2_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2_0_0__1"


    // $ANTLR start "rule__ClassFeatureMember__Group_2_0_0__1__Impl"
    // InternalAlf.g:3188:1: rule__ClassFeatureMember__Group_2_0_0__1__Impl : ( ( rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1 )? ) ;
    public final void rule__ClassFeatureMember__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3192:1: ( ( ( rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1 )? ) )
            // InternalAlf.g:3193:1: ( ( rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1 )? )
            {
            // InternalAlf.g:3193:1: ( ( rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1 )? )
            // InternalAlf.g:3194:2: ( rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1 )?
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_2_0_0_1()); 
            // InternalAlf.g:3195:2: ( rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:3195:3: rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassFeatureMemberAccess().getMemberNameAssignment_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0__0"
    // InternalAlf.g:3204:1: rule__FeatureDefinition__Group_0__0 : rule__FeatureDefinition__Group_0__0__Impl rule__FeatureDefinition__Group_0__1 ;
    public final void rule__FeatureDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3208:1: ( rule__FeatureDefinition__Group_0__0__Impl rule__FeatureDefinition__Group_0__1 )
            // InternalAlf.g:3209:2: rule__FeatureDefinition__Group_0__0__Impl rule__FeatureDefinition__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__FeatureDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_0__0__Impl"
    // InternalAlf.g:3216:1: rule__FeatureDefinition__Group_0__0__Impl : ( ( rule__FeatureDefinition__NameAssignment_0_0 ) ) ;
    public final void rule__FeatureDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3220:1: ( ( ( rule__FeatureDefinition__NameAssignment_0_0 ) ) )
            // InternalAlf.g:3221:1: ( ( rule__FeatureDefinition__NameAssignment_0_0 ) )
            {
            // InternalAlf.g:3221:1: ( ( rule__FeatureDefinition__NameAssignment_0_0 ) )
            // InternalAlf.g:3222:2: ( rule__FeatureDefinition__NameAssignment_0_0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_0_0()); 
            // InternalAlf.g:3223:2: ( rule__FeatureDefinition__NameAssignment_0_0 )
            // InternalAlf.g:3223:3: rule__FeatureDefinition__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0__1"
    // InternalAlf.g:3231:1: rule__FeatureDefinition__Group_0__1 : rule__FeatureDefinition__Group_0__1__Impl rule__FeatureDefinition__Group_0__2 ;
    public final void rule__FeatureDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3235:1: ( rule__FeatureDefinition__Group_0__1__Impl rule__FeatureDefinition__Group_0__2 )
            // InternalAlf.g:3236:2: rule__FeatureDefinition__Group_0__1__Impl rule__FeatureDefinition__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__FeatureDefinition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_0__1__Impl"
    // InternalAlf.g:3243:1: rule__FeatureDefinition__Group_0__1__Impl : ( ( rule__FeatureDefinition__Group_0_1__0 )? ) ;
    public final void rule__FeatureDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3247:1: ( ( ( rule__FeatureDefinition__Group_0_1__0 )? ) )
            // InternalAlf.g:3248:1: ( ( rule__FeatureDefinition__Group_0_1__0 )? )
            {
            // InternalAlf.g:3248:1: ( ( rule__FeatureDefinition__Group_0_1__0 )? )
            // InternalAlf.g:3249:2: ( rule__FeatureDefinition__Group_0_1__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_0_1()); 
            // InternalAlf.g:3250:2: ( rule__FeatureDefinition__Group_0_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==40) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlf.g:3250:3: rule__FeatureDefinition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0__2"
    // InternalAlf.g:3258:1: rule__FeatureDefinition__Group_0__2 : rule__FeatureDefinition__Group_0__2__Impl rule__FeatureDefinition__Group_0__3 ;
    public final void rule__FeatureDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3262:1: ( rule__FeatureDefinition__Group_0__2__Impl rule__FeatureDefinition__Group_0__3 )
            // InternalAlf.g:3263:2: rule__FeatureDefinition__Group_0__2__Impl rule__FeatureDefinition__Group_0__3
            {
            pushFollow(FOLLOW_21);
            rule__FeatureDefinition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0__2"


    // $ANTLR start "rule__FeatureDefinition__Group_0__2__Impl"
    // InternalAlf.g:3270:1: rule__FeatureDefinition__Group_0__2__Impl : ( ( rule__FeatureDefinition__Group_0_2__0 )? ) ;
    public final void rule__FeatureDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3274:1: ( ( ( rule__FeatureDefinition__Group_0_2__0 )? ) )
            // InternalAlf.g:3275:1: ( ( rule__FeatureDefinition__Group_0_2__0 )? )
            {
            // InternalAlf.g:3275:1: ( ( rule__FeatureDefinition__Group_0_2__0 )? )
            // InternalAlf.g:3276:2: ( rule__FeatureDefinition__Group_0_2__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_0_2()); 
            // InternalAlf.g:3277:2: ( rule__FeatureDefinition__Group_0_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlf.g:3277:3: rule__FeatureDefinition__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0__3"
    // InternalAlf.g:3285:1: rule__FeatureDefinition__Group_0__3 : rule__FeatureDefinition__Group_0__3__Impl ;
    public final void rule__FeatureDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3289:1: ( rule__FeatureDefinition__Group_0__3__Impl )
            // InternalAlf.g:3290:2: rule__FeatureDefinition__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0__3"


    // $ANTLR start "rule__FeatureDefinition__Group_0__3__Impl"
    // InternalAlf.g:3296:1: rule__FeatureDefinition__Group_0__3__Impl : ( ( rule__FeatureDefinition__Alternatives_0_3 ) ) ;
    public final void rule__FeatureDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3300:1: ( ( ( rule__FeatureDefinition__Alternatives_0_3 ) ) )
            // InternalAlf.g:3301:1: ( ( rule__FeatureDefinition__Alternatives_0_3 ) )
            {
            // InternalAlf.g:3301:1: ( ( rule__FeatureDefinition__Alternatives_0_3 ) )
            // InternalAlf.g:3302:2: ( rule__FeatureDefinition__Alternatives_0_3 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getAlternatives_0_3()); 
            // InternalAlf.g:3303:2: ( rule__FeatureDefinition__Alternatives_0_3 )
            // InternalAlf.g:3303:3: rule__FeatureDefinition__Alternatives_0_3
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Alternatives_0_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getAlternatives_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_1__0"
    // InternalAlf.g:3312:1: rule__FeatureDefinition__Group_0_1__0 : rule__FeatureDefinition__Group_0_1__0__Impl rule__FeatureDefinition__Group_0_1__1 ;
    public final void rule__FeatureDefinition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3316:1: ( rule__FeatureDefinition__Group_0_1__0__Impl rule__FeatureDefinition__Group_0_1__1 )
            // InternalAlf.g:3317:2: rule__FeatureDefinition__Group_0_1__0__Impl rule__FeatureDefinition__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FeatureDefinition__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_0_1__0__Impl"
    // InternalAlf.g:3324:1: rule__FeatureDefinition__Group_0_1__0__Impl : ( ':' ) ;
    public final void rule__FeatureDefinition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3328:1: ( ( ':' ) )
            // InternalAlf.g:3329:1: ( ':' )
            {
            // InternalAlf.g:3329:1: ( ':' )
            // InternalAlf.g:3330:2: ':'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getColonKeyword_0_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getColonKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_1__1"
    // InternalAlf.g:3339:1: rule__FeatureDefinition__Group_0_1__1 : rule__FeatureDefinition__Group_0_1__1__Impl rule__FeatureDefinition__Group_0_1__2 ;
    public final void rule__FeatureDefinition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3343:1: ( rule__FeatureDefinition__Group_0_1__1__Impl rule__FeatureDefinition__Group_0_1__2 )
            // InternalAlf.g:3344:2: rule__FeatureDefinition__Group_0_1__1__Impl rule__FeatureDefinition__Group_0_1__2
            {
            pushFollow(FOLLOW_11);
            rule__FeatureDefinition__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_0_1__1__Impl"
    // InternalAlf.g:3351:1: rule__FeatureDefinition__Group_0_1__1__Impl : ( ( rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1 ) ) ;
    public final void rule__FeatureDefinition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3355:1: ( ( ( rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1 ) ) )
            // InternalAlf.g:3356:1: ( ( rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1 ) )
            {
            // InternalAlf.g:3356:1: ( ( rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1 ) )
            // InternalAlf.g:3357:2: ( rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeAssignment_0_1_1()); 
            // InternalAlf.g:3358:2: ( rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1 )
            // InternalAlf.g:3358:3: rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_1__2"
    // InternalAlf.g:3366:1: rule__FeatureDefinition__Group_0_1__2 : rule__FeatureDefinition__Group_0_1__2__Impl ;
    public final void rule__FeatureDefinition__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3370:1: ( rule__FeatureDefinition__Group_0_1__2__Impl )
            // InternalAlf.g:3371:2: rule__FeatureDefinition__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_1__2"


    // $ANTLR start "rule__FeatureDefinition__Group_0_1__2__Impl"
    // InternalAlf.g:3377:1: rule__FeatureDefinition__Group_0_1__2__Impl : ( ( rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2 )? ) ;
    public final void rule__FeatureDefinition__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3381:1: ( ( ( rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2 )? ) )
            // InternalAlf.g:3382:1: ( ( rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2 )? )
            {
            // InternalAlf.g:3382:1: ( ( rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2 )? )
            // InternalAlf.g:3383:2: ( rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipAssignment_0_1_2()); 
            // InternalAlf.g:3384:2: ( rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15||LA47_0==18||LA47_0==45) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:3384:3: rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_1__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2__0"
    // InternalAlf.g:3393:1: rule__FeatureDefinition__Group_0_2__0 : rule__FeatureDefinition__Group_0_2__0__Impl rule__FeatureDefinition__Group_0_2__1 ;
    public final void rule__FeatureDefinition__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3397:1: ( rule__FeatureDefinition__Group_0_2__0__Impl rule__FeatureDefinition__Group_0_2__1 )
            // InternalAlf.g:3398:2: rule__FeatureDefinition__Group_0_2__0__Impl rule__FeatureDefinition__Group_0_2__1
            {
            pushFollow(FOLLOW_22);
            rule__FeatureDefinition__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2__0"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2__0__Impl"
    // InternalAlf.g:3405:1: rule__FeatureDefinition__Group_0_2__0__Impl : ( '[' ) ;
    public final void rule__FeatureDefinition__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3409:1: ( ( '[' ) )
            // InternalAlf.g:3410:1: ( '[' )
            {
            // InternalAlf.g:3410:1: ( '[' )
            // InternalAlf.g:3411:2: '['
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_0_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2__1"
    // InternalAlf.g:3420:1: rule__FeatureDefinition__Group_0_2__1 : rule__FeatureDefinition__Group_0_2__1__Impl rule__FeatureDefinition__Group_0_2__2 ;
    public final void rule__FeatureDefinition__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3424:1: ( rule__FeatureDefinition__Group_0_2__1__Impl rule__FeatureDefinition__Group_0_2__2 )
            // InternalAlf.g:3425:2: rule__FeatureDefinition__Group_0_2__1__Impl rule__FeatureDefinition__Group_0_2__2
            {
            pushFollow(FOLLOW_22);
            rule__FeatureDefinition__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2__1"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2__1__Impl"
    // InternalAlf.g:3432:1: rule__FeatureDefinition__Group_0_2__1__Impl : ( ( rule__FeatureDefinition__Group_0_2_1__0 )? ) ;
    public final void rule__FeatureDefinition__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3436:1: ( ( ( rule__FeatureDefinition__Group_0_2_1__0 )? ) )
            // InternalAlf.g:3437:1: ( ( rule__FeatureDefinition__Group_0_2_1__0 )? )
            {
            // InternalAlf.g:3437:1: ( ( rule__FeatureDefinition__Group_0_2_1__0 )? )
            // InternalAlf.g:3438:2: ( rule__FeatureDefinition__Group_0_2_1__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_0_2_1()); 
            // InternalAlf.g:3439:2: ( rule__FeatureDefinition__Group_0_2_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_NATURAL_VALUE) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==43) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:3439:3: rule__FeatureDefinition__Group_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_0_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2__2"
    // InternalAlf.g:3447:1: rule__FeatureDefinition__Group_0_2__2 : rule__FeatureDefinition__Group_0_2__2__Impl rule__FeatureDefinition__Group_0_2__3 ;
    public final void rule__FeatureDefinition__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3451:1: ( rule__FeatureDefinition__Group_0_2__2__Impl rule__FeatureDefinition__Group_0_2__3 )
            // InternalAlf.g:3452:2: rule__FeatureDefinition__Group_0_2__2__Impl rule__FeatureDefinition__Group_0_2__3
            {
            pushFollow(FOLLOW_23);
            rule__FeatureDefinition__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2__2"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2__2__Impl"
    // InternalAlf.g:3459:1: rule__FeatureDefinition__Group_0_2__2__Impl : ( ( rule__FeatureDefinition__UpperAssignment_0_2_2 ) ) ;
    public final void rule__FeatureDefinition__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3463:1: ( ( ( rule__FeatureDefinition__UpperAssignment_0_2_2 ) ) )
            // InternalAlf.g:3464:1: ( ( rule__FeatureDefinition__UpperAssignment_0_2_2 ) )
            {
            // InternalAlf.g:3464:1: ( ( rule__FeatureDefinition__UpperAssignment_0_2_2 ) )
            // InternalAlf.g:3465:2: ( rule__FeatureDefinition__UpperAssignment_0_2_2 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_0_2_2()); 
            // InternalAlf.g:3466:2: ( rule__FeatureDefinition__UpperAssignment_0_2_2 )
            // InternalAlf.g:3466:3: rule__FeatureDefinition__UpperAssignment_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__UpperAssignment_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2__3"
    // InternalAlf.g:3474:1: rule__FeatureDefinition__Group_0_2__3 : rule__FeatureDefinition__Group_0_2__3__Impl ;
    public final void rule__FeatureDefinition__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3478:1: ( rule__FeatureDefinition__Group_0_2__3__Impl )
            // InternalAlf.g:3479:2: rule__FeatureDefinition__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2__3"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2__3__Impl"
    // InternalAlf.g:3485:1: rule__FeatureDefinition__Group_0_2__3__Impl : ( ']' ) ;
    public final void rule__FeatureDefinition__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3489:1: ( ( ']' ) )
            // InternalAlf.g:3490:1: ( ']' )
            {
            // InternalAlf.g:3490:1: ( ']' )
            // InternalAlf.g:3491:2: ']'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_0_2_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2_1__0"
    // InternalAlf.g:3501:1: rule__FeatureDefinition__Group_0_2_1__0 : rule__FeatureDefinition__Group_0_2_1__0__Impl rule__FeatureDefinition__Group_0_2_1__1 ;
    public final void rule__FeatureDefinition__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3505:1: ( rule__FeatureDefinition__Group_0_2_1__0__Impl rule__FeatureDefinition__Group_0_2_1__1 )
            // InternalAlf.g:3506:2: rule__FeatureDefinition__Group_0_2_1__0__Impl rule__FeatureDefinition__Group_0_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__FeatureDefinition__Group_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2_1__0__Impl"
    // InternalAlf.g:3513:1: rule__FeatureDefinition__Group_0_2_1__0__Impl : ( ( rule__FeatureDefinition__LowerAssignment_0_2_1_0 ) ) ;
    public final void rule__FeatureDefinition__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3517:1: ( ( ( rule__FeatureDefinition__LowerAssignment_0_2_1_0 ) ) )
            // InternalAlf.g:3518:1: ( ( rule__FeatureDefinition__LowerAssignment_0_2_1_0 ) )
            {
            // InternalAlf.g:3518:1: ( ( rule__FeatureDefinition__LowerAssignment_0_2_1_0 ) )
            // InternalAlf.g:3519:2: ( rule__FeatureDefinition__LowerAssignment_0_2_1_0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_0_2_1_0()); 
            // InternalAlf.g:3520:2: ( rule__FeatureDefinition__LowerAssignment_0_2_1_0 )
            // InternalAlf.g:3520:3: rule__FeatureDefinition__LowerAssignment_0_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__LowerAssignment_0_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2_1__1"
    // InternalAlf.g:3528:1: rule__FeatureDefinition__Group_0_2_1__1 : rule__FeatureDefinition__Group_0_2_1__1__Impl ;
    public final void rule__FeatureDefinition__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3532:1: ( rule__FeatureDefinition__Group_0_2_1__1__Impl )
            // InternalAlf.g:3533:2: rule__FeatureDefinition__Group_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_0_2_1__1__Impl"
    // InternalAlf.g:3539:1: rule__FeatureDefinition__Group_0_2_1__1__Impl : ( '..' ) ;
    public final void rule__FeatureDefinition__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3543:1: ( ( '..' ) )
            // InternalAlf.g:3544:1: ( '..' )
            {
            // InternalAlf.g:3544:1: ( '..' )
            // InternalAlf.g:3545:2: '..'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_0_2_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_2_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_0__0"
    // InternalAlf.g:3555:1: rule__FeatureDefinition__Group_0_3_0__0 : rule__FeatureDefinition__Group_0_3_0__0__Impl rule__FeatureDefinition__Group_0_3_0__1 ;
    public final void rule__FeatureDefinition__Group_0_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3559:1: ( rule__FeatureDefinition__Group_0_3_0__0__Impl rule__FeatureDefinition__Group_0_3_0__1 )
            // InternalAlf.g:3560:2: rule__FeatureDefinition__Group_0_3_0__0__Impl rule__FeatureDefinition__Group_0_3_0__1
            {
            pushFollow(FOLLOW_25);
            rule__FeatureDefinition__Group_0_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_0__0__Impl"
    // InternalAlf.g:3567:1: rule__FeatureDefinition__Group_0_3_0__0__Impl : ( ( rule__FeatureDefinition__Group_0_3_0_0__0 )? ) ;
    public final void rule__FeatureDefinition__Group_0_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3571:1: ( ( ( rule__FeatureDefinition__Group_0_3_0_0__0 )? ) )
            // InternalAlf.g:3572:1: ( ( rule__FeatureDefinition__Group_0_3_0_0__0 )? )
            {
            // InternalAlf.g:3572:1: ( ( rule__FeatureDefinition__Group_0_3_0_0__0 )? )
            // InternalAlf.g:3573:2: ( rule__FeatureDefinition__Group_0_3_0_0__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_0_3_0_0()); 
            // InternalAlf.g:3574:2: ( rule__FeatureDefinition__Group_0_3_0_0__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:3574:3: rule__FeatureDefinition__Group_0_3_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_0_3_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_0__1"
    // InternalAlf.g:3582:1: rule__FeatureDefinition__Group_0_3_0__1 : rule__FeatureDefinition__Group_0_3_0__1__Impl ;
    public final void rule__FeatureDefinition__Group_0_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3586:1: ( rule__FeatureDefinition__Group_0_3_0__1__Impl )
            // InternalAlf.g:3587:2: rule__FeatureDefinition__Group_0_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_0__1__Impl"
    // InternalAlf.g:3593:1: rule__FeatureDefinition__Group_0_3_0__1__Impl : ( ';' ) ;
    public final void rule__FeatureDefinition__Group_0_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3597:1: ( ( ';' ) )
            // InternalAlf.g:3598:1: ( ';' )
            {
            // InternalAlf.g:3598:1: ( ';' )
            // InternalAlf.g:3599:2: ';'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_0_3_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_0_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_0_0__0"
    // InternalAlf.g:3609:1: rule__FeatureDefinition__Group_0_3_0_0__0 : rule__FeatureDefinition__Group_0_3_0_0__0__Impl rule__FeatureDefinition__Group_0_3_0_0__1 ;
    public final void rule__FeatureDefinition__Group_0_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3613:1: ( rule__FeatureDefinition__Group_0_3_0_0__0__Impl rule__FeatureDefinition__Group_0_3_0_0__1 )
            // InternalAlf.g:3614:2: rule__FeatureDefinition__Group_0_3_0_0__0__Impl rule__FeatureDefinition__Group_0_3_0_0__1
            {
            pushFollow(FOLLOW_26);
            rule__FeatureDefinition__Group_0_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_3_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_0_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_0_0__0__Impl"
    // InternalAlf.g:3621:1: rule__FeatureDefinition__Group_0_3_0_0__0__Impl : ( '=' ) ;
    public final void rule__FeatureDefinition__Group_0_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3625:1: ( ( '=' ) )
            // InternalAlf.g:3626:1: ( '=' )
            {
            // InternalAlf.g:3626:1: ( '=' )
            // InternalAlf.g:3627:2: '='
            {
             before(grammarAccess.getFeatureDefinitionAccess().getEqualsSignKeyword_0_3_0_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getEqualsSignKeyword_0_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_0_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_0_0__1"
    // InternalAlf.g:3636:1: rule__FeatureDefinition__Group_0_3_0_0__1 : rule__FeatureDefinition__Group_0_3_0_0__1__Impl ;
    public final void rule__FeatureDefinition__Group_0_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3640:1: ( rule__FeatureDefinition__Group_0_3_0_0__1__Impl )
            // InternalAlf.g:3641:2: rule__FeatureDefinition__Group_0_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_3_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_0_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_0_0__1__Impl"
    // InternalAlf.g:3647:1: rule__FeatureDefinition__Group_0_3_0_0__1__Impl : ( ( rule__FeatureDefinition__ValueAssignment_0_3_0_0_1 ) ) ;
    public final void rule__FeatureDefinition__Group_0_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3651:1: ( ( ( rule__FeatureDefinition__ValueAssignment_0_3_0_0_1 ) ) )
            // InternalAlf.g:3652:1: ( ( rule__FeatureDefinition__ValueAssignment_0_3_0_0_1 ) )
            {
            // InternalAlf.g:3652:1: ( ( rule__FeatureDefinition__ValueAssignment_0_3_0_0_1 ) )
            // InternalAlf.g:3653:2: ( rule__FeatureDefinition__ValueAssignment_0_3_0_0_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getValueAssignment_0_3_0_0_1()); 
            // InternalAlf.g:3654:2: ( rule__FeatureDefinition__ValueAssignment_0_3_0_0_1 )
            // InternalAlf.g:3654:3: rule__FeatureDefinition__ValueAssignment_0_3_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__ValueAssignment_0_3_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getValueAssignment_0_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_0_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_1__0"
    // InternalAlf.g:3663:1: rule__FeatureDefinition__Group_0_3_1__0 : rule__FeatureDefinition__Group_0_3_1__0__Impl rule__FeatureDefinition__Group_0_3_1__1 ;
    public final void rule__FeatureDefinition__Group_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3667:1: ( rule__FeatureDefinition__Group_0_3_1__0__Impl rule__FeatureDefinition__Group_0_3_1__1 )
            // InternalAlf.g:3668:2: rule__FeatureDefinition__Group_0_3_1__0__Impl rule__FeatureDefinition__Group_0_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_0_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_1__0__Impl"
    // InternalAlf.g:3675:1: rule__FeatureDefinition__Group_0_3_1__0__Impl : ( '{' ) ;
    public final void rule__FeatureDefinition__Group_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3679:1: ( ( '{' ) )
            // InternalAlf.g:3680:1: ( '{' )
            {
            // InternalAlf.g:3680:1: ( '{' )
            // InternalAlf.g:3681:2: '{'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLeftCurlyBracketKeyword_0_3_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getLeftCurlyBracketKeyword_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_1__1"
    // InternalAlf.g:3690:1: rule__FeatureDefinition__Group_0_3_1__1 : rule__FeatureDefinition__Group_0_3_1__1__Impl rule__FeatureDefinition__Group_0_3_1__2 ;
    public final void rule__FeatureDefinition__Group_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3694:1: ( rule__FeatureDefinition__Group_0_3_1__1__Impl rule__FeatureDefinition__Group_0_3_1__2 )
            // InternalAlf.g:3695:2: rule__FeatureDefinition__Group_0_3_1__1__Impl rule__FeatureDefinition__Group_0_3_1__2
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_0_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_1__1__Impl"
    // InternalAlf.g:3702:1: rule__FeatureDefinition__Group_0_3_1__1__Impl : ( ( rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1 )* ) ;
    public final void rule__FeatureDefinition__Group_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3706:1: ( ( ( rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1 )* ) )
            // InternalAlf.g:3707:1: ( ( rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1 )* )
            {
            // InternalAlf.g:3707:1: ( ( rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1 )* )
            // InternalAlf.g:3708:2: ( rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1 )*
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipAssignment_0_3_1_1()); 
            // InternalAlf.g:3709:2: ( rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)||LA50_0==15||(LA50_0>=17 && LA50_0<=18)||(LA50_0>=26 && LA50_0<=29)||LA50_0==33||LA50_0==37||LA50_0==39||LA50_0==45||(LA50_0>=51 && LA50_0<=52)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAlf.g:3709:3: rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipAssignment_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_1__2"
    // InternalAlf.g:3717:1: rule__FeatureDefinition__Group_0_3_1__2 : rule__FeatureDefinition__Group_0_3_1__2__Impl ;
    public final void rule__FeatureDefinition__Group_0_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3721:1: ( rule__FeatureDefinition__Group_0_3_1__2__Impl )
            // InternalAlf.g:3722:2: rule__FeatureDefinition__Group_0_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_0_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_1__2"


    // $ANTLR start "rule__FeatureDefinition__Group_0_3_1__2__Impl"
    // InternalAlf.g:3728:1: rule__FeatureDefinition__Group_0_3_1__2__Impl : ( '}' ) ;
    public final void rule__FeatureDefinition__Group_0_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3732:1: ( ( '}' ) )
            // InternalAlf.g:3733:1: ( '}' )
            {
            // InternalAlf.g:3733:1: ( '}' )
            // InternalAlf.g:3734:2: '}'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRightCurlyBracketKeyword_0_3_1_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getRightCurlyBracketKeyword_0_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_0_3_1__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1__0"
    // InternalAlf.g:3744:1: rule__FeatureDefinition__Group_1__0 : rule__FeatureDefinition__Group_1__0__Impl rule__FeatureDefinition__Group_1__1 ;
    public final void rule__FeatureDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3748:1: ( rule__FeatureDefinition__Group_1__0__Impl rule__FeatureDefinition__Group_1__1 )
            // InternalAlf.g:3749:2: rule__FeatureDefinition__Group_1__0__Impl rule__FeatureDefinition__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__FeatureDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1__0__Impl"
    // InternalAlf.g:3756:1: rule__FeatureDefinition__Group_1__0__Impl : ( ( rule__FeatureDefinition__NameAssignment_1_0 )? ) ;
    public final void rule__FeatureDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3760:1: ( ( ( rule__FeatureDefinition__NameAssignment_1_0 )? ) )
            // InternalAlf.g:3761:1: ( ( rule__FeatureDefinition__NameAssignment_1_0 )? )
            {
            // InternalAlf.g:3761:1: ( ( rule__FeatureDefinition__NameAssignment_1_0 )? )
            // InternalAlf.g:3762:2: ( rule__FeatureDefinition__NameAssignment_1_0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1_0()); 
            // InternalAlf.g:3763:2: ( rule__FeatureDefinition__NameAssignment_1_0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:3763:3: rule__FeatureDefinition__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__NameAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1__1"
    // InternalAlf.g:3771:1: rule__FeatureDefinition__Group_1__1 : rule__FeatureDefinition__Group_1__1__Impl rule__FeatureDefinition__Group_1__2 ;
    public final void rule__FeatureDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3775:1: ( rule__FeatureDefinition__Group_1__1__Impl rule__FeatureDefinition__Group_1__2 )
            // InternalAlf.g:3776:2: rule__FeatureDefinition__Group_1__1__Impl rule__FeatureDefinition__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__FeatureDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1__1__Impl"
    // InternalAlf.g:3783:1: rule__FeatureDefinition__Group_1__1__Impl : ( ( rule__FeatureDefinition__OwnedMembershipAssignment_1_1 ) ) ;
    public final void rule__FeatureDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3787:1: ( ( ( rule__FeatureDefinition__OwnedMembershipAssignment_1_1 ) ) )
            // InternalAlf.g:3788:1: ( ( rule__FeatureDefinition__OwnedMembershipAssignment_1_1 ) )
            {
            // InternalAlf.g:3788:1: ( ( rule__FeatureDefinition__OwnedMembershipAssignment_1_1 ) )
            // InternalAlf.g:3789:2: ( rule__FeatureDefinition__OwnedMembershipAssignment_1_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipAssignment_1_1()); 
            // InternalAlf.g:3790:2: ( rule__FeatureDefinition__OwnedMembershipAssignment_1_1 )
            // InternalAlf.g:3790:3: rule__FeatureDefinition__OwnedMembershipAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__OwnedMembershipAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1__2"
    // InternalAlf.g:3798:1: rule__FeatureDefinition__Group_1__2 : rule__FeatureDefinition__Group_1__2__Impl ;
    public final void rule__FeatureDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3802:1: ( rule__FeatureDefinition__Group_1__2__Impl )
            // InternalAlf.g:3803:2: rule__FeatureDefinition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1__2__Impl"
    // InternalAlf.g:3809:1: rule__FeatureDefinition__Group_1__2__Impl : ( ( rule__FeatureDefinition__Alternatives_1_2 ) ) ;
    public final void rule__FeatureDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3813:1: ( ( ( rule__FeatureDefinition__Alternatives_1_2 ) ) )
            // InternalAlf.g:3814:1: ( ( rule__FeatureDefinition__Alternatives_1_2 ) )
            {
            // InternalAlf.g:3814:1: ( ( rule__FeatureDefinition__Alternatives_1_2 ) )
            // InternalAlf.g:3815:2: ( rule__FeatureDefinition__Alternatives_1_2 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1_2()); 
            // InternalAlf.g:3816:2: ( rule__FeatureDefinition__Alternatives_1_2 )
            // InternalAlf.g:3816:3: rule__FeatureDefinition__Alternatives_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Alternatives_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0__0"
    // InternalAlf.g:3825:1: rule__FeatureDefinition__Group_1_2_0__0 : rule__FeatureDefinition__Group_1_2_0__0__Impl rule__FeatureDefinition__Group_1_2_0__1 ;
    public final void rule__FeatureDefinition__Group_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3829:1: ( rule__FeatureDefinition__Group_1_2_0__0__Impl rule__FeatureDefinition__Group_1_2_0__1 )
            // InternalAlf.g:3830:2: rule__FeatureDefinition__Group_1_2_0__0__Impl rule__FeatureDefinition__Group_1_2_0__1
            {
            pushFollow(FOLLOW_27);
            rule__FeatureDefinition__Group_1_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0__0__Impl"
    // InternalAlf.g:3837:1: rule__FeatureDefinition__Group_1_2_0__0__Impl : ( ( rule__FeatureDefinition__Group_1_2_0_0__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3841:1: ( ( ( rule__FeatureDefinition__Group_1_2_0_0__0 )? ) )
            // InternalAlf.g:3842:1: ( ( rule__FeatureDefinition__Group_1_2_0_0__0 )? )
            {
            // InternalAlf.g:3842:1: ( ( rule__FeatureDefinition__Group_1_2_0_0__0 )? )
            // InternalAlf.g:3843:2: ( rule__FeatureDefinition__Group_1_2_0_0__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0_0()); 
            // InternalAlf.g:3844:2: ( rule__FeatureDefinition__Group_1_2_0_0__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:3844:3: rule__FeatureDefinition__Group_1_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_2_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0__1"
    // InternalAlf.g:3852:1: rule__FeatureDefinition__Group_1_2_0__1 : rule__FeatureDefinition__Group_1_2_0__1__Impl ;
    public final void rule__FeatureDefinition__Group_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3856:1: ( rule__FeatureDefinition__Group_1_2_0__1__Impl )
            // InternalAlf.g:3857:2: rule__FeatureDefinition__Group_1_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0__1__Impl"
    // InternalAlf.g:3863:1: rule__FeatureDefinition__Group_1_2_0__1__Impl : ( ( rule__FeatureDefinition__Alternatives_1_2_0_1 ) ) ;
    public final void rule__FeatureDefinition__Group_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3867:1: ( ( ( rule__FeatureDefinition__Alternatives_1_2_0_1 ) ) )
            // InternalAlf.g:3868:1: ( ( rule__FeatureDefinition__Alternatives_1_2_0_1 ) )
            {
            // InternalAlf.g:3868:1: ( ( rule__FeatureDefinition__Alternatives_1_2_0_1 ) )
            // InternalAlf.g:3869:2: ( rule__FeatureDefinition__Alternatives_1_2_0_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1_2_0_1()); 
            // InternalAlf.g:3870:2: ( rule__FeatureDefinition__Alternatives_1_2_0_1 )
            // InternalAlf.g:3870:3: rule__FeatureDefinition__Alternatives_1_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Alternatives_1_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getAlternatives_1_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0__0"
    // InternalAlf.g:3879:1: rule__FeatureDefinition__Group_1_2_0_0__0 : rule__FeatureDefinition__Group_1_2_0_0__0__Impl rule__FeatureDefinition__Group_1_2_0_0__1 ;
    public final void rule__FeatureDefinition__Group_1_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3883:1: ( rule__FeatureDefinition__Group_1_2_0_0__0__Impl rule__FeatureDefinition__Group_1_2_0_0__1 )
            // InternalAlf.g:3884:2: rule__FeatureDefinition__Group_1_2_0_0__0__Impl rule__FeatureDefinition__Group_1_2_0_0__1
            {
            pushFollow(FOLLOW_22);
            rule__FeatureDefinition__Group_1_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0__0__Impl"
    // InternalAlf.g:3891:1: rule__FeatureDefinition__Group_1_2_0_0__0__Impl : ( '[' ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3895:1: ( ( '[' ) )
            // InternalAlf.g:3896:1: ( '[' )
            {
            // InternalAlf.g:3896:1: ( '[' )
            // InternalAlf.g:3897:2: '['
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_2_0_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0__1"
    // InternalAlf.g:3906:1: rule__FeatureDefinition__Group_1_2_0_0__1 : rule__FeatureDefinition__Group_1_2_0_0__1__Impl rule__FeatureDefinition__Group_1_2_0_0__2 ;
    public final void rule__FeatureDefinition__Group_1_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3910:1: ( rule__FeatureDefinition__Group_1_2_0_0__1__Impl rule__FeatureDefinition__Group_1_2_0_0__2 )
            // InternalAlf.g:3911:2: rule__FeatureDefinition__Group_1_2_0_0__1__Impl rule__FeatureDefinition__Group_1_2_0_0__2
            {
            pushFollow(FOLLOW_22);
            rule__FeatureDefinition__Group_1_2_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0__1__Impl"
    // InternalAlf.g:3918:1: rule__FeatureDefinition__Group_1_2_0_0__1__Impl : ( ( rule__FeatureDefinition__Group_1_2_0_0_1__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3922:1: ( ( ( rule__FeatureDefinition__Group_1_2_0_0_1__0 )? ) )
            // InternalAlf.g:3923:1: ( ( rule__FeatureDefinition__Group_1_2_0_0_1__0 )? )
            {
            // InternalAlf.g:3923:1: ( ( rule__FeatureDefinition__Group_1_2_0_0_1__0 )? )
            // InternalAlf.g:3924:2: ( rule__FeatureDefinition__Group_1_2_0_0_1__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0_0_1()); 
            // InternalAlf.g:3925:2: ( rule__FeatureDefinition__Group_1_2_0_0_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_NATURAL_VALUE) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==43) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:3925:3: rule__FeatureDefinition__Group_1_2_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_2_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0__2"
    // InternalAlf.g:3933:1: rule__FeatureDefinition__Group_1_2_0_0__2 : rule__FeatureDefinition__Group_1_2_0_0__2__Impl rule__FeatureDefinition__Group_1_2_0_0__3 ;
    public final void rule__FeatureDefinition__Group_1_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3937:1: ( rule__FeatureDefinition__Group_1_2_0_0__2__Impl rule__FeatureDefinition__Group_1_2_0_0__3 )
            // InternalAlf.g:3938:2: rule__FeatureDefinition__Group_1_2_0_0__2__Impl rule__FeatureDefinition__Group_1_2_0_0__3
            {
            pushFollow(FOLLOW_23);
            rule__FeatureDefinition__Group_1_2_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0__2__Impl"
    // InternalAlf.g:3945:1: rule__FeatureDefinition__Group_1_2_0_0__2__Impl : ( ( rule__FeatureDefinition__UpperAssignment_1_2_0_0_2 ) ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3949:1: ( ( ( rule__FeatureDefinition__UpperAssignment_1_2_0_0_2 ) ) )
            // InternalAlf.g:3950:1: ( ( rule__FeatureDefinition__UpperAssignment_1_2_0_0_2 ) )
            {
            // InternalAlf.g:3950:1: ( ( rule__FeatureDefinition__UpperAssignment_1_2_0_0_2 ) )
            // InternalAlf.g:3951:2: ( rule__FeatureDefinition__UpperAssignment_1_2_0_0_2 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_2_0_0_2()); 
            // InternalAlf.g:3952:2: ( rule__FeatureDefinition__UpperAssignment_1_2_0_0_2 )
            // InternalAlf.g:3952:3: rule__FeatureDefinition__UpperAssignment_1_2_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__UpperAssignment_1_2_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_2_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0__3"
    // InternalAlf.g:3960:1: rule__FeatureDefinition__Group_1_2_0_0__3 : rule__FeatureDefinition__Group_1_2_0_0__3__Impl ;
    public final void rule__FeatureDefinition__Group_1_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3964:1: ( rule__FeatureDefinition__Group_1_2_0_0__3__Impl )
            // InternalAlf.g:3965:2: rule__FeatureDefinition__Group_1_2_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0__3"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0__3__Impl"
    // InternalAlf.g:3971:1: rule__FeatureDefinition__Group_1_2_0_0__3__Impl : ( ']' ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3975:1: ( ( ']' ) )
            // InternalAlf.g:3976:1: ( ']' )
            {
            // InternalAlf.g:3976:1: ( ']' )
            // InternalAlf.g:3977:2: ']'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_2_0_0_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_2_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0_1__0"
    // InternalAlf.g:3987:1: rule__FeatureDefinition__Group_1_2_0_0_1__0 : rule__FeatureDefinition__Group_1_2_0_0_1__0__Impl rule__FeatureDefinition__Group_1_2_0_0_1__1 ;
    public final void rule__FeatureDefinition__Group_1_2_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3991:1: ( rule__FeatureDefinition__Group_1_2_0_0_1__0__Impl rule__FeatureDefinition__Group_1_2_0_0_1__1 )
            // InternalAlf.g:3992:2: rule__FeatureDefinition__Group_1_2_0_0_1__0__Impl rule__FeatureDefinition__Group_1_2_0_0_1__1
            {
            pushFollow(FOLLOW_24);
            rule__FeatureDefinition__Group_1_2_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0_1__0__Impl"
    // InternalAlf.g:3999:1: rule__FeatureDefinition__Group_1_2_0_0_1__0__Impl : ( ( rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0 ) ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4003:1: ( ( ( rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0 ) ) )
            // InternalAlf.g:4004:1: ( ( rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0 ) )
            {
            // InternalAlf.g:4004:1: ( ( rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0 ) )
            // InternalAlf.g:4005:2: ( rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_2_0_0_1_0()); 
            // InternalAlf.g:4006:2: ( rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0 )
            // InternalAlf.g:4006:3: rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0_1__1"
    // InternalAlf.g:4014:1: rule__FeatureDefinition__Group_1_2_0_0_1__1 : rule__FeatureDefinition__Group_1_2_0_0_1__1__Impl ;
    public final void rule__FeatureDefinition__Group_1_2_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4018:1: ( rule__FeatureDefinition__Group_1_2_0_0_1__1__Impl )
            // InternalAlf.g:4019:2: rule__FeatureDefinition__Group_1_2_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_0_1__1__Impl"
    // InternalAlf.g:4025:1: rule__FeatureDefinition__Group_1_2_0_0_1__1__Impl : ( '..' ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4029:1: ( ( '..' ) )
            // InternalAlf.g:4030:1: ( '..' )
            {
            // InternalAlf.g:4030:1: ( '..' )
            // InternalAlf.g:4031:2: '..'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_2_0_0_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_2_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_0_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_0__0"
    // InternalAlf.g:4041:1: rule__FeatureDefinition__Group_1_2_0_1_0__0 : rule__FeatureDefinition__Group_1_2_0_1_0__0__Impl rule__FeatureDefinition__Group_1_2_0_1_0__1 ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4045:1: ( rule__FeatureDefinition__Group_1_2_0_1_0__0__Impl rule__FeatureDefinition__Group_1_2_0_1_0__1 )
            // InternalAlf.g:4046:2: rule__FeatureDefinition__Group_1_2_0_1_0__0__Impl rule__FeatureDefinition__Group_1_2_0_1_0__1
            {
            pushFollow(FOLLOW_26);
            rule__FeatureDefinition__Group_1_2_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_0__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_0__0__Impl"
    // InternalAlf.g:4053:1: rule__FeatureDefinition__Group_1_2_0_1_0__0__Impl : ( '=' ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4057:1: ( ( '=' ) )
            // InternalAlf.g:4058:1: ( '=' )
            {
            // InternalAlf.g:4058:1: ( '=' )
            // InternalAlf.g:4059:2: '='
            {
             before(grammarAccess.getFeatureDefinitionAccess().getEqualsSignKeyword_1_2_0_1_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getEqualsSignKeyword_1_2_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_0__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_0__1"
    // InternalAlf.g:4068:1: rule__FeatureDefinition__Group_1_2_0_1_0__1 : rule__FeatureDefinition__Group_1_2_0_1_0__1__Impl rule__FeatureDefinition__Group_1_2_0_1_0__2 ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4072:1: ( rule__FeatureDefinition__Group_1_2_0_1_0__1__Impl rule__FeatureDefinition__Group_1_2_0_1_0__2 )
            // InternalAlf.g:4073:2: rule__FeatureDefinition__Group_1_2_0_1_0__1__Impl rule__FeatureDefinition__Group_1_2_0_1_0__2
            {
            pushFollow(FOLLOW_9);
            rule__FeatureDefinition__Group_1_2_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_0__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_0__1__Impl"
    // InternalAlf.g:4080:1: rule__FeatureDefinition__Group_1_2_0_1_0__1__Impl : ( ( rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1 ) ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4084:1: ( ( ( rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1 ) ) )
            // InternalAlf.g:4085:1: ( ( rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1 ) )
            {
            // InternalAlf.g:4085:1: ( ( rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1 ) )
            // InternalAlf.g:4086:2: ( rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getValueAssignment_1_2_0_1_0_1()); 
            // InternalAlf.g:4087:2: ( rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1 )
            // InternalAlf.g:4087:3: rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getValueAssignment_1_2_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_0__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_0__2"
    // InternalAlf.g:4095:1: rule__FeatureDefinition__Group_1_2_0_1_0__2 : rule__FeatureDefinition__Group_1_2_0_1_0__2__Impl ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4099:1: ( rule__FeatureDefinition__Group_1_2_0_1_0__2__Impl )
            // InternalAlf.g:4100:2: rule__FeatureDefinition__Group_1_2_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_0__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_0__2__Impl"
    // InternalAlf.g:4106:1: rule__FeatureDefinition__Group_1_2_0_1_0__2__Impl : ( ';' ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4110:1: ( ( ';' ) )
            // InternalAlf.g:4111:1: ( ';' )
            {
            // InternalAlf.g:4111:1: ( ';' )
            // InternalAlf.g:4112:2: ';'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_2_0_1_0_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_2_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_0__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_1__0"
    // InternalAlf.g:4122:1: rule__FeatureDefinition__Group_1_2_0_1_1__0 : rule__FeatureDefinition__Group_1_2_0_1_1__0__Impl rule__FeatureDefinition__Group_1_2_0_1_1__1 ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4126:1: ( rule__FeatureDefinition__Group_1_2_0_1_1__0__Impl rule__FeatureDefinition__Group_1_2_0_1_1__1 )
            // InternalAlf.g:4127:2: rule__FeatureDefinition__Group_1_2_0_1_1__0__Impl rule__FeatureDefinition__Group_1_2_0_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_1_2_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_1__0__Impl"
    // InternalAlf.g:4134:1: rule__FeatureDefinition__Group_1_2_0_1_1__0__Impl : ( '{' ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4138:1: ( ( '{' ) )
            // InternalAlf.g:4139:1: ( '{' )
            {
            // InternalAlf.g:4139:1: ( '{' )
            // InternalAlf.g:4140:2: '{'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_2_0_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_1__1"
    // InternalAlf.g:4149:1: rule__FeatureDefinition__Group_1_2_0_1_1__1 : rule__FeatureDefinition__Group_1_2_0_1_1__1__Impl rule__FeatureDefinition__Group_1_2_0_1_1__2 ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4153:1: ( rule__FeatureDefinition__Group_1_2_0_1_1__1__Impl rule__FeatureDefinition__Group_1_2_0_1_1__2 )
            // InternalAlf.g:4154:2: rule__FeatureDefinition__Group_1_2_0_1_1__1__Impl rule__FeatureDefinition__Group_1_2_0_1_1__2
            {
            pushFollow(FOLLOW_17);
            rule__FeatureDefinition__Group_1_2_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_1__1__Impl"
    // InternalAlf.g:4161:1: rule__FeatureDefinition__Group_1_2_0_1_1__1__Impl : ( ( rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1 )* ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4165:1: ( ( ( rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1 )* ) )
            // InternalAlf.g:4166:1: ( ( rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1 )* )
            {
            // InternalAlf.g:4166:1: ( ( rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1 )* )
            // InternalAlf.g:4167:2: ( rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1 )*
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipAssignment_1_2_0_1_1_1()); 
            // InternalAlf.g:4168:2: ( rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_UNRESTRICTED_NAME)||LA54_0==15||(LA54_0>=17 && LA54_0<=18)||(LA54_0>=26 && LA54_0<=29)||LA54_0==33||LA54_0==37||LA54_0==39||LA54_0==45||(LA54_0>=51 && LA54_0<=52)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAlf.g:4168:3: rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipAssignment_1_2_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_1__2"
    // InternalAlf.g:4176:1: rule__FeatureDefinition__Group_1_2_0_1_1__2 : rule__FeatureDefinition__Group_1_2_0_1_1__2__Impl ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4180:1: ( rule__FeatureDefinition__Group_1_2_0_1_1__2__Impl )
            // InternalAlf.g:4181:2: rule__FeatureDefinition__Group_1_2_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_1__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_0_1_1__2__Impl"
    // InternalAlf.g:4187:1: rule__FeatureDefinition__Group_1_2_0_1_1__2__Impl : ( '}' ) ;
    public final void rule__FeatureDefinition__Group_1_2_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4191:1: ( ( '}' ) )
            // InternalAlf.g:4192:1: ( '}' )
            {
            // InternalAlf.g:4192:1: ( '}' )
            // InternalAlf.g:4193:2: '}'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_2_0_1_1_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_2_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_0_1_1__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__0"
    // InternalAlf.g:4203:1: rule__FeatureDefinition__Group_1_2_1__0 : rule__FeatureDefinition__Group_1_2_1__0__Impl rule__FeatureDefinition__Group_1_2_1__1 ;
    public final void rule__FeatureDefinition__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4207:1: ( rule__FeatureDefinition__Group_1_2_1__0__Impl rule__FeatureDefinition__Group_1_2_1__1 )
            // InternalAlf.g:4208:2: rule__FeatureDefinition__Group_1_2_1__0__Impl rule__FeatureDefinition__Group_1_2_1__1
            {
            pushFollow(FOLLOW_22);
            rule__FeatureDefinition__Group_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__0__Impl"
    // InternalAlf.g:4215:1: rule__FeatureDefinition__Group_1_2_1__0__Impl : ( '[' ) ;
    public final void rule__FeatureDefinition__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4219:1: ( ( '[' ) )
            // InternalAlf.g:4220:1: ( '[' )
            {
            // InternalAlf.g:4220:1: ( '[' )
            // InternalAlf.g:4221:2: '['
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__1"
    // InternalAlf.g:4230:1: rule__FeatureDefinition__Group_1_2_1__1 : rule__FeatureDefinition__Group_1_2_1__1__Impl rule__FeatureDefinition__Group_1_2_1__2 ;
    public final void rule__FeatureDefinition__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4234:1: ( rule__FeatureDefinition__Group_1_2_1__1__Impl rule__FeatureDefinition__Group_1_2_1__2 )
            // InternalAlf.g:4235:2: rule__FeatureDefinition__Group_1_2_1__1__Impl rule__FeatureDefinition__Group_1_2_1__2
            {
            pushFollow(FOLLOW_22);
            rule__FeatureDefinition__Group_1_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__1__Impl"
    // InternalAlf.g:4242:1: rule__FeatureDefinition__Group_1_2_1__1__Impl : ( ( rule__FeatureDefinition__Group_1_2_1_1__0 )? ) ;
    public final void rule__FeatureDefinition__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4246:1: ( ( ( rule__FeatureDefinition__Group_1_2_1_1__0 )? ) )
            // InternalAlf.g:4247:1: ( ( rule__FeatureDefinition__Group_1_2_1_1__0 )? )
            {
            // InternalAlf.g:4247:1: ( ( rule__FeatureDefinition__Group_1_2_1_1__0 )? )
            // InternalAlf.g:4248:2: ( rule__FeatureDefinition__Group_1_2_1_1__0 )?
            {
             before(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_1_1()); 
            // InternalAlf.g:4249:2: ( rule__FeatureDefinition__Group_1_2_1_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_NATURAL_VALUE) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==43) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:4249:3: rule__FeatureDefinition__Group_1_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDefinition__Group_1_2_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureDefinitionAccess().getGroup_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__2"
    // InternalAlf.g:4257:1: rule__FeatureDefinition__Group_1_2_1__2 : rule__FeatureDefinition__Group_1_2_1__2__Impl rule__FeatureDefinition__Group_1_2_1__3 ;
    public final void rule__FeatureDefinition__Group_1_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4261:1: ( rule__FeatureDefinition__Group_1_2_1__2__Impl rule__FeatureDefinition__Group_1_2_1__3 )
            // InternalAlf.g:4262:2: rule__FeatureDefinition__Group_1_2_1__2__Impl rule__FeatureDefinition__Group_1_2_1__3
            {
            pushFollow(FOLLOW_23);
            rule__FeatureDefinition__Group_1_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__2"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__2__Impl"
    // InternalAlf.g:4269:1: rule__FeatureDefinition__Group_1_2_1__2__Impl : ( ( rule__FeatureDefinition__UpperAssignment_1_2_1_2 ) ) ;
    public final void rule__FeatureDefinition__Group_1_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4273:1: ( ( ( rule__FeatureDefinition__UpperAssignment_1_2_1_2 ) ) )
            // InternalAlf.g:4274:1: ( ( rule__FeatureDefinition__UpperAssignment_1_2_1_2 ) )
            {
            // InternalAlf.g:4274:1: ( ( rule__FeatureDefinition__UpperAssignment_1_2_1_2 ) )
            // InternalAlf.g:4275:2: ( rule__FeatureDefinition__UpperAssignment_1_2_1_2 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_2_1_2()); 
            // InternalAlf.g:4276:2: ( rule__FeatureDefinition__UpperAssignment_1_2_1_2 )
            // InternalAlf.g:4276:3: rule__FeatureDefinition__UpperAssignment_1_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__UpperAssignment_1_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getUpperAssignment_1_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__2__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__3"
    // InternalAlf.g:4284:1: rule__FeatureDefinition__Group_1_2_1__3 : rule__FeatureDefinition__Group_1_2_1__3__Impl rule__FeatureDefinition__Group_1_2_1__4 ;
    public final void rule__FeatureDefinition__Group_1_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4288:1: ( rule__FeatureDefinition__Group_1_2_1__3__Impl rule__FeatureDefinition__Group_1_2_1__4 )
            // InternalAlf.g:4289:2: rule__FeatureDefinition__Group_1_2_1__3__Impl rule__FeatureDefinition__Group_1_2_1__4
            {
            pushFollow(FOLLOW_9);
            rule__FeatureDefinition__Group_1_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__3"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__3__Impl"
    // InternalAlf.g:4296:1: rule__FeatureDefinition__Group_1_2_1__3__Impl : ( ']' ) ;
    public final void rule__FeatureDefinition__Group_1_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4300:1: ( ( ']' ) )
            // InternalAlf.g:4301:1: ( ']' )
            {
            // InternalAlf.g:4301:1: ( ']' )
            // InternalAlf.g:4302:2: ']'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_2_1_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getRightSquareBracketKeyword_1_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__3__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__4"
    // InternalAlf.g:4311:1: rule__FeatureDefinition__Group_1_2_1__4 : rule__FeatureDefinition__Group_1_2_1__4__Impl ;
    public final void rule__FeatureDefinition__Group_1_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4315:1: ( rule__FeatureDefinition__Group_1_2_1__4__Impl )
            // InternalAlf.g:4316:2: rule__FeatureDefinition__Group_1_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__4"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1__4__Impl"
    // InternalAlf.g:4322:1: rule__FeatureDefinition__Group_1_2_1__4__Impl : ( ';' ) ;
    public final void rule__FeatureDefinition__Group_1_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4326:1: ( ( ';' ) )
            // InternalAlf.g:4327:1: ( ';' )
            {
            // InternalAlf.g:4327:1: ( ';' )
            // InternalAlf.g:4328:2: ';'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_2_1_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_1_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1__4__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1_1__0"
    // InternalAlf.g:4338:1: rule__FeatureDefinition__Group_1_2_1_1__0 : rule__FeatureDefinition__Group_1_2_1_1__0__Impl rule__FeatureDefinition__Group_1_2_1_1__1 ;
    public final void rule__FeatureDefinition__Group_1_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4342:1: ( rule__FeatureDefinition__Group_1_2_1_1__0__Impl rule__FeatureDefinition__Group_1_2_1_1__1 )
            // InternalAlf.g:4343:2: rule__FeatureDefinition__Group_1_2_1_1__0__Impl rule__FeatureDefinition__Group_1_2_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__FeatureDefinition__Group_1_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1_1__0"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1_1__0__Impl"
    // InternalAlf.g:4350:1: rule__FeatureDefinition__Group_1_2_1_1__0__Impl : ( ( rule__FeatureDefinition__LowerAssignment_1_2_1_1_0 ) ) ;
    public final void rule__FeatureDefinition__Group_1_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4354:1: ( ( ( rule__FeatureDefinition__LowerAssignment_1_2_1_1_0 ) ) )
            // InternalAlf.g:4355:1: ( ( rule__FeatureDefinition__LowerAssignment_1_2_1_1_0 ) )
            {
            // InternalAlf.g:4355:1: ( ( rule__FeatureDefinition__LowerAssignment_1_2_1_1_0 ) )
            // InternalAlf.g:4356:2: ( rule__FeatureDefinition__LowerAssignment_1_2_1_1_0 )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_2_1_1_0()); 
            // InternalAlf.g:4357:2: ( rule__FeatureDefinition__LowerAssignment_1_2_1_1_0 )
            // InternalAlf.g:4357:3: rule__FeatureDefinition__LowerAssignment_1_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__LowerAssignment_1_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDefinitionAccess().getLowerAssignment_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1_1__0__Impl"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1_1__1"
    // InternalAlf.g:4365:1: rule__FeatureDefinition__Group_1_2_1_1__1 : rule__FeatureDefinition__Group_1_2_1_1__1__Impl ;
    public final void rule__FeatureDefinition__Group_1_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4369:1: ( rule__FeatureDefinition__Group_1_2_1_1__1__Impl )
            // InternalAlf.g:4370:2: rule__FeatureDefinition__Group_1_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDefinition__Group_1_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1_1__1"


    // $ANTLR start "rule__FeatureDefinition__Group_1_2_1_1__1__Impl"
    // InternalAlf.g:4376:1: rule__FeatureDefinition__Group_1_2_1_1__1__Impl : ( '..' ) ;
    public final void rule__FeatureDefinition__Group_1_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4380:1: ( ( '..' ) )
            // InternalAlf.g:4381:1: ( '..' )
            {
            // InternalAlf.g:4381:1: ( '..' )
            // InternalAlf.g:4382:2: '..'
            {
             before(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_2_1_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFeatureDefinitionAccess().getFullStopFullStopKeyword_1_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__Group_1_2_1_1__1__Impl"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_0__0"
    // InternalAlf.g:4392:1: rule__OwnedRedefinitionOrSubset__Group_0__0 : rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4396:1: ( rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 )
            // InternalAlf.g:4397:2: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1
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
    // InternalAlf.g:4404:1: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl : ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4408:1: ( ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) )
            // InternalAlf.g:4409:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            {
            // InternalAlf.g:4409:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            // InternalAlf.g:4410:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives_0_0()); 
            // InternalAlf.g:4411:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            // InternalAlf.g:4411:3: rule__OwnedRedefinitionOrSubset__Alternatives_0_0
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
    // InternalAlf.g:4419:1: rule__OwnedRedefinitionOrSubset__Group_0__1 : rule__OwnedRedefinitionOrSubset__Group_0__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4423:1: ( rule__OwnedRedefinitionOrSubset__Group_0__1__Impl )
            // InternalAlf.g:4424:2: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl
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
    // InternalAlf.g:4430:1: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4434:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) )
            // InternalAlf.g:4435:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            {
            // InternalAlf.g:4435:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            // InternalAlf.g:4436:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_0_1()); 
            // InternalAlf.g:4437:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            // InternalAlf.g:4437:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1
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
    // InternalAlf.g:4446:1: rule__OwnedRedefinitionOrSubset__Group_1__0 : rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4450:1: ( rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 )
            // InternalAlf.g:4451:2: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1
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
    // InternalAlf.g:4458:1: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl : ( 'subsets' ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4462:1: ( ( 'subsets' ) )
            // InternalAlf.g:4463:1: ( 'subsets' )
            {
            // InternalAlf.g:4463:1: ( 'subsets' )
            // InternalAlf.g:4464:2: 'subsets'
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAlf.g:4473:1: rule__OwnedRedefinitionOrSubset__Group_1__1 : rule__OwnedRedefinitionOrSubset__Group_1__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4477:1: ( rule__OwnedRedefinitionOrSubset__Group_1__1__Impl )
            // InternalAlf.g:4478:2: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl
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
    // InternalAlf.g:4484:1: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4488:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) )
            // InternalAlf.g:4489:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            {
            // InternalAlf.g:4489:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            // InternalAlf.g:4490:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_1_1()); 
            // InternalAlf.g:4491:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            // InternalAlf.g:4491:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1
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
    // InternalAlf.g:4500:1: rule__ConnectorDefinition__Group__0 : rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 ;
    public final void rule__ConnectorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4504:1: ( rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 )
            // InternalAlf.g:4505:2: rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAlf.g:4512:1: rule__ConnectorDefinition__Group__0__Impl : ( ( rule__ConnectorDefinition__NameAssignment_0 )? ) ;
    public final void rule__ConnectorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4516:1: ( ( ( rule__ConnectorDefinition__NameAssignment_0 )? ) )
            // InternalAlf.g:4517:1: ( ( rule__ConnectorDefinition__NameAssignment_0 )? )
            {
            // InternalAlf.g:4517:1: ( ( rule__ConnectorDefinition__NameAssignment_0 )? )
            // InternalAlf.g:4518:2: ( rule__ConnectorDefinition__NameAssignment_0 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getNameAssignment_0()); 
            // InternalAlf.g:4519:2: ( rule__ConnectorDefinition__NameAssignment_0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( ((LA56_1>=RULE_ID && LA56_1<=RULE_UNRESTRICTED_NAME)) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==RULE_UNRESTRICTED_NAME) ) {
                int LA56_2 = input.LA(2);

                if ( ((LA56_2>=RULE_ID && LA56_2<=RULE_UNRESTRICTED_NAME)) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:4519:3: rule__ConnectorDefinition__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorDefinition__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalAlf.g:4527:1: rule__ConnectorDefinition__Group__1 : rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 ;
    public final void rule__ConnectorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4531:1: ( rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 )
            // InternalAlf.g:4532:2: rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAlf.g:4539:1: rule__ConnectorDefinition__Group__1__Impl : ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) ) ;
    public final void rule__ConnectorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4543:1: ( ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) ) )
            // InternalAlf.g:4544:1: ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) )
            {
            // InternalAlf.g:4544:1: ( ( rule__ConnectorDefinition__SourceFeatureAssignment_1 ) )
            // InternalAlf.g:4545:2: ( rule__ConnectorDefinition__SourceFeatureAssignment_1 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureAssignment_1()); 
            // InternalAlf.g:4546:2: ( rule__ConnectorDefinition__SourceFeatureAssignment_1 )
            // InternalAlf.g:4546:3: rule__ConnectorDefinition__SourceFeatureAssignment_1
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
    // InternalAlf.g:4554:1: rule__ConnectorDefinition__Group__2 : rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 ;
    public final void rule__ConnectorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4558:1: ( rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 )
            // InternalAlf.g:4559:2: rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3
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
    // InternalAlf.g:4566:1: rule__ConnectorDefinition__Group__2__Impl : ( '=>' ) ;
    public final void rule__ConnectorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4570:1: ( ( '=>' ) )
            // InternalAlf.g:4571:1: ( '=>' )
            {
            // InternalAlf.g:4571:1: ( '=>' )
            // InternalAlf.g:4572:2: '=>'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAlf.g:4581:1: rule__ConnectorDefinition__Group__3 : rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 ;
    public final void rule__ConnectorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4585:1: ( rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 )
            // InternalAlf.g:4586:2: rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4
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
    // InternalAlf.g:4593:1: rule__ConnectorDefinition__Group__3__Impl : ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) ) ;
    public final void rule__ConnectorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4597:1: ( ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) ) )
            // InternalAlf.g:4598:1: ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) )
            {
            // InternalAlf.g:4598:1: ( ( rule__ConnectorDefinition__TargetFeatureAssignment_3 ) )
            // InternalAlf.g:4599:2: ( rule__ConnectorDefinition__TargetFeatureAssignment_3 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureAssignment_3()); 
            // InternalAlf.g:4600:2: ( rule__ConnectorDefinition__TargetFeatureAssignment_3 )
            // InternalAlf.g:4600:3: rule__ConnectorDefinition__TargetFeatureAssignment_3
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
    // InternalAlf.g:4608:1: rule__ConnectorDefinition__Group__4 : rule__ConnectorDefinition__Group__4__Impl ;
    public final void rule__ConnectorDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4612:1: ( rule__ConnectorDefinition__Group__4__Impl )
            // InternalAlf.g:4613:2: rule__ConnectorDefinition__Group__4__Impl
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
    // InternalAlf.g:4619:1: rule__ConnectorDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__ConnectorDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4623:1: ( ( ';' ) )
            // InternalAlf.g:4624:1: ( ';' )
            {
            // InternalAlf.g:4624:1: ( ';' )
            // InternalAlf.g:4625:2: ';'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_4()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalAlf.g:4635:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4639:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalAlf.g:4640:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAlf.g:4647:1: rule__BinaryExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4651:1: ( ( ruleUnaryExpression ) )
            // InternalAlf.g:4652:1: ( ruleUnaryExpression )
            {
            // InternalAlf.g:4652:1: ( ruleUnaryExpression )
            // InternalAlf.g:4653:2: ruleUnaryExpression
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
    // InternalAlf.g:4662:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4666:1: ( rule__BinaryExpression__Group__1__Impl )
            // InternalAlf.g:4667:2: rule__BinaryExpression__Group__1__Impl
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
    // InternalAlf.g:4673:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__Group_1__0 )? ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4677:1: ( ( ( rule__BinaryExpression__Group_1__0 )? ) )
            // InternalAlf.g:4678:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            {
            // InternalAlf.g:4678:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            // InternalAlf.g:4679:2: ( rule__BinaryExpression__Group_1__0 )?
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup_1()); 
            // InternalAlf.g:4680:2: ( rule__BinaryExpression__Group_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=19 && LA57_0<=23)||LA57_0==53) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:4680:3: rule__BinaryExpression__Group_1__0
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
    // InternalAlf.g:4689:1: rule__BinaryExpression__Group_1__0 : rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 ;
    public final void rule__BinaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4693:1: ( rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 )
            // InternalAlf.g:4694:2: rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAlf.g:4701:1: rule__BinaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4705:1: ( ( () ) )
            // InternalAlf.g:4706:1: ( () )
            {
            // InternalAlf.g:4706:1: ( () )
            // InternalAlf.g:4707:2: ()
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalAlf.g:4708:2: ()
            // InternalAlf.g:4708:3: 
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
    // InternalAlf.g:4716:1: rule__BinaryExpression__Group_1__1 : rule__BinaryExpression__Group_1__1__Impl ;
    public final void rule__BinaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4720:1: ( rule__BinaryExpression__Group_1__1__Impl )
            // InternalAlf.g:4721:2: rule__BinaryExpression__Group_1__1__Impl
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
    // InternalAlf.g:4727:1: rule__BinaryExpression__Group_1__1__Impl : ( ( rule__BinaryExpression__Alternatives_1_1 ) ) ;
    public final void rule__BinaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4731:1: ( ( ( rule__BinaryExpression__Alternatives_1_1 ) ) )
            // InternalAlf.g:4732:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            {
            // InternalAlf.g:4732:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            // InternalAlf.g:4733:2: ( rule__BinaryExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getAlternatives_1_1()); 
            // InternalAlf.g:4734:2: ( rule__BinaryExpression__Alternatives_1_1 )
            // InternalAlf.g:4734:3: rule__BinaryExpression__Alternatives_1_1
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
    // InternalAlf.g:4743:1: rule__BinaryExpression__Group_1_1_0__0 : rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 ;
    public final void rule__BinaryExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4747:1: ( rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 )
            // InternalAlf.g:4748:2: rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAlf.g:4755:1: rule__BinaryExpression__Group_1_1_0__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4759:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) )
            // InternalAlf.g:4760:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            {
            // InternalAlf.g:4760:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            // InternalAlf.g:4761:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_0_0()); 
            // InternalAlf.g:4762:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            // InternalAlf.g:4762:3: rule__BinaryExpression__OperatorAssignment_1_1_0_0
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
    // InternalAlf.g:4770:1: rule__BinaryExpression__Group_1_1_0__1 : rule__BinaryExpression__Group_1_1_0__1__Impl ;
    public final void rule__BinaryExpression__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4774:1: ( rule__BinaryExpression__Group_1_1_0__1__Impl )
            // InternalAlf.g:4775:2: rule__BinaryExpression__Group_1_1_0__1__Impl
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
    // InternalAlf.g:4781:1: rule__BinaryExpression__Group_1_1_0__1__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4785:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) )
            // InternalAlf.g:4786:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            {
            // InternalAlf.g:4786:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            // InternalAlf.g:4787:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_0_1()); 
            // InternalAlf.g:4788:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            // InternalAlf.g:4788:3: rule__BinaryExpression__OperandAssignment_1_1_0_1
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
    // InternalAlf.g:4797:1: rule__BinaryExpression__Group_1_1_1__0 : rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 ;
    public final void rule__BinaryExpression__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4801:1: ( rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 )
            // InternalAlf.g:4802:2: rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAlf.g:4809:1: rule__BinaryExpression__Group_1_1_1__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4813:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) )
            // InternalAlf.g:4814:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            {
            // InternalAlf.g:4814:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            // InternalAlf.g:4815:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_1_0()); 
            // InternalAlf.g:4816:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            // InternalAlf.g:4816:3: rule__BinaryExpression__OperatorAssignment_1_1_1_0
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
    // InternalAlf.g:4824:1: rule__BinaryExpression__Group_1_1_1__1 : rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 ;
    public final void rule__BinaryExpression__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4828:1: ( rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 )
            // InternalAlf.g:4829:2: rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalAlf.g:4836:1: rule__BinaryExpression__Group_1_1_1__1__Impl : ( '[' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4840:1: ( ( '[' ) )
            // InternalAlf.g:4841:1: ( '[' )
            {
            // InternalAlf.g:4841:1: ( '[' )
            // InternalAlf.g:4842:2: '['
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAlf.g:4851:1: rule__BinaryExpression__Group_1_1_1__2 : rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 ;
    public final void rule__BinaryExpression__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4855:1: ( rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 )
            // InternalAlf.g:4856:2: rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalAlf.g:4863:1: rule__BinaryExpression__Group_1_1_1__2__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4867:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) )
            // InternalAlf.g:4868:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            {
            // InternalAlf.g:4868:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            // InternalAlf.g:4869:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_1_2()); 
            // InternalAlf.g:4870:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            // InternalAlf.g:4870:3: rule__BinaryExpression__OperandAssignment_1_1_1_2
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
    // InternalAlf.g:4878:1: rule__BinaryExpression__Group_1_1_1__3 : rule__BinaryExpression__Group_1_1_1__3__Impl ;
    public final void rule__BinaryExpression__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4882:1: ( rule__BinaryExpression__Group_1_1_1__3__Impl )
            // InternalAlf.g:4883:2: rule__BinaryExpression__Group_1_1_1__3__Impl
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
    // InternalAlf.g:4889:1: rule__BinaryExpression__Group_1_1_1__3__Impl : ( ']' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4893:1: ( ( ']' ) )
            // InternalAlf.g:4894:1: ( ']' )
            {
            // InternalAlf.g:4894:1: ( ']' )
            // InternalAlf.g:4895:2: ']'
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightSquareBracketKeyword_1_1_1_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAlf.g:4905:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4909:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // InternalAlf.g:4910:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAlf.g:4917:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4921:1: ( ( () ) )
            // InternalAlf.g:4922:1: ( () )
            {
            // InternalAlf.g:4922:1: ( () )
            // InternalAlf.g:4923:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0()); 
            // InternalAlf.g:4924:2: ()
            // InternalAlf.g:4924:3: 
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
    // InternalAlf.g:4932:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4936:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // InternalAlf.g:4937:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:4944:1: rule__UnaryExpression__Group_1__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4948:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) )
            // InternalAlf.g:4949:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAlf.g:4949:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            // InternalAlf.g:4950:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAlf.g:4951:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            // InternalAlf.g:4951:3: rule__UnaryExpression__OperatorAssignment_1_1
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
    // InternalAlf.g:4959:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4963:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // InternalAlf.g:4964:2: rule__UnaryExpression__Group_1__2__Impl
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
    // InternalAlf.g:4970:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4974:1: ( ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) )
            // InternalAlf.g:4975:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            {
            // InternalAlf.g:4975:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            // InternalAlf.g:4976:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2()); 
            // InternalAlf.g:4977:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            // InternalAlf.g:4977:3: rule__UnaryExpression__OperandAssignment_1_2
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
    // InternalAlf.g:4986:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4990:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalAlf.g:4991:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAlf.g:4998:1: rule__PrimaryExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5002:1: ( ( '(' ) )
            // InternalAlf.g:5003:1: ( '(' )
            {
            // InternalAlf.g:5003:1: ( '(' )
            // InternalAlf.g:5004:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAlf.g:5013:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5017:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalAlf.g:5018:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAlf.g:5025:1: rule__PrimaryExpression__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5029:1: ( ( ruleExpression ) )
            // InternalAlf.g:5030:1: ( ruleExpression )
            {
            // InternalAlf.g:5030:1: ( ruleExpression )
            // InternalAlf.g:5031:2: ruleExpression
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
    // InternalAlf.g:5040:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5044:1: ( rule__PrimaryExpression__Group_4__2__Impl )
            // InternalAlf.g:5045:2: rule__PrimaryExpression__Group_4__2__Impl
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
    // InternalAlf.g:5051:1: rule__PrimaryExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5055:1: ( ( ')' ) )
            // InternalAlf.g:5056:1: ( ')' )
            {
            // InternalAlf.g:5056:1: ( ')' )
            // InternalAlf.g:5057:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAlf.g:5067:1: rule__InstanceCreationExpression__Group__0 : rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 ;
    public final void rule__InstanceCreationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5071:1: ( rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 )
            // InternalAlf.g:5072:2: rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAlf.g:5079:1: rule__InstanceCreationExpression__Group__0__Impl : ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5083:1: ( ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) )
            // InternalAlf.g:5084:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            {
            // InternalAlf.g:5084:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            // InternalAlf.g:5085:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassAssignment_0()); 
            // InternalAlf.g:5086:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            // InternalAlf.g:5086:3: rule__InstanceCreationExpression__ClassAssignment_0
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
    // InternalAlf.g:5094:1: rule__InstanceCreationExpression__Group__1 : rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 ;
    public final void rule__InstanceCreationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5098:1: ( rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 )
            // InternalAlf.g:5099:2: rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalAlf.g:5106:1: rule__InstanceCreationExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__InstanceCreationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5110:1: ( ( '(' ) )
            // InternalAlf.g:5111:1: ( '(' )
            {
            // InternalAlf.g:5111:1: ( '(' )
            // InternalAlf.g:5112:2: '('
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAlf.g:5121:1: rule__InstanceCreationExpression__Group__2 : rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 ;
    public final void rule__InstanceCreationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5125:1: ( rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 )
            // InternalAlf.g:5126:2: rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalAlf.g:5133:1: rule__InstanceCreationExpression__Group__2__Impl : ( ( rule__InstanceCreationExpression__Group_2__0 )? ) ;
    public final void rule__InstanceCreationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5137:1: ( ( ( rule__InstanceCreationExpression__Group_2__0 )? ) )
            // InternalAlf.g:5138:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            {
            // InternalAlf.g:5138:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            // InternalAlf.g:5139:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2()); 
            // InternalAlf.g:5140:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING_VALUE)||(LA58_0>=19 && LA58_0<=21)||LA58_0==34||LA58_0==47||(LA58_0>=49 && LA58_0<=50)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:5140:3: rule__InstanceCreationExpression__Group_2__0
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
    // InternalAlf.g:5148:1: rule__InstanceCreationExpression__Group__3 : rule__InstanceCreationExpression__Group__3__Impl ;
    public final void rule__InstanceCreationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5152:1: ( rule__InstanceCreationExpression__Group__3__Impl )
            // InternalAlf.g:5153:2: rule__InstanceCreationExpression__Group__3__Impl
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
    // InternalAlf.g:5159:1: rule__InstanceCreationExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__InstanceCreationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5163:1: ( ( ')' ) )
            // InternalAlf.g:5164:1: ( ')' )
            {
            // InternalAlf.g:5164:1: ( ')' )
            // InternalAlf.g:5165:2: ')'
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAlf.g:5175:1: rule__InstanceCreationExpression__Group_2__0 : rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 ;
    public final void rule__InstanceCreationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5179:1: ( rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 )
            // InternalAlf.g:5180:2: rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAlf.g:5187:1: rule__InstanceCreationExpression__Group_2__0__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5191:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) )
            // InternalAlf.g:5192:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            {
            // InternalAlf.g:5192:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            // InternalAlf.g:5193:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_0()); 
            // InternalAlf.g:5194:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            // InternalAlf.g:5194:3: rule__InstanceCreationExpression__ArgumentAssignment_2_0
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
    // InternalAlf.g:5202:1: rule__InstanceCreationExpression__Group_2__1 : rule__InstanceCreationExpression__Group_2__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5206:1: ( rule__InstanceCreationExpression__Group_2__1__Impl )
            // InternalAlf.g:5207:2: rule__InstanceCreationExpression__Group_2__1__Impl
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
    // InternalAlf.g:5213:1: rule__InstanceCreationExpression__Group_2__1__Impl : ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) ;
    public final void rule__InstanceCreationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5217:1: ( ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:5218:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:5218:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            // InternalAlf.g:5219:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:5220:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==38) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalAlf.g:5220:3: rule__InstanceCreationExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InstanceCreationExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalAlf.g:5229:1: rule__InstanceCreationExpression__Group_2_1__0 : rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 ;
    public final void rule__InstanceCreationExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5233:1: ( rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 )
            // InternalAlf.g:5234:2: rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAlf.g:5241:1: rule__InstanceCreationExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5245:1: ( ( ',' ) )
            // InternalAlf.g:5246:1: ( ',' )
            {
            // InternalAlf.g:5246:1: ( ',' )
            // InternalAlf.g:5247:2: ','
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAlf.g:5256:1: rule__InstanceCreationExpression__Group_2_1__1 : rule__InstanceCreationExpression__Group_2_1__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5260:1: ( rule__InstanceCreationExpression__Group_2_1__1__Impl )
            // InternalAlf.g:5261:2: rule__InstanceCreationExpression__Group_2_1__1__Impl
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
    // InternalAlf.g:5267:1: rule__InstanceCreationExpression__Group_2_1__1__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5271:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) )
            // InternalAlf.g:5272:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            {
            // InternalAlf.g:5272:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            // InternalAlf.g:5273:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_1_1()); 
            // InternalAlf.g:5274:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            // InternalAlf.g:5274:3: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1
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
    // InternalAlf.g:5283:1: rule__SequenceConstructionExpression__Group__0 : rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 ;
    public final void rule__SequenceConstructionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5287:1: ( rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 )
            // InternalAlf.g:5288:2: rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1
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
    // InternalAlf.g:5295:1: rule__SequenceConstructionExpression__Group__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5299:1: ( ( () ) )
            // InternalAlf.g:5300:1: ( () )
            {
            // InternalAlf.g:5300:1: ( () )
            // InternalAlf.g:5301:2: ()
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0()); 
            // InternalAlf.g:5302:2: ()
            // InternalAlf.g:5302:3: 
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
    // InternalAlf.g:5310:1: rule__SequenceConstructionExpression__Group__1 : rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 ;
    public final void rule__SequenceConstructionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5314:1: ( rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 )
            // InternalAlf.g:5315:2: rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAlf.g:5322:1: rule__SequenceConstructionExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5326:1: ( ( '{' ) )
            // InternalAlf.g:5327:1: ( '{' )
            {
            // InternalAlf.g:5327:1: ( '{' )
            // InternalAlf.g:5328:2: '{'
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAlf.g:5337:1: rule__SequenceConstructionExpression__Group__2 : rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 ;
    public final void rule__SequenceConstructionExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5341:1: ( rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 )
            // InternalAlf.g:5342:2: rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalAlf.g:5349:1: rule__SequenceConstructionExpression__Group__2__Impl : ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) ;
    public final void rule__SequenceConstructionExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5353:1: ( ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) )
            // InternalAlf.g:5354:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            {
            // InternalAlf.g:5354:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            // InternalAlf.g:5355:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2()); 
            // InternalAlf.g:5356:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING_VALUE)||(LA60_0>=19 && LA60_0<=21)||LA60_0==34||LA60_0==47||(LA60_0>=49 && LA60_0<=50)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:5356:3: rule__SequenceConstructionExpression__Group_2__0
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
    // InternalAlf.g:5364:1: rule__SequenceConstructionExpression__Group__3 : rule__SequenceConstructionExpression__Group__3__Impl ;
    public final void rule__SequenceConstructionExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5368:1: ( rule__SequenceConstructionExpression__Group__3__Impl )
            // InternalAlf.g:5369:2: rule__SequenceConstructionExpression__Group__3__Impl
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
    // InternalAlf.g:5375:1: rule__SequenceConstructionExpression__Group__3__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5379:1: ( ( '}' ) )
            // InternalAlf.g:5380:1: ( '}' )
            {
            // InternalAlf.g:5380:1: ( '}' )
            // InternalAlf.g:5381:2: '}'
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAlf.g:5391:1: rule__SequenceConstructionExpression__Group_2__0 : rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 ;
    public final void rule__SequenceConstructionExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5395:1: ( rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 )
            // InternalAlf.g:5396:2: rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAlf.g:5403:1: rule__SequenceConstructionExpression__Group_2__0__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5407:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) )
            // InternalAlf.g:5408:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            {
            // InternalAlf.g:5408:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            // InternalAlf.g:5409:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_0()); 
            // InternalAlf.g:5410:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            // InternalAlf.g:5410:3: rule__SequenceConstructionExpression__ElementAssignment_2_0
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
    // InternalAlf.g:5418:1: rule__SequenceConstructionExpression__Group_2__1 : rule__SequenceConstructionExpression__Group_2__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5422:1: ( rule__SequenceConstructionExpression__Group_2__1__Impl )
            // InternalAlf.g:5423:2: rule__SequenceConstructionExpression__Group_2__1__Impl
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
    // InternalAlf.g:5429:1: rule__SequenceConstructionExpression__Group_2__1__Impl : ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) ;
    public final void rule__SequenceConstructionExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5433:1: ( ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:5434:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:5434:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            // InternalAlf.g:5435:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:5436:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==38) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalAlf.g:5436:3: rule__SequenceConstructionExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SequenceConstructionExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalAlf.g:5445:1: rule__SequenceConstructionExpression__Group_2_1__0 : rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5449:1: ( rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 )
            // InternalAlf.g:5450:2: rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAlf.g:5457:1: rule__SequenceConstructionExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5461:1: ( ( ',' ) )
            // InternalAlf.g:5462:1: ( ',' )
            {
            // InternalAlf.g:5462:1: ( ',' )
            // InternalAlf.g:5463:2: ','
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAlf.g:5472:1: rule__SequenceConstructionExpression__Group_2_1__1 : rule__SequenceConstructionExpression__Group_2_1__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5476:1: ( rule__SequenceConstructionExpression__Group_2_1__1__Impl )
            // InternalAlf.g:5477:2: rule__SequenceConstructionExpression__Group_2_1__1__Impl
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
    // InternalAlf.g:5483:1: rule__SequenceConstructionExpression__Group_2_1__1__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5487:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) )
            // InternalAlf.g:5488:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            {
            // InternalAlf.g:5488:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            // InternalAlf.g:5489:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_1_1()); 
            // InternalAlf.g:5490:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            // InternalAlf.g:5490:3: rule__SequenceConstructionExpression__ElementAssignment_2_1_1
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
    // InternalAlf.g:5499:1: rule__NullLiteralExpression__Group__0 : rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 ;
    public final void rule__NullLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5503:1: ( rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 )
            // InternalAlf.g:5504:2: rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAlf.g:5511:1: rule__NullLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5515:1: ( ( () ) )
            // InternalAlf.g:5516:1: ( () )
            {
            // InternalAlf.g:5516:1: ( () )
            // InternalAlf.g:5517:2: ()
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0()); 
            // InternalAlf.g:5518:2: ()
            // InternalAlf.g:5518:3: 
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
    // InternalAlf.g:5526:1: rule__NullLiteralExpression__Group__1 : rule__NullLiteralExpression__Group__1__Impl ;
    public final void rule__NullLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5530:1: ( rule__NullLiteralExpression__Group__1__Impl )
            // InternalAlf.g:5531:2: rule__NullLiteralExpression__Group__1__Impl
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
    // InternalAlf.g:5537:1: rule__NullLiteralExpression__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5541:1: ( ( 'null' ) )
            // InternalAlf.g:5542:1: ( 'null' )
            {
            // InternalAlf.g:5542:1: ( 'null' )
            // InternalAlf.g:5543:2: 'null'
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getNullKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAlf.g:5553:1: rule__RealValue__Group__0 : rule__RealValue__Group__0__Impl rule__RealValue__Group__1 ;
    public final void rule__RealValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5557:1: ( rule__RealValue__Group__0__Impl rule__RealValue__Group__1 )
            // InternalAlf.g:5558:2: rule__RealValue__Group__0__Impl rule__RealValue__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAlf.g:5565:1: rule__RealValue__Group__0__Impl : ( ( rule__RealValue__Alternatives_0 ) ) ;
    public final void rule__RealValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5569:1: ( ( ( rule__RealValue__Alternatives_0 ) ) )
            // InternalAlf.g:5570:1: ( ( rule__RealValue__Alternatives_0 ) )
            {
            // InternalAlf.g:5570:1: ( ( rule__RealValue__Alternatives_0 ) )
            // InternalAlf.g:5571:2: ( rule__RealValue__Alternatives_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_0()); 
            // InternalAlf.g:5572:2: ( rule__RealValue__Alternatives_0 )
            // InternalAlf.g:5572:3: rule__RealValue__Alternatives_0
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
    // InternalAlf.g:5580:1: rule__RealValue__Group__1 : rule__RealValue__Group__1__Impl ;
    public final void rule__RealValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5584:1: ( rule__RealValue__Group__1__Impl )
            // InternalAlf.g:5585:2: rule__RealValue__Group__1__Impl
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
    // InternalAlf.g:5591:1: rule__RealValue__Group__1__Impl : ( ( rule__RealValue__Group_1__0 )? ) ;
    public final void rule__RealValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5595:1: ( ( ( rule__RealValue__Group_1__0 )? ) )
            // InternalAlf.g:5596:1: ( ( rule__RealValue__Group_1__0 )? )
            {
            // InternalAlf.g:5596:1: ( ( rule__RealValue__Group_1__0 )? )
            // InternalAlf.g:5597:2: ( rule__RealValue__Group_1__0 )?
            {
             before(grammarAccess.getRealValueAccess().getGroup_1()); 
            // InternalAlf.g:5598:2: ( rule__RealValue__Group_1__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=24 && LA62_0<=25)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlf.g:5598:3: rule__RealValue__Group_1__0
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
    // InternalAlf.g:5607:1: rule__RealValue__Group_0_0__0 : rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 ;
    public final void rule__RealValue__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5611:1: ( rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 )
            // InternalAlf.g:5612:2: rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAlf.g:5619:1: rule__RealValue__Group_0_0__0__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5623:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:5624:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:5624:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:5625:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:5634:1: rule__RealValue__Group_0_0__1 : rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 ;
    public final void rule__RealValue__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5638:1: ( rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 )
            // InternalAlf.g:5639:2: rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalAlf.g:5646:1: rule__RealValue__Group_0_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5650:1: ( ( '.' ) )
            // InternalAlf.g:5651:1: ( '.' )
            {
            // InternalAlf.g:5651:1: ( '.' )
            // InternalAlf.g:5652:2: '.'
            {
             before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalAlf.g:5661:1: rule__RealValue__Group_0_0__2 : rule__RealValue__Group_0_0__2__Impl ;
    public final void rule__RealValue__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5665:1: ( rule__RealValue__Group_0_0__2__Impl )
            // InternalAlf.g:5666:2: rule__RealValue__Group_0_0__2__Impl
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
    // InternalAlf.g:5672:1: rule__RealValue__Group_0_0__2__Impl : ( ( RULE_NATURAL_VALUE )? ) ;
    public final void rule__RealValue__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5676:1: ( ( ( RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:5677:1: ( ( RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:5677:1: ( ( RULE_NATURAL_VALUE )? )
            // InternalAlf.g:5678:2: ( RULE_NATURAL_VALUE )?
            {
             before(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2()); 
            // InternalAlf.g:5679:2: ( RULE_NATURAL_VALUE )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_NATURAL_VALUE) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:5679:3: RULE_NATURAL_VALUE
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
    // InternalAlf.g:5688:1: rule__RealValue__Group_0_1__0 : rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 ;
    public final void rule__RealValue__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5692:1: ( rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 )
            // InternalAlf.g:5693:2: rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAlf.g:5700:1: rule__RealValue__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5704:1: ( ( '.' ) )
            // InternalAlf.g:5705:1: ( '.' )
            {
            // InternalAlf.g:5705:1: ( '.' )
            // InternalAlf.g:5706:2: '.'
            {
             before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalAlf.g:5715:1: rule__RealValue__Group_0_1__1 : rule__RealValue__Group_0_1__1__Impl ;
    public final void rule__RealValue__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5719:1: ( rule__RealValue__Group_0_1__1__Impl )
            // InternalAlf.g:5720:2: rule__RealValue__Group_0_1__1__Impl
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
    // InternalAlf.g:5726:1: rule__RealValue__Group_0_1__1__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5730:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:5731:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:5731:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:5732:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:5742:1: rule__RealValue__Group_1__0 : rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 ;
    public final void rule__RealValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5746:1: ( rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 )
            // InternalAlf.g:5747:2: rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:5754:1: rule__RealValue__Group_1__0__Impl : ( ( rule__RealValue__Alternatives_1_0 ) ) ;
    public final void rule__RealValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5758:1: ( ( ( rule__RealValue__Alternatives_1_0 ) ) )
            // InternalAlf.g:5759:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            {
            // InternalAlf.g:5759:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            // InternalAlf.g:5760:2: ( rule__RealValue__Alternatives_1_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_0()); 
            // InternalAlf.g:5761:2: ( rule__RealValue__Alternatives_1_0 )
            // InternalAlf.g:5761:3: rule__RealValue__Alternatives_1_0
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
    // InternalAlf.g:5769:1: rule__RealValue__Group_1__1 : rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 ;
    public final void rule__RealValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5773:1: ( rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 )
            // InternalAlf.g:5774:2: rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:5781:1: rule__RealValue__Group_1__1__Impl : ( ( rule__RealValue__Alternatives_1_1 )? ) ;
    public final void rule__RealValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5785:1: ( ( ( rule__RealValue__Alternatives_1_1 )? ) )
            // InternalAlf.g:5786:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            {
            // InternalAlf.g:5786:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            // InternalAlf.g:5787:2: ( rule__RealValue__Alternatives_1_1 )?
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_1()); 
            // InternalAlf.g:5788:2: ( rule__RealValue__Alternatives_1_1 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=19 && LA64_0<=20)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAlf.g:5788:3: rule__RealValue__Alternatives_1_1
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
    // InternalAlf.g:5796:1: rule__RealValue__Group_1__2 : rule__RealValue__Group_1__2__Impl ;
    public final void rule__RealValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5800:1: ( rule__RealValue__Group_1__2__Impl )
            // InternalAlf.g:5801:2: rule__RealValue__Group_1__2__Impl
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
    // InternalAlf.g:5807:1: rule__RealValue__Group_1__2__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5811:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:5812:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:5812:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:5813:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:5823:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0 : rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5827:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 )
            // InternalAlf.g:5828:2: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAlf.g:5835:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5839:1: ( ( () ) )
            // InternalAlf.g:5840:1: ( () )
            {
            // InternalAlf.g:5840:1: ( () )
            // InternalAlf.g:5841:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0()); 
            // InternalAlf.g:5842:2: ()
            // InternalAlf.g:5842:3: 
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
    // InternalAlf.g:5850:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1 : rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5854:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl )
            // InternalAlf.g:5855:2: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl
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
    // InternalAlf.g:5861:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl : ( '*' ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5865:1: ( ( '*' ) )
            // InternalAlf.g:5866:1: ( '*' )
            {
            // InternalAlf.g:5866:1: ( '*' )
            // InternalAlf.g:5867:2: '*'
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAlf.g:5877:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5881:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:5882:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAlf.g:5889:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5893:1: ( ( ruleName ) )
            // InternalAlf.g:5894:1: ( ruleName )
            {
            // InternalAlf.g:5894:1: ( ruleName )
            // InternalAlf.g:5895:2: ruleName
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
    // InternalAlf.g:5904:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5908:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:5909:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:5915:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5919:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:5920:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:5920:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:5921:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:5922:2: ( rule__QualifiedName__Group_1__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==50) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalAlf.g:5922:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalAlf.g:5931:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5935:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:5936:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAlf.g:5943:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5947:1: ( ( '.' ) )
            // InternalAlf.g:5948:1: ( '.' )
            {
            // InternalAlf.g:5948:1: ( '.' )
            // InternalAlf.g:5949:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalAlf.g:5958:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5962:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:5963:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAlf.g:5969:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5973:1: ( ( ruleName ) )
            // InternalAlf.g:5974:1: ( ruleName )
            {
            // InternalAlf.g:5974:1: ( ruleName )
            // InternalAlf.g:5975:2: ruleName
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
    // InternalAlf.g:5985:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5989:1: ( ( ruleName ) )
            // InternalAlf.g:5990:2: ( ruleName )
            {
            // InternalAlf.g:5990:2: ( ruleName )
            // InternalAlf.g:5991:3: ruleName
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
    // InternalAlf.g:6000:1: rule__PackageDefinition__OwnedMembershipAssignment_3 : ( rulePackageMember ) ;
    public final void rule__PackageDefinition__OwnedMembershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6004:1: ( ( rulePackageMember ) )
            // InternalAlf.g:6005:2: ( rulePackageMember )
            {
            // InternalAlf.g:6005:2: ( rulePackageMember )
            // InternalAlf.g:6006:3: rulePackageMember
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
    // InternalAlf.g:6015:1: rule__NonFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__NonFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6019:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:6020:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:6020:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:6021:3: ruleVisibilityIndicator
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
    // InternalAlf.g:6030:1: rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 : ( ruleNonFeatureDefinition ) ;
    public final void rule__NonFeatureMember__OwnedMemberElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6034:1: ( ( ruleNonFeatureDefinition ) )
            // InternalAlf.g:6035:2: ( ruleNonFeatureDefinition )
            {
            // InternalAlf.g:6035:2: ( ruleNonFeatureDefinition )
            // InternalAlf.g:6036:3: ruleNonFeatureDefinition
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
    // InternalAlf.g:6045:1: rule__NonFeatureMember__MemberNameAssignment_1_1_1 : ( ruleName ) ;
    public final void rule__NonFeatureMember__MemberNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6049:1: ( ( ruleName ) )
            // InternalAlf.g:6050:2: ( ruleName )
            {
            // InternalAlf.g:6050:2: ( ruleName )
            // InternalAlf.g:6051:3: ruleName
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
    // InternalAlf.g:6060:1: rule__NonFeatureMember__MemberElementAssignment_1_1_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFeatureMember__MemberElementAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6064:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6065:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6065:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6066:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementPackageCrossReference_1_1_3_0()); 
            // InternalAlf.g:6067:3: ( ruleQualifiedName )
            // InternalAlf.g:6068:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementPackageQualifiedNameParserRuleCall_1_1_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberAccess().getMemberElementPackageQualifiedNameParserRuleCall_1_1_3_0_1()); 

            }

             after(grammarAccess.getNonFeatureMemberAccess().getMemberElementPackageCrossReference_1_1_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__NonFeatureMember__MemberNameAssignment_1_2_1"
    // InternalAlf.g:6079:1: rule__NonFeatureMember__MemberNameAssignment_1_2_1 : ( ruleName ) ;
    public final void rule__NonFeatureMember__MemberNameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6083:1: ( ( ruleName ) )
            // InternalAlf.g:6084:2: ( ruleName )
            {
            // InternalAlf.g:6084:2: ( ruleName )
            // InternalAlf.g:6085:3: ruleName
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__MemberNameAssignment_1_2_1"


    // $ANTLR start "rule__NonFeatureMember__MemberElementAssignment_1_2_3"
    // InternalAlf.g:6094:1: rule__NonFeatureMember__MemberElementAssignment_1_2_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFeatureMember__MemberElementAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6098:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6099:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6099:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6100:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementClassCrossReference_1_2_3_0()); 
            // InternalAlf.g:6101:3: ( ruleQualifiedName )
            // InternalAlf.g:6102:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFeatureMemberAccess().getMemberElementClassQualifiedNameParserRuleCall_1_2_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFeatureMemberAccess().getMemberElementClassQualifiedNameParserRuleCall_1_2_3_0_1()); 

            }

             after(grammarAccess.getNonFeatureMemberAccess().getMemberElementClassCrossReference_1_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFeatureMember__MemberElementAssignment_1_2_3"


    // $ANTLR start "rule__PackagedFeatureMember__VisibilityAssignment_0"
    // InternalAlf.g:6113:1: rule__PackagedFeatureMember__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__PackagedFeatureMember__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6117:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:6118:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:6118:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:6119:3: ruleVisibilityIndicator
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
    // InternalAlf.g:6128:1: rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1 : ( ruleFeatureDefinition ) ;
    public final void rule__PackagedFeatureMember__OwnedMemberElementAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6132:1: ( ( ruleFeatureDefinition ) )
            // InternalAlf.g:6133:2: ( ruleFeatureDefinition )
            {
            // InternalAlf.g:6133:2: ( ruleFeatureDefinition )
            // InternalAlf.g:6134:3: ruleFeatureDefinition
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_1_0_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1"
    // InternalAlf.g:6143:1: rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1 : ( ruleName ) ;
    public final void rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6147:1: ( ( ruleName ) )
            // InternalAlf.g:6148:2: ( ruleName )
            {
            // InternalAlf.g:6148:2: ( ruleName )
            // InternalAlf.g:6149:3: ruleName
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_0_1"


    // $ANTLR start "rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1"
    // InternalAlf.g:6158:1: rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1 : ( ruleName ) ;
    public final void rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6162:1: ( ( ruleName ) )
            // InternalAlf.g:6163:2: ( ruleName )
            {
            // InternalAlf.g:6163:2: ( ruleName )
            // InternalAlf.g:6164:3: ruleName
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__MemberNameAssignment_1_1_0_1"


    // $ANTLR start "rule__PackagedFeatureMember__MemberElementAssignment_1_1_2"
    // InternalAlf.g:6173:1: rule__PackagedFeatureMember__MemberElementAssignment_1_1_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PackagedFeatureMember__MemberElementAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6177:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6178:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6178:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6179:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_1_2_0()); 
            // InternalAlf.g:6180:3: ( ruleQualifiedName )
            // InternalAlf.g:6181:4: ruleQualifiedName
            {
             before(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_1_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_1_1_2_0_1()); 

            }

             after(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagedFeatureMember__MemberElementAssignment_1_1_2"


    // $ANTLR start "rule__ClassDeclaration__IsAbstractAssignment_0"
    // InternalAlf.g:6192:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6196:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:6197:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:6197:2: ( ( 'abstract' ) )
            // InternalAlf.g:6198:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:6199:3: ( 'abstract' )
            // InternalAlf.g:6200:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalAlf.g:6211:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6215:1: ( ( ruleName ) )
            // InternalAlf.g:6216:2: ( ruleName )
            {
            // InternalAlf.g:6216:2: ( ruleName )
            // InternalAlf.g:6217:3: ruleName
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
    // InternalAlf.g:6226:1: rule__ClassDeclaration__OwnedMembershipAssignment_3_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedMembershipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6230:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:6231:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:6231:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:6232:3: ruleOwnedGeneralization
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
    // InternalAlf.g:6241:1: rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__OwnedMembershipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6245:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:6246:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:6246:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:6247:3: ruleOwnedGeneralization
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
    // InternalAlf.g:6256:1: rule__OwnedGeneralization__OwnedMemberElementAssignment : ( ruleGeneralization ) ;
    public final void rule__OwnedGeneralization__OwnedMemberElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6260:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:6261:2: ( ruleGeneralization )
            {
            // InternalAlf.g:6261:2: ( ruleGeneralization )
            // InternalAlf.g:6262:3: ruleGeneralization
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
    // InternalAlf.g:6271:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6275:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6276:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6276:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6277:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:6278:3: ( ruleQualifiedName )
            // InternalAlf.g:6279:4: ruleQualifiedName
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
    // InternalAlf.g:6290:1: rule__ClassDefinition__OwnedMembershipAssignment_2 : ( ruleClassMember ) ;
    public final void rule__ClassDefinition__OwnedMembershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6294:1: ( ( ruleClassMember ) )
            // InternalAlf.g:6295:2: ( ruleClassMember )
            {
            // InternalAlf.g:6295:2: ( ruleClassMember )
            // InternalAlf.g:6296:3: ruleClassMember
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


    // $ANTLR start "rule__ClassFeatureMember__VisibilityAssignment_0_0"
    // InternalAlf.g:6305:1: rule__ClassFeatureMember__VisibilityAssignment_0_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__ClassFeatureMember__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6309:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:6310:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:6310:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:6311:3: ruleVisibilityIndicator
            {
             before(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityIndicator();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__VisibilityAssignment_0_0"


    // $ANTLR start "rule__ClassFeatureMember__IsPortAssignment_0_1_1_0"
    // InternalAlf.g:6320:1: rule__ClassFeatureMember__IsPortAssignment_0_1_1_0 : ( ( 'port' ) ) ;
    public final void rule__ClassFeatureMember__IsPortAssignment_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6324:1: ( ( ( 'port' ) ) )
            // InternalAlf.g:6325:2: ( ( 'port' ) )
            {
            // InternalAlf.g:6325:2: ( ( 'port' ) )
            // InternalAlf.g:6326:3: ( 'port' )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_0_1_1_0_0()); 
            // InternalAlf.g:6327:3: ( 'port' )
            // InternalAlf.g:6328:4: 'port'
            {
             before(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_0_1_1_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_0_1_1_0_0()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_0_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__IsPortAssignment_0_1_1_0"


    // $ANTLR start "rule__ClassFeatureMember__DirectionAssignment_0_1_1_1"
    // InternalAlf.g:6339:1: rule__ClassFeatureMember__DirectionAssignment_0_1_1_1 : ( ruleFeatureDirection ) ;
    public final void rule__ClassFeatureMember__DirectionAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6343:1: ( ( ruleFeatureDirection ) )
            // InternalAlf.g:6344:2: ( ruleFeatureDirection )
            {
            // InternalAlf.g:6344:2: ( ruleFeatureDirection )
            // InternalAlf.g:6345:3: ruleFeatureDirection
            {
             before(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDirection();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__DirectionAssignment_0_1_1_1"


    // $ANTLR start "rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2"
    // InternalAlf.g:6354:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2 : ( ruleFeatureDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6358:1: ( ( ruleFeatureDefinition ) )
            // InternalAlf.g:6359:2: ( ruleFeatureDefinition )
            {
            // InternalAlf.g:6359:2: ( ruleFeatureDefinition )
            // InternalAlf.g:6360:3: ruleFeatureDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__OwnedMemberElementAssignment_0_2"


    // $ANTLR start "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1"
    // InternalAlf.g:6369:1: rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1 : ( ruleConnectorDefinition ) ;
    public final void rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6373:1: ( ( ruleConnectorDefinition ) )
            // InternalAlf.g:6374:2: ( ruleConnectorDefinition )
            {
            // InternalAlf.g:6374:2: ( ruleConnectorDefinition )
            // InternalAlf.g:6375:3: ruleConnectorDefinition
            {
             before(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectorDefinition();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__OwnedMemberElementAssignment_1_1"


    // $ANTLR start "rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1"
    // InternalAlf.g:6384:1: rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1 : ( ruleName ) ;
    public final void rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6388:1: ( ( ruleName ) )
            // InternalAlf.g:6389:2: ( ruleName )
            {
            // InternalAlf.g:6389:2: ( ruleName )
            // InternalAlf.g:6390:3: ruleName
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_2_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__MemberNameAssignment_2_0_0_1"


    // $ANTLR start "rule__ClassFeatureMember__MemberNameAssignment_2_0_1"
    // InternalAlf.g:6399:1: rule__ClassFeatureMember__MemberNameAssignment_2_0_1 : ( ruleName ) ;
    public final void rule__ClassFeatureMember__MemberNameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6403:1: ( ( ruleName ) )
            // InternalAlf.g:6404:2: ( ruleName )
            {
            // InternalAlf.g:6404:2: ( ruleName )
            // InternalAlf.g:6405:3: ruleName
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__MemberNameAssignment_2_0_1"


    // $ANTLR start "rule__ClassFeatureMember__MemberElementAssignment_2_2"
    // InternalAlf.g:6414:1: rule__ClassFeatureMember__MemberElementAssignment_2_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassFeatureMember__MemberElementAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6418:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6419:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6419:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6420:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementFeatureCrossReference_2_2_0()); 
            // InternalAlf.g:6421:3: ( ruleQualifiedName )
            // InternalAlf.g:6422:4: ruleQualifiedName
            {
             before(grammarAccess.getClassFeatureMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassFeatureMemberAccess().getMemberElementFeatureQualifiedNameParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getClassFeatureMemberAccess().getMemberElementFeatureCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFeatureMember__MemberElementAssignment_2_2"


    // $ANTLR start "rule__FeatureDefinition__NameAssignment_0_0"
    // InternalAlf.g:6433:1: rule__FeatureDefinition__NameAssignment_0_0 : ( ruleName ) ;
    public final void rule__FeatureDefinition__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6437:1: ( ( ruleName ) )
            // InternalAlf.g:6438:2: ( ruleName )
            {
            // InternalAlf.g:6438:2: ( ruleName )
            // InternalAlf.g:6439:3: ruleName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__NameAssignment_0_0"


    // $ANTLR start "rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1"
    // InternalAlf.g:6448:1: rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6452:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6453:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6453:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6454:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_0_1_1_0()); 
            // InternalAlf.g:6455:3: ( ruleQualifiedName )
            // InternalAlf.g:6456:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_0_1_1_0_1()); 

            }

             after(grammarAccess.getFeatureDefinitionAccess().getReferencedTypeClassCrossReference_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__ReferencedTypeAssignment_0_1_1"


    // $ANTLR start "rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2"
    // InternalAlf.g:6467:1: rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6471:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:6472:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:6472:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:6473:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__OwnedMembershipAssignment_0_1_2"


    // $ANTLR start "rule__FeatureDefinition__LowerAssignment_0_2_1_0"
    // InternalAlf.g:6482:1: rule__FeatureDefinition__LowerAssignment_0_2_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__LowerAssignment_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6486:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:6487:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:6487:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:6488:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_0_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_0_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__LowerAssignment_0_2_1_0"


    // $ANTLR start "rule__FeatureDefinition__UpperAssignment_0_2_2"
    // InternalAlf.g:6497:1: rule__FeatureDefinition__UpperAssignment_0_2_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__UpperAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6501:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:6502:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:6502:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:6503:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__UpperAssignment_0_2_2"


    // $ANTLR start "rule__FeatureDefinition__ValueAssignment_0_3_0_0_1"
    // InternalAlf.g:6512:1: rule__FeatureDefinition__ValueAssignment_0_3_0_0_1 : ( ruleExpression ) ;
    public final void rule__FeatureDefinition__ValueAssignment_0_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6516:1: ( ( ruleExpression ) )
            // InternalAlf.g:6517:2: ( ruleExpression )
            {
            // InternalAlf.g:6517:2: ( ruleExpression )
            // InternalAlf.g:6518:3: ruleExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getValueExpressionParserRuleCall_0_3_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getValueExpressionParserRuleCall_0_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__ValueAssignment_0_3_0_0_1"


    // $ANTLR start "rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1"
    // InternalAlf.g:6527:1: rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1 : ( ruleClassMember ) ;
    public final void rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6531:1: ( ( ruleClassMember ) )
            // InternalAlf.g:6532:2: ( ruleClassMember )
            {
            // InternalAlf.g:6532:2: ( ruleClassMember )
            // InternalAlf.g:6533:3: ruleClassMember
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_0_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__OwnedMembershipAssignment_0_3_1_1"


    // $ANTLR start "rule__FeatureDefinition__NameAssignment_1_0"
    // InternalAlf.g:6542:1: rule__FeatureDefinition__NameAssignment_1_0 : ( ruleName ) ;
    public final void rule__FeatureDefinition__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6546:1: ( ( ruleName ) )
            // InternalAlf.g:6547:2: ( ruleName )
            {
            // InternalAlf.g:6547:2: ( ruleName )
            // InternalAlf.g:6548:3: ruleName
            {
             before(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__NameAssignment_1_0"


    // $ANTLR start "rule__FeatureDefinition__OwnedMembershipAssignment_1_1"
    // InternalAlf.g:6557:1: rule__FeatureDefinition__OwnedMembershipAssignment_1_1 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__FeatureDefinition__OwnedMembershipAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6561:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:6562:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:6562:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:6563:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__OwnedMembershipAssignment_1_1"


    // $ANTLR start "rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0"
    // InternalAlf.g:6572:1: rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6576:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:6577:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:6577:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:6578:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_2_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_2_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__LowerAssignment_1_2_0_0_1_0"


    // $ANTLR start "rule__FeatureDefinition__UpperAssignment_1_2_0_0_2"
    // InternalAlf.g:6587:1: rule__FeatureDefinition__UpperAssignment_1_2_0_0_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__UpperAssignment_1_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6591:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:6592:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:6592:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:6593:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_2_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_2_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__UpperAssignment_1_2_0_0_2"


    // $ANTLR start "rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1"
    // InternalAlf.g:6602:1: rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1 : ( ruleExpression ) ;
    public final void rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6606:1: ( ( ruleExpression ) )
            // InternalAlf.g:6607:2: ( ruleExpression )
            {
            // InternalAlf.g:6607:2: ( ruleExpression )
            // InternalAlf.g:6608:3: ruleExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_2_0_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_2_0_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__ValueAssignment_1_2_0_1_0_1"


    // $ANTLR start "rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1"
    // InternalAlf.g:6617:1: rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1 : ( ruleClassMember ) ;
    public final void rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6621:1: ( ( ruleClassMember ) )
            // InternalAlf.g:6622:2: ( ruleClassMember )
            {
            // InternalAlf.g:6622:2: ( ruleClassMember )
            // InternalAlf.g:6623:3: ruleClassMember
            {
             before(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_2_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_2_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__OwnedMembershipAssignment_1_2_0_1_1_1"


    // $ANTLR start "rule__FeatureDefinition__LowerAssignment_1_2_1_1_0"
    // InternalAlf.g:6632:1: rule__FeatureDefinition__LowerAssignment_1_2_1_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__LowerAssignment_1_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6636:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:6637:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:6637:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:6638:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_2_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_2_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__LowerAssignment_1_2_1_1_0"


    // $ANTLR start "rule__FeatureDefinition__UpperAssignment_1_2_1_2"
    // InternalAlf.g:6647:1: rule__FeatureDefinition__UpperAssignment_1_2_1_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__FeatureDefinition__UpperAssignment_1_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6651:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:6652:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:6652:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:6653:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDefinition__UpperAssignment_1_2_1_2"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1"
    // InternalAlf.g:6662:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 : ( ruleRedefinition ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6666:1: ( ( ruleRedefinition ) )
            // InternalAlf.g:6667:2: ( ruleRedefinition )
            {
            // InternalAlf.g:6667:2: ( ruleRedefinition )
            // InternalAlf.g:6668:3: ruleRedefinition
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
    // InternalAlf.g:6677:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 : ( ruleSubset ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6681:1: ( ( ruleSubset ) )
            // InternalAlf.g:6682:2: ( ruleSubset )
            {
            // InternalAlf.g:6682:2: ( ruleSubset )
            // InternalAlf.g:6683:3: ruleSubset
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
    // InternalAlf.g:6692:1: rule__Redefinition__RedefinedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Redefinition__RedefinedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6696:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6697:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6697:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6698:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:6699:3: ( ruleQualifiedName )
            // InternalAlf.g:6700:4: ruleQualifiedName
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
    // InternalAlf.g:6711:1: rule__Subset__SubsettedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Subset__SubsettedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6715:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6716:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6716:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6717:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:6718:3: ( ruleQualifiedName )
            // InternalAlf.g:6719:4: ruleQualifiedName
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


    // $ANTLR start "rule__ConnectorDefinition__NameAssignment_0"
    // InternalAlf.g:6730:1: rule__ConnectorDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__ConnectorDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6734:1: ( ( ruleName ) )
            // InternalAlf.g:6735:2: ( ruleName )
            {
            // InternalAlf.g:6735:2: ( ruleName )
            // InternalAlf.g:6736:3: ruleName
            {
             before(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__NameAssignment_0"


    // $ANTLR start "rule__ConnectorDefinition__SourceFeatureAssignment_1"
    // InternalAlf.g:6745:1: rule__ConnectorDefinition__SourceFeatureAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__SourceFeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6749:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6750:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6750:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6751:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0()); 
            // InternalAlf.g:6752:3: ( ruleQualifiedName )
            // InternalAlf.g:6753:4: ruleQualifiedName
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
    // InternalAlf.g:6764:1: rule__ConnectorDefinition__TargetFeatureAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__TargetFeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6768:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6769:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6769:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6770:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0()); 
            // InternalAlf.g:6771:3: ( ruleQualifiedName )
            // InternalAlf.g:6772:4: ruleQualifiedName
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
    // InternalAlf.g:6783:1: rule__BinaryExpression__OperatorAssignment_1_1_0_0 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6787:1: ( ( ruleBinaryOperator ) )
            // InternalAlf.g:6788:2: ( ruleBinaryOperator )
            {
            // InternalAlf.g:6788:2: ( ruleBinaryOperator )
            // InternalAlf.g:6789:3: ruleBinaryOperator
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
    // InternalAlf.g:6798:1: rule__BinaryExpression__OperandAssignment_1_1_0_1 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6802:1: ( ( ruleExpression ) )
            // InternalAlf.g:6803:2: ( ruleExpression )
            {
            // InternalAlf.g:6803:2: ( ruleExpression )
            // InternalAlf.g:6804:3: ruleExpression
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
    // InternalAlf.g:6813:1: rule__BinaryExpression__OperatorAssignment_1_1_1_0 : ( ( '@' ) ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6817:1: ( ( ( '@' ) ) )
            // InternalAlf.g:6818:2: ( ( '@' ) )
            {
            // InternalAlf.g:6818:2: ( ( '@' ) )
            // InternalAlf.g:6819:3: ( '@' )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 
            // InternalAlf.g:6820:3: ( '@' )
            // InternalAlf.g:6821:4: '@'
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAlf.g:6832:1: rule__BinaryExpression__OperandAssignment_1_1_1_2 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6836:1: ( ( ruleExpression ) )
            // InternalAlf.g:6837:2: ( ruleExpression )
            {
            // InternalAlf.g:6837:2: ( ruleExpression )
            // InternalAlf.g:6838:3: ruleExpression
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
    // InternalAlf.g:6847:1: rule__UnaryExpression__OperatorAssignment_1_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6851:1: ( ( ruleUnaryOperator ) )
            // InternalAlf.g:6852:2: ( ruleUnaryOperator )
            {
            // InternalAlf.g:6852:2: ( ruleUnaryOperator )
            // InternalAlf.g:6853:3: ruleUnaryOperator
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
    // InternalAlf.g:6862:1: rule__UnaryExpression__OperandAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6866:1: ( ( rulePrimaryExpression ) )
            // InternalAlf.g:6867:2: ( rulePrimaryExpression )
            {
            // InternalAlf.g:6867:2: ( rulePrimaryExpression )
            // InternalAlf.g:6868:3: rulePrimaryExpression
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
    // InternalAlf.g:6877:1: rule__ElementReferenceExpression__ReferentAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementReferenceExpression__ReferentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6881:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6882:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6882:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6883:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0()); 
            // InternalAlf.g:6884:3: ( ruleQualifiedName )
            // InternalAlf.g:6885:4: ruleQualifiedName
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
    // InternalAlf.g:6896:1: rule__InstanceCreationExpression__ClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InstanceCreationExpression__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6900:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6901:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6901:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6902:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0()); 
            // InternalAlf.g:6903:3: ( ruleQualifiedName )
            // InternalAlf.g:6904:4: ruleQualifiedName
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
    // InternalAlf.g:6915:1: rule__InstanceCreationExpression__ArgumentAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6919:1: ( ( ruleExpression ) )
            // InternalAlf.g:6920:2: ( ruleExpression )
            {
            // InternalAlf.g:6920:2: ( ruleExpression )
            // InternalAlf.g:6921:3: ruleExpression
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
    // InternalAlf.g:6930:1: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6934:1: ( ( ruleExpression ) )
            // InternalAlf.g:6935:2: ( ruleExpression )
            {
            // InternalAlf.g:6935:2: ( ruleExpression )
            // InternalAlf.g:6936:3: ruleExpression
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
    // InternalAlf.g:6945:1: rule__SequenceConstructionExpression__ElementAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6949:1: ( ( ruleExpression ) )
            // InternalAlf.g:6950:2: ( ruleExpression )
            {
            // InternalAlf.g:6950:2: ( ruleExpression )
            // InternalAlf.g:6951:3: ruleExpression
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
    // InternalAlf.g:6960:1: rule__SequenceConstructionExpression__ElementAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6964:1: ( ( ruleExpression ) )
            // InternalAlf.g:6965:2: ( ruleExpression )
            {
            // InternalAlf.g:6965:2: ( ruleExpression )
            // InternalAlf.g:6966:3: ruleExpression
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
    // InternalAlf.g:6975:1: rule__BooleanLiteralExpression__ValueAssignment : ( RULE_BOOLEAN_VALUE ) ;
    public final void rule__BooleanLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6979:1: ( ( RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:6980:2: ( RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:6980:2: ( RULE_BOOLEAN_VALUE )
            // InternalAlf.g:6981:3: RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:6990:1: rule__StringLiteralExpression__ValueAssignment : ( RULE_STRING_VALUE ) ;
    public final void rule__StringLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6994:1: ( ( RULE_STRING_VALUE ) )
            // InternalAlf.g:6995:2: ( RULE_STRING_VALUE )
            {
            // InternalAlf.g:6995:2: ( RULE_STRING_VALUE )
            // InternalAlf.g:6996:3: RULE_STRING_VALUE
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
    // InternalAlf.g:7005:1: rule__RealLiteralExpression__ValueAssignment : ( ruleRealValue ) ;
    public final void rule__RealLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7009:1: ( ( ruleRealValue ) )
            // InternalAlf.g:7010:2: ( ruleRealValue )
            {
            // InternalAlf.g:7010:2: ( ruleRealValue )
            // InternalAlf.g:7011:3: ruleRealValue
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
    // InternalAlf.g:7020:1: rule__NaturalLiteralExpression__ValueAssignment : ( RULE_NATURAL_VALUE ) ;
    public final void rule__NaturalLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:7024:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:7025:2: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:7025:2: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:7026:3: RULE_NATURAL_VALUE
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
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\41\1\4\1\uffff\1\4\2\17\1\uffff\2\17\1\uffff\1\4\2\42\1\4\2\42";
    static final String dfa_3s = "\1\63\1\17\1\uffff\1\17\2\42\1\uffff\2\42\1\uffff\1\5\2\62\1\5\2\62";
    static final String dfa_4s = "\2\uffff\1\1\3\uffff\1\2\2\uffff\1\3\6\uffff";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\3\15\uffff\1\2",
            "\1\4\1\5\11\uffff\1\6",
            "",
            "\1\7\1\10\11\uffff\1\11",
            "\1\6\22\uffff\1\2",
            "\1\6\22\uffff\1\2",
            "",
            "\1\12\1\2\21\uffff\1\2",
            "\1\12\1\2\21\uffff\1\2",
            "",
            "\1\13\1\14",
            "\1\2\1\uffff\1\11\1\uffff\1\2\13\uffff\1\15",
            "\1\2\1\uffff\1\11\1\uffff\1\2\13\uffff\1\15",
            "\1\16\1\17",
            "\1\2\1\uffff\1\11\1\uffff\1\2\13\uffff\1\15",
            "\1\2\1\uffff\1\11\1\uffff\1\2\13\uffff\1\15"
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
            return "1101:1: rule__NonFeatureMember__Alternatives_1 : ( ( ( rule__NonFeatureMember__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__NonFeatureMember__Group_1_1__0 ) ) | ( ( rule__NonFeatureMember__Group_1_2__0 ) ) );";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\2\4\2\17\1\uffff\2\17\1\4\2\42\1\4\1\uffff\2\42";
    static final String dfa_9s = "\4\55\1\uffff\2\55\1\5\2\62\1\5\1\uffff\2\62";
    static final String dfa_10s = "\4\uffff\1\1\6\uffff\1\2\2\uffff";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\11\uffff\1\4\1\uffff\1\1\1\4\32\uffff\1\4",
            "\1\5\1\6\11\uffff\1\7\2\uffff\1\4\32\uffff\1\4",
            "\1\7\2\uffff\1\4\17\uffff\1\4\1\uffff\1\4\3\uffff\2\4\2\uffff\2\4",
            "\1\7\2\uffff\1\4\17\uffff\1\4\1\uffff\1\4\3\uffff\2\4\2\uffff\2\4",
            "",
            "\1\7\2\uffff\1\4\17\uffff\1\4\1\uffff\1\4\3\uffff\2\4\2\uffff\2\4",
            "\1\7\2\uffff\1\4\17\uffff\1\4\1\uffff\1\4\3\uffff\2\4\2\uffff\2\4",
            "\1\10\1\11",
            "\1\4\1\uffff\1\13\4\uffff\1\4\2\uffff\1\4\5\uffff\1\12",
            "\1\4\1\uffff\1\13\4\uffff\1\4\2\uffff\1\4\5\uffff\1\12",
            "\1\14\1\15",
            "",
            "\1\4\1\uffff\1\13\4\uffff\1\4\2\uffff\1\4\5\uffff\1\12",
            "\1\4\1\uffff\1\13\4\uffff\1\4\2\uffff\1\4\5\uffff\1\12"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1128:1: rule__PackagedFeatureMember__Alternatives_1 : ( ( ( rule__PackagedFeatureMember__Group_1_0__0 ) ) | ( ( rule__PackagedFeatureMember__Group_1_1__0 ) ) );";
        }
    }
    static final String dfa_13s = "\17\uffff";
    static final String dfa_14s = "\1\4\1\uffff\1\4\2\17\1\uffff\2\17\1\4\2\42\1\4\1\uffff\2\42";
    static final String dfa_15s = "\1\64\1\uffff\3\55\1\uffff\2\55\1\5\2\62\1\5\1\uffff\2\62";
    static final String dfa_16s = "\1\uffff\1\1\3\uffff\1\2\6\uffff\1\3\2\uffff";
    static final String dfa_17s = "\17\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\1\4\11\uffff\1\1\1\uffff\1\2\1\1\7\uffff\4\1\11\uffff\1\5\5\uffff\1\1\6\uffff\1\1",
            "",
            "\1\6\1\7\11\uffff\1\10\2\uffff\1\1\32\uffff\1\1",
            "\1\10\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\3\uffff\2\1\2\uffff\2\1",
            "\1\10\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\3\uffff\2\1\2\uffff\2\1",
            "",
            "\1\10\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\3\uffff\2\1\2\uffff\2\1",
            "\1\10\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\3\uffff\2\1\2\uffff\2\1",
            "\1\11\1\12",
            "\1\1\1\uffff\1\14\4\uffff\1\1\2\uffff\1\1\5\uffff\1\13",
            "\1\1\1\uffff\1\14\4\uffff\1\1\2\uffff\1\1\5\uffff\1\13",
            "\1\15\1\16",
            "",
            "\1\1\1\uffff\1\14\4\uffff\1\1\2\uffff\1\1\5\uffff\1\13",
            "\1\1\1\uffff\1\14\4\uffff\1\1\2\uffff\1\1\5\uffff\1\13"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1233:1: rule__ClassFeatureMember__Alternatives : ( ( ( rule__ClassFeatureMember__Group_0__0 ) ) | ( ( rule__ClassFeatureMember__Group_1__0 ) ) | ( ( rule__ClassFeatureMember__Group_2__0 ) ) );";
        }
    }
    static final String dfa_19s = "\13\uffff";
    static final String dfa_20s = "\2\uffff\2\7\5\uffff\2\7";
    static final String dfa_21s = "\1\4\1\uffff\2\23\2\uffff\1\4\2\uffff\2\23";
    static final String dfa_22s = "\1\62\1\uffff\2\65\2\uffff\1\5\2\uffff\2\65";
    static final String dfa_23s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\2\1\3\2\uffff";
    static final String dfa_24s = "\13\uffff}>";
    static final String[] dfa_25s = {
            "\1\2\1\3\3\1\14\uffff\1\1\14\uffff\1\4\14\uffff\1\5\1\uffff\2\1",
            "",
            "\5\7\13\uffff\2\7\1\uffff\1\7\3\uffff\1\7\4\uffff\1\10\1\7\1\uffff\1\6\2\uffff\1\7",
            "\5\7\13\uffff\2\7\1\uffff\1\7\3\uffff\1\7\4\uffff\1\10\1\7\1\uffff\1\6\2\uffff\1\7",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\5\7\13\uffff\2\7\1\uffff\1\7\3\uffff\1\7\4\uffff\1\10\1\7\1\uffff\1\6\2\uffff\1\7",
            "\5\7\13\uffff\2\7\1\uffff\1\7\3\uffff\1\7\4\uffff\1\10\1\7\1\uffff\1\6\2\uffff\1\7"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1530:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008202A3C068030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000820223C068032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000800223C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000820223C068030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000068030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0008002200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x001820AA3C068030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x001820A23C068032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x001020003C068030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000131400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00068004003801F0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000120400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000F80000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00068004002001F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00078004003801F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0006800C003801F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000002L});

}