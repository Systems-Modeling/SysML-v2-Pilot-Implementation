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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_NATURAL_VALUE", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_DOCUMENTATION_COMMENT", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'class'", "'feature'", "'is'", "'specializes'", "'redefines'", "'+'", "'-'", "'*'", "'/'", "'^'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'", "'{'", "'}'", "';'", "','", "':'", "'['", "']'", "'..'", "'='", "'subsets'", "'connector'", "'=>'", "'('", "')'", "'null'", "'.'", "'abstract'", "'port'", "'@'"
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


    // $ANTLR start "entryRuleOwnedGeneralization"
    // InternalAlf.g:253:1: entryRuleOwnedGeneralization : ruleOwnedGeneralization EOF ;
    public final void entryRuleOwnedGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:254:1: ( ruleOwnedGeneralization EOF )
            // InternalAlf.g:255:1: ruleOwnedGeneralization EOF
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
    // InternalAlf.g:262:1: ruleOwnedGeneralization : ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) ) ;
    public final void ruleOwnedGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:266:2: ( ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) ) )
            // InternalAlf.g:267:2: ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) )
            {
            // InternalAlf.g:267:2: ( ( rule__OwnedGeneralization__OwnedMemberElementAssignment ) )
            // InternalAlf.g:268:3: ( rule__OwnedGeneralization__OwnedMemberElementAssignment )
            {
             before(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementAssignment()); 
            // InternalAlf.g:269:3: ( rule__OwnedGeneralization__OwnedMemberElementAssignment )
            // InternalAlf.g:269:4: rule__OwnedGeneralization__OwnedMemberElementAssignment
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
    // InternalAlf.g:278:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalAlf.g:279:1: ( ruleGeneralization EOF )
            // InternalAlf.g:280:1: ruleGeneralization EOF
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
    // InternalAlf.g:287:1: ruleGeneralization : ( ( rule__Generalization__GeneralAssignment ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:291:2: ( ( ( rule__Generalization__GeneralAssignment ) ) )
            // InternalAlf.g:292:2: ( ( rule__Generalization__GeneralAssignment ) )
            {
            // InternalAlf.g:292:2: ( ( rule__Generalization__GeneralAssignment ) )
            // InternalAlf.g:293:3: ( rule__Generalization__GeneralAssignment )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment()); 
            // InternalAlf.g:294:3: ( rule__Generalization__GeneralAssignment )
            // InternalAlf.g:294:4: rule__Generalization__GeneralAssignment
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
    // InternalAlf.g:303:1: entryRuleClassDefinition : ruleClassDefinition EOF ;
    public final void entryRuleClassDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:304:1: ( ruleClassDefinition EOF )
            // InternalAlf.g:305:1: ruleClassDefinition EOF
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
    // InternalAlf.g:312:1: ruleClassDefinition : ( ( rule__ClassDefinition__Group__0 ) ) ;
    public final void ruleClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:316:2: ( ( ( rule__ClassDefinition__Group__0 ) ) )
            // InternalAlf.g:317:2: ( ( rule__ClassDefinition__Group__0 ) )
            {
            // InternalAlf.g:317:2: ( ( rule__ClassDefinition__Group__0 ) )
            // InternalAlf.g:318:3: ( rule__ClassDefinition__Group__0 )
            {
             before(grammarAccess.getClassDefinitionAccess().getGroup()); 
            // InternalAlf.g:319:3: ( rule__ClassDefinition__Group__0 )
            // InternalAlf.g:319:4: rule__ClassDefinition__Group__0
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
    // InternalAlf.g:328:1: entryRuleClassDefinitionOrStub : ruleClassDefinitionOrStub EOF ;
    public final void entryRuleClassDefinitionOrStub() throws RecognitionException {
        try {
            // InternalAlf.g:329:1: ( ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:330:1: ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:337:1: ruleClassDefinitionOrStub : ( ruleClassDefinition ) ;
    public final void ruleClassDefinitionOrStub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:341:2: ( ( ruleClassDefinition ) )
            // InternalAlf.g:342:2: ( ruleClassDefinition )
            {
            // InternalAlf.g:342:2: ( ruleClassDefinition )
            // InternalAlf.g:343:3: ruleClassDefinition
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
    // InternalAlf.g:353:1: entryRuleFeatureDefinition : ruleFeatureDefinition EOF ;
    public final void entryRuleFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:354:1: ( ruleFeatureDefinition EOF )
            // InternalAlf.g:355:1: ruleFeatureDefinition EOF
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
    // InternalAlf.g:362:1: ruleFeatureDefinition : ( ( rule__FeatureDefinition__Alternatives ) ) ;
    public final void ruleFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:366:2: ( ( ( rule__FeatureDefinition__Alternatives ) ) )
            // InternalAlf.g:367:2: ( ( rule__FeatureDefinition__Alternatives ) )
            {
            // InternalAlf.g:367:2: ( ( rule__FeatureDefinition__Alternatives ) )
            // InternalAlf.g:368:3: ( rule__FeatureDefinition__Alternatives )
            {
             before(grammarAccess.getFeatureDefinitionAccess().getAlternatives()); 
            // InternalAlf.g:369:3: ( rule__FeatureDefinition__Alternatives )
            // InternalAlf.g:369:4: rule__FeatureDefinition__Alternatives
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


    // $ANTLR start "entryRuleBasicFeatureDefinition"
    // InternalAlf.g:378:1: entryRuleBasicFeatureDefinition : ruleBasicFeatureDefinition EOF ;
    public final void entryRuleBasicFeatureDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:379:1: ( ruleBasicFeatureDefinition EOF )
            // InternalAlf.g:380:1: ruleBasicFeatureDefinition EOF
            {
             before(grammarAccess.getBasicFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicFeatureDefinition();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicFeatureDefinition"


    // $ANTLR start "ruleBasicFeatureDefinition"
    // InternalAlf.g:387:1: ruleBasicFeatureDefinition : ( ( rule__BasicFeatureDefinition__Group__0 ) ) ;
    public final void ruleBasicFeatureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:391:2: ( ( ( rule__BasicFeatureDefinition__Group__0 ) ) )
            // InternalAlf.g:392:2: ( ( rule__BasicFeatureDefinition__Group__0 ) )
            {
            // InternalAlf.g:392:2: ( ( rule__BasicFeatureDefinition__Group__0 ) )
            // InternalAlf.g:393:3: ( rule__BasicFeatureDefinition__Group__0 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup()); 
            // InternalAlf.g:394:3: ( rule__BasicFeatureDefinition__Group__0 )
            // InternalAlf.g:394:4: rule__BasicFeatureDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicFeatureDefinition"


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:403:1: entryRuleOwnedRedefinitionOrSubset : ruleOwnedRedefinitionOrSubset EOF ;
    public final void entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        try {
            // InternalAlf.g:404:1: ( ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:405:1: ruleOwnedRedefinitionOrSubset EOF
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
    // InternalAlf.g:412:1: ruleOwnedRedefinitionOrSubset : ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) ) ;
    public final void ruleOwnedRedefinitionOrSubset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:416:2: ( ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) ) )
            // InternalAlf.g:417:2: ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) )
            {
            // InternalAlf.g:417:2: ( ( rule__OwnedRedefinitionOrSubset__Alternatives ) )
            // InternalAlf.g:418:3: ( rule__OwnedRedefinitionOrSubset__Alternatives )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives()); 
            // InternalAlf.g:419:3: ( rule__OwnedRedefinitionOrSubset__Alternatives )
            // InternalAlf.g:419:4: rule__OwnedRedefinitionOrSubset__Alternatives
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
    // InternalAlf.g:428:1: entryRuleRedefinition : ruleRedefinition EOF ;
    public final void entryRuleRedefinition() throws RecognitionException {
        try {
            // InternalAlf.g:429:1: ( ruleRedefinition EOF )
            // InternalAlf.g:430:1: ruleRedefinition EOF
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
    // InternalAlf.g:437:1: ruleRedefinition : ( ( rule__Redefinition__RedefinedFeatureAssignment ) ) ;
    public final void ruleRedefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:441:2: ( ( ( rule__Redefinition__RedefinedFeatureAssignment ) ) )
            // InternalAlf.g:442:2: ( ( rule__Redefinition__RedefinedFeatureAssignment ) )
            {
            // InternalAlf.g:442:2: ( ( rule__Redefinition__RedefinedFeatureAssignment ) )
            // InternalAlf.g:443:3: ( rule__Redefinition__RedefinedFeatureAssignment )
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureAssignment()); 
            // InternalAlf.g:444:3: ( rule__Redefinition__RedefinedFeatureAssignment )
            // InternalAlf.g:444:4: rule__Redefinition__RedefinedFeatureAssignment
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
    // InternalAlf.g:453:1: entryRuleSubset : ruleSubset EOF ;
    public final void entryRuleSubset() throws RecognitionException {
        try {
            // InternalAlf.g:454:1: ( ruleSubset EOF )
            // InternalAlf.g:455:1: ruleSubset EOF
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
    // InternalAlf.g:462:1: ruleSubset : ( ( rule__Subset__SubsettedFeatureAssignment ) ) ;
    public final void ruleSubset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:466:2: ( ( ( rule__Subset__SubsettedFeatureAssignment ) ) )
            // InternalAlf.g:467:2: ( ( rule__Subset__SubsettedFeatureAssignment ) )
            {
            // InternalAlf.g:467:2: ( ( rule__Subset__SubsettedFeatureAssignment ) )
            // InternalAlf.g:468:3: ( rule__Subset__SubsettedFeatureAssignment )
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureAssignment()); 
            // InternalAlf.g:469:3: ( rule__Subset__SubsettedFeatureAssignment )
            // InternalAlf.g:469:4: rule__Subset__SubsettedFeatureAssignment
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
    // InternalAlf.g:478:1: entryRuleConnectorDefinition : ruleConnectorDefinition EOF ;
    public final void entryRuleConnectorDefinition() throws RecognitionException {
        try {
            // InternalAlf.g:479:1: ( ruleConnectorDefinition EOF )
            // InternalAlf.g:480:1: ruleConnectorDefinition EOF
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
    // InternalAlf.g:487:1: ruleConnectorDefinition : ( ( rule__ConnectorDefinition__Group__0 ) ) ;
    public final void ruleConnectorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:491:2: ( ( ( rule__ConnectorDefinition__Group__0 ) ) )
            // InternalAlf.g:492:2: ( ( rule__ConnectorDefinition__Group__0 ) )
            {
            // InternalAlf.g:492:2: ( ( rule__ConnectorDefinition__Group__0 ) )
            // InternalAlf.g:493:3: ( rule__ConnectorDefinition__Group__0 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getGroup()); 
            // InternalAlf.g:494:3: ( rule__ConnectorDefinition__Group__0 )
            // InternalAlf.g:494:4: rule__ConnectorDefinition__Group__0
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
    // InternalAlf.g:503:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAlf.g:504:1: ( ruleExpression EOF )
            // InternalAlf.g:505:1: ruleExpression EOF
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
    // InternalAlf.g:512:1: ruleExpression : ( ruleBinaryExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:516:2: ( ( ruleBinaryExpression ) )
            // InternalAlf.g:517:2: ( ruleBinaryExpression )
            {
            // InternalAlf.g:517:2: ( ruleBinaryExpression )
            // InternalAlf.g:518:3: ruleBinaryExpression
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
    // InternalAlf.g:528:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:529:1: ( ruleBinaryExpression EOF )
            // InternalAlf.g:530:1: ruleBinaryExpression EOF
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
    // InternalAlf.g:537:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:541:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalAlf.g:542:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalAlf.g:542:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalAlf.g:543:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalAlf.g:544:3: ( rule__BinaryExpression__Group__0 )
            // InternalAlf.g:544:4: rule__BinaryExpression__Group__0
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
    // InternalAlf.g:553:1: entryRuleBinaryOperator : ruleBinaryOperator EOF ;
    public final void entryRuleBinaryOperator() throws RecognitionException {
        try {
            // InternalAlf.g:554:1: ( ruleBinaryOperator EOF )
            // InternalAlf.g:555:1: ruleBinaryOperator EOF
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
    // InternalAlf.g:562:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:566:2: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // InternalAlf.g:567:2: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // InternalAlf.g:567:2: ( ( rule__BinaryOperator__Alternatives ) )
            // InternalAlf.g:568:3: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // InternalAlf.g:569:3: ( rule__BinaryOperator__Alternatives )
            // InternalAlf.g:569:4: rule__BinaryOperator__Alternatives
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
    // InternalAlf.g:578:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:579:1: ( ruleUnaryExpression EOF )
            // InternalAlf.g:580:1: ruleUnaryExpression EOF
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
    // InternalAlf.g:587:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:591:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalAlf.g:592:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalAlf.g:592:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalAlf.g:593:3: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // InternalAlf.g:594:3: ( rule__UnaryExpression__Alternatives )
            // InternalAlf.g:594:4: rule__UnaryExpression__Alternatives
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
    // InternalAlf.g:603:1: entryRuleUnaryOperator : ruleUnaryOperator EOF ;
    public final void entryRuleUnaryOperator() throws RecognitionException {
        try {
            // InternalAlf.g:604:1: ( ruleUnaryOperator EOF )
            // InternalAlf.g:605:1: ruleUnaryOperator EOF
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
    // InternalAlf.g:612:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:616:2: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalAlf.g:617:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalAlf.g:617:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalAlf.g:618:3: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // InternalAlf.g:619:3: ( rule__UnaryOperator__Alternatives )
            // InternalAlf.g:619:4: rule__UnaryOperator__Alternatives
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
    // InternalAlf.g:628:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalAlf.g:629:1: ( rulePrimaryExpression EOF )
            // InternalAlf.g:630:1: rulePrimaryExpression EOF
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
    // InternalAlf.g:637:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:641:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalAlf.g:642:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalAlf.g:642:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalAlf.g:643:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalAlf.g:644:3: ( rule__PrimaryExpression__Alternatives )
            // InternalAlf.g:644:4: rule__PrimaryExpression__Alternatives
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
    // InternalAlf.g:653:1: entryRuleElementReferenceExpression : ruleElementReferenceExpression EOF ;
    public final void entryRuleElementReferenceExpression() throws RecognitionException {
        try {
            // InternalAlf.g:654:1: ( ruleElementReferenceExpression EOF )
            // InternalAlf.g:655:1: ruleElementReferenceExpression EOF
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
    // InternalAlf.g:662:1: ruleElementReferenceExpression : ( ( rule__ElementReferenceExpression__ReferentAssignment ) ) ;
    public final void ruleElementReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:666:2: ( ( ( rule__ElementReferenceExpression__ReferentAssignment ) ) )
            // InternalAlf.g:667:2: ( ( rule__ElementReferenceExpression__ReferentAssignment ) )
            {
            // InternalAlf.g:667:2: ( ( rule__ElementReferenceExpression__ReferentAssignment ) )
            // InternalAlf.g:668:3: ( rule__ElementReferenceExpression__ReferentAssignment )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentAssignment()); 
            // InternalAlf.g:669:3: ( rule__ElementReferenceExpression__ReferentAssignment )
            // InternalAlf.g:669:4: rule__ElementReferenceExpression__ReferentAssignment
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
    // InternalAlf.g:678:1: entryRuleInstanceCreationExpression : ruleInstanceCreationExpression EOF ;
    public final void entryRuleInstanceCreationExpression() throws RecognitionException {
        try {
            // InternalAlf.g:679:1: ( ruleInstanceCreationExpression EOF )
            // InternalAlf.g:680:1: ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:687:1: ruleInstanceCreationExpression : ( ( rule__InstanceCreationExpression__Group__0 ) ) ;
    public final void ruleInstanceCreationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:691:2: ( ( ( rule__InstanceCreationExpression__Group__0 ) ) )
            // InternalAlf.g:692:2: ( ( rule__InstanceCreationExpression__Group__0 ) )
            {
            // InternalAlf.g:692:2: ( ( rule__InstanceCreationExpression__Group__0 ) )
            // InternalAlf.g:693:3: ( rule__InstanceCreationExpression__Group__0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup()); 
            // InternalAlf.g:694:3: ( rule__InstanceCreationExpression__Group__0 )
            // InternalAlf.g:694:4: rule__InstanceCreationExpression__Group__0
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
    // InternalAlf.g:703:1: entryRuleSequenceConstructionExpression : ruleSequenceConstructionExpression EOF ;
    public final void entryRuleSequenceConstructionExpression() throws RecognitionException {
        try {
            // InternalAlf.g:704:1: ( ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:705:1: ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:712:1: ruleSequenceConstructionExpression : ( ( rule__SequenceConstructionExpression__Group__0 ) ) ;
    public final void ruleSequenceConstructionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:716:2: ( ( ( rule__SequenceConstructionExpression__Group__0 ) ) )
            // InternalAlf.g:717:2: ( ( rule__SequenceConstructionExpression__Group__0 ) )
            {
            // InternalAlf.g:717:2: ( ( rule__SequenceConstructionExpression__Group__0 ) )
            // InternalAlf.g:718:3: ( rule__SequenceConstructionExpression__Group__0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup()); 
            // InternalAlf.g:719:3: ( rule__SequenceConstructionExpression__Group__0 )
            // InternalAlf.g:719:4: rule__SequenceConstructionExpression__Group__0
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
    // InternalAlf.g:728:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:729:1: ( ruleLiteralExpression EOF )
            // InternalAlf.g:730:1: ruleLiteralExpression EOF
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
    // InternalAlf.g:737:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:741:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalAlf.g:742:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:742:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalAlf.g:743:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:744:3: ( rule__LiteralExpression__Alternatives )
            // InternalAlf.g:744:4: rule__LiteralExpression__Alternatives
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
    // InternalAlf.g:753:1: entryRuleNullLiteralExpression : ruleNullLiteralExpression EOF ;
    public final void entryRuleNullLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:754:1: ( ruleNullLiteralExpression EOF )
            // InternalAlf.g:755:1: ruleNullLiteralExpression EOF
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
    // InternalAlf.g:762:1: ruleNullLiteralExpression : ( ( rule__NullLiteralExpression__Group__0 ) ) ;
    public final void ruleNullLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:766:2: ( ( ( rule__NullLiteralExpression__Group__0 ) ) )
            // InternalAlf.g:767:2: ( ( rule__NullLiteralExpression__Group__0 ) )
            {
            // InternalAlf.g:767:2: ( ( rule__NullLiteralExpression__Group__0 ) )
            // InternalAlf.g:768:3: ( rule__NullLiteralExpression__Group__0 )
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getGroup()); 
            // InternalAlf.g:769:3: ( rule__NullLiteralExpression__Group__0 )
            // InternalAlf.g:769:4: rule__NullLiteralExpression__Group__0
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
    // InternalAlf.g:778:1: entryRuleBooleanLiteralExpression : ruleBooleanLiteralExpression EOF ;
    public final void entryRuleBooleanLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:779:1: ( ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:780:1: ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:787:1: ruleBooleanLiteralExpression : ( ( rule__BooleanLiteralExpression__ValueAssignment ) ) ;
    public final void ruleBooleanLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:791:2: ( ( ( rule__BooleanLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:792:2: ( ( rule__BooleanLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:792:2: ( ( rule__BooleanLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:793:3: ( rule__BooleanLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:794:3: ( rule__BooleanLiteralExpression__ValueAssignment )
            // InternalAlf.g:794:4: rule__BooleanLiteralExpression__ValueAssignment
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
    // InternalAlf.g:803:1: entryRuleStringLiteralExpression : ruleStringLiteralExpression EOF ;
    public final void entryRuleStringLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:804:1: ( ruleStringLiteralExpression EOF )
            // InternalAlf.g:805:1: ruleStringLiteralExpression EOF
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
    // InternalAlf.g:812:1: ruleStringLiteralExpression : ( ( rule__StringLiteralExpression__ValueAssignment ) ) ;
    public final void ruleStringLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:816:2: ( ( ( rule__StringLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:817:2: ( ( rule__StringLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:817:2: ( ( rule__StringLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:818:3: ( rule__StringLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:819:3: ( rule__StringLiteralExpression__ValueAssignment )
            // InternalAlf.g:819:4: rule__StringLiteralExpression__ValueAssignment
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
    // InternalAlf.g:828:1: entryRuleRealLiteralExpression : ruleRealLiteralExpression EOF ;
    public final void entryRuleRealLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:829:1: ( ruleRealLiteralExpression EOF )
            // InternalAlf.g:830:1: ruleRealLiteralExpression EOF
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
    // InternalAlf.g:837:1: ruleRealLiteralExpression : ( ( rule__RealLiteralExpression__ValueAssignment ) ) ;
    public final void ruleRealLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:841:2: ( ( ( rule__RealLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:842:2: ( ( rule__RealLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:842:2: ( ( rule__RealLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:843:3: ( rule__RealLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getRealLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:844:3: ( rule__RealLiteralExpression__ValueAssignment )
            // InternalAlf.g:844:4: rule__RealLiteralExpression__ValueAssignment
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
    // InternalAlf.g:853:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalAlf.g:854:1: ( ruleRealValue EOF )
            // InternalAlf.g:855:1: ruleRealValue EOF
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
    // InternalAlf.g:862:1: ruleRealValue : ( ( rule__RealValue__Group__0 ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:866:2: ( ( ( rule__RealValue__Group__0 ) ) )
            // InternalAlf.g:867:2: ( ( rule__RealValue__Group__0 ) )
            {
            // InternalAlf.g:867:2: ( ( rule__RealValue__Group__0 ) )
            // InternalAlf.g:868:3: ( rule__RealValue__Group__0 )
            {
             before(grammarAccess.getRealValueAccess().getGroup()); 
            // InternalAlf.g:869:3: ( rule__RealValue__Group__0 )
            // InternalAlf.g:869:4: rule__RealValue__Group__0
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
    // InternalAlf.g:878:1: entryRuleNaturalLiteralExpression : ruleNaturalLiteralExpression EOF ;
    public final void entryRuleNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:879:1: ( ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:880:1: ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:887:1: ruleNaturalLiteralExpression : ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) ;
    public final void ruleNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:891:2: ( ( ( rule__NaturalLiteralExpression__ValueAssignment ) ) )
            // InternalAlf.g:892:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            {
            // InternalAlf.g:892:2: ( ( rule__NaturalLiteralExpression__ValueAssignment ) )
            // InternalAlf.g:893:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getNaturalLiteralExpressionAccess().getValueAssignment()); 
            // InternalAlf.g:894:3: ( rule__NaturalLiteralExpression__ValueAssignment )
            // InternalAlf.g:894:4: rule__NaturalLiteralExpression__ValueAssignment
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
    // InternalAlf.g:903:1: entryRuleUnlimitedNaturalLiteralExpression : ruleUnlimitedNaturalLiteralExpression EOF ;
    public final void entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        try {
            // InternalAlf.g:904:1: ( ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:905:1: ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:912:1: ruleUnlimitedNaturalLiteralExpression : ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) ;
    public final void ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:916:2: ( ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) ) )
            // InternalAlf.g:917:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            {
            // InternalAlf.g:917:2: ( ( rule__UnlimitedNaturalLiteralExpression__Alternatives ) )
            // InternalAlf.g:918:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAlternatives()); 
            // InternalAlf.g:919:3: ( rule__UnlimitedNaturalLiteralExpression__Alternatives )
            // InternalAlf.g:919:4: rule__UnlimitedNaturalLiteralExpression__Alternatives
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
    // InternalAlf.g:928:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalAlf.g:929:1: ( ruleName EOF )
            // InternalAlf.g:930:1: ruleName EOF
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
    // InternalAlf.g:937:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:941:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalAlf.g:942:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalAlf.g:942:2: ( ( rule__Name__Alternatives ) )
            // InternalAlf.g:943:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalAlf.g:944:3: ( rule__Name__Alternatives )
            // InternalAlf.g:944:4: rule__Name__Alternatives
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
    // InternalAlf.g:953:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAlf.g:954:1: ( ruleQualifiedName EOF )
            // InternalAlf.g:955:1: ruleQualifiedName EOF
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
    // InternalAlf.g:962:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:966:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAlf.g:967:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAlf.g:967:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAlf.g:968:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAlf.g:969:3: ( rule__QualifiedName__Group__0 )
            // InternalAlf.g:969:4: rule__QualifiedName__Group__0
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
    // InternalAlf.g:978:1: ruleVisibilityIndicator : ( ( rule__VisibilityIndicator__Alternatives ) ) ;
    public final void ruleVisibilityIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:982:1: ( ( ( rule__VisibilityIndicator__Alternatives ) ) )
            // InternalAlf.g:983:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            {
            // InternalAlf.g:983:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            // InternalAlf.g:984:3: ( rule__VisibilityIndicator__Alternatives )
            {
             before(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            // InternalAlf.g:985:3: ( rule__VisibilityIndicator__Alternatives )
            // InternalAlf.g:985:4: rule__VisibilityIndicator__Alternatives
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
    // InternalAlf.g:994:1: ruleFeatureDirection : ( ( rule__FeatureDirection__Alternatives ) ) ;
    public final void ruleFeatureDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:998:1: ( ( ( rule__FeatureDirection__Alternatives ) ) )
            // InternalAlf.g:999:2: ( ( rule__FeatureDirection__Alternatives ) )
            {
            // InternalAlf.g:999:2: ( ( rule__FeatureDirection__Alternatives ) )
            // InternalAlf.g:1000:3: ( rule__FeatureDirection__Alternatives )
            {
             before(grammarAccess.getFeatureDirectionAccess().getAlternatives()); 
            // InternalAlf.g:1001:3: ( rule__FeatureDirection__Alternatives )
            // InternalAlf.g:1001:4: rule__FeatureDirection__Alternatives
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
    // InternalAlf.g:1009:1: rule__UnitDefinition__Alternatives : ( ( rulePackageDefinition ) | ( ruleClassDefinition ) );
    public final void rule__UnitDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1013:1: ( ( rulePackageDefinition ) | ( ruleClassDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16||LA1_0==51) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:1014:2: ( rulePackageDefinition )
                    {
                    // InternalAlf.g:1014:2: ( rulePackageDefinition )
                    // InternalAlf.g:1015:3: rulePackageDefinition
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
                    // InternalAlf.g:1020:2: ( ruleClassDefinition )
                    {
                    // InternalAlf.g:1020:2: ( ruleClassDefinition )
                    // InternalAlf.g:1021:3: ruleClassDefinition
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
    // InternalAlf.g:1030:1: rule__MemberDefinition__Alternatives_1 : ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) );
    public final void rule__MemberDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1034:1: ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAlf.g:1035:2: ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) )
                    {
                    // InternalAlf.g:1035:2: ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) )
                    // InternalAlf.g:1036:3: ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 )
                    {
                     before(grammarAccess.getMemberDefinitionAccess().getOwnedMemberElementAssignment_1_0()); 
                    // InternalAlf.g:1037:3: ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 )
                    // InternalAlf.g:1037:4: rule__MemberDefinition__OwnedMemberElementAssignment_1_0
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
                    // InternalAlf.g:1041:2: ( ( rule__MemberDefinition__Group_1_1__0 ) )
                    {
                    // InternalAlf.g:1041:2: ( ( rule__MemberDefinition__Group_1_1__0 ) )
                    // InternalAlf.g:1042:3: ( rule__MemberDefinition__Group_1_1__0 )
                    {
                     before(grammarAccess.getMemberDefinitionAccess().getGroup_1_1()); 
                    // InternalAlf.g:1043:3: ( rule__MemberDefinition__Group_1_1__0 )
                    // InternalAlf.g:1043:4: rule__MemberDefinition__Group_1_1__0
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
    // InternalAlf.g:1051:1: rule__MemberKind__Alternatives : ( ( 'package' ) | ( 'class' ) | ( 'feature' ) );
    public final void rule__MemberKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1055:1: ( ( 'package' ) | ( 'class' ) | ( 'feature' ) )
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
                    // InternalAlf.g:1056:2: ( 'package' )
                    {
                    // InternalAlf.g:1056:2: ( 'package' )
                    // InternalAlf.g:1057:3: 'package'
                    {
                     before(grammarAccess.getMemberKindAccess().getPackageKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMemberKindAccess().getPackageKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1062:2: ( 'class' )
                    {
                    // InternalAlf.g:1062:2: ( 'class' )
                    // InternalAlf.g:1063:3: 'class'
                    {
                     before(grammarAccess.getMemberKindAccess().getClassKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMemberKindAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1068:2: ( 'feature' )
                    {
                    // InternalAlf.g:1068:2: ( 'feature' )
                    // InternalAlf.g:1069:3: 'feature'
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
    // InternalAlf.g:1078:1: rule__PackagedElementDefinition__Alternatives : ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) | ( ruleFeatureDefinition ) );
    public final void rule__PackagedElementDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1082:1: ( ( rulePackageDefinitionOrStub ) | ( ruleClassifierDefinitionOrStub ) | ( ruleFeatureDefinition ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
            case 51:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 17:
            case 18:
            case 20:
            case 32:
            case 33:
            case 34:
            case 44:
            case 45:
            case 52:
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
                    // InternalAlf.g:1083:2: ( rulePackageDefinitionOrStub )
                    {
                    // InternalAlf.g:1083:2: ( rulePackageDefinitionOrStub )
                    // InternalAlf.g:1084:3: rulePackageDefinitionOrStub
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
                    // InternalAlf.g:1089:2: ( ruleClassifierDefinitionOrStub )
                    {
                    // InternalAlf.g:1089:2: ( ruleClassifierDefinitionOrStub )
                    // InternalAlf.g:1090:3: ruleClassifierDefinitionOrStub
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
                    // InternalAlf.g:1095:2: ( ruleFeatureDefinition )
                    {
                    // InternalAlf.g:1095:2: ( ruleFeatureDefinition )
                    // InternalAlf.g:1096:3: ruleFeatureDefinition
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
    // InternalAlf.g:1105:1: rule__ClassDeclaration__Alternatives_3_0 : ( ( 'is' ) | ( 'specializes' ) );
    public final void rule__ClassDeclaration__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1109:1: ( ( 'is' ) | ( 'specializes' ) )
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
                    // InternalAlf.g:1110:2: ( 'is' )
                    {
                    // InternalAlf.g:1110:2: ( 'is' )
                    // InternalAlf.g:1111:3: 'is'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1116:2: ( 'specializes' )
                    {
                    // InternalAlf.g:1116:2: ( 'specializes' )
                    // InternalAlf.g:1117:3: 'specializes'
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


    // $ANTLR start "rule__FeatureDefinition__Alternatives"
    // InternalAlf.g:1126:1: rule__FeatureDefinition__Alternatives : ( ( ruleBasicFeatureDefinition ) | ( ruleConnectorDefinition ) );
    public final void rule__FeatureDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1130:1: ( ( ruleBasicFeatureDefinition ) | ( ruleConnectorDefinition ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_UNRESTRICTED_NAME)||(LA6_0>=17 && LA6_0<=18)||LA6_0==20||(LA6_0>=32 && LA6_0<=34)||LA6_0==44||LA6_0==52) ) {
                alt6=1;
            }
            else if ( (LA6_0==45) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:1131:2: ( ruleBasicFeatureDefinition )
                    {
                    // InternalAlf.g:1131:2: ( ruleBasicFeatureDefinition )
                    // InternalAlf.g:1132:3: ruleBasicFeatureDefinition
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getBasicFeatureDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicFeatureDefinition();

                    state._fsp--;

                     after(grammarAccess.getFeatureDefinitionAccess().getBasicFeatureDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1137:2: ( ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1137:2: ( ruleConnectorDefinition )
                    // InternalAlf.g:1138:3: ruleConnectorDefinition
                    {
                     before(grammarAccess.getFeatureDefinitionAccess().getConnectorDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConnectorDefinition();

                    state._fsp--;

                     after(grammarAccess.getFeatureDefinitionAccess().getConnectorDefinitionParserRuleCall_1()); 

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


    // $ANTLR start "rule__BasicFeatureDefinition__Alternatives_0"
    // InternalAlf.g:1147:1: rule__BasicFeatureDefinition__Alternatives_0 : ( ( 'feature' ) | ( ( rule__BasicFeatureDefinition__IsPortAssignment_0_1 ) ) );
    public final void rule__BasicFeatureDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1151:1: ( ( 'feature' ) | ( ( rule__BasicFeatureDefinition__IsPortAssignment_0_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==52) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:1152:2: ( 'feature' )
                    {
                    // InternalAlf.g:1152:2: ( 'feature' )
                    // InternalAlf.g:1153:3: 'feature'
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getFeatureKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBasicFeatureDefinitionAccess().getFeatureKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1158:2: ( ( rule__BasicFeatureDefinition__IsPortAssignment_0_1 ) )
                    {
                    // InternalAlf.g:1158:2: ( ( rule__BasicFeatureDefinition__IsPortAssignment_0_1 ) )
                    // InternalAlf.g:1159:3: ( rule__BasicFeatureDefinition__IsPortAssignment_0_1 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getIsPortAssignment_0_1()); 
                    // InternalAlf.g:1160:3: ( rule__BasicFeatureDefinition__IsPortAssignment_0_1 )
                    // InternalAlf.g:1160:4: rule__BasicFeatureDefinition__IsPortAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__IsPortAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getIsPortAssignment_0_1()); 

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
    // $ANTLR end "rule__BasicFeatureDefinition__Alternatives_0"


    // $ANTLR start "rule__BasicFeatureDefinition__Alternatives_2"
    // InternalAlf.g:1168:1: rule__BasicFeatureDefinition__Alternatives_2 : ( ( ( rule__BasicFeatureDefinition__Group_2_0__0 ) ) | ( ( rule__BasicFeatureDefinition__Group_2_1__0 ) ) );
    public final void rule__BasicFeatureDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1172:1: ( ( ( rule__BasicFeatureDefinition__Group_2_0__0 ) ) | ( ( rule__BasicFeatureDefinition__Group_2_1__0 ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==18||LA8_1==20||LA8_1==44) ) {
                    alt8=2;
                }
                else if ( (LA8_1==35||LA8_1==37||(LA8_1>=39 && LA8_1<=40)||LA8_1==43) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==18||LA8_2==20||LA8_2==44) ) {
                    alt8=2;
                }
                else if ( (LA8_2==35||LA8_2==37||(LA8_2>=39 && LA8_2<=40)||LA8_2==43) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
            case 20:
            case 44:
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
                    // InternalAlf.g:1173:2: ( ( rule__BasicFeatureDefinition__Group_2_0__0 ) )
                    {
                    // InternalAlf.g:1173:2: ( ( rule__BasicFeatureDefinition__Group_2_0__0 ) )
                    // InternalAlf.g:1174:3: ( rule__BasicFeatureDefinition__Group_2_0__0 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0()); 
                    // InternalAlf.g:1175:3: ( rule__BasicFeatureDefinition__Group_2_0__0 )
                    // InternalAlf.g:1175:4: rule__BasicFeatureDefinition__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1179:2: ( ( rule__BasicFeatureDefinition__Group_2_1__0 ) )
                    {
                    // InternalAlf.g:1179:2: ( ( rule__BasicFeatureDefinition__Group_2_1__0 ) )
                    // InternalAlf.g:1180:3: ( rule__BasicFeatureDefinition__Group_2_1__0 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1()); 
                    // InternalAlf.g:1181:3: ( rule__BasicFeatureDefinition__Group_2_1__0 )
                    // InternalAlf.g:1181:4: rule__BasicFeatureDefinition__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__BasicFeatureDefinition__Alternatives_2"


    // $ANTLR start "rule__BasicFeatureDefinition__Alternatives_2_0_3"
    // InternalAlf.g:1189:1: rule__BasicFeatureDefinition__Alternatives_2_0_3 : ( ( ( rule__BasicFeatureDefinition__Group_2_0_3_0__0 ) ) | ( ( rule__BasicFeatureDefinition__Group_2_0_3_1__0 ) ) );
    public final void rule__BasicFeatureDefinition__Alternatives_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1193:1: ( ( ( rule__BasicFeatureDefinition__Group_2_0_3_0__0 ) ) | ( ( rule__BasicFeatureDefinition__Group_2_0_3_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37||LA9_0==43) ) {
                alt9=1;
            }
            else if ( (LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:1194:2: ( ( rule__BasicFeatureDefinition__Group_2_0_3_0__0 ) )
                    {
                    // InternalAlf.g:1194:2: ( ( rule__BasicFeatureDefinition__Group_2_0_3_0__0 ) )
                    // InternalAlf.g:1195:3: ( rule__BasicFeatureDefinition__Group_2_0_3_0__0 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_3_0()); 
                    // InternalAlf.g:1196:3: ( rule__BasicFeatureDefinition__Group_2_0_3_0__0 )
                    // InternalAlf.g:1196:4: rule__BasicFeatureDefinition__Group_2_0_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_0_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1200:2: ( ( rule__BasicFeatureDefinition__Group_2_0_3_1__0 ) )
                    {
                    // InternalAlf.g:1200:2: ( ( rule__BasicFeatureDefinition__Group_2_0_3_1__0 ) )
                    // InternalAlf.g:1201:3: ( rule__BasicFeatureDefinition__Group_2_0_3_1__0 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_3_1()); 
                    // InternalAlf.g:1202:3: ( rule__BasicFeatureDefinition__Group_2_0_3_1__0 )
                    // InternalAlf.g:1202:4: rule__BasicFeatureDefinition__Group_2_0_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_0_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_3_1()); 

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
    // $ANTLR end "rule__BasicFeatureDefinition__Alternatives_2_0_3"


    // $ANTLR start "rule__BasicFeatureDefinition__Alternatives_2_1_2"
    // InternalAlf.g:1210:1: rule__BasicFeatureDefinition__Alternatives_2_1_2 : ( ( ( rule__BasicFeatureDefinition__Group_2_1_2_0__0 ) ) | ( ( rule__BasicFeatureDefinition__Group_2_1_2_1__0 ) ) );
    public final void rule__BasicFeatureDefinition__Alternatives_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1214:1: ( ( ( rule__BasicFeatureDefinition__Group_2_1_2_0__0 ) ) | ( ( rule__BasicFeatureDefinition__Group_2_1_2_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_NATURAL_VALUE) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==42) ) {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==RULE_NATURAL_VALUE) ) {
                            int LA10_7 = input.LA(5);

                            if ( (LA10_7==41) ) {
                                int LA10_6 = input.LA(6);

                                if ( (LA10_6==35||LA10_6==43) ) {
                                    alt10=1;
                                }
                                else if ( (LA10_6==37) ) {
                                    alt10=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA10_5==23) ) {
                            int LA10_4 = input.LA(5);

                            if ( (LA10_4==41) ) {
                                int LA10_6 = input.LA(6);

                                if ( (LA10_6==35||LA10_6==43) ) {
                                    alt10=1;
                                }
                                else if ( (LA10_6==37) ) {
                                    alt10=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_3==41) ) {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==35||LA10_6==43) ) {
                            alt10=1;
                        }
                        else if ( (LA10_6==37) ) {
                            alt10=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA10_1==23) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==41) ) {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==35||LA10_6==43) ) {
                            alt10=1;
                        }
                        else if ( (LA10_6==37) ) {
                            alt10=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==35||LA10_0==43) ) {
                alt10=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlf.g:1215:2: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0__0 ) )
                    {
                    // InternalAlf.g:1215:2: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0__0 ) )
                    // InternalAlf.g:1216:3: ( rule__BasicFeatureDefinition__Group_2_1_2_0__0 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0()); 
                    // InternalAlf.g:1217:3: ( rule__BasicFeatureDefinition__Group_2_1_2_0__0 )
                    // InternalAlf.g:1217:4: rule__BasicFeatureDefinition__Group_2_1_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_1_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1221:2: ( ( rule__BasicFeatureDefinition__Group_2_1_2_1__0 ) )
                    {
                    // InternalAlf.g:1221:2: ( ( rule__BasicFeatureDefinition__Group_2_1_2_1__0 ) )
                    // InternalAlf.g:1222:3: ( rule__BasicFeatureDefinition__Group_2_1_2_1__0 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_1()); 
                    // InternalAlf.g:1223:3: ( rule__BasicFeatureDefinition__Group_2_1_2_1__0 )
                    // InternalAlf.g:1223:4: rule__BasicFeatureDefinition__Group_2_1_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_1_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_1()); 

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
    // $ANTLR end "rule__BasicFeatureDefinition__Alternatives_2_1_2"


    // $ANTLR start "rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1"
    // InternalAlf.g:1231:1: rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1 : ( ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0 ) ) | ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0 ) ) );
    public final void rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1235:1: ( ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0 ) ) | ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            else if ( (LA11_0==35) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:1236:2: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0 ) )
                    {
                    // InternalAlf.g:1236:2: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0 ) )
                    // InternalAlf.g:1237:3: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0_1_0()); 
                    // InternalAlf.g:1238:3: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0 )
                    // InternalAlf.g:1238:4: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1242:2: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0 ) )
                    {
                    // InternalAlf.g:1242:2: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0 ) )
                    // InternalAlf.g:1243:3: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0 )
                    {
                     before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0_1_1()); 
                    // InternalAlf.g:1244:3: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0 )
                    // InternalAlf.g:1244:4: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0_1_1()); 

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
    // $ANTLR end "rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Alternatives"
    // InternalAlf.g:1252:1: rule__OwnedRedefinitionOrSubset__Alternatives : ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1256:1: ( ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) ) | ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18||LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==44) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:1257:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    {
                    // InternalAlf.g:1257:2: ( ( rule__OwnedRedefinitionOrSubset__Group_0__0 ) )
                    // InternalAlf.g:1258:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_0()); 
                    // InternalAlf.g:1259:3: ( rule__OwnedRedefinitionOrSubset__Group_0__0 )
                    // InternalAlf.g:1259:4: rule__OwnedRedefinitionOrSubset__Group_0__0
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
                    // InternalAlf.g:1263:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    {
                    // InternalAlf.g:1263:2: ( ( rule__OwnedRedefinitionOrSubset__Group_1__0 ) )
                    // InternalAlf.g:1264:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getGroup_1()); 
                    // InternalAlf.g:1265:3: ( rule__OwnedRedefinitionOrSubset__Group_1__0 )
                    // InternalAlf.g:1265:4: rule__OwnedRedefinitionOrSubset__Group_1__0
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
    // InternalAlf.g:1273:1: rule__OwnedRedefinitionOrSubset__Alternatives_0_0 : ( ( 'is' ) | ( 'redefines' ) );
    public final void rule__OwnedRedefinitionOrSubset__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1277:1: ( ( 'is' ) | ( 'redefines' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:1278:2: ( 'is' )
                    {
                    // InternalAlf.g:1278:2: ( 'is' )
                    // InternalAlf.g:1279:3: 'is'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1284:2: ( 'redefines' )
                    {
                    // InternalAlf.g:1284:2: ( 'redefines' )
                    // InternalAlf.g:1285:3: 'redefines'
                    {
                     before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalAlf.g:1294:1: rule__BinaryExpression__Alternatives_1_1 : ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) );
    public final void rule__BinaryExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1298:1: ( ( ( rule__BinaryExpression__Group_1_1_0__0 ) ) | ( ( rule__BinaryExpression__Group_1_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=21 && LA14_0<=25)) ) {
                alt14=1;
            }
            else if ( (LA14_0==53) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:1299:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    {
                    // InternalAlf.g:1299:2: ( ( rule__BinaryExpression__Group_1_1_0__0 ) )
                    // InternalAlf.g:1300:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_0()); 
                    // InternalAlf.g:1301:3: ( rule__BinaryExpression__Group_1_1_0__0 )
                    // InternalAlf.g:1301:4: rule__BinaryExpression__Group_1_1_0__0
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
                    // InternalAlf.g:1305:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    {
                    // InternalAlf.g:1305:2: ( ( rule__BinaryExpression__Group_1_1_1__0 ) )
                    // InternalAlf.g:1306:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getGroup_1_1_1()); 
                    // InternalAlf.g:1307:3: ( rule__BinaryExpression__Group_1_1_1__0 )
                    // InternalAlf.g:1307:4: rule__BinaryExpression__Group_1_1_1__0
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
    // InternalAlf.g:1315:1: rule__BinaryOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1319:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case 23:
                {
                alt15=3;
                }
                break;
            case 24:
                {
                alt15=4;
                }
                break;
            case 25:
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
                    // InternalAlf.g:1320:2: ( '+' )
                    {
                    // InternalAlf.g:1320:2: ( '+' )
                    // InternalAlf.g:1321:3: '+'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1326:2: ( '-' )
                    {
                    // InternalAlf.g:1326:2: ( '-' )
                    // InternalAlf.g:1327:3: '-'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1332:2: ( '*' )
                    {
                    // InternalAlf.g:1332:2: ( '*' )
                    // InternalAlf.g:1333:3: '*'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1338:2: ( '/' )
                    {
                    // InternalAlf.g:1338:2: ( '/' )
                    // InternalAlf.g:1339:3: '/'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1344:2: ( '^' )
                    {
                    // InternalAlf.g:1344:2: ( '^' )
                    // InternalAlf.g:1345:3: '^'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_4()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalAlf.g:1354:1: rule__UnaryExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1358:1: ( ( rulePrimaryExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING_VALUE)||LA16_0==23||LA16_0==35||LA16_0==47||(LA16_0>=49 && LA16_0<=50)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=21 && LA16_0<=22)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlf.g:1359:2: ( rulePrimaryExpression )
                    {
                    // InternalAlf.g:1359:2: ( rulePrimaryExpression )
                    // InternalAlf.g:1360:3: rulePrimaryExpression
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
                    // InternalAlf.g:1365:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1365:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // InternalAlf.g:1366:3: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1367:3: ( rule__UnaryExpression__Group_1__0 )
                    // InternalAlf.g:1367:4: rule__UnaryExpression__Group_1__0
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
    // InternalAlf.g:1375:1: rule__UnaryOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1379:1: ( ( '+' ) | ( '-' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlf.g:1380:2: ( '+' )
                    {
                    // InternalAlf.g:1380:2: ( '+' )
                    // InternalAlf.g:1381:3: '+'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1386:2: ( '-' )
                    {
                    // InternalAlf.g:1386:2: ( '-' )
                    // InternalAlf.g:1387:3: '-'
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalAlf.g:1396:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1400:1: ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) )
            int alt18=5;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:1401:2: ( ruleLiteralExpression )
                    {
                    // InternalAlf.g:1401:2: ( ruleLiteralExpression )
                    // InternalAlf.g:1402:3: ruleLiteralExpression
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
                    // InternalAlf.g:1407:2: ( ruleElementReferenceExpression )
                    {
                    // InternalAlf.g:1407:2: ( ruleElementReferenceExpression )
                    // InternalAlf.g:1408:3: ruleElementReferenceExpression
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
                    // InternalAlf.g:1413:2: ( ruleInstanceCreationExpression )
                    {
                    // InternalAlf.g:1413:2: ( ruleInstanceCreationExpression )
                    // InternalAlf.g:1414:3: ruleInstanceCreationExpression
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
                    // InternalAlf.g:1419:2: ( ruleSequenceConstructionExpression )
                    {
                    // InternalAlf.g:1419:2: ( ruleSequenceConstructionExpression )
                    // InternalAlf.g:1420:3: ruleSequenceConstructionExpression
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
                    // InternalAlf.g:1425:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalAlf.g:1425:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalAlf.g:1426:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalAlf.g:1427:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalAlf.g:1427:4: rule__PrimaryExpression__Group_4__0
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
    // InternalAlf.g:1435:1: rule__LiteralExpression__Alternatives : ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1439:1: ( ( ruleNullLiteralExpression ) | ( ruleBooleanLiteralExpression ) | ( ruleStringLiteralExpression ) | ( ruleRealLiteralExpression ) | ( ruleUnlimitedNaturalLiteralExpression ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt19=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt19=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt19=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA19_4 = input.LA(2);

                if ( (LA19_4==50) ) {
                    alt19=4;
                }
                else if ( (LA19_4==EOF||(LA19_4>=21 && LA19_4<=25)||(LA19_4>=36 && LA19_4<=38)||LA19_4==41||LA19_4==48||LA19_4==53) ) {
                    alt19=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    throw nvae;
                }
                }
                break;
            case 50:
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
                    // InternalAlf.g:1440:2: ( ruleNullLiteralExpression )
                    {
                    // InternalAlf.g:1440:2: ( ruleNullLiteralExpression )
                    // InternalAlf.g:1441:3: ruleNullLiteralExpression
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
                    // InternalAlf.g:1446:2: ( ruleBooleanLiteralExpression )
                    {
                    // InternalAlf.g:1446:2: ( ruleBooleanLiteralExpression )
                    // InternalAlf.g:1447:3: ruleBooleanLiteralExpression
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
                    // InternalAlf.g:1452:2: ( ruleStringLiteralExpression )
                    {
                    // InternalAlf.g:1452:2: ( ruleStringLiteralExpression )
                    // InternalAlf.g:1453:3: ruleStringLiteralExpression
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
                    // InternalAlf.g:1458:2: ( ruleRealLiteralExpression )
                    {
                    // InternalAlf.g:1458:2: ( ruleRealLiteralExpression )
                    // InternalAlf.g:1459:3: ruleRealLiteralExpression
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
                    // InternalAlf.g:1464:2: ( ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1464:2: ( ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:1465:3: ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:1474:1: rule__RealValue__Alternatives_0 : ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) );
    public final void rule__RealValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1478:1: ( ( ( rule__RealValue__Group_0_0__0 ) ) | ( ( rule__RealValue__Group_0_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_NATURAL_VALUE) ) {
                alt20=1;
            }
            else if ( (LA20_0==50) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlf.g:1479:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    {
                    // InternalAlf.g:1479:2: ( ( rule__RealValue__Group_0_0__0 ) )
                    // InternalAlf.g:1480:3: ( rule__RealValue__Group_0_0__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_0()); 
                    // InternalAlf.g:1481:3: ( rule__RealValue__Group_0_0__0 )
                    // InternalAlf.g:1481:4: rule__RealValue__Group_0_0__0
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
                    // InternalAlf.g:1485:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    {
                    // InternalAlf.g:1485:2: ( ( rule__RealValue__Group_0_1__0 ) )
                    // InternalAlf.g:1486:3: ( rule__RealValue__Group_0_1__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0_1()); 
                    // InternalAlf.g:1487:3: ( rule__RealValue__Group_0_1__0 )
                    // InternalAlf.g:1487:4: rule__RealValue__Group_0_1__0
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
    // InternalAlf.g:1495:1: rule__RealValue__Alternatives_1_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__RealValue__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1499:1: ( ( 'e' ) | ( 'E' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            else if ( (LA21_0==27) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:1500:2: ( 'e' )
                    {
                    // InternalAlf.g:1500:2: ( 'e' )
                    // InternalAlf.g:1501:3: 'e'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getEKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1506:2: ( 'E' )
                    {
                    // InternalAlf.g:1506:2: ( 'E' )
                    // InternalAlf.g:1507:3: 'E'
                    {
                     before(grammarAccess.getRealValueAccess().getEKeyword_1_0_1()); 
                    match(input,27,FOLLOW_2); 
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
    // InternalAlf.g:1516:1: rule__RealValue__Alternatives_1_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__RealValue__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1520:1: ( ( '+' ) | ( '-' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            else if ( (LA22_0==22) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1521:2: ( '+' )
                    {
                    // InternalAlf.g:1521:2: ( '+' )
                    // InternalAlf.g:1522:3: '+'
                    {
                     before(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1527:2: ( '-' )
                    {
                    // InternalAlf.g:1527:2: ( '-' )
                    // InternalAlf.g:1528:3: '-'
                    {
                     before(grammarAccess.getRealValueAccess().getHyphenMinusKeyword_1_1_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalAlf.g:1537:1: rule__UnlimitedNaturalLiteralExpression__Alternatives : ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) );
    public final void rule__UnlimitedNaturalLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1541:1: ( ( ruleNaturalLiteralExpression ) | ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NATURAL_VALUE) ) {
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
                    // InternalAlf.g:1542:2: ( ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:1542:2: ( ruleNaturalLiteralExpression )
                    // InternalAlf.g:1543:3: ruleNaturalLiteralExpression
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
                    // InternalAlf.g:1548:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    {
                    // InternalAlf.g:1548:2: ( ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 ) )
                    // InternalAlf.g:1549:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getGroup_1()); 
                    // InternalAlf.g:1550:3: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0 )
                    // InternalAlf.g:1550:4: rule__UnlimitedNaturalLiteralExpression__Group_1__0
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
    // InternalAlf.g:1558:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1562:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_UNRESTRICTED_NAME) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1563:2: ( RULE_ID )
                    {
                    // InternalAlf.g:1563:2: ( RULE_ID )
                    // InternalAlf.g:1564:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1569:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalAlf.g:1569:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalAlf.g:1570:3: RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:1579:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1583:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'packaged' ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt25=1;
                }
                break;
            case 29:
                {
                alt25=2;
                }
                break;
            case 30:
                {
                alt25=3;
                }
                break;
            case 31:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAlf.g:1584:2: ( ( 'public' ) )
                    {
                    // InternalAlf.g:1584:2: ( ( 'public' ) )
                    // InternalAlf.g:1585:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:1586:3: ( 'public' )
                    // InternalAlf.g:1586:4: 'public'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1590:2: ( ( 'private' ) )
                    {
                    // InternalAlf.g:1590:2: ( ( 'private' ) )
                    // InternalAlf.g:1591:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:1592:3: ( 'private' )
                    // InternalAlf.g:1592:4: 'private'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1596:2: ( ( 'protected' ) )
                    {
                    // InternalAlf.g:1596:2: ( ( 'protected' ) )
                    // InternalAlf.g:1597:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:1598:3: ( 'protected' )
                    // InternalAlf.g:1598:4: 'protected'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1602:2: ( ( 'packaged' ) )
                    {
                    // InternalAlf.g:1602:2: ( ( 'packaged' ) )
                    // InternalAlf.g:1603:3: ( 'packaged' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3()); 
                    // InternalAlf.g:1604:3: ( 'packaged' )
                    // InternalAlf.g:1604:4: 'packaged'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalAlf.g:1612:1: rule__FeatureDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) );
    public final void rule__FeatureDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1616:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt26=1;
                }
                break;
            case 33:
                {
                alt26=2;
                }
                break;
            case 34:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1617:2: ( ( 'in' ) )
                    {
                    // InternalAlf.g:1617:2: ( ( 'in' ) )
                    // InternalAlf.g:1618:3: ( 'in' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    // InternalAlf.g:1619:3: ( 'in' )
                    // InternalAlf.g:1619:4: 'in'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1623:2: ( ( 'out' ) )
                    {
                    // InternalAlf.g:1623:2: ( ( 'out' ) )
                    // InternalAlf.g:1624:3: ( 'out' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    // InternalAlf.g:1625:3: ( 'out' )
                    // InternalAlf.g:1625:4: 'out'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1629:2: ( ( 'inout' ) )
                    {
                    // InternalAlf.g:1629:2: ( ( 'inout' ) )
                    // InternalAlf.g:1630:3: ( 'inout' )
                    {
                     before(grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2()); 
                    // InternalAlf.g:1631:3: ( 'inout' )
                    // InternalAlf.g:1631:4: 'inout'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalAlf.g:1639:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1643:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalAlf.g:1644:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
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
    // InternalAlf.g:1651:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1655:1: ( ( 'package' ) )
            // InternalAlf.g:1656:1: ( 'package' )
            {
            // InternalAlf.g:1656:1: ( 'package' )
            // InternalAlf.g:1657:2: 'package'
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
    // InternalAlf.g:1666:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1670:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalAlf.g:1671:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
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
    // InternalAlf.g:1678:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1682:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // InternalAlf.g:1683:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // InternalAlf.g:1683:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // InternalAlf.g:1684:2: ( rule__PackageDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:1685:2: ( rule__PackageDefinition__NameAssignment_1 )
            // InternalAlf.g:1685:3: rule__PackageDefinition__NameAssignment_1
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
    // InternalAlf.g:1693:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1697:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalAlf.g:1698:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
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
    // InternalAlf.g:1705:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1709:1: ( ( '{' ) )
            // InternalAlf.g:1710:1: ( '{' )
            {
            // InternalAlf.g:1710:1: ( '{' )
            // InternalAlf.g:1711:2: '{'
            {
             before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAlf.g:1720:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1724:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalAlf.g:1725:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
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
    // InternalAlf.g:1732:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__MembershipAssignment_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1736:1: ( ( ( rule__PackageDefinition__MembershipAssignment_3 )* ) )
            // InternalAlf.g:1737:1: ( ( rule__PackageDefinition__MembershipAssignment_3 )* )
            {
            // InternalAlf.g:1737:1: ( ( rule__PackageDefinition__MembershipAssignment_3 )* )
            // InternalAlf.g:1738:2: ( rule__PackageDefinition__MembershipAssignment_3 )*
            {
             before(grammarAccess.getPackageDefinitionAccess().getMembershipAssignment_3()); 
            // InternalAlf.g:1739:2: ( rule__PackageDefinition__MembershipAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)||(LA27_0>=15 && LA27_0<=18)||LA27_0==20||(LA27_0>=28 && LA27_0<=34)||(LA27_0>=44 && LA27_0<=45)||(LA27_0>=51 && LA27_0<=52)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAlf.g:1739:3: rule__PackageDefinition__MembershipAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PackageDefinition__MembershipAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPackageDefinitionAccess().getMembershipAssignment_3()); 

            }


            }

        }
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
    // InternalAlf.g:1747:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1751:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalAlf.g:1752:2: rule__PackageDefinition__Group__4__Impl
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
    // InternalAlf.g:1758:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1762:1: ( ( '}' ) )
            // InternalAlf.g:1763:1: ( '}' )
            {
            // InternalAlf.g:1763:1: ( '}' )
            // InternalAlf.g:1764:2: '}'
            {
             before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAlf.g:1774:1: rule__MemberDefinition__Group__0 : rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1 ;
    public final void rule__MemberDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1778:1: ( rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1 )
            // InternalAlf.g:1779:2: rule__MemberDefinition__Group__0__Impl rule__MemberDefinition__Group__1
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
    // InternalAlf.g:1786:1: rule__MemberDefinition__Group__0__Impl : ( ( rule__MemberDefinition__VisibilityAssignment_0 )? ) ;
    public final void rule__MemberDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1790:1: ( ( ( rule__MemberDefinition__VisibilityAssignment_0 )? ) )
            // InternalAlf.g:1791:1: ( ( rule__MemberDefinition__VisibilityAssignment_0 )? )
            {
            // InternalAlf.g:1791:1: ( ( rule__MemberDefinition__VisibilityAssignment_0 )? )
            // InternalAlf.g:1792:2: ( rule__MemberDefinition__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMemberDefinitionAccess().getVisibilityAssignment_0()); 
            // InternalAlf.g:1793:2: ( rule__MemberDefinition__VisibilityAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=28 && LA28_0<=31)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1793:3: rule__MemberDefinition__VisibilityAssignment_0
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
    // InternalAlf.g:1801:1: rule__MemberDefinition__Group__1 : rule__MemberDefinition__Group__1__Impl ;
    public final void rule__MemberDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1805:1: ( rule__MemberDefinition__Group__1__Impl )
            // InternalAlf.g:1806:2: rule__MemberDefinition__Group__1__Impl
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
    // InternalAlf.g:1812:1: rule__MemberDefinition__Group__1__Impl : ( ( rule__MemberDefinition__Alternatives_1 ) ) ;
    public final void rule__MemberDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1816:1: ( ( ( rule__MemberDefinition__Alternatives_1 ) ) )
            // InternalAlf.g:1817:1: ( ( rule__MemberDefinition__Alternatives_1 ) )
            {
            // InternalAlf.g:1817:1: ( ( rule__MemberDefinition__Alternatives_1 ) )
            // InternalAlf.g:1818:2: ( rule__MemberDefinition__Alternatives_1 )
            {
             before(grammarAccess.getMemberDefinitionAccess().getAlternatives_1()); 
            // InternalAlf.g:1819:2: ( rule__MemberDefinition__Alternatives_1 )
            // InternalAlf.g:1819:3: rule__MemberDefinition__Alternatives_1
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
    // InternalAlf.g:1828:1: rule__MemberDefinition__Group_1_1__0 : rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1 ;
    public final void rule__MemberDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1832:1: ( rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1 )
            // InternalAlf.g:1833:2: rule__MemberDefinition__Group_1_1__0__Impl rule__MemberDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAlf.g:1840:1: rule__MemberDefinition__Group_1_1__0__Impl : ( ( ruleMemberKind )? ) ;
    public final void rule__MemberDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1844:1: ( ( ( ruleMemberKind )? ) )
            // InternalAlf.g:1845:1: ( ( ruleMemberKind )? )
            {
            // InternalAlf.g:1845:1: ( ( ruleMemberKind )? )
            // InternalAlf.g:1846:2: ( ruleMemberKind )?
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberKindParserRuleCall_1_1_0()); 
            // InternalAlf.g:1847:2: ( ruleMemberKind )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=15 && LA29_0<=17)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1847:3: ruleMemberKind
                    {
                    pushFollow(FOLLOW_2);
                    ruleMemberKind();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalAlf.g:1855:1: rule__MemberDefinition__Group_1_1__1 : rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2 ;
    public final void rule__MemberDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1859:1: ( rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2 )
            // InternalAlf.g:1860:2: rule__MemberDefinition__Group_1_1__1__Impl rule__MemberDefinition__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalAlf.g:1867:1: rule__MemberDefinition__Group_1_1__1__Impl : ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? ) ;
    public final void rule__MemberDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1871:1: ( ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? ) )
            // InternalAlf.g:1872:1: ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? )
            {
            // InternalAlf.g:1872:1: ( ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )? )
            // InternalAlf.g:1873:2: ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )?
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberNameAssignment_1_1_1()); 
            // InternalAlf.g:1874:2: ( rule__MemberDefinition__MemberNameAssignment_1_1_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1874:3: rule__MemberDefinition__MemberNameAssignment_1_1_1
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
    // InternalAlf.g:1882:1: rule__MemberDefinition__Group_1_1__2 : rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3 ;
    public final void rule__MemberDefinition__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1886:1: ( rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3 )
            // InternalAlf.g:1887:2: rule__MemberDefinition__Group_1_1__2__Impl rule__MemberDefinition__Group_1_1__3
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
    // InternalAlf.g:1894:1: rule__MemberDefinition__Group_1_1__2__Impl : ( 'is' ) ;
    public final void rule__MemberDefinition__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1898:1: ( ( 'is' ) )
            // InternalAlf.g:1899:1: ( 'is' )
            {
            // InternalAlf.g:1899:1: ( 'is' )
            // InternalAlf.g:1900:2: 'is'
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
    // InternalAlf.g:1909:1: rule__MemberDefinition__Group_1_1__3 : rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4 ;
    public final void rule__MemberDefinition__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1913:1: ( rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4 )
            // InternalAlf.g:1914:2: rule__MemberDefinition__Group_1_1__3__Impl rule__MemberDefinition__Group_1_1__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalAlf.g:1921:1: rule__MemberDefinition__Group_1_1__3__Impl : ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) ) ;
    public final void rule__MemberDefinition__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1925:1: ( ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) ) )
            // InternalAlf.g:1926:1: ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) )
            {
            // InternalAlf.g:1926:1: ( ( rule__MemberDefinition__MemberElementAssignment_1_1_3 ) )
            // InternalAlf.g:1927:2: ( rule__MemberDefinition__MemberElementAssignment_1_1_3 )
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberElementAssignment_1_1_3()); 
            // InternalAlf.g:1928:2: ( rule__MemberDefinition__MemberElementAssignment_1_1_3 )
            // InternalAlf.g:1928:3: rule__MemberDefinition__MemberElementAssignment_1_1_3
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
    // InternalAlf.g:1936:1: rule__MemberDefinition__Group_1_1__4 : rule__MemberDefinition__Group_1_1__4__Impl ;
    public final void rule__MemberDefinition__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1940:1: ( rule__MemberDefinition__Group_1_1__4__Impl )
            // InternalAlf.g:1941:2: rule__MemberDefinition__Group_1_1__4__Impl
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
    // InternalAlf.g:1947:1: rule__MemberDefinition__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__MemberDefinition__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1951:1: ( ( ';' ) )
            // InternalAlf.g:1952:1: ( ';' )
            {
            // InternalAlf.g:1952:1: ( ';' )
            // InternalAlf.g:1953:2: ';'
            {
             before(grammarAccess.getMemberDefinitionAccess().getSemicolonKeyword_1_1_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAlf.g:1963:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1967:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalAlf.g:1968:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalAlf.g:1975:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1979:1: ( ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? ) )
            // InternalAlf.g:1980:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            {
            // InternalAlf.g:1980:1: ( ( rule__ClassDeclaration__IsAbstractAssignment_0 )? )
            // InternalAlf.g:1981:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAssignment_0()); 
            // InternalAlf.g:1982:2: ( rule__ClassDeclaration__IsAbstractAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlf.g:1982:3: rule__ClassDeclaration__IsAbstractAssignment_0
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
    // InternalAlf.g:1990:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:1994:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalAlf.g:1995:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalAlf.g:2002:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2006:1: ( ( 'class' ) )
            // InternalAlf.g:2007:1: ( 'class' )
            {
            // InternalAlf.g:2007:1: ( 'class' )
            // InternalAlf.g:2008:2: 'class'
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
    // InternalAlf.g:2017:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2021:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalAlf.g:2022:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalAlf.g:2029:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2033:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalAlf.g:2034:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalAlf.g:2034:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalAlf.g:2035:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalAlf.g:2036:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalAlf.g:2036:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalAlf.g:2044:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2048:1: ( rule__ClassDeclaration__Group__3__Impl )
            // InternalAlf.g:2049:2: rule__ClassDeclaration__Group__3__Impl
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
    // InternalAlf.g:2055:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2059:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalAlf.g:2060:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalAlf.g:2060:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalAlf.g:2061:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalAlf.g:2062:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=18 && LA32_0<=19)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:2062:3: rule__ClassDeclaration__Group_3__0
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
    // InternalAlf.g:2071:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2075:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalAlf.g:2076:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalAlf.g:2083:1: rule__ClassDeclaration__Group_3__0__Impl : ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2087:1: ( ( ( rule__ClassDeclaration__Alternatives_3_0 ) ) )
            // InternalAlf.g:2088:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            {
            // InternalAlf.g:2088:1: ( ( rule__ClassDeclaration__Alternatives_3_0 ) )
            // InternalAlf.g:2089:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0()); 
            // InternalAlf.g:2090:2: ( rule__ClassDeclaration__Alternatives_3_0 )
            // InternalAlf.g:2090:3: rule__ClassDeclaration__Alternatives_3_0
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
    // InternalAlf.g:2098:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2102:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalAlf.g:2103:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalAlf.g:2110:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__MembershipAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2114:1: ( ( ( rule__ClassDeclaration__MembershipAssignment_3_1 ) ) )
            // InternalAlf.g:2115:1: ( ( rule__ClassDeclaration__MembershipAssignment_3_1 ) )
            {
            // InternalAlf.g:2115:1: ( ( rule__ClassDeclaration__MembershipAssignment_3_1 ) )
            // InternalAlf.g:2116:2: ( rule__ClassDeclaration__MembershipAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getMembershipAssignment_3_1()); 
            // InternalAlf.g:2117:2: ( rule__ClassDeclaration__MembershipAssignment_3_1 )
            // InternalAlf.g:2117:3: rule__ClassDeclaration__MembershipAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__MembershipAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getMembershipAssignment_3_1()); 

            }


            }

        }
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
    // InternalAlf.g:2125:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2129:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalAlf.g:2130:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalAlf.g:2136:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2140:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalAlf.g:2141:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalAlf.g:2141:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalAlf.g:2142:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalAlf.g:2143:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAlf.g:2143:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalAlf.g:2152:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2156:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalAlf.g:2157:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalAlf.g:2164:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2168:1: ( ( ',' ) )
            // InternalAlf.g:2169:1: ( ',' )
            {
            // InternalAlf.g:2169:1: ( ',' )
            // InternalAlf.g:2170:2: ','
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
    // InternalAlf.g:2179:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2183:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalAlf.g:2184:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalAlf.g:2190:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__MembershipAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2194:1: ( ( ( rule__ClassDeclaration__MembershipAssignment_3_2_1 ) ) )
            // InternalAlf.g:2195:1: ( ( rule__ClassDeclaration__MembershipAssignment_3_2_1 ) )
            {
            // InternalAlf.g:2195:1: ( ( rule__ClassDeclaration__MembershipAssignment_3_2_1 ) )
            // InternalAlf.g:2196:2: ( rule__ClassDeclaration__MembershipAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getMembershipAssignment_3_2_1()); 
            // InternalAlf.g:2197:2: ( rule__ClassDeclaration__MembershipAssignment_3_2_1 )
            // InternalAlf.g:2197:3: rule__ClassDeclaration__MembershipAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__MembershipAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getMembershipAssignment_3_2_1()); 

            }


            }

        }
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
    // InternalAlf.g:2206:1: rule__ClassDefinition__Group__0 : rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 ;
    public final void rule__ClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2210:1: ( rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1 )
            // InternalAlf.g:2211:2: rule__ClassDefinition__Group__0__Impl rule__ClassDefinition__Group__1
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
    // InternalAlf.g:2218:1: rule__ClassDefinition__Group__0__Impl : ( ruleClassDeclaration ) ;
    public final void rule__ClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2222:1: ( ( ruleClassDeclaration ) )
            // InternalAlf.g:2223:1: ( ruleClassDeclaration )
            {
            // InternalAlf.g:2223:1: ( ruleClassDeclaration )
            // InternalAlf.g:2224:2: ruleClassDeclaration
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
    // InternalAlf.g:2233:1: rule__ClassDefinition__Group__1 : rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 ;
    public final void rule__ClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2237:1: ( rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2 )
            // InternalAlf.g:2238:2: rule__ClassDefinition__Group__1__Impl rule__ClassDefinition__Group__2
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
    // InternalAlf.g:2245:1: rule__ClassDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2249:1: ( ( '{' ) )
            // InternalAlf.g:2250:1: ( '{' )
            {
            // InternalAlf.g:2250:1: ( '{' )
            // InternalAlf.g:2251:2: '{'
            {
             before(grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAlf.g:2260:1: rule__ClassDefinition__Group__2 : rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 ;
    public final void rule__ClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2264:1: ( rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3 )
            // InternalAlf.g:2265:2: rule__ClassDefinition__Group__2__Impl rule__ClassDefinition__Group__3
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
    // InternalAlf.g:2272:1: rule__ClassDefinition__Group__2__Impl : ( ( rule__ClassDefinition__MembershipAssignment_2 )* ) ;
    public final void rule__ClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2276:1: ( ( ( rule__ClassDefinition__MembershipAssignment_2 )* ) )
            // InternalAlf.g:2277:1: ( ( rule__ClassDefinition__MembershipAssignment_2 )* )
            {
            // InternalAlf.g:2277:1: ( ( rule__ClassDefinition__MembershipAssignment_2 )* )
            // InternalAlf.g:2278:2: ( rule__ClassDefinition__MembershipAssignment_2 )*
            {
             before(grammarAccess.getClassDefinitionAccess().getMembershipAssignment_2()); 
            // InternalAlf.g:2279:2: ( rule__ClassDefinition__MembershipAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_UNRESTRICTED_NAME)||(LA34_0>=15 && LA34_0<=18)||LA34_0==20||(LA34_0>=28 && LA34_0<=34)||(LA34_0>=44 && LA34_0<=45)||(LA34_0>=51 && LA34_0<=52)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAlf.g:2279:3: rule__ClassDefinition__MembershipAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ClassDefinition__MembershipAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getClassDefinitionAccess().getMembershipAssignment_2()); 

            }


            }

        }
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
    // InternalAlf.g:2287:1: rule__ClassDefinition__Group__3 : rule__ClassDefinition__Group__3__Impl ;
    public final void rule__ClassDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2291:1: ( rule__ClassDefinition__Group__3__Impl )
            // InternalAlf.g:2292:2: rule__ClassDefinition__Group__3__Impl
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
    // InternalAlf.g:2298:1: rule__ClassDefinition__Group__3__Impl : ( '}' ) ;
    public final void rule__ClassDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2302:1: ( ( '}' ) )
            // InternalAlf.g:2303:1: ( '}' )
            {
            // InternalAlf.g:2303:1: ( '}' )
            // InternalAlf.g:2304:2: '}'
            {
             before(grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__BasicFeatureDefinition__Group__0"
    // InternalAlf.g:2314:1: rule__BasicFeatureDefinition__Group__0 : rule__BasicFeatureDefinition__Group__0__Impl rule__BasicFeatureDefinition__Group__1 ;
    public final void rule__BasicFeatureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2318:1: ( rule__BasicFeatureDefinition__Group__0__Impl rule__BasicFeatureDefinition__Group__1 )
            // InternalAlf.g:2319:2: rule__BasicFeatureDefinition__Group__0__Impl rule__BasicFeatureDefinition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BasicFeatureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group__0__Impl"
    // InternalAlf.g:2326:1: rule__BasicFeatureDefinition__Group__0__Impl : ( ( rule__BasicFeatureDefinition__Alternatives_0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2330:1: ( ( ( rule__BasicFeatureDefinition__Alternatives_0 )? ) )
            // InternalAlf.g:2331:1: ( ( rule__BasicFeatureDefinition__Alternatives_0 )? )
            {
            // InternalAlf.g:2331:1: ( ( rule__BasicFeatureDefinition__Alternatives_0 )? )
            // InternalAlf.g:2332:2: ( rule__BasicFeatureDefinition__Alternatives_0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_0()); 
            // InternalAlf.g:2333:2: ( rule__BasicFeatureDefinition__Alternatives_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17||LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlf.g:2333:3: rule__BasicFeatureDefinition__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group__1"
    // InternalAlf.g:2341:1: rule__BasicFeatureDefinition__Group__1 : rule__BasicFeatureDefinition__Group__1__Impl rule__BasicFeatureDefinition__Group__2 ;
    public final void rule__BasicFeatureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2345:1: ( rule__BasicFeatureDefinition__Group__1__Impl rule__BasicFeatureDefinition__Group__2 )
            // InternalAlf.g:2346:2: rule__BasicFeatureDefinition__Group__1__Impl rule__BasicFeatureDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BasicFeatureDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group__1__Impl"
    // InternalAlf.g:2353:1: rule__BasicFeatureDefinition__Group__1__Impl : ( ( rule__BasicFeatureDefinition__DirectionAssignment_1 )? ) ;
    public final void rule__BasicFeatureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2357:1: ( ( ( rule__BasicFeatureDefinition__DirectionAssignment_1 )? ) )
            // InternalAlf.g:2358:1: ( ( rule__BasicFeatureDefinition__DirectionAssignment_1 )? )
            {
            // InternalAlf.g:2358:1: ( ( rule__BasicFeatureDefinition__DirectionAssignment_1 )? )
            // InternalAlf.g:2359:2: ( rule__BasicFeatureDefinition__DirectionAssignment_1 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getDirectionAssignment_1()); 
            // InternalAlf.g:2360:2: ( rule__BasicFeatureDefinition__DirectionAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=32 && LA36_0<=34)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:2360:3: rule__BasicFeatureDefinition__DirectionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__DirectionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getDirectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group__2"
    // InternalAlf.g:2368:1: rule__BasicFeatureDefinition__Group__2 : rule__BasicFeatureDefinition__Group__2__Impl ;
    public final void rule__BasicFeatureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2372:1: ( rule__BasicFeatureDefinition__Group__2__Impl )
            // InternalAlf.g:2373:2: rule__BasicFeatureDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group__2__Impl"
    // InternalAlf.g:2379:1: rule__BasicFeatureDefinition__Group__2__Impl : ( ( rule__BasicFeatureDefinition__Alternatives_2 ) ) ;
    public final void rule__BasicFeatureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2383:1: ( ( ( rule__BasicFeatureDefinition__Alternatives_2 ) ) )
            // InternalAlf.g:2384:1: ( ( rule__BasicFeatureDefinition__Alternatives_2 ) )
            {
            // InternalAlf.g:2384:1: ( ( rule__BasicFeatureDefinition__Alternatives_2 ) )
            // InternalAlf.g:2385:2: ( rule__BasicFeatureDefinition__Alternatives_2 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_2()); 
            // InternalAlf.g:2386:2: ( rule__BasicFeatureDefinition__Alternatives_2 )
            // InternalAlf.g:2386:3: rule__BasicFeatureDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0__0"
    // InternalAlf.g:2395:1: rule__BasicFeatureDefinition__Group_2_0__0 : rule__BasicFeatureDefinition__Group_2_0__0__Impl rule__BasicFeatureDefinition__Group_2_0__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2399:1: ( rule__BasicFeatureDefinition__Group_2_0__0__Impl rule__BasicFeatureDefinition__Group_2_0__1 )
            // InternalAlf.g:2400:2: rule__BasicFeatureDefinition__Group_2_0__0__Impl rule__BasicFeatureDefinition__Group_2_0__1
            {
            pushFollow(FOLLOW_14);
            rule__BasicFeatureDefinition__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0__0__Impl"
    // InternalAlf.g:2407:1: rule__BasicFeatureDefinition__Group_2_0__0__Impl : ( ( rule__BasicFeatureDefinition__NameAssignment_2_0_0 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2411:1: ( ( ( rule__BasicFeatureDefinition__NameAssignment_2_0_0 ) ) )
            // InternalAlf.g:2412:1: ( ( rule__BasicFeatureDefinition__NameAssignment_2_0_0 ) )
            {
            // InternalAlf.g:2412:1: ( ( rule__BasicFeatureDefinition__NameAssignment_2_0_0 ) )
            // InternalAlf.g:2413:2: ( rule__BasicFeatureDefinition__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getNameAssignment_2_0_0()); 
            // InternalAlf.g:2414:2: ( rule__BasicFeatureDefinition__NameAssignment_2_0_0 )
            // InternalAlf.g:2414:3: rule__BasicFeatureDefinition__NameAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__NameAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getNameAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0__1"
    // InternalAlf.g:2422:1: rule__BasicFeatureDefinition__Group_2_0__1 : rule__BasicFeatureDefinition__Group_2_0__1__Impl rule__BasicFeatureDefinition__Group_2_0__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2426:1: ( rule__BasicFeatureDefinition__Group_2_0__1__Impl rule__BasicFeatureDefinition__Group_2_0__2 )
            // InternalAlf.g:2427:2: rule__BasicFeatureDefinition__Group_2_0__1__Impl rule__BasicFeatureDefinition__Group_2_0__2
            {
            pushFollow(FOLLOW_14);
            rule__BasicFeatureDefinition__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0__1__Impl"
    // InternalAlf.g:2434:1: rule__BasicFeatureDefinition__Group_2_0__1__Impl : ( ( rule__BasicFeatureDefinition__Group_2_0_1__0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2438:1: ( ( ( rule__BasicFeatureDefinition__Group_2_0_1__0 )? ) )
            // InternalAlf.g:2439:1: ( ( rule__BasicFeatureDefinition__Group_2_0_1__0 )? )
            {
            // InternalAlf.g:2439:1: ( ( rule__BasicFeatureDefinition__Group_2_0_1__0 )? )
            // InternalAlf.g:2440:2: ( rule__BasicFeatureDefinition__Group_2_0_1__0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_1()); 
            // InternalAlf.g:2441:2: ( rule__BasicFeatureDefinition__Group_2_0_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlf.g:2441:3: rule__BasicFeatureDefinition__Group_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0__2"
    // InternalAlf.g:2449:1: rule__BasicFeatureDefinition__Group_2_0__2 : rule__BasicFeatureDefinition__Group_2_0__2__Impl rule__BasicFeatureDefinition__Group_2_0__3 ;
    public final void rule__BasicFeatureDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2453:1: ( rule__BasicFeatureDefinition__Group_2_0__2__Impl rule__BasicFeatureDefinition__Group_2_0__3 )
            // InternalAlf.g:2454:2: rule__BasicFeatureDefinition__Group_2_0__2__Impl rule__BasicFeatureDefinition__Group_2_0__3
            {
            pushFollow(FOLLOW_14);
            rule__BasicFeatureDefinition__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0__2__Impl"
    // InternalAlf.g:2461:1: rule__BasicFeatureDefinition__Group_2_0__2__Impl : ( ( rule__BasicFeatureDefinition__Group_2_0_2__0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2465:1: ( ( ( rule__BasicFeatureDefinition__Group_2_0_2__0 )? ) )
            // InternalAlf.g:2466:1: ( ( rule__BasicFeatureDefinition__Group_2_0_2__0 )? )
            {
            // InternalAlf.g:2466:1: ( ( rule__BasicFeatureDefinition__Group_2_0_2__0 )? )
            // InternalAlf.g:2467:2: ( rule__BasicFeatureDefinition__Group_2_0_2__0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_2()); 
            // InternalAlf.g:2468:2: ( rule__BasicFeatureDefinition__Group_2_0_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:2468:3: rule__BasicFeatureDefinition__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0__3"
    // InternalAlf.g:2476:1: rule__BasicFeatureDefinition__Group_2_0__3 : rule__BasicFeatureDefinition__Group_2_0__3__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2480:1: ( rule__BasicFeatureDefinition__Group_2_0__3__Impl )
            // InternalAlf.g:2481:2: rule__BasicFeatureDefinition__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0__3"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0__3__Impl"
    // InternalAlf.g:2487:1: rule__BasicFeatureDefinition__Group_2_0__3__Impl : ( ( rule__BasicFeatureDefinition__Alternatives_2_0_3 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2491:1: ( ( ( rule__BasicFeatureDefinition__Alternatives_2_0_3 ) ) )
            // InternalAlf.g:2492:1: ( ( rule__BasicFeatureDefinition__Alternatives_2_0_3 ) )
            {
            // InternalAlf.g:2492:1: ( ( rule__BasicFeatureDefinition__Alternatives_2_0_3 ) )
            // InternalAlf.g:2493:2: ( rule__BasicFeatureDefinition__Alternatives_2_0_3 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_2_0_3()); 
            // InternalAlf.g:2494:2: ( rule__BasicFeatureDefinition__Alternatives_2_0_3 )
            // InternalAlf.g:2494:3: rule__BasicFeatureDefinition__Alternatives_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Alternatives_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0__3__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_1__0"
    // InternalAlf.g:2503:1: rule__BasicFeatureDefinition__Group_2_0_1__0 : rule__BasicFeatureDefinition__Group_2_0_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_1__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2507:1: ( rule__BasicFeatureDefinition__Group_2_0_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_1__1 )
            // InternalAlf.g:2508:2: rule__BasicFeatureDefinition__Group_2_0_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BasicFeatureDefinition__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_1__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_1__0__Impl"
    // InternalAlf.g:2515:1: rule__BasicFeatureDefinition__Group_2_0_1__0__Impl : ( ':' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2519:1: ( ( ':' ) )
            // InternalAlf.g:2520:1: ( ':' )
            {
            // InternalAlf.g:2520:1: ( ':' )
            // InternalAlf.g:2521:2: ':'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getColonKeyword_2_0_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getColonKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_1__1"
    // InternalAlf.g:2530:1: rule__BasicFeatureDefinition__Group_2_0_1__1 : rule__BasicFeatureDefinition__Group_2_0_1__1__Impl rule__BasicFeatureDefinition__Group_2_0_1__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2534:1: ( rule__BasicFeatureDefinition__Group_2_0_1__1__Impl rule__BasicFeatureDefinition__Group_2_0_1__2 )
            // InternalAlf.g:2535:2: rule__BasicFeatureDefinition__Group_2_0_1__1__Impl rule__BasicFeatureDefinition__Group_2_0_1__2
            {
            pushFollow(FOLLOW_13);
            rule__BasicFeatureDefinition__Group_2_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_1__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_1__1__Impl"
    // InternalAlf.g:2542:1: rule__BasicFeatureDefinition__Group_2_0_1__1__Impl : ( ( rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2546:1: ( ( ( rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1 ) ) )
            // InternalAlf.g:2547:1: ( ( rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1 ) )
            {
            // InternalAlf.g:2547:1: ( ( rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1 ) )
            // InternalAlf.g:2548:2: ( rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getReferencedTypeAssignment_2_0_1_1()); 
            // InternalAlf.g:2549:2: ( rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1 )
            // InternalAlf.g:2549:3: rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getReferencedTypeAssignment_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_1__2"
    // InternalAlf.g:2557:1: rule__BasicFeatureDefinition__Group_2_0_1__2 : rule__BasicFeatureDefinition__Group_2_0_1__2__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2561:1: ( rule__BasicFeatureDefinition__Group_2_0_1__2__Impl )
            // InternalAlf.g:2562:2: rule__BasicFeatureDefinition__Group_2_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_1__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_1__2__Impl"
    // InternalAlf.g:2568:1: rule__BasicFeatureDefinition__Group_2_0_1__2__Impl : ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2572:1: ( ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2 )? ) )
            // InternalAlf.g:2573:1: ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2 )? )
            {
            // InternalAlf.g:2573:1: ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2 )? )
            // InternalAlf.g:2574:2: ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipAssignment_2_0_1_2()); 
            // InternalAlf.g:2575:2: ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18||LA39_0==20||LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:2575:3: rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipAssignment_2_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_1__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2__0"
    // InternalAlf.g:2584:1: rule__BasicFeatureDefinition__Group_2_0_2__0 : rule__BasicFeatureDefinition__Group_2_0_2__0__Impl rule__BasicFeatureDefinition__Group_2_0_2__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2588:1: ( rule__BasicFeatureDefinition__Group_2_0_2__0__Impl rule__BasicFeatureDefinition__Group_2_0_2__1 )
            // InternalAlf.g:2589:2: rule__BasicFeatureDefinition__Group_2_0_2__0__Impl rule__BasicFeatureDefinition__Group_2_0_2__1
            {
            pushFollow(FOLLOW_15);
            rule__BasicFeatureDefinition__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2__0__Impl"
    // InternalAlf.g:2596:1: rule__BasicFeatureDefinition__Group_2_0_2__0__Impl : ( '[' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2600:1: ( ( '[' ) )
            // InternalAlf.g:2601:1: ( '[' )
            {
            // InternalAlf.g:2601:1: ( '[' )
            // InternalAlf.g:2602:2: '['
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2__1"
    // InternalAlf.g:2611:1: rule__BasicFeatureDefinition__Group_2_0_2__1 : rule__BasicFeatureDefinition__Group_2_0_2__1__Impl rule__BasicFeatureDefinition__Group_2_0_2__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2615:1: ( rule__BasicFeatureDefinition__Group_2_0_2__1__Impl rule__BasicFeatureDefinition__Group_2_0_2__2 )
            // InternalAlf.g:2616:2: rule__BasicFeatureDefinition__Group_2_0_2__1__Impl rule__BasicFeatureDefinition__Group_2_0_2__2
            {
            pushFollow(FOLLOW_15);
            rule__BasicFeatureDefinition__Group_2_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2__1__Impl"
    // InternalAlf.g:2623:1: rule__BasicFeatureDefinition__Group_2_0_2__1__Impl : ( ( rule__BasicFeatureDefinition__Group_2_0_2_1__0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2627:1: ( ( ( rule__BasicFeatureDefinition__Group_2_0_2_1__0 )? ) )
            // InternalAlf.g:2628:1: ( ( rule__BasicFeatureDefinition__Group_2_0_2_1__0 )? )
            {
            // InternalAlf.g:2628:1: ( ( rule__BasicFeatureDefinition__Group_2_0_2_1__0 )? )
            // InternalAlf.g:2629:2: ( rule__BasicFeatureDefinition__Group_2_0_2_1__0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_2_1()); 
            // InternalAlf.g:2630:2: ( rule__BasicFeatureDefinition__Group_2_0_2_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_NATURAL_VALUE) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==42) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:2630:3: rule__BasicFeatureDefinition__Group_2_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_0_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2__2"
    // InternalAlf.g:2638:1: rule__BasicFeatureDefinition__Group_2_0_2__2 : rule__BasicFeatureDefinition__Group_2_0_2__2__Impl rule__BasicFeatureDefinition__Group_2_0_2__3 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2642:1: ( rule__BasicFeatureDefinition__Group_2_0_2__2__Impl rule__BasicFeatureDefinition__Group_2_0_2__3 )
            // InternalAlf.g:2643:2: rule__BasicFeatureDefinition__Group_2_0_2__2__Impl rule__BasicFeatureDefinition__Group_2_0_2__3
            {
            pushFollow(FOLLOW_16);
            rule__BasicFeatureDefinition__Group_2_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2__2__Impl"
    // InternalAlf.g:2650:1: rule__BasicFeatureDefinition__Group_2_0_2__2__Impl : ( ( rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2654:1: ( ( ( rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2 ) ) )
            // InternalAlf.g:2655:1: ( ( rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2 ) )
            {
            // InternalAlf.g:2655:1: ( ( rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2 ) )
            // InternalAlf.g:2656:2: ( rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getUpperAssignment_2_0_2_2()); 
            // InternalAlf.g:2657:2: ( rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2 )
            // InternalAlf.g:2657:3: rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getUpperAssignment_2_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2__3"
    // InternalAlf.g:2665:1: rule__BasicFeatureDefinition__Group_2_0_2__3 : rule__BasicFeatureDefinition__Group_2_0_2__3__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2669:1: ( rule__BasicFeatureDefinition__Group_2_0_2__3__Impl )
            // InternalAlf.g:2670:2: rule__BasicFeatureDefinition__Group_2_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2__3"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2__3__Impl"
    // InternalAlf.g:2676:1: rule__BasicFeatureDefinition__Group_2_0_2__3__Impl : ( ']' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2680:1: ( ( ']' ) )
            // InternalAlf.g:2681:1: ( ']' )
            {
            // InternalAlf.g:2681:1: ( ']' )
            // InternalAlf.g:2682:2: ']'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_0_2_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2__3__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2_1__0"
    // InternalAlf.g:2692:1: rule__BasicFeatureDefinition__Group_2_0_2_1__0 : rule__BasicFeatureDefinition__Group_2_0_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_2_1__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2696:1: ( rule__BasicFeatureDefinition__Group_2_0_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_2_1__1 )
            // InternalAlf.g:2697:2: rule__BasicFeatureDefinition__Group_2_0_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_2_1__1
            {
            pushFollow(FOLLOW_17);
            rule__BasicFeatureDefinition__Group_2_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2_1__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2_1__0__Impl"
    // InternalAlf.g:2704:1: rule__BasicFeatureDefinition__Group_2_0_2_1__0__Impl : ( ( rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2708:1: ( ( ( rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0 ) ) )
            // InternalAlf.g:2709:1: ( ( rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0 ) )
            {
            // InternalAlf.g:2709:1: ( ( rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0 ) )
            // InternalAlf.g:2710:2: ( rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLowerAssignment_2_0_2_1_0()); 
            // InternalAlf.g:2711:2: ( rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0 )
            // InternalAlf.g:2711:3: rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getLowerAssignment_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2_1__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2_1__1"
    // InternalAlf.g:2719:1: rule__BasicFeatureDefinition__Group_2_0_2_1__1 : rule__BasicFeatureDefinition__Group_2_0_2_1__1__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2723:1: ( rule__BasicFeatureDefinition__Group_2_0_2_1__1__Impl )
            // InternalAlf.g:2724:2: rule__BasicFeatureDefinition__Group_2_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2_1__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_2_1__1__Impl"
    // InternalAlf.g:2730:1: rule__BasicFeatureDefinition__Group_2_0_2_1__1__Impl : ( '..' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2734:1: ( ( '..' ) )
            // InternalAlf.g:2735:1: ( '..' )
            {
            // InternalAlf.g:2735:1: ( '..' )
            // InternalAlf.g:2736:2: '..'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_0_2_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_2_1__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_0__0"
    // InternalAlf.g:2746:1: rule__BasicFeatureDefinition__Group_2_0_3_0__0 : rule__BasicFeatureDefinition__Group_2_0_3_0__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_0__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2750:1: ( rule__BasicFeatureDefinition__Group_2_0_3_0__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_0__1 )
            // InternalAlf.g:2751:2: rule__BasicFeatureDefinition__Group_2_0_3_0__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_0__1
            {
            pushFollow(FOLLOW_18);
            rule__BasicFeatureDefinition__Group_2_0_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_0__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_0__0__Impl"
    // InternalAlf.g:2758:1: rule__BasicFeatureDefinition__Group_2_0_3_0__0__Impl : ( ( rule__BasicFeatureDefinition__Group_2_0_3_0_0__0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2762:1: ( ( ( rule__BasicFeatureDefinition__Group_2_0_3_0_0__0 )? ) )
            // InternalAlf.g:2763:1: ( ( rule__BasicFeatureDefinition__Group_2_0_3_0_0__0 )? )
            {
            // InternalAlf.g:2763:1: ( ( rule__BasicFeatureDefinition__Group_2_0_3_0_0__0 )? )
            // InternalAlf.g:2764:2: ( rule__BasicFeatureDefinition__Group_2_0_3_0_0__0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_3_0_0()); 
            // InternalAlf.g:2765:2: ( rule__BasicFeatureDefinition__Group_2_0_3_0_0__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:2765:3: rule__BasicFeatureDefinition__Group_2_0_3_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_0_3_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_0__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_0__1"
    // InternalAlf.g:2773:1: rule__BasicFeatureDefinition__Group_2_0_3_0__1 : rule__BasicFeatureDefinition__Group_2_0_3_0__1__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2777:1: ( rule__BasicFeatureDefinition__Group_2_0_3_0__1__Impl )
            // InternalAlf.g:2778:2: rule__BasicFeatureDefinition__Group_2_0_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_0__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_0__1__Impl"
    // InternalAlf.g:2784:1: rule__BasicFeatureDefinition__Group_2_0_3_0__1__Impl : ( ';' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2788:1: ( ( ';' ) )
            // InternalAlf.g:2789:1: ( ';' )
            {
            // InternalAlf.g:2789:1: ( ';' )
            // InternalAlf.g:2790:2: ';'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_0_3_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_0_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_0__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_0_0__0"
    // InternalAlf.g:2800:1: rule__BasicFeatureDefinition__Group_2_0_3_0_0__0 : rule__BasicFeatureDefinition__Group_2_0_3_0_0__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_0_0__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2804:1: ( rule__BasicFeatureDefinition__Group_2_0_3_0_0__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_0_0__1 )
            // InternalAlf.g:2805:2: rule__BasicFeatureDefinition__Group_2_0_3_0_0__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_0_0__1
            {
            pushFollow(FOLLOW_19);
            rule__BasicFeatureDefinition__Group_2_0_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_3_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_0_0__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_0_0__0__Impl"
    // InternalAlf.g:2812:1: rule__BasicFeatureDefinition__Group_2_0_3_0_0__0__Impl : ( '=' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2816:1: ( ( '=' ) )
            // InternalAlf.g:2817:1: ( '=' )
            {
            // InternalAlf.g:2817:1: ( '=' )
            // InternalAlf.g:2818:2: '='
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getEqualsSignKeyword_2_0_3_0_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getEqualsSignKeyword_2_0_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_0_0__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_0_0__1"
    // InternalAlf.g:2827:1: rule__BasicFeatureDefinition__Group_2_0_3_0_0__1 : rule__BasicFeatureDefinition__Group_2_0_3_0_0__1__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2831:1: ( rule__BasicFeatureDefinition__Group_2_0_3_0_0__1__Impl )
            // InternalAlf.g:2832:2: rule__BasicFeatureDefinition__Group_2_0_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_3_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_0_0__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_0_0__1__Impl"
    // InternalAlf.g:2838:1: rule__BasicFeatureDefinition__Group_2_0_3_0_0__1__Impl : ( ( rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2842:1: ( ( ( rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1 ) ) )
            // InternalAlf.g:2843:1: ( ( rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1 ) )
            {
            // InternalAlf.g:2843:1: ( ( rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1 ) )
            // InternalAlf.g:2844:2: ( rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getValueAssignment_2_0_3_0_0_1()); 
            // InternalAlf.g:2845:2: ( rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1 )
            // InternalAlf.g:2845:3: rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getValueAssignment_2_0_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_0_0__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_1__0"
    // InternalAlf.g:2854:1: rule__BasicFeatureDefinition__Group_2_0_3_1__0 : rule__BasicFeatureDefinition__Group_2_0_3_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_1__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2858:1: ( rule__BasicFeatureDefinition__Group_2_0_3_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_1__1 )
            // InternalAlf.g:2859:2: rule__BasicFeatureDefinition__Group_2_0_3_1__0__Impl rule__BasicFeatureDefinition__Group_2_0_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__BasicFeatureDefinition__Group_2_0_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_1__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_1__0__Impl"
    // InternalAlf.g:2866:1: rule__BasicFeatureDefinition__Group_2_0_3_1__0__Impl : ( '{' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2870:1: ( ( '{' ) )
            // InternalAlf.g:2871:1: ( '{' )
            {
            // InternalAlf.g:2871:1: ( '{' )
            // InternalAlf.g:2872:2: '{'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_3_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_1__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_1__1"
    // InternalAlf.g:2881:1: rule__BasicFeatureDefinition__Group_2_0_3_1__1 : rule__BasicFeatureDefinition__Group_2_0_3_1__1__Impl rule__BasicFeatureDefinition__Group_2_0_3_1__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2885:1: ( rule__BasicFeatureDefinition__Group_2_0_3_1__1__Impl rule__BasicFeatureDefinition__Group_2_0_3_1__2 )
            // InternalAlf.g:2886:2: rule__BasicFeatureDefinition__Group_2_0_3_1__1__Impl rule__BasicFeatureDefinition__Group_2_0_3_1__2
            {
            pushFollow(FOLLOW_5);
            rule__BasicFeatureDefinition__Group_2_0_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_1__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_1__1__Impl"
    // InternalAlf.g:2893:1: rule__BasicFeatureDefinition__Group_2_0_3_1__1__Impl : ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1 )* ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2897:1: ( ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1 )* ) )
            // InternalAlf.g:2898:1: ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1 )* )
            {
            // InternalAlf.g:2898:1: ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1 )* )
            // InternalAlf.g:2899:2: ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1 )*
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipAssignment_2_0_3_1_1()); 
            // InternalAlf.g:2900:2: ( rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_UNRESTRICTED_NAME)||(LA42_0>=15 && LA42_0<=18)||LA42_0==20||(LA42_0>=28 && LA42_0<=34)||(LA42_0>=44 && LA42_0<=45)||(LA42_0>=51 && LA42_0<=52)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAlf.g:2900:3: rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipAssignment_2_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_1__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_1__2"
    // InternalAlf.g:2908:1: rule__BasicFeatureDefinition__Group_2_0_3_1__2 : rule__BasicFeatureDefinition__Group_2_0_3_1__2__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2912:1: ( rule__BasicFeatureDefinition__Group_2_0_3_1__2__Impl )
            // InternalAlf.g:2913:2: rule__BasicFeatureDefinition__Group_2_0_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_0_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_1__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_0_3_1__2__Impl"
    // InternalAlf.g:2919:1: rule__BasicFeatureDefinition__Group_2_0_3_1__2__Impl : ( '}' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_0_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2923:1: ( ( '}' ) )
            // InternalAlf.g:2924:1: ( '}' )
            {
            // InternalAlf.g:2924:1: ( '}' )
            // InternalAlf.g:2925:2: '}'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_3_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_0_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_0_3_1__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1__0"
    // InternalAlf.g:2935:1: rule__BasicFeatureDefinition__Group_2_1__0 : rule__BasicFeatureDefinition__Group_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_1__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2939:1: ( rule__BasicFeatureDefinition__Group_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_1__1 )
            // InternalAlf.g:2940:2: rule__BasicFeatureDefinition__Group_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__BasicFeatureDefinition__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1__0__Impl"
    // InternalAlf.g:2947:1: rule__BasicFeatureDefinition__Group_2_1__0__Impl : ( ( rule__BasicFeatureDefinition__NameAssignment_2_1_0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2951:1: ( ( ( rule__BasicFeatureDefinition__NameAssignment_2_1_0 )? ) )
            // InternalAlf.g:2952:1: ( ( rule__BasicFeatureDefinition__NameAssignment_2_1_0 )? )
            {
            // InternalAlf.g:2952:1: ( ( rule__BasicFeatureDefinition__NameAssignment_2_1_0 )? )
            // InternalAlf.g:2953:2: ( rule__BasicFeatureDefinition__NameAssignment_2_1_0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getNameAssignment_2_1_0()); 
            // InternalAlf.g:2954:2: ( rule__BasicFeatureDefinition__NameAssignment_2_1_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlf.g:2954:3: rule__BasicFeatureDefinition__NameAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__NameAssignment_2_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getNameAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1__1"
    // InternalAlf.g:2962:1: rule__BasicFeatureDefinition__Group_2_1__1 : rule__BasicFeatureDefinition__Group_2_1__1__Impl rule__BasicFeatureDefinition__Group_2_1__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2966:1: ( rule__BasicFeatureDefinition__Group_2_1__1__Impl rule__BasicFeatureDefinition__Group_2_1__2 )
            // InternalAlf.g:2967:2: rule__BasicFeatureDefinition__Group_2_1__1__Impl rule__BasicFeatureDefinition__Group_2_1__2
            {
            pushFollow(FOLLOW_20);
            rule__BasicFeatureDefinition__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1__1__Impl"
    // InternalAlf.g:2974:1: rule__BasicFeatureDefinition__Group_2_1__1__Impl : ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_1 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2978:1: ( ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_1 ) ) )
            // InternalAlf.g:2979:1: ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_1 ) )
            {
            // InternalAlf.g:2979:1: ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_1 ) )
            // InternalAlf.g:2980:2: ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_1 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipAssignment_2_1_1()); 
            // InternalAlf.g:2981:2: ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_1 )
            // InternalAlf.g:2981:3: rule__BasicFeatureDefinition__MembershipAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__MembershipAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1__2"
    // InternalAlf.g:2989:1: rule__BasicFeatureDefinition__Group_2_1__2 : rule__BasicFeatureDefinition__Group_2_1__2__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:2993:1: ( rule__BasicFeatureDefinition__Group_2_1__2__Impl )
            // InternalAlf.g:2994:2: rule__BasicFeatureDefinition__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1__2__Impl"
    // InternalAlf.g:3000:1: rule__BasicFeatureDefinition__Group_2_1__2__Impl : ( ( rule__BasicFeatureDefinition__Alternatives_2_1_2 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3004:1: ( ( ( rule__BasicFeatureDefinition__Alternatives_2_1_2 ) ) )
            // InternalAlf.g:3005:1: ( ( rule__BasicFeatureDefinition__Alternatives_2_1_2 ) )
            {
            // InternalAlf.g:3005:1: ( ( rule__BasicFeatureDefinition__Alternatives_2_1_2 ) )
            // InternalAlf.g:3006:2: ( rule__BasicFeatureDefinition__Alternatives_2_1_2 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_2_1_2()); 
            // InternalAlf.g:3007:2: ( rule__BasicFeatureDefinition__Alternatives_2_1_2 )
            // InternalAlf.g:3007:3: rule__BasicFeatureDefinition__Alternatives_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Alternatives_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0__0"
    // InternalAlf.g:3016:1: rule__BasicFeatureDefinition__Group_2_1_2_0__0 : rule__BasicFeatureDefinition__Group_2_1_2_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3020:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0__1 )
            // InternalAlf.g:3021:2: rule__BasicFeatureDefinition__Group_2_1_2_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0__1
            {
            pushFollow(FOLLOW_20);
            rule__BasicFeatureDefinition__Group_2_1_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0__0__Impl"
    // InternalAlf.g:3028:1: rule__BasicFeatureDefinition__Group_2_1_2_0__0__Impl : ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3032:1: ( ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__0 )? ) )
            // InternalAlf.g:3033:1: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__0 )? )
            {
            // InternalAlf.g:3033:1: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__0 )? )
            // InternalAlf.g:3034:2: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0_0()); 
            // InternalAlf.g:3035:2: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:3035:3: rule__BasicFeatureDefinition__Group_2_1_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_1_2_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0__1"
    // InternalAlf.g:3043:1: rule__BasicFeatureDefinition__Group_2_1_2_0__1 : rule__BasicFeatureDefinition__Group_2_1_2_0__1__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3047:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0__1__Impl )
            // InternalAlf.g:3048:2: rule__BasicFeatureDefinition__Group_2_1_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0__1__Impl"
    // InternalAlf.g:3054:1: rule__BasicFeatureDefinition__Group_2_1_2_0__1__Impl : ( ( rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3058:1: ( ( ( rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1 ) ) )
            // InternalAlf.g:3059:1: ( ( rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1 ) )
            {
            // InternalAlf.g:3059:1: ( ( rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1 ) )
            // InternalAlf.g:3060:2: ( rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_2_1_2_0_1()); 
            // InternalAlf.g:3061:2: ( rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1 )
            // InternalAlf.g:3061:3: rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Alternatives_2_1_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getAlternatives_2_1_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0__0"
    // InternalAlf.g:3070:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0__0 : rule__BasicFeatureDefinition__Group_2_1_2_0_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3074:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__1 )
            // InternalAlf.g:3075:2: rule__BasicFeatureDefinition__Group_2_1_2_0_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__1
            {
            pushFollow(FOLLOW_15);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0__0__Impl"
    // InternalAlf.g:3082:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0__0__Impl : ( '[' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3086:1: ( ( '[' ) )
            // InternalAlf.g:3087:1: ( '[' )
            {
            // InternalAlf.g:3087:1: ( '[' )
            // InternalAlf.g:3088:2: '['
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_2_0_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0__1"
    // InternalAlf.g:3097:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0__1 : rule__BasicFeatureDefinition__Group_2_1_2_0_0__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3101:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__2 )
            // InternalAlf.g:3102:2: rule__BasicFeatureDefinition__Group_2_1_2_0_0__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__2
            {
            pushFollow(FOLLOW_15);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0__1__Impl"
    // InternalAlf.g:3109:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0__1__Impl : ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3113:1: ( ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0 )? ) )
            // InternalAlf.g:3114:1: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0 )? )
            {
            // InternalAlf.g:3114:1: ( ( rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0 )? )
            // InternalAlf.g:3115:2: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0_0_1()); 
            // InternalAlf.g:3116:2: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_NATURAL_VALUE) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==42) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalAlf.g:3116:3: rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0__2"
    // InternalAlf.g:3124:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0__2 : rule__BasicFeatureDefinition__Group_2_1_2_0_0__2__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__3 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3128:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__2__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__3 )
            // InternalAlf.g:3129:2: rule__BasicFeatureDefinition__Group_2_1_2_0_0__2__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0__3
            {
            pushFollow(FOLLOW_16);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0__2__Impl"
    // InternalAlf.g:3136:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0__2__Impl : ( ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3140:1: ( ( ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2 ) ) )
            // InternalAlf.g:3141:1: ( ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2 ) )
            {
            // InternalAlf.g:3141:1: ( ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2 ) )
            // InternalAlf.g:3142:2: ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getUpperAssignment_2_1_2_0_0_2()); 
            // InternalAlf.g:3143:2: ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2 )
            // InternalAlf.g:3143:3: rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getUpperAssignment_2_1_2_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0__3"
    // InternalAlf.g:3151:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0__3 : rule__BasicFeatureDefinition__Group_2_1_2_0_0__3__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3155:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0__3__Impl )
            // InternalAlf.g:3156:2: rule__BasicFeatureDefinition__Group_2_1_2_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0__3"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0__3__Impl"
    // InternalAlf.g:3162:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0__3__Impl : ( ']' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3166:1: ( ( ']' ) )
            // InternalAlf.g:3167:1: ( ']' )
            {
            // InternalAlf.g:3167:1: ( ']' )
            // InternalAlf.g:3168:2: ']'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_2_0_0_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_2_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0__3__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0"
    // InternalAlf.g:3178:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0 : rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3182:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1 )
            // InternalAlf.g:3183:2: rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1
            {
            pushFollow(FOLLOW_17);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0__Impl"
    // InternalAlf.g:3190:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0__Impl : ( ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3194:1: ( ( ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0 ) ) )
            // InternalAlf.g:3195:1: ( ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0 ) )
            {
            // InternalAlf.g:3195:1: ( ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0 ) )
            // InternalAlf.g:3196:2: ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLowerAssignment_2_1_2_0_0_1_0()); 
            // InternalAlf.g:3197:2: ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0 )
            // InternalAlf.g:3197:3: rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getLowerAssignment_2_1_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1"
    // InternalAlf.g:3205:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1 : rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3209:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1__Impl )
            // InternalAlf.g:3210:2: rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1__Impl"
    // InternalAlf.g:3216:1: rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1__Impl : ( '..' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3220:1: ( ( '..' ) )
            // InternalAlf.g:3221:1: ( '..' )
            {
            // InternalAlf.g:3221:1: ( '..' )
            // InternalAlf.g:3222:2: '..'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_2_0_0_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_2_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_0_1__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0"
    // InternalAlf.g:3232:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0 : rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3236:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1 )
            // InternalAlf.g:3237:2: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0__Impl"
    // InternalAlf.g:3244:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0__Impl : ( '=' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3248:1: ( ( '=' ) )
            // InternalAlf.g:3249:1: ( '=' )
            {
            // InternalAlf.g:3249:1: ( '=' )
            // InternalAlf.g:3250:2: '='
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getEqualsSignKeyword_2_1_2_0_1_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getEqualsSignKeyword_2_1_2_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1"
    // InternalAlf.g:3259:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1 : rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3263:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2 )
            // InternalAlf.g:3264:2: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2
            {
            pushFollow(FOLLOW_8);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1__Impl"
    // InternalAlf.g:3271:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1__Impl : ( ( rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3275:1: ( ( ( rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1 ) ) )
            // InternalAlf.g:3276:1: ( ( rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1 ) )
            {
            // InternalAlf.g:3276:1: ( ( rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1 ) )
            // InternalAlf.g:3277:2: ( rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getValueAssignment_2_1_2_0_1_0_1()); 
            // InternalAlf.g:3278:2: ( rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1 )
            // InternalAlf.g:3278:3: rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getValueAssignment_2_1_2_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2"
    // InternalAlf.g:3286:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2 : rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3290:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2__Impl )
            // InternalAlf.g:3291:2: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2__Impl"
    // InternalAlf.g:3297:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2__Impl : ( ';' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3301:1: ( ( ';' ) )
            // InternalAlf.g:3302:1: ( ';' )
            {
            // InternalAlf.g:3302:1: ( ';' )
            // InternalAlf.g:3303:2: ';'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_1_2_0_1_0_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_1_2_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_0__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0"
    // InternalAlf.g:3313:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0 : rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3317:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1 )
            // InternalAlf.g:3318:2: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0__Impl"
    // InternalAlf.g:3325:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0__Impl : ( '{' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3329:1: ( ( '{' ) )
            // InternalAlf.g:3330:1: ( '{' )
            {
            // InternalAlf.g:3330:1: ( '{' )
            // InternalAlf.g:3331:2: '{'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_1_2_0_1_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getLeftCurlyBracketKeyword_2_1_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1"
    // InternalAlf.g:3340:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1 : rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3344:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2 )
            // InternalAlf.g:3345:2: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1__Impl"
    // InternalAlf.g:3352:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1__Impl : ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1 )* ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3356:1: ( ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1 )* ) )
            // InternalAlf.g:3357:1: ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1 )* )
            {
            // InternalAlf.g:3357:1: ( ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1 )* )
            // InternalAlf.g:3358:2: ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1 )*
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipAssignment_2_1_2_0_1_1_1()); 
            // InternalAlf.g:3359:2: ( rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_UNRESTRICTED_NAME)||(LA46_0>=15 && LA46_0<=18)||LA46_0==20||(LA46_0>=28 && LA46_0<=34)||(LA46_0>=44 && LA46_0<=45)||(LA46_0>=51 && LA46_0<=52)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAlf.g:3359:3: rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipAssignment_2_1_2_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2"
    // InternalAlf.g:3367:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2 : rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3371:1: ( rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2__Impl )
            // InternalAlf.g:3372:2: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2__Impl"
    // InternalAlf.g:3378:1: rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2__Impl : ( '}' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3382:1: ( ( '}' ) )
            // InternalAlf.g:3383:1: ( '}' )
            {
            // InternalAlf.g:3383:1: ( '}' )
            // InternalAlf.g:3384:2: '}'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_1_2_0_1_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getRightCurlyBracketKeyword_2_1_2_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_0_1_1__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__0"
    // InternalAlf.g:3394:1: rule__BasicFeatureDefinition__Group_2_1_2_1__0 : rule__BasicFeatureDefinition__Group_2_1_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3398:1: ( rule__BasicFeatureDefinition__Group_2_1_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__1 )
            // InternalAlf.g:3399:2: rule__BasicFeatureDefinition__Group_2_1_2_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__BasicFeatureDefinition__Group_2_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__0__Impl"
    // InternalAlf.g:3406:1: rule__BasicFeatureDefinition__Group_2_1_2_1__0__Impl : ( '[' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3410:1: ( ( '[' ) )
            // InternalAlf.g:3411:1: ( '[' )
            {
            // InternalAlf.g:3411:1: ( '[' )
            // InternalAlf.g:3412:2: '['
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_2_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getLeftSquareBracketKeyword_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__1"
    // InternalAlf.g:3421:1: rule__BasicFeatureDefinition__Group_2_1_2_1__1 : rule__BasicFeatureDefinition__Group_2_1_2_1__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__2 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3425:1: ( rule__BasicFeatureDefinition__Group_2_1_2_1__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__2 )
            // InternalAlf.g:3426:2: rule__BasicFeatureDefinition__Group_2_1_2_1__1__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__2
            {
            pushFollow(FOLLOW_15);
            rule__BasicFeatureDefinition__Group_2_1_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__1__Impl"
    // InternalAlf.g:3433:1: rule__BasicFeatureDefinition__Group_2_1_2_1__1__Impl : ( ( rule__BasicFeatureDefinition__Group_2_1_2_1_1__0 )? ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3437:1: ( ( ( rule__BasicFeatureDefinition__Group_2_1_2_1_1__0 )? ) )
            // InternalAlf.g:3438:1: ( ( rule__BasicFeatureDefinition__Group_2_1_2_1_1__0 )? )
            {
            // InternalAlf.g:3438:1: ( ( rule__BasicFeatureDefinition__Group_2_1_2_1_1__0 )? )
            // InternalAlf.g:3439:2: ( rule__BasicFeatureDefinition__Group_2_1_2_1_1__0 )?
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_1_1()); 
            // InternalAlf.g:3440:2: ( rule__BasicFeatureDefinition__Group_2_1_2_1_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_NATURAL_VALUE) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==42) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:3440:3: rule__BasicFeatureDefinition__Group_2_1_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicFeatureDefinition__Group_2_1_2_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getGroup_2_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__1__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__2"
    // InternalAlf.g:3448:1: rule__BasicFeatureDefinition__Group_2_1_2_1__2 : rule__BasicFeatureDefinition__Group_2_1_2_1__2__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__3 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3452:1: ( rule__BasicFeatureDefinition__Group_2_1_2_1__2__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__3 )
            // InternalAlf.g:3453:2: rule__BasicFeatureDefinition__Group_2_1_2_1__2__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__3
            {
            pushFollow(FOLLOW_16);
            rule__BasicFeatureDefinition__Group_2_1_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__2"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__2__Impl"
    // InternalAlf.g:3460:1: rule__BasicFeatureDefinition__Group_2_1_2_1__2__Impl : ( ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3464:1: ( ( ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2 ) ) )
            // InternalAlf.g:3465:1: ( ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2 ) )
            {
            // InternalAlf.g:3465:1: ( ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2 ) )
            // InternalAlf.g:3466:2: ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getUpperAssignment_2_1_2_1_2()); 
            // InternalAlf.g:3467:2: ( rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2 )
            // InternalAlf.g:3467:3: rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getUpperAssignment_2_1_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__2__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__3"
    // InternalAlf.g:3475:1: rule__BasicFeatureDefinition__Group_2_1_2_1__3 : rule__BasicFeatureDefinition__Group_2_1_2_1__3__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__4 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3479:1: ( rule__BasicFeatureDefinition__Group_2_1_2_1__3__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__4 )
            // InternalAlf.g:3480:2: rule__BasicFeatureDefinition__Group_2_1_2_1__3__Impl rule__BasicFeatureDefinition__Group_2_1_2_1__4
            {
            pushFollow(FOLLOW_8);
            rule__BasicFeatureDefinition__Group_2_1_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__3"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__3__Impl"
    // InternalAlf.g:3487:1: rule__BasicFeatureDefinition__Group_2_1_2_1__3__Impl : ( ']' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3491:1: ( ( ']' ) )
            // InternalAlf.g:3492:1: ( ']' )
            {
            // InternalAlf.g:3492:1: ( ']' )
            // InternalAlf.g:3493:2: ']'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_2_1_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getRightSquareBracketKeyword_2_1_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__3__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__4"
    // InternalAlf.g:3502:1: rule__BasicFeatureDefinition__Group_2_1_2_1__4 : rule__BasicFeatureDefinition__Group_2_1_2_1__4__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3506:1: ( rule__BasicFeatureDefinition__Group_2_1_2_1__4__Impl )
            // InternalAlf.g:3507:2: rule__BasicFeatureDefinition__Group_2_1_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__4"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1__4__Impl"
    // InternalAlf.g:3513:1: rule__BasicFeatureDefinition__Group_2_1_2_1__4__Impl : ( ';' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3517:1: ( ( ';' ) )
            // InternalAlf.g:3518:1: ( ';' )
            {
            // InternalAlf.g:3518:1: ( ';' )
            // InternalAlf.g:3519:2: ';'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_1_2_1_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getSemicolonKeyword_2_1_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1__4__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1_1__0"
    // InternalAlf.g:3529:1: rule__BasicFeatureDefinition__Group_2_1_2_1_1__0 : rule__BasicFeatureDefinition__Group_2_1_2_1_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_1_1__1 ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3533:1: ( rule__BasicFeatureDefinition__Group_2_1_2_1_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_1_1__1 )
            // InternalAlf.g:3534:2: rule__BasicFeatureDefinition__Group_2_1_2_1_1__0__Impl rule__BasicFeatureDefinition__Group_2_1_2_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__BasicFeatureDefinition__Group_2_1_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1_1__0"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1_1__0__Impl"
    // InternalAlf.g:3541:1: rule__BasicFeatureDefinition__Group_2_1_2_1_1__0__Impl : ( ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0 ) ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3545:1: ( ( ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0 ) ) )
            // InternalAlf.g:3546:1: ( ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0 ) )
            {
            // InternalAlf.g:3546:1: ( ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0 ) )
            // InternalAlf.g:3547:2: ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0 )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLowerAssignment_2_1_2_1_1_0()); 
            // InternalAlf.g:3548:2: ( rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0 )
            // InternalAlf.g:3548:3: rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getLowerAssignment_2_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1_1__0__Impl"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1_1__1"
    // InternalAlf.g:3556:1: rule__BasicFeatureDefinition__Group_2_1_2_1_1__1 : rule__BasicFeatureDefinition__Group_2_1_2_1_1__1__Impl ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3560:1: ( rule__BasicFeatureDefinition__Group_2_1_2_1_1__1__Impl )
            // InternalAlf.g:3561:2: rule__BasicFeatureDefinition__Group_2_1_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicFeatureDefinition__Group_2_1_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1_1__1"


    // $ANTLR start "rule__BasicFeatureDefinition__Group_2_1_2_1_1__1__Impl"
    // InternalAlf.g:3567:1: rule__BasicFeatureDefinition__Group_2_1_2_1_1__1__Impl : ( '..' ) ;
    public final void rule__BasicFeatureDefinition__Group_2_1_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3571:1: ( ( '..' ) )
            // InternalAlf.g:3572:1: ( '..' )
            {
            // InternalAlf.g:3572:1: ( '..' )
            // InternalAlf.g:3573:2: '..'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_2_1_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getFullStopFullStopKeyword_2_1_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__Group_2_1_2_1_1__1__Impl"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__Group_0__0"
    // InternalAlf.g:3583:1: rule__OwnedRedefinitionOrSubset__Group_0__0 : rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3587:1: ( rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1 )
            // InternalAlf.g:3588:2: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl rule__OwnedRedefinitionOrSubset__Group_0__1
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
    // InternalAlf.g:3595:1: rule__OwnedRedefinitionOrSubset__Group_0__0__Impl : ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3599:1: ( ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) ) )
            // InternalAlf.g:3600:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            {
            // InternalAlf.g:3600:1: ( ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 ) )
            // InternalAlf.g:3601:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getAlternatives_0_0()); 
            // InternalAlf.g:3602:2: ( rule__OwnedRedefinitionOrSubset__Alternatives_0_0 )
            // InternalAlf.g:3602:3: rule__OwnedRedefinitionOrSubset__Alternatives_0_0
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
    // InternalAlf.g:3610:1: rule__OwnedRedefinitionOrSubset__Group_0__1 : rule__OwnedRedefinitionOrSubset__Group_0__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3614:1: ( rule__OwnedRedefinitionOrSubset__Group_0__1__Impl )
            // InternalAlf.g:3615:2: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl
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
    // InternalAlf.g:3621:1: rule__OwnedRedefinitionOrSubset__Group_0__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3625:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) ) )
            // InternalAlf.g:3626:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            {
            // InternalAlf.g:3626:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 ) )
            // InternalAlf.g:3627:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_0_1()); 
            // InternalAlf.g:3628:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 )
            // InternalAlf.g:3628:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1
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
    // InternalAlf.g:3637:1: rule__OwnedRedefinitionOrSubset__Group_1__0 : rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3641:1: ( rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1 )
            // InternalAlf.g:3642:2: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl rule__OwnedRedefinitionOrSubset__Group_1__1
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
    // InternalAlf.g:3649:1: rule__OwnedRedefinitionOrSubset__Group_1__0__Impl : ( 'subsets' ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3653:1: ( ( 'subsets' ) )
            // InternalAlf.g:3654:1: ( 'subsets' )
            {
            // InternalAlf.g:3654:1: ( 'subsets' )
            // InternalAlf.g:3655:2: 'subsets'
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAlf.g:3664:1: rule__OwnedRedefinitionOrSubset__Group_1__1 : rule__OwnedRedefinitionOrSubset__Group_1__1__Impl ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3668:1: ( rule__OwnedRedefinitionOrSubset__Group_1__1__Impl )
            // InternalAlf.g:3669:2: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl
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
    // InternalAlf.g:3675:1: rule__OwnedRedefinitionOrSubset__Group_1__1__Impl : ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) ;
    public final void rule__OwnedRedefinitionOrSubset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3679:1: ( ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) ) )
            // InternalAlf.g:3680:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            {
            // InternalAlf.g:3680:1: ( ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 ) )
            // InternalAlf.g:3681:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            {
             before(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementAssignment_1_1()); 
            // InternalAlf.g:3682:2: ( rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 )
            // InternalAlf.g:3682:3: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1
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
    // InternalAlf.g:3691:1: rule__ConnectorDefinition__Group__0 : rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 ;
    public final void rule__ConnectorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3695:1: ( rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1 )
            // InternalAlf.g:3696:2: rule__ConnectorDefinition__Group__0__Impl rule__ConnectorDefinition__Group__1
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
    // InternalAlf.g:3703:1: rule__ConnectorDefinition__Group__0__Impl : ( 'connector' ) ;
    public final void rule__ConnectorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3707:1: ( ( 'connector' ) )
            // InternalAlf.g:3708:1: ( 'connector' )
            {
            // InternalAlf.g:3708:1: ( 'connector' )
            // InternalAlf.g:3709:2: 'connector'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getConnectorKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConnectorDefinitionAccess().getConnectorKeyword_0()); 

            }


            }

        }
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
    // InternalAlf.g:3718:1: rule__ConnectorDefinition__Group__1 : rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 ;
    public final void rule__ConnectorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3722:1: ( rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2 )
            // InternalAlf.g:3723:2: rule__ConnectorDefinition__Group__1__Impl rule__ConnectorDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalAlf.g:3730:1: rule__ConnectorDefinition__Group__1__Impl : ( ( rule__ConnectorDefinition__NameAssignment_1 )? ) ;
    public final void rule__ConnectorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3734:1: ( ( ( rule__ConnectorDefinition__NameAssignment_1 )? ) )
            // InternalAlf.g:3735:1: ( ( rule__ConnectorDefinition__NameAssignment_1 )? )
            {
            // InternalAlf.g:3735:1: ( ( rule__ConnectorDefinition__NameAssignment_1 )? )
            // InternalAlf.g:3736:2: ( rule__ConnectorDefinition__NameAssignment_1 )?
            {
             before(grammarAccess.getConnectorDefinitionAccess().getNameAssignment_1()); 
            // InternalAlf.g:3737:2: ( rule__ConnectorDefinition__NameAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( ((LA48_1>=RULE_ID && LA48_1<=RULE_UNRESTRICTED_NAME)) ) {
                    alt48=1;
                }
            }
            else if ( (LA48_0==RULE_UNRESTRICTED_NAME) ) {
                int LA48_2 = input.LA(2);

                if ( ((LA48_2>=RULE_ID && LA48_2<=RULE_UNRESTRICTED_NAME)) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:3737:3: rule__ConnectorDefinition__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorDefinition__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAlf.g:3745:1: rule__ConnectorDefinition__Group__2 : rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 ;
    public final void rule__ConnectorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3749:1: ( rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3 )
            // InternalAlf.g:3750:2: rule__ConnectorDefinition__Group__2__Impl rule__ConnectorDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalAlf.g:3757:1: rule__ConnectorDefinition__Group__2__Impl : ( ( rule__ConnectorDefinition__SourcePathAssignment_2 ) ) ;
    public final void rule__ConnectorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3761:1: ( ( ( rule__ConnectorDefinition__SourcePathAssignment_2 ) ) )
            // InternalAlf.g:3762:1: ( ( rule__ConnectorDefinition__SourcePathAssignment_2 ) )
            {
            // InternalAlf.g:3762:1: ( ( rule__ConnectorDefinition__SourcePathAssignment_2 ) )
            // InternalAlf.g:3763:2: ( rule__ConnectorDefinition__SourcePathAssignment_2 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourcePathAssignment_2()); 
            // InternalAlf.g:3764:2: ( rule__ConnectorDefinition__SourcePathAssignment_2 )
            // InternalAlf.g:3764:3: rule__ConnectorDefinition__SourcePathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__SourcePathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectorDefinitionAccess().getSourcePathAssignment_2()); 

            }


            }

        }
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
    // InternalAlf.g:3772:1: rule__ConnectorDefinition__Group__3 : rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 ;
    public final void rule__ConnectorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3776:1: ( rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4 )
            // InternalAlf.g:3777:2: rule__ConnectorDefinition__Group__3__Impl rule__ConnectorDefinition__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalAlf.g:3784:1: rule__ConnectorDefinition__Group__3__Impl : ( '=>' ) ;
    public final void rule__ConnectorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3788:1: ( ( '=>' ) )
            // InternalAlf.g:3789:1: ( '=>' )
            {
            // InternalAlf.g:3789:1: ( '=>' )
            // InternalAlf.g:3790:2: '=>'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_3()); 

            }


            }

        }
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
    // InternalAlf.g:3799:1: rule__ConnectorDefinition__Group__4 : rule__ConnectorDefinition__Group__4__Impl rule__ConnectorDefinition__Group__5 ;
    public final void rule__ConnectorDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3803:1: ( rule__ConnectorDefinition__Group__4__Impl rule__ConnectorDefinition__Group__5 )
            // InternalAlf.g:3804:2: rule__ConnectorDefinition__Group__4__Impl rule__ConnectorDefinition__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ConnectorDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAlf.g:3811:1: rule__ConnectorDefinition__Group__4__Impl : ( ( rule__ConnectorDefinition__TargetPathAssignment_4 ) ) ;
    public final void rule__ConnectorDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3815:1: ( ( ( rule__ConnectorDefinition__TargetPathAssignment_4 ) ) )
            // InternalAlf.g:3816:1: ( ( rule__ConnectorDefinition__TargetPathAssignment_4 ) )
            {
            // InternalAlf.g:3816:1: ( ( rule__ConnectorDefinition__TargetPathAssignment_4 ) )
            // InternalAlf.g:3817:2: ( rule__ConnectorDefinition__TargetPathAssignment_4 )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetPathAssignment_4()); 
            // InternalAlf.g:3818:2: ( rule__ConnectorDefinition__TargetPathAssignment_4 )
            // InternalAlf.g:3818:3: rule__ConnectorDefinition__TargetPathAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__TargetPathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectorDefinitionAccess().getTargetPathAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConnectorDefinition__Group__5"
    // InternalAlf.g:3826:1: rule__ConnectorDefinition__Group__5 : rule__ConnectorDefinition__Group__5__Impl ;
    public final void rule__ConnectorDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3830:1: ( rule__ConnectorDefinition__Group__5__Impl )
            // InternalAlf.g:3831:2: rule__ConnectorDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__5"


    // $ANTLR start "rule__ConnectorDefinition__Group__5__Impl"
    // InternalAlf.g:3837:1: rule__ConnectorDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__ConnectorDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3841:1: ( ( ';' ) )
            // InternalAlf.g:3842:1: ( ';' )
            {
            // InternalAlf.g:3842:1: ( ';' )
            // InternalAlf.g:3843:2: ';'
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__Group__5__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalAlf.g:3853:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3857:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalAlf.g:3858:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAlf.g:3865:1: rule__BinaryExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3869:1: ( ( ruleUnaryExpression ) )
            // InternalAlf.g:3870:1: ( ruleUnaryExpression )
            {
            // InternalAlf.g:3870:1: ( ruleUnaryExpression )
            // InternalAlf.g:3871:2: ruleUnaryExpression
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
    // InternalAlf.g:3880:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3884:1: ( rule__BinaryExpression__Group__1__Impl )
            // InternalAlf.g:3885:2: rule__BinaryExpression__Group__1__Impl
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
    // InternalAlf.g:3891:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__Group_1__0 )? ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3895:1: ( ( ( rule__BinaryExpression__Group_1__0 )? ) )
            // InternalAlf.g:3896:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            {
            // InternalAlf.g:3896:1: ( ( rule__BinaryExpression__Group_1__0 )? )
            // InternalAlf.g:3897:2: ( rule__BinaryExpression__Group_1__0 )?
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup_1()); 
            // InternalAlf.g:3898:2: ( rule__BinaryExpression__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=21 && LA49_0<=25)||LA49_0==53) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:3898:3: rule__BinaryExpression__Group_1__0
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
    // InternalAlf.g:3907:1: rule__BinaryExpression__Group_1__0 : rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 ;
    public final void rule__BinaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3911:1: ( rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1 )
            // InternalAlf.g:3912:2: rule__BinaryExpression__Group_1__0__Impl rule__BinaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAlf.g:3919:1: rule__BinaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3923:1: ( ( () ) )
            // InternalAlf.g:3924:1: ( () )
            {
            // InternalAlf.g:3924:1: ( () )
            // InternalAlf.g:3925:2: ()
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0()); 
            // InternalAlf.g:3926:2: ()
            // InternalAlf.g:3926:3: 
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
    // InternalAlf.g:3934:1: rule__BinaryExpression__Group_1__1 : rule__BinaryExpression__Group_1__1__Impl ;
    public final void rule__BinaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3938:1: ( rule__BinaryExpression__Group_1__1__Impl )
            // InternalAlf.g:3939:2: rule__BinaryExpression__Group_1__1__Impl
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
    // InternalAlf.g:3945:1: rule__BinaryExpression__Group_1__1__Impl : ( ( rule__BinaryExpression__Alternatives_1_1 ) ) ;
    public final void rule__BinaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3949:1: ( ( ( rule__BinaryExpression__Alternatives_1_1 ) ) )
            // InternalAlf.g:3950:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            {
            // InternalAlf.g:3950:1: ( ( rule__BinaryExpression__Alternatives_1_1 ) )
            // InternalAlf.g:3951:2: ( rule__BinaryExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getAlternatives_1_1()); 
            // InternalAlf.g:3952:2: ( rule__BinaryExpression__Alternatives_1_1 )
            // InternalAlf.g:3952:3: rule__BinaryExpression__Alternatives_1_1
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
    // InternalAlf.g:3961:1: rule__BinaryExpression__Group_1_1_0__0 : rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 ;
    public final void rule__BinaryExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3965:1: ( rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1 )
            // InternalAlf.g:3966:2: rule__BinaryExpression__Group_1_1_0__0__Impl rule__BinaryExpression__Group_1_1_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAlf.g:3973:1: rule__BinaryExpression__Group_1_1_0__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3977:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) ) )
            // InternalAlf.g:3978:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            {
            // InternalAlf.g:3978:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 ) )
            // InternalAlf.g:3979:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_0_0()); 
            // InternalAlf.g:3980:2: ( rule__BinaryExpression__OperatorAssignment_1_1_0_0 )
            // InternalAlf.g:3980:3: rule__BinaryExpression__OperatorAssignment_1_1_0_0
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
    // InternalAlf.g:3988:1: rule__BinaryExpression__Group_1_1_0__1 : rule__BinaryExpression__Group_1_1_0__1__Impl ;
    public final void rule__BinaryExpression__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:3992:1: ( rule__BinaryExpression__Group_1_1_0__1__Impl )
            // InternalAlf.g:3993:2: rule__BinaryExpression__Group_1_1_0__1__Impl
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
    // InternalAlf.g:3999:1: rule__BinaryExpression__Group_1_1_0__1__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4003:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) ) )
            // InternalAlf.g:4004:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            {
            // InternalAlf.g:4004:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_0_1 ) )
            // InternalAlf.g:4005:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_0_1()); 
            // InternalAlf.g:4006:2: ( rule__BinaryExpression__OperandAssignment_1_1_0_1 )
            // InternalAlf.g:4006:3: rule__BinaryExpression__OperandAssignment_1_1_0_1
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
    // InternalAlf.g:4015:1: rule__BinaryExpression__Group_1_1_1__0 : rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 ;
    public final void rule__BinaryExpression__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4019:1: ( rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1 )
            // InternalAlf.g:4020:2: rule__BinaryExpression__Group_1_1_1__0__Impl rule__BinaryExpression__Group_1_1_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAlf.g:4027:1: rule__BinaryExpression__Group_1_1_1__0__Impl : ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4031:1: ( ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) ) )
            // InternalAlf.g:4032:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            {
            // InternalAlf.g:4032:1: ( ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 ) )
            // InternalAlf.g:4033:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_1_1_1_0()); 
            // InternalAlf.g:4034:2: ( rule__BinaryExpression__OperatorAssignment_1_1_1_0 )
            // InternalAlf.g:4034:3: rule__BinaryExpression__OperatorAssignment_1_1_1_0
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
    // InternalAlf.g:4042:1: rule__BinaryExpression__Group_1_1_1__1 : rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 ;
    public final void rule__BinaryExpression__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4046:1: ( rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2 )
            // InternalAlf.g:4047:2: rule__BinaryExpression__Group_1_1_1__1__Impl rule__BinaryExpression__Group_1_1_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalAlf.g:4054:1: rule__BinaryExpression__Group_1_1_1__1__Impl : ( '[' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4058:1: ( ( '[' ) )
            // InternalAlf.g:4059:1: ( '[' )
            {
            // InternalAlf.g:4059:1: ( '[' )
            // InternalAlf.g:4060:2: '['
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAlf.g:4069:1: rule__BinaryExpression__Group_1_1_1__2 : rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 ;
    public final void rule__BinaryExpression__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4073:1: ( rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3 )
            // InternalAlf.g:4074:2: rule__BinaryExpression__Group_1_1_1__2__Impl rule__BinaryExpression__Group_1_1_1__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalAlf.g:4081:1: rule__BinaryExpression__Group_1_1_1__2__Impl : ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) ;
    public final void rule__BinaryExpression__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4085:1: ( ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) ) )
            // InternalAlf.g:4086:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            {
            // InternalAlf.g:4086:1: ( ( rule__BinaryExpression__OperandAssignment_1_1_1_2 ) )
            // InternalAlf.g:4087:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperandAssignment_1_1_1_2()); 
            // InternalAlf.g:4088:2: ( rule__BinaryExpression__OperandAssignment_1_1_1_2 )
            // InternalAlf.g:4088:3: rule__BinaryExpression__OperandAssignment_1_1_1_2
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
    // InternalAlf.g:4096:1: rule__BinaryExpression__Group_1_1_1__3 : rule__BinaryExpression__Group_1_1_1__3__Impl ;
    public final void rule__BinaryExpression__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4100:1: ( rule__BinaryExpression__Group_1_1_1__3__Impl )
            // InternalAlf.g:4101:2: rule__BinaryExpression__Group_1_1_1__3__Impl
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
    // InternalAlf.g:4107:1: rule__BinaryExpression__Group_1_1_1__3__Impl : ( ']' ) ;
    public final void rule__BinaryExpression__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4111:1: ( ( ']' ) )
            // InternalAlf.g:4112:1: ( ']' )
            {
            // InternalAlf.g:4112:1: ( ']' )
            // InternalAlf.g:4113:2: ']'
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightSquareBracketKeyword_1_1_1_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAlf.g:4123:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4127:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // InternalAlf.g:4128:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAlf.g:4135:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4139:1: ( ( () ) )
            // InternalAlf.g:4140:1: ( () )
            {
            // InternalAlf.g:4140:1: ( () )
            // InternalAlf.g:4141:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0()); 
            // InternalAlf.g:4142:2: ()
            // InternalAlf.g:4142:3: 
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
    // InternalAlf.g:4150:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4154:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // InternalAlf.g:4155:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalAlf.g:4162:1: rule__UnaryExpression__Group_1__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4166:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) ) )
            // InternalAlf.g:4167:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAlf.g:4167:1: ( ( rule__UnaryExpression__OperatorAssignment_1_1 ) )
            // InternalAlf.g:4168:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAlf.g:4169:2: ( rule__UnaryExpression__OperatorAssignment_1_1 )
            // InternalAlf.g:4169:3: rule__UnaryExpression__OperatorAssignment_1_1
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
    // InternalAlf.g:4177:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4181:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // InternalAlf.g:4182:2: rule__UnaryExpression__Group_1__2__Impl
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
    // InternalAlf.g:4188:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4192:1: ( ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) )
            // InternalAlf.g:4193:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            {
            // InternalAlf.g:4193:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            // InternalAlf.g:4194:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2()); 
            // InternalAlf.g:4195:2: ( rule__UnaryExpression__OperandAssignment_1_2 )
            // InternalAlf.g:4195:3: rule__UnaryExpression__OperandAssignment_1_2
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
    // InternalAlf.g:4204:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4208:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalAlf.g:4209:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAlf.g:4216:1: rule__PrimaryExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4220:1: ( ( '(' ) )
            // InternalAlf.g:4221:1: ( '(' )
            {
            // InternalAlf.g:4221:1: ( '(' )
            // InternalAlf.g:4222:2: '('
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
    // InternalAlf.g:4231:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4235:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalAlf.g:4236:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalAlf.g:4243:1: rule__PrimaryExpression__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4247:1: ( ( ruleExpression ) )
            // InternalAlf.g:4248:1: ( ruleExpression )
            {
            // InternalAlf.g:4248:1: ( ruleExpression )
            // InternalAlf.g:4249:2: ruleExpression
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
    // InternalAlf.g:4258:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4262:1: ( rule__PrimaryExpression__Group_4__2__Impl )
            // InternalAlf.g:4263:2: rule__PrimaryExpression__Group_4__2__Impl
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
    // InternalAlf.g:4269:1: rule__PrimaryExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4273:1: ( ( ')' ) )
            // InternalAlf.g:4274:1: ( ')' )
            {
            // InternalAlf.g:4274:1: ( ')' )
            // InternalAlf.g:4275:2: ')'
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
    // InternalAlf.g:4285:1: rule__InstanceCreationExpression__Group__0 : rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 ;
    public final void rule__InstanceCreationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4289:1: ( rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1 )
            // InternalAlf.g:4290:2: rule__InstanceCreationExpression__Group__0__Impl rule__InstanceCreationExpression__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAlf.g:4297:1: rule__InstanceCreationExpression__Group__0__Impl : ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4301:1: ( ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) ) )
            // InternalAlf.g:4302:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            {
            // InternalAlf.g:4302:1: ( ( rule__InstanceCreationExpression__ClassAssignment_0 ) )
            // InternalAlf.g:4303:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassAssignment_0()); 
            // InternalAlf.g:4304:2: ( rule__InstanceCreationExpression__ClassAssignment_0 )
            // InternalAlf.g:4304:3: rule__InstanceCreationExpression__ClassAssignment_0
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
    // InternalAlf.g:4312:1: rule__InstanceCreationExpression__Group__1 : rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 ;
    public final void rule__InstanceCreationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4316:1: ( rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2 )
            // InternalAlf.g:4317:2: rule__InstanceCreationExpression__Group__1__Impl rule__InstanceCreationExpression__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAlf.g:4324:1: rule__InstanceCreationExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__InstanceCreationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4328:1: ( ( '(' ) )
            // InternalAlf.g:4329:1: ( '(' )
            {
            // InternalAlf.g:4329:1: ( '(' )
            // InternalAlf.g:4330:2: '('
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
    // InternalAlf.g:4339:1: rule__InstanceCreationExpression__Group__2 : rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 ;
    public final void rule__InstanceCreationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4343:1: ( rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3 )
            // InternalAlf.g:4344:2: rule__InstanceCreationExpression__Group__2__Impl rule__InstanceCreationExpression__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalAlf.g:4351:1: rule__InstanceCreationExpression__Group__2__Impl : ( ( rule__InstanceCreationExpression__Group_2__0 )? ) ;
    public final void rule__InstanceCreationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4355:1: ( ( ( rule__InstanceCreationExpression__Group_2__0 )? ) )
            // InternalAlf.g:4356:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            {
            // InternalAlf.g:4356:1: ( ( rule__InstanceCreationExpression__Group_2__0 )? )
            // InternalAlf.g:4357:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2()); 
            // InternalAlf.g:4358:2: ( rule__InstanceCreationExpression__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING_VALUE)||(LA50_0>=21 && LA50_0<=23)||LA50_0==35||LA50_0==47||(LA50_0>=49 && LA50_0<=50)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:4358:3: rule__InstanceCreationExpression__Group_2__0
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
    // InternalAlf.g:4366:1: rule__InstanceCreationExpression__Group__3 : rule__InstanceCreationExpression__Group__3__Impl ;
    public final void rule__InstanceCreationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4370:1: ( rule__InstanceCreationExpression__Group__3__Impl )
            // InternalAlf.g:4371:2: rule__InstanceCreationExpression__Group__3__Impl
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
    // InternalAlf.g:4377:1: rule__InstanceCreationExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__InstanceCreationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4381:1: ( ( ')' ) )
            // InternalAlf.g:4382:1: ( ')' )
            {
            // InternalAlf.g:4382:1: ( ')' )
            // InternalAlf.g:4383:2: ')'
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
    // InternalAlf.g:4393:1: rule__InstanceCreationExpression__Group_2__0 : rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 ;
    public final void rule__InstanceCreationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4397:1: ( rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1 )
            // InternalAlf.g:4398:2: rule__InstanceCreationExpression__Group_2__0__Impl rule__InstanceCreationExpression__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAlf.g:4405:1: rule__InstanceCreationExpression__Group_2__0__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4409:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) ) )
            // InternalAlf.g:4410:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            {
            // InternalAlf.g:4410:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 ) )
            // InternalAlf.g:4411:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_0()); 
            // InternalAlf.g:4412:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_0 )
            // InternalAlf.g:4412:3: rule__InstanceCreationExpression__ArgumentAssignment_2_0
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
    // InternalAlf.g:4420:1: rule__InstanceCreationExpression__Group_2__1 : rule__InstanceCreationExpression__Group_2__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4424:1: ( rule__InstanceCreationExpression__Group_2__1__Impl )
            // InternalAlf.g:4425:2: rule__InstanceCreationExpression__Group_2__1__Impl
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
    // InternalAlf.g:4431:1: rule__InstanceCreationExpression__Group_2__1__Impl : ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) ;
    public final void rule__InstanceCreationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4435:1: ( ( ( rule__InstanceCreationExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:4436:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:4436:1: ( ( rule__InstanceCreationExpression__Group_2_1__0 )* )
            // InternalAlf.g:4437:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:4438:2: ( rule__InstanceCreationExpression__Group_2_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==38) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalAlf.g:4438:3: rule__InstanceCreationExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__InstanceCreationExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalAlf.g:4447:1: rule__InstanceCreationExpression__Group_2_1__0 : rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 ;
    public final void rule__InstanceCreationExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4451:1: ( rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1 )
            // InternalAlf.g:4452:2: rule__InstanceCreationExpression__Group_2_1__0__Impl rule__InstanceCreationExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAlf.g:4459:1: rule__InstanceCreationExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4463:1: ( ( ',' ) )
            // InternalAlf.g:4464:1: ( ',' )
            {
            // InternalAlf.g:4464:1: ( ',' )
            // InternalAlf.g:4465:2: ','
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
    // InternalAlf.g:4474:1: rule__InstanceCreationExpression__Group_2_1__1 : rule__InstanceCreationExpression__Group_2_1__1__Impl ;
    public final void rule__InstanceCreationExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4478:1: ( rule__InstanceCreationExpression__Group_2_1__1__Impl )
            // InternalAlf.g:4479:2: rule__InstanceCreationExpression__Group_2_1__1__Impl
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
    // InternalAlf.g:4485:1: rule__InstanceCreationExpression__Group_2_1__1__Impl : ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) ;
    public final void rule__InstanceCreationExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4489:1: ( ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) ) )
            // InternalAlf.g:4490:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            {
            // InternalAlf.g:4490:1: ( ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 ) )
            // InternalAlf.g:4491:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getArgumentAssignment_2_1_1()); 
            // InternalAlf.g:4492:2: ( rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 )
            // InternalAlf.g:4492:3: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1
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
    // InternalAlf.g:4501:1: rule__SequenceConstructionExpression__Group__0 : rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 ;
    public final void rule__SequenceConstructionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4505:1: ( rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1 )
            // InternalAlf.g:4506:2: rule__SequenceConstructionExpression__Group__0__Impl rule__SequenceConstructionExpression__Group__1
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
    // InternalAlf.g:4513:1: rule__SequenceConstructionExpression__Group__0__Impl : ( () ) ;
    public final void rule__SequenceConstructionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4517:1: ( ( () ) )
            // InternalAlf.g:4518:1: ( () )
            {
            // InternalAlf.g:4518:1: ( () )
            // InternalAlf.g:4519:2: ()
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0()); 
            // InternalAlf.g:4520:2: ()
            // InternalAlf.g:4520:3: 
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
    // InternalAlf.g:4528:1: rule__SequenceConstructionExpression__Group__1 : rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 ;
    public final void rule__SequenceConstructionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4532:1: ( rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2 )
            // InternalAlf.g:4533:2: rule__SequenceConstructionExpression__Group__1__Impl rule__SequenceConstructionExpression__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAlf.g:4540:1: rule__SequenceConstructionExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__SequenceConstructionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4544:1: ( ( '{' ) )
            // InternalAlf.g:4545:1: ( '{' )
            {
            // InternalAlf.g:4545:1: ( '{' )
            // InternalAlf.g:4546:2: '{'
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAlf.g:4555:1: rule__SequenceConstructionExpression__Group__2 : rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 ;
    public final void rule__SequenceConstructionExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4559:1: ( rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3 )
            // InternalAlf.g:4560:2: rule__SequenceConstructionExpression__Group__2__Impl rule__SequenceConstructionExpression__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalAlf.g:4567:1: rule__SequenceConstructionExpression__Group__2__Impl : ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) ;
    public final void rule__SequenceConstructionExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4571:1: ( ( ( rule__SequenceConstructionExpression__Group_2__0 )? ) )
            // InternalAlf.g:4572:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            {
            // InternalAlf.g:4572:1: ( ( rule__SequenceConstructionExpression__Group_2__0 )? )
            // InternalAlf.g:4573:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2()); 
            // InternalAlf.g:4574:2: ( rule__SequenceConstructionExpression__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING_VALUE)||(LA52_0>=21 && LA52_0<=23)||LA52_0==35||LA52_0==47||(LA52_0>=49 && LA52_0<=50)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:4574:3: rule__SequenceConstructionExpression__Group_2__0
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
    // InternalAlf.g:4582:1: rule__SequenceConstructionExpression__Group__3 : rule__SequenceConstructionExpression__Group__3__Impl ;
    public final void rule__SequenceConstructionExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4586:1: ( rule__SequenceConstructionExpression__Group__3__Impl )
            // InternalAlf.g:4587:2: rule__SequenceConstructionExpression__Group__3__Impl
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
    // InternalAlf.g:4593:1: rule__SequenceConstructionExpression__Group__3__Impl : ( '}' ) ;
    public final void rule__SequenceConstructionExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4597:1: ( ( '}' ) )
            // InternalAlf.g:4598:1: ( '}' )
            {
            // InternalAlf.g:4598:1: ( '}' )
            // InternalAlf.g:4599:2: '}'
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAlf.g:4609:1: rule__SequenceConstructionExpression__Group_2__0 : rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 ;
    public final void rule__SequenceConstructionExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4613:1: ( rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1 )
            // InternalAlf.g:4614:2: rule__SequenceConstructionExpression__Group_2__0__Impl rule__SequenceConstructionExpression__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAlf.g:4621:1: rule__SequenceConstructionExpression__Group_2__0__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4625:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) ) )
            // InternalAlf.g:4626:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            {
            // InternalAlf.g:4626:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_0 ) )
            // InternalAlf.g:4627:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_0()); 
            // InternalAlf.g:4628:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_0 )
            // InternalAlf.g:4628:3: rule__SequenceConstructionExpression__ElementAssignment_2_0
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
    // InternalAlf.g:4636:1: rule__SequenceConstructionExpression__Group_2__1 : rule__SequenceConstructionExpression__Group_2__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4640:1: ( rule__SequenceConstructionExpression__Group_2__1__Impl )
            // InternalAlf.g:4641:2: rule__SequenceConstructionExpression__Group_2__1__Impl
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
    // InternalAlf.g:4647:1: rule__SequenceConstructionExpression__Group_2__1__Impl : ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) ;
    public final void rule__SequenceConstructionExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4651:1: ( ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* ) )
            // InternalAlf.g:4652:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            {
            // InternalAlf.g:4652:1: ( ( rule__SequenceConstructionExpression__Group_2_1__0 )* )
            // InternalAlf.g:4653:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getGroup_2_1()); 
            // InternalAlf.g:4654:2: ( rule__SequenceConstructionExpression__Group_2_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==38) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAlf.g:4654:3: rule__SequenceConstructionExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SequenceConstructionExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalAlf.g:4663:1: rule__SequenceConstructionExpression__Group_2_1__0 : rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4667:1: ( rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1 )
            // InternalAlf.g:4668:2: rule__SequenceConstructionExpression__Group_2_1__0__Impl rule__SequenceConstructionExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAlf.g:4675:1: rule__SequenceConstructionExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4679:1: ( ( ',' ) )
            // InternalAlf.g:4680:1: ( ',' )
            {
            // InternalAlf.g:4680:1: ( ',' )
            // InternalAlf.g:4681:2: ','
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
    // InternalAlf.g:4690:1: rule__SequenceConstructionExpression__Group_2_1__1 : rule__SequenceConstructionExpression__Group_2_1__1__Impl ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4694:1: ( rule__SequenceConstructionExpression__Group_2_1__1__Impl )
            // InternalAlf.g:4695:2: rule__SequenceConstructionExpression__Group_2_1__1__Impl
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
    // InternalAlf.g:4701:1: rule__SequenceConstructionExpression__Group_2_1__1__Impl : ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) ;
    public final void rule__SequenceConstructionExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4705:1: ( ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) ) )
            // InternalAlf.g:4706:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            {
            // InternalAlf.g:4706:1: ( ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 ) )
            // InternalAlf.g:4707:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            {
             before(grammarAccess.getSequenceConstructionExpressionAccess().getElementAssignment_2_1_1()); 
            // InternalAlf.g:4708:2: ( rule__SequenceConstructionExpression__ElementAssignment_2_1_1 )
            // InternalAlf.g:4708:3: rule__SequenceConstructionExpression__ElementAssignment_2_1_1
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
    // InternalAlf.g:4717:1: rule__NullLiteralExpression__Group__0 : rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 ;
    public final void rule__NullLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4721:1: ( rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1 )
            // InternalAlf.g:4722:2: rule__NullLiteralExpression__Group__0__Impl rule__NullLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAlf.g:4729:1: rule__NullLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4733:1: ( ( () ) )
            // InternalAlf.g:4734:1: ( () )
            {
            // InternalAlf.g:4734:1: ( () )
            // InternalAlf.g:4735:2: ()
            {
             before(grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0()); 
            // InternalAlf.g:4736:2: ()
            // InternalAlf.g:4736:3: 
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
    // InternalAlf.g:4744:1: rule__NullLiteralExpression__Group__1 : rule__NullLiteralExpression__Group__1__Impl ;
    public final void rule__NullLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4748:1: ( rule__NullLiteralExpression__Group__1__Impl )
            // InternalAlf.g:4749:2: rule__NullLiteralExpression__Group__1__Impl
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
    // InternalAlf.g:4755:1: rule__NullLiteralExpression__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4759:1: ( ( 'null' ) )
            // InternalAlf.g:4760:1: ( 'null' )
            {
            // InternalAlf.g:4760:1: ( 'null' )
            // InternalAlf.g:4761:2: 'null'
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
    // InternalAlf.g:4771:1: rule__RealValue__Group__0 : rule__RealValue__Group__0__Impl rule__RealValue__Group__1 ;
    public final void rule__RealValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4775:1: ( rule__RealValue__Group__0__Impl rule__RealValue__Group__1 )
            // InternalAlf.g:4776:2: rule__RealValue__Group__0__Impl rule__RealValue__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAlf.g:4783:1: rule__RealValue__Group__0__Impl : ( ( rule__RealValue__Alternatives_0 ) ) ;
    public final void rule__RealValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4787:1: ( ( ( rule__RealValue__Alternatives_0 ) ) )
            // InternalAlf.g:4788:1: ( ( rule__RealValue__Alternatives_0 ) )
            {
            // InternalAlf.g:4788:1: ( ( rule__RealValue__Alternatives_0 ) )
            // InternalAlf.g:4789:2: ( rule__RealValue__Alternatives_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_0()); 
            // InternalAlf.g:4790:2: ( rule__RealValue__Alternatives_0 )
            // InternalAlf.g:4790:3: rule__RealValue__Alternatives_0
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
    // InternalAlf.g:4798:1: rule__RealValue__Group__1 : rule__RealValue__Group__1__Impl ;
    public final void rule__RealValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4802:1: ( rule__RealValue__Group__1__Impl )
            // InternalAlf.g:4803:2: rule__RealValue__Group__1__Impl
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
    // InternalAlf.g:4809:1: rule__RealValue__Group__1__Impl : ( ( rule__RealValue__Group_1__0 )? ) ;
    public final void rule__RealValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4813:1: ( ( ( rule__RealValue__Group_1__0 )? ) )
            // InternalAlf.g:4814:1: ( ( rule__RealValue__Group_1__0 )? )
            {
            // InternalAlf.g:4814:1: ( ( rule__RealValue__Group_1__0 )? )
            // InternalAlf.g:4815:2: ( rule__RealValue__Group_1__0 )?
            {
             before(grammarAccess.getRealValueAccess().getGroup_1()); 
            // InternalAlf.g:4816:2: ( rule__RealValue__Group_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=26 && LA54_0<=27)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlf.g:4816:3: rule__RealValue__Group_1__0
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
    // InternalAlf.g:4825:1: rule__RealValue__Group_0_0__0 : rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 ;
    public final void rule__RealValue__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4829:1: ( rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1 )
            // InternalAlf.g:4830:2: rule__RealValue__Group_0_0__0__Impl rule__RealValue__Group_0_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:4837:1: rule__RealValue__Group_0_0__0__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4841:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:4842:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:4842:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:4843:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:4852:1: rule__RealValue__Group_0_0__1 : rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 ;
    public final void rule__RealValue__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4856:1: ( rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2 )
            // InternalAlf.g:4857:2: rule__RealValue__Group_0_0__1__Impl rule__RealValue__Group_0_0__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAlf.g:4864:1: rule__RealValue__Group_0_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4868:1: ( ( '.' ) )
            // InternalAlf.g:4869:1: ( '.' )
            {
            // InternalAlf.g:4869:1: ( '.' )
            // InternalAlf.g:4870:2: '.'
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
    // InternalAlf.g:4879:1: rule__RealValue__Group_0_0__2 : rule__RealValue__Group_0_0__2__Impl ;
    public final void rule__RealValue__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4883:1: ( rule__RealValue__Group_0_0__2__Impl )
            // InternalAlf.g:4884:2: rule__RealValue__Group_0_0__2__Impl
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
    // InternalAlf.g:4890:1: rule__RealValue__Group_0_0__2__Impl : ( ( RULE_NATURAL_VALUE )? ) ;
    public final void rule__RealValue__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4894:1: ( ( ( RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:4895:1: ( ( RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:4895:1: ( ( RULE_NATURAL_VALUE )? )
            // InternalAlf.g:4896:2: ( RULE_NATURAL_VALUE )?
            {
             before(grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2()); 
            // InternalAlf.g:4897:2: ( RULE_NATURAL_VALUE )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_NATURAL_VALUE) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:4897:3: RULE_NATURAL_VALUE
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
    // InternalAlf.g:4906:1: rule__RealValue__Group_0_1__0 : rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 ;
    public final void rule__RealValue__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4910:1: ( rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1 )
            // InternalAlf.g:4911:2: rule__RealValue__Group_0_1__0__Impl rule__RealValue__Group_0_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAlf.g:4918:1: rule__RealValue__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4922:1: ( ( '.' ) )
            // InternalAlf.g:4923:1: ( '.' )
            {
            // InternalAlf.g:4923:1: ( '.' )
            // InternalAlf.g:4924:2: '.'
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
    // InternalAlf.g:4933:1: rule__RealValue__Group_0_1__1 : rule__RealValue__Group_0_1__1__Impl ;
    public final void rule__RealValue__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4937:1: ( rule__RealValue__Group_0_1__1__Impl )
            // InternalAlf.g:4938:2: rule__RealValue__Group_0_1__1__Impl
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
    // InternalAlf.g:4944:1: rule__RealValue__Group_0_1__1__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4948:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:4949:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:4949:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:4950:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:4960:1: rule__RealValue__Group_1__0 : rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 ;
    public final void rule__RealValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4964:1: ( rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 )
            // InternalAlf.g:4965:2: rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAlf.g:4972:1: rule__RealValue__Group_1__0__Impl : ( ( rule__RealValue__Alternatives_1_0 ) ) ;
    public final void rule__RealValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4976:1: ( ( ( rule__RealValue__Alternatives_1_0 ) ) )
            // InternalAlf.g:4977:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            {
            // InternalAlf.g:4977:1: ( ( rule__RealValue__Alternatives_1_0 ) )
            // InternalAlf.g:4978:2: ( rule__RealValue__Alternatives_1_0 )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_0()); 
            // InternalAlf.g:4979:2: ( rule__RealValue__Alternatives_1_0 )
            // InternalAlf.g:4979:3: rule__RealValue__Alternatives_1_0
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
    // InternalAlf.g:4987:1: rule__RealValue__Group_1__1 : rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 ;
    public final void rule__RealValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:4991:1: ( rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2 )
            // InternalAlf.g:4992:2: rule__RealValue__Group_1__1__Impl rule__RealValue__Group_1__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalAlf.g:4999:1: rule__RealValue__Group_1__1__Impl : ( ( rule__RealValue__Alternatives_1_1 )? ) ;
    public final void rule__RealValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5003:1: ( ( ( rule__RealValue__Alternatives_1_1 )? ) )
            // InternalAlf.g:5004:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            {
            // InternalAlf.g:5004:1: ( ( rule__RealValue__Alternatives_1_1 )? )
            // InternalAlf.g:5005:2: ( rule__RealValue__Alternatives_1_1 )?
            {
             before(grammarAccess.getRealValueAccess().getAlternatives_1_1()); 
            // InternalAlf.g:5006:2: ( rule__RealValue__Alternatives_1_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=21 && LA56_0<=22)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:5006:3: rule__RealValue__Alternatives_1_1
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
    // InternalAlf.g:5014:1: rule__RealValue__Group_1__2 : rule__RealValue__Group_1__2__Impl ;
    public final void rule__RealValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5018:1: ( rule__RealValue__Group_1__2__Impl )
            // InternalAlf.g:5019:2: rule__RealValue__Group_1__2__Impl
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
    // InternalAlf.g:5025:1: rule__RealValue__Group_1__2__Impl : ( RULE_NATURAL_VALUE ) ;
    public final void rule__RealValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5029:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:5030:1: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:5030:1: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:5031:2: RULE_NATURAL_VALUE
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
    // InternalAlf.g:5041:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0 : rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5045:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1 )
            // InternalAlf.g:5046:2: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl rule__UnlimitedNaturalLiteralExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAlf.g:5053:1: rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5057:1: ( ( () ) )
            // InternalAlf.g:5058:1: ( () )
            {
            // InternalAlf.g:5058:1: ( () )
            // InternalAlf.g:5059:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0()); 
            // InternalAlf.g:5060:2: ()
            // InternalAlf.g:5060:3: 
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
    // InternalAlf.g:5068:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1 : rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5072:1: ( rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl )
            // InternalAlf.g:5073:2: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl
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
    // InternalAlf.g:5079:1: rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl : ( '*' ) ;
    public final void rule__UnlimitedNaturalLiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5083:1: ( ( '*' ) )
            // InternalAlf.g:5084:1: ( '*' )
            {
            // InternalAlf.g:5084:1: ( '*' )
            // InternalAlf.g:5085:2: '*'
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAlf.g:5095:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5099:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAlf.g:5100:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAlf.g:5107:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5111:1: ( ( ruleName ) )
            // InternalAlf.g:5112:1: ( ruleName )
            {
            // InternalAlf.g:5112:1: ( ruleName )
            // InternalAlf.g:5113:2: ruleName
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
    // InternalAlf.g:5122:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5126:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAlf.g:5127:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAlf.g:5133:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5137:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAlf.g:5138:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAlf.g:5138:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAlf.g:5139:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAlf.g:5140:2: ( rule__QualifiedName__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==50) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAlf.g:5140:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalAlf.g:5149:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5153:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAlf.g:5154:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAlf.g:5161:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5165:1: ( ( '.' ) )
            // InternalAlf.g:5166:1: ( '.' )
            {
            // InternalAlf.g:5166:1: ( '.' )
            // InternalAlf.g:5167:2: '.'
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
    // InternalAlf.g:5176:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5180:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAlf.g:5181:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAlf.g:5187:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5191:1: ( ( ruleName ) )
            // InternalAlf.g:5192:1: ( ruleName )
            {
            // InternalAlf.g:5192:1: ( ruleName )
            // InternalAlf.g:5193:2: ruleName
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
    // InternalAlf.g:5203:1: rule__PackageDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5207:1: ( ( ruleName ) )
            // InternalAlf.g:5208:2: ( ruleName )
            {
            // InternalAlf.g:5208:2: ( ruleName )
            // InternalAlf.g:5209:3: ruleName
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


    // $ANTLR start "rule__PackageDefinition__MembershipAssignment_3"
    // InternalAlf.g:5218:1: rule__PackageDefinition__MembershipAssignment_3 : ( ruleMemberDefinition ) ;
    public final void rule__PackageDefinition__MembershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5222:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:5223:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:5223:2: ( ruleMemberDefinition )
            // InternalAlf.g:5224:3: ruleMemberDefinition
            {
             before(grammarAccess.getPackageDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberDefinition();

            state._fsp--;

             after(grammarAccess.getPackageDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__MembershipAssignment_3"


    // $ANTLR start "rule__MemberDefinition__VisibilityAssignment_0"
    // InternalAlf.g:5233:1: rule__MemberDefinition__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__MemberDefinition__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5237:1: ( ( ruleVisibilityIndicator ) )
            // InternalAlf.g:5238:2: ( ruleVisibilityIndicator )
            {
            // InternalAlf.g:5238:2: ( ruleVisibilityIndicator )
            // InternalAlf.g:5239:3: ruleVisibilityIndicator
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
    // InternalAlf.g:5248:1: rule__MemberDefinition__OwnedMemberElementAssignment_1_0 : ( rulePackagedElementDefinition ) ;
    public final void rule__MemberDefinition__OwnedMemberElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5252:1: ( ( rulePackagedElementDefinition ) )
            // InternalAlf.g:5253:2: ( rulePackagedElementDefinition )
            {
            // InternalAlf.g:5253:2: ( rulePackagedElementDefinition )
            // InternalAlf.g:5254:3: rulePackagedElementDefinition
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
    // InternalAlf.g:5263:1: rule__MemberDefinition__MemberNameAssignment_1_1_1 : ( ruleName ) ;
    public final void rule__MemberDefinition__MemberNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5267:1: ( ( ruleName ) )
            // InternalAlf.g:5268:2: ( ruleName )
            {
            // InternalAlf.g:5268:2: ( ruleName )
            // InternalAlf.g:5269:3: ruleName
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
    // InternalAlf.g:5278:1: rule__MemberDefinition__MemberElementAssignment_1_1_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MemberDefinition__MemberElementAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5282:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5283:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5283:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5284:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberDefinitionAccess().getMemberElementElementCrossReference_1_1_3_0()); 
            // InternalAlf.g:5285:3: ( ruleQualifiedName )
            // InternalAlf.g:5286:4: ruleQualifiedName
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
    // InternalAlf.g:5297:1: rule__ClassDeclaration__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5301:1: ( ( ( 'abstract' ) ) )
            // InternalAlf.g:5302:2: ( ( 'abstract' ) )
            {
            // InternalAlf.g:5302:2: ( ( 'abstract' ) )
            // InternalAlf.g:5303:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalAlf.g:5304:3: ( 'abstract' )
            // InternalAlf.g:5305:4: 'abstract'
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
    // InternalAlf.g:5316:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleName ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5320:1: ( ( ruleName ) )
            // InternalAlf.g:5321:2: ( ruleName )
            {
            // InternalAlf.g:5321:2: ( ruleName )
            // InternalAlf.g:5322:3: ruleName
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


    // $ANTLR start "rule__ClassDeclaration__MembershipAssignment_3_1"
    // InternalAlf.g:5331:1: rule__ClassDeclaration__MembershipAssignment_3_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__MembershipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5335:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:5336:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:5336:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:5337:3: ruleOwnedGeneralization
            {
             before(grammarAccess.getClassDeclarationAccess().getMembershipOwnedGeneralizationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getMembershipOwnedGeneralizationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__MembershipAssignment_3_1"


    // $ANTLR start "rule__ClassDeclaration__MembershipAssignment_3_2_1"
    // InternalAlf.g:5346:1: rule__ClassDeclaration__MembershipAssignment_3_2_1 : ( ruleOwnedGeneralization ) ;
    public final void rule__ClassDeclaration__MembershipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5350:1: ( ( ruleOwnedGeneralization ) )
            // InternalAlf.g:5351:2: ( ruleOwnedGeneralization )
            {
            // InternalAlf.g:5351:2: ( ruleOwnedGeneralization )
            // InternalAlf.g:5352:3: ruleOwnedGeneralization
            {
             before(grammarAccess.getClassDeclarationAccess().getMembershipOwnedGeneralizationParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedGeneralization();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getMembershipOwnedGeneralizationParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__MembershipAssignment_3_2_1"


    // $ANTLR start "rule__OwnedGeneralization__OwnedMemberElementAssignment"
    // InternalAlf.g:5361:1: rule__OwnedGeneralization__OwnedMemberElementAssignment : ( ruleGeneralization ) ;
    public final void rule__OwnedGeneralization__OwnedMemberElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5365:1: ( ( ruleGeneralization ) )
            // InternalAlf.g:5366:2: ( ruleGeneralization )
            {
            // InternalAlf.g:5366:2: ( ruleGeneralization )
            // InternalAlf.g:5367:3: ruleGeneralization
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
    // InternalAlf.g:5376:1: rule__Generalization__GeneralAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__GeneralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5380:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5381:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5381:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5382:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0()); 
            // InternalAlf.g:5383:3: ( ruleQualifiedName )
            // InternalAlf.g:5384:4: ruleQualifiedName
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


    // $ANTLR start "rule__ClassDefinition__MembershipAssignment_2"
    // InternalAlf.g:5395:1: rule__ClassDefinition__MembershipAssignment_2 : ( ruleMemberDefinition ) ;
    public final void rule__ClassDefinition__MembershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5399:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:5400:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:5400:2: ( ruleMemberDefinition )
            // InternalAlf.g:5401:3: ruleMemberDefinition
            {
             before(grammarAccess.getClassDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberDefinition();

            state._fsp--;

             after(grammarAccess.getClassDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDefinition__MembershipAssignment_2"


    // $ANTLR start "rule__BasicFeatureDefinition__IsPortAssignment_0_1"
    // InternalAlf.g:5410:1: rule__BasicFeatureDefinition__IsPortAssignment_0_1 : ( ( 'port' ) ) ;
    public final void rule__BasicFeatureDefinition__IsPortAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5414:1: ( ( ( 'port' ) ) )
            // InternalAlf.g:5415:2: ( ( 'port' ) )
            {
            // InternalAlf.g:5415:2: ( ( 'port' ) )
            // InternalAlf.g:5416:3: ( 'port' )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getIsPortPortKeyword_0_1_0()); 
            // InternalAlf.g:5417:3: ( 'port' )
            // InternalAlf.g:5418:4: 'port'
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getIsPortPortKeyword_0_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBasicFeatureDefinitionAccess().getIsPortPortKeyword_0_1_0()); 

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getIsPortPortKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__IsPortAssignment_0_1"


    // $ANTLR start "rule__BasicFeatureDefinition__DirectionAssignment_1"
    // InternalAlf.g:5429:1: rule__BasicFeatureDefinition__DirectionAssignment_1 : ( ruleFeatureDirection ) ;
    public final void rule__BasicFeatureDefinition__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5433:1: ( ( ruleFeatureDirection ) )
            // InternalAlf.g:5434:2: ( ruleFeatureDirection )
            {
            // InternalAlf.g:5434:2: ( ruleFeatureDirection )
            // InternalAlf.g:5435:3: ruleFeatureDirection
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getDirectionFeatureDirectionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureDirection();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getDirectionFeatureDirectionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__DirectionAssignment_1"


    // $ANTLR start "rule__BasicFeatureDefinition__NameAssignment_2_0_0"
    // InternalAlf.g:5444:1: rule__BasicFeatureDefinition__NameAssignment_2_0_0 : ( ruleName ) ;
    public final void rule__BasicFeatureDefinition__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5448:1: ( ( ruleName ) )
            // InternalAlf.g:5449:2: ( ruleName )
            {
            // InternalAlf.g:5449:2: ( ruleName )
            // InternalAlf.g:5450:3: ruleName
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getNameNameParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getNameNameParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__NameAssignment_2_0_0"


    // $ANTLR start "rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1"
    // InternalAlf.g:5459:1: rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5463:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5464:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5464:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5465:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getReferencedTypeClassCrossReference_2_0_1_1_0()); 
            // InternalAlf.g:5466:3: ( ruleQualifiedName )
            // InternalAlf.g:5467:4: ruleQualifiedName
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_2_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getReferencedTypeClassQualifiedNameParserRuleCall_2_0_1_1_0_1()); 

            }

             after(grammarAccess.getBasicFeatureDefinitionAccess().getReferencedTypeClassCrossReference_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__ReferencedTypeAssignment_2_0_1_1"


    // $ANTLR start "rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2"
    // InternalAlf.g:5478:1: rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5482:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:5483:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:5483:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:5484:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipOwnedRedefinitionOrSubsetParserRuleCall_2_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipOwnedRedefinitionOrSubsetParserRuleCall_2_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__MembershipAssignment_2_0_1_2"


    // $ANTLR start "rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0"
    // InternalAlf.g:5493:1: rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5497:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:5498:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:5498:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:5499:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_0_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_0_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__LowerAssignment_2_0_2_1_0"


    // $ANTLR start "rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2"
    // InternalAlf.g:5508:1: rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5512:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:5513:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:5513:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:5514:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__UpperAssignment_2_0_2_2"


    // $ANTLR start "rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1"
    // InternalAlf.g:5523:1: rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1 : ( ruleExpression ) ;
    public final void rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5527:1: ( ( ruleExpression ) )
            // InternalAlf.g:5528:2: ( ruleExpression )
            {
            // InternalAlf.g:5528:2: ( ruleExpression )
            // InternalAlf.g:5529:3: ruleExpression
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_0_3_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_0_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__ValueAssignment_2_0_3_0_0_1"


    // $ANTLR start "rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1"
    // InternalAlf.g:5538:1: rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1 : ( ruleMemberDefinition ) ;
    public final void rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5542:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:5543:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:5543:2: ( ruleMemberDefinition )
            // InternalAlf.g:5544:3: ruleMemberDefinition
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_0_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberDefinition();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__MembershipAssignment_2_0_3_1_1"


    // $ANTLR start "rule__BasicFeatureDefinition__NameAssignment_2_1_0"
    // InternalAlf.g:5553:1: rule__BasicFeatureDefinition__NameAssignment_2_1_0 : ( ruleName ) ;
    public final void rule__BasicFeatureDefinition__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5557:1: ( ( ruleName ) )
            // InternalAlf.g:5558:2: ( ruleName )
            {
            // InternalAlf.g:5558:2: ( ruleName )
            // InternalAlf.g:5559:3: ruleName
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getNameNameParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getNameNameParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__NameAssignment_2_1_0"


    // $ANTLR start "rule__BasicFeatureDefinition__MembershipAssignment_2_1_1"
    // InternalAlf.g:5568:1: rule__BasicFeatureDefinition__MembershipAssignment_2_1_1 : ( ruleOwnedRedefinitionOrSubset ) ;
    public final void rule__BasicFeatureDefinition__MembershipAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5572:1: ( ( ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:5573:2: ( ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:5573:2: ( ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:5574:3: ruleOwnedRedefinitionOrSubset
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipOwnedRedefinitionOrSubsetParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipOwnedRedefinitionOrSubsetParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__MembershipAssignment_2_1_1"


    // $ANTLR start "rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0"
    // InternalAlf.g:5583:1: rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5587:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:5588:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:5588:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:5589:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_2_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_2_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__LowerAssignment_2_1_2_0_0_1_0"


    // $ANTLR start "rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2"
    // InternalAlf.g:5598:1: rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5602:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:5603:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:5603:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:5604:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__UpperAssignment_2_1_2_0_0_2"


    // $ANTLR start "rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1"
    // InternalAlf.g:5613:1: rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1 : ( ruleExpression ) ;
    public final void rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5617:1: ( ( ruleExpression ) )
            // InternalAlf.g:5618:2: ( ruleExpression )
            {
            // InternalAlf.g:5618:2: ( ruleExpression )
            // InternalAlf.g:5619:3: ruleExpression
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_1_2_0_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getValueExpressionParserRuleCall_2_1_2_0_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__ValueAssignment_2_1_2_0_1_0_1"


    // $ANTLR start "rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1"
    // InternalAlf.g:5628:1: rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1 : ( ruleMemberDefinition ) ;
    public final void rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5632:1: ( ( ruleMemberDefinition ) )
            // InternalAlf.g:5633:2: ( ruleMemberDefinition )
            {
            // InternalAlf.g:5633:2: ( ruleMemberDefinition )
            // InternalAlf.g:5634:3: ruleMemberDefinition
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_1_2_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberDefinition();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getMembershipMemberDefinitionParserRuleCall_2_1_2_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__MembershipAssignment_2_1_2_0_1_1_1"


    // $ANTLR start "rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0"
    // InternalAlf.g:5643:1: rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0 : ( ruleNaturalLiteralExpression ) ;
    public final void rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5647:1: ( ( ruleNaturalLiteralExpression ) )
            // InternalAlf.g:5648:2: ( ruleNaturalLiteralExpression )
            {
            // InternalAlf.g:5648:2: ( ruleNaturalLiteralExpression )
            // InternalAlf.g:5649:3: ruleNaturalLiteralExpression
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_2_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_2_1_2_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__LowerAssignment_2_1_2_1_1_0"


    // $ANTLR start "rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2"
    // InternalAlf.g:5658:1: rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2 : ( ruleUnlimitedNaturalLiteralExpression ) ;
    public final void rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5662:1: ( ( ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:5663:2: ( ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:5663:2: ( ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:5664:3: ruleUnlimitedNaturalLiteralExpression
            {
             before(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             after(grammarAccess.getBasicFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_1_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFeatureDefinition__UpperAssignment_2_1_2_1_2"


    // $ANTLR start "rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1"
    // InternalAlf.g:5673:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1 : ( ruleRedefinition ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5677:1: ( ( ruleRedefinition ) )
            // InternalAlf.g:5678:2: ( ruleRedefinition )
            {
            // InternalAlf.g:5678:2: ( ruleRedefinition )
            // InternalAlf.g:5679:3: ruleRedefinition
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
    // InternalAlf.g:5688:1: rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1 : ( ruleSubset ) ;
    public final void rule__OwnedRedefinitionOrSubset__OwnedMemberElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5692:1: ( ( ruleSubset ) )
            // InternalAlf.g:5693:2: ( ruleSubset )
            {
            // InternalAlf.g:5693:2: ( ruleSubset )
            // InternalAlf.g:5694:3: ruleSubset
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
    // InternalAlf.g:5703:1: rule__Redefinition__RedefinedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Redefinition__RedefinedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5707:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5708:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5708:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5709:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:5710:3: ( ruleQualifiedName )
            // InternalAlf.g:5711:4: ruleQualifiedName
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
    // InternalAlf.g:5722:1: rule__Subset__SubsettedFeatureAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Subset__SubsettedFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5726:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5727:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5727:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5728:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0()); 
            // InternalAlf.g:5729:3: ( ruleQualifiedName )
            // InternalAlf.g:5730:4: ruleQualifiedName
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


    // $ANTLR start "rule__ConnectorDefinition__NameAssignment_1"
    // InternalAlf.g:5741:1: rule__ConnectorDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__ConnectorDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5745:1: ( ( ruleName ) )
            // InternalAlf.g:5746:2: ( ruleName )
            {
            // InternalAlf.g:5746:2: ( ruleName )
            // InternalAlf.g:5747:3: ruleName
            {
             before(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__NameAssignment_1"


    // $ANTLR start "rule__ConnectorDefinition__SourcePathAssignment_2"
    // InternalAlf.g:5756:1: rule__ConnectorDefinition__SourcePathAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__SourcePathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5760:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5761:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5761:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5762:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourcePathFeatureCrossReference_2_0()); 
            // InternalAlf.g:5763:3: ( ruleQualifiedName )
            // InternalAlf.g:5764:4: ruleQualifiedName
            {
             before(grammarAccess.getConnectorDefinitionAccess().getSourcePathFeatureQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionAccess().getSourcePathFeatureQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConnectorDefinitionAccess().getSourcePathFeatureCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__SourcePathAssignment_2"


    // $ANTLR start "rule__ConnectorDefinition__TargetPathAssignment_4"
    // InternalAlf.g:5775:1: rule__ConnectorDefinition__TargetPathAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConnectorDefinition__TargetPathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5779:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5780:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5780:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5781:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetPathFeatureCrossReference_4_0()); 
            // InternalAlf.g:5782:3: ( ruleQualifiedName )
            // InternalAlf.g:5783:4: ruleQualifiedName
            {
             before(grammarAccess.getConnectorDefinitionAccess().getTargetPathFeatureQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectorDefinitionAccess().getTargetPathFeatureQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConnectorDefinitionAccess().getTargetPathFeatureCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorDefinition__TargetPathAssignment_4"


    // $ANTLR start "rule__BinaryExpression__OperatorAssignment_1_1_0_0"
    // InternalAlf.g:5794:1: rule__BinaryExpression__OperatorAssignment_1_1_0_0 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5798:1: ( ( ruleBinaryOperator ) )
            // InternalAlf.g:5799:2: ( ruleBinaryOperator )
            {
            // InternalAlf.g:5799:2: ( ruleBinaryOperator )
            // InternalAlf.g:5800:3: ruleBinaryOperator
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
    // InternalAlf.g:5809:1: rule__BinaryExpression__OperandAssignment_1_1_0_1 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5813:1: ( ( ruleExpression ) )
            // InternalAlf.g:5814:2: ( ruleExpression )
            {
            // InternalAlf.g:5814:2: ( ruleExpression )
            // InternalAlf.g:5815:3: ruleExpression
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
    // InternalAlf.g:5824:1: rule__BinaryExpression__OperatorAssignment_1_1_1_0 : ( ( '@' ) ) ;
    public final void rule__BinaryExpression__OperatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5828:1: ( ( ( '@' ) ) )
            // InternalAlf.g:5829:2: ( ( '@' ) )
            {
            // InternalAlf.g:5829:2: ( ( '@' ) )
            // InternalAlf.g:5830:3: ( '@' )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0()); 
            // InternalAlf.g:5831:3: ( '@' )
            // InternalAlf.g:5832:4: '@'
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
    // InternalAlf.g:5843:1: rule__BinaryExpression__OperandAssignment_1_1_1_2 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__OperandAssignment_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5847:1: ( ( ruleExpression ) )
            // InternalAlf.g:5848:2: ( ruleExpression )
            {
            // InternalAlf.g:5848:2: ( ruleExpression )
            // InternalAlf.g:5849:3: ruleExpression
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
    // InternalAlf.g:5858:1: rule__UnaryExpression__OperatorAssignment_1_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5862:1: ( ( ruleUnaryOperator ) )
            // InternalAlf.g:5863:2: ( ruleUnaryOperator )
            {
            // InternalAlf.g:5863:2: ( ruleUnaryOperator )
            // InternalAlf.g:5864:3: ruleUnaryOperator
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
    // InternalAlf.g:5873:1: rule__UnaryExpression__OperandAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5877:1: ( ( rulePrimaryExpression ) )
            // InternalAlf.g:5878:2: ( rulePrimaryExpression )
            {
            // InternalAlf.g:5878:2: ( rulePrimaryExpression )
            // InternalAlf.g:5879:3: rulePrimaryExpression
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
    // InternalAlf.g:5888:1: rule__ElementReferenceExpression__ReferentAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementReferenceExpression__ReferentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5892:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5893:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5893:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5894:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0()); 
            // InternalAlf.g:5895:3: ( ruleQualifiedName )
            // InternalAlf.g:5896:4: ruleQualifiedName
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
    // InternalAlf.g:5907:1: rule__InstanceCreationExpression__ClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InstanceCreationExpression__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5911:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5912:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5912:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5913:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0()); 
            // InternalAlf.g:5914:3: ( ruleQualifiedName )
            // InternalAlf.g:5915:4: ruleQualifiedName
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
    // InternalAlf.g:5926:1: rule__InstanceCreationExpression__ArgumentAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5930:1: ( ( ruleExpression ) )
            // InternalAlf.g:5931:2: ( ruleExpression )
            {
            // InternalAlf.g:5931:2: ( ruleExpression )
            // InternalAlf.g:5932:3: ruleExpression
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
    // InternalAlf.g:5941:1: rule__InstanceCreationExpression__ArgumentAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__InstanceCreationExpression__ArgumentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5945:1: ( ( ruleExpression ) )
            // InternalAlf.g:5946:2: ( ruleExpression )
            {
            // InternalAlf.g:5946:2: ( ruleExpression )
            // InternalAlf.g:5947:3: ruleExpression
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
    // InternalAlf.g:5956:1: rule__SequenceConstructionExpression__ElementAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5960:1: ( ( ruleExpression ) )
            // InternalAlf.g:5961:2: ( ruleExpression )
            {
            // InternalAlf.g:5961:2: ( ruleExpression )
            // InternalAlf.g:5962:3: ruleExpression
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
    // InternalAlf.g:5971:1: rule__SequenceConstructionExpression__ElementAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__SequenceConstructionExpression__ElementAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5975:1: ( ( ruleExpression ) )
            // InternalAlf.g:5976:2: ( ruleExpression )
            {
            // InternalAlf.g:5976:2: ( ruleExpression )
            // InternalAlf.g:5977:3: ruleExpression
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
    // InternalAlf.g:5986:1: rule__BooleanLiteralExpression__ValueAssignment : ( RULE_BOOLEAN_VALUE ) ;
    public final void rule__BooleanLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:5990:1: ( ( RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:5991:2: ( RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:5991:2: ( RULE_BOOLEAN_VALUE )
            // InternalAlf.g:5992:3: RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:6001:1: rule__StringLiteralExpression__ValueAssignment : ( RULE_STRING_VALUE ) ;
    public final void rule__StringLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6005:1: ( ( RULE_STRING_VALUE ) )
            // InternalAlf.g:6006:2: ( RULE_STRING_VALUE )
            {
            // InternalAlf.g:6006:2: ( RULE_STRING_VALUE )
            // InternalAlf.g:6007:3: RULE_STRING_VALUE
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
    // InternalAlf.g:6016:1: rule__RealLiteralExpression__ValueAssignment : ( ruleRealValue ) ;
    public final void rule__RealLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6020:1: ( ( ruleRealValue ) )
            // InternalAlf.g:6021:2: ( ruleRealValue )
            {
            // InternalAlf.g:6021:2: ( ruleRealValue )
            // InternalAlf.g:6022:3: ruleRealValue
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
    // InternalAlf.g:6031:1: rule__NaturalLiteralExpression__ValueAssignment : ( RULE_NATURAL_VALUE ) ;
    public final void rule__NaturalLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlf.g:6035:1: ( ( RULE_NATURAL_VALUE ) )
            // InternalAlf.g:6036:2: ( RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:6036:2: ( RULE_NATURAL_VALUE )
            // InternalAlf.g:6037:3: RULE_NATURAL_VALUE
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
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\2\4\1\uffff\2\4\2\22\1\4\2\22\1\uffff\2\22\2\43\2\4\4\43\1\4\2\43";
    static final String dfa_3s = "\1\64\1\22\1\uffff\1\22\3\54\1\5\2\43\1\uffff\2\43\2\62\2\5\4\62\1\5\2\62";
    static final String dfa_4s = "\2\uffff\1\1\7\uffff\1\2\15\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\6\11\uffff\1\1\1\3\1\4\1\7\1\uffff\1\2\13\uffff\3\2\11\uffff\2\2\5\uffff\2\2",
            "\1\10\1\11\14\uffff\1\12",
            "",
            "\1\13\1\14\14\uffff\1\12",
            "\1\5\1\6\14\uffff\1\7\1\uffff\1\2\13\uffff\3\2\11\uffff\1\2",
            "\1\7\1\uffff\1\2\16\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff\2\2",
            "\1\7\1\uffff\1\2\16\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff\2\2",
            "\1\15\1\16",
            "\1\12\20\uffff\1\2",
            "\1\12\20\uffff\1\2",
            "",
            "\1\17\1\2\17\uffff\1\2",
            "\1\17\1\2\17\uffff\1\2",
            "\1\2\1\uffff\1\12\2\uffff\1\2\2\uffff\1\2\6\uffff\1\20",
            "\1\2\1\uffff\1\12\2\uffff\1\2\2\uffff\1\2\6\uffff\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\2\1\uffff\1\12\1\2\13\uffff\1\25",
            "\1\2\1\uffff\1\12\1\2\13\uffff\1\25",
            "\1\2\1\uffff\1\12\2\uffff\1\2\2\uffff\1\2\6\uffff\1\20",
            "\1\2\1\uffff\1\12\2\uffff\1\2\2\uffff\1\2\6\uffff\1\20",
            "\1\26\1\27",
            "\1\2\1\uffff\1\12\1\2\13\uffff\1\25",
            "\1\2\1\uffff\1\12\1\2\13\uffff\1\25"
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
            return "1030:1: rule__MemberDefinition__Alternatives_1 : ( ( ( rule__MemberDefinition__OwnedMemberElementAssignment_1_0 ) ) | ( ( rule__MemberDefinition__Group_1_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\2\uffff\2\7\5\uffff\2\7";
    static final String dfa_9s = "\1\4\1\uffff\2\25\2\uffff\1\4\2\uffff\2\25";
    static final String dfa_10s = "\1\62\1\uffff\2\65\2\uffff\1\5\2\uffff\2\65";
    static final String dfa_11s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\2\1\3\2\uffff";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\3\3\1\16\uffff\1\1\13\uffff\1\4\13\uffff\1\5\1\uffff\2\1",
            "",
            "\5\7\12\uffff\3\7\2\uffff\1\7\5\uffff\1\10\1\7\1\uffff\1\6\2\uffff\1\7",
            "\5\7\12\uffff\3\7\2\uffff\1\7\5\uffff\1\10\1\7\1\uffff\1\6\2\uffff\1\7",
            "",
            "",
            "\1\11\1\12",
            "",
            "",
            "\5\7\12\uffff\3\7\2\uffff\1\7\5\uffff\1\10\1\7\1\uffff\1\6\2\uffff\1\7",
            "\5\7\12\uffff\3\7\2\uffff\1\7\5\uffff\1\10\1\7\1\uffff\1\6\2\uffff\1\7"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1396:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleElementReferenceExpression ) | ( ruleInstanceCreationExpression ) | ( ruleSequenceConstructionExpression ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00183017F0178030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00183007F0178032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00183007F0178030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010100700160030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000009A800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0006800800E001F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000090800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020000003E00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00068008008001F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0007800800E001F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0006801800E001F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000600040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000002L});

}